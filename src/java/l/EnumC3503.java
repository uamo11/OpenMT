package l;

/* compiled from: X441 */
/* renamed from: l.ۗ᩸۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum EnumC3503 {
    RELEASE_0,
    RELEASE_1,
    RELEASE_2,
    RELEASE_3,
    RELEASE_4,
    RELEASE_5,
    RELEASE_6,
    RELEASE_7,
    RELEASE_8,
    RELEASE_9,
    RELEASE_10,
    RELEASE_11,
    RELEASE_12,
    RELEASE_13,
    RELEASE_14,
    RELEASE_15,
    RELEASE_16,
    RELEASE_17;


    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final EnumC3503 f11122 = m10690();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static EnumC3503 m10694() {
        return RELEASE_17;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC3503 m10690() {
        return RELEASE_10;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static EnumC3503 m10695() {
        return f11122;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10687(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() == 0) {
            return false;
        }
        int codePointAt = charSequence2.codePointAt(0);
        if (!Character.isJavaIdentifierStart(codePointAt)) {
            return false;
        }
        int charCount = Character.charCount(codePointAt);
        while (charCount < charSequence2.length()) {
            int codePointAt2 = charSequence2.codePointAt(charCount);
            if (!Character.isJavaIdentifierPart(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m10693(CharSequence charSequence) {
        return m10692(charSequence, m10694());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10692(CharSequence charSequence, EnumC3503 enumC3503) {
        for (String str : charSequence.toString().split("\\.", -1)) {
            if (!m10687(str) || m10688(str, enumC3503)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m10691(CharSequence charSequence) {
        return m10688(charSequence, m10694());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10688(CharSequence charSequence, EnumC3503 enumC3503) {
        String charSequence2 = charSequence.toString();
        charSequence2.getClass();
        switch (charSequence2) {
            case "volatile":
            case "synchronized":
            case "double":
            case "extends":
            case "import":
            case "native":
            case "public":
            case "return":
            case "implements":
            case "static":
            case "switch":
            case "throws":
            case "finally":
            case "package":
            case "protected":
            case "continue":
            case "private":
            case "do":
            case "if":
            case "for":
            case "int":
            case "new":
            case "try":
            case "byte":
            case "case":
            case "char":
            case "else":
            case "goto":
            case "long":
            case "null":
            case "this":
            case "true":
            case "void":
            case "boolean":
            case "break":
            case "catch":
            case "class":
            case "const":
            case "false":
            case "final":
            case "float":
            case "short":
            case "super":
            case "throw":
            case "while":
            case "interface":
            case "instanceof":
            case "transient":
            case "default":
            case "abstract":
                return true;
            case "assert":
                return enumC3503.compareTo(RELEASE_4) >= 0;
            case "_":
                return enumC3503.compareTo(RELEASE_9) >= 0;
            case "enum":
                return enumC3503.compareTo(RELEASE_5) >= 0;
            case "strictfp":
                return enumC3503.compareTo(RELEASE_2) >= 0;
            default:
                return false;
        }
    }
}
