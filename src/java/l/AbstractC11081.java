package l;

/* compiled from: A4S0 */
/* renamed from: l.ۧܶܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC11081 {
    /* renamed from: ֫ */
    public abstract int mo6261(Object obj);

    /* renamed from: ֫ */
    public abstract boolean mo6262(Object obj, Object obj2);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m27496(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return mo6262(obj, obj2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m27495(Object obj) {
        if (obj == null) {
            return 0;
        }
        return mo6261(obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC11081 m27493() {
        return C7347.f22566;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC11081 m27494() {
        return C1908.f6431;
    }
}
