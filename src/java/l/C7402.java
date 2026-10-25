package l;

/* compiled from: XBIX */
/* renamed from: l.۟ۤۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C7402 extends EnumC15038 {
    public /* synthetic */ C7402() {
        this("BeforeDoctypeName", 51);
    }

    public C7402(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        if (c6758.m18387()) {
            c15223.f46728.mo1924();
            c15223.m36030(EnumC15038.f45848);
            return;
        }
        char m18391 = c6758.m18391();
        if (m18391 == 0) {
            c15223.m36027(this);
            C3936 c3936 = c15223.f46728;
            c3936.mo1924();
            c3936.f12554.append((char) 65533);
            c15223.m36030(EnumC15038.f45848);
            return;
        }
        if (m18391 != ' ') {
            if (m18391 == 65535) {
                c15223.m36024(this);
                C3936 c39362 = c15223.f46728;
                c39362.mo1924();
                c39362.getClass();
                c15223.m36029();
                c15223.m36030(EnumC15038.f45846);
                return;
            }
            if (m18391 == '\t' || m18391 == '\n' || m18391 == '\f' || m18391 == '\r') {
                return;
            }
            c15223.f46728.mo1924();
            c15223.f46728.f12554.append(m18391);
            c15223.m36030(EnumC15038.f45848);
        }
    }
}
