package l;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;

/* compiled from: I8LX */
/* renamed from: l.᩷ۚ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC20662 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int[] f66534 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public SurfaceTexture f66535;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EGLSurface f66536;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int[] f66537 = new int[1];

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Handler f66538;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EGLContext f66539;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EGLDisplay f66540;

    public RunnableC20662(Handler handler) {
        this.f66538 = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47278() {
        this.f66538.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f66535;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f66537, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f66540;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f66540;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f66536;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f66540, this.f66536);
            }
            EGLContext eGLContext = this.f66539;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f66540, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f66540;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f66540);
            }
            this.f66540 = null;
            this.f66539 = null;
            this.f66536 = null;
            this.f66535 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SurfaceTexture m47276() {
        SurfaceTexture surfaceTexture = this.f66535;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f66538.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f66535;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47277(int i) {
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        C3728.m11337("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr = new int[2];
        C3728.m11337("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        this.f66540 = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f66534, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z = eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        String str = C3603.f11424;
        C3728.m11337(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f66540, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        C3728.m11337("eglCreateContext failed", eglCreateContext != null);
        this.f66539 = eglCreateContext;
        EGLDisplay eGLDisplay = this.f66540;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            C3728.m11337("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        C3728.m11337("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        this.f66536 = eglCreatePbufferSurface;
        int[] iArr3 = this.f66537;
        GLES20.glGenTextures(1, iArr3, 0);
        C3728.m11335();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        this.f66535 = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }
}
