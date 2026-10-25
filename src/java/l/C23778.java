package l;

import android.text.TextUtils;
import bin.mt.plus.R;

/* compiled from: C682 */
/* renamed from: l.᩻ܶۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23778 implements InterfaceC7550 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C23778 f76972;

    @Override // l.InterfaceC7550
    /* renamed from: ֫ */
    public final CharSequence mo7073(C2095 c2095) {
        C6845 c6845 = (C6845) c2095;
        if (TextUtils.isEmpty(c6845.m18529())) {
            return c6845.m6886().getString(R.string.MT_Protector_res_0x7f120700);
        }
        return c6845.m18529();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23778 m52449() {
        if (f76972 == null) {
            f76972 = new C23778();
        }
        return f76972;
    }
}
