package l;

import java.lang.reflect.Method;

/* compiled from: X93U */
/* renamed from: l.ܿᩴۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17526 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Method f53524;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Method f53525;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Method f53526;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f53527;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Method f53528;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Method f53529;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Method f53530;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Method f53531;

    public C17526(String str, Class cls, Class cls2, String str2, boolean z, boolean z2) {
        Method m12387;
        Method m123872;
        Method m123873;
        Method m123874;
        m12387 = AbstractC4121.m12387(cls, C20094.m46315("get", str), new Class[0]);
        this.f53530 = m12387;
        m123872 = AbstractC4121.m12387(cls2, C20094.m46315("get", str), new Class[0]);
        this.f53529 = m123872;
        m123873 = AbstractC4121.m12387(cls2, C20094.m46315("set", str), m12387.getReturnType());
        this.f53525 = m123873;
        this.f53527 = z2 ? AbstractC4121.m12387(cls, C20094.m46315("has", str), new Class[0]) : null;
        this.f53531 = z2 ? AbstractC4121.m12387(cls2, C20094.m46315("has", str), new Class[0]) : null;
        m123874 = AbstractC4121.m12387(cls2, C20094.m46315("clear", str), new Class[0]);
        this.f53528 = m123874;
        this.f53524 = z ? AbstractC4121.m12387(cls, C4860.m14172("get", str2, "Case"), new Class[0]) : null;
        this.f53526 = z ? AbstractC4121.m12387(cls2, C4860.m14172("get", str2, "Case"), new Class[0]) : null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m40962(AbstractC4121 abstractC4121) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f53530, abstractC4121, new Object[0]);
        return m12386;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m40966(AbstractC19916 abstractC19916) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f53529, abstractC19916, new Object[0]);
        return m12386;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m40965(AbstractC4121 abstractC4121) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f53524, abstractC4121, new Object[0]);
        return ((InterfaceC3415) m12386).getNumber();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m40967(AbstractC19916 abstractC19916) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f53526, abstractC19916, new Object[0]);
        return ((InterfaceC3415) m12386).getNumber();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40964(AbstractC19916 abstractC19916, Object obj) {
        AbstractC4121.m12386(this.f53525, abstractC19916, obj);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m40968(AbstractC4121 abstractC4121) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f53527, abstractC4121, new Object[0]);
        return ((Boolean) m12386).booleanValue();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m40969(AbstractC19916 abstractC19916) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f53531, abstractC19916, new Object[0]);
        return ((Boolean) m12386).booleanValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40963(AbstractC19916 abstractC19916) {
        AbstractC4121.m12386(this.f53528, abstractC19916, new Object[0]);
    }
}
