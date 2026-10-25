package l;

/* compiled from: T9Q9 */
/* renamed from: l.᩹ۡۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC22176 implements InterfaceC13460 {
    RETENTION_UNKNOWN(0),
    RETENTION_RUNTIME(1),
    RETENTION_SOURCE(2);


    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f71947 = 1;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC22176[] f71948;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f71949 = 0;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f71950;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f71952 = 2;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f71955;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC22176.class.getName());
        f71950 = new C21471();
        f71948 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f71955;
    }

    @Deprecated
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC22176 m49818(int i) {
        return m49816(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC22176 m49816(int i) {
        if (i == 0) {
            return RETENTION_UNKNOWN;
        }
        if (i == 1) {
            return RETENTION_RUNTIME;
        }
        if (i != 2) {
            return null;
        }
        return RETENTION_SOURCE;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m49820() {
        return f71950;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m49822() {
        return (C2235) m49819().m23854().get(ordinal());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m49821() {
        return m49819();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m49819() {
        C17757 c17757;
        int i = C3126.f9770;
        c17757 = C10702.f32218;
        return (C9291) c17757.m41597().get(2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC22176 m49817(C2235 c2235) {
        if (c2235.getType() != m49819()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f71948[c2235.m7418()];
    }

    EnumC22176(int i) {
        this.f71955 = i;
    }
}
