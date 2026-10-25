package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '᩶' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: L9QC */
/* renamed from: l.ܿ۠ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class EnumC17216 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC17216 f52820;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC17216 f52821;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC17216[] f52822;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC17216 f52823;

    /* renamed from: ֫ */
    public abstract Object mo27168(AbstractC7297 abstractC7297);

    public EnumC17216(String str, int i) {
    }

    public /* synthetic */ EnumC17216(String str, int i, C9955 c9955) {
        this(str, i);
    }

    public static EnumC17216 valueOf(String str) {
        return (EnumC17216) Enum.valueOf(EnumC17216.class, str);
    }

    public static EnumC17216[] values() {
        return (EnumC17216[]) f52822.clone();
    }

    static {
        final String str = "LOOSE";
        final int i = 0;
        EnumC17216 enumC17216 = new EnumC17216(str, i) { // from class: l.ۧ۠ۖ
            {
                C9955 c9955 = null;
            }

            @Override // l.EnumC17216
            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            public Object mo27168(AbstractC7297 abstractC7297) {
                return abstractC7297.mo19551();
            }
        };
        f52821 = enumC17216;
        final String str2 = "STRICT";
        final int i2 = 1;
        EnumC17216 enumC172162 = new EnumC17216(str2, i2) { // from class: l.ܽ۠ۖ
            {
                C9955 c9955 = null;
            }

            @Override // l.EnumC17216
            /* renamed from: ֫ */
            public Object mo27168(AbstractC7297 abstractC7297) {
                return abstractC7297.mo19561();
            }
        };
        f52820 = enumC172162;
        final String str3 = "LAZY";
        final int i3 = 2;
        EnumC17216 enumC172163 = new EnumC17216(str3, i3) { // from class: l.ᩳ۠ۖ
            {
                C9955 c9955 = null;
            }

            @Override // l.EnumC17216
            /* renamed from: ֫ */
            public Object mo27168(AbstractC7297 abstractC7297) {
                return abstractC7297.mo19566();
            }
        };
        f52823 = enumC172163;
        f52822 = new EnumC17216[]{enumC17216, enumC172162, enumC172163};
    }
}
