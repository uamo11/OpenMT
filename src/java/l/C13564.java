package l;

import java.lang.reflect.Method;

/* compiled from: X93U */
/* renamed from: l.ܰۘۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13564 implements InterfaceC22737 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Method f40478;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Method f40479;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Method f40480;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17757 f40481;

    public C13564(C17757 c17757, String str, Class cls, Class cls2) {
        Method m12387;
        Method m123872;
        Method m123873;
        this.f40481 = c17757;
        m12387 = AbstractC4121.m12387(cls, C4860.m14172("get", str, "Case"), new Class[0]);
        this.f40478 = m12387;
        m123872 = AbstractC4121.m12387(cls2, C4860.m14172("get", str, "Case"), new Class[0]);
        this.f40479 = m123872;
        m123873 = AbstractC4121.m12387(cls2, C20094.m46315("clear", str), new Class[0]);
        this.f40480 = m123873;
    }

    @Override // l.InterfaceC22737
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo32611(AbstractC4121 abstractC4121) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f40478, abstractC4121, new Object[0]);
        return ((InterfaceC3415) m12386).getNumber() != 0;
    }

    @Override // l.InterfaceC22737
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo32612(AbstractC19916 abstractC19916) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f40479, abstractC19916, new Object[0]);
        return ((InterfaceC3415) m12386).getNumber() != 0;
    }

    @Override // l.InterfaceC22737
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0117 mo32608(AbstractC4121 abstractC4121) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f40478, abstractC4121, new Object[0]);
        int number = ((InterfaceC3415) m12386).getNumber();
        if (number > 0) {
            return this.f40481.m41590(number);
        }
        return null;
    }

    @Override // l.InterfaceC22737
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0117 mo32610(AbstractC19916 abstractC19916) {
        Object m12386;
        m12386 = AbstractC4121.m12386(this.f40479, abstractC19916, new Object[0]);
        int number = ((InterfaceC3415) m12386).getNumber();
        if (number > 0) {
            return this.f40481.m41590(number);
        }
        return null;
    }

    @Override // l.InterfaceC22737
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo32609(AbstractC19916 abstractC19916) {
        AbstractC4121.m12386(this.f40480, abstractC19916, new Object[0]);
    }
}
