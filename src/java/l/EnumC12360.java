package l;

/* compiled from: 17QY */
/* renamed from: l.۫ۧۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum EnumC12360 {
    UPPERCASE,
    LOWERCASE,
    UPPER_CAMEL,
    LOWER_CAMEL;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC12360 m29991(String str) {
        if (str.isEmpty()) {
            throw new C17619();
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isAlphabetic(charAt)) {
                if (z4) {
                    z = Character.isUpperCase(charAt);
                    z4 = false;
                }
                z2 |= Character.isUpperCase(charAt);
                z3 |= Character.isLowerCase(charAt);
            }
        }
        return z ? (z3 || str.length() == 1) ? UPPER_CAMEL : UPPERCASE : z2 ? LOWER_CAMEL : LOWERCASE;
    }
}
