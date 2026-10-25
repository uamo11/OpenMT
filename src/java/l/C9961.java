package l;

import java.util.concurrent.TimeUnit;

/* compiled from: B9B2 */
/* renamed from: l.ۤ֨ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9961 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[Catch: all -> 0x0042, TRY_ENTER, TryCatch #0 {all -> 0x0042, blocks: (B:17:0x003e, B:22:0x0057, B:23:0x006a, B:25:0x0071, B:27:0x0078, B:29:0x0082, B:31:0x0093, B:50:0x0044, B:54:0x004b), top: B:16:0x003e, inners: #1 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m25115(boolean r12, l.C14192 r13) {
        /*
            boolean r0 = l.C23216.m51521()
            r1 = 0
            if (r0 == 0) goto L8
            goto L20
        L8:
            if (r13 == 0) goto L13
            if (r12 == 0) goto L13
            l.۬֨ۢ r0 = l.EnumC12782.WAITING_BINDER
            long r2 = r13.f42844
            l.C9255.m23757(r2, r0)
        L13:
            if (r12 != 0) goto L1a
            boolean r12 = l.C23216.m51528()
            goto L1e
        L1a:
            boolean r12 = m25116()
        L1e:
            if (r12 != 0) goto L21
        L20:
            return r1
        L21:
            if (r13 == 0) goto L2a
            l.۬֨ۢ r12 = l.EnumC12782.WAITING_PERMISSION_OR_SERVICE
            long r2 = r13.f42844
            l.C9255.m23757(r2, r12)
        L2a:
            l.ۗ֨ۢ r12 = m25114()
            l.ۗ֨ۢ r13 = l.EnumC2905.GRANTED
            r0 = 1
            if (r12 != r13) goto L34
            return r0
        L34:
            l.ۙ֨ۢ r12 = new l.ۙ֨ۢ
            r12.<init>()
            l.C23216.m51511(r12)
            r13 = 21320(0x5348, float:2.9876E-41)
            l.C23216.m51523(r13)     // Catch: java.lang.Throwable -> L42 java.lang.RuntimeException -> L44
            goto L4e
        L42:
            r13 = move-exception
            goto La9
        L44:
            boolean r0 = m25116()     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L4b
            goto L50
        L4b:
            l.C23216.m51523(r13)     // Catch: java.lang.Throwable -> L42 java.lang.RuntimeException -> L50
        L4e:
            r13 = 1
            goto L51
        L50:
            r13 = 0
        L51:
            if (r13 != 0) goto L57
            l.C23216.m51518(r12)
            return r1
        L57:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L42
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L42
            long r2 = r13.toMillis(r2)     // Catch: java.lang.Throwable -> L42
            r4 = 10000(0x2710, double:4.9407E-320)
            r6 = 0
            long r4 = java.lang.Math.max(r6, r4)     // Catch: java.lang.Throwable -> L42
            long r4 = r4 + r2
        L6a:
            boolean r13 = r12.m12973()     // Catch: java.lang.Throwable -> L42
            if (r13 == 0) goto L71
            goto L80
        L71:
            boolean r13 = r12.m12971()     // Catch: java.lang.Throwable -> L42
            if (r13 == 0) goto L78
            goto La5
        L78:
            l.ۗ֨ۢ r13 = m25114()     // Catch: java.lang.Throwable -> L42
            l.ۗ֨ۢ r0 = l.EnumC2905.GRANTED     // Catch: java.lang.Throwable -> L42
            if (r13 != r0) goto L82
        L80:
            r1 = 1
            goto La5
        L82:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L42
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L42
            long r2 = r13.toMillis(r2)     // Catch: java.lang.Throwable -> L42
            long r2 = r4 - r2
            int r13 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r13 > 0) goto L93
            goto La5
        L93:
            r8 = 1
            r10 = 200(0xc8, double:9.9E-322)
            long r8 = java.lang.Math.max(r8, r10)     // Catch: java.lang.Throwable -> L42
            long r2 = java.lang.Math.min(r8, r2)     // Catch: java.lang.Throwable -> L42
            boolean r13 = r12.m12972(r2)     // Catch: java.lang.Throwable -> L42
            if (r13 != 0) goto L6a
        La5:
            l.C23216.m51518(r12)
            return r1
        La9:
            l.C23216.m51518(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9961.m25115(boolean, l.ܳ֨ۢ):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC2905 m25114() {
        try {
            if (C23216.m51516() == 0) {
                return EnumC2905.GRANTED;
            }
            return EnumC2905.REQUESTABLE;
        } catch (RuntimeException unused) {
            return C23216.m51528() ? EnumC2905.REQUESTABLE : EnumC2905.NOT_READY;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m25116() {
        long max = Math.max(0L, 5000L) + TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        while (!C23216.m51528()) {
            long millis = max - TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
            if (millis <= 0) {
                return false;
            }
            try {
                Thread.sleep(Math.min(Math.max(1L, 200L), millis));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        return true;
    }
}
