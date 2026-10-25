package l;

import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Q86R */
/* renamed from: l.֡ᩳۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class EnumC0571 implements InterfaceC5511 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC0571 f2250;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC0571 f2251;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC0571 f2252 = new C2689("DOUBLE", 0);

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC0571[] f2253 = m2339();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC0571 f2254;

    @Override // l.InterfaceC5511
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract /* synthetic */ Number mo2340(C17175 c17175);

    public EnumC0571(String str, int i) {
    }

    public /* synthetic */ EnumC0571(String str, int i, C2689 c2689) {
        this(str, i);
    }

    public static EnumC0571 valueOf(String str) {
        return (EnumC0571) Enum.valueOf(EnumC0571.class, str);
    }

    public static EnumC0571[] values() {
        return (EnumC0571[]) f2253.clone();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC0571[] m2339() {
        return new EnumC0571[]{f2252, f2251, f2250, f2254};
    }

    static {
        final String str = "LAZILY_PARSED_NUMBER";
        final int i = 1;
        f2251 = new EnumC0571(str, i) { // from class: l.ۘᩳۖ
            {
                C2689 c2689 = null;
            }

            @Override // l.EnumC0571, l.InterfaceC5511
            /* renamed from: ֫ */
            public Number mo2340(C17175 c17175) {
                return new C13976(c17175.m40399());
            }
        };
        final String str2 = "LONG_OR_DOUBLE";
        final int i2 = 2;
        f2250 = new EnumC0571(str2, i2) { // from class: l.ᩴᩳۖ
            {
                C2689 c2689 = null;
            }

            @Override // l.EnumC0571, l.InterfaceC5511
            /* renamed from: ֫ */
            public Number mo2340(C17175 c17175) {
                String m40399 = c17175.m40399();
                if (m40399.indexOf(46) >= 0) {
                    return m43660(m40399, c17175);
                }
                try {
                    return Long.valueOf(Long.parseLong(m40399));
                } catch (NumberFormatException unused) {
                    return m43660(m40399, c17175);
                }
            }

            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            private Number m43660(String str3, C17175 c17175) {
                try {
                    Double valueOf = Double.valueOf(str3);
                    if ((!valueOf.isInfinite() && !valueOf.isNaN()) || c17175.m40405()) {
                        return valueOf;
                    }
                    throw new C6592("JSON forbids NaN and infinities: " + valueOf + "; at path " + c17175.m40393());
                } catch (NumberFormatException e) {
                    StringBuilder m9834 = C3200.m9834("Cannot parse ", str3, "; at path ");
                    m9834.append(c17175.m40393());
                    throw new C11156(m9834.toString(), e);
                }
            }
        };
        final String str3 = "BIG_DECIMAL";
        final int i3 = 3;
        f2254 = new EnumC0571(str3, i3) { // from class: l.᩵ᩳۖ
            {
                C2689 c2689 = null;
            }

            @Override // l.EnumC0571, l.InterfaceC5511
            /* renamed from: ֫ */
            public BigDecimal mo2340(C17175 c17175) {
                String m40399 = c17175.m40399();
                try {
                    return C6901.m18686(m40399);
                } catch (NumberFormatException e) {
                    StringBuilder m9834 = C3200.m9834("Cannot parse ", m40399, "; at path ");
                    m9834.append(c17175.m40393());
                    throw new C11156(m9834.toString(), e);
                }
            }
        };
    }
}
