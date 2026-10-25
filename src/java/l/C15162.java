package l;

/* compiled from: XBIX */
/* renamed from: l.ܶۤۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum C15162 extends EnumC15038 {
    public /* synthetic */ C15162() {
        this("AttributeValue_unquoted", 39);
    }

    public C15162(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        String m18392 = c6758.m18392(EnumC15038.f45861);
        if (m18392.length() > 0) {
            c15223.f46712.m15308(m18392);
        }
        char m18391 = c6758.m18391();
        if (m18391 != 0) {
            if (m18391 != ' ') {
                if (m18391 != '\"' && m18391 != '`') {
                    if (m18391 == 65535) {
                        c15223.m36024(this);
                        c15223.m36030(EnumC15038.f45846);
                        return;
                    }
                    if (m18391 != '\t' && m18391 != '\n' && m18391 != '\f' && m18391 != '\r') {
                        if (m18391 == '&') {
                            int[] m36022 = c15223.m36022('>', true);
                            if (m36022 != null) {
                                c15223.f46712.m15305(m36022);
                                return;
                            } else {
                                c15223.f46712.m15307('&');
                                return;
                            }
                        }
                        if (m18391 != '\'') {
                            switch (m18391) {
                                case '<':
                                case '=':
                                    break;
                                case '>':
                                    c15223.m36028();
                                    c15223.m36030(EnumC15038.f45846);
                                    break;
                                default:
                                    c15223.f46712.m15307(m18391);
                                    break;
                            }
                            return;
                        }
                    }
                }
                c15223.m36027(this);
                c15223.f46712.m15307(m18391);
                return;
            }
            c15223.m36030(EnumC15038.f45868);
            return;
        }
        c15223.m36027(this);
        c15223.f46712.m15307((char) 65533);
    }
}
