package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.util.Set;

/* compiled from: H5HP */
/* renamed from: l.ܽܳۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC16700 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f51267;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CheckBox f51268;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f51269;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final CheckBox f51270;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final CheckBox f51271;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Set f51272;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public String f51273;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CheckBox f51274;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final View f51275;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CheckBox f51276;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10235 f51277;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C3764 f51278;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final CheckBox f51279;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final View f51280;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final Spinner f51281;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C5062 f51282;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC17169 f51283;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C20296 f51284;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f51285;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC16700(ComponentCallbacksC9205 componentCallbacksC9205, String str) {
        String str2 = str;
        InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
        this.f51285 = interfaceC12344;
        ActivityC17169 activityC17169 = (ActivityC17169) componentCallbacksC9205.requireActivity();
        this.f51283 = activityC17169;
        this.f51278 = (C3764) new C4741(activityC17169).m13885(C3764.class);
        View m10216 = activityC17169.m10216(R.layout.MT_Protector_res_0x7f0d009b);
        this.f51280 = m10216;
        C5062 c5062 = (C5062) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        this.f51282 = c5062;
        c5062.m14602(C2353.m7663(), (String) null);
        C10235 c10235 = (C10235) m10216.findViewById(R.id.editText2);
        this.f51277 = c10235;
        View findViewById = m10216.findViewById(R.id.MT_Protector_res_0x7f0a019c);
        this.f51275 = findViewById;
        CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a019b);
        this.f51276 = checkBox;
        c10235.m30313(new C7612(this));
        Spinner spinner = (Spinner) m10216.findViewById(R.id.spinner);
        this.f51281 = spinner;
        CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00e0);
        this.f51279 = checkBox2;
        CheckBox checkBox3 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        this.f51274 = checkBox3;
        CheckBox checkBox4 = (CheckBox) m10216.findViewById(R.id.checkBox2);
        this.f51271 = checkBox4;
        CheckBox checkBox5 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00df);
        this.f51270 = checkBox5;
        CheckBox checkBox6 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00e1);
        this.f51268 = checkBox6;
        String str3 = "/";
        if (str2 == null) {
            String string = interfaceC12344.getString("dex_search_path", null);
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
        spinner.setSelection(interfaceC12344.getInt("dex_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox2.setChecked(interfaceC12344.getBoolean("dex_search_sub", true));
        checkBox3.setChecked(interfaceC12344.getBoolean("dex_search_match_case", false));
        checkBox4.setChecked(interfaceC12344.getBoolean("dex_search_regex", false));
        checkBox5.setChecked(interfaceC12344.getBoolean("dex_search_hex", true));
        checkBox6.setChecked(interfaceC12344.getBoolean("dex_search_exactly_match", true));
        this.f51284 = new C20296(this);
        checkBox.setChecked(interfaceC12344.getBoolean("dseb", false));
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۛܿۢ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C22870.m50970(ViewOnClickListenerC16700.this.f51285, "dseb", z);
            }
        });
        findViewById.setOnClickListener(new ViewOnClickListenerC9841(7, this));
        m39256();
        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۨܿۢ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ViewOnClickListenerC16700.this.m39256();
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39254(ViewOnClickListenerC16700 viewOnClickListenerC16700) {
        C1884 c1884 = new C1884(viewOnClickListenerC16700.f51283, -1);
        c1884.m31258(R.string.MT_Protector_res_0x7f120310);
        c1884.m31273(C4925.m14306(R.string.MT_Protector_res_0x7f1202a1, "com/gms/\nandroidx/"));
        c1884.m31250((CharSequence) ApplicationC20075.f65008.getString("dsel", ""));
        c1884.m31270();
        c1884.m31266(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m39256() {
        CheckBox checkBox = this.f51271;
        this.f51282.m14609(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39264(C0941 c0941) {
        this.f51267 = true;
        this.f51272 = c0941.m3355();
        this.f51273 = c0941.m3361();
        this.f51279.setVisibility(8);
        C10235 c10235 = this.f51277;
        c10235.mo25910((CharSequence) c10235.getContext().getString(R.string.MT_Protector_res_0x7f12020e));
        c10235.setEnabled(false);
        this.f51275.setEnabled(false);
        this.f51276.setEnabled(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39263() {
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(this.f51283);
        c19258.m44421(this.f51280);
        DialogInterfaceC0206 m19253 = C7187.m19253(c19258, R.string.MT_Protector_res_0x7f12070a, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        this.f51269 = m19253;
        m19253.m1447().setOnClickListener(this);
        C5062 c5062 = this.f51282;
        c5062.requestFocus();
        C4925.m14329(c5062.m14607());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f51282.m14604(i == 0 || i == 4);
        CheckBox checkBox = this.f51268;
        CheckBox checkBox2 = this.f51270;
        CheckBox checkBox3 = this.f51271;
        CheckBox checkBox4 = this.f51274;
        if (i == 0) {
            checkBox4.setVisibility(0);
            checkBox3.setVisibility(0);
            checkBox2.setVisibility(8);
            checkBox.setVisibility(8);
        } else if (i == 1 || i == 2 || i == 3 || i == 4) {
            checkBox4.setVisibility(0);
            checkBox3.setVisibility(0);
            checkBox.setVisibility(0);
            checkBox2.setVisibility(8);
        } else if (i == 5) {
            checkBox4.setVisibility(8);
            checkBox3.setVisibility(8);
            checkBox2.setVisibility(0);
            checkBox.setVisibility(8);
        }
        m39256();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fa  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r19) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC16700.onClick(android.view.View):void");
    }
}
