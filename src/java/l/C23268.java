package l;

/* compiled from: 8AWA */
/* renamed from: l.᩺᩸᩵, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23268 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Integer f74741;

    static {
        Integer num;
        Object obj;
        Integer num2 = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f74741 = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f74741 = num2;
    }
}
