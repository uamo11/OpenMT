package l;

import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.translation.TranslationEngine;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.regex.Pattern;

/* compiled from: U7HQ */
/* renamed from: l.ܳ۟ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14382 {

    /* renamed from: ۗۤ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f43333 = {5155, 12562, 12668, 12669, 12660, 12657, 12661, 12657, 12652, 12669, 12650, 12631, 12650, 12657, 12671, 12657, 12662, 12665, 12660, 12592, 12593, 12578, 12562, 12620, 12650, 12665, 12662, 12651, 12660, 12665, 12652, 12669, 12668, 12592, 12620, 12650, 12665, 12662, 12651, 12660, 12665, 12652, 12657, 12663, 12662, 12600, 12670, 12665, 12657, 12660, 12669, 12668, 12578, 12600, 12598, 12598, 12598};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17205 f43334;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TranslationEngine f43335;

    public C14382(TranslationEngine translationEngine) {
        TranslationEngine.Configuration configuration = null;
        int i = -1420020520;
        int i2 = C0422.f1886;
        int i3 = C0630.f2410;
        int m2566 = C0630.m2566("ᩳܽ") ^ i3;
        int i4 = ((m2566 ^ i2) * 1353) ^ (-1149831526);
        int i5 = -650242924;
        while (true) {
            i = ((((i ^ i2) * 8865) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2087862024:
                case -1631356553:
                    this.f43335 = translationEngine;
                    configuration = translationEngine.getConfiguration();
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        m2566 = (C2105.m6981("ۢܽ") + i3) * 23;
                        i4 = ((m2566 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        m2566 = (C0630.m2566("ܰۢ") ^ i2) * (-21);
                        i4 = ((m2566 ^ i3) * 2501) ^ (-1550531222);
                        i5 = 919219343;
                    }
                case -1999200371:
                case -1356911697:
                    if (C1916.f6442) {
                        m2566 = (C0630.m2566("֨ܿ") + i2) * (-109);
                        i4 = ((m2566 ^ i3) * 30863) ^ (-957019217);
                        i5 = -1676365776;
                    } else {
                        m2566 = (C2105.m6981("ۜᩳ") ^ i3) * (-113);
                        i4 = ((m2566 ^ i2) * 30225) ^ (-664108010);
                        i5 = 1029571029;
                    }
                case -1872629430:
                case 2080434629:
                    if (C3432.f10845 >= 0) {
                        m2566 = (C2105.m6981("ۢܽ") + i3) * 23;
                        i4 = ((m2566 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        m2566 = (i2 - C2105.m6981("᩺ܰ")) * (-103);
                        i4 = ((m2566 ^ i3) * (-10981)) ^ 500736597;
                        i5 = 1920185630;
                    }
                case -1795082745:
                case -1033797666:
                    if (C4159.m12565() >= 0) {
                        m2566 = C0630.m2566("ۡۨ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-1451)) ^ (-1316263353);
                        i5 = -444987562;
                    } else {
                        m2566 = C0630.m2566("ܶ۟") ^ i3;
                        i4 = ((m2566 ^ i2) * (-26767)) ^ 1619368134;
                        i5 = -1693210553;
                    }
                case -1629209469:
                case 1663665764:
                    if (C4117.m12364() == 0) {
                        int i6 = configuration.maxTranslationTextLength;
                        if (RunnableC1937.f6483 < 0) {
                            this.f43334 = new C17205(this, i6, configuration.textLengthCalculator);
                            return;
                        }
                    }
                    m2566 = C0630.m2566("ۡۨ") ^ i3;
                    i4 = ((m2566 ^ i2) * (-1451)) ^ (-1316263353);
                    i5 = -444987562;
                case -1077267401:
                case -302296688:
                    C0050.m940();
                    if (C4263.m12819() >= 0) {
                        m2566 = (C2105.m6981("ۢܽ") + i3) * 23;
                        i4 = ((m2566 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        m2566 = (C2105.m6981("ۜᩳ") ^ i3) * (-113);
                        i4 = ((m2566 ^ i2) * 30225) ^ (-664108010);
                        i5 = 1029571029;
                    }
                case -1046240920:
                case 2046351840:
                    if (RunnableC1108.f4040) {
                        m2566 = C2105.m6981("᩵ۤ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-19975)) ^ (-585435769);
                        i5 = -892197629;
                    } else {
                        m2566 = C2105.m6981("۬֨") ^ i2;
                        i4 = ((m2566 ^ i3) * 21421) ^ 853028996;
                        i5 = 1697853529;
                    }
                case -988684822:
                case -785482014:
                    if (C7811.f24123 >= 0) {
                        m2566 = (C2105.m6981("ۢܽ") + i3) * 23;
                        i4 = ((m2566 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        m2566 = C2105.m6981("۬֨") ^ i2;
                        i4 = ((m2566 ^ i3) * 21421) ^ 853028996;
                        i5 = 1697853529;
                    }
                case -39810569:
                case 1313196162:
                    C1773.m5908();
                    m2566 = (C0630.m2566("ᩴۤ") ^ i2) * (-105);
                    i4 = ((m2566 ^ i3) * 16509) ^ (-48076900);
                    i5 = -1665410258;
                case -7206280:
                case 1415516933:
                    if (C4117.f13076 <= 0) {
                        m2566 = (C2105.m6981("ۜᩳ") ^ i3) * (-113);
                        i4 = ((m2566 ^ i2) * 30225) ^ (-664108010);
                        i5 = 1029571029;
                    } else {
                        m2566 = (C2105.m6981("۬ۚ") ^ i3) * 11;
                        i4 = ((m2566 ^ i2) * (-8755)) ^ 1102292230;
                        i5 = -1717136443;
                    }
                case 807335624:
                case 1411262217:
                    RunnableC1108.m3790();
                    C22628.m50615();
                    throw new RuntimeException();
                case 843217919:
                case 2111352676:
                    AbstractC2021.m6574();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = (C0630.m2566("ᩴۤ") ^ i2) * (-105);
                        i4 = ((m2566 ^ i3) * 16509) ^ (-48076900);
                        i5 = -1665410258;
                    } else {
                        m2566 = (C2105.m6981("ۢܽ") + i3) * 23;
                        i4 = ((m2566 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    }
                case 1559710814:
                case 2083828861:
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = (C2105.m6981("ۢܽ") + i3) * 23;
                        i4 = ((m2566 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        m2566 = C0630.m2566("ܰܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * 13745) ^ (-186436353);
                        i5 = 1577928970;
                    }
                default:
                    if (C3019.f9544 >= 0) {
                        m2566 = (C2105.m6981("ۢܽ") + i3) * 23;
                        i4 = ((m2566 ^ i2) * (-895)) ^ (-835251133);
                        i5 = 1807522229;
                    } else {
                        m2566 = (i2 - C0630.m2566("ܿܺ")) * 39;
                        i4 = ((m2566 ^ i3) * 2871) ^ (-1259251725);
                        i5 = -1466276690;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String[] m34353(String[] strArr, String str, String str2) {
        String str3;
        short[] sArr;
        String str4;
        StringBuilder sb;
        int m2566;
        int i;
        int i2;
        int i3;
        StringBuilder sb2;
        boolean z;
        int m6981;
        int i4;
        int i5;
        short[] sArr2;
        StringBuilder sb3;
        int m69812;
        int i6;
        int i7;
        String str5;
        String str6;
        String str7;
        boolean z2;
        StringBuilder sb4;
        int i8;
        int m69813;
        int i9;
        int i10;
        String str8;
        String str9;
        StringBuilder sb5;
        boolean z3;
        int m25662;
        int i11;
        int i12;
        int m69814;
        int i13;
        int i14;
        int i15 = ViewOnClickListenerC1958.f6529;
        int i16 = C3683.f11629;
        int m25663 = C0630.m2566("᩺᩹") ^ i16;
        int i17 = ((m25663 ^ i15) * 26071) ^ 1093874113;
        StringBuilder sb6 = null;
        TranslationEngine translationEngine = null;
        String[] strArr2 = null;
        PluginContext pluginContext = null;
        String str10 = null;
        StringBuilder sb7 = null;
        short[] sArr3 = null;
        int i18 = m25663 ^ 290245880;
        int i19 = 0;
        int i20 = 0;
        short s = 0;
        int i21 = 0;
        int i22 = 0;
        short s2 = 0;
        int i23 = 612616836;
        StringBuilder sb8 = null;
        boolean z4 = false;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        int i24 = 0;
        String str16 = null;
        short[] sArr4 = null;
        boolean z5 = false;
        while (true) {
            i23 = i18 ^ (i17 & (((i23 ^ i15) * 32207) >> 31));
            switch (i23) {
                case -2135303815:
                case 2036467907:
                    str8 = str15;
                    sArr2 = sArr4;
                    z3 = z4;
                    str9 = str14;
                    strArr2 = str16.split(str9, -1);
                    sb5 = sb8;
                    if (strArr2.length == strArr.length) {
                        m25662 = (i15 - C2105.m6981("۬֫")) * (-47);
                        i11 = ((m25662 ^ i16) * (-17529)) ^ 890339993;
                        i12 = -430881525;
                    } else {
                        m25662 = (C0630.m2566("ܽᩳ") + i16) * 5;
                        i11 = ((m25662 ^ i15) * 29755) ^ 1647709011;
                        i12 = -1790403187;
                    }
                    int i25 = m25662 ^ i12;
                    z4 = z3;
                    sb8 = sb5;
                    str15 = str8;
                    i18 = i25;
                    i17 = i11;
                    str14 = str9;
                    sArr4 = sArr2;
                case -1973653698:
                case -1808218152:
                    str3 = str15;
                    sArr2 = sArr4;
                    sb3 = sb8;
                    if (C0798.m3007(str16) > 100) {
                        m69812 = (C2105.m6981("᩻۬") ^ i15) * (-73);
                        i6 = ((m69812 ^ i16) * (-18491)) ^ 1748117964;
                        i7 = 1192910925;
                        int i26 = m69812 ^ i7;
                        sb8 = sb3;
                        i17 = i6;
                        sArr4 = sArr2;
                        str5 = str3;
                        i18 = i26;
                        str15 = str5;
                    } else {
                        str15 = str16;
                        int m25664 = (C0630.m2566("᩺ܶ") + i16) * 71;
                        i18 = m25664 ^ 12519117;
                        sb8 = sb3;
                        i17 = ((m25664 ^ i15) * 6957) ^ 318610051;
                        sArr4 = sArr2;
                    }
                case -1966393632:
                case -66395201:
                    C2167.m7155();
                    if (RunnableC1108.f4040) {
                        str3 = str15;
                        sArr2 = sArr4;
                        str6 = str11;
                        str7 = str14;
                        z2 = z4;
                        i8 = i24;
                        int m25665 = (i15 - C0630.m2566("֫ܿ")) * 25;
                        z4 = z2;
                        str14 = str7;
                        str15 = str3;
                        sArr4 = sArr2;
                        i18 = m25665 ^ (-752684022);
                        i17 = ((m25665 ^ i16) * (-10165)) ^ (-24145295);
                        i24 = i8;
                        str11 = str6;
                    } else {
                        m69814 = (i16 - C2105.m6981("ۘܽ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i13 = ((m69814 ^ i15) * (-14835)) ^ (-1005930684);
                        i14 = 346490297;
                        i18 = m69814 ^ i14;
                        i17 = i13;
                    }
                case -1922007279:
                case 1975571481:
                    C3245.m9923(sb7, C0798.m3005(sArr4, 54, 3, i20));
                    str15 = C0050.m947(sb7);
                    sArr2 = sArr4;
                    sb3 = sb8;
                    int m256642 = (C0630.m2566("᩺ܶ") + i16) * 71;
                    i18 = m256642 ^ 12519117;
                    sb8 = sb3;
                    i17 = ((m256642 ^ i15) * 6957) ^ 318610051;
                    sArr4 = sArr2;
                case -1909081316:
                case 872123146:
                    str3 = str15;
                    sArr2 = sArr4;
                    str6 = str11;
                    str7 = str14;
                    sb4 = sb8;
                    z2 = z4;
                    i8 = i24;
                    int i27 = s + s2;
                    if ((i27 * i27) - i22 <= 0) {
                        m69813 = (C0630.m2566("ܿ֡") + i15) * (-119);
                        i9 = ((m69813 ^ i16) * (-22273)) ^ (-1222316168);
                        i10 = 98015208;
                    } else {
                        m69813 = C2105.m6981("ۘ᩸") ^ i16;
                        i9 = ((m69813 ^ i15) * 13677) ^ 1440815585;
                        i10 = 773305853;
                    }
                    int i28 = m69813 ^ i10;
                    z4 = z2;
                    sb8 = sb4;
                    str15 = str3;
                    i18 = i28;
                    i17 = i9;
                    str14 = str7;
                    i24 = i8;
                    sArr4 = sArr2;
                    str11 = str6;
                case -1695375125:
                case 1650767066:
                    if (RunnableC0588.f2309 < 0) {
                        str3 = str15;
                        sArr = sArr4;
                        int m25666 = C0630.m2566("֫ܰ") ^ i15;
                        i = ((m25666 ^ i16) * 32137) ^ 1452213994;
                        i3 = m25666 ^ (-1159725487);
                        sArr4 = sArr;
                        str5 = str3;
                        i18 = i3;
                        i17 = i;
                        str15 = str5;
                    } else {
                        m69814 = (C2105.m6981("ܶۡ") ^ i16) * (-127);
                        i13 = ((m69814 ^ i15) * 11879) ^ (-2105638015);
                        i14 = 1284251695;
                        i18 = m69814 ^ i14;
                        i17 = i13;
                    }
                case -1567827589:
                case 1592095362:
                    str3 = str15;
                    sArr2 = sArr4;
                    str10 = C3245.m9934(f43333, 20, 3, i20);
                    sb3 = sb8;
                    C1420.m4905(sb3, str10);
                    C1420.m4905(sb3, str13);
                    if (C0714.f2697 >= 0) {
                        str6 = str11;
                        str7 = str14;
                        z2 = z4;
                        sb4 = sb3;
                        i8 = i24;
                        m69813 = C0630.m2566("۬ܶ") ^ i16;
                        i9 = ((m69813 ^ i15) * 10787) ^ 480570170;
                        i10 = -669470149;
                        int i282 = m69813 ^ i10;
                        z4 = z2;
                        sb8 = sb4;
                        str15 = str3;
                        i18 = i282;
                        i17 = i9;
                        str14 = str7;
                        i24 = i8;
                        sArr4 = sArr2;
                        str11 = str6;
                    } else {
                        m69812 = (i16 - C2105.m6981("᩷ۜ")) * (-27);
                        i6 = ((m69812 ^ i15) * 6463) ^ (-331587974);
                        i7 = -358410502;
                        int i262 = m69812 ^ i7;
                        sb8 = sb3;
                        i17 = i6;
                        sArr4 = sArr2;
                        str5 = str3;
                        i18 = i262;
                        str15 = str5;
                    }
                case -1444956818:
                case -643044757:
                    str3 = str15;
                    sArr2 = sArr4;
                    str6 = str11;
                    str7 = str14;
                    sb4 = sb8;
                    z2 = z4;
                    i8 = i24;
                    s = sArr3[0];
                    i21 = s * s;
                    if (C0964.f3626 == 0) {
                        m69813 = C0630.m2566("ۡ᩶") ^ i16;
                        i9 = ((m69813 ^ i15) * 25793) ^ 1615148903;
                        i10 = 830822296;
                        int i2822 = m69813 ^ i10;
                        z4 = z2;
                        sb8 = sb4;
                        str15 = str3;
                        i18 = i2822;
                        i17 = i9;
                        str14 = str7;
                        i24 = i8;
                        sArr4 = sArr2;
                        str11 = str6;
                    }
                    m69813 = C0630.m2566("۬ܶ") ^ i16;
                    i9 = ((m69813 ^ i15) * 10787) ^ 480570170;
                    i10 = -669470149;
                    int i28222 = m69813 ^ i10;
                    z4 = z2;
                    sb8 = sb4;
                    str15 = str3;
                    i18 = i28222;
                    i17 = i9;
                    str14 = str7;
                    i24 = i8;
                    sArr4 = sArr2;
                    str11 = str6;
                case -1396389757:
                case -107306086:
                    str3 = str15;
                    sArr = sArr4;
                    sb2 = sb8;
                    z = z4;
                    sb6.append((CharSequence) strArr[i24]);
                    i19 = 1;
                    m6981 = (C0630.m2566("᩸ܿ") ^ i16) * 127;
                    i4 = ((m6981 ^ i15) * 5841) ^ 1838380476;
                    i5 = 781491232;
                    int i29 = m6981 ^ i5;
                    sb8 = sb2;
                    z4 = z;
                    i17 = i4;
                    str15 = str3;
                    sArr4 = sArr;
                    i18 = i29;
                case -1371784948:
                case 1170687678:
                    str3 = str15;
                    sArr2 = sArr4;
                    sb4 = sb8;
                    z2 = z4;
                    str13 = C0422.m1959(sb6);
                    TranslationEngine translationEngine2 = this.f43335;
                    String translate = translationEngine2.translate(str13, str, str2);
                    String quote = Pattern.quote(str12);
                    if (C1504.m5179()) {
                        int m25667 = C0630.m2566("ܺ᩹") ^ i15;
                        i17 = ((m25667 ^ i16) * (-8601)) ^ 1020494041;
                        int i30 = m25667 ^ 759256715;
                        str16 = translate;
                        sArr4 = sArr2;
                        translationEngine = translationEngine2;
                        z4 = z2;
                        str15 = str3;
                        i18 = i30;
                        sb8 = sb4;
                        str14 = quote;
                    } else {
                        str16 = translate;
                        str7 = quote;
                        translationEngine = translationEngine2;
                        str6 = str11;
                        i8 = i24;
                        m69813 = C0630.m2566("۬ܶ") ^ i16;
                        i9 = ((m69813 ^ i15) * 10787) ^ 480570170;
                        i10 = -669470149;
                        int i282222 = m69813 ^ i10;
                        z4 = z2;
                        sb8 = sb4;
                        str15 = str3;
                        i18 = i282222;
                        i17 = i9;
                        str14 = str7;
                        i24 = i8;
                        sArr4 = sArr2;
                        str11 = str6;
                    }
                case -1170443643:
                case -422300119:
                    str3 = str15;
                    sArr2 = sArr4;
                    str6 = str11;
                    str7 = str14;
                    sb4 = sb8;
                    z2 = z4;
                    i8 = i24;
                    i20 = 12568;
                    m69813 = C2105.m6981("᩶᩸") ^ i15;
                    i9 = ((m69813 ^ i16) * (-25093)) ^ (-382495871);
                    i10 = 351367285;
                    int i2822222 = m69813 ^ i10;
                    z4 = z2;
                    sb8 = sb4;
                    str15 = str3;
                    i18 = i2822222;
                    i17 = i9;
                    str14 = str7;
                    i24 = i8;
                    sArr4 = sArr2;
                    str11 = str6;
                case -1160881532:
                case -457938031:
                    str3 = str15;
                    sArr = sArr4;
                    str4 = str14;
                    sb = sb8;
                    sb6 = new StringBuilder();
                    z4 = true;
                    if (strArr.length > 0) {
                        m2566 = (C0630.m2566("ܿ᩷") ^ i16) * 119;
                        i = ((m2566 ^ i15) * (-11495)) ^ (-1529630547);
                        i2 = 1397146745;
                        i3 = m2566 ^ i2;
                        sb8 = sb;
                        str14 = str4;
                        sArr4 = sArr;
                        str5 = str3;
                        i18 = i3;
                        i17 = i;
                        str15 = str5;
                    }
                    m2566 = (C2105.m6981("᩹ۙ") ^ i15) * (-9);
                    i = ((m2566 ^ i16) * 30927) ^ 2040671990;
                    i2 = -1528407139;
                    i3 = m2566 ^ i2;
                    sb8 = sb;
                    str14 = str4;
                    sArr4 = sArr;
                    str5 = str3;
                    i18 = i3;
                    i17 = i;
                    str15 = str5;
                case -989693504:
                case -950470904:
                    str3 = str15;
                    sArr2 = sArr4;
                    str6 = str11;
                    str7 = str14;
                    sb4 = sb8;
                    z2 = z4;
                    i8 = i24;
                    int i31 = i21 + 1527696;
                    i22 = i31 + i31;
                    s2 = 1236;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        sb8 = sb4;
                        int m256652 = (i15 - C0630.m2566("֫ܿ")) * 25;
                        z4 = z2;
                        str14 = str7;
                        str15 = str3;
                        sArr4 = sArr2;
                        i18 = m256652 ^ (-752684022);
                        i17 = ((m256652 ^ i16) * (-10165)) ^ (-24145295);
                        i24 = i8;
                        str11 = str6;
                    } else {
                        m69813 = C2105.m6981("ۜۡ") ^ i16;
                        i9 = ((m69813 ^ i15) * (-1091)) ^ (-601456331);
                        i10 = -948137630;
                        int i28222222 = m69813 ^ i10;
                        z4 = z2;
                        sb8 = sb4;
                        str15 = str3;
                        i18 = i28222222;
                        i17 = i9;
                        str14 = str7;
                        i24 = i8;
                        sArr4 = sArr2;
                        str11 = str6;
                    }
                case -886495778:
                case -285414269:
                    if (C2958.f9394 < 0) {
                        str3 = str15;
                        sArr2 = sArr4;
                        str6 = str11;
                        str7 = str14;
                        z2 = z4;
                        i8 = i24;
                        int m2566522 = (i15 - C0630.m2566("֫ܿ")) * 25;
                        z4 = z2;
                        str14 = str7;
                        str15 = str3;
                        sArr4 = sArr2;
                        i18 = m2566522 ^ (-752684022);
                        i17 = ((m2566522 ^ i16) * (-10165)) ^ (-24145295);
                        i24 = i8;
                        str11 = str6;
                    } else {
                        m69814 = (C2105.m6981("ܿ۠") + i15) * 17;
                        i13 = ((m69814 ^ i16) * (-31035)) ^ 754576054;
                        i14 = 1785177223;
                        i18 = m69814 ^ i14;
                        i17 = i13;
                    }
                case -863203562:
                case 748662300:
                    C3663.m11168();
                    if (C4616.m13552() == 0) {
                        str3 = str15;
                        sArr2 = sArr4;
                        int m69815 = (C2105.m6981("ۗܰ") ^ i15) * (-45);
                        i = ((m69815 ^ i16) * 23053) ^ (-1059144182);
                        i3 = m69815 ^ (-1355806111);
                        sArr4 = sArr2;
                        sb8 = null;
                        str5 = str3;
                        i18 = i3;
                        i17 = i;
                        str15 = str5;
                    }
                    str3 = str15;
                    sArr = sArr4;
                    int m256662 = C0630.m2566("֫ܰ") ^ i15;
                    i = ((m256662 ^ i16) * 32137) ^ 1452213994;
                    i3 = m256662 ^ (-1159725487);
                    sArr4 = sArr;
                    str5 = str3;
                    i18 = i3;
                    i17 = i;
                    str15 = str5;
                case -768381614:
                case -150941863:
                    throw new IOException(C20094.m46315(RunnableC0588.m2436(f43333, 34, 20, i20), str15));
                case -684549495:
                case -593044814:
                    pluginContext.log(C0050.m947(sb8));
                    short[] sArr5 = f43333;
                    if (C1711.f5919) {
                        str3 = str15;
                        sArr2 = sArr4;
                        str6 = str11;
                        str7 = str14;
                        z2 = z4;
                        i8 = i24;
                        int m25665222 = (i15 - C0630.m2566("֫ܿ")) * 25;
                        z4 = z2;
                        str14 = str7;
                        str15 = str3;
                        sArr4 = sArr2;
                        i18 = m25665222 ^ (-752684022);
                        i17 = ((m25665222 ^ i16) * (-10165)) ^ (-24145295);
                        i24 = i8;
                        str11 = str6;
                    } else {
                        str3 = str15;
                        sArr = sArr4;
                        String m4902 = C1420.m4902(sArr5, 23, 11, i20);
                        if (C0422.f1886 <= 0) {
                            int m2566622 = C0630.m2566("֫ܰ") ^ i15;
                            i = ((m2566622 ^ i16) * 32137) ^ 1452213994;
                            i3 = m2566622 ^ (-1159725487);
                            sArr4 = sArr;
                            str5 = str3;
                            i18 = i3;
                            i17 = i;
                            str15 = str5;
                        } else {
                            StringBuilder sb9 = new StringBuilder(m4902);
                            C0422.m1944(sb9, strArr2.length);
                            C3245.m9923(sb9, str10);
                            C1420.m4905(sb9, str16);
                            pluginContext.log(C0422.m1959(sb9));
                            sb2 = sb8;
                            z = z4;
                            m6981 = C2105.m6981("᩹᩺") ^ i16;
                            i4 = ((m6981 ^ i15) * 29803) ^ (-79947249);
                            i5 = 1622952212;
                            int i292 = m6981 ^ i5;
                            sb8 = sb2;
                            z4 = z;
                            i17 = i4;
                            str15 = str3;
                            sArr4 = sArr;
                            i18 = i292;
                        }
                    }
                case -683634343:
                case 1204816287:
                    str3 = str15;
                    sArr = sArr4;
                    sb2 = sb8;
                    z = z4;
                    pluginContext = translationEngine.getContext();
                    if (pluginContext != null) {
                        m6981 = (C0630.m2566("ۗᩳ") + i15) * 39;
                        i4 = ((m6981 ^ i16) * 16293) ^ 704117523;
                        i5 = -595525808;
                        int i2922 = m6981 ^ i5;
                        sb8 = sb2;
                        z4 = z;
                        i17 = i4;
                        str15 = str3;
                        sArr4 = sArr;
                        i18 = i2922;
                    }
                    m6981 = C2105.m6981("᩹᩺") ^ i16;
                    i4 = ((m6981 ^ i15) * 29803) ^ (-79947249);
                    i5 = 1622952212;
                    int i29222 = m6981 ^ i5;
                    sb8 = sb2;
                    z4 = z;
                    i17 = i4;
                    str15 = str3;
                    sArr4 = sArr;
                    i18 = i29222;
                case -628057424:
                case -107075677:
                    str3 = str15;
                    sArr2 = sArr4;
                    str6 = str11;
                    str7 = str14;
                    sb4 = sb8;
                    z2 = z4;
                    i8 = i24;
                    i20 = 64224;
                    m69813 = C2105.m6981("᩶᩸") ^ i15;
                    i9 = ((m69813 ^ i16) * (-25093)) ^ (-382495871);
                    i10 = 351367285;
                    int i282222222 = m69813 ^ i10;
                    z4 = z2;
                    sb8 = sb4;
                    str15 = str3;
                    i18 = i282222222;
                    i17 = i9;
                    str14 = str7;
                    i24 = i8;
                    sArr4 = sArr2;
                    str11 = str6;
                case -523837599:
                case -515648384:
                    str8 = str15;
                    sArr2 = sArr4;
                    z3 = z4;
                    str11 = m34351(z3, strArr);
                    str9 = str14;
                    z5 = true;
                    sb5 = sb8;
                    m25662 = C2105.m6981("ۢܶ") ^ i15;
                    i11 = ((m25662 ^ i16) * (-11813)) ^ (-1139755876);
                    i12 = 1000090268;
                    int i252 = m25662 ^ i12;
                    z4 = z3;
                    sb8 = sb5;
                    str15 = str8;
                    i18 = i252;
                    i17 = i11;
                    str14 = str9;
                    sArr4 = sArr2;
                case -464789631:
                case 144373266:
                    C3245.m9925();
                    return null;
                case -439860694:
                case 1152003256:
                    str3 = str15;
                    sArr2 = sArr4;
                    str6 = str11;
                    str7 = str14;
                    sb4 = sb8;
                    z2 = z4;
                    i8 = i24;
                    sArr3 = f43333;
                    if (!C21923.m49329()) {
                        m69813 = (i15 - C2105.m6981("ۙۚ")) * 75;
                        i9 = ((m69813 ^ i16) * 11773) ^ (-2125248730);
                        i10 = 267344924;
                        int i2822222222 = m69813 ^ i10;
                        z4 = z2;
                        sb8 = sb4;
                        str15 = str3;
                        i18 = i2822222222;
                        i17 = i9;
                        str14 = str7;
                        i24 = i8;
                        sArr4 = sArr2;
                        str11 = str6;
                    }
                    m69813 = C0630.m2566("۬ܶ") ^ i16;
                    i9 = ((m69813 ^ i15) * 10787) ^ 480570170;
                    i10 = -669470149;
                    int i28222222222 = m69813 ^ i10;
                    z4 = z2;
                    sb8 = sb4;
                    str15 = str3;
                    i18 = i28222222222;
                    i17 = i9;
                    str14 = str7;
                    i24 = i8;
                    sArr4 = sArr2;
                    str11 = str6;
                case -386903175:
                case 1808534643:
                    return strArr2;
                case -325283297:
                case -58768215:
                    if (C0382.m1848()) {
                        m69814 = (C2105.m6981("ܿ۠") + i15) * 17;
                        i13 = ((m69814 ^ i16) * (-31035)) ^ 754576054;
                        i14 = 1785177223;
                        i18 = m69814 ^ i14;
                        i17 = i13;
                    } else {
                        str3 = str15;
                        sArr = sArr4;
                        int m25666222 = C0630.m2566("֫ܰ") ^ i15;
                        i = ((m25666222 ^ i16) * 32137) ^ 1452213994;
                        i3 = m25666222 ^ (-1159725487);
                        sArr4 = sArr;
                        str5 = str3;
                        i18 = i3;
                        i17 = i;
                        str15 = str5;
                    }
                case -265168645:
                case 1668056822:
                    str3 = str15;
                    sArr = sArr4;
                    sb2 = sb8;
                    z = z4;
                    if (i19 < strArr.length) {
                        m6981 = (C2105.m6981("ᩳܽ") ^ i15) * (-55);
                        i4 = ((m6981 ^ i16) * 18821) ^ (-1734260868);
                        i5 = -497128415;
                        int i292222 = m6981 ^ i5;
                        sb8 = sb2;
                        z4 = z;
                        i17 = i4;
                        str15 = str3;
                        sArr4 = sArr;
                        i18 = i292222;
                    } else {
                        z4 = z;
                        str4 = str14;
                        sb = sb2;
                        m2566 = (C2105.m6981("᩹ۙ") ^ i15) * (-9);
                        i = ((m2566 ^ i16) * 30927) ^ 2040671990;
                        i2 = -1528407139;
                        i3 = m2566 ^ i2;
                        sb8 = sb;
                        str14 = str4;
                        sArr4 = sArr;
                        str5 = str3;
                        i18 = i3;
                        i17 = i;
                        str15 = str5;
                    }
                case -80951375:
                case 1598331846:
                    RunnableC3474.m10630();
                    str3 = str15;
                    sArr2 = sArr4;
                    str6 = str11;
                    str7 = str14;
                    z2 = z4;
                    i8 = i24;
                    int m256652222 = (i15 - C0630.m2566("֫ܿ")) * 25;
                    z4 = z2;
                    str14 = str7;
                    str15 = str3;
                    sArr4 = sArr2;
                    i18 = m256652222 ^ (-752684022);
                    i17 = ((m256652222 ^ i16) * (-10165)) ^ (-24145295);
                    i24 = i8;
                    str11 = str6;
                case -45427431:
                case 1874809407:
                    str3 = str15;
                    sArr2 = sArr4;
                    str7 = str14;
                    sb4 = sb8;
                    z2 = z4;
                    String m12252 = C4075.m12252(f43333, 1, 1, i20);
                    str6 = str11;
                    str12 = C4860.m14172(m12252, str6, m12252);
                    if (str12 != null) {
                        m69813 = (C0630.m2566("ܰ᩶") ^ i16) * (-61);
                        i8 = i24;
                        i9 = ((m69813 ^ i15) * 25915) ^ (-902950105);
                        i10 = 17376709;
                    } else {
                        i8 = i24;
                        m69813 = C2105.m6981("ᩳۧ") ^ i16;
                        i9 = ((m69813 ^ i15) * (-12145)) ^ (-2089595647);
                        i10 = 670794939;
                    }
                    int i282222222222 = m69813 ^ i10;
                    z4 = z2;
                    sb8 = sb4;
                    str15 = str3;
                    i18 = i282222222222;
                    i17 = i9;
                    str14 = str7;
                    i24 = i8;
                    sArr4 = sArr2;
                    str11 = str6;
                case 123111432:
                case 1168639783:
                    sb7 = new StringBuilder();
                    C3245.m9923(sb7, C11340.m28015(str16, i24, 99));
                    sArr4 = f43333;
                    if (C1294.f4556 < 0) {
                        m69814 = C0630.m2566("ۨ᩺") ^ i16;
                        i13 = ((m69814 ^ i15) * (-9169)) ^ (-1584798928);
                        i14 = -2125994650;
                        i18 = m69814 ^ i14;
                        i17 = i13;
                    }
                    m69814 = (C2105.m6981("ܶۡ") ^ i16) * (-127);
                    i13 = ((m69814 ^ i15) * 11879) ^ (-2105638015);
                    i14 = 1284251695;
                    i18 = m69814 ^ i14;
                    i17 = i13;
                case 219325973:
                case 328851790:
                    str3 = str15;
                    sArr2 = sArr4;
                    String m6435 = ViewOnClickListenerC1958.m6435(f43333, 11, 9, i20);
                    if (C1711.f5919) {
                        int m698152 = (C2105.m6981("ۗܰ") ^ i15) * (-45);
                        i = ((m698152 ^ i16) * 23053) ^ (-1059144182);
                        i3 = m698152 ^ (-1355806111);
                        sArr4 = sArr2;
                        sb8 = null;
                        str5 = str3;
                        i18 = i3;
                        i17 = i;
                        str15 = str5;
                    } else {
                        sb3 = new StringBuilder(m6435);
                        C0050.m945(sb3, strArr.length);
                        if (C4616.f14690 <= 0) {
                            sb8 = sb3;
                            str6 = str11;
                            str7 = str14;
                            z2 = z4;
                            i8 = i24;
                            int m2566522222 = (i15 - C0630.m2566("֫ܿ")) * 25;
                            z4 = z2;
                            str14 = str7;
                            str15 = str3;
                            sArr4 = sArr2;
                            i18 = m2566522222 ^ (-752684022);
                            i17 = ((m2566522222 ^ i16) * (-10165)) ^ (-24145295);
                            i24 = i8;
                            str11 = str6;
                        } else {
                            m69812 = (C0630.m2566("᩹ۤ") ^ i15) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i6 = ((m69812 ^ i16) * 7283) ^ (-698873766);
                            i7 = -2132125561;
                            int i2622 = m69812 ^ i7;
                            sb8 = sb3;
                            i17 = i6;
                            sArr4 = sArr2;
                            str5 = str3;
                            i18 = i2622;
                            str15 = str5;
                        }
                    }
                case 245611748:
                case 273525328:
                    str3 = str15;
                    sArr = sArr4;
                    sb2 = sb8;
                    sb6.append((CharSequence) str12);
                    sb6.append((CharSequence) strArr[i19]);
                    i19++;
                    z = z4;
                    m6981 = (C0630.m2566("᩸ܿ") ^ i16) * 127;
                    i4 = ((m6981 ^ i15) * 5841) ^ 1838380476;
                    i5 = 781491232;
                    int i2922222 = m6981 ^ i5;
                    sb8 = sb2;
                    z4 = z;
                    i17 = i4;
                    str15 = str3;
                    sArr4 = sArr;
                    i18 = i2922222;
                case 1087478400:
                case 2011099529:
                    str8 = str15;
                    sArr2 = sArr4;
                    str9 = str14;
                    sb5 = sb8;
                    z3 = z4;
                    str11 = m34351(false, strArr);
                    i24 = 0;
                    z5 = false;
                    m25662 = C2105.m6981("ۢܶ") ^ i15;
                    i11 = ((m25662 ^ i16) * (-11813)) ^ (-1139755876);
                    i12 = 1000090268;
                    int i2522 = m25662 ^ i12;
                    z4 = z3;
                    sb8 = sb5;
                    str15 = str8;
                    i18 = i2522;
                    i17 = i11;
                    str14 = str9;
                    sArr4 = sArr2;
                case 1407398466:
                case 1527913273:
                    str3 = str15;
                    sArr = sArr4;
                    sb2 = sb8;
                    z = z4;
                    if (z5) {
                        m6981 = C2105.m6981("᩷۟") ^ i15;
                        i4 = ((m6981 ^ i16) * (-27441)) ^ (-604014392);
                        i5 = -2090856922;
                    } else {
                        m6981 = (i16 - C2105.m6981("ܽ֫")) * 15;
                        i4 = ((m6981 ^ i15) * (-11687)) ^ 1098876119;
                        i5 = -1289732752;
                    }
                    int i29222222 = m6981 ^ i5;
                    sb8 = sb2;
                    z4 = z;
                    i17 = i4;
                    str15 = str3;
                    sArr4 = sArr;
                    i18 = i29222222;
                default:
                    throw new NullPointerException(C11340.m28025(f43333, 2, 9, i20));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17205 m34352() {
        return this.f43334;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if (l.C3746.f11829 <= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (l.C3911.f12484 < 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (l.C1128.m3851() > 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0054, code lost:
    
        if (l.C4616.f14690 > 0) goto L80;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m34351(boolean r21, java.lang.String[] r22) {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14382.m34351(boolean, java.lang.String[]):java.lang.String");
    }
}
