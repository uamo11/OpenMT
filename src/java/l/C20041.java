package l;

/* compiled from: XBIX */
/* renamed from: l.᩶۠ۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public enum C20041 extends EnumC19541 {
    public /* synthetic */ C20041() {
        this("CommentEndDash", 47);
    }

    public C20041(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        char m41800 = c17842.m41800();
        if (m41800 == 0) {
            c19129.m44174(this);
            C14188 c14188 = c19129.f60291;
            c14188.m33847('-');
            c14188.m33847((char) 65533);
            c19129.m44177(EnumC19541.f63146);
            return;
        }
        if (m41800 == '-') {
            c19129.m44177(EnumC19541.f63167);
            return;
        }
        if (m41800 == 65535) {
            c19129.m44171(this);
            c19129.m44176();
            c19129.m44177(EnumC19541.f63120);
        } else {
            C14188 c141882 = c19129.f60291;
            c141882.m33847('-');
            c141882.m33847(m41800);
            c19129.m44177(EnumC19541.f63146);
        }
    }
}
