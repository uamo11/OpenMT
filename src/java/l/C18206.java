package l;

/* compiled from: 195F */
/* renamed from: l.ᩳܿ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18206 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f56592;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f56593;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f56594;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f56595;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final char[] f56596;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f56597;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17500 f56598;

    public C18206(String str, C17500 c17500) {
        this.f56594 = str;
        this.f56598 = c17500;
        int[] iArr = new int[str.length()];
        int i = 0;
        for (int i2 = 1; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            while (i > 0 && str.charAt(i) != charAt) {
                i = iArr[i - 1];
            }
            if (str.charAt(i) == charAt) {
                i++;
            }
            iArr[i2] = i;
        }
        this.f56592 = iArr;
        this.f56596 = new char[str.length()];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42420() {
        m42419(0);
        this.f56597 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42421(char c) {
        String str;
        int i = this.f56595;
        char[] cArr = this.f56596;
        if (i == cArr.length) {
            throw new IllegalStateException("Separator matcher buffer is full");
        }
        int i2 = this.f56593 + i;
        if (i2 >= cArr.length) {
            i2 -= cArr.length;
        }
        cArr[i2] = c;
        this.f56595 = i + 1;
        while (true) {
            int i3 = this.f56597;
            str = this.f56594;
            if (i3 <= 0 || str.charAt(i3) == c) {
                break;
            }
            this.f56597 = this.f56592[this.f56597 - 1];
        }
        if (str.charAt(this.f56597) == c) {
            this.f56597++;
        }
        if (this.f56597 != str.length()) {
            m42419(this.f56597);
            return;
        }
        this.f56593 = 0;
        this.f56595 = 0;
        this.f56598.m40886(str);
        this.f56597 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42419(int i) {
        while (true) {
            int i2 = this.f56595;
            if (i2 <= i) {
                return;
            }
            if (i2 == 0) {
                throw new IllegalStateException("Separator matcher buffer is empty");
            }
            int i3 = this.f56593;
            char[] cArr = this.f56596;
            char c = cArr[i3];
            int i4 = i3 + 1;
            if (i4 == cArr.length) {
                i4 = 0;
            }
            this.f56593 = i4;
            this.f56595 = i2 - 1;
            this.f56598.m40885(c);
        }
    }
}
