package l;

/* compiled from: XBIX */
/* renamed from: l.ۢ۠ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C9458 extends EnumC19541 {
    public /* synthetic */ C9458() {
        this("AttributeName", 34);
    }

    public C9458(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        c19129.f60287.m22248(c17842.m41792(EnumC19541.f63186));
        char m41800 = c17842.m41800();
        if (m41800 == '\t' || m41800 == '\n' || m41800 == '\f' || m41800 == '\r' || m41800 == ' ') {
            c19129.m44177(EnumC19541.f63187);
            return;
        }
        if (m41800 != '\"' && m41800 != '\'') {
            if (m41800 == '/') {
                c19129.m44177(EnumC19541.f63123);
                return;
            }
            if (m41800 != 65535) {
                switch (m41800) {
                    case '<':
                        break;
                    case '=':
                        c19129.m44177(EnumC19541.f63124);
                        break;
                    case '>':
                        c19129.m44172();
                        c19129.m44177(EnumC19541.f63120);
                        break;
                    default:
                        c19129.f60287.m22247(m41800);
                        break;
                }
                return;
            }
            c19129.m44171(this);
            c19129.m44177(EnumC19541.f63120);
            return;
        }
        c19129.m44174(this);
        c19129.f60287.m22247(m41800);
    }
}
