package l;

import java.util.Arrays;

/* compiled from: N8CI */
/* renamed from: l.᩹ۨ᩵, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22272 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final short[] f72253;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f72254;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f72255 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20156 f72256;

    public C22272(C20156 c20156) {
        this.f72256 = c20156;
        int[] iArr = new int[32768];
        this.f72254 = iArr;
        Arrays.fill(iArr, -1);
        this.f72253 = new short[65536];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49998(int i, byte[] bArr) {
        while (true) {
            int i2 = this.f72255;
            if (i2 >= i) {
                return;
            }
            int m17576 = (C6322.m17576(i2, bArr) * (-1640531535)) >>> 17;
            int[] iArr = this.f72254;
            int i3 = i2 - iArr[m17576];
            if (i3 >= 65536) {
                i3 = 65535;
            }
            this.f72253[i2 & 65535] = (short) i3;
            iArr[m17576] = i2;
            this.f72255++;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x004d */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m50000(byte[] r12, int r13, int r14, l.C12394 r15) {
        /*
            r11 = this;
            r15.f37326 = r13
            r0 = 0
            r15.f37324 = r0
            r11.m49998(r13, r12)
            int r1 = l.C6322.m17576(r13, r12)
            r2 = -1640531535(0xffffffff9e3779b1, float:-9.7131045E-21)
            int r1 = r1 * r2
            int r1 = r1 >>> 17
            int[] r3 = r11.f72254
            r1 = r3[r1]
            int r4 = r13 + (-4)
            short[] r5 = r11.f72253
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r1 < r4) goto L44
            if (r1 > r13) goto L44
            if (r1 < 0) goto L44
            boolean r4 = l.C13099.m31761(r1, r13, r12)
            if (r4 == 0) goto L3b
            int r4 = r13 - r1
            int r7 = r1 + 4
            int r8 = r13 + 4
            int r7 = l.C13099.m31757(r7, r12, r8, r14)
            int r7 = r7 + 4
            r15.f37324 = r7
            r15.f37325 = r1
            goto L3d
        L3b:
            r4 = 0
            r7 = 0
        L3d:
            r8 = r1 & r6
            short r8 = r5[r8]
            r8 = r8 & r6
            int r1 = r1 - r8
            goto L46
        L44:
            r4 = 0
            r7 = 0
        L46:
            r8 = 0
        L47:
            l.᩶ۨ᩵ r9 = r11.f72256
            int r9 = l.C20156.m46404(r9)
            if (r8 >= r9) goto L7b
            int r9 = r13 - r6
            int r9 = java.lang.Math.max(r0, r9)
            if (r1 < r9) goto L7b
            if (r1 <= r13) goto L5a
            goto L7b
        L5a:
            boolean r9 = l.C13099.m31761(r1, r13, r12)
            if (r9 == 0) goto L72
            int r9 = r1 + 4
            int r10 = r13 + 4
            int r9 = l.C13099.m31757(r9, r12, r10, r14)
            int r9 = r9 + 4
            int r10 = r15.f37324
            if (r9 <= r10) goto L72
            r15.f37325 = r1
            r15.f37324 = r9
        L72:
            r9 = r1 & r6
            short r9 = r5[r9]
            r9 = r9 & r6
            int r1 = r1 - r9
            int r8 = r8 + 1
            goto L47
        L7b:
            r14 = 1
            if (r7 == 0) goto La1
            int r7 = r7 + r13
            int r7 = r7 + (-3)
        L81:
            int r1 = r7 - r4
            if (r13 >= r1) goto L8d
            r1 = r13 & r6
            short r8 = (short) r4
            r5[r1] = r8
            int r13 = r13 + 1
            goto L81
        L8d:
            r1 = r13 & r6
            short r8 = (short) r4
            r5[r1] = r8
            int r1 = l.C6322.m17576(r13, r12)
            int r1 = r1 * r2
            int r1 = r1 >>> 17
            r3[r1] = r13
            int r13 = r13 + r14
            if (r13 < r7) goto L8d
            r11.f72255 = r7
        La1:
            int r12 = r15.f37324
            if (r12 == 0) goto La6
            return r14
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22272.m50000(byte[], int, int, l.۫ۨ᩵):boolean");
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x001c */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m49999(byte[] r8, int r9, int r10, int r11, int r12, l.C12394 r13) {
        /*
            r7 = this;
            r13.f37324 = r12
            r7.m49998(r9, r8)
            int r0 = l.C6322.m17576(r9, r8)
            r1 = -1640531535(0xffffffff9e3779b1, float:-9.7131045E-21)
            int r0 = r0 * r1
            int r0 = r0 >>> 17
            int[] r1 = r7.f72254
            r0 = r1[r0]
            r1 = 0
            r2 = 0
        L16:
            l.᩶ۨ᩵ r3 = r7.f72256
            int r3 = l.C20156.m46404(r3)
            if (r2 >= r3) goto L5a
            r3 = 65535(0xffff, float:9.1834E-41)
            int r4 = r9 - r3
            int r4 = java.lang.Math.max(r1, r4)
            if (r0 < r4) goto L5a
            if (r0 <= r9) goto L2c
            goto L5a
        L2c:
            boolean r4 = l.C13099.m31761(r0, r9, r8)
            if (r4 == 0) goto L4f
            int r4 = r0 + 4
            int r5 = r9 + 4
            int r4 = l.C13099.m31757(r4, r8, r5, r11)
            int r4 = r4 + 4
            int r5 = l.C13099.m31763(r0, r8, r9, r10)
            int r4 = r4 + r5
            int r6 = r13.f37324
            if (r4 <= r6) goto L4f
            r13.f37324 = r4
            int r4 = r0 - r5
            r13.f37325 = r4
            int r4 = r9 - r5
            r13.f37326 = r4
        L4f:
            short[] r4 = r7.f72253
            r5 = r0 & r3
            short r4 = r4[r5]
            r3 = r3 & r4
            int r0 = r0 - r3
            int r2 = r2 + 1
            goto L16
        L5a:
            int r8 = r13.f37324
            if (r8 <= r12) goto L60
            r8 = 1
            return r8
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22272.m49999(byte[], int, int, int, int, l.۫ۨ᩵):boolean");
    }
}
