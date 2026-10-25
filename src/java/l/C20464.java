package l;

import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.Set;

/* compiled from: P676 */
/* renamed from: l.᩶᩹ܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20464 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f65972;

    public C20464(ActivityC21107 activityC21107) {
        this.f65972 = activityC21107;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f65972, R.string.MT_Protector_res_0x7f1203b0);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C18284 c18284;
        C18284 c182842;
        C18284 c182843;
        C18284 c182844;
        C18284 c182845;
        C18284 c182846;
        C18284 c182847;
        C18284 c182848;
        ActivityC21107 activityC21107 = this.f65972;
        c18284 = activityC21107.f68093;
        int i = C16999.f52136;
        c18284.f56842 = C16999.m39862(activityC21107.getIntent());
        c182842 = activityC21107.f68093;
        c182843 = activityC21107.f68093;
        c182842.f56840 = new C3454(c182843.f56842.mo27926());
        c182844 = activityC21107.f68093;
        Iterator it = c182844.f56840.f10940.m25236().iterator();
        while (it.hasNext()) {
            C11258 c11258 = (C11258) it.next();
            String m36561 = C15472.m36561(1, 1, c11258.m27862().m50835());
            c182848 = activityC21107.f68093;
            c182848.f56832.put(m36561, c11258);
        }
        c182845 = activityC21107.f68093;
        c182846 = activityC21107.f68093;
        Set keySet = c182846.f56832.keySet();
        C14755 c14755 = new C14755();
        c14755.f45069 = new C23928(activityC21107, "", "", null);
        c14755.m35066(keySet);
        c182845.f56847 = c14755;
        ActivityC21107.m48062(activityC21107);
        c182847 = activityC21107.f68093;
        c182847.f56848 = true;
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        ListView listView;
        ListView listView2;
        C12609 c12609;
        ListView listView3;
        C12609 c126092;
        C12609 c126093;
        ActivityC21107 activityC21107 = this.f65972;
        listView = activityC21107.f68089;
        C12609 c126094 = new C12609(new C7763(activityC21107));
        activityC21107.f68092 = c126094;
        listView.setAdapter((ListAdapter) c126094);
        listView2 = activityC21107.f68089;
        listView2.setOnScrollListener(new C22580(this));
        c12609 = activityC21107.f68092;
        listView3 = activityC21107.f68089;
        c12609.m14112(listView3);
        c126092 = activityC21107.f68092;
        c126092.m10504(true);
        c126093 = activityC21107.f68092;
        c126093.m10506();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f65972.m10224((Throwable) exc, true);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
