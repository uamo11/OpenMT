package l;

import java.util.BitSet;

/* compiled from: 0B0D */
/* renamed from: l.᩷᩻ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C21201 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        BitSet bitSet = (BitSet) obj;
        c23525.m51972();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            c23525.m51983(bitSet.get(i) ? 1L : 0L);
        }
        c23525.m51989();
    }

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        BitSet bitSet = new BitSet();
        c17175.m40391();
        EnumC14352 m40398 = c17175.m40398();
        int i = 0;
        while (m40398 != EnumC14352.END_ARRAY) {
            int i2 = C4267.f13810[m40398.ordinal()];
            boolean z = true;
            if (i2 == 1 || i2 == 2) {
                int m40408 = c17175.m40408();
                if (m40408 == 0) {
                    z = false;
                } else if (m40408 != 1) {
                    StringBuilder m32308 = C13325.m32308(m40408, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    m32308.append(c17175.m40393());
                    throw new C14682(m32308.toString());
                }
            } else {
                if (i2 != 3) {
                    throw new C14682("Invalid bitset value type: " + m40398 + "; at path " + c17175.m40397());
                }
                z = c17175.m40401();
            }
            if (z) {
                bitSet.set(i);
            }
            i++;
            m40398 = c17175.m40398();
        }
        c17175.m40400();
        return bitSet;
    }
}
