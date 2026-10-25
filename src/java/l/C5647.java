package l;

/* compiled from: P676 */
/* renamed from: l.ۚ᩹ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5647 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f17432;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5647(ActivityC21107 activityC21107, ActivityC21107 activityC211072) {
        super(activityC211072, -1);
        this.f17432 = activityC21107;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        C18284 c18284;
        C18284 c182842;
        C12609 c12609;
        ActivityC21107 activityC21107 = this.f17432;
        c18284 = activityC21107.f68093;
        C11467[] c11467Arr = c18284.f56839;
        c182842 = activityC21107.f68093;
        c11467Arr[c182842.f56838].m28272(m31260());
        ActivityC21107.f68088 = true;
        c12609 = activityC21107.f68092;
        c12609.notifyDataSetChanged();
        m31262();
    }
}
