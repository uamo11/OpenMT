package l;

import bin.mt.plugin.api.LocalString;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.preference.PluginPreference;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;

/* compiled from: N3YD */
/* renamed from: l.ۛ᩻᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6398 implements PluginPreference.Builder {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Class f19798;

    /* renamed from: ۜ֨ᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f19799 = {264, -13976, -13985, -13998, -14005, -13989, -14050, -13999, -13992, -14050, -14050, -13987, -13985, -14000, -14050, -14000, -13999, -14006, -14050, -13988, -13989, -14050, -14000, -14005, -13998, -13998, 4040, -20975, -20980, -20975, -20983, -20992, 2167, -17184, -17155, -17184, -17160, -17167, -17153, -17167, -17171, 1233, 18006, 17995, 18006, 17998, 17991, 17993, 17991, 18011, 500, -29382, -29401, -29382, -29406, -29397, -29403, -29397, -29385, 2407, -8102, -8121, -8102, -8126, -8117, -8123, -8117, -8105, 6639, 15365, 15384, 15365, 15389, 15380, 9659, 1433, 1412, 1433, 1409, 1416, 1414, 1416, 1428};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public PluginContext f19800;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f19801;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f19802;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public LocalString f19803;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public PluginPreference.OnPreferenceChangeListener f19804;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public PluginPreference.OnPreferenceScreenCreatedListener f19805;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public CharSequence f19806;

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Header addHeader(CharSequence charSequence) {
        int i;
        int m2566;
        int i2;
        int i3;
        int i4;
        CharSequence charSequence2 = charSequence;
        int i5 = C2520.f8000;
        int i6 = C3019.f9544;
        int m6981 = C2105.m6981("ۙۜ") ^ i5;
        int i7 = ((m6981 ^ i6) * 29077) ^ 784894581;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = m6981 ^ (-1314510166);
        C12043 c12043 = null;
        char c = 0;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1313440928;
        while (true) {
            int i15 = i8 ^ (i7 & (((i14 ^ i6) * 21465) >> 31));
            switch (i15) {
                case -1996468698:
                case -558321212:
                    i = i15;
                    sArr = f19799;
                    if (C7106.m19120() > 0) {
                        m2566 = C2105.m6981("ۙۙ") ^ i5;
                        i2 = ((m2566 ^ i6) * (-19333)) ^ (-341462534);
                        i3 = -1809468093;
                        i7 = i2;
                        i14 = i;
                        i8 = m2566 ^ i3;
                        charSequence2 = charSequence;
                    }
                    m2566 = (i5 - C0630.m2566("ܿ۠")) * 81;
                    i2 = ((m2566 ^ i6) * 19749) ^ 97456474;
                    i3 = 1516435267;
                    i7 = i2;
                    i14 = i;
                    i8 = m2566 ^ i3;
                    charSequence2 = charSequence;
                case -1979223312:
                case 1670859295:
                    i = i15;
                    i10 = i9 + 395492769;
                    if (C5695.m16023() < 0) {
                        m2566 = (C2105.m6981("ۜۡ") ^ i6) * 115;
                        i2 = ((m2566 ^ i5) * (-22635)) ^ (-1591598518);
                        i3 = 1430097562;
                        i7 = i2;
                        i14 = i;
                        i8 = m2566 ^ i3;
                        charSequence2 = charSequence;
                    }
                    m2566 = C2105.m6981("᩺۬") ^ i6;
                    i2 = ((m2566 ^ i5) * (-26059)) ^ (-305006578);
                    i3 = -1608797462;
                    i7 = i2;
                    i14 = i;
                    i8 = m2566 ^ i3;
                    charSequence2 = charSequence;
                case -1956689359:
                case 2137793895:
                    C4616.m13552();
                    if (C3683.f11629 < 0) {
                        int m25662 = C0630.m2566("ܳۚ") ^ i5;
                        i4 = i15;
                        i8 = m25662 ^ 752915061;
                        i7 = ((m25662 ^ i6) * 14375) ^ 890913641;
                        i14 = i4;
                    } else {
                        i = i15;
                        m2566 = (i6 - C2105.m6981("ۤۤ")) * (-65);
                        i2 = ((m2566 ^ i5) * 8527) ^ (-535347648);
                        i3 = -1139152323;
                        i7 = i2;
                        i14 = i;
                        i8 = m2566 ^ i3;
                        charSequence2 = charSequence;
                    }
                case -1488667610:
                case 1440140954:
                    i = i15;
                    C1005.m3501();
                    m2566 = (i5 - C0630.m2566("ܿ۠")) * 81;
                    i2 = ((m2566 ^ i6) * 19749) ^ 97456474;
                    i3 = 1516435267;
                    i7 = i2;
                    i14 = i;
                    i8 = m2566 ^ i3;
                    charSequence2 = charSequence;
                case -1359603039:
                case 528590391:
                    i = i15;
                    c = 26;
                    if (C2105.m6982() == 0) {
                        m2566 = C0630.m2566("ܽۤ") ^ i5;
                        i2 = ((m2566 ^ i6) * (-27777)) ^ 862074743;
                        i3 = -548434009;
                        i7 = i2;
                        i14 = i;
                        i8 = m2566 ^ i3;
                        charSequence2 = charSequence;
                    }
                    m2566 = (i5 - C0630.m2566("ܿ۠")) * 81;
                    i2 = ((m2566 ^ i6) * 19749) ^ 97456474;
                    i3 = 1516435267;
                    i7 = i2;
                    i14 = i;
                    i8 = m2566 ^ i3;
                    charSequence2 = charSequence;
                case -960301656:
                case -495060932:
                    C1916.m6307(this.f19801, c12043);
                    return c12043;
                case -841458139:
                case 315727557:
                    i = i15;
                    i12 = 27;
                    i13 = 5;
                    if (C3911.f12484 < 0) {
                        m2566 = (i5 - C0630.m2566("᩻ۧ")) * 35;
                        i2 = ((m2566 ^ i6) * 27581) ^ (-249131986);
                        i3 = 1320149468;
                        i7 = i2;
                        i14 = i;
                        i8 = m2566 ^ i3;
                        charSequence2 = charSequence;
                    }
                    m2566 = (i6 - C2105.m6981("ۤۤ")) * (-65);
                    i2 = ((m2566 ^ i5) * 8527) ^ (-535347648);
                    i3 = -1139152323;
                    i7 = i2;
                    i14 = i;
                    i8 = m2566 ^ i3;
                    charSequence2 = charSequence;
                case -827182021:
                case 973224413:
                    i = i15;
                    if (!C2126.f7087) {
                        m2566 = C0630.m2566("ۘ᩵") ^ i6;
                        i2 = ((m2566 ^ i5) * 7085) ^ (-588606617);
                        i3 = 1688283467;
                        i7 = i2;
                        i14 = i;
                        i8 = m2566 ^ i3;
                        charSequence2 = charSequence;
                    }
                    m2566 = (i5 - C2105.m6981("۠ᩴ")) * (-111);
                    i2 = ((m2566 ^ i6) * 12633) ^ (-833082650);
                    i3 = 211362215;
                    i7 = i2;
                    i14 = i;
                    i8 = m2566 ^ i3;
                    charSequence2 = charSequence;
                case -657536560:
                case 1489567221:
                    i = i15;
                    c12043 = new C12043();
                    if (C5695.f17556 < 0) {
                        m2566 = C0630.m2566("ۚ᩷") ^ i5;
                        i2 = ((m2566 ^ i6) * 23625) ^ 2037760848;
                        i3 = -1474602939;
                        i7 = i2;
                        i14 = i;
                        i8 = m2566 ^ i3;
                        charSequence2 = charSequence;
                    }
                    m2566 = (i6 - C2105.m6981("ۤۤ")) * (-65);
                    i2 = ((m2566 ^ i5) * 8527) ^ (-535347648);
                    i3 = -1139152323;
                    i7 = i2;
                    i14 = i;
                    i8 = m2566 ^ i3;
                    charSequence2 = charSequence;
                case -191457255:
                case 1547761826:
                    i = i15;
                    i11 = 29090;
                    m2566 = (C2105.m6981("᩵᩻") ^ i6) * (-69);
                    i2 = ((m2566 ^ i5) * (-31093)) ^ (-998191129);
                    i3 = 737053698;
                    i7 = i2;
                    i14 = i;
                    i8 = m2566 ^ i3;
                    charSequence2 = charSequence;
                case 36295045:
                case 1958270336:
                    C0798.m2998();
                    return null;
                case 242458080:
                case 1070076949:
                    i = i15;
                    if ((s * s2) - i10 <= 0) {
                        m2566 = C2105.m6981("ܳܰ") ^ i5;
                        i2 = ((m2566 ^ i6) * (-3327)) ^ 1701925040;
                        i3 = -817723210;
                    } else {
                        m2566 = C2105.m6981("ۛܿ") ^ i6;
                        i2 = ((m2566 ^ i5) * 14305) ^ 2009149147;
                        i3 = 423086637;
                    }
                    i7 = i2;
                    i14 = i;
                    i8 = m2566 ^ i3;
                    charSequence2 = charSequence;
                case 371858605:
                case 721322129:
                    C3683.m11222();
                    if (C0382.f1805) {
                        i = i15;
                        m2566 = (i5 - C0630.m2566("ܿ۠")) * 81;
                        i2 = ((m2566 ^ i6) * 19749) ^ 97456474;
                        i3 = 1516435267;
                        i7 = i2;
                        i14 = i;
                        i8 = m2566 ^ i3;
                        charSequence2 = charSequence;
                    } else {
                        int m256622 = C0630.m2566("ܳۚ") ^ i5;
                        i4 = i15;
                        i8 = m256622 ^ 752915061;
                        i7 = ((m256622 ^ i6) * 14375) ^ 890913641;
                        i14 = i4;
                    }
                case 599752396:
                case 2019833885:
                    i = i15;
                    sArr2 = f19799;
                    if (C0483.f2088 < 0) {
                        m2566 = C2105.m6981("֨ܰ") ^ i6;
                        i2 = ((m2566 ^ i5) * 7817) ^ (-1826509204);
                        i3 = -9395779;
                        i7 = i2;
                        i14 = i;
                        i8 = m2566 ^ i3;
                        charSequence2 = charSequence;
                    }
                    m2566 = C2105.m6981("᩺۬") ^ i6;
                    i2 = ((m2566 ^ i5) * (-26059)) ^ (-305006578);
                    i3 = -1608797462;
                    i7 = i2;
                    i14 = i;
                    i8 = m2566 ^ i3;
                    charSequence2 = charSequence;
                case 718961192:
                case 1303969960:
                    C0483.m2121();
                    if (C0964.f3626 != 0) {
                        i = i15;
                        m2566 = (i5 - C2105.m6981("۠ᩴ")) * (-111);
                        i2 = ((m2566 ^ i6) * 12633) ^ (-833082650);
                        i3 = 211362215;
                        i7 = i2;
                        i14 = i;
                        i8 = m2566 ^ i3;
                        charSequence2 = charSequence;
                    }
                    i = i15;
                    m2566 = (i6 - C2105.m6981("ۤۤ")) * (-65);
                    i2 = ((m2566 ^ i5) * 8527) ^ (-535347648);
                    i3 = -1139152323;
                    i7 = i2;
                    i14 = i;
                    i8 = m2566 ^ i3;
                    charSequence2 = charSequence;
                case 1038742774:
                case 1155966655:
                    i = i15;
                    i11 = 44645;
                    m2566 = (C2105.m6981("᩵᩻") ^ i6) * (-69);
                    i2 = ((m2566 ^ i5) * (-31093)) ^ (-998191129);
                    i3 = 737053698;
                    i7 = i2;
                    i14 = i;
                    i8 = m2566 ^ i3;
                    charSequence2 = charSequence;
                case 1312267426:
                case 1505351492:
                    i = i15;
                    m17725(charSequence2, C21923.m49334(sArr2, i12, i13, i11));
                    c12043.f24118 = charSequence2;
                    if (C2105.f7037 != 0) {
                        m2566 = (i6 - C2105.m6981("ۤۤ")) * (-65);
                        i2 = ((m2566 ^ i5) * 8527) ^ (-535347648);
                        i3 = -1139152323;
                        i7 = i2;
                        i14 = i;
                        i8 = m2566 ^ i3;
                        charSequence2 = charSequence;
                    } else {
                        int m25663 = (C0630.m2566("ۜ᩵") + i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((m25663 ^ i5) * (-8501)) ^ 1938810931;
                        charSequence2 = charSequence;
                        i4 = i;
                        i8 = m25663 ^ (-1760968471);
                        i14 = i4;
                    }
                case 1396094046:
                case 1424728244:
                    i = i15;
                    s = sArr[c];
                    i9 = s * s;
                    if (C5695.m16023() < 0) {
                        m2566 = C2105.m6981("۫᩻") ^ i6;
                        i2 = ((m2566 ^ i5) * (-28863)) ^ (-1917072709);
                        i3 = -1909050593;
                        i7 = i2;
                        i14 = i;
                        i8 = m2566 ^ i3;
                        charSequence2 = charSequence;
                    }
                    m2566 = C2105.m6981("᩺۬") ^ i6;
                    i2 = ((m2566 ^ i5) * (-26059)) ^ (-305006578);
                    i3 = -1608797462;
                    i7 = i2;
                    i14 = i;
                    i8 = m2566 ^ i3;
                    charSequence2 = charSequence;
                default:
                    i = i15;
                    s2 = 39774;
                    if (C1047.m3599() < 0) {
                        m2566 = C2105.m6981("ܳ᩸") ^ i5;
                        i2 = ((m2566 ^ i6) * (-16111)) ^ 1872982244;
                        i3 = -1267980828;
                        i7 = i2;
                        i14 = i;
                        i8 = m2566 ^ i3;
                        charSequence2 = charSequence;
                    }
                    m2566 = (i5 - C0630.m2566("ܿ۠")) * 81;
                    i2 = ((m2566 ^ i6) * 19749) ^ 97456474;
                    i3 = 1516435267;
                    i7 = i2;
                    i14 = i;
                    i8 = m2566 ^ i3;
                    charSequence2 = charSequence;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Text addText(CharSequence charSequence, String str) {
        int i;
        int m2566;
        int i2;
        int i3;
        int i4;
        String str2 = str;
        int i5 = C0050.f910;
        int i6 = C2958.f9394;
        int m25662 = (C0630.m2566("᩵᩶") ^ i5) * (-7);
        int i7 = ((m25662 ^ i6) * 15129) ^ (-1185104418);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i8 = m25662 ^ 1992834566;
        short s = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 994168362;
        String str3 = null;
        C17896 c17896 = null;
        while (true) {
            int i14 = i8 ^ (i7 & (((i13 ^ i6) * (-19215)) >> 31));
            switch (i14) {
                case -2067621447:
                case 1100183742:
                    i = i14;
                    i10 = 1517;
                    m2566 = (C0630.m2566("᩺ܺ") + i5) * 11;
                    i2 = ((m2566 ^ i6) * 17567) ^ 28772775;
                    i3 = 2118254480;
                    i7 = i2;
                    i13 = i;
                    i8 = m2566 ^ i3;
                    str2 = str;
                case -2007684699:
                case 197478476:
                    i = i14;
                    str3 = C3019.m9250(sArr3, 80, 3, i10);
                    if (C0050.m940() > 0) {
                        m2566 = (i5 - C0630.m2566("ۜ᩵")) * 15;
                        i2 = ((m2566 ^ i6) * 13407) ^ 2118465010;
                        i3 = 1566151800;
                        i7 = i2;
                        i13 = i;
                        i8 = m2566 ^ i3;
                        str2 = str;
                    }
                    m2566 = (i6 - C2105.m6981("ۚܽ")) * 7;
                    i2 = ((m2566 ^ i5) * 11711) ^ (-1424087848);
                    i3 = 952162402;
                    i7 = i2;
                    i13 = i;
                    i8 = m2566 ^ i3;
                    str2 = str;
                case -1865998186:
                case -1159755901:
                    i = i14;
                    m17725(str2, str3);
                    if (C2167.f7158 >= 0) {
                        m2566 = C0630.m2566("ܳ۟") ^ i5;
                        i2 = ((m2566 ^ i6) * 29443) ^ (-1808595203);
                        i3 = -1912222811;
                        i7 = i2;
                        i13 = i;
                        i8 = m2566 ^ i3;
                        str2 = str;
                    } else {
                        int m25663 = C0630.m2566("ܶۜ") ^ i5;
                        i7 = ((m25663 ^ i6) * 11507) ^ 1092825511;
                        str2 = str;
                        i4 = i;
                        i8 = m25663 ^ 708865180;
                        i13 = i4;
                    }
                case -1562410295:
                case 2007737174:
                    i = i14;
                    C1047.m3599();
                    m2566 = (i6 - C2105.m6981("ۚܽ")) * 7;
                    i2 = ((m2566 ^ i5) * 11711) ^ (-1424087848);
                    i3 = 952162402;
                    i7 = i2;
                    i13 = i;
                    i8 = m2566 ^ i3;
                    str2 = str;
                case -1518720599:
                case -333432804:
                    i = i14;
                    c17896 = new C17896();
                    sArr2 = f19799;
                    if (C0714.f2697 < 0) {
                        m2566 = C2105.m6981("ۚ֨") ^ i6;
                        i2 = ((m2566 ^ i5) * (-14529)) ^ (-1888127471);
                        i3 = -508291277;
                        i7 = i2;
                        i13 = i;
                        i8 = m2566 ^ i3;
                        str2 = str;
                    }
                    m2566 = C2105.m6981("ۡ᩸") ^ i6;
                    i2 = ((m2566 ^ i5) * (-8851)) ^ (-1085216349);
                    i3 = -1123214895;
                    i7 = i2;
                    i13 = i;
                    i8 = m2566 ^ i3;
                    str2 = str;
                case -1300487515:
                case 804985320:
                    i = i14;
                    if (i9 - (s * 3094) >= 0) {
                        m2566 = (C2105.m6981("ۢۚ") + i5) * (-117);
                        i2 = ((m2566 ^ i6) * 29899) ^ 902649429;
                        i3 = -910717025;
                    } else {
                        m2566 = (C2105.m6981("۬᩵") + i6) * 75;
                        i2 = ((m2566 ^ i5) * 5661) ^ 1854440176;
                        i3 = -1158017205;
                    }
                    i7 = i2;
                    i13 = i;
                    i8 = m2566 ^ i3;
                    str2 = str;
                case -1276592171:
                case -510103663:
                    C22628.m50615();
                    if (C3537.m10746() <= 0) {
                        i = i14;
                        m2566 = C0630.m2566("ܳ۟") ^ i5;
                        i2 = ((m2566 ^ i6) * 29443) ^ (-1808595203);
                        i3 = -1912222811;
                        i7 = i2;
                        i13 = i;
                        i8 = m2566 ^ i3;
                        str2 = str;
                    }
                    i = i14;
                    m2566 = (i6 - C2105.m6981("ۚܽ")) * 7;
                    i2 = ((m2566 ^ i5) * 11711) ^ (-1424087848);
                    i3 = 952162402;
                    i7 = i2;
                    i13 = i;
                    i8 = m2566 ^ i3;
                    str2 = str;
                case -1138290923:
                case 1987695830:
                    i = i14;
                    s = sArr[74];
                    if (C1420.f5096 > 0) {
                        m2566 = C2105.m6981("ۨۖ") ^ i5;
                        i2 = ((m2566 ^ i6) * 10179) ^ 776259576;
                        i3 = -1050815752;
                        i7 = i2;
                        i13 = i;
                        i8 = m2566 ^ i3;
                        str2 = str;
                    }
                    m2566 = C0630.m2566("ܳ۟") ^ i5;
                    i2 = ((m2566 ^ i6) * 29443) ^ (-1808595203);
                    i3 = -1912222811;
                    i7 = i2;
                    i13 = i;
                    i8 = m2566 ^ i3;
                    str2 = str;
                case -1112312056:
                case 1957003690:
                    i = i14;
                    m17725(charSequence, ServiceConnectionC3453.m10568(sArr2, i11, i12, i10));
                    sArr3 = f19799;
                    if (C4117.f13076 > 0) {
                        m2566 = (C0630.m2566("ܰ᩶") + i6) * (-51);
                        i2 = ((m2566 ^ i5) * (-12309)) ^ 656379791;
                        i3 = -1584798884;
                        i7 = i2;
                        i13 = i;
                        i8 = m2566 ^ i3;
                        str2 = str;
                    }
                    m2566 = C2105.m6981("ۡ᩸") ^ i6;
                    i2 = ((m2566 ^ i5) * (-8851)) ^ (-1085216349);
                    i3 = -1123214895;
                    i7 = i2;
                    i13 = i;
                    i8 = m2566 ^ i3;
                    str2 = str;
                case -994934349:
                case 1039668061:
                    i = i14;
                    i9 = 2393209 + (s * s);
                    if (C2520.f8000 < 0) {
                        m2566 = (C0630.m2566("ܽܳ") + i6) * (-109);
                        i2 = ((m2566 ^ i5) * (-17333)) ^ 561371641;
                        i3 = 767193202;
                        i7 = i2;
                        i13 = i;
                        i8 = m2566 ^ i3;
                        str2 = str;
                    }
                    m2566 = (i6 - C2105.m6981("ۚܽ")) * 7;
                    i2 = ((m2566 ^ i5) * 11711) ^ (-1424087848);
                    i3 = 952162402;
                    i7 = i2;
                    i13 = i;
                    i8 = m2566 ^ i3;
                    str2 = str;
                case -757703272:
                case -689596495:
                    c17896.f24118 = charSequence;
                    c17896.f24119 = str2;
                    C7106.m19117(this.f19801, c17896);
                    return c17896;
                case -645925611:
                case 345380778:
                    i = i14;
                    i11 = 75;
                    i12 = 5;
                    if (C0483.f2088 < 0) {
                        m2566 = (C2105.m6981("᩸᩸") + i5) * (-45);
                        i2 = ((m2566 ^ i6) * 9541) ^ 793180796;
                        i3 = -490637445;
                        i7 = i2;
                        i13 = i;
                        i8 = m2566 ^ i3;
                        str2 = str;
                    }
                    m2566 = C2105.m6981("۬ᩳ") ^ i5;
                    i2 = ((m2566 ^ i6) * 16775) ^ 155932729;
                    i3 = 490570717;
                    i7 = i2;
                    i13 = i;
                    i8 = m2566 ^ i3;
                    str2 = str;
                case -491062012:
                case 1803987115:
                    i = i14;
                    i10 = 60709;
                    m2566 = (C0630.m2566("᩺ܺ") + i5) * 11;
                    i2 = ((m2566 ^ i6) * 17567) ^ 28772775;
                    i3 = 2118254480;
                    i7 = i2;
                    i13 = i;
                    i8 = m2566 ^ i3;
                    str2 = str;
                case 112691463:
                case 1639680668:
                    i = i14;
                    if (C1916.f6442) {
                        m2566 = (i5 - C0630.m2566("᩵֫")) * (-61);
                        i2 = ((m2566 ^ i6) * (-2211)) ^ (-456905138);
                        i3 = -1836573880;
                        i7 = i2;
                        i13 = i;
                        i8 = m2566 ^ i3;
                        str2 = str;
                    }
                    m2566 = C2105.m6981("ۡ᩸") ^ i6;
                    i2 = ((m2566 ^ i5) * (-8851)) ^ (-1085216349);
                    i3 = -1123214895;
                    i7 = i2;
                    i13 = i;
                    i8 = m2566 ^ i3;
                    str2 = str;
                case 246037617:
                case 1608832599:
                    i = i14;
                    if (C3432.f10845 < 0) {
                        m2566 = C0630.m2566("ۖ᩹") ^ i6;
                        i2 = ((m2566 ^ i5) * (-18943)) ^ (-1787557492);
                        i3 = -1942925061;
                        i7 = i2;
                        i13 = i;
                        i8 = m2566 ^ i3;
                        str2 = str;
                    }
                    m2566 = C2105.m6981("۬ᩳ") ^ i5;
                    i2 = ((m2566 ^ i6) * 16775) ^ 155932729;
                    i3 = 490570717;
                    i7 = i2;
                    i13 = i;
                    i8 = m2566 ^ i3;
                    str2 = str;
                case 454204988:
                case 2031313935:
                    i = i14;
                    sArr = f19799;
                    if (C4075.m12263() > 0) {
                        m2566 = (C2105.m6981("ۚܿ") ^ i6) * 81;
                        i2 = ((m2566 ^ i5) * (-6879)) ^ 1011275386;
                        i3 = 870674375;
                        i7 = i2;
                        i13 = i;
                        i8 = m2566 ^ i3;
                        str2 = str;
                    }
                    m2566 = C2105.m6981("ۡ᩸") ^ i6;
                    i2 = ((m2566 ^ i5) * (-8851)) ^ (-1085216349);
                    i3 = -1123214895;
                    i7 = i2;
                    i13 = i;
                    i8 = m2566 ^ i3;
                    str2 = str;
                case 911663983:
                case 1923100898:
                    if (C3663.m11168() < 0) {
                        i = i14;
                        m2566 = (i6 - C2105.m6981("ۚܽ")) * 7;
                        i2 = ((m2566 ^ i5) * 11711) ^ (-1424087848);
                        i3 = 952162402;
                        i7 = i2;
                        i13 = i;
                        i8 = m2566 ^ i3;
                        str2 = str;
                    } else {
                        int m6981 = (i6 - C2105.m6981("᩻ۜ")) * 71;
                        i4 = i14;
                        i8 = m6981 ^ (-1938903540);
                        i7 = ((m6981 ^ i5) * (-23395)) ^ (-715677710);
                        i13 = i4;
                    }
                case 1211051249:
                case 1668960733:
                    if (RunnableC3474.f10992 <= 0) {
                        int m69812 = (i6 - C2105.m6981("᩻ۜ")) * 71;
                        i4 = i14;
                        i8 = m69812 ^ (-1938903540);
                        i7 = ((m69812 ^ i5) * (-23395)) ^ (-715677710);
                        i13 = i4;
                    } else {
                        i = i14;
                        m2566 = C2105.m6981("۬ᩳ") ^ i5;
                        i2 = ((m2566 ^ i6) * 16775) ^ 155932729;
                        i3 = 490570717;
                        i7 = i2;
                        i13 = i;
                        i8 = m2566 ^ i3;
                        str2 = str;
                    }
                default:
                    C3537.m10746();
                    C1128.m3851();
                    return null;
            }
        }
    }

    static {
        ClassNotFoundException e = null;
        int i = 2079977780;
        int i2 = C0483.f2088;
        int i3 = C4263.f13799;
        int m6981 = (C2105.m6981("ܰ᩸") ^ i3) * (-49);
        int i4 = ((m6981 ^ i2) * (-899)) ^ (-448849055);
        int i5 = -1259346215;
        while (true) {
            i = ((((i ^ i2) * 6777) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1716969524:
                case -1631984178:
                    ServiceConnectionC3453.m10564();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = C0630.m2566("ۢᩴ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-5571)) ^ (-1251692624);
                        i5 = 9416779;
                    } else {
                        m6981 = (C0630.m2566("ᩳ֡") + i3) * (-85);
                        i4 = ((m6981 ^ i2) * (-5945)) ^ 487375899;
                        i5 = -1201431920;
                    }
                case -1637226979:
                case -671792581:
                    if (C1294.f4556 < 0) {
                        if (C0237.f1507 == 0) {
                            if (!C2272.m7503()) {
                                if (RunnableC0588.f2309 < 0) {
                                    if (C1916.f6442) {
                                        if (ServiceConnectionC3453.f10921 < 0) {
                                            if (C1711.f5919) {
                                                m6981 = C0630.m2566("ۢᩴ") ^ i2;
                                                i4 = ((m6981 ^ i3) * (-5571)) ^ (-1251692624);
                                                i5 = 9416779;
                                            } else if (!C2167.m7155()) {
                                                if (C2958.f9394 < 0) {
                                                    if (C7811.f24123 < 0) {
                                                        throw new RuntimeException(e);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                m6981 = (i2 - C2105.m6981("ۧ᩵")) * 5;
                                i4 = ((m6981 ^ i3) * 15523) ^ 1403582579;
                                i5 = -1104353482;
                            }
                        }
                        m6981 = (i2 - C0630.m2566("ᩳ᩺")) * 37;
                        i4 = ((m6981 ^ i3) * (-21541)) ^ 526551597;
                        i5 = 1515696917;
                    }
                    m6981 = (i3 - C0630.m2566("ۚܶ")) * (-107);
                    i4 = ((m6981 ^ i2) * (-24483)) ^ (-1408781279);
                    i5 = -2089847886;
                case -702576561:
                case -444130081:
                    C3911.m11924();
                    if (C0237.f1507 == 0) {
                        m6981 = (C0630.m2566("ᩳ֡") + i3) * (-85);
                        i4 = ((m6981 ^ i2) * (-5945)) ^ 487375899;
                        i5 = -1201431920;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۚܶ")) * (-107);
                        i4 = ((m6981 ^ i2) * (-24483)) ^ (-1408781279);
                        i5 = -2089847886;
                    }
                case 106514094:
                case 607625986:
                    C1916.m6308();
                    throw new RuntimeException();
                case 150307471:
                case 1322515321:
                    try {
                        int i6 = ActivityC18827.f59388;
                        f19798 = ActivityC18827.class;
                        m6981 = (C2105.m6981("۟᩶") ^ i3) * (-69);
                        i4 = ((m6981 ^ i2) * 2651) ^ (-809099864);
                        i5 = -1556292279;
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        m6981 = (C0630.m2566("ۙᩳ") + i2) * 83;
                        i4 = ((m6981 ^ i3) * (-2277)) ^ (-1429413741);
                        i5 = -1892217988;
                    }
                case 646595270:
                case 1103254828:
                    return;
                case 1256589560:
                case 1710664345:
                    C0714.m2805();
                    if (C1504.f5354) {
                        m6981 = (C0630.m2566("ᩳ֡") + i3) * (-85);
                        i4 = ((m6981 ^ i2) * (-5945)) ^ 487375899;
                        i5 = -1201431920;
                    } else {
                        m6981 = (i2 - C2105.m6981("ۧ᩵")) * 5;
                        i4 = ((m6981 ^ i3) * 15523) ^ 1403582579;
                        i5 = -1104353482;
                    }
                default:
                    C1294.m4372();
                    m6981 = (C0630.m2566("ᩳ֡") + i3) * (-85);
                    i4 = ((m6981 ^ i2) * (-5945)) ^ 487375899;
                    i5 = -1201431920;
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Switch addSwitch(CharSequence charSequence, String str) {
        int m6981;
        int i;
        int i2;
        String str2 = str;
        int i3 = C1047.f3863;
        int i4 = RunnableC0588.f2309;
        int m2566 = C0630.m2566("ᩴ᩷") ^ i3;
        int i5 = ((m2566 ^ i4) * 439) ^ (-1174941371);
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i6 = m2566 ^ 1272527452;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1446166714;
        String str3 = null;
        C16484 c16484 = null;
        while (true) {
            i13 = i6 ^ (i5 & (((i13 ^ i4) * 6809) >> 31));
            switch (i13) {
                case -2132626361:
                case 634038513:
                    C1420.m4913();
                    int m25662 = C0630.m2566("᩻᩷") ^ i3;
                    i6 = m25662 ^ 1455680470;
                    i5 = ((m25662 ^ i4) * (-25727)) ^ 2092003098;
                    str2 = str;
                case -1982056881:
                case 763492071:
                    c16484 = new C16484();
                    sArr2 = f19799;
                    if (C1773.m5908() > 0) {
                        m6981 = C2105.m6981("ᩴ֡") ^ i3;
                        i = ((m6981 ^ i4) * 599) ^ (-358577009);
                        i2 = -976987529;
                        i6 = m6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    m6981 = (C2105.m6981("ۡ᩵") + i3) * (-39);
                    i = ((m6981 ^ i4) * (-7411)) ^ 1811616337;
                    i2 = -556092610;
                    i6 = m6981 ^ i2;
                    str2 = str;
                    i5 = i;
                case -1717000612:
                case -279760588:
                    i10 = 17413;
                    m6981 = C0630.m2566("᩷᩶") ^ i4;
                    i = ((m6981 ^ i3) * 26079) ^ 125271663;
                    i2 = -1267120233;
                    i6 = m6981 ^ i2;
                    str2 = str;
                    i5 = i;
                case -1494891240:
                case 1326431016:
                    sArr = f19799;
                    if (!C3663.f11553) {
                        m6981 = C2105.m6981("ۘܺ") ^ i3;
                        i = ((m6981 ^ i4) * (-20959)) ^ (-942737769);
                        i2 = -1838880496;
                        i6 = m6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    m6981 = C2105.m6981("᩺֡") ^ i3;
                    i = ((m6981 ^ i4) * 23105) ^ 1410330028;
                    i2 = 1276481475;
                    i6 = m6981 ^ i2;
                    str2 = str;
                    i5 = i;
                case -1404560469:
                case -1027288568:
                    if (C2167.f7158 >= 0) {
                        int m256622 = C0630.m2566("᩻᩷") ^ i3;
                        i6 = m256622 ^ 1455680470;
                        i5 = ((m256622 ^ i4) * (-25727)) ^ 2092003098;
                        str2 = str;
                    } else {
                        m6981 = (C0630.m2566("֫ܺ") + i4) * 41;
                        i = ((m6981 ^ i3) * 24569) ^ (-763279449);
                        i2 = 1986101617;
                        i6 = m6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                case -1261933407:
                case -233358990:
                    i10 = 57390;
                    m6981 = C0630.m2566("᩷᩶") ^ i4;
                    i = ((m6981 ^ i3) * 26079) ^ 125271663;
                    i2 = -1267120233;
                    i6 = m6981 ^ i2;
                    str2 = str;
                    i5 = i;
                case -1049710387:
                case -318185600:
                    C2126.m7040();
                    if (C4075.m12263() > 0) {
                        int m2566222 = C0630.m2566("᩻᩷") ^ i3;
                        i6 = m2566222 ^ 1455680470;
                        i5 = ((m2566222 ^ i4) * (-25727)) ^ 2092003098;
                        str2 = str;
                    } else {
                        m6981 = (i4 - C0630.m2566("ۜ֫")) * (-23);
                        i = ((m6981 ^ i3) * (-16829)) ^ 109236205;
                        i2 = 262474897;
                        i6 = m6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                case -975902761:
                case 1660387418:
                    str3 = C0237.m1483(sArr3, 65, 3, i10);
                    if (RunnableC1937.m6387() == 0) {
                        m6981 = C0630.m2566("ܺۤ") ^ i3;
                        i = ((m6981 ^ i4) * (-19115)) ^ (-1198403098);
                        i2 = 34735488;
                        i6 = m6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    m6981 = (C0630.m2566("֫ܺ") + i4) * 41;
                    i = ((m6981 ^ i3) * 24569) ^ (-763279449);
                    i2 = 1986101617;
                    i6 = m6981 ^ i2;
                    str2 = str;
                    i5 = i;
                case -962432586:
                case 1474331296:
                    if (C4159.m12565() < 0) {
                        m6981 = C2105.m6981("ۛܳ") ^ i4;
                        i = ((m6981 ^ i3) * (-24923)) ^ (-329767930);
                        i2 = 1058988303;
                        i6 = m6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    m6981 = (C2105.m6981("ۡ᩵") + i3) * (-39);
                    i = ((m6981 ^ i4) * (-7411)) ^ 1811616337;
                    i2 = -556092610;
                    i6 = m6981 ^ i2;
                    str2 = str;
                    i5 = i;
                case -923944816:
                case -55726263:
                    i9 = 760384;
                    if (C3432.m10477() > 0) {
                        m6981 = (i3 - C0630.m2566("ܽۨ")) * 83;
                        i = ((m6981 ^ i4) * 26683) ^ 541275629;
                        i2 = 835263627;
                        i6 = m6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    m6981 = (i4 - C0630.m2566("ۜ֫")) * (-23);
                    i = ((m6981 ^ i3) * (-16829)) ^ 109236205;
                    i2 = 262474897;
                    i6 = m6981 ^ i2;
                    str2 = str;
                    i5 = i;
                case -743946306:
                case 2110498396:
                    int i14 = s + s2;
                    i7 = i14 * i14;
                    i8 = s * s;
                    if (C0050.f910 < 0) {
                        m6981 = C0630.m2566("᩺۫") ^ i3;
                        i = ((m6981 ^ i4) * 3903) ^ (-1555725680);
                        i2 = 1909887377;
                        i6 = m6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    m6981 = (C0630.m2566("֫ܺ") + i4) * 41;
                    i = ((m6981 ^ i3) * 24569) ^ (-763279449);
                    i2 = 1986101617;
                    i6 = m6981 ^ i2;
                    str2 = str;
                    i5 = i;
                case -608656925:
                case 708578915:
                    C4616.m13552();
                    C21923.m49329();
                    return null;
                case -552026561:
                case 1952444791:
                    C2105.m6982();
                    if (C2958.m9034() <= 0) {
                        int m25662222 = C0630.m2566("᩻᩷") ^ i3;
                        i6 = m25662222 ^ 1455680470;
                        i5 = ((m25662222 ^ i4) * (-25727)) ^ 2092003098;
                        str2 = str;
                    } else {
                        m6981 = C2105.m6981("᩺֡") ^ i3;
                        i = ((m6981 ^ i4) * 23105) ^ 1410330028;
                        i2 = 1276481475;
                        i6 = m6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                case -329785551:
                case 799640075:
                    int i15 = i8 + i9;
                    if (i7 - (i15 + i15) > 0) {
                        m6981 = (C0630.m2566("ܶܽ") + i3) * (-15);
                        i = ((m6981 ^ i4) * 8861) ^ 327822059;
                        i2 = 742559596;
                    } else {
                        m6981 = (i4 - C0630.m2566("ۨܺ")) * (-119);
                        i = ((m6981 ^ i3) * (-16747)) ^ (-1497784625);
                        i2 = -661951900;
                    }
                    i6 = m6981 ^ i2;
                    str2 = str;
                    i5 = i;
                case 113859612:
                case 1988693582:
                    c16484.f24118 = charSequence;
                    c16484.f24119 = str2;
                    C1916.m6307(this.f19801, c16484);
                    return c16484;
                case 521942811:
                case 2096238504:
                    s = sArr[59];
                    s2 = 872;
                    if (C3911.f12484 < 0) {
                        m6981 = C2105.m6981("۠᩻") ^ i4;
                        i = ((m6981 ^ i3) * (-6443)) ^ 1854322051;
                        i2 = 1246975882;
                        i6 = m6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    m6981 = C2105.m6981("᩺֡") ^ i3;
                    i = ((m6981 ^ i4) * 23105) ^ 1410330028;
                    i2 = 1276481475;
                    i6 = m6981 ^ i2;
                    str2 = str;
                    i5 = i;
                case 581994936:
                case 1595935987:
                    m17725(charSequence, C4263.m12817(sArr2, i11, i12, i10));
                    sArr3 = f19799;
                    if (C2167.f7158 < 0) {
                        m6981 = (i4 - C2105.m6981("ܺ۠")) * 67;
                        i = ((m6981 ^ i3) * 21769) ^ 350995471;
                        i2 = 776010945;
                        i6 = m6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    m6981 = (C2105.m6981("ۡ᩵") + i3) * (-39);
                    i = ((m6981 ^ i4) * (-7411)) ^ 1811616337;
                    i2 = -556092610;
                    i6 = m6981 ^ i2;
                    str2 = str;
                    i5 = i;
                case 1220503219:
                case 1532417377:
                    i11 = 60;
                    i12 = 5;
                    if (ServiceConnectionC3453.m10564() > 0) {
                        m6981 = (i4 - C0630.m2566("᩺ۚ")) * (-3);
                        i = ((m6981 ^ i3) * (-25043)) ^ (-607817735);
                        i2 = 1832238880;
                        i6 = m6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
                    m6981 = C2105.m6981("᩺֡") ^ i3;
                    i = ((m6981 ^ i4) * 23105) ^ 1410330028;
                    i2 = 1276481475;
                    i6 = m6981 ^ i2;
                    str2 = str;
                    i5 = i;
                default:
                    m17725(str2, str3);
                    if (AbstractC2021.f6743 <= 0) {
                        int m256622222 = C0630.m2566("᩻᩷") ^ i3;
                        i6 = m256622222 ^ 1455680470;
                        i5 = ((m256622222 ^ i4) * (-25727)) ^ 2092003098;
                        str2 = str;
                    } else {
                        m6981 = (C0630.m2566("ۡᩳ") ^ i4) * 69;
                        i = ((m6981 ^ i3) * (-12801)) ^ (-599462118);
                        i2 = -165520993;
                        i6 = m6981 ^ i2;
                        str2 = str;
                        i5 = i;
                    }
            }
        }
    }

    public C6398(PluginContext pluginContext) {
        ArrayList arrayList = null;
        int i = -1721892258;
        int i2 = C22628.f73083;
        int i3 = C1294.f4556;
        int m6981 = (C2105.m6981("ܽۢ") + i2) * (-103);
        int i4 = ((m6981 ^ i3) * (-11917)) ^ 2037657984;
        int i5 = 18398808;
        while (true) {
            i = ((((i ^ i3) * 527) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2093430323:
                case -447531497:
                    if (C5695.f17556 >= 0) {
                        m6981 = C2105.m6981("ۚۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * 4247) ^ 1136569012;
                        i5 = -738858288;
                    } else {
                        m6981 = C0630.m2566("ܿۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 17769) ^ (-661522195);
                        i5 = -1519982130;
                    }
                case -2026669003:
                case -973302111:
                    if (C3746.f11829 <= 0) {
                        m6981 = (C2105.m6981("ۗ᩻") + i3) * (-113);
                        i4 = ((m6981 ^ i2) * (-21599)) ^ 215805112;
                        i5 = 1508735190;
                    } else {
                        m6981 = (i2 - C0630.m2566("ܰ᩺")) * (-117);
                        i4 = ((m6981 ^ i3) * (-31413)) ^ (-2120991065);
                        i5 = -855154868;
                    }
                case -1834445217:
                case 365884816:
                    this.f19801 = arrayList;
                    this.f19800 = pluginContext;
                    return;
                case -1349616925:
                case -1335583698:
                    if (C2105.f7037 != 0) {
                        m6981 = C0630.m2566("ܿۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 17769) ^ (-661522195);
                        i5 = -1519982130;
                    } else {
                        m6981 = C2105.m6981("֫ۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * 19903) ^ (-908057578);
                        i5 = -952073059;
                    }
                case -1304560487:
                case -434751628:
                    C1420.m4913();
                    m6981 = (C0630.m2566("᩶֫") ^ i3) * 39;
                    i4 = ((m6981 ^ i2) * (-30461)) ^ (-133314563);
                    i5 = 1432499859;
                case -1193467152:
                case 1703336618:
                    if (C3663.f11553) {
                        m6981 = C2105.m6981("ۚۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * 4247) ^ 1136569012;
                        i5 = -738858288;
                    } else {
                        m6981 = (C0630.m2566("᩶֫") ^ i3) * 39;
                        i4 = ((m6981 ^ i2) * (-30461)) ^ (-133314563);
                        i5 = 1432499859;
                    }
                case -908747149:
                case 1187668355:
                    if (C0382.f1805) {
                        m6981 = C2105.m6981("۟ܺ") ^ i3;
                        i4 = ((m6981 ^ i2) * 26641) ^ 2040745881;
                        i5 = 2057238231;
                    } else {
                        m6981 = C2105.m6981("ۚۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * 4247) ^ 1136569012;
                        i5 = -738858288;
                    }
                case -811368868:
                case 1745005616:
                    if (C3663.m11168() >= 0) {
                        m6981 = C0630.m2566("ܿۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 17769) ^ (-661522195);
                        i5 = -1519982130;
                    } else {
                        m6981 = C2105.m6981("ۚۛ") ^ i3;
                        i4 = ((m6981 ^ i2) * 25151) ^ 2111177251;
                        i5 = 1794440139;
                    }
                case -711549753:
                case 1104226173:
                    if (C2126.f7087) {
                        m6981 = C0630.m2566("ܿۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 17769) ^ (-661522195);
                        i5 = -1519982130;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܶۖ")) * (-5);
                        i4 = ((m6981 ^ i2) * 11557) ^ (-581356672);
                        i5 = 2146209722;
                    }
                case -404649559:
                case 1347654576:
                    arrayList = new ArrayList();
                    if (C1916.m6308() >= 0) {
                        m6981 = C0630.m2566("ܿۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 17769) ^ (-661522195);
                        i5 = -1519982130;
                    } else {
                        m6981 = C2105.m6981("֨ܺ") ^ i3;
                        i4 = ((m6981 ^ i2) * 26763) ^ (-2015632365);
                        i5 = 527211671;
                    }
                case -348881229:
                case -296502303:
                    if (C22628.f73083 <= 0) {
                        m6981 = C0630.m2566("᩵᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * 7157) ^ 244011304;
                        i5 = 1348899563;
                    } else {
                        m6981 = (C2105.m6981("᩸ۚ") + i2) * 73;
                        i4 = ((m6981 ^ i3) * 3111) ^ (-185150714);
                        i5 = 917129629;
                    }
                case -224185102:
                case 2105487448:
                    if (C2126.f7087) {
                        m6981 = C2105.m6981("ۚۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * 4247) ^ 1136569012;
                        i5 = -738858288;
                    } else {
                        m6981 = (C0630.m2566("֫ܰ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m6981 ^ i3) * 30833) ^ 1163888645;
                        i5 = 21332342;
                    }
                case -6235071:
                case 523757103:
                    C4117.m12364();
                    C3019.m9255();
                    throw new RuntimeException();
                case 175028333:
                case 737429952:
                    C7106.m19120();
                    if (C4616.f14690 > 0) {
                        m6981 = (C0630.m2566("᩶֫") ^ i3) * 39;
                        i4 = ((m6981 ^ i2) * (-30461)) ^ (-133314563);
                        i5 = 1432499859;
                    } else {
                        m6981 = C0630.m2566("᩵᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * 7157) ^ 244011304;
                        i5 = 1348899563;
                    }
                case 455521024:
                case 620248584:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = C0630.m2566("᩵᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * 7157) ^ 244011304;
                        i5 = 1348899563;
                    } else {
                        m6981 = (i3 - C2105.m6981("ᩴܰ")) * (-65);
                        i4 = ((m6981 ^ i2) * (-22159)) ^ 246657618;
                        i5 = 1865019908;
                    }
                default:
                    if (C11340.m28031()) {
                        m6981 = (C0630.m2566("ܿۤ") ^ i2) * (-15);
                        i4 = ((m6981 ^ i3) * 28529) ^ (-221955027);
                        i5 = -1854952827;
                    } else {
                        m6981 = (C2105.m6981("ۗ᩻") + i3) * (-113);
                        i4 = ((m6981 ^ i2) * (-21599)) ^ 215805112;
                        i5 = 1508735190;
                    }
            }
        }
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final void setLocalString(LocalString localString) {
        this.f19803 = localString;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder title(CharSequence charSequence) {
        this.f19806 = charSequence;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        if (l.C1504.f5354 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0074, code lost:
    
        if (l.C0714.m2805() != false) goto L17;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.plugin.api.preference.PluginPreference.Header addHeader(java.lang.CharSequence r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6398.addHeader(java.lang.CharSequence, java.lang.String):bin.mt.plugin.api.preference.PluginPreference$Header");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (l.C0964.f3626 == 0) goto L10;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.plugin.api.preference.PluginPreference.Text addText(java.lang.CharSequence r21) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6398.addText(java.lang.CharSequence):bin.mt.plugin.api.preference.PluginPreference$Text");
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder subtitle(CharSequence charSequence) {
        this.f19802 = charSequence;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b4, code lost:
    
        if (l.C5695.m16023() < 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0143, code lost:
    
        if (l.C4159.f13567 == false) goto L22;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m17726() {
        /*
            Method dump skipped, instructions count: 1634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6398.m17726():java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (l.C0382.f1805 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (l.C2520.f8000 >= 0) goto L8;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m17725(java.lang.Object r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6398.m17725(java.lang.Object, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (l.RunnableC0588.f2309 < 0) goto L14;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.plugin.api.preference.PluginPreference.Input addInput(java.lang.CharSequence r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6398.addInput(java.lang.CharSequence, java.lang.String):bin.mt.plugin.api.preference.PluginPreference$Input");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (l.C1711.f5919 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (l.C0237.f1507 != 0) goto L17;
     */
    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bin.mt.plugin.api.preference.PluginPreference.List addList(java.lang.CharSequence r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6398.addList(java.lang.CharSequence, java.lang.String):bin.mt.plugin.api.preference.PluginPreference$List");
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder onPreferenceChange(PluginPreference.OnPreferenceChangeListener onPreferenceChangeListener) {
        this.f19804 = onPreferenceChangeListener;
        return this;
    }

    @Override // bin.mt.plugin.api.preference.PluginPreference.Builder
    public final PluginPreference.Builder onCreated(PluginPreference.OnPreferenceScreenCreatedListener onPreferenceScreenCreatedListener) {
        this.f19805 = onPreferenceScreenCreatedListener;
        return this;
    }
}
