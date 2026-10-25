package l;

/* compiled from: XBIX */
/* renamed from: l.᩺֨ۚ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum C22656 extends EnumC19541 {
    public /* synthetic */ C22656() {
        this("ScriptDataEscapedDashDash", 23);
    }

    public C22656(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        if (c17842.m41785()) {
            c19129.m44171(this);
            c19129.m44177(EnumC19541.f63120);
            return;
        }
        char m41800 = c17842.m41800();
        if (m41800 == 0) {
            c19129.m44174(this);
            c19129.m44162((char) 65533);
            c19129.m44177(EnumC19541.f63168);
        } else {
            if (m41800 == '-') {
                c19129.m44162(m41800);
                return;
            }
            if (m41800 == '<') {
                c19129.m44177(EnumC19541.f63121);
            } else if (m41800 == '>') {
                c19129.m44162(m41800);
                c19129.m44177(EnumC19541.f63125);
            } else {
                c19129.m44162(m41800);
                c19129.m44177(EnumC19541.f63168);
            }
        }
    }
}
