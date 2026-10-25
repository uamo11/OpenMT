package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.commonsdk.framework.UMModuleRegister;

/* compiled from: 27JL */
/* renamed from: l.ۖۘ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2292 extends AbstractC3577 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f7409;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public String f7410;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f7411;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public String f7412;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public String f7413;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f7414;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public String f7415;

    public C2292(int i) {
        super(i);
        this.f7409 = "";
        this.f7411 = 22;
        this.f7415 = "root";
        this.f7413 = "";
        this.f7410 = "";
        this.f7412 = "";
        this.f7414 = false;
    }

    public C2292(JSONObject jSONObject) {
        super(jSONObject);
        this.f7409 = "";
        this.f7411 = 22;
        this.f7415 = "root";
        this.f7413 = "";
        this.f7410 = "";
        this.f7412 = "";
        this.f7414 = false;
        this.f7409 = jSONObject.getString("1");
        this.f7411 = jSONObject.getInt("2");
        this.f7415 = jSONObject.getString("3");
        this.f7413 = jSONObject.getString("4");
        this.f7410 = jSONObject.getString("5");
        this.f7412 = jSONObject.getString("6", "");
        this.f7414 = jSONObject.getBoolean("7");
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final String mo6365() {
        if (this.f7411 == 22) {
            return "sshj://" + this.f7415 + "@" + this.f7409;
        }
        return "sshj://" + this.f7415 + "@" + this.f7409 + ":" + this.f7411;
    }

    @Override // l.AbstractC3577
    /* renamed from: ܳ */
    public final JSONObject mo6369() {
        JSONObject mo6369 = super.mo6369();
        mo6369.put("1", this.f7409);
        mo6369.put("2", this.f7411);
        mo6369.put("3", this.f7415);
        mo6369.put("4", this.f7413);
        mo6369.put("5", this.f7410);
        mo6369.put("6", this.f7412);
        mo6369.put("7", this.f7414);
        return mo6369;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m7556() {
        if (this.f7412.isEmpty()) {
            return null;
        }
        return this.f7412;
    }

    @Override // l.AbstractC3577
    /* renamed from: ᩳ */
    public final String mo6372() {
        return C4925.m14327(R.string.MT_Protector_res_0x7f1204c8);
    }

    @Override // l.AbstractC3577
    public final String getName() {
        return this.f11359;
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final void mo6368(AbstractC3577 abstractC3577) {
        super.mo6368(abstractC3577);
        if (abstractC3577 instanceof C2292) {
            C2292 c2292 = (C2292) abstractC3577;
            this.f7409 = c2292.f7409;
            this.f7411 = c2292.f7411;
            this.f7415 = c2292.f7415;
            this.f7413 = c2292.f7413;
            this.f7410 = c2292.f7410;
            this.f7412 = c2292.f7412;
            this.f7414 = c2292.f7414;
        }
    }

    @Override // l.AbstractC3577
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2292.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C2292 c2292 = (C2292) obj;
        return this.f7411 == c2292.f7411 && this.f7414 == c2292.f7414 && C11003.equals(this.f7409, c2292.f7409) && C11003.equals(this.f7415, c2292.f7415) && C11003.equals(this.f7413, c2292.f7413) && C11003.equals(this.f7410, c2292.f7410) && C11003.equals(this.f7412, c2292.f7412);
    }

    @Override // l.AbstractC3577
    public final int hashCode() {
        return C20361.m46680(C20361.m46680(C20361.m46680(C20361.m46680((C20361.m46680(super.hashCode() * 31, 31, this.f7409) + this.f7411) * 31, 31, this.f7415), 31, this.f7413), 31, this.f7410), 31, this.f7412) + (this.f7414 ? 1231 : 1237);
    }

    @Override // l.AbstractC3577
    /* renamed from: ܽ */
    public final String mo6370() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final AbstractC3163 mo6366(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3577
    public final C19883 getIcon() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3577
    /* renamed from: ܿ */
    public final String mo6371() {
        throw new UnsupportedOperationException();
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final void mo6367(AbstractActivityC3346 abstractActivityC3346) {
        m7552(abstractActivityC3346, this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7554(ActivityC19932 activityC19932) {
        m7552(activityC19932, new C2292(-1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7552(final AbstractActivityC3346 abstractActivityC3346, final C2292 c2292) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00f6);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d5).setVisibility(8);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d7).setVisibility(8);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d1).setVisibility(8);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a03d2).setVisibility(8);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a059e).setVisibility(8);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a025f).setVisibility(8);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a062d).setVisibility(8);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        final EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a026d);
        final EditText editText2 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0446);
        EditText editText3 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0670);
        EditText editText4 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0429);
        final EditText editText5 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02ad);
        EditText editText6 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02ae);
        final EditText editText7 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a04a4);
        C2978 c2978 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02ed);
        ((TextInputLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d0)).setEndIconOnClickListener(new View.OnClickListener() { // from class: l.ܽۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final EditText editText8 = editText;
                final EditText editText9 = editText2;
                final EditText editText10 = editText7;
                C21071.m47956(AbstractActivityC3346.this, new InterfaceC13041() { // from class: l.᩷ۘ᩻
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        C6959 c6959 = (C6959) obj;
                        editText8.setText(c6959.m18799());
                        editText9.setText(String.valueOf(c6959.m18801()));
                        editText10.setText(c6959.m18800());
                    }
                });
            }
        });
        View findViewById = m10216.findViewById(R.id.button1);
        final View findViewById2 = m10216.findViewById(R.id.MT_Protector_res_0x7f0a02ee);
        final View findViewById3 = m10216.findViewById(R.id.textInputLayout4);
        StringBuilder sb = new StringBuilder();
        sb.append(C4925.m14327(c2292.f11356 == -1 ? R.string.MT_Protector_res_0x7f1205ad : R.string.MT_Protector_res_0x7f1202dd));
        sb.append(" ");
        sb.append(C4925.m14327(R.string.MT_Protector_res_0x7f1204c8));
        textView.setText(sb.toString());
        editText.setText(c2292.f7409);
        editText2.setText(String.valueOf(c2292.f7411));
        editText3.setText(c2292.f7415);
        editText4.setText(c2292.f7413);
        editText5.setText(c2292.f7410);
        editText6.setText(c2292.f7412);
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.ᩳۘ᩻
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
        onCheckedChangeListener.onCheckedChanged(c2978, c2292.f7414);
        c2978.setChecked(c2292.f7414);
        c2978.setOnCheckedChangeListener(onCheckedChangeListener);
        editText7.setText(c2292.f11359);
        AbstractC3577.m10934(editText, editText7);
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f1205fc, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44440(R.string.MT_Protector_res_0x7f1206b8, (DialogInterface.OnClickListener) null);
        buildDialog.m44428(false);
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        C5088.m14637(m44438);
        if (abstractActivityC3346 instanceof ActivityC19932) {
            ActivityC19932 activityC19932 = (ActivityC19932) abstractActivityC3346;
            C5242 m45914 = activityC19932.m45914();
            C6273 m45912 = activityC19932.m45912();
            m45914.m1667((InterfaceC23586) m44438);
            m45914.mo1669((Object) null);
            m45914.m1668(m44438, new InterfaceC1008() { // from class: l.ܿۘ᩻
                @Override // l.InterfaceC1008
                /* renamed from: ֫ */
                public final void mo1617(Object obj) {
                    String str = (String) obj;
                    if (str != null) {
                        new C9348(abstractActivityC3346, str, editText5).m20274();
                    }
                }
            });
            findViewById.setOnClickListener(new ViewOnClickListenerC13382(4, m45912));
        } else {
            findViewById.setEnabled(false);
            findViewById.setAlpha(0.0f);
        }
        C4925.m14329(editText);
        final C14285 c14285 = new C14285(editText, editText3, c2978, editText5, editText4, editText2, editText6, editText7);
        m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.᩻ۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2292.m7555(C14285.this, c2292, abstractActivityC3346, m44438);
            }
        });
        m44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ۜۘ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2292 c22922 = (C2292) C14285.this.get();
                if (c22922 == null) {
                    return;
                }
                AbstractActivityC3346 abstractActivityC33462 = abstractActivityC3346;
                if (C6326.m17600(abstractActivityC33462, c22922)) {
                    new C15696(abstractActivityC33462, c22922).m20274();
                }
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2292 m7551(EditText editText, EditText editText2, C2978 c2978, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7) {
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
        C2292 c2292 = new C2292(-1);
        c2292.f7409 = editText.getText().toString();
        try {
            i = Integer.parseInt(editText5.getText().toString());
        } catch (NumberFormatException unused) {
            i = 22;
        }
        c2292.f7411 = i;
        c2292.f7415 = editText2.getText().toString();
        c2292.f7413 = editText4.getText().toString();
        c2292.f7410 = editText3.getText().toString();
        c2292.f7412 = editText6.getText().toString();
        if (c2292.f7410.length() > 20480) {
            c2292.f7410 = c2292.f7410.substring(0, UMModuleRegister.PUSH_EVENT_VALUE_HIGH);
        }
        c2292.f7414 = c2978.isChecked();
        c2292.f11359 = AbstractC3577.m10933(editText7, c2292.f7409);
        return c2292;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m7555(C14285 c14285, C2292 c2292, AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206) {
        C2292 c22922 = (C2292) c14285.get();
        if (c22922 == null) {
            return;
        }
        if (c2292.f11356 == -1) {
            C2292 c22923 = new C2292(AbstractC3577.m10943());
            c22923.mo6368(c22922);
            C12749.m31039(c22923);
            if (abstractActivityC3346 instanceof ActivityC19932) {
                ((ActivityC19932) abstractActivityC3346).m45913();
            }
        } else {
            c2292.mo6368(c22922);
            C12749.m31032();
            if (abstractActivityC3346 instanceof ActivityC19932) {
                ((ActivityC19932) abstractActivityC3346).m45911();
            }
        }
        dialogInterfaceC0206.dismiss();
    }
}
