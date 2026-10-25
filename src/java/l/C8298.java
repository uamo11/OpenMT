package l;

import android.net.Uri;

/* compiled from: J8TB */
/* renamed from: l.۠ܽۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8298 extends AbstractC4846 {

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Object f25478 = new Object();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f25479;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f25480;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f25481;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f25482;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f25483;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f25484 = -9223372036854775807L;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f25485;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f25486;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f25487;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6236 f25488;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f25489;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f25490;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11197 f25491;

    @Override // l.AbstractC4846
    /* renamed from: ֫ */
    public final int mo14095() {
        return 1;
    }

    @Override // l.AbstractC4846
    /* renamed from: ۧ */
    public final int mo14107() {
        return 1;
    }

    static {
        C22464 c22464 = new C22464();
        c22464.m50397("SinglePeriodTimeline");
        c22464.m50395(Uri.EMPTY);
        c22464.m50394();
    }

    public C8298(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, C6664 c6664, C11197 c11197, C6236 c6236) {
        this.f25490 = j;
        this.f25480 = j2;
        this.f25481 = j3;
        this.f25486 = j4;
        this.f25479 = j5;
        this.f25482 = j6;
        this.f25489 = z;
        this.f25487 = z2;
        this.f25483 = z3;
        this.f25485 = c6664;
        c11197.getClass();
        this.f25491 = c11197;
        this.f25488 = c6236;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1 > r5) goto L13;
     */
    @Override // l.AbstractC4846
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C20369 mo14103(int r22, l.C20369 r23, long r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            r2 = r22
            l.C22632.m50627(r2, r1)
            long r1 = r0.f25482
            boolean r13 = r0.f25487
            if (r13 == 0) goto L2c
            boolean r3 = r0.f25483
            if (r3 != 0) goto L2c
            r3 = 0
            int r5 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r5 == 0) goto L2c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r5 = r0.f25486
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L24
            goto L2a
        L24:
            long r1 = r1 + r24
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2c
        L2a:
            r15 = r3
            goto L2d
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r1 = l.C20369.f65748
            long r1 = r0.f25486
            r17 = r1
            long r1 = r0.f25479
            r19 = r1
            l.ۧ᩵֫ r4 = r0.f25491
            java.lang.Object r5 = r0.f25485
            long r6 = r0.f25490
            long r8 = r0.f25480
            long r10 = r0.f25484
            boolean r12 = r0.f25489
            l.ۛᩴ֫ r14 = r0.f25488
            r3 = r23
            r3.m46686(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19)
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8298.mo14103(int, l.᩶᩵֫, long):l.᩶᩵֫");
    }

    @Override // l.AbstractC4846
    /* renamed from: ֫ */
    public final C22485 mo14104(int i, C22485 c22485, boolean z) {
        C22632.m50627(i, 1);
        Object obj = z ? f25478 : null;
        long j = -this.f25479;
        c22485.getClass();
        c22485.m50435(null, obj, 0, this.f25481, j, C7214.f22068, false);
        return c22485;
    }

    @Override // l.AbstractC4846
    /* renamed from: ֫ */
    public final int mo14098(Object obj) {
        return f25478.equals(obj) ? 0 : -1;
    }

    @Override // l.AbstractC4846
    /* renamed from: ֫ */
    public final Object mo14102(int i) {
        C22632.m50627(i, 1);
        return f25478;
    }
}
