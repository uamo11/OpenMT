package l;

/* compiled from: XBIX */
/* renamed from: l.ᩴ۠ۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public enum C18630 extends EnumC19541 {
    public /* synthetic */ C18630() {
        this("Rcdata", 2);
    }

    public C18630(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char m41799 = c17842.m41799();
        if (m41799 == 0) {
            c19129.m44174(this);
            c17842.m41782();
            c19129.m44162((char) 65533);
        } else {
            if (m41799 == '&') {
                c19129.m44167(EnumC19541.f63148);
                return;
            }
            if (m41799 == '<') {
                c19129.m44167(EnumC19541.f63143);
            } else if (m41799 == 65535) {
                c19129.m44166(new C6428());
            } else {
                c19129.m44163(c17842.m41805());
            }
        }
    }
}
