package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import bin.mt.plus.R;

/* compiled from: A4YL */
/* renamed from: l.ۤۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10199 implements InterfaceC13519 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f30646 = {R.drawable.MT_Protector_res_0x7f080074, R.drawable.MT_Protector_res_0x7f080072, R.drawable.MT_Protector_res_0x7f080028};

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f30647 = {R.drawable.MT_Protector_res_0x7f080040, R.drawable.MT_Protector_res_0x7f080063, R.drawable.MT_Protector_res_0x7f080047, R.drawable.MT_Protector_res_0x7f080042, R.drawable.MT_Protector_res_0x7f080043, R.drawable.MT_Protector_res_0x7f080046, R.drawable.MT_Protector_res_0x7f080045};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f30644 = {R.drawable.MT_Protector_res_0x7f080071, R.drawable.MT_Protector_res_0x7f080073, R.drawable.MT_Protector_res_0x7f080039, R.drawable.MT_Protector_res_0x7f08006d, R.drawable.MT_Protector_res_0x7f08006e, R.drawable.MT_Protector_res_0x7f08006f, R.drawable.MT_Protector_res_0x7f080070};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f30643 = {R.drawable.MT_Protector_res_0x7f080059, R.drawable.MT_Protector_res_0x7f080037, R.drawable.MT_Protector_res_0x7f080058};

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f30645 = {R.drawable.MT_Protector_res_0x7f08006b, R.drawable.MT_Protector_res_0x7f080075};

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f30648 = {R.drawable.MT_Protector_res_0x7f08002b, R.drawable.MT_Protector_res_0x7f080031, R.drawable.MT_Protector_res_0x7f08002c, R.drawable.MT_Protector_res_0x7f080032};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ColorStateList m25599(Context context, int i) {
        if (i == R.drawable.MT_Protector_res_0x7f08003c) {
            return C0881.m3233(context, R.color.MT_Protector_res_0x7f060015);
        }
        if (i == R.drawable.MT_Protector_res_0x7f08006a) {
            return C0881.m3233(context, R.color.MT_Protector_res_0x7f060018);
        }
        if (i != R.drawable.MT_Protector_res_0x7f080069) {
            if (i == R.drawable.MT_Protector_res_0x7f080030) {
                return m25597(context, C12855.m31290(context, R.attr.MT_Protector_res_0x7f0400fa));
            }
            if (i == R.drawable.MT_Protector_res_0x7f08002a) {
                return m25597(context, 0);
            }
            if (i == R.drawable.MT_Protector_res_0x7f08002f) {
                return m25597(context, C12855.m31290(context, R.attr.MT_Protector_res_0x7f0400f3));
            }
            if (i == R.drawable.MT_Protector_res_0x7f080065 || i == R.drawable.MT_Protector_res_0x7f080066) {
                return C0881.m3233(context, R.color.MT_Protector_res_0x7f060017);
            }
            if (m25596(i, this.f30647)) {
                return C12855.m31291(context, R.attr.MT_Protector_res_0x7f0400fe);
            }
            if (m25596(i, this.f30645)) {
                return C0881.m3233(context, R.color.MT_Protector_res_0x7f060014);
            }
            if (m25596(i, this.f30648)) {
                return C0881.m3233(context, R.color.MT_Protector_res_0x7f060013);
            }
            if (i == R.drawable.MT_Protector_res_0x7f080062) {
                return C0881.m3233(context, R.color.MT_Protector_res_0x7f060016);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList m31291 = C12855.m31291(context, R.attr.MT_Protector_res_0x7f040132);
        if (m31291 != null && m31291.isStateful()) {
            int[] iArr3 = C12855.f38615;
            iArr[0] = iArr3;
            iArr2[0] = m31291.getColorForState(iArr3, 0);
            iArr[1] = C12855.f38614;
            iArr2[1] = C12855.m31290(context, R.attr.MT_Protector_res_0x7f0400fc);
            iArr[2] = C12855.f38617;
            iArr2[2] = m31291.getDefaultColor();
        } else {
            iArr[0] = C12855.f38615;
            iArr2[0] = C12855.m31288(context, R.attr.MT_Protector_res_0x7f040132);
            iArr[1] = C12855.f38614;
            iArr2[1] = C12855.m31290(context, R.attr.MT_Protector_res_0x7f0400fc);
            iArr[2] = C12855.f38617;
            iArr2[2] = C12855.m31290(context, R.attr.MT_Protector_res_0x7f040132);
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m25597(Context context, int i) {
        int m31290 = C12855.m31290(context, R.attr.MT_Protector_res_0x7f0400fd);
        return new ColorStateList(new int[][]{C12855.f38615, C12855.f38618, C12855.f38619, C12855.f38617}, new int[]{C12855.m31288(context, R.attr.MT_Protector_res_0x7f0400fa), C7191.m19274(m31290, i), C7191.m19274(m31290, i), i});
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LayerDrawable m25600(C1566 c1566, Context context, int i) {
        if (i == R.drawable.MT_Protector_res_0x7f080038) {
            return new LayerDrawable(new Drawable[]{c1566.m5356(context, R.drawable.MT_Protector_res_0x7f080037), c1566.m5356(context, R.drawable.MT_Protector_res_0x7f080039)});
        }
        if (i == R.drawable.MT_Protector_res_0x7f08005b) {
            return m25598(c1566, context, R.dimen.MT_Protector_res_0x7f07003b);
        }
        if (i == R.drawable.MT_Protector_res_0x7f08005a) {
            return m25598(c1566, context, R.dimen.MT_Protector_res_0x7f07003c);
        }
        if (i == R.drawable.MT_Protector_res_0x7f08005c) {
            return m25598(c1566, context, R.dimen.MT_Protector_res_0x7f07003d);
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static LayerDrawable m25598(C1566 c1566, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable m5356 = c1566.m5356(context, R.drawable.MT_Protector_res_0x7f080067);
        Drawable m53562 = c1566.m5356(context, R.drawable.MT_Protector_res_0x7f080068);
        if ((m5356 instanceof BitmapDrawable) && m5356.getIntrinsicWidth() == dimensionPixelSize && m5356.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) m5356;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            m5356.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            m5356.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((m53562 instanceof BitmapDrawable) && m53562.getIntrinsicWidth() == dimensionPixelSize && m53562.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) m53562;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            m53562.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            m53562.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25595(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C5965.f18297;
        }
        mutate.setColorFilter(C5965.m16699(i, mode));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m25601(Context context, int i, Drawable drawable) {
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2;
        PorterDuff.Mode mode3;
        PorterDuff.Mode mode4;
        PorterDuff.Mode mode5;
        PorterDuff.Mode mode6;
        if (i == R.drawable.MT_Protector_res_0x7f080064) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
            int m31290 = C12855.m31290(context, R.attr.MT_Protector_res_0x7f0400fe);
            mode4 = C5965.f18297;
            m25595(findDrawableByLayerId, m31290, mode4);
            Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress);
            int m312902 = C12855.m31290(context, R.attr.MT_Protector_res_0x7f0400fe);
            mode5 = C5965.f18297;
            m25595(findDrawableByLayerId2, m312902, mode5);
            Drawable findDrawableByLayerId3 = layerDrawable.findDrawableByLayerId(android.R.id.progress);
            int m312903 = C12855.m31290(context, R.attr.MT_Protector_res_0x7f0400fc);
            mode6 = C5965.f18297;
            m25595(findDrawableByLayerId3, m312903, mode6);
            return true;
        }
        if (i != R.drawable.MT_Protector_res_0x7f08005b && i != R.drawable.MT_Protector_res_0x7f08005a && i != R.drawable.MT_Protector_res_0x7f08005c) {
            return false;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
        Drawable findDrawableByLayerId4 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
        int m31288 = C12855.m31288(context, R.attr.MT_Protector_res_0x7f0400fe);
        mode = C5965.f18297;
        m25595(findDrawableByLayerId4, m31288, mode);
        Drawable findDrawableByLayerId5 = layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress);
        int m312904 = C12855.m31290(context, R.attr.MT_Protector_res_0x7f0400fc);
        mode2 = C5965.f18297;
        m25595(findDrawableByLayerId5, m312904, mode2);
        Drawable findDrawableByLayerId6 = layerDrawable2.findDrawableByLayerId(android.R.id.progress);
        int m312905 = C12855.m31290(context, R.attr.MT_Protector_res_0x7f0400fc);
        mode3 = C5965.f18297;
        m25595(findDrawableByLayerId6, m312905, mode3);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25596(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x004e  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m25602(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            android.graphics.PorterDuff$Mode r0 = l.C5965.m16698()
            int[] r1 = r6.f30646
            boolean r1 = m25596(r8, r1)
            r2 = 1
            r3 = 0
            r4 = -1
            if (r1 == 0) goto L13
            r8 = 2130968830(0x7f0400fe, float:1.7546325E38)
            goto L43
        L13:
            int[] r1 = r6.f30644
            boolean r1 = m25596(r8, r1)
            if (r1 == 0) goto L1f
            r8 = 2130968828(0x7f0400fc, float:1.754632E38)
            goto L43
        L1f:
            int[] r1 = r6.f30643
            boolean r1 = m25596(r8, r1)
            if (r1 == 0) goto L2a
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L40
        L2a:
            r1 = 2131230797(0x7f08004d, float:1.8077657E38)
            if (r8 != r1) goto L3b
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r1 = 1
            r5 = 16842800(0x1010030, float:2.3693693E-38)
            goto L4c
        L3b:
            r1 = 2131230779(0x7f08003b, float:1.807762E38)
            if (r8 != r1) goto L49
        L40:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L43:
            r1 = -1
            r5 = 1
            r5 = r8
            r8 = -1
            r1 = 1
            goto L4c
        L49:
            r5 = 0
            r8 = -1
            r1 = 0
        L4c:
            if (r1 == 0) goto L63
            android.graphics.drawable.Drawable r9 = r9.mutate()
            int r7 = l.C12855.m31290(r7, r5)
            android.graphics.PorterDuffColorFilter r7 = l.C5965.m16699(r7, r0)
            r9.setColorFilter(r7)
            if (r8 == r4) goto L62
            r9.setAlpha(r8)
        L62:
            return r2
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10199.m25602(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
