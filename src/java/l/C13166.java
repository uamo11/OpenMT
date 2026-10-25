package l;

/* compiled from: 0B0D */
/* renamed from: l.۬ܳۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C13166 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        Character ch = (Character) obj;
        c23525.m51984(ch == null ? null : String.valueOf(ch));
    }

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        String m40399 = c17175.m40399();
        if (m40399.length() == 1) {
            return Character.valueOf(m40399.charAt(0));
        }
        StringBuilder m9834 = C3200.m9834("Expecting character, got: ", m40399, "; at ");
        m9834.append(c17175.m40393());
        throw new C14682(m9834.toString());
    }
}
