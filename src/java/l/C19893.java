package l;

import android.net.Uri;
import java.nio.ByteBuffer;

/* compiled from: 95KK */
/* renamed from: l.᩶ۗ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19893 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45747(int i) {
        switch (i) {
            case 35:
                return 23;
            case 36:
            default:
                return -1;
            case 37:
                return 25;
            case 38:
                return 27;
            case 39:
                return 29;
            case 40:
                return 34;
            case 41:
                return 35;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m45757(ByteBuffer byteBuffer, boolean z) {
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m45758() {
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m45759(ByteBuffer byteBuffer) {
        throw null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m45756(int i, int i2, int i3) {
        m45750(i, i2, i3);
        return i3 >= 5 ? i2 : i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m45754(int i, int i2, int i3) {
        m45750(i, i2, i3);
        return i3 >= 5 ? i : i2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000f. Please report as an issue. */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45751(int i, int i2, int i3, float[] fArr) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        m45750(i, i2, i3);
        if (fArr == null || fArr.length < 9) {
            throw new IllegalArgumentException("Matrix output must contain at least 9 elements");
        }
        float f6 = -1.0f;
        switch (i3) {
            case 2:
                f = 0.0f;
                f2 = i;
                f3 = 0.0f;
                f4 = 0.0f;
                f5 = 1.0f;
                break;
            case 3:
                float f7 = i2;
                f = 0.0f;
                f2 = i;
                f3 = f7;
                f4 = 0.0f;
                f5 = -1.0f;
                break;
            case 4:
                f3 = i2;
                f2 = 0.0f;
                f = 0.0f;
                f6 = 1.0f;
                f4 = 0.0f;
                f5 = -1.0f;
                break;
            case 5:
                f3 = 0.0f;
                f2 = 0.0f;
                f = 1.0f;
                f6 = 0.0f;
                f4 = 1.0f;
                f5 = 0.0f;
                break;
            case 6:
                f = -1.0f;
                f2 = i2;
                f3 = 0.0f;
                f6 = 0.0f;
                f4 = 1.0f;
                f5 = 0.0f;
                break;
            case 7:
                f2 = i2;
                f3 = i;
                f = -1.0f;
                f6 = 0.0f;
                f4 = -1.0f;
                f5 = 0.0f;
                break;
            case 8:
                f3 = i;
                f2 = 0.0f;
                f = 1.0f;
                f6 = 0.0f;
                f4 = -1.0f;
                f5 = 0.0f;
                break;
            default:
                f3 = 0.0f;
                f2 = 0.0f;
                f = 0.0f;
                f6 = 1.0f;
                f4 = 0.0f;
                f5 = 1.0f;
                break;
        }
        fArr[0] = f6;
        fArr[1] = f;
        fArr[2] = f2;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f3;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m45753(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m45755(C18241 c18241, int i, long j) {
        int numberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros == 0) {
            numberOfLeadingZeros = 1;
        }
        int i2 = (numberOfLeadingZeros + 7) >> 3;
        c18241.m42517(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            c18241.m42517((byte) j);
            j >>= 8;
            i2--;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45750(int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Image dimensions must be positive");
        }
        if (i3 < 1 || i3 > 8) {
            throw new IllegalArgumentException("EXIF orientation must be between 1 and 8");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45752(C18241 c18241, int i, long j) {
        int numberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (numberOfTrailingZeros == 0) {
            numberOfTrailingZeros = 1;
        }
        int i2 = (numberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 * 8));
        c18241.m42517(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            c18241.m42517((byte) j2);
            j2 >>= 8;
            i2--;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45749(String str) {
        char c;
        if (str == null) {
            return -1;
        }
        String m24800 = C9786.m24800(str);
        m24800.getClass();
        switch (m24800.hashCode()) {
            case -2123537834:
                if (m24800.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662384011:
                if (m24800.equals("video/mp2p")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662384007:
                if (m24800.equals("video/mp2t")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662095187:
                if (m24800.equals("video/webm")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (m24800.equals("audio/amr-wb")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1487656890:
                if (m24800.equals("image/avif")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1487464693:
                if (m24800.equals("image/heic")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1487464690:
                if (m24800.equals("image/heif")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1487394660:
                if (m24800.equals("image/jpeg")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1487018032:
                if (m24800.equals("image/webp")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1248337486:
                if (m24800.equals("application/mp4")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1079884372:
                if (m24800.equals("video/x-msvideo")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (m24800.equals("text/vtt")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -879272239:
                if (m24800.equals("image/bmp")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -879258763:
                if (m24800.equals("image/png")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -387023398:
                if (m24800.equals("audio/x-matroska")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -43467528:
                if (m24800.equals("application/webm")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 13915911:
                if (m24800.equals("video/x-flv")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (m24800.equals("audio/ac3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (m24800.equals("audio/ac4")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 187078669:
                if (m24800.equals("audio/amr")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 187090232:
                if (m24800.equals("audio/mp4")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 187091926:
                if (m24800.equals("audio/ogg")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 187099443:
                if (m24800.equals("audio/wav")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1331848029:
                if (m24800.equals("video/mp4")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (m24800.equals("audio/3gpp")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (m24800.equals("audio/eac3")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (m24800.equals("audio/flac")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1504824762:
                if (m24800.equals("audio/midi")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (m24800.equals("audio/mpeg")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1505118770:
                if (m24800.equals("audio/webm")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 2039520277:
                if (m24800.equals("video/x-matroska")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45748(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }
}
