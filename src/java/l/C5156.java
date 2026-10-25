package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: NA5M */
/* renamed from: l.ۚۚ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5156 extends AbstractC3577 {

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final C17209 f16117;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final C17209 f16118;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f16119;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f16120;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public String f16121;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public String f16122;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public String f16123;

    @Override // l.AbstractC3577
    /* renamed from: ᩳ */
    public final String mo6372() {
        return "WebDav";
    }

    public C5156(int i) {
        super(i);
        this.f16123 = "";
        this.f16122 = "";
        this.f16119 = "";
        this.f16121 = "";
        this.f16120 = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5156(JSONObject jSONObject) {
        super(jSONObject);
        AbstractC3577.m10941(jSONObject, "rk", "2");
        AbstractC3577.m10941(jSONObject, "ip", "5");
        AbstractC3577.m10937(jSONObject, "hs", "7");
        AbstractC3577.m10937(jSONObject, "mt", "8");
        this.f16123 = "";
        this.f16122 = "";
        this.f16119 = "";
        this.f16121 = "";
        this.f16120 = false;
        this.f16123 = m14737(jSONObject.getString("1"));
        this.f16122 = jSONObject.getString("3");
        this.f16119 = jSONObject.getString("4");
        this.f16121 = jSONObject.getString("9", "");
        this.f16120 = jSONObject.getBoolean("6");
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final String mo6365() {
        if (TextUtils.isEmpty(this.f16122)) {
            return "adv:" + this.f16123;
        }
        return "adv:" + this.f16122 + "@" + this.f16123;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17209 m14739() {
        return this.f16120 ? f16118 : f16117;
    }

    @Override // l.AbstractC3577
    /* renamed from: ܳ */
    public final JSONObject mo6369() {
        JSONObject mo6369 = super.mo6369();
        mo6369.put("1", this.f16123);
        mo6369.put("3", this.f16122);
        mo6369.put("4", this.f16119);
        mo6369.put("6", this.f16120);
        mo6369.put("9", this.f16121);
        return mo6369;
    }

    @Override // l.AbstractC3577
    public final String getName() {
        return this.f11359;
    }

    @Override // l.AbstractC3577
    /* renamed from: ܽ */
    public final String mo6370() {
        return this.f16123;
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final void mo6368(AbstractC3577 abstractC3577) {
        super.mo6368(abstractC3577);
        if (abstractC3577 instanceof C5156) {
            C5156 c5156 = (C5156) abstractC3577;
            this.f16123 = c5156.f16123;
            this.f16122 = c5156.f16122;
            this.f16119 = c5156.f16119;
            this.f16121 = c5156.f16121;
            this.f16120 = c5156.f16120;
        }
    }

    @Override // l.AbstractC3577
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5156.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C5156 c5156 = (C5156) obj;
        return this.f16120 == c5156.f16120 && C11003.equals(this.f16123, c5156.f16123) && C11003.equals(this.f16122, c5156.f16122) && C11003.equals(this.f16119, c5156.f16119) && C11003.equals(this.f16121, c5156.f16121);
    }

    @Override // l.AbstractC3577
    public final int hashCode() {
        return C20361.m46680(C20361.m46680(C20361.m46680(C20361.m46680(super.hashCode() * 31, 31, this.f16123), 31, this.f16122), 31, this.f16119), 31, this.f16121) + (this.f16120 ? 1231 : 1237);
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final AbstractC3163 mo6366(int i) {
        return new C7978(i, clone());
    }

    @Override // l.AbstractC3577
    public final C19883 getIcon() {
        return C19883.f64216;
    }

    @Override // l.AbstractC3577
    /* renamed from: ܿ */
    public final String mo6371() {
        return C9045.m23341(new StringBuilder("webdav@"), this.f11359, " ");
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final void mo6367(AbstractActivityC3346 abstractActivityC3346) {
        m14735(abstractActivityC3346, this);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m14738(AbstractActivityC3346 abstractActivityC3346) {
        m14735(abstractActivityC3346, new C5156(-1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14735(final AbstractActivityC3346 abstractActivityC3346, C5156 c5156) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d0093);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631);
        EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a066b);
        EditText editText2 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0670);
        EditText editText3 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0429);
        EditText editText4 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0131);
        EditText editText5 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a04a5);
        EditText editText6 = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a04a4);
        C2978 c2978 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0653);
        C2978 c29782 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a025f);
        C2978 c29783 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03d2);
        C4988 m14473 = C4988.m14473(abstractActivityC3346, (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a062d), c5156);
        textView.setText(C4925.m14327(c5156.f11356 == -1 ? R.string.MT_Protector_res_0x7f1205ad : R.string.MT_Protector_res_0x7f1202dd).concat(" WebDav"));
        editText.setText(c5156.f16123);
        editText2.setText(c5156.f16122);
        editText3.setText(c5156.f16119);
        editText4.setText(c5156.f16121);
        editText5.setText(c5156.f11354);
        editText6.setText(c5156.f11359);
        c2978.setChecked(c5156.f16120);
        c29782.setChecked(c5156.f11358);
        c29783.setChecked(c5156.f11349);
        c29783.setOnCheckedChangeListener(new C1845(1));
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC20611(1, editText));
        editText.addTextChangedListener(new C18562(c2978));
        AbstractC3577.m10935(editText, editText6, new C10985(2));
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f1205fc, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44440(R.string.MT_Protector_res_0x7f1206b8, (DialogInterface.OnClickListener) null);
        buildDialog.m44428(false);
        DialogInterfaceC0206 m44438 = buildDialog.m44438();
        C5088.m14637(m44438);
        C4925.m14329(editText);
        final C2334 c2334 = new C2334(editText, editText2, editText3, editText4, editText5, editText6, c2978, c29782, c29783, m14473);
        m44438.m1447().setOnClickListener(new ViewOnClickListenerC9777(c2334, c5156, m44438, 1));
        m44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ۘۚ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5156 c51562 = (C5156) C2334.this.get();
                if (c51562 == null) {
                    return;
                }
                AbstractActivityC3346 abstractActivityC33462 = abstractActivityC3346;
                if (C6326.m17600(abstractActivityC33462, c51562)) {
                    new C19268(abstractActivityC33462, c51562).m20274();
                }
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14734(C2334 c2334, C5156 c5156, DialogInterfaceC0206 dialogInterfaceC0206) {
        C5156 c51562 = (C5156) c2334.get();
        if (c51562 == null) {
            return;
        }
        if (c5156.f11356 == -1) {
            C5156 c51563 = new C5156(AbstractC3577.m10943());
            c51563.mo6368(c51562);
            C12749.m31039(c51563);
        } else {
            c5156.mo6368(c51562);
            C12749.m31032();
        }
        dialogInterfaceC0206.dismiss();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m14737(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return "";
        }
        if (!C9679.m24619("http://", trim) && !C9679.m24619("https://", trim)) {
            trim = "http://" + C9679.m24618(trim);
        }
        return (trim.equalsIgnoreCase("http://") || trim.equalsIgnoreCase("https://")) ? "" : C9679.m24610(trim);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m14736(CharSequence charSequence) {
        int indexOf;
        int indexOf2;
        int i;
        int indexOf3;
        String str = ((Object) charSequence) + "/";
        String str2 = null;
        if (str != null && (indexOf2 = str.indexOf("//")) != -1 && (indexOf3 = str.indexOf("/", (i = indexOf2 + 2))) != -1) {
            str2 = str.substring(i, indexOf3);
        }
        if (str2 != null && (indexOf = str2.indexOf(58)) != -1) {
            str2 = str2.substring(0, indexOf);
        }
        return str2 == null ? charSequence : str2;
    }

    static {
        C17915 c17915 = new C17915();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c17915.m41896(20000L, timeUnit);
        c17915.m41904(60000L, timeUnit);
        c17915.m41906(120000L, timeUnit);
        c17915.m41898(new C7138());
        c17915.m41903(new C5860());
        C17209 m41894 = c17915.m41894();
        f16117 = m41894;
        try {
            TrustManager[] trustManagerArr = {new C0216()};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            C17915 m40470 = m41894.m40470();
            m40470.m41899(new C13487(sSLContext.getSocketFactory()), (X509TrustManager) trustManagerArr[0]);
            m40470.m41902(new C15738());
            f16118 = m40470.m41894();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5156 m14732(EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, C2978 c2978, C2978 c29782, C2978 c29783, C4988 c4988) {
        editText.setText(m14737(editText.getText().toString()));
        if (!AbstractC3577.m10939(editText, R.string.MT_Protector_res_0x7f1206d2)) {
            return null;
        }
        C5156 c5156 = new C5156(-1);
        c5156.f16123 = editText.getText().toString();
        c5156.f16122 = editText2.getText().toString();
        c5156.f16119 = editText3.getText().toString();
        c5156.f16121 = editText4.getText().toString();
        c5156.f11354 = editText5.getText().toString();
        c5156.f11359 = editText6.length() > 0 ? editText6.getText().toString() : m14736((CharSequence) c5156.f16123).toString();
        c5156.f16120 = c2978.isChecked();
        c5156.f11358 = c29782.isChecked();
        c5156.f11349 = c29783.isChecked();
        c5156.m10945(c4988);
        return c5156;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14733(EditText editText, boolean z) {
        if (z) {
            return;
        }
        editText.setText(m14737(editText.getText().toString()));
    }
}
