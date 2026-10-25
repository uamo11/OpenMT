package l;

/* compiled from: 0B0D */
/* renamed from: l.֡᩻ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C0738 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2845(C23525 c23525, Object obj) {
        if (((Number) obj) == null) {
            c23525.m51981();
        } else {
            c23525.m51983(r4.byteValue());
        }
    }

    @Override // l.AbstractC8333
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo2844(C17175 c17175) {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        try {
            int m40408 = c17175.m40408();
            if (m40408 <= 255 && m40408 >= -128) {
                return Byte.valueOf((byte) m40408);
            }
            StringBuilder m32308 = C13325.m32308(m40408, "Lossy conversion from ", " to byte; at path ");
            m32308.append(c17175.m40393());
            throw new C14682(m32308.toString());
        } catch (NumberFormatException e) {
            throw new C14682(e);
        }
    }
}
