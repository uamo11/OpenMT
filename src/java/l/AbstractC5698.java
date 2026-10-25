package l;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.bouncycastle.crypto.digests.SkeinEngine;

/* compiled from: 643O */
/* renamed from: l.ۛ֡֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC5698 extends AbstractC13521 implements InterfaceC21496, InterfaceC11970 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C11343 f17558;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC1296 f17559;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f17560;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f17561;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractC10370 f17562;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f17563;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC6403 f17564 = InterfaceC6403.f19811;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f17565 = null;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public AbstractC14016 mo16064() {
        return null;
    }

    /* renamed from: ֫ */
    public Object mo3574(C6319 c6319) {
        return this;
    }

    /* renamed from: ֫ */
    public boolean mo10962(AbstractC5698 abstractC5698, AbstractC19810 abstractC19810, C6319 c6319, boolean z) {
        return false;
    }

    /* renamed from: ۗ */
    public boolean mo15574() {
        return true;
    }

    /* renamed from: ᩹ */
    public AbstractC5698 mo7048() {
        return this;
    }

    public AbstractC5698(EnumC1296 enumC1296, long j, AbstractC10370 abstractC10370, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698) {
        this.f17559 = enumC1296;
        this.f17563 = j;
        this.f17560 = abstractC4308;
        this.f17561 = abstractC5698;
        this.f17562 = abstractC10370;
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long mo16084() {
        return this.f17563;
    }

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C2609 mo16068() {
        C11343 c11343 = this.f17558;
        if (c11343 == null) {
            return C2609.m8239();
        }
        return c11343.m28039();
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C2609 mo16081() {
        C11343 c11343 = this.f17558;
        if (c11343 == null) {
            return C2609.m8239();
        }
        return c11343.m28047();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16384 m16065(AbstractC5698 abstractC5698) {
        Iterator it = mo16068().iterator();
        while (it.hasNext()) {
            C16384 c16384 = (C16384) it.next();
            if (c16384.f26338.f13890 == abstractC5698) {
                return c16384;
            }
        }
        return null;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m16088() {
        C11343 c11343 = this.f17558;
        if (c11343 == null) {
            return false;
        }
        return c11343.m28050();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16066(C2609 c2609) {
        if (c2609.m8249()) {
            m16063().m28034(c2609);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16079(C2609 c2609) {
        if (c2609.m8249()) {
            m16063().m28040(c2609);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m16092(C2609 c2609) {
        if (c2609.m8249()) {
            m16063().m28044(c2609);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m16097(C2609 c2609) {
        if (c2609.m8249()) {
            m16063().m28048(c2609);
        }
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C2609 m16073() {
        C11343 c11343 = this.f17558;
        if (c11343 == null) {
            return C2609.m8239();
        }
        return c11343.m28033();
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C2609 m16105() {
        C11343 c11343 = this.f17558;
        if (c11343 == null) {
            return C2609.m8239();
        }
        return c11343.m28043();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m16106(C2609 c2609) {
        m16063().m28049(c2609);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m16094(C2609 c2609) {
        m16063().m28045(c2609);
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2609 m16082() {
        C11343 c11343 = this.f17558;
        if (c11343 == null) {
            return C2609.m8239();
        }
        return c11343.m28039();
    }

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16095() {
        C11343 c11343 = this.f17558;
        return (c11343 == null || c11343.m28046()) ? false : true;
    }

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean m16107() {
        C11343 c11343 = this.f17558;
        return (c11343 == null || c11343.m28042()) ? false : true;
    }

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final void m16104() {
        m16063().m28037();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m16093(AbstractC5698 abstractC5698) {
        if (this.f17558 == null && abstractC5698.f17558 == null) {
            return;
        }
        m16063().m28035(abstractC5698.f17558);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m16086(C2609 c2609) {
        if (this.f17558 != null || c2609.m8249()) {
            m16063().m28041(c2609);
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m16074(C2609 c2609) {
        if (this.f17558 != null || c2609.m8249()) {
            if (this.f17558 == null) {
                this.f17558 = new C11343(this);
            }
            this.f17558.m28038(c2609);
        }
    }

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    private C11343 m16063() {
        if (this.f17558 == null) {
            this.f17558 = new C11343(this);
        }
        return this.f17558;
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11343 m16085() {
        return this.f17558;
    }

    /* renamed from: ۘ */
    public int mo953() {
        throw new AssertionError("Invalid pool entry");
    }

    /* renamed from: ۧ */
    public AbstractC5698 mo7177(AbstractC5698 abstractC5698) {
        throw new AssertionError();
    }

    /* renamed from: ֫ */
    public Object mo2899(InterfaceC9932 interfaceC9932, Locale locale) {
        return interfaceC9932.mo25039(this, locale);
    }

    public String toString() {
        return this.f17562.toString();
    }

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m16072() {
        EnumC1296 enumC1296;
        AbstractC10370 abstractC10370 = this.f17561.f17562;
        if (abstractC10370 == null) {
            return null;
        }
        if (!abstractC10370.isEmpty() || (this.f17561.mo16084() & 1048576) != 0 || (enumC1296 = this.f17561.f17559) == EnumC1296.f4579 || enumC1296 == EnumC1296.f4582) {
            return this.f17561;
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m16078(AbstractC4308 abstractC4308, C6319 c6319) {
        AbstractC4308 m17490;
        AbstractC10370 abstractC10370 = this.f17561.f17562;
        if (abstractC10370 == null || abstractC10370.isEmpty()) {
            return m16072();
        }
        if (this.f17561.f17560.m12913(EnumC9454.CLASS) && (m17490 = c6319.m17490(this.f17561, abstractC4308)) != null) {
            return m17490.f13890;
        }
        return this.f17561;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 mo16091(C6319 c6319) {
        if (this.f17565 == null) {
            this.f17565 = c6319.m17519(this.f17560);
        }
        return this.f17565;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m16096(C6319 c6319) {
        AbstractC4308 mo16091 = mo16091(c6319);
        AbstractC10370 abstractC10370 = this.f17562;
        if (abstractC10370 != abstractC10370.f31203.f37517.f18879 || !this.f17561.m16087()) {
            return mo16091;
        }
        return new C10658(mo16091.mo12933().m8246(c6319.m17519(this.f17561.f17560.mo4958())), mo16091.mo12923(), mo16091.mo12930(), mo16091.f13890);
    }

    /* renamed from: ۢ֫ */
    public boolean mo956() {
        return (this.f17563 & 131072) != 0;
    }

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final boolean m16102() {
        int i = C17692.f54153[mo952().ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? false : true;
    }

    /* renamed from: ֡֫ */
    public boolean mo15572() {
        if ((mo16084() & 8) != 0) {
            return true;
        }
        if ((this.f17561.mo16084() & 512) == 0 || this.f17559 == EnumC1296.f4571) {
            return false;
        }
        AbstractC10370 abstractC10370 = this.f17562;
        return abstractC10370 != abstractC10370.f31203.f37517.f18886;
    }

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16070() {
        return (mo16084() & 512) != 0;
    }

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16099() {
        return (this.f17563 & 7) == 1;
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16090() {
        return (mo16084() & 16384) != 0;
    }

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final boolean m16100() {
        return (this.f17563 & SkeinEngine.UbiTweak.T1_FIRST) != 0;
    }

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16077() {
        if (this.f17561.f17559.m4391(C15406.f47185)) {
            return true;
        }
        AbstractC5698 abstractC5698 = this.f17561;
        return abstractC5698.f17559 == EnumC1296.f4582 && abstractC5698.m16077();
    }

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16075() {
        AbstractC10370 abstractC10370 = this.f17562;
        return abstractC10370 == abstractC10370.f31203.f37517.f18879;
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC10370 mo16076() {
        return this.f17562;
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC10370 mo16083() {
        return mo16076();
    }

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16069() {
        return this.f17559 == EnumC1296.f4582 && this.f17560.mo4958().m12913(EnumC9454.CLASS);
    }

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16087() {
        return this.f17560.mo4958().m12913(EnumC9454.CLASS) && (mo16084() & 4194816) == 0;
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14163 m16071() {
        AbstractC5698 abstractC5698 = this;
        while (abstractC5698 != null && (!abstractC5698.f17559.m4391(C15406.f47189) || !abstractC5698.f17560.m12913(EnumC9454.CLASS))) {
            abstractC5698 = abstractC5698.f17561;
        }
        return (C14163) abstractC5698;
    }

    /* renamed from: ۠֫ */
    public C14163 mo955() {
        AbstractC5698 abstractC5698 = null;
        for (AbstractC5698 abstractC56982 = this; abstractC56982.f17559 != EnumC1296.f4579; abstractC56982 = abstractC56982.f17561) {
            abstractC5698 = abstractC56982;
        }
        return (C14163) abstractC5698;
    }

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final C7814 m16089() {
        AbstractC5698 abstractC5698 = this;
        while (abstractC5698.f17559 != EnumC1296.f4579) {
            abstractC5698 = abstractC5698.f17561;
        }
        return (C7814) abstractC5698;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo16080(AbstractC5698 abstractC5698, C6319 c6319) {
        throw new AssertionError("isSubClass " + this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m16067(AbstractC19810 abstractC19810, C6319 c6319) {
        AbstractC5698 abstractC5698 = this.f17561;
        if (abstractC5698 != abstractC19810) {
            if (abstractC19810.mo16080(abstractC5698, c6319) && mo10961((AbstractC5698) abstractC19810, c6319)) {
                AbstractC5698 m16062 = m16062((C14163) abstractC19810, c6319);
                C12171.m29641("the result of hiddenInInternal() can't be null", m16062 != null);
                if (m16062 != this) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC5698 m16062(C14163 c14163, C6319 c6319) {
        if (c14163 != this.f17561) {
            for (AbstractC5698 abstractC5698 : c14163.mo16064().m20476(this.f17562)) {
                EnumC1296 enumC1296 = abstractC5698.f17559;
                EnumC1296 enumC12962 = this.f17559;
                if (enumC1296 == enumC12962 && (enumC12962 != EnumC1296.f4571 || ((abstractC5698.mo16084() & 8) != 0 && c6319.m17532(abstractC5698.f17560, this.f17560, true)))) {
                    return abstractC5698;
                }
            }
            Iterator it = c6319.m17510(c14163.f17560).m8246(c6319.m17562(c14163.f17560)).iterator();
            AbstractC5698 abstractC56982 = null;
            while (it.hasNext()) {
                AbstractC4308 abstractC4308 = (AbstractC4308) it.next();
                if (abstractC4308 != null && abstractC4308.m12913(EnumC9454.CLASS)) {
                    AbstractC5698 m16062 = m16062((C14163) abstractC4308.f13890, c6319);
                    if (m16062 != this) {
                        if (m16062 != null) {
                            abstractC56982 = m16062;
                        }
                    }
                }
            }
            return abstractC56982;
        }
        return this;
    }

    /* renamed from: ֫ */
    public boolean mo10961(AbstractC5698 abstractC5698, C6319 c6319) {
        int i = (int) (this.f17563 & 7);
        if (i != 0) {
            return i != 2 ? i != 4 || (abstractC5698.mo16084() & 512) == 0 : this.f17561 == abstractC5698;
        }
        C7814 m16089 = m16089();
        AbstractC5698 abstractC56982 = abstractC5698;
        while (abstractC56982 != null && abstractC56982 != this.f17561) {
            while (abstractC56982.f17560.m12913(EnumC9454.TYPEVAR)) {
                abstractC56982 = abstractC56982.f17560.mo12939().f13890;
            }
            if (abstractC56982.f17560.mo12948()) {
                return true;
            }
            if ((abstractC56982.mo16084() & 16777216) == 0 && abstractC56982.m16089() != m16089) {
                return false;
            }
            abstractC56982 = c6319.m17562(abstractC56982.f17560).f13890;
        }
        return (abstractC5698.mo16084() & 512) == 0;
    }

    /* renamed from: ֫ */
    public AbstractC5698 mo10960(AbstractC4308 abstractC4308, C6319 c6319) {
        throw new AssertionError();
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public void mo16101() {
        InterfaceC6403 interfaceC6403 = this.f17564;
        InterfaceC6403 interfaceC64032 = InterfaceC6403.f19811;
        if (interfaceC6403 != interfaceC64032) {
            this.f17564 = interfaceC64032;
            interfaceC6403.mo7076(this);
        }
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m16103() {
        try {
            mo16101();
        } catch (C20515 e) {
            e.f66104.m6536(e);
        }
    }

    @Override // l.InterfaceC11970
    /* renamed from: ۜ */
    public AbstractC5698 mo7176() {
        return this.f17561;
    }

    /* renamed from: ֫ */
    public EnumC23258 mo952() {
        return EnumC23258.OTHER;
    }

    /* renamed from: ܳ */
    public Set mo10965() {
        m16103();
        return C19642.m45151(mo16084());
    }

    @Override // l.InterfaceC11970
    /* renamed from: ܽ֫, reason: merged with bridge method [inline-methods] */
    public AbstractC10370 mo960() {
        return this.f17562;
    }

    @Override // l.InterfaceC11970
    /* renamed from: ۤ, reason: merged with bridge method [inline-methods] */
    public C2609 mo7180() {
        m16103();
        return mo16068();
    }

    /* renamed from: ܺ */
    public List mo958() {
        return C2609.m8239();
    }

    @Override // l.InterfaceC14085, l.InterfaceC7052
    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final C2609 mo7178() {
        C18837 c18837 = new C18837();
        Iterator it = this.f17560.mo12938().iterator();
        while (it.hasNext()) {
            AbstractC4308 abstractC4308 = (AbstractC4308) it.next();
            C12171.m29642(abstractC4308.f13890.mo952() == EnumC23258.TYPE_PARAMETER);
            c18837.m43511((C4287) abstractC4308.f13890);
        }
        return c18837.m43517();
    }
}
