package l;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: 05XT */
/* renamed from: l.֨ۜᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0959 implements TextWatcher {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8015 f3614;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C0959(ViewOnClickListenerC8015 viewOnClickListenerC8015) {
        this.f3614 = viewOnClickListenerC8015;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        EditText editText;
        EditText editText2;
        EditText editText3;
        EditText editText4;
        EditText editText5;
        C23537 c23537;
        C23537 c235372;
        String obj = editable.toString();
        boolean m24990 = C9896.m24990(obj);
        ViewOnClickListenerC8015 viewOnClickListenerC8015 = this.f3614;
        if (m24990) {
            int m24993 = C9896.m24993(obj);
            c23537 = viewOnClickListenerC8015.f24747;
            if (m24993 < c23537.f75574.mo2878()) {
                c235372 = viewOnClickListenerC8015.f24747;
                str = c235372.f75574.m46622(m24993);
                if (str == null && !str.isEmpty()) {
                    editText3 = viewOnClickListenerC8015.f24745;
                    editText3.setText(str);
                    editText4 = viewOnClickListenerC8015.f24745;
                    editText4.setEnabled(false);
                    editText5 = viewOnClickListenerC8015.f24745;
                    editText5.setAlpha(0.5f);
                    return;
                }
                editText = viewOnClickListenerC8015.f24745;
                editText.setEnabled(true);
                editText2 = viewOnClickListenerC8015.f24745;
                editText2.setAlpha(1.0f);
            }
        }
        str = null;
        if (str == null) {
        }
        editText = viewOnClickListenerC8015.f24745;
        editText.setEnabled(true);
        editText2 = viewOnClickListenerC8015.f24745;
        editText2.setAlpha(1.0f);
    }
}
