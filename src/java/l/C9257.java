package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* compiled from: D1Y9 */
/* renamed from: l.ۢ֨ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9257 implements TextWatcher {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8551 f28053;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C9257(ViewOnClickListenerC8551 viewOnClickListenerC8551) {
        this.f28053 = viewOnClickListenerC8551;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextView textView;
        TextView textView2;
        ViewOnClickListenerC8551 viewOnClickListenerC8551 = this.f28053;
        textView = viewOnClickListenerC8551.f26145;
        if (textView.getVisibility() == 0) {
            textView2 = viewOnClickListenerC8551.f26145;
            textView2.setVisibility(8);
        }
    }
}
