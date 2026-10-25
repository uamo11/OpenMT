package l;

/* compiled from: DAUJ */
/* renamed from: l.֡֫ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC0105 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f1082 = new ThreadLocal();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f1081 = new ThreadLocal();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void m1093();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m1092(C5751 c5751, Object obj, char c) {
        ThreadLocal threadLocal = f1082;
        threadLocal.set(c5751);
        Character valueOf = Character.valueOf(c);
        ThreadLocal threadLocal2 = f1081;
        threadLocal2.set(valueOf);
        m1093();
        threadLocal.set(null);
        return ((Character) threadLocal2.get()).charValue();
    }
}
