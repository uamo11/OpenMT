package l;

import android.media.MediaCodecInfo;
import android.os.Build;
import com.umeng.commonsdk.utils.c;
import java.util.List;

/* compiled from: I8QN */
/* renamed from: l.ܳ۟֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14372 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m34339(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        Boolean bool;
        Boolean bool2;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (C9005.m23240((Object) supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1) {
                bool = C23545.f75600;
                if (bool == null) {
                    if (Build.VERSION.SDK_INT < 35) {
                        int m34340 = m34340(false);
                        int m343402 = m34340(true);
                        if (m34340 != 0) {
                            if (m343402 == 0) {
                            }
                        }
                        C23545.f75600 = Boolean.valueOf(z);
                        bool2 = C23545.f75600;
                        if (!bool2.booleanValue()) {
                        }
                    }
                    z = false;
                    C23545.f75600 = Boolean.valueOf(z);
                    bool2 = C23545.f75600;
                    if (!bool2.booleanValue()) {
                    }
                }
            }
            return i3;
        }
        return 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m34340(boolean z) {
        List m49731;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            C1297 c1297 = new C1297();
            c1297.m4465("video/avc");
            C8353 m4440 = c1297.m4440();
            String str = m4440.f25614;
            if (str != null) {
                List m497312 = C22134.m49731(str, z, false);
                String m49728 = C22134.m49728(m4440);
                if (m49728 == null) {
                    m49731 = AbstractC14545.of();
                } else {
                    m49731 = C22134.m49731(m49728, z, false);
                }
                C1846 c1846 = new C1846();
                c1846.m16263(m497312);
                c1846.m16263(m49731);
                AbstractC14545 m6131 = c1846.m6131();
                for (int i = 0; i < m6131.size(); i++) {
                    if (((C17195) m6131.get(i)).f52723 != null && (videoCapabilities = ((C17195) m6131.get(i)).f52723.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, c.e, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (C9005.m23240((Object) supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (C5201 unused) {
        }
        return 0;
    }
}
