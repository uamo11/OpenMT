package l;

/* compiled from: TBJG */
/* renamed from: l.᩺ܿۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23133 extends AbstractC1883 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f74380;

    public C23133(int i) {
        super(0);
        this.f74380 = false;
    }

    @Override // l.AbstractC1883
    /* renamed from: ֫ */
    public final void mo6227() {
        this.f74380 = false;
    }

    @Override // l.AbstractC1883
    /* renamed from: ܳ */
    public final String mo6230() {
        int read;
        StringBuilder sb = new StringBuilder();
        while (!this.f74380 && (read = this.f6393.read()) != -1) {
            char c = (char) read;
            sb.append(c);
            if (c == '>') {
                this.f74380 = true;
            }
        }
        return sb.toString();
    }
}
