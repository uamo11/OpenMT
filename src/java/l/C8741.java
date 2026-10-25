package l;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* compiled from: 35IJ */
/* renamed from: l.ۡ۟ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8741 {

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C0225 f26617 = new C0225(1);

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final int f26618 = C11266.m27878(2.5f);

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static boolean f26619 = true;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f26620;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f26621;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C12392 f26622;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f26623;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f26624;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Bitmap f26625;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C4348 f26626;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Paint f26627;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f26629;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f26630;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f26632;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f26633;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f26634;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f26635;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Canvas f26636;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C17939 f26637;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f26628 = true;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HandlerC0912 f26631 = new HandlerC0912(this, new C2141(this));

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m22611(l.C8741 r8, final l.C8741 r9) {
        /*
            int r3 = r8.f26633
            int r4 = r8.f26632
            l.۫ۨᩳ r8 = r9.f26622
            boolean r0 = r8.isAttachedToWindow()
            if (r0 == 0) goto L82
            boolean r0 = r9.f26621
            if (r0 == 0) goto L12
            goto L82
        L12:
            android.view.View r5 = r8.getRootView()
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r8 < r0) goto L7f
            boolean r8 = l.C8741.f26619
            r0 = 0
            r1 = 0
            if (r8 != 0) goto L23
            goto L3a
        L23:
            java.lang.Class r8 = r5.getClass()     // Catch: java.lang.Exception -> L38
            java.lang.String r2 = "mWindow"
            java.lang.reflect.Field r8 = r8.getDeclaredField(r2)     // Catch: java.lang.Exception -> L38
            r2 = 1
            r8.setAccessible(r2)     // Catch: java.lang.Exception -> L38
            java.lang.Object r8 = r8.get(r5)     // Catch: java.lang.Exception -> L38
            android.view.Window r8 = (android.view.Window) r8     // Catch: java.lang.Exception -> L38
            goto L3b
        L38:
            l.C8741.f26619 = r0
        L3a:
            r8 = r1
        L3b:
            if (r8 != 0) goto L41
            r9.m22609(r5, r3, r4)
            goto L82
        L41:
            int r1 = r5.getWidth()
            int r2 = r5.getHeight()
            l.֡ۛۡ r6 = l.C8741.f26617
            java.lang.Object r6 = r6.m1479()
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 == 0) goto L64
            int r7 = r6.getWidth()
            if (r7 != r1) goto L64
            int r7 = r6.getHeight()
            if (r7 == r2) goto L60
            goto L64
        L60:
            r6.eraseColor(r0)
            goto L6f
        L64:
            if (r6 == 0) goto L69
            r6.recycle()
        L69:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r1, r2, r0)
        L6f:
            l.ۢ۟ᩳ r7 = new l.ۢ۟ᩳ
            r0 = r7
            r1 = r9
            r2 = r6
            r0.<init>()
            android.os.Handler r9 = l.C4925.m14324()
            android.view.PixelCopy.request(r8, r6, r7, r9)
            goto L82
        L7f:
            r9.m22609(r5, r3, r4)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8741.m22611(l.ۡ۟ᩳ, l.ۡ۟ᩳ):void");
    }

    public C8741(C12392 c12392) {
        Paint paint = new Paint(1);
        this.f26627 = paint;
        this.f26622 = c12392;
        Context context = c12392.getContext();
        this.f26634 = C21238.m48210(context.getTheme(), R.attr.windowBackground);
        paint.setColor(-65536);
        C4348 c4348 = new C4348(context, null, bin.mt.plus.R.attr.MT_Protector_res_0x7f0403bd);
        this.f26626 = c4348;
        int m27878 = C11266.m27878(90.0f);
        this.f26623 = m27878;
        int m278782 = C11266.m27878(35.0f);
        this.f26629 = m278782;
        Bitmap createBitmap = Bitmap.createBitmap((int) (m27878 * 1.5f), (int) (m278782 * 1.5f), Bitmap.Config.ARGB_8888);
        this.f26625 = createBitmap;
        this.f26636 = new Canvas(createBitmap);
        this.f26624 = C11266.m27878(110.0f);
        c4348.setBackgroundDrawable(context.getResources().getDrawable(C21943.m49424(bin.mt.plus.R.drawable.MT_Protector_res_0x7f080197, bin.mt.plus.R.drawable.MT_Protector_res_0x7f080196)));
        c4348.setWidth(-2);
        c4348.setHeight(-2);
        Rect rect = new Rect();
        c4348.getBackground().getPadding(rect);
        int i = rect.left;
        int i2 = m27878 * 3;
        this.f26620 = (i2 / 4) + i;
        this.f26630 = (i2 / 2) + i + rect.right;
        c4348.setFocusable(false);
        c4348.setTouchable(true);
        c4348.setOutsideTouchable(true);
        c4348.setClippingEnabled(false);
        C17939 c17939 = new C17939(c12392.getContext());
        this.f26637 = c17939;
        c17939.setImageResource(bin.mt.plus.R.mipmap.MT_Protector_res_0x7f100000);
        c4348.setContentView(c17939);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22613(float f) {
        this.f26628 = ((float) this.f26629) / f > 1.1f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22612() {
        C4348 c4348 = this.f26626;
        this.f26621 = true;
        this.f26631.removeMessages(0);
        try {
            if (c4348.isShowing()) {
                c4348.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22614(int i, int i2, int i3) {
        if (this.f26628) {
            if (this.f26621) {
                this.f26621 = false;
            }
            this.f26635 = i3;
            this.f26633 = i;
            this.f26632 = i2;
            HandlerC0912 handlerC0912 = this.f26631;
            if (handlerC0912.hasMessages(0)) {
                return;
            }
            C12392 c12392 = this.f26622;
            if (c12392.f37262) {
                if (c12392.f37174 <= f26618) {
                    handlerC0912.sendEmptyMessageDelayed(0, 10L);
                    return;
                } else {
                    handlerC0912.sendEmptyMessageDelayed(0, 50L);
                    return;
                }
            }
            handlerC0912.sendEmptyMessage(0);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22610(C8741 c8741, Bitmap bitmap, int i, int i2, View view, int i3) {
        boolean z = c8741.f26621;
        C0225 c0225 = f26617;
        if (z) {
            if (c0225.m1477(bitmap)) {
                return;
            }
            bitmap.recycle();
        } else {
            if (i3 == 0) {
                c8741.m22608(bitmap, i, i2);
            } else {
                c8741.m22609(view, i, i2);
            }
            if (c0225.m1477(bitmap)) {
                return;
            }
            bitmap.recycle();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22609(View view, int i, int i2) {
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            view.setDrawingCacheEnabled(false);
        } else {
            m22608(drawingCache, i, i2);
            view.setDrawingCacheEnabled(false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22608(Bitmap bitmap, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        C4348 c4348 = this.f26626;
        C12392 c12392 = this.f26622;
        View rootView = c12392.getRootView();
        int i7 = this.f26623;
        int i8 = i - (i7 / 2);
        int i9 = this.f26629;
        int i10 = i2 - (i9 / 2);
        if (rootView != c12392) {
            int[] iArr = new int[2];
            c12392.getLocationInWindow(iArr);
            int i11 = iArr[0];
            i8 += i11;
            int i12 = iArr[1];
            i10 += i12;
            i3 = i + i11;
            i4 = i2 + i12;
        } else {
            i3 = i;
            i4 = i2;
        }
        if (i8 < 0) {
            i6 = i7 + i8;
            i5 = i8;
            i8 = 0;
        } else {
            int i13 = i8 + i7;
            if (i13 > bitmap.getWidth()) {
                int width = i13 - bitmap.getWidth();
                int i14 = i7 - width;
                int width2 = bitmap.getWidth() - i14;
                i5 = width;
                i8 = width2;
                i6 = i14;
            } else {
                i5 = 0;
                i6 = i7;
            }
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 + i9 > bitmap.getHeight()) {
            i10 = bitmap.getHeight() - i9;
        }
        if (i6 <= 0 || i9 <= 0) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, i8, i10, i6, i9);
        Bitmap bitmap2 = this.f26625;
        bitmap2.eraseColor(0);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight());
        Paint paint = this.f26627;
        paint.setXfermode(null);
        Canvas canvas = this.f26636;
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.save();
        canvas.scale(1.5f, 1.5f);
        if (i5 != 0) {
            int color = paint.getColor();
            paint.setColor(this.f26634);
            canvas.drawRect(0.0f, 0.0f, i7, i9, paint);
            paint.setColor(color);
            canvas.drawBitmap(createBitmap, i5 < 0 ? -i5 : 0.0f, 0.0f, paint);
        } else {
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        }
        canvas.restore();
        createBitmap.recycle();
        int i15 = i3 - this.f26620;
        int i16 = i4 - this.f26624;
        if (i15 < 0) {
            i15 = (i15 * 3) / 4;
        } else {
            int width3 = rootView.getWidth();
            int i17 = this.f26630;
            if (i15 > width3 - i17) {
                i15 += ((rootView.getWidth() - i17) - i15) / 4;
            }
        }
        this.f26637.setImageBitmap(bitmap2);
        try {
            if (c4348.isShowing()) {
                c4348.update(i15, i16 + this.f26635, c4348.getWidth(), c4348.getHeight());
            } else {
                c4348.showAtLocation(rootView, 8388659, i15, i16 + this.f26635);
            }
        } catch (Exception unused) {
        }
    }
}
