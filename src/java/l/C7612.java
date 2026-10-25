package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;

/* compiled from: H5HP */
/* renamed from: l.۟ܿۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7612 implements TextWatcher {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC16700 f23554;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C7612(ViewOnClickListenerC16700 viewOnClickListenerC16700) {
        this.f23554 = viewOnClickListenerC16700;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        View view;
        CheckBox checkBox;
        View view2;
        ViewOnClickListenerC16700 viewOnClickListenerC16700 = this.f23554;
        view = viewOnClickListenerC16700.f51275;
        boolean z = true;
        if (editable.length() != 0 && (editable.length() != 1 || editable.charAt(0) != '/')) {
            z = false;
        }
        view.setEnabled(z);
        checkBox = viewOnClickListenerC16700.f51276;
        view2 = viewOnClickListenerC16700.f51275;
        checkBox.setEnabled(view2.isEnabled());
    }
}
