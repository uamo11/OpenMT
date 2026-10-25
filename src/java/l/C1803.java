package l;

import java.util.ArrayList;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: E6PC */
/* renamed from: l.֫ۨۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1803 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final CharSequence f6213;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f6214;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C19012 f6215;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f6216;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f6217;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f6220;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f6221 = new ArrayList();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6219 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f6212 = new ArrayList();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f6218 = "//__MTSX_FORMAT_DIRECTIVE_";

    public C1803(int i, CharSequence charSequence, boolean z) {
        String str;
        this.f6213 = charSequence;
        this.f6214 = z;
        this.f6220 = i;
        int i2 = 0;
        while (i2 < charSequence.length() && charSequence.charAt(i2) != '\r' && charSequence.charAt(i2) != '\n') {
            i2++;
        }
        if (i2 >= charSequence.length() || charSequence.charAt(i2) != '\r') {
            str = "\n";
        } else {
            int i3 = i2 + 1;
            str = (i3 >= charSequence.length() || charSequence.charAt(i3) != '\n') ? "\r" : "\r\n";
        }
        this.f6216 = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5995(java.lang.CharSequence r18, boolean r19, int r20, l.C19012 r21) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1803.m5995(java.lang.CharSequence, boolean, int, l.ᩴ᩷ܿ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        m5998(r2);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5997(l.C19012 r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = r10.f6219
            int r1 = r0.size()
            int[] r2 = new int[r1]
            r10.m5998(r2)
            java.util.Iterator r3 = r0.iterator()
        Lf:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L49
            java.lang.Object r4 = r3.next()
            l.ܰۛۢ r4 = (l.C13631) r4
            r6 = 0
        L1d:
            int r7 = r4.f40645
            if (r6 >= r7) goto L43
            boolean r7 = r10.m6000()
            if (r7 == 0) goto L43
            java.util.Arrays.fill(r2, r5)
            int r7 = r4.f40649
            r2[r7] = r6
            l.᩺ۛۢ r7 = r4.f40648
        L30:
            if (r7 == 0) goto L3d
            l.ܰۛۢ r8 = r7.f73641
            int r9 = r8.f40649
            int r7 = r7.f73639
            r2[r9] = r7
            l.᩺ۛۢ r7 = r8.f40648
            goto L30
        L3d:
            r10.m5998(r2)
            int r6 = r6 + 1
            goto L1d
        L43:
            boolean r4 = r10.m6000()
            if (r4 != 0) goto Lf
        L49:
            java.util.Arrays.fill(r2, r5)
        L4c:
            boolean r3 = r10.m6000()
            if (r3 == 0) goto L6f
            int r3 = r1 + (-1)
        L54:
            if (r3 < 0) goto L6f
            r4 = r2[r3]
            int r4 = r4 + 1
            r2[r3] = r4
            java.lang.Object r6 = r0.get(r3)
            l.ܰۛۢ r6 = (l.C13631) r6
            int r6 = r6.f40645
            if (r4 >= r6) goto L6a
            r10.m5998(r2)
            goto L4c
        L6a:
            r2[r3] = r5
            int r3 = r3 + (-1)
            goto L54
        L6f:
            java.util.ArrayList r0 = r10.f6221
            java.util.Iterator r0 = r0.iterator()
        L75:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc7
            java.lang.Object r1 = r0.next()
            l.۟ۛۢ r1 = (l.C7282) r1
            java.lang.String r2 = r1.f22353
            l.۬۬ۡ r3 = r1.f22358
            if (r2 != 0) goto L91
            l.۬۬ۡ r1 = r1.f22357
            if (r1 != 0) goto L8c
            goto L8d
        L8c:
            r3 = r1
        L8d:
            r11.append(r3)
            goto L75
        L91:
            l.ܰۛۢ r2 = r1.f22356
            if (r2 != 0) goto L98
            java.lang.String r2 = r1.f22354
            goto L9a
        L98:
            java.lang.String r2 = r2.f40647
        L9a:
            if (r2 != 0) goto La0
            r11.append(r3)
            goto L75
        La0:
            l.ᩴ᩷ܿ r2 = r11.append(r2)
            java.lang.String r1 = r1.f22355
            r2.append(r1)
            int r1 = r3.length()
            if (r1 == 0) goto L75
            int r1 = r3.length()
            int r1 = r1 + (-1)
            char r1 = r3.charAt(r1)
            r2 = 13
            if (r1 == r2) goto Lc1
            r2 = 10
            if (r1 != r2) goto L75
        Lc1:
            java.lang.String r1 = r10.f6216
            r11.append(r1)
            goto L75
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1803.m5997(l.ᩴ᩷ܿ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        r9.append((java.lang.CharSequence) r19.f6216);
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3 A[Catch: all -> 0x0180, LOOP:3: B:47:0x00d1->B:54:0x00e3, LOOP_END, TryCatch #0 {all -> 0x0180, blocks: (B:18:0x003f, B:21:0x004c, B:24:0x005b, B:26:0x0078, B:31:0x0089, B:36:0x008f, B:38:0x0097, B:42:0x009d, B:44:0x00a8, B:46:0x00ae, B:48:0x00d3, B:54:0x00e3, B:56:0x00e6, B:58:0x010a, B:60:0x010e, B:62:0x0120, B:64:0x0126, B:65:0x012a, B:67:0x0136, B:69:0x013c, B:70:0x013e, B:72:0x0144, B:74:0x014c, B:76:0x0151, B:83:0x0159), top: B:17:0x003f, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6 A[EDGE_INSN: B:55:0x00e6->B:56:0x00e6 BREAK  A[LOOP:3: B:47:0x00d1->B:54:0x00e3], SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m5998(int[] r20) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1803.m5998(int[]):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5996(C7282 c7282, int[] iArr, C19012 c19012, int i, int i2) {
        if (c7282.f22357 == null && m5999(c7282.f22352, iArr)) {
            int length = this.f6215.length();
            this.f6215.m43854(i, i2, c19012);
            C19012 c190122 = this.f6215;
            c7282.f22357 = new C13130(length, c190122.length(), c190122);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m6000() {
        return ((long) this.f6212.size()) < Math.max(1L, Math.min(64L, X931RNG.BLOCK128_RESEED_MAX / Math.max(1L, this.f6217)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m5999(C22804 c22804, int[] iArr) {
        while (c22804 != null) {
            C13631 c13631 = c22804.f73641;
            if (iArr[c13631.f40649] != c22804.f73639) {
                return false;
            }
            c22804 = c13631.f40648;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5994() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
    }
}
