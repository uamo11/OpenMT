package l;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: YALU */
/* renamed from: l.ۢۨܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class HandlerC9570 extends Handler {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f29027;

    public HandlerC9570(TextView textView) {
        this.f29027 = new WeakReference(textView);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        View view = (View) this.f29027.get();
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat.addListener(new C20859(view));
            ofFloat.setDuration(150L);
            ofFloat.start();
        }
    }
}
