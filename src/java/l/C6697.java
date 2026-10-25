package l;

/* compiled from: XBIX */
/* renamed from: l.ۜۤۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C6697 extends EnumC15038 {
    public /* synthetic */ C6697() {
        this("ScriptDataDoubleEscaped", 28);
    }

    public C6697(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char m18390 = c6758.m18390();
        if (m18390 == 0) {
            c15223.m36027(this);
            c6758.m18384();
            c15223.m36018((char) 65533);
        } else if (m18390 == '-') {
            c15223.m36018(m18390);
            c15223.m36021(EnumC15038.f45900);
        } else if (m18390 == '<') {
            c15223.m36018(m18390);
            c15223.m36021(EnumC15038.f45921);
        } else if (m18390 == 65535) {
            c15223.m36024(this);
            c15223.m36030(EnumC15038.f45846);
        } else {
            c15223.m36019(c6758.m18383('-', '<', 0));
        }
    }
}
