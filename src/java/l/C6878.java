package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;

/* compiled from: R7DK */
/* renamed from: l.ۜܽ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6878 extends AbstractC11817 implements InterfaceC3350 {

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int f21253;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f21254;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f21255;

    @Override // l.AbstractC11817
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo18620(DataInputStream dataInputStream, EnumC4662 enumC4662, int i) {
        int i2 = C23811.f77062[enumC4662.ordinal()];
        if (i2 == 1) {
            if (this.f35266 != null) {
                this.f35255.mo2245("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", EnumC4662.f14797.m13647(), EnumC3251.field_info.toString());
            }
            C6899 c6899 = new C6899((C20826) this.f35257);
            c6899.m18671(i, dataInputStream);
            this.f35266 = c6899;
            return true;
        }
        if (i2 != 2) {
            return false;
        }
        if (i != 2) {
            if (this.f29352) {
                this.f35255.mo11946("{0}: Invalid attribute length #{1}", EnumC4662.f14793.m13647(), Integer.valueOf(i));
            } else {
                throw new C4375(this.f35255.m45770(), "{0}: Invalid attribute length #{1}", EnumC4662.f14793.m13647(), Integer.valueOf(i));
            }
        }
        EnumC4662 enumC46622 = EnumC4662.f14793;
        if (m28903(enumC46622).size() > 1) {
            this.f35255.mo2245("There is more than one \"{0}\" attribute in the attributes table of a \"{1}\" structure. The last one is used.", enumC46622.m13647(), EnumC3251.field_info.toString());
        }
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.f21254 = readUnsignedShort;
        if (!this.f35264.m25968(readUnsignedShort)) {
            this.f35255.mo2245("The constantvalue_index \"{0}\" is not a valid index into the constant_pool table.", Integer.valueOf(this.f21254));
            return true;
        }
        C10242 c10242 = this.f35264;
        int i3 = this.f21254;
        EnumC12358[] enumC12358Arr = {EnumC12358.CONSTANT_INTEGER, EnumC12358.CONSTANT_FLOAT, EnumC12358.CONSTANT_DOUBLE, EnumC12358.CONSTANT_LONG, EnumC12358.CONSTANT_STRING};
        AbstractC3186 m25953 = c10242.m25953(i3);
        if (!(m25953 != null ? m25953.f10052.m29982(enumC12358Arr) : false)) {
            AbstractC3186 m259532 = this.f35264.m25953(this.f21254);
            EnumC12358 enumC12358 = m259532 != null ? m259532.f10052 : null;
            this.f35255.mo2245("The constant_pool entry \"{0}\" is not of an appropriate type for the field.", enumC12358 == null ? "unknown" : enumC12358.m29981());
        }
        return true;
    }

    @Override // l.AbstractC11817
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo18621(int i) {
        if (!((C20826) this.f35257).f35264.m25968(i)) {
            this.f35255.mo2245("The value of the attribute_name_index #{0} item is not a valid index into the constant_pool table. The attribute is ignored.", Integer.valueOf(i));
        } else {
            this.f35255.mo2245("The attribute_name_index #{0} refers to an unknown attribute name. The attribute is ignored.", Integer.valueOf(i));
        }
    }

    @Override // l.AbstractC9701
    /* renamed from: ۧ */
    public final void mo4064(int i, int i2) {
        String str;
        String concat;
        int i3;
        C6899 c6899 = this.f35266;
        boolean z = (c6899 == null || c6899.f29340 || !this.f29347) ? false : true;
        mo7967(this.f35265, this.f35259);
        mo7967(this.f35263, this.f35267);
        EnumC4662 enumC4662 = EnumC4662.f14807;
        if (m28903(enumC4662).size() > 0) {
            for (C21263 c21263 : m28903(enumC4662)) {
                m24665(String.format("// Ignored unrecognized attribute: { u2 #%d; u4 %d; u1[ %s ]; }", Integer.valueOf(c21263.m48277()), Integer.valueOf(c21263.m48276()), c21263.m48271()));
            }
        }
        boolean z2 = this.f29326;
        if (!z2 && (i3 = this.f21254) != -1) {
            C10242 c10242 = this.f35264;
            EnumC12358[] enumC12358Arr = {EnumC12358.CONSTANT_INTEGER, EnumC12358.CONSTANT_FLOAT, EnumC12358.CONSTANT_DOUBLE, EnumC12358.CONSTANT_LONG, EnumC12358.CONSTANT_STRING};
            AbstractC3186 m25953 = c10242.m25953(i3);
            if (!(m25953 != null ? m25953.f10052.m29982(enumC12358Arr) : false)) {
                AbstractC3186 m259532 = this.f35264.m25953(this.f21254);
                EnumC12358 enumC12358 = m259532 != null ? m259532.f10052 : null;
                m24665("// ".concat(this.f35255.m45769("Unrecognized constantvalue_index: #{0} [ {1} ]", Integer.valueOf(this.f21254), enumC12358 == null ? "unknown" : enumC12358.m29981())));
            }
        }
        StringBuilder sb = new StringBuilder(m24650());
        sb.append(EnumC6073.m16932(this.f35254, EnumC20185.FIELD));
        sb.append(m28908());
        sb.append(EnumC15204.f46593.m35967());
        sb.append(' ');
        int max = Math.max(sb.length() - (m24656() * 2), m24656() + EnumC0970.SIGNATURE.m3428().length());
        int i4 = this.f21254;
        if (i4 != -1) {
            if (!z2 && i4 != -1) {
                C10242 c102422 = this.f35264;
                EnumC12358[] enumC12358Arr2 = {EnumC12358.CONSTANT_INTEGER, EnumC12358.CONSTANT_FLOAT, EnumC12358.CONSTANT_DOUBLE, EnumC12358.CONSTANT_LONG, EnumC12358.CONSTANT_STRING};
                AbstractC3186 m259533 = c102422.m25953(i4);
                if (!(m259533 != null ? m259533.f10052.m29982(enumC12358Arr2) : false)) {
                    concat = "";
                    str = concat;
                }
            }
            concat = " = ".concat(((C20826) this.f35257).f35264.m25961(this.f21254));
            str = concat;
        } else {
            str = null;
        }
        m28905(sb, str, z ? ":" : l.b, this.f21255, this.f21253, this.f21254);
        if (z) {
            C6899 c68992 = this.f35266;
            c68992.m18676(max);
            c68992.m24664(1);
            c68992.f29349 = mo6398() - (m24669() * 2);
            this.f35266.mo3021();
        }
    }

    @Override // l.AbstractC9701
    /* renamed from: ᩳ */
    public final void mo4067(int i, int i2) {
        mo4064(i, i2);
    }

    @Override // l.InterfaceC3350
    /* renamed from: ᩳ */
    public final int mo10250() {
        String str;
        if (!this.f29326 || this.f29343) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder(EnumC6073.m16932(this.f35254, EnumC20185.FIELD));
            sb.append(m28908());
            sb.append(EnumC15204.f46593.m35967());
            sb.append(" #");
            sb.append(this.f21255);
            sb.append(":#");
            sb.append(this.f21253);
            C6899 c6899 = this.f35266;
            if (c6899 != null && c6899.f29340) {
                sb.append(":#");
                sb.append(this.f35266.m18673());
            }
            if (this.f21254 != -1) {
                sb.append(" = #");
                sb.append(this.f21254);
            }
            sb.append(';');
            str = sb.toString();
        }
        return str.length();
    }

    @Override // l.InterfaceC3350
    /* renamed from: ֫ */
    public final void mo10249(int i) {
        this.f29353 = i;
    }

    @Override // l.AbstractC9701
    /* renamed from: ܿ */
    public final int mo6398() {
        return Math.max(this.f29349, m24656() + this.f29353);
    }
}
