package l;

/* compiled from: I770 */
/* renamed from: l.ܶ᩷ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15474 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36565(InterfaceC18444 interfaceC18444, String str) {
        String name = interfaceC18444.getName();
        int indexOf = str.indexOf(40);
        if (indexOf != name.length() || !str.startsWith(name)) {
            return false;
        }
        int i = indexOf + 1;
        for (CharSequence charSequence : interfaceC18444.mo3565()) {
            if (!m36564(str, charSequence, i)) {
                return false;
            }
            i += charSequence.length();
        }
        if (i >= str.length() || str.charAt(i) != ')') {
            return false;
        }
        int i2 = i + 1;
        String mo3568 = interfaceC18444.mo3568();
        return m36564(str, mo3568, i2) && mo3568.length() + i2 == str.length();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36564(String str, CharSequence charSequence, int i) {
        if (i < 0 || charSequence.length() + i > str.length()) {
            return false;
        }
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (str.charAt(i + i2) != charSequence.charAt(i2)) {
                return false;
            }
        }
        return true;
    }
}
