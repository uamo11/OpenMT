package l;

/* compiled from: T9Q9 */
/* renamed from: l.ۖۡۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum EnumC2421 implements InterfaceC13460 {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);


    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f7704 = 1;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC2421[] f7705;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int f7706 = 0;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13292 f7707;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int f7708 = 2;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f7712;

    static {
        C20663.m47279(EnumC6551.PUBLIC, EnumC2421.class.getName());
        f7707 = new C15825();
        f7705 = values();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f7712;
    }

    @Deprecated
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC2421 m7849(int i) {
        return m7847(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC2421 m7847(int i) {
        if (i == 0) {
            return STRING;
        }
        if (i == 1) {
            return CORD;
        }
        if (i != 2) {
            return null;
        }
        return STRING_PIECE;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static InterfaceC13292 m7851() {
        return f7707;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m7853() {
        return (C2235) m7850().m23854().get(ordinal());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9291 m7852() {
        return m7850();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C9291 m7850() {
        C17757 c17757;
        int i = C3126.f9770;
        c17757 = C10702.f32218;
        return (C9291) c17757.m41597().get(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC2421 m7848(C2235 c2235) {
        if (c2235.getType() != m7850()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f7705[c2235.m7418()];
    }

    EnumC2421(int i) {
        this.f7712 = i;
    }
}
