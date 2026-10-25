package l;

/* compiled from: Y7SB */
/* renamed from: l.᩻᩺֨, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC24000 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 f77784;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f77785;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC23195 f77786;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 f77787;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7067 f77788;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC24000 f77789;

    public AbstractC24000(C7067 c7067, AbstractC23195 abstractC23195) {
        AbstractC5698 m19052;
        C2609 c2609;
        AbstractC24000 m19067;
        C1755 c1755;
        this.f77788 = c7067;
        this.f77786 = abstractC23195;
        m19052 = c7067.m19052(true);
        this.f77787 = m19052;
        c2609 = c7067.f21744;
        this.f77785 = c2609.m8245() - 1;
        m19067 = c7067.m19067();
        this.f77789 = m19067;
        C9184 c9184 = c7067.f21747;
        C6319 c6319 = c9184.f27821;
        c1755 = c9184.f27817;
        this.f77784 = c9184.f27821.m17522(c6319.m17495(c1755, c9184.f27819.f18867, abstractC23195.f74560, 1536L));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m52837() {
        AbstractC4308 abstractC4308 = this.f77786.f74560;
        abstractC4308.getClass();
        return (abstractC4308 instanceof C5843) || m52836() || this.f77784.m8245() > 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m52836() {
        boolean z;
        C9184 c9184 = this.f77788.f21747;
        z = c9184.f27809;
        if (z) {
            return true;
        }
        return c9184.f27821.m17527(c9184.f27808.f66487.f13890, this.f77786.f74560) != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m52835() {
        AbstractC10370 abstractC10370 = this.f77787.f17562;
        if (abstractC10370 == null) {
            return "null";
        }
        String abstractC103702 = abstractC10370.toString();
        return abstractC103702.equals("<clinit>") ? "static" : abstractC103702.equals("<init>") ? "new" : abstractC103702;
    }
}
