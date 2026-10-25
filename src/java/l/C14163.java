package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: 643O */
/* renamed from: l.ܳ֡֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14163 extends AbstractC19810 implements InterfaceC9169 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public AbstractC14016 f42762;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C21863 f42763;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f42764;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C2609 f42765;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC18278 f42766;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC10370 f42767;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C2609 f42768;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C2609 f42769;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18278 f42770;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC10370 f42771;

    public C14163(long j, AbstractC10370 abstractC10370, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698) {
        super(EnumC1296.f4582, j, abstractC10370, abstractC4308, abstractC5698);
        this.f42768 = C2609.m8239();
        this.f42764 = false;
        this.f42762 = null;
        this.f42767 = AbstractC19810.m45553(abstractC10370, abstractC5698);
        this.f42771 = AbstractC19810.m45552(abstractC10370, abstractC5698);
        this.f42770 = null;
        this.f42766 = null;
        this.f42763 = C21863.m49251();
        this.f42765 = C2609.m8239();
    }

    public C14163(long j, AbstractC10370 abstractC10370, AbstractC5698 abstractC5698) {
        this(j, abstractC10370, new C19955(null, AbstractC4308.f13885, null), abstractC5698);
        this.f17560.f13890 = this;
    }

    @Override // l.AbstractC5698
    /* renamed from: ۬ */
    public final long mo16084() {
        mo16101();
        return this.f17563;
    }

    @Override // l.AbstractC5698
    /* renamed from: ֨֫ */
    public final AbstractC14016 mo16064() {
        mo16101();
        return this.f42762;
    }

    @Override // l.AbstractC5698
    /* renamed from: ֫֫ */
    public final C2609 mo16068() {
        mo16101();
        return super.mo16068();
    }

    @Override // l.AbstractC5698
    /* renamed from: ۧ֫ */
    public final C2609 mo16081() {
        mo16101();
        return super.mo16081();
    }

    @Override // l.AbstractC5698
    /* renamed from: ܽ */
    public final AbstractC4308 mo16091(C6319 c6319) {
        if (this.f17565 == null) {
            this.f17565 = new C19955(c6319.m17519(this.f17560.mo4958()), C2609.m8239(), this, this.f17560.f13889);
        }
        return this.f17565;
    }

    @Override // l.AbstractC5698
    public final String toString() {
        if (this.f17562.isEmpty()) {
            return C22364.m50106("anonymous.class", this.f42771);
        }
        return this.f42767.toString();
    }

    @Override // l.AbstractC5698
    /* renamed from: ۟ */
    public final AbstractC10370 mo16076() {
        return this.f42767;
    }

    @Override // l.InterfaceC9169, l.InterfaceC21164
    /* renamed from: ۧ */
    public final AbstractC10370 mo957() {
        return this.f42767;
    }

    @Override // l.AbstractC19810, l.AbstractC5698, l.InterfaceC11970
    /* renamed from: ܺ */
    public final C2609 mo958() {
        C2609 mo958 = super.mo958();
        if (!this.f42768.isEmpty()) {
            Iterator it = this.f42768.m8250().iterator();
            while (it.hasNext()) {
                mo958 = mo958.m8246((C21221) it.next());
            }
        }
        return mo958;
    }

    @Override // l.AbstractC5698
    /* renamed from: ۫ */
    public final AbstractC10370 mo16083() {
        return this.f42771;
    }

    @Override // l.AbstractC5698
    /* renamed from: ۧ */
    public final boolean mo16080(AbstractC5698 abstractC5698, C6319 c6319) {
        if (this == abstractC5698) {
            return true;
        }
        if ((abstractC5698.mo16084() & 512) != 0) {
            AbstractC4308 abstractC4308 = this.f17560;
            while (abstractC4308.m12913(EnumC9454.CLASS)) {
                for (C2609 m17510 = c6319.m17510(abstractC4308); m17510.m8249(); m17510 = m17510.f8241) {
                    if (((AbstractC4308) m17510.f8240).f13890.mo16080(abstractC5698, c6319)) {
                        return true;
                    }
                }
                abstractC4308 = c6319.m17562(abstractC4308);
            }
            return false;
        }
        AbstractC4308 abstractC43082 = this.f17560;
        while (abstractC43082.m12913(EnumC9454.CLASS)) {
            if (abstractC43082.f13890 == abstractC5698) {
                return true;
            }
            abstractC43082 = c6319.m17562(abstractC43082);
        }
        return false;
    }

    @Override // l.AbstractC5698
    /* renamed from: ᩶ */
    public final void mo16101() {
        InterfaceC6403 interfaceC6403 = this.f17564;
        try {
            super.mo16101();
        } catch (C20515 e) {
            e.f66104.m6535(this, interfaceC6403);
            this.f17563 |= 9;
            this.f17560 = new C12193(this, AbstractC4308.f13885);
            throw e;
        }
    }

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33806() {
        m16103();
        AbstractC4308 abstractC4308 = this.f17560;
        if (abstractC4308 instanceof C19955) {
            C19955 c19955 = (C19955) abstractC4308;
            if (c19955.f64620 == null) {
                c19955.f64620 = C2609.m8239();
            }
            C2609 c2609 = c19955.f64619;
            if (c2609 != null) {
                C18837 c18837 = new C18837();
                Iterator it = c2609.iterator();
                while (it.hasNext()) {
                    c18837.m43511(((AbstractC4308) it.next()).mo12330());
                }
                return c18837.m43517();
            }
            return c19955.f64620;
        }
        return C2609.m8239();
    }

    @Override // l.InterfaceC9169
    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final AbstractC4308 mo23577() {
        m16103();
        AbstractC4308 abstractC4308 = this.f17560;
        if (abstractC4308 instanceof C19955) {
            C19955 c19955 = (C19955) abstractC4308;
            if (c19955.f64618 == null) {
                c19955.f64618 = AbstractC4308.f13885;
            }
            if (c19955.mo12925()) {
                return AbstractC4308.f13885;
            }
            return c19955.f64618.mo12330();
        }
        return AbstractC4308.f13885;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* renamed from: ֫ */
    public final EnumC23258 mo952() {
        m16103();
        mo16101();
        long j = this.f17563;
        if ((8192 & j) != 0) {
            return EnumC23258.ANNOTATION_TYPE;
        }
        if ((512 & j) != 0) {
            return EnumC23258.INTERFACE;
        }
        if ((16384 & j) != 0) {
            return EnumC23258.ENUM;
        }
        if ((j & 2305843009213693952L) != 0) {
            return EnumC23258.RECORD;
        }
        return EnumC23258.CLASS;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* renamed from: ܳ */
    public final Set mo10965() {
        m16103();
        mo16101();
        return C19642.m45151(this.f17563 & (-8796093022209L));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21221 m33803(C12048 c12048) {
        Iterator it = this.f42768.iterator();
        while (it.hasNext()) {
            C21221 c21221 = (C21221) it.next();
            if (c21221.f17562 == c12048.f17562) {
                return c21221;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21221 m33802(C9378 c9378) {
        int i;
        Iterator it = this.f42768.iterator();
        C21221 c21221 = null;
        while (it.hasNext()) {
            C21221 c212212 = (C21221) it.next();
            if (c212212.f17562 == c9378.f28484) {
                int i2 = c9378.f16085;
                i = c212212.f68392;
                if (i2 == i) {
                    c21221 = c212212;
                }
            }
        }
        return c21221;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33804(C21221 c21221, C9378 c9378, C2609 c2609) {
        boolean z;
        C2609 c26092;
        boolean z2;
        if (c21221 != null) {
            C2609 m8237 = C2609.m8237(c21221, this.f42768);
            this.f42768 = m8237;
            C12048 c12048 = c9378.f28489;
            c26092 = c21221.f68390;
            z2 = c21221.f68388;
            this.f42768 = m8237.m8242(new C21221(c12048, c26092, z2));
            return;
        }
        C2609 c26093 = this.f42768;
        C12048 c120482 = c9378.f28489;
        if (c120482.f17560.m12913(EnumC9454.ARRAY)) {
            C5138 c5138 = (C5138) c120482.f17560;
            c5138.getClass();
            if (c5138 instanceof C0198) {
                z = true;
                this.f42768 = c26093.m8242(new C21221(c120482, c2609, z));
            }
        }
        z = false;
        this.f42768 = c26093.m8242(new C21221(c120482, c2609, z));
    }

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33809() {
        return this.f42768;
    }

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33811() {
        return this.f42768;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m33815(C2609 c2609) {
        this.f42768 = c2609;
    }

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final EnumC23985 m33812() {
        m16103();
        if (this.f17561.f17559 == EnumC1296.f4579) {
            return EnumC23985.TOP_LEVEL;
        }
        if (this.f17562.isEmpty()) {
            return EnumC23985.ANONYMOUS;
        }
        if (this.f17561.f17559 == EnumC1296.f4571) {
            return EnumC23985.LOCAL;
        }
        return EnumC23985.MEMBER;
    }

    @Override // l.InterfaceC11970
    /* renamed from: ֫ */
    public final Object mo951(AbstractC8463 abstractC8463, Object obj) {
        return abstractC8463.mo10392(this, obj);
    }

    @Override // l.AbstractC19810, l.AbstractC5698
    /* renamed from: ֫ */
    public final Object mo2899(InterfaceC9932 interfaceC9932, Locale locale) {
        return interfaceC9932.mo23525(this, (Object) locale);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m33813(C6319 c6319) {
        if (c6319.f19569.m33123(this) != null) {
            mo16101();
            if ((this.f17563 & 16384) == 0 || c6319.m17562(this.f17560).f13890 != c6319.f19609.f66527) {
                return;
            }
            mo16101();
            if ((this.f17563 & 1040) != 0 || c6319.m17486(this) == null) {
                return;
            }
            this.f17563 |= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }
    }

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final void m33817() {
        this.f17559 = EnumC1296.f4582;
        this.f17565 = null;
        this.f42762 = null;
        this.f17563 = 0L;
        AbstractC4308 abstractC4308 = this.f17560;
        if (abstractC4308 instanceof C19955) {
            C19955 c19955 = (C19955) abstractC4308;
            c19955.mo4959(AbstractC4308.f13885);
            c19955.f64621 = -1;
            c19955.f64616 = null;
            c19955.f64617 = null;
            c19955.f64618 = null;
            c19955.f64620 = null;
            c19955.f64619 = null;
        }
        m33807();
    }

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final void m33807() {
        this.f17558 = null;
        this.f42763 = C21863.m49251();
    }

    @Override // l.AbstractC19810
    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final C21863 mo33816() {
        return this.f42763;
    }

    @Override // l.AbstractC19810
    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final boolean mo33814() {
        return (this.f17563 & 8192) != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33805(C21863 c21863) {
        C12171.m29642(!this.f42763.m49254());
        this.f42763 = c21863;
    }

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33810() {
        return (this.f17563 & 2305843009213693952L) != 0;
    }
}
