package l;

import android.os.SystemClock;
import com.alipay.sdk.m.y.c;
import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: 0N4 */
/* renamed from: l.ܳ֡ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14176 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C8817 f42809 = C8817.m22786(1000);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33825(InputStream inputStream, OutputStream outputStream, long j, InterfaceC5627 interfaceC5627) {
        long j2;
        C2036 m6620 = C2036.m6620(interfaceC5627);
        try {
            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
            long uptimeMillis = SystemClock.uptimeMillis();
            long j3 = 0;
            long j4 = 0;
            while (true) {
                int read = inputStream.read(bArr, 0, WXNativeGamePageObject.LENGTH_LIMIT);
                if (read == -1) {
                    if (m6620 != null) {
                        return;
                    } else {
                        return;
                    }
                }
                outputStream.write(bArr, 0, read);
                long j5 = read + j3;
                if (m6620 != null) {
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    if (uptimeMillis2 - uptimeMillis < c.a || !f42809.m22791()) {
                        j2 = uptimeMillis;
                    } else {
                        m6620.mo6623();
                        j2 = uptimeMillis2;
                    }
                    long min = outputStream instanceof InterfaceC0687 ? Math.min(j5, Math.max(j4, ((InterfaceC0687) outputStream).mo2776())) : j5;
                    if (min > j4) {
                        m6620.mo6621(min - j4, min, Math.max(j5, j));
                        j4 = min;
                    }
                    if (m6620.f6790.mo1526()) {
                        m6620.mo6622();
                        return;
                    }
                    uptimeMillis = j2;
                }
                j3 = j5;
            }
        } finally {
            if (m6620 != null) {
                m6620.mo6622();
            }
        }
    }
}
