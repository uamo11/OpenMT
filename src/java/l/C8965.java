package l;

import android.widget.ListAdapter;
import android.widget.ListView;
import bin.mt.plus.R;

/* compiled from: 4646 */
/* renamed from: l.ۡܶܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8965 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8259 f27234;

    public C8965(ActivityC8259 activityC8259) {
        this.f27234 = activityC8259;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f27234, R.string.MT_Protector_res_0x7f1203b0);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C1203 c1203;
        C1203 c12032;
        C1203 c12033;
        C1203 c12034;
        C1203 c12035;
        C1203 c12036;
        C1203 c12037;
        C1203 c12038;
        ActivityC8259 activityC8259 = this.f27234;
        c1203 = activityC8259.f25415;
        int i = C16999.f52136;
        c1203.f4347 = C16999.m39862(activityC8259.getIntent());
        c12032 = activityC8259.f25415;
        c12033 = activityC8259.f25415;
        c12032.f4346 = c12033.f4347.getName();
        c12034 = activityC8259.f25415;
        c12035 = activityC8259.f25415;
        c12034.f4340 = C15206.m35971(c12035.f4347);
        c12036 = activityC8259.f25415;
        c12037 = activityC8259.f25415;
        c12036.f4344 = new int[c12037.f4340.f46672.size()];
        c12038 = activityC8259.f25415;
        c12038.f4349 = true;
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
        ListView listView4;
        ActivityC8259 activityC8259 = this.f27234;
        listView = activityC8259.f25416;
        C12609 c126094 = new C12609(new C5437(activityC8259));
        activityC8259.f25417 = c126094;
        listView.setAdapter((ListAdapter) c126094);
        listView2 = activityC8259.f25416;
        listView2.setOnScrollListener(new C9671(this));
        c12609 = activityC8259.f25417;
        listView3 = activityC8259.f25416;
        c12609.m14112(listView3);
        c126092 = activityC8259.f25417;
        c126092.m10504(true);
        c126093 = activityC8259.f25417;
        c126093.m10506();
        listView4 = activityC8259.f25416;
        listView4.setOnItemClickListener(activityC8259);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f27234.m10224((Throwable) exc, true);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
