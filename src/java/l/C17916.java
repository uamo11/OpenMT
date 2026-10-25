package l;

/* compiled from: M1KQ */
/* renamed from: l.ᩳ۟᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17916 extends AbstractC17370 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19328 f54712;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17916(C19328 c19328, AbstractActivityC3346 abstractActivityC3346, boolean z, String str) {
        super(abstractActivityC3346, z, str, "dex_search_match_case", "dex_search_regex", "dex_search_exactly_match");
        this.f54712 = c19328;
    }

    @Override // l.AbstractC17370
    /* renamed from: ֫ */
    public final void mo5651() {
        C15798 c15798;
        C19328 c19328 = this.f54712;
        c19328.f60760 = false;
        C19328.m44529(c19328);
        c15798 = c19328.f60765;
        c15798.notifyDataSetChanged();
    }

    @Override // l.AbstractC17370
    /* renamed from: ֫ */
    public final void mo5652(C18076 c18076, String str) {
        new C17210(this.f54712, str, c18076).m20274();
    }
}
