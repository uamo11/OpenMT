package l;

import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: 643O */
/* renamed from: l.ۘ֡֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C3581 extends AbstractC5698 implements InterfaceC14085 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final C18411 f11365 = new C18411(3);

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2609 f11366;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C2609 f11367;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C1365 f11368;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2609 f11369;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC8624 f11370;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public C3581 mo10964() {
        return this;
    }

    @Override // l.AbstractC5698
    public final String toString() {
        String sb;
        if ((this.f17563 & 1048576) != 0) {
            return this.f17561.f17562.toString();
        }
        AbstractC10370 abstractC10370 = this.f17562;
        String abstractC103702 = abstractC10370 == abstractC10370.f31203.f37517.f18879 ? this.f17561.f17562.toString() : abstractC10370.toString();
        AbstractC4308 abstractC4308 = this.f17560;
        if (abstractC4308 == null) {
            return abstractC103702;
        }
        if (abstractC4308.m12913(EnumC9454.FORALL)) {
            abstractC103702 = "<" + ((C10077) this.f17560).f30362 + ">" + abstractC103702;
        }
        StringBuilder m19190 = C7166.m19190(abstractC103702, MotionUtils.EASING_TYPE_FORMAT_START);
        AbstractC4308 abstractC43082 = this.f17560;
        boolean z = (this.f17563 & 17179869184L) != 0;
        C2609 mo12933 = abstractC43082.mo12933();
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            while (mo12933.f8241.m8249()) {
                sb2.append(mo12933.f8240);
                mo12933 = mo12933.f8241;
                sb2.append(',');
            }
            if (((AbstractC4308) mo12933.f8240).m12913(EnumC9454.ARRAY)) {
                sb2.append(((C5138) mo12933.f8240).f16077);
                if (((AbstractC4308) mo12933.f8240).m12931().m8249()) {
                    sb2.append(((AbstractC4308) mo12933.f8240).m12931());
                }
                sb2.append("...");
            } else {
                sb2.append(mo12933.f8240);
            }
            sb = sb2.toString();
        } else {
            sb = mo12933.m8241(",");
        }
        return C9045.m23341(m19190, sb, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    @Override // l.InterfaceC14085
    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean mo10957() {
        return (this.f17563 & 17179869184L) != 0;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Set mo10965() {
        long j = this.f17563;
        if ((8796093022208L & j) != 0) {
            j &= -1025;
        }
        return C19642.m45151(j);
    }

    /* renamed from: ֨ */
    public C2609 mo7174() {
        return this.f17560.mo12930();
    }

    /* renamed from: ᩳ */
    public AbstractC4308 mo7179() {
        return this.f17560.mo12923();
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
        return mo7180();
    }

    public C3581(long j, AbstractC10370 abstractC10370, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698) {
        super(EnumC1296.f4571, j, abstractC10370, abstractC4308, abstractC5698);
        this.f11368 = null;
        this.f11369 = C2609.m8239();
        this.f11366 = C2609.m8239();
        this.f11367 = null;
        this.f11370 = null;
        if (abstractC5698.f17560.m12913(EnumC9454.TYPEVAR)) {
            C12171.m29640(abstractC5698 + "." + ((Object) abstractC10370));
            throw null;
        }
    }

    @Override // l.AbstractC5698
    /* renamed from: ۧ */
    public AbstractC5698 mo7177(AbstractC5698 abstractC5698) {
        C2170 c2170 = new C2170(this, this.f17563, this.f17562, this.f17560, abstractC5698, abstractC5698);
        c2170.f11368 = this.f11368;
        return c2170;
    }

    @Override // l.AbstractC5698, l.InterfaceC21496
    /* renamed from: ۘ */
    public int mo953() {
        return this.f17561.m16070() ? 11 : 10;
    }

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C15574 mo10967() {
        return new C15574(this, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3581 m10958(C14163 c14163, C6319 c6319) {
        AbstractC19810 abstractC19810 = c14163;
        while (abstractC19810 != null) {
            for (AbstractC5698 abstractC5698 : abstractC19810.mo16064().m20476(this.f17562)) {
                EnumC1296 enumC1296 = abstractC5698.f17559;
                EnumC1296 enumC12962 = EnumC1296.f4571;
                if (enumC1296 == enumC12962) {
                    C3581 c3581 = (C3581) abstractC5698;
                    if (!c3581.m16075() && this.f17559 == enumC12962) {
                        if (c3581 != this) {
                            if (m10956((AbstractC19810) c3581.f17561)) {
                                if (c6319.m17527(this.f17561, c3581.f17561.f17560) != null && c6319.m17550(c3581.mo16091(c6319), mo16091(c6319))) {
                                }
                            }
                            if ((c3581.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 && m10956((AbstractC19810) c14163) && c3581.m16067((AbstractC19810) c14163, c6319) && c6319.m17550(c3581.mo16091(c6319), mo16091(c6319))) {
                            }
                        }
                        return c3581;
                    }
                }
            }
            abstractC19810 = c6319.m17562(abstractC19810.f17560).f13890;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r11.m17561(r1, r2) != false) goto L38;
     */
    @Override // l.AbstractC5698
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo10962(l.AbstractC5698 r9, l.AbstractC19810 r10, l.C6319 r11, boolean r12) {
        /*
            r8 = this;
            boolean r0 = r8.m16075()
            if (r0 != 0) goto La6
            l.֨ᩴ֨ r0 = r9.f17559
            l.֨ᩴ֨ r1 = l.EnumC1296.f4571
            if (r0 == r1) goto Le
            goto La6
        Le:
            r0 = 1
            if (r8 != r9) goto L13
            goto La5
        L13:
            l.ۘ֡֨ r9 = (l.C3581) r9
            l.ۛ֡֨ r1 = r8.f17561
            l.᩶֡֨ r1 = (l.AbstractC19810) r1
            boolean r1 = r9.m10956(r1)
            if (r1 == 0) goto L4b
            l.ۛ֡֨ r1 = r8.f17561
            l.ۙ֨֨ r1 = r1.f17560
            l.ۛ֡֨ r2 = r9.f17561
            l.ۙ֨֨ r1 = r11.m17527(r2, r1)
            if (r1 == 0) goto L4b
            l.ۛ֡֨ r1 = r8.f17561
            l.ۙ֨֨ r1 = r1.f17560
            l.ۙ֨֨ r1 = r11.m17543(r8, r1)
            l.ۛ֡֨ r2 = r8.f17561
            l.ۙ֨֨ r2 = r2.f17560
            l.ۙ֨֨ r2 = r11.m17543(r9, r2)
            boolean r3 = r11.m17532(r1, r2, r0)
            if (r3 == 0) goto L4b
            if (r12 != 0) goto L44
            goto La5
        L44:
            boolean r1 = r11.m17561(r1, r2)
            if (r1 == 0) goto L4b
            goto La5
        L4b:
            long r1 = r8.f17563
            r3 = 1024(0x400, double:5.06E-321)
            long r1 = r1 & r3
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L57
            goto La6
        L57:
            long r1 = r9.f17563
            long r3 = r3 & r1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L68
            r3 = 8796093022208(0x80000000000, double:4.345847379897E-311)
            long r1 = r1 & r3
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto La6
        L68:
            boolean r1 = r9.m10956(r10)
            if (r1 == 0) goto La6
            boolean r1 = r8.m16067(r10, r11)
            if (r1 != 0) goto L75
            goto La6
        L75:
            l.ۙ֨֨ r1 = r10.f17560
            l.ۙ֨֨ r1 = r11.m17543(r8, r1)
            l.ۙ֨֨ r10 = r10.f17560
            l.ۙ֨֨ r9 = r11.m17543(r9, r10)
            boolean r10 = r11.m17532(r1, r9, r0)
            if (r10 == 0) goto La6
            if (r12 == 0) goto La5
            l.֨᩸۠ r10 = r11.f19598
            l.ۖܶ۠ r12 = r1.mo12938()
            l.ۖܶ۠ r2 = r9.mo12938()
            l.ۙ֨֨ r1 = r1.mo12923()
            l.ۙ֨֨ r9 = r9.mo12923()
            l.ۙ֨֨ r9 = r11.m17488(r9, r2, r12)
            boolean r9 = r11.m17505(r1, r9, r10)
            if (r9 == 0) goto La6
        La5:
            return r0
        La6:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3581.mo10962(l.ۛ֡֨, l.᩶֡֨, l.ۛ᩸֨, boolean):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m10956(AbstractC19810 abstractC19810) {
        int i = (int) (this.f17563 & 7);
        return i != 0 ? i != 1 ? i == 4 && (abstractC19810.mo16084() & 512) == 0 : !this.f17561.m16070() || (this.f17563 & 8) == 0 : m16089() == abstractC19810.m16089() && (abstractC19810.mo16084() & 512) == 0;
    }

    @Override // l.AbstractC5698
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo10961(AbstractC5698 abstractC5698, C6319 c6319) {
        if (((int) (this.f17563 & 7)) != 1) {
            return super.mo10961(abstractC5698, c6319);
        }
        return !this.f17561.m16070() || abstractC5698 == this.f17561 || (this.f17563 & 8) == 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3581 m10959(AbstractC19810 abstractC19810, C6319 c6319, boolean z) {
        C3581 m17485 = c6319.m17485(this, abstractC19810, z, f11365);
        if (m17485 != null) {
            return m17485;
        }
        if (!c6319.m17557(abstractC19810.f17560) || abstractC19810.m16070()) {
            return null;
        }
        return m10959(c6319.m17562(abstractC19810.f17560).f13890, c6319, z);
    }

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m10963() {
        this.f17561.mo16101();
        if (this.f11367 == null) {
            C18837 c18837 = new C18837();
            Iterator it = this.f17560.mo12933().iterator();
            int i = 0;
            while (it.hasNext()) {
                c18837.m43511(new C12048(8589934592L, this.f17562.f31203.m30652("arg" + i), (AbstractC4308) it.next(), this));
                i++;
            }
            this.f11367 = c18837.m43517();
        }
        C12171.m29637(this.f11367);
        return this.f11367;
    }

    @Override // l.AbstractC5698
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 mo10960(AbstractC4308 abstractC4308, C6319 c6319) {
        return new C3581(this.f17563, this.f17562, c6319.m17543(this, abstractC4308), this.f17561);
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* renamed from: ֫ */
    public final EnumC23258 mo952() {
        AbstractC10370 abstractC10370 = this.f17562;
        C6136 c6136 = abstractC10370.f31203.f37517;
        if (abstractC10370 == c6136.f18879) {
            return EnumC23258.CONSTRUCTOR;
        }
        if (abstractC10370 == c6136.f18842) {
            return EnumC23258.STATIC_INIT;
        }
        if ((this.f17563 & 1048576) != 0) {
            return mo15572() ? EnumC23258.STATIC_INIT : EnumC23258.INSTANCE_INIT;
        }
        return EnumC23258.METHOD;
    }

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final boolean m10966() {
        return mo952() == EnumC23258.STATIC_INIT || mo952() == EnumC23258.INSTANCE_INIT;
    }

    /* renamed from: ۖ */
    public AbstractC8624 mo7175() {
        return this.f11370;
    }

    public C2609 getParameters() {
        return m10963();
    }

    @Override // l.InterfaceC11970
    /* renamed from: ֫ */
    public final Object mo951(AbstractC8463 abstractC8463, Object obj) {
        return abstractC8463.mo10387(this, obj);
    }

    @Override // l.AbstractC5698
    /* renamed from: ֫ */
    public Object mo2899(InterfaceC9932 interfaceC9932, Locale locale) {
        return interfaceC9932.mo23524(this, (Object) locale);
    }
}
