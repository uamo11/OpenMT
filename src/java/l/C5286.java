package l;

/* compiled from: XBIX */
/* renamed from: l.ۚۤۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C5286 extends EnumC15038 {
    public /* synthetic */ C5286() {
        this("AttributeValue_doubleQuoted", 37);
    }

    public C5286(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        String m18383 = c6758.m18383(EnumC15038.f45914);
        if (m18383.length() > 0) {
            c15223.f46712.m15308(m18383);
        } else {
            c15223.f46712.m15311();
        }
        char m18391 = c6758.m18391();
        if (m18391 == 0) {
            c15223.m36027(this);
            c15223.f46712.m15307((char) 65533);
            return;
        }
        if (m18391 == '\"') {
            c15223.m36030(EnumC15038.f45907);
            return;
        }
        if (m18391 != '&') {
            if (m18391 == 65535) {
                c15223.m36024(this);
                c15223.m36030(EnumC15038.f45846);
                return;
            } else {
                c15223.f46712.m15307(m18391);
                return;
            }
        }
        int[] m36022 = c15223.m36022('\"', true);
        if (m36022 != null) {
            c15223.f46712.m15305(m36022);
        } else {
            c15223.f46712.m15307('&');
        }
    }
}
