package l;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.bouncycastle.crypto.prng.X931RNG;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: 843X */
/* renamed from: l.᩷ۚ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20661 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66445;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66446;

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public final C0052 f66447;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66448;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66449;

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66450;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66451;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C7254 f66452;

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66453;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7254 f66454;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66455;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66456;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C12193 f66457;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final C14163 f66458;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashMap f66459;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6403 f66460;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308[] f66461;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14163 f66462;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f66463;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66464;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final C0052 f66465;

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public final C19955 f66466;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66467;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public final C19955 f66468;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C7254 f66469;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final C7254 f66470;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66471;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC6403 f66472;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public final C21926 f66473;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66474;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final AbstractC19810 f66475;

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66476;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370[] f66477;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66478;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66479;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C14163 f66480;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C14163 f66481;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66482;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7254 f66483;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final C19955 f66484;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66485;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66486;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66487;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66488;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66489;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66490;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66491;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66492;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final C19955 f66493;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66494;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66495;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3581 f66496;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66497;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66498;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C7254 f66499;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66500;

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public final C1485 f66501;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C7254 f66502;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66503;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66504;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14163 f66505;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66506;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66507;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66508;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C0052 f66509;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66510;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3581 f66511;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66512;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final C7254 f66513;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66514;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f66515;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public final C14163 f66516;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final HashMap f66517;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final C6136 f66518;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public final C14890 f66519;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0052 f66520;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66521;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66522;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C14602 f66523;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66524;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3581 f66525;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66526;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14163 f66527;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66528;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66529;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66530;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66531;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C12048 f66532;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f66533;

    /* renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public static final C4314 f66444 = new C4314();

    /* renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f66443 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20661 m47250(C2903 c2903) {
        C20661 c20661 = (C20661) c2903.m8838(f66444);
        return c20661 == null ? new C20661(c2903) : c20661;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12048 m47259(final AbstractC4308 abstractC4308, final C6319 c6319) {
        return (C12048) C13843.computeIfAbsent(this.f66459, new C10553(abstractC4308, c6319), new Function() { // from class: l.᩺֡֨
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C20661.m47249(c6319, this, abstractC4308);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C12048 m47249(C6319 c6319, C20661 c20661, AbstractC4308 abstractC4308) {
        AbstractC4308 m17519;
        AbstractC4308 abstractC43082 = c20661.f66514;
        if (abstractC4308.mo3258() == EnumC9454.ARRAY || abstractC4308.mo3258() == EnumC9454.CLASS) {
            m17519 = c6319.m17519(abstractC4308);
        } else if (abstractC4308.mo12907()) {
            m17519 = c6319.m17496(abstractC4308).f17560;
        } else {
            throw new AssertionError(abstractC4308);
        }
        return new C12048(25L, c20661.f66518.f18894, new C19955(abstractC43082.f13890, abstractC43082.mo4958(), C2609.of((Object) m17519)), abstractC4308.f13890);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47264(AbstractC4308 abstractC4308, String str, String str2) {
        C6136 c6136 = this.f66518;
        AbstractC12486 abstractC12486 = c6136.f18880;
        abstractC12486.getClass();
        char[] charArray = str.toCharArray();
        abstractC4308.f13890 = new C14163(1L, abstractC12486.mo15927(charArray, charArray.length), abstractC4308, this.f66473);
        this.f66461[abstractC4308.mo3258().ordinal()] = abstractC4308;
        this.f66477[abstractC4308.mo3258().ordinal()] = c6136.f18880.m30652("java.lang.".concat(str2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC4308 m47247(String str) {
        AbstractC12486 abstractC12486 = this.f66518.f18880;
        abstractC12486.getClass();
        char[] charArray = str.toCharArray();
        return m47260(this.f66509, abstractC12486.mo15927(charArray, charArray.length)).f17560;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47267(AbstractC4308 abstractC4308) {
        AbstractC19810 abstractC19810 = abstractC4308.f13890;
        abstractC19810.f17564 = new C10783(this, abstractC19810.f17564);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47263(AbstractC4308 abstractC4308) {
        C14163 m47260 = m47260(this.f66509, this.f66477[abstractC4308.mo3258().ordinal()]);
        m47260.f17564 = new C16426(this, m47260.f17564, abstractC4308);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C19955 m47254(String str) {
        AbstractC12486 abstractC12486 = this.f66518.f18880;
        abstractC12486.getClass();
        char[] charArray = str.toCharArray();
        C19955 c19955 = (C19955) m47260(this.f66509, abstractC12486.mo15927(charArray, charArray.length)).f17560;
        C14163 c14163 = (C14163) c19955.f13890;
        c14163.f17564 = InterfaceC6403.f19811;
        c14163.f17563 = 1073750529L;
        c14163.f17565 = c19955;
        c14163.f42762 = new C10490(c14163);
        c19955.f64616 = C2609.m8239();
        c19955.f64617 = C2609.m8239();
        c19955.f64618 = this.f66485;
        c19955.f64620 = C2609.m8239();
        return c19955;
    }

    public C20661(C2903 c2903) {
        C0052 c0052;
        C7254 c7254 = new C7254(EnumC9454.BYTE);
        this.f66502 = c7254;
        C7254 c72542 = new C7254(EnumC9454.CHAR);
        this.f66454 = c72542;
        C7254 c72543 = new C7254(EnumC9454.SHORT);
        this.f66513 = c72543;
        C7254 c72544 = new C7254(EnumC9454.INT);
        this.f66452 = c72544;
        C7254 c72545 = new C7254(EnumC9454.LONG);
        this.f66470 = c72545;
        C7254 c72546 = new C7254(EnumC9454.FLOAT);
        this.f66483 = c72546;
        C7254 c72547 = new C7254(EnumC9454.DOUBLE);
        this.f66499 = c72547;
        C7254 c72548 = new C7254(EnumC9454.BOOLEAN);
        this.f66469 = c72548;
        C20743 c20743 = C20743.f66779;
        C0904 c0904 = new C0904(null, c20743);
        this.f66522 = c0904;
        C1485 c1485 = new C1485(null, c20743);
        this.f66501 = c1485;
        AbstractC4308[] abstractC4308Arr = new AbstractC4308[EnumC9454.m24294()];
        this.f66461 = abstractC4308Arr;
        this.f66477 = new AbstractC10370[EnumC9454.m24294()];
        this.f66517 = new HashMap();
        this.f66463 = new HashMap();
        this.f66515 = new LinkedHashMap();
        this.f66459 = new HashMap();
        c2903.m8841(f66444, this);
        C6136 m17057 = C6136.m17057(c2903);
        AbstractC12486 abstractC12486 = m17057.f18880;
        AbstractC10370 abstractC10370 = m17057.f18867;
        this.f66518 = m17057;
        C14890 c14890 = new C14890(null, c20743);
        this.f66519 = c14890;
        this.f66523 = C14602.m34851(c2903);
        C4314 c4314 = C3413.f10789;
        C3413 c3413 = (C3413) c2903.m8838(c4314);
        if (c3413 == null) {
            c3413 = new C3413();
            c2903.m8841(c4314, c3413);
            C6136.m17057(c2903);
        }
        C21926 c21926 = new C21926(abstractC10370, c3413, EnumC10892.m27201(c2903).m27202());
        this.f66473 = c21926;
        C0052 c17838 = new C17838(this, abstractC10370);
        this.f66447 = c17838;
        m47251(c17838);
        c17838.f928 = c17838.f928.m8246(c17838.f918);
        C0052 c17132 = new C17132(abstractC10370);
        c17132.f920 = C2609.m8239();
        c17132.f921 = C2609.m8239();
        c17132.f925 = C2609.m8239();
        c17132.f917 = C2609.m8239();
        c17132.f929 = C2609.of((Object) new C9764(m47258(this.f66518.f18810), EnumSet.of(EnumC9058.MANDATED)));
        this.f66520 = c17132;
        m47251(c17132);
        C0052 c14309 = new C14309(abstractC10370);
        this.f66465 = c14309;
        m47251(c14309);
        EnumC1296 enumC1296 = EnumC1296.f4577;
        AbstractC10370 abstractC103702 = m17057.f18867;
        C11488 c11488 = AbstractC4308.f13885;
        C23482 c23482 = new C23482(enumC1296, 0L, abstractC103702, c11488, c21926);
        this.f66475 = c23482;
        C14163 c14163 = new C14163(1073741833L, m17057.f18848, null, c21926);
        this.f66462 = c14163;
        C12193 c12193 = new C12193(c14163, c11488);
        this.f66457 = c12193;
        abstractC12486.getClass();
        char[] charArray = "<any?>".toCharArray();
        C14163 c141632 = new C14163(1073741833L, abstractC12486.mo15927(charArray, charArray.length), null, c21926);
        this.f66516 = c141632;
        c141632.f42762 = new C23895((AbstractC5698) c141632);
        c141632.f17560 = c14890;
        m47264(c7254, ClassTransform.BYTE, "Byte");
        m47264(c72543, ClassTransform.SHORT, "Short");
        m47264(c72542, ClassTransform.CHARACTER, "Character");
        m47264(c72544, ClassTransform.INTEGER, "Integer");
        m47264(c72545, ClassTransform.LONG, "Long");
        m47264(c72546, ClassTransform.FLOAT, "Float");
        m47264(c72547, ClassTransform.DOUBLE, "Double");
        m47264(c72548, ClassTransform.BOOLEAN, "Boolean");
        m47264(c1485, ClassTransform.VOID, "Void");
        abstractC12486.getClass();
        char[] charArray2 = "<nulltype>".toCharArray();
        c0904.f13890 = new C14163(1L, abstractC12486.mo15927(charArray2, charArray2.length), c0904, c21926);
        abstractC4308Arr[c0904.mo3258().ordinal()] = c0904;
        c12193.f13890 = c14163;
        abstractC4308Arr[c12193.mo3258().ordinal()] = c12193;
        c14890.f13890 = c141632;
        abstractC4308Arr[c14890.mo3258().ordinal()] = c14890;
        C14163 c141633 = new C14163(1073741825L, m17057.f18873, c23482);
        this.f66505 = c141633;
        C14163 c141634 = new C14163(1073741825L, m17057.f18853, c23482);
        this.f66480 = c141634;
        c141634.f42762 = new C23895((AbstractC5698) c141634);
        C14163 c141635 = new C14163(1073741825L, m17057.f18796, c23482);
        this.f66481 = c141635;
        c141635.f42762 = new C23895((AbstractC5698) c141634);
        C14163 c141636 = new C14163(1073741825L, abstractC10370, c21926);
        this.f66458 = c141636;
        C10490 c10490 = new C10490(c141636);
        c141636.f42762 = c10490;
        this.f66472 = C19914.m45820(c2903).m45828();
        c21926.f24145 = new C10490(c21926);
        c10490.mo26382(c7254.f13890);
        c10490.mo26382(c72543.f13890);
        c10490.mo26382(c72542.f13890);
        c10490.mo26382(c72544.f13890);
        c10490.mo26382(c72545.f13890);
        c10490.mo26382(c72546.f13890);
        c10490.mo26382(c72547.f13890);
        c10490.mo26382(c72548.f13890);
        c10490.mo26382(c12193.f13890);
        c10490.mo26382(c14163);
        if (EnumC10637.f32009.m26686(EnumC16280.m38301(c2903))) {
            C0052 m47258 = m47258(m17057.f18810);
            this.f66509 = m47258;
            m47258.f17564 = InterfaceC6403.f19811;
            m47258.f913 = Collections.EMPTY_MAP;
            c0052 = c14309;
        } else {
            c0052 = c14309;
            this.f66509 = c0052;
        }
        InterfaceC6403 m10063 = C3267.m10022(c2903).m10063();
        this.f66460 = m10063;
        AbstractC4308 m47247 = m47247("java.lang.Object");
        this.f66526 = m47247;
        this.f66500 = m47247("java.lang.runtime.ObjectMethods");
        this.f66528 = m47247("java.util.Objects");
        this.f66514 = m47247("java.lang.Class");
        this.f66533 = m47247("java.lang.String");
        m47247("java.lang.StringBuffer");
        this.f66510 = m47247("java.lang.StringBuilder");
        AbstractC4308 m472472 = m47247("java.lang.Cloneable");
        this.f66445 = m472472;
        this.f66479 = m47247("java.lang.Throwable");
        AbstractC4308 m472473 = m47247("java.io.Serializable");
        this.f66487 = m472473;
        AbstractC4308 m472474 = m47247("java.lang.invoke.SerializedLambda");
        this.f66507 = m472474;
        this.f66476 = m47247("java.lang.invoke.VarHandle");
        this.f66503 = m47247("java.lang.invoke.MethodHandle");
        this.f66478 = m47247("java.lang.invoke.MethodHandles$Lookup");
        this.f66455 = m47247("java.lang.invoke.MethodType");
        this.f66492 = m47247("java.lang.Error");
        this.f66488 = m47247("java.lang.IllegalArgumentException");
        this.f66486 = m47247("java.lang.InterruptedException");
        AbstractC4308 m472475 = m47247("java.lang.Exception");
        this.f66490 = m472475;
        this.f66453 = m47247("java.lang.RuntimeException");
        m47247("java.lang.ClassNotFoundException");
        m47247("java.lang.NoClassDefFoundError");
        this.f66449 = m47247("java.lang.NoSuchFieldError");
        this.f66508 = m47247("java.lang.AssertionError");
        this.f66529 = m47247("java.lang.IncompatibleClassChangeError");
        m47247("java.lang.CloneNotSupportedException");
        this.f66485 = m47247("java.lang.annotation.Annotation");
        m47247("java.lang.ClassLoader");
        C14163 m47260 = m47260(this.f66509, m17057.f18899);
        this.f66527 = m47260;
        C0052 c00522 = c0052;
        this.f66525 = new C3581(137438953492L, m17057.f18891, new C10658(C2609.m8239(), c1485, C2609.m8239(), c141635), m47260);
        m47247("java.util.List");
        m47247("java.util.Collections");
        m47247("java.lang.Comparable");
        this.f66464 = m47247("java.util.Comparator");
        m47247("java.util.Arrays");
        this.f66506 = m47247("java.lang.Iterable");
        this.f66512 = m47247("java.util.Iterator");
        this.f66451 = m47247("java.lang.annotation.Target");
        this.f66521 = m47247("java.lang.Override");
        this.f66495 = m47247("java.lang.annotation.Retention");
        this.f66448 = m47247("java.lang.Deprecated");
        this.f66471 = m47247("java.lang.SuppressWarnings");
        m47247("java.util.function.Supplier");
        this.f66494 = m47247("java.lang.annotation.Inherited");
        this.f66530 = m47247("java.lang.annotation.Repeatable");
        this.f66474 = m47247("java.lang.annotation.Documented");
        m47247("java.lang.annotation.ElementType");
        this.f66482 = m47247("java.lang.System");
        AbstractC4308 m472476 = m47247("java.lang.AutoCloseable");
        this.f66531 = m472476;
        this.f66496 = new C3581(1L, m17057.f18851, new C10658(C2609.m8239(), c1485, C2609.of((Object) m472475), c141635), m472476.f13890);
        this.f66504 = m47247("java.lang.SafeVarargs");
        this.f66446 = m47247("java.lang.annotation.Native");
        AbstractC4308 m472477 = m47247("java.lang.invoke.LambdaMetafactory");
        this.f66497 = m472477;
        AbstractC4308 m472478 = m47247("java.lang.invoke.StringConcatFactory");
        this.f66498 = m472478;
        this.f66467 = m47247("java.lang.FunctionalInterface");
        this.f66491 = m47247("jdk.internal.javac.PreviewFeature");
        this.f66493 = m47254("jdk.internal.PreviewFeature+Annotation");
        this.f66456 = m47247("java.lang.invoke.TypeDescriptor");
        this.f66489 = m47247("java.lang.Record");
        this.f66524 = m47247("java.lang.runtime.SwitchBootstraps");
        this.f66450 = m47247("jdk.internal.ValueBased");
        this.f66466 = m47254("jdk.internal.ValueBased+Annotation");
        m47267(m472476);
        m47267(m472472);
        m47267(m472473);
        m47267(m472477);
        m47267(m472474);
        m47267(m472478);
        m47263(c72547);
        m47263(c72546);
        m47263(c1485);
        this.f66468 = m47254("sun.Proprietary+Annotation");
        C19955 m47254 = m47254("jdk.Profile+Annotation");
        this.f66484 = m47254;
        m47254.f13890.mo16064().mo26382(new C3581(1025L, m17057.f18860, c72544, m47254.f13890));
        C19955 c19955 = (C19955) c141633.f17560;
        c19955.f64618 = m47247;
        c19955.f64620 = C2609.of((Object) m472472, (Object) m472473);
        c141633.f42762 = new C10490(c141633);
        C12048 c12048 = new C12048(17L, m17057.f18798, c72544, c141633);
        this.f66532 = c12048;
        c141633.mo16101();
        c141633.f42762.mo26382(c12048);
        C3581 c3581 = new C3581(1L, m17057.f18902, new C10658(C2609.m8239(), m47247, C2609.m8239(), c141635), c141633);
        this.f66511 = c3581;
        c141633.mo16101();
        c141633.f42762.mo26382(c3581);
        C0052 c00523 = this.f66509;
        if (c00523 != c00522) {
            C11003.requireNonNull(m10063);
            c00523.f17564 = new C17245(5, m10063);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14163 m47262(AbstractC10370 abstractC10370, AbstractC5698 abstractC5698) {
        C14163 c14163 = new C14163(0L, abstractC10370, abstractC5698);
        c14163.f17564 = this.f66472;
        return c14163;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14163 m47261(C0052 c0052, AbstractC10370 abstractC10370, AbstractC19810 abstractC19810) {
        C12171.m29637(c0052);
        C14163 m47270 = m47270(c0052, AbstractC19810.m45552(abstractC10370, abstractC19810));
        if (m47270 == null) {
            C14163 m47262 = m47262(abstractC10370, abstractC19810);
            ((Map) C13843.computeIfAbsent(this.f66517, m47262.f42771, new C6161(2))).put(c0052, m47262);
            return m47262;
        }
        if ((m47270.f17562 != abstractC10370 || m47270.f17561 != abstractC19810) && abstractC19810.f17559 == EnumC1296.f4582) {
            AbstractC5698 abstractC5698 = m47270.f17561;
            if (abstractC5698.f17559 == EnumC1296.f4579) {
                abstractC5698.mo16064().mo26384(m47270);
                m47270.f17562 = abstractC10370;
                m47270.f17561 = abstractC19810;
                m47270.f42767 = AbstractC19810.m45553(abstractC10370, abstractC19810);
            }
        }
        return m47270;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14163 m47270(C0052 c0052, final AbstractC10370 abstractC10370) {
        C11003.requireNonNull(abstractC10370);
        C12171.m29638(c0052, new Supplier() { // from class: l.ܰ֡֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return AbstractC10370.this.toString();
            }
        });
        return (C14163) ((Map) C13843.getOrDefault(this.f66517, abstractC10370, Collections.EMPTY_MAP)).get(c0052);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7814 m47272(C0052 c0052, AbstractC10370 abstractC10370) {
        return m47248(c0052, abstractC10370, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C7814 m47248(C0052 c0052, AbstractC10370 abstractC10370, boolean z) {
        C12171.m29637(c0052);
        if (abstractC10370.isEmpty()) {
            return c0052.f918;
        }
        if (c0052 == this.f66465) {
            return m47266(c0052, abstractC10370);
        }
        c0052.mo16101();
        C7814 c7814 = (C7814) c0052.f913.get(abstractC10370);
        if (c7814 != null) {
            return c7814;
        }
        C7814 m47274 = m47274(c0052, abstractC10370);
        if ((m47274 != null && m47274.mo15574()) || z) {
            return m47274;
        }
        C2609 c2609 = c0052.f929;
        if (c2609 != null && C5378.stream(c2609).map(new C23147(10)).anyMatch(new Predicate() { // from class: l.۟֡֨
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
                return ((C0052) obj) == C20661.this.f66447;
            }
        })) {
            C0052 c00522 = this.f66447;
            C7814 m472742 = m47274(c00522, abstractC10370);
            if (m472742 != null && m472742.mo15574()) {
                c0052.f913.put(m472742.f24143, m472742);
                return m472742;
            }
            C7814 m47266 = m47266(c0052, abstractC10370);
            m47266.mo16101();
            if (!m47266.mo15574()) {
                C7814 m472662 = m47266(c00522, abstractC10370);
                m472662.mo16101();
                if (m472662.mo15574()) {
                    c0052.f913.put(m472662.f24143, m472662);
                    return m472662;
                }
            }
            return m47266;
        }
        return m47266(c0052, abstractC10370);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m47275(C0052 c0052, AbstractC10370 abstractC10370) {
        ((Map) C13843.getOrDefault(this.f66517, abstractC10370, f66443)).remove(c0052);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14163 m47260(C0052 c0052, AbstractC10370 abstractC10370) {
        C12171.m29637(c0052);
        C7814 m47248 = m47248(c0052, abstractC10370.m26172(0, abstractC10370.m26170((byte) 46)), false);
        C12171.m29637(m47248);
        C12171.m29637(m47248.f24147);
        C14163 m47270 = m47270(m47248.f24147, abstractC10370);
        if (m47270 != null) {
            return m47270;
        }
        C14163 m47262 = m47262(C12780.m31093(abstractC10370), m47248);
        ((Map) C13843.computeIfAbsent(this.f66517, m47262.f42771, new C6161(2))).put(m47248.f24147, m47262);
        return m47262;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m47268(C0052 c0052, AbstractC10370 abstractC10370) {
        C12171.m29637(c0052);
        C7814 m47248 = m47248(c0052, abstractC10370, true);
        return m47248 != null && m47248.mo15574();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7814 m47266(final C0052 c0052, AbstractC10370 abstractC10370) {
        C12171.m29637(c0052);
        C7814 m47274 = m47274(c0052, abstractC10370);
        if (m47274 != null) {
            return m47274;
        }
        C12171.m29643(!abstractC10370.isEmpty(), new Supplier() { // from class: l.֫ۚ֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return "rootPackage missing!; currModule: " + C0052.this;
            }
        });
        C7814 c7814 = new C7814(C12780.m31093(abstractC10370), m47266(c0052, abstractC10370.m26172(0, abstractC10370.m26170((byte) 46))));
        c7814.f17564 = this.f66472;
        c7814.f24147 = c0052;
        ((Map) C13843.computeIfAbsent(this.f66463, c7814.f24143, new C3433(6))).put(c0052, c7814);
        c0052.f928 = c0052.f928.m8246(c7814);
        return c7814;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47251(C0052 c0052) {
        C21926 c21926 = this.f66473;
        ((Map) C13843.computeIfAbsent(this.f66463, c21926.f24143, new C3433(6))).put(c0052, c21926);
        c0052.f928 = c0052.f928.m8246(c21926);
        C6549 c6549 = new C6549(this, this.f66518.f18867, c21926);
        c6549.f24147 = c0052;
        c6549.f17564 = new C2144(this);
        c6549.f17563 |= X931RNG.BLOCK128_RESEED_MAX;
        c0052.f918 = c6549;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7814 m47274(C0052 c0052, AbstractC10370 abstractC10370) {
        return (C7814) ((Map) C13843.getOrDefault(this.f66463, abstractC10370, Collections.EMPTY_MAP)).get(c0052);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0052 m47258(AbstractC10370 abstractC10370) {
        LinkedHashMap linkedHashMap = this.f66515;
        C0052 c0052 = (C0052) linkedHashMap.get(abstractC10370);
        if (c0052 != null) {
            return c0052;
        }
        AbstractC10370 abstractC103702 = this.f66518.f18843;
        C0052 c00522 = new C0052(abstractC10370);
        C14163 c14163 = new C14163(2251799813685248L, abstractC103702, c00522);
        AbstractC10370 m45553 = AbstractC19810.m45553(abstractC103702, c00522);
        c14163.f42767 = m45553;
        c14163.f42771 = m45553;
        c14163.f42762 = new C10490(c14163);
        c00522.f911 = c14163;
        m47251(c00522);
        c00522.f17564 = new C23786(7, this);
        linkedHashMap.put(abstractC10370, c00522);
        return c00522;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0052 m47269(AbstractC10370 abstractC10370) {
        return (C0052) this.f66515.get(abstractC10370);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2609 m47271(AbstractC10370 abstractC10370) {
        if (abstractC10370.isEmpty()) {
            return C2609.m8239();
        }
        C2609 m8239 = C2609.m8239();
        Map map = (Map) this.f66463.get(abstractC10370);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C7814 c7814 = (C7814) entry.getValue();
                c7814.mo16101();
                if (!c7814.f24145.m20480()) {
                    m8239 = m8239.m8246((C0052) entry.getKey());
                }
            }
        }
        return m8239;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Collection m47257() {
        return this.f66515.values();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Collection m47265(AbstractC10370 abstractC10370) {
        return ((Map) C13843.getOrDefault(this.f66517, abstractC10370, Collections.EMPTY_MAP)).values();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Collection m47273(AbstractC10370 abstractC10370) {
        return ((Map) C13843.getOrDefault(this.f66463, abstractC10370, Collections.EMPTY_MAP)).values();
    }
}
