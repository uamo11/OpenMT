package l;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: 192I */
/* renamed from: l.ۡۗܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8616 implements TextWatcher {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC3677 f26320;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C8616(DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677) {
        this.f26320 = dialogInterfaceOnClickListenerC3677;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        EditText editText;
        EditText editText2;
        EditText editText3;
        EditText editText4;
        C10539 c10539;
        boolean z2;
        DialogInterfaceC0206 dialogInterfaceC0206;
        DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677 = this.f26320;
        z = dialogInterfaceOnClickListenerC3677.f11612;
        if (z) {
            return;
        }
        try {
            editText = dialogInterfaceOnClickListenerC3677.f11618;
            int parseInt = Integer.parseInt(editText.getText().toString());
            editText2 = dialogInterfaceOnClickListenerC3677.f11616;
            int parseInt2 = Integer.parseInt(editText2.getText().toString());
            editText3 = dialogInterfaceOnClickListenerC3677.f11615;
            int parseInt3 = Integer.parseInt(editText3.getText().toString());
            editText4 = dialogInterfaceOnClickListenerC3677.f11617;
            int parseInt4 = Integer.parseInt(editText4.getText().toString());
            if (parseInt >= 0 && parseInt <= 100 && parseInt2 >= 0 && parseInt2 <= 255 && parseInt3 >= 0 && parseInt3 <= 255 && parseInt4 >= 0 && parseInt4 <= 255) {
                int argb = Color.argb(Math.round((parseInt * 255) / 100.0f), parseInt2, parseInt3, parseInt4);
                c10539 = dialogInterfaceOnClickListenerC3677.f11619;
                c10539.m26466(argb);
                dialogInterfaceOnClickListenerC3677.m11190(argb, false);
                z2 = dialogInterfaceOnClickListenerC3677.f11621;
                if (z2) {
                    dialogInterfaceC0206 = dialogInterfaceOnClickListenerC3677.f11613;
                    dialogInterfaceOnClickListenerC3677.f11621 = false;
                    dialogInterfaceC0206.m1441(false);
                }
            }
        } catch (Exception unused) {
        }
    }
}
