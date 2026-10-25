package l;

/* compiled from: 97SA */
/* renamed from: l.۠֡֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7813 implements InterfaceC17006 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C13478 f24139;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C13478 f24140;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C13478 f24141;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C13478 f24142;

    static {
        C22651 m32514 = C13478.m32514();
        m32514.m50654('0', '9');
        m32514.m50654('A', 'F');
        m32514.m50654('a', 'f');
        f24142 = m32514.m50652();
        C22651 m325142 = C13478.m32514();
        m325142.m50654('0', '9');
        f24139 = m325142.m50652();
        C22651 m325143 = C13478.m32514();
        m325143.m50654('A', 'Z');
        m325143.m50654('a', 'z');
        C13478 m50652 = m325143.m50652();
        f24141 = m50652;
        C22651 m32515 = m50652.m32515();
        m32515.m50654('0', '9');
        f24140 = m32515.m50652();
    }

    @Override // l.InterfaceC17006
    /* renamed from: ֫ */
    public final C4286 mo10955(C23188 c23188) {
        C9246 m51434 = c23188.m51434();
        C20535 m23724 = m51434.m23724();
        m51434.m23723();
        char m23725 = m51434.m23725();
        if (m23725 == '#') {
            m51434.m23723();
            if (m51434.m23726('x') || m51434.m23726('X')) {
                int m23717 = m51434.m23717(f24142);
                if (1 > m23717 || m23717 > 6 || !m51434.m23726(';')) {
                    return null;
                }
                return m20878(m23724, m51434);
            }
            int m237172 = m51434.m23717(f24139);
            if (1 > m237172 || m237172 > 7 || !m51434.m23726(';')) {
                return null;
            }
            return m20878(m23724, m51434);
        }
        if (!f24141.m32516(m23725)) {
            return null;
        }
        m51434.m23717(f24140);
        if (m51434.m23726(';')) {
            return m20878(m23724, m51434);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4286 m20878(C20535 c20535, C9246 c9246) {
        return new C4286(new C12897(C9931.m25038(c9246.m23718(c20535, c9246.m23724()).m41444())), c9246.m23724());
    }
}
