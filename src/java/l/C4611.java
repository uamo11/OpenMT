package l;

import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: 819Z */
/* renamed from: l.ۙۧᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4611 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f14681;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f14682;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22250 f14683;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f14684;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f14685;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f14686;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C22250 m13527(InterfaceC17066 interfaceC17066) {
        C22250 c22250 = this.f14683;
        if (c22250 != null) {
            return c22250;
        }
        try {
            C22250 m13526 = m13526(C16360.m38504(interfaceC17066));
            this.f14683 = m13526;
            return m13526;
        } catch (IOException e) {
            this.f14683 = new C22250();
            throw e;
        }
    }

    public C4611(AbstractC15440 abstractC15440, boolean z) {
        byte[] bArr;
        byte[] bArr2;
        this.f14681 = abstractC15440;
        int i = 0;
        byte[] bArr3 = null;
        if (z) {
            C23411 m36513 = abstractC15440.m36513("r");
            try {
                C18929 c18929 = new C18929(m36513);
                byte[] m47891 = C21046.m47891(c18929, (byte[]) null);
                this.f14684 = m47891;
                byte[] m13525 = m47891 != null ? null : m13525(C16105.m38013(c18929, false, (byte[]) null));
                this.f14685 = m13525;
                if (m47891 == null && m13525 == null) {
                    bArr2 = m13525(C16105.m38013(c18929, true, (byte[]) null));
                    this.f14686 = bArr2;
                    m36513.close();
                    if (m47891 == null && m13525 == null && bArr2 == null) {
                        bArr3 = C23867.m52579(abstractC15440);
                    }
                    this.f14682 = bArr3;
                    return;
                }
                bArr2 = null;
                this.f14686 = bArr2;
                m36513.close();
                if (m47891 == null) {
                    bArr3 = C23867.m52579(abstractC15440);
                }
                this.f14682 = bArr3;
                return;
            } catch (Throwable th) {
                try {
                    m36513.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] m52579 = C23867.m52579(abstractC15440);
        this.f14682 = m52579;
        C23411 m365132 = abstractC15440.m36513("r");
        try {
            C18929 c189292 = new C18929(m365132);
            byte[] m478912 = C21046.m47891(c189292, m52579);
            this.f14684 = m478912;
            byte[][] bArr4 = {m478912, m52579};
            int i2 = 0;
            while (true) {
                if (i2 >= 2) {
                    bArr = null;
                    break;
                }
                bArr = bArr4[i2];
                if (bArr != null) {
                    break;
                } else {
                    i2++;
                }
            }
            byte[] m135252 = m13525(C16105.m38013(c189292, false, bArr));
            this.f14685 = m135252;
            byte[][] bArr5 = {m135252, m478912, m52579};
            while (true) {
                if (i >= 3) {
                    break;
                }
                byte[] bArr6 = bArr5[i];
                if (bArr6 != null) {
                    bArr3 = bArr6;
                    break;
                }
                i++;
            }
            this.f14686 = m13525(C16105.m38013(c189292, true, bArr3));
            m365132.close();
        } catch (Throwable th3) {
            try {
                m365132.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m13525(C10220 c10220) {
        C21709 c21709;
        if (c10220 == null) {
            return null;
        }
        Object obj = c10220.f30697;
        byte[] bArr = this.f14682;
        if (bArr == null) {
            bArr = this.f14684;
        }
        if (bArr == null) {
            return (byte[]) obj;
        }
        try {
            c21709 = (C21709) c10220.f30698;
        } catch (Exception unused) {
        }
        if (c21709 == null) {
            return (byte[]) obj;
        }
        if (c21709.m49042((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).m49041() == 1) {
            return bArr;
        }
        return (byte[]) obj;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m13537() {
        return (this.f14682 == null && this.f14684 == null && this.f14685 == null && this.f14686 == null) ? false : true;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m13529() {
        byte[] bArr = this.f14686;
        byte[] bArr2 = this.f14685;
        byte[] bArr3 = this.f14684;
        byte[] bArr4 = this.f14682;
        if (bArr4 != null) {
            if (bArr3 != null && !Arrays.equals(bArr4, bArr3)) {
                return true;
            }
            if (bArr2 != null && !Arrays.equals(bArr4, bArr2)) {
                return true;
            }
            if (bArr != null && !Arrays.equals(bArr4, bArr)) {
                return true;
            }
        }
        if (bArr3 != null) {
            if (bArr2 != null && !Arrays.equals(bArr3, bArr2)) {
                return true;
            }
            if (bArr != null && !Arrays.equals(bArr3, bArr)) {
                return true;
            }
        }
        return (bArr2 == null || bArr == null || Arrays.equals(bArr2, bArr)) ? false : true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m13532() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (bArr3 = this.f14686) != null) {
            return bArr3;
        }
        if (i >= 28 && (bArr2 = this.f14685) != null) {
            return bArr2;
        }
        if (i >= 24 && (bArr = this.f14684) != null) {
            return bArr;
        }
        byte[] bArr4 = this.f14682;
        if (bArr4 != null) {
            return bArr4;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m13528() {
        byte[] bArr = this.f14686;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = this.f14685;
        if (bArr2 != null) {
            return bArr2;
        }
        byte[] bArr3 = this.f14684;
        if (bArr3 != null) {
            return bArr3;
        }
        byte[] bArr4 = this.f14682;
        if (bArr4 != null) {
            return bArr4;
        }
        return null;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m13533() {
        return this.f14686;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] m13538() {
        return this.f14685;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] m13535() {
        return this.f14684;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] m13536() {
        return this.f14682;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m13534() {
        boolean z = this.f14682 != null;
        boolean z2 = this.f14684 != null;
        boolean z3 = this.f14685 != null;
        boolean z4 = this.f14686 != null;
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("V1");
        }
        if (z2) {
            arrayList.add("V2");
        }
        if (z3) {
            arrayList.add("V3");
        }
        if (z4) {
            arrayList.add("V3.1");
        }
        return arrayList.isEmpty() ? "NULL" : C9679.m24609(arrayList, " + ");
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m13530() {
        return this.f14683 != null;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m13531() {
        return m13530() && this.f14683.f72204;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0132  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C22250 m13526(l.InterfaceC17066 r15) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4611.m13526(l.ܿۖ᩷):l.᩹ۧᩳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13524(byte[] bArr, byte[] bArr2) {
        return (bArr == null || bArr2 == null || Arrays.equals(bArr, bArr2)) ? false : true;
    }
}
