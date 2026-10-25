package l;

/* compiled from: XBIX */
/* renamed from: l.ۧۤۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum C10931 extends EnumC15038 {
    public /* synthetic */ C10931() {
        this("ScriptDataEscapedDash", 22);
    }

    public C10931(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        if (c6758.m18389()) {
            c15223.m36024(this);
            c15223.m36030(EnumC15038.f45846);
            return;
        }
        char m18391 = c6758.m18391();
        if (m18391 == 0) {
            c15223.m36027(this);
            c15223.m36018((char) 65533);
            c15223.m36030(EnumC15038.f45896);
        } else if (m18391 == '-') {
            c15223.m36018(m18391);
            c15223.m36030(EnumC15038.f45858);
        } else if (m18391 == '<') {
            c15223.m36030(EnumC15038.f45847);
        } else {
            c15223.m36018(m18391);
            c15223.m36030(EnumC15038.f45896);
        }
    }
}
