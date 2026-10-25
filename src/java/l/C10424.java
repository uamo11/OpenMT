package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;

/* compiled from: 795C */
/* renamed from: l.ۤܽ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10424 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        if (!c2450.m7916("local")) {
            return false;
        }
        C16560 m7919 = c2450.m7919();
        if (c2450.m7916("local")) {
            return c2450.m7918() == 1 || !(!m7919.m39035("local") || m7919.m39038() || c2450.m7914().equals(m7919.m38991()));
        }
        return false;
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        c2450.m7907("local");
        if (c2450.m7918() != 1) {
            m7919.m38998("local");
            m5602(c2450, R.string.MT_Protector_res_0x7f120a89, AbstractC1661.m5600(c2450, R.string.MT_Protector_res_0x7f1205e8));
            return;
        }
        AbstractC15440 mo24433 = c2450.m7913().mo24433();
        View m10216 = c2450.m7917().m10216(R.layout.MT_Protector_res_0x7f0d0090);
        final EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        final EditText editText2 = (EditText) m10216.findViewById(R.id.editText2);
        final EditText editText3 = (EditText) m10216.findViewById(R.id.editText3);
        final TextInputLayout textInputLayout = (TextInputLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d0);
        TextInputLayout textInputLayout2 = (TextInputLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d2);
        C10309.m26062(textInputLayout);
        final C16560 m79192 = c2450.m7919();
        if (!m79192.m39035("local") || m79192.m39038() || c2450.m7914().equals(m79192.m38991())) {
            editText.setText(mo24433.m36517() + "-link" + mo24433.m36505());
            editText2.setText(c2450.m7926());
        } else {
            editText.setText(mo24433.getName());
            editText2.setText(m79192.m39058());
            textInputLayout2.setEndIconMode(-1);
            textInputLayout2.setEndIconDrawable(R.drawable.MT_Protector_res_0x7f080221);
            textInputLayout2.setEndIconOnClickListener(new ViewOnClickListenerC2098(c2450, m79192, editText2));
        }
        editText3.setText(mo24433.mo32031());
        C19258 buildDialog = c2450.m7917().buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120a89);
        buildDialog.m44421(m10216);
        final DialogInterfaceC0206 m19253 = C7187.m19253(buildDialog, R.string.MT_Protector_res_0x7f12070a, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        m19253.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ۗܽ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogInterfaceC0206 dialogInterfaceC0206 = m19253;
                C16560 c16560 = m79192;
                C2450 c24502 = c2450;
                String obj = editText.getText().toString();
                String obj2 = editText2.getText().toString();
                String obj3 = editText3.getText().toString();
                AbstractC15440 m39866 = C16999.m39866(C9523.m24393(obj2, obj), new String[0]);
                if (m39866.mo23120()) {
                    textInputLayout.setError(C4925.m14327(R.string.MT_Protector_res_0x7f1203a1));
                    return;
                }
                try {
                    m39866.mo35195();
                    m39866.mo27934(obj3);
                    dialogInterfaceC0206.dismiss();
                    if (c16560.m39035("local") && !c16560.m39038() && obj2.equals(c16560.m39058())) {
                        c16560.m39053(m39866.getName());
                        c16560.m39015();
                    } else {
                        c24502.m7921().m39053(m39866.getName());
                        c24502.m7921().m39033(obj2, true);
                    }
                    C15528.m36596();
                    dialogInterfaceC0206.dismiss();
                } catch (IOException e) {
                    c24502.m7917().m10223(e, (DialogInterface.OnDismissListener) null);
                }
            }
        });
    }

    @Override // l.AbstractC1661
    /* renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        m7919.m38998("local");
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C12540.class);
        c0994.m3478(c2450.m7909());
        c0994.m3484(c2450);
        c0994.m3474("targetPath", m7919.m39058());
        c0994.m3469();
    }
}
