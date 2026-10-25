package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '۟' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: L9QC */
/* renamed from: l.۟֨ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class EnumC7132 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21887;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21888;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21889;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21890;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21891;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21892;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21893;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21894;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21895;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21896;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21897;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21898;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21899;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21900;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21901;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21902;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC7132[] f21903;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21904;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final EnumC7132 f21905;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC1694 f21906;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f21907;

    /* renamed from: ܿ */
    public boolean mo16157() {
        return true;
    }

    public /* synthetic */ EnumC7132(String str, int i, EnumC1694 enumC1694, int i2, C9955 c9955) {
        this(str, i, enumC1694, i2);
    }

    public static EnumC7132 valueOf(String str) {
        return (EnumC7132) Enum.valueOf(EnumC7132.class, str);
    }

    public static EnumC7132[] values() {
        return (EnumC7132[]) f21903.clone();
    }

    static {
        EnumC7132 enumC7132 = new EnumC7132("DOUBLE", 0, EnumC1694.DOUBLE, 1);
        f21897 = enumC7132;
        EnumC7132 enumC71322 = new EnumC7132("FLOAT", 1, EnumC1694.FLOAT, 5);
        f21895 = enumC71322;
        EnumC1694 enumC1694 = EnumC1694.LONG;
        final int i = 2;
        EnumC7132 enumC71323 = new EnumC7132("INT64", 2, enumC1694, 0);
        f21892 = enumC71323;
        final int i2 = 3;
        EnumC7132 enumC71324 = new EnumC7132("UINT64", 3, enumC1694, 0);
        f21891 = enumC71324;
        EnumC1694 enumC16942 = EnumC1694.INT;
        EnumC7132 enumC71325 = new EnumC7132("INT32", 4, enumC16942, 0);
        f21898 = enumC71325;
        EnumC7132 enumC71326 = new EnumC7132("FIXED64", 5, enumC1694, 1);
        f21890 = enumC71326;
        EnumC7132 enumC71327 = new EnumC7132("FIXED32", 6, enumC16942, 5);
        f21893 = enumC71327;
        EnumC7132 enumC71328 = new EnumC7132("BOOL", 7, EnumC1694.BOOLEAN, 0);
        f21889 = enumC71328;
        final EnumC1694 enumC16943 = EnumC1694.STRING;
        final String str = "STRING";
        final int i3 = 8;
        EnumC7132 enumC71329 = new EnumC7132(str, i3, enumC16943, i) { // from class: l.ۛ֨ۖ
            @Override // l.EnumC7132
            /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
            public boolean mo16157() {
                return false;
            }

            {
                C9955 c9955 = null;
            }
        };
        f21899 = enumC71329;
        final EnumC1694 enumC16944 = EnumC1694.MESSAGE;
        final String str2 = "GROUP";
        final int i4 = 9;
        EnumC7132 enumC713210 = new EnumC7132(str2, i4, enumC16944, i2) { // from class: l.ۨ֨ۖ
            @Override // l.EnumC7132
            /* renamed from: ܿ */
            public boolean mo16157() {
                return false;
            }

            {
                C9955 c9955 = null;
            }
        };
        f21904 = enumC713210;
        final String str3 = "MESSAGE";
        final int i5 = 10;
        final int i6 = 2;
        EnumC7132 enumC713211 = new EnumC7132(str3, i5, enumC16944, i6) { // from class: l.᩺֨ۖ
            @Override // l.EnumC7132
            /* renamed from: ܿ */
            public boolean mo16157() {
                return false;
            }

            {
                C9955 c9955 = null;
            }
        };
        f21887 = enumC713211;
        final EnumC1694 enumC16945 = EnumC1694.BYTE_STRING;
        final String str4 = "BYTES";
        final int i7 = 11;
        EnumC7132 enumC713212 = new EnumC7132(str4, i7, enumC16945, i6) { // from class: l.ܰ֨ۖ
            @Override // l.EnumC7132
            /* renamed from: ܿ */
            public boolean mo16157() {
                return false;
            }

            {
                C9955 c9955 = null;
            }
        };
        f21888 = enumC713212;
        EnumC7132 enumC713213 = new EnumC7132("UINT32", 12, enumC16942, 0);
        f21905 = enumC713213;
        EnumC7132 enumC713214 = new EnumC7132("ENUM", 13, EnumC1694.ENUM, 0);
        f21896 = enumC713214;
        EnumC7132 enumC713215 = new EnumC7132("SFIXED32", 14, enumC16942, 5);
        f21894 = enumC713215;
        EnumC7132 enumC713216 = new EnumC7132("SFIXED64", 15, enumC1694, 1);
        f21900 = enumC713216;
        EnumC7132 enumC713217 = new EnumC7132("SINT32", 16, enumC16942, 0);
        f21902 = enumC713217;
        EnumC7132 enumC713218 = new EnumC7132("SINT64", 17, enumC1694, 0);
        f21901 = enumC713218;
        f21903 = new EnumC7132[]{enumC7132, enumC71322, enumC71323, enumC71324, enumC71325, enumC71326, enumC71327, enumC71328, enumC71329, enumC713210, enumC713211, enumC713212, enumC713213, enumC713214, enumC713215, enumC713216, enumC713217, enumC713218};
    }

    public EnumC7132(String str, int i, EnumC1694 enumC1694, int i2) {
        this.f21906 = enumC1694;
        this.f21907 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC1694 m19146() {
        return this.f21906;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m19147() {
        return this.f21907;
    }
}
