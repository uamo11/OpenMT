package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: I6M7 */
/* renamed from: l.ۤܰۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10328 implements InterfaceC0930 {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f31076 = Executors.newSingleThreadExecutor(new ThreadFactoryC13149());

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final int f31077;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final Paint f31078;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Canvas f31079;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f31080;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f31081;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Paint f31082;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public long f31083;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f31084;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final long f31085;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public Bitmap f31086;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Bitmap f31087;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public byte[] f31088;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f31089;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f31090;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f31091;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f31092;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C22097 f31093;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public long f31094;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C16617 f31095;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public Runnable f31096;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C21392 f31097;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC4683 f31098;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final int f31099;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Paint f31100 = new Paint(2);

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final int f31101;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f31102;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final RectF f31103;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public Bitmap f31104;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final Handler f31105;

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ۙܰۜ] */
    public C10328(C21392 c21392, C16617 c16617, C22097 c22097, byte[] bArr, Bitmap bitmap, int i, long j) {
        Paint paint = new Paint(2);
        this.f31078 = paint;
        Paint paint2 = new Paint();
        this.f31082 = paint2;
        this.f31103 = new RectF();
        this.f31105 = new Handler(Looper.getMainLooper());
        this.f31098 = new Runnable() { // from class: l.ۙܰۜ
            @Override // java.lang.Runnable
            public final void run() {
                C10328.m26112(C10328.this);
            }
        };
        this.f31085 = j;
        this.f31097 = c21392;
        this.f31095 = c16617;
        this.f31093 = c22097;
        this.f31088 = bArr;
        this.f31087 = bitmap;
        this.f31101 = i;
        this.f31099 = c16617.f51052;
        this.f31077 = c16617.f51057;
        this.f31079 = new Canvas(bitmap);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setXfermode(new PorterDuffXfermode(mode));
        paint2.setColor(c16617.f51050);
        this.f31094 = Math.max(20, ((C10974) c16617.f51058.get(0)).f33021);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C10328 m26103(l.AbstractC22967 r28, l.C11679 r29, l.C19981 r30, long r31, l.C9189 r33) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10328.m26103(l.᩺ۨۜ, l.ۨۨۜ, l.᩶ۛۜ, long, l.ۡ᩺ۜ):l.ۤܰۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m26101(C21392 c21392, C16617 c16617, C9189 c9189) {
        int i = c16617.f51054;
        if (i != 0) {
            int i2 = i + 6;
            byte[] bArr = new byte[i2];
            c21392.m48473(c16617.f51056, bArr, 6, i, c9189);
            int i3 = 6;
            boolean m42087 = C18029.m42087("Exif\u0000\u0000", 6, bArr);
            C18029.m42089("Exif\u0000\u0000", 0, bArr);
            try {
                if (!m42087) {
                    i3 = 0;
                }
                if (m42087) {
                    i2 = c16617.f51054;
                }
                int m20384 = new C7605(new ByteArrayInputStream(bArr, i3, i2), 1).m20384();
                if (m20384 >= 1 && m20384 <= 8) {
                    return m20384;
                }
            } catch (IOException unused) {
            }
        }
        return 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Bitmap m26102(int i, InterfaceC17066 interfaceC17066) {
        RectF rectF = this.f31103;
        C16617 c16617 = this.f31095;
        C10974 c10974 = (C10974) c16617.f51058.get(i);
        int length = this.f31088.length + 30 + c10974.f33025;
        byte[] bArr = new byte[length];
        C18029.m42089("RIFF", 0, bArr);
        int i2 = length - 8;
        C18029.m42084(4, i2, bArr);
        bArr[7] = (byte) (i2 >>> 24);
        C18029.m42089("WEBP", 8, bArr);
        C18029.m42089("VP8X", 12, bArr);
        C18029.m42084(16, 10, bArr);
        bArr[19] = (byte) 0;
        bArr[20] = (byte) ((this.f31088.length == 0 ? 0 : 32) | 16);
        C18029.m42084(24, c10974.f33027 - 1, bArr);
        C18029.m42084(27, c10974.f33023 - 1, bArr);
        byte[] bArr2 = this.f31088;
        System.arraycopy(bArr2, 0, bArr, 30, bArr2.length);
        this.f31097.m48473(c10974.f33024, bArr, this.f31088.length + 30, c10974.f33025, interfaceC17066);
        AbstractC22967.m51107(interfaceC17066);
        double d = c10974.f33027;
        Bitmap bitmap = this.f31087;
        int i3 = this.f31099;
        final int max = Math.max(1, (int) Math.ceil((d * bitmap.getWidth()) / i3));
        int i4 = this.f31077;
        final int max2 = Math.max(1, (int) Math.ceil((c10974.f33023 * bitmap.getHeight()) / i4));
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(ByteBuffer.wrap(bArr)), new ImageDecoder.OnHeaderDecodedListener() { // from class: l.ۗܰۜ
            @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
            public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                C10328.m26105(max, max2, imageDecoder);
            }
        });
        try {
            AbstractC22967.m51107(interfaceC17066);
            if (decodeBitmap.getAllocationByteCount() > bitmap.getAllocationByteCount()) {
                throw new IOException("WebP subframe allocation exceeds reservation");
            }
            Canvas canvas = this.f31079;
            if (i == 0) {
                canvas.drawColor(c16617.f51050, PorterDuff.Mode.SRC);
            }
            float f = i3;
            float f2 = i4;
            rectF.set((c10974.f33020 * bitmap.getWidth()) / f, (c10974.f33026 * bitmap.getHeight()) / f2, ((c10974.f33020 + c10974.f33027) * bitmap.getWidth()) / f, ((c10974.f33026 + c10974.f33023) * bitmap.getHeight()) / f2);
            canvas.drawBitmap(decodeBitmap, (Rect) null, rectF, c10974.f33022 ? this.f31078 : this.f31100);
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            if (copy == null) {
                throw new IOException("WebP frame could not be copied");
            }
            if (c10974.f33019) {
                canvas.drawRect(rectF, this.f31082);
            }
            return copy;
        } finally {
            decodeBitmap.recycle();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26105(int i, int i2, ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(1);
        imageDecoder.setTargetSize(i, i2);
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
    }

    @Override // l.InterfaceC0930
    /* renamed from: ܽ */
    public final long mo3346() {
        long m49682 = this.f31093.m49682();
        long j = this.f31085;
        if (j > m49682) {
            return j;
        }
        return 0L;
    }

    @Override // l.InterfaceC0930
    /* renamed from: ֫ */
    public final long mo3342() {
        return this.f31093.m49682();
    }

    @Override // l.InterfaceC0930
    /* renamed from: ֫ */
    public final void mo3343(Canvas canvas, RectF rectF, Paint paint) {
        if (this.f31091) {
            return;
        }
        canvas.drawBitmap(this.f31104, (Rect) null, rectF, paint);
    }

    @Override // l.InterfaceC0930
    /* renamed from: ֫ */
    public final void mo3345(boolean z, RunnableC8483 runnableC8483) {
        if (this.f31091) {
            return;
        }
        if (!z) {
            runnableC8483 = null;
        }
        this.f31096 = runnableC8483;
        boolean z2 = z & (this.f31095.f51058.size() > 1);
        if (z2 == this.f31080) {
            return;
        }
        this.f31080 = z2;
        this.f31102 = z2;
        this.f31084++;
        this.f31105.removeCallbacks(this.f31098);
        if (z2) {
            if (this.f31089) {
                this.f31090 = 0;
                this.f31094 = 1L;
            }
            long max = Math.max(1L, this.f31094) + SystemClock.uptimeMillis();
            this.f31083 = max;
            this.f31105.postAtTime(this.f31098, max);
            return;
        }
        this.f31094 = Math.max(1L, this.f31083 - SystemClock.uptimeMillis());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m26112(final C10328 c10328) {
        int i;
        if (c10328.f31091 || !c10328.f31102 || c10328.f31081) {
            return;
        }
        if (!c10328.f31089 && c10328.f31092 == c10328.f31095.f51058.size() - 1 && (i = c10328.f31095.f51053) > 0 && c10328.f31090 + 1 >= i) {
            c10328.f31102 = false;
            c10328.f31089 = true;
            return;
        }
        final int size = c10328.f31089 ? 0 : (c10328.f31092 + 1) % c10328.f31095.f51058.size();
        final int i2 = c10328.f31084;
        Bitmap bitmap = c10328.f31086;
        if (bitmap != null) {
            c10328.f31086 = null;
            c10328.m26106(bitmap, size, i2);
        } else {
            c10328.f31081 = true;
            f31076.execute(new Runnable() { // from class: l.۫ܰۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C10328.m26107(C10328.this, size, i2);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26107(final C10328 c10328, final int i, final int i2) {
        final Bitmap bitmap = null;
        try {
            if (!c10328.f31091) {
                bitmap = c10328.m26102(i, new InterfaceC17066() { // from class: l.ܶܰۜ
                    @Override // l.InterfaceC17066
                    /* renamed from: ᩻ */
                    public final boolean mo1526() {
                        boolean z;
                        z = C10328.this.f31091;
                        return z;
                    }
                });
            }
        } catch (IOException | OutOfMemoryError | RuntimeException unused) {
        }
        c10328.f31105.post(new Runnable() { // from class: l.᩸ܰۜ
            @Override // java.lang.Runnable
            public final void run() {
                C10328.this.m26106(bitmap, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m26106(Bitmap bitmap, int i, int i2) {
        this.f31081 = false;
        if (this.f31091) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        boolean z = this.f31102;
        if (!z || this.f31084 != i2) {
            this.f31086 = bitmap;
            if (z) {
                this.f31105.post(this.f31098);
                return;
            }
            return;
        }
        if (bitmap == null) {
            this.f31102 = false;
            return;
        }
        Bitmap bitmap2 = this.f31104;
        this.f31104 = bitmap;
        this.f31092 = i;
        bitmap2.recycle();
        if (i == 0 && !this.f31089) {
            this.f31090++;
        }
        this.f31089 = false;
        this.f31094 = Math.max(20, ((C10974) this.f31095.f51058.get(i)).f33021);
        this.f31083 = Math.max(SystemClock.uptimeMillis(), this.f31083 + this.f31094);
        Runnable runnable = this.f31096;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.f31102 || this.f31091) {
            return;
        }
        this.f31105.postAtTime(this.f31098, this.f31083);
    }

    @Override // l.InterfaceC0930
    /* renamed from: ֫ */
    public final void mo3344(C22097 c22097) {
        synchronized (this) {
            if (this.f31091) {
                return;
            }
            this.f31091 = true;
            RunnableC20206 runnableC20206 = new RunnableC20206(0, this, c22097);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC20206.run();
            } else {
                this.f31105.post(runnableC20206);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26113(C10328 c10328, C22097 c22097) {
        c10328.f31080 = false;
        c10328.f31102 = false;
        c10328.f31096 = null;
        c10328.f31105.removeCallbacks(c10328.f31098);
        c10328.f31104.recycle();
        Bitmap bitmap = c10328.f31086;
        if (bitmap != null) {
            bitmap.recycle();
            c10328.f31086 = null;
        }
        f31076.execute(new RunnableC9563(c10328, c22097, 1));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26114(final C10328 c10328, final C22097 c22097) {
        c10328.f31087.recycle();
        c10328.f31088 = null;
        c10328.f31095.f51058.clear();
        try {
            c10328.f31097.close();
        } catch (IOException unused) {
        }
        c10328.f31105.post(new Runnable() { // from class: l.᩹ܰۜ
            @Override // java.lang.Runnable
            public final void run() {
                C10328.m26109(C10328.this, c22097);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26109(C10328 c10328, C22097 c22097) {
        c10328.f31093.close();
        if (c22097 != null) {
            c22097.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x025f, code lost:
    
        throw new java.io.IOException("Invalid lossless WebP frame header");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02b2, code lost:
    
        throw new java.io.IOException("Invalid lossy WebP frame header");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0302, code lost:
    
        throw new java.io.IOException("WebP frame exceeds canvas");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x030a, code lost:
    
        throw new java.io.IOException("Invalid WebP animation frame");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f6, code lost:
    
        throw new java.io.IOException("Invalid WebP animation header");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02aa, code lost:
    
        throw new java.io.IOException("WebP frame dimensions disagree with container");
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C16617 m26104(l.C21392 r34, long r35, l.C22097 r37, l.C9189 r38) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10328.m26104(l.᩸ۛۜ, long, l.᩹ۛۜ, l.ۡ᩺ۜ):l.ܽۨۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26110(C16617 c16617, long j, C22097 c22097) {
        long size = ((c16617.f51058.size() + 1) * 128) + 65536;
        if ((c16617.f51054 * 4) + (c16617.f51055 * 2) + size > j || !c22097.m49683(size)) {
            throw new C1095("WebP index exceeds allocation limit");
        }
    }
}
