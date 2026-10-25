package l;

import java.math.BigInteger;

/* compiled from: 0B0D */
/* renamed from: l.ۛܳۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C6111 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        c23525.m51975((BigInteger) obj);
    }

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        String m40399 = c17175.m40399();
        try {
            return C6901.m18687(m40399);
        } catch (NumberFormatException e) {
            StringBuilder m9834 = C3200.m9834("Failed parsing '", m40399, "' as BigInteger; at path ");
            m9834.append(c17175.m40393());
            throw new C14682(m9834.toString(), e);
        }
    }
}
