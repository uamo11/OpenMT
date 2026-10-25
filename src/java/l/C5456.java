package l;

import java.util.List;

/* compiled from: 47JB */
/* renamed from: l.ۚܺܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5456 extends AbstractC10065 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3339 f16983;

    @Override // l.AbstractC10065
    /* renamed from: ۧ */
    public final boolean mo3225() {
        return false;
    }

    @Override // l.AbstractC10065
    /* renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
    }

    @Override // l.AbstractC10065
    /* renamed from: ܽ */
    public final boolean mo3227() {
        return false;
    }

    public C5456(ActivityC3339 activityC3339) {
        this.f16983 = activityC3339;
    }

    @Override // l.AbstractC10065
    /* renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        return AbstractC10065.m25259(3, 0);
    }

    @Override // l.AbstractC10065
    /* renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC32552) {
        List list;
        List list2;
        C15332 c15332;
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC32552.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0 || bindingAdapterPosition2 < 0) {
            return false;
        }
        list = this.f16983.f10555;
        synchronized (list) {
            list2 = this.f16983.f10555;
            C6055.m16890(bindingAdapterPosition, bindingAdapterPosition2, list2);
        }
        c15332 = this.f16983.f10557;
        c15332.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C10395.m26219();
        return true;
    }
}
