package l;

/* compiled from: N44J */
/* renamed from: l.᩸᩷۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21827 extends AbstractC3482 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13359 f69918;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1755 f69919;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10789 f69920;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1755 f69921;

    @Override // l.AbstractC3482
    /* renamed from: ۧ */
    public final void mo10662() {
        C1365 c1365;
        Object obj = this.f69921.f6073;
        C12171.m29642(((C4893) obj).f15452.m43514() % 2 == 0);
        C18837 c18837 = ((C4893) obj).f15452;
        c1365 = this.f69918.f39962;
        c18837.m43511(Integer.valueOf(c1365.m4816()));
        mo10663();
    }

    @Override // l.AbstractC3482
    /* renamed from: ܽ */
    public final void mo10663() {
        C2735 c2735 = this.f69920.f32448;
        if (c2735 != null) {
            this.f69918.m32360(c2735, this.f69919, 2);
        }
    }

    @Override // l.AbstractC3482
    /* renamed from: ᩳ */
    public final boolean mo10664() {
        return this.f69920.f32448 != null;
    }

    @Override // l.AbstractC3482
    /* renamed from: ֫ */
    public final void mo10661() {
        C2735 c2735 = this.f69920.f32448;
        if (c2735 == null || (c2735.f8522 & 131072) == 0) {
            return;
        }
        ((C4893) this.f69921.f6073).f15450 = null;
    }

    public C21827(C13359 c13359, C1755 c1755, C10789 c10789, C1755 c17552) {
        this.f69918 = c13359;
        this.f69921 = c1755;
        this.f69920 = c10789;
        this.f69919 = c17552;
    }
}
