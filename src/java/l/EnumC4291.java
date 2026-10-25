package l;

/* compiled from: FBIL */
/* renamed from: l.ۙ֡ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum EnumC4291 {
    ascii,
    utf,
    fallback;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4291 m12872(String str) {
        if (str.equals("US-ASCII")) {
            return ascii;
        }
        if (str.startsWith("UTF-")) {
            return utf;
        }
        return fallback;
    }
}
