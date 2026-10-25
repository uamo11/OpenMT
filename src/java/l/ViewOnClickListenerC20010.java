package l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;

/* compiled from: T5VF */
/* renamed from: l.᩶ۜᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC20010 implements View.OnClickListener, AdapterView.OnItemSelectedListener, TextWatcher {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f64813;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EditText f64814;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Spinner f64815;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public TextView f64816;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EditText f64817;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public View f64818;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f64819 = true;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23537 f64820;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceOnClickListenerC3677 f64821;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f64822;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ActivityC6604 f64823;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public TextView f64824;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ViewOnClickListenerC20010(ActivityC6604 activityC6604) {
        this.f64823 = activityC6604;
        this.f64820 = activityC6604.f20336;
        View m10216 = activityC6604.m10216(R.layout.MT_Protector_res_0x7f0d0084);
        this.f64814 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        EditText editText = (EditText) m10216.findViewById(R.id.editText2);
        this.f64817 = editText;
        this.f64824 = (TextView) m10216.findViewById(R.id.textView2);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        this.f64816 = textView;
        Spinner spinner = (Spinner) m10216.findViewById(R.id.spinner);
        this.f64815 = spinner;
        this.f64818 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d2);
        DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677 = new DialogInterfaceOnClickListenerC3677(activityC6604, true);
        dialogInterfaceOnClickListenerC3677.m11203(new InterfaceC2266() { // from class: l.᩹ۜᩳ
            @Override // l.InterfaceC2266
            /* renamed from: ۧ */
            public final void mo7493(int i) {
                ViewOnClickListenerC20010.this.f64814.setText(String.format("%08X", Integer.valueOf(i)));
            }
        });
        this.f64821 = dialogInterfaceOnClickListenerC3677;
        C19258 c19258 = new C19258(activityC6604);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector_res_0x7f1200fb, (DialogInterface.OnClickListener) null);
        this.f64813 = c19258.m44415();
        spinner.setOnItemSelectedListener(this);
        editText.addTextChangedListener(this);
        ViewOnClickListenerC14813.m35215(textView);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46148() {
        m46149(null, 0, 0, false);
        C4925.m14329(this.f64814);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46149(String str, int i, int i2, boolean z) {
        String m30772;
        this.f64822 = z;
        C23537 c23537 = this.f64820;
        boolean mo29412 = c23537.f75566.mo29412();
        View view = this.f64818;
        if (mo29412) {
            view.setVisibility(0);
            EditText editText = this.f64817;
            if (z) {
                editText.setText(String.format("%08X", Integer.valueOf(i)));
            } else {
                editText.setText(String.format("%08X", Integer.valueOf(c23537.f75576.mo5006())));
            }
        } else {
            view.setVisibility(8);
        }
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f64813;
        dialogInterfaceC0206.m1449();
        if (this.f64819) {
            this.f64819 = false;
            dialogInterfaceC0206.m1447().setOnClickListener(this);
            dialogInterfaceC0206.m1448().setOnClickListener(this);
            C8960.m23097(dialogInterfaceC0206);
            ViewOnClickListenerC14813.m35215(this.f64824);
        }
        TextView textView = this.f64816;
        Spinner spinner = this.f64815;
        EditText editText2 = this.f64814;
        if (!z) {
            EnumC4487 m52000 = c23537.m52000();
            if (m52000 == EnumC4487.ENTRY || m52000 == EnumC4487.SEARCH_BY_ID_IN || m52000 == EnumC4487.SEARCH_VALUE_IN) {
                m30772 = c23537.f75569.m30772(c23537.f75576.mo5006());
            } else {
                m30772 = c23537.f75566.mo29406();
            }
            textView.setText(m30772);
            C4794 c4794 = c23537.f75576;
            int mo5004 = c4794.mo5004();
            switch (mo5004) {
                case 1:
                    spinner.setSelection(1);
                    editText2.setText(String.format("%08X", Integer.valueOf(c4794.getValue())));
                    break;
                case 2:
                case 8:
                    spinner.setSelection(2);
                    editText2.setText(String.format("%08X", Integer.valueOf(c4794.getValue())));
                    break;
                case 3:
                    spinner.setSelection(0);
                    editText2.setText(c4794.mo5008().getValue());
                    break;
                case 4:
                    spinner.setSelection(7);
                    editText2.setText(C0253.m1519(c4794.getValue()));
                    break;
                case 5:
                    spinner.setSelection(8);
                    editText2.setText(C3213.m9856(c4794.getValue(), 1) + C3213.f10105[c4794.getValue() & 15]);
                    break;
                case 6:
                    spinner.setSelection(9);
                    int value = c4794.getValue() & 15;
                    editText2.setText(C3213.m9856(c4794.getValue(), C3213.f10106[value]) + C3213.f10107[value]);
                    break;
                case 7:
                    spinner.setSelection(10);
                    editText2.setText(String.format("%08X", Integer.valueOf(c4794.getValue())));
                    break;
                default:
                    switch (mo5004) {
                        case 16:
                            spinner.setSelection(4);
                            editText2.setText(String.valueOf(c4794.getValue()));
                            break;
                        case 17:
                            spinner.setSelection(5);
                            editText2.setText(String.format("%X", Integer.valueOf(c4794.getValue())));
                            break;
                        case 18:
                            spinner.setSelection(6);
                            editText2.setText(c4794.getValue() != 0 ? "true" : "false");
                            break;
                        default:
                            switch (mo5004) {
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                    spinner.setSelection(3);
                                    editText2.setText(String.format("%08X", Integer.valueOf(c4794.getValue())));
                                    break;
                                default:
                                    spinner.setSelection(-1);
                                    editText2.setText("Unknown type");
                                    break;
                            }
                    }
            }
        } else {
            textView.setText(R.string.MT_Protector_res_0x7f1205ad);
            spinner.setSelection(i2);
            editText2.setText(str);
        }
        editText2.requestFocus();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m46147(String str) {
        if (C9896.m24990(str)) {
            return true;
        }
        this.f64814.requestFocus();
        C21374.m48457(R.string.MT_Protector_res_0x7f120b48);
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        EditText editText = this.f64814;
        if (id == 16908313) {
            String obj = editText.getText().toString();
            EditText editText2 = this.f64817;
            String obj2 = editText2.getText().toString();
            C23537 c23537 = this.f64820;
            if (c23537.f75566.mo29412() && !C9896.m24990(obj2)) {
                editText2.requestFocus();
                C21374.m48457(R.string.MT_Protector_res_0x7f120b48);
                return;
            }
            if (this.f64822) {
                c23537.f75576 = new C4794(c23537.f75566, 0, 0, -1);
            }
            C4794 c4794 = c23537.f75576;
            int selectedItemPosition = this.f64815.getSelectedItemPosition();
            DialogInterfaceC0206 dialogInterfaceC0206 = this.f64813;
            switch (selectedItemPosition) {
                case 0:
                    c4794.m13996(obj, null);
                    break;
                case 1:
                    if (m46147(obj)) {
                        c4794.m13995(C9896.m24993(obj));
                        c4794.m13998(1);
                        break;
                    } else {
                        return;
                    }
                case 2:
                    if (m46147(obj)) {
                        c4794.m13995(C9896.m24993(obj));
                        c4794.m13998(2);
                        break;
                    } else {
                        return;
                    }
                case 3:
                    if (m46147(obj)) {
                        c4794.m13995(C9896.m24993(obj));
                        c4794.m13998(28);
                        break;
                    } else {
                        return;
                    }
                case 4:
                    try {
                        c4794.m13995(Integer.parseInt(obj));
                        c4794.m13998(16);
                        break;
                    } catch (NumberFormatException unused) {
                        editText.requestFocus();
                        C21374.m48457(R.string.MT_Protector_res_0x7f120b48);
                        return;
                    }
                case 5:
                    if (m46147(obj)) {
                        c4794.m13995(C9896.m24993(obj));
                        c4794.m13998(17);
                        break;
                    } else {
                        return;
                    }
                case 6:
                    if (!obj.equals("true") && !obj.equals("false")) {
                        editText.requestFocus();
                        C21374.m48457(R.string.MT_Protector_res_0x7f120b48);
                        return;
                    } else {
                        c4794.m13995(obj.equals("true") ? 1 : 0);
                        c4794.m13998(18);
                        break;
                    }
                case 7:
                    try {
                        c4794.m13995(Float.floatToRawIntBits(Float.parseFloat(obj)));
                        c4794.m13998(4);
                        break;
                    } catch (NumberFormatException unused2) {
                        editText.requestFocus();
                        C21374.m48457(R.string.MT_Protector_res_0x7f120b48);
                        return;
                    }
                case 8:
                    C7073 c7073 = new C7073();
                    if (C9896.m24995(obj, c7073) && c7073.f21767 == 5) {
                        c4794.m13995(c7073.f21766);
                        c4794.m13998(5);
                        break;
                    } else {
                        editText.requestFocus();
                        C21374.m48457(R.string.MT_Protector_res_0x7f120b48);
                        return;
                    }
                    break;
                case 9:
                    C7073 c70732 = new C7073();
                    if (C9896.m24995(obj, c70732) && c70732.f21767 == 6) {
                        c4794.m13995(c70732.f21766);
                        c4794.m13998(6);
                        break;
                    } else {
                        editText.requestFocus();
                        C21374.m48457(R.string.MT_Protector_res_0x7f120b48);
                        return;
                    }
                    break;
                case 10:
                    if (m46147(obj)) {
                        c4794.m13995(C9896.m24993(obj));
                        c4794.m13998(7);
                        break;
                    } else {
                        return;
                    }
                default:
                    dialogInterfaceC0206.dismiss();
                    return;
            }
            if (c23537.f75566.mo29412()) {
                c4794.m13997(C9896.m24993(obj2));
            }
            if (this.f64822) {
                c23537.f75566.m43644(c4794);
            }
            dialogInterfaceC0206.dismiss();
            c23537.f75587 = true;
            this.f64823.f20339.notifyDataSetChanged();
            return;
        }
        String obj3 = editText.getText().toString();
        DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677 = this.f64821;
        dialogInterfaceOnClickListenerC3677.getClass();
        dialogInterfaceOnClickListenerC3677.m11202(C9896.m24990(obj3) ? C9896.m24993(obj3) : 0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        EditText editText = this.f64814;
        switch (i) {
            case 0:
                editText.setInputType(131073);
                break;
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                editText.setInputType(1);
                break;
            case 4:
                editText.setInputType(o.a.b);
                break;
            case 7:
                editText.setInputType(12290);
                break;
            default:
                editText.setEnabled(false);
                break;
        }
        this.f64813.m1448().setVisibility(i != 3 ? 8 : 0);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        this.f64814.setEnabled(false);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        String str = null;
        try {
            if (C9896.m24990(obj)) {
                str = this.f64820.f75569.m30774(C9896.m24993(obj));
            }
        } catch (Exception unused) {
        }
        TextView textView = this.f64824;
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
