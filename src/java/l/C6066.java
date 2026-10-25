package l;

import android.text.Editable;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: Y6Y9 */
/* renamed from: l.ۛ۫᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6066 extends AbstractC3253 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextInputLayout f18582;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f18583;

    public C6066(TextInputLayout textInputLayout, EditText editText) {
        this.f18582 = textInputLayout;
        this.f18583 = editText;
    }

    @Override // l.AbstractC3253, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C17294.m40614(this.f18582, this.f18583);
    }
}
