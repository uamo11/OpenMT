package l;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.alipay.sdk.m.y.q;
import com.google.android.material.snackbar.SnackbarManager;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* compiled from: I5UN */
/* renamed from: l.ۖۢۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C2447 extends C8776 {

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7802 = 0;

    /* renamed from: ᩸ۙۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f7803 = {1544, 14384, 14363, 14420, 14362, 14363, 14336, 14420, 14343, 14337, 14340, 14340, 14363, 14342, 14336};

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f7804;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f7805;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f7806;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f7807;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public Paint f7808;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f7809;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f7810;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f7811;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f7812;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f7813;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f7814;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f7815;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f7816;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public long f7817;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f7818;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f7819;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public View f7820;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f7821;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC2968 f7822;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C14792 f7823;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public float f7824;

    @Override // l.C13132
    public final void setAdapter(AbstractC19902 abstractC19902) {
        AbstractC2968 abstractC2968 = null;
        AbstractC19902 abstractC199022 = null;
        int i = 370991265;
        int i2 = RunnableC3474.f10992;
        int i3 = C3683.f11629;
        int m6981 = C2105.m6981("֡ᩳ") ^ i3;
        int i4 = ((m6981 ^ i2) * (-8661)) ^ (-785544117);
        int i5 = -406860785;
        while (true) {
            i = ((((i ^ i2) * 10785) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2091207627:
                case -890898148:
                    if (C1773.f6144 <= 0) {
                        m6981 = C2105.m6981("᩷ᩳ") ^ i2;
                        i4 = ((m6981 ^ i3) * 31965) ^ 1330700745;
                        i5 = -1471478010;
                    } else {
                        m6981 = (i3 - C0630.m2566("ܿ۟")) * (-61);
                        i4 = ((m6981 ^ i2) * (-6949)) ^ 1548867937;
                        i5 = 13452409;
                    }
                case -1865308029:
                case -31783362:
                    if (C2520.f8000 >= 0) {
                        m6981 = (C2105.m6981("ۙ᩷") + i3) * (-41);
                        i4 = ((m6981 ^ i2) * 10563) ^ 1053071394;
                        i5 = 2030214235;
                    } else {
                        m6981 = (i3 - C2105.m6981("᩷ܿ")) * (-85);
                        i4 = ((m6981 ^ i2) * (-127)) ^ (-469255383);
                        i5 = -1631741243;
                    }
                case -1636488406:
                case -572588077:
                    super.setAdapter(abstractC19902);
                    abstractC2968 = this.f7822;
                    if (abstractC2968 != null) {
                        m6981 = C0630.m2566("ۗۗ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-21011)) ^ 2079155941;
                        i5 = -364214542;
                    } else {
                        m6981 = (i2 - C0630.m2566("ۡ۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((m6981 ^ i3) * 24591) ^ 837306304;
                        i5 = -222855819;
                    }
                case -1504463515:
                case 1015870432:
                    if (C5695.m16023() >= 0) {
                        m6981 = (i2 - C0630.m2566("ۜۨ")) * 77;
                        i4 = ((m6981 ^ i3) * (-30789)) ^ (-577157147);
                        i5 = 1764373602;
                    } else {
                        m6981 = C0630.m2566("ܿۛ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-32695)) ^ (-1852194764);
                        i5 = -2045831750;
                    }
                case -1422660407:
                case 1566172877:
                    if (C21923.m49329()) {
                        m6981 = C2105.m6981("᩷ᩳ") ^ i2;
                        i4 = ((m6981 ^ i3) * 31965) ^ 1330700745;
                        i5 = -1471478010;
                    } else {
                        m6981 = C0630.m2566("۠ۚ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-15449)) ^ (-550138264);
                        i5 = 383592115;
                    }
                case -1357305658:
                case 1095161716:
                    C0798.m2998();
                    m6981 = (i2 - C0630.m2566("ۜۨ")) * 77;
                    i4 = ((m6981 ^ i3) * (-30789)) ^ (-577157147);
                    i5 = 1764373602;
                case -1323242288:
                case -135793384:
                    if (C2126.f7087) {
                        m6981 = (C2105.m6981("ۙܳ") + i3) * 79;
                        i4 = ((m6981 ^ i2) * 24373) ^ (-183272527);
                        i5 = -986498178;
                    } else {
                        m6981 = (C0630.m2566("ۘ᩶") ^ i3) * (-87);
                        i4 = ((m6981 ^ i2) * (-887)) ^ (-2037618853);
                        i5 = 1529812996;
                    }
                case -1290032713:
                case 1252723122:
                    if (C1005.f3721) {
                        m6981 = (C2105.m6981("ۙ᩷") + i3) * (-41);
                        i4 = ((m6981 ^ i2) * 10563) ^ 1053071394;
                        i5 = 2030214235;
                    } else {
                        m6981 = (C0630.m2566("ۢ֨") ^ i2) * (-75);
                        i4 = ((m6981 ^ i3) * 32617) ^ (-1288963875);
                        i5 = 1595709142;
                    }
                case -1255911061:
                case -742848618:
                    break;
                case -1188425226:
                case 259509553:
                    C1047.m3599();
                    if (C3432.f10845 >= 0) {
                        m6981 = (i2 - C0630.m2566("ۜۨ")) * 77;
                        i4 = ((m6981 ^ i3) * (-30789)) ^ (-577157147);
                        i5 = 1764373602;
                    } else {
                        m6981 = (C2105.m6981("ۙ᩷") + i3) * (-41);
                        i4 = ((m6981 ^ i2) * 10563) ^ 1053071394;
                        i5 = 2030214235;
                    }
                case -1156534146:
                case 1169085809:
                    if (this.f7822 != null) {
                        m6981 = (C0630.m2566("ۨۧ") + i2) * (-17);
                        i4 = ((m6981 ^ i3) * 27111) ^ 1450383003;
                        i5 = 1840226768;
                    } else {
                        m6981 = C2105.m6981("ۜ᩹") ^ i3;
                        i4 = ((m6981 ^ i2) * (-18903)) ^ 1766544156;
                        i5 = 1794246106;
                    }
                case -1121859601:
                case 325652418:
                    if (C3432.f10845 >= 0) {
                        m6981 = C2105.m6981("᩷ᩳ") ^ i2;
                        i4 = ((m6981 ^ i3) * 31965) ^ 1330700745;
                        i5 = -1471478010;
                    } else {
                        m6981 = C0630.m2566("᩺ۚ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-21025)) ^ 3121821;
                        i5 = -1611468749;
                    }
                case -912096137:
                case -293505774:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m6981 = (i2 - C0630.m2566("ۜۨ")) * 77;
                        i4 = ((m6981 ^ i3) * (-30789)) ^ (-577157147);
                        i5 = 1764373602;
                    } else {
                        m6981 = (C2105.m6981("ۙܳ") + i3) * 79;
                        i4 = ((m6981 ^ i2) * 24373) ^ (-183272527);
                        i5 = -986498178;
                    }
                case -741238574:
                case -252811139:
                    abstractC19902.registerAdapterDataObserver(abstractC2968);
                    m6981 = (C0630.m2566("ܰۤ") ^ i3) * (-117);
                    i4 = ((m6981 ^ i2) * (-22479)) ^ 2057987151;
                    i5 = -743700272;
                case -549902022:
                case 516791807:
                    if (abstractC19902 != null) {
                        m6981 = C0630.m2566("ܿܰ") ^ i3;
                        i4 = ((m6981 ^ i2) * 30289) ^ (-781996466);
                        i5 = 659996398;
                    } else {
                        m6981 = (C0630.m2566("ܰۤ") ^ i3) * (-117);
                        i4 = ((m6981 ^ i2) * (-22479)) ^ 2057987151;
                        i5 = -743700272;
                    }
                case -497402716:
                case 1932515994:
                    if (C22628.f73083 <= 0) {
                        m6981 = C2105.m6981("᩷ᩳ") ^ i2;
                        i4 = ((m6981 ^ i3) * 31965) ^ 1330700745;
                        i5 = -1471478010;
                    } else {
                        m6981 = C0630.m2566("᩵ۙ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-23815)) ^ 1161269153;
                        i5 = 1566901577;
                    }
                case -309302397:
                case 483008850:
                    this.f7822.onChanged();
                    m6981 = (i2 - C0630.m2566("ۡ۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i4 = ((m6981 ^ i3) * 24591) ^ 837306304;
                    i5 = -222855819;
                case -7317411:
                case 1249511592:
                    abstractC199022.unregisterAdapterDataObserver(this.f7822);
                    m6981 = C2105.m6981("ۜ᩹") ^ i3;
                    i4 = ((m6981 ^ i2) * (-18903)) ^ 1766544156;
                    i5 = 1794246106;
                case 318114628:
                case 725780208:
                    abstractC199022 = getAdapter();
                    if (abstractC199022 != null) {
                        m6981 = C0630.m2566("ܽۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * 10027) ^ 1841074399;
                        i5 = 730866235;
                    } else {
                        m6981 = C2105.m6981("ۜ᩹") ^ i3;
                        i4 = ((m6981 ^ i2) * (-18903)) ^ 1766544156;
                        i5 = 1794246106;
                    }
                case 322487568:
                case 1195715773:
                    if (C3245.f10203 <= 0) {
                        m6981 = (C0630.m2566("ۢ֨") ^ i2) * (-75);
                        i4 = ((m6981 ^ i3) * 32617) ^ (-1288963875);
                        i5 = 1595709142;
                    } else {
                        m6981 = (C2105.m6981("᩻ۛ") ^ i2) * (-43);
                        i4 = ((m6981 ^ i3) * 3057) ^ 485236052;
                        i5 = 2052353705;
                    }
                case 369558337:
                case 1363341778:
                    if (C1916.f6442) {
                        m6981 = (C2105.m6981("֨ܽ") + i2) * 55;
                        i4 = ((m6981 ^ i3) * (-16921)) ^ (-1445791247);
                        i5 = -1565882649;
                    } else {
                        m6981 = (i2 - C0630.m2566("ۜۨ")) * 77;
                        i4 = ((m6981 ^ i3) * (-30789)) ^ (-577157147);
                        i5 = 1764373602;
                    }
                case 1168893699:
                case 1921528619:
                    if (C0382.f1805) {
                        m6981 = C2105.m6981("ۚܳ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-5989)) ^ 1694111050;
                        i5 = -1425019096;
                    } else {
                        m6981 = (C2105.m6981("ۙܳ") + i3) * 79;
                        i4 = ((m6981 ^ i2) * 24373) ^ (-183272527);
                        i5 = -986498178;
                    }
                default:
                    C3663.m11168();
                    break;
            }
            return;
        }
    }

    @Override // l.C13132
    public final void setLayoutManager(AbstractC17366 abstractC17366) {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 843777834;
        int i6 = RunnableC0588.f2309;
        int i7 = C1128.f4106;
        int m2566 = C0630.m2566("֡ۛ") ^ i6;
        int i8 = ((m2566 ^ i7) * (-11721)) ^ (-530442815);
        int i9 = 1813524828;
        while (true) {
            i5 = ((((i5 ^ i7) * 23523) >> 31) & i8) ^ (m2566 ^ i9);
            switch (i5) {
                case -2051439621:
                case -1204049715:
                    C1773.m5908();
                    if (C21923.f70183 == 0) {
                        m2566 = (i6 - C2105.m6981("ۜ᩻")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((m2566 ^ i7) * 1809) ^ (-1265132408);
                        i9 = -1375935419;
                    } else {
                        m2566 = C0630.m2566("ۤܶ") ^ i7;
                        i8 = ((m2566 ^ i6) * 19607) ^ 972190174;
                        i9 = -901648243;
                    }
                case -1852766818:
                case -1647619194:
                    i3 = 293197129;
                    if (C0483.f2088 >= 0) {
                        m2566 = (C0630.m2566("᩺ܿ") ^ i7) * 31;
                        i8 = ((m2566 ^ i6) * (-23341)) ^ 889100034;
                        i9 = -1915109848;
                    } else {
                        m2566 = C2105.m6981("۟۠") ^ i7;
                        i8 = ((m2566 ^ i6) * 1695) ^ (-1727461268);
                        i9 = 1790455664;
                    }
                case -1823416923:
                case 788198455:
                    s = sArr[c];
                    s2 = 34246;
                    if (C3432.f10845 >= 0) {
                        m2566 = C0630.m2566("᩹᩵") ^ i6;
                        i8 = ((m2566 ^ i7) * (-29481)) ^ (-133336095);
                        i9 = 843898397;
                    } else {
                        m2566 = (C2105.m6981("۠ᩴ") ^ i6) * 127;
                        i8 = ((m2566 ^ i7) * (-32155)) ^ 1548689647;
                        i9 = 944129084;
                    }
                case -1632620363:
                case 1509591771:
                    c = 0;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = (C2105.m6981("ۧۜ") + i7) * (-59);
                        i8 = ((m2566 ^ i6) * 655) ^ 1474930973;
                        i9 = 2045026145;
                    } else {
                        m2566 = C0630.m2566("ۤۘ") ^ i7;
                        i8 = ((m2566 ^ i6) * 8839) ^ 561816983;
                        i9 = 645803915;
                    }
                case -1543909617:
                case 1648161625:
                    if ((i2 + i3) - i < 0) {
                        m2566 = (C2105.m6981("۠ۡ") ^ i6) * (-43);
                        i8 = ((m2566 ^ i7) * 19551) ^ (-612404341);
                        i9 = 1650136305;
                    } else {
                        m2566 = C2105.m6981("ܶۛ") ^ i7;
                        i8 = ((m2566 ^ i6) * (-21949)) ^ (-554192879);
                        i9 = 1334471709;
                    }
                case -1414238546:
                case -14466814:
                    if (C1005.f3721) {
                        m2566 = (C2105.m6981("ۧۜ") + i7) * (-59);
                        i8 = ((m2566 ^ i6) * 655) ^ 1474930973;
                        i9 = 2045026145;
                    } else {
                        m2566 = (C0630.m2566("᩺ܿ") ^ i7) * 31;
                        i8 = ((m2566 ^ i6) * (-23341)) ^ 889100034;
                        i9 = -1915109848;
                    }
                case -1059345865:
                case 1540049273:
                    i = s * s2;
                    i2 = s * s;
                    if (RunnableC1108.f4040) {
                        m2566 = C2105.m6981("۫ۚ") ^ i6;
                        i8 = ((m2566 ^ i7) * 19545) ^ 1482792176;
                        i9 = 70283622;
                    } else {
                        m2566 = (C0630.m2566("᩺ܿ") ^ i7) * 31;
                        i8 = ((m2566 ^ i6) * (-23341)) ^ 889100034;
                        i9 = -1915109848;
                    }
                case -1027265641:
                case 1809004682:
                    if (C1420.f5096 <= 0) {
                        m2566 = (C2105.m6981("ۧۜ") + i7) * (-59);
                        i8 = ((m2566 ^ i6) * 655) ^ 1474930973;
                        i9 = 2045026145;
                    } else {
                        m2566 = (i6 - C2105.m6981("ۜ᩻")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((m2566 ^ i7) * 1809) ^ (-1265132408);
                        i9 = -1375935419;
                    }
                case -967700715:
                case 1218442742:
                    if (C1294.f4556 >= 0) {
                        m2566 = C0630.m2566("᩹᩵") ^ i6;
                        i8 = ((m2566 ^ i7) * (-29481)) ^ (-133336095);
                        i9 = 843898397;
                    } else {
                        m2566 = C2105.m6981("۫֨") ^ i6;
                        i8 = ((m2566 ^ i7) * (-14767)) ^ (-1580508371);
                        i9 = 1924799585;
                    }
                case -799505822:
                case 1583568338:
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = C0630.m2566("᩹᩵") ^ i6;
                        i8 = ((m2566 ^ i7) * (-29481)) ^ (-133336095);
                        i9 = 843898397;
                    } else {
                        m2566 = C2105.m6981("᩺ۧ") ^ i6;
                        i8 = ((m2566 ^ i7) * o.a.p) ^ (-1363294703);
                        i9 = -781766156;
                    }
                case -518895725:
                case -406549013:
                    short[] sArr2 = f7803;
                    if (C3537.f11231 < 0 && !RunnableC1108.m3790()) {
                        throw new RuntimeException(C2167.m7159(sArr2, 1, 14, i4));
                    }
                    m2566 = C0630.m2566("ۤܶ") ^ i7;
                    i8 = ((m2566 ^ i6) * 19607) ^ 972190174;
                    i9 = -901648243;
                    break;
                case -348045357:
                case 1887208036:
                    sArr = f7803;
                    if (C3746.f11829 <= 0) {
                        m2566 = (C2105.m6981("ۧۜ") + i7) * (-59);
                        i8 = ((m2566 ^ i6) * 655) ^ 1474930973;
                        i9 = 2045026145;
                    } else {
                        m2566 = C0630.m2566("۬᩸") ^ i7;
                        i8 = ((m2566 ^ i6) * (-29081)) ^ 815898211;
                        i9 = -1774926223;
                    }
                case -169641047:
                case 2012859507:
                    if (C1005.m3501()) {
                        m2566 = (C2105.m6981("ۗᩳ") + i7) * 91;
                        i8 = ((m2566 ^ i6) * (-21995)) ^ (-2086898161);
                        i9 = -686094258;
                    } else {
                        m2566 = C0630.m2566("᩹᩵") ^ i6;
                        i8 = ((m2566 ^ i7) * (-29481)) ^ (-133336095);
                        i9 = 843898397;
                    }
                case -104262873:
                case 1192136112:
                    i4 = 14452;
                    m2566 = (C0630.m2566("ᩳܳ") + i6) * 11;
                    i8 = ((m2566 ^ i7) * 12627) ^ (-1761954577);
                    i9 = 2095432054;
                case 839773135:
                case 1891356848:
                    RunnableC1108.m3790();
                    C4263.m12819();
                    return;
                case 860461957:
                case 1847642677:
                    C1294.m4372();
                    m2566 = (C2105.m6981("ۧۜ") + i7) * (-59);
                    i8 = ((m2566 ^ i6) * 655) ^ 1474930973;
                    i9 = 2045026145;
                default:
                    i4 = 43099;
                    m2566 = (C0630.m2566("ᩳܳ") + i6) * 11;
                    i8 = ((m2566 ^ i7) * 12627) ^ (-1761954577);
                    i9 = 2095432054;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m7899() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -968544134;
        int i6 = C4616.f14690;
        int i7 = C1128.f4106;
        int m6981 = C2105.m6981("ۧۚ") ^ i6;
        int i8 = ((m6981 ^ i7) * (-27391)) ^ 965589091;
        int i9 = -2014368713;
        while (true) {
            i5 = ((((i5 ^ i7) * 6883) >> 31) & i8) ^ (m6981 ^ i9);
            switch (i5) {
                case -1951972930:
                case -696302290:
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = C2105.m6981("᩺᩹") ^ i6;
                        i8 = ((m6981 ^ i7) * 23833) ^ (-1186152475);
                        i9 = 1565673353;
                    } else {
                        m6981 = (C2105.m6981("ۙ᩺") + i6) * (-73);
                        i8 = ((m6981 ^ i7) * 16805) ^ 78787839;
                        i9 = -1637551927;
                    }
                case -1889645990:
                case 1783469822:
                    if (C1005.f3721) {
                        m6981 = (C2105.m6981("ۗܳ") + i7) * (-107);
                        i8 = ((m6981 ^ i6) * (-2869)) ^ (-1450421061);
                        i9 = -458611930;
                    } else {
                        m6981 = (C2105.m6981("ܰ֨") ^ i7) * (-9);
                        i8 = ((m6981 ^ i6) * 2371) ^ (-381521818);
                        i9 = -7054535;
                    }
                case -1797308814:
                case 429477013:
                    if (C1916.f6442) {
                        m6981 = C2105.m6981("᩹ۧ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-8039)) ^ 1512463299;
                        i9 = -1128077582;
                    } else {
                        m6981 = C2105.m6981("ܶ֡") ^ i7;
                        i8 = ((m6981 ^ i6) * 5833) ^ (-1439954257);
                        i9 = 2050637937;
                    }
                case -1703279684:
                case -967902615:
                    if (C4616.f14690 <= 0) {
                        m6981 = C2105.m6981("ܶ֡") ^ i7;
                        i8 = ((m6981 ^ i6) * 5833) ^ (-1439954257);
                        i9 = 2050637937;
                    } else {
                        m6981 = C0630.m2566("ᩳ᩻") ^ i7;
                        i8 = ((m6981 ^ i6) * (-12447)) ^ 803600653;
                        i9 = -1548717423;
                    }
                case -1696814309:
                case 513828887:
                    if (C0798.f2919) {
                        m6981 = C2105.m6981("᩺᩹") ^ i6;
                        i8 = ((m6981 ^ i7) * 23833) ^ (-1186152475);
                        i9 = 1565673353;
                    } else {
                        m6981 = C0630.m2566("۬ۨ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-16653)) ^ (-76327284);
                        i9 = -553934950;
                    }
                case -1689107645:
                case -669816140:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m6981 = C0630.m2566("᩶ۧ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-5829)) ^ 980695164;
                        i9 = 1612689824;
                    } else {
                        m6981 = C2105.m6981("᩺᩹") ^ i6;
                        i8 = ((m6981 ^ i7) * 23833) ^ (-1186152475);
                        i9 = 1565673353;
                    }
                case -1597985004:
                case 1672614079:
                    i2 = 1;
                    if (i >= 1) {
                        m6981 = (C2105.m6981("֨ᩴ") ^ i6) * 97;
                        i8 = ((m6981 ^ i7) * 8019) ^ (-378653956);
                        i9 = 1193548197;
                    } else {
                        i3 = i;
                        m6981 = C2105.m6981("֫ۙ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-1177)) ^ 223201837;
                        i9 = 931316384;
                    }
                case -1588318684:
                case 1310059164:
                    i = C1128.m3848(this);
                    if (C3683.f11629 >= 0) {
                        m6981 = (C2105.m6981("ܰ֨") ^ i7) * (-9);
                        i8 = ((m6981 ^ i6) * 2371) ^ (-381521818);
                        i9 = -7054535;
                    } else {
                        m6981 = (C2105.m6981("۬ܺ") + i7) * (-79);
                        i8 = ((m6981 ^ i6) * (-561)) ^ (-926224825);
                        i9 = -1471587564;
                    }
                case -1422443727:
                case 1864972636:
                    if (C0237.f1507 != 0) {
                        m6981 = C0630.m2566("᩶ۧ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-5829)) ^ 980695164;
                        i9 = 1612689824;
                    } else {
                        m6981 = C0630.m2566("ۤ۫") ^ i7;
                        i8 = ((m6981 ^ i6) * 4175) ^ 1145227363;
                        i9 = 1378203366;
                    }
                case -616310664:
                case 1070610150:
                    this.f7816 = i3;
                    m6981 = C0630.m2566("ܽᩴ") ^ i6;
                    i8 = ((m6981 ^ i7) * 941) ^ 259405965;
                    i9 = 600578933;
                case -540551463:
                case -339238359:
                    i4 = C1005.m3498(C2958.m9024(this, 0));
                    if (i4 > i2) {
                        m6981 = (C0630.m2566("ۨ᩹") ^ i7) * 119;
                        i8 = ((m6981 ^ i6) * (-2063)) ^ (-378409791);
                        i9 = -1792345503;
                    } else {
                        i3 = i;
                        m6981 = C2105.m6981("֫ۙ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-1177)) ^ 223201837;
                        i9 = 931316384;
                    }
                case -241846434:
                case 1745073360:
                    if (C4263.f13799 <= 0) {
                        m6981 = C2105.m6981("ܶ֡") ^ i7;
                        i8 = ((m6981 ^ i6) * 5833) ^ (-1439954257);
                        i9 = 2050637937;
                    } else {
                        m6981 = (C2105.m6981("ۡۚ") + i6) * (-37);
                        i8 = ((m6981 ^ i7) * (-4723)) ^ (-1251037725);
                        i9 = 2014877364;
                    }
                case -199762596:
                case 91701090:
                    return this.f7816;
                case -155943518:
                case 1376196239:
                    if (C3245.m9925() != 0) {
                        m6981 = C2105.m6981("᩺᩹") ^ i6;
                        i8 = ((m6981 ^ i7) * 23833) ^ (-1186152475);
                        i9 = 1565673353;
                    } else {
                        m6981 = (i6 - C0630.m2566("۟ۚ")) * (-31);
                        i8 = ((m6981 ^ i7) * (-27787)) ^ (-1805594625);
                        i9 = -1093725925;
                    }
                case 724042475:
                case 1520528809:
                    if (C3019.f9544 >= 0) {
                        m6981 = (C2105.m6981("ܰ֨") ^ i7) * (-9);
                        i8 = ((m6981 ^ i6) * 2371) ^ (-381521818);
                        i9 = -7054535;
                    } else {
                        m6981 = C2105.m6981("ܿ֡") ^ i6;
                        i8 = ((m6981 ^ i7) * 14129) ^ (-1278821247);
                        i9 = -2038720618;
                    }
                case 1057387494:
                case 1813248289:
                    if (i3 > this.f7816) {
                        m6981 = (C0630.m2566("۟ܺ") ^ i7) * (-85);
                        i8 = ((m6981 ^ i6) * (-31)) ^ (-2035827985);
                        i9 = 338874039;
                    } else {
                        m6981 = C0630.m2566("ܽᩴ") ^ i6;
                        i8 = ((m6981 ^ i7) * 941) ^ 259405965;
                        i9 = 600578933;
                    }
                case 1155190732:
                case 2078987894:
                    C3683.m11222();
                    if (C0798.m2998() == 0) {
                        m6981 = C0630.m2566("᩶ۧ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-5829)) ^ 980695164;
                        i9 = 1612689824;
                    } else {
                        m6981 = C2105.m6981("ܶ֡") ^ i7;
                        i8 = ((m6981 ^ i6) * 5833) ^ (-1439954257);
                        i9 = 2050637937;
                    }
                case 1185371217:
                case 1399220238:
                    C2105.m6982();
                    return 0;
                case 1625555006:
                case 2070416976:
                    i3 = C0237.m1484(i, C1005.m3498(this) / i4);
                    m6981 = C2105.m6981("֫ۙ") ^ i7;
                    i8 = ((m6981 ^ i6) * (-1177)) ^ 223201837;
                    i9 = 931316384;
                case 1715704134:
                case 1925096082:
                    RunnableC0588.m2441();
                    C2520.m8026();
                    m6981 = C0630.m2566("᩶ۧ") ^ i6;
                    i8 = ((m6981 ^ i7) * (-5829)) ^ 980695164;
                    i9 = 1612689824;
                default:
                    C0382.m1848();
                    if (C0714.f2697 >= 0) {
                        m6981 = C2105.m6981("ܶ֡") ^ i7;
                        i8 = ((m6981 ^ i6) * 5833) ^ (-1439954257);
                        i9 = 2050637937;
                    } else {
                        m6981 = (i6 - C2105.m6981("۟ۤ")) * 89;
                        i8 = ((m6981 ^ i7) * 4789) ^ (-101248816);
                        i9 = -1357867881;
                    }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2447(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        int i = -1172631078;
        int i2 = C3019.f9544;
        int i3 = C3683.f11629;
        int m2566 = (C0630.m2566("ۘܶ") ^ i2) * 33;
        int i4 = ((m2566 ^ i3) * 27449) ^ 43560498;
        int i5 = 317670513;
        while (true) {
            i = (m2566 ^ i5) ^ (i4 & (((i ^ i3) * 27207) >> 31));
            switch (i) {
                case -2119249634:
                case 825726045:
                    return;
                case -1289425889:
                case 1604418822:
                    if (C1128.f4106 <= 0) {
                        m2566 = C0630.m2566("᩺۬") ^ i3;
                        i4 = ((m2566 ^ i2) * (-28009)) ^ (-1105209522);
                        i5 = -1541256253;
                    } else {
                        m2566 = (C2105.m6981("ۢۖ") + i2) * (-85);
                        i4 = ((m2566 ^ i3) * (-25987)) ^ (-1447721058);
                        i5 = 673415761;
                    }
                case -406225312:
                case 1132407039:
                    C1711.m5736();
                    C2126.m7040();
                    throw new RuntimeException();
                case -324610481:
                case 1480590761:
                    if (C11340.f33930 >= 0) {
                        m2566 = C0630.m2566("᩻ܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * 1237) ^ 625990453;
                        i5 = 323847058;
                    } else {
                        m2566 = C0630.m2566("ۗ۬") ^ i3;
                        i4 = ((m2566 ^ i2) * 16303) ^ (-1981902034);
                        i5 = -493008200;
                    }
                case 370823584:
                case 809584150:
                    C0964.m3413();
                    m2566 = C0630.m2566("᩻ܺ") ^ i3;
                    i4 = ((m2566 ^ i2) * 1237) ^ 625990453;
                    i5 = 323847058;
                case 1353101724:
                case 1406889195:
                    if (C1047.f3863 < 0) {
                        m2566 = (C0630.m2566("۟۫") + i2) * 35;
                        i4 = ((m2566 ^ i3) * 30391) ^ (-933218279);
                        i5 = 628353213;
                    } else {
                        m2566 = (C2105.m6981("᩵۬") ^ i2) * 43;
                        i4 = ((m2566 ^ i3) * (-5927)) ^ (-1103293395);
                        i5 = -511220327;
                    }
                default:
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = C0630.m2566("᩻ܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * 1237) ^ 625990453;
                        i5 = 323847058;
                    } else {
                        m2566 = (C0630.m2566("۟۫") + i2) * 35;
                        i4 = ((m2566 ^ i3) * 30391) ^ (-933218279);
                        i5 = 628353213;
                    }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m7900(View view) {
        AbstractC19902 abstractC19902 = null;
        int i = 258051823;
        int i2 = C4263.f13799;
        int i3 = C3746.f11829;
        int m6981 = C2105.m6981("֫᩹") ^ i2;
        int i4 = ((m6981 ^ i3) * (-25855)) ^ (-707727019);
        int i5 = 329546173;
        while (true) {
            i = ((((i ^ i3) * 16949) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2076819396:
                case -1889008112:
                    if (C2167.f7158 >= 0) {
                        m6981 = C0630.m2566("᩷᩺") ^ i2;
                        i4 = ((m6981 ^ i3) * (-8815)) ^ 1121553874;
                        i5 = 25785115;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۖۙ")) * (-29);
                        i4 = ((m6981 ^ i2) * 13857) ^ 2110367740;
                        i5 = -1765798875;
                    }
                case -1892832971:
                case 1757165516:
                    this.f7822 = new C15851(this, view);
                    m6981 = (i2 - C0630.m2566("ۘ᩻")) * (-55);
                    i4 = ((m6981 ^ i3) * 24415) ^ (-1105578908);
                    i5 = -1976047377;
                case -1776492328:
                case -1288152421:
                    if (C2167.m7155()) {
                        m6981 = (i2 - C2105.m6981("ۚۜ")) * q.h;
                        i4 = ((m6981 ^ i3) * 4277) ^ (-2144572563);
                        i5 = -609683183;
                    } else {
                        m6981 = C0630.m2566("᩷ܿ") ^ i3;
                        i4 = ((m6981 ^ i2) * 25771) ^ 169086976;
                        i5 = -1792840043;
                    }
                case -1633358059:
                case 1662482451:
                    if (C1711.f5919) {
                        m6981 = C0630.m2566("᩷᩺") ^ i2;
                        i4 = ((m6981 ^ i3) * (-8815)) ^ 1121553874;
                        i5 = 25785115;
                    } else {
                        m6981 = (C2105.m6981("۟֨") + i3) * (-73);
                        i4 = ((m6981 ^ i2) * (-20383)) ^ 226769063;
                        i5 = -21556808;
                    }
                case -1556741897:
                case 1434242362:
                    if (C4616.f14690 <= 0) {
                        m6981 = (i2 - C0630.m2566("ۖ۬")) * (-127);
                        i4 = ((m6981 ^ i3) * 10873) ^ (-1566811332);
                        i5 = -1249083447;
                    } else {
                        m6981 = C0630.m2566("ۢۨ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-8453)) ^ 1983506842;
                        i5 = 1316197138;
                    }
                case -1518385196:
                case 2135503428:
                    abstractC19902.registerAdapterDataObserver(this.f7822);
                    m6981 = (C2105.m6981("ᩴᩴ") + i3) * (-27);
                    i4 = ((m6981 ^ i2) * (-21675)) ^ (-1496235703);
                    i5 = 144377568;
                case -1406556797:
                case -723534289:
                    if (C3746.f11829 <= 0) {
                        m6981 = (i2 - C0630.m2566("ۖ۬")) * (-127);
                        i4 = ((m6981 ^ i3) * 10873) ^ (-1566811332);
                        i5 = -1249083447;
                    } else {
                        m6981 = (C0630.m2566("֨ܳ") + i3) * (-111);
                        i4 = ((m6981 ^ i2) * (-22911)) ^ (-1531416429);
                        i5 = 546154388;
                    }
                case -1015502543:
                case -809793021:
                    if (C3245.m9925() != 0) {
                        m6981 = C0630.m2566("᩷᩺") ^ i2;
                        i4 = ((m6981 ^ i3) * (-8815)) ^ 1121553874;
                        i5 = 25785115;
                    } else {
                        m6981 = C2105.m6981("ᩳܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * 16619) ^ 1387330214;
                        i5 = 511072036;
                    }
                case -570364982:
                case -56273041:
                    if (C1916.f6442) {
                        m6981 = C0630.m2566("᩵᩺") ^ i2;
                        i4 = ((m6981 ^ i3) * (-15791)) ^ (-1750627900);
                        i5 = -1335285839;
                    } else {
                        m6981 = C0630.m2566("᩷᩺") ^ i2;
                        i4 = ((m6981 ^ i3) * (-8815)) ^ 1121553874;
                        i5 = 25785115;
                    }
                case -201777704:
                case 1658902703:
                    RunnableC0588.m2441();
                    break;
                case 121256784:
                case 1043702600:
                    if (C3683.f11629 >= 0) {
                        m6981 = (i2 - C0630.m2566("ۖ۬")) * (-127);
                        i4 = ((m6981 ^ i3) * 10873) ^ (-1566811332);
                        i5 = -1249083447;
                    } else {
                        m6981 = C0630.m2566("ۜ᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * 7055) ^ (-753344481);
                        i5 = -1426577113;
                    }
                case 310572556:
                case 903222480:
                    C4263.m12819();
                    if (C1047.f3863 < 0) {
                        m6981 = (i2 - C2105.m6981("ۚۜ")) * q.h;
                        i4 = ((m6981 ^ i3) * 4277) ^ (-2144572563);
                        i5 = -609683183;
                    } else {
                        m6981 = C2105.m6981("۟ۖ") ^ i3;
                        i4 = ((m6981 ^ i2) * 9109) ^ (-1640440678);
                        i5 = 1280245551;
                    }
                case 546575117:
                case 707347744:
                    this.f7820 = view;
                    if (this.f7822 == null) {
                        m6981 = (i3 - C2105.m6981("ܿ᩻")) * (-57);
                        i4 = ((m6981 ^ i2) * (-18629)) ^ 435555764;
                        i5 = 1902811635;
                    } else {
                        m6981 = (i2 - C0630.m2566("ۘ᩻")) * (-55);
                        i4 = ((m6981 ^ i3) * 24415) ^ (-1105578908);
                        i5 = -1976047377;
                    }
                case 588547797:
                case 1262350431:
                    C2167.m7155();
                    m6981 = C0630.m2566("᩷ܿ") ^ i3;
                    i4 = ((m6981 ^ i2) * 25771) ^ 169086976;
                    i5 = -1792840043;
                case 670603963:
                case 1738372877:
                    if (C7106.f21815 != 0) {
                        m6981 = (i2 - C0630.m2566("ۖ۬")) * (-127);
                        i4 = ((m6981 ^ i3) * 10873) ^ (-1566811332);
                        i5 = -1249083447;
                    } else {
                        m6981 = (C2105.m6981("ܶۛ") + i2) * (-57);
                        i4 = ((m6981 ^ i3) * (-18419)) ^ (-1504544566);
                        i5 = -76665832;
                    }
                case 702738095:
                case 2049926780:
                    if (C4263.f13799 <= 0) {
                        m6981 = C0630.m2566("᩷᩺") ^ i2;
                        i4 = ((m6981 ^ i3) * (-8815)) ^ 1121553874;
                        i5 = 25785115;
                    } else {
                        m6981 = C0630.m2566("ܳۢ") ^ i3;
                        i4 = ((m6981 ^ i2) * 28419) ^ (-3667485);
                        i5 = -1703085691;
                    }
                case 774311609:
                case 1369889397:
                    this.f7822.onChanged();
                    break;
                case 999806110:
                case 1246856578:
                    abstractC19902 = getAdapter();
                    if (abstractC19902 != null) {
                        m6981 = (C0630.m2566("֫ܶ") ^ i2) * (-51);
                        i4 = ((m6981 ^ i3) * (-7173)) ^ 242853286;
                        i5 = 888368115;
                    } else {
                        m6981 = (C2105.m6981("ᩴᩴ") + i3) * (-27);
                        i4 = ((m6981 ^ i2) * (-21675)) ^ (-1496235703);
                        i5 = 144377568;
                    }
                case 1207409124:
                case 1655913007:
                    if (C1711.f5919) {
                        m6981 = (i2 - C0630.m2566("ۖ۬")) * (-127);
                        i4 = ((m6981 ^ i3) * 10873) ^ (-1566811332);
                        i5 = -1249083447;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۖܺ")) * 75;
                        i4 = ((m6981 ^ i2) * (-30141)) ^ (-1259394383);
                        i5 = 526222531;
                    }
                default:
                    RunnableC1937.m6387();
                    if (C5695.f17556 < 0) {
                        m6981 = (i2 - C2105.m6981("ۚۜ")) * q.h;
                        i4 = ((m6981 ^ i3) * 4277) ^ (-2144572563);
                        i5 = -609683183;
                    } else {
                        m6981 = (i2 - C0630.m2566("ۖ۬")) * (-127);
                        i4 = ((m6981 ^ i3) * 10873) ^ (-1566811332);
                        i5 = -1249083447;
                    }
            }
            return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x005d, code lost:
    
        if (l.C1128.f4106 <= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2447(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2447.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m7898() {
        boolean z = false;
        int i = 164425559;
        int i2 = C0714.f2697;
        int i3 = C1294.f4556;
        int m2566 = C0630.m2566("᩹᩻") ^ i2;
        int i4 = ((m2566 ^ i3) * (-18859)) ^ (-1045589502);
        int i5 = 1623484634;
        while (true) {
            i = ((((i ^ i3) * (-4263)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1962821183:
                case -264366055:
                    if (C0422.f1886 > 0) {
                        m2566 = (C0630.m2566("ܽ۟") + i3) * (-65);
                        i4 = ((m2566 ^ i2) * 32017) ^ (-81939394);
                        i5 = -627301885;
                    } else {
                        m2566 = (i2 - C0630.m2566("᩷ܽ")) * 61;
                        i4 = ((m2566 ^ i3) * 17323) ^ 88739045;
                        i5 = -707177184;
                    }
                case -1812364659:
                case 1079862223:
                    ViewOnClickListenerC1958.m6429();
                    m2566 = (C0630.m2566("ܽ۟") + i3) * (-65);
                    i4 = ((m2566 ^ i2) * 32017) ^ (-81939394);
                    i5 = -627301885;
                case -1580696080:
                case -1248696759:
                    if (C21923.f70183 != 0) {
                        m2566 = C2105.m6981("ۚܶ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-25995)) ^ (-1060874902);
                        i5 = 1597404590;
                    } else {
                        m2566 = (C0630.m2566("֨ᩴ") ^ i3) * (-7);
                        i4 = ((m2566 ^ i2) * (-12273)) ^ (-596681769);
                        i5 = 151383603;
                    }
                case -1539710222:
                case -1390520307:
                    if (C2958.f9394 >= 0) {
                        m2566 = C0630.m2566("᩸۠") ^ i3;
                        i4 = ((m2566 ^ i2) * (-21283)) ^ 1312319280;
                        i5 = -980676704;
                    } else {
                        m2566 = (C2105.m6981("ۡ֡") ^ i3) * (-19);
                        i4 = ((m2566 ^ i2) * 10153) ^ (-669258725);
                        i5 = 835709791;
                    }
                case -1474814758:
                case 1052282034:
                    break;
                case -742631181:
                case 1269111393:
                    if (C1420.f5096 <= 0) {
                        m2566 = C0630.m2566("᩸۠") ^ i3;
                        i4 = ((m2566 ^ i2) * (-21283)) ^ 1312319280;
                        i5 = -980676704;
                    } else {
                        m2566 = C0630.m2566("ۨ᩸") ^ i2;
                        i4 = ((m2566 ^ i3) * (-26773)) ^ 148755162;
                        i5 = -575036955;
                    }
                case -521810156:
                case -491717623:
                    setVerticalScrollBarEnabled(true);
                    m2566 = C0630.m2566("ۖᩴ") ^ i2;
                    i4 = ((m2566 ^ i3) * (-31031)) ^ (-1108540480);
                    i5 = -1325958927;
                case -413530007:
                case 865077168:
                    if (C0382.f1805) {
                        m2566 = (i3 - C2105.m6981("۠ܿ")) * (-103);
                        i4 = ((m2566 ^ i2) * 25021) ^ 1047219231;
                        i5 = 2083171938;
                    } else {
                        m2566 = (C0630.m2566("ۗ᩷") + i2) * 19;
                        i4 = ((m2566 ^ i3) * (-31451)) ^ 1109670014;
                        i5 = -810696600;
                    }
                case -293061147:
                case 220082755:
                    z = false;
                    if (C3683.f11629 >= 0) {
                        m2566 = (C0630.m2566("ܽ۟") + i3) * (-65);
                        i4 = ((m2566 ^ i2) * 32017) ^ (-81939394);
                        i5 = -627301885;
                    } else {
                        m2566 = (i2 - C0630.m2566("ܿܳ")) * 101;
                        i4 = ((m2566 ^ i3) * 31485) ^ (-12720719);
                        i5 = -1983410496;
                    }
                case -291306382:
                case 1021600728:
                    if (C1711.f5919) {
                        m2566 = (C0630.m2566("ۗ᩷") + i2) * 19;
                        i4 = ((m2566 ^ i3) * (-31451)) ^ 1109670014;
                        i5 = -810696600;
                    } else {
                        m2566 = (C0630.m2566("֡᩷") ^ i3) * (-113);
                        i4 = ((m2566 ^ i2) * (-3237)) ^ (-98595448);
                        i5 = 1862031488;
                    }
                case -268570482:
                case 1511819900:
                    if (C4159.f13567) {
                        m2566 = (C0630.m2566("ۨۨ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m2566 ^ i3) * 31423) ^ (-1475450802);
                        i5 = 885748369;
                    } else {
                        m2566 = (C0630.m2566("ۗ᩷") + i2) * 19;
                        i4 = ((m2566 ^ i3) * (-31451)) ^ 1109670014;
                        i5 = -810696600;
                    }
                case -117949744:
                case 1408650088:
                    this.f7809 = z;
                    if (this.f7821) {
                        m2566 = C0630.m2566("ۖᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31031)) ^ (-1108540480);
                        i5 = -1325958927;
                    } else {
                        m2566 = (i3 - C0630.m2566("᩺ᩴ")) * 71;
                        i4 = ((m2566 ^ i2) * (-13115)) ^ 1486238319;
                        i5 = 1788494787;
                    }
                case 305410549:
                case 1787265763:
                    C1005.m3501();
                    if (RunnableC3474.m10630()) {
                        m2566 = C2105.m6981("ۚܶ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-25995)) ^ (-1060874902);
                        i5 = 1597404590;
                    } else {
                        m2566 = (i2 - C0630.m2566("᩷ܽ")) * 61;
                        i4 = ((m2566 ^ i3) * 17323) ^ 88739045;
                        i5 = -707177184;
                    }
                case 1004703054:
                case 1036867451:
                    ViewOnClickListenerC1958.m6429();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m2566 = (C0630.m2566("ܽ۟") + i3) * (-65);
                        i4 = ((m2566 ^ i2) * 32017) ^ (-81939394);
                        i5 = -627301885;
                    } else {
                        m2566 = (C0630.m2566("ۗ᩷") + i2) * 19;
                        i4 = ((m2566 ^ i3) * (-31451)) ^ 1109670014;
                        i5 = -810696600;
                    }
                case 1069641372:
                case 1082295589:
                    if (C3683.m11222()) {
                        m2566 = (C0630.m2566("ۗ᩷") + i2) * 19;
                        i4 = ((m2566 ^ i3) * (-31451)) ^ 1109670014;
                        i5 = -810696600;
                    } else {
                        m2566 = C2105.m6981("ۧܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * 30893) ^ (-345299180);
                        i5 = 500148539;
                    }
                case 1336359822:
                case 2135981068:
                    if (C21923.f70183 != 0) {
                        m2566 = (C0630.m2566("ۗ᩷") + i2) * 19;
                        i4 = ((m2566 ^ i3) * (-31451)) ^ 1109670014;
                        i5 = -810696600;
                    } else {
                        m2566 = C0630.m2566("᩺᩺") ^ i2;
                        i4 = ((m2566 ^ i3) * (-4053)) ^ 1543556971;
                        i5 = 1004417812;
                    }
                case 1410540880:
                case 1948227904:
                    RunnableC0588.m2441();
                    break;
                default:
                    if (C2167.m7155()) {
                        m2566 = C0630.m2566("᩸۠") ^ i3;
                        i4 = ((m2566 ^ i2) * (-21283)) ^ 1312319280;
                        i5 = -980676704;
                    } else {
                        m2566 = C2105.m6981("ۢ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-18463)) ^ 210350325;
                        i5 = -1297374516;
                    }
            }
            return;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7897(int i) {
        AbstractC17366 abstractC17366 = null;
        int i2 = -242377599;
        int i3 = C1047.f3863;
        int i4 = ServiceConnectionC3453.f10921;
        int m2566 = (C0630.m2566("ܶۢ") ^ i4) * (-5);
        int i5 = ((m2566 ^ i3) * 3169) ^ (-533656838);
        int i6 = -1563039692;
        while (true) {
            i2 = ((((i2 ^ i3) * 1509) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -2115514082:
                case 709065973:
                    if (C0237.f1507 != 0) {
                        m2566 = C0630.m2566("ᩴ᩶") ^ i4;
                        i5 = ((m2566 ^ i3) * (-6973)) ^ (-312489127);
                        i6 = 1317434827;
                    } else {
                        m2566 = C2105.m6981("ۤᩴ") ^ i3;
                        i5 = ((m2566 ^ i4) * 16601) ^ 1549939597;
                        i6 = 2082963350;
                    }
                case -2063560948:
                case 1996747102:
                    if (C1711.m5736() <= 0) {
                        m2566 = C2105.m6981("ۙ۬") ^ i3;
                        i5 = ((m2566 ^ i4) * (-30071)) ^ (-1162929383);
                        i6 = -2146791658;
                    } else {
                        m2566 = C0630.m2566("ᩴ᩻") ^ i3;
                        i5 = ((m2566 ^ i4) * 11133) ^ (-319654705);
                        i6 = 293558457;
                    }
                case -1785791392:
                case 1494778213:
                    if (C7106.f21815 == 0) {
                        m2566 = C2105.m6981("ۙ۬") ^ i3;
                        i5 = ((m2566 ^ i4) * (-30071)) ^ (-1162929383);
                        i6 = -2146791658;
                    } else {
                        m2566 = C0630.m2566("ᩴ᩶") ^ i4;
                        i5 = ((m2566 ^ i3) * (-6973)) ^ (-312489127);
                        i6 = 1317434827;
                    }
                case -1763599326:
                case 730403671:
                    if (C2126.f7087) {
                        m2566 = C2105.m6981("ۙ۬") ^ i3;
                        i5 = ((m2566 ^ i4) * (-30071)) ^ (-1162929383);
                        i6 = -2146791658;
                    } else {
                        m2566 = C0630.m2566("ۚᩳ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-14291)) ^ 469244613;
                        i6 = -731878699;
                    }
                case -1677454505:
                case 894171838:
                    if (C3537.m10746() <= 0) {
                        m2566 = C0630.m2566("ᩴ᩶") ^ i4;
                        i5 = ((m2566 ^ i3) * (-6973)) ^ (-312489127);
                        i6 = 1317434827;
                    } else {
                        m2566 = C0630.m2566("ۜ۬") ^ i4;
                        i5 = ((m2566 ^ i3) * 14095) ^ 2000853500;
                        i6 = 182372629;
                    }
                case -1569534407:
                case -1502529167:
                    RunnableC0588.m2441();
                    m2566 = C2105.m6981("ۙ۬") ^ i3;
                    i5 = ((m2566 ^ i4) * (-30071)) ^ (-1162929383);
                    i6 = -2146791658;
                case -1274566329:
                case -33994688:
                    if (C3245.m9925() != 0) {
                        m2566 = C0630.m2566("ۚᩳ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-14291)) ^ 469244613;
                        i6 = -731878699;
                    } else {
                        m2566 = C0630.m2566("ۚܶ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-19181)) ^ 510461271;
                        i6 = -915252502;
                    }
                case -553320765:
                case -245396753:
                    if (C1504.m5179()) {
                        m2566 = (C0630.m2566("᩵۫") ^ i4) * 119;
                        i5 = ((m2566 ^ i3) * (-8347)) ^ (-1366713219);
                        i6 = 1388838964;
                    } else {
                        m2566 = (C2105.m6981("ᩴ֫") + i4) * 7;
                        i5 = ((m2566 ^ i3) * (-17499)) ^ (-1071758456);
                        i6 = 663484355;
                    }
                case -433461259:
                case -388595186:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m2566 = C2105.m6981("ۙ۬") ^ i3;
                        i5 = ((m2566 ^ i4) * (-30071)) ^ (-1162929383);
                        i6 = -2146791658;
                    } else {
                        m2566 = C2105.m6981("۟ۜ") ^ i4;
                        i5 = ((m2566 ^ i3) * 9627) ^ (-679573501);
                        i6 = -2092637805;
                    }
                case 349870195:
                case 745156371:
                    if (C0237.f1507 != 0) {
                        m2566 = C2105.m6981("ۙ۬") ^ i3;
                        i5 = ((m2566 ^ i4) * (-30071)) ^ (-1162929383);
                        i6 = -2146791658;
                    } else {
                        m2566 = (C0630.m2566("᩵ۡ") + i4) * 19;
                        i5 = ((m2566 ^ i3) * 25069) ^ 1272078388;
                        i6 = -904855991;
                    }
                case 629502982:
                case 1879585422:
                    if (C11340.f33930 >= 0) {
                        m2566 = (C0630.m2566("᩶ۚ") ^ i4) * 45;
                        i5 = ((m2566 ^ i3) * 1011) ^ 607899970;
                        i6 = 837408998;
                    } else {
                        m2566 = C2105.m6981("ۙۗ") ^ i3;
                        i5 = ((m2566 ^ i4) * 10629) ^ (-1510617405);
                        i6 = -1717418492;
                    }
                case 886404629:
                case 1055602606:
                    ((C6495) abstractC17366).scrollToPositionWithOffset(i, 0);
                    break;
                case 1468931586:
                case 1565900242:
                    if (C1773.f6144 <= 0) {
                        m2566 = C0630.m2566("ۚᩳ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-14291)) ^ 469244613;
                        i6 = -731878699;
                    } else {
                        m2566 = (C0630.m2566("᩶ۚ") ^ i4) * 45;
                        i5 = ((m2566 ^ i3) * 1011) ^ 607899970;
                        i6 = 837408998;
                    }
                case 1555326845:
                case 1964898384:
                    if (C0798.f2919) {
                        m2566 = C0630.m2566("ۚᩳ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-14291)) ^ 469244613;
                        i6 = -731878699;
                    } else {
                        m2566 = (C0630.m2566("ۢܺ") + i3) * q.h;
                        i5 = ((m2566 ^ i4) * (-8847)) ^ 2082197590;
                        i6 = -1780380829;
                    }
                case 1874054974:
                case 2077201553:
                    abstractC17366 = super.getLayoutManager();
                    if (C4616.f14690 <= 0) {
                        m2566 = (C2105.m6981("ᩴ֫") + i4) * 7;
                        i5 = ((m2566 ^ i3) * (-17499)) ^ (-1071758456);
                        i6 = 663484355;
                    } else {
                        m2566 = C0630.m2566("ܿ۫") ^ i3;
                        i5 = ((m2566 ^ i4) * 27043) ^ (-990486172);
                        i6 = -1179806480;
                    }
                default:
                    C0237.m1481();
                    break;
            }
            return;
        }
    }

    @Override // l.C13132, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = -785462602;
        int i6 = C0630.f2410;
        int i7 = AbstractC2021.f6743;
        int m2566 = (i6 - C0630.m2566("ۛ᩸")) * 49;
        int i8 = ((m2566 ^ i7) * (-6445)) ^ 2127895405;
        int i9 = -896390740;
        while (true) {
            i5 = ((((i5 ^ i7) * (-12595)) >> 31) & i8) ^ (m2566 ^ i9);
            switch (i5) {
                case -2060145520:
                case 1473207371:
                    if (C7106.f21815 != 0) {
                        m2566 = (i6 - C2105.m6981("ۙܳ")) * (-87);
                        i8 = ((m2566 ^ i7) * 22383) ^ (-724477408);
                        i9 = -1588081619;
                    } else {
                        m2566 = (i7 - C0630.m2566("ۜ۠")) * (-93);
                        i8 = ((m2566 ^ i6) * 243) ^ (-498452059);
                        i9 = 169609973;
                    }
                case -1908042072:
                case -73929300:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        m2566 = C2105.m6981("ᩳᩳ") ^ i6;
                        i8 = ((m2566 ^ i7) * 28285) ^ (-1726176623);
                        i9 = -1687739661;
                    } else {
                        m2566 = C0630.m2566("᩺ۤ") ^ i6;
                        i8 = ((m2566 ^ i7) * (-16991)) ^ (-1536166110);
                        i9 = -1982363160;
                    }
                case -1887532671:
                case 1366651072:
                    C1128.m3851();
                    if (AbstractC2021.m6574()) {
                        m2566 = C2105.m6981("ܶܰ") ^ i7;
                        i8 = ((m2566 ^ i6) * 32499) ^ 563947076;
                        i9 = 33349520;
                    } else {
                        m2566 = (C0630.m2566("۫ۡ") ^ i6) * 67;
                        i8 = ((m2566 ^ i7) * (-7145)) ^ (-1021991611);
                        i9 = 1162506998;
                    }
                case -1860033451:
                case -194111050:
                    if (C1773.f6144 <= 0) {
                        m2566 = (i6 - C2105.m6981("ۙܳ")) * (-87);
                        i8 = ((m2566 ^ i7) * 22383) ^ (-724477408);
                        i9 = -1588081619;
                    } else {
                        m2566 = C2105.m6981("۟ܿ") ^ i6;
                        i8 = ((m2566 ^ i7) * 27309) ^ (-2074529832);
                        i9 = -912007182;
                    }
                case -1827410700:
                case 1466610893:
                    if (C3019.f9544 >= 0) {
                        m2566 = C2105.m6981("ᩳᩳ") ^ i6;
                        i8 = ((m2566 ^ i7) * 28285) ^ (-1726176623);
                        i9 = -1687739661;
                    } else {
                        m2566 = C0630.m2566("۫ᩳ") ^ i7;
                        i8 = ((m2566 ^ i6) * (-11933)) ^ 1763026406;
                        i9 = -1760906901;
                    }
                case -1443542293:
                case -683803165:
                    C4075.m12263();
                    if (C4616.f14690 > 0) {
                        m2566 = C2105.m6981("ᩳᩳ") ^ i6;
                        i8 = ((m2566 ^ i7) * 28285) ^ (-1726176623);
                        i9 = -1687739661;
                    } else {
                        m2566 = (C0630.m2566("۫ۡ") ^ i6) * 67;
                        i8 = ((m2566 ^ i7) * (-7145)) ^ (-1021991611);
                        i9 = 1162506998;
                    }
                case -1174415554:
                case 573559079:
                    try {
                        super.onLayout(z, i, i2, i3, i4);
                    } catch (Exception unused) {
                    }
                    m2566 = (C2105.m6981("ۢۧ") + i7) * 43;
                    i8 = ((m2566 ^ i6) * 15777) ^ 238920549;
                    i9 = -168143108;
                case -1046426112:
                case 1702368641:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m2566 = C2105.m6981("ܶܰ") ^ i7;
                        i8 = ((m2566 ^ i6) * 32499) ^ 563947076;
                        i9 = 33349520;
                    } else {
                        m2566 = (C0630.m2566("֡֡") + i6) * 59;
                        i8 = ((m2566 ^ i7) * 26563) ^ (-1791224511);
                        i9 = -327952460;
                    }
                case -1043037227:
                case -492925483:
                    AbstractC2021.m6574();
                    C0630.m2564();
                    break;
                case -984333489:
                case 373679574:
                    if (C4616.m13552() != 0) {
                        m2566 = (i6 - C2105.m6981("ۙܳ")) * (-87);
                        i8 = ((m2566 ^ i7) * 22383) ^ (-724477408);
                        i9 = -1588081619;
                    } else {
                        m2566 = C0630.m2566("ۜ᩹") ^ i7;
                        i8 = ((m2566 ^ i6) * 16197) ^ 1465838369;
                        i9 = -279595104;
                    }
                case -918173084:
                case 1620469418:
                    if (C1773.f6144 <= 0) {
                        m2566 = (C0630.m2566("۫ۡ") ^ i6) * 67;
                        i8 = ((m2566 ^ i7) * (-7145)) ^ (-1021991611);
                        i9 = 1162506998;
                    } else {
                        m2566 = (C2105.m6981("ܳۖ") + i7) * 101;
                        i8 = ((m2566 ^ i6) * 29467) ^ (-1841312226);
                        i9 = -878487246;
                    }
                case -111712058:
                case 945558166:
                    C3746.m11369();
                    C3683.m11222();
                    m2566 = C2105.m6981("ᩳᩳ") ^ i6;
                    i8 = ((m2566 ^ i7) * 28285) ^ (-1726176623);
                    i9 = -1687739661;
                case -100268820:
                case 1656607994:
                    if (C1005.m3501()) {
                        m2566 = C0630.m2566("֫ᩳ") ^ i6;
                        i8 = ((m2566 ^ i7) * (-22345)) ^ (-1363851344);
                        i9 = -544962050;
                    } else {
                        m2566 = (i6 - C2105.m6981("ۙܳ")) * (-87);
                        i8 = ((m2566 ^ i7) * 22383) ^ (-724477408);
                        i9 = -1588081619;
                    }
                case -39076768:
                case 1465300649:
                    if (RunnableC3474.f10992 <= 0) {
                        m2566 = C2105.m6981("ᩳᩳ") ^ i6;
                        i8 = ((m2566 ^ i7) * 28285) ^ (-1726176623);
                        i9 = -1687739661;
                    } else {
                        m2566 = C2105.m6981("ۚ۠") ^ i7;
                        i8 = ((m2566 ^ i6) * (-18251)) ^ 1960905879;
                        i9 = -10543570;
                    }
                case 98727604:
                case 176389942:
                    if (C1005.f3721) {
                        m2566 = C2105.m6981("ۘܳ") ^ i7;
                        i8 = ((m2566 ^ i6) * 19833) ^ 1791139680;
                        i9 = 909914738;
                    } else {
                        m2566 = C2105.m6981("ܶܰ") ^ i7;
                        i8 = ((m2566 ^ i6) * 32499) ^ 563947076;
                        i9 = 33349520;
                    }
                case 1585932703:
                case 2066828388:
                    this.f7818 = 0;
                    break;
                default:
                    if (C1711.f5919) {
                        m2566 = (C0630.m2566("۫ۡ") ^ i6) * 67;
                        i8 = ((m2566 ^ i7) * (-7145)) ^ (-1021991611);
                        i9 = 1162506998;
                    } else {
                        m2566 = C2105.m6981("ۗ۠") ^ i6;
                        i8 = ((m2566 ^ i7) * (-25921)) ^ (-1294796723);
                        i9 = 1291178105;
                    }
            }
            return;
        }
    }

    @Override // l.C13132
    public final AbstractC17366 getLayoutManager() {
        return (C6495) super.getLayoutManager();
    }

    @Override // l.C13132
    public final void scrollToPosition(int i) {
        AbstractC17366 abstractC17366 = null;
        int i2 = -853972407;
        int i3 = C4075.f12947;
        int i4 = AbstractC2021.f6743;
        int m2566 = (C0630.m2566("ۘ᩻") + i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i5 = ((m2566 ^ i3) * 2063) ^ (-1976726827);
        int i6 = 833366241;
        while (true) {
            i2 = ((((i2 ^ i3) * 15833) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -2020218095:
                case -1273619886:
                    if (C0422.m1963()) {
                        m2566 = (C2105.m6981("ܽۙ") + i4) * 55;
                        i5 = ((m2566 ^ i3) * 9835) ^ (-1535412364);
                        i6 = -633275960;
                    } else {
                        m2566 = C2105.m6981("ۨ֡") ^ i3;
                        i5 = ((m2566 ^ i4) * (-29765)) ^ 1166636189;
                        i6 = 1521617659;
                    }
                case -1877315858:
                case 1150712513:
                    if (RunnableC1108.f4040) {
                        m2566 = C0630.m2566("ۤ᩷") ^ i4;
                        i5 = ((m2566 ^ i3) * (-32311)) ^ (-1125032837);
                        i6 = -1695074424;
                    } else {
                        m2566 = C2105.m6981("ۨ֡") ^ i3;
                        i5 = ((m2566 ^ i4) * (-29765)) ^ 1166636189;
                        i6 = 1521617659;
                    }
                case -1856626982:
                case 1347532670:
                    C2105.m6982();
                    if (C2167.m7155()) {
                        m2566 = C2105.m6981("֫ۙ") ^ i4;
                        i5 = ((m2566 ^ i3) * 22821) ^ (-1060769469);
                        i6 = 1263819823;
                    } else {
                        m2566 = C2105.m6981("ۨ֡") ^ i3;
                        i5 = ((m2566 ^ i4) * (-29765)) ^ 1166636189;
                        i6 = 1521617659;
                    }
                case -1791405650:
                case 517024940:
                    C3245.m9925();
                    m2566 = C2105.m6981("֫ۙ") ^ i4;
                    i5 = ((m2566 ^ i3) * 22821) ^ (-1060769469);
                    i6 = 1263819823;
                case -1758244732:
                case 1704913650:
                    if (C3663.f11553) {
                        m2566 = C2105.m6981("۫ۤ") ^ i3;
                        i5 = ((m2566 ^ i4) * 20237) ^ 1309046808;
                        i6 = -1769283539;
                    } else {
                        m2566 = C2105.m6981("ۚ᩶") ^ i4;
                        i5 = ((m2566 ^ i3) * (-609)) ^ 471031999;
                        i6 = 720431873;
                    }
                case -1008032712:
                case 2086308446:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m2566 = C2105.m6981("֨᩷") ^ i4;
                        i5 = ((m2566 ^ i3) * (-20643)) ^ 1643205984;
                        i6 = 117174578;
                    } else {
                        m2566 = C2105.m6981("۟ܺ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-6061)) ^ (-1236811621);
                        i6 = -555766822;
                    }
                case -962414825:
                case 1862007152:
                    if (C2167.m7155()) {
                        m2566 = C2105.m6981("֨᩷") ^ i4;
                        i5 = ((m2566 ^ i3) * (-20643)) ^ 1643205984;
                        i6 = 117174578;
                    } else {
                        m2566 = (i3 - C2105.m6981("ܽۡ")) * 55;
                        i5 = ((m2566 ^ i4) * (-23697)) ^ 1527275885;
                        i6 = 1947668208;
                    }
                case -866301928:
                case 896912107:
                    if (C0483.m2121()) {
                        m2566 = (i3 - C2105.m6981("ܿۢ")) * (-65);
                        i5 = ((m2566 ^ i4) * (-30903)) ^ (-592660625);
                        i6 = 187243997;
                    } else {
                        m2566 = C2105.m6981("֫ۙ") ^ i4;
                        i5 = ((m2566 ^ i3) * 22821) ^ (-1060769469);
                        i6 = 1263819823;
                    }
                case -852007000:
                case 503211298:
                    C7106.m19120();
                    C1504.m5179();
                    break;
                case -756432742:
                case 36533777:
                    if (C3911.f12484 < 0) {
                        m2566 = C2105.m6981("֫ۙ") ^ i4;
                        i5 = ((m2566 ^ i3) * 22821) ^ (-1060769469);
                        i6 = 1263819823;
                    } else {
                        m2566 = C2105.m6981("۫ۤ") ^ i3;
                        i5 = ((m2566 ^ i4) * 20237) ^ 1309046808;
                        i6 = -1769283539;
                    }
                case -622432496:
                case 1061694268:
                    if (C0050.f910 >= 0) {
                        m2566 = C0630.m2566("᩶ۧ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-25497)) ^ 764455169;
                        i6 = -1251444350;
                    } else {
                        m2566 = (C2105.m6981("֨ۨ") + i4) * (-83);
                        i5 = ((m2566 ^ i3) * (-7627)) ^ 1419718173;
                        i6 = -2082043083;
                    }
                case -73146420:
                case 1026577259:
                    C4263.m12819();
                    if (C11340.f33930 < 0) {
                        m2566 = C2105.m6981("֫ۙ") ^ i4;
                        i5 = ((m2566 ^ i3) * 22821) ^ (-1060769469);
                        i6 = 1263819823;
                    } else {
                        m2566 = C2105.m6981("֨᩷") ^ i4;
                        i5 = ((m2566 ^ i3) * (-20643)) ^ 1643205984;
                        i6 = 117174578;
                    }
                case 1168915610:
                case 1521602449:
                    abstractC17366 = super.getLayoutManager();
                    if (C2958.f9394 >= 0) {
                        m2566 = C0630.m2566("᩶ۧ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-25497)) ^ 764455169;
                        i6 = -1251444350;
                    } else {
                        m2566 = C0630.m2566("۫᩻") ^ i3;
                        i5 = ((m2566 ^ i4) * (-22033)) ^ (-2075288414);
                        i6 = -134916475;
                    }
                case 1228678018:
                case 1451517497:
                    if (C4075.m12263() <= 0) {
                        m2566 = C2105.m6981("֨᩷") ^ i4;
                        i5 = ((m2566 ^ i3) * (-20643)) ^ 1643205984;
                        i6 = 117174578;
                    } else {
                        m2566 = (C2105.m6981("ܳܽ") + i3) * (-105);
                        i5 = ((m2566 ^ i4) * (-30791)) ^ 1325360518;
                        i6 = -1781348353;
                    }
                case 1626426353:
                case 1781685686:
                    if (C3537.f11231 >= 0) {
                        m2566 = C2105.m6981("֨᩷") ^ i4;
                        i5 = ((m2566 ^ i3) * (-20643)) ^ 1643205984;
                        i6 = 117174578;
                    } else {
                        m2566 = (C0630.m2566("ᩴܽ") ^ i4) * (-117);
                        i5 = ((m2566 ^ i3) * 14969) ^ 1864573645;
                        i6 = 568091444;
                    }
                default:
                    ((C6495) abstractC17366).scrollToPosition(i);
                    break;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m7895() {
        return ((C6495) super.getLayoutManager()).findFirstVisibleItemPosition();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m7896() {
        return ((C6495) super.getLayoutManager()).findLastVisibleItemPosition();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m7903() {
        awakenScrollBars(SnackbarManager.SHORT_DURATION_MS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0111, code lost:
    
        if (l.C2167.m7155() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x014c, code lost:
    
        r1 = (l.C0630.m2566("ܽۛ") + r40) * (-119);
        r3 = ((r1 ^ r39) * 19265) ^ 859623076;
        r42 = 1499304633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012d, code lost:
    
        if (l.C3746.m11369() >= 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0149, code lost:
    
        if (l.C4075.f12947 >= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0169, code lost:
    
        if (l.RunnableC0588.f2309 >= 0) goto L38;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r48) {
        /*
            Method dump skipped, instructions count: 2784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2447.dispatchDraw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d4, code lost:
    
        if (l.C3683.f11629 >= 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        if (l.C11340.f33930 >= 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e0, code lost:
    
        if (l.C4075.f12947 < 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e6, code lost:
    
        if (l.RunnableC0588.f2309 < 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ff, code lost:
    
        if (r5 != 3) goto L115;
     */
    @Override // l.C13132, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 1498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2447.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0077, code lost:
    
        if (l.C3683.f11629 < 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0082, code lost:
    
        if (l.C1047.m3599() >= 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x008a, code lost:
    
        if (l.C3019.m9255() > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e1, code lost:
    
        if (l.C1005.m3501() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e9, code lost:
    
        if (l.C2167.f7158 < 0) goto L18;
     */
    @Override // l.C13132, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 2008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2447.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m7902() {
        int i = 582720052;
        int i2 = C22628.f73083;
        int i3 = RunnableC3474.f10992;
        int m6981 = C2105.m6981("᩸ۡ") ^ i2;
        int i4 = ((m6981 ^ i3) * (-25811)) ^ (-351763304);
        int i5 = 1819618803;
        while (true) {
            i = ((((i ^ i3) * (-23721)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2104155904:
                case 1018829776:
                    C3019.m9255();
                    if (RunnableC1108.f4040) {
                        m6981 = C2105.m6981("ܶ֨") ^ i2;
                        i4 = ((m6981 ^ i3) * 28271) ^ 1687472321;
                        i5 = 2132272218;
                    } else {
                        m6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                        i4 = ((m6981 ^ i3) * (-6183)) ^ 377280136;
                        i5 = 997000827;
                    }
                case -2044811701:
                case 287364145:
                    return true;
                case -2036182154:
                case -935308673:
                    if (C0714.m2805()) {
                        m6981 = (C2105.m6981("۫ۜ") + i3) * (-9);
                        i4 = ((m6981 ^ i2) * (-17139)) ^ (-755908824);
                        i5 = -1231049698;
                    } else {
                        m6981 = C2105.m6981("ۡۘ") ^ i3;
                        i4 = ((m6981 ^ i2) * 9501) ^ 1241731571;
                        i5 = 524056406;
                    }
                case -1926673375:
                case 950459129:
                    if (C3432.f10845 >= 0) {
                        m6981 = C0630.m2566("ܺ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * 9769) ^ 1813022899;
                        i5 = -478213560;
                    } else {
                        m6981 = C2105.m6981("᩻᩹") ^ i2;
                        i4 = ((m6981 ^ i3) * 10723) ^ (-1901981042);
                        i5 = -1664764466;
                    }
                case -1878750703:
                case 1118606532:
                    if (this.f7811) {
                        m6981 = (i2 - C0630.m2566("۬۠")) * (-47);
                        i4 = ((m6981 ^ i3) * 465) ^ 939336104;
                        i5 = 173715630;
                    } else {
                        m6981 = (C2105.m6981("ۜۛ") + i2) * 79;
                        i4 = ((m6981 ^ i3) * 2605) ^ (-1720809070);
                        i5 = 1131837001;
                    }
                case -1457128333:
                case 335430861:
                    if (C3746.f11829 <= 0) {
                        m6981 = C0630.m2566("ܺ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * 9769) ^ 1813022899;
                        i5 = -478213560;
                    } else {
                        m6981 = C0630.m2566("۟ᩳ") ^ i2;
                        i4 = ((m6981 ^ i3) * 4315) ^ (-276155419);
                        i5 = -802288127;
                    }
                case -1343808126:
                case 484487187:
                    if (C2126.f7087) {
                        m6981 = (C2105.m6981("۠۬") ^ i3) * (-63);
                        i4 = ((m6981 ^ i2) * (-28311)) ^ 305043156;
                        i5 = -775758619;
                    } else {
                        m6981 = (C2105.m6981("ۘ۫") ^ i3) * (-91);
                        i4 = ((m6981 ^ i2) * 1055) ^ (-410034159);
                        i5 = 2071674067;
                    }
                case -944683206:
                case 1502941305:
                    if (C0964.m3413()) {
                        m6981 = C2105.m6981("ܿۗ") ^ i3;
                        i4 = ((m6981 ^ i2) * 21157) ^ 1357853674;
                        i5 = 445687666;
                    } else {
                        m6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                        i4 = ((m6981 ^ i3) * (-6183)) ^ 377280136;
                        i5 = 997000827;
                    }
                case -891989174:
                case 1627456141:
                    if (C3663.m11168() >= 0) {
                        m6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                        i4 = ((m6981 ^ i3) * (-6183)) ^ 377280136;
                        i5 = 997000827;
                    } else {
                        m6981 = (C2105.m6981("ۖ۠") ^ i2) * 29;
                        i4 = ((m6981 ^ i3) * (-30107)) ^ 627926305;
                        i5 = -762338598;
                    }
                case -834864756:
                case -796308863:
                    if (this.f7815) {
                        m6981 = C2105.m6981("ۡۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-4403)) ^ 1963699140;
                        i5 = -236020825;
                    } else {
                        m6981 = (C2105.m6981("ۜۛ") + i2) * 79;
                        i4 = ((m6981 ^ i3) * 2605) ^ (-1720809070);
                        i5 = 1131837001;
                    }
                case -676496126:
                case 916944260:
                    if (C7106.m19120() > 0) {
                        m6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                        i4 = ((m6981 ^ i3) * (-6183)) ^ 377280136;
                        i5 = 997000827;
                    } else {
                        m6981 = C0630.m2566("ܺ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * 9769) ^ 1813022899;
                        i5 = -478213560;
                    }
                case -566071782:
                case -161077890:
                    C4159.m12565();
                    C3245.m9925();
                    return false;
                case -508381942:
                case 2127980268:
                    C0422.m1963();
                    C0483.m2121();
                    m6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                    i4 = ((m6981 ^ i3) * (-6183)) ^ 377280136;
                    i5 = 997000827;
                case -500913545:
                case 1782642482:
                    return false;
                case -439490666:
                case 2085767661:
                    if (C1504.m5179()) {
                        m6981 = (C2105.m6981("ܺ᩷") ^ i3) * (-115);
                        i4 = ((m6981 ^ i2) * 1671) ^ (-251296076);
                        i5 = 1454140501;
                    } else {
                        m6981 = C2105.m6981("ܶ֨") ^ i2;
                        i4 = ((m6981 ^ i3) * 28271) ^ 1687472321;
                        i5 = 2132272218;
                    }
                case -390769127:
                case 942231820:
                    if (C7811.m20844() != 0) {
                        m6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                        i4 = ((m6981 ^ i3) * (-6183)) ^ 377280136;
                        i5 = 997000827;
                    } else {
                        m6981 = (C2105.m6981("ۨܺ") + i3) * 79;
                        i4 = ((m6981 ^ i2) * 3465) ^ 1811919162;
                        i5 = -1164932976;
                    }
                case 830960771:
                case 2071629223:
                    if (C2520.f8000 >= 0) {
                        m6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                        i4 = ((m6981 ^ i3) * (-6183)) ^ 377280136;
                        i5 = 997000827;
                    } else {
                        m6981 = C0630.m2566("᩺ܳ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-9597)) ^ (-905293214);
                        i5 = -13275568;
                    }
                case 1020058836:
                case 1432650181:
                    if (C11340.f33930 >= 0) {
                        m6981 = (C2105.m6981("۠۬") ^ i3) * (-63);
                        i4 = ((m6981 ^ i2) * (-28311)) ^ 305043156;
                        i5 = -775758619;
                    } else {
                        m6981 = C2105.m6981("۬᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * (-26827)) ^ 772047237;
                        i5 = 688080890;
                    }
                case 1257506699:
                case 1335140494:
                    C1128.m3851();
                    if (C1294.f4556 >= 0) {
                        m6981 = (C0630.m2566("ۘ۠") + i2) * (-29);
                        i4 = ((m6981 ^ i3) * (-6183)) ^ 377280136;
                        i5 = 997000827;
                    } else {
                        m6981 = C2105.m6981("ۡۘ") ^ i3;
                        i4 = ((m6981 ^ i2) * 9501) ^ 1241731571;
                        i5 = 524056406;
                    }
                default:
                    if (this.f7809) {
                        m6981 = C2105.m6981("ܽۖ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-31611)) ^ 697288414;
                        i5 = -1318887403;
                    } else {
                        m6981 = (C2105.m6981("ۜۛ") + i2) * 79;
                        i4 = ((m6981 ^ i3) * 2605) ^ (-1720809070);
                        i5 = 1131837001;
                    }
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m7901() {
        return this.f7813;
    }
}
