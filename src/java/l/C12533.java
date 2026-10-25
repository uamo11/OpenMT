package l;

/* compiled from: A570 */
/* renamed from: l.۫ܽܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12533 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13943 f37653;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13238 f37654;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21064 f37655;

    public C12533(AbstractC13943 abstractC13943, C13238 c13238, C21064 c21064) {
        if (abstractC13943 == null) {
            throw new NullPointerException("locals == null");
        }
        if (c13238 == null) {
            throw new NullPointerException("stack == null");
        }
        c21064.m43732();
        this.f37653 = abstractC13943;
        this.f37654 = c13238;
        this.f37655 = c21064;
    }

    public C12533(int i, int i2) {
        this(new C1992(i), new C13238(i2), C21064.f67936);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12533 m30742() {
        return new C12533(this.f37653.mo6520(), this.f37654.m32110(), this.f37655);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m30753() {
        this.f37653.mo20349();
        this.f37654.mo20349();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30748(C7573 c7573) {
        this.f37653.mo6522(c7573);
        this.f37654.m32117(c7573);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12533 m30745(C12533 c12533) {
        C21064 c21064;
        AbstractC13943 abstractC13943 = c12533.f37653;
        AbstractC13943 abstractC139432 = this.f37653;
        AbstractC13943 mo6516 = abstractC139432.mo6516(abstractC13943);
        C13238 c13238 = c12533.f37654;
        C13238 c132382 = this.f37654;
        c132382.getClass();
        try {
            C13238 m51023 = C22927.m51023(c132382, c13238);
            C21064 c210642 = c12533.f37655;
            C21064 c210643 = this.f37655;
            if (c210643.equals(c210642)) {
                c21064 = c210643;
            } else {
                c21064 = new C21064();
                int size = c210643.size();
                int size2 = c210642.size();
                for (int i = 0; i < size && i < size2 && c210643.get(i) == c210642.get(i); i++) {
                    c21064.add(i);
                }
                c21064.mo20349();
            }
            if (mo6516 instanceof C7594) {
                mo6516 = (C7594) mo6516;
                if (c21064.size() == 0) {
                    mo6516 = mo6516.mo6513();
                }
            }
            return (mo6516 == abstractC139432 && m51023 == c132382 && c210643 == c21064) ? this : new C12533(mo6516, m51023, c21064);
        } catch (C2698 e) {
            e.m21602("underlay stack:");
            c132382.m32114(e);
            e.m21602("overlay stack:");
            c13238.m32114(e);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12533 m30746(C12533 c12533, int i, int i2) {
        AbstractC13943 abstractC13943 = c12533.f37653;
        AbstractC13943 abstractC139432 = this.f37653;
        C7594 mo6515 = abstractC139432.mo6515(abstractC13943, i2);
        C13238 c13238 = c12533.f37654;
        C13238 c132382 = this.f37654;
        c132382.getClass();
        try {
            C13238 m51023 = C22927.m51023(c132382, c13238);
            C21064 m47913 = c12533.f37655.m47913();
            m47913.add(i);
            m47913.mo20349();
            C21064 c21064 = this.f37655;
            if (mo6515 == abstractC139432 && m51023 == c132382 && c21064.equals(m47913)) {
                return this;
            }
            if (!c21064.equals(m47913)) {
                if (c21064.size() > m47913.size()) {
                    c21064 = m47913;
                    m47913 = c21064;
                }
                int size = m47913.size();
                int size2 = c21064.size();
                for (int i3 = size2 - 1; i3 >= 0; i3--) {
                    if (c21064.get(i3) != m47913.get((size - size2) + i3)) {
                        throw new RuntimeException("Incompatible merged subroutines");
                    }
                }
                c21064 = m47913;
            }
            return new C12533(mo6515, m51023, c21064);
        } catch (C2698 e) {
            e.m21602("underlay stack:");
            c132382.m32114(e);
            e.m21602("overlay stack:");
            c13238.m32114(e);
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC13943 m30751() {
        return this.f37653;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12533 m30744(C12512 c12512) {
        C13238 m32110 = this.f37654.m32110();
        m32110.m32115();
        m32110.m32113(c12512);
        return new C12533(this.f37653, m32110, this.f37655);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13238 m30752() {
        return this.f37654;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21064 m30754() {
        return this.f37655;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30749(C13922 c13922) {
        int size = c13922.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C7573 m40995get = c13922.m40995get(i2);
            this.f37653.mo6517(i, m40995get);
            i += m40995get.m20314();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12533 m30750(int i, int i2) {
        AbstractC13943 abstractC13943 = this.f37653;
        AbstractC13943 m20348 = abstractC13943 instanceof C7594 ? ((C7594) abstractC13943).m20348(i2) : null;
        try {
            C21064 m47913 = this.f37655.m47913();
            if (m47913.m47911() != i) {
                throw new RuntimeException("returning from invalid subroutine");
            }
            m47913.mo20349();
            if (m20348 == null) {
                return null;
            }
            return new C12533(m20348, this.f37654, m47913);
        } catch (IndexOutOfBoundsException unused) {
            throw new RuntimeException("returning from invalid subroutine");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("can't return from non-subroutine");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12533 m30743(int i, int i2) {
        this.f37655.m47913().add(i);
        return new C12533(this.f37653.mo6513(), this.f37654, C21064.m47910(i)).m30746(this, i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30747(C2698 c2698) {
        this.f37653.mo6518(c2698);
        this.f37654.m32114(c2698);
    }
}
