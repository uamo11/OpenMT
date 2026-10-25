package l;

/* compiled from: XBIX */
/* renamed from: l.ܰۤۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum C13751 extends EnumC15038 {
    public /* synthetic */ C13751() {
        this("Doctype", 50);
    }

    public C13751(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char m18391 = c6758.m18391();
        if (m18391 == '\t' || m18391 == '\n' || m18391 == '\f' || m18391 == '\r' || m18391 == ' ') {
            c15223.m36030(EnumC15038.f45879);
            return;
        }
        if (m18391 != '>') {
            if (m18391 == 65535) {
                c15223.m36024(this);
            } else {
                c15223.m36027(this);
                c15223.m36030(EnumC15038.f45879);
                return;
            }
        }
        c15223.m36027(this);
        C3936 c3936 = c15223.f46728;
        c3936.mo1924();
        c3936.getClass();
        c15223.m36029();
        c15223.m36030(EnumC15038.f45846);
    }
}
