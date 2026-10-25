package l;

/* compiled from: XBIX */
/* renamed from: l.᩺۫ۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum C22985 extends EnumC15038 {
    public /* synthetic */ C22985() {
        this("Data", 0);
    }

    public C22985(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char m18390 = c6758.m18390();
        if (m18390 == 0) {
            c15223.m36027(this);
            c15223.m36018(c6758.m18391());
        } else {
            if (m18390 == '&') {
                c15223.m36021(EnumC15038.f45910);
                return;
            }
            if (m18390 == '<') {
                c15223.m36021(EnumC15038.f45894);
            } else if (m18390 == 65535) {
                c15223.m36020(new C18753());
            } else {
                c15223.m36019(c6758.m18398());
            }
        }
    }
}
