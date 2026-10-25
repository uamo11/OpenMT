package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.open.TDialog;

/* compiled from: 51RR */
/* renamed from: l.ܺܶۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC16010 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TDialog f49388;

    public RunnableC16010(TDialog tDialog) {
        this.f49388 = tDialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View decorView;
        View childAt;
        Window window = this.f49388.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null || (childAt = ((ViewGroup) decorView).getChildAt(0)) == null) {
            return;
        }
        childAt.setPadding(0, 0, 0, 0);
    }
}
