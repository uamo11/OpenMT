package l;

import java.util.Iterator;
import java.util.Locale;

/* compiled from: B4S2 */
/* renamed from: l.ۧ᩷ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11251 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17600 f33720;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15068 f33721;

    public C11251(C17600 c17600, C15068 c15068) {
        this.f33720 = c17600;
        this.f33721 = c15068;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27839() {
        int i;
        i = this.f33720.f53785;
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15068 m27840(String str) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        boolean startsWith = lowerCase.startsWith(".");
        C17600 c17600 = this.f33720;
        C15068 c15068 = this.f33721;
        if (startsWith) {
            Iterator it = c15068.m35662().iterator();
            while (it.hasNext()) {
                if (lowerCase.equals(((String) it.next()).toLowerCase(Locale.ROOT))) {
                    return c15068;
                }
            }
            return C17600.m41132(c17600, lowerCase);
        }
        String m35657 = c15068.m35657();
        return (m35657 == null || !lowerCase.equals(m35657.toLowerCase(locale))) ? C17600.m41136(c17600, lowerCase) : c15068;
    }
}
