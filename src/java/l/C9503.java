package l;

import android.R;
import android.content.Context;
import android.database.DataSetObserver;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.custom.sec.SecP160R2Field;

/* compiled from: J5HS */
/* renamed from: l.ۢۢۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C9503 extends ListView {

    /* renamed from: ۟᩸᩺, reason: not valid java name and contains not printable characters */
    private static final short[] f28845 = {7772, 22400, 22412, 22414, 22477, 22400, 22402, 22414, 22406, 22415, 22477, 22417, 22422, 22413, 22423, 22410, 22414, 22406, 22477, 22445, 22402, 22423, 22410, 22421, 22406, 22438, 22413, 22404, 22410, 22413, 22406, 22414, 22423, 22427, 22477, 22445, 22402, 22423, 22410, 22421, 22406, 22436, 22422, 22402, 22417, 22407};

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C14792 f28846;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public float f28847;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f28848;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f28849;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f28850;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f28851;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f28852;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f28853;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f28854;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f28855;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f28856;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f28857;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f28858;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f28859;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C13064 f28860;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f28861;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public AdapterView.OnItemLongClickListener f28862;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f28863;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final HandlerC6680 f28864;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f28865;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f28866;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public boolean f28867;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f28868;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public long f28869;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View.OnTouchListener f28870;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final DataSetObserver f28871;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f28872;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public AbsListView.OnScrollListener f28873;

    static {
        boolean z = false;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = -327625971;
        int i5 = RunnableC3474.f10992;
        int i6 = C1294.f4556;
        int m2566 = C0630.m2566("ۖܺ") ^ i6;
        int i7 = ((m2566 ^ i5) * 12325) ^ 1209353895;
        int i8 = -1612059910;
        while (true) {
            i4 = ((((i4 ^ i5) * 10579) >> 31) & i7) ^ (m2566 ^ i8);
            switch (i4) {
                case -2091426825:
                case 1863345686:
                    i = s + 14445;
                    if (C1005.m3501()) {
                        m2566 = C0630.m2566("ۙ᩹") ^ i6;
                        i7 = ((m2566 ^ i5) * 23587) ^ (-294305636);
                        i8 = 408853188;
                    } else {
                        m2566 = C0630.m2566("᩶֨") ^ i5;
                        i7 = ((m2566 ^ i6) * (-8565)) ^ (-529903244);
                        i8 = 1237028394;
                    }
                case -2067968034:
                case -63228898:
                    if (C7106.f21815 != 0) {
                        m2566 = (C0630.m2566("ۡۙ") ^ i6) * (-17);
                        i7 = ((m2566 ^ i5) * 25101) ^ 396749907;
                        i8 = 180115376;
                    } else {
                        m2566 = C0630.m2566("ۘ֡") ^ i5;
                        i7 = ((m2566 ^ i6) * (-19077)) ^ 866737814;
                        i8 = 1017717017;
                    }
                case -1804781598:
                case 1302626535:
                    C2520.m8026();
                    m2566 = (C2105.m6981("᩵ܳ") ^ i6) * 87;
                    i7 = ((m2566 ^ i5) * (-3013)) ^ 414271211;
                    i8 = 430872320;
                case -1764378576:
                case -1693925751:
                    if (C0964.m3413()) {
                        m2566 = (i6 - C2105.m6981("᩺ۘ")) * (-7);
                        i7 = ((m2566 ^ i5) * 30791) ^ (-1561127113);
                        i8 = 1994696181;
                    } else {
                        m2566 = C0630.m2566("᩷ۤ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-29473)) ^ (-1943603487);
                        i8 = 1642683197;
                    }
                case -1630438231:
                case -1573096088:
                    if (C2167.m7155()) {
                        m2566 = C0630.m2566("᩷ۤ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-29473)) ^ (-1943603487);
                        i8 = 1642683197;
                    } else {
                        m2566 = C2105.m6981("᩷۫") ^ i5;
                        i7 = ((m2566 ^ i6) * (-14131)) ^ 1793589664;
                        i8 = 716937120;
                    }
                case -1589409795:
                case 676493941:
                    C1773.m5908();
                    if (C3663.f11553) {
                        m2566 = C0630.m2566("᩷ۤ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-29473)) ^ (-1943603487);
                        i8 = 1642683197;
                    } else {
                        m2566 = (C2105.m6981("ܰۡ") ^ i5) * 77;
                        i7 = ((m2566 ^ i6) * (-24151)) ^ (-1312367398);
                        i8 = 1053462667;
                    }
                case -1530564620:
                case -1412024844:
                    return;
                case -1495993852:
                case 1160888055:
                    i3 = 22499;
                    m2566 = C2105.m6981("᩶᩸") ^ i6;
                    i7 = ((m2566 ^ i5) * 18915) ^ 893112088;
                    i8 = 1224316359;
                case -1419475361:
                case 1077740496:
                    s = sArr[c];
                    if (C3683.f11629 >= 0) {
                        m2566 = C0630.m2566("᩷ۤ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-29473)) ^ (-1943603487);
                        i8 = 1642683197;
                    } else {
                        m2566 = (C0630.m2566("ۙ᩸") + i5) * (-53);
                        i7 = ((m2566 ^ i6) * 6203) ^ (-1357976556);
                        i8 = 963028563;
                    }
                case -1219050961:
                case -272887263:
                    i2 = i * i;
                    s2 = 57780;
                    if (C1916.f6442) {
                        m2566 = (i5 - C0630.m2566("ۧۡ")) * 71;
                        i7 = ((m2566 ^ i6) * (-30675)) ^ (-2088224838);
                        i8 = 37421359;
                    } else {
                        m2566 = (C2105.m6981("᩵ܳ") ^ i6) * 87;
                        i7 = ((m2566 ^ i5) * (-3013)) ^ 414271211;
                        i8 = 430872320;
                    }
                case -823994789:
                case 1713329263:
                    C2126.m7040();
                    if (C3537.m10746() > 0) {
                        m2566 = (C2105.m6981("᩵ܳ") ^ i6) * 87;
                        i7 = ((m2566 ^ i5) * (-3013)) ^ 414271211;
                        i8 = 430872320;
                    } else {
                        m2566 = (i5 - C0630.m2566("ܰ֡")) * (-59);
                        i7 = ((m2566 ^ i6) * (-20393)) ^ (-1310453579);
                        i8 = 1734327434;
                    }
                case -699796878:
                case 138970022:
                    RunnableC0588.m2441();
                    if (C7106.f21815 != 0) {
                        m2566 = (C2105.m6981("ܰۡ") ^ i5) * 77;
                        i7 = ((m2566 ^ i6) * (-24151)) ^ (-1312367398);
                        i8 = 1053462667;
                    } else {
                        m2566 = (C0630.m2566("ۡۙ") ^ i6) * (-17);
                        i7 = ((m2566 ^ i5) * 25101) ^ 396749907;
                        i8 = 180115376;
                    }
                case -438241022:
                case 1706386102:
                    if (C4263.f13799 <= 0) {
                        m2566 = (C2105.m6981("᩵ܳ") ^ i6) * 87;
                        i7 = ((m2566 ^ i5) * (-3013)) ^ 414271211;
                        i8 = 430872320;
                    } else {
                        m2566 = (C2105.m6981("ܰۡ") ^ i5) * 77;
                        i7 = ((m2566 ^ i6) * (-24151)) ^ (-1312367398);
                        i8 = 1053462667;
                    }
                case -403542738:
                case 2066431354:
                    z = true;
                    m2566 = (C2105.m6981("֡ۛ") + i5) * 89;
                    i7 = ((m2566 ^ i6) * 9385) ^ 1619482946;
                    i8 = 1000949392;
                case -6433252:
                case 2038328744:
                    i3 = 57946;
                    m2566 = C2105.m6981("᩶᩸") ^ i6;
                    i7 = ((m2566 ^ i5) * 18915) ^ 893112088;
                    i8 = 1224316359;
                case 156837495:
                case 1243154734:
                    try {
                        Class.forName(C0483.m2128(f28845, 31, 15, i3));
                        C2568.f8121 = z;
                    } catch (Exception unused) {
                    }
                    m2566 = C0630.m2566("ۙۚ") ^ i6;
                    i7 = ((m2566 ^ i5) * (-13405)) ^ (-1071977131);
                    i8 = 197985022;
                case 265188273:
                case 1046533277:
                    C1504.m5179();
                    if (C0630.f2410 > 0) {
                        m2566 = (C2105.m6981("ܰۡ") ^ i5) * 77;
                        i7 = ((m2566 ^ i6) * (-24151)) ^ (-1312367398);
                        i8 = 1053462667;
                    } else {
                        m2566 = C2105.m6981("ᩳۡ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-18475)) ^ 1704481628;
                        i8 = 1256945127;
                    }
                case 472602168:
                case 820086773:
                    sArr = f28845;
                    c = 0;
                    if (C21923.m49329()) {
                        m2566 = (i5 - C0630.m2566("ܰ֡")) * (-59);
                        i7 = ((m2566 ^ i6) * (-20393)) ^ (-1310453579);
                        i8 = 1734327434;
                    } else {
                        m2566 = (C0630.m2566("֫᩹") + i6) * (-41);
                        i7 = ((m2566 ^ i5) * 30815) ^ (-1959578769);
                        i8 = 1430652119;
                    }
                case 635095978:
                case 952870534:
                    if ((s * s2) - i2 > 0) {
                        m2566 = C2105.m6981("ܶܿ") ^ i6;
                        i7 = ((m2566 ^ i5) * 19521) ^ 1222565563;
                        i8 = 1351976702;
                    } else {
                        m2566 = (i5 - C0630.m2566("ۗ֫")) * (-115);
                        i7 = ((m2566 ^ i6) * (-31881)) ^ (-1451025551);
                        i8 = -1523346143;
                    }
                case 799380850:
                case 1698923971:
                    C0483.m2121();
                    C1916.m6308();
                    throw new RuntimeException();
                case 826919935:
                case 2137668953:
                    try {
                        Class.forName(AbstractC2021.m6573(f28845, 1, 30, i3));
                        C2568.f8121 = z;
                    } catch (Exception unused2) {
                    }
                    m2566 = C2105.m6981("ܿۨ") ^ i5;
                    i7 = ((m2566 ^ i6) * (-7257)) ^ 157693328;
                    i8 = 1756564563;
                case 1166579923:
                case 1263690073:
                    if (C3245.f10203 <= 0) {
                        m2566 = C0630.m2566("᩷ۤ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-29473)) ^ (-1943603487);
                        i8 = 1642683197;
                    } else {
                        m2566 = (C0630.m2566("ۖ֡") ^ i6) * 49;
                        i7 = ((m2566 ^ i5) * (-29295)) ^ (-2021344355);
                        i8 = 69210750;
                    }
                case 1550638094:
                case 1791796525:
                    if (C0798.m2998() == 0) {
                        m2566 = (C2105.m6981("ܰۡ") ^ i5) * 77;
                        i7 = ((m2566 ^ i6) * (-24151)) ^ (-1312367398);
                        i8 = 1053462667;
                    } else {
                        m2566 = (C0630.m2566("ܶۨ") + i5) * (-99);
                        i7 = ((m2566 ^ i6) * 475) ^ (-836091116);
                        i8 = 532253854;
                    }
                case 1564685693:
                case 1874640158:
                    if (C0237.f1507 != 0) {
                        m2566 = (C0630.m2566("ܶۨ") + i5) * (-99);
                        i7 = ((m2566 ^ i6) * 475) ^ (-836091116);
                        i8 = 532253854;
                    } else {
                        m2566 = (i6 - C2105.m6981("ܽܰ")) * (-57);
                        i7 = ((m2566 ^ i5) * 25179) ^ 1270543102;
                        i8 = -1657401151;
                    }
                default:
                    if (C7106.f21815 != 0) {
                        m2566 = (i5 - C0630.m2566("ܰ֡")) * (-59);
                        i7 = ((m2566 ^ i6) * (-20393)) ^ (-1310453579);
                        i8 = 1734327434;
                    } else {
                        m2566 = (i5 - C2105.m6981("֫ۢ")) * (-53);
                        i7 = ((m2566 ^ i6) * 23409) ^ (-2045477136);
                        i8 = 562136827;
                    }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m24348(C9503 c9503) {
        long j = 0;
        long j2 = 0;
        int i = 1477706038;
        int i2 = C0422.f1886;
        int i3 = C3019.f9544;
        int m2566 = C0630.m2566("᩶ۙ") ^ i2;
        int i4 = ((m2566 ^ i3) * 2155) ^ (-1959490423);
        int i5 = -731574931;
        while (true) {
            i = ((((i ^ i3) * (-14299)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2018395753:
                case 1823665726:
                    c9503.f28868 = j + j2;
                    break;
                case -1897085109:
                case 848003044:
                    C1047.m3599();
                    if (C3911.m11924() <= 0) {
                        m2566 = (C0630.m2566("۬᩹") + i3) * (-95);
                        i4 = ((m2566 ^ i2) * 17115) ^ (-943047746);
                        i5 = -2069070935;
                    } else {
                        m2566 = C0630.m2566("᩷ۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * 29185) ^ (-1878604279);
                        i5 = 368422130;
                    }
                case -1862160990:
                case -1112597614:
                    if (C3746.m11369() >= 0) {
                        m2566 = (i3 - C0630.m2566("ۧ۟")) * (-105);
                        i4 = ((m2566 ^ i2) * 29869) ^ 1476705755;
                        i5 = 1624440906;
                    } else {
                        m2566 = (C2105.m6981("᩶۟") + i3) * (-107);
                        i4 = ((m2566 ^ i2) * (-31213)) ^ (-1997258977);
                        i5 = 1347930;
                    }
                case -1831904512:
                case -863144625:
                    j = C3537.m10751();
                    if (C7811.f24123 >= 0) {
                        m2566 = (i3 - C0630.m2566("ۧ۟")) * (-105);
                        i4 = ((m2566 ^ i2) * 29869) ^ 1476705755;
                        i5 = 1624440906;
                    } else {
                        m2566 = (C0630.m2566("ܿۜ") + i2) * 37;
                        i4 = ((m2566 ^ i3) * (-18159)) ^ (-204680847);
                        i5 = 867190298;
                    }
                case -1715959380:
                case -1405808681:
                    j2 = 500;
                    if (C1916.m6308() >= 0) {
                        m2566 = (C0630.m2566("ܶ᩶") ^ i3) * (-97);
                        i4 = ((m2566 ^ i2) * (-15545)) ^ (-483731944);
                        i5 = 2067780955;
                    } else {
                        m2566 = C0630.m2566("۫۫") ^ i2;
                        i4 = ((m2566 ^ i3) * 19421) ^ (-1629584252);
                        i5 = -1621481482;
                    }
                case -1658551533:
                case -235132184:
                    if (C4263.f13799 <= 0) {
                        m2566 = (i3 - C0630.m2566("ۧ۟")) * (-105);
                        i4 = ((m2566 ^ i2) * 29869) ^ 1476705755;
                        i5 = 1624440906;
                    } else {
                        m2566 = C0630.m2566("ۙܽ") ^ i2;
                        i4 = ((m2566 ^ i3) * 30611) ^ (-604062206);
                        i5 = -1088762628;
                    }
                case -1630285981:
                case -623625136:
                    RunnableC1937.m6387();
                    C0964.m3413();
                    break;
                case -1617864663:
                case -1025096361:
                    if (C2958.m9034() <= 0) {
                        m2566 = (C0630.m2566("۬᩹") + i3) * (-95);
                        i4 = ((m2566 ^ i2) * 17115) ^ (-943047746);
                        i5 = -2069070935;
                    } else {
                        m2566 = (i2 - C2105.m6981("ܺ۬")) * (-73);
                        i4 = ((m2566 ^ i3) * 22997) ^ 191905165;
                        i5 = 1948914203;
                    }
                case -1477356423:
                case 1001030484:
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = C0630.m2566("᩷ۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * 29185) ^ (-1878604279);
                        i5 = 368422130;
                    } else {
                        m2566 = (i3 - C2105.m6981("ۜܺ")) * (-33);
                        i4 = ((m2566 ^ i2) * (-22891)) ^ 1531013078;
                        i5 = 366287964;
                    }
                case -1450024404:
                case 819073915:
                    if (C3746.f11829 <= 0) {
                        m2566 = (C0630.m2566("ܶ᩶") ^ i3) * (-97);
                        i4 = ((m2566 ^ i2) * (-15545)) ^ (-483731944);
                        i5 = 2067780955;
                    } else {
                        m2566 = (C0630.m2566("ۧۙ") ^ i3) * (-33);
                        i4 = ((m2566 ^ i2) * (-21597)) ^ (-1831657274);
                        i5 = -1345835914;
                    }
                case -679480052:
                case -372637342:
                    C3683.m11222();
                    if (RunnableC3474.f10992 <= 0) {
                        m2566 = C2105.m6981("֫ۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-3315)) ^ (-395232326);
                        i5 = -2043135234;
                    } else {
                        m2566 = (C0630.m2566("۬᩹") + i3) * (-95);
                        i4 = ((m2566 ^ i2) * 17115) ^ (-943047746);
                        i5 = -2069070935;
                    }
                case -266964993:
                case 1268552690:
                    if (C0798.f2919) {
                        m2566 = (C0630.m2566("۬᩹") + i3) * (-95);
                        i4 = ((m2566 ^ i2) * 17115) ^ (-943047746);
                        i5 = -2069070935;
                    } else {
                        m2566 = (i2 - C0630.m2566("᩶ᩳ")) * 15;
                        i4 = ((m2566 ^ i3) * 1969) ^ (-1882505349);
                        i5 = -1866519936;
                    }
                case 220058787:
                case 2147004683:
                    C1504.m5179();
                    if (C0382.f1805) {
                        m2566 = C2105.m6981("֫ۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-3315)) ^ (-395232326);
                        i5 = -2043135234;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۧ۟")) * (-105);
                        i4 = ((m2566 ^ i2) * 29869) ^ 1476705755;
                        i5 = 1624440906;
                    }
                case 1410869172:
                case 2092353790:
                    C3746.m11369();
                    ServiceConnectionC3453.m10564();
                    m2566 = C2105.m6981("֫ۧ") ^ i2;
                    i4 = ((m2566 ^ i3) * (-3315)) ^ (-395232326);
                    i5 = -2043135234;
                case 1463981191:
                case 2140338764:
                    if (C1128.f4106 <= 0) {
                        m2566 = C2105.m6981("֫ۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-3315)) ^ (-395232326);
                        i5 = -2043135234;
                    } else {
                        m2566 = (C0630.m2566("ܶۨ") ^ i3) * (-81);
                        i4 = ((m2566 ^ i2) * 2747) ^ 1244957083;
                        i5 = 219017865;
                    }
                default:
                    if (C1294.f4556 >= 0) {
                        m2566 = (i3 - C0630.m2566("ۧ۟")) * (-105);
                        i4 = ((m2566 ^ i2) * 29869) ^ 1476705755;
                        i5 = 1624440906;
                    } else {
                        m2566 = C2105.m6981("ۨܳ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-8167)) ^ (-1718255647);
                        i5 = -1842106633;
                    }
            }
            return;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m24350() {
        C14792 c14792 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        float f3 = 0.0f;
        int i4 = 953255409;
        int i5 = ViewOnClickListenerC1958.f6529;
        int i6 = RunnableC0588.f2309;
        int m6981 = C2105.m6981("۠᩷") ^ i6;
        int i7 = ((m6981 ^ i5) * 28777) ^ 1047149493;
        int i8 = 1829522185;
        while (true) {
            i4 = ((((i4 ^ i5) * (-1883)) >> 31) & i7) ^ (m6981 ^ i8);
            switch (i4) {
                case -2132246929:
                case 1795968384:
                    if (C11340.f33930 >= 0) {
                        m6981 = (i6 - C0630.m2566("ܰۛ")) * 7;
                        i7 = ((m6981 ^ i5) * 26759) ^ (-130209480);
                        i8 = 1620410254;
                    } else {
                        m6981 = (C2105.m6981("ܶ᩷") ^ i6) * 47;
                        i7 = ((m6981 ^ i5) * (-7143)) ^ (-826871493);
                        i8 = 442022763;
                    }
                case -1870558451:
                case 937201411:
                    if (C0237.f1507 != 0) {
                        m6981 = (i6 - C0630.m2566("ܰۛ")) * 7;
                        i7 = ((m6981 ^ i5) * 26759) ^ (-130209480);
                        i8 = 1620410254;
                    } else {
                        m6981 = (C0630.m2566("ۨ֡") + i5) * (-113);
                        i7 = ((m6981 ^ i6) * 7867) ^ (-1518117434);
                        i8 = -1651909000;
                    }
                case -1838027201:
                case -742424308:
                    return false;
                case -1823408529:
                case 1602690300:
                    if (this.f28867) {
                        m6981 = (C0630.m2566("᩺᩵") + i6) * 37;
                        i7 = ((m6981 ^ i5) * (-16145)) ^ (-1512971444);
                        i8 = 879121675;
                    } else {
                        m6981 = (C0630.m2566("ۙ᩹") + i6) * (-105);
                        i7 = ((m6981 ^ i5) * 30949) ^ 73085619;
                        i8 = -1545607798;
                    }
                case -1773637113:
                case -1380196615:
                    if (C22628.f73083 <= 0) {
                        m6981 = (i6 - C0630.m2566("ܰۛ")) * 7;
                        i7 = ((m6981 ^ i5) * 26759) ^ (-130209480);
                        i8 = 1620410254;
                    } else {
                        m6981 = (C0630.m2566("֨֨") + i5) * (-29);
                        i7 = ((m6981 ^ i6) * 31813) ^ 968132733;
                        i8 = 485337413;
                    }
                case -1508946865:
                case 1341913085:
                    f3 = i3;
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = C0630.m2566("᩺۠") ^ i6;
                        i7 = ((m6981 ^ i5) * 12287) ^ (-1976585344);
                        i8 = -525315334;
                    } else {
                        m6981 = (i6 - C0630.m2566("ᩴۙ")) * 19;
                        i7 = ((m6981 ^ i5) * (-19563)) ^ (-959219565);
                        i8 = 1867573414;
                    }
                case -1487463759:
                case 2034800371:
                    if (C1005.f3721) {
                        m6981 = C0630.m2566("ۙܺ") ^ i6;
                        i7 = ((m6981 ^ i5) * (-25899)) ^ 430314019;
                        i8 = -422143979;
                    } else {
                        m6981 = (C2105.m6981("ۤۗ") + i5) * (-111);
                        i7 = ((m6981 ^ i6) * (-4719)) ^ 1147166651;
                        i8 = 346930503;
                    }
                case -1162165480:
                case 1968032118:
                    if (this.f28867) {
                        m6981 = (C2105.m6981("۠ᩴ") + i6) * (-53);
                        i7 = ((m6981 ^ i5) * 1647) ^ 379546700;
                        i8 = 629461427;
                    } else {
                        m6981 = (i5 - C2105.m6981("ᩴ᩸")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i7 = ((m6981 ^ i6) * (-6611)) ^ 26894805;
                        i8 = 271739703;
                    }
                case -1122165115:
                case -351402650:
                    if (c14792.f45162 > c14792.f45166) {
                        m6981 = (i6 - C2105.m6981("ۤۛ")) * 13;
                        i7 = ((m6981 ^ i5) * (-24283)) ^ 1495726502;
                        i8 = -1235963930;
                    } else {
                        m6981 = (i5 - C2105.m6981("ۤۤ")) * (-73);
                        i7 = ((m6981 ^ i6) * 3115) ^ 625123609;
                        i8 = -777351715;
                    }
                case -974155477:
                case 1181374824:
                    C1294.m4372();
                    if (C2272.f7362) {
                        m6981 = (i6 - C0630.m2566("ܰۛ")) * 7;
                        i7 = ((m6981 ^ i5) * 26759) ^ (-130209480);
                        i8 = 1620410254;
                    } else {
                        m6981 = C0630.m2566("ۚ۟") ^ i5;
                        i7 = ((m6981 ^ i6) * 5423) ^ 2000820430;
                        i8 = 1917810057;
                    }
                case -895374061:
                case 1737778750:
                    i = getCount();
                    i2 = C3746.m11358(this);
                    if (i2 > 0) {
                        m6981 = (C2105.m6981("᩻ۜ") ^ i6) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i7 = ((m6981 ^ i5) * (-30797)) ^ (-1301241055);
                        i8 = 181781805;
                    } else {
                        m6981 = (i5 - C2105.m6981("ۤۤ")) * (-73);
                        i7 = ((m6981 ^ i6) * 3115) ^ 625123609;
                        i8 = -777351715;
                    }
                case -623757183:
                case -225858810:
                    RunnableC3474.m10630();
                    if (C0382.m1848()) {
                        m6981 = C0630.m2566("۫ۛ") ^ i6;
                        i7 = ((m6981 ^ i5) * (-32151)) ^ (-314983119);
                        i8 = -1588235672;
                    } else {
                        m6981 = (i6 - C0630.m2566("ܰۛ")) * 7;
                        i7 = ((m6981 ^ i5) * 26759) ^ (-130209480);
                        i8 = 1620410254;
                    }
                case -595600474:
                case 644614907:
                    C0798.m2998();
                    return false;
                case -560605433:
                case 1318974542:
                    if (RunnableC3474.m10630()) {
                        m6981 = C0630.m2566("ۗ᩹") ^ i5;
                        i7 = ((m6981 ^ i6) * (-24347)) ^ 36204911;
                        i8 = 1175436822;
                    } else {
                        m6981 = C0630.m2566("᩺۠") ^ i6;
                        i7 = ((m6981 ^ i5) * 12287) ^ (-1976585344);
                        i8 = -525315334;
                    }
                case -469176846:
                case 559492463:
                    if (C3245.f10203 <= 0) {
                        m6981 = (i6 - C0630.m2566("ܰۛ")) * 7;
                        i7 = ((m6981 ^ i5) * 26759) ^ (-130209480);
                        i8 = 1620410254;
                    } else {
                        m6981 = C2105.m6981("ܰۙ") ^ i6;
                        i7 = ((m6981 ^ i5) * 141) ^ (-261561420);
                        i8 = -681120184;
                    }
                case -397624555:
                case 967949030:
                    f2 = i;
                    i3 = m24354();
                    if (C4616.f14690 <= 0) {
                        m6981 = (C2105.m6981("ܽ֨") + i5) * (-35);
                        i7 = ((m6981 ^ i6) * 7877) ^ 242510318;
                        i8 = -1512890245;
                    } else {
                        m6981 = C2105.m6981("۠ۜ") ^ i5;
                        i7 = ((m6981 ^ i6) * (-9377)) ^ (-247625042);
                        i8 = -231984252;
                    }
                case -311031423:
                case 1379875354:
                    c14792 = this.f28846;
                    f = c14792.f45167;
                    if (RunnableC1937.m6387() != 0) {
                        m6981 = (i6 - C0630.m2566("ܰۛ")) * 7;
                        i7 = ((m6981 ^ i5) * 26759) ^ (-130209480);
                        i8 = 1620410254;
                    } else {
                        m6981 = C0630.m2566("ۙ֫") ^ i5;
                        i7 = ((m6981 ^ i6) * 27797) ^ 839466228;
                        i8 = 983169472;
                    }
                case -185115855:
                case -164296029:
                    if (this.f28866) {
                        m6981 = C2105.m6981("ۙ۬") ^ i6;
                        i7 = ((m6981 ^ i5) * (-20845)) ^ 1699884970;
                        i8 = -876339578;
                    } else {
                        m6981 = (i5 - C2105.m6981("ۤۤ")) * (-73);
                        i7 = ((m6981 ^ i6) * 3115) ^ 625123609;
                        i8 = -777351715;
                    }
                case -104673937:
                case 1340286593:
                    if (i - i2 > 0) {
                        m6981 = (C0630.m2566("᩺ܽ") + i5) * 17;
                        i7 = ((m6981 ^ i6) * (-27009)) ^ 1772201573;
                        i8 = 741220546;
                    } else {
                        m6981 = (i5 - C2105.m6981("ۤۤ")) * (-73);
                        i7 = ((m6981 ^ i6) * 3115) ^ 625123609;
                        i8 = -777351715;
                    }
                case 36074072:
                case 2119049014:
                    if (f2 / f3 > 3.5f) {
                        m6981 = (C2105.m6981("۠ᩴ") + i6) * (-53);
                        i7 = ((m6981 ^ i5) * 1647) ^ 379546700;
                        i8 = 629461427;
                    } else {
                        m6981 = (i5 - C2105.m6981("ۤۤ")) * (-73);
                        i7 = ((m6981 ^ i6) * 3115) ^ 625123609;
                        i8 = -777351715;
                    }
                case 250557870:
                case 950947991:
                    C21923.m49329();
                    if (C1005.m3501()) {
                        m6981 = (C0630.m2566("ۨ֡") + i5) * (-113);
                        i7 = ((m6981 ^ i6) * 7867) ^ (-1518117434);
                        i8 = -1651909000;
                    } else {
                        m6981 = (C2105.m6981("ۤۗ") + i5) * (-111);
                        i7 = ((m6981 ^ i6) * (-4719)) ^ 1147166651;
                        i8 = 346930503;
                    }
                case 497350835:
                case 627432934:
                    if (f > c14792.f45163) {
                        m6981 = (C2105.m6981("ܶۖ") ^ i5) * (-51);
                        i7 = ((m6981 ^ i6) * (-29495)) ^ (-606307897);
                        i8 = -671625779;
                    } else {
                        m6981 = (i5 - C2105.m6981("ۤۤ")) * (-73);
                        i7 = ((m6981 ^ i6) * 3115) ^ 625123609;
                        i8 = -777351715;
                    }
                case 824985222:
                case 1956499955:
                    if (this.f28852) {
                        m6981 = (C0630.m2566("᩺᩵") + i6) * 37;
                        i7 = ((m6981 ^ i5) * (-16145)) ^ (-1512971444);
                        i8 = 879121675;
                    } else {
                        m6981 = (i5 - C2105.m6981("ۤۤ")) * (-73);
                        i7 = ((m6981 ^ i6) * 3115) ^ 625123609;
                        i8 = -777351715;
                    }
                case 855208798:
                case 1971335897:
                    return true;
                case 992388754:
                case 1954857044:
                    if (this.f28857) {
                        m6981 = (C0630.m2566("᩺᩵") + i6) * 37;
                        i7 = ((m6981 ^ i5) * (-16145)) ^ (-1512971444);
                        i8 = 879121675;
                    } else {
                        m6981 = (C0630.m2566("ܽۗ") + i5) * (-79);
                        i7 = ((m6981 ^ i6) * (-11287)) ^ (-1585837907);
                        i8 = -1679292850;
                    }
                case 1227418631:
                case 1430833554:
                    C22628.m50615();
                    m6981 = C0630.m2566("ۚ۟") ^ i5;
                    i7 = ((m6981 ^ i6) * 5423) ^ 2000820430;
                    i8 = 1917810057;
                case 1591264671:
                case 1598992793:
                    if (C1504.f5354) {
                        m6981 = (i6 - C0630.m2566("ܰۛ")) * 7;
                        i7 = ((m6981 ^ i5) * 26759) ^ (-130209480);
                        i8 = 1620410254;
                    } else {
                        m6981 = (C0630.m2566("ۗۛ") + i5) * (-101);
                        i7 = ((m6981 ^ i6) * 30767) ^ (-1165915977);
                        i8 = -322898122;
                    }
                case 1687367893:
                case 2133703739:
                    if (C1916.f6442) {
                        m6981 = (C2105.m6981("ܽ֨") + i5) * (-35);
                        i7 = ((m6981 ^ i6) * 7877) ^ 242510318;
                        i8 = -1512890245;
                    } else {
                        m6981 = (C2105.m6981("ۤۗ") + i5) * (-111);
                        i7 = ((m6981 ^ i6) * (-4719)) ^ 1147166651;
                        i8 = 346930503;
                    }
                case 1857717253:
                case 2059085635:
                    if (C2272.f7362) {
                        m6981 = (i6 - C0630.m2566("ܰۛ")) * 7;
                        i7 = ((m6981 ^ i5) * 26759) ^ (-130209480);
                        i8 = 1620410254;
                    } else {
                        m6981 = C2105.m6981("ۘۗ") ^ i6;
                        i7 = ((m6981 ^ i5) * 24863) ^ (-842260857);
                        i8 = 876673961;
                    }
                default:
                    if (C21923.f70183 != 0) {
                        m6981 = C0630.m2566("᩺۠") ^ i6;
                        i7 = ((m6981 ^ i5) * 12287) ^ (-1976585344);
                        i8 = -525315334;
                    } else {
                        m6981 = C0630.m2566("ᩳ۫") ^ i6;
                        i7 = ((m6981 ^ i5) * (-2455)) ^ (-437303787);
                        i8 = -2074329660;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean m24347() {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = -2052326021;
        int i2 = C4117.f13076;
        int i3 = C2520.f8000;
        int m6981 = (C2105.m6981("ۜܽ") ^ i3) * (-95);
        int i4 = ((m6981 ^ i2) * 20861) ^ (-1005483446);
        int i5 = -719305113;
        while (true) {
            i = ((((i ^ i2) * (-24725)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1831418231:
                case -235721924:
                    if (C1504.f5354) {
                        m6981 = C0630.m2566("ᩳܶ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-32157)) ^ (-632181662);
                        i5 = 572048206;
                    } else {
                        m6981 = C0630.m2566("۠ܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * 15093) ^ 1230780684;
                        i5 = 1976769920;
                    }
                case -1694367183:
                case -567520335:
                    if (C3537.m10746() <= 0) {
                        m6981 = C0630.m2566("ۡۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-29569)) ^ 1472052258;
                        i5 = -1004568524;
                    } else {
                        m6981 = (i2 - C2105.m6981("᩻᩵")) * (-19);
                        i4 = ((m6981 ^ i3) * (-1167)) ^ (-2029034356);
                        i5 = 1310072274;
                    }
                case -1625975140:
                case 1623342054:
                    j3 = j - j2;
                    if (C1128.m3851() <= 0) {
                        m6981 = C0630.m2566("ۡۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-29569)) ^ 1472052258;
                        i5 = -1004568524;
                    } else {
                        m6981 = (C2105.m6981("ᩴᩳ") ^ i2) * (-105);
                        i4 = ((m6981 ^ i3) * (-22185)) ^ 535439461;
                        i5 = -914985248;
                    }
                case -1592237944:
                case -1367104302:
                    j = C3019.m9262();
                    j2 = this.f28853;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C0630.m2566("۠ܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * 15093) ^ 1230780684;
                        i5 = 1976769920;
                    } else {
                        m6981 = (i3 - C0630.m2566("᩸᩷")) * 127;
                        i4 = ((m6981 ^ i2) * 5947) ^ 1802977088;
                        i5 = 1686650181;
                    }
                case -1447088071:
                case 980424491:
                    if (C7811.f24123 < 0) {
                        m6981 = (i3 - C0630.m2566("ܿۛ")) * (-89);
                        i4 = ((m6981 ^ i2) * 7741) ^ 1608750812;
                        i5 = 1846411566;
                    } else {
                        m6981 = (C0630.m2566("֡ۢ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m6981 ^ i3) * 18599) ^ 399971580;
                        i5 = 871001605;
                    }
                case -1346839160:
                case -820213623:
                    if (j3 < 500) {
                        m6981 = C2105.m6981("ۚ᩹") ^ i3;
                        i4 = ((m6981 ^ i2) * (-8157)) ^ 709568448;
                        i5 = -585782335;
                    } else {
                        m6981 = C2105.m6981("ܽ֫") ^ i2;
                        i4 = ((m6981 ^ i3) * (-23679)) ^ (-1369020428);
                        i5 = -1244973099;
                    }
                case -1050774373:
                case -887317286:
                    if (C4075.m12263() <= 0) {
                        m6981 = C0630.m2566("ᩳܶ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-32157)) ^ (-632181662);
                        i5 = 572048206;
                    } else {
                        m6981 = C2105.m6981("᩵ۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 12115) ^ (-1748265342);
                        i5 = -1367091875;
                    }
                case -747001399:
                case 436786630:
                    C1047.m3599();
                    ServiceConnectionC3453.m10564();
                    m6981 = C0630.m2566("۠ܿ") ^ i2;
                    i4 = ((m6981 ^ i3) * 15093) ^ 1230780684;
                    i5 = 1976769920;
                case -715027264:
                case 2995142:
                    if (C2272.f7362) {
                        m6981 = (C0630.m2566("֡ۢ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m6981 ^ i3) * 18599) ^ 399971580;
                        i5 = 871001605;
                    } else {
                        m6981 = C0630.m2566("ۘ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * 6691) ^ (-1708455642);
                        i5 = 347178447;
                    }
                case -697638680:
                case 588929912:
                    C0382.m1848();
                    AbstractC2021.m6574();
                    return false;
                case -652716369:
                case 1035069409:
                    C1916.m6308();
                    if (C0798.f2919) {
                        m6981 = (i3 - C0630.m2566("ܿۛ")) * (-89);
                        i4 = ((m6981 ^ i2) * 7741) ^ 1608750812;
                        i5 = 1846411566;
                    } else {
                        m6981 = C0630.m2566("۠ܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * 15093) ^ 1230780684;
                        i5 = 1976769920;
                    }
                case -486388868:
                case -185833739:
                    return false;
                case -226389874:
                case 1454476618:
                    return true;
                case -212177491:
                case -85627251:
                    if (C4263.f13799 <= 0) {
                        m6981 = (i3 - C0630.m2566("ܿۛ")) * (-89);
                        i4 = ((m6981 ^ i2) * 7741) ^ 1608750812;
                        i5 = 1846411566;
                    } else {
                        m6981 = (C2105.m6981("֫᩸") + i3) * 85;
                        i4 = ((m6981 ^ i2) * (-10743)) ^ 394569333;
                        i5 = 1630483815;
                    }
                case -79894094:
                case 1227442514:
                    if (this.f28861) {
                        m6981 = C2105.m6981("ۧۘ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-21157)) ^ 1061635148;
                        i5 = 716993549;
                    } else {
                        m6981 = C2105.m6981("ܽ֫") ^ i2;
                        i4 = ((m6981 ^ i3) * (-23679)) ^ (-1369020428);
                        i5 = -1244973099;
                    }
                case 404101441:
                case 1825729348:
                    if (C0050.m940() <= 0) {
                        m6981 = (i3 - C0630.m2566("ܿۛ")) * (-89);
                        i4 = ((m6981 ^ i2) * 7741) ^ 1608750812;
                        i5 = 1846411566;
                    } else {
                        m6981 = (C0630.m2566("ܳۜ") + i2) * (-41);
                        i4 = ((m6981 ^ i3) * 14349) ^ 595695252;
                        i5 = -355791235;
                    }
                case 563285102:
                case 873672298:
                    if (C3432.f10845 >= 0) {
                        m6981 = C0630.m2566("۠ܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * 15093) ^ 1230780684;
                        i5 = 1976769920;
                    } else {
                        m6981 = C2105.m6981("ۗܳ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-25823)) ^ 384715055;
                        i5 = -1998253526;
                    }
                case 1020694962:
                case 1361136069:
                    if (C0714.m2805()) {
                        m6981 = (C0630.m2566("᩻ܳ") + i2) * (-51);
                        i4 = ((m6981 ^ i3) * 16149) ^ (-646697291);
                        i5 = -1256422347;
                    } else {
                        m6981 = C0630.m2566("ۡۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-29569)) ^ 1472052258;
                        i5 = -1004568524;
                    }
                default:
                    if (C1773.f6144 <= 0) {
                        m6981 = (i3 - C0630.m2566("ܿۛ")) * (-89);
                        i4 = ((m6981 ^ i2) * 7741) ^ 1608750812;
                        i5 = 1846411566;
                    } else {
                        m6981 = C2105.m6981("᩵۬") ^ i3;
                        i4 = ((m6981 ^ i2) * 8325) ^ (-1554124431);
                        i5 = -411723769;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m24354() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1925793783;
        int i6 = C1047.f3863;
        int i7 = C1420.f5096;
        int m6981 = (C2105.m6981("ܰܰ") ^ i7) * 41;
        int i8 = ((m6981 ^ i6) * 30833) ^ (-970565610);
        int i9 = 298268495;
        while (true) {
            i5 = ((((i5 ^ i6) * 8085) >> 31) & i8) ^ (m6981 ^ i9);
            switch (i5) {
                case -2105519759:
                case -234381390:
                    if (C3746.m11369() >= 0) {
                        m6981 = C2105.m6981("ܿܿ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-21137)) ^ 358838797;
                        i9 = -648484760;
                    } else {
                        m6981 = (i7 - C2105.m6981("ܺܺ")) * 17;
                        i8 = ((m6981 ^ i6) * (-12993)) ^ (-911845747);
                        i9 = -1597887119;
                    }
                case -2031507356:
                case 1546311657:
                    i2 = 1;
                    if (i >= 1) {
                        m6981 = C2105.m6981("ۨ᩶") ^ i7;
                        i8 = ((m6981 ^ i6) * 13293) ^ 1470911217;
                        i9 = -269080995;
                    } else {
                        i3 = i;
                        m6981 = (C2105.m6981("ۙۧ") ^ i6) * 65;
                        i8 = ((m6981 ^ i7) * (-29237)) ^ (-442526714);
                        i9 = 907701910;
                    }
                case -1928496062:
                case -1536701583:
                    C4263.m12819();
                    return 0;
                case -1870256527:
                case -1790446369:
                    i3 = C0237.m1484(i, C1005.m3498(this) / i4);
                    m6981 = (C2105.m6981("ۙۧ") ^ i6) * 65;
                    i8 = ((m6981 ^ i7) * (-29237)) ^ (-442526714);
                    i9 = 907701910;
                case -1756810036:
                case 1835261465:
                    return this.f28863;
                case -1750825222:
                case 1866747311:
                    C3746.m11369();
                    if (C2520.f8000 >= 0) {
                        m6981 = C2105.m6981("ܿܿ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-21137)) ^ 358838797;
                        i9 = -648484760;
                    } else {
                        m6981 = (C0630.m2566("᩵ۙ") + i6) * 29;
                        i8 = ((m6981 ^ i7) * (-13249)) ^ (-1275938200);
                        i9 = -48146271;
                    }
                case -1443066097:
                case -1373857231:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C2105.m6981("ܿܿ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-21137)) ^ 358838797;
                        i9 = -648484760;
                    } else {
                        m6981 = (C2105.m6981("ܽۤ") ^ i7) * 93;
                        i8 = ((m6981 ^ i6) * 12041) ^ (-1445796776);
                        i9 = 1406128040;
                    }
                case -1405350585:
                case 564508353:
                    i4 = C11340.m28026(C2958.m9024(this, 0));
                    if (i4 > i2) {
                        m6981 = (C0630.m2566("۠᩸") + i6) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i8 = ((m6981 ^ i7) * (-23411)) ^ 360556071;
                        i9 = 1265383846;
                    } else {
                        i3 = i;
                        m6981 = (C2105.m6981("ۙۧ") ^ i6) * 65;
                        i8 = ((m6981 ^ i7) * (-29237)) ^ (-442526714);
                        i9 = 907701910;
                    }
                case -1305968517:
                case -64037210:
                    if (C2126.f7087) {
                        m6981 = (C0630.m2566("᩵ۙ") + i6) * 29;
                        i8 = ((m6981 ^ i7) * (-13249)) ^ (-1275938200);
                        i9 = -48146271;
                    } else {
                        m6981 = C2105.m6981("᩶᩷") ^ i6;
                        i8 = ((m6981 ^ i7) * 21569) ^ (-1346931236);
                        i9 = -1748435869;
                    }
                case -1071846039:
                case -206055665:
                    if (C3245.m9925() != 0) {
                        m6981 = (C0630.m2566("᩵ۙ") + i6) * 29;
                        i8 = ((m6981 ^ i7) * (-13249)) ^ (-1275938200);
                        i9 = -48146271;
                    } else {
                        m6981 = (C0630.m2566("᩹֫") + i6) * 33;
                        i8 = ((m6981 ^ i7) * 18507) ^ (-1464581229);
                        i9 = -1000423037;
                    }
                case -922843430:
                case 1192180843:
                    C3019.m9255();
                    m6981 = C0630.m2566("ۧۗ") ^ i7;
                    i8 = ((m6981 ^ i6) * (-691)) ^ 1022269370;
                    i9 = -408040395;
                case -895161349:
                case 484995424:
                    i = C3746.m11358(this);
                    if (C0798.m2998() != 0) {
                        m6981 = (C0630.m2566("᩵ۙ") + i6) * 29;
                        i8 = ((m6981 ^ i7) * (-13249)) ^ (-1275938200);
                        i9 = -48146271;
                    } else {
                        m6981 = (C0630.m2566("ܺ֫") ^ i6) * 33;
                        i8 = ((m6981 ^ i7) * 15931) ^ (-2088623728);
                        i9 = 1697417181;
                    }
                case -691629534:
                case 971194171:
                    if (C0237.f1507 != 0) {
                        m6981 = C2105.m6981("ܿܿ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-21137)) ^ 358838797;
                        i9 = -648484760;
                    } else {
                        m6981 = (C2105.m6981("ۧ᩻") + i7) * (-121);
                        i8 = ((m6981 ^ i6) * (-28023)) ^ (-1801632636);
                        i9 = 1183060035;
                    }
                case -576053615:
                case 1174834694:
                    if (i3 > this.f28863) {
                        m6981 = (C0630.m2566("ۗܳ") ^ i7) * (-29);
                        i8 = ((m6981 ^ i6) * (-26421)) ^ (-96770599);
                        i9 = 1546391153;
                    } else {
                        m6981 = C2105.m6981("᩶ܳ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-24549)) ^ (-325460395);
                        i9 = 439487192;
                    }
                case -214558237:
                case -69790472:
                    C3019.m9255();
                    if (C22628.f73083 > 0) {
                        m6981 = (i6 - C0630.m2566("֡ܶ")) * (-49);
                        i8 = ((m6981 ^ i7) * (-10291)) ^ (-501832055);
                        i9 = 618084438;
                    } else {
                        m6981 = C2105.m6981("ܿܿ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-21137)) ^ 358838797;
                        i9 = -648484760;
                    }
                case -121768296:
                case 1540960494:
                    if (C7811.f24123 >= 0) {
                        m6981 = C0630.m2566("ۧۗ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-691)) ^ 1022269370;
                        i9 = -408040395;
                    } else {
                        m6981 = C2105.m6981("ۚܶ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-26839)) ^ (-110379376);
                        i9 = 1539198167;
                    }
                case -54950895:
                case 1505262597:
                    if (C1420.f5096 <= 0) {
                        m6981 = (C2105.m6981("ۙۙ") ^ i7) * (-29);
                        i8 = ((m6981 ^ i6) * (-2033)) ^ 526488334;
                        i9 = 1029285427;
                    } else {
                        m6981 = C2105.m6981("᩸᩸") ^ i7;
                        i8 = ((m6981 ^ i6) * (-25265)) ^ 448209709;
                        i9 = -365618277;
                    }
                case 191728939:
                case 447985611:
                    if (C0237.m1481() >= 0) {
                        m6981 = C0630.m2566("ۧۗ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-691)) ^ 1022269370;
                        i9 = -408040395;
                    } else {
                        m6981 = (i7 - C2105.m6981("ۡܶ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i8 = ((m6981 ^ i6) * (-3729)) ^ 450419737;
                        i9 = 1856622046;
                    }
                case 238150281:
                case 1256704683:
                    this.f28863 = i3;
                    m6981 = C2105.m6981("᩶ܳ") ^ i6;
                    i8 = ((m6981 ^ i7) * (-24549)) ^ (-325460395);
                    i9 = 439487192;
                case 548082917:
                case 555407659:
                    if (C4263.m12819() >= 0) {
                        m6981 = (C2105.m6981("ۙۙ") ^ i7) * (-29);
                        i8 = ((m6981 ^ i6) * (-2033)) ^ 526488334;
                        i9 = 1029285427;
                    } else {
                        m6981 = C0630.m2566("ۢۗ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-1477)) ^ (-1405711467);
                        i9 = 194081080;
                    }
                default:
                    C21923.m49329();
                    if (C3537.m10746() > 0) {
                        m6981 = C0630.m2566("ۧۗ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-691)) ^ 1022269370;
                        i9 = -408040395;
                    } else {
                        m6981 = (i6 - C0630.m2566("֡ܶ")) * (-49);
                        i8 = ((m6981 ^ i7) * (-10291)) ^ (-501832055);
                        i9 = 618084438;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24340(MotionEvent motionEvent) {
        float f = 0.0f;
        boolean z = false;
        boolean z2 = false;
        C13064 c13064 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = -274826791;
        int i2 = C0422.f1886;
        int i3 = C1294.f4556;
        int m2566 = (C0630.m2566("ܽ۫") + i3) * 63;
        int i4 = ((m2566 ^ i2) * (-14673)) ^ 1315120023;
        int i5 = -1777022522;
        while (true) {
            i = ((((i ^ i2) * (-8075)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2058811135:
                case 1824723660:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = (C2105.m6981("᩺ۜ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m2566 ^ i2) * (-30215)) ^ (-17779537);
                        i5 = 221648463;
                    } else {
                        m2566 = (i3 - C0630.m2566("۟֨")) * 15;
                        i4 = ((m2566 ^ i2) * (-32489)) ^ 15499767;
                        i5 = -1183938776;
                    }
                case -2049785441:
                case -2024925765:
                    RunnableC3474.m10630();
                    if (C2272.m7503()) {
                        m2566 = (i3 - C2105.m6981("᩺۫")) * (-53);
                        i4 = ((m2566 ^ i2) * (-19757)) ^ (-1096972124);
                        i5 = -1703521765;
                    } else {
                        m2566 = C2105.m6981("ᩴ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-13261)) ^ 959604684;
                        i5 = -263776243;
                    }
                case -1757218956:
                case 1664477641:
                    break;
                case -1596355240:
                case 1243484170:
                    this.f28847 = f2 - f3;
                    if (C3911.m11924() <= 0) {
                        m2566 = C2105.m6981("ᩴ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-13261)) ^ 959604684;
                        i5 = -263776243;
                    } else {
                        m2566 = (C0630.m2566("᩻᩸") + i2) * (-9);
                        i4 = ((m2566 ^ i3) * 15831) ^ (-1958828383);
                        i5 = -292052007;
                    }
                case -1582599883:
                case 964453693:
                    this.f28852 = z;
                    if (C3663.f11553) {
                        m2566 = C2105.m6981("ᩴ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-13261)) ^ 959604684;
                        i5 = -263776243;
                    } else {
                        m2566 = (C2105.m6981("۟ܰ") ^ i2) * (-27);
                        i4 = ((m2566 ^ i3) * (-32153)) ^ (-1653615669);
                        i5 = 1779328911;
                    }
                case -1541549907:
                case 1273474479:
                    this.f28848 = motionEvent.getY();
                    if (C1420.f5096 <= 0) {
                        m2566 = (C2105.m6981("᩺ۜ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m2566 ^ i2) * (-30215)) ^ (-17779537);
                        i5 = 221648463;
                    } else {
                        m2566 = C0630.m2566("ᩳۢ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-16079)) ^ (-749268857);
                        i5 = -1283617032;
                    }
                case -1528321016:
                case -132424778:
                    f = motionEvent.getX();
                    if (C7106.f21815 != 0) {
                        m2566 = (C2105.m6981("ܳ᩹") ^ i3) * (-49);
                        i4 = ((m2566 ^ i2) * 3445) ^ (-29345842);
                        i5 = -131673160;
                    } else {
                        m2566 = (C0630.m2566("ۜۨ") ^ i2) * (-87);
                        i4 = ((m2566 ^ i3) * 29359) ^ (-804363681);
                        i5 = 1892888675;
                    }
                case -1523171477:
                case 200121911:
                    C1294.m4372();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m2566 = (i3 - C2105.m6981("᩺۫")) * (-53);
                        i4 = ((m2566 ^ i2) * (-19757)) ^ (-1096972124);
                        i5 = -1703521765;
                    } else {
                        m2566 = (C2105.m6981("ܳ᩹") ^ i3) * (-49);
                        i4 = ((m2566 ^ i2) * 3445) ^ (-29345842);
                        i5 = -131673160;
                    }
                case -1093424926:
                case -17518201:
                    c13064.m31648(z2 ? 1 : 0, this.f28859);
                    m2566 = C0630.m2566("᩶᩵") ^ i3;
                    i4 = ((m2566 ^ i2) * (-10403)) ^ (-1972194071);
                    i5 = -693849531;
                case -1025666802:
                case 1860986827:
                    C0630.m2574(this);
                    if (getParent() != null) {
                        m2566 = C0630.m2566("۟ۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-30943)) ^ 314121487;
                        i5 = -283887713;
                    } else {
                        m2566 = (C2105.m6981("۬֨") + i2) * (-81);
                        i4 = ((m2566 ^ i3) * 28289) ^ (-1926964955);
                        i5 = -1979127097;
                    }
                case -911330900:
                case 1270616489:
                    f3 = this.f28848;
                    if (C0630.f2410 <= 0) {
                        m2566 = C2105.m6981("ۖᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31253)) ^ 26454113;
                        i5 = -1109552585;
                    } else {
                        m2566 = C2105.m6981("ܿۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-25169)) ^ 249039809;
                        i5 = 265411588;
                    }
                case -793610571:
                case -250906261:
                    this.f28869 = C3019.m9262();
                    if (C3432.f10845 >= 0) {
                        m2566 = (i3 - C2105.m6981("᩺۫")) * (-53);
                        i4 = ((m2566 ^ i2) * (-19757)) ^ (-1096972124);
                        i5 = -1703521765;
                    } else {
                        m2566 = C0630.m2566("ۧܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-13729)) ^ (-18608991);
                        i5 = 1842739731;
                    }
                case -391159109:
                case 698735152:
                    C1711.m5736();
                    RunnableC0588.m2441();
                    break;
                case -147056522:
                case 1040101963:
                    this.f28850 = f;
                    if (RunnableC3474.f10992 <= 0) {
                        m2566 = (C2105.m6981("ܳ᩹") ^ i3) * (-49);
                        i4 = ((m2566 ^ i2) * 3445) ^ (-29345842);
                        i5 = -131673160;
                    } else {
                        m2566 = C0630.m2566("ۧۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * 21407) ^ 860798819;
                        i5 = -1124708487;
                    }
                case 28541137:
                case 1075599976:
                    getParent().requestDisallowInterceptTouchEvent(z2);
                    m2566 = (C2105.m6981("۬֨") + i2) * (-81);
                    i4 = ((m2566 ^ i3) * 28289) ^ (-1926964955);
                    i5 = -1979127097;
                case 301956430:
                case 477495836:
                    m24346(motionEvent);
                    z = false;
                    if (C0422.f1886 <= 0) {
                        m2566 = (C2105.m6981("ܳ᩹") ^ i3) * (-49);
                        i4 = ((m2566 ^ i2) * 3445) ^ (-29345842);
                        i5 = -131673160;
                    } else {
                        m2566 = C0630.m2566("ۤ۠") ^ i3;
                        i4 = ((m2566 ^ i2) * (-2067)) ^ (-670160234);
                        i5 = 245570402;
                    }
                case 345157228:
                case 1504442021:
                    C0714.m2805();
                    m2566 = C2105.m6981("ᩴ֫") ^ i2;
                    i4 = ((m2566 ^ i3) * (-13261)) ^ 959604684;
                    i5 = -263776243;
                case 362201769:
                case 891835007:
                    z2 = true;
                    z2 = true;
                    this.f28867 = true;
                    c13064 = this.f28860;
                    if (c13064 != null) {
                        m2566 = C0630.m2566("۬ۗ") ^ i2;
                        i4 = ((m2566 ^ i3) * 21969) ^ (-856265868);
                        i5 = -1506265464;
                    } else {
                        m2566 = C0630.m2566("᩶᩵") ^ i3;
                        i4 = ((m2566 ^ i2) * (-10403)) ^ (-1972194071);
                        i5 = -693849531;
                    }
                case 1027913241:
                case 2041531089:
                    f2 = this.f28846.f45166;
                    if (C0382.f1805) {
                        m2566 = (i2 - C2105.m6981("ܳ۠")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m2566 ^ i3) * (-1275)) ^ (-1429629890);
                        i5 = -242347592;
                    } else {
                        m2566 = (C2105.m6981("᩺ۜ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m2566 ^ i2) * (-30215)) ^ (-17779537);
                        i5 = 221648463;
                    }
                default:
                    if (C4117.f13076 <= 0) {
                        m2566 = (i3 - C2105.m6981("᩺۫")) * (-53);
                        i4 = ((m2566 ^ i2) * (-19757)) ^ (-1096972124);
                        i5 = -1703521765;
                    } else {
                        m2566 = C2105.m6981("ۖᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31253)) ^ 26454113;
                        i5 = -1109552585;
                    }
            }
            return;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m24358() {
        int i = 608116836;
        int i2 = C1294.f4556;
        int i3 = C3537.f11231;
        int m2566 = C0630.m2566("ۖۧ") ^ i2;
        int i4 = ((m2566 ^ i3) * (-31745)) ^ R.id.horizontal;
        int i5 = 1255688806;
        while (true) {
            i = ((((i ^ i3) * 10533) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2137579883:
                case 1189362614:
                    if (this.f28867) {
                        m2566 = (C0630.m2566("ۚ֨") ^ i3) * 35;
                        i4 = ((m2566 ^ i2) * 28129) ^ 949910752;
                        i5 = 985816089;
                    } else {
                        m2566 = (C0630.m2566("ۗ᩷") ^ i3) * 61;
                        i4 = ((m2566 ^ i2) * 11177) ^ (-16695693);
                        i5 = -765455471;
                    }
                case -2023324879:
                case 724244915:
                    break;
                case -1847372379:
                case -1596411616:
                    if (C11340.f33930 >= 0) {
                        m2566 = (C0630.m2566("۬֫") + i2) * 9;
                        i4 = ((m2566 ^ i3) * 22055) ^ (-1650131943);
                        i5 = -1171912631;
                    } else {
                        m2566 = (i3 - C2105.m6981("ۨۨ")) * (-21);
                        i4 = ((m2566 ^ i2) * (-22679)) ^ 133000664;
                        i5 = 2122841835;
                    }
                case -1767237803:
                case -367527630:
                    break;
                case -1697317163:
                case 711792286:
                    if (C0382.m1848()) {
                        m2566 = (i2 - C0630.m2566("֡ۡ")) * (-11);
                        i4 = ((m2566 ^ i3) * (-17599)) ^ (-86972938);
                        i5 = -1706872872;
                    } else {
                        m2566 = (C2105.m6981("ۛ᩺") ^ i2) * 87;
                        i4 = ((m2566 ^ i3) * (-25177)) ^ 461036335;
                        i5 = -365599319;
                    }
                case -1653592589:
                case -162344326:
                    C4117.m12364();
                    C3683.m11222();
                    break;
                case -1526716885:
                case -1315656502:
                    C3911.m11924();
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        m2566 = (C0630.m2566("۬֫") + i2) * 9;
                        i4 = ((m2566 ^ i3) * 22055) ^ (-1650131943);
                        i5 = -1171912631;
                    } else {
                        m2566 = C2105.m6981("᩹ۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * 2019) ^ 1979568502;
                        i5 = 427362959;
                    }
                case -1501011087:
                case 361619540:
                    if (C4117.f13076 > 0) {
                        m2566 = C2105.m6981("᩹ۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * 2019) ^ 1979568502;
                        i5 = 427362959;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۡ᩵")) * 57;
                        i4 = ((m2566 ^ i2) * 12799) ^ 241865810;
                        i5 = 7008684;
                    }
                case -1413721380:
                case 1964377281:
                    if (m24347()) {
                        m2566 = (C0630.m2566("ۚ֨") ^ i3) * 35;
                        i4 = ((m2566 ^ i2) * 28129) ^ 949910752;
                        i5 = 985816089;
                    } else {
                        m2566 = (C0630.m2566("۬ۛ") + i2) * 25;
                        i4 = ((m2566 ^ i3) * (-12501)) ^ 8636899;
                        i5 = -1753713505;
                    }
                case -1393936880:
                case -1251745787:
                    if (C11340.f33930 >= 0) {
                        m2566 = (i2 - C0630.m2566("֡ۡ")) * (-11);
                        i4 = ((m2566 ^ i3) * (-17599)) ^ (-86972938);
                        i5 = -1706872872;
                    } else {
                        m2566 = (C2105.m6981("ۨ᩸") ^ i2) * 49;
                        i4 = ((m2566 ^ i3) * 3173) ^ (-1501917615);
                        i5 = -957578792;
                    }
                case -1234008281:
                case -94826697:
                    C21923.m49329();
                    m2566 = (C0630.m2566("۬֫") + i2) * 9;
                    i4 = ((m2566 ^ i3) * 22055) ^ (-1650131943);
                    i5 = -1171912631;
                case -957302545:
                case 35943081:
                    if (C2167.m7155()) {
                        m2566 = (i2 - C0630.m2566("֡ۡ")) * (-11);
                        i4 = ((m2566 ^ i3) * (-17599)) ^ (-86972938);
                        i5 = -1706872872;
                    } else {
                        m2566 = C2105.m6981("᩷ۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * 6943) ^ (-174704319);
                        i5 = 79159218;
                    }
                case -715136214:
                case 315642469:
                    if (C4159.m12565() >= 0) {
                        m2566 = (i3 - C0630.m2566("᩷۬")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m2566 ^ i2) * 21687) ^ 1507745887;
                        i5 = -1524967668;
                    } else {
                        m2566 = C0630.m2566("ܳۜ") ^ i3;
                        i4 = ((m2566 ^ i2) * 20157) ^ 1472995982;
                        i5 = -744646422;
                    }
                case -521873249:
                case 50790436:
                    C3245.m9925();
                    if (C0798.f2919) {
                        m2566 = (C0630.m2566("۬֫") + i2) * 9;
                        i4 = ((m2566 ^ i3) * 22055) ^ (-1650131943);
                        i5 = -1171912631;
                    } else {
                        m2566 = (i3 - C0630.m2566("᩷۬")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m2566 ^ i2) * 21687) ^ 1507745887;
                        i5 = -1524967668;
                    }
                case -439343460:
                case 1923840756:
                    if (C21923.f70183 != 0) {
                        m2566 = C2105.m6981("᩹ۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * 2019) ^ 1979568502;
                        i5 = 427362959;
                    } else {
                        m2566 = (C2105.m6981("ᩴ᩷") + i2) * 59;
                        i4 = ((m2566 ^ i3) * (-13617)) ^ (-155908423);
                        i5 = 2007494919;
                    }
                case -53399129:
                case 1182337043:
                    if (C7106.f21815 != 0) {
                        m2566 = (i3 - C0630.m2566("ۡ᩵")) * 57;
                        i4 = ((m2566 ^ i2) * 12799) ^ 241865810;
                        i5 = 7008684;
                    } else {
                        m2566 = C0630.m2566("᩸᩺") ^ i3;
                        i4 = ((m2566 ^ i2) * 5705) ^ 1167182452;
                        i5 = 82157666;
                    }
                case 276114086:
                case 1159904505:
                    if (C3746.f11829 <= 0) {
                        m2566 = C2105.m6981("᩹ۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * 2019) ^ 1979568502;
                        i5 = 427362959;
                    } else {
                        m2566 = C2105.m6981("᩸᩵") ^ i3;
                        i4 = ((m2566 ^ i2) * 3275) ^ 1424357334;
                        i5 = 559225709;
                    }
                case 543352093:
                case 1205938964:
                    if (C4075.f12947 >= 0) {
                        m2566 = (i2 - C0630.m2566("֡ۡ")) * (-11);
                        i4 = ((m2566 ^ i3) * (-17599)) ^ (-86972938);
                        i5 = -1706872872;
                    } else {
                        m2566 = (C0630.m2566("ܰ᩷") + i3) * 47;
                        i4 = ((m2566 ^ i2) * 32349) ^ 345077307;
                        i5 = -1006257818;
                    }
                default:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = (i3 - C0630.m2566("ۡ᩵")) * 57;
                        i4 = ((m2566 ^ i2) * 12799) ^ 241865810;
                        i5 = 7008684;
                    } else {
                        m2566 = C0630.m2566("᩹ۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * 22121) ^ 1583374416;
                        i5 = 903836540;
                    }
            }
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24355(View.OnTouchListener onTouchListener) {
        ArrayList arrayList = null;
        int i = 400667209;
        int i2 = ServiceConnectionC3453.f10921;
        int i3 = C4616.f14690;
        int m2566 = C0630.m2566("۫᩸") ^ i3;
        int i4 = ((m2566 ^ i2) * (-23649)) ^ (-656465364);
        int i5 = 196757645;
        while (true) {
            i = ((((i ^ i2) * (-2995)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2026750717:
                case 1896958298:
                    if (this.f28849 == null) {
                        m2566 = (C0630.m2566("ۚ֨") ^ i2) * (-85);
                        i4 = ((m2566 ^ i3) * (-12659)) ^ 1552637268;
                        i5 = -251136449;
                    } else {
                        m2566 = (i3 - C2105.m6981("۟᩻")) * (-99);
                        i4 = ((m2566 ^ i2) * (-26445)) ^ (-20521563);
                        i5 = -426342839;
                    }
                case -1909292613:
                case -569166247:
                    if (C2126.f7087) {
                        m2566 = C0630.m2566("ۗܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * 14523) ^ 1914766422;
                        i5 = 1667753330;
                    } else {
                        m2566 = C2105.m6981("ᩳ᩸") ^ i3;
                        i4 = ((m2566 ^ i2) * 12739) ^ 1367741324;
                        i5 = -734785237;
                    }
                case -1886336195:
                case 1734528798:
                    RunnableC3474.m10630();
                    C3245.m9925();
                    m2566 = C2105.m6981("ᩳ᩸") ^ i3;
                    i4 = ((m2566 ^ i2) * 12739) ^ 1367741324;
                    i5 = -734785237;
                case -1872366090:
                case 1367051597:
                    if (C7106.m19120() <= 0) {
                        m2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((m2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    } else {
                        m2566 = C2105.m6981("᩺ܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * 21161) ^ 292997409;
                        i5 = 475076148;
                    }
                case -1816162163:
                case 1593061580:
                    C3663.m11168();
                    if (C21923.f70183 == 0) {
                        m2566 = C0630.m2566("ۗܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * 14523) ^ 1914766422;
                        i5 = 1667753330;
                    } else {
                        m2566 = C0630.m2566("֨᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * 26857) ^ (-145704486);
                        i5 = 650609337;
                    }
                case -1635173199:
                case 1589058315:
                    if (C0237.f1507 != 0) {
                        m2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((m2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    } else {
                        m2566 = C0630.m2566("۟ۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * 3057) ^ (-577232592);
                        i5 = 534920185;
                    }
                case -1595224811:
                case 1033207203:
                    arrayList = new ArrayList();
                    if (C1773.f6144 <= 0) {
                        m2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((m2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    } else {
                        m2566 = C2105.m6981("۫ۘ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-27575)) ^ (-1900268723);
                        i5 = 742223650;
                    }
                case -1283068473:
                case 176581807:
                    this.f28849 = arrayList;
                    if (C2520.f8000 >= 0) {
                        m2566 = (C0630.m2566("ۡ֨") ^ i2) * 33;
                        i4 = ((m2566 ^ i3) * (-32677)) ^ (-401869492);
                        i5 = -718728517;
                    } else {
                        m2566 = (i2 - C2105.m6981("ۧۤ")) * 23;
                        i4 = ((m2566 ^ i3) * (-12267)) ^ 239173787;
                        i5 = 718030616;
                    }
                case -1205735445:
                case 840988156:
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((m2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    } else {
                        m2566 = C0630.m2566("۟᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * (-4743)) ^ (-399278140);
                        i5 = 720469912;
                    }
                case -979689684:
                case -972659310:
                    if (C1420.f5096 <= 0) {
                        m2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((m2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    } else {
                        m2566 = (C2105.m6981("ܽۚ") ^ i3) * (-115);
                        i4 = ((m2566 ^ i2) * (-20955)) ^ (-2111628386);
                        i5 = 1725107882;
                    }
                case -934099203:
                case 988411127:
                    if (C5695.f17556 >= 0) {
                        m2566 = (C0630.m2566("ۡ֨") ^ i2) * 33;
                        i4 = ((m2566 ^ i3) * (-32677)) ^ (-401869492);
                        i5 = -718728517;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۚ᩶")) * 25;
                        i4 = ((m2566 ^ i2) * (-15017)) ^ (-285726789);
                        i5 = -94299976;
                    }
                case -902775272:
                case 1720808843:
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = C2105.m6981("ᩳ᩸") ^ i3;
                        i4 = ((m2566 ^ i2) * 12739) ^ 1367741324;
                        i5 = -734785237;
                    } else {
                        m2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((m2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    }
                case -484180227:
                case 303342420:
                    C1916.m6307(this.f28849, onTouchListener);
                    break;
                case -296759863:
                case -216722091:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = C0630.m2566("ۗܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * 14523) ^ 1914766422;
                        i5 = 1667753330;
                    } else {
                        m2566 = C0630.m2566("ۖۖ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-16101)) ^ (-1481859477);
                        i5 = -1114856707;
                    }
                case -269302723:
                case -225672818:
                    C4263.m12819();
                    break;
                case 755066528:
                case 1339371855:
                    if (C1773.f6144 <= 0) {
                        m2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((m2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    } else {
                        m2566 = C2105.m6981("ܿܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-23975)) ^ (-509747063);
                        i5 = -1204681302;
                    }
                case 1413716399:
                case 1627353645:
                    super.setOnTouchListener(new View.OnTouchListener() { // from class: l.ܿۢۡ
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            return C9503.m24343(C9503.this, view, motionEvent);
                        }
                    });
                    m2566 = (i3 - C2105.m6981("۟᩻")) * (-99);
                    i4 = ((m2566 ^ i2) * (-26445)) ^ (-20521563);
                    i5 = -426342839;
                default:
                    if (C4159.f13567) {
                        m2566 = C2105.m6981("۬ᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * 27341) ^ 607755986;
                        i5 = 1808087412;
                    } else {
                        m2566 = (C0630.m2566("֨۟") ^ i3) * 37;
                        i4 = ((m2566 ^ i2) * (-7165)) ^ (-43384917);
                        i5 = 388278792;
                    }
            }
            return;
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view, float f, float f2) {
        boolean z = false;
        int i = 340712551;
        int i2 = ViewOnClickListenerC1958.f6529;
        int i3 = C3746.f11829;
        int m2566 = (C0630.m2566("ܳۧ") + i2) * 43;
        int i4 = ((m2566 ^ i3) * 5077) ^ 40794622;
        int i5 = 829770647;
        while (true) {
            i = ((((i ^ i3) * (-26865)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1949577789:
                case -600893721:
                    if (C0964.f3626 != 0) {
                        m2566 = (C2105.m6981("ᩳۛ") + i2) * 75;
                        i4 = ((m2566 ^ i3) * (-453)) ^ (-409635374);
                        i5 = 1166320023;
                    } else {
                        m2566 = (i2 - C2105.m6981("۠ܳ")) * (-7);
                        i4 = ((m2566 ^ i3) * 4421) ^ 660135537;
                        i5 = 1471860074;
                    }
                case -1895984935:
                case 1978069588:
                    return z;
                case -1854893202:
                case -804883703:
                    C3663.m11168();
                    if (C7106.m19120() > 0) {
                        m2566 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((m2566 ^ i2) * 14641) ^ 1511123123;
                        i5 = 1155013170;
                    } else {
                        m2566 = (C2105.m6981("ᩳۛ") + i2) * 75;
                        i4 = ((m2566 ^ i3) * (-453)) ^ (-409635374);
                        i5 = 1166320023;
                    }
                case -1688336593:
                case 1331568981:
                    if (C4117.f13076 <= 0) {
                        m2566 = C2105.m6981("ᩴۤ") ^ i2;
                        i4 = ((m2566 ^ i3) * 22733) ^ (-1850541103);
                        i5 = 524787219;
                    } else {
                        m2566 = C0630.m2566("᩶ۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-6289)) ^ (-459574436);
                        i5 = -631007961;
                    }
                case -1248811366:
                case -650173813:
                    if (C2520.f8000 >= 0) {
                        m2566 = C2105.m6981("ᩴۤ") ^ i2;
                        i4 = ((m2566 ^ i3) * 22733) ^ (-1850541103);
                        i5 = 524787219;
                    } else {
                        m2566 = C0630.m2566("ۧۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-7181)) ^ 1941957157;
                        i5 = 520293772;
                    }
                case -1238101462:
                case 1078976491:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = (i3 - C2105.m6981("۫ܰ")) * (-101);
                        i4 = ((m2566 ^ i2) * 11283) ^ (-1587562702);
                        i5 = -1130636087;
                    } else {
                        m2566 = C2105.m6981("ᩳ᩻") ^ i3;
                        i4 = ((m2566 ^ i2) * (-27589)) ^ 1724564829;
                        i5 = 1923336133;
                    }
                case -1128667415:
                case -333461950:
                    z = super.showContextMenuForChild(view, f, f2);
                    if (z) {
                        m2566 = C0630.m2566("ۘ֫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-7777)) ^ (-186676000);
                        i5 = 887212492;
                    } else {
                        m2566 = C2105.m6981("ܳۗ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-2619)) ^ (-2132261341);
                        i5 = 322919605;
                    }
                case -924388265:
                case 1623372840:
                    this.f28865 = true;
                    this.f28852 = false;
                    m2566 = C2105.m6981("ܳۗ") ^ i3;
                    i4 = ((m2566 ^ i2) * (-2619)) ^ (-2132261341);
                    i5 = 322919605;
                case -867996697:
                case 879548600:
                    if (C7106.f21815 != 0) {
                        m2566 = (C2105.m6981("ᩳۛ") + i2) * 75;
                        i4 = ((m2566 ^ i3) * (-453)) ^ (-409635374);
                        i5 = 1166320023;
                    } else {
                        m2566 = C2105.m6981("ᩳܰ") ^ i2;
                        i4 = ((m2566 ^ i3) * 25999) ^ 1008468121;
                        i5 = 1896148476;
                    }
                case -488114910:
                case 886662784:
                    C3245.m9925();
                    if (C1128.f4106 > 0) {
                        m2566 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((m2566 ^ i2) * 14641) ^ 1511123123;
                        i5 = 1155013170;
                    } else {
                        m2566 = (C0630.m2566("ۜ᩸") + i2) * (-89);
                        i4 = ((m2566 ^ i3) * (-32297)) ^ (-308426065);
                        i5 = -1261233421;
                    }
                case -457816658:
                case 397435450:
                    if (C0630.f2410 <= 0) {
                        m2566 = (C2105.m6981("ᩳۛ") + i2) * 75;
                        i4 = ((m2566 ^ i3) * (-453)) ^ (-409635374);
                        i5 = 1166320023;
                    } else {
                        m2566 = (i3 - C0630.m2566("ܽۡ")) * 75;
                        i4 = ((m2566 ^ i2) * 28959) ^ 1579504187;
                        i5 = 352862867;
                    }
                case -338133540:
                case 324432142:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = (C0630.m2566("ۜ᩸") + i2) * (-89);
                        i4 = ((m2566 ^ i3) * (-32297)) ^ (-308426065);
                        i5 = -1261233421;
                    } else {
                        m2566 = (C2105.m6981("ۛܽ") + i2) * (-11);
                        i4 = ((m2566 ^ i3) * 18851) ^ 93531881;
                        i5 = -1152277818;
                    }
                case 107994126:
                case 2044369331:
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = (C0630.m2566("ۜ᩸") + i2) * (-89);
                        i4 = ((m2566 ^ i3) * (-32297)) ^ (-308426065);
                        i5 = -1261233421;
                    } else {
                        m2566 = C0630.m2566("᩺᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * 10313) ^ 2092427440;
                        i5 = 342832359;
                    }
                case 194761430:
                case 1817573689:
                    C1420.m4913();
                    m2566 = C0630.m2566("ᩴ֨") ^ i3;
                    i4 = ((m2566 ^ i2) * 14641) ^ 1511123123;
                    i5 = 1155013170;
                case 311182830:
                case 623145686:
                    if (C0630.f2410 <= 0) {
                        m2566 = C2105.m6981("ᩴۤ") ^ i2;
                        i4 = ((m2566 ^ i3) * 22733) ^ (-1850541103);
                        i5 = 524787219;
                    } else {
                        m2566 = C2105.m6981("ܽܰ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-26297)) ^ 1557257853;
                        i5 = 461202161;
                    }
                case 440798550:
                case 570583907:
                    C3911.m11924();
                    return false;
                case 1265041620:
                case 1769591359:
                    C3911.m11924();
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = (C2105.m6981("ᩳۛ") + i2) * 75;
                        i4 = ((m2566 ^ i3) * (-453)) ^ (-409635374);
                        i5 = 1166320023;
                    } else {
                        m2566 = (i3 - C2105.m6981("۫ܰ")) * (-101);
                        i4 = ((m2566 ^ i2) * 11283) ^ (-1587562702);
                        i5 = -1130636087;
                    }
                default:
                    if (C3245.f10203 <= 0) {
                        m2566 = (i3 - C2105.m6981("۫ܰ")) * (-101);
                        i4 = ((m2566 ^ i2) * 11283) ^ (-1587562702);
                        i5 = -1130636087;
                    } else {
                        m2566 = (C0630.m2566("ۚ۫") ^ i3) * 49;
                        i4 = ((m2566 ^ i2) * 26375) ^ 1924581105;
                        i5 = 1938445203;
                    }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9503(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        int i = 134756822;
        int i2 = C2958.f9394;
        int i3 = C3245.f10203;
        int m2566 = C0630.m2566("ܺ֨") ^ i3;
        int i4 = ((m2566 ^ i2) * (-9507)) ^ 1422230643;
        int i5 = -1839619287;
        while (true) {
            i = (m2566 ^ i5) ^ (i4 & (((i ^ i2) * (-8563)) >> 31));
            switch (i) {
                case -1973131757:
                case -1148304264:
                    C7811.m20844();
                    if (C1294.f4556 >= 0) {
                        break;
                    } else {
                        m2566 = C0630.m2566("ܰۗ") ^ i2;
                        i4 = ((m2566 ^ i3) * 31253) ^ (-1494323195);
                        i5 = -55000705;
                    }
                case -1340072209:
                case -1133006735:
                    if (C4075.f12947 >= 0) {
                        m2566 = C2105.m6981("ۗۗ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-20681)) ^ (-1632001456);
                        i5 = 765305297;
                    } else {
                        m2566 = C0630.m2566("ᩳ֡") ^ i3;
                        i4 = ((m2566 ^ i2) * (-4263)) ^ 1578682670;
                        i5 = -1668837515;
                        continue;
                    }
                case -1090654573:
                case 428052212:
                    return;
                case -857497952:
                case 266609497:
                    ServiceConnectionC3453.m10564();
                    if (AbstractC2021.f6743 > 0) {
                        break;
                    } else {
                        m2566 = (C0630.m2566("ۜ֡") + i2) * (-123);
                        i4 = ((m2566 ^ i3) * (-17871)) ^ 976089743;
                        i5 = -1111720865;
                    }
                case 32982461:
                case 1204650363:
                    C5695.m16023();
                    C11340.m28031();
                    throw new RuntimeException();
                case 1262989996:
                case 1872846592:
                    C3683.m11222();
                    C1294.m4372();
                    break;
                default:
                    C4075.m12263();
                    if (C11340.f33930 >= 0) {
                        break;
                    } else {
                        m2566 = (i3 - C2105.m6981("᩻ܳ")) * 47;
                        i4 = ((m2566 ^ i2) * (-19521)) ^ (-1310025803);
                        i5 = 417890332;
                    }
            }
            m2566 = C0630.m2566("ۚܺ") ^ i2;
            i4 = ((m2566 ^ i3) * 7303) ^ (-926400033);
            i5 = -187349878;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m24357() {
        return this.f28867;
    }

    @Override // android.widget.ListView, android.widget.AdapterView
    public final void setSelection(int i) {
        int i2 = -600464008;
        int i3 = C22628.f73083;
        int i4 = C3911.f12484;
        int m2566 = (C0630.m2566("᩺ܽ") + i4) * 43;
        int i5 = ((m2566 ^ i3) * 13811) ^ (-651726585);
        int i6 = 2108026463;
        while (true) {
            i2 = ((((i2 ^ i3) * 15865) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -2097519943:
                case -1664282700:
                    if (C1047.f3863 >= 0) {
                        m2566 = (C0630.m2566("ᩴۗ") ^ i4) * 65;
                        i5 = ((m2566 ^ i3) * (-14859)) ^ 1181353310;
                        i6 = -1463531608;
                    } else {
                        m2566 = (C2105.m6981("ۛۘ") + i3) * 75;
                        i5 = ((m2566 ^ i4) * (-2419)) ^ 1298702360;
                        i6 = 1912884897;
                    }
                case -1980783348:
                case -653969197:
                    if (C0630.f2410 <= 0) {
                        m2566 = (C0630.m2566("ᩴۗ") ^ i4) * 65;
                        i5 = ((m2566 ^ i3) * (-14859)) ^ 1181353310;
                        i6 = -1463531608;
                    } else {
                        m2566 = C0630.m2566("ᩴۖ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-13385)) ^ (-652813665);
                        i6 = -166297449;
                    }
                case -1256745897:
                case 1057414977:
                    if (C0714.f2697 >= 0) {
                        m2566 = (C0630.m2566("ᩴۗ") ^ i4) * 65;
                        i5 = ((m2566 ^ i3) * (-14859)) ^ 1181353310;
                        i6 = -1463531608;
                    } else {
                        m2566 = (C0630.m2566("ۛ۫") ^ i4) * (-83);
                        i5 = ((m2566 ^ i3) * (-14673)) ^ 1043796403;
                        i6 = -1494304008;
                    }
                case -1149437264:
                case 1516465677:
                    if (C1420.f5096 <= 0) {
                        m2566 = (C2105.m6981("᩶ܶ") ^ i3) * (-67);
                        i5 = ((m2566 ^ i4) * 1745) ^ (-81172252);
                        i6 = -723506863;
                    } else {
                        m2566 = (C0630.m2566("ۧܿ") ^ i4) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((m2566 ^ i3) * (-31955)) ^ (-2144211277);
                        i6 = -59652936;
                    }
                case -1144584607:
                case 1176969000:
                    if (C21923.m49329()) {
                        m2566 = C0630.m2566("֫֡") ^ i3;
                        i5 = ((m2566 ^ i4) * 31307) ^ 1990917220;
                        i6 = 1417469219;
                    } else {
                        m2566 = C0630.m2566("֨֡") ^ i4;
                        i5 = ((m2566 ^ i3) * 15075) ^ 1810117266;
                        i6 = 1863071712;
                    }
                case -1127591975:
                case 103029490:
                    if (C1420.f5096 <= 0) {
                        m2566 = (C0630.m2566("ᩴۗ") ^ i4) * 65;
                        i5 = ((m2566 ^ i3) * (-14859)) ^ 1181353310;
                        i6 = -1463531608;
                    } else {
                        m2566 = (i4 - C2105.m6981("ܿ᩷")) * (-117);
                        i5 = ((m2566 ^ i3) * (-17293)) ^ (-593154871);
                        i6 = 549532754;
                    }
                case -1007240042:
                case 674358853:
                    if (C3683.f11629 >= 0) {
                        m2566 = (i4 - C0630.m2566("ܺۡ")) * 59;
                        i5 = ((m2566 ^ i3) * 18123) ^ 1156383954;
                        i6 = -960108157;
                    } else {
                        m2566 = (C0630.m2566("ۧܰ") + i3) * 9;
                        i5 = ((m2566 ^ i4) * 5397) ^ 249075142;
                        i6 = -483975522;
                    }
                case -830085280:
                case -575636227:
                    if (C3245.f10203 <= 0) {
                        m2566 = (C0630.m2566("ᩴۗ") ^ i4) * 65;
                        i5 = ((m2566 ^ i3) * (-14859)) ^ 1181353310;
                        i6 = -1463531608;
                    } else {
                        m2566 = (C0630.m2566("᩻ܶ") + i3) * (-127);
                        i5 = ((m2566 ^ i4) * 13809) ^ 946981251;
                        i6 = 1099635587;
                    }
                case -643867879:
                case 908271070:
                    if (C1005.f3721) {
                        m2566 = (C2105.m6981("᩶ܶ") ^ i3) * (-67);
                        i5 = ((m2566 ^ i4) * 1745) ^ (-81172252);
                        i6 = -723506863;
                    } else {
                        m2566 = (C0630.m2566("ܳۙ") ^ i4) * 67;
                        i5 = ((m2566 ^ i3) * (-867)) ^ 1363828338;
                        i6 = 1163430551;
                    }
                case -253663719:
                case 987593272:
                    C0422.m1963();
                    C1711.m5736();
                    break;
                case -149485371:
                case 55564413:
                    if (C2126.f7087) {
                        m2566 = (C2105.m6981("᩶ܶ") ^ i3) * (-67);
                        i5 = ((m2566 ^ i4) * 1745) ^ (-81172252);
                        i6 = -723506863;
                    } else {
                        m2566 = (C0630.m2566("ۨᩳ") ^ i4) * (-15);
                        i5 = ((m2566 ^ i3) * (-8627)) ^ (-1216636394);
                        i6 = 1640679860;
                    }
                case 256870162:
                case 1637838486:
                    C1504.m5179();
                    m2566 = (i4 - C0630.m2566("ܺۡ")) * 59;
                    i5 = ((m2566 ^ i3) * 18123) ^ 1156383954;
                    i6 = -960108157;
                case 422687214:
                case 683921006:
                    if (C3019.f9544 >= 0) {
                        m2566 = (i4 - C0630.m2566("ܺۡ")) * 59;
                        i5 = ((m2566 ^ i3) * 18123) ^ 1156383954;
                        i6 = -960108157;
                    } else {
                        m2566 = (C2105.m6981("᩶ܶ") ^ i3) * (-67);
                        i5 = ((m2566 ^ i4) * 1745) ^ (-81172252);
                        i6 = -723506863;
                    }
                case 850380358:
                case 1346406400:
                    if (C2105.f7037 == 0) {
                        m2566 = (i4 - C0630.m2566("ܺۡ")) * 59;
                        i5 = ((m2566 ^ i3) * 18123) ^ 1156383954;
                        i6 = -960108157;
                    } else {
                        m2566 = C0630.m2566("֫֡") ^ i3;
                        i5 = ((m2566 ^ i4) * 31307) ^ 1990917220;
                        i6 = 1417469219;
                    }
                case 1062676324:
                case 1198654392:
                    this.f28861 = false;
                    break;
                default:
                    super.setSelection(i);
                    if (C3911.f12484 >= 0) {
                        m2566 = (C0630.m2566("ᩴۗ") ^ i4) * 65;
                        i5 = ((m2566 ^ i3) * (-14859)) ^ 1181353310;
                        i6 = -1463531608;
                    } else {
                        m2566 = (C2105.m6981("ۛ᩸") + i3) * (-95);
                        i5 = ((m2566 ^ i4) * (-6959)) ^ (-788023335);
                        i6 = 1192608344;
                    }
            }
            return;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m24353(C9503 c9503) {
        long j = 0;
        boolean z = false;
        long j2 = 0;
        int i = -1220378456;
        int i2 = RunnableC3474.f10992;
        int i3 = C4117.f13076;
        int m2566 = C0630.m2566("ۗۧ") ^ i2;
        int i4 = ((m2566 ^ i3) * 3105) ^ (-268484259);
        int i5 = -1265703610;
        while (true) {
            i = ((((i ^ i3) * 21101) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1867854647:
                case 62780701:
                    z = true;
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = C0630.m2566("ܺ᩸") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10691)) ^ (-812218391);
                        i5 = -789710536;
                    } else {
                        m2566 = C0630.m2566("᩺᩶") ^ i2;
                        i4 = ((m2566 ^ i3) * (-11057)) ^ 786008705;
                        i5 = 1051639007;
                    }
                case -1770869792:
                case 942171919:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = (i2 - C2105.m6981("᩵ۛ")) * (-65);
                        i4 = ((m2566 ^ i3) * (-12179)) ^ 1524169609;
                        i5 = -493119881;
                    } else {
                        m2566 = C0630.m2566("ۧ᩵") ^ i3;
                        i4 = ((m2566 ^ i2) * 25957) ^ 1091323808;
                        i5 = -966547968;
                    }
                case -1710936441:
                case -934791900:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = C0630.m2566("ܺ᩸") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10691)) ^ (-812218391);
                        i5 = -789710536;
                    } else {
                        m2566 = (i2 - C0630.m2566("ᩳ᩹")) * (-91);
                        i4 = ((m2566 ^ i3) * 20551) ^ (-1595226221);
                        i5 = 1407900059;
                    }
                case -1616056063:
                case -962046482:
                    C0237.m1481();
                    return false;
                case -1571954083:
                case -16818552:
                    C21923.m49329();
                    if (C0714.f2697 >= 0) {
                        m2566 = (i2 - C2105.m6981("᩵ۛ")) * (-65);
                        i4 = ((m2566 ^ i3) * (-12179)) ^ 1524169609;
                        i5 = -493119881;
                    } else {
                        m2566 = (C2105.m6981("۫᩵") + i3) * (-47);
                        i4 = ((m2566 ^ i2) * 23163) ^ 1199042295;
                        i5 = 508597281;
                    }
                case -1396584593:
                case -87192647:
                    if (C11340.m28031()) {
                        m2566 = C2105.m6981("ۗۨ") ^ i3;
                        i4 = ((m2566 ^ i2) * 22121) ^ 332957300;
                        i5 = -1328308512;
                    } else {
                        m2566 = (i2 - C2105.m6981("᩵ۛ")) * (-65);
                        i4 = ((m2566 ^ i3) * (-12179)) ^ 1524169609;
                        i5 = -493119881;
                    }
                case -1324888341:
                case 932840870:
                    if (C0798.f2919) {
                        m2566 = (C0630.m2566("ۜۚ") ^ i3) * (-37);
                        i4 = ((m2566 ^ i2) * 19495) ^ 1399171255;
                        i5 = -1144616309;
                    } else {
                        m2566 = (C2105.m6981("۫᩵") + i3) * (-47);
                        i4 = ((m2566 ^ i2) * 23163) ^ 1199042295;
                        i5 = 508597281;
                    }
                case -818941656:
                case -774455875:
                    ViewOnClickListenerC1958.m6429();
                    if (C1420.f5096 > 0) {
                        m2566 = (C2105.m6981("۫᩵") + i3) * (-47);
                        i4 = ((m2566 ^ i2) * 23163) ^ 1199042295;
                        i5 = 508597281;
                    } else {
                        m2566 = (C0630.m2566("ۘ۠") ^ i2) * 97;
                        i4 = ((m2566 ^ i3) * (-26857)) ^ (-135204901);
                        i5 = -1140885800;
                    }
                case -715384785:
                case 1747654898:
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = C0630.m2566("ܺ᩸") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10691)) ^ (-812218391);
                        i5 = -789710536;
                    } else {
                        m2566 = (i3 - C2105.m6981("֡ۗ")) * (-55);
                        i4 = ((m2566 ^ i2) * (-17249)) ^ (-378895889);
                        i5 = -1835102531;
                    }
                case -714804709:
                case -56183172:
                    j = c9503.f28868;
                    if (C21923.f70183 != 0) {
                        m2566 = (i2 - C2105.m6981("᩵ۛ")) * (-65);
                        i4 = ((m2566 ^ i3) * (-12179)) ^ 1524169609;
                        i5 = -493119881;
                    } else {
                        m2566 = (i2 - C0630.m2566("ܽۙ")) * (-111);
                        i4 = ((m2566 ^ i3) * (-22369)) ^ (-49255220);
                        i5 = 659872366;
                    }
                case -659702218:
                case 133482691:
                    if (C2520.f8000 >= 0) {
                        m2566 = (C0630.m2566("ۜۚ") ^ i3) * (-37);
                        i4 = ((m2566 ^ i2) * 19495) ^ 1399171255;
                        i5 = -1144616309;
                    } else {
                        m2566 = C0630.m2566("᩻۫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-27179)) ^ (-1622231040);
                        i5 = -778228594;
                    }
                case -434446666:
                case 2055591217:
                    if (RunnableC1108.f4040) {
                        m2566 = C2105.m6981("ۛ۟") ^ i3;
                        i4 = ((m2566 ^ i2) * 11977) ^ 1903980715;
                        i5 = -1905983499;
                    } else {
                        m2566 = C0630.m2566("ܺ᩸") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10691)) ^ (-812218391);
                        i5 = -789710536;
                    }
                case -366394434:
                case 475852265:
                    return z;
                case -167185241:
                case 1317390768:
                    return false;
                case 243332160:
                case 1102848947:
                    C1128.m3851();
                    C0714.m2805();
                    m2566 = (i2 - C2105.m6981("᩵ۛ")) * (-65);
                    i4 = ((m2566 ^ i3) * (-12179)) ^ 1524169609;
                    i5 = -493119881;
                case 1032769315:
                case 1205208329:
                    if (C3019.m9262() > j) {
                        m2566 = C2105.m6981("᩸ۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29171)) ^ 1775105317;
                        i5 = 364113127;
                    } else {
                        m2566 = C0630.m2566("᩹ۗ") ^ i3;
                        i4 = ((m2566 ^ i2) * 11473) ^ 747718563;
                        i5 = -1597876866;
                    }
                case 1106674689:
                case 1952061987:
                    c9503.f28868 = j2;
                    return z;
                case 1598504526:
                case 2136276837:
                    j2 = 0;
                    if (j == 0) {
                        m2566 = C0630.m2566("ۖ۟") ^ i2;
                        i4 = ((m2566 ^ i3) * (-14091)) ^ 141667784;
                        i5 = -1950133030;
                    } else {
                        m2566 = C0630.m2566("᩷ܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * 10585) ^ 569646571;
                        i5 = 287089677;
                    }
                case 1633622104:
                case 2058962807:
                    if (C2958.f9394 >= 0) {
                        m2566 = (C2105.m6981("۫᩵") + i3) * (-47);
                        i4 = ((m2566 ^ i2) * 23163) ^ 1199042295;
                        i5 = 508597281;
                    } else {
                        m2566 = (C2105.m6981("֡ᩳ") + i3) * (-123);
                        i4 = ((m2566 ^ i2) * 32507) ^ (-941068513);
                        i5 = 1961509490;
                    }
                default:
                    if (C7106.f21815 != 0) {
                        m2566 = (C2105.m6981("۫᩵") + i3) * (-47);
                        i4 = ((m2566 ^ i2) * 23163) ^ 1199042295;
                        i5 = 508597281;
                    } else {
                        m2566 = C2105.m6981("ۚۗ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15659)) ^ (-102148322);
                        i5 = -1263137089;
                    }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9503(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        long j = 0;
        boolean z = false;
        C23613 c23613 = null;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 878599085;
        int i3 = ViewOnClickListenerC1958.f6529;
        int i4 = C0714.f2697;
        int m2566 = C0630.m2566("֡᩶") ^ i4;
        int i5 = ((m2566 ^ i3) * 28399) ^ (-1081499500);
        int i6 = -1616220422;
        while (true) {
            i2 = (m2566 ^ i6) ^ (i5 & (((i2 ^ i3) * (-27731)) >> 31));
            switch (i2) {
                case -2122969624:
                case -1469565830:
                    C11340.m28031();
                    if (C1047.f3863 < 0) {
                        m2566 = C2105.m6981("֫ۧ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-18457)) ^ 1854127833;
                        i6 = -38355983;
                    } else {
                        m2566 = (C2105.m6981("ۧۖ") + i4) * (-45);
                        i5 = ((m2566 ^ i3) * (-2891)) ^ (-827985408);
                        i6 = 1473004942;
                    }
                case -2039720514:
                case 894500113:
                    this.f28868 = j;
                    c23613 = new C23613(this);
                    if (C3663.m11168() >= 0) {
                        m2566 = C0630.m2566("ۜ᩶") ^ i4;
                        i5 = ((m2566 ^ i3) * 6565) ^ 1480229734;
                        i6 = 1445033003;
                    } else {
                        m2566 = (C0630.m2566("֨۠") ^ i4) * 13;
                        i5 = ((m2566 ^ i3) * 7671) ^ 316656336;
                        i6 = 394180848;
                    }
                case -1880497735:
                case -1449809574:
                    C1773.m5908();
                    C2126.m7040();
                    throw new RuntimeException();
                case -1683556137:
                case -1077447223:
                    super.setFastScrollEnabled(z);
                    if (isInEditMode()) {
                        m2566 = C2105.m6981("ܶۙ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-16813)) ^ (-410026299);
                        i6 = -907554004;
                    } else {
                        m2566 = C2105.m6981("۫ۙ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-8177)) ^ 1394647132;
                        i6 = 326379209;
                    }
                case -1674273012:
                case 1164052756:
                    this.f28856 = -579373193;
                    if (C0050.f910 >= 0) {
                        m2566 = C0630.m2566("ܶ᩷") ^ i3;
                        i5 = ((m2566 ^ i4) * 7715) ^ (-1512807821);
                        i6 = -62166452;
                    } else {
                        m2566 = C2105.m6981("ܶ۫") ^ i4;
                        i5 = ((m2566 ^ i3) * (-14811)) ^ (-322825729);
                        i6 = 771011893;
                    }
                case -1657020006:
                case -235531494:
                    setSelector(new C20792(this));
                    m2566 = C2105.m6981("ܶۙ") ^ i4;
                    i5 = ((m2566 ^ i3) * (-16813)) ^ (-410026299);
                    i6 = -907554004;
                case -1548007075:
                case 1255827225:
                    this.f28872 = 964130679;
                    f2 = 8.0f;
                    if (C3245.m9925() != 0) {
                        m2566 = C0630.m2566("ܶ᩷") ^ i3;
                        i5 = ((m2566 ^ i4) * 7715) ^ (-1512807821);
                        i6 = -62166452;
                    } else {
                        m2566 = C0630.m2566("ܳ֨") ^ i3;
                        i5 = ((m2566 ^ i4) * (-5489)) ^ 1713658242;
                        i6 = -1709868189;
                    }
                case -1405231862:
                case 374647173:
                    C4075.m12263();
                    m2566 = C2105.m6981("֫ۧ") ^ i3;
                    i5 = ((m2566 ^ i4) * (-18457)) ^ 1854127833;
                    i6 = -38355983;
                case -1202435405:
                case 1619400217:
                    C3537.m10746();
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = C2105.m6981("֫ۧ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-18457)) ^ 1854127833;
                        i6 = -38355983;
                    } else {
                        m2566 = C0630.m2566("ۜ᩶") ^ i4;
                        i5 = ((m2566 ^ i3) * 6565) ^ 1480229734;
                        i6 = 1445033003;
                    }
                case -1159238824:
                case 488759709:
                    this.f28851 = f3;
                    this.f28854 = ViewConfiguration.get(context).getScaledTouchSlop();
                    return;
                case -942242396:
                case 1249166288:
                    this.f28866 = z2;
                    m2566 = (C0630.m2566("᩻ۨ") ^ i3) * 57;
                    i5 = ((m2566 ^ i4) * (-2053)) ^ (-1225114253);
                    i6 = 551904893;
                case -835306623:
                case 447121522:
                    this.f28858 = f * f2;
                    f3 = f * 48.0f;
                    if (C2520.f8000 >= 0) {
                        m2566 = (C2105.m6981("ۧۖ") + i4) * (-45);
                        i5 = ((m2566 ^ i3) * (-2891)) ^ (-827985408);
                        i6 = 1473004942;
                    } else {
                        m2566 = (i4 - C0630.m2566("ܶܿ")) * 23;
                        i5 = ((m2566 ^ i3) * (-15103)) ^ (-1361799810);
                        i6 = -735609583;
                    }
                case -663846612:
                case -605421126:
                    if (C3683.f11629 < 0) {
                        m2566 = (C2105.m6981("ۧۖ") + i4) * (-45);
                        i5 = ((m2566 ^ i3) * (-2891)) ^ (-827985408);
                        i6 = 1473004942;
                    } else {
                        m2566 = C0630.m2566("ܶ᩷") ^ i3;
                        i5 = ((m2566 ^ i4) * 7715) ^ (-1512807821);
                        i6 = -62166452;
                    }
                case -621735497:
                case 1550903121:
                    this.f28864 = new HandlerC6680(this);
                    if (C0483.f2088 >= 0) {
                        m2566 = (C2105.m6981("ۧۖ") + i4) * (-45);
                        i5 = ((m2566 ^ i3) * (-2891)) ^ (-827985408);
                        i6 = 1473004942;
                    } else {
                        m2566 = C2105.m6981("֨ܰ") ^ i4;
                        i5 = ((m2566 ^ i3) * 17649) ^ 1821867488;
                        i6 = -247336793;
                    }
                case -332077893:
                case 762643729:
                    this.f28871 = c23613;
                    z2 = true;
                    z2 = true;
                    if (C3683.f11629 >= 0) {
                        m2566 = (i3 - C2105.m6981("ۛۢ")) * (-39);
                        i5 = ((m2566 ^ i4) * (-989)) ^ (-932696019);
                        i6 = -1763237149;
                    } else {
                        m2566 = (C2105.m6981("ᩳᩳ") + i4) * (-81);
                        i5 = ((m2566 ^ i3) * (-5349)) ^ (-1933910699);
                        i6 = 520552163;
                    }
                case -21905588:
                case 1183743764:
                    super.setOnScrollListener(new C14440(this));
                    if (super.isFastScrollEnabled()) {
                        m2566 = C0630.m2566("ۚۜ") ^ i3;
                        i5 = ((m2566 ^ i4) * 5439) ^ 693910252;
                        i6 = -1812596015;
                    } else {
                        m2566 = (C0630.m2566("᩻ۨ") ^ i3) * 57;
                        i5 = ((m2566 ^ i4) * (-2053)) ^ (-1225114253);
                        i6 = 551904893;
                    }
                case 300268562:
                case 674943159:
                    j = 0;
                    this.f28869 = 0L;
                    if (C2105.f7037 != 0) {
                        m2566 = C0630.m2566("ۜ᩶") ^ i4;
                        i5 = ((m2566 ^ i3) * 6565) ^ 1480229734;
                        i6 = 1445033003;
                    } else {
                        this.f28846 = new C14792(3);
                        if (C3432.f10845 >= 0) {
                            m2566 = C2105.m6981("֫ۧ") ^ i3;
                            i5 = ((m2566 ^ i4) * (-18457)) ^ 1854127833;
                            i6 = -38355983;
                        } else {
                            m2566 = (C2105.m6981("ۗۨ") + i3) * 33;
                            i5 = ((m2566 ^ i4) * (-32145)) ^ 1751929885;
                            i6 = 38106527;
                        }
                    }
                case 991117539:
                case 1272498164:
                    setDefaultFocusHighlightEnabled(z);
                    m2566 = (C2105.m6981("ܰᩳ") + i3) * 13;
                    i5 = ((m2566 ^ i4) * 2345) ^ 1859689439;
                    i6 = 55935014;
                case 1113983312:
                case 2131647538:
                    z = false;
                    this.f28861 = false;
                    if (C1294.m4372() <= 0) {
                        m2566 = (i3 - C2105.m6981("ۛۢ")) * (-39);
                        i5 = ((m2566 ^ i4) * (-989)) ^ (-932696019);
                        i6 = -1763237149;
                    } else {
                        m2566 = C2105.m6981("ܺۧ") ^ i3;
                        i5 = ((m2566 ^ i4) * 9933) ^ 1321994740;
                        i6 = -766568604;
                    }
                case 1115331644:
                case 1202204498:
                    f = context.getResources().getDisplayMetrics().density;
                    if (C4117.f13076 <= 0) {
                        m2566 = (C2105.m6981("ۧۖ") + i4) * (-45);
                        i5 = ((m2566 ^ i3) * (-2891)) ^ (-827985408);
                        i6 = 1473004942;
                    } else {
                        m2566 = C2105.m6981("ۖ᩸") ^ i3;
                        i5 = ((m2566 ^ i4) * (-9511)) ^ (-927741168);
                        i6 = -937962151;
                    }
                default:
                    this.f28863 = z2 ? 1 : 0;
                    setHorizontalScrollBarEnabled(z);
                    setVerticalScrollBarEnabled(z);
                    if (Build.VERSION.SDK_INT >= 26) {
                        m2566 = C0630.m2566("ܿ᩷") ^ i4;
                        i5 = ((m2566 ^ i3) * (-11591)) ^ 319062581;
                        i6 = -1252220442;
                    } else {
                        m2566 = (C2105.m6981("ܰᩳ") + i3) * 13;
                        i5 = ((m2566 ^ i4) * 2345) ^ 1859689439;
                        i6 = 55935014;
                    }
            }
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.ViewParent
    public final boolean showContextMenuForChild(View view) {
        boolean z = false;
        int i = 1759469738;
        int i2 = C3432.f10845;
        int i3 = C1420.f5096;
        int m6981 = (C2105.m6981("֨ᩴ") ^ i3) * (-77);
        int i4 = ((m6981 ^ i2) * (-29427)) ^ (-715168861);
        int i5 = 2136874858;
        while (true) {
            i = ((((i ^ i2) * 19193) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2059008468:
                case -1346455333:
                    this.f28852 = false;
                    m6981 = (i3 - C0630.m2566("᩸᩺")) * (-67);
                    i4 = ((m6981 ^ i2) * (-11409)) ^ (-1985907179);
                    i5 = 634559643;
                case -2007156115:
                case -1344113184:
                    C1294.m4372();
                    if (C0050.m940() > 0) {
                        m6981 = C2105.m6981("ܿܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-27789)) ^ 1534387482;
                        i5 = 997213282;
                    } else {
                        m6981 = C0630.m2566("ۧ᩸") ^ i2;
                        i4 = ((m6981 ^ i3) * (-1285)) ^ 1793739011;
                        i5 = 2901909;
                    }
                case -1907084115:
                case -423032779:
                    if (C3432.m10477() <= 0) {
                        m6981 = C2105.m6981("ܿܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-27789)) ^ 1534387482;
                        i5 = 997213282;
                    } else {
                        m6981 = C2105.m6981("ۧۖ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-12097)) ^ (-393074714);
                        i5 = -126017430;
                    }
                case -1905985388:
                case -420238712:
                    C2105.m6982();
                    C1420.m4913();
                    m6981 = C2105.m6981("ۚᩴ") ^ i3;
                    i4 = ((m6981 ^ i2) * 5103) ^ 1514448616;
                    i5 = -398494754;
                case -1814784372:
                case 798003971:
                    if (C11340.f33930 >= 0) {
                        m6981 = C2105.m6981("ܿܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-27789)) ^ 1534387482;
                        i5 = 997213282;
                    } else {
                        m6981 = C0630.m2566("ܶ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * (-12683)) ^ (-2129962709);
                        i5 = -1795078484;
                    }
                case -1737128262:
                case 1729407313:
                    return z;
                case -1409988976:
                case 174801730:
                    C0630.m2564();
                    RunnableC0588.m2441();
                    return false;
                case -1313111605:
                case -1238132370:
                    if (C3746.f11829 <= 0) {
                        m6981 = C0630.m2566("ۧ᩸") ^ i2;
                        i4 = ((m6981 ^ i3) * (-1285)) ^ 1793739011;
                        i5 = 2901909;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܿܰ")) * 29;
                        i4 = ((m6981 ^ i2) * 11107) ^ (-380349032);
                        i5 = -1116164230;
                    }
                case -1309410493:
                case 1878744049:
                    if (C0714.m2805()) {
                        m6981 = (C2105.m6981("ܺܶ") + i3) * 3;
                        i4 = ((m6981 ^ i2) * 29371) ^ (-606317369);
                        i5 = 1488445180;
                    } else {
                        m6981 = C0630.m2566("ۧ᩸") ^ i2;
                        i4 = ((m6981 ^ i3) * (-1285)) ^ 1793739011;
                        i5 = 2901909;
                    }
                case -1254560564:
                case 178351920:
                    if (C4075.m12263() <= 0) {
                        m6981 = C2105.m6981("ܿܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-27789)) ^ 1534387482;
                        i5 = 997213282;
                    } else {
                        m6981 = C0630.m2566("ۚۨ") ^ i3;
                        i4 = ((m6981 ^ i2) * 31217) ^ 1039610439;
                        i5 = -1386949613;
                    }
                case -1145624783:
                case 766798106:
                    if (C3245.f10203 <= 0) {
                        m6981 = C2105.m6981("ۚᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * 5103) ^ 1514448616;
                        i5 = -398494754;
                    } else {
                        m6981 = C0630.m2566("ۢܳ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-21799)) ^ 1368237207;
                        i5 = -621814712;
                    }
                case -1102590150:
                case 100856675:
                    this.f28865 = true;
                    if (C2272.m7503()) {
                        m6981 = (i3 - C2105.m6981("ۖ᩺")) * (-41);
                        i4 = ((m6981 ^ i2) * (-587)) ^ (-177640619);
                        i5 = -1393280707;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܺ᩹")) * 119;
                        i4 = ((m6981 ^ i2) * 16639) ^ (-1580592670);
                        i5 = 126985967;
                    }
                case -1043354065:
                case 822667534:
                    z = super.showContextMenuForChild(view);
                    if (z) {
                        m6981 = (i2 - C2105.m6981("᩻֡")) * 47;
                        i4 = ((m6981 ^ i3) * 26589) ^ 1068819483;
                        i5 = -2140982652;
                    } else {
                        m6981 = (i3 - C0630.m2566("᩸᩺")) * (-67);
                        i4 = ((m6981 ^ i2) * (-11409)) ^ (-1985907179);
                        i5 = 634559643;
                    }
                case -691312840:
                case 141910527:
                    if (C2272.f7362) {
                        m6981 = C0630.m2566("ۧ᩸") ^ i2;
                        i4 = ((m6981 ^ i3) * (-1285)) ^ 1793739011;
                        i5 = 2901909;
                    } else {
                        m6981 = (C0630.m2566("᩷ᩳ") + i2) * (-97);
                        i4 = ((m6981 ^ i3) * (-31905)) ^ (-1583396931);
                        i5 = -734327534;
                    }
                case -479828766:
                case 1923927905:
                    if (C4616.f14690 <= 0) {
                        m6981 = C0630.m2566("ۚۨ") ^ i3;
                        i4 = ((m6981 ^ i2) * 31217) ^ 1039610439;
                        i5 = -1386949613;
                    } else {
                        m6981 = (i2 - C2105.m6981("ᩴۨ")) * (-77);
                        i4 = ((m6981 ^ i3) * (-19253)) ^ 412961536;
                        i5 = 1863342185;
                    }
                case -291580727:
                case 1403000412:
                    C3019.m9255();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C2105.m6981("ۚᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * 5103) ^ 1514448616;
                        i5 = -398494754;
                    } else {
                        m6981 = C2105.m6981("ܿܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-27789)) ^ 1534387482;
                        i5 = 997213282;
                    }
                case 278409837:
                case 976836776:
                    if (C0382.f1805) {
                        m6981 = (i2 - C2105.m6981("ۘᩴ")) * 21;
                        i4 = ((m6981 ^ i3) * 5977) ^ (-1296906921);
                        i5 = 107489804;
                    } else {
                        m6981 = C2105.m6981("ۚᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * 5103) ^ 1514448616;
                        i5 = -398494754;
                    }
                default:
                    if (C3019.f9544 >= 0) {
                        m6981 = C2105.m6981("ܿܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-27789)) ^ 1534387482;
                        i5 = 997213282;
                    } else {
                        m6981 = C2105.m6981("ۛۨ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-19759)) ^ 994574464;
                        i5 = 1960521322;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b6, code lost:
    
        if (l.C1005.f3721 == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v42 */
    /* JADX WARN: Type inference failed for: r21v44 */
    /* JADX WARN: Type inference failed for: r21v47 */
    /* JADX WARN: Type inference failed for: r21v48 */
    /* JADX WARN: Type inference failed for: r21v49 */
    /* JADX WARN: Type inference failed for: r21v50 */
    @Override // android.widget.AbsListView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 1572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9503.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m24349(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = null;
        Iterator it = null;
        int i = 1885255865;
        int i2 = ServiceConnectionC3453.f10921;
        int i3 = C22628.f73083;
        int m2566 = C0630.m2566("ܿܽ") ^ i3;
        int i4 = ((m2566 ^ i2) * (-32569)) ^ (-266845621);
        int i5 = 185243005;
        while (true) {
            i = ((((i ^ i2) * (-15749)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1749254822:
                case 902333181:
                    if (C1916.m6308() >= 0) {
                        m2566 = (C2105.m6981("᩶ܽ") ^ i2) * (-61);
                        i4 = ((m2566 ^ i3) * (-1909)) ^ 2111513114;
                        i5 = -504067260;
                    } else {
                        m2566 = C0630.m2566("ۘۗ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-1327)) ^ 1183829553;
                        i5 = -1779497952;
                    }
                case -1671536411:
                case -1182927937:
                    if (C4075.f12947 >= 0) {
                        m2566 = (C0630.m2566("ᩴۨ") + i3) * (-25);
                        i4 = ((m2566 ^ i2) * (-24681)) ^ (-2094569930);
                        i5 = -1931128110;
                    } else {
                        m2566 = (i2 - C2105.m6981("ܿۜ")) * (-29);
                        i4 = ((m2566 ^ i3) * (-167)) ^ (-2087638483);
                        i5 = -1813596367;
                    }
                case -1609770948:
                case 654204705:
                    if (C0050.f910 >= 0) {
                        m2566 = C0630.m2566("ܳᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-23451)) ^ (-765818087);
                        i5 = -1244494562;
                    } else {
                        m2566 = C0630.m2566("۫۫") ^ i3;
                        i4 = ((m2566 ^ i2) * 7003) ^ 113847272;
                        i5 = 2080301551;
                    }
                case -1586750020:
                case 21652374:
                    if (this.f28849 == null) {
                        m2566 = (C0630.m2566("ۘ᩶") + i3) * 41;
                        i4 = ((m2566 ^ i2) * (-21033)) ^ 1755476359;
                        i5 = 1720739098;
                    } else {
                        m2566 = (C0630.m2566("۫᩸") + i2) * (-39);
                        i4 = ((m2566 ^ i3) * 8433) ^ (-774088578);
                        i5 = -1508741747;
                    }
                case -1422005066:
                case -552254140:
                    if (C0483.m2123(it)) {
                        m2566 = (C2105.m6981("ۤۛ") ^ i3) * (-29);
                        i4 = ((m2566 ^ i2) * (-15301)) ^ 1436775330;
                        i5 = 763384609;
                    } else {
                        m2566 = (C0630.m2566("ۘ᩶") + i3) * 41;
                        i4 = ((m2566 ^ i2) * (-21033)) ^ 1755476359;
                        i5 = 1720739098;
                    }
                case -1216116730:
                case 1447356732:
                    onTouchListener.onTouch(this, motionEvent);
                    m2566 = (C2105.m6981("ۧܿ") + i3) * (-59);
                    i4 = ((m2566 ^ i2) * (-22087)) ^ (-154736647);
                    i5 = -1098155791;
                case -1158908177:
                case -1142563768:
                    if (RunnableC1108.f4040) {
                        m2566 = C0630.m2566("ܺ᩵") ^ i3;
                        i4 = ((m2566 ^ i2) * 8553) ^ (-1130537345);
                        i5 = -927741133;
                    } else {
                        m2566 = (C0630.m2566("ᩴۨ") + i3) * (-25);
                        i4 = ((m2566 ^ i2) * (-24681)) ^ (-2094569930);
                        i5 = -1931128110;
                    }
                case -1049283356:
                case 1939121188:
                    if (C11340.m28031()) {
                        m2566 = C0630.m2566("۠ܽ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-11091)) ^ (-1743251055);
                        i5 = 2068534391;
                    } else {
                        m2566 = C0630.m2566("ܳᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-23451)) ^ (-765818087);
                        i5 = -1244494562;
                    }
                case -955108173:
                case 1189827083:
                    return false;
                case -927961571:
                case -217430981:
                    if (((View.OnTouchListener) RunnableC1108.m3791(it)).onTouch(this, motionEvent)) {
                        m2566 = C0630.m2566("ܳ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * 22399) ^ 1325797997;
                        i5 = -974927338;
                    } else {
                        m2566 = C2105.m6981("ۤۗ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-1821)) ^ (-1353721262);
                        i5 = 870476871;
                    }
                case -662320834:
                case 270874002:
                    if (C1047.f3863 >= 0) {
                        m2566 = (C2105.m6981("᩶ܽ") ^ i2) * (-61);
                        i4 = ((m2566 ^ i3) * (-1909)) ^ 2111513114;
                        i5 = -504067260;
                    } else {
                        m2566 = (i2 - C0630.m2566("֫֡")) * (-51);
                        i4 = ((m2566 ^ i3) * 6949) ^ (-1067405687);
                        i5 = -77648873;
                    }
                case -541879812:
                case -45074517:
                    if (isEnabled()) {
                        m2566 = (C0630.m2566("᩻֡") ^ i2) * (-83);
                        i4 = ((m2566 ^ i3) * 27455) ^ (-681361847);
                        i5 = 770371752;
                    } else {
                        m2566 = (C0630.m2566("ۘ᩶") + i3) * 41;
                        i4 = ((m2566 ^ i2) * (-21033)) ^ 1755476359;
                        i5 = 1720739098;
                    }
                case -497408026:
                case 689232254:
                    return true;
                case -365521854:
                case 812040403:
                    C0050.m940();
                    if (C1504.m5179()) {
                        m2566 = C0630.m2566("ܳᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-23451)) ^ (-765818087);
                        i5 = -1244494562;
                    } else {
                        m2566 = (C2105.m6981("᩶ܽ") ^ i2) * (-61);
                        i4 = ((m2566 ^ i3) * (-1909)) ^ 2111513114;
                        i5 = -504067260;
                    }
                case -96399508:
                case 1495632335:
                    if (C3683.f11629 < 0) {
                        m2566 = (C2105.m6981("֫᩷") ^ i3) * 17;
                        i4 = ((m2566 ^ i2) * (-1133)) ^ 313239774;
                        i5 = -2056658182;
                    } else {
                        m2566 = (C2105.m6981("ۛۖ") ^ i3) * (-109);
                        i4 = ((m2566 ^ i2) * (-27559)) ^ (-1208915768);
                        i5 = 665806632;
                    }
                case -80348935:
                case 1751000161:
                    C1294.m4372();
                    C3245.m9925();
                    m2566 = (C2105.m6981("֫᩷") ^ i3) * 17;
                    i4 = ((m2566 ^ i2) * (-1133)) ^ 313239774;
                    i5 = -2056658182;
                case 66339045:
                case 1310538348:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = (C0630.m2566("ᩴۨ") + i3) * (-25);
                        i4 = ((m2566 ^ i2) * (-24681)) ^ (-2094569930);
                        i5 = -1931128110;
                    } else {
                        m2566 = (i2 - C0630.m2566("ۢܽ")) * (-51);
                        i4 = ((m2566 ^ i3) * (-9963)) ^ 1818755328;
                        i5 = 1452830068;
                    }
                case 290028357:
                case 762428486:
                    C3537.m10746();
                    return false;
                case 425398768:
                case 1074170456:
                    onTouchListener = this.f28870;
                    if (onTouchListener != null) {
                        m2566 = C0630.m2566("֡֡") ^ i3;
                        i4 = ((m2566 ^ i2) * (-22297)) ^ 157305791;
                        i5 = 1671912447;
                    } else {
                        m2566 = (C2105.m6981("ۧܿ") + i3) * (-59);
                        i4 = ((m2566 ^ i2) * (-22087)) ^ (-154736647);
                        i5 = -1098155791;
                    }
                case 537188017:
                case 1432245523:
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = (C2105.m6981("ۛۖ") ^ i3) * (-109);
                        i4 = ((m2566 ^ i2) * (-27559)) ^ (-1208915768);
                        i5 = 665806632;
                    } else {
                        m2566 = C0630.m2566("۠ۖ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-11907)) ^ (-2083663107);
                        i5 = 879945656;
                    }
                case 593156592:
                case 720442678:
                    it = C4117.m12354(this.f28849);
                    m2566 = C2105.m6981("ۤۗ") ^ i2;
                    i4 = ((m2566 ^ i3) * (-1821)) ^ (-1353721262);
                    i5 = 870476871;
                case 836835013:
                case 1280534105:
                    if (C3537.m10746() <= 0) {
                        m2566 = (C2105.m6981("֫᩷") ^ i3) * 17;
                        i4 = ((m2566 ^ i2) * (-1133)) ^ 313239774;
                        i5 = -2056658182;
                    } else {
                        m2566 = C2105.m6981("ᩳܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * 9325) ^ 1975014500;
                        i5 = -191559392;
                    }
                case 1055487040:
                case 2055500240:
                    if (C1047.f3863 >= 0) {
                        m2566 = (C0630.m2566("ᩴۨ") + i3) * (-25);
                        i4 = ((m2566 ^ i2) * (-24681)) ^ (-2094569930);
                        i5 = -1931128110;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۡ᩸")) * 115;
                        i4 = ((m2566 ^ i2) * 11425) ^ (-1658872426);
                        i5 = 345292405;
                    }
                default:
                    if (C0714.f2697 < 0) {
                        m2566 = (C2105.m6981("֫᩷") ^ i3) * 17;
                        i4 = ((m2566 ^ i2) * (-1133)) ^ 313239774;
                        i5 = -2056658182;
                    } else {
                        m2566 = (C2105.m6981("᩶ܽ") ^ i2) * (-61);
                        i4 = ((m2566 ^ i3) * (-1909)) ^ 2111513114;
                        i5 = -504067260;
                    }
            }
        }
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = null;
        DataSetObserver dataSetObserver = null;
        int i = -1261886129;
        int i2 = RunnableC1937.f6483;
        int i3 = C4075.f12947;
        int m2566 = (i3 - C0630.m2566("ۜۧ")) * 61;
        int i4 = ((m2566 ^ i2) * (-8761)) ^ (-1104671112);
        int i5 = -1537370830;
        while (true) {
            i = ((((i ^ i2) * 17451) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2046574994:
                case 1519586963:
                    if (C2958.f9394 >= 0) {
                        m2566 = C0630.m2566("ܰܽ") ^ i2;
                        i4 = ((m2566 ^ i3) * 29947) ^ (-559913282);
                        i5 = 401475859;
                    } else {
                        m2566 = C0630.m2566("۟ۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * 18591) ^ 858996190;
                        i5 = 2116002154;
                    }
                case -2045956044:
                case -225515377:
                    C7106.m19120();
                    break;
                case -2008153839:
                case -1108940242:
                    if (RunnableC0588.m2441() >= 0) {
                        m2566 = C0630.m2566("ܺܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * 30957) ^ 1174153084;
                        i5 = -2043559411;
                    } else {
                        m2566 = (i2 - C2105.m6981("᩷ۙ")) * (-77);
                        i4 = ((m2566 ^ i3) * (-6131)) ^ 1087812287;
                        i5 = -844599285;
                    }
                case -1873190547:
                case -706457486:
                    listAdapter2 = getAdapter();
                    dataSetObserver = this.f28871;
                    if (listAdapter2 != null) {
                        m2566 = C0630.m2566("ܰۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * 24243) ^ 1481564650;
                        i5 = 1214651098;
                    } else {
                        m2566 = (C0630.m2566("᩺ۚ") + i2) * (-101);
                        i4 = ((m2566 ^ i3) * 11737) ^ (-888440620);
                        i5 = 119135243;
                    }
                case -1783433361:
                case -424811548:
                    break;
                case -1507752383:
                case -771524377:
                    ViewOnClickListenerC1958.m6429();
                    C1047.m3599();
                    m2566 = C0630.m2566("ܰܽ") ^ i2;
                    i4 = ((m2566 ^ i3) * 29947) ^ (-559913282);
                    i5 = 401475859;
                case -1387316125:
                case -1252388790:
                    C0714.m2805();
                    if (C2958.m9034() > 0) {
                        m2566 = C0630.m2566("ܰܽ") ^ i2;
                        i4 = ((m2566 ^ i3) * 29947) ^ (-559913282);
                        i5 = 401475859;
                    } else {
                        m2566 = C0630.m2566("ܺܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * 30957) ^ 1174153084;
                        i5 = -2043559411;
                    }
                case -1069683032:
                case 63148490:
                    listAdapter2.unregisterDataSetObserver(dataSetObserver);
                    m2566 = (C0630.m2566("᩺ۚ") + i2) * (-101);
                    i4 = ((m2566 ^ i3) * 11737) ^ (-888440620);
                    i5 = 119135243;
                case -851816777:
                case 1758179909:
                    super.setAdapter(listAdapter);
                    if (listAdapter != null) {
                        m2566 = (C0630.m2566("᩵ᩴ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m2566 ^ i3) * 28409) ^ 931871785;
                        i5 = -1013779133;
                    } else {
                        m2566 = (C0630.m2566("ۡ᩸") ^ i3) * (-61);
                        i4 = ((m2566 ^ i2) * 4935) ^ (-1691482150);
                        i5 = 1689893993;
                    }
                case -758725837:
                case 878982380:
                    if (C3245.m9925() != 0) {
                        m2566 = (C2105.m6981("ۢ᩵") ^ i2) * 41;
                        i4 = ((m2566 ^ i3) * (-30769)) ^ 51608382;
                        i5 = -398932053;
                    } else {
                        m2566 = C0630.m2566("ۚᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * 11447) ^ (-1407128319);
                        i5 = 991645190;
                    }
                case -651991701:
                case 397951606:
                    if (C0714.m2805()) {
                        m2566 = C2105.m6981("۬᩸") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15599)) ^ (-1078274518);
                        i5 = -5456435;
                    } else {
                        m2566 = C0630.m2566("ܰܽ") ^ i2;
                        i4 = ((m2566 ^ i3) * 29947) ^ (-559913282);
                        i5 = 401475859;
                    }
                case -418689568:
                case 1266985602:
                    if (C2272.m7503()) {
                        m2566 = (C2105.m6981("᩺ܰ") + i3) * (-99);
                        i4 = ((m2566 ^ i2) * (-24545)) ^ (-1397269393);
                        i5 = 345800114;
                    } else {
                        m2566 = (C0630.m2566("۟ۚ") ^ i2) * 65;
                        i4 = ((m2566 ^ i3) * 20981) ^ 1666127586;
                        i5 = -1694687140;
                    }
                case -352782064:
                case 1042365586:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = C0630.m2566("ܰܽ") ^ i2;
                        i4 = ((m2566 ^ i3) * 29947) ^ (-559913282);
                        i5 = 401475859;
                    } else {
                        m2566 = C0630.m2566("ۨ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * (-22161)) ^ (-676687030);
                        i5 = -1857456864;
                    }
                case -163288216:
                case 2050962798:
                    if (RunnableC3474.f10992 <= 0) {
                        m2566 = (C2105.m6981("᩺ܰ") + i3) * (-99);
                        i4 = ((m2566 ^ i2) * (-24545)) ^ (-1397269393);
                        i5 = 345800114;
                    } else {
                        m2566 = (C0630.m2566("ۘܺ") + i2) * (-101);
                        i4 = ((m2566 ^ i3) * 359) ^ 1274006982;
                        i5 = 1323522646;
                    }
                case 11164315:
                case 1588571708:
                    if (C0050.f910 >= 0) {
                        m2566 = C2105.m6981("ܶܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-19629)) ^ (-2034650489);
                        i5 = 779776336;
                    } else {
                        m2566 = (C0630.m2566("֡᩵") ^ i3) * 99;
                        i4 = ((m2566 ^ i2) * 18735) ^ 73365581;
                        i5 = 107091498;
                    }
                case 241841301:
                case 1755060771:
                    if (RunnableC1108.f4040) {
                        m2566 = C0630.m2566("ܰܽ") ^ i2;
                        i4 = ((m2566 ^ i3) * 29947) ^ (-559913282);
                        i5 = 401475859;
                    } else {
                        m2566 = C2105.m6981("ܶܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-19629)) ^ (-2034650489);
                        i5 = 779776336;
                    }
                case 470416415:
                case 1850708971:
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = C0630.m2566("ܰܽ") ^ i2;
                        i4 = ((m2566 ^ i3) * 29947) ^ (-559913282);
                        i5 = 401475859;
                    } else {
                        m2566 = C2105.m6981("ۚۗ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-8595)) ^ 1558936542;
                        i5 = 240678027;
                    }
                case 504942991:
                case 1461425380:
                    if (AbstractC2021.f6743 > 0) {
                        m2566 = C0630.m2566("ܺܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * 30957) ^ 1174153084;
                        i5 = -2043559411;
                    } else {
                        m2566 = (C2105.m6981("ۢ᩵") ^ i2) * 41;
                        i4 = ((m2566 ^ i3) * (-30769)) ^ 51608382;
                        i5 = -398932053;
                    }
                case 1489548298:
                case 1925737104:
                    listAdapter.registerDataSetObserver(dataSetObserver);
                    m2566 = (C0630.m2566("ۡ᩸") ^ i3) * (-61);
                    i4 = ((m2566 ^ i2) * 4935) ^ (-1691482150);
                    i5 = 1689893993;
                default:
                    if (C3245.f10203 <= 0) {
                        m2566 = (C2105.m6981("᩺ܰ") + i3) * (-99);
                        i4 = ((m2566 ^ i2) * (-24545)) ^ (-1397269393);
                        i5 = 345800114;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۗܺ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((m2566 ^ i2) * (-26521)) ^ (-2078370475);
                        i5 = 1419313177;
                    }
            }
            return;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24359() {
        this.f28872 = 0;
    }

    @Override // android.widget.AbsListView
    public final boolean isFastScrollEnabled() {
        return this.f28866;
    }

    @Override // android.widget.AbsListView
    public final void setFastScrollEnabled(boolean z) {
        this.f28866 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24356(C13064 c13064) {
        int i = -142583831;
        int i2 = C0630.f2410;
        int i3 = C3746.f11829;
        int m2566 = (i3 - C0630.m2566("۟ۡ")) * 99;
        int i4 = ((m2566 ^ i2) * 13175) ^ 343544013;
        int i5 = 1729523972;
        while (true) {
            i = ((((i ^ i2) * SecP160R2Field.PInv33) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1887217817:
                case -1008794719:
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = C2105.m6981("ۗ۫") ^ i3;
                        i4 = ((m2566 ^ i2) * 14893) ^ 900652378;
                        i5 = 898229632;
                    } else {
                        m2566 = (C2105.m6981("ۤ۬") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((m2566 ^ i3) * 3455) ^ (-1936596951);
                        i5 = -767813431;
                    }
                case -1585562129:
                case -1321105541:
                    if (C4075.f12947 >= 0) {
                        m2566 = C0630.m2566("ۚ᩺") ^ i3;
                        i4 = ((m2566 ^ i2) * o.a.c) ^ 255275168;
                        i5 = -2044917025;
                    } else {
                        m2566 = (C0630.m2566("ܶ᩷") + i3) * (-19);
                        i4 = ((m2566 ^ i2) * 59) ^ (-1641575409);
                        i5 = 620179749;
                    }
                case -1566287571:
                case -824469383:
                    if (C2126.f7087) {
                        m2566 = C2105.m6981("ۗ۫") ^ i3;
                        i4 = ((m2566 ^ i2) * 14893) ^ 900652378;
                        i5 = 898229632;
                    } else {
                        m2566 = C0630.m2566("ܶ᩵") ^ i3;
                        i4 = ((m2566 ^ i2) * 28627) ^ 916389138;
                        i5 = -379918723;
                    }
                case -1507616845:
                case -523981606:
                    C4263.m12819();
                    if (C2126.f7087) {
                        m2566 = (C2105.m6981("᩵ܿ") ^ i3) * (-43);
                        i4 = ((m2566 ^ i2) * (-29169)) ^ (-1321596504);
                        i5 = -1113428265;
                    } else {
                        m2566 = (C2105.m6981("᩷ۙ") + i2) * 7;
                        i4 = ((m2566 ^ i3) * (-12243)) ^ (-1505416665);
                        i5 = 539484883;
                    }
                case -1430431784:
                case -1403932503:
                    C2520.m8026();
                    m2566 = C2105.m6981("ۗ۫") ^ i3;
                    i4 = ((m2566 ^ i2) * 14893) ^ 900652378;
                    i5 = 898229632;
                case -1159878525:
                case 2067468888:
                    if (C2167.f7158 >= 0) {
                        m2566 = (i2 - C0630.m2566("᩹᩵")) * (-59);
                        i4 = ((m2566 ^ i3) * 24415) ^ 199813528;
                        i5 = -1246910725;
                    } else {
                        m2566 = (i3 - C2105.m6981("᩺֫")) * q.h;
                        i4 = ((m2566 ^ i2) * (-19957)) ^ 51399721;
                        i5 = -66195001;
                    }
                case -957053410:
                case 45679758:
                    if (C4117.f13076 <= 0) {
                        m2566 = C0630.m2566("ۚ᩺") ^ i3;
                        i4 = ((m2566 ^ i2) * o.a.c) ^ 255275168;
                        i5 = -2044917025;
                    } else {
                        m2566 = C2105.m6981("ۚܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-3355)) ^ 1212220186;
                        i5 = 99517413;
                    }
                case -896991389:
                case -219845636:
                    if (C0050.f910 >= 0) {
                        m2566 = C2105.m6981("ۗ۫") ^ i3;
                        i4 = ((m2566 ^ i2) * 14893) ^ 900652378;
                        i5 = 898229632;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۢ֫")) * (-81);
                        i4 = ((m2566 ^ i2) * 32569) ^ (-227072766);
                        i5 = 2000435690;
                    }
                case -562279403:
                case 1523239787:
                    if (C0714.f2697 >= 0) {
                        m2566 = C2105.m6981("ۗ۫") ^ i3;
                        i4 = ((m2566 ^ i2) * 14893) ^ 900652378;
                        i5 = 898229632;
                    } else {
                        m2566 = (i2 - C0630.m2566("᩹᩵")) * (-59);
                        i4 = ((m2566 ^ i3) * 24415) ^ 199813528;
                        i5 = -1246910725;
                    }
                case -502393728:
                case 1397782417:
                    RunnableC1108.m3790();
                    C1005.m3501();
                    break;
                case -10503709:
                case 850185444:
                    this.f28859 = 8388613;
                    break;
                case 158043533:
                case 1904028945:
                    if (C0483.f2088 >= 0) {
                        m2566 = (i2 - C0630.m2566("᩹᩵")) * (-59);
                        i4 = ((m2566 ^ i3) * 24415) ^ 199813528;
                        i5 = -1246910725;
                    } else {
                        m2566 = (i2 - C0630.m2566("᩻۬")) * 89;
                        i4 = ((m2566 ^ i3) * (-4111)) ^ (-209433581);
                        i5 = 1019136814;
                    }
                case 812405660:
                case 1783656064:
                    this.f28860 = c13064;
                    if (C7811.f24123 >= 0) {
                        m2566 = C0630.m2566("ۚ᩺") ^ i3;
                        i4 = ((m2566 ^ i2) * o.a.c) ^ 255275168;
                        i5 = -2044917025;
                    } else {
                        m2566 = C2105.m6981("ۢ۟") ^ i3;
                        i4 = ((m2566 ^ i2) * (-31151)) ^ 361080313;
                        i5 = -1719259845;
                    }
                case 1385105022:
                case 1600042815:
                    if (C3911.f12484 >= 0) {
                        m2566 = C2105.m6981("ۗ۫") ^ i3;
                        i4 = ((m2566 ^ i2) * 14893) ^ 900652378;
                        i5 = 898229632;
                    } else {
                        m2566 = C0630.m2566("ᩳۨ") ^ i2;
                        i4 = ((m2566 ^ i3) * 10139) ^ (-2001310354);
                        i5 = 1793033743;
                    }
                case 1561974396:
                case 2033859019:
                    if (C0964.f3626 != 0) {
                        m2566 = (i2 - C0630.m2566("᩹᩵")) * (-59);
                        i4 = ((m2566 ^ i3) * 24415) ^ 199813528;
                        i5 = -1246910725;
                    } else {
                        m2566 = C0630.m2566("ۧۨ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30733)) ^ 80440634;
                        i5 = 1406909994;
                    }
                default:
                    if (C2167.m7155()) {
                        m2566 = (C2105.m6981("᩷ۙ") + i2) * 7;
                        i4 = ((m2566 ^ i3) * (-12243)) ^ (-1505416665);
                        i5 = 539484883;
                    } else {
                        m2566 = (i2 - C0630.m2566("᩹᩵")) * (-59);
                        i4 = ((m2566 ^ i3) * 24415) ^ 199813528;
                        i5 = -1246910725;
                    }
            }
            return;
        }
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = -951700338;
        int i6 = C1294.f4556;
        int i7 = C1773.f6144;
        int m6981 = (C2105.m6981("۫֫") + i7) * (-37);
        int i8 = ((m6981 ^ i6) * (-25779)) ^ 242514595;
        int i9 = 1290948574;
        while (true) {
            i5 = ((((i5 ^ i6) * (-31533)) >> 31) & i8) ^ (m6981 ^ i9);
            switch (i5) {
                case -1769449874:
                case -406357320:
                    if (C3432.m10477() <= 0) {
                        m6981 = C2105.m6981("۠ۤ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-20997)) ^ (-1584781277);
                        i9 = 154396194;
                    } else {
                        m6981 = C0630.m2566("ᩳ᩸") ^ i6;
                        i8 = ((m6981 ^ i7) * (-23145)) ^ 667103529;
                        i9 = 138204510;
                    }
                case -1764646755:
                case -1258445092:
                    if (C0422.f1886 <= 0) {
                        m6981 = C0630.m2566("ۨܳ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-12787)) ^ 241972372;
                        i9 = -273679878;
                    } else {
                        m6981 = C2105.m6981("ۖۨ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-23565)) ^ 1792063701;
                        i9 = 270205726;
                    }
                case -1506046963:
                case 2115692269:
                    C0964.m3413();
                    m6981 = C0630.m2566("֫᩷") ^ i7;
                    i8 = ((m6981 ^ i6) * 13521) ^ 1474034829;
                    i9 = -2087887366;
                case -1489556208:
                case 451174321:
                    if (C0422.f1886 <= 0) {
                        m6981 = (C0630.m2566("ܿܶ") ^ i7) * (-99);
                        i8 = ((m6981 ^ i6) * (-27071)) ^ (-1816404985);
                        i9 = -1253889221;
                    } else {
                        m6981 = C2105.m6981("ۛ᩵") ^ i6;
                        i8 = ((m6981 ^ i7) * (-12043)) ^ (-1250226260);
                        i9 = -730519944;
                    }
                case -1389300192:
                case 1410953068:
                    C3911.m11924();
                    C5695.m16023();
                    break;
                case -1223048430:
                case 2056326817:
                    if (RunnableC1108.f4040) {
                        m6981 = C2105.m6981("ܿ᩻") ^ i7;
                        i8 = ((m6981 ^ i6) * (-7489)) ^ (-1463696450);
                        i9 = -1707066314;
                    } else {
                        m6981 = C0630.m2566("ۨܳ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-12787)) ^ 241972372;
                        i9 = -273679878;
                    }
                case -373419178:
                case 2071821993:
                    if (C21923.m49329()) {
                        m6981 = C0630.m2566("֫᩷") ^ i7;
                        i8 = ((m6981 ^ i6) * 13521) ^ 1474034829;
                        i9 = -2087887366;
                    } else {
                        m6981 = (C0630.m2566("᩷ۗ") + i7) * 109;
                        i8 = ((m6981 ^ i6) * (-17441)) ^ 116405565;
                        i9 = -1241918927;
                    }
                case -363464088:
                case 303477190:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C2105.m6981("ܳ᩸") ^ i6;
                        i8 = ((m6981 ^ i7) * (-19391)) ^ 503946966;
                        i9 = -1654837084;
                    } else {
                        m6981 = (i7 - C2105.m6981("ۘۙ")) * (-53);
                        i8 = ((m6981 ^ i6) * 23163) ^ 2000955652;
                        i9 = -206509737;
                    }
                case 157928836:
                case 844463914:
                    C21923.m49329();
                    if (C2958.f9394 >= 0) {
                        m6981 = C0630.m2566("֫᩷") ^ i7;
                        i8 = ((m6981 ^ i6) * 13521) ^ 1474034829;
                        i9 = -2087887366;
                    } else {
                        m6981 = C0630.m2566("ۨܳ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-12787)) ^ 241972372;
                        i9 = -273679878;
                    }
                case 225112786:
                case 1051113530:
                    if (C1420.m4913()) {
                        m6981 = C2105.m6981("۠ۤ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-20997)) ^ (-1584781277);
                        i9 = 154396194;
                    } else {
                        m6981 = C0630.m2566("ۛۘ") ^ i6;
                        i8 = ((m6981 ^ i7) * 18205) ^ (-1474589890);
                        i9 = -311536211;
                    }
                case 226777445:
                case 1113995483:
                    if (C0714.m2805()) {
                        m6981 = C2105.m6981("᩵ۡ") ^ i7;
                        i8 = ((m6981 ^ i6) * 22243) ^ 160243589;
                        i9 = -1204417388;
                    } else {
                        m6981 = (C0630.m2566("ܿܶ") ^ i7) * (-99);
                        i8 = ((m6981 ^ i6) * (-27071)) ^ (-1816404985);
                        i9 = -1253889221;
                    }
                case 261148234:
                case 1920157964:
                    if (C3663.f11553) {
                        m6981 = C0630.m2566("֫᩷") ^ i7;
                        i8 = ((m6981 ^ i6) * 13521) ^ 1474034829;
                        i9 = -2087887366;
                    } else {
                        m6981 = (C0630.m2566("ۧܿ") + i6) * 39;
                        i8 = ((m6981 ^ i7) * 20499) ^ (-1405599126);
                        i9 = 493664007;
                    }
                case 599169380:
                case 1012771199:
                    break;
                case 1084723866:
                case 1961597840:
                    if (C22628.f73083 <= 0) {
                        m6981 = C0630.m2566("֫᩷") ^ i7;
                        i8 = ((m6981 ^ i6) * 13521) ^ 1474034829;
                        i9 = -2087887366;
                    } else {
                        m6981 = (C0630.m2566("ܿܶ") ^ i7) * (-99);
                        i8 = ((m6981 ^ i6) * (-27071)) ^ (-1816404985);
                        i9 = -1253889221;
                    }
                case 1157958759:
                case 2107436533:
                    this.f28863 = 1;
                    m6981 = (C2105.m6981("ܳۧ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i8 = ((m6981 ^ i6) * 10789) ^ 1760051982;
                    i9 = 274081125;
                case 1288101753:
                case 1576746447:
                    if (C22628.f73083 <= 0) {
                        m6981 = C2105.m6981("ܳ᩸") ^ i6;
                        i8 = ((m6981 ^ i7) * (-19391)) ^ 503946966;
                        i9 = -1654837084;
                    } else {
                        m6981 = (i6 - C2105.m6981("ۢ᩺")) * q.h;
                        i8 = ((m6981 ^ i7) * 9711) ^ 1193008337;
                        i9 = 1692231489;
                    }
                case 1509296646:
                case 2027525783:
                    if (C4616.f14690 > 0) {
                        m6981 = C0630.m2566("֫᩷") ^ i7;
                        i8 = ((m6981 ^ i6) * 13521) ^ 1474034829;
                        i9 = -2087887366;
                    } else {
                        m6981 = C2105.m6981("۠ۤ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-20997)) ^ (-1584781277);
                        i9 = 154396194;
                    }
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    if (z) {
                        m6981 = C0630.m2566("ۘ᩷") ^ i6;
                        i8 = ((m6981 ^ i7) * (-29461)) ^ (-873445884);
                        i9 = -368225069;
                    } else {
                        m6981 = (C2105.m6981("ܳۧ") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i8 = ((m6981 ^ i6) * 10789) ^ 1760051982;
                        i9 = 274081125;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24344(C9503 c9503, AdapterView adapterView, View view, int i, long j) {
        AdapterView.OnItemLongClickListener onItemLongClickListener = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = -475506809;
        int i3 = C3245.f10203;
        int i4 = C0422.f1886;
        int m6981 = (C2105.m6981("ۧ۠") + i4) * 89;
        int i5 = ((m6981 ^ i3) * (-139)) ^ (-1309964664);
        int i6 = -780135050;
        while (true) {
            i2 = ((((i2 ^ i3) * (-7595)) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -2118190794:
                case 1971735714:
                    return z3;
                case -1946809831:
                case -1793331597:
                    if (RunnableC1108.f4040) {
                        m6981 = (C2105.m6981("᩷ۜ") + i3) * (-47);
                        i5 = ((m6981 ^ i4) * 18433) ^ (-1355682401);
                        i6 = -4574510;
                    } else {
                        m6981 = (i3 - C2105.m6981("۟۟")) * (-127);
                        i5 = ((m6981 ^ i4) * 13061) ^ 1428965810;
                        i6 = -1208736653;
                    }
                case -1942208960:
                case 1528081505:
                    if (C1504.f5354) {
                        m6981 = (C0630.m2566("ۤۚ") ^ i3) * 19;
                        i5 = ((m6981 ^ i4) * (-14335)) ^ 302572072;
                        i6 = -427009270;
                    } else {
                        m6981 = C0630.m2566("ۗᩳ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-25275)) ^ (-99644491);
                        i6 = -989395042;
                    }
                case -1320033820:
                case 1372462331:
                    C0483.m2121();
                    C3683.m11222();
                    m6981 = (i4 - C2105.m6981("ۧܳ")) * (-115);
                    i5 = ((m6981 ^ i3) * 15125) ^ (-1077153741);
                    i6 = 2092674258;
                case -1307579005:
                case -1134089955:
                    C1128.m3851();
                    C1916.m6308();
                    return false;
                case -1167955685:
                case 825420736:
                    if (C0422.f1886 <= 0) {
                        m6981 = (i4 - C0630.m2566("ۗ᩶")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((m6981 ^ i3) * 10621) ^ 1221409379;
                        i6 = 1817219638;
                    } else {
                        m6981 = (C0630.m2566("ۧۢ") ^ i3) * 51;
                        i5 = ((m6981 ^ i4) * (-2857)) ^ (-1408333088);
                        i6 = -1014958842;
                    }
                case -1120940298:
                case -199822633:
                    C3432.m10477();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m6981 = (i4 - C2105.m6981("ۧܳ")) * (-115);
                        i5 = ((m6981 ^ i3) * 15125) ^ (-1077153741);
                        i6 = 2092674258;
                    } else {
                        m6981 = (i3 - C2105.m6981("۟۟")) * (-127);
                        i5 = ((m6981 ^ i4) * 13061) ^ 1428965810;
                        i6 = -1208736653;
                    }
                case -700525304:
                case 1909375848:
                    if (C3746.m11369() >= 0) {
                        m6981 = (C2105.m6981("ܽܺ") ^ i3) * (-121);
                        i5 = ((m6981 ^ i4) * 14201) ^ (-2008574077);
                        i6 = 1080211428;
                    } else {
                        m6981 = C2105.m6981("ۢ֫") ^ i4;
                        i5 = ((m6981 ^ i3) * (-6587)) ^ 349039644;
                        i6 = -273037790;
                    }
                case -532254598:
                case -333792674:
                    if (onItemLongClickListener.onItemLongClick(adapterView, view, i, j)) {
                        m6981 = (C0630.m2566("ᩳᩳ") + i4) * (-105);
                        i5 = ((m6981 ^ i3) * (-19819)) ^ (-301773862);
                        i6 = -831728931;
                    } else {
                        m6981 = C0630.m2566("ۘܰ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-8893)) ^ (-790093568);
                        i6 = -150956933;
                    }
                case -411127414:
                case -375007850:
                    onItemLongClickListener = c9503.f28862;
                    z = false;
                    z2 = true;
                    if (onItemLongClickListener != null) {
                        m6981 = C0630.m2566("ۖۤ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-16113)) ^ 1554904557;
                        i6 = -1035996452;
                    } else {
                        m6981 = C0630.m2566("ۘܰ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-8893)) ^ (-790093568);
                        i6 = -150956933;
                    }
                case -269808606:
                case 2065872113:
                    z3 = false;
                    m6981 = C2105.m6981("۬ۡ") ^ i3;
                    i5 = ((m6981 ^ i4) * 12207) ^ (-759743670);
                    i6 = 1639412259;
                case -145596886:
                case 26979286:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = (C2105.m6981("ܽܺ") ^ i3) * (-121);
                        i5 = ((m6981 ^ i4) * 14201) ^ (-2008574077);
                        i6 = 1080211428;
                    } else {
                        m6981 = (C0630.m2566("᩺ܺ") + i4) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i5 = ((m6981 ^ i3) * 31445) ^ 532151481;
                        i6 = 1517485852;
                    }
                case 58178636:
                case 1419432431:
                    if (C1294.f4556 >= 0) {
                        m6981 = (C2105.m6981("ܽܺ") ^ i3) * (-121);
                        i5 = ((m6981 ^ i4) * 14201) ^ (-2008574077);
                        i6 = 1080211428;
                    } else {
                        m6981 = (C2105.m6981("֨ۡ") ^ i4) * 77;
                        i5 = ((m6981 ^ i3) * 5199) ^ 659599243;
                        i6 = -996497213;
                    }
                case 100274625:
                case 817840575:
                    c9503.f28865 = z2;
                    c9503.f28852 = z;
                    m6981 = (C2105.m6981("ܽ۬") ^ i4) * (-101);
                    i5 = ((m6981 ^ i3) * 25755) ^ (-37837518);
                    i6 = -1430858740;
                case 139103722:
                case 291085947:
                    z3 = true;
                    m6981 = C2105.m6981("۬ۡ") ^ i3;
                    i5 = ((m6981 ^ i4) * 12207) ^ (-759743670);
                    i6 = 1639412259;
                case 190395376:
                case 852758255:
                    if (C21923.f70183 != 0) {
                        m6981 = (i3 - C2105.m6981("۟۟")) * (-127);
                        i5 = ((m6981 ^ i4) * 13061) ^ 1428965810;
                        i6 = -1208736653;
                    } else {
                        m6981 = (C0630.m2566("᩺ܶ") ^ i4) * (-107);
                        i5 = ((m6981 ^ i3) * (-9167)) ^ 909638515;
                        i6 = -1595279075;
                    }
                case 498440879:
                case 734310743:
                    if (C4263.f13799 <= 0) {
                        m6981 = (C2105.m6981("ܽܺ") ^ i3) * (-121);
                        i5 = ((m6981 ^ i4) * 14201) ^ (-2008574077);
                        i6 = 1080211428;
                    } else {
                        m6981 = (i4 - C0630.m2566("ۜܽ")) * 79;
                        i5 = ((m6981 ^ i3) * 19693) ^ 1534332361;
                        i6 = -348029311;
                    }
                case 643955518:
                case 2073495484:
                    if (C1128.f4106 <= 0) {
                        m6981 = (C0630.m2566("ۤۚ") ^ i3) * 19;
                        i5 = ((m6981 ^ i4) * (-14335)) ^ 302572072;
                        i6 = -427009270;
                    } else {
                        m6981 = (C0630.m2566("ۤۡ") + i3) * 115;
                        i5 = ((m6981 ^ i4) * (-8117)) ^ (-1182174955);
                        i6 = 1311886384;
                    }
                case 909940572:
                case 1565783542:
                    if (C1128.f4106 <= 0) {
                        m6981 = (i3 - C2105.m6981("۟۟")) * (-127);
                        i5 = ((m6981 ^ i4) * 13061) ^ 1428965810;
                        i6 = -1208736653;
                    } else {
                        m6981 = C0630.m2566("᩸ܳ") ^ i3;
                        i5 = ((m6981 ^ i4) * 31197) ^ (-2143518422);
                        i6 = 1404346555;
                    }
                case 1137637182:
                case 1842175312:
                    if (z3) {
                        m6981 = (C0630.m2566("۟ۗ") + i3) * (-123);
                        i5 = ((m6981 ^ i4) * 23903) ^ (-328917151);
                        i6 = 1790112897;
                    } else {
                        m6981 = (C2105.m6981("ܽ۬") ^ i4) * (-101);
                        i5 = ((m6981 ^ i3) * 25755) ^ (-37837518);
                        i6 = -1430858740;
                    }
                case 1250611747:
                case 1770558768:
                    if (C7106.m19120() <= 0) {
                        m6981 = (i4 - C2105.m6981("ۧܳ")) * (-115);
                        i5 = ((m6981 ^ i3) * 15125) ^ (-1077153741);
                        i6 = 2092674258;
                    } else {
                        m6981 = (i4 - C0630.m2566("ۗ᩶")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i5 = ((m6981 ^ i3) * 10621) ^ 1221409379;
                        i6 = 1817219638;
                    }
                default:
                    RunnableC1937.m6387();
                    if (C2272.m7503()) {
                        m6981 = (i3 - C2105.m6981("۟۟")) * (-127);
                        i5 = ((m6981 ^ i4) * 13061) ^ 1428965810;
                        i6 = -1208736653;
                    } else {
                        m6981 = (C2105.m6981("ܽܺ") ^ i3) * (-121);
                        i5 = ((m6981 ^ i4) * 14201) ^ (-2008574077);
                        i6 = 1080211428;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0169, code lost:
    
        if (l.C4263.f13799 > 0) goto L26;
     */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r45) {
        /*
            Method dump skipped, instructions count: 2566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9503.draw(android.graphics.Canvas):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m24346(MotionEvent motionEvent) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        MotionEvent motionEvent2 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1523835526;
        int i8 = ServiceConnectionC3453.f10921;
        int i9 = C1294.f4556;
        int m6981 = C2105.m6981("۬ܿ") ^ i9;
        int i10 = ((m6981 ^ i8) * 1077) ^ 1502666650;
        int i11 = -10275337;
        while (true) {
            i7 = ((((i7 ^ i8) * 22185) >> 31) & i10) ^ (m6981 ^ i11);
            switch (i7) {
                case -2037182726:
                case 1677942870:
                    if (C2272.f7362) {
                        m6981 = (C0630.m2566("ܺۨ") + i9) * 109;
                        i10 = ((m6981 ^ i8) * 32047) ^ 843856075;
                        i11 = 873697513;
                    } else {
                        m6981 = (i8 - C2105.m6981("֫᩸")) * 75;
                        i10 = ((m6981 ^ i9) * (-21379)) ^ (-776940384);
                        i11 = 144281451;
                    }
                case -1951705375:
                case 1226885772:
                    C2272.m7503();
                    C3537.m10746();
                    break;
                case -1950879178:
                case 1264211389:
                    C2958.m9024(this, i2).setPressed(z);
                    if (C1916.f6442) {
                        m6981 = C0630.m2566("᩺᩺") ^ i8;
                        i10 = ((m6981 ^ i9) * 18713) ^ (-1657465973);
                        i11 = -1945870939;
                    } else {
                        m6981 = C2105.m6981("ܿۤ") ^ i8;
                        i10 = ((m6981 ^ i9) * 24847) ^ 1004710318;
                        i11 = -1997245789;
                    }
                case -1787247268:
                case -1331887900:
                    motionEvent2 = MotionEvent.obtain(motionEvent);
                    i3 = motionEvent.getActionIndex();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = (C2105.m6981("᩺ۢ") ^ i9) * (-47);
                        i10 = ((m6981 ^ i8) * (-6125)) ^ (-1450952492);
                        i11 = -1782460801;
                    } else {
                        m6981 = C2105.m6981("֫ܶ") ^ i8;
                        i10 = ((m6981 ^ i9) * 30555) ^ 1796200442;
                        i11 = 1458162606;
                    }
                case -1292072599:
                case -979240230:
                    z = false;
                    if (C7106.f21815 != 0) {
                        m6981 = C2105.m6981("ܿۤ") ^ i8;
                        i10 = ((m6981 ^ i9) * 24847) ^ 1004710318;
                        i11 = -1997245789;
                    } else {
                        m6981 = C2105.m6981("ۨۤ") ^ i8;
                        i10 = ((m6981 ^ i9) * (-29927)) ^ (-1499378429);
                        i11 = -678479588;
                    }
                case -1291553972:
                case -1207797348:
                    if (C0964.m3413()) {
                        m6981 = (C2105.m6981("᩺ۢ") ^ i9) * (-47);
                        i10 = ((m6981 ^ i8) * (-6125)) ^ (-1450952492);
                        i11 = -1782460801;
                    } else {
                        m6981 = (i8 - C2105.m6981("֫᩸")) * 75;
                        i10 = ((m6981 ^ i9) * (-21379)) ^ (-776940384);
                        i11 = 144281451;
                    }
                case -1177806376:
                case 1249957323:
                    if (C2272.f7362) {
                        m6981 = (i9 - C2105.m6981("ۧܽ")) * 75;
                        i10 = ((m6981 ^ i8) * (-1287)) ^ 620748483;
                        i11 = 410417791;
                    } else {
                        m6981 = C0630.m2566("ᩴᩴ") ^ i9;
                        i10 = ((m6981 ^ i8) * (-11417)) ^ 1281411794;
                        i11 = -1146810139;
                    }
                case -1172404171:
                case -165643681:
                    i4 = 8;
                    if (C3663.f11553) {
                        m6981 = (i9 - C2105.m6981("ۧܽ")) * 75;
                        i10 = ((m6981 ^ i8) * (-1287)) ^ 620748483;
                        i11 = 410417791;
                    } else {
                        m6981 = (i8 - C0630.m2566("ܿۡ")) * (-91);
                        i10 = ((m6981 ^ i9) * 13653) ^ 2066492328;
                        i11 = 355592769;
                    }
                case -924330912:
                case 976197063:
                    super.onTouchEvent(motionEvent2);
                    motionEvent2.recycle();
                    break;
                case -739552268:
                case 2082453564:
                    motionEvent2.setAction(i5 | i6);
                    if (C2958.m9034() <= 0) {
                        m6981 = (i9 - C2105.m6981("ۧܽ")) * 75;
                        i10 = ((m6981 ^ i8) * (-1287)) ^ 620748483;
                        i11 = 410417791;
                    } else {
                        m6981 = (C2105.m6981("ۙ᩻") + i8) * 11;
                        i10 = ((m6981 ^ i9) * (-801)) ^ (-395895052);
                        i11 = 345922529;
                    }
                case -541115772:
                case 1597699512:
                    C3663.m11168();
                    if (C3683.f11629 < 0) {
                        m6981 = (C0630.m2566("ܺۨ") + i9) * 109;
                        i10 = ((m6981 ^ i8) * 32047) ^ 843856075;
                        i11 = 873697513;
                    } else {
                        m6981 = C2105.m6981("ܿۤ") ^ i8;
                        i10 = ((m6981 ^ i9) * 24847) ^ 1004710318;
                        i11 = -1997245789;
                    }
                case -516248407:
                case 1065112497:
                    if (i2 < i) {
                        m6981 = (C0630.m2566("᩸۠") ^ i9) * (-111);
                        i10 = ((m6981 ^ i8) * (-27911)) ^ 705923296;
                        i11 = 1386736206;
                    } else {
                        m6981 = C2105.m6981("᩻ۡ") ^ i9;
                        i10 = ((m6981 ^ i8) * (-9731)) ^ (-1614377583);
                        i11 = 980633777;
                    }
                case 347007054:
                case 1395930753:
                    cancelLongPress();
                    if (C0483.f2088 >= 0) {
                        m6981 = C2105.m6981("ܿۤ") ^ i8;
                        i10 = ((m6981 ^ i9) * 24847) ^ 1004710318;
                        i11 = -1997245789;
                    } else {
                        m6981 = C0630.m2566("ۤ֨") ^ i8;
                        i10 = ((m6981 ^ i9) * 10131) ^ (-1934859906);
                        i11 = 1577822045;
                    }
                case 463369149:
                case 1349213711:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = (C2105.m6981("᩺ۢ") ^ i9) * (-47);
                        i10 = ((m6981 ^ i8) * (-6125)) ^ (-1450952492);
                        i11 = -1782460801;
                    } else {
                        m6981 = (C0630.m2566("۬۟") + i8) * 97;
                        i10 = ((m6981 ^ i9) * 30581) ^ 447630159;
                        i11 = -1733688015;
                    }
                case 997724304:
                case 1378228700:
                    setPressed(z);
                    i = C1128.m3848(this);
                    i2 = 0;
                    m6981 = (C2105.m6981("ۖۚ") ^ i9) * 49;
                    i10 = ((m6981 ^ i8) * 9957) ^ 985870387;
                    i11 = 1638298902;
                case 1022646792:
                case 1693459402:
                    C0050.m940();
                    m6981 = (C2105.m6981("᩺ۢ") ^ i9) * (-47);
                    i10 = ((m6981 ^ i8) * (-6125)) ^ (-1450952492);
                    i11 = -1782460801;
                case 1391324466:
                case 2051606069:
                    if (C1005.f3721) {
                        m6981 = C2105.m6981("ܽۜ") ^ i9;
                        i10 = ((m6981 ^ i8) * (-20731)) ^ (-2085200409);
                        i11 = 381962444;
                    } else {
                        m6981 = (C0630.m2566("ܺۨ") + i9) * 109;
                        i10 = ((m6981 ^ i8) * 32047) ^ 843856075;
                        i11 = 873697513;
                    }
                case 1626400661:
                case 2127893949:
                    i2++;
                    m6981 = (C2105.m6981("ۖۚ") ^ i9) * 49;
                    i10 = ((m6981 ^ i8) * 9957) ^ 985870387;
                    i11 = 1638298902;
                default:
                    i5 = i3 << i4;
                    i6 = 3;
                    if (C1711.m5736() <= 0) {
                        m6981 = (i9 - C2105.m6981("ۧܽ")) * 75;
                        i10 = ((m6981 ^ i8) * (-1287)) ^ 620748483;
                        i11 = 410417791;
                    } else {
                        m6981 = (i9 - C2105.m6981("۟۫")) * 85;
                        i10 = ((m6981 ^ i8) * (-18755)) ^ 1894166695;
                        i11 = 1636093655;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x023d, code lost:
    
        r10 = (l.C0630.m2566("᩸ۧ") ^ r8) * 19;
        r11 = ((r10 ^ r9) * 10929) ^ 806103882;
        r12 = -1429098819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x02d4, code lost:
    
        r10 = l.C2105.m6981("᩵ۧ") ^ r9;
        r11 = ((r10 ^ r8) * 5923) ^ (-1611833580);
        r12 = -166953080;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x040b, code lost:
    
        r10 = (l.C2105.m6981("ܰۘ") + r9) * (-23);
        r11 = ((r10 ^ r8) * (-6071)) ^ 1302902068;
        r12 = 433331439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x03dd, code lost:
    
        r10 = l.C2105.m6981("᩷ۢ") ^ r8;
        r11 = ((r10 ^ r9) * (-6185)) ^ 1014681927;
        r12 = -779595851;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0305, code lost:
    
        r10 = l.C0630.m2566("ۚ۟") ^ r9;
        r11 = ((r10 ^ r8) * 7793) ^ (-419957750);
        r12 = -22950651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0336, code lost:
    
        r10 = l.C2105.m6981("ᩴۚ") ^ r8;
        r11 = ((r10 ^ r9) * (-15771)) ^ (-706056539);
        r12 = 1269706177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0367, code lost:
    
        r10 = (l.C0630.m2566("۫ܳ") + r8) * (-97);
        r11 = ((r10 ^ r9) * 21255) ^ 111920062;
        r12 = -2135425871;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
    
        r10 = l.C2105.m6981("ۢ֨") ^ r8;
        r11 = ((r10 ^ r9) * (-2999)) ^ 1113818040;
        r12 = -697820531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0398, code lost:
    
        r10 = l.C2105.m6981("ۖܿ") ^ r8;
        r11 = ((r10 ^ r9) * (-753)) ^ (-868439643);
        r12 = -1711629673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0124, code lost:
    
        r10 = l.C2105.m6981("ۙ᩷") ^ r9;
        r11 = ((r10 ^ r8) * 29179) ^ (-55101070);
        r12 = -1214852789;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e2, code lost:
    
        r10 = l.C0630.m2566("ܰᩴ") ^ r8;
        r11 = ((r10 ^ r9) * 13217) ^ (-1339916079);
        r12 = 1537505154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0152, code lost:
    
        r10 = l.C2105.m6981("ۡۜ") ^ r9;
        r11 = ((r10 ^ r8) * (-3065)) ^ (-257735972);
        r12 = -1582199264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017c, code lost:
    
        r10 = l.C0630.m2566("֡᩶") ^ r8;
        r11 = ((r10 ^ r9) * (-19047)) ^ 601013102;
        r12 = -1252063181;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9503.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public final void layoutChildren() {
        int i = -1832634337;
        int i2 = C3911.f12484;
        int i3 = C1773.f6144;
        int m6981 = (C2105.m6981("ۡۡ") + i2) * 47;
        int i4 = ((m6981 ^ i3) * (-30067)) ^ (-1219716308);
        int i5 = -233073010;
        while (true) {
            i = ((((i ^ i3) * 8025) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2091899185:
                case -424788975:
                    if (C0483.f2088 >= 0) {
                        m6981 = C0630.m2566("ܳܿ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-2163)) ^ 1658859970;
                        i5 = -666421950;
                    } else {
                        m6981 = C0630.m2566("ܶ֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-21713)) ^ (-535176187);
                        i5 = 474069346;
                    }
                case -1930317430:
                case -1673948868:
                    C7106.m19120();
                    if (C4616.f14690 > 0) {
                        m6981 = C2105.m6981("۟᩻") ^ i2;
                        i4 = ((m6981 ^ i3) * 24971) ^ (-1130568254);
                        i5 = 1436414638;
                    } else {
                        m6981 = (C0630.m2566("ۘ۟") + i3) * (-39);
                        i4 = ((m6981 ^ i2) * (-28619)) ^ 2001757099;
                        i5 = 282994235;
                    }
                case -1849167563:
                case -1023176592:
                    if (C0422.f1886 <= 0) {
                        m6981 = C2105.m6981("ۗ᩻") ^ i2;
                        i4 = ((m6981 ^ i3) * 21293) ^ (-111670099);
                        i5 = 2061130157;
                    } else {
                        m6981 = (C0630.m2566("֡ܳ") ^ i2) * 49;
                        i4 = ((m6981 ^ i3) * (-331)) ^ (-1866621854);
                        i5 = -1550518182;
                    }
                case -1843676499:
                case -1467311238:
                    if (C4263.f13799 <= 0) {
                        m6981 = C0630.m2566("᩻ۖ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-18889)) ^ (-357937185);
                        i5 = 623252716;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۢ᩺")) * 23;
                        i4 = ((m6981 ^ i2) * (-29279)) ^ (-159206278);
                        i5 = -1936184734;
                    }
                case -1498737840:
                case -1283572793:
                    C0630.m2564();
                    C0382.m1848();
                    break;
                case -1099724760:
                case 614260982:
                    if (C0483.f2088 >= 0) {
                        m6981 = (C0630.m2566("ۘ۟") + i3) * (-39);
                        i4 = ((m6981 ^ i2) * (-28619)) ^ 2001757099;
                        i5 = 282994235;
                    } else {
                        m6981 = C0630.m2566("۫֨") ^ i2;
                        i4 = ((m6981 ^ i3) * (-27471)) ^ (-94066624);
                        i5 = 5096985;
                    }
                case -1099535664:
                case 530863277:
                    if (RunnableC3474.m10630()) {
                        m6981 = (i2 - C2105.m6981("᩵ᩴ")) * 115;
                        i4 = ((m6981 ^ i3) * (-20849)) ^ 2218131;
                        i5 = -553860409;
                    } else {
                        m6981 = C2105.m6981("ۗ᩻") ^ i2;
                        i4 = ((m6981 ^ i3) * 21293) ^ (-111670099);
                        i5 = 2061130157;
                    }
                case -1066619621:
                case -61780618:
                    try {
                        super.layoutChildren();
                    } catch (Throwable unused) {
                    }
                    m6981 = (C0630.m2566("ۛ۫") + i3) * (-13);
                    i4 = ((m6981 ^ i2) * 9263) ^ (-1946202636);
                    i5 = 1577457204;
                case -1010431678:
                case 793247861:
                    C0237.m1481();
                    m6981 = C2105.m6981("۟᩻") ^ i2;
                    i4 = ((m6981 ^ i3) * 24971) ^ (-1130568254);
                    i5 = 1436414638;
                case -721587707:
                case -237333682:
                    C0714.m2805();
                    if (C1916.f6442) {
                        m6981 = C0630.m2566("᩻ۖ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-18889)) ^ (-357937185);
                        i5 = 623252716;
                    } else {
                        m6981 = C2105.m6981("۟᩻") ^ i2;
                        i4 = ((m6981 ^ i3) * 24971) ^ (-1130568254);
                        i5 = 1436414638;
                    }
                case -199090832:
                case 866895081:
                    if (C2520.f8000 >= 0) {
                        m6981 = C0630.m2566("ܳܿ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-2163)) ^ 1658859970;
                        i5 = -666421950;
                    } else {
                        m6981 = (C0630.m2566("ۚܰ") + i3) * (-45);
                        i4 = ((m6981 ^ i2) * 28019) ^ (-433977426);
                        i5 = 149128063;
                    }
                case -90015140:
                case 1206443233:
                    if (C4263.f13799 <= 0) {
                        m6981 = C0630.m2566("᩻ۖ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-18889)) ^ (-357937185);
                        i5 = 623252716;
                    } else {
                        m6981 = C0630.m2566("ܺܿ") ^ i3;
                        i4 = ((m6981 ^ i2) * 8285) ^ (-1190116966);
                        i5 = 250921232;
                    }
                case -28248090:
                case -19393637:
                    break;
                case 72037658:
                case 1752238277:
                    if (C0964.f3626 != 0) {
                        m6981 = C0630.m2566("᩻ۖ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-18889)) ^ (-357937185);
                        i5 = 623252716;
                    } else {
                        m6981 = (C2105.m6981("ۤܳ") + i3) * (-127);
                        i4 = ((m6981 ^ i2) * (-20267)) ^ 1116519654;
                        i5 = -1153567480;
                    }
                case 120330871:
                case 541673379:
                    if (RunnableC3474.m10630()) {
                        m6981 = C2105.m6981("۠۬") ^ i2;
                        i4 = ((m6981 ^ i3) * 8097) ^ (-1075061802);
                        i5 = 314697577;
                    } else {
                        m6981 = (C0630.m2566("ۘ۟") + i3) * (-39);
                        i4 = ((m6981 ^ i2) * (-28619)) ^ 2001757099;
                        i5 = 282994235;
                    }
                case 297259323:
                case 1956849997:
                    if (C11340.m28031()) {
                        m6981 = C2105.m6981("ۡ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * (-20147)) ^ (-2000768825);
                        i5 = -1865534016;
                    } else {
                        m6981 = (C0630.m2566("ۘ۟") + i3) * (-39);
                        i4 = ((m6981 ^ i2) * (-28619)) ^ 2001757099;
                        i5 = 282994235;
                    }
                default:
                    if (RunnableC0588.f2309 < 0) {
                        m6981 = C0630.m2566("᩻ۖ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-18889)) ^ (-357937185);
                        i5 = 623252716;
                    } else {
                        m6981 = C2105.m6981("ۗ᩻") ^ i2;
                        i4 = ((m6981 ^ i3) * 21293) ^ (-111670099);
                        i5 = 2061130157;
                    }
            }
            return;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m24352(MotionEvent motionEvent) {
        int i = 0;
        int i2 = 775941694;
        int i3 = C3432.f10845;
        int i4 = C11340.f33930;
        int m6981 = C2105.m6981("֫ۙ") ^ i4;
        int i5 = ((m6981 ^ i3) * 25331) ^ 616660496;
        int i6 = -740923493;
        while (true) {
            i2 = ((((i2 ^ i3) * (-9157)) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -2125965614:
                case -2057968922:
                    if (C3537.m10746() <= 0) {
                        m6981 = C2105.m6981("ۖۤ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-5367)) ^ 417439681;
                        i6 = 1228324818;
                    } else {
                        m6981 = (C2105.m6981("᩵ۖ") + i4) * (-125);
                        i5 = ((m6981 ^ i3) * (-26915)) ^ 1341246598;
                        i6 = -775448431;
                    }
                case -1695004209:
                case -87824142:
                    if (i == 3) {
                        m6981 = C0630.m2566("ܶۙ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-14609)) ^ (-744082492);
                        i6 = -356305627;
                    } else {
                        m6981 = C0630.m2566("ܳᩴ") ^ i4;
                        i5 = ((m6981 ^ i3) * 10373) ^ 381298448;
                        i6 = -1218764262;
                    }
                case -1659092448:
                case -1031920053:
                    C1420.m4913();
                    if (C3746.m11369() < 0) {
                        m6981 = (C2105.m6981("᩵ܿ") ^ i3) * 35;
                        i5 = ((m6981 ^ i4) * 6355) ^ 141342725;
                        i6 = -701068533;
                    } else {
                        m6981 = C0630.m2566("۠ܺ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-3025)) ^ 1922044619;
                        i6 = -270851136;
                    }
                case -1649800156:
                case 382423270:
                    C3663.m11168();
                    m6981 = (C2105.m6981("᩵ܿ") ^ i3) * 35;
                    i5 = ((m6981 ^ i4) * 6355) ^ 141342725;
                    i6 = -701068533;
                case -1550185409:
                case 1005705382:
                    C0714.m2805();
                    if (C1916.f6442) {
                        m6981 = C2105.m6981("ܽ᩵") ^ i3;
                        i5 = ((m6981 ^ i4) * 30023) ^ (-814382284);
                        i6 = -1457852682;
                    } else {
                        m6981 = (C2105.m6981("᩵ܿ") ^ i3) * 35;
                        i5 = ((m6981 ^ i4) * 6355) ^ 141342725;
                        i6 = -701068533;
                    }
                case -1535749741:
                case 72539778:
                    if (C0798.f2919) {
                        m6981 = C2105.m6981("ۖۤ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-5367)) ^ 417439681;
                        i6 = 1228324818;
                    } else {
                        m6981 = C0630.m2566("ᩳۖ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-30431)) ^ 884408891;
                        i6 = 1210232823;
                    }
                case -1248167310:
                case 834762915:
                    if (RunnableC1108.f4040) {
                        m6981 = (C0630.m2566("֨۬") ^ i3) * (-21);
                        i5 = ((m6981 ^ i4) * 19739) ^ (-1106898400);
                        i6 = 1273986152;
                    } else {
                        m6981 = C2105.m6981("ۖۤ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-5367)) ^ 417439681;
                        i6 = 1228324818;
                    }
                case -981795696:
                case -46805476:
                    if (C1420.f5096 <= 0) {
                        m6981 = (C2105.m6981("᩵ܿ") ^ i3) * 35;
                        i5 = ((m6981 ^ i4) * 6355) ^ 141342725;
                        i6 = -701068533;
                    } else {
                        m6981 = C2105.m6981("ܽۤ") ^ i3;
                        i5 = ((m6981 ^ i4) * 3681) ^ (-1278526520);
                        i6 = 1347002866;
                    }
                case -814031388:
                case 1856502348:
                    if (C0798.f2919) {
                        m6981 = C2105.m6981("ۖۧ") ^ i4;
                        i5 = ((m6981 ^ i3) * 22827) ^ (-1763582763);
                        i6 = -1025397493;
                    } else {
                        m6981 = C0630.m2566("ܳܽ") ^ i4;
                        i5 = ((m6981 ^ i3) * 14233) ^ (-617543995);
                        i6 = -1985993147;
                    }
                case -773032850:
                case 707087028:
                    if (i != 1) {
                        m6981 = C2105.m6981("᩵ᩳ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-30833)) ^ 74948651;
                        i6 = 1339358532;
                    } else {
                        m6981 = C0630.m2566("ܶۙ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-14609)) ^ (-744082492);
                        i6 = -356305627;
                    }
                case -551635757:
                case -108182873:
                    if (AbstractC2021.m6574()) {
                        m6981 = C0630.m2566("۠ܺ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-3025)) ^ 1922044619;
                        i6 = -270851136;
                    } else {
                        m6981 = C2105.m6981("ܽۧ") ^ i4;
                        i5 = ((m6981 ^ i3) * 6981) ^ 1578589020;
                        i6 = -1190629705;
                    }
                case -478724149:
                case 1830989505:
                    if (C4075.f12947 >= 0) {
                        m6981 = C2105.m6981("ۖۤ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-5367)) ^ 417439681;
                        i6 = 1228324818;
                    } else {
                        m6981 = (C0630.m2566("۠᩻") ^ i3) * (-79);
                        i5 = ((m6981 ^ i4) * (-25869)) ^ 1609563100;
                        i6 = 794641504;
                    }
                case -446882403:
                case 329335334:
                    if (C7106.f21815 != 0) {
                        m6981 = C2105.m6981("ۖۧ") ^ i4;
                        i5 = ((m6981 ^ i3) * 22827) ^ (-1763582763);
                        i6 = -1025397493;
                    } else {
                        m6981 = (C0630.m2566("ܿܰ") ^ i4) * (-53);
                        i5 = ((m6981 ^ i3) * 31353) ^ (-1405577349);
                        i6 = -868697540;
                    }
                case 134018601:
                case 2064960535:
                    if (C1420.f5096 <= 0) {
                        m6981 = C2105.m6981("ۖۧ") ^ i4;
                        i5 = ((m6981 ^ i3) * 22827) ^ (-1763582763);
                        i6 = -1025397493;
                    } else {
                        m6981 = C0630.m2566("᩷ۙ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-2915)) ^ 1662531759;
                        i6 = -797195524;
                    }
                case 335847949:
                case 1799435206:
                    RunnableC1108.m3790();
                    C1128.m3851();
                    break;
                case 369263795:
                case 1607960686:
                    this.f28865 = false;
                    break;
                case 388007576:
                case 1569384211:
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = (C2105.m6981("᩵ܿ") ^ i3) * 35;
                        i5 = ((m6981 ^ i4) * 6355) ^ 141342725;
                        i6 = -701068533;
                    } else {
                        m6981 = (C2105.m6981("᩺ܿ") + i3) * (-81);
                        i5 = ((m6981 ^ i4) * (-7287)) ^ (-105828797);
                        i6 = 851541009;
                    }
                case 470699782:
                case 1485394598:
                    C4075.m12263();
                    if (C22628.f73083 > 0) {
                        m6981 = (C2105.m6981("᩵ܿ") ^ i3) * 35;
                        i5 = ((m6981 ^ i4) * 6355) ^ 141342725;
                        i6 = -701068533;
                    } else {
                        m6981 = C2105.m6981("ۖۧ") ^ i4;
                        i5 = ((m6981 ^ i3) * 22827) ^ (-1763582763);
                        i6 = -1025397493;
                    }
                case 1066689694:
                case 1668414599:
                    break;
                default:
                    i = motionEvent.getActionMasked();
                    if (i != 0) {
                        m6981 = (C0630.m2566("۠ۤ") ^ i4) * 67;
                        i5 = ((m6981 ^ i3) * (-5013)) ^ 1907867482;
                        i6 = 1456720838;
                    } else {
                        m6981 = C0630.m2566("ܶۙ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-14609)) ^ (-744082492);
                        i6 = -356305627;
                    }
            }
            return;
        }
    }

    @Override // android.widget.AdapterView
    public final void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        int i = -1691089973;
        int i2 = C3911.f12484;
        int i3 = C3019.f9544;
        int m2566 = (C0630.m2566("ᩴ᩺") + i2) * 13;
        int i4 = ((m2566 ^ i3) * (-17237)) ^ 499972788;
        int i5 = -1090022347;
        while (true) {
            i = ((((i ^ i3) * (-755)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2023868495:
                case 303990941:
                    if (C3432.m10477() > 0) {
                        m2566 = C0630.m2566("ۙܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * 31681) ^ 680102998;
                        i5 = -1761167941;
                    } else {
                        m2566 = (i2 - C0630.m2566("۬ܳ")) * 127;
                        i4 = ((m2566 ^ i3) * (-21975)) ^ (-1706064140);
                        i5 = -630795210;
                    }
                case -1994128950:
                case 1209684064:
                    if (C2272.f7362) {
                        m2566 = (C2105.m6981("ۨ֨") + i2) * 37;
                        i4 = ((m2566 ^ i3) * 20539) ^ (-63731754);
                        i5 = 782447513;
                    } else {
                        m2566 = C2105.m6981("۠ۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * 3593) ^ (-1706954513);
                        i5 = 230183375;
                    }
                case -1879752222:
                case 1344735876:
                    C0483.m2121();
                    C2272.m7503();
                    m2566 = C0630.m2566("ۙܽ") ^ i3;
                    i4 = ((m2566 ^ i2) * 31681) ^ 680102998;
                    i5 = -1761167941;
                case -1479063492:
                case 1712789106:
                    super.setOnItemLongClickListener(null);
                    break;
                case -1460954479:
                case 1020122901:
                    if (C0798.f2919) {
                        m2566 = (C2105.m6981("ۨ֨") + i2) * 37;
                        i4 = ((m2566 ^ i3) * 20539) ^ (-63731754);
                        i5 = 782447513;
                    } else {
                        m2566 = (C0630.m2566("ۚ֡") + i3) * 65;
                        i4 = ((m2566 ^ i2) * (-15171)) ^ 534559536;
                        i5 = -551591811;
                    }
                case -1349280603:
                case 1884778576:
                    if (C2958.f9394 >= 0) {
                        m2566 = (i2 - C0630.m2566("۬ܳ")) * 127;
                        i4 = ((m2566 ^ i3) * (-21975)) ^ (-1706064140);
                        i5 = -630795210;
                    } else {
                        m2566 = (C0630.m2566("ܿ᩺") ^ i3) * 33;
                        i4 = ((m2566 ^ i2) * (-20215)) ^ 902633570;
                        i5 = -1278125866;
                    }
                case -1141665346:
                case 2145699196:
                    C7106.m19120();
                    if (C1128.f4106 > 0) {
                        m2566 = (i2 - C0630.m2566("۬ܳ")) * 127;
                        i4 = ((m2566 ^ i3) * (-21975)) ^ (-1706064140);
                        i5 = -630795210;
                    } else {
                        m2566 = (C2105.m6981("ۨ֨") + i2) * 37;
                        i4 = ((m2566 ^ i3) * 20539) ^ (-63731754);
                        i5 = 782447513;
                    }
                case -903020561:
                case 1306277953:
                    super.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.ᩳۢۡ
                        @Override // android.widget.AdapterView.OnItemLongClickListener
                        public final boolean onItemLongClick(AdapterView adapterView, View view, int i6, long j) {
                            return C9503.m24344(C9503.this, adapterView, view, i6, j);
                        }
                    });
                    break;
                case -693654031:
                case 2096648281:
                    if (C1128.m3851() <= 0) {
                        m2566 = C0630.m2566("ᩴ᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31421)) ^ (-1897552402);
                        i5 = -1727746584;
                    } else {
                        m2566 = (C0630.m2566("֫ۜ") + i3) * 9;
                        i4 = ((m2566 ^ i2) * (-17751)) ^ (-1021133991);
                        i5 = 852327512;
                    }
                case -605883532:
                case 1752774865:
                    if (C0382.m1848()) {
                        m2566 = (C2105.m6981("ۨ֨") + i2) * 37;
                        i4 = ((m2566 ^ i3) * 20539) ^ (-63731754);
                        i5 = 782447513;
                    } else {
                        m2566 = C2105.m6981("᩸ۨ") ^ i2;
                        i4 = ((m2566 ^ i3) * 8685) ^ (-510541851);
                        i5 = -1619013075;
                    }
                case -346313765:
                case 1991692336:
                    if (C1005.f3721) {
                        m2566 = C0630.m2566("᩷ۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * 16585) ^ (-1562776606);
                        i5 = 418983628;
                    } else {
                        m2566 = (C0630.m2566("ܿ᩺") ^ i3) * 33;
                        i4 = ((m2566 ^ i2) * (-20215)) ^ 902633570;
                        i5 = -1278125866;
                    }
                case -178545546:
                case 1814760179:
                    if (C11340.f33930 >= 0) {
                        m2566 = C0630.m2566("ᩴ᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31421)) ^ (-1897552402);
                        i5 = -1727746584;
                    } else {
                        m2566 = C0630.m2566("ۘ֡") ^ i3;
                        i4 = ((m2566 ^ i2) * 29221) ^ (-542707456);
                        i5 = 1830986603;
                    }
                case 112492522:
                case 1565236283:
                    if (C0630.f2410 <= 0) {
                        m2566 = C0630.m2566("ᩴ᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31421)) ^ (-1897552402);
                        i5 = -1727746584;
                    } else {
                        m2566 = C0630.m2566("ۧᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * 2105) ^ 15059148;
                        i5 = 1309166825;
                    }
                case 165922887:
                case 1987584338:
                    if (C11340.f33930 >= 0) {
                        m2566 = C0630.m2566("ۙܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * 31681) ^ 680102998;
                        i5 = -1761167941;
                    } else {
                        m2566 = C0630.m2566("ۡ֡") ^ i2;
                        i4 = ((m2566 ^ i3) * (-19053)) ^ 1421821815;
                        i5 = -1709462356;
                    }
                case 171237254:
                case 226644375:
                    this.f28862 = onItemLongClickListener;
                    if (onItemLongClickListener == null) {
                        m2566 = (C2105.m6981("۫ۖ") + i2) * 99;
                        i4 = ((m2566 ^ i3) * 18367) ^ (-860644738);
                        i5 = 742021202;
                    } else {
                        m2566 = C2105.m6981("ܽۨ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-6605)) ^ 86116612;
                        i5 = -1602398470;
                    }
                case 959067064:
                case 2057824207:
                    C1294.m4372();
                    C0382.m1848();
                    break;
                case 1205056092:
                case 2040516424:
                    if (C1504.f5354) {
                        m2566 = C0630.m2566("ᩴ᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31421)) ^ (-1897552402);
                        i5 = -1727746584;
                    } else {
                        m2566 = (C2105.m6981("۟۬") ^ i3) * 99;
                        i4 = ((m2566 ^ i2) * (-30859)) ^ 866721435;
                        i5 = -279568719;
                    }
                default:
                    if (C4159.m12565() >= 0) {
                        m2566 = (C2105.m6981("ۨ֨") + i2) * 37;
                        i4 = ((m2566 ^ i3) * 20539) ^ (-63731754);
                        i5 = 782447513;
                    } else {
                        m2566 = C0630.m2566("ۚܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * 22139) ^ (-1013615306);
                        i5 = -285198898;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x04e7, code lost:
    
        if (r6 != r1) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e4, code lost:
    
        if (l.C5695.f17556 >= 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        if (l.C4117.f13076 <= 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010b, code lost:
    
        if (l.ViewOnClickListenerC1958.m6429() >= 0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0114, code lost:
    
        if (l.C3683.f11629 < 0) goto L100;
     */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r35) {
        /*
            Method dump skipped, instructions count: 2548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9503.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.AbsListView
    public final void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f28873 = onScrollListener;
    }

    @Override // android.view.View
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f28870 = onTouchListener;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m24343(C9503 c9503, View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = null;
        Iterator it = null;
        int i = 456800605;
        int i2 = C0483.f2088;
        int i3 = C3537.f11231;
        int m6981 = C2105.m6981("᩹ܶ") ^ i2;
        int i4 = ((m6981 ^ i3) * (-12019)) ^ 1853771215;
        int i5 = 1158421921;
        while (true) {
            i = ((((i ^ i3) * 19525) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1910315673:
                case 864463736:
                    C1420.m4913();
                    RunnableC0588.m2441();
                    m6981 = (C0630.m2566("ۗۜ") + i2) * (-67);
                    i4 = ((m6981 ^ i3) * 30793) ^ (-1278073355);
                    i5 = -1206765189;
                case -1897021541:
                case -1546999723:
                    if (C1773.m5910(it)) {
                        m6981 = C0630.m2566("ܶ᩹") ^ i2;
                        i4 = ((m6981 ^ i3) * (-6257)) ^ (-1817160549);
                        i5 = 354219253;
                    } else {
                        m6981 = (C2105.m6981("֫᩻") ^ i2) * 45;
                        i4 = ((m6981 ^ i3) * (-575)) ^ (-331847899);
                        i5 = 1057500542;
                    }
                case -1888773803:
                case -146138783:
                    if (C3432.f10845 >= 0) {
                        m6981 = (i2 - C2105.m6981("᩻ۙ")) * (-3);
                        i4 = ((m6981 ^ i3) * 18757) ^ (-154636014);
                        i5 = 683458107;
                    } else {
                        m6981 = C0630.m2566("۠۫") ^ i3;
                        i4 = ((m6981 ^ i2) * 25673) ^ (-590840070);
                        i5 = -1544923804;
                    }
                case -1856671802:
                case 286232815:
                    if (C7811.f24123 >= 0) {
                        m6981 = (i2 - C2105.m6981("᩻ۙ")) * (-3);
                        i4 = ((m6981 ^ i3) * 18757) ^ (-154636014);
                        i5 = 683458107;
                    } else {
                        m6981 = (i2 - C2105.m6981("ۜ֫")) * (-83);
                        i4 = ((m6981 ^ i3) * 17247) ^ 499464806;
                        i5 = 1352400325;
                    }
                case -1708363649:
                case 1619916084:
                    if (C3911.m11924() <= 0) {
                        m6981 = (C2105.m6981("ܶ᩶") ^ i3) * 119;
                        i4 = ((m6981 ^ i2) * (-17201)) ^ (-796312140);
                        i5 = 1324865310;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۖܽ")) * (-97);
                        i4 = ((m6981 ^ i2) * 9503) ^ 116958019;
                        i5 = -442138044;
                    }
                case -1454889173:
                case 799114959:
                    C1504.m5179();
                    if (C4263.f13799 > 0) {
                        m6981 = C0630.m2566("᩺᩻") ^ i3;
                        i4 = ((m6981 ^ i2) * 9511) ^ (-790225246);
                        i5 = 589236332;
                    } else {
                        m6981 = (i2 - C2105.m6981("᩻ۙ")) * (-3);
                        i4 = ((m6981 ^ i3) * 18757) ^ (-154636014);
                        i5 = 683458107;
                    }
                case -1429329923:
                case -268615135:
                    return true;
                case -1230369148:
                case 1552081625:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C0630.m2566("᩺᩻") ^ i3;
                        i4 = ((m6981 ^ i2) * 9511) ^ (-790225246);
                        i5 = 589236332;
                    } else {
                        m6981 = (i3 - C0630.m2566("ᩳۧ")) * 115;
                        i4 = ((m6981 ^ i2) * (-3109)) ^ (-929279246);
                        i5 = -1510443068;
                    }
                case -1165010007:
                case -169965202:
                    if (C3663.f11553) {
                        m6981 = (C0630.m2566("ۗۜ") + i2) * (-67);
                        i4 = ((m6981 ^ i3) * 30793) ^ (-1278073355);
                        i5 = -1206765189;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܰ᩸")) * 37;
                        i4 = ((m6981 ^ i2) * (-12791)) ^ 453177147;
                        i5 = -1333121208;
                    }
                case -925403464:
                case 1821434873:
                    if (C0422.f1886 <= 0) {
                        m6981 = C2105.m6981("ܽۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * 11565) ^ 1116037475;
                        i5 = -259901562;
                    } else {
                        m6981 = (C0630.m2566("ۛۤ") + i2) * 79;
                        i4 = ((m6981 ^ i3) * (-20005)) ^ (-1669253129);
                        i5 = 1786859216;
                    }
                case -901818123:
                case 1463239480:
                    if (((View.OnTouchListener) C2272.m7513(it)).onTouch(view, motionEvent)) {
                        m6981 = (C0630.m2566("᩶ۤ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((m6981 ^ i2) * 16607) ^ (-520750567);
                        i5 = 1908575781;
                    } else {
                        m6981 = (C0630.m2566("ۢ᩶") + i3) * 25;
                        i4 = ((m6981 ^ i2) * 7125) ^ (-1928512513);
                        i5 = -171695755;
                    }
                case -594457347:
                case -224677813:
                    if (C0630.m2564()) {
                        m6981 = C0630.m2566("᩺᩻") ^ i3;
                        i4 = ((m6981 ^ i2) * 9511) ^ (-790225246);
                        i5 = 589236332;
                    } else {
                        m6981 = C0630.m2566("ܿۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * 14419) ^ (-1838101341);
                        i5 = -1579467531;
                    }
                case -376284353:
                case 1243811594:
                    C1916.m6308();
                    if (C4159.m12565() < 0) {
                        m6981 = (C2105.m6981("ܶ᩶") ^ i3) * 119;
                        i4 = ((m6981 ^ i2) * (-17201)) ^ (-796312140);
                        i5 = 1324865310;
                    } else {
                        m6981 = C0630.m2566("᩺᩻") ^ i3;
                        i4 = ((m6981 ^ i2) * 9511) ^ (-790225246);
                        i5 = 589236332;
                    }
                case -224048281:
                case 2065631741:
                    C3911.m11924();
                    if (C3911.f12484 < 0) {
                        m6981 = (C0630.m2566("ۗۜ") + i2) * (-67);
                        i4 = ((m6981 ^ i3) * 30793) ^ (-1278073355);
                        i5 = -1206765189;
                    } else {
                        m6981 = (C2105.m6981("ܶ᩶") ^ i3) * 119;
                        i4 = ((m6981 ^ i2) * (-17201)) ^ (-796312140);
                        i5 = 1324865310;
                    }
                case -213969891:
                case 608462678:
                    it = C2958.m9029(c9503.f28849);
                    m6981 = (C0630.m2566("ۢ᩶") + i3) * 25;
                    i4 = ((m6981 ^ i2) * 7125) ^ (-1928512513);
                    i5 = -171695755;
                case -15691774:
                case 585797288:
                    if (C1504.m5179()) {
                        m6981 = (i2 - C2105.m6981("᩶ۘ")) * (-39);
                        i4 = ((m6981 ^ i3) * (-13669)) ^ 1286183516;
                        i5 = -690642771;
                    } else {
                        m6981 = C2105.m6981("ܽۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * 11565) ^ 1116037475;
                        i5 = -259901562;
                    }
                case 105535881:
                case 1499066833:
                    return false;
                case 563415603:
                case 1427097684:
                    C1128.m3851();
                    C0483.m2121();
                    return false;
                case 672787213:
                case 1918076197:
                    if (C0714.f2697 >= 0) {
                        m6981 = (i2 - C2105.m6981("᩻ۙ")) * (-3);
                        i4 = ((m6981 ^ i3) * 18757) ^ (-154636014);
                        i5 = 683458107;
                    } else {
                        m6981 = (C2105.m6981("᩶᩵") + i2) * 13;
                        i4 = ((m6981 ^ i3) * 1681) ^ 1943825958;
                        i5 = -1502745199;
                    }
                case 1749306615:
                case 1778431151:
                    onTouchListener.onTouch(view, motionEvent);
                    m6981 = C0630.m2566("۠ۤ") ^ i2;
                    i4 = ((m6981 ^ i3) * 17179) ^ 738796116;
                    i5 = 740072986;
                case 2030499572:
                case 2130218379:
                    if (C0714.m2805()) {
                        m6981 = (C2105.m6981("ۜ۠") + i3) * (-105);
                        i4 = ((m6981 ^ i2) * 9163) ^ 261510540;
                        i5 = 1076934443;
                    } else {
                        m6981 = (i2 - C2105.m6981("᩻ۙ")) * (-3);
                        i4 = ((m6981 ^ i3) * 18757) ^ (-154636014);
                        i5 = 683458107;
                    }
                default:
                    onTouchListener = c9503.f28870;
                    if (onTouchListener != null) {
                        m6981 = (i3 - C2105.m6981("᩻ۧ")) * 69;
                        i4 = ((m6981 ^ i2) * 3579) ^ 642229871;
                        i5 = -335444647;
                    } else {
                        m6981 = C0630.m2566("۠ۤ") ^ i2;
                        i4 = ((m6981 ^ i3) * 17179) ^ 738796116;
                        i5 = 740072986;
                    }
            }
        }
    }
}
