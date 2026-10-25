package l;

import android.app.Application;
import android.util.Base64;
import com.alipay.sdk.m.y.q;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import moe.shizuku.server.IShizukuService;

/* compiled from: E6NZ */
/* renamed from: l.ۜ᩵ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C6969 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f21477;

    /* renamed from: ۡ֡۫, reason: not valid java name and contains not printable characters */
    private static final short[] f21478;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f21479;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int[] f21480;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String f21481;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C23902 f21482;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f21483;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native String m18808(int[] iArr);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native C12951 m18809(C21578 c21578, int i, int[] iArr);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native void m18813(C9449 c9449, String str, boolean z);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native void m18814(C21578 c21578);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native void m18815(C21578 c21578, int i, byte[] bArr, int[] iArr);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static native synchronized void m18824(C23902 c23902);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static native synchronized String m18828();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static native int[] m18831();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static native synchronized C23902 m18832();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized void m18823() {
        short s = f21478[258];
        int i = s + 6040;
        int i2 = (s * 24160) - (i * i) <= 0 ? 3318 : 23641;
        synchronized (C6969.class) {
            m18822(RunnableC1108.m3789(f21478, 259, 4, i2)).m48737();
            f21482 = null;
            f21483 = true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18817(C23881 c23881, String str) {
        String str2 = null;
        int i = 530018869;
        int i2 = C0483.f2088;
        int i3 = AbstractC2021.f6743;
        int m2566 = (i3 - C0630.m2566("᩷ۙ")) * (-81);
        int i4 = ((m2566 ^ i2) * 6611) ^ 209966111;
        int i5 = 753413357;
        while (true) {
            i = ((((i ^ i2) * (-14163)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1949865793:
                case 705135325:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = C0630.m2566("ܽۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * 16443) ^ (-1742677436);
                        i5 = -437422219;
                    } else {
                        m2566 = C2105.m6981("ۤᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-22231)) ^ (-216867227);
                        i5 = -1377609055;
                    }
                case -1923212352:
                case -1289227909:
                    if (C1916.m6308() >= 0) {
                        m2566 = C0630.m2566("ܽۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * 16443) ^ (-1742677436);
                        i5 = -437422219;
                    } else {
                        m2566 = (i2 - C0630.m2566("ۨۙ")) * 25;
                        i4 = ((m2566 ^ i3) * (-29679)) ^ 1844097443;
                        i5 = -870582069;
                    }
                case -1664889601:
                case 1271112174:
                    m18819(c23881, str, str2, true);
                    break;
                case -1420100127:
                case -1394747283:
                    C7811.m20844();
                    if (C3537.f11231 >= 0) {
                        m2566 = C0630.m2566("֨ᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2297)) ^ (-1175116008);
                        i5 = -1027020444;
                    } else {
                        m2566 = C2105.m6981("᩸֨") ^ i3;
                        i4 = ((m2566 ^ i2) * (-23213)) ^ 128510846;
                        i5 = 1349352777;
                    }
                case -1287184440:
                case 691482694:
                    if (C7106.m19120() > 0) {
                        m2566 = C2105.m6981("᩸֨") ^ i3;
                        i4 = ((m2566 ^ i2) * (-23213)) ^ 128510846;
                        i5 = 1349352777;
                    } else {
                        m2566 = C0630.m2566("ۜ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10003)) ^ (-322499793);
                        i5 = 1954116013;
                    }
                case -1176077438:
                case 1029576601:
                    if (C0483.m2121()) {
                        m2566 = C0630.m2566("ۗ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * 25613) ^ (-51529685);
                        i5 = -1906359763;
                    } else {
                        m2566 = C0630.m2566("ۜ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10003)) ^ (-322499793);
                        i5 = 1954116013;
                    }
                case -401986513:
                case 1925250221:
                    if (C7811.f24123 >= 0) {
                        m2566 = C2105.m6981("᩸֨") ^ i3;
                        i4 = ((m2566 ^ i2) * (-23213)) ^ 128510846;
                        i5 = 1349352777;
                    } else {
                        m2566 = (i3 - C2105.m6981("ۢۧ")) * (-51);
                        i4 = ((m2566 ^ i2) * (-7747)) ^ (-862011286);
                        i5 = 253148125;
                    }
                case -150904971:
                case 201344094:
                    if (C1128.m3851() <= 0) {
                        m2566 = C0630.m2566("ۜ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10003)) ^ (-322499793);
                        i5 = 1954116013;
                    } else {
                        m2566 = (C2105.m6981("ܺۡ") + i2) * (-101);
                        i4 = ((m2566 ^ i3) * 1429) ^ (-1336134078);
                        i5 = -67361723;
                    }
                case 105261577:
                case 1032267515:
                    str2 = null;
                    if (C0630.f2410 <= 0) {
                        m2566 = C0630.m2566("᩺ۖ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-1149)) ^ (-1196920300);
                        i5 = -1145111640;
                    } else {
                        m2566 = (C2105.m6981("ۛᩳ") + i3) * 27;
                        i4 = ((m2566 ^ i2) * (-30659)) ^ (-735287677);
                        i5 = -1193960954;
                    }
                case 113559802:
                case 947151252:
                    C3245.m9925();
                    C1916.m6308();
                    m2566 = C0630.m2566("֨ᩳ") ^ i2;
                    i4 = ((m2566 ^ i3) * (-2297)) ^ (-1175116008);
                    i5 = -1027020444;
                case 134633830:
                case 2070117552:
                    if (C2520.m8026()) {
                        m2566 = C0630.m2566("᩺ۖ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-1149)) ^ (-1196920300);
                        i5 = -1145111640;
                    } else {
                        m2566 = (C0630.m2566("ܿ۟") ^ i2) * (-115);
                        i4 = ((m2566 ^ i3) * 15421) ^ 1014797016;
                        i5 = -377895517;
                    }
                case 223335403:
                case 322451096:
                    if (C3019.m9255() <= 0) {
                        m2566 = C0630.m2566("ۜ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10003)) ^ (-322499793);
                        i5 = 1954116013;
                    } else {
                        m2566 = C0630.m2566("ۤܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * 21563) ^ 160733360;
                        i5 = 2091766152;
                    }
                case 501970604:
                case 1429380793:
                    C2958.m9034();
                    C4117.m12364();
                    break;
                case 730761092:
                case 1098802504:
                    if (C3537.f11231 >= 0) {
                        m2566 = C0630.m2566("᩺ۖ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-1149)) ^ (-1196920300);
                        i5 = -1145111640;
                    } else {
                        m2566 = (C0630.m2566("ܰۘ") ^ i3) * 97;
                        i4 = ((m2566 ^ i2) * 13961) ^ 1741371811;
                        i5 = -627933675;
                    }
                case 752814613:
                case 1367133914:
                    if (C3663.m11168() >= 0) {
                        m2566 = C2105.m6981("᩸֨") ^ i3;
                        i4 = ((m2566 ^ i2) * (-23213)) ^ 128510846;
                        i5 = 1349352777;
                    } else {
                        m2566 = (C0630.m2566("ܶ᩵") ^ i3) * 33;
                        i4 = ((m2566 ^ i2) * (-23377)) ^ 1921065607;
                        i5 = 1352284492;
                    }
                default:
                    C4616.m13552();
                    if (C3537.f11231 < 0) {
                        m2566 = C0630.m2566("ۜ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10003)) ^ (-322499793);
                        i5 = 1954116013;
                    } else {
                        m2566 = C0630.m2566("ܽۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * 16443) ^ (-1742677436);
                        i5 = -437422219;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (l.C1047.f3863 >= 0) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int[], java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m18820(boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6969.m18820(boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0064, code lost:
    
        if (l.C0714.f2697 < 0) goto L10;
     */
    static {
        /*
            Method dump skipped, instructions count: 1446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6969.<clinit>():void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21578 m18822(String str) {
        int i = 1574781702;
        int i2 = C0630.f2410;
        int i3 = C1773.f6144;
        int m2566 = C0630.m2566("ۢ᩵") ^ i2;
        int i4 = ((m2566 ^ i3) * (-13295)) ^ 1413669340;
        int i5 = -349368871;
        while (true) {
            i = ((((i ^ i3) * 6777) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1417913803:
                case -742088126:
                    if (C1916.f6442) {
                        m2566 = C2105.m6981("ۗ۬") ^ i2;
                        i4 = ((m2566 ^ i3) * 3181) ^ 758923581;
                        i5 = -949840517;
                    } else {
                        m2566 = (C2105.m6981("۫۟") ^ i3) * 77;
                        i4 = ((m2566 ^ i2) * 16405) ^ 1183422652;
                        i5 = 1509371859;
                    }
                case -1315107508:
                case 415545091:
                    if (C3911.f12484 >= 0) {
                        m2566 = (C2105.m6981("۫۟") ^ i3) * 77;
                        i4 = ((m2566 ^ i2) * 16405) ^ 1183422652;
                        i5 = 1509371859;
                    } else if (C1711.f5919) {
                        m2566 = (C2105.m6981("ۢܺ") ^ i3) * 7;
                        i4 = ((m2566 ^ i2) * (-7381)) ^ 51629620;
                        i5 = -1525189336;
                    } else {
                        if (!C1504.f5354 && C1128.m3851() > 0) {
                            if (C0630.f2410 <= 0) {
                                m2566 = C0630.m2566("ۘܶ") ^ i2;
                                i4 = ((m2566 ^ i3) * (-349)) ^ 1286616182;
                                i5 = 571908529;
                            } else {
                                if (C2520.f8000 < 0 && C3245.m9925() == 0) {
                                    if (C4075.m12263() > 0) {
                                        if (!C3663.f11553) {
                                            Application m10479 = C3432.m10479();
                                            if (C22628.f73083 > 0) {
                                                return new C21578(new File(m10479.getNoBackupFilesDir(), str));
                                            }
                                        }
                                    }
                                }
                                m2566 = C2105.m6981("ۗ۬") ^ i2;
                                i4 = ((m2566 ^ i3) * 3181) ^ 758923581;
                                i5 = -949840517;
                            }
                        }
                        m2566 = C0630.m2566("ۖܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-3301)) ^ (-390612396);
                        i5 = -2050891542;
                    }
                    break;
                case -1081125006:
                case -500737238:
                    C1294.m4372();
                    m2566 = C2105.m6981("ۗ۬") ^ i2;
                    i4 = ((m2566 ^ i3) * 3181) ^ 758923581;
                    i5 = -949840517;
                case -37258411:
                case 2024183209:
                    if (C7106.f21815 == 0) {
                        m2566 = C2105.m6981("ۗ۬") ^ i2;
                        i4 = ((m2566 ^ i3) * 3181) ^ 758923581;
                        i5 = -949840517;
                    } else {
                        m2566 = (C2105.m6981("ۢܺ") ^ i3) * 7;
                        i4 = ((m2566 ^ i2) * (-7381)) ^ 51629620;
                        i5 = -1525189336;
                    }
                case 1263921273:
                case 1457951593:
                    if (C1128.f4106 > 0) {
                        m2566 = C2105.m6981("ۗ۬") ^ i2;
                        i4 = ((m2566 ^ i3) * 3181) ^ 758923581;
                        i5 = -949840517;
                    } else {
                        m2566 = C0630.m2566("ۘܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-349)) ^ 1286616182;
                        i5 = 571908529;
                    }
                default:
                    ViewOnClickListenerC1958.m6429();
                    C2520.m8026();
                    return null;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m18830(String str) {
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        char c = 0;
        int i2 = 1082952165;
        int i3 = RunnableC0588.f2309;
        int i4 = C0483.f2088;
        int m2566 = C0630.m2566("ۘۖ") ^ i4;
        int i5 = ((m2566 ^ i3) * 16827) ^ 1340612469;
        int i6 = 1182407945;
        while (true) {
            i2 = ((((i2 ^ i3) * 28629) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -1985558073:
                case 652872732:
                    z2 = false;
                    if (z) {
                        m2566 = C0630.m2566("ܶۛ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-23299)) ^ (-448183323);
                        i6 = 1990302158;
                    } else {
                        m2566 = (C0630.m2566("ۚܶ") + i3) * 17;
                        i5 = ((m2566 ^ i4) * 3733) ^ (-1499346310);
                        i6 = -1711300263;
                    }
                case -1745992286:
                case 963293420:
                    C3683.m11222();
                    if (C2105.m6982() != 0) {
                        m2566 = C2105.m6981("᩵ۨ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-31093)) ^ 1463657971;
                        i6 = 1969567352;
                    } else {
                        m2566 = (C0630.m2566("ۜۘ") ^ i3) * 67;
                        i5 = ((m2566 ^ i4) * 1247) ^ (-807633163);
                        i6 = -1758726164;
                    }
                case -1722183180:
                case 1674936423:
                    z = C7106.m19121(str);
                    if (C1294.f4556 >= 0) {
                        m2566 = (C0630.m2566("ۜۘ") ^ i3) * 67;
                        i5 = ((m2566 ^ i4) * 1247) ^ (-807633163);
                        i6 = -1758726164;
                    } else {
                        m2566 = C0630.m2566("ᩳ᩷") ^ i3;
                        i5 = ((m2566 ^ i4) * 7679) ^ (-898436846);
                        i6 = 2006341162;
                    }
                case -1685789066:
                case 2010990051:
                    c = C0798.m3000(str, i);
                    if (c >= '!') {
                        m2566 = (C2105.m6981("ۚۧ") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((m2566 ^ i4) * (-27557)) ^ (-971706961);
                        i6 = -477903019;
                    } else {
                        m2566 = C0630.m2566("ܶۛ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-23299)) ^ (-448183323);
                        i6 = 1990302158;
                    }
                case -1607127390:
                case 915638656:
                    if (C0798.m3007(str) > 1024) {
                        m2566 = C0630.m2566("ܶۛ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-23299)) ^ (-448183323);
                        i6 = 1990302158;
                    } else {
                        m2566 = C0630.m2566("᩸ܰ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-1409)) ^ (-689078570);
                        i6 = 277765935;
                    }
                case -1587855288:
                case 1746415919:
                    if (C3245.f10203 <= 0) {
                        m2566 = (C0630.m2566("ۜۘ") ^ i3) * 67;
                        i5 = ((m2566 ^ i4) * 1247) ^ (-807633163);
                        i6 = -1758726164;
                    } else {
                        m2566 = C2105.m6981("ۘ֫") ^ i3;
                        i5 = ((m2566 ^ i4) * 15387) ^ 107729182;
                        i6 = -221634199;
                    }
                case -1580921714:
                case -1496216598:
                    C3911.m11924();
                    if (C1128.m3851() > 0) {
                        m2566 = (i4 - C2105.m6981("۬᩵")) * 123;
                        i5 = ((m2566 ^ i3) * 20117) ^ 1742841869;
                        i6 = 318459747;
                    } else {
                        m2566 = C2105.m6981("᩵ۨ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-31093)) ^ 1463657971;
                        i6 = 1969567352;
                    }
                case -1451087448:
                case 198309864:
                    return z2;
                case -1424476636:
                case 1205900022:
                    i++;
                    m2566 = C2105.m6981("۫۟") ^ i3;
                    i5 = ((m2566 ^ i4) * 27313) ^ (-280402316);
                    i6 = -1837300439;
                case -1201213039:
                case -558613900:
                    return true;
                case -1127576168:
                case -1104686020:
                    if (C3432.f10845 >= 0) {
                        m2566 = C2105.m6981("᩵ۨ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-31093)) ^ 1463657971;
                        i6 = 1969567352;
                    } else {
                        m2566 = (i4 - C2105.m6981("ۨۖ")) * (-33);
                        i5 = ((m2566 ^ i3) * 17803) ^ 1084451243;
                        i6 = 1419138404;
                    }
                case -810667372:
                case 415478702:
                    i = 0;
                    m2566 = C2105.m6981("۫۟") ^ i3;
                    i5 = ((m2566 ^ i4) * 27313) ^ (-280402316);
                    i6 = -1837300439;
                case -611232555:
                case -289624154:
                    if (RunnableC1937.f6483 < 0) {
                        m2566 = (i4 - C2105.m6981("۬᩵")) * 123;
                        i5 = ((m2566 ^ i3) * 20117) ^ 1742841869;
                        i6 = 318459747;
                    } else {
                        m2566 = (C2105.m6981("ۤۧ") ^ i4) * 97;
                        i5 = ((m2566 ^ i3) * (-19067)) ^ 32041743;
                        i6 = 715583850;
                    }
                case -554546422:
                case -536460849:
                    if (C1773.m5908() <= 0) {
                        m2566 = (i4 - C2105.m6981("᩻ۘ")) * (-49);
                        i5 = ((m2566 ^ i3) * (-17337)) ^ 1723473661;
                        i6 = 1940932726;
                    } else {
                        m2566 = (i3 - C2105.m6981("ۛܶ")) * (-55);
                        i5 = ((m2566 ^ i4) * (-24223)) ^ 1246397932;
                        i6 = 1655541587;
                    }
                case -534474891:
                case 662555517:
                    C0483.m2121();
                    return false;
                case -325193020:
                case 1860825218:
                    C3432.m10477();
                    C2167.m7155();
                    m2566 = (i4 - C2105.m6981("۬᩵")) * 123;
                    i5 = ((m2566 ^ i3) * 20117) ^ 1742841869;
                    i6 = 318459747;
                case 83310710:
                case 1673962315:
                    if (C1047.f3863 >= 0) {
                        m2566 = (C0630.m2566("ۜۘ") ^ i3) * 67;
                        i5 = ((m2566 ^ i4) * 1247) ^ (-807633163);
                        i6 = -1758726164;
                    } else {
                        m2566 = (C0630.m2566("ܿۧ") ^ i4) * (-29);
                        i5 = ((m2566 ^ i3) * 26257) ^ (-1844289426);
                        i6 = -1606487508;
                    }
                case 193341394:
                case 2027474654:
                    if (i < C0798.m3007(str)) {
                        m2566 = C2105.m6981("᩶ܺ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-18649)) ^ (-1029931123);
                        i6 = 1151634417;
                    } else {
                        m2566 = (C2105.m6981("ۢۨ") + i3) * (-113);
                        i5 = ((m2566 ^ i4) * 651) ^ (-1981643603);
                        i6 = -640232785;
                    }
                case 316701047:
                case 1695614703:
                    if (C1294.f4556 >= 0) {
                        m2566 = (C2105.m6981("ۤۧ") ^ i4) * 97;
                        i5 = ((m2566 ^ i3) * (-19067)) ^ 32041743;
                        i6 = 715583850;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۧᩳ")) * (-81);
                        i5 = ((m2566 ^ i4) * 1969) ^ 465241683;
                        i6 = 609650822;
                    }
                case 415895917:
                case 902711245:
                    if (C7106.f21815 != 0) {
                        m2566 = (C2105.m6981("ۤۧ") ^ i4) * 97;
                        i5 = ((m2566 ^ i3) * (-19067)) ^ 32041743;
                        i6 = 715583850;
                    } else {
                        m2566 = C0630.m2566("ۡۗ") ^ i4;
                        i5 = ((m2566 ^ i3) * 5317) ^ 1395731175;
                        i6 = 1059441626;
                    }
                case 721438281:
                case 1719652323:
                    if (c > '~') {
                        m2566 = C0630.m2566("ܶۛ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-23299)) ^ (-448183323);
                        i6 = 1990302158;
                    } else {
                        m2566 = (C2105.m6981("۫ۜ") ^ i4) * (-53);
                        i5 = ((m2566 ^ i3) * (-9475)) ^ (-1001543465);
                        i6 = 1723604514;
                    }
                case 822925970:
                case 878356544:
                    if (C0630.f2410 <= 0) {
                        m2566 = (C0630.m2566("ۜۘ") ^ i3) * 67;
                        i5 = ((m2566 ^ i4) * 1247) ^ (-807633163);
                        i6 = -1758726164;
                    } else {
                        m2566 = C2105.m6981("ۖܽ") ^ i3;
                        i5 = ((m2566 ^ i4) * 8679) ^ (-687988791);
                        i6 = 624011536;
                    }
                case 1584101230:
                case 1798375189:
                    if (C1916.f6442) {
                        m2566 = C2105.m6981("ۛۖ") ^ i4;
                        i5 = ((m2566 ^ i3) * 19469) ^ (-1393666797);
                        i6 = -1171092553;
                    } else {
                        m2566 = C2105.m6981("᩵ۨ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-31093)) ^ 1463657971;
                        i6 = 1969567352;
                    }
                default:
                    if (C1773.f6144 <= 0) {
                        m2566 = (C0630.m2566("ۜۘ") ^ i3) * 67;
                        i5 = ((m2566 ^ i4) * 1247) ^ (-807633163);
                        i6 = -1758726164;
                    } else {
                        m2566 = (C0630.m2566("᩹᩺") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((m2566 ^ i3) * 1601) ^ (-1043969745);
                        i6 = 1193753472;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0215, code lost:
    
        if (r0.f77276 != r3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0059, code lost:
    
        if (l.C0483.f2088 < 0) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009d, code lost:
    
        if (l.C22628.f73083 <= 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a3, code lost:
    
        if (l.C21923.f70183 != 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ac, code lost:
    
        if (l.C1294.f4556 < 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b7, code lost:
    
        if (l.C0382.m1848() != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c0, code lost:
    
        if (l.C0714.f2697 < 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d3, code lost:
    
        if (r13 != false) goto L61;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m18829(l.C23902 r21) {
        /*
            Method dump skipped, instructions count: 1600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6969.m18829(l.᩻᩵ۡ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e0, code lost:
    
        r5 = l.C2105.m6981("۬᩶") ^ r4;
        r6 = ((r5 ^ r3) * 29705) ^ (-829898160);
        r7 = 73174715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0117, code lost:
    
        r5 = l.C0630.m2566("ۚ᩹") ^ r3;
        r6 = ((r5 ^ r4) * (-18725)) ^ (-136770304);
        r7 = 158229037;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        r5 = l.C0630.m2566("ܶۙ") ^ r4;
        r6 = ((r5 ^ r3) * 19593) ^ 1735001432;
        r7 = -288166791;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a1, code lost:
    
        r5 = (l.C2105.m6981("ۜۙ") ^ r3) * (-61);
        r6 = ((r5 ^ r4) * 21095) ^ (-1744734106);
        r7 = -522724733;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m18821(byte[] r9) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6969.m18821(byte[]):byte[]");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m18833() {
        byte[] bArr = null;
        SecureRandom secureRandom = null;
        int i = -1914004726;
        int i2 = RunnableC0588.f2309;
        int i3 = C3245.f10203;
        int m6981 = C2105.m6981("ۙۘ") ^ i2;
        int i4 = ((m6981 ^ i3) * 21155) ^ 1322683651;
        int i5 = 1882103071;
        while (true) {
            i = ((((i ^ i3) * 23515) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2116252100:
                case 1603363542:
                    if (C2167.f7158 >= 0) {
                        m6981 = C0630.m2566("֡᩹") ^ i2;
                        i4 = ((m6981 ^ i3) * (-10351)) ^ (-492404435);
                        i5 = -1322150539;
                    } else {
                        m6981 = C2105.m6981("ۖ᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * 23771) ^ (-991586818);
                        i5 = -1984300418;
                    }
                case -2023048183:
                case 799854476:
                    if (C3432.f10845 >= 0) {
                        m6981 = (C2105.m6981("᩻۫") + i3) * 61;
                        i4 = ((m6981 ^ i2) * 3945) ^ 1783307934;
                        i5 = 717540653;
                    } else {
                        m6981 = (C2105.m6981("ۧܳ") ^ i3) * (-53);
                        i4 = ((m6981 ^ i2) * (-27197)) ^ (-1730385130);
                        i5 = 794856577;
                    }
                case -1816431368:
                case -1373274990:
                    if (C2272.m7503()) {
                        m6981 = C2105.m6981("᩺ۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-32513)) ^ 317648102;
                        i5 = 1655582613;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܽ۠")) * (-107);
                        i4 = ((m6981 ^ i2) * (-15847)) ^ 945532267;
                        i5 = -1333508742;
                    }
                case -1808348944:
                case -68213756:
                    if (C11340.f33930 >= 0) {
                        m6981 = (C2105.m6981("ᩳۧ") + i3) * 101;
                        i4 = ((m6981 ^ i2) * 14743) ^ 18751193;
                        i5 = -1732911749;
                    } else {
                        m6981 = (C2105.m6981("ܰۘ") ^ i2) * 49;
                        i4 = ((m6981 ^ i3) * (-16473)) ^ (-276534495);
                        i5 = 287963258;
                    }
                case -1760454364:
                case -371869265:
                    bArr = new byte[32];
                    if (C4117.f13076 <= 0) {
                        m6981 = (C2105.m6981("ᩳۧ") + i3) * 101;
                        i4 = ((m6981 ^ i2) * 14743) ^ 18751193;
                        i5 = -1732911749;
                    } else {
                        m6981 = C0630.m2566("ܳ۬") ^ i2;
                        i4 = ((m6981 ^ i3) * (-10435)) ^ 2042318947;
                        i5 = -1235757510;
                    }
                case -1687959392:
                case 684368418:
                    C2520.m8026();
                    C0630.m2564();
                    m6981 = (C2105.m6981("ᩳۧ") + i3) * 101;
                    i4 = ((m6981 ^ i2) * 14743) ^ 18751193;
                    i5 = -1732911749;
                case -1027560289:
                case 1552167155:
                    secureRandom.nextBytes(bArr);
                    return Base64.encodeToString(bArr, 11);
                case -550381372:
                case 1111884264:
                    C3432.m10477();
                    if (C3746.f11829 > 0) {
                        m6981 = (C2105.m6981("ᩳۧ") + i3) * 101;
                        i4 = ((m6981 ^ i2) * 14743) ^ 18751193;
                        i5 = -1732911749;
                    } else {
                        m6981 = C2105.m6981("᩺ۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-32513)) ^ 317648102;
                        i5 = 1655582613;
                    }
                case -505722942:
                case -13490902:
                    if (C1047.m3599() >= 0) {
                        m6981 = C2105.m6981("᩺ۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-32513)) ^ 317648102;
                        i5 = 1655582613;
                    } else {
                        m6981 = (i2 - C0630.m2566("ᩴܰ")) * 79;
                        i4 = ((m6981 ^ i3) * 24935) ^ 629662361;
                        i5 = 35131713;
                    }
                case -297108590:
                case 272821169:
                    if (C0798.f2919) {
                        m6981 = C0630.m2566("ܳۚ") ^ i2;
                        i4 = ((m6981 ^ i3) * 24025) ^ (-566517012);
                        i5 = 1187692908;
                    } else {
                        m6981 = C0630.m2566("ۘ۠") ^ i3;
                        i4 = ((m6981 ^ i2) * 21233) ^ 1817167029;
                        i5 = -1940062222;
                    }
                case -78189657:
                case 508934887:
                    if (C0483.f2088 < 0) {
                        m6981 = (C2105.m6981("ᩳۧ") + i3) * 101;
                        i4 = ((m6981 ^ i2) * 14743) ^ 18751193;
                        i5 = -1732911749;
                    } else {
                        m6981 = (C2105.m6981("᩻۫") + i3) * 61;
                        i4 = ((m6981 ^ i2) * 3945) ^ 1783307934;
                        i5 = 717540653;
                    }
                case 31243940:
                case 493591669:
                    RunnableC1937.m6387();
                    if (C3432.f10845 >= 0) {
                        m6981 = (C2105.m6981("ᩳۧ") + i3) * 101;
                        i4 = ((m6981 ^ i2) * 14743) ^ 18751193;
                        i5 = -1732911749;
                    } else {
                        m6981 = C0630.m2566("֡᩹") ^ i2;
                        i4 = ((m6981 ^ i3) * (-10351)) ^ (-492404435);
                        i5 = -1322150539;
                    }
                case 60017623:
                case 457952971:
                    C3683.m11222();
                    C7811.m20844();
                    return null;
                case 223549205:
                case 1747321645:
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = (C2105.m6981("ᩳۧ") + i3) * 101;
                        i4 = ((m6981 ^ i2) * 14743) ^ 18751193;
                        i5 = -1732911749;
                    } else {
                        m6981 = C0630.m2566("᩸ܺ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-22009)) ^ (-2000096053);
                        i5 = -1012849560;
                    }
                case 626676782:
                case 657256691:
                    secureRandom = f21479;
                    if (C4075.m12263() <= 0) {
                        m6981 = C0630.m2566("ܳۚ") ^ i2;
                        i4 = ((m6981 ^ i3) * 24025) ^ (-566517012);
                        i5 = 1187692908;
                    } else {
                        m6981 = (C2105.m6981("ۨᩳ") + i2) * (-125);
                        i4 = ((m6981 ^ i3) * 9591) ^ (-846812314);
                        i5 = -1812298915;
                    }
                default:
                    if (C5695.m16023() >= 0) {
                        m6981 = C0630.m2566("ܳۚ") ^ i2;
                        i4 = ((m6981 ^ i3) * 24025) ^ (-566517012);
                        i5 = 1187692908;
                    } else {
                        m6981 = C0630.m2566("ۘۗ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-28395)) ^ (-1565453972);
                        i5 = -644438381;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (l.C0630.f2410 > 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (l.C0714.f2697 >= 0) goto L44;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C23902 m18811(l.C23902 r12) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6969.m18811(l.᩻᩵ۡ):l.᩻᩵ۡ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18818(C23881 c23881, String str, String str2) {
        boolean z = false;
        int i = 1558197110;
        int i2 = C3245.f10203;
        int i3 = C3746.f11829;
        int m2566 = C0630.m2566("᩻ۘ") ^ i2;
        int i4 = ((m2566 ^ i3) * 29075) ^ 1853833605;
        int i5 = -622545549;
        while (true) {
            i = ((((i ^ i3) * 19673) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2133389996:
                case -1585154967:
                    if (C3911.f12484 >= 0) {
                        m2566 = C0630.m2566("ܽۜ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-21895)) ^ 503367055;
                        i5 = 1367240713;
                    } else {
                        m2566 = C2105.m6981("ۨᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-16081)) ^ 705287849;
                        i5 = 2054115683;
                    }
                case -2131499386:
                case 705277881:
                    C2105.m6982();
                    C1294.m4372();
                    break;
                case -2012537621:
                case -941201780:
                    if (str2 != null) {
                        m2566 = C0630.m2566("ۚۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-24111)) ^ (-1480891434);
                        i5 = 236919762;
                    } else {
                        m2566 = C0630.m2566("ܺۧ") ^ i3;
                        i4 = ((m2566 ^ i2) * 23173) ^ 15943684;
                        i5 = 850029966;
                    }
                case -1973764124:
                case -1646505123:
                    if (C1916.f6442) {
                        m2566 = C2105.m6981("᩻᩹") ^ i3;
                        i4 = ((m2566 ^ i2) * 4155) ^ 653737116;
                        i5 = -950111278;
                    } else {
                        m2566 = C0630.m2566("۬۠") ^ i3;
                        i4 = ((m2566 ^ i2) * 22615) ^ 864673440;
                        i5 = -433425641;
                    }
                case -1744925127:
                case 74884802:
                    m18819(c23881, str, str2, z);
                    break;
                case -1651460852:
                case 1845714545:
                    if (C1005.f3721) {
                        m2566 = C2105.m6981("۟۟") ^ i2;
                        i4 = ((m2566 ^ i3) * 2127) ^ (-1611601380);
                        i5 = 1131620151;
                    } else {
                        m2566 = C2105.m6981("ۜۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12755)) ^ (-701557260);
                        i5 = -1171708461;
                    }
                case -1565444553:
                case -588204471:
                    if (C3245.f10203 > 0) {
                        m2566 = C0630.m2566("۬۠") ^ i3;
                        i4 = ((m2566 ^ i2) * 22615) ^ 864673440;
                        i5 = -433425641;
                    } else {
                        m2566 = C0630.m2566("ܽۜ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-21895)) ^ 503367055;
                        i5 = 1367240713;
                    }
                case -993453937:
                case 1957259548:
                    if (C1916.f6442) {
                        m2566 = C0630.m2566("᩶۠") ^ i3;
                        i4 = ((m2566 ^ i2) * 15203) ^ 833597996;
                        i5 = -327103445;
                    } else {
                        m2566 = C2105.m6981("۟۟") ^ i2;
                        i4 = ((m2566 ^ i3) * 2127) ^ (-1611601380);
                        i5 = 1131620151;
                    }
                case -855613440:
                case 1628087487:
                    C3245.m9925();
                    C1047.m3599();
                    m2566 = C0630.m2566("۬۠") ^ i3;
                    i4 = ((m2566 ^ i2) * 22615) ^ 864673440;
                    i5 = -433425641;
                case -797419871:
                case 744921339:
                    z = true;
                    m2566 = (C0630.m2566("ۡۛ") + i2) * (-97);
                    i4 = ((m2566 ^ i3) * (-5547)) ^ (-200888628);
                    i5 = -339428228;
                case -592654361:
                case 1948155840:
                    if (C21923.f70183 != 0) {
                        m2566 = C0630.m2566("ᩴ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2109)) ^ 2041688933;
                        i5 = 1283016860;
                    } else {
                        m2566 = C2105.m6981("ܺܶ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12919)) ^ (-2002134200);
                        i5 = 566339118;
                    }
                case -123808090:
                case -115315789:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        m2566 = C2105.m6981("ۜۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12755)) ^ (-701557260);
                        i5 = -1171708461;
                    } else {
                        m2566 = (i2 - C0630.m2566("᩶ۜ")) * (-17);
                        i4 = ((m2566 ^ i3) * (-30873)) ^ (-1230812690);
                        i5 = 1927353873;
                    }
                case 203190434:
                case 1704690606:
                    if (C22628.f73083 <= 0) {
                        m2566 = C2105.m6981("۟۟") ^ i2;
                        i4 = ((m2566 ^ i3) * 2127) ^ (-1611601380);
                        i5 = 1131620151;
                    } else {
                        m2566 = (C2105.m6981("᩺ۜ") ^ i3) * (-57);
                        i4 = ((m2566 ^ i2) * (-5955)) ^ (-1717030254);
                        i5 = -974087466;
                    }
                case 933748691:
                case 1970822526:
                    C4075.m12263();
                    if (C1773.m5908() > 0) {
                        m2566 = C0630.m2566("۬۠") ^ i3;
                        i4 = ((m2566 ^ i2) * 22615) ^ 864673440;
                        i5 = -433425641;
                    } else {
                        m2566 = C2105.m6981("۟۟") ^ i2;
                        i4 = ((m2566 ^ i3) * 2127) ^ (-1611601380);
                        i5 = 1131620151;
                    }
                case 943770376:
                case 1207657273:
                    if (C3683.f11629 >= 0) {
                        m2566 = C2105.m6981("ۜۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12755)) ^ (-701557260);
                        i5 = -1171708461;
                    } else {
                        m2566 = C2105.m6981("᩸᩶") ^ i2;
                        i4 = ((m2566 ^ i3) * (-23485)) ^ 693606165;
                        i5 = 1205966136;
                    }
                case 1192757751:
                case 1736284166:
                    if (C2272.m7503()) {
                        m2566 = C0630.m2566("ᩴ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2109)) ^ 2041688933;
                        i5 = 1283016860;
                    } else {
                        m2566 = (C0630.m2566("ۛܰ") ^ i2) * 15;
                        i4 = ((m2566 ^ i3) * (-10297)) ^ (-987588483);
                        i5 = -1927961320;
                    }
                case 1416872838:
                case 1790784610:
                    z = false;
                    m2566 = (C0630.m2566("ۡۛ") + i2) * (-97);
                    i4 = ((m2566 ^ i3) * (-5547)) ^ (-200888628);
                    i5 = -339428228;
                case 1477900679:
                case 1886899713:
                    if (C3537.m10746() <= 0) {
                        m2566 = C0630.m2566("ܽۜ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-21895)) ^ 503367055;
                        i5 = 1367240713;
                    } else {
                        m2566 = (C0630.m2566("ۛ֫") + i3) * (-45);
                        i4 = ((m2566 ^ i2) * (-31193)) ^ (-1888119117);
                        i5 = 1542916078;
                    }
                default:
                    if (RunnableC3474.m10630()) {
                        m2566 = C2105.m6981("ۖ֡") ^ i2;
                        i4 = ((m2566 ^ i3) * (-23293)) ^ (-640249565);
                        i5 = 439962347;
                    } else {
                        m2566 = C0630.m2566("۬۠") ^ i3;
                        i4 = ((m2566 ^ i2) * 22615) ^ 864673440;
                        i5 = -433425641;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18819(C23881 c23881, String str, String str2, boolean z) {
        short s;
        int m6981;
        int i;
        int i2;
        short s2;
        int m69812;
        int i3;
        int i4;
        short s3;
        int m2566;
        int i5;
        int i6;
        int m69813;
        int i7;
        int i8;
        int m69814;
        int i9;
        String str3 = str2;
        int i10 = C0714.f2697;
        int i11 = C1773.f6144;
        int m25662 = (C0630.m2566("᩸ۗ") + i11) * q.h;
        int i12 = ((m25662 ^ i10) * (-4007)) ^ (-85191378);
        String str4 = null;
        short[] sArr = null;
        int i13 = m25662 ^ (-1152938326);
        int i14 = 0;
        boolean z2 = false;
        short s4 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1616446661;
        int i19 = 0;
        long j = 0;
        C23902 c23902 = null;
        while (true) {
            i18 = i13 ^ (i12 & (((i18 ^ i10) * (-8637)) >> 31));
            switch (i18) {
                case -2107680500:
                case 1352046586:
                    C3663.m11168();
                    if (C4616.f14690 > 0) {
                        m69814 = (C2105.m6981("᩸ۛ") ^ i11) * 35;
                        i5 = ((m69814 ^ i10) * 6623) ^ 1783463200;
                        i9 = 1634614935;
                        i13 = m69814 ^ i9;
                        i12 = i5;
                    }
                    m2566 = (C0630.m2566("ܿ֫") + i10) * 85;
                    i5 = ((m2566 ^ i11) * (-21629)) ^ 1120837210;
                    i6 = 820049367;
                    i13 = m2566 ^ i6;
                    str3 = str2;
                    i12 = i5;
                case -2055101289:
                case 1459431813:
                    s = s4;
                    i15 = 14223;
                    m69813 = C2105.m6981("ܳܺ") ^ i10;
                    i7 = ((m69813 ^ i11) * 23645) ^ 1937229485;
                    i8 = -2015513447;
                    i12 = i7;
                    s4 = s;
                    i13 = m69813 ^ i8;
                    str3 = str2;
                case -2030844296:
                case -1815496525:
                    short[] sArr2 = f21478;
                    s = s4;
                    if (C0964.m3413()) {
                        throw new IOException(C3432.m10488(sArr2, 214, 31, i15));
                    }
                    m6981 = C0630.m2566("֡᩺") ^ i10;
                    i = ((m6981 ^ i11) * (-31137)) ^ (-918584432);
                    i2 = -33953418;
                    i12 = i;
                    s3 = s;
                    i13 = m6981 ^ i2;
                    s4 = s3;
                case -1927963509:
                case -1579280609:
                    s = s4;
                    short[] sArr3 = f21478;
                    if (C3019.f9544 < 0) {
                        throw new IOException(C5695.m16034(sArr3, 171, 21, i15));
                    }
                    m69813 = (i11 - C2105.m6981("ۗᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i7 = ((m69813 ^ i10) * 2505) ^ 858797248;
                    i8 = 478506209;
                    i12 = i7;
                    s4 = s;
                    i13 = m69813 ^ i8;
                    str3 = str2;
                case -1898678665:
                case 338474923:
                    if ((s4 * 9734) - i19 <= 0) {
                        m2566 = (C0630.m2566("ۗ۟") ^ i10) * 13;
                        i5 = ((m2566 ^ i11) * 8603) ^ 33295677;
                        i6 = 1437567707;
                    } else {
                        m2566 = C2105.m6981("ۗ۫") ^ i11;
                        i5 = ((m2566 ^ i10) * 16233) ^ 1784036261;
                        i6 = -1422123115;
                    }
                    i13 = m2566 ^ i6;
                    str3 = str2;
                    i12 = i5;
                case -1882091397:
                case 841159139:
                    C0237.m1481();
                    if (C3245.m9925() != 0) {
                        m69814 = (C0630.m2566("֫ۤ") + i10) * (-95);
                        i5 = ((m69814 ^ i11) * 30577) ^ (-2094883978);
                        i9 = 1626807180;
                        i13 = m69814 ^ i9;
                        i12 = i5;
                    }
                    m2566 = (C0630.m2566("ܿ֫") + i10) * 85;
                    i5 = ((m2566 ^ i11) * (-21629)) ^ 1120837210;
                    i6 = 820049367;
                    i13 = m2566 ^ i6;
                    str3 = str2;
                    i12 = i5;
                case -1634181857:
                case -873268218:
                    if (C4159.f13567) {
                        m2566 = (C0630.m2566("ܿ֫") + i10) * 85;
                        i5 = ((m2566 ^ i11) * (-21629)) ^ 1120837210;
                        i6 = 820049367;
                        i13 = m2566 ^ i6;
                        str3 = str2;
                        i12 = i5;
                    } else {
                        s = s4;
                        m69813 = (i11 - C2105.m6981("ۗᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((m69813 ^ i10) * 2505) ^ 858797248;
                        i8 = 478506209;
                        i12 = i7;
                        s4 = s;
                        i13 = m69813 ^ i8;
                        str3 = str2;
                    }
                case -1439668308:
                case 1941322642:
                    if (RunnableC1937.f6483 >= 0) {
                        s = s4;
                        m69813 = (i11 - C2105.m6981("ۗᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((m69813 ^ i10) * 2505) ^ 858797248;
                        i8 = 478506209;
                        i12 = i7;
                        s4 = s;
                        i13 = m69813 ^ i8;
                        str3 = str2;
                    } else {
                        s2 = s4;
                        m69812 = (i10 - C2105.m6981("֡ۙ")) * 97;
                        i3 = ((m69812 ^ i11) * (-5959)) ^ (-786420766);
                        i4 = 541512355;
                        s3 = s2;
                        i13 = m69812 ^ i4;
                        i12 = i3;
                        s4 = s3;
                    }
                case -1360854150:
                case -323712899:
                    s = s4;
                    if (str3 != null) {
                        m6981 = (C0630.m2566("ܺۤ") ^ i11) * 37;
                        i = ((m6981 ^ i10) * 26851) ^ (-282481616);
                        i2 = 791584103;
                        i12 = i;
                        s3 = s;
                        i13 = m6981 ^ i2;
                        s4 = s3;
                    }
                    m6981 = (i11 - C0630.m2566("ۨܶ")) * 77;
                    i = ((m6981 ^ i10) * 249) ^ 1089145140;
                    i2 = -137300028;
                    i12 = i;
                    s3 = s;
                    i13 = m6981 ^ i2;
                    s4 = s3;
                case -1331579079:
                case 1867209771:
                    if (C1420.f5096 > 0) {
                        m2566 = (C0630.m2566("ᩳ۬") ^ i10) * (-103);
                        i5 = ((m2566 ^ i11) * (-12215)) ^ 405475347;
                        i6 = 1363736093;
                        i13 = m2566 ^ i6;
                        str3 = str2;
                        i12 = i5;
                    }
                    m2566 = (C0630.m2566("ܿ֫") + i10) * 85;
                    i5 = ((m2566 ^ i11) * (-21629)) ^ 1120837210;
                    i6 = 820049367;
                    i13 = m2566 ^ i6;
                    str3 = str2;
                    i12 = i5;
                case -1240011544:
                case 794440795:
                    i19 = (s4 * s4) + 23687689;
                    if (RunnableC3474.f10992 > 0) {
                        m2566 = (C0630.m2566("᩷᩶") + i11) * 123;
                        i5 = ((m2566 ^ i10) * (-28953)) ^ 96568090;
                        i6 = 1656242684;
                        i13 = m2566 ^ i6;
                        str3 = str2;
                        i12 = i5;
                    }
                    m2566 = (C2105.m6981("ܿۛ") + i11) * 61;
                    i5 = ((m2566 ^ i10) * (-31123)) ^ 1141502707;
                    i6 = -1400500143;
                    i13 = m2566 ^ i6;
                    str3 = str2;
                    i12 = i5;
                case -857126977:
                case 1185530344:
                    s = s4;
                    c23902.f77281 = C1128.m3841(sArr, i16, i17, i15);
                    c23902.f77277 = str;
                    if (C0050.f910 >= 0) {
                        m69813 = (i11 - C2105.m6981("ۗᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((m69813 ^ i10) * 2505) ^ 858797248;
                        i8 = 478506209;
                        i12 = i7;
                        s4 = s;
                        i13 = m69813 ^ i8;
                        str3 = str2;
                    } else {
                        m6981 = C0630.m2566("ۤۡ") ^ i10;
                        i = ((m6981 ^ i11) * (-17683)) ^ (-247505284);
                        i2 = -994479603;
                        i12 = i;
                        s3 = s;
                        i13 = m6981 ^ i2;
                        s4 = s3;
                    }
                case -812010347:
                case -110948020:
                    s = s4;
                    c23902.f77276 = j;
                    c23902.f77278 = str4;
                    c23902.f77275 = i14;
                    sArr = f21478;
                    if (C2167.m7155()) {
                        m69813 = (i11 - C2105.m6981("ۗᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((m69813 ^ i10) * 2505) ^ 858797248;
                        i8 = 478506209;
                        i12 = i7;
                        s4 = s;
                        i13 = m69813 ^ i8;
                        str3 = str2;
                    } else {
                        m6981 = C2105.m6981("ۘۖ") ^ i11;
                        i = ((m6981 ^ i10) * 25765) ^ 954615054;
                        i2 = -892869466;
                        i12 = i;
                        s3 = s;
                        i13 = m6981 ^ i2;
                        s4 = s3;
                    }
                case -782820617:
                case 2097224084:
                    C0237.m1481();
                    C1420.m4913();
                    m2566 = (C0630.m2566("ܿ֫") + i10) * 85;
                    i5 = ((m2566 ^ i11) * (-21629)) ^ 1120837210;
                    i6 = 820049367;
                    i13 = m2566 ^ i6;
                    str3 = str2;
                    i12 = i5;
                case -769391214:
                case 160581859:
                    s = s4;
                    c23902 = m18811(C2520.m8032());
                    j = c23881.m52604();
                    str4 = ViewOnClickListenerC1958.m6440(c23881);
                    if (C4263.f13799 > 0) {
                        m69813 = C0630.m2566("۠᩵") ^ i10;
                        i7 = ((m69813 ^ i11) * (-1371)) ^ (-1634109805);
                        i8 = 2095375340;
                        i12 = i7;
                        s4 = s;
                        i13 = m69813 ^ i8;
                        str3 = str2;
                    }
                    m69813 = (i11 - C2105.m6981("ۗᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i7 = ((m69813 ^ i10) * 2505) ^ 858797248;
                    i8 = 478506209;
                    i12 = i7;
                    s4 = s;
                    i13 = m69813 ^ i8;
                    str3 = str2;
                case -665746955:
                case 209748763:
                    s = s4;
                    if (j < c23902.f77276) {
                        m6981 = C0630.m2566("᩸֨") ^ i11;
                        i = ((m6981 ^ i10) * (-31081)) ^ (-463118078);
                        i2 = -557598293;
                        i12 = i;
                        s3 = s;
                        i13 = m6981 ^ i2;
                        s4 = s3;
                    }
                    m6981 = (i10 - C0630.m2566("ܿ֡")) * (-121);
                    i = ((m6981 ^ i11) * 12855) ^ (-1424831270);
                    i2 = 1371403520;
                    i12 = i;
                    s3 = s;
                    i13 = m6981 ^ i2;
                    s4 = s3;
                case -558201301:
                case -248820797:
                    s = s4;
                    if (m18830(str4)) {
                        m6981 = C2105.m6981("ܽᩳ") ^ i11;
                        i = ((m6981 ^ i10) * (-3199)) ^ 2100046162;
                        i2 = -2131955022;
                        i12 = i;
                        s3 = s;
                        i13 = m6981 ^ i2;
                        s4 = s3;
                    } else {
                        m69813 = C2105.m6981("֫֨") ^ i11;
                        i7 = ((m69813 ^ i10) * 13233) ^ (-1950046654);
                        i8 = -1549252576;
                        i12 = i7;
                        s4 = s;
                        i13 = m69813 ^ i8;
                        str3 = str2;
                    }
                case -520881854:
                case -260185491:
                    s2 = s4;
                    short[] sArr4 = f21478;
                    if (C0964.f3626 == 0) {
                        throw new IOException(C21923.m49334(sArr4, 195, 19, i15));
                    }
                    m69812 = (i10 - C2105.m6981("֡ۙ")) * 97;
                    i3 = ((m69812 ^ i11) * (-5959)) ^ (-786420766);
                    i4 = 541512355;
                    s3 = s2;
                    i13 = m69812 ^ i4;
                    i12 = i3;
                    s4 = s3;
                case -461742162:
                case 1607605289:
                    s = s4;
                    i16 = 192;
                    i17 = 3;
                    if (C1047.f3863 < 0) {
                        m6981 = C2105.m6981("֫ۜ") ^ i10;
                        i = ((m6981 ^ i11) * (-30053)) ^ 34384521;
                        i2 = 1118235443;
                        i12 = i;
                        s3 = s;
                        i13 = m6981 ^ i2;
                        s4 = s3;
                    }
                    m6981 = C0630.m2566("֡᩺") ^ i10;
                    i = ((m6981 ^ i11) * (-31137)) ^ (-918584432);
                    i2 = -33953418;
                    i12 = i;
                    s3 = s;
                    i13 = m6981 ^ i2;
                    s4 = s3;
                case -367486904:
                case -297133461:
                    s = s4;
                    c23902.f77279 = "";
                    c23902.f77282 = str3;
                    c23902.f77280 = z2;
                    m6981 = (i11 - C0630.m2566("ۨܶ")) * 77;
                    i = ((m6981 ^ i10) * 249) ^ 1089145140;
                    i2 = -137300028;
                    i12 = i;
                    s3 = s;
                    i13 = m6981 ^ i2;
                    s4 = s3;
                case -335440952:
                case 1320339242:
                    s = s4;
                    if (!z) {
                        m6981 = C2105.m6981("۟ۢ") ^ i10;
                        i = ((m6981 ^ i11) * (-16735)) ^ 2139461606;
                        i2 = -2100346139;
                        i12 = i;
                        s3 = s;
                        i13 = m6981 ^ i2;
                        s4 = s3;
                    }
                    m6981 = (i10 - C0630.m2566("ܿ֡")) * (-121);
                    i = ((m6981 ^ i11) * 12855) ^ (-1424831270);
                    i2 = 1371403520;
                    i12 = i;
                    s3 = s;
                    i13 = m6981 ^ i2;
                    s4 = s3;
                case -300538055:
                case 519781576:
                    s4 = f21478[170];
                    if (!C3663.f11553) {
                        m2566 = C0630.m2566("ۨᩳ") ^ i11;
                        i5 = ((m2566 ^ i10) * (-15801)) ^ 2093989651;
                        i6 = 31958310;
                        i13 = m2566 ^ i6;
                        str3 = str2;
                        i12 = i5;
                    }
                    m2566 = (C2105.m6981("ܿۛ") + i11) * 61;
                    i5 = ((m2566 ^ i10) * (-31123)) ^ 1141502707;
                    i6 = -1400500143;
                    i13 = m2566 ^ i6;
                    str3 = str2;
                    i12 = i5;
                case -223668636:
                case 1626120641:
                    s = s4;
                    i14 = c23881.m52612();
                    if (j > 0) {
                        m69813 = C2105.m6981("ܳۗ") ^ i10;
                        i7 = ((m69813 ^ i11) * (-23327)) ^ 1810573031;
                        i8 = 2137307098;
                        i12 = i7;
                        s4 = s;
                        i13 = m69813 ^ i8;
                        str3 = str2;
                    }
                    m69813 = C2105.m6981("֫֨") ^ i11;
                    i7 = ((m69813 ^ i10) * 13233) ^ (-1950046654);
                    i8 = -1549252576;
                    i12 = i7;
                    s4 = s;
                    i13 = m69813 ^ i8;
                    str3 = str2;
                case 11353130:
                case 1872971434:
                    s = s4;
                    i15 = 4278;
                    m69813 = C2105.m6981("ܳܺ") ^ i10;
                    i7 = ((m69813 ^ i11) * 23645) ^ 1937229485;
                    i8 = -2015513447;
                    i12 = i7;
                    s4 = s;
                    i13 = m69813 ^ i8;
                    str3 = str2;
                case 90725576:
                case 765137558:
                    C1773.m5908();
                    if (C0422.f1886 > 0) {
                        s = s4;
                        m69813 = (i11 - C2105.m6981("ۗᩳ")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((m69813 ^ i10) * 2505) ^ 858797248;
                        i8 = 478506209;
                        i12 = i7;
                        s4 = s;
                        i13 = m69813 ^ i8;
                        str3 = str2;
                    } else {
                        s = s4;
                        m6981 = C0630.m2566("֡᩺") ^ i10;
                        i = ((m6981 ^ i11) * (-31137)) ^ (-918584432);
                        i2 = -33953418;
                        i12 = i;
                        s3 = s;
                        i13 = m6981 ^ i2;
                        s4 = s3;
                    }
                case 488360911:
                case 1257682029:
                    s2 = s4;
                    m18824(c23902);
                    if (C1773.m5916(m18810())) {
                        m69812 = (C0630.m2566("᩻ۛ") ^ i11) * (-41);
                        i3 = ((m69812 ^ i10) * 29585) ^ (-1602188407);
                        i4 = -378228994;
                    } else {
                        m69812 = C2105.m6981("ܳᩴ") ^ i10;
                        i3 = ((m69812 ^ i11) * 18607) ^ 793878109;
                        i4 = 146548164;
                    }
                    s3 = s2;
                    i13 = m69812 ^ i4;
                    i12 = i3;
                    s4 = s3;
                case 1794581412:
                case 1923169306:
                    return;
                case 1801605457:
                case 1886443274:
                    C2126.m7040();
                    return;
                default:
                    s = s4;
                    z2 = true;
                    if (i14 >= 1) {
                        m6981 = C2105.m6981("ᩴᩴ") ^ i11;
                        i = ((m6981 ^ i10) * 7155) ^ (-1759205005);
                        i2 = 1611458652;
                        i12 = i;
                        s3 = s;
                        i13 = m6981 ^ i2;
                        s4 = s3;
                    } else {
                        m69813 = C2105.m6981("֫֨") ^ i11;
                        i7 = ((m69813 ^ i10) * 13233) ^ (-1950046654);
                        i8 = -1549252576;
                        i12 = i7;
                        s4 = s;
                        i13 = m69813 ^ i8;
                        str3 = str2;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18807(String str, String str2) {
        C23902 c23902 = null;
        C23902 c239022 = null;
        String str3 = null;
        int i = 1877658942;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = C0050.f910;
        int m2566 = C0630.m2566("ᩴ᩸") ^ i2;
        int i4 = ((m2566 ^ i3) * (-653)) ^ 365303529;
        int i5 = 1066845562;
        while (true) {
            i = ((((i ^ i3) * (-24421)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2113042208:
                case -1459419541:
                    C3537.m10746();
                    return null;
                case -2107897834:
                case -18704261:
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = (C0630.m2566("ۢ۟") + i3) * (-89);
                        i4 = ((m2566 ^ i2) * 15919) ^ 354729930;
                        i5 = -2091959853;
                    } else {
                        m2566 = C0630.m2566("ۛۢ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-24671)) ^ 363560572;
                        i5 = 698457179;
                    }
                case -1994254969:
                case -552843997:
                    C3911.m11924();
                    if (C1128.f4106 > 0) {
                        m2566 = (C0630.m2566("ۢ۟") + i3) * (-89);
                        i4 = ((m2566 ^ i2) * 15919) ^ 354729930;
                        i5 = -2091959853;
                    } else {
                        m2566 = C2105.m6981("᩸֡") ^ i2;
                        i4 = ((m2566 ^ i3) * 6655) ^ 310888292;
                        i5 = 871045431;
                    }
                case -1818403098:
                case 1741391657:
                    C1711.m5736();
                    m2566 = (C0630.m2566("ۢ۟") + i3) * (-89);
                    i4 = ((m2566 ^ i2) * 15919) ^ 354729930;
                    i5 = -2091959853;
                case -1647014239:
                case 1236056925:
                    if (RunnableC1108.f4040) {
                        m2566 = (C0630.m2566("ۛܰ") + i3) * 61;
                        i4 = ((m2566 ^ i2) * (-7727)) ^ 1164288468;
                        i5 = 1645720249;
                    } else {
                        m2566 = (C0630.m2566("ۢ۟") + i3) * (-89);
                        i4 = ((m2566 ^ i2) * 15919) ^ 354729930;
                        i5 = -2091959853;
                    }
                case -1645373072:
                case -1556308294:
                    if (C7811.f24123 >= 0) {
                        m2566 = C0630.m2566("۠᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29627)) ^ (-620918679);
                        i5 = -587112923;
                    } else {
                        m2566 = (C0630.m2566("ᩳ᩸") ^ i2) * 47;
                        i4 = ((m2566 ^ i3) * 11569) ^ 1367775782;
                        i5 = 366241181;
                    }
                case -1363901357:
                case 1294078275:
                    c239022.f77277 = str3;
                    m18824(c239022);
                    return c239022.f77277;
                case -1042993257:
                case -489375306:
                    if (C2126.f7087) {
                        m2566 = C0630.m2566("۠᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29627)) ^ (-620918679);
                        i5 = -587112923;
                    } else {
                        m2566 = C2105.m6981("᩺ۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * 27033) ^ 113693891;
                        i5 = -1430124562;
                    }
                case -836369955:
                case 1640747205:
                    str3 = m18833();
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = (i3 - C2105.m6981("ۛ֡")) * 41;
                        i4 = ((m2566 ^ i2) * (-4687)) ^ 1145621868;
                        i5 = -1475565889;
                    } else {
                        m2566 = C0630.m2566("ۖܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * 19175) ^ 171563427;
                        i5 = 1376862769;
                    }
                case -772254736:
                case -721134985:
                    if (AbstractC2021.m6574()) {
                        m2566 = (i3 - C2105.m6981("ۛ֡")) * 41;
                        i4 = ((m2566 ^ i2) * (-4687)) ^ 1145621868;
                        i5 = -1475565889;
                    } else {
                        m2566 = C2105.m6981("ۧۙ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-3433)) ^ 862417512;
                        i5 = -909188715;
                    }
                case -603077195:
                case 1955894749:
                    if (C1294.m4369(str2, c23902.f77279)) {
                        m2566 = (C2105.m6981("ۗᩴ") ^ i2) * (-81);
                        i4 = ((m2566 ^ i3) * (-22083)) ^ (-1838201619);
                        i5 = 817328348;
                    } else {
                        m2566 = (C2105.m6981("ܰ۟") + i2) * 31;
                        i4 = ((m2566 ^ i3) * (-19837)) ^ 1193685279;
                        i5 = 443064803;
                    }
                case -566073774:
                case 892086148:
                    if (C4616.f14690 <= 0) {
                        m2566 = C0630.m2566("۠᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29627)) ^ (-620918679);
                        i5 = -587112923;
                    } else {
                        m2566 = C2105.m6981("ܿۤ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-21023)) ^ (-1179738564);
                        i5 = -1460721402;
                    }
                case -540066688:
                case 1742692499:
                    if (C1711.f5919) {
                        m2566 = C0630.m2566("۠᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29627)) ^ (-620918679);
                        i5 = -587112923;
                    } else {
                        m2566 = C2105.m6981("ܰۤ") ^ i3;
                        i4 = ((m2566 ^ i2) * 18517) ^ 1791835028;
                        i5 = 1634825822;
                    }
                case -438809545:
                case 1001540846:
                    if (ViewOnClickListenerC1958.m6437(str, c23902.f77281)) {
                        m2566 = C2105.m6981("ۧ۠") ^ i3;
                        i4 = ((m2566 ^ i2) * (-20181)) ^ 2108454879;
                        i5 = -2010033073;
                    } else {
                        m2566 = (C2105.m6981("ܰ۟") + i2) * 31;
                        i4 = ((m2566 ^ i3) * (-19837)) ^ 1193685279;
                        i5 = 443064803;
                    }
                case 704910137:
                case 982813461:
                    c239022 = m18811(c23902);
                    c239022.f77281 = str;
                    if (C3746.m11369() >= 0) {
                        m2566 = C2105.m6981("᩸֡") ^ i2;
                        i4 = ((m2566 ^ i3) * 6655) ^ 310888292;
                        i5 = 871045431;
                    } else {
                        m2566 = C0630.m2566("ۢᩳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 4617) ^ 2041895484;
                        i5 = -1114103947;
                    }
                case 1094577647:
                case 1717043654:
                    c239022.f77279 = str2;
                    if (C4616.f14690 <= 0) {
                        m2566 = C2105.m6981("ܿۤ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-21023)) ^ (-1179738564);
                        i5 = -1460721402;
                    } else {
                        m2566 = C2105.m6981("ܶᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * 18941) ^ 2063532898;
                        i5 = 904432908;
                    }
                case 1284506250:
                case 1369171897:
                    c23902 = C5695.m16018();
                    if (c23902 != null) {
                        m2566 = (C0630.m2566("֫ۚ") + i2) * (-51);
                        i4 = ((m2566 ^ i3) * (-13877)) ^ 12527342;
                        i5 = 125019744;
                    } else {
                        m2566 = (C2105.m6981("ܰ۟") + i2) * 31;
                        i4 = ((m2566 ^ i3) * (-19837)) ^ 1193685279;
                        i5 = 443064803;
                    }
                case 1414190024:
                case 1621815341:
                    AbstractC2021.m6574();
                    if (C2272.m7503()) {
                        m2566 = C2105.m6981("᩸֡") ^ i2;
                        i4 = ((m2566 ^ i3) * 6655) ^ 310888292;
                        i5 = 871045431;
                    } else {
                        m2566 = C0630.m2566("۠᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29627)) ^ (-620918679);
                        i5 = -587112923;
                    }
                case 1547060552:
                case 1807101897:
                    if (C1504.f5354) {
                        m2566 = C2105.m6981("ܿۤ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-21023)) ^ (-1179738564);
                        i5 = -1460721402;
                    } else {
                        m2566 = C0630.m2566("ۗ۟") ^ i3;
                        i4 = ((m2566 ^ i2) * (-8743)) ^ 1498200661;
                        i5 = 510754325;
                    }
                default:
                    return c23902.f77277;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18812(String str) {
        C23902 c23902;
        int m2566;
        int i;
        int i2;
        int m25662;
        int i3;
        int i4;
        int i5 = RunnableC0588.f2309;
        int i6 = C0422.f1886;
        int m25663 = (i6 - C0630.m2566("ۡ۬")) * 23;
        int i7 = ((m25663 ^ i5) * (-12025)) ^ 42845956;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = m25663 ^ 1245319891;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1537738131;
        String str2 = null;
        C23902 c239022 = null;
        C23902 c239023 = null;
        while (true) {
            i16 = i8 ^ (i7 & (((i16 ^ i5) * 22411) >> 31));
            switch (i16) {
                case -2131971313:
                case 917112019:
                    c23902 = c239022;
                    i13 = 24069;
                    m2566 = (C2105.m6981("ܽۚ") + i5) * (-41);
                    i = ((m2566 ^ i6) * 19403) ^ 345265257;
                    i2 = 108492352;
                    C23902 c239024 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c239024;
                case -2064852966:
                case 1342730868:
                    c23902 = c239022;
                    c239023 = C5695.m16018();
                    if (c239023 != null) {
                        m2566 = (C2105.m6981("ۛ᩺") + i6) * (-51);
                        i = ((m2566 ^ i5) * (-16681)) ^ (-1316602272);
                        i2 = 581836635;
                        C23902 c2390242 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c2390242;
                    }
                    m2566 = C0630.m2566("ܰۛ") ^ i6;
                    i = ((m2566 ^ i5) * 6647) ^ 374828081;
                    i2 = -165249175;
                    C23902 c23902422 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c23902422;
                case -1922997257:
                case 2069241374:
                    c23902 = c239022;
                    i13 = 14699;
                    m2566 = (C2105.m6981("ܽۚ") + i5) * (-41);
                    i = ((m2566 ^ i6) * 19403) ^ 345265257;
                    i2 = 108492352;
                    C23902 c239024222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c239024222;
                case -1512301374:
                case 710677851:
                    c23902 = c239022;
                    sArr2 = f21478;
                    i14 = 28;
                    if (!AbstractC2021.m6574()) {
                        m2566 = (C0630.m2566("ۜ᩶") + i5) * (-37);
                        i = ((m2566 ^ i6) * 20429) ^ 1891674248;
                        i2 = -1993158669;
                        C23902 c2390242222 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c2390242222;
                    }
                    m2566 = C2105.m6981("ۗ۫") ^ i6;
                    i = ((m2566 ^ i5) * (-1139)) ^ (-823911768);
                    i2 = -501611617;
                    C23902 c23902422222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c23902422222;
                case -1489993611:
                case -1215633605:
                    C1420.m4913();
                    if (RunnableC3474.m10630()) {
                        c23902 = c239022;
                        m2566 = C2105.m6981("ۗ۫") ^ i6;
                        i = ((m2566 ^ i5) * (-1139)) ^ (-823911768);
                        i2 = -501611617;
                        C23902 c239024222222 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c239024222222;
                    } else {
                        m25662 = C2105.m6981("ᩴۛ") ^ i5;
                        i3 = ((m25662 ^ i6) * 22831) ^ (-683043803);
                        i4 = 788281364;
                        i8 = m25662 ^ i4;
                        i7 = i3;
                    }
                case -1224409764:
                case 470311198:
                    C4616.m13552();
                    if (C0050.m940() <= 0) {
                        c23902 = c239022;
                        m2566 = (C2105.m6981("᩵ۚ") + i6) * (-103);
                        i = ((m2566 ^ i5) * (-14123)) ^ (-207307802);
                        i2 = -1006725712;
                        C23902 c2390242222222 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c2390242222222;
                    }
                    c23902 = c239022;
                    m2566 = (C2105.m6981("᩻۠") ^ i6) * (-13);
                    i = ((m2566 ^ i5) * 28581) ^ 1601273780;
                    i2 = -183374868;
                    C23902 c23902422222222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c23902422222222;
                case -1024835810:
                case 1912530320:
                    c23902 = c239022;
                    c = 27;
                    if (RunnableC3474.f10992 > 0) {
                        m2566 = C0630.m2566("᩵᩻") ^ i6;
                        i = ((m2566 ^ i5) * (-19779)) ^ 1881604299;
                        i2 = -269457883;
                        C23902 c239024222222222 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c239024222222222;
                    }
                    m2566 = (C2105.m6981("᩵ۚ") + i6) * (-103);
                    i = ((m2566 ^ i5) * (-14123)) ^ (-207307802);
                    i2 = -1006725712;
                    C23902 c2390242222222222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c2390242222222222;
                case -982626801:
                case -174958382:
                    c23902 = c239022;
                    int i17 = i11 + i12;
                    if (i10 - (i17 + i17) <= 0) {
                        m2566 = C0630.m2566("ܳܰ") ^ i5;
                        i = ((m2566 ^ i6) * 26893) ^ (-1256901442);
                        i2 = -491976724;
                    } else {
                        m2566 = (i6 - C0630.m2566("ܺۚ")) * (-39);
                        i = ((m2566 ^ i5) * (-19689)) ^ 507989862;
                        i2 = -1264105994;
                    }
                    C23902 c23902422222222222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c23902422222222222;
                case -809633023:
                case 935076170:
                    c239022.f77277 = str2;
                    c239022.f77279 = str2;
                    m18824(c239022);
                    c23902 = c239022;
                    m2566 = C0630.m2566("ܰۛ") ^ i6;
                    i = ((m2566 ^ i5) * 6647) ^ 374828081;
                    i2 = -165249175;
                    C23902 c239024222222222222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c239024222222222222;
                case -516374330:
                case -82381250:
                    c239022.f77281 = str2;
                    if (RunnableC1108.m3790()) {
                        c23902 = c239022;
                        m2566 = C2105.m6981("ۗ۫") ^ i6;
                        i = ((m2566 ^ i5) * (-1139)) ^ (-823911768);
                        i2 = -501611617;
                        C23902 c2390242222222222222 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c2390242222222222222;
                    } else {
                        m25662 = (C2105.m6981("ܽۧ") ^ i5) * (-95);
                        i3 = ((m25662 ^ i6) * (-26891)) ^ 1710948767;
                        i4 = -328342961;
                        i8 = m25662 ^ i4;
                        i7 = i3;
                    }
                case -414244866:
                case 1999974377:
                    c23902 = c239022;
                    sArr = f21478;
                    if (C0382.f1805) {
                        m2566 = C0630.m2566("ۨܰ") ^ i5;
                        i = ((m2566 ^ i6) * (-23247)) ^ 1380000136;
                        i2 = -402274441;
                        C23902 c23902422222222222222 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c23902422222222222222;
                    }
                    m2566 = (C2105.m6981("᩵ۚ") + i6) * (-103);
                    i = ((m2566 ^ i5) * (-14123)) ^ (-207307802);
                    i2 = -1006725712;
                    C23902 c239024222222222222222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c239024222222222222222;
                case -403843807:
                case -288499261:
                    break;
                case -376696485:
                case 1226847712:
                    C1916.m6308();
                    break;
                case -266527408:
                case -84829590:
                    if (C0050.f910 < 0) {
                        c23902 = c239022;
                        m2566 = (C2105.m6981("᩻۠") ^ i6) * (-13);
                        i = ((m2566 ^ i5) * 28581) ^ 1601273780;
                        i2 = -183374868;
                        C23902 c2390242222222222222222 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c2390242222222222222222;
                    } else {
                        m25662 = C2105.m6981("ᩴۛ") ^ i5;
                        i3 = ((m25662 ^ i6) * 22831) ^ (-683043803);
                        i4 = 788281364;
                        i8 = m25662 ^ i4;
                        i7 = i3;
                    }
                case -217966053:
                case 728336485:
                    c239022 = m18811(c239023);
                    str2 = "";
                    if (!C3683.m11222()) {
                        m25662 = C0630.m2566("᩷ۛ") ^ i6;
                        i3 = ((m25662 ^ i5) * 22845) ^ (-1849062854);
                        i4 = -103761789;
                        i8 = m25662 ^ i4;
                        i7 = i3;
                    }
                    m25662 = C2105.m6981("ᩴۛ") ^ i5;
                    i3 = ((m25662 ^ i6) * 22831) ^ (-683043803);
                    i4 = 788281364;
                    i8 = m25662 ^ i4;
                    i7 = i3;
                case -158968875:
                case 1087377109:
                    if (C1294.m4369(str, c239023.f77277)) {
                        m2566 = (C2105.m6981("ܿ֡") + i5) * (-19);
                        c23902 = c239022;
                        i = ((m2566 ^ i6) * (-30741)) ^ (-1938533430);
                        i2 = 1631122694;
                        C23902 c23902422222222222222222 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c23902422222222222222222;
                    }
                    c23902 = c239022;
                    m2566 = C0630.m2566("ܰۛ") ^ i6;
                    i = ((m2566 ^ i5) * 6647) ^ 374828081;
                    i2 = -165249175;
                    C23902 c239024222222222222222222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c239024222222222222222222;
                case 152711461:
                case 1363366983:
                    c23902 = c239022;
                    i10 = i9 * i9;
                    i11 = s * s;
                    if (C2167.f7158 < 0) {
                        m2566 = (i5 - C2105.m6981("ᩴۘ")) * 71;
                        i = ((m2566 ^ i6) * 31669) ^ 1660545706;
                        i2 = -496865066;
                        C23902 c2390242222222222222222222 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c2390242222222222222222222;
                    }
                    m2566 = (C2105.m6981("᩻۠") ^ i6) * (-13);
                    i = ((m2566 ^ i5) * 28581) ^ 1601273780;
                    i2 = -183374868;
                    C23902 c23902422222222222222222222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c23902422222222222222222222;
                case 242962898:
                case 1844522881:
                    c23902 = c239022;
                    if (ViewOnClickListenerC1958.m6437(RunnableC1108.m3789(sArr2, i14, i15, i13), c239023.f77281)) {
                        m2566 = (i5 - C0630.m2566("᩻ۧ")) * (-47);
                        i = ((m2566 ^ i6) * 537) ^ (-904611070);
                        i2 = 1305631366;
                        C23902 c239024222222222222222222222 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c239024222222222222222222222;
                    }
                    m2566 = C0630.m2566("ܰۛ") ^ i6;
                    i = ((m2566 ^ i5) * 6647) ^ 374828081;
                    i2 = -165249175;
                    C23902 c2390242222222222222222222222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c2390242222222222222222222222;
                case 495460013:
                case 1005968934:
                    C0964.m3413();
                    c23902 = c239022;
                    m2566 = (C2105.m6981("᩻۠") ^ i6) * (-13);
                    i = ((m2566 ^ i5) * 28581) ^ 1601273780;
                    i2 = -183374868;
                    C23902 c23902422222222222222222222222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c23902422222222222222222222222;
                case 927183616:
                case 1153694018:
                    c23902 = c239022;
                    i15 = 5;
                    if (!C2126.f7087) {
                        m2566 = C0630.m2566("֫۟") ^ i6;
                        i = ((m2566 ^ i5) * (-18403)) ^ 2021304001;
                        i2 = 378577991;
                        C23902 c239024222222222222222222222222 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c239024222222222222222222222222;
                    }
                    m2566 = (C2105.m6981("ܶܳ") ^ i5) * 57;
                    i = ((m2566 ^ i6) * (-15159)) ^ (-60804331);
                    i2 = -271051401;
                    C23902 c2390242222222222222222222222222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c2390242222222222222222222222222;
                case 1200075405:
                case 1369236635:
                    c23902 = c239022;
                    i12 = 149842081;
                    if (C7811.f24123 < 0) {
                        m2566 = (C2105.m6981("۠ܽ") + i6) * (-113);
                        i = ((m2566 ^ i5) * 18551) ^ (-613404106);
                        i2 = 984115597;
                        C23902 c23902422222222222222222222222222 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c23902422222222222222222222222222;
                    }
                    m2566 = (C2105.m6981("᩵ۚ") + i6) * (-103);
                    i = ((m2566 ^ i5) * (-14123)) ^ (-207307802);
                    i2 = -1006725712;
                    C23902 c239024222222222222222222222222222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c239024222222222222222222222222222;
                case 1230850062:
                case 1649997464:
                    c23902 = c239022;
                    i9 = s + 12241;
                    if (!C3663.f11553) {
                        m2566 = (i5 - C2105.m6981("۠ۢ")) * 123;
                        i = ((m2566 ^ i6) * 629) ^ 132856276;
                        i2 = -223341254;
                        C23902 c2390242222222222222222222222222222 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c2390242222222222222222222222222222;
                    }
                    m2566 = (C2105.m6981("ܶܳ") ^ i5) * 57;
                    i = ((m2566 ^ i6) * (-15159)) ^ (-60804331);
                    i2 = -271051401;
                    C23902 c23902422222222222222222222222222222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c23902422222222222222222222222222222;
                default:
                    c23902 = c239022;
                    s = sArr[c];
                    if (C0964.f3626 == 0) {
                        m2566 = (C0630.m2566("ܳۜ") + i6) * 93;
                        i = ((m2566 ^ i5) * (-5059)) ^ 1390462095;
                        i2 = 1871846970;
                        C23902 c239024222222222222222222222222222222 = c23902;
                        i8 = m2566 ^ i2;
                        i7 = i;
                        c239022 = c239024222222222222222222222222222222;
                    }
                    m2566 = (C2105.m6981("᩻۠") ^ i6) * (-13);
                    i = ((m2566 ^ i5) * 28581) ^ 1601273780;
                    i2 = -183374868;
                    C23902 c2390242222222222222222222222222222222 = c23902;
                    i8 = m2566 ^ i2;
                    i7 = i;
                    c239022 = c2390242222222222222222222222222222222;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23881 m18810() {
        C23902 c23902 = null;
        C18237 c18237 = null;
        String str = null;
        String str2 = null;
        long j = 0;
        C23881 c23881 = null;
        C23902 c239022 = null;
        String str3 = null;
        int i = 646083727;
        int i2 = C1773.f6144;
        int i3 = C3019.f9544;
        int m6981 = (C2105.m6981("֫ᩳ") ^ i3) * (-61);
        int i4 = ((m6981 ^ i2) * 23025) ^ (-883127331);
        int i5 = -1720780360;
        while (true) {
            i = ((((i ^ i2) * (-7461)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2020130938:
                case 1446575166:
                    c239022.f77281 = str3;
                    if (C4075.f12947 >= 0) {
                        m6981 = (C2105.m6981("᩶᩻") + i3) * (-7);
                        i4 = ((m6981 ^ i2) * (-3279)) ^ (-861924921);
                        i5 = -2007237020;
                    } else {
                        m6981 = C2105.m6981("ۧۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-18439)) ^ 751396248;
                        i5 = 658186124;
                    }
                case -2017599977:
                case 1756354853:
                    C1294.m4372();
                    C3911.m11924();
                    m6981 = C2105.m6981("᩻ܶ") ^ i3;
                    i4 = ((m6981 ^ i2) * 953) ^ 2029508762;
                    i5 = -314695326;
                case -1833473664:
                case -1132011884:
                    C2405.m7823();
                    m6981 = (i2 - C2105.m6981("֡ܳ")) * 85;
                    i4 = ((m6981 ^ i3) * 18461) ^ (-1306870980);
                    i5 = 829235760;
                case -1821580631:
                case 917072317:
                    c23881 = c18237.m42497();
                    if (C1773.m5916(c23881)) {
                        m6981 = (C2105.m6981("۫᩸") + i2) * (-23);
                        i4 = ((m6981 ^ i3) * 30183) ^ 1655542236;
                        i5 = -1373703734;
                    } else {
                        m6981 = (C2105.m6981("ܰۡ") + i3) * (-7);
                        i4 = ((m6981 ^ i2) * 1849) ^ 1544347895;
                        i5 = -858555373;
                    }
                case -1557799028:
                case 1594722325:
                    if (C7106.m19121(c23902.f77278)) {
                        m6981 = (C0630.m2566("۫᩹") ^ i3) * (-61);
                        i4 = ((m6981 ^ i2) * (-10727)) ^ (-1191609164);
                        i5 = 632142616;
                    } else {
                        m6981 = C2105.m6981("ۤۚ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-12221)) ^ 1688914318;
                        i5 = 856070665;
                    }
                case -1508175315:
                case -1257946058:
                    if (C2126.m7040()) {
                        m6981 = (i2 - C2105.m6981("᩻ܰ")) * (-119);
                        i4 = ((m6981 ^ i3) * 22027) ^ 1648139425;
                        i5 = 802667852;
                    } else {
                        m6981 = C2105.m6981("᩻ܶ") ^ i3;
                        i4 = ((m6981 ^ i2) * 953) ^ 2029508762;
                        i5 = -314695326;
                    }
                case -1392265034:
                case 1677810804:
                    str = c23902.f77277;
                    if (C0630.f2410 <= 0) {
                        m6981 = C2105.m6981("᩻ܶ") ^ i3;
                        i4 = ((m6981 ^ i2) * 953) ^ 2029508762;
                        i5 = -314695326;
                    } else {
                        m6981 = (C2105.m6981("ۖۤ") ^ i3) * 49;
                        i4 = ((m6981 ^ i2) * 14601) ^ 2088716852;
                        i5 = -1114379748;
                    }
                case -1245179740:
                case 1039135180:
                    return c23881;
                case -1200264277:
                case -250668545:
                    c18237.m42484(j);
                    if (C0798.m2998() != 0) {
                        m6981 = (C0630.m2566("ܰۤ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((m6981 ^ i3) * 28171) ^ 758493591;
                        i5 = 742813356;
                    } else {
                        m6981 = C2105.m6981("ۧܶ") ^ i3;
                        i4 = ((m6981 ^ i2) * 21359) ^ 464706771;
                        i5 = -620216990;
                    }
                case -1080207529:
                case 498804617:
                    c18237 = C2272.m7511(o.a.m);
                    if (C21923.f70183 != 0) {
                        m6981 = C2105.m6981("ᩴܰ") ^ i3;
                        i4 = ((m6981 ^ i2) * 9391) ^ (-815015235);
                        i5 = 1487402746;
                    } else {
                        m6981 = (i3 - C0630.m2566("᩷֡")) * 39;
                        i4 = ((m6981 ^ i2) * 15103) ^ 1280778950;
                        i5 = 1461678206;
                    }
                case -965540670:
                case 1864744606:
                    c18237.m42485(str);
                    str2 = c23902.f77278;
                    if (C2272.f7362) {
                        m6981 = (C2105.m6981("᩶᩻") + i3) * (-7);
                        i4 = ((m6981 ^ i2) * (-3279)) ^ (-861924921);
                        i5 = -2007237020;
                    } else {
                        m6981 = C0630.m2566("᩵ᩳ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-13809)) ^ 1399245743;
                        i5 = 90828382;
                    }
                case -895858007:
                case 1561073930:
                    c239022.f77277 = str3;
                    c239022.f77279 = str3;
                    m18824(c239022);
                    m6981 = (C2105.m6981("ܰۡ") + i3) * (-7);
                    i4 = ((m6981 ^ i2) * 1849) ^ 1544347895;
                    i5 = -858555373;
                case -100914128:
                case 34086771:
                    c23902 = C5695.m16018();
                    if (c23902 != null) {
                        m6981 = (C2105.m6981("ۖܺ") ^ i2) * (-73);
                        i4 = ((m6981 ^ i3) * (-30715)) ^ (-1697307585);
                        i5 = -186109429;
                    } else {
                        m6981 = (C0630.m2566("۫᩹") ^ i3) * (-61);
                        i4 = ((m6981 ^ i2) * (-10727)) ^ (-1191609164);
                        i5 = 632142616;
                    }
                case 10261641:
                case 420991974:
                    C2958.m9034();
                    return null;
                case 136703337:
                case 1108852645:
                    if (C4117.f13076 <= 0) {
                        m6981 = (i2 - C2105.m6981("᩻ܰ")) * (-119);
                        i4 = ((m6981 ^ i3) * 22027) ^ 1648139425;
                        i5 = 802667852;
                    } else {
                        m6981 = (C0630.m2566("ܰۤ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((m6981 ^ i3) * 28171) ^ 758493591;
                        i5 = 742813356;
                    }
                case 389863994:
                case 1160485058:
                    if (C4117.f13076 <= 0) {
                        m6981 = (i2 - C2105.m6981("᩻ܰ")) * (-119);
                        i4 = ((m6981 ^ i3) * 22027) ^ 1648139425;
                        i5 = 802667852;
                    } else if (C0483.f2088 >= 0) {
                        m6981 = (C0630.m2566("ܰۤ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((m6981 ^ i3) * 28171) ^ 758493591;
                        i5 = 742813356;
                    } else {
                        if (C0483.f2088 < 0) {
                            return new C23881(4);
                        }
                        m6981 = (C2105.m6981("᩶᩻") + i3) * (-7);
                        i4 = ((m6981 ^ i2) * (-3279)) ^ (-861924921);
                        i5 = -2007237020;
                    }
                case 584233674:
                case 1281199754:
                    if (c23881.m52611()) {
                        m6981 = (C2105.m6981("᩷ۨ") + i3) * (-33);
                        i4 = ((m6981 ^ i2) * 12987) ^ 1915812007;
                        i5 = -515617781;
                    } else {
                        m6981 = (i2 - C2105.m6981("֡ܳ")) * 85;
                        i4 = ((m6981 ^ i3) * 18461) ^ (-1306870980);
                        i5 = 829235760;
                    }
                case 1660451921:
                case 2085359104:
                    c239022 = m18811(c23902);
                    str3 = "";
                    if (C4075.f12947 >= 0) {
                        m6981 = (C0630.m2566("ܰۤ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((m6981 ^ i3) * 28171) ^ 758493591;
                        i5 = 742813356;
                    } else {
                        m6981 = C0630.m2566("֡ܶ") ^ i2;
                        i4 = ((m6981 ^ i3) * 6447) ^ 1190423909;
                        i5 = -1456804923;
                    }
                case 1751791154:
                case 2085274655:
                    C0237.m1481();
                    if (C3683.m11222()) {
                        m6981 = C2105.m6981("ᩴܰ") ^ i3;
                        i4 = ((m6981 ^ i2) * 9391) ^ (-815015235);
                        i5 = 1487402746;
                    } else {
                        m6981 = C2105.m6981("᩻ܶ") ^ i3;
                        i4 = ((m6981 ^ i2) * 953) ^ 2029508762;
                        i5 = -314695326;
                    }
                default:
                    C0483.m2120(c18237, str2);
                    j = c23902.f77276;
                    if (RunnableC1937.m6387() != 0) {
                        m6981 = (C2105.m6981("᩶᩻") + i3) * (-7);
                        i4 = ((m6981 ^ i2) * (-3279)) ^ (-861924921);
                        i5 = -2007237020;
                    } else {
                        m6981 = (C0630.m2566("֨ۜ") + i2) * (-55);
                        i4 = ((m6981 ^ i3) * 2875) ^ (-993345766);
                        i5 = 69719813;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (l.C3683.f11629 >= 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        if (l.C1128.f4106 > 0) goto L48;
     */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C23881 m18827() {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6969.m18827():l.᩻ᩴۡ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0048, code lost:
    
        if (l.C1005.m3501() != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0051, code lost:
    
        if (l.C4263.f13799 > 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        r0 = (l.C0630.m2566("ܿۨ") + r11) * (-123);
        r14 = ((r0 ^ r12) * 22757) ^ (-99393542);
        r15 = 273043645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        if (l.ViewOnClickListenerC1958.m6429() >= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        r0 = (r11 - l.C2105.m6981("᩷ۨ")) * (-109);
        r14 = ((r0 ^ r12) * 14459) ^ 2042092395;
        r15 = -632180779;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0060, code lost:
    
        if (l.C2126.f7087 != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        if (l.C3019.f9544 < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a6, code lost:
    
        if (l.RunnableC0588.m2441() >= 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c3, code lost:
    
        if (l.C2958.f9394 >= 0) goto L85;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m18825(l.C21578 r17) {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6969.m18825(l.᩸۫ۡ):byte[]");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m18826(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        byte[] bArr2 = null;
        int i4 = 0;
        int i5 = 0;
        byte[] bArr3 = null;
        MessageDigest messageDigest = null;
        int i6 = -773379593;
        int i7 = C3432.f10845;
        int i8 = AbstractC2021.f6743;
        int m6981 = (C2105.m6981("᩹۠") + i8) * 87;
        int i9 = ((m6981 ^ i7) * (-5947)) ^ (-1653388621);
        int i10 = -871051557;
        while (true) {
            i6 = ((((i6 ^ i7) * (-30689)) >> 31) & i9) ^ (m6981 ^ i10);
            switch (i6) {
                case -2042998383:
                case -1050799428:
                    throw new C17552();
                case -2035853584:
                case 250772720:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = (C0630.m2566("ܽܿ") + i7) * 31;
                        i9 = ((m6981 ^ i8) * (-5013)) ^ (-1734526903);
                        i10 = -783815269;
                    } else {
                        m6981 = (i8 - C0630.m2566("ܿۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i9 = ((m6981 ^ i7) * (-9351)) ^ 560317421;
                        i10 = -1501641115;
                    }
                case -2021210492:
                case 2045533476:
                    if (C2272.f7362) {
                        m6981 = (C0630.m2566("ܳۤ") ^ i7) * 123;
                        i9 = ((m6981 ^ i8) * 2689) ^ 1616138807;
                        i10 = 1066721601;
                    } else {
                        m6981 = (C2105.m6981("۠ۛ") ^ i8) * (-49);
                        i9 = ((m6981 ^ i7) * (-1625)) ^ (-2110278286);
                        i10 = -1934666281;
                    }
                case -1751036656:
                case 25282350:
                    C1047.m3599();
                    if (C3537.m10746() > 0) {
                        m6981 = (C0630.m2566("ܳۤ") ^ i7) * 123;
                        i9 = ((m6981 ^ i8) * 2689) ^ 1616138807;
                        i10 = 1066721601;
                    } else {
                        m6981 = C2105.m6981("ۗۤ") ^ i8;
                        i9 = ((m6981 ^ i7) * 17807) ^ (-1618282083);
                        i10 = -390276196;
                    }
                case -1646947065:
                case 1834087688:
                    if (C0382.f1805) {
                        m6981 = (C0630.m2566("۬ۡ") + i7) * 123;
                        i9 = ((m6981 ^ i8) * 23447) ^ 2121881062;
                        i10 = 600056475;
                    } else {
                        m6981 = C0630.m2566("ۧ۬") ^ i8;
                        i9 = ((m6981 ^ i7) * 30127) ^ 1234045829;
                        i10 = 1981630603;
                    }
                case -1431300314:
                case 586551796:
                    if (C2958.f9394 >= 0) {
                        m6981 = (C2105.m6981("᩺۠") ^ i7) * (-9);
                        i9 = ((m6981 ^ i8) * (-30711)) ^ (-788280649);
                        i10 = -1548985300;
                    } else {
                        m6981 = C2105.m6981("ۧܳ") ^ i7;
                        i9 = ((m6981 ^ i8) * (-21137)) ^ (-1441106295);
                        i10 = -1142490380;
                    }
                case -1254056018:
                case -786649896:
                    i3 = bArr.length - i2;
                    if (C0422.f1886 <= 0) {
                        m6981 = C0630.m2566("ۧ۬") ^ i8;
                        i9 = ((m6981 ^ i7) * 30127) ^ 1234045829;
                        i10 = 1981630603;
                    } else {
                        m6981 = (i8 - C0630.m2566("ۧ᩺")) * (-19);
                        i9 = ((m6981 ^ i7) * 5483) ^ 1489901056;
                        i10 = -1702003428;
                    }
                case -1190867267:
                case 2126345992:
                    i = bArr.length;
                    if (C2105.f7037 != 0) {
                        m6981 = C2105.m6981("ۗۤ") ^ i8;
                        i9 = ((m6981 ^ i7) * 17807) ^ (-1618282083);
                        i10 = -390276196;
                    } else {
                        m6981 = (i8 - C0630.m2566("ۖۚ")) * (-83);
                        i9 = ((m6981 ^ i7) * (-3815)) ^ (-869669428);
                        i10 = -1951689957;
                    }
                case -1105817870:
                case 1352573045:
                    C0382.m1848();
                    if (C0964.f3626 == 0) {
                        m6981 = C0630.m2566("ۧ۬") ^ i8;
                        i9 = ((m6981 ^ i7) * 30127) ^ 1234045829;
                        i10 = 1981630603;
                    } else {
                        m6981 = (C0630.m2566("ܳۤ") ^ i7) * 123;
                        i9 = ((m6981 ^ i8) * 2689) ^ 1616138807;
                        i10 = 1066721601;
                    }
                case -1072003608:
                case 770387130:
                    if (C5695.f17556 >= 0) {
                        m6981 = C0630.m2566("ۧ۬") ^ i8;
                        i9 = ((m6981 ^ i7) * 30127) ^ 1234045829;
                        i10 = 1981630603;
                    } else {
                        m6981 = C2105.m6981("֨᩹") ^ i7;
                        i9 = ((m6981 ^ i8) * 26511) ^ 1264850566;
                        i10 = 848450685;
                    }
                case -923554509:
                case 1133427966:
                    if (MessageDigest.isEqual(bArr3, messageDigest.digest(bArr2))) {
                        m6981 = C0630.m2566("۟᩵") ^ i8;
                        i9 = ((m6981 ^ i7) * (-10395)) ^ 680404705;
                        i10 = 842778047;
                    } else {
                        m6981 = (C2105.m6981("۟ܰ") + i7) * (-91);
                        i9 = ((m6981 ^ i8) * (-14459)) ^ (-755385151);
                        i10 = -977042673;
                    }
                case -724704435:
                case -439713569:
                    i2 = 32;
                    if (i >= 32) {
                        m6981 = C0630.m2566("᩸ۡ") ^ i7;
                        i9 = ((m6981 ^ i8) * 15021) ^ (-1947154068);
                        i10 = 1678494873;
                    } else {
                        m6981 = C0630.m2566("ۡ᩸") ^ i8;
                        i9 = ((m6981 ^ i7) * (-13065)) ^ 1609374505;
                        i10 = -1745587576;
                    }
                case -706971911:
                case 384924570:
                    bArr3 = Arrays.copyOfRange(bArr, i4, i5);
                    messageDigest = C14460.m34534();
                    if (C11340.f33930 >= 0) {
                        m6981 = (C2105.m6981("᩺۠") ^ i7) * (-9);
                        i9 = ((m6981 ^ i8) * (-30711)) ^ (-788280649);
                        i10 = -1548985300;
                    } else {
                        m6981 = C2105.m6981("᩹ۜ") ^ i7;
                        i9 = ((m6981 ^ i8) * (-4399)) ^ 407010917;
                        i10 = -157688747;
                    }
                case -652716188:
                case 199511244:
                    bArr2 = Arrays.copyOf(bArr, i3);
                    if (C21923.f70183 != 0) {
                        m6981 = C2105.m6981("ۗۤ") ^ i8;
                        i9 = ((m6981 ^ i7) * 17807) ^ (-1618282083);
                        i10 = -390276196;
                    } else {
                        m6981 = C2105.m6981("ۨܺ") ^ i7;
                        i9 = ((m6981 ^ i8) * 14071) ^ (-1077714411);
                        i10 = 347874096;
                    }
                case -511032518:
                case 548871149:
                    ServiceConnectionC3453.m10564();
                    return null;
                case 778615450:
                case 1687266634:
                    return bArr2;
                case 1020591085:
                case 1699083971:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = (C0630.m2566("ܳۤ") ^ i7) * 123;
                        i9 = ((m6981 ^ i8) * 2689) ^ 1616138807;
                        i10 = 1066721601;
                    } else {
                        m6981 = (C2105.m6981("᩺۠") ^ i7) * (-9);
                        i9 = ((m6981 ^ i8) * (-30711)) ^ (-788280649);
                        i10 = -1548985300;
                    }
                case 1063389986:
                case 2143046901:
                    C4075.m12263();
                    C21923.m49329();
                    m6981 = C0630.m2566("ۧ۬") ^ i8;
                    i9 = ((m6981 ^ i7) * 30127) ^ 1234045829;
                    i10 = 1981630603;
                case 1500462533:
                case 1689702482:
                    throw new C17552();
                default:
                    i4 = bArr2.length;
                    i5 = bArr.length;
                    if (C1047.f3863 >= 0) {
                        m6981 = (C0630.m2566("ܽܿ") + i7) * 31;
                        i9 = ((m6981 ^ i8) * (-5013)) ^ (-1734526903);
                        i10 = -783815269;
                    } else {
                        m6981 = C0630.m2566("ܳܰ") ^ i8;
                        i9 = ((m6981 ^ i7) * 15891) ^ 878203169;
                        i10 = -2089410777;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18816(C21578 c21578, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        IOException e = null;
        boolean z = false;
        int i = -175553367;
        int i2 = C4263.f13799;
        int i3 = ViewOnClickListenerC1958.f6529;
        int m2566 = C0630.m2566("ۛ᩺") ^ i2;
        int i4 = ((m2566 ^ i3) * (-10399)) ^ 32491809;
        int i5 = 822616678;
        while (true) {
            i = ((((i ^ i3) * 19637) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1980320790:
                case 168319608:
                    if (C2126.f7087) {
                        m2566 = C2105.m6981("ۡܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-5121)) ^ 1487487487;
                        i5 = 1126016949;
                    } else {
                        m2566 = C2105.m6981("᩹᩹") ^ i3;
                        i4 = ((m2566 ^ i2) * 22249) ^ (-1484540568);
                        i5 = -1189497375;
                    }
                case -1792249831:
                case 1001658797:
                    if (C0050.m940() > 0) {
                        m2566 = (i2 - C2105.m6981("ۨۘ")) * (-105);
                        i4 = ((m2566 ^ i3) * 1697) ^ (-352137188);
                        i5 = -1502607702;
                    } else {
                        m2566 = C2105.m6981("᩺ۙ") ^ i2;
                        i4 = ((m2566 ^ i3) * 21385) ^ 634014838;
                        i5 = 507605004;
                    }
                case -1748342213:
                case 288137295:
                    return;
                case -1707546669:
                case 169680979:
                    if (C1504.m5179()) {
                        m2566 = C2105.m6981("᩺ۙ") ^ i2;
                        i4 = ((m2566 ^ i3) * 21385) ^ 634014838;
                        i5 = 507605004;
                    } else {
                        m2566 = C2105.m6981("ۡܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-5121)) ^ 1487487487;
                        i5 = 1126016949;
                    }
                case -1687991728:
                case 1852721487:
                    if (z) {
                        m2566 = C2105.m6981("ۤܰ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-3925)) ^ (-116867707);
                        i5 = -1008135488;
                    } else {
                        m2566 = (C2105.m6981("ۤ۬") + i3) * (-21);
                        i4 = ((m2566 ^ i2) * (-20407)) ^ (-1291654857);
                        i5 = -1038842690;
                    }
                case -1447125003:
                case 1868867758:
                    if (C2167.m7155()) {
                        m2566 = C2105.m6981("᩺ۙ") ^ i2;
                        i4 = ((m2566 ^ i3) * 21385) ^ 634014838;
                        i5 = 507605004;
                    } else {
                        m2566 = (C0630.m2566("ۜ᩸") ^ i2) * 41;
                        i4 = ((m2566 ^ i3) * (-5871)) ^ 1214944452;
                        i5 = 1263142870;
                    }
                case -1414502023:
                case -619318037:
                    throw new IOException();
                    break;
                case -1109762609:
                case 469088050:
                    if (C2105.f7037 != 0) {
                        m2566 = (i2 - C0630.m2566("۬ܿ")) * (-61);
                        i4 = ((m2566 ^ i3) * 3743) ^ (-2128487432);
                        i5 = -1943917332;
                    } else {
                        m2566 = C2105.m6981("ۜۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * 32135) ^ 122681489;
                        i5 = -1045372455;
                    }
                case -1034588041:
                case 60836827:
                    if (C7811.f24123 >= 0) {
                        m2566 = C2105.m6981("ۧۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-28905)) ^ (-691198752);
                        i5 = -1055979267;
                    } else {
                        m2566 = (C2105.m6981("ۧۡ") ^ i3) * (-125);
                        i4 = ((m2566 ^ i2) * 11867) ^ 909984231;
                        i5 = 1666926509;
                    }
                case -979818045:
                case 1309281812:
                    C3019.m9255();
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m2566 = C2105.m6981("᩺ۙ") ^ i2;
                        i4 = ((m2566 ^ i3) * 21385) ^ 634014838;
                        i5 = 507605004;
                    } else {
                        m2566 = C2105.m6981("ۧۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-28905)) ^ (-691198752);
                        i5 = -1055979267;
                    }
                case -783753794:
                case 1281543305:
                    if (C2126.m7040()) {
                        m2566 = (C0630.m2566("֨ۘ") ^ i3) * 45;
                        i4 = ((m2566 ^ i2) * 20509) ^ 1066863600;
                        i5 = -2078268113;
                    } else {
                        m2566 = (i2 - C2105.m6981("ۨۘ")) * (-105);
                        i4 = ((m2566 ^ i3) * 1697) ^ (-352137188);
                        i5 = -1502607702;
                    }
                case -647150708:
                case 677076532:
                    try {
                        fileOutputStream.write(bArr);
                        fileOutputStream.getFD().sync();
                        c21578.m48739(fileOutputStream);
                        z = Arrays.equals(bArr, c21578.m48741());
                        m2566 = C2105.m6981("ۚۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-16717)) ^ 1371878473;
                        i5 = 1513274154;
                    } catch (IOException e2) {
                        e = e2;
                        m2566 = (C0630.m2566("ۚ᩸") + i3) * (-89);
                        i4 = ((m2566 ^ i2) * (-4909)) ^ 1515342746;
                        i5 = -48259538;
                    }
                case -491575138:
                case 389996539:
                    if (C0798.f2919) {
                        m2566 = (C0630.m2566("ᩳۖ") ^ i2) * (-121);
                        i4 = ((m2566 ^ i3) * (-26913)) ^ (-1812907567);
                        i5 = 1936546148;
                    } else {
                        m2566 = C2105.m6981("ۧۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-28905)) ^ (-691198752);
                        i5 = -1055979267;
                    }
                case -489748505:
                case -169077894:
                    fileOutputStream = c21578.m48745();
                    m2566 = (i2 - C2105.m6981("֡ܰ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((m2566 ^ i3) * 14761) ^ 214824374;
                    i5 = -986661915;
                case -416516154:
                case 1113015197:
                    c21578.m48738(fileOutputStream);
                    throw e;
                case -315007242:
                case -260628791:
                    if (C0237.f1507 != 0) {
                        m2566 = (i2 - C2105.m6981("ۨۘ")) * (-105);
                        i4 = ((m2566 ^ i3) * 1697) ^ (-352137188);
                        i5 = -1502607702;
                    } else {
                        m2566 = C0630.m2566("ᩳۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * 9635) ^ (-1289524710);
                        i5 = -1646162935;
                    }
                case 89449905:
                case 771677040:
                    if (C2105.f7037 != 0) {
                        m2566 = (C0630.m2566("֨ۘ") ^ i3) * 45;
                        i4 = ((m2566 ^ i2) * 20509) ^ 1066863600;
                        i5 = -2078268113;
                    } else {
                        m2566 = (i2 - C0630.m2566("ۙۢ")) * 95;
                        i4 = ((m2566 ^ i3) * (-24367)) ^ 184611214;
                        i5 = 1466008872;
                    }
                case 440367885:
                case 791238837:
                    if (C1294.f4556 >= 0) {
                        m2566 = (i2 - C0630.m2566("۬ܿ")) * (-61);
                        i4 = ((m2566 ^ i3) * 3743) ^ (-2128487432);
                        i5 = -1943917332;
                    } else {
                        m2566 = (i3 - C2105.m6981("᩻۫")) * (-93);
                        i4 = ((m2566 ^ i2) * 23093) ^ (-1140507940);
                        i5 = 1808770471;
                    }
                case 553499554:
                case 1609183521:
                    C3537.m10746();
                    return;
                case 615955001:
                case 966147879:
                    if (C1294.m4372() <= 0) {
                        m2566 = (i2 - C0630.m2566("۬ܿ")) * (-61);
                        i4 = ((m2566 ^ i3) * 3743) ^ (-2128487432);
                        i5 = -1943917332;
                    } else {
                        m2566 = (i2 - C2105.m6981("ܶ۬")) * (-105);
                        i4 = ((m2566 ^ i3) * 13481) ^ (-27368675);
                        i5 = 1153750153;
                    }
                case 697416066:
                case 1038218965:
                    if (C0798.f2919) {
                        m2566 = (C0630.m2566("ᩳۖ") ^ i2) * (-121);
                        i4 = ((m2566 ^ i3) * (-26913)) ^ (-1812907567);
                        i5 = 1936546148;
                    } else {
                        m2566 = C2105.m6981("᩷۠") ^ i3;
                        i4 = ((m2566 ^ i2) * (-11883)) ^ 1980396982;
                        i5 = 1310712947;
                    }
                case 981496969:
                case 1980701297:
                    if (C4117.f13076 <= 0) {
                        m2566 = C2105.m6981("᩺ۙ") ^ i2;
                        i4 = ((m2566 ^ i3) * 21385) ^ 634014838;
                        i5 = 507605004;
                    } else {
                        m2566 = C2105.m6981("᩺ᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * 2653) ^ (-238584721);
                        i5 = 1840698410;
                    }
                default:
                    C3746.m11369();
                    C22628.m50615();
                    m2566 = (i2 - C2105.m6981("ۨۘ")) * (-105);
                    i4 = ((m2566 ^ i3) * 1697) ^ (-352137188);
                    i5 = -1502607702;
            }
        }
    }
}
