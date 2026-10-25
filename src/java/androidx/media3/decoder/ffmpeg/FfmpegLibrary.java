package androidx.media3.decoder.ffmpeg;

import l.AbstractC0199;
import l.C16840;
import l.C19956;
import l.C23253;
import l.C8353;

/* loaded from: classes.dex */
public final class FfmpegLibrary {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC0199 f11;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int f12;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String f13;

    public static native int ffmpegGetInputBufferPaddingSize();

    public static native String ffmpegGetVersion();

    public static native boolean ffmpegHasDecoder(String str);

    static {
        C16840.m39615("media3.decoder.ffmpeg");
        f11 = new C23253("ffmpegJNI");
        f12 = -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m18() {
        if (!f11.m1360()) {
            return -1;
        }
        if (f12 == -1) {
            f12 = ffmpegGetInputBufferPaddingSize();
        }
        return f12;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m20() {
        if (!f11.m1360()) {
            return null;
        }
        if (f13 == null) {
            f13 = ffmpegGetVersion();
        }
        return f13;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m21(C8353 c8353) {
        String m19;
        if (!f11.m1360() || (m19 = m19(c8353)) == null) {
            return false;
        }
        if (ffmpegHasDecoder(m19)) {
            return true;
        }
        C19956.m46037("No " + m19 + " decoder available. Check the FFmpeg build configuration.");
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m22() {
        return f11.m1360();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m19(C8353 c8353) {
        String str = c8353.f25614;
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }
}
