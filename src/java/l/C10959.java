package l;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/* compiled from: UAUX */
/* renamed from: l.ۧۧܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10959 implements InterfaceC16602, InterfaceC19157 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C10959 f32992 = new C10959();

    @Override // l.InterfaceC16602
    /* renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) {
        C6725 c6725 = c5751.f17696;
        if (obj == null) {
            if ((c6725.f20878 & EnumC20837.WriteNullNumberAsZero.f67472) != 0) {
                c6725.write(48);
                return;
            } else {
                c6725.m18296();
                return;
            }
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (Float.isNaN(floatValue)) {
                c6725.m18296();
                return;
            }
            if (Float.isInfinite(floatValue)) {
                c6725.m18296();
                return;
            }
            String f = Float.toString(floatValue);
            if (f.endsWith(".0")) {
                f = C15472.m36561(2, 0, f);
            }
            c6725.write(f);
            if ((c6725.f20878 & EnumC20837.WriteClassName.f67472) != 0) {
                c6725.write(70);
                return;
            }
            return;
        }
        double doubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(doubleValue)) {
            c6725.m18296();
            return;
        }
        if (Double.isInfinite(doubleValue)) {
            c6725.m18296();
            return;
        }
        String d = Double.toString(doubleValue);
        if (d.endsWith(".0")) {
            d = C15472.m36561(2, 0, d);
        }
        c6725.append((CharSequence) d);
        if ((c6725.f20878 & EnumC20837.WriteClassName.f67472) != 0) {
            c6725.write(68);
        }
    }

    @Override // l.InterfaceC19157
    /* renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        C7322 c7322 = c11556.f34488;
        int m19646 = c7322.m19646();
        Class cls = Byte.TYPE;
        Class cls2 = Short.TYPE;
        Class cls3 = Float.TYPE;
        Class cls4 = Double.TYPE;
        if (m19646 == 2) {
            if (type == cls4 || type == Double.class) {
                String m19648 = c7322.m19648();
                c7322.m19641(16);
                return Double.valueOf(Double.parseDouble(m19648));
            }
            if (type == cls3 || type == Float.class) {
                String m196482 = c7322.m19648();
                c7322.m19641(16);
                return Float.valueOf(Float.parseFloat(m196482));
            }
            long m19632 = c7322.m19632();
            c7322.m19641(16);
            if (type != cls2 && type != Short.class) {
                if (type == cls || type == Byte.class) {
                    return Byte.valueOf((byte) m19632);
                }
                if (m19632 >= -2147483648L && m19632 <= 2147483647L) {
                    return Integer.valueOf((int) m19632);
                }
                return Long.valueOf(m19632);
            }
            return Short.valueOf((short) m19632);
        }
        if (m19646 == 3) {
            if (type == cls4 || type == Double.class) {
                String m196483 = c7322.m19648();
                c7322.m19641(16);
                return Double.valueOf(Double.parseDouble(m196483));
            }
            if (type == cls3 || type == Float.class) {
                String m196484 = c7322.m19648();
                c7322.m19641(16);
                return Float.valueOf(Float.parseFloat(m196484));
            }
            BigDecimal m19649 = c7322.m19649();
            c7322.m19641(16);
            if (type == cls2 || type == Short.class) {
                return Short.valueOf(m19649.shortValueExact());
            }
            return (type == cls || type == Byte.class) ? Byte.valueOf(m19649.byteValueExact()) : m19649;
        }
        Object m28434 = c11556.m28434((Object) null);
        if (m28434 == null) {
            return null;
        }
        if (type == cls4 || type == Double.class) {
            return C19426.m44753(m28434);
        }
        if (type == cls3 || type == Float.class) {
            return C19426.m44763(m28434);
        }
        if (type != cls2 && type != Short.class) {
            if (type == cls || type == Byte.class) {
                return C19426.m44759(m28434);
            }
            return C19426.m44738(m28434);
        }
        return C19426.m44746(m28434);
    }
}
