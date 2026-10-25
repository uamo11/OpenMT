package l;

import java.util.UUID;

/* compiled from: 0B0D */
/* renamed from: l.ᩳ᩻ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C18378 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        UUID uuid = (UUID) obj;
        c23525.m51984(uuid == null ? null : uuid.toString());
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
            return UUID.fromString(m40399);
        } catch (IllegalArgumentException e) {
            StringBuilder m9834 = C3200.m9834("Failed parsing '", m40399, "' as UUID; at path ");
            m9834.append(c17175.m40393());
            throw new C14682(m9834.toString(), e);
        }
    }
}
