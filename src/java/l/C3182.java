package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: 31K1 */
/* renamed from: l.ۗۤ᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3182 extends AbstractC10065 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f10039;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f10040 = new AtomicInteger();

    @Override // l.AbstractC10065
    /* renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
    }

    @Override // l.AbstractC10065
    /* renamed from: ܽ */
    public final boolean mo3227() {
        return false;
    }

    public C3182(ActivityC17169 activityC17169) {
        this.f10039 = activityC17169;
    }

    @Override // l.AbstractC10065
    /* renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        C16557 c16557;
        ArrayList arrayList;
        ActivityC17169 activityC17169 = this.f10039;
        c16557 = activityC17169.f52599;
        if (!c16557.m38954() || abstractC3255.getBindingAdapterPosition() == -1) {
            return 0;
        }
        arrayList = activityC17169.f52616;
        return AbstractC10065.m25259(ActivityC17169.m40323(activityC17169, (AbstractC14346) arrayList.get(abstractC3255.getBindingAdapterPosition())) ? 3 : 0, 0);
    }

    @Override // l.AbstractC10065
    /* renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC32552) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i;
        int i2;
        C11649 c11649;
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC32552.getBindingAdapterPosition();
        ActivityC17169 activityC17169 = this.f10039;
        arrayList = activityC17169.f52616;
        if (!ActivityC17169.m40323(activityC17169, (AbstractC14346) arrayList.get(bindingAdapterPosition2))) {
            return false;
        }
        arrayList2 = activityC17169.f52616;
        boolean m34230 = ((AbstractC14346) arrayList2.get(bindingAdapterPosition)).m34230();
        arrayList3 = activityC17169.f52616;
        if (m34230 != ((AbstractC14346) arrayList3.get(bindingAdapterPosition2)).m34230()) {
            return false;
        }
        arrayList4 = activityC17169.f52616;
        C6055.m16890(bindingAdapterPosition, bindingAdapterPosition2, arrayList4);
        i = activityC17169.f52618;
        if (i == bindingAdapterPosition) {
            activityC17169.f52618 = bindingAdapterPosition2;
        } else {
            i2 = activityC17169.f52618;
            if (i2 == bindingAdapterPosition2) {
                activityC17169.f52618 = bindingAdapterPosition;
            }
        }
        c11649 = activityC17169.f52613;
        c11649.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        activityC17169.m40296();
        final int incrementAndGet = this.f10040.incrementAndGet();
        C4925.m14316(new Runnable() { // from class: l.ۙۤ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C3182 c3182 = C3182.this;
                if (incrementAndGet == c3182.f10040.get()) {
                    c3182.f10039.m40331();
                }
            }
        }, 300L);
        return true;
    }
}
