package l;

import com.umeng.analytics.pro.bo;

/* compiled from: G8K6 */
/* renamed from: l.ۙ֡ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4296 implements InterfaceC15583 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f13849;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f13850 = 0;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f13851;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17714 f13852;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f13853;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f13854;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f13855;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f13856;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f13857;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f13858;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f13859;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f13860;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f13861;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17265 f13862;

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1004(boolean z) {
    }

    public C4296(String str, int i, String str2) {
        C17714 c17714 = new C17714(4);
        this.f13852 = c17714;
        c17714.m41482()[0] = -1;
        this.f13862 = new C17265();
        this.f13851 = -9223372036854775807L;
        this.f13861 = str;
        this.f13857 = i;
        this.f13849 = str2;
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1000() {
        this.f13850 = 0;
        this.f13858 = 0;
        this.f13854 = false;
        this.f13851 = -9223372036854775807L;
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f13855 = c19259.m44444();
        this.f13853 = interfaceC21830.mo3429(c19259.m44445(), 1);
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1001(int i, long j) {
        this.f13851 = j;
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1002(C17714 c17714) {
        C22632.m50632(this.f13853);
        while (c17714.m41457() > 0) {
            int i = this.f13850;
            C17714 c177142 = this.f13852;
            if (i == 0) {
                byte[] m41482 = c17714.m41482();
                int m41485 = c17714.m41485();
                int m41483 = c17714.m41483();
                while (true) {
                    if (m41485 < m41483) {
                        byte b = m41482[m41485];
                        boolean z = (b & 255) == 255;
                        boolean z2 = this.f13854 && (b & bo.k) == 224;
                        this.f13854 = z;
                        if (z2) {
                            c17714.m41484(m41485 + 1);
                            this.f13854 = false;
                            c177142.m41482()[1] = m41482[m41485];
                            this.f13858 = 2;
                            this.f13850 = 1;
                            break;
                        }
                        m41485++;
                    } else {
                        c17714.m41484(m41483);
                        break;
                    }
                }
            } else if (i == 1) {
                int min = Math.min(c17714.m41457(), 4 - this.f13858);
                c17714.m41461(this.f13858, min, c177142.m41482());
                int i2 = this.f13858 + min;
                this.f13858 = i2;
                if (i2 >= 4) {
                    c177142.m41484(0);
                    int m41493 = c177142.m41493();
                    C17265 c17265 = this.f13862;
                    if (!c17265.m40557(m41493)) {
                        this.f13858 = 0;
                        this.f13850 = 1;
                    } else {
                        this.f13859 = c17265.f52921;
                        if (!this.f13856) {
                            this.f13860 = (c17265.f52920 * 1000000) / c17265.f52922;
                            C1297 c1297 = new C1297();
                            c1297.m4469(this.f13855);
                            c1297.m4462(this.f13849);
                            c1297.m4465(c17265.f52923);
                            c1297.m4451(4096);
                            c1297.m4472(c17265.f52919);
                            c1297.m4456(c17265.f52922);
                            c1297.m4471(this.f13861);
                            c1297.m4454(this.f13857);
                            this.f13853.mo8456(c1297.m4440());
                            this.f13856 = true;
                        }
                        c177142.m41484(0);
                        this.f13853.mo8453(4, c177142);
                        this.f13850 = 2;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(c17714.m41457(), this.f13859 - this.f13858);
                this.f13853.mo8453(min2, c17714);
                int i3 = this.f13858 + min2;
                this.f13858 = i3;
                if (i3 >= this.f13859) {
                    C22632.m50634(this.f13851 != -9223372036854775807L);
                    this.f13853.mo8455(this.f13851, 1, this.f13859, 0, null);
                    this.f13851 += this.f13860;
                    this.f13858 = 0;
                    this.f13850 = 0;
                }
            }
        }
    }
}
