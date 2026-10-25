package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.analytics.pro.am;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* compiled from: 1AFL */
/* renamed from: l.ܳᩴ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14719 extends AbstractC3577 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f44947;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public String f44948;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public String f44949;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public String f44950;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public String f44951;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public String f44952;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public String f44953;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f44954;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f44955;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f44956;

    @Override // l.AbstractC3577
    /* renamed from: ۜ */
    public final boolean mo10944() {
        return true;
    }

    @Override // l.AbstractC3577
    /* renamed from: ᩳ */
    public final String mo6372() {
        return "SFTP";
    }

    public C14719(int i) {
        super(i);
        this.f44950 = "";
        this.f44955 = 22;
        this.f44949 = "root";
        this.f44948 = "";
        this.f44953 = "";
        this.f44951 = "";
        this.f44956 = false;
        this.f44947 = a.D;
        this.f44954 = -1;
        this.f44952 = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14719(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC3577.m10941(jSONObject, "rk", "3");
        AbstractC3577.m10941(jSONObject, "ip", "8");
        AbstractC3577.m10937(jSONObject, "hs", am.av);
        AbstractC3577.m10937(jSONObject, "mt", "b");
        this.f44950 = "";
        this.f44955 = 22;
        this.f44949 = "root";
        this.f44948 = "";
        this.f44953 = "";
        this.f44951 = "";
        this.f44956 = false;
        this.f44947 = a.D;
        this.f44954 = -1;
        this.f44952 = "";
        this.f44950 = jSONObject.getString("1");
        this.f44955 = jSONObject.getInt("2");
        this.f44949 = jSONObject.getString("4");
        this.f44948 = jSONObject.getString("5");
        this.f44953 = jSONObject.getString("6");
        this.f44951 = jSONObject.getString(am.aF, "");
        this.f44956 = jSONObject.getBoolean("7");
        this.f44947 = jSONObject.getString("9");
        if (jSONObject.contains("e")) {
            this.f44954 = jSONObject.getInt("e");
            this.f44952 = jSONObject.getString("f", "");
        }
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final String mo6365() {
        if (this.f44955 == 22) {
            return "sftp://" + this.f44949 + "@" + this.f44950;
        }
        return "sftp://" + this.f44949 + "@" + this.f44950 + ":" + this.f44955;
    }

    @Override // l.AbstractC3577
    /* renamed from: ܳ */
    public final JSONObject mo6369() {
        JSONObject mo6369 = super.mo6369();
        mo6369.put("1", this.f44950);
        mo6369.put("2", this.f44955);
        mo6369.put("4", this.f44949);
        mo6369.put("5", this.f44948);
        mo6369.put("6", this.f44953);
        mo6369.put(am.aF, this.f44951);
        mo6369.put("7", this.f44956);
        mo6369.put("9", this.f44947);
        int i = this.f44954;
        if (i != -1) {
            mo6369.put("e", i);
            mo6369.put("f", this.f44952);
        }
        return mo6369;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C2292 m35018() {
        C2292 m45193 = C19660.m45193(this.f44954, this.f44952);
        int i = this.f44954;
        int i2 = m45193.f11356;
        if (i != i2) {
            this.f44954 = i2;
        }
        return m45193;
    }

    @Override // l.AbstractC3577
    public final String getName() {
        return this.f11359;
    }

    @Override // l.AbstractC3577
    /* renamed from: ܽ */
    public final String mo6370() {
        String str = "sftp://" + this.f44949 + "@" + this.f44950;
        return str.endsWith("/") ? C15472.m36561(1, 0, str) : str;
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final void mo6368(AbstractC3577 abstractC3577) {
        super.mo6368(abstractC3577);
        if (abstractC3577 instanceof C14719) {
            C14719 c14719 = (C14719) abstractC3577;
            this.f44950 = c14719.f44950;
            this.f44955 = c14719.f44955;
            this.f44949 = c14719.f44949;
            this.f44948 = c14719.f44948;
            this.f44953 = c14719.f44953;
            this.f44951 = c14719.f44951;
            this.f44956 = c14719.f44956;
            this.f44947 = c14719.f44947;
            this.f44954 = c14719.f44954;
            this.f44952 = c14719.f44952;
        }
    }

    @Override // l.AbstractC3577
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14719.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C14719 c14719 = (C14719) obj;
        return this.f44955 == c14719.f44955 && this.f44956 == c14719.f44956 && C11003.equals(this.f44950, c14719.f44950) && C11003.equals(this.f44949, c14719.f44949) && C11003.equals(this.f44948, c14719.f44948) && C11003.equals(this.f44953, c14719.f44953) && C11003.equals(this.f44951, c14719.f44951) && C11003.equals(this.f44947, c14719.f44947) && Integer.valueOf(this.f44954).equals(Integer.valueOf(c14719.f44954)) && C11003.equals(this.f44952, c14719.f44952);
    }

    @Override // l.AbstractC3577
    public final int hashCode() {
        return C11003.hashCode(this.f44952) + ((C20361.m46680((C20361.m46680(C20361.m46680(C20361.m46680(C20361.m46680((C20361.m46680(super.hashCode() * 31, 31, this.f44950) + this.f44955) * 31, 31, this.f44949), 31, this.f44948), 31, this.f44953), 31, this.f44951) + (this.f44956 ? 1231 : 1237)) * 31, 31, this.f44947) + this.f44954) * 31);
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final AbstractC3163 mo6366(int i) {
        return new C18954(i, clone());
    }

    @Override // l.AbstractC3577
    public final C19883 getIcon() {
        return C19883.f64182;
    }

    @Override // l.AbstractC3577
    /* renamed from: ܿ */
    public final String mo6371() {
        return C9045.m23341(new StringBuilder("sftp@"), this.f11359, " ");
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final void mo6367(AbstractActivityC3346 abstractActivityC3346) {
        m35015(abstractActivityC3346, this);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m35017(AbstractActivityC3346 abstractActivityC3346) {
        m35015(abstractActivityC3346, new C14719(-1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35015(final AbstractActivityC3346 abstractActivityC3346, final C14719 c14719) {
        C2292 c2292;
        C2978 c2978;
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00f6);
        C19226 c19226 = (C19226) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02aa);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        final EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a026d);
        final EditText editText2 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0446);
        EditText editText3 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0670);
        EditText editText4 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0429);
        final EditText editText5 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02ad);
        EditText editText6 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02ae);
        EditText editText7 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a04a5);
        final EditText editText8 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a04a4);
        EditText editText9 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d7);
        C2978 c29782 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02ed);
        C2978 c29783 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a025f);
        C2978 c29784 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03d2);
        C2978 c29785 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a059e);
        ((TextInputLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d0)).setEndIconOnClickListener(new View.OnClickListener() { // from class: l.۫ۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final EditText editText10 = editText;
                final EditText editText11 = editText2;
                final EditText editText12 = editText8;
                C21071.m47956(AbstractActivityC3346.this, new InterfaceC13041() { // from class: l.۟ۘ᩻
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        C6959 c6959 = (C6959) obj;
                        editText10.setText(c6959.m18799());
                        editText11.setText(String.valueOf(c6959.m18801()));
                        editText12.setText(c6959.m18800());
                    }
                });
            }
        });
        int i = c14719.f44954;
        if (i != -1) {
            c2292 = C12749.m31050(i);
            if (c2292 == null) {
                c2292 = C12749.m31042(c14719.f44952);
            }
        } else {
            c2292 = null;
        }
        c19226.m44366(c2292);
        c19226.setPadding(c19226.getPaddingLeft(), c19226.getPaddingTop() + C11266.m27878(6.0f), c19226.getPaddingRight(), c19226.getPaddingBottom());
        View findViewById = m10216.findViewById(R.id.button1);
        final View findViewById2 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a02ee);
        final View findViewById3 = m10216.findViewById(R.id.textInputLayout4);
        C4988 m14473 = C4988.m14473(abstractActivityC3346, (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a062d), c14719);
        textView.setText(C4925.m14327(c14719.f11356 == -1 ? R.string.MT_Protector_res_0x7f1205ad : R.string.MT_Protector_res_0x7f1202dd).concat(" SFTP"));
        editText.setText(c14719.f44950);
        editText2.setText(String.valueOf(c14719.f44955));
        editText3.setText(c14719.f44949);
        editText4.setText(c14719.f44948);
        editText5.setText(c14719.f44953);
        editText6.setText(c14719.f44951);
        c29783.setChecked(c14719.f11358);
        c29784.setChecked(c14719.f11349);
        c29785.setChecked(c14719.f11350);
        c29784.setOnCheckedChangeListener(new C1845(1));
        AbstractC3577.m10936(editText9, abstractActivityC3346);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ۤۘ᩻
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                View view = findViewById2;
                View view2 = findViewById3;
                if (z) {
                    view.setVisibility(0);
                    view2.setVisibility(8);
                } else {
                    view.setVisibility(8);
                    view2.setVisibility(0);
                }
            }
        };
        onCheckedChangeListener.onCheckedChanged(c29782, c14719.f44956);
        c29782.setChecked(c14719.f44956);
        c29782.setOnCheckedChangeListener(onCheckedChangeListener);
        editText7.setText(c14719.f11354);
        editText8.setText(c14719.f11359);
        editText9.setText(c14719.f44947);
        AbstractC3577.m10934(editText, editText8);
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f1205fc, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44440(R.string.MT_Protector_res_0x7f1206b8, (DialogInterface.OnClickListener) null);
        buildDialog.m44428(false);
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        C5088.m14637(m44438);
        if (abstractActivityC3346 instanceof Main) {
            Main main = (Main) abstractActivityC3346;
            C5242 m133 = main.m133();
            C6273 m131 = main.m131();
            m133.m1667((InterfaceC23586) m44438);
            c2978 = c29785;
            m133.mo1669((Object) null);
            m133.m1668(m44438, new InterfaceC1008() { // from class: l.ۛۘ᩻
                @Override // l.InterfaceC1008
                /* renamed from: ֫ */
                public final void mo1617(Object obj) {
                    String str = (String) obj;
                    if (str != null) {
                        new C2020(abstractActivityC3346, str, editText5).m20274();
                    }
                }
            });
            findViewById.setOnClickListener(new ViewOnClickListenerC11108(1, m131));
        } else {
            c2978 = c29785;
            findViewById.setEnabled(false);
            findViewById.setAlpha(0.0f);
        }
        C4925.m14329(editText);
        final C11465 c11465 = new C11465(editText, editText3, c29782, editText5, editText4, editText9, editText2, editText6, editText7, editText8, c19226, c29783, c29784, c2978, m14473);
        m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.᩺ۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14719.m35016(C11465.this, c14719, m44438);
            }
        });
        m44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ܰۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14719 c147192 = (C14719) C11465.this.get();
                if (c147192 == null) {
                    return;
                }
                AbstractActivityC3346 abstractActivityC33462 = abstractActivityC3346;
                if (C6326.m17600(abstractActivityC33462, c147192)) {
                    new C17542(abstractActivityC33462, c147192).m20274();
                }
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14719 m35014(EditText editText, EditText editText2, C2978 c2978, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, EditText editText8, EditText editText9, C19226 c19226, C2978 c29782, C2978 c29783, C2978 c29784, C4988 c4988) {
        int i;
        if (!AbstractC3577.m10942(editText) || !AbstractC3577.m10939(editText2, R.string.MT_Protector_res_0x7f1206d3)) {
            return null;
        }
        if (c2978.isChecked()) {
            if (!AbstractC3577.m10939(editText3, R.string.MT_Protector_res_0x7f1206d0)) {
                return null;
            }
        } else if (!AbstractC3577.m10939(editText4, R.string.MT_Protector_res_0x7f1206d1)) {
            return null;
        }
        if (!AbstractC3577.m10938(editText5)) {
            return null;
        }
        C14719 c14719 = new C14719(-1);
        c14719.f44950 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText6.getText().toString());
        } catch (NumberFormatException unused) {
            i = 22;
        }
        c14719.f44955 = i;
        c14719.f44949 = editText2.getText().toString();
        c14719.f44948 = editText4.getText().toString();
        c14719.f44953 = editText3.getText().toString();
        c14719.f44951 = editText7.getText().toString();
        if (c14719.f44953.length() > 20480) {
            c14719.f44953 = c14719.f44953.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
        c14719.f44956 = c2978.isChecked();
        c14719.f11354 = editText8.getText().toString();
        c14719.f11359 = AbstractC3577.m10933(editText9, c14719.f44950);
        c14719.f44947 = AbstractC3577.m10933(editText5, a.D);
        C2292 m44365 = c19226.m44365();
        if (m44365 != null) {
            c14719.f44954 = m44365.f11356;
            c14719.f44952 = m44365.mo6365();
        }
        c14719.f11358 = c29782.isChecked();
        c14719.f11349 = c29783.isChecked();
        c14719.f11350 = c29784.isChecked();
        c14719.m10945(c4988);
        return c14719;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m35016(C11465 c11465, C14719 c14719, DialogInterfaceC0206 dialogInterfaceC0206) {
        C14719 c147192 = (C14719) c11465.get();
        if (c147192 == null) {
            return;
        }
        if (c14719.f11356 == -1) {
            C14719 c147193 = new C14719(AbstractC3577.m10943());
            c147193.mo6368(c147192);
            C12749.m31039(c147193);
        } else {
            c14719.mo6368(c147192);
            C12749.m31032();
        }
        dialogInterfaceC0206.dismiss();
    }
}
