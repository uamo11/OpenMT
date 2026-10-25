package l;

/* compiled from: XBIX */
/* renamed from: l.ۚ۠ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C5224 extends EnumC19541 {
    public /* synthetic */ C5224() {
        this("SelfClosingStartTag", 41);
    }

    public C5224(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char m41800 = c17842.m41800();
        if (m41800 == '>') {
            c19129.f60287.f26116 = true;
            c19129.m44172();
            c19129.m44177(EnumC19541.f63120);
        } else if (m41800 == 65535) {
            c19129.m44171(this);
            c19129.m44177(EnumC19541.f63120);
        } else {
            c17842.m41798();
            c19129.m44174(this);
            c19129.m44177(EnumC19541.f63142);
        }
    }
}
