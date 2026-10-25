package l;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* compiled from: AAGU */
/* renamed from: l.ܺᩴ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16130 implements InterfaceC15779 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18954 f49696;

    public C16130(C18954 c18954) {
        this.f49696 = c18954;
    }

    @Override // l.InterfaceC15779
    /* renamed from: ֫ */
    public final boolean mo3327(Object obj) {
        return ((C12029) obj).m29389();
    }

    @Override // l.InterfaceC15779
    /* renamed from: ۧ */
    public final String mo3328(Object obj) {
        return ((C12029) obj).m29391();
    }

    @Override // l.InterfaceC15779
    /* renamed from: ֫ */
    public final List mo3326(String str) {
        Boolean bool;
        String m39731 = AbstractC16891.m39731(str);
        C18954 c18954 = this.f49696;
        C1654 m43746 = C18954.m43746(c18954);
        try {
            Vector m5586 = m43746.m5586(m39731);
            bool = c18954.f59775;
            if (bool == null && m5586.size() > 0) {
                C18954.m43744(c18954, m43746, m5586, m39731);
            }
            Iterator it = m5586.iterator();
            while (it.hasNext()) {
                C12029 c12029 = (C12029) it.next();
                if (c12029.m29386().m5765()) {
                    String m5595 = m43746.m5595(C9523.m24393(m39731, c12029.m29391()));
                    c12029.m29387(m5595);
                    if (!m5595.startsWith("/")) {
                        m5595 = C9523.m24393(m39731, m5595);
                    }
                    try {
                        c12029.m29388(m43746.m5594(m5595));
                    } catch (C16532 e) {
                        int i = e.f50807;
                        if (i == 2) {
                            continue;
                        } else if (i != 10) {
                            throw e;
                        }
                    }
                }
            }
            return m5586;
        } finally {
            C2998.m9138(m43746);
        }
    }
}
