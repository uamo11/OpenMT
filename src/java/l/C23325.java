package l;

import com.umeng.analytics.pro.am;
import java.io.IOException;

/* compiled from: RBI4 */
/* renamed from: l.᩺᩻ܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23325 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f74966;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f74967;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C20938 f74969;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC5813 f74971;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f74972;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f74973;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f74974;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1662 f74975;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23095 f74976;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1887 f74977;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13964[] f74978;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f74965 = 0;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f74968 = 1;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C18241 f74970 = new C18241();

    public C23325(C20938 c20938, C1887 c1887, C1662 c1662, int i, int i2, boolean z, C22390 c22390) {
        this.f74969 = c20938;
        this.f74977 = c1887;
        this.f74975 = c1662;
        this.f74976 = c22390.m39386();
        this.f74972 = z;
        this.f74974 = i;
        this.f74966 = i2;
        this.f74978 = new C13964[i2];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51721(int i, String str) {
        if (this.f74973 != null) {
            str = C9045.m23341(new StringBuilder(), this.f74973, str);
        }
        InterfaceC5813 interfaceC5813 = this.f74971;
        if (interfaceC5813 != null) {
            if (!this.f74967) {
                i = 0;
            }
            ((C18241) interfaceC5813).m42501(i, str);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m51729() {
        try {
            return m51727();
        } catch (IOException e) {
            throw C8136.m21601("...while encoding debug info", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m51730(String str, InterfaceC5813 interfaceC5813, boolean z) {
        this.f74973 = str;
        this.f74971 = interfaceC5813;
        this.f74967 = z;
        return m51729();
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x032e, code lost:
    
        r10.m42517(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0334, code lost:
    
        if (r16.f74971 != null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0337, code lost:
    
        m51721(1, "end sequence");
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0341, code lost:
    
        return r10.m42520();
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] m51727() {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23325.m51727():byte[]");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m51725(C13964 c13964) {
        StringBuilder sb = new StringBuilder(am.aE);
        sb.append(c13964.m33421());
        sb.append(' ');
        C13217 name = c13964.getName();
        if (name == null) {
            sb.append("null");
        } else {
            sb.append(name.mo2463());
        }
        sb.append(' ');
        C12512 type = c13964.getType();
        if (type == null) {
            sb.append("null");
        } else {
            sb.append(type.mo2463());
        }
        C13217 signature = c13964.getSignature();
        if (signature != null) {
            sb.append(' ');
            sb.append(signature.mo2463());
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51723(C13217 c13217) {
        C1662 c1662;
        C18241 c18241 = this.f74970;
        if (c13217 == null || (c1662 = this.f74975) == null) {
            c18241.m42507(0);
        } else {
            c18241.m42507(c1662.m5631().m6830(c13217) + 1);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51724(C13964 c13964) {
        C1662 c1662;
        C18241 c18241 = this.f74970;
        int m42510 = c18241.m42510();
        c18241.m42517(4);
        m51728(c13964.m33421());
        m51723(c13964.getName());
        C12512 type = c13964.getType();
        if (type == null || (c1662 = this.f74975) == null) {
            c18241.m42507(0);
        } else {
            c18241.m42507(c1662.m5632().m39748(type) + 1);
        }
        m51723(c13964.getSignature());
        if (this.f74971 == null) {
            return;
        }
        m51721(c18241.m42510() - m42510, String.format("%04x: +localx %s", Integer.valueOf(this.f74965), m51725(c13964)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51722(C6826 c6826) {
        int m25588 = c6826.m18514().m25588();
        int m18513 = c6826.m18513();
        int i = m25588 - this.f74968;
        int i2 = m18513 - this.f74965;
        if (i2 < 0) {
            throw new RuntimeException("Position entries must be in ascending address order");
        }
        if (i < -4 || i > 10) {
            m51720(i);
            i = 0;
        }
        int m51719 = m51719(i, i2);
        if ((m51719 & (-256)) > 0) {
            m51726(i2);
            m51719 = m51719(i, 0);
            if ((m51719 & (-256)) > 0) {
                m51720(i);
                m51719 = m51719(0, 0);
                i2 = 0;
                i = 0;
            } else {
                i2 = 0;
            }
        }
        this.f74970.m42517(m51719);
        this.f74968 += i;
        int i3 = this.f74965 + i2;
        this.f74965 = i3;
        if (this.f74971 == null) {
            return;
        }
        m51721(1, String.format("%04x: line %d", Integer.valueOf(i3), Integer.valueOf(this.f74968)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51719(int i, int i2) {
        if (i < -4 || i > 10) {
            throw new RuntimeException("Parameter out of range");
        }
        return C23202.m51496(i2, 15, i - (-4), 10);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51720(int i) {
        C18241 c18241 = this.f74970;
        int m42510 = c18241.m42510();
        c18241.m42517(2);
        c18241.m42519(i);
        this.f74968 += i;
        if (this.f74971 == null) {
            return;
        }
        m51721(c18241.m42510() - m42510, String.format("line = %d", Integer.valueOf(this.f74968)));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m51726(int i) {
        C18241 c18241 = this.f74970;
        int m42510 = c18241.m42510();
        c18241.m42517(1);
        c18241.m42507(i);
        this.f74965 += i;
        if (this.f74971 == null) {
            return;
        }
        m51721(c18241.m42510() - m42510, String.format("%04x: advance pc", Integer.valueOf(this.f74965)));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51728(int i) {
        if (i < 0) {
            throw new RuntimeException(C19370.m44628(i, "Signed value where unsigned required: "));
        }
        this.f74970.m42507(i);
    }
}
