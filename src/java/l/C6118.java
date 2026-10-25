package l;

import java.util.Arrays;

/* compiled from: G8MT */
/* renamed from: l.ۛܳۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6118 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f18745;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean[] f18746 = new boolean[15];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f18747;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f18748;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f18749;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f18750;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f18751;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f18752;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m17033() {
        this.f18749 = 0L;
        this.f18750 = 0L;
        this.f18748 = 0L;
        this.f18752 = 0;
        Arrays.fill(this.f18746, false);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m17034() {
        return this.f18749 > 15 && this.f18752 == 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m17032() {
        long j = this.f18749;
        if (j == 0) {
            return false;
        }
        return this.f18746[(int) ((j - 1) % 15)];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m17031() {
        return this.f18748;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m17029() {
        long j = this.f18750;
        if (j == 0) {
            return 0L;
        }
        return this.f18748 / j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17030(long j) {
        long j2 = this.f18749;
        if (j2 == 0) {
            this.f18747 = j;
        } else if (j2 == 1) {
            long j3 = j - this.f18747;
            this.f18745 = j3;
            this.f18748 = j3;
            this.f18750 = 1L;
        } else {
            long j4 = j - this.f18751;
            int i = (int) (j2 % 15);
            long abs = Math.abs(j4 - this.f18745);
            boolean[] zArr = this.f18746;
            if (abs <= 1000000) {
                this.f18750++;
                this.f18748 += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.f18752--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.f18752++;
            }
        }
        this.f18749++;
        this.f18751 = j;
    }
}
