package l;

import java.util.Currency;

/* compiled from: 0B0D */
/* renamed from: l.ܿ᩻ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C17672 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        c23525.m51984(((Currency) obj).getCurrencyCode());
    }

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        String m40399 = c17175.m40399();
        try {
            return Currency.getInstance(m40399);
        } catch (IllegalArgumentException e) {
            StringBuilder m9834 = C3200.m9834("Failed parsing '", m40399, "' as Currency; at path ");
            m9834.append(c17175.m40393());
            throw new C14682(m9834.toString(), e);
        }
    }
}
