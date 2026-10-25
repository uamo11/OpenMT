package l;

/* compiled from: N673 */
/* renamed from: l.᩹ۤᩴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22230 extends C0357 {
    public C22230 e;
    public C22230 f;
    public C22230 g;
    public C22230 h;
    public boolean i;

    public C22230(int i, Object obj, Object obj2, C0357 c0357, C22230 c22230) {
        super(i, obj, obj2, c0357);
        this.e = c22230;
    }

    @Override // l.C0357
    public final C0357 a(int i, Object obj) {
        return b(i, obj, null);
    }

    public final C22230 b(int i, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        C22230 c22230 = this;
        do {
            C22230 c222302 = c22230.f;
            C22230 c222303 = c22230.g;
            int i2 = c22230.a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = c22230.b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return c22230;
                    }
                    if (c222302 != null) {
                        if (c222303 != null) {
                            if (cls != null || (cls = ConcurrentMapC10942.c(obj)) != null) {
                                int i3 = ConcurrentMapC10942.g;
                                int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (compareTo != 0) {
                                    if (compareTo >= 0) {
                                        c222302 = c222303;
                                    }
                                }
                            }
                            C22230 b = c222303.b(i, obj, cls);
                            if (b != null) {
                                return b;
                            }
                        }
                    }
                }
                c22230 = c222303;
            }
            c22230 = c222302;
        } while (c22230 != null);
        return null;
    }
}
