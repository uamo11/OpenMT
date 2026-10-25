package l;

import java.lang.reflect.Method;

/* compiled from: X93U */
/* renamed from: l.֫ᩴۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2004 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Method f6700;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Method f6701;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Method f6702;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f6703;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Method f6704;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Method f6705;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Method f6706;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Method f6707;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Method f6708;

    public C2004(Class cls, Class cls2, String str) {
        Method m12387;
        Method m123872;
        Method m123873;
        Method m123874;
        Method m123875;
        Method m123876;
        Method m123877;
        Method m123878;
        Method m123879;
        m12387 = AbstractC4121.m12387(cls, C4860.m14172("get", str, "List"), new Class[0]);
        this.f6705 = m12387;
        m123872 = AbstractC4121.m12387(cls2, C4860.m14172("get", str, "List"), new Class[0]);
        this.f6703 = m123872;
        String m46315 = C20094.m46315("get", str);
        Class cls3 = Integer.TYPE;
        m123873 = AbstractC4121.m12387(cls, m46315, cls3);
        this.f6708 = m123873;
        m123874 = AbstractC4121.m12387(cls2, C20094.m46315("get", str), cls3);
        this.f6701 = m123874;
        Class<?> returnType = m123873.getReturnType();
        m123875 = AbstractC4121.m12387(cls2, C20094.m46315("set", str), cls3, returnType);
        this.f6707 = m123875;
        m123876 = AbstractC4121.m12387(cls2, C20094.m46315("add", str), returnType);
        this.f6700 = m123876;
        m123877 = AbstractC4121.m12387(cls, C4860.m14172("get", str, "Count"), new Class[0]);
        this.f6704 = m123877;
        m123878 = AbstractC4121.m12387(cls2, C4860.m14172("get", str, "Count"), new Class[0]);
        this.f6706 = m123878;
        m123879 = AbstractC4121.m12387(cls2, C20094.m46315("clear", str), new Class[0]);
        this.f6702 = m123879;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m6540(AbstractC4121 abstractC4121) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f6705, abstractC4121, new Object[0]);
        return m12386;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m6546(AbstractC19916 abstractC19916) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f6703, abstractC19916, new Object[0]);
        return m12386;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m6539(int i, AbstractC4121 abstractC4121) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f6708, abstractC4121, Integer.valueOf(i));
        return m12386;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m6541(AbstractC19916 abstractC19916, int i) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f6701, abstractC19916, Integer.valueOf(i));
        return m12386;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6543(AbstractC19916 abstractC19916, int i, Object obj) {
        AbstractC4121.m12386(this.f6707, abstractC19916, Integer.valueOf(i), obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6544(AbstractC19916 abstractC19916, Object obj) {
        AbstractC4121.m12386(this.f6700, abstractC19916, obj);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m6545(AbstractC4121 abstractC4121) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f6704, abstractC4121, new Object[0]);
        return ((Integer) m12386).intValue();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m6547(AbstractC19916 abstractC19916) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f6706, abstractC19916, new Object[0]);
        return ((Integer) m12386).intValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6542(AbstractC19916 abstractC19916) {
        AbstractC4121.m12386(this.f6702, abstractC19916, new Object[0]);
    }
}
