package l;

/* compiled from: XBIX */
/* renamed from: l.֡֨ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum C0077 extends EnumC19541 {
    public /* synthetic */ C0077() {
        this("TagName", 9);
    }

    public C0077(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo1032(C19129 c19129, C17842 c17842) {
        String str;
        c19129.f60287.m22256(c17842.m41790());
        char m41800 = c17842.m41800();
        if (m41800 != 0) {
            if (m41800 != ' ') {
                if (m41800 == '/') {
                    c19129.m44177(EnumC19541.f63123);
                    return;
                }
                if (m41800 == '<') {
                    c17842.m41798();
                    c19129.m44174(this);
                } else if (m41800 != '>') {
                    if (m41800 == 65535) {
                        c19129.m44171(this);
                        c19129.m44177(EnumC19541.f63120);
                        return;
                    } else if (m41800 != '\t' && m41800 != '\n' && m41800 != '\f' && m41800 != '\r') {
                        AbstractC8545 abstractC8545 = c19129.f60287;
                        abstractC8545.getClass();
                        abstractC8545.m22256(String.valueOf(m41800));
                        return;
                    }
                }
                c19129.m44172();
                c19129.m44177(EnumC19541.f63120);
                return;
            }
            c19129.m44177(EnumC19541.f63142);
            return;
        }
        AbstractC8545 abstractC85452 = c19129.f60287;
        str = EnumC19541.f63160;
        abstractC85452.m22256(str);
    }
}
