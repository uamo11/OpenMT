package l;

import android.text.TextUtils;
import bin.mt.plus.R;

/* compiled from: V685 */
/* renamed from: l.ᩴܶۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18840 implements InterfaceC7550 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C18840 f59427;

    @Override // l.InterfaceC7550
    /* renamed from: ֫ */
    public final CharSequence mo7073(C2095 c2095) {
        C19546 c19546 = (C19546) c2095;
        if (TextUtils.isEmpty(c19546.m44959())) {
            return c19546.m6886().getString(R.string.MT_Protector_res_0x7f120700);
        }
        return c19546.m44959();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18840 m43526() {
        if (f59427 == null) {
            f59427 = new C18840();
        }
        return f59427;
    }
}
