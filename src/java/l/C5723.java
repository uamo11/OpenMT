package l;

/* compiled from: XBIX */
/* renamed from: l.ۛ֨ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C5723 extends EnumC19541 {
    public /* synthetic */ C5723() {
        this("ScriptDataEscaped", 21);
    }

    public C5723(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        if (c17842.m41785()) {
            c19129.m44171(this);
            c19129.m44177(EnumC19541.f63120);
            return;
        }
        char m41799 = c17842.m41799();
        if (m41799 == 0) {
            c19129.m44174(this);
            c17842.m41782();
            c19129.m44162((char) 65533);
        } else if (m41799 == '-') {
            c19129.m44162('-');
            c19129.m44167(EnumC19541.f63127);
        } else if (m41799 == '<') {
            c19129.m44167(EnumC19541.f63121);
        } else {
            c19129.m44163(c17842.m41781('-', '<', 0));
        }
    }
}
