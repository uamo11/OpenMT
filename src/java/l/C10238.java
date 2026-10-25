package l;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: 31K1 */
/* renamed from: l.ۤۤ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10238 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f30859;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f30860;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16688 f30861;

    public C10238(ActivityC17169 activityC17169, AbstractC15440 abstractC15440, C16688 c16688) {
        this.f30860 = activityC17169;
        this.f30859 = abstractC15440;
        this.f30861 = c16688;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f30860);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C11005 c11005;
        ActivityC17169 activityC17169 = this.f30860;
        c11005 = activityC17169.f52620;
        C12395.m30552(this.f30859, c11005.m27340());
        activityC17169.f52610 = true;
        activityC17169.m40322(false);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedList linkedList;
        C11649 c11649;
        C11649 c116492;
        ActivityC17169 activityC17169 = this.f30860;
        AbstractC5180 m2843 = activityC17169.m2843();
        if (m2843.m14886()) {
            return;
        }
        arrayList = activityC17169.f52616;
        int indexOf = arrayList.indexOf(this.f30861);
        if (indexOf == -1) {
            return;
        }
        C4966 c4966 = new C4966();
        arrayList2 = activityC17169.f52616;
        AbstractC14346 abstractC14346 = (AbstractC14346) arrayList2.set(indexOf, c4966);
        AbstractC16882 m14900 = m2843.m14900();
        m14900.m39678(0, 0);
        m14900.mo39690(abstractC14346);
        m14900.m39682(c4966, "000000-0000-0000-0000-000000000001");
        m14900.mo39689();
        linkedList = activityC17169.f52603;
        linkedList.remove("000000-0000-0000-0000-000000000002");
        c11649 = activityC17169.f52613;
        if (c11649 != null) {
            c116492 = activityC17169.f52613;
            c116492.notifyItemChanged(indexOf);
        }
        C11005 m40356 = activityC17169.m40356();
        abstractC14346.m34233(m40356).m27333();
        C5753.m16200(abstractC14346.m34236(m40356).m27340()).m10915((InterfaceC21423) new C12354());
        abstractC14346.m34226(m40356).m27333();
        activityC17169.m40331();
        ActivityC17169.m40337(activityC17169);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f30860.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f30860.f52598 = false;
        m20273();
    }
}
