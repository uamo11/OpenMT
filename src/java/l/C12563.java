package l;

/* compiled from: H4RX */
/* renamed from: l.۫ᩳ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C12563 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public short[] f37865;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public short[] f37866;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f37867;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public char[] f37868;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public short[] f37869;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public char[] f37870;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public short[] f37871;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public short[][] f37872;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C13999 f37873;

    /* renamed from: ֫ */
    public String mo2212() {
        throw null;
    }

    /* renamed from: ۧ */
    public int mo4057(int i, InterfaceC11858 interfaceC11858) {
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m30796(C13268 c13268) {
        short s;
        int m32232 = c13268.m32232();
        int i = 0;
        while (true) {
            try {
                short s2 = this.f37866[i];
                if (s2 >= 0) {
                    i = mo4057(s2, c13268);
                    if (i == -1) {
                        m30797(i, c13268);
                        throw null;
                    }
                    c13268.mo28965();
                } else {
                    short s3 = this.f37865[i];
                    if (s3 >= 1) {
                        return s3;
                    }
                    char mo28964 = (char) c13268.mo28964(1);
                    char c = this.f37868[i];
                    if (mo28964 >= c && mo28964 <= this.f37870[i]) {
                        short s4 = this.f37872[i][mo28964 - c];
                        if (s4 < 0) {
                            s4 = this.f37871[i];
                            if (s4 >= 0) {
                                c13268.mo28965();
                            } else {
                                m30797(i, c13268);
                                throw null;
                            }
                        } else {
                            c13268.mo28965();
                        }
                        i = s4;
                    } else {
                        short s5 = this.f37871[i];
                        if (s5 < 0) {
                            if (mo28964 == 65535 && (s = this.f37869[i]) >= 0) {
                                return this.f37865[s];
                            }
                            m30797(i, c13268);
                            throw null;
                        }
                        c13268.mo28965();
                        i = s5;
                    }
                }
            } finally {
                c13268.f39733 = m32232;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30797(int i, InterfaceC11858 interfaceC11858) {
        C23831 c23831 = this.f37873.f72693;
        throw new C16775(mo2212(), this.f37867, i, interfaceC11858);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static short[] m30794(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            i += str.charAt(i2);
        }
        short[] sArr = new short[i];
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4 += 2) {
            char charAt = str.charAt(i4);
            char charAt2 = str.charAt(i4 + 1);
            int i5 = 1;
            while (i5 <= charAt) {
                sArr[i3] = (short) charAt2;
                i5++;
                i3++;
            }
        }
        return sArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static char[] m30795(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2 += 2) {
            i += str.charAt(i2);
        }
        char[] cArr = new char[i];
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4 += 2) {
            char charAt = str.charAt(i4);
            char charAt2 = str.charAt(i4 + 1);
            int i5 = 1;
            while (i5 <= charAt) {
                cArr[i3] = charAt2;
                i5++;
                i3++;
            }
        }
        return cArr;
    }
}
