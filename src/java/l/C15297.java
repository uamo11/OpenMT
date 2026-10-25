package l;

import android.annotation.SuppressLint;
import bin.mt.plugin.api.LocalString;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import moe.shizuku.server.IShizukuService;
import org.json.JSONException;

/* compiled from: B3Z3 */
/* renamed from: l.ܶܳ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15297 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    @SuppressLint({"SimpleDateFormat"})
    public static final SimpleDateFormat f46929;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C20510 f46930;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C20510 f46931;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final StringBuilder f46932;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String f46933;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String f46934;

    /* renamed from: ᩷ۛۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f46935 = {4349, -21447, -21447, -21429, -21476, -21476, -21429, -21502, -21502, -21409, -21470, -21470, -21470, 8669, 8648, 8660, 8653, 8671, 8657, 8662, 8598, 8660, 8663, 8671, 724, 8063, 7971, 8063, 9387, 19133, 19126, 19121, 19185, 19122, 19115, 19185, 19119, 19123, 19114, 19128, 19126, 19121, 19185, 19116, 19110, 19116, 19115, 19130, 19122, 5365, 9025, 9036, 9025, 2818, -26109, -26005, -25986, -26070, -26023, -25985, -25990, -25990, -25992, -26001, -25991, -25991, -26001, -26002, -26064, -26070, -26109, -26039, -26005, -25985, -25991, -26001, -26002, -26070, -26008, -25997, -26064, -26070, -25380, -25379, -25390, -25389, -25392, -25391, -25386, -25387, -25366, -25365, -25368, -25362, -25361, -25364, -25363, -25374, -25375, -25370, 193, -31938, -31892, -31884, -31874, -31899, -31884, -31902, -31877, -31882, -31899, -31977, -31899, -31886, -31887, -31886, -31899, -31886, -31879, -31884, -31886, -31987, -31894, -31938, -31975, -31975, -31975, -31977, -31977, -31910, -31912, -31931, -31918, -31938, -31914, -31933, -31977, -31938, -31900, -31934, -31929, -31929, -31931, -31918, -31932, -31932, -31918, -31917, -31987, -31977, -31263, -31264, -31249, -31250, -31251, -31252, -31253, -31256, -31273, -31274, -31275, -31277, -31278, -31279, -31280, -31265, -31268, -31269, -31884, -31914, -31934, -31932, -31918, -31917, -31977, -31915, -31922, -31987, -31977, 9510, -12446, -12418, -12441, -12427, -12421, -12420, -12484, -12418, -12419, -12427, 5379, -18395, -18392, -18393, -18386, 4766, 24693};

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static Writer f46936;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m36307() {
        short s = f46935[13];
        int i = (s * 15194) - ((s * s) + 57714409) > 0 ? 48145 : 8632;
        synchronized (C15297.class) {
            new File(C4925.m14322(), C1420.m4902(f46935, 14, 10, i)).delete();
            f46936 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m36310(String str, String str2) {
        short s = f46935[49];
        int i = ((s * s) + 227195329) - (s * 30146) < 0 ? 37984 : 9057;
        synchronized (C15297.class) {
            if (f46936 == null) {
                m36315();
                if (f46936 == null) {
                    return;
                }
            }
            StringBuilder sb = f46932;
            int i2 = 0;
            sb.setLength(0);
            C1420.m4905(sb, f46929.format(C2958.m9026(ViewOnClickListenerC1958.m6432())));
            C1420.m4905(sb, C3432.m10488(f46935, 50, 3, i));
            C1420.m4905(sb, str);
            int m1493 = C0237.m1493(sb);
            int m12362 = C4117.m12362(str2, 10);
            boolean z = true;
            int i3 = 0;
            while (m12362 != -1) {
                m36308(i3, m12362, z ? 0 : m1493, str2);
                i3 = m12362 + 1;
                m12362 = str2.indexOf(10, i3);
                z = false;
            }
            if (z || i3 != C1711.m5741(str2)) {
                int m5741 = C1711.m5741(str2);
                if (!z) {
                    i2 = m1493;
                }
                m36308(i3, m5741, i2, str2);
            }
            try {
                f46936.write(C0422.m1959(f46932));
                f46936.flush();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static LocalString m36318() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 2108413203;
        int i7 = C1047.f3863;
        int i8 = ViewOnClickListenerC1958.f6529;
        int m2566 = (i8 - C0630.m2566("ۙ۠")) * 123;
        int i9 = ((m2566 ^ i7) * 29513) ^ 2133483243;
        int i10 = 180928744;
        while (true) {
            i6 = ((((i6 ^ i7) * (-14423)) >> 31) & i9) ^ (m2566 ^ i10);
            switch (i6) {
                case -1950564268:
                case 659677648:
                    C1916.m6308();
                    if (C0050.m940() > 0) {
                        m2566 = C0630.m2566("ܽܶ") ^ i7;
                        i9 = ((m2566 ^ i8) * 31571) ^ 1328092531;
                        i10 = 843817539;
                    } else {
                        m2566 = C2105.m6981("ۙۙ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-27273)) ^ (-1048162104);
                        i10 = 336697755;
                    }
                case -1933724386:
                case -1645433964:
                    return f46931;
                case -1570393724:
                case -990966530:
                    i5 = 47177;
                    m2566 = C0630.m2566("֨۠") ^ i7;
                    i9 = ((m2566 ^ i8) * (-221)) ^ (-1261822981);
                    i10 = 784136854;
                case -1566213079:
                case 670988471:
                    if (C1128.f4106 <= 0) {
                        m2566 = C2105.m6981("ۙۙ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-27273)) ^ (-1048162104);
                        i10 = 336697755;
                    } else {
                        m2566 = C2105.m6981("۟ۚ") ^ i7;
                        i9 = ((m2566 ^ i8) * 17139) ^ 1267120059;
                        i10 = -1440137374;
                    }
                case -1554849739:
                case -1416140268:
                    if (C3746.f11829 <= 0) {
                        m2566 = C2105.m6981("ۗ۬") ^ i8;
                        i9 = ((m2566 ^ i7) * (-12825)) ^ (-1900972949);
                        i10 = -2023552757;
                    } else {
                        m2566 = C2105.m6981("ۨ֫") ^ i7;
                        i9 = ((m2566 ^ i8) * 3987) ^ (-1960493958);
                        i10 = -70063148;
                    }
                case -1551639995:
                case -1087160141:
                    C4263.m12819();
                    return null;
                case -1547417145:
                case 1263705806:
                    if (f46931 == null) {
                        m2566 = (C2105.m6981("᩺ۗ") ^ i8) * 65;
                        i9 = ((m2566 ^ i7) * 527) ^ (-1512191005);
                        i10 = 1438625484;
                    } else {
                        m2566 = C0630.m2566("᩹ۙ") ^ i7;
                        i9 = ((m2566 ^ i8) * 30901) ^ 627871868;
                        i10 = 29789175;
                    }
                case -1276980260:
                case -340915042:
                    i4 = i2 + i3;
                    if (C0964.f3626 != 0) {
                        m2566 = C0630.m2566("ܽܶ") ^ i7;
                        i9 = ((m2566 ^ i8) * 31571) ^ 1328092531;
                        i10 = 843817539;
                    } else {
                        m2566 = C2105.m6981("ۨᩴ") ^ i7;
                        i9 = ((m2566 ^ i8) * 7563) ^ 1458354672;
                        i10 = -1214214292;
                    }
                case -1172797969:
                case -750749751:
                    C1916.m6308();
                    if (C3683.f11629 < 0) {
                        m2566 = C0630.m2566("ܽܶ") ^ i7;
                        i9 = ((m2566 ^ i8) * 31571) ^ 1328092531;
                        i10 = 843817539;
                    } else {
                        m2566 = (i8 - C0630.m2566("ۙ᩹")) * 21;
                        i9 = ((m2566 ^ i7) * (-6343)) ^ (-982974908);
                        i10 = 1149083370;
                    }
                case -894303461:
                case -675662643:
                    i2 = s * s;
                    i3 = 186896241;
                    if (C1916.f6442) {
                        m2566 = C2105.m6981("᩺ᩴ") ^ i7;
                        i9 = ((m2566 ^ i8) * (-31439)) ^ (-2026419610);
                        i10 = 1050253711;
                    } else {
                        m2566 = C2105.m6981("۟ۚ") ^ i7;
                        i9 = ((m2566 ^ i8) * 17139) ^ 1267120059;
                        i10 = -1440137374;
                    }
                case -700870109:
                case 1990866302:
                    s = sArr[c];
                    if (C11340.m28031()) {
                        m2566 = C0630.m2566("ۚ᩻") ^ i7;
                        i9 = ((m2566 ^ i8) * (-7465)) ^ (-71126960);
                        i10 = 1391134807;
                    } else {
                        m2566 = C2105.m6981("ۙۙ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-27273)) ^ (-1048162104);
                        i10 = 336697755;
                    }
                case -543956001:
                case -66665242:
                    s2 = 13671;
                    if (C7811.f24123 >= 0) {
                        m2566 = C2105.m6981("۟ۚ") ^ i7;
                        i9 = ((m2566 ^ i8) * 17139) ^ 1267120059;
                        i10 = -1440137374;
                    } else {
                        m2566 = (i8 - C2105.m6981("ܽۗ")) * (-35);
                        i9 = ((m2566 ^ i7) * (-119)) ^ (-1854644773);
                        i10 = -1893363603;
                    }
                case -261768956:
                case 116549855:
                    int i11 = s + s2;
                    i = i11 * i11;
                    if (C1773.m5908() <= 0) {
                        m2566 = C2105.m6981("ۗ۬") ^ i8;
                        i9 = ((m2566 ^ i7) * (-12825)) ^ (-1900972949);
                        i10 = -2023552757;
                    } else {
                        m2566 = C2105.m6981("ۧۛ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-15533)) ^ (-1229461912);
                        i10 = -1634632712;
                    }
                case 167191782:
                case 249300456:
                    short[] sArr2 = f46935;
                    if (C3683.f11629 >= 0) {
                        m2566 = C2105.m6981("۟ۚ") ^ i7;
                        i9 = ((m2566 ^ i8) * 17139) ^ 1267120059;
                        i10 = -1440137374;
                    } else {
                        if (!C2272.f7362 && C3537.f11231 < 0) {
                            f46931 = new C20510(C0714.m2816(sArr2, 191, 4, i5));
                            m2566 = C0630.m2566("᩹ۙ") ^ i7;
                            i9 = ((m2566 ^ i8) * 30901) ^ 627871868;
                            i10 = 29789175;
                        }
                        m2566 = C0630.m2566("ܽܶ") ^ i7;
                        i9 = ((m2566 ^ i8) * 31571) ^ 1328092531;
                        i10 = 843817539;
                    }
                    break;
                case 753797970:
                case 1719556696:
                    sArr = f46935;
                    c = 190;
                    if (C0422.m1963()) {
                        m2566 = (C0630.m2566("ۨ᩻") ^ i8) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i9 = ((m2566 ^ i7) * 25517) ^ (-120996120);
                        i10 = -2012268944;
                    } else {
                        m2566 = C0630.m2566("ܽܶ") ^ i7;
                        i9 = ((m2566 ^ i8) * 31571) ^ 1328092531;
                        i10 = 843817539;
                    }
                case 1077077644:
                case 1290268886:
                    C3537.m10746();
                    C2272.m7503();
                    m2566 = C0630.m2566("ܽܶ") ^ i7;
                    i9 = ((m2566 ^ i8) * 31571) ^ 1328092531;
                    i10 = 843817539;
                case 1932862643:
                case 2004971989:
                    i5 = 43831;
                    m2566 = C0630.m2566("֨۠") ^ i7;
                    i9 = ((m2566 ^ i8) * (-221)) ^ (-1261822981);
                    i10 = 784136854;
                default:
                    if ((i4 + i4) - i >= 0) {
                        m2566 = C2105.m6981("ܳ᩺") ^ i8;
                        i9 = ((m2566 ^ i7) * (-24301)) ^ 1565101569;
                        i10 = -1865658002;
                    } else {
                        m2566 = C0630.m2566("ۖۖ") ^ i8;
                        i9 = ((m2566 ^ i7) * 21531) ^ (-176048948);
                        i10 = 655776324;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x017e, code lost:
    
        if (l.C0382.m1848() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019d, code lost:
    
        if (l.ViewOnClickListenerC1958.f6529 > 0) goto L41;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m36312(java.lang.Throwable r45, java.lang.StringBuilder r46, java.lang.StackTraceElement[] r47, java.lang.String r48, java.lang.String r49, java.util.Set r50) {
        /*
            Method dump skipped, instructions count: 3358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15297.m36312(java.lang.Throwable, java.lang.StringBuilder, java.lang.StackTraceElement[], java.lang.String, java.lang.String, java.util.Set):void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m36316() {
        String str = null;
        String str2 = null;
        int i = 1481973079;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = C3746.f11829;
        int m2566 = (i3 - C0630.m2566("۟۫")) * 95;
        int i4 = ((m2566 ^ i2) * 20935) ^ 2070987860;
        int i5 = 745855830;
        while (true) {
            i = ((((i ^ i2) * (-967)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1889323691:
                case 103066417:
                    str = f46933;
                    if (C1047.f3863 >= 0) {
                        m2566 = C2105.m6981("ۜ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * 28641) ^ (-1174539363);
                        i5 = 1234205535;
                    } else {
                        m2566 = C2105.m6981("ۙۚ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-1647)) ^ (-1666382236);
                        i5 = 2049228786;
                    }
                case -1446898287:
                case 428317896:
                    if (C2958.f9394 >= 0) {
                        m2566 = (C0630.m2566("᩻۟") + i3) * (-23);
                        i4 = ((m2566 ^ i2) * 32245) ^ 729794142;
                        i5 = -563011140;
                    } else {
                        m2566 = C2105.m6981("ۢۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-28579)) ^ (-1653499612);
                        i5 = 95275258;
                    }
                case -1356772119:
                case 838948672:
                    C2272.m7503();
                    return null;
                case -1346823779:
                case 550328488:
                    C1128.m3851();
                    if (C4117.f13076 > 0) {
                        m2566 = C0630.m2566("ܶ۬") ^ i2;
                        i4 = ((m2566 ^ i3) * (-14361)) ^ (-766662109);
                        i5 = -1792126935;
                    } else {
                        m2566 = (C0630.m2566("᩻۟") + i3) * (-23);
                        i4 = ((m2566 ^ i2) * 32245) ^ 729794142;
                        i5 = -563011140;
                    }
                case -1207569365:
                case 731787859:
                    if (C22628.f73083 <= 0) {
                        m2566 = (i3 - C0630.m2566("۬ܿ")) * (-27);
                        i4 = ((m2566 ^ i2) * (-6089)) ^ (-746560766);
                        i5 = -2012349965;
                    } else {
                        m2566 = (C2105.m6981("۬᩺") ^ i3) * (-61);
                        i4 = ((m2566 ^ i2) * (-629)) ^ 1231154649;
                        i5 = 850494251;
                    }
                case -1164391133:
                case 772260068:
                    if (C0798.f2919) {
                        m2566 = (i3 - C0630.m2566("۬ܿ")) * (-27);
                        i4 = ((m2566 ^ i2) * (-6089)) ^ (-746560766);
                        i5 = -2012349965;
                    } else {
                        m2566 = C0630.m2566("֨۟") ^ i3;
                        i4 = ((m2566 ^ i2) * 173) ^ 1268913102;
                        i5 = 728898756;
                    }
                case -1014768497:
                case 1368305908:
                    if (C3746.f11829 <= 0) {
                        m2566 = (i2 - C2105.m6981("᩸ᩴ")) * (-27);
                        i4 = ((m2566 ^ i3) * 16995) ^ (-803787245);
                        i5 = -1892803750;
                    } else {
                        m2566 = C0630.m2566("ۙۢ") ^ i2;
                        i4 = ((m2566 ^ i3) * 29927) ^ (-385552284);
                        i5 = 905568933;
                    }
                case -974020218:
                case 952592296:
                    str2 = "";
                    m2566 = C0630.m2566("ۘۢ") ^ i2;
                    i4 = ((m2566 ^ i3) * 16313) ^ (-1554205293);
                    i5 = 1861420038;
                case -369601886:
                case 1641717179:
                    if (C7106.m19120() <= 0) {
                        m2566 = (i2 - C2105.m6981("᩸ᩴ")) * (-27);
                        i4 = ((m2566 ^ i3) * 16995) ^ (-803787245);
                        i5 = -1892803750;
                    } else {
                        m2566 = (C2105.m6981("᩸᩷") + i3) * 127;
                        i4 = ((m2566 ^ i2) * (-13615)) ^ (-1745733111);
                        i5 = 1812835334;
                    }
                case -274395961:
                case 498271463:
                    C4159.m12565();
                    m2566 = (i3 - C0630.m2566("۬ܿ")) * (-27);
                    i4 = ((m2566 ^ i2) * (-6089)) ^ (-746560766);
                    i5 = -2012349965;
                case -216248912:
                case 986741563:
                    return str2;
                case -8512897:
                case 720208672:
                    if (C3683.f11629 >= 0) {
                        m2566 = (i2 - C2105.m6981("᩸ᩴ")) * (-27);
                        i4 = ((m2566 ^ i3) * 16995) ^ (-803787245);
                        i5 = -1892803750;
                    } else {
                        m2566 = C2105.m6981("۠ܶ") ^ i3;
                        i4 = ((m2566 ^ i2) * 25409) ^ (-60088380);
                        i5 = 1461090954;
                    }
                case 151415085:
                case 474035565:
                    if (C0382.f1805) {
                        m2566 = C0630.m2566("ܶ۬") ^ i2;
                        i4 = ((m2566 ^ i3) * (-14361)) ^ (-766662109);
                        i5 = -1792126935;
                    } else {
                        m2566 = C2105.m6981("ۜ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * 28641) ^ (-1174539363);
                        i5 = 1234205535;
                    }
                case 835710521:
                case 2146282617:
                    if (str == null) {
                        m2566 = (C2105.m6981("ۖ۟") ^ i3) * (-41);
                        i4 = ((m2566 ^ i2) * (-26883)) ^ 857189017;
                        i5 = -1075777188;
                    } else {
                        str2 = str;
                        m2566 = C0630.m2566("ۘۢ") ^ i2;
                        i4 = ((m2566 ^ i3) * 16313) ^ (-1554205293);
                        i5 = 1861420038;
                    }
                case 841688481:
                case 1286549546:
                    if (C1005.f3721) {
                        m2566 = (i2 - C0630.m2566("֫᩻")) * 81;
                        i4 = ((m2566 ^ i3) * 7209) ^ (-1458998019);
                        i5 = 1618536008;
                    } else {
                        m2566 = (i2 - C2105.m6981("᩸ᩴ")) * (-27);
                        i4 = ((m2566 ^ i3) * 16995) ^ (-803787245);
                        i5 = -1892803750;
                    }
                case 950969096:
                case 1801647642:
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = C2105.m6981("ۜ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * 28641) ^ (-1174539363);
                        i5 = 1234205535;
                    } else {
                        m2566 = (C0630.m2566("ۤܺ") ^ i2) * (-119);
                        i4 = ((m2566 ^ i3) * (-4291)) ^ 559203876;
                        i5 = 1535589186;
                    }
                case 1303110166:
                case 1965464857:
                    if (C11340.f33930 >= 0) {
                        m2566 = C0630.m2566("ܶ۬") ^ i2;
                        i4 = ((m2566 ^ i3) * (-14361)) ^ (-766662109);
                        i5 = -1792126935;
                    } else {
                        m2566 = C2105.m6981("֫ܶ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-10675)) ^ (-231063428);
                        i5 = 2136892102;
                    }
                default:
                    if (C1128.m3851() > 0) {
                        m2566 = (i3 - C0630.m2566("۬ܿ")) * (-27);
                        i4 = ((m2566 ^ i2) * (-6089)) ^ (-746560766);
                        i5 = -2012349965;
                    } else {
                        m2566 = C2105.m6981("ۜ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * 28641) ^ (-1174539363);
                        i5 = 1234205535;
                    }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m36317(String str) {
        f46933 = str;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m36313() {
        String str = null;
        String str2 = null;
        int i = -661820326;
        int i2 = C3019.f9544;
        int i3 = C4117.f13076;
        int m2566 = (i3 - C0630.m2566("ۚܿ")) * (-91);
        int i4 = ((m2566 ^ i2) * 30599) ^ 1915571190;
        int i5 = 426288221;
        while (true) {
            i = ((((i ^ i2) * 8485) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1772519669:
                case 373480720:
                    C7106.m19120();
                    if (RunnableC1108.f4040) {
                        m2566 = C0630.m2566("۬۟") ^ i2;
                        i4 = ((m2566 ^ i3) * 27719) ^ (-1673634329);
                        i5 = 1338227800;
                    } else {
                        m2566 = (C0630.m2566("۬ۘ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((m2566 ^ i2) * (-27549)) ^ 998712162;
                        i5 = 1178439621;
                    }
                case -1729238973:
                case 264766945:
                    if (C4075.f12947 >= 0) {
                        m2566 = C0630.m2566("ܽ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * 23041) ^ (-1770696054);
                        i5 = -1574348358;
                    } else {
                        m2566 = (C0630.m2566("᩶ۨ") + i2) * 73;
                        i4 = ((m2566 ^ i3) * (-20451)) ^ (-333875484);
                        i5 = -1546797212;
                    }
                case -1570576165:
                case 257224384:
                    if (C3019.f9544 >= 0) {
                        m2566 = (C0630.m2566("۬ۘ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((m2566 ^ i2) * (-27549)) ^ 998712162;
                        i5 = 1178439621;
                    } else {
                        m2566 = C2105.m6981("ۨۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * 10159) ^ 168095621;
                        i5 = 801678491;
                    }
                case -1385885357:
                case 1613859286:
                    if (C0714.f2697 >= 0) {
                        m2566 = C2105.m6981("ۨۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * 10159) ^ 168095621;
                        i5 = 801678491;
                    } else {
                        m2566 = C2105.m6981("ᩳܳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29889)) ^ 1819186233;
                        i5 = -572098423;
                    }
                case -1198313551:
                case 710422530:
                    if (C21923.f70183 != 0) {
                        m2566 = C0630.m2566("ܽ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * 23041) ^ (-1770696054);
                        i5 = -1574348358;
                    } else {
                        m2566 = (C2105.m6981("ۤᩳ") ^ i3) * 97;
                        i4 = ((m2566 ^ i2) * 11383) ^ 1487045962;
                        i5 = 2059174379;
                    }
                case -1112117459:
                case 789595733:
                    return str2;
                case -1033244264:
                case -601165055:
                    C1420.m4913();
                    C1128.m3851();
                    m2566 = (C0630.m2566("۬ۘ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i4 = ((m2566 ^ i2) * (-27549)) ^ 998712162;
                    i5 = 1178439621;
                case -900099356:
                case 1166968283:
                    if (RunnableC1108.f4040) {
                        m2566 = C2105.m6981("ۢۚ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-27893)) ^ (-1454992922);
                        i5 = 87168323;
                    } else {
                        m2566 = C0630.m2566("ۛܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12645)) ^ (-2124416468);
                        i5 = -1064288658;
                    }
                case -814911330:
                case 1542046432:
                    if (str == null) {
                        m2566 = C2105.m6981("᩵ۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * 21833) ^ (-1915726993);
                        i5 = -1334340336;
                    } else {
                        str2 = str;
                        m2566 = (i2 - C0630.m2566("֫۠")) * (-73);
                        i4 = ((m2566 ^ i3) * 27119) ^ 1438781134;
                        i5 = 305397080;
                    }
                case -608311371:
                case -323653782:
                    C0422.m1963();
                    return null;
                case -423807822:
                case 1855774399:
                    str2 = "";
                    m2566 = (i2 - C0630.m2566("֫۠")) * (-73);
                    i4 = ((m2566 ^ i3) * 27119) ^ 1438781134;
                    i5 = 305397080;
                case -393002869:
                case 754677672:
                    if (C1047.m3599() >= 0) {
                        m2566 = C2105.m6981("ۨۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * 10159) ^ 168095621;
                        i5 = 801678491;
                    } else {
                        m2566 = C0630.m2566("۠᩺") ^ i3;
                        i4 = ((m2566 ^ i2) * HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS) ^ 1127073745;
                        i5 = 530967822;
                    }
                case -360863497:
                case 1070382615:
                    str = f46934;
                    if (C4075.f12947 >= 0) {
                        m2566 = C0630.m2566("ܽ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * 23041) ^ (-1770696054);
                        i5 = -1574348358;
                    } else {
                        m2566 = C2105.m6981("ۚ֫") ^ i3;
                        i4 = ((m2566 ^ i2) * 20009) ^ (-814723940);
                        i5 = 889948929;
                    }
                case -250166493:
                case 284726054:
                    if (C11340.f33930 >= 0) {
                        m2566 = C2105.m6981("ۨۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * 10159) ^ 168095621;
                        i5 = 801678491;
                    } else {
                        m2566 = (i3 - C2105.m6981("ܶ۫")) * (-81);
                        i4 = ((m2566 ^ i2) * (-27669)) ^ (-1155089419);
                        i5 = -806323723;
                    }
                case 377851841:
                case 1231853619:
                    if (C1916.f6442) {
                        m2566 = C0630.m2566("ۙ۟") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15597)) ^ 1674112208;
                        i5 = -939957548;
                    } else {
                        m2566 = C0630.m2566("ۛܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12645)) ^ (-2124416468);
                        i5 = -1064288658;
                    }
                case 809814617:
                case 2043333673:
                    if (C2126.f7087) {
                        m2566 = C0630.m2566("ܽ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * 23041) ^ (-1770696054);
                        i5 = -1574348358;
                    } else {
                        m2566 = C2105.m6981("᩺۬") ^ i3;
                        i4 = ((m2566 ^ i2) * 27043) ^ (-578534223);
                        i5 = -1717055093;
                    }
                case 1571362589:
                case 1673710519:
                    if (C0237.m1481() >= 0) {
                        m2566 = C0630.m2566("ۛܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12645)) ^ (-2124416468);
                        i5 = -1064288658;
                    } else {
                        m2566 = (C2105.m6981("ᩴ᩻") + i2) * (-73);
                        i4 = ((m2566 ^ i3) * 25329) ^ (-705027245);
                        i5 = 721868087;
                    }
                default:
                    if (C2126.f7087) {
                        m2566 = C0630.m2566("۬۟") ^ i2;
                        i4 = ((m2566 ^ i3) * 27719) ^ (-1673634329);
                        i5 = 1338227800;
                    } else {
                        m2566 = C0630.m2566("ۛܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12645)) ^ (-2124416468);
                        i5 = -1064288658;
                    }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m36314(String str) {
        f46934 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (l.C0630.f2410 <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (l.C2167.f7158 < 0) goto L68;
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m36319() {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15297.m36319():java.lang.String");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m36315() {
        /*
            Method dump skipped, instructions count: 1518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15297.m36315():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0155, code lost:
    
        r11 = l.C0630.m2566("ۢܿ") ^ r10;
        r12 = ((r11 ^ r9) * (-20337)) ^ (-230802819);
        r13 = 545743694;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0185, code lost:
    
        r11 = (l.C0630.m2566("ۡܳ") ^ r9) * 79;
        r12 = ((r11 ^ r10) * (-10137)) ^ (-1458027201);
        r13 = 921541011;
     */
    static {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15297.<clinit>():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36309(String str) {
        short s = f46935[28];
        int i = (s * s) + 14379264;
        int i2 = s + 3792;
        String m9250 = C3019.m9250(f46935, 29, 20, (i2 * i2) - (i + i) <= 0 ? 19167 : 30911);
        synchronized (C15297.class) {
            m36310(m9250, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (l.C7811.f24123 < 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (l.C2958.f9394 < 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
    
        if (l.C22628.f73083 > 0) goto L96;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m36308(int r27, int r28, int r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15297.m36308(int, int, int, java.lang.String):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36311(String str, String str2, Throwable th) {
        int m2566;
        int i;
        int i2;
        String str3;
        int i3;
        int i4;
        short[] sArr;
        short[] sArr2;
        String str4;
        int i5;
        int i6;
        int i7;
        int i8;
        short[] sArr3;
        int i9;
        int i10;
        String str5;
        StackTraceElement stackTraceElement;
        char c;
        int i11;
        int i12;
        int m6981;
        int i13;
        int i14;
        String str6;
        int i15;
        short[] sArr4;
        String str7;
        int i16;
        int i17;
        short[] sArr5;
        int i18;
        int i19;
        String str8;
        StackTraceElement stackTraceElement2;
        int i20;
        char c2;
        StackTraceElement stackTraceElement3;
        int m25662;
        int i21;
        StackTraceElement stackTraceElement4;
        int i22;
        int i23;
        StackTraceElement stackTraceElement5;
        int i24;
        int i25;
        short[] sArr6;
        char c3;
        short[] sArr7;
        int i26;
        int i27;
        String str9;
        String str10;
        int i28;
        int i29;
        int i30;
        int i31;
        short[] sArr8;
        int length;
        String str11;
        String str12;
        StackTraceElement stackTraceElement6;
        int i32;
        int i33;
        short[] sArr9;
        char c4;
        short[] sArr10;
        int i34;
        int i35;
        int i36;
        String str13;
        String str14;
        int i37;
        short[] sArr11;
        int i38;
        int i39;
        int i40;
        short[] sArr12;
        char c5;
        short[] sArr13;
        int i41;
        int i42;
        String str15;
        String str16;
        int i43;
        int i44;
        int i45;
        int i46;
        short[] sArr14;
        StackTraceElement stackTraceElement7;
        int m69812;
        int i47;
        int i48;
        int m25663;
        int i49;
        int i50;
        short[] sArr15;
        StackTraceElement stackTraceElement8;
        char c6;
        short[] sArr16;
        int i51;
        String m9250;
        String str17;
        StackTraceElement stackTraceElement9;
        int i52;
        int i53;
        short[] sArr17;
        short[] sArr18;
        int i54;
        String str18;
        String str19;
        int i55;
        int i56;
        int i57;
        short[] sArr19;
        char c7;
        String str20;
        StackTraceElement stackTraceElement10;
        int i58;
        int i59;
        short[] sArr20;
        short[] sArr21;
        int i60;
        String str21;
        int i61;
        int i62;
        int i63;
        short[] sArr22;
        String str22;
        int i64;
        int i65;
        short[] sArr23;
        int i66;
        String str23;
        String str24;
        int i67;
        int i68;
        int i69;
        short[] sArr24;
        int m69813;
        int i70;
        int i71;
        int m69814;
        int i72;
        int i73;
        short[] sArr25;
        int i74;
        String str25;
        String str26;
        int i75;
        int i76;
        int i77;
        String str27;
        short[] sArr26;
        int i78;
        int i79;
        int i80;
        short[] sArr27 = null;
        short s = 0;
        short s2 = 0;
        int i81 = 0;
        int i82 = 0;
        int i83 = 0;
        int i84 = -826980392;
        int i85 = C0422.f1886;
        int i86 = C1128.f4106;
        int m25664 = C0630.m2566("֫ۧ") ^ i86;
        int i87 = ((m25664 ^ i85) * 8371) ^ (-760280049);
        int i88 = m25664 ^ 2029161596;
        Set set = null;
        StackTraceElement stackTraceElement11 = null;
        String str28 = null;
        String str29 = null;
        String str30 = null;
        short[] sArr28 = null;
        int i89 = 0;
        int i90 = 0;
        StringBuilder sb = null;
        int i91 = 0;
        int i92 = 0;
        int i93 = 0;
        boolean z = false;
        int i94 = 0;
        char c8 = 0;
        int i95 = 0;
        int i96 = 0;
        Throwable[] thArr = null;
        String str31 = null;
        int i97 = 0;
        Throwable th2 = null;
        Throwable th3 = null;
        short[] sArr29 = null;
        short[] sArr30 = null;
        int i98 = 0;
        StackTraceElement[] stackTraceElementArr = null;
        String str32 = null;
        while (true) {
            i84 = i88 ^ (i87 & (((i84 ^ i85) * (-157)) >> 31));
            switch (i84) {
                case -2114313955:
                case 497232408:
                    if (AbstractC2021.m6574()) {
                        str3 = str30;
                        i3 = i91;
                        i4 = i93;
                        sArr = sArr29;
                        sArr2 = sArr28;
                        str4 = str32;
                        i5 = i90;
                        i6 = i97;
                        i7 = i94;
                        i8 = i83;
                        sArr3 = sArr30;
                        i9 = i95;
                        i10 = i96;
                        str5 = str28;
                        stackTraceElement = stackTraceElement11;
                        c = c8;
                        i11 = i98;
                        i12 = i89;
                        m6981 = (C2105.m6981("ۤ۫") ^ i86) * (-121);
                        i87 = ((m6981 ^ i85) * 19533) ^ 1655457084;
                        i13 = -148291767;
                        i23 = m6981 ^ i13;
                        i98 = i11;
                        sArr30 = sArr3;
                        i95 = i9;
                        str32 = str4;
                        i97 = i6;
                        str28 = str5;
                        sArr29 = sArr;
                        str30 = str3;
                        i91 = i3;
                        i88 = i23;
                        i96 = i10;
                        i89 = i12;
                        i94 = i7;
                        sArr28 = sArr2;
                        c8 = c;
                        stackTraceElement11 = stackTraceElement;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    } else {
                        m2566 = C2105.m6981("ۖܶ") ^ i86;
                        i = ((m2566 ^ i85) * (-17437)) ^ (-1324079798);
                        i2 = -2137845563;
                        i88 = m2566 ^ i2;
                        i87 = i;
                    }
                case -2099516850:
                case -1144143870:
                    String str33 = str30;
                    stackTraceElement5 = stackTraceElement11;
                    i24 = i91;
                    i25 = i93;
                    sArr6 = sArr29;
                    int i99 = i96;
                    str9 = str28;
                    str10 = str32;
                    i28 = i90;
                    i29 = i97;
                    i95++;
                    length = i94;
                    c3 = c8;
                    sArr7 = sArr28;
                    i30 = i83;
                    i31 = i98;
                    sArr8 = sArr30;
                    i27 = i89;
                    i26 = i99;
                    str30 = str33;
                    int m25665 = C0630.m2566("᩶ۚ") ^ i85;
                    i98 = i31;
                    sArr30 = sArr8;
                    i83 = i30;
                    str32 = str10;
                    i90 = i28;
                    i89 = i27;
                    str28 = str9;
                    i91 = i24;
                    i93 = i25;
                    c8 = c3;
                    i96 = i26;
                    stackTraceElement11 = stackTraceElement5;
                    i94 = length;
                    i97 = i29;
                    sArr29 = sArr6;
                    i87 = ((m25665 ^ i86) * 7569) ^ 1220166671;
                    i88 = m25665 ^ (-317764245);
                    str30 = str30;
                    sArr28 = sArr7;
                case -2091381830:
                case 159292612:
                    str3 = str30;
                    i3 = i91;
                    i4 = i93;
                    sArr = sArr29;
                    sArr2 = sArr28;
                    str4 = str32;
                    i5 = i90;
                    i6 = i97;
                    i7 = i94;
                    i8 = i83;
                    sArr3 = sArr30;
                    i9 = i95;
                    i10 = i96;
                    str5 = str28;
                    stackTraceElement3 = stackTraceElement11;
                    c = c8;
                    i11 = i98;
                    i12 = i89;
                    z = false;
                    m25662 = (i86 - C0630.m2566("ۜۤ")) * 101;
                    i87 = ((m25662 ^ i85) * (-22995)) ^ 1886459448;
                    i21 = -241274416;
                    int i100 = m25662 ^ i21;
                    i98 = i11;
                    sArr30 = sArr3;
                    i95 = i9;
                    str32 = str4;
                    i97 = i6;
                    i89 = i12;
                    str28 = str5;
                    sArr29 = sArr;
                    i91 = i3;
                    i88 = i100;
                    c8 = c;
                    i96 = i10;
                    i94 = i7;
                    stackTraceElement11 = stackTraceElement3;
                    str30 = str3;
                    sArr28 = sArr2;
                    i83 = i8;
                    i90 = i5;
                    i93 = i4;
                case -2011706323:
                case 1172510716:
                    C1711.m5736();
                    break;
                case -1965879724:
                case 1701989436:
                    str17 = str30;
                    stackTraceElement9 = stackTraceElement11;
                    i52 = i91;
                    i53 = i93;
                    sArr17 = sArr29;
                    sArr18 = sArr28;
                    i54 = i96;
                    str18 = str28;
                    str19 = str32;
                    i55 = i90;
                    i44 = i97;
                    i56 = i83;
                    i57 = i98;
                    sArr19 = sArr30;
                    C1420.m4905(sb, str19);
                    C1128.m3845(sb, stackTraceElement9);
                    c7 = c8;
                    C0630.m2567(sb, c7);
                    int m69815 = (i86 - C2105.m6981("ᩳܳ")) * 19;
                    sArr28 = sArr18;
                    i98 = i57;
                    sArr30 = sArr19;
                    i83 = i56;
                    str32 = str19;
                    i90 = i55;
                    str28 = str18;
                    i91 = i52;
                    i93 = i53;
                    i96 = i54;
                    str30 = str17;
                    StackTraceElement stackTraceElement12 = stackTraceElement9;
                    i87 = ((m69815 ^ i85) * 30249) ^ (-951685587);
                    i89 = i89;
                    c8 = c7;
                    stackTraceElement11 = stackTraceElement12;
                    sArr25 = sArr17;
                    i88 = m69815 ^ 440594554;
                    i97 = i44;
                    sArr29 = sArr25;
                case -1958869180:
                case 835129959:
                    ViewOnClickListenerC1958.m6429();
                    if (RunnableC3474.f10992 > 0) {
                        m2566 = (i85 - C0630.m2566("ۜᩴ")) * (-117);
                        i = ((m2566 ^ i86) * 4893) ^ (-1474765446);
                        i2 = -2126213989;
                        i88 = m2566 ^ i2;
                        i87 = i;
                    } else {
                        str25 = str30;
                        stackTraceElement4 = stackTraceElement11;
                        sArr26 = sArr29;
                        i77 = i96;
                        str27 = str28;
                        i76 = i97;
                        i78 = i91;
                        str26 = str32;
                        i79 = i93;
                        i75 = i90;
                        int m25666 = (C0630.m2566("ۙܺ") + i85) * 45;
                        i22 = ((m25666 ^ i86) * (-14947)) ^ (-1909349887);
                        i88 = m25666 ^ 1629613475;
                        i90 = i75;
                        i97 = i76;
                        sArr29 = sArr26;
                        i93 = i79;
                        str32 = str26;
                        i91 = i78;
                        str28 = str27;
                        i96 = i77;
                        str30 = str25;
                        int i101 = i22;
                        stackTraceElement11 = stackTraceElement4;
                        i87 = i101;
                    }
                case -1948756810:
                case -350910488:
                    str11 = str30;
                    StackTraceElement stackTraceElement13 = stackTraceElement11;
                    i39 = i91;
                    i40 = i93;
                    sArr12 = sArr29;
                    i41 = i96;
                    str15 = str28;
                    str16 = str32;
                    i43 = i90;
                    i44 = i97;
                    if (i89 < i41) {
                        int m69816 = C2105.m6981("֡ۧ") ^ i86;
                        int i102 = ((m69816 ^ i85) * 2541) ^ (-536996899);
                        i74 = m69816 ^ (-689102238);
                        stackTraceElement11 = stackTraceElement13;
                        i87 = i102;
                        str32 = str16;
                        i90 = i43;
                        i97 = i44;
                        str28 = str15;
                        sArr29 = sArr12;
                        i91 = i39;
                        i93 = i40;
                        i96 = i41;
                        i88 = i74;
                        str30 = str11;
                    } else {
                        c5 = c8;
                        sArr13 = sArr28;
                        i45 = i83;
                        i46 = i98;
                        sArr14 = sArr30;
                        i42 = i89;
                        stackTraceElement7 = stackTraceElement13;
                        m69812 = C2105.m6981("ۙۖ") ^ i86;
                        i47 = ((m69812 ^ i85) * 10557) ^ (-1333888612);
                        i48 = 108161949;
                        int i103 = m69812 ^ i48;
                        sArr28 = sArr13;
                        i98 = i46;
                        sArr30 = sArr14;
                        i83 = i45;
                        str32 = str16;
                        i90 = i43;
                        str28 = str15;
                        i91 = i39;
                        i93 = i40;
                        i96 = i41;
                        str30 = str11;
                        char c9 = c5;
                        stackTraceElement11 = stackTraceElement7;
                        i89 = i42;
                        c8 = c9;
                        sArr25 = sArr12;
                        i88 = i103;
                        i87 = i47;
                        i97 = i44;
                        sArr29 = sArr25;
                    }
                case -1910542506:
                case -548223909:
                    C2958.m9034();
                    if (C21923.f70183 != 0) {
                        m2566 = (i85 - C0630.m2566("ۜᩴ")) * (-117);
                        i = ((m2566 ^ i86) * 4893) ^ (-1474765446);
                        i2 = -2126213989;
                        i88 = m2566 ^ i2;
                        i87 = i;
                    } else {
                        str11 = str30;
                        stackTraceElement8 = stackTraceElement11;
                        i39 = i91;
                        i40 = i93;
                        sArr12 = sArr29;
                        i41 = i96;
                        str15 = str28;
                        str16 = str32;
                        i43 = i90;
                        i44 = i97;
                        sArr16 = sArr30;
                        m69814 = (C0630.m2566("ܰܶ") + i85) * (-119);
                        i72 = ((m69814 ^ i86) * (-32299)) ^ 2084493;
                        i73 = 1386937058;
                        i74 = m69814 ^ i73;
                        stackTraceElement11 = stackTraceElement8;
                        i87 = i72;
                        sArr30 = sArr16;
                        str32 = str16;
                        i90 = i43;
                        i97 = i44;
                        str28 = str15;
                        sArr29 = sArr12;
                        i91 = i39;
                        i93 = i40;
                        i96 = i41;
                        i88 = i74;
                        str30 = str11;
                    }
                case -1877457802:
                case -67728488:
                    if (C4117.m12362(str30, C1711.m5733(str28, i89)) != -1) {
                        str17 = str30;
                        stackTraceElement9 = stackTraceElement11;
                        i52 = i91;
                        i53 = i93;
                        sArr17 = sArr29;
                        c7 = c8;
                        sArr18 = sArr28;
                        i54 = i96;
                        str18 = str28;
                        str19 = str32;
                        i55 = i90;
                        i44 = i97;
                        i56 = i83;
                        i57 = i98;
                        sArr19 = sArr30;
                        int m698152 = (i86 - C2105.m6981("ᩳܳ")) * 19;
                        sArr28 = sArr18;
                        i98 = i57;
                        sArr30 = sArr19;
                        i83 = i56;
                        str32 = str19;
                        i90 = i55;
                        str28 = str18;
                        i91 = i52;
                        i93 = i53;
                        i96 = i54;
                        str30 = str17;
                        StackTraceElement stackTraceElement122 = stackTraceElement9;
                        i87 = ((m698152 ^ i85) * 30249) ^ (-951685587);
                        i89 = i89;
                        c8 = c7;
                        stackTraceElement11 = stackTraceElement122;
                        sArr25 = sArr17;
                        i88 = m698152 ^ 440594554;
                        i97 = i44;
                        sArr29 = sArr25;
                    } else {
                        m2566 = C0630.m2566("۠ۤ") ^ i85;
                        i = ((m2566 ^ i86) * 24645) ^ 558938208;
                        i2 = 716779543;
                        i88 = m2566 ^ i2;
                        i87 = i;
                    }
                case -1772011741:
                case 387116359:
                    String m19110 = C7106.m19110(sArr29, i91, i93, i92);
                    str20 = str30;
                    i66 = i96;
                    str23 = str28;
                    i64 = i91;
                    str24 = str32;
                    i65 = i93;
                    i67 = i90;
                    stackTraceElement10 = stackTraceElement11;
                    sArr20 = sArr29;
                    i62 = i97;
                    m36312(th3, sb, stackTraceElementArr, m19110, "", set);
                    sArr23 = sArr28;
                    i68 = i83;
                    i69 = i98;
                    sArr24 = sArr30;
                    m69813 = C0630.m2566("ܽۚ") ^ i85;
                    i70 = ((m69813 ^ i86) * (-18827)) ^ (-508659793);
                    i71 = -969509166;
                    i80 = m69813 ^ i71;
                    sArr28 = sArr23;
                    i98 = i69;
                    sArr30 = sArr24;
                    i83 = i68;
                    str32 = str24;
                    i90 = i67;
                    str28 = str23;
                    i91 = i64;
                    i93 = i65;
                    i96 = i66;
                    str30 = str20;
                    int i104 = i80;
                    stackTraceElement11 = stackTraceElement10;
                    i87 = i70;
                    i97 = i62;
                    sArr29 = sArr20;
                    i88 = i104;
                case -1562728590:
                case 10531193:
                    C3663.m11168();
                    if (!AbstractC2021.m6574()) {
                        str3 = str30;
                        i3 = i91;
                        i4 = i93;
                        sArr = sArr29;
                        sArr2 = sArr28;
                        str4 = str32;
                        i5 = i90;
                        i6 = i97;
                        i7 = i94;
                        i8 = i83;
                        i9 = i95;
                        i10 = i96;
                        str5 = str28;
                        stackTraceElement = stackTraceElement11;
                        c = c8;
                        i11 = i98;
                        i12 = i89;
                        int m25667 = (i86 - C0630.m2566("ܽ᩵")) * (-117);
                        i87 = ((m25667 ^ i85) * (-3207)) ^ 1977819741;
                        i23 = m25667 ^ 1267675418;
                        i98 = i11;
                        i95 = i9;
                        str32 = str4;
                        i97 = i6;
                        str28 = str5;
                        sArr29 = sArr;
                        str30 = str3;
                        i91 = i3;
                        i88 = i23;
                        i96 = i10;
                        i89 = i12;
                        i94 = i7;
                        sArr28 = sArr2;
                        c8 = c;
                        stackTraceElement11 = stackTraceElement;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    }
                    str3 = str30;
                    i3 = i91;
                    i4 = i93;
                    sArr = sArr29;
                    sArr2 = sArr28;
                    str4 = str32;
                    i5 = i90;
                    i6 = i97;
                    i7 = i94;
                    i8 = i83;
                    sArr3 = sArr30;
                    i9 = i95;
                    i10 = i96;
                    str5 = str28;
                    stackTraceElement = stackTraceElement11;
                    c = c8;
                    i11 = i98;
                    i12 = i89;
                    m6981 = (C2105.m6981("ۤ۫") ^ i86) * (-121);
                    i87 = ((m6981 ^ i85) * 19533) ^ 1655457084;
                    i13 = -148291767;
                    i23 = m6981 ^ i13;
                    i98 = i11;
                    sArr30 = sArr3;
                    i95 = i9;
                    str32 = str4;
                    i97 = i6;
                    str28 = str5;
                    sArr29 = sArr;
                    str30 = str3;
                    i91 = i3;
                    i88 = i23;
                    i96 = i10;
                    i89 = i12;
                    i94 = i7;
                    sArr28 = sArr2;
                    c8 = c;
                    stackTraceElement11 = stackTraceElement;
                    i83 = i8;
                    i90 = i5;
                    i93 = i4;
                case -1436679024:
                case 1202372037:
                    stackTraceElement5 = stackTraceElement11;
                    i24 = i91;
                    i25 = i93;
                    sArr6 = sArr29;
                    c3 = c8;
                    sArr7 = sArr28;
                    i26 = i96;
                    i27 = i89;
                    str9 = str28;
                    str10 = str32;
                    i28 = i90;
                    i29 = i97;
                    i30 = i83;
                    i31 = i98;
                    sArr8 = sArr30;
                    C3746.m11367(sb, th);
                    C0630.m2567(sb, c3);
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    i95 = 0;
                    stackTraceElementArr = stackTrace;
                    length = stackTrace.length;
                    int m256652 = C0630.m2566("᩶ۚ") ^ i85;
                    i98 = i31;
                    sArr30 = sArr8;
                    i83 = i30;
                    str32 = str10;
                    i90 = i28;
                    i89 = i27;
                    str28 = str9;
                    i91 = i24;
                    i93 = i25;
                    c8 = c3;
                    i96 = i26;
                    stackTraceElement11 = stackTraceElement5;
                    i94 = length;
                    i97 = i29;
                    sArr29 = sArr6;
                    i87 = ((m256652 ^ i86) * 7569) ^ 1220166671;
                    i88 = m256652 ^ (-317764245);
                    str30 = str30;
                    sArr28 = sArr7;
                case -1418503361:
                case 1327524118:
                    String str34 = str30;
                    StackTraceElement stackTraceElement14 = stackTraceElement11;
                    int i105 = i91;
                    int i106 = i93;
                    short[] sArr31 = sArr29;
                    char c10 = c8;
                    short[] sArr32 = sArr28;
                    int i107 = i96;
                    int i108 = i89;
                    String str35 = str28;
                    String str36 = str32;
                    int i109 = i90;
                    i44 = i97;
                    int i110 = i83;
                    int i111 = i98;
                    short[] sArr33 = sArr30;
                    if (i109 < i44) {
                        m25663 = (C2105.m6981("ᩴ᩸") ^ i86) * 53;
                        i49 = ((m25663 ^ i85) * (-5203)) ^ (-1936846944);
                        i50 = -732484808;
                    } else {
                        m25663 = (C0630.m2566("֫ܺ") + i85) * (-69);
                        i49 = ((m25663 ^ i86) * 29341) ^ 301507739;
                        i50 = 1108889383;
                    }
                    int i112 = m25663 ^ i50;
                    sArr28 = sArr32;
                    i98 = i111;
                    sArr30 = sArr33;
                    i83 = i110;
                    str32 = str36;
                    i90 = i109;
                    str28 = str35;
                    i91 = i105;
                    i93 = i106;
                    i96 = i107;
                    str30 = str34;
                    sArr15 = sArr31;
                    i88 = i112;
                    i89 = i108;
                    c8 = c10;
                    stackTraceElement11 = stackTraceElement14;
                    i87 = i49;
                    i97 = i44;
                    sArr29 = sArr15;
                case -1358670324:
                case 1163422101:
                    str3 = str30;
                    i3 = i91;
                    i4 = i93;
                    sArr = sArr29;
                    sArr2 = sArr28;
                    str4 = str32;
                    i5 = i90;
                    i6 = i97;
                    i7 = i94;
                    i8 = i83;
                    sArr3 = sArr30;
                    i9 = i95;
                    i10 = i96;
                    str5 = str28;
                    stackTraceElement = stackTraceElement11;
                    c = c8;
                    i11 = i98;
                    i12 = i89;
                    i92 = 39434;
                    m6981 = (i85 - C0630.m2566("ۘۖ")) * (-115);
                    i87 = ((m6981 ^ i86) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged) ^ 1836396329;
                    i13 = 404291373;
                    i23 = m6981 ^ i13;
                    i98 = i11;
                    sArr30 = sArr3;
                    i95 = i9;
                    str32 = str4;
                    i97 = i6;
                    str28 = str5;
                    sArr29 = sArr;
                    str30 = str3;
                    i91 = i3;
                    i88 = i23;
                    i96 = i10;
                    i89 = i12;
                    i94 = i7;
                    sArr28 = sArr2;
                    c8 = c;
                    stackTraceElement11 = stackTraceElement;
                    i83 = i8;
                    i90 = i5;
                    i93 = i4;
                case -1102334928:
                case 1709708334:
                    str6 = str30;
                    i15 = i91;
                    i4 = i93;
                    sArr4 = sArr29;
                    sArr2 = sArr28;
                    str7 = str32;
                    i5 = i90;
                    i16 = i97;
                    i17 = i94;
                    i8 = i83;
                    sArr5 = sArr30;
                    i18 = i95;
                    i19 = i96;
                    str8 = str28;
                    stackTraceElement2 = stackTraceElement11;
                    char c11 = c8;
                    i20 = i98;
                    i14 = i89;
                    C1420.m4905(sb, str2);
                    C2105.m6979(sb, c11);
                    c2 = c11;
                    int m69817 = C2105.m6981("ۗ᩵") ^ i86;
                    i98 = i20;
                    sArr30 = sArr5;
                    i95 = i18;
                    str32 = str7;
                    i97 = i16;
                    str28 = str8;
                    sArr29 = sArr4;
                    str30 = str6;
                    i91 = i15;
                    i88 = m69817 ^ 732581576;
                    i87 = ((m69817 ^ i85) * 13197) ^ 431644980;
                    i96 = i19;
                    i94 = i17;
                    stackTraceElement11 = stackTraceElement2;
                    sArr28 = sArr2;
                    i83 = i8;
                    i90 = i5;
                    i93 = i4;
                    int i113 = i14;
                    c8 = c2;
                    i89 = i113;
                case -1085470307:
                case 274007940:
                    str11 = str30;
                    stackTraceElement8 = stackTraceElement11;
                    i39 = i91;
                    i40 = i93;
                    sArr12 = sArr29;
                    i41 = i96;
                    str15 = str28;
                    str16 = str32;
                    i43 = i90;
                    i44 = i97;
                    sArr16 = sArr30;
                    th2 = thArr[i43];
                    sArr28 = f46935;
                    i98 = 58;
                    i83 = 12;
                    if (C1005.f3721) {
                        m69814 = (C2105.m6981("۬᩻") ^ i86) * (-107);
                        i72 = ((m69814 ^ i85) * (-10767)) ^ 1030686444;
                        i73 = 387919226;
                        i74 = m69814 ^ i73;
                        stackTraceElement11 = stackTraceElement8;
                        i87 = i72;
                        sArr30 = sArr16;
                        str32 = str16;
                        i90 = i43;
                        i97 = i44;
                        str28 = str15;
                        sArr29 = sArr12;
                        i91 = i39;
                        i93 = i40;
                        i96 = i41;
                        i88 = i74;
                        str30 = str11;
                    } else {
                        c6 = c8;
                        i51 = i89;
                        m9250 = str16;
                        int m69818 = C2105.m6981("۟᩷") ^ i85;
                        sArr30 = sArr16;
                        i90 = i43;
                        i97 = i44;
                        sArr29 = sArr12;
                        i91 = i39;
                        i93 = i40;
                        str32 = m9250;
                        i88 = m69818 ^ (-963068535);
                        i89 = i51;
                        c8 = c6;
                        stackTraceElement11 = stackTraceElement8;
                        i87 = ((m69818 ^ i86) * (-22071)) ^ 1113460368;
                        str28 = str15;
                        i96 = i41;
                        str30 = str11;
                    }
                case -889918792:
                case -688093611:
                    str3 = str30;
                    i3 = i91;
                    i4 = i93;
                    sArr = sArr29;
                    sArr2 = sArr28;
                    str4 = str32;
                    i5 = i90;
                    i6 = i97;
                    i7 = i94;
                    i8 = i83;
                    sArr3 = sArr30;
                    i9 = i95;
                    i10 = i96;
                    str5 = str28;
                    stackTraceElement = stackTraceElement11;
                    c = c8;
                    i11 = i98;
                    i12 = i89;
                    i92 = 15773;
                    m6981 = (i85 - C0630.m2566("ۘۖ")) * (-115);
                    i87 = ((m6981 ^ i86) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged) ^ 1836396329;
                    i13 = 404291373;
                    i23 = m6981 ^ i13;
                    i98 = i11;
                    sArr30 = sArr3;
                    i95 = i9;
                    str32 = str4;
                    i97 = i6;
                    str28 = str5;
                    sArr29 = sArr;
                    str30 = str3;
                    i91 = i3;
                    i88 = i23;
                    i96 = i10;
                    i89 = i12;
                    i94 = i7;
                    sArr28 = sArr2;
                    c8 = c;
                    stackTraceElement11 = stackTraceElement;
                    i83 = i8;
                    i90 = i5;
                    i93 = i4;
                case -693388918:
                case 2078655754:
                    i14 = i89;
                    str6 = str30;
                    i15 = i91;
                    i4 = i93;
                    sArr4 = sArr29;
                    sArr2 = sArr28;
                    str7 = str32;
                    i5 = i90;
                    i16 = i97;
                    i17 = i94;
                    i8 = i83;
                    sArr5 = sArr30;
                    i18 = i95;
                    i19 = i96;
                    str8 = str28;
                    stackTraceElement2 = stackTraceElement11;
                    i20 = i98;
                    sb = new StringBuilder();
                    c2 = '\n';
                    if (str2 != null) {
                        int m69819 = C2105.m6981("ᩳܽ") ^ i86;
                        i98 = i20;
                        sArr30 = sArr5;
                        i95 = i18;
                        str32 = str7;
                        i97 = i16;
                        i89 = i14;
                        str28 = str8;
                        sArr29 = sArr4;
                        str30 = str6;
                        i91 = i15;
                        c8 = '\n';
                        i88 = m69819 ^ (-1228109614);
                        i87 = ((m69819 ^ i85) * 23967) ^ 1182483683;
                        i96 = i19;
                        i94 = i17;
                        stackTraceElement11 = stackTraceElement2;
                        sArr28 = sArr2;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    } else {
                        int m698172 = C2105.m6981("ۗ᩵") ^ i86;
                        i98 = i20;
                        sArr30 = sArr5;
                        i95 = i18;
                        str32 = str7;
                        i97 = i16;
                        str28 = str8;
                        sArr29 = sArr4;
                        str30 = str6;
                        i91 = i15;
                        i88 = m698172 ^ 732581576;
                        i87 = ((m698172 ^ i85) * 13197) ^ 431644980;
                        i96 = i19;
                        i94 = i17;
                        stackTraceElement11 = stackTraceElement2;
                        sArr28 = sArr2;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                        int i1132 = i14;
                        c8 = c2;
                        i89 = i1132;
                    }
                case -691397204:
                case 376468751:
                    str12 = str30;
                    stackTraceElement6 = stackTraceElement11;
                    i32 = i91;
                    i33 = i93;
                    sArr9 = sArr29;
                    c4 = c8;
                    sArr10 = sArr28;
                    i34 = i83;
                    i35 = i96;
                    i36 = i89;
                    str13 = str28;
                    str14 = str32;
                    i37 = i98;
                    sArr11 = sArr30;
                    Throwable[] suppressed = th.getSuppressed();
                    i97 = suppressed.length;
                    i38 = 0;
                    thArr = suppressed;
                    int m25668 = (C0630.m2566("۠ܶ") + i85) * 101;
                    int i114 = ((m25668 ^ i86) * (-15785)) ^ 1945268868;
                    sArr28 = sArr10;
                    i98 = i37;
                    sArr30 = sArr11;
                    i83 = i34;
                    str32 = str14;
                    i90 = i38;
                    str28 = str13;
                    i91 = i32;
                    i93 = i33;
                    i96 = i35;
                    str30 = str12;
                    sArr15 = sArr9;
                    i88 = m25668 ^ (-1710738363);
                    i89 = i36;
                    c8 = c4;
                    stackTraceElement11 = stackTraceElement6;
                    i87 = i114;
                    sArr29 = sArr15;
                case -615550300:
                case 37231585:
                    str3 = str30;
                    StackTraceElement stackTraceElement15 = stackTraceElement11;
                    i3 = i91;
                    i4 = i93;
                    sArr = sArr29;
                    c = c8;
                    sArr2 = sArr28;
                    i12 = i89;
                    str4 = str32;
                    i5 = i90;
                    i6 = i97;
                    i7 = i94;
                    i8 = i83;
                    sArr3 = sArr30;
                    i9 = i95;
                    i10 = i96;
                    str5 = str28;
                    i11 = i98;
                    if (th instanceof C1637) {
                        stackTraceElement = stackTraceElement15;
                        m6981 = (C0630.m2566("ۜۖ") + i85) * (-87);
                        i87 = ((m6981 ^ i86) * 26241) ^ 2068526085;
                        i13 = -1900070665;
                        i23 = m6981 ^ i13;
                        i98 = i11;
                        sArr30 = sArr3;
                        i95 = i9;
                        str32 = str4;
                        i97 = i6;
                        str28 = str5;
                        sArr29 = sArr;
                        str30 = str3;
                        i91 = i3;
                        i88 = i23;
                        i96 = i10;
                        i89 = i12;
                        i94 = i7;
                        sArr28 = sArr2;
                        c8 = c;
                        stackTraceElement11 = stackTraceElement;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    } else {
                        m25662 = C0630.m2566("۟ۜ") ^ i86;
                        stackTraceElement3 = stackTraceElement15;
                        i87 = ((m25662 ^ i85) * (-19745)) ^ 277109511;
                        i21 = 1242198288;
                        int i1002 = m25662 ^ i21;
                        i98 = i11;
                        sArr30 = sArr3;
                        i95 = i9;
                        str32 = str4;
                        i97 = i6;
                        i89 = i12;
                        str28 = str5;
                        sArr29 = sArr;
                        i91 = i3;
                        i88 = i1002;
                        c8 = c;
                        i96 = i10;
                        i94 = i7;
                        stackTraceElement11 = stackTraceElement3;
                        str30 = str3;
                        sArr28 = sArr2;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    }
                case -563506996:
                case 649487634:
                    str30 = RunnableC1108.m3789(f46935, 82, 18, i92);
                    if (RunnableC3474.f10992 <= 0) {
                        str11 = str30;
                        stackTraceElement8 = stackTraceElement11;
                        i39 = i91;
                        i40 = i93;
                        sArr12 = sArr29;
                        c6 = c8;
                        i41 = i96;
                        i51 = i89;
                        str15 = str28;
                        m9250 = str32;
                        i43 = i90;
                        i44 = i97;
                        sArr16 = sArr30;
                        int m698182 = C2105.m6981("۟᩷") ^ i85;
                        sArr30 = sArr16;
                        i90 = i43;
                        i97 = i44;
                        sArr29 = sArr12;
                        i91 = i39;
                        i93 = i40;
                        str32 = m9250;
                        i88 = m698182 ^ (-963068535);
                        i89 = i51;
                        c8 = c6;
                        stackTraceElement11 = stackTraceElement8;
                        i87 = ((m698182 ^ i86) * (-22071)) ^ 1113460368;
                        str28 = str15;
                        i96 = i41;
                        str30 = str11;
                    } else {
                        m2566 = (C2105.m6981("۟᩹") + i85) * (-31);
                        i = ((m2566 ^ i86) * (-7155)) ^ (-962640551);
                        i2 = 1803396973;
                        i88 = m2566 ^ i2;
                        i87 = i;
                    }
                case -562884112:
                case 1752807833:
                    ViewOnClickListenerC1958.m6429();
                    if (RunnableC1108.f4040) {
                        m2566 = C0630.m2566("᩸֡") ^ i86;
                        i = ((m2566 ^ i85) * 18299) ^ (-1440956755);
                        i2 = -673842758;
                        i88 = m2566 ^ i2;
                        i87 = i;
                    } else {
                        str3 = str30;
                        i3 = i91;
                        i4 = i93;
                        sArr = sArr29;
                        sArr2 = sArr28;
                        str4 = str32;
                        i5 = i90;
                        i6 = i97;
                        i7 = i94;
                        i8 = i83;
                        sArr3 = sArr30;
                        i9 = i95;
                        i10 = i96;
                        str5 = str28;
                        stackTraceElement = stackTraceElement11;
                        c = c8;
                        i11 = i98;
                        i12 = i89;
                        m6981 = (C2105.m6981("ۤ۫") ^ i86) * (-121);
                        i87 = ((m6981 ^ i85) * 19533) ^ 1655457084;
                        i13 = -148291767;
                        i23 = m6981 ^ i13;
                        i98 = i11;
                        sArr30 = sArr3;
                        i95 = i9;
                        str32 = str4;
                        i97 = i6;
                        str28 = str5;
                        sArr29 = sArr;
                        str30 = str3;
                        i91 = i3;
                        i88 = i23;
                        i96 = i10;
                        i89 = i12;
                        i94 = i7;
                        sArr28 = sArr2;
                        c8 = c;
                        stackTraceElement11 = stackTraceElement;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    }
                case -555887890:
                case 47367109:
                    m36310(str, C0050.m947(sb));
                    break;
                case -169396914:
                case 716128124:
                    str11 = str30;
                    StackTraceElement stackTraceElement16 = stackTraceElement11;
                    int i115 = i91;
                    int i116 = i93;
                    short[] sArr34 = sArr29;
                    char c12 = c8;
                    short[] sArr35 = sArr28;
                    int i117 = i96;
                    int i118 = i89;
                    String str37 = str28;
                    String str38 = str32;
                    int i119 = i90;
                    int i120 = i97;
                    int i121 = i94;
                    int i122 = i83;
                    int i123 = i98;
                    short[] sArr36 = sArr30;
                    int i124 = i95;
                    if (i124 < i121) {
                        int m25669 = (C0630.m2566("᩸ۨ") + i85) * 79;
                        int i125 = ((m25669 ^ i86) * (-18765)) ^ 2144756549;
                        i98 = i123;
                        sArr30 = sArr36;
                        i83 = i122;
                        i95 = i124;
                        str32 = str38;
                        i90 = i119;
                        i97 = i120;
                        str28 = str37;
                        sArr29 = sArr34;
                        i91 = i115;
                        i93 = i116;
                        i96 = i117;
                        i88 = m25669 ^ (-833897170);
                        i94 = i121;
                        str30 = str11;
                        sArr28 = sArr35;
                        i87 = i125;
                        i89 = i118;
                        c8 = c12;
                        stackTraceElement11 = stackTraceElement16;
                    } else {
                        int m698110 = (i86 - C2105.m6981("᩶ܽ")) * 39;
                        int i126 = ((m698110 ^ i85) * 7489) ^ (-1611247931);
                        i98 = i123;
                        sArr30 = sArr36;
                        i83 = i122;
                        i95 = i124;
                        str32 = str38;
                        i90 = i119;
                        i97 = i120;
                        str28 = str37;
                        sArr29 = sArr34;
                        i91 = i115;
                        i93 = i116;
                        i88 = m698110 ^ 1575971048;
                        i96 = i117;
                        i89 = i118;
                        i94 = i121;
                        sArr28 = sArr35;
                        c8 = c12;
                        stackTraceElement11 = stackTraceElement16;
                        i87 = i126;
                        str30 = str11;
                    }
                case -87197193:
                case 1735653289:
                    str3 = str30;
                    stackTraceElement4 = stackTraceElement11;
                    i3 = i91;
                    i4 = i93;
                    sArr = sArr29;
                    sArr2 = sArr28;
                    int i127 = i96;
                    str5 = str28;
                    str4 = str32;
                    i5 = i90;
                    i6 = i97;
                    i8 = i83;
                    i11 = i98;
                    str31 = C2272.m7507(sArr2, i11, i8, i92);
                    sArr30 = f46935;
                    if (C1420.f5096 <= 0) {
                        stackTraceElement = stackTraceElement4;
                        i7 = i94;
                        c = c8;
                        i9 = i95;
                        i12 = i89;
                        i10 = i127;
                        int m256672 = (i86 - C0630.m2566("ܽ᩵")) * (-117);
                        i87 = ((m256672 ^ i85) * (-3207)) ^ 1977819741;
                        i23 = m256672 ^ 1267675418;
                        i98 = i11;
                        i95 = i9;
                        str32 = str4;
                        i97 = i6;
                        str28 = str5;
                        sArr29 = sArr;
                        str30 = str3;
                        i91 = i3;
                        i88 = i23;
                        i96 = i10;
                        i89 = i12;
                        i94 = i7;
                        sArr28 = sArr2;
                        c8 = c;
                        stackTraceElement11 = stackTraceElement;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    } else {
                        int m256610 = C0630.m2566("᩵᩺") ^ i85;
                        i22 = ((m256610 ^ i86) * (-31051)) ^ 1988511186;
                        sArr28 = sArr2;
                        i98 = i11;
                        i83 = i8;
                        i90 = i5;
                        i97 = i6;
                        str28 = str5;
                        sArr29 = sArr;
                        i93 = i4;
                        i96 = i127;
                        i88 = m256610 ^ 1507484483;
                        str32 = str4;
                        str30 = str3;
                        i91 = i3;
                        int i1012 = i22;
                        stackTraceElement11 = stackTraceElement4;
                        i87 = i1012;
                    }
                case -67684977:
                case 1034502840:
                    str25 = str30;
                    str26 = str32;
                    i75 = i90;
                    stackTraceElement4 = stackTraceElement11;
                    i76 = i97;
                    i77 = i96;
                    str27 = str28;
                    sArr26 = f46935;
                    i78 = 71;
                    i79 = 11;
                    if (C3746.f11829 > 0) {
                        int m698111 = (i85 - C2105.m6981("ۜܽ")) * 39;
                        i22 = ((m698111 ^ i86) * 3865) ^ 2017030028;
                        i88 = m698111 ^ (-593012569);
                        str32 = str26;
                        i90 = i75;
                        i97 = i76;
                        str28 = str27;
                        i91 = 71;
                        i93 = 11;
                        i96 = i77;
                        sArr29 = sArr26;
                        str30 = str25;
                        int i10122 = i22;
                        stackTraceElement11 = stackTraceElement4;
                        i87 = i10122;
                    }
                    int m256662 = (C0630.m2566("ۙܺ") + i85) * 45;
                    i22 = ((m256662 ^ i86) * (-14947)) ^ (-1909349887);
                    i88 = m256662 ^ 1629613475;
                    i90 = i75;
                    i97 = i76;
                    sArr29 = sArr26;
                    i93 = i79;
                    str32 = str26;
                    i91 = i78;
                    str28 = str27;
                    i96 = i77;
                    str30 = str25;
                    int i101222 = i22;
                    stackTraceElement11 = stackTraceElement4;
                    i87 = i101222;
                case 53752670:
                case 1469327178:
                    if (C0483.f2088 >= 0) {
                        str3 = str30;
                        i3 = i91;
                        i4 = i93;
                        sArr = sArr29;
                        sArr2 = sArr28;
                        str4 = str32;
                        i5 = i90;
                        i6 = i97;
                        i7 = i94;
                        i8 = i83;
                        sArr3 = sArr30;
                        i9 = i95;
                        i10 = i96;
                        str5 = str28;
                        stackTraceElement = stackTraceElement11;
                        c = c8;
                        i11 = i98;
                        i12 = i89;
                        m6981 = (C2105.m6981("ۤ۫") ^ i86) * (-121);
                        i87 = ((m6981 ^ i85) * 19533) ^ 1655457084;
                        i13 = -148291767;
                        i23 = m6981 ^ i13;
                        i98 = i11;
                        sArr30 = sArr3;
                        i95 = i9;
                        str32 = str4;
                        i97 = i6;
                        str28 = str5;
                        sArr29 = sArr;
                        str30 = str3;
                        i91 = i3;
                        i88 = i23;
                        i96 = i10;
                        i89 = i12;
                        i94 = i7;
                        sArr28 = sArr2;
                        c8 = c;
                        stackTraceElement11 = stackTraceElement;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    } else {
                        m2566 = (i85 - C0630.m2566("ۜᩴ")) * (-117);
                        i = ((m2566 ^ i86) * 4893) ^ (-1474765446);
                        i2 = -2126213989;
                        i88 = m2566 ^ i2;
                        i87 = i;
                    }
                case 75033402:
                case 1691771831:
                    str20 = str30;
                    stackTraceElement10 = stackTraceElement11;
                    i58 = i91;
                    i59 = i93;
                    sArr20 = sArr29;
                    sArr21 = sArr28;
                    i60 = i98;
                    str21 = str32;
                    i61 = i90;
                    i62 = i97;
                    i63 = i83;
                    sArr22 = sArr30;
                    String className = stackTraceElement10.getClassName();
                    i96 = C0798.m3007(className);
                    str22 = className;
                    i89 = 0;
                    int m256611 = (C0630.m2566("ۡ᩹") ^ i86) * 123;
                    i70 = ((m256611 ^ i85) * (-12417)) ^ 1264430065;
                    i80 = m256611 ^ (-53597640);
                    sArr28 = sArr21;
                    i98 = i60;
                    sArr30 = sArr22;
                    i83 = i63;
                    str32 = str21;
                    i90 = i61;
                    i91 = i58;
                    i93 = i59;
                    str28 = str22;
                    str30 = str20;
                    int i1042 = i80;
                    stackTraceElement11 = stackTraceElement10;
                    i87 = i70;
                    i97 = i62;
                    sArr29 = sArr20;
                    i88 = i1042;
                case 110272280:
                case 1926184799:
                    str3 = str30;
                    i3 = i91;
                    i4 = i93;
                    sArr = sArr29;
                    sArr2 = sArr28;
                    str4 = str32;
                    i5 = i90;
                    i6 = i97;
                    i7 = i94;
                    i8 = i83;
                    sArr3 = sArr30;
                    i9 = i95;
                    i10 = i96;
                    str5 = str28;
                    stackTraceElement = stackTraceElement11;
                    c = c8;
                    i11 = i98;
                    i12 = i89;
                    if ((i82 + 1) - i81 > 0) {
                        m6981 = C0630.m2566("ܳܽ") ^ i86;
                        i87 = ((m6981 ^ i85) * (-839)) ^ 1042913062;
                        i13 = -1032844518;
                    } else {
                        m6981 = C0630.m2566("᩻ۡ") ^ i85;
                        i87 = ((m6981 ^ i86) * (-17871)) ^ (-1873147834);
                        i13 = 1571819858;
                    }
                    i23 = m6981 ^ i13;
                    i98 = i11;
                    sArr30 = sArr3;
                    i95 = i9;
                    str32 = str4;
                    i97 = i6;
                    str28 = str5;
                    sArr29 = sArr;
                    str30 = str3;
                    i91 = i3;
                    i88 = i23;
                    i96 = i10;
                    i89 = i12;
                    i94 = i7;
                    sArr28 = sArr2;
                    c8 = c;
                    stackTraceElement11 = stackTraceElement;
                    i83 = i8;
                    i90 = i5;
                    i93 = i4;
                case 176024951:
                case 1571125204:
                    str20 = str30;
                    stackTraceElement10 = stackTraceElement11;
                    i64 = i91;
                    i65 = i93;
                    sArr20 = sArr29;
                    sArr23 = sArr28;
                    i66 = i96;
                    str23 = str28;
                    str24 = str32;
                    i67 = i90;
                    i62 = i97;
                    i68 = i83;
                    i69 = i98;
                    sArr24 = sArr30;
                    th3 = C0714.m2811(th);
                    if (th3 != null) {
                        m69813 = (C2105.m6981("ܿܰ") + i86) * (-7);
                        i70 = ((m69813 ^ i85) * (-27749)) ^ (-918229049);
                        i71 = -101437335;
                        i80 = m69813 ^ i71;
                        sArr28 = sArr23;
                        i98 = i69;
                        sArr30 = sArr24;
                        i83 = i68;
                        str32 = str24;
                        i90 = i67;
                        str28 = str23;
                        i91 = i64;
                        i93 = i65;
                        i96 = i66;
                        str30 = str20;
                        int i10422 = i80;
                        stackTraceElement11 = stackTraceElement10;
                        i87 = i70;
                        i97 = i62;
                        sArr29 = sArr20;
                        i88 = i10422;
                    }
                    m69813 = C0630.m2566("ܽۚ") ^ i85;
                    i70 = ((m69813 ^ i86) * (-18827)) ^ (-508659793);
                    i71 = -969509166;
                    i80 = m69813 ^ i71;
                    sArr28 = sArr23;
                    i98 = i69;
                    sArr30 = sArr24;
                    i83 = i68;
                    str32 = str24;
                    i90 = i67;
                    str28 = str23;
                    i91 = i64;
                    i93 = i65;
                    i96 = i66;
                    str30 = str20;
                    int i104222 = i80;
                    stackTraceElement11 = stackTraceElement10;
                    i87 = i70;
                    i97 = i62;
                    sArr29 = sArr20;
                    i88 = i104222;
                case 207640993:
                case 2144516593:
                    str11 = str30;
                    i39 = i91;
                    i40 = i93;
                    sArr12 = sArr29;
                    c5 = c8;
                    sArr13 = sArr28;
                    i41 = i96;
                    i42 = i89;
                    str15 = str28;
                    str16 = str32;
                    i43 = i90;
                    i44 = i97;
                    i45 = i83;
                    i46 = i98;
                    sArr14 = sArr30;
                    stackTraceElement7 = stackTraceElementArr[i95];
                    if (z) {
                        m69812 = C2105.m6981("ۡܽ") ^ i86;
                        i47 = ((m69812 ^ i85) * (-27827)) ^ 220550652;
                        i48 = 1817360387;
                        int i1032 = m69812 ^ i48;
                        sArr28 = sArr13;
                        i98 = i46;
                        sArr30 = sArr14;
                        i83 = i45;
                        str32 = str16;
                        i90 = i43;
                        str28 = str15;
                        i91 = i39;
                        i93 = i40;
                        i96 = i41;
                        str30 = str11;
                        char c92 = c5;
                        stackTraceElement11 = stackTraceElement7;
                        i89 = i42;
                        c8 = c92;
                        sArr25 = sArr12;
                        i88 = i1032;
                        i87 = i47;
                        i97 = i44;
                        sArr29 = sArr25;
                    }
                    m69812 = C2105.m6981("ۙۖ") ^ i86;
                    i47 = ((m69812 ^ i85) * 10557) ^ (-1333888612);
                    i48 = 108161949;
                    int i10322 = m69812 ^ i48;
                    sArr28 = sArr13;
                    i98 = i46;
                    sArr30 = sArr14;
                    i83 = i45;
                    str32 = str16;
                    i90 = i43;
                    str28 = str15;
                    i91 = i39;
                    i93 = i40;
                    i96 = i41;
                    str30 = str11;
                    char c922 = c5;
                    stackTraceElement11 = stackTraceElement7;
                    i89 = i42;
                    c8 = c922;
                    sArr25 = sArr12;
                    i88 = i10322;
                    i87 = i47;
                    i97 = i44;
                    sArr29 = sArr25;
                case 222018253:
                case 1623639541:
                    str3 = str30;
                    i3 = i91;
                    i4 = i93;
                    sArr = sArr29;
                    sArr2 = sArr28;
                    str4 = str32;
                    i5 = i90;
                    i6 = i97;
                    i7 = i94;
                    i8 = i83;
                    sArr3 = sArr30;
                    i9 = i95;
                    i10 = i96;
                    str5 = str28;
                    stackTraceElement = stackTraceElement11;
                    c = c8;
                    i11 = i98;
                    i12 = i89;
                    s = sArr27[53];
                    s2 = 1;
                    if (C3911.f12484 < 0) {
                        m6981 = (C2105.m6981("ۗۚ") ^ i85) * (-83);
                        i87 = ((m6981 ^ i86) * (-13491)) ^ 1562443528;
                        i13 = -1939441552;
                        i23 = m6981 ^ i13;
                        i98 = i11;
                        sArr30 = sArr3;
                        i95 = i9;
                        str32 = str4;
                        i97 = i6;
                        str28 = str5;
                        sArr29 = sArr;
                        str30 = str3;
                        i91 = i3;
                        i88 = i23;
                        i96 = i10;
                        i89 = i12;
                        i94 = i7;
                        sArr28 = sArr2;
                        c8 = c;
                        stackTraceElement11 = stackTraceElement;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    }
                    m6981 = (i85 - C2105.m6981("᩻ۧ")) * (-31);
                    i87 = ((m6981 ^ i86) * 14493) ^ (-1165885521);
                    i13 = -1169856379;
                    i23 = m6981 ^ i13;
                    i98 = i11;
                    sArr30 = sArr3;
                    i95 = i9;
                    str32 = str4;
                    i97 = i6;
                    str28 = str5;
                    sArr29 = sArr;
                    str30 = str3;
                    i91 = i3;
                    i88 = i23;
                    i96 = i10;
                    i89 = i12;
                    i94 = i7;
                    sArr28 = sArr2;
                    c8 = c;
                    stackTraceElement11 = stackTraceElement;
                    i83 = i8;
                    i90 = i5;
                    i93 = i4;
                case 236808416:
                case 1183464276:
                    C4616.m13552();
                    m2566 = C2105.m6981("ۖܶ") ^ i86;
                    i = ((m2566 ^ i85) * (-17437)) ^ (-1324079798);
                    i2 = -2137845563;
                    i88 = m2566 ^ i2;
                    i87 = i;
                case 251049800:
                case 1975174992:
                    str11 = str30;
                    stackTraceElement8 = stackTraceElement11;
                    i39 = i91;
                    i40 = i93;
                    sArr12 = sArr29;
                    c6 = c8;
                    short[] sArr37 = sArr28;
                    sArr16 = sArr30;
                    i41 = i96;
                    i51 = i89;
                    str15 = str28;
                    i43 = i90;
                    i44 = i97;
                    int i128 = i83;
                    int i129 = i98;
                    m9250 = C3019.m9250(f46935, 54, 4, i92);
                    if (C3245.f10203 <= 0) {
                        sArr28 = sArr37;
                        i98 = i129;
                        i83 = i128;
                        int m6981822 = C2105.m6981("۟᩷") ^ i85;
                        sArr30 = sArr16;
                        i90 = i43;
                        i97 = i44;
                        sArr29 = sArr12;
                        i91 = i39;
                        i93 = i40;
                        str32 = m9250;
                        i88 = m6981822 ^ (-963068535);
                        i89 = i51;
                        c8 = c6;
                        stackTraceElement11 = stackTraceElement8;
                        i87 = ((m6981822 ^ i86) * (-22071)) ^ 1113460368;
                        str28 = str15;
                        i96 = i41;
                        str30 = str11;
                    } else {
                        int m698112 = C2105.m6981("ۧۗ") ^ i85;
                        sArr28 = sArr37;
                        i98 = i129;
                        sArr30 = sArr16;
                        i83 = i128;
                        i90 = i43;
                        str28 = str15;
                        i93 = i40;
                        str32 = m9250;
                        i96 = i41;
                        i89 = i51;
                        str30 = str11;
                        c8 = c6;
                        stackTraceElement11 = stackTraceElement8;
                        i87 = ((m698112 ^ i86) * (-28325)) ^ (-1692828789);
                        i91 = i39;
                        sArr15 = sArr12;
                        i88 = m698112 ^ (-1841786491);
                        i97 = i44;
                        sArr29 = sArr15;
                    }
                case 256428982:
                case 1101154320:
                    if (C0714.f2697 < 0) {
                        m2566 = C0630.m2566("ۜ֡") ^ i86;
                        i = ((m2566 ^ i85) * 27691) ^ 1666950311;
                        i2 = -2084906295;
                        i88 = m2566 ^ i2;
                        i87 = i;
                    } else {
                        str11 = str30;
                        stackTraceElement8 = stackTraceElement11;
                        i39 = i91;
                        i40 = i93;
                        sArr12 = sArr29;
                        c6 = c8;
                        i41 = i96;
                        i51 = i89;
                        str15 = str28;
                        m9250 = str32;
                        i43 = i90;
                        i44 = i97;
                        sArr16 = sArr30;
                        int m69818222 = C2105.m6981("۟᩷") ^ i85;
                        sArr30 = sArr16;
                        i90 = i43;
                        i97 = i44;
                        sArr29 = sArr12;
                        i91 = i39;
                        i93 = i40;
                        str32 = m9250;
                        i88 = m69818222 ^ (-963068535);
                        i89 = i51;
                        c8 = c6;
                        stackTraceElement11 = stackTraceElement8;
                        i87 = ((m69818222 ^ i86) * (-22071)) ^ 1113460368;
                        str28 = str15;
                        i96 = i41;
                        str30 = str11;
                    }
                case 467509698:
                case 1699492229:
                    str12 = str30;
                    stackTraceElement6 = stackTraceElement11;
                    i32 = i91;
                    i33 = i93;
                    sArr9 = sArr29;
                    i35 = i96;
                    str13 = str28;
                    str14 = str32;
                    m36312(th2, sb, stackTraceElementArr, str31, str29, set);
                    i38 = i90 + 1;
                    i97 = i97;
                    c4 = c8;
                    sArr10 = sArr28;
                    i34 = i83;
                    i37 = i98;
                    sArr11 = sArr30;
                    i36 = i89;
                    int m256682 = (C0630.m2566("۠ܶ") + i85) * 101;
                    int i1142 = ((m256682 ^ i86) * (-15785)) ^ 1945268868;
                    sArr28 = sArr10;
                    i98 = i37;
                    sArr30 = sArr11;
                    i83 = i34;
                    str32 = str14;
                    i90 = i38;
                    str28 = str13;
                    i91 = i32;
                    i93 = i33;
                    i96 = i35;
                    str30 = str12;
                    sArr15 = sArr9;
                    i88 = m256682 ^ (-1710738363);
                    i89 = i36;
                    c8 = c4;
                    stackTraceElement11 = stackTraceElement6;
                    i87 = i1142;
                    sArr29 = sArr15;
                case 482970734:
                case 1116646661:
                    str3 = str30;
                    StackTraceElement stackTraceElement17 = stackTraceElement11;
                    i3 = i91;
                    i4 = i93;
                    sArr = sArr29;
                    c = c8;
                    sArr2 = sArr28;
                    i12 = i89;
                    str4 = str32;
                    i5 = i90;
                    i6 = i97;
                    i7 = i94;
                    i8 = i83;
                    sArr3 = sArr30;
                    i9 = i95;
                    i10 = i96;
                    str5 = str28;
                    i11 = i98;
                    stackTraceElement3 = stackTraceElement17;
                    z = true;
                    m25662 = (i86 - C0630.m2566("ۜۤ")) * 101;
                    i87 = ((m25662 ^ i85) * (-22995)) ^ 1886459448;
                    i21 = -241274416;
                    int i10022 = m25662 ^ i21;
                    i98 = i11;
                    sArr30 = sArr3;
                    i95 = i9;
                    str32 = str4;
                    i97 = i6;
                    i89 = i12;
                    str28 = str5;
                    sArr29 = sArr;
                    i91 = i3;
                    i88 = i10022;
                    c8 = c;
                    i96 = i10;
                    i94 = i7;
                    stackTraceElement11 = stackTraceElement3;
                    str30 = str3;
                    sArr28 = sArr2;
                    i83 = i8;
                    i90 = i5;
                    i93 = i4;
                case 561145992:
                case 1744528330:
                    str3 = str30;
                    i3 = i91;
                    i4 = i93;
                    sArr = sArr29;
                    sArr2 = sArr28;
                    str4 = str32;
                    i5 = i90;
                    i6 = i97;
                    i7 = i94;
                    i8 = i83;
                    sArr3 = sArr30;
                    i9 = i95;
                    i10 = i96;
                    str5 = str28;
                    stackTraceElement = stackTraceElement11;
                    c = c8;
                    i11 = i98;
                    i12 = i89;
                    int i130 = s + s2;
                    i81 = i130 * i130;
                    i82 = s * 2;
                    if (C21923.f70183 != 0) {
                        sArr30 = sArr3;
                        int m2566722 = (i86 - C0630.m2566("ܽ᩵")) * (-117);
                        i87 = ((m2566722 ^ i85) * (-3207)) ^ 1977819741;
                        i23 = m2566722 ^ 1267675418;
                        i98 = i11;
                        i95 = i9;
                        str32 = str4;
                        i97 = i6;
                        str28 = str5;
                        sArr29 = sArr;
                        str30 = str3;
                        i91 = i3;
                        i88 = i23;
                        i96 = i10;
                        i89 = i12;
                        i94 = i7;
                        sArr28 = sArr2;
                        c8 = c;
                        stackTraceElement11 = stackTraceElement;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    } else {
                        m6981 = (C0630.m2566("ܶ۫") ^ i86) * (-27);
                        i87 = ((m6981 ^ i85) * 21071) ^ (-1399262537);
                        i13 = 1798508110;
                        i23 = m6981 ^ i13;
                        i98 = i11;
                        sArr30 = sArr3;
                        i95 = i9;
                        str32 = str4;
                        i97 = i6;
                        str28 = str5;
                        sArr29 = sArr;
                        str30 = str3;
                        i91 = i3;
                        i88 = i23;
                        i96 = i10;
                        i89 = i12;
                        i94 = i7;
                        sArr28 = sArr2;
                        c8 = c;
                        stackTraceElement11 = stackTraceElement;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    }
                case 590260094:
                case 1981267329:
                    str3 = str30;
                    i3 = i91;
                    i4 = i93;
                    sArr = sArr29;
                    sArr2 = sArr28;
                    str4 = str32;
                    i5 = i90;
                    i6 = i97;
                    i7 = i94;
                    i8 = i83;
                    sArr3 = sArr30;
                    i9 = i95;
                    i10 = i96;
                    str5 = str28;
                    stackTraceElement = stackTraceElement11;
                    c = c8;
                    i11 = i98;
                    i12 = i89;
                    set = Collections.newSetFromMap(new IdentityHashMap());
                    C0382.m1835(set, th);
                    if (!(th instanceof JSONException)) {
                        int m256612 = (C0630.m2566("֨ܶ") + i85) * (-115);
                        i98 = i11;
                        sArr30 = sArr3;
                        i95 = i9;
                        str32 = str4;
                        i97 = i6;
                        str28 = str5;
                        sArr29 = sArr;
                        str30 = str3;
                        i91 = i3;
                        i88 = m256612 ^ 380737127;
                        i96 = i10;
                        i94 = i7;
                        i87 = ((m256612 ^ i86) * 1833) ^ 630505606;
                        sArr28 = sArr2;
                        i89 = i12;
                        c8 = c;
                        stackTraceElement11 = stackTraceElement;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    }
                    m6981 = (C0630.m2566("ۜۖ") + i85) * (-87);
                    i87 = ((m6981 ^ i86) * 26241) ^ 2068526085;
                    i13 = -1900070665;
                    i23 = m6981 ^ i13;
                    i98 = i11;
                    sArr30 = sArr3;
                    i95 = i9;
                    str32 = str4;
                    i97 = i6;
                    str28 = str5;
                    sArr29 = sArr;
                    str30 = str3;
                    i91 = i3;
                    i88 = i23;
                    i96 = i10;
                    i89 = i12;
                    i94 = i7;
                    sArr28 = sArr2;
                    c8 = c;
                    stackTraceElement11 = stackTraceElement;
                    i83 = i8;
                    i90 = i5;
                    i93 = i4;
                case 685755753:
                case 1093824231:
                    str11 = str30;
                    stackTraceElement8 = stackTraceElement11;
                    i39 = i91;
                    i40 = i93;
                    sArr12 = sArr29;
                    i41 = i96;
                    str15 = str28;
                    str16 = str32;
                    i43 = i90;
                    i44 = i97;
                    sArr16 = sArr30;
                    str29 = C3245.m9934(sArr16, 70, 1, i92);
                    if (C2167.f7158 < 0) {
                        m69814 = (C2105.m6981("ۗܺ") ^ i85) * 109;
                        i72 = ((m69814 ^ i86) * (-1895)) ^ (-241002299);
                        i73 = -2020444712;
                        i74 = m69814 ^ i73;
                        stackTraceElement11 = stackTraceElement8;
                        i87 = i72;
                        sArr30 = sArr16;
                        str32 = str16;
                        i90 = i43;
                        i97 = i44;
                        str28 = str15;
                        sArr29 = sArr12;
                        i91 = i39;
                        i93 = i40;
                        i96 = i41;
                        i88 = i74;
                        str30 = str11;
                    }
                    m69814 = (C0630.m2566("ܰܶ") + i85) * (-119);
                    i72 = ((m69814 ^ i86) * (-32299)) ^ 2084493;
                    i73 = 1386937058;
                    i74 = m69814 ^ i73;
                    stackTraceElement11 = stackTraceElement8;
                    i87 = i72;
                    sArr30 = sArr16;
                    str32 = str16;
                    i90 = i43;
                    i97 = i44;
                    str28 = str15;
                    sArr29 = sArr12;
                    i91 = i39;
                    i93 = i40;
                    i96 = i41;
                    i88 = i74;
                    str30 = str11;
                case 844279570:
                case 1415780403:
                    i89++;
                    str20 = str30;
                    str22 = str28;
                    stackTraceElement10 = stackTraceElement11;
                    i58 = i91;
                    i59 = i93;
                    sArr20 = sArr29;
                    sArr21 = sArr28;
                    i60 = i98;
                    str21 = str32;
                    i61 = i90;
                    i62 = i97;
                    i63 = i83;
                    sArr22 = sArr30;
                    int m2566112 = (C0630.m2566("ۡ᩹") ^ i86) * 123;
                    i70 = ((m2566112 ^ i85) * (-12417)) ^ 1264430065;
                    i80 = m2566112 ^ (-53597640);
                    sArr28 = sArr21;
                    i98 = i60;
                    sArr30 = sArr22;
                    i83 = i63;
                    str32 = str21;
                    i90 = i61;
                    i91 = i58;
                    i93 = i59;
                    str28 = str22;
                    str30 = str20;
                    int i1042222 = i80;
                    stackTraceElement11 = stackTraceElement10;
                    i87 = i70;
                    i97 = i62;
                    sArr29 = sArr20;
                    i88 = i1042222;
                case 949098333:
                case 1448334803:
                    if (C0964.f3626 == 0) {
                        str3 = str30;
                        i3 = i91;
                        i4 = i93;
                        sArr = sArr29;
                        sArr2 = sArr28;
                        str4 = str32;
                        i5 = i90;
                        i6 = i97;
                        i7 = i94;
                        i8 = i83;
                        sArr3 = sArr30;
                        i9 = i95;
                        i10 = i96;
                        str5 = str28;
                        stackTraceElement = stackTraceElement11;
                        c = c8;
                        i11 = i98;
                        i12 = i89;
                        m6981 = (C2105.m6981("ۤ۫") ^ i86) * (-121);
                        i87 = ((m6981 ^ i85) * 19533) ^ 1655457084;
                        i13 = -148291767;
                        i23 = m6981 ^ i13;
                        i98 = i11;
                        sArr30 = sArr3;
                        i95 = i9;
                        str32 = str4;
                        i97 = i6;
                        str28 = str5;
                        sArr29 = sArr;
                        str30 = str3;
                        i91 = i3;
                        i88 = i23;
                        i96 = i10;
                        i89 = i12;
                        i94 = i7;
                        sArr28 = sArr2;
                        c8 = c;
                        stackTraceElement11 = stackTraceElement;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    } else {
                        m2566 = C0630.m2566("ۜ֡") ^ i86;
                        i = ((m2566 ^ i85) * 27691) ^ 1666950311;
                        i2 = -2084906295;
                        i88 = m2566 ^ i2;
                        i87 = i;
                    }
                case 1069695584:
                case 1296337287:
                    str3 = str30;
                    i3 = i91;
                    i4 = i93;
                    sArr = sArr29;
                    sArr2 = sArr28;
                    str4 = str32;
                    i5 = i90;
                    i6 = i97;
                    i7 = i94;
                    i8 = i83;
                    sArr3 = sArr30;
                    i9 = i95;
                    i10 = i96;
                    str5 = str28;
                    stackTraceElement = stackTraceElement11;
                    c = c8;
                    i11 = i98;
                    i12 = i89;
                    sArr27 = f46935;
                    if (C7811.f24123 < 0) {
                        m6981 = (i85 - C2105.m6981("ܳۛ")) * (-79);
                        i87 = ((m6981 ^ i86) * (-6521)) ^ 950266783;
                        i13 = 795577052;
                        i23 = m6981 ^ i13;
                        i98 = i11;
                        sArr30 = sArr3;
                        i95 = i9;
                        str32 = str4;
                        i97 = i6;
                        str28 = str5;
                        sArr29 = sArr;
                        str30 = str3;
                        i91 = i3;
                        i88 = i23;
                        i96 = i10;
                        i89 = i12;
                        i94 = i7;
                        sArr28 = sArr2;
                        c8 = c;
                        stackTraceElement11 = stackTraceElement;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    }
                    m6981 = (i85 - C2105.m6981("᩻ۧ")) * (-31);
                    i87 = ((m6981 ^ i86) * 14493) ^ (-1165885521);
                    i13 = -1169856379;
                    i23 = m6981 ^ i13;
                    i98 = i11;
                    sArr30 = sArr3;
                    i95 = i9;
                    str32 = str4;
                    i97 = i6;
                    str28 = str5;
                    sArr29 = sArr;
                    str30 = str3;
                    i91 = i3;
                    i88 = i23;
                    i96 = i10;
                    i89 = i12;
                    i94 = i7;
                    sArr28 = sArr2;
                    c8 = c;
                    stackTraceElement11 = stackTraceElement;
                    i83 = i8;
                    i90 = i5;
                    i93 = i4;
                default:
                    str3 = str30;
                    i3 = i91;
                    i4 = i93;
                    sArr = sArr29;
                    sArr2 = sArr28;
                    str4 = str32;
                    i5 = i90;
                    i6 = i97;
                    i7 = i94;
                    i8 = i83;
                    sArr3 = sArr30;
                    i9 = i95;
                    i10 = i96;
                    str5 = str28;
                    stackTraceElement = stackTraceElement11;
                    c = c8;
                    i11 = i98;
                    i12 = i89;
                    if (C11340.f33930 < 0) {
                        m6981 = (C2105.m6981("ۤܽ") + i86) * 21;
                        i87 = ((m6981 ^ i85) * 32579) ^ 1202066555;
                        i13 = -1926986923;
                        i23 = m6981 ^ i13;
                        i98 = i11;
                        sArr30 = sArr3;
                        i95 = i9;
                        str32 = str4;
                        i97 = i6;
                        str28 = str5;
                        sArr29 = sArr;
                        str30 = str3;
                        i91 = i3;
                        i88 = i23;
                        i96 = i10;
                        i89 = i12;
                        i94 = i7;
                        sArr28 = sArr2;
                        c8 = c;
                        stackTraceElement11 = stackTraceElement;
                        i83 = i8;
                        i90 = i5;
                        i93 = i4;
                    }
                    m6981 = (C2105.m6981("ۤ۫") ^ i86) * (-121);
                    i87 = ((m6981 ^ i85) * 19533) ^ 1655457084;
                    i13 = -148291767;
                    i23 = m6981 ^ i13;
                    i98 = i11;
                    sArr30 = sArr3;
                    i95 = i9;
                    str32 = str4;
                    i97 = i6;
                    str28 = str5;
                    sArr29 = sArr;
                    str30 = str3;
                    i91 = i3;
                    i88 = i23;
                    i96 = i10;
                    i89 = i12;
                    i94 = i7;
                    sArr28 = sArr2;
                    c8 = c;
                    stackTraceElement11 = stackTraceElement;
                    i83 = i8;
                    i90 = i5;
                    i93 = i4;
            }
            return;
        }
    }
}
