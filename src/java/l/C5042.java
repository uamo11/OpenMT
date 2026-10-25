package l;

/* compiled from: Z1GQ */
/* renamed from: l.ۚ֫ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5042 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f15853;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f15854 = new StringBuilder();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public CharSequence f15855;

    public C5042(int i, CharSequence charSequence) {
        this.f15855 = charSequence;
        this.f15853 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m14562() {
        CharSequence charSequence;
        char charAt;
        while (true) {
            int i = this.f15853;
            charSequence = this.f15855;
            if (i < 0 || !((charAt = charSequence.charAt(i)) == ' ' || charAt == '\t' || charAt == '\n' || charAt == '\r')) {
                break;
            }
            this.f15853--;
        }
        StringBuilder sb = this.f15854;
        sb.setLength(0);
        while (true) {
            int i2 = this.f15853;
            if (i2 >= 0) {
                char charAt2 = charSequence.charAt(i2);
                if (charAt2 == ' ' || charAt2 == '\t' || charAt2 == '\n' || charAt2 == '\r') {
                    break;
                }
                sb.append(charAt2);
                this.f15853--;
            } else {
                return sb.reverse().toString();
            }
        }
        return sb.reverse().toString();
    }
}
