package l;

/* compiled from: N673 */
/* renamed from: l.ۖۤᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2475 extends C0357 {
    public final C0357[] e;

    public C2475(C0357[] c0357Arr) {
        super(-1, null, null);
        this.e = c0357Arr;
    }

    @Override // l.C0357
    public final C0357 a(int i, Object obj) {
        C0357 k;
        Object obj2;
        C0357[] c0357Arr = this.e;
        loop0: while (true) {
            int length = c0357Arr.length;
            if (length == 0 || (k = ConcurrentMapC10942.k(c0357Arr, (length - 1) & i)) == null) {
                return null;
            }
            do {
                int i2 = k.a;
                if (i2 != i || ((obj2 = k.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    if (i2 < 0) {
                        if (k instanceof C2475) {
                            c0357Arr = ((C2475) k).e;
                        } else {
                            return k.a(i, obj);
                        }
                    } else {
                        k = k.d;
                    }
                }
            } while (k != null);
            return null;
        }
        return k;
    }
}
