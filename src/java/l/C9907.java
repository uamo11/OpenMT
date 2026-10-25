package l;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: W7A7 */
/* renamed from: l.ۢ᩺᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9907 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f29964;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f29965;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f29968;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[][] f29967 = new byte[16][];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f29966 = new int[4];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m25013(int i, byte[] bArr) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f29964;
            if (i2 >= iArr.length) {
                int i3 = this.f29968;
                iArr[i3] = i;
                this.f29967[i3] = bArr;
                this.f29968 = (i3 + 1) % iArr.length;
                return;
            }
            if (iArr[i2] == i) {
                this.f29967[i2] = bArr;
                return;
            }
            i2++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m25014(int i) {
        byte[] bArr;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f29964;
            if (i2 >= iArr.length) {
                bArr = null;
                break;
            }
            if (iArr[i2] == i && (bArr = this.f29967[i2]) != null) {
                break;
            }
            i2++;
        }
        return bArr;
    }

    public C9907() {
        int[] iArr = new int[16];
        this.f29964 = iArr;
        Arrays.fill(iArr, -1);
        Arrays.fill(this.f29966, -1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25011(C9907 c9907, int i, boolean z) {
        int i2;
        boolean z2;
        byte[] bArr;
        synchronized (c9907) {
            if (!z) {
                int i3 = 0;
                while (true) {
                    int[] iArr = c9907.f29964;
                    if (i3 >= iArr.length) {
                        bArr = null;
                        break;
                    }
                    if (iArr[i3] == i && (bArr = c9907.f29967[i3]) != null) {
                        break;
                    }
                    i3++;
                }
                if (bArr != null) {
                    return false;
                }
            }
            int i4 = 0;
            while (true) {
                i2 = c9907.f29965;
                if (i4 >= i2) {
                    z2 = false;
                    break;
                }
                if (c9907.f29966[i4] == i) {
                    z2 = true;
                    break;
                }
                i4++;
            }
            if (z2) {
                return false;
            }
            int[] iArr2 = c9907.f29966;
            if (i2 == iArr2.length) {
                int[] copyOf = Arrays.copyOf(iArr2, iArr2.length * 2);
                c9907.f29966 = copyOf;
                Arrays.fill(copyOf, c9907.f29965, copyOf.length, -1);
            }
            int[] iArr3 = c9907.f29966;
            int i5 = c9907.f29965;
            c9907.f29965 = i5 + 1;
            iArr3[i5] = i;
            return true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25010(C9907 c9907) {
        synchronized (c9907) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25009(int i, C9907 c9907) {
        synchronized (c9907) {
            int i2 = 0;
            while (true) {
                int i3 = c9907.f29965;
                if (i2 >= i3) {
                    break;
                }
                int[] iArr = c9907.f29966;
                if (iArr[i2] == i) {
                    int i4 = i3 - 1;
                    c9907.f29965 = i4;
                    iArr[i2] = iArr[i4];
                    iArr[i4] = -1;
                    break;
                }
                i2++;
            }
            c9907.notifyAll();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25012(int i, C9907 c9907) {
        synchronized (c9907) {
            while (true) {
                boolean z = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= c9907.f29965) {
                        break;
                    }
                    if (c9907.f29966[i2] == i) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (z) {
                    try {
                        c9907.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IOException("Interrupted while reading smali cache data", e);
                    }
                }
            }
        }
    }
}
