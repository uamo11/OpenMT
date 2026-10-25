package l;

/* compiled from: XBIX */
/* renamed from: l.ۖۛۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum C2340 extends EnumC15038 {
    public /* synthetic */ C2340() {
        this("DoctypeSystemIdentifier_singleQuoted", 63);
    }

    public C2340(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char m18391 = c6758.m18391();
        if (m18391 == 0) {
            c15223.m36027(this);
            c15223.f46728.f12556.append((char) 65533);
            return;
        }
        if (m18391 == '\'') {
            c15223.m36030(EnumC15038.f45883);
            return;
        }
        if (m18391 == '>') {
            c15223.m36027(this);
            c15223.f46728.getClass();
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
        c15223.f46728.f12556.append(m18391);
    }
}
