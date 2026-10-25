package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;
import net.engio.mbassy.listener.MessageHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: 17QI */
/* renamed from: l.ۘۧۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3894 extends C18461 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C5210 f12455;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C13839 f12456;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC6079 f12457;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13675 f12459;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5210 f12460;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5210 f12462;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f12463;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C5210 f12464;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f12458 = new HashSet();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f12461 = new ArrayDeque(AbstractC14545.of((Object) Boolean.FALSE));

    public C3894(C13675 c13675, int i) {
        this.f12459 = c13675;
        this.f12463 = i;
        C5210.m14988(-2, i);
        this.f12462 = C5210.m14988(-4, i);
        this.f12464 = C5210.m14988(2, i);
        this.f12460 = C5210.m14988(4, i);
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11779(C0058 c0058, Object obj) {
        m11762("opens", "to", c0058.f946, c0058.f947);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11780(C0617 c0617, Object obj) {
        throw new IllegalStateException("expected manual descent into catch trees");
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11781(C1323 c1323, Object obj) {
        boolean z;
        C2609 m8239;
        AbstractC12612 m4615 = c1323.m4615();
        C13675 c13675 = this.f12459;
        if (m4615 != null) {
            m11855();
            AbstractC12612 m46152 = c1323.m4615();
            C7820 m4619 = c1323.m4619();
            if (m4619 == null) {
                m8239 = C2609.m8239();
            } else {
                m8239 = m4619.f24198;
            }
            if (!m8239.isEmpty()) {
                Iterator it = m8239.iterator();
                while (it.hasNext()) {
                    InterfaceC22900 interfaceC22900 = (InterfaceC22900) it.next();
                    c13675.m32914();
                    m11845((InterfaceC13206) interfaceC22900);
                }
                c13675.m32914();
            }
            c13675.m32896(this.f12460);
            m11836("package");
            c13675.m32907();
            m11777(m46152);
            c13675.m32906();
            m11836(l.b);
            c13675.m32914();
            z = true;
        } else {
            z = false;
        }
        m11852();
        if (!c1323.m4617().isEmpty()) {
            if (z) {
                c13675.m32898(AbstractC22848.f73736);
            }
            Iterator it2 = c1323.m4617().iterator();
            while (it2.hasNext()) {
                InterfaceC10180 interfaceC10180 = (InterfaceC10180) it2.next();
                m11855();
                c13675.m32898(AbstractC22848.f73735);
                m11845(interfaceC10180);
                c13675.m32914();
            }
            z = true;
        }
        m11852();
        Iterator it3 = c1323.m4618().iterator();
        while (it3.hasNext()) {
            InterfaceC13206 interfaceC13206 = (InterfaceC13206) it3.next();
            if (interfaceC13206.mo987() != EnumC3329.IMPORT) {
                if (z) {
                    c13675.m32898(AbstractC22848.f73736);
                }
                m11855();
                m11845(interfaceC13206);
                c13675.m32914();
                m11852();
                z = true;
            }
        }
        C3587 m4616 = c1323.m4616();
        if (m4616 != null) {
            if (z) {
                c13675.m32898(AbstractC22848.f73736);
            }
            m11855();
            m11851((InterfaceC20969) m4616);
            c13675.m32914();
        }
        m11855();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [l.۫ۡ֨] */
    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11782(C1470 c1470, Object obj) {
        m11854(c1470);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C1470 c14702 = c1470;
        while (true) {
            arrayList.add(c14702.mo5022());
            arrayList2.add(c14702.mo5023());
            if (c14702.mo5021() == null || c14702.mo5021().mo987() != EnumC3329.IF) {
                break;
            }
            c14702 = (InterfaceC12296) c14702.mo5021();
        }
        C5210 c5210 = f12455;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < size) {
            if (z) {
                if (z2) {
                    c13675.m32907();
                } else {
                    c13675.m32914();
                }
                m11836("else");
                c13675.m32907();
            }
            m11836("if");
            c13675.m32907();
            m11836(MotionUtils.EASING_TYPE_FORMAT_START);
            m11845((InterfaceC13206) ((InterfaceC19558) ((InterfaceC20058) arrayList.get(i))).getExpression());
            m11836(MotionUtils.EASING_TYPE_FORMAT_END);
            z = true;
            m11767((InterfaceC15322) arrayList2.get(i), EnumC6716.m18276(size == 1 && c14702.mo5021() == null), EnumC1777.YES, EnumC10950.m27271(i < size + (-1) || c14702.mo5021() != null));
            z2 = ((InterfaceC15322) arrayList2.get(i)).mo987() == EnumC3329.BLOCK;
            i++;
        }
        if (c14702.mo5021() != null) {
            if (z2) {
                c13675.m32907();
            } else {
                c13675.m32914();
            }
            m11836("else");
            m11767(c14702.mo5021(), EnumC6716.NO, EnumC1777.YES, EnumC10950.NO);
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11783(C1616 c1616, Object obj) {
        m11854(c1616);
        m11836("throw");
        this.f12459.m32907();
        m11845((InterfaceC13206) c1616.f5680);
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11784(C2176 c2176, Object obj) {
        throw new IllegalStateException("expected manual descent into modifiers");
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11785(C2322 c2322, Object obj) {
        m11854(c2322);
        m11836("yield");
        this.f12459.m32907();
        m11845((InterfaceC13206) c2322.f7456);
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11786(C2735 c2735, Object obj) {
        m11848((InterfaceC17235) c2735, EnumC6716.NO, EnumC1777.NO, EnumC10950.NO);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11787(C2882 c2882, Object obj) {
        m11854((InterfaceC13206) c2882);
        int[] iArr = C7153.f21955;
        EnumC9454 enumC9454 = c2882.f9190;
        switch (iArr[enumC9454.m24298().ordinal()]) {
            case 1:
                m11836(ClassTransform.BOOLEAN);
                return null;
            case 2:
                m11836(ClassTransform.BYTE);
                return null;
            case 3:
                m11836(ClassTransform.SHORT);
                return null;
            case 4:
                m11836(ClassTransform.INTEGER);
                return null;
            case 5:
                m11836(ClassTransform.LONG);
                return null;
            case 6:
                m11836(ClassTransform.CHARACTER);
                return null;
            case 7:
                m11836(ClassTransform.FLOAT);
                return null;
            case 8:
                m11836(ClassTransform.DOUBLE);
                return null;
            case 9:
                m11836(ClassTransform.VOID);
                return null;
            default:
                throw new AssertionError(enumC9454.m24298());
        }
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo11788(C3587 c3587, Object obj) {
        m11851((InterfaceC20969) c3587);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11789(C4146 c4146, Object obj) {
        m11854(c4146);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11836("break");
        AbstractC10370 abstractC10370 = c4146.f13545;
        if (abstractC10370 != null) {
            c13675.m32907();
            m11846(abstractC10370);
        }
        c13675.m32906();
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11790(C4851 c4851, Object obj) {
        m11854(c4851);
        C13675 c13675 = this.f12459;
        C5210 c5210 = f12455;
        c13675.m32896(c5210);
        m11836("for");
        c13675.m32907();
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        c13675.m32896(c5210);
        m11770(EnumC20828.NONE, EnumC15887.HORIZONTAL, c4851.f15325, C16646.of(c4851.f15326), ":", C16646.empty());
        c13675.m32906();
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        c13675.m32906();
        m11767(c4851.f15324, EnumC6716.YES, EnumC1777.YES, EnumC10950.NO);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11791(C5557 c5557, Object obj) {
        AbstractC8032 abstractC8032;
        int i = C7153.f21954[c5557.mo987().ordinal()];
        C13675 c13675 = this.f12459;
        AbstractC8032 abstractC80322 = this.f12460;
        AbstractC8032 abstractC80323 = f12455;
        if (i == 1) {
            m11854(c5557);
            c13675.m32896(abstractC80323);
            InterfaceC23790 interfaceC23790 = c5557.f17181;
            for (InterfaceC13206 interfaceC13206 : m11758(m11835(interfaceC23790, (List) interfaceC23790.getAnnotations()), EnumC15887.VERTICAL, C16646.empty())) {
                c13675.m32914();
                m11845(interfaceC13206);
                c13675.m32914();
            }
            c13675.m32896(abstractC80323);
            m11836("@");
            m11836("interface");
            c13675.m32904();
            m11846(c5557.f17180);
            c13675.m32906();
            c13675.m32906();
            List list = c5557.f17179;
            if (list == null) {
                c13675.m32896(abstractC80322);
                m11836(l.b);
                c13675.m32906();
            } else {
                m11840(list, EnumC14476.YES, EnumC2483.YES);
            }
            c13675.m32905(l.b);
            return null;
        }
        if (i == 2 || i == 3) {
            m11854(c5557);
            InterfaceC23790 interfaceC237902 = c5557.f17181;
            for (InterfaceC13206 interfaceC132062 : m11758(m11835(interfaceC237902, (List) interfaceC237902.getAnnotations()), EnumC15887.VERTICAL, C16646.empty())) {
                c13675.m32914();
                m11845(interfaceC132062);
                c13675.m32914();
            }
            List list2 = c5557.f17182;
            boolean z = c5557.f17184 != null;
            boolean isEmpty = c5557.f17183.isEmpty();
            boolean isEmpty2 = list2.isEmpty();
            EnumC3329 mo987 = c5557.mo987();
            EnumC3329 enumC3329 = EnumC3329.INTERFACE;
            m11836(mo987 != enumC3329 ? Name.LABEL : "interface");
            c13675.m32907();
            m11846(c5557.f17180);
            if (!c5557.f17185.isEmpty()) {
                m11836("<");
            }
            c13675.m32896(abstractC80322);
            if (!c5557.f17185.isEmpty()) {
                List list3 = c5557.f17185;
                if (!z && isEmpty && isEmpty2) {
                    abstractC80322 = abstractC80323;
                }
                m11856(list3, abstractC80322);
            }
            if (z) {
                c13675.m32912();
                m11836("extends");
                c13675.m32907();
                m11845(c5557.f17184);
            }
            m11763(c5557.mo987() == enumC3329 ? "extends" : "implements", c5557.f17183);
            m11763("permits", list2);
            c13675.m32906();
            List list4 = c5557.f17179;
            if (list4 == null) {
                m11836(l.b);
            } else {
                m11840(list4, EnumC14476.YES, EnumC2483.YES);
            }
            m11852();
            return null;
        }
        if (i != 4) {
            if (i != 5) {
                throw new AssertionError(c5557.mo987());
            }
            m11854(c5557);
            InterfaceC23790 interfaceC237903 = c5557.f17181;
            for (InterfaceC13206 interfaceC132063 : m11758(m11835(interfaceC237903, (List) interfaceC237903.getAnnotations()), EnumC15887.VERTICAL, C16646.empty())) {
                c13675.m32914();
                m11845(interfaceC132063);
                c13675.m32914();
            }
            if (c5557.f17184 != null) {
                throw new C17619();
            }
            boolean isEmpty3 = c5557.f17183.isEmpty();
            m11836("record");
            c13675.m32907();
            m11846(c5557.f17180);
            if (!c5557.f17185.isEmpty()) {
                m11836("<");
            }
            c13675.m32896(abstractC80322);
            if (!c5557.f17185.isEmpty()) {
                m11856(c5557.f17185, !isEmpty3 ? abstractC80322 : abstractC80323);
            }
            AbstractC14545 abstractC14545 = (AbstractC14545) C5378.stream(c5557.f17179).filter(new C12797()).map(new C23147(7)).filter(new C4167(1)).collect(AbstractC14545.m34736());
            m11836(MotionUtils.EASING_TYPE_FORMAT_START);
            abstractC14545.isEmpty();
            m11847(C16646.empty(), abstractC14545);
            m11836(MotionUtils.EASING_TYPE_FORMAT_END);
            if (!isEmpty3) {
                c13675.m32912();
                if (c5557.f17183.m8245() <= 1) {
                    abstractC80322 = abstractC80323;
                }
                c13675.m32896(abstractC80322);
                m11836("implements");
                c13675.m32907();
                Iterator it = c5557.f17183.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    InterfaceC13206 interfaceC132064 = (InterfaceC13206) it.next();
                    if (z2) {
                        m11836(",");
                        c13675.m32904();
                    }
                    m11845(interfaceC132064);
                    z2 = true;
                }
                c13675.m32906();
            }
            c13675.m32906();
            C2609 c2609 = c5557.f17179;
            if (c2609 == null) {
                m11836(l.b);
            } else {
                m11840((AbstractC14545) C5378.stream(c2609).filter(new C18282(1)).collect(AbstractC14545.m34736()), EnumC14476.YES, EnumC2483.YES);
            }
            m11852();
            return null;
        }
        m11854(c5557);
        c13675.m32896(abstractC80323);
        InterfaceC23790 interfaceC237904 = c5557.f17181;
        for (InterfaceC13206 interfaceC132065 : m11758(m11835(interfaceC237904, (List) interfaceC237904.getAnnotations()), EnumC15887.VERTICAL, C16646.empty())) {
            c13675.m32914();
            m11845(interfaceC132065);
            c13675.m32914();
        }
        c13675.m32896(abstractC80322);
        m11836("enum");
        c13675.m32907();
        m11846(c5557.f17180);
        c13675.m32906();
        c13675.m32906();
        if (!c5557.f17183.isEmpty()) {
            c13675.m32896(abstractC80322);
            c13675.m32904();
            c13675.m32896(abstractC80322);
            m11836("implements");
            c13675.m32904();
            c13675.m32896(abstractC80323);
            Iterator it2 = c5557.f17183.iterator();
            boolean z3 = false;
            while (it2.hasNext()) {
                InterfaceC13206 interfaceC132066 = (InterfaceC13206) it2.next();
                if (z3) {
                    m11836(",");
                    c13675.m32912();
                }
                m11845(interfaceC132066);
                z3 = true;
            }
            c13675.m32906();
            c13675.m32906();
            c13675.m32906();
        }
        c13675.m32907();
        AbstractC8032 abstractC80324 = this.f12464;
        m11843(abstractC80324);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = c5557.f17179.iterator();
        while (it3.hasNext()) {
            InterfaceC13206 interfaceC132067 = (InterfaceC13206) it3.next();
            if (interfaceC132067 instanceof C9378) {
                C9378 c9378 = (C9378) interfaceC132067;
                abstractC8032 = abstractC80324;
                if ((c9378.f28486.f7169 & 16384) == 16384) {
                    arrayList.add(c9378);
                    abstractC80324 = abstractC8032;
                }
            } else {
                abstractC8032 = abstractC80324;
            }
            arrayList2.add(interfaceC132067);
            abstractC80324 = abstractC8032;
        }
        AbstractC8032 abstractC80325 = abstractC80324;
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            c13675.m32896(abstractC80325);
            c13675.m32898(AbstractC22848.f73734);
            c13675.m32914();
            c13675.m32896(abstractC80323);
            Iterator it4 = arrayList.iterator();
            boolean z4 = false;
            while (it4.hasNext()) {
                InterfaceC1527 interfaceC1527 = (InterfaceC1527) it4.next();
                if (z4) {
                    m11836(",");
                    c13675.m32914();
                    c13675.m32898(AbstractC22848.f73735);
                }
                m11855();
                Iterator it5 = interfaceC1527.mo5211().f7168.iterator();
                while (it5.hasNext()) {
                    m11845((InterfaceC13206) it5.next());
                    c13675.m32914();
                }
                m11846(interfaceC1527.getName());
                InterfaceC8974 interfaceC8974 = (InterfaceC8974) interfaceC1527.mo5210();
                if (interfaceC8974.mo23183().isEmpty()) {
                    c13675.m32905(MotionUtils.EASING_TYPE_FORMAT_START);
                    c13675.m32905(MotionUtils.EASING_TYPE_FORMAT_END);
                } else {
                    m11839(interfaceC8974.mo23183(), abstractC80322);
                }
                if (interfaceC8974.mo23182() != null) {
                    m11840(interfaceC8974.mo23182().f17179, EnumC14476.YES, EnumC2483.YES);
                }
                z4 = true;
            }
            if (((String) c13675.m32908(0).orElse("")).equals(",")) {
                m11836(",");
                c13675.m32914();
            }
            c13675.m32906();
            c13675.m32906();
            if (c13675.m32908(0).equals(C16646.of(l.b))) {
                c13675.m32896(abstractC80325);
                m11836(l.b);
                c13675.m32914();
                m11852();
                c13675.m32906();
            }
            c13675.m32896(abstractC80323);
            m11840(arrayList2, EnumC14476.NO, EnumC2483.NO);
            c13675.m32914();
            c13675.m32898(AbstractC22848.f73734);
            m11837(l.d, abstractC80325);
            c13675.m32906();
        } else if (c13675.m32908(0).equals(C16646.of(l.b))) {
            c13675.m32896(abstractC80325);
            c13675.m32914();
            m11836(l.b);
            c13675.m32914();
            m11852();
            c13675.m32906();
            c13675.m32896(abstractC80323);
            c13675.m32914();
            c13675.m32898(AbstractC22848.f73734);
            m11837(l.d, abstractC80325);
            c13675.m32906();
        } else {
            c13675.m32896(abstractC80323);
            c13675.m32898(AbstractC22848.f73734);
            m11836(l.d);
            c13675.m32906();
        }
        c13675.m32905(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11792(C5704 c5704, Object obj) {
        m11854(c5704);
        m11852();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo5305(C6262 c6262, Object obj) {
        m11854((InterfaceC13206) c6262);
        m11844((AbstractC12612) c6262);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11793(C6555 c6555, Object obj) {
        EnumC18550 enumC18550;
        m11854((InterfaceC13206) c6555);
        String m9807 = C3188.m9807((InterfaceC20058) c6555);
        if (c6555.mo989().m43094()) {
            m11845((InterfaceC13206) c6555.f20226);
            m11773(m9807);
            return null;
        }
        m11773(m9807);
        int i = C7153.f21954[c6555.mo987().ordinal()];
        if (i == 6 || i == 7) {
            AbstractC12612 abstractC12612 = c6555.f20226;
            if (abstractC12612 instanceof InterfaceC23084) {
                enumC18550 = abstractC12612.mo989();
            } else {
                if (abstractC12612 instanceof InterfaceC1918) {
                    if (C3188.m9806((InterfaceC1918) abstractC12612, m42940()).startsWith("-")) {
                        enumC18550 = EnumC18550.f57485;
                    }
                }
                enumC18550 = null;
            }
            if (enumC18550 != null && !enumC18550.m43094() && C3188.m9807((InterfaceC20058) c6555).startsWith(m9807)) {
                this.f12459.m32907();
            }
        }
        m11845((InterfaceC13206) c6555.f20226);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11794(C6968 c6968, Object obj) {
        m11854(c6968);
        C13675 c13675 = this.f12459;
        C5210 c5210 = f12455;
        c13675.m32896(c5210);
        m11836("assert");
        c13675.m32907();
        if (c6968.f21476 != null) {
            c5210 = this.f12460;
        }
        c13675.m32896(c5210);
        m11845((InterfaceC13206) c6968.f21475);
        if (c6968.f21476 != null) {
            c13675.m32904();
            m11836(":");
            c13675.m32907();
            m11845((InterfaceC13206) c6968.f21476);
        }
        c13675.m32906();
        c13675.m32906();
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11795(C7115 c7115, Object obj) {
        m11854(c7115);
        m11836(MessageHandler.Properties.IsSynchronized);
        C13675 c13675 = this.f12459;
        c13675.m32907();
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        c13675.m32896(this.f12460);
        c13675.m32892();
        m11845((InterfaceC13206) ((InterfaceC19558) c7115.f21831).getExpression());
        c13675.m32906();
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        c13675.m32907();
        m11845(c7115.f21830);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo5306(C7673 c7673, Object obj) {
        m11854((InterfaceC13206) c7673);
        m11836(c7673.f23696.toString());
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11796(C8379 c8379, Object obj) {
        m11854((InterfaceC13206) c8379);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11845((InterfaceC13206) c8379.f25701);
        if (m11778()) {
            c13675.m32914();
        } else {
            c13675.m32907();
        }
        m11836("?");
        c13675.m32907();
        m11845((InterfaceC13206) c8379.f25699);
        if (m11778()) {
            c13675.m32914();
        } else {
            c13675.m32907();
        }
        m11836(":");
        c13675.m32907();
        m11845((InterfaceC13206) c8379.f25700);
        c13675.m32906();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [l.ۘۧۖ] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, l.ۖܶ۠] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.util.List] */
    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11797(C8526 c8526, Object obj) {
        InterfaceC13206 interfaceC13206;
        ArrayDeque arrayDeque;
        boolean z;
        boolean z2;
        AbstractC12612 abstractC12612 = c8526.f26049;
        m11854(c8526);
        ?? r3 = c8526.f26046.f7168;
        List of = AbstractC14545.of();
        boolean z3 = false;
        boolean z4 = (c8526.f26046.f7169 & 2251799813685248L) == 2251799813685248L;
        if (!c8526.f26047.isEmpty() && !r3.isEmpty()) {
            int m9805 = C3188.m9805((InterfaceC13206) c8526.f26047.get(0));
            int i = 0;
            while (true) {
                if (i >= r3.m8245()) {
                    break;
                }
                if (C3188.m9805((InterfaceC13206) r3.get(i)) > m9805) {
                    of = r3.subList(i, r3.m8245());
                    r3 = r3.subList(0, i);
                    break;
                }
                i++;
            }
        }
        AbstractC14545<InterfaceC22900> m11758 = m11758(m11835(c8526.f26046, r3), EnumC15887.VERTICAL, C16646.empty());
        if (c8526.f26047.isEmpty() && c8526.f26051 != null) {
            of = m11758;
            m11758 = AbstractC14545.of();
        }
        AbstractC12612 abstractC126122 = c8526.f26051;
        C13675 c13675 = this.f12459;
        if (abstractC126122 != null) {
            C9270 m22277 = C8564.m22277(abstractC126122, EnumC20559.YES);
            interfaceC13206 = m22277.f28080;
            arrayDeque = new ArrayDeque(m22277.f28079);
        } else {
            for (InterfaceC22900 interfaceC22900 : m11758) {
                c13675.m32914();
                m11845(interfaceC22900);
                c13675.m32914();
            }
            m11758 = AbstractC14545.of();
            interfaceC13206 = null;
            arrayDeque = null;
        }
        C5210 c5210 = this.f12460;
        c13675.m32896(c5210);
        C7326 c7326 = new C7326();
        C7326 c73262 = new C7326();
        C5210 c52102 = f12455;
        c13675.m32896(c52102);
        if (m11758.isEmpty()) {
            z = false;
        } else {
            EnumC23649 enumC23649 = EnumC23649.NO;
            m11842(m11758, enumC23649, enumC23649);
            z = true;
        }
        if (!c8526.f26047.isEmpty()) {
            if (z) {
                c13675.m32912();
            }
            m11836("<");
            m11856(c8526.f26047, c5210);
            z = true;
        }
        if (interfaceC13206 != null) {
            if (z) {
                c13675.m32907();
            } else {
                z = true;
            }
            c13675.m32896(C0976.m3441(c73262, c5210, c52102));
            c13675.m32896(c52102);
            if (!of.isEmpty()) {
                EnumC23649 enumC236492 = EnumC23649.NO;
                m11842(of, enumC236492, enumC236492);
                c13675.m32907();
            }
            m11845(interfaceC13206);
            m11776(arrayDeque);
            c13675.m32906();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            c13675.m32907();
        }
        if (!z2) {
            c13675.m32896(c52102);
        }
        String abstractC10370 = c8526.f26044.toString();
        if (abstractC10370.equals("<init>")) {
            abstractC10370 = (String) c13675.m32908(0).get();
        }
        m11836(abstractC10370);
        if (!z4) {
            m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        }
        c13675.m32906();
        c13675.m32906();
        c13675.m32896(C0976.m3441(c7326, c5210, c52102));
        c13675.m32896(C0976.m3441(c73262, c5210, c52102));
        c13675.m32896(c52102);
        if (!z4) {
            if (!c8526.f26048.isEmpty() || c8526.f26052 != null) {
                m11847(C16646.ofNullable(c8526.f26052), c8526.f26048);
            }
            m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (arrayDeque != null) {
            m11776(arrayDeque);
        }
        if (!c8526.f26042.isEmpty()) {
            c13675.m32912();
            c13675.m32896(c5210);
            C2609 c2609 = c8526.f26042;
            m11836("throws");
            c13675.m32912();
            Iterator it = c2609.iterator();
            while (it.hasNext()) {
                InterfaceC20058 interfaceC20058 = (InterfaceC20058) it.next();
                if (z3) {
                    m11836(",");
                    c13675.m32904();
                }
                m11845(interfaceC20058);
                z3 = true;
            }
            c13675.m32906();
        }
        if (abstractC12612 != null) {
            c13675.m32907();
            m11836("default");
            if (abstractC12612.mo987() == EnumC3329.NEW_ARRAY) {
                c13675.m32896(this.f12462);
                c13675.m32907();
                m11845(abstractC12612);
                c13675.m32906();
            } else {
                c13675.m32896(c52102);
                c13675.m32912();
                m11845(abstractC12612);
                c13675.m32906();
            }
        }
        c13675.m32906();
        c13675.m32906();
        c13675.m32906();
        C2735 c2735 = c8526.f26043;
        C5210 c52103 = this.f12464;
        if (c2735 == null) {
            m11836(l.b);
        } else {
            c13675.m32907();
            c13675.m32894("{", EnumC15792.REAL, c52103, C16646.of(c52103));
        }
        c13675.m32906();
        C2735 c27352 = c8526.f26043;
        if (c27352 != null) {
            if (c27352.f8521.isEmpty()) {
                c13675.m32898(AbstractC22848.f73734);
            } else {
                c13675.m32896(c52103);
                c13675.m32914();
                c13675.m32898(AbstractC22848.f73735);
                m11838(c8526.f26043.f8521);
                c13675.m32906();
                c13675.m32914();
                c13675.m32898(AbstractC22848.f73734);
                m11855();
            }
            m11837(l.d, c52103);
        }
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11798(C8672 c8672, Object obj) {
        m11854(c8672);
        m11836("while");
        this.f12459.m32907();
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        m11845((InterfaceC13206) ((InterfaceC19558) c8672.f26445).getExpression());
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        m11767(c8672.f26444, EnumC6716.YES, EnumC1777.YES, EnumC10950.NO);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11799(C9085 c9085, Object obj) {
        m11854((InterfaceC13206) c9085);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m11761(C7260.m19433(c9085.mo989()), c9085, arrayList, arrayList2);
        EnumC23554 enumC23554 = EnumC23554.UNIFIED;
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        int i = 0;
        m11845((InterfaceC13206) arrayList.get(0));
        int size = arrayList2.size();
        while (i < size) {
            if (m11778()) {
                c13675.m32914();
            } else {
                c13675.m32907();
            }
            c13675.m32910((String) arrayList2.get(i));
            if (m11778()) {
                c13675.m32914();
            } else {
                c13675.m32907();
            }
            i++;
            m11845((InterfaceC13206) arrayList.get(i));
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11800(C9232 c9232, Object obj) {
        C13675 c13675 = this.f12459;
        C5210 c5210 = this.f12460;
        c13675.m32896(c5210);
        m11845((InterfaceC13206) c9232.f27945);
        c13675.m32892();
        c13675.m32910("::");
        m11853(c9232.f27947, c5210);
        int[] iArr = C7153.f21953;
        EnumC11091 enumC11091 = c9232.f27940;
        int i = iArr[enumC11091.ordinal()];
        if (i == 1) {
            m11846(c9232.f27944);
        } else if (i == 2) {
            m11836("new");
        } else {
            throw new AssertionError(enumC11091);
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo8689(C9378 c9378, Object obj) {
        m11854(c9378);
        m11841(AbstractC14545.of((Object) c9378), EnumC20828.NONE, m11759((InterfaceC23790) c9378.f28486));
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11801(C9791 c9791, Object obj) {
        m11854((InterfaceC13206) c9791);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11845((InterfaceC13206) c9791.f29619);
        c13675.m32907();
        m11773(C3188.m9807((InterfaceC20058) c9791));
        c13675.m32904();
        m11845((InterfaceC13206) c9791.f29618);
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11802(C9938 c9938, Object obj) {
        m11854(c9938);
        m11836("return");
        if (c9938.f30017 != null) {
            this.f12459.m32907();
            m11845((InterfaceC13206) c9938.f30017);
        }
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11803(C10496 c10496, Object obj) {
        m11854(c10496);
        m11845((InterfaceC13206) c10496.f31483);
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11804(C10643 c10643, Object obj) {
        AbstractC10370 mo17273;
        Cloneable cloneable = c10643.f32021;
        if (cloneable instanceof InterfaceC13001) {
            mo17273 = ((InterfaceC13001) cloneable).getName();
        } else {
            mo17273 = ((InterfaceC18146) cloneable).mo17273();
        }
        AbstractC6079 abstractC6079 = f12456.get((Object) mo17273.toString());
        if (!abstractC6079.isEmpty() && abstractC6079.contains(c10643.f32021.toString())) {
            this.f12458.add(mo17273);
        }
        m11854(c10643);
        m11836("import");
        C13675 c13675 = this.f12459;
        c13675.m32907();
        if (c10643.f32020) {
            m11836("static");
            c13675.m32907();
        }
        m11777(c10643.f32021);
        m11836(l.b);
        m11852();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11805(C10789 c10789, Object obj) {
        C5210 c5210;
        C5210 c52102;
        String str;
        C5210 c52103;
        EnumC10950 enumC10950;
        InterfaceC9475 interfaceC9475;
        String str2;
        C5210 c52104;
        int i;
        String str3;
        C5210 c52105;
        C5210 c52106;
        String str4;
        C10789 c107892 = c10789;
        m11854(c10789);
        C13675 c13675 = this.f12459;
        C5210 c52107 = f12455;
        c13675.m32896(c52107);
        m11836("try");
        c13675.m32907();
        boolean isEmpty = c107892.f32446.isEmpty();
        C5210 c52108 = this.f12460;
        String str5 = MotionUtils.EASING_TYPE_FORMAT_START;
        if (isEmpty) {
            c5210 = c52108;
            c52102 = c52107;
            str = MotionUtils.EASING_TYPE_FORMAT_START;
        } else {
            m11836(MotionUtils.EASING_TYPE_FORMAT_START);
            c13675.m32896(c107892.f32446.m8245() > 1 ? c52108 : c52107);
            Iterator it = c107892.f32446.iterator();
            boolean z = false;
            while (it.hasNext()) {
                InterfaceC13206 interfaceC13206 = (InterfaceC13206) it.next();
                if (z) {
                    c13675.m32914();
                }
                if (interfaceC13206 instanceof InterfaceC1527) {
                    InterfaceC1527 interfaceC1527 = (InterfaceC1527) interfaceC13206;
                    EnumC20828 enumC20828 = EnumC20828.PARAMETER;
                    EnumC15887 m11759 = m11759((InterfaceC23790) interfaceC1527.mo5211());
                    C16646 of = C16646.of(interfaceC1527.mo5211());
                    InterfaceC13206 type = interfaceC1527.getType();
                    InterfaceC14812 name = interfaceC1527.getName();
                    C16646 ofNullable = C16646.ofNullable(interfaceC1527.mo5210());
                    C16646 empty = C16646.empty();
                    C16646 empty2 = C16646.empty();
                    C16646 empty3 = C16646.empty();
                    str3 = l.b;
                    c52106 = c52107;
                    str4 = str5;
                    c52105 = c52108;
                    m11850(enumC20828, m11759, of, type, name, "=", ofNullable, empty, empty2, empty3);
                } else {
                    str3 = l.b;
                    c52105 = c52108;
                    c52106 = c52107;
                    str4 = str5;
                    m11845(interfaceC13206);
                }
                if (c13675.m32908(0).equals(C16646.of(str3))) {
                    m11836(str3);
                    c13675.m32907();
                }
                z = true;
                str5 = str4;
                c52107 = c52106;
                c52108 = c52105;
            }
            c5210 = c52108;
            c52102 = c52107;
            str = str5;
            if (c13675.m32908(0).equals(C16646.of(l.b))) {
                m11836(l.b);
                c13675.m32907();
            }
            m11836(MotionUtils.EASING_TYPE_FORMAT_END);
            c13675.m32906();
            c13675.m32907();
        }
        boolean z2 = (c107892.f32449.isEmpty() && c107892.f32448 == null) ? false : true;
        m11848(c107892.f32445, EnumC6716.m18276(!z2), EnumC1777.YES, EnumC10950.m27271(z2));
        int i2 = 0;
        while (i2 < c107892.f32449.m8245()) {
            InterfaceC9475 interfaceC94752 = (InterfaceC9475) c107892.f32449.get(i2);
            EnumC10950 m27271 = EnumC10950.m27271(i2 < c107892.f32449.m8245() + (-1) || c107892.f32448 != null);
            m11854(interfaceC94752);
            c13675.m32907();
            m11836("catch");
            c13675.m32907();
            m11836(str);
            C5210 c52109 = c5210;
            c13675.m32896(c52109);
            C9378 mo2550 = interfaceC94752.mo2550();
            if (mo2550.f28488.mo987() == EnumC3329.UNION_TYPE) {
                C5210 c521010 = c52102;
                c13675.m32896(c521010);
                InterfaceC13911 interfaceC13911 = (InterfaceC13911) mo2550.f28488;
                c13675.m32896(c521010);
                m11854(mo2550);
                InterfaceC23790 interfaceC23790 = mo2550.f28486;
                m11842(m11758(m11835(interfaceC23790, (List) interfaceC23790.getAnnotations()), EnumC15887.HORIZONTAL, C16646.empty()), EnumC23649.NO, EnumC23649.YES);
                C2609 mo33321 = interfaceC13911.mo33321();
                boolean z3 = false;
                for (int i3 = 0; i3 < mo33321.m8245() - 1; i3++) {
                    if (z3) {
                        c13675.m32904();
                        m11836("|");
                        c13675.m32907();
                    } else {
                        z3 = true;
                    }
                    m11845((InterfaceC13206) mo33321.get(i3));
                }
                c13675.m32904();
                m11836("|");
                c13675.m32907();
                str2 = str;
                c52104 = c521010;
                c52103 = c52109;
                enumC10950 = m27271;
                interfaceC9475 = interfaceC94752;
                i = i2;
                m11850(EnumC20828.NONE, EnumC15887.HORIZONTAL, C16646.empty(), (InterfaceC13206) mo33321.get(mo33321.m8245() - 1), mo2550.f28484, "=", C16646.ofNullable(mo2550.f28487), C16646.empty(), C16646.empty(), C16646.empty());
                c13675.m32906();
                c13675.m32906();
            } else {
                c52103 = c52109;
                enumC10950 = m27271;
                interfaceC9475 = interfaceC94752;
                str2 = str;
                c52104 = c52102;
                i = i2;
                c13675.m32909();
                c13675.m32896(c52104);
                m11845(mo2550);
                c13675.m32906();
            }
            c13675.m32906();
            m11836(MotionUtils.EASING_TYPE_FORMAT_END);
            c13675.m32907();
            m11848(interfaceC9475.mo2551(), EnumC6716.NO, EnumC1777.YES, enumC10950);
            i2 = i + 1;
            c107892 = c10789;
            c52102 = c52104;
            c5210 = c52103;
            str = str2;
        }
        C10789 c107893 = c107892;
        if (c107893.f32448 != null) {
            c13675.m32907();
            m11836("finally");
            c13675.m32907();
            m11848(c107893.f32448, EnumC6716.NO, EnumC1777.YES, EnumC10950.NO);
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11806(C11907 c11907, Object obj) {
        m11854(c11907);
        m11836("for");
        C13675 c13675 = this.f12459;
        c13675.m32907();
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        C5210 c5210 = this.f12460;
        c13675.m32896(c5210);
        int m8245 = c11907.f35587.m8245();
        C5210 c52102 = f12455;
        boolean z = true;
        c13675.m32896((m8245 <= 1 || ((InterfaceC15322) c11907.f35587.get(0)).mo987() != EnumC3329.EXPRESSION_STATEMENT) ? c52102 : c5210);
        if (c11907.f35587.isEmpty()) {
            m11836(l.b);
        } else if (((InterfaceC15322) c11907.f35587.get(0)).mo987() == EnumC3329.VARIABLE) {
            InterfaceC5998 m13612 = C4648.m13612(c11907.f35587.iterator());
            m11841(m11756(m13612, (InterfaceC13206) m13612.next()), EnumC20828.NONE, EnumC15887.HORIZONTAL);
        } else {
            c13675.m32896(c52102);
            Iterator it = c11907.f35587.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                InterfaceC15322 interfaceC15322 = (InterfaceC15322) it.next();
                if (z2) {
                    m11836(",");
                    c13675.m32904();
                }
                m11845((InterfaceC13206) ((InterfaceC22174) interfaceC15322).getExpression());
                z2 = true;
            }
            m11836(l.b);
            c13675.m32906();
        }
        c13675.m32906();
        c13675.m32904();
        AbstractC12612 abstractC12612 = c11907.f35588;
        if (abstractC12612 != null) {
            m11845((InterfaceC13206) abstractC12612);
        }
        m11836(l.b);
        if (c11907.f35586.isEmpty()) {
            c13675.m32907();
        } else {
            c13675.m32904();
            if (c11907.f35586.m8245() <= 1) {
                c5210 = c52102;
            }
            c13675.m32896(c5210);
            Iterator it2 = c11907.f35586.iterator();
            while (it2.hasNext()) {
                InterfaceC22174 interfaceC22174 = (InterfaceC22174) it2.next();
                if (!z) {
                    m11836(",");
                    c13675.m32912();
                }
                m11845((InterfaceC13206) interfaceC22174.getExpression());
                z = false;
            }
            c13675.m32905(l.b);
            c13675.m32906();
        }
        c13675.m32906();
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        m11767(c11907.f35585, EnumC6716.YES, EnumC1777.YES, EnumC10950.NO);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11807(C12054 c12054, Object obj) {
        m11836("requires");
        C13675 c13675 = this.f12459;
        c13675.m32907();
        while (true) {
            if (c13675.m32908(0).equals(C16646.of("static"))) {
                m11836("static");
                c13675.m32907();
            } else if (c13675.m32908(0).equals(C16646.of("transitive"))) {
                m11836("transitive");
                c13675.m32907();
            } else {
                m11845((InterfaceC13206) c12054.f36052);
                m11836(l.b);
                return null;
            }
        }
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11808(C12759 c12759, Object obj) {
        m11762("provides", "with", c12759.f38349, c12759.f38348);
        return null;
    }

    @Override // l.C18461, l.C19167
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* bridge */ /* synthetic */ Object mo11809(InterfaceC13206 interfaceC13206, Object obj) {
        m11845(interfaceC13206);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11810(C13317 c13317, Object obj) {
        m11762("exports", "to", c13317.f39865, c13317.f39866);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11811(C13464 c13464, Object obj) {
        m11854((InterfaceC13206) c13464);
        m11849((InterfaceC20058) c13464.f40197, (List) c13464.f40199);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo6992(C14169 c14169, Object obj) {
        m11854((InterfaceC13206) c14169);
        c14169.m33819();
        EnumC13706 enumC13706 = EnumC13706.EXPRESSION;
        C13675 c13675 = this.f12459;
        boolean equals = c13675.m32908(0).equals(C16646.of(MotionUtils.EASING_TYPE_FORMAT_START));
        C5210 c5210 = f12455;
        c13675.m32896(c5210);
        if (equals) {
            m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        }
        Iterator it = c14169.f42775.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC1527 interfaceC1527 = (InterfaceC1527) it.next();
            if (z) {
                m11836(",");
                c13675.m32907();
            }
            m11841(AbstractC14545.of((Object) interfaceC1527), EnumC20828.NONE, m11759((InterfaceC23790) interfaceC1527.mo5211()));
            z = true;
        }
        if (equals) {
            m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        }
        c13675.m32906();
        c13675.m32907();
        c13675.m32910("->");
        if (m11772(c13675.m32903(-1), c13675.m32903(0))) {
            c13675.m32896(this.f12460);
            c13675.m32914();
        } else {
            c13675.m32896(c5210);
            c13675.m32907();
        }
        if (c14169.f42776.mo987() == EnumC3329.BLOCK) {
            m11848((InterfaceC17235) c14169.f42776, EnumC6716.YES, EnumC1777.NO, EnumC10950.NO);
        } else {
            m11845(c14169.f42776);
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11812(C14315 c14315, Object obj) {
        m11854(c14315);
        C5210 c5210 = f12455;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11842(c14315.f43168, EnumC23649.NO, EnumC23649.YES);
        m11846(c14315.f43169);
        if (!c14315.f43170.isEmpty()) {
            c13675.m32907();
            m11836("extends");
            C5210 c52102 = this.f12460;
            c13675.m32896(c52102);
            c13675.m32904();
            c13675.m32896(c52102);
            Iterator it = c14315.f43170.iterator();
            boolean z = false;
            while (it.hasNext()) {
                InterfaceC13206 interfaceC13206 = (InterfaceC13206) it.next();
                if (z) {
                    c13675.m32912();
                    m11836(a.p);
                    c13675.m32907();
                }
                m11845(interfaceC13206);
                z = true;
            }
            c13675.m32906();
            c13675.m32906();
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11813(C14728 c14728, Object obj) {
        m11854((InterfaceC13206) c14728);
        m11844((AbstractC12612) c14728);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11814(C14875 c14875, Object obj) {
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        m11845((InterfaceC13206) c14875.f45392);
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11815(C15433 c15433, Object obj) {
        m11854(c15433);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11836("continue");
        AbstractC10370 abstractC10370 = c15433.f47247;
        if (abstractC10370 != null) {
            c13675.m32907();
            m11846(abstractC10370);
        }
        m11836(l.b);
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11816(C15580 c15580, Object obj) {
        m11854((InterfaceC13206) c15580);
        if (((AbstractC10370) C3188.m9808((InterfaceC17440) c15580)).mo26175("log")) {
            ArrayDeque arrayDeque = new ArrayDeque();
            Object obj2 = c15580;
            while (true) {
                if (obj2 instanceof InterfaceC17440) {
                    InterfaceC17440 interfaceC17440 = (InterfaceC17440) obj2;
                    arrayDeque.addFirst(interfaceC17440);
                    if (!f12457.contains(C3188.m9808(interfaceC17440).toString())) {
                        break;
                    }
                    InterfaceC20058 mo36749 = interfaceC17440.mo36749();
                    obj2 = mo36749 instanceof InterfaceC18146 ? ((InterfaceC18146) mo36749).getExpression() : null;
                } else if (obj2 instanceof InterfaceC13001) {
                    arrayDeque.addFirst(obj2);
                    m11766((List) AbstractC14545.copyOf((Collection) arrayDeque), false, (AbstractCollection) AbstractC14545.of((Object) Integer.valueOf(arrayDeque.size() - 1)), EnumC23554.INDEPENDENT);
                    return null;
                }
            }
        }
        m11844((AbstractC12612) c15580);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11817(C15726 c15726, Object obj) {
        m11854((InterfaceC13206) c15726);
        C5210 c5210 = f12455;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11836("?");
        if (c15726.f48501 != null) {
            c13675.m32896(this.f12460);
            c13675.m32907();
            m11836(c15726.mo987() == EnumC3329.EXTENDS_WILDCARD ? "extends" : "super");
            c13675.m32904();
            m11845(c15726.f48501);
            c13675.m32906();
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11818(C16139 c16139, Object obj) {
        m11854(c16139);
        C9378 c9378 = c16139.f49721;
        m11850(EnumC20828.PARAMETER, EnumC15887.HORIZONTAL, C16646.of(c9378.f28486), c9378.f28488, c9378.f28484, "", C16646.empty(), C16646.empty(), C16646.empty(), C16646.empty());
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11819(C16286 c16286, Object obj) {
        m11854((InterfaceC13206) c16286);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11845((InterfaceC13206) c16286.f50075);
        c13675.m32904();
        c13675.m32896(f12455);
        m11836("instanceof");
        c13675.m32904();
        if (c16286.m38309() != null) {
            m11845(c16286.m38309());
        } else {
            m11845(c16286.getType());
        }
        c13675.m32906();
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11820(C16432 c16432, Object obj) {
        m11854((InterfaceC13206) c16432);
        if (c16432.f50541.isEmpty()) {
            m11845((InterfaceC13206) c16432.f50542);
            m11836("<");
            m11836(">");
            return null;
        }
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11845((InterfaceC13206) c16432.f50542);
        m11836("<");
        c13675.m32892();
        c13675.m32896(f12455);
        Iterator it = c16432.f50541.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC13206 interfaceC13206 = (InterfaceC13206) it.next();
            if (z) {
                m11836(",");
                c13675.m32904();
            }
            m11845(interfaceC13206);
            z = true;
        }
        c13675.m32906();
        c13675.m32906();
        m11836(">");
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11821(C17138 c17138, Object obj) {
        m11854((InterfaceC13206) c17138);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        Iterator it = c17138.f52525.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC13206 interfaceC13206 = (InterfaceC13206) it.next();
            if (z) {
                c13675.m32912();
                m11836(a.p);
                c13675.m32907();
            }
            m11845(interfaceC13206);
            z = true;
        }
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11822(C17551 c17551, Object obj) {
        m11854((InterfaceC13206) c17551);
        int m8245 = c17551.f53653.m8245();
        C5210 c5210 = this.f12460;
        C5210 c52102 = f12455;
        C13675 c13675 = this.f12459;
        if (m8245 == 1) {
            InterfaceC13206 interfaceC13206 = (InterfaceC20058) C8882.m22950((Collection) c17551.f53653);
            if (interfaceC13206.mo987() != EnumC3329.ASSIGNMENT) {
                boolean z = interfaceC13206.mo987() == EnumC3329.NEW_ARRAY;
                if (z) {
                    c5210 = c52102;
                }
                c13675.m32896(c5210);
                m11836("@");
                m11845(c17551.f53650);
                m11836(MotionUtils.EASING_TYPE_FORMAT_START);
                if (!z) {
                    c13675.m32892();
                }
                m11845(interfaceC13206);
                c13675.m32906();
                m11836(MotionUtils.EASING_TYPE_FORMAT_END);
                return null;
            }
        }
        c13675.m32896(c52102);
        m11836("@");
        m11845(c17551.f53650);
        if (c17551.f53653.isEmpty()) {
            if (c13675.m32908(0).equals(C16646.of(MotionUtils.EASING_TYPE_FORMAT_START))) {
                m11836(MotionUtils.EASING_TYPE_FORMAT_START);
                m11836(MotionUtils.EASING_TYPE_FORMAT_END);
            }
            c13675.m32906();
            return null;
        }
        c13675.m32896(c5210);
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        c13675.m32892();
        boolean m22952 = C8882.m22952(c17551.f53653, new C12092());
        Iterator it = c17551.f53653.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            InterfaceC13206 interfaceC132062 = (InterfaceC20058) it.next();
            if (z2) {
                m11836(",");
                if (m22952) {
                    c13675.m32914();
                } else {
                    c13675.m32904();
                }
            }
            if (interfaceC132062 instanceof InterfaceC10886) {
                InterfaceC10886 interfaceC10886 = (InterfaceC10886) interfaceC132062;
                boolean z3 = interfaceC10886.getExpression().mo987() == EnumC3329.NEW_ARRAY;
                m11854(interfaceC10886);
                c13675.m32896(z3 ? c52102 : c5210);
                m11845(interfaceC10886.mo27182());
                c13675.m32907();
                m11836("=");
                if (z3) {
                    c13675.m32907();
                } else {
                    c13675.m32904();
                }
                m11845(interfaceC10886.getExpression());
                c13675.m32906();
            } else {
                m11845(interfaceC132062);
            }
            z2 = true;
        }
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        c13675.m32906();
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11823(C17698 c17698, Object obj) {
        m11854(c17698);
        C5210 c5210 = f12455;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11846(c17698.f54160);
        m11836(":");
        c13675.m32914();
        c13675.m32906();
        m11845(c17698.f54159);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11824(C17844 c17844, Object obj) {
        m11854((InterfaceC13206) c17844);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        m11845(c17844.f54511);
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        c13675.m32907();
        m11845((InterfaceC13206) c17844.f54512);
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11825(C18257 c18257, Object obj) {
        m11854((InterfaceC13206) c18257);
        InterfaceC13206 interfaceC13206 = c18257.f56779;
        boolean z = interfaceC13206 instanceof InterfaceC18146;
        C13675 c13675 = this.f12459;
        if (z) {
            InterfaceC18146 interfaceC18146 = (InterfaceC18146) interfaceC13206;
            m11845((InterfaceC13206) interfaceC18146.getExpression());
            m11836(".");
            C2609 c2609 = c18257.f56778;
            EnumC23649 enumC23649 = EnumC23649.NO;
            m11842(c2609, enumC23649, enumC23649);
            c13675.m32912();
            m11846(interfaceC18146.mo17273());
            return null;
        }
        if (interfaceC13206 instanceof InterfaceC7378) {
            m11775((AbstractC12612) c18257);
            return null;
        }
        C2609 c26092 = c18257.f56778;
        EnumC23649 enumC236492 = EnumC23649.NO;
        m11842(c26092, enumC236492, enumC236492);
        c13675.m32912();
        m11845(interfaceC13206);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11826(C18404 c18404, Object obj) {
        AbstractC12612 abstractC12612 = c18404.f57138;
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        if (abstractC12612 != null) {
            c13675.m32896(c5210);
            m11836("new");
            c13675.m32907();
            C9270 m22277 = C8564.m22277(c18404.f57138, EnumC20559.YES);
            InterfaceC13206 interfaceC13206 = m22277.f28080;
            ArrayDeque arrayDeque = new ArrayDeque(c18404.f57140);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(AbstractC14545.copyOf((Collection) c18404.f57137));
            arrayDeque2.addAll(c18404.f57141);
            arrayDeque2.addAll(m22277.f28079);
            m11845(interfaceC13206);
            c13675.m32896(f12455);
            m11765(arrayDeque, (Deque) arrayDeque2);
            c13675.m32906();
            c13675.m32906();
        }
        C2609 c2609 = c18404.f57139;
        if (c2609 != null) {
            if (c2609.isEmpty()) {
                AbstractC8032 abstractC8032 = this.f12464;
                m11843(abstractC8032);
                if (c13675.m32908(0).equals(C16646.of(","))) {
                    m11836(",");
                }
                m11837(l.d, abstractC8032);
                return null;
            }
            c13675.m32896(c5210);
            m11836("{");
            int m8245 = c2609.m8245();
            boolean z = true;
            for (int i = 0; i < m8245; i++) {
                InterfaceC13206 interfaceC132062 = (InterfaceC20058) c2609.get(i);
                if (m11778()) {
                    c13675.m32914();
                    z = false;
                }
                m11845(interfaceC132062);
                if (((String) c13675.m32908(0).orElseThrow()).equals(",")) {
                    if (m11778()) {
                        c13675.m32914();
                        z = false;
                    }
                    m11836(",");
                    if (i != m8245 - 1) {
                        c13675.m32907();
                    }
                }
            }
            c13675.m32906();
            if (!((z && m11778()) ? false : z)) {
                c13675.m32914();
            }
            m11836(l.d);
        }
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11827(C18963 c18963, Object obj) {
        EnumC6652 enumC6652 = c18963.f59817;
        InterfaceC13206 interfaceC13206 = c18963.f59813;
        m11854(c18963);
        m11855();
        C13675 c13675 = this.f12459;
        c13675.m32914();
        C2609 c2609 = c18963.f59815;
        boolean z = false;
        boolean z2 = c2609.m8245() == 1 && ((InterfaceC23585) C8882.m22950((Collection) c2609)).mo987().name().equals("DEFAULT_CASE_LABEL");
        boolean equals = enumC6652.equals(EnumC6652.RULE);
        C5210 c5210 = f12455;
        c13675.m32896(equals ? this.f12460 : c5210);
        if (z2) {
            m11837("default", c5210);
        } else {
            m11837("case", c5210);
            c13675.m32896(c5210);
            c13675.m32907();
            Iterator it = c2609.iterator();
            while (it.hasNext()) {
                InterfaceC13206 interfaceC132062 = (InterfaceC13206) it.next();
                if (z) {
                    m11836(",");
                    c13675.m32904();
                }
                m11845(interfaceC132062);
                z = true;
            }
            c13675.m32906();
        }
        int i = C7153.f21952[enumC6652.ordinal()];
        if (i == 1) {
            m11836(":");
            c13675.m32896(this.f12464);
            m11838(c18963.m43778());
            c13675.m32906();
            c13675.m32906();
            return null;
        }
        if (i != 2) {
            return null;
        }
        c13675.m32907();
        m11836("-");
        m11836(">");
        if (interfaceC13206.mo987() == EnumC3329.BLOCK) {
            c13675.m32906();
            c13675.m32907();
            m11848((InterfaceC17235) interfaceC13206, EnumC6716.YES, EnumC1777.NO, EnumC10950.NO);
        } else {
            c13675.m32904();
            m11845(interfaceC13206);
            c13675.m32906();
        }
        c13675.m32905(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫ */
    public final Object mo6993(C19110 c19110, Object obj) {
        m11854((InterfaceC13206) c19110);
        C13675 c13675 = this.f12459;
        C5210 c5210 = f12455;
        c13675.m32896(c5210);
        AbstractC12612 abstractC12612 = c19110.f60199;
        if (abstractC12612 != null) {
            m11845((InterfaceC13206) abstractC12612);
            c13675.m32892();
            m11836(".");
        }
        m11836("new");
        c13675.m32907();
        m11853(c19110.f60198, this.f12460);
        C5557 c5557 = c19110.f60195;
        if (c5557 != null) {
            C2176 c2176 = c5557.f17181;
            m11842(m11758(m11835((InterfaceC23790) c2176, (List) c2176.getAnnotations()), EnumC15887.HORIZONTAL, C16646.empty()), EnumC23649.NO, EnumC23649.YES);
        }
        m11845((InterfaceC13206) c19110.f60196);
        m11839((List) c19110.f60197, (AbstractC8032) c5210);
        c13675.m32906();
        C5557 c55572 = c19110.f60195;
        if (c55572 != null) {
            m11840(c55572.f17179, EnumC14476.YES, EnumC2483.YES);
        }
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11828(C20374 c20374, Object obj) {
        m11854(c20374);
        m11836("do");
        m11767(c20374.f65770, EnumC6716.YES, EnumC1777.YES, EnumC10950.YES);
        EnumC3329 mo987 = c20374.f65770.mo987();
        EnumC3329 enumC3329 = EnumC3329.BLOCK;
        C13675 c13675 = this.f12459;
        if (mo987 == enumC3329) {
            c13675.m32907();
        } else {
            c13675.m32904();
        }
        m11836("while");
        c13675.m32907();
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        m11845((InterfaceC13206) ((InterfaceC19558) c20374.f65771).getExpression());
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11829(C20667 c20667, Object obj) {
        m11836("uses");
        this.f12459.m32907();
        m11845((InterfaceC13206) c20667.f66557);
        m11836(l.b);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11830(C21080 c21080, Object obj) {
        m11854((InterfaceC13206) c21080);
        C5210 c5210 = f12455;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11845((InterfaceC13206) c21080.f67987);
        c13675.m32907();
        m11773(C3188.m9807((InterfaceC20058) c21080));
        c13675.m32907();
        m11845((InterfaceC13206) c21080.f67988);
        c13675.m32906();
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11831(C22637 c22637, Object obj) {
        m11854(c22637);
        m11849((InterfaceC20058) c22637.f73103, (List) c22637.f73102);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11832(C23342 c23342, Object obj) {
        m11854((InterfaceC13206) c23342);
        String m9806 = C3188.m9806(c23342, m42940());
        if (!m9806.startsWith("\"\"\"")) {
            if (m9806.startsWith("-")) {
                m11836("-");
                m9806 = m9806.substring(1).trim();
            }
            m11836(m9806);
            return null;
        }
        String m31534 = C12970.m31534(m9806);
        ArrayList m28001 = C11337.m28001(m9806);
        String m28002 = C11337.m28002((String) C5378.stream(m28001).skip(1L).collect(C22976.joining(m31534)));
        String str = (String) C8882.m22955(m28001);
        int length = str.length();
        while (length > 0) {
            int codePointBefore = Character.codePointBefore(str, length);
            if (!Character.isWhitespace(codePointBefore)) {
                break;
            }
            length -= Character.charCount(codePointBefore);
        }
        int length2 = str.substring(0, length).length();
        String str2 = (String) C20857.m47674(C5378.stream(C11337.m28001(m28002))).orElseThrow();
        int length3 = str2.length();
        while (length3 > 0) {
            int codePointBefore2 = Character.codePointBefore(str2, length3);
            if (!Character.isWhitespace(codePointBefore2)) {
                break;
            }
            length3 -= Character.charCount(codePointBefore2);
        }
        if (length2 == str2.substring(0, length3).length()) {
            int i = this.f12463;
            C5210 m14988 = C5210.m14988(Integer.MIN_VALUE / i, i);
            C13675 c13675 = this.f12459;
            c13675.getClass();
            c13675.m32899(EnumC23554.UNIFIED, "", m14988);
        }
        m11836(m9806);
        return null;
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11833(C23488 c23488, Object obj) {
        throw new IllegalStateException("expected manual descent into union types");
    }

    @Override // l.C19167, l.InterfaceC12501
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo11834(C23901 c23901, Object obj) {
        m11854((InterfaceC13206) c23901);
        m11775((AbstractC12612) c23901);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C11724 c11724 = new C11724();
        AbstractC4628 listIterator = AbstractC14545.of((Object) "org.jspecify.annotations.NonNull", (Object) "org.jspecify.annotations.Nullable", (Object) "org.jspecify.annotations.Nullable", (Object) "org.checkerframework.checker.nullness.qual.NonNull", (Object) "org.checkerframework.checker.nullness.qual.Nullable").listIterator(0);
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            c11724.m28619(str.substring(str.lastIndexOf(46) + 1), str);
        }
        f12456 = c11724.m28618();
        f12455 = C5210.f16320;
        f12457 = AbstractC6079.m16988("at", "atConfig", "atDebug", "atFine", "atFiner", "atFinest", "atInfo", "atMostEvery", "atSevere", "atWarning", "every", "log", "logVarargs", "perUnique", "withCause", "withStackTrace");
        Pattern.compile("%|\\{[0-9]\\}");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11765(ArrayDeque arrayDeque, Deque deque) {
        while (true) {
            boolean z = false;
            while (true) {
                C13675 c13675 = this.f12459;
                if (!c13675.m32908(0).isPresent()) {
                    return;
                }
                String str = (String) c13675.m32908(0).get();
                str.getClass();
                switch (str) {
                    case ".":
                        if (((String) c13675.m32908(0).get()).equals(".") && ((String) c13675.m32908(1).get()).equals(".")) {
                            if (z) {
                                c13675.m32912();
                            } else {
                                c13675.m32909();
                            }
                            c13675.m32910("...");
                            break;
                        } else {
                            return;
                        }
                    case "@":
                        if (deque.isEmpty()) {
                            return;
                        }
                        List list = (List) deque.removeFirst();
                        if (!list.isEmpty()) {
                            c13675.m32912();
                            EnumC23649 enumC23649 = EnumC23649.NO;
                            m11842(list, enumC23649, enumC23649);
                            z = true;
                        }
                    case "[":
                        if (z) {
                            c13675.m32912();
                        }
                        m11836("[");
                        if (!((String) c13675.m32908(0).get()).equals("]")) {
                            m11845((InterfaceC13206) arrayDeque.removeFirst());
                        }
                        m11836("]");
                        break;
                    default:
                        return;
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11852() {
        C13675 c13675 = this.f12459;
        if (c13675.m32908(0).equals(C16646.of(l.b))) {
            while (c13675.m32908(0).equals(C16646.of(l.b))) {
                c13675.m32914();
                m11855();
                m11836(l.b);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11771(AbstractC14545 abstractC14545) {
        if (abstractC14545 != null) {
            AbstractC4628 listIterator = abstractC14545.listIterator(0);
            while (listIterator.hasNext()) {
                String mo35701 = ((InterfaceC15086) listIterator.next()).mo35701();
                for (int i = 0; i < mo35701.length(); i++) {
                    char charAt = mo35701.charAt(i);
                    if (charAt == '\r' || charAt == '\n') {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m11855() {
        if (((Boolean) this.f12461.peekLast()).booleanValue()) {
            return;
        }
        this.f12459.m32901();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11845(InterfaceC13206 interfaceC13206) {
        boolean z = interfaceC13206 instanceof InterfaceC20058;
        ArrayDeque arrayDeque = this.f12461;
        arrayDeque.addLast(Boolean.valueOf(z || ((Boolean) arrayDeque.peekLast()).booleanValue()));
        C13675 c13675 = this.f12459;
        int m32915 = c13675.m32915();
        try {
            try {
                super.mo11809(interfaceC13206, (Object) null);
                arrayDeque.removeLast();
                c13675.m32893(m32915);
            } catch (Throwable th) {
                arrayDeque.removeLast();
                throw th;
            }
        } catch (C0270 e) {
            throw e;
        } catch (Throwable th2) {
            int i = C11270.f33770;
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            throw new C0270(c13675.m32891(stringWriter.toString()));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m11775(AbstractC12612 abstractC12612) {
        C9270 m22277 = C8564.m22277(abstractC12612, EnumC20559.YES);
        C5210 c5210 = this.f12460;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        m11845(m22277.f28080);
        ArrayDeque arrayDeque = new ArrayDeque(m22277.f28079);
        m11776(arrayDeque);
        if (!arrayDeque.isEmpty()) {
            throw new C17619();
        }
        c13675.m32906();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11841(List list, EnumC20828 enumC20828, EnumC15887 enumC15887) {
        boolean z = false;
        if (list.size() == 1) {
            InterfaceC1527 interfaceC1527 = (InterfaceC1527) list.get(0);
            m11850(enumC20828, enumC15887, C16646.of(interfaceC1527.mo5211()), interfaceC1527.getType(), interfaceC1527.getName(), "=", C16646.ofNullable(interfaceC1527.mo5210()), C16646.of(l.b), C16646.empty(), C16646.ofNullable(m11757(false, 0, interfaceC1527.getType())));
            return;
        }
        C13675 c13675 = this.f12459;
        C5210 c5210 = f12455;
        c13675.m32896(c5210);
        C2176 mo5211 = ((InterfaceC1527) list.get(0)).mo5211();
        InterfaceC13206 type = ((InterfaceC1527) list.get(0)).getType();
        m11842(m11758(m11835((InterfaceC23790) mo5211, (List) mo5211.getAnnotations()), enumC15887, C16646.empty()), EnumC23649.NO, EnumC23649.YES);
        C5210 c52102 = this.f12460;
        c13675.m32896(c52102);
        c13675.m32896(c5210);
        C9270 m22277 = C8564.m22277(type, EnumC20559.YES);
        ArrayDeque arrayDeque = new ArrayDeque(m22277.f28079);
        m11845(m22277.f28080);
        int size = arrayDeque.size();
        m11776(arrayDeque);
        int size2 = size - arrayDeque.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC1527 interfaceC15272 = (InterfaceC1527) it.next();
            if (z) {
                m11836(",");
            }
            ArrayDeque arrayDeque2 = new ArrayDeque(m11757(z, size2, interfaceC15272.getType()).f28079);
            c13675.m32904();
            c13675.m32896(c5210);
            m11776(arrayDeque2);
            m11846(interfaceC15272.getName());
            m11776(arrayDeque2);
            AbstractC12612 mo5210 = interfaceC15272.mo5210();
            if (mo5210 != null) {
                c13675.m32907();
                m11836("=");
                c13675.m32896(c52102);
                c13675.m32904();
                m11845((InterfaceC13206) mo5210);
                c13675.m32906();
            }
            c13675.m32906();
            if (!z) {
                c13675.m32906();
            }
            z = true;
        }
        c13675.m32906();
        m11836(l.b);
        c13675.m32906();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9270 m11757(boolean z, int i, InterfaceC13206 interfaceC13206) {
        if (interfaceC13206 == null) {
            return null;
        }
        if (!z) {
            return C8564.m22277(interfaceC13206, EnumC20559.YES);
        }
        AbstractC14545 abstractC14545 = C8564.m22277(interfaceC13206, EnumC20559.NO).f28079;
        if (i > 0) {
            abstractC14545 = abstractC14545.subList(0, abstractC14545.size() - i);
        }
        return new C9270(null, abstractC14545);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m11773(String str) {
        for (int i = 0; i < str.length(); i++) {
            m11836(String.valueOf(str.charAt(i)));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11846(InterfaceC14812 interfaceC14812) {
        m11836(interfaceC14812.toString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11849(InterfaceC20058 interfaceC20058, List list) {
        m11836("switch");
        C13675 c13675 = this.f12459;
        c13675.m32907();
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        m11845((InterfaceC13206) ((InterfaceC19558) interfaceC20058).getExpression());
        m11836(MotionUtils.EASING_TYPE_FORMAT_END);
        c13675.m32907();
        C5210 c5210 = this.f12464;
        m11843(c5210);
        c13675.m32898(AbstractC22848.f73734);
        c13675.m32896(c5210);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC20764 interfaceC20764 = (InterfaceC20764) it.next();
            if (z) {
                c13675.m32898(AbstractC22848.f73735);
            }
            m11845(interfaceC20764);
            z = true;
        }
        c13675.m32906();
        c13675.m32914();
        c13675.m32898(AbstractC22848.f73734);
        m11837(l.d, this.f12460);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11842(List list, EnumC23649 enumC23649, EnumC23649 enumC236492) {
        if (list.isEmpty()) {
            return;
        }
        boolean m52143 = enumC23649.m52143();
        C13675 c13675 = this.f12459;
        if (m52143) {
            c13675.m32912();
        }
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC22900 interfaceC22900 = (InterfaceC22900) it.next();
            if (z) {
                c13675.m32912();
            }
            m11845((InterfaceC13206) interfaceC22900);
            z = true;
        }
        if (enumC236492.m52143()) {
            c13675.m32912();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11848(InterfaceC17235 interfaceC17235, EnumC6716 enumC6716, EnumC1777 enumC1777, EnumC10950 enumC10950) {
        m11854(interfaceC17235);
        boolean mo8481 = interfaceC17235.mo8481();
        C13675 c13675 = this.f12459;
        if (mo8481) {
            m11836("static");
            c13675.m32907();
        }
        boolean m18278 = enumC6716.m18278();
        C5210 c5210 = this.f12464;
        if (m18278 && interfaceC17235.mo8482().isEmpty()) {
            if (c13675.m32908(0).equals(C16646.of(l.b))) {
                m11836(l.b);
                return;
            }
            m11843(c5210);
            c13675.m32898(AbstractC22848.f73734);
            m11837(l.d, c5210);
            return;
        }
        c13675.m32896(f12455);
        c13675.m32896(c5210);
        m11843(c5210);
        if (enumC1777 == EnumC1777.NO) {
            c13675.m32898(AbstractC22848.f73734);
        } else {
            c13675.m32898(AbstractC22848.f73735);
        }
        m11838(interfaceC17235.mo8482());
        c13675.m32906();
        c13675.m32914();
        c13675.m32906();
        if (enumC10950 == EnumC10950.NO) {
            c13675.m32898(AbstractC22848.f73734);
        } else {
            c13675.m32898(AbstractC22848.f73735);
        }
        m11855();
        m11837(l.d, c5210);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11767(InterfaceC15322 interfaceC15322, EnumC6716 enumC6716, EnumC1777 enumC1777, EnumC10950 enumC10950) {
        m11854(interfaceC15322);
        int i = C7153.f21954[interfaceC15322.mo987().ordinal()];
        C13675 c13675 = this.f12459;
        if (i == 8) {
            c13675.m32907();
            m11848((InterfaceC17235) interfaceC15322, enumC6716, enumC1777, enumC10950);
            return;
        }
        c13675.m32896(this.f12464);
        if (m11778()) {
            c13675.m32914();
        } else {
            c13675.m32904();
        }
        m11845(interfaceC15322);
        c13675.m32906();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11838(List list) {
        EnumC15887 enumC15887;
        InterfaceC5998 m13612 = C4648.m13612(list.iterator());
        m11852();
        boolean z = false;
        while (m13612.hasNext()) {
            InterfaceC13206 interfaceC13206 = (InterfaceC15322) m13612.next();
            C13675 c13675 = this.f12459;
            c13675.m32914();
            if (z) {
                c13675.m32898(AbstractC22848.f73735);
            }
            m11855();
            ArrayList m11756 = m11756(m13612, interfaceC13206);
            if (!m11756.isEmpty()) {
                EnumC20828 enumC20828 = EnumC20828.NONE;
                C2176 mo5211 = ((InterfaceC1527) m11756.get(0)).mo5211();
                Iterator it = mo5211.f7168.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((InterfaceC22900) it.next()).mo41040().isEmpty()) {
                        i++;
                    }
                }
                if (i <= 1 && i == mo5211.f7168.m8245()) {
                    enumC15887 = EnumC15887.HORIZONTAL;
                } else {
                    enumC15887 = EnumC15887.VERTICAL;
                }
                m11841(m11756, enumC20828, enumC15887);
            } else {
                m11845(interfaceC13206);
            }
            z = true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC14545 m11758(AbstractC8833 abstractC8833, EnumC15887 enumC15887, C16646 c16646) {
        AbstractC14545 of;
        AbstractC14545 of2;
        if (abstractC8833.mo22826().isEmpty()) {
            return abstractC8833.mo22828();
        }
        ArrayDeque arrayDeque = new ArrayDeque(abstractC8833.mo22826());
        C13675 c13675 = this.f12459;
        C5210 c5210 = f12455;
        c13675.m32896(c5210);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (!arrayDeque.isEmpty() && !((AbstractC17299) arrayDeque.peekFirst()).mo26812().equals(EnumC18005.MODIFIER)) {
            if (z2) {
                if (!enumC15887.m37654()) {
                    of2 = AbstractC14545.of((Object) C14381.m34345(EnumC23554.UNIFIED, " ", c5210, c16646));
                } else {
                    of2 = AbstractC14545.of((Object) C14381.m34345(EnumC23554.FORCED, "", C5210.f16320, c16646));
                }
                c13675.m32895(of2);
            }
            m11764(arrayDeque);
            z2 = true;
            z3 = true;
        }
        c13675.m32906();
        if (!enumC15887.m37654()) {
            of = AbstractC14545.of((Object) C14381.m34345(EnumC23554.UNIFIED, " ", c5210, c16646));
        } else {
            of = AbstractC14545.of((Object) C14381.m34345(EnumC23554.FORCED, "", C5210.f16320, c16646));
        }
        if (arrayDeque.isEmpty()) {
            c13675.m32895(of);
            return abstractC8833.mo22828();
        }
        if (z3) {
            c13675.m32895(of);
        }
        c13675.m32896(c5210);
        while (!arrayDeque.isEmpty()) {
            if (z) {
                c13675.m32907();
            }
            m11764(arrayDeque);
            z = true;
        }
        c13675.m32906();
        c13675.m32907();
        return abstractC8833.mo22828();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23380 m11835(InterfaceC23790 interfaceC23790, List list) {
        boolean isEmpty = list.isEmpty();
        int i = 1;
        C13675 c13675 = this.f12459;
        if (isEmpty) {
            String str = (String) c13675.m32908(0).get();
            str.getClass();
            switch (str) {
                case "volatile":
                case "synchronized":
                case "native":
                case "public":
                case "sealed":
                case "static":
                case "protected":
                case "private":
                case "-":
                case "non":
                case "final":
                case "transient":
                case "default":
                case "abstract":
                case "strictfp":
                    break;
                default:
                    return new C23380(AbstractC14545.of(), AbstractC14545.of());
            }
        }
        C22267 m49988 = C22267.m49988();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC13206 interfaceC13206 = (InterfaceC22900) it.next();
            Integer valueOf = Integer.valueOf(C3188.m9805(interfaceC13206));
            AbstractC5144 abstractC5144 = (AbstractC5144) interfaceC13206;
            AbstractC12117 abstractC12117 = ((C1323) m42940().m11138()).f4743;
            abstractC5144.getClass();
            m49988.mo3773(C13758.m33067(valueOf, Integer.valueOf(C7260.m19431(abstractC5144, abstractC12117))));
        }
        AbstractC14545 copyOf = AbstractC14545.copyOf((Collection) C20857.m47676(C5378.stream(c13675.m32890(C3188.m9805(interfaceC23790), new C9976(m49988))).filter(new C15448(i, m49988)).map(new C5742()), C5378.stream(list).map(new C11387())).sorted().collect(C22976.toList()));
        C1846 c1846 = new C1846();
        for (int size = copyOf.size() - 1; size >= 0; size--) {
            AbstractC17299 abstractC17299 = (AbstractC17299) copyOf.get(size);
            if (abstractC17299.mo26812().equals(EnumC18005.ANNOTATION)) {
                Cloneable mo41041 = abstractC17299.mo26811().mo41041();
                if (!(mo41041 instanceof InterfaceC13001) ? false : this.f12458.contains(((InterfaceC13001) mo41041).getName())) {
                    c1846.m16264(abstractC17299.mo26811());
                }
            }
            return new C23380(copyOf.subList(0, size + 1), c1846.m6131().mo34737());
        }
        return new C23380(copyOf.subList(0, size + 1), c1846.m6131().mo34737());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11764(ArrayDeque arrayDeque) {
        AbstractC17299 abstractC17299 = (AbstractC17299) arrayDeque.removeFirst();
        int ordinal = abstractC17299.mo26812().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            m11845((InterfaceC13206) abstractC17299.mo26811());
        } else {
            m11836(abstractC17299.mo38472().getText());
            if (abstractC17299.mo38472().getText().equals("non")) {
                m11836(((AbstractC17299) arrayDeque.removeFirst()).mo38472().getText());
                m11836(((AbstractC17299) arrayDeque.removeFirst()).mo38472().getText());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11761(int i, InterfaceC20058 interfaceC20058, ArrayList arrayList, ArrayList arrayList2) {
        if (interfaceC20058 instanceof InterfaceC16529) {
            InterfaceC16529 interfaceC16529 = (InterfaceC16529) interfaceC20058;
            if (C7260.m19433(((AbstractC5144) interfaceC16529).mo989()) == i) {
                m11761(i, interfaceC16529.mo23444(), arrayList, arrayList2);
                arrayList2.add(C3188.m9807(interfaceC20058));
                m11761(i, interfaceC16529.mo23443(), arrayList, arrayList2);
                return;
            }
            arrayList.add(interfaceC20058);
            return;
        }
        arrayList.add(interfaceC20058);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11847(l.C16646 r18, java.util.List r19) {
        /*
            r17 = this;
            boolean r0 = r18.isPresent()
            if (r0 != 0) goto Ld
            boolean r0 = r19.isEmpty()
            if (r0 == 0) goto Ld
            return
        Ld:
            l.ۚ۟ܺ r0 = l.C3894.f12455
            r12 = r17
            l.ܰ۟ܺ r13 = r12.f12459
            r13.m32896(r0)
            boolean r0 = r18.isPresent()
            java.lang.String r14 = ","
            r15 = 0
            r16 = 1
            if (r0 == 0) goto L81
            boolean r0 = r17.m11778()
            if (r0 == 0) goto L2a
            r13.m32914()
        L2a:
            l.᩷ۧۖ r2 = l.EnumC20828.PARAMETER
            l.ܺۧۖ r3 = l.EnumC15887.HORIZONTAL
            java.lang.Object r0 = r18.get()
            l.֫ۖ֨ r0 = (l.InterfaceC1527) r0
            l.ۖ֡۠ r0 = r0.mo5211()
            l.ܽ۫ᩴ r4 = l.C16646.of(r0)
            java.lang.Object r0 = r18.get()
            l.֫ۖ֨ r0 = (l.InterfaceC1527) r0
            l.۬ܺ֨ r5 = r0.getType()
            java.lang.Object r0 = r18.get()
            l.֫ۖ֨ r0 = (l.InterfaceC1527) r0
            l.ۤܶ۠ r6 = r0.getName()
            l.ܽ۫ᩴ r8 = l.C16646.empty()
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L5f
            l.ܽ۫ᩴ r0 = l.C16646.of(r14)
            goto L63
        L5f:
            l.ܽ۫ᩴ r0 = l.C16646.empty()
        L63:
            r9 = r0
            java.lang.Object r0 = r18.get()
            l.֫ۖ֨ r0 = (l.InterfaceC1527) r0
            l.۫᩵۠ r0 = r0.mo5212()
            l.ܽ۫ᩴ r10 = l.C16646.of(r0)
            l.ܽ۫ᩴ r11 = l.C16646.empty()
            java.lang.String r7 = ""
            r1 = r17
            r1.m11850(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r19
            r9 = r12
            goto Lc4
        L81:
            r0 = 0
            r0 = r19
            r9 = r12
            r1 = 0
        L86:
            int r2 = r0.size()
            if (r15 >= r2) goto Lc6
            java.lang.Object r2 = r0.get(r15)
            r5 = r2
            l.֫ۖ֨ r5 = (l.InterfaceC1527) r5
            boolean r2 = r9.m11778()
            if (r2 == 0) goto L9d
            r13.m32914()
            goto La2
        L9d:
            if (r1 == 0) goto La2
            r13.m32907()
        La2:
            l.᩷ۧۖ r3 = l.EnumC20828.PARAMETER
            l.ܺۧۖ r4 = l.EnumC15887.HORIZONTAL
            l.ܽ۫ᩴ r6 = l.C16646.empty()
            int r1 = r0.size()
            int r1 = r1 - r16
            if (r15 >= r1) goto Lb7
            l.ܽ۫ᩴ r1 = l.C16646.of(r14)
            goto Lbb
        Lb7:
            l.ܽ۫ᩴ r1 = l.C16646.empty()
        Lbb:
            r8 = r1
            java.lang.String r7 = "="
            r2 = r9
            r2.m11770(r3, r4, r5, r6, r7, r8)
            int r15 = r15 + 1
        Lc4:
            r1 = 1
            goto L86
        Lc6:
            r13.m32906()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3894.m11847(l.ܽ۫ᩴ, java.util.List):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11851(InterfaceC20969 interfaceC20969) {
        C13675 c13675;
        AbstractC22848 abstractC22848;
        Iterator it = interfaceC20969.getAnnotations().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c13675 = this.f12459;
            if (!hasNext) {
                break;
            }
            m11845((InterfaceC13206) it.next());
            c13675.m32914();
        }
        if (interfaceC20969.mo10982() == EnumC6857.OPEN) {
            m11836("open");
            c13675.m32907();
        }
        m11836(am.e);
        c13675.m32907();
        m11845((InterfaceC13206) interfaceC20969.getName());
        c13675.m32907();
        boolean isEmpty = interfaceC20969.mo10983().isEmpty();
        C5210 c5210 = this.f12464;
        if (isEmpty) {
            m11843(c5210);
            c13675.m32898(AbstractC22848.f73734);
            m11837(l.d, c5210);
            return;
        }
        c13675.m32896(c5210);
        m11836("{");
        c13675.m32914();
        C16646 empty = C16646.empty();
        Iterator it2 = interfaceC20969.mo10983().iterator();
        while (it2.hasNext()) {
            InterfaceC0301 interfaceC0301 = (InterfaceC0301) it2.next();
            m11855();
            if (((Boolean) empty.map(new C4331(0, interfaceC0301)).orElse(Boolean.FALSE)).booleanValue()) {
                abstractC22848 = AbstractC22848.f73736;
            } else {
                abstractC22848 = AbstractC22848.f73734;
            }
            c13675.m32898(abstractC22848);
            c13675.m32914();
            m11845(interfaceC0301);
            empty = C16646.of(interfaceC0301.mo987());
        }
        c13675.m32906();
        c13675.m32914();
        m11836(l.d);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11762(String str, String str2, InterfaceC20058 interfaceC20058, List list) {
        m11836(str);
        C13675 c13675 = this.f12459;
        c13675.m32907();
        m11845((InterfaceC13206) interfaceC20058);
        if (list != null) {
            c13675.m32896(this.f12460);
            c13675.m32907();
            m11836(str2);
            c13675.m32914();
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                InterfaceC20058 interfaceC200582 = (InterfaceC20058) it.next();
                if (z) {
                    m11836(",");
                    c13675.m32914();
                }
                m11845((InterfaceC13206) interfaceC200582);
                z = true;
            }
            m11836(l.b);
            c13675.m32906();
            return;
        }
        m11836(l.b);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m11777(InterfaceC13206 interfaceC13206) {
        ArrayDeque arrayDeque = new ArrayDeque();
        while (interfaceC13206 instanceof InterfaceC18146) {
            InterfaceC18146 interfaceC18146 = (InterfaceC18146) interfaceC13206;
            arrayDeque.addFirst(interfaceC18146.mo17273());
            interfaceC13206 = interfaceC18146.getExpression();
        }
        arrayDeque.addFirst(((InterfaceC13001) interfaceC13206).getName());
        Iterator it = arrayDeque.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC14812 interfaceC14812 = (InterfaceC14812) it.next();
            if (z) {
                m11836(".");
            }
            m11836(interfaceC14812.toString());
            z = true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11770(EnumC20828 enumC20828, EnumC15887 enumC15887, InterfaceC1527 interfaceC1527, C16646 c16646, String str, C16646 c166462) {
        C16646 empty;
        InterfaceC13206 interfaceC13206;
        m11854(interfaceC1527);
        if (interfaceC1527.getType() != null) {
            C9270 m22277 = C8564.m22277(interfaceC1527.getType(), EnumC20559.YES);
            C16646 of = C16646.of(m22277);
            interfaceC13206 = m22277.f28080;
            empty = of;
        } else {
            empty = C16646.empty();
            interfaceC13206 = null;
        }
        m11850(enumC20828, enumC15887, C16646.of(interfaceC1527.mo5211()), interfaceC13206, interfaceC1527.getName(), str, c16646, c166462, C16646.empty(), empty);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m11856(List list, AbstractC8032 abstractC8032) {
        C13675 c13675 = this.f12459;
        c13675.m32896(abstractC8032);
        c13675.m32896(f12455);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC11796 interfaceC11796 = (InterfaceC11796) it.next();
            if (z) {
                m11836(",");
                c13675.m32904();
            }
            m11845(interfaceC11796);
            z = true;
        }
        m11836(">");
        c13675.m32906();
        c13675.m32906();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[LOOP:2: B:33:0x00bd->B:180:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[LOOP:0: B:2:0x0009->B:190:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11844(l.AbstractC12612 r20) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3894.m11844(l.۫᩵۠):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11766(List list, boolean z, AbstractCollection abstractCollection, EnumC23554 enumC23554) {
        C5210 c5210;
        C13675 c13675;
        boolean z2;
        if (!abstractCollection.isEmpty()) {
            ((Integer) C8882.m22955(abstractCollection)).intValue();
            list.size();
        }
        int i = 0;
        while (true) {
            int size = abstractCollection.size();
            c5210 = f12455;
            c13675 = this.f12459;
            if (i >= size) {
                break;
            }
            c13675.m32896(c5210);
            i++;
        }
        ArrayDeque arrayDeque = new ArrayDeque(AbstractC23698.copyOf((Collection) abstractCollection));
        C7326 c7326 = new C7326();
        int i2 = 0;
        boolean z3 = false;
        while (i2 < list.size()) {
            InterfaceC20058 interfaceC20058 = (InterfaceC20058) list.get(i2);
            C5210 c52102 = this.f12460;
            if (z3) {
                c13675.m32896(c52102);
                z2 = true;
            } else {
                z2 = false;
            }
            if (i2 != 0 && m11778()) {
                if (!z2) {
                    c13675.m32896(c52102);
                    z2 = true;
                }
                c13675.m32914();
                z3 = true;
            }
            if (z) {
                m11836(".");
            } else if (z) {
                EnumC23554 enumC235542 = (arrayDeque.isEmpty() || i2 > ((Integer) arrayDeque.peekFirst()).intValue()) ? EnumC23554.UNIFIED : enumC23554;
                C16646 of = C16646.of(c7326);
                c13675.getClass();
                c13675.m32897(C14381.m34345(enumC235542, "", c5210, of));
                m11836(".");
            }
            C7326 c73262 = new C7326();
            m11769(interfaceC20058, C16646.of(c73262));
            if (!arrayDeque.isEmpty() && i2 == ((Integer) arrayDeque.peekFirst()).intValue()) {
                c13675.m32906();
                arrayDeque.removeFirst();
            }
            m11768(interfaceC20058, C0976.m3441(c73262, c52102, c5210), c52102);
            if (z2) {
                c13675.m32906();
            }
            i2++;
            z = true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11769(InterfaceC20058 interfaceC20058, C16646 c16646) {
        InterfaceC20058 m11760 = m11760(interfaceC20058);
        switch (C7153.f21954[m11760.mo987().ordinal()]) {
            case 9:
                m11846(((InterfaceC18146) m11760).mo17273());
                break;
            case 10:
                InterfaceC17440 interfaceC17440 = (InterfaceC17440) m11760;
                if (!interfaceC17440.mo36748().isEmpty()) {
                    C5210 c5210 = this.f12460;
                    C13675 c13675 = this.f12459;
                    c13675.m32896(c5210);
                    C2609 mo36748 = interfaceC17440.mo36748();
                    C5210 c52102 = f12455;
                    m11853(mo36748, c52102);
                    c13675.m32897(C14381.m34345(EnumC23554.UNIFIED, "", c52102, c16646));
                    c13675.m32906();
                }
                m11846(C3188.m9808(interfaceC17440));
                break;
            case 11:
                m11846(((InterfaceC13001) m11760).getName());
                break;
            default:
                m11845((InterfaceC13206) m11760);
                break;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC20058 m11760(InterfaceC20058 interfaceC20058) {
        while (interfaceC20058 instanceof InterfaceC13727) {
            interfaceC20058 = ((InterfaceC13727) interfaceC20058).getExpression();
        }
        return interfaceC20058;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m11774(ArrayDeque arrayDeque) {
        if (arrayDeque.isEmpty()) {
            return;
        }
        C5210 c5210 = f12455;
        C13675 c13675 = this.f12459;
        c13675.m32896(c5210);
        do {
            m11836("[");
            c13675.m32909();
            m11845((InterfaceC13206) arrayDeque.removeLast());
            m11836("]");
        } while (!arrayDeque.isEmpty());
        c13675.m32906();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11768(InterfaceC20058 interfaceC20058, C0976 c0976, AbstractC8032 abstractC8032) {
        ArrayDeque arrayDeque = new ArrayDeque();
        InterfaceC20058 interfaceC200582 = interfaceC20058;
        while (interfaceC200582 instanceof InterfaceC13727) {
            InterfaceC13727 interfaceC13727 = (InterfaceC13727) interfaceC200582;
            arrayDeque.addLast(interfaceC13727.getIndex());
            interfaceC200582 = interfaceC13727.getExpression();
        }
        InterfaceC20058 m11760 = m11760(interfaceC20058);
        if (C7153.f21954[m11760.mo987().ordinal()] == 10) {
            C13675 c13675 = this.f12459;
            c13675.m32896(c0976);
            m11839((List) ((InterfaceC17440) m11760).mo36750(), abstractC8032);
            c13675.m32906();
        }
        m11774(arrayDeque);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11853(List list, AbstractC8032 abstractC8032) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m11836("<");
        C13675 c13675 = this.f12459;
        c13675.m32896(abstractC8032);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC13206 interfaceC13206 = (InterfaceC13206) it.next();
            if (z) {
                m11836(",");
                c13675.m32912();
            }
            m11845(interfaceC13206);
            z = true;
        }
        c13675.m32906();
        m11836(">");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11839(List list, AbstractC8032 abstractC8032) {
        m11836(MotionUtils.EASING_TYPE_FORMAT_START);
        boolean isEmpty = list.isEmpty();
        C13675 c13675 = this.f12459;
        boolean z = false;
        if (!isEmpty) {
            Iterator it = list.iterator();
            z = false;
            int i = 0;
            while (it.hasNext()) {
                InterfaceC20058 interfaceC20058 = (InterfaceC20058) it.next();
                InterfaceC21438 m32903 = c13675.m32903(i);
                C11003.requireNonNull(m32903);
                InterfaceC21438 m329032 = c13675.m32903(i != 0 ? 0 : -1);
                C11003.requireNonNull(m329032);
                InterfaceC21438 m329033 = c13675.m32903(i == 0 ? -2 : -1);
                if (i != 0) {
                    if ((m329033 != null && m11771(m329033.mo48559())) || m11771(m329032.mo48558())) {
                        if (!z) {
                            c13675.m32896(abstractC8032);
                            z = true;
                        }
                        c13675.m32914();
                    }
                    m11836(",");
                }
                if (m11771(m329032.mo48559()) || m11771(m32903.mo48558())) {
                    if (!z) {
                        c13675.m32896(abstractC8032);
                        z = true;
                    }
                    c13675.m32914();
                } else if (i != 0) {
                    c13675.m32907();
                }
                m11845((InterfaceC13206) interfaceC20058);
                i = 1;
            }
        }
        if (z) {
            c13675.m32906();
        }
        if (!list.isEmpty() && m11778()) {
            c13675.m32914();
        }
        m11837(MotionUtils.EASING_TYPE_FORMAT_END, abstractC8032);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m11776(ArrayDeque arrayDeque) {
        m11765(new ArrayDeque(), (Deque) arrayDeque);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11840(java.util.List r10, l.EnumC14476 r11, l.EnumC2483 r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3894.m11840(java.util.List, l.ܳۧۖ, l.ۖۧۖ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11763(String str, List list) {
        if (list.isEmpty()) {
            return;
        }
        C13675 c13675 = this.f12459;
        c13675.m32912();
        c13675.m32896(list.size() > 1 ? this.f12460 : f12455);
        m11836(str);
        c13675.m32907();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            InterfaceC13206 interfaceC13206 = (InterfaceC13206) it.next();
            if (z) {
                m11836(",");
                c13675.m32904();
            }
            m11845(interfaceC13206);
            z = true;
        }
        c13675.m32906();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m11756(InterfaceC5998 interfaceC5998, InterfaceC13206 interfaceC13206) {
        ArrayList arrayList = new ArrayList();
        if (interfaceC13206.mo987() == EnumC3329.VARIABLE) {
            int m9805 = C3188.m9805(interfaceC13206);
            arrayList.add((InterfaceC1527) interfaceC13206);
            while (interfaceC5998.hasNext() && ((InterfaceC13206) interfaceC5998.peek()).mo987() == EnumC3329.VARIABLE && C3188.m9805((InterfaceC13206) interfaceC5998.peek()) == m9805) {
                arrayList.add((InterfaceC1527) interfaceC5998.next());
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC15887 m11759(InterfaceC23790 interfaceC23790) {
        Iterator it = interfaceC23790.getAnnotations().iterator();
        while (it.hasNext()) {
            if (!((InterfaceC22900) it.next()).mo41040().isEmpty()) {
                return EnumC15887.VERTICAL;
            }
        }
        return EnumC15887.HORIZONTAL;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11836(String str) {
        this.f12459.m32894(str, EnumC15792.REAL, f12455, C16646.empty());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11837(String str, AbstractC8032 abstractC8032) {
        this.f12459.m32894(str, EnumC15792.REAL, abstractC8032, C16646.empty());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11843(AbstractC8032 abstractC8032) {
        this.f12459.m32894("{", EnumC15792.REAL, f12455, C16646.of(abstractC8032));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11854(InterfaceC13206 interfaceC13206) {
        AbstractC5144 abstractC5144 = (AbstractC5144) interfaceC13206;
        abstractC5144.getClass();
        this.f12459.m32913(C7260.m19455(abstractC5144));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11850(EnumC20828 enumC20828, EnumC15887 enumC15887, C16646 c16646, InterfaceC13206 interfaceC13206, InterfaceC14812 interfaceC14812, String str, C16646 c166462, C16646 c166463, C16646 c166464, C16646 c166465) {
        C7326 c7326 = new C7326();
        C7326 c73262 = new C7326();
        boolean z = true;
        boolean z2 = enumC20828 == EnumC20828.FIELD;
        C13675 c13675 = this.f12459;
        if (z2) {
            c13675.m32898(AbstractC22848.m50960(c73262));
        }
        ArrayDeque arrayDeque = new ArrayDeque(c166465.isPresent() ? ((C9270) c166465.get()).f28079 : AbstractC14545.of());
        AbstractC8833 abstractC8833 = (AbstractC8833) c16646.map(new Function() { // from class: l.ܰ֫ۖ
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                InterfaceC23790 interfaceC23790 = (InterfaceC23790) obj;
                return C3894.this.m11835(interfaceC23790, (List) interfaceC23790.getAnnotations());
            }
        }).orElse(new C23380(AbstractC14545.of(), AbstractC14545.of()));
        EnumC20828 enumC208282 = EnumC20828.PARAMETER;
        C5210 c5210 = f12455;
        C5210 c52102 = this.f12460;
        c13675.m32896((enumC20828 == enumC208282 && abstractC8833.m22827()) ? c52102 : c5210);
        AbstractC14545 m11758 = m11758(abstractC8833, enumC15887, C16646.of(c73262));
        boolean z3 = ((String) c13675.m32908(0).get()).equals("var") && (!interfaceC14812.mo26175("var") || ((String) c13675.m32908(1).get()).equals("var"));
        if (interfaceC13206 == null && !z3) {
            z = false;
        }
        c13675.m32896(c5210);
        c13675.m32896(c5210);
        c13675.m32896(c5210);
        m11842(m11758, EnumC23649.NO, EnumC23649.YES);
        if (c166465.isPresent() && ((C9270) c166465.get()).f28080 != null) {
            m11845(((C9270) c166465.get()).f28080);
            arrayDeque.size();
            c13675.m32896(c52102);
            m11776(arrayDeque);
            c13675.m32906();
            arrayDeque.size();
        } else if (z3) {
            m11836("var");
        } else {
            m11845(interfaceC13206);
        }
        c13675.m32906();
        if (z) {
            c13675.m32907();
        }
        c13675.m32896(C0976.m3441(c7326, c52102, c5210));
        if (c166464.isPresent()) {
            m11845((InterfaceC13206) c166464.get());
        } else {
            m11846(interfaceC14812);
        }
        c13675.m32910("");
        m11776(arrayDeque);
        c13675.m32906();
        c13675.m32906();
        if (c166462.isPresent()) {
            c13675.m32907();
            m11836(str);
            if (((InterfaceC20058) c166462.get()).mo987() == EnumC3329.NEW_ARRAY && ((InterfaceC9680) c166462.get()).getType() == null) {
                c13675.m32907();
                ((InterfaceC20058) c166462.get()).mo986(this, null);
            } else {
                c13675.m32896(C0976.m3441(c7326, c52102, c5210));
                c13675.m32907();
                m11845((InterfaceC13206) c166462.get());
                c13675.m32906();
            }
        }
        if (c166463.isPresent() && c13675.m32908(0).equals(c166463)) {
            c13675.m32905((String) c166463.get());
        }
        c13675.m32906();
        c13675.m32906();
        if (z2) {
            c13675.m32898(AbstractC22848.m50960(c73262));
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m11778() {
        C13675 c13675 = this.f12459;
        return m11772(c13675.m32903(-1), c13675.m32903(0));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11772(InterfaceC21438 interfaceC21438, InterfaceC21438 interfaceC214382) {
        if (interfaceC21438 == null || !m11771(interfaceC21438.mo48559())) {
            return interfaceC214382 != null && m11771(interfaceC214382.mo48558());
        }
        return true;
    }

    public final String toString() {
        C8964 m37871 = C16018.m37871(this);
        m37871.m23110(this.f12459, "builder");
        return m37871.toString();
    }
}
