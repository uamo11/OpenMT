package l;

import java.util.regex.Pattern;

/* compiled from: 37TO */
/* renamed from: l.ܺ֡֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15573 implements InterfaceC17006 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C13478 f47984;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f47985;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f47986;

    static {
        C22651 m32514 = C13478.m32514();
        m32514.m50653('<');
        m32514.m50653('>');
        f47984 = m32514.m50652();
        f47986 = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
        f47985 = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*+$");
    }

    @Override // l.InterfaceC17006
    /* renamed from: ֫ */
    public final C4286 mo10955(C23188 c23188) {
        C9246 m51434 = c23188.m51434();
        m51434.m23723();
        C20535 m23724 = m51434.m23724();
        int i = 0;
        while (true) {
            char m23725 = m51434.m23725();
            if (m23725 == 0) {
                i = -1;
                break;
            }
            if (f47984.m32516(m23725)) {
                break;
            }
            i++;
            m51434.m23723();
        }
        if (i > 0 && m51434.m23725() == '>') {
            C17712 m23718 = m51434.m23718(m23724, m51434.m23724());
            String m41444 = m23718.m41444();
            m51434.m23723();
            String m46315 = f47986.matcher(m41444).matches() ? m41444 : f47985.matcher(m41444).matches() ? C20094.m46315("mailto:", m41444) : null;
            if (m46315 != null) {
                C2315 c2315 = new C2315(m46315, null);
                C12897 c12897 = new C12897(m41444);
                c12897.m1342(m23718.m41447());
                c2315.m1343(c12897);
                return new C4286(c2315, m51434.m23724());
            }
        }
        return null;
    }
}
