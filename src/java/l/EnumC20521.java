package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۤ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: H44W */
/* renamed from: l.᩷֡۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class EnumC20521 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC20521 f66117;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC20521 f66118;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC20521 f66119;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC20521 f66120;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC20521 f66121;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC20521 f66122;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC20521 f66123;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC20521[] f66124;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC11091 f66125;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f66126;

    public static EnumC20521 valueOf(String str) {
        return (EnumC20521) Enum.valueOf(EnumC20521.class, str);
    }

    public static EnumC20521[] values() {
        return (EnumC20521[]) f66124.clone();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC20521[] m47008() {
        return new EnumC20521[]{f66120, f66121, f66122, f66117, f66123, f66119, f66118};
    }

    static {
        EnumC11091 enumC11091 = EnumC11091.INVOKE;
        f66120 = new EnumC20521("SUPER", 0, enumC11091, false);
        f66121 = new EnumC20521("UNBOUND", 1, enumC11091, true);
        f66122 = new EnumC20521("STATIC", 2, enumC11091, false);
        f66117 = new EnumC20521("BOUND", 3, enumC11091, false);
        EnumC11091 enumC110912 = EnumC11091.NEW;
        f66123 = new EnumC20521("IMPLICIT_INNER", 4, enumC110912, false);
        f66119 = new EnumC20521("TOPLEVEL", 5, enumC110912, false);
        f66118 = new EnumC20521("ARRAY_CTOR", 6, enumC110912, false);
        f66124 = m47008();
    }

    public EnumC20521(String str, int i, EnumC11091 enumC11091, boolean z) {
        this.f66125 = enumC11091;
        this.f66126 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m47009() {
        return this.f66126;
    }
}
