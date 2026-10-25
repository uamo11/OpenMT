package l;

/* compiled from: TBJG */
/* renamed from: l.ۨܿۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11845 extends AbstractC1883 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f35345;

    public C11845(int i) {
        super(0);
        this.f35345 = false;
    }

    @Override // l.AbstractC1883
    /* renamed from: ֫ */
    public final void mo6227() {
        this.f35345 = false;
    }

    @Override // l.AbstractC1883
    /* renamed from: ܳ */
    public final String mo6230() {
        int read;
        StringBuilder sb = new StringBuilder();
        while (!this.f35345 && (read = this.f6393.read()) != -1) {
            char c = (char) read;
            sb.append(c);
            if (c == '>' && sb.toString().endsWith("-->")) {
                this.f35345 = true;
            }
        }
        return sb.toString();
    }
}
