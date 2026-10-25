package l;

import java.lang.ref.WeakReference;

/* compiled from: 872H */
/* renamed from: l.ۧܰᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11042 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f33197;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f33198;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f33199;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f33200;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f33201;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f33202;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f33203;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f33204;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final WeakReference f33205;

    public C11042(int i, int i2, int i3, int i4, int i5, int i6, int i7, InterfaceC7785 interfaceC7785, int i8) {
        this.f33200 = i;
        this.f33202 = i2;
        this.f33203 = i3;
        this.f33198 = i4;
        this.f33199 = i5;
        this.f33197 = i6;
        this.f33201 = i7;
        this.f33205 = new WeakReference(interfaceC7785);
        this.f33204 = i8;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27421(int i, int i2, int i3, int i4, int i5, InterfaceC7785 interfaceC7785, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = this.f33200;
        if (i12 <= 0 || interfaceC7785 != this.f33205.get() || i6 != this.f33204 || i5 != this.f33201 || i3 != (i7 = this.f33199) || i4 != (i8 = this.f33197) || (i9 = this.f33202) < 0 || i9 > (i10 = this.f33198) || (i11 = this.f33203) < 0 || i11 > i10) {
            return 0;
        }
        long j = i12;
        if (i9 + j == i7 && i11 + j == i8) {
            if (i < 0 || i > i10 || i2 < 0 || i2 > i10) {
                return 0;
            }
            long j2 = i;
            long j3 = j2 + j;
            long j4 = i2;
            long j5 = j + j4;
            long j6 = i5;
            if (j3 <= j6 && j5 <= j6) {
                long m27420 = m27420(i3, i4, j2, j4);
                long m274202 = m27420(i3, i4, j3, j5);
                if (m274202 < 10 && m274202 < m27420) {
                    return i12;
                }
            }
        }
        return 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m27420(int i, int i2, long j, long j2) {
        long j3 = i;
        long j4 = i2;
        return Math.min(Math.min(Math.abs(j - j3), Math.abs(j - j4)), Math.min(Math.abs(j2 - j3), Math.abs(j2 - j4)));
    }
}
