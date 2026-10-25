package l;

import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: 0B0D */
/* renamed from: l.ۧ᩻ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C11323 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        URI uri = (URI) obj;
        c23525.m51984(uri == null ? null : uri.toASCIIString());
    }

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        try {
            String m40399 = c17175.m40399();
            if (m40399.equals("null")) {
                return null;
            }
            return new URI(m40399);
        } catch (URISyntaxException e) {
            throw new C13934(e);
        }
    }
}
