package l;

import java.util.Iterator;

/* compiled from: 17NL */
/* renamed from: l.۬۟ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12970 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38870 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC6079 f38871 = AbstractC6079.m16987("\r\n", "\n", "\r");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m31535(String str) {
        return f38871.contains(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31532(int i, String str) {
        AbstractC20151 it = f38871.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.startsWith(str2, i)) {
                return str2.length();
            }
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31533(String str) {
        AbstractC20151 it = f38871.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str.endsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m31534(String str) {
        char charAt;
        int i = 0;
        while (i < str.length() && (charAt = str.charAt(i)) != '\n') {
            i++;
            if (charAt == '\r') {
                return (i >= str.length() || str.charAt(i) != '\n') ? "\r" : "\r\n";
            }
        }
        return "\n";
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Iterator m31536(String str) {
        return new C3093(str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Iterator m31537(String str) {
        return new C4504(str);
    }
}
