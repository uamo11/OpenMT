package l;

import android.app.Application;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* compiled from: Q649 */
/* renamed from: l.ܶۖᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class ActivityC14946 extends AbstractActivityC3346 {

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45553 = 0;

    /* renamed from: ᩺ܰܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f45554 = {5445, 3094, 3079, 3098, 3094, 3124, 3083, 3079, 3093, 3079, 3088, 3133, 3089, 3088, 3073, 3087, 3079, 3094, 3082, 3085, 3078, 3094, 3083, 3094, 3086, 3079, 3089, 3075, 3092, 3079, 3078, 3107, 3089, 3122, 3075, 3094, 3082, 3089, 3099, 3084, 3094, 3075, 3098, 3108, 3083, 3086, 3079, 3116, 3075, 3087, 3079, 3089, 3095, 3090, 3090, 3085, 3088, 3094, 3118, 3085, 3073, 3075, 3094, 3079, 2868, -8543, -8528, -8531, -8543, -8573, -8516, -8528, -8542, -8528, -8537, -8566, -8527, -8528, -8522, -8520, -8528, -8543, -8515, -8518, -8527, -8543, -8516, -8543, -8519, -8528, 6543, 18380, 18381, 18384, 18423, 18380, 18381, 18379, 18375, 18373, 18392, 18369, 18372, 18381, 18423, 18381, 18374, 18383, 18369, 18374, 18381, 9432, 28154, 28159, 28138, 28159, 7636, 24701, 23358, 31686, 27164, -32043, 29423, 26800, -30555, -24747, 1221, 1225, 1218, 1219, 1219, 1218, 1231, 1234, 1273, 1233, 1225, 1236, 1218, 1273, 1233, 1236, 1223, 1238, 1273, 1232, 1231, 1219, 1233, 1219, 1236, -29073, 21299, 22573, 1237, 1223, 1232, 1219, 1269, 1234, 1223, 1234, 1219, 1257, 1224, 1268, 1219, 1237, 1235, 1226, 1234, 1234, 1231, 1234, 1226, 1219, 1237, 1247, 1224, 1234, 1223, 1246, 1248, 1231, 1226, 1219, 1256, 1223, 1227, 1219, 1237, 1235, 1238, 1238, 1225, 1236, 1234, 1258, 1225, 1221, 1223, 1234, 1219, 1237, 1223, 1232, 1219, 1218, 1255, 1237, 1270, 1223, 1234, 1230, 1234, 1219, 1246, 1234, 1273, 1232, 1231, 1219, 1233, 1219, 1236, 1273, 1237, 1223, 1232, 1219, 1273, 1223, 1237, 1273, 1238, 1223, 1234, 1230, 1227, 1219, 1234, 1230, 1225, 1218, 1227, 1219, 1227, 1225, 1236, 1247, 1264, 1231, 1219, 1233, 1219, 1236, 1234, 1219, 1246, 1234, 1264, 1231, 1219, 1233, 1219, 1236, 1273, 1237, 1236, 1221, 1234, 1219, 1246, 1234, 1264, 1231, 1219, 1233, 1219, 1236, 1273, 1218, 1223, 1234, 1223, -32465, -28744, -28259, 1234, 1219, 1246, 1234, 1264, 1231, 1219, 1233, 1219, 1236, 1273, 1218, 1219, 1221, 1166, 1177, 1227, 1167, 1272, 1277, 1158, 1199, 1275, 1164, 1161, 1161, 1158, 1259, 1255, 1268, 1261, 1273, 1166, 1253, 1258, 1255, 1269, 1269, 1242, 1248, 1263, 1251, 1258, 1250, 1242, 1259, 1251, 1266, 1262, 1257, 1250, 1167, 1273, 1166, 1269, 1266, 1255, 1268, 1266, 1242, 1251, 1256, 1250, 1167, 1160, 1164, 1177, 1196, 1512, 31044, 17929, 21480, 23179, -21649, 17495, 19714, 18251, -20700, 23175, -20418, 20712, 2909, -1842, -7097, -9885, -8870, -8705, 6894, -8166, 7840, -3883, 5408, -10142, 7623, -10550, -6562, -1148, -9667, -6140, -12107, -11483, -6974, 2961, -7568, -1547, -11029, 6574, -6372, 3802, -946, 5651, -606, -11517, 112, 612, -10621, -2265, -12261, 3733, 17618, 17626, 17618, 17616, 17613, 17606, 17641, 17622, 17626, 17608, 17626, 17613, 17647, 17630, 17611, 17623, 17618, 17626, 17618, 17616, 17613, 17606, 17641, 17622, 17626, 17608, 17626, 17613, 17553, 17618, 17626, 17618, 17616, 17613, 17606, 17554, 17612, 17611, 17630, 17611, 17626, 7375, -28061, -28078, -28081, -28093, -28063, -28066, -28078, -28096, -28078, -28091};

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public boolean f45555;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public C12392 f45556;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C6273 f45557;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public String f45558;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public boolean f45559;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public byte f45560;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public String f45561;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C15545 f45562;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public boolean f45563 = false;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f45564;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f45565;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -929305085;
        int i6 = C4117.f13076;
        int i7 = C1773.f6144;
        int m2566 = (i6 - C0630.m2566("ۨۨ")) * 13;
        int i8 = ((m2566 ^ i7) * (-18961)) ^ 1924226964;
        int i9 = 1012053535;
        while (true) {
            i5 = ((((i5 ^ i7) * 2837) >> 31) & i8) ^ (m2566 ^ i9);
            switch (i5) {
                case -2076809903:
                case 210143348:
                    sArr2 = f45554;
                    i4 = 449;
                    if (RunnableC1937.m6387() != 0) {
                        m2566 = (i7 - C0630.m2566("ۤۨ")) * (-89);
                        i8 = ((m2566 ^ i6) * (-22413)) ^ 1333712904;
                        i9 = 91983652;
                    } else {
                        m2566 = C0630.m2566("᩹ۖ") ^ i7;
                        i8 = ((m2566 ^ i6) * (-10191)) ^ (-573938642);
                        i9 = -737518550;
                    }
                case -2043921325:
                case 1415780196:
                    sArr = f45554;
                    if (C0798.f2919) {
                        m2566 = C0630.m2566("ܿܿ") ^ i6;
                        i8 = ((m2566 ^ i7) * (-10555)) ^ 1524136542;
                        i9 = 173663659;
                    } else {
                        m2566 = C0630.m2566("ܽ֡") ^ i7;
                        i8 = ((m2566 ^ i6) * (-22573)) ^ (-329302849);
                        i9 = 260617486;
                    }
                case -1944275644:
                case 1088948343:
                    i3 = 233;
                    m2566 = (C0630.m2566("۫֫") ^ i7) * 43;
                    i8 = ((m2566 ^ i6) * 22049) ^ (-591135280);
                    i9 = 1575520163;
                case -1869416592:
                case -1274202721:
                    C2105.m6982();
                    if (C2126.f7087) {
                        m2566 = C0630.m2566("֨۠") ^ i7;
                        i8 = ((m2566 ^ i6) * 8479) ^ (-1025048873);
                        i9 = 403513347;
                    } else {
                        m2566 = C0630.m2566("۠᩷") ^ i6;
                        i8 = ((m2566 ^ i7) * 17991) ^ 378312645;
                        i9 = -1201371095;
                    }
                case -1813345551:
                case 1395568440:
                    if (C3537.f11231 >= 0) {
                        m2566 = (C0630.m2566("᩹᩸") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((m2566 ^ i7) * 9961) ^ (-1932527645);
                        i9 = 383019333;
                    } else {
                        m2566 = (C0630.m2566("۠ۡ") + i6) * 17;
                        i8 = ((m2566 ^ i7) * 26747) ^ (-1537563213);
                        i9 = -998607759;
                    }
                case -1615362391:
                case -988932998:
                    if (C4159.f13567) {
                        m2566 = (C0630.m2566("᩹᩸") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((m2566 ^ i7) * 9961) ^ (-1932527645);
                        i9 = 383019333;
                    } else {
                        m2566 = C0630.m2566("֨۠") ^ i7;
                        i8 = ((m2566 ^ i6) * 8479) ^ (-1025048873);
                        i9 = 403513347;
                    }
                case -1561466745:
                case 1552980204:
                    C2520.m8026();
                    if (C2105.m6982() == 0) {
                        m2566 = C0630.m2566("֨۠") ^ i7;
                        i8 = ((m2566 ^ i6) * 8479) ^ (-1025048873);
                        i9 = 403513347;
                    } else {
                        m2566 = (i7 - C0630.m2566("ۤۨ")) * (-89);
                        i8 = ((m2566 ^ i6) * (-22413)) ^ 1333712904;
                        i9 = 91983652;
                    }
                case -801141069:
                case -775363917:
                    s2 = 772;
                    if (C0422.f1886 <= 0) {
                        m2566 = C0630.m2566("ܿܿ") ^ i6;
                        i8 = ((m2566 ^ i7) * (-10555)) ^ 1524136542;
                        i9 = 173663659;
                    } else {
                        m2566 = (C2105.m6981("ۜܰ") ^ i6) * 109;
                        i8 = ((m2566 ^ i7) * (-4329)) ^ 561810798;
                        i9 = 322084303;
                    }
                case -709620783:
                case 1456833584:
                    s = sArr[c];
                    i = s * s;
                    if (C7106.m19120() <= 0) {
                        m2566 = C0630.m2566("ܿܿ") ^ i6;
                        i8 = ((m2566 ^ i7) * (-10555)) ^ 1524136542;
                        i9 = 173663659;
                    } else {
                        m2566 = C0630.m2566("֫ܺ") ^ i6;
                        i8 = ((m2566 ^ i7) * 9409) ^ (-1229171367);
                        i9 = -1541175344;
                    }
                case -528334792:
                case 859905601:
                    if ((s * s2) - i2 <= 0) {
                        m2566 = C2105.m6981("ܳ֫") ^ i7;
                        i8 = ((m2566 ^ i6) * (-21307)) ^ (-1249892708);
                        i9 = 185520027;
                    } else {
                        m2566 = (C0630.m2566("ۨ֡") + i6) * 3;
                        i8 = ((m2566 ^ i7) * (-3027)) ^ 1030539949;
                        i9 = -2008820124;
                    }
                case -219501672:
                case 1858841343:
                    i2 = 148996 + i;
                    if (C4075.f12947 >= 0) {
                        m2566 = (i7 - C0630.m2566("ۤۨ")) * (-89);
                        i8 = ((m2566 ^ i6) * (-22413)) ^ 1333712904;
                        i9 = 91983652;
                    } else {
                        m2566 = (C0630.m2566("᩺ۙ") ^ i7) * (-113);
                        i8 = ((m2566 ^ i6) * 16031) ^ 1893596928;
                        i9 = -1942817516;
                    }
                case -154326464:
                case 118199641:
                    if (C7106.f21815 != 0) {
                        m2566 = (i7 - C0630.m2566("ۤۨ")) * (-89);
                        i8 = ((m2566 ^ i6) * (-22413)) ^ 1333712904;
                        i9 = 91983652;
                    } else {
                        m2566 = C0630.m2566("᩶ܰ") ^ i7;
                        i8 = ((m2566 ^ i6) * (-15979)) ^ (-2030939604);
                        i9 = 473896551;
                    }
                case -88865119:
                case 2140834531:
                    return C3683.m11225(sArr2, i4, 10, i3);
                case 111973940:
                case 194544456:
                    c = 448;
                    if (C1711.f5919) {
                        m2566 = C0630.m2566("֨۠") ^ i7;
                        i8 = ((m2566 ^ i6) * 8479) ^ (-1025048873);
                        i9 = 403513347;
                    } else {
                        m2566 = (C0630.m2566("ۢܽ") ^ i6) * 21;
                        i8 = ((m2566 ^ i7) * 13259) ^ 1821707391;
                        i9 = 1213679324;
                    }
                case 120601668:
                case 632507061:
                    i3 = 37431;
                    m2566 = (C0630.m2566("۫֫") ^ i7) * 43;
                    i8 = ((m2566 ^ i6) * 22049) ^ (-591135280);
                    i9 = 1575520163;
                case 287005376:
                case 847334635:
                    if (C3663.f11553) {
                        m2566 = (C0630.m2566("᩹᩸") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((m2566 ^ i7) * 9961) ^ (-1932527645);
                        i9 = 383019333;
                    } else {
                        m2566 = C2105.m6981("۫ۛ") ^ i7;
                        i8 = ((m2566 ^ i6) * 20303) ^ 245767219;
                        i9 = 623198190;
                    }
                case 557134588:
                case 619425356:
                    if (C3432.f10845 >= 0) {
                        m2566 = C0630.m2566("۠᩷") ^ i6;
                        i8 = ((m2566 ^ i7) * 17991) ^ 378312645;
                        i9 = -1201371095;
                    } else {
                        m2566 = (C2105.m6981("᩷ܰ") ^ i6) * (-25);
                        i8 = ((m2566 ^ i7) * (-12395)) ^ (-1217636707);
                        i9 = -719786038;
                    }
                case 917567437:
                case 1616503213:
                    C0483.m2121();
                    ViewOnClickListenerC1958.m6429();
                    m2566 = C0630.m2566("۠᩷") ^ i6;
                    i8 = ((m2566 ^ i7) * 17991) ^ 378312645;
                    i9 = -1201371095;
                default:
                    C7106.m19120();
                    return null;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35400(C5652 c5652, C18258 c18258, String str) {
        Intent intent;
        String str2;
        int m6981;
        int i;
        int i2;
        int i3;
        Intent intent2;
        int i4;
        int i5;
        int i6 = C11340.f33930;
        int i7 = C7811.f24123;
        int m2566 = (i6 - C0630.m2566("ᩳۜ")) * (-99);
        int i8 = ((m2566 ^ i7) * (-24471)) ^ 556047534;
        String str3 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = m2566 ^ (-662187982);
        Intent intent3 = null;
        String str4 = null;
        int i10 = 0;
        short s = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -138874850;
        short[] sArr3 = null;
        int i15 = 0;
        while (true) {
            i14 = i9 ^ (i8 & (((i14 ^ i7) * 27899) >> 31));
            switch (i14) {
                case -2100234653:
                case 253525569:
                    Application m1842 = C0382.m1842();
                    str2 = str3;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        int m25662 = C0630.m2566("᩺᩻") ^ i6;
                        i9 = m25662 ^ (-1869981799);
                        i8 = ((m25662 ^ i7) * (-16075)) ^ (-1726847854);
                        str3 = str2;
                        intent3 = null;
                    } else {
                        intent3 = new Intent(m1842, (Class<?>) ActivityC14946.class);
                        sArr3 = f45554;
                        if (C0237.m1481() >= 0) {
                            intent = intent3;
                            m6981 = (C0630.m2566("ۧ֨") ^ i7) * (-29);
                            i = ((m6981 ^ i6) * 24427) ^ (-1664767305);
                            i2 = 433504083;
                            intent3 = intent;
                            i9 = m6981 ^ i2;
                            i8 = i;
                            str3 = str2;
                        } else {
                            int m69812 = (C2105.m6981("ᩴ۬") + i6) * 59;
                            i = ((m69812 ^ i7) * (-24709)) ^ 2107237479;
                            i9 = m69812 ^ (-2027721596);
                            i8 = i;
                            str3 = str2;
                        }
                    }
                case -2048716413:
                case -461209030:
                    intent = intent3;
                    str2 = str3;
                    sArr = f45554;
                    if (C3432.m10477() > 0) {
                        m6981 = (i7 - C0630.m2566("ܰܶ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((m6981 ^ i6) * (-17279)) ^ (-696499174);
                        i2 = 2058435964;
                        intent3 = intent;
                        i9 = m6981 ^ i2;
                        i8 = i;
                        str3 = str2;
                    }
                    m6981 = (C0630.m2566("ۧ֨") ^ i7) * (-29);
                    i = ((m6981 ^ i6) * 24427) ^ (-1664767305);
                    i2 = 433504083;
                    intent3 = intent;
                    i9 = m6981 ^ i2;
                    i8 = i;
                    str3 = str2;
                case -1898815769:
                case -1221774337:
                    intent = intent3;
                    str2 = str3;
                    int i16 = s + s2;
                    i11 = i16 * i16;
                    i12 = s * s;
                    i13 = 108826624;
                    if (C2167.f7158 < 0) {
                        m6981 = C0630.m2566("ۡۖ") ^ i7;
                        i = ((m6981 ^ i6) * 30691) ^ (-1572838285);
                        i2 = 1615047185;
                        intent3 = intent;
                        i9 = m6981 ^ i2;
                        i8 = i;
                        str3 = str2;
                    }
                    m6981 = C0630.m2566("ۗۢ") ^ i7;
                    i = ((m6981 ^ i6) * (-13693)) ^ (-994636911);
                    i2 = 612860246;
                    intent3 = intent;
                    i9 = m6981 ^ i2;
                    i8 = i;
                    str3 = str2;
                case -1787322630:
                case 1199310043:
                    C3537.m10746();
                    break;
                case -1763873318:
                case 1624357061:
                    intent = intent3;
                    str2 = str3;
                    s = sArr[64];
                    s2 = 10432;
                    if (C1504.f5354) {
                        int m256622 = C0630.m2566("᩺᩻") ^ i6;
                        i9 = m256622 ^ (-1869981799);
                        i8 = ((m256622 ^ i7) * (-16075)) ^ (-1726847854);
                        str3 = str2;
                        intent3 = null;
                    } else {
                        m6981 = (C2105.m6981("ۖ۟") ^ i6) * (-125);
                        i = ((m6981 ^ i7) * (-21967)) ^ 592929664;
                        i2 = -802370400;
                        intent3 = intent;
                        i9 = m6981 ^ i2;
                        i8 = i;
                        str3 = str2;
                    }
                case -1708661727:
                case 296507661:
                    C1504.m5168(intent3, C11340.m28025(sArr2, 85, 5, i15), str);
                    c5652.m15940(intent3);
                    break;
                case -1658608698:
                case 1633078648:
                    str3 = C4616.m13542(sArr3, 79, 6, i15);
                    i10 = 2;
                    if (C11340.f33930 < 0) {
                        intent2 = intent3;
                        i5 = (C0630.m2566("᩵۠") + i6) * (-107);
                        i4 = ((i5 ^ i7) * (-7749)) ^ (-1804245636);
                        i3 = -1805819896;
                        Intent intent4 = intent2;
                        i9 = i5 ^ i3;
                        i8 = i4;
                        intent3 = intent4;
                    }
                    i5 = C0630.m2566("ۡ֨") ^ i6;
                    intent2 = intent3;
                    i4 = ((i5 ^ i7) * 9991) ^ (-112051179);
                    i3 = -411486859;
                    Intent intent42 = intent2;
                    i9 = i5 ^ i3;
                    i8 = i4;
                    intent3 = intent42;
                case -1589008019:
                case 677655776:
                    C0964.m3413();
                    if (C4159.f13567) {
                        intent = intent3;
                        str2 = str3;
                        m6981 = C0630.m2566("ۗۢ") ^ i7;
                        i = ((m6981 ^ i6) * (-13693)) ^ (-994636911);
                        i2 = 612860246;
                        intent3 = intent;
                        i9 = m6981 ^ i2;
                        i8 = i;
                        str3 = str2;
                    } else {
                        i5 = C0630.m2566("ۡ֨") ^ i6;
                        intent2 = intent3;
                        i4 = ((i5 ^ i7) * 9991) ^ (-112051179);
                        i3 = -411486859;
                        Intent intent422 = intent2;
                        i9 = i5 ^ i3;
                        i8 = i4;
                        intent3 = intent422;
                    }
                case -1334203718:
                case -776752317:
                    intent = intent3;
                    str2 = str3;
                    int i17 = i12 + i13;
                    if ((i17 + i17) - i11 < 0) {
                        m6981 = (i6 - C0630.m2566("۬ܿ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((m6981 ^ i7) * 12113) ^ (-1835850748);
                        i2 = 1867068868;
                    } else {
                        m6981 = C0630.m2566("ܰ᩶") ^ i7;
                        i = ((m6981 ^ i6) * 16863) ^ (-1691445672);
                        i2 = -498979296;
                    }
                    intent3 = intent;
                    i9 = m6981 ^ i2;
                    i8 = i;
                    str3 = str2;
                case -1039623385:
                case -159541817:
                    intent = intent3;
                    str2 = str3;
                    i15 = 58771;
                    m6981 = C0630.m2566("᩺᩶") ^ i6;
                    i = ((m6981 ^ i7) * 31349) ^ 32206497;
                    i2 = 901000146;
                    intent3 = intent;
                    i9 = m6981 ^ i2;
                    i8 = i;
                    str3 = str2;
                case -983921573:
                case 935230651:
                    intent3.putExtra(str3, i10);
                    sArr2 = f45554;
                    if (C0483.f2088 >= 0) {
                        intent = intent3;
                        str2 = str3;
                        m6981 = C0630.m2566("۬ܳ") ^ i7;
                        i = ((m6981 ^ i6) * 867) ^ 2064139321;
                        i2 = 280605165;
                        intent3 = intent;
                        i9 = m6981 ^ i2;
                        i8 = i;
                        str3 = str2;
                    } else {
                        int m25663 = (C0630.m2566("ܺܿ") + i7) * 81;
                        i8 = ((m25663 ^ i6) * (-29229)) ^ (-1060191108);
                        i9 = m25663 ^ 1557905729;
                    }
                case -845765377:
                case 861128878:
                    if (C4263.f13799 <= 0) {
                        intent = intent3;
                        str2 = str3;
                        m6981 = C0630.m2566("ۗۢ") ^ i7;
                        i = ((m6981 ^ i6) * (-13693)) ^ (-994636911);
                        i2 = 612860246;
                        intent3 = intent;
                        i9 = m6981 ^ i2;
                        i8 = i;
                        str3 = str2;
                    } else {
                        str2 = str3;
                        int m2566222 = C0630.m2566("᩺᩻") ^ i6;
                        i9 = m2566222 ^ (-1869981799);
                        i8 = ((m2566222 ^ i7) * (-16075)) ^ (-1726847854);
                        str3 = str2;
                        intent3 = null;
                    }
                case -837107551:
                case 1323629068:
                    C1420.m4913();
                    if (C1420.m4913()) {
                        intent = intent3;
                        str2 = str3;
                        m6981 = C0630.m2566("۬ܳ") ^ i7;
                        i = ((m6981 ^ i6) * 867) ^ 2064139321;
                        i2 = 280605165;
                        intent3 = intent;
                        i9 = m6981 ^ i2;
                        i8 = i;
                        str3 = str2;
                    }
                    intent = intent3;
                    str2 = str3;
                    m6981 = C0630.m2566("ۗۢ") ^ i7;
                    i = ((m6981 ^ i6) * (-13693)) ^ (-994636911);
                    i2 = 612860246;
                    intent3 = intent;
                    i9 = m6981 ^ i2;
                    i8 = i;
                    str3 = str2;
                case -780881062:
                case 1404178977:
                    intent = intent3;
                    str2 = str3;
                    i15 = 57045;
                    m6981 = C0630.m2566("᩺᩶") ^ i6;
                    i = ((m6981 ^ i7) * 31349) ^ 32206497;
                    i2 = 901000146;
                    intent3 = intent;
                    i9 = m6981 ^ i2;
                    i8 = i;
                    str3 = str2;
                case -340490900:
                case 198747360:
                    intent = intent3;
                    str2 = str3;
                    C2956.m9014(ActivityC16315.class, c18258, str4);
                    if (RunnableC0588.f2309 < 0) {
                        m6981 = (C0630.m2566("᩵ۛ") ^ i7) * (-107);
                        i = ((m6981 ^ i6) * 22055) ^ (-1863656355);
                        i2 = -1877425004;
                        intent3 = intent;
                        i9 = m6981 ^ i2;
                        i8 = i;
                        str3 = str2;
                    }
                    m6981 = C0630.m2566("۬ܳ") ^ i7;
                    i = ((m6981 ^ i6) * 867) ^ 2064139321;
                    i2 = 280605165;
                    intent3 = intent;
                    i9 = m6981 ^ i2;
                    i8 = i;
                    str3 = str2;
                case 745889717:
                case 2092526555:
                    intent = intent3;
                    str2 = str3;
                    if (C4075.f12947 < 0) {
                        m6981 = (C2105.m6981("᩻۬") ^ i6) * (-109);
                        i = ((m6981 ^ i7) * 15739) ^ 1302575049;
                        i2 = 1325149485;
                        intent3 = intent;
                        i9 = m6981 ^ i2;
                        i8 = i;
                        str3 = str2;
                    }
                    m6981 = C0630.m2566("۬ܳ") ^ i7;
                    i = ((m6981 ^ i6) * 867) ^ 2064139321;
                    i2 = 280605165;
                    intent3 = intent;
                    i9 = m6981 ^ i2;
                    i8 = i;
                    str3 = str2;
                case 1151549412:
                case 1507773556:
                    C3663.m11168();
                    C11340.m28031();
                    intent = intent3;
                    str2 = str3;
                    m6981 = C0630.m2566("ۗۢ") ^ i7;
                    i = ((m6981 ^ i6) * (-13693)) ^ (-994636911);
                    i2 = 612860246;
                    intent3 = intent;
                    i9 = m6981 ^ i2;
                    i8 = i;
                    str3 = str2;
                default:
                    intent = intent3;
                    str2 = str3;
                    str4 = C2167.m7159(f45554, 65, 14, i15);
                    if (C0630.f2410 > 0) {
                        m6981 = (C0630.m2566("ۙ᩸") ^ i7) * 17;
                        i = ((m6981 ^ i6) * 17909) ^ (-219811688);
                        i2 = -617984104;
                        intent3 = intent;
                        i9 = m6981 ^ i2;
                        i8 = i;
                        str3 = str2;
                    }
                    m6981 = (C0630.m2566("ۧ֨") ^ i7) * (-29);
                    i = ((m6981 ^ i6) * 24427) ^ (-1664767305);
                    i2 = 433504083;
                    intent3 = intent;
                    i9 = m6981 ^ i2;
                    i8 = i;
                    str3 = str2;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        C12392 c12392 = null;
        C15545 c15545 = null;
        int i = -461802817;
        int i2 = C22628.f73083;
        int i3 = C3432.f10845;
        int m6981 = C2105.m6981("ۤ۬") ^ i3;
        int i4 = ((m6981 ^ i2) * (-3709)) ^ (-728609854);
        int i5 = 1207986969;
        while (true) {
            i = ((((i ^ i2) * 365) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1926708397:
                case 87470913:
                    break;
                case -1631971841:
                case 1523961399:
                    if (C7106.f21815 != 0) {
                        m6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-32217)) ^ 2021944885;
                        i5 = 1305856224;
                    } else {
                        m6981 = (C2105.m6981("֡۬") + i3) * (-95);
                        i4 = ((m6981 ^ i2) * (-17241)) ^ (-114761841);
                        i5 = -804803136;
                    }
                case -1564581652:
                case 1912005292:
                    if (C1504.f5354) {
                        m6981 = (i2 - C0630.m2566("۠᩺")) * (-29);
                        i4 = ((m6981 ^ i3) * (-13479)) ^ (-2408886);
                        i5 = -1573605896;
                    } else {
                        m6981 = (i3 - C2105.m6981("֨ۧ")) * (-127);
                        i4 = ((m6981 ^ i2) * (-25777)) ^ 1202031780;
                        i5 = -609007248;
                    }
                case -1421827041:
                case 2118445089:
                    c12392.m30386();
                    m6981 = (i3 - C2105.m6981("᩶ۡ")) * (-33);
                    i4 = ((m6981 ^ i2) * 16499) ^ (-47891953);
                    i5 = 1999405563;
                case -1008888021:
                case -252544743:
                    if (C3911.f12484 >= 0) {
                        m6981 = C2105.m6981("᩺᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * 23255) ^ (-620145538);
                        i5 = -1720659877;
                    } else {
                        m6981 = C2105.m6981("ܺۢ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-16083)) ^ 1880200175;
                        i5 = -1420167692;
                    }
                case -867607374:
                case -577613390:
                    if (C4159.f13567) {
                        m6981 = C0630.m2566("ᩴ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * (-23363)) ^ 2130611825;
                        i5 = -2146364010;
                    } else {
                        m6981 = C2105.m6981("᩺᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * 23255) ^ (-620145538);
                        i5 = -1720659877;
                    }
                case -538549864:
                case 833736727:
                    super.onDestroy();
                    c15545 = this.f45562;
                    if (c15545 != null) {
                        m6981 = (C2105.m6981("ۨۖ") + i3) * 97;
                        i4 = ((m6981 ^ i2) * 22171) ^ (-753542557);
                        i5 = -2072843251;
                    } else {
                        m6981 = C2105.m6981("᩺֫") ^ i2;
                        i4 = ((m6981 ^ i3) * (-8081)) ^ (-719337036);
                        i5 = 819367891;
                    }
                case -329450478:
                case 1196945731:
                    if (C2520.m8026()) {
                        m6981 = C2105.m6981("᩺᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * 23255) ^ (-620145538);
                        i5 = -1720659877;
                    } else {
                        m6981 = (C2105.m6981("ۚ֫") + i2) * 51;
                        i4 = ((m6981 ^ i3) * (-3711)) ^ 835622563;
                        i5 = -1681801550;
                    }
                case -322396688:
                case 744997965:
                    C4616.m13552();
                    C4616.m13552();
                    break;
                case -121549240:
                case 1422557456:
                    C3911.m11924();
                    if (C22628.f73083 <= 0) {
                        m6981 = (i2 - C0630.m2566("۠᩺")) * (-29);
                        i4 = ((m6981 ^ i3) * (-13479)) ^ (-2408886);
                        i5 = -1573605896;
                    } else {
                        m6981 = C2105.m6981("ۢۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * 27383) ^ (-876192450);
                        i5 = -492474765;
                    }
                case -48960327:
                case 1469226802:
                    if (C1773.f6144 <= 0) {
                        m6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-32217)) ^ 2021944885;
                        i5 = 1305856224;
                    } else {
                        m6981 = C2105.m6981("᩹ۘ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-10119)) ^ 271640916;
                        i5 = -1755423376;
                    }
                case 225255737:
                case 665087534:
                    C0714.m2805();
                    m6981 = C2105.m6981("᩺᩸") ^ i3;
                    i4 = ((m6981 ^ i2) * 23255) ^ (-620145538);
                    i5 = -1720659877;
                case 385898926:
                case 934966572:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-32217)) ^ 2021944885;
                        i5 = 1305856224;
                    } else {
                        m6981 = C0630.m2566("֫ۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * 21415) ^ (-967823975);
                        i5 = -625518722;
                    }
                case 427338843:
                case 1754524591:
                    c15545.m36695();
                    m6981 = C2105.m6981("᩺֫") ^ i2;
                    i4 = ((m6981 ^ i3) * (-8081)) ^ (-719337036);
                    i5 = 819367891;
                case 489256115:
                case 2062237132:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C2105.m6981("ۢۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * 27383) ^ (-876192450);
                        i5 = -492474765;
                    } else {
                        m6981 = C0630.m2566("ܶ۬") ^ i2;
                        i4 = ((m6981 ^ i3) * 19733) ^ (-59784388);
                        i5 = 338053491;
                    }
                case 706462326:
                case 1050134328:
                    if (C1916.f6442) {
                        m6981 = C2105.m6981("᩻᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * (-3689)) ^ (-497405293);
                        i5 = 585109521;
                    } else {
                        m6981 = C2105.m6981("ۢۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * 27383) ^ (-876192450);
                        i5 = -492474765;
                    }
                case 721101544:
                case 1873001159:
                    c12392 = this.f45556;
                    if (c12392 != null) {
                        m6981 = C0630.m2566("᩹᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * (-15811)) ^ 1218241728;
                        i5 = -1633620511;
                    } else {
                        m6981 = (i3 - C2105.m6981("᩶ۡ")) * (-33);
                        i4 = ((m6981 ^ i2) * 16499) ^ (-47891953);
                        i5 = 1999405563;
                    }
                case 889585724:
                case 918326952:
                    if (C1504.f5354) {
                        m6981 = C2105.m6981("᩺᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * 23255) ^ (-620145538);
                        i5 = -1720659877;
                    } else {
                        m6981 = C2105.m6981("ۧᩴ") ^ i2;
                        i4 = ((m6981 ^ i3) * 11095) ^ 2061164580;
                        i5 = 192164278;
                    }
                case 1471277409:
                case 1995152856:
                    C0050.m940();
                    if (C0964.f3626 == 0) {
                        m6981 = (C2105.m6981("ۚ֫") + i2) * 51;
                        i4 = ((m6981 ^ i3) * (-3711)) ^ 835622563;
                        i5 = -1681801550;
                    } else {
                        m6981 = (i2 - C0630.m2566("۠᩺")) * (-29);
                        i4 = ((m6981 ^ i3) * (-13479)) ^ (-2408886);
                        i5 = -1573605896;
                    }
                default:
                    if (C2126.f7087) {
                        m6981 = C2105.m6981("ۢۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * 27383) ^ (-876192450);
                        i5 = -492474765;
                    } else {
                        m6981 = C2105.m6981("ܳۢ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-22177)) ^ (-1161552708);
                        i5 = 1753672853;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (l.C0630.f2410 <= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (l.C3019.m9255() <= 0) goto L70;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void finish() {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC14946.finish():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x00df, code lost:
    
        if (l.C3245.f10203 > 0) goto L14;
     */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r38) {
        /*
            Method dump skipped, instructions count: 2798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC14946.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (l.C1916.f6442 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        if (l.RunnableC0588.f2309 >= 0) goto L49;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m35403(l.ActivityC14946 r20, l.DialogInterfaceC0206 r21) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC14946.m35403(l.ܶۖᩳ, l.֡ۚۢ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        if (l.C7811.f24123 >= 0) goto L15;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m35399(l.AbstractActivityC3346 r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC14946.m35399(l.ۗܺ᩷, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int m6981;
        int i;
        int i2;
        MenuInflater menuInflater;
        int m2566;
        int i3;
        int m69812;
        int i4;
        ActivityC14946 activityC14946 = this;
        int i5 = C0630.f2410;
        int i6 = C4263.f13799;
        int m69813 = (i5 - C2105.m6981("֨ۤ")) * (-121);
        int i7 = ((m69813 ^ i6) * (-19265)) ^ (-1683356217);
        C15545 c15545 = null;
        String str = null;
        String str2 = null;
        short[] sArr = null;
        int i8 = m69813 ^ 1606619725;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        short s = 0;
        int i18 = 0;
        int i19 = 1459908915;
        MenuInflater menuInflater2 = null;
        short[] sArr2 = null;
        int i20 = 0;
        while (true) {
            i19 = i8 ^ (i7 & (((i19 ^ i6) * 6747) >> 31));
            switch (i19) {
                case -2126974730:
                case -2000115802:
                    menuInflater2 = getMenuInflater();
                    str = C1916.m6311(f45554, 357, 3, i12);
                    if (C1420.f5096 > 0) {
                        m69812 = (i6 - C2105.m6981("ۧۧ")) * (-37);
                        i7 = ((m69812 ^ i5) * (-401)) ^ (-61979246);
                        i4 = 1944294517;
                        i8 = m69812 ^ i4;
                        activityC14946 = this;
                    }
                    m69812 = (i6 - C2105.m6981("ۡ֨")) * (-89);
                    i7 = ((m69812 ^ i5) * 8817) ^ (-278095367);
                    i4 = 1938445402;
                    i8 = m69812 ^ i4;
                    activityC14946 = this;
                case -1959759605:
                case 1806171022:
                    if (C1504.f5354) {
                        menuInflater = menuInflater2;
                        m2566 = (C2105.m6981("۬ܰ") ^ i5) * 19;
                        i7 = ((m2566 ^ i6) * (-17371)) ^ 1755476767;
                        i3 = 1393730309;
                        i8 = m2566 ^ i3;
                        activityC14946 = this;
                        menuInflater2 = menuInflater;
                    } else {
                        m6981 = C2105.m6981("᩷ۜ") ^ i5;
                        i = ((m6981 ^ i6) * 1787) ^ (-140916145);
                        i2 = 48568649;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                case -1824050490:
                case -1453038258:
                    RunnableC1108.m3790();
                    if (C2126.f7087) {
                        m69812 = (i6 - C2105.m6981("ۡ֨")) * (-89);
                        i7 = ((m69812 ^ i5) * 8817) ^ (-278095367);
                        i4 = 1938445402;
                        i8 = m69812 ^ i4;
                        activityC14946 = this;
                    } else {
                        m6981 = C0630.m2566("ۙ۬") ^ i6;
                        i = ((m6981 ^ i5) * (-19497)) ^ (-1008715106);
                        i2 = -1083407600;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                case -1684759930:
                case 924453281:
                    C0422.m1953(C1916.m6301(menu, 2128509350 ^ i20), z);
                    menuInflater = menuInflater2;
                    m2566 = (C0630.m2566("ۢ᩵") + i5) * 59;
                    i7 = ((m2566 ^ i6) * 30975) ^ (-126604038);
                    i3 = 361871988;
                    i8 = m2566 ^ i3;
                    activityC14946 = this;
                    menuInflater2 = menuInflater;
                case -1629964195:
                case -765575639:
                    menuInflater = menuInflater2;
                    short s2 = sArr2[c];
                    int i21 = s2 + 7771;
                    if (C0630.m2564()) {
                        s = s2;
                        i18 = i21;
                        m2566 = (C2105.m6981("۬ܰ") ^ i5) * 19;
                        i7 = ((m2566 ^ i6) * (-17371)) ^ 1755476767;
                        i3 = 1393730309;
                        i8 = m2566 ^ i3;
                        activityC14946 = this;
                        menuInflater2 = menuInflater;
                    } else {
                        int m69814 = (i6 - C2105.m6981("ۙᩴ")) * (-111);
                        int i22 = ((m69814 ^ i5) * (-377)) ^ (-1814650683);
                        i8 = m69814 ^ 732054660;
                        menuInflater2 = menuInflater;
                        s = s2;
                        i18 = i21;
                        i7 = i22;
                        activityC14946 = this;
                    }
                case -1352885093:
                case 1194649628:
                    c15545.m36675(C1916.m6301(menu, 2128319687 ^ i9));
                    return true;
                case -1077174467:
                case -140881323:
                    C3683.m11222();
                    C0714.m2805();
                    menuInflater = menuInflater2;
                    m2566 = (C2105.m6981("۬ܰ") ^ i5) * 19;
                    i7 = ((m2566 ^ i6) * (-17371)) ^ 1755476767;
                    i3 = 1393730309;
                    i8 = m2566 ^ i3;
                    activityC14946 = this;
                    menuInflater2 = menuInflater;
                case -1074896453:
                case 511175556:
                    menuInflater = menuInflater2;
                    i12 = 11550;
                    m2566 = C0630.m2566("᩸ۧ") ^ i6;
                    i7 = ((m2566 ^ i5) * (-13263)) ^ 1971023457;
                    i3 = -1251482959;
                    i8 = m2566 ^ i3;
                    activityC14946 = this;
                    menuInflater2 = menuInflater;
                case -1016279923:
                case -117410273:
                    i10 = C0630.m2566(str2);
                    i11 = 2122066124;
                    if (C1916.m6308() < 0) {
                        m6981 = C0630.m2566("۠ᩴ") ^ i5;
                        i = ((m6981 ^ i6) * (-391)) ^ (-236707178);
                        i2 = 415191742;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                    m6981 = C2105.m6981("᩷ۜ") ^ i5;
                    i = ((m6981 ^ i6) * 1787) ^ (-140916145);
                    i2 = 48568649;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case -969970165:
                case 20924381:
                    menuInflater = menuInflater2;
                    int i23 = i16 + i17;
                    if (i15 - (i23 + i23) > 0) {
                        m2566 = (i5 - C2105.m6981("ۡ᩸")) * 13;
                        i7 = ((m2566 ^ i6) * 21063) ^ 1952150789;
                        i3 = -606745600;
                    } else {
                        m2566 = (C0630.m2566("ܽܰ") + i5) * 59;
                        i7 = ((m2566 ^ i6) * (-18241)) ^ 1421119786;
                        i3 = -125079673;
                    }
                    i8 = m2566 ^ i3;
                    activityC14946 = this;
                    menuInflater2 = menuInflater;
                case -890029012:
                case 1482083658:
                    C0483.m2121();
                    if (C1916.f6442) {
                        menuInflater = menuInflater2;
                        m2566 = (C2105.m6981("۬ܰ") ^ i5) * 19;
                        i7 = ((m2566 ^ i6) * (-17371)) ^ 1755476767;
                        i3 = 1393730309;
                        i8 = m2566 ^ i3;
                        activityC14946 = this;
                        menuInflater2 = menuInflater;
                    } else {
                        m69812 = (i6 - C2105.m6981("ۡ֨")) * (-89);
                        i7 = ((m69812 ^ i5) * 8817) ^ (-278095367);
                        i4 = 1938445402;
                        i8 = m69812 ^ i4;
                        activityC14946 = this;
                    }
                case -738549203:
                case 303325631:
                    str2 = C0050.m948(f45554, 363, 3, i12);
                    if (C3683.f11629 >= 0) {
                        menuInflater = menuInflater2;
                        m2566 = (C2105.m6981("۬ܰ") ^ i5) * 19;
                        i7 = ((m2566 ^ i6) * (-17371)) ^ 1755476767;
                        i3 = 1393730309;
                        i8 = m2566 ^ i3;
                        activityC14946 = this;
                        menuInflater2 = menuInflater;
                    } else {
                        m6981 = C2105.m6981("ܰ۠") ^ i6;
                        i = ((m6981 ^ i5) * (-25577)) ^ (-2091369888);
                        i2 = -147849195;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                case -731106472:
                case -210775881:
                    c15545 = activityC14946.f45562;
                    sArr = f45554;
                    i13 = 360;
                    i14 = 3;
                    if (C4075.f12947 < 0) {
                        m6981 = C2105.m6981("᩵ᩳ") ^ i6;
                        i = ((m6981 ^ i5) * (-30713)) ^ 1424961450;
                        i2 = 2125052135;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                    m6981 = C0630.m2566("ۙ۬") ^ i6;
                    i = ((m6981 ^ i5) * (-19497)) ^ (-1008715106);
                    i2 = -1083407600;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case -565850517:
                case 1257693009:
                    i9 = C0630.m2566(C2167.m7159(sArr, i13, i14, i12));
                    if (C21923.f70183 != 0) {
                        menuInflater = menuInflater2;
                        m2566 = C0630.m2566("۠۠") ^ i5;
                        i7 = ((m2566 ^ i6) * (-4531)) ^ (-116694882);
                        i3 = -204188152;
                        i8 = m2566 ^ i3;
                        activityC14946 = this;
                        menuInflater2 = menuInflater;
                    } else {
                        m6981 = (C2105.m6981("ܿ᩶") + i5) * (-17);
                        i = ((m6981 ^ i6) * (-10445)) ^ 1123059078;
                        i2 = -1122269233;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                case -402580317:
                case 304112954:
                    C3245.m9925();
                    return false;
                case 64434519:
                case 1896850656:
                    i20 = C2105.m6981(C2958.m9031(f45554, 366, 3, i12));
                    if (C2105.m6982() != 0) {
                        m69812 = (i6 - C2105.m6981("ۡ֨")) * (-89);
                        i7 = ((m69812 ^ i5) * 8817) ^ (-278095367);
                        i4 = 1938445402;
                        i8 = m69812 ^ i4;
                        activityC14946 = this;
                    } else {
                        m6981 = (i6 - C2105.m6981("ܶۧ")) * 33;
                        i = ((m6981 ^ i5) * 1875) ^ 539078628;
                        i2 = -1999007690;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                case 129030878:
                case 2104891403:
                    menuInflater = menuInflater2;
                    sArr2 = f45554;
                    c = 356;
                    if (C4263.m12819() < 0) {
                        m2566 = C2105.m6981("۬᩻") ^ i5;
                        i7 = ((m2566 ^ i6) * 15863) ^ 60624355;
                        i3 = -1997660064;
                        i8 = m2566 ^ i3;
                        activityC14946 = this;
                        menuInflater2 = menuInflater;
                    }
                    m2566 = C0630.m2566("۠۠") ^ i5;
                    i7 = ((m2566 ^ i6) * (-4531)) ^ (-116694882);
                    i3 = -204188152;
                    i8 = m2566 ^ i3;
                    activityC14946 = this;
                    menuInflater2 = menuInflater;
                case 489582061:
                case 695141949:
                    menuInflater = menuInflater2;
                    menuInflater.inflate(C0630.m2566(str) ^ 2118458552, menu);
                    if (activityC14946.f45565) {
                        m2566 = (C0630.m2566("ۢ᩵") + i5) * 59;
                        i7 = ((m2566 ^ i6) * 30975) ^ (-126604038);
                        i3 = 361871988;
                        i8 = m2566 ^ i3;
                        activityC14946 = this;
                        menuInflater2 = menuInflater;
                    } else {
                        int m25662 = C0630.m2566("ۗۨ") ^ i5;
                        i8 = m25662 ^ (-1991600230);
                        i7 = ((m25662 ^ i6) * 1247) ^ (-1846433517);
                        menuInflater2 = menuInflater;
                        activityC14946 = this;
                    }
                case 648057808:
                case 1108300396:
                    z = false;
                    C0050.m943(C1916.m6301(menu, i10 ^ i11), false);
                    if (C0630.f2410 <= 0) {
                        menuInflater = menuInflater2;
                        m2566 = C0630.m2566("۠۠") ^ i5;
                        i7 = ((m2566 ^ i6) * (-4531)) ^ (-116694882);
                        i3 = -204188152;
                        i8 = m2566 ^ i3;
                        activityC14946 = this;
                        menuInflater2 = menuInflater;
                    } else {
                        m6981 = (C0630.m2566("ۖ۬") ^ i6) * (-93);
                        i = ((m6981 ^ i5) * 20733) ^ 546780603;
                        i2 = -1959462822;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                case 955689963:
                case 1094334019:
                    menuInflater = menuInflater2;
                    i12 = 36798;
                    m2566 = C0630.m2566("᩸ۧ") ^ i6;
                    i7 = ((m2566 ^ i5) * (-13263)) ^ 1971023457;
                    i3 = -1251482959;
                    i8 = m2566 ^ i3;
                    activityC14946 = this;
                    menuInflater2 = menuInflater;
                default:
                    menuInflater = menuInflater2;
                    i15 = i18 * i18;
                    i16 = s * s;
                    i17 = 60388441;
                    if (C1128.f4106 > 0) {
                        m2566 = (C0630.m2566("ۜ֫") ^ i6) * q.h;
                        i7 = ((m2566 ^ i5) * 26393) ^ (-1135170669);
                        i3 = 1464710976;
                        i8 = m2566 ^ i3;
                        activityC14946 = this;
                        menuInflater2 = menuInflater;
                    }
                    m2566 = (C2105.m6981("۬ܰ") ^ i5) * 19;
                    i7 = ((m2566 ^ i6) * (-17371)) ^ 1755476767;
                    i3 = 1393730309;
                    i8 = m2566 ^ i3;
                    activityC14946 = this;
                    menuInflater2 = menuInflater;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00fa, code lost:
    
        if (l.C21923.f70183 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00d6, code lost:
    
        if (l.C4075.f12947 < 0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onOptionsItemSelected(android.view.MenuItem r39) {
        /*
            Method dump skipped, instructions count: 2352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC14946.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0137, code lost:
    
        r6 = l.C0630.m2566("ۙܰ") ^ r4;
        r7 = ((r6 ^ r5) * 8599) ^ (-1605529187);
        r8 = -1104996820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0118, code lost:
    
        r6 = (l.C2105.m6981("ۡۜ") + r4) * (-21);
        r7 = ((r6 ^ r5) * (-18139)) ^ 1497388137;
        r8 = 1986946829;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0100, code lost:
    
        r6 = l.C2105.m6981("᩶ܺ") ^ r5;
        r7 = ((r6 ^ r4) * (-1507)) ^ (-475657198);
        r8 = -2107359160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        r6 = (r5 - l.C0630.m2566("ۖܶ")) * 37;
        r7 = ((r6 ^ r4) * (-13313)) ^ (-465381526);
        r8 = 1835888519;
     */
    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] m35407() {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC14946.m35407():byte[]");
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        C15545 c15545 = null;
        int i = -1474828796;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = C4075.f12947;
        int m2566 = C0630.m2566("ܶ᩻") ^ i2;
        int i4 = ((m2566 ^ i3) * 23679) ^ (-1740611177);
        int i5 = 1670248068;
        while (true) {
            i = ((((i ^ i3) * (-25631)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1841038682:
                case -187143320:
                    if (C22628.f73083 <= 0) {
                        m2566 = (i2 - C2105.m6981("ۖ۠")) * (-71);
                        i4 = ((m2566 ^ i3) * (-20465)) ^ (-345382312);
                        i5 = -921542862;
                    } else {
                        m2566 = C0630.m2566("ۧ۠") ^ i3;
                        i4 = ((m2566 ^ i2) * (-27183)) ^ 1191572376;
                        i5 = 1677362542;
                    }
                case -1745398635:
                case -1385340851:
                    if (RunnableC1937.m6387() != 0) {
                        m2566 = (i2 - C0630.m2566("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m2566 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    } else {
                        m2566 = C0630.m2566("֫ܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-10485)) ^ 43416760;
                        i5 = 1434805959;
                    }
                case -1687711327:
                case 1279234687:
                    C1420.m4913();
                    if (C3663.f11553) {
                        m2566 = C0630.m2566("ۜ֨") ^ i2;
                        i4 = ((m2566 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    } else {
                        m2566 = C0630.m2566("֡ۜ") ^ i3;
                        i4 = ((m2566 ^ i2) * 19731) ^ 872861308;
                        i5 = 736689303;
                    }
                case -1612660630:
                case -572603923:
                    if (C1504.m5179()) {
                        m2566 = C2105.m6981("᩸ܰ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10741)) ^ 1433355891;
                        i5 = -966564567;
                    } else {
                        m2566 = (i2 - C0630.m2566("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m2566 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    }
                case -1548527596:
                case -492067020:
                    if (RunnableC3474.m10630()) {
                        m2566 = (C2105.m6981("ܿ᩸") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((m2566 ^ i2) * (-20773)) ^ 633693335;
                        i5 = 442918439;
                    } else {
                        m2566 = C0630.m2566("ۜ֨") ^ i2;
                        i4 = ((m2566 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    }
                case -1029440603:
                case 184918099:
                    if (C3245.f10203 <= 0) {
                        m2566 = C0630.m2566("ۜ֨") ^ i2;
                        i4 = ((m2566 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    } else {
                        m2566 = (C0630.m2566("ۧۙ") + i2) * (-17);
                        i4 = ((m2566 ^ i3) * 28339) ^ (-2122553384);
                        i5 = -2137843269;
                    }
                case -771762133:
                case 135898876:
                    if (C4075.f12947 >= 0) {
                        m2566 = C0630.m2566("ۜ֨") ^ i2;
                        i4 = ((m2566 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    } else {
                        m2566 = C0630.m2566("᩸ܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-4081)) ^ (-1559902239);
                        i5 = -1436603170;
                    }
                case -645265107:
                case 2113091791:
                    break;
                case -541194488:
                case 1937637303:
                    c15545.m36684();
                    m2566 = C0630.m2566("֨ۗ") ^ i3;
                    i4 = ((m2566 ^ i2) * 11323) ^ (-734729054);
                    i5 = -173498568;
                case -385845284:
                case 1852404873:
                    if (C2126.f7087) {
                        m2566 = C0630.m2566("֡ۜ") ^ i3;
                        i4 = ((m2566 ^ i2) * 19731) ^ 872861308;
                        i5 = 736689303;
                    } else {
                        m2566 = (C0630.m2566("ۨܺ") ^ i2) * (-119);
                        i4 = ((m2566 ^ i3) * (-28961)) ^ 794740819;
                        i5 = 1324347968;
                    }
                case -341751697:
                case 116451553:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = (i2 - C0630.m2566("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m2566 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    } else {
                        m2566 = C0630.m2566("ܰۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * 16107) ^ (-889644712);
                        i5 = 674635460;
                    }
                case -178608221:
                case 1920286914:
                    c15545 = this.f45562;
                    if (c15545 != null) {
                        m2566 = C0630.m2566("ۧ᩺") ^ i2;
                        i4 = ((m2566 ^ i3) * 31781) ^ (-1277532365);
                        i5 = 660515827;
                    } else {
                        m2566 = C0630.m2566("֨ۗ") ^ i3;
                        i4 = ((m2566 ^ i2) * 11323) ^ (-734729054);
                        i5 = -173498568;
                    }
                case -25185490:
                case 1864409239:
                    if (C3683.f11629 >= 0) {
                        m2566 = (i2 - C0630.m2566("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m2566 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    } else {
                        m2566 = (i3 - C2105.m6981("֡ۙ")) * (-105);
                        i4 = ((m2566 ^ i2) * 26145) ^ (-1106094239);
                        i5 = -799804379;
                    }
                case 372863260:
                case 1665695223:
                    C2167.m7155();
                    if (C0483.f2088 < 0) {
                        m2566 = C0630.m2566("ۜ֨") ^ i2;
                        i4 = ((m2566 ^ i3) * (-20627)) ^ (-264505712);
                        i5 = 2103683635;
                    } else {
                        m2566 = (i2 - C0630.m2566("ۤۜ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m2566 ^ i3) * (-13179)) ^ (-50976363);
                        i5 = -830701784;
                    }
                case 445634495:
                case 692114504:
                    C1504.m5179();
                    RunnableC0588.m2441();
                    break;
                case 864646199:
                case 934193334:
                    super.onResume();
                    if (C1916.f6442) {
                        m2566 = C0630.m2566("ۘ᩻") ^ i3;
                        i4 = ((m2566 ^ i2) * 6065) ^ (-426996389);
                        i5 = -2143135353;
                    } else {
                        m2566 = (C2105.m6981("ܿ᩸") + i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((m2566 ^ i2) * (-20773)) ^ 633693335;
                        i5 = 442918439;
                    }
                case 1441921971:
                case 1776581582:
                    C4616.m13552();
                    C7811.m20844();
                    m2566 = C0630.m2566("ۜ֨") ^ i2;
                    i4 = ((m2566 ^ i3) * (-20627)) ^ (-264505712);
                    i5 = 2103683635;
                default:
                    if (C1773.f6144 <= 0) {
                        m2566 = (i2 - C2105.m6981("ۖ۠")) * (-71);
                        i4 = ((m2566 ^ i3) * (-20465)) ^ (-345382312);
                        i5 = -921542862;
                    } else {
                        m2566 = (C0630.m2566("ۡܶ") ^ i2) * (-75);
                        i4 = ((m2566 ^ i3) * (-22181)) ^ (-2144483609);
                        i5 = -1396612343;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0081, code lost:
    
        if (l.C3683.f11629 >= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008b, code lost:
    
        if (l.C4263.f13799 <= 0) goto L9;
     */
    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSaveInstanceState(android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC14946.onSaveInstanceState(android.os.Bundle):void");
    }
}
