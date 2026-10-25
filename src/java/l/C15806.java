package l;

/* compiled from: XBIX */
/* renamed from: l.ܺ۠ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum C15806 extends EnumC19541 {
    public /* synthetic */ C15806() {
        this("BeforeAttributeValue", 36);
    }

    public C15806(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char m41800 = c17842.m41800();
        if (m41800 == 0) {
            c19129.m44174(this);
            c19129.f60287.m22253((char) 65533);
            c19129.m44177(EnumC19541.f63161);
            return;
        }
        if (m41800 != ' ') {
            if (m41800 == '\"') {
                c19129.m44177(EnumC19541.f63154);
                return;
            }
            if (m41800 != '`') {
                if (m41800 == 65535) {
                    c19129.m44171(this);
                    c19129.m44172();
                    c19129.m44177(EnumC19541.f63120);
                    return;
                }
                if (m41800 == '\t' || m41800 == '\n' || m41800 == '\f' || m41800 == '\r') {
                    return;
                }
                if (m41800 == '&') {
                    c17842.m41798();
                    c19129.m44177(EnumC19541.f63161);
                    return;
                }
                if (m41800 == '\'') {
                    c19129.m44177(EnumC19541.f63190);
                    return;
                }
                switch (m41800) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        c19129.m44174(this);
                        c19129.m44172();
                        c19129.m44177(EnumC19541.f63120);
                        break;
                    default:
                        c17842.m41798();
                        c19129.m44177(EnumC19541.f63161);
                        break;
                }
                return;
            }
            c19129.m44174(this);
            c19129.f60287.m22253(m41800);
            c19129.m44177(EnumC19541.f63161);
        }
    }
}
