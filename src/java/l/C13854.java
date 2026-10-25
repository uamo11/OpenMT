package l;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.os.Looper;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: 06MC */
/* renamed from: l.ܰܰۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13854 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Thread f41314 = Thread.currentThread();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15205 f41315;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C22097 f41316;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22803 f41317;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC22967 f41318;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InputStream f41319;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f41320;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final BitmapRegionDecoder f41321;

    public C13854(AbstractC22967 abstractC22967, C15205 c15205, InputStream inputStream, BitmapRegionDecoder bitmapRegionDecoder) {
        this.f41318 = abstractC22967;
        this.f41315 = c15205;
        this.f41319 = inputStream;
        this.f41321 = bitmapRegionDecoder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.᩶ۨۜ] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C13854 m33208(l.AbstractC22967 r5, l.C15205 r6) {
        /*
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto La9
            l.᩶ۨۜ r0 = l.C20146.f65246
            l.C4623.m13569(r5, r6, r0)
            l.ۨۨۜ r1 = r6.f46664
            java.lang.String r2 = r6.f46661
            boolean r2 = m33210(r2)
            if (r2 == 0) goto La1
            r2 = 0
            java.io.File r3 = r5.mo17660()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            r4 = 0
            if (r3 == 0) goto L3d
            java.io.InputStream r0 = r5.mo6178()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            boolean r3 = r0 instanceof java.io.FileInputStream     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            if (r3 == 0) goto L35
            r3 = r0
            java.io.FileInputStream r3 = (java.io.FileInputStream) r3     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            java.io.FileDescriptor r3 = r3.getFD()     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            android.graphics.BitmapRegionDecoder r2 = android.graphics.BitmapRegionDecoder.newInstance(r3, r4)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            goto L48
        L35:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            java.lang.String r3 = "Local source requires a file stream"
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            throw r6     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
        L3d:
            l.۠ۨۜ r0 = l.C4623.m13566(r5, r0)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            android.graphics.BitmapRegionDecoder r2 = android.graphics.BitmapRegionDecoder.newInstance(r0, r4)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            r0.m21622()     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
        L48:
            r5.m51108(r1)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            if (r2 == 0) goto L6b
            int r3 = r2.getWidth()     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            int r4 = r6.f46658     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            if (r3 != r4) goto L63
            int r3 = r2.getHeight()     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            int r4 = r6.f46659     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            if (r3 != r4) goto L63
            l.ܰܰۜ r3 = new l.ܰܰۜ     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            r3.<init>(r5, r6, r0, r2)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            return r3
        L63:
            l.ۛۨۜ r6 = new l.ۛۨۜ     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            java.lang.String r3 = "Region decoder dimensions changed"
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            throw r6     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
        L6b:
            l.᩺ܰۜ r6 = new l.᩺ܰۜ     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            java.lang.String r3 = "Platform rejected region decoding"
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
            throw r6     // Catch: java.lang.Throwable -> L73 java.io.IOException -> L79
        L73:
            r5 = move-exception
            r6 = r2
            r2 = r0
            r0 = r2
            r2 = r6
            goto L96
        L79:
            r6 = move-exception
            goto L80
        L7b:
            r5 = move-exception
            r0 = r2
            goto L96
        L7e:
            r6 = move-exception
            r0 = r2
        L80:
            r5.m51108(r1)     // Catch: java.lang.Throwable -> L95
            boolean r5 = r6 instanceof l.C6034     // Catch: java.lang.Throwable -> L95
            if (r5 != 0) goto L94
            boolean r5 = r6 instanceof l.C23027     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L8c
            goto L94
        L8c:
            l.᩺ܰۜ r5 = new l.᩺ܰۜ     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = "Platform could not open a region decoder"
            r5.<init>(r1, r6)     // Catch: java.lang.Throwable -> L95
            throw r5     // Catch: java.lang.Throwable -> L95
        L94:
            throw r6     // Catch: java.lang.Throwable -> L95
        L95:
            r5 = move-exception
        L96:
            if (r2 == 0) goto L9b
            r2.recycle()
        L9b:
            if (r0 == 0) goto La0
            r0.close()
        La0:
            throw r5
        La1:
            l.᩺ܰۜ r5 = new l.᩺ܰۜ
            java.lang.String r6 = "Image format does not support region decoding"
            r5.<init>(r6)
            throw r5
        La9:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Tile decoder must be opened on a worker thread"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13854.m33208(l.᩺ۨۜ, l.ܶۨۜ):l.ܰܰۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13854 m33209(AbstractC22967 abstractC22967, C15205 c15205, C19981 c19981, InterfaceC17066 interfaceC17066) {
        C4623.m13569(abstractC22967, c15205, C20146.f65246);
        C10104 c10104 = c15205.f46660;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("TGA decoder requires a worker");
        }
        if (abstractC22967.mo17660() == null) {
            throw new C23027("TGA regions require a prepared local file");
        }
        C22097 m46068 = c19981.m46068(c10104.m25387(true));
        if (m46068 == null) {
            throw new C1095("TGA index exceeds bitmap budget");
        }
        C22803 c22803 = null;
        try {
            C22803 m50897 = C22803.m50897(abstractC22967.mo17660(), c10104, interfaceC17066);
            try {
                abstractC22967.m51108(c15205.f46664);
                C13854 c13854 = new C13854(abstractC22967, c15205, null, null);
                c13854.f41317 = m50897;
                c13854.f41316 = m46068;
                return c13854;
            } catch (Throwable th) {
                th = th;
                c22803 = m50897;
                if (c22803 != null) {
                    try {
                        c22803.close();
                    } finally {
                        m46068.close();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [l.᩶ۛۜ] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [l.᩹ۛۜ] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [l.᩹ۛۜ] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22262 m33211(Rect rect, int i, C19981 c19981, InterfaceC17066 interfaceC17066) {
        if (Thread.currentThread() == this.f41314) {
            if (this.f41320) {
                throw new IOException("Tile decoder is closed");
            }
            if (!rect.isEmpty() && rect.left >= 0 && rect.top >= 0) {
                int i2 = rect.right;
                C15205 c15205 = this.f41315;
                int i3 = c15205.f46658;
                C11679 c11679 = c15205.f46664;
                if (i2 <= i3 && rect.bottom <= c15205.f46659 && i > 0 && ((i - 1) & i) == 0) {
                    AbstractC22967 abstractC22967 = this.f41318;
                    abstractC22967.m51108(c11679);
                    C22097 m46068 = c19981.m46068(C4623.m13563(rect.width(), rect.height(), i));
                    if (m46068 == null) {
                        throw new C1095("Tile reservation exceeds bitmap budget");
                    }
                    Bitmap bitmap = null;
                    try {
                        try {
                            if (this.f41317 != null) {
                                C22097 m460682 = c19981.m46068(C4623.m13562(rect.width(), i) * 4);
                                c19981 = m460682;
                                if (m460682 == null) {
                                    throw new C1095("TGA row exceeds bitmap budget");
                                }
                            } else {
                                c19981 = 0;
                            }
                            C22803 c22803 = this.f41317;
                            Bitmap decodeRegion = c22803 == null ? this.f41321.decodeRegion(rect, C4623.m13565(i)) : c22803.m50903(rect, i, interfaceC17066);
                            try {
                                AbstractC22967.m51107(interfaceC17066);
                                InputStream inputStream = this.f41319;
                                if (inputStream instanceof C8151) {
                                    ((C8151) inputStream).m21622();
                                }
                                abstractC22967.m51108(c11679);
                                if (decodeRegion == null) {
                                    throw new IOException("Image region could not be decoded");
                                }
                                if (!m46068.m49683(decodeRegion.getAllocationByteCount())) {
                                    throw new C1095("Tile allocation exceeds bitmap budget");
                                }
                                C22262 c22262 = new C22262(decodeRegion, m46068, i);
                                if (c19981 != 0) {
                                    c19981.close();
                                }
                                return c22262;
                            } catch (Throwable th) {
                                bitmap = decodeRegion;
                                th = th;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                m46068.close();
                                if (c19981 != 0) {
                                    c19981.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c19981 = 0;
                    }
                }
            }
            throw new IllegalArgumentException("Invalid region or sample size");
        }
        throw new IllegalStateException("Tile decoder must stay on its opening worker thread");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f41319;
        if (Thread.currentThread() != this.f41314) {
            throw new IllegalStateException("Tile decoder must stay on its opening worker thread");
        }
        if (this.f41320) {
            return;
        }
        this.f41320 = true;
        try {
            BitmapRegionDecoder bitmapRegionDecoder = this.f41321;
            if (bitmapRegionDecoder != null) {
                bitmapRegionDecoder.recycle();
            }
            C22803 c22803 = this.f41317;
            if (c22803 != null) {
                c22803.close();
            }
        } finally {
            C22097 c22097 = this.f41316;
            if (c22097 != null) {
                c22097.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33210(String str) {
        return "image/x-tga".equals(str) || "image/jpeg".equals(str) || "image/png".equals(str) || "image/webp".equals(str);
    }
}
