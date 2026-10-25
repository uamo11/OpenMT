package l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: P5WS */
/* renamed from: l.ܶۜᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC15069 implements View.OnClickListener, TextWatcher {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EditText f46038;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f46039 = true;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C23537 f46040;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TextView f46041;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public View f46042;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public EditText f46043;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f46044;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC6604 f46045;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f46046;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC15069(ActivityC6604 activityC6604) {
        this.f46045 = activityC6604;
        this.f46040 = activityC6604.f20336;
        View m10216 = activityC6604.m10216(R.layout.MT_Protector_res_0x7f0d0083);
        this.f46038 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        EditText editText = (EditText) m10216.findViewById(R.id.editText2);
        this.f46043 = editText;
        this.f46042 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d2);
        this.f46041 = (TextView) m10216.findViewById(R.id.textView2);
        editText.addTextChangedListener(this);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC6604);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        this.f46046 = c19258.m44415();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35670() {
        C23537 c23537 = this.f46040;
        C18906 c18906 = c23537.f75566;
        boolean z = c18906.mo29412() && c23537.f75574.getTypeName().equals("style");
        this.f46044 = z;
        View view = this.f46042;
        EditText editText = this.f46038;
        if (z) {
            view.setVisibility(0);
            editText.setText(c18906.mo29406());
            this.f46043.setText(String.format("%08X", Integer.valueOf(c18906.getParent())));
        } else {
            view.setVisibility(8);
            editText.setText(c18906.mo29406());
        }
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f46046;
        dialogInterfaceC0206.m1449();
        if (this.f46039) {
            this.f46039 = false;
            dialogInterfaceC0206.m1447().setOnClickListener(this);
            ViewOnClickListenerC14813.m35215(this.f46041);
        }
        C4925.m14329(editText);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText = this.f46038;
        String obj = editText.getText().toString();
        if (obj.isEmpty()) {
            editText.requestFocus();
            C21374.m48457(R.string.MT_Protector_res_0x7f1200ee);
            return;
        }
        C23537 c23537 = this.f46040;
        C18906 c18906 = c23537.f75566;
        if (this.f46044) {
            EditText editText2 = this.f46043;
            String obj2 = editText2.getText().toString();
            if (!C9896.m24990(obj2)) {
                editText2.requestFocus();
                C21374.m48457(R.string.MT_Protector_res_0x7f120b48);
                return;
            }
            c18906.m43638(C9896.m24993(obj2));
        }
        if (!obj.equals(c18906.mo29406())) {
            c18906.m43641(obj);
        }
        this.f46046.dismiss();
        this.f46045.f20339.notifyDataSetChanged();
        c23537.f75587 = true;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        String obj = editable.toString();
        if (C9896.m24990(obj)) {
            str = this.f46040.f75569.m30774(C9896.m24993(obj));
        } else {
            str = null;
        }
        TextView textView = this.f46041;
        if (str != null) {
            textView.setText(str);
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                return;
            }
            return;
        }
        if (textView.getVisibility() != 8) {
            textView.setVisibility(8);
        }
    }
}
