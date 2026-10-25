package l;

/* compiled from: 88TM */
/* renamed from: l.ۢ۬֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9599 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C9599 f29128;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f29129;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f29130;

    static {
        C9599 c9599 = new C9599(0L, 0L);
        new C9599(C13132.FOREVER_NS, C13132.FOREVER_NS);
        new C9599(C13132.FOREVER_NS, 0L);
        new C9599(0L, C13132.FOREVER_NS);
        f29128 = c9599;
    }

    public C9599(long j, long j2) {
        C22632.m50631(j >= 0);
        C22632.m50631(j2 >= 0);
        this.f29130 = j;
        this.f29129 = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[RETURN] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m24534(long r12, long r14, long r16) {
        /*
            r11 = this;
            r0 = r11
            long r1 = r0.f29129
            long r3 = r0.f29130
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L10
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L10
            return r12
        L10:
            java.lang.String r7 = l.C3603.f11424
            long r7 = r12 - r3
            long r3 = r3 ^ r12
            long r9 = r12 ^ r7
            long r3 = r3 & r9
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 >= 0) goto L1e
            r7 = -9223372036854775808
        L1e:
            long r3 = r12 + r1
            long r9 = r12 ^ r3
            long r1 = r1 ^ r3
            long r1 = r1 & r9
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 >= 0) goto L2d
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2d:
            r1 = 0
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r2 > 0) goto L38
            int r2 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r2 > 0) goto L38
            r2 = 1
            goto L39
        L38:
            r2 = 0
        L39:
            int r5 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r5 > 0) goto L42
            int r5 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r5 > 0) goto L42
            r1 = 1
        L42:
            if (r2 == 0) goto L57
            if (r1 == 0) goto L57
            long r1 = r14 - r12
            long r1 = java.lang.Math.abs(r1)
            long r3 = r16 - r12
            long r3 = java.lang.Math.abs(r3)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L5c
            goto L59
        L57:
            if (r2 == 0) goto L5a
        L59:
            return r14
        L5a:
            if (r1 == 0) goto L5d
        L5c:
            return r16
        L5d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9599.m24534(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9599.class == obj.getClass()) {
            C9599 c9599 = (C9599) obj;
            if (this.f29130 == c9599.f29130 && this.f29129 == c9599.f29129) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f29130) * 31) + ((int) this.f29129);
    }
}
