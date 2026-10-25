package l;

import java.io.IOException;

/* compiled from: 98O4 */
/* renamed from: l.۠֫ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7865 implements InterfaceC15188, InterfaceC21388 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21272 f24390;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8134 f24391;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15036 f24392;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f24393;

    public C7865(AbstractC21272 abstractC21272, Object obj) {
        this.f24390 = abstractC21272;
        this.f24391 = abstractC21272.m23797((C15894) null);
        this.f24392 = abstractC21272.m23793((C15894) null);
        this.f24393 = obj;
    }

    @Override // l.InterfaceC15188
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21133(int i, C15894 c15894, C10957 c10957, C6723 c6723, int i2) {
        if (m21127(i, c15894)) {
            C8134 c8134 = this.f24391;
            C6723 m21126 = m21126(c6723, c15894);
            c8134.getClass();
            c8134.m21595(new C5312(c8134, c10957, m21126, i2));
        }
    }

    @Override // l.InterfaceC15188
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo21137(int i, C15894 c15894, C10957 c10957, C6723 c6723) {
        if (m21127(i, c15894)) {
            C8134 c8134 = this.f24391;
            C6723 m21126 = m21126(c6723, c15894);
            c8134.getClass();
            c8134.m21595(new C0372(c8134, c10957, m21126));
        }
    }

    @Override // l.InterfaceC15188
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21132(int i, C15894 c15894, C10957 c10957, C6723 c6723) {
        if (m21127(i, c15894)) {
            C8134 c8134 = this.f24391;
            C6723 m21126 = m21126(c6723, c15894);
            c8134.getClass();
            c8134.m21595(new C19424(c8134, c10957, m21126));
        }
    }

    @Override // l.InterfaceC15188
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21134(int i, C15894 c15894, C10957 c10957, C6723 c6723, IOException iOException, boolean z) {
        if (m21127(i, c15894)) {
            C8134 c8134 = this.f24391;
            C6723 m21126 = m21126(c6723, c15894);
            c8134.getClass();
            c8134.m21595(new C18718(c8134, c10957, m21126, iOException, z));
        }
    }

    @Override // l.InterfaceC15188
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21131(int i, C15894 c15894, C6723 c6723) {
        if (m21127(i, c15894)) {
            C8134 c8134 = this.f24391;
            C6723 m21126 = m21126(c6723, c15894);
            C15894 c158942 = c8134.f25106;
            c158942.getClass();
            c8134.m21595(new C23489(c8134, c158942, m21126));
        }
    }

    @Override // l.InterfaceC15188
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo21136(int i, C15894 c15894, C6723 c6723) {
        if (m21127(i, c15894)) {
            C8134 c8134 = this.f24391;
            C6723 m21126 = m21126(c6723, c15894);
            c8134.getClass();
            c8134.m21595(new C12761(c8134, m21126));
        }
    }

    @Override // l.InterfaceC21388
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21129(int i, C15894 c15894, int i2) {
        if (m21127(i, c15894)) {
            this.f24392.m35562(i2);
        }
    }

    @Override // l.InterfaceC21388
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21128(int i, C15894 c15894) {
        if (m21127(i, c15894)) {
            this.f24392.m35561();
        }
    }

    @Override // l.InterfaceC21388
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21130(int i, C15894 c15894, Exception exc) {
        if (m21127(i, c15894)) {
            this.f24392.m35564(exc);
        }
    }

    @Override // l.InterfaceC21388
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo21135(int i, C15894 c15894) {
        if (m21127(i, c15894)) {
            this.f24392.m35566();
        }
    }

    @Override // l.InterfaceC21388
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo21138(int i, C15894 c15894) {
        if (m21127(i, c15894)) {
            this.f24392.m35567();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m21127(int i, C15894 c15894) {
        C15894 c158942;
        Object obj = this.f24393;
        AbstractC21272 abstractC21272 = this.f24390;
        if (c15894 != null) {
            c158942 = abstractC21272.mo9818(obj, c15894);
            if (c158942 == null) {
                return false;
            }
        } else {
            c158942 = null;
        }
        int mo48285 = abstractC21272.mo48285(i, obj);
        C8134 c8134 = this.f24391;
        if (c8134.f25107 != mo48285 || !C11003.equals(c8134.f25106, c158942)) {
            this.f24391 = abstractC21272.m23796(mo48285, c158942);
        }
        C15036 c15036 = this.f24392;
        if (c15036.f45822 == mo48285 && C11003.equals(c15036.f45821, c158942)) {
            return true;
        }
        this.f24392 = abstractC21272.m23792(mo48285, c158942);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C6723 m21126(C6723 c6723, C15894 c15894) {
        long j = c6723.f20865;
        AbstractC21272 abstractC21272 = this.f24390;
        Object obj = this.f24393;
        long mo48286 = abstractC21272.mo48286(j, obj);
        long j2 = c6723.f20863;
        long mo482862 = abstractC21272.mo48286(j2, obj);
        return (mo48286 == j && mo482862 == j2) ? c6723 : new C6723(c6723.f20862, c6723.f20868, c6723.f20867, c6723.f20864, c6723.f20866, mo48286, mo482862);
    }
}
