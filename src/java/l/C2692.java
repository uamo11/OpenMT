package l;

/* compiled from: 177I */
/* renamed from: l.ۖᩳۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2692 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8425(String str) {
        int length = str.length();
        while (length > 0) {
            char charAt = str.charAt(length - 1);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            length--;
        }
        return length == str.length() ? str : str.substring(0, length);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8426(InterfaceC7099 interfaceC7099) {
        String mo18742 = interfaceC7099.mo18742();
        return (mo18742 == null || mo18742.isEmpty()) ? "default" : mo18742;
    }
}
