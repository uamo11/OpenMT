package l;

/* compiled from: JGV */
/* renamed from: l.ۨᩳۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11861 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int f35384;

    static {
        int i;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]", 3);
            i = Integer.parseInt(split[0]);
            if (i == 1 && split.length > 1) {
                i = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < property.length(); i2++) {
                    char charAt = property.charAt(i2);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb.append(charAt);
                }
                i = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i = -1;
            }
        }
        if (i == -1) {
            i = 6;
        }
        f35384 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28970() {
        return f35384 >= 9;
    }
}
