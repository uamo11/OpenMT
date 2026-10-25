package l;

/* compiled from: DBGV */
/* renamed from: l.۬ܽܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13238 extends C18947 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f39628;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC1538[] f39629;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean[] f39630;

    public C13238(int i) {
        super(i != 0);
        this.f39629 = new InterfaceC1538[i];
        this.f39630 = new boolean[i];
        this.f39628 = 0;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C13238 m32110() {
        InterfaceC1538[] interfaceC1538Arr = this.f39629;
        C13238 c13238 = new C13238(interfaceC1538Arr.length);
        System.arraycopy(interfaceC1538Arr, 0, c13238.f39629, 0, interfaceC1538Arr.length);
        boolean[] zArr = c13238.f39630;
        boolean[] zArr2 = this.f39630;
        System.arraycopy(zArr2, 0, zArr, 0, zArr2.length);
        c13238.f39628 = this.f39628;
        return c13238;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32114(C2698 c2698) {
        int i = this.f39628 - 1;
        int i2 = 0;
        while (i2 <= i) {
            StringBuilder m9834 = C3200.m9834("stack[", i2 == i ? "top0" : C14712.m35006(i - i2), "]: ");
            InterfaceC1538 interfaceC1538 = this.f39629[i2];
            m9834.append(interfaceC1538 == null ? "<invalid>" : interfaceC1538.toString());
            c2698.m21602(m9834.toString());
            i2++;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32117(C7573 c7573) {
        if (this.f39628 == 0) {
            return;
        }
        m43734();
        C7573 m20305 = c7573.m20305();
        for (int i = 0; i < this.f39628; i++) {
            InterfaceC1538[] interfaceC1538Arr = this.f39629;
            if (interfaceC1538Arr[i] == c7573) {
                interfaceC1538Arr[i] = m20305;
            }
        }
    }

    public final int size() {
        return this.f39628;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m32115() {
        m43734();
        for (int i = 0; i < this.f39628; i++) {
            this.f39629[i] = null;
            this.f39630[i] = false;
        }
        this.f39628 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32113(InterfaceC1538 interfaceC1538) {
        m43734();
        try {
            InterfaceC1538 mo5254 = interfaceC1538.mo5254();
            int m20314 = mo5254.getType().m20314();
            int i = this.f39628;
            int i2 = i + m20314;
            InterfaceC1538[] interfaceC1538Arr = this.f39629;
            if (i2 > interfaceC1538Arr.length) {
                m32109("overflow");
                throw null;
            }
            if (m20314 == 2) {
                interfaceC1538Arr[i] = null;
                this.f39628 = i + 1;
            }
            int i3 = this.f39628;
            interfaceC1538Arr[i3] = mo5254;
            this.f39628 = i3 + 1;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m32119() {
        m43734();
        this.f39630[this.f39628] = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1538 m32111(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        if (i >= this.f39628) {
            m32109("underflow");
            throw null;
        }
        return this.f39629[(r0 - i) - 1];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m32118(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        if (i >= this.f39628) {
            throw new C2698("stack: underflow", null);
        }
        return this.f39630[(r0 - i) - 1];
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7573 m32120(int i) {
        return m32111(i).getType();
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC1538 m32116() {
        m43734();
        InterfaceC1538 m32111 = m32111(0);
        int i = this.f39628;
        int i2 = i - 1;
        this.f39629[i2] = null;
        this.f39630[i2] = false;
        this.f39628 = i - m32111.getType().m20314();
        return m32111;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32112(int i, InterfaceC1538 interfaceC1538) {
        m43734();
        try {
            InterfaceC1538 mo5254 = interfaceC1538.mo5254();
            int i2 = (this.f39628 - i) - 1;
            InterfaceC1538[] interfaceC1538Arr = this.f39629;
            InterfaceC1538 interfaceC15382 = interfaceC1538Arr[i2];
            if (interfaceC15382 == null || interfaceC15382.getType().m20314() != mo5254.getType().m20314()) {
                StringBuilder sb = new StringBuilder("incompatible substitution: ");
                sb.append(interfaceC15382 == null ? "<invalid>" : interfaceC15382.toString());
                sb.append(" -> ");
                sb.append(mo5254 != null ? mo5254.toString() : "<invalid>");
                m32109(sb.toString());
                throw null;
            }
            interfaceC1538Arr[i2] = mo5254;
        } catch (NullPointerException unused) {
            throw new NullPointerException("type == null");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32109(String str) {
        throw new C2698(C20094.m46315("stack: ", str), null);
    }
}
