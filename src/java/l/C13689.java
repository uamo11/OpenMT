package l;

/* compiled from: XBIX */
/* renamed from: l.ܰ۠ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum C13689 extends EnumC19541 {
    public /* synthetic */ C13689() {
        this("BeforeDoctypePublicIdentifier", 55);
    }

    public C13689(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char m41800 = c17842.m41800();
        if (m41800 == '\t' || m41800 == '\n' || m41800 == '\f' || m41800 == '\r' || m41800 == ' ') {
            return;
        }
        if (m41800 == '\"') {
            c19129.m44177(EnumC19541.f63144);
            return;
        }
        if (m41800 == '\'') {
            c19129.m44177(EnumC19541.f63165);
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
        c19129.m44174(this);
        c19129.f60286.f75041 = true;
        c19129.m44177(EnumC19541.f63192);
    }
}
