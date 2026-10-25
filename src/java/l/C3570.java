package l;

import org.bouncycastle.asn1.util.ASN1Dump;

/* compiled from: M4YN */
/* renamed from: l.ۗ᩻ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3570 extends AbstractC15772 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C18304 f11316;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4981 f11317;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C12512 f11318;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12512 f11319;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C10835 f11320;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C13217 f11321;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C8509 f11322;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f11323;

    @Override // l.AbstractC2368
    /* renamed from: ۧ */
    public final int mo3385() {
        return 32;
    }

    public C3570(C12512 c12512, int i, C12512 c125122, InterfaceC10711 interfaceC10711, C13217 c13217) {
        if (c12512 == null) {
            throw new NullPointerException("thisClass == null");
        }
        if (interfaceC10711 == null) {
            throw new NullPointerException("interfaces == null");
        }
        this.f11318 = c12512;
        this.f11323 = i;
        this.f11319 = c125122;
        this.f11316 = interfaceC10711.size() == 0 ? null : new C18304(interfaceC10711);
        this.f11321 = c13217;
        this.f11317 = new C4981(c12512);
        this.f11320 = null;
        this.f11322 = new C8509();
    }

    @Override // l.AbstractC2368
    /* renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_CLASS_DEF_ITEM;
    }

    @Override // l.AbstractC2368
    /* renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        C16892 m5632 = c1662.m5632();
        C4484 m5614 = c1662.m5614();
        C4484 m5620 = c1662.m5620();
        C4484 m5612 = c1662.m5612();
        C2076 m5631 = c1662.m5631();
        m5632.m39750(this.f11318);
        C4981 c4981 = this.f11317;
        if (!c4981.m14466()) {
            c1662.m5628().m13220((AbstractC3073) c4981);
            C11102 m14464 = c4981.m14464();
            if (m14464 != null) {
                this.f11320 = (C10835) m5614.m13223(new C10835(m14464));
            }
        }
        C12512 c12512 = this.f11319;
        if (c12512 != null) {
            m5632.m39750(c12512);
        }
        C18304 c18304 = this.f11316;
        if (c18304 != null) {
            this.f11316 = (C18304) m5612.m13223(c18304);
        }
        C13217 c13217 = this.f11321;
        if (c13217 != null) {
            m5631.m6832(c13217);
        }
        if (this.f11322.m22206()) {
            return;
        }
        if (this.f11322.m22207()) {
            this.f11322 = (C8509) m5620.m13223(this.f11322);
        } else {
            m5620.m13220((AbstractC3073) this.f11322);
        }
    }

    @Override // l.AbstractC2368
    /* renamed from: ֫ */
    public final void mo3384(C1662 c1662, C18241 c18241) {
        boolean m42506 = c18241.m42506();
        C16892 m5632 = c1662.m5632();
        C12512 c12512 = this.f11318;
        int m39748 = m5632.m39748(c12512);
        C12512 c125122 = this.f11319;
        int m397482 = c125122 == null ? -1 : m5632.m39748(c125122);
        C18304 c18304 = this.f11316;
        int m9390 = c18304 == null ? 0 : c18304.m9390();
        int m93902 = this.f11322.m22206() ? 0 : this.f11322.m9390();
        C13217 c13217 = this.f11321;
        int m6830 = c13217 != null ? c1662.m5631().m6830(c13217) : -1;
        C4981 c4981 = this.f11317;
        int m93903 = c4981.m14466() ? 0 : c4981.m9390();
        C10835 c10835 = this.f11320;
        int m93904 = c10835 == null ? 0 : c10835.m9390();
        int i = this.f11323;
        if (m42506) {
            c18241.m42501(0, m37189() + ' ' + c12512.mo2463());
            c18241.m42501(4, "  class_idx:           ".concat(C14712.m35008(m39748)));
            StringBuilder sb = new StringBuilder("  access_flags:        ");
            sb.append(C1724.m5772(i));
            c18241.m42501(4, sb.toString());
            StringBuilder sb2 = new StringBuilder("  superclass_idx:      ");
            sb2.append(C14712.m35008(m397482));
            sb2.append(" // ");
            sb2.append(c125122 == null ? "<none>" : c125122.mo2463());
            c18241.m42501(4, sb2.toString());
            c18241.m42501(4, "  interfaces_off:      ".concat(C14712.m35008(m9390)));
            if (m9390 != 0) {
                InterfaceC10711 m42643 = this.f11316.m42643();
                int i2 = 0;
                for (int size = m42643.size(); i2 < size; size = size) {
                    c18241.m42501(0, ASN1Dump.TAB + m42643.getType(i2).mo2463());
                    i2++;
                }
            }
            StringBuilder sb3 = new StringBuilder("  source_file_idx:     ");
            sb3.append(C14712.m35008(m6830));
            sb3.append(" // ");
            sb3.append(c13217 != null ? c13217.mo2463() : "<none>");
            c18241.m42501(4, sb3.toString());
            c18241.m42501(4, "  annotations_off:     ".concat(C14712.m35008(m93902)));
            c18241.m42501(4, "  class_data_off:      ".concat(C14712.m35008(m93903)));
            c18241.m42501(4, "  static_values_off:   ".concat(C14712.m35008(m93904)));
        }
        c18241.m42514(m39748);
        c18241.m42514(i);
        c18241.m42514(m397482);
        c18241.m42514(m9390);
        c18241.m42514(m6830);
        c18241.m42514(m93902);
        c18241.m42514(m93903);
        c18241.m42514(m93904);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C12512 m10885() {
        return this.f11318;
    }

    /* renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public final C12512 m10884() {
        return this.f11319;
    }

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 m10887() {
        C18304 c18304 = this.f11316;
        if (c18304 == null) {
            return C13922.f41594;
        }
        return c18304.m42643();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10879(C16478 c16478, AbstractC13717 abstractC13717) {
        this.f11317.m14462(c16478, abstractC13717);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10878(C16478 c16478) {
        this.f11317.m14461(c16478);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10880(C17184 c17184) {
        this.f11317.m14463(c17184);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10886(C17184 c17184) {
        this.f11317.m14465(c17184);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10883(C22911 c22911, C1662 c1662) {
        this.f11322.m22205(c22911, c1662);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10877(C8985 c8985, C22911 c22911, C1662 c1662) {
        this.f11322.m22202(c8985, c22911, c1662);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10882(C22390 c22390, C22911 c22911, C1662 c1662) {
        this.f11322.m22204(c22390, c22911, c1662);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10881(C22390 c22390, C13738 c13738, C1662 c1662) {
        this.f11322.m22203(c22390, c13738, c1662);
    }
}
