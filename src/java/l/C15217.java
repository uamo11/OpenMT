package l;

/* compiled from: Z76C */
/* renamed from: l.ܶۨ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15217 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11418 f46701;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f46702;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36012(C11418 c11418) {
        this.f46701 = c11418;
        this.f46702 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36010(char c) {
        C11418 c11418 = this.f46701;
        if (c11418 == null) {
            throw new IllegalStateException("Output builder is not set");
        }
        if (this.f46702) {
            c11418.append('\n');
            this.f46702 = false;
            if (c == '\n') {
                return;
            }
        }
        if (c == '\r') {
            this.f46702 = true;
        } else {
            this.f46701.append(c);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36011(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        while (i < i2) {
            m36010(charSequence.charAt(i));
            i++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36009() {
        C11418 c11418 = this.f46701;
        if (c11418 == null) {
            throw new IllegalStateException("Output builder is not set");
        }
        if (this.f46702) {
            c11418.append('\n');
            this.f46702 = false;
        }
    }
}
