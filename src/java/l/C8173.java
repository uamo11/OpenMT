package l;

/* compiled from: Y6P2 */
/* renamed from: l.۠۫ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8173 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21649(InterfaceC0463 interfaceC0463, InterfaceC0463 interfaceC04632) {
        String text = interfaceC0463.getText();
        String text2 = interfaceC04632.getText();
        if (!text.isEmpty() && !text2.isEmpty()) {
            char m19937 = C7416.m19937(1, text);
            char charAt = text2.charAt(0);
            boolean z = m21647(charAt) || interfaceC04632.getType() == 140 || interfaceC04632.getType() == 139;
            if (((m21647(m19937) || interfaceC0463.getType() == 140 || interfaceC0463.getType() == 139) && z) || ((interfaceC0463.getType() == 5 && z) || ((interfaceC0463.getType() == 138 && (z || charAt == '.')) || ((m19937 == '+' && charAt == '+') || ((m19937 == '-' && charAt == '-') || ((m19937 == '/' && (charAt == '/' || charAt == '*')) || ((m19937 == '<' && charAt == '!') || ((m19937 == '-' && charAt == '>') || ((m19937 == '?' && charAt == '.') || ((m19937 == '.' && charAt == '.') || ("+-*/%&|^!=<>?".indexOf(m19937) >= 0 && "=&|*<>?".indexOf(charAt) >= 0))))))))))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21647(char c) {
        return Character.isJavaIdentifierPart(c) || Character.isSurrogate(c) || c == '\\';
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21648(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n' || charAt == '\r' || charAt == 8232 || charAt == 8233) {
                return true;
            }
        }
        return false;
    }
}
