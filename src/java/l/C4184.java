package l;

import java.lang.reflect.Field;
import java.util.Arrays;

/* compiled from: M9PM */
/* renamed from: l.ۘ᩷ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4184 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12755[] f13631 = new C12755[2];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12755 m12629(Class cls, C14934 c14934) {
        Field m43845;
        Field m438452;
        int m35387 = c14934.m35387();
        C12755[] c12755Arr = this.f13631;
        if (m35387 >= c12755Arr.length) {
            this.f13631 = (C12755[]) Arrays.copyOf(c12755Arr, m35387 * 2);
        }
        C12755 c12755 = this.f13631[m35387];
        if (c12755 != null) {
            return c12755;
        }
        String m43840 = C19001.m43840(c14934.getName());
        String m37867 = C16014.m37867(m43840, "_");
        m43845 = C19001.m43845(cls, C16014.m37867(m43840, "Case_"));
        m438452 = C19001.m43845(cls, m37867);
        C12755 c127552 = new C12755(m43845, m438452);
        this.f13631[m35387] = c127552;
        return c127552;
    }
}
