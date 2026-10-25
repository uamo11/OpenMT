package l;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: I7LP */
/* renamed from: l.ۚ᩶֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5572 extends AbstractC0204 {

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C4314 f17259 = new C4314();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f17260 = new LinkedHashMap();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20661 f17261;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9310 f17262;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C22364 f17263;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12399 f17264;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1755 f17265;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5931 f17266;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f17267;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5572 m15819(C2903 c2903) {
        C5572 c5572 = (C5572) c2903.m8838(f17259);
        return c5572 == null ? new C5572(c2903) : c5572;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15832(AbstractC4308 abstractC4308, AbstractC12612 abstractC12612) {
        this.f17267 = abstractC4308;
        if (((C8604) this.f17265.f6073).f26283 == EnumC7480.SPECULATIVE) {
            abstractC12612.f16086 = abstractC4308;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC4308 m15818(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, C23420 c23420) {
        if (abstractC4308.m12913(EnumC9454.DEFERRED)) {
            return ((C1110) abstractC4308).m3822(c23420);
        }
        return c23420.mo13581(abstractC5144, abstractC4308);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m15831(AbstractC5144 abstractC5144, C1755 c1755) {
        C1755 c17552 = this.f17265;
        try {
            this.f17265 = c1755;
            abstractC5144.mo988(this);
            return this.f17267;
        } finally {
            this.f17265 = c17552;
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1379(AbstractC5144 abstractC5144) {
        C9310 c9310 = this.f17262;
        abstractC5144.mo988(c9310);
        this.f17267 = c9310.f28223;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15833(final AbstractC12612 abstractC12612, final Function function) {
        final C0632 c0632 = new C0632(this, abstractC12612);
        m15834(abstractC12612, new Supplier() { // from class: l.۟᩹֨
            @Override // java.util.function.Supplier
            public final Object get() {
                return C5572.m15824(C5572.this, abstractC12612, c0632, function);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC16860 m15824(C5572 c5572, AbstractC12612 abstractC12612, C0632 c0632, Function function) {
        C12399 c12399 = c5572.f17264;
        C1755 c1755 = c5572.f17265;
        C9310 c9310 = c5572.f17262;
        C11003.requireNonNull(c9310);
        return (AbstractC16860) function.apply((AbstractC12612) c12399.m30568(abstractC12612, c1755, new C2044(c5572, c9310, c0632), c12399.f37339, null, EnumC7480.SPECULATIVE, null));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15834(AbstractC12612 abstractC12612, Supplier supplier) {
        C0632 c0632 = new C0632(this, abstractC12612);
        AbstractC16860 abstractC16860 = (AbstractC16860) this.f17260.get(c0632);
        if (abstractC16860 != null) {
            m15832(abstractC16860.mo8502(this.f17265, abstractC12612), abstractC12612);
            return;
        }
        AbstractC16860 abstractC168602 = (AbstractC16860) supplier.get();
        this.f17260.put(c0632, abstractC168602);
        m15832(abstractC168602, abstractC12612);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9806 m15823(C5572 c5572, C14875 c14875, C14875 c148752) {
        return new C9806(c5572, c14875, c5572.f17265, c148752, new HashMap());
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1405(final C14875 c14875) {
        m15833(c14875, new Function() { // from class: l.ܰ᩹֨
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C5572.m15823(C5572.this, c14875, (C14875) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18272 m15825(C5572 c5572, C8379 c8379, C8379 c83792) {
        return new C18272(c5572, c8379, c5572.f17265, c83792, new HashMap());
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1387(final C8379 c8379) {
        m15833(c8379, new Function() { // from class: l.ۤ᩹֨
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C5572.m15825(C5572.this, c8379, (C8379) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19684 m15826(C5572 c5572, C13464 c13464, C13464 c134642) {
        return new C19684(c5572, c13464, c5572.f17265, c134642, new HashMap());
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1401(final C13464 c13464) {
        m15833(c13464, new Function() { // from class: l.ۛ᩹֨
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C5572.m15826(C5572.this, c13464, (C13464) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a4  */
    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1391(l.C9232 r21) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5572.mo1391(l.ۢ֡۠):void");
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1217(final C14169 c14169) {
        if (c14169.f42773 == EnumC16992.EXPLICIT) {
            m15834(c14169, new Supplier() { // from class: l.᩺᩹֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C5572.m15820(C5572.this, c14169);
                }
            });
            return;
        }
        C12399 c12399 = this.f17264;
        C11003.requireNonNull(c12399);
        m15832(new C1110(c12399, c14169, this.f17265), c14169);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6983 m15820(C5572 c5572, C14169 c14169) {
        return new C6983(c5572, c14169, c5572.f17265, c5572.f17264.m30569(c14169, c5572.f17265, c5572.f17262.f28233), new HashMap());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2750 m15817(C5572 c5572, C15580 c15580, C15580 c155802) {
        return new C2750(c5572, c15580, c5572.f17265, c155802, new HashMap());
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1419(final C19110 c19110) {
        if (C7260.m19449(c19110)) {
            m15833(c19110, new Function() { // from class: l.ۨ᩹֨
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C5572.m15821(C5572.this, c19110, (C19110) obj);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }
            });
            return;
        }
        C1755 c1755 = this.f17265;
        C9310 c9310 = this.f17262;
        m15832(c9310.m23930(c19110, c1755, c9310.f28228), c19110);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9100 m15821(C5572 c5572, C19110 c19110, C19110 c191102) {
        return new C9100(c5572, c19110, c5572.f17265, c191102, new HashMap());
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1407(final C15580 c15580) {
        if (c15580.f48010.isEmpty()) {
            m15833(c15580, new Function() { // from class: l.۫᩹֨
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return C5572.m15817(C5572.this, c15580, (C15580) obj);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }
            });
            return;
        }
        C1755 c1755 = this.f17265;
        C9310 c9310 = this.f17262;
        m15832(c9310.m23930(c15580, c1755, c9310.f28228), c15580);
    }

    public C5572(C2903 c2903) {
        c2903.m8841(f17259, this);
        this.f17264 = C12399.m30567(c2903);
        this.f17266 = C5931.m16615(c2903);
        this.f17262 = C9310.m23901(c2903);
        this.f17261 = C20661.m47250(c2903);
        this.f17263 = C22364.m50099(c2903);
    }
}
