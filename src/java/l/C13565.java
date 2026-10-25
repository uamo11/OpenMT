package l;

/* compiled from: O8D0 */
/* renamed from: l.ܰۘۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13565 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11450[] f40482;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final double[] f40483;

    public C13565(int i) {
        this.f40483 = new double[i * 64];
        this.f40482 = new C11450[i];
        int i2 = 0;
        while (true) {
            C11450[] c11450Arr = this.f40482;
            if (i2 >= c11450Arr.length) {
                return;
            }
            c11450Arr[i2] = new C11450();
            i2++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32613(int i) {
        double[] dArr;
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = 0;
            while (true) {
                C11450[] c11450Arr = this.f40482;
                if (i3 < c11450Arr.length) {
                    dArr = c11450Arr[i3].f34222;
                    dArr[i2] = this.f40483[i];
                    i3++;
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m32614(int i) {
        double[] dArr;
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = 0;
            while (true) {
                C11450[] c11450Arr = this.f40482;
                if (i3 < c11450Arr.length) {
                    dArr = c11450Arr[i3].f34222;
                    this.f40483[i] = dArr[i2];
                    i3++;
                    i++;
                }
            }
        }
        return i;
    }
}
