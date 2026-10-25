package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: O6MN */
/* renamed from: l.ܽ᩵֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16838 extends AbstractC5697 {
    @Override // l.AbstractC5697, l.InterfaceC10076
    /* renamed from: ֫ */
    public final void mo16055(C19249 c19249) {
        Pattern pattern;
        AbstractC0197 m1341 = c19249.m1341();
        if (m1341 instanceof C21365) {
            AbstractC0197 m13412 = m1341.m1341();
            if (m13412 instanceof C12897) {
                C12897 c12897 = (C12897) m13412;
                pattern = C18250.f56729;
                Matcher matcher = pattern.matcher(c12897.m31335());
                if (matcher.matches()) {
                    boolean z = true;
                    String group = matcher.group(1);
                    if (!C11003.equals(group, "X") && !C11003.equals(group, "x")) {
                        z = false;
                    }
                    c19249.m1346(new C13994(z));
                    c12897.m31334(matcher.group(2));
                }
            }
        }
        mo16061(c19249);
    }
}
