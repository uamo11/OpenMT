package l;

/* compiled from: TBJG */
/* renamed from: l.ۜܳۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6822 extends AbstractC1883 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f21147;

    public C6822(int i) {
        super(0);
        this.f21147 = false;
    }

    @Override // l.AbstractC1883
    /* renamed from: ֫ */
    public final void mo6227() {
        this.f21147 = false;
    }

    @Override // l.AbstractC1883
    /* renamed from: ۧ */
    public final int mo6229() {
        return (m6233().endsWith("/>") || m6233().endsWith("/ >") || m6233().startsWith("</")) ? 0 : 1;
    }

    @Override // l.AbstractC1883
    /* renamed from: ܽ */
    public final int mo6231() {
        return m6233().startsWith("</") ? -1 : 0;
    }

    @Override // l.AbstractC1883
    /* renamed from: ܳ */
    public final String mo6230() {
        int read;
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (!this.f21147 && (read = this.f6393.read()) != -1) {
            char c = (char) read;
            sb.append(c);
            if (c == '\"') {
                z = !z;
            }
            if (c == '>' && !z) {
                this.f21147 = true;
            }
        }
        return sb.toString();
    }
}
