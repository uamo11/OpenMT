package l;

/* compiled from: LAP1 */
/* renamed from: l.۬ᩳۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13277 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f39751;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public CharSequence f39752;

    public C13277(CharSequence charSequence) {
        this.f39752 = charSequence;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m32240() {
        int i = this.f39751;
        CharSequence charSequence = this.f39752;
        if (i >= charSequence.length()) {
            return null;
        }
        char charAt = charSequence.charAt(this.f39751);
        if (charAt == 'L') {
            StringBuilder sb = new StringBuilder();
            int i2 = this.f39751;
            this.f39751 = i2 + 1;
            sb.append(charSequence.charAt(i2));
            while (this.f39751 < charSequence.length()) {
                int i3 = this.f39751;
                this.f39751 = i3 + 1;
                char charAt2 = charSequence.charAt(i3);
                sb.append(charAt2);
                if (charAt2 == ';') {
                    break;
                }
            }
            return sb.toString();
        }
        if (charAt != '[') {
            this.f39751++;
            return String.valueOf(charAt);
        }
        StringBuilder sb2 = new StringBuilder();
        int i4 = this.f39751;
        this.f39751 = i4 + 1;
        sb2.append(charSequence.charAt(i4));
        while (true) {
            if (this.f39751 < charSequence.length()) {
                char charAt3 = charSequence.charAt(this.f39751);
                if (charAt3 == '[') {
                    this.f39751++;
                    sb2.append(charAt3);
                } else {
                    sb2.append(m32240());
                    break;
                }
            } else {
                break;
            }
        }
        return sb2.toString();
    }
}
