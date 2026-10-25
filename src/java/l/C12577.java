package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.editor.TextEditorFunction;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: J7R3 */
/* renamed from: l.۫ᩳܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12577 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Button f37921;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37922 = new ArrayList();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0477 f37923;

    public C12577(Button button, ActivityC0477 activityC0477) {
        this.f37921 = button;
        this.f37923 = activityC0477;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        this.f37921.setEnabled(false);
        m20272(this.f37923, 100);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        String stringNullable;
        ArrayList arrayList = new ArrayList();
        for (C16709 c16709 : C13265.m32202()) {
            c16709.m39306(arrayList);
            String m39295 = c16709.m39295();
            String m39302 = c16709.m39302();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Class cls = (Class) it.next();
                try {
                    TextEditorFunction textEditorFunction = (TextEditorFunction) cls.newInstance();
                    textEditorFunction.init(c16709.m39304());
                    if (textEditorFunction.isEnabled()) {
                        String name = cls.getName();
                        PluginContext m39304 = c16709.m39304();
                        String name2 = textEditorFunction.name();
                        this.f37922.add(new C6227(m39295, m39302, name, (name2.length() < 3 || name2.charAt(0) != '{' || name2.charAt(name2.length() + (-1)) != '}' || (stringNullable = ((C10632) m39304).getStringNullable(name2)) == null) ? name2 : stringNullable, new C10220(c16709, textEditorFunction)));
                    }
                } catch (Throwable th) {
                    c16709.m39290(th);
                }
            }
            arrayList.clear();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        ArrayList arrayList = this.f37922;
        boolean isEmpty = arrayList.isEmpty();
        final ActivityC0477 activityC0477 = this.f37923;
        if (isEmpty) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120a5e);
            activityC0477.startActivity(new Intent(activityC0477, (Class<?>) ActivityC23143.class));
            return;
        }
        C11872 c11872 = (C11872) this.f37921.getTag(R.id.MT_Protector_res_0x7f0a05cd);
        JSONObject jSONObject = c11872 == null ? new JSONObject() : c11872.mo27664();
        String string = jSONObject.getString(am.av);
        String string2 = jSONObject.getString("b");
        JSONObject jSONObject2 = jSONObject.getJSONObject(am.aF);
        View m10216 = activityC0477.m10216(R.layout.MT_Protector_res_0x7f0d0100);
        final Spinner spinner = (Spinner) m10216.findViewById(R.id.spinner);
        final FrameLayout frameLayout = (FrameLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a040f);
        spinner.setOnItemSelectedListener(new C13282(this, frameLayout, string, string2, jSONObject2));
        spinner.setAdapter((SpinnerAdapter) new C20065(activityC0477, arrayList));
        if (string != null && string2 != null) {
            String m50967 = C22870.m50967(string, "/", string2);
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (m50967.equals(((C6227) arrayList.get(i)).m17149())) {
                    spinner.setSelection(i);
                    break;
                }
                i++;
            }
        }
        C19258 buildDialog = activityC0477.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        Button m1447 = m44438.m1447();
        final Button button = this.f37921;
        m1447.setOnClickListener(new View.OnClickListener() { // from class: l.ۗᩳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                String str2;
                C10220 c10220;
                C6227 c6227 = (C6227) C12577.this.f37922.get(spinner.getSelectedItemPosition());
                JSONObject jSONObject3 = new JSONObject();
                str = c6227.f19080;
                jSONObject3.put(am.av, str);
                str2 = c6227.f19076;
                jSONObject3.put("b", str2);
                Object tag = frameLayout.getTag(R.id.MT_Protector_res_0x7f0a0442);
                if (tag instanceof PluginView) {
                    PluginView pluginView = (PluginView) tag;
                    try {
                        JSONObject optionsData = ((TextEditorFunction) c6227.m17151().f30698).getOptionsData(pluginView.getPluginUI(), pluginView);
                        if (optionsData == TextEditorFunction.VALIDATION_FAILED) {
                            return;
                        }
                        if (optionsData != null) {
                            jSONObject3.put(am.aF, optionsData);
                        }
                    } catch (Throwable th) {
                        ((C16709) c6227.m17151().f30697).m39290(th);
                        activityC0477.m10223(th, (DialogInterface.OnDismissListener) null);
                        return;
                    }
                }
                c10220 = c6227.f19078;
                C11872 c118722 = new C11872(jSONObject3, c10220);
                Button button2 = button;
                button2.setTag(R.id.MT_Protector_res_0x7f0a05cd, c118722);
                TextView textView = (TextView) button2.getTag(R.id.MT_Protector_res_0x7f0a0397);
                textView.setVisibility(0);
                textView.setText(c118722.m28998());
                m44438.dismiss();
            }
        });
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f37923.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        this.f37921.setEnabled(true);
    }
}
