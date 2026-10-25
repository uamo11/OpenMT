package l;

import android.content.ClipboardManager;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.util.ThreadUtil;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import moe.shizuku.server.IShizukuService;

/* compiled from: R3YJ */
/* renamed from: l.ۤ᩻᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10632 implements PluginContext {

    /* renamed from: ۡ᩵ۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f31946 = {9479, 17105, 17118, 17115, 17090, 17104, 17117, 17107, 17088, 17110, 6275, 6814, 6786, 6811, 6793, 6791, 6784, 6823, 6794, 6814, 6786, 6811, 6793, 6791, 6784, 6846, 6812, 6795, 6792, 6795, 6812, 6795, 6784, 6797, 6795, 399, 16738, 16766, 16766, 16762, 16688, 16677, 16677, 16738, 16766, 16766, 16762, 16761, 16688, 16677, 16677, 2403, 13449, 8883, 9233, 9229, 9233, 9237, 9229, 9234, 9235, 9111, 22233, 22270, 22264, 22243, 22244, 22253, 9248, -15960, -15985, -15991, -15982, -15979, -15972, -15909, -15979, -15980, -15985, -15909, -15971, -15980, -15986, -15979, -15969, -15935, -15909, 2380, -17338, -17333, -17340, -17331, -17319, -17314, -17320, -17341, -17340, -17331, -17319, 1795, 2078, -16312, 185, 13810, 8230, 3479, 8258, 7939, -12992, -6432, 3432, 16042, 16056, 16056, 16046, 16063, 16056, 16100};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3432 f31947;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f31948;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public volatile SharedPreferences f31949;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f31950;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC1459 f31951;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C11505 f31952;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ClipboardManager f31953;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11505 f31954;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13970 f31955;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C20510 f31956;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3432 f31957;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f31958;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f31959;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f31960;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC12748 f31961;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f31962;

    @Override // bin.mt.plugin.api.PluginContext
    public final int getHostVersionCode() {
        return 26101061;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getHostVersionName() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = -1820633420;
        int i8 = C0483.f2088;
        int i9 = RunnableC1937.f6483;
        int m6981 = C2105.m6981("᩷ܰ") ^ i9;
        int i10 = ((m6981 ^ i8) * (-6923)) ^ (-555424111);
        int i11 = -1071229787;
        while (true) {
            i7 = ((((i7 ^ i8) * (-10893)) >> 31) & i10) ^ (m6981 ^ i11);
            switch (i7) {
                case -2069120883:
                case -1096130499:
                    i5 = 9251;
                    m6981 = (i9 - C2105.m6981("ܿۙ")) * (-31);
                    i10 = ((m6981 ^ i8) * (-4547)) ^ (-107149094);
                    i11 = 1538723387;
                case -1851879261:
                case 235404384:
                    i5 = 30944;
                    m6981 = (i9 - C2105.m6981("ܿۙ")) * (-31);
                    i10 = ((m6981 ^ i8) * (-4547)) ^ (-107149094);
                    i11 = 1538723387;
                case -1746844008:
                case 1928619833:
                    int i12 = i3 + i4;
                    if (i2 - (i12 + i12) > 0) {
                        m6981 = (C2105.m6981("۟ᩴ") ^ i8) * 23;
                        i10 = ((m6981 ^ i9) * (-28603)) ^ 695833011;
                        i11 = 36853242;
                    } else {
                        m6981 = C2105.m6981("᩵ᩳ") ^ i8;
                        i10 = ((m6981 ^ i9) * 29387) ^ (-1641085779);
                        i11 = 1636464800;
                    }
                case -1708150859:
                case 2094243067:
                    s = sArr[c];
                    if (RunnableC1108.f4040) {
                        m6981 = (i8 - C0630.m2566("᩵ۨ")) * (-31);
                        i10 = ((m6981 ^ i9) * 1127) ^ (-275885219);
                        i11 = 1606440253;
                    } else {
                        m6981 = C0630.m2566("ܿ۬") ^ i8;
                        i10 = ((m6981 ^ i9) * 527) ^ 47996797;
                        i11 = -1578822408;
                    }
                case -1553151614:
                case 2064280954:
                    i4 = 213685924;
                    if (C7811.f24123 >= 0) {
                        m6981 = (C0630.m2566("᩸ܳ") + i9) * 37;
                        i10 = ((m6981 ^ i8) * 22325) ^ (-1081865802);
                        i11 = 677404674;
                    } else {
                        m6981 = C0630.m2566("᩸ۨ") ^ i9;
                        i10 = ((m6981 ^ i8) * 377) ^ 455378096;
                        i11 = 100770498;
                    }
                case -1529026099:
                case 1090661926:
                    i = s + 14618;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C0630.m2566("ܿ۬") ^ i8;
                        i10 = ((m6981 ^ i9) * 527) ^ 47996797;
                        i11 = -1578822408;
                    } else {
                        m6981 = (C0630.m2566("ۚܳ") + i8) * (-103);
                        i10 = ((m6981 ^ i9) * 2341) ^ (-1977285229);
                        i11 = -703408930;
                    }
                case -1451188523:
                case -930346899:
                    if (C0050.f910 >= 0) {
                        m6981 = (C0630.m2566("᩸ܳ") + i9) * 37;
                        i10 = ((m6981 ^ i8) * 22325) ^ (-1081865802);
                        i11 = 677404674;
                    } else {
                        m6981 = (i9 - C0630.m2566("᩺᩺")) * (-89);
                        i10 = ((m6981 ^ i8) * 25083) ^ 792275449;
                        i11 = -1668925607;
                    }
                case -1380778894:
                case 1227193157:
                    C0964.m3413();
                    ServiceConnectionC3453.m10564();
                    m6981 = (C2105.m6981("ۡܰ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i10 = ((m6981 ^ i8) * (-12877)) ^ (-2046175052);
                    i11 = 606691120;
                case -1306834698:
                case 238227339:
                    sArr2 = f31946;
                    i6 = 54;
                    if (C3683.f11629 >= 0) {
                        m6981 = C0630.m2566("ܿ۬") ^ i8;
                        i10 = ((m6981 ^ i9) * 527) ^ 47996797;
                        i11 = -1578822408;
                    } else {
                        m6981 = C2105.m6981("۬ܿ") ^ i8;
                        i10 = ((m6981 ^ i9) * 3053) ^ (-1428163273);
                        i11 = 1010209503;
                    }
                case -795063969:
                case -295510302:
                    i2 = i * i;
                    i3 = s * s;
                    if (C4616.f14690 <= 0) {
                        m6981 = C2105.m6981("ᩳۙ") ^ i9;
                        i10 = ((m6981 ^ i8) * 5463) ^ 1126781819;
                        i11 = -336505271;
                    } else {
                        m6981 = C0630.m2566("ۛ᩹") ^ i9;
                        i10 = ((m6981 ^ i8) * 1611) ^ 1286328581;
                        i11 = -353805138;
                    }
                case -731135745:
                case -645207871:
                    if (C0422.f1886 <= 0) {
                        m6981 = (C2105.m6981("ۡܰ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i10 = ((m6981 ^ i8) * (-12877)) ^ (-2046175052);
                        i11 = 606691120;
                    } else {
                        m6981 = C2105.m6981("ۨ᩸") ^ i8;
                        i10 = ((m6981 ^ i9) * 7865) ^ 1837750460;
                        i11 = 2115098080;
                    }
                case -629612849:
                case 1040614171:
                    if (C1128.f4106 <= 0) {
                        m6981 = (C2105.m6981("ۡܰ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i10 = ((m6981 ^ i8) * (-12877)) ^ (-2046175052);
                        i11 = 606691120;
                    } else {
                        m6981 = C0630.m2566("ᩳۨ") ^ i8;
                        i10 = ((m6981 ^ i9) * (-3039)) ^ 509469771;
                        i11 = 1922207908;
                    }
                case -485156593:
                case 1652524362:
                    return C3019.m9250(sArr2, i6, 7, i5);
                case -366771073:
                case 1867009731:
                    c = '5';
                    if (C4263.f13799 <= 0) {
                        m6981 = C0630.m2566("ܿ۬") ^ i8;
                        i10 = ((m6981 ^ i9) * 527) ^ 47996797;
                        i11 = -1578822408;
                    } else {
                        m6981 = (C2105.m6981("ܽܿ") ^ i9) * (-73);
                        i10 = ((m6981 ^ i8) * (-22537)) ^ (-1311607389);
                        i11 = -65319283;
                    }
                case -344186393:
                case 2047980453:
                    if (C0237.f1507 == 0) {
                        m6981 = (C2105.m6981("ۡܰ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i10 = ((m6981 ^ i8) * (-12877)) ^ (-2046175052);
                        i11 = 606691120;
                    } else {
                        m6981 = (C0630.m2566("᩸ܳ") + i9) * 37;
                        i10 = ((m6981 ^ i8) * 22325) ^ (-1081865802);
                        i11 = 677404674;
                    }
                case 1092431429:
                case 1178657651:
                    C4159.m12565();
                    C3746.m11369();
                    return null;
                case 1371975702:
                case 1989973239:
                    sArr = f31946;
                    if (C0798.f2919) {
                        m6981 = C0630.m2566("ᩳۨ") ^ i8;
                        i10 = ((m6981 ^ i9) * (-3039)) ^ 509469771;
                        i11 = 1922207908;
                    } else {
                        m6981 = (C0630.m2566("ܳۖ") + i8) * 59;
                        i10 = ((m6981 ^ i9) * 23955) ^ (-711157280);
                        i11 = -1512710897;
                    }
                case 1647917463:
                case 2126947702:
                    C0964.m3413();
                    if (C3245.f10203 > 0) {
                        m6981 = C0630.m2566("ᩳۨ") ^ i8;
                        i10 = ((m6981 ^ i9) * (-3039)) ^ 509469771;
                        i11 = 1922207908;
                    } else {
                        m6981 = C2105.m6981("ᩳۙ") ^ i9;
                        i10 = ((m6981 ^ i8) * 5463) ^ 1126781819;
                        i11 = -336505271;
                    }
                default:
                    if (C11340.f33930 >= 0) {
                        m6981 = (C2105.m6981("ۡܰ") ^ i9) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i10 = ((m6981 ^ i8) * (-12877)) ^ (-2046175052);
                        i11 = 606691120;
                    } else {
                        m6981 = C2105.m6981("ۢܿ") ^ i9;
                        i10 = ((m6981 ^ i8) * (-10473)) ^ (-1058663024);
                        i11 = 2076215240;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m26670(String str, Object... objArr) {
        Resources resources = null;
        Configuration configuration = null;
        Locale locale = null;
        int i = 183097102;
        int i2 = C2958.f9394;
        int i3 = ViewOnClickListenerC1958.f6529;
        int m6981 = C2105.m6981("᩻۟") ^ i3;
        int i4 = ((m6981 ^ i2) * 14681) ^ 1496377170;
        int i5 = 908510975;
        while (true) {
            i = ((((i ^ i2) * 11381) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2018772000:
                case -1782820070:
                    C0050.m940();
                    if (C5695.m16023() >= 0) {
                        m6981 = (C0630.m2566("ۨ᩷") + i3) * (-107);
                        i4 = ((m6981 ^ i2) * 2605) ^ 1385804985;
                        i5 = 18358658;
                    } else {
                        m6981 = (i2 - C0630.m2566("ۛ֡")) * (-113);
                        i4 = ((m6981 ^ i3) * 17795) ^ 792474018;
                        i5 = 226281335;
                    }
                case -1800309499:
                case -1307570686:
                    if (C2958.m9034() <= 0) {
                        m6981 = (i2 - C0630.m2566("ۛ֡")) * (-113);
                        i4 = ((m6981 ^ i3) * 17795) ^ 792474018;
                        i5 = 226281335;
                    } else {
                        m6981 = (C2105.m6981("ۜ᩷") + i3) * 37;
                        i4 = ((m6981 ^ i2) * 95) ^ 346144148;
                        i5 = -1260150525;
                    }
                case -1649742887:
                case 1122097886:
                    if (C22628.m50615() != 0) {
                        m6981 = (C2105.m6981("۠ܰ") ^ i2) * 97;
                        i4 = ((m6981 ^ i3) * 27795) ^ 1082073899;
                        i5 = -1256427226;
                    } else {
                        m6981 = (C0630.m2566("ᩳ᩻") ^ i3) * (-41);
                        i4 = ((m6981 ^ i2) * (-5403)) ^ 1687102172;
                        i5 = 1145141611;
                    }
                case -1316028287:
                case -978469205:
                    if (RunnableC1937.f6483 < 0) {
                        m6981 = (C0630.m2566("ۨ᩷") + i3) * (-107);
                        i4 = ((m6981 ^ i2) * 2605) ^ 1385804985;
                        i5 = 18358658;
                    } else {
                        m6981 = C2105.m6981("ܺܺ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-1349)) ^ (-2138599846);
                        i5 = -1046540179;
                    }
                case -1255553685:
                case 701954664:
                    if (C3663.f11553) {
                        m6981 = C2105.m6981("ܺܺ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-1349)) ^ (-2138599846);
                        i5 = -1046540179;
                    } else {
                        m6981 = (C2105.m6981("ۨ᩺") ^ i3) * (-53);
                        i4 = ((m6981 ^ i2) * 7189) ^ 205425380;
                        i5 = 904343633;
                    }
                case -1023733854:
                case -290049688:
                    if (C2958.m9034() <= 0) {
                        m6981 = (i2 - C0630.m2566("ۛ֡")) * (-113);
                        i4 = ((m6981 ^ i3) * 17795) ^ 792474018;
                        i5 = 226281335;
                    } else {
                        m6981 = (C2105.m6981("ۚۡ") ^ i2) * (-71);
                        i4 = ((m6981 ^ i3) * 22211) ^ 2114881142;
                        i5 = 709330232;
                    }
                case -964621976:
                case 684729010:
                    C0237.m1481();
                    if (RunnableC1937.f6483 < 0) {
                        m6981 = (C0630.m2566("ۨ᩷") + i3) * (-107);
                        i4 = ((m6981 ^ i2) * 2605) ^ 1385804985;
                        i5 = 18358658;
                    } else {
                        m6981 = (C2105.m6981("۠ܰ") ^ i2) * 97;
                        i4 = ((m6981 ^ i3) * 27795) ^ 1082073899;
                        i5 = -1256427226;
                    }
                case -710020932:
                case 1228268208:
                    C1128.m3851();
                    return null;
                case -627530602:
                case -249431594:
                    return String.format(locale, str, objArr);
                case -338405127:
                case 2117229795:
                    if (C1504.f5354) {
                        m6981 = (C2105.m6981("۠ܰ") ^ i2) * 97;
                        i4 = ((m6981 ^ i3) * 27795) ^ 1082073899;
                        i5 = -1256427226;
                    } else {
                        m6981 = C2105.m6981("۫֫") ^ i2;
                        i4 = ((m6981 ^ i3) * (-14845)) ^ (-1567449977);
                        i5 = 1194461365;
                    }
                case 420529274:
                case 851480435:
                    configuration = resources.getConfiguration();
                    if (C3683.f11629 >= 0) {
                        m6981 = (C2105.m6981("ۙۚ") + i2) * (-127);
                        i4 = ((m6981 ^ i3) * (-30481)) ^ 777883307;
                        i5 = -758654663;
                    } else {
                        m6981 = C0630.m2566("ܽᩳ") ^ i2;
                        i4 = ((m6981 ^ i3) * 20469) ^ (-516715201);
                        i5 = -723682936;
                    }
                case 570382793:
                case 1318648344:
                    Locale m11977 = C20865.m47679(configuration).m11977(0);
                    if (m11977 == null) {
                        m6981 = (i2 - C2105.m6981("ۧܰ")) * 59;
                        i4 = ((m6981 ^ i3) * 9589) ^ 764657875;
                        i5 = 1005659606;
                    } else {
                        locale = m11977;
                        m6981 = C2105.m6981("֫۟") ^ i3;
                        i4 = ((m6981 ^ i2) * (-9025)) ^ (-879471732);
                        i5 = -1526535307;
                    }
                case 652256142:
                case 1160007052:
                    locale = Locale.getDefault();
                    m6981 = C2105.m6981("֫۟") ^ i3;
                    i4 = ((m6981 ^ i2) * (-9025)) ^ (-879471732);
                    i5 = -1526535307;
                case 1074519450:
                case 1644583180:
                    if (C0050.f910 >= 0) {
                        m6981 = (C2105.m6981("۠ܰ") ^ i2) * 97;
                        i4 = ((m6981 ^ i3) * 27795) ^ 1082073899;
                        i5 = -1256427226;
                    } else {
                        m6981 = (C0630.m2566("֫֨") + i3) * 109;
                        i4 = ((m6981 ^ i2) * 24999) ^ (-1658281260);
                        i5 = -1574139746;
                    }
                case 1240319067:
                case 1520674518:
                    resources = C4925.m14338();
                    if (C0382.f1805) {
                        m6981 = (C0630.m2566("֫ۚ") + i3) * 33;
                        i4 = ((m6981 ^ i2) * (-31815)) ^ (-181146816);
                        i5 = -361808651;
                    } else {
                        m6981 = C2105.m6981("ܺܺ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-1349)) ^ (-2138599846);
                        i5 = -1046540179;
                    }
                case 1358809771:
                case 1901505690:
                    if (C1294.f4556 >= 0) {
                        m6981 = (i2 - C0630.m2566("ۛ֡")) * (-113);
                        i4 = ((m6981 ^ i3) * 17795) ^ 792474018;
                        i5 = 226281335;
                    } else {
                        m6981 = C2105.m6981("۠ۢ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-26855)) ^ (-1735234616);
                        i5 = 519462508;
                    }
                case 1425596481:
                case 2137431962:
                    C1916.m6308();
                    C1128.m3851();
                    m6981 = (C0630.m2566("ۨ᩷") + i3) * (-107);
                    i4 = ((m6981 ^ i2) * 2605) ^ 1385804985;
                    i5 = 18358658;
                default:
                    if (C21923.f70183 != 0) {
                        m6981 = (C2105.m6981("ۙۚ") + i2) * (-127);
                        i4 = ((m6981 ^ i3) * (-30481)) ^ 777883307;
                        i5 = -758654663;
                    } else {
                        m6981 = C0630.m2566("ۤ֨") ^ i2;
                        i4 = ((m6981 ^ i3) * 30045) ^ 757339481;
                        i5 = -1127234168;
                    }
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final InputStream getAssetsAsStream(String str) {
        Object obj = null;
        C16709 c16709 = null;
        C7621 c7621 = null;
        int i = -1952146833;
        int i2 = C3019.f9544;
        int i3 = C3911.f12484;
        int m2566 = (C0630.m2566("ۙܽ") ^ i3) * 65;
        int i4 = ((m2566 ^ i2) * 13997) ^ (-376239665);
        int i5 = -72505815;
        while (true) {
            i = ((((i ^ i2) * (-11893)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1971045874:
                case 1522080611:
                    return this.f31961.getAssetsAsStream(str);
                case -1675758522:
                case 1393145439:
                    ServiceConnectionC3453.m10564();
                    if (C2520.f8000 < 0) {
                        m2566 = C0630.m2566("ۜ֡") ^ i2;
                        i4 = ((m2566 ^ i3) * 7165) ^ (-1493444600);
                        i5 = 1089377258;
                    } else {
                        m2566 = C0630.m2566("ܽᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29899)) ^ 1592167445;
                        i5 = 1256257038;
                    }
                case -1488878296:
                case -93561422:
                    C3663.m11168();
                    C7811.m20844();
                    m2566 = C0630.m2566("ۜ֡") ^ i2;
                    i4 = ((m2566 ^ i3) * 7165) ^ (-1493444600);
                    i5 = 1089377258;
                case -1333107643:
                case 360860985:
                    this.f31961 = c7621;
                    if (C0422.f1886 <= 0) {
                        m2566 = C0630.m2566("ܽᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29899)) ^ 1592167445;
                        i5 = 1256257038;
                    } else {
                        this.f31951 = new C13453(this);
                        m2566 = (C0630.m2566("ۗۨ") ^ i3) * 115;
                        i4 = ((m2566 ^ i2) * (-6599)) ^ (-1442536239);
                        i5 = 854499426;
                    }
                case -1222766246:
                case -607450152:
                    if (this.f31961 != null) {
                        m2566 = (C0630.m2566("ۗۨ") ^ i3) * 115;
                        i4 = ((m2566 ^ i2) * (-6599)) ^ (-1442536239);
                        i5 = 854499426;
                    } else {
                        m2566 = (C0630.m2566("᩵᩶") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((m2566 ^ i3) * 1079) ^ (-139057798);
                        i5 = -1099086060;
                    }
                case -1180377672:
                case 556264109:
                    if (C21923.m49329()) {
                        m2566 = C2105.m6981("ܺᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-25935)) ^ 1247770053;
                        i5 = -932205702;
                    } else {
                        m2566 = (C0630.m2566("ܰۖ") ^ i3) * 57;
                        i4 = ((m2566 ^ i2) * (-11889)) ^ 593928479;
                        i5 = 298764564;
                    }
                case -638576006:
                case 1682884600:
                    if (C2520.f8000 >= 0) {
                        m2566 = C2105.m6981("ܺᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-25935)) ^ 1247770053;
                        i5 = -932205702;
                    } else {
                        m2566 = (i2 - C2105.m6981("ۤ᩹")) * (-79);
                        i4 = ((m2566 ^ i3) * (-31821)) ^ (-1075446769);
                        i5 = 315906259;
                    }
                case -518124261:
                case 573291857:
                    obj = this.f31952.f34362;
                    if (C4117.f13076 <= 0) {
                        m2566 = C0630.m2566("᩹ۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * 27953) ^ 1975071017;
                        i5 = -1260681265;
                    } else {
                        m2566 = (i3 - C2105.m6981("᩺ܰ")) * (-49);
                        i4 = ((m2566 ^ i2) * 24397) ^ 2029211280;
                        i5 = -21316940;
                    }
                case 384957874:
                case 1140555917:
                    if (C3245.f10203 <= 0) {
                        m2566 = C2105.m6981("ܺᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-25935)) ^ 1247770053;
                        i5 = -932205702;
                    } else {
                        m2566 = (i2 - C2105.m6981("۫ۨ")) * (-85);
                        i4 = ((m2566 ^ i3) * (-31369)) ^ 335278936;
                        i5 = 1672455854;
                    }
                case 634312947:
                case 894477802:
                    C1128.m3851();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = C0630.m2566("ܽᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29899)) ^ 1592167445;
                        i5 = 1256257038;
                    } else {
                        m2566 = C0630.m2566("᩹ۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * 27953) ^ 1975071017;
                        i5 = -1260681265;
                    }
                case 832473765:
                case 1264493464:
                    c16709 = (C16709) obj;
                    if (C2167.f7158 >= 0) {
                        m2566 = C2105.m6981("۟ܰ") ^ i3;
                        i4 = ((m2566 ^ i2) * 12651) ^ (-1545224315);
                        i5 = -1242936197;
                    } else {
                        m2566 = C0630.m2566("ܿܺ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-17527)) ^ 1601910052;
                        i5 = -605811834;
                    }
                case 877691542:
                case 1379637927:
                    C21923.m49329();
                    if (C0050.m940() > 0) {
                        m2566 = C0630.m2566("ܽᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29899)) ^ 1592167445;
                        i5 = 1256257038;
                    } else {
                        m2566 = C2105.m6981("۟ܰ") ^ i3;
                        i4 = ((m2566 ^ i2) * 12651) ^ (-1545224315);
                        i5 = -1242936197;
                    }
                case 910517677:
                case 1103209383:
                    c7621 = C16709.m39278(c16709);
                    if (C4616.f14690 <= 0) {
                        m2566 = C2105.m6981("ܺᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-25935)) ^ 1247770053;
                        i5 = -932205702;
                    } else {
                        m2566 = C0630.m2566("ۛۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-28139)) ^ (-79491029);
                        i5 = 1449761038;
                    }
                case 1069525232:
                case 1343403811:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = C2105.m6981("ܺᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-25935)) ^ 1247770053;
                        i5 = -932205702;
                    } else {
                        m2566 = C0630.m2566("ۘۚ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-3415)) ^ (-1720649920);
                        i5 = -1369779585;
                    }
                case 1140175573:
                case 2037930959:
                    if (C2272.m7503()) {
                        m2566 = C0630.m2566("᩹ۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * 27953) ^ 1975071017;
                        i5 = -1260681265;
                    } else {
                        m2566 = (C0630.m2566("ᩳۧ") + i3) * (-11);
                        i4 = ((m2566 ^ i2) * (-29615)) ^ 372384718;
                        i5 = 732331277;
                    }
                case 1396892027:
                case 2047415711:
                    if (C5695.f17556 >= 0) {
                        m2566 = C2105.m6981("۟ܰ") ^ i3;
                        i4 = ((m2566 ^ i2) * 12651) ^ (-1545224315);
                        i5 = -1242936197;
                    } else {
                        m2566 = C0630.m2566("֡ܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * 23533) ^ (-2025586258);
                        i5 = 1026070644;
                    }
                default:
                    C0382.m1848();
                    return null;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final LocalString getFileLocalString(File file, String str) {
        short[] sArr;
        int i;
        int i2;
        int i3;
        int m6981;
        int i4;
        int i5;
        int m69812;
        int i6;
        int i7;
        int i8;
        int m2566;
        int i9;
        int i10;
        C20510 c20510;
        int i11;
        int m69813;
        int i12;
        int i13;
        int i14 = C5695.f17556;
        int i15 = C3746.f11829;
        int m69814 = C2105.m6981("᩸ܺ") ^ i14;
        int i16 = ((m69814 ^ i15) * 9201) ^ 988069772;
        short[] sArr2 = null;
        int i17 = m69814 ^ 433093156;
        short s = 0;
        int i18 = 0;
        int i19 = 0;
        short s2 = 0;
        int i20 = 0;
        int i21 = -854502937;
        C20510 c205102 = null;
        C20510 c205103 = null;
        Reference reference = null;
        C3432 c3432 = null;
        while (true) {
            int i22 = i17 ^ (i16 & (((i21 ^ i15) * (-17227)) >> 31));
            switch (i22) {
                case -2129668997:
                case -405666539:
                    i = i18;
                    i2 = i19;
                    i3 = i22;
                    sArr2 = f31946;
                    if (C3537.f11231 < 0) {
                        m69813 = (C2105.m6981("ۧۡ") + i14) * 23;
                        i12 = ((m69813 ^ i15) * 31761) ^ (-606423786);
                        i13 = 979156901;
                        int i23 = m69813 ^ i13;
                        i21 = i3;
                        i19 = i2;
                        i17 = i23;
                        i16 = i12;
                        i18 = i;
                    }
                    m69813 = C2105.m6981("۬ۢ") ^ i14;
                    i12 = ((m69813 ^ i15) * 30767) ^ 10560482;
                    i13 = -39427819;
                    int i232 = m69813 ^ i13;
                    i21 = i3;
                    i19 = i2;
                    i17 = i232;
                    i16 = i12;
                    i18 = i;
                case -2043182806:
                case 277978164:
                    C1047.m3599();
                    sArr = sArr2;
                    i = i18;
                    i2 = i19;
                    i3 = i22;
                    m6981 = (C2105.m6981("ۢ۫") + i15) * 25;
                    i4 = ((m6981 ^ i14) * 21009) ^ (-204236567);
                    i5 = -187935935;
                    i11 = m6981 ^ i5;
                    i21 = i3;
                    i18 = i;
                    i19 = i2;
                    i17 = i11;
                    i16 = i4;
                    sArr2 = sArr;
                case -2016157841:
                case -8261057:
                    C22628.m50615();
                    return null;
                case -1674068317:
                case 1282167378:
                    sArr = sArr2;
                    i = i18;
                    i2 = i19;
                    i3 = i22;
                    c20510 = (C20510) reference.get();
                    c205103 = c20510;
                    m6981 = (C0630.m2566("֫ۤ") + i14) * 127;
                    i4 = ((m6981 ^ i15) * (-23015)) ^ (-713240776);
                    i5 = -1902623682;
                    i11 = m6981 ^ i5;
                    i21 = i3;
                    i18 = i;
                    i19 = i2;
                    i17 = i11;
                    i16 = i4;
                    sArr2 = sArr;
                case -1548801485:
                case 987621861:
                    sArr = sArr2;
                    i7 = i18;
                    i3 = i22;
                    int i24 = i7 + 96687889;
                    i8 = i24 + i24;
                    if (!C0798.f2919) {
                        m2566 = C0630.m2566("ܺۛ") ^ i14;
                        i9 = ((m2566 ^ i15) * 25531) ^ 1432216009;
                        i10 = 821294649;
                        int i25 = m2566 ^ i10;
                        i19 = i8;
                        i16 = i9;
                        i21 = i3;
                        i18 = i7;
                        i17 = i25;
                        sArr2 = sArr;
                    }
                    m2566 = C2105.m6981("۫᩷") ^ i14;
                    i9 = ((m2566 ^ i15) * (-31447)) ^ (-1822072356);
                    i10 = -1967008256;
                    int i252 = m2566 ^ i10;
                    i19 = i8;
                    i16 = i9;
                    i21 = i3;
                    i18 = i7;
                    i17 = i252;
                    sArr2 = sArr;
                case -1377730266:
                case 554238957:
                    AbstractC2021.m6574();
                    if (C0237.f1507 == 0) {
                        sArr = sArr2;
                        i7 = i18;
                        i8 = i19;
                        i3 = i22;
                        m2566 = C2105.m6981("۫᩷") ^ i14;
                        i9 = ((m2566 ^ i15) * (-31447)) ^ (-1822072356);
                        i10 = -1967008256;
                        int i2522 = m2566 ^ i10;
                        i19 = i8;
                        i16 = i9;
                        i21 = i3;
                        i18 = i7;
                        i17 = i2522;
                        sArr2 = sArr;
                    }
                    sArr = sArr2;
                    i = i18;
                    i2 = i19;
                    i3 = i22;
                    m6981 = (C2105.m6981("ۢ۫") + i15) * 25;
                    i4 = ((m6981 ^ i14) * 21009) ^ (-204236567);
                    i5 = -187935935;
                    i11 = m6981 ^ i5;
                    i21 = i3;
                    i18 = i;
                    i19 = i2;
                    i17 = i11;
                    i16 = i4;
                    sArr2 = sArr;
                case -1341703853:
                case 973229869:
                    i3 = i22;
                    StringBuilder sb = new StringBuilder();
                    if (C1420.f5096 <= 0) {
                        sArr = sArr2;
                        i2 = i19;
                    } else {
                        sArr = sArr2;
                        C3245.m9923(sb, file.getPath());
                        if (AbstractC2021.f6743 <= 0) {
                            i7 = i18;
                            i8 = i19;
                            m2566 = C2105.m6981("۫᩷") ^ i14;
                            i9 = ((m2566 ^ i15) * (-31447)) ^ (-1822072356);
                            i10 = -1967008256;
                            int i25222 = m2566 ^ i10;
                            i19 = i8;
                            i16 = i9;
                            i21 = i3;
                            i18 = i7;
                            i17 = i25222;
                            sArr2 = sArr;
                        } else {
                            i = i18;
                            i2 = i19;
                            String m12817 = C4263.m12817(f31946, 52, 1, i20);
                            if (!C2126.f7087) {
                                C1420.m4905(sb, m12817);
                                C1420.m4905(sb, str);
                                String m1959 = C0422.m1959(sb);
                                if (C22628.f73083 > 0) {
                                    C8515 c8515 = new C8515(file);
                                    if (C4616.f14690 > 0) {
                                        C20510 c205104 = new C20510(this, str, m1959, c8515);
                                        c3432.put(str, new SoftReference(c205104));
                                        c205102 = c205104;
                                        m6981 = C0630.m2566("ܶ۟") ^ i15;
                                        i4 = ((m6981 ^ i14) * 12209) ^ 1356737952;
                                        i5 = 2117125811;
                                        i11 = m6981 ^ i5;
                                        i21 = i3;
                                        i18 = i;
                                        i19 = i2;
                                        i17 = i11;
                                        i16 = i4;
                                        sArr2 = sArr;
                                    }
                                    m6981 = (C2105.m6981("ۢ۫") + i15) * 25;
                                    i4 = ((m6981 ^ i14) * 21009) ^ (-204236567);
                                    i5 = -187935935;
                                    i11 = m6981 ^ i5;
                                    i21 = i3;
                                    i18 = i;
                                    i19 = i2;
                                    i17 = i11;
                                    i16 = i4;
                                    sArr2 = sArr;
                                }
                            }
                            i18 = i;
                        }
                    }
                    m69812 = C0630.m2566("ܳ᩶") ^ i14;
                    i4 = ((m69812 ^ i15) * (-2345)) ^ 973918377;
                    i6 = 443237040;
                    i11 = m69812 ^ i6;
                    i21 = i3;
                    i19 = i2;
                    i17 = i11;
                    i16 = i4;
                    sArr2 = sArr;
                case -1004683276:
                case 417949759:
                    return c205102;
                case -732472960:
                case 994274549:
                    sArr = sArr2;
                    i = i18;
                    i2 = i19;
                    i3 = i22;
                    c3432 = this.f31957;
                    c20510 = null;
                    reference = (Reference) c3432.getOrDefault(str, null);
                    if (reference != null) {
                        m6981 = (C2105.m6981("ۙۙ") + i15) * (-111);
                        i4 = ((m6981 ^ i14) * (-11485)) ^ 1449653815;
                        i5 = 721826695;
                        i11 = m6981 ^ i5;
                        i21 = i3;
                        i18 = i;
                        i19 = i2;
                        i17 = i11;
                        i16 = i4;
                        sArr2 = sArr;
                    }
                    c205103 = c20510;
                    m6981 = (C0630.m2566("֫ۤ") + i14) * 127;
                    i4 = ((m6981 ^ i15) * (-23015)) ^ (-713240776);
                    i5 = -1902623682;
                    i11 = m6981 ^ i5;
                    i21 = i3;
                    i18 = i;
                    i19 = i2;
                    i17 = i11;
                    i16 = i4;
                    sArr2 = sArr;
                case -574345073:
                case -254419225:
                    sArr = sArr2;
                    i = i18;
                    i2 = i19;
                    i3 = i22;
                    s2 = 9833;
                    if (C7106.f21815 != 0) {
                        sArr2 = sArr;
                        m69813 = C2105.m6981("۬ۢ") ^ i14;
                        i12 = ((m69813 ^ i15) * 30767) ^ 10560482;
                        i13 = -39427819;
                        int i2322 = m69813 ^ i13;
                        i21 = i3;
                        i19 = i2;
                        i17 = i2322;
                        i16 = i12;
                        i18 = i;
                    } else {
                        m6981 = (C0630.m2566("ᩳۡ") ^ i15) * 119;
                        i4 = ((m6981 ^ i14) * 29379) ^ (-1643099645);
                        i5 = -352499856;
                        i11 = m6981 ^ i5;
                        i21 = i3;
                        i18 = i;
                        i19 = i2;
                        i17 = i11;
                        i16 = i4;
                        sArr2 = sArr;
                    }
                case -489487795:
                case -186359375:
                    sArr = sArr2;
                    i = i18;
                    i2 = i19;
                    i3 = i22;
                    if (!C1711.f5919) {
                        m6981 = C2105.m6981("ۡ᩺") ^ i15;
                        i4 = ((m6981 ^ i14) * (-28885)) ^ 1370030775;
                        i5 = -2129943991;
                        i11 = m6981 ^ i5;
                        i21 = i3;
                        i18 = i;
                        i19 = i2;
                        i17 = i11;
                        i16 = i4;
                        sArr2 = sArr;
                    }
                    m6981 = (C2105.m6981("ܳܶ") ^ i15) * 57;
                    i4 = ((m6981 ^ i14) * (-31419)) ^ 1128549390;
                    i5 = 1268144880;
                    i11 = m6981 ^ i5;
                    i21 = i3;
                    i18 = i;
                    i19 = i2;
                    i17 = i11;
                    i16 = i4;
                    sArr2 = sArr;
                case -144925884:
                case -18784086:
                    if (!C1005.f3721) {
                        sArr = sArr2;
                        i = i18;
                        i2 = i19;
                        i3 = i22;
                        m6981 = (C2105.m6981("ܳܶ") ^ i15) * 57;
                        i4 = ((m6981 ^ i14) * (-31419)) ^ 1128549390;
                        i5 = 1268144880;
                        i11 = m6981 ^ i5;
                        i21 = i3;
                        i18 = i;
                        i19 = i2;
                        i17 = i11;
                        i16 = i4;
                        sArr2 = sArr;
                    }
                    sArr = sArr2;
                    i = i18;
                    i2 = i19;
                    i3 = i22;
                    m6981 = (C2105.m6981("ۢ۫") + i15) * 25;
                    i4 = ((m6981 ^ i14) * 21009) ^ (-204236567);
                    i5 = -187935935;
                    i11 = m6981 ^ i5;
                    i21 = i3;
                    i18 = i;
                    i19 = i2;
                    i17 = i11;
                    i16 = i4;
                    sArr2 = sArr;
                case -133065488:
                case 628512397:
                    sArr = sArr2;
                    i = i18;
                    i2 = i19;
                    i3 = i22;
                    int i26 = s + s2;
                    if ((i26 * i26) - i2 <= 0) {
                        m6981 = C0630.m2566("ۜܺ") ^ i14;
                        i4 = ((m6981 ^ i15) * 11629) ^ (-1565758026);
                        i5 = -709691627;
                    } else {
                        m6981 = C2105.m6981("᩸۠") ^ i15;
                        i4 = ((m6981 ^ i14) * 18749) ^ (-1680335852);
                        i5 = -1669562016;
                    }
                    i11 = m6981 ^ i5;
                    i21 = i3;
                    i18 = i;
                    i19 = i2;
                    i17 = i11;
                    i16 = i4;
                    sArr2 = sArr;
                case 157785339:
                case 539747630:
                    sArr = sArr2;
                    i = i18;
                    i2 = i19;
                    i3 = i22;
                    if (c205103 == null) {
                        m6981 = (C0630.m2566("۟᩷") + i14) * (-41);
                        i4 = ((m6981 ^ i15) * (-22547)) ^ 1206900978;
                        i5 = -1308471670;
                        i11 = m6981 ^ i5;
                        i21 = i3;
                        i18 = i;
                        i19 = i2;
                        i17 = i11;
                        i16 = i4;
                        sArr2 = sArr;
                    } else {
                        c205102 = c205103;
                        m6981 = C0630.m2566("ܶ۟") ^ i15;
                        i4 = ((m6981 ^ i14) * 12209) ^ 1356737952;
                        i5 = 2117125811;
                        i11 = m6981 ^ i5;
                        i21 = i3;
                        i18 = i;
                        i19 = i2;
                        i17 = i11;
                        i16 = i4;
                        sArr2 = sArr;
                    }
                case 268763606:
                case 948243612:
                    sArr = sArr2;
                    i = i18;
                    i2 = i19;
                    i3 = i22;
                    i20 = 13478;
                    m6981 = (C2105.m6981("۬ۛ") + i14) * (-67);
                    i4 = ((m6981 ^ i15) * (-18379)) ^ 2140530290;
                    i5 = -786695717;
                    i11 = m6981 ^ i5;
                    i21 = i3;
                    i18 = i;
                    i19 = i2;
                    i17 = i11;
                    i16 = i4;
                    sArr2 = sArr;
                case 355521142:
                case 1784348866:
                    sArr = sArr2;
                    i2 = i19;
                    i3 = i22;
                    s = sArr[51];
                    i18 = s * s;
                    if (!C1420.m4913()) {
                        m69812 = C2105.m6981("۫ܳ") ^ i15;
                        i4 = ((m69812 ^ i14) * 1563) ^ (-1021741464);
                        i6 = 1543797928;
                        i11 = m69812 ^ i6;
                        i21 = i3;
                        i19 = i2;
                        i17 = i11;
                        i16 = i4;
                        sArr2 = sArr;
                    }
                    m69812 = C0630.m2566("ܳ᩶") ^ i14;
                    i4 = ((m69812 ^ i15) * (-2345)) ^ 973918377;
                    i6 = 443237040;
                    i11 = m69812 ^ i6;
                    i21 = i3;
                    i19 = i2;
                    i17 = i11;
                    i16 = i4;
                    sArr2 = sArr;
                case 848452201:
                case 1744176827:
                    C1420.m4913();
                    if (C1420.f5096 > 0) {
                        sArr = sArr2;
                        i = i18;
                        i2 = i19;
                        i3 = i22;
                        m6981 = (C2105.m6981("ۢ۫") + i15) * 25;
                        i4 = ((m6981 ^ i14) * 21009) ^ (-204236567);
                        i5 = -187935935;
                        i11 = m6981 ^ i5;
                        i21 = i3;
                        i18 = i;
                        i19 = i2;
                        i17 = i11;
                        i16 = i4;
                        sArr2 = sArr;
                    } else {
                        i = i18;
                        i2 = i19;
                        i3 = i22;
                        m69813 = C2105.m6981("۬ۢ") ^ i14;
                        i12 = ((m69813 ^ i15) * 30767) ^ 10560482;
                        i13 = -39427819;
                        int i23222 = m69813 ^ i13;
                        i21 = i3;
                        i19 = i2;
                        i17 = i23222;
                        i16 = i12;
                        i18 = i;
                    }
                default:
                    sArr = sArr2;
                    i = i18;
                    i2 = i19;
                    i3 = i22;
                    i20 = 51433;
                    m6981 = (C2105.m6981("۬ۛ") + i14) * (-67);
                    i4 = ((m6981 ^ i15) * (-18379)) ^ 2140530290;
                    i5 = -786695717;
                    i11 = m6981 ^ i5;
                    i21 = i3;
                    i18 = i;
                    i19 = i2;
                    i17 = i11;
                    i16 = i4;
                    sArr2 = sArr;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getPluginName() {
        String str = null;
        String str2 = null;
        int i = -2060614343;
        int i2 = C3683.f11629;
        int i3 = ViewOnClickListenerC1958.f6529;
        int m6981 = (C2105.m6981("ۖۖ") + i3) * (-109);
        int i4 = ((m6981 ^ i2) * (-28167)) ^ 1555682729;
        int i5 = -1251390447;
        while (true) {
            i = ((((i ^ i2) * (-5739)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2088211344:
                case -629185909:
                    if (C1711.m5733(str, 0) == '{') {
                        m6981 = (C0630.m2566("᩻ۜ") ^ i2) * 45;
                        i4 = ((m6981 ^ i3) * 20327) ^ 381395894;
                        i5 = 1312526152;
                    } else {
                        m6981 = (i2 - C2105.m6981("ᩳ۠")) * (-95);
                        i4 = ((m6981 ^ i3) * (-13241)) ^ 1891787530;
                        i5 = -703898796;
                    }
                case -1972665166:
                case 1599517909:
                    if (C3245.m9925() != 0) {
                        m6981 = C0630.m2566("֫֨") ^ i2;
                        i4 = ((m6981 ^ i3) * 3279) ^ 846328705;
                        i5 = 1519662810;
                    } else {
                        m6981 = (C2105.m6981("ۨ᩷") ^ i2) * 115;
                        i4 = ((m6981 ^ i3) * (-17873)) ^ (-672107042);
                        i5 = 96100978;
                    }
                case -1957671046:
                case -1437591820:
                    if (C0422.f1886 <= 0) {
                        m6981 = C2105.m6981("ᩳۤ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-24693)) ^ (-1383218036);
                        i5 = 1630253742;
                    } else {
                        m6981 = (C2105.m6981("ܶ۟") ^ i3) * 99;
                        i4 = ((m6981 ^ i2) * (-22543)) ^ 715742474;
                        i5 = -1290860892;
                    }
                case -1801459907:
                case 1235601519:
                    if (C0237.m1481() >= 0) {
                        m6981 = C0630.m2566("֫֨") ^ i2;
                        i4 = ((m6981 ^ i3) * 3279) ^ 846328705;
                        i5 = 1519662810;
                    } else {
                        m6981 = (i3 - C2105.m6981("۬᩶")) * 29;
                        i4 = ((m6981 ^ i2) * (-12531)) ^ 2098049283;
                        i5 = -658966324;
                    }
                case -1797619596:
                case -9932769:
                    return str;
                case -1783674478:
                case -134225177:
                    C5695.m16023();
                    if (C0964.f3626 != 0) {
                        m6981 = C0630.m2566("֫֨") ^ i2;
                        i4 = ((m6981 ^ i3) * 3279) ^ 846328705;
                        i5 = 1519662810;
                    } else {
                        m6981 = C2105.m6981("ۙ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * 29099) ^ (-1892028487);
                        i5 = -236790983;
                    }
                case -1726169916:
                case -979370475:
                    str = this.f31950;
                    if (C3537.f11231 >= 0) {
                        m6981 = C2105.m6981("ۙ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * 29099) ^ (-1892028487);
                        i5 = -236790983;
                    } else {
                        m6981 = C0630.m2566("ۖ᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 18835) ^ 2031554364;
                        i5 = -237566340;
                    }
                case -1677868890:
                case -252731104:
                    if (C0964.m3413()) {
                        m6981 = C0630.m2566("ܿۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * 31929) ^ 2130533413;
                        i5 = 1108560076;
                    } else {
                        m6981 = C2105.m6981("ۙ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * 29099) ^ (-1892028487);
                        i5 = -236790983;
                    }
                case -1624334114:
                case 1384954637:
                    return str2;
                case -1546254304:
                case 999937374:
                    if (C4159.f13567) {
                        m6981 = (C2105.m6981("ۛܰ") ^ i2) * (-59);
                        i4 = ((m6981 ^ i3) * (-219)) ^ (-191083739);
                        i5 = 244120396;
                    } else {
                        m6981 = (C0630.m2566("ۤ۫") ^ i3) * 19;
                        i4 = ((m6981 ^ i2) * (-29675)) ^ 2090707383;
                        i5 = -199874556;
                    }
                case -1514040909:
                case -980817209:
                    C1294.m4372();
                    if (C2958.f9394 >= 0) {
                        m6981 = C2105.m6981("ۧ֫") ^ i2;
                        i4 = ((m6981 ^ i3) * 17161) ^ (-25020752);
                        i5 = -469794575;
                    } else {
                        m6981 = (C0630.m2566("ۤ۫") ^ i3) * 19;
                        i4 = ((m6981 ^ i2) * (-29675)) ^ 2090707383;
                        i5 = -199874556;
                    }
                case -1510716369:
                case -155832567:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = C2105.m6981("ۙ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * 29099) ^ (-1892028487);
                        i5 = -236790983;
                    } else {
                        m6981 = C0630.m2566("ۢۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * 15485) ^ (-691704526);
                        i5 = 1612249834;
                    }
                case -1374469526:
                case 57163970:
                    C3911.m11924();
                    return null;
                case -1251707148:
                case 1480086191:
                    if (C1005.m3500(1, str) == '}') {
                        m6981 = C0630.m2566("᩹ܿ") ^ i3;
                        i4 = ((m6981 ^ i2) * 16685) ^ 1774686172;
                        i5 = 1646836625;
                    } else {
                        m6981 = (i2 - C2105.m6981("ᩳ۠")) * (-95);
                        i4 = ((m6981 ^ i3) * (-13241)) ^ 1891787530;
                        i5 = -703898796;
                    }
                case -1231786407:
                case 239201646:
                    if (C2105.f7037 != 0) {
                        m6981 = (C0630.m2566("ۤ۫") ^ i3) * 19;
                        i4 = ((m6981 ^ i2) * (-29675)) ^ 2090707383;
                        i5 = -199874556;
                    } else {
                        m6981 = C2105.m6981("ۗܳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 23403) ^ (-2024573162);
                        i5 = -879884489;
                    }
                case -893919980:
                case -214581150:
                    if (C3683.f11629 >= 0) {
                        m6981 = C0630.m2566("֫֨") ^ i2;
                        i4 = ((m6981 ^ i3) * 3279) ^ 846328705;
                        i5 = 1519662810;
                    } else {
                        m6981 = C2105.m6981("ۧ֫") ^ i2;
                        i4 = ((m6981 ^ i3) * 17161) ^ (-25020752);
                        i5 = -469794575;
                    }
                case -587117196:
                case 318971733:
                    if (C3019.f9544 >= 0) {
                        m6981 = C0630.m2566("֫֨") ^ i2;
                        i4 = ((m6981 ^ i3) * 3279) ^ 846328705;
                        i5 = 1519662810;
                    } else {
                        m6981 = C2105.m6981("֡ۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 8067) ^ 1116730802;
                        i5 = -807480841;
                    }
                case -574408269:
                case 984460542:
                    if (C0798.m3007(str) >= 3) {
                        m6981 = C0630.m2566("᩹ۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 3799) ^ 1246748279;
                        i5 = -1906311886;
                    } else {
                        m6981 = (i2 - C2105.m6981("ᩳ۠")) * (-95);
                        i4 = ((m6981 ^ i3) * (-13241)) ^ 1891787530;
                        i5 = -703898796;
                    }
                case -476616944:
                case 906503232:
                    str2 = C1711.m5739(this, str);
                    if (str2 != null) {
                        m6981 = C0630.m2566("ܰۖ") ^ i3;
                        i4 = ((m6981 ^ i2) * 26019) ^ (-489905881);
                        i5 = -888282801;
                    } else {
                        m6981 = (i2 - C2105.m6981("ᩳ۠")) * (-95);
                        i4 = ((m6981 ^ i3) * (-13241)) ^ 1891787530;
                        i5 = -703898796;
                    }
                case 393779896:
                case 710869094:
                    C1420.m4913();
                    m6981 = C0630.m2566("֫֨") ^ i2;
                    i4 = ((m6981 ^ i3) * 3279) ^ 846328705;
                    i5 = 1519662810;
                default:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = (C0630.m2566("ۤ۫") ^ i3) * 19;
                        i4 = ((m6981 ^ i2) * (-29675)) ^ 2090707383;
                        i5 = -199874556;
                    } else {
                        m6981 = C0630.m2566("ۚ֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-26343)) ^ (-22344469);
                        i5 = -820064588;
                    }
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openLogViewer() {
        int i = -1492590780;
        int i2 = C4263.f13799;
        int i3 = C2167.f7158;
        int m2566 = C0630.m2566("۠ᩴ") ^ i2;
        int i4 = ((m2566 ^ i3) * (-2341)) ^ (-1963514394);
        int i5 = 464328195;
        while (true) {
            i = ((((i ^ i3) * (-12229)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2109331971:
                case -1429184574:
                    C3432.m10477();
                    break;
                case -974833433:
                case 804376767:
                    if (C1773.f6144 <= 0) {
                        m2566 = C2105.m6981("ܺܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * 5991) ^ 1666934666;
                        i5 = 69663257;
                    } else {
                        if (!C3683.m11222() && C7811.f24123 < 0) {
                            if (C3683.f11629 < 0) {
                                if (C3911.f12484 < 0 && C3019.f9544 < 0) {
                                    if (!C2272.f7362) {
                                        if (C5695.m16023() < 0) {
                                            if (C1128.m3851() > 0) {
                                                int i6 = 1;
                                                if (!C2272.f7362) {
                                                    ThreadUtil.runOnUiThread(new RunnableC9159(this.f31962, i6));
                                                    break;
                                                }
                                            }
                                        } else {
                                            m2566 = C2105.m6981("֨ܿ") ^ i2;
                                            i4 = ((m2566 ^ i3) * (-31781)) ^ (-902683581);
                                            i5 = 139259254;
                                        }
                                    }
                                }
                                m2566 = C2105.m6981("ۜۨ") ^ i3;
                                i4 = ((m2566 ^ i2) * 21105) ^ (-693042851);
                                i5 = 1938163816;
                            }
                            m2566 = (C0630.m2566("᩵ۚ") ^ i2) * 45;
                            i4 = ((m2566 ^ i3) * (-26429)) ^ 1286495202;
                            i5 = 2124938286;
                        }
                        m2566 = (i3 - C0630.m2566("ۧ᩷")) * (-51);
                        i4 = ((m2566 ^ i2) * (-13707)) ^ 1872936601;
                        i5 = 1332894677;
                    }
                    break;
                case -475272568:
                case 1242680775:
                    if (C1005.m3501()) {
                        m2566 = (i3 - C0630.m2566("ۧ᩷")) * (-51);
                        i4 = ((m2566 ^ i2) * (-13707)) ^ 1872936601;
                        i5 = 1332894677;
                    } else {
                        m2566 = C2105.m6981("ۜۨ") ^ i3;
                        i4 = ((m2566 ^ i2) * 21105) ^ (-693042851);
                        i5 = 1938163816;
                    }
                case 405959577:
                case 813315085:
                    if (C22628.m50615() != 0) {
                        m2566 = C2105.m6981("ۜۨ") ^ i3;
                        i4 = ((m2566 ^ i2) * 21105) ^ (-693042851);
                        i5 = 1938163816;
                    } else {
                        m2566 = C2105.m6981("֨ܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31781)) ^ (-902683581);
                        i5 = 139259254;
                    }
                case 707745897:
                case 1007710921:
                    C7811.m20844();
                    m2566 = C2105.m6981("ۜۨ") ^ i3;
                    i4 = ((m2566 ^ i2) * 21105) ^ (-693042851);
                    i5 = 1938163816;
                default:
                    if (C4159.f13567) {
                        m2566 = C2105.m6981("֨ܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31781)) ^ (-902683581);
                        i5 = 139259254;
                    } else {
                        m2566 = C2105.m6981("ܺܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * 5991) ^ 1666934666;
                        i5 = 69663257;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x002d, code lost:
    
        if (l.C3911.f12484 < 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10632(java.lang.String r19, java.lang.String r20, int r21, int r22, java.lang.String r23, l.AbstractC15440 r24, l.C13970 r25, l.C11505 r26, l.C11505 r27) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10632.<init>(java.lang.String, java.lang.String, int, int, java.lang.String, l.ܶ᩵ܿ, l.ܰܿ᩷, l.ۨۚ᩷, l.ۨۚ᩷):void");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openBrowser(String str) {
        int i = 498155499;
        int i2 = C22628.f73083;
        int i3 = C3537.f11231;
        int m2566 = (C0630.m2566("ܶ᩺") + i3) * (-109);
        int i4 = ((m2566 ^ i2) * 29805) ^ (-1526340462);
        int i5 = -2016014253;
        while (true) {
            i = ((((i ^ i2) * (-8527)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1828693904:
                case 1780407897:
                    C2272.m7503();
                    if (C2520.f8000 < 0) {
                        m2566 = C0630.m2566("ۡ᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * 13625) ^ (-312577293);
                        i5 = 1192693667;
                    } else {
                        m2566 = C2105.m6981("ۖ᩷") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30185)) ^ (-1036340175);
                        i5 = 1716271431;
                    }
                case -1785405947:
                case -202287354:
                    if (C4263.f13799 <= 0) {
                        m2566 = C2105.m6981("ۖ᩷") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30185)) ^ (-1036340175);
                        i5 = 1716271431;
                    } else {
                        m2566 = (C0630.m2566("᩹֡") + i2) * 7;
                        i4 = ((m2566 ^ i3) * (-927)) ^ (-1668094533);
                        i5 = -1515720901;
                    }
                case -1145929175:
                case 1125311517:
                    if (C2958.f9394 >= 0) {
                        m2566 = C2105.m6981("ۖ᩷") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30185)) ^ (-1036340175);
                        i5 = 1716271431;
                    } else {
                        m2566 = (C2105.m6981("ۢ֨") + i3) * 101;
                        i4 = ((m2566 ^ i2) * 14477) ^ (-2077618593);
                        i5 = -1269688291;
                    }
                case -1041756370:
                case -429311746:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = (C0630.m2566("᩹֡") + i2) * 7;
                        i4 = ((m2566 ^ i3) * (-927)) ^ (-1668094533);
                        i5 = -1515720901;
                    } else {
                        m2566 = C0630.m2566("ᩴᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-14295)) ^ (-1222945065);
                        i5 = 1260222155;
                    }
                case -1025810746:
                case 2130525783:
                    if (C1047.f3863 >= 0) {
                        m2566 = C0630.m2566("ۡ᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * 13625) ^ (-312577293);
                        i5 = 1192693667;
                    } else {
                        m2566 = C2105.m6981("᩸ᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * 20715) ^ (-1180413240);
                        i5 = 260615548;
                    }
                case -938563905:
                case 1197043999:
                    if (C0382.f1805) {
                        m2566 = C0630.m2566("ۨܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * 2655) ^ 1839514613;
                        i5 = 936438246;
                    } else {
                        m2566 = C0630.m2566("ۡ᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * 13625) ^ (-312577293);
                        i5 = 1192693667;
                    }
                case -588503274:
                case 2022968746:
                    if (C2958.f9394 >= 0) {
                        m2566 = C2105.m6981("ۖ᩷") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30185)) ^ (-1036340175);
                        i5 = 1716271431;
                    } else {
                        m2566 = C0630.m2566("ۧۧ") ^ i3;
                        i4 = ((m2566 ^ i2) * 14033) ^ 1849872816;
                        i5 = -1146679565;
                    }
                case -567087158:
                case -455411963:
                    if (C5695.m16023() < 0) {
                        ThreadUtil.runOnUiThread(new RunnableC9865(this, str, 2));
                        break;
                    } else {
                        m2566 = (C2105.m6981("ܿۨ") + i3) * (-83);
                        i4 = ((m2566 ^ i2) * 25553) ^ 1256449975;
                        i5 = -213604975;
                    }
                case -337929235:
                case 1834587544:
                    if (C1047.f3863 >= 0) {
                        m2566 = (C0630.m2566("᩹֡") + i2) * 7;
                        i4 = ((m2566 ^ i3) * (-927)) ^ (-1668094533);
                        i5 = -1515720901;
                    } else {
                        m2566 = (C2105.m6981("ۢ۫") ^ i2) * 41;
                        i4 = ((m2566 ^ i3) * 24229) ^ 1029722884;
                        i5 = 449611539;
                    }
                case -147855490:
                case 874332313:
                    if (C4263.f13799 <= 0) {
                        m2566 = (C0630.m2566("᩹֡") + i2) * 7;
                        i4 = ((m2566 ^ i3) * (-927)) ^ (-1668094533);
                        i5 = -1515720901;
                    } else {
                        m2566 = (C0630.m2566("ۨ᩶") ^ i3) * (-71);
                        i4 = ((m2566 ^ i2) * (-3879)) ^ (-1189534899);
                        i5 = -989034019;
                    }
                case 168450701:
                case 1664978821:
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = C0630.m2566("ۡ᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * 13625) ^ (-312577293);
                        i5 = 1192693667;
                    } else {
                        m2566 = C2105.m6981("ۢᩳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 5197) ^ (-1390762688);
                        i5 = 2130193109;
                    }
                case 253966348:
                case 1404031429:
                    C1773.m5908();
                    m2566 = C0630.m2566("ۡ᩵") ^ i2;
                    i4 = ((m2566 ^ i3) * 13625) ^ (-312577293);
                    i5 = 1192693667;
                case 275147897:
                case 533887003:
                    if (C0237.f1507 != 0) {
                        m2566 = C0630.m2566("ۧۧ") ^ i3;
                        i4 = ((m2566 ^ i2) * 14033) ^ 1849872816;
                        i5 = -1146679565;
                    } else {
                        m2566 = C0630.m2566("֨ۤ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30303)) ^ (-370845504);
                        i5 = 1488594247;
                    }
                case 906399858:
                case 1928652532:
                    C4616.m13552();
                    break;
                default:
                    if (C21923.m49329()) {
                        m2566 = C0630.m2566("ۧۧ") ^ i3;
                        i4 = ((m2566 ^ i2) * 14033) ^ 1849872816;
                        i5 = -1146679565;
                    } else {
                        m2566 = (i2 - C0630.m2566("ۤܶ")) * (-119);
                        i4 = ((m2566 ^ i3) * 13013) ^ 1503626927;
                        i5 = 1003541670;
                    }
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final File getFilesDir() {
        AbstractC15440 abstractC15440 = null;
        int i = -288285060;
        int i2 = RunnableC0588.f2309;
        int i3 = C3245.f10203;
        int m2566 = C0630.m2566("֫۟") ^ i2;
        int i4 = ((m2566 ^ i3) * (-10783)) ^ 1930284686;
        int i5 = -1048725330;
        while (true) {
            i = ((((i ^ i3) * (-31959)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1911594890:
                case 426141721:
                    if (C4616.f14690 <= 0) {
                        m2566 = C0630.m2566("ᩴ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * 12435) ^ 1201313352;
                        i5 = -1159960755;
                    } else {
                        m2566 = (C0630.m2566("֡۟") ^ i2) * (-99);
                        i4 = ((m2566 ^ i3) * 26609) ^ 187464275;
                        i5 = 175544280;
                    }
                case -1909693563:
                case -138233377:
                    if (C1420.m4917(abstractC15440)) {
                        m2566 = (C0630.m2566("֫ᩳ") ^ i2) * (-79);
                        i4 = ((m2566 ^ i3) * 19955) ^ (-805562732);
                        i5 = -631866155;
                    } else {
                        m2566 = C0630.m2566("᩶᩷") ^ i3;
                        i4 = ((m2566 ^ i2) * 31935) ^ 2023429839;
                        i5 = 1047804843;
                    }
                case -1650668211:
                case 589603157:
                    if (C1916.f6442) {
                        m2566 = C2105.m6981("ۜܰ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-6895)) ^ (-943826379);
                        i5 = -184050490;
                    } else {
                        m2566 = C0630.m2566("ܺ᩺") ^ i3;
                        i4 = ((m2566 ^ i2) * (-453)) ^ 1572655058;
                        i5 = 2043397153;
                    }
                case -1590950014:
                case 21264091:
                    return new File(C2958.m9025(abstractC15440));
                case -1571114660:
                case -53266680:
                    if (C1711.m5736() <= 0) {
                        m2566 = C2105.m6981("ۜܰ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-6895)) ^ (-943826379);
                        i5 = -184050490;
                    } else {
                        m2566 = C2105.m6981("ܽۨ") ^ i3;
                        i4 = ((m2566 ^ i2) * 4497) ^ 814565989;
                        i5 = 422312466;
                    }
                case -1508871405:
                case 2040828693:
                    if (C0483.f2088 >= 0) {
                        m2566 = C2105.m6981("᩶۠") ^ i2;
                        i4 = ((m2566 ^ i3) * (-21679)) ^ (-543255266);
                        i5 = -186242789;
                    } else {
                        m2566 = C0630.m2566("ۤܰ") ^ i2;
                        i4 = ((m2566 ^ i3) * 17637) ^ 988772995;
                        i5 = 1000444479;
                    }
                case -1280914711:
                case 804037619:
                    if (C1005.f3721) {
                        m2566 = C2105.m6981("۠֫") ^ i3;
                        i4 = ((m2566 ^ i2) * (-22429)) ^ 1058223051;
                        i5 = 991947450;
                    } else {
                        m2566 = C0630.m2566("ܺ᩺") ^ i3;
                        i4 = ((m2566 ^ i2) * (-453)) ^ 1572655058;
                        i5 = 2043397153;
                    }
                case -1235289929:
                case 470691074:
                    abstractC15440.mo23546();
                    m2566 = (C0630.m2566("֫ᩳ") ^ i2) * (-79);
                    i4 = ((m2566 ^ i3) * 19955) ^ (-805562732);
                    i5 = -631866155;
                case -1012210933:
                case 1151355954:
                    if (C4117.m12364() != 0) {
                        m2566 = C0630.m2566("ܺ᩺") ^ i3;
                        i4 = ((m2566 ^ i2) * (-453)) ^ 1572655058;
                        i5 = 2043397153;
                    } else {
                        m2566 = C0630.m2566("۬᩶") ^ i2;
                        i4 = ((m2566 ^ i3) * 2391) ^ (-770515535);
                        i5 = -1239962282;
                    }
                case -791620584:
                case 995247409:
                    if (C1128.f4106 <= 0) {
                        m2566 = C0630.m2566("۠ۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-109)) ^ (-814780455);
                        i5 = 1277597623;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۨ۬")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m2566 ^ i2) * (-14979)) ^ (-1689523241);
                        i5 = -71898622;
                    }
                case -728572754:
                case -656640506:
                    if (C3746.f11829 <= 0) {
                        m2566 = C2105.m6981("᩶۠") ^ i2;
                        i4 = ((m2566 ^ i3) * (-21679)) ^ (-543255266);
                        i5 = -186242789;
                    } else {
                        m2566 = C2105.m6981("᩷۟") ^ i2;
                        i4 = ((m2566 ^ i3) * (-16583)) ^ (-1359653235);
                        i5 = 1849326904;
                    }
                case -538740760:
                case 1485238677:
                    abstractC15440 = this.f31958;
                    if (C3746.f11829 <= 0) {
                        m2566 = C0630.m2566("۠ۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-109)) ^ (-814780455);
                        i5 = 1277597623;
                    } else {
                        m2566 = C0630.m2566("ܳ᩹") ^ i3;
                        i4 = ((m2566 ^ i2) * 5699) ^ (-785653407);
                        i5 = -1001449579;
                    }
                case -432621989:
                case 1881562713:
                    if (C3663.f11553) {
                        m2566 = C0630.m2566("ܺ᩺") ^ i3;
                        i4 = ((m2566 ^ i2) * (-453)) ^ 1572655058;
                        i5 = 2043397153;
                    } else {
                        m2566 = (C2105.m6981("᩵ۤ") ^ i2) * 11;
                        i4 = ((m2566 ^ i3) * (-20257)) ^ 995018965;
                        i5 = -1191688516;
                    }
                case -127431299:
                case 1830743454:
                    if (C3432.f10845 < 0) {
                        m2566 = C0630.m2566("ܺ᩺") ^ i3;
                        i4 = ((m2566 ^ i2) * (-453)) ^ 1572655058;
                        i5 = 2043397153;
                    } else {
                        m2566 = C0630.m2566("۠ۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-109)) ^ (-814780455);
                        i5 = 1277597623;
                    }
                case 467066571:
                case 1828501693:
                    C2126.m7040();
                    m2566 = C0630.m2566("ܺ᩺") ^ i3;
                    i4 = ((m2566 ^ i2) * (-453)) ^ 1572655058;
                    i5 = 2043397153;
                case 625488988:
                case 754413809:
                    if (C2520.f8000 >= 0) {
                        m2566 = C0630.m2566("ᩴ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * 12435) ^ 1201313352;
                        i5 = -1159960755;
                    } else {
                        m2566 = (C2105.m6981("ۙۢ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m2566 ^ i2) * 7455) ^ (-1061660367);
                        i5 = 478174300;
                    }
                case 878598214:
                case 1538418377:
                    RunnableC0588.m2441();
                    return null;
                default:
                    RunnableC3474.m10630();
                    if (C5695.f17556 >= 0) {
                        m2566 = C2105.m6981("ۜܰ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-6895)) ^ (-943826379);
                        i5 = -184050490;
                    } else {
                        m2566 = C0630.m2566("ᩴ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * 12435) ^ 1201313352;
                        i5 = -1159960755;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00c7, code lost:
    
        if (l.C2958.f9394 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x004b, code lost:
    
        if (l.C2272.m7503() == false) goto L10;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showToastL(java.lang.CharSequence r23, java.lang.Object... r24) {
        /*
            Method dump skipped, instructions count: 1366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10632.showToastL(java.lang.CharSequence, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x004d, code lost:
    
        if (l.C1005.f3721 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00a7, code lost:
    
        if (l.C1773.f6144 <= 0) goto L32;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showToast(java.lang.CharSequence r23, java.lang.Object... r24) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10632.showToast(java.lang.CharSequence, java.lang.Object[]):void");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getPluginId() {
        return this.f31962;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final int getPluginSdkVersion() {
        return this.f31948;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final int getPluginVersionCode() {
        return this.f31959;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void log(String str, Throwable th) {
        int i = 86378675;
        int i2 = C1294.f4556;
        int i3 = C3911.f12484;
        int m6981 = C2105.m6981("᩹ᩳ") ^ i2;
        int i4 = ((m6981 ^ i3) * 3001) ^ (-1704702946);
        int i5 = -1057598261;
        while (true) {
            i = ((((i ^ i3) * 28251) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2125640491:
                case -1017004912:
                    C0483.m2121();
                    if (C3537.f11231 < 0) {
                        m6981 = (C2105.m6981("ᩴᩴ") ^ i2) * (-13);
                        i4 = ((m6981 ^ i3) * 30013) ^ 2144881624;
                        i5 = -235648418;
                    } else {
                        m6981 = (i3 - C0630.m2566("᩶ۨ")) * (-9);
                        i4 = ((m6981 ^ i2) * 12903) ^ (-112467202);
                        i5 = -755162673;
                    }
                case -1622790944:
                case 1878896122:
                    if (C21923.f70183 != 0) {
                        m6981 = (i2 - C2105.m6981("ۛ۟")) * (-53);
                        i4 = ((m6981 ^ i3) * 25131) ^ (-239853280);
                        i5 = -1083077965;
                    } else {
                        m6981 = C0630.m2566("᩹ۘ") ^ i2;
                        i4 = ((m6981 ^ i3) * 29409) ^ (-1028684251);
                        i5 = -148260547;
                    }
                case -1501645943:
                case 1346172537:
                    C15297.m36311(this.f31962, str, th);
                    break;
                case -1228811972:
                case -806012908:
                    C3911.m11924();
                    break;
                case -1187208319:
                case 646491229:
                    if (C3683.f11629 >= 0) {
                        m6981 = (i2 - C2105.m6981("ۛ۟")) * (-53);
                        i4 = ((m6981 ^ i3) * 25131) ^ (-239853280);
                        i5 = -1083077965;
                    } else {
                        m6981 = (C2105.m6981("᩺۬") + i3) * (-121);
                        i4 = ((m6981 ^ i2) * (-20361)) ^ 598760888;
                        i5 = 866523084;
                    }
                case -875658460:
                case 1820284555:
                    if (C3683.f11629 >= 0) {
                        m6981 = C2105.m6981("ܽ۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-21617)) ^ 1659623991;
                        i5 = 689371470;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۡܰ")) * 53;
                        i4 = ((m6981 ^ i2) * 1601) ^ (-296486736);
                        i5 = 635533961;
                    }
                case -781056794:
                case -132405295:
                    if (C1005.f3721) {
                        m6981 = C2105.m6981("ܰۖ") ^ i3;
                        i4 = ((m6981 ^ i2) * 22535) ^ 60699352;
                        i5 = -1226885686;
                    } else {
                        m6981 = C2105.m6981("ۚ᩵") ^ i3;
                        i4 = ((m6981 ^ i2) * (-661)) ^ 1625139954;
                        i5 = 629306462;
                    }
                case -382188073:
                case 1174870482:
                    if (C2958.f9394 >= 0) {
                        m6981 = C2105.m6981("ܽ۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-21617)) ^ 1659623991;
                        i5 = 689371470;
                    } else {
                        m6981 = (C2105.m6981("ܿܿ") + i2) * 91;
                        i4 = ((m6981 ^ i3) * (-14925)) ^ 1951626290;
                        i5 = 1018815157;
                    }
                case -309324529:
                case 251373539:
                    if (C21923.f70183 == 0) {
                        m6981 = C2105.m6981("ܽ۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-21617)) ^ 1659623991;
                        i5 = 689371470;
                    } else {
                        m6981 = (i2 - C2105.m6981("ۛ۟")) * (-53);
                        i4 = ((m6981 ^ i3) * 25131) ^ (-239853280);
                        i5 = -1083077965;
                    }
                case -289546435:
                case 577131987:
                    if (C7106.f21815 != 0) {
                        m6981 = (i3 - C0630.m2566("᩶ۨ")) * (-9);
                        i4 = ((m6981 ^ i2) * 12903) ^ (-112467202);
                        i5 = -755162673;
                    } else {
                        m6981 = (C2105.m6981("֫ۘ") + i2) * 89;
                        i4 = ((m6981 ^ i3) * (-13419)) ^ (-617035066);
                        i5 = 576547881;
                    }
                case 80924508:
                case 1323103834:
                    if (C0964.f3626 != 0) {
                        m6981 = (i2 - C2105.m6981("ۛ۟")) * (-53);
                        i4 = ((m6981 ^ i3) * 25131) ^ (-239853280);
                        i5 = -1083077965;
                    } else {
                        m6981 = (C2105.m6981("᩺ۚ") ^ i2) * 73;
                        i4 = ((m6981 ^ i3) * (-23003)) ^ (-2049230322);
                        i5 = -324955598;
                    }
                case 116051601:
                case 436483281:
                    if (C0483.f2088 >= 0) {
                        m6981 = (i3 - C0630.m2566("᩶ۨ")) * (-9);
                        i4 = ((m6981 ^ i2) * 12903) ^ (-112467202);
                        i5 = -755162673;
                    } else {
                        m6981 = C0630.m2566("ۢۚ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-11855)) ^ 742845058;
                        i5 = 1124615985;
                    }
                case 189580397:
                case 1478636649:
                    if (C4616.m13552() != 0) {
                        m6981 = (i2 - C2105.m6981("ۛ۟")) * (-53);
                        i4 = ((m6981 ^ i3) * 25131) ^ (-239853280);
                        i5 = -1083077965;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۨ۫")) * 43;
                        i4 = ((m6981 ^ i2) * 1917) ^ 995710294;
                        i5 = 63751458;
                    }
                case 192496918:
                case 2083405438:
                    C1711.m5736();
                    m6981 = C2105.m6981("ܽ۬") ^ i3;
                    i4 = ((m6981 ^ i2) * (-21617)) ^ 1659623991;
                    i5 = 689371470;
                case 354565046:
                case 819830730:
                    if (C1005.f3721) {
                        m6981 = (C2105.m6981("ᩴᩴ") ^ i2) * (-13);
                        i4 = ((m6981 ^ i3) * 30013) ^ 2144881624;
                        i5 = -235648418;
                    } else {
                        m6981 = C2105.m6981("ܽ۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-21617)) ^ 1659623991;
                        i5 = 689371470;
                    }
                default:
                    if (C22628.m50615() != 0) {
                        m6981 = (i2 - C2105.m6981("ۛ۟")) * (-53);
                        i4 = ((m6981 ^ i3) * 25131) ^ (-239853280);
                        i5 = -1083077965;
                    } else {
                        m6981 = (i2 - C2105.m6981("ۚܳ")) * (-19);
                        i4 = ((m6981 ^ i3) * (-8639)) ^ 681827619;
                        i5 = -1151966037;
                    }
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getPluginVersionName() {
        return this.f31960;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getHostPackageName() {
        return C4925.m14337();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final SharedPreferences getPreferences() {
        if (this.f31949 == null) {
            synchronized (this) {
                if (this.f31949 == null) {
                    this.f31949 = C13265.m32220((String) this.f31955.f41681);
                }
            }
        }
        return this.f31949;
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getLanguage() {
        return C15297.m36316();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getCountry() {
        return C15297.m36313();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getLanguageCountry() {
        return C15297.m36319();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openBuiltinBrowser(final String str, final boolean z) {
        int i = -362065349;
        int i2 = C5695.f17556;
        int i3 = C2520.f8000;
        int m2566 = (C0630.m2566("ۖ᩶") ^ i2) * (-75);
        int i4 = ((m2566 ^ i3) * (-5123)) ^ (-120889032);
        int i5 = 937620797;
        while (true) {
            i = ((((i ^ i3) * 5841) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2024928375:
                case 535913632:
                    if (C4159.f13567) {
                        m2566 = (C2105.m6981("ᩳܽ") ^ i2) * (-115);
                        i4 = ((m2566 ^ i3) * (-26209)) ^ (-2000107893);
                        i5 = 1030236587;
                    } else {
                        m2566 = C2105.m6981("ۜܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-5731)) ^ 2057995378;
                        i5 = -349046245;
                    }
                case -1926307060:
                case -1741685860:
                    if (C0483.m2121()) {
                        m2566 = C0630.m2566("ۙܳ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-11167)) ^ (-764161718);
                        i5 = -492727206;
                    } else {
                        m2566 = C2105.m6981("ۜܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-5731)) ^ 2057995378;
                        i5 = -349046245;
                    }
                case -1791146433:
                case 341518055:
                    ThreadUtil.runOnUiThread(new Runnable(this) { // from class: l.ۗ᩻᩷

                        /* renamed from: ۨۜܰ, reason: not valid java name and contains not printable characters */
                        private static final short[] f11343 = {8291, 7048, 7055, 7057, 7054, 7061, 7058, 7050, 7081, 7060, 7049, 7057, 7064};

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C10632 f11345;

                        {
                            int i6 = 1104182106;
                            int i7 = C2167.f7158;
                            int i8 = C3019.f9544;
                            int m25662 = (i8 - C0630.m2566("ᩴ۠")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            int i9 = ((m25662 ^ i7) * 28693) ^ 395621988;
                            int i10 = 1666212870;
                            while (true) {
                                i6 = ((((i6 ^ i7) * 6491) >> 31) & i9) ^ (m25662 ^ i10);
                                switch (i6) {
                                    case -1909593957:
                                    case -669608308:
                                        C3663.m11168();
                                        if (RunnableC0588.m2441() < 0) {
                                            m25662 = (i8 - C0630.m2566("۟ᩴ")) * (-23);
                                            i9 = ((m25662 ^ i7) * (-13839)) ^ 544683059;
                                            i10 = -1617504010;
                                        } else {
                                            m25662 = C2105.m6981("᩹ܰ") ^ i7;
                                            i9 = ((m25662 ^ i8) * 32189) ^ 3705626;
                                            i10 = 2118771375;
                                        }
                                    case -1700403551:
                                    case 501677279:
                                        return;
                                    case -1637610635:
                                    case -999316553:
                                        if (C2167.f7158 >= 0) {
                                            m25662 = (i8 - C0630.m2566("۟ᩴ")) * (-23);
                                            i9 = ((m25662 ^ i7) * (-13839)) ^ 544683059;
                                            i10 = -1617504010;
                                        } else {
                                            m25662 = (C0630.m2566("ۧ֫") ^ i8) * (-33);
                                            i9 = ((m25662 ^ i7) * 31791) ^ (-652250266);
                                            i10 = 1508968753;
                                        }
                                    case -1590856564:
                                    case 999811997:
                                        if (C3746.m11369() >= 0) {
                                            m25662 = (C2105.m6981("ۧܶ") + i8) * 21;
                                            i9 = ((m25662 ^ i7) * (-24317)) ^ 2009831908;
                                            i10 = 1728112698;
                                        } else {
                                            m25662 = (C2105.m6981("ۤۚ") + i7) * 83;
                                            i9 = ((m25662 ^ i8) * (-19621)) ^ 2072789114;
                                            i10 = 1146496471;
                                        }
                                    case -1491315362:
                                    case -37970439:
                                        C5695.m16023();
                                        m25662 = (i8 - C0630.m2566("۟ᩴ")) * (-23);
                                        i9 = ((m25662 ^ i7) * (-13839)) ^ 544683059;
                                        i10 = -1617504010;
                                    case -1116377868:
                                    case -105189777:
                                        if (C4117.f13076 <= 0) {
                                            m25662 = (C0630.m2566("۟֫") ^ i8) * (-63);
                                            i9 = ((m25662 ^ i7) * (-29453)) ^ 1856079321;
                                            i10 = 190944455;
                                        } else {
                                            m25662 = C0630.m2566("ۙۗ") ^ i7;
                                            i9 = ((m25662 ^ i8) * (-14205)) ^ (-73076146);
                                            i10 = -2119293270;
                                        }
                                    case -771986452:
                                    case 536238141:
                                        if (C4616.m13552() != 0) {
                                            m25662 = C2105.m6981("᩹ܰ") ^ i7;
                                            i9 = ((m25662 ^ i8) * 32189) ^ 3705626;
                                            i10 = 2118771375;
                                        } else {
                                            m25662 = (C2105.m6981("ۖܽ") ^ i7) * 41;
                                            i9 = ((m25662 ^ i8) * 29549) ^ (-2143220528);
                                            i10 = 1022929566;
                                        }
                                    case -444084299:
                                    case 855691075:
                                        if (AbstractC2021.f6743 <= 0) {
                                            m25662 = C2105.m6981("᩹ܰ") ^ i7;
                                            i9 = ((m25662 ^ i8) * 32189) ^ 3705626;
                                            i10 = 2118771375;
                                        } else {
                                            m25662 = C2105.m6981("᩹ᩳ") ^ i8;
                                            i9 = ((m25662 ^ i7) * (-27641)) ^ (-1391081403);
                                            i10 = -229335337;
                                        }
                                    case -232045129:
                                    case 159583234:
                                        if (C3663.f11553) {
                                            m25662 = (C2105.m6981("ۧܶ") + i8) * 21;
                                            i9 = ((m25662 ^ i7) * (-24317)) ^ 2009831908;
                                            i10 = 1728112698;
                                        } else {
                                            m25662 = C0630.m2566("۬۬") ^ i8;
                                            i9 = ((m25662 ^ i7) * (-9003)) ^ 1929733397;
                                            i10 = 337361439;
                                        }
                                    case -99977006:
                                    case 770641260:
                                        this.f11345 = this;
                                        if (RunnableC1937.f6483 >= 0) {
                                            m25662 = (C2105.m6981("ۧܶ") + i8) * 21;
                                            i9 = ((m25662 ^ i7) * (-24317)) ^ 2009831908;
                                            i10 = 1728112698;
                                        } else {
                                            m25662 = C2105.m6981("۫ۚ") ^ i8;
                                            i9 = ((m25662 ^ i7) * (-9491)) ^ (-1510584140);
                                            i10 = 1284251699;
                                        }
                                    case 79760325:
                                    case 726972379:
                                        if (RunnableC0588.m2441() < 0) {
                                            m25662 = C2105.m6981("᩹ܰ") ^ i7;
                                            i9 = ((m25662 ^ i8) * 32189) ^ 3705626;
                                            i10 = 2118771375;
                                        } else {
                                            m25662 = (C0630.m2566("۟֫") ^ i8) * (-63);
                                            i9 = ((m25662 ^ i7) * (-29453)) ^ 1856079321;
                                            i10 = 190944455;
                                        }
                                    case 130378269:
                                    case 405316525:
                                        if (C3663.m11168() >= 0) {
                                            m25662 = (C2105.m6981("ۧܶ") + i8) * 21;
                                            i9 = ((m25662 ^ i7) * (-24317)) ^ 2009831908;
                                            i10 = 1728112698;
                                        } else {
                                            m25662 = C2105.m6981("ۨۖ") ^ i7;
                                            i9 = ((m25662 ^ i8) * 2059) ^ (-2110583018);
                                            i10 = 1140045417;
                                        }
                                    case 368149939:
                                    case 956614149:
                                        C3432.m10477();
                                        C1711.m5736();
                                        throw new RuntimeException();
                                    case 424844721:
                                    case 1929297490:
                                        C0798.m2998();
                                        if (C1711.f5919) {
                                            m25662 = (C0630.m2566("۟֫") ^ i8) * (-63);
                                            i9 = ((m25662 ^ i7) * (-29453)) ^ 1856079321;
                                            i10 = 190944455;
                                        } else {
                                            m25662 = (C2105.m6981("᩶ܺ") ^ i7) * 57;
                                            i9 = ((m25662 ^ i8) * (-25607)) ^ (-305825844);
                                            i10 = 1329681609;
                                        }
                                    case 1091438767:
                                    case 2027273474:
                                        if (C3746.f11829 <= 0) {
                                            m25662 = C2105.m6981("᩹ܰ") ^ i7;
                                            i9 = ((m25662 ^ i8) * 32189) ^ 3705626;
                                            i10 = 2118771375;
                                        } else {
                                            m25662 = (C0630.m2566("ܽܰ") + i7) * (-19);
                                            i9 = ((m25662 ^ i8) * 15655) ^ 218756177;
                                            i10 = 1088840240;
                                        }
                                    default:
                                        if (C3019.f9544 >= 0) {
                                            m25662 = C2105.m6981("᩹ܰ") ^ i7;
                                            i9 = ((m25662 ^ i8) * 32189) ^ 3705626;
                                            i10 = 2118771375;
                                        } else {
                                            m25662 = C0630.m2566("ܶۖ") ^ i8;
                                            i9 = ((m25662 ^ i7) * (-4879)) ^ 1179161595;
                                            i10 = -1787506030;
                                        }
                                }
                            }
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:56:0x0090, code lost:
                        
                            if (l.C3537.f11231 < 0) goto L34;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:81:0x00b0, code lost:
                        
                            if (l.ViewOnClickListenerC1958.f6529 <= 0) goto L37;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 1172
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.RunnableC3576.run():void");
                        }
                    });
                    break;
                case -1764777985:
                case -192549981:
                    if (C3245.m9925() != 0) {
                        m2566 = C2105.m6981("᩸ܽ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-13595)) ^ 413776702;
                        i5 = 1348478748;
                    } else {
                        m2566 = (C0630.m2566("᩸ܰ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m2566 ^ i2) * (-14717)) ^ (-1173457106);
                        i5 = 685322629;
                    }
                case -1759761490:
                case -1118552946:
                    C2272.m7503();
                    m2566 = C0630.m2566("ۨ᩷") ^ i3;
                    i4 = ((m2566 ^ i2) * 10799) ^ (-1705796459);
                    i5 = 865975112;
                case -1624776308:
                case -242985243:
                    if (C4075.f12947 >= 0) {
                        m2566 = C2105.m6981("ۢܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30169)) ^ 2061718891;
                        i5 = -1368527736;
                    } else {
                        m2566 = (C0630.m2566("۟ܳ") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((m2566 ^ i3) * (-10127)) ^ 1757429939;
                        i5 = -222719973;
                    }
                case -1264394818:
                case 1620437420:
                    if (C2958.f9394 < 0) {
                        m2566 = C2105.m6981("᩸ܽ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-13595)) ^ 413776702;
                        i5 = 1348478748;
                    } else {
                        m2566 = C2105.m6981("ۢܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30169)) ^ 2061718891;
                        i5 = -1368527736;
                    }
                case -1220255522:
                case -534144195:
                    if (C3663.f11553) {
                        m2566 = C2105.m6981("ۜܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-5731)) ^ 2057995378;
                        i5 = -349046245;
                    } else {
                        m2566 = (C0630.m2566("ۜ᩺") + i3) * (-69);
                        i4 = ((m2566 ^ i2) * 10621) ^ (-785975673);
                        i5 = -1242685984;
                    }
                case -1204190317:
                case -714971470:
                    C7106.m19120();
                    C7811.m20844();
                    break;
                case -774146058:
                case 1865455977:
                    if (RunnableC1108.m3790()) {
                        m2566 = C2105.m6981("ۨܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * 10855) ^ 1164217847;
                        i5 = -1757875967;
                    } else {
                        m2566 = C0630.m2566("ۗᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * 2655) ^ 1337340954;
                        i5 = 2013956117;
                    }
                case -373582938:
                case 1402131052:
                    if (C4159.f13567) {
                        m2566 = C2105.m6981("ۗۘ") ^ i2;
                        i4 = ((m2566 ^ i3) * 6287) ^ 1882101372;
                        i5 = -225203136;
                    } else {
                        m2566 = C2105.m6981("᩸ܽ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-13595)) ^ 413776702;
                        i5 = 1348478748;
                    }
                case -6935519:
                case 1129975883:
                    C0050.m940();
                    if (C2167.f7158 >= 0) {
                        m2566 = C0630.m2566("ۨ᩷") ^ i3;
                        i4 = ((m2566 ^ i2) * 10799) ^ (-1705796459);
                        i5 = 865975112;
                    } else {
                        m2566 = C2105.m6981("᩸ܽ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-13595)) ^ 413776702;
                        i5 = 1348478748;
                    }
                case 530863862:
                case 2004114612:
                    if (C1294.m4372() <= 0) {
                        m2566 = C0630.m2566("ۨ᩷") ^ i3;
                        i4 = ((m2566 ^ i2) * 10799) ^ (-1705796459);
                        i5 = 865975112;
                    } else {
                        m2566 = (C2105.m6981("ۗ᩸") ^ i3) * 63;
                        i4 = ((m2566 ^ i2) * 25889) ^ 935696085;
                        i5 = -1394485106;
                    }
                case 731636455:
                case 1761970036:
                    if (C11340.f33930 >= 0) {
                        m2566 = C2105.m6981("᩸ܽ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-13595)) ^ 413776702;
                        i5 = 1348478748;
                    } else {
                        m2566 = (C0630.m2566("᩵᩶") ^ i2) * 13;
                        i4 = ((m2566 ^ i3) * 22593) ^ (-2024207485);
                        i5 = 341362398;
                    }
                case 1291816818:
                case 1883350890:
                    if (C2272.f7362) {
                        m2566 = C0630.m2566("ۨ᩷") ^ i3;
                        i4 = ((m2566 ^ i2) * 10799) ^ (-1705796459);
                        i5 = 865975112;
                    } else {
                        m2566 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * 23119) ^ 946114346;
                        i5 = 2132919902;
                    }
                default:
                    C1420.m4913();
                    if (C3245.f10203 <= 0) {
                        m2566 = C2105.m6981("ۢܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30169)) ^ 2061718891;
                        i5 = -1368527736;
                    } else {
                        m2566 = C2105.m6981("ۜܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-5731)) ^ 2057995378;
                        i5 = -349046245;
                    }
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void log(Throwable th) {
        String str = null;
        int i = 1623954857;
        int i2 = C4616.f14690;
        int i3 = RunnableC1937.f6483;
        int m6981 = C2105.m6981("֨ܽ") ^ i3;
        int i4 = ((m6981 ^ i2) * 1761) ^ (-413634979);
        int i5 = -145714530;
        while (true) {
            i = ((((i ^ i2) * 4941) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2087287227:
                case 863273268:
                    if (C1047.f3863 >= 0) {
                        m6981 = (C0630.m2566("ۚۖ") ^ i2) * (-95);
                        i4 = ((m6981 ^ i3) * (-31239)) ^ (-2116604401);
                        i5 = -1356130498;
                    } else {
                        m6981 = C0630.m2566("ܿۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * 15433) ^ 1976688205;
                        i5 = 303183951;
                    }
                case -1705096933:
                case -119625815:
                    C3683.m11222();
                    if (C0483.f2088 >= 0) {
                        m6981 = (C2105.m6981("ۙۚ") ^ i3) * (-89);
                        i4 = ((m6981 ^ i2) * 16649) ^ 1127626302;
                        i5 = 1685953518;
                    } else {
                        m6981 = C2105.m6981("ۢ۟") ^ i2;
                        i4 = ((m6981 ^ i3) * 18853) ^ (-2050344692);
                        i5 = 287339523;
                    }
                case -1326771710:
                case 1156821942:
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = (i3 - C2105.m6981("ᩴᩴ")) * (-45);
                        i4 = ((m6981 ^ i2) * (-29645)) ^ (-1827256774);
                        i5 = -2050065069;
                    } else {
                        m6981 = (C2105.m6981("ۗ֨") + i2) * (-125);
                        i4 = ((m6981 ^ i3) * (-16053)) ^ 201698945;
                        i5 = 816074963;
                    }
                case -1275603519:
                case -271357337:
                    str = this.f31962;
                    if (C22628.m50615() != 0) {
                        m6981 = C0630.m2566("ܽ᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 2591) ^ (-820609253);
                        i5 = 196963564;
                    } else {
                        m6981 = (C0630.m2566("᩻᩻") ^ i2) * (-79);
                        i4 = ((m6981 ^ i3) * 15249) ^ 2027690519;
                        i5 = 986793531;
                    }
                case -1196567069:
                case 1723071265:
                    if (C3019.f9544 >= 0) {
                        m6981 = (C2105.m6981("ۙۚ") ^ i3) * (-89);
                        i4 = ((m6981 ^ i2) * 16649) ^ 1127626302;
                        i5 = 1685953518;
                    } else {
                        m6981 = (C2105.m6981("ᩳۢ") + i3) * 41;
                        i4 = ((m6981 ^ i2) * 14093) ^ (-1939241843);
                        i5 = 258295568;
                    }
                case -866541630:
                case 118341584:
                    if (C4263.f13799 <= 0) {
                        m6981 = C0630.m2566("ܽ᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 2591) ^ (-820609253);
                        i5 = 196963564;
                    } else {
                        m6981 = (C2105.m6981("᩸᩵") + i3) * (-111);
                        i4 = ((m6981 ^ i2) * 25267) ^ 1044964083;
                        i5 = 255142102;
                    }
                case -674391026:
                case -29690178:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = (C2105.m6981("ۙۚ") ^ i3) * (-89);
                        i4 = ((m6981 ^ i2) * 16649) ^ 1127626302;
                        i5 = 1685953518;
                    } else {
                        m6981 = C0630.m2566("᩸᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * 23233) ^ (-448395356);
                        i5 = -1523706246;
                    }
                case -565645491:
                case 1631523149:
                    C2105.m6982();
                    if (C4159.f13567) {
                        m6981 = (C0630.m2566("ۚۖ") ^ i2) * (-95);
                        i4 = ((m6981 ^ i3) * (-31239)) ^ (-2116604401);
                        i5 = -1356130498;
                    } else {
                        m6981 = (C2105.m6981("ۙۚ") ^ i3) * (-89);
                        i4 = ((m6981 ^ i2) * 16649) ^ 1127626302;
                        i5 = 1685953518;
                    }
                case -421652013:
                case -4450061:
                    if (C1916.m6308() >= 0) {
                        m6981 = C2105.m6981("ۢ۟") ^ i2;
                        i4 = ((m6981 ^ i3) * 18853) ^ (-2050344692);
                        i5 = 287339523;
                    } else {
                        m6981 = (C0630.m2566("ۛܺ") + i3) * (-81);
                        i4 = ((m6981 ^ i2) * 10475) ^ 1428736089;
                        i5 = -1840025615;
                    }
                case -223043928:
                case 745407427:
                    C0714.m2805();
                    m6981 = (C0630.m2566("ۚۖ") ^ i2) * (-95);
                    i4 = ((m6981 ^ i3) * (-31239)) ^ (-2116604401);
                    i5 = -1356130498;
                case 55213521:
                case 1365667825:
                    if (C1916.m6308() >= 0) {
                        m6981 = (i3 - C2105.m6981("ᩴᩴ")) * (-45);
                        i4 = ((m6981 ^ i2) * (-29645)) ^ (-1827256774);
                        i5 = -2050065069;
                    } else {
                        m6981 = C2105.m6981("ۢܳ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-30037)) ^ (-1691927031);
                        i5 = -1067115646;
                    }
                case 263442498:
                case 1919789035:
                    C3663.m11168();
                    break;
                case 628989952:
                case 1111869554:
                    if (C0382.m1848()) {
                        m6981 = C0630.m2566("ܽ᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 2591) ^ (-820609253);
                        i5 = 196963564;
                    } else {
                        m6981 = (C0630.m2566("᩸ۚ") ^ i3) * 47;
                        i4 = ((m6981 ^ i2) * 21099) ^ 1558035992;
                        i5 = 528774454;
                    }
                case 836240737:
                case 932935422:
                    C0714.m2805();
                    if (C21923.m49329()) {
                        m6981 = (i3 - C2105.m6981("ᩴᩴ")) * (-45);
                        i4 = ((m6981 ^ i2) * (-29645)) ^ (-1827256774);
                        i5 = -2050065069;
                    } else {
                        m6981 = (C2105.m6981("ۙۚ") ^ i3) * (-89);
                        i4 = ((m6981 ^ i2) * 16649) ^ 1127626302;
                        i5 = 1685953518;
                    }
                case 883491079:
                case 1595963064:
                    if (C1128.f4106 <= 0) {
                        m6981 = (C0630.m2566("ۚۖ") ^ i2) * (-95);
                        i4 = ((m6981 ^ i3) * (-31239)) ^ (-2116604401);
                        i5 = -1356130498;
                    } else {
                        m6981 = (C2105.m6981("ۗ۬") ^ i3) * 53;
                        i4 = ((m6981 ^ i2) * (-17677)) ^ (-1388517373);
                        i5 = 856525051;
                    }
                default:
                    C15297.m36311(str, null, th);
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0140, code lost:
    
        r6 = l.C0630.m2566("ܽۛ") ^ r5;
        r7 = ((r6 ^ r4) * (-32665)) ^ 1250000579;
        r8 = -876275942;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01ef, code lost:
    
        r6 = l.C0630.m2566("ᩳܿ") ^ r4;
        r7 = ((r6 ^ r5) * (-4459)) ^ 638683785;
        r8 = -1571072633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x021b, code lost:
    
        r6 = l.C2105.m6981("᩶ᩳ") ^ r5;
        r7 = ((r6 ^ r4) * (-2179)) ^ (-92103883);
        r8 = -1053651033;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01c0, code lost:
    
        r6 = l.C2105.m6981("֡֨") ^ r4;
        r7 = ((r6 ^ r5) * 1323) ^ (-1216074089);
        r8 = 948058909;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006a, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f4, code lost:
    
        r6 = l.C0630.m2566("ۧ֡") ^ r5;
        r7 = ((r6 ^ r4) * 30661) ^ 2020444919;
        r8 = 42394274;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showToastL(java.lang.CharSequence r10) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10632.showToastL(java.lang.CharSequence):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20510 m26674(String str) {
        short[] sArr;
        int i;
        int m2566;
        int i2;
        int i3;
        char c;
        int m6981;
        int i4;
        C20510 c20510;
        int i5;
        char c2;
        int i6;
        int m69812;
        int i7;
        int i8;
        C7621 c7621 = null;
        C3432 c3432 = null;
        Reference reference = null;
        C20510 c205102 = null;
        C20510 c205103 = null;
        short[] sArr2 = null;
        char c3 = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = -454452988;
        int i13 = C0050.f910;
        int i14 = C1294.f4556;
        int m25662 = (i14 - C0630.m2566("᩸ܺ")) * (-65);
        int i15 = ((m25662 ^ i13) * (-12751)) ^ (-1264433072);
        int i16 = m25662 ^ 1023657831;
        C16709 c16709 = null;
        while (true) {
            int i17 = i16 ^ (i15 & (((i12 ^ i13) * (-18771)) >> 31));
            switch (i17) {
                case -2129543556:
                case 1931890084:
                    sArr = sArr2;
                    c = c3;
                    i = i17;
                    if (this.f31961 == null) {
                        m6981 = (i14 - C2105.m6981("۠ܳ")) * 47;
                        i2 = ((m6981 ^ i13) * (-5351)) ^ (-1352632059);
                        i4 = -1270821982;
                        i5 = m6981 ^ i4;
                        i12 = i;
                        c3 = c;
                        i16 = i5;
                        i15 = i2;
                        sArr2 = sArr;
                    }
                    m6981 = C0630.m2566("֡ۜ") ^ i13;
                    i2 = ((m6981 ^ i14) * 12659) ^ (-480391961);
                    i4 = 578179564;
                    i5 = m6981 ^ i4;
                    i12 = i;
                    c3 = c;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
                case -2099948547:
                case -1931323249:
                    C2126.m7040();
                    C4159.m12565();
                    c2 = c3;
                    i6 = i17;
                    m69812 = C2105.m6981("۫᩻") ^ i13;
                    i7 = ((m69812 ^ i14) * 28169) ^ (-651616169);
                    i8 = 1302383468;
                    int i18 = m69812 ^ i8;
                    i12 = i6;
                    i16 = i18;
                    i15 = i7;
                    c3 = c2;
                case -2080118118:
                case -556533252:
                    sArr = sArr2;
                    c = c3;
                    i = i17;
                    c3432 = this.f31947;
                    c20510 = null;
                    reference = (Reference) c3432.getOrDefault(str, null);
                    if (reference != null) {
                        m6981 = C2105.m6981("ۗܺ") ^ i14;
                        i2 = ((m6981 ^ i13) * 16987) ^ 964284430;
                        i4 = 1300515264;
                        i5 = m6981 ^ i4;
                        i12 = i;
                        c3 = c;
                        i16 = i5;
                        i15 = i2;
                        sArr2 = sArr;
                    }
                    c205102 = c20510;
                    m6981 = (C2105.m6981("ۧۖ") ^ i14) * (-95);
                    i2 = ((m6981 ^ i13) * (-9945)) ^ (-1555922685);
                    i4 = 1293090788;
                    i5 = m6981 ^ i4;
                    i12 = i;
                    c3 = c;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
                case -1775225590:
                case 241298980:
                    sArr = sArr2;
                    c = c3;
                    i = i17;
                    c16709 = (C16709) this.f31952.f34362;
                    if (ViewOnClickListenerC1958.m6429() < 0) {
                        m6981 = (i13 - C2105.m6981("ۢۛ")) * (-31);
                        i2 = ((m6981 ^ i14) * 30123) ^ 1284568080;
                        i4 = 1721438994;
                        i5 = m6981 ^ i4;
                        i12 = i;
                        c3 = c;
                        i16 = i5;
                        i15 = i2;
                        sArr2 = sArr;
                    }
                    m6981 = C2105.m6981("֨᩶") ^ i13;
                    i2 = ((m6981 ^ i14) * 16689) ^ 67705404;
                    i4 = 1883737098;
                    i5 = m6981 ^ i4;
                    i12 = i;
                    c3 = c;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
                case -1431851421:
                case 1303162381:
                    C3746.m11369();
                    if (C3019.f9544 >= 0) {
                        sArr = sArr2;
                        i = i17;
                        m2566 = (i14 - C0630.m2566("ۢ۫")) * (-13);
                        i2 = ((m2566 ^ i13) * (-11403)) ^ 303462588;
                        i3 = 2108507239;
                        i5 = m2566 ^ i3;
                        i12 = i;
                        i16 = i5;
                        i15 = i2;
                        sArr2 = sArr;
                    }
                    sArr = sArr2;
                    c = c3;
                    i = i17;
                    m6981 = C2105.m6981("֨᩶") ^ i13;
                    i2 = ((m6981 ^ i14) * 16689) ^ 67705404;
                    i4 = 1883737098;
                    i5 = m6981 ^ i4;
                    i12 = i;
                    c3 = c;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
                case -1427107571:
                case 955225567:
                    sArr = sArr2;
                    c = c3;
                    i = i17;
                    this.f31961 = c7621;
                    this.f31951 = new C13453(this);
                    m6981 = C0630.m2566("֡ۜ") ^ i13;
                    i2 = ((m6981 ^ i14) * 12659) ^ (-480391961);
                    i4 = 578179564;
                    i5 = m6981 ^ i4;
                    i12 = i;
                    c3 = c;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
                case -1398795095:
                case 446455801:
                    sArr = sArr2;
                    c = c3;
                    i = i17;
                    i11 = 31480;
                    m6981 = (i13 - C2105.m6981("ۚܽ")) * (-85);
                    i2 = ((m6981 ^ i14) * (-8587)) ^ 873576567;
                    i4 = -1670935228;
                    i5 = m6981 ^ i4;
                    i12 = i;
                    c3 = c;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
                case -1367730473:
                case -494132056:
                    sArr = sArr2;
                    c = c3;
                    i = i17;
                    c20510 = (C20510) reference.get();
                    c205102 = c20510;
                    m6981 = (C2105.m6981("ۧۖ") ^ i14) * (-95);
                    i2 = ((m6981 ^ i13) * (-9945)) ^ (-1555922685);
                    i4 = 1293090788;
                    i5 = m6981 ^ i4;
                    i12 = i;
                    c3 = c;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
                case -1325062441:
                case 106700432:
                    C1711.m5736();
                    return null;
                case -1298650064:
                case -993933508:
                    c2 = c3;
                    i6 = i17;
                    sArr2 = f31946;
                    if (C3911.f12484 < 0) {
                        m69812 = C2105.m6981("۠᩵") ^ i14;
                        i7 = ((m69812 ^ i13) * (-27405)) ^ 558498143;
                        i8 = -466848855;
                        int i182 = m69812 ^ i8;
                        i12 = i6;
                        i16 = i182;
                        i15 = i7;
                        c3 = c2;
                    }
                    m69812 = C2105.m6981("۫᩻") ^ i13;
                    i7 = ((m69812 ^ i14) * 28169) ^ (-651616169);
                    i8 = 1302383468;
                    int i1822 = m69812 ^ i8;
                    i12 = i6;
                    i16 = i1822;
                    i15 = i7;
                    c3 = c2;
                case -1240580628:
                case 1630841825:
                    if (RunnableC1937.f6483 < 0) {
                        c2 = c3;
                        i6 = i17;
                        m69812 = C2105.m6981("۫᩻") ^ i13;
                        i7 = ((m69812 ^ i14) * 28169) ^ (-651616169);
                        i8 = 1302383468;
                        int i18222 = m69812 ^ i8;
                        i12 = i6;
                        i16 = i18222;
                        i15 = i7;
                        c3 = c2;
                    } else {
                        sArr = sArr2;
                        c = c3;
                        i = i17;
                        m6981 = C2105.m6981("֨᩶") ^ i13;
                        i2 = ((m6981 ^ i14) * 16689) ^ 67705404;
                        i4 = 1883737098;
                        i5 = m6981 ^ i4;
                        i12 = i;
                        c3 = c;
                        i16 = i5;
                        i15 = i2;
                        sArr2 = sArr;
                    }
                case -1234483352:
                case 1407880589:
                    if (C0382.f1805) {
                        sArr = sArr2;
                        i = i17;
                        m2566 = (i13 - C2105.m6981("ۗۧ")) * 41;
                        i2 = ((m2566 ^ i14) * 29839) ^ (-948367194);
                        i3 = -588706064;
                        i5 = m2566 ^ i3;
                        i12 = i;
                        i16 = i5;
                        i15 = i2;
                        sArr2 = sArr;
                    }
                    sArr = sArr2;
                    c = c3;
                    i = i17;
                    m6981 = C2105.m6981("֨᩶") ^ i13;
                    i2 = ((m6981 ^ i14) * 16689) ^ 67705404;
                    i4 = 1883737098;
                    i5 = m6981 ^ i4;
                    i12 = i;
                    c3 = c;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
                case -1001692301:
                case -352217505:
                    sArr = sArr2;
                    c = c3;
                    i = i17;
                    i10 = i9 + 106998336;
                    s2 = 20688;
                    if (C4075.m12263() > 0) {
                        m6981 = (i14 - C0630.m2566("᩹᩶")) * (-7);
                        i2 = ((m6981 ^ i13) * (-23411)) ^ (-1878245027);
                        i4 = -409102180;
                        i5 = m6981 ^ i4;
                        i12 = i;
                        c3 = c;
                        i16 = i5;
                        i15 = i2;
                        sArr2 = sArr;
                    }
                    c3 = c;
                    m2566 = (i14 - C0630.m2566("ۢ۫")) * (-13);
                    i2 = ((m2566 ^ i13) * (-11403)) ^ 303462588;
                    i3 = 2108507239;
                    i5 = m2566 ^ i3;
                    i12 = i;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
                case -745290856:
                case -709492754:
                    sArr = sArr2;
                    c = c3;
                    i = i17;
                    i11 = 16075;
                    m6981 = (i13 - C2105.m6981("ۚܽ")) * (-85);
                    i2 = ((m6981 ^ i14) * (-8587)) ^ 873576567;
                    i4 = -1670935228;
                    i5 = m6981 ^ i4;
                    i12 = i;
                    c3 = c;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
                case -130089558:
                case 1190308480:
                    sArr = sArr2;
                    c = c3;
                    i = i17;
                    if (c205102 == null) {
                        m6981 = C2105.m6981("ۢܿ") ^ i14;
                        i2 = ((m6981 ^ i13) * 23355) ^ (-1207940417);
                        i4 = -786797378;
                        i5 = m6981 ^ i4;
                        i12 = i;
                        c3 = c;
                        i16 = i5;
                        i15 = i2;
                        sArr2 = sArr;
                    } else {
                        c205103 = c205102;
                        m6981 = (C2105.m6981("᩷ۜ") ^ i13) * (-105);
                        i2 = ((m6981 ^ i14) * (-16303)) ^ (-1715520005);
                        i4 = 1181988028;
                        i5 = m6981 ^ i4;
                        i12 = i;
                        c3 = c;
                        i16 = i5;
                        i15 = i2;
                        sArr2 = sArr;
                    }
                case -32719300:
                case 430559486:
                    return c205103;
                case 243731904:
                case 772887171:
                    sArr = sArr2;
                    c = c3;
                    i = i17;
                    c7621 = C16709.m39278(c16709);
                    if (C1294.f4556 < 0) {
                        m6981 = C2105.m6981("ܶܳ") ^ i14;
                        i2 = ((m6981 ^ i13) * (-6027)) ^ 1828215507;
                        i4 = -1746418359;
                        i5 = m6981 ^ i4;
                        i12 = i;
                        c3 = c;
                        i16 = i5;
                        i15 = i2;
                        sArr2 = sArr;
                    }
                    m6981 = (C0630.m2566("ܶ۟") + i14) * 55;
                    i2 = ((m6981 ^ i13) * 2215) ^ (-1342027532);
                    i4 = 763094180;
                    i5 = m6981 ^ i4;
                    i12 = i;
                    c3 = c;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
                case 884202232:
                case 2115110408:
                    i = i17;
                    short[] sArr3 = f31946;
                    sArr = sArr2;
                    if (C5695.f17556 < 0) {
                        if (C0714.m2805()) {
                            c = c3;
                            String m46315 = C20094.m46315(C1773.m5917(sArr3, UMErrorCode.E_UM_BE_CREATE_FAILED, 7, i11), str);
                            if (RunnableC3474.f10992 > 0) {
                                C20510 c205104 = new C20510(this, str, m46315, this.f31951);
                                if (C1005.f3721) {
                                    c3432.put(str, new SoftReference(c205104));
                                    c205103 = c205104;
                                    m6981 = (C2105.m6981("᩷ۜ") ^ i13) * (-105);
                                    i2 = ((m6981 ^ i14) * (-16303)) ^ (-1715520005);
                                    i4 = 1181988028;
                                    i5 = m6981 ^ i4;
                                    i12 = i;
                                    c3 = c;
                                    i16 = i5;
                                    i15 = i2;
                                    sArr2 = sArr;
                                }
                            }
                            c3 = c;
                            m2566 = (i14 - C0630.m2566("ۢ۫")) * (-13);
                            i2 = ((m2566 ^ i13) * (-11403)) ^ 303462588;
                            i3 = 2108507239;
                            i5 = m2566 ^ i3;
                            i12 = i;
                            i16 = i5;
                            i15 = i2;
                            sArr2 = sArr;
                        } else {
                            c = c3;
                        }
                        m6981 = (C0630.m2566("ܶ۟") + i14) * 55;
                        i2 = ((m6981 ^ i13) * 2215) ^ (-1342027532);
                        i4 = 763094180;
                        i5 = m6981 ^ i4;
                        i12 = i;
                        c3 = c;
                        i16 = i5;
                        i15 = i2;
                        sArr2 = sArr;
                    }
                    m2566 = (i13 - C2105.m6981("ۗۧ")) * 41;
                    i2 = ((m2566 ^ i14) * 29839) ^ (-948367194);
                    i3 = -588706064;
                    i5 = m2566 ^ i3;
                    i12 = i;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
                case 1041183687:
                case 1260661271:
                    sArr = sArr2;
                    i = i17;
                    c3 = 'n';
                    if (C3432.f10845 < 0) {
                        m2566 = C0630.m2566("ۚܳ") ^ i13;
                        i2 = ((m2566 ^ i14) * 22199) ^ 630385055;
                        i3 = -1891019984;
                        i5 = m2566 ^ i3;
                        i12 = i;
                        i16 = i5;
                        i15 = i2;
                        sArr2 = sArr;
                    }
                    m2566 = (i14 - C0630.m2566("ۢ۫")) * (-13);
                    i2 = ((m2566 ^ i13) * (-11403)) ^ 303462588;
                    i3 = 2108507239;
                    i5 = m2566 ^ i3;
                    i12 = i;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
                case 1116806018:
                case 1944884706:
                    sArr = sArr2;
                    c = c3;
                    i = i17;
                    s = sArr[c];
                    i9 = s * s;
                    if (C4616.f14690 > 0) {
                        m6981 = (C2105.m6981("ۛܰ") + i13) * (-127);
                        i2 = ((m6981 ^ i14) * (-1253)) ^ (-1521485915);
                        i4 = 1118367583;
                        i5 = m6981 ^ i4;
                        i12 = i;
                        c3 = c;
                        i16 = i5;
                        i15 = i2;
                        sArr2 = sArr;
                    }
                    m6981 = (C0630.m2566("ܶ۟") + i14) * 55;
                    i2 = ((m6981 ^ i13) * 2215) ^ (-1342027532);
                    i4 = 763094180;
                    i5 = m6981 ^ i4;
                    i12 = i;
                    c3 = c;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
                default:
                    sArr = sArr2;
                    c = c3;
                    i = i17;
                    if (i10 - (s * s2) < 0) {
                        m6981 = C2105.m6981("᩵ܰ") ^ i14;
                        i2 = ((m6981 ^ i13) * (-17021)) ^ (-1800923551);
                        i4 = 61577689;
                    } else {
                        m6981 = (C2105.m6981("ۧ֡") + i13) * 59;
                        i2 = ((m6981 ^ i14) * (-20189)) ^ (-295733710);
                        i4 = -269114583;
                    }
                    i5 = m6981 ^ i4;
                    i12 = i;
                    c3 = c;
                    i16 = i5;
                    i15 = i2;
                    sArr2 = sArr;
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getString(String str) {
        int m6981;
        int i;
        int i2;
        String str2 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1245490675;
        int i9 = ServiceConnectionC3453.f10921;
        int i10 = AbstractC2021.f6743;
        int m2566 = (C0630.m2566("᩹ܳ") + i10) * (-61);
        int i11 = ((m2566 ^ i9) * 5467) ^ (-129560818);
        int i12 = -672952757;
        while (true) {
            int i13 = m2566 ^ i12;
            while (true) {
                i8 = ((((i8 ^ i9) * (-13219)) >> 31) & i11) ^ i13;
                switch (i8) {
                    case -2047904795:
                    case 1775168146:
                        str2 = C0798.m2999(this, str);
                        if (str2 != null) {
                            m6981 = (i9 - C2105.m6981("ۘܰ")) * 63;
                            i = ((m6981 ^ i10) * 12177) ^ 950280401;
                            i2 = 1032759529;
                        } else {
                            m6981 = (C0630.m2566("ܳᩴ") ^ i10) * 17;
                            i = ((m6981 ^ i9) * (-31319)) ^ (-2077378464);
                            i2 = 1562366946;
                        }
                        i13 = m6981 ^ i2;
                        i11 = i;
                    case -2027445470:
                    case -1989439898:
                        if (!C2126.f7087) {
                            break;
                        }
                        m6981 = (C2105.m6981("۠᩷") ^ i9) * 73;
                        i = ((m6981 ^ i10) * 3991) ^ 1976990003;
                        i2 = -364225567;
                        i13 = m6981 ^ i2;
                        i11 = i;
                        break;
                    case -1982287059:
                    case 1216177081:
                        i7 = 38568;
                        m6981 = C0630.m2566("֫֨") ^ i10;
                        i = ((m6981 ^ i9) * 1695) ^ 520325221;
                        i2 = -750433989;
                        i13 = m6981 ^ i2;
                        i11 = i;
                    case -1888156516:
                    case 1762859215:
                        if (C1294.m4372() > 0) {
                            m6981 = C2105.m6981("ܶ᩵") ^ i10;
                            i = ((m6981 ^ i9) * (-5845)) ^ 430257431;
                            i2 = -1936846963;
                            i13 = m6981 ^ i2;
                            i11 = i;
                        }
                        m6981 = C2105.m6981("᩷֡") ^ i10;
                        i = ((m6981 ^ i9) * 12643) ^ (-917316297);
                        i2 = -1307893138;
                        i13 = m6981 ^ i2;
                        i11 = i;
                    case -1871206787:
                    case 1151561709:
                        C3911.m11924();
                        if (C1504.m5179()) {
                            m6981 = C2105.m6981("᩷֡") ^ i10;
                            i = ((m6981 ^ i9) * 12643) ^ (-917316297);
                            i2 = -1307893138;
                            i13 = m6981 ^ i2;
                            i11 = i;
                        }
                        m6981 = (C2105.m6981("۠᩷") ^ i9) * 73;
                        i = ((m6981 ^ i10) * 3991) ^ 1976990003;
                        i2 = -364225567;
                        i13 = m6981 ^ i2;
                        i11 = i;
                    case -1672606816:
                    case 1386177474:
                        short[] sArr2 = f31946;
                        if (C1005.f3721 && C0422.m1963() && C0382.f1805) {
                            throw new IllegalArgumentException(C2958.m9035(C4616.m13542(sArr2, 69, 18, i7), str));
                        }
                        break;
                    case -1487385842:
                    case 1407823351:
                        s = sArr[c];
                        s2 = 9751;
                        if (C4075.f12947 < 0) {
                            m6981 = C2105.m6981("֡᩵") ^ i10;
                            i = ((m6981 ^ i9) * 27571) ^ 475911356;
                            i2 = 271440693;
                            i13 = m6981 ^ i2;
                            i11 = i;
                        }
                        m6981 = C2105.m6981("᩷֡") ^ i10;
                        i = ((m6981 ^ i9) * 12643) ^ (-917316297);
                        i2 = -1307893138;
                        i13 = m6981 ^ i2;
                        i11 = i;
                    case -1444143654:
                    case 1356956804:
                        i6 = 95082001;
                        if (C7811.f24123 < 0) {
                            m6981 = C0630.m2566("᩺ۛ") ^ i10;
                            i = ((m6981 ^ i9) * (-23059)) ^ 1637406782;
                            i2 = 789997287;
                            i13 = m6981 ^ i2;
                            i11 = i;
                        }
                        m6981 = (C2105.m6981("۠᩷") ^ i9) * 73;
                        i = ((m6981 ^ i10) * 3991) ^ 1976990003;
                        i2 = -364225567;
                        i13 = m6981 ^ i2;
                        i11 = i;
                    case -1378864944:
                    case -1235767813:
                        i7 = 49659;
                        m6981 = C0630.m2566("֫֨") ^ i10;
                        i = ((m6981 ^ i9) * 1695) ^ 520325221;
                        i2 = -750433989;
                        i13 = m6981 ^ i2;
                        i11 = i;
                    case -635143695:
                    case 628073442:
                        sArr = f31946;
                        if (C22628.f73083 > 0) {
                            m6981 = C2105.m6981("ۖۢ") ^ i9;
                            i = ((m6981 ^ i10) * (-18379)) ^ (-1552980805);
                            i2 = 1067714417;
                            i13 = m6981 ^ i2;
                            i11 = i;
                        }
                        m6981 = (C2105.m6981("۠᩷") ^ i9) * 73;
                        i = ((m6981 ^ i10) * 3991) ^ 1976990003;
                        i2 = -364225567;
                        i13 = m6981 ^ i2;
                        i11 = i;
                    case -459106329:
                    case 823296923:
                        if (C1711.m5736() <= 0) {
                            break;
                        }
                        m6981 = C2105.m6981("ۚۨ") ^ i9;
                        i = ((m6981 ^ i10) * (-12763)) ^ (-1413653739);
                        i2 = 1704763480;
                        i13 = m6981 ^ i2;
                        i11 = i;
                        break;
                    case 11606612:
                    case 1987174945:
                        i4 = i3 * i3;
                        i5 = s * s;
                        if (C3432.m10477() > 0) {
                            m6981 = C2105.m6981("ۘܺ") ^ i9;
                            i = ((m6981 ^ i10) * 25765) ^ 1215848235;
                            i2 = -1139365226;
                            i13 = m6981 ^ i2;
                            i11 = i;
                        }
                        m6981 = (C2105.m6981("۠᩷") ^ i9) * 73;
                        i = ((m6981 ^ i10) * 3991) ^ 1976990003;
                        i2 = -364225567;
                        i13 = m6981 ^ i2;
                        i11 = i;
                    case 21227083:
                    case 1833026305:
                        return str2;
                    case 235953993:
                    case 2017259582:
                        RunnableC0588.m2441();
                        return null;
                    case 271407121:
                    case 2042614469:
                        int i14 = i5 + i6;
                        if (i4 - (i14 + i14) > 0) {
                            m6981 = (C2105.m6981("֫۫") ^ i9) * (-11);
                            i = ((m6981 ^ i10) * 20091) ^ 948388661;
                            i2 = -1726122583;
                        } else {
                            m6981 = C0630.m2566("ܳ۬") ^ i9;
                            i = ((m6981 ^ i10) * (-21179)) ^ (-86183879);
                            i2 = 1093084089;
                        }
                        i13 = m6981 ^ i2;
                        i11 = i;
                    case 573976347:
                    case 1183292482:
                        i3 = s + s2;
                        if (C21923.f70183 != 0) {
                            m6981 = C2105.m6981("۟ᩴ") ^ i10;
                            i = ((m6981 ^ i9) * (-5079)) ^ 1570419686;
                            i2 = -958544245;
                        } else {
                            m6981 = (C0630.m2566("۫᩸") ^ i10) * 39;
                            i = ((m6981 ^ i9) * (-18731)) ^ 723260527;
                            i2 = 860386198;
                        }
                        i13 = m6981 ^ i2;
                        i11 = i;
                    case 764073732:
                    case 1462671845:
                        C0050.m940();
                        RunnableC1108.m3790();
                        m6981 = (C2105.m6981("۠᩷") ^ i9) * 73;
                        i = ((m6981 ^ i10) * 3991) ^ 1976990003;
                        i2 = -364225567;
                        i13 = m6981 ^ i2;
                        i11 = i;
                    default:
                        c = 'D';
                        if (!C1504.f5354) {
                            m6981 = (i9 - C2105.m6981("ۡۧ")) * q.h;
                            i = ((m6981 ^ i10) * (-4615)) ^ 741747040;
                            i2 = -414255915;
                            i13 = m6981 ^ i2;
                            i11 = i;
                        }
                        m6981 = C2105.m6981("ۚۨ") ^ i9;
                        i = ((m6981 ^ i10) * (-12763)) ^ (-1413653739);
                        i2 = 1704763480;
                        i13 = m6981 ^ i2;
                        i11 = i;
                }
            }
            m2566 = C0630.m2566("ܽܰ") ^ i10;
            i11 = ((m2566 ^ i9) * 32119) ^ 771246401;
            i12 = 2065743636;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f3, code lost:
    
        if (l.C0964.f3626 != 0) goto L33;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getStringNullable(java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10632.getStringNullable(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (l.C11340.f33930 < 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        if (l.C0382.f1805 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (l.C3911.f12484 >= 0) goto L69;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m26673(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10632.m26673(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        if (l.C2105.f7037 == 0) goto L14;
     */
    @Override // bin.mt.plugin.api.PluginContext
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.plugin.api.LocalString getLocalString() {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10632.getLocalString():bin.mt.plugin.api.LocalString");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String getString(String str, Object... objArr) {
        int i = 1022982979;
        int i2 = C4117.f13076;
        int i3 = C3911.f12484;
        int m2566 = (C0630.m2566("ܶ۠") + i3) * (-13);
        int i4 = ((m2566 ^ i2) * 23655) ^ (-1710862932);
        int i5 = -358263863;
        while (true) {
            i = ((((i ^ i2) * 8167) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2081298518:
                case 1716770813:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = (C2105.m6981("᩵ۧ") + i2) * (-79);
                        i4 = ((m2566 ^ i3) * 22491) ^ 833040133;
                        i5 = -1539612812;
                    } else {
                        m2566 = C2105.m6981("ᩴ᩶") ^ i3;
                        i4 = ((m2566 ^ i2) * 24207) ^ (-216415151);
                        i5 = 737536657;
                    }
                case -2060281181:
                case -1555866311:
                    if (C3432.f10845 >= 0) {
                        m2566 = (C2105.m6981("᩵ۧ") + i2) * (-79);
                        i4 = ((m2566 ^ i3) * 22491) ^ 833040133;
                        i5 = -1539612812;
                    } else {
                        m2566 = C0630.m2566("᩻۟") ^ i3;
                        i4 = ((m2566 ^ i2) * (-2595)) ^ 1100574598;
                        i5 = -872335623;
                    }
                case -1829677923:
                case -1299414772:
                    C11340.m28031();
                    return null;
                case -1672390410:
                case 967606296:
                    C1047.m3599();
                    if (C0798.f2919) {
                        m2566 = C0630.m2566("᩻۟") ^ i3;
                        i4 = ((m2566 ^ i2) * (-2595)) ^ 1100574598;
                        i5 = -872335623;
                    } else {
                        m2566 = (C2105.m6981("᩸۫") + i3) * (-37);
                        i4 = ((m2566 ^ i2) * 22205) ^ 973680678;
                        i5 = -228839179;
                    }
                case -1516958484:
                case 1254548080:
                    if (RunnableC3474.m10630()) {
                        m2566 = C2105.m6981("ܺ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * 3123) ^ 13912791;
                        i5 = 526728717;
                    } else {
                        m2566 = (C2105.m6981("ᩳ᩹") + i2) * 75;
                        i4 = ((m2566 ^ i3) * 24111) ^ (-1229515876);
                        i5 = -850715658;
                    }
                case -1395782076:
                case 131693070:
                    if (C0798.f2919) {
                        m2566 = (C2105.m6981("᩵ۧ") + i2) * (-79);
                        i4 = ((m2566 ^ i3) * 22491) ^ 833040133;
                        i5 = -1539612812;
                    } else {
                        m2566 = (C2105.m6981("ܰۚ") ^ i3) * (-103);
                        i4 = ((m2566 ^ i2) * 21793) ^ 1639668252;
                        i5 = -1077333301;
                    }
                case -890599448:
                case 973222639:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = C0630.m2566("᩻۟") ^ i3;
                        i4 = ((m2566 ^ i2) * (-2595)) ^ 1100574598;
                        i5 = -872335623;
                    } else {
                        m2566 = C2105.m6981("ܳۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * 11483) ^ 510783918;
                        i5 = 815442771;
                    }
                case -854228474:
                case -262689145:
                    if (C2105.f7037 != 0) {
                        m2566 = C0630.m2566("᩻۟") ^ i3;
                        i4 = ((m2566 ^ i2) * (-2595)) ^ 1100574598;
                        i5 = -872335623;
                    } else {
                        m2566 = (C0630.m2566("ᩴۖ") + i3) * (-111);
                        i4 = ((m2566 ^ i2) * (-6057)) ^ (-30785182);
                        i5 = -708864533;
                    }
                case 63975243:
                case 1229296058:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = (C2105.m6981("᩵ۧ") + i2) * (-79);
                        i4 = ((m2566 ^ i3) * 22491) ^ 833040133;
                        i5 = -1539612812;
                    } else {
                        m2566 = C0630.m2566("ۡܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * 1161) ^ 14267193;
                        i5 = 738819457;
                    }
                case 545233520:
                case 719399720:
                    C0630.m2564();
                    C4263.m12819();
                    m2566 = (C2105.m6981("᩵ۧ") + i2) * (-79);
                    i4 = ((m2566 ^ i3) * 22491) ^ 833040133;
                    i5 = -1539612812;
                case 933519628:
                case 1889753006:
                    if (C2126.m7040()) {
                        m2566 = (C2105.m6981("᩸۫") + i3) * (-37);
                        i4 = ((m2566 ^ i2) * 22205) ^ 973680678;
                        i5 = -228839179;
                    } else {
                        m2566 = C2105.m6981("ᩳۢ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-3735)) ^ (-1127619039);
                        i5 = 55635195;
                    }
                case 997555447:
                case 1436175507:
                    if (C1047.f3863 >= 0) {
                        m2566 = (C2105.m6981("ᩳ᩹") + i2) * 75;
                        i4 = ((m2566 ^ i3) * 24111) ^ (-1229515876);
                        i5 = -850715658;
                    } else {
                        m2566 = (C0630.m2566("ۘᩴ") + i2) * (-61);
                        i4 = ((m2566 ^ i3) * (-1153)) ^ 1057160777;
                        i5 = 769844158;
                    }
                case 1236025947:
                case 1574115285:
                    if (C2105.f7037 != 0) {
                        m2566 = (C2105.m6981("ᩳ᩹") + i2) * 75;
                        i4 = ((m2566 ^ i3) * 24111) ^ (-1229515876);
                        i5 = -850715658;
                    } else {
                        m2566 = (i2 - C0630.m2566("۬ۖ")) * (-79);
                        i4 = ((m2566 ^ i3) * (-7741)) ^ (-1382340519);
                        i5 = 1004385638;
                    }
                case 1391450029:
                case 1982089416:
                    RunnableC1937.m6387();
                    if (C1128.m3851() > 0) {
                        m2566 = (C2105.m6981("᩵ۧ") + i2) * (-79);
                        i4 = ((m2566 ^ i3) * 22491) ^ 833040133;
                        i5 = -1539612812;
                    } else {
                        m2566 = (C2105.m6981("ᩳ᩹") + i2) * 75;
                        i4 = ((m2566 ^ i3) * 24111) ^ (-1229515876);
                        i5 = -850715658;
                    }
                case 1558954522:
                case 2086643895:
                    if (C0714.f2697 >= 0) {
                        m2566 = C0630.m2566("ܶ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * 14711) ^ (-199534225);
                        i5 = 1868954826;
                    } else {
                        m2566 = C0630.m2566("ܺ۠") ^ i3;
                        i4 = ((m2566 ^ i2) * (-11867)) ^ (-1268015786);
                        i5 = -755098365;
                    }
                default:
                    return m26670(getString(str), objArr);
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final List getStringList(String... strArr) {
        getStringArray(strArr);
        return Arrays.asList(strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ae, code lost:
    
        if (l.C3746.m11369() >= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b8, code lost:
    
        r0 = (r13 - l.C2105.m6981("ۜᩳ")) * 55;
        r15 = ((r0 ^ r14) * (-29583)) ^ (-56683871);
        r18 = -409833106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
    
        if (l.C2105.f7037 == 0) goto L37;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m26672(l.C10632 r20, java.lang.Class r21) {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10632.m26672(l.ۤ᩻᩷, java.lang.Class):void");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final String[] getStringArray(String... strArr) {
        int i = 0;
        String str = null;
        int i2 = -1752797703;
        int i3 = C1294.f4556;
        int i4 = RunnableC3474.f10992;
        int m2566 = (C0630.m2566("ۡܽ") ^ i4) * (-73);
        int i5 = ((m2566 ^ i3) * (-23451)) ^ 1184348460;
        int i6 = 1737919262;
        while (true) {
            i2 = ((((i2 ^ i3) * 20067) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -2015161333:
                case -844737807:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = (C0630.m2566("᩶۬") ^ i4) * 127;
                        i5 = ((m2566 ^ i3) * (-16995)) ^ 267948284;
                        i6 = 66737460;
                    } else {
                        m2566 = C2105.m6981("ۘ᩻") ^ i3;
                        i5 = ((m2566 ^ i4) * (-23187)) ^ 1509916678;
                        i6 = 1023127962;
                    }
                case -1994692741:
                case -1863646255:
                    RunnableC1108.m3790();
                    C1773.m5908();
                    m2566 = C2105.m6981("۬ۗ") ^ i3;
                    i5 = ((m2566 ^ i4) * 13645) ^ 318494317;
                    i6 = -1273145012;
                case -1977813315:
                case 1310127483:
                    C1420.m4913();
                    if (AbstractC2021.m6574()) {
                        m2566 = C2105.m6981("֨ᩳ") ^ i3;
                        i5 = ((m2566 ^ i4) * 15343) ^ 1588235851;
                        i6 = 932573308;
                    } else {
                        m2566 = (C0630.m2566("᩶۬") ^ i4) * 127;
                        i5 = ((m2566 ^ i3) * (-16995)) ^ 267948284;
                        i6 = 66737460;
                    }
                case -1872360390:
                case 1610363977:
                    if (C11340.f33930 >= 0) {
                        m2566 = (C0630.m2566("᩶۬") ^ i4) * 127;
                        i5 = ((m2566 ^ i3) * (-16995)) ^ 267948284;
                        i6 = 66737460;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۨ᩺")) * (-59);
                        i5 = ((m2566 ^ i4) * (-29267)) ^ (-1461745535);
                        i6 = 1650866702;
                    }
                case -1812731630:
                case 1098461397:
                    if (C2126.f7087) {
                        m2566 = C2105.m6981("۬ۗ") ^ i3;
                        i5 = ((m2566 ^ i4) * 13645) ^ 318494317;
                        i6 = -1273145012;
                    } else {
                        m2566 = (C0630.m2566("᩺ۗ") ^ i4) * 45;
                        i5 = ((m2566 ^ i3) * 187) ^ 1140402929;
                        i6 = -1761755974;
                    }
                case -1734504548:
                case -1567935180:
                    C3911.m11924();
                    if (C2167.f7158 >= 0) {
                        m2566 = C2105.m6981("۬ۗ") ^ i3;
                        i5 = ((m2566 ^ i4) * 13645) ^ 318494317;
                        i6 = -1273145012;
                    } else {
                        m2566 = (C0630.m2566("᩶۬") ^ i4) * 127;
                        i5 = ((m2566 ^ i3) * (-16995)) ^ 267948284;
                        i6 = 66737460;
                    }
                case -1667344671:
                case 1074041364:
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = (C0630.m2566("᩶۬") ^ i4) * 127;
                        i5 = ((m2566 ^ i3) * (-16995)) ^ 267948284;
                        i6 = 66737460;
                    } else {
                        m2566 = C2105.m6981("ܺᩳ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-21599)) ^ 684731948;
                        i6 = -242467858;
                    }
                case -1596065078:
                case 63128130:
                    i = 0;
                    m2566 = (C2105.m6981("᩵֨") ^ i4) * (-69);
                    i5 = ((m2566 ^ i3) * (-19205)) ^ 1647120876;
                    i6 = 1992619722;
                case -985326342:
                case -295832556:
                    if (C0237.f1507 != 0) {
                        m2566 = C2105.m6981("۬ۗ") ^ i3;
                        i5 = ((m2566 ^ i4) * 13645) ^ 318494317;
                        i6 = -1273145012;
                    } else {
                        m2566 = (C2105.m6981("۟ᩴ") + i3) * 69;
                        i5 = ((m2566 ^ i4) * (-23107)) ^ 552241379;
                        i6 = -1434800085;
                    }
                case -883732557:
                case 1544353250:
                    if (C2520.f8000 >= 0) {
                        m2566 = C0630.m2566("᩷᩹") ^ i4;
                        i5 = ((m2566 ^ i3) * 23661) ^ (-1055283118);
                        i6 = -336235022;
                    } else {
                        m2566 = C2105.m6981("᩸ܿ") ^ i4;
                        i5 = ((m2566 ^ i3) * 2999) ^ (-1142992487);
                        i6 = -1884028290;
                    }
                case -683366487:
                case 1943429241:
                    if (C21923.f70183 != 0) {
                        m2566 = C0630.m2566("ܺۢ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-29249)) ^ (-228843867);
                        i6 = -738826260;
                    } else {
                        m2566 = C2105.m6981("ۙۚ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-22751)) ^ 1120028831;
                        i6 = -276311965;
                    }
                case -485403791:
                case 1083161961:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m2566 = (C0630.m2566("᩶۬") ^ i4) * 127;
                        i5 = ((m2566 ^ i3) * (-16995)) ^ 267948284;
                        i6 = 66737460;
                    } else {
                        m2566 = (C0630.m2566("ۖ۬") ^ i4) * (-101);
                        i5 = ((m2566 ^ i3) * 20365) ^ (-295028257);
                        i6 = 513814125;
                    }
                case -315233088:
                case 1588135287:
                    if (i < strArr.length) {
                        m2566 = C0630.m2566("۠ܳ") ^ i3;
                        i5 = ((m2566 ^ i4) * 7961) ^ (-1922773537);
                        i6 = -1044727651;
                    } else {
                        m2566 = C2105.m6981("ܳۡ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-1415)) ^ 2133859667;
                        i6 = 1506601578;
                    }
                case -257957292:
                case -154879409:
                    return strArr;
                case -208861114:
                case 981062844:
                    i++;
                    m2566 = (C2105.m6981("᩵֨") ^ i4) * (-69);
                    i5 = ((m2566 ^ i3) * (-19205)) ^ 1647120876;
                    i6 = 1992619722;
                case 16327320:
                case 2097035055:
                    if (C4159.m12565() >= 0) {
                        m2566 = C2105.m6981("۬ۗ") ^ i3;
                        i5 = ((m2566 ^ i4) * 13645) ^ 318494317;
                        i6 = -1273145012;
                    } else {
                        m2566 = C0630.m2566("᩷᩹") ^ i4;
                        i5 = ((m2566 ^ i3) * 23661) ^ (-1055283118);
                        i6 = -336235022;
                    }
                case 353194431:
                case 1753901325:
                    strArr[i] = str;
                    if (C7811.f24123 >= 0) {
                        m2566 = C0630.m2566("ܺۢ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-29249)) ^ (-228843867);
                        i6 = -738826260;
                    } else {
                        m2566 = C2105.m6981("᩻ۖ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-6521)) ^ (-239701295);
                        i6 = -1838875056;
                    }
                case 454373900:
                case 794141224:
                    C4075.m12263();
                    C0422.m1963();
                    return null;
                default:
                    str = getString(strArr[i]);
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = C2105.m6981("۬ۗ") ^ i3;
                        i5 = ((m2566 ^ i4) * 13645) ^ 318494317;
                        i6 = -1273145012;
                    } else {
                        m2566 = (C2105.m6981("᩺᩺") + i4) * (-13);
                        i5 = ((m2566 ^ i3) * 16183) ^ (-689380618);
                        i6 = 333829704;
                    }
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void openPreference(Class cls) {
        int i = 1740011989;
        int i2 = C4616.f14690;
        int i3 = C1294.f4556;
        int m6981 = C2105.m6981("ۜۘ") ^ i2;
        int i4 = ((m6981 ^ i3) * 7689) ^ 1880551829;
        int i5 = -1686561742;
        while (true) {
            i = ((((i ^ i3) * 3687) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2053264539:
                case 1293525623:
                    if (C2167.m7155()) {
                        m6981 = (C2105.m6981("᩵۟") + i2) * (-57);
                        i4 = ((m6981 ^ i3) * 10187) ^ (-1155881866);
                        i5 = -139060621;
                    } else {
                        m6981 = (C0630.m2566("۫ۡ") ^ i3) * 45;
                        i4 = ((m6981 ^ i2) * 3451) ^ 43143362;
                        i5 = 370296299;
                    }
                case -2019391828:
                case -1463461771:
                    C3663.m11168();
                    ViewOnClickListenerC1958.m6429();
                    m6981 = C0630.m2566("֨ܶ") ^ i2;
                    i4 = ((m6981 ^ i3) * 11041) ^ (-1042927205);
                    i5 = 679403213;
                case -1966916694:
                case 2002880672:
                    if (C1128.m3851() > 0) {
                        m6981 = C0630.m2566("֨ܶ") ^ i2;
                        i4 = ((m6981 ^ i3) * 11041) ^ (-1042927205);
                        i5 = 679403213;
                    } else {
                        m6981 = (C2105.m6981("᩵۟") + i2) * (-57);
                        i4 = ((m6981 ^ i3) * 10187) ^ (-1155881866);
                        i5 = -139060621;
                    }
                case -1711273444:
                case 484769271:
                    if (C3245.m9925() != 0) {
                        m6981 = C0630.m2566("֨ܶ") ^ i2;
                        i4 = ((m6981 ^ i3) * 11041) ^ (-1042927205);
                        i5 = 679403213;
                    } else {
                        m6981 = (i2 - C0630.m2566("ܿ᩺")) * 15;
                        i4 = ((m6981 ^ i3) * 12101) ^ 295635858;
                        i5 = 166393052;
                    }
                case -1570479756:
                case 705562933:
                    if (RunnableC1108.f4040) {
                        m6981 = (C0630.m2566("۫ۖ") ^ i2) * 37;
                        i4 = ((m6981 ^ i3) * (-21359)) ^ 619869341;
                        i5 = 1236346877;
                    } else {
                        m6981 = C0630.m2566("ۜ᩻") ^ i3;
                        i4 = ((m6981 ^ i2) * (-8955)) ^ (-649463602);
                        i5 = 634086046;
                    }
                case -1111352946:
                case 730458708:
                    if (C2126.m7040()) {
                        m6981 = C2105.m6981("ᩳۛ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-10705)) ^ (-790527112);
                        i5 = -945523817;
                    } else {
                        m6981 = (i3 - C0630.m2566("ܺܺ")) * 29;
                        i4 = ((m6981 ^ i2) * (-8165)) ^ (-1423240971);
                        i5 = 103416828;
                    }
                case -793336598:
                case 1432462987:
                    if (C7811.f24123 >= 0) {
                        m6981 = (C2105.m6981("֨ۙ") + i2) * 45;
                        i4 = ((m6981 ^ i3) * 22469) ^ 1599637752;
                        i5 = -1587037843;
                    } else {
                        m6981 = C2105.m6981("ۡۖ") ^ i3;
                        i4 = ((m6981 ^ i2) * 16905) ^ 2067522281;
                        i5 = -299323223;
                    }
                case -764894958:
                case 305213363:
                    if (C2272.f7362) {
                        m6981 = C2105.m6981("ᩳۛ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-10705)) ^ (-790527112);
                        i5 = -945523817;
                    } else {
                        m6981 = (i2 - C0630.m2566("ۘۘ")) * (-93);
                        i4 = ((m6981 ^ i3) * (-11985)) ^ 724836836;
                        i5 = -1006523787;
                    }
                case -733288557:
                case -708283549:
                    if (C0483.f2088 >= 0) {
                        m6981 = (C2105.m6981("᩵۟") + i2) * (-57);
                        i4 = ((m6981 ^ i3) * 10187) ^ (-1155881866);
                        i5 = -139060621;
                    } else {
                        m6981 = (C2105.m6981("᩵֡") + i2) * 67;
                        i4 = ((m6981 ^ i3) * 27965) ^ (-1602967005);
                        i5 = 2102571850;
                    }
                case -725318946:
                case 1498537966:
                    if (C0422.f1886 <= 0) {
                        m6981 = (C2105.m6981("᩵۟") + i2) * (-57);
                        i4 = ((m6981 ^ i3) * 10187) ^ (-1155881866);
                        i5 = -139060621;
                    } else {
                        m6981 = (C0630.m2566("ۘ᩸") ^ i3) * 61;
                        i4 = ((m6981 ^ i2) * 18595) ^ (-1918694122);
                        i5 = 788337411;
                    }
                case -390958330:
                case 1849792304:
                    C1504.m5179();
                    if (RunnableC1937.f6483 < 0) {
                        m6981 = (C2105.m6981("᩵۟") + i2) * (-57);
                        i4 = ((m6981 ^ i3) * 10187) ^ (-1155881866);
                        i5 = -139060621;
                    } else {
                        m6981 = C2105.m6981("ᩳۛ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-10705)) ^ (-790527112);
                        i5 = -945523817;
                    }
                case -200332990:
                case 1855469918:
                    if (C22628.f73083 > 0) {
                        ThreadUtil.runOnUiThread(new RunnableC9149(1, this, cls));
                        break;
                    }
                    m6981 = (C2105.m6981("֨ۙ") + i2) * 45;
                    i4 = ((m6981 ^ i3) * 22469) ^ 1599637752;
                    i5 = -1587037843;
                case 247838339:
                case 966337821:
                    C3537.m10746();
                    C1504.m5179();
                    break;
                case 300015760:
                case 1092672151:
                    if (C0630.f2410 <= 0) {
                        m6981 = C0630.m2566("֨ܶ") ^ i2;
                        i4 = ((m6981 ^ i3) * 11041) ^ (-1042927205);
                        i5 = 679403213;
                    } else {
                        m6981 = C0630.m2566("ۗۢ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-17493)) ^ 379254300;
                        i5 = 1527203202;
                    }
                default:
                    C22628.m50615();
                    if (C1005.f3721) {
                        m6981 = C0630.m2566("ۜ᩻") ^ i3;
                        i4 = ((m6981 ^ i2) * (-8955)) ^ (-649463602);
                        i5 = 634086046;
                    } else {
                        m6981 = C0630.m2566("֨ܶ") ^ i2;
                        i4 = ((m6981 ^ i3) * 11041) ^ (-1042927205);
                        i5 = 679403213;
                    }
            }
            return;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    @Deprecated
    public final LocalString getAssetLocalString(String str) {
        return m26674(str);
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final LocalString getLanguageNameLocalString() {
        return C15297.m36318();
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final boolean hasClipboardText() {
        boolean z = false;
        int i = 956613648;
        int i2 = C22628.f73083;
        int i3 = RunnableC1937.f6483;
        int m6981 = (C2105.m6981("ᩳۚ") + i3) * (-107);
        int i4 = ((m6981 ^ i2) * (-2739)) ^ 1843072789;
        int i5 = -1241225721;
        while (true) {
            i = ((((i ^ i2) * (-1029)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1865944168:
                case 2102184976:
                    if (C1504.f5354) {
                        m6981 = (C2105.m6981("ۘۖ") ^ i3) * 69;
                        i4 = ((m6981 ^ i2) * (-26419)) ^ 225241279;
                        i5 = -448411758;
                    } else {
                        m6981 = (C2105.m6981("ܽۚ") ^ i2) * (-75);
                        i4 = ((m6981 ^ i3) * (-30887)) ^ (-1947025622);
                        i5 = 1462436978;
                    }
                case -1780156846:
                case -1217047114:
                    if (RunnableC3474.f10992 > 0) {
                        m6981 = C0630.m2566("᩶֫") ^ i2;
                        i4 = ((m6981 ^ i3) * (-19221)) ^ (-1226218177);
                        i5 = -1763942196;
                    } else {
                        m6981 = (C2105.m6981("۬֫") + i2) * (-115);
                        i4 = ((m6981 ^ i3) * (-6559)) ^ 1698144381;
                        i5 = -1607110508;
                    }
                case -1629181330:
                case -978539412:
                    if (C7106.m19120() <= 0) {
                        m6981 = C0630.m2566("᩶֫") ^ i2;
                        i4 = ((m6981 ^ i3) * (-19221)) ^ (-1226218177);
                        i5 = -1763942196;
                    } else {
                        m6981 = (i2 - C2105.m6981("᩷᩶")) * 37;
                        i4 = ((m6981 ^ i3) * (-19551)) ^ 444975094;
                        i5 = 1502767884;
                    }
                case -1556324390:
                case 2099789297:
                    C0964.m3413();
                    C3746.m11369();
                    m6981 = (i3 - C0630.m2566("֫᩹")) * (-81);
                    i4 = ((m6981 ^ i2) * (-10323)) ^ 1819663457;
                    i5 = 96683521;
                case -1455100352:
                case -750682377:
                    break;
                case -1317787371:
                case 1670404371:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = (C2105.m6981("۬֫") + i2) * (-115);
                        i4 = ((m6981 ^ i3) * (-6559)) ^ 1698144381;
                        i5 = -1607110508;
                    } else {
                        m6981 = C2105.m6981("ۗ᩸") ^ i2;
                        i4 = ((m6981 ^ i3) * 31845) ^ 861472258;
                        i5 = -610785195;
                    }
                case -1301524926:
                case 879535289:
                    if (C1916.f6442) {
                        m6981 = C2105.m6981("۟ۖ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-6751)) ^ (-2127025709);
                        i5 = -840752713;
                    } else {
                        m6981 = C0630.m2566("ۨܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 253) ^ (-2013812770);
                        i5 = 481379885;
                    }
                case -1250220044:
                case -952296598:
                    try {
                        z = m26669().hasPrimaryClip();
                        m6981 = C2105.m6981("ۗۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-5)) ^ (-1308991356);
                        i5 = -425549068;
                    } catch (Throwable unused) {
                        m6981 = C2105.m6981("۠ᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 1019) ^ (-1620759899);
                        i5 = -49808347;
                    }
                case -1163806867:
                case 693280156:
                    if (C5695.m16023() >= 0) {
                        m6981 = (C2105.m6981("۬֫") + i2) * (-115);
                        i4 = ((m6981 ^ i3) * (-6559)) ^ 1698144381;
                        i5 = -1607110508;
                    } else {
                        m6981 = (C2105.m6981("ۘۖ") ^ i3) * 69;
                        i4 = ((m6981 ^ i2) * (-26419)) ^ 225241279;
                        i5 = -448411758;
                    }
                case -1022513455:
                case -787725578:
                    if (C3245.m9925() != 0) {
                        m6981 = (C2105.m6981("ۘۖ") ^ i3) * 69;
                        i4 = ((m6981 ^ i2) * (-26419)) ^ 225241279;
                        i5 = -448411758;
                    } else {
                        m6981 = (C2105.m6981("᩹ۖ") + i2) * (-85);
                        i4 = ((m6981 ^ i3) * (-31951)) ^ 100588;
                        i5 = 2031857459;
                    }
                case -839804477:
                case 1788184366:
                    ServiceConnectionC3453.m10564();
                    if (C0798.f2919) {
                        m6981 = (i3 - C0630.m2566("֫᩹")) * (-81);
                        i4 = ((m6981 ^ i2) * (-10323)) ^ 1819663457;
                        i5 = 96683521;
                    } else {
                        m6981 = C0630.m2566("᩶֫") ^ i2;
                        i4 = ((m6981 ^ i3) * (-19221)) ^ (-1226218177);
                        i5 = -1763942196;
                    }
                case -756737467:
                case 491341311:
                    C2167.m7155();
                    break;
                case -665518158:
                case 150038308:
                    if (C0714.f2697 >= 0) {
                        m6981 = (C2105.m6981("ۘۖ") ^ i3) * 69;
                        i4 = ((m6981 ^ i2) * (-26419)) ^ 225241279;
                        i5 = -448411758;
                    } else {
                        m6981 = (C2105.m6981("۠ۖ") ^ i3) * 101;
                        i4 = ((m6981 ^ i2) * (-21985)) ^ (-743431274);
                        i5 = 1302152221;
                    }
                case -293879753:
                case 335440221:
                    if (C0422.m1963()) {
                        m6981 = C2105.m6981("ۛۤ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-19847)) ^ (-244170434);
                        i5 = 613950391;
                    } else {
                        m6981 = C0630.m2566("ۨܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 253) ^ (-2013812770);
                        i5 = 481379885;
                    }
                case -134153085:
                case 1525743502:
                    if (C1504.f5354) {
                        m6981 = (C2105.m6981("ۘۖ") ^ i3) * 69;
                        i4 = ((m6981 ^ i2) * (-26419)) ^ 225241279;
                        i5 = -448411758;
                    } else {
                        m6981 = (C2105.m6981("ۛܶ") ^ i3) * 73;
                        i4 = ((m6981 ^ i2) * (-7287)) ^ 993266123;
                        i5 = -595607924;
                    }
                case 228363924:
                case 1170469845:
                    if (C2105.m6982() != 0) {
                        m6981 = (C2105.m6981("ۘۖ") ^ i3) * 69;
                        i4 = ((m6981 ^ i2) * (-26419)) ^ 225241279;
                        i5 = -448411758;
                    } else {
                        m6981 = C0630.m2566("᩷ۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * 21675) ^ (-1884928634);
                        i5 = 251940353;
                    }
                case 1062845959:
                case 1826933916:
                    break;
                default:
                    if (C2167.m7155()) {
                        m6981 = (i3 - C0630.m2566("֫᩹")) * (-81);
                        i4 = ((m6981 ^ i2) * (-10323)) ^ 1819663457;
                        i5 = 96683521;
                    } else {
                        m6981 = C2105.m6981("ۘۗ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-27547)) ^ 1644422360;
                        i5 = -1726848271;
                    }
            }
            return false;
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final CharSequence getClipboardText() {
        CharSequence charSequence = null;
        Object th = null;
        CharSequence charSequence2 = null;
        int i = -1562654887;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = C1047.f3863;
        int m6981 = C2105.m6981("ۛܰ") ^ i2;
        int i4 = ((m6981 ^ i3) * 24803) ^ 67064881;
        int i5 = 313785721;
        while (true) {
            i = ((((i ^ i3) * 17143) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2109104887:
                case 728857871:
                    charSequence2 = "";
                    m6981 = C0630.m2566("ᩴۚ") ^ i2;
                    i4 = ((m6981 ^ i3) * (-2853)) ^ (-1565677798);
                    i5 = 1373379821;
                case -2061655317:
                case -626773391:
                    C3019.m9255();
                    if (RunnableC1108.f4040) {
                        m6981 = (C0630.m2566("ۧܺ") ^ i3) * 127;
                        i4 = ((m6981 ^ i2) * (-30967)) ^ 2094902212;
                        i5 = 1934148575;
                    } else {
                        m6981 = (C2105.m6981("֨ܰ") ^ i3) * (-7);
                        i4 = ((m6981 ^ i2) * 31987) ^ 2144889177;
                        i5 = 710388796;
                    }
                case -1947046024:
                case 368107394:
                    if (C4117.f13076 <= 0) {
                        m6981 = (C0630.m2566("۫ᩴ") + i2) * (-13);
                        i4 = ((m6981 ^ i3) * (-14629)) ^ 868443433;
                        i5 = 1619025681;
                    } else {
                        m6981 = (C0630.m2566("᩶ۙ") ^ i2) * (-39);
                        i4 = ((m6981 ^ i3) * 8625) ^ (-269186704);
                        i5 = 513369947;
                    }
                case -1687760236:
                case -141170104:
                    if (C2958.f9394 >= 0) {
                        m6981 = (C0630.m2566("۫ᩴ") + i2) * (-13);
                        i4 = ((m6981 ^ i3) * (-14629)) ^ 868443433;
                        i5 = 1619025681;
                    } else {
                        m6981 = (i2 - C0630.m2566("ܿ֫")) * (-91);
                        i4 = ((m6981 ^ i3) * (-26535)) ^ (-461255224);
                        i5 = -311890819;
                    }
                case -1681350621:
                case 429460419:
                    if (charSequence == null) {
                        m6981 = C2105.m6981("ۡ᩵") ^ i3;
                        i4 = ((m6981 ^ i2) * (-12423)) ^ (-348822884);
                        i5 = 254900180;
                    } else {
                        charSequence2 = charSequence;
                        m6981 = C0630.m2566("ᩴۚ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-2853)) ^ (-1565677798);
                        i5 = 1373379821;
                    }
                case -1656034873:
                case 1494319902:
                    C4616.m13552();
                    C4159.m12565();
                    m6981 = (C2105.m6981("֨ܰ") ^ i3) * (-7);
                    i4 = ((m6981 ^ i2) * 31987) ^ 2144889177;
                    i5 = 710388796;
                case -1628067423:
                case 1693761492:
                    try {
                        charSequence = m26669().getText();
                        m6981 = C0630.m2566("ܰ᩵") ^ i3;
                        i4 = ((m6981 ^ i2) * (-9277)) ^ (-561406351);
                        i5 = 380656655;
                    } catch (Throwable th2) {
                        th = th2;
                        m6981 = C0630.m2566("᩶ᩳ") ^ i2;
                        i4 = ((m6981 ^ i3) * 3593) ^ (-1343331710);
                        i5 = 835870873;
                    }
                case -1482295289:
                case 2059039866:
                    if (C0798.f2919) {
                        m6981 = C2105.m6981("ۛ᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * 22089) ^ 1670466539;
                        i5 = -915823860;
                    } else {
                        m6981 = C2105.m6981("۠᩸") ^ i2;
                        i4 = ((m6981 ^ i3) * (-19839)) ^ 721481020;
                        i5 = 1104385069;
                    }
                case -1419962529:
                case 268927573:
                    if (C4117.m12364() != 0) {
                        m6981 = C2105.m6981("ۛ᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * 22089) ^ 1670466539;
                        i5 = -915823860;
                    } else {
                        m6981 = C0630.m2566("ۡۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 22375) ^ 1351847048;
                        i5 = -1998389726;
                    }
                case -1362767708:
                case 1572575097:
                    if (C1294.f4556 >= 0) {
                        m6981 = (C2105.m6981("֨ܰ") ^ i3) * (-7);
                        i4 = ((m6981 ^ i2) * 31987) ^ 2144889177;
                        i5 = 710388796;
                    } else {
                        m6981 = C2105.m6981("ۛ᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * 22089) ^ 1670466539;
                        i5 = -915823860;
                    }
                case -633870250:
                case 199538917:
                    C1773.m5908();
                    C3911.m11924();
                    return null;
                case -562370387:
                case 93988717:
                    if (C3537.m10746() <= 0) {
                        m6981 = (C0630.m2566("۫ᩴ") + i2) * (-13);
                        i4 = ((m6981 ^ i3) * (-14629)) ^ 868443433;
                        i5 = 1619025681;
                    } else {
                        m6981 = (i2 - C0630.m2566("᩹ᩴ")) * (-53);
                        i4 = ((m6981 ^ i3) * 29367) ^ (-1381823876);
                        i5 = -1675082072;
                    }
                case -454175588:
                case 2053408911:
                    if (C0483.f2088 >= 0) {
                        m6981 = C2105.m6981("᩵ۤ") ^ i2;
                        i4 = ((m6981 ^ i3) * 29103) ^ (-784127543);
                        i5 = 2251004;
                    } else {
                        m6981 = C2105.m6981("ܺۤ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-15795)) ^ (-1088950447);
                        i5 = -891884676;
                    }
                case 100434492:
                case 1624355662:
                    return charSequence2;
                case 157689756:
                case 592840091:
                    if (C4616.f14690 <= 0) {
                        m6981 = C2105.m6981("ۛ᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * 22089) ^ 1670466539;
                        i5 = -915823860;
                    } else {
                        m6981 = C2105.m6981("۠۟") ^ i3;
                        i4 = ((m6981 ^ i2) * 2115) ^ (-768272129);
                        i5 = 371067906;
                    }
                case 211329618:
                case 832480431:
                    if (C4263.m12819() >= 0) {
                        m6981 = (C0630.m2566("۫ᩴ") + i2) * (-13);
                        i4 = ((m6981 ^ i3) * (-14629)) ^ 868443433;
                        i5 = 1619025681;
                    } else {
                        m6981 = (C0630.m2566("᩷᩶") ^ i3) * 79;
                        i4 = ((m6981 ^ i2) * (-17641)) ^ 1785726353;
                        i5 = 38881909;
                    }
                case 720293970:
                case 1409468356:
                    if (C1047.f3863 < 0) {
                        m6981 = C2105.m6981("ۛ᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * 22089) ^ 1670466539;
                        i5 = -915823860;
                    } else {
                        m6981 = (C0630.m2566("۫ᩴ") + i2) * (-13);
                        i4 = ((m6981 ^ i3) * (-14629)) ^ 868443433;
                        i5 = 1619025681;
                    }
                case 1183875835:
                case 1331284139:
                    if (C4117.f13076 <= 0) {
                        m6981 = (C0630.m2566("ۧܺ") ^ i3) * 127;
                        i4 = ((m6981 ^ i2) * (-30967)) ^ 2094902212;
                        i5 = 1934148575;
                    } else {
                        m6981 = C2105.m6981("ᩳ۫") ^ i3;
                        i4 = ((m6981 ^ i2) * 21927) ^ (-378569193);
                        i5 = -138327093;
                    }
                case 1260531818:
                case 1710393875:
                    return C0422.m1959(th);
                default:
                    if (C3537.m10746() <= 0) {
                        m6981 = (C0630.m2566("۫ᩴ") + i2) * (-13);
                        i4 = ((m6981 ^ i3) * (-14629)) ^ 868443433;
                        i5 = 1619025681;
                    } else {
                        m6981 = C0630.m2566("ۨܰ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-25543)) ^ 913265909;
                        i5 = 1771375805;
                    }
            }
        }
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void cancelToast() {
        int i = -16549692;
        int i2 = C3019.f9544;
        int i3 = C2520.f8000;
        int m6981 = (i2 - C2105.m6981("᩸ܿ")) * (-115);
        int i4 = ((m6981 ^ i3) * 16401) ^ (-693337626);
        int i5 = -1702946567;
        while (true) {
            i = ((((i ^ i3) * 27103) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1963415327:
                case 439251376:
                    if (RunnableC0588.m2441() >= 0) {
                        m6981 = (C2105.m6981("۠ۗ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m6981 ^ i3) * (-20217)) ^ 1348314306;
                        i5 = 527272625;
                    } else {
                        m6981 = (C2105.m6981("᩶ۜ") ^ i2) * (-71);
                        i4 = ((m6981 ^ i3) * (-13687)) ^ (-1690766492);
                        i5 = 1479552847;
                    }
                case -1640876356:
                case 1272954696:
                    if (C1294.m4372() <= 0) {
                        m6981 = (C0630.m2566("۟ܿ") + i2) * (-49);
                        i4 = ((m6981 ^ i3) * 11097) ^ 1586312043;
                        i5 = 1956098348;
                    } else {
                        m6981 = C2105.m6981("ۜۤ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-1411)) ^ (-1948314520);
                        i5 = -136672546;
                    }
                case -1358745454:
                case 303302503:
                    if (C11340.f33930 < 0) {
                        ThreadUtil.runOnUiThread(new RunnableC18664(1));
                        break;
                    }
                    m6981 = (C0630.m2566("۟ܿ") + i2) * (-49);
                    i4 = ((m6981 ^ i3) * 11097) ^ 1586312043;
                    i5 = 1956098348;
                case -1246977165:
                case -142753284:
                    if (C4263.f13799 > 0) {
                        m6981 = (C2105.m6981("۠ۗ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m6981 ^ i3) * (-20217)) ^ 1348314306;
                        i5 = 527272625;
                    } else {
                        m6981 = (C2105.m6981("᩷ۛ") ^ i3) * (-109);
                        i4 = ((m6981 ^ i2) * 12177) ^ (-1472617419);
                        i5 = -1270662126;
                    }
                case -662763090:
                case 262125223:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = (C2105.m6981("᩶ۜ") ^ i2) * (-71);
                        i4 = ((m6981 ^ i3) * (-13687)) ^ (-1690766492);
                        i5 = 1479552847;
                    } else {
                        m6981 = C0630.m2566("᩸ۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-20253)) ^ 1096621765;
                        i5 = -604423851;
                    }
                case -610403476:
                case -190292645:
                    C20510 c20510 = C15297.f46931;
                    if (C1005.f3721) {
                        m6981 = C0630.m2566("᩻᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * (-9527)) ^ (-650451906);
                        i5 = -103249211;
                    } else {
                        m6981 = (C2105.m6981("᩶ۜ") ^ i2) * (-71);
                        i4 = ((m6981 ^ i3) * (-13687)) ^ (-1690766492);
                        i5 = 1479552847;
                    }
                case -147707633:
                case 1339050473:
                    C1773.m5908();
                    m6981 = (C2105.m6981("۠ۗ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i4 = ((m6981 ^ i3) * (-20217)) ^ 1348314306;
                    i5 = 527272625;
                case -104285889:
                case 343559279:
                    if (C2958.f9394 >= 0) {
                        m6981 = (C2105.m6981("᩶ۜ") ^ i2) * (-71);
                        i4 = ((m6981 ^ i3) * (-13687)) ^ (-1690766492);
                        i5 = 1479552847;
                    } else {
                        m6981 = C0630.m2566("۫ܶ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-31239)) ^ 895247118;
                        i5 = -140131039;
                    }
                case 61897136:
                case 1980918780:
                    if (C7106.f21815 != 0) {
                        m6981 = (C2105.m6981("᩷ۛ") ^ i3) * (-109);
                        i4 = ((m6981 ^ i2) * 12177) ^ (-1472617419);
                        i5 = -1270662126;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۖۡ")) * 43;
                        i4 = ((m6981 ^ i2) * 21053) ^ 2041361682;
                        i5 = 1721557348;
                    }
                case 106555150:
                case 911969226:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m6981 = (C0630.m2566("۟ܿ") + i2) * (-49);
                        i4 = ((m6981 ^ i3) * 11097) ^ 1586312043;
                        i5 = 1956098348;
                    } else {
                        m6981 = C0630.m2566("֡᩵") ^ i3;
                        i4 = ((m6981 ^ i2) * (-18997)) ^ 847994940;
                        i5 = -2011924208;
                    }
                case 332266967:
                case 1027522082:
                    C2105.m6982();
                    if (RunnableC1108.m3790()) {
                        m6981 = (C0630.m2566("֫ۗ") ^ i3) * (-119);
                        i4 = ((m6981 ^ i2) * 23435) ^ 1416915241;
                        i5 = 212301864;
                    } else {
                        m6981 = (C2105.m6981("᩶ۜ") ^ i2) * (-71);
                        i4 = ((m6981 ^ i3) * (-13687)) ^ (-1690766492);
                        i5 = 1479552847;
                    }
                case 850492101:
                case 1773560909:
                    if (C3432.f10845 >= 0) {
                        m6981 = (C2105.m6981("᩶ۜ") ^ i2) * (-71);
                        i4 = ((m6981 ^ i3) * (-13687)) ^ (-1690766492);
                        i5 = 1479552847;
                    } else {
                        m6981 = (C0630.m2566("۬۠") ^ i2) * 79;
                        i4 = ((m6981 ^ i3) * (-25359)) ^ (-1144854175);
                        i5 = -1934222062;
                    }
                case 1260942241:
                case 1760968974:
                    C1294.m4372();
                    C1128.m3851();
                    break;
                case 1488892438:
                case 2088671490:
                    if (RunnableC1108.f4040) {
                        m6981 = (C2105.m6981("ۤۚ") + i3) * 3;
                        i4 = ((m6981 ^ i2) * 7661) ^ (-65229666);
                        i5 = -1874750309;
                    } else {
                        m6981 = (C0630.m2566("֫ۗ") ^ i3) * (-119);
                        i4 = ((m6981 ^ i2) * 23435) ^ 1416915241;
                        i5 = 212301864;
                    }
                default:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m6981 = (C0630.m2566("۟ܿ") + i2) * (-49);
                        i4 = ((m6981 ^ i3) * 11097) ^ 1586312043;
                        i5 = 1956098348;
                    } else {
                        m6981 = C2105.m6981("۬ۤ") ^ i2;
                        i4 = ((m6981 ^ i3) * 12735) ^ (-455365168);
                        i5 = -1501631552;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (l.C3019.f9544 < 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (l.C2958.f9394 >= 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        if (l.C2272.f7362 != false) goto L57;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.content.ClipboardManager m26669() {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10632.m26669():android.content.ClipboardManager");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ca, code lost:
    
        r6 = (r5 - l.C2105.m6981("ۜܰ")) * 29;
        r7 = ((r6 ^ r4) * 31017) ^ (-1470850838);
        r8 = 903969892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x019e, code lost:
    
        r6 = l.C2105.m6981("ۖ᩺") ^ r5;
        r7 = ((r6 ^ r4) * (-10829)) ^ (-907197189);
        r8 = -1075396469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01f9, code lost:
    
        r6 = (l.C0630.m2566("᩹ۘ") + r4) * (-71);
        r7 = ((r6 ^ r5) * (-19995)) ^ (-721816840);
        r8 = -1795111412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0067, code lost:
    
        if (r1 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0229, code lost:
    
        r6 = (l.C2105.m6981("ۖۢ") + r4) * (-117);
        r7 = ((r6 ^ r5) * 19403) ^ 731910740;
        r8 = 177382582;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showToast(java.lang.CharSequence r10) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10632.showToast(java.lang.CharSequence):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x009f, code lost:
    
        if (l.C4117.f13076 <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00a1, code lost:
    
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a7, code lost:
    
        if (l.C4616.f14690 <= 0) goto L17;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setClipboardText(java.lang.CharSequence r20) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10632.setClipboardText(java.lang.CharSequence):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c2, code lost:
    
        if (l.C1005.f3721 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c7, code lost:
    
        if (l.C5695.f17556 >= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
    
        if (l.C4263.f13799 <= 0) goto L39;
     */
    @Override // bin.mt.plugin.api.PluginContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setClipboardText(java.lang.CharSequence r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10632.setClipboardText(java.lang.CharSequence, java.lang.String):boolean");
    }

    @Override // bin.mt.plugin.api.PluginContext
    public final void log(String str) {
        String str2 = this.f31962;
        C20510 c20510 = C15297.f46931;
        synchronized (C15297.class) {
            C15297.m36310(str2, str);
        }
    }
}
