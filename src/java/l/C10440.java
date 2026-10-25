package l;

import java.util.ArrayList;

/* compiled from: 4AWI */
/* renamed from: l.ۤܿܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10440 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0477 f31367;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10440(ActivityC0477 activityC0477, ActivityC0477 activityC04772) {
        super(activityC04772, -1);
        this.f31367 = activityC0477;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        C6659 c6659;
        ArrayList arrayList;
        String m31260 = m31260();
        if (!m31260.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C15293("…", new C11146(22), null));
            ((ArrayList) C8239.m21821()).add(new C5417(m31260, arrayList2));
            C8239.m21822();
            ActivityC0477 activityC0477 = this.f31367;
            activityC0477.m2107();
            c6659 = activityC0477.f2066;
            arrayList = activityC0477.f2064;
            c6659.m2043(arrayList.size() - 1);
        }
        m31262();
    }
}
