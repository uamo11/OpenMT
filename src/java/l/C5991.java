package l;

/* compiled from: XBIX */
/* renamed from: l.ۛۤۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C5991 extends EnumC15038 {
    public /* synthetic */ C5991() {
        this("CommentEnd", 48);
    }

    public C5991(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        char m18391 = c6758.m18391();
        if (m18391 == 0) {
            c15223.m36027(this);
            StringBuilder sb = c15223.f46723.f8012;
            sb.append("--");
            sb.append((char) 65533);
            c15223.m36030(EnumC15038.f45872);
            return;
        }
        if (m18391 == '!') {
            c15223.m36027(this);
            c15223.m36030(EnumC15038.f45852);
            return;
        }
        if (m18391 == '-') {
            c15223.m36027(this);
            c15223.f46723.f8012.append('-');
            return;
        }
        if (m18391 == '>') {
            c15223.m36026();
            c15223.m36030(EnumC15038.f45846);
        } else if (m18391 == 65535) {
            c15223.m36024(this);
            c15223.m36026();
            c15223.m36030(EnumC15038.f45846);
        } else {
            c15223.m36027(this);
            StringBuilder sb2 = c15223.f46723.f8012;
            sb2.append("--");
            sb2.append(m18391);
            c15223.m36030(EnumC15038.f45872);
        }
    }
}
