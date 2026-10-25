package l;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* compiled from: K3YG */
/* renamed from: l.ۘܿ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ActivityC4094 extends AbstractActivityC3346 {

    /* renamed from: ֫֫֫, reason: not valid java name and contains not printable characters */
    private static final short[] f13020 = {6199, -17872, -17861, -17860, -17796, -17857, -17882, -17796, -17886, -17858, -17881, -17867, -17861, -17860, -17796, -17887, -17877, -17887, -17882, -17865, -17857, 4081, 27843, 27871, 27846, 27860, 27866, 27869, 27805, 27871, 27868, 27860, 27795, 27806, 27795, 27855, 27795, 27855, 27795, 5455, -28777, 26930, -25989, 28960, -31348, 27112, 21536, 32538, 29684, 1539, 1567, 1542, 1556, 1562, 1565, 1580, 1567, 1564, 1556, 32412, 20864, 25856, 27162, 25523, 29077, 1539, 1567, 1542, 1556, 1562, 1565, 1594, 1559, 2736, 15537, 12769, -9665, 9599, 31073, -17870, 23549, 31099, -20089, -23052, 31314, 16949, 22689, -21040, 29899, 31137, -21498, -17027, 31230, -18147, -18185, 27750, -21718, -20319, -24356, -20573, 29874, -22459, 17217, -16526, 31466, -20451, -23037, -22680, 8725, 8734, 8729, 8793, 8730, 8707, 8793, 8711, 8731, 8706, 8720, 8734, 8729, 8793, 8708, 8718, 8708, 8707, 8722, 8730, 8829, 8799, 8798, -22202, 32326, -21051, 2311, 15794, 15758, 15767, 15749, 15755, 15756, 15790, 15757, 15749, 15796, 15755, 15751, 15765, 15751, 15760};

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f13021 = 0;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C12392 f13022;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public String f13023;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C15545 f13024;

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
        int i5 = -2025420984;
        int i6 = C22628.f73083;
        int i7 = C0483.f2088;
        int m2566 = C0630.m2566("᩻᩶") ^ i7;
        int i8 = ((m2566 ^ i6) * (-1347)) ^ (-103269899);
        int i9 = 833016040;
        while (true) {
            i5 = ((((i5 ^ i6) * (-29721)) >> 31) & i8) ^ (m2566 ^ i9);
            switch (i5) {
                case -2121568417:
                case -592623340:
                    C1711.m5736();
                    AbstractC2021.m6574();
                    m2566 = (C2105.m6981("֫ܶ") ^ i6) * 29;
                    i8 = ((m2566 ^ i7) * 12219) ^ (-1467923208);
                    i9 = 821023823;
                case -2054406603:
                case 1703344552:
                    c = 134;
                    if (C0483.f2088 >= 0) {
                        m2566 = C0630.m2566("֫ۨ") ^ i6;
                        i8 = ((m2566 ^ i7) * 2811) ^ (-1567732360);
                        i9 = 977992968;
                    } else {
                        m2566 = (C2105.m6981("ᩴ᩷") + i6) * (-37);
                        i8 = ((m2566 ^ i7) * 14943) ^ (-420220194);
                        i9 = 696584714;
                    }
                case -1867932599:
                case 1703831046:
                    RunnableC3474.m10630();
                    if (C0237.m1481() >= 0) {
                        m2566 = (C2105.m6981("֫ܶ") ^ i6) * 29;
                        i8 = ((m2566 ^ i7) * 12219) ^ (-1467923208);
                        i9 = 821023823;
                    } else {
                        m2566 = (i7 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((m2566 ^ i6) * (-22651)) ^ (-1458105638);
                        i9 = -1880653169;
                    }
                case -1586589408:
                case 504617412:
                    i3 = 15842;
                    m2566 = C0630.m2566("ۤᩴ") ^ i6;
                    i8 = ((m2566 ^ i7) * 18915) ^ (-1720455725);
                    i9 = -1646024556;
                case -1476370841:
                case 666933092:
                    sArr2 = f13020;
                    i4 = 135;
                    if (C0964.f3626 != 0) {
                        m2566 = C0630.m2566("֫ۨ") ^ i6;
                        i8 = ((m2566 ^ i7) * 2811) ^ (-1567732360);
                        i9 = 977992968;
                    } else {
                        m2566 = C2105.m6981("ᩳ᩺") ^ i7;
                        i8 = ((m2566 ^ i6) * (-16519)) ^ (-935259823);
                        i9 = -682059773;
                    }
                case -1475413174:
                case -293156432:
                    sArr = f13020;
                    if (C0382.f1805) {
                        m2566 = C2105.m6981("ۙܽ") ^ i6;
                        i8 = ((m2566 ^ i7) * 29559) ^ (-1633802185);
                        i9 = 1598961785;
                    } else {
                        m2566 = C0630.m2566("ۗۜ") ^ i7;
                        i8 = ((m2566 ^ i6) * 29473) ^ (-1644941330);
                        i9 = 59688434;
                    }
                case -1421821959:
                case 142114919:
                    return C4263.m12817(sArr2, i4, 15, i3);
                case -1264483620:
                case -299103275:
                    i2 = i + 1;
                    if (C4263.m12819() >= 0) {
                        m2566 = (C2105.m6981("֫ܶ") ^ i6) * 29;
                        i8 = ((m2566 ^ i7) * 12219) ^ (-1467923208);
                        i9 = 821023823;
                    } else {
                        m2566 = C0630.m2566("ܰᩴ") ^ i7;
                        i8 = ((m2566 ^ i6) * (-1169)) ^ 355010199;
                        i9 = 480862116;
                    }
                case -1184873335:
                case 472949320:
                    s = sArr[c];
                    if (C0483.f2088 >= 0) {
                        m2566 = (C2105.m6981("֫ܶ") ^ i6) * 29;
                        i8 = ((m2566 ^ i7) * 12219) ^ (-1467923208);
                        i9 = 821023823;
                    } else {
                        m2566 = (i7 - C0630.m2566("᩺᩻")) * 51;
                        i8 = ((m2566 ^ i6) * (-15965)) ^ 1065433755;
                        i9 = -1078312270;
                    }
                case -1101558950:
                case -841554566:
                    int i10 = s + s2;
                    if ((i10 * i10) - i2 >= 0) {
                        m2566 = C2105.m6981("ܰ֡") ^ i7;
                        i8 = ((m2566 ^ i6) * (-21139)) ^ (-956524967);
                        i9 = -1053791306;
                    } else {
                        m2566 = (i7 - C2105.m6981("ۜ᩹")) * 81;
                        i8 = ((m2566 ^ i6) * (-5223)) ^ (-1805821380);
                        i9 = -1610632328;
                    }
                case -1014304541:
                case -795169688:
                    s2 = 1;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = (C2105.m6981("֫ܶ") ^ i6) * 29;
                        i8 = ((m2566 ^ i7) * 12219) ^ (-1467923208);
                        i9 = 821023823;
                    } else {
                        m2566 = C2105.m6981("ۘ۟") ^ i6;
                        i8 = ((m2566 ^ i7) * (-7529)) ^ (-1800659615);
                        i9 = -1951115586;
                    }
                case -858056172:
                case 1016408672:
                    i = s * 2;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        m2566 = C0630.m2566("ۨۖ") ^ i6;
                        i8 = ((m2566 ^ i7) * (-11437)) ^ (-1226241851);
                        i9 = -1521859004;
                    } else {
                        m2566 = C0630.m2566("ۗ᩸") ^ i6;
                        i8 = ((m2566 ^ i7) * 32627) ^ 1233792410;
                        i9 = -2126353730;
                    }
                case -168398090:
                case 707077287:
                    C0382.m1848();
                    C7811.m20844();
                    return null;
                case 180615042:
                case 595958270:
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        m2566 = (C2105.m6981("֫ܶ") ^ i6) * 29;
                        i8 = ((m2566 ^ i7) * 12219) ^ (-1467923208);
                        i9 = 821023823;
                    } else {
                        m2566 = C0630.m2566("֫ۨ") ^ i6;
                        i8 = ((m2566 ^ i7) * 2811) ^ (-1567732360);
                        i9 = 977992968;
                    }
                case 249636246:
                case 1071206161:
                    if (C3683.f11629 >= 0) {
                        m2566 = (i7 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((m2566 ^ i6) * (-22651)) ^ (-1458105638);
                        i9 = -1880653169;
                    } else {
                        m2566 = C2105.m6981("ᩴ᩵") ^ i7;
                        i8 = ((m2566 ^ i6) * 25709) ^ 1505959448;
                        i9 = -460609569;
                    }
                case 262753654:
                case 419815041:
                    if (C4075.m12263() <= 0) {
                        m2566 = (C2105.m6981("֫ܶ") ^ i6) * 29;
                        i8 = ((m2566 ^ i7) * 12219) ^ (-1467923208);
                        i9 = 821023823;
                    } else {
                        m2566 = C0630.m2566("ۗۜ") ^ i7;
                        i8 = ((m2566 ^ i6) * 29473) ^ (-1644941330);
                        i9 = 59688434;
                    }
                case 1001111389:
                case 1318679048:
                    if (C7106.m19120() <= 0) {
                        m2566 = (C2105.m6981("֫ܶ") ^ i6) * 29;
                        i8 = ((m2566 ^ i7) * 12219) ^ (-1467923208);
                        i9 = 821023823;
                    } else {
                        m2566 = C0630.m2566("᩵ۖ") ^ i6;
                        i8 = ((m2566 ^ i7) * 21319) ^ (-1742333446);
                        i9 = 1348912202;
                    }
                case 1781365333:
                case 1789781278:
                    if (C4616.f14690 <= 0) {
                        m2566 = C0630.m2566("֫ۨ") ^ i6;
                        i8 = ((m2566 ^ i7) * 2811) ^ (-1567732360);
                        i9 = 977992968;
                    } else {
                        m2566 = (C0630.m2566("ۜ֨") ^ i7) * 45;
                        i8 = ((m2566 ^ i6) * (-10629)) ^ (-932544633);
                        i9 = 937331829;
                    }
                default:
                    i3 = 46467;
                    m2566 = C0630.m2566("ۤᩴ") ^ i6;
                    i8 = ((m2566 ^ i7) * 18915) ^ (-1720455725);
                    i9 = -1646024556;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (l.C21923.f70183 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (l.C5695.m16023() < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        if (l.C4075.m12263() <= 0) goto L63;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreateOptionsMenu(android.view.Menu r20) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC4094.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
        C12392 c12392;
        Intent intent;
        C9762 c9762;
        int m2566;
        int i2;
        int i3;
        boolean z2;
        int i4;
        C12392 c123922;
        Intent intent2;
        short[] sArr;
        int i5;
        int i6;
        C9762 c97622;
        int m6981;
        int i7;
        int i8;
        int m69812;
        int i9;
        int i10;
        int i11;
        boolean z3;
        short[] sArr2;
        int i12;
        int i13;
        int m69813;
        int i14;
        int i15;
        int m69814;
        int i16;
        final ActivityC4094 activityC4094 = this;
        int i17 = C1047.f3863;
        int i18 = C0714.f2697;
        int m25662 = (i18 - C0630.m2566("᩵ۛ")) * 13;
        int i19 = ((m25662 ^ i17) * 5827) ^ 1459387716;
        View.OnClickListener onClickListener = null;
        Intent intent3 = null;
        String str = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i20 = m25662 ^ (-900807614);
        boolean z4 = false;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        short s = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -250777553;
        C9762 c97623 = null;
        C9762 c97624 = null;
        C12392 c123923 = null;
        int i31 = 0;
        while (true) {
            i30 = i20 ^ (i19 & (((i30 ^ i17) * (-23107)) >> 31));
            switch (i30) {
                case -2064590250:
                case -1539147596:
                    z3 = z4;
                    i = i31;
                    c12392 = c123923;
                    intent = intent3;
                    sArr2 = sArr3;
                    i12 = i28;
                    i13 = i29;
                    C9762 c97625 = (C9762) C0964.m3409(activityC4094, C2105.m6981(C4616.m13542(sArr2, i12, i13, i25)) ^ 2128239669);
                    activityC4094.f10584 = c97625;
                    if (C4616.f14690 <= 0) {
                        c97623 = c97625;
                        int m69815 = C2105.m6981("ᩳ᩶") ^ i18;
                        sArr3 = sArr2;
                        i28 = i12;
                        i29 = i13;
                        z4 = z3;
                        i31 = i;
                        intent3 = intent;
                        i20 = m69815 ^ (-1253332216);
                        i19 = ((m69815 ^ i17) * 26219) ^ 1445695481;
                        c123923 = c12392;
                    } else {
                        int m69816 = C2105.m6981("ܳۧ") ^ i18;
                        int i32 = ((m69816 ^ i17) * (-25103)) ^ 1049311838;
                        i11 = m69816 ^ (-49547178);
                        c97623 = c97625;
                        sArr3 = sArr2;
                        i28 = i12;
                        i29 = i13;
                        i19 = i32;
                        z4 = z3;
                        i31 = i;
                        intent3 = intent;
                        i20 = i11;
                        c123923 = c12392;
                    }
                case -1951103599:
                case -545011288:
                    activityC4094.f13022.m30334(new C2683());
                    intent3 = C4159.m12571(this);
                    sArr4 = f13020;
                    m69814 = C0630.m2566("᩻ۙ") ^ i18;
                    i14 = ((m69814 ^ i17) * (-4915)) ^ 590932061;
                    i16 = 1126112719;
                    i20 = m69814 ^ i16;
                    i19 = i14;
                case -1878493598:
                case -1398136404:
                    C2520.m8026();
                    if (C3911.m11924() <= 0) {
                        z = z4;
                        i = i31;
                        c12392 = c123923;
                        intent = intent3;
                        c9762 = c97623;
                        m2566 = C0630.m2566("ܽ۬") ^ i18;
                        i2 = ((m2566 ^ i17) * (-3803)) ^ 526876114;
                        i3 = -939441690;
                        int i33 = m2566 ^ i3;
                        c97623 = c9762;
                        i19 = i2;
                        z4 = z;
                        i31 = i;
                        c123923 = c12392;
                        intent3 = intent;
                        i20 = i33;
                    } else {
                        z2 = z4;
                        i4 = i31;
                        c123922 = c123923;
                        intent2 = intent3;
                        sArr = sArr3;
                        i5 = i28;
                        i6 = i29;
                        c97622 = c97623;
                        m6981 = (C0630.m2566("ۨܺ") ^ i18) * (-51);
                        i7 = ((m6981 ^ i17) * 19693) ^ 472734507;
                        i8 = 1923792091;
                        int i34 = m6981 ^ i8;
                        c97623 = c97622;
                        sArr3 = sArr;
                        i28 = i5;
                        i29 = i6;
                        i19 = i7;
                        z4 = z2;
                        i31 = i4;
                        c123923 = c123922;
                        intent3 = intent2;
                        i20 = i34;
                        activityC4094 = this;
                    }
                case -1819641357:
                case -850183060:
                    activityC4094.m12299(RunnableC3474.m10628(intent3, C3683.m11225(sArr4, 65, 8, i25)));
                    break;
                case -1786774146:
                case 1213878118:
                    C3746.m11360(C0964.m3409(activityC4094, C2105.m6981(str) ^ 2128283584), 8);
                    if (C1128.f4106 > 0) {
                        m69814 = (i17 - C2105.m6981("ۘۜ")) * 51;
                        i14 = ((m69814 ^ i18) * (-15861)) ^ (-1531680372);
                        i16 = 2092749625;
                        i20 = m69814 ^ i16;
                        i19 = i14;
                    }
                    m69814 = (i17 - C2105.m6981("᩷֨")) * 37;
                    i14 = ((m69814 ^ i18) * (-1345)) ^ (-1863273515);
                    i16 = -582270444;
                    i20 = m69814 ^ i16;
                    i19 = i14;
                case -1492879423:
                case 538144963:
                    z3 = z4;
                    i = i31;
                    c12392 = c123923;
                    intent = intent3;
                    RunnableC3474.m10625(c97624, onClickListener);
                    i21 = C0630.m2566(C0382.m1840(f13020, 46, 3, i25));
                    i22 = 2119054253;
                    m69813 = (C2105.m6981("ۗ᩷") + i18) * 93;
                    i14 = ((m69813 ^ i17) * (-125)) ^ (-1452536481);
                    i15 = 1634626081;
                    int i35 = m69813 ^ i15;
                    z4 = z3;
                    i31 = i;
                    c123923 = c12392;
                    intent3 = intent;
                    i20 = i35;
                    i19 = i14;
                case -1271966838:
                case 62813516:
                    z = z4;
                    i = i31;
                    c12392 = c123923;
                    intent = intent3;
                    c9762 = c97623;
                    C0964.m3409(activityC4094, i27 ^ 2099164567);
                    sArr3 = f13020;
                    i28 = 43;
                    i29 = 3;
                    if (RunnableC0588.f2309 >= 0) {
                        z4 = z;
                        int m25663 = (i17 - C0630.m2566("֨ܶ")) * 101;
                        i20 = m25663 ^ 112726634;
                        c97623 = c9762;
                        i19 = ((m25663 ^ i18) * (-30623)) ^ 1000805820;
                        i31 = i;
                        c123923 = c12392;
                        intent3 = intent;
                    } else {
                        m2566 = C0630.m2566("֡᩹") ^ i17;
                        i2 = ((m2566 ^ i18) * 7233) ^ (-864835474);
                        i3 = 159913927;
                        int i332 = m2566 ^ i3;
                        c97623 = c9762;
                        i19 = i2;
                        z4 = z;
                        i31 = i;
                        c123923 = c12392;
                        intent3 = intent;
                        i20 = i332;
                    }
                case -1154256786:
                case -1118086787:
                    z2 = z4;
                    i4 = i31;
                    c123922 = c123923;
                    intent2 = intent3;
                    sArr = sArr3;
                    i5 = i28;
                    i6 = i29;
                    c97622 = c97623;
                    i25 = 1651;
                    m6981 = (C2105.m6981("᩶᩷") + i18) * (-3);
                    i7 = ((m6981 ^ i17) * (-30335)) ^ (-1271774648);
                    i8 = 1885530050;
                    int i342 = m6981 ^ i8;
                    c97623 = c97622;
                    sArr3 = sArr;
                    i28 = i5;
                    i29 = i6;
                    i19 = i7;
                    z4 = z2;
                    i31 = i4;
                    c123923 = c123922;
                    intent3 = intent2;
                    i20 = i342;
                    activityC4094 = this;
                case -1037585897:
                case -12812082:
                    c123923.m30373(z4);
                    activityC4094.f13022.m30393(z4);
                    activityC4094.f13022.m30512(i31);
                    if (C3683.f11629 >= 0) {
                        i = i31;
                        c12392 = c123923;
                        intent = intent3;
                        c9762 = c97623;
                        int m256632 = (i17 - C0630.m2566("֨ܶ")) * 101;
                        i20 = m256632 ^ 112726634;
                        c97623 = c9762;
                        i19 = ((m256632 ^ i18) * (-30623)) ^ 1000805820;
                        i31 = i;
                        c123923 = c12392;
                        intent3 = intent;
                    } else {
                        m69814 = (i17 - C2105.m6981("۫᩵")) * (-77);
                        i14 = ((m69814 ^ i18) * 5413) ^ (-250063575);
                        i16 = -1397941147;
                        i20 = m69814 ^ i16;
                        i19 = i14;
                    }
                case -1014221636:
                case 1375838502:
                    i23 = C0630.m2566(ViewOnClickListenerC1958.m6435(f13020, 62, 3, i25));
                    i24 = 2125579645;
                    m69814 = (C0630.m2566("᩷ۗ") ^ i18) * (-113);
                    i14 = ((m69814 ^ i17) * 18557) ^ (-1949051873);
                    i16 = 789992075;
                    i20 = m69814 ^ i16;
                    i19 = i14;
                case -763540696:
                case -21071017:
                    activityC4094.f13022 = (C12392) C0964.m3409(activityC4094, i21 ^ i22);
                    if (C4616.m13552() != 0) {
                        z2 = z4;
                        i4 = i31;
                        c123922 = c123923;
                        intent2 = intent3;
                        sArr = sArr3;
                        i5 = i28;
                        i6 = i29;
                        c97622 = c97623;
                        m6981 = (C0630.m2566("ۨܺ") ^ i18) * (-51);
                        i7 = ((m6981 ^ i17) * 19693) ^ 472734507;
                        i8 = 1923792091;
                        int i3422 = m6981 ^ i8;
                        c97623 = c97622;
                        sArr3 = sArr;
                        i28 = i5;
                        i29 = i6;
                        i19 = i7;
                        z4 = z2;
                        i31 = i4;
                        c123923 = c123922;
                        intent3 = intent2;
                        i20 = i3422;
                        activityC4094 = this;
                    } else {
                        z3 = z4;
                        i = i31;
                        c12392 = c123923;
                        intent = intent3;
                        activityC4094.f13024 = new C15545(activityC4094, activityC4094.f13022, C22628.m50602(f13020, 49, 10, i25), new C9197(activityC4094));
                        C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
                        if (C1420.m4913()) {
                            sArr2 = sArr3;
                            i12 = i28;
                            i13 = i29;
                            int m698152 = C2105.m6981("ᩳ᩶") ^ i18;
                            sArr3 = sArr2;
                            i28 = i12;
                            i29 = i13;
                            z4 = z3;
                            i31 = i;
                            intent3 = intent;
                            i20 = m698152 ^ (-1253332216);
                            i19 = ((m698152 ^ i17) * 26219) ^ 1445695481;
                            c123923 = c12392;
                        } else {
                            C16087 c16087 = new C16087(activityC4094);
                            RunnableC3474.m10618(onBackPressedDispatcher);
                            onBackPressedDispatcher.m28891(c16087);
                            str = C1420.m4902(f13020, 59, 3, i25);
                            if (C4117.f13076 <= 0) {
                                z4 = z3;
                                c9762 = c97623;
                                int m2566322 = (i17 - C0630.m2566("֨ܶ")) * 101;
                                i20 = m2566322 ^ 112726634;
                                c97623 = c9762;
                                i19 = ((m2566322 ^ i18) * (-30623)) ^ 1000805820;
                                i31 = i;
                                c123923 = c12392;
                                intent3 = intent;
                            } else {
                                m69813 = C0630.m2566("ܿ۟") ^ i17;
                                i14 = ((m69813 ^ i18) * (-27055)) ^ 176492332;
                                i15 = -987583089;
                                int i352 = m69813 ^ i15;
                                z4 = z3;
                                i31 = i;
                                c123923 = c12392;
                                intent3 = intent;
                                i20 = i352;
                                i19 = i14;
                            }
                        }
                    }
                case -726534248:
                case 1858041937:
                    ServiceConnectionC3453.m10564();
                    if (C2105.f7037 != 0) {
                        z = z4;
                        i = i31;
                        c12392 = c123923;
                        intent = intent3;
                        c9762 = c97623;
                        m2566 = C0630.m2566("ܽ۬") ^ i18;
                        i2 = ((m2566 ^ i17) * (-3803)) ^ 526876114;
                        i3 = -939441690;
                        int i3322 = m2566 ^ i3;
                        c97623 = c9762;
                        i19 = i2;
                        z4 = z;
                        i31 = i;
                        c123923 = c12392;
                        intent3 = intent;
                        i20 = i3322;
                    } else {
                        i = i31;
                        c12392 = c123923;
                        intent = intent3;
                        c9762 = c97623;
                        int m25663222 = (i17 - C0630.m2566("֨ܶ")) * 101;
                        i20 = m25663222 ^ 112726634;
                        c97623 = c9762;
                        i19 = ((m25663222 ^ i18) * (-30623)) ^ 1000805820;
                        i31 = i;
                        c123923 = c12392;
                        intent3 = intent;
                    }
                case -208367511:
                case 804748395:
                    z2 = z4;
                    i4 = i31;
                    c123922 = c123923;
                    intent2 = intent3;
                    sArr = sArr3;
                    i5 = i28;
                    i6 = i29;
                    c97622 = c97623;
                    s = f13020[39];
                    i26 = s * 34560;
                    m6981 = C2105.m6981("֡ۨ") ^ i18;
                    i7 = ((m6981 ^ i17) * 6259) ^ 712197509;
                    i8 = -213339656;
                    int i34222 = m6981 ^ i8;
                    c97623 = c97622;
                    sArr3 = sArr;
                    i28 = i5;
                    i29 = i6;
                    i19 = i7;
                    z4 = z2;
                    i31 = i4;
                    c123923 = c123922;
                    intent3 = intent2;
                    i20 = i34222;
                    activityC4094 = this;
                case -24676978:
                case 2097618562:
                    boolean z5 = z4;
                    int i36 = i31;
                    c12392 = c123923;
                    Intent intent4 = intent3;
                    short[] sArr5 = sArr3;
                    int i37 = i28;
                    int i38 = i29;
                    C9762 c97626 = c97623;
                    short s2 = s;
                    int i39 = s2 + 8640;
                    if (i26 - (i39 * i39) > 0) {
                        m69812 = (C2105.m6981("ۙᩳ") ^ i17) * (-25);
                        i9 = ((m69812 ^ i18) * 19635) ^ (-494880473);
                        i10 = 1025147534;
                    } else {
                        m69812 = C2105.m6981("֨ۘ") ^ i17;
                        i9 = ((m69812 ^ i18) * (-14415)) ^ (-761017065);
                        i10 = 910934839;
                    }
                    i11 = m69812 ^ i10;
                    s = s2;
                    c97623 = c97626;
                    sArr3 = sArr5;
                    i28 = i37;
                    i29 = i38;
                    i19 = i9;
                    z4 = z5;
                    i31 = i36;
                    intent3 = intent4;
                    activityC4094 = this;
                    i20 = i11;
                    c123923 = c12392;
                case 97720405:
                case 527636344:
                    C4263.m12813(activityC4094, i23 ^ i24);
                    z4 = true;
                    activityC4094.f13022.m30407(true);
                    if (C0483.f2088 >= 0) {
                        i = i31;
                        c12392 = c123923;
                        intent = intent3;
                        c9762 = c97623;
                        int m256632222 = (i17 - C0630.m2566("֨ܶ")) * 101;
                        i20 = m256632222 ^ 112726634;
                        c97623 = c9762;
                        i19 = ((m256632222 ^ i18) * (-30623)) ^ 1000805820;
                        i31 = i;
                        c123923 = c12392;
                        intent3 = intent;
                    } else {
                        m69814 = C2105.m6981("֨ۚ") ^ i17;
                        i14 = ((m69814 ^ i18) * (-29665)) ^ 2086292928;
                        i16 = -134606773;
                        i20 = m69814 ^ i16;
                        i19 = i14;
                    }
                case 304773867:
                case 319568420:
                    z2 = z4;
                    i4 = i31;
                    c123922 = c123923;
                    intent2 = intent3;
                    sArr = sArr3;
                    i5 = i28;
                    i6 = i29;
                    c97622 = c97623;
                    i25 = 45362;
                    m6981 = (C2105.m6981("᩶᩷") + i18) * (-3);
                    i7 = ((m6981 ^ i17) * (-30335)) ^ (-1271774648);
                    i8 = 1885530050;
                    int i342222 = m6981 ^ i8;
                    c97623 = c97622;
                    sArr3 = sArr;
                    i28 = i5;
                    i29 = i6;
                    i19 = i7;
                    z4 = z2;
                    i31 = i4;
                    c123923 = c123922;
                    intent3 = intent2;
                    i20 = i342222;
                    activityC4094 = this;
                case 627712676:
                case 919711331:
                    z2 = z4;
                    i4 = i31;
                    c123922 = c123923;
                    intent2 = intent3;
                    sArr = sArr3;
                    i5 = i28;
                    i6 = i29;
                    c97622 = c97623;
                    super.onCreate(bundle);
                    m10214();
                    i27 = C0630.m2566(ViewOnClickListenerC1958.m6435(f13020, 40, 3, i25));
                    if (RunnableC0588.f2309 < 0) {
                        m6981 = (i18 - C2105.m6981("۠᩹")) * 59;
                        i7 = ((m6981 ^ i17) * 27367) ^ (-528526523);
                        i8 = -809649888;
                        int i3422222 = m6981 ^ i8;
                        c97623 = c97622;
                        sArr3 = sArr;
                        i28 = i5;
                        i29 = i6;
                        i19 = i7;
                        z4 = z2;
                        i31 = i4;
                        c123923 = c123922;
                        intent3 = intent2;
                        i20 = i3422222;
                        activityC4094 = this;
                    }
                    m6981 = (C0630.m2566("ۨܺ") ^ i18) * (-51);
                    i7 = ((m6981 ^ i17) * 19693) ^ 472734507;
                    i8 = 1923792091;
                    int i34222222 = m6981 ^ i8;
                    c97623 = c97622;
                    sArr3 = sArr;
                    i28 = i5;
                    i29 = i6;
                    i19 = i7;
                    z4 = z2;
                    i31 = i4;
                    c123923 = c123922;
                    intent3 = intent2;
                    i20 = i34222222;
                    activityC4094 = this;
                case 768682410:
                case 2055381776:
                    i31 = 0;
                    activityC4094.f13022.m30507(false);
                    activityC4094.f13022.m30310(10.0f, 0);
                    c123923 = activityC4094.f13022;
                    m69814 = (C0630.m2566("᩶ۘ") + i18) * (-51);
                    i14 = ((m69814 ^ i17) * (-20611)) ^ (-106988181);
                    i16 = 1740551780;
                    i20 = m69814 ^ i16;
                    i19 = i14;
                case 797875553:
                case 1933837407:
                    z = z4;
                    i = i31;
                    c12392 = c123923;
                    intent = intent3;
                    c9762 = c97623;
                    C2272.m7515(activityC4094, c9762);
                    C1773.m5915(this);
                    c97624 = activityC4094.f10584;
                    onClickListener = new View.OnClickListener() { // from class: l.ۢܿ᩷
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i40 = -1721449727;
                            int i41 = C2167.f7158;
                            int i42 = C2958.f9394;
                            int m69817 = C2105.m6981("ܳ᩵") ^ i41;
                            int i43 = ((m69817 ^ i42) * (-9555)) ^ 1400260645;
                            int i44 = -1995792572;
                            while (true) {
                                i40 = ((((i40 ^ i42) * (-2483)) >> 31) & i43) ^ (m69817 ^ i44);
                                switch (i40) {
                                    case -1730361405:
                                    case -349964050:
                                        if (C22628.m50615() == 0) {
                                            m69817 = (C2105.m6981("᩻۬") + i42) * 87;
                                            i43 = ((m69817 ^ i41) * 1117) ^ 133748187;
                                            i44 = 1102327638;
                                        } else {
                                            m69817 = C2105.m6981("ܽܳ") ^ i41;
                                            i43 = ((m69817 ^ i42) * 22951) ^ 1442448332;
                                            i44 = 2114539901;
                                        }
                                    case -1486931251:
                                    case 1662199408:
                                        if (C0964.m3413()) {
                                            m69817 = (i42 - C2105.m6981("ܿۙ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i43 = ((m69817 ^ i41) * 32209) ^ 798205750;
                                            i44 = 388857733;
                                        } else {
                                            m69817 = (C2105.m6981("᩻۬") + i42) * 87;
                                            i43 = ((m69817 ^ i41) * 1117) ^ 133748187;
                                            i44 = 1102327638;
                                        }
                                    case -1307494877:
                                    case 1228299842:
                                        if (C1420.f5096 <= 0) {
                                            m69817 = (C2105.m6981("᩻۬") + i42) * 87;
                                            i43 = ((m69817 ^ i41) * 1117) ^ 133748187;
                                            i44 = 1102327638;
                                        } else {
                                            m69817 = (i42 - C2105.m6981("ۘۖ")) * 83;
                                            i43 = ((m69817 ^ i41) * (-26967)) ^ (-1917761692);
                                            i44 = 1519993107;
                                        }
                                    case -1141383374:
                                    case 1348266688:
                                        if (C2958.f9394 >= 0) {
                                            m69817 = (i41 - C0630.m2566("ۚᩴ")) * (-9);
                                            i43 = ((m69817 ^ i42) * (-6829)) ^ 1873283860;
                                            i44 = -1327595334;
                                        } else {
                                            m69817 = C0630.m2566("۟ۨ") ^ i42;
                                            i43 = ((m69817 ^ i41) * (-12109)) ^ 505995862;
                                            i44 = 510710733;
                                        }
                                    case -814076695:
                                    case 140512307:
                                        C0050.m940();
                                        C3746.m11369();
                                        break;
                                    case -813768459:
                                    case -127307207:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            m69817 = C2105.m6981("ܽܳ") ^ i41;
                                            i43 = ((m69817 ^ i42) * 22951) ^ 1442448332;
                                            i44 = 2114539901;
                                        } else {
                                            m69817 = (C0630.m2566("ܶܳ") + i41) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i43 = ((m69817 ^ i42) * (-9461)) ^ 1383007919;
                                            i44 = -1669652888;
                                        }
                                    case -813407123:
                                    case -346893645:
                                        if (C3019.m9255() <= 0) {
                                            m69817 = (C2105.m6981("᩻۬") + i42) * 87;
                                            i43 = ((m69817 ^ i41) * 1117) ^ 133748187;
                                            i44 = 1102327638;
                                        } else {
                                            m69817 = (C0630.m2566("ۜܿ") ^ i41) * (-91);
                                            i43 = ((m69817 ^ i42) * 15719) ^ 784510606;
                                            i44 = 1898982412;
                                        }
                                    case -338531442:
                                    case 494759416:
                                        int i45 = ActivityC4094.f13021;
                                        if (C5695.m16023() >= 0) {
                                            m69817 = (i41 - C0630.m2566("ۚᩴ")) * (-9);
                                            i43 = ((m69817 ^ i42) * (-6829)) ^ 1873283860;
                                            i44 = -1327595334;
                                        } else {
                                            m69817 = (C2105.m6981("ۧۗ") ^ i42) * (-117);
                                            i43 = ((m69817 ^ i41) * 2343) ^ 536640088;
                                            i44 = -565387598;
                                        }
                                    case -296474819:
                                    case 2006359748:
                                        if (C3019.f9544 >= 0) {
                                            m69817 = (i41 - C0630.m2566("ۚᩴ")) * (-9);
                                            i43 = ((m69817 ^ i42) * (-6829)) ^ 1873283860;
                                            i44 = -1327595334;
                                        } else {
                                            m69817 = (C0630.m2566("֡ܺ") + i42) * 101;
                                            i43 = ((m69817 ^ i41) * (-5785)) ^ (-370234277);
                                            i44 = 85383603;
                                        }
                                    case -61790555:
                                    case 617689160:
                                        C1420.m4913();
                                        m69817 = C2105.m6981("ܿܺ") ^ i41;
                                        i43 = ((m69817 ^ i42) * (-7873)) ^ 136442828;
                                        i44 = 372000532;
                                    case -57506775:
                                    case 547135368:
                                        if (C21923.f70183 != 0) {
                                            m69817 = (i41 - C0630.m2566("ۚᩴ")) * (-9);
                                            i43 = ((m69817 ^ i42) * (-6829)) ^ 1873283860;
                                            i44 = -1327595334;
                                        } else {
                                            m69817 = (C0630.m2566("ۘۡ") ^ i41) * (-51);
                                            i43 = ((m69817 ^ i42) * (-1723)) ^ (-354408241);
                                            i44 = -1409564129;
                                        }
                                    case 239448590:
                                    case 1598698771:
                                        ViewOnClickListenerC1958.m6429();
                                        if (RunnableC0588.f2309 >= 0) {
                                            m69817 = C2105.m6981("ܿܺ") ^ i41;
                                            i43 = ((m69817 ^ i42) * (-7873)) ^ 136442828;
                                            i44 = 372000532;
                                        } else {
                                            m69817 = (i42 - C2105.m6981("ܿۙ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i43 = ((m69817 ^ i41) * 32209) ^ 798205750;
                                            i44 = 388857733;
                                        }
                                    case 406283196:
                                    case 1782547063:
                                        if (C2105.f7037 != 0) {
                                            m69817 = C2105.m6981("ܽܳ") ^ i41;
                                            i43 = ((m69817 ^ i42) * 22951) ^ 1442448332;
                                            i44 = 2114539901;
                                        } else {
                                            m69817 = C0630.m2566("ۢۖ") ^ i41;
                                            i43 = ((m69817 ^ i42) * (-29959)) ^ (-355236916);
                                            i44 = -45684899;
                                        }
                                    case 605075279:
                                    case 1262639582:
                                        if (C2105.f7037 != 0) {
                                            m69817 = (i41 - C0630.m2566("ۚᩴ")) * (-9);
                                            i43 = ((m69817 ^ i42) * (-6829)) ^ 1873283860;
                                            i44 = -1327595334;
                                        } else {
                                            m69817 = (C0630.m2566("᩵ܽ") ^ i42) * 35;
                                            i43 = ((m69817 ^ i41) * 27759) ^ (-1878717949);
                                            i44 = 845523196;
                                        }
                                    case 692059967:
                                    case 1813773674:
                                        C2272.m7505(ActivityC4094.this);
                                        break;
                                    default:
                                        if (C1005.m3501()) {
                                            m69817 = (C0630.m2566("ۚۙ") + i41) * 41;
                                            i43 = ((m69817 ^ i42) * 14737) ^ (-958595540);
                                            i44 = 623764643;
                                        } else {
                                            m69817 = C2105.m6981("ܽܳ") ^ i41;
                                            i43 = ((m69817 ^ i42) * 22951) ^ 1442448332;
                                            i44 = 2114539901;
                                        }
                                }
                                return;
                            }
                        }
                    };
                    if (C11340.f33930 < 0) {
                        m2566 = (i17 - C0630.m2566("ۙ᩷")) * (-115);
                        i2 = ((m2566 ^ i18) * (-30409)) ^ 1999072956;
                        i3 = 1402184172;
                        int i33222 = m2566 ^ i3;
                        c97623 = c9762;
                        i19 = i2;
                        z4 = z;
                        i31 = i;
                        c123923 = c12392;
                        intent3 = intent;
                        i20 = i33222;
                    }
                    m2566 = C0630.m2566("ܽ۬") ^ i18;
                    i2 = ((m2566 ^ i17) * (-3803)) ^ 526876114;
                    i3 = -939441690;
                    int i332222 = m2566 ^ i3;
                    c97623 = c9762;
                    i19 = i2;
                    z4 = z;
                    i31 = i;
                    c123923 = c12392;
                    intent3 = intent;
                    i20 = i332222;
                case 990379894:
                case 1107394066:
                    RunnableC0588.m2441();
                    if (C4117.f13076 <= 0) {
                        z = z4;
                        i = i31;
                        c12392 = c123923;
                        intent = intent3;
                        c9762 = c97623;
                        m2566 = C0630.m2566("ܽ۬") ^ i18;
                        i2 = ((m2566 ^ i17) * (-3803)) ^ 526876114;
                        i3 = -939441690;
                        int i3322222 = m2566 ^ i3;
                        c97623 = c9762;
                        i19 = i2;
                        z4 = z;
                        i31 = i;
                        c123923 = c12392;
                        intent3 = intent;
                        i20 = i3322222;
                    } else {
                        m69814 = (i17 - C2105.m6981("᩷֨")) * 37;
                        i14 = ((m69814 ^ i18) * (-1345)) ^ (-1863273515);
                        i16 = -582270444;
                        i20 = m69814 ^ i16;
                        i19 = i14;
                    }
                case 1179565236:
                case 1990372065:
                    C4616.m13552();
                    break;
                default:
                    C1711.m5736();
                    C3537.m10746();
                    z = z4;
                    i = i31;
                    c12392 = c123923;
                    intent = intent3;
                    c9762 = c97623;
                    m2566 = C0630.m2566("ܽ۬") ^ i18;
                    i2 = ((m2566 ^ i17) * (-3803)) ^ 526876114;
                    i3 = -939441690;
                    int i33222222 = m2566 ^ i3;
                    c97623 = c9762;
                    i19 = i2;
                    z4 = z;
                    i31 = i;
                    c123923 = c12392;
                    intent3 = intent;
                    i20 = i33222222;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12295(ActivityC4094 activityC4094) {
        C12392 c12392 = null;
        String str = null;
        C12392 c123922 = null;
        int i = 832425137;
        int i2 = C4616.f14690;
        int i3 = RunnableC0588.f2309;
        int m2566 = (i3 - C0630.m2566("ܽ֫")) * 13;
        int i4 = ((m2566 ^ i2) * (-12479)) ^ 1772439984;
        int i5 = -605193090;
        while (true) {
            i = ((((i ^ i2) * 9017) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1263522412:
                case 548633046:
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = C0630.m2566("᩹ܰ") ^ i2;
                        i4 = ((m2566 ^ i3) * 24211) ^ (-1177477452);
                        i5 = 55276589;
                    } else {
                        m2566 = C2105.m6981("ܰ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2437)) ^ (-1412050541);
                        i5 = 35809311;
                    }
                case -1214488650:
                case 188847250:
                    str = "";
                    if (C2958.f9394 >= 0) {
                        m2566 = C0630.m2566("᩷ۢ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-17797)) ^ 1575321467;
                        i5 = 788037911;
                    } else {
                        m2566 = (C2105.m6981("ܰ۬") + i3) * (-49);
                        i4 = ((m2566 ^ i2) * (-8465)) ^ (-1567584020);
                        i5 = -2035018690;
                    }
                case -1211549412:
                case -896533921:
                    if (C2126.m7040()) {
                        m2566 = C2105.m6981("ܰ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2437)) ^ (-1412050541);
                        i5 = 35809311;
                    } else {
                        m2566 = (C0630.m2566("ۗ֫") ^ i2) * (-49);
                        i4 = ((m2566 ^ i3) * (-24465)) ^ (-74156616);
                        i5 = -761944345;
                    }
                case -1198518756:
                case 995172126:
                    if (C4159.f13567) {
                        m2566 = C2105.m6981("ܺᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-10915)) ^ 1411145696;
                        i5 = 1354444038;
                    } else {
                        m2566 = C2105.m6981("ܰ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2437)) ^ (-1412050541);
                        i5 = 35809311;
                    }
                case -1120649108:
                case 646287781:
                    ViewOnClickListenerC1958.m6429();
                    RunnableC1108.m3790();
                    m2566 = C0630.m2566("᩹ܰ") ^ i2;
                    i4 = ((m2566 ^ i3) * 24211) ^ (-1177477452);
                    i5 = 55276589;
                case -918542125:
                case 144668818:
                    c12392 = activityC4094.f13022;
                    if (C1773.m5908() <= 0) {
                        m2566 = (C0630.m2566("ۚۡ") ^ i3) * (-47);
                        i4 = ((m2566 ^ i2) * 71) ^ (-895849510);
                        i5 = -1705557826;
                    } else {
                        m2566 = C2105.m6981("ۘ᩻") ^ i2;
                        i4 = ((m2566 ^ i3) * 14791) ^ (-1518847824);
                        i5 = 771400945;
                    }
                case -642601813:
                case 138437788:
                    if (C2520.f8000 >= 0) {
                        m2566 = (C2105.m6981("᩶ۙ") ^ i3) * 97;
                        i4 = ((m2566 ^ i2) * 30369) ^ 1525374597;
                        i5 = 1908926633;
                    } else {
                        m2566 = (C0630.m2566("ۚۡ") ^ i3) * (-47);
                        i4 = ((m2566 ^ i2) * 71) ^ (-895849510);
                        i5 = -1705557826;
                    }
                case -344627162:
                case 636719418:
                    C3911.m11924();
                    RunnableC1937.m6387();
                    break;
                case -50091659:
                case 961750782:
                    c123922.scrollTo(0, 0);
                    break;
                case 2884283:
                case 1651661884:
                    C22628.m50616(c12392, str);
                    c123922 = activityC4094.f13022;
                    if (C2958.m9034() <= 0) {
                        m2566 = C2105.m6981("ܰ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2437)) ^ (-1412050541);
                        i5 = 35809311;
                    } else {
                        m2566 = (C0630.m2566("۟۠") + i2) * (-125);
                        i4 = ((m2566 ^ i3) * (-135)) ^ (-584500249);
                        i5 = 747370909;
                    }
                case 170733907:
                case 1285049038:
                    C15297.m36307();
                    if (C2272.f7362) {
                        m2566 = C0630.m2566("᩷ۢ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-17797)) ^ 1575321467;
                        i5 = 788037911;
                    } else {
                        m2566 = C2105.m6981("᩹ۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * 5843) ^ 2044128519;
                        i5 = 36928760;
                    }
                case 298847358:
                case 1151743019:
                    if (C1047.m3599() >= 0) {
                        m2566 = (C0630.m2566("ۚۡ") ^ i3) * (-47);
                        i4 = ((m2566 ^ i2) * 71) ^ (-895849510);
                        i5 = -1705557826;
                    } else {
                        m2566 = C2105.m6981("ܶ۬") ^ i3;
                        i4 = ((m2566 ^ i2) * (-13405)) ^ 1935424188;
                        i5 = -1916099823;
                    }
                case 338803400:
                case 980096927:
                    if (C3683.f11629 >= 0) {
                        m2566 = (C2105.m6981("᩶ۙ") ^ i3) * 97;
                        i4 = ((m2566 ^ i2) * 30369) ^ 1525374597;
                        i5 = 1908926633;
                    } else {
                        m2566 = C2105.m6981("᩶ۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * 9073) ^ (-647953292);
                        i5 = -1154137004;
                    }
                case 583893214:
                case 1654275072:
                    if (C3432.f10845 >= 0) {
                        m2566 = C0630.m2566("᩹ܰ") ^ i2;
                        i4 = ((m2566 ^ i3) * 24211) ^ (-1177477452);
                        i5 = 55276589;
                    } else {
                        m2566 = C2105.m6981("ۘۖ") ^ i2;
                        i4 = ((m2566 ^ i3) * 25309) ^ 2024259375;
                        i5 = 501881632;
                    }
                case 613128630:
                case 901974466:
                    if (C0050.f910 >= 0) {
                        m2566 = (C0630.m2566("ۚۡ") ^ i3) * (-47);
                        i4 = ((m2566 ^ i2) * 71) ^ (-895849510);
                        i5 = -1705557826;
                    } else {
                        m2566 = (C0630.m2566("ۘܽ") + i3) * (-125);
                        i4 = ((m2566 ^ i2) * 22547) ^ (-1259204873);
                        i5 = 2017476128;
                    }
                default:
                    C1504.m5179();
                    if (C7106.m19120() <= 0) {
                        m2566 = C0630.m2566("᩹ܰ") ^ i2;
                        i4 = ((m2566 ^ i3) * 24211) ^ (-1177477452);
                        i5 = 55276589;
                    } else {
                        m2566 = (C2105.m6981("᩶ۙ") ^ i3) * 97;
                        i4 = ((m2566 ^ i2) * 30369) ^ 1525374597;
                        i5 = 1908926633;
                    }
            }
            return;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m12299(String str) {
        int i;
        int i2;
        char c;
        int i3;
        int i4;
        int i5;
        String str2;
        int i6;
        int i7;
        int i8;
        int i9;
        String str3;
        int i10;
        String str4;
        char c2;
        int i11;
        int i12;
        int i13;
        int m2566;
        int i14;
        int i15;
        int i16;
        String str5;
        char c3;
        int m25662;
        int i17;
        int i18;
        String str6;
        String str7;
        int i19;
        int i20;
        int i21;
        File file;
        String str8;
        String str9;
        int i22;
        int i23;
        File file2;
        String str10;
        int i24;
        int i25;
        int i26;
        int m25663;
        int i27;
        int i28;
        int i29;
        String str11;
        String str12;
        int i30;
        String str13;
        int i31;
        int i32;
        int i33;
        String str14;
        File file3;
        char c4;
        String str15;
        int i34;
        int i35;
        int i36;
        int i37;
        File file4;
        File file5;
        int i38;
        String m16034;
        int i39;
        int m25664;
        int i40;
        int i41;
        String readLine;
        String str16;
        int i42;
        int i43;
        String str17;
        int i44;
        int i45;
        int m6981;
        int i46;
        int i47;
        int m69812;
        int i48;
        int i49;
        int i50;
        String str18;
        String str19;
        String str20;
        int m25665;
        int i51;
        int i52;
        int i53;
        String str21;
        String str22;
        char c5;
        int m69813;
        int i54;
        int i55;
        int m69814;
        int i56;
        String readLine2;
        int i57 = 0;
        char c6 = 0;
        char c7 = 0;
        boolean z = false;
        Iterator it = null;
        boolean z2 = false;
        String str23 = null;
        boolean z3 = false;
        int i58 = 0;
        int i59 = 1632497415;
        int i60 = C3432.f10845;
        int i61 = C3537.f11231;
        int m25666 = C0630.m2566("֫᩺") ^ i61;
        int i62 = ((m25666 ^ i60) * (-16815)) ^ 36880626;
        int i63 = m25666 ^ (-1175756528);
        String str24 = null;
        List list = null;
        Iterator it2 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        StringBuilder sb = null;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        char c8 = 0;
        int i70 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i71 = 0;
        int i72 = 0;
        int i73 = 0;
        int i74 = 0;
        int i75 = 0;
        BufferedReader bufferedReader = null;
        IOException iOException = null;
        int i76 = 0;
        File file6 = null;
        while (true) {
            i59 = i63 ^ (i62 & (((i59 ^ i60) * (-14559)) >> 31));
            switch (i59) {
                case -2113784537:
                case 274931753:
                    int i77 = i64;
                    String str28 = str27;
                    int i78 = i67;
                    int i79 = i72;
                    int i80 = i73;
                    int i81 = i76;
                    i23 = i66;
                    String str29 = str23;
                    String str30 = str24;
                    char c9 = c6;
                    int i82 = i71;
                    int i83 = i75;
                    int i84 = i65;
                    String m12252 = C4075.m12252(f13020, 35, 1, i81);
                    if (z) {
                        m69812 = C2105.m6981("᩷ܿ") ^ i61;
                        i48 = ((m69812 ^ i60) * (-25871)) ^ (-1837046384);
                        i49 = 1478748779;
                    } else {
                        m69812 = C2105.m6981("۟۬") ^ i60;
                        i48 = ((m69812 ^ i61) * (-323)) ^ 1577735180;
                        i49 = -557378644;
                    }
                    int i85 = m69812 ^ i49;
                    i76 = i81;
                    c6 = c9;
                    str23 = str29;
                    i64 = i77;
                    i67 = i78;
                    i63 = i85;
                    i72 = i79;
                    str27 = str28;
                    i50 = i80;
                    str25 = m12252;
                    i62 = i48;
                    i65 = i84;
                    i75 = i83;
                    i71 = i82;
                    str24 = str30;
                    i66 = i23;
                    i73 = i50;
                case -2001892089:
                case -401055576:
                    i16 = i64;
                    str6 = str26;
                    str7 = str27;
                    i19 = i67;
                    i20 = i72;
                    i21 = i76;
                    str8 = str23;
                    str9 = str25;
                    i22 = i73;
                    i23 = i66;
                    c3 = c6;
                    file2 = file6;
                    str10 = str24;
                    i24 = i71;
                    i25 = i75;
                    i26 = i65;
                    i57 = 0;
                    if (z4) {
                        m25663 = C0630.m2566("᩻ᩳ") ^ i60;
                        i27 = ((m25663 ^ i61) * (-21697)) ^ (-1037933463);
                        i28 = 1466238311;
                    } else {
                        m25663 = C2105.m6981("֫᩻") ^ i61;
                        i27 = ((m25663 ^ i60) * 14567) ^ (-1600643315);
                        i28 = -1137357403;
                    }
                    int i86 = m25663 ^ i28;
                    c6 = c3;
                    str23 = str8;
                    i65 = i26;
                    i64 = i16;
                    str26 = str6;
                    i63 = i86;
                    i62 = i27;
                    i72 = i20;
                    i75 = i25;
                    i71 = i24;
                    str27 = str7;
                    str24 = str10;
                    file6 = file2;
                    i66 = i23;
                    i73 = i22;
                    str25 = str9;
                    i76 = i21;
                    i67 = i19;
                case -1986404983:
                case 1405277747:
                    int i87 = i64;
                    str2 = str27;
                    int i88 = i67;
                    str16 = str25;
                    i7 = i72;
                    i42 = i73;
                    int i89 = i76;
                    i43 = i66;
                    String str31 = str23;
                    str17 = str24;
                    char c10 = c6;
                    i45 = i75;
                    i5 = i65;
                    int indexOf = ((String) RunnableC1108.m3791(it2)).indexOf(str16);
                    int m25667 = C0630.m2566("ܳᩴ") ^ i61;
                    i44 = indexOf;
                    i62 = ((m25667 ^ i60) * 29255) ^ 478994089;
                    i76 = i89;
                    c6 = c10;
                    str23 = str31;
                    i64 = i87;
                    i67 = i88;
                    i63 = m25667 ^ (-1425325080);
                    i72 = i7;
                    i65 = i5;
                    str27 = str2;
                    i75 = i45;
                    i71 = i44;
                    str24 = str17;
                    i66 = i43;
                    i73 = i42;
                    str25 = str16;
                case -1986120099:
                case -1166960601:
                    i16 = i64;
                    str6 = str26;
                    str7 = str27;
                    i19 = i67;
                    i20 = i72;
                    i21 = i76;
                    str8 = str23;
                    str9 = str25;
                    i22 = i73;
                    i23 = i66;
                    c3 = c6;
                    file2 = file6;
                    str10 = str24;
                    i24 = i71;
                    i25 = i75;
                    i26 = i65;
                    this.f13023 = str;
                    m25663 = (C2105.m6981("ܰܺ") + i60) * (-87);
                    i27 = ((m25663 ^ i61) * (-1735)) ^ (-1514826874);
                    i28 = 558944855;
                    int i862 = m25663 ^ i28;
                    c6 = c3;
                    str23 = str8;
                    i65 = i26;
                    i64 = i16;
                    str26 = str6;
                    i63 = i862;
                    i62 = i27;
                    i72 = i20;
                    i75 = i25;
                    i71 = i24;
                    str27 = str7;
                    str24 = str10;
                    file6 = file2;
                    i66 = i23;
                    i73 = i22;
                    str25 = str9;
                    i76 = i21;
                    i67 = i19;
                case -1905485860:
                case 1747408787:
                    i = i64;
                    str2 = str27;
                    i6 = i67;
                    str16 = str25;
                    i7 = i72;
                    i42 = i73;
                    i9 = i76;
                    i43 = i66;
                    str3 = str23;
                    str17 = str24;
                    c = c6;
                    i44 = i71;
                    i45 = i75;
                    i5 = i65;
                    z = C0483.m2123(it2);
                    m6981 = C2105.m6981("۫ᩴ") ^ i61;
                    i46 = ((m6981 ^ i60) * (-17259)) ^ (-353336599);
                    i47 = 1404815748;
                    int i90 = m6981 ^ i47;
                    i76 = i9;
                    c6 = c;
                    str23 = str3;
                    i64 = i;
                    i67 = i6;
                    i63 = i90;
                    i62 = i46;
                    i72 = i7;
                    i65 = i5;
                    str27 = str2;
                    i75 = i45;
                    i71 = i44;
                    str24 = str17;
                    i66 = i43;
                    i73 = i42;
                    str25 = str16;
                case -1850361951:
                case -1533691660:
                    try {
                        C1420.m4905(sb, str27);
                        C2105.m6979(sb, c7);
                        readLine2 = bufferedReader.readLine();
                        str27 = readLine2;
                        m69814 = C0630.m2566("֡ܳ") ^ i60;
                        i51 = ((m69814 ^ i61) * 24329) ^ 417966992;
                        i56 = 325584900;
                        i63 = m69814 ^ i56;
                        i62 = i51;
                    } catch (IOException e) {
                        iOException = e;
                        i16 = i64;
                        str6 = str26;
                        str7 = str27;
                        i19 = i67;
                        i20 = i72;
                        i21 = i76;
                        file = file6;
                        str8 = str23;
                        str9 = str25;
                        str10 = str24;
                        i22 = i73;
                        i23 = i66;
                        c3 = c6;
                        i24 = i71;
                        i25 = i75;
                        i26 = i65;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i91 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i91;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                case -1805783405:
                case -1476321429:
                    i = i64;
                    str2 = str27;
                    i6 = i67;
                    i7 = i72;
                    i2 = i75;
                    i9 = i76;
                    i5 = i65;
                    str3 = str23;
                    i8 = i73;
                    i43 = i66;
                    c = c6;
                    str17 = str24;
                    if (i68 == i2) {
                        m25665 = (C2105.m6981("ܺ᩵") + i60) * 31;
                        i51 = ((m25665 ^ i61) * 24179) ^ (-1545878329);
                        i52 = -1298531836;
                    } else {
                        m25665 = (C0630.m2566("ۙۛ") ^ i61) * (-31);
                        i51 = ((m25665 ^ i60) * (-24083)) ^ (-1401938312);
                        i52 = 1840947379;
                    }
                    int i92 = m25665 ^ i52;
                    str24 = str17;
                    i76 = i9;
                    c6 = c;
                    str23 = str3;
                    i66 = i43;
                    i67 = i6;
                    i73 = i8;
                    i72 = i7;
                    i65 = i5;
                    str27 = str2;
                    i75 = i2;
                    i64 = i;
                    i63 = i92;
                    i62 = i51;
                case -1751664113:
                case 1744560067:
                    i10 = i64;
                    str4 = str23;
                    i2 = i75;
                    i3 = i65;
                    c2 = c6;
                    i11 = i73;
                    i12 = i66;
                    int i93 = i74;
                    if (i93 == i11) {
                        m2566 = (C0630.m2566("ۙۡ") ^ i61) * (-43);
                        i74 = i93;
                        i14 = ((m2566 ^ i60) * 329) ^ 1701727707;
                        i15 = -788149663;
                        c6 = c2;
                        str23 = str4;
                        i4 = i10;
                        i63 = m2566 ^ i15;
                        i62 = i14;
                        i66 = i12;
                        i73 = i11;
                        i65 = i3;
                        i75 = i2;
                        i64 = i4;
                    } else {
                        i74 = i93;
                        i13 = i68;
                        m2566 = C0630.m2566("֡֡") ^ i61;
                        i12 = i13;
                        i14 = ((m2566 ^ i60) * 4161) ^ (-118750920);
                        i15 = -1133731626;
                        c6 = c2;
                        str23 = str4;
                        i4 = i10;
                        i63 = m2566 ^ i15;
                        i62 = i14;
                        i66 = i12;
                        i73 = i11;
                        i65 = i3;
                        i75 = i2;
                        i64 = i4;
                    }
                case -1725966429:
                case 583234486:
                    i16 = i64;
                    str6 = str26;
                    str7 = str27;
                    i19 = i67;
                    i20 = i72;
                    i21 = i76;
                    file = file6;
                    str8 = str23;
                    str9 = str25;
                    str10 = str24;
                    i22 = i73;
                    i23 = i66;
                    c3 = c6;
                    i24 = i71;
                    i25 = i75;
                    i26 = i65;
                    try {
                        file2 = file;
                        try {
                            this.f13022.postDelayed(new RunnableC9033(i57, this), 200L);
                            m25663 = (C0630.m2566("ܿܿ") + i60) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                            i27 = ((m25663 ^ i61) * 17575) ^ 10990090;
                            i28 = 1229508603;
                            int i8622 = m25663 ^ i28;
                            c6 = c3;
                            str23 = str8;
                            i65 = i26;
                            i64 = i16;
                            str26 = str6;
                            i63 = i8622;
                            i62 = i27;
                            i72 = i20;
                            i75 = i25;
                            i71 = i24;
                            str27 = str7;
                            str24 = str10;
                            file6 = file2;
                            i66 = i23;
                            i73 = i22;
                            str25 = str9;
                            i76 = i21;
                            i67 = i19;
                        } catch (IOException e2) {
                            iOException = e2;
                            file = file2;
                            m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                            i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                            i41 = -1533230784;
                            int i912 = m25664 ^ i41;
                            c6 = c3;
                            str23 = str8;
                            i66 = i23;
                            i65 = i26;
                            i64 = i16;
                            i63 = i912;
                            i62 = i40;
                            i72 = i20;
                            i73 = i22;
                            i75 = i25;
                            i71 = i24;
                            str27 = str7;
                            str25 = str9;
                            str24 = str10;
                            file6 = file;
                            i76 = i21;
                            i67 = i19;
                            str26 = str6;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        iOException = e;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i9122 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i9122;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                case -1683325218:
                case -1605322232:
                    i16 = i64;
                    str6 = str26;
                    str7 = str27;
                    i19 = i67;
                    i20 = i72;
                    i21 = i76;
                    file = file6;
                    str8 = str23;
                    str9 = str25;
                    str10 = str24;
                    i22 = i73;
                    i23 = i66;
                    c3 = c6;
                    i24 = i71;
                    i25 = i75;
                    i26 = i65;
                    try {
                        z5 = C1916.m6313(str);
                        m25664 = (i61 - C0630.m2566("ۚܺ")) * (-47);
                        i40 = ((m25664 ^ i60) * (-26681)) ^ 1956230827;
                        i41 = -1295851710;
                    } catch (IOException e4) {
                        e = e4;
                        iOException = e;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i91222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i91222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                    int i912222 = m25664 ^ i41;
                    c6 = c3;
                    str23 = str8;
                    i66 = i23;
                    i65 = i26;
                    i64 = i16;
                    i63 = i912222;
                    i62 = i40;
                    i72 = i20;
                    i73 = i22;
                    i75 = i25;
                    i71 = i24;
                    str27 = str7;
                    str25 = str9;
                    str24 = str10;
                    file6 = file;
                    i76 = i21;
                    i67 = i19;
                    str26 = str6;
                case -1658237550:
                case -1434192159:
                    i16 = i64;
                    str7 = str27;
                    i19 = i67;
                    String str32 = str23;
                    int i94 = i75;
                    i21 = i76;
                    i26 = i65;
                    c3 = c6;
                    int i95 = i73;
                    i23 = i66;
                    readLine = bufferedReader.readLine();
                    str9 = str25;
                    i20 = i72;
                    file = file6;
                    str8 = str32;
                    i22 = i95;
                    str10 = str24;
                    i24 = i71;
                    i25 = i94;
                    int m69815 = (C2105.m6981("᩻᩻") + i60) * 75;
                    c6 = c3;
                    str23 = str8;
                    i66 = i23;
                    i64 = i16;
                    i63 = m69815 ^ 1403121460;
                    i72 = i20;
                    i73 = i22;
                    str27 = str7;
                    str25 = str9;
                    i76 = i21;
                    i67 = i19;
                    File file7 = file;
                    str26 = readLine;
                    i62 = ((m69815 ^ i61) * 30825) ^ 1957217627;
                    i65 = i26;
                    i75 = i25;
                    i71 = i24;
                    str24 = str10;
                    file6 = file7;
                case -1575676875:
                case 1929099437:
                    C21923.m49331(this.f13022, C3939.m11987(iOException));
                    break;
                case -1542534487:
                case 196787710:
                    str22 = str23;
                    if (z3) {
                        m69813 = C0630.m2566("ۤۤ") ^ i61;
                        c5 = c6;
                        i54 = ((m69813 ^ i60) * (-32187)) ^ (-1767807440);
                        i55 = -1456070052;
                        i63 = m69813 ^ i55;
                        i62 = i54;
                        c6 = c5;
                        str23 = str22;
                    } else {
                        c = c6;
                        i = i64;
                        str2 = str27;
                        i6 = i67;
                        i7 = i72;
                        i2 = i75;
                        i9 = i76;
                        str3 = str22;
                        i5 = i65;
                        i8 = i73;
                        i43 = i66;
                        str17 = str24;
                        m25665 = (C2105.m6981("᩶᩵") + i61) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i51 = ((m25665 ^ i60) * 30977) ^ 2105328068;
                        i52 = -934586754;
                        int i922 = m25665 ^ i52;
                        str24 = str17;
                        i76 = i9;
                        c6 = c;
                        str23 = str3;
                        i66 = i43;
                        i67 = i6;
                        i73 = i8;
                        i72 = i7;
                        i65 = i5;
                        str27 = str2;
                        i75 = i2;
                        i64 = i;
                        i63 = i922;
                        i62 = i51;
                    }
                case -1538140225:
                case 1408120089:
                    i29 = i64;
                    str11 = str26;
                    str12 = str27;
                    i30 = i67;
                    str13 = str25;
                    i31 = i72;
                    i32 = i73;
                    i33 = i66;
                    str14 = str23;
                    file3 = file6;
                    c4 = c6;
                    str15 = str24;
                    i34 = i71;
                    i35 = i75;
                    i36 = i65;
                    i37 = 27827;
                    int m25668 = C0630.m2566("ܳ֡") ^ i61;
                    c6 = c4;
                    str23 = str14;
                    i64 = i29;
                    i67 = i30;
                    str26 = str11;
                    i63 = m25668 ^ 1808298147;
                    i72 = i31;
                    str27 = str12;
                    String str33 = str13;
                    i76 = i37;
                    i62 = ((m25668 ^ i60) * 28349) ^ (-996269178);
                    i65 = i36;
                    i75 = i35;
                    i71 = i34;
                    str24 = str15;
                    file6 = file3;
                    i66 = i33;
                    i73 = i32;
                    str25 = str33;
                case -1501763938:
                case -1344445346:
                    if (str27 != null) {
                        m69814 = C2105.m6981("ۤۚ") ^ i60;
                        i51 = ((m69814 ^ i61) * 14515) ^ 2016519830;
                        i56 = -1776160080;
                        i63 = m69814 ^ i56;
                        i62 = i51;
                    } else {
                        i16 = i64;
                        readLine = str27;
                        str7 = readLine;
                        i19 = i67;
                        i20 = i72;
                        i21 = i76;
                        file = file6;
                        str8 = str23;
                        str9 = str25;
                        str10 = str24;
                        i22 = i73;
                        i23 = i66;
                        c3 = c6;
                        i24 = i71;
                        i25 = i75;
                        i26 = i65;
                        int m698152 = (C2105.m6981("᩻᩻") + i60) * 75;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i64 = i16;
                        i63 = m698152 ^ 1403121460;
                        i72 = i20;
                        i73 = i22;
                        str27 = str7;
                        str25 = str9;
                        i76 = i21;
                        i67 = i19;
                        File file72 = file;
                        str26 = readLine;
                        i62 = ((m698152 ^ i61) * 30825) ^ 1957217627;
                        i65 = i26;
                        i75 = i25;
                        i71 = i24;
                        str24 = str10;
                        file6 = file72;
                    }
                case -1490396813:
                case 1523619831:
                    break;
                case -1446787895:
                case -356569676:
                    i16 = i64;
                    str7 = str27;
                    i19 = i67;
                    int i96 = i71;
                    i20 = i72;
                    int i97 = i75;
                    i21 = i76;
                    i26 = i65;
                    str8 = str23;
                    int i98 = i73;
                    i23 = i66;
                    c3 = c6;
                    str18 = str24;
                    try {
                        i25 = i97;
                    } catch (IOException e5) {
                        e = e5;
                        i25 = i97;
                    }
                    try {
                        str19 = (String) C2272.m7513(it);
                        i24 = i96;
                        str20 = str25;
                    } catch (IOException e6) {
                        e = e6;
                        i24 = i96;
                        iOException = e;
                        str6 = str26;
                        str9 = str25;
                        file = file6;
                        i22 = i98;
                        str10 = str18;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i9122222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i9122222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                    try {
                        i68 = str19.indexOf(str20);
                        int m25669 = (C0630.m2566("ۛܽ") + i60) * (-29);
                        i72 = i20;
                        i76 = i21;
                        c6 = c3;
                        str23 = str19;
                        str27 = str7;
                        i67 = i19;
                        str25 = str20;
                        i63 = m25669 ^ (-728115179);
                        i62 = ((m25669 ^ i61) * 6863) ^ 1353344756;
                        i64 = i16;
                        i73 = i98;
                        i65 = i26;
                        i75 = i25;
                        i71 = i24;
                        str24 = str18;
                        i66 = i23;
                    } catch (IOException e7) {
                        iOException = e7;
                        str9 = str20;
                        str6 = str26;
                        str8 = str19;
                        file = file6;
                        i22 = i98;
                        str10 = str18;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i91222222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i91222222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                case -1307293491:
                case 530237700:
                    try {
                        str5 = str23;
                    } catch (IOException e8) {
                        e = e8;
                        str5 = str23;
                    }
                    try {
                        sb.append((CharSequence) str5, i66, C0798.m3007(str23));
                        C0630.m2567(sb, c7);
                        i = i64;
                        c = c6;
                        str2 = str27;
                        i6 = i67;
                        i7 = i72;
                        i9 = i76;
                        str3 = str5;
                        str16 = str25;
                        i42 = i73;
                        i43 = i66;
                        str17 = str24;
                        i44 = i71;
                        i45 = i75;
                        i5 = i65;
                        m6981 = C0630.m2566("᩸ܽ") ^ i60;
                        i46 = ((m6981 ^ i61) * (-22471)) ^ 680120351;
                        i47 = -1965795646;
                        int i902 = m6981 ^ i47;
                        i76 = i9;
                        c6 = c;
                        str23 = str3;
                        i64 = i;
                        i67 = i6;
                        i63 = i902;
                        i62 = i46;
                        i72 = i7;
                        i65 = i5;
                        str27 = str2;
                        i75 = i45;
                        i71 = i44;
                        str24 = str17;
                        i66 = i43;
                        i73 = i42;
                        str25 = str16;
                    } catch (IOException e9) {
                        e = e9;
                        iOException = e;
                        i16 = i64;
                        str6 = str26;
                        c3 = c6;
                        str7 = str27;
                        i19 = i67;
                        i20 = i72;
                        i21 = i76;
                        file = file6;
                        str8 = str5;
                        str9 = str25;
                        str10 = str24;
                        i22 = i73;
                        i23 = i66;
                        i24 = i71;
                        i25 = i75;
                        i26 = i65;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i912222222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i912222222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                case -1299671413:
                case 1594664121:
                    i = i64;
                    str2 = str27;
                    i6 = i67;
                    String str34 = str23;
                    int i99 = i75;
                    i9 = i76;
                    i5 = i65;
                    c = c6;
                    int i100 = i73;
                    i43 = i66;
                    C3245.m9923(sb, str34);
                    C2105.m6979(sb, c7);
                    i7 = i72;
                    str17 = str24;
                    str3 = str34;
                    str16 = str25;
                    i44 = i71;
                    i45 = i99;
                    i42 = i100;
                    m6981 = C0630.m2566("᩸ܽ") ^ i60;
                    i46 = ((m6981 ^ i61) * (-22471)) ^ 680120351;
                    i47 = -1965795646;
                    int i9022 = m6981 ^ i47;
                    i76 = i9;
                    c6 = c;
                    str23 = str3;
                    i64 = i;
                    i67 = i6;
                    i63 = i9022;
                    i62 = i46;
                    i72 = i7;
                    i65 = i5;
                    str27 = str2;
                    i75 = i45;
                    i71 = i44;
                    str24 = str17;
                    i66 = i43;
                    i73 = i42;
                    str25 = str16;
                case -1285815735:
                case 1838982020:
                    str5 = str23;
                    c3 = c6;
                    try {
                    } catch (IOException e10) {
                        e = e10;
                    }
                    try {
                        z3 = C1294.m4369(C11340.m28015(str26, i64, i65), str);
                        m25662 = C2105.m6981("۫ۨ") ^ i61;
                        i16 = i64;
                        i17 = ((m25662 ^ i60) * 4165) ^ 1423852972;
                        i18 = 1974934462;
                        c6 = c3;
                        str23 = str5;
                        i4 = i16;
                        i63 = m25662 ^ i18;
                        i62 = i17;
                        i64 = i4;
                    } catch (IOException e11) {
                        e = e11;
                        i16 = i64;
                        iOException = e;
                        str6 = str26;
                        str7 = str27;
                        i19 = i67;
                        i20 = i72;
                        i21 = i76;
                        file = file6;
                        str8 = str5;
                        str9 = str25;
                        str10 = str24;
                        i22 = i73;
                        i23 = i66;
                        i24 = i71;
                        i25 = i75;
                        i26 = i65;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i9122222222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i9122222222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                case -1281307302:
                case -939332638:
                    i16 = i64;
                    String str35 = str23;
                    int i101 = i75;
                    i26 = i65;
                    c3 = c6;
                    int i102 = i73;
                    i23 = i66;
                    try {
                        str7 = str27;
                        i19 = i67;
                        i21 = i76;
                        try {
                        } catch (IOException e12) {
                            e = e12;
                            iOException = e;
                            str6 = str26;
                            str9 = str25;
                            i20 = i72;
                            file = file6;
                            str8 = str35;
                            i22 = i102;
                            str10 = str24;
                            i24 = i71;
                            i25 = i101;
                            m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                            i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                            i41 = -1533230784;
                            int i91222222222 = m25664 ^ i41;
                            c6 = c3;
                            str23 = str8;
                            i66 = i23;
                            i65 = i26;
                            i64 = i16;
                            i63 = i91222222222;
                            i62 = i40;
                            i72 = i20;
                            i73 = i22;
                            i75 = i25;
                            i71 = i24;
                            str27 = str7;
                            str25 = str9;
                            str24 = str10;
                            file6 = file;
                            i76 = i21;
                            i67 = i19;
                            str26 = str6;
                        }
                        try {
                            int indexOf2 = str26.indexOf(C1916.m6311(f13020, 36, 3, i21), 15);
                            int m256610 = (i60 - C0630.m2566("ܶ᩷")) * (-37);
                            int i103 = ((m256610 ^ i61) * 12177) ^ 809408651;
                            i75 = i101;
                            i63 = m256610 ^ (-774648448);
                            i76 = i21;
                            c6 = c3;
                            str27 = str7;
                            i67 = i19;
                            i64 = 15;
                            str23 = str35;
                            i50 = i102;
                            i65 = indexOf2;
                            i62 = i103;
                            i66 = i23;
                            i73 = i50;
                        } catch (IOException e13) {
                            iOException = e13;
                            str6 = str26;
                            str9 = str25;
                            i20 = i72;
                            file = file6;
                            i16 = 15;
                            str8 = str35;
                            i22 = i102;
                            str10 = str24;
                            i24 = i71;
                            i25 = i101;
                            m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                            i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                            i41 = -1533230784;
                            int i912222222222 = m25664 ^ i41;
                            c6 = c3;
                            str23 = str8;
                            i66 = i23;
                            i65 = i26;
                            i64 = i16;
                            i63 = i912222222222;
                            i62 = i40;
                            i72 = i20;
                            i73 = i22;
                            i75 = i25;
                            i71 = i24;
                            str27 = str7;
                            str25 = str9;
                            str24 = str10;
                            file6 = file;
                            i76 = i21;
                            i67 = i19;
                            str26 = str6;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        str7 = str27;
                        i19 = i67;
                        i21 = i76;
                    }
                case -1208609963:
                case 1582242540:
                    i = i64;
                    str2 = str27;
                    i6 = i67;
                    i7 = i72;
                    i2 = i75;
                    i9 = i76;
                    i5 = i65;
                    str3 = str23;
                    i8 = i73;
                    i43 = i66;
                    c = c6;
                    str17 = str24;
                    if (str26 != null) {
                        m25665 = C0630.m2566("֫ܳ") ^ i61;
                        i51 = ((m25665 ^ i60) * 31837) ^ 679928737;
                        i52 = -469754349;
                        int i9222 = m25665 ^ i52;
                        str24 = str17;
                        i76 = i9;
                        c6 = c;
                        str23 = str3;
                        i66 = i43;
                        i67 = i6;
                        i73 = i8;
                        i72 = i7;
                        i65 = i5;
                        str27 = str2;
                        i75 = i2;
                        i64 = i;
                        i63 = i9222;
                        i62 = i51;
                    } else {
                        str16 = str25;
                        i44 = i71;
                        i45 = i2;
                        i42 = i8;
                        m6981 = C2105.m6981("ۜᩴ") ^ i61;
                        i46 = ((m6981 ^ i60) * 23207) ^ (-1322448830);
                        i47 = -962630192;
                        int i90222 = m6981 ^ i47;
                        i76 = i9;
                        c6 = c;
                        str23 = str3;
                        i64 = i;
                        i67 = i6;
                        i63 = i90222;
                        i62 = i46;
                        i72 = i7;
                        i65 = i5;
                        str27 = str2;
                        i75 = i45;
                        i71 = i44;
                        str24 = str17;
                        i66 = i43;
                        i73 = i42;
                        str25 = str16;
                    }
                case -943170583:
                case -852589898:
                    c8 = C1711.m5733(str27, i57);
                    m69814 = (C2105.m6981("ܶᩴ") ^ i61) * (-27);
                    i51 = ((m69814 ^ i60) * (-28631)) ^ 1155051073;
                    i56 = 1035310541;
                    i63 = m69814 ^ i56;
                    i62 = i51;
                case -857841418:
                case 1809027945:
                    i = i64;
                    str2 = str27;
                    i6 = i67;
                    str16 = str25;
                    i7 = i72;
                    i42 = i73;
                    i9 = i76;
                    i43 = i66;
                    str3 = str23;
                    str17 = str24;
                    c = c6;
                    i44 = i71;
                    i45 = i75;
                    i5 = i65;
                    it = RunnableC1937.m6374(list);
                    m6981 = C0630.m2566("᩸ܽ") ^ i60;
                    i46 = ((m6981 ^ i61) * (-22471)) ^ 680120351;
                    i47 = -1965795646;
                    int i902222 = m6981 ^ i47;
                    i76 = i9;
                    c6 = c;
                    str23 = str3;
                    i64 = i;
                    i67 = i6;
                    i63 = i902222;
                    i62 = i46;
                    i72 = i7;
                    i65 = i5;
                    str27 = str2;
                    i75 = i45;
                    i71 = i44;
                    str24 = str17;
                    i66 = i43;
                    i73 = i42;
                    str25 = str16;
                case -849989244:
                case -589921335:
                    if (c8 == c6) {
                        m69814 = (i61 - C2105.m6981("᩸ۧ")) * 3;
                        i51 = ((m69814 ^ i60) * (-1781)) ^ (-83577690);
                        i56 = -776680859;
                        i63 = m69814 ^ i56;
                        i62 = i51;
                    } else {
                        i16 = i64;
                        readLine = str27;
                        str7 = readLine;
                        i19 = i67;
                        i20 = i72;
                        i21 = i76;
                        file = file6;
                        str8 = str23;
                        str9 = str25;
                        str10 = str24;
                        i22 = i73;
                        i23 = i66;
                        c3 = c6;
                        i24 = i71;
                        i25 = i75;
                        i26 = i65;
                        int m6981522 = (C2105.m6981("᩻᩻") + i60) * 75;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i64 = i16;
                        i63 = m6981522 ^ 1403121460;
                        i72 = i20;
                        i73 = i22;
                        str27 = str7;
                        str25 = str9;
                        i76 = i21;
                        i67 = i19;
                        File file722 = file;
                        str26 = readLine;
                        i62 = ((m6981522 ^ i61) * 30825) ^ 1957217627;
                        i65 = i26;
                        i75 = i25;
                        i71 = i24;
                        str24 = str10;
                        file6 = file722;
                    }
                case -840052856:
                case 1485583245:
                    i16 = i64;
                    str6 = str26;
                    str7 = str27;
                    i19 = i67;
                    i20 = i72;
                    i21 = i76;
                    file = file6;
                    str8 = str23;
                    str9 = str25;
                    str10 = str24;
                    i22 = i73;
                    i23 = i66;
                    c3 = c6;
                    i24 = i71;
                    i25 = i75;
                    i26 = i65;
                    if (z5) {
                        file5 = file;
                        i38 = i22;
                        i39 = i25;
                        m16034 = str10;
                        int m256611 = (C0630.m2566("ۜ᩵") ^ i61) * (-31);
                        file6 = file5;
                        c6 = c3;
                        str23 = str8;
                        i71 = i24;
                        i66 = i23;
                        i64 = i16;
                        str24 = m16034;
                        i63 = m256611 ^ (-1371198600);
                        i73 = i38;
                        i62 = ((m256611 ^ i60) * 25563) ^ 1929977690;
                        i72 = i20;
                        i65 = i26;
                        str27 = str7;
                        str26 = str6;
                        i75 = i39;
                        str25 = str9;
                        i76 = i21;
                        i67 = i19;
                    } else {
                        m25664 = (i60 - C2105.m6981("ᩴۖ")) * (-39);
                        i40 = ((m25664 ^ i61) * 15769) ^ 1482560856;
                        i41 = -1911596786;
                        int i9122222222222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i9122222222222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                case -796672958:
                case 767501160:
                    i29 = i64;
                    str11 = str26;
                    str12 = str27;
                    i30 = i67;
                    str13 = str25;
                    i31 = i72;
                    i32 = i73;
                    i33 = i66;
                    str14 = str23;
                    file3 = file6;
                    c4 = c6;
                    str15 = str24;
                    i34 = i71;
                    i35 = i75;
                    i36 = i65;
                    i37 = 9246;
                    int m256682 = C0630.m2566("ܳ֡") ^ i61;
                    c6 = c4;
                    str23 = str14;
                    i64 = i29;
                    i67 = i30;
                    str26 = str11;
                    i63 = m256682 ^ 1808298147;
                    i72 = i31;
                    str27 = str12;
                    String str332 = str13;
                    i76 = i37;
                    i62 = ((m256682 ^ i60) * 28349) ^ (-996269178);
                    i65 = i36;
                    i75 = i35;
                    i71 = i34;
                    str24 = str15;
                    file6 = file3;
                    i66 = i33;
                    i73 = i32;
                    str25 = str332;
                case -796142117:
                case 1419119189:
                    i16 = i64;
                    str6 = str26;
                    str7 = str27;
                    i19 = i67;
                    i20 = i72;
                    i21 = i76;
                    str8 = str23;
                    str9 = str25;
                    i22 = i73;
                    i23 = i66;
                    c3 = c6;
                    str10 = str24;
                    i24 = i71;
                    i25 = i75;
                    i26 = i65;
                    C20510 c20510 = C15297.f46931;
                    try {
                        file4 = new File(C4925.m14322(), C21923.m49334(f13020, 22, 10, i21));
                    } catch (IOException e15) {
                        iOException = e15;
                        file = null;
                    }
                    try {
                        z4 = C0798.m3003(file4);
                        int m256612 = C0630.m2566("֡᩷") ^ i61;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i64 = i16;
                        str26 = str6;
                        i63 = m256612 ^ 966894612;
                        i62 = ((m256612 ^ i60) * (-25531)) ^ 818143051;
                        i72 = i20;
                        i73 = i22;
                        i65 = i26;
                        str27 = str7;
                        str25 = str9;
                        i76 = i21;
                        i75 = i25;
                        i71 = i24;
                        str24 = str10;
                        i67 = i19;
                        file6 = file4;
                    } catch (IOException e16) {
                        iOException = e16;
                        file = file4;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i91222222222222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i91222222222222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                case -782860238:
                case 901358769:
                    i16 = i64;
                    str7 = str27;
                    i19 = i67;
                    i20 = i72;
                    int i104 = i75;
                    i21 = i76;
                    i26 = i65;
                    str8 = str23;
                    i53 = i73;
                    i23 = i66;
                    c3 = c6;
                    str21 = str24;
                    try {
                        int indexOf3 = str26.indexOf(str21);
                        int m69816 = (C2105.m6981("۠ۨ") + i60) * 73;
                        str24 = str21;
                        i76 = i21;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i67 = i19;
                        i72 = indexOf3;
                        i73 = i53;
                        i62 = ((m69816 ^ i61) * 3697) ^ 53059550;
                        i65 = i26;
                        str27 = str7;
                        i75 = i104;
                        i64 = i16;
                        i63 = m69816 ^ (-418270812);
                    } catch (IOException e17) {
                        iOException = e17;
                        str6 = str26;
                        str9 = str25;
                        i24 = i71;
                        file = file6;
                        i25 = i104;
                        i22 = i53;
                        str10 = str21;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i912222222222222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i912222222222222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                case -690726768:
                case 1142754580:
                    i = i64;
                    str2 = str27;
                    i6 = i67;
                    String str36 = str23;
                    i7 = i72;
                    i2 = i75;
                    i9 = i76;
                    i5 = i65;
                    c = c6;
                    i8 = i73;
                    i43 = i66;
                    str17 = str24;
                    if (i7 == i8) {
                        m25665 = C2105.m6981("ۨ᩷") ^ i60;
                        str3 = str36;
                        i51 = ((m25665 ^ i61) * (-18007)) ^ 917702349;
                        i52 = 2098610245;
                        int i92222 = m25665 ^ i52;
                        str24 = str17;
                        i76 = i9;
                        c6 = c;
                        str23 = str3;
                        i66 = i43;
                        i67 = i6;
                        i73 = i8;
                        i72 = i7;
                        i65 = i5;
                        str27 = str2;
                        i75 = i2;
                        i64 = i;
                        i63 = i92222;
                        i62 = i51;
                    } else {
                        str3 = str36;
                        m25665 = (C2105.m6981("᩶᩵") + i61) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i51 = ((m25665 ^ i60) * 30977) ^ 2105328068;
                        i52 = -934586754;
                        int i922222 = m25665 ^ i52;
                        str24 = str17;
                        i76 = i9;
                        c6 = c;
                        str23 = str3;
                        i66 = i43;
                        i67 = i6;
                        i73 = i8;
                        i72 = i7;
                        i65 = i5;
                        str27 = str2;
                        i75 = i2;
                        i64 = i;
                        i63 = i922222;
                        i62 = i51;
                    }
                case -660815560:
                case -495841001:
                    i16 = i64;
                    str6 = str26;
                    str7 = str27;
                    i19 = i67;
                    i20 = i72;
                    i21 = i76;
                    str8 = str23;
                    str9 = str25;
                    i22 = i73;
                    i23 = i66;
                    c3 = c6;
                    file2 = file6;
                    str10 = str24;
                    i24 = i71;
                    i25 = i75;
                    i26 = i65;
                    try {
                        sb = new StringBuilder();
                        m25663 = C0630.m2566("ܶܳ") ^ i61;
                        i27 = ((m25663 ^ i60) * 5887) ^ (-608345033);
                        i28 = -440108796;
                        int i86222 = m25663 ^ i28;
                        c6 = c3;
                        str23 = str8;
                        i65 = i26;
                        i64 = i16;
                        str26 = str6;
                        i63 = i86222;
                        i62 = i27;
                        i72 = i20;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str24 = str10;
                        file6 = file2;
                        i66 = i23;
                        i73 = i22;
                        str25 = str9;
                        i76 = i21;
                        i67 = i19;
                    } catch (IOException e18) {
                        iOException = e18;
                        file = file2;
                        sb = null;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i9122222222222222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i9122222222222222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                case -645029659:
                case 880645107:
                    i16 = i64;
                    i26 = i65;
                    str6 = str26;
                    i23 = i66;
                    str7 = str27;
                    i19 = i67;
                    i24 = i71;
                    i20 = i72;
                    i21 = i76;
                    file5 = file6;
                    str8 = str23;
                    str9 = str25;
                    i38 = 12;
                    m16034 = C5695.m16034(f13020, 32, 3, i21);
                    c7 = '\n';
                    if (str != null) {
                        int m256613 = (C0630.m2566("᩷᩶") ^ i60) * 35;
                        file6 = file5;
                        str23 = str8;
                        i71 = i24;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        str25 = str9;
                        c6 = ' ';
                        i73 = 12;
                        i75 = -1;
                        str24 = m16034;
                        i62 = ((m256613 ^ i61) * (-22377)) ^ (-1782086513);
                        i63 = m256613 ^ 1501724187;
                        i72 = i20;
                        i76 = i21;
                        str27 = str7;
                        i67 = i19;
                        str26 = str6;
                    } else {
                        c3 = ' ';
                        i39 = -1;
                        int m2566112 = (C0630.m2566("ۜ᩵") ^ i61) * (-31);
                        file6 = file5;
                        c6 = c3;
                        str23 = str8;
                        i71 = i24;
                        i66 = i23;
                        i64 = i16;
                        str24 = m16034;
                        i63 = m2566112 ^ (-1371198600);
                        i73 = i38;
                        i62 = ((m2566112 ^ i60) * 25563) ^ 1929977690;
                        i72 = i20;
                        i65 = i26;
                        str27 = str7;
                        str26 = str6;
                        i75 = i39;
                        str25 = str9;
                        i76 = i21;
                        i67 = i19;
                    }
                case -619278702:
                case 1990209198:
                    i = i64;
                    str2 = str27;
                    i6 = i67;
                    str16 = str25;
                    i7 = i72;
                    i42 = i73;
                    i9 = i76;
                    i43 = i66;
                    str3 = str23;
                    str17 = str24;
                    c = c6;
                    i44 = i71;
                    i45 = i75;
                    i5 = i65;
                    if (z2) {
                        m6981 = C0630.m2566("ۗ۬") ^ i60;
                        i46 = ((m6981 ^ i61) * (-32397)) ^ 1673812136;
                        i47 = 1605086313;
                        int i9022222 = m6981 ^ i47;
                        i76 = i9;
                        c6 = c;
                        str23 = str3;
                        i64 = i;
                        i67 = i6;
                        i63 = i9022222;
                        i62 = i46;
                        i72 = i7;
                        i65 = i5;
                        str27 = str2;
                        i75 = i45;
                        i71 = i44;
                        str24 = str17;
                        i66 = i43;
                        i73 = i42;
                        str25 = str16;
                    }
                    m6981 = C2105.m6981("ۜᩴ") ^ i61;
                    i46 = ((m6981 ^ i60) * 23207) ^ (-1322448830);
                    i47 = -962630192;
                    int i90222222 = m6981 ^ i47;
                    i76 = i9;
                    c6 = c;
                    str23 = str3;
                    i64 = i;
                    i67 = i6;
                    i63 = i90222222;
                    i62 = i46;
                    i72 = i7;
                    i65 = i5;
                    str27 = str2;
                    i75 = i45;
                    i71 = i44;
                    str24 = str17;
                    i66 = i43;
                    i73 = i42;
                    str25 = str16;
                case -462730152:
                case 1244329148:
                    i16 = i64;
                    str7 = str27;
                    i19 = i67;
                    String str37 = str25;
                    i20 = i72;
                    i22 = i73;
                    i21 = i76;
                    i23 = i66;
                    str8 = str23;
                    String str38 = str24;
                    c3 = c6;
                    i24 = i71;
                    i25 = i75;
                    i26 = i65;
                    try {
                        str9 = str37;
                    } catch (IOException e19) {
                        e = e19;
                        str9 = str37;
                    }
                    try {
                        str6 = str26;
                        file = file6;
                    } catch (IOException e20) {
                        e = e20;
                        str6 = str26;
                        file = file6;
                        str10 = str38;
                        iOException = e;
                        bufferedReader = null;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i91222222222222222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i91222222222222222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                    try {
                        str10 = str38;
                    } catch (IOException e21) {
                        e = e21;
                        str10 = str38;
                        iOException = e;
                        bufferedReader = null;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i912222222222222222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i912222222222222222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
                        try {
                            readLine = bufferedReader2.readLine();
                            bufferedReader = bufferedReader2;
                            int m69815222 = (C2105.m6981("᩻᩻") + i60) * 75;
                            c6 = c3;
                            str23 = str8;
                            i66 = i23;
                            i64 = i16;
                            i63 = m69815222 ^ 1403121460;
                            i72 = i20;
                            i73 = i22;
                            str27 = str7;
                            str25 = str9;
                            i76 = i21;
                            i67 = i19;
                            File file7222 = file;
                            str26 = readLine;
                            i62 = ((m69815222 ^ i61) * 30825) ^ 1957217627;
                            i65 = i26;
                            i75 = i25;
                            i71 = i24;
                            str24 = str10;
                            file6 = file7222;
                        } catch (IOException e22) {
                            iOException = e22;
                            bufferedReader = bufferedReader2;
                            m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                            i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                            i41 = -1533230784;
                            int i9122222222222222222 = m25664 ^ i41;
                            c6 = c3;
                            str23 = str8;
                            i66 = i23;
                            i65 = i26;
                            i64 = i16;
                            i63 = i9122222222222222222;
                            i62 = i40;
                            i72 = i20;
                            i73 = i22;
                            i75 = i25;
                            i71 = i24;
                            str27 = str7;
                            str25 = str9;
                            str24 = str10;
                            file6 = file;
                            i76 = i21;
                            i67 = i19;
                            str26 = str6;
                        }
                    } catch (IOException e23) {
                        e = e23;
                        iOException = e;
                        bufferedReader = null;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i91222222222222222222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i91222222222222222222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                case -440197753:
                case 621821119:
                    i67++;
                    str22 = str23;
                    c5 = c6;
                    m69813 = (C0630.m2566("᩹ܽ") + i61) * 55;
                    i54 = ((m69813 ^ i60) * 2439) ^ (-390571229);
                    i55 = -66042283;
                    i63 = m69813 ^ i55;
                    i62 = i54;
                    c6 = c5;
                    str23 = str22;
                case -391191022:
                case -211564617:
                    str22 = str23;
                    c5 = c6;
                    if (i67 < i69) {
                        m69813 = (i60 - C0630.m2566("ۢܺ")) * (-37);
                        i54 = ((m69813 ^ i61) * (-27269)) ^ 418379997;
                        i55 = -1757349060;
                    } else {
                        m69813 = C2105.m6981("᩺ۗ") ^ i60;
                        i54 = ((m69813 ^ i61) * 22519) ^ (-958704960);
                        i55 = -1433556559;
                    }
                    i63 = m69813 ^ i55;
                    i62 = i54;
                    c6 = c5;
                    str23 = str22;
                case -190026161:
                case 2114545916:
                    i = i64;
                    str2 = str27;
                    i6 = i67;
                    str16 = str25;
                    i7 = i72;
                    i42 = i73;
                    i9 = i76;
                    i43 = i66;
                    str3 = str23;
                    str17 = str24;
                    c = c6;
                    i44 = i71;
                    i45 = i75;
                    i5 = i65;
                    i70 = 0;
                    m6981 = (C0630.m2566("ᩳۨ") + i60) * (-17);
                    i46 = ((m6981 ^ i61) * (-18835)) ^ 1661601738;
                    i47 = 1996725743;
                    int i902222222 = m6981 ^ i47;
                    i76 = i9;
                    c6 = c;
                    str23 = str3;
                    i64 = i;
                    i67 = i6;
                    i63 = i902222222;
                    i62 = i46;
                    i72 = i7;
                    i65 = i5;
                    str27 = str2;
                    i75 = i45;
                    i71 = i44;
                    str24 = str17;
                    i66 = i43;
                    i73 = i42;
                    str25 = str16;
                case -138130725:
                case 374017251:
                    i16 = i64;
                    str7 = str27;
                    i19 = i67;
                    String str39 = str23;
                    int i105 = i75;
                    i21 = i76;
                    i26 = i65;
                    c3 = c6;
                    i53 = i73;
                    i23 = i66;
                    str21 = str24;
                    try {
                        i74 = str39.indexOf(str21);
                        int m69817 = (C2105.m6981("֡᩹") ^ i61) * 49;
                        str24 = str21;
                        i76 = i21;
                        c6 = c3;
                        i66 = i23;
                        i67 = i19;
                        str23 = str39;
                        i73 = i53;
                        i65 = i26;
                        i75 = i105;
                        i64 = i16;
                        i63 = m69817 ^ 1131772369;
                        i62 = ((m69817 ^ i60) * 17015) ^ 1413008442;
                        str27 = str7;
                    } catch (IOException e24) {
                        iOException = e24;
                        str6 = str26;
                        str9 = str25;
                        i24 = i71;
                        i20 = i72;
                        file = file6;
                        i25 = i105;
                        str8 = str39;
                        i22 = i53;
                        str10 = str21;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i912222222222222222222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i912222222222222222222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                case -77346234:
                case 1842682044:
                    i16 = i64;
                    str5 = str23;
                    c3 = c6;
                    try {
                        sb.append((CharSequence) str5, i57, i66);
                        m25662 = C0630.m2566("ۘܿ") ^ i60;
                        i17 = ((m25662 ^ i61) * (-23107)) ^ 1119909920;
                        i18 = 1270695260;
                        c6 = c3;
                        str23 = str5;
                        i4 = i16;
                        i63 = m25662 ^ i18;
                        i62 = i17;
                        i64 = i4;
                    } catch (IOException e25) {
                        e = e25;
                        iOException = e;
                        str6 = str26;
                        str7 = str27;
                        i19 = i67;
                        i20 = i72;
                        i21 = i76;
                        file = file6;
                        str8 = str5;
                        str9 = str25;
                        str10 = str24;
                        i22 = i73;
                        i23 = i66;
                        i24 = i71;
                        i25 = i75;
                        i26 = i65;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i9122222222222222222222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i9122222222222222222222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                case -27397920:
                case 1187411476:
                    if (i58 > 0) {
                        m69814 = C0630.m2566("ܽ۬") ^ i60;
                        i51 = ((m69814 ^ i61) * 27633) ^ 1791193090;
                        i56 = 2017083089;
                        i63 = m69814 ^ i56;
                        i62 = i51;
                    } else {
                        i16 = i64;
                        readLine = str27;
                        str7 = readLine;
                        i19 = i67;
                        i20 = i72;
                        i21 = i76;
                        file = file6;
                        str8 = str23;
                        str9 = str25;
                        str10 = str24;
                        i22 = i73;
                        i23 = i66;
                        c3 = c6;
                        i24 = i71;
                        i25 = i75;
                        i26 = i65;
                        int m698152222 = (C2105.m6981("᩻᩻") + i60) * 75;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i64 = i16;
                        i63 = m698152222 ^ 1403121460;
                        i72 = i20;
                        i73 = i22;
                        str27 = str7;
                        str25 = str9;
                        i76 = i21;
                        i67 = i19;
                        File file72222 = file;
                        str26 = readLine;
                        i62 = ((m698152222 ^ i61) * 30825) ^ 1957217627;
                        i65 = i26;
                        i75 = i25;
                        i71 = i24;
                        str24 = str10;
                        file6 = file72222;
                    }
                case -22428397:
                case 523445634:
                    str22 = str23;
                    c5 = c6;
                    i69 = i70 - i68;
                    i67 = 0;
                    m69813 = (C0630.m2566("᩹ܽ") + i61) * 55;
                    i54 = ((m69813 ^ i60) * 2439) ^ (-390571229);
                    i55 = -66042283;
                    i63 = m69813 ^ i55;
                    i62 = i54;
                    c6 = c5;
                    str23 = str22;
                case 12602756:
                case 590706158:
                    i58 = C0798.m3007(str27);
                    m69814 = (C2105.m6981("۫ᩳ") + i61) * 9;
                    i51 = ((m69814 ^ i60) * 2849) ^ (-1109061666);
                    i56 = -1579936222;
                    i63 = m69814 ^ i56;
                    i62 = i51;
                case 348985579:
                case 2060432386:
                    i10 = i64;
                    str4 = str23;
                    i2 = i75;
                    i3 = i65;
                    c2 = c6;
                    i11 = i73;
                    i13 = 14;
                    m2566 = C0630.m2566("֡֡") ^ i61;
                    i12 = i13;
                    i14 = ((m2566 ^ i60) * 4161) ^ (-118750920);
                    i15 = -1133731626;
                    c6 = c2;
                    str23 = str4;
                    i4 = i10;
                    i63 = m2566 ^ i15;
                    i62 = i14;
                    i66 = i12;
                    i73 = i11;
                    i65 = i3;
                    i75 = i2;
                    i64 = i4;
                case 388402818:
                case 1713749334:
                    i16 = i64;
                    str7 = str27;
                    i19 = i67;
                    String str40 = str25;
                    i20 = i72;
                    i21 = i76;
                    str8 = str23;
                    c3 = c6;
                    int i106 = i75;
                    i26 = i65;
                    int i107 = i73;
                    i23 = i66;
                    str18 = str24;
                    i24 = i71;
                    i25 = i106;
                    try {
                        i22 = i107;
                    } catch (IOException e26) {
                        e = e26;
                        i22 = i107;
                    }
                    try {
                        C21923.m49331(this.f13022, C0050.m947(sb));
                        str9 = str40;
                        str6 = str26;
                        File file8 = file6;
                        str10 = str18;
                        file2 = file8;
                        m25663 = C2105.m6981("ۙۚ") ^ i60;
                        i27 = ((m25663 ^ i61) * 20591) ^ 1489528088;
                        i28 = -1747455041;
                        int i862222 = m25663 ^ i28;
                        c6 = c3;
                        str23 = str8;
                        i65 = i26;
                        i64 = i16;
                        str26 = str6;
                        i63 = i862222;
                        i62 = i27;
                        i72 = i20;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str24 = str10;
                        file6 = file2;
                        i66 = i23;
                        i73 = i22;
                        str25 = str9;
                        i76 = i21;
                        i67 = i19;
                    } catch (IOException e27) {
                        e = e27;
                        iOException = e;
                        str9 = str40;
                        str6 = str26;
                        file = file6;
                        str10 = str18;
                        m25664 = (i60 - C0630.m2566("ۧۨ")) * 99;
                        i40 = ((m25664 ^ i61) * 2339) ^ (-205634043);
                        i41 = -1533230784;
                        int i91222222222222222222222 = m25664 ^ i41;
                        c6 = c3;
                        str23 = str8;
                        i66 = i23;
                        i65 = i26;
                        i64 = i16;
                        i63 = i91222222222222222222222;
                        i62 = i40;
                        i72 = i20;
                        i73 = i22;
                        i75 = i25;
                        i71 = i24;
                        str27 = str7;
                        str25 = str9;
                        str24 = str10;
                        file6 = file;
                        i76 = i21;
                        i67 = i19;
                        str26 = str6;
                    }
                case 503738412:
                case 1837927391:
                    i16 = i64;
                    str6 = str26;
                    str7 = str27;
                    i19 = i67;
                    i20 = i72;
                    i21 = i76;
                    str8 = str23;
                    str9 = str25;
                    i22 = i73;
                    i23 = i66;
                    c3 = c6;
                    file2 = file6;
                    str10 = str24;
                    i24 = i71;
                    i25 = i75;
                    i26 = i65;
                    C22628.m50616(this.f13022, "");
                    m25663 = C2105.m6981("ۙۚ") ^ i60;
                    i27 = ((m25663 ^ i61) * 20591) ^ 1489528088;
                    i28 = -1747455041;
                    int i8622222 = m25663 ^ i28;
                    c6 = c3;
                    str23 = str8;
                    i65 = i26;
                    i64 = i16;
                    str26 = str6;
                    i63 = i8622222;
                    i62 = i27;
                    i72 = i20;
                    i75 = i25;
                    i71 = i24;
                    str27 = str7;
                    str24 = str10;
                    file6 = file2;
                    i66 = i23;
                    i73 = i22;
                    str25 = str9;
                    i76 = i21;
                    i67 = i19;
                case 518105423:
                case 1131302412:
                    C2105.m6979(sb, c6);
                    m69814 = (C2105.m6981("ۚۖ") + i61) * (-39);
                    i51 = ((m69814 ^ i60) * (-28119)) ^ 521577046;
                    i56 = -378624239;
                    i63 = m69814 ^ i56;
                    i62 = i51;
                case 633349823:
                case 2058532355:
                    i = i64;
                    str2 = str27;
                    i6 = i67;
                    int i108 = i71;
                    i7 = i72;
                    int i109 = i75;
                    i9 = i76;
                    i5 = i65;
                    str3 = str23;
                    int i110 = i73;
                    i43 = i66;
                    c = c6;
                    str17 = str24;
                    i45 = i109;
                    if (i108 > i70) {
                        i70 = i108;
                        i44 = i70;
                    } else {
                        i44 = i108;
                    }
                    str16 = str25;
                    i42 = i110;
                    m6981 = (C0630.m2566("ᩳۨ") + i60) * (-17);
                    i46 = ((m6981 ^ i61) * (-18835)) ^ 1661601738;
                    i47 = 1996725743;
                    int i9022222222 = m6981 ^ i47;
                    i76 = i9;
                    c6 = c;
                    str23 = str3;
                    i64 = i;
                    i67 = i6;
                    i63 = i9022222222;
                    i62 = i46;
                    i72 = i7;
                    i65 = i5;
                    str27 = str2;
                    i75 = i45;
                    i71 = i44;
                    str24 = str17;
                    i66 = i43;
                    i73 = i42;
                    str25 = str16;
                case 876106635:
                case 1895698824:
                    i16 = i64;
                    str6 = str26;
                    str7 = str27;
                    i19 = i67;
                    i20 = i72;
                    i21 = i76;
                    file = file6;
                    str8 = str23;
                    str9 = str25;
                    str10 = str24;
                    i22 = i73;
                    i23 = i66;
                    c3 = c6;
                    i24 = i71;
                    i25 = i75;
                    i26 = i65;
                    Charset charset = StandardCharsets.UTF_8;
                    list = C15843.m37506(file);
                    it2 = C1047.m3596(list);
                    m25664 = (C0630.m2566("ۙܰ") + i61) * 35;
                    i40 = ((m25664 ^ i60) * (-31105)) ^ (-1356171898);
                    i41 = 1489420588;
                    int i912222222222222222222222 = m25664 ^ i41;
                    c6 = c3;
                    str23 = str8;
                    i66 = i23;
                    i65 = i26;
                    i64 = i16;
                    i63 = i912222222222222222222222;
                    i62 = i40;
                    i72 = i20;
                    i73 = i22;
                    i75 = i25;
                    i71 = i24;
                    str27 = str7;
                    str25 = str9;
                    str24 = str10;
                    file6 = file;
                    i76 = i21;
                    i67 = i19;
                    str26 = str6;
                case 1069757999:
                case 1647718175:
                    i = i64;
                    str2 = str27;
                    i6 = i67;
                    str16 = str25;
                    i7 = i72;
                    i42 = i73;
                    i9 = i76;
                    i43 = i66;
                    str3 = str23;
                    str17 = str24;
                    c = c6;
                    i44 = i71;
                    i45 = i75;
                    i5 = i65;
                    z2 = C1773.m5910(it);
                    m6981 = C0630.m2566("ܳ۫") ^ i61;
                    i46 = ((m6981 ^ i60) * 32595) ^ 1659547826;
                    i47 = -1491483396;
                    int i90222222222 = m6981 ^ i47;
                    i76 = i9;
                    c6 = c;
                    str23 = str3;
                    i64 = i;
                    i67 = i6;
                    i63 = i90222222222;
                    i62 = i46;
                    i72 = i7;
                    i65 = i5;
                    str27 = str2;
                    i75 = i45;
                    i71 = i44;
                    str24 = str17;
                    i66 = i43;
                    i73 = i42;
                    str25 = str16;
                case 1506009932:
                case 2022699670:
                    C3245.m9923(sb, str26);
                    C0630.m2567(sb, c7);
                    readLine2 = bufferedReader.readLine();
                    str27 = readLine2;
                    m69814 = C0630.m2566("֡ܳ") ^ i60;
                    i51 = ((m69814 ^ i61) * 24329) ^ 417966992;
                    i56 = 325584900;
                    i63 = m69814 ^ i56;
                    i62 = i51;
                case 1750247285:
                case 1912638682:
                    i16 = i64;
                    str6 = str26;
                    str7 = str27;
                    i19 = i67;
                    i20 = i72;
                    i21 = i76;
                    str8 = str23;
                    str9 = str25;
                    i22 = i73;
                    i23 = i66;
                    c3 = c6;
                    file2 = file6;
                    str10 = str24;
                    i24 = i71;
                    i25 = i75;
                    i26 = i65;
                    short s = f13020[21];
                    int i111 = (s * 2) + 1;
                    int i112 = s + 1;
                    if (i111 - (i112 * i112) <= 0) {
                        m25663 = C2105.m6981("᩷֫") ^ i61;
                        i27 = ((m25663 ^ i60) * 11379) ^ (-1030449500);
                        i28 = 1978393057;
                    } else {
                        m25663 = C0630.m2566("ۙ֡") ^ i60;
                        i27 = ((m25663 ^ i61) * 3469) ^ (-1092084952);
                        i28 = -1733582424;
                    }
                    int i86222222 = m25663 ^ i28;
                    c6 = c3;
                    str23 = str8;
                    i65 = i26;
                    i64 = i16;
                    str26 = str6;
                    i63 = i86222222;
                    i62 = i27;
                    i72 = i20;
                    i75 = i25;
                    i71 = i24;
                    str27 = str7;
                    str24 = str10;
                    file6 = file2;
                    i66 = i23;
                    i73 = i22;
                    str25 = str9;
                    i76 = i21;
                    i67 = i19;
                default:
                    i = i64;
                    String str41 = str23;
                    i2 = i75;
                    c = c6;
                    if (i65 != i2) {
                        int m256614 = C0630.m2566("ᩴۨ") ^ i60;
                        i3 = i65;
                        c6 = c;
                        str23 = str41;
                        i4 = i;
                        i63 = m256614 ^ (-661929384);
                        i62 = ((m256614 ^ i61) * 8585) ^ (-2085070197);
                        i65 = i3;
                        i75 = i2;
                        i64 = i4;
                    } else {
                        i5 = i65;
                        str2 = str27;
                        i6 = i67;
                        i7 = i72;
                        i8 = i73;
                        i9 = i76;
                        str3 = str41;
                        i43 = i66;
                        str17 = str24;
                        m25665 = (C2105.m6981("᩶᩵") + i61) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i51 = ((m25665 ^ i60) * 30977) ^ 2105328068;
                        i52 = -934586754;
                        int i9222222 = m25665 ^ i52;
                        str24 = str17;
                        i76 = i9;
                        c6 = c;
                        str23 = str3;
                        i66 = i43;
                        i67 = i6;
                        i73 = i8;
                        i72 = i7;
                        i65 = i5;
                        str27 = str2;
                        i75 = i2;
                        i64 = i;
                        i63 = i9222222;
                        i62 = i51;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (l.C2126.f7087 != false) goto L10;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m12296(l.ActivityC4094 r17, java.util.List r18, android.content.DialogInterface r19, int r20) {
        /*
            Method dump skipped, instructions count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC4094.m12296(l.ۘܿ᩷, java.util.List, android.content.DialogInterface, int):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m12297(ActivityC4094 activityC4094) {
        C12392 c12392 = activityC4094.f13022;
        c12392.setScrollY(c12392.m30528());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c8, code lost:
    
        if (l.C1294.f4556 >= 0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r4v81 */
    /* JADX WARN: Type inference failed for: r4v86 */
    /* JADX WARN: Type inference failed for: r4v89 */
    /* JADX WARN: Type inference failed for: r4v92 */
    /* JADX WARN: Type inference failed for: r4v93 */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onOptionsItemSelected(android.view.MenuItem r48) {
        /*
            Method dump skipped, instructions count: 3416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC4094.onOptionsItemSelected(android.view.MenuItem):boolean");
    }
}
