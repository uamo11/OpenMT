package l;

import java.lang.reflect.Method;

/* compiled from: A87D */
/* renamed from: l.ۚܿۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5490 extends AbstractC15366 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17035;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f17036;

    public C5490(Method method, int i) {
        this.f17036 = method;
        this.f17035 = i;
    }

    @Override // l.AbstractC15366
    /* renamed from: ֫ */
    public final Object mo2296(Class cls) {
        String m46638 = C20328.m46638(cls);
        if (m46638 == null) {
            return this.f17036.invoke(null, cls, Integer.valueOf(this.f17035));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(m46638));
    }
}
