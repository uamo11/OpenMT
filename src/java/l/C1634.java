package l;

/* compiled from: XBIX */
/* renamed from: l.֫ۛۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum C1634 extends EnumC15038 {
    public /* synthetic */ C1634() {
        this("DoctypeName", 52);
    }

    public C1634(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        if (c6758.m18387()) {
            c15223.f46728.f12554.append(c6758.m18395());
            return;
        }
        char m18391 = c6758.m18391();
        if (m18391 != 0) {
            if (m18391 != ' ') {
                if (m18391 == '>') {
                    c15223.m36029();
                    c15223.m36030(EnumC15038.f45846);
                    return;
                }
                if (m18391 == 65535) {
                    c15223.m36024(this);
                    c15223.f46728.getClass();
                    c15223.m36029();
                    c15223.m36030(EnumC15038.f45846);
                    return;
                }
                if (m18391 != '\t' && m18391 != '\n' && m18391 != '\f' && m18391 != '\r') {
                    c15223.f46728.f12554.append(m18391);
                    return;
                }
            }
            c15223.m36030(EnumC15038.f45859);
            return;
        }
        c15223.m36027(this);
        c15223.f46728.f12554.append((char) 65533);
    }
}
