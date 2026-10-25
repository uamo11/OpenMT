package l;

import bin.mt.plugin.api.translation.BatchTranslationEngine;
import bin.mt.plugin.api.translation.TranslationEngine;
import java.util.Arrays;

/* compiled from: U7HQ */
/* renamed from: l.ܿ۟ܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17205 implements BatchTranslationEngine.BatchingStrategy {

    /* renamed from: ֨ۘܺ, reason: not valid java name and contains not printable characters */
    private static final short[] f52747 = {9519, -3379};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f52748;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f52749;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f52750;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52751;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f52752;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f52753;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f52754;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f52755;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TranslationEngine.TextLengthCalculator f52756;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f52757;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m40465(char c, int i) {
        int m6981;
        int i2;
        int i3;
        String str;
        int m2566;
        int i4;
        int i5;
        String str2 = null;
        String str3 = null;
        TranslationEngine.TextLengthCalculator textLengthCalculator = null;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short[] sArr = null;
        int i10 = 1983134576;
        int i11 = C2520.f8000;
        int i12 = ViewOnClickListenerC1958.f6529;
        int m25662 = C0630.m2566("ܺ᩷") ^ i12;
        int i13 = ((m25662 ^ i11) * 24201) ^ 383750967;
        int i14 = m25662 ^ (-550905155);
        short[] sArr2 = null;
        while (true) {
            String str4 = null;
            while (true) {
                i10 = i14 ^ (i13 & (((i10 ^ i11) * 7345) >> 31));
                switch (i10) {
                    case -2111631477:
                    case -799166731:
                        C4159.m12565();
                        return 0;
                    case -2022256284:
                    case -1158697256:
                        str2 = C4616.m13542(sArr, 1, 1, i9);
                        if (C1047.f3863 >= 0) {
                            m2566 = (C0630.m2566("ܶܿ") + i12) * 29;
                            str = str2;
                            i4 = ((m2566 ^ i11) * 27035) ^ (-1651711954);
                            i5 = 1221946316;
                            i14 = m2566 ^ i5;
                            i13 = i4;
                            str2 = str;
                        } else {
                            m6981 = C2105.m6981("ۧۙ") ^ i12;
                            i2 = ((m6981 ^ i11) * (-14405)) ^ 1658746967;
                            i3 = -135658218;
                            int i15 = i2;
                            i14 = m6981 ^ i3;
                            i13 = i15;
                        }
                    case -1962244873:
                    case -176468530:
                        str = str2;
                        if (C0714.f2697 < 0) {
                            m2566 = (C0630.m2566("ܽۗ") + i11) * 43;
                            i4 = ((m2566 ^ i12) * (-14899)) ^ (-1997043752);
                            i5 = -1136908;
                            i14 = m2566 ^ i5;
                            i13 = i4;
                            str2 = str;
                        }
                        str2 = str;
                        m2566 = (C0630.m2566("ܶܿ") + i12) * 29;
                        str = str2;
                        i4 = ((m2566 ^ i11) * 27035) ^ (-1651711954);
                        i5 = 1221946316;
                        i14 = m2566 ^ i5;
                        i13 = i4;
                        str2 = str;
                    case -1959077330:
                    case 1152863039:
                        str = str2;
                        if (C0382.f1805) {
                            m2566 = (i12 - C0630.m2566("ܽܽ")) * (-43);
                            i4 = ((m2566 ^ i11) * 207) ^ (-2142233243);
                            i5 = 56114292;
                            i14 = m2566 ^ i5;
                            i13 = i4;
                            str2 = str;
                        }
                        m2566 = (i12 - C2105.m6981("ۚۛ")) * 31;
                        i4 = ((m2566 ^ i11) * 3269) ^ (-1121443585);
                        i5 = -2016040762;
                        i14 = m2566 ^ i5;
                        i13 = i4;
                        str2 = str;
                    case -1700484983:
                    case 605556182:
                        i9 = 56903;
                        m2566 = (C0630.m2566("۟᩵") ^ i11) * (-25);
                        str = str2;
                        i4 = ((m2566 ^ i12) * 19147) ^ (-2090928827);
                        i5 = 163839406;
                        i14 = m2566 ^ i5;
                        i13 = i4;
                        str2 = str;
                    case -1547076109:
                    case -791564817:
                        str3 = C4860.m14172(str2, str4, str2);
                        textLengthCalculator = this.f52756;
                        if (textLengthCalculator != null) {
                            int m69812 = C2105.m6981("᩺ۤ") ^ i11;
                            i13 = ((m69812 ^ i12) * (-26769)) ^ (-9099524);
                            i14 = m69812 ^ (-1373200099);
                        } else {
                            m6981 = C2105.m6981("ۛ۫") ^ i12;
                            i2 = ((m6981 ^ i11) * 14207) ^ 850273195;
                            i3 = 1555956785;
                            int i152 = i2;
                            i14 = m6981 ^ i3;
                            i13 = i152;
                        }
                    case -1380355306:
                    case 1429983232:
                        char[] cArr = new char[i];
                        Arrays.fill(cArr, c);
                        if (C2272.f7362) {
                            break;
                        }
                        String str5 = new String(cArr);
                        sArr = f52747;
                        if (C2105.f7037 != 0) {
                            str4 = str5;
                            m2566 = (C0630.m2566("ܶܿ") + i12) * 29;
                            str = str2;
                            i4 = ((m2566 ^ i11) * 27035) ^ (-1651711954);
                            i5 = 1221946316;
                            i14 = m2566 ^ i5;
                            i13 = i4;
                            str2 = str;
                        } else {
                            int m25663 = (C0630.m2566("ܿ۠") ^ i11) * 47;
                            i13 = ((m25663 ^ i12) * 6253) ^ (-573288192);
                            i14 = m25663 ^ 432760515;
                            str4 = str5;
                        }
                        break;
                    case -1209795316:
                    case 1040019301:
                        C1773.m5908();
                        if (C0630.f2410 > 0) {
                            m6981 = (C2105.m6981("ܳۛ") ^ i11) * 31;
                            i2 = ((m6981 ^ i12) * 19421) ^ (-2011334887);
                            i3 = 951858129;
                            int i1522 = i2;
                            i14 = m6981 ^ i3;
                            i13 = i1522;
                        } else {
                            str = str2;
                            m2566 = (C2105.m6981("᩹֡") ^ i12) * 93;
                            i4 = ((m2566 ^ i11) * (-3669)) ^ 1065461126;
                            i5 = -250668448;
                            i14 = m2566 ^ i5;
                            i13 = i4;
                            str2 = str;
                        }
                    case -1178404435:
                    case 296065749:
                        i9 = 62151;
                        m2566 = (C0630.m2566("۟᩵") ^ i11) * (-25);
                        str = str2;
                        i4 = ((m2566 ^ i12) * 19147) ^ (-2090928827);
                        i5 = 163839406;
                        i14 = m2566 ^ i5;
                        i13 = i4;
                        str2 = str;
                    case -1057565492:
                    case -276003010:
                        if (!C3663.f11553) {
                            break;
                        }
                        str = str2;
                        m2566 = (C2105.m6981("᩹֡") ^ i12) * 93;
                        i4 = ((m2566 ^ i11) * (-3669)) ^ 1065461126;
                        i5 = -250668448;
                        i14 = m2566 ^ i5;
                        i13 = i4;
                        str2 = str;
                        break;
                    case -1044707724:
                    case 272863448:
                        str = str2;
                        int i16 = i7 + i8;
                        if ((i16 + i16) - i6 >= 0) {
                            m2566 = C2105.m6981("ۡ᩷") ^ i11;
                            i4 = ((m2566 ^ i12) * (-13881)) ^ 224646379;
                            i5 = -1711162057;
                        } else {
                            m2566 = (C0630.m2566("۟ۚ") + i12) * (-101);
                            i4 = ((m2566 ^ i11) * 17491) ^ (-1772931863);
                            i5 = 1463668847;
                        }
                        i14 = m2566 ^ i5;
                        i13 = i4;
                        str2 = str;
                    case -842399892:
                    case 1141195431:
                        str = str2;
                        sArr2 = f52747;
                        if (RunnableC0588.m2441() < 0) {
                            m2566 = (i12 - C2105.m6981("֡᩶")) * (-121);
                            i4 = ((m2566 ^ i11) * (-17427)) ^ 1018063113;
                            i5 = -848409684;
                            i14 = m2566 ^ i5;
                            i13 = i4;
                            str2 = str;
                        }
                        m2566 = (i12 - C2105.m6981("ۚۛ")) * 31;
                        i4 = ((m2566 ^ i11) * 3269) ^ (-1121443585);
                        i5 = -2016040762;
                        i14 = m2566 ^ i5;
                        i13 = i4;
                        str2 = str;
                    case -820913546:
                    case 831040501:
                        str = str2;
                        int i17 = s + s2;
                        i6 = i17 * i17;
                        i7 = s * s;
                        if (C11340.m28031()) {
                            m2566 = (C2105.m6981("ۡۘ") ^ i11) * (-89);
                            i4 = ((m2566 ^ i12) * (-2279)) ^ 2133776987;
                            i5 = 1648524199;
                            i14 = m2566 ^ i5;
                            i13 = i4;
                            str2 = str;
                        }
                        str2 = str;
                        m2566 = (C0630.m2566("ܶܿ") + i12) * 29;
                        str = str2;
                        i4 = ((m2566 ^ i11) * 27035) ^ (-1651711954);
                        i5 = 1221946316;
                        i14 = m2566 ^ i5;
                        i13 = i4;
                        str2 = str;
                    case -435756616:
                    case 2127990339:
                        C3911.m11924();
                        C7106.m19120();
                        m6981 = (C2105.m6981("ܳۛ") ^ i11) * 31;
                        i2 = ((m6981 ^ i12) * 19421) ^ (-2011334887);
                        i3 = 951858129;
                        int i15222 = i2;
                        i14 = m6981 ^ i3;
                        i13 = i15222;
                    case -152562078:
                    case 2012709625:
                        str = str2;
                        s = sArr2[0];
                        s2 = 10054;
                        if (AbstractC2021.f6743 > 0) {
                            m2566 = (C0630.m2566("֨ۚ") ^ i12) * (-109);
                            i4 = ((m2566 ^ i11) * 19057) ^ (-343496744);
                            i5 = -503281239;
                            i14 = m2566 ^ i5;
                            i13 = i4;
                            str2 = str;
                        }
                        str2 = str;
                        m2566 = (C0630.m2566("ܶܿ") + i12) * 29;
                        str = str2;
                        i4 = ((m2566 ^ i11) * 27035) ^ (-1651711954);
                        i5 = 1221946316;
                        i14 = m2566 ^ i5;
                        i13 = i4;
                        str2 = str;
                    case 144538486:
                    case 916176816:
                        return C0798.m3007(str3);
                    case 297176850:
                    case 1017782267:
                        str = str2;
                        i8 = 101082916;
                        if (RunnableC1108.f4040) {
                            m2566 = (i12 - C2105.m6981("ܰ۫")) * (-87);
                            i4 = ((m2566 ^ i11) * (-2615)) ^ (-1835850908);
                            i5 = 2020791044;
                            i14 = m2566 ^ i5;
                            i13 = i4;
                            str2 = str;
                        }
                        m2566 = (C2105.m6981("᩹֡") ^ i12) * 93;
                        i4 = ((m2566 ^ i11) * (-3669)) ^ 1065461126;
                        i5 = -250668448;
                        i14 = m2566 ^ i5;
                        i13 = i4;
                        str2 = str;
                    case 629232355:
                    case 2023025464:
                        return textLengthCalculator.calculate(str3);
                    case 708705434:
                    case 1690329281:
                        if (C3911.f12484 < 0) {
                            str = str2;
                            m2566 = (i12 - C2105.m6981("ۚۛ")) * 31;
                            i4 = ((m2566 ^ i11) * 3269) ^ (-1121443585);
                            i5 = -2016040762;
                            i14 = m2566 ^ i5;
                            i13 = i4;
                            str2 = str;
                        }
                        str = str2;
                        m2566 = (C2105.m6981("᩹֡") ^ i12) * 93;
                        i4 = ((m2566 ^ i11) * (-3669)) ^ 1065461126;
                        i5 = -250668448;
                        i14 = m2566 ^ i5;
                        i13 = i4;
                        str2 = str;
                    default:
                        str = str2;
                        if (!C3663.f11553) {
                            m2566 = (C2105.m6981("ᩴ۟") + i11) * (-49);
                            i4 = ((m2566 ^ i12) * 22621) ^ (-985450971);
                            i5 = 13771350;
                            i14 = m2566 ^ i5;
                            i13 = i4;
                            str2 = str;
                        }
                        str2 = str;
                        m2566 = (C0630.m2566("ܶܿ") + i12) * 29;
                        str = str2;
                        i4 = ((m2566 ^ i11) * 27035) ^ (-1651711954);
                        i5 = 1221946316;
                        i14 = m2566 ^ i5;
                        i13 = i4;
                        str2 = str;
                }
            }
            int m25664 = C0630.m2566("ۜۤ") ^ i11;
            i14 = m25664 ^ (-278629603);
            i13 = ((m25664 ^ i12) * 23779) ^ (-1249045190);
        }
    }

    public C17205(C14382 c14382, int i, TranslationEngine.TextLengthCalculator textLengthCalculator) {
        int i2 = 0;
        int i3 = 1585652460;
        int i4 = ServiceConnectionC3453.f10921;
        int i5 = ViewOnClickListenerC1958.f6529;
        int m6981 = (i4 - C2105.m6981("ۘۢ")) * 55;
        int i6 = ((m6981 ^ i5) * 31673) ^ 341248988;
        int i7 = -1329029734;
        while (true) {
            i3 = ((((i3 ^ i5) * 5705) >> 31) & i6) ^ (m6981 ^ i7);
            switch (i3) {
                case -2137374149:
                case -2123377442:
                    C0714.m2805();
                    C0964.m3413();
                    throw new RuntimeException();
                case -2122142438:
                case -629881203:
                    C1047.m3599();
                    if (C21923.f70183 != 0) {
                        m6981 = (i4 - C2105.m6981("ۘ᩻")) * (-51);
                        i6 = ((m6981 ^ i5) * (-11487)) ^ 1476544571;
                        i7 = 1247012626;
                    } else {
                        m6981 = C2105.m6981("֨᩻") ^ i4;
                        i6 = ((m6981 ^ i5) * (-17839)) ^ 28567514;
                        i7 = -1927459268;
                    }
                case -2051835684:
                case -183659038:
                    ViewOnClickListenerC1958.m6429();
                    m6981 = (i4 - C2105.m6981("ۘ᩻")) * (-51);
                    i6 = ((m6981 ^ i5) * (-11487)) ^ 1476544571;
                    i7 = 1247012626;
                case -1663997131:
                case -580914357:
                    C2520.m8026();
                    if (C1294.f4556 >= 0) {
                        m6981 = C2105.m6981("ۘۚ") ^ i5;
                        i6 = ((m6981 ^ i4) * (-8913)) ^ (-1868357995);
                        i7 = -1590760745;
                    } else {
                        m6981 = (C0630.m2566("᩷ᩳ") + i5) * 35;
                        i6 = ((m6981 ^ i4) * 4883) ^ 90230236;
                        i7 = 1529347348;
                    }
                case -1376662300:
                case -686350313:
                    this.f52752 = i;
                    this.f52756 = textLengthCalculator;
                    return;
                case -1246633450:
                case -194777959:
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = C2105.m6981("ۘۚ") ^ i5;
                        i6 = ((m6981 ^ i4) * (-8913)) ^ (-1868357995);
                        i7 = -1590760745;
                    } else {
                        m6981 = (C2105.m6981("᩺ᩴ") ^ i5) * (-83);
                        i6 = ((m6981 ^ i4) * 6539) ^ (-650619991);
                        i7 = 953943590;
                    }
                case -1188580544:
                case 1467343235:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = (C2105.m6981("ܶᩴ") ^ i5) * (-31);
                        i6 = ((m6981 ^ i4) * 31079) ^ (-736172239);
                        i7 = 1399246748;
                    } else {
                        m6981 = C0630.m2566("ܶ۟") ^ i4;
                        i6 = ((m6981 ^ i5) * (-7287)) ^ (-1865949423);
                        i7 = 1497821455;
                    }
                case -1134619714:
                case 297090498:
                    if (C1420.f5096 <= 0) {
                        m6981 = C2105.m6981("֨᩻") ^ i4;
                        i6 = ((m6981 ^ i5) * (-17839)) ^ 28567514;
                        i7 = -1927459268;
                    } else {
                        m6981 = (C0630.m2566("ܺۨ") + i4) * (-9);
                        i6 = ((m6981 ^ i5) * (-21123)) ^ (-170648074);
                        i7 = 1339638679;
                    }
                case -911744579:
                case -8472996:
                    if (C1916.m6308() >= 0) {
                        m6981 = (i4 - C2105.m6981("ۘ᩻")) * (-51);
                        i6 = ((m6981 ^ i5) * (-11487)) ^ 1476544571;
                        i7 = 1247012626;
                    } else {
                        m6981 = C0630.m2566("ᩴۛ") ^ i5;
                        i6 = ((m6981 ^ i4) * (-31759)) ^ 377626129;
                        i7 = -1727719199;
                    }
                case -853178831:
                case 144222592:
                    this.f52748 = i2;
                    if (C0237.f1507 != 0) {
                        m6981 = (C2105.m6981("ܶᩴ") ^ i5) * (-31);
                        i6 = ((m6981 ^ i4) * 31079) ^ (-736172239);
                        i7 = 1399246748;
                    } else {
                        m6981 = (C0630.m2566("۫ۜ") + i4) * (-65);
                        i6 = ((m6981 ^ i5) * (-16779)) ^ (-297635941);
                        i7 = 2032381979;
                    }
                case -459734235:
                case 1105357602:
                    if (RunnableC1108.f4040) {
                        m6981 = C0630.m2566("ۜܽ") ^ i5;
                        i6 = ((m6981 ^ i4) * 7285) ^ 1444927261;
                        i7 = 56008277;
                    } else {
                        m6981 = (C0630.m2566("᩷ᩳ") + i5) * 35;
                        i6 = ((m6981 ^ i4) * 4883) ^ 90230236;
                        i7 = 1529347348;
                    }
                case -253346609:
                case 505966675:
                    if (C0382.f1805) {
                        m6981 = C0630.m2566("᩶۫") ^ i4;
                        i6 = ((m6981 ^ i5) * (-31433)) ^ 16404383;
                        i7 = 626208760;
                    } else {
                        m6981 = C2105.m6981("ۘۚ") ^ i5;
                        i6 = ((m6981 ^ i4) * (-8913)) ^ (-1868357995);
                        i7 = -1590760745;
                    }
                case 970087313:
                case 1642754719:
                    C2126.m7040();
                    if (C3245.f10203 <= 0) {
                        m6981 = (i4 - C2105.m6981("ۘ᩻")) * (-51);
                        i6 = ((m6981 ^ i5) * (-11487)) ^ 1476544571;
                        i7 = 1247012626;
                    } else {
                        m6981 = C2105.m6981("ۘۚ") ^ i5;
                        i6 = ((m6981 ^ i4) * (-8913)) ^ (-1868357995);
                        i7 = -1590760745;
                    }
                case 1459152990:
                case 1563112812:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C2105.m6981("ۘۚ") ^ i5;
                        i6 = ((m6981 ^ i4) * (-8913)) ^ (-1868357995);
                        i7 = -1590760745;
                    } else {
                        m6981 = (i4 - C0630.m2566("ۛۙ")) * 97;
                        i6 = ((m6981 ^ i5) * 15655) ^ (-343924321);
                        i7 = 1979708268;
                    }
                case 1507735152:
                case 1954453529:
                    i2 = -1;
                    this.f52753 = -1;
                    if (RunnableC0588.m2441() >= 0) {
                        m6981 = C2105.m6981("֨᩻") ^ i4;
                        i6 = ((m6981 ^ i5) * (-17839)) ^ 28567514;
                        i7 = -1927459268;
                    } else {
                        m6981 = (i5 - C0630.m2566("ۧ۫")) * (-89);
                        i6 = ((m6981 ^ i4) * 31275) ^ (-793663883);
                        i7 = -490503863;
                    }
                default:
                    if (C0714.m2805()) {
                        m6981 = C2105.m6981("۫ۛ") ^ i5;
                        i6 = ((m6981 ^ i4) * 15135) ^ (-1329066155);
                        i7 = -1530575448;
                    } else {
                        m6981 = (C2105.m6981("ܶᩴ") ^ i5) * (-31);
                        i6 = ((m6981 ^ i4) * 31079) ^ (-736172239);
                        i7 = 1399246748;
                    }
            }
        }
    }

    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    public final void reset() {
        int i = 0;
        int i2 = 0;
        int i3 = 1577055096;
        int i4 = C3911.f12484;
        int i5 = C11340.f33930;
        int m6981 = C2105.m6981("᩻۬") ^ i4;
        int i6 = ((m6981 ^ i5) * 19645) ^ (-992230278);
        int i7 = 739251227;
        while (true) {
            i3 = ((((i3 ^ i5) * 12955) >> 31) & i6) ^ (m6981 ^ i7);
            switch (i3) {
                case -2062375613:
                case -912033845:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = (i5 - C2105.m6981("ۢۚ")) * (-91);
                        i6 = ((m6981 ^ i4) * 9667) ^ (-1708586307);
                        i7 = -308639895;
                    } else {
                        m6981 = C2105.m6981("֡ܿ") ^ i5;
                        i6 = ((m6981 ^ i4) * 21765) ^ 1652080829;
                        i7 = -1423683974;
                    }
                case -2031907482:
                case -334488678:
                    i2 = -1;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = C2105.m6981("ۖ᩶") ^ i4;
                        i6 = ((m6981 ^ i5) * (-23865)) ^ 798523056;
                        i7 = 606786011;
                    } else {
                        m6981 = (C2105.m6981("ۜܺ") + i4) * 31;
                        i6 = ((m6981 ^ i5) * (-21109)) ^ (-639038920);
                        i7 = 1018453137;
                    }
                case -2031819587:
                case -890238497:
                    i = 0;
                    if (C0483.m2121()) {
                        m6981 = (i4 - C2105.m6981("۬ᩴ")) * 17;
                        i6 = ((m6981 ^ i5) * 9387) ^ (-1174449867);
                        i7 = 217554127;
                    } else {
                        m6981 = C2105.m6981("ۖ᩶") ^ i4;
                        i6 = ((m6981 ^ i5) * (-23865)) ^ 798523056;
                        i7 = 606786011;
                    }
                case -1998634007:
                case 2004211323:
                    if (C4117.m12364() == 0) {
                        m6981 = (i5 - C2105.m6981("ۢۚ")) * (-91);
                        i6 = ((m6981 ^ i4) * 9667) ^ (-1708586307);
                        i7 = -308639895;
                    } else {
                        m6981 = C2105.m6981("ۖ᩶") ^ i4;
                        i6 = ((m6981 ^ i5) * (-23865)) ^ 798523056;
                        i7 = 606786011;
                    }
                case -1450138684:
                case 316335926:
                    this.f52750 = 0L;
                    if (C21923.m49329()) {
                        m6981 = C0630.m2566("᩶ܿ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-30235)) ^ (-645852986);
                        i7 = -2112935709;
                    } else {
                        m6981 = (i5 - C2105.m6981("ۙ֫")) * (-121);
                        i6 = ((m6981 ^ i4) * (-2413)) ^ (-2019288897);
                        i7 = -1439674584;
                    }
                case -1439339391:
                case -11944855:
                    if (C1711.m5736() <= 0) {
                        m6981 = C0630.m2566("᩶ܿ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-30235)) ^ (-645852986);
                        i7 = -2112935709;
                    } else {
                        m6981 = (C2105.m6981("ۡ۬") ^ i4) * 41;
                        i6 = ((m6981 ^ i5) * (-12199)) ^ (-2037331837);
                        i7 = 213872082;
                    }
                case -1202891615:
                case -1027008082:
                    if (C0483.f2088 < 0) {
                        m6981 = (C0630.m2566("ۗ֫") + i4) * 47;
                        i6 = ((m6981 ^ i5) * 22897) ^ (-1583670571);
                        i7 = -1647546032;
                    } else {
                        m6981 = (i5 - C2105.m6981("ۢۚ")) * (-91);
                        i6 = ((m6981 ^ i4) * 9667) ^ (-1708586307);
                        i7 = -308639895;
                    }
                case -1047893640:
                case 306853678:
                    this.f52749 = i;
                    this.f52757 = i;
                    if (C3663.f11553) {
                        m6981 = C0630.m2566("᩶ܿ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-30235)) ^ (-645852986);
                        i7 = -2112935709;
                    } else {
                        m6981 = (C0630.m2566("᩺ۙ") + i5) * 61;
                        i6 = ((m6981 ^ i4) * (-4549)) ^ 148907938;
                        i7 = 1656788405;
                    }
                case -1031541443:
                case 973264384:
                    if (C1916.f6442) {
                        m6981 = C0630.m2566("ۢ᩹") ^ i5;
                        i6 = ((m6981 ^ i4) * (-29585)) ^ (-801154870);
                        i7 = 727938178;
                    } else {
                        m6981 = C0630.m2566("᩶ܿ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-30235)) ^ (-645852986);
                        i7 = -2112935709;
                    }
                case -792185703:
                case 1693398399:
                    if (C7811.f24123 < 0) {
                        m6981 = (C0630.m2566("ۗ֫") + i4) * 47;
                        i6 = ((m6981 ^ i5) * 22897) ^ (-1583670571);
                        i7 = -1647546032;
                    } else {
                        m6981 = (C0630.m2566("ۖۤ") + i5) * (-85);
                        i6 = ((m6981 ^ i4) * 25759) ^ (-1731454537);
                        i7 = -87194411;
                    }
                case -342837834:
                case 2131680504:
                    this.f52754 = i;
                    if (C0483.m2121()) {
                        m6981 = C0630.m2566("ۘۡ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-311)) ^ (-142456878);
                        i7 = 1332960984;
                    } else {
                        m6981 = C0630.m2566("᩶ܿ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-30235)) ^ (-645852986);
                        i7 = -2112935709;
                    }
                case -163807684:
                case 239553469:
                    if (RunnableC1108.m3790()) {
                        m6981 = (i5 - C2105.m6981("ۢۚ")) * (-91);
                        i6 = ((m6981 ^ i4) * 9667) ^ (-1708586307);
                        i7 = -308639895;
                    } else {
                        m6981 = C2105.m6981("ᩳܺ") ^ i4;
                        i6 = ((m6981 ^ i5) * 25041) ^ 1537827302;
                        i7 = 792947449;
                    }
                case -32013129:
                case 461417417:
                    C1128.m3851();
                    C0714.m2805();
                    break;
                case 498350188:
                case 1509038354:
                    if (C1504.m5179()) {
                        m6981 = C0630.m2566("᩹ۙ") ^ i5;
                        i6 = ((m6981 ^ i4) * (-2619)) ^ (-1650927056);
                        i7 = -299119940;
                    } else {
                        m6981 = C2105.m6981("ۖ᩶") ^ i4;
                        i6 = ((m6981 ^ i5) * (-23865)) ^ 798523056;
                        i7 = 606786011;
                    }
                case 658339843:
                case 2026427133:
                    C1504.m5179();
                    m6981 = (C0630.m2566("ۗ֫") + i4) * 47;
                    i6 = ((m6981 ^ i5) * 22897) ^ (-1583670571);
                    i7 = -1647546032;
                default:
                    this.f52753 = i2;
                    this.f52748 = i2;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0144, code lost:
    
        if (l.C5695.f17556 < 0) goto L37;
     */
    @Override // bin.mt.plugin.api.translation.BatchTranslationEngine.BatchingStrategy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tryAdd(java.lang.String r49) {
        /*
            Method dump skipped, instructions count: 2052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17205.tryAdd(java.lang.String):boolean");
    }
}
