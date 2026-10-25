package l;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;

/* compiled from: L4DX */
/* renamed from: l.ܺ֫֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15615 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4965 f48082;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20556 f48083;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C9267 f48084;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC20216 f48085;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f48086;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f48087;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16687 f48088;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C23377 f48089;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C5215 f48090;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f48091;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC19145 f48092;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f48093;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f48094;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C8927 f48095;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized C23377 m36811() {
        return this.f48089;
    }

    public C15615(C8927 c8927, C4965 c4965, InterfaceC16687 interfaceC16687, AbstractC20216 abstractC20216, Object obj) {
        this.f48095 = c8927;
        this.f48082 = c4965;
        this.f48088 = interfaceC16687;
        this.f48085 = abstractC20216;
        this.f48084 = new C9267(c4965, AbstractC8037.f24775.mo21349(c8927), interfaceC16687, abstractC20216);
        this.f48091 = obj;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19145 m36804(C17209 c17209, C7855 c7855, boolean z) {
        try {
            InterfaceC19145 m51820 = m36802(c7855.m21039(), c7855.m21040(), c7855.m21044(), 0, c17209.m40467(), z).m51820(c17209, c7855, this);
            synchronized (this.f48095) {
                this.f48092 = m51820;
            }
            return m51820;
        } catch (IOException e) {
            throw new C6444(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23377 m36802(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        while (true) {
            C23377 m36801 = m36801(i, i2, i3, i4, z);
            synchronized (this.f48095) {
                if (m36801.f75114 == 0 && !m36801.m51827()) {
                    return m36801;
                }
                if (m36801.m51825(z2)) {
                    return m36801;
                }
                m36812();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23377 m36801(int i, int i2, int i3, int i4, boolean z) {
        C23377 c23377;
        Socket socket;
        Socket m36800;
        C5215 c5215;
        C5215 c52152;
        C23377 c233772;
        boolean z2;
        boolean z3;
        C20556 c20556;
        synchronized (this.f48095) {
            if (this.f48087) {
                throw new IllegalStateException("released");
            }
            if (this.f48092 != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.f48093) {
                throw new IOException("Canceled");
            }
            c23377 = this.f48089;
            socket = null;
            m36800 = (c23377 == null || !c23377.f75105) ? null : m36800(false, false, true);
            C23377 c233773 = this.f48089;
            if (c233773 != null) {
                c23377 = null;
            } else {
                c233773 = null;
            }
            if (!this.f48086) {
                c23377 = null;
            }
            if (c233773 == null) {
                AbstractC8037.f24775.mo21350(this.f48095, this.f48082, this, null);
                c233772 = this.f48089;
                if (c233772 != null) {
                    z2 = true;
                    c52152 = null;
                } else {
                    c5215 = this.f48090;
                }
            } else {
                c5215 = null;
            }
            c52152 = c5215;
            c233772 = c233773;
            z2 = false;
        }
        C20032.m46181(m36800);
        if (c23377 != null) {
            this.f48085.getClass();
        }
        if (z2) {
            this.f48085.getClass();
        }
        if (c233772 != null) {
            this.f48090 = this.f48089.m51829();
            return c233772;
        }
        if (c52152 != null || ((c20556 = this.f48083) != null && c20556.m47121())) {
            z3 = false;
        } else {
            this.f48083 = this.f48084.m23791();
            z3 = true;
        }
        synchronized (this.f48095) {
            if (this.f48093) {
                throw new IOException("Canceled");
            }
            if (z3) {
                ArrayList m47120 = this.f48083.m47120();
                int size = m47120.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    C5215 c52153 = (C5215) m47120.get(i5);
                    AbstractC8037.f24775.mo21350(this.f48095, this.f48082, this, c52153);
                    C23377 c233774 = this.f48089;
                    if (c233774 != null) {
                        this.f48090 = c52153;
                        z2 = true;
                        c233772 = c233774;
                        break;
                    }
                    i5++;
                }
            }
            if (!z2) {
                if (c52152 == null) {
                    c52152 = this.f48083.m47122();
                }
                this.f48090 = c52152;
                this.f48094 = 0;
                c233772 = new C23377(this.f48095, c52152);
                m36807(c233772, false);
            }
        }
        if (z2) {
            this.f48085.getClass();
            return c233772;
        }
        c233772.m51822(i, i2, i3, i4, z, this.f48085);
        AbstractC8037.f24775.mo21349(this.f48095).m23434(c233772.m51829());
        synchronized (this.f48095) {
            this.f48086 = true;
            AbstractC8037.f24775.mo21356(this.f48095, c233772);
            if (c233772.m51827()) {
                socket = AbstractC8037.f24775.mo21348(this.f48095, this.f48082, this);
                c233772 = this.f48089;
            }
        }
        C20032.m46181(socket);
        this.f48085.getClass();
        return c233772;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36808(boolean z, InterfaceC19145 interfaceC19145, IOException iOException) {
        C23377 c23377;
        Socket m36800;
        boolean z2;
        this.f48085.getClass();
        synchronized (this.f48095) {
            if (interfaceC19145 != this.f48092) {
                throw new IllegalStateException("expected " + this.f48092 + " but was " + interfaceC19145);
            }
            if (!z) {
                this.f48089.f75114++;
            }
            c23377 = this.f48089;
            m36800 = m36800(z, false, true);
            if (this.f48089 != null) {
                c23377 = null;
            }
            z2 = this.f48087;
        }
        C20032.m46181(m36800);
        if (c23377 != null) {
            this.f48085.getClass();
        }
        if (iOException != null) {
            AbstractC8037.f24775.mo21347(this.f48088, iOException);
            this.f48085.getClass();
        } else if (z2) {
            AbstractC8037.f24775.mo21347(this.f48088, (IOException) null);
            this.f48085.getClass();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19145 m36809() {
        InterfaceC19145 interfaceC19145;
        synchronized (this.f48095) {
            interfaceC19145 = this.f48092;
        }
        return interfaceC19145;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C5215 m36814() {
        return this.f48090;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m36810() {
        C23377 c23377;
        Socket m36800;
        synchronized (this.f48095) {
            c23377 = this.f48089;
            m36800 = m36800(false, true, false);
            if (this.f48089 != null) {
                c23377 = null;
            }
        }
        C20032.m46181(m36800);
        if (c23377 != null) {
            AbstractC8037.f24775.mo21347(this.f48088, (IOException) null);
            this.f48085.getClass();
            this.f48085.getClass();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m36812() {
        C23377 c23377;
        Socket m36800;
        synchronized (this.f48095) {
            c23377 = this.f48089;
            m36800 = m36800(true, false, false);
            if (this.f48089 != null) {
                c23377 = null;
            }
        }
        C20032.m46181(m36800);
        if (c23377 != null) {
            this.f48085.getClass();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Socket m36800(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f48092 = null;
        }
        if (z2) {
            this.f48087 = true;
        }
        C23377 c23377 = this.f48089;
        if (c23377 != null) {
            if (z) {
                c23377.f75105 = true;
            }
            if (this.f48092 == null && (this.f48087 || c23377.f75105)) {
                ArrayList arrayList = c23377.f75111;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Reference) arrayList.get(i)).get() == this) {
                        arrayList.remove(i);
                        if (this.f48089.f75111.isEmpty()) {
                            this.f48089.f75116 = System.nanoTime();
                            if (AbstractC8037.f24775.mo21355(this.f48095, this.f48089)) {
                                socket = this.f48089.m51828();
                                this.f48089 = null;
                                return socket;
                            }
                        }
                        socket = null;
                        this.f48089 = null;
                        return socket;
                    }
                }
                throw new IllegalStateException();
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36805() {
        InterfaceC19145 interfaceC19145;
        C23377 c23377;
        synchronized (this.f48095) {
            this.f48093 = true;
            interfaceC19145 = this.f48092;
            c23377 = this.f48089;
        }
        if (interfaceC19145 != null) {
            interfaceC19145.cancel();
        } else if (c23377 != null) {
            c23377.m51821();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36806(IOException iOException) {
        C23377 c23377;
        boolean z;
        Socket m36800;
        synchronized (this.f48095) {
            c23377 = null;
            if (iOException instanceof C11111) {
                EnumC13499 enumC13499 = ((C11111) iOException).f33345;
                if (enumC13499 == EnumC13499.REFUSED_STREAM) {
                    int i = this.f48094 + 1;
                    this.f48094 = i;
                    if (i > 1) {
                        this.f48090 = null;
                        z = true;
                    }
                    z = false;
                } else {
                    if (enumC13499 != EnumC13499.CANCEL) {
                        this.f48090 = null;
                        z = true;
                    }
                    z = false;
                }
            } else {
                C23377 c233772 = this.f48089;
                if (c233772 != null && (!c233772.m51827() || (iOException instanceof C22672))) {
                    if (this.f48089.f75114 == 0) {
                        C5215 c5215 = this.f48090;
                        if (c5215 != null && iOException != null) {
                            this.f48084.m23789(c5215, iOException);
                        }
                        this.f48090 = null;
                    }
                    z = true;
                }
                z = false;
            }
            C23377 c233773 = this.f48089;
            m36800 = m36800(z, false, true);
            if (this.f48089 == null && this.f48086) {
                c23377 = c233773;
            }
        }
        C20032.m46181(m36800);
        if (c23377 != null) {
            this.f48085.getClass();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36807(C23377 c23377, boolean z) {
        if (this.f48089 != null) {
            throw new IllegalStateException();
        }
        this.f48089 = c23377;
        this.f48086 = z;
        c23377.f75111.add(new C8561(this, this.f48091));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Socket m36803(C23377 c23377) {
        if (this.f48092 != null || this.f48089.f75111.size() != 1) {
            throw new IllegalStateException();
        }
        Reference reference = (Reference) this.f48089.f75111.get(0);
        Socket m36800 = m36800(true, false, false);
        this.f48089 = c23377;
        c23377.f75111.add(reference);
        return m36800;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m36813() {
        if (this.f48090 != null) {
            return true;
        }
        C20556 c20556 = this.f48083;
        return (c20556 != null && c20556.m47121()) || this.f48084.m23790();
    }

    public final String toString() {
        C23377 m36811 = m36811();
        return m36811 != null ? m36811.toString() : this.f48082.toString();
    }
}
