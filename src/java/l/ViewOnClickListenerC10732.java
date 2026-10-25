package l;

import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import bin.mt.plus.Main;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* compiled from: Q152 */
/* renamed from: l.ۧۗܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC10732 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* renamed from: ᩳܺ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f32330 = {4429, 3901, -4905, 7099, -6468, 6048, -1673, -1728, 6777, 2710, -4098, 6107, -5406, 2753, -732, 4841, 9289, -5846, 4630, -6401, 744, -7675, -5832, -4268, 8440, -4822, 9296, 14372, -7678, 8406, 546, 5375, 3976, 5314, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30706, 30719, 30710, 30691, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30699, 30695, 30706, 30693, 30702, 30681, 30693, 30695, 30709, 30691, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30708, 30691, 30689, 30691, 30718, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30702, 30691, 30718, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30703, 30690, 30644, 30696, 30695, 30699, 30691, 30695, 30718, 30699, 30698, 30681, 30709, 30691, 30695, 30708, 30693, 30702, 30681, 30691, 30718, 30695, 30693, 30706, 30698, 30719, 30681, 30699, 30695, 30706, 30693, 30702, -1808, 3600, 6984, 1780, 6549, 2100, 9750, -2275, 1513, 9395, 25237, 25272, 25263, 25274, 25316, 25278, 25255, 25274, 6770, 5904, -10209, -14712, -13524, 15359, -15992, -8867, 12496, 5963, 19388, 19444, 19388, 19412, 19375, 19372, 19364, 19375, 19422, 19422, 19403, 19403, 19406, 19406, 19360, 19372, 19375, 19405, 19405, 19422, 19422, 19403, 19403, 19406, 19406, 19362, 19362, 19362, 19365, 19408, 19426, -8703, 6654, 5175, 19334, -8840, 15627, -9670, 16129, 10541, 5487, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19448, 19445, 19452, 19433, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19425, 19437, 19448, 19439, 19428, 19411, 19439, 19437, 19455, 19433, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19454, 19433, 19435, 19433, 19444, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19428, 19433, 19444, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19429, 19432, 19390, 19426, 19437, 19425, 19433, 19437, 19444, 19425, 19424, 19411, 19455, 19433, 19437, 19454, 19439, 19428, 19411, 19433, 19444, 19437, 19439, 19448, 19424, 19445, 19411, 19425, 19437, 19448, 19439, 19428, 19408, 19454, 19329, -10372, 10127, -14472, 19408, 19448, 19333, 19408, 19434, 19328, 19408, 19438, 19332};

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CheckBox f32331;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CheckBox f32332;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C5062 f32333;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CheckBox f32334;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5062 f32335;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f32336;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CheckBox f32337;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16560 f32338;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f32339;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f32340;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CheckBox f32341;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Spinner f32342;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m26915() {
        CheckBox checkBox = null;
        boolean z = false;
        int i = -1243848265;
        int i2 = C4117.f13076;
        int i3 = C1294.f4556;
        int m2566 = (i3 - C0630.m2566("ۤ᩹")) * 65;
        int i4 = ((m2566 ^ i2) * 13327) ^ 282591320;
        int i5 = 384798514;
        while (true) {
            i = ((((i ^ i2) * (-24527)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2120131387:
                case 915521488:
                    this.f32333.m14612(z);
                    break;
                case -1979466584:
                case 638259502:
                    if (C7811.m20844() != 0) {
                        m2566 = C0630.m2566("۬᩶") ^ i3;
                        i4 = ((m2566 ^ i2) * (-29031)) ^ 2068401755;
                        i5 = 1700021711;
                    } else {
                        m2566 = C2105.m6981("ܶۢ") ^ i2;
                        i4 = ((m2566 ^ i3) * 23405) ^ 1198979198;
                        i5 = 835658563;
                    }
                case -1903218419:
                case 1871245307:
                    if (C4616.f14690 <= 0) {
                        m2566 = C0630.m2566("ܽ᩸") ^ i3;
                        i4 = ((m2566 ^ i2) * (-26755)) ^ (-541801357);
                        i5 = 1345569303;
                    } else {
                        m2566 = (C2105.m6981("֡ۜ") ^ i3) * (-113);
                        i4 = ((m2566 ^ i2) * (-10177)) ^ 1227178705;
                        i5 = -1206083667;
                    }
                case -1736544298:
                case -570175398:
                    if (C1047.f3863 >= 0) {
                        m2566 = C2105.m6981("ܶۢ") ^ i2;
                        i4 = ((m2566 ^ i3) * 23405) ^ 1198979198;
                        i5 = 835658563;
                    } else {
                        m2566 = (i2 - C0630.m2566("ܽۡ")) * (-103);
                        i4 = ((m2566 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    }
                case -1533548033:
                case -286535113:
                    if (C4616.m13552() != 0) {
                        m2566 = (i2 - C0630.m2566("ܽۡ")) * (-103);
                        i4 = ((m2566 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    } else {
                        m2566 = C2105.m6981("ۡۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-12075)) ^ 44194152;
                        i5 = 358055761;
                    }
                case -1155740774:
                case -456739929:
                    if (C0714.m2804(checkBox)) {
                        m2566 = (i2 - C2105.m6981("᩵֫")) * 71;
                        i4 = ((m2566 ^ i3) * (-30953)) ^ (-1294855339);
                        i5 = 1404116027;
                    } else {
                        m2566 = C2105.m6981("ۖۗ") ^ i2;
                        i4 = ((m2566 ^ i3) * 11437) ^ 93309512;
                        i5 = 1099299931;
                    }
                case -1034369443:
                case 1119208908:
                    if (checkBox.getVisibility() == 0) {
                        m2566 = C0630.m2566("ᩳۖ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-28601)) ^ (-867686633);
                        i5 = -1547532080;
                    } else {
                        m2566 = C2105.m6981("ۖۗ") ^ i2;
                        i4 = ((m2566 ^ i3) * 11437) ^ 93309512;
                        i5 = 1099299931;
                    }
                case -899939602:
                case 1092810147:
                    RunnableC1937.m6387();
                    C2272.m7503();
                    break;
                case -184014668:
                case 1649512522:
                    z = true;
                    m2566 = (C0630.m2566("ۙۢ") + i3) * (-81);
                    i4 = ((m2566 ^ i2) * 24513) ^ 1984707405;
                    i5 = -1398617777;
                case -12874009:
                case 1379185647:
                    if (C4075.m12263() > 0) {
                        m2566 = C0630.m2566("۬᩶") ^ i3;
                        i4 = ((m2566 ^ i2) * (-29031)) ^ 2068401755;
                        i5 = 1700021711;
                    } else {
                        m2566 = (C0630.m2566("᩻ۧ") ^ i3) * (-45);
                        i4 = ((m2566 ^ i2) * (-32249)) ^ (-933352766);
                        i5 = -1568251469;
                    }
                case 90891325:
                case 1162375781:
                    if (AbstractC2021.m6574()) {
                        m2566 = C0630.m2566("ܽ᩸") ^ i3;
                        i4 = ((m2566 ^ i2) * (-26755)) ^ (-541801357);
                        i5 = 1345569303;
                    } else {
                        m2566 = C0630.m2566("֨ᩳ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-14175)) ^ (-149696102);
                        i5 = 336901242;
                    }
                case 210334028:
                case 674314130:
                    if (C2520.m8026()) {
                        m2566 = C0630.m2566("۬᩶") ^ i3;
                        i4 = ((m2566 ^ i2) * (-29031)) ^ 2068401755;
                        i5 = 1700021711;
                    } else {
                        m2566 = C0630.m2566("ܶ᩸") ^ i3;
                        i4 = ((m2566 ^ i2) * (-10207)) ^ (-1984969383);
                        i5 = -1056810536;
                    }
                case 212588668:
                case 390904893:
                    z = false;
                    m2566 = (C0630.m2566("ۙۢ") + i3) * (-81);
                    i4 = ((m2566 ^ i2) * 24513) ^ 1984707405;
                    i5 = -1398617777;
                case 246639953:
                case 676680694:
                    if (C1128.m3851() <= 0) {
                        m2566 = (C0630.m2566("᩻ۧ") ^ i3) * (-45);
                        i4 = ((m2566 ^ i2) * (-32249)) ^ (-933352766);
                        i5 = -1568251469;
                    } else {
                        m2566 = (i2 - C0630.m2566("۟᩺")) * 37;
                        i4 = ((m2566 ^ i3) * 26549) ^ (-63911957);
                        i5 = 798446755;
                    }
                case 265529574:
                case 1846154737:
                    if (C3432.f10845 >= 0) {
                        m2566 = (i2 - C0630.m2566("ܽۡ")) * (-103);
                        i4 = ((m2566 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    } else {
                        m2566 = (C0630.m2566("ۛܳ") + i2) * (-61);
                        i4 = ((m2566 ^ i3) * 1367) ^ 1693134828;
                        i5 = 1044980902;
                    }
                case 449947286:
                case 1728470920:
                    RunnableC1937.m6387();
                    m2566 = C0630.m2566("۬᩶") ^ i3;
                    i4 = ((m2566 ^ i2) * (-29031)) ^ 2068401755;
                    i5 = 1700021711;
                case 813481254:
                case 1134442989:
                    if (C0050.f910 >= 0) {
                        m2566 = (i2 - C0630.m2566("ܽۡ")) * (-103);
                        i4 = ((m2566 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    } else {
                        m2566 = C2105.m6981("ۘ֫") ^ i3;
                        i4 = ((m2566 ^ i2) * (-27399)) ^ 1074613730;
                        i5 = 1897273518;
                    }
                case 828099875:
                case 2105735781:
                    this.f32335.m14609(z);
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = C0630.m2566("ܽ᩸") ^ i3;
                        i4 = ((m2566 ^ i2) * (-26755)) ^ (-541801357);
                        i5 = 1345569303;
                    } else {
                        m2566 = C2105.m6981("۫ܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-9201)) ^ (-348020387);
                        i5 = -1717971889;
                    }
                case 1368715555:
                case 1712768164:
                    checkBox = this.f32334;
                    if (C4075.m12263() <= 0) {
                        m2566 = (i2 - C0630.m2566("ܽۡ")) * (-103);
                        i4 = ((m2566 ^ i3) * (-2197)) ^ 1318230662;
                        i5 = 859095557;
                    } else {
                        m2566 = C2105.m6981("ۚᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-28519)) ^ 1495382977;
                        i5 = -1581566560;
                    }
                default:
                    if (C2272.f7362) {
                        m2566 = C0630.m2566("ܽ᩸") ^ i3;
                        i4 = ((m2566 ^ i2) * (-26755)) ^ (-541801357);
                        i5 = 1345569303;
                    } else {
                        m2566 = C2105.m6981("᩺۟") ^ i2;
                        i4 = ((m2566 ^ i3) * 10857) ^ 1825603343;
                        i5 = 1514393678;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x019e, code lost:
    
        if (l.C4263.f13799 > 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnClickListenerC10732(l.AbstractC15440 r66, l.C16560 r67, java.lang.String r68) {
        /*
            Method dump skipped, instructions count: 3884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC10732.<init>(l.ܶ᩵ܿ, l.ܽۢܳ, java.lang.String):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        String str;
        boolean z2;
        int i;
        C5062 c5062;
        String str2;
        String str3;
        int m2566;
        int i2;
        int i3;
        int m6572;
        int m65722;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        int m6981;
        int i4;
        int i5;
        String str12;
        C5062 c50622;
        boolean z3;
        boolean z4;
        String str13;
        int m69812;
        int i6;
        int i7;
        int m25662;
        int i8;
        int i9;
        boolean z5;
        int m69813;
        int i10;
        int m25663;
        int i11;
        int i12;
        int m25664;
        int i13;
        int i14;
        int i15 = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        String str14 = null;
        int i16 = 0;
        String str15 = null;
        Exception exc = null;
        int i17 = 0;
        C12164 c12164 = null;
        C12164 c121642 = null;
        String str16 = null;
        int i18 = 0;
        int i19 = 0;
        String str17 = null;
        int i20 = 962913229;
        int i21 = C3746.f11829;
        int i22 = C2167.f7158;
        int m25665 = (i21 - C0630.m2566("ܿ֨")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i23 = ((m25665 ^ i22) * (-7261)) ^ (-991160277);
        int i24 = m25665 ^ 1778434368;
        C16560 c16560 = null;
        C12164 c121643 = null;
        String str18 = null;
        String str19 = null;
        int i25 = 0;
        boolean z9 = false;
        boolean z10 = false;
        String str20 = null;
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        Exception exc2 = null;
        String str21 = null;
        C5062 c50623 = null;
        String str22 = null;
        C12164 c121644 = null;
        String str23 = null;
        int i26 = 0;
        int i27 = 0;
        C5062 c50624 = null;
        String str24 = null;
        boolean z11 = false;
        while (true) {
            i20 = i24 ^ (i23 & (((i20 ^ i22) * 26893) >> 31));
            switch (i20) {
                case -2130928939:
                case -2037467155:
                    str12 = str24;
                    c50622 = c50624;
                    z3 = z7;
                    z4 = z11;
                    str6 = str21;
                    str13 = str19;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    if (C0798.m3001()) {
                        z11 = z4;
                        m25662 = C0630.m2566("ۙۡ") ^ i21;
                        i8 = ((m25662 ^ i22) * 20429) ^ (-906444676);
                        i9 = -684453532;
                        int i28 = m25662 ^ i9;
                        str19 = str13;
                        z7 = z3;
                        str24 = str12;
                        str22 = str5;
                        i24 = i28;
                        i23 = i8;
                        str18 = str3;
                        c50624 = c50622;
                        str20 = str2;
                        z8 = z2;
                        str21 = str6;
                    } else {
                        m69812 = C2105.m6981("ۜ۫") ^ i22;
                        i6 = ((m69812 ^ i21) * 30647) ^ (-321862454);
                        i7 = 1360403449;
                        int i29 = m69812 ^ i7;
                        str19 = str13;
                        z11 = z4;
                        z7 = z3;
                        str24 = str12;
                        c50624 = c50622;
                        i24 = i29;
                        i23 = i6;
                        str22 = str5;
                        str18 = str3;
                        str20 = str2;
                        z8 = z2;
                        str21 = str6;
                    }
                case -2043314842:
                case -967897130:
                    c5062 = c50624;
                    z = z7;
                    str = str21;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    if (C9896.m24999(str14)) {
                        m2566 = C0630.m2566("۫ܿ") ^ i22;
                        i2 = ((m2566 ^ i21) * (-2571)) ^ (-1710801119);
                        i3 = -1392994342;
                    } else {
                        m2566 = (C0630.m2566("ܺܿ") + i22) * 115;
                        i2 = ((m2566 ^ i21) * 15733) ^ (-611428768);
                        i3 = -1208071604;
                    }
                    i24 = m2566 ^ i3;
                    i23 = i2;
                    str18 = str3;
                    c50624 = c5062;
                    str20 = str2;
                    z8 = z2;
                    str21 = str;
                    z7 = z;
                case -2009052080:
                case 306920398:
                    C22628.m50612(c16560).m10217(C2105.m6981(C4075.m12252(f32330, 167, 3, i25)) ^ 2122061308, C2105.m6981(RunnableC1108.m3789(f32330, 170, 3, i25)) ^ 2128806274, z11);
                    break;
                case -2008366963:
                case -840662134:
                    str12 = str24;
                    c50622 = c50624;
                    z3 = z7;
                    str6 = str21;
                    str13 = str19;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    if (i15 != 3) {
                        m25662 = (C2105.m6981("ܽۖ") ^ i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i8 = ((m25662 ^ i22) * (-415)) ^ 921883071;
                        i9 = 982608946;
                    } else {
                        m25662 = (C2105.m6981("᩷ܳ") + i22) * 89;
                        i8 = ((m25662 ^ i21) * (-11141)) ^ 1264560833;
                        i9 = -1584241485;
                    }
                    int i282 = m25662 ^ i9;
                    str19 = str13;
                    z7 = z3;
                    str24 = str12;
                    str22 = str5;
                    i24 = i282;
                    i23 = i8;
                    str18 = str3;
                    c50624 = c50622;
                    str20 = str2;
                    z8 = z2;
                    str21 = str6;
                case -1977576723:
                case 1970797650:
                    str12 = str24;
                    c50622 = c50624;
                    z3 = z7;
                    z4 = z11;
                    str6 = str21;
                    str13 = str19;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    i26 = 1;
                    if (i15 != 1) {
                        m69812 = C2105.m6981("ۤ۠") ^ i22;
                        i6 = ((m69812 ^ i21) * (-5725)) ^ 1441957451;
                        i7 = 1871475829;
                        int i292 = m69812 ^ i7;
                        str19 = str13;
                        z11 = z4;
                        z7 = z3;
                        str24 = str12;
                        c50624 = c50622;
                        i24 = i292;
                        i23 = i6;
                        str22 = str5;
                        str18 = str3;
                        str20 = str2;
                        z8 = z2;
                        str21 = str6;
                    } else {
                        z5 = z2;
                        z7 = z3;
                        int m25666 = C0630.m2566("ۢ᩻") ^ i21;
                        str19 = str13;
                        str24 = str12;
                        str21 = str6;
                        i24 = m25666 ^ (-2127816814);
                        i23 = ((m25666 ^ i22) * (-24183)) ^ (-1051050896);
                        str22 = str5;
                        str18 = str3;
                        str20 = str2;
                        z8 = z5;
                        z11 = z4;
                        c50624 = c50622;
                    }
                case -1945584363:
                case -1885695782:
                    RunnableC0588.m2440(C4616.m13559(exc2));
                    C0798.m3010(c50623);
                    break;
                case -1890597932:
                case -249430992:
                    c5062 = c50624;
                    z = z7;
                    str6 = str21;
                    str7 = str19;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    String m3603 = C1047.m3603(f32330, PicnicEngine.MAX_AUX_BYTES, 2, i25);
                    boolean m13554 = C4616.m13554(str2, m3603);
                    str23 = m3603;
                    str4 = AbstractC2021.m6573(f32330, 178, 2, i25);
                    if (!m13554) {
                        m69813 = (C0630.m2566("ۧܳ") ^ i21) * 31;
                        i6 = ((m69813 ^ i22) * 10233) ^ (-2123101332);
                        i10 = -1692922261;
                        i24 = m69813 ^ i10;
                        c50624 = c5062;
                        str19 = str7;
                        z7 = z;
                        str24 = str4;
                        i23 = i6;
                        str22 = str5;
                        str18 = str3;
                        str20 = str2;
                        z8 = z2;
                        str21 = str6;
                    }
                    m69813 = C2105.m6981("᩷᩶") ^ i22;
                    i6 = ((m69813 ^ i21) * (-5347)) ^ (-1042345314);
                    i10 = -1435839392;
                    i24 = m69813 ^ i10;
                    c50624 = c5062;
                    str19 = str7;
                    z7 = z;
                    str24 = str4;
                    i23 = i6;
                    str22 = str5;
                    str18 = str3;
                    str20 = str2;
                    z8 = z2;
                    str21 = str6;
                case -1831167903:
                case 1435373461:
                    C3663.m11161(i27);
                    C1711.m5740(c50624);
                    break;
                case -1828432917:
                case -1502252338:
                    str12 = str24;
                    c50622 = c50624;
                    z3 = z7;
                    str6 = str21;
                    str13 = str19;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    if (i15 != 4) {
                        c121642 = c121644;
                        str15 = str5;
                        m25662 = C0630.m2566("ۨۡ") ^ i22;
                        i8 = ((m25662 ^ i21) * (-15831)) ^ (-1284239432);
                        i9 = 1135315253;
                        int i2822 = m25662 ^ i9;
                        str19 = str13;
                        z7 = z3;
                        str24 = str12;
                        str22 = str5;
                        i24 = i2822;
                        i23 = i8;
                        str18 = str3;
                        c50624 = c50622;
                        str20 = str2;
                        z8 = z2;
                        str21 = str6;
                    }
                    m25662 = C2105.m6981("᩷ܽ") ^ i22;
                    i8 = ((m25662 ^ i21) * 16817) ^ (-1193401752);
                    i9 = -887581781;
                    int i28222 = m25662 ^ i9;
                    str19 = str13;
                    z7 = z3;
                    str24 = str12;
                    str22 = str5;
                    i24 = i28222;
                    i23 = i8;
                    str18 = str3;
                    c50624 = c50622;
                    str20 = str2;
                    z8 = z2;
                    str21 = str6;
                case -1748615274:
                case 307045419:
                    str12 = str24;
                    c50622 = c50624;
                    z3 = z7;
                    str6 = str21;
                    str13 = str19;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    if (z9) {
                        m25662 = C0630.m2566("ܳۤ") ^ i21;
                        i8 = ((m25662 ^ i22) * 28671) ^ (-1581088054);
                        i9 = -376017632;
                    } else {
                        m25662 = C0630.m2566("ۡۧ") ^ i22;
                        i8 = ((m25662 ^ i21) * (-20227)) ^ (-277683476);
                        i9 = -598447059;
                    }
                    int i282222 = m25662 ^ i9;
                    str19 = str13;
                    z7 = z3;
                    str24 = str12;
                    str22 = str5;
                    i24 = i282222;
                    i23 = i8;
                    str18 = str3;
                    c50624 = c50622;
                    str20 = str2;
                    z8 = z2;
                    str21 = str6;
                case -1720230613:
                case 1933514393:
                    c5062 = c50624;
                    z = z7;
                    str = str21;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str14 = C0382.m1844(str2, 2);
                    m2566 = (C2105.m6981("۬֡") + i22) * 61;
                    i2 = ((m2566 ^ i21) * (-11969)) ^ 1648907654;
                    i3 = 261935737;
                    i24 = m2566 ^ i3;
                    i23 = i2;
                    str18 = str3;
                    c50624 = c5062;
                    str20 = str2;
                    z8 = z2;
                    str21 = str;
                    z7 = z;
                case -1694639638:
                case 797246232:
                    z = z7;
                    str = str21;
                    z2 = z8;
                    c5062 = c50624;
                    str2 = str20;
                    str16 = str15;
                    c12164 = c121642;
                    str3 = str18;
                    i18 = 0;
                    i19 = 0;
                    m2566 = C2105.m6981("᩷۬") ^ i22;
                    i2 = ((m2566 ^ i21) * (-14939)) ^ 1270560680;
                    i3 = 863511363;
                    i24 = m2566 ^ i3;
                    i23 = i2;
                    str18 = str3;
                    c50624 = c5062;
                    str20 = str2;
                    z8 = z2;
                    str21 = str;
                    z7 = z;
                case -1477976392:
                case -753995499:
                    str12 = str24;
                    c50622 = c50624;
                    z3 = z7;
                    z4 = z11;
                    str6 = str21;
                    str13 = str19;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    i25 = 43992;
                    m69812 = C0630.m2566("ۘ۫") ^ i21;
                    i6 = ((m69812 ^ i22) * (-32357)) ^ (-94650951);
                    i7 = 1525417834;
                    int i2922 = m69812 ^ i7;
                    str19 = str13;
                    z11 = z4;
                    z7 = z3;
                    str24 = str12;
                    c50624 = c50622;
                    i24 = i2922;
                    i23 = i6;
                    str22 = str5;
                    str18 = str3;
                    str20 = str2;
                    z8 = z2;
                    str21 = str6;
                case -1321819616:
                case -455620506:
                    C3683.m11220(C4117.m12351(ServiceConnectionC3453.m10562(C0630.m2566(AbstractC2021.m6573(f32330, 207, 3, i25)) ^ 2099890846), str21));
                    C1711.m5740(c50623);
                    break;
                case -1309834583:
                case -396142854:
                    str12 = str24;
                    c50622 = c50624;
                    z4 = z11;
                    str2 = str20;
                    str6 = str21;
                    str3 = str18;
                    str13 = str19;
                    str5 = str22;
                    z9 = C2167.m7157(this.f32332);
                    z6 = C0714.m2804(this.f32334);
                    z10 = C2167.m7157(this.f32337);
                    z7 = C2167.m7157(this.f32331);
                    boolean m7157 = C2167.m7157(this.f32341);
                    if (i15 != 0) {
                        int m69814 = C2105.m6981("᩻᩻") ^ i21;
                        z5 = m7157;
                        i23 = ((m69814 ^ i22) * 22911) ^ 471047778;
                        str19 = str13;
                        str24 = str12;
                        str21 = str6;
                        i24 = m69814 ^ (-319122072);
                        str22 = str5;
                        str18 = str3;
                        str20 = str2;
                        z8 = z5;
                        z11 = z4;
                        c50624 = c50622;
                    } else {
                        z5 = m7157;
                        int m256662 = C0630.m2566("ۢ᩻") ^ i21;
                        str19 = str13;
                        str24 = str12;
                        str21 = str6;
                        i24 = m256662 ^ (-2127816814);
                        i23 = ((m256662 ^ i22) * (-24183)) ^ (-1051050896);
                        str22 = str5;
                        str18 = str3;
                        str20 = str2;
                        z8 = z5;
                        z11 = z4;
                        c50624 = c50622;
                    }
                case -1266908423:
                case 759012265:
                    C1504.m5167(i27);
                    C1711.m5740(c50623);
                    break;
                case -1249464621:
                case 923930347:
                    z = z7;
                    str = str21;
                    z2 = z8;
                    str2 = str20;
                    i16 = C9896.m25001(C3432.m10478(str2, i26));
                    c5062 = c50624;
                    String str25 = str18;
                    if (C7811.m20838(str22, str25)) {
                        m2566 = (i21 - C2105.m6981("ۙۜ")) * (-7);
                        str3 = str25;
                        i2 = ((m2566 ^ i22) * (-32619)) ^ 360752531;
                        i3 = -944456080;
                        i24 = m2566 ^ i3;
                        i23 = i2;
                        str18 = str3;
                        c50624 = c5062;
                        str20 = str2;
                        z8 = z2;
                        str21 = str;
                        z7 = z;
                    } else {
                        str3 = str25;
                        m2566 = C0630.m2566("ۜ᩻") ^ i21;
                        i2 = ((m2566 ^ i22) * (-7977)) ^ 818047213;
                        i3 = 1410551334;
                        i24 = m2566 ^ i3;
                        i23 = i2;
                        str18 = str3;
                        c50624 = c5062;
                        str20 = str2;
                        z8 = z2;
                        str21 = str;
                        z7 = z;
                    }
                case -1227217873:
                case -3458311:
                    str12 = str24;
                    c50622 = c50624;
                    z3 = z7;
                    str6 = str21;
                    str13 = str19;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    c121644 = null;
                    if (i15 != 2) {
                        m25662 = C2105.m6981("ۧ۫") ^ i21;
                        i8 = ((m25662 ^ i22) * 3859) ^ (-542682910);
                        i9 = -1422059637;
                        int i2822222 = m25662 ^ i9;
                        str19 = str13;
                        z7 = z3;
                        str24 = str12;
                        str22 = str5;
                        i24 = i2822222;
                        i23 = i8;
                        str18 = str3;
                        c50624 = c50622;
                        str20 = str2;
                        z8 = z2;
                        str21 = str6;
                    }
                    m25662 = C2105.m6981("᩷ܽ") ^ i22;
                    i8 = ((m25662 ^ i21) * 16817) ^ (-1193401752);
                    i9 = -887581781;
                    int i28222222 = m25662 ^ i9;
                    str19 = str13;
                    z7 = z3;
                    str24 = str12;
                    str22 = str5;
                    i24 = i28222222;
                    i23 = i8;
                    str18 = str3;
                    c50624 = c50622;
                    str20 = str2;
                    z8 = z2;
                    str21 = str6;
                case -1032669046:
                case 1974388296:
                    z = z7;
                    str = str21;
                    i17 = C9896.m24993(str14);
                    z2 = z8;
                    String str26 = str23;
                    if (C4616.m13554(str22, str26)) {
                        str23 = str26;
                        m6981 = C2105.m6981("᩺֡") ^ i21;
                        i4 = ((m6981 ^ i22) * 19007) ^ 1778497627;
                        i5 = 586909330;
                        i24 = m6981 ^ i5;
                        i23 = i4;
                        z8 = z2;
                        str21 = str;
                        z7 = z;
                    } else {
                        m6981 = C2105.m6981("ۧܺ") ^ i22;
                        str23 = str26;
                        i4 = ((m6981 ^ i21) * 24107) ^ (-363522122);
                        i5 = -1845836387;
                        i24 = m6981 ^ i5;
                        i23 = i4;
                        z8 = z2;
                        str21 = str;
                        z7 = z;
                    }
                case -881959401:
                case 1143075856:
                    str17 = C3432.m10478(str22, 2);
                    m25664 = (i21 - C0630.m2566("ܽ᩶")) * (-121);
                    i13 = ((m25664 ^ i22) * (-28827)) ^ (-2044872141);
                    i14 = 821733968;
                    i24 = m25664 ^ i14;
                    i23 = i13;
                case -859792722:
                case 830056027:
                    C1504.m5172(dialogInterfaceC0206);
                    break;
                case -766523444:
                case 1405754300:
                    C3663.m11161(C2105.m6981(C0237.m1483(f32330, 334, 3, i25)) ^ 2101922057);
                    C0798.m3010(c50624);
                    break;
                case -668712848:
                case 140602869:
                    str12 = str24;
                    c50622 = c50624;
                    z3 = z7;
                    str6 = str21;
                    str13 = str19;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    i15 = this.f32342.getSelectedItemPosition();
                    c16560 = this.f32338;
                    z11 = false;
                    if (i15 == 0) {
                        m25662 = (C0630.m2566("۟ۗ") + i22) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i8 = ((m25662 ^ i21) * 35) ^ (-577813759);
                        i9 = -737272381;
                        int i282222222 = m25662 ^ i9;
                        str19 = str13;
                        z7 = z3;
                        str24 = str12;
                        str22 = str5;
                        i24 = i282222222;
                        i23 = i8;
                        str18 = str3;
                        c50624 = c50622;
                        str20 = str2;
                        z8 = z2;
                        str21 = str6;
                    }
                    m25662 = C0630.m2566("ۙۡ") ^ i21;
                    i8 = ((m25662 ^ i22) * 20429) ^ (-906444676);
                    i9 = -684453532;
                    int i2822222222 = m25662 ^ i9;
                    str19 = str13;
                    z7 = z3;
                    str24 = str12;
                    str22 = str5;
                    i24 = i2822222222;
                    i23 = i8;
                    str18 = str3;
                    c50624 = c50622;
                    str20 = str2;
                    z8 = z2;
                    str21 = str6;
                case -640746055:
                case -280941252:
                    c5062 = c50624;
                    z = z7;
                    str = str21;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    if (C7811.m20838(str2, str24)) {
                        str4 = str24;
                        str5 = str22;
                        str6 = str;
                        str7 = str19;
                        m69813 = C2105.m6981("᩷᩶") ^ i22;
                        i6 = ((m69813 ^ i21) * (-5347)) ^ (-1042345314);
                        i10 = -1435839392;
                        i24 = m69813 ^ i10;
                        c50624 = c5062;
                        str19 = str7;
                        z7 = z;
                        str24 = str4;
                        i23 = i6;
                        str22 = str5;
                        str18 = str3;
                        str20 = str2;
                        z8 = z2;
                        str21 = str6;
                    } else {
                        str14 = str2;
                        m2566 = (C2105.m6981("۬֡") + i22) * 61;
                        i2 = ((m2566 ^ i21) * (-11969)) ^ 1648907654;
                        i3 = 261935737;
                        i24 = m2566 ^ i3;
                        i23 = i2;
                        str18 = str3;
                        c50624 = c5062;
                        str20 = str2;
                        z8 = z2;
                        str21 = str;
                        z7 = z;
                    }
                case -484105429:
                case 857714690:
                    m65722 = C9896.m25001(C3432.m10478(str22, i26));
                    c5062 = c50624;
                    z = z7;
                    str = str21;
                    m6572 = i16;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    i19 = m65722;
                    i18 = m6572;
                    str16 = str22;
                    c12164 = c121644;
                    m2566 = C2105.m6981("᩷۬") ^ i22;
                    i2 = ((m2566 ^ i21) * (-14939)) ^ 1270560680;
                    i3 = 863511363;
                    i24 = m2566 ^ i3;
                    i23 = i2;
                    str18 = str3;
                    c50624 = c5062;
                    str20 = str2;
                    z8 = z2;
                    str21 = str;
                    z7 = z;
                case -431244925:
                case 565628015:
                    c5062 = c50624;
                    z = z7;
                    str = str21;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    if (C9896.m24997(C0382.m1844(str2, i26))) {
                        m2566 = C0630.m2566("ܶۛ") ^ i21;
                        i2 = ((m2566 ^ i22) * 8269) ^ 16157654;
                        i3 = -748748717;
                        i24 = m2566 ^ i3;
                        i23 = i2;
                        str18 = str3;
                        c50624 = c5062;
                        str20 = str2;
                        z8 = z2;
                        str21 = str;
                        z7 = z;
                    } else {
                        str8 = str24;
                        str9 = str22;
                        str10 = str;
                        str11 = str19;
                        m25663 = (C0630.m2566("ᩳۤ") ^ i22) * (-103);
                        i11 = ((m25663 ^ i21) * (-26441)) ^ 584296304;
                        i12 = 1068875967;
                        int i30 = m25663 ^ i12;
                        str19 = str11;
                        z7 = z;
                        str24 = str8;
                        i24 = i30;
                        c50624 = c5062;
                        boolean z12 = z2;
                        str21 = str10;
                        i23 = i11;
                        str22 = str9;
                        str18 = str3;
                        str20 = str2;
                        z8 = z12;
                    }
                case -403328850:
                case 1144055348:
                    str12 = str24;
                    c50622 = c50624;
                    z3 = z7;
                    z4 = z11;
                    str6 = str21;
                    str13 = str19;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    try {
                        c121643 = C3058.m9359(str2, z6, z10).matcher((CharSequence) "");
                        m69812 = (C0630.m2566("ۤ֫") + i21) * 57;
                        i6 = ((m69812 ^ i22) * (-19853)) ^ 971394475;
                        i7 = -526985634;
                    } catch (Exception e) {
                        exc2 = e;
                        m69812 = (i21 - C0630.m2566("᩻᩹")) * 93;
                        i6 = ((m69812 ^ i22) * 10709) ^ (-393780802);
                        i7 = -736020783;
                        int i29222 = m69812 ^ i7;
                        str19 = str13;
                        z11 = z4;
                        z7 = z3;
                        str24 = str12;
                        c50624 = c50622;
                        i24 = i29222;
                        i23 = i6;
                        str22 = str5;
                        str18 = str3;
                        str20 = str2;
                        z8 = z2;
                        str21 = str6;
                    }
                    int i292222 = m69812 ^ i7;
                    str19 = str13;
                    z11 = z4;
                    z7 = z3;
                    str24 = str12;
                    c50624 = c50622;
                    i24 = i292222;
                    i23 = i6;
                    str22 = str5;
                    str18 = str3;
                    str20 = str2;
                    z8 = z2;
                    str21 = str6;
                case -366111696:
                case 1466927670:
                    c50623.m14610();
                    c50624.m14610();
                    C1916.m6302(C4616.m13549(C7811.m20835(C7811.m20835(C7811.m20835(C7811.m20835(ViewOnClickListenerC1958.m6438(ApplicationC20075.f65008).mo25853(i15, C0964.m3396(f32330, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 16, i25)), C4616.m13542(f32330, 233, 22, i25), z10), ServiceConnectionC3453.m10568(f32330, 255, 17, i25), z6), C0483.m2128(f32330, 272, 15, i25), z9), RunnableC1108.m3789(f32330, 287, 19, i25), z7), C1420.m4902(f32330, 306, 25, i25), z8));
                    C3663.m11167(dialogInterfaceC0206);
                    Main m49336 = C21923.m49336(c16560);
                    final int i31 = i15;
                    final C12164 c121645 = c12164;
                    final boolean z13 = z6;
                    final boolean z14 = z8;
                    final boolean z15 = z7;
                    final String str27 = str16;
                    final int i32 = i18;
                    final int i33 = i19;
                    C10025.m25197(new InterfaceC12846(this) { // from class: l.ۤۙܽ

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC10732 f30264;

                        @Override // l.InterfaceC12846
                        public final /* synthetic */ void onCanceled() {
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
                        
                            if (l.C3746.f11829 <= 0) goto L44;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
                        
                            if (l.C0422.f1886 <= 0) goto L52;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
                        
                            if (l.C4263.f13799 > 0) goto L52;
                         */
                        @Override // l.InterfaceC12846
                        /* renamed from: ֫ */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void mo3776(l.C11667 r25, boolean r26) {
                            /*
                                Method dump skipped, instructions count: 648
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.C10068.mo3776(l.ۨۧᩳ, boolean):void");
                        }

                        @Override // l.InterfaceC12846
                        /* renamed from: ֫ */
                        public final /* synthetic */ boolean mo3777(Exception exc3) {
                            return false;
                        }

                        {
                            int i34 = 1070927198;
                            int i35 = C3911.f12484;
                            int i36 = C2520.f8000;
                            int m25667 = C0630.m2566("ۖ۫") ^ i36;
                            int i37 = ((m25667 ^ i35) * (-30723)) ^ 261862154;
                            int i38 = 1707099381;
                            while (true) {
                                i34 = ((((i34 ^ i35) * 7585) >> 31) & i37) ^ (m25667 ^ i38);
                                switch (i34) {
                                    case -1931005138:
                                    case 439066390:
                                        C3432.m10477();
                                        C0237.m1481();
                                        m25667 = (C2105.m6981("ᩴۡ") ^ i35) * (-125);
                                        i37 = ((m25667 ^ i36) * 21053) ^ 609002002;
                                        i38 = 2096964373;
                                    case -1924784768:
                                    case 1774956419:
                                        if (C22628.f73083 > 0) {
                                            m25667 = (C2105.m6981("ᩴۡ") ^ i35) * (-125);
                                            i37 = ((m25667 ^ i36) * 21053) ^ 609002002;
                                            i38 = 2096964373;
                                        } else {
                                            m25667 = C0630.m2566("ܳ۟") ^ i36;
                                            i37 = ((m25667 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        }
                                    case -1496391301:
                                    case 179210897:
                                        if (C7106.f21815 != 0) {
                                            m25667 = (C2105.m6981("֫᩻") ^ i35) * (-43);
                                            i37 = ((m25667 ^ i36) * 19705) ^ (-14115107);
                                            i38 = 1217074162;
                                        } else {
                                            m25667 = (i36 - C0630.m2566("᩸۬")) * (-59);
                                            i37 = ((m25667 ^ i35) * (-21079)) ^ (-631723634);
                                            i38 = -314254051;
                                        }
                                    case -1448002691:
                                    case -593250030:
                                        if (C1711.f5919) {
                                            m25667 = (C2105.m6981("ᩴۡ") ^ i35) * (-125);
                                            i37 = ((m25667 ^ i36) * 21053) ^ 609002002;
                                            i38 = 2096964373;
                                        } else {
                                            m25667 = C0630.m2566("ۙ᩺") ^ i36;
                                            i37 = ((m25667 ^ i35) * (-29029)) ^ (-2013719412);
                                            i38 = -1908022364;
                                        }
                                    case -1312877672:
                                    case 604339689:
                                        return;
                                    case -1252508694:
                                    case 767905273:
                                        if (C1128.f4106 <= 0) {
                                            m25667 = C0630.m2566("ܳ۟") ^ i36;
                                            i37 = ((m25667 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        } else {
                                            m25667 = (C2105.m6981("ܶ۫") + i35) * 33;
                                            i37 = ((m25667 ^ i36) * 31691) ^ 568071890;
                                            i38 = -1411538626;
                                        }
                                    case -1233459398:
                                    case -295414156:
                                        this.f30264 = this;
                                        if (C1504.f5354) {
                                            m25667 = (C2105.m6981("ᩴۡ") ^ i35) * (-125);
                                            i37 = ((m25667 ^ i36) * 21053) ^ 609002002;
                                            i38 = 2096964373;
                                        } else {
                                            m25667 = C0630.m2566("۠۟") ^ i36;
                                            i37 = ((m25667 ^ i35) * 5367) ^ 1736098881;
                                            i38 = -1503568302;
                                        }
                                    case -1178024253:
                                    case 1814227623:
                                        if (C5695.f17556 >= 0) {
                                            m25667 = (C2105.m6981("֫᩻") ^ i35) * (-43);
                                            i37 = ((m25667 ^ i36) * 19705) ^ (-14115107);
                                            i38 = 1217074162;
                                        } else {
                                            m25667 = (i35 - C0630.m2566("۠ᩳ")) * (-89);
                                            i37 = ((m25667 ^ i36) * (-32305)) ^ (-917171991);
                                            i38 = 317339571;
                                        }
                                    case -909763956:
                                    case 290795679:
                                        C2105.m6982();
                                        if (C3911.m11924() > 0) {
                                            m25667 = C0630.m2566("ܳ۟") ^ i36;
                                            i37 = ((m25667 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        } else {
                                            m25667 = C0630.m2566("᩻ۛ") ^ i36;
                                            i37 = ((m25667 ^ i35) * (-18369)) ^ 1667887292;
                                            i38 = 115469844;
                                        }
                                    case -710372442:
                                    case 932154853:
                                        if (C5695.m16023() >= 0) {
                                            m25667 = (C0630.m2566("᩶ۡ") + i35) * 93;
                                            i37 = ((m25667 ^ i36) * (-25051)) ^ (-674444041);
                                            i38 = 678907596;
                                        } else {
                                            m25667 = (C0630.m2566("ܰ᩻") + i35) * 61;
                                            i37 = ((m25667 ^ i36) * 31025) ^ (-963674978);
                                            i38 = -1567254373;
                                        }
                                    case -602545044:
                                    case 1756904692:
                                        if (C4159.f13567) {
                                            m25667 = C0630.m2566("ۜۨ") ^ i36;
                                            i37 = ((m25667 ^ i35) * 30979) ^ 631876099;
                                            i38 = 845993243;
                                        } else {
                                            m25667 = C0630.m2566("ܳ۟") ^ i36;
                                            i37 = ((m25667 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        }
                                    case 538347369:
                                    case 1204371961:
                                        if (C11340.m28031()) {
                                            m25667 = (C0630.m2566("۫ܿ") ^ i36) * 7;
                                            i37 = ((m25667 ^ i35) * (-24123)) ^ 1742628490;
                                            i38 = -420277051;
                                        } else {
                                            m25667 = (C2105.m6981("ᩴۡ") ^ i35) * (-125);
                                            i37 = ((m25667 ^ i36) * 21053) ^ 609002002;
                                            i38 = 2096964373;
                                        }
                                    case 946665981:
                                    case 1132852515:
                                        C2105.m6982();
                                        throw new RuntimeException();
                                    case 1015043453:
                                    case 1836761294:
                                        if (C0798.m2998() != 0) {
                                            m25667 = (C2105.m6981("֫᩻") ^ i35) * (-43);
                                            i37 = ((m25667 ^ i36) * 19705) ^ (-14115107);
                                            i38 = 1217074162;
                                        } else {
                                            m25667 = C2105.m6981("᩺֡") ^ i35;
                                            i37 = ((m25667 ^ i36) * (-22897)) ^ 1130842955;
                                            i38 = -1025154661;
                                        }
                                    case 1103769939:
                                    case 2134656571:
                                        if (C0630.f2410 > 0) {
                                            m25667 = C0630.m2566("ܳ۟") ^ i36;
                                            i37 = ((m25667 ^ i35) * (-19549)) ^ (-1602778049);
                                            i38 = -1852853938;
                                        } else {
                                            m25667 = (C0630.m2566("᩶ۡ") + i35) * 93;
                                            i37 = ((m25667 ^ i36) * (-25051)) ^ (-674444041);
                                            i38 = 678907596;
                                        }
                                    default:
                                        if (C0714.m2805()) {
                                            m25667 = C2105.m6981("ۙ֡") ^ i35;
                                            i37 = ((m25667 ^ i36) * 4239) ^ 429744631;
                                            i38 = -1591034364;
                                        } else {
                                            m25667 = (C0630.m2566("᩶ۡ") + i35) * 93;
                                            i37 = ((m25667 ^ i36) * (-25051)) ^ (-674444041);
                                            i38 = 678907596;
                                        }
                                }
                            }
                        }
                    }, m49336, this.f32336);
                    break;
                case -360583079:
                case 1793445900:
                    str12 = str24;
                    c50622 = c50624;
                    z3 = z7;
                    z4 = z11;
                    str6 = str21;
                    str13 = str19;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    short s = f32330[166];
                    int i34 = 55424 * s;
                    int i35 = s + 13856;
                    if ((i35 * i35) - i34 < 0) {
                        m69812 = (C2105.m6981("᩶ۜ") ^ i22) * (-19);
                        i6 = ((m69812 ^ i21) * 18257) ^ 1248915928;
                        i7 = 2034546104;
                    } else {
                        m69812 = C2105.m6981("ܳ֡") ^ i21;
                        i6 = ((m69812 ^ i22) * 499) ^ 611380105;
                        i7 = 95160086;
                    }
                    int i2922222 = m69812 ^ i7;
                    str19 = str13;
                    z11 = z4;
                    z7 = z3;
                    str24 = str12;
                    c50624 = c50622;
                    i24 = i2922222;
                    i23 = i6;
                    str22 = str5;
                    str18 = str3;
                    str20 = str2;
                    z8 = z2;
                    str21 = str6;
                case -216345739:
                case 1996696607:
                    m65722 = C9896.m24993(str17);
                    c5062 = c50624;
                    z = z7;
                    str = str21;
                    m6572 = i17;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    i19 = m65722;
                    i18 = m6572;
                    str16 = str22;
                    c12164 = c121644;
                    m2566 = C2105.m6981("᩷۬") ^ i22;
                    i2 = ((m2566 ^ i21) * (-14939)) ^ 1270560680;
                    i3 = 863511363;
                    i24 = m2566 ^ i3;
                    i23 = i2;
                    str18 = str3;
                    c50624 = c5062;
                    str20 = str2;
                    z8 = z2;
                    str21 = str;
                    z7 = z;
                case -140492350:
                case 1807982965:
                    if (C9896.m24997(C3432.m10478(str22, i26))) {
                        int m25667 = C0630.m2566("ۧ᩷") ^ i21;
                        z = z7;
                        i = ((m25667 ^ i22) * 6691) ^ 1809117520;
                        i24 = m25667 ^ 1439041687;
                        i23 = i;
                        z7 = z;
                    } else {
                        c5062 = c50624;
                        z = z7;
                        str = str21;
                        z2 = z8;
                        str2 = str20;
                        str3 = str18;
                        m2566 = C0630.m2566("ۜ᩻") ^ i21;
                        i2 = ((m2566 ^ i22) * (-7977)) ^ 818047213;
                        i3 = 1410551334;
                        i24 = m2566 ^ i3;
                        i23 = i2;
                        str18 = str3;
                        c50624 = c5062;
                        str20 = str2;
                        z8 = z2;
                        str21 = str;
                        z7 = z;
                    }
                case -104147723:
                case 852158940:
                    C3683.m11220(C4117.m12351(C4075.m12251(C0630.m2566(C1128.m3841(f32330, 214, 3, i25)) ^ 2127814375), str21));
                    C1711.m5740(c50624);
                    break;
                case -95189465:
                case 100981650:
                    str12 = str24;
                    c50622 = c50624;
                    z3 = z7;
                    str6 = str21;
                    str13 = str19;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    if (z6) {
                        m25662 = (C2105.m6981("ۜ᩸") ^ i21) * 19;
                        i8 = ((m25662 ^ i22) * (-22019)) ^ 1017933395;
                        i9 = -158057407;
                        int i28222222222 = m25662 ^ i9;
                        str19 = str13;
                        z7 = z3;
                        str24 = str12;
                        str22 = str5;
                        i24 = i28222222222;
                        i23 = i8;
                        str18 = str3;
                        c50624 = c50622;
                        str20 = str2;
                        z8 = z2;
                        str21 = str6;
                    } else {
                        str19 = str5;
                        int m25668 = (C0630.m2566("ۡ֡") ^ i22) * (-25);
                        c50624 = c50622;
                        z7 = z3;
                        str22 = str5;
                        str18 = str3;
                        str20 = str2;
                        z8 = z2;
                        str21 = str6;
                        String str28 = str12;
                        i24 = m25668 ^ (-1356097630);
                        i23 = ((m25668 ^ i21) * 30247) ^ (-1071745451);
                        str24 = str28;
                    }
                case -64713075:
                case 832837313:
                    str8 = str24;
                    c5062 = c50624;
                    str9 = str22;
                    z = z7;
                    z2 = z8;
                    str2 = str20;
                    str11 = str19;
                    String m7507 = C2272.m7507(f32330, 180, 1, i25);
                    boolean m20838 = C7811.m20838(str2, m7507);
                    str3 = m7507;
                    str10 = C4159.m12578(f32330, 181, 24, i25);
                    if (m20838) {
                        m25663 = C2105.m6981("ᩴۗ") ^ i21;
                        i11 = ((m25663 ^ i22) * 14065) ^ (-693597748);
                        i12 = -2137928827;
                        int i302 = m25663 ^ i12;
                        str19 = str11;
                        z7 = z;
                        str24 = str8;
                        i24 = i302;
                        c50624 = c5062;
                        boolean z122 = z2;
                        str21 = str10;
                        i23 = i11;
                        str22 = str9;
                        str18 = str3;
                        str20 = str2;
                        z8 = z122;
                    }
                    m25663 = (C0630.m2566("ᩳۤ") ^ i22) * (-103);
                    i11 = ((m25663 ^ i21) * (-26441)) ^ 584296304;
                    i12 = 1068875967;
                    int i3022 = m25663 ^ i12;
                    str19 = str11;
                    z7 = z;
                    str24 = str8;
                    i24 = i3022;
                    c50624 = c5062;
                    boolean z1222 = z2;
                    str21 = str10;
                    i23 = i11;
                    str22 = str9;
                    str18 = str3;
                    str20 = str2;
                    z8 = z1222;
                case 84032557:
                case 1926550672:
                    str12 = str24;
                    c50622 = c50624;
                    z3 = z7;
                    str6 = str21;
                    str13 = str19;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    i27 = C0630.m2566(C1773.m5917(f32330, 173, 3, i25)) ^ 2102884404;
                    m25662 = (i22 - C0630.m2566("ۡܿ")) * 123;
                    i8 = ((m25662 ^ i21) * 29399) ^ 1190373993;
                    i9 = 1730219029;
                    int i282222222222 = m25662 ^ i9;
                    str19 = str13;
                    z7 = z3;
                    str24 = str12;
                    str22 = str5;
                    i24 = i282222222222;
                    i23 = i8;
                    str18 = str3;
                    c50624 = c50622;
                    str20 = str2;
                    z8 = z2;
                    str21 = str6;
                case 185231789:
                case 1148076255:
                    c5062 = c50624;
                    z = z7;
                    str = str21;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    try {
                        try {
                            m6572 = AbstractC2021.m6572(str2);
                            m65722 = AbstractC2021.m6572(str22);
                            i19 = m65722;
                            i18 = m6572;
                            str16 = str22;
                            c12164 = c121644;
                            m2566 = C2105.m6981("᩷۬") ^ i22;
                            i2 = ((m2566 ^ i21) * (-14939)) ^ 1270560680;
                            i3 = 863511363;
                        } catch (NumberFormatException unused) {
                            m2566 = (C2105.m6981("ۘ᩷") ^ i22) * (-85);
                            i2 = ((m2566 ^ i21) * 12667) ^ 675285318;
                            i3 = -2082523386;
                        }
                    } catch (NumberFormatException unused2) {
                        m2566 = (i21 - C0630.m2566("ۢۚ")) * 83;
                        i2 = ((m2566 ^ i22) * 17867) ^ 375845515;
                        i3 = 1964419006;
                    }
                    i24 = m2566 ^ i3;
                    i23 = i2;
                    str18 = str3;
                    c50624 = c5062;
                    str20 = str2;
                    z8 = z2;
                    str21 = str;
                    z7 = z;
                case 444004462:
                case 1219269768:
                    if (C7811.m20838(str22, str24)) {
                        z = z7;
                        str = str21;
                        z2 = z8;
                        m6981 = C2105.m6981("᩺֡") ^ i21;
                        i4 = ((m6981 ^ i22) * 19007) ^ 1778497627;
                        i5 = 586909330;
                        i24 = m6981 ^ i5;
                        i23 = i4;
                        z8 = z2;
                        str21 = str;
                        z7 = z;
                    } else {
                        str17 = str22;
                        m25664 = (i21 - C0630.m2566("ܽ᩶")) * (-121);
                        i13 = ((m25664 ^ i22) * (-28827)) ^ (-2044872141);
                        i14 = 821733968;
                        i24 = m25664 ^ i14;
                        i23 = i13;
                    }
                case 620640739:
                case 1668655933:
                    str12 = str24;
                    c50622 = c50624;
                    z3 = z7;
                    z4 = z11;
                    str6 = str21;
                    str13 = str19;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    i25 = 19340;
                    m69812 = C0630.m2566("ۘ۫") ^ i21;
                    i6 = ((m69812 ^ i22) * (-32357)) ^ (-94650951);
                    i7 = 1525417834;
                    int i29222222 = m69812 ^ i7;
                    str19 = str13;
                    z11 = z4;
                    z7 = z3;
                    str24 = str12;
                    c50624 = c50622;
                    i24 = i29222222;
                    i23 = i6;
                    str22 = str5;
                    str18 = str3;
                    str20 = str2;
                    z8 = z2;
                    str21 = str6;
                case 689233017:
                case 952024636:
                    RunnableC0588.m2440(C4616.m13559(exc));
                    C1711.m5740(c50624);
                    break;
                case 724036224:
                case 1421036346:
                    c50622 = c50624;
                    z3 = z7;
                    String str29 = str21;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    try {
                        str12 = str24;
                        try {
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str12 = str24;
                    }
                    try {
                        str6 = str29;
                        try {
                            str5 = str22;
                            try {
                                str19 = C3683.m11219(RunnableC0588.m2443(RunnableC0588.m2443(C3683.m11219(C3683.m11219(str22, RunnableC1108.m3789(f32330, 205, 2, i25), C1005.m3502(f32330, 210, 1, i25)), RunnableC1937.m6385(f32330, 331, 2, i25), C3663.m11162(f32330, 333, 1, i25)), C5695.m16034(f32330, 337, 2, i25), C21923.m49334(f32330, 339, 1, i25)), C2520.m8030(f32330, 340, 2, i25), C1773.m5917(f32330, 342, 1, i25)), C22628.m50602(f32330, 343, 2, i25), C22628.m50602(f32330, 345, 1, i25));
                                int m256682 = (C0630.m2566("ۡ֡") ^ i22) * (-25);
                                c50624 = c50622;
                                z7 = z3;
                                str22 = str5;
                                str18 = str3;
                                str20 = str2;
                                z8 = z2;
                                str21 = str6;
                                String str282 = str12;
                                i24 = m256682 ^ (-1356097630);
                                i23 = ((m256682 ^ i21) * 30247) ^ (-1071745451);
                                str24 = str282;
                            } catch (Exception e4) {
                                e = e4;
                                exc2 = e;
                                z4 = z11;
                                str13 = str19;
                                m69812 = (i21 - C0630.m2566("᩻᩹")) * 93;
                                i6 = ((m69812 ^ i22) * 10709) ^ (-393780802);
                                i7 = -736020783;
                                int i292222222 = m69812 ^ i7;
                                str19 = str13;
                                z11 = z4;
                                z7 = z3;
                                str24 = str12;
                                c50624 = c50622;
                                i24 = i292222222;
                                i23 = i6;
                                str22 = str5;
                                str18 = str3;
                                str20 = str2;
                                z8 = z2;
                                str21 = str6;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            str5 = str22;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        str5 = str22;
                        str6 = str29;
                        exc2 = e;
                        z4 = z11;
                        str13 = str19;
                        m69812 = (i21 - C0630.m2566("᩻᩹")) * 93;
                        i6 = ((m69812 ^ i22) * 10709) ^ (-393780802);
                        i7 = -736020783;
                        int i2922222222 = m69812 ^ i7;
                        str19 = str13;
                        z11 = z4;
                        z7 = z3;
                        str24 = str12;
                        c50624 = c50622;
                        i24 = i2922222222;
                        i23 = i6;
                        str22 = str5;
                        str18 = str3;
                        str20 = str2;
                        z8 = z2;
                        str21 = str6;
                    }
                case 1010144412:
                case 1015954389:
                    String str30 = str24;
                    z = z7;
                    boolean z16 = z11;
                    String str31 = str21;
                    String str32 = str18;
                    String str33 = str19;
                    boolean z17 = z8;
                    c50623 = this.f32335;
                    String m947 = C0050.m947(c50623.m14611());
                    C5062 c50625 = this.f32333;
                    String m9472 = C0050.m947(c50625.m14611());
                    boolean m19121 = C7106.m19121(m947);
                    DialogInterfaceC0206 dialogInterfaceC02062 = this.f32340;
                    if (m19121) {
                        int m69815 = (C2105.m6981("ᩳᩳ") ^ i22) * 35;
                        i23 = ((m69815 ^ i21) * (-22675)) ^ (-295325090);
                        str19 = str33;
                        z11 = z16;
                        c50624 = c50625;
                        str22 = m9472;
                        dialogInterfaceC0206 = dialogInterfaceC02062;
                        str18 = str32;
                        z8 = z17;
                        str24 = str30;
                        str21 = str31;
                        str20 = m947;
                        i24 = m69815 ^ 2054755644;
                        z7 = z;
                    } else {
                        int m69816 = C2105.m6981("ۡᩴ") ^ i22;
                        i = ((m69816 ^ i21) * 30983) ^ 943132053;
                        str19 = str33;
                        z11 = z16;
                        c50624 = c50625;
                        str22 = m9472;
                        dialogInterfaceC0206 = dialogInterfaceC02062;
                        str18 = str32;
                        z8 = z17;
                        str24 = str30;
                        str21 = str31;
                        str20 = m947;
                        i24 = m69816 ^ (-784920992);
                        i23 = i;
                        z7 = z;
                    }
                case 1293657805:
                case 1396291076:
                    if (C9896.m24999(str17)) {
                        m25664 = C0630.m2566("ܶ۬") ^ i22;
                        i13 = ((m25664 ^ i21) * (-21303)) ^ (-337173641);
                        i14 = 709671205;
                    } else {
                        m25664 = (C0630.m2566("۟۫") + i22) * 115;
                        i13 = ((m25664 ^ i21) * (-19625)) ^ (-724127771);
                        i14 = 1879836634;
                    }
                    i24 = m25664 ^ i14;
                    i23 = i13;
                case 1401667412:
                case 1773801736:
                    str12 = str24;
                    c50622 = c50624;
                    z3 = z7;
                    str6 = str21;
                    z2 = z8;
                    str2 = str20;
                    str3 = str18;
                    str5 = str22;
                    try {
                        str13 = str19;
                    } catch (Exception e7) {
                        e = e7;
                        str13 = str19;
                    }
                    try {
                        C13574.m32628(c121643.pattern(), str13);
                        str15 = str13;
                        c121642 = c121643;
                        m25662 = C0630.m2566("ۨۡ") ^ i22;
                        i8 = ((m25662 ^ i21) * (-15831)) ^ (-1284239432);
                        i9 = 1135315253;
                    } catch (Exception e8) {
                        e = e8;
                        exc = e;
                        m25662 = C0630.m2566("ᩳ۫") ^ i21;
                        i8 = ((m25662 ^ i22) * (-31145)) ^ (-159703192);
                        i9 = 1338945092;
                        int i2822222222222 = m25662 ^ i9;
                        str19 = str13;
                        z7 = z3;
                        str24 = str12;
                        str22 = str5;
                        i24 = i2822222222222;
                        i23 = i8;
                        str18 = str3;
                        c50624 = c50622;
                        str20 = str2;
                        z8 = z2;
                        str21 = str6;
                    }
                    int i28222222222222 = m25662 ^ i9;
                    str19 = str13;
                    z7 = z3;
                    str24 = str12;
                    str22 = str5;
                    i24 = i28222222222222;
                    i23 = i8;
                    str18 = str3;
                    c50624 = c50622;
                    str20 = str2;
                    z8 = z2;
                    str21 = str6;
                default:
                    C1504.m5167(C0630.m2566(C11340.m28025(f32330, Primes.SMALL_FACTOR_LIMIT, 3, i25)) ^ 2102893899);
                    C1711.m5740(c50623);
                    break;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26917(ViewOnClickListenerC10732 viewOnClickListenerC10732, int i, C12164 c12164, boolean z, boolean z2, boolean z3, String str, int i2, int i3, C11667 c11667, boolean z4) {
        int m2566;
        int i4;
        AbstractC15440 abstractC15440 = null;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        int i7 = 852338933;
        int i8 = C3683.f11629;
        int i9 = C4075.f12947;
        int m6981 = C2105.m6981("ۘ᩺") ^ i9;
        int i10 = ((m6981 ^ i8) * 11845) ^ (-826332150);
        int i11 = m6981 ^ 1399314034;
        AbstractC15440 abstractC154402 = null;
        while (true) {
            i7 = i11 ^ ((((i7 ^ i8) * 13755) >> 31) & i10);
            switch (i7) {
                case -1936222303:
                case 1533657369:
                    i5 = 25290;
                    m2566 = (C2105.m6981("ܶۛ") ^ i9) * (-31);
                    i10 = ((m2566 ^ i8) * (-21213)) ^ 1880877547;
                    i4 = -2045852257;
                    i11 = m2566 ^ i4;
                case -1817677242:
                case 1652653328:
                    if (C2520.f8000 < 0) {
                        m2566 = (i9 - C2105.m6981("ۜۙ")) * (-55);
                        i10 = ((m2566 ^ i8) * (-7337)) ^ (-1749193630);
                        i4 = -706951230;
                        i11 = m2566 ^ i4;
                    }
                    m2566 = C2105.m6981("ܶܰ") ^ i9;
                    i10 = ((m2566 ^ i8) * (-15887)) ^ (-274897967);
                    i4 = 572306739;
                    i11 = m2566 ^ i4;
                case -1663946498:
                case -1655683418:
                    C4075.m12263();
                    if (C3911.f12484 < 0) {
                        m2566 = C2105.m6981("ܶܰ") ^ i9;
                        i10 = ((m2566 ^ i8) * (-15887)) ^ (-274897967);
                        i4 = 572306739;
                        i11 = m2566 ^ i4;
                    }
                    m2566 = C2105.m6981("ܿ۬") ^ i8;
                    i10 = ((m2566 ^ i9) * (-1421)) ^ (-270755155);
                    i4 = -1221944263;
                    i11 = m2566 ^ i4;
                case -1438170543:
                case 473434655:
                    AbstractC2021.m6574();
                    if (C4075.f12947 >= 0) {
                        m2566 = (C0630.m2566("ܳ֫") + i8) * 43;
                        i10 = ((m2566 ^ i9) * (-21219)) ^ (-748036969);
                        i4 = -180776403;
                        i11 = m2566 ^ i4;
                    }
                    m2566 = C2105.m6981("ܿ۬") ^ i8;
                    i10 = ((m2566 ^ i9) * (-1421)) ^ (-270755155);
                    i4 = -1221944263;
                    i11 = m2566 ^ i4;
                case -1118855239:
                case -86784638:
                    abstractC15440 = viewOnClickListenerC10732.f32339;
                    abstractC154402 = abstractC15440.m36491(C1504.m5177(f32330, 158, 4, i5));
                    sArr = f32330;
                    if (!C3683.m11222()) {
                        m2566 = C2105.m6981("ܰ᩶") ^ i8;
                        i10 = ((m2566 ^ i9) * 30869) ^ 328659225;
                        i4 = 1341982842;
                        i11 = m2566 ^ i4;
                    }
                    m2566 = (C0630.m2566("ܳ֫") + i8) * 43;
                    i10 = ((m2566 ^ i9) * (-21219)) ^ (-748036969);
                    i4 = -180776403;
                    i11 = m2566 ^ i4;
                case -1014507786:
                case 344754005:
                    if (RunnableC1937.f6483 < 0) {
                        m2566 = (i8 - C2105.m6981("۫ۘ")) * (-73);
                        i10 = ((m2566 ^ i9) * 20693) ^ (-19034087);
                        i4 = 479642772;
                        i11 = m2566 ^ i4;
                    }
                    m2566 = C2105.m6981("ܶܰ") ^ i9;
                    i10 = ((m2566 ^ i8) * (-15887)) ^ (-274897967);
                    i4 = 572306739;
                    i11 = m2566 ^ i4;
                case -999743547:
                case -477099428:
                    if (C2520.f8000 < 0) {
                        m2566 = C0630.m2566("۫ᩴ") ^ i8;
                        i10 = ((m2566 ^ i9) * 5073) ^ (-1223808822);
                        i4 = -1777972204;
                        i11 = m2566 ^ i4;
                    }
                    m2566 = (C0630.m2566("ܳ֫") + i8) * 43;
                    i10 = ((m2566 ^ i9) * (-21219)) ^ (-748036969);
                    i4 = -180776403;
                    i11 = m2566 ^ i4;
                case -893209734:
                case -447339053:
                    short s = f32330[157];
                    int i12 = (s * 2) + 1;
                    int i13 = s + 1;
                    if ((i13 * i13) - i12 < 0) {
                        m2566 = C2105.m6981("ܺ۟") ^ i8;
                        i10 = ((m2566 ^ i9) * 10355) ^ 603337782;
                        i4 = -1541525910;
                    } else {
                        m2566 = C0630.m2566("᩹᩶") ^ i9;
                        i10 = ((m2566 ^ i8) * 4461) ^ (-751420752);
                        i4 = 80726372;
                    }
                    i11 = m2566 ^ i4;
                case -789496075:
                case 1495141108:
                    if (C1128.f4106 > 0) {
                        m2566 = C2105.m6981("ۢۘ") ^ i8;
                        i10 = ((m2566 ^ i9) * 10345) ^ 9271379;
                        i4 = 148592382;
                        i11 = m2566 ^ i4;
                    }
                    m2566 = C2105.m6981("ܿ۬") ^ i8;
                    i10 = ((m2566 ^ i9) * (-1421)) ^ (-270755155);
                    i4 = -1221944263;
                    i11 = m2566 ^ i4;
                case -762769715:
                case 152186960:
                    if (C5695.f17556 < 0) {
                        m2566 = (i8 - C2105.m6981("ۘۛ")) * 83;
                        i10 = ((m2566 ^ i9) * (-19901)) ^ (-294026229);
                        i4 = -2083143141;
                        i11 = m2566 ^ i4;
                    }
                    m2566 = C2105.m6981("ܿ۬") ^ i8;
                    i10 = ((m2566 ^ i9) * (-1421)) ^ (-270755155);
                    i4 = -1221944263;
                    i11 = m2566 ^ i4;
                case -616814328:
                case 790562225:
                    i6 = RunnableC1937.m6387();
                    m2566 = (C0630.m2566("ۗ᩶") ^ i8) * (-103);
                    i10 = ((m2566 ^ i9) * (-18911)) ^ (-2016992199);
                    i4 = -265239183;
                    i11 = m2566 ^ i4;
                case -405958342:
                case -166180386:
                    if (C2958.f9394 >= 0) {
                        m2566 = C2105.m6981("ܿ۬") ^ i8;
                        i10 = ((m2566 ^ i9) * (-1421)) ^ (-270755155);
                        i4 = -1221944263;
                        i11 = m2566 ^ i4;
                    } else {
                        int m25662 = (C0630.m2566("ܶۜ") ^ i9) * (-53);
                        i10 = (-674708035) ^ ((m25662 ^ i8) * (-32139));
                        i11 = (-1699444762) ^ m25662;
                    }
                case -133709360:
                case 1839929651:
                    if (i6 == 0) {
                        m2566 = (C2105.m6981("ᩳ᩸") + i9) * (-13);
                        i10 = ((m2566 ^ i8) * (-21489)) ^ (-280214547);
                        i4 = 709893493;
                        i11 = m2566 ^ i4;
                    }
                    m2566 = (C0630.m2566("ܳ֫") + i8) * 43;
                    i10 = ((m2566 ^ i9) * (-21219)) ^ (-748036969);
                    i4 = -180776403;
                    i11 = m2566 ^ i4;
                case -61060315:
                case 1693472333:
                    if (C2958.f9394 >= 0) {
                        m2566 = (C0630.m2566("ܰۘ") + i9) * (-13);
                        i10 = ((m2566 ^ i8) * (-26747)) ^ (-1618732807);
                        i4 = -1912330202;
                    } else {
                        m2566 = (i9 - C2105.m6981("ܽۨ")) * 109;
                        i10 = ((m2566 ^ i8) * 29105) ^ 586540557;
                        i4 = -995709581;
                    }
                    i11 = m2566 ^ i4;
                case 202514980:
                case 1352206690:
                    i5 = 37993;
                    m2566 = (C2105.m6981("ܶۛ") ^ i9) * (-31);
                    i10 = ((m2566 ^ i8) * (-21213)) ^ 1880877547;
                    i4 = -2045852257;
                    i11 = m2566 ^ i4;
                case 336051553:
                case 1631753649:
                    if (C4263.m12819() < 0) {
                        m2566 = (C2105.m6981("۟ܽ") ^ i9) * 23;
                        i10 = ((m2566 ^ i8) * 10677) ^ (-1977829744);
                        i4 = 1421080831;
                        i11 = m2566 ^ i4;
                    }
                    m2566 = C2105.m6981("ܿ۬") ^ i8;
                    i10 = ((m2566 ^ i9) * (-1421)) ^ (-270755155);
                    i4 = -1221944263;
                    i11 = m2566 ^ i4;
                case 886761961:
                case 962920850:
                    if (C1047.f3863 < 0) {
                        m2566 = (C2105.m6981("ۢ֨") ^ i9) * 91;
                        i10 = ((m2566 ^ i8) * (-8307)) ^ (-177018042);
                        i4 = 1907567802;
                        i11 = m2566 ^ i4;
                    }
                    m2566 = C2105.m6981("ܿ۬") ^ i8;
                    i10 = ((m2566 ^ i9) * (-1421)) ^ (-270755155);
                    i4 = -1221944263;
                    i11 = m2566 ^ i4;
                case 1106220892:
                case 1135458905:
                    C11340.m28031();
                    break;
                case 1184744834:
                case 1581331020:
                    C4075.m12263();
                    m2566 = C2105.m6981("ܿ۬") ^ i8;
                    i10 = ((m2566 ^ i9) * (-1421)) ^ (-270755155);
                    i4 = -1221944263;
                    i11 = m2566 ^ i4;
                default:
                    C0964.m3402(new C7245(viewOnClickListenerC10732, abstractC15440.m36520(C1711.m5726(sArr, 162, 4, i5)), c11667, z4, i, c12164, z, z2, str, i2, i3, abstractC154402, z3));
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (l.C4159.m12565() >= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        if (l.C0422.f1886 > 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        if (l.C0050.f910 < 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d2, code lost:
    
        if (r20 != 4) goto L53;
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemSelected(android.widget.AdapterView r18, android.view.View r19, int r20, long r21) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC10732.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
