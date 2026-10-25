package l;

import bin.mt.plus.R;

/* compiled from: V7AU */
/* renamed from: l.᩸ᩴۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21766 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f69741;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15414 f69742;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC1180 f69743;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f69744;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f69745;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object[] f69746;

    public C21766(boolean z, EnumC1180 enumC1180, int i, String str, Object[] objArr, C15414 c15414) {
        this.f69741 = z;
        this.f69743 = enumC1180;
        this.f69745 = i;
        this.f69744 = str;
        this.f69746 = objArr;
        this.f69742 = c15414;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21766 m49092(C15414 c15414) {
        return new C21766(true, EnumC1180.OK, 0, "", new Object[0], c15414);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21766 m49091(EnumC1180 enumC1180, int i, Object... objArr) {
        return new C21766(false, enumC1180, i, "", objArr, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21766 m49090() {
        return new C21766(false, EnumC1180.UNAUTHORIZED, R.string.MT_Protector_res_0x7f12080f, "auth_clock_skew", new Object[0], null);
    }
}
