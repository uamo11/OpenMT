package l;

/* compiled from: 0BM3 */
/* renamed from: l.ۖۧۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC2489 implements AutoCloseable {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C11459 f7935 = C11459.m28259(8, "^\\s*\\.class\\s+([a-z]+\\s+)*(L.+?;)");

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC6722 f7936;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract Object mo7979();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo7980(int i, int i2, InterfaceC20834 interfaceC20834);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo7982(C9170 c9170);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo7983(C12366 c12366, CharSequence charSequence);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m7978(CharSequence charSequence) {
        C12164 matcher = f7935.matcher(charSequence);
        if (matcher.find()) {
            return matcher.group(2);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo7981(InterfaceC6722 interfaceC6722) {
        this.f7936 = interfaceC6722;
    }
}
