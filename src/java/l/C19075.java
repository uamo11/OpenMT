package l;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: G4ML */
/* renamed from: l.ᩴ᩺ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19075 implements TextWatcher {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15545 f60062;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C19075(C15545 c15545) {
        this.f60062 = c15545;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C1082 c1082;
        HandlerC0912 handlerC0912;
        HandlerC0912 handlerC09122;
        C15545 c15545 = this.f60062;
        c15545.m36659();
        if (c15545.m36691()) {
            c1082 = c15545.f47922;
            c1082.m3717();
            handlerC0912 = c15545.f47936;
            handlerC0912.removeMessages(0);
            handlerC09122 = c15545.f47936;
            handlerC09122.sendEmptyMessageDelayed(0, 100L);
        }
    }
}
