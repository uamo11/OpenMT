package l;

import java.io.Serializable;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

/* compiled from: V1L7 */
/* renamed from: l.ᩴܿᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC18909 implements InterfaceC9219, Serializable {
    public static final long serialVersionUID = -4940583368468432370L;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f59590;

    public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return C15755.$default$andThen(this, intUnaryOperator);
    }

    public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return C15755.$default$compose(this, intUnaryOperator);
    }

    @Override // l.InterfaceC9219
    /* renamed from: ֫ */
    public abstract int mo23658(int i, int i2);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43653() {
        this.f59590 = -1;
    }

    @Override // l.InterfaceC9219
    /* renamed from: ܽ */
    public int mo23660() {
        return this.f59590;
    }

    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return get(i);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return get(obj);
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
}
