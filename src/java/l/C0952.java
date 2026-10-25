package l;

import android.content.DialogInterface;
import android.widget.TextView;
import java.util.List;

/* compiled from: A91T */
/* renamed from: l.֨ۜۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0952 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC15062 f3580;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f3581;

    public C0952(ActivityC15062 activityC15062, boolean z) {
        this.f3580 = activityC15062;
        this.f3581 = z;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        TextView textView;
        C12346 c12346;
        ActivityC15062 activityC15062 = this.f3580;
        textView = activityC15062.f45989;
        textView.setVisibility(8);
        c12346 = activityC15062.f45990;
        c12346.m29958(true);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        this.f3580.f45986 = C13651.m32800(this.f3581);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C13132 c13132;
        c13132 = this.f3580.f45987;
        c13132.getAdapter().notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f3580.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C12346 c12346;
        List list;
        TextView textView;
        ActivityC15062 activityC15062 = this.f3580;
        c12346 = activityC15062.f45990;
        c12346.m29958(false);
        list = activityC15062.f45986;
        if (list.isEmpty()) {
            textView = activityC15062.f45989;
            textView.setVisibility(0);
        }
    }
}
