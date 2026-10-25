package l;

import java.text.ParseException;

/* compiled from: 95IZ */
/* renamed from: l.ۢۖ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9288 extends AbstractC16342 {
    @Override // l.AbstractC16342
    /* renamed from: ֫ */
    public final C3328 mo11133() {
        return new C3328("NETWARE", "MMM dd yyyy", "MMM dd HH:mm");
    }

    @Override // l.InterfaceC6150
    /* renamed from: ֫ */
    public final C10384 mo11134(String str) {
        C10384 c10384 = new C10384();
        if (!m38493(str)) {
            return null;
        }
        String m38492 = m38492(1);
        String m384922 = m38492(2);
        String m384923 = m38492(3);
        String m384924 = m38492(4);
        String m384925 = m38492(5);
        String m384926 = m38492(9);
        try {
            c10384.m26185(m38494(m384925));
        } catch (ParseException unused) {
        }
        if (m38492.trim().equals("d")) {
            c10384.m26181(1);
        } else {
            c10384.m26181(0);
        }
        c10384.m26196(m384923);
        c10384.m26194(m384926.trim());
        c10384.m26183(Long.parseLong(m384924.trim()));
        if (m384922.indexOf(82) != -1) {
            c10384.m26182(0, 0, true);
        }
        if (m384922.indexOf(87) != -1) {
            c10384.m26182(0, 1, true);
        }
        return c10384;
    }
}
