package l;

import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Arrays;

/* compiled from: 195F */
/* renamed from: l.᩻ܿ᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23850 extends AbstractC1661 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final byte[] f77171 = {-17, -69, -65};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m52559(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return i;
        }
        return 0;
    }

    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916("local") && !c2450.m7923() && c2450.m7918() == 1 && c2450.m7913().mo36969();
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        Main m7917 = c2450.m7917();
        final InterfaceC17889 m7913 = c2450.m7913();
        View m10216 = m7917.m10216(R.layout.MT_Protector_res_0x7f0d00b4);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05da);
        TextView textView2 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05dd);
        Spinner spinner = (Spinner) m10216.findViewById(R.id.spinner1);
        TextView textView3 = (TextView) m10216.findViewById(R.id.text1);
        final C10235 c10235 = (C10235) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        final Spinner spinner2 = (Spinner) m10216.findViewById(R.id.spinner2);
        TextView textView4 = (TextView) m10216.findViewById(R.id.textCharset);
        final EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d7);
        View findViewById = m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d8);
        final C10235 c102352 = (C10235) m10216.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.checkBoxText1);
        TextView textView5 = (TextView) m10216.findViewById(R.id.textSeparatorPolicy);
        final Spinner spinner3 = (Spinner) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0558);
        final CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00f6);
        TextView textView6 = (TextView) m10216.findViewById(R.id.text2);
        final CheckBox checkBox3 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d9);
        checkBox3.setText(m7917.getResources().getQuantityString(R.plurals.MT_Protector_res_0x7f110000, 1));
        textView.setText(m7913.getName());
        textView2.setText(C22927.m51028(m7913.getSize()));
        c102352.m30512(2);
        c102352.mo25910((CharSequence) (m7913.getName() + ".{D}"));
        spinner2.setAdapter((SpinnerAdapter) new C20065(m7917, Arrays.asList("B", "KB", "MB", "GB")));
        findViewById.setOnClickListener(new ViewOnClickListenerC2371(1, m7917, editText));
        final C20344 c20344 = new C20344();
        c20344.m46668();
        checkBox3.setChecked(c20344.f65669);
        spinner.setSelection(c20344.f65671);
        m52560(c20344, textView3, c10235, spinner2, textView4, editText, findViewById, checkBox, textView5, spinner3, checkBox2);
        RunnableC5527 runnableC5527 = new RunnableC5527(m7917, m7913.getSize(), spinner, c10235, spinner2, textView6);
        runnableC5527.run();
        spinner.setOnItemSelectedListener(new C15403(c20344, c10235, spinner2, editText, checkBox, spinner3, checkBox2, m7917, textView3, textView4, findViewById, textView5, runnableC5527));
        c10235.m30313(new C21755(runnableC5527));
        spinner2.setOnItemSelectedListener(new C22460(runnableC5527));
        C19258 buildDialog = m7917.buildDialog();
        buildDialog.m44421(m10216);
        final DialogInterfaceC0206 m19253 = C7187.m19253(buildDialog, R.string.MT_Protector_res_0x7f12070a, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        m19253.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.֨ᩳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C23850.m52556(C10235.this, c20344, c10235, spinner2, editText, checkBox, spinner3, checkBox2, checkBox3, m19253, c2450, m7913);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
    
        if ("UTF-8-BOM".equalsIgnoreCase(r4) == false) goto L33;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m52556(l.C10235 r1, l.C20344 r2, l.C10235 r3, android.widget.Spinner r4, android.widget.EditText r5, android.widget.CheckBox r6, android.widget.Spinner r7, android.widget.CheckBox r8, android.widget.CheckBox r9, l.DialogInterfaceC0206 r10, l.C2450 r11, l.InterfaceC17889 r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23850.m52556(l.ۤۤᩳ, l.᩶ᩳ᩻, l.ۤۤᩳ, android.widget.Spinner, android.widget.EditText, android.widget.CheckBox, android.widget.Spinner, android.widget.CheckBox, android.widget.CheckBox, l.֡ۚۢ, l.ۖۢܳ, l.ᩳۜܳ):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m52560(C20344 c20344, TextView textView, C10235 c10235, Spinner spinner, TextView textView2, EditText editText, View view, CheckBox checkBox, TextView textView3, Spinner spinner2, CheckBox checkBox2) {
        int i = c20344.f65671;
        spinner.setVisibility(i == 0 ? 0 : 8);
        textView2.setVisibility(c20344.m46667() ? 0 : 8);
        editText.setVisibility(c20344.m46667() ? 0 : 8);
        view.setVisibility(c20344.m46667() ? 0 : 8);
        checkBox.setVisibility(i == 2 ? 0 : 8);
        textView3.setVisibility(i == 3 ? 0 : 8);
        spinner2.setVisibility(i == 3 ? 0 : 8);
        checkBox2.setVisibility(i == 3 ? 0 : 8);
        editText.setText(c20344.f65675);
        if (i == 0) {
            m52555(c10235);
            textView.setText(R.string.MT_Protector_res_0x7f1209c2);
            c10235.mo25910((CharSequence) String.valueOf(c20344.f65665));
            spinner.setSelection(c20344.f65672);
        } else if (i == 1) {
            m52555(c10235);
            textView.setText(R.string.MT_Protector_res_0x7f1209bf);
            c10235.mo25910((CharSequence) String.valueOf(c20344.f65666));
        } else if (i == 2) {
            m52555(c10235);
            textView.setText(R.string.MT_Protector_res_0x7f1209c4);
            c10235.mo25910((CharSequence) String.valueOf(c20344.f65667));
            checkBox.setText(R.string.MT_Protector_res_0x7f1209c8);
            checkBox.setChecked(c20344.f65670);
        } else {
            c10235.m25926(524289);
            c10235.m25897(new InputFilter[0]);
            c10235.m25894(true);
            textView.setText(R.string.MT_Protector_res_0x7f1209c6);
            c10235.mo25910((CharSequence) c20344.f65677);
            int i2 = c20344.f65673;
            spinner2.setSelection((i2 == 0 || i2 == 1 || i2 == 2) ? i2 : 0);
            checkBox2.setText(R.string.MT_Protector_res_0x7f1209ce);
            checkBox2.setChecked(c20344.f65668);
            c10235.mo25919(c10235.m30526());
        }
        if (i != 3) {
            checkBox2.setChecked(c20344.f65668);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52555(C10235 c10235) {
        c10235.m25926(2);
        c10235.m25897(new InputFilter[]{new InputFilter.LengthFilter(9)});
        c10235.m25894(true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52558(C20344 c20344, C10235 c10235, Spinner spinner, EditText editText, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2) {
        try {
            m52561(c20344, c10235, spinner, editText, checkBox, spinner2, checkBox2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m52561(C20344 c20344, C10235 c10235, Spinner spinner, EditText editText, CheckBox checkBox, Spinner spinner2, CheckBox checkBox2) {
        int i = c20344.f65671;
        if (i == 0) {
            c20344.f65665 = Integer.parseInt(c10235.m30436().toString());
            c20344.f65672 = spinner.getSelectedItemPosition();
            return;
        }
        if (i == 1) {
            c20344.f65666 = Integer.parseInt(c10235.m30436().toString());
            return;
        }
        if (i == 2) {
            c20344.f65667 = Integer.parseInt(c10235.m30436().toString());
            c20344.f65670 = checkBox.isChecked();
            c20344.f65675 = editText.getText().toString();
        } else if (i == 3) {
            c20344.f65677 = c10235.m30436().toString();
            int selectedItemPosition = spinner2.getSelectedItemPosition();
            if (selectedItemPosition != 0 && selectedItemPosition != 1 && selectedItemPosition != 2) {
                selectedItemPosition = 0;
            }
            c20344.f65673 = selectedItemPosition;
            c20344.f65668 = checkBox2.isChecked();
            c20344.f65675 = editText.getText().toString();
        }
    }
}
