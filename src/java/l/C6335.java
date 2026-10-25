package l;

/* compiled from: FAXN */
/* renamed from: l.ۛ᩸᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6335 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Integer f19630;

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
            f19630 = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f19630 = num2;
    }
}
