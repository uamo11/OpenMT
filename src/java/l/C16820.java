package l;

import java.lang.reflect.Method;

/* compiled from: X93U */
/* renamed from: l.ܽᩴۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16820 extends C11177 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Method f51621;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Method f51622;

    public C16820(Class cls, Class cls2, String str) {
        super(cls, cls2, str);
        Method m12387;
        Method m123872;
        m12387 = AbstractC4121.m12387(this.f33547, "newBuilder", new Class[0]);
        this.f51622 = m12387;
        m123872 = AbstractC4121.m12387(cls2, C4860.m14172("get", str, "Builder"), Integer.TYPE);
        this.f51621 = m123872;
    }

    @Override // l.C11177, l.InterfaceC5804
    /* renamed from: ֫ */
    public final void mo16286(AbstractC19916 abstractC19916, int i, Object obj) {
        Object m12386;
        if (!this.f33547.isInstance(obj)) {
            m12386 = AbstractC4121.m12386(this.f51622, (Object) null, new Object[0]);
            obj = ((InterfaceC14165) m12386).mergeFrom((InterfaceC23338) obj).build();
        }
        super.mo16286(abstractC19916, i, obj);
    }

    @Override // l.C11177, l.InterfaceC5804
    /* renamed from: ۧ */
    public final void mo16290(AbstractC19916 abstractC19916, Object obj) {
        Object m12386;
        if (!this.f33547.isInstance(obj)) {
            m12386 = AbstractC4121.m12386(this.f51622, (Object) null, new Object[0]);
            obj = ((InterfaceC14165) m12386).mergeFrom((InterfaceC23338) obj).build();
        }
        super.mo16290(abstractC19916, obj);
    }

    @Override // l.C11177, l.InterfaceC5804
    /* renamed from: ֫ */
    public final InterfaceC14165 mo16283() {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f51622, (Object) null, new Object[0]);
        return (InterfaceC14165) m12386;
    }

    @Override // l.C11177, l.InterfaceC5804
    /* renamed from: ֫ */
    public final InterfaceC14165 mo16284(AbstractC19916 abstractC19916, int i) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f51621, abstractC19916, Integer.valueOf(i));
        return (InterfaceC14165) m12386;
    }
}
