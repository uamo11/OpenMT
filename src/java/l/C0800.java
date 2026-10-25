package l;

import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: C5BI */
/* renamed from: l.֨֫֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0800 extends C9268 {

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int f2926;

    @Override // l.C9268
    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String mo3022() {
        StringBuilder sb = new StringBuilder();
        int[] iArr = C20557.f66233;
        EnumC7464 enumC7464 = this.f28077;
        switch (iArr[enumC7464.ordinal()]) {
            case 1:
                sb.append(m3020("", new Supplier() { // from class: l.ۘ֫֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        final C0800 c0800 = C0800.this;
                        return C18486.m42976(c0800.f35264.m25965(c0800.f2926, new Function() { // from class: l.ۚ֫֨
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
                                return "#" + C0800.this.f2926;
                            }
                        }), "\"");
                    }
                }));
                break;
            case 2:
            case 3:
            case 5:
                sb.append(m3020(enumC7464.m19998(), new Supplier() { // from class: l.ᩴ֫֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C0800 c0800 = C0800.this;
                        return c0800.f35264.m25953(c0800.f2926).mo3639();
                    }
                }));
                break;
            case 4:
            case 7:
            case 8:
            case 9:
                sb.append(m3020("", new C18894(this, 1)));
                break;
            case 6:
                sb.append(m3020(enumC7464.m19998(), new Supplier() { // from class: l.᩵֫֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C0800 c0800 = C0800.this;
                        return ((Integer) ((C22236) c0800.f35264.m25953(c0800.f2926)).f10053).intValue() == 0 ? "false" : "true";
                    }
                }));
                break;
            case 10:
                sb.append(m3020(enumC7464.m19998(), new Supplier() { // from class: l.֡֫֨
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        C0800 c0800 = C0800.this;
                        return c0800.f35264.getName(c0800.f2926);
                    }
                }));
                break;
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m3020(String str, Supplier supplier) {
        int i = this.f2926;
        String concat = str.isEmpty() ? "" : str.concat(" ");
        if (!this.f29326) {
            StringBuilder m15339 = C5368.m15339(concat);
            m15339.append((String) supplier.get());
            return m15339.toString();
        }
        if (this.f29343) {
            StringBuilder m153392 = C5368.m15339(concat);
            m153392.append(String.format("#%d", Integer.valueOf(i)));
            return m153392.toString();
        }
        StringBuilder m153393 = C5368.m15339(concat);
        m153393.append(String.format("#%d /* %s */", Integer.valueOf(i), supplier.get()));
        return m153393.toString();
    }

    @Override // l.C9268, l.AbstractC9701, l.InterfaceC17482
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo3021() {
        EnumC6172 m28902 = m28902();
        if (m28902 == EnumC6172.HAS_DEFAULT_VALUE) {
            m24646(C9045.m23341(new StringBuilder(), m28906(), "%s }"), mo3022());
        } else if (m28902 == EnumC6172.RIGHT_OPERAND) {
            m24646(" %s }", mo3022());
        } else {
            m24654(mo3022());
        }
    }
}
