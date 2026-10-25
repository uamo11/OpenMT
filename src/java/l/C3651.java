package l;

import android.os.Handler;
import android.text.Editable;

/* compiled from: W5L3 */
/* renamed from: l.ۘۖۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3651 extends AbstractC3253 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC2240 f11511;

    public C3651(RunnableC2240 runnableC2240) {
        this.f11511 = runnableC2240;
    }

    @Override // l.AbstractC3253, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Handler m14324 = C4925.m14324();
        RunnableC2240 runnableC2240 = this.f11511;
        m14324.removeCallbacks(runnableC2240);
        m14324.postDelayed(runnableC2240, 300L);
    }
}
