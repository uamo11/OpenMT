package l;

/* compiled from: D70T */
/* renamed from: l.ۗۧܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3196 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f10072;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f10073;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f10074;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13073 f10075;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f10076;

    public C3196(C13073 c13073, int i, int i2, long j, int i3) {
        this.f10075 = c13073;
        this.f10074 = i;
        this.f10072 = i2;
        this.f10073 = j;
        this.f10076 = i3;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m9826() {
        long j;
        long j2 = this.f10073;
        j = this.f10075.f39148;
        return j2 < j;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m9827() {
        if (!m9826()) {
            throw new IndexOutOfBoundsException("Recipe cursor exhausted");
        }
        return this.f10076;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9825() {
        long j;
        AbstractC11164[] abstractC11164Arr;
        AbstractC11164[] abstractC11164Arr2;
        if (m9826()) {
            long j2 = this.f10073 + 1;
            this.f10073 = j2;
            C13073 c13073 = this.f10075;
            j = c13073.f39148;
            if (j2 >= j) {
                return;
            }
            abstractC11164Arr = c13073.f39146;
            AbstractC11164 abstractC11164 = abstractC11164Arr[this.f10074];
            int i = this.f10072 + 1;
            this.f10072 = i;
            if (i < abstractC11164.mo21898()) {
                this.f10076 = abstractC11164.mo21896(this.f10076);
                return;
            }
            this.f10074++;
            this.f10072 = 0;
            abstractC11164Arr2 = c13073.f39146;
            this.f10076 = abstractC11164Arr2[this.f10074].mo21899(0);
        }
    }
}
