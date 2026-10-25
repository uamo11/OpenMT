package l;

import java.text.ParseException;

/* compiled from: 55OK */
/* renamed from: l.ۡۖ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8582 extends AbstractC16342 {
    @Override // l.AbstractC16342
    /* renamed from: ֫ */
    public final C3328 mo11133() {
        return new C3328("OS/2", "MM-dd-yy HH:mm", null);
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
        String str2 = m38492(4) + " " + m38492(5);
        String m384924 = m38492(6);
        try {
            c10384.m26185(m38494(str2));
        } catch (ParseException unused) {
        }
        if (m384923.trim().equals("DIR") || m384922.trim().equals("DIR")) {
            c10384.m26181(1);
        } else {
            c10384.m26181(0);
        }
        c10384.m26194(m384924.trim());
        c10384.m26183(Long.parseLong(m38492.trim()));
        return c10384;
    }
}
