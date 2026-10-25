package l;

import android.text.TextUtils;
import com.alipay.sdk.m.y.q;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.i18n.TextBundle;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: U8ON */
/* renamed from: l.ۢ᩵֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9786 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f29598 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f29600 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f29599 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24796(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case q.f /* 99 */:
            case 100:
            case 101:
                return "video/mpeg2";
            case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
            case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
            case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                return "audio/mp4a-latm";
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
            case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                return "audio/mpeg";
            case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m24810(String str) {
        return "audio".equals(m24808(str));
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m24801(String str) {
        return "video".equals(m24808(str));
    }

    @Pure
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m24809(String str) {
        return TextBundle.TEXT_ENTRY.equals(m24808(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m24799(String str) {
        return "image".equals(m24808(str)) || "application/x-image-uri".equals(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24798(String str, String str2) {
        C21075 m24806;
        int m47978;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (m24806 = m24806(str2)) != null && (m47978 = m24806.m47978()) != 0 && m47978 != 16) {
                }
                break;
        }
        return false;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m24804(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C3603.m11052(str)) {
            String m24802 = m24802(str2);
            if (m24802 != null && m24801(m24802)) {
                return m24802;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m24803(String str, String str2) {
        if (str != null && str2 != null) {
            String[] m11052 = C3603.m11052(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : m11052) {
                if (str2.equals(m24802(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24797(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : C3603.m11052(str)) {
            String m24802 = m24802(str2);
            if (m24802 != null && m24810(m24802)) {
                return m24802;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m24802(String str) {
        C21075 m24806;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String m35799 = C15107.m35799(str.trim());
        if (m35799.startsWith("avc1") || m35799.startsWith("avc3")) {
            return "video/avc";
        }
        if (m35799.startsWith("hev1") || m35799.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (m35799.startsWith("dvav") || m35799.startsWith("dva1") || m35799.startsWith("dvhe") || m35799.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (m35799.startsWith("av01")) {
            return "video/av01";
        }
        if (m35799.startsWith("vp9") || m35799.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (m35799.startsWith("vp8") || m35799.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (m35799.startsWith("mp4a")) {
            if (m35799.startsWith("mp4a.") && (m24806 = m24806(m35799)) != null) {
                str2 = m24796(m24806.f67984);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        }
        if (m35799.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (m35799.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (m35799.startsWith("ac-3") || m35799.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (m35799.startsWith("ec-3") || m35799.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (m35799.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (m35799.startsWith("ac-4") || m35799.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (m35799.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (m35799.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (m35799.startsWith("dtsh") || m35799.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (m35799.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (m35799.startsWith("opus")) {
            return "audio/opus";
        }
        if (m35799.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (m35799.startsWith("flac")) {
            return "audio/flac";
        }
        if (m35799.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (m35799.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (m35799.contains("cea708")) {
            return "application/cea-708";
        }
        if (m35799.contains("eia608") || m35799.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = f29600;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C6963) arrayList.get(i)).getClass();
            if (m35799.startsWith(null)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m24807(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m24810(str)) {
            return 1;
        }
        if (m24801(str)) {
            return 2;
        }
        if (m24809(str)) {
            return 3;
        }
        if (m24799(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f29600;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C6963) arrayList.get(i)).getClass();
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m24805(String str, String str2) {
        C21075 m24806;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (m24806 = m24806(str2)) == null) {
                    return 0;
                }
                return m24806.m47978();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static String m24800(String str) {
        String m35799;
        if (str == null) {
            return null;
        }
        m35799 = C15107.m35799(str);
        m35799.getClass();
        switch (m35799) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return m35799;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m24808(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C21075 m24806(String str) {
        Matcher matcher = f29599.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new C21075(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
