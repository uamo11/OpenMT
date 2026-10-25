package l;

import android.net.Uri;
import android.util.Base64;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: 97LV */
/* renamed from: l.᩺᩺֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23295 implements InterfaceC15995 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12712 f74906;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4951 f74907;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74860 = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74886 = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74852 = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74869 = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f74898 = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74858 = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74848 = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74876 = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f74900 = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74863 = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74899 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74850 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74851 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74874 = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f74904 = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74893 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74889 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74849 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Pattern f74834 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Pattern f74892 = m51681("CAN-SKIP-DATERANGES");

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74847 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74872 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74891 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74890 = m51681("CAN-BLOCK-RELOAD");

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74859 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74861 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74880 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74853 = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74897 = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74873 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74879 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74884 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74844 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74840 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74841 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74885 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74875 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74839 = Pattern.compile("URI=\"((?:.|\f)+?)\"");

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74888 = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74855 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74878 = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74905 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74845 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Pattern f74902 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f74836 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74882 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f74896 = m51681("AUTOSELECT");

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74842 = m51681("DEFAULT");

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74862 = m51681("FORCED");

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74864 = m51681("INDEPENDENT");

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74866 = m51681("GAP");

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74857 = m51681("PRECISE");

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74865 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74838 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Pattern f74854 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Pattern f74856 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74871 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74846 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f74870 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74835 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74868 = m51681("END-ON-NEXT");

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74887 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74881 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74895 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74837 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74843 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74901 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Pattern f74894 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74867 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74903 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74883 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74877 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    @Override // l.InterfaceC15995
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo33873(Uri uri, C20038 c20038) {
        return m51688(uri, (InputStream) c20038);
    }

    public C23295() {
        this(C12712.f38252, null);
    }

    public C23295(C12712 c12712, C4951 c4951) {
        this.f74906 = c12712;
        this.f74907 = c4951;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r1 = r0.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        r1 = r1.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (r1.isEmpty() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (r1.startsWith("#EXT-X-STREAM-INF") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        if (r1.startsWith("#EXT-X-TARGETDURATION") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
    
        if (r1.startsWith("#EXT-X-MEDIA-SEQUENCE") != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        if (r1.startsWith("#EXTINF") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        if (r1.startsWith("#EXT-X-KEY") != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        if (r1.startsWith("#EXT-X-BYTERANGE") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        if (r1.equals("#EXT-X-DISCONTINUITY") != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
    
        if (r1.equals("#EXT-X-DISCONTINUITY-SEQUENCE") != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        if (r1.equals("#EXT-X-ENDLIST") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        r8.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        r8.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        return m51682(r6.f74906, r6.f74907, new l.C12007(r8, r0), r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0081, code lost:
    
        r8.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
    
        return m51683(new l.C12007(r8, r0), r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f2, code lost:
    
        l.C3603.m11024(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fb, code lost:
    
        throw l.C9080.m23438("Failed to parse the playlist, could not identify any tags.");
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC10596 m51688(android.net.Uri r7, java.io.InputStream r8) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23295.m51688(android.net.Uri, java.io.InputStream):l.ۤ᩺֫");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0279, code lost:
    
        if (r0 > 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0193, code lost:
    
        if (r4.startsWith("hev1") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a1, code lost:
    
        if (r4.startsWith("hvc1") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b1, code lost:
    
        if (r4.startsWith("avc3") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c1, code lost:
    
        if (r4.startsWith("avc1") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d1, code lost:
    
        if (r4.startsWith("av01") != false) goto L82;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:178:0x04de. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C12712 m51683(l.C12007 r41, java.lang.String r42) {
        /*
            Method dump skipped, instructions count: 1748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23295.m51683(l.ۨ᩺֫, java.lang.String):l.۫᩺֫");
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x08ea, code lost:
    
        if (r10.equals("POINT") != false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0906, code lost:
    
        if (r10.equals("HIGHLIGHT") != false) goto L360;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0696  */
    /* JADX WARN: Type inference failed for: r8v12, types: [l.ܳ۬ܺ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C4951 m51682(l.C12712 r98, l.C4951 r99, l.C12007 r100, java.lang.String r101) {
        /*
            Method dump skipped, instructions count: 3334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23295.m51682(l.۫᩺֫, l.ۙ᩺֫, l.ۨ᩺֫, java.lang.String):l.ۙ᩺֫");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19643 m51685(String str, C18937[] c18937Arr) {
        C18937[] c18937Arr2 = new C18937[c18937Arr.length];
        for (int i = 0; i < c18937Arr.length; i++) {
            C18937 c18937 = c18937Arr[i];
            c18937Arr2[i] = new C18937(c18937.f59726, c18937.f59728, c18937.f59727, null);
        }
        return new C19643(str, c18937Arr2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18937 m51684(String str, String str2, HashMap hashMap) {
        String m51679 = m51679(str, f74875, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f74839;
        if (equals) {
            String m51680 = m51680(str, pattern, hashMap);
            return new C18937(C23875.f77203, null, "video/mp4", Base64.decode(m51680.substring(m51680.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = C23875.f77203;
            String str3 = C3603.f11424;
            return new C18937(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(m51679)) {
            return null;
        }
        String m516802 = m51680(str, pattern, hashMap);
        byte[] decode = Base64.decode(m516802.substring(m516802.indexOf(44)), 0);
        UUID uuid2 = C23875.f77202;
        return new C18937(uuid2, null, "video/mp4", C10750.m26947(uuid2, null, decode));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m51687(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51680(String str, Pattern pattern, Map map) {
        String m51679 = m51679(str, pattern, (String) null, map);
        if (m51679 != null) {
            return m51679;
        }
        throw C9080.m23438("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51679(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m51678(str2, map);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double m51677(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51678(String str, Map map) {
        Matcher matcher = f74883.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51686(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pattern m51681(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }
}
