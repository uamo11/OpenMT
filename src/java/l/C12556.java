package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: 4AWI */
/* renamed from: l.۫ܿܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12556 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37856;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0477 f37857;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12556(ActivityC0477 activityC0477, ActivityC0477 activityC04772, int i) {
        super(activityC04772, -1);
        this.f37857 = activityC0477;
        this.f37856 = i;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        C6659 c6659;
        String m31260 = m31260();
        if (!m31260.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C15293("…", new C11146(22), null));
            List m21821 = C8239.m21821();
            int i = this.f37856 + 1;
            ((ArrayList) m21821).add(i, new C5417(m31260, arrayList));
            C8239.m21822();
            ActivityC0477 activityC0477 = this.f37857;
            activityC0477.m2107();
            c6659 = activityC0477.f2066;
            c6659.m2043(i);
        }
        m31262();
    }
}
