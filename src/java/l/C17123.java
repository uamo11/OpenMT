package l;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: 28VT */
/* renamed from: l.ܿۙܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17123 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f52467;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22062 f52468;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f52469;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public List f52470;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C17120 f52471;

    public C17123(ActivityC22062 activityC22062) {
        this.f52468 = activityC22062;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C12346 c12346;
        c12346 = this.f52468.f70694;
        c12346.m29958(true);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        List list;
        String str;
        String str2;
        C23473 c23473;
        this.f52470 = C8863.m22895();
        this.f52467 = (List) C5378.stream(C16293.m38327().m36526("keystore").mo23549(true)).filter(new C16417()).sorted(new C5626(1)).collect(C22976.toUnmodifiableList());
        ActivityC22062 activityC22062 = this.f52468;
        list = activityC22062.f70700;
        ArrayList arrayList = new ArrayList();
        arrayList.add("h1");
        if (this.f52470.isEmpty()) {
            arrayList.add("e1");
        } else {
            for (AbstractC13262 abstractC13262 : this.f52470) {
                String mo14004 = abstractC13262.mo14004();
                str = activityC22062.f70704;
                if (mo14004.equals(str)) {
                    arrayList.add("k" + abstractC13262.mo10324() + "/" + System.currentTimeMillis());
                } else {
                    arrayList.add("k" + abstractC13262.mo10324());
                }
            }
        }
        arrayList.add("h2");
        if (this.f52467.isEmpty()) {
            arrayList.add("e2");
        } else {
            for (AbstractC15440 abstractC15440 : this.f52467) {
                String name = abstractC15440.getName();
                str2 = activityC22062.f70695;
                if (name.equals(str2)) {
                    arrayList.add("f" + abstractC15440.getName() + "/" + System.currentTimeMillis());
                } else {
                    arrayList.add("f" + abstractC15440.getName());
                }
            }
        }
        this.f52469 = arrayList;
        c23473 = activityC22062.f70701;
        if (c23473 == null || list.isEmpty()) {
            return;
        }
        this.f52471 = C20649.m47228(new C17829(list, arrayList));
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C23473 c23473;
        C23473 c234732;
        C23473 c234733;
        C23473 c234734;
        List list = this.f52470;
        ActivityC22062 activityC22062 = this.f52468;
        activityC22062.f70702 = list;
        activityC22062.f70699 = this.f52467;
        activityC22062.f70700 = this.f52469;
        c23473 = activityC22062.f70701;
        if (c23473 != null) {
            c234732 = activityC22062.f70701;
            c234732.m51927();
            C17120 c17120 = this.f52471;
            if (c17120 != null) {
                c234734 = activityC22062.f70701;
                c17120.m40148(c234734);
            } else {
                c234733 = activityC22062.f70701;
                c234733.notifyDataSetChanged();
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f52468.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C12346 c12346;
        c12346 = this.f52468.f70694;
        c12346.m29958(false);
    }
}
