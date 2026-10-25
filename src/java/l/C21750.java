package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.ui.PluginEditText;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;

/* compiled from: N7PP */
/* renamed from: l.᩸ᩳܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21750 implements InterfaceC19634 {
    @Override // l.InterfaceC19634
    /* renamed from: ֫ */
    public final void mo20431(EditText editText, TextView textView, Button button, C11146 c11146) {
        button.setTag(R.id.MT_Protector_res_0x7f0a05cc, c11146);
        mo20430(editText, textView, button);
    }

    @Override // l.InterfaceC19634
    /* renamed from: ֫ */
    public final void mo20430(EditText editText, TextView textView, Button button) {
        editText.setVisibility(8);
        button.setVisibility(0);
        textView.setVisibility(8);
    }

    @Override // l.InterfaceC19634
    /* renamed from: ֫ */
    public final void mo20429(final Button button, final ActivityC0477 activityC0477) {
        C22455 c22455 = (C22455) button.getTag(R.id.MT_Protector_res_0x7f0a05cc);
        JSONObject jSONObject = c22455 == null ? new JSONObject() : c22455.mo27664();
        View m10216 = activityC0477.m10216(R.layout.MT_Protector_res_0x7f0d00ff);
        final C10235 c10235 = (C10235) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        final C10235 c102352 = (C10235) m10216.findViewById(R.id.editText2);
        final C2978 c2978 = (C2978) m10216.findViewById(R.id.switch1);
        final C2978 c29782 = (C2978) m10216.findViewById(R.id.switch2);
        final Spinner spinner = (Spinner) m10216.findViewById(R.id.spinner);
        final C10235 c102353 = (C10235) m10216.findViewById(R.id.editText3);
        spinner.setAdapter((SpinnerAdapter) new C20065(activityC0477, new String[]{activityC0477.getString(R.string.MT_Protector_res_0x7f120932), activityC0477.getString(R.string.MT_Protector_res_0x7f12020b), activityC0477.getString(R.string.MT_Protector_res_0x7f120a55), activityC0477.getString(R.string.MT_Protector_res_0x7f120a54), activityC0477.getString(R.string.MT_Protector_res_0x7f120412)}));
        c29782.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۠ᩳܿ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C10235.this.m30317(z ? PluginEditText.SYNTAX_REGEX : null, true);
                c102352.m30317(z ? PluginEditText.SYNTAX_REGEX_REPLACEMENT : null, true);
            }
        });
        c10235.mo25910((CharSequence) jSONObject.getString(am.av));
        c102352.mo25910((CharSequence) jSONObject.getString("b"));
        c2978.setChecked(jSONObject.getBoolean(am.aF));
        int i = jSONObject.getInt("d");
        if (i < 0 || i > 4) {
            i = 0;
        }
        spinner.setSelection(i);
        int i2 = jSONObject.getInt("e");
        c102353.mo25910((CharSequence) (i2 <= 0 ? "" : String.valueOf(i2)));
        c29782.setChecked(jSONObject.getBoolean("f", true));
        C19258 buildDialog = activityC0477.buildDialog();
        buildDialog.m44421(m10216);
        final DialogInterfaceC0206 m19253 = C7187.m19253(buildDialog, R.string.MT_Protector_res_0x7f12070a, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        m19253.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܶᩳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C10235 c102354 = C10235.this;
                String obj = c102354.m30436().toString();
                C10235 c102355 = c102352;
                String obj2 = c102355.m30436().toString();
                boolean isChecked = c2978.isChecked();
                boolean isChecked2 = c29782.isChecked();
                int selectedItemPosition = spinner.getSelectedItemPosition();
                C10235 c102356 = c102353;
                String obj3 = c102356.m30436().toString();
                if (obj.isEmpty()) {
                    C21374.m48457(R.string.MT_Protector_res_0x7f120304);
                    c102354.requestFocus();
                    return;
                }
                ActivityC0477 activityC04772 = activityC0477;
                if (isChecked2) {
                    try {
                        try {
                            C13574.m32628(C11459.m28260(obj), obj2);
                        } catch (Exception e) {
                            activityC04772.m10223(e, (DialogInterface.OnDismissListener) null);
                            c102355.m25900();
                            c102355.requestFocus();
                            return;
                        }
                    } catch (Exception e2) {
                        activityC04772.m10223(e2, (DialogInterface.OnDismissListener) null);
                        c102354.m25900();
                        c102354.requestFocus();
                        return;
                    }
                }
                try {
                    int parseInt = obj3.isEmpty() ? 0 : Integer.parseInt(obj3);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(am.av, obj);
                    jSONObject2.put("b", obj2);
                    jSONObject2.put(am.aF, isChecked);
                    jSONObject2.put("d", selectedItemPosition);
                    jSONObject2.put("e", parseInt);
                    jSONObject2.put("f", isChecked2);
                    button.setTag(R.id.MT_Protector_res_0x7f0a05cc, new C22455(jSONObject2));
                    m19253.dismiss();
                } catch (Exception e3) {
                    activityC04772.m10223(e3, (DialogInterface.OnDismissListener) null);
                    c102356.m25900();
                    c102356.requestFocus();
                }
            }
        });
    }

    @Override // l.InterfaceC19634
    /* renamed from: ֫ */
    public final C11146 mo20428(int i, EditText editText, Button button) {
        C11146 c11146 = (C11146) button.getTag(R.id.MT_Protector_res_0x7f0a05cc);
        if (c11146 != null) {
            return c11146;
        }
        ActivityC0477.m2112(button);
        return null;
    }
}
