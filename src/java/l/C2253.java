package l;

/* compiled from: 65AK */
/* renamed from: l.ۖۗ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2253 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String[] f7326 = {"build", "runtime", "system"};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m7460(int i) {
        if (i < 0 || i >= 3) {
            throw new C15431(null, "Invalid annotation visibility %d", Integer.valueOf(i));
        }
        return f7326[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m7459(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.equals("build")) {
            return 0;
        }
        if (lowerCase.equals("runtime")) {
            return 1;
        }
        if (lowerCase.equals("system")) {
            return 2;
        }
        throw new C15431(null, "Invalid annotation visibility: %s", lowerCase);
    }
}
