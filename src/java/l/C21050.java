package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputLayoutHelper;

/* compiled from: Y96B */
/* renamed from: l.᩷ᩳ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21050 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        if (c2450.m7916("local") && !c2450.m7923()) {
            return c2450.m7911();
        }
        return false;
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        Main m7917 = c2450.m7917();
        View m10216 = m7917.m10216(R.layout.MT_Protector_res_0x7f0d00a4);
        final TextInputLayout textInputLayout = (TextInputLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d0);
        final TextInputLayout textInputLayout2 = (TextInputLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d2);
        C10309.m26062(textInputLayout);
        C10309.m26062(textInputLayout2);
        final View.OnClickListener endIconDelegateOnClickListener = TextInputLayoutHelper.getEndIconDelegateOnClickListener(textInputLayout);
        textInputLayout.setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ᩳᩳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                endIconDelegateOnClickListener.onClick(view);
                boolean hasPasswordTransformation = TextInputLayoutHelper.hasPasswordTransformation(textInputLayout);
                TextInputLayout textInputLayout3 = textInputLayout2;
                if (hasPasswordTransformation) {
                    textInputLayout3.setVisibility(0);
                } else {
                    textInputLayout3.setVisibility(8);
                }
            }
        });
        final CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d9);
        final C14698 c14698 = new C14698();
        c14698.m34990();
        checkBox.setText(m7917.getResources().getQuantityString(R.plurals.MT_Protector_res_0x7f110000, c2450.m7918()));
        checkBox.setChecked(c14698.f44893);
        if (c14698.f44894) {
            TextInputLayoutHelper.setPasswordTransformation(textInputLayout, false);
            textInputLayout2.setVisibility(8);
        }
        C19258 buildDialog = m7917.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        C4925.m14329(textInputLayout.getEditText());
        m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܿᩳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextInputLayout textInputLayout3 = TextInputLayout.this;
                EditText editText = textInputLayout3.getEditText();
                C11003.requireNonNull(editText);
                TextInputLayout textInputLayout4 = textInputLayout2;
                EditText editText2 = textInputLayout4.getEditText();
                C11003.requireNonNull(editText2);
                String obj = editText.getText().toString();
                if (obj.isEmpty()) {
                    textInputLayout3.setError(C4925.m14327(R.string.MT_Protector_res_0x7f120305));
                    editText.requestFocus();
                    return;
                }
                boolean z = textInputLayout4.getVisibility() == 8;
                if (!z && !obj.equals(editText2.getText().toString())) {
                    textInputLayout4.setError(C4925.m14327(R.string.MT_Protector_res_0x7f120ae6));
                    editText2.selectAll();
                    editText2.requestFocus();
                    return;
                }
                m44438.dismiss();
                C14698 c146982 = c14698;
                boolean z2 = c146982.f44893;
                CheckBox checkBox2 = checkBox;
                if (z2 != checkBox2.isChecked() || c146982.f44894 != z) {
                    c146982.f44893 = checkBox2.isChecked();
                    c146982.f44894 = z;
                    c146982.m34991();
                }
                int i = C15104.f46193;
                C0994 c0994 = new C0994(C6938.class);
                C2450 c24502 = c2450;
                c0994.m3486(c24502);
                c0994.m3478(c24502.m7909());
                c0994.m3474("password", obj);
                c0994.m3475("removeSource", checkBox2.isChecked());
                c0994.m3469();
            }
        });
    }
}
