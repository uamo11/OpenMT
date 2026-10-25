package l;

/* compiled from: XBIX */
/* renamed from: l.ۙ۫ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C4641 extends EnumC15038 {
    public /* synthetic */ C4641() {
        this("RCDATAEndTagName", 12);
    }

    public C4641(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        if (c6758.m18387()) {
            String m18395 = c6758.m18395();
            c15223.f46712.m15310(m18395);
            c15223.f46720.append(m18395);
            return;
        }
        char m18391 = c6758.m18391();
        if (m18391 == '\t' || m18391 == '\n' || m18391 == '\f' || m18391 == '\r' || m18391 == ' ') {
            if (c15223.m36025()) {
                c15223.m36030(EnumC15038.f45868);
                return;
            } else {
                m13608(c15223, c6758);
                return;
            }
        }
        if (m18391 == '/') {
            if (c15223.m36025()) {
                c15223.m36030(EnumC15038.f45849);
                return;
            } else {
                m13608(c15223, c6758);
                return;
            }
        }
        if (m18391 == '>') {
            if (c15223.m36025()) {
                c15223.m36028();
                c15223.m36030(EnumC15038.f45846);
                return;
            } else {
                m13608(c15223, c6758);
                return;
            }
        }
        m13608(c15223, c6758);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m13608(C15223 c15223, C6758 c6758) {
        c15223.m36019("</" + c15223.f46720.toString());
        c6758.m18381();
        c15223.m36030(EnumC15038.f45890);
    }
}
