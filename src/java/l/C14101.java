package l;

/* compiled from: E8KH */
/* renamed from: l.ܰ᩹֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14101 implements InterfaceC22757 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C8893 f42572;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC1837 f42573;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f42574;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC22757 f42575;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f42576 = true;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC23274 f42577;

    public C14101(InterfaceC23274 interfaceC23274, InterfaceC16427 interfaceC16427) {
        this.f42577 = interfaceC23274;
        this.f42572 = new C8893(interfaceC16427);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33714() {
        this.f42574 = true;
        this.f42572.m22966();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33717() {
        this.f42574 = false;
        this.f42572.m22968();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33715(long j) {
        this.f42572.m22967(j);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33718(InterfaceC1837 interfaceC1837) {
        InterfaceC22757 interfaceC22757;
        InterfaceC22757 mo6094 = interfaceC1837.mo6094();
        if (mo6094 == null || mo6094 == (interfaceC22757 = this.f42575)) {
            return;
        }
        if (interfaceC22757 != null) {
            throw C18273.m42604(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f42575 = mo6094;
        this.f42573 = interfaceC1837;
        mo6094.mo13455(this.f42572.mo13468());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33716(InterfaceC1837 interfaceC1837) {
        if (interfaceC1837 == this.f42573) {
            this.f42575 = null;
            this.f42573 = null;
            this.f42576 = true;
        }
    }

    @Override // l.InterfaceC22757
    /* renamed from: ᩴ */
    public final long mo13471() {
        if (this.f42576) {
            return this.f42572.mo13471();
        }
        InterfaceC22757 interfaceC22757 = this.f42575;
        interfaceC22757.getClass();
        return interfaceC22757.mo13471();
    }

    @Override // l.InterfaceC22757
    /* renamed from: ۢ */
    public final boolean mo13463() {
        if (this.f42576) {
            this.f42572.getClass();
            return false;
        }
        InterfaceC22757 interfaceC22757 = this.f42575;
        interfaceC22757.getClass();
        return interfaceC22757.mo13463();
    }

    @Override // l.InterfaceC22757
    /* renamed from: ֫ */
    public final void mo13455(C2730 c2730) {
        InterfaceC22757 interfaceC22757 = this.f42575;
        if (interfaceC22757 != null) {
            interfaceC22757.mo13455(c2730);
            c2730 = this.f42575.mo13468();
        }
        this.f42572.mo13455(c2730);
    }

    @Override // l.InterfaceC22757
    /* renamed from: ܽ */
    public final C2730 mo13468() {
        InterfaceC22757 interfaceC22757 = this.f42575;
        if (interfaceC22757 != null) {
            return interfaceC22757.mo13468();
        }
        return this.f42572.mo13468();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m33713(boolean z) {
        InterfaceC1837 interfaceC1837 = this.f42573;
        C8893 c8893 = this.f42572;
        if (interfaceC1837 == null || interfaceC1837.mo6098() || ((z && this.f42573.getState() != 2) || (!this.f42573.mo6101() && (z || this.f42573.mo6104())))) {
            this.f42576 = true;
            if (this.f42574) {
                c8893.m22966();
            }
        } else {
            InterfaceC22757 interfaceC22757 = this.f42575;
            interfaceC22757.getClass();
            long mo13471 = interfaceC22757.mo13471();
            if (this.f42576) {
                if (mo13471 < c8893.mo13471()) {
                    c8893.m22968();
                } else {
                    this.f42576 = false;
                    if (this.f42574) {
                        c8893.m22966();
                    }
                }
            }
            c8893.m22967(mo13471);
            C2730 mo13468 = interfaceC22757.mo13468();
            if (!mo13468.equals(c8893.mo13468())) {
                c8893.mo13455(mo13468);
                ((C19936) this.f42577).m46002(mo13468);
            }
        }
        return mo13471();
    }
}
