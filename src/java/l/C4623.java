package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Q6MT */
/* renamed from: l.ۙۨۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4623 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20146 f14695;

    public C4623() {
        C20146 c20146 = C20146.f65246;
        C11003.requireNonNull(c20146);
        this.f14695 = c20146;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15205 m13571(AbstractC22967 abstractC22967, C11679 c11679, BitmapFactory.Options options) {
        C8151 m13566;
        int i;
        long j;
        int i2;
        abstractC22967.m51108(c11679);
        C20146 c20146 = this.f14695;
        m13568(c11679, c20146);
        BitmapFactory.Options m13570 = options == null ? m13570(abstractC22967, c20146) : options;
        abstractC22967.m51108(c11679);
        int i3 = m13570.outWidth;
        if (i3 <= 0 || (i = m13570.outHeight) <= 0) {
            m13566 = m13566(abstractC22967, c20146);
            try {
                C10104 m50895 = C22803.m50895(m13566);
                m13566.m21622();
                c20146.m46403(m50895.f30421, m50895.f30424);
                abstractC22967.m51108(c11679);
                C15205 c15205 = new C15205(abstractC22967.mo6180(), m50895.f30421, m50895.f30424, c11679, m50895);
                m13566.close();
                return c15205;
            } finally {
            }
        } else {
            c20146.m46403(i3, i);
            String str = m13570.outMimeType;
            int i4 = 1;
            long j2 = -1;
            if ("image/jpeg".equals(str) || "image/png".equals(str) || "image/webp".equals(str)) {
                m13566 = m13566(abstractC22967, c20146);
                try {
                    try {
                        C7605 c7605 = new C7605(m13566, 0);
                        int m20384 = c7605.m20384();
                        if (m20384 >= 1 && m20384 <= 8) {
                            i4 = m20384;
                        }
                        Long m40645 = C17324.m40645(c7605);
                        if (m40645 != null) {
                            j2 = m40645.longValue();
                        }
                    } finally {
                    }
                } catch (IOException | RuntimeException unused) {
                }
                m13566.m21622();
                m13566.close();
                abstractC22967.m51108(c11679);
                j = j2;
                i2 = i4;
            } else {
                j = -1;
                i2 = 1;
            }
            return new C15205(abstractC22967.mo6180(), m13570.outWidth, m13570.outHeight, i2, m13570.outMimeType, c11679, j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r3 < 1073741824) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f6, code lost:
    
        r3 = r3 * 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d4, code lost:
    
        if (r3 < 1073741824) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f3, code lost:
    
        if (r3 < 1073741824) goto L58;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C22262 m13572(l.AbstractC22967 r19, l.C15205 r20, l.C19981 r21, long r22) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4623.m13572(l.᩺ۨۜ, l.ܶۨۜ, l.᩶ۛۜ, long):l.᩹ۨۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13569(AbstractC22967 abstractC22967, C15205 c15205, C20146 c20146) {
        String mo6180 = abstractC22967.mo6180();
        String str = c15205.f46662;
        C11679 c11679 = c15205.f46664;
        if (!mo6180.equals(str)) {
            throw new C6034("Metadata belongs to another image source");
        }
        c20146.m46403(c15205.f46658, c15205.f46659);
        m13568(c11679, c20146);
        abstractC22967.m51108(c11679);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13568(C11679 c11679, C20146 c20146) {
        long j = c11679.f34804;
        c20146.getClass();
        if (j > 268435456) {
            throw new C1095("Image input exceeds byte limit");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static BitmapFactory.Options m13565(int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inScaled = false;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return options;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m13564(AbstractC22967 abstractC22967, BitmapFactory.Options options, C20146 c20146) {
        Bitmap bitmap = null;
        if (abstractC22967.mo17660() != null) {
            try {
                InputStream mo6178 = abstractC22967.mo6178();
                try {
                    if (!(mo6178 instanceof FileInputStream)) {
                        throw new IOException("Local source requires a file stream");
                    }
                    Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(((FileInputStream) mo6178).getFD(), null, options);
                    mo6178.close();
                    return decodeFileDescriptor;
                } catch (Throwable th) {
                    if (mo6178 != null) {
                        try {
                            mo6178.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException | Error | RuntimeException e) {
                if (0 != 0) {
                    bitmap.recycle();
                }
                throw e;
            }
        }
        try {
            C8151 m13566 = m13566(abstractC22967, c20146);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(m13566, null, options);
                m13566.m21622();
                m13566.close();
                return decodeStream;
            } catch (Throwable th3) {
                try {
                    m13566.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException | Error | RuntimeException e2) {
            if (0 != 0) {
                bitmap.recycle();
            }
            throw e2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8151 m13566(AbstractC22967 abstractC22967, C20146 c20146) {
        InputStream mo6178 = abstractC22967.mo6178();
        c20146.getClass();
        return new C8151(mo6178);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m13562(int i, int i2) {
        long j = i;
        long j2 = i2;
        return ((j + j2) - 1) / j2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m13563(int i, int i2, int i3) {
        return m13562(i, i3) * m13562(i2, i3) * 4;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static BitmapFactory.Options m13570(AbstractC22967 abstractC22967, C20146 c20146) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        m13564(abstractC22967, options, c20146);
        return options;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22262 m13567(C22262 c22262, C22097 c22097, long j) {
        Bitmap bitmap;
        Bitmap bitmap2;
        int i = 1;
        while (true) {
            bitmap = c22262.f72236;
            if (m13563(bitmap.getWidth(), bitmap.getHeight(), i) <= j) {
                break;
            }
            i *= 2;
        }
        if (i == 1) {
            c22097.close();
            return c22262.m49976();
        }
        try {
            bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) m13562(bitmap.getWidth(), i), (int) m13562(bitmap.getHeight(), i), true);
            try {
                if (!c22097.m49683(bitmap2.getAllocationByteCount())) {
                    throw new C1095("Scaled preview exceeded its budget");
                }
                return new C22262(bitmap2, c22097, c22262.f72233 * i);
            } catch (Throwable th) {
                th = th;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                c22097.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap2 = null;
        }
    }
}
