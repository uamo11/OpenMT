package l;

/* compiled from: XBIX */
/* renamed from: l.᩸۫ۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public enum C21575 extends EnumC15038 {
    public /* synthetic */ C21575() {
        this("TagName", 9);
    }

    public C21575(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        String str;
        c15223.f46712.m15310(c6758.m18388());
        char m18391 = c6758.m18391();
        if (m18391 != 0) {
            if (m18391 != ' ') {
                if (m18391 == '/') {
                    c15223.m36030(EnumC15038.f45849);
                    return;
                }
                if (m18391 == '>') {
                    c15223.m36028();
                    c15223.m36030(EnumC15038.f45846);
                    return;
                }
                if (m18391 == 65535) {
                    c15223.m36024(this);
                    c15223.m36030(EnumC15038.f45846);
                    return;
                } else if (m18391 != '\t' && m18391 != '\n' && m18391 != '\f' && m18391 != '\r') {
                    AbstractC5347 abstractC5347 = c15223.f46712;
                    abstractC5347.getClass();
                    abstractC5347.m15310(String.valueOf(m18391));
                    return;
                }
            }
            c15223.m36030(EnumC15038.f45868);
            return;
        }
        AbstractC5347 abstractC53472 = c15223.f46712;
        str = EnumC15038.f45878;
        abstractC53472.m15310(str);
    }
}
