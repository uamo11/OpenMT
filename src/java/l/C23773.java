package l;

/* compiled from: XBIX */
/* renamed from: l.᩻ܶۚ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum C23773 extends EnumC19541 {
    public /* synthetic */ C23773() {
        this("DoctypeSystemIdentifier_doubleQuoted", 62);
    }

    public C23773(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char m41800 = c17842.m41800();
        if (m41800 == 0) {
            c19129.m44174(this);
            c19129.f60286.f75038.append((char) 65533);
            return;
        }
        if (m41800 == '\"') {
            c19129.m44177(EnumC19541.f63156);
            return;
        }
        if (m41800 == '>') {
            c19129.m44174(this);
            c19129.f60286.f75041 = true;
            c19129.m44175();
            c19129.m44177(EnumC19541.f63120);
            return;
        }
        if (m41800 == 65535) {
            c19129.m44171(this);
            c19129.f60286.f75041 = true;
            c19129.m44175();
            c19129.m44177(EnumC19541.f63120);
            return;
        }
        c19129.f60286.f75038.append(m41800);
    }
}
