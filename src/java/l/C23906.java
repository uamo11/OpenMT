package l;

/* compiled from: ZB99 */
/* renamed from: l.᩻᩵ܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23906 extends RuntimeException {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f77295;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f77296;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f77297;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f77298;

    public C23906(C6973 c6973, String str, boolean z) {
        int i;
        int i2;
        i = c6973.f21501;
        this.f77298 = i;
        i2 = c6973.f21500;
        this.f77296 = i2;
        this.f77297 = z;
        this.f77295 = str;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        boolean z = this.f77297;
        String str = this.f77295;
        int i = this.f77298;
        if (z) {
            return "Parse error [" + i + ":eol] " + str;
        }
        StringBuilder m32308 = C13325.m32308(i, "Parse error [", ":");
        m32308.append(this.f77296);
        m32308.append("] ");
        m32308.append(str);
        return m32308.toString();
    }
}
