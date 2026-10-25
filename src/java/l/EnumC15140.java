package l;

/* compiled from: T9Q9 */
/* renamed from: l.ܶۢۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public enum EnumC15140 implements InterfaceC13460 {
    FIELD_PRESENCE_UNKNOWN(0),
    EXPLICIT(1),
    IMPLICIT(2),
    LEGACY_REQUIRED(3);


    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f46262 = 1;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f46264 = 2;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int f46265 = 3;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f46267 = 0;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f46268;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC15140[] f46271;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f46272;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC15140.class.getName());
        f46268 = new C8086();
        f46271 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f46272;
    }

    @Deprecated
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC15140 m35841(int i) {
        return m35839(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC15140 m35839(int i) {
        if (i == 0) {
            return FIELD_PRESENCE_UNKNOWN;
        }
        if (i == 1) {
            return EXPLICIT;
        }
        if (i == 2) {
            return IMPLICIT;
        }
        if (i != 3) {
            return null;
        }
        return LEGACY_REQUIRED;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m35843() {
        return f46268;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m35845() {
        return (C2235) m35842().m23854().get(ordinal());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m35844() {
        return m35842();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m35842() {
        C17757 c17757;
        int i = C5969.f18301;
        c17757 = C10702.f32245;
        return (C9291) c17757.m41597().get(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC15140 m35840(C2235 c2235) {
        if (c2235.getType() != m35842()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f46271[c2235.m7418()];
    }

    EnumC15140(int i) {
        this.f46272 = i;
    }
}
