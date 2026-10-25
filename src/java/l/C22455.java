package l;

import android.app.Activity;
import android.view.View;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;

/* compiled from: N7PP */
/* renamed from: l.᩹ᩳܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22455 extends C11146 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C21750 f72732 = new C21750();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final JSONObject f72733;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f72734;

    @Override // l.C11146
    /* renamed from: ᩻ */
    public final boolean mo14042() {
        return false;
    }

    public C22455(JSONObject jSONObject) {
        super(27);
        this.f72733 = jSONObject;
    }

    @Override // l.C11146
    /* renamed from: ᩳ */
    public final JSONObject mo27664() {
        return this.f72733;
    }

    @Override // l.C11146
    /* renamed from: ֫ */
    public final void mo14040(View view, InterfaceC1973 interfaceC1973) {
        C12392 mo6482;
        C11459 m28259;
        if (this.f72734 || (mo6482 = interfaceC1973.mo6482()) == null) {
            return;
        }
        JSONObject jSONObject = this.f72733;
        String string = jSONObject.getString(am.av);
        String string2 = jSONObject.getString("b");
        boolean z = jSONObject.getBoolean(am.aF);
        int i = jSONObject.getInt("d");
        int i2 = jSONObject.getInt("e");
        boolean z2 = jSONObject.getBoolean("f", true);
        if (string.isEmpty()) {
            return;
        }
        if (!z2) {
            string = C3939.m11985(string);
        }
        try {
            if (z) {
                m28259 = C11459.m28259(8, string);
            } else {
                m28259 = C11459.m28259(74, string);
            }
            C11459 c11459 = m28259;
            if (z2) {
                C13574.m32628(c11459, string2);
            }
            int[] m30369 = mo6482.m30369();
            if (i == 0 && m30369[0] == m30369[1]) {
                C21374.m48457(R.string.MT_Protector_res_0x7f1206f7);
                return;
            }
            boolean z3 = i == 2;
            Activity m15313 = C5350.m15313(mo6482.getContext());
            C11003.requireNonNull(m15313);
            AbstractActivityC3346 abstractActivityC3346 = (AbstractActivityC3346) m15313;
            InterfaceC7785 m30436 = mo6482.m30436();
            new C1288(this, new C14134(mo6482, abstractActivityC3346, R.string.MT_Protector_res_0x7f1207a7, new C0582()), m30436, m30436.mo26548(), c11459, i, m30369, string2, z2, i2, z3, C7850.toPath(mo6482.getContext().getCacheDir()).resolve("replace-output"), mo6482, abstractActivityC3346).m20274();
        } catch (Exception e) {
            C21374.m48459((CharSequence) e.toString());
        }
    }
}
