package l;

import java.lang.reflect.Method;

/* compiled from: A87D */
/* renamed from: l.֡ܿۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0550 extends AbstractC15366 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f2224;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2225;

    public C0550(Object obj, Method method) {
        this.f2224 = method;
        this.f2225 = obj;
    }

    @Override // l.AbstractC15366
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo2296(Class cls) {
        String m46638 = C20328.m46638(cls);
        if (m46638 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(m46638));
        }
        return this.f2224.invoke(this.f2225, cls);
    }
}
