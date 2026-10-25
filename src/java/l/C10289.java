package l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* compiled from: LBKC */
/* renamed from: l.ۤ۫ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10289 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int f30995 = Math.round(127.5f);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m26045(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        C12405 c12405 = new C12405(bitmap);
        int i = 0;
        for (int i2 = 0; i2 < width; i2++) {
            for (int i3 = 0; i3 < height; i3++) {
                if (c12405.m30571(i2, i3)) {
                    i++;
                }
            }
        }
        return i / (width * height);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26046(Bitmap bitmap, float f, int i, int i2, int i3) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(16777215 & i3);
        int i4 = width - 1;
        int i5 = height - 1;
        C12405 c12405 = new C12405(bitmap);
        for (int i6 = 0; i6 < width; i6++) {
            if (c12405.m30571(i6, 0)) {
                m26047(createBitmap, i6 + i, i2, i3);
            }
            if (c12405.m30571(i6, i5)) {
                m26047(createBitmap, i6 + i, i5 + i2, i3);
            }
        }
        for (int i7 = 0; i7 < height; i7++) {
            if (c12405.m30571(0, i7)) {
                m26047(createBitmap, i, i7 + i2, i3);
            }
            if (c12405.m30571(i4, i7)) {
                m26047(createBitmap, i4 + i, i7 + i2, i3);
            }
        }
        for (int i8 = 1; i8 < i4; i8++) {
            for (int i9 = 1; i9 < i5; i9++) {
                if (c12405.m30571(i8, i9)) {
                    int i10 = i8 - 1;
                    int i11 = i9 - 1;
                    if (c12405.m30571(i10, i11) && c12405.m30571(i8, i11)) {
                        int i12 = i8 + 1;
                        if (c12405.m30571(i12, i11) && c12405.m30571(i10, i9) && c12405.m30571(i12, i9)) {
                            int i13 = i9 + 1;
                            if (c12405.m30571(i10, i13) && c12405.m30571(i8, i13) && c12405.m30571(i12, i13)) {
                            }
                        }
                    }
                    m26047(createBitmap, i8 + i, i9 + i2, i3);
                }
            }
        }
        RenderScript create = RenderScript.create(C4925.m14335());
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createBitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setInput(createFromBitmap);
        create2.setRadius(f);
        create2.forEach(createTyped);
        createTyped.copyTo(createBitmap);
        create.destroy();
        for (int i14 = 0; i14 < width; i14++) {
            for (int i15 = 0; i15 < height; i15++) {
                int pixel = bitmap.getPixel(i14, i15);
                int pixel2 = createBitmap.getPixel(i14, i15);
                if ((pixel >>> 24) < f30995) {
                    if (Color.alpha(pixel) == 0) {
                        pixel = pixel2;
                    } else if (Color.alpha(pixel2) != 0) {
                        pixel = C7191.m19274(pixel, pixel2);
                    }
                    bitmap.setPixel(i14, i15, pixel);
                }
            }
        }
        createBitmap.recycle();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26047(Bitmap bitmap, int i, int i2, int i3) {
        if (i < 0 || i2 < 0 || i >= bitmap.getWidth() || i2 >= bitmap.getHeight()) {
            return;
        }
        bitmap.setPixel(i, i2, i3);
    }
}
