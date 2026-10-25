package l;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: KAUB */
/* renamed from: l.ܶ֫ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14922 implements InterfaceC16602, InterfaceC19157 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C14922 f45499 = new C14922();

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
        if (obj instanceof BigInteger) {
            c6725.write(((BigInteger) obj).toString());
            return;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        c6725.write(bigDecimal.toString());
        if ((c6725.f20878 & EnumC20837.WriteClassName.f67472) == 0 || type == BigDecimal.class || bigDecimal.scale() != 0) {
            return;
        }
        c6725.write(46);
    }

    @Override // l.InterfaceC19157
    /* renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        C7322 c7322 = c11556.f34488;
        int m19646 = c7322.m19646();
        if (m19646 == 2) {
            if (type == BigInteger.class) {
                String m19648 = c7322.m19648();
                c7322.m19641(16);
                return new BigInteger(m19648, 10);
            }
            BigDecimal m19649 = c7322.m19649();
            c7322.m19641(16);
            return m19649;
        }
        if (m19646 == 3) {
            BigDecimal m196492 = c7322.m19649();
            c7322.m19641(16);
            if (type != BigInteger.class) {
                return m196492;
            }
            int scale = m196492.scale();
            if (scale < -100 || scale > 100) {
                throw new NumberFormatException();
            }
            return m196492.toBigInteger();
        }
        Object m28434 = c11556.m28434((Object) null);
        if (m28434 == null) {
            return null;
        }
        if (type == BigInteger.class) {
            return C19426.m44751(m28434);
        }
        return C19426.m44738(m28434);
    }
}
