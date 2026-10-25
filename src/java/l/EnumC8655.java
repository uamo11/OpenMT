package l;

import bin.mt.plus.R;

/* compiled from: P735 */
/* renamed from: l.ۡۙܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum EnumC8655 {
    CONTAINS(1, R.string.MT_Protector_res_0x7f12091b, R.string.MT_Protector_res_0x7f1203bf),
    PREFIX(2, R.string.MT_Protector_res_0x7f12091e, R.string.MT_Protector_res_0x7f1203c1),
    SUFFIX(3, R.string.MT_Protector_res_0x7f12091c, R.string.MT_Protector_res_0x7f1203c3),
    EXACT(4, R.string.MT_Protector_res_0x7f12030e, R.string.MT_Protector_res_0x7f1203c0),
    WILDCARD(0, R.string.MT_Protector_res_0x7f120b82, R.string.MT_Protector_res_0x7f1203c4),
    REGEX(5, R.string.MT_Protector_res_0x7f1207ff, R.string.MT_Protector_res_0x7f1203c2);


    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f26419;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f26420;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f26421;

    EnumC8655(int i, int i2, int i3) {
        this.f26419 = i;
        this.f26420 = i2;
        this.f26421 = i3;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int m22418() {
        return this.f26419;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m22416() {
        return this.f26420;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m22417() {
        return this.f26421;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC8655 m22414(int i) {
        for (EnumC8655 enumC8655 : values()) {
            if (enumC8655.f26419 == i) {
                return enumC8655;
            }
        }
        return WILDCARD;
    }
}
