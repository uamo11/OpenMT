package l;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;

/* compiled from: 38M9 */
/* renamed from: l.ܿ۟֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17195 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f52718;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f52719;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f52720;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f52721;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f52722;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final MediaCodecInfo.CodecCapabilities f52723;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f52724;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f52725;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f52726;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f52727;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f52728;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f52729;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f52730;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ("Nexus 10".equals(r0) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C17195 m40445(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
            r1 = r12
            r4 = r15
            l.ܿ۟֫ r11 = new l.ܿ۟֫
            if (r4 == 0) goto L3a
            java.lang.String r0 = "adaptive-playback"
            boolean r0 = r15.isFeatureSupported(r0)
            if (r0 == 0) goto L3a
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 22
            if (r0 > r2) goto L37
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L26
            java.lang.String r2 = "Nexus 10"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L37
        L26:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r12)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L37
            goto L3a
        L37:
            r0 = 1
            r8 = 1
            goto L3c
        L3a:
            r0 = 0
            r8 = 0
        L3c:
            if (r4 == 0) goto L43
            java.lang.String r0 = "tunneled-playback"
            r15.isFeatureSupported(r0)
        L43:
            if (r19 != 0) goto L53
            if (r4 == 0) goto L50
            java.lang.String r0 = "secure-playback"
            boolean r0 = r15.isFeatureSupported(r0)
            if (r0 == 0) goto L50
            goto L53
        L50:
            r0 = 0
            r9 = 0
            goto L55
        L53:
            r0 = 1
            r9 = 1
        L55:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r0 < r2) goto L93
            if (r4 == 0) goto L93
            java.lang.String r0 = "detached-surface"
            boolean r0 = r15.isFeatureSupported(r0)
            if (r0 == 0) goto L93
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "Xiaomi"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L93
            java.lang.String r2 = "OPPO"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L93
            java.lang.String r2 = "realme"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L93
            java.lang.String r2 = "motorola"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L93
            java.lang.String r2 = "LENOVO"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L90
            goto L93
        L90:
            r0 = 1
            r10 = 1
            goto L95
        L93:
            r0 = 0
            r10 = 0
        L95:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17195.m40445(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):l.ܿ۟֫");
    }

    public C17195(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f52721 = str;
        this.f52722 = str2;
        this.f52726 = str3;
        this.f52723 = codecCapabilities;
        this.f52727 = z;
        this.f52719 = z2;
        this.f52718 = z4;
        this.f52725 = z5;
        this.f52728 = z6;
        this.f52724 = C9786.m24801(str2);
        this.f52730 = -3.4028235E38f;
        this.f52729 = -1;
        this.f52720 = -1;
    }

    public final String toString() {
        return this.f52721;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40453(C8353 c8353) {
        String str = c8353.f25614;
        String str2 = this.f52722;
        return (str2.equals(str) || str2.equals(C22134.m49728(c8353))) && m40448(c8353, false) && m40449(c8353);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m40454(C8353 c8353) {
        int i;
        String str = c8353.f25614;
        String str2 = this.f52722;
        if ((!str2.equals(str) && !str2.equals(C22134.m49728(c8353))) || !m40448(c8353, true) || !m40449(c8353)) {
            return false;
        }
        if (this.f52724) {
            int i2 = c8353.f25633;
            if (i2 > 0 && (i = c8353.f25609) > 0) {
                return m40452(i2, i, c8353.f25596);
            }
        } else {
            int i3 = c8353.f25624;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f52723;
            if (i3 != -1) {
                if (codecCapabilities == null) {
                    m40446("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m40446("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    m40446(C19370.m44628(i3, "sampleRate.support, "));
                    return false;
                }
            }
            int i4 = c8353.f25625;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    m40446("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    m40446("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((Build.VERSION.SDK_INT < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i5 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    C19956.m46037("AssumedMaxChannelAdjustment: " + this.f52721 + ", [" + maxInputChannelCount + " to " + i5 + "]");
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    m40446(C19370.m44628(i4, "channelCount.support, "));
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40448(C8353 c8353, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i = C22134.f71829;
        Pair m41768 = C17839.m41768(c8353);
        String str = c8353.f25614;
        String str2 = this.f52726;
        if (str != null && str.equals("video/mv-hevc")) {
            String m24800 = C9786.m24800(str2);
            if (!m24800.equals("video/mv-hevc")) {
                if (m24800.equals("video/hevc")) {
                    String m38882 = C16509.m38882(c8353.f25634);
                    if (m38882 == null) {
                        m41768 = null;
                    } else {
                        String trim = m38882.trim();
                        String str3 = C3603.f11424;
                        m41768 = C17839.m41767(m38882, trim.split("\\.", -1), c8353.f25637);
                    }
                }
            }
            return true;
        }
        if (m41768 != null) {
            int intValue = ((Integer) m41768.first).intValue();
            int intValue2 = ((Integer) m41768.second).intValue();
            boolean equals = "video/dolby-vision".equals(str);
            int i2 = 8;
            String str4 = this.f52722;
            if (equals) {
                str4.getClass();
                switch (str4) {
                    case "video/av01":
                    case "video/hevc":
                        intValue2 = 0;
                        intValue = 2;
                        break;
                    case "video/avc":
                        intValue2 = 0;
                        intValue = 8;
                        break;
                }
            }
            if (this.f52724 || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f52723;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (Build.VERSION.SDK_INT <= 23 && "video/x-vnd.on2.vp9".equals(str4) && codecProfileLevelArr.length == 0) {
                    int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    if (intValue3 >= 180000000) {
                        i2 = 1024;
                    } else if (intValue3 >= 120000000) {
                        i2 = 512;
                    } else if (intValue3 >= 60000000) {
                        i2 = 256;
                    } else if (intValue3 >= 30000000) {
                        i2 = 128;
                    } else if (intValue3 >= 18000000) {
                        i2 = 64;
                    } else if (intValue3 >= 12000000) {
                        i2 = 32;
                    } else if (intValue3 >= 7200000) {
                        i2 = 16;
                    } else if (intValue3 < 3600000) {
                        i2 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i2;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z)) {
                        if ("video/hevc".equals(str4) && 2 == intValue) {
                            String str5 = Build.DEVICE;
                            if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                            }
                        }
                    }
                }
                m40446(C23202.m51498(new StringBuilder("codec.profileLevel, "), c8353.f25619, ", ", str2));
                return false;
            }
        }
        return true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m40449(C8353 c8353) {
        return (C11003.equals(c8353.f25614, "audio/flac") && c8353.f25605 == 22 && Build.VERSION.SDK_INT < 34 && this.f52721.equals("c2.android.flac.decoder")) ? false : true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m40455(C8353 c8353) {
        if (this.f52724) {
            return this.f52718;
        }
        int i = C22134.f71829;
        Pair m41768 = C17839.m41768(c8353);
        return m41768 != null && ((Integer) m41768.first).intValue() == 42;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13396 m40451(C8353 c8353, C8353 c83532) {
        int i;
        String str = c8353.f25614;
        C21054 c21054 = c8353.f25637;
        String str2 = c83532.f25614;
        C21054 c210542 = c83532.f25637;
        int i2 = !C11003.equals(str, str2) ? 8 : 0;
        if (this.f52724) {
            if (c8353.f25599 != c83532.f25599) {
                i2 |= 1024;
            }
            boolean z = (c8353.f25633 == c83532.f25633 && c8353.f25609 == c83532.f25609) ? false : true;
            if (!this.f52718 && z) {
                i2 |= 512;
            }
            if ((!C21054.m47894(c21054) || !C21054.m47894(c210542)) && !C11003.equals(c21054, c210542)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f52721) && !c8353.m21950(c83532)) {
                i2 |= 2;
            }
            int i3 = c8353.f25600;
            if (i3 != -1 && (i = c8353.f25622) != -1 && i3 == c83532.f25600 && i == c83532.f25622 && z) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new C13396(this.f52721, c8353, c83532, c8353.m21950(c83532) ? 3 : 2, 0);
            }
        } else {
            if (c8353.f25625 != c83532.f25625) {
                i2 |= 4096;
            }
            if (c8353.f25624 != c83532.f25624) {
                i2 |= 8192;
            }
            if (c8353.f25605 != c83532.f25605) {
                i2 |= 16384;
            }
            String str3 = this.f52722;
            if (i2 == 0 && "audio/mp4a-latm".equals(str3)) {
                int i4 = C22134.f71829;
                Pair m41768 = C17839.m41768(c8353);
                Pair m417682 = C17839.m41768(c83532);
                if (m41768 != null && m417682 != null) {
                    int intValue = ((Integer) m41768.first).intValue();
                    int intValue2 = ((Integer) m417682.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C13396(this.f52721, c8353, c83532, 3, 0);
                    }
                }
            }
            if (!c8353.m21950(c83532)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new C13396(this.f52721, c8353, c83532, 1, 0);
            }
        }
        return new C13396(this.f52721, c8353, c83532, 0, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40452(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f52723;
        if (codecCapabilities == null) {
            m40446("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m40446("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int m52003 = C23545.m52003(videoCapabilities, i, i2, d);
            if (m52003 != 2) {
                if (m52003 == 1) {
                    StringBuilder m46682 = C20361.m46682("sizeAndRate.cover, ", i, "x", "@", i2);
                    m46682.append(d);
                    m40446(m46682.toString());
                    return false;
                }
            }
            return true;
        }
        if (!m40447(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.f52721;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && m40447(videoCapabilities, i2, i, d)) {
                    StringBuilder m466822 = C20361.m46682("sizeAndRate.rotated, ", i, "x", "@", i2);
                    m466822.append(d);
                    StringBuilder m10501 = C3435.m10501("AssumedSupport [", m466822.toString(), "] [", str, ", ");
                    m10501.append(this.f52722);
                    m10501.append("] [");
                    m10501.append(C3603.f11424);
                    m10501.append("]");
                    C19956.m46031(m10501.toString());
                    return true;
                }
            }
            StringBuilder m466823 = C20361.m46682("sizeAndRate.support, ", i, "x", "@", i2);
            m466823.append(d);
            m40446(m466823.toString());
            return false;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m40450(int i, int i2) {
        if (!this.f52724) {
            return -3.4028235E38f;
        }
        float f = this.f52730;
        if (f != -3.4028235E38f && this.f52729 == i && this.f52720 == i2) {
            return f;
        }
        float f2 = 1024.0f;
        if (!m40452(i, i2, 1024.0f)) {
            float f3 = 0.0f;
            while (true) {
                float f4 = f2 - f3;
                if (Math.abs(f4) <= 5.0f) {
                    break;
                }
                float f5 = (f4 / 2.0f) + f3;
                if (m40452(i, i2, f5)) {
                    f3 = f5;
                } else {
                    f2 = f5;
                }
            }
            f2 = f3;
        }
        this.f52730 = f2;
        this.f52729 = i;
        this.f52720 = i2;
        return f2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40446(String str) {
        StringBuilder m9834 = C3200.m9834("NoSupport [", str, "] [");
        m9834.append(this.f52721);
        m9834.append(", ");
        m9834.append(this.f52722);
        m9834.append("] [");
        m9834.append(C3603.f11424);
        m9834.append("]");
        C19956.m46031(m9834.toString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40447(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Range<Double> achievableFrameRatesFor;
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(C3603.m10999(i, widthAlignment) * widthAlignment, C3603.m10999(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double floor = Math.floor(d);
        if (videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
            return Build.VERSION.SDK_INT < 24 || (achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4)) == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
        }
        return false;
    }
}
