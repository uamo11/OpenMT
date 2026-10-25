package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.analytics.pro.am;

/* compiled from: V89B */
/* renamed from: l.۬ۖ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12834 extends AbstractC3577 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f38539;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public String f38540;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public String f38541;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public String f38542;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f38543;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public String f38544;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f38545;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12834(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC3577.m10941(jSONObject, "rk", "6");
        AbstractC3577.m10941(jSONObject, "ip", "7");
        AbstractC3577.m10937(jSONObject, "hs", "8");
        this.f38545 = jSONObject.getInt("1", 0);
        this.f38539 = jSONObject.getString("2");
        this.f38541 = jSONObject.getString("3");
        this.f38544 = jSONObject.getString("4");
        this.f38540 = jSONObject.getString("5");
        this.f38542 = jSONObject.getString("9", "");
        this.f38543 = jSONObject.getBoolean(am.av, false);
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final String mo6365() {
        return AbstractC5073.m14618(this.f38545).mo1209() + "://" + this.f38544 + ":" + this.f38540;
    }

    @Override // l.AbstractC3577
    /* renamed from: ܳ */
    public final JSONObject mo6369() {
        JSONObject mo6369 = super.mo6369();
        mo6369.put("1", this.f38545);
        mo6369.put("2", this.f38539);
        mo6369.put("3", this.f38541);
        mo6369.put("4", this.f38544);
        mo6369.put("5", this.f38540);
        mo6369.put("9", this.f38542);
        mo6369.put(am.av, this.f38543);
        return mo6369;
    }

    @Override // l.AbstractC3577
    /* renamed from: ᩳ */
    public final String mo6372() {
        return C4925.m14327(R.string.MT_Protector_res_0x7f120702);
    }

    @Override // l.AbstractC3577
    public final String getName() {
        return this.f11359;
    }

    @Override // l.AbstractC3577
    /* renamed from: ܽ */
    public final String mo6370() {
        return AbstractC5073.m14618(this.f38545).mo1209() + "://" + this.f38540;
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final void mo6368(AbstractC3577 abstractC3577) {
        super.mo6368(abstractC3577);
        if (abstractC3577 instanceof C12834) {
            C12834 c12834 = (C12834) abstractC3577;
            this.f38545 = c12834.f38545;
            this.f38539 = c12834.f38539;
            this.f38541 = c12834.f38541;
            this.f38544 = c12834.f38544;
            this.f38540 = c12834.f38540;
            this.f38542 = c12834.f38542;
            this.f38543 = c12834.f38543;
        }
    }

    @Override // l.AbstractC3577
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12834.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C12834 c12834 = (C12834) obj;
        return this.f38545 == c12834.f38545 && C11003.equals(this.f38539, c12834.f38539) && C11003.equals(this.f38541, c12834.f38541) && C11003.equals(this.f38544, c12834.f38544) && C11003.equals(this.f38540, c12834.f38540) && C11003.equals(this.f38542, c12834.f38542) && Boolean.valueOf(this.f38543).equals(Boolean.valueOf(c12834.f38543));
    }

    @Override // l.AbstractC3577
    public final int hashCode() {
        return Boolean.valueOf(this.f38543).hashCode() + C20361.m46680(C20361.m46680(C20361.m46680(C20361.m46680(C20361.m46680(((super.hashCode() * 31) + this.f38545) * 31, 31, this.f38539), 31, this.f38541), 31, this.f38544), 31, this.f38540), 31, this.f38542);
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final AbstractC3163 mo6366(int i) {
        return new C7190(i, clone());
    }

    @Override // l.AbstractC3577
    public final C19883 getIcon() {
        return C19883.f64246;
    }

    @Override // l.AbstractC3577
    /* renamed from: ܿ */
    public final String mo6371() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC5073.m14618(this.f38545).mo1209());
        sb.append("@");
        return C9045.m23341(sb, this.f11359, " ");
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final void mo6367(AbstractActivityC3346 abstractActivityC3346) {
        m31209(abstractActivityC3346, this);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31212(AbstractActivityC3346 abstractActivityC3346) {
        m31209(abstractActivityC3346, new C12834(-1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31209(final AbstractActivityC3346 abstractActivityC3346, C12834 c12834) {
        C0133 c0133;
        C2251 c2251;
        C6484 c6484;
        C15655 c15655;
        C20596 c20596;
        C19185 c19185;
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00f1);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0010);
        EditText editText2 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a04f2);
        EditText editText3 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00a1);
        EditText editText4 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0194);
        EditText editText5 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a012f);
        EditText editText6 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a04a5);
        EditText editText7 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a04a4);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0468);
        C2978 c2978 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0430);
        C2978 c29782 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a025f);
        C2978 c29783 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03d2);
        C4988 m14473 = C4988.m14473(abstractActivityC3346, (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a062d), c12834);
        ((TextInputLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d7)).setEndIconOnClickListener(new ViewOnClickListenerC6289(3, abstractActivityC3346));
        StringBuilder sb = new StringBuilder();
        sb.append(C4925.m14327(c12834.f11356 == -1 ? R.string.MT_Protector_res_0x7f1205ad : R.string.MT_Protector_res_0x7f1202dd));
        sb.append(" ");
        sb.append(C4925.m14327(R.string.MT_Protector_res_0x7f120702));
        textView.setText(sb.toString());
        editText3.setText(c12834.f38540);
        editText4.setText(c12834.f38544);
        editText5.setText(c12834.f38542);
        editText.setText(c12834.f38539);
        editText2.setText(c12834.f38541);
        editText6.setText(c12834.f11354);
        editText7.setText(c12834.f11359);
        c29782.setChecked(c12834.f11358);
        c29783.setChecked(c12834.f11349);
        c2978.setChecked(c12834.f38543);
        c29783.setOnCheckedChangeListener(new C1845(1));
        AbstractC3577.m10934(editText3, editText7);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0257).setOnClickListener(new ViewOnClickListenerC17806(3, abstractActivityC3346));
        final C14950 c14950 = new C14950(c2978, autoCompleteTextView, (TextInputLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d0), (TextInputLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d2), (TextInputLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d3), abstractActivityC3346, editText, editText2, editText3, editText4, editText7);
        c0133 = C0133.f1248;
        c2251 = C2251.f7325;
        c6484 = C6484.f20016;
        c15655 = C15655.f48179;
        c20596 = C20596.f66300;
        c19185 = C19185.f60439;
        final AbstractC5073[] abstractC5073Arr = {c0133, c2251, c6484, c15655, c20596, c19185};
        autoCompleteTextView.setAdapter(new C20065(abstractActivityC3346, abstractC5073Arr));
        AbstractC5073 m14618 = AbstractC5073.m14618(c12834.f38545);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.᩸ۖ᩻
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                C14950.this.accept(abstractC5073Arr[i]);
            }
        });
        autoCompleteTextView.setText((CharSequence) m14618.mo1208(), false);
        autoCompleteTextView.setKeyListener(null);
        c14950.accept(m14618);
        autoCompleteTextView.setPadding(autoCompleteTextView.getPaddingLeft(), autoCompleteTextView.getPaddingTop() + C11266.m27878(6.0f), autoCompleteTextView.getPaddingRight(), autoCompleteTextView.getPaddingBottom());
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f1205fc, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44440(R.string.MT_Protector_res_0x7f1206b8, (DialogInterface.OnClickListener) null);
        buildDialog.m44428(false);
        DialogInterfaceC0206 m44438 = buildDialog.m44438();
        C5088.m14637(m44438);
        C4925.m14329(editText);
        final C22007 c22007 = new C22007(editText3, editText4, editText, editText2, autoCompleteTextView, editText5, editText6, editText7, c29782, c29783, c2978, m14473);
        m44438.m1447().setOnClickListener(new ViewOnClickListenerC8940(c22007, c12834, m44438, 1));
        m44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.᩶ۖ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C12834 c128342 = (C12834) C22007.this.get();
                if (c128342 == null) {
                    return;
                }
                AbstractActivityC3346 abstractActivityC33462 = abstractActivityC3346;
                if (C6326.m17600(abstractActivityC33462, c128342)) {
                    new C2957(abstractActivityC33462, c128342).m20274();
                }
            }
        });
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12834 m31211(EditText editText, EditText editText2, EditText editText3, EditText editText4, AutoCompleteTextView autoCompleteTextView, EditText editText5, EditText editText6, EditText editText7, C2978 c2978, C2978 c29782, C2978 c29783, C4988 c4988) {
        if (!AbstractC3577.m10939(editText, R.string.MT_Protector_res_0x7f120304) || !AbstractC3577.m10939(editText2, R.string.MT_Protector_res_0x7f120304) || !AbstractC3577.m10939(editText3, R.string.MT_Protector_res_0x7f120304) || !AbstractC3577.m10939(editText4, R.string.MT_Protector_res_0x7f120304)) {
            return null;
        }
        C12834 c12834 = new C12834(-1);
        c12834.f38545 = ((AbstractC5073) autoCompleteTextView.getTag()).mo1210();
        c12834.f38540 = editText.getText().toString();
        c12834.f38544 = editText2.getText().toString();
        c12834.f38542 = editText5.getText().toString();
        c12834.f38539 = editText3.getText().toString();
        c12834.f38541 = editText4.getText().toString();
        c12834.f11354 = editText6.getText().toString();
        c12834.f11359 = AbstractC3577.m10933(editText7, c12834.f38540);
        c12834.f11358 = c2978.isChecked();
        c12834.f11349 = c29782.isChecked();
        c12834.f38543 = c29783.getVisibility() == 0 && c29783.isChecked();
        c12834.m10945(c4988);
        return c12834;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31210(C22007 c22007, C12834 c12834, DialogInterfaceC0206 dialogInterfaceC0206) {
        C12834 c128342 = (C12834) c22007.get();
        if (c128342 == null) {
            return;
        }
        if (c12834.f11356 == -1) {
            C12834 c128343 = new C12834(AbstractC3577.m10943());
            c128343.mo6368(c128342);
            C12749.m31039(c128343);
        } else {
            c12834.mo6368(c128342);
            C12749.m31032();
        }
        dialogInterfaceC0206.dismiss();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31207(String str, ClientConfiguration clientConfiguration) {
        if (str.toLowerCase().startsWith("https://")) {
            clientConfiguration.m168(Protocol.HTTPS);
            str = str.substring(8);
        } else if (str.toLowerCase().startsWith("http://")) {
            clientConfiguration.m168(Protocol.HTTP);
            str = str.substring(7);
        } else {
            clientConfiguration.m168(Protocol.HTTPS);
        }
        return str.endsWith("/") ? C15472.m36561(1, 0, str) : str;
    }
}
