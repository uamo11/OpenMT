package l;

import sun.misc.Unsafe;

/* compiled from: H6Q8 */
/* renamed from: l.ܽۜ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16483 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final long f50671;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f50672;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C16980 f50673 = new C16980();

    static {
        Unsafe unsafe = C0961.f3616;
        f50672 = unsafe;
        try {
            f50671 = unsafe.objectFieldOffset(C16980.class.getDeclaredField("֫"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38848() {
        f50672.putOrderedInt(f50673, f50671, 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38847() {
        f50672.putIntVolatile(f50673, f50671, 0);
    }
}
