package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 89CO */
/* renamed from: l.۫ܳܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12472 extends AbstractC10065 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC9923 f37489;

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

    public C12472(ActivityC9923 activityC9923) {
        this.f37489 = activityC9923;
    }

    @Override // l.AbstractC10065
    /* renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        ArrayList arrayList;
        arrayList = this.f37489.f29997;
        AbstractC13882 abstractC13882 = (AbstractC13882) arrayList.get(abstractC3255.getBindingAdapterPosition());
        abstractC13882.getClass();
        return abstractC13882 instanceof C7533 ? AbstractC10065.m25259(3, 0) : AbstractC10065.m25259(0, 0);
    }

    @Override // l.AbstractC10065
    /* renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC32552) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC32552.getBindingAdapterPosition();
        ActivityC9923 activityC9923 = this.f37489;
        arrayList = activityC9923.f29997;
        AbstractC13882 abstractC13882 = (AbstractC13882) arrayList.get(bindingAdapterPosition2);
        abstractC13882.getClass();
        if (abstractC13882 instanceof C17683) {
            return false;
        }
        if ((abstractC13882 instanceof C6122) && abstractC13882.mo17035().f18758 == 0) {
            return false;
        }
        arrayList2 = activityC9923.f29997;
        C6055.m16890(bindingAdapterPosition, bindingAdapterPosition2, arrayList2);
        AbstractC19902 adapter = c13132.getAdapter();
        C11003.requireNonNull(adapter);
        adapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C1802.m5991(new Runnable() { // from class: l.۬ܳܿ
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList3;
                ArrayList arrayList4 = new ArrayList();
                arrayList3 = C12472.this.f37489.f29997;
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    AbstractC13882 abstractC138822 = (AbstractC13882) it.next();
                    abstractC138822.getClass();
                    if (abstractC138822 instanceof C6122) {
                        int i = abstractC138822.mo17035().f18758;
                        if (i == 1) {
                            arrayList4.add(C19095.f60135);
                        } else if (i == 2) {
                            arrayList4.add(C9217.f27906);
                        }
                    } else if (abstractC138822 instanceof C7533) {
                        arrayList4.add(abstractC138822.mo20218().f23177);
                    }
                }
                int i2 = -1;
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList4.size()) {
                        arrayList4.add(i2 + 1, new C22350(12));
                        break;
                    }
                    String mo8778 = ((AbstractC2867) arrayList4.get(i3)).mo8778();
                    mo8778.getClass();
                    if (mo8778.equals("builtin:systemTranslate")) {
                        break;
                    }
                    if (mo8778.equals("builtin:translate")) {
                        i2 = i3;
                    }
                    i3++;
                }
                C4711.m13807(arrayList4);
                C4711.m13809();
            }
        }, this, 1000L);
        return true;
    }
}
