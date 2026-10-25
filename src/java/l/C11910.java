package l;

/* compiled from: E8SE */
/* renamed from: l.ۨ᩵ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11910 {

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public CharSequence f35605;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f35597 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f35596 = 0;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f35599 = 2;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f35600 = -3.4028235E38f;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f35604 = 1;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f35602 = 0;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f35603 = -3.4028235E38f;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f35601 = Integer.MIN_VALUE;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f35606 = 1.0f;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f35598 = Integer.MIN_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0071, code lost:
    
        if (r5 == 0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0071  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C21927 m29043() {
        /*
            r13 = this;
            float r0 = r13.f35603
            r1 = 0
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 5
            r5 = 4
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r7 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r7 == 0) goto L11
            goto L1e
        L11:
            int r0 = r13.f35599
            if (r0 == r5) goto L1d
            if (r0 == r4) goto L1a
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L1e
        L1a:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            int r7 = r13.f35601
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 3
            r10 = 2
            r11 = 1
            if (r7 == r8) goto L28
            goto L37
        L28:
            int r7 = r13.f35599
            if (r7 == r11) goto L36
            if (r7 == r9) goto L34
            if (r7 == r5) goto L36
            if (r7 == r4) goto L34
            r7 = 1
            goto L37
        L34:
            r7 = 2
            goto L37
        L36:
            r7 = 0
        L37:
            l.᩹֡֫ r8 = new l.᩹֡֫
            r8.<init>()
            int r12 = r13.f35599
            if (r12 == r11) goto L55
            if (r12 == r10) goto L52
            if (r12 == r9) goto L4f
            if (r12 == r5) goto L55
            if (r12 == r4) goto L4f
            java.lang.String r4 = "Unknown textAlignment: "
            l.C8083.m21451(r12, r4)
            r4 = 0
            goto L57
        L4f:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L57
        L52:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L57
        L55:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
        L57:
            r8.m49394(r4)
            float r4 = r13.f35600
            int r5 = r13.f35604
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L6d
            if (r5 != 0) goto L6d
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L73
            int r1 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r1 <= 0) goto L6d
            goto L73
        L6d:
            if (r9 == 0) goto L71
            r6 = r4
            goto L75
        L71:
            if (r5 != 0) goto L75
        L73:
            r6 = 1065353216(0x3f800000, float:1.0)
        L75:
            r8.m49385(r6, r5)
            int r1 = r13.f35602
            r8.m49386(r1)
            r8.m49391(r0)
            r8.m49393(r7)
            float r1 = r13.f35606
            if (r7 == 0) goto La3
            if (r7 == r11) goto L96
            if (r7 != r10) goto L8c
            goto La5
        L8c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r7)
            r0.<init>(r1)
            throw r0
        L96:
            r4 = 1073741824(0x40000000, float:2.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L9f
            float r0 = r0 * r4
            goto La5
        L9f:
            float r3 = r3 - r0
            float r0 = r3 * r4
            goto La5
        La3:
            float r0 = r3 - r0
        La5:
            float r0 = java.lang.Math.min(r1, r0)
            r8.m49401(r0)
            int r0 = r13.f35598
            r8.m49397(r0)
            java.lang.CharSequence r0 = r13.f35605
            if (r0 == 0) goto Lb8
            r8.m49389(r0)
        Lb8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11910.m29043():l.᩹֡֫");
    }
}
