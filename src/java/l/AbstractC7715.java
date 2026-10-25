package l;

/* compiled from: O44L */
/* renamed from: l.۟᩷۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC7715 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14439 f23844;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f23845;

    /* renamed from: ֫ */
    public void mo17358() {
    }

    /* renamed from: ۧ */
    public void mo17361() {
    }

    /* renamed from: ᩻ */
    public int mo17365() {
        return 0;
    }

    public AbstractC7715(C14439 c14439, int i) {
        this.f23844 = c14439;
        this.f23845 = i;
    }

    /* renamed from: ᩳ */
    public AbstractC7715 mo5817() {
        throw new AssertionError();
    }

    /* renamed from: ܳ */
    public void mo5815() {
        throw new AssertionError("store unsupported: " + this);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC7715 mo20666() {
        throw new AssertionError(this);
    }

    /* renamed from: ۧ */
    public void mo17362(int i) {
        AbstractC7715[] abstractC7715Arr;
        abstractC7715Arr = this.f23844.f44255;
        abstractC7715Arr[i].mo17361();
    }

    /* renamed from: ܿ */
    public C6304 mo17363() {
        mo5817();
        return this.f23844.m34467(EnumC17734.f54268);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC7715 mo20665(int i) {
        AbstractC7715[] abstractC7715Arr;
        int i2 = this.f23845;
        if (i2 == i) {
            return this;
        }
        mo5817();
        int m4795 = C1365.m4795(i2);
        int m47952 = C1365.m4795(i);
        C14439 c14439 = this.f23844;
        if (m4795 != m47952) {
            c14439.f44254.m4824((m4795 * 3) + 133 + (m47952 > m4795 ? m47952 - 1 : m47952));
        }
        if (i != m47952) {
            c14439.f44254.m4824(i + 140);
        }
        abstractC7715Arr = c14439.f44255;
        return abstractC7715Arr[i];
    }
}
