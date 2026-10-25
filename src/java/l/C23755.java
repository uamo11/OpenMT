package l;

/* compiled from: TBJG */
/* renamed from: l.᩻ܳۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23755 extends AbstractC1883 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f76901;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f76902;

    @Override // l.AbstractC1883
    /* renamed from: ֫ */
    public final void mo6227() {
        this.f76901 = false;
    }

    @Override // l.AbstractC1883
    /* renamed from: ܿ */
    public final boolean mo6232() {
        return this.f76902;
    }

    @Override // l.AbstractC1883
    /* renamed from: ܳ */
    public final String mo6230() {
        StringBuilder sb = new StringBuilder();
        while (!this.f76901) {
            this.f6393.mark(1);
            int read = this.f6393.read();
            if (read == -1) {
                break;
            }
            char c = (char) read;
            if (c == '<') {
                this.f6393.reset();
                this.f76901 = true;
            } else {
                sb.append(c);
            }
        }
        if (sb.length() < 1) {
            this.f76902 = false;
        } else if (sb.toString().trim().length() == 0) {
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            for (int i = 0; i < sb2.length(); i++) {
                char charAt = sb2.charAt(i);
                if (charAt == '\n' || charAt == '\r') {
                    sb3.append(charAt);
                }
            }
            this.f76902 = false;
            sb = sb3;
        } else {
            this.f76902 = true;
        }
        return sb.toString();
    }
}
