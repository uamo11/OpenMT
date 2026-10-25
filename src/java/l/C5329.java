package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: 46LQ */
/* renamed from: l.ۚۨۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5329 implements InterfaceC0930, AutoCloseable, Drawable.Callback {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f16616;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Bitmap f16617;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1734 f16618;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C19441 f16619;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f16620;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f16621;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f16622;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Runnable f16623;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f16624;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f16625;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Handler f16626 = new Handler(Looper.getMainLooper());

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int f16627;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f16628;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f16629;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f16630;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f16631;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C22097 f16632;

    public C5329(C1734 c1734, C19441 c19441, C22097 c22097, C5869 c5869, Bitmap bitmap, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j) {
        this.f16628 = scheduledThreadPoolExecutor;
        this.f16620 = j;
        this.f16618 = c1734;
        this.f16619 = c19441;
        this.f16632 = c22097;
        this.f16617 = bitmap;
        this.f16627 = c5869.f18013;
        this.f16621 = c5869.f18010;
        this.f16625 = c5869.f18008;
        c1734.setCallback(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7986 m15267(C5869 c5869, long j) {
        return C15040.m35581(C8083.m21450(Math.min(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX, c5869.f18007) + (c5869.f18008 * 128) + c5869.f18011, 2L, c5869.f18009, 65536L), c5869.f18013, c5869.f18010, c5869.f18012 ? 4 : 3, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0117  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C5329 m15265(l.AbstractC22967 r19, l.C11679 r20, l.C19981 r21, long r22, l.C9189 r24, java.util.concurrent.ScheduledThreadPoolExecutor r25) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5329.m15265(l.᩺ۨۜ, l.ۨۨۜ, l.᩶ۛۜ, long, l.ۡ᩺ۜ, java.util.concurrent.ScheduledThreadPoolExecutor):l.ۚۨۜ");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        m15274();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f16626.postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f16626.removeCallbacks(runnable);
    }

    @Override // l.InterfaceC0930
    /* renamed from: ܽ */
    public final long mo3346() {
        long m49682 = this.f16632.m49682();
        long j = this.f16620;
        if (j > m49682) {
            return j;
        }
        return 0L;
    }

    @Override // l.InterfaceC0930
    /* renamed from: ֫ */
    public final long mo3342() {
        return this.f16632.m49682();
    }

    @Override // l.InterfaceC0930
    /* renamed from: ֫ */
    public final void mo3343(Canvas canvas, RectF rectF, Paint paint) {
        if (this.f16629) {
            return;
        }
        canvas.drawBitmap(this.f16617, (Rect) null, rectF, paint);
    }

    @Override // l.InterfaceC0930
    /* renamed from: ֫ */
    public final void mo3345(boolean z, RunnableC8483 runnableC8483) {
        if (this.f16629) {
            return;
        }
        if (!z) {
            runnableC8483 = null;
        }
        this.f16623 = runnableC8483;
        final boolean z2 = z & (this.f16625 > 1);
        if (z2 == this.f16622) {
            return;
        }
        this.f16622 = z2;
        this.f16630 = z2;
        this.f16624++;
        this.f16628.execute(new Runnable() { // from class: l.ۖۨۜ
            @Override // java.lang.Runnable
            public final void run() {
                C5329.m15271(C5329.this, z2);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15271(C5329 c5329, boolean z) {
        if (c5329.f16629) {
            return;
        }
        if (z) {
            if (c5329.f16618.m5794()) {
                c5329.f16618.m5793();
                return;
            } else {
                c5329.f16618.start();
                return;
            }
        }
        c5329.f16618.stop();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m15274() {
        if (this.f16629 || !this.f16630) {
            return;
        }
        if (this.f16631) {
            this.f16616 = true;
            return;
        }
        this.f16631 = true;
        this.f16616 = false;
        final int i = this.f16624;
        this.f16628.execute(new Runnable() { // from class: l.ۘۨۜ
            @Override // java.lang.Runnable
            public final void run() {
                C5329.m15268(C5329.this, i);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m15268(final l.C5329 r9, final int r10) {
        /*
            r0 = 0
            r1 = 0
            boolean r2 = r9.f16629     // Catch: java.lang.Throwable -> L52
            if (r2 != 0) goto L4a
            l.᩵ۨۜ r1 = r9.f16619     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L10
            java.io.IOException r1 = r1.f62885     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            throw r1     // Catch: java.lang.Throwable -> L52
        L10:
            l.֫ۢ֨ r1 = r9.f16618     // Catch: java.lang.Throwable -> L52
            l.ᩳۢ֨ r1 = r1.m5792()     // Catch: java.lang.Throwable -> L52
            l.ᩳۢ֨ r2 = l.EnumC17962.NO_ERROR     // Catch: java.lang.Throwable -> L52
            if (r1 != r2) goto L42
            l.֫ۢ֨ r1 = r9.f16618     // Catch: java.lang.Throwable -> L52
            android.graphics.Bitmap r1 = r1.m5788()     // Catch: java.lang.Throwable -> L52
            l.֫ۢ֨ r2 = r9.f16618     // Catch: java.lang.Throwable -> L53
            boolean r2 = r2.m5794()     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L2d
            int r2 = r9.f16625     // Catch: java.lang.Throwable -> L53
            int r2 = r2 + (-1)
            goto L39
        L2d:
            l.֫ۢ֨ r2 = r9.f16618     // Catch: java.lang.Throwable -> L53
            int r2 = r2.m5790()     // Catch: java.lang.Throwable -> L53
            int r3 = r9.f16625     // Catch: java.lang.Throwable -> L53
            int r2 = r2 + r3
            int r2 = r2 + (-1)
            int r2 = r2 % r3
        L39:
            l.֫ۢ֨ r3 = r9.f16618     // Catch: java.lang.Throwable -> L40
            boolean r0 = r3.isRunning()     // Catch: java.lang.Throwable -> L40
            goto L4e
        L40:
            goto L54
        L42:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L52 java.lang.Throwable -> L52
            java.lang.String r2 = "GIF frame could not be decoded"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L52 java.lang.Throwable -> L52
            throw r1     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L52 java.lang.Throwable -> L52
        L4a:
            r2 = 0
            r1 = r0
            r0 = 0
            r2 = 0
        L4e:
            r8 = r0
            r6 = r1
            r7 = r2
            goto L62
        L52:
            r1 = r0
        L53:
            r2 = 0
        L54:
            if (r1 == 0) goto L59
            r1.recycle()
        L59:
            l.֫ۢ֨ r1 = r9.f16618
            r1.stop()
            r1 = 0
            r6 = r0
            r7 = r2
            r8 = 0
        L62:
            android.os.Handler r0 = r9.f16626
            l.᩷ۨۜ r1 = new l.᩷ۨۜ
            r3 = r1
            r4 = r9
            r5 = r10
            r3.<init>(r5, r6, r7, r8)
            r0.post(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5329.m15268(l.ۚۨۜ, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15269(C5329 c5329, int i, Bitmap bitmap, boolean z) {
        c5329.f16631 = false;
        if (c5329.f16629 || !c5329.f16630 || i != c5329.f16624) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            if (c5329.f16629 || !c5329.f16630) {
                return;
            }
            c5329.m15274();
            return;
        }
        if (bitmap == null) {
            c5329.f16630 = false;
            return;
        }
        Bitmap bitmap2 = c5329.f16617;
        c5329.f16617 = bitmap;
        c5329.f16630 = z;
        bitmap2.recycle();
        Runnable runnable = c5329.f16623;
        if (runnable != null) {
            runnable.run();
        }
        if (c5329.f16616) {
            c5329.m15274();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        mo3344(null);
    }

    @Override // l.InterfaceC0930
    /* renamed from: ֫ */
    public final void mo3344(final C22097 c22097) {
        synchronized (this) {
            if (this.f16629) {
                return;
            }
            this.f16629 = true;
            Runnable runnable = new Runnable() { // from class: l.ᩴۨۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C5329.m15270(C5329.this, c22097);
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnable.run();
            } else {
                this.f16626.post(runnable);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15270(final C5329 c5329, final C22097 c22097) {
        c5329.f16622 = false;
        c5329.f16630 = false;
        c5329.f16623 = null;
        c5329.f16617.recycle();
        c5329.f16628.execute(new Runnable() { // from class: l.ۜۨۜ
            @Override // java.lang.Runnable
            public final void run() {
                C5329.m15273(C5329.this, c22097);
            }
        });
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15273(C5329 c5329, C22097 c22097) {
        Handler handler = c5329.f16626;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = c5329.f16628;
        C19441 c19441 = c5329.f16619;
        C1734 c1734 = c5329.f16618;
        try {
            c1734.setCallback(null);
            c1734.m5787();
        } finally {
            if (c19441 != null) {
                c19441.close();
            }
            scheduledThreadPoolExecutor.shutdown();
            handler.post(new RunnableC9563(c5329, c22097, 0));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15272(C5329 c5329, C22097 c22097) {
        c5329.f16632.close();
        if (c22097 != null) {
            c22097.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0162, code lost:
    
        throw new java.io.IOException("Invalid GIF code size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016a, code lost:
    
        throw new java.io.IOException("GIF frame exceeds safe bounds");
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C5869 m15266(java.io.BufferedInputStream r21, l.C9189 r22) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5329.m15266(java.io.BufferedInputStream, l.ۡ᩺ۜ):l.ۛۛۜ");
    }
}
