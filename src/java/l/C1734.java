package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.TypedValue;
import android.widget.MediaController;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.crypto.params.DHParameters;
import pl.droidsonroids.gif.GifInfoHandle;

/* compiled from: P5QW */
/* renamed from: l.֫ۢ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C1734 extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f5983 = 0;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f5984;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f5985;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HandlerC3145 f5986;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f5987;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f5988;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final GifInfoHandle f5989;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final Rect f5990;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Paint f5991;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ConcurrentLinkedQueue f5992;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f5993;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f5994;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public ColorStateList f5995;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f5996;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f5997;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f5998;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Bitmap f5999;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Rect f6000;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C10201 f6001;

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        return 100;
    }

    public C1734(Resources resources, int i) {
        this(new GifInfoHandle(resources.openRawResourceFd(i)), null, true);
        List list = C8084.f24900;
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.density;
        if (i2 == 0) {
            i2 = DHParameters.DEFAULT_MINIMUM_LENGTH;
        } else if (i2 == 65535) {
            i2 = 0;
        }
        int i3 = resources.getDisplayMetrics().densityDpi;
        float f = (i2 <= 0 || i3 <= 0) ? 1.0f : i3 / i2;
        this.f5988 = (int) (this.f5989.m52917() * f);
        this.f5984 = (int) (this.f5989.m52918() * f);
    }

    public C1734(byte[] bArr) {
        this(new GifInfoHandle(bArr), null, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1734(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            r2 = this;
            int r0 = pl.droidsonroids.gif.GifInfoHandle.f77903
            java.lang.String r0 = "file"
            java.lang.String r1 = r4.getScheme()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            pl.droidsonroids.gif.GifInfoHandle r3 = new pl.droidsonroids.gif.GifInfoHandle
            java.lang.String r4 = r4.getPath()
            r3.<init>(r4)
            goto L26
        L18:
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r3 = r3.openAssetFileDescriptor(r4, r0)
            if (r3 == 0) goto L2c
            pl.droidsonroids.gif.GifInfoHandle r4 = new pl.droidsonroids.gif.GifInfoHandle
            r4.<init>(r3)
            r3 = r4
        L26:
            r4 = 1
            r0 = 0
            r2.<init>(r3, r0, r4)
            return
        L2c:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not open AssetFileDescriptor for "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1734.<init>(android.content.ContentResolver, android.net.Uri):void");
    }

    public C1734(GifInfoHandle gifInfoHandle, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        this.f5993 = true;
        this.f5987 = Long.MIN_VALUE;
        this.f6000 = new Rect();
        this.f5991 = new Paint(6);
        this.f5992 = new ConcurrentLinkedQueue();
        C10201 c10201 = new C10201(this);
        this.f6001 = c10201;
        this.f5985 = z;
        if (scheduledThreadPoolExecutor == null) {
            int i = C9496.f28835;
            scheduledThreadPoolExecutor = C20785.f67310;
        }
        this.f5998 = scheduledThreadPoolExecutor;
        this.f5989 = gifInfoHandle;
        Bitmap createBitmap = Bitmap.createBitmap(gifInfoHandle.m52918(), gifInfoHandle.m52917(), Bitmap.Config.ARGB_8888);
        this.f5999 = createBitmap;
        createBitmap.setHasAlpha(!gifInfoHandle.m52910());
        this.f5990 = new Rect(0, 0, gifInfoHandle.m52918(), gifInfoHandle.m52917());
        this.f5986 = new HandlerC3145(this);
        c10201.mo16707();
        this.f5984 = gifInfoHandle.m52918();
        this.f5988 = gifInfoHandle.m52917();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m5787() {
        this.f5993 = false;
        this.f5986.removeMessages(-1);
        this.f5989.m52899();
        this.f5999.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        if (this.f5985 && this.f5993) {
            long j = this.f5987;
            if (j != Long.MIN_VALUE) {
                long max = Math.max(0L, j - SystemClock.uptimeMillis());
                this.f5987 = Long.MIN_VALUE;
                this.f5998.remove(this.f6001);
                this.f5994 = this.f5998.schedule(this.f6001, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f5988;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f5984;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f5991.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5991.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (!this.f5989.m52910() || this.f5991.getAlpha() < 255) ? -2 : -1;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        synchronized (this) {
            if (this.f5993) {
                return;
            }
            this.f5993 = true;
            m5786(this.f5989.m52900());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5786(long j) {
        boolean z = this.f5985;
        HandlerC3145 handlerC3145 = this.f5986;
        if (z) {
            this.f5987 = 0L;
            handlerC3145.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        ScheduledFuture scheduledFuture = this.f5994;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        handlerC3145.removeMessages(-1);
        this.f5994 = this.f5998.schedule(this.f6001, Math.max(j, 0L), TimeUnit.MILLISECONDS);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5793() {
        this.f5998.execute(new C14058(this, this));
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        synchronized (this) {
            if (this.f5993) {
                this.f5993 = false;
                ScheduledFuture scheduledFuture = this.f5994;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f5986.removeMessages(-1);
                this.f5989.m52913();
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f5993;
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        GifInfoHandle gifInfoHandle = this.f5989;
        int m52918 = gifInfoHandle.m52918();
        int m52917 = gifInfoHandle.m52917();
        int m52915 = gifInfoHandle.m52915();
        int m52924 = gifInfoHandle.m52924();
        StringBuilder m46682 = C20361.m46682("GIF: size: ", m52918, "x", ", frames: ", m52917);
        m46682.append(m52915);
        m46682.append(", error: ");
        m46682.append(m52924);
        return m46682.toString();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.f5989.m52915() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f5989.m52915() > 1;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m5789() {
        return this.f5989.m52915();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC17962 m5792() {
        return EnumC17962.m41953(this.f5989.m52924());
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.f5989.m52920();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.f5989.m52921();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f5998.execute(new C7709(this, this, i));
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return this.f5993;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m5785() {
        return this.f5989.m52902() + this.f5999.getAllocationByteCount();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m5791() {
        return this.f5989.m52912();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f6000.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f5997;
        Paint paint = this.f5991;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f5997);
            z = true;
        }
        canvas.drawBitmap(this.f5999, this.f5990, this.f6000, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f5991.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f5991.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f5991.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f5991.getColorFilter();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Bitmap m5788() {
        Bitmap bitmap = this.f5999;
        Bitmap copy = bitmap.copy(bitmap.getConfig(), bitmap.isMutable());
        copy.setHasAlpha(bitmap.hasAlpha());
        return copy;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private PorterDuffColorFilter m5784(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f5995 = colorStateList;
        this.f5997 = m5784(colorStateList, this.f5996);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f5996 = mode;
        this.f5997 = m5784(this.f5995, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f5995;
        if (colorStateList == null || (mode = this.f5996) == null) {
            return false;
        }
        this.f5997 = m5784(colorStateList, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f5995;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.f5985) {
            if (z) {
                if (z2) {
                    m5793();
                }
                if (visible) {
                    start();
                    return visible;
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m5790() {
        return this.f5989.m52916();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m5794() {
        return this.f5989.m52909();
    }
}
