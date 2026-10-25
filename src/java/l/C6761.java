package l;

import java.util.function.IntUnaryOperator;

/* compiled from: 1AG9 */
/* renamed from: l.ۜ۫ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6761 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float[] f20987;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f20988;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f20989;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final CharSequence f20990;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f20991;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f20992;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f20993;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9584 f20994;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f20995;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f20996;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f20997;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final IntUnaryOperator f20998;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f20999;

    public C6761(C9584 c9584, CharSequence charSequence, int i, int i2, float f, IntUnaryOperator intUnaryOperator) {
        this.f20994 = c9584;
        this.f20990 = charSequence;
        this.f20997 = i;
        this.f20996 = i;
        this.f20991 = i;
        this.f20992 = i2;
        this.f20995 = f;
        this.f20998 = intUnaryOperator;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m18409() {
        return this.f20988;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m18408(int i) {
        boolean z;
        char charAt = this.f20990.charAt(i);
        byte m30591 = C12425.m30591(charAt);
        if (m30591 == 15 && !C13835.m33198(charAt)) {
            return true;
        }
        if (m30591 != 8) {
            return false;
        }
        z = this.f20994.f29076;
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0158, code lost:
    
        return java.lang.Math.min(r18, r17.f20988);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m18410(float r18, int r19) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6761.m18410(float, int):float");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m18411(float f) {
        int i;
        int i2;
        float f2;
        if (f <= 0.0f) {
            return this.f20991;
        }
        do {
            i = this.f20996;
            i2 = this.f20992;
            if (i >= i2) {
                return i2;
            }
            f2 = this.f20988;
        } while (((m18410(Float.POSITIVE_INFINITY, C22412.m50336(i, i2, this.f20990)) - f2) / 2.0f) + f2 <= f);
        return i;
    }
}
