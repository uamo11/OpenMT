package l;

/* compiled from: F8S4 */
/* renamed from: l.ᩳ֡ۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17701 implements InterfaceC15583 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f54162;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f54163;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f54164;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f54165;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f54166;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f54167;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f54168;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17714 f54169;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f54170;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8353 f54171;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16302 f54172;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f54173;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f54174;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f54175;

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1004(boolean z) {
    }

    public C17701(String str) {
        this(null, 0, str);
    }

    public C17701(String str, int i, String str2) {
        C16302 c16302 = new C16302(new byte[128], 128);
        this.f54172 = c16302;
        this.f54169 = new C17714(c16302.f50146);
        this.f54163 = 0;
        this.f54164 = -9223372036854775807L;
        this.f54175 = str;
        this.f54167 = i;
        this.f54168 = str2;
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1000() {
        this.f54163 = 0;
        this.f54162 = 0;
        this.f54165 = false;
        this.f54164 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f54173 = c19259.m44444();
        this.f54174 = interfaceC21830.mo3429(c19259.m44445(), 1);
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1001(int i, long j) {
        this.f54164 = j;
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1002(C17714 c17714) {
        C22632.m50632(this.f54174);
        while (c17714.m41457() > 0) {
            int i = this.f54163;
            C17714 c177142 = this.f54169;
            if (i == 0) {
                while (true) {
                    if (c17714.m41457() <= 0) {
                        break;
                    }
                    if (!this.f54165) {
                        this.f54165 = c17714.m41456() == 11;
                    } else {
                        int m41456 = c17714.m41456();
                        if (m41456 == 119) {
                            this.f54165 = false;
                            this.f54163 = 1;
                            c177142.m41482()[0] = 11;
                            c177142.m41482()[1] = 119;
                            this.f54162 = 2;
                            break;
                        }
                        this.f54165 = m41456 == 11;
                    }
                }
            } else if (i == 1) {
                byte[] m41482 = c177142.m41482();
                int min = Math.min(c17714.m41457(), 128 - this.f54162);
                c17714.m41461(this.f54162, min, m41482);
                int i2 = this.f54162 + min;
                this.f54162 = i2;
                if (i2 == 128) {
                    C16302 c16302 = this.f54172;
                    c16302.m38354(0);
                    C10127 m16514 = C5893.m16514(c16302);
                    int i3 = m16514.f30477;
                    int i4 = m16514.f30479;
                    int i5 = m16514.f30478;
                    String str = m16514.f30482;
                    C8353 c8353 = this.f54171;
                    if (c8353 == null || i5 != c8353.f25625 || i4 != c8353.f25624 || !C11003.equals(str, c8353.f25614)) {
                        C1297 c1297 = new C1297();
                        c1297.m4469(this.f54173);
                        c1297.m4462(this.f54168);
                        c1297.m4465(str);
                        c1297.m4472(i5);
                        c1297.m4456(i4);
                        c1297.m4471(this.f54175);
                        c1297.m4454(this.f54167);
                        c1297.m4438(i3);
                        if ("audio/ac3".equals(str)) {
                            c1297.m4468(i3);
                        }
                        C8353 m4440 = c1297.m4440();
                        this.f54171 = m4440;
                        this.f54174.mo8456(m4440);
                    }
                    this.f54170 = m16514.f30480;
                    this.f54166 = (m16514.f30481 * 1000000) / this.f54171.f25624;
                    c177142.m41484(0);
                    this.f54174.mo8453(128, c177142);
                    this.f54163 = 2;
                }
            } else if (i == 2) {
                int min2 = Math.min(c17714.m41457(), this.f54170 - this.f54162);
                this.f54174.mo8453(min2, c17714);
                int i6 = this.f54162 + min2;
                this.f54162 = i6;
                if (i6 == this.f54170) {
                    C22632.m50634(this.f54164 != -9223372036854775807L);
                    this.f54174.mo8455(this.f54164, 1, this.f54170, 0, null);
                    this.f54164 += this.f54166;
                    this.f54163 = 0;
                }
            }
        }
    }
}
