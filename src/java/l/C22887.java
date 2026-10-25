package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: 31PG */
/* renamed from: l.᩺ۡۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22887 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC13714 f73806;

    public C22887(ViewOnClickListenerC13714 viewOnClickListenerC13714) {
        this.f73806 = viewOnClickListenerC13714;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f73806.f40922, R.string.MT_Protector_res_0x7f12087c);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        ViewOnClickListenerC13714 viewOnClickListenerC13714 = this.f73806;
        C16742 c16742 = viewOnClickListenerC13714.f40919;
        if (c16742.f51388 != -1) {
            int i = C1926.f6460;
            if (C15972.m37751()) {
                throw new C1637(C1575.m5392(new C23881(2), R.string.MT_Protector_res_0x7f120520));
            }
            if (C15972.m37767()) {
                throw new C1637(C1575.m5392(new C23881(1702), R.string.MT_Protector_res_0x7f120520));
            }
            C18237 m42480 = C18237.m42480(4167);
            m42480.m42490(c16742.f51388);
            C23881 m42496 = m42480.m42496();
            if (!m42496.m52607()) {
                throw new C1637(C1575.m5392(m42496, R.string.MT_Protector_res_0x7f120520));
            }
        }
        C17448.m40799(viewOnClickListenerC13714.f40919).mo23552();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        List list;
        List list2;
        C15831 c15831;
        List list3;
        List list4;
        List list5;
        C15831 c158312;
        ViewOnClickListenerC13714 viewOnClickListenerC13714 = this.f73806;
        ActivityC7365 activityC7365 = viewOnClickListenerC13714.f40922;
        C16742 c16742 = viewOnClickListenerC13714.f40919;
        if (c16742.f51388 == -1) {
            ServiceC8982.f27296.add(c16742.f51390);
            list4 = activityC7365.f22625;
            int indexOf = list4.indexOf(viewOnClickListenerC13714.f40919);
            if (indexOf == -1) {
                new C13735(activityC7365).m20274();
                return;
            }
            list5 = activityC7365.f22625;
            ArrayList arrayList = new ArrayList(list5);
            arrayList.remove(indexOf);
            activityC7365.f22625 = C20195.unmodifiableList(arrayList);
            c158312 = activityC7365.f22624;
            c158312.notifyItemRemoved(indexOf);
            return;
        }
        list = activityC7365.f22617;
        int indexOf2 = list.indexOf(viewOnClickListenerC13714.f40919);
        if (indexOf2 == -1) {
            new C13735(activityC7365).m20274();
            return;
        }
        list2 = activityC7365.f22617;
        ArrayList arrayList2 = new ArrayList(list2);
        arrayList2.remove(indexOf2);
        activityC7365.f22617 = C20195.unmodifiableList(arrayList2);
        c15831 = activityC7365.f22624;
        list3 = activityC7365.f22625;
        c15831.notifyItemRemoved(list3.size() + indexOf2);
        new RunnableC19361(activityC7365);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (!(exc instanceof C1637) && !(exc instanceof C19401)) {
            this.f73806.f40922.m10223(exc, (DialogInterface.OnDismissListener) null);
        } else {
            C21374.m48459((CharSequence) exc.getMessage());
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
