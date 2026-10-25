package l;

/* compiled from: S776 */
/* renamed from: l.᩶ᩳۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20331 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f65637;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f65638;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f65639;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f65640;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Integer f65641;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f65642;

    public C20331(String str, String str2, Integer num, boolean z, boolean z2, String str3) {
        this.f65640 = str;
        this.f65642 = str2;
        this.f65641 = num;
        this.f65639 = z;
        this.f65637 = z2;
        this.f65638 = str3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20331 m46642(int i, String str, String str2) {
        return new C20331(str, str2, Integer.valueOf(i), false, true, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20331 m46641(int i, String str) {
        return new C20331(str, null, Integer.valueOf(i), true, true, "VALUE_XML_TRUNCATED");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20331 m46643(String str) {
        return new C20331(str, null, null, false, false, "VALUE_XML_TOO_LARGE");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20331 m46644(String str, String str2) {
        return new C20331(str, null, null, false, false, str2);
    }
}
