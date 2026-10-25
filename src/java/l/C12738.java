package l;

import android.content.DialogInterface;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: 88W8 */
/* renamed from: l.۫᩻ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12738 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6388 f38306;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f38307;

    public C12738(ActivityC6388 activityC6388, boolean z) {
        this.f38306 = activityC6388;
        this.f38307 = z;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        TextView textView;
        C12346 c12346;
        ActivityC6388 activityC6388 = this.f38306;
        textView = activityC6388.f19761;
        textView.setVisibility(8);
        c12346 = activityC6388.f19762;
        c12346.m29958(true);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        this.f38306.f19758 = (List) C5378.stream(C13651.m32800(this.f38307)).filter(new C0065(4)).collect(C22976.toList());
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        List list;
        C13132 c13132;
        TextView textView;
        ActivityC6388 activityC6388 = this.f38306;
        list = activityC6388.f19758;
        if (list.isEmpty()) {
            textView = activityC6388.f19761;
            textView.setText(R.string.MT_Protector_res_0x7f120a9c);
        }
        c13132 = activityC6388.f19759;
        c13132.getAdapter().notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        TextView textView;
        ActivityC6388 activityC6388 = this.f38306;
        textView = activityC6388.f19761;
        textView.setText(R.string.MT_Protector_res_0x7f12051e);
        activityC6388.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C12346 c12346;
        List list;
        TextView textView;
        ActivityC6388 activityC6388 = this.f38306;
        c12346 = activityC6388.f19762;
        c12346.m29958(false);
        list = activityC6388.f19758;
        if (list.isEmpty()) {
            textView = activityC6388.f19761;
            textView.setVisibility(0);
        }
    }
}
