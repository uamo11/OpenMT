package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.C20195;
import l.ConcurrentMapC10942;

/* loaded from: classes.dex */
public class TransferStatusUpdater {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static TransferDBUtil f356;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static TransferStatusUpdater f360;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Handler f361;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f362;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Log f359 = LogFactory.m302(TransferStatusUpdater.class);

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final HashSet f358 = new HashSet(Arrays.asList(TransferState.PART_COMPLETED, TransferState.PENDING_CANCEL, TransferState.PENDING_PAUSE, TransferState.PENDING_NETWORK_DISCONNECT));

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Map f357 = new ConcurrentMapC10942() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.1
    };

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized TransferRecord m392(int i) {
        return (TransferRecord) this.f362.get(Integer.valueOf(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized Map m393() {
        return C20195.unmodifiableMap(this.f362);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m394(int i, long j, long j2, boolean z) {
        TransferRecord transferRecord = (TransferRecord) this.f362.get(Integer.valueOf(i));
        if (transferRecord != null) {
            transferRecord.f319 = j;
            transferRecord.f325 = j2;
        }
        f356.getClass();
        TransferDBUtil.m365(i, j);
        if (z) {
            Map map = f357;
            synchronized (map) {
                List list = (List) ((ConcurrentMapC10942) map).get(Integer.valueOf(i));
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.f361.post(new Runnable(i, j, j2) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                TransferListener.this.m373();
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m397(TransferRecord transferRecord) {
        this.f362.put(Integer.valueOf(transferRecord.f328), transferRecord);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m399(int i) {
        f356.getClass();
        TransferRecord m372 = TransferDBUtil.m372(i);
        if (m372 != null) {
            String str = m372.f322;
            if (new File(str).getName().startsWith("aws-s3-d861b25a-1edf-11eb-adc1-0242ac120002")) {
                new File(str).delete();
            }
        }
        S3ClientReference.m354(Integer.valueOf(i));
        f356.getClass();
        TransferDBUtil.m364(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized TransferStatusUpdater m390(Context context) {
        TransferStatusUpdater transferStatusUpdater;
        synchronized (TransferStatusUpdater.class) {
            if (f360 == null) {
                TransferDBUtil transferDBUtil = new TransferDBUtil(context);
                f356 = transferDBUtil;
                f360 = new TransferStatusUpdater(transferDBUtil);
            }
            transferStatusUpdater = f360;
        }
        return transferStatusUpdater;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m395(int i, TransferState transferState) {
        boolean contains = f358.contains(transferState);
        TransferRecord transferRecord = (TransferRecord) this.f362.get(Integer.valueOf(i));
        if (transferRecord == null) {
            f356.getClass();
            if (TransferDBUtil.m360(i, transferState) == 0) {
                f359.mo300("Failed to update the status of transfer " + i);
            }
        } else {
            contains |= transferState.equals(transferRecord.f312);
            transferRecord.f312 = transferState;
            f356.getClass();
            if (TransferDBUtil.m361(transferRecord) == 0) {
                f359.mo300("Failed to update the status of transfer " + i);
            }
        }
        if (contains) {
            return;
        }
        if (TransferState.COMPLETED.equals(transferState)) {
            m399(i);
        }
        Map map = f357;
        synchronized (map) {
            List list = (List) ((ConcurrentMapC10942) map).get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f361.post(new Runnable(i, transferState) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            TransferListener.this.m375();
                        }
                    });
                }
                if (TransferState.m389(transferState)) {
                    list.clear();
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized ProgressListener m398(int i) {
        TransferRecord m392;
        m392 = m392(i);
        if (m392 == null) {
            f359.mo297("TransferStatusUpdater doesn't track the transfer: " + i);
            throw new IllegalArgumentException("transfer " + i + " doesn't exist");
        }
        f359.mo297("Creating a new progress listener for transfer: " + i);
        return new TransferProgressListener(m392);
    }

    public TransferStatusUpdater(TransferDBUtil transferDBUtil) {
        f356 = transferDBUtil;
        this.f361 = new Handler(Looper.getMainLooper());
        this.f362 = new ConcurrentMapC10942();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m396(int i, Exception exc) {
        Map map = f357;
        synchronized (map) {
            List list = (List) ((ConcurrentMapC10942) map).get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f361.post(new Runnable(i, exc) { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            TransferListener.this.m374();
                        }
                    });
                }
            }
        }
    }

    public class TransferProgressListener implements ProgressListener {

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public long f366;

        /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public final TransferRecord f368;

        @Override // com.amazonaws.event.ProgressListener
        /* renamed from: ֫ */
        public final synchronized void mo229(ProgressEvent progressEvent) {
            if (32 == progressEvent.m228()) {
                TransferStatusUpdater.f359.mo297("Reset Event triggered. Resetting the bytesCurrent to 0.");
                this.f366 = 0L;
            } else {
                long m226 = this.f366 + progressEvent.m226();
                this.f366 = m226;
                TransferRecord transferRecord = this.f368;
                if (m226 > transferRecord.f319) {
                    transferRecord.f319 = m226;
                    TransferStatusUpdater.this.m394(transferRecord.f328, m226, transferRecord.f325, true);
                }
            }
        }

        public TransferProgressListener(TransferRecord transferRecord) {
            this.f368 = transferRecord;
        }
    }
}
