package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Locale;
import java.util.function.Predicate;

/* compiled from: 643O */
/* renamed from: l.᩶֡֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC19810 extends AbstractC5698 {
    /* renamed from: ᩶֫ */
    public boolean mo33814() {
        return false;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* renamed from: ۜ */
    public InterfaceC11970 mo7176() {
        return this.f17561;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* renamed from: ᩴ */
    public AbstractC10370 mo960() {
        return this.f17562;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* renamed from: ᩷ */
    public /* bridge */ /* synthetic */ C2609 mo7180() {
        return super.mo7180();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC10370 m45553(AbstractC10370 abstractC10370, AbstractC5698 abstractC5698) {
        if (abstractC5698 == null) {
            return abstractC10370;
        }
        EnumC1296 enumC1296 = abstractC5698.f17559;
        if (enumC1296 != EnumC1296.f4581) {
            if (enumC1296.m4391(C15406.f47185)) {
                return abstractC10370;
            }
            if (abstractC5698.f17559 == EnumC1296.f4582 && abstractC5698.f17560.m12913(EnumC9454.TYPEVAR)) {
                return abstractC10370;
            }
        }
        AbstractC10370 mo16076 = abstractC5698.mo16076();
        return (mo16076 == null || mo16076 == mo16076.f31203.f37517.f18867) ? abstractC10370 : mo16076.m26171('.', abstractC10370);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC10370 m45552(AbstractC10370 abstractC10370, AbstractC5698 abstractC5698) {
        if (abstractC5698 == null || abstractC5698.f17559.m4391(C15406.f47185)) {
            return abstractC10370;
        }
        EnumC1296 enumC1296 = abstractC5698.f17559;
        EnumC1296 enumC12962 = EnumC1296.f4582;
        if (enumC1296 == enumC12962 && abstractC5698.f17560.m12913(EnumC9454.TYPEVAR)) {
            return abstractC10370;
        }
        char c = abstractC5698.f17559 == enumC12962 ? '$' : '.';
        AbstractC10370 mo16083 = abstractC5698.mo16083();
        return (mo16083 == null || mo16083 == mo16083.f31203.f37517.f18867) ? abstractC10370 : mo16083.m26171(c, abstractC10370);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m45554(AbstractC19810 abstractC19810, C6319 c6319) {
        if (this == abstractC19810) {
            return false;
        }
        if (this.f17560.m12913(abstractC19810.f17560.mo3258())) {
            if (this.f17560.m12913(EnumC9454.CLASS)) {
                if (c6319.m17517(abstractC19810.f17560) >= c6319.m17517(this.f17560)) {
                    if (c6319.m17517(abstractC19810.f17560) != c6319.m17517(this.f17560)) {
                        return false;
                    }
                    AbstractC10370 mo16076 = abstractC19810.mo16076();
                    AbstractC10370 mo160762 = mo16076();
                    mo16076.getClass();
                    if (mo160762.mo2760() - mo16076.mo2760() >= 0) {
                        return false;
                    }
                }
                return true;
            }
            if (this.f17560.m12913(EnumC9454.TYPEVAR)) {
                return c6319.m17546(this.f17560, abstractC19810.f17560, true);
            }
        }
        return this.f17560.m12913(EnumC9454.TYPEVAR);
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* renamed from: ܺ */
    public C2609 mo958() {
        C2609 m8239 = C2609.m8239();
        if (this.f17559 == EnumC1296.f4582 && this.f17560.m12913(EnumC9454.TYPEVAR)) {
            return m8239;
        }
        m16103();
        for (AbstractC5698 abstractC5698 : mo16064().mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
            abstractC5698.m16103();
            if ((abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 && abstractC5698.f17561 == this && abstractC5698.f17559 != EnumC1296.f4581) {
                m8239 = m8239.m8246(abstractC5698);
            }
        }
        return m8239;
    }

    /* renamed from: ᩹֫ */
    public C21863 mo33816() {
        C12171.m29640("Only on ClassSymbol");
        throw null;
    }

    @Override // l.AbstractC5698
    /* renamed from: ֫ */
    public Object mo2899(InterfaceC9932 interfaceC9932, Locale locale) {
        return interfaceC9932.mo4022(this, (Object) locale);
    }
}
