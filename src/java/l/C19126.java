package l;

/* compiled from: T8IH */
/* renamed from: l.᩵֨֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19126 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f60276;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19126 m44156(C17714 c17714) {
        String str;
        c17714.m41478(2);
        int m41456 = c17714.m41456();
        int i = m41456 >> 1;
        int m414562 = ((c17714.m41456() >> 3) & 31) | ((m41456 & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder m15339 = C5368.m15339(str);
        m15339.append(i < 10 ? ".0" : ".");
        m15339.append(i);
        m15339.append(m414562 < 10 ? ".0" : ".");
        m15339.append(m414562);
        return new C19126(m15339.toString());
    }

    public C19126(String str) {
        this.f60276 = str;
    }
}
