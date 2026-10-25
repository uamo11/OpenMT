package l;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: Y7SB */
/* renamed from: l.ᩳ᩺֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18356 extends AbstractC24000 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C3581 f57038;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public EnumMap f57039;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashSet f57040;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2609 f57041;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C12048 f57042;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7067 f57043;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f57044;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 f57045;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18356(C7067 c7067, C14169 c14169) {
        super(c7067, c14169);
        C2609 c2609;
        this.f57043 = c7067;
        c2609 = c7067.f21744;
        C11674 c11674 = (C11674) c2609.f8240;
        int[] iArr = C4618.f14693;
        AbstractC5144 abstractC5144 = c11674.f34784;
        int i = iArr[abstractC5144.mo989().ordinal()];
        if (i == 5) {
            C12048 c12048 = ((C9378) abstractC5144).f28489;
            this.f57042 = c12048;
            this.f57045 = c12048;
        } else if (i == 9) {
            this.f57042 = null;
            this.f57045 = C7260.m19472(((C21080) abstractC5144).f67987);
        } else {
            this.f57042 = null;
            this.f57045 = null;
        }
        AbstractC5698 abstractC5698 = this.f77787;
        if (abstractC5698.f17559 == EnumC1296.f4571) {
            this.f57038 = new C7440(this.f77787.m16071(), (C3581) abstractC5698.mo7177(abstractC5698.f17561));
        } else {
            this.f57038 = new C3581(4098L, null, null, abstractC5698.m16071());
        }
        EnumMap enumMap = new EnumMap(EnumC21179.class);
        this.f57039 = enumMap;
        enumMap.put((EnumMap) EnumC21179.PARAM, (EnumC21179) new LinkedHashMap());
        enumMap.put((EnumMap) EnumC21179.LOCAL_VAR, (EnumC21179) new LinkedHashMap());
        enumMap.put((EnumMap) EnumC21179.CAPTURED_VAR, (EnumC21179) new LinkedHashMap());
        enumMap.put((EnumMap) EnumC21179.CAPTURED_THIS, (EnumC21179) new LinkedHashMap());
        enumMap.put((EnumMap) EnumC21179.CAPTURED_OUTER_THIS, (EnumC21179) new LinkedHashMap());
        this.f57040 = new HashSet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r2 = r0.m19064();
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m42781(l.AbstractC5698 r14, l.EnumC21179 r15) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18356.m42781(l.ۛ֡֨, l.᩷᩺֨):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map m42778(EnumC21179 enumC21179) {
        Map map = (Map) this.f57039.get(enumC21179);
        C12171.m29637(map);
        return map;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12612 m42780(final C7673 c7673) {
        C17013 c17013;
        C17013 c170132;
        C17013 c170133;
        C9184 c9184 = this.f57043.f21747;
        for (EnumC21179 enumC21179 : EnumC21179.values()) {
            Map m42778 = m42778(enumC21179);
            if (enumC21179.ordinal() != 4) {
                if (m42778.containsKey(c7673.f23697)) {
                    AbstractC5698 abstractC5698 = (AbstractC5698) m42778.get(c7673.f23697);
                    c170133 = c9184.f27818;
                    C7673 m39914 = c170133.m39914(abstractC5698);
                    m39914.f16086 = c7673.f16086;
                    return m39914;
                }
            } else {
                C16646 reduce = C5378.stream(m42778.keySet()).filter(new Predicate() { // from class: l.᩺ۨ֨
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
                        C18356 c18356 = C18356.this;
                        c18356.getClass();
                        return c7673.f23697.m16067(((AbstractC5698) obj).f17560.f13890, c18356.f57043.f21747.f27821);
                    }
                }).reduce(new C13789());
                if (reduce.isPresent()) {
                    AbstractC5698 abstractC56982 = (AbstractC5698) m42778.get(reduce.get());
                    c17013 = c9184.f27818;
                    C7673 m399142 = c17013.m39914(abstractC56982);
                    m399142.f16086 = c7673.f23697.f17561.f17560;
                    c170132 = c9184.f27818;
                    C6262 m39912 = c170132.m39912(m399142, c7673.f23696);
                    m39912.f16086 = c7673.f16086;
                    C7260.m19459(c7673.f23697, m39912);
                    return m39912;
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7673 m42779(C6262 c6262) {
        C17013 c17013;
        AbstractC10370 abstractC10370 = c6262.f19395;
        C9184 c9184 = this.f57043.f21747;
        C12171.m29642(abstractC10370 == c9184.f27819.f18886);
        Map map = (Map) this.f57039.get(EnumC21179.CAPTURED_OUTER_THIS);
        if (!map.containsKey(c6262.f19396.f17561)) {
            return null;
        }
        AbstractC5698 abstractC5698 = (AbstractC5698) map.get(c6262.f19396.f17561);
        c17013 = c9184.f27818;
        C7673 m39914 = c17013.m39914(abstractC5698);
        m39914.f16086 = c6262.f19396.f17561.f17560;
        return m39914;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42782(C19110 c19110) {
        C17013 c17013;
        C12171.m29642(c19110.f60196.f16086.f13890.m16087() && c19110.f60199 == null);
        Map map = (Map) this.f57039.get(EnumC21179.CAPTURED_OUTER_THIS);
        AbstractC4308 mo4958 = c19110.f60196.f16086.mo4958();
        if (map.containsKey(mo4958.f13890)) {
            AbstractC5698 abstractC5698 = (AbstractC5698) map.get(mo4958.f13890);
            c17013 = this.f57043.f21747.f27818;
            C7673 m39914 = c17013.m39914(abstractC5698);
            m39914.f16086 = mo4958;
            c19110.f60199 = m39914;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0164  */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m42783() {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18356.m42783():void");
    }
}
