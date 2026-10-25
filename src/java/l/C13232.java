package l;

/* compiled from: G7AI */
/* renamed from: l.۬ܽۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13232 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f39603;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f39604 = "single_value";

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f39605;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f39606;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f39607;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f39608;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11159 f39609;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f39610;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f39611;

    public C13232(String str, int i, int i2, int i3, int i4, String str2) {
        this.f39608 = i;
        this.f39607 = i2;
        this.f39606 = str;
        this.f39611 = i3;
        this.f39605 = str2;
        this.f39603 = i4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32096(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        if (str.regionMatches(true, 0, "0x", 0, 2)) {
            return C9042.m23315(this.f39608, str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f39606);
        sb.append("/");
        String str2 = this.f39605;
        sb.append(str2);
        return sb.toString().startsWith(str) || str2.startsWith(str);
    }
}
