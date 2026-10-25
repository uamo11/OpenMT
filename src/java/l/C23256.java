package l;

import java.util.Iterator;

/* compiled from: 4BJX */
/* renamed from: l.᩺᩸ۚ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C23256 extends AbstractC5618 {
    @Override // l.AbstractC5618
    /* renamed from: ֫ */
    public final String mo15922() {
        return "nth-of-type";
    }

    @Override // l.AbstractC5618
    /* renamed from: ֫ */
    public final int mo15921(C19814 c19814) {
        int i = 0;
        if (c19814.mo28099() == null) {
            return 0;
        }
        Iterator<E> it = c19814.mo28099().m45579().iterator();
        while (it.hasNext()) {
            C19814 c198142 = (C19814) it.next();
            if (c198142.m45571().equals(c19814.m45571())) {
                i++;
            }
            if (c198142 == c19814) {
                break;
            }
        }
        return i;
    }
}
