package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: G6MH */
/* renamed from: l.ܿܰۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17383 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Picture f53204;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22097 f53205;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C22097 f53206;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f53207;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f53208;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f53209;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f53210;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f53211;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f53212;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C16312 f53213;

    public C17383(C16312 c16312, Picture picture, int i, int i2, int i3, C22097 c22097) {
        this.f53213 = c16312;
        this.f53210 = c16312 != null;
        this.f53204 = picture;
        this.f53208 = i;
        this.f53211 = i2;
        this.f53209 = i3;
        this.f53206 = c22097;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40732() {
        return this.f53210;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m40734() {
        return this.f53209;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40733(Canvas canvas) {
        Picture picture = this.f53204;
        if (picture == null || this.f53212) {
            return false;
        }
        canvas.drawPicture(picture);
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m40731((C22097) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40731(C22097 c22097) {
        synchronized (this) {
            if (this.f53212) {
                return;
            }
            this.f53212 = true;
            this.f53205 = c22097;
            Picture picture = this.f53204;
            this.f53204 = null;
            if (!this.f53207 && picture == null) {
                m40729();
            }
            if (picture != null) {
                try {
                    picture.beginRecording(1, 1);
                    picture.endRecording();
                    synchronized (this) {
                        m40729();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        m40729();
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m40729() {
        this.f53213 = null;
        this.f53206.close();
        C22097 c22097 = this.f53205;
        if (c22097 != null) {
            c22097.close();
            this.f53205 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22262 m40730(RectF rectF, float f, C19981 c19981, long j, C16949 c16949) {
        C16312 c16312;
        C22097 c22097;
        C22097 c220972;
        if (c16949.mo1526()) {
            throw new InterruptedIOException("SVG raster cancelled");
        }
        if (rectF == null || rectF.width() <= 0.0f || rectF.height() <= 0.0f || f <= 0.0f || !m40728(rectF.left) || !m40728(rectF.top) || !m40728(rectF.right) || !m40728(rectF.bottom) || !m40728(f)) {
            throw new IOException("Invalid SVG raster region");
        }
        double d = f;
        double ceil = Math.ceil(rectF.width() * d);
        double ceil2 = Math.ceil(rectF.height() * d);
        if (ceil > 2.147483647E9d || ceil2 > 2.147483647E9d) {
            throw new IOException("SVG raster dimensions exceed limit");
        }
        int max = Math.max(1, (int) ceil);
        int max2 = Math.max(1, (int) ceil2);
        long j2 = max * max2;
        if (j2 > 2305843009213693951L) {
            throw new IOException("SVG raster dimensions overflow");
        }
        long j3 = j2 * 4;
        if (j3 <= 0 || j3 > j / this.f53209) {
            throw new C1095("SVG raster workspace exceeds budget");
        }
        synchronized (this) {
            if (this.f53212 || (c16312 = this.f53213) == null) {
                throw new InterruptedIOException("SVG document is closed");
            }
            if (this.f53207) {
                throw new IOException("SVG raster requests must be serialized");
            }
            this.f53207 = true;
        }
        Bitmap bitmap = null;
        try {
            c220972 = c19981.m46068(j3);
            if (c220972 == null) {
                throw new C1095("SVG raster reservation exceeds budget");
            }
            try {
                c22097 = c19981.m46068((this.f53209 - 1) * j3);
                if (c22097 == null) {
                    throw new C1095("SVG raster reservation exceeds budget");
                }
                try {
                    if (c16949.mo1526()) {
                        throw new InterruptedIOException("SVG raster cancelled");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.scale(max / rectF.width(), max2 / rectF.height());
                        canvas.translate(-rectF.left, -rectF.top);
                        c16312.m38402(canvas, new RectF(0.0f, 0.0f, this.f53208, this.f53211));
                        if (c16949.mo1526()) {
                            throw new InterruptedIOException("SVG raster cancelled");
                        }
                        synchronized (this) {
                            if (this.f53212) {
                                throw new InterruptedIOException("SVG document was closed while rendering");
                            }
                            if (createBitmap.getAllocationByteCount() > j3 || !c220972.m49683(createBitmap.getAllocationByteCount())) {
                                throw new C1095("SVG raster allocation exceeds estimate");
                            }
                            C22262 c22262 = new C22262(createBitmap, c220972, 1);
                            c22097.close();
                            synchronized (this) {
                                this.f53207 = false;
                                if (this.f53212) {
                                    m40729();
                                }
                            }
                            return c22262;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bitmap = createBitmap;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        if (c220972 != null) {
                            c220972.close();
                        }
                        if (c22097 != null) {
                            c22097.close();
                        }
                        synchronized (this) {
                            this.f53207 = false;
                            if (this.f53212) {
                                m40729();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                c22097 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            c22097 = null;
            c220972 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40728(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }
}
