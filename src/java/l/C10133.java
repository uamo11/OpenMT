package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

/* compiled from: PHN */
/* renamed from: l.ۤۜᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C10133 implements InterfaceC12954, Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2372 f30495;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10133 f30496 = this;

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    @Deprecated
    public final Object apply(Object obj) {
        Object obj2;
        Integer num = (Integer) obj;
        synchronized (this.f30496) {
            obj2 = this.f30495.get(num);
        }
        return obj2;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        Object m9404;
        Integer num = (Integer) obj;
        synchronized (this.f30496) {
            m9404 = C3077.m9404(this.f30495, num, obj2);
        }
        return m9404;
    }

    public C10133(C2372 c2372) {
        this.f30495 = c2372;
    }

    @Override // l.InterfaceC12954, java.util.function.IntFunction
    public final Object apply(int i) {
        Object obj;
        synchronized (this.f30496) {
            obj = this.f30495.get(i);
        }
        return obj;
    }

    @Override // l.InterfaceC9893
    public final int size() {
        int i;
        synchronized (this.f30496) {
            i = this.f30495.f7577;
        }
        return i;
    }

    @Override // l.InterfaceC12954
    /* renamed from: ܽ */
    public final Object mo2319() {
        synchronized (this.f30496) {
        }
        return null;
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // l.InterfaceC12954
    /* renamed from: ֫ */
    public final boolean mo2422(int i) {
        boolean mo2422;
        synchronized (this.f30496) {
            mo2422 = this.f30495.mo2422(i);
        }
        return mo2422;
    }

    @Override // l.InterfaceC9893
    @Deprecated
    public final boolean containsKey(Object obj) {
        boolean m9405;
        synchronized (this.f30496) {
            m9405 = C3077.m9405(this.f30495, obj);
        }
        return m9405;
    }

    @Override // l.InterfaceC12954
    /* renamed from: ֫ */
    public final Object mo2318(int i, Object obj) {
        Object mo2318;
        synchronized (this.f30496) {
            mo2318 = this.f30495.mo2318(i, obj);
        }
        return mo2318;
    }

    @Override // l.InterfaceC12954
    public final Object get(int i) {
        Object obj;
        synchronized (this.f30496) {
            obj = this.f30495.get(i);
        }
        return obj;
    }

    @Override // l.InterfaceC12954
    public final Object remove(int i) {
        Object remove;
        synchronized (this.f30496) {
            remove = this.f30495.remove(i);
        }
        return remove;
    }

    public final void clear() {
        synchronized (this.f30496) {
            this.f30495.clear();
        }
    }

    @Override // l.InterfaceC9893
    @Deprecated
    public final Object get(Object obj) {
        Object m9406;
        synchronized (this.f30496) {
            m9406 = C3077.m9406(this.f30495, obj);
        }
        return m9406;
    }

    @Deprecated
    public final Object remove(Object obj) {
        Object m9407;
        synchronized (this.f30496) {
            m9407 = C3077.m9407(this.f30495, obj);
        }
        return m9407;
    }

    public int hashCode() {
        int hashCode;
        synchronized (this.f30496) {
            hashCode = this.f30495.hashCode();
        }
        return hashCode;
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f30496) {
            equals = this.f30495.equals(obj);
        }
        return equals;
    }

    public final String toString() {
        String abstractC1269;
        synchronized (this.f30496) {
            abstractC1269 = this.f30495.toString();
        }
        return abstractC1269;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f30496) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
