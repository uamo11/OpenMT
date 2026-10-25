package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۨ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: B9OU */
/* renamed from: l.ۜ᩵ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class EnumC6964 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21459;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21460;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC6964[] f21461;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21462;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21463;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21464;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21465;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21466;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21467;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21468;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC6964 f21469;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Class f21470;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Class f21471;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f21472;

    public static EnumC6964 valueOf(String str) {
        return (EnumC6964) Enum.valueOf(EnumC6964.class, str);
    }

    public static EnumC6964[] values() {
        return (EnumC6964[]) f21461.clone();
    }

    static {
        EnumC6964 enumC6964 = new EnumC6964("VOID", 0, Void.class, Void.class, null);
        f21459 = enumC6964;
        Class cls = Integer.TYPE;
        EnumC6964 enumC69642 = new EnumC6964("INT", 1, cls, Integer.class, 0);
        f21465 = enumC69642;
        EnumC6964 enumC69643 = new EnumC6964("LONG", 2, Long.TYPE, Long.class, 0L);
        f21469 = enumC69643;
        EnumC6964 enumC69644 = new EnumC6964("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f21462 = enumC69644;
        EnumC6964 enumC69645 = new EnumC6964("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f21466 = enumC69645;
        EnumC6964 enumC69646 = new EnumC6964("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f21460 = enumC69646;
        EnumC6964 enumC69647 = new EnumC6964("STRING", 6, String.class, String.class, "");
        f21463 = enumC69647;
        EnumC6964 enumC69648 = new EnumC6964("BYTE_STRING", 7, AbstractC5886.class, AbstractC5886.class, AbstractC5886.f18080);
        f21467 = enumC69648;
        EnumC6964 enumC69649 = new EnumC6964("ENUM", 8, cls, Integer.class, null);
        f21464 = enumC69649;
        EnumC6964 enumC696410 = new EnumC6964("MESSAGE", 9, Object.class, Object.class, null);
        f21468 = enumC696410;
        f21461 = new EnumC6964[]{enumC6964, enumC69642, enumC69643, enumC69644, enumC69645, enumC69646, enumC69647, enumC69648, enumC69649, enumC696410};
    }

    public EnumC6964(String str, int i, Class cls, Class cls2, Object obj) {
        this.f21470 = cls;
        this.f21471 = cls2;
        this.f21472 = obj;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object m18806() {
        return this.f21472;
    }

    public Class getType() {
        return this.f21470;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Class m18804() {
        return this.f21471;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m18805(Class cls) {
        return this.f21470.isAssignableFrom(cls);
    }
}
