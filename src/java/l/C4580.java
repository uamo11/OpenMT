package l;

/* compiled from: XBIX */
/* renamed from: l.ۙۤۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C4580 extends EnumC15038 {
    public /* synthetic */ C4580() {
        this("MarkupDeclarationOpen", 43);
    }

    public C4580(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        if (c6758.m18385("--")) {
            c15223.f46723.mo1924();
            c15223.m36030(EnumC15038.f45903);
        } else if (c6758.m18394("DOCTYPE")) {
            c15223.m36030(EnumC15038.f45862);
        } else if (c6758.m18385("[CDATA[")) {
            c15223.m36023();
            c15223.m36030(EnumC15038.f45866);
        } else {
            c15223.m36027(this);
            c15223.m36021(EnumC15038.f45891);
        }
    }
}
