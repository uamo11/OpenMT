package l;

import com.google.android.material.slider.BasicLabelFormatter;

/* compiled from: A6LD */
/* renamed from: l.ܰܿܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13963 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f41670;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f41671;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f41672;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f41673 = new StringBuilder();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33413(int i, CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb = this.f41673;
        if (length > BasicLabelFormatter.MILLION - sb.length()) {
            throw new C1886();
        }
        for (int i2 = 0; i2 <= charSequence.length(); i2++) {
            if (i2 == i) {
                this.f41672 = this.f41670;
            }
            if (i2 == charSequence.length()) {
                return;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt == '\n' && this.f41671) {
                this.f41671 = false;
            } else {
                boolean z = charAt == '\r';
                this.f41671 = z;
                if (z) {
                    charAt = '\n';
                }
                if (charAt == '\n') {
                    int i3 = this.f41670 + 1;
                    this.f41670 = i3;
                    if (i3 >= 20000) {
                        throw new C1886();
                    }
                }
                sb.append(charAt);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m33412() {
        return this.f41672;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m33414() {
        return this.f41673.toString();
    }
}
