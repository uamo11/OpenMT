package l;

import java.io.IOException;

/* compiled from: L73L */
/* renamed from: l.ۚۙܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5127 implements InterfaceC7961 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m14678(IOException iOException, StringBuilder sb) {
        sb.append(iOException.getMessage());
        return sb.toString();
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14679(int i, String str, String str2) {
        int upperCase;
        int upperCase2;
        int i2 = 0;
        while (i2 < str2.length()) {
            if (i >= str.length()) {
                return false;
            }
            int codePointAt = str.codePointAt(i);
            int codePointAt2 = str2.codePointAt(i2);
            if (codePointAt != codePointAt2 && (upperCase = Character.toUpperCase(codePointAt)) != (upperCase2 = Character.toUpperCase(codePointAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
            i += Character.charCount(codePointAt);
            i2 += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15729 m14680() {
        return new C15729(2, 1, InterfaceC6950.f21425, new C9248(C13132.FOREVER_NS), new C20524(24));
    }
}
