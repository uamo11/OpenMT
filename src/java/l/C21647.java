package l;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.function.Function;

/* compiled from: IF3 */
/* renamed from: l.᩸ܳᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C21647 implements InterfaceC8241, Serializable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21214 f69482;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C21647 f69483 = this;

    @Override // java.util.function.Function
    @Deprecated
    public final Object apply(Object obj) {
        Float f;
        Integer num = (Integer) obj;
        synchronized (this.f69483) {
            f = (Float) this.f69482.get((Object) num);
        }
        return f;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        Float m4005;
        Integer num = (Integer) obj;
        Float f = (Float) obj2;
        synchronized (this.f69483) {
            m4005 = C1185.m4005(this.f69482, num, f);
        }
        return m4005;
    }

    public C21647(C21214 c21214) {
        this.f69482 = c21214;
    }

    @Override // java.util.function.IntToDoubleFunction
    public final double applyAsDouble(int i) {
        double d;
        synchronized (this.f69483) {
            d = this.f69482.get(i);
        }
        return d;
    }

    @Override // l.InterfaceC9893
    public final int size() {
        int i;
        synchronized (this.f69483) {
            i = this.f69482.f68347;
        }
        return i;
    }

    @Override // l.InterfaceC8241
    /* renamed from: ܽ */
    public final float mo8402() {
        synchronized (this.f69483) {
        }
        return 0.0f;
    }

    @Override // java.util.function.Function
    public final Function compose(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final Function mo22274andThen(Function function) {
        throw new NoSuchMethodError();
    }

    @Override // l.InterfaceC8241
    /* renamed from: ֫ */
    public final boolean mo21825(int i) {
        boolean mo21825;
        synchronized (this.f69483) {
            mo21825 = this.f69482.mo21825(i);
        }
        return mo21825;
    }

    @Override // l.InterfaceC9893
    @Deprecated
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f69483) {
            containsKey = this.f69482.containsKey(obj);
        }
        return containsKey;
    }

    @Override // l.InterfaceC8241
    /* renamed from: ֫ */
    public final float mo8401(float f, int i) {
        float mo8401;
        synchronized (this.f69483) {
            mo8401 = this.f69482.mo8401(f, i);
        }
        return mo8401;
    }

    @Override // l.InterfaceC8241
    public final float get(int i) {
        float f;
        synchronized (this.f69483) {
            f = this.f69482.get(i);
        }
        return f;
    }

    @Override // l.InterfaceC8241
    public final float remove(int i) {
        float remove;
        synchronized (this.f69483) {
            remove = this.f69482.remove(i);
        }
        return remove;
    }

    public final void clear() {
        synchronized (this.f69483) {
            this.f69482.clear();
        }
    }

    @Override // l.InterfaceC9893
    @Deprecated
    public final Float get(Object obj) {
        Float m4006;
        synchronized (this.f69483) {
            m4006 = C1185.m4006(this.f69482, obj);
        }
        return m4006;
    }

    @Deprecated
    public final Object remove(Object obj) {
        Float m4007;
        synchronized (this.f69483) {
            m4007 = C1185.m4007(this.f69482, obj);
        }
        return m4007;
    }

    public int hashCode() {
        int hashCode;
        synchronized (this.f69483) {
            hashCode = this.f69482.hashCode();
        }
        return hashCode;
    }

    public boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f69483) {
            equals = this.f69482.equals(obj);
        }
        return equals;
    }

    public final String toString() {
        String abstractC4092;
        synchronized (this.f69483) {
            abstractC4092 = this.f69482.toString();
        }
        return abstractC4092;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f69483) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
