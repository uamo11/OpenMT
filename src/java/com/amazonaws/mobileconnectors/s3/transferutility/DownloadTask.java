package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class DownloadTask implements Callable {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Log f277 = LogFactory.m302(DownloadTask.class);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TransferRecord f278;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AmazonS3 f279;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TransferStatusUpdater f280;

    public DownloadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferStatusUpdater transferStatusUpdater) {
        this.f278 = transferRecord;
        this.f279 = amazonS3;
        this.f280 = transferStatusUpdater;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        Log log = f277;
        TransferStatusUpdater transferStatusUpdater = this.f280;
        TransferRecord transferRecord = this.f278;
        try {
            TransferNetworkLossHandler.m381();
            if (!TransferNetworkLossHandler.m381().m382()) {
                log.mo297("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                transferStatusUpdater.m395(transferRecord.f328, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e) {
            log.mo291("TransferUtilityException: [" + e + "]");
        }
        transferStatusUpdater.m395(transferRecord.f328, TransferState.IN_PROGRESS);
        ProgressListener m398 = transferStatusUpdater.m398(transferRecord.f328);
        try {
            GetObjectRequest getObjectRequest = new GetObjectRequest(transferRecord.f308, transferRecord.f313);
            TransferUtility.m405(getObjectRequest);
            File file = new File(transferRecord.f322);
            long length = file.length();
            if (length > 0) {
                str = "]";
                try {
                    log.mo294(String.format("Resume transfer %d from %d bytes", Integer.valueOf(transferRecord.f328), Long.valueOf(length)));
                    getObjectRequest.m568(length, -1L);
                } catch (Exception e2) {
                    e = e2;
                    Exception exc = e;
                    if (TransferState.PENDING_CANCEL.equals(transferRecord.f312)) {
                        int i = transferRecord.f328;
                        TransferState transferState = TransferState.CANCELED;
                        transferStatusUpdater.m395(i, transferState);
                        log.mo297("Transfer is " + transferState);
                        return Boolean.FALSE;
                    }
                    if (TransferState.PENDING_PAUSE.equals(transferRecord.f312)) {
                        int i2 = transferRecord.f328;
                        TransferState transferState2 = TransferState.PAUSED;
                        transferStatusUpdater.m395(i2, transferState2);
                        log.mo297("Transfer is " + transferState2);
                        new ProgressEvent(0L).m227(32);
                        ((TransferStatusUpdater.TransferProgressListener) m398).mo229(new ProgressEvent(0L));
                        return Boolean.FALSE;
                    }
                    try {
                        TransferNetworkLossHandler.m381();
                        if (!TransferNetworkLossHandler.m381().m382()) {
                            log.mo297("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                            transferStatusUpdater.m395(transferRecord.f328, TransferState.WAITING_FOR_NETWORK);
                            log.mo294("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                            new ProgressEvent(0L).m227(32);
                            ((TransferStatusUpdater.TransferProgressListener) m398).mo229(new ProgressEvent(0L));
                            return Boolean.FALSE;
                        }
                    } catch (TransferUtilityException e3) {
                        log.mo291("TransferUtilityException: [" + e3 + str);
                    }
                    if (RetryUtils.m433(exc)) {
                        log.mo297("Transfer is interrupted. " + exc);
                        transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
                        return Boolean.FALSE;
                    }
                    log.mo294("Failed to download: " + transferRecord.f328 + " due to " + exc.getMessage());
                    transferStatusUpdater.m396(transferRecord.f328, exc);
                    transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
                    return Boolean.FALSE;
                }
            }
            getObjectRequest.mo159(m398);
            S3Object mo437 = this.f279.mo437(getObjectRequest);
            if (mo437 == null) {
                transferStatusUpdater.m396(transferRecord.f328, new IllegalStateException("AmazonS3.getObject returns null"));
                transferStatusUpdater.m395(transferRecord.f328, TransferState.FAILED);
                return Boolean.FALSE;
            }
            long m636 = mo437.m654().m636();
            this.f280.m394(transferRecord.f328, length, m636, true);
            m352(mo437.m650(), file);
            this.f280.m394(transferRecord.f328, m636, m636, true);
            transferStatusUpdater.m395(transferRecord.f328, TransferState.COMPLETED);
            return Boolean.TRUE;
        } catch (Exception e4) {
            e = e4;
            str = "]";
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m352(S3ObjectInputStream s3ObjectInputStream, File file) {
        BufferedOutputStream bufferedOutputStream;
        Log log = f277;
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, file.length() > 0));
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = null;
            }
        } catch (SocketTimeoutException e) {
            e = e;
        } catch (IOException e2) {
            e = e2;
        }
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = s3ObjectInputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException e3) {
                        log.mo298("got exception", e3);
                    }
                }
            }
            bufferedOutputStream.close();
            try {
                s3ObjectInputStream.close();
            } catch (IOException e4) {
                log.mo298("got exception", e4);
            }
        } catch (SocketTimeoutException e5) {
            e = e5;
            String str = "SocketTimeoutException: Unable to retrieve contents over network: " + e.getMessage();
            log.mo291(str);
            throw new AmazonClientException(str, e);
        } catch (IOException e6) {
            e = e6;
            throw new AmazonClientException("Unable to store object contents to disk: " + e.getMessage(), e);
        } catch (Throwable th2) {
            th = th2;
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e7) {
                    log.mo298("got exception", e7);
                }
            }
            if (s3ObjectInputStream != null) {
                try {
                    s3ObjectInputStream.close();
                    throw th;
                } catch (IOException e8) {
                    log.mo298("got exception", e8);
                    throw th;
                }
            }
            throw th;
        }
    }
}
