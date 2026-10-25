package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.IOException;

/* compiled from: R8UV */
/* renamed from: l.ܶ᩸ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15495 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap f47380;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f47381;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f47382;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f47383;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Bitmap f47384;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Drawable f47385;

    public C15495(C11197 c11197, CharSequence charSequence, CharSequence charSequence2, byte[] bArr) {
        boolean z;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = m36571(c11197.f33614);
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(charSequence2)) {
            charSequence2 = "unknown";
        } else {
            z = false;
        }
        this.f47382 = charSequence.toString();
        this.f47381 = charSequence2.toString();
        if (bArr != null) {
            this.f47385 = new C1385(C4925.m14338(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            z = false;
        } else {
            this.f47385 = C0679.m2754((charSequence2.hashCode() & 4294967295L) | (charSequence.hashCode() << 32));
        }
        this.f47383 = z;
        int i = Build.VERSION.SDK_INT;
        this.f47380 = m36570(this.f47385, 512, 512, 33 <= i && i <= 35);
        this.f47384 = m36570(this.f47385, 256, 256, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m36570(Drawable drawable, int i, int i2, boolean z) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        if (z) {
            canvas.drawColor(1073741824);
        }
        return createBitmap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8441 m36572(C11197 c11197, InterfaceC17889 interfaceC17889) {
        AbstractC15440 mo24433 = interfaceC17889.mo24433();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            ParcelFileDescriptor mo27921 = mo24433.mo27921("r");
            try {
                if (mo27921 == null) {
                    throw new IOException("Music file descriptor is unavailable");
                }
                mediaMetadataRetriever.setDataSource(mo27921.getFileDescriptor());
                C15495 c15495 = new C15495(c11197, mediaMetadataRetriever);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                long j = 0;
                if (!TextUtils.isEmpty(extractMetadata)) {
                    try {
                        j = Math.max(Long.parseLong(extractMetadata), 0L);
                    } catch (NumberFormatException unused) {
                    }
                }
                mo27921.close();
                mediaMetadataRetriever.release();
                if (c15495.f47383) {
                    C23411 m36513 = mo24433.m36513("r");
                    try {
                        C9398 m24229 = C9398.m24229(m36513);
                        if (m24229 != null) {
                            c15495 = new C15495(c11197, m24229.m24233(), m24229.m24231(), m24229.m24232());
                        }
                        m36513.close();
                    } catch (Throwable th) {
                        try {
                            m36513.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return new C8441(c15495, j);
            } finally {
            }
        } catch (Throwable th3) {
            mediaMetadataRetriever.release();
            throw th3;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C15495(l.C11197 r4, android.media.MediaMetadataRetriever r5) {
        /*
            r3 = this;
            r0 = 7
            java.lang.String r0 = r5.extractMetadata(r0)
            r1 = 3
            java.lang.String r1 = r5.extractMetadata(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L15
            r1 = 2
            java.lang.String r1 = r5.extractMetadata(r1)
        L15:
            byte[] r5 = r5.getEmbeddedPicture()
            r3.<init>(r4, r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15495.<init>(l.ۧ᩵֫, android.media.MediaMetadataRetriever):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36571(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        return C6554.m18061(50, str.substring(0, lastIndexOf));
    }
}
