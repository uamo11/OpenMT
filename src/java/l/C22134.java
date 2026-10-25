package l;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import com.google.android.material.internal.ManufacturerUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: M8RW */
/* renamed from: l.᩹۟֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22134 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f71829 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f71830 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized List m49731(String str, boolean z, boolean z2) {
        synchronized (C22134.class) {
            C0261 c0261 = new C0261(str, z, z2);
            HashMap hashMap = f71830;
            List list = (List) hashMap.get(c0261);
            if (list != null) {
                return list;
            }
            ArrayList m49730 = m49730(c0261, new C15077(z, z2, str.equals("video/mv-hevc")));
            if (z && m49730.isEmpty() && Build.VERSION.SDK_INT <= 23) {
                m49730 = m49730(c0261, new C8023());
                if (!m49730.isEmpty()) {
                    C19956.m46037("MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C17195) m49730.get(0)).f52721);
                }
            }
            m49733(str, m49730);
            AbstractC14545 copyOf = AbstractC14545.copyOf((Collection) m49730);
            hashMap.put(c0261, copyOf);
            return copyOf;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m49732(InterfaceC2379 interfaceC2379, C8353 c8353, boolean z, boolean z2) {
        List mo7690;
        List mo76902 = interfaceC2379.mo7690(c8353.f25614, z, z2);
        String m49728 = m49728(c8353);
        if (m49728 == null) {
            mo7690 = AbstractC14545.of();
        } else {
            mo7690 = interfaceC2379.mo7690(m49728, z, z2);
        }
        C1846 c1846 = new C1846();
        c1846.m16263(mo76902);
        c1846.m16263(mo7690);
        return c1846.m6131();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m49729(List list, final C8353 c8353) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C18607(new InterfaceC21429() { // from class: l.ۘ۟֫
            @Override // l.InterfaceC21429
            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final int mo11447(Object obj) {
                return ((C17195) obj).m40453(C8353.this) ? 1 : 0;
            }
        }));
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49728(C8353 c8353) {
        Pair m41768;
        String str = c8353.f25614;
        String str2 = c8353.f25614;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str2) && (m41768 = C17839.m41768(c8353)) != null) {
            int intValue = ((Integer) m41768.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str2)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0137 A[Catch: Exception -> 0x0187, TryCatch #4 {Exception -> 0x0187, blocks: (B:3:0x000a, B:5:0x001d, B:7:0x0027, B:13:0x0156, B:14:0x002e, B:16:0x0042, B:50:0x0131, B:52:0x0137, B:54:0x013d, B:57:0x0162, B:58:0x0185), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m49730(l.C0261 r25, l.InterfaceC0967 r26) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22134.m49730(l.֡۟֫, l.֨۟֫):java.util.ArrayList");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49727(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49735(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z && str.endsWith(".secure")) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && ManufacturerUtils.SAMSUNG.equals(Build.MANUFACTURER))) {
            String str3 = Build.DEVICE;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49733(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayList.size() == 1 && ((C17195) arrayList.get(0)).f52721.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C17195.m40445("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C18607(new C19313()));
        }
        if (Build.VERSION.SDK_INT >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((C17195) arrayList.get(0)).f52721)) {
            return;
        }
        arrayList.add((C17195) arrayList.remove(0));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49734(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT < 29) {
            if (C9786.m24810(str)) {
                return true;
            }
            String m35799 = C15107.m35799(mediaCodecInfo.getName());
            if (m35799.startsWith("arc.")) {
                return false;
            }
            if (m35799.startsWith("omx.google.") || m35799.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((m35799.startsWith("omx.sec.") && m35799.contains(".sw.")) || m35799.equals("omx.qcom.video.decoder.hevcswvdec") || m35799.startsWith("c2.android.") || m35799.startsWith("c2.google.")) {
                return true;
            }
            return (m35799.startsWith("omx.") || m35799.startsWith("c2.")) ? false : true;
        }
        return mediaCodecInfo.isSoftwareOnly();
    }
}
