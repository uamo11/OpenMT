package l;

import java.util.Locale;

/* compiled from: U410 */
/* renamed from: l.᩷֨۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20542 extends AbstractC13995 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15601 f66153;

    public C20542(AbstractC15601 abstractC15601) {
        this.f66153 = abstractC15601;
    }

    @Override // l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2143(C15014 c15014, Object obj) {
        C2609 c2609;
        C2609 c26092;
        Locale locale = (Locale) obj;
        AbstractC15601 abstractC15601 = this.f66153;
        c2609 = abstractC15601.f48054;
        if (!c2609.contains(c15014)) {
            c26092 = abstractC15601.f48054;
            abstractC15601.f48054 = c26092.m8242(c15014);
        }
        return super.m33479(c15014, locale);
    }

    @Override // l.AbstractC13995
    /* renamed from: ֫ */
    public final String mo23526(Locale locale, String str, Object... objArr) {
        return this.f66153.mo36775(locale, str, objArr);
    }

    @Override // l.AbstractC13995
    /* renamed from: ֫ */
    public final String mo23531(C15014 c15014) {
        C2609 c2609;
        StringBuilder sb = new StringBuilder("");
        c2609 = this.f66153.f48054;
        sb.append(c2609.indexOf(c15014) + 1);
        return sb.toString();
    }
}
