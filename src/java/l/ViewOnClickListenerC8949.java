package l;

import android.R;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plugin.api.PluginContext;
import bin.mt.plugin.api.preference.PluginPreference;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* compiled from: O3YD */
/* renamed from: l.ۡܳ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC8949 extends AbstractC3255 implements View.OnClickListener {

    /* renamed from: ܳۢۤ, reason: not valid java name and contains not printable characters */
    private static final short[] f27192 = {6951, -754, -7024, 931, 6862, -3019, 3708, 10087, 32611, 32620, 32614, 32624, 32621, 32619, 32614, 32556, 32619, 32620, 32630, 32615, 32620, 32630, 32556, 32611, 32609, 32630, 32619, 32621, 32620, 32556, 32596, 32587, 32583, 32597, 1083, -23535, -23510, -23517, -23504, -23513, -23514, -23454, -23502, -23504, -23513, -23516, -23513, -23504, -23513, -23508, -23519, -23513, -23454, -23511, -23513, -23493, -23432, -23454};

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public TextView f27193;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18827 f27194;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2978 f27195;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC7809 f27196;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public TextView f27197;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m23070(ViewOnClickListenerC8949 viewOnClickListenerC8949, C17979 c17979, AbstractC7809 abstractC7809, String str) {
        int i = -2023817484;
        int i2 = AbstractC2021.f6743;
        int i3 = C4263.f13799;
        int m6981 = C2105.m6981("ܺۜ") ^ i3;
        int i4 = ((m6981 ^ i2) * 12461) ^ 395755306;
        int i5 = 1648389956;
        while (true) {
            i = ((((i ^ i2) * (-131)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2117244616:
                case 973520992:
                    C3432.m10477();
                    if (C0798.m2998() == 0) {
                        m6981 = C2105.m6981("֨ۚ") ^ i2;
                        i4 = ((m6981 ^ i3) * 2751) ^ 1483888746;
                        i5 = -196439716;
                    } else {
                        m6981 = (C2105.m6981("ۜۗ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((m6981 ^ i3) * (-31175)) ^ (-1554193633);
                        i5 = -1054473756;
                    }
                case -2052851104:
                case -1428115214:
                    if (C3683.f11629 >= 0) {
                        m6981 = (C2105.m6981("ۜۗ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((m6981 ^ i3) * (-31175)) ^ (-1554193633);
                        i5 = -1054473756;
                    } else {
                        m6981 = (C0630.m2566("ܽ᩹") + i3) * 7;
                        i4 = ((m6981 ^ i2) * 2115) ^ 1604710816;
                        i5 = 852439359;
                    }
                case -2001818464:
                case -1562334995:
                    RunnableC0588.m2441();
                    C0237.m1481();
                    m6981 = C0630.m2566("ۡ᩶") ^ i3;
                    i4 = ((m6981 ^ i2) * (-13169)) ^ 327453674;
                    i5 = 286694447;
                case -1651536068:
                case 1120448531:
                    if (C4075.f12947 >= 0) {
                        m6981 = C2105.m6981("֨ۚ") ^ i2;
                        i4 = ((m6981 ^ i3) * 2751) ^ 1483888746;
                        i5 = -196439716;
                    } else {
                        m6981 = (C2105.m6981("۫ۚ") ^ i2) * (-23);
                        i4 = ((m6981 ^ i3) * 30497) ^ 363942461;
                        i5 = 697718404;
                    }
                case -1360898158:
                case -510884394:
                    if (C1420.m4913()) {
                        m6981 = C2105.m6981("᩺֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-4751)) ^ (-473116944);
                        i5 = 403654430;
                    } else {
                        m6981 = (i3 - C2105.m6981("ᩳۡ")) * 5;
                        i4 = ((m6981 ^ i2) * 8447) ^ 45503281;
                        i5 = 1342691344;
                    }
                case -1078000098:
                case 1548012835:
                    if (C0422.f1886 <= 0) {
                        m6981 = (C2105.m6981("ۜۗ") ^ i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((m6981 ^ i3) * (-31175)) ^ (-1554193633);
                        i5 = -1054473756;
                    } else {
                        m6981 = (C0630.m2566("ܰ֡") + i2) * (-89);
                        i4 = ((m6981 ^ i3) * 27453) ^ (-1656676066);
                        i5 = 316979661;
                    }
                case -864024095:
                case 649070859:
                    if (C1294.f4556 >= 0) {
                        m6981 = C0630.m2566("ۡ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * (-13169)) ^ 327453674;
                        i5 = 286694447;
                    } else {
                        m6981 = (C2105.m6981("ᩴ᩷") + i3) * 11;
                        i4 = ((m6981 ^ i2) * (-20483)) ^ 1501487965;
                        i5 = -577393819;
                    }
                case -763570806:
                case 1353520326:
                    if (C2167.f7158 >= 0) {
                        m6981 = C2105.m6981("᩺֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-4751)) ^ (-473116944);
                        i5 = 403654430;
                    } else {
                        m6981 = C0630.m2566("ۖ۠") ^ i2;
                        i4 = ((m6981 ^ i3) * 2567) ^ 2061138485;
                        i5 = -62200389;
                    }
                case -559075834:
                case 1319564026:
                    if (C7106.m19120() > 0) {
                        m6981 = C2105.m6981("֨ۚ") ^ i2;
                        i4 = ((m6981 ^ i3) * 2751) ^ 1483888746;
                        i5 = -196439716;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۧ۬")) * (-95);
                        i4 = ((m6981 ^ i2) * 2161) ^ (-826774536);
                        i5 = 332651035;
                    }
                case -552135588:
                case 1438351314:
                    if (C4159.f13567) {
                        m6981 = C2105.m6981("۫ۛ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-21357)) ^ 1054693362;
                        i5 = 295170600;
                    } else {
                        m6981 = C2105.m6981("֨ۚ") ^ i2;
                        i4 = ((m6981 ^ i3) * 2751) ^ 1483888746;
                        i5 = -196439716;
                    }
                case -402894879:
                case 557013233:
                    viewOnClickListenerC8949.m23071(c17979, abstractC7809, str);
                    break;
                case -372472701:
                case 634062416:
                    if (C3245.f10203 <= 0) {
                        m6981 = C2105.m6981("᩺֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-4751)) ^ (-473116944);
                        i5 = 403654430;
                    } else {
                        m6981 = (C0630.m2566("᩺۟") ^ i2) * (-91);
                        i4 = ((m6981 ^ i3) * 15019) ^ 1286716770;
                        i5 = 278900367;
                    }
                case 522508584:
                case 1522489361:
                    if (C1711.f5919) {
                        m6981 = C2105.m6981("᩺֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-4751)) ^ (-473116944);
                        i5 = 403654430;
                    } else {
                        m6981 = (C0630.m2566("ᩴۛ") + i2) * (-85);
                        i4 = ((m6981 ^ i3) * 5493) ^ 871617626;
                        i5 = -1767269028;
                    }
                case 1307370323:
                case 1526650044:
                    C7106.m19120();
                    if (C0382.f1805) {
                        m6981 = C0630.m2566("ۡ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * (-13169)) ^ 327453674;
                        i5 = 286694447;
                    } else {
                        m6981 = C2105.m6981("֨ۚ") ^ i2;
                        i4 = ((m6981 ^ i3) * 2751) ^ 1483888746;
                        i5 = -196439716;
                    }
                case 1308442353:
                case 1444716686:
                    if (C1504.f5354) {
                        m6981 = C2105.m6981("᩺֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-4751)) ^ (-473116944);
                        i5 = 403654430;
                    } else {
                        m6981 = (C0630.m2566("ۧۖ") + i3) * (-49);
                        i4 = ((m6981 ^ i2) * (-6297)) ^ (-980092902);
                        i5 = -1432563841;
                    }
                default:
                    C21923.m49329();
                    C4159.m12565();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC8949(ActivityC18827 activityC18827, View view) {
        super(view);
        KeyEvent.Callback callback = null;
        TextView textView = null;
        View view2 = null;
        int i = 0;
        String str = null;
        int i2 = 0;
        short[] sArr = null;
        int i3 = 0;
        int i4 = 395349164;
        int i5 = C0050.f910;
        int i6 = C3746.f11829;
        short s = f27192[0];
        int i7 = ((s * s) + 245016409) - (s * 31306) < 0 ? 16449 : 34648;
        this.f27194 = activityC18827;
        int m2566 = C0630.m2566("֡᩺") ^ i5;
        int i8 = ((m2566 ^ i6) * 13727) ^ 1724324388;
        int i9 = -1766387827;
        while (true) {
            i4 = ((((i4 ^ i6) * (-12937)) >> 31) & i8) ^ (m2566 ^ i9);
            switch (i4) {
                case -1928684110:
                case 2071388633:
                    C1005.m3501();
                    C1420.m4913();
                    throw new RuntimeException();
                case -1704836906:
                case -1073164822:
                    i2 = C2105.m6981(str);
                    if (C3746.m11369() >= 0) {
                        m2566 = C2105.m6981("᩷ᩴ") ^ i5;
                        i8 = ((m2566 ^ i6) * (-12853)) ^ (-970021030);
                        i9 = -2016366001;
                    } else {
                        m2566 = C0630.m2566("ۜ᩵") ^ i5;
                        i8 = ((m2566 ^ i6) * 5125) ^ 1448161853;
                        i9 = 120318156;
                    }
                case -1393642257:
                case 1647309345:
                    this.f27197 = (TextView) view2;
                    if (C2167.f7158 >= 0) {
                        m2566 = C2105.m6981("ۤᩴ") ^ i6;
                        i8 = ((m2566 ^ i5) * (-7317)) ^ 1879690381;
                        i9 = 747064292;
                    } else {
                        m2566 = C0630.m2566("ܺ֨") ^ i5;
                        i8 = ((m2566 ^ i6) * (-22069)) ^ (-1380326286);
                        i9 = 1217388616;
                    }
                case -1344075425:
                case -234542435:
                    this.f27195 = (C2978) C1005.m3507(view, i);
                    C2126.m7039(view, this);
                    return;
                case -1315020307:
                case -1105646165:
                    view2 = C11340.m28028(view, R.id.summary);
                    if (C0237.f1507 != 0) {
                        m2566 = (i5 - C0630.m2566("ۙۜ")) * 35;
                        i8 = ((m2566 ^ i6) * 24043) ^ (-1146795909);
                        i9 = -47147505;
                    } else {
                        m2566 = C0630.m2566("ۖܺ") ^ i5;
                        i8 = ((m2566 ^ i6) * 23085) ^ 1019270284;
                        i9 = -1635109810;
                    }
                case -1288864750:
                case 1779620415:
                    callback = C11340.m28028(view, R.id.title);
                    if (C0382.f1805) {
                        m2566 = C2105.m6981("᩶ۛ") ^ i6;
                        i8 = ((m2566 ^ i5) * (-12281)) ^ (-2103716142);
                        i9 = 1300899421;
                    } else {
                        m2566 = C2105.m6981("᩷ᩴ") ^ i5;
                        i8 = ((m2566 ^ i6) * (-12853)) ^ (-970021030);
                        i9 = -2016366001;
                    }
                case -1272309587:
                case 949775583:
                    sArr = f27192;
                    if (C4263.f13799 <= 0) {
                        m2566 = (i5 - C0630.m2566("ۙۜ")) * 35;
                        i8 = ((m2566 ^ i6) * 24043) ^ (-1146795909);
                        i9 = -47147505;
                    } else {
                        m2566 = C0630.m2566("᩵᩺") ^ i6;
                        i8 = ((m2566 ^ i5) * 11735) ^ (-417990669);
                        i9 = 2118821105;
                    }
                case -1039400685:
                case 1672012926:
                    str = C2520.m8030(sArr, i3, 3, i7);
                    if (C1294.m4372() <= 0) {
                        m2566 = C2105.m6981("ۤᩴ") ^ i6;
                        i8 = ((m2566 ^ i5) * (-7317)) ^ 1879690381;
                        i9 = 747064292;
                    } else {
                        m2566 = C0630.m2566("۟᩸") ^ i6;
                        i8 = ((m2566 ^ i5) * (-27735)) ^ (-1163705901);
                        i9 = -1496225162;
                    }
                case -781801485:
                case -376248486:
                    C1916.m6308();
                    m2566 = C2105.m6981("᩷ᩴ") ^ i5;
                    i8 = ((m2566 ^ i6) * (-12853)) ^ (-970021030);
                    i9 = -2016366001;
                case -419041153:
                case 412132017:
                    i3 = 1;
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = C2105.m6981("ۤᩴ") ^ i6;
                        i8 = ((m2566 ^ i5) * (-7317)) ^ 1879690381;
                        i9 = 747064292;
                    } else {
                        m2566 = C0630.m2566("᩸۠") ^ i5;
                        i8 = ((m2566 ^ i6) * (-32157)) ^ (-1486452737);
                        i9 = 1051338544;
                    }
                case -100895204:
                case 2073796911:
                    this.f27193 = textView;
                    if (C21923.f70183 != 0) {
                        m2566 = (C0630.m2566("ܽᩳ") ^ i6) * 5;
                        i8 = ((m2566 ^ i5) * (-12529)) ^ (-2015749891);
                        i9 = -811391013;
                    } else {
                        m2566 = (C0630.m2566("ܶۧ") + i6) * 11;
                        i8 = ((m2566 ^ i5) * 5451) ^ (-1374842699);
                        i9 = -620861089;
                    }
                case -74573154:
                case 1859836208:
                    i = 2128466576 ^ i2;
                    if (C1047.f3863 >= 0) {
                        m2566 = C2105.m6981("᩷ᩴ") ^ i5;
                        i8 = ((m2566 ^ i6) * (-12853)) ^ (-970021030);
                        i9 = -2016366001;
                    } else {
                        m2566 = (C0630.m2566("۟ᩴ") ^ i6) * (-33);
                        i8 = ((m2566 ^ i5) * (-19509)) ^ 957012747;
                        i9 = 303197999;
                    }
                case -49645950:
                case 726685085:
                    textView = (TextView) callback;
                    if (C0798.f2919) {
                        m2566 = (C0630.m2566("ܽᩳ") ^ i6) * 5;
                        i8 = ((m2566 ^ i5) * (-12529)) ^ (-2015749891);
                        i9 = -811391013;
                    } else {
                        m2566 = C0630.m2566("۠۫") ^ i5;
                        i8 = ((m2566 ^ i6) * 3347) ^ 1214009100;
                        i9 = -2025955217;
                    }
                case 441634579:
                case 2001050999:
                    ViewOnClickListenerC1958.m6429();
                    if (C3683.f11629 >= 0) {
                        m2566 = C2105.m6981("᩷ᩴ") ^ i5;
                        i8 = ((m2566 ^ i6) * (-12853)) ^ (-970021030);
                        i9 = -2016366001;
                    } else {
                        m2566 = (C2105.m6981("᩸ܺ") + i6) * 59;
                        i8 = ((m2566 ^ i5) * 29157) ^ (-1579306521);
                        i9 = 1706309006;
                    }
                case 1225129974:
                case 1247736593:
                    C2520.m8026();
                    if (C5695.f17556 < 0) {
                        m2566 = (i5 - C0630.m2566("ۙۜ")) * 35;
                        i8 = ((m2566 ^ i6) * 24043) ^ (-1146795909);
                        i9 = -47147505;
                    } else {
                        m2566 = (C0630.m2566("ܽᩳ") ^ i6) * 5;
                        i8 = ((m2566 ^ i5) * (-12529)) ^ (-2015749891);
                        i9 = -811391013;
                    }
                default:
                    if (C22628.f73083 > 0) {
                        m2566 = C2105.m6981("᩷ᩴ") ^ i5;
                        i8 = ((m2566 ^ i6) * (-12853)) ^ (-970021030);
                        i9 = -2016366001;
                    } else {
                        m2566 = (i5 - C0630.m2566("ۙۜ")) * 35;
                        i8 = ((m2566 ^ i6) * 24043) ^ (-1146795909);
                        i9 = -47147505;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m23069(ViewOnClickListenerC8949 viewOnClickListenerC8949, List list, String str, C1668 c1668, C17979 c17979, DialogInterface dialogInterface, int i) {
        SharedPreferences sharedPreferences;
        C10841 c10841 = null;
        String str2 = null;
        CharSequence charSequence = null;
        int i2 = 2123344464;
        int i3 = C3911.f12484;
        int i4 = C1773.f6144;
        int m6981 = (C2105.m6981("᩹ۨ") + i3) * (-37);
        int i5 = ((m6981 ^ i4) * 13421) ^ (-1380906697);
        int i6 = 1702993146;
        while (true) {
            i2 = ((((i2 ^ i4) * (-20395)) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -1981722557:
                case -742011007:
                    if (C1504.m5179()) {
                        m6981 = (i4 - C0630.m2566("ۢᩴ")) * 109;
                        i5 = ((m6981 ^ i3) * 27779) ^ 535548178;
                        i6 = 43429468;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۙ᩸")) * 29;
                        i5 = ((m6981 ^ i4) * (-21281)) ^ (-1123256588);
                        i6 = -815198529;
                    }
                case -1810950683:
                case -19237983:
                    break;
                case -1452115718:
                case 130346552:
                    if (C3245.f10203 <= 0) {
                        m6981 = C0630.m2566("ۛۚ") ^ i4;
                        i5 = ((m6981 ^ i3) * 30237) ^ 1316119404;
                        i6 = -1237015016;
                    } else {
                        m6981 = C0630.m2566("᩵ۨ") ^ i4;
                        i5 = ((m6981 ^ i3) * 12437) ^ 1794603249;
                        i6 = 278215286;
                    }
                case -1382065796:
                case 549367920:
                    C1047.m3601(viewOnClickListenerC8949.f27197, charSequence);
                    viewOnClickListenerC8949.m23071(c17979, viewOnClickListenerC8949.f27196, str2);
                    m6981 = (i3 - C0630.m2566("ۜۖ")) * 67;
                    i5 = ((m6981 ^ i4) * 14227) ^ 970811233;
                    i6 = -1813777104;
                case -1348743785:
                case -902426516:
                    ServiceConnectionC3453.m10564();
                    C2167.m7155();
                    break;
                case -1332206497:
                case 711838334:
                    if (C1773.f6144 <= 0) {
                        m6981 = C0630.m2566("ۛۚ") ^ i4;
                        i5 = ((m6981 ^ i3) * 30237) ^ 1316119404;
                        i6 = -1237015016;
                    } else {
                        m6981 = C2105.m6981("ۛ᩻") ^ i3;
                        i5 = ((m6981 ^ i4) * 14945) ^ 1984421366;
                        i6 = -391380755;
                    }
                case -1082695025:
                case 1189060109:
                    if (C0382.m1848()) {
                        m6981 = C2105.m6981("۠ܶ") ^ i4;
                        i5 = ((m6981 ^ i3) * 23693) ^ (-895959317);
                        i6 = 2050434158;
                    } else {
                        m6981 = C0630.m2566("ܽ۬") ^ i3;
                        i5 = ((m6981 ^ i4) * 16137) ^ 404729176;
                        i6 = -1052022910;
                    }
                case -1039996524:
                case 1418369486:
                    C0798.m2998();
                    if (C3663.m11168() < 0) {
                        m6981 = (i3 - C2105.m6981("ۨᩴ")) * 83;
                        i5 = ((m6981 ^ i4) * 28593) ^ (-202292106);
                        i6 = 1959565052;
                    } else {
                        m6981 = (i4 - C2105.m6981("֫۟")) * 123;
                        i5 = ((m6981 ^ i3) * 9619) ^ 595887075;
                        i6 = -1309107813;
                    }
                case -986546250:
                case 104335283:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = (i3 - C2105.m6981("ۨᩴ")) * 83;
                        i5 = ((m6981 ^ i4) * 28593) ^ (-202292106);
                        i6 = 1959565052;
                    } else {
                        m6981 = (C0630.m2566("ܺۡ") + i3) * 69;
                        i5 = ((m6981 ^ i4) * 32585) ^ 565568680;
                        i6 = -390942611;
                    }
                case -983645811:
                case -272135977:
                    C4159.m12565();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = (i3 - C2105.m6981("ۨᩴ")) * 83;
                        i5 = ((m6981 ^ i4) * 28593) ^ (-202292106);
                        i6 = 1959565052;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۙ᩸")) * 29;
                        i5 = ((m6981 ^ i4) * (-21281)) ^ (-1123256588);
                        i6 = -815198529;
                    }
                case -777990598:
                case 1174706874:
                    sharedPreferences = viewOnClickListenerC8949.f27194.f59398;
                    sharedPreferences.edit().putString(c1668.f24119, str2).apply();
                    CharSequence charSequence2 = c10841.f32591;
                    if (charSequence2 == null) {
                        m6981 = C2105.m6981("ᩳܳ") ^ i4;
                        i5 = ((m6981 ^ i3) * 23219) ^ 1291432187;
                        i6 = -1009415186;
                    } else {
                        charSequence = charSequence2;
                        m6981 = (C2105.m6981("᩸ۤ") + i3) * (-109);
                        i5 = ((m6981 ^ i4) * (-30521)) ^ 772213775;
                        i6 = 41362799;
                    }
                case -458606840:
                case 745516121:
                    if (C4159.f13567) {
                        m6981 = (C0630.m2566("ܰۜ") ^ i3) * (-83);
                        i5 = ((m6981 ^ i4) * (-26101)) ^ 364761267;
                        i6 = -1923746817;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۙ᩸")) * 29;
                        i5 = ((m6981 ^ i4) * (-21281)) ^ (-1123256588);
                        i6 = -815198529;
                    }
                case -389461503:
                case 904062285:
                    AbstractC2021.m6574();
                    if (C0050.f910 >= 0) {
                        m6981 = (i3 - C2105.m6981("ۨᩴ")) * 83;
                        i5 = ((m6981 ^ i4) * 28593) ^ (-202292106);
                        i6 = 1959565052;
                    } else {
                        m6981 = C0630.m2566("ۛۚ") ^ i4;
                        i5 = ((m6981 ^ i3) * 30237) ^ 1316119404;
                        i6 = -1237015016;
                    }
                case -311701192:
                case 1453894554:
                    charSequence = c1668.f24120;
                    m6981 = (C2105.m6981("᩸ۤ") + i3) * (-109);
                    i5 = ((m6981 ^ i4) * (-30521)) ^ 772213775;
                    i6 = 41362799;
                case 49328647:
                case 423134434:
                    if (C0483.m2121()) {
                        m6981 = C0630.m2566("ۡ֨") ^ i4;
                        i5 = ((m6981 ^ i3) * (-4145)) ^ 652631069;
                        i6 = 80769391;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۙ᩸")) * 29;
                        i5 = ((m6981 ^ i4) * (-21281)) ^ (-1123256588);
                        i6 = -815198529;
                    }
                case 240110072:
                case 640251917:
                    if (C7106.f21815 != 0) {
                        m6981 = (i4 - C2105.m6981("֫۟")) * 123;
                        i5 = ((m6981 ^ i3) * 9619) ^ 595887075;
                        i6 = -1309107813;
                    } else {
                        m6981 = C0630.m2566("ܳᩴ") ^ i4;
                        i5 = ((m6981 ^ i3) * 7869) ^ (-241775048);
                        i6 = -1848968488;
                    }
                case 665364184:
                case 1802170764:
                    dialogInterface.dismiss();
                    c10841 = (C10841) C22628.m50605(list, i);
                    str2 = c10841.f32592;
                    if (C19893.m45753(str, str2)) {
                        m6981 = (i3 - C0630.m2566("ۜۖ")) * 67;
                        i5 = ((m6981 ^ i4) * 14227) ^ 970811233;
                        i6 = -1813777104;
                    } else {
                        m6981 = C0630.m2566("ۛ᩸") ^ i4;
                        i5 = ((m6981 ^ i3) * 20699) ^ 1785747498;
                        i6 = -14859983;
                    }
                case 1043030163:
                case 1896525778:
                    if (C4075.f12947 >= 0) {
                        m6981 = (i4 - C2105.m6981("֫۟")) * 123;
                        i5 = ((m6981 ^ i3) * 9619) ^ 595887075;
                        i6 = -1309107813;
                    } else {
                        m6981 = C2105.m6981("ܽ᩷") ^ i4;
                        i5 = ((m6981 ^ i3) * 10547) ^ 751169818;
                        i6 = 1095394823;
                    }
                case 1411374954:
                case 1878523179:
                    if (C7811.f24123 >= 0) {
                        m6981 = C2105.m6981("۠ܶ") ^ i4;
                        i5 = ((m6981 ^ i3) * 23693) ^ (-895959317);
                        i6 = 2050434158;
                    } else {
                        m6981 = (C2105.m6981("ۙᩴ") + i3) * 11;
                        i5 = ((m6981 ^ i4) * 23983) ^ 774188031;
                        i6 = -381921545;
                    }
                default:
                    C21923.m49329();
                    m6981 = (i3 - C2105.m6981("ۨᩴ")) * 83;
                    i5 = ((m6981 ^ i4) * 28593) ^ (-202292106);
                    i6 = 1959565052;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23072(AbstractC7809 abstractC7809) {
        CharSequence charSequence;
        String str;
        PluginContext pluginContext;
        String str2;
        String str3;
        int i;
        PluginContext pluginContext2;
        Exception exc;
        StringBuilder sb;
        StringBuilder sb2;
        C16484 c16484;
        int i2;
        PluginContext pluginContext3;
        C1668 c1668;
        CharSequence charSequence2;
        C23331 c23331;
        String str4;
        int i3;
        int i4;
        CharSequence charSequence3;
        String str5;
        String str6;
        int i5;
        PluginContext pluginContext4;
        boolean z;
        Exception exc2;
        C2978 c2978;
        C16484 c164842;
        PluginContext pluginContext5;
        C1668 c16682;
        CharSequence charSequence4;
        C23331 c233312;
        String str7;
        int m6981;
        int i6;
        int i7;
        C1668 c16683;
        String str8;
        CharSequence charSequence5;
        String str9;
        PluginContext pluginContext6;
        Exception exc3;
        C16484 c164843;
        CharSequence charSequence6;
        C23331 c233313;
        int m2566;
        int i8;
        int i9;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        String str10;
        CharSequence charSequence7;
        String str11;
        String str12;
        PluginContext pluginContext7;
        Exception exc4;
        StringBuilder sb3;
        C23331 c233314;
        String str13;
        StringBuilder sb4;
        int i10;
        PluginContext pluginContext8;
        int m25662;
        C16484 c164844;
        int i11;
        int i12;
        PluginContext pluginContext9;
        CharSequence charSequence8;
        PluginContext pluginContext10;
        C23331 c233315;
        String str14;
        StringBuilder sb5;
        Exception exc5;
        C16484 c164845;
        StringBuilder sb6;
        PluginContext pluginContext11;
        CharSequence charSequence9;
        int m69812;
        int i13;
        int i14;
        CharSequence charSequence10;
        String str15;
        PluginContext pluginContext12;
        String str16;
        String str17;
        int i15;
        PluginContext pluginContext13;
        int i16;
        Exception exc6;
        StringBuilder sb7;
        short s;
        StringBuilder sb8;
        C16484 c164846;
        int i17;
        PluginContext pluginContext14;
        C1668 c16684;
        CharSequence charSequence11;
        C23331 c233316;
        String str18;
        C2978 c29782;
        View view;
        boolean z2;
        int m25663;
        int i18;
        int i19;
        CharSequence charSequence12;
        String str19;
        String str20;
        int i20;
        PluginContext pluginContext15;
        int i21;
        Exception exc7;
        C16484 c164847;
        String str21;
        int m25664;
        int i22;
        int i23;
        CharSequence charSequence13;
        String str22;
        String str23;
        PluginContext pluginContext16;
        int i24;
        Exception exc8;
        C16484 c164848;
        C23331 c233317;
        String str24;
        CharSequence charSequence14;
        String str25;
        int i25;
        PluginContext pluginContext17;
        Exception exc9;
        C16484 c164849;
        CharSequence charSequence15;
        C23331 c233318;
        String str26;
        int m25665;
        int i26;
        int i27;
        boolean z3;
        PluginContext pluginContext18;
        C23331 c233319;
        String str27;
        StringBuilder sb9;
        String str28;
        StringBuilder sb10;
        PluginContext pluginContext19;
        CharSequence charSequence16;
        int m25666;
        int i28;
        int i29;
        SharedPreferences sharedPreferences3;
        Exception exc10;
        String str29;
        int m25667;
        int i30;
        int i31;
        PluginContext pluginContext20;
        CharSequence charSequence17;
        String str30 = null;
        String str31 = null;
        CharSequence charSequence18 = null;
        Iterator it = null;
        CharSequence charSequence19 = null;
        short[] sArr = null;
        char c = 0;
        short s2 = 0;
        int i32 = 1792383980;
        int i33 = C22628.f73083;
        int i34 = C3683.f11629;
        int m25668 = C0630.m2566("ۖ᩸") ^ i34;
        int i35 = ((m25668 ^ i33) * 25499) ^ (-287437157);
        int i36 = m25668 ^ 256453516;
        C23331 c2333110 = null;
        C1668 c16685 = null;
        String str32 = null;
        PluginContext pluginContext21 = null;
        String str33 = null;
        CharSequence charSequence20 = null;
        C2978 c29783 = null;
        short s3 = 0;
        int i37 = 0;
        CharSequence charSequence21 = null;
        StringBuilder sb11 = null;
        PluginContext pluginContext22 = null;
        StringBuilder sb12 = null;
        String str34 = null;
        C10841 c10841 = null;
        int i38 = 0;
        String str35 = null;
        CharSequence charSequence22 = null;
        Exception exc11 = null;
        PluginContext pluginContext23 = null;
        Exception exc12 = null;
        boolean z4 = false;
        View view2 = null;
        int[] iArr = null;
        String str36 = null;
        StringBuilder sb13 = null;
        TextView textView = null;
        CharSequence charSequence23 = null;
        Exception exc13 = null;
        boolean z5 = false;
        int i39 = 0;
        TextView textView2 = null;
        C16484 c1648410 = null;
        int i40 = 0;
        ActivityC18827 activityC18827 = null;
        CharSequence charSequence24 = null;
        while (true) {
            i32 = i36 ^ (i35 & (((i32 ^ i33) * 31165) >> 31));
            switch (i32) {
                case -2129824333:
                case -1397725441:
                    try {
                        str29 = c16685.f5838;
                        exc10 = exc13;
                        str3 = str35;
                        pluginContext6 = pluginContext21;
                        c233313 = c2333110;
                        StringBuilder sb14 = sb12;
                        sb2 = sb13;
                        pluginContext11 = pluginContext22;
                        str2 = str34;
                        sb = sb14;
                        int m25669 = C0630.m2566("۬ܺ") ^ i33;
                        str8 = str29;
                        i35 = ((m25669 ^ i34) * 21753) ^ (-29886657);
                        i36 = m25669 ^ 79887713;
                        exc13 = exc10;
                        str32 = str8;
                        c2333110 = c233313;
                        pluginContext21 = pluginContext6;
                        str35 = str3;
                        String str37 = str2;
                        pluginContext22 = pluginContext11;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str37;
                    } catch (Exception e) {
                        exc13 = e;
                        charSequence5 = charSequence20;
                        str9 = str36;
                        pluginContext = pluginContext22;
                        str2 = str34;
                        str3 = str35;
                        pluginContext6 = pluginContext21;
                        exc3 = exc11;
                        sb = sb12;
                        c233313 = c2333110;
                        str8 = str32;
                        sb2 = sb13;
                        c164843 = c1648410;
                        i2 = i39;
                        pluginContext5 = pluginContext23;
                        c16683 = c16685;
                        charSequence6 = charSequence23;
                        m2566 = C2105.m6981("֫ۤ") ^ i34;
                        i8 = ((m2566 ^ i33) * 21851) ^ (-1501411913);
                        i9 = 770639270;
                        i36 = m2566 ^ i9;
                        charSequence23 = charSequence6;
                        i35 = i8;
                        c1648410 = c164843;
                        c16685 = c16683;
                        exc11 = exc3;
                        str32 = str8;
                        c2333110 = c233313;
                        str36 = str9;
                        pluginContext23 = pluginContext5;
                        pluginContext21 = pluginContext6;
                        charSequence20 = charSequence5;
                        i39 = i2;
                        str35 = str3;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    }
                case -2065846686:
                case -867590764:
                    charSequence7 = charSequence20;
                    str11 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str12 = str35;
                    pluginContext7 = pluginContext21;
                    exc4 = exc11;
                    sb3 = sb12;
                    c233314 = c2333110;
                    str13 = str32;
                    sb4 = sb13;
                    i10 = i39;
                    pluginContext8 = pluginContext23;
                    m25662 = C0630.m2566("ܽ۟") ^ i33;
                    c164844 = (C16484) abstractC7809;
                    i11 = ((m25662 ^ i34) * 615) ^ (-1576856203);
                    i12 = 217488749;
                    i36 = m25662 ^ i12;
                    i35 = i11;
                    pluginContext23 = pluginContext8;
                    c1648410 = c164844;
                    exc11 = exc4;
                    str32 = str13;
                    c2333110 = c233314;
                    i39 = i10;
                    str36 = str11;
                    sb13 = sb4;
                    sb12 = sb3;
                    pluginContext21 = pluginContext7;
                    charSequence20 = charSequence7;
                    str35 = str12;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case -2061552461:
                case -92283141:
                    C1420.m4913();
                    C0630.m2564();
                    charSequence3 = charSequence20;
                    str5 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str6 = str35;
                    i5 = i37;
                    pluginContext4 = pluginContext21;
                    z = z4;
                    exc2 = exc11;
                    sb = sb12;
                    c2978 = c29783;
                    sb2 = sb13;
                    c164842 = c1648410;
                    i2 = i39;
                    pluginContext5 = pluginContext23;
                    c16682 = c16685;
                    charSequence4 = charSequence23;
                    c233312 = c2333110;
                    str7 = str32;
                    m6981 = (i33 - C2105.m6981("ۡۛ")) * (-115);
                    i6 = ((m6981 ^ i34) * 4591) ^ 1930433084;
                    i7 = 578103365;
                    c1648410 = c164842;
                    exc11 = exc2;
                    str32 = str7;
                    i37 = i5;
                    i36 = m6981 ^ i7;
                    i35 = i6;
                    str36 = str5;
                    c29783 = c2978;
                    c2333110 = c233312;
                    charSequence20 = charSequence3;
                    z4 = z;
                    charSequence23 = charSequence4;
                    c16685 = c16682;
                    pluginContext21 = pluginContext4;
                    str35 = str6;
                    pluginContext23 = pluginContext5;
                    i39 = i2;
                    sb13 = sb2;
                    sb12 = sb;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case -1848127779:
                case 37800374:
                    it = C4117.m12354(c16685.f5839);
                    m69812 = C0630.m2566("ۙᩴ") ^ i34;
                    i13 = ((m69812 ^ i33) * 11757) ^ 1762725137;
                    i14 = 870217667;
                    i36 = m69812 ^ i14;
                    i35 = i13;
                case -1799425414:
                case -1554853495:
                    C1420.m4905(sb13, str33);
                    pluginContext21.log(C0422.m1959(sb13), exc12);
                    z5 = c1648410.f50674;
                    charSequence16 = charSequence20;
                    pluginContext19 = pluginContext22;
                    str28 = str34;
                    str3 = str35;
                    pluginContext18 = pluginContext21;
                    sb10 = sb12;
                    c233319 = c2333110;
                    str27 = str32;
                    sb9 = sb13;
                    m25666 = C0630.m2566("ᩴ۫") ^ i33;
                    i28 = ((m25666 ^ i34) * (-17227)) ^ (-1850517942);
                    i29 = -251038469;
                    i36 = m25666 ^ i29;
                    i35 = i28;
                    sb13 = sb9;
                    sb12 = sb10;
                    str32 = str27;
                    charSequence20 = charSequence16;
                    c2333110 = c233319;
                    str34 = str28;
                    pluginContext21 = pluginContext18;
                    pluginContext22 = pluginContext19;
                    str35 = str3;
                case -1749541463:
                case -282735918:
                    charSequence3 = charSequence20;
                    str5 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str6 = str35;
                    i5 = i37;
                    pluginContext4 = pluginContext21;
                    z = z4;
                    exc2 = exc11;
                    sb = sb12;
                    sb2 = sb13;
                    c164842 = c1648410;
                    i2 = i39;
                    pluginContext5 = pluginContext23;
                    c16682 = c16685;
                    charSequence4 = charSequence23;
                    c233312 = c2333110;
                    str7 = str32;
                    C22628.m50613(c29783, z);
                    iArr = C17415.f53263;
                    if (C3663.m11168() >= 0) {
                        m6981 = (C0630.m2566("۠ᩴ") + i34) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        c2978 = c29783;
                        i6 = ((m6981 ^ i33) * 24363) ^ (-1692636781);
                        i7 = 993365723;
                    } else {
                        c2978 = c29783;
                        m6981 = (C0630.m2566("֡ۘ") ^ i34) * (-41);
                        i6 = ((m6981 ^ i33) * (-19503)) ^ 565986169;
                        i7 = -114221953;
                    }
                    c1648410 = c164842;
                    exc11 = exc2;
                    str32 = str7;
                    i37 = i5;
                    i36 = m6981 ^ i7;
                    i35 = i6;
                    str36 = str5;
                    c29783 = c2978;
                    c2333110 = c233312;
                    charSequence20 = charSequence3;
                    z4 = z;
                    charSequence23 = charSequence4;
                    c16685 = c16682;
                    pluginContext21 = pluginContext4;
                    str35 = str6;
                    pluginContext23 = pluginContext5;
                    i39 = i2;
                    sb13 = sb2;
                    sb12 = sb;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case -1727806694:
                case 1650186507:
                    charSequence17 = c1648410.f50675;
                    charSequence19 = charSequence17;
                    m69812 = C0630.m2566("ᩳᩳ") ^ i33;
                    i13 = ((m69812 ^ i34) * (-23301)) ^ 1094528777;
                    i14 = -415830184;
                    i36 = m69812 ^ i14;
                    i35 = i13;
                case -1697072657:
                case 91514490:
                    str3 = str35;
                    pluginContext6 = pluginContext21;
                    c233313 = c2333110;
                    str8 = str32;
                    Exception exc14 = exc13;
                    StringBuilder sb15 = sb12;
                    sb2 = sb13;
                    pluginContext11 = pluginContext22;
                    str2 = str34;
                    sb = sb15;
                    if (str30 == null) {
                        int m69813 = (i34 - C2105.m6981("ܺ᩺")) * (-69);
                        exc13 = exc14;
                        i36 = m69813 ^ (-1046667423);
                        i35 = ((m69813 ^ i33) * 16165) ^ (-192522048);
                        str32 = str8;
                        c2333110 = c233313;
                        pluginContext21 = pluginContext6;
                        str35 = str3;
                        String str372 = str2;
                        pluginContext22 = pluginContext11;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str372;
                    } else {
                        exc13 = exc14;
                        charSequence9 = str30;
                        charSequence21 = charSequence9;
                        pluginContext = pluginContext11;
                        charSequence5 = charSequence20;
                        i2 = i39;
                        pluginContext5 = pluginContext23;
                        str9 = str36;
                        c16683 = c16685;
                        charSequence6 = charSequence23;
                        exc3 = exc11;
                        c164843 = c1648410;
                        m2566 = C0630.m2566("᩶ۤ") ^ i34;
                        i8 = ((m2566 ^ i33) * (-9413)) ^ (-1500276379);
                        i9 = 820941687;
                        i36 = m2566 ^ i9;
                        charSequence23 = charSequence6;
                        i35 = i8;
                        c1648410 = c164843;
                        c16685 = c16683;
                        exc11 = exc3;
                        str32 = str8;
                        c2333110 = c233313;
                        str36 = str9;
                        pluginContext23 = pluginContext5;
                        pluginContext21 = pluginContext6;
                        charSequence20 = charSequence5;
                        i39 = i2;
                        str35 = str3;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    }
                case -1586825634:
                case -236424816:
                    str8 = str32;
                    charSequence5 = charSequence20;
                    str9 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str3 = str35;
                    pluginContext6 = pluginContext21;
                    exc3 = exc11;
                    sb = sb12;
                    sb2 = sb13;
                    c164843 = c1648410;
                    i2 = i39;
                    pluginContext5 = pluginContext23;
                    c16683 = c16685;
                    charSequence6 = charSequence23;
                    C23331 c2333111 = (C23331) abstractC7809;
                    RunnableC1937.m6377(textView2, c2333111.f24118);
                    if (c2333111.f74989) {
                        int m69814 = (i34 - C2105.m6981("ۨ֡")) * (-17);
                        int i41 = ((m69814 ^ i33) * 11975) ^ 1037283707;
                        i36 = m69814 ^ 2117694899;
                        charSequence23 = charSequence6;
                        c16685 = c16683;
                        str32 = str8;
                        pluginContext21 = pluginContext6;
                        c2333110 = c2333111;
                        i35 = i41;
                        str35 = str3;
                        pluginContext23 = pluginContext5;
                        c1648410 = c164843;
                        exc11 = exc3;
                        i39 = i2;
                        str36 = str9;
                        sb13 = sb2;
                        sb12 = sb;
                        charSequence20 = charSequence5;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    } else {
                        c233313 = c2333111;
                        charSequence21 = charSequence6;
                        m2566 = C0630.m2566("᩶ۤ") ^ i34;
                        i8 = ((m2566 ^ i33) * (-9413)) ^ (-1500276379);
                        i9 = 820941687;
                        i36 = m2566 ^ i9;
                        charSequence23 = charSequence6;
                        i35 = i8;
                        c1648410 = c164843;
                        c16685 = c16683;
                        exc11 = exc3;
                        str32 = str8;
                        c2333110 = c233313;
                        str36 = str9;
                        pluginContext23 = pluginContext5;
                        pluginContext21 = pluginContext6;
                        charSequence20 = charSequence5;
                        i39 = i2;
                        str35 = str3;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    }
                case -1512304718:
                case 453507414:
                    charSequence5 = charSequence20;
                    str9 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str3 = str35;
                    pluginContext6 = pluginContext21;
                    exc3 = exc11;
                    sb = sb12;
                    c233313 = c2333110;
                    str8 = str32;
                    sb2 = sb13;
                    c164843 = c1648410;
                    i2 = i39;
                    pluginContext5 = pluginContext23;
                    c16683 = c16685;
                    charSequence6 = charSequence23;
                    if (C4075.m12247(charSequence21) != 0) {
                        charSequence22 = charSequence21;
                        m2566 = (C0630.m2566("ۛۤ") + i34) * 79;
                        i8 = ((m2566 ^ i33) * (-11241)) ^ (-727886056);
                        i9 = -2086036371;
                        i36 = m2566 ^ i9;
                        charSequence23 = charSequence6;
                        i35 = i8;
                        c1648410 = c164843;
                        c16685 = c16683;
                        exc11 = exc3;
                        str32 = str8;
                        c2333110 = c233313;
                        str36 = str9;
                        pluginContext23 = pluginContext5;
                        pluginContext21 = pluginContext6;
                        charSequence20 = charSequence5;
                        i39 = i2;
                        str35 = str3;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    }
                    m2566 = (i34 - C0630.m2566("ۚ۠")) * 93;
                    i8 = ((m2566 ^ i33) * 8589) ^ (-420734162);
                    i9 = -1633997835;
                    i36 = m2566 ^ i9;
                    charSequence23 = charSequence6;
                    i35 = i8;
                    c1648410 = c164843;
                    c16685 = c16683;
                    exc11 = exc3;
                    str32 = str8;
                    c2333110 = c233313;
                    str36 = str9;
                    pluginContext23 = pluginContext5;
                    pluginContext21 = pluginContext6;
                    charSequence20 = charSequence5;
                    i39 = i2;
                    str35 = str3;
                    sb13 = sb2;
                    sb12 = sb;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case -1400439200:
                case -950918278:
                    charSequence5 = charSequence20;
                    str9 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str3 = str35;
                    pluginContext6 = pluginContext21;
                    sb = sb12;
                    c233313 = c2333110;
                    str8 = str32;
                    sb2 = sb13;
                    StringBuilder sb16 = sb11;
                    C1420.m4905(sb16, str9);
                    String m1959 = C0422.m1959(sb16);
                    Exception exc15 = exc11;
                    c164843 = c1648410;
                    PluginContext pluginContext24 = pluginContext23;
                    pluginContext24.log(m1959, exc15);
                    charSequence21 = c233313.f74986;
                    c16683 = c16685;
                    exc3 = exc15;
                    charSequence6 = charSequence23;
                    i2 = i39;
                    pluginContext5 = pluginContext24;
                    m2566 = C0630.m2566("᩶ۤ") ^ i34;
                    i8 = ((m2566 ^ i33) * (-9413)) ^ (-1500276379);
                    i9 = 820941687;
                    i36 = m2566 ^ i9;
                    charSequence23 = charSequence6;
                    i35 = i8;
                    c1648410 = c164843;
                    c16685 = c16683;
                    exc11 = exc3;
                    str32 = str8;
                    c2333110 = c233313;
                    str36 = str9;
                    pluginContext23 = pluginContext5;
                    pluginContext21 = pluginContext6;
                    charSequence20 = charSequence5;
                    i39 = i2;
                    str35 = str3;
                    sb13 = sb2;
                    sb12 = sb;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case -1348286351:
                case -679143140:
                    RunnableC1937.m6377(textView2, c1648410.f24118);
                    C1047.m3601(textView, charSequence24);
                    C0964.m3401(c29783, z5);
                    charSequence7 = charSequence20;
                    str11 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str12 = str35;
                    pluginContext7 = pluginContext21;
                    exc4 = exc11;
                    sb3 = sb12;
                    c233314 = c2333110;
                    str13 = str32;
                    sb4 = sb13;
                    c164844 = c1648410;
                    i10 = i39;
                    pluginContext9 = pluginContext23;
                    m25662 = (C2105.m6981("᩻ᩳ") + i34) * (-63);
                    pluginContext8 = pluginContext9;
                    i11 = ((m25662 ^ i33) * (-23321)) ^ (-1102113722);
                    i12 = 865890135;
                    i36 = m25662 ^ i12;
                    i35 = i11;
                    pluginContext23 = pluginContext8;
                    c1648410 = c164844;
                    exc11 = exc4;
                    str32 = str13;
                    c2333110 = c233314;
                    i39 = i10;
                    str36 = str11;
                    sb13 = sb4;
                    sb12 = sb3;
                    pluginContext21 = pluginContext7;
                    charSequence20 = charSequence7;
                    str35 = str12;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case -1333480396:
                case 765801937:
                    charSequence = charSequence20;
                    str = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str3 = str35;
                    i = i37;
                    pluginContext2 = pluginContext21;
                    exc = exc11;
                    sb = sb12;
                    sb2 = sb13;
                    c16484 = c1648410;
                    i2 = i39;
                    pluginContext3 = pluginContext23;
                    c1668 = c16685;
                    charSequence2 = charSequence23;
                    c23331 = c2333110;
                    str4 = str32;
                    c29783 = this.f27195;
                    i3 = i40;
                    C3746.m11360(c29783, i3);
                    boolean z6 = abstractC7809.f24116;
                    View view3 = this.itemView;
                    if (C1916.f6442) {
                        int m69815 = C2105.m6981("ܶۨ") ^ i34;
                        i35 = ((m69815 ^ i33) * 13675) ^ 1380576803;
                        c1648410 = c16484;
                        exc11 = exc;
                        str32 = str4;
                        i37 = i;
                        str36 = str;
                        i36 = m69815 ^ 955730966;
                        view2 = view3;
                        c2333110 = c23331;
                        charSequence20 = charSequence;
                        charSequence23 = charSequence2;
                        z4 = z6;
                        c16685 = c1668;
                        i40 = i3;
                        pluginContext23 = pluginContext3;
                        pluginContext21 = pluginContext2;
                        i39 = i2;
                        str35 = str3;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    } else {
                        view2 = view3;
                        i4 = i2;
                        z4 = z6;
                        int m69816 = C2105.m6981("ۤ۠") ^ i34;
                        int i42 = i4;
                        i35 = ((m69816 ^ i33) * 11089) ^ (-969075621);
                        c1648410 = c16484;
                        exc11 = exc;
                        str32 = str4;
                        i37 = i;
                        i36 = m69816 ^ (-505560537);
                        str36 = str;
                        c2333110 = c23331;
                        sb13 = sb2;
                        sb12 = sb;
                        charSequence20 = charSequence;
                        charSequence23 = charSequence2;
                        c16685 = c1668;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                        pluginContext23 = pluginContext3;
                        i39 = i42;
                        i40 = i3;
                        pluginContext21 = pluginContext2;
                        str35 = str3;
                    }
                case -1270271528:
                case 1268441438:
                    charSequence5 = charSequence20;
                    str9 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str3 = str35;
                    pluginContext6 = pluginContext21;
                    exc3 = exc11;
                    sb = sb12;
                    c233313 = c2333110;
                    str8 = str32;
                    sb2 = sb13;
                    c164843 = c1648410;
                    i2 = i39;
                    pluginContext5 = pluginContext23;
                    c16683 = c16685;
                    charSequence6 = charSequence23;
                    charSequence22 = c233313.f24120;
                    m2566 = (C0630.m2566("ۛۤ") + i34) * 79;
                    i8 = ((m2566 ^ i33) * (-11241)) ^ (-727886056);
                    i9 = -2086036371;
                    i36 = m2566 ^ i9;
                    charSequence23 = charSequence6;
                    i35 = i8;
                    c1648410 = c164843;
                    c16685 = c16683;
                    exc11 = exc3;
                    str32 = str8;
                    c2333110 = c233313;
                    str36 = str9;
                    pluginContext23 = pluginContext5;
                    pluginContext21 = pluginContext6;
                    charSequence20 = charSequence5;
                    i39 = i2;
                    str35 = str3;
                    sb13 = sb2;
                    sb12 = sb;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case -1262618168:
                case -586410666:
                    charSequence10 = charSequence20;
                    str15 = str36;
                    pluginContext12 = pluginContext22;
                    str16 = str34;
                    str17 = str35;
                    i15 = i37;
                    pluginContext13 = pluginContext21;
                    i16 = i40;
                    exc6 = exc11;
                    sb7 = sb12;
                    sb8 = sb13;
                    c164846 = c1648410;
                    i17 = i39;
                    pluginContext14 = pluginContext23;
                    c16684 = c16685;
                    charSequence11 = charSequence23;
                    c233316 = c2333110;
                    str18 = str32;
                    short s4 = s3;
                    boolean z7 = z4;
                    c29782 = c29783;
                    view = view2;
                    z2 = z7;
                    int i43 = s4 + 11745;
                    if ((s4 * s2) - (i43 * i43) > 0) {
                        m25663 = C2105.m6981("ۙ᩷") ^ i33;
                        s = s4;
                        i18 = ((m25663 ^ i34) * (-261)) ^ (-326550994);
                        i19 = 286356173;
                    } else {
                        s = s4;
                        m25663 = (C2105.m6981("᩺֫") + i34) * (-105);
                        i18 = ((m25663 ^ i33) * (-13075)) ^ 450646861;
                        i19 = -75173781;
                    }
                    s3 = s;
                    c1648410 = c164846;
                    exc11 = exc6;
                    i37 = i15;
                    i36 = m25663 ^ i19;
                    i35 = i18;
                    i40 = i16;
                    str36 = str15;
                    str32 = str18;
                    pluginContext21 = pluginContext13;
                    charSequence20 = charSequence10;
                    str35 = str17;
                    c2333110 = c233316;
                    charSequence23 = charSequence11;
                    c16685 = c16684;
                    pluginContext23 = pluginContext14;
                    i39 = i17;
                    sb13 = sb8;
                    sb12 = sb7;
                    str34 = str16;
                    pluginContext22 = pluginContext12;
                    boolean z8 = z2;
                    view2 = view;
                    c29783 = c29782;
                    z4 = z8;
                case -1218747256:
                case -280526754:
                    StringBuilder sb17 = sb12;
                    str3 = str35;
                    pluginContext6 = pluginContext21;
                    sb2 = sb13;
                    String str38 = str34;
                    c233313 = c2333110;
                    C3245.m9923(sb17, str38);
                    String m947 = C0050.m947(sb17);
                    sb = sb17;
                    exc10 = exc13;
                    PluginContext pluginContext25 = pluginContext22;
                    str2 = str38;
                    pluginContext11 = pluginContext25;
                    pluginContext11.log(m947, exc10);
                    str29 = c16685.f5838;
                    int m256692 = C0630.m2566("۬ܺ") ^ i33;
                    str8 = str29;
                    i35 = ((m256692 ^ i34) * 21753) ^ (-29886657);
                    i36 = m256692 ^ 79887713;
                    exc13 = exc10;
                    str32 = str8;
                    c2333110 = c233313;
                    pluginContext21 = pluginContext6;
                    str35 = str3;
                    String str3722 = str2;
                    pluginContext22 = pluginContext11;
                    sb13 = sb2;
                    sb12 = sb;
                    str34 = str3722;
                case -1203257034:
                case -993724661:
                    if (C3019.f9544 >= 0) {
                        charSequence10 = charSequence20;
                        str15 = str36;
                        pluginContext12 = pluginContext22;
                        str16 = str34;
                        str17 = str35;
                        i15 = i37;
                        pluginContext13 = pluginContext21;
                        i16 = i40;
                        exc6 = exc11;
                        sb7 = sb12;
                        s = s3;
                        sb8 = sb13;
                        c164846 = c1648410;
                        i17 = i39;
                        pluginContext14 = pluginContext23;
                        c16684 = c16685;
                        charSequence11 = charSequence23;
                        c233316 = c2333110;
                        str18 = str32;
                        boolean z9 = z4;
                        c29782 = c29783;
                        view = view2;
                        z2 = z9;
                        m25663 = C2105.m6981("ۢ᩵") ^ i34;
                        i18 = ((m25663 ^ i33) * (-24349)) ^ (-1814523549);
                        i19 = -173679334;
                        s3 = s;
                        c1648410 = c164846;
                        exc11 = exc6;
                        i37 = i15;
                        i36 = m25663 ^ i19;
                        i35 = i18;
                        i40 = i16;
                        str36 = str15;
                        str32 = str18;
                        pluginContext21 = pluginContext13;
                        charSequence20 = charSequence10;
                        str35 = str17;
                        c2333110 = c233316;
                        charSequence23 = charSequence11;
                        c16685 = c16684;
                        pluginContext23 = pluginContext14;
                        i39 = i17;
                        sb13 = sb8;
                        sb12 = sb7;
                        str34 = str16;
                        pluginContext22 = pluginContext12;
                        boolean z82 = z2;
                        view2 = view;
                        c29783 = c29782;
                        z4 = z82;
                    } else {
                        m69812 = C0630.m2566("ܽܰ") ^ i34;
                        i13 = ((m69812 ^ i33) * 19973) ^ 1452574050;
                        i14 = -778095401;
                        i36 = m69812 ^ i14;
                        i35 = i13;
                    }
                case -1120681153:
                case 1841064461:
                    charSequence5 = charSequence20;
                    str9 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str3 = str35;
                    pluginContext6 = pluginContext21;
                    exc3 = exc11;
                    sb = sb12;
                    c233313 = c2333110;
                    str8 = str32;
                    sb2 = sb13;
                    c164843 = c1648410;
                    i2 = i39;
                    pluginContext5 = pluginContext23;
                    c16683 = c16685;
                    charSequence6 = charSequence23;
                    try {
                        sharedPreferences = activityC18827.f59398;
                        str30 = C1005.m3506(sharedPreferences, c233313.f24119, charSequence6);
                        m2566 = C0630.m2566("᩷ۘ") ^ i33;
                        i8 = ((m2566 ^ i34) * 14201) ^ 1593304514;
                        i9 = 815029208;
                        i36 = m2566 ^ i9;
                        charSequence23 = charSequence6;
                        i35 = i8;
                        c1648410 = c164843;
                        c16685 = c16683;
                        exc11 = exc3;
                        str32 = str8;
                        c2333110 = c233313;
                        str36 = str9;
                        pluginContext23 = pluginContext5;
                        pluginContext21 = pluginContext6;
                        charSequence20 = charSequence5;
                        i39 = i2;
                        str35 = str3;
                    } catch (Exception e2) {
                        e = e2;
                        int m69817 = (i33 - C2105.m6981("ۛۚ")) * (-81);
                        Exception exc16 = e;
                        i35 = ((m69817 ^ i34) * 26795) ^ (-1625711926);
                        i36 = m69817 ^ (-1320619764);
                        str36 = str9;
                        c1648410 = c164843;
                        str32 = str8;
                        charSequence20 = charSequence5;
                        c2333110 = c233313;
                        exc11 = exc16;
                        pluginContext21 = pluginContext6;
                        charSequence23 = charSequence6;
                        str35 = str3;
                        c16685 = c16683;
                        pluginContext23 = pluginContext5;
                        i39 = i2;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    }
                    sb13 = sb2;
                    sb12 = sb;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case -1117700900:
                case 652777917:
                    CharSequence charSequence25 = charSequence20;
                    String str39 = str36;
                    PluginContext pluginContext26 = pluginContext22;
                    String str40 = str34;
                    String str41 = str35;
                    Exception exc17 = exc11;
                    StringBuilder sb18 = sb12;
                    C16484 c1648411 = c1648410;
                    int m69818 = (C2105.m6981("۫ۧ") + i33) * 87;
                    i35 = ((m69818 ^ i34) * (-17229)) ^ (-384077233);
                    i36 = m69818 ^ (-1604059602);
                    pluginContext23 = pluginContext23;
                    c1648410 = c1648411;
                    exc11 = exc17;
                    str32 = str32;
                    c2333110 = c2333110;
                    i39 = i39;
                    str36 = str39;
                    sb13 = sb13;
                    sb12 = sb18;
                    pluginContext21 = pluginContext21;
                    charSequence20 = charSequence25;
                    str35 = str41;
                    str34 = str40;
                    pluginContext22 = pluginContext26;
                    charSequence23 = charSequence23;
                    c16685 = (C1668) abstractC7809;
                case -1104541142:
                case 824992050:
                    if (C2167.m7155()) {
                        charSequence = charSequence20;
                        i4 = i39;
                        pluginContext3 = pluginContext23;
                        str = str36;
                        pluginContext = pluginContext22;
                        str2 = str34;
                        str3 = str35;
                        i = i37;
                        pluginContext2 = pluginContext21;
                        c1668 = c16685;
                        i3 = i40;
                        charSequence2 = charSequence23;
                        exc = exc11;
                        sb = sb12;
                        c23331 = c2333110;
                        str4 = str32;
                        sb2 = sb13;
                        c16484 = c1648410;
                        int m698162 = C2105.m6981("ۤ۠") ^ i34;
                        int i422 = i4;
                        i35 = ((m698162 ^ i33) * 11089) ^ (-969075621);
                        c1648410 = c16484;
                        exc11 = exc;
                        str32 = str4;
                        i37 = i;
                        i36 = m698162 ^ (-505560537);
                        str36 = str;
                        c2333110 = c23331;
                        sb13 = sb2;
                        sb12 = sb;
                        charSequence20 = charSequence;
                        charSequence23 = charSequence2;
                        c16685 = c1668;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                        pluginContext23 = pluginContext3;
                        i39 = i422;
                        i40 = i3;
                        pluginContext21 = pluginContext2;
                        str35 = str3;
                    } else {
                        charSequence12 = charSequence20;
                        str19 = str36;
                        pluginContext12 = pluginContext22;
                        str16 = str34;
                        str20 = str35;
                        i20 = i37;
                        pluginContext15 = pluginContext21;
                        i21 = i40;
                        exc7 = exc11;
                        sb7 = sb12;
                        sb8 = sb13;
                        c164847 = c1648410;
                        i17 = i39;
                        pluginContext14 = pluginContext23;
                        c16684 = c16685;
                        charSequence11 = charSequence23;
                        c233316 = c2333110;
                        str21 = str32;
                        boolean z10 = z4;
                        c29782 = c29783;
                        view = view2;
                        z2 = z10;
                        m25664 = C0630.m2566("ܽۘ") ^ i33;
                        i22 = ((m25664 ^ i34) * (-32211)) ^ 1470787449;
                        i23 = 743796944;
                        int i44 = m25664 ^ i23;
                        i40 = i21;
                        c1648410 = c164847;
                        exc11 = exc7;
                        pluginContext21 = pluginContext15;
                        i37 = i20;
                        i36 = i44;
                        i35 = i22;
                        str36 = str19;
                        str35 = str20;
                        str32 = str21;
                        charSequence20 = charSequence12;
                        c2333110 = c233316;
                        charSequence23 = charSequence11;
                        c16685 = c16684;
                        pluginContext23 = pluginContext14;
                        i39 = i17;
                        sb13 = sb8;
                        sb12 = sb7;
                        str34 = str16;
                        pluginContext22 = pluginContext12;
                        boolean z822 = z2;
                        view2 = view;
                        c29783 = c29782;
                        z4 = z822;
                    }
                case -1048371610:
                case 1973060303:
                    pluginContext20 = activityC18827.f59393;
                    str3 = str35;
                    sb13 = new StringBuilder(str3);
                    str33 = c1648410.f24119;
                    if (C4075.f12947 >= 0) {
                        pluginContext17 = pluginContext20;
                        charSequence14 = charSequence20;
                        z3 = z4;
                        str25 = str36;
                        pluginContext12 = pluginContext22;
                        str16 = str34;
                        i25 = i37;
                        c29782 = c29783;
                        view = view2;
                        exc9 = exc11;
                        sb7 = sb12;
                        sb8 = sb13;
                        c164849 = c1648410;
                        i17 = i39;
                        pluginContext14 = pluginContext23;
                        c16684 = c16685;
                        charSequence15 = charSequence23;
                        c233318 = c2333110;
                        str26 = str32;
                        m25665 = C2105.m6981("᩻ܶ") ^ i33;
                        z2 = z3;
                        i26 = ((m25665 ^ i34) * (-11565)) ^ 1045803566;
                        i27 = 2021047076;
                        c1648410 = c164849;
                        exc11 = exc9;
                        str32 = str26;
                        i37 = i25;
                        i36 = m25665 ^ i27;
                        i35 = i26;
                        str36 = str25;
                        c2333110 = c233318;
                        pluginContext21 = pluginContext17;
                        charSequence20 = charSequence14;
                        charSequence23 = charSequence15;
                        str35 = str3;
                        c16685 = c16684;
                        pluginContext23 = pluginContext14;
                        i39 = i17;
                        sb13 = sb8;
                        sb12 = sb7;
                        str34 = str16;
                        pluginContext22 = pluginContext12;
                        boolean z8222 = z2;
                        view2 = view;
                        c29783 = c29782;
                        z4 = z8222;
                    } else {
                        m25667 = (C0630.m2566("᩸ۗ") + i34) * 79;
                        pluginContext2 = pluginContext20;
                        i30 = ((m25667 ^ i33) * 2385) ^ 1111116084;
                        i31 = -497362930;
                        i36 = m25667 ^ i31;
                        i35 = i30;
                        pluginContext21 = pluginContext2;
                        str35 = str3;
                    }
                case -1032455296:
                case 1079164685:
                    CharSequence charSequence26 = c10841.f32591;
                    if (charSequence26 != null) {
                        charSequence20 = charSequence26;
                        str3 = str35;
                        pluginContext2 = pluginContext21;
                        m25667 = C2105.m6981("֡᩵") ^ i33;
                        i30 = ((m25667 ^ i34) * (-1655)) ^ (-1066471807);
                        i31 = 528818988;
                        i36 = m25667 ^ i31;
                        i35 = i30;
                        pluginContext21 = pluginContext2;
                        str35 = str3;
                    }
                    str3 = str35;
                    pluginContext2 = pluginContext21;
                    charSequence20 = charSequence18;
                    m25667 = C2105.m6981("֡᩵") ^ i33;
                    i30 = ((m25667 ^ i34) * (-1655)) ^ (-1066471807);
                    i31 = 528818988;
                    i36 = m25667 ^ i31;
                    i35 = i30;
                    pluginContext21 = pluginContext2;
                    str35 = str3;
                case -1008553855:
                case 1276950772:
                    charSequence24 = c1648410.f24120;
                    m69812 = (i34 - C2105.m6981("ۙܳ")) * (-83);
                    i13 = ((m69812 ^ i33) * 22241) ^ 739434169;
                    i14 = 400654534;
                    i36 = m69812 ^ i14;
                    i35 = i13;
                case -999659084:
                case -377517135:
                    charSequence5 = charSequence20;
                    str9 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str3 = str35;
                    pluginContext6 = pluginContext21;
                    exc3 = exc11;
                    sb = sb12;
                    c233313 = c2333110;
                    str8 = str32;
                    sb2 = sb13;
                    c164843 = c1648410;
                    i2 = i39;
                    pluginContext5 = pluginContext23;
                    c16683 = c16685;
                    charSequence6 = charSequence23;
                    if (charSequence21 != null) {
                        m2566 = C0630.m2566("ܳۛ") ^ i34;
                        i8 = ((m2566 ^ i33) * 22337) ^ (-1619092894);
                        i9 = -276767053;
                        i36 = m2566 ^ i9;
                        charSequence23 = charSequence6;
                        i35 = i8;
                        c1648410 = c164843;
                        c16685 = c16683;
                        exc11 = exc3;
                        str32 = str8;
                        c2333110 = c233313;
                        str36 = str9;
                        pluginContext23 = pluginContext5;
                        pluginContext21 = pluginContext6;
                        charSequence20 = charSequence5;
                        i39 = i2;
                        str35 = str3;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    }
                    m2566 = (i34 - C0630.m2566("ۚ۠")) * 93;
                    i8 = ((m2566 ^ i33) * 8589) ^ (-420734162);
                    i9 = -1633997835;
                    i36 = m2566 ^ i9;
                    charSequence23 = charSequence6;
                    i35 = i8;
                    c1648410 = c164843;
                    c16685 = c16683;
                    exc11 = exc3;
                    str32 = str8;
                    c2333110 = c233313;
                    str36 = str9;
                    pluginContext23 = pluginContext5;
                    pluginContext21 = pluginContext6;
                    charSequence20 = charSequence5;
                    i39 = i2;
                    str35 = str3;
                    sb13 = sb2;
                    sb12 = sb;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case -991344401:
                case 1246393256:
                    if (z5) {
                        m69812 = (C0630.m2566("᩷ۤ") + i33) * 45;
                        i13 = ((m69812 ^ i34) * 19037) ^ (-445806568);
                        i14 = -528850582;
                    } else {
                        m69812 = C2105.m6981("ۤ᩻") ^ i33;
                        i13 = ((m69812 ^ i34) * 29125) ^ (-1247219736);
                        i14 = -6051161;
                    }
                    i36 = m69812 ^ i14;
                    i35 = i13;
                case -960900356:
                case -70384637:
                    charSequence10 = charSequence20;
                    str15 = str36;
                    pluginContext12 = pluginContext22;
                    str16 = str34;
                    str17 = str35;
                    i15 = i37;
                    pluginContext13 = pluginContext21;
                    i16 = i40;
                    exc6 = exc11;
                    sb7 = sb12;
                    s = s3;
                    sb8 = sb13;
                    c164846 = c1648410;
                    i17 = i39;
                    pluginContext14 = pluginContext23;
                    c16684 = c16685;
                    charSequence11 = charSequence23;
                    c233316 = c2333110;
                    str18 = str32;
                    boolean z11 = z4;
                    c29782 = c29783;
                    view = view2;
                    z2 = z11;
                    sArr = f27192;
                    c = '\"';
                    if (C4075.m12263() > 0) {
                        m25663 = (C0630.m2566("ۨۡ") ^ i33) * 47;
                        i18 = ((m25663 ^ i34) * (-20233)) ^ (-1924892487);
                        i19 = -1059724906;
                        s3 = s;
                        c1648410 = c164846;
                        exc11 = exc6;
                        i37 = i15;
                        i36 = m25663 ^ i19;
                        i35 = i18;
                        i40 = i16;
                        str36 = str15;
                        str32 = str18;
                        pluginContext21 = pluginContext13;
                        charSequence20 = charSequence10;
                        str35 = str17;
                        c2333110 = c233316;
                        charSequence23 = charSequence11;
                        c16685 = c16684;
                        pluginContext23 = pluginContext14;
                        i39 = i17;
                        sb13 = sb8;
                        sb12 = sb7;
                        str34 = str16;
                        pluginContext22 = pluginContext12;
                        boolean z82222 = z2;
                        view2 = view;
                        c29783 = c29782;
                        z4 = z82222;
                    }
                    m25663 = C2105.m6981("ۢ᩵") ^ i34;
                    i18 = ((m25663 ^ i33) * (-24349)) ^ (-1814523549);
                    i19 = -173679334;
                    s3 = s;
                    c1648410 = c164846;
                    exc11 = exc6;
                    i37 = i15;
                    i36 = m25663 ^ i19;
                    i35 = i18;
                    i40 = i16;
                    str36 = str15;
                    str32 = str18;
                    pluginContext21 = pluginContext13;
                    charSequence20 = charSequence10;
                    str35 = str17;
                    c2333110 = c233316;
                    charSequence23 = charSequence11;
                    c16685 = c16684;
                    pluginContext23 = pluginContext14;
                    i39 = i17;
                    sb13 = sb8;
                    sb12 = sb7;
                    str34 = str16;
                    pluginContext22 = pluginContext12;
                    boolean z822222 = z2;
                    view2 = view;
                    c29783 = c29782;
                    z4 = z822222;
                case -950445931:
                case 189216789:
                    if (C1773.m5910(it)) {
                        m69812 = (C0630.m2566("᩶ܽ") + i34) * 99;
                        i13 = ((m69812 ^ i33) * 16287) ^ 926702377;
                        i14 = -595991364;
                        i36 = m69812 ^ i14;
                        i35 = i13;
                    } else {
                        str3 = str35;
                        pluginContext2 = pluginContext21;
                        charSequence20 = charSequence18;
                        m25667 = C2105.m6981("֡᩵") ^ i33;
                        i30 = ((m25667 ^ i34) * (-1655)) ^ (-1066471807);
                        i31 = 528818988;
                        i36 = m25667 ^ i31;
                        i35 = i30;
                        pluginContext21 = pluginContext2;
                        str35 = str3;
                    }
                case -901751725:
                case 1905843334:
                    charSequence17 = c1648410.f50676;
                    charSequence19 = charSequence17;
                    m69812 = C0630.m2566("ᩳᩳ") ^ i33;
                    i13 = ((m69812 ^ i34) * (-23301)) ^ 1094528777;
                    i14 = -415830184;
                    i36 = m69812 ^ i14;
                    i35 = i13;
                case -900390979:
                case 1301709276:
                    if (C2167.f7158 >= 0) {
                        charSequence3 = charSequence20;
                        str5 = str36;
                        pluginContext = pluginContext22;
                        str2 = str34;
                        str6 = str35;
                        i5 = i37;
                        pluginContext4 = pluginContext21;
                        z = z4;
                        exc2 = exc11;
                        sb = sb12;
                        c2978 = c29783;
                        sb2 = sb13;
                        c164842 = c1648410;
                        i2 = i39;
                        pluginContext5 = pluginContext23;
                        c16682 = c16685;
                        charSequence4 = charSequence23;
                        c233312 = c2333110;
                        str7 = str32;
                        m6981 = (i33 - C2105.m6981("ۡۛ")) * (-115);
                        i6 = ((m6981 ^ i34) * 4591) ^ 1930433084;
                        i7 = 578103365;
                        c1648410 = c164842;
                        exc11 = exc2;
                        str32 = str7;
                        i37 = i5;
                        i36 = m6981 ^ i7;
                        i35 = i6;
                        str36 = str5;
                        c29783 = c2978;
                        c2333110 = c233312;
                        charSequence20 = charSequence3;
                        z4 = z;
                        charSequence23 = charSequence4;
                        c16685 = c16682;
                        pluginContext21 = pluginContext4;
                        str35 = str6;
                        pluginContext23 = pluginContext5;
                        i39 = i2;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    } else {
                        charSequence10 = charSequence20;
                        str15 = str36;
                        pluginContext12 = pluginContext22;
                        str16 = str34;
                        str17 = str35;
                        i15 = i37;
                        pluginContext13 = pluginContext21;
                        i16 = i40;
                        exc6 = exc11;
                        sb7 = sb12;
                        s = s3;
                        sb8 = sb13;
                        c164846 = c1648410;
                        i17 = i39;
                        pluginContext14 = pluginContext23;
                        c16684 = c16685;
                        charSequence11 = charSequence23;
                        c233316 = c2333110;
                        str18 = str32;
                        boolean z92 = z4;
                        c29782 = c29783;
                        view = view2;
                        z2 = z92;
                        m25663 = C2105.m6981("ۢ᩵") ^ i34;
                        i18 = ((m25663 ^ i33) * (-24349)) ^ (-1814523549);
                        i19 = -173679334;
                        s3 = s;
                        c1648410 = c164846;
                        exc11 = exc6;
                        i37 = i15;
                        i36 = m25663 ^ i19;
                        i35 = i18;
                        i40 = i16;
                        str36 = str15;
                        str32 = str18;
                        pluginContext21 = pluginContext13;
                        charSequence20 = charSequence10;
                        str35 = str17;
                        c2333110 = c233316;
                        charSequence23 = charSequence11;
                        c16685 = c16684;
                        pluginContext23 = pluginContext14;
                        i39 = i17;
                        sb13 = sb8;
                        sb12 = sb7;
                        str34 = str16;
                        pluginContext22 = pluginContext12;
                        boolean z8222222 = z2;
                        view2 = view;
                        c29783 = c29782;
                        z4 = z8222222;
                    }
                case -882649302:
                case -742319937:
                    if (C0714.f2697 >= 0) {
                        m69812 = (C2105.m6981("᩺֨") ^ i33) * (-115);
                        i13 = ((m69812 ^ i34) * (-16453)) ^ (-1935713647);
                        i14 = 1946357151;
                        i36 = m69812 ^ i14;
                        i35 = i13;
                    }
                    m69812 = C0630.m2566("ܽܰ") ^ i34;
                    i13 = ((m69812 ^ i33) * 19973) ^ 1452574050;
                    i14 = -778095401;
                    i36 = m69812 ^ i14;
                    i35 = i13;
                case -865047671:
                case 301019006:
                    charSequence14 = charSequence20;
                    str25 = str36;
                    pluginContext12 = pluginContext22;
                    str16 = str34;
                    str3 = str35;
                    i25 = i37;
                    pluginContext17 = pluginContext21;
                    z3 = z4;
                    exc9 = exc11;
                    sb7 = sb12;
                    c29782 = c29783;
                    sb8 = sb13;
                    c164849 = c1648410;
                    view = view2;
                    i17 = i39;
                    pluginContext14 = pluginContext23;
                    c16684 = c16685;
                    charSequence15 = charSequence23;
                    c233318 = c2333110;
                    str26 = str32;
                    C21923.m49330(view, z3);
                    textView2 = this.f27193;
                    if (C4616.f14690 > 0) {
                        z2 = z3;
                        m25665 = C2105.m6981("۫֡") ^ i33;
                        i26 = ((m25665 ^ i34) * 8457) ^ (-918404133);
                        i27 = 1457085101;
                        c1648410 = c164849;
                        exc11 = exc9;
                        str32 = str26;
                        i37 = i25;
                        i36 = m25665 ^ i27;
                        i35 = i26;
                        str36 = str25;
                        c2333110 = c233318;
                        pluginContext21 = pluginContext17;
                        charSequence20 = charSequence14;
                        charSequence23 = charSequence15;
                        str35 = str3;
                        c16685 = c16684;
                        pluginContext23 = pluginContext14;
                        i39 = i17;
                        sb13 = sb8;
                        sb12 = sb7;
                        str34 = str16;
                        pluginContext22 = pluginContext12;
                        boolean z82222222 = z2;
                        view2 = view;
                        c29783 = c29782;
                        z4 = z82222222;
                    }
                    m25665 = C2105.m6981("᩻ܶ") ^ i33;
                    z2 = z3;
                    i26 = ((m25665 ^ i34) * (-11565)) ^ 1045803566;
                    i27 = 2021047076;
                    c1648410 = c164849;
                    exc11 = exc9;
                    str32 = str26;
                    i37 = i25;
                    i36 = m25665 ^ i27;
                    i35 = i26;
                    str36 = str25;
                    c2333110 = c233318;
                    pluginContext21 = pluginContext17;
                    charSequence20 = charSequence14;
                    charSequence23 = charSequence15;
                    str35 = str3;
                    c16685 = c16684;
                    pluginContext23 = pluginContext14;
                    i39 = i17;
                    sb13 = sb8;
                    sb12 = sb7;
                    str34 = str16;
                    pluginContext22 = pluginContext12;
                    boolean z822222222 = z2;
                    view2 = view;
                    c29783 = c29782;
                    z4 = z822222222;
                case -844619423:
                case 1111018032:
                    charSequence8 = charSequence20;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str12 = str35;
                    pluginContext10 = pluginContext21;
                    StringBuilder sb19 = sb12;
                    c233315 = c2333110;
                    str14 = str32;
                    sb5 = sb13;
                    exc5 = exc11;
                    c164845 = c1648410;
                    pluginContext23 = activityC18827.f59393;
                    StringBuilder sb20 = new StringBuilder(str12);
                    String str42 = c233315.f24119;
                    if (C1047.f3863 >= 0) {
                        sb11 = sb20;
                        str36 = str42;
                        sb6 = sb19;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                        int m69819 = (C2105.m6981("ۗ᩷") + i33) * (-109);
                        int i45 = ((m69819 ^ i34) * (-13391)) ^ 1160085484;
                        i36 = m69819 ^ (-1277522189);
                        c1648410 = c164845;
                        str32 = str14;
                        c2333110 = c233315;
                        exc11 = exc5;
                        sb13 = sb5;
                        pluginContext21 = pluginContext10;
                        sb12 = sb6;
                        i35 = i45;
                        str35 = str12;
                        charSequence20 = charSequence8;
                    } else {
                        int m256610 = (C0630.m2566("ۛۗ") + i34) * 61;
                        sb11 = sb20;
                        i35 = ((m256610 ^ i33) * 17913) ^ 2010374476;
                        i36 = m256610 ^ (-2082514657);
                        str36 = str42;
                        c1648410 = c164845;
                        str32 = str14;
                        charSequence20 = charSequence8;
                        c2333110 = c233315;
                        exc11 = exc5;
                        sb13 = sb5;
                        sb12 = sb19;
                        pluginContext21 = pluginContext10;
                        str35 = str12;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    }
                case -838737686:
                case -327743782:
                    charSequence12 = charSequence20;
                    str19 = str36;
                    pluginContext12 = pluginContext22;
                    str16 = str34;
                    str20 = str35;
                    i20 = i37;
                    pluginContext15 = pluginContext21;
                    i21 = i40;
                    exc7 = exc11;
                    sb7 = sb12;
                    sb8 = sb13;
                    c164847 = c1648410;
                    i17 = i39;
                    pluginContext14 = pluginContext23;
                    c16684 = c16685;
                    charSequence11 = charSequence23;
                    c233316 = c2333110;
                    str21 = str32;
                    boolean z12 = z4;
                    c29782 = c29783;
                    view = view2;
                    z2 = z12;
                    this.f27196 = abstractC7809;
                    if (abstractC7809.mo5657() != EnumC14158.f42719) {
                        m25664 = C0630.m2566("ۨۘ") ^ i33;
                        i22 = ((m25664 ^ i34) * 8715) ^ (-1897723562);
                        i23 = 1535540377;
                    } else {
                        m25664 = C2105.m6981("ۗ᩵") ^ i33;
                        i22 = ((m25664 ^ i34) * (-165)) ^ (-887207095);
                        i23 = -547159157;
                    }
                    int i442 = m25664 ^ i23;
                    i40 = i21;
                    c1648410 = c164847;
                    exc11 = exc7;
                    pluginContext21 = pluginContext15;
                    i37 = i20;
                    i36 = i442;
                    i35 = i22;
                    str36 = str19;
                    str35 = str20;
                    str32 = str21;
                    charSequence20 = charSequence12;
                    c2333110 = c233316;
                    charSequence23 = charSequence11;
                    c16685 = c16684;
                    pluginContext23 = pluginContext14;
                    i39 = i17;
                    sb13 = sb8;
                    sb12 = sb7;
                    str34 = str16;
                    pluginContext22 = pluginContext12;
                    boolean z8222222222 = z2;
                    view2 = view;
                    c29783 = c29782;
                    z4 = z8222222222;
                case -816613931:
                case 796873289:
                    charSequence = charSequence20;
                    pluginContext3 = pluginContext23;
                    str = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    c23331 = c2333110;
                    str3 = str35;
                    i = i37;
                    str4 = str32;
                    pluginContext2 = pluginContext21;
                    c1668 = c16685;
                    exc = exc11;
                    sb = sb12;
                    sb2 = sb13;
                    c16484 = c1648410;
                    i4 = iArr[C3663.m11166(abstractC7809.mo5657())];
                    i38 = 1;
                    if (C1420.f5096 <= 0) {
                        charSequence2 = null;
                        i3 = i40;
                        int m6981622 = C2105.m6981("ۤ۠") ^ i34;
                        int i4222 = i4;
                        i35 = ((m6981622 ^ i33) * 11089) ^ (-969075621);
                        c1648410 = c16484;
                        exc11 = exc;
                        str32 = str4;
                        i37 = i;
                        i36 = m6981622 ^ (-505560537);
                        str36 = str;
                        c2333110 = c23331;
                        sb13 = sb2;
                        sb12 = sb;
                        charSequence20 = charSequence;
                        charSequence23 = charSequence2;
                        c16685 = c1668;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                        pluginContext23 = pluginContext3;
                        i39 = i4222;
                        i40 = i3;
                        pluginContext21 = pluginContext2;
                        str35 = str3;
                    } else {
                        int m256611 = C0630.m2566("ۧᩳ") ^ i33;
                        int i46 = ((m256611 ^ i34) * 5083) ^ 51617103;
                        c1648410 = c16484;
                        exc11 = exc;
                        str32 = str4;
                        i37 = i;
                        i36 = m256611 ^ 566642805;
                        str36 = str;
                        c2333110 = c23331;
                        c16685 = c1668;
                        charSequence20 = charSequence;
                        charSequence23 = null;
                        pluginContext23 = pluginContext3;
                        pluginContext21 = pluginContext2;
                        i39 = i4;
                        i35 = i46;
                        str35 = str3;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    }
                case -768663809:
                case 358277046:
                    C4159.m12565();
                    if (C1128.m3851() > 0) {
                        charSequence14 = charSequence20;
                        str25 = str36;
                        pluginContext12 = pluginContext22;
                        str16 = str34;
                        str3 = str35;
                        i25 = i37;
                        pluginContext17 = pluginContext21;
                        z3 = z4;
                        exc9 = exc11;
                        sb7 = sb12;
                        c29782 = c29783;
                        sb8 = sb13;
                        c164849 = c1648410;
                        view = view2;
                        i17 = i39;
                        pluginContext14 = pluginContext23;
                        c16684 = c16685;
                        charSequence15 = charSequence23;
                        c233318 = c2333110;
                        str26 = str32;
                        m25665 = C2105.m6981("᩻ܶ") ^ i33;
                        z2 = z3;
                        i26 = ((m25665 ^ i34) * (-11565)) ^ 1045803566;
                        i27 = 2021047076;
                        c1648410 = c164849;
                        exc11 = exc9;
                        str32 = str26;
                        i37 = i25;
                        i36 = m25665 ^ i27;
                        i35 = i26;
                        str36 = str25;
                        c2333110 = c233318;
                        pluginContext21 = pluginContext17;
                        charSequence20 = charSequence14;
                        charSequence23 = charSequence15;
                        str35 = str3;
                        c16685 = c16684;
                        pluginContext23 = pluginContext14;
                        i39 = i17;
                        sb13 = sb8;
                        sb12 = sb7;
                        str34 = str16;
                        pluginContext22 = pluginContext12;
                        boolean z82222222222 = z2;
                        view2 = view;
                        c29783 = c29782;
                        z4 = z82222222222;
                    }
                    charSequence10 = charSequence20;
                    str15 = str36;
                    pluginContext12 = pluginContext22;
                    str16 = str34;
                    str17 = str35;
                    i15 = i37;
                    pluginContext13 = pluginContext21;
                    i16 = i40;
                    exc6 = exc11;
                    sb7 = sb12;
                    s = s3;
                    sb8 = sb13;
                    c164846 = c1648410;
                    i17 = i39;
                    pluginContext14 = pluginContext23;
                    c16684 = c16685;
                    charSequence11 = charSequence23;
                    c233316 = c2333110;
                    str18 = str32;
                    boolean z922 = z4;
                    c29782 = c29783;
                    view = view2;
                    z2 = z922;
                    m25663 = C2105.m6981("ۢ᩵") ^ i34;
                    i18 = ((m25663 ^ i33) * (-24349)) ^ (-1814523549);
                    i19 = -173679334;
                    s3 = s;
                    c1648410 = c164846;
                    exc11 = exc6;
                    i37 = i15;
                    i36 = m25663 ^ i19;
                    i35 = i18;
                    i40 = i16;
                    str36 = str15;
                    str32 = str18;
                    pluginContext21 = pluginContext13;
                    charSequence20 = charSequence10;
                    str35 = str17;
                    c2333110 = c233316;
                    charSequence23 = charSequence11;
                    c16685 = c16684;
                    pluginContext23 = pluginContext14;
                    i39 = i17;
                    sb13 = sb8;
                    sb12 = sb7;
                    str34 = str16;
                    pluginContext22 = pluginContext12;
                    boolean z822222222222 = z2;
                    view2 = view;
                    c29783 = c29782;
                    z4 = z822222222222;
                case -757684261:
                case -120865272:
                    if (charSequence19 == null) {
                        m69812 = C2105.m6981("֡۫") ^ i33;
                        i13 = ((m69812 ^ i34) * 19343) ^ (-77514327);
                        i14 = -167705848;
                        i36 = m69812 ^ i14;
                        i35 = i13;
                    } else {
                        charSequence24 = charSequence19;
                        m69812 = (i34 - C2105.m6981("ۙܳ")) * (-83);
                        i13 = ((m69812 ^ i33) * 22241) ^ 739434169;
                        i14 = 400654534;
                        i36 = m69812 ^ i14;
                        i35 = i13;
                    }
                case -743324128:
                case -512417983:
                    charSequence5 = charSequence20;
                    str9 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str3 = str35;
                    pluginContext6 = pluginContext21;
                    exc3 = exc11;
                    sb = sb12;
                    c233313 = c2333110;
                    str8 = str32;
                    sb2 = sb13;
                    c164843 = c1648410;
                    i2 = i39;
                    pluginContext5 = pluginContext23;
                    c16683 = c16685;
                    charSequence6 = charSequence23;
                    if (i2 != 3) {
                        m2566 = (C0630.m2566("ۧۘ") + i33) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((m2566 ^ i34) * (-1513)) ^ 420792753;
                        i9 = 1805768914;
                    } else {
                        m2566 = (i34 - C2105.m6981("֡۟")) * (-15);
                        i8 = ((m2566 ^ i33) * (-30093)) ^ 1404255554;
                        i9 = 1616895499;
                    }
                    i36 = m2566 ^ i9;
                    charSequence23 = charSequence6;
                    i35 = i8;
                    c1648410 = c164843;
                    c16685 = c16683;
                    exc11 = exc3;
                    str32 = str8;
                    c2333110 = c233313;
                    str36 = str9;
                    pluginContext23 = pluginContext5;
                    pluginContext21 = pluginContext6;
                    charSequence20 = charSequence5;
                    i39 = i2;
                    str35 = str3;
                    sb13 = sb2;
                    sb12 = sb;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case -701423362:
                case 1445964498:
                    str3 = str35;
                    pluginContext6 = pluginContext21;
                    c233313 = c2333110;
                    try {
                        charSequence9 = c233313.f74986;
                        str8 = str32;
                        StringBuilder sb21 = sb12;
                        sb2 = sb13;
                        pluginContext11 = pluginContext22;
                        str2 = str34;
                        sb = sb21;
                        charSequence21 = charSequence9;
                        pluginContext = pluginContext11;
                        charSequence5 = charSequence20;
                        i2 = i39;
                        pluginContext5 = pluginContext23;
                        str9 = str36;
                        c16683 = c16685;
                        charSequence6 = charSequence23;
                        exc3 = exc11;
                        c164843 = c1648410;
                        m2566 = C0630.m2566("᩶ۤ") ^ i34;
                        i8 = ((m2566 ^ i33) * (-9413)) ^ (-1500276379);
                        i9 = 820941687;
                        i36 = m2566 ^ i9;
                        charSequence23 = charSequence6;
                        i35 = i8;
                        c1648410 = c164843;
                        c16685 = c16683;
                        exc11 = exc3;
                        str32 = str8;
                        c2333110 = c233313;
                        str36 = str9;
                        pluginContext23 = pluginContext5;
                        pluginContext21 = pluginContext6;
                        charSequence20 = charSequence5;
                        i39 = i2;
                        str35 = str3;
                    } catch (Exception e3) {
                        e = e3;
                        str8 = str32;
                        c164843 = c1648410;
                        charSequence5 = charSequence20;
                        str9 = str36;
                        pluginContext = pluginContext22;
                        str2 = str34;
                        sb = sb12;
                        sb2 = sb13;
                        i2 = i39;
                        pluginContext5 = pluginContext23;
                        c16683 = c16685;
                        charSequence6 = charSequence23;
                        int m698172 = (i33 - C2105.m6981("ۛۚ")) * (-81);
                        Exception exc162 = e;
                        i35 = ((m698172 ^ i34) * 26795) ^ (-1625711926);
                        i36 = m698172 ^ (-1320619764);
                        str36 = str9;
                        c1648410 = c164843;
                        str32 = str8;
                        charSequence20 = charSequence5;
                        c2333110 = c233313;
                        exc11 = exc162;
                        pluginContext21 = pluginContext6;
                        charSequence23 = charSequence6;
                        str35 = str3;
                        c16685 = c16683;
                        pluginContext23 = pluginContext5;
                        i39 = i2;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    }
                    sb13 = sb2;
                    sb12 = sb;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case -647466286:
                case 1736553672:
                    sb5 = sb13;
                    str12 = str35;
                    pluginContext10 = pluginContext21;
                    c233315 = c2333110;
                    str14 = str32;
                    Exception exc18 = exc13;
                    pluginContext22 = activityC18827.f59393;
                    sb6 = new StringBuilder(str12);
                    String str43 = c16685.f24119;
                    if (C3683.f11629 >= 0) {
                        exc13 = exc18;
                        str34 = str43;
                        charSequence8 = charSequence20;
                        exc5 = exc11;
                        c164845 = c1648410;
                        int m698192 = (C2105.m6981("ۗ᩷") + i33) * (-109);
                        int i452 = ((m698192 ^ i34) * (-13391)) ^ 1160085484;
                        i36 = m698192 ^ (-1277522189);
                        c1648410 = c164845;
                        str32 = str14;
                        c2333110 = c233315;
                        exc11 = exc5;
                        sb13 = sb5;
                        pluginContext21 = pluginContext10;
                        sb12 = sb6;
                        i35 = i452;
                        str35 = str12;
                        charSequence20 = charSequence8;
                    } else {
                        int m698110 = C2105.m6981("ܰ۠") ^ i33;
                        i35 = ((m698110 ^ i34) * (-12699)) ^ (-442205152);
                        i36 = m698110 ^ (-626760947);
                        exc13 = exc18;
                        str32 = str14;
                        c2333110 = c233315;
                        pluginContext21 = pluginContext10;
                        str35 = str12;
                        str34 = str43;
                        sb13 = sb5;
                        sb12 = sb6;
                    }
                case -497373358:
                case 378432158:
                    break;
                case -384569360:
                case 243481060:
                    C1128.m3851();
                    C1773.m5908();
                    break;
                case -360649962:
                case 2079320719:
                    charSequence14 = charSequence20;
                    str25 = str36;
                    pluginContext12 = pluginContext22;
                    str16 = str34;
                    str3 = str35;
                    i25 = i37;
                    pluginContext17 = pluginContext21;
                    exc9 = exc11;
                    sb7 = sb12;
                    sb8 = sb13;
                    c164849 = c1648410;
                    i17 = i39;
                    pluginContext14 = pluginContext23;
                    c16684 = c16685;
                    charSequence15 = charSequence23;
                    c233318 = c2333110;
                    str26 = str32;
                    boolean z13 = z4;
                    c29782 = c29783;
                    view = view2;
                    z2 = z13;
                    i40 = 0;
                    m25665 = (C0630.m2566("ۘ۫") ^ i34) * 23;
                    i26 = ((m25665 ^ i33) * (-31797)) ^ (-1365522882);
                    i27 = -712615677;
                    c1648410 = c164849;
                    exc11 = exc9;
                    str32 = str26;
                    i37 = i25;
                    i36 = m25665 ^ i27;
                    i35 = i26;
                    str36 = str25;
                    c2333110 = c233318;
                    pluginContext21 = pluginContext17;
                    charSequence20 = charSequence14;
                    charSequence23 = charSequence15;
                    str35 = str3;
                    c16685 = c16684;
                    pluginContext23 = pluginContext14;
                    i39 = i17;
                    sb13 = sb8;
                    sb12 = sb7;
                    str34 = str16;
                    pluginContext22 = pluginContext12;
                    boolean z8222222222222 = z2;
                    view2 = view;
                    c29783 = c29782;
                    z4 = z8222222222222;
                case -359694488:
                case 1304029024:
                    c10841 = (C10841) RunnableC1108.m3791(it);
                    if (ViewOnClickListenerC1958.m6437(str32, c10841.f32592)) {
                        m69812 = (C2105.m6981("֫ۜ") + i34) * (-101);
                        i13 = ((m69812 ^ i33) * 20927) ^ 21611418;
                        i14 = -965031609;
                        i36 = m69812 ^ i14;
                        i35 = i13;
                    }
                    m69812 = C0630.m2566("ۙᩴ") ^ i34;
                    i13 = ((m69812 ^ i33) * 11757) ^ 1762725137;
                    i14 = 870217667;
                    i36 = m69812 ^ i14;
                    i35 = i13;
                case -303958802:
                case 1419135640:
                    charSequence7 = charSequence20;
                    str11 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str12 = str35;
                    pluginContext7 = pluginContext21;
                    exc4 = exc11;
                    sb3 = sb12;
                    c233314 = c2333110;
                    str13 = str32;
                    sb4 = sb13;
                    c164844 = c1648410;
                    pluginContext9 = pluginContext23;
                    i10 = i39;
                    if (i10 == 4) {
                        pluginContext8 = pluginContext9;
                        m25662 = (i33 - C0630.m2566("᩵ܳ")) * 93;
                        i11 = ((m25662 ^ i34) * 3281) ^ 174660544;
                        i12 = -620455931;
                        i36 = m25662 ^ i12;
                        i35 = i11;
                        pluginContext23 = pluginContext8;
                        c1648410 = c164844;
                        exc11 = exc4;
                        str32 = str13;
                        c2333110 = c233314;
                        i39 = i10;
                        str36 = str11;
                        sb13 = sb4;
                        sb12 = sb3;
                        pluginContext21 = pluginContext7;
                        charSequence20 = charSequence7;
                        str35 = str12;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    }
                    m25662 = (C2105.m6981("᩻ᩳ") + i34) * (-63);
                    pluginContext8 = pluginContext9;
                    i11 = ((m25662 ^ i33) * (-23321)) ^ (-1102113722);
                    i12 = 865890135;
                    i36 = m25662 ^ i12;
                    i35 = i11;
                    pluginContext23 = pluginContext8;
                    c1648410 = c164844;
                    exc11 = exc4;
                    str32 = str13;
                    c2333110 = c233314;
                    i39 = i10;
                    str36 = str11;
                    sb13 = sb4;
                    sb12 = sb3;
                    pluginContext21 = pluginContext7;
                    charSequence20 = charSequence7;
                    str35 = str12;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case -267292857:
                case 925770052:
                    charSequence5 = charSequence20;
                    str9 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str3 = str35;
                    pluginContext6 = pluginContext21;
                    exc3 = exc11;
                    sb = sb12;
                    c233313 = c2333110;
                    str8 = str32;
                    sb2 = sb13;
                    c164843 = c1648410;
                    i2 = i39;
                    pluginContext5 = pluginContext23;
                    try {
                        sharedPreferences2 = activityC18827.f59398;
                        str10 = c16685.f24119;
                        c16683 = c16685;
                        charSequence6 = charSequence23;
                    } catch (Exception e4) {
                        e = e4;
                        c16683 = c16685;
                        charSequence6 = charSequence23;
                    }
                    try {
                        str31 = C11340.m28029(sharedPreferences2, str10, charSequence6);
                        m2566 = (i34 - C2105.m6981("۫ۖ")) * (-37);
                        i8 = ((m2566 ^ i33) * 4235) ^ 1843223222;
                        i9 = 1381188189;
                    } catch (Exception e5) {
                        e = e5;
                        exc13 = e;
                        m2566 = C2105.m6981("֫ۤ") ^ i34;
                        i8 = ((m2566 ^ i33) * 21851) ^ (-1501411913);
                        i9 = 770639270;
                        i36 = m2566 ^ i9;
                        charSequence23 = charSequence6;
                        i35 = i8;
                        c1648410 = c164843;
                        c16685 = c16683;
                        exc11 = exc3;
                        str32 = str8;
                        c2333110 = c233313;
                        str36 = str9;
                        pluginContext23 = pluginContext5;
                        pluginContext21 = pluginContext6;
                        charSequence20 = charSequence5;
                        i39 = i2;
                        str35 = str3;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    }
                    i36 = m2566 ^ i9;
                    charSequence23 = charSequence6;
                    i35 = i8;
                    c1648410 = c164843;
                    c16685 = c16683;
                    exc11 = exc3;
                    str32 = str8;
                    c2333110 = c233313;
                    str36 = str9;
                    pluginContext23 = pluginContext5;
                    pluginContext21 = pluginContext6;
                    charSequence20 = charSequence5;
                    i39 = i2;
                    str35 = str3;
                    sb13 = sb2;
                    sb12 = sb;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case -176090649:
                case 978271376:
                    charSequence7 = charSequence20;
                    str11 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str12 = str35;
                    pluginContext7 = pluginContext21;
                    exc4 = exc11;
                    sb3 = sb12;
                    c233314 = c2333110;
                    str13 = str32;
                    sb4 = sb13;
                    c164844 = c1648410;
                    pluginContext9 = pluginContext23;
                    C1047.m3601(textView, charSequence22);
                    i10 = i39;
                    m25662 = (C2105.m6981("᩻ᩳ") + i34) * (-63);
                    pluginContext8 = pluginContext9;
                    i11 = ((m25662 ^ i33) * (-23321)) ^ (-1102113722);
                    i12 = 865890135;
                    i36 = m25662 ^ i12;
                    i35 = i11;
                    pluginContext23 = pluginContext8;
                    c1648410 = c164844;
                    exc11 = exc4;
                    str32 = str13;
                    c2333110 = c233314;
                    i39 = i10;
                    str36 = str11;
                    sb13 = sb4;
                    sb12 = sb3;
                    pluginContext21 = pluginContext7;
                    charSequence20 = charSequence7;
                    str35 = str12;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case -136215197:
                case 338018042:
                    PluginContext pluginContext27 = pluginContext21;
                    CharSequence charSequence27 = charSequence20;
                    String str44 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    C23331 c2333112 = c2333110;
                    String str45 = str32;
                    Exception exc19 = exc11;
                    sb = sb12;
                    sb2 = sb13;
                    C16484 c1648412 = c1648410;
                    i2 = i39;
                    pluginContext5 = pluginContext23;
                    c16683 = c16685;
                    CharSequence charSequence28 = charSequence23;
                    int i47 = i37;
                    String m7507 = C2272.m7507(f27192, 35, 23, i47);
                    ActivityC18827 activityC188272 = this.f27194;
                    int i48 = i38;
                    if (i2 != i48) {
                        int m698111 = (i33 - C2105.m6981("۟֫")) * 81;
                        i35 = ((m698111 ^ i34) * 3207) ^ 269376056;
                        c1648410 = c1648412;
                        exc11 = exc19;
                        str32 = str45;
                        i37 = i47;
                        str36 = str44;
                        i36 = m698111 ^ 1904374264;
                        c2333110 = c2333112;
                        charSequence20 = charSequence27;
                        i38 = i48;
                        charSequence23 = charSequence28;
                        c16685 = c16683;
                        pluginContext21 = pluginContext27;
                        str35 = m7507;
                        activityC18827 = activityC188272;
                        pluginContext23 = pluginContext5;
                        i39 = i2;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    } else {
                        int m256612 = (C0630.m2566("᩹᩵") ^ i34) * (-43);
                        i38 = i48;
                        c1648410 = c1648412;
                        exc11 = exc19;
                        str32 = str45;
                        i37 = i47;
                        i36 = m256612 ^ 1288768475;
                        i35 = ((m256612 ^ i33) * (-24875)) ^ (-1588684784);
                        str36 = str44;
                        c2333110 = c2333112;
                        pluginContext21 = pluginContext27;
                        str35 = m7507;
                        charSequence20 = charSequence27;
                        charSequence23 = charSequence28;
                        activityC18827 = activityC188272;
                        c16685 = c16683;
                        pluginContext23 = pluginContext5;
                        i39 = i2;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    }
                case -123507424:
                case 431395080:
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        charSequence3 = charSequence20;
                        str5 = str36;
                        pluginContext = pluginContext22;
                        str2 = str34;
                        str6 = str35;
                        i5 = i37;
                        pluginContext4 = pluginContext21;
                        z = z4;
                        exc2 = exc11;
                        sb = sb12;
                        c2978 = c29783;
                        sb2 = sb13;
                        c164842 = c1648410;
                        i2 = i39;
                        pluginContext5 = pluginContext23;
                        c16682 = c16685;
                        charSequence4 = charSequence23;
                        c233312 = c2333110;
                        str7 = str32;
                        m6981 = (i33 - C2105.m6981("ۡۛ")) * (-115);
                        i6 = ((m6981 ^ i34) * 4591) ^ 1930433084;
                        i7 = 578103365;
                        c1648410 = c164842;
                        exc11 = exc2;
                        str32 = str7;
                        i37 = i5;
                        i36 = m6981 ^ i7;
                        i35 = i6;
                        str36 = str5;
                        c29783 = c2978;
                        c2333110 = c233312;
                        charSequence20 = charSequence3;
                        z4 = z;
                        charSequence23 = charSequence4;
                        c16685 = c16682;
                        pluginContext21 = pluginContext4;
                        str35 = str6;
                        pluginContext23 = pluginContext5;
                        i39 = i2;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    } else {
                        m69812 = (i34 - C2105.m6981("֫᩺")) * 95;
                        i13 = ((m69812 ^ i33) * 793) ^ (-256374991);
                        i14 = 1147810169;
                        i36 = m69812 ^ i14;
                        i35 = i13;
                    }
                case -86788405:
                case 593828346:
                    str3 = str35;
                    if (str31 == null) {
                        m25667 = (i34 - C0630.m2566("ۤۜ")) * (-105);
                        pluginContext2 = pluginContext21;
                        i30 = ((m25667 ^ i33) * (-9403)) ^ 1657898540;
                        i31 = 404456956;
                        i36 = m25667 ^ i31;
                        i35 = i30;
                        pluginContext21 = pluginContext2;
                        str35 = str3;
                    } else {
                        pluginContext6 = pluginContext21;
                        str29 = str31;
                        exc10 = exc13;
                        c233313 = c2333110;
                        StringBuilder sb142 = sb12;
                        sb2 = sb13;
                        pluginContext11 = pluginContext22;
                        str2 = str34;
                        sb = sb142;
                        int m2566922 = C0630.m2566("۬ܺ") ^ i33;
                        str8 = str29;
                        i35 = ((m2566922 ^ i34) * 21753) ^ (-29886657);
                        i36 = m2566922 ^ 79887713;
                        exc13 = exc10;
                        str32 = str8;
                        c2333110 = c233313;
                        pluginContext21 = pluginContext6;
                        str35 = str3;
                        String str37222 = str2;
                        pluginContext22 = pluginContext11;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str37222;
                    }
                case 19067684:
                case 2122791344:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        charSequence3 = charSequence20;
                        str5 = str36;
                        pluginContext = pluginContext22;
                        str2 = str34;
                        str6 = str35;
                        i5 = i37;
                        pluginContext4 = pluginContext21;
                        z = z4;
                        exc2 = exc11;
                        sb = sb12;
                        c2978 = c29783;
                        sb2 = sb13;
                        c164842 = c1648410;
                        i2 = i39;
                        pluginContext5 = pluginContext23;
                        c16682 = c16685;
                        charSequence4 = charSequence23;
                        c233312 = c2333110;
                        str7 = str32;
                        m6981 = (i33 - C2105.m6981("ۡۛ")) * (-115);
                        i6 = ((m6981 ^ i34) * 4591) ^ 1930433084;
                        i7 = 578103365;
                        c1648410 = c164842;
                        exc11 = exc2;
                        str32 = str7;
                        i37 = i5;
                        i36 = m6981 ^ i7;
                        i35 = i6;
                        str36 = str5;
                        c29783 = c2978;
                        c2333110 = c233312;
                        charSequence20 = charSequence3;
                        z4 = z;
                        charSequence23 = charSequence4;
                        c16685 = c16682;
                        pluginContext21 = pluginContext4;
                        str35 = str6;
                        pluginContext23 = pluginContext5;
                        i39 = i2;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    } else {
                        charSequence12 = charSequence20;
                        str19 = str36;
                        pluginContext12 = pluginContext22;
                        str16 = str34;
                        str20 = str35;
                        i20 = i37;
                        pluginContext15 = pluginContext21;
                        i21 = i40;
                        exc7 = exc11;
                        sb7 = sb12;
                        sb8 = sb13;
                        c164847 = c1648410;
                        i17 = i39;
                        pluginContext14 = pluginContext23;
                        c16684 = c16685;
                        charSequence11 = charSequence23;
                        c233316 = c2333110;
                        str21 = str32;
                        boolean z102 = z4;
                        c29782 = c29783;
                        view = view2;
                        z2 = z102;
                        m25664 = C0630.m2566("ܽۘ") ^ i33;
                        i22 = ((m25664 ^ i34) * (-32211)) ^ 1470787449;
                        i23 = 743796944;
                        int i4422 = m25664 ^ i23;
                        i40 = i21;
                        c1648410 = c164847;
                        exc11 = exc7;
                        pluginContext21 = pluginContext15;
                        i37 = i20;
                        i36 = i4422;
                        i35 = i22;
                        str36 = str19;
                        str35 = str20;
                        str32 = str21;
                        charSequence20 = charSequence12;
                        c2333110 = c233316;
                        charSequence23 = charSequence11;
                        c16685 = c16684;
                        pluginContext23 = pluginContext14;
                        i39 = i17;
                        sb13 = sb8;
                        sb12 = sb7;
                        str34 = str16;
                        pluginContext22 = pluginContext12;
                        boolean z82222222222222 = z2;
                        view2 = view;
                        c29783 = c29782;
                        z4 = z82222222222222;
                    }
                case 211812141:
                case 957709516:
                    str3 = str35;
                    pluginContext18 = pluginContext21;
                    c233319 = c2333110;
                    str27 = str32;
                    StringBuilder sb22 = sb12;
                    sb9 = sb13;
                    PluginContext pluginContext28 = pluginContext22;
                    str28 = str34;
                    sb10 = sb22;
                    try {
                        sharedPreferences3 = activityC18827.f59398;
                        pluginContext19 = pluginContext28;
                    } catch (Exception e6) {
                        e = e6;
                        pluginContext19 = pluginContext28;
                    }
                    try {
                        charSequence16 = charSequence20;
                    } catch (Exception e7) {
                        e = e7;
                        charSequence16 = charSequence20;
                        exc12 = e;
                        m25666 = C0630.m2566("ۛܶ") ^ i33;
                        i28 = ((m25666 ^ i34) * 20741) ^ (-1072674784);
                        i29 = -194985154;
                        i36 = m25666 ^ i29;
                        i35 = i28;
                        sb13 = sb9;
                        sb12 = sb10;
                        str32 = str27;
                        charSequence20 = charSequence16;
                        c2333110 = c233319;
                        str34 = str28;
                        pluginContext21 = pluginContext18;
                        pluginContext22 = pluginContext19;
                        str35 = str3;
                    }
                    try {
                        z5 = C2520.m8023(sharedPreferences3, c1648410.f24119, c1648410.f50674);
                        m25666 = C0630.m2566("ᩴ۫") ^ i33;
                        i28 = ((m25666 ^ i34) * (-17227)) ^ (-1850517942);
                        i29 = -251038469;
                    } catch (Exception e8) {
                        e = e8;
                        exc12 = e;
                        m25666 = C0630.m2566("ۛܶ") ^ i33;
                        i28 = ((m25666 ^ i34) * 20741) ^ (-1072674784);
                        i29 = -194985154;
                        i36 = m25666 ^ i29;
                        i35 = i28;
                        sb13 = sb9;
                        sb12 = sb10;
                        str32 = str27;
                        charSequence20 = charSequence16;
                        c2333110 = c233319;
                        str34 = str28;
                        pluginContext21 = pluginContext18;
                        pluginContext22 = pluginContext19;
                        str35 = str3;
                    }
                    i36 = m25666 ^ i29;
                    i35 = i28;
                    sb13 = sb9;
                    sb12 = sb10;
                    str32 = str27;
                    charSequence20 = charSequence16;
                    c2333110 = c233319;
                    str34 = str28;
                    pluginContext21 = pluginContext18;
                    pluginContext22 = pluginContext19;
                    str35 = str3;
                case 479911726:
                case 619879056:
                    charSequence13 = charSequence20;
                    str22 = str36;
                    pluginContext12 = pluginContext22;
                    str16 = str34;
                    str23 = str35;
                    pluginContext16 = pluginContext21;
                    i24 = i40;
                    exc8 = exc11;
                    sb7 = sb12;
                    sb8 = sb13;
                    c164848 = c1648410;
                    i17 = i39;
                    pluginContext14 = pluginContext23;
                    c16684 = c16685;
                    charSequence11 = charSequence23;
                    c233317 = c2333110;
                    str24 = str32;
                    boolean z14 = z4;
                    c29782 = c29783;
                    view = view2;
                    z2 = z14;
                    i37 = 60774;
                    int m698112 = C2105.m6981("ܳܶ") ^ i34;
                    i36 = m698112 ^ 981911396;
                    i35 = ((m698112 ^ i33) * (-20145)) ^ (-438088813);
                    i40 = i24;
                    c1648410 = c164848;
                    exc11 = exc8;
                    str32 = str24;
                    pluginContext21 = pluginContext16;
                    str36 = str22;
                    str35 = str23;
                    c2333110 = c233317;
                    charSequence20 = charSequence13;
                    charSequence23 = charSequence11;
                    c16685 = c16684;
                    pluginContext23 = pluginContext14;
                    i39 = i17;
                    sb13 = sb8;
                    sb12 = sb7;
                    str34 = str16;
                    pluginContext22 = pluginContext12;
                    boolean z822222222222222 = z2;
                    view2 = view;
                    c29783 = c29782;
                    z4 = z822222222222222;
                case 511428699:
                case 1664778328:
                    charSequence3 = charSequence20;
                    str5 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str6 = str35;
                    i5 = i37;
                    pluginContext4 = pluginContext21;
                    z = z4;
                    exc2 = exc11;
                    sb = sb12;
                    c2978 = c29783;
                    sb2 = sb13;
                    c164842 = c1648410;
                    i2 = i39;
                    pluginContext5 = pluginContext23;
                    c16682 = c16685;
                    charSequence4 = charSequence23;
                    c233312 = c2333110;
                    str7 = str32;
                    textView2.setEnabled(z);
                    textView = this.f27197;
                    textView.setEnabled(z);
                    if (C0050.f910 < 0) {
                        m6981 = (i33 - C2105.m6981("᩸۟")) * (-57);
                        i6 = ((m6981 ^ i34) * 15211) ^ 362761016;
                        i7 = -1768706867;
                        c1648410 = c164842;
                        exc11 = exc2;
                        str32 = str7;
                        i37 = i5;
                        i36 = m6981 ^ i7;
                        i35 = i6;
                        str36 = str5;
                        c29783 = c2978;
                        c2333110 = c233312;
                        charSequence20 = charSequence3;
                        z4 = z;
                        charSequence23 = charSequence4;
                        c16685 = c16682;
                        pluginContext21 = pluginContext4;
                        str35 = str6;
                        pluginContext23 = pluginContext5;
                        i39 = i2;
                        sb13 = sb2;
                        sb12 = sb;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                    }
                    m6981 = (i33 - C2105.m6981("ۡۛ")) * (-115);
                    i6 = ((m6981 ^ i34) * 4591) ^ 1930433084;
                    i7 = 578103365;
                    c1648410 = c164842;
                    exc11 = exc2;
                    str32 = str7;
                    i37 = i5;
                    i36 = m6981 ^ i7;
                    i35 = i6;
                    str36 = str5;
                    c29783 = c2978;
                    c2333110 = c233312;
                    charSequence20 = charSequence3;
                    z4 = z;
                    charSequence23 = charSequence4;
                    c16685 = c16682;
                    pluginContext21 = pluginContext4;
                    str35 = str6;
                    pluginContext23 = pluginContext5;
                    i39 = i2;
                    sb13 = sb2;
                    sb12 = sb;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case 604040016:
                case 1226835348:
                    charSequence12 = charSequence20;
                    str19 = str36;
                    pluginContext12 = pluginContext22;
                    str16 = str34;
                    str20 = str35;
                    i20 = i37;
                    pluginContext15 = pluginContext21;
                    i21 = i40;
                    exc7 = exc11;
                    sb7 = sb12;
                    sb8 = sb13;
                    c164847 = c1648410;
                    i17 = i39;
                    pluginContext14 = pluginContext23;
                    c16684 = c16685;
                    charSequence11 = charSequence23;
                    c233316 = c2333110;
                    str21 = str32;
                    boolean z15 = z4;
                    c29782 = c29783;
                    view = view2;
                    z2 = z15;
                    s3 = sArr[c];
                    s2 = 46980;
                    if (C0050.f910 < 0) {
                        m25664 = C0630.m2566("ܳ᩶") ^ i34;
                        i22 = ((m25664 ^ i33) * 30669) ^ 534345495;
                        i23 = 1077592454;
                        int i44222 = m25664 ^ i23;
                        i40 = i21;
                        c1648410 = c164847;
                        exc11 = exc7;
                        pluginContext21 = pluginContext15;
                        i37 = i20;
                        i36 = i44222;
                        i35 = i22;
                        str36 = str19;
                        str35 = str20;
                        str32 = str21;
                        charSequence20 = charSequence12;
                        c2333110 = c233316;
                        charSequence23 = charSequence11;
                        c16685 = c16684;
                        pluginContext23 = pluginContext14;
                        i39 = i17;
                        sb13 = sb8;
                        sb12 = sb7;
                        str34 = str16;
                        pluginContext22 = pluginContext12;
                        boolean z8222222222222222 = z2;
                        view2 = view;
                        c29783 = c29782;
                        z4 = z8222222222222222;
                    }
                    m25664 = C0630.m2566("ܽۘ") ^ i33;
                    i22 = ((m25664 ^ i34) * (-32211)) ^ 1470787449;
                    i23 = 743796944;
                    int i442222 = m25664 ^ i23;
                    i40 = i21;
                    c1648410 = c164847;
                    exc11 = exc7;
                    pluginContext21 = pluginContext15;
                    i37 = i20;
                    i36 = i442222;
                    i35 = i22;
                    str36 = str19;
                    str35 = str20;
                    str32 = str21;
                    charSequence20 = charSequence12;
                    c2333110 = c233316;
                    charSequence23 = charSequence11;
                    c16685 = c16684;
                    pluginContext23 = pluginContext14;
                    i39 = i17;
                    sb13 = sb8;
                    sb12 = sb7;
                    str34 = str16;
                    pluginContext22 = pluginContext12;
                    boolean z82222222222222222 = z2;
                    view2 = view;
                    c29783 = c29782;
                    z4 = z82222222222222222;
                case 622334633:
                case 996732634:
                    if (C2167.m7155()) {
                        charSequence = charSequence20;
                        i4 = i39;
                        pluginContext3 = pluginContext23;
                        str = str36;
                        pluginContext = pluginContext22;
                        str2 = str34;
                        str3 = str35;
                        i = i37;
                        pluginContext2 = pluginContext21;
                        c1668 = c16685;
                        i3 = i40;
                        charSequence2 = charSequence23;
                        exc = exc11;
                        sb = sb12;
                        c23331 = c2333110;
                        str4 = str32;
                        sb2 = sb13;
                        c16484 = c1648410;
                        int m69816222 = C2105.m6981("ۤ۠") ^ i34;
                        int i42222 = i4;
                        i35 = ((m69816222 ^ i33) * 11089) ^ (-969075621);
                        c1648410 = c16484;
                        exc11 = exc;
                        str32 = str4;
                        i37 = i;
                        i36 = m69816222 ^ (-505560537);
                        str36 = str;
                        c2333110 = c23331;
                        sb13 = sb2;
                        sb12 = sb;
                        charSequence20 = charSequence;
                        charSequence23 = charSequence2;
                        c16685 = c1668;
                        str34 = str2;
                        pluginContext22 = pluginContext;
                        pluginContext23 = pluginContext3;
                        i39 = i42222;
                        i40 = i3;
                        pluginContext21 = pluginContext2;
                        str35 = str3;
                    } else {
                        charSequence8 = charSequence20;
                        sb6 = sb12;
                        str12 = str35;
                        pluginContext10 = pluginContext21;
                        sb5 = sb13;
                        exc5 = exc11;
                        c233315 = c2333110;
                        str14 = str32;
                        c164845 = c1648410;
                        int m6981922 = (C2105.m6981("ۗ᩷") + i33) * (-109);
                        int i4522 = ((m6981922 ^ i34) * (-13391)) ^ 1160085484;
                        i36 = m6981922 ^ (-1277522189);
                        c1648410 = c164845;
                        str32 = str14;
                        c2333110 = c233315;
                        exc11 = exc5;
                        sb13 = sb5;
                        pluginContext21 = pluginContext10;
                        sb12 = sb6;
                        i35 = i4522;
                        str35 = str12;
                        charSequence20 = charSequence8;
                    }
                case 824256076:
                case 1010030003:
                    str3 = str35;
                    pluginContext2 = pluginContext21;
                    CharSequence charSequence29 = c16685.f24120;
                    if (str32 != null) {
                        int m256613 = (i34 - C0630.m2566("ܺ᩸")) * (-61);
                        charSequence18 = charSequence29;
                        i35 = ((m256613 ^ i33) * 25917) ^ (-1766563);
                        i36 = m256613 ^ (-1180519621);
                        pluginContext21 = pluginContext2;
                        str35 = str3;
                    } else {
                        charSequence18 = charSequence29;
                        charSequence20 = charSequence18;
                        m25667 = C2105.m6981("֡᩵") ^ i33;
                        i30 = ((m25667 ^ i34) * (-1655)) ^ (-1066471807);
                        i31 = 528818988;
                        i36 = m25667 ^ i31;
                        i35 = i30;
                        pluginContext21 = pluginContext2;
                        str35 = str3;
                    }
                case 825269224:
                case 1229485908:
                    C17896 c17896 = (C17896) abstractC7809;
                    C1047.m3601(textView2, c17896.f24118);
                    C1047.m3601(textView, c17896.f24120);
                    break;
                case 1110291041:
                case 2098039967:
                    charSequence5 = charSequence20;
                    str9 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str3 = str35;
                    pluginContext6 = pluginContext21;
                    exc3 = exc11;
                    sb = sb12;
                    c233313 = c2333110;
                    str8 = str32;
                    sb2 = sb13;
                    c164843 = c1648410;
                    i2 = i39;
                    pluginContext5 = pluginContext23;
                    c16683 = c16685;
                    charSequence6 = charSequence23;
                    if (i2 != 2) {
                        m2566 = (C2105.m6981("ۙᩳ") + i33) * 3;
                        i8 = ((m2566 ^ i34) * 28575) ^ 974393447;
                        i9 = 1914316535;
                    } else {
                        m2566 = (C0630.m2566("ۤܿ") ^ i33) * (-97);
                        i8 = ((m2566 ^ i34) * 3233) ^ 83861796;
                        i9 = -1304245899;
                    }
                    i36 = m2566 ^ i9;
                    charSequence23 = charSequence6;
                    i35 = i8;
                    c1648410 = c164843;
                    c16685 = c16683;
                    exc11 = exc3;
                    str32 = str8;
                    c2333110 = c233313;
                    str36 = str9;
                    pluginContext23 = pluginContext5;
                    pluginContext21 = pluginContext6;
                    charSequence20 = charSequence5;
                    i39 = i2;
                    str35 = str3;
                    sb13 = sb2;
                    sb12 = sb;
                    str34 = str2;
                    pluginContext22 = pluginContext;
                case 1232768281:
                case 1251422057:
                    charSequence13 = charSequence20;
                    str22 = str36;
                    pluginContext12 = pluginContext22;
                    str16 = str34;
                    str23 = str35;
                    pluginContext16 = pluginContext21;
                    i24 = i40;
                    exc8 = exc11;
                    sb7 = sb12;
                    sb8 = sb13;
                    c164848 = c1648410;
                    i17 = i39;
                    pluginContext14 = pluginContext23;
                    c16684 = c16685;
                    charSequence11 = charSequence23;
                    c233317 = c2333110;
                    str24 = str32;
                    boolean z16 = z4;
                    c29782 = c29783;
                    view = view2;
                    z2 = z16;
                    i37 = 42050;
                    int m6981122 = C2105.m6981("ܳܶ") ^ i34;
                    i36 = m6981122 ^ 981911396;
                    i35 = ((m6981122 ^ i33) * (-20145)) ^ (-438088813);
                    i40 = i24;
                    c1648410 = c164848;
                    exc11 = exc8;
                    str32 = str24;
                    pluginContext21 = pluginContext16;
                    str36 = str22;
                    str35 = str23;
                    c2333110 = c233317;
                    charSequence20 = charSequence13;
                    charSequence23 = charSequence11;
                    c16685 = c16684;
                    pluginContext23 = pluginContext14;
                    i39 = i17;
                    sb13 = sb8;
                    sb12 = sb7;
                    str34 = str16;
                    pluginContext22 = pluginContext12;
                    boolean z822222222222222222 = z2;
                    view2 = view;
                    c29783 = c29782;
                    z4 = z822222222222222222;
                case 1852155530:
                case 2072133686:
                    charSequence14 = charSequence20;
                    str25 = str36;
                    pluginContext12 = pluginContext22;
                    str16 = str34;
                    str3 = str35;
                    i25 = i37;
                    pluginContext17 = pluginContext21;
                    exc9 = exc11;
                    sb7 = sb12;
                    sb8 = sb13;
                    c164849 = c1648410;
                    i17 = i39;
                    pluginContext14 = pluginContext23;
                    c16684 = c16685;
                    charSequence15 = charSequence23;
                    c233318 = c2333110;
                    str26 = str32;
                    boolean z17 = z4;
                    c29782 = c29783;
                    view = view2;
                    z2 = z17;
                    i40 = 8;
                    m25665 = (C0630.m2566("ۘ۫") ^ i34) * 23;
                    i26 = ((m25665 ^ i33) * (-31797)) ^ (-1365522882);
                    i27 = -712615677;
                    c1648410 = c164849;
                    exc11 = exc9;
                    str32 = str26;
                    i37 = i25;
                    i36 = m25665 ^ i27;
                    i35 = i26;
                    str36 = str25;
                    c2333110 = c233318;
                    pluginContext21 = pluginContext17;
                    charSequence20 = charSequence14;
                    charSequence23 = charSequence15;
                    str35 = str3;
                    c16685 = c16684;
                    pluginContext23 = pluginContext14;
                    i39 = i17;
                    sb13 = sb8;
                    sb12 = sb7;
                    str34 = str16;
                    pluginContext22 = pluginContext12;
                    boolean z8222222222222222222 = z2;
                    view2 = view;
                    c29783 = c29782;
                    z4 = z8222222222222222222;
                default:
                    RunnableC1937.m6377(textView2, c16685.f24118);
                    C1047.m3601(textView, charSequence20);
                    charSequence7 = charSequence20;
                    str11 = str36;
                    pluginContext = pluginContext22;
                    str2 = str34;
                    str12 = str35;
                    pluginContext7 = pluginContext21;
                    exc4 = exc11;
                    sb3 = sb12;
                    c233314 = c2333110;
                    str13 = str32;
                    sb4 = sb13;
                    c164844 = c1648410;
                    i10 = i39;
                    pluginContext9 = pluginContext23;
                    m25662 = (C2105.m6981("᩻ᩳ") + i34) * (-63);
                    pluginContext8 = pluginContext9;
                    i11 = ((m25662 ^ i33) * (-23321)) ^ (-1102113722);
                    i12 = 865890135;
                    i36 = m25662 ^ i12;
                    i35 = i11;
                    pluginContext23 = pluginContext8;
                    c1648410 = c164844;
                    exc11 = exc4;
                    str32 = str13;
                    c2333110 = c233314;
                    i39 = i10;
                    str36 = str11;
                    sb13 = sb4;
                    sb12 = sb3;
                    pluginContext21 = pluginContext7;
                    charSequence20 = charSequence7;
                    str35 = str12;
                    str34 = str2;
                    pluginContext22 = pluginContext;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23071(C17979 c17979, AbstractC7809 abstractC7809, Object obj) {
        C6398 c6398;
        PluginContext pluginContext;
        C6398 c63982;
        ActivityC18827 activityC18827 = null;
        Object obj2 = null;
        Throwable th = null;
        int i = -730565550;
        int i2 = C7811.f24123;
        int i3 = C3683.f11629;
        int m2566 = (C0630.m2566("ܰۜ") + i3) * (-23);
        int i4 = ((m2566 ^ i2) * (-1093)) ^ (-525074996);
        int i5 = -780203678;
        while (true) {
            i = ((((i ^ i2) * 31027) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2117442962:
                case 1053759080:
                    if (C1005.f3721) {
                        m2566 = C0630.m2566("ۡ᩻") ^ i3;
                        i4 = ((m2566 ^ i2) * (-23151)) ^ (-338243002);
                        i5 = 1424212537;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۖ᩷")) * 61;
                        i4 = ((m2566 ^ i2) * (-30245)) ^ 2009348864;
                        i5 = 417985423;
                    }
                case -1983208522:
                case 1592568757:
                    if (obj2 == null) {
                        m2566 = C2105.m6981("۟۠") ^ i2;
                        i4 = ((m2566 ^ i3) * 10511) ^ (-1987627696);
                        i5 = -1734509692;
                    } else {
                        m2566 = (C0630.m2566("ܳ᩷") ^ i3) * 75;
                        i4 = ((m2566 ^ i2) * (-11615)) ^ (-1087563815);
                        i5 = 1868373672;
                    }
                case -1949440115:
                case -691537885:
                    if (C1711.f5919) {
                        m2566 = C2105.m6981("ۜۚ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-17053)) ^ 1427160125;
                        i5 = -1995695692;
                    } else {
                        m2566 = C2105.m6981("ۘۤ") ^ i2;
                        i4 = ((m2566 ^ i3) * 22607) ^ (-1229051702);
                        i5 = -2128556473;
                    }
                case -1847996879:
                case -813873042:
                    if (C3663.f11553) {
                        m2566 = (i3 - C0630.m2566("ۖ᩷")) * 61;
                        i4 = ((m2566 ^ i2) * (-30245)) ^ 2009348864;
                        i5 = 417985423;
                    } else {
                        m2566 = (C0630.m2566("᩶᩻") + i2) * (-67);
                        i4 = ((m2566 ^ i3) * 27555) ^ (-1959631865);
                        i5 = -1314251140;
                    }
                case -1774286298:
                case -425255131:
                    if (C5695.f17556 >= 0) {
                        m2566 = C0630.m2566("ۢ۠") ^ i2;
                        i4 = ((m2566 ^ i3) * 493) ^ (-726029373);
                        i5 = 1717720190;
                    } else {
                        m2566 = (C0630.m2566("۟ۡ") + i3) * 13;
                        i4 = ((m2566 ^ i2) * (-21835)) ^ 1762638589;
                        i5 = 1172439905;
                    }
                case -1603998610:
                case -202421704:
                    if (C7106.f21815 == 0) {
                        m2566 = C2105.m6981("۬ۗ") ^ i2;
                        i4 = ((m2566 ^ i3) * 3821) ^ (-998013750);
                        i5 = 1833767108;
                    } else {
                        m2566 = C2105.m6981("ۜۚ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-17053)) ^ 1427160125;
                        i5 = -1995695692;
                    }
                case -1494459779:
                case -1113802082:
                    break;
                case -1408818506:
                case -859806773:
                    c63982 = activityC18827.f59395;
                    c63982.f19804.onChange(c17979, (PluginPreference.PreferenceItem) abstractC7809.f24117, obj);
                    m2566 = C2105.m6981("᩵ۢ") ^ i3;
                    i4 = ((m2566 ^ i2) * 21285) ^ (-1593788224);
                    i5 = 1382588573;
                case -1263287145:
                case 1510812325:
                    pluginContext = activityC18827.f59393;
                    pluginContext.log(th);
                    ServiceConnectionC3453.m10561(activityC18827, th, null);
                    m2566 = C0630.m2566("᩺ۡ") ^ i2;
                    i4 = ((m2566 ^ i3) * (-4741)) ^ 149957692;
                    i5 = -1163827701;
                case -1214217720:
                case -230665757:
                    activityC18827 = this.f27194;
                    c6398 = activityC18827.f59395;
                    if (c6398.f19804 != null) {
                        m2566 = (i3 - C2105.m6981("ۘ᩷")) * 73;
                        i4 = ((m2566 ^ i2) * (-2553)) ^ 1322479555;
                        i5 = -325216746;
                    } else {
                        m2566 = C0630.m2566("᩺ۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-4741)) ^ 149957692;
                        i5 = -1163827701;
                    }
                case -1114709784:
                case 189962475:
                    break;
                case -1024918197:
                case 1542889220:
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = C2105.m6981("ۜۚ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-17053)) ^ 1427160125;
                        i5 = -1995695692;
                    } else {
                        m2566 = C2105.m6981("᩻᩺") ^ i2;
                        i4 = ((m2566 ^ i3) * 4287) ^ 1210547604;
                        i5 = 539640873;
                    }
                case -991431744:
                case -678277881:
                    C1711.m5736();
                    break;
                case -974935665:
                case -591591192:
                    C4159.m12565();
                    if (C0964.f3626 == 0) {
                        m2566 = C0630.m2566("ۢ۠") ^ i2;
                        i4 = ((m2566 ^ i3) * 493) ^ (-726029373);
                        i5 = 1717720190;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۖ᩷")) * 61;
                        i4 = ((m2566 ^ i2) * (-30245)) ^ 2009348864;
                        i5 = 417985423;
                    }
                case -757396853:
                case 789709026:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = C2105.m6981("ۜۚ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-17053)) ^ 1427160125;
                        i5 = -1995695692;
                    } else {
                        m2566 = C0630.m2566("ۛۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30653)) ^ (-58338352);
                        i5 = -618473025;
                    }
                case -592126304:
                case -395475052:
                    if (C0237.f1507 != 0) {
                        m2566 = C2105.m6981("ۜۚ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-17053)) ^ 1427160125;
                        i5 = -1995695692;
                    } else {
                        m2566 = C2105.m6981("ܺۘ") ^ i3;
                        i4 = ((m2566 ^ i2) * 16677) ^ 118581844;
                        i5 = -1717640118;
                    }
                case -571407050:
                case 412724060:
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = (C0630.m2566("ۖ۠") + i3) * 115;
                        i4 = ((m2566 ^ i2) * 18379) ^ (-824881824);
                        i5 = -409898915;
                    } else {
                        m2566 = (C0630.m2566("ᩴ᩻") + i3) * 9;
                        i4 = ((m2566 ^ i2) * 17491) ^ 926792194;
                        i5 = 1789117943;
                    }
                case -467449833:
                case 695035170:
                    try {
                        abstractC7809.f24117 = new C2599(activityC18827, abstractC7809);
                        m2566 = (C0630.m2566("ܳ᩷") ^ i3) * 75;
                        i4 = ((m2566 ^ i2) * (-11615)) ^ (-1087563815);
                        i5 = 1868373672;
                    } catch (Throwable th2) {
                        th = th2;
                        m2566 = (i3 - C2105.m6981("ܿ᩺")) * (-123);
                        i4 = ((m2566 ^ i2) * 13537) ^ 1263050639;
                        i5 = -650947649;
                    }
                case 271296844:
                case 956041101:
                    C1005.m3501();
                    if (C3683.f11629 >= 0) {
                        m2566 = (i3 - C0630.m2566("ۖ᩷")) * 61;
                        i4 = ((m2566 ^ i2) * (-30245)) ^ 2009348864;
                        i5 = 417985423;
                    } else {
                        m2566 = (i2 - C2105.m6981("ۛܿ")) * (-59);
                        i4 = ((m2566 ^ i3) * 17471) ^ (-1116561080);
                        i5 = -1536244038;
                    }
                case 282822633:
                case 1830404985:
                    if (C2167.f7158 >= 0) {
                        m2566 = C2105.m6981("ۜۚ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-17053)) ^ 1427160125;
                        i5 = -1995695692;
                    } else {
                        m2566 = C0630.m2566("ۘܺ") ^ i2;
                        i4 = ((m2566 ^ i3) * 7803) ^ (-1447470222);
                        i5 = -1452690055;
                    }
                case 582085884:
                case 818991116:
                    if (C4263.f13799 <= 0) {
                        m2566 = C0630.m2566("ۢ۠") ^ i2;
                        i4 = ((m2566 ^ i3) * 493) ^ (-726029373);
                        i5 = 1717720190;
                    } else {
                        m2566 = (C0630.m2566("᩵ۚ") ^ i3) * 65;
                        i4 = ((m2566 ^ i2) * (-15735)) ^ 426172836;
                        i5 = -211506227;
                    }
                case 794320292:
                case 1458558760:
                    obj2 = abstractC7809.f24117;
                    m2566 = (C2105.m6981("ۧܿ") ^ i2) * 11;
                    i4 = ((m2566 ^ i3) * (-18945)) ^ 1076054891;
                    i5 = 748400323;
                case 799320163:
                case 1507584117:
                    if (C3663.m11168() >= 0) {
                        m2566 = (i3 - C0630.m2566("ۖ᩷")) * 61;
                        i4 = ((m2566 ^ i2) * (-30245)) ^ 2009348864;
                        i5 = 417985423;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۜۤ")) * 43;
                        i4 = ((m2566 ^ i2) * (-8333)) ^ (-143076);
                        i5 = 793637807;
                    }
                case 1556716499:
                case 1644243402:
                    C0798.m2998();
                    C1711.m5736();
                    m2566 = C0630.m2566("ۢ۠") ^ i2;
                    i4 = ((m2566 ^ i3) * 493) ^ (-726029373);
                    i5 = 1717720190;
                case 1792198548:
                case 1798165654:
                    if (C3432.f10845 >= 0) {
                        m2566 = (C0630.m2566("ۖ۠") + i3) * 115;
                        i4 = ((m2566 ^ i2) * 18379) ^ (-824881824);
                        i5 = -409898915;
                    } else {
                        m2566 = C2105.m6981("ᩳ۟") ^ i3;
                        i4 = ((m2566 ^ i2) * (-9363)) ^ 1550299425;
                        i5 = 913049194;
                    }
                default:
                    if (C0483.m2121()) {
                        m2566 = C2105.m6981("۬ۗ") ^ i2;
                        i4 = ((m2566 ^ i3) * 3821) ^ (-998013750);
                        i5 = 1833767108;
                    } else {
                        m2566 = C0630.m2566("ۢ۠") ^ i2;
                        i4 = ((m2566 ^ i3) * 493) ^ (-726029373);
                        i5 = 1717720190;
                    }
            }
            return;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r63) {
        /*
            Method dump skipped, instructions count: 6764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC8949.onClick(android.view.View):void");
    }
}
