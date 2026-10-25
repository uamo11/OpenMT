package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: 75NJ */
/* renamed from: l.۬ۚᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12912 extends AbstractC10065 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16315 f38743;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f38744 = new AtomicInteger();

    @Override // l.AbstractC10065
    /* renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
    }

    @Override // l.AbstractC10065
    /* renamed from: ܽ */
    public final boolean mo3227() {
        return false;
    }

    public C12912(ActivityC16315 activityC16315) {
        this.f38743 = activityC16315;
    }

    @Override // l.AbstractC10065
    /* renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        C16557 c16557;
        c16557 = this.f38743.f50244;
        if (!c16557.m38954() || abstractC3255.getBindingAdapterPosition() == -1) {
            return 0;
        }
        return AbstractC10065.m25259(3, 0);
    }

    @Override // l.AbstractC10065
    /* renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC32552) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i;
        int i2;
        C10091 c10091;
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC32552.getBindingAdapterPosition();
        ActivityC16315 activityC16315 = this.f38743;
        arrayList = activityC16315.f50241;
        boolean m5413 = ((C22372) arrayList.get(bindingAdapterPosition)).m5413();
        arrayList2 = activityC16315.f50241;
        if (m5413 != ((C22372) arrayList2.get(bindingAdapterPosition2)).m5413()) {
            return false;
        }
        arrayList3 = activityC16315.f50241;
        C6055.m16890(bindingAdapterPosition, bindingAdapterPosition2, arrayList3);
        i = activityC16315.f50246;
        if (i == bindingAdapterPosition) {
            activityC16315.f50246 = bindingAdapterPosition2;
        } else {
            i2 = activityC16315.f50246;
            if (i2 == bindingAdapterPosition2) {
                activityC16315.f50246 = bindingAdapterPosition;
            }
        }
        activityC16315.m38441();
        c10091 = activityC16315.f50247;
        c10091.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        activityC16315.m38423();
        final int incrementAndGet = this.f38744.incrementAndGet();
        C4925.m14316(new Runnable() { // from class: l.ۗۚᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C12912 c12912 = C12912.this;
                if (incrementAndGet == c12912.f38744.get()) {
                    c12912.f38743.m38432();
                }
            }
        }, 300L);
        return true;
    }
}
