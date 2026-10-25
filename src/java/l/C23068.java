package l;

import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;

/* compiled from: A75O */
/* renamed from: l.᩺ܶۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23068 implements InterfaceC12842 {

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Uri f74197 = Uri.parse("mt-ts-preview:///media.ts");

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f74198 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13190 f74199 = new C13190();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C8353 f74200;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4724 f74201;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f74202;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f74203;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12053 f74204;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f74205;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f74206;

    @Override // l.InterfaceC12842
    /* renamed from: ۧ */
    public final boolean mo9070() {
        return true;
    }

    public C23068(C12053 c12053, long j) {
        this.f74204 = c12053;
        this.f74203 = j * 1000;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23068 m51227(C12053 c12053, long j) {
        if (!c12053.m29438() || j <= 0 || j > 10000) {
            throw new IOException("Unsupported MPEG-TS preview source");
        }
        return new C23068(c12053, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0084 A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:8:0x002c, B:28:0x006a, B:33:0x007b, B:37:0x0074, B:40:0x0084, B:41:0x0087, B:43:0x008b, B:44:0x008d, B:45:0x008e, B:46:0x0095, B:60:0x0097), top: B:4:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:8:0x002c, B:28:0x006a, B:33:0x007b, B:37:0x0074, B:40:0x0084, B:41:0x0087, B:43:0x008b, B:44:0x008d, B:45:0x008e, B:46:0x0095, B:60:0x0097), top: B:4:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e A[Catch: all -> 0x005e, TryCatch #8 {all -> 0x005e, blocks: (B:5:0x001f, B:8:0x002c, B:28:0x006a, B:33:0x007b, B:37:0x0074, B:40:0x0084, B:41:0x0087, B:43:0x008b, B:44:0x008d, B:45:0x008e, B:46:0x0095, B:60:0x0097), top: B:4:0x001f }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m51226(l.C12053 r17, int r18, l.InterfaceC19899 r19) {
        /*
            boolean r0 = r17.m29438()
            if (r0 == 0) goto La1
            r0 = 1
            r1 = r18
            int r9 = java.lang.Math.max(r0, r1)
            l.۫ܶۜ r10 = new l.۫ܶۜ
            r11 = 0
            r10.<init>(r9, r9, r11)
            l.۬ܶۜ r13 = new l.۬ܶۜ
            r13.<init>()
            r0 = 0
            r7 = 0
            r8 = 0
            r15 = 0
            r16 = 0
        L1f:
            r19.mo21195()     // Catch: java.lang.Throwable -> L5e java.lang.RuntimeException -> L60 java.io.IOException -> L65 java.io.InterruptedIOException -> L96
            r5 = 1
            r1 = r17
            r2 = r13
            r3 = r9
            r4 = r9
            r6 = r15
            r14 = r8
            r8 = r19
            l.ۙܶۜ r1 = l.C4724.m13824(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L58 java.io.IOException -> L5c java.lang.Throwable -> L5e java.io.InterruptedIOException -> L96
            r2 = r19
            l.C4724.m13828(r1, r11, r2)     // Catch: java.lang.Throwable -> L4a java.lang.RuntimeException -> L4e java.io.IOException -> L52 java.io.InterruptedIOException -> L54
            android.graphics.Bitmap r0 = r13.m32015(r10)     // Catch: java.lang.Throwable -> L4a java.lang.RuntimeException -> L4e java.io.IOException -> L52 java.io.InterruptedIOException -> L54
            if (r0 == 0) goto L42
            l.C4724.m13834(r1)
            r13.m32016()
            return r0
        L42:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L4a java.lang.RuntimeException -> L4e java.io.IOException -> L52 java.io.InterruptedIOException -> L54
            java.lang.String r3 = "MPEG-TS thumbnail frame was not decoded"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L4a java.lang.RuntimeException -> L4e java.io.IOException -> L52 java.io.InterruptedIOException -> L54
            throw r0     // Catch: java.lang.Throwable -> L4a java.lang.RuntimeException -> L4e java.io.IOException -> L52 java.io.InterruptedIOException -> L54
        L4a:
            r0 = move-exception
            r16 = r1
            goto L98
        L4e:
            r0 = move-exception
        L4f:
            r16 = r1
            goto L67
        L52:
            r0 = move-exception
            goto L4f
        L54:
            r0 = move-exception
            r16 = r1
            goto L97
        L58:
            r0 = move-exception
        L59:
            r2 = r19
            goto L67
        L5c:
            r0 = move-exception
            goto L59
        L5e:
            r0 = move-exception
            goto L98
        L60:
            r0 = move-exception
        L61:
            r2 = r19
            r14 = r8
            goto L67
        L65:
            r0 = move-exception
            goto L61
        L67:
            r8 = r0
            if (r15 != 0) goto L82
            boolean r0 = m51229(r8)     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L82
            if (r16 != 0) goto L74
            r7 = 0
            goto L79
        L74:
            java.lang.String r0 = l.C4724.m13823(r16)     // Catch: java.lang.Throwable -> L5e
            r7 = r0
        L79:
            if (r16 == 0) goto L80
            l.C4724.m13834(r16)     // Catch: java.lang.Throwable -> L5e
            r16 = 0
        L80:
            r15 = 1
            goto L1f
        L82:
            if (r14 == 0) goto L87
            r8.addSuppressed(r14)     // Catch: java.lang.Throwable -> L5e
        L87:
            boolean r0 = r8 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L5e
            if (r0 == 0) goto L8e
            java.io.IOException r8 = (java.io.IOException) r8     // Catch: java.lang.Throwable -> L5e
            throw r8     // Catch: java.lang.Throwable -> L5e
        L8e:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = "MPEG-TS thumbnail decode failed"
            r0.<init>(r1, r8)     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L96:
            r0 = move-exception
        L97:
            throw r0     // Catch: java.lang.Throwable -> L5e
        L98:
            if (r16 == 0) goto L9d
            l.C4724.m13834(r16)
        L9d:
            r13.m32016()
            throw r0
        La1:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Unsupported MPEG-TS thumbnail source"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23068.m51226(l.۫֡ۜ, int, l.᩶ۗۜ):android.graphics.Bitmap");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51229(Exception exc) {
        for (Exception exc2 = exc; exc2 != null; exc2 = exc2.getCause()) {
            if ((exc2 instanceof C3313) || (exc2 instanceof C22363) || (exc2 instanceof C20247) || (exc2 instanceof MediaCodec.CodecException)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r1 > r10) goto L8;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap m51230(long r10, int r12, int r13, l.InterfaceC19899 r14) {
        /*
            r9 = this;
            l.ۙܶۜ r0 = r9.f74201
            if (r0 == 0) goto L16
            boolean r1 = l.C4724.m13831(r0, r12, r13)
            if (r1 == 0) goto L12
            long r1 = l.C4724.m13835(r0)
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 <= 0) goto L16
        L12:
            r9.m51231()
            r0 = 0
        L16:
            if (r0 != 0) goto L30
            boolean r6 = r9.f74206
            java.lang.String r7 = r9.f74205
            l.۫֡ۜ r1 = r9.f74204
            l.۬ܶۜ r2 = r9.f74199
            r5 = 0
            r3 = r12
            r4 = r13
            r8 = r14
            l.ۙܶۜ r0 = l.C4724.m13824(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f74201 = r0
            l.۠ᩴ֫ r1 = l.C4724.m13836(r0)
            r9.f74200 = r1
        L30:
            l.C4724.m13828(r0, r10, r14)
            l.۫ܶۜ r14 = new l.۫ܶۜ
            r14.<init>(r12, r13, r10)
            l.۬ܶۜ r1 = r9.f74199
            android.graphics.Bitmap r14 = r1.m32015(r14)
            if (r14 == 0) goto L41
            return r14
        L41:
            android.graphics.Bitmap r10 = r1.m32014(r12, r13, r10)
            if (r10 == 0) goto L54
            boolean r11 = l.C4724.m13837(r0)
            boolean r12 = l.C4724.m13833(r0)
            if (r11 == 0) goto L54
            if (r12 != 0) goto L54
            return r10
        L54:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "MPEG-TS preview frame was not decoded"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23068.m51230(long, int, int, l.᩶ۗۜ):android.graphics.Bitmap");
    }

    @Override // l.InterfaceC12842
    /* renamed from: ᩳ */
    public final C13547 mo9072() {
        C8353 c8353 = this.f74200;
        if (c8353 == null) {
            return null;
        }
        return C1841.m6125(c8353.f25633, c8353.f25609, c8353.f25599, c8353.f25636);
    }

    @Override // l.InterfaceC12842
    /* renamed from: ܽ */
    public final void mo9071() {
        m51231();
    }

    @Override // l.InterfaceC12842
    /* renamed from: ֫ */
    public final void mo9069() {
        if (this.f74202) {
            return;
        }
        this.f74202 = true;
        m51231();
        this.f74199.m32016();
        this.f74200 = null;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m51231() {
        C4724 c4724 = this.f74201;
        this.f74201 = null;
        if (c4724 != null) {
            C4724.m13834(c4724);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    @Override // l.InterfaceC12842
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap mo9068(long r9, int r11, int r12, l.InterfaceC19899 r13) {
        /*
            r8 = this;
            boolean r0 = r8.f74202
            if (r0 != 0) goto L8f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L8f
            r13.mo21195()
            r0 = 1
            int r11 = java.lang.Math.max(r0, r11)
            int r12 = java.lang.Math.max(r0, r12)
            long r1 = r8.f74203
            long r9 = java.lang.Math.min(r9, r1)
            r1 = 0
            long r9 = java.lang.Math.max(r1, r9)
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 / r1
            l.۫ܶۜ r1 = new l.۫ܶۜ
            r1.<init>(r11, r12, r9)
            l.۬ܶۜ r2 = r8.f74199
            android.graphics.Bitmap r1 = r2.m32015(r1)
            if (r1 == 0) goto L38
            return r1
        L38:
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            android.graphics.Bitmap r9 = r1.m51230(r2, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L42 java.io.IOException -> L44 java.io.InterruptedIOException -> L8a
            return r9
        L42:
            r1 = move-exception
            goto L45
        L44:
            r1 = move-exception
        L45:
            r7 = r1
            boolean r1 = r8.f74206
            if (r1 != 0) goto L78
            boolean r1 = m51229(r7)
            if (r1 == 0) goto L78
            l.ۙܶۜ r1 = r8.f74201
            if (r1 != 0) goto L56
            r1 = 0
            goto L5a
        L56:
            java.lang.String r1 = l.C4724.m13823(r1)
        L5a:
            r8.f74205 = r1
            r8.m51231()
            r8.f74206 = r0
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            android.graphics.Bitmap r9 = r1.m51230(r2, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L6b java.io.IOException -> L6d java.io.InterruptedIOException -> L73
            return r9
        L6b:
            r9 = move-exception
            goto L6e
        L6d:
            r9 = move-exception
        L6e:
            r9.addSuppressed(r7)
            r7 = r9
            goto L78
        L73:
            r9 = move-exception
            r8.m51231()
            throw r9
        L78:
            r8.m51231()
            boolean r9 = r7 instanceof java.io.IOException
            if (r9 == 0) goto L82
            java.io.IOException r7 = (java.io.IOException) r7
            throw r7
        L82:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "MPEG-TS preview decode failed"
            r9.<init>(r10, r7)
            throw r9
        L8a:
            r9 = move-exception
            r8.m51231()
            throw r9
        L8f:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException
            java.lang.String r10 = "MPEG-TS frame source was closed"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23068.mo9068(long, int, int, l.᩶ۗۜ):android.graphics.Bitmap");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51228(MediaCodec mediaCodec, boolean z) {
        if (mediaCodec == null) {
            return;
        }
        if (z) {
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    mediaCodec.stop();
                }
            } catch (Throwable unused) {
            }
        }
        try {
            mediaCodec.release();
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m51225(android.media.Image r20, int r21, int r22, l.C8353 r23, boolean r24, android.media.MediaFormat r25) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23068.m51225(android.media.Image, int, int, l.۠ᩴ֫, boolean, android.media.MediaFormat):android.graphics.Bitmap");
    }
}
