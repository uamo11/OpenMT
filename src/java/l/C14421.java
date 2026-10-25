package l;

import java.util.List;

/* compiled from: J8O5 */
/* renamed from: l.ܳۡۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14421 implements InterfaceC1368 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17244 f44197;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f44199;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f44200;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f44203;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f44205;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f44206;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f44207;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f44209;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C9484 f44210;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f44212;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17714 f44211 = new C17714(4);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17714 f44208 = new C17714(9);

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17714 f44198 = new C17714(11);

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C17714 f44201 = new C17714();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23594 f44204 = new C23594();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f44202 = 1;

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        C17714 c17714 = this.f44211;
        C16184 c16184 = (C16184) interfaceC8424;
        c16184.mo22068(false, 0, 3, c17714.m41482());
        c17714.m41484(0);
        if (c17714.m41491() == 4607062) {
            c16184.mo22068(false, 0, 2, c17714.m41482());
            c17714.m41484(0);
            if ((c17714.m41464() & 250) == 0) {
                c16184.mo22068(false, 0, 4, c17714.m41482());
                c17714.m41484(0);
                int m41493 = c17714.m41493();
                c16184.mo22066();
                c16184.mo22067(m41493, false);
                c16184.mo22068(false, 0, 4, c17714.m41482());
                c17714.m41484(0);
                if (c17714.m41493() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f44206 = interfaceC21830;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        if (j == 0) {
            this.f44202 = 1;
            this.f44212 = false;
        } else {
            this.f44202 = 3;
        }
        this.f44203 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0005 A[SYNTHETIC] */
    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo4837(l.InterfaceC8424 r14, l.C23615 r15) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14421.mo4837(l.۠᩷ۧ, l.᩻ۢۧ):int");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C17714 m34453(InterfaceC8424 interfaceC8424) {
        int i = this.f44205;
        C17714 c17714 = this.f44201;
        if (i > c17714.m41472()) {
            c17714.m41462(0, new byte[Math.max(c17714.m41472() * 2, this.f44205)]);
        } else {
            c17714.m41484(0);
        }
        c17714.m41486(this.f44205);
        interfaceC8424.readFully(c17714.m41482(), 0, this.f44205);
        return c17714;
    }
}
