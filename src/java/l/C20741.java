package l;

/* compiled from: E1CE */
/* renamed from: l.᩷۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20741 implements Comparable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9452 f66769;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15800 f66770;

    public C20741(C9452 c9452) {
        this.f66769 = c9452;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f66770.f48743 - ((C15800) obj).f48743;
    }

    public final String toString() {
        String str = "[ ";
        if (this.f66770 != null) {
            for (int i = 0; i < 9; i++) {
                StringBuilder m15339 = C5368.m15339(str);
                m15339.append(this.f66770.f48741[i]);
                m15339.append(" ");
                str = m15339.toString();
            }
        }
        StringBuilder m19190 = C7166.m19190(str, "] ");
        m19190.append(this.f66770);
        return m19190.toString();
    }
}
