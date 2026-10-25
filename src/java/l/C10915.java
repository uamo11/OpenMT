package l;

import android.view.View;
import bin.mt.plus.R;

/* compiled from: K1PX */
/* renamed from: l.ۧۢۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10915 extends AbstractC12014 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC8092 f32790;

    @Override // l.AbstractC12014
    /* renamed from: ֫ */
    public final boolean mo11915(View view, Object obj) {
        return view == obj;
    }

    @Override // l.AbstractC12014
    /* renamed from: ۧ */
    public final int mo11916() {
        return 2;
    }

    public C10915(ActivityC8092 activityC8092) {
        this.f32790 = activityC8092;
    }

    @Override // l.AbstractC12014
    /* renamed from: ֫ */
    public final CharSequence mo11912(int i) {
        return this.f32790.getString(i == 0 ? R.string.MT_Protector_res_0x7f120085 : R.string.MT_Protector_res_0x7f120086);
    }

    @Override // l.AbstractC12014
    /* renamed from: ֫ */
    public final Object mo11913(C0452 c0452, int i) {
        C17264 c17264;
        C13132 c13132;
        C2448 c2448;
        ActivityC8092 activityC8092 = this.f32790;
        if (i == 0) {
            c2448 = activityC8092.f24925;
            c13132 = c2448.f7826;
        } else {
            c17264 = activityC8092.f24926;
            c13132 = c17264.f52917;
        }
        c0452.addView(c13132);
        return c13132;
    }

    @Override // l.AbstractC12014
    /* renamed from: ֫ */
    public final void mo11914(C0452 c0452, int i, Object obj) {
        C17264 c17264;
        C13132 c13132;
        C2448 c2448;
        ActivityC8092 activityC8092 = this.f32790;
        if (i == 0) {
            c2448 = activityC8092.f24925;
            c13132 = c2448.f7826;
        } else {
            c17264 = activityC8092.f24926;
            c13132 = c17264.f52917;
        }
        c0452.removeView(c13132);
    }
}
