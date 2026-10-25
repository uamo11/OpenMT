package l;

/* compiled from: 3AYO */
/* renamed from: l.۠ۧᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum EnumC8139 {
    V1_V2_V3("V1 + V2 + V3", true, true, true),
    V1_V2("V1 + V2", true, true, false),
    V1_V3("V1 + V3", true, false, true),
    V1("V1", true, false, false),
    V2_V3("V2 + V3 (Android 7.0+)", false, true, true),
    V2("V2 (Android 7.0+)", false, true, false),
    V3("V3 (Android 9.0+)", false, false, true);


    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f25123;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f25124;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f25125;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f25126;

    EnumC8139(String str, boolean z, boolean z2, boolean z3) {
        this.f25123 = str;
        this.f25125 = z;
        this.f25126 = z2;
        this.f25124 = z3;
    }
}
