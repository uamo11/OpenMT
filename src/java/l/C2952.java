package l;

import java.util.Arrays;

/* compiled from: 2708 */
/* renamed from: l.ۗۖܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2952 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f9369;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f9370;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f9372;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean[] f9373;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long[] f9378;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f9379;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC4363[] f9380;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int[] f9371 = new int[16];

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f9377 = new int[16];

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f9374 = new int[16];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f9376 = -1;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21834[] f9375 = new C21834[16];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m8996() {
        return this.f9372;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m9005() {
        return (this.f9376 << 32) | (this.f9372 & 4294967295L);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m9007() {
        this.f9369 = true;
        this.f9376 = -1;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m9002() {
        this.f9369 = false;
        this.f9376 = -1;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m9009(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax effect end");
        }
        if (this.f9369) {
            this.f9376 = Math.max(this.f9376, i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8989(int i, int i2, C21834 c21834) {
        return m8985(i, i2, c21834, true);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m8997(int i, int i2, C21834 c21834) {
        return m8985(i, i2, c21834, !this.f9369);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m8985(int i, int i2, C21834 c21834, boolean z) {
        if (i < 0 || i2 < i) {
            throw new IllegalArgumentException(C18307.m42646("Invalid style range: ", i, i2, ".."));
        }
        C11003.requireNonNull(c21834, "style");
        if (c21834 == C21834.f69949 || i == i2) {
            return -1;
        }
        if (this.f9372 == this.f9371.length) {
            m8987();
        }
        int i3 = this.f9372;
        this.f9372 = i3 + 1;
        int[] iArr = this.f9371;
        iArr[i3] = i;
        this.f9377[i3] = i2;
        this.f9375[i3] = c21834;
        long[] jArr = this.f9378;
        if (jArr != null) {
            jArr[i3] = 0;
        }
        this.f9374[i3] = -1;
        if (z) {
            boolean[] zArr = this.f9373;
            if (zArr != null) {
                zArr[i3] = false;
            }
            m9009(i2);
        } else {
            if (this.f9373 == null) {
                this.f9373 = new boolean[iArr.length];
            }
            this.f9373[i3] = true;
        }
        if (this.f9380 != null) {
            this.f9379[i3] = -1;
        }
        return i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8990(C21503 c21503) {
        if (this.f9372 == this.f9371.length) {
            m8987();
        }
        if (this.f9380 == null) {
            int[] iArr = this.f9371;
            this.f9380 = new InterfaceC4363[iArr.length];
            this.f9370 = new int[iArr.length];
            this.f9379 = new int[iArr.length];
        }
        int i = this.f9372;
        this.f9372 = i + 1;
        boolean[] zArr = this.f9373;
        if (zArr != null) {
            zArr[i] = false;
        }
        this.f9375[i] = null;
        long[] jArr = this.f9378;
        if (jArr != null) {
            jArr[i] = 0;
        }
        this.f9374[i] = -1;
        this.f9380[i] = c21503;
        this.f9370[i] = -1;
        this.f9379[i] = -1;
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8998(int i, int i2) {
        this.f9370[i] = i2;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m9001(int i) {
        return this.f9370[i];
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m9003(int i) {
        if (i >= 0 && this.f9380 != null) {
            while (i >= 0) {
                if (this.f9380[i] != null) {
                    return true;
                }
                i = this.f9370[i];
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m9000(int i) {
        return this.f9369 && this.f9376 > i;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m9006(int i) {
        InterfaceC4363 interfaceC4363 = this.f9380[i];
        if (interfaceC4363 != null) {
            this.f9379[i] = interfaceC4363.mo13079();
            this.f9380[i] = null;
        }
        return this.f9379[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8992(int i, int i2) {
        this.f9374[i] = i2;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m9004(int i) {
        return this.f9374[i];
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m8995(int i) {
        return this.f9371[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8988(int i) {
        return this.f9377[i];
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21834 m9008(int i) {
        return this.f9375[i];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8999(int i, int i2, int i3) {
        C11003.checkIndex(i, this.f9372);
        int[] iArr = this.f9371;
        if (i2 == iArr[i] && i3 == this.f9377[i]) {
            return;
        }
        if (this.f9378 == null) {
            this.f9378 = new long[iArr.length];
        }
        this.f9378[i] = (i3 & 4294967295L) | (i2 << 32);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8993(int i, int i2, int i3) {
        C11003.checkIndex(i, this.f9372);
        C21834 c21834 = this.f9375[i];
        if (c21834 == null) {
            return;
        }
        if (c21834.m49200() != null) {
            long[] jArr = this.f9378;
            long j = jArr == null ? 0L : jArr[i];
            int i4 = j == 0 ? this.f9371[i] : (int) (j >>> 32);
            int i5 = j == 0 ? this.f9377[i] : (int) j;
            if (i4 < i2 || i5 > i3) {
                C21834[] c21834Arr = this.f9375;
                c21834Arr[i] = c21834Arr[i].m49202((String) null);
            }
        }
        int min = Math.min(i3, Math.max(i2, this.f9371[i]));
        this.f9371[i] = min;
        int[] iArr = this.f9377;
        iArr[i] = Math.max(min, Math.min(i3, iArr[i]));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8994(long j) {
        m8986((int) j);
        this.f9376 = (int) (j >> 32);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m8986(int i) {
        int i2;
        if (i < 0 || i > (i2 = this.f9372)) {
            StringBuilder m32308 = C13325.m32308(i, "Invalid style journal mark: ", ", size=");
            m32308.append(this.f9372);
            throw new IllegalArgumentException(m32308.toString());
        }
        Arrays.fill(this.f9375, i, i2, (Object) null);
        InterfaceC4363[] interfaceC4363Arr = this.f9380;
        if (interfaceC4363Arr != null) {
            Arrays.fill(interfaceC4363Arr, i, this.f9372, (Object) null);
        }
        boolean[] zArr = this.f9373;
        if (zArr != null) {
            Arrays.fill(zArr, i, this.f9372, false);
        }
        this.f9372 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8991() {
        m8986(0);
        this.f9376 = -1;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m8987() {
        int min = (int) Math.min(2147483647L, this.f9372 + (r0 >> 1));
        if (min <= this.f9372) {
            throw new OutOfMemoryError("Syntax style journal capacity exceeded");
        }
        this.f9371 = Arrays.copyOf(this.f9371, min);
        this.f9377 = Arrays.copyOf(this.f9377, min);
        this.f9374 = Arrays.copyOf(this.f9374, min);
        this.f9375 = (C21834[]) Arrays.copyOf(this.f9375, min);
        long[] jArr = this.f9378;
        if (jArr != null) {
            this.f9378 = Arrays.copyOf(jArr, min);
        }
        boolean[] zArr = this.f9373;
        if (zArr != null) {
            this.f9373 = Arrays.copyOf(zArr, min);
        }
        InterfaceC4363[] interfaceC4363Arr = this.f9380;
        if (interfaceC4363Arr != null) {
            this.f9380 = (InterfaceC4363[]) Arrays.copyOf(interfaceC4363Arr, min);
            this.f9370 = Arrays.copyOf(this.f9370, min);
            this.f9379 = Arrays.copyOf(this.f9379, min);
        }
    }
}
