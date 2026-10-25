package l;

import android.content.res.AssetManager;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.Matrix;

/* compiled from: G6WH */
/* renamed from: l.᩺۠ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22865 extends Thread {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f73765;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f73766;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f73767;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f73768;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f73769;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f73770;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f73771;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float[] f73772;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21455 f73773;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f73774;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f73775;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f73776;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AssetManager f73777;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f73778;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final SurfaceTexture f73779;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m50962() {
        if (this.f73768) {
            return;
        }
        this.f73768 = true;
        m50966();
        if (this.f73767) {
            this.f73779.release();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m50963(int i, float f, int i2) {
        this.f73771 = i;
        this.f73774 = i2;
        this.f73776 = f;
        this.f73770 = true;
        notifyAll();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m50964(boolean z) {
        boolean z2 = this.f73765;
        if (z2 == z) {
            return;
        }
        if (z && !z2) {
            this.f73770 = true;
        }
        this.f73765 = z;
        notifyAll();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m50965(float[] fArr) {
        if (this.f73778) {
            return;
        }
        System.arraycopy(fArr, 0, this.f73772, 0, 16);
        this.f73770 = true;
        notifyAll();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m50966() {
        this.f73778 = true;
        notifyAll();
    }

    public C22865(AssetManager assetManager, SurfaceTexture surfaceTexture, int i, int i2, float f, int i3, boolean z, C21455 c21455) {
        super("MT-Logo3D");
        float[] fArr = new float[16];
        this.f73772 = fArr;
        this.f73770 = true;
        this.f73765 = true;
        this.f73777 = assetManager;
        this.f73779 = surfaceTexture;
        this.f73771 = i;
        this.f73774 = i2;
        this.f73776 = f;
        this.f73775 = i3;
        this.f73769 = z;
        this.f73773 = c21455;
        Matrix.setIdentityM(fArr, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x013e, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0143, code lost:
    
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0148, code lost:
    
        m50961("query width", android.opengl.EGL14.eglQuerySurface(r2, r4, 12375, r7, 0));
        m50961("query height", android.opengl.EGL14.eglQuerySurface(r2, r4, 12374, r7, 1));
        r13.m32940(r7[0], r7[1], r7, r8);
        m50961("swap buffers", android.opengl.EGL14.eglSwapBuffers(r2, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0172, code lost:
    
        if (r20.f73766 != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0174, code lost:
    
        r20.f73766 = true;
        r20.f73773.m48606(r20);
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22865.run():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50961(String str, boolean z) {
        if (z) {
            return;
        }
        StringBuilder m9834 = C3200.m9834("Logo EGL ", str, " failed: ");
        m9834.append(EGL14.eglGetError());
        throw new IllegalStateException(m9834.toString());
    }
}
