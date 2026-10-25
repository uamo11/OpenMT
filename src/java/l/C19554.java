package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;

/* compiled from: H1TD */
/* renamed from: l.᩵ܶ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19554 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63216 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C19554 f63217;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static long f63218;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int f63219;

    /* renamed from: ᩵᩹ۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f63220 = {2549, -6913, -6914, -6916, -6919, -6914, -6923, -6961, -6925, -6913, -6914, -6922, -6919, -6921, -6961, -6940, -6919, -6915, -6923, -6913, -6914, -6916, -6919, -6914, -6923, -6961, -6925, -6913, -6914, -6922, -6919, -6921, -6961, -6924, -6927, -6940, -6927, 6914, 11266, 11272, 11295, 11269, 11280, 11273, 11332, 11310, 11265, 11290, 11286, 11310, 11288, 11295, 11287, 11294, 11309, 11277, 11266, 11272, 11295, 11269, 11280, 11273, 11358, 11294, 11295, 11293, 11288, 11295, 11284, 11358, 11303, 11316, 11299, 11298, 11320, 11326, 11327, 4517, 18706, 18707, 18705, 18708, 18707, 18712, 18722, 18718, 18706, 18707, 18715, 18708, 18714, 18722, 18699, 18712, 18703, 18702, 18708, 18706, 18707, 18709, 18697, 18697, 18701, 18702, 18759, 18770, 18770, 18709, 18696, 18719, 18771, 18704, 18697, 18771, 18718, 18718, 18770, 18716, 18701, 18708, 18770, 18718, 18706, 18707, 18715, 18708, 18714, 18754, 18699, 18752, 18767, 18763, 18764, 18765, 18764, 18765, 18763, 18764, 18706, 18707, 18705, 18708, 18707, 18712, 18722, 18718, 18706, 18707, 18715, 18708, 18714, 18722, 18713, 18716, 18697, 18716, 18706, 18707, 18705, 18708, 18707, 18712, 18722, 18718, 18706, 18707, 18715, 18708, 18714, 18722, 18699, 18712, 18703, 18702, 18708, 18706, 18707, 18706, 18707, 18705, 18708, 18707, 18712, 18722, 18718, 18706, 18707, 18715, 18708, 18714, 18722, 18697, 18708, 18704, 18712, 9063, 21910, 21904, 21911, 21895};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Map f63221;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (java.lang.Math.abs(((int) (l.ViewOnClickListenerC1958.m6432() / 1000)) - l.C19554.f63219) > 3600) goto L19;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void m44966() {
        /*
            short[] r0 = l.C19554.f63220
            r1 = 77
            short r0 = r0[r1]
            int r1 = r0 + 1
            int r1 = r1 * r1
            int r0 = r0 * 2
            int r0 = r0 + 1
            int r1 = r1 - r0
            if (r1 >= 0) goto L16
            r0 = 23752(0x5cc8, float:3.3284E-41)
            r1 = 23752(0x5cc8, float:3.3284E-41)
            goto L1a
        L16:
            r0 = 18813(0x497d, float:2.6363E-41)
            r1 = 18813(0x497d, float:2.6363E-41)
        L1a:
            java.lang.Class<l.᩵ܶ᩷> r0 = l.C19554.class
            monitor-enter(r0)
            boolean r2 = l.C4925.m14301()     // Catch: java.lang.Throwable -> Ld6
            if (r2 != 0) goto L25
            goto Ld4
        L25:
            long r2 = l.C3019.m9262()     // Catch: java.lang.Throwable -> Ld6
            long r4 = l.C19554.f63218     // Catch: java.lang.Throwable -> Ld6
            long r2 = r2 - r4
            r4 = 10000(0x2710, double:4.9407E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L34
            goto Ld4
        L34:
            l.۫ۤۡ r2 = l.ApplicationC20075.f65008     // Catch: java.lang.Throwable -> Ld6
            short[] r3 = l.C19554.f63220     // Catch: java.lang.Throwable -> Ld6
            r4 = 78
            r5 = 21
            java.lang.String r3 = l.C7811.m20837(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> Ld6
            r4 = 0
            int r2 = r2.getInt(r3, r4)     // Catch: java.lang.Throwable -> Ld6
            r5 = 1000(0x3e8, double:4.94E-321)
            r3 = 26101061(0x18e4545, float:5.226196E-38)
            if (r2 == r3) goto L4d
            goto L5e
        L4d:
            long r7 = l.ViewOnClickListenerC1958.m6432()     // Catch: java.lang.Throwable -> Ld6
            long r7 = r7 / r5
            int r2 = (int) r7     // Catch: java.lang.Throwable -> Ld6
            int r7 = l.C19554.f63219     // Catch: java.lang.Throwable -> Ld6
            int r2 = r2 - r7
            int r2 = java.lang.Math.abs(r2)     // Catch: java.lang.Throwable -> Ld6
            r7 = 3600(0xe10, float:5.045E-42)
            if (r2 <= r7) goto Ld4
        L5e:
            long r7 = l.C3537.m10751()     // Catch: java.lang.Throwable -> Ld6
            l.C19554.f63218 = r7     // Catch: java.lang.Throwable -> Ld6
            short[] r2 = l.C19554.f63220     // Catch: java.lang.Throwable -> Ld4
            r7 = 99
            r8 = 39
            java.lang.String r2 = l.C3245.m9934(r2, r7, r8, r1)     // Catch: java.lang.Throwable -> Ld4
            byte[] r2 = l.C4210.m12701(r2)     // Catch: java.lang.Throwable -> Ld4
        L72:
            int r7 = r2.length     // Catch: java.lang.Throwable -> Ld4
            if (r4 >= r7) goto L80
            r7 = r2[r4]     // Catch: java.lang.Throwable -> Ld4
            int r8 = r4 * 3
            r7 = r7 ^ r8
            byte r7 = (byte) r7     // Catch: java.lang.Throwable -> Ld4
            r2[r4] = r7     // Catch: java.lang.Throwable -> Ld4
            int r4 = r4 + 1
            goto L72
        L80:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> Ld4
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Ld4
            r4.<init>(r2, r7)     // Catch: java.lang.Throwable -> Ld4
            l.᩵ܶ᩷ r2 = new l.᩵ܶ᩷     // Catch: java.lang.Throwable -> Ld4
            java.util.HashMap r7 = l.C4210.m12702(r4)     // Catch: java.lang.Throwable -> Ld4
            r2.<init>(r7)     // Catch: java.lang.Throwable -> Ld4
            l.C19554.f63217 = r2     // Catch: java.lang.Throwable -> Ld4
            long r7 = l.C1294.m4371()     // Catch: java.lang.Throwable -> Ld4
            long r7 = r7 / r5
            int r5 = (int) r7     // Catch: java.lang.Throwable -> Ld4
            l.C19554.f63219 = r5     // Catch: java.lang.Throwable -> Ld4
            l.۫ۤۡ r5 = l.ApplicationC20075.f65008     // Catch: java.lang.Throwable -> Ld4
            l.۬ۤۡ r5 = l.C1294.m4377(r5)     // Catch: java.lang.Throwable -> Ld4
            short[] r6 = l.C19554.f63220     // Catch: java.lang.Throwable -> Ld4
            r7 = 138(0x8a, float:1.93E-43)
            r8 = 18
            java.lang.String r6 = l.C1773.m5917(r6, r7, r8, r1)     // Catch: java.lang.Throwable -> Ld4
            l.۬ۤۡ r4 = l.C3683.m11223(r5, r6, r4)     // Catch: java.lang.Throwable -> Ld4
            short[] r5 = l.C19554.f63220     // Catch: java.lang.Throwable -> Ld4
            r6 = 156(0x9c, float:2.19E-43)
            r7 = 21
            java.lang.String r5 = l.C7106.m19110(r5, r6, r7, r1)     // Catch: java.lang.Throwable -> Ld4
            l.۬ۤۡ r3 = r4.mo25853(r3, r5)     // Catch: java.lang.Throwable -> Ld4
            short[] r4 = l.C19554.f63220     // Catch: java.lang.Throwable -> Ld4
            r5 = 177(0xb1, float:2.48E-43)
            r6 = 18
            java.lang.String r1 = l.C0630.m2575(r4, r5, r6, r1)     // Catch: java.lang.Throwable -> Ld4
            int r4 = l.C19554.f63219     // Catch: java.lang.Throwable -> Ld4
            l.۬ۤۡ r1 = r3.mo25853(r4, r1)     // Catch: java.lang.Throwable -> Ld4
            l.C7106.m19107(r1)     // Catch: java.lang.Throwable -> Ld4
            m44965(r2)     // Catch: java.lang.Throwable -> Ld4
            monitor-exit(r0)
            return
        Ld4:
            monitor-exit(r0)
            return
        Ld6:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld6
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19554.m44966():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a1, code lost:
    
        if (l.C1916.f6442 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e3, code lost:
    
        if (l.C0630.f2410 <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x022c, code lost:
    
        if (l.C3746.f11829 > 0) goto L63;
     */
    static {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19554.<clinit>():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44964() {
        long j = 0;
        ExecutorService executorService = null;
        int i = 2014933277;
        int i2 = C2958.f9394;
        int i3 = C4075.f12947;
        int m6981 = C2105.m6981("᩻۬") ^ i2;
        int i4 = ((m6981 ^ i3) * (-11647)) ^ 1163650636;
        int i5 = -1582316049;
        while (true) {
            i = ((((i ^ i3) * (-7313)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2127468663:
                case 199718461:
                    if (C0483.m2121()) {
                        m6981 = C2105.m6981("ܽ֡") ^ i3;
                        i4 = ((m6981 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    } else {
                        m6981 = C0630.m2566("᩹ᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    }
                case -1978888479:
                case -937009419:
                    f63218 = j;
                    executorService = C1802.f6208;
                    if (C5695.f17556 >= 0) {
                        m6981 = C2105.m6981("᩹ۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * 4149) ^ (-886140703);
                        i5 = 579734968;
                    } else {
                        m6981 = C0630.m2566("ۜᩴ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-465)) ^ (-270385800);
                        i5 = 780324408;
                    }
                case -1931771146:
                case 1797744755:
                    if (C11340.f33930 >= 0) {
                        m6981 = C2105.m6981("ܽ֡") ^ i3;
                        i4 = ((m6981 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    } else {
                        m6981 = (C2105.m6981("ۘۖ") + i3) * 43;
                        i4 = ((m6981 ^ i2) * (-26575)) ^ 1462338538;
                        i5 = -1262886862;
                    }
                case -1726453424:
                case -1287073147:
                    RunnableC1937.m6387();
                    if (C4075.m12263() <= 0) {
                        m6981 = C2105.m6981("ܽ֡") ^ i3;
                        i4 = ((m6981 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    } else {
                        m6981 = (i2 - C0630.m2566("֨ܿ")) * 81;
                        i4 = ((m6981 ^ i3) * 1445) ^ 1586576780;
                        i5 = 251397001;
                    }
                case -1634913892:
                case 536453187:
                    C3663.m11168();
                    C7811.m20844();
                    break;
                case -1242057067:
                case -676336559:
                    C0237.m1481();
                    if (C4263.f13799 > 0) {
                        m6981 = (i2 - C0630.m2566("֨ܿ")) * 81;
                        i4 = ((m6981 ^ i3) * 1445) ^ 1586576780;
                        i5 = 251397001;
                    } else {
                        m6981 = (i3 - C0630.m2566("ᩳ᩷")) * 61;
                        i4 = ((m6981 ^ i2) * 6213) ^ 417302122;
                        i5 = -811515871;
                    }
                case -1171678350:
                case 841258781:
                    C1047.m3599();
                    C2958.m9034();
                    m6981 = C2105.m6981("ܽ֡") ^ i3;
                    i4 = ((m6981 ^ i2) * 21197) ^ (-872424752);
                    i5 = 383174208;
                case -610206793:
                case 582368054:
                    int i6 = 0;
                    if (!C2126.m7040()) {
                        C0630.m2560(executorService, new RunnableC18848(i6));
                        break;
                    }
                    m6981 = C2105.m6981("ܽ֡") ^ i3;
                    i4 = ((m6981 ^ i2) * 21197) ^ (-872424752);
                    i5 = 383174208;
                case -250396748:
                case 228677901:
                    if (RunnableC1937.m6387() != 0) {
                        m6981 = (i2 - C0630.m2566("֨ܿ")) * 81;
                        i4 = ((m6981 ^ i3) * 1445) ^ 1586576780;
                        i5 = 251397001;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۘܽ")) * 41;
                        i4 = ((m6981 ^ i2) * (-23631)) ^ 2064914156;
                        i5 = -1548281379;
                    }
                case -180710964:
                case 1847306896:
                    if (C1773.m5908() <= 0) {
                        m6981 = C2105.m6981("ܽ֡") ^ i3;
                        i4 = ((m6981 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    } else {
                        m6981 = C0630.m2566("ܿܺ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-16407)) ^ (-1995762639);
                        i5 = 75527413;
                    }
                case 390494838:
                case 1355315766:
                    if (C2520.m8026()) {
                        m6981 = C0630.m2566("᩹ᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    } else {
                        m6981 = (C2105.m6981("ᩴ᩶") + i3) * (-91);
                        i4 = ((m6981 ^ i2) * (-22749)) ^ (-1263744092);
                        i5 = -1360240125;
                    }
                case 556153983:
                case 1405691840:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = C0630.m2566("᩹ᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    } else {
                        m6981 = C2105.m6981("᩸ܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-9747)) ^ 933603714;
                        i5 = -496526556;
                    }
                case 845355387:
                case 1418601641:
                    f63219 = 0;
                    if (C1128.f4106 <= 0) {
                        m6981 = C2105.m6981("ܽ֡") ^ i3;
                        i4 = ((m6981 ^ i2) * 21197) ^ (-872424752);
                        i5 = 383174208;
                    } else {
                        m6981 = (C0630.m2566("ᩴۘ") ^ i2) * (-75);
                        i4 = ((m6981 ^ i3) * (-8625)) ^ (-1814717755);
                        i5 = 1091081439;
                    }
                case 944722790:
                case 1975886262:
                    j = 0;
                    if (C11340.f33930 >= 0) {
                        m6981 = C0630.m2566("᩹ᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    } else {
                        m6981 = C0630.m2566("ۢ᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * (-26791)) ^ (-1389138392);
                        i5 = 1023699889;
                    }
                default:
                    if (C2272.f7362) {
                        m6981 = C0630.m2566("᩹ᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 10759) ^ 171068;
                        i5 = 846316976;
                    } else {
                        m6981 = C2105.m6981("ۚ᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * 7113) ^ (-1213760627);
                        i5 = -125604543;
                    }
            }
            return;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C19554 m44967() {
        return f63217;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m44968(String str, String str2) {
        String str3 = null;
        int i = 1334550467;
        int i2 = C0483.f2088;
        int i3 = C1047.f3863;
        int m6981 = (i3 - C2105.m6981("᩷ۛ")) * (-97);
        int i4 = ((m6981 ^ i2) * 27675) ^ 906618302;
        int i5 = 1947143202;
        while (true) {
            i = ((((i ^ i2) * 25563) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2079582643:
                case -1994509252:
                    if (C4117.m12364() != 0) {
                        m6981 = (C2105.m6981("ۨ᩻") ^ i3) * 31;
                        i4 = ((m6981 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    } else {
                        m6981 = C2105.m6981("ۢ֫") ^ i2;
                        i4 = ((m6981 ^ i3) * 493) ^ 1470346728;
                        i5 = 110158901;
                    }
                case -1833320950:
                case 258117633:
                    C2272.m7503();
                    return null;
                case -1721748199:
                case -1719657068:
                    if (C3911.f12484 >= 0) {
                        m6981 = C2105.m6981("ۙۘ") ^ i2;
                        i4 = ((m6981 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    } else {
                        m6981 = (C0630.m2566("֫ᩴ") + i3) * 43;
                        i4 = ((m6981 ^ i2) * (-5155)) ^ 340819339;
                        i5 = 1781410111;
                    }
                case -1679618923:
                case -59708520:
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = C0630.m2566("ۖᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * 31051) ^ 1957094792;
                        i5 = -897576261;
                    } else {
                        m6981 = C2105.m6981("ܺᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 8499) ^ 971901252;
                        i5 = 351855236;
                    }
                case -1453001543:
                case 1671365091:
                    if (C4263.f13799 <= 0) {
                        m6981 = (C2105.m6981("ۨ᩻") ^ i3) * 31;
                        i4 = ((m6981 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    } else {
                        m6981 = C2105.m6981("ᩴܶ") ^ i2;
                        i4 = ((m6981 ^ i3) * 21707) ^ (-762713912);
                        i5 = 716322897;
                    }
                case -1429921919:
                case -1063606738:
                    if (C0714.m2805()) {
                        m6981 = C2105.m6981("ۙۘ") ^ i2;
                        i4 = ((m6981 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    } else {
                        m6981 = (C2105.m6981("ۚ۟") ^ i3) * (-81);
                        i4 = ((m6981 ^ i2) * 31839) ^ 1801022843;
                        i5 = -431504612;
                    }
                case -1192080230:
                case 1793261531:
                    return str2;
                case -1070906816:
                case -760480658:
                    C1916.m6308();
                    C0237.m1481();
                    m6981 = (C2105.m6981("ۨ᩻") ^ i3) * 31;
                    i4 = ((m6981 ^ i2) * 24079) ^ (-981105408);
                    i5 = -1289980084;
                case -949350150:
                case -628721912:
                    if (C4263.f13799 <= 0) {
                        m6981 = (C2105.m6981("ۨ᩻") ^ i3) * 31;
                        i4 = ((m6981 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    } else {
                        m6981 = C2105.m6981("ۙۘ") ^ i2;
                        i4 = ((m6981 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    }
                case -642553537:
                case 341146224:
                    if (C1711.f5919) {
                        m6981 = (C2105.m6981("ۨ᩻") ^ i3) * 31;
                        i4 = ((m6981 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    } else {
                        m6981 = C0630.m2566("۠۟") ^ i2;
                        i4 = ((m6981 ^ i3) * (-6871)) ^ (-608750045);
                        i5 = -140926569;
                    }
                case -601008819:
                case -79213940:
                    return str3;
                case -174959344:
                case 1767639648:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = (C2105.m6981("ۨ᩻") ^ i3) * 31;
                        i4 = ((m6981 ^ i2) * 24079) ^ (-981105408);
                        i5 = -1289980084;
                    } else {
                        m6981 = (C0630.m2566("᩶᩵") ^ i3) * 67;
                        i4 = ((m6981 ^ i2) * (-21009)) ^ 2017660062;
                        i5 = -2092380337;
                    }
                case 62474955:
                case 102788346:
                    if (C1916.f6442) {
                        m6981 = (i2 - C2105.m6981("ۨۙ")) * 79;
                        i4 = ((m6981 ^ i3) * 7963) ^ (-1026526929);
                        i5 = -2083111268;
                    } else {
                        m6981 = C0630.m2566("ۖᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * 31051) ^ 1957094792;
                        i5 = -897576261;
                    }
                case 313551833:
                case 1546939215:
                    if (C11340.f33930 >= 0) {
                        m6981 = (C2105.m6981("ۚ۟") ^ i3) * (-81);
                        i4 = ((m6981 ^ i2) * 31839) ^ 1801022843;
                        i5 = -431504612;
                    } else {
                        m6981 = C2105.m6981("ᩳۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * 22113) ^ (-2137652237);
                        i5 = 592480079;
                    }
                case 360557144:
                case 1994145487:
                    if (C1420.f5096 <= 0) {
                        m6981 = C2105.m6981("ۙۘ") ^ i2;
                        i4 = ((m6981 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    } else {
                        m6981 = C0630.m2566("۠ᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-6975)) ^ 199695752;
                        i5 = -1899913167;
                    }
                case 597714784:
                case 1484087826:
                    str3 = (String) this.f63221.get(str);
                    if (str3 == null) {
                        m6981 = C0630.m2566("ۜܰ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-10703)) ^ 1829155615;
                        i5 = 1741799757;
                    } else {
                        m6981 = (C0630.m2566("ܽۢ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((m6981 ^ i2) * 21477) ^ 1438407146;
                        i5 = 34583425;
                    }
                case 1207499148:
                case 1309679160:
                    C1711.m5736();
                    if (C0483.f2088 < 0) {
                        m6981 = C2105.m6981("ۙۘ") ^ i2;
                        i4 = ((m6981 ^ i3) * 6595) ^ (-1098063823);
                        i5 = 520671068;
                    } else {
                        m6981 = (C0630.m2566("ۜ᩶") + i2) * 115;
                        i4 = ((m6981 ^ i3) * (-10245)) ^ (-2614923);
                        i5 = -1752296570;
                    }
                default:
                    if (C2272.f7362) {
                        m6981 = (C2105.m6981("ۚ۟") ^ i3) * (-81);
                        i4 = ((m6981 ^ i2) * 31839) ^ 1801022843;
                        i5 = -431504612;
                    } else {
                        m6981 = C0630.m2566("ܿ᩷") ^ i3;
                        i4 = ((m6981 ^ i2) * (-23503)) ^ (-1331441339);
                        i5 = -1744481239;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44969(String str) {
        String str2;
        int i;
        int m6981;
        int i2;
        int i3;
        int m69812;
        int i4;
        int i5;
        String str3 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        short s3 = 0;
        int i7 = 0;
        short[] sArr2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 237599609;
        int i11 = C1294.f4556;
        int i12 = C3245.f10203;
        int m69813 = (i11 - C2105.m6981("ܶۙ")) * (-33);
        int i13 = ((m69813 ^ i12) * (-4437)) ^ (-1331930192);
        int i14 = 1285345185;
        while (true) {
            int i15 = m69813 ^ i14;
            while (true) {
                i10 = ((((i10 ^ i12) * (-13673)) >> 31) & i13) ^ i15;
                switch (i10) {
                    case -2060801251:
                    case -883975660:
                        str2 = str3;
                        i = i7;
                        s = sArr[c];
                        s2 = 818;
                        if (C2520.f8000 >= 0) {
                            m6981 = (i12 - C2105.m6981("᩻ۨ")) * (-53);
                            i2 = ((m6981 ^ i11) * (-3555)) ^ (-846817390);
                            i3 = -428108698;
                        } else {
                            m6981 = (i11 - C0630.m2566("ۤ۬")) * (-87);
                            i2 = ((m6981 ^ i12) * (-4749)) ^ (-1660116258);
                            i3 = 243471526;
                        }
                        i15 = m6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                    case -1965679299:
                    case 1275689162:
                        str2 = str3;
                        i = i7;
                        int i16 = s + s2;
                        i6 = i16 * i16;
                        if (C7811.f24123 < 0) {
                            m6981 = C2105.m6981("᩹ۜ") ^ i12;
                            i2 = ((m6981 ^ i11) * 32325) ^ (-445296968);
                            i3 = 836927382;
                            i15 = m6981 ^ i3;
                            i13 = i2;
                            i7 = i;
                            str3 = str2;
                        }
                        m6981 = (C0630.m2566("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((m6981 ^ i12) * 18421) ^ (-288905791);
                        i3 = -2068752750;
                        i15 = m6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                    case -1947627135:
                    case 1150230228:
                        str2 = str3;
                        i = i7;
                        if ((s * s3) - i6 <= 0) {
                            m6981 = C0630.m2566("ܶۖ") ^ i11;
                            i2 = ((m6981 ^ i12) * 20355) ^ (-900143219);
                            i3 = -451728334;
                        } else {
                            m6981 = (C0630.m2566("᩷ܽ") ^ i12) * (-3);
                            i2 = ((m6981 ^ i11) * 28553) ^ (-650132433);
                            i3 = -861836686;
                        }
                        i15 = m6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                    case -1942590636:
                    case 446975111:
                        RunnableC3474.m10630();
                        C1711.m5736();
                        break;
                    case -1861744184:
                    case -1693061462:
                        str2 = str3;
                        i = i7;
                        if (C3019.f9544 < 0) {
                            m6981 = (i12 - C2105.m6981("ۡܽ")) * (-113);
                            i2 = ((m6981 ^ i11) * (-267)) ^ 1360245520;
                            i3 = -402085394;
                            i15 = m6981 ^ i3;
                            i13 = i2;
                            i7 = i;
                            str3 = str2;
                        }
                        m6981 = (i11 - C0630.m2566("֫ܶ")) * 115;
                        i2 = ((m6981 ^ i12) * (-28549)) ^ (-134034285);
                        i3 = 36178848;
                        i15 = m6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                    case -1564499360:
                    case 95024459:
                        if (C3746.f11829 > 0) {
                            break;
                        }
                        str2 = str3;
                        i = i7;
                        m6981 = (C0630.m2566("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((m6981 ^ i12) * 18421) ^ (-288905791);
                        i3 = -2068752750;
                        i15 = m6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                    case -1509186939:
                    case 323710509:
                        str2 = str3;
                        i = i7;
                        if (C5695.f17556 < 0) {
                            m6981 = (i11 - C0630.m2566("᩹֫")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i2 = ((m6981 ^ i12) * (-8523)) ^ (-2110665033);
                            i3 = -629259165;
                            i15 = m6981 ^ i3;
                            i13 = i2;
                            i7 = i;
                            str3 = str2;
                        }
                        m6981 = C2105.m6981("ᩴۘ") ^ i12;
                        i2 = ((m6981 ^ i11) * 12343) ^ 2098780210;
                        i3 = 954084875;
                        i15 = m6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                    case -1403881938:
                    case -17793642:
                        return C2105.m6976(str3, C3746.m11357(sArr2, i8, i9, i7));
                    case -1351296005:
                    case -828454306:
                        sArr2 = f63220;
                        i8 = 196;
                        if (C3537.f11231 < 0) {
                            m69813 = C2105.m6981("ܰ۠") ^ i11;
                            i13 = ((m69813 ^ i12) * 26551) ^ (-2127198652);
                            i14 = 2021595248;
                            break;
                        }
                        str2 = str3;
                        i = i7;
                        m6981 = C2105.m6981("ᩴۘ") ^ i12;
                        i2 = ((m6981 ^ i11) * 12343) ^ 2098780210;
                        i3 = 954084875;
                        i15 = m6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                    case -1246713157:
                    case -84156469:
                        return false;
                    case -1042513382:
                    case -680047637:
                        i9 = 4;
                        if (C1916.f6442) {
                            m69813 = C2105.m6981("᩺۟") ^ i12;
                            i13 = ((m69813 ^ i11) * 28953) ^ (-771530034);
                            i14 = -1909975581;
                            break;
                        }
                        str2 = str3;
                        i = i7;
                        m6981 = (C0630.m2566("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((m6981 ^ i12) * 18421) ^ (-288905791);
                        i3 = -2068752750;
                        i15 = m6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                    case -1038455523:
                    case 1243315321:
                        i7 = 21986;
                        m69812 = C2105.m6981("ۤ᩹") ^ i11;
                        str2 = str3;
                        i4 = ((m69812 ^ i12) * (-31347)) ^ 326548803;
                        i5 = -419252655;
                        i13 = i4;
                        i15 = m69812 ^ i5;
                        str3 = str2;
                    case -947357352:
                    case -626020205:
                        if (C4117.f13076 > 0) {
                            break;
                        }
                        str2 = str3;
                        i = i7;
                        m6981 = C2105.m6981("ᩴۘ") ^ i12;
                        i2 = ((m6981 ^ i11) * 12343) ^ 2098780210;
                        i3 = 954084875;
                        i15 = m6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                    case -799205031:
                    case 593688729:
                        str2 = str3;
                        i = i7;
                        if (C0422.f1886 > 0) {
                            m6981 = C2105.m6981("ۘۨ") ^ i12;
                            i2 = ((m6981 ^ i11) * (-29671)) ^ 916739507;
                            i3 = -2072894979;
                            i15 = m6981 ^ i3;
                            i13 = i2;
                            i7 = i;
                            str3 = str2;
                        }
                        m6981 = (C0630.m2566("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((m6981 ^ i12) * 18421) ^ (-288905791);
                        i3 = -2068752750;
                        i15 = m6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                    case -691655054:
                    case 1208676463:
                        String str4 = (String) this.f63221.get(str);
                        if (str4 == null) {
                            m69812 = (i12 - C2105.m6981("۠᩵")) * 7;
                            str2 = str4;
                            i4 = ((m69812 ^ i11) * (-26829)) ^ (-943876326);
                            i5 = 196149774;
                            i13 = i4;
                            i15 = m69812 ^ i5;
                            str3 = str2;
                        } else {
                            str2 = str4;
                            m6981 = (C2105.m6981("ܺۗ") + i12) * 59;
                            i = i7;
                            i2 = ((m6981 ^ i11) * 16547) ^ 928986689;
                            i3 = 1018322617;
                            i15 = m6981 ^ i3;
                            i13 = i2;
                            i7 = i;
                            str3 = str2;
                        }
                    case -563253727:
                    case 551150906:
                        str2 = str3;
                        i = i7;
                        sArr = f63220;
                        if (C11340.f33930 < 0) {
                            m6981 = (C0630.m2566("᩹ۡ") ^ i11) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                            i2 = ((m6981 ^ i12) * 19505) ^ 1104433459;
                            i3 = 1457843626;
                            i15 = m6981 ^ i3;
                            i13 = i2;
                            i7 = i;
                            str3 = str2;
                        }
                        m6981 = C2105.m6981("ᩴۘ") ^ i12;
                        i2 = ((m6981 ^ i11) * 12343) ^ 2098780210;
                        i3 = 954084875;
                        i15 = m6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                    case 328735869:
                    case 1405439493:
                        str2 = str3;
                        i = i7;
                        s3 = 3272;
                        if (C0964.f3626 == 0) {
                            m6981 = (i11 - C2105.m6981("ᩴ᩸")) * 73;
                            i2 = ((m6981 ^ i12) * (-29229)) ^ 1913632704;
                            i3 = 1667440414;
                            i15 = m6981 ^ i3;
                            i13 = i2;
                            i7 = i;
                            str3 = str2;
                        }
                        m6981 = C2105.m6981("ᩴۘ") ^ i12;
                        i2 = ((m6981 ^ i11) * 12343) ^ 2098780210;
                        i3 = 954084875;
                        i15 = m6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                    case 1006077839:
                    case 1099381479:
                        AbstractC2021.m6574();
                        if (!C2520.m8026()) {
                            str2 = str3;
                            i = i7;
                            m6981 = (i11 - C0630.m2566("֫ܶ")) * 115;
                            i2 = ((m6981 ^ i12) * (-28549)) ^ (-134034285);
                            i3 = 36178848;
                            i15 = m6981 ^ i3;
                            i13 = i2;
                            i7 = i;
                            str3 = str2;
                        }
                        str2 = str3;
                        i = i7;
                        m6981 = (C0630.m2566("ۚۙ") + i11) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i2 = ((m6981 ^ i12) * 18421) ^ (-288905791);
                        i3 = -2068752750;
                        i15 = m6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                    case 1060256048:
                    case 1930874896:
                        C3432.m10477();
                        return false;
                    case 1412546276:
                    case 1582477550:
                        i7 = 42133;
                        m69812 = C2105.m6981("ۤ᩹") ^ i11;
                        str2 = str3;
                        i4 = ((m69812 ^ i12) * (-31347)) ^ 326548803;
                        i5 = -419252655;
                        i13 = i4;
                        i15 = m69812 ^ i5;
                        str3 = str2;
                    default:
                        str2 = str3;
                        i = i7;
                        c = 195;
                        if (C7106.m19120() > 0) {
                            m6981 = C0630.m2566("ۜۢ") ^ i12;
                            i2 = ((m6981 ^ i11) * 7831) ^ (-59311046);
                            i3 = -1487722253;
                            i15 = m6981 ^ i3;
                            i13 = i2;
                            i7 = i;
                            str3 = str2;
                        }
                        m6981 = (i11 - C0630.m2566("֫ܶ")) * 115;
                        i2 = ((m6981 ^ i12) * (-28549)) ^ (-134034285);
                        i3 = 36178848;
                        i15 = m6981 ^ i3;
                        i13 = i2;
                        i7 = i;
                        str3 = str2;
                }
            }
            m69813 = (C0630.m2566("᩶ۙ") ^ i11) * 5;
            i13 = ((m69813 ^ i12) * (-5685)) ^ 72363232;
            i14 = 1410070552;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44965(C19554 c19554) {
        int m2566;
        int i;
        int i2;
        String[] strArr;
        int i3;
        int m25662;
        int i4;
        int i5;
        int i6;
        int i7;
        int m6981;
        int i8;
        String[] strArr2;
        String str = null;
        String[] strArr3 = null;
        int i9 = 0;
        int i10 = 0;
        C15587 c15587 = null;
        boolean z = false;
        int i11 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i12 = 0;
        int i13 = 0;
        short s2 = 0;
        int i14 = 0;
        int i15 = 570689790;
        int i16 = C11340.f33930;
        int i17 = C4263.f13799;
        int m69812 = C2105.m6981("ܳۚ") ^ i17;
        int i18 = ((m69812 ^ i16) * (-9213)) ^ (-1342039197);
        int i19 = m69812 ^ (-2101295017);
        RunnableC15758 runnableC15758 = null;
        int i20 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i16) * 21969) >> 31));
            switch (i15) {
                case -2089299836:
                case 936344666:
                    if (C1504.f5354) {
                        strArr = strArr3;
                        i3 = i9;
                        m25662 = C2105.m6981("ۗ۬") ^ i17;
                        i4 = ((m25662 ^ i16) * (-30583)) ^ 329482528;
                        i5 = -539050919;
                        i6 = m25662 ^ i5;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    }
                    strArr = strArr3;
                    i3 = i9;
                    m25662 = C2105.m6981("۠ۢ") ^ i16;
                    i4 = ((m25662 ^ i17) * (-15547)) ^ (-1448807097);
                    i5 = -1836211981;
                    i6 = m25662 ^ i5;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case -2055735760:
                case -589466164:
                    if (RunnableC3474.f10992 <= 0) {
                        m2566 = C2105.m6981("֫۫") ^ i16;
                        i = ((m2566 ^ i17) * 30205) ^ 550602314;
                        i2 = -333970897;
                        i19 = m2566 ^ i2;
                        i18 = i;
                    }
                    m2566 = C0630.m2566("ۤۚ") ^ i17;
                    i = ((m2566 ^ i16) * 14341) ^ 2026859508;
                    i2 = 1651985461;
                    i19 = m2566 ^ i2;
                    i18 = i;
                case -1959031783:
                case -328338485:
                    C1128.m3851();
                    if (C3245.m9925() != 0) {
                        m2566 = C2105.m6981("ۨ֡") ^ i17;
                        i = ((m2566 ^ i16) * (-21457)) ^ (-964758332);
                        i2 = 780402907;
                        i19 = m2566 ^ i2;
                        i18 = i;
                    } else {
                        strArr = strArr3;
                        i3 = i9;
                        m25662 = C2105.m6981("᩹ۘ") ^ i17;
                        i4 = ((m25662 ^ i16) * 23115) ^ (-1363884123);
                        i5 = -394106981;
                        i6 = m25662 ^ i5;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    }
                case -1934633058:
                case -1416134982:
                    if (C11340.f33930 >= 0) {
                        strArr = strArr3;
                        i3 = i9;
                        m25662 = C2105.m6981("۠ۢ") ^ i16;
                        i4 = ((m25662 ^ i17) * (-15547)) ^ (-1448807097);
                        i5 = -1836211981;
                        i6 = m25662 ^ i5;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    } else {
                        m2566 = C2105.m6981("ۨ֡") ^ i17;
                        i = ((m2566 ^ i16) * (-21457)) ^ (-964758332);
                        i2 = 780402907;
                        i19 = m2566 ^ i2;
                        i18 = i;
                    }
                case -1896378385:
                case -15144658:
                    if (z) {
                        m2566 = C0630.m2566("᩻֨") ^ i17;
                        i = ((m2566 ^ i16) * (-27673)) ^ 422349576;
                        i2 = -1620710817;
                        i19 = m2566 ^ i2;
                        i18 = i;
                    } else {
                        strArr = strArr3;
                        i3 = i9;
                        i11 = i20;
                        m6981 = C0630.m2566("۠᩷") ^ i16;
                        i4 = ((m6981 ^ i17) * (-29193)) ^ (-689790214);
                        i8 = -1243159260;
                        i6 = m6981 ^ i8;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    }
                case -1813005619:
                case -343781500:
                    RunnableC3474.m10630();
                    if (C7106.f21815 == 0) {
                        strArr = strArr3;
                        i3 = i9;
                        m25662 = C2105.m6981("۠ۢ") ^ i16;
                        i4 = ((m25662 ^ i17) * (-15547)) ^ (-1448807097);
                        i5 = -1836211981;
                        i6 = m25662 ^ i5;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    } else {
                        m2566 = C0630.m2566("ۤۚ") ^ i17;
                        i = ((m2566 ^ i16) * 14341) ^ 2026859508;
                        i2 = 1651985461;
                        i19 = m2566 ^ i2;
                        i18 = i;
                    }
                case -1790835447:
                case 1339518022:
                    strArr = strArr3;
                    i3 = i9;
                    s2 = 2516;
                    if (C1128.f4106 > 0) {
                        m25662 = C0630.m2566("ܳ᩷") ^ i16;
                        i4 = ((m25662 ^ i17) * (-2403)) ^ 24517666;
                        i5 = 366292576;
                        i6 = m25662 ^ i5;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    }
                    m25662 = C2105.m6981("ۗ۬") ^ i17;
                    i4 = ((m25662 ^ i16) * (-30583)) ^ 329482528;
                    i5 = -539050919;
                    i6 = m25662 ^ i5;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case -1672793328:
                case 1640770959:
                    if (i11 < i10) {
                        m2566 = C2105.m6981("ܳۢ") ^ i16;
                        i = ((m2566 ^ i17) * 12529) ^ 1497967914;
                        i2 = 366590948;
                        i19 = m2566 ^ i2;
                        i18 = i;
                    } else {
                        i3 = i9;
                        int m69813 = (i17 - C2105.m6981("ۨ۠")) * (-39);
                        i19 = m69813 ^ (-445613752);
                        i18 = ((m69813 ^ i16) * 12211) ^ 1185305548;
                        i9 = i3;
                    }
                case -1632889163:
                case 295181970:
                    strArr3 = C1294.m4374(C4159.m12570(str), C0964.m3396(f63220, 54, 2, i14));
                    i9 = 0;
                    try {
                        i10 = RunnableC3474.m10632(strArr3[0]);
                        m2566 = (C2105.m6981("᩷۫") ^ i17) * (-73);
                        i = ((m2566 ^ i16) * 891) ^ 178379361;
                        i2 = 954992688;
                        i19 = m2566 ^ i2;
                        i18 = i;
                    } catch (Exception unused) {
                        i3 = 0;
                        break;
                    }
                case -1600033648:
                case 775817861:
                    strArr = strArr3;
                    i3 = i9;
                    int i21 = 1;
                    if (!C0798.f2919) {
                        RunnableC15758 runnableC157582 = new RunnableC15758(i21);
                        if (RunnableC0588.f2309 >= 0) {
                            runnableC15758 = runnableC157582;
                            m25662 = C2105.m6981("۠ۢ") ^ i16;
                            i4 = ((m25662 ^ i17) * (-15547)) ^ (-1448807097);
                            i5 = -1836211981;
                            i6 = m25662 ^ i5;
                            i9 = i3;
                            strArr2 = strArr;
                            i19 = i6;
                            i18 = i4;
                            strArr3 = strArr2;
                        } else {
                            int m25663 = (C0630.m2566("᩸ۘ") ^ i17) * (-33);
                            int i22 = ((m25663 ^ i16) * (-15207)) ^ (-2116316517);
                            i7 = m25663 ^ 637008391;
                            runnableC15758 = runnableC157582;
                            i18 = i22;
                            i9 = i3;
                            strArr2 = strArr;
                            i19 = i7;
                            strArr3 = strArr2;
                        }
                    }
                    int m25664 = (i16 - C0630.m2566("ۚ۬")) * (-43);
                    i4 = ((m25664 ^ i17) * (-1441)) ^ 1837919746;
                    i6 = m25664 ^ (-775952340);
                    i9 = i3;
                    runnableC15758 = null;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case -1475273328:
                case -485437219:
                    strArr = strArr3;
                    i3 = i9;
                    if (str == null) {
                        strArr3 = strArr;
                        int m698132 = (i17 - C2105.m6981("ۨ۠")) * (-39);
                        i19 = m698132 ^ (-445613752);
                        i18 = ((m698132 ^ i16) * 12211) ^ 1185305548;
                        i9 = i3;
                    } else {
                        m6981 = C2105.m6981("᩺۟") ^ i17;
                        i4 = ((m6981 ^ i16) * (-23425)) ^ (-1242689816);
                        i8 = 633801759;
                        i6 = m6981 ^ i8;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    }
                case -1422198278:
                case 273359869:
                    try {
                        i11 = C2520.m8022(c15587.m36528());
                        strArr = strArr3;
                        i3 = i9;
                    } catch (Exception unused2) {
                        break;
                    }
                    m6981 = C0630.m2566("۠᩷") ^ i16;
                    i4 = ((m6981 ^ i17) * (-29193)) ^ (-689790214);
                    i8 = -1243159260;
                    i6 = m6981 ^ i8;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case -1384881050:
                case 877586494:
                    strArr = strArr3;
                    i3 = i9;
                    s = sArr[c];
                    i12 = s * s;
                    if (C3019.m9255() > 0) {
                        m25662 = (C2105.m6981("ۜܳ") ^ i17) * 11;
                        i4 = ((m25662 ^ i16) * (-25829)) ^ (-1538965610);
                        i5 = -530570480;
                        i6 = m25662 ^ i5;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    }
                    m25662 = C2105.m6981("᩺ۙ") ^ i16;
                    i4 = ((m25662 ^ i17) * (-15999)) ^ 632601049;
                    i5 = 944041832;
                    i6 = m25662 ^ i5;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case -1340388053:
                case 793461587:
                    try {
                        try {
                            strArr = strArr3;
                            i3 = i9;
                            try {
                                c15587 = C3663.m11176(C16293.f50117, C1128.m3841(f63220, 56, 21, i14)).m36534();
                                try {
                                    z = C3245.m9926(c15587);
                                    m6981 = C0630.m2566("᩹ۡ") ^ i17;
                                    i4 = ((m6981 ^ i16) * 16321) ^ 1633790045;
                                    i8 = -884474994;
                                } catch (Exception unused3) {
                                    break;
                                }
                                i6 = m6981 ^ i8;
                                i9 = i3;
                                strArr2 = strArr;
                                i19 = i6;
                                i18 = i4;
                                strArr3 = strArr2;
                            } catch (Exception unused4) {
                                break;
                            }
                        } catch (Exception unused5) {
                            strArr = strArr3;
                            i3 = i9;
                            break;
                        }
                    } catch (Exception unused6) {
                        break;
                    }
                case -1231288456:
                case -295956446:
                    strArr = strArr3;
                    i3 = i9;
                    sArr = f63220;
                    if (!C2126.f7087) {
                        m25662 = C0630.m2566("ܿ۬") ^ i16;
                        i4 = ((m25662 ^ i17) * (-4589)) ^ 1366916225;
                        i5 = -1094441841;
                        i6 = m25662 ^ i5;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    }
                    m25662 = C2105.m6981("ܳܰ") ^ i16;
                    i4 = ((m25662 ^ i17) * 14587) ^ (-1545790643);
                    i5 = -471483077;
                    i6 = m25662 ^ i5;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case -1057697948:
                case 1185373133:
                    C0798.m2998();
                    break;
                case -1041007913:
                case 63948438:
                    try {
                        C2105.m6975(C1802.f6208, new RunnableC11542(i10, i9, strArr3));
                    } catch (Exception unused7) {
                    }
                    i3 = i9;
                    int m6981322 = (i17 - C2105.m6981("ۨ۠")) * (-39);
                    i19 = m6981322 ^ (-445613752);
                    i18 = ((m6981322 ^ i16) * 12211) ^ 1185305548;
                    i9 = i3;
                case -1040191240:
                case -1010767318:
                    strArr = strArr3;
                    i3 = i9;
                    if ((s * s2) - i13 <= 0) {
                        m25662 = (C0630.m2566("ۚ᩵") + i17) * 85;
                        i4 = ((m25662 ^ i16) * (-23291)) ^ (-646936767);
                        i5 = 740823200;
                    } else {
                        m25662 = (C2105.m6981("ᩴܽ") + i16) * 59;
                        i4 = ((m25662 ^ i17) * (-9893)) ^ (-136337162);
                        i5 = 988089396;
                    }
                    i6 = m25662 ^ i5;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case -979120373:
                case 1560480177:
                    strArr = strArr3;
                    i3 = i9;
                    if (C2105.m6982() == 0) {
                        m25662 = (C0630.m2566("᩻۫") ^ i17) * 75;
                        i4 = ((m25662 ^ i16) * (-30415)) ^ (-94811861);
                        i5 = -1453953387;
                        i6 = m25662 ^ i5;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    }
                    m25662 = C2105.m6981("۠ۢ") ^ i16;
                    i4 = ((m25662 ^ i17) * (-15547)) ^ (-1448807097);
                    i5 = -1836211981;
                    i6 = m25662 ^ i5;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case -887494403:
                case 672117396:
                    strArr = strArr3;
                    i3 = i9;
                    if (i10 <= 14) {
                        i20 = 14;
                        strArr3 = strArr;
                        int m69813222 = (i17 - C2105.m6981("ۨ۠")) * (-39);
                        i19 = m69813222 ^ (-445613752);
                        i18 = ((m69813222 ^ i16) * 12211) ^ 1185305548;
                        i9 = i3;
                    } else {
                        int m69814 = C2105.m6981("ܳ۬") ^ i16;
                        int i23 = ((m69814 ^ i17) * 20967) ^ (-1243115837);
                        i7 = m69814 ^ (-77495690);
                        i18 = i23;
                        i9 = i3;
                        i20 = 14;
                        strArr2 = strArr;
                        i19 = i7;
                        strArr3 = strArr2;
                    }
                case -667464745:
                case -36026879:
                    strArr = strArr3;
                    i3 = i9;
                    try {
                        str = c19554.m44968(C3911.m11919(f63220, 38, 16, i14), null);
                        m25662 = C0630.m2566("ۜ۟") ^ i16;
                        i4 = ((m25662 ^ i17) * (-16853)) ^ 1541750544;
                        i5 = 926559330;
                        i6 = m25662 ^ i5;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    } catch (Exception unused8) {
                        break;
                    }
                case -604740911:
                case 1321265247:
                    strArr = strArr3;
                    i3 = i9;
                    i14 = 11377;
                    m25662 = C0630.m2566("ۡۤ") ^ i16;
                    i4 = ((m25662 ^ i17) * 677) ^ 346459494;
                    i5 = -99290726;
                    i6 = m25662 ^ i5;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case -594495341:
                case 1988438192:
                    strArr = strArr3;
                    i3 = i9;
                    i14 = 6620;
                    m25662 = C0630.m2566("ۡۤ") ^ i16;
                    i4 = ((m25662 ^ i17) * 677) ^ 346459494;
                    i5 = -99290726;
                    i6 = m25662 ^ i5;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case -543271963:
                case 1662622016:
                    strArr = strArr3;
                    i3 = i9;
                    i13 = i12 + 1582564;
                    if (RunnableC1108.f4040) {
                        m25662 = (C0630.m2566("ۧ᩷") ^ i17) * 123;
                        i4 = ((m25662 ^ i16) * (-22081)) ^ 1109477827;
                        i5 = -1109497791;
                        i6 = m25662 ^ i5;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    }
                    m25662 = C2105.m6981("ܳܰ") ^ i16;
                    i4 = ((m25662 ^ i17) * 14587) ^ (-1545790643);
                    i5 = -471483077;
                    i6 = m25662 ^ i5;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case -479781384:
                case -436363056:
                    break;
                case -24321987:
                case 1726545986:
                    strArr = strArr3;
                    i3 = i9;
                    c = '%';
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        m25662 = C0630.m2566("ۚᩳ") ^ i16;
                        i4 = ((m25662 ^ i17) * (-10433)) ^ (-1434783445);
                        i5 = 2036247939;
                        i6 = m25662 ^ i5;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    }
                    m25662 = C2105.m6981("᩺ۙ") ^ i16;
                    i4 = ((m25662 ^ i17) * (-15999)) ^ 632601049;
                    i5 = 944041832;
                    i6 = m25662 ^ i5;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case 257808413:
                case 942838707:
                    if (C3245.f10203 <= 0) {
                        m2566 = C0630.m2566("ۙܺ") ^ i17;
                        i = ((m2566 ^ i16) * (-20435)) ^ 568256117;
                        i2 = 1766326406;
                        i19 = m2566 ^ i2;
                        i18 = i;
                    }
                    m2566 = C2105.m6981("ۨ֡") ^ i17;
                    i = ((m2566 ^ i16) * (-21457)) ^ (-964758332);
                    i2 = 780402907;
                    i19 = m2566 ^ i2;
                    i18 = i;
                case 441015999:
                case 1736271296:
                    strArr = strArr3;
                    i3 = i9;
                    C0237.m1492(runnableC15758);
                    int i24 = C7017.f21654;
                    m25662 = C2105.m6981("᩵᩺") ^ i16;
                    i4 = ((m25662 ^ i17) * (-30809)) ^ 621053857;
                    i5 = 703803288;
                    i6 = m25662 ^ i5;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case 787410795:
                case 1561653807:
                    RunnableC0588.m2441();
                    if (C0964.f3626 != 0) {
                        m2566 = C0630.m2566("ۤۚ") ^ i17;
                        i = ((m2566 ^ i16) * 14341) ^ 2026859508;
                        i2 = 1651985461;
                        i19 = m2566 ^ i2;
                        i18 = i;
                    } else {
                        strArr = strArr3;
                        i3 = i9;
                        int m256642 = (i16 - C0630.m2566("ۚ۬")) * (-43);
                        i4 = ((m256642 ^ i17) * (-1441)) ^ 1837919746;
                        i6 = m256642 ^ (-775952340);
                        i9 = i3;
                        runnableC15758 = null;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    }
                case 1320376693:
                case 1445706091:
                    C4263.m12819();
                    strArr = strArr3;
                    i3 = i9;
                    m25662 = C2105.m6981("۠ۢ") ^ i16;
                    i4 = ((m25662 ^ i17) * (-15547)) ^ (-1448807097);
                    i5 = -1836211981;
                    i6 = m25662 ^ i5;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case 1443993538:
                case 1571095605:
                    strArr = strArr3;
                    i3 = i9;
                    if (C0964.f3626 == 0) {
                        m25662 = (i16 - C0630.m2566("۟ᩳ")) * 67;
                        i4 = ((m25662 ^ i17) * 25127) ^ 452462506;
                        i5 = 1131042387;
                        i6 = m25662 ^ i5;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    }
                    int m2566422 = (i16 - C0630.m2566("ۚ۬")) * (-43);
                    i4 = ((m2566422 ^ i17) * (-1441)) ^ 1837919746;
                    i6 = m2566422 ^ (-775952340);
                    i9 = i3;
                    runnableC15758 = null;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                case 1794040894:
                case 2012286180:
                    strArr = strArr3;
                    i3 = i9;
                    if (C0422.f1886 > 0) {
                        m25662 = (C0630.m2566("ۡܺ") + i17) * 5;
                        i4 = ((m25662 ^ i16) * (-3713)) ^ 2023704976;
                        i5 = 1405127655;
                        i6 = m25662 ^ i5;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    }
                    m25662 = C2105.m6981("᩹ۘ") ^ i17;
                    i4 = ((m25662 ^ i16) * 23115) ^ (-1363884123);
                    i5 = -394106981;
                    i6 = m25662 ^ i5;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
                default:
                    C2105.m6982();
                    if (C4263.f13799 > 0) {
                        strArr = strArr3;
                        i3 = i9;
                        m25662 = C2105.m6981("ܳܰ") ^ i16;
                        i4 = ((m25662 ^ i17) * 14587) ^ (-1545790643);
                        i5 = -471483077;
                        i6 = m25662 ^ i5;
                        i9 = i3;
                        strArr2 = strArr;
                        i19 = i6;
                        i18 = i4;
                        strArr3 = strArr2;
                    }
                    strArr = strArr3;
                    i3 = i9;
                    m25662 = C2105.m6981("۠ۢ") ^ i16;
                    i4 = ((m25662 ^ i17) * (-15547)) ^ (-1448807097);
                    i5 = -1836211981;
                    i6 = m25662 ^ i5;
                    i9 = i3;
                    strArr2 = strArr;
                    i19 = i6;
                    i18 = i4;
                    strArr3 = strArr2;
            }
            return;
        }
    }

    public C19554(HashMap hashMap) {
        Map map = null;
        int i = 790995826;
        int i2 = C0050.f910;
        int i3 = C1294.f4556;
        int m2566 = C0630.m2566("ۧۖ") ^ i3;
        int i4 = ((m2566 ^ i2) * 16135) ^ 221880658;
        int i5 = 477471767;
        while (true) {
            i = ((((i ^ i2) * (-13799)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2117666067:
                case 127417656:
                    C1916.m6308();
                    if (C0964.f3626 != 0) {
                        m2566 = C0630.m2566("ۢܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * 32421) ^ 2050488923;
                        i5 = -1586342211;
                    } else {
                        m2566 = (C2105.m6981("۬᩻") + i2) * 85;
                        i4 = ((m2566 ^ i3) * (-28515)) ^ (-864679283);
                        i5 = -677926189;
                    }
                case -2033858766:
                case 136874980:
                    map = Collections.EMPTY_MAP;
                    m2566 = (C0630.m2566("֨ۜ") + i2) * (-107);
                    i4 = ((m2566 ^ i3) * 28745) ^ (-259112853);
                    i5 = -2005776329;
                case -2018300055:
                case -1584037512:
                    if (C2167.m7155()) {
                        m2566 = (C2105.m6981("۬᩻") + i2) * 85;
                        i4 = ((m2566 ^ i3) * (-28515)) ^ (-864679283);
                        i5 = -677926189;
                    } else {
                        m2566 = C0630.m2566("ۛܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-19011)) ^ 752169645;
                        i5 = -1867890802;
                    }
                case -1985601131:
                case -330508438:
                    return;
                case -1588487102:
                case -156032329:
                    C1916.m6308();
                    m2566 = C0630.m2566("ۢܿ") ^ i3;
                    i4 = ((m2566 ^ i2) * 32421) ^ 2050488923;
                    i5 = -1586342211;
                case -1565008327:
                case 596640163:
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = (i3 - C0630.m2566("ᩴᩳ")) * (-27);
                        i4 = ((m2566 ^ i2) * 3155) ^ (-1910064096);
                        i5 = -1913246236;
                    } else {
                        m2566 = (i3 - C2105.m6981("᩻ۢ")) * (-3);
                        i4 = ((m2566 ^ i2) * (-5355)) ^ 232571631;
                        i5 = 1106911909;
                    }
                case -1530389447:
                case 1932050188:
                    if (C0630.f2410 <= 0) {
                        m2566 = C0630.m2566("ۢܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * 32421) ^ 2050488923;
                        i5 = -1586342211;
                    } else {
                        m2566 = (C0630.m2566("ۙܺ") + i3) * 91;
                        i4 = ((m2566 ^ i2) * 11297) ^ 600521054;
                        i5 = -1712109220;
                    }
                case -1330191467:
                case -1290423695:
                    if (C1916.m6308() >= 0) {
                        m2566 = C0630.m2566("ۢܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * 32421) ^ 2050488923;
                        i5 = -1586342211;
                    } else {
                        m2566 = C2105.m6981("ܽۖ") ^ i2;
                        i4 = ((m2566 ^ i3) * 24571) ^ 1501152944;
                        i5 = 231803711;
                    }
                case -1283600653:
                case 1148598632:
                    if (hashMap == null) {
                        m2566 = (i3 - C0630.m2566("۬ܿ")) * 75;
                        i4 = ((m2566 ^ i2) * (-14851)) ^ 1759547553;
                        i5 = -1047943430;
                    } else {
                        map = hashMap;
                        m2566 = (C0630.m2566("֨ۜ") + i2) * (-107);
                        i4 = ((m2566 ^ i3) * 28745) ^ (-259112853);
                        i5 = -2005776329;
                    }
                case -1210657096:
                case 1812986113:
                    if (C0714.f2697 >= 0) {
                        m2566 = C0630.m2566("ܽۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12415)) ^ (-2088174589);
                        i5 = -2135856884;
                    } else {
                        m2566 = C2105.m6981("ۨۗ") ^ i2;
                        i4 = ((m2566 ^ i3) * 6847) ^ 1802921452;
                        i5 = -1126680720;
                    }
                case -640534429:
                case -572010443:
                    if (C7811.f24123 >= 0) {
                        m2566 = C0630.m2566("ܽۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12415)) ^ (-2088174589);
                        i5 = -2135856884;
                    } else {
                        m2566 = (C2105.m6981("᩺ۜ") + i2) * (-115);
                        i4 = ((m2566 ^ i3) * 249) ^ 2033481325;
                        i5 = 163982364;
                    }
                case -633262087:
                case 884304177:
                    if (C7811.f24123 < 0) {
                        m2566 = C0630.m2566("ۢܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * 32421) ^ 2050488923;
                        i5 = -1586342211;
                    } else {
                        m2566 = C2105.m6981("ܺܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * 5895) ^ (-1938368778);
                        i5 = 1576298060;
                    }
                case -344353817:
                case -240634531:
                    if (C5695.m16023() >= 0) {
                        m2566 = (i3 - C0630.m2566("ᩴᩳ")) * (-27);
                        i4 = ((m2566 ^ i2) * 3155) ^ (-1910064096);
                        i5 = -1913246236;
                    } else {
                        m2566 = C0630.m2566("ۚۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29355)) ^ (-620589149);
                        i5 = 557979199;
                    }
                case -289222180:
                case 69536887:
                    this.f63221 = map;
                    if (C0483.f2088 >= 0) {
                        m2566 = C2105.m6981("ܺܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * 5895) ^ (-1938368778);
                        i5 = 1576298060;
                    } else {
                        m2566 = (C0630.m2566("᩹۟") ^ i3) * (-83);
                        i4 = ((m2566 ^ i2) * (-14939)) ^ 1698222175;
                        i5 = -1685517104;
                    }
                case -243994291:
                case -231483970:
                    if (RunnableC1108.f4040) {
                        m2566 = C0630.m2566("ۨۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * 6507) ^ (-251704503);
                        i5 = 1148320053;
                    } else {
                        m2566 = C0630.m2566("ܽۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12415)) ^ (-2088174589);
                        i5 = -2135856884;
                    }
                case 242891787:
                case 999365185:
                    C2167.m7155();
                    RunnableC3474.m10630();
                    throw new RuntimeException();
                case 664480393:
                case 1081997012:
                    if (C3245.f10203 <= 0) {
                        m2566 = C2105.m6981("ܺܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * 5895) ^ (-1938368778);
                        i5 = 1576298060;
                    } else {
                        m2566 = (C0630.m2566("ۢۢ") ^ i3) * (-27);
                        i4 = ((m2566 ^ i2) * 503) ^ (-972495938);
                        i5 = -1450391788;
                    }
                default:
                    if (C2958.f9394 < 0) {
                        m2566 = (C2105.m6981("۬᩻") + i2) * 85;
                        i4 = ((m2566 ^ i3) * (-28515)) ^ (-864679283);
                        i5 = -677926189;
                    } else {
                        m2566 = (i3 - C0630.m2566("ᩴᩳ")) * (-27);
                        i4 = ((m2566 ^ i2) * 3155) ^ (-1910064096);
                        i5 = -1913246236;
                    }
            }
        }
    }
}
