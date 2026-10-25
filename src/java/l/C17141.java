package l;

import com.umeng.analytics.pro.o;

/* compiled from: Y8QO */
/* renamed from: l.ܿۚۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17141 implements InterfaceC0207 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f52532;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17847 f52533;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f52534;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17714 f52535 = new C17714(32);

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52536;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f52537;

    public C17141(InterfaceC17847 interfaceC17847) {
        this.f52533 = interfaceC17847;
    }

    @Override // l.InterfaceC0207
    /* renamed from: ֫ */
    public final void mo1452(C9248 c9248, InterfaceC21830 interfaceC21830, C19259 c19259) {
        this.f52533.mo22462(c9248, interfaceC21830, c19259);
        this.f52534 = true;
    }

    @Override // l.InterfaceC0207
    /* renamed from: ֫ */
    public final void mo1450() {
        this.f52534 = true;
    }

    @Override // l.InterfaceC0207
    /* renamed from: ֫ */
    public final void mo1451(int i, C17714 c17714) {
        boolean z = (i & 1) != 0;
        int m41485 = z ? c17714.m41485() + c17714.m41456() : -1;
        if (this.f52534) {
            if (!z) {
                return;
            }
            this.f52534 = false;
            c17714.m41484(m41485);
            this.f52532 = 0;
        }
        while (c17714.m41457() > 0) {
            int i2 = this.f52532;
            C17714 c177142 = this.f52535;
            if (i2 < 3) {
                if (i2 == 0) {
                    int m41456 = c17714.m41456();
                    c17714.m41484(c17714.m41485() - 1);
                    if (m41456 == 255) {
                        this.f52534 = true;
                        return;
                    }
                }
                int min = Math.min(c17714.m41457(), 3 - this.f52532);
                c17714.m41461(this.f52532, min, c177142.m41482());
                int i3 = this.f52532 + min;
                this.f52532 = i3;
                if (i3 == 3) {
                    c177142.m41484(0);
                    c177142.m41486(3);
                    c177142.m41478(1);
                    int m414562 = c177142.m41456();
                    int m414563 = c177142.m41456();
                    this.f52537 = (m414562 & 128) != 0;
                    this.f52536 = (((m414562 & 15) << 8) | m414563) + 3;
                    int m41472 = c177142.m41472();
                    int i4 = this.f52536;
                    if (m41472 < i4) {
                        c177142.m41460(Math.min(o.a.b, Math.max(i4, c177142.m41472() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c17714.m41457(), this.f52536 - this.f52532);
                c17714.m41461(this.f52532, min2, c177142.m41482());
                int i5 = this.f52532 + min2;
                this.f52532 = i5;
                int i6 = this.f52536;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.f52537) {
                        if (C3603.m11005(0, c177142.m41482(), this.f52536, -1) != 0) {
                            this.f52534 = true;
                            return;
                        }
                        c177142.m41486(this.f52536 - 4);
                    } else {
                        c177142.m41486(i6);
                    }
                    c177142.m41484(0);
                    this.f52533.mo22463(c177142);
                    this.f52532 = 0;
                }
            }
        }
    }
}
