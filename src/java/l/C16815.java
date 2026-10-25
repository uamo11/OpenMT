package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: J951 */
/* renamed from: l.ܽᩳ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16815 extends AbstractC1661 {
    public C16815() {
        super(R.string.MT_Protector_res_0x7f120a8b, -1);
    }

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
        final Main m7917 = c2450.m7917();
        View m10216 = m7917.m10216(R.layout.MT_Protector_res_0x7f0d00a4);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f120a8b);
        final TextInputLayout textInputLayout = (TextInputLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d0);
        C10309.m26062(textInputLayout);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d2).setVisibility(8);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2).setVisibility(8);
        final CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d9);
        final C14698 c14698 = new C14698();
        c14698.m34990();
        checkBox.setText(m7917.getResources().getQuantityString(R.plurals.MT_Protector_res_0x7f110000, c2450.m7918()));
        checkBox.setChecked(c14698.f44892);
        C19258 buildDialog = m7917.buildDialog();
        buildDialog.m44421(m10216);
        final DialogInterfaceC0206 m19253 = C7187.m19253(buildDialog, R.string.MT_Protector_res_0x7f12070a, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        C4925.m14329(textInputLayout.getEditText());
        m19253.m1447().setOnClickListener(new View.OnClickListener(this) { // from class: l.ۨܽ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextInputLayout textInputLayout2 = textInputLayout;
                EditText editText = textInputLayout2.getEditText();
                C11003.requireNonNull(editText);
                String obj = editText.getText().toString();
                if (obj.isEmpty()) {
                    textInputLayout2.setError(C4925.m14327(R.string.MT_Protector_res_0x7f120305));
                    editText.requestFocus();
                } else {
                    view.setEnabled(false);
                    new C13950(m7917, c2450, obj, m19253, c14698, checkBox, view, textInputLayout2, editText).m20274();
                }
            }
        });
    }
}
