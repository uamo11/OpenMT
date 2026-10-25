package l;

/* compiled from: 9BJ3 */
/* renamed from: l.ܰۢܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13738 extends C17535 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C13738 f41017 = new C13738(0);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13738 m33037(C13738 c13738, C13738 c137382) {
        int size = c13738.size();
        if (size != c137382.size()) {
            throw new IllegalArgumentException("list1.size() != list2.size()");
        }
        C13738 c137383 = new C13738(size);
        for (int i = 0; i < size; i++) {
            C22911 c22911 = (C22911) c13738.m40978(i);
            C22911 c229112 = (C22911) c137382.m40978(i);
            C22911 c229113 = new C22911();
            c229113.m50996(c22911);
            c229113.m50996(c229112);
            c229113.mo20349();
            c229113.m43732();
            c137383.m40981(i, (Object) c229113);
        }
        c137383.mo20349();
        return c137383;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33038(int i, C22911 c22911) {
        c22911.m43732();
        m40981(i, (Object) c22911);
    }
}
