package l;

/* compiled from: XBIX */
/* renamed from: l.ۢۤۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C9520 extends EnumC15038 {
    public /* synthetic */ C9520() {
        this("ScriptDataDoubleEscapedDash", 29);
    }

    public C9520(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char m18391 = c6758.m18391();
        if (m18391 == 0) {
            c15223.m36027(this);
            c15223.m36018((char) 65533);
            c15223.m36030(EnumC15038.f45902);
        } else if (m18391 == '-') {
            c15223.m36018(m18391);
            c15223.m36030(EnumC15038.f45892);
        } else if (m18391 == '<') {
            c15223.m36018(m18391);
            c15223.m36030(EnumC15038.f45921);
        } else if (m18391 == 65535) {
            c15223.m36024(this);
            c15223.m36030(EnumC15038.f45846);
        } else {
            c15223.m36018(m18391);
            c15223.m36030(EnumC15038.f45902);
        }
    }
}
