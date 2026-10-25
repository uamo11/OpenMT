package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.model.UploadPartRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Q87M */
/* renamed from: l.۟ۖ᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C7190 extends AbstractC3163 {

    /* renamed from: ۚۢ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f22024;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f22025 = 0;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C1586 f22026;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C1545 f22027;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3786 f22028;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private native void m19259();

    @Override // l.AbstractC3163
    /* renamed from: ۗ */
    public final boolean mo9687() {
        return false;
    }

    @Override // l.AbstractC3163
    /* renamed from: ۧ */
    public final void mo9695(C10130 c10130) {
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩶ */
    public final boolean mo9706() {
        return false;
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩸ */
    public final void mo9707() {
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩹ */
    public final boolean mo9708() {
        return false;
    }

    public C7190(int i, AbstractC3577 abstractC3577) {
        super(i, abstractC3577);
        this.f22028 = new C3786(new C5779(this), false);
        this.f22026 = C1586.m5431(i, abstractC3577);
        m19259();
    }

    @Override // l.AbstractC3163
    /* renamed from: ֫ */
    public final void mo9685(AbstractC3577 abstractC3577) {
        super.mo9685(abstractC3577);
        C1586 m5431 = C1586.m5431(this.f9954, abstractC3577);
        if (this.f22026.equals(m5431)) {
            return;
        }
        this.f22026 = m5431;
        m19259();
        this.f22028.m11441();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m19260(C7190 c7190) {
        return c7190.f22026.f5615;
    }

    static {
        ApplicationC12518.m30701(74);
        f22024 = new short[]{2753, -5182, -5246, -5218, -5165, -5156, -5153, -5179, -5164, -5162, -5156, -5167, -5182, -5163, -5181, -5180, -5153, -5182, -5167, -5161, -5163, -5218, -5165, -5153, -5155};
        SignerFactory.m223(C10759.class, "UnsignedPayloadSignerType");
    }

    public C7190(int i, AbstractC3577 abstractC3577, C12951 c12951) {
        this(i, abstractC3577);
    }

    @Override // l.AbstractC3163
    /* renamed from: ۘ */
    public final String mo9688() {
        return this.f22026.f5619 + ":" + this.f22026.f5615;
    }

    @Override // l.AbstractC3163
    /* renamed from: ۖ */
    public final String mo9686() {
        URI m5432 = this.f22026.m5432();
        if (m5432 != null && m5432.getHost() != null) {
            return m5432.getHost();
        }
        return AbstractC3163.m9677(C12834.m31207(this.f22026.f5619, new ClientConfiguration()));
    }

    @Override // l.AbstractC3163
    /* renamed from: ܶ */
    public final String mo9699() {
        return TextUtils.isEmpty(this.f9955.f11354) ? "/" : AbstractC16891.m39731(this.f9955.f11354);
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7646(boolean z) {
        this.f22028.m11441();
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        C3786 c3786 = this.f22028;
        c3786.getClass();
        C13539 c13539 = (C13539) c3786.m11440(C9523.m24406(str), C9523.m24404(str));
        if (c13539 == null) {
            return null;
        }
        return c13539.m32580();
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        Collection<C13539> values = this.f22028.m11446(AbstractC16891.m39731(str)).values();
        ArrayList arrayList = new ArrayList(values.size() + 1);
        for (C13539 c13539 : values) {
            if (z || !c13539.m32581().startsWith(".")) {
                arrayList.add(c13539.m32580());
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC3163
    /* renamed from: ֫ */
    public final InputStream mo9681(long j, String str) {
        S3ObjectSummary s3ObjectSummary;
        S3ObjectSummary s3ObjectSummary2;
        GetObjectRequest getObjectRequest = new GetObjectRequest(this.f22026.f5615, str.substring(1));
        if (j > 0) {
            if (C1545.m5291(this.f22026.f5619)) {
                C3786 c3786 = this.f22028;
                c3786.getClass();
                C13539 c13539 = (C13539) c3786.m11440(C9523.m24406(str), C9523.m24404(str));
                long j2 = -1;
                if (c13539 != null) {
                    s3ObjectSummary = c13539.f40415;
                    if (s3ObjectSummary != null) {
                        s3ObjectSummary2 = c13539.f40415;
                        long m666 = s3ObjectSummary2.m666();
                        if (m666 > 0 && j < m666) {
                            j2 = m666 - 1;
                        }
                    }
                }
                if (j2 >= j) {
                    getObjectRequest.m568(j, j2);
                }
            }
            getObjectRequest.m568(j, 9223372036854775806L);
        }
        try {
            return this.f22027.mo437(getObjectRequest).m650();
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19258(C7190 c7190, PutObjectRequest putObjectRequest, AtomicReference atomicReference, InterfaceC1274 interfaceC1274, CountDownLatch countDownLatch) {
        try {
            try {
                c7190.f22027.mo436(putObjectRequest);
                try {
                    interfaceC1274.close();
                } catch (IOException e) {
                    while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                    }
                }
            } catch (AmazonClientException e2) {
                IOException iOException = new IOException(e2.getMessage(), e2);
                while (!atomicReference.compareAndSet(null, iOException) && atomicReference.get() == null) {
                }
                try {
                    interfaceC1274.close();
                } catch (IOException e3) {
                    while (!atomicReference.compareAndSet(null, e3) && atomicReference.get() == null) {
                    }
                }
            }
            countDownLatch.countDown();
        } catch (Throwable th) {
            try {
                interfaceC1274.close();
            } catch (IOException e4) {
                while (!atomicReference.compareAndSet(null, e4) && atomicReference.get() == null) {
                }
            }
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ۧ */
    public final OutputStream mo9693(final long j, String str) {
        if (j <= 2147483647L) {
            C9742 c9742 = new C9742(524288L);
            final InterfaceC1274 m24729 = c9742.m24729();
            InterfaceC10405 m52568 = C23852.m52568(c9742.m24728());
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.m616(j);
            objectMetadata.m637(C2204.m7292(C9523.m24404(str), true).m7315());
            final PutObjectRequest putObjectRequest = new PutObjectRequest(this.f22026.f5615, str.substring(1), C23852.m52567(m24729).mo12307(), objectMetadata);
            final AtomicReference atomicReference = new AtomicReference();
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            C1802.f6208.execute(new Runnable() { // from class: l.۫ۖ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C7190.m19258(C7190.this, putObjectRequest, atomicReference, m24729, countDownLatch);
                }
            });
            return new C11424(atomicReference, m52568, countDownLatch);
        }
        final String substring = str.substring(1);
        ObjectMetadata objectMetadata2 = new ObjectMetadata();
        objectMetadata2.m637(C2204.m7292(C9523.m24404(str), true).m7315());
        try {
            final String m589 = this.f22027.mo435(new InitiateMultipartUploadRequest(this.f22026.f5615, substring, objectMetadata2)).m589();
            final ArrayList arrayList = new ArrayList();
            C9742 c97422 = new C9742(524288L);
            final InterfaceC1274 m247292 = c97422.m24729();
            InterfaceC10405 m525682 = C23852.m52568(c97422.m24728());
            final InputStream mo12307 = C23852.m52567(m247292).mo12307();
            final AtomicReference atomicReference2 = new AtomicReference();
            final CountDownLatch countDownLatch2 = new CountDownLatch(1);
            C1802.f6208.execute(new Runnable() { // from class: l.ۤۖ᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C7190.m19257(C7190.this, j, mo12307, substring, m589, arrayList, atomicReference2, m247292, countDownLatch2);
                }
            });
            return new C22712(this, atomicReference2, m525682, countDownLatch2, substring, m589, arrayList);
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19257(C7190 c7190, long j, InputStream inputStream, String str, String str2, ArrayList arrayList, AtomicReference atomicReference, InterfaceC1274 interfaceC1274, CountDownLatch countDownLatch) {
        long j2 = 0;
        int i = 1;
        while (j2 < j) {
            try {
                long min = Math.min(104857600L, j - j2);
                C7580 c7580 = new C7580(min, inputStream);
                UploadPartRequest uploadPartRequest = new UploadPartRequest();
                uploadPartRequest.m678(c7190.f22026.f5615);
                uploadPartRequest.m683(str);
                uploadPartRequest.m688(str2);
                uploadPartRequest.m687(i);
                uploadPartRequest.m677(c7580);
                uploadPartRequest.m682(min);
                arrayList.add(c7190.f22027.mo438(uploadPartRequest).m694());
                j2 += c7580.m20324();
                i++;
            } catch (Throwable th) {
                try {
                    IOException iOException = new IOException(th.getMessage(), th);
                    while (!atomicReference.compareAndSet(null, iOException) && atomicReference.get() == null) {
                    }
                    try {
                        c7190.f22027.mo439(new AbortMultipartUploadRequest(c7190.f22026.f5615, str, str2));
                    } catch (Throwable unused) {
                    }
                    try {
                        interfaceC1274.close();
                    } catch (IOException e) {
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        interfaceC1274.close();
                    } catch (IOException e2) {
                        while (!atomicReference.compareAndSet(null, e2) && atomicReference.get() == null) {
                        }
                    }
                    countDownLatch.countDown();
                    throw th2;
                }
            }
        }
        try {
            interfaceC1274.close();
        } catch (IOException e3) {
            while (!atomicReference.compareAndSet(null, e3) && atomicReference.get() == null) {
            }
        }
        countDownLatch.countDown();
    }

    @Override // l.AbstractC3163
    /* renamed from: ܽ */
    public final void mo9701(String str, boolean z) {
        try {
            String substring = str.substring(1);
            if (!z) {
                this.f22027.m451(new DeleteObjectRequest(this.f22026.f5615, substring));
                return;
            }
            String str2 = substring + "/";
            Thread currentThread = Thread.currentThread();
            String str3 = null;
            while (true) {
                ObjectListing m448 = this.f22027.m448(new ListObjectsRequest(this.f22026.f5615, str2, str3, null, 1000));
                List list = (List) C5378.stream(m448.m613()).map(new C1775(2)).collect(C22976.toList());
                DeleteObjectsRequest deleteObjectsRequest = new DeleteObjectsRequest(this.f22026.f5615);
                deleteObjectsRequest.m560(list);
                deleteObjectsRequest.m561();
                try {
                    this.f22027.m452(deleteObjectsRequest);
                } catch (MultiObjectDeleteException e) {
                    Iterator it = e.m601().iterator();
                    if (it.hasNext()) {
                        throw new IOException(C4925.m14306(R.string.MT_Protector_res_0x7f120238, ((MultiObjectDeleteException.DeleteError) it.next()).m602()));
                    }
                }
                if (m448.m612() && !currentThread.isInterrupted()) {
                    str3 = m448.m611();
                }
                return;
            }
        } catch (AmazonClientException e2) {
            throw new IOException(e2.getMessage(), e2);
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ֫ */
    public final void mo9684(String str, String str2) {
        try {
            C3786 c3786 = this.f22028;
            c3786.getClass();
            C13539 c13539 = (C13539) c3786.m11440(C9523.m24406(str), C9523.m24404(str));
            String substring = str.substring(1);
            String substring2 = str2.substring(1);
            if (!(c13539 != null ? c13539.m32582() : !this.f22027.m453(this.f22026.f5615, substring))) {
                if (this.f22027.m453(this.f22026.f5615, substring2)) {
                    throw new IOException(C4925.m14306(R.string.MT_Protector_res_0x7f12063b, substring2));
                }
                this.f22027.m450(new CopyObjectRequest(this.f22026.f5615, C12789.encode(substring, StandardCharsets.UTF_8), this.f22026.f5615, substring2));
                this.f22027.m451(new DeleteObjectRequest(this.f22026.f5615, substring));
                return;
            }
            String str3 = substring + "/";
            String str4 = substring2 + "/";
            Thread currentThread = Thread.currentThread();
            String str5 = null;
            boolean z = true;
            while (true) {
                ObjectListing m448 = this.f22027.m448(new ListObjectsRequest(this.f22026.f5615, str3, str5, null, 1000));
                if (z) {
                    if (!m448.m613().isEmpty() && !this.f22027.m448(new ListObjectsRequest(this.f22026.f5615, str4, null, null, 1)).m613().isEmpty()) {
                        throw new IOException(C4925.m14306(R.string.MT_Protector_res_0x7f12063a, str4));
                    }
                    z = false;
                }
                Iterator it = m448.m613().iterator();
                while (it.hasNext()) {
                    String m659 = ((S3ObjectSummary) it.next()).m659();
                    this.f22027.m450(new CopyObjectRequest(this.f22026.f5615, C12789.encode(m659, StandardCharsets.UTF_8), this.f22026.f5615, str4 + m659.substring(str3.length())));
                    this.f22027.m451(new DeleteObjectRequest(this.f22026.f5615, m659));
                    if (currentThread.isInterrupted()) {
                        break;
                    }
                }
                if (m448.m612() && !currentThread.isInterrupted()) {
                    str5 = m448.m611();
                }
                return;
            }
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ܿ */
    public final void mo9702(String str) {
        try {
            String str2 = str.substring(1) + "/";
            ObjectMetadata objectMetadata = new ObjectMetadata();
            objectMetadata.m616(0L);
            this.f22027.mo436(new PutObjectRequest(this.f22026.f5615, str2, new ByteArrayInputStream(new byte[0]), objectMetadata));
        } catch (AmazonClientException e) {
            throw new IOException(e.getMessage(), e);
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ۜ */
    public final boolean mo9691(String str) {
        return this.f22028.m11445(str);
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩳ */
    public final boolean mo9703(String str) {
        C3786 c3786 = this.f22028;
        c3786.getClass();
        return c3786.m11440(C9523.m24406(str), C9523.m24404(str)) != null;
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩻ */
    public final String mo9709(String str) {
        return this.f22028.m11444(str);
    }

    @Override // l.AbstractC3163
    /* renamed from: ۢ */
    public final void mo9692(String str) {
        this.f22028.m11442(str);
    }
}
