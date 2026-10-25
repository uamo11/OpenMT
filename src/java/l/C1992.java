package l;

/* compiled from: 3BCT */
/* renamed from: l.֫ᩳܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1992 extends AbstractC13943 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC1538[] f6672;

    @Override // l.AbstractC13943
    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C1992 mo6513() {
        return this;
    }

    public C1992(int i) {
        super(i != 0);
        this.f6672 = new InterfaceC1538[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1992 m6514(C1992 c1992) {
        InterfaceC1538[] interfaceC1538Arr = this.f6672;
        if (this != c1992) {
            try {
                int length = interfaceC1538Arr.length;
                if (c1992.f6672.length != length) {
                    throw new C2698("mismatched maxLocals values", null);
                }
                C1992 c19922 = null;
                for (int i = 0; i < length; i++) {
                    InterfaceC1538 interfaceC1538 = interfaceC1538Arr[i];
                    InterfaceC1538 m51030 = C22927.m51030(interfaceC1538, c1992.f6672[i]);
                    if (m51030 != interfaceC1538) {
                        if (c19922 == null) {
                            c19922 = mo6520();
                        }
                        if (m51030 != null) {
                            c19922.mo6517(i, m51030);
                        } else {
                            c19922.m43734();
                            c19922.f6672[i] = null;
                        }
                    }
                }
                if (c19922 != null) {
                    c19922.mo20349();
                    return c19922;
                }
            } catch (C2698 e) {
                e.m21602("underlay locals:");
                mo6518(e);
                e.m21602("overlay locals:");
                c1992.mo6518(e);
                throw e;
            }
        }
        return this;
    }

    @Override // l.AbstractC13943
    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1992 mo6520() {
        InterfaceC1538[] interfaceC1538Arr = this.f6672;
        C1992 c1992 = new C1992(interfaceC1538Arr.length);
        System.arraycopy(interfaceC1538Arr, 0, c1992.f6672, 0, interfaceC1538Arr.length);
        return c1992;
    }

    @Override // l.AbstractC13943
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6518(C2698 c2698) {
        int i = 0;
        while (true) {
            InterfaceC1538[] interfaceC1538Arr = this.f6672;
            if (i >= interfaceC1538Arr.length) {
                return;
            }
            InterfaceC1538 interfaceC1538 = interfaceC1538Arr[i];
            c2698.m21602("locals[" + C14712.m35006(i) + "]: " + (interfaceC1538 == null ? "<invalid>" : interfaceC1538.toString()));
            i++;
        }
    }

    @Override // l.InterfaceC0601
    /* renamed from: ֫ */
    public final String mo2463() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            InterfaceC1538[] interfaceC1538Arr = this.f6672;
            if (i < interfaceC1538Arr.length) {
                InterfaceC1538 interfaceC1538 = interfaceC1538Arr[i];
                sb.append("locals[" + C14712.m35006(i) + "]: " + (interfaceC1538 == null ? "<invalid>" : interfaceC1538.toString()) + "\n");
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // l.AbstractC13943
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6522(C7573 c7573) {
        InterfaceC1538[] interfaceC1538Arr = this.f6672;
        int length = interfaceC1538Arr.length;
        if (length == 0) {
            return;
        }
        m43734();
        C7573 m20305 = c7573.m20305();
        for (int i = 0; i < length; i++) {
            if (interfaceC1538Arr[i] == c7573) {
                interfaceC1538Arr[i] = m20305;
            }
        }
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m6521() {
        return this.f6672.length;
    }

    @Override // l.AbstractC13943
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6517(int i, InterfaceC1538 interfaceC1538) {
        int i2;
        InterfaceC1538 interfaceC15382;
        m43734();
        try {
            InterfaceC1538 mo5254 = interfaceC1538.mo5254();
            if (i < 0) {
                throw new IndexOutOfBoundsException("idx < 0");
            }
            boolean m20308 = mo5254.getType().m20308();
            InterfaceC1538[] interfaceC1538Arr = this.f6672;
            if (m20308) {
                interfaceC1538Arr[i + 1] = null;
            }
            interfaceC1538Arr[i] = mo5254;
            if (i == 0 || (interfaceC15382 = interfaceC1538Arr[i - 1]) == null || !interfaceC15382.getType().m20308()) {
                return;
            }
            interfaceC1538Arr[i2] = null;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    @Override // l.AbstractC13943
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6519(C21480 c21480) {
        mo6517(c21480.m48652(), c21480);
    }

    @Override // l.AbstractC13943
    public final InterfaceC1538 get(int i) {
        InterfaceC1538 interfaceC1538 = this.f6672[i];
        if (interfaceC1538 != null) {
            return interfaceC1538;
        }
        throw new C2698("local " + C14712.m35006(i) + ": invalid", null);
    }

    @Override // l.AbstractC13943
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13943 mo6516(AbstractC13943 abstractC13943) {
        if (abstractC13943 instanceof C1992) {
            return m6514((C1992) abstractC13943);
        }
        return abstractC13943.mo6516(this);
    }

    @Override // l.AbstractC13943
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7594 mo6515(AbstractC13943 abstractC13943, int i) {
        return new C7594(this.f6672.length).mo6515(abstractC13943, i);
    }
}
