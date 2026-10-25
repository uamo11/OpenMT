package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import com.umeng.analytics.pro.am;

/* compiled from: CAG8 */
/* renamed from: l.ۜܺ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6875 extends AbstractC3577 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f21242;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public String f21243;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f21244;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f21245;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public String f21246;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public String f21247;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f21248;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f21249;

    @Override // l.AbstractC3577
    /* renamed from: ۜ */
    public final boolean mo10944() {
        return true;
    }

    @Override // l.AbstractC3577
    /* renamed from: ᩳ */
    public final String mo6372() {
        return "FTPS";
    }

    public C6875(int i) {
        super(i);
        this.f21246 = "";
        this.f21245 = 21;
        this.f21243 = "anonymous";
        this.f21247 = "";
        this.f21242 = a.D;
        this.f21248 = true;
        this.f21244 = true;
        this.f21249 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6875(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC3577.m10941(jSONObject, "rk", "4");
        AbstractC3577.m10941(jSONObject, "ip", "7");
        AbstractC3577.m10937(jSONObject, "hs", "b");
        AbstractC3577.m10937(jSONObject, "mt", am.aF);
        this.f21246 = "";
        this.f21245 = 21;
        this.f21243 = "anonymous";
        this.f21247 = "";
        this.f21242 = a.D;
        this.f21248 = true;
        this.f21244 = true;
        this.f21249 = true;
        this.f21246 = jSONObject.getString("2");
        this.f21245 = jSONObject.getInt("3");
        this.f21243 = jSONObject.getString("5");
        this.f21247 = jSONObject.getString("6");
        this.f21242 = jSONObject.getString("8");
        this.f21248 = jSONObject.getBoolean("9");
        this.f21244 = jSONObject.getBoolean(am.av);
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final String mo6365() {
        if (this.f21245 == 21) {
            return "ftps://" + this.f21243 + "@" + this.f21246;
        }
        return "ftps://" + this.f21243 + "@" + this.f21246 + ":" + this.f21245;
    }

    @Override // l.AbstractC3577
    /* renamed from: ܳ */
    public final JSONObject mo6369() {
        JSONObject mo6369 = super.mo6369();
        mo6369.put("2", this.f21246);
        mo6369.put("3", this.f21245);
        mo6369.put("5", this.f21243);
        mo6369.put("6", this.f21247);
        mo6369.put("8", this.f21242);
        mo6369.put("9", this.f21248);
        mo6369.put(am.av, this.f21244);
        return mo6369;
    }

    @Override // l.AbstractC3577
    public final String getName() {
        return this.f11359;
    }

    @Override // l.AbstractC3577
    /* renamed from: ܽ */
    public final String mo6370() {
        String str = "ftps://" + this.f21243 + "@" + this.f21246;
        return str.endsWith("/") ? C15472.m36561(1, 0, str) : str;
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final void mo6368(AbstractC3577 abstractC3577) {
        super.mo6368(abstractC3577);
        if (abstractC3577 instanceof C6875) {
            C6875 c6875 = (C6875) abstractC3577;
            this.f21246 = c6875.f21246;
            this.f21245 = c6875.f21245;
            this.f21243 = c6875.f21243;
            this.f21247 = c6875.f21247;
            this.f21242 = c6875.f21242;
            this.f21248 = c6875.f21248;
            this.f21244 = c6875.f21244;
        }
    }

    @Override // l.AbstractC3577
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6875.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C6875 c6875 = (C6875) obj;
        return this.f21245 == c6875.f21245 && this.f21248 == c6875.f21248 && this.f21244 == c6875.f21244 && this.f21249 == c6875.f21249 && C11003.equals(this.f21246, c6875.f21246) && C11003.equals(this.f21243, c6875.f21243) && C11003.equals(this.f21247, c6875.f21247) && C11003.equals(this.f21242, c6875.f21242);
    }

    @Override // l.AbstractC3577
    public final int hashCode() {
        return ((((C20361.m46680(C20361.m46680(C20361.m46680((C20361.m46680(super.hashCode() * 31, 31, this.f21246) + this.f21245) * 31, 31, this.f21243), 31, this.f21247), 31, this.f21242) + (this.f21248 ? 1231 : 1237)) * 31) + (this.f21244 ? 1231 : 1237)) * 31) + (this.f21249 ? 1231 : 1237);
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final AbstractC3163 mo6366(int i) {
        return new C4758(i, clone());
    }

    @Override // l.AbstractC3577
    public final C19883 getIcon() {
        return C19883.f64239;
    }

    @Override // l.AbstractC3577
    /* renamed from: ܿ */
    public final String mo6371() {
        return C9045.m23341(new StringBuilder("ftps@"), this.f11359, " ");
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final void mo6367(AbstractActivityC3346 abstractActivityC3346) {
        m18611(abstractActivityC3346, this);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m18613(AbstractActivityC3346 abstractActivityC3346) {
        m18611(abstractActivityC3346, new C6875(-1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18611(final AbstractActivityC3346 abstractActivityC3346, C6875 c6875) {
        View m10216;
        if (abstractActivityC3346.getResources().getBoolean(R.bool.MT_Protector_res_0x7f050008)) {
            m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00b6);
        } else {
            m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00b7);
        }
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a026d);
        final EditText editText2 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0446);
        EditText editText3 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0670);
        EditText editText4 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0429);
        EditText editText5 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a04a5);
        EditText editText6 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a04a4);
        EditText editText7 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d7);
        final RadioButton radioButton = (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0479);
        final RadioButton radioButton2 = (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a047a);
        final RadioButton radioButton3 = (RadioButton) m10216.findViewById(R.id.radioButton3);
        final RadioButton radioButton4 = (RadioButton) m10216.findViewById(R.id.radioButton4);
        C2978 c2978 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a025f);
        C2978 c29782 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03d2);
        C2978 c29783 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a059e);
        C4988 m14473 = C4988.m14473(abstractActivityC3346, (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a062d), c6875);
        View view = m10216;
        textView.setText(C4925.m14327(c6875.f11356 == -1 ? R.string.MT_Protector_res_0x7f1205ad : R.string.MT_Protector_res_0x7f1202dd).concat(" FTPS"));
        editText.setText(c6875.f21246);
        editText2.setText(String.valueOf(c6875.f21245));
        editText3.setText(c6875.f21243.equals("anonymous") ? "" : c6875.f21243);
        editText4.setText(c6875.f21247);
        editText5.setText(c6875.f11354);
        editText6.setText(c6875.f11359);
        editText7.setText(c6875.f21242);
        radioButton.setChecked(c6875.f21248);
        radioButton2.setChecked(!c6875.f21248);
        radioButton3.setChecked(c6875.f21244);
        radioButton4.setChecked(!c6875.f21244);
        c2978.setChecked(c6875.f11358);
        c29782.setChecked(c6875.f11349);
        c29783.setChecked(c6875.f11350);
        c29782.setOnCheckedChangeListener(new C1845(1));
        AbstractC3577.m10936(editText7, abstractActivityC3346);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ܽܺ᩻
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton5 = radioButton;
                if (compoundButton == radioButton5) {
                    radioButton5 = radioButton2;
                }
                if (radioButton5.isChecked() == z) {
                    radioButton5.setChecked(!z);
                }
            }
        };
        radioButton.setOnCheckedChangeListener(onCheckedChangeListener);
        radioButton2.setOnCheckedChangeListener(onCheckedChangeListener);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: l.ᩳܺ᩻
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                RadioButton radioButton5 = radioButton3;
                RadioButton radioButton6 = compoundButton == radioButton5 ? radioButton4 : radioButton5;
                if (radioButton6.isChecked() == z) {
                    radioButton6.setChecked(!z);
                    boolean isChecked = radioButton5.isChecked();
                    EditText editText8 = editText2;
                    if (isChecked) {
                        if (editText8.getText().toString().equals("990")) {
                            editText8.setText("21");
                        }
                    } else if (editText8.getText().toString().equals("21")) {
                        editText8.setText("990");
                    }
                }
            }
        };
        radioButton3.setOnCheckedChangeListener(onCheckedChangeListener2);
        radioButton4.setOnCheckedChangeListener(onCheckedChangeListener2);
        AbstractC3577.m10934(editText, editText6);
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(view);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f1205fc, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44440(R.string.MT_Protector_res_0x7f1206b8, (DialogInterface.OnClickListener) null);
        buildDialog.m44428(false);
        DialogInterfaceC0206 m44438 = buildDialog.m44438();
        C5088.m14637(m44438);
        C4925.m14329(editText);
        final C17458 c17458 = new C17458(editText, editText7, editText2, editText3, editText4, editText5, editText6, radioButton, radioButton3, c2978, c29782, c29783, m14473);
        m44438.m1447().setOnClickListener(new ViewOnClickListenerC0705(c17458, c6875, m44438));
        m44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ܳܺ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C6875 c68752 = (C6875) C17458.this.get();
                if (c68752 == null) {
                    return;
                }
                AbstractActivityC3346 abstractActivityC33462 = abstractActivityC3346;
                if (C6326.m17600(abstractActivityC33462, c68752)) {
                    new C23808(abstractActivityC33462, c68752).m20274();
                }
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6875 m18610(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, RadioButton radioButton, RadioButton radioButton2, C2978 c2978, C2978 c29782, C2978 c29783, C4988 c4988) {
        int i;
        if (!AbstractC3577.m10942(editText) || !AbstractC3577.m10938(editText2)) {
            return null;
        }
        C6875 c6875 = new C6875(-1);
        c6875.f21246 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText3.getText().toString());
        } catch (NumberFormatException unused) {
            i = 21;
        }
        c6875.f21245 = i;
        c6875.f21243 = AbstractC3577.m10933(editText4, "anonymous");
        c6875.f21247 = editText5.getText().toString();
        c6875.f11354 = editText6.getText().toString();
        c6875.f11359 = AbstractC3577.m10933(editText7, c6875.f21246);
        c6875.f21242 = AbstractC3577.m10933(editText2, a.D);
        c6875.f21248 = radioButton.isChecked();
        c6875.f21244 = radioButton2.isChecked();
        c6875.f11358 = c2978.isChecked();
        c6875.f11349 = c29782.isChecked();
        c6875.f11350 = c29783.isChecked();
        c6875.m10945(c4988);
        return c6875;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18612(C17458 c17458, C6875 c6875, DialogInterfaceC0206 dialogInterfaceC0206) {
        C6875 c68752 = (C6875) c17458.get();
        if (c68752 == null) {
            return;
        }
        if (c6875.f11356 == -1) {
            C6875 c68753 = new C6875(AbstractC3577.m10943());
            c68753.mo6368(c68752);
            C12749.m31039(c68753);
        } else {
            c6875.mo6368(c68752);
            C12749.m31032();
        }
        dialogInterfaceC0206.dismiss();
    }
}
