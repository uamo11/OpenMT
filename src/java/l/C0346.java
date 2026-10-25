package l;

/* compiled from: XBIX */
/* renamed from: l.֡ۤۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum C0346 extends EnumC15038 {
    public /* synthetic */ C0346() {
        this("BeforeAttributeValue", 36);
    }

    public C0346(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char m18391 = c6758.m18391();
        if (m18391 == 0) {
            c15223.m36027(this);
            c15223.f46712.m15307((char) 65533);
            c15223.m36030(EnumC15038.f45889);
            return;
        }
        if (m18391 != ' ') {
            if (m18391 == '\"') {
                c15223.m36030(EnumC15038.f45881);
                return;
            }
            if (m18391 != '`') {
                if (m18391 == 65535) {
                    c15223.m36024(this);
                    c15223.m36028();
                    c15223.m36030(EnumC15038.f45846);
                    return;
                }
                if (m18391 == '\t' || m18391 == '\n' || m18391 == '\f' || m18391 == '\r') {
                    return;
                }
                if (m18391 == '&') {
                    c6758.m18381();
                    c15223.m36030(EnumC15038.f45889);
                    return;
                }
                if (m18391 == '\'') {
                    c15223.m36030(EnumC15038.f45918);
                    return;
                }
                switch (m18391) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        c15223.m36027(this);
                        c15223.m36028();
                        c15223.m36030(EnumC15038.f45846);
                        break;
                    default:
                        c6758.m18381();
                        c15223.m36030(EnumC15038.f45889);
                        break;
                }
                return;
            }
            c15223.m36027(this);
            c15223.f46712.m15307(m18391);
            c15223.m36030(EnumC15038.f45889);
        }
    }
}
