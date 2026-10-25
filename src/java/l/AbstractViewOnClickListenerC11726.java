package l;

import android.content.DialogInterface;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: A5PU */
/* renamed from: l.ۨ۬ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractViewOnClickListenerC11726 implements View.OnClickListener {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TextView f34984;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final TextView f34985;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f34986;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EditText f34987;

    /* renamed from: ܽ */
    public void mo16436() {
    }

    /* renamed from: ܿ */
    public abstract void mo16437();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo28626() {
    }

    public AbstractViewOnClickListenerC11726(AbstractActivityC3346 abstractActivityC3346, int i) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00de);
        this.f34984 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        this.f34985 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0397);
        EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        this.f34987 = editText;
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(m10216);
        c19258.m44428(false);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterface.OnClickListener() { // from class: l.ۤ۬ܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                AbstractViewOnClickListenerC11726.this.mo16436();
            }
        });
        if (i != -1) {
            c19258.m44440(i, (DialogInterface.OnClickListener) null);
        }
        DialogInterfaceC0206 m44415 = c19258.m44415();
        this.f34986 = m44415;
        m44415.m1435(new DialogInterface.OnCancelListener() { // from class: l.ۛ۬ܿ
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                AbstractViewOnClickListenerC11726.this.mo16436();
            }
        });
        C5088.m14637(m44415);
        C8960.m23097(m44415);
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28620() {
        this.f34986.dismiss();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m28623() {
        return this.f34987.getText().toString();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m28622() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f34986;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this);
        Button m1448 = dialogInterfaceC0206.m1448();
        if (m1448 != null) {
            m1448.setOnClickListener(new View.OnClickListener() { // from class: l.۫۬ܿ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AbstractViewOnClickListenerC11726.this.mo28626();
                }
            });
        }
        C4925.m14329(this.f34987);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28624(String str) {
        this.f34987.setText(str);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m28625() {
        this.f34987.selectAll();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28621(String str) {
        TextView textView = this.f34985;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m28627() {
        this.f34984.setText(R.string.MT_Protector_res_0x7f120306);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mo16437();
    }
}
