package l;

import java.lang.reflect.Method;

/* compiled from: X93U */
/* renamed from: l.᩻ᩴۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23876 extends C14703 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f77205;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Method f77206;

    public C23876(C0117 c0117, String str, Class cls, Class cls2, String str2) {
        super(c0117, str, cls, cls2, str2);
        Method m12387;
        Method m123872;
        m12387 = AbstractC4121.m12387(this.f44908, "newBuilder", new Class[0]);
        this.f77206 = m12387;
        m123872 = AbstractC4121.m12387(cls2, C4860.m14172("get", str, "Builder"), new Class[0]);
        this.f77205 = m123872;
    }

    @Override // l.C14703, l.InterfaceC5804
    /* renamed from: ֫ */
    public final void mo16287(AbstractC19916 abstractC19916, Object obj) {
        Object m12386;
        if (!this.f44908.isInstance(obj)) {
            m12386 = AbstractC4121.m12386(this.f77206, (Object) null, new Object[0]);
            obj = ((InterfaceC14165) m12386).mergeFrom((InterfaceC23338) obj).buildPartial();
        }
        super.mo16287(abstractC19916, obj);
    }

    @Override // l.C14703, l.InterfaceC5804
    /* renamed from: ֫ */
    public final InterfaceC14165 mo16283() {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f77206, (Object) null, new Object[0]);
        return (InterfaceC14165) m12386;
    }

    @Override // l.C14703, l.InterfaceC5804
    /* renamed from: ᩳ */
    public final InterfaceC14165 mo16296(AbstractC19916 abstractC19916) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f77205, abstractC19916, new Object[0]);
        return (InterfaceC14165) m12386;
    }
}
