package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.util.Set;

/* compiled from: F1E5 */
/* renamed from: l.۟᩺᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC7788 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final CheckBox f24062;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CheckBox f24063;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f24064;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f24065;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f24066;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CheckBox f24067;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final Spinner f24068;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C10235 f24069;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CheckBox f24070;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Set f24071;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f24072;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final View f24073;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C3764 f24074;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5062 f24075;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC17169 f24076;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23310 f24077;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final CheckBox f24078;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC7788(ComponentCallbacksC9205 componentCallbacksC9205, String str) {
        String str2 = str;
        InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
        this.f24065 = interfaceC12344;
        ActivityC17169 activityC17169 = (ActivityC17169) componentCallbacksC9205.requireActivity();
        this.f24076 = activityC17169;
        this.f24074 = (C3764) new C4741(activityC17169).m13885(C3764.class);
        View m10216 = activityC17169.m10216(R.layout.MT_Protector_res_0x7f0d0086);
        this.f24073 = m10216;
        C5062 c5062 = (C5062) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        this.f24075 = c5062;
        c5062.m14602(C2353.m7663(), (String) null);
        C10235 c10235 = (C10235) m10216.findViewById(R.id.editText2);
        this.f24069 = c10235;
        Spinner spinner = (Spinner) m10216.findViewById(R.id.spinner);
        this.f24068 = spinner;
        CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00e0);
        this.f24062 = checkBox;
        CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        this.f24067 = checkBox2;
        CheckBox checkBox3 = (CheckBox) m10216.findViewById(R.id.checkBox2);
        this.f24078 = checkBox3;
        CheckBox checkBox4 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00df);
        this.f24070 = checkBox4;
        CheckBox checkBox5 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00e1);
        this.f24063 = checkBox5;
        String str3 = "/";
        if (str2 == null) {
            String string = interfaceC12344.getString("arsc_search_path", null);
            if (string != null && !string.isEmpty()) {
                str3 = !string.endsWith("/") ? string.concat("/") : string;
            }
            c10235.mo25910((CharSequence) str3);
        } else {
            if (str.isEmpty()) {
                str2 = "/";
            } else if (!str2.endsWith("/")) {
                str2 = str2.concat("/");
            }
            c10235.mo25910((CharSequence) str2);
        }
        spinner.setSelection(interfaceC12344.getInt("arsc_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox.setChecked(interfaceC12344.getBoolean("dex_search_sub", true));
        checkBox2.setChecked(interfaceC12344.getBoolean("dex_search_match_case", false));
        checkBox3.setChecked(interfaceC12344.getBoolean("dex_search_regex", false));
        checkBox4.setChecked(interfaceC12344.getBoolean("dex_search_hex", true));
        checkBox5.setChecked(interfaceC12344.getBoolean("dex_search_exactly_match", true));
        this.f24077 = new C23310(this);
        m20813();
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۨ᩺᩷
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ViewOnClickListenerC7788.this.m20813();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m20813() {
        CheckBox checkBox = this.f24078;
        this.f24075.m14609(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20817(C0941 c0941) {
        this.f24072 = true;
        this.f24071 = c0941.m3355();
        this.f24066 = c0941.m3361();
        this.f24062.setVisibility(8);
        C10235 c10235 = this.f24069;
        c10235.mo25910((CharSequence) c10235.getContext().getString(R.string.MT_Protector_res_0x7f12020e));
        c10235.setEnabled(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20816() {
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(this.f24076);
        c19258.m44421(this.f24073);
        DialogInterfaceC0206 m19253 = C7187.m19253(c19258, R.string.MT_Protector_res_0x7f12070a, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        this.f24064 = m19253;
        m19253.m1447().setOnClickListener(this);
        C5062 c5062 = this.f24075;
        c5062.requestFocus();
        C4925.m14329(c5062.m14607());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f24075.m14604(i == 0 || i == 2);
        CheckBox checkBox = this.f24063;
        CheckBox checkBox2 = this.f24070;
        CheckBox checkBox3 = this.f24078;
        CheckBox checkBox4 = this.f24067;
        if (i == 0) {
            checkBox4.setVisibility(0);
            checkBox3.setVisibility(0);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(8);
        } else {
            if (i != 1) {
                if (i == 2) {
                    checkBox4.setVisibility(0);
                    checkBox3.setVisibility(0);
                    checkBox2.setVisibility(8);
                    checkBox.setVisibility(0);
                } else if (i != 3) {
                    if (i == 4) {
                        checkBox4.setVisibility(8);
                        checkBox3.setVisibility(8);
                        checkBox2.setVisibility(8);
                        checkBox.setVisibility(8);
                    }
                }
            }
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(8);
            checkBox2.setVisibility(0);
            checkBox.setVisibility(8);
        }
        m20813();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7788.onClick(android.view.View):void");
    }
}
