package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.json.JSONObject;

/* compiled from: T5M8 */
/* renamed from: l.᩸ᩴۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21765 extends AbstractC7548 {

    /* renamed from: ۤ᩹ۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f69734 = {5603, 30473, 30488, 30464, 30512, 30487, 30495, 30486, 30536, 30518, 30514, 30536, 30541, 30528, 30538, 30528, 30543, 30538, 30528, 30543, 30539, 30539, 30538, 30541, 30540, 30543};

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f69735;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69736;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69737;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f69738;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69739;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IWXAPI f69740;

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
    }

    public C21765(AbstractActivityC3346 abstractActivityC3346, String str, long j, int i, String str2, IWXAPI iwxapi) {
        int i2 = -30505652;
        int i3 = C2167.f7158;
        int i4 = C4263.f13799;
        this.f69738 = abstractActivityC3346;
        this.f69737 = str;
        this.f69735 = j;
        this.f69739 = i;
        this.f69736 = str2;
        this.f69740 = iwxapi;
        int m6981 = C2105.m6981("۫ۚ") ^ i4;
        int i5 = ((m6981 ^ i3) * (-31089)) ^ 451209151;
        int i6 = 1538291401;
        while (true) {
            i2 = (m6981 ^ i6) ^ (i5 & (((i2 ^ i3) * 14135) >> 31));
            switch (i2) {
                case -2079045280:
                case 316136985:
                    C0237.m1481();
                    C3911.m11924();
                    m6981 = C2105.m6981("ۘ۠") ^ i4;
                    i5 = ((m6981 ^ i3) * (-8605)) ^ (-860954175);
                    i6 = 521490740;
                case -1581862265:
                case 726246164:
                    RunnableC0588.m2441();
                    RunnableC0588.m2441();
                    throw new RuntimeException();
                case -1393434136:
                case 360946519:
                    if (C2126.f7087) {
                        m6981 = (C2105.m6981("ۨ۫") ^ i4) * (-39);
                        i5 = ((m6981 ^ i3) * (-15591)) ^ (-1083310440);
                        i6 = 450425713;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܽۙ")) * 43;
                        i5 = ((m6981 ^ i4) * 12363) ^ 1082772635;
                        i6 = -1816826537;
                    }
                case -809958540:
                case -716839913:
                    if (RunnableC1937.f6483 < 0) {
                        m6981 = (i3 - C2105.m6981("ܽۙ")) * 43;
                        i5 = ((m6981 ^ i4) * 12363) ^ 1082772635;
                        i6 = -1816826537;
                    } else {
                        m6981 = C0630.m2566("ܺ֨") ^ i4;
                        i5 = ((m6981 ^ i3) * (-29913)) ^ (-730545441);
                        i6 = 568285137;
                    }
                case 511858526:
                case 1877770926:
                    if (C4117.f13076 <= 0) {
                        m6981 = C0630.m2566("᩹ᩴ") ^ i3;
                        i5 = ((m6981 ^ i4) * 16503) ^ (-1327634272);
                        i6 = 384614473;
                    } else {
                        m6981 = (C0630.m2566("ۚۧ") ^ i3) * 95;
                        i5 = ((m6981 ^ i4) * (-13333)) ^ 1071578492;
                        i6 = 599770449;
                    }
                case 521027074:
                case 1486282967:
                    C22628.m50615();
                    if (C2126.m7040()) {
                        m6981 = C2105.m6981("ۘ۠") ^ i4;
                        i5 = ((m6981 ^ i3) * (-8605)) ^ (-860954175);
                        i6 = 521490740;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܽۙ")) * 43;
                        i5 = ((m6981 ^ i4) * 12363) ^ 1082772635;
                        i6 = -1816826537;
                    }
                default:
                    return;
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C3537.m10743(this, this.f69738);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        short[] sArr;
        int m2566;
        int i;
        int i2;
        final String str;
        int i3;
        int i4;
        final JSONObject jSONObject;
        String str2;
        int i5;
        final long j;
        short[] sArr2;
        int i6;
        String str3;
        JSONObject jSONObject2;
        String str4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int m25662;
        int i13;
        int i14;
        JSONObject jSONObject3;
        int m6981;
        int i15;
        int i16;
        int i17;
        long j2;
        long j3;
        int m69812;
        int i18;
        int i19;
        int i20;
        int m69813;
        int i21;
        C21765 c21765 = this;
        int i22 = C1128.f4106;
        int i23 = C2520.f8000;
        int m69814 = C2105.m6981("۟ܳ") ^ i23;
        int i24 = ((m69814 ^ i22) * (-13911)) ^ (-1253924369);
        long j4 = 0;
        JSONObject jSONObject4 = null;
        String str5 = null;
        String str6 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        int i25 = m69814 ^ (-387682670);
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        short s = 0;
        short s2 = 0;
        int i30 = 0;
        String str7 = null;
        int i31 = 1085558810;
        C18237 c18237 = null;
        JSONObject jSONObject5 = null;
        PayReq payReq = null;
        int i32 = 0;
        int i33 = 0;
        while (true) {
            i31 = i25 ^ (i24 & (((i31 ^ i22) * (-15465)) >> 31));
            switch (i31) {
                case -2125288662:
                case 1390107252:
                    sArr = sArr6;
                    i5 = i27;
                    i14 = i30;
                    str = str7;
                    i3 = i32;
                    String str8 = str5;
                    i4 = i26;
                    JSONObject jSONObject6 = jSONObject4;
                    str2 = str8;
                    j2 = C22470.f72774;
                    jSONObject3 = jSONObject6;
                    long j5 = c21765.f69735;
                    if (j5 != j2) {
                        j = j5;
                        m6981 = (C2105.m6981("ۚܶ") + i23) * 43;
                        i15 = ((m6981 ^ i22) * (-8851)) ^ 632917972;
                        i16 = 1395182050;
                        short[] sArr7 = sArr;
                        i25 = m6981 ^ i16;
                        i24 = i15;
                        i26 = i4;
                        str5 = str2;
                        jSONObject4 = jSONObject3;
                        i30 = i14;
                        i17 = i3;
                        str7 = str;
                        sArr6 = sArr7;
                        long j6 = j;
                        i32 = i17;
                        i27 = i5;
                        j4 = j6;
                    } else {
                        int m69815 = C2105.m6981("ۛۧ") ^ i23;
                        int i34 = ((m69815 ^ i22) * 13925) ^ 401150327;
                        str7 = str;
                        sArr6 = sArr;
                        i25 = m69815 ^ 1573024494;
                        i32 = i3;
                        i24 = i34;
                        i27 = i5;
                        i26 = i4;
                        j4 = j5;
                        str5 = str2;
                        jSONObject4 = jSONObject3;
                        i30 = i14;
                    }
                case -1978261121:
                case -1081751096:
                    sArr = sArr6;
                    C18237 c182372 = c18237;
                    i14 = i30;
                    str = str7;
                    str2 = str5;
                    i4 = i26;
                    i3 = i32;
                    long j7 = j4;
                    i5 = i27;
                    j = j7;
                    c182372.m42483(i14);
                    C1773.m5907(c182372, c21765.f69736);
                    jSONObject = C23175.m51353(c182372);
                    if (C11233.m27802((Object) str, (Object) AbstractC2021.m6567())) {
                        m6981 = (C2105.m6981("۠᩷") ^ i23) * (-47);
                        jSONObject3 = jSONObject;
                        i15 = ((m6981 ^ i22) * (-12067)) ^ (-2103839686);
                        i16 = 1276391849;
                        short[] sArr72 = sArr;
                        i25 = m6981 ^ i16;
                        i24 = i15;
                        i26 = i4;
                        str5 = str2;
                        jSONObject4 = jSONObject3;
                        i30 = i14;
                        i17 = i3;
                        str7 = str;
                        sArr6 = sArr72;
                        long j62 = j;
                        i32 = i17;
                        i27 = i5;
                        j4 = j62;
                    }
                    jSONObject3 = jSONObject;
                    m6981 = (C2105.m6981("ۚܶ") + i23) * 43;
                    i15 = ((m6981 ^ i22) * (-8851)) ^ 632917972;
                    i16 = 1395182050;
                    short[] sArr722 = sArr;
                    i25 = m6981 ^ i16;
                    i24 = i15;
                    i26 = i4;
                    str5 = str2;
                    jSONObject4 = jSONObject3;
                    i30 = i14;
                    i17 = i3;
                    str7 = str;
                    sArr6 = sArr722;
                    long j622 = j;
                    i32 = i17;
                    i27 = i5;
                    j4 = j622;
                case -1920544228:
                case -1539623766:
                    sArr = sArr6;
                    i14 = i30;
                    str = str7;
                    jSONObject3 = jSONObject4;
                    str2 = str5;
                    i4 = i26;
                    i3 = i32;
                    long j8 = j4;
                    i5 = i27;
                    j = j8;
                    i29 = 23410;
                    m6981 = C2105.m6981("ᩴۧ") ^ i23;
                    i15 = ((m6981 ^ i22) * 22497) ^ (-493408766);
                    i16 = -111388380;
                    short[] sArr7222 = sArr;
                    i25 = m6981 ^ i16;
                    i24 = i15;
                    i26 = i4;
                    str5 = str2;
                    jSONObject4 = jSONObject3;
                    i30 = i14;
                    i17 = i3;
                    str7 = str;
                    sArr6 = sArr7222;
                    long j6222 = j;
                    i32 = i17;
                    i27 = i5;
                    j4 = j6222;
                case -1772722816:
                case 229186460:
                    sArr = sArr6;
                    payReq.prepayId = C21923.m49332(jSONObject5, C1504.m5177(sArr4, i27, 1, i29));
                    sArr5 = f69734;
                    i26 = 22;
                    if (!AbstractC2021.m6574()) {
                        m2566 = C0630.m2566("۫ܺ") ^ i23;
                        i = ((m2566 ^ i22) * (-18677)) ^ (-500511294);
                        i2 = -214534509;
                        short[] sArr8 = sArr;
                        i25 = m2566 ^ i2;
                        i24 = i;
                        sArr6 = sArr8;
                    }
                    m2566 = (C2105.m6981("۠ۚ") ^ i23) * (-75);
                    i = ((m2566 ^ i22) * (-29723)) ^ (-1627859744);
                    i2 = 785077075;
                    short[] sArr82 = sArr;
                    i25 = m2566 ^ i2;
                    i24 = i;
                    sArr6 = sArr82;
                case -1585008843:
                case 467347582:
                    if (C3245.f10203 > 0) {
                        sArr = sArr6;
                        m2566 = (C2105.m6981("۠ۚ") ^ i23) * (-75);
                        i = ((m2566 ^ i22) * (-29723)) ^ (-1627859744);
                        i2 = 785077075;
                        short[] sArr822 = sArr;
                        i25 = m2566 ^ i2;
                        i24 = i;
                        sArr6 = sArr822;
                    } else {
                        m69813 = C2105.m6981("ᩴ᩵") ^ i22;
                        i20 = ((m69813 ^ i23) * (-31067)) ^ 26711944;
                        i21 = 574139296;
                        i25 = m69813 ^ i21;
                        i24 = i20;
                    }
                case -1317924656:
                case 717218537:
                    C1504.m5179();
                    if (C5695.f17556 < 0) {
                        sArr = sArr6;
                        m2566 = (C2105.m6981("۠ۚ") ^ i23) * (-75);
                        i = ((m2566 ^ i22) * (-29723)) ^ (-1627859744);
                        i2 = 785077075;
                        short[] sArr8222 = sArr;
                        i25 = m2566 ^ i2;
                        i24 = i;
                        sArr6 = sArr8222;
                    } else {
                        sArr = sArr6;
                        str = str7;
                        i3 = i32;
                        String str9 = str5;
                        i4 = i26;
                        jSONObject = jSONObject4;
                        str2 = str9;
                        long j9 = j4;
                        i5 = i27;
                        j = j9;
                        m69812 = (i23 - C0630.m2566("ۛۗ")) * (-29);
                        i18 = ((m69812 ^ i22) * (-32117)) ^ (-299574636);
                        i19 = -562838875;
                        short[] sArr9 = sArr;
                        i25 = m69812 ^ i19;
                        i24 = i18;
                        String str10 = str2;
                        jSONObject4 = jSONObject;
                        i26 = i4;
                        str5 = str10;
                        i12 = i3;
                        str7 = str;
                        sArr6 = sArr9;
                        long j10 = j;
                        i32 = i12;
                        i27 = i5;
                        j4 = j10;
                    }
                case -1124836849:
                case 281576090:
                    sArr = sArr6;
                    str = str7;
                    i3 = i32;
                    String str11 = str5;
                    i4 = i26;
                    jSONObject = jSONObject4;
                    str2 = str11;
                    long j11 = j4;
                    i5 = i27;
                    j = j11;
                    j3 = C22470.f72774;
                    if (j != j3) {
                        i14 = i30;
                        jSONObject3 = jSONObject;
                        m6981 = (C2105.m6981("ۚܶ") + i23) * 43;
                        i15 = ((m6981 ^ i22) * (-8851)) ^ 632917972;
                        i16 = 1395182050;
                        short[] sArr72222 = sArr;
                        i25 = m6981 ^ i16;
                        i24 = i15;
                        i26 = i4;
                        str5 = str2;
                        jSONObject4 = jSONObject3;
                        i30 = i14;
                        i17 = i3;
                        str7 = str;
                        sArr6 = sArr72222;
                        long j62222 = j;
                        i32 = i17;
                        i27 = i5;
                        j4 = j62222;
                    } else {
                        m69812 = C2105.m6981("֨ۛ") ^ i22;
                        i18 = ((m69812 ^ i23) * 29891) ^ 575834766;
                        i19 = -640138863;
                        short[] sArr92 = sArr;
                        i25 = m69812 ^ i19;
                        i24 = i18;
                        String str102 = str2;
                        jSONObject4 = jSONObject;
                        i26 = i4;
                        str5 = str102;
                        i12 = i3;
                        str7 = str;
                        sArr6 = sArr92;
                        long j102 = j;
                        i32 = i12;
                        i27 = i5;
                        j4 = j102;
                    }
                case -1107868699:
                case 1853176309:
                    str6 = C7106.m19110(f69734, 24, 1, i29);
                    if (C2520.f8000 < 0) {
                        m69813 = (C2105.m6981("᩸۬") + i23) * (-31);
                        i20 = ((m69813 ^ i22) * (-26199)) ^ (-379289127);
                        i21 = 575141625;
                        i25 = m69813 ^ i21;
                        i24 = i20;
                    }
                    m69813 = C2105.m6981("ᩴ᩵") ^ i22;
                    i20 = ((m69813 ^ i23) * (-31067)) ^ 26711944;
                    i21 = 574139296;
                    i25 = m69813 ^ i21;
                    i24 = i20;
                case -802385800:
                case 398505026:
                    sArr = sArr6;
                    payReq.partnerId = C0050.m948(sArr3, i28, 10, i29);
                    sArr4 = f69734;
                    i27 = 21;
                    if (C0237.f1507 == 0) {
                        m2566 = (C2105.m6981("֨ᩴ") + i22) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i = ((m2566 ^ i23) * 11589) ^ 1738673836;
                        i2 = 1927654692;
                        short[] sArr82222 = sArr;
                        i25 = m2566 ^ i2;
                        i24 = i;
                        sArr6 = sArr82222;
                    }
                    m2566 = (C2105.m6981("۠ۚ") ^ i23) * (-75);
                    i = ((m2566 ^ i22) * (-29723)) ^ (-1627859744);
                    i2 = 785077075;
                    short[] sArr822222 = sArr;
                    i25 = m2566 ^ i2;
                    i24 = i;
                    sArr6 = sArr822222;
                case -782438294:
                case 1808893609:
                    sArr = sArr6;
                    String str12 = str5;
                    i4 = i26;
                    jSONObject = jSONObject4;
                    String m49332 = C21923.m49332(jSONObject, C3432.m10488(f69734, 1, 7, i29));
                    if (C3663.f11553) {
                        str2 = str12;
                        str = str7;
                        i3 = i32;
                        long j12 = j4;
                        i5 = i27;
                        j = j12;
                        m69812 = C2105.m6981("ۢۤ") ^ i23;
                        i18 = ((m69812 ^ i22) * (-20761)) ^ (-1312205287);
                        i19 = -1870709656;
                        short[] sArr922 = sArr;
                        i25 = m69812 ^ i19;
                        i24 = i18;
                        String str1022 = str2;
                        jSONObject4 = jSONObject;
                        i26 = i4;
                        str5 = str1022;
                        i12 = i3;
                        str7 = str;
                        sArr6 = sArr922;
                        long j1022 = j;
                        i32 = i12;
                        i27 = i5;
                        j4 = j1022;
                    } else {
                        str2 = str12;
                        str = str7;
                        i3 = i32;
                        long j13 = j4;
                        i5 = i27;
                        j = j13;
                        C22470.f72773 = new Runnable() { // from class: l.ܶᩴۡ

                            /* renamed from: ۠۫᩷, reason: not valid java name and contains not printable characters */
                            private static final short[] f47206 = {3490, -26406, -26425, -26415, -26416, -26425, -26372, -26415, -26414, -26416, -26431, -26394, -26431, -26425, -26404, -26405, -26414, -26467, -26469, -26469, -26469, -26468};

                            {
                                int i35 = -364200525;
                                int i36 = C3432.f10845;
                                int i37 = C0630.f2410;
                                int m69816 = C2105.m6981("ۡ᩻") ^ i37;
                                int i38 = ((m69816 ^ i36) * (-29625)) ^ (-890088645);
                                int i39 = 1326046096;
                                while (true) {
                                    i35 = ((((i35 ^ i36) * (-1475)) >> 31) & i38) ^ (m69816 ^ i39);
                                    switch (i35) {
                                        case -2142131953:
                                        case 1670286463:
                                            return;
                                        case -2069201371:
                                        case 964228704:
                                            C0483.m2121();
                                            m69816 = (C2105.m6981("᩻ܰ") + i36) * (-79);
                                            i38 = ((m69816 ^ i37) * (-3309)) ^ 885111807;
                                            i39 = -952332348;
                                        case -1708990083:
                                        case -1496215777:
                                            if (C0382.f1805) {
                                                m69816 = (i36 - C0630.m2566("᩷ۖ")) * (-97);
                                                i38 = ((m69816 ^ i37) * (-23069)) ^ 2001113403;
                                                i39 = -1281412855;
                                            } else {
                                                m69816 = (i37 - C2105.m6981("ᩴۚ")) * 55;
                                                i38 = ((m69816 ^ i36) * (-29343)) ^ 1582522061;
                                                i39 = -278907;
                                            }
                                        case -1477152486:
                                        case -1063972877:
                                            if (C0050.f910 >= 0) {
                                                m69816 = (C2105.m6981("ۨۤ") ^ i37) * (-37);
                                                i38 = ((m69816 ^ i36) * 6305) ^ 771516089;
                                                i39 = 196881773;
                                            } else {
                                                m69816 = C0630.m2566("ܳ᩷") ^ i36;
                                                i38 = ((m69816 ^ i37) * 21783) ^ (-48081987);
                                                i39 = -1494463670;
                                            }
                                        case -894639300:
                                        case -281760909:
                                            C7811.m20844();
                                            if (C11340.f33930 < 0) {
                                                m69816 = C0630.m2566("ܳۤ") ^ i37;
                                                i38 = ((m69816 ^ i36) * 31277) ^ 1434130824;
                                                i39 = 959476730;
                                            } else {
                                                m69816 = (i36 - C0630.m2566("ܽ᩶")) * (-117);
                                                i38 = ((m69816 ^ i37) * (-19651)) ^ 283888722;
                                                i39 = 2118172677;
                                            }
                                        case -752086524:
                                        case 1520099918:
                                            if (C4075.f12947 >= 0) {
                                                m69816 = C0630.m2566("ܳۤ") ^ i37;
                                                i38 = ((m69816 ^ i36) * 31277) ^ 1434130824;
                                                i39 = 959476730;
                                            } else {
                                                m69816 = C2105.m6981("ܰ۬") ^ i36;
                                                i38 = ((m69816 ^ i37) * (-32323)) ^ 14173411;
                                                i39 = 316723086;
                                            }
                                        case -628827159:
                                        case 979638759:
                                            ServiceConnectionC3453.m10564();
                                            C4159.m12565();
                                            throw new RuntimeException();
                                        case -596947645:
                                        case 1464787845:
                                            if (RunnableC0588.f2309 >= 0) {
                                                m69816 = (i36 - C0630.m2566("ܽ᩶")) * (-117);
                                                i38 = ((m69816 ^ i37) * (-19651)) ^ 283888722;
                                                i39 = 2118172677;
                                            } else {
                                                m69816 = C2105.m6981("۟ۢ") ^ i37;
                                                i38 = ((m69816 ^ i36) * (-11955)) ^ (-2100403784);
                                                i39 = 943507351;
                                            }
                                        case -78793379:
                                        case 335079878:
                                            if (C0714.f2697 >= 0) {
                                                m69816 = (C2105.m6981("ۨۤ") ^ i37) * (-37);
                                                i38 = ((m69816 ^ i36) * 6305) ^ 771516089;
                                                i39 = 196881773;
                                            } else {
                                                m69816 = (C2105.m6981("᩸֡") + i37) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                i38 = ((m69816 ^ i36) * 10461) ^ 1101449481;
                                                i39 = 1763506282;
                                            }
                                        case 62404835:
                                        case 1653404466:
                                            if (AbstractC2021.f6743 <= 0) {
                                                m69816 = (i36 - C0630.m2566("ܽ᩶")) * (-117);
                                                i38 = ((m69816 ^ i37) * (-19651)) ^ 283888722;
                                                i39 = 2118172677;
                                            } else {
                                                m69816 = C0630.m2566("ۨۚ") ^ i37;
                                                i38 = ((m69816 ^ i36) * 6727) ^ 1085814750;
                                                i39 = 2129777046;
                                            }
                                        case 364501868:
                                        case 598929307:
                                            if (C1711.f5919) {
                                                m69816 = (C2105.m6981("ۨۤ") ^ i37) * (-37);
                                                i38 = ((m69816 ^ i36) * 6305) ^ 771516089;
                                                i39 = 196881773;
                                            } else {
                                                m69816 = (i36 - C0630.m2566("֫ۤ")) * (-63);
                                                i38 = ((m69816 ^ i37) * 25675) ^ 1173725157;
                                                i39 = 660890442;
                                            }
                                        case 608297506:
                                        case 1304497848:
                                            if (C3911.f12484 >= 0) {
                                                m69816 = C0630.m2566("ܳۤ") ^ i37;
                                                i38 = ((m69816 ^ i36) * 31277) ^ 1434130824;
                                                i39 = 959476730;
                                            } else {
                                                m69816 = (i36 - C0630.m2566("ۚ۟")) * (-113);
                                                i38 = ((m69816 ^ i37) * (-12371)) ^ (-1400191091);
                                                i39 = -1263205422;
                                            }
                                        case 737961407:
                                        case 1301975239:
                                            if (C1420.f5096 <= 0) {
                                                m69816 = C0630.m2566("ܳۤ") ^ i37;
                                                i38 = ((m69816 ^ i36) * 31277) ^ 1434130824;
                                                i39 = 959476730;
                                            } else {
                                                m69816 = (i37 - C0630.m2566("ۗ᩹")) * (-59);
                                                i38 = ((m69816 ^ i36) * 12081) ^ 944528758;
                                                i39 = 1140142234;
                                            }
                                        case 1033639013:
                                        case 1080310752:
                                            if (C0714.m2805()) {
                                                m69816 = C0630.m2566("ܳۤ") ^ i37;
                                                i38 = ((m69816 ^ i36) * 31277) ^ 1434130824;
                                                i39 = 959476730;
                                            } else {
                                                m69816 = (C2105.m6981("᩻ܰ") + i36) * (-79);
                                                i38 = ((m69816 ^ i37) * (-3309)) ^ 885111807;
                                                i39 = -952332348;
                                            }
                                        case 1506305398:
                                        case 1669364397:
                                            C3019.m9255();
                                            if (RunnableC1108.f4040) {
                                                m69816 = (i37 - C2105.m6981("ᩴۚ")) * 55;
                                                i38 = ((m69816 ^ i36) * (-29343)) ^ 1582522061;
                                                i39 = -278907;
                                            } else {
                                                m69816 = (C2105.m6981("᩻ܰ") + i36) * (-79);
                                                i38 = ((m69816 ^ i37) * (-3309)) ^ 885111807;
                                                i39 = -952332348;
                                            }
                                        default:
                                            if (C3432.f10845 >= 0) {
                                                m69816 = (C2105.m6981("᩻ܰ") + i36) * (-79);
                                                i38 = ((m69816 ^ i37) * (-3309)) ^ 885111807;
                                                i39 = -952332348;
                                            } else {
                                                m69816 = C2105.m6981("ܺ֫") ^ i37;
                                                i38 = ((m69816 ^ i36) * 22557) ^ (-945349829);
                                                i39 = 388667952;
                                            }
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                short[] sArr10;
                                short s3;
                                short[] sArr11;
                                int m25663;
                                int i35;
                                int i36;
                                short[] sArr12;
                                short s4;
                                int m25664;
                                int i37;
                                int i38;
                                int i39;
                                int i40;
                                int i41;
                                int m25665;
                                int i42;
                                int i43;
                                RunnableC15413 runnableC15413 = this;
                                int i44 = C22628.f73083;
                                int i45 = C4263.f13799;
                                int m69816 = C2105.m6981("᩹᩷") ^ i45;
                                int i46 = ((m69816 ^ i44) * (-22025)) ^ (-707776149);
                                short[] sArr13 = null;
                                short[] sArr14 = null;
                                short[] sArr15 = null;
                                int i47 = m69816 ^ (-1100940142);
                                int i48 = 0;
                                int i49 = 0;
                                int i50 = 0;
                                int i51 = 0;
                                int i52 = 0;
                                int i53 = 0;
                                int i54 = 0;
                                int i55 = 0;
                                char c = 0;
                                short s5 = 0;
                                int i56 = -72011394;
                                int i57 = 0;
                                String str13 = null;
                                JSONObject jSONObject7 = null;
                                String str14 = null;
                                while (true) {
                                    i56 = i47 ^ (i46 & (((i56 ^ i44) * (-8027)) >> 31));
                                    switch (i56) {
                                        case -2046976986:
                                        case 1952710957:
                                            sArr11 = sArr15;
                                            int i58 = i51 + i52;
                                            if ((i58 + i58) - i50 < 0) {
                                                m25663 = (C0630.m2566("ۘܰ") + i45) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i35 = ((m25663 ^ i44) * 4183) ^ 1851251077;
                                                i36 = -1622828052;
                                            } else {
                                                m25663 = (C0630.m2566("ܿۜ") + i44) * (-115);
                                                i35 = ((m25663 ^ i45) * (-6613)) ^ (-972145241);
                                                i36 = -523883176;
                                            }
                                            sArr12 = sArr11;
                                            i47 = m25663 ^ i36;
                                            i46 = i35;
                                            sArr15 = sArr12;
                                        case -1975543132:
                                        case -130637492:
                                            sArr11 = sArr15;
                                            s4 = s5;
                                            sArr13 = f47206;
                                            c = 0;
                                            if (C2958.f9394 < 0) {
                                                m25664 = C0630.m2566("֨᩸") ^ i45;
                                                i37 = ((m25664 ^ i44) * (-24717)) ^ 907113526;
                                                i38 = 997224387;
                                                i41 = m25664 ^ i38;
                                                s5 = s4;
                                                i46 = i37;
                                                sArr15 = sArr11;
                                                i47 = i41;
                                                runnableC15413 = this;
                                            }
                                            m25664 = (C2105.m6981("᩶ܿ") + i44) * (-57);
                                            i37 = ((m25664 ^ i45) * 23183) ^ 1325180683;
                                            i38 = -2113322712;
                                            i41 = m25664 ^ i38;
                                            s5 = s4;
                                            i46 = i37;
                                            sArr15 = sArr11;
                                            i47 = i41;
                                            runnableC15413 = this;
                                        case -1952960730:
                                        case -1792833053:
                                            sArr10 = sArr15;
                                            s3 = s5;
                                            int i59 = s3 + 426;
                                            if (C0483.f2088 >= 0) {
                                                i57 = i59;
                                                int m69817 = (C2105.m6981("ۘܶ") + i45) * (-105);
                                                s5 = s3;
                                                i46 = ((m69817 ^ i44) * (-19751)) ^ 2009293159;
                                                sArr12 = sArr10;
                                                i47 = m69817 ^ 855493031;
                                                sArr15 = sArr12;
                                            } else {
                                                int m69818 = (i44 - C2105.m6981("֡ۤ")) * 41;
                                                s5 = s3;
                                                i57 = i59;
                                                sArr15 = sArr10;
                                                i46 = ((m69818 ^ i45) * (-27879)) ^ 1997121688;
                                                i47 = m69818 ^ (-512113843);
                                                runnableC15413 = this;
                                            }
                                        case -1621989521:
                                        case 370359735:
                                            C4159.m12575(str13, C2126.m7036(sArr15, i48, i49, i53));
                                            if (C21923.f70183 != 0) {
                                                m25665 = (C2105.m6981("ۢ᩹") + i45) * (-73);
                                                i42 = ((m25665 ^ i44) * (-30335)) ^ 508161118;
                                                i43 = 1767731160;
                                                i47 = m25665 ^ i43;
                                                i46 = i42;
                                            } else {
                                                sArr11 = sArr15;
                                                String str15 = str;
                                                if (C0483.f2088 < 0) {
                                                    C1005.m3499(new Thread(new RunnableC0597(str15, str13, j)));
                                                    break;
                                                }
                                                s4 = s5;
                                                m25664 = (C2105.m6981("᩶ܿ") + i44) * (-57);
                                                i37 = ((m25664 ^ i45) * 23183) ^ 1325180683;
                                                i38 = -2113322712;
                                                i41 = m25664 ^ i38;
                                                s5 = s4;
                                                i46 = i37;
                                                sArr15 = sArr11;
                                                i47 = i41;
                                                runnableC15413 = this;
                                            }
                                        case -1550883994:
                                        case 395926098:
                                            sArr11 = sArr15;
                                            str14 = RunnableC1108.m3789(sArr14, i54, i55, i53);
                                            jSONObject7 = jSONObject;
                                            if (C22628.f73083 <= 0) {
                                                sArr15 = sArr11;
                                                m25665 = (i44 - C0630.m2566("֨۠")) * 115;
                                                i42 = ((m25665 ^ i45) * (-13243)) ^ (-673288118);
                                                i43 = -1575480962;
                                                i47 = m25665 ^ i43;
                                                i46 = i42;
                                            } else {
                                                m25663 = (i45 - C0630.m2566("֫֨")) * 37;
                                                i35 = ((m25663 ^ i44) * (-20811)) ^ 1769616900;
                                                i36 = -786386632;
                                                sArr12 = sArr11;
                                                i47 = m25663 ^ i36;
                                                i46 = i35;
                                                sArr15 = sArr12;
                                            }
                                        case -1222316883:
                                        case 1789984587:
                                            C4075.m12263();
                                            if (C1005.f3721) {
                                                sArr11 = sArr15;
                                                s4 = s5;
                                                m25664 = (C2105.m6981("᩶ܿ") + i44) * (-57);
                                                i37 = ((m25664 ^ i45) * 23183) ^ 1325180683;
                                                i38 = -2113322712;
                                                i41 = m25664 ^ i38;
                                                s5 = s4;
                                                i46 = i37;
                                                sArr15 = sArr11;
                                                i47 = i41;
                                                runnableC15413 = this;
                                            } else {
                                                m25665 = (C2105.m6981("ۢ᩹") + i45) * (-73);
                                                i42 = ((m25665 ^ i44) * (-30335)) ^ 508161118;
                                                i43 = 1767731160;
                                                i47 = m25665 ^ i43;
                                                i46 = i42;
                                            }
                                        case -1200051285:
                                        case 1231280974:
                                            sArr11 = sArr15;
                                            C5242 c5242 = C22470.f72770;
                                            sArr14 = f47206;
                                            i54 = 1;
                                            if (C3683.f11629 >= 0) {
                                                i40 = (i45 - C0630.m2566("ᩳ۟")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i46 = ((i40 ^ i44) * (-9867)) ^ 436463202;
                                                i39 = -1866645663;
                                                i41 = i40 ^ i39;
                                                sArr15 = sArr11;
                                                i47 = i41;
                                                runnableC15413 = this;
                                            } else {
                                                m25663 = (i45 - C0630.m2566("ܿ᩹")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                i35 = ((m25663 ^ i44) * 797) ^ (-1602173735);
                                                i36 = -1170168191;
                                                sArr12 = sArr11;
                                                i47 = m25663 ^ i36;
                                                i46 = i35;
                                                sArr15 = sArr12;
                                            }
                                        case -680514041:
                                        case 164126355:
                                            sArr11 = sArr15;
                                            i55 = 7;
                                            if (C3683.f11629 >= 0) {
                                                sArr15 = sArr11;
                                                m25665 = (i44 - C0630.m2566("֨۠")) * 115;
                                                i42 = ((m25665 ^ i45) * (-13243)) ^ (-673288118);
                                                i43 = -1575480962;
                                                i47 = m25665 ^ i43;
                                                i46 = i42;
                                            } else {
                                                m25663 = (C2105.m6981("ܽ۫") ^ i44) * q.h;
                                                i35 = ((m25663 ^ i45) * 32535) ^ (-985176205);
                                                i36 = -204844513;
                                                sArr12 = sArr11;
                                                i47 = m25663 ^ i36;
                                                i46 = i35;
                                                sArr15 = sArr12;
                                            }
                                        case 254578491:
                                        case 708433964:
                                            sArr11 = sArr15;
                                            s5 = sArr13[c];
                                            if (C7106.m19120() > 0) {
                                                i40 = (C2105.m6981("ۗ֨") ^ i44) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                                i46 = ((i40 ^ i45) * (-7387)) ^ (-894872313);
                                                i39 = 1108196372;
                                                i41 = i40 ^ i39;
                                                sArr15 = sArr11;
                                                i47 = i41;
                                                runnableC15413 = this;
                                            }
                                            i40 = (i45 - C0630.m2566("ᩳ۟")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i46 = ((i40 ^ i44) * (-9867)) ^ 436463202;
                                            i39 = -1866645663;
                                            i41 = i40 ^ i39;
                                            sArr15 = sArr11;
                                            i47 = i41;
                                            runnableC15413 = this;
                                        case 359703859:
                                        case 2108847324:
                                            C3432.m10477();
                                            C0422.m1963();
                                            m25665 = (C2105.m6981("ۢ᩹") + i45) * (-73);
                                            i42 = ((m25665 ^ i44) * (-30335)) ^ 508161118;
                                            i43 = 1767731160;
                                            i47 = m25665 ^ i43;
                                            i46 = i42;
                                        case 548584300:
                                        case 1641699660:
                                            sArr11 = sArr15;
                                            i53 = 19317;
                                            m25663 = C2105.m6981("ܿܶ") ^ i44;
                                            i35 = ((m25663 ^ i45) * (-3951)) ^ (-268048583);
                                            i36 = 2088778362;
                                            sArr12 = sArr11;
                                            i47 = m25663 ^ i36;
                                            i46 = i35;
                                            sArr15 = sArr12;
                                        case 710789048:
                                        case 1844996231:
                                            sArr11 = sArr15;
                                            i53 = 39093;
                                            m25663 = C2105.m6981("ܿܶ") ^ i44;
                                            i35 = ((m25663 ^ i45) * (-3951)) ^ (-268048583);
                                            i36 = 2088778362;
                                            sArr12 = sArr11;
                                            i47 = m25663 ^ i36;
                                            i46 = i35;
                                            sArr15 = sArr12;
                                        case 783652381:
                                        case 1044413140:
                                            if (C4117.f13076 > 0) {
                                                sArr11 = sArr15;
                                                s4 = s5;
                                                m25664 = (C2105.m6981("᩶ܿ") + i44) * (-57);
                                                i37 = ((m25664 ^ i45) * 23183) ^ 1325180683;
                                                i38 = -2113322712;
                                                i41 = m25664 ^ i38;
                                                s5 = s4;
                                                i46 = i37;
                                                sArr15 = sArr11;
                                                i47 = i41;
                                                runnableC15413 = this;
                                            } else {
                                                sArr10 = sArr15;
                                                s3 = s5;
                                                int m698172 = (C2105.m6981("ۘܶ") + i45) * (-105);
                                                s5 = s3;
                                                i46 = ((m698172 ^ i44) * (-19751)) ^ 2009293159;
                                                sArr12 = sArr10;
                                                i47 = m698172 ^ 855493031;
                                                sArr15 = sArr12;
                                            }
                                        case 1075252591:
                                        case 1341612591:
                                            str13 = C21923.m49332(jSONObject7, str14);
                                            sArr15 = f47206;
                                            i48 = 8;
                                            i49 = 14;
                                            if (!C2126.f7087) {
                                                m25665 = C0630.m2566("ۚ۟") ^ i44;
                                                i42 = ((m25665 ^ i45) * (-3999)) ^ 590582550;
                                                i43 = -1431192887;
                                                i47 = m25665 ^ i43;
                                                i46 = i42;
                                            }
                                            m25665 = (i44 - C0630.m2566("֨۠")) * 115;
                                            i42 = ((m25665 ^ i45) * (-13243)) ^ (-673288118);
                                            i43 = -1575480962;
                                            i47 = m25665 ^ i43;
                                            i46 = i42;
                                        case 1078382285:
                                        case 1465674301:
                                            sArr11 = sArr15;
                                            i50 = i57 * i57;
                                            i51 = s5 * s5;
                                            i52 = 181476;
                                            if (C3432.f10845 >= 0) {
                                                s4 = s5;
                                                m25664 = (C2105.m6981("᩶ܿ") + i44) * (-57);
                                                i37 = ((m25664 ^ i45) * 23183) ^ 1325180683;
                                                i38 = -2113322712;
                                                i41 = m25664 ^ i38;
                                                s5 = s4;
                                                i46 = i37;
                                                sArr15 = sArr11;
                                                i47 = i41;
                                                runnableC15413 = this;
                                            } else {
                                                m25663 = C0630.m2566("ܶۖ") ^ i45;
                                                i35 = ((m25663 ^ i44) * 1329) ^ (-449024592);
                                                i36 = 1077464677;
                                                sArr12 = sArr11;
                                                i47 = m25663 ^ i36;
                                                i46 = i35;
                                                sArr15 = sArr12;
                                            }
                                        case 1906898021:
                                        case 2016325777:
                                            C0483.m2121();
                                            break;
                                        default:
                                            ViewOnClickListenerC1958.m6429();
                                            if (C0237.f1507 == 0) {
                                                sArr10 = sArr15;
                                                s3 = s5;
                                                int m6981722 = (C2105.m6981("ۘܶ") + i45) * (-105);
                                                s5 = s3;
                                                i46 = ((m6981722 ^ i44) * (-19751)) ^ 2009293159;
                                                sArr12 = sArr10;
                                                i47 = m6981722 ^ 855493031;
                                                sArr15 = sArr12;
                                            } else {
                                                sArr11 = sArr15;
                                                i40 = (i45 - C0630.m2566("ᩳ۟")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i46 = ((i40 ^ i44) * (-9867)) ^ 436463202;
                                                i39 = -1866645663;
                                                i41 = i40 ^ i39;
                                                sArr15 = sArr11;
                                                i47 = i41;
                                                runnableC15413 = this;
                                            }
                                    }
                                    return;
                                }
                            }
                        };
                        jSONObject5 = new JSONObject(m49332);
                        if (C0483.f2088 < 0) {
                            m69812 = (C2105.m6981("ۖܳ") ^ i23) * 23;
                            i18 = ((m69812 ^ i22) * (-18565)) ^ 328514620;
                            i19 = -159811895;
                            short[] sArr9222 = sArr;
                            i25 = m69812 ^ i19;
                            i24 = i18;
                            String str10222 = str2;
                            jSONObject4 = jSONObject;
                            i26 = i4;
                            str5 = str10222;
                            i12 = i3;
                            str7 = str;
                            sArr6 = sArr9222;
                            long j10222 = j;
                            i32 = i12;
                            i27 = i5;
                            j4 = j10222;
                        }
                        m69812 = (i23 - C0630.m2566("ۛۗ")) * (-29);
                        i18 = ((m69812 ^ i22) * (-32117)) ^ (-299574636);
                        i19 = -562838875;
                        short[] sArr92222 = sArr;
                        i25 = m69812 ^ i19;
                        i24 = i18;
                        String str102222 = str2;
                        jSONObject4 = jSONObject;
                        i26 = i4;
                        str5 = str102222;
                        i12 = i3;
                        str7 = str;
                        sArr6 = sArr92222;
                        long j102222 = j;
                        i32 = i12;
                        i27 = i5;
                        j4 = j102222;
                    }
                case -697933354:
                case 1100845585:
                    sArr = sArr6;
                    str = str7;
                    i3 = i32;
                    String str13 = str5;
                    i4 = i26;
                    jSONObject = jSONObject4;
                    str2 = str13;
                    long j14 = j4;
                    i5 = i27;
                    j = j14;
                    C5242 c5242 = C22470.f72770;
                    C18237 m7511 = C2272.m7511(4370);
                    m7511.m42494(c21765.f69739);
                    i30 = 1;
                    if (C1294.f4556 >= 0) {
                        c18237 = m7511;
                        m69812 = C2105.m6981("ۢۤ") ^ i23;
                        i18 = ((m69812 ^ i22) * (-20761)) ^ (-1312205287);
                        i19 = -1870709656;
                        short[] sArr922222 = sArr;
                        i25 = m69812 ^ i19;
                        i24 = i18;
                        String str1022222 = str2;
                        jSONObject4 = jSONObject;
                        i26 = i4;
                        str5 = str1022222;
                        i12 = i3;
                        str7 = str;
                        sArr6 = sArr922222;
                        long j1022222 = j;
                        i32 = i12;
                        i27 = i5;
                        j4 = j1022222;
                    } else {
                        int m25663 = (C0630.m2566("ۙ᩹") ^ i22) * (-17);
                        c18237 = m7511;
                        i24 = ((m25663 ^ i23) * (-28673)) ^ 1289197923;
                        jSONObject4 = jSONObject;
                        i26 = i4;
                        str5 = str2;
                        i17 = i3;
                        str7 = str;
                        sArr6 = sArr;
                        i25 = m25663 ^ (-794210384);
                        long j622222 = j;
                        i32 = i17;
                        i27 = i5;
                        j4 = j622222;
                    }
                case -410479717:
                case 2022859624:
                    sArr = sArr6;
                    payReq.nonceStr = C21923.m49332(jSONObject5, C1773.m5917(sArr5, i26, 1, i29));
                    if (C1420.f5096 <= 0) {
                        str = str7;
                        i3 = i32;
                        String str14 = str5;
                        i4 = i26;
                        jSONObject = jSONObject4;
                        str2 = str14;
                        long j15 = j4;
                        i5 = i27;
                        j = j15;
                        m69812 = C2105.m6981("ۢۤ") ^ i23;
                        i18 = ((m69812 ^ i22) * (-20761)) ^ (-1312205287);
                        i19 = -1870709656;
                        short[] sArr9222222 = sArr;
                        i25 = m69812 ^ i19;
                        i24 = i18;
                        String str10222222 = str2;
                        jSONObject4 = jSONObject;
                        i26 = i4;
                        str5 = str10222222;
                        i12 = i3;
                        str7 = str;
                        sArr6 = sArr9222222;
                        long j10222222 = j;
                        i32 = i12;
                        i27 = i5;
                        j4 = j10222222;
                    } else {
                        m2566 = C0630.m2566("۟᩹") ^ i22;
                        i = ((m2566 ^ i23) * 27873) ^ 440977693;
                        i2 = -1496749581;
                        short[] sArr8222222 = sArr;
                        i25 = m2566 ^ i2;
                        i24 = i;
                        sArr6 = sArr8222222;
                    }
                case -344987122:
                case 1929096067:
                    sArr = sArr6;
                    i3 = i32;
                    i14 = i30;
                    jSONObject3 = jSONObject4;
                    str2 = str5;
                    i4 = i26;
                    long j16 = j4;
                    i5 = i27;
                    j = j16;
                    String m6567 = AbstractC2021.m6567();
                    String str15 = c21765.f69737;
                    if (C11233.m27802((Object) str15, (Object) m6567)) {
                        int m69816 = C2105.m6981("ۚ᩷") ^ i22;
                        i25 = m69816 ^ 1516221281;
                        i24 = ((m69816 ^ i23) * (-16359)) ^ 375066119;
                        sArr6 = sArr;
                        i17 = i3;
                        str7 = str15;
                        i26 = i4;
                        str5 = str2;
                        jSONObject4 = jSONObject3;
                        i30 = i14;
                        long j6222222 = j;
                        i32 = i17;
                        i27 = i5;
                        j4 = j6222222;
                    } else {
                        str = str15;
                        m6981 = (C2105.m6981("ۚܶ") + i23) * 43;
                        i15 = ((m6981 ^ i22) * (-8851)) ^ 632917972;
                        i16 = 1395182050;
                        short[] sArr722222 = sArr;
                        i25 = m6981 ^ i16;
                        i24 = i15;
                        i26 = i4;
                        str5 = str2;
                        jSONObject4 = jSONObject3;
                        i30 = i14;
                        i17 = i3;
                        str7 = str;
                        sArr6 = sArr722222;
                        long j62222222 = j;
                        i32 = i17;
                        i27 = i5;
                        j4 = j62222222;
                    }
                case -266476211:
                case -76116295:
                    C0237.m1481();
                    if (C3432.f10845 < 0) {
                        sArr = sArr6;
                        m2566 = (C2105.m6981("۠ۚ") ^ i23) * (-75);
                        i = ((m2566 ^ i22) * (-29723)) ^ (-1627859744);
                        i2 = 785077075;
                        short[] sArr82222222 = sArr;
                        i25 = m2566 ^ i2;
                        i24 = i;
                        sArr6 = sArr82222222;
                    } else {
                        sArr2 = sArr6;
                        i6 = i30;
                        str3 = str7;
                        jSONObject2 = jSONObject4;
                        str4 = str5;
                        i7 = i26;
                        i8 = i32;
                        long j17 = j4;
                        i5 = i27;
                        j = j17;
                        i10 = C2105.m6981("֫ۗ") ^ i22;
                        i24 = ((i10 ^ i23) * 9141) ^ 1522978249;
                        i9 = 1976048272;
                        i11 = i10 ^ i9;
                        i26 = i7;
                        str5 = str4;
                        jSONObject4 = jSONObject2;
                        i30 = i6;
                        int i35 = i11;
                        c21765 = this;
                        short[] sArr10 = sArr2;
                        i25 = i35;
                        i12 = i8;
                        str7 = str3;
                        sArr6 = sArr10;
                        long j102222222 = j;
                        i32 = i12;
                        i27 = i5;
                        j4 = j102222222;
                    }
                case -128104857:
                case 2110049606:
                    sArr = sArr6;
                    str5 = C21923.m49332(jSONObject5, C1294.m4373(f69734, 8, 1, i29));
                    m2566 = (C2105.m6981("᩻᩸") ^ i22) * 83;
                    i = ((m2566 ^ i23) * 30985) ^ 1423933958;
                    i2 = -1677208380;
                    short[] sArr822222222 = sArr;
                    i25 = m2566 ^ i2;
                    i24 = i;
                    sArr6 = sArr822222222;
                case -85792499:
                case 671115538:
                    sArr = sArr6;
                    payReq = new PayReq();
                    payReq.appId = C22470.m50420();
                    sArr3 = f69734;
                    i28 = 11;
                    if (C11340.f33930 >= 0) {
                        str = str7;
                        i3 = i32;
                        String str142 = str5;
                        i4 = i26;
                        jSONObject = jSONObject4;
                        str2 = str142;
                        long j152 = j4;
                        i5 = i27;
                        j = j152;
                        m69812 = C2105.m6981("ۢۤ") ^ i23;
                        i18 = ((m69812 ^ i22) * (-20761)) ^ (-1312205287);
                        i19 = -1870709656;
                        short[] sArr92222222 = sArr;
                        i25 = m69812 ^ i19;
                        i24 = i18;
                        String str102222222 = str2;
                        jSONObject4 = jSONObject;
                        i26 = i4;
                        str5 = str102222222;
                        i12 = i3;
                        str7 = str;
                        sArr6 = sArr92222222;
                        long j1022222222 = j;
                        i32 = i12;
                        i27 = i5;
                        j4 = j1022222222;
                    } else {
                        m2566 = (C0630.m2566("ᩴᩳ") ^ i23) * (-27);
                        i = ((m2566 ^ i22) * (-26591)) ^ (-360498523);
                        i2 = 1385458997;
                        short[] sArr8222222222 = sArr;
                        i25 = m2566 ^ i2;
                        i24 = i;
                        sArr6 = sArr8222222222;
                    }
                case 17346125:
                case 2102176724:
                    C22628.m50615();
                    sArr = sArr6;
                    m2566 = (C2105.m6981("۠ۚ") ^ i23) * (-75);
                    i = ((m2566 ^ i22) * (-29723)) ^ (-1627859744);
                    i2 = 785077075;
                    short[] sArr82222222222 = sArr;
                    i25 = m2566 ^ i2;
                    i24 = i;
                    sArr6 = sArr82222222222;
                case 24109811:
                case 941977429:
                    C22628.m50615();
                    break;
                case 421011934:
                case 670711986:
                    break;
                case 488864108:
                case 1185797634:
                    payReq.sign = C22628.m50614(jSONObject5, AbstractC2021.m6573(sArr6, i32, i33, i29));
                    c21765.f69740.sendReq(payReq);
                    sArr = sArr6;
                    i14 = i30;
                    str = str7;
                    jSONObject3 = jSONObject4;
                    str2 = str5;
                    i4 = i26;
                    i3 = i32;
                    long j18 = j4;
                    i5 = i27;
                    j = j18;
                    m6981 = (C2105.m6981("ۚܶ") + i23) * 43;
                    i15 = ((m6981 ^ i22) * (-8851)) ^ 632917972;
                    i16 = 1395182050;
                    short[] sArr7222222 = sArr;
                    i25 = m6981 ^ i16;
                    i24 = i15;
                    i26 = i4;
                    str5 = str2;
                    jSONObject4 = jSONObject3;
                    i30 = i14;
                    i17 = i3;
                    str7 = str;
                    sArr6 = sArr7222222;
                    long j622222222 = j;
                    i32 = i17;
                    i27 = i5;
                    j4 = j622222222;
                case 887127089:
                case 1245309160:
                    payReq.packageValue = C22628.m50614(jSONObject5, str6);
                    sArr6 = f69734;
                    i32 = 25;
                    i33 = 1;
                    m69813 = (C2105.m6981("ۨܽ") ^ i22) * 85;
                    i20 = ((m69813 ^ i23) * (-31111)) ^ 984501283;
                    i21 = -918556851;
                    i25 = m69813 ^ i21;
                    i24 = i20;
                case 1463654094:
                case 1839363183:
                    sArr = sArr6;
                    i14 = i30;
                    str = str7;
                    jSONObject3 = jSONObject4;
                    str2 = str5;
                    i4 = i26;
                    i3 = i32;
                    long j19 = j4;
                    i5 = i27;
                    j = j19;
                    i29 = 30585;
                    m6981 = C2105.m6981("ᩴۧ") ^ i23;
                    i15 = ((m6981 ^ i22) * 22497) ^ (-493408766);
                    i16 = -111388380;
                    short[] sArr72222222 = sArr;
                    i25 = m6981 ^ i16;
                    i24 = i15;
                    i26 = i4;
                    str5 = str2;
                    jSONObject4 = jSONObject3;
                    i30 = i14;
                    i17 = i3;
                    str7 = str;
                    sArr6 = sArr72222222;
                    long j6222222222 = j;
                    i32 = i17;
                    i27 = i5;
                    j4 = j6222222222;
                case 1517428865:
                case 1830230304:
                    sArr2 = sArr6;
                    i6 = i30;
                    str3 = str7;
                    jSONObject2 = jSONObject4;
                    str4 = str5;
                    i7 = i26;
                    i8 = i32;
                    long j20 = j4;
                    i5 = i27;
                    j = j20;
                    int i36 = s + s2;
                    short s3 = s;
                    if ((s3 * 16908) - (i36 * i36) > 0) {
                        m25662 = C0630.m2566("ۡۖ") ^ i22;
                        i24 = ((m25662 ^ i23) * (-5061)) ^ (-1621087707);
                        i13 = -1396707465;
                    } else {
                        m25662 = C0630.m2566("ܿۚ") ^ i22;
                        i24 = ((m25662 ^ i23) * (-2209)) ^ (-1109332968);
                        i13 = 1697027292;
                    }
                    i11 = m25662 ^ i13;
                    s = s3;
                    i26 = i7;
                    str5 = str4;
                    jSONObject4 = jSONObject2;
                    i30 = i6;
                    int i352 = i11;
                    c21765 = this;
                    short[] sArr102 = sArr2;
                    i25 = i352;
                    i12 = i8;
                    str7 = str3;
                    sArr6 = sArr102;
                    long j10222222222 = j;
                    i32 = i12;
                    i27 = i5;
                    j4 = j10222222222;
                case 1608211595:
                case 1770249598:
                    sArr = sArr6;
                    String str16 = str5;
                    if (C1294.m4369(C0798.m3005(f69734, 9, 2, i29), str16)) {
                        int m69817 = C2105.m6981("۠ܳ") ^ i22;
                        i20 = ((m69817 ^ i23) * (-26737)) ^ (-1003902530);
                        str5 = str16;
                        sArr6 = sArr;
                        i25 = m69817 ^ (-228183402);
                        i24 = i20;
                    } else {
                        i4 = i26;
                        i14 = i30;
                        jSONObject3 = jSONObject4;
                        str2 = str16;
                        str = str7;
                        i3 = i32;
                        long j182 = j4;
                        i5 = i27;
                        j = j182;
                        m6981 = (C2105.m6981("ۚܶ") + i23) * 43;
                        i15 = ((m6981 ^ i22) * (-8851)) ^ 632917972;
                        i16 = 1395182050;
                        short[] sArr722222222 = sArr;
                        i25 = m6981 ^ i16;
                        i24 = i15;
                        i26 = i4;
                        str5 = str2;
                        jSONObject4 = jSONObject3;
                        i30 = i14;
                        i17 = i3;
                        str7 = str;
                        sArr6 = sArr722222222;
                        long j62222222222 = j;
                        i32 = i17;
                        i27 = i5;
                        j4 = j62222222222;
                    }
                case 1665170162:
                case 2112961269:
                    sArr2 = sArr6;
                    i6 = i30;
                    str3 = str7;
                    jSONObject2 = jSONObject4;
                    str4 = str5;
                    i7 = i26;
                    i8 = i32;
                    long j21 = j4;
                    i5 = i27;
                    j = j21;
                    s = f69734[0];
                    s2 = 4227;
                    if (RunnableC1937.f6483 < 0) {
                        i10 = (C0630.m2566("ۧܶ") ^ i23) * (-23);
                        i24 = ((i10 ^ i22) * 28991) ^ 334150180;
                        i9 = 774910322;
                        i11 = i10 ^ i9;
                        i26 = i7;
                        str5 = str4;
                        jSONObject4 = jSONObject2;
                        i30 = i6;
                        int i3522 = i11;
                        c21765 = this;
                        short[] sArr1022 = sArr2;
                        i25 = i3522;
                        i12 = i8;
                        str7 = str3;
                        sArr6 = sArr1022;
                        long j102222222222 = j;
                        i32 = i12;
                        i27 = i5;
                        j4 = j102222222222;
                    }
                    i10 = C2105.m6981("֫ۗ") ^ i22;
                    i24 = ((i10 ^ i23) * 9141) ^ 1522978249;
                    i9 = 1976048272;
                    i11 = i10 ^ i9;
                    i26 = i7;
                    str5 = str4;
                    jSONObject4 = jSONObject2;
                    i30 = i6;
                    int i35222 = i11;
                    c21765 = this;
                    short[] sArr10222 = sArr2;
                    i25 = i35222;
                    i12 = i8;
                    str7 = str3;
                    sArr6 = sArr10222;
                    long j1022222222222 = j;
                    i32 = i12;
                    i27 = i5;
                    j4 = j1022222222222;
                default:
                    sArr = sArr6;
                    payReq.timeStamp = C22628.m50614(jSONObject5, C3432.m10488(f69734, 23, 1, i29));
                    if (C0714.f2697 >= 0) {
                        str = str7;
                        i3 = i32;
                        String str92 = str5;
                        i4 = i26;
                        jSONObject = jSONObject4;
                        str2 = str92;
                        long j92 = j4;
                        i5 = i27;
                        j = j92;
                        m69812 = (i23 - C0630.m2566("ۛۗ")) * (-29);
                        i18 = ((m69812 ^ i22) * (-32117)) ^ (-299574636);
                        i19 = -562838875;
                        short[] sArr922222222 = sArr;
                        i25 = m69812 ^ i19;
                        i24 = i18;
                        String str1022222222 = str2;
                        jSONObject4 = jSONObject;
                        i26 = i4;
                        str5 = str1022222222;
                        i12 = i3;
                        str7 = str;
                        sArr6 = sArr922222222;
                        long j10222222222222 = j;
                        i32 = i12;
                        i27 = i5;
                        j4 = j10222222222222;
                    } else {
                        m2566 = C0630.m2566("ۗܰ") ^ i23;
                        i = ((m2566 ^ i22) * 27673) ^ (-2057971187);
                        i2 = -439276904;
                        short[] sArr822222222222 = sArr;
                        i25 = m2566 ^ i2;
                        i24 = i;
                        sArr6 = sArr822222222222;
                    }
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C3911.m11927(this);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC3346 abstractActivityC3346 = null;
        int i = -1247916560;
        int i2 = C2520.f8000;
        int i3 = C1773.f6144;
        int m6981 = (C2105.m6981("۫ۨ") + i2) * 17;
        int i4 = ((m6981 ^ i3) * 20359) ^ (-1553144602);
        int i5 = 2136798701;
        while (true) {
            i = ((((i ^ i3) * 22823) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1972773051:
                case 307053889:
                    if (C4117.m12364() != 0) {
                        m6981 = (C2105.m6981("ᩳۧ") + i3) * (-91);
                        i4 = ((m6981 ^ i2) * 21559) ^ 925164782;
                        i5 = 1808295476;
                    } else {
                        m6981 = C0630.m2566("ܳᩳ") ^ i2;
                        i4 = ((m6981 ^ i3) * 14125) ^ (-1978549939);
                        i5 = -74481756;
                    }
                case -1885763257:
                case 1881886288:
                    if (C4117.f13076 <= 0) {
                        m6981 = (C2105.m6981("᩶ۧ") + i2) * (-79);
                        i4 = ((m6981 ^ i3) * 26039) ^ 1848057868;
                        i5 = 260625053;
                    } else {
                        m6981 = (i3 - C0630.m2566("᩷᩻")) * 81;
                        i4 = ((m6981 ^ i2) * 9239) ^ 2026858339;
                        i5 = 361132013;
                    }
                case -1320648009:
                case -518994559:
                    if (C2520.f8000 >= 0) {
                        m6981 = (C2105.m6981("ᩳۧ") + i3) * (-91);
                        i4 = ((m6981 ^ i2) * 21559) ^ 925164782;
                        i5 = 1808295476;
                    } else {
                        m6981 = C2105.m6981("ۤۨ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-19329)) ^ 229159139;
                        i5 = -2009956133;
                    }
                case -1265427907:
                case 346904395:
                    if (C1047.f3863 >= 0) {
                        m6981 = (C2105.m6981("᩸ܰ") + i3) * (-29);
                        i4 = ((m6981 ^ i2) * 17315) ^ 489140442;
                        i5 = -1595732739;
                    } else {
                        m6981 = C2105.m6981("۬۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-30665)) ^ 513901707;
                        i5 = 55464593;
                    }
                case -1185257182:
                case 770961127:
                    if (AbstractC2021.m6574()) {
                        m6981 = (C2105.m6981("᩶ۧ") + i2) * (-79);
                        i4 = ((m6981 ^ i3) * 26039) ^ 1848057868;
                        i5 = 260625053;
                    } else {
                        m6981 = C0630.m2566("۟ۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-5041)) ^ (-1514914848);
                        i5 = -810713185;
                    }
                case -1041112416:
                case 1439759393:
                    C7106.m19120();
                    C3663.m11168();
                    m6981 = (C2105.m6981("ᩳۧ") + i3) * (-91);
                    i4 = ((m6981 ^ i2) * 21559) ^ 925164782;
                    i5 = 1808295476;
                case -986806824:
                case 413231013:
                    if (C22628.f73083 <= 0) {
                        m6981 = (i2 - C2105.m6981("ۜ֡")) * 97;
                        i4 = ((m6981 ^ i3) * (-657)) ^ 967685910;
                        i5 = -1127362674;
                    } else {
                        m6981 = (C2105.m6981("᩶ۧ") + i2) * (-79);
                        i4 = ((m6981 ^ i3) * 26039) ^ 1848057868;
                        i5 = 260625053;
                    }
                case -883867227:
                case -408876647:
                    ServiceConnectionC3453.m10561(abstractActivityC3346, exc, null);
                    break;
                case -792238334:
                case 171975174:
                    C5695.m16023();
                    C2105.m6982();
                    break;
                case -759367530:
                case 494833757:
                    if (C11340.f33930 >= 0) {
                        m6981 = (C2105.m6981("᩸ܰ") + i3) * (-29);
                        i4 = ((m6981 ^ i2) * 17315) ^ 489140442;
                        i5 = -1595732739;
                    } else {
                        m6981 = (C2105.m6981("ܳۢ") ^ i2) * (-101);
                        i4 = ((m6981 ^ i3) * (-339)) ^ (-1104657419);
                        i5 = 1554689060;
                    }
                case -652865161:
                case 348991415:
                    C0237.m1481();
                    if (RunnableC3474.f10992 > 0) {
                        m6981 = (C2105.m6981("᩶ۧ") + i2) * (-79);
                        i4 = ((m6981 ^ i3) * 26039) ^ 1848057868;
                        i5 = 260625053;
                    } else {
                        m6981 = (C2105.m6981("ܶۡ") + i3) * 71;
                        i4 = ((m6981 ^ i2) * (-7571)) ^ 284804682;
                        i5 = 870881087;
                    }
                case -580491425:
                case 333753494:
                    abstractActivityC3346 = this.f69738;
                    if (C3683.f11629 >= 0) {
                        m6981 = (C2105.m6981("᩸ܰ") + i3) * (-29);
                        i4 = ((m6981 ^ i2) * 17315) ^ 489140442;
                        i5 = -1595732739;
                    } else {
                        m6981 = (C0630.m2566("۟ۨ") + i2) * 47;
                        i4 = ((m6981 ^ i3) * (-15627)) ^ 2146716853;
                        i5 = 1748526742;
                    }
                case -391234712:
                case -60919231:
                    C0630.m2564();
                    if (C0964.f3626 != 0) {
                        m6981 = (C2105.m6981("ᩳۧ") + i3) * (-91);
                        i4 = ((m6981 ^ i2) * 21559) ^ 925164782;
                        i5 = 1808295476;
                    } else {
                        m6981 = (i2 - C2105.m6981("ۜ֡")) * 97;
                        i4 = ((m6981 ^ i3) * (-657)) ^ 967685910;
                        i5 = -1127362674;
                    }
                case 60199947:
                case 1458041138:
                    if (C0050.f910 >= 0) {
                        m6981 = (i2 - C2105.m6981("ۜ֡")) * 97;
                        i4 = ((m6981 ^ i3) * (-657)) ^ 967685910;
                        i5 = -1127362674;
                    } else {
                        m6981 = C2105.m6981("ۢۘ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-17695)) ^ (-1122155248);
                        i5 = -1529585019;
                    }
                case 921578699:
                case 962393388:
                    if (AbstractC2021.m6574()) {
                        m6981 = (C2105.m6981("᩶ۧ") + i2) * (-79);
                        i4 = ((m6981 ^ i3) * 26039) ^ 1848057868;
                        i5 = 260625053;
                    } else {
                        m6981 = (C2105.m6981("ۜ᩹") + i2) * 85;
                        i4 = ((m6981 ^ i3) * (-28151)) ^ 1335967849;
                        i5 = 1716052182;
                    }
                default:
                    if (C4159.f13567) {
                        m6981 = C0630.m2566("۠᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-11019)) ^ 1725715785;
                        i5 = -67012872;
                    } else {
                        m6981 = (i2 - C2105.m6981("ۜ֡")) * 97;
                        i4 = ((m6981 ^ i3) * (-657)) ^ 967685910;
                        i5 = -1127362674;
                    }
            }
            return;
        }
    }
}
