package l;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import com.google.android.material.internal.ManufacturerUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: 78NV */
/* renamed from: l.ۘۚ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3728 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11339(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            return false;
        }
        if (i < 26 && (ManufacturerUtils.SAMSUNG.equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return m11340("EGL_EXT_protected_content");
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m11342() {
        return m11340("EGL_KHR_surfaceless_context");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11338(int i) {
        if (i == 6) {
            return m11341();
        }
        if (i == 7) {
            return m11340("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m11341() {
        return Build.VERSION.SDK_INT >= 33 && m11340("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11340(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        m11337("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        m11337("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        m11335();
        String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11335() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = C13540.m32584(new StringBuilder("error code: 0x"), glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z = true;
        }
        if (z) {
            throw new C2317(sb.toString());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static FloatBuffer m11334(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11336(int i, int i2) {
        GLES20.glBindTexture(i, i2);
        m11335();
        GLES20.glTexParameteri(i, 10240, 9729);
        m11335();
        GLES20.glTexParameteri(i, 10241, 9729);
        m11335();
        GLES20.glTexParameteri(i, 10242, 33071);
        m11335();
        GLES20.glTexParameteri(i, 10243, 33071);
        m11335();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11337(String str, boolean z) {
        if (!z) {
            throw new C2317(str);
        }
    }
}
