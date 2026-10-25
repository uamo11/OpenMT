package l;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.connect.common.AssistActivity;

/* compiled from: 51RR */
/* renamed from: l.ᩳܶۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnTouchListenerC18128 implements View.OnTouchListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AssistActivity f56406;

    public ViewOnTouchListenerC18128(AssistActivity assistActivity) {
        this.f56406 = assistActivity;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        AssistActivity assistActivity = this.f56406;
        str = assistActivity.f892;
        C9145.m23519(str, "-->finish by touch");
        assistActivity.finish();
        return false;
    }
}
