package l;

/* compiled from: 68JC */
/* renamed from: l.ۗ᩷ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3485 {
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (r10 == r19.f19530) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if ((r18.m41456() * 1000) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        if (r4 == r3) goto L53;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m10668(l.C17714 r18, l.C6307 r19, int r20, l.C4896 r21) {
        /*
            r0 = r19
            int r1 = r18.m41485()
            long r2 = r18.m41479()
            r4 = 16
            long r4 = r2 >>> r4
            r6 = r20
            long r6 = (long) r6
            r8 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L18
            goto Lb8
        L18:
            r6 = 1
            long r4 = r4 & r6
            r9 = 1
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L22
            r4 = 1
            goto L23
        L22:
            r4 = 0
        L23:
            r5 = 12
            long r10 = r2 >> r5
            r12 = 15
            long r10 = r10 & r12
            int r11 = (int) r10
            r10 = 8
            long r14 = r2 >> r10
            long r14 = r14 & r12
            int r10 = (int) r14
            r14 = 4
            long r14 = r2 >> r14
            long r12 = r12 & r14
            int r13 = (int) r12
            long r14 = r2 >> r9
            r16 = 7
            long r14 = r14 & r16
            int r12 = (int) r14
            long r2 = r2 & r6
            int r14 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r14 != 0) goto L44
            r2 = 1
            goto L45
        L44:
            r2 = 0
        L45:
            r3 = 7
            if (r13 > r3) goto L4e
            int r3 = r0.f19534
            int r3 = r3 - r9
            if (r13 != r3) goto Lb8
            goto L57
        L4e:
            r3 = 10
            if (r13 > r3) goto Lb8
            int r3 = r0.f19534
            r6 = 2
            if (r3 != r6) goto Lb8
        L57:
            if (r12 != 0) goto L5a
            goto L5e
        L5a:
            int r3 = r0.f19531
            if (r12 != r3) goto Lb8
        L5e:
            if (r2 != 0) goto Lb8
            long r2 = r18.m41476()     // Catch: java.lang.NumberFormatException -> Lb8
            if (r4 == 0) goto L67
            goto L6c
        L67:
            int r4 = r0.f19536
            long r6 = (long) r4
            long r2 = r2 * r6
        L6c:
            r4 = r21
            r4.f15458 = r2
            r2 = r18
            int r3 = m10667(r11, r2)
            r4 = -1
            if (r3 == r4) goto Lb8
            int r4 = r0.f19536
            if (r3 > r4) goto Lb8
            int r3 = r0.f19537
            if (r10 != 0) goto L82
            goto La4
        L82:
            r4 = 11
            if (r10 > r4) goto L8b
            int r0 = r0.f19530
            if (r10 != r0) goto Lb8
            goto La4
        L8b:
            if (r10 != r5) goto L96
            int r0 = r18.m41456()
            int r0 = r0 * 1000
            if (r0 != r3) goto Lb8
            goto La4
        L96:
            r0 = 14
            if (r10 > r0) goto Lb8
            int r4 = r18.m41464()
            if (r10 != r0) goto La2
            int r4 = r4 * 10
        La2:
            if (r4 != r3) goto Lb8
        La4:
            int r0 = r18.m41456()
            int r3 = r18.m41485()
            byte[] r2 = r18.m41482()
            int r3 = r3 - r9
            int r1 = l.C3603.m11001(r1, r3, r2)
            if (r0 != r1) goto Lb8
            return r9
        Lb8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3485.m10668(l.ᩳ֨֫, l.ۛ᩷ۧ, int, l.ۙ᩷ۧ):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m10667(int i, C17714 c17714) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c17714.m41456() + 1;
            case 7:
                return c17714.m41464() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
