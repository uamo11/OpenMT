package l;

import java.util.function.ToLongFunction;

/* compiled from: K74T */
/* renamed from: l.᩹֨ۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C21952 implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        C8353 c8353 = ((C13417) obj).f40104;
        int i = c8353.f25633;
        int i2 = c8353.f25609;
        return (i <= 0 || i2 <= 0) ? C13132.FOREVER_NS : i * i2;
    }
}
