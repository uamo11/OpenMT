package l;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: 643O */
/* renamed from: l.֡֡֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0052 extends AbstractC19810 implements InterfaceC17635 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C14163 f911;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public AbstractC10370 f912;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public Map f913;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public InterfaceC2050 f914;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final EnumSet f915;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final EnumSet f916;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public C2609 f917;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public C7814 f918;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C2609 f919;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2609 f920;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2609 f921;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public HashSet f922;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC6403 f923;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC2050 f924;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C2609 f925;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC2050 f926;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public InterfaceC2050 f927;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C2609 f928;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C2609 f929;

    @Override // l.AbstractC5698, l.InterfaceC21496
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int mo953() {
        return 19;
    }

    @Override // l.AbstractC5698
    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final C14163 mo955() {
        return null;
    }

    @Override // l.AbstractC5698
    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo956() {
        return (this.f17563 & 18014398509481984L) != 0;
    }

    @Override // l.InterfaceC17635, l.InterfaceC21164
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 mo957() {
        return this.f17562;
    }

    public C0052(AbstractC10370 abstractC10370) {
        super(EnumC1296.f4568, 0L, abstractC10370, null, null);
        this.f928 = C2609.m8239();
        this.f923 = InterfaceC6403.f19811;
        this.f916 = EnumSet.noneOf(EnumC18398.class);
        this.f915 = EnumSet.noneOf(EnumC19104.class);
        C12171.m29637(abstractC10370);
        this.f17560 = new C16301(this, C20743.f66779);
    }

    @Override // l.AbstractC5698
    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 mo960() {
        return C12780.m31093(this.f17562);
    }

    @Override // l.AbstractC19810, l.AbstractC5698, l.InterfaceC11970
    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 mo960() {
        return C12780.m31093(this.f17562);
    }

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final boolean m954() {
        return this.f17562.isEmpty() && this.f17561 == null;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC23258 mo952() {
        return EnumC23258.MODULE;
    }

    @Override // l.AbstractC5698
    public String toString() {
        AbstractC10370 abstractC10370 = this.f17562;
        return abstractC10370 == null ? "<unknown>" : abstractC10370.isEmpty() ? "<unnamed>" : String.valueOf(this.f17562);
    }

    @Override // l.InterfaceC11970
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo951(AbstractC8463 abstractC8463, Object obj) {
        return abstractC8463.mo10386(this, obj);
    }

    @Override // l.AbstractC19810, l.AbstractC5698, l.InterfaceC11970
    /* renamed from: ܺ */
    public final C2609 mo958() {
        C2609 m8239 = C2609.m8239();
        Iterator it = this.f928.iterator();
        while (it.hasNext()) {
            AbstractC5698 abstractC5698 = (AbstractC5698) it.next();
            if (abstractC5698.mo16064().mo20481(new C18709(1))) {
                m8239 = m8239.m8246(abstractC5698);
            }
        }
        return m8239;
    }
}
