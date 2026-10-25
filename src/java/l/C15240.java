package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.simpleframework.xml.strategy.Name;

/* compiled from: 542M */
/* renamed from: l.ܶ۬֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15240 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final C4314 f46754 = new C4314();

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC4203 f46755 = new C9598();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C4824 f46756;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C22364 f46757;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f46758;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C22406 f46760;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11223 f46761;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4725 f46762;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public char f46764;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C18230 f46765;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f46766;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C3581 f46767;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C5931 f46768;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC10370[] f46769;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20661 f46770;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f46771;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17214 f46772;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C4725 f46773;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC16280 f46774;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C4725 f46775;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Set f46776;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C6136 f46777;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13809 f46778;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f46779;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6735 f46782;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC5973 f46784;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4725 f46785;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23168 f46787;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C6319 f46788;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12399 f46789;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f46780 = new HashMap();

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f46763 = new HashMap();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC3953 f46781 = new C23708(this);

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC12669 f46783 = new C8892();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1386 f46786 = new C1386();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C4464 f46759 = new C4464(3);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m36050(long j) {
        short s = (short) (j & 7);
        if (s == 0) {
            return 2;
        }
        if (s != 2) {
            return s != 4 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ boolean m36077(C15240 c15240, AbstractC5698 abstractC5698) {
        c15240.getClass();
        return m36074(abstractC5698);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m36079(C15240 c15240, C16384 c16384) {
        c15240.getClass();
        return C22311.stream(c15240.m36185(c16384.f26338.f13890)).anyMatch(new C12132(0, c15240));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14163 m36113(C0052 c0052, AbstractC10370 abstractC10370) {
        return (C14163) this.f46780.get(new C23069(c0052, abstractC10370));
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x031f, code lost:
    
        if (r7 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0322, code lost:
    
        if (r7 != r23) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m36138(final l.AbstractC5144 r21, final l.C3581 r22, l.C3581 r23, l.C14163 r24) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15240.m36138(l.ۚۚ۠, l.ۘ֡֨, l.ۘ֡֨, l.ܳ֡֨):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15240 m36054(C2903 c2903) {
        C15240 c15240 = (C15240) c2903.m8838(f46754);
        return c15240 == null ? new C15240(c2903) : c15240;
    }

    public C15240(C2903 c2903) {
        c2903.m8841(f46754, this);
        this.f46777 = C6136.m17057(c2903);
        C22364 m50099 = C22364.m50099(c2903);
        this.f46757 = m50099;
        this.f46760 = C22406.m50289(c2903);
        this.f46770 = C20661.m47250(c2903);
        this.f46778 = C13809.m33121(c2903);
        this.f46789 = C12399.m30567(c2903);
        this.f46782 = C6735.m18336(c2903);
        this.f46788 = C6319.m17456(c2903);
        this.f46772 = C17214.m40507(c2903);
        this.f46768 = C5931.m16615(c2903);
        C11781 m28823 = C11781.m28823(c2903);
        this.f46756 = C4824.m14050(c2903);
        this.f46761 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        EnumC16280 m38301 = EnumC16280.m38301(c2903);
        this.f46774 = m38301;
        EnumC10892.m27201(c2903);
        this.f46766 = m28823.m28831("warnOnAccessToMembers");
        this.f46764 = EnumC10892.m27201(c2903).m27204();
        this.f46784 = EnumC5973.m16741(c2903);
        this.f46787 = C23168.m51341(c2903);
        C4824 c4824 = this.f46756;
        EnumC20347 enumC20347 = EnumC20347.DEPRECATION;
        boolean m14055 = c4824.m14055(enumC20347);
        C4824 c48242 = this.f46756;
        EnumC20347 enumC203472 = EnumC20347.REMOVAL;
        boolean m140552 = c48242.m14055(enumC203472);
        C4824 c48243 = this.f46756;
        EnumC20347 enumC203473 = EnumC20347.UNCHECKED;
        boolean m140553 = c48243.m14055(enumC203473);
        this.f46785 = new C4725(m50099, null, m14055, "deprecated", enumC20347);
        this.f46762 = new C4725(m50099, null, m140552, "removal", enumC203472);
        this.f46775 = new C4725(m50099, null, m140553, "unchecked", enumC203473);
        this.f46773 = new C4725(m50099, null, false, "sunapi", null);
        this.f46765 = C18230.m42469(c2903);
        this.f46758 = EnumC10637.f32009.m26686(m38301);
        this.f46771 = EnumC10637.f32007.m26686(m38301);
        this.f46779 = EnumC10637.f31988.m26686(m38301);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36133(final AbstractC4308 abstractC4308, final AbstractC5698 abstractC5698, final C1755 c1755, final C2609 c2609, final C2609 c26092, final boolean z, C0384 c0384) {
        char c;
        C1755 c17552;
        if (abstractC4308.m12928(c0384.f1817)) {
            c0384.m1864(C2609.of((Object) abstractC4308), new InterfaceC3748() { // from class: l.ܽ۬֨
                @Override // l.InterfaceC3748
                /* renamed from: ֫ */
                public final void mo4673(C0384 c03842) {
                    boolean z2 = z;
                    C15240.this.m36133(c03842.m1859(abstractC4308), abstractC5698, c1755, c2609, c26092, z2, c03842);
                }
            });
            return;
        }
        C2609 mo12933 = abstractC4308.mo12933();
        C2609 mo129332 = abstractC5698.f17560.mo12933();
        if (mo129332.m8245() != mo12933.m8245()) {
            mo129332 = mo12933;
        }
        AbstractC4308 abstractC43082 = z ? (AbstractC4308) mo12933.last() : null;
        AbstractC10370 abstractC10370 = abstractC5698.f17562;
        AbstractC10370 abstractC103702 = this.f46777.f18879;
        C20661 c20661 = this.f46770;
        if (abstractC10370 == abstractC103702 && abstractC5698.f17561 == c20661.f66527) {
            mo12933 = mo12933.f8241.f8241;
            mo129332 = mo129332.f8241.f8241;
        }
        if ((abstractC5698.mo16084() & 144115188075855872L) != 0) {
            mo12933 = mo12933.f8241;
            mo129332 = mo129332.f8241;
        }
        C6319 c6319 = this.f46788;
        if (c2609 != null) {
            C2609 c26093 = c2609;
            C2609 c26094 = mo12933;
            C2609 c26095 = mo129332;
            while (c26094.f8240 != abstractC43082) {
                AbstractC5144 abstractC5144 = (AbstractC5144) c26093.f8240;
                abstractC5144.getClass();
                m36058(abstractC5144.f16086, (AbstractC4308) c26094.f8240, new C19476(this, abstractC5144, "unchecked.assign", abstractC5144.f16086, (AbstractC4308) c26095.f8240));
                c26093 = c26093.f8241;
                c26094 = c26094.f8241;
                c26095 = c26095.f8241;
            }
            c = 0;
            if (z) {
                AbstractC4308 m17515 = c6319.m17515(abstractC43082);
                for (C2609 c26096 = c26093; c26096.f8241 != null; c26096 = c26096.f8241) {
                    AbstractC5144 abstractC51442 = (AbstractC5144) c26096.f8240;
                    abstractC51442.getClass();
                    m36058(abstractC51442.f16086, m17515, new C19476(this, abstractC51442, "unchecked.assign", abstractC51442.f16086, m17515));
                }
            } else if ((abstractC5698.mo16084() & 70385924046848L) == 17179869184L) {
                AbstractC4308 abstractC43083 = (AbstractC4308) abstractC4308.mo12933().last();
                AbstractC4308 abstractC43084 = (AbstractC4308) c26092.last();
                if (c6319.m17551(abstractC43084, c6319.m17515(abstractC43083), c6319.f19598) && !c6319.m17550(c6319.m17519(abstractC43083), c6319.m17519(abstractC43084))) {
                    AbstractC12612 abstractC12612 = (AbstractC12612) c2609.last();
                    abstractC12612.getClass();
                    AbstractC4308 m175152 = c6319.m17515(abstractC43083);
                    C11076 c11076 = C14001.f42334;
                    this.f46757.m7285(abstractC12612, new C11076("compiler", "inexact.non-varargs.call", m175152, abstractC43083));
                }
            }
        } else {
            c = 0;
        }
        if (z) {
            AbstractC4308 abstractC43085 = (AbstractC4308) abstractC4308.mo12933().last();
            if (c6319.m17477(abstractC43085) || (abstractC5698.mo7048().m16065(c20661.f66504.f13890) != null && m36086(abstractC5698))) {
                c17552 = c1755;
            } else {
                c17552 = c1755;
                AbstractC5144 abstractC51443 = c17552.f6074;
                abstractC51443.getClass();
                C11076 c110762 = C14001.f42334;
                Object[] objArr = new Object[1];
                objArr[c] = abstractC43085;
                m36178(abstractC51443, new C11076("compiler", "unchecked.generic.array.creation", objArr));
            }
            C7260.m19444(c6319.m17515(abstractC43085), c17552.f6074);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4824 m36112(C4824 c4824) {
        C4824 c48242 = this.f46756;
        this.f46756 = c4824;
        return c48242;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3581 m36103(C3581 c3581) {
        C3581 c35812 = this.f46767;
        this.f46767 = c3581;
        return c35812;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36130(InterfaceC3109 interfaceC3109, C11076 c11076) {
        if (this.f46756.m14056(EnumC20347.PREVIEW)) {
            return;
        }
        this.f46787.m51345(interfaceC3109, c11076);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36178(InterfaceC3109 interfaceC3109, C11076 c11076) {
        if (this.f46756.m14056(EnumC20347.UNCHECKED)) {
            return;
        }
        this.f46775.m13840(interfaceC3109, c11076);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36191(InterfaceC3109 interfaceC3109, C11076 c11076) {
        C4824 c4824 = this.f46756;
        EnumC20347 enumC20347 = EnumC20347.VARARGS;
        if (c4824.m14055(enumC20347)) {
            this.f46757.m7286(enumC20347, interfaceC3109, c11076);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36146(C6262 c6262, C11076 c11076) {
        C4824 c4824 = this.f46756;
        EnumC20347 enumC20347 = EnumC20347.STATIC;
        if (c4824.m14055(enumC20347)) {
            this.f46757.m7286(enumC20347, c6262, c11076);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36063(C15240 c15240, InterfaceC3109 interfaceC3109) {
        C4824 c4824 = c15240.f46756;
        EnumC20347 enumC20347 = EnumC20347.DIVZERO;
        if (c4824.m14055(enumC20347)) {
            c15240.f46757.m7286(enumC20347, interfaceC3109, C14001.f42348);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36175() {
        this.f46785.m13839();
        this.f46762.m13839();
        this.f46775.m13839();
        this.f46773.m13839();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36110(InterfaceC3109 interfaceC3109, C20515 c20515) {
        EnumC20043 enumC20043 = EnumC20043.NON_DEFERRABLE;
        AbstractC5698 abstractC5698 = c20515.f66102;
        C16719 m46989 = c20515.m46989();
        C12281 c12281 = C6241.f19132;
        this.f46757.m7280(enumC20043, interfaceC3109, new C12281("compiler", "cant.access", abstractC5698, m46989));
        return this.f46770.f66457;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36109(InterfaceC3109 interfaceC3109, C16719 c16719, Object obj) {
        boolean z = obj instanceof AbstractC4308;
        C20661 c20661 = this.f46770;
        C22364 c22364 = this.f46757;
        if (z && ((AbstractC4308) obj).m12913(EnumC9454.VOID)) {
            c22364.m7273(interfaceC3109, C6241.f19205);
            return c20661.f66457;
        }
        C12281 c12281 = C6241.f19132;
        c22364.m7273(interfaceC3109, new C12281("compiler", "type.found.req", obj, c16719));
        return this.f46788.m17535(z ? (AbstractC4308) obj : c20661.f66457);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36177(InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698) {
        C12281 c12281 = C6241.f19132;
        this.f46757.m7273(interfaceC3109, new C12281("compiler", "cant.ref.before.ctor.called", abstractC5698));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36126(InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698) {
        if (abstractC5698.f17560.mo12948()) {
            return;
        }
        AbstractC5698 m16072 = abstractC5698.m16072();
        EnumC1296 enumC1296 = m16072.f17559;
        EnumC1296 enumC12962 = EnumC1296.f4571;
        C22364 c22364 = this.f46757;
        if (enumC1296 == enumC12962 && ((C3581) m16072).m10966()) {
            EnumC8352 m49076 = C21758.m49076(abstractC5698);
            EnumC8352 m490762 = C21758.m49076(abstractC5698.m16072());
            EnumC8352 m490763 = C21758.m49076(abstractC5698.m16072().m16071());
            C14163 m16071 = abstractC5698.m16072().m16071();
            C12281 c12281 = C6241.f19132;
            c22364.m7273(interfaceC3109, new C12281("compiler", "already.defined.in.clinit", m49076, abstractC5698, m490762, m490763, m16071));
            return;
        }
        if (m16072.f17559 == enumC12962) {
            long j = abstractC5698.f17561.f17563;
            if ((68719476736L & j) != 0 && (j & 2305843009213693952L) != 0) {
                return;
            }
        }
        EnumC8352 m490764 = C21758.m49076(abstractC5698);
        EnumC8352 m490765 = C21758.m49076(abstractC5698.m16072());
        AbstractC5698 m160722 = abstractC5698.m16072();
        C12281 c122812 = C6241.f19132;
        c22364.m7273(interfaceC3109, new C12281("compiler", "already.defined", m490764, abstractC5698, m490765, m160722));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36116(final Supplier supplier, AbstractC5698 abstractC5698, final AbstractC5698 abstractC56982) {
        if ((abstractC56982.f17563 & 36028797018963968L) == 0 && (!abstractC56982.mo956() || abstractC5698.mo956())) {
            return;
        }
        if ((abstractC56982.mo955() != abstractC5698.mo955() || abstractC56982.mo955() == null) && abstractC56982.f17559 != EnumC1296.f4579) {
            this.f46765.m42473(new InterfaceC16818() { // from class: l.ۙۗ֨
                @Override // l.InterfaceC16818
                /* renamed from: ֫ */
                public final void mo6082() {
                    C15240.m36062(C15240.this, supplier, abstractC56982);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36131(InterfaceC3109 interfaceC3109, C12048 c12048, AbstractC14016 abstractC14016) {
        AbstractC5698 abstractC5698;
        AbstractC5698 abstractC56982;
        Iterator it = abstractC14016.m20476(c12048.f17562).iterator();
        while (it.hasNext() && (abstractC56982 = (abstractC5698 = (AbstractC5698) it.next()).f17561) == c12048.f17561) {
            if (abstractC5698.f17559 == EnumC1296.f4567 && abstractC56982.f17559.m4391(C15406.f47185) && c12048.f17562 != this.f46777.f18855) {
                m36126(interfaceC3109, abstractC5698);
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36143(C5557 c5557, C14163 c14163, AbstractC14016 abstractC14016) {
        for (AbstractC5698 abstractC5698 : abstractC14016.m20476(c14163.f17562)) {
            if (abstractC5698.f17561 != c14163.f17561) {
                return;
            }
            if (abstractC5698.f17559 == EnumC1296.f4582 && !abstractC5698.f17560.m12913(EnumC9454.TYPEVAR) && abstractC5698.f17561.f17559.m4391(C15406.f47185) && c14163.f17562 != this.f46777.f18855) {
                m36126(c5557, abstractC5698);
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36165(C5557 c5557, AbstractC10370 abstractC10370, AbstractC14016 abstractC14016) {
        AbstractC10370 abstractC103702;
        Iterator it = abstractC14016.mo20477(abstractC10370, null, EnumC1317.NON_RECURSIVE).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C6136 c6136 = this.f46777;
            if (hasNext) {
                AbstractC5698 abstractC5698 = (AbstractC5698) it.next();
                if (abstractC5698.f17559 == EnumC1296.f4582 && abstractC5698.f17562 != c6136.f18855) {
                    m36126(c5557, abstractC5698);
                    return false;
                }
            } else {
                for (AbstractC5698 abstractC56982 = abstractC14016.f23673; abstractC56982 != null; abstractC56982 = abstractC56982.f17561) {
                    if (abstractC56982.f17559 == EnumC1296.f4582 && (abstractC103702 = abstractC56982.f17562) == abstractC10370 && abstractC103702 != c6136.f18855) {
                        m36126(c5557, abstractC56982);
                        return true;
                    }
                }
                return true;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m36188(C14163 c14163) {
        AbstractC10370 abstractC10370 = c14163.f17561.m16071().f42771;
        String abstractC103702 = abstractC10370.toString();
        C23069 c23069 = new C23069(abstractC10370, c14163.f17562);
        HashMap hashMap = this.f46763;
        Integer num = (Integer) hashMap.get(c23069);
        int intValue = num == null ? 1 : num.intValue();
        while (true) {
            StringBuilder m15339 = C5368.m15339(abstractC103702);
            m15339.append(this.f46764);
            m15339.append(intValue);
            m15339.append((Object) c14163.f17562);
            AbstractC10370 m30652 = this.f46777.f18880.m30652(m15339.toString());
            if (m36113(c14163.m16089().f24147, m30652) == null) {
                hashMap.put(c23069, Integer.valueOf(intValue + 1));
                return m30652;
            }
            intValue++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36156(C14163 c14163) {
        AbstractC5698 abstractC5698 = c14163.f17561;
        if (abstractC5698 == null || abstractC5698.f17559 == EnumC1296.f4577) {
            return;
        }
        this.f46763.remove(new C23069(abstractC5698.m16071().f42771, c14163.f17562));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36115() {
        this.f46780.clear();
        this.f46763.clear();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36199(C14163 c14163) {
        this.f46780.put(new C23069(c14163.m16089().f24147, c14163.f42771), c14163);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14163 m36174(C14163 c14163) {
        return (C14163) this.f46780.get(new C23069(c14163.m16089().f24147, c14163.f42771));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m36196(C14163 c14163) {
        this.f46780.remove(new C23069(c14163.m16089().f24147, c14163.f42771));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36106(final InterfaceC3109 interfaceC3109, final AbstractC4308 abstractC4308, final AbstractC4308 abstractC43082, final InterfaceC3953 interfaceC3953) {
        C0384 mo3857 = interfaceC3953.mo3857();
        if (abstractC43082.m12928(mo3857.f1817) || abstractC4308.m12928(mo3857.f1817)) {
            mo3857.m1864(C2609.of((Object) abstractC43082, (Object) abstractC4308), new InterfaceC3748() { // from class: l.ܳ۬֨
                @Override // l.InterfaceC3748
                /* renamed from: ֫ */
                public final void mo4673(C0384 c0384) {
                    C15240.this.m36106(interfaceC3109, c0384.m1859(abstractC4308), c0384.m1859(abstractC43082), interfaceC3953);
                }
            });
        }
        if (abstractC43082.m12913(EnumC9454.ERROR)) {
            return abstractC43082;
        }
        if (abstractC43082.m12913(EnumC9454.NONE) || interfaceC3953.mo3859(abstractC4308, abstractC43082, interfaceC3953.mo3858(interfaceC3109, abstractC4308, abstractC43082))) {
            return abstractC4308;
        }
        boolean mo12914 = abstractC4308.mo12914();
        C6319 c6319 = this.f46788;
        C5931 c5931 = this.f46768;
        if (mo12914 && abstractC43082.mo12914()) {
            C11576 c11576 = C11886.f35440;
            interfaceC3953.mo1084(interfaceC3109, c5931.m16617(new C11576("compiler", "possible.loss.of.precision", abstractC4308, abstractC43082)));
            return c6319.m17535(abstractC4308);
        }
        interfaceC3953.mo1084(interfaceC3109, c5931.m16617(C11886.m29011(abstractC4308, abstractC43082)));
        return c6319.m17535(abstractC4308);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36160(final C17844 c17844) {
        AbstractC5698 m19472;
        if (c17844.f16086.mo12948()) {
            return;
        }
        if (!this.f46788.m17550(c17844.f54512.f16086, c17844.f54511.f16086) || C7260.m19460(c17844.f54511)) {
            return;
        }
        AbstractC12612 m19458 = C7260.m19458(c17844.f54512);
        if (!m19458.m14709(EnumC18550.f57534) || (m19472 = C7260.m19472(((C15580) m19458).f48011)) == null || m19472.f17559 != EnumC1296.f4571 || (m19472.mo16084() & 137438953472L) == 0) {
            this.f46765.m42473(new InterfaceC16818() { // from class: l.ܶۗ֨
                @Override // l.InterfaceC16818
                /* renamed from: ֫ */
                public final void mo6082() {
                    C15240.m36073(C15240.this, c17844);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36073(C15240 c15240, C17844 c17844) {
        C4824 c4824 = c15240.f46756;
        EnumC20347 enumC20347 = EnumC20347.CAST;
        if (c4824.m14055(enumC20347)) {
            C22364 c22364 = c15240.f46757;
            AbstractC4308 abstractC4308 = c17844.f54511.f16086;
            C11076 c11076 = C14001.f42334;
            c22364.m7286(enumC20347, c17844, new C11076("compiler", "redundant.cast", abstractC4308));
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36202(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        if (!abstractC4308.m12913(EnumC9454.VOID)) {
            return abstractC4308;
        }
        this.f46757.m7273(interfaceC3109, C6241.f19153);
        return this.f46788.m17535(abstractC4308);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36104(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        if (abstractC4308.m12913(EnumC9454.CLASS) || abstractC4308.m12913(EnumC9454.ARRAY) || abstractC4308.m12913(EnumC9454.ERROR)) {
            return abstractC4308;
        }
        C11576 c11576 = C11886.f35496;
        C5931 c5931 = this.f46768;
        C16719 m16617 = c5931.m16617(c11576);
        boolean m12913 = abstractC4308.m12913(EnumC9454.TYPEVAR);
        Object obj = abstractC4308;
        if (m12913) {
            obj = c5931.m16617(new C11576("compiler", "type.parameter", abstractC4308));
        }
        return m36109(interfaceC3109, m16617, obj);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36173(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        if (abstractC4308.m12913(EnumC9454.CLASS) || abstractC4308.m12913(EnumC9454.ERROR)) {
            return abstractC4308;
        }
        C11576 c11576 = C11886.f35490;
        C5931 c5931 = this.f46768;
        C16719 m16617 = c5931.m16617(c11576);
        boolean m12913 = abstractC4308.m12913(EnumC9454.TYPEVAR);
        Object obj = abstractC4308;
        if (m12913) {
            obj = c5931.m16617(new C11576("compiler", "type.parameter", abstractC4308));
        }
        return m36109(interfaceC3109, m16617, obj);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36198(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        AbstractC4308 m36104 = m36104(interfaceC3109, abstractC4308);
        boolean m12913 = m36104.m12913(EnumC9454.CLASS);
        C22364 c22364 = this.f46757;
        C6319 c6319 = this.f46788;
        if (!m12913) {
            if (!m36104.m12913(EnumC9454.ARRAY) || c6319.m17477(((C5138) m36104).f16077)) {
                return m36104;
            }
            c22364.m7273(interfaceC3109, C6241.f19293);
            return c6319.m17535(m36104);
        }
        if ((m36104.f13890.mo16084() & 1536) != 0) {
            AbstractC19810 abstractC19810 = m36104.f13890;
            C12281 c12281 = C6241.f19132;
            c22364.m7273(interfaceC3109, new C12281("compiler", "abstract.cant.be.instantiated", abstractC19810));
            return c6319.m17535(m36104);
        }
        if ((m36104.f13890.mo16084() & 16384) != 0) {
            c22364.m7273(interfaceC3109, C6241.f19230);
            return c6319.m17535(m36104);
        }
        return m36108(interfaceC3109, m36104, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36108(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308, boolean z) {
        AbstractC4308 m36173 = m36173(interfaceC3109, abstractC4308);
        if (z && m36173.mo12917()) {
            for (C2609 mo12938 = m36173.mo12938(); mo12938.m8249(); mo12938 = mo12938.f8241) {
                if (((AbstractC4308) mo12938.f8240).m12913(EnumC9454.WILDCARD)) {
                    return m36109(interfaceC3109, this.f46768.m16617(C11886.f35493), mo12938.f8240);
                }
            }
        }
        return m36173;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36201(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        return abstractC4308.mo12908() ? abstractC4308 : m36109(interfaceC3109, this.f46768.m16617(C11886.f35483), abstractC4308);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36123(C2609 c2609, C2609 c26092) {
        while (c26092.m8249()) {
            AbstractC12612 abstractC12612 = (AbstractC12612) c2609.f8240;
            abstractC12612.getClass();
            c26092.f8240 = m36201(abstractC12612, (AbstractC4308) c26092.f8240);
            c2609 = c2609.f8241;
            c26092 = c26092.f8241;
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36169(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        return (abstractC4308.mo12908() || abstractC4308.m12913(EnumC9454.BOT)) ? abstractC4308 : m36109(interfaceC3109, this.f46768.m16617(C11886.f35483), abstractC4308);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36164(AbstractC5144 abstractC5144, long j, long j2, long j3) {
        long j4 = j2 & j;
        if (j4 != 0) {
            long j5 = j & j3;
            if (j5 != 0) {
                long j6 = 1;
                long j7 = 1;
                while ((j7 & j4) == 0) {
                    j7 <<= 1;
                }
                EnumSet m45150 = C19642.m45150(j7);
                while ((j6 & j5) == 0) {
                    j6 <<= 1;
                }
                EnumSet m451502 = C19642.m45150(j6);
                C12281 c12281 = C6241.f19132;
                this.f46757.m7273(abstractC5144, new C12281("compiler", "illegal.combination.of.modifiers", m45150, m451502));
                return false;
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36111(C19110 c19110, AbstractC4308 abstractC4308) {
        if (!C7260.m19449(c19110) || abstractC4308.mo12948()) {
            AbstractC12612 abstractC12612 = c19110.f60196;
            abstractC12612.getClass();
            return m36108((InterfaceC3109) abstractC12612, abstractC4308, true);
        }
        C5557 c5557 = c19110.f60195;
        C22364 c22364 = this.f46757;
        if (c5557 != null) {
            EnumC10637 enumC10637 = EnumC10637.f32012;
            EnumC16280 enumC16280 = this.f46774;
            if (!enumC10637.m26686(enumC16280)) {
                EnumC20043 enumC20043 = EnumC20043.SOURCE_LEVEL;
                AbstractC12612 abstractC126122 = c19110.f60196;
                abstractC126122.getClass();
                C11576 m26688 = enumC10637.m26688(enumC16280.f50071);
                C12281 c12281 = C6241.f19132;
                c22364.m7280(enumC20043, abstractC126122, new C12281("compiler", "cant.apply.diamond.1", abstractC4308, m26688));
            }
        }
        boolean isEmpty = abstractC4308.f13890.f17560.mo12938().isEmpty();
        C6319 c6319 = this.f46788;
        if (isEmpty) {
            AbstractC12612 abstractC126123 = c19110.f60196;
            abstractC126123.getClass();
            C11576 c11576 = C11886.f35440;
            C11576 c115762 = new C11576("compiler", "diamond.non.generic", abstractC4308);
            C12281 c122812 = C6241.f19132;
            c22364.m7273(abstractC126123, new C12281("compiler", "cant.apply.diamond.1", abstractC4308, c115762));
            return c6319.m17535(abstractC4308);
        }
        C2609 c2609 = c19110.f60198;
        if (c2609 == null || !c2609.m8249()) {
            return abstractC4308;
        }
        AbstractC12612 abstractC126124 = c19110.f60196;
        abstractC126124.getClass();
        C11576 c115763 = C11886.f35440;
        C11576 c115764 = new C11576("compiler", "diamond.and.explicit.params", abstractC4308);
        C12281 c122813 = C6241.f19132;
        c22364.m7273(abstractC126124, new C12281("compiler", "cant.apply.diamond.1", abstractC4308, c115764));
        return c6319.m17535(abstractC4308);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m36092(AbstractC4308 abstractC4308) {
        AbstractC4203 abstractC4203 = f46755;
        abstractC4203.getClass();
        return ((Boolean) abstractC4308.mo2962(abstractC4203, (Object) null)).booleanValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36147(C8526 c8526) {
        C16719 m16617;
        C3581 c3581 = c8526.f26045;
        C20661 c20661 = this.f46770;
        AbstractC4308 abstractC4308 = c20661.f66504;
        AbstractC4308 abstractC43082 = c20661.f66504;
        boolean z = c3581.m16065((AbstractC5698) abstractC4308.f13890) != null;
        boolean mo10957 = c3581.mo10957();
        C6319 c6319 = this.f46788;
        AbstractC4308 m17515 = mo10957 ? c6319.m17515(((C9378) c8526.f26048.last()).f16086) : null;
        C5931 c5931 = this.f46768;
        if (z && !m36086(c3581)) {
            C22364 c22364 = this.f46757;
            if (m17515 != null) {
                if (EnumC10637.f32006.m26686(this.f46774)) {
                    m16617 = c5931.m16617(new C11576("compiler", "varargs.trustme.on.virtual.varargs", c3581));
                } else {
                    m16617 = c5931.m16617(new C11576("compiler", "varargs.trustme.on.virtual.varargs.final.only", c3581));
                }
                AbstractC19810 abstractC19810 = abstractC43082.f13890;
                C12281 c12281 = C6241.f19132;
                c22364.m7273(c8526, new C12281("compiler", "varargs.invalid.trustme.anno", abstractC19810, m16617));
                return;
            }
            AbstractC19810 abstractC198102 = abstractC43082.f13890;
            C11576 c11576 = C11886.f35440;
            C11576 c115762 = new C11576("compiler", "varargs.trustme.on.non.varargs.meth", c3581);
            C12281 c122812 = C6241.f19132;
            c22364.m7273(c8526, new C12281("compiler", "varargs.invalid.trustme.anno", abstractC198102, c115762));
            return;
        }
        if (z && m17515 != null && c6319.m17477(m17515)) {
            AbstractC19810 abstractC198103 = abstractC43082.f13890;
            C11576 c115763 = C11886.f35440;
            C16719 m166172 = c5931.m16617(new C11576("compiler", "varargs.trustme.on.reifiable.varargs", m17515));
            C11076 c11076 = C14001.f42334;
            m36191(c8526, new C11076("compiler", "varargs.redundant.trustme.anno", abstractC198103, m166172));
            return;
        }
        if (z || m17515 == null || c6319.m17477(m17515)) {
            return;
        }
        InterfaceC3109 interfaceC3109 = (C9378) c8526.f26048.f8240;
        interfaceC3109.getClass();
        C11076 c110762 = C14001.f42334;
        m36178(interfaceC3109, new C11076("compiler", "unchecked.varargs.non.reifiable.type", m17515));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m36086(AbstractC5698 abstractC5698) {
        if ((abstractC5698.mo16084() & 17179869184L) != 0) {
            if (abstractC5698.m16075()) {
                return true;
            }
            if ((abstractC5698.mo16084() & ((EnumC10637.f32006.m26686(this.f46774) ? 2 : 0) | 24)) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36107(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308, AbstractC10370 abstractC10370) {
        boolean m12913 = abstractC4308.m12913(EnumC9454.BOT);
        C22364 c22364 = this.f46757;
        C6319 c6319 = this.f46788;
        if (m12913) {
            c22364.m7273(interfaceC3109, C6241.m17185(abstractC10370, C11886.f35437));
            return c6319.m17535(abstractC4308);
        }
        if (abstractC4308.m12913(EnumC9454.VOID)) {
            c22364.m7273(interfaceC3109, C6241.m17185(abstractC10370, C11886.f35452));
            return c6319.m17535(abstractC4308);
        }
        return c6319.m17541(abstractC4308, c6319.m17540(abstractC4308)).mo2973();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36058(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082, C1386 c1386) {
        C6319 c6319 = this.f46788;
        if (!c6319.m17556(abstractC4308, abstractC43082, c1386) && abstractC43082.mo5146() && c6319.m17546(abstractC4308, c6319.m17562(abstractC43082), true)) {
            for (C2609 m17510 = c6319.m17510(abstractC43082); m17510.m8249() && c6319.m17551(abstractC4308, (AbstractC4308) m17510.f8240, c1386); m17510 = m17510.f8241) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36163(AbstractC4308 abstractC4308) {
        return m36096(abstractC4308) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 m36096(AbstractC4308 abstractC4308) {
        C6319 c6319;
        AbstractC12669 abstractC12669;
        C2609 mo12934 = abstractC4308.f13890.f17560.mo12934();
        C2609 mo129342 = abstractC4308.mo12934();
        C2609 mo12938 = abstractC4308.mo12938();
        C2609 mo129382 = abstractC4308.f13890.f17560.mo12938();
        C18837 c18837 = new C18837();
        while (true) {
            boolean m8249 = mo12938.m8249();
            c6319 = this.f46788;
            if (!m8249 || !mo129382.m8249()) {
                break;
            }
            c18837.m43511(c6319.m17488(((AbstractC4308) mo129382.f8240).mo12939(), mo12934, mo129342));
            mo12938 = mo12938.f8241;
            mo129382 = mo129382.f8241;
        }
        C2609 mo129383 = abstractC4308.mo12938();
        for (C2609 m17521 = c6319.m17521(mo12934, mo12934, c6319.m17523(abstractC4308).mo12934()); mo129383.m8249() && m17521.m8249(); m17521 = m17521.f8241) {
            ((AbstractC4308) mo129383.f8240).mo12937((C8541) m17521.f8240);
            mo129383 = mo129383.f8241;
        }
        C2609 mo129384 = abstractC4308.mo12938();
        C2609 m43517 = c18837.m43517();
        while (true) {
            boolean m82492 = mo129384.m8249();
            abstractC12669 = this.f46783;
            if (!m82492 || !m43517.m8249()) {
                break;
            }
            AbstractC4308 abstractC43082 = (AbstractC4308) mo129384.f8240;
            if (!((Boolean) abstractC12669.m30946(abstractC43082)).booleanValue() && !((AbstractC4308) m43517.f8240).mo12948()) {
                AbstractC4308 abstractC43083 = (AbstractC4308) m43517.f8240;
                boolean z = true;
                if (!abstractC43082.mo12944()) {
                    if (abstractC43082.m12913(EnumC9454.WILDCARD)) {
                        if (abstractC43082.mo12922()) {
                            z = c6319.m17545(abstractC43083, c6319.m17511(abstractC43082), c6319.f19598);
                        } else if (abstractC43082.mo12924()) {
                            z = true ^ c6319.m17566(c6319.m17513(abstractC43082), abstractC43083);
                        }
                    } else {
                        z = c6319.m17546(C6319.m17473(abstractC43082), abstractC43083, true);
                    }
                }
                if (!z) {
                    return (AbstractC4308) mo129384.f8240;
                }
            }
            mo129384 = mo129384.f8241;
            m43517 = m43517.f8241;
        }
        C2609 mo129385 = abstractC4308.mo12938();
        C2609 m435172 = c18837.m43517();
        Iterator it = c6319.m17523(abstractC4308).mo12938().iterator();
        while (it.hasNext()) {
            AbstractC4308 abstractC43084 = (AbstractC4308) it.next();
            if (abstractC43084.m12913(EnumC9454.TYPEVAR) && abstractC43084.mo12939().mo12948() && !((AbstractC4308) m435172.f8240).mo12948() && !((Boolean) abstractC12669.m30946((AbstractC4308) mo129385.f8240)).booleanValue()) {
                return (AbstractC4308) mo129385.f8240;
            }
            m435172 = m435172.f8241;
            mo129385 = mo129385.f8241;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36128(final InterfaceC3109 interfaceC3109, final C7814 c7814) {
        c7814.mo16101();
        if (c7814.f24145.m20480()) {
            c7814.mo16101();
            if ((c7814.f17563 & 4503599627370496L) == 0) {
                this.f46765.m42473(new InterfaceC16818() { // from class: l.᩺ۗ֨
                    @Override // l.InterfaceC16818
                    /* renamed from: ֫ */
                    public final void mo6082() {
                        C15240.m36065(C15240.this, interfaceC3109, c7814);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x00dc, code lost:
    
        if (r2 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if ((r32 & 2305843009213710848L) != 0) goto L62;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m36100(final l.AbstractC5144 r31, long r32, l.AbstractC5698 r34, l.AbstractC5144 r35) {
        /*
            Method dump skipped, instructions count: 831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15240.m36100(l.ۚۚ۠, long, l.ۛ֡֨, l.ۚۚ۠):long");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36067(C15240 c15240, AbstractC5144 abstractC5144) {
        C4824 c4824 = c15240.f46756;
        EnumC20347 enumC20347 = EnumC20347.STRICTFP;
        if (c4824.m14055(enumC20347)) {
            c15240.f46757.m7286(enumC20347, abstractC5144, C14001.f42344);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36137(AbstractC5144 abstractC5144, C1755 c1755, boolean z) {
        new C8186(this, c1755).m21688(abstractC5144, z, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36122(C2609 c2609, C1755 c1755) {
        while (c2609.m8249()) {
            m36137((AbstractC5144) c2609.f8240, c1755, true);
            c2609 = c2609.f8241;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36135(AbstractC5144 abstractC5144, C1755 c1755) {
        C8526 c8526;
        C4824 c4824 = this.f46756;
        EnumC20347 enumC20347 = EnumC20347.RAW;
        if (c4824.m14055(enumC20347) && abstractC5144.f16086.m12913(EnumC9454.CLASS) && !C7260.m19449(abstractC5144)) {
            if (!(c1755.f6079.f17180.isEmpty() && (c8526 = c1755.f6077) != null && c8526.f26044 == this.f46777.f18879) && abstractC5144.f16086.mo12920()) {
                AbstractC4308 abstractC4308 = abstractC5144.f16086;
                AbstractC4308 abstractC43082 = abstractC4308.f13890.f17560;
                C11076 c11076 = C14001.f42334;
                this.f46757.m7286(enumC20347, abstractC5144, new C11076("compiler", "raw.class.use", abstractC4308, abstractC43082));
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m36200(AbstractC4308 abstractC4308, C2609 c2609) {
        while (c2609.m8249()) {
            if (this.f46788.m17546(abstractC4308, (AbstractC4308) c2609.f8240, true)) {
                return true;
            }
            c2609 = c2609.f8241;
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m36193(AbstractC4308 abstractC4308, C2609 c2609) {
        while (c2609.m8249()) {
            AbstractC4308 abstractC43082 = (AbstractC4308) c2609.f8240;
            C6319 c6319 = this.f46788;
            if (c6319.m17546(abstractC4308, abstractC43082, true) || c6319.m17546((AbstractC4308) c2609.f8240, abstractC4308, true)) {
                return true;
            }
            c2609 = c2609.f8241;
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m36172(AbstractC4308 abstractC4308, C2609 c2609) {
        return m36200(abstractC4308, c2609) ? c2609 : m36102(abstractC4308, c2609).m8246(abstractC4308);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m36102(AbstractC4308 abstractC4308, C2609 c2609) {
        if (!c2609.isEmpty()) {
            C2609 m36102 = m36102(abstractC4308, c2609.f8241);
            if (this.f46788.m17546((AbstractC4308) c2609.f8240, abstractC4308, true)) {
                return m36102;
            }
            if (m36102 != c2609.f8241) {
                return m36102.m8246((AbstractC4308) c2609.f8240);
            }
        }
        return c2609;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2609 m36194(C2609 c2609, C2609 c26092) {
        while (c26092.m8249()) {
            c2609 = m36172((AbstractC4308) c26092.f8240, c2609);
            c26092 = c26092.f8241;
        }
        return c2609;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 m36171(C2609 c2609, C2609 c26092) {
        while (c26092.m8249()) {
            c2609 = m36102((AbstractC4308) c26092.f8240, c2609);
            c26092 = c26092.f8241;
        }
        return c2609;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2609 m36187(C2609 c2609, C2609 c26092) {
        C2609 m8239 = C2609.m8239();
        for (C2609 c26093 = c2609; c26093.m8249(); c26093 = c26093.f8241) {
            if (m36200((AbstractC4308) c26093.f8240, c26092)) {
                m8239 = m36172((AbstractC4308) c26093.f8240, m8239);
            }
        }
        while (c26092.m8249()) {
            if (m36200((AbstractC4308) c26092.f8240, c2609)) {
                m8239 = m36172((AbstractC4308) c26092.f8240, m8239);
            }
            c26092 = c26092.f8241;
        }
        return m8239;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m36184(AbstractC4308 abstractC4308) {
        boolean m12913 = abstractC4308.m12913(EnumC9454.TYPEVAR);
        C6319 c6319 = this.f46788;
        if (m12913) {
            return m36184(c6319.m17562(abstractC4308));
        }
        if (abstractC4308.m12913(EnumC9454.CLASS)) {
            C14163 c14163 = (C14163) abstractC4308.f13890;
            if (c14163.f17559 == EnumC1296.f4581) {
                return true;
            }
            C20661 c20661 = this.f46770;
            return c14163.mo16080((AbstractC5698) c20661.f66492.f13890, c6319) || c14163.mo16080((AbstractC5698) c20661.f66453.f13890, c6319);
        }
        return abstractC4308.m12913(EnumC9454.BOT);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2609 m36197(C2609 c2609, C2609 c26092) {
        C2609 m8239 = C2609.m8239();
        while (c2609.m8249()) {
            AbstractC4308 abstractC4308 = (AbstractC4308) c2609.f8240;
            if (!m36184(abstractC4308) && !m36200(abstractC4308, c26092)) {
                m8239 = m8239.m8246((AbstractC4308) c2609.f8240);
            }
            c2609 = c2609.f8241;
        }
        return m8239;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11576 m36052(C3581 c3581, C3581 c35812) {
        AbstractC5698 m16072 = c3581.m16072();
        AbstractC5698 m160722 = c35812.m16072();
        if ((c35812.f17561.mo16084() & 512) == 0) {
            C11576 c11576 = C11886.f35440;
            return new C11576("compiler", "cant.override", c3581, m16072, c35812, m160722);
        }
        if ((c3581.f17561.mo16084() & 512) == 0) {
            C11576 c115762 = C11886.f35440;
            return new C11576("compiler", "cant.implement", c3581, m16072, c35812, m160722);
        }
        C11576 c115763 = C11886.f35440;
        return new C11576("compiler", "clashes.with", c3581, m16072, c35812, m160722);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C11576 m36085(C3581 c3581, C3581 c35812) {
        AbstractC5698 m16072 = c3581.m16072();
        AbstractC5698 m160722 = c35812.m16072();
        if ((c35812.f17561.mo16084() & 512) == 0) {
            C11576 c11576 = C11886.f35440;
            return new C11576("compiler", "unchecked.override", c3581, m16072, c35812, m160722);
        }
        if ((c3581.f17561.mo16084() & 512) == 0) {
            C11576 c115762 = C11886.f35440;
            return new C11576("compiler", "unchecked.implement", c3581, m16072, c35812, m160722);
        }
        C11576 c115763 = C11886.f35440;
        return new C11576("compiler", "unchecked.clash.with", c3581, m16072, c35812, m160722);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C11576 m36089(C3581 c3581, C3581 c35812) {
        AbstractC5698 m16072 = c3581.m16072();
        AbstractC5698 m160722 = c35812.m16072();
        if ((c35812.f17561.mo16084() & 512) == 0) {
            C11576 c11576 = C11886.f35440;
            return new C11576("compiler", "varargs.override", c3581, m16072, c35812, m160722);
        }
        if ((c3581.f17561.mo16084() & 512) == 0) {
            C11576 c115762 = C11886.f35440;
            return new C11576("compiler", "varargs.implement", c3581, m16072, c35812, m160722);
        }
        C11576 c115763 = C11886.f35440;
        return new C11576("compiler", "varargs.clash.with", c3581, m16072, c35812, m160722);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36161(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308, AbstractC4308 abstractC43082, AbstractC4308 abstractC43083) {
        AbstractC4308 abstractC43084;
        AbstractC4308 abstractC43085;
        HashMap hashMap;
        boolean z;
        AbstractC5698 abstractC5698;
        HashMap hashMap2;
        Iterator it;
        long j;
        Iterator it2;
        HashMap hashMap3;
        Iterator it3;
        long j2;
        Iterator it4;
        Iterator it5;
        Iterator it6;
        Iterator it7;
        long mo16084 = abstractC43083.f13890.mo16084() & 16777216;
        C6319 c6319 = this.f46788;
        long j3 = 0;
        if (mo16084 != 0) {
            abstractC43084 = c6319.m17523(abstractC4308);
            abstractC43085 = c6319.m17523(abstractC43082);
        } else {
            abstractC43084 = abstractC4308;
            abstractC43085 = abstractC43082;
        }
        HashMap hashMap4 = new HashMap();
        m36056(abstractC43084, hashMap4);
        if (abstractC43084 == abstractC43085) {
            hashMap = hashMap4;
        } else {
            hashMap = new HashMap();
            m36057(abstractC43085, hashMap4, hashMap);
        }
        Iterator it8 = hashMap4.values().iterator();
        loop0: while (true) {
            boolean z2 = false;
            Predicate predicate = null;
            if (!it8.hasNext()) {
                z = false;
                abstractC5698 = null;
                break;
            }
            AbstractC4308 abstractC43086 = (AbstractC4308) it8.next();
            Iterator it9 = hashMap.values().iterator();
            while (it9.hasNext()) {
                AbstractC4308 abstractC43087 = (AbstractC4308) it9.next();
                Iterator it10 = abstractC43086.f13890.mo16064().mo20475(predicate, EnumC1317.NON_RECURSIVE).iterator();
                while (it10.hasNext()) {
                    AbstractC5698 abstractC56982 = (AbstractC5698) it10.next();
                    if (abstractC56982.f17559 == EnumC1296.f4571 && abstractC56982.mo10961((AbstractC5698) abstractC43083.f13890, c6319) && (abstractC56982.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == j3) {
                        C3581 m10959 = ((C3581) abstractC56982).m10959(abstractC43083.f13890, c6319, z2);
                        C1386 c1386 = c6319.f19598;
                        if (m10959 == null || (m10959.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                            Iterator it11 = abstractC43087.f13890.mo16064().m20476(abstractC56982.f17562).iterator();
                            AbstractC4308 abstractC43088 = null;
                            while (it11.hasNext()) {
                                abstractC5698 = (AbstractC5698) it11.next();
                                if (abstractC56982 == abstractC5698) {
                                    hashMap2 = hashMap;
                                } else {
                                    hashMap2 = hashMap;
                                    if (abstractC5698.f17559 == EnumC1296.f4571 && abstractC5698.mo10961((AbstractC5698) abstractC43083.f13890, c6319)) {
                                        j = 0;
                                        if ((abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                                            if (abstractC43088 == null) {
                                                abstractC43088 = c6319.m17543(abstractC56982, abstractC43086);
                                            }
                                            AbstractC4308 m17543 = c6319.m17543(abstractC5698, abstractC43087);
                                            boolean m17516 = c6319.m17516(abstractC43088, m17543);
                                            it = it8;
                                            it6 = it11;
                                            C22364 c22364 = this.f46757;
                                            if (m17516) {
                                                C2609 mo12938 = abstractC43088.mo12938();
                                                it7 = it10;
                                                C2609 mo129382 = m17543.mo12938();
                                                it2 = it9;
                                                AbstractC4308 mo12923 = abstractC43088.mo12923();
                                                AbstractC4308 m17488 = c6319.m17488(m17543.mo12923(), mo129382, mo12938);
                                                if (!c6319.m17550(mo12923, m17488) && ((mo12923.mo12907() || m17488.mo12907() || (!c6319.m17505(mo12923, m17488, c1386) && !c6319.m17505(m17488, mo12923, c1386))) && !m36166(abstractC56982, abstractC5698, abstractC43083))) {
                                                    AbstractC10370 abstractC10370 = abstractC5698.f17562;
                                                    C2609 mo12933 = c6319.m17543(abstractC5698, abstractC43087).mo12933();
                                                    C11576 c11576 = C11886.f35440;
                                                    C11576 c115762 = new C11576("compiler", "incompatible.diff.ret", abstractC10370, mo12933);
                                                    C12281 c12281 = C6241.f19132;
                                                    c22364.m7273(interfaceC3109, new C12281("compiler", "types.incompatible", abstractC43086, abstractC43087, c115762));
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                it7 = it10;
                                                it2 = it9;
                                                C18770 c18770 = new C18770(this, ((C14163) abstractC43083.f13890).f17560);
                                                if (c18770.m43432(abstractC56982) && c18770.m43432(abstractC5698) && c6319.m17506(abstractC56982.mo16091(c6319), abstractC5698.mo16091(c6319), true) && !m36166(abstractC56982, abstractC5698, abstractC43083)) {
                                                    AbstractC10370 abstractC103702 = abstractC56982.f17562;
                                                    C2609 c2609 = c6319.m17543(abstractC56982, abstractC43083).mo12945().f32059;
                                                    AbstractC5698 m16072 = abstractC56982.m16072();
                                                    AbstractC10370 abstractC103703 = abstractC5698.f17562;
                                                    C2609 c26092 = c6319.m17543(abstractC5698, abstractC43083).mo12945().f32059;
                                                    AbstractC5698 m160722 = abstractC5698.m16072();
                                                    C12281 c122812 = C6241.f19132;
                                                    c22364.m7273(interfaceC3109, new C12281("compiler", "name.clash.same.erasure.no.override", abstractC103702, c2609, m16072, abstractC103703, c26092, m160722));
                                                    z = false;
                                                    break;
                                                }
                                            }
                                        } else {
                                            it = it8;
                                            it6 = it11;
                                            it7 = it10;
                                            it2 = it9;
                                        }
                                        hashMap = hashMap2;
                                        it8 = it;
                                        it11 = it6;
                                        it10 = it7;
                                        it9 = it2;
                                    }
                                }
                                it = it8;
                                it6 = it11;
                                it7 = it10;
                                it2 = it9;
                                hashMap = hashMap2;
                                it8 = it;
                                it11 = it6;
                                it10 = it7;
                                it9 = it2;
                            }
                        }
                        hashMap3 = hashMap;
                        it3 = it8;
                        it4 = it10;
                        it5 = it9;
                        j2 = 0;
                        z2 = false;
                    } else {
                        hashMap3 = hashMap;
                        it3 = it8;
                        j2 = j3;
                        it4 = it10;
                        it5 = it9;
                    }
                    hashMap = hashMap3;
                    j3 = j2;
                    it8 = it3;
                    it10 = it4;
                    it9 = it5;
                }
                hashMap2 = hashMap;
                it = it8;
                j = j3;
                it2 = it9;
                z = false;
                abstractC5698 = null;
                if (abstractC5698 != null) {
                    break loop0;
                }
                z2 = false;
                predicate = null;
                hashMap = hashMap2;
                j3 = j;
                it8 = it;
                it9 = it2;
            }
        }
        if (abstractC5698 == null) {
            return true;
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36056(AbstractC4308 abstractC4308, HashMap hashMap) {
        if (abstractC4308.m12913(EnumC9454.CLASS) && hashMap.put(abstractC4308.f13890, abstractC4308) == null) {
            C6319 c6319 = this.f46788;
            m36056(c6319.m17562(abstractC4308), hashMap);
            Iterator it = c6319.m17510(abstractC4308).iterator();
            while (it.hasNext()) {
                m36056((AbstractC4308) it.next(), hashMap);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36057(AbstractC4308 abstractC4308, HashMap hashMap, HashMap hashMap2) {
        if (abstractC4308.m12913(EnumC9454.CLASS) && hashMap.get(abstractC4308.f13890) == null && hashMap2.put(abstractC4308.f13890, abstractC4308) == null) {
            C6319 c6319 = this.f46788;
            m36057(c6319.m17562(abstractC4308), hashMap, hashMap2);
            Iterator it = c6319.m17510(abstractC4308).iterator();
            while (it.hasNext()) {
                m36057((AbstractC4308) it.next(), hashMap, hashMap2);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36166(AbstractC5698 abstractC5698, AbstractC5698 abstractC56982, AbstractC4308 abstractC4308) {
        HashMap hashMap = new HashMap();
        C6319 c6319 = this.f46788;
        AbstractC4308 m17543 = c6319.m17543(abstractC5698, abstractC4308);
        AbstractC4308 m175432 = c6319.m17543(abstractC56982, abstractC4308);
        m36056(abstractC4308, hashMap);
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (AbstractC5698 abstractC56983 : ((AbstractC4308) it.next()).f13890.mo16064().m20476(abstractC5698.f17562)) {
                if (abstractC56983 != abstractC5698 && abstractC56983 != abstractC56982 && abstractC56983.f17559 == EnumC1296.f4571 && (abstractC56983.mo16084() & 2147487744L) == 0) {
                    AbstractC4308 m175433 = c6319.m17543(abstractC56983, abstractC4308);
                    if (c6319.m17516(m175433, m17543) && c6319.m17516(m175433, m175432) && c6319.m17561(m175433, m17543) && c6319.m17561(m175433, m175432)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36120(C1755 c1755, final C8526 c8526, C3581 c3581) {
        C12281 c12281;
        C14163 c14163 = (C14163) c3581.f17561;
        c14163.mo16101();
        long j = c14163.f17563 & 16384;
        C22364 c22364 = this.f46757;
        C20661 c20661 = this.f46770;
        C6319 c6319 = this.f46788;
        if (j != 0 && this.f46777.f18891.equals(c3581.f17562) && c3581.mo10962(c20661.f66525, c14163, c6319, false)) {
            c22364.m7273(c8526, C6241.f19193);
            return;
        }
        if (this.f46771 && c14163.m33810() && C5378.stream(c14163.m33811()).filter(new Predicate() { // from class: l.᩶ۗ֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C3581 c35812 = ((C21221) obj).f68391;
                return c35812 == C8526.this.f26045 && (c35812.f17563 & 16777216) == 0;
            }
        }).findFirst().isPresent()) {
            return;
        }
        for (AbstractC4308 abstractC4308 = c14163.f17560; abstractC4308.m12913(EnumC9454.CLASS); abstractC4308 = c6319.m17562(abstractC4308)) {
            if (abstractC4308 != c14163.f17560) {
                m36152(c8526, abstractC4308, c14163, c3581);
            }
            Iterator it = c6319.m17510(abstractC4308).iterator();
            while (it.hasNext()) {
                m36152(c8526, (AbstractC4308) it.next(), c14163, c3581);
            }
        }
        boolean z = c3581.m16065((AbstractC5698) c20661.f66521.f13890) != null;
        if (z || !(!((C8604) c1755.f6073).f26295 || c3581.m16075() || (c3581.f17563 & 7) == 2)) {
            if (c3581.f17559 == EnumC1296.f4571 && !c3581.mo15572()) {
                AbstractC19810 abstractC19810 = (AbstractC19810) c3581.f17561;
                Iterator it2 = c6319.m17547(abstractC19810.f17560).iterator();
                while (it2.hasNext()) {
                    AbstractC4308 abstractC43082 = (AbstractC4308) it2.next();
                    if (abstractC43082 != abstractC19810.f17560) {
                        for (AbstractC5698 abstractC5698 : abstractC43082.f13890.mo16064().m20476(c3581.f17562)) {
                            if (!abstractC5698.mo15572() && c3581.mo10962(abstractC5698, abstractC19810, c6319, true)) {
                                return;
                            }
                        }
                    }
                }
            }
            Iterator it3 = c8526.f26046.f7168.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C17551 c17551 = (C17551) it3.next();
                if (c17551.f53650.f16086.f13890 == c20661.f66521.f13890) {
                    c8526 = c17551;
                    break;
                }
            }
            if (z) {
                c12281 = c3581.mo15572() ? C6241.f19164 : C6241.f19178;
            } else {
                C12281 c122812 = C6241.f19132;
                c12281 = new C12281("compiler", "anonymous.diamond.method.does.not.override.superclass", C11886.f35447);
            }
            c22364.m7273(c8526, c12281);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36152(C8526 c8526, AbstractC4308 abstractC4308, C14163 c14163, C3581 c3581) {
        for (AbstractC5698 abstractC5698 : abstractC4308.f13890.mo16064().m20476(c3581.f17562)) {
            if (c3581.mo10962(abstractC5698, c14163, this.f46788, false) && (abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0) {
                m36138(c8526, c3581, (C3581) abstractC5698, c14163);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36139(AbstractC5144 abstractC5144, C14163 c14163) {
        C2609 m17510;
        C20661 c20661 = this.f46770;
        AbstractC4308 abstractC4308 = c20661.f66526;
        AbstractC4308 abstractC43082 = c20661.f66526;
        if (c14163 == ((C14163) abstractC4308.f13890) || c14163.m16070() || c14163.m16090()) {
            return;
        }
        c14163.mo16101();
        if ((c14163.f17563 & 8192) == 0) {
            c14163.mo16101();
            if ((c14163.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                return;
            }
            boolean isEmpty = c14163.f17562.isEmpty();
            C6319 c6319 = this.f46788;
            if (!isEmpty || (m17510 = c6319.m17510(c14163.f17560)) == null || m17510.isEmpty() || ((AbstractC4308) m17510.f8240).f13890 != c20661.f66464.f13890) {
                C4824 c4824 = this.f46756;
                EnumC20347 enumC20347 = EnumC20347.OVERRIDES;
                if (c4824.m14055(enumC20347)) {
                    AbstractC14016 mo16064 = abstractC43082.f13890.mo16064();
                    C6136 c6136 = this.f46777;
                    C3581 c3581 = (C3581) mo16064.mo20478(c6136.f18871, (Predicate) null);
                    C3581 c35812 = (C3581) abstractC43082.f13890.mo16064().mo20478(c6136.f18794, (Predicate) null);
                    C4464 c4464 = this.f46759;
                    C3581 m17485 = c6319.m17485(c3581, (AbstractC19810) c14163, false, (Predicate) c4464);
                    boolean z = m17485 != null && m17485.f17561 == c14163;
                    boolean z2 = c6319.m17485(c35812, (AbstractC19810) c14163, false, (Predicate) c4464) != c35812;
                    if (!z || z2) {
                        return;
                    }
                    C11076 c11076 = C14001.f42334;
                    this.f46757.m7286(enumC20347, abstractC5144, new C11076("compiler", "override.equals.but.not.hashcode", c14163));
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36132(C3587 c3587) {
        AbstractC10370 abstractC10370;
        AbstractC12612 abstractC12612;
        AbstractC12612 abstractC126122;
        String abstractC103702;
        int length;
        C12171.m29637(c3587.f11377.f17562);
        if (this.f46756.m14055(EnumC20347.MODULE)) {
            AbstractC12612 abstractC126123 = c3587.f11378;
            while (abstractC126123 != null) {
                int i = C2542.f8065[abstractC126123.mo989().ordinal()];
                if (i == 1) {
                    C6262 c6262 = (C6262) abstractC126123;
                    abstractC10370 = c6262.f19395;
                    abstractC12612 = c6262.f19397;
                    abstractC126122 = c6262;
                } else if (i == 2) {
                    abstractC10370 = ((C7673) abstractC126123).f23696;
                    abstractC12612 = null;
                    abstractC126122 = abstractC126123;
                } else {
                    throw new AssertionError("Unexpected qualified identifier: " + abstractC126123.toString());
                }
                if (abstractC10370 != null && (length = (abstractC103702 = abstractC10370.toString()).length()) > 0 && Character.isDigit(abstractC103702.charAt(length - 1))) {
                    EnumC20347 enumC20347 = EnumC20347.MODULE;
                    C11076 c11076 = C14001.f42334;
                    this.f46757.m7286(enumC20347, abstractC126122, new C11076("compiler", "poor.choice.for.module.name", abstractC10370));
                }
                abstractC126123 = abstractC12612;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36157(C14163 c14163, InterfaceC3109 interfaceC3109) {
        C6319 c6319 = this.f46788;
        C3581 m17486 = c6319.m17486(c14163);
        if (m17486 != null) {
            C3581 c3581 = new C3581(m17486.f17563, m17486.f17562, c6319.m17543(m17486, c14163.f17560), m17486.f17561);
            AbstractC5698 m16072 = c3581.m16072();
            C12281 c12281 = C6241.f19132;
            this.f46757.m7273(interfaceC3109, new C12281("compiler", "does.not.override.abstract", c14163, c3581, m16072));
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m36186(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        m36083(interfaceC3109, abstractC4308);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36159(C14315 c14315, C8541 c8541) {
        m36061(c14315, c8541, C2609.m8239());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36061(C14315 c14315, AbstractC4308 abstractC4308, C2609 c2609) {
        EnumC9454 enumC9454 = EnumC9454.TYPEVAR;
        if (!abstractC4308.m12913(enumC9454) || (abstractC4308.f13890.mo16084() & 268435456) == 0) {
            boolean contains = c2609.contains(abstractC4308);
            C6319 c6319 = this.f46788;
            if (contains) {
                ((C8541) abstractC4308).mo21267(c6319.m17535(abstractC4308));
                C12281 c12281 = C6241.f19132;
                this.f46757.m7273(c14315, new C12281("compiler", "cyclic.inheritance", abstractC4308));
            } else if (abstractC4308.m12913(enumC9454)) {
                C8541 c8541 = (C8541) abstractC4308;
                C2609 m8246 = c2609.m8246(c8541);
                Iterator it = c6319.m17484(c8541).iterator();
                while (it.hasNext()) {
                    m36061(c14315, (AbstractC4308) it.next(), m8246);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m36083(l.InterfaceC3109 r12, l.AbstractC4308 r13) {
        /*
            r11 = this;
            l.᩶֡֨ r13 = r13.f13890
            long r0 = r13.f17563
            r2 = 1073741824(0x40000000, double:5.304989477E-315)
            long r4 = r0 & r2
            r6 = 1
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 == 0) goto L11
            return r6
        L11:
            r4 = 134217728(0x8000000, double:6.63123685E-316)
            long r0 = r0 & r4
            int r9 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r9 == 0) goto L20
            r0 = r13
            l.ܳ֡֨ r0 = (l.C14163) r0
            r11.m36091(r0, r12)
            goto L86
        L20:
            l.ۙ֨֨ r0 = r13.f17560
            boolean r0 = r0.mo12948()
            if (r0 != 0) goto L86
            r0 = -134217729(0xfffffffff7ffffff, double:NaN)
            long r9 = r13.f17563     // Catch: java.lang.Throwable -> L7f
            long r4 = r4 | r9
            r13.f17563 = r4     // Catch: java.lang.Throwable -> L7f
            l.ۙ֨֨ r4 = r13.f17560     // Catch: java.lang.Throwable -> L7f
            l.ۢ۠֨ r5 = l.EnumC9454.CLASS     // Catch: java.lang.Throwable -> L7f
            boolean r4 = r4.m12913(r5)     // Catch: java.lang.Throwable -> L7f
            if (r4 == 0) goto L78
            l.ۙ֨֨ r4 = r13.f17560     // Catch: java.lang.Throwable -> L7f
            l.᩶ۚ֨ r4 = (l.C19955) r4     // Catch: java.lang.Throwable -> L7f
            l.ۖܶ۠ r5 = r4.f64620     // Catch: java.lang.Throwable -> L7f
            r9 = 1
            if (r5 == 0) goto L55
        L43:
            boolean r10 = r5.m8249()     // Catch: java.lang.Throwable -> L7f
            if (r10 == 0) goto L55
            java.lang.Object r10 = r5.f8240     // Catch: java.lang.Throwable -> L7f
            l.ۙ֨֨ r10 = (l.AbstractC4308) r10     // Catch: java.lang.Throwable -> L7f
            boolean r10 = r11.m36083(r12, r10)     // Catch: java.lang.Throwable -> L7f
            r9 = r9 & r10
            l.ۖܶ۠ r5 = r5.f8241     // Catch: java.lang.Throwable -> L7f
            goto L43
        L55:
            l.ۙ֨֨ r4 = r4.f64618     // Catch: java.lang.Throwable -> L7f
            if (r4 == 0) goto L68
            if (r4 == 0) goto L68
            l.ۢ۠֨ r5 = l.EnumC9454.CLASS     // Catch: java.lang.Throwable -> L7f
            boolean r5 = r4.m12913(r5)     // Catch: java.lang.Throwable -> L7f
            if (r5 == 0) goto L68
            boolean r4 = r11.m36083(r12, r4)     // Catch: java.lang.Throwable -> L7f
            r9 = r9 & r4
        L68:
            l.ۛ֡֨ r4 = r13.f17561     // Catch: java.lang.Throwable -> L7f
            l.֨ᩴ֨ r5 = r4.f17559     // Catch: java.lang.Throwable -> L7f
            l.֨ᩴ֨ r10 = l.EnumC1296.f4582     // Catch: java.lang.Throwable -> L7f
            if (r5 != r10) goto L79
            l.ۙ֨֨ r4 = r4.f17560     // Catch: java.lang.Throwable -> L7f
            boolean r12 = r11.m36083(r12, r4)     // Catch: java.lang.Throwable -> L7f
            r9 = r9 & r12
            goto L79
        L78:
            r9 = 1
        L79:
            long r4 = r13.f17563
            long r0 = r0 & r4
            r13.f17563 = r0
            goto L87
        L7f:
            r12 = move-exception
            long r2 = r13.f17563
            long r0 = r0 & r2
            r13.f17563 = r0
            throw r12
        L86:
            r9 = 1
        L87:
            if (r9 == 0) goto L9e
            long r0 = r13.f17563
            r4 = 268435456(0x10000000, double:1.32624737E-315)
            long r0 = r0 & r4
            int r12 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r12 != 0) goto L9c
            l.ۜ֡֨ r12 = r13.f17564
            boolean r12 = r12.mo7078()
            if (r12 == 0) goto L9c
            goto L9d
        L9c:
            r6 = 0
        L9d:
            r9 = r6
        L9e:
            if (r9 == 0) goto La5
            long r0 = r13.f17563
            long r0 = r0 | r2
            r13.f17563 = r0
        La5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15240.m36083(l.ۗ۠۠, l.ۙ֨֨):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m36091(C14163 c14163, InterfaceC3109 interfaceC3109) {
        C12281 c12281 = C6241.f19132;
        this.f46757.m7273(interfaceC3109, new C12281("compiler", "cyclic.inheritance", c14163));
        AbstractC4308 abstractC4308 = c14163.f17560;
        C6319 c6319 = this.f46788;
        for (C2609 m17510 = c6319.m17510(abstractC4308); m17510.m8249(); m17510 = m17510.f8241) {
            m17510.f8240 = new C12193((C14163) ((AbstractC4308) m17510.f8240).f13890, AbstractC4308.f13885);
        }
        AbstractC4308 m17562 = c6319.m17562(c14163.f17560);
        if (m17562.m12913(EnumC9454.CLASS)) {
            ((C19955) c14163.f17560).f64618 = new C12193((C14163) m17562.f13890, AbstractC4308.f13885);
        }
        c14163.f17560 = new C12193(c14163, c14163.f17560);
        c14163.f17563 |= 1073741824;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36140(AbstractC5144 abstractC5144, C14163 c14163, C14163 c141632) {
        C3581 c3581;
        C3581 m10959;
        AbstractC4308 abstractC4308 = c141632.f17560;
        C6319 c6319 = this.f46788;
        for (C2609 m17547 = c6319.m17547(abstractC4308); m17547.m8249(); m17547 = m17547.f8241) {
            C14163 c141633 = (C14163) ((AbstractC4308) m17547.f8240).f13890;
            c141633.mo16101();
            if ((c141633.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                c141633.mo16101();
                for (AbstractC5698 abstractC5698 : c141633.f42762.mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
                    if (abstractC5698.f17559 == EnumC1296.f4571 && (abstractC5698.mo16084() & 1032) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS && (m10959 = (c3581 = (C3581) abstractC5698).m10959(c14163, c6319, false)) != null && m10959 != c3581) {
                        long mo16084 = m10959.f17561.mo16084() & 512;
                        c14163.mo16101();
                        if (mo16084 == (512 & c14163.f17563)) {
                            m36138(abstractC5144, m10959, c3581, c14163);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36190(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        long j;
        C6319 c6319 = this.f46788;
        C2609 m17510 = c6319.m17510(abstractC4308);
        AbstractC4308 m17562 = c6319.m17562(abstractC4308);
        long j2 = 0;
        if (m17562.m12913(EnumC9454.CLASS) && (m17562.f13890.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
            m17510 = m17510.m8246(m17562);
        }
        for (C2609 c2609 = m17510; c2609.m8249(); c2609 = c2609.f8241) {
            if (!((AbstractC4308) c2609.f8240).mo12938().isEmpty()) {
                AbstractC4308 abstractC43082 = (AbstractC4308) c2609.f8240;
                if (!m36161(interfaceC3109, abstractC43082, abstractC43082, abstractC4308)) {
                    return;
                }
            }
            for (C2609 c26092 = m17510; c26092 != c2609; c26092 = c26092.f8241) {
                if (!m36161(interfaceC3109, (AbstractC4308) c2609.f8240, (AbstractC4308) c26092.f8240, abstractC4308)) {
                    return;
                }
            }
        }
        AbstractC4308 m175622 = c6319.m17562(abstractC4308);
        if (m175622.m12913(EnumC9454.CLASS)) {
            for (AbstractC4308 abstractC43083 = m175622; abstractC43083.m12913(EnumC9454.CLASS) && abstractC43083.f13890.f17560.mo12917(); abstractC43083 = c6319.m17562(abstractC43083)) {
                for (AbstractC5698 abstractC5698 : abstractC43083.f13890.mo16064().mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
                    if (abstractC5698.f17559 == EnumC1296.f4571) {
                        long j3 = 2147487752L;
                        if ((abstractC5698.mo16084() & 2147487752L) == j2 && abstractC5698.mo10961((AbstractC5698) abstractC4308.f13890, c6319)) {
                            boolean z = true;
                            if (((C3581) abstractC5698).m10959(abstractC4308.f13890, c6319, true) == abstractC5698) {
                                AbstractC4308 m17543 = c6319.m17543(abstractC5698, abstractC43083);
                                int m8245 = m17543.mo12933().m8245();
                                if (m17543 != abstractC5698.f17560) {
                                    AbstractC4308 abstractC43084 = m175622;
                                    while (abstractC43084.m12913(EnumC9454.CLASS)) {
                                        for (AbstractC5698 abstractC56982 : abstractC43084.f13890.mo16064().m20476(abstractC5698.f17562)) {
                                            if (abstractC56982 == abstractC5698) {
                                                j = j3;
                                            } else if (abstractC56982.f17559 == EnumC1296.f4571) {
                                                j = 2147487752L;
                                                if ((abstractC56982.mo16084() & 2147487752L) == 0 && abstractC56982.f17560.mo12933().m8245() == m8245 && abstractC56982.mo10961((AbstractC5698) abstractC4308.f13890, c6319) && ((C3581) abstractC56982).m10959(abstractC4308.f13890, c6319, z) == abstractC56982) {
                                                    if (c6319.m17516(m17543, c6319.m17543(abstractC56982, abstractC43084))) {
                                                        C12281 c12281 = C6241.f19132;
                                                        Object[] objArr = new Object[5];
                                                        objArr[0] = abstractC5698;
                                                        objArr[z ? 1 : 0] = abstractC43083;
                                                        objArr[2] = abstractC56982;
                                                        objArr[3] = abstractC43084;
                                                        objArr[4] = m175622;
                                                        this.f46757.m7273(interfaceC3109, new C12281("compiler", "concrete.inheritance.conflict", objArr));
                                                    }
                                                    z = true;
                                                }
                                            } else {
                                                j = 2147487752L;
                                            }
                                            j3 = j;
                                        }
                                        abstractC43084 = c6319.m17562(abstractC43084);
                                        z = true;
                                    }
                                    j2 = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36181(C8526 c8526, AbstractC4308 abstractC4308, C3581 c3581) {
        C18770 c18770 = new C18770(this, abstractC4308);
        C2609 m8239 = C2609.m8239();
        final ArrayList arrayList = new ArrayList();
        C6319 c6319 = this.f46788;
        boolean z = false;
        C19846.forEach(c6319.m17498(abstractC4308, false).mo20477(c3581.f17562, c18770, EnumC1317.RECURSIVE), new Consumer() { // from class: l.ۗۗ֨
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void n(Object obj) {
                arrayList.add((AbstractC5698) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }
        });
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC5698 abstractC5698 = (AbstractC5698) it.next();
            if (c3581.mo10962(abstractC5698, abstractC4308.f13890, c6319, z)) {
                if (abstractC5698 != c3581) {
                    m8239 = C2609.m8239();
                    z2 = true;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    AbstractC5698 abstractC56982 = (AbstractC5698) it2.next();
                    if (abstractC56982 != abstractC5698) {
                        if (!c6319.m17532(c3581.f17560, c6319.m17543(abstractC56982, abstractC4308), EnumC10637.f32011.m26686(this.f46774)) && c6319.m17506(abstractC56982.mo16091(c6319), abstractC5698.mo16091(c6319), true)) {
                            c3581.f17563 |= 4398046511104L;
                            C22364 c22364 = this.f46757;
                            if (abstractC5698 == c3581) {
                                AbstractC10370 abstractC10370 = abstractC5698.f17562;
                                C2609 c2609 = c6319.m17543(abstractC5698, abstractC4308).mo12945().f32059;
                                AbstractC5698 m16072 = abstractC5698.m16072();
                                AbstractC10370 abstractC103702 = abstractC56982.f17562;
                                C2609 c26092 = c6319.m17543(abstractC56982, abstractC4308).mo12945().f32059;
                                AbstractC5698 m160722 = abstractC56982.m16072();
                                C12281 c12281 = C6241.f19132;
                                c22364.m7273(c8526, new C12281("compiler", "name.clash.same.erasure.no.override", abstractC10370, c2609, m16072, abstractC103702, c26092, m160722));
                                return;
                            }
                            C19955 c19955 = (C19955) abstractC4308;
                            String str = c19955.mo12925() ? "interface" : Name.LABEL;
                            AbstractC10370 abstractC103703 = c19955.f13890.f17562;
                            AbstractC10370 abstractC103704 = abstractC5698.f17562;
                            C2609 c26093 = c6319.m17543(abstractC5698, abstractC4308).mo12945().f32059;
                            AbstractC5698 m160723 = abstractC5698.m16072();
                            AbstractC10370 abstractC103705 = abstractC56982.f17562;
                            C2609 c26094 = c6319.m17543(abstractC56982, abstractC4308).mo12945().f32059;
                            AbstractC5698 m160724 = abstractC56982.m16072();
                            C12281 c122812 = C6241.f19132;
                            c22364.m7273(c8526, new C12281("compiler", "name.clash.same.erasure.no.override.1", str, abstractC103703, abstractC103704, c26093, m160723, abstractC103705, c26094, m160724));
                            return;
                        }
                        z = false;
                    }
                }
            } else if (abstractC5698 != c3581 && !z2) {
                m8239 = m8239.m8246((C3581) abstractC5698);
            }
        }
        if (z2) {
            return;
        }
        Iterator it3 = m8239.iterator();
        while (it3.hasNext()) {
            m36151(c8526, abstractC4308, c3581, (C3581) it3.next());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36150(C8526 c8526, AbstractC4308 abstractC4308, C3581 c3581) {
        C18770 c18770 = new C18770(this, abstractC4308);
        C6319 c6319 = this.f46788;
        for (AbstractC5698 abstractC5698 : c6319.m17498(abstractC4308, true).mo20477(c3581.f17562, c18770, EnumC1317.RECURSIVE)) {
            if (!c6319.m17532(c3581.f17560, c6319.m17543(abstractC5698, abstractC4308), EnumC10637.f32011.m26686(this.f46774))) {
                if (c6319.m17506(abstractC5698.mo16091(c6319), c3581.mo16091(c6319), true)) {
                    AbstractC5698 m16072 = c3581.m16072();
                    AbstractC5698 m160722 = abstractC5698.m16072();
                    C12281 c12281 = C6241.f19132;
                    this.f46757.m7273(c8526, new C12281("compiler", "name.clash.same.erasure.no.hide", c3581, m16072, abstractC5698, m160722));
                    return;
                }
                m36151(c8526, abstractC4308, c3581, (C3581) abstractC5698);
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m36195(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        char c;
        AbstractC5698 abstractC5698;
        C11576 c11576;
        C5364 c5364 = new C5364(this, abstractC4308);
        C6319 c6319 = this.f46788;
        for (AbstractC5698 abstractC56982 : c6319.m17498(abstractC4308, false).mo20475(c5364, EnumC1317.RECURSIVE)) {
            int i = 1;
            C12171.m29642(abstractC56982.f17559 == EnumC1296.f4571);
            C2609 m17483 = c6319.m17483(abstractC4308, (C3581) abstractC56982);
            if (m17483.m8245() > 1) {
                C18837 c18837 = new C18837();
                C18837 c188372 = new C18837();
                Iterator it = m17483.iterator();
                while (it.hasNext()) {
                    C3581 c3581 = (C3581) it.next();
                    long j = c3581.f17563;
                    if ((8796093022208L & j) != 0) {
                        c188372.m43511(c3581);
                    } else if ((j & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) != 0) {
                        c18837.m43511(c3581);
                    }
                    if (!c188372.m43518() || c18837.size() + c188372.size() < 2) {
                        i = 1;
                    } else {
                        AbstractC5698 abstractC56983 = (AbstractC5698) c188372.first();
                        if (c188372.size() > i) {
                            abstractC5698 = (AbstractC5698) c188372.m43517().f8241.f8240;
                            EnumC8352 m49076 = C21758.m49076(abstractC4308.f13890);
                            AbstractC10370 abstractC10370 = abstractC56982.f17562;
                            C2609 mo12933 = c6319.m17543(abstractC56982, abstractC4308).mo12933();
                            AbstractC5698 m16072 = abstractC56983.m16072();
                            AbstractC5698 m160722 = abstractC5698.m16072();
                            C11576 c115762 = C11886.f35440;
                            c = 1;
                            c11576 = new C11576("compiler", "incompatible.unrelated.defaults", m49076, abstractC4308, abstractC10370, mo12933, m16072, m160722);
                        } else {
                            c = 1;
                            abstractC5698 = (AbstractC5698) c18837.first();
                            EnumC8352 m490762 = C21758.m49076(abstractC4308.f13890);
                            AbstractC10370 abstractC103702 = abstractC56982.f17562;
                            C2609 mo129332 = c6319.m17543(abstractC56982, abstractC4308).mo12933();
                            AbstractC5698 m160723 = abstractC56983.m16072();
                            AbstractC5698 m160724 = abstractC5698.m16072();
                            C11576 c115763 = C11886.f35440;
                            c11576 = new C11576("compiler", "incompatible.abstract.default", m490762, abstractC4308, abstractC103702, mo129332, m160723, m160724);
                        }
                        AbstractC4308 abstractC43082 = abstractC56983.m16072().f17560;
                        AbstractC4308 abstractC43083 = abstractC5698.m16072().f17560;
                        C12281 c12281 = C6241.f19132;
                        Object[] objArr = new Object[3];
                        objArr[0] = abstractC43082;
                        objArr[c] = abstractC43083;
                        objArr[2] = c11576;
                        this.f46757.m7273(interfaceC3109, new C12281("compiler", "types.incompatible", objArr));
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36151(C8526 c8526, AbstractC4308 abstractC4308, C3581 c3581, C3581 c35812) {
        if (c3581 != c35812 && EnumC10637.f31991.m26686(this.f46774) && this.f46756.m14055(EnumC20347.OVERLOADS) && (c3581.f17563 & 281474976710656L) == 0 && (c35812.f17563 & 281474976710656L) == 0) {
            C6319 c6319 = this.f46788;
            AbstractC4308 m17543 = c6319.m17543(c3581, abstractC4308);
            AbstractC4308 m175432 = c6319.m17543(c35812, abstractC4308);
            EnumC9454 enumC9454 = EnumC9454.FORALL;
            if (m17543.m12913(enumC9454) && m175432.m12913(enumC9454)) {
                C10077 c10077 = (C10077) m17543;
                C10077 c100772 = (C10077) m175432;
                if (c6319.m17507(c10077, c100772)) {
                    m175432 = c6319.m17488(m175432, c100772.f30362, c10077.f30362);
                }
            }
            int max = Math.max(m17543.mo12933().m8245(), m175432.mo12933().m8245());
            C2609 mo12933 = m17543.mo12933();
            C22406 c22406 = this.f46760;
            C2609 m50299 = c22406.m50299(mo12933, (AbstractC5698) c3581, max, true);
            C2609 m502992 = c22406.m50299(m175432.mo12933(), (AbstractC5698) c35812, max, true);
            if (m50299.m8245() != m502992.m8245()) {
                return;
            }
            boolean z = false;
            while (m50299.m8249() && m502992.m8249()) {
                AbstractC4308 abstractC43082 = (AbstractC4308) m50299.f8240;
                AbstractC4308 abstractC43083 = (AbstractC4308) m502992.f8240;
                if (!c6319.m17546(abstractC43083, abstractC43082, true) && !c6319.m17546(abstractC43082, abstractC43083, true)) {
                    if (!c6319.m17558(abstractC43082) || !c6319.m17558(abstractC43083) || c6319.m17538(abstractC43082).mo12933().m8245() <= 0 || c6319.m17538(abstractC43082).mo12933().m8245() != c6319.m17538(abstractC43083).mo12933().m8245()) {
                        return;
                    } else {
                        z = true;
                    }
                }
                m50299 = m50299.f8241;
                m502992 = m502992.f8241;
            }
            if (z) {
                c3581.f17563 |= 281474976710656L;
                c35812.f17563 |= 281474976710656L;
                EnumC20347 enumC20347 = EnumC20347.OVERLOADS;
                AbstractC5698 m16072 = c3581.m16072();
                AbstractC5698 m160722 = c35812.m16072();
                C11076 c11076 = C14001.f42334;
                this.f46757.m7286(enumC20347, c8526, new C11076("compiler", "potentially.ambiguous.overload", c3581, m16072, c35812, m160722));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36155(AbstractC12612 abstractC12612, boolean z) {
        if (!this.f46766) {
            C4824 c4824 = this.f46756;
            EnumC20347 enumC20347 = EnumC20347.SERIAL;
            if (!c4824.m14055(enumC20347) || this.f46756.m14056(enumC20347) || !z) {
                return;
            }
        }
        AbstractC5698 m19472 = C7260.m19472(abstractC12612);
        if (m19472.f17559.m4391(C15406.f47185)) {
            if (m19472.f17559 == EnumC1296.f4567) {
                if ((m19472.mo16084() & 8589934592L) != 0 || m19472.m16077()) {
                    return;
                }
                AbstractC10370 abstractC10370 = m19472.f17562;
                C6136 c6136 = this.f46777;
                if (abstractC10370 == c6136.f18886 || abstractC10370 == c6136.f18898) {
                    return;
                }
            }
            AbstractC4308 abstractC4308 = m19472.f17561.f17560;
            C20661 c20661 = this.f46770;
            if (this.f46788.m17546(abstractC4308, c20661.f66487, true) || m19472.m16089() == c20661.f66473) {
                return;
            }
            for (AbstractC5698 abstractC5698 = m19472; abstractC5698.f17559 != EnumC1296.f4579; abstractC5698 = abstractC5698.f17561) {
                if ((abstractC5698.mo16084() & 1) == 0) {
                    C22364 c22364 = this.f46757;
                    if (!z) {
                        C11076 c11076 = C14001.f42334;
                        c22364.m7285(abstractC12612, new C11076("compiler", "access.to.member.from.serializable.element", m19472));
                        return;
                    }
                    String abstractC103702 = m19472.m16089().f24143.toString();
                    if (abstractC103702.startsWith("java.") || abstractC103702.startsWith("javax.") || abstractC103702.startsWith("sun.") || abstractC103702.contains(".internal.")) {
                        EnumC20347 enumC203472 = EnumC20347.SERIAL;
                        C11076 c110762 = C14001.f42334;
                        c22364.m7286(enumC203472, abstractC12612, new C11076("compiler", "access.to.member.from.serializable.lambda", m19472));
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36124(InterfaceC3109 interfaceC3109, HashMap hashMap, AbstractC4308 abstractC4308) {
        if (abstractC4308.mo12948()) {
            return;
        }
        C6319 c6319 = this.f46788;
        for (C2609 m17510 = c6319.m17510(abstractC4308); m17510.m8249(); m17510 = m17510.f8241) {
            AbstractC4308 abstractC43082 = (AbstractC4308) m17510.f8240;
            EnumC9454 enumC9454 = EnumC9454.CLASS;
            if (!abstractC4308.m12913(enumC9454) || abstractC43082.m12913(enumC9454)) {
                AbstractC4308 abstractC43083 = (AbstractC4308) hashMap.put(abstractC43082.f13890, abstractC43082);
                if (abstractC43083 != null) {
                    C2609 mo12934 = abstractC43083.mo12934();
                    C2609 mo129342 = abstractC43082.mo12934();
                    if (!c6319.m17529(mo12934, mo129342)) {
                        AbstractC19810 abstractC19810 = abstractC43082.f13890;
                        String m12906 = AbstractC4308.m12906(mo12934);
                        String m129062 = AbstractC4308.m12906(mo129342);
                        C12281 c12281 = C6241.f19132;
                        this.f46757.m7273(interfaceC3109, new C12281("compiler", "cant.inherit.diff.arg", abstractC19810, m12906, m129062));
                    }
                }
                m36124(interfaceC3109, hashMap, abstractC43082);
            }
        }
        AbstractC4308 m17562 = c6319.m17562(abstractC4308);
        EnumC9454 enumC94542 = EnumC9454.CLASS;
        if ((!abstractC4308.m12913(enumC94542) || m17562.m12913(enumC94542)) && m17562 != AbstractC4308.f13885) {
            m36124(interfaceC3109, hashMap, m17562);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36154(AbstractC12612 abstractC12612, AbstractC4308 abstractC4308, HashSet hashSet) {
        if (hashSet.contains(abstractC4308)) {
            this.f46757.m7273(abstractC12612, C6241.f19234);
        } else {
            hashSet.add(abstractC4308);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36179(AbstractC5144 abstractC5144) {
        if (abstractC5144 != null) {
            m36170(abstractC5144, abstractC5144.f16086);
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m36170(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308) {
        if (abstractC4308.mo12941()) {
            return;
        }
        C20661 c20661 = this.f46770;
        AbstractC4308 abstractC43082 = c20661.f66533;
        C6319 c6319 = this.f46788;
        if (!c6319.m17550(abstractC4308, abstractC43082) && (abstractC4308.f13890.mo16084() & 16384) == 0 && (abstractC4308.f13890.mo16084() & 8192) == 0 && C6319.m17474(abstractC4308).f13890 != c20661.f66514.f13890) {
            if (c6319.m17512(abstractC4308) && !c6319.m17512(c6319.m17515(abstractC4308))) {
                m36170(interfaceC3109, c6319.m17515(abstractC4308));
            } else {
                this.f46757.m7273(interfaceC3109, C6241.f19272);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36148(C8526 c8526, C3581 c3581) {
        C6319 c6319;
        AbstractC4308 abstractC4308 = this.f46770.f66485;
        while (abstractC4308.m12913(EnumC9454.CLASS)) {
            Iterator it = abstractC4308.f13890.mo16064().m20476(c3581.f17562).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c6319 = this.f46788;
                if (hasNext) {
                    AbstractC5698 abstractC5698 = (AbstractC5698) it.next();
                    if (abstractC5698.f17559 == EnumC1296.f4571 && (abstractC5698.mo16084() & 5) != 0 && c6319.m17516(c3581.f17560, abstractC5698.f17560)) {
                        C12281 c12281 = C6241.f19132;
                        this.f46757.m7273(c8526, new C12281("compiler", "intf.annotation.member.clash", abstractC5698, abstractC4308));
                    }
                }
            }
            abstractC4308 = c6319.m17562(abstractC4308);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016a  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m36145(l.AbstractC5698 r19, l.AbstractC5144 r20, l.C2609 r21) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15240.m36145(l.ۛ֡֨, l.ۚۚ۠, l.ۖܶ۠):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m36078(C15240 c15240, AbstractC10370 abstractC10370) {
        return abstractC10370 == c15240.f46777.f18789;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36183(C17551 c17551, boolean z) {
        C12171.m29637(c17551.f16086);
        c17551.mo988(new C6775(this));
        if (!c17551.m14709(EnumC18550.f57483) || c17551.f53650.f16086.mo12948() || m36168(c17551, z)) {
            return;
        }
        AbstractC4308 abstractC4308 = c17551.f16086;
        C12281 c12281 = C6241.f19132;
        this.f46757.m7273(c17551, new C12281("compiler", "annotation.type.not.applicable.to.type", abstractC4308));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36158(C14163 c14163, C16384 c16384, C17551 c17551) {
        AbstractC4308 abstractC4308;
        C6136 c6136;
        Set set;
        Set<AbstractC10370> set2;
        C6136 c61362;
        AbstractC4308 abstractC43082 = c16384.f26338;
        C20661 c20661 = this.f46770;
        AbstractC4308 abstractC43083 = c20661.f66530;
        AbstractC4308 abstractC43084 = c20661.f66494;
        AbstractC4308 abstractC43085 = c20661.f66474;
        C6319 c6319 = this.f46788;
        C12171.m29642(c6319.m17550(abstractC43082, abstractC43083));
        C2609 c2609 = c16384.f50417;
        boolean isEmpty = c2609.isEmpty();
        C6136 c61363 = this.f46777;
        if (isEmpty) {
            abstractC4308 = null;
        } else {
            C12171.m29642(((C3581) ((C23069) c2609.f8240).f74207).f17562 == c61363.f18860);
            abstractC4308 = ((C10741) ((C23069) c2609.f8240).f74208).f32362;
        }
        if (abstractC4308 == null) {
            return;
        }
        AbstractC19810 abstractC19810 = abstractC4308.f13890;
        AbstractC5698 mo20478 = abstractC19810.mo16064().mo20478(c61363.f18860, (Predicate) null);
        C22364 c22364 = this.f46757;
        if (mo20478 != null && mo20478.f17559 == EnumC1296.f4571) {
            AbstractC4308 mo12923 = ((C3581) mo20478).f17560.mo12923();
            if (mo12923.m12913(EnumC9454.ARRAY) && c6319.m17550(((C5138) mo12923).f16077, c14163.f17560)) {
                c6136 = c61363;
            } else {
                C5138 m17478 = c6319.m17478(c14163.f17560);
                C12281 c12281 = C6241.f19132;
                c6136 = c61363;
                c22364.m7273(c17551, new C12281("compiler", "invalid.repeatable.annotation.value.return", abstractC19810, mo12923, m17478));
            }
        } else {
            c6136 = c61363;
            C12281 c122812 = C6241.f19132;
            c22364.m7273(c17551, new C12281("compiler", "invalid.repeatable.annotation.no.value", abstractC19810));
        }
        AbstractC19810 abstractC198102 = abstractC4308.f13890;
        EnumC23440 m17528 = c6319.m17528(abstractC198102);
        EnumC23440 m175282 = c6319.m17528((AbstractC19810) c14163);
        int i = C2542.f8061[m175282.ordinal()];
        if (i == 1 ? m17528 != EnumC23440.RUNTIME : !(i != 2 || m17528 != EnumC23440.SOURCE)) {
            String name = m17528.name();
            String name2 = m175282.name();
            C12281 c122813 = C6241.f19132;
            c22364.m7273(c17551, new C12281("compiler", "invalid.repeatable.annotation.retention", abstractC198102, name, c14163, name2));
        }
        AbstractC19810 abstractC198103 = abstractC4308.f13890;
        if (c14163.m16065(abstractC43085.f13890) != null && abstractC198103.m16065(abstractC43085.f13890) == null) {
            C12281 c122814 = C6241.f19132;
            c22364.m7273(c17551, new C12281("compiler", "invalid.repeatable.annotation.not.documented", abstractC198103, c14163));
        }
        AbstractC19810 abstractC198104 = abstractC4308.f13890;
        if (c14163.m16065(abstractC43084.f13890) != null && abstractC198104.m16065(abstractC43084.f13890) == null) {
            C12281 c122815 = C6241.f19132;
            c22364.m7273(c17551, new C12281("compiler", "invalid.repeatable.annotation.not.inherited", abstractC198104, c14163));
        }
        AbstractC19810 abstractC198105 = abstractC4308.f13890;
        C1568 m36101 = m36101(abstractC198105);
        if (m36101 == null) {
            set = m36095();
        } else {
            HashSet hashSet = new HashSet();
            for (AbstractC8624 abstractC8624 : m36101.f5564) {
                if (abstractC8624 instanceof C17090) {
                    hashSet.add(((C17090) abstractC8624).f52397.f17562);
                }
            }
            set = hashSet;
        }
        C1568 m361012 = m36101((AbstractC19810) c14163);
        if (m361012 == null) {
            set2 = m36095();
        } else {
            HashSet hashSet2 = new HashSet();
            for (AbstractC8624 abstractC86242 : m361012.f5564) {
                if (abstractC86242 instanceof C17090) {
                    hashSet2.add(((C17090) abstractC86242).f52397.f17562);
                }
            }
            set2 = hashSet2;
        }
        Iterator it = set.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                c61362 = c6136;
                break;
            }
            AbstractC10370 abstractC10370 = (AbstractC10370) it.next();
            for (AbstractC10370 abstractC103702 : set2) {
                if (abstractC103702 == abstractC10370) {
                    break;
                }
                C6136 c61364 = c6136;
                AbstractC10370 abstractC103703 = c61364.f18781;
                AbstractC10370 abstractC103704 = c61364.f18788;
                if (abstractC103702 == abstractC103703 && abstractC10370 == abstractC103704) {
                    c6136 = c61364;
                } else if (abstractC103702 == c61364.f18785 && (abstractC10370 == abstractC103703 || abstractC10370 == abstractC103704 || abstractC10370 == c61364.f18809)) {
                    c6136 = c61364;
                } else {
                    c6136 = c61364;
                }
            }
            c61362 = c6136;
            C12281 c122816 = C6241.f19132;
            c22364.m7273(c17551, new C12281("compiler", "invalid.repeatable.annotation.incompatible.target", abstractC198105, c14163));
            break loop0;
        }
        AbstractC19810 abstractC198106 = abstractC4308.f13890;
        AbstractC14016 mo16064 = abstractC198106.mo16064();
        mo16064.getClass();
        for (AbstractC5698 abstractC5698 : mo16064.mo20475((Predicate) null, EnumC1317.RECURSIVE)) {
            if (abstractC5698.f17562 != c61362.f18860 && abstractC5698.f17559 == EnumC1296.f4571 && ((C3581) abstractC5698).f11370 == null) {
                C12281 c122817 = C6241.f19132;
                c22364.m7273(c17551, new C12281("compiler", "invalid.repeatable.annotation.elem.nondefault", abstractC198106, abstractC5698));
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private Set m36095() {
        if (this.f46776 == null) {
            AbstractC10370[] m36093 = m36093();
            HashSet hashSet = new HashSet(m36093.length);
            for (AbstractC10370 abstractC10370 : m36093) {
                C11003.requireNonNull(abstractC10370);
                if (!hashSet.add(abstractC10370)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) abstractC10370));
                }
            }
            this.f46776 = C20195.unmodifiableSet(hashSet);
        }
        return this.f46776;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36168(C17551 c17551, final boolean z) {
        C2609 m40509 = this.f46772.m40509(c17551.f53650.f16086.f13890);
        if (m40509 == null) {
            return false;
        }
        return C5378.stream(m40509).anyMatch(new Predicate() { // from class: l.᩸ۗ֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C15240.m36080(C15240.this, z, (AbstractC8624) obj);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36080(C15240 c15240, boolean z, AbstractC8624 abstractC8624) {
        AbstractC10370 abstractC10370 = ((C17090) abstractC8624).f52397.f17562;
        C6136 c6136 = c15240.f46777;
        if (abstractC10370 != c6136.f18785) {
            return z && abstractC10370 == c6136.f18809;
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370[] m36185(AbstractC19810 abstractC19810) {
        C1568 m36101 = m36101(abstractC19810);
        if (m36101 != null) {
            AbstractC8624[] abstractC8624Arr = m36101.f5564;
            AbstractC10370[] abstractC10370Arr = new AbstractC10370[abstractC8624Arr.length];
            for (int i = 0; i < abstractC8624Arr.length; i++) {
                AbstractC8624 abstractC8624 = abstractC8624Arr[i];
                if (!(abstractC8624 instanceof C17090)) {
                    return new AbstractC10370[0];
                }
                abstractC10370Arr[i] = ((C17090) abstractC8624).f52397.f17562;
            }
            return abstractC10370Arr;
        }
        return m36093();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16646 m36114(C17551 c17551, AbstractC5698 abstractC5698) {
        AbstractC10370[] abstractC10370Arr;
        EnumC1296 enumC1296;
        EnumC1296 enumC12962;
        C15240 c15240 = this;
        C1568 m36101 = c15240.m36101(c17551.f53650.f16086.f13890);
        HashSet hashSet = new HashSet();
        int i = 0;
        if (m36101 != null) {
            AbstractC8624[] abstractC8624Arr = m36101.f5564;
            AbstractC10370[] abstractC10370Arr2 = new AbstractC10370[abstractC8624Arr.length];
            for (int i2 = 0; i2 < abstractC8624Arr.length; i2++) {
                AbstractC8624 abstractC8624 = abstractC8624Arr[i2];
                if (!(abstractC8624 instanceof C17090)) {
                    return C16646.empty();
                }
                abstractC10370Arr2[i2] = ((C17090) abstractC8624).f52397.f17562;
            }
            abstractC10370Arr = abstractC10370Arr2;
        } else {
            abstractC10370Arr = m36093();
        }
        int length = abstractC10370Arr.length;
        while (i < length) {
            AbstractC10370 abstractC10370 = abstractC10370Arr[i];
            C6136 c6136 = c15240.f46777;
            AbstractC10370 abstractC103702 = c6136.f18781;
            AbstractC10370 abstractC103703 = c6136.f18809;
            AbstractC10370 abstractC103704 = c6136.f18785;
            AbstractC10370 abstractC103705 = c6136.f18788;
            AbstractC10370 abstractC103706 = c6136.f18822;
            AbstractC10370 abstractC103707 = c6136.f18889;
            AbstractC10370 abstractC103708 = c6136.f18850;
            AbstractC10370 abstractC103709 = c6136.f18885;
            AbstractC10370 abstractC1037010 = c6136.f18789;
            if (abstractC10370 == abstractC103702) {
                if (abstractC5698.f17559 == EnumC1296.f4582) {
                    hashSet.add(abstractC103702);
                }
            } else {
                AbstractC10370 abstractC1037011 = c6136.f18808;
                if (abstractC10370 == abstractC1037011) {
                    if (abstractC5698.f17559 == EnumC1296.f4567 && abstractC5698.f17561.f17559 != EnumC1296.f4571) {
                        hashSet.add(abstractC1037011);
                    }
                } else if (abstractC10370 == abstractC1037010) {
                    if (abstractC5698.mo952() == EnumC23258.RECORD_COMPONENT) {
                        hashSet.add(abstractC1037010);
                    }
                } else if (abstractC10370 == abstractC103709) {
                    if (abstractC5698.f17559 == EnumC1296.f4571 && !abstractC5698.m16075()) {
                        hashSet.add(abstractC103709);
                    }
                } else if (abstractC10370 == abstractC103708) {
                    if (abstractC5698.f17559 == EnumC1296.f4567 && abstractC5698.f17561.f17559 == EnumC1296.f4571 && (abstractC5698.mo16084() & 8589934592L) != 0) {
                        hashSet.add(abstractC103708);
                    }
                } else if (abstractC10370 == abstractC103707) {
                    if (abstractC5698.f17559 == EnumC1296.f4571 && abstractC5698.m16075()) {
                        hashSet.add(abstractC103707);
                    }
                } else if (abstractC10370 == abstractC103706) {
                    if (abstractC5698.f17559 == EnumC1296.f4567 && abstractC5698.f17561.f17559 == EnumC1296.f4571 && (abstractC5698.mo16084() & 8589934592L) == 0) {
                        hashSet.add(abstractC103706);
                    }
                } else if (abstractC10370 == abstractC103705) {
                    if (abstractC5698.f17559 == EnumC1296.f4582 && (abstractC5698.mo16084() & 8192) != 0) {
                        hashSet.add(abstractC103705);
                    }
                } else {
                    AbstractC10370 abstractC1037012 = c6136.f18901;
                    if (abstractC10370 == abstractC1037012) {
                        if (abstractC5698.f17559 == EnumC1296.f4579) {
                            hashSet.add(abstractC1037012);
                        }
                    } else if (abstractC10370 == abstractC103704) {
                        EnumC1296 enumC12963 = abstractC5698.f17559;
                        EnumC1296 enumC12964 = EnumC1296.f4567;
                        if ((enumC12963 != enumC12964 || abstractC5698.f17561.f17559 != EnumC1296.f4571 || !abstractC5698.f17560.m12913(EnumC9454.NONE)) && ((enumC1296 = abstractC5698.f17559) == EnumC1296.f4582 || enumC1296 == enumC12964 || ((enumC1296 == (enumC12962 = EnumC1296.f4571) && !abstractC5698.m16075() && !abstractC5698.f17560.mo12923().m12913(EnumC9454.VOID)) || (abstractC5698.f17559 == enumC12962 && abstractC5698.m16075())))) {
                            hashSet.add(abstractC103704);
                        }
                    } else if (abstractC10370 == abstractC103703) {
                        if (abstractC5698.f17559 == EnumC1296.f4582 && abstractC5698.f17560.m12913(EnumC9454.TYPEVAR)) {
                            hashSet.add(abstractC103703);
                        }
                    } else {
                        AbstractC10370 abstractC1037013 = c6136.f18804;
                        if (abstractC10370 == abstractC1037013) {
                            if (abstractC5698.f17559 == EnumC1296.f4568) {
                                hashSet.add(abstractC1037013);
                            }
                        } else {
                            return C16646.empty();
                        }
                    }
                }
            }
            i++;
            c15240 = this;
        }
        return C16646.of(hashSet);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1568 m36101(AbstractC19810 abstractC19810) {
        C16384 mo36583 = abstractC19810.mo33816().mo36583();
        if (mo36583 == null) {
            return null;
        }
        AbstractC8624 m38580 = mo36583.m38580(this.f46777.f18860);
        if (m38580 instanceof C1568) {
            return (C1568) m38580;
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private AbstractC10370[] m36093() {
        if (this.f46769 == null) {
            ArrayList arrayList = new ArrayList();
            C6136 c6136 = this.f46777;
            arrayList.add(c6136.f18901);
            arrayList.add(c6136.f18781);
            arrayList.add(c6136.f18808);
            arrayList.add(c6136.f18885);
            arrayList.add(c6136.f18889);
            arrayList.add(c6136.f18788);
            arrayList.add(c6136.f18822);
            arrayList.add(c6136.f18850);
            if (this.f46771) {
                arrayList.add(c6136.f18789);
            }
            if (this.f46758) {
                arrayList.add(c6136.f18804);
            }
            this.f46769 = (AbstractC10370[]) arrayList.toArray(new AbstractC10370[0]);
        }
        return this.f46769;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36167(C17551 c17551) {
        C22364 c22364 = this.f46757;
        C8253 c8253 = new C8253(c22364);
        try {
            return m36087(c17551);
        } finally {
            c22364.m50112(c8253);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0144 A[RETURN] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m36087(l.C17551 r13) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15240.m36087(l.ܿ᩵۠):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36144(AbstractC5698 abstractC5698, AbstractC5144 abstractC5144) {
        C4824 c4824 = this.f46756;
        EnumC20347 enumC20347 = EnumC20347.DEP_ANN;
        boolean m14055 = c4824.m14055(enumC20347);
        C22364 c22364 = this.f46757;
        C20661 c20661 = this.f46770;
        if (m14055 && abstractC5698.m16102() && (abstractC5698.mo16084() & 131072) != 0 && !c20661.f66448.mo12948() && abstractC5698.m16065(c20661.f66448.f13890) == null) {
            c22364.m7286(enumC20347, abstractC5144, C14001.f42345);
        }
        C4824 c48242 = this.f46756;
        EnumC20347 enumC203472 = EnumC20347.DEPRECATION;
        if (!c48242.m14055(enumC203472) || abstractC5698.m16102() || c20661.f66448.mo12948() || abstractC5698.m16065(c20661.f66448.f13890) == null) {
            return;
        }
        EnumC8352 m49076 = C21758.m49076(abstractC5698);
        C11076 c11076 = C14001.f42334;
        c22364.m7286(enumC203472, abstractC5144, new C11076("compiler", "deprecated.annotation.has.no.effect", m49076));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36062(C15240 c15240, Supplier supplier, AbstractC5698 abstractC5698) {
        InterfaceC3109 interfaceC3109 = (InterfaceC3109) supplier.get();
        C4725 c4725 = c15240.f46785;
        C4725 c47252 = c15240.f46762;
        if ((abstractC5698.f17563 & 36028797018963968L) != 0) {
            if (c15240.f46756.m14056(EnumC20347.REMOVAL)) {
                return;
            }
            if (abstractC5698.f17559 == EnumC1296.f4568) {
                C11076 c11076 = C14001.f42334;
                c47252.m13840(interfaceC3109, new C11076("compiler", "has.been.deprecated.for.removal.module", abstractC5698));
                return;
            } else {
                AbstractC5698 m16072 = abstractC5698.m16072();
                C11076 c110762 = C14001.f42334;
                c47252.m13840(interfaceC3109, new C11076("compiler", "has.been.deprecated.for.removal", abstractC5698, m16072));
                return;
            }
        }
        if (c15240.f46756.m14056(EnumC20347.DEPRECATION)) {
            return;
        }
        if (abstractC5698.f17559 == EnumC1296.f4568) {
            C11076 c110763 = C14001.f42334;
            c4725.m13840(interfaceC3109, new C11076("compiler", "has.been.deprecated.module", abstractC5698));
        } else {
            AbstractC5698 m160722 = abstractC5698.m16072();
            C11076 c110764 = C14001.f42334;
            c4725.m13840(interfaceC3109, new C11076("compiler", "has.been.deprecated", abstractC5698, m160722));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36192(final AbstractC5698 abstractC5698, final AbstractC5144 abstractC5144) {
        if ((abstractC5698.mo16084() & 274877906944L) != 0) {
            this.f46765.m42473(new InterfaceC16818() { // from class: l.ܿ۬֨
                @Override // l.InterfaceC16818
                /* renamed from: ֫ */
                public final void mo6082() {
                    C15240.m36064(C15240.this, abstractC5144, abstractC5698);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36064(C15240 c15240, InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698) {
        C22364 c22364 = c15240.f46757;
        C11076 c11076 = C14001.f42334;
        c22364.m7272(interfaceC3109, new C11076("compiler", "sun.proprietary", abstractC5698));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36180(AbstractC5698 abstractC5698, AbstractC5144 abstractC5144) {
        EnumC5973 enumC5973 = EnumC5973.f18321;
        EnumC5973 enumC59732 = this.f46784;
        if (enumC59732 == enumC5973 || (abstractC5698.mo16084() & 35184372088832L) == 0) {
            return;
        }
        C12281 c12281 = C6241.f19132;
        this.f46757.m7273(abstractC5144, new C12281("compiler", "not.in.profile", abstractC5698, enumC59732));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36127(final InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, final AbstractC5698 abstractC56982) {
        long mo16084 = abstractC56982.mo16084() & 72057594037927936L;
        C23168 c23168 = this.f46787;
        if (mo16084 != 0 && abstractC56982.m16089().f24147 != abstractC5698.m16089().f24147) {
            long mo160842 = abstractC56982.mo16084() & 288230376151711744L;
            C18230 c18230 = this.f46765;
            if (mo160842 == 0) {
                if (!c23168.m51347()) {
                    C12281 c12281 = C6241.f19132;
                    this.f46757.m7273(interfaceC3109, new C12281("compiler", "is.preview", abstractC56982));
                } else {
                    c23168.m51349();
                    c18230.m42473(new InterfaceC16818() { // from class: l.֫۬֨
                        @Override // l.InterfaceC16818
                        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
                        public final void mo6082() {
                            C11076 c11076 = C14001.f42334;
                            C15240.this.m36130(interfaceC3109, new C11076("compiler", "is.preview", abstractC56982));
                        }
                    });
                }
            } else {
                c18230.m42473(new InterfaceC16818() { // from class: l.ۧ۬֨
                    @Override // l.InterfaceC16818
                    /* renamed from: ֫ */
                    public final void mo6082() {
                        C11076 c11076 = C14001.f42334;
                        C15240.this.m36130(interfaceC3109, new C11076("compiler", "is.preview.reflective", abstractC56982));
                    }
                });
            }
        }
        c23168.getClass();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36149(C8526 c8526, AbstractC4308 abstractC4308) {
        int i = C2542.f8066[abstractC4308.mo3258().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            m36149(c8526, this.f46788.m17515(abstractC4308));
            return;
        }
        if ((abstractC4308.f13890.mo16084() & 8192) != 0) {
            AbstractC19810 abstractC19810 = abstractC4308.f13890;
            long j = abstractC19810.f17563;
            if ((j & 34359738368L) != 0) {
                return;
            }
            if ((j & 134217728) != 0) {
                C12281 c12281 = C6241.f19132;
                this.f46757.m7273(c8526, new C12281("compiler", "cyclic.annotation.element", abstractC19810));
                return;
            }
            long j2 = j | 134217728;
            try {
                abstractC19810.f17563 = j2;
                for (AbstractC5698 abstractC5698 : abstractC19810.mo16064().mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
                    if (abstractC5698.f17559 == EnumC1296.f4571) {
                        m36149(c8526, ((C3581) abstractC5698).f17560.mo12923());
                    }
                }
            } finally {
                abstractC19810.f17563 = (abstractC19810.f17563 & (-134217729)) | 34359738368L;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36141(C5557 c5557) {
        HashMap hashMap = new HashMap();
        for (C2609 c2609 = c5557.f17179; c2609.m8249(); c2609 = c2609.f8241) {
            C15580 m19466 = C7260.m19466((AbstractC5144) c2609.f8240);
            if (m19466 != null) {
                C8526 c8526 = (C8526) c2609.f8240;
                if (C7260.m19462(m19466.f48011) == this.f46777.f18886) {
                    hashMap.put(c8526.f26045, C7260.m19472(m19466.f48011));
                } else {
                    c8526.f26045.f17563 |= 1073741824;
                }
            }
        }
        for (AbstractC5698 abstractC5698 : (AbstractC5698[]) hashMap.keySet().toArray(new AbstractC5698[0])) {
            m36059(c5557, abstractC5698, hashMap);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36059(C5557 c5557, AbstractC5698 abstractC5698, HashMap hashMap) {
        if (abstractC5698 != null) {
            long j = abstractC5698.f17563;
            if ((j & 1073741824) == 0) {
                if ((j & 134217728) != 0) {
                    this.f46757.m7273(C7260.m19439(abstractC5698, c5557, false), C6241.f19263);
                } else {
                    abstractC5698.f17563 = j | 134217728;
                    m36059(c5557, (AbstractC5698) hashMap.remove(abstractC5698), hashMap);
                    abstractC5698.f17563 &= -134217729;
                }
                abstractC5698.f17563 |= 1073741824;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36125(final InterfaceC3109 interfaceC3109, C0758 c0758, AbstractC4308 abstractC4308) {
        if (abstractC4308.mo12915() != null && abstractC4308.mo3258().m24299(EnumC9454.LONG) && ((Number) abstractC4308.mo12915()).longValue() == 0) {
            int i = c0758.f2814;
            if (i == 108 || i == 112 || i == 109 || i == 113) {
                this.f46765.m42473(new InterfaceC16818() { // from class: l.۟ۗ֨
                    @Override // l.InterfaceC16818
                    /* renamed from: ֫ */
                    public final void mo6082() {
                        C15240.m36063(C15240.this, interfaceC3109);
                    }
                });
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36118(C1470 c1470) {
        if (c1470.f5226.m14709(EnumC18550.f57540) && c1470.f5227 == null) {
            C4824 c4824 = this.f46756;
            EnumC20347 enumC20347 = EnumC20347.EMPTY;
            if (c4824.m14055(enumC20347)) {
                AbstractC11349 abstractC11349 = c1470.f5226;
                abstractC11349.getClass();
                this.f46757.m7286(enumC20347, abstractC11349, C14001.f42343);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36162(InterfaceC3109 interfaceC3109, AbstractC5698 abstractC5698, AbstractC14016 abstractC14016) {
        EnumC1296 enumC1296;
        if (!abstractC5698.f17560.mo12948()) {
            AbstractC10370 abstractC10370 = abstractC5698.f17561.f17562;
            C6136 c6136 = this.f46777;
            if (abstractC10370 != c6136.f18848) {
                for (AbstractC5698 abstractC56982 : abstractC14016.mo20477(abstractC5698.f17562, null, EnumC1317.NON_RECURSIVE)) {
                    if (abstractC5698 != abstractC56982 && (abstractC56982.mo16084() & 4398046511104L) == 0 && (enumC1296 = abstractC5698.f17559) == abstractC56982.f17559 && abstractC5698.f17562 != c6136.f18855) {
                        EnumC1296 enumC12962 = EnumC1296.f4571;
                        C6319 c6319 = this.f46788;
                        if (enumC1296 != enumC12962 || c6319.m17506(abstractC5698.f17560, abstractC56982.f17560, true) || c6319.m17506(c6319.m17519(abstractC5698.f17560), c6319.m17519(abstractC56982.f17560), true)) {
                            long mo16084 = abstractC5698.mo16084() & 17179869184L;
                            long mo160842 = abstractC56982.mo16084() & 17179869184L;
                            C22364 c22364 = this.f46757;
                            if (mo16084 != mo160842) {
                                abstractC5698.f17563 = 4398046511104L | abstractC5698.f17563;
                                if (!abstractC5698.f17560.mo12948() && !abstractC56982.f17560.mo12948()) {
                                    AbstractC5698 m16072 = abstractC56982.m16072();
                                    C12281 c12281 = C6241.f19132;
                                    c22364.m7273(interfaceC3109, new C12281("compiler", "array.and.varargs", abstractC5698, abstractC56982, m16072));
                                    return true;
                                }
                            } else {
                                if (abstractC5698.f17559 == enumC12962 && !c6319.m17506(abstractC5698.f17560, abstractC56982.f17560, false)) {
                                    if (!abstractC5698.f17560.mo12948() && !abstractC56982.f17560.mo12948()) {
                                        C12281 c122812 = C6241.f19132;
                                        c22364.m7273(interfaceC3109, new C12281("compiler", "name.clash.same.erasure", abstractC5698, abstractC56982));
                                    }
                                    abstractC5698.f17563 |= 4398046511104L;
                                    return true;
                                }
                                if ((abstractC5698.mo16084() & 576460752303423488L) != 0 && (abstractC56982.mo16084() & 576460752303423488L) != 0 && (abstractC56982.mo16084() & 1152921504606846976L) == 0) {
                                    if (!abstractC5698.f17560.mo12948()) {
                                        c22364.m7273(interfaceC3109, C6241.f19226);
                                        abstractC5698.f17563 |= 4398046511104L;
                                    }
                                } else {
                                    m36126(interfaceC3109, abstractC56982);
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36189(C1323 c1323) {
        C10643 c10643;
        AbstractC7667 abstractC7667;
        AbstractC14016 m33607 = AbstractC14016.m33607(c1323.f4746);
        AbstractC14016 m336072 = AbstractC14016.m33607(c1323.f4746);
        AbstractC7667 abstractC76672 = c1323.f4737;
        Iterator it = c1323.f4738.iterator();
        while (it.hasNext()) {
            AbstractC5144 abstractC5144 = (AbstractC5144) it.next();
            if (abstractC5144.m14709(EnumC18550.f57491) && (abstractC7667 = (c10643 = (C10643) abstractC5144).f32019) != null) {
                for (AbstractC5698 abstractC5698 : abstractC7667.mo20475(new C22010(), EnumC1317.RECURSIVE)) {
                    if (c10643.f32020) {
                        m36060(c10643, m33607, m336072, abstractC76672, abstractC5698, true);
                        m336072.mo26382(abstractC5698);
                    } else {
                        m36060(c10643, m33607, m336072, abstractC76672, abstractC5698, false);
                        m33607.mo26382(abstractC5698);
                    }
                }
                c10643.f32019 = null;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36060(C10643 c10643, AbstractC7667 abstractC7667, AbstractC7667 abstractC76672, AbstractC7667 abstractC76673, AbstractC5698 abstractC5698, boolean z) {
        C13961 c13961 = new C13961(1, abstractC5698);
        AbstractC5698 mo20478 = abstractC7667.mo20478(abstractC5698.f17562, c13961);
        AbstractC5698 mo204782 = (mo20478 != null || z) ? null : abstractC76672.mo20478(abstractC5698.f17562, c13961);
        C22364 c22364 = this.f46757;
        if (mo20478 == null && mo204782 == null) {
            AbstractC5698 mo204783 = abstractC76673.mo20478(abstractC5698.f17562, c13961);
            if (mo204783 != null) {
                C12281 c12281 = C6241.f19132;
                c22364.m7273(c10643, new C12281("compiler", "already.defined.this.unit", mo204783));
                return;
            }
            return;
        }
        if (mo20478 != null) {
            C12281 c122812 = C6241.f19132;
            c22364.m7273(c10643, new C12281("compiler", "already.defined.single.import", mo20478));
        } else {
            C12281 c122813 = C6241.f19132;
            c22364.m7273(c10643, new C12281("compiler", "already.defined.static.single.import", mo204782));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36134(AbstractC5144 abstractC5144) {
        AbstractC5144 abstractC51442 = abstractC5144;
        while (abstractC51442.m14709(EnumC18550.f57581)) {
            C6262 c6262 = (C6262) abstractC51442;
            if (c6262.f19396.f17561.mo16076() != C7260.m19472(c6262.f19397).mo16076()) {
                abstractC5144.getClass();
                AbstractC5698 m19472 = C7260.m19472(abstractC5144);
                C12281 c12281 = C6241.f19132;
                this.f46757.m7273(abstractC5144, new C12281("compiler", "import.requires.canonical", m19472));
                return;
            }
            abstractC51442 = c6262.f19397;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36136(AbstractC5144 abstractC5144, C1755 c1755, C14163 c14163) {
        if (this.f46756.m14055(EnumC20347.AUXILIARYCLASS)) {
            c14163.mo16101();
            if ((c14163.f17563 & 17592186044416L) == 0 || !this.f46760.m50330(c1755, (AbstractC19810) c14163, false) || this.f46761.mo1712(c14163.f42770, c1755.f6075.f4745)) {
                return;
            }
            InterfaceC18278 interfaceC18278 = c14163.f42770;
            C11076 c11076 = C14001.f42334;
            this.f46757.m7285(abstractC5144, new C11076("compiler", "auxiliary.class.accessed.from.outside.of.its.source.file", c14163, interfaceC18278));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36182(final C14163 c14163, final InterfaceC3109 interfaceC3109) {
        if (this.f46756.m14055(EnumC20347.MISSING_EXPLICIT_CTOR)) {
            c14163.mo16101();
            if ((c14163.f17563 & 2305843009213710336L) != 0 || c14163.f17562.isEmpty()) {
                return;
            }
            c14163.mo16101();
            if ((c14163.f17563 & 5) == 0 || !EnumC10637.f32009.m26686(this.f46774)) {
                return;
            }
            int i = C2542.f8063[c14163.m33812().ordinal()];
            if (i == 1 || i == 2) {
                return;
            }
            if (i == 4) {
                for (AbstractC5698 abstractC5698 = c14163.f17561; abstractC5698 != null && abstractC5698.f17559 == EnumC1296.f4582; abstractC5698 = abstractC5698.f17561) {
                    if ((abstractC5698.mo16084() & 5) == 0) {
                        return;
                    }
                }
            }
            final C7814 m16089 = c14163.m16089();
            if (m16089.m20880()) {
                return;
            }
            final C0052 c0052 = m16089.f24147;
            Iterator it = c0052.f921.iterator();
            while (it.hasNext()) {
                C17524 c17524 = (C17524) it.next();
                if (c17524.f53523.equals(m16089)) {
                    C2609 c2609 = c17524.f53522;
                    if (c2609 != null && !c2609.isEmpty()) {
                        return;
                    }
                    this.f46765.m42473(new InterfaceC16818() { // from class: l.ܰۗ֨
                        @Override // l.InterfaceC16818
                        /* renamed from: ֫ */
                        public final void mo6082() {
                            C15240.m36066(C15240.this, interfaceC3109, c14163, m16089, c0052);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36066(C15240 c15240, InterfaceC3109 interfaceC3109, C14163 c14163, C7814 c7814, C0052 c0052) {
        C4824 c4824 = c15240.f46756;
        EnumC20347 enumC20347 = EnumC20347.MISSING_EXPLICIT_CTOR;
        if (c4824.m14055(enumC20347)) {
            C22364 c22364 = c15240.f46757;
            C11076 c11076 = C14001.f42334;
            c22364.m7286(enumC20347, interfaceC3109, new C11076("compiler", "missing-explicit-ctor", c14163, c7814, c0052));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m36105(InterfaceC3109 interfaceC3109, AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        C19476 c19476 = new C19476(this, interfaceC3109, "unchecked.cast.to.type", abstractC4308, abstractC43082);
        C6319 c6319 = this.f46788;
        if (c6319.m17545(abstractC4308, abstractC43082, c19476)) {
            return abstractC43082;
        }
        ((C23708) this.f46781).mo1084(interfaceC3109, this.f46768.m16617(C11886.m29011(abstractC4308, abstractC43082)));
        return c6319.m17535(abstractC4308);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36142(C5557 c5557, C14163 c14163) {
        C20661 c20661 = this.f46770;
        if (c14163.m16065(c20661.f66467.f13890) != null) {
            try {
                this.f46788.m17493((AbstractC19810) c14163);
            } catch (C6130 e) {
                c5557.getClass();
                Iterator it = c5557.f17181.f7168.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C17551 c17551 = (C17551) it.next();
                    if (c17551.f53650.f16086.f13890 == c20661.f66467.f13890) {
                        c5557 = c17551;
                        break;
                    }
                }
                C16719 m17050 = e.m17050();
                C12281 c12281 = C6241.f19132;
                this.f46757.m7273(c5557, new C12281("compiler", "bad.functional.intf.anno.1", m17050));
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36176(C1323 c1323) {
        AbstractC5698 m19472;
        Iterator it = c1323.m4617().iterator();
        while (it.hasNext()) {
            C10643 c10643 = (C10643) it.next();
            if (c10643.f32020 && c10643.f32021.m14709(EnumC18550.f57581)) {
                C6262 c6262 = (C6262) c10643.f32021;
                if (c6262.f19395 != this.f46777.f18835 && (m19472 = C7260.m19472(c6262.f19397)) != null && m19472.f17559 == EnumC1296.f4582) {
                    AbstractC19810 abstractC19810 = (AbstractC19810) C7260.m19472(c6262.f19397);
                    if (!m36081(abstractC19810, abstractC19810, c1323.f4746, c6262.f19395, new HashSet())) {
                        AbstractC10370 abstractC10370 = c6262.f19395;
                        EnumC8352 m49076 = C21758.m49076(abstractC19810);
                        C11576 c11576 = C11886.f35440;
                        C11576 c115762 = new C11576("compiler", "location", m49076, abstractC19810, null);
                        C12281 c12281 = C6241.f19132;
                        this.f46757.m7273(c10643, new C12281("compiler", "cant.resolve.location", EnumC8352.STATIC, abstractC10370, null, null, c115762));
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36117(C1323 c1323) {
        Iterator it = c1323.m4617().iterator();
        while (it.hasNext()) {
            C10643 c10643 = (C10643) it.next();
            if (!c10643.f32020 && C7260.m19462(c10643.f32021) == this.f46777.f18835) {
                AbstractC19810 abstractC19810 = ((C6262) c10643.f32021).f19397.f16086.f13890;
                if (abstractC19810.f17559 == EnumC1296.f4579 && abstractC19810.mo16064().m20480() && (!EnumC10637.f32003.m26686(this.f46774) || !abstractC19810.mo15574())) {
                    EnumC20043 enumC20043 = EnumC20043.RESOLVE_ERROR;
                    int i = c10643.f16085;
                    C12281 c12281 = C6241.f19132;
                    this.f46757.m7279(enumC20043, i, new C12281("compiler", "doesnt.exist", abstractC19810));
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m36081(AbstractC19810 abstractC19810, AbstractC19810 abstractC198102, C7814 c7814, AbstractC10370 abstractC10370, HashSet hashSet) {
        if (abstractC19810 == null || !hashSet.add(abstractC19810)) {
            return false;
        }
        AbstractC4308 abstractC4308 = abstractC19810.f17560;
        C6319 c6319 = this.f46788;
        if (m36081(c6319.m17562(abstractC4308).f13890, abstractC198102, c7814, abstractC10370, hashSet)) {
            return true;
        }
        Iterator it = c6319.m17510(abstractC19810.f17560).iterator();
        while (it.hasNext()) {
            if (m36081(((AbstractC4308) it.next()).f13890, abstractC198102, c7814, abstractC10370, hashSet)) {
                return true;
            }
        }
        for (AbstractC5698 abstractC5698 : abstractC19810.mo16064().m20476(abstractC10370)) {
            if (abstractC5698.mo15572() && m36075(abstractC5698, c7814) && abstractC5698.m16067(abstractC198102, c6319)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36075(AbstractC5698 abstractC5698, C7814 c7814) {
        try {
            int mo16084 = (int) (abstractC5698.mo16084() & 7);
            if (mo16084 != 0) {
                if (mo16084 == 2) {
                    return false;
                }
                if (mo16084 != 4) {
                    return true;
                }
            }
            return abstractC5698.m16089() == c7814;
        } catch (C21325 e) {
            throw e;
        } catch (C20515 unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36119(C1755 c1755, C5557 c5557) {
        C17524 m36055;
        C1323 c1323 = c1755.f6075;
        C0052 c0052 = c1323.f4739;
        C20661 c20661 = this.f46770;
        if (c0052 == c20661.f66447 || c0052 == c20661.f66465) {
            return;
        }
        C14163 c14163 = c5557.f17186;
        c14163.mo16101();
        if ((c14163.f17563 & 16777216) == 0 && (m36055 = m36055(c1323.f4746)) != null && m36055.f53522 == null) {
            new C15946(this, c1755, c5557, c1323).mo1215(c5557);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17524 m36055(C7814 c7814) {
        Iterator it = c7814.f24147.f921.iterator();
        while (it.hasNext()) {
            C17524 c17524 = (C17524) it.next();
            if (c17524.f53523 == c7814) {
                return c17524;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m36074(AbstractC5698 abstractC5698) {
        while (abstractC5698.f17559 != EnumC1296.f4579) {
            if ((abstractC5698.mo16084() & 1) == 0 && (abstractC5698.mo16084() & 4) == 0) {
                return false;
            }
            abstractC5698 = abstractC5698.f17561;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36071(C15240 c15240, AbstractC12612 abstractC12612, AbstractC5698 abstractC5698, C7814 c7814, boolean z) {
        C2609 c2609;
        C22364 c22364 = c15240.f46757;
        if (!m36074(abstractC5698) && !z) {
            EnumC20347 enumC20347 = EnumC20347.EXPORTS;
            EnumC8352 m49076 = C21758.m49076(abstractC5698);
            C0052 c0052 = abstractC5698.m16089().f24147;
            C11076 c11076 = C14001.f42334;
            c22364.m7286(enumC20347, abstractC12612, new C11076("compiler", "leaks.not.accessible", m49076, abstractC5698, c0052));
            return;
        }
        C7814 m16089 = abstractC5698.m16089();
        C17524 m36055 = m36055(m16089);
        C17524 m360552 = m36055(c7814);
        if (m36055 == null) {
            EnumC20347 enumC203472 = EnumC20347.EXPORTS;
            EnumC8352 m490762 = C21758.m49076(abstractC5698);
            C0052 c00522 = abstractC5698.m16089().f24147;
            C11076 c110762 = C14001.f42334;
            c22364.m7286(enumC203472, abstractC12612, new C11076("compiler", "leaks.not.accessible.unexported", m490762, abstractC5698, c00522));
            return;
        }
        C2609 c26092 = m36055.f53522;
        if (c26092 != null && ((c2609 = m360552.f53522) == null || !c26092.containsAll(c2609))) {
            EnumC20347 enumC203473 = EnumC20347.EXPORTS;
            EnumC8352 m490763 = C21758.m49076(abstractC5698);
            C0052 c00523 = abstractC5698.m16089().f24147;
            C11076 c110763 = C14001.f42334;
            c22364.m7286(enumC203473, abstractC12612, new C11076("compiler", "leaks.not.accessible.unexported.qualified", m490763, abstractC5698, c00523));
        }
        C0052 c00524 = m16089.f24147;
        C0052 c00525 = c7814.f24147;
        if (c00524 == c00525 || c00524 == c15240.f46770.f66509) {
            return;
        }
        C2609 of = C2609.of((Object) c00525);
        while (of.m8249()) {
            C0052 c00526 = (C0052) of.f8240;
            of = of.f8241;
            if (c00526 == m16089.f24147) {
                return;
            }
            if ((c00526.f17563 & 4503599627370496L) == 0) {
                Iterator it = c00526.f929.iterator();
                while (it.hasNext()) {
                    C9764 c9764 = (C9764) it.next();
                    if (c9764.f29540.contains(EnumC9058.TRANSITIVE)) {
                        of = of.m8246(c9764.f29541);
                    }
                }
            }
        }
        EnumC20347 enumC203474 = EnumC20347.EXPORTS;
        EnumC8352 m490764 = C21758.m49076(abstractC5698);
        C0052 c00527 = abstractC5698.m16089().f24147;
        C11076 c110764 = C14001.f42334;
        c22364.m7286(enumC203474, abstractC12612, new C11076("compiler", "leaks.not.accessible.not.required.transitive", m490764, abstractC5698, c00527));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36153(final AbstractC12612 abstractC12612, final C0052 c0052) {
        if (c0052.f17559 != EnumC1296.f4568) {
            this.f46765.m42473(new InterfaceC16818() { // from class: l.ۨۗ֨
                @Override // l.InterfaceC16818
                /* renamed from: ֫ */
                public final void mo6082() {
                    C15240.m36070(C15240.this, abstractC12612, c0052);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36070(C15240 c15240, AbstractC12612 abstractC12612, C0052 c0052) {
        C4824 c4824 = c15240.f46756;
        EnumC20347 enumC20347 = EnumC20347.MODULE;
        if (c4824.m14055(enumC20347)) {
            C22364 c22364 = c15240.f46757;
            C11076 c11076 = C14001.f42334;
            c22364.m7286(enumC20347, abstractC12612, new C11076("compiler", "module.not.found", c0052));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36065(C15240 c15240, InterfaceC3109 interfaceC3109, C7814 c7814) {
        if (c15240.f46756.m14055(EnumC20347.OPENS)) {
            C22364 c22364 = c15240.f46757;
            C11076 c11076 = C14001.f42334;
            c22364.m7285(interfaceC3109, new C11076("compiler", "package.empty.or.not.found", c7814));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36129(final InterfaceC3109 interfaceC3109, final C9764 c9764) {
        if ((c9764.f29541.f17563 & 4503599627370496L) != 0) {
            this.f46765.m42473(new InterfaceC16818() { // from class: l.ۤۗ֨
                @Override // l.InterfaceC16818
                /* renamed from: ֫ */
                public final void mo6082() {
                    C15240.m36069(C15240.this, c9764, interfaceC3109);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36069(C15240 c15240, C9764 c9764, InterfaceC3109 interfaceC3109) {
        C22364 c22364 = c15240.f46757;
        if (c9764.f29540.contains(EnumC9058.TRANSITIVE) && c15240.f46756.m14055(EnumC20347.REQUIRES_TRANSITIVE_AUTOMATIC)) {
            c22364.m7285(interfaceC3109, C14001.f42339);
        } else if (c15240.f46756.m14055(EnumC20347.REQUIRES_AUTOMATIC)) {
            c22364.m7285(interfaceC3109, C14001.f42333);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36121(C2609 c2609) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (c2609.m8249()) {
            C18963 c18963 = (C18963) c2609.f8240;
            Iterator it = c18963.f59815.iterator();
            while (it.hasNext()) {
                AbstractC19669 abstractC19669 = (AbstractC19669) it.next();
                boolean mo30871 = abstractC19669.mo30871();
                C22364 c22364 = this.f46757;
                if (mo30871) {
                    if (C7260.m19429((AbstractC12612) abstractC19669)) {
                        if (z4 && !z5 && !z6) {
                            c22364.m7273(abstractC19669, C6241.f19128);
                        }
                        z3 = true;
                    } else {
                        if (z4 && !z6) {
                            c22364.m7273(abstractC19669, C6241.f19128);
                        }
                        z = true;
                    }
                } else if (abstractC19669.m14709(EnumC18550.f57516)) {
                    if (z4 && !z6) {
                        c22364.m7273(abstractC19669, C6241.f19128);
                    }
                    z2 = true;
                } else {
                    z5 = abstractC19669.m14709(EnumC18550.f57504);
                    if (z4 || z || z2 || (z3 && (!z5 || z6))) {
                        c22364.m7273(abstractC19669, C6241.f19182);
                    }
                    z4 = true;
                }
            }
            boolean z7 = c18963.f59817 == EnumC6652.STATEMENT ? c18963.f59816 : false;
            if (c18963.f59814.m8249()) {
                z4 &= z7;
                z5 &= z7;
                z2 = false;
                z3 &= z7;
                z = false;
            }
            z6 = c18963.f59814.m8249() && z7;
            c2609 = c2609.f8241;
        }
    }
}
