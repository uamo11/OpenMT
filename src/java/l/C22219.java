package l;

/* compiled from: XBIX */
/* renamed from: l.᩹ۤۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum C22219 extends EnumC15038 {
    public /* synthetic */ C22219() {
        this("SelfClosingStartTag", 41);
    }

    public C22219(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char m18391 = c6758.m18391();
        if (m18391 == '>') {
            c15223.f46712.f16671 = true;
            c15223.m36028();
            c15223.m36030(EnumC15038.f45846);
        } else if (m18391 == 65535) {
            c15223.m36024(this);
            c15223.m36030(EnumC15038.f45846);
        } else {
            c15223.m36027(this);
            c6758.m18381();
            c15223.m36030(EnumC15038.f45868);
        }
    }
}
