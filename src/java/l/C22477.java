package l;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: J6S5 */
/* renamed from: l.᩹ᩴᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22477 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final HashMap f72781 = new HashMap();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f72782 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f72783;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f72784 = new FutureC3575();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f72785;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f72786;

    public C22477(InterfaceC20758 interfaceC20758, FutureC3575 futureC3575) {
        this.f72783 = interfaceC20758;
        this.f72785 = futureC3575;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22477 m50424(InterfaceC20758 interfaceC20758) {
        C22477 c22477;
        InterfaceC20758 normalize = interfaceC20758.toAbsolutePath().normalize();
        HashMap hashMap = f72781;
        synchronized (hashMap) {
            C22477 c224772 = (C22477) hashMap.get(normalize);
            c22477 = new C22477(normalize, c224772 == null ? FutureC3575.m10905(null) : c224772.f72784);
            hashMap.put(normalize, c22477);
        }
        return c22477;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static FutureC3575 m50426(InterfaceC20758 interfaceC20758) {
        FutureC3575 m10898;
        final InterfaceC20758 normalize = interfaceC20758.toAbsolutePath().normalize();
        HashMap hashMap = f72781;
        synchronized (hashMap) {
            m10898 = FutureC3575.m10898((FutureC3575[]) C5378.stream(hashMap.entrySet()).filter(new Predicate() { // from class: l.۠ᩴᩳ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((InterfaceC20758) ((Map.Entry) obj).getKey()).startsWith(InterfaceC20758.this);
                }
            }).map(new C15420(0)).toArray(new C21772()));
        }
        return m10898;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m50427() {
        return this.f72785.m10921((InterfaceC21423) new C15942(8));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50428(Throwable th) {
        synchronized (this) {
            if (this.f72786) {
                return;
            }
            this.f72786 = true;
            this.f72785.m10910((InterfaceC8017) new C6413(this, th));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50425(C22477 c22477, Throwable th, Throwable th2) {
        HashMap hashMap = f72781;
        synchronized (hashMap) {
            C13843.remove(hashMap, c22477.f72783, c22477);
        }
        if (th2 != null) {
            th = th2;
        }
        if (th == null) {
            c22477.f72784.m10912((Object) null);
        } else {
            c22477.f72784.m10914(th);
        }
    }
}
