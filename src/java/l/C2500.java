package l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;

/* compiled from: A9BS */
/* renamed from: l.ۖۨ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2500 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20845 f7959;

    public C2500(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f7959 = new C8850(view);
        } else {
            this.f7959 = new C20845(view);
        }
    }

    @Deprecated
    public C2500(WindowInsetsController windowInsetsController) {
        this.f7959 = new C8850(windowInsetsController);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7998() {
        this.f7959.mo22868();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7997() {
        this.f7959.mo22867();
    }
}
