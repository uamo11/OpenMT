package l;

import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.stream.IntStream;

/* compiled from: N673 */
/* renamed from: l.ܽۧ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16607 implements IntFunction, LongFunction {
    public IntFunction a;

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        Object apply = this.a.apply(i);
        if (apply == null) {
            return null;
        }
        if (apply instanceof InterfaceC11315) {
            return C2142.convert((InterfaceC11315) apply);
        }
        if (apply instanceof IntStream) {
            return C7454.convert((IntStream) apply);
        }
        C16461.a(apply.getClass(), "java.util.stream.IntStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return AbstractC9198.G(j, this.a);
    }
}
