package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* compiled from: N1TT */
/* renamed from: l.ܰ᩸ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC14087 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC7738 f42541;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f42542;

    public RunnableC14087(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738, TextView textView) {
        this.f42541 = viewOnLayoutChangeListenerC7738;
        this.f42542 = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738 = this.f42541;
        view = viewOnLayoutChangeListenerC7738.f23942;
        if (view.getVisibility() == 8) {
            return;
        }
        TextView textView = this.f42542;
        int intValue = ((Integer) textView.getTag()).intValue();
        if (intValue == 0) {
            view2 = viewOnLayoutChangeListenerC7738.f23942;
            view2.setVisibility(8);
            return;
        }
        textView.setText(C4925.m14327(R.string.MT_Protector_res_0x7f12015e) + " (" + intValue + MotionUtils.EASING_TYPE_FORMAT_END);
        textView.setTag(Integer.valueOf(intValue + (-1)));
        C4925.m14316(this, 1000L);
    }
}
