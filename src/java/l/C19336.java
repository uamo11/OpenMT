package l;

/* compiled from: XBIX */
/* renamed from: l.᩵۠ۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public enum C19336 extends EnumC19541 {
    public /* synthetic */ C19336() {
        this("AttributeValue_unquoted", 39);
    }

    public C19336(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        String m41792 = c17842.m41792(EnumC19541.f63189);
        if (m41792.length() > 0) {
            c19129.f60287.m22254(m41792);
        }
        char m41800 = c17842.m41800();
        if (m41800 != 0) {
            if (m41800 != ' ') {
                if (m41800 != '\"' && m41800 != '`') {
                    if (m41800 == 65535) {
                        c19129.m44171(this);
                        c19129.m44177(EnumC19541.f63120);
                        return;
                    }
                    if (m41800 != '\t' && m41800 != '\n' && m41800 != '\f' && m41800 != '\r') {
                        if (m41800 == '&') {
                            int[] m44168 = c19129.m44168((Character) '>', true);
                            if (m44168 != null) {
                                c19129.f60287.m22249(m44168);
                                return;
                            } else {
                                c19129.f60287.m22253('&');
                                return;
                            }
                        }
                        if (m41800 != '\'') {
                            switch (m41800) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c19129.m44172();
                                    c19129.m44177(EnumC19541.f63120);
                                    break;
                                default:
                                    c19129.f60287.m22253(m41800);
                                    break;
                            }
                            return;
                        }
                    }
                }
                c19129.m44174(this);
                c19129.f60287.m22253(m41800);
                return;
            }
            c19129.m44177(EnumC19541.f63142);
            return;
        }
        c19129.m44174(this);
        c19129.f60287.m22253((char) 65533);
    }
}
