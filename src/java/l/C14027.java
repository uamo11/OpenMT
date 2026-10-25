package l;

/* compiled from: C5LF */
/* renamed from: l.ܰ᩵ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14027 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f42416;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f42417;

    public C14027(int i, long j) {
        this.f42417 = j;
        this.f42416 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m33643() {
        return this.f42416;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14027 m33642(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            j = (j * 10) + (charAt - '0');
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new C14027(i3, j);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m33644() {
        return (int) this.f42417;
    }
}
