package l;

/* compiled from: 54FE */
/* renamed from: l.ۤ۟᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10154 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18621 f30535;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8743 f30536;

    public C10154(C8743 c8743, C18621 c18621) {
        this.f30536 = c8743;
        this.f30535 = c18621;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25491(C8743 c8743, C18621 c18621) {
        int m43177 = c18621.m43177();
        if (m43177 != 200 && m43177 != 410 && m43177 != 414 && m43177 != 501 && m43177 != 203 && m43177 != 204) {
            if (m43177 != 307) {
                if (m43177 != 308 && m43177 != 404 && m43177 != 405) {
                    switch (m43177) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (c18621.m43169("Expires") == null && c18621.m43176().m27427() == -1 && !c18621.m43176().m27425() && !c18621.m43176().m27423()) {
                return false;
            }
        }
        return (c18621.m43176().m27424() || c8743.m22617().m27424()) ? false : true;
    }
}
