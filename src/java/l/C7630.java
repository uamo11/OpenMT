package l;

/* compiled from: B7AT */
/* renamed from: l.۟ᩳۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7630 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f23576;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f23577;

    public C7630(String str, boolean z) {
        this.f23576 = str;
        this.f23577 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7630 m20423(int i, int i2, CharSequence charSequence) {
        if (i >= i2) {
            return new C7630("", i < i2);
        }
        StringBuilder sb = new StringBuilder(Math.min(i2 - i, 480));
        for (int i3 = 0; i < i2 && i3 < 240; i3++) {
            int i4 = i + 1;
            char charAt = charSequence.charAt(i);
            sb.append(charAt);
            if (Character.isHighSurrogate(charAt) && i4 < i2) {
                char charAt2 = charSequence.charAt(i4);
                if (Character.isLowSurrogate(charAt2)) {
                    sb.append(charAt2);
                    i += 2;
                }
            }
            i = i4;
        }
        return new C7630(sb.toString(), i < i2);
    }
}
