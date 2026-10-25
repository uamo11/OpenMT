package l;

/* compiled from: XBIX */
/* renamed from: l.ۘ۠ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C3813 extends EnumC19541 {
    public /* synthetic */ C3813() {
        this("AttributeValue_singleQuoted", 38);
    }

    public C3813(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        String m41780 = c17842.m41780(true);
        if (m41780.length() > 0) {
            c19129.f60287.m22254(m41780);
        } else {
            c19129.f60287.m22250();
        }
        char m41800 = c17842.m41800();
        if (m41800 == 0) {
            c19129.m44174(this);
            c19129.f60287.m22253((char) 65533);
            return;
        }
        if (m41800 == 65535) {
            c19129.m44171(this);
            c19129.m44177(EnumC19541.f63120);
            return;
        }
        if (m41800 != '&') {
            if (m41800 == '\'') {
                c19129.m44177(EnumC19541.f63179);
                return;
            } else {
                c19129.f60287.m22253(m41800);
                return;
            }
        }
        int[] m44168 = c19129.m44168((Character) '\'', true);
        if (m44168 != null) {
            c19129.f60287.m22249(m44168);
        } else {
            c19129.f60287.m22253('&');
        }
    }
}
