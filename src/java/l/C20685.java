package l;

/* compiled from: XBIX */
/* renamed from: l.᩷ۛۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public enum C20685 extends EnumC15038 {
    public /* synthetic */ C20685() {
        this("BetweenDoctypePublicAndSystemIdentifiers", 59);
    }

    public C20685(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char m18391 = c6758.m18391();
        if (m18391 == '\t' || m18391 == '\n' || m18391 == '\f' || m18391 == '\r' || m18391 == ' ') {
            return;
        }
        if (m18391 == '\"') {
            c15223.m36027(this);
            c15223.m36030(EnumC15038.f45913);
            return;
        }
        if (m18391 == '\'') {
            c15223.m36027(this);
            c15223.m36030(EnumC15038.f45916);
            return;
        }
        if (m18391 == '>') {
            c15223.m36029();
            c15223.m36030(EnumC15038.f45846);
        } else {
            if (m18391 == 65535) {
                c15223.m36024(this);
                c15223.f46728.getClass();
                c15223.m36029();
                c15223.m36030(EnumC15038.f45846);
                return;
            }
            c15223.m36027(this);
            c15223.f46728.getClass();
            c15223.m36030(EnumC15038.f45920);
        }
    }
}
