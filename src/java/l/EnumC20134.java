package l;

import bin.mt.plus.R;

/* compiled from: 819Z */
/* renamed from: l.᩶ۧᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum EnumC20134 {
    SUCCESS(R.string.MT_Protector_res_0x7f1209a4, new Object[0]),
    FAIL(R.string.MT_Protector_res_0x7f12099f, new Object[0]),
    FAIL_DIFFERENT_V1_V2(R.string.MT_Protector_res_0x7f1209a0, "V1", "V2"),
    FAIL_DIFFERENT_V1_V3(R.string.MT_Protector_res_0x7f1209a0, "V1", "V3"),
    FAIL_DIFFERENT_V1_V31(R.string.MT_Protector_res_0x7f1209a0, "V1", "V3.1"),
    FAIL_DIFFERENT_V2_V3(R.string.MT_Protector_res_0x7f1209a0, "V2", "V3"),
    FAIL_DIFFERENT_V2_V31(R.string.MT_Protector_res_0x7f1209a0, "V2", "V3.1"),
    FAIL_DIFFERENT_V3_V31(R.string.MT_Protector_res_0x7f1209a0, "V3", "V3.1"),
    FAIL_V1(R.string.MT_Protector_res_0x7f1209a2, "V1"),
    FAIL_V2(R.string.MT_Protector_res_0x7f1209a2, "V2"),
    FAIL_V3(R.string.MT_Protector_res_0x7f1209a2, "V3"),
    FAIL_V31(R.string.MT_Protector_res_0x7f1209a2, "V3.1"),
    FAIL_MISSING_V1(R.string.MT_Protector_res_0x7f1209a1, "V1"),
    FAIL_MISSING_V2(R.string.MT_Protector_res_0x7f1209a1, "V2"),
    FAIL_MISSING_V3(R.string.MT_Protector_res_0x7f1209a1, "V3"),
    FAIL_MISSING_V31(R.string.MT_Protector_res_0x7f1209a1, "V3.1");


    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object[] f65194;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f65195;

    EnumC20134(int i, Object... objArr) {
        this.f65195 = i;
        this.f65194 = objArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m46381() {
        return this == SUCCESS;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m46380() {
        return C4925.m14306(this.f65195, this.f65194);
    }
}
