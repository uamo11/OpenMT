package l;

import java.util.ArrayDeque;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: 34PY */
/* renamed from: l.֨֨֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0779 extends AbstractC4432 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public EnumC0073 f2877;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f2878;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC5013 f2879;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumMap f2880;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f2881;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C1380 f2882;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f2883;

    @Override // l.AbstractC4308
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo2962(InterfaceC21242 interfaceC21242, Object obj) {
        return interfaceC21242.mo12688(this, obj);
    }

    public C0779(C8541 c8541, InterfaceC5013 interfaceC5013, C6319 c6319) {
        super(EnumC9454.UNDETVAR, c8541);
        EnumC0073 enumC0073;
        this.f2881 = new ArrayDeque();
        this.f2878 = null;
        this.f2879 = null;
        this.f2882 = new C15595();
        if (c8541.mo22227()) {
            enumC0073 = EnumC0073.CAPTURED;
        } else {
            enumC0073 = EnumC0073.NORMAL;
        }
        this.f2877 = enumC0073;
        this.f2879 = interfaceC5013;
        EnumMap enumMap = new EnumMap(EnumC19125.class);
        this.f2880 = enumMap;
        C2609 m17484 = c6319.m17484(c8541);
        this.f2883 = m17484.m8245();
        enumMap.put((EnumMap) EnumC19125.f60272, (EnumC19125) C2609.m8239());
        enumMap.put((EnumMap) EnumC19125.f60273, (EnumC19125) C2609.m8239());
        enumMap.put((EnumMap) EnumC19125.f60275, (EnumC19125) C2609.m8239());
        Iterator it = m17484.m8250().iterator();
        while (it.hasNext()) {
            m2961(EnumC19125.f60272, (AbstractC4308) it.next(), c6319, true);
        }
        if (!c8541.mo22227() || c8541.f26106.m12913(EnumC9454.BOT)) {
            return;
        }
        m2961(EnumC19125.f60273, c8541.f26106, c6319, true);
    }

    @Override // l.AbstractC4432, l.AbstractC4308, l.InterfaceC5641
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m12911(sb, false);
        AbstractC4308 abstractC4308 = this.f2878;
        if (abstractC4308 == null) {
            sb.append(this.f14167);
            sb.append('?');
        } else {
            sb.append(abstractC4308);
        }
        return sb.toString();
    }

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final void m2970() {
        if (this.f2877 == EnumC0073.CAPTURED) {
            throw new IllegalStateException();
        }
        this.f2877 = EnumC0073.THROWS;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2964(C0779 c0779, C6319 c6319) {
        c0779.f2879 = null;
        EnumMap enumMap = c0779.f2880;
        enumMap.clear();
        for (EnumC19125 enumC19125 : EnumC19125.values()) {
            enumMap.put((EnumMap) enumC19125, (EnumC19125) C2609.m8239());
            Iterator it = m2963(enumC19125).iterator();
            while (it.hasNext()) {
                c0779.m2961(enumC19125, (AbstractC4308) it.next(), c6319, true);
            }
        }
        c0779.f2878 = this.f2878;
        c0779.f2879 = this.f2879;
        c0779.f2881 = new ArrayDeque();
        Iterator it2 = this.f2881.iterator();
        while (it2.hasNext()) {
            c0779.f2881.add(((AbstractC21387) it2.next()).mo7602(c0779));
        }
        c0779.f2877 = this.f2877;
    }

    @Override // l.AbstractC4308
    /* renamed from: ֫ */
    public final AbstractC4308 mo1357(C20743 c20743) {
        throw new AssertionError("Cannot add metadata to an UndetVar type");
    }

    @Override // l.AbstractC4308
    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 mo2973() {
        AbstractC4308 abstractC4308 = this.f2878;
        return abstractC4308 == null ? this : abstractC4308.mo2973();
    }

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m2971() {
        return this.f2878;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m2972(AbstractC4308 abstractC4308) {
        this.f2878 = abstractC4308;
        InterfaceC5013 interfaceC5013 = this.f2879;
        if (interfaceC5013 != null) {
            interfaceC5013.mo14505(this);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m2963(EnumC19125... enumC19125Arr) {
        C18837 c18837 = new C18837();
        for (EnumC19125 enumC19125 : enumC19125Arr) {
            c18837.m43512((C2609) this.f2880.get(enumC19125));
        }
        return c18837.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2966(EnumC19125 enumC19125, C2609 c2609) {
        this.f2880.put((EnumMap) enumC19125, (EnumC19125) c2609);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2967(EnumC19125 enumC19125, AbstractC4308 abstractC4308, C6319 c6319) {
        if (c6319.f19587) {
            int ordinal = enumC19125.ordinal();
            if (ordinal == 0) {
                abstractC4308 = C6319.m17473(abstractC4308);
            } else if (ordinal == 2) {
                AbstractC4308 m17474 = C6319.m17474(abstractC4308);
                if (!m17474.m12913(EnumC9454.BOT)) {
                    abstractC4308 = m17474;
                }
            }
        }
        m2961(enumC19125, abstractC4308, c6319, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2961(EnumC19125 enumC19125, AbstractC4308 abstractC4308, C6319 c6319, boolean z) {
        if (this.f2877 == EnumC0073.CAPTURED && !z) {
            if (abstractC4308.m12913(EnumC9454.UNDETVAR)) {
                C0779 c0779 = (C0779) abstractC4308;
                if (c0779.m2969()) {
                    return;
                }
                c0779.m2961(enumC19125.mo7226(), this, c6319, false);
                return;
            }
            return;
        }
        abstractC4308.getClass();
        C1380 c1380 = this.f2882;
        c1380.getClass();
        AbstractC4308 mo2973 = ((AbstractC4308) abstractC4308.mo2962(c1380, (Object) null)).mo2973();
        EnumMap enumMap = this.f2880;
        C2609 c2609 = (C2609) enumMap.get(enumC19125);
        if (abstractC4308 == this.f14167) {
            return;
        }
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            if (c6319.m17550((AbstractC4308) it.next(), mo2973)) {
                return;
            }
        }
        enumMap.put((EnumMap) enumC19125, (EnumC19125) c2609.m8246(mo2973));
        InterfaceC5013 interfaceC5013 = this.f2879;
        if (interfaceC5013 != null) {
            interfaceC5013.mo14506(this, enumC19125, mo2973, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2965(C6319 c6319, C2609 c2609, C2609 c26092) {
        EnumMap enumMap = this.f2880;
        C18837 c18837 = new C18837();
        InterfaceC5013 interfaceC5013 = this.f2879;
        try {
            this.f2879 = new C21597(this, c18837);
            for (Map.Entry entry : enumMap.entrySet()) {
                EnumC19125 enumC19125 = (EnumC19125) entry.getKey();
                C2609 c26093 = (C2609) entry.getValue();
                C18837 c188372 = new C18837();
                C18837 c188373 = new C18837();
                Iterator it = c26093.iterator();
                while (it.hasNext()) {
                    AbstractC4308 abstractC4308 = (AbstractC4308) it.next();
                    if (!abstractC4308.m12928(c2609)) {
                        c188372.m43511(abstractC4308);
                    } else {
                        c188373.m43511(abstractC4308);
                    }
                }
                enumMap.put((EnumMap) enumC19125, (EnumC19125) c188372.m43517());
                Iterator it2 = c188373.iterator();
                while (it2.hasNext()) {
                    m2961(enumC19125, c6319.m17488((AbstractC4308) it2.next(), c2609, c26092), c6319, true);
                }
            }
        } finally {
            this.f2879 = interfaceC5013;
            Iterator it3 = c18837.iterator();
            while (it3.hasNext()) {
                C23069 c23069 = (C23069) it3.next();
                EnumC19125 enumC191252 = (EnumC19125) c23069.f74207;
                AbstractC4308 abstractC43082 = (AbstractC4308) c23069.f74208;
                InterfaceC5013 interfaceC50132 = this.f2879;
                if (interfaceC50132 != null) {
                    interfaceC50132.mo14506(this, enumC191252, abstractC43082, true);
                }
            }
        }
    }

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2969() {
        return this.f2877 == EnumC0073.CAPTURED;
    }

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2968() {
        return this.f2877 == EnumC0073.THROWS;
    }
}
