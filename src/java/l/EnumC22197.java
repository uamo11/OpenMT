package l;

/* compiled from: T9Q9 */
/* renamed from: l.᩹ۢۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC22197 implements InterfaceC13460 {
    JSON_FORMAT_UNKNOWN(0),
    ALLOW(1),
    LEGACY_BEST_EFFORT(2);


    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f71997 = 1;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC22197[] f71998;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f71999 = 2;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f72000;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f72002 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f72005;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC22197.class.getName());
        f72000 = new C21492();
        f71998 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f72005;
    }

    @Deprecated
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC22197 m49861(int i) {
        return m49859(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC22197 m49859(int i) {
        if (i == 0) {
            return JSON_FORMAT_UNKNOWN;
        }
        if (i == 1) {
            return ALLOW;
        }
        if (i != 2) {
            return null;
        }
        return LEGACY_BEST_EFFORT;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m49863() {
        return f72000;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m49865() {
        return (C2235) m49862().m23854().get(ordinal());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m49864() {
        return m49862();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m49862() {
        C17757 c17757;
        int i = C5969.f18301;
        c17757 = C10702.f32245;
        return (C9291) c17757.m41597().get(5);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC22197 m49860(C2235 c2235) {
        if (c2235.getType() != m49862()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f71998[c2235.m7418()];
    }

    EnumC22197(int i) {
        this.f72005 = i;
    }
}
