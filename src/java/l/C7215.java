package l;

import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: X93U */
/* renamed from: l.۟ۘۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7215 extends C11177 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Method f22072;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Method f22073;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Method f22074;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Method f22075;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Method f22076;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9291 f22077;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f22078;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Method f22079;

    public C7215(C0117 c0117, String str, Class cls, Class cls2) {
        super(cls, cls2, str);
        Method m12387;
        Method m123872;
        Method m123873;
        Method m123874;
        Method m123875;
        Method m123876;
        this.f22077 = c0117.m1127();
        m12387 = AbstractC4121.m12387(this.f33547, "valueOf", C2235.class);
        this.f22073 = m12387;
        m123872 = AbstractC4121.m12387(this.f33547, "getValueDescriptor", new Class[0]);
        this.f22079 = m123872;
        boolean m1135 = c0117.m1135();
        this.f22078 = !m1135;
        if (m1135) {
            return;
        }
        String m14172 = C4860.m14172("get", str, "Value");
        Class cls3 = Integer.TYPE;
        m123873 = AbstractC4121.m12387(cls, m14172, cls3);
        this.f22076 = m123873;
        m123874 = AbstractC4121.m12387(cls2, C4860.m14172("get", str, "Value"), cls3);
        this.f22074 = m123874;
        m123875 = AbstractC4121.m12387(cls2, C4860.m14172("set", str, "Value"), cls3, cls3);
        this.f22072 = m123875;
        m123876 = AbstractC4121.m12387(cls2, C4860.m14172("add", str, "Value"), cls3);
        this.f22075 = m123876;
    }

    @Override // l.C11177, l.InterfaceC5804
    /* renamed from: ֫ */
    public final Object mo16282(AbstractC4121 abstractC4121) {
        ArrayList arrayList = new ArrayList();
        int m6545 = this.f33546.m6545(abstractC4121);
        for (int i = 0; i < m6545; i++) {
            arrayList.add(mo16281(i, abstractC4121));
        }
        return C20195.unmodifiableList(arrayList);
    }

    @Override // l.C11177, l.InterfaceC5804
    /* renamed from: ۧ */
    public final Object mo16288(AbstractC19916 abstractC19916) {
        ArrayList arrayList = new ArrayList();
        int m6547 = this.f33546.m6547(abstractC19916);
        for (int i = 0; i < m6547; i++) {
            arrayList.add(mo16289(abstractC19916, i));
        }
        return C20195.unmodifiableList(arrayList);
    }

    @Override // l.C11177, l.InterfaceC5804
    /* renamed from: ֫ */
    public final Object mo16281(int i, AbstractC4121 abstractC4121) {
        Object m12386;
        Object m123862;
        if (this.f22078) {
            m123862 = AbstractC4121.m12386(this.f22076, abstractC4121, Integer.valueOf(i));
            return this.f22077.m23853(((Integer) m123862).intValue());
        }
        m12386 = AbstractC4121.m12386(this.f22079, this.f33546.m6539(i, abstractC4121), new Object[0]);
        return m12386;
    }

    @Override // l.C11177, l.InterfaceC5804
    /* renamed from: ۧ */
    public final Object mo16289(AbstractC19916 abstractC19916, int i) {
        Object m12386;
        Object m123862;
        if (this.f22078) {
            m123862 = AbstractC4121.m12386(this.f22074, abstractC19916, Integer.valueOf(i));
            return this.f22077.m23853(((Integer) m123862).intValue());
        }
        m12386 = AbstractC4121.m12386(this.f22079, this.f33546.m6541(abstractC19916, i), new Object[0]);
        return m12386;
    }

    @Override // l.C11177, l.InterfaceC5804
    /* renamed from: ֫ */
    public final void mo16286(AbstractC19916 abstractC19916, int i, Object obj) {
        Object m12386;
        if (this.f22078) {
            AbstractC4121.m12386(this.f22072, abstractC19916, Integer.valueOf(i), Integer.valueOf(((C2235) obj).getNumber()));
        } else {
            m12386 = AbstractC4121.m12386(this.f22073, (Object) null, obj);
            super.mo16286(abstractC19916, i, m12386);
        }
    }

    @Override // l.C11177, l.InterfaceC5804
    /* renamed from: ۧ */
    public final void mo16290(AbstractC19916 abstractC19916, Object obj) {
        Object m12386;
        if (this.f22078) {
            AbstractC4121.m12386(this.f22075, abstractC19916, Integer.valueOf(((C2235) obj).getNumber()));
        } else {
            m12386 = AbstractC4121.m12386(this.f22073, (Object) null, obj);
            super.mo16290(abstractC19916, m12386);
        }
    }
}
