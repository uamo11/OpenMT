package l;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: V8VP */
/* renamed from: l.ۡۤᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8824 implements TextWatcher {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3885 f26898;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C8824(C3885 c3885) {
        this.f26898 = c3885;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C1082 c1082;
        C1082 c10822;
        HandlerC0912 handlerC0912;
        HandlerC0912 handlerC09122;
        C3885 c3885 = this.f26898;
        if (c3885.m11749()) {
            c1082 = c3885.f12410;
            c1082.m3717();
            c10822 = c3885.f12415;
            c10822.m3717();
            handlerC0912 = c3885.f12417;
            handlerC0912.removeMessages(0);
            handlerC09122 = c3885.f12417;
            handlerC09122.sendEmptyMessageDelayed(0, 100L);
        }
    }
}
