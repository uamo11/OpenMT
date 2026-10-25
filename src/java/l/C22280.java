package l;

import java.util.Locale;

/* compiled from: XBIX */
/* renamed from: l.᩹۫ۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum C22280 extends EnumC15038 {
    public /* synthetic */ C22280() {
        this("RcdataLessthanSign", 10);
    }

    public C22280(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC15038
    /* renamed from: ֫ */
    public void mo1475(C15223 c15223, C6758 c6758) {
        if (c6758.m18393('/')) {
            c15223.m36023();
            c15223.m36021(EnumC15038.f45884);
            return;
        }
        if (c6758.m18387() && c15223.m36016() != null) {
            String str = "</" + c15223.m36016();
            Locale locale = Locale.ENGLISH;
            String lowerCase = str.toLowerCase(locale);
            String upperCase = str.toUpperCase(locale);
            if (c6758.m18397(lowerCase) <= -1 && c6758.m18397(upperCase) <= -1) {
                AbstractC5347 m36017 = c15223.m36017(false);
                String m36016 = c15223.m36016();
                m36017.f16665 = m36016;
                m36017.f16669 = m36016 != null ? m36016.toLowerCase(locale) : "";
                c15223.f46712 = m36017;
                c15223.m36028();
                c6758.m18381();
                c15223.m36030(EnumC15038.f45846);
                return;
            }
        }
        c15223.m36019("<");
        c15223.m36030(EnumC15038.f45890);
    }
}
