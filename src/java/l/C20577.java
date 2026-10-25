package l;

import java.text.ParseException;

/* compiled from: O546 */
/* renamed from: l.᩷ۖ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20577 extends AbstractC16342 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17048 f66257;

    public C20577(C3328 c3328) {
        mo4051(c3328);
        C3328 c33282 = new C3328("WINDOWS", "MM-dd-yy kk:mm", null);
        c33282.m10181("MM-dd-yy kk:mm");
        C17048 c17048 = new C17048();
        this.f66257 = c17048;
        c17048.mo4051(c33282);
    }

    @Override // l.AbstractC16342
    /* renamed from: ֫ */
    public final C3328 mo11133() {
        return new C3328("WINDOWS", "MM-dd-yy hh:mma", null);
    }

    @Override // l.InterfaceC6150
    /* renamed from: ֫ */
    public final C10384 mo11134(String str) {
        if (!m38493(str)) {
            return null;
        }
        C10384 c10384 = new C10384();
        c10384.m26198(str);
        String str2 = m38492(1) + " " + m38492(2);
        String m38492 = m38492(3);
        String m384922 = m38492(4);
        String m384923 = m38492(5);
        if (m384923 == null || m384923.equals(".") || m384923.equals("..")) {
            return null;
        }
        try {
            try {
                c10384.m26185(m38494(str2));
            } catch (ParseException unused) {
            }
        } catch (ParseException unused2) {
            c10384.m26185(this.f66257.m40018(str2));
        }
        c10384.m26194(m384923);
        if ("<DIR>".equals(m38492)) {
            c10384.m26181(1);
            c10384.m26183(0L);
        } else {
            c10384.m26181(0);
            if (m384922 != null) {
                c10384.m26183(Long.parseLong(m384922));
            }
        }
        return c10384;
    }
}
