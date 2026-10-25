package l;

import android.graphics.Bitmap;
import com.google.android.material.navigation.DrawerLayoutUtils;
import java.util.Random;

/* compiled from: Z7NG */
/* renamed from: l.᩵᩸ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19731 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap f63753;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Bitmap f63754;

    public C19731(Random random) {
        float nextInt;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f63754 = Bitmap.createBitmap(2, 2, config);
        this.f63753 = Bitmap.createBitmap(2, 2, config);
        if (random.nextBoolean()) {
            float nextInt2 = random.nextInt(360);
            float[] fArr = {nextInt2, 0.8f, 0.82f};
            m45440(0, 0, fArr);
            fArr[0] = ((95.0f + nextInt2) + random.nextInt(20)) % 360.0f;
            fArr[1] = 0.98f;
            fArr[2] = 0.78f;
            m45440(1, 0, fArr);
            fArr[0] = ((325.0f + nextInt2) + random.nextInt(20)) % 360.0f;
            fArr[1] = 1.0f;
            fArr[2] = 0.8f;
            m45440(0, 1, fArr);
            fArr[0] = ((nextInt2 + 255.0f) + random.nextInt(20)) % 360.0f;
            fArr[1] = 1.0f;
            fArr[2] = 0.82f;
            m45440(1, 1, fArr);
            return;
        }
        do {
            nextInt = random.nextInt(360);
            if (nextInt < 290.0f) {
                break;
            }
        } while (nextInt <= 330.0f);
        float[] fArr2 = {nextInt, 0.86f, 0.74f};
        m45440(0, 0, fArr2);
        fArr2[0] = ((nextInt + 1.0f) + random.nextInt(10)) % 360.0f;
        fArr2[1] = 0.72f;
        fArr2[2] = 0.8f;
        m45440(1, 0, fArr2);
        fArr2[0] = ((80.0f + nextInt) + random.nextInt(20)) % 360.0f;
        fArr2[1] = 1.0f;
        fArr2[2] = 0.87f;
        m45440(0, 1, fArr2);
        fArr2[0] = ((nextInt + 140.0f) + random.nextInt(20)) % 360.0f;
        fArr2[1] = 0.76f;
        fArr2[2] = 0.79f;
        m45440(1, 1, fArr2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Bitmap m45442() {
        return this.f63754;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap m45441() {
        return this.f63753;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45440(int i, int i2, float[] fArr) {
        int m19269 = C7191.m19269(fArr);
        this.f63754.setPixel(i, i2, m19269);
        this.f63753.setPixel(i, i2, C7191.m19274((m19269 & 16777215) | DrawerLayoutUtils.DEFAULT_SCRIM_COLOR, -12434878));
    }
}
