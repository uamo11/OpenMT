package l;

import java.lang.reflect.Method;

/* compiled from: X93U */
/* renamed from: l.ᩳᩴۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18232 extends C14703 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Method f56653;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f56654;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Method f56655;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9291 f56656;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Method f56657;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Method f56658;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Method f56659;

    public C18232(C0117 c0117, String str, Class cls, Class cls2, String str2) {
        super(c0117, str, cls, cls2, str2);
        Method m12387;
        Method m123872;
        Method m123873;
        Method m123874;
        Method m123875;
        this.f56656 = c0117.m1127();
        m12387 = AbstractC4121.m12387(this.f44908, "valueOf", C2235.class);
        this.f56657 = m12387;
        m123872 = AbstractC4121.m12387(this.f44908, "getValueDescriptor", new Class[0]);
        this.f56659 = m123872;
        boolean m1135 = c0117.m1135();
        this.f56654 = !m1135;
        if (m1135) {
            return;
        }
        m123873 = AbstractC4121.m12387(cls, C4860.m14172("get", str, "Value"), new Class[0]);
        this.f56653 = m123873;
        m123874 = AbstractC4121.m12387(cls2, C4860.m14172("get", str, "Value"), new Class[0]);
        this.f56658 = m123874;
        m123875 = AbstractC4121.m12387(cls2, C4860.m14172("set", str, "Value"), Integer.TYPE);
        this.f56655 = m123875;
    }

    @Override // l.C14703, l.InterfaceC5804
    /* renamed from: ֫ */
    public final Object mo16282(AbstractC4121 abstractC4121) {
        Object m12386;
        Object m123862;
        if (this.f56654) {
            m123862 = AbstractC4121.m12386(this.f56653, abstractC4121, new Object[0]);
            return this.f56656.m23853(((Integer) m123862).intValue());
        }
        m12386 = AbstractC4121.m12386(this.f56659, this.f44907.m40962(abstractC4121), new Object[0]);
        return m12386;
    }

    @Override // l.C14703, l.InterfaceC5804
    /* renamed from: ۧ */
    public final Object mo16288(AbstractC19916 abstractC19916) {
        Object m12386;
        Object m123862;
        if (this.f56654) {
            m123862 = AbstractC4121.m12386(this.f56658, abstractC19916, new Object[0]);
            return this.f56656.m23853(((Integer) m123862).intValue());
        }
        m12386 = AbstractC4121.m12386(this.f56659, this.f44907.m40966(abstractC19916), new Object[0]);
        return m12386;
    }

    @Override // l.C14703, l.InterfaceC5804
    /* renamed from: ֫ */
    public final void mo16287(AbstractC19916 abstractC19916, Object obj) {
        Object m12386;
        if (this.f56654) {
            AbstractC4121.m12386(this.f56655, abstractC19916, Integer.valueOf(((C2235) obj).getNumber()));
        } else {
            m12386 = AbstractC4121.m12386(this.f56657, (Object) null, obj);
            super.mo16287(abstractC19916, m12386);
        }
    }
}
