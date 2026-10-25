package l;

import java.util.List;

/* compiled from: P8UK */
/* renamed from: l.ۖۡۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2428 implements InterfaceC1368 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f7746;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f7748;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC8424 f7749;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C19362 f7750;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f7751;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13530 f7752;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2633 f7753;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f7754;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17714 f7747 = new C17714(2);

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f7755 = -1;

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
        C16184 c16184 = (C16184) interfaceC8424;
        if (m7863(c16184) == 65496) {
            int m7863 = m7863(c16184);
            this.f7751 = m7863;
            if (m7863 == 65504) {
                C17714 c17714 = this.f7747;
                c17714.m41481(2);
                c16184.mo22068(false, 0, 2, c17714.m41482());
                c16184.mo22067(c17714.m41464() - 2, false);
                this.f7751 = m7863(c16184);
            }
            if (this.f7751 == 65505) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f7746 = interfaceC21830;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0177  */
    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo4837(l.InterfaceC8424 r23, l.C23615 r24) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2428.mo4837(l.۠᩷ۧ, l.᩻ۢۧ):int");
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        if (j == 0) {
            this.f7748 = 0;
            this.f7752 = null;
        } else if (this.f7748 == 5) {
            C13530 c13530 = this.f7752;
            c13530.getClass();
            c13530.mo4839(j, j2);
        }
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4838() {
        C13530 c13530 = this.f7752;
        if (c13530 != null) {
            c13530.getClass();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m7863(C16184 c16184) {
        C17714 c17714 = this.f7747;
        c17714.m41481(2);
        c16184.mo22068(false, 0, 2, c17714.m41482());
        return c17714.m41464();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m7864() {
        InterfaceC21830 interfaceC21830 = this.f7746;
        interfaceC21830.getClass();
        interfaceC21830.mo3431();
        this.f7746.mo3430(new C20794(-9223372036854775807L));
        this.f7748 = 6;
    }
}
