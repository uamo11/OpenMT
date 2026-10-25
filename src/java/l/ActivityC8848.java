package l;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.alipay.sdk.m.y.q;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.tabs.TabLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: 72SJ */
/* renamed from: l.ۡۧ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class ActivityC8848 extends AbstractActivityC3346 implements TextWatcher {

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f26934 = 0;

    /* renamed from: ᩶ۛ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f26935 = {6389, -25664, 18663, 30064, 28545, 26703, 25240, 24709, -29111, -31852, 7771, 7751, 7774, 7756, 7746, 7749, 7778, 7759, 7749, 7754, 7750, 7758, 7778, 7749, 7775, 7758, 7749, 7775, 7691, 7758, 7769, 7769, 7748, 7769, -31743, -25096, 19069, -31904, 18565, 29243, 19778, 32461, -25135, 18591, 18674, -31768, ColorResourcesTableCreator.HEADER_TYPE_PACKAGE, -26334, 26629, -22311, 30616, -32160, -29744, 735, 2098, -5621, 12387, 5415, -1003, -6831, -2476, 2383, 3579, 28160, 28161, 28162, 7825, -16925, -16958, -16943, -16958, -16949, -16952, -16937, -16958, -16939, -16926, -16957, -16946, -16941, -16922, -16956, -16941, -16946, -16943, -16946, -16941, -16930};

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public boolean f26936;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public boolean f26937;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public TabLayout f26938;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public long f26939;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public C0452 f26940;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f26941;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public View f26942;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public String f26943;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public View f26944;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = -1578413999;
        int i5 = C0483.f2088;
        int i6 = C1420.f5096;
        int m2566 = C0630.m2566("ۜ۬") ^ i6;
        int i7 = ((m2566 ^ i5) * (-25239)) ^ 1778870187;
        int i8 = 329252026;
        while (true) {
            i4 = ((((i4 ^ i5) * (-21177)) >> 31) & i7) ^ (m2566 ^ i8);
            switch (i4) {
                case -1946502612:
                case 1823409060:
                    C22628.m50615();
                    break;
                case -1780686700:
                case -788814619:
                    if (C2520.m8026()) {
                        m2566 = C0630.m2566("֫֫") ^ i6;
                        i7 = ((m2566 ^ i5) * (-24877)) ^ 491280790;
                        i8 = 1687857170;
                    } else {
                        m2566 = (C0630.m2566("ۛۡ") ^ i5) * (-23);
                        i7 = ((m2566 ^ i6) * (-30035)) ^ 1919676633;
                        i8 = -1401625109;
                    }
                case -1685571594:
                case 444957920:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = (C2105.m6981("ۛ᩺") + i5) * (-103);
                        i7 = ((m2566 ^ i6) * (-3767)) ^ 578487000;
                        i8 = -393463767;
                    } else {
                        m2566 = C2105.m6981("᩹۬") ^ i5;
                        i7 = ((m2566 ^ i6) * 2501) ^ 523673597;
                        i8 = 1901887144;
                    }
                case -1585373470:
                case 845138644:
                    break;
                case -1367600328:
                case -1337017903:
                    if (C0483.m2121()) {
                        m2566 = C0630.m2566("ۤᩳ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-18379)) ^ 1980373879;
                        i8 = -1401037153;
                    } else {
                        m2566 = C2105.m6981("ۢܰ") ^ i6;
                        i7 = ((m2566 ^ i5) * 21889) ^ (-871429404);
                        i8 = -1170741976;
                    }
                case -1291999922:
                case 1794172930:
                    if (C0630.f2410 <= 0) {
                        m2566 = C2105.m6981("ۢܰ") ^ i6;
                        i7 = ((m2566 ^ i5) * 21889) ^ (-871429404);
                        i8 = -1170741976;
                    } else {
                        m2566 = (C0630.m2566("ۖ᩻") ^ i5) * (-67);
                        i7 = ((m2566 ^ i6) * (-1533)) ^ (-1761424200);
                        i8 = -1409714278;
                    }
                case -1131560369:
                case -100801998:
                    if (C4616.f14690 <= 0) {
                        m2566 = C2105.m6981("۬ܶ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-11853)) ^ 104310671;
                        i8 = 795149818;
                    } else {
                        m2566 = (C2105.m6981("ۛ᩺") + i5) * (-103);
                        i7 = ((m2566 ^ i6) * (-3767)) ^ 578487000;
                        i8 = -393463767;
                    }
                case -869130581:
                case 1649040002:
                    if (RunnableC3474.f10992 <= 0) {
                        m2566 = C2105.m6981("ۢܰ") ^ i6;
                        i7 = ((m2566 ^ i5) * 21889) ^ (-871429404);
                        i8 = -1170741976;
                    } else {
                        m2566 = (C0630.m2566("ܳۜ") + i6) * (-97);
                        i7 = ((m2566 ^ i5) * 15969) ^ 122600217;
                        i8 = 1499745823;
                    }
                case -790363109:
                case 1199461013:
                    C4159.m12565();
                    if (C7811.f24123 < 0) {
                        m2566 = C0630.m2566("ᩳ᩷") ^ i5;
                        i7 = ((m2566 ^ i6) * 17831) ^ 371258905;
                        i8 = 2137636645;
                    } else {
                        m2566 = C0630.m2566("֫֫") ^ i6;
                        i7 = ((m2566 ^ i5) * (-24877)) ^ 491280790;
                        i8 = 1687857170;
                    }
                case -273156860:
                case 1220128267:
                    if (C1128.f4106 <= 0) {
                        m2566 = C0630.m2566("֫֫") ^ i6;
                        i7 = ((m2566 ^ i5) * (-24877)) ^ 491280790;
                        i8 = 1687857170;
                    } else {
                        m2566 = C2105.m6981("ۛۨ") ^ i5;
                        i7 = ((m2566 ^ i6) * (-18917)) ^ 1921419871;
                        i8 = -1282450616;
                    }
                case -173243110:
                case 1606069766:
                    if (C21923.f70183 != 0) {
                        m2566 = C2105.m6981("۬ܶ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-11853)) ^ 104310671;
                        i8 = 795149818;
                    } else {
                        m2566 = C0630.m2566("ۧۨ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-24875)) ^ (-1107548104);
                        i8 = 1498383253;
                    }
                case 123581479:
                case 1823266342:
                    if (C1420.m4913()) {
                        m2566 = C2105.m6981("۬ܶ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-11853)) ^ 104310671;
                        i8 = 795149818;
                    } else {
                        m2566 = C2105.m6981("ܰ᩵") ^ i6;
                        i7 = ((m2566 ^ i5) * (-19137)) ^ (-533236510);
                        i8 = 691718867;
                    }
                case 380628380:
                case 1113281285:
                    if (C11340.f33930 >= 0) {
                        m2566 = C0630.m2566("ᩳ᩷") ^ i5;
                        i7 = ((m2566 ^ i6) * 17831) ^ 371258905;
                        i8 = 2137636645;
                    } else {
                        m2566 = C2105.m6981("ۤ֫") ^ i6;
                        i7 = ((m2566 ^ i5) * 14021) ^ (-1292309919);
                        i8 = -1825463242;
                    }
                case 624756938:
                case 1347812542:
                    if (C0964.f3626 != 0) {
                        m2566 = C2105.m6981("ۢܰ") ^ i6;
                        i7 = ((m2566 ^ i5) * 21889) ^ (-871429404);
                        i8 = -1170741976;
                    } else {
                        m2566 = (i5 - C2105.m6981("֫ۤ")) * (-19);
                        i7 = ((m2566 ^ i6) * (-23557)) ^ 423469147;
                        i8 = 304378272;
                    }
                case 659605222:
                case 913570533:
                    if (C11340.f33930 >= 0) {
                        m2566 = C2105.m6981("۬ܶ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-11853)) ^ 104310671;
                        i8 = 795149818;
                    } else {
                        m2566 = C0630.m2566("ᩳ᩷") ^ i5;
                        i7 = ((m2566 ^ i6) * 17831) ^ 371258905;
                        i8 = 2137636645;
                    }
                default:
                    C0714.m2805();
                    m2566 = C2105.m6981("۬ܶ") ^ i6;
                    i7 = ((m2566 ^ i5) * (-11853)) ^ 104310671;
                    i8 = 795149818;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        short s3 = 0;
        int i2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 850468707;
        int i6 = C1773.f6144;
        int i7 = C22628.f73083;
        int m6981 = (C2105.m6981("۬᩸") ^ i6) * (-65);
        int i8 = ((m6981 ^ i7) * 26087) ^ 2111015628;
        int i9 = -1500521073;
        while (true) {
            i5 = ((((i5 ^ i7) * 8217) >> 31) & i8) ^ (m6981 ^ i9);
            switch (i5) {
                case -2129583117:
                case 1960224598:
                    i3 = 48551;
                    m6981 = C0630.m2566("ᩳۧ") ^ i6;
                    i8 = ((m6981 ^ i7) * 22875) ^ (-376648319);
                    i9 = 744987044;
                case -2024674039:
                case -1825338906:
                    sArr = f26935;
                    if (C2105.f7037 != 0) {
                        m6981 = (C2105.m6981("۫᩷") ^ i7) * (-31);
                        i8 = ((m6981 ^ i6) * 27907) ^ 310489728;
                        i9 = -504499675;
                    } else {
                        m6981 = (i7 - C2105.m6981("ۙ᩵")) * (-93);
                        i8 = ((m6981 ^ i6) * 1353) ^ 2020134136;
                        i9 = -267663258;
                    }
                case -1735866870:
                case -1373695487:
                    C3911.m11924();
                    C4117.m12364();
                    m6981 = C0630.m2566("ܽ᩹") ^ i6;
                    i8 = ((m6981 ^ i7) * 18465) ^ 693432282;
                    i9 = -233713588;
                case -1690714602:
                case -938098749:
                    s = sArr[c];
                    s2 = 9880;
                    if (C0798.f2919) {
                        m6981 = C2105.m6981("۟֫") ^ i6;
                        i8 = ((m6981 ^ i7) * 3513) ^ 714401999;
                        i9 = 2023991209;
                    } else {
                        m6981 = (C0630.m2566("֫֨") ^ i6) * 39;
                        i8 = ((m6981 ^ i7) * 4273) ^ (-885305514);
                        i9 = 292147529;
                    }
                case -1673219031:
                case 1451331866:
                    if (i - (i2 * i2) > 0) {
                        m6981 = C0630.m2566("֫֡") ^ i7;
                        i8 = ((m6981 ^ i6) * (-8615)) ^ (-354578185);
                        i9 = 839922078;
                    } else {
                        m6981 = C2105.m6981("᩺᩶") ^ i6;
                        i8 = ((m6981 ^ i7) * 27093) ^ 205307832;
                        i9 = 1516800412;
                    }
                case -1663635021:
                case 730852784:
                    if (C1504.f5354) {
                        m6981 = (C0630.m2566("۬ۖ") + i6) * 37;
                        i8 = ((m6981 ^ i7) * (-19737)) ^ (-840174939);
                        i9 = -352592289;
                    } else {
                        m6981 = C2105.m6981("᩸ۛ") ^ i6;
                        i8 = ((m6981 ^ i7) * 17007) ^ 215693848;
                        i9 = 1980050749;
                    }
                case -1208986288:
                case -572810525:
                    if (C2958.f9394 >= 0) {
                        m6981 = C0630.m2566("ܺܳ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-4343)) ^ (-310941267);
                        i9 = 1755488063;
                    } else {
                        m6981 = C2105.m6981("ۗ᩹") ^ i6;
                        i8 = ((m6981 ^ i7) * 23447) ^ 101836430;
                        i9 = -945044249;
                    }
                case -1154363750:
                case 1488680872:
                    if (C3683.f11629 >= 0) {
                        m6981 = C2105.m6981("۟֫") ^ i6;
                        i8 = ((m6981 ^ i7) * 3513) ^ 714401999;
                        i9 = 2023991209;
                    } else {
                        m6981 = C2105.m6981("᩵ۛ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-27695)) ^ (-47195344);
                        i9 = -2112853835;
                    }
                case -997744977:
                case 730134207:
                    if (C3245.f10203 <= 0) {
                        m6981 = C0630.m2566("ܽ᩹") ^ i6;
                        i8 = ((m6981 ^ i7) * 18465) ^ 693432282;
                        i9 = -233713588;
                    } else {
                        m6981 = (C2105.m6981("۫᩷") ^ i7) * (-31);
                        i8 = ((m6981 ^ i6) * 27907) ^ 310489728;
                        i9 = -504499675;
                    }
                case -996318308:
                case 47825542:
                    sArr2 = f26935;
                    i4 = 67;
                    if (C2958.f9394 >= 0) {
                        m6981 = C2105.m6981("۟֫") ^ i6;
                        i8 = ((m6981 ^ i7) * 3513) ^ 714401999;
                        i9 = 2023991209;
                    } else {
                        m6981 = (C0630.m2566("ۨۙ") + i7) * (-53);
                        i8 = ((m6981 ^ i6) * (-23691)) ^ (-313704526);
                        i9 = -1707619299;
                    }
                case -697664939:
                case -592688282:
                    RunnableC0588.m2441();
                    return null;
                case -384414829:
                case 1353480204:
                    if (C2520.m8026()) {
                        m6981 = C0630.m2566("ܺܳ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-4343)) ^ (-310941267);
                        i9 = 1755488063;
                    } else {
                        m6981 = (i6 - C2105.m6981("֨۬")) * (-7);
                        i8 = ((m6981 ^ i7) * 4835) ^ (-514378151);
                        i9 = -1548559612;
                    }
                case -342652019:
                case 1444814067:
                    if (C7106.f21815 == 0) {
                        m6981 = C0630.m2566("ܽ᩹") ^ i6;
                        i8 = ((m6981 ^ i7) * 18465) ^ 693432282;
                        i9 = -233713588;
                    } else {
                        m6981 = C0630.m2566("ܺܳ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-4343)) ^ (-310941267);
                        i9 = 1755488063;
                    }
                case 19145111:
                case 133399083:
                    i3 = 31766;
                    m6981 = C0630.m2566("ᩳۧ") ^ i6;
                    i8 = ((m6981 ^ i7) * 22875) ^ (-376648319);
                    i9 = 744987044;
                case 256476027:
                case 1624247064:
                    i2 = s + s3;
                    if (C0237.f1507 != 0) {
                        m6981 = (C2105.m6981("۫᩷") ^ i7) * (-31);
                        i8 = ((m6981 ^ i6) * 27907) ^ 310489728;
                        i9 = -504499675;
                    } else {
                        m6981 = (i7 - C0630.m2566("ۤᩳ")) * (-127);
                        i8 = ((m6981 ^ i6) * 8433) ^ 1675982897;
                        i9 = -661513987;
                    }
                case 407418460:
                case 459642150:
                    c = 'B';
                    if (C1047.f3863 >= 0) {
                        m6981 = (C2105.m6981("۫᩷") ^ i7) * (-31);
                        i8 = ((m6981 ^ i6) * 27907) ^ 310489728;
                        i9 = -504499675;
                    } else {
                        m6981 = C0630.m2566("ۘ᩵") ^ i7;
                        i8 = ((m6981 ^ i6) * (-21325)) ^ 1322617805;
                        i9 = -34187331;
                    }
                case 536445636:
                case 1564573413:
                    if (C1294.f4556 < 0) {
                        m6981 = (C2105.m6981("۫᩷") ^ i7) * (-31);
                        i8 = ((m6981 ^ i6) * 27907) ^ 310489728;
                        i9 = -504499675;
                    } else {
                        m6981 = (C0630.m2566("۬ۖ") + i6) * 37;
                        i8 = ((m6981 ^ i7) * (-19737)) ^ (-840174939);
                        i9 = -352592289;
                    }
                case 543066689:
                case 1306925313:
                    return C4616.m13542(sArr2, i4, 21, i3);
                default:
                    i = s * s2;
                    s3 = 2470;
                    if (C1128.m3851() <= 0) {
                        m6981 = C2105.m6981("۟֫") ^ i6;
                        i8 = ((m6981 ^ i7) * 3513) ^ 714401999;
                        i9 = 2023991209;
                    } else {
                        m6981 = (C0630.m2566("᩸ۜ") + i7) * (-73);
                        i8 = ((m6981 ^ i6) * (-23035)) ^ 248023920;
                        i9 = -1048112423;
                    }
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = -1849641418;
        int i5 = C3245.f10203;
        int i6 = C22628.f73083;
        int m6981 = (C2105.m6981("ۛ֫") ^ i5) * (-121);
        int i7 = ((m6981 ^ i6) * (-6739)) ^ 1343699559;
        int i8 = 252631076;
        while (true) {
            i4 = ((((i4 ^ i6) * (-24299)) >> 31) & i7) ^ (m6981 ^ i8);
            switch (i4) {
                case -2126271667:
                case 1917413019:
                    if (C0798.f2919) {
                        m6981 = C2105.m6981("۟ܰ") ^ i5;
                        i7 = ((m6981 ^ i6) * 4579) ^ 328538510;
                        i8 = -1172837243;
                    } else {
                        m6981 = C2105.m6981("ۨܿ") ^ i6;
                        i7 = ((m6981 ^ i5) * (-27465)) ^ 1478648742;
                        i8 = -71688119;
                    }
                case -2106627900:
                case -1147159476:
                    if (C0237.m1481() >= 0) {
                        m6981 = C0630.m2566("᩷ۛ") ^ i5;
                        i7 = ((m6981 ^ i6) * 18663) ^ (-763807901);
                        i8 = -862720552;
                    } else {
                        m6981 = (C2105.m6981("֫۟") ^ i6) * (-19);
                        i7 = ((m6981 ^ i5) * 16049) ^ 1755236521;
                        i8 = 83540174;
                    }
                case -1737594660:
                case -1152698948:
                    ServiceConnectionC3453.m10564();
                    C1711.m5736();
                    m6981 = C0630.m2566("᩻ۖ") ^ i6;
                    i7 = ((m6981 ^ i5) * 32765) ^ 1675954851;
                    i8 = 434038418;
                case -1725902847:
                case -1566458090:
                    if (C3683.f11629 >= 0) {
                        m6981 = C2105.m6981("۟ܰ") ^ i5;
                        i7 = ((m6981 ^ i6) * 4579) ^ 328538510;
                        i8 = -1172837243;
                    } else {
                        m6981 = C0630.m2566("᩶᩺") ^ i6;
                        i7 = ((m6981 ^ i5) * (-7297)) ^ 1286230380;
                        i8 = 1462613694;
                    }
                case -1516573630:
                case 361844172:
                    if (C2167.f7158 >= 0) {
                        m6981 = C0630.m2566("᩻ۖ") ^ i6;
                        i7 = ((m6981 ^ i5) * 32765) ^ 1675954851;
                        i8 = 434038418;
                    } else {
                        m6981 = (C2105.m6981("ۤ᩷") ^ i6) * 3;
                        i7 = ((m6981 ^ i5) * 14401) ^ 1429529254;
                        i8 = 561201532;
                    }
                case -1491864160:
                case 2016387858:
                    if (C1047.f3863 >= 0) {
                        m6981 = C0630.m2566("᩻ۖ") ^ i6;
                        i7 = ((m6981 ^ i5) * 32765) ^ 1675954851;
                        i8 = 434038418;
                    } else {
                        m6981 = C2105.m6981("ᩴ֨") ^ i6;
                        i7 = ((m6981 ^ i5) * 5735) ^ 1587362191;
                        i8 = 1202280908;
                    }
                case -1377898847:
                case 441468977:
                    this.f26937 = true;
                    break;
                case -832963587:
                case 967371295:
                    if (C5695.f17556 >= 0) {
                        m6981 = C0630.m2566("᩷ۛ") ^ i5;
                        i7 = ((m6981 ^ i6) * 18663) ^ (-763807901);
                        i8 = -862720552;
                    } else {
                        m6981 = (i5 - C0630.m2566("۠ܳ")) * q.h;
                        i7 = ((m6981 ^ i6) * 7109) ^ (-1677147356);
                        i8 = 1900968451;
                    }
                case -286683404:
                case 1285401694:
                    AbstractC2021.m6574();
                    if (C0798.m2998() == 0) {
                        m6981 = C0630.m2566("᩻ۖ") ^ i6;
                        i7 = ((m6981 ^ i5) * 32765) ^ 1675954851;
                        i8 = 434038418;
                    } else {
                        m6981 = C0630.m2566("ۤᩳ") ^ i6;
                        i7 = ((m6981 ^ i5) * (-3455)) ^ (-1778398860);
                        i8 = -618972416;
                    }
                case -285684244:
                case 341949468:
                    RunnableC1108.m3790();
                    if (C1916.f6442) {
                        m6981 = C2105.m6981("۟ܰ") ^ i5;
                        i7 = ((m6981 ^ i6) * 4579) ^ 328538510;
                        i8 = -1172837243;
                    } else {
                        m6981 = C0630.m2566("᩻ۖ") ^ i6;
                        i7 = ((m6981 ^ i5) * 32765) ^ 1675954851;
                        i8 = 434038418;
                    }
                case 82010085:
                case 1598808095:
                    if (C3746.f11829 <= 0) {
                        m6981 = C2105.m6981("۟ܰ") ^ i5;
                        i7 = ((m6981 ^ i6) * 4579) ^ 328538510;
                        i8 = -1172837243;
                    } else {
                        m6981 = (C0630.m2566("۠ᩴ") ^ i5) * 5;
                        i7 = ((m6981 ^ i6) * (-779)) ^ (-417007540);
                        i8 = 247539962;
                    }
                case 302409976:
                case 1102180546:
                    if (C5695.m16023() >= 0) {
                        m6981 = C0630.m2566("᩻ۖ") ^ i6;
                        i7 = ((m6981 ^ i5) * 32765) ^ 1675954851;
                        i8 = 434038418;
                    } else {
                        m6981 = (C2105.m6981("۬ܿ") ^ i5) * (-59);
                        i7 = ((m6981 ^ i6) * 12581) ^ 1850649894;
                        i8 = -1427253177;
                    }
                case 605028633:
                case 742317002:
                    C3683.m11222();
                    break;
                case 827620035:
                case 1312134304:
                    C1294.m4372();
                    if (C0483.f2088 >= 0) {
                        m6981 = C2105.m6981("۟ܰ") ^ i5;
                        i7 = ((m6981 ^ i6) * 4579) ^ 328538510;
                        i8 = -1172837243;
                    } else {
                        m6981 = C0630.m2566("᩷ۛ") ^ i5;
                        i7 = ((m6981 ^ i6) * 18663) ^ (-763807901);
                        i8 = -862720552;
                    }
                case 1657667225:
                case 1886489540:
                    if (C0050.m940() <= 0) {
                        m6981 = C0630.m2566("᩷ۛ") ^ i5;
                        i7 = ((m6981 ^ i6) * 18663) ^ (-763807901);
                        i8 = -862720552;
                    } else {
                        m6981 = (C0630.m2566("ۘ֨") + i5) * (-127);
                        i7 = ((m6981 ^ i6) * 27631) ^ 1439620431;
                        i8 = -1529813254;
                    }
                default:
                    if (C3537.f11231 >= 0) {
                        m6981 = C0630.m2566("ۚۢ") ^ i6;
                        i7 = ((m6981 ^ i5) * 28213) ^ 924226876;
                        i8 = 2077640971;
                    } else {
                        m6981 = C2105.m6981("ۗ᩸") ^ i5;
                        i7 = ((m6981 ^ i6) * (-10945)) ^ 1693516518;
                        i8 = 942276312;
                    }
            }
            return;
        }
    }

    public ActivityC8848() {
        ArrayList arrayList = null;
        int i = 1393180616;
        int i2 = RunnableC1937.f6483;
        int i3 = C0422.f1886;
        int m2566 = (C0630.m2566("֫ܶ") + i3) * (-95);
        int i4 = ((m2566 ^ i2) * (-16167)) ^ 102803346;
        int i5 = 1851003101;
        while (true) {
            i = ((((i ^ i2) * (-16563)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2065708290:
                case 1819082525:
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = (C0630.m2566("֨֫") + i2) * (-13);
                        i4 = ((m2566 ^ i3) * (-243)) ^ (-521130185);
                        i5 = 1239590462;
                    } else {
                        m2566 = C0630.m2566("᩹֫") ^ i3;
                        i4 = ((m2566 ^ i2) * (-14507)) ^ 1770228572;
                        i5 = -365942680;
                    }
                case -2055359104:
                case -561586295:
                    C3245.m9925();
                    if (C11340.f33930 >= 0) {
                        m2566 = C2105.m6981("֨ᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * 15915) ^ (-1874647562);
                        i5 = 657199721;
                    } else {
                        m2566 = C0630.m2566("ۛۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * 7945) ^ 1271218153;
                        i5 = -578655659;
                    }
                case -1895514387:
                case 1340710016:
                    C1916.m6308();
                    C2126.m7040();
                    m2566 = C2105.m6981("֡۬") ^ i3;
                    i4 = ((m2566 ^ i2) * 26043) ^ (-416976975);
                    i5 = -1044110871;
                case -1815739504:
                case -1158665997:
                    if (C1047.f3863 >= 0) {
                        m2566 = C2105.m6981("֨ᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * 15915) ^ (-1874647562);
                        i5 = 657199721;
                    } else {
                        m2566 = (C2105.m6981("ۧܺ") + i3) * 65;
                        i4 = ((m2566 ^ i2) * 31229) ^ (-1334148014);
                        i5 = -264757233;
                    }
                case -1546908357:
                case 816643279:
                    if (C0714.f2697 >= 0) {
                        m2566 = C2105.m6981("֡۬") ^ i3;
                        i4 = ((m2566 ^ i2) * 26043) ^ (-416976975);
                        i5 = -1044110871;
                    } else {
                        m2566 = (i2 - C0630.m2566("֡ۘ")) * (-105);
                        i4 = ((m2566 ^ i3) * (-6339)) ^ 2102515489;
                        i5 = 958449410;
                    }
                case -1498357089:
                case 1070045348:
                    if (C0237.f1507 != 0) {
                        m2566 = C2105.m6981("֡۬") ^ i3;
                        i4 = ((m2566 ^ i2) * 26043) ^ (-416976975);
                        i5 = -1044110871;
                    } else {
                        m2566 = (C0630.m2566("ۤۙ") + i2) * (-123);
                        i4 = ((m2566 ^ i3) * (-5613)) ^ (-450689021);
                        i5 = 1746756726;
                    }
                case -1410942254:
                case 533996244:
                    if (C2272.f7362) {
                        m2566 = (C0630.m2566("ۤۙ") + i2) * (-123);
                        i4 = ((m2566 ^ i3) * (-5613)) ^ (-450689021);
                        i5 = 1746756726;
                    } else {
                        m2566 = (C2105.m6981("ܺܺ") + i2) * (-69);
                        i4 = ((m2566 ^ i3) * 15235) ^ 1416309294;
                        i5 = -1053132173;
                    }
                case -1371909711:
                case 291725173:
                    arrayList = new ArrayList();
                    if (C0798.f2919) {
                        m2566 = C2105.m6981("֡۬") ^ i3;
                        i4 = ((m2566 ^ i2) * 26043) ^ (-416976975);
                        i5 = -1044110871;
                    } else {
                        m2566 = (C2105.m6981("᩵֡") + i3) * (-117);
                        i4 = ((m2566 ^ i2) * 20873) ^ 684078369;
                        i5 = -1014165748;
                    }
                case -1008611217:
                case 1485699395:
                    if (C4159.f13567) {
                        m2566 = (C0630.m2566("ܺ۟") + i2) * (-19);
                        i4 = ((m2566 ^ i3) * (-31497)) ^ (-1214510968);
                        i5 = 1253432220;
                    } else {
                        m2566 = C0630.m2566("ۛۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * 7945) ^ 1271218153;
                        i5 = -578655659;
                    }
                case -699914643:
                case 1281453598:
                    if (C3911.f12484 >= 0) {
                        m2566 = C2105.m6981("֡۬") ^ i3;
                        i4 = ((m2566 ^ i2) * 26043) ^ (-416976975);
                        i5 = -1044110871;
                    } else {
                        m2566 = C2105.m6981("֨ᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * 15915) ^ (-1874647562);
                        i5 = 657199721;
                    }
                case -651176061:
                case 1865865714:
                    C4159.m12565();
                    throw new RuntimeException();
                case -220704453:
                case 1939246922:
                    this.f26941 = arrayList;
                    return;
                case 282281209:
                case 1722849151:
                    if (AbstractC2021.m6574()) {
                        m2566 = C2105.m6981("֡۬") ^ i3;
                        i4 = ((m2566 ^ i2) * 26043) ^ (-416976975);
                        i5 = -1044110871;
                    } else {
                        m2566 = C0630.m2566("ۜ᩶") ^ i2;
                        i4 = ((m2566 ^ i3) * 14299) ^ 600586888;
                        i5 = 722671811;
                    }
                case 284368759:
                case 1592557298:
                    if (C3663.f11553) {
                        m2566 = C2105.m6981("֡۬") ^ i3;
                        i4 = ((m2566 ^ i2) * 26043) ^ (-416976975);
                        i5 = -1044110871;
                    } else {
                        m2566 = C0630.m2566("ۖᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * 17395) ^ 1596874134;
                        i5 = 1979208014;
                    }
                case 1830026257:
                case 2059724168:
                    if (C0422.m1963()) {
                        m2566 = (C2105.m6981("۫۬") + i3) * (-13);
                        i4 = ((m2566 ^ i2) * 22997) ^ 948250783;
                        i5 = -126612553;
                    } else {
                        m2566 = C2105.m6981("֨ᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * 15915) ^ (-1874647562);
                        i5 = 657199721;
                    }
                default:
                    if (C1711.f5919) {
                        m2566 = C0630.m2566("ۛۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * 7945) ^ 1271218153;
                        i5 = -578655659;
                    } else {
                        m2566 = C2105.m6981("᩵۠") ^ i2;
                        i4 = ((m2566 ^ i3) * (-31613)) ^ (-936272538);
                        i5 = 973496051;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (l.C4263.f13799 > 0) goto L26;
     */
    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC8848.onDestroy():void");
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        View view;
        ViewOnClickListenerC18759 viewOnClickListenerC18759;
        View view2;
        C9762 c9762;
        Intent intent;
        int i;
        int m2566;
        int i2;
        int i3;
        short[] sArr;
        ViewOnClickListenerC18759 viewOnClickListenerC187592;
        int i4;
        int i5;
        short[] sArr2;
        int m6981;
        int i6;
        View view3;
        View view4;
        short[] sArr3;
        Intent intent2;
        ViewOnClickListenerC18759 viewOnClickListenerC187593;
        C9762 c97622;
        View view5;
        Intent intent3;
        ViewOnClickListenerC18759 viewOnClickListenerC187594;
        C9762 c97623;
        int i7;
        int i8;
        int i9;
        short[] sArr4;
        int m25662;
        int i10;
        View view6;
        Intent intent4;
        int m69812;
        int i11;
        View view7;
        final ActivityC8848 activityC8848 = this;
        int i12 = C3019.f9544;
        int i13 = C7811.f24123;
        int m69813 = C2105.m6981("᩺ۤ") ^ i13;
        int i14 = ((m69813 ^ i12) * (-5301)) ^ (-1966977678);
        Intent intent5 = null;
        View view8 = null;
        ViewOnClickListenerC18759 viewOnClickListenerC187595 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        int i15 = m69813 ^ 854202714;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        short s = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        C9762 c97624 = null;
        int i24 = -413664177;
        String str = null;
        View view9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (true) {
            i24 = i15 ^ (i14 & (((i24 ^ i12) * 22341) >> 31));
            switch (i24) {
                case -2095454281:
                case 1102589626:
                    view2 = view9;
                    sArr = sArr11;
                    intent = intent5;
                    viewOnClickListenerC187592 = viewOnClickListenerC187595;
                    c9762 = c97624;
                    i = i16;
                    short[] sArr12 = sArr10;
                    i4 = i20;
                    i5 = i21;
                    sArr2 = sArr12;
                    short s2 = f26935[0];
                    int i28 = s2 + 16059;
                    if (C2958.m9034() <= 0) {
                        s = s2;
                        i19 = i28;
                        m6981 = (C2105.m6981("ᩳ᩵") + i13) * (-77);
                        i14 = ((m6981 ^ i12) * (-30211)) ^ 1332201347;
                        i6 = 1324892011;
                        int i29 = m6981 ^ i6;
                        sArr11 = sArr;
                        i16 = i;
                        c97624 = c9762;
                        viewOnClickListenerC187595 = viewOnClickListenerC187592;
                        intent5 = intent;
                        view9 = view2;
                        i15 = i29;
                        activityC8848 = this;
                        short[] sArr13 = sArr2;
                        i21 = i5;
                        i20 = i4;
                        sArr10 = sArr13;
                    } else {
                        int m25663 = C0630.m2566("ۚۖ") ^ i13;
                        s = s2;
                        i19 = i28;
                        sArr11 = sArr;
                        i14 = ((m25663 ^ i12) * 5157) ^ 1315680609;
                        activityC8848 = this;
                        i15 = m25663 ^ (-1595536511);
                        i16 = i;
                        c97624 = c9762;
                        viewOnClickListenerC187595 = viewOnClickListenerC187592;
                        intent5 = intent;
                        view9 = view2;
                        i21 = i5;
                        i20 = i4;
                        sArr10 = sArr2;
                    }
                case -1993554533:
                case 1699029302:
                    View view10 = view9;
                    viewOnClickListenerC18759 = viewOnClickListenerC187595;
                    intent4 = intent5;
                    str = RunnableC3474.m10628(intent4, C4159.m12578(sArr6, 18, 4, i26));
                    if (activityC8848.f26943 != null) {
                        m69812 = (C2105.m6981("֨ۜ") + i13) * 43;
                        view6 = view10;
                        i14 = ((m69812 ^ i12) * 14099) ^ (-905018566);
                        i11 = 166250401;
                        int i30 = m69812 ^ i11;
                        intent5 = intent4;
                        view9 = view6;
                        i15 = i30;
                        viewOnClickListenerC187595 = viewOnClickListenerC18759;
                    } else {
                        view7 = view10;
                        int m25664 = C0630.m2566("᩹ܶ") ^ i13;
                        i2 = ((m25664 ^ i12) * (-24073)) ^ (-1744204034);
                        intent5 = intent4;
                        view9 = view7;
                        i15 = m25664 ^ 1656449983;
                        i14 = i2;
                        viewOnClickListenerC187595 = viewOnClickListenerC18759;
                    }
                case -1881416149:
                case 1385384651:
                    view2 = view9;
                    sArr = sArr11;
                    intent = intent5;
                    viewOnClickListenerC187592 = viewOnClickListenerC187595;
                    c9762 = c97624;
                    i = i16;
                    short[] sArr14 = sArr10;
                    i4 = i20;
                    i5 = i21;
                    sArr2 = sArr14;
                    i26 = 7723;
                    m6981 = C2105.m6981("ۖۨ") ^ i13;
                    i14 = ((m6981 ^ i12) * 18095) ^ (-552899112);
                    i6 = 1585411442;
                    int i292 = m6981 ^ i6;
                    sArr11 = sArr;
                    i16 = i;
                    c97624 = c9762;
                    viewOnClickListenerC187595 = viewOnClickListenerC187592;
                    intent5 = intent;
                    view9 = view2;
                    i15 = i292;
                    activityC8848 = this;
                    short[] sArr132 = sArr2;
                    i21 = i5;
                    i20 = i4;
                    sArr10 = sArr132;
                case -1873005235:
                case -1268682197:
                    C4263.m12819();
                    if (RunnableC1937.f6483 >= 0) {
                        view = view9;
                        viewOnClickListenerC18759 = viewOnClickListenerC187595;
                        m2566 = C2105.m6981("᩵֨") ^ i13;
                        i2 = ((m2566 ^ i12) * (-479)) ^ (-97072457);
                        i3 = -189525711;
                        i15 = m2566 ^ i3;
                        view9 = view;
                        i14 = i2;
                        viewOnClickListenerC187595 = viewOnClickListenerC18759;
                    } else {
                        view2 = view9;
                        sArr = sArr11;
                        intent = intent5;
                        viewOnClickListenerC187592 = viewOnClickListenerC187595;
                        c9762 = c97624;
                        i = i16;
                        short[] sArr15 = sArr10;
                        i4 = i20;
                        i5 = i21;
                        sArr2 = sArr15;
                        m6981 = C0630.m2566("ۗ᩵") ^ i12;
                        i14 = ((m6981 ^ i13) * 8755) ^ (-1901630053);
                        i6 = 1007775016;
                        int i2922 = m6981 ^ i6;
                        sArr11 = sArr;
                        i16 = i;
                        c97624 = c9762;
                        viewOnClickListenerC187595 = viewOnClickListenerC187592;
                        intent5 = intent;
                        view9 = view2;
                        i15 = i2922;
                        activityC8848 = this;
                        short[] sArr1322 = sArr2;
                        i21 = i5;
                        i20 = i4;
                        sArr10 = sArr1322;
                    }
                case -1738638647:
                case 317271296:
                    View view11 = view9;
                    ViewOnClickListenerC18759 viewOnClickListenerC187596 = viewOnClickListenerC187595;
                    Intent intent6 = intent5;
                    short[] sArr16 = sArr5;
                    activityC8848.f26943 = AbstractC2021.m6570(intent6, C0630.m2575(sArr16, 10, 8, i26));
                    short[] sArr17 = f26935;
                    int m69814 = (C2105.m6981("۟ۨ") + i12) * (-79);
                    i14 = ((m69814 ^ i13) * (-18969)) ^ (-510588465);
                    intent5 = intent6;
                    view9 = view11;
                    i15 = m69814 ^ (-811093185);
                    viewOnClickListenerC187595 = viewOnClickListenerC187596;
                    sArr5 = sArr16;
                    sArr6 = sArr17;
                case -1688892962:
                case -830247518:
                    view4 = view9;
                    sArr3 = sArr11;
                    intent2 = intent5;
                    viewOnClickListenerC187593 = viewOnClickListenerC187595;
                    c97622 = c97624;
                    int i31 = i16;
                    C0964.m3409(activityC8848, i27 ^ 2097980676);
                    sArr10 = f26935;
                    i21 = 4;
                    i20 = 3;
                    if (C1005.f3721) {
                        int m25665 = C0630.m2566("ۧۗ") ^ i12;
                        i14 = ((m25665 ^ i13) * (-1681)) ^ (-1540553933);
                        sArr11 = sArr3;
                        i16 = i31;
                        c97624 = c97622;
                        viewOnClickListenerC187595 = viewOnClickListenerC187593;
                        intent5 = intent2;
                        view9 = view4;
                        i15 = m25665 ^ (-314540011);
                        activityC8848 = this;
                    } else {
                        i16 = i31;
                        int m69815 = (C2105.m6981("ᩴᩴ") ^ i13) * (-67);
                        sArr11 = sArr3;
                        c97624 = c97622;
                        viewOnClickListenerC187595 = viewOnClickListenerC187593;
                        intent5 = intent2;
                        view9 = view4;
                        i15 = m69815 ^ (-48341082);
                        i14 = ((m69815 ^ i12) * 7487) ^ (-1393314365);
                        activityC8848 = this;
                    }
                case -1660409872:
                case 1808753782:
                    break;
                case -1626793692:
                case -303418285:
                    C4117.m12364();
                    C1504.m5179();
                    view = view9;
                    viewOnClickListenerC18759 = viewOnClickListenerC187595;
                    m2566 = C2105.m6981("᩵֨") ^ i13;
                    i2 = ((m2566 ^ i12) * (-479)) ^ (-97072457);
                    i3 = -189525711;
                    i15 = m2566 ^ i3;
                    view9 = view;
                    i14 = i2;
                    viewOnClickListenerC187595 = viewOnClickListenerC18759;
                case -1572896905:
                case 463326916:
                    view = view9;
                    viewOnClickListenerC18759 = viewOnClickListenerC187595;
                    view8 = C4263.m12813(activityC8848, C0630.m2566(RunnableC0588.m2436(sArr7, 37, 3, i26)) ^ 2102617896);
                    m2566 = (C2105.m6981("֫ܳ") + i12) * 69;
                    i2 = ((m2566 ^ i13) * (-19563)) ^ (-1809836294);
                    i3 = 134178374;
                    i15 = m2566 ^ i3;
                    view9 = view;
                    i14 = i2;
                    viewOnClickListenerC187595 = viewOnClickListenerC18759;
                case -1264268917:
                case 343988632:
                    C2126.m7039(view9, viewOnClickListenerC187595);
                    view = view9;
                    viewOnClickListenerC18759 = viewOnClickListenerC187595;
                    if (C1294.m4371() - activityC8848.f26939 < 300) {
                        m2566 = C0630.m2566("ۜ۠") ^ i12;
                        i2 = ((m2566 ^ i13) * 5595) ^ 1576322087;
                        i3 = -2039597566;
                    } else {
                        m2566 = C2105.m6981("᩶ۧ") ^ i13;
                        i2 = ((m2566 ^ i12) * (-2303)) ^ (-1158645005);
                        i3 = -2063220390;
                    }
                    i15 = m2566 ^ i3;
                    view9 = view;
                    i14 = i2;
                    viewOnClickListenerC187595 = viewOnClickListenerC18759;
                case -1043465250:
                case 441302780:
                    view = view9;
                    viewOnClickListenerC18759 = viewOnClickListenerC187595;
                    activityC8848.f26942 = C0964.m3409(activityC8848, C0630.m2566(C4263.m12817(sArr8, i17, i16, i26)) ^ 2119130476);
                    sArr9 = f26935;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        view2 = view;
                        c9762 = c97624;
                        intent = intent5;
                        i = i16;
                        viewOnClickListenerC187592 = viewOnClickListenerC18759;
                        sArr = sArr11;
                        short[] sArr18 = sArr10;
                        i4 = i20;
                        i5 = i21;
                        sArr2 = sArr18;
                        m6981 = (C2105.m6981("ᩳ᩵") + i13) * (-77);
                        i14 = ((m6981 ^ i12) * (-30211)) ^ 1332201347;
                        i6 = 1324892011;
                        int i29222 = m6981 ^ i6;
                        sArr11 = sArr;
                        i16 = i;
                        c97624 = c9762;
                        viewOnClickListenerC187595 = viewOnClickListenerC187592;
                        intent5 = intent;
                        view9 = view2;
                        i15 = i29222;
                        activityC8848 = this;
                        short[] sArr13222 = sArr2;
                        i21 = i5;
                        i20 = i4;
                        sArr10 = sArr13222;
                    } else {
                        m2566 = (C0630.m2566("᩵ۢ") ^ i12) * 81;
                        i2 = ((m2566 ^ i13) * 6407) ^ 614846646;
                        i3 = 1241378915;
                        i15 = m2566 ^ i3;
                        view9 = view;
                        i14 = i2;
                        viewOnClickListenerC187595 = viewOnClickListenerC18759;
                    }
                case -776992090:
                case 1693796150:
                    if (C1294.f4556 >= 0) {
                        view = view9;
                        viewOnClickListenerC18759 = viewOnClickListenerC187595;
                        m2566 = C2105.m6981("᩵֨") ^ i13;
                        i2 = ((m2566 ^ i12) * (-479)) ^ (-97072457);
                        i3 = -189525711;
                        i15 = m2566 ^ i3;
                        view9 = view;
                        i14 = i2;
                        viewOnClickListenerC187595 = viewOnClickListenerC18759;
                    } else {
                        view2 = view9;
                        sArr = sArr11;
                        intent = intent5;
                        viewOnClickListenerC187592 = viewOnClickListenerC187595;
                        c9762 = c97624;
                        i = i16;
                        short[] sArr182 = sArr10;
                        i4 = i20;
                        i5 = i21;
                        sArr2 = sArr182;
                        m6981 = (C2105.m6981("ᩳ᩵") + i13) * (-77);
                        i14 = ((m6981 ^ i12) * (-30211)) ^ 1332201347;
                        i6 = 1324892011;
                        int i292222 = m6981 ^ i6;
                        sArr11 = sArr;
                        i16 = i;
                        c97624 = c9762;
                        viewOnClickListenerC187595 = viewOnClickListenerC187592;
                        intent5 = intent;
                        view9 = view2;
                        i15 = i292222;
                        activityC8848 = this;
                        short[] sArr132222 = sArr2;
                        i21 = i5;
                        i20 = i4;
                        sArr10 = sArr132222;
                    }
                case -771635607:
                case 1267920417:
                    view5 = view9;
                    ViewOnClickListenerC18759 viewOnClickListenerC187597 = viewOnClickListenerC187595;
                    c97623 = c97624;
                    intent3 = intent5;
                    i7 = i16;
                    viewOnClickListenerC187594 = viewOnClickListenerC187597;
                    sArr4 = sArr11;
                    i22 = C0630.m2566(C2105.m6988(sArr4, 7, 3, i26));
                    i23 = 2129109745;
                    if (C0237.f1507 == 0) {
                        m25662 = (C0630.m2566("ۨۖ") ^ i12) * (-13);
                        i8 = ((m25662 ^ i13) * (-15375)) ^ (-1827574005);
                        i10 = -157889465;
                        i9 = m25662 ^ i10;
                        sArr11 = sArr4;
                        view3 = view5;
                        i15 = i9;
                        i14 = i8;
                        i16 = i7;
                        c97624 = c97623;
                        viewOnClickListenerC187595 = viewOnClickListenerC187594;
                        intent5 = intent3;
                        view9 = view3;
                    }
                    m25662 = (i12 - C2105.m6981("ۚ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i8 = ((m25662 ^ i13) * (-1015)) ^ 1686425754;
                    i10 = -1750945882;
                    i9 = m25662 ^ i10;
                    sArr11 = sArr4;
                    view3 = view5;
                    i15 = i9;
                    i14 = i8;
                    i16 = i7;
                    c97624 = c97623;
                    viewOnClickListenerC187595 = viewOnClickListenerC187594;
                    intent5 = intent3;
                    view9 = view3;
                case -750217947:
                case 838990493:
                    RunnableC0588.m2440(C1773.m5917(f26935, 22, 12, i26));
                    RunnableC1108.m3781(this);
                    break;
                case -655267335:
                case 1214431720:
                    view = view9;
                    viewOnClickListenerC18759 = viewOnClickListenerC187595;
                    C22628.m50606(activityC8848.f10584, str);
                    i18 = C2105.m6981(C4616.m13542(f26935, 34, 3, i26));
                    if (C3245.f10203 <= 0) {
                        view4 = view;
                        c97622 = c97624;
                        intent2 = intent5;
                        viewOnClickListenerC187593 = viewOnClickListenerC18759;
                        sArr3 = sArr11;
                        int m698152 = (C2105.m6981("ᩴᩴ") ^ i13) * (-67);
                        sArr11 = sArr3;
                        c97624 = c97622;
                        viewOnClickListenerC187595 = viewOnClickListenerC187593;
                        intent5 = intent2;
                        view9 = view4;
                        i15 = m698152 ^ (-48341082);
                        i14 = ((m698152 ^ i12) * 7487) ^ (-1393314365);
                        activityC8848 = this;
                    } else {
                        m2566 = (C2105.m6981("ۧᩳ") + i12) * 9;
                        i2 = ((m2566 ^ i13) * 17551) ^ (-339521387);
                        i3 = 2140652307;
                        i15 = m2566 ^ i3;
                        view9 = view;
                        i14 = i2;
                        viewOnClickListenerC187595 = viewOnClickListenerC18759;
                    }
                case -624625495:
                case -362317304:
                    view = view9;
                    viewOnClickListenerC18759 = viewOnClickListenerC187595;
                    if (str == null) {
                        view7 = view;
                        intent4 = intent5;
                        int m256642 = C0630.m2566("᩹ܶ") ^ i13;
                        i2 = ((m256642 ^ i12) * (-24073)) ^ (-1744204034);
                        intent5 = intent4;
                        view9 = view7;
                        i15 = m256642 ^ 1656449983;
                        i14 = i2;
                        viewOnClickListenerC187595 = viewOnClickListenerC18759;
                    } else {
                        m2566 = (i12 - C0630.m2566("ۜᩴ")) * (-95);
                        i2 = ((m2566 ^ i13) * (-28519)) ^ 1759351574;
                        i3 = 160948257;
                        i15 = m2566 ^ i3;
                        view9 = view;
                        i14 = i2;
                        viewOnClickListenerC187595 = viewOnClickListenerC18759;
                    }
                case -431737329:
                case 622956079:
                    view = view9;
                    viewOnClickListenerC18759 = viewOnClickListenerC187595;
                    activityC8848.f26938 = (TabLayout) C4263.m12813(activityC8848, 2102986541 ^ i18);
                    sArr7 = f26935;
                    if (!C2126.f7087) {
                        m2566 = (C0630.m2566("ۖۤ") + i13) * 81;
                        i2 = ((m2566 ^ i12) * (-28629)) ^ (-1220906252);
                        i3 = -280176174;
                        i15 = m2566 ^ i3;
                        view9 = view;
                        i14 = i2;
                        viewOnClickListenerC187595 = viewOnClickListenerC18759;
                    }
                    m2566 = C2105.m6981("᩵֨") ^ i13;
                    i2 = ((m2566 ^ i12) * (-479)) ^ (-97072457);
                    i3 = -189525711;
                    i15 = m2566 ^ i3;
                    view9 = view;
                    i14 = i2;
                    viewOnClickListenerC187595 = viewOnClickListenerC18759;
                case -408698708:
                case 929966400:
                    if (RunnableC1108.f4040) {
                        view5 = view9;
                        sArr4 = sArr11;
                        intent3 = intent5;
                        viewOnClickListenerC187594 = viewOnClickListenerC187595;
                        c97623 = c97624;
                        i7 = i16;
                        m25662 = (i12 - C2105.m6981("ۚ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((m25662 ^ i13) * (-1015)) ^ 1686425754;
                        i10 = -1750945882;
                        i9 = m25662 ^ i10;
                        sArr11 = sArr4;
                        view3 = view5;
                        i15 = i9;
                        i14 = i8;
                        i16 = i7;
                        c97624 = c97623;
                        viewOnClickListenerC187595 = viewOnClickListenerC187594;
                        intent5 = intent3;
                        view9 = view3;
                    } else {
                        view = view9;
                        viewOnClickListenerC18759 = viewOnClickListenerC187595;
                        m2566 = C2105.m6981("᩵֨") ^ i13;
                        i2 = ((m2566 ^ i12) * (-479)) ^ (-97072457);
                        i3 = -189525711;
                        i15 = m2566 ^ i3;
                        view9 = view;
                        i14 = i2;
                        viewOnClickListenerC187595 = viewOnClickListenerC18759;
                    }
                case -388208756:
                case 286660090:
                    view2 = view9;
                    sArr = sArr11;
                    intent = intent5;
                    viewOnClickListenerC187592 = viewOnClickListenerC187595;
                    c9762 = c97624;
                    i = i16;
                    short[] sArr19 = sArr10;
                    i4 = i20;
                    i5 = i21;
                    sArr2 = sArr19;
                    int i32 = (s * s) + 257891481;
                    if ((i32 + i32) - (i19 * i19) < 0) {
                        m6981 = C2105.m6981("۫᩸") ^ i12;
                        i14 = ((m6981 ^ i13) * 17351) ^ (-828323575);
                        i6 = 1525597318;
                    } else {
                        m6981 = (C2105.m6981("ۧ۟") + i12) * (-59);
                        i14 = ((m6981 ^ i13) * (-1673)) ^ 2135636665;
                        i6 = -1270246973;
                    }
                    int i2922222 = m6981 ^ i6;
                    sArr11 = sArr;
                    i16 = i;
                    c97624 = c9762;
                    viewOnClickListenerC187595 = viewOnClickListenerC187592;
                    intent5 = intent;
                    view9 = view2;
                    i15 = i2922222;
                    activityC8848 = this;
                    short[] sArr1322222 = sArr2;
                    i21 = i5;
                    i20 = i4;
                    sArr10 = sArr1322222;
                case -275813657:
                case 1516333620:
                    view2 = view9;
                    int i33 = i20;
                    i5 = i21;
                    sArr = sArr11;
                    intent = intent5;
                    viewOnClickListenerC187592 = viewOnClickListenerC187595;
                    sArr2 = sArr10;
                    c9762 = c97624;
                    i = i16;
                    super.onCreate(bundle);
                    m10214();
                    i4 = i33;
                    i27 = C2105.m6981(C0798.m3005(f26935, 1, 3, i26));
                    if (C4616.f14690 > 0) {
                        m6981 = C2105.m6981("ۡ᩻") ^ i13;
                        i14 = ((m6981 ^ i12) * (-16039)) ^ 1419221241;
                        i6 = 715498275;
                        int i29222222 = m6981 ^ i6;
                        sArr11 = sArr;
                        i16 = i;
                        c97624 = c9762;
                        viewOnClickListenerC187595 = viewOnClickListenerC187592;
                        intent5 = intent;
                        view9 = view2;
                        i15 = i29222222;
                        activityC8848 = this;
                        short[] sArr13222222 = sArr2;
                        i21 = i5;
                        i20 = i4;
                        sArr10 = sArr13222222;
                    }
                    m6981 = C0630.m2566("ۗ᩵") ^ i12;
                    i14 = ((m6981 ^ i13) * 8755) ^ (-1901630053);
                    i6 = 1007775016;
                    int i292222222 = m6981 ^ i6;
                    sArr11 = sArr;
                    i16 = i;
                    c97624 = c9762;
                    viewOnClickListenerC187595 = viewOnClickListenerC187592;
                    intent5 = intent;
                    view9 = view2;
                    i15 = i292222222;
                    activityC8848 = this;
                    short[] sArr132222222 = sArr2;
                    i21 = i5;
                    i20 = i4;
                    sArr10 = sArr132222222;
                case -132610983:
                case 888553260:
                    activityC8848.f26939 = ViewOnClickListenerC1958.m6432();
                    C4263.m12821(new C6731(activityC8848));
                    break;
                case -82228369:
                case 189013118:
                    view = view9;
                    viewOnClickListenerC18759 = viewOnClickListenerC187595;
                    activityC8848.f26940 = (C0452) view8;
                    sArr8 = f26935;
                    i17 = 40;
                    i16 = 3;
                    if (C3746.f11829 <= 0) {
                        view4 = view;
                        c97622 = c97624;
                        intent2 = intent5;
                        viewOnClickListenerC187593 = viewOnClickListenerC18759;
                        sArr3 = sArr11;
                        int m6981522 = (C2105.m6981("ᩴᩴ") ^ i13) * (-67);
                        sArr11 = sArr3;
                        c97624 = c97622;
                        viewOnClickListenerC187595 = viewOnClickListenerC187593;
                        intent5 = intent2;
                        view9 = view4;
                        i15 = m6981522 ^ (-48341082);
                        i14 = ((m6981522 ^ i12) * 7487) ^ (-1393314365);
                        activityC8848 = this;
                    } else {
                        m2566 = (C2105.m6981("ܶۨ") ^ i13) * (-41);
                        i2 = ((m2566 ^ i12) * 30927) ^ 167721695;
                        i3 = -1698176385;
                        i15 = m2566 ^ i3;
                        view9 = view;
                        i14 = i2;
                        viewOnClickListenerC187595 = viewOnClickListenerC18759;
                    }
                case -20480266:
                case 1162341797:
                    C2520.m8026();
                    break;
                case 14800181:
                case 1755717039:
                    view5 = view9;
                    int i34 = i20;
                    short[] sArr20 = sArr10;
                    intent3 = intent5;
                    viewOnClickListenerC187594 = viewOnClickListenerC187595;
                    c97623 = c97624;
                    i7 = i16;
                    int i35 = i21;
                    C4263.m12813(activityC8848, C0630.m2566(C3432.m10488(sArr20, i35, i34, i26)) ^ 2125169591);
                    sArr11 = f26935;
                    int m69816 = (i13 - C2105.m6981("ۙ᩻")) * (-69);
                    i8 = ((m69816 ^ i12) * (-29799)) ^ (-1886772169);
                    i9 = m69816 ^ 1103740934;
                    sArr10 = sArr20;
                    i21 = i35;
                    i20 = i34;
                    view3 = view5;
                    i15 = i9;
                    i14 = i8;
                    i16 = i7;
                    c97624 = c97623;
                    viewOnClickListenerC187595 = viewOnClickListenerC187594;
                    intent5 = intent3;
                    view9 = view3;
                case 110762748:
                case 382671327:
                    view2 = view9;
                    viewOnClickListenerC18759 = viewOnClickListenerC187595;
                    c9762 = c97624;
                    AbstractC2021.m6559(c9762, new View.OnClickListener() { // from class: l.ᩳۧ᩷
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view12) {
                            int i36 = 1193358940;
                            int i37 = C1128.f4106;
                            int i38 = RunnableC3474.f10992;
                            int m69817 = C2105.m6981("᩷ۙ") ^ i37;
                            int i39 = ((m69817 ^ i38) * 16865) ^ 1775406039;
                            int i40 = 837476735;
                            while (true) {
                                i36 = ((((i36 ^ i38) * 10425) >> 31) & i39) ^ (m69817 ^ i40);
                                switch (i36) {
                                    case -1993209566:
                                    case -697951689:
                                        if (C3019.f9544 >= 0) {
                                            m69817 = C0630.m2566("ᩴ۫") ^ i37;
                                            i39 = ((m69817 ^ i38) * 2765) ^ (-2047355907);
                                            i40 = 555213353;
                                        } else {
                                            m69817 = (i38 - C0630.m2566("ܿ۬")) * (-117);
                                            i39 = ((m69817 ^ i37) * (-7703)) ^ (-1218817681);
                                            i40 = -476812136;
                                        }
                                    case -1961616263:
                                    case -238605276:
                                        if (C21923.f70183 != 0) {
                                            m69817 = C0630.m2566("᩶ۖ") ^ i38;
                                            i39 = ((m69817 ^ i37) * (-8537)) ^ (-36089548);
                                            i40 = 229557144;
                                        } else {
                                            m69817 = C0630.m2566("۟ۡ") ^ i37;
                                            i39 = ((m69817 ^ i38) * 28397) ^ 271700829;
                                            i40 = 767009176;
                                        }
                                    case -1896435738:
                                    case -900037935:
                                        C1005.m3501();
                                        C1047.m3599();
                                        break;
                                    case -1605410856:
                                    case 718433393:
                                        if (C4117.m12364() != 0) {
                                            m69817 = C0630.m2566("᩶ۖ") ^ i38;
                                            i39 = ((m69817 ^ i37) * (-8537)) ^ (-36089548);
                                            i40 = 229557144;
                                        } else {
                                            m69817 = C2105.m6981("᩶᩹") ^ i38;
                                            i39 = ((m69817 ^ i37) * (-13883)) ^ (-485205533);
                                            i40 = -352477417;
                                        }
                                    case -1550991368:
                                    case -298722689:
                                        if (C4263.m12819() >= 0) {
                                            m69817 = (i37 - C0630.m2566("ۛᩴ")) * (-119);
                                            i39 = ((m69817 ^ i38) * (-24565)) ^ 895184825;
                                            i40 = -1051331306;
                                        } else {
                                            m69817 = C2105.m6981("ۜۚ") ^ i37;
                                            i39 = ((m69817 ^ i38) * (-16983)) ^ (-1199235551);
                                            i40 = 1582117875;
                                        }
                                    case -1519413136:
                                    case -458054490:
                                        if (RunnableC3474.f10992 <= 0) {
                                            m69817 = C2105.m6981("ܽ᩵") ^ i38;
                                            i39 = ((m69817 ^ i37) * (-187)) ^ 210360635;
                                            i40 = -1521609547;
                                        } else {
                                            m69817 = (C0630.m2566("ۤ᩺") + i37) * (-53);
                                            i39 = ((m69817 ^ i38) * 19751) ^ (-361159286);
                                            i40 = 1134878262;
                                        }
                                    case -1120707038:
                                    case 1816605973:
                                        AbstractC2021.m6574();
                                        C2126.m7040();
                                        m69817 = (i37 - C0630.m2566("ۛᩴ")) * (-119);
                                        i39 = ((m69817 ^ i38) * (-24565)) ^ 895184825;
                                        i40 = -1051331306;
                                    case -1016820635:
                                    case 963501557:
                                        if (C4616.f14690 <= 0) {
                                            m69817 = C0630.m2566("ᩴ۫") ^ i37;
                                            i39 = ((m69817 ^ i38) * 2765) ^ (-2047355907);
                                            i40 = 555213353;
                                        } else {
                                            m69817 = (C0630.m2566("᩹᩹") + i38) * 87;
                                            i39 = ((m69817 ^ i37) * (-1323)) ^ 1476347442;
                                            i40 = 282719830;
                                        }
                                    case -995875904:
                                    case 883924746:
                                        if (C1420.f5096 <= 0) {
                                            m69817 = C0630.m2566("᩶ۖ") ^ i38;
                                            i39 = ((m69817 ^ i37) * (-8537)) ^ (-36089548);
                                            i40 = 229557144;
                                        } else {
                                            m69817 = C0630.m2566("ᩴ۫") ^ i37;
                                            i39 = ((m69817 ^ i38) * 2765) ^ (-2047355907);
                                            i40 = 555213353;
                                        }
                                    case -747858668:
                                    case 624131506:
                                        if (C1047.f3863 >= 0) {
                                            m69817 = (i37 - C0630.m2566("ۛᩴ")) * (-119);
                                            i39 = ((m69817 ^ i38) * (-24565)) ^ 895184825;
                                            i40 = -1051331306;
                                        } else {
                                            m69817 = (i37 - C2105.m6981("ۧۘ")) * (-123);
                                            i39 = ((m69817 ^ i38) * 22625) ^ (-60517077);
                                            i40 = 1050427748;
                                        }
                                    case -701378178:
                                    case -308141652:
                                        if (ServiceConnectionC3453.f10921 < 0) {
                                            m69817 = C0630.m2566("ᩴ۫") ^ i37;
                                            i39 = ((m69817 ^ i38) * 2765) ^ (-2047355907);
                                            i40 = 555213353;
                                        } else {
                                            m69817 = C2105.m6981("ܽ᩵") ^ i38;
                                            i39 = ((m69817 ^ i37) * (-187)) ^ 210360635;
                                            i40 = -1521609547;
                                        }
                                    case -581167417:
                                    case 2145153340:
                                        if (C5695.m16023() >= 0) {
                                            m69817 = C0630.m2566("᩺ܽ") ^ i37;
                                            i39 = ((m69817 ^ i38) * (-26491)) ^ 563372588;
                                            i40 = -558437707;
                                        } else {
                                            m69817 = (C0630.m2566("᩷ܰ") ^ i38) * 101;
                                            i39 = ((m69817 ^ i37) * 31265) ^ (-1303890587);
                                            i40 = 16874844;
                                        }
                                    case 336090113:
                                    case 697360150:
                                        C4075.m12263();
                                        if (C0798.f2919) {
                                            m69817 = C0630.m2566("᩶ۖ") ^ i38;
                                            i39 = ((m69817 ^ i37) * (-8537)) ^ (-36089548);
                                            i40 = 229557144;
                                        } else {
                                            m69817 = (i37 - C0630.m2566("ۛᩴ")) * (-119);
                                            i39 = ((m69817 ^ i38) * (-24565)) ^ 895184825;
                                            i40 = -1051331306;
                                        }
                                    case 627296439:
                                    case 1456074565:
                                        int i41 = ActivityC8848.f26934;
                                        if (C1420.m4913()) {
                                            m69817 = C0630.m2566("᩺ܽ") ^ i37;
                                            i39 = ((m69817 ^ i38) * (-26491)) ^ 563372588;
                                            i40 = -558437707;
                                        } else {
                                            m69817 = (C0630.m2566("ᩴۨ") + i38) * (-127);
                                            i39 = ((m69817 ^ i37) * (-10677)) ^ 392823493;
                                            i40 = 312634773;
                                        }
                                    case 1462910973:
                                    case 2046631824:
                                        if (AbstractC2021.f6743 <= 0) {
                                            m69817 = C0630.m2566("᩺ܽ") ^ i37;
                                            i39 = ((m69817 ^ i38) * (-26491)) ^ 563372588;
                                            i40 = -558437707;
                                        } else {
                                            m69817 = (i37 - C0630.m2566("᩵᩹")) * 71;
                                            i39 = ((m69817 ^ i38) * 31939) ^ (-1756183451);
                                            i40 = -1090388902;
                                        }
                                    default:
                                        RunnableC1108.m3781(ActivityC8848.this);
                                        break;
                                }
                                return;
                            }
                        }
                    });
                    intent5 = C2126.m7034(this);
                    sArr5 = f26935;
                    if (C0050.f910 >= 0) {
                        i = i16;
                        intent = intent5;
                        viewOnClickListenerC187592 = viewOnClickListenerC18759;
                        sArr = sArr11;
                        short[] sArr1822 = sArr10;
                        i4 = i20;
                        i5 = i21;
                        sArr2 = sArr1822;
                        m6981 = (C2105.m6981("ᩳ᩵") + i13) * (-77);
                        i14 = ((m6981 ^ i12) * (-30211)) ^ 1332201347;
                        i6 = 1324892011;
                        int i2922222222 = m6981 ^ i6;
                        sArr11 = sArr;
                        i16 = i;
                        c97624 = c9762;
                        viewOnClickListenerC187595 = viewOnClickListenerC187592;
                        intent5 = intent;
                        view9 = view2;
                        i15 = i2922222222;
                        activityC8848 = this;
                        short[] sArr1322222222 = sArr2;
                        i21 = i5;
                        i20 = i4;
                        sArr10 = sArr1322222222;
                    } else {
                        int m25666 = (i13 - C0630.m2566("ۖۜ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        c97624 = c9762;
                        viewOnClickListenerC187595 = viewOnClickListenerC18759;
                        view3 = view2;
                        i15 = m25666 ^ 143457273;
                        i14 = ((m25666 ^ i12) * 14975) ^ (-314279746);
                        view9 = view3;
                    }
                case 408445245:
                case 1101043291:
                    view6 = view9;
                    viewOnClickListenerC18759 = viewOnClickListenerC187595;
                    intent4 = intent5;
                    C9762 c97625 = (C9762) C0964.m3409(activityC8848, i22 ^ i23);
                    activityC8848.f10584 = c97625;
                    RunnableC1108.m3780(activityC8848, c97625);
                    C0483.m2125(this);
                    C9762 c97626 = activityC8848.f10584;
                    m69812 = (i12 - C2105.m6981("֨ᩳ")) * 87;
                    c97624 = c97626;
                    i14 = ((m69812 ^ i13) * 19273) ^ (-84645289);
                    i11 = -952412561;
                    int i302 = m69812 ^ i11;
                    intent5 = intent4;
                    view9 = view6;
                    i15 = i302;
                    viewOnClickListenerC187595 = viewOnClickListenerC18759;
                case 1409126366:
                case 2038911598:
                    view = view9;
                    viewOnClickListenerC18759 = viewOnClickListenerC187595;
                    i25 = C2105.m6981(C7811.m20837(sArr9, 43, 3, i26)) ^ 2119866715;
                    if (C2958.f9394 < 0) {
                        m2566 = (i13 - C2105.m6981("۠ܳ")) * (-103);
                        i2 = ((m2566 ^ i12) * 25859) ^ 121621578;
                        i3 = 385175427;
                        i15 = m2566 ^ i3;
                        view9 = view;
                        i14 = i2;
                        viewOnClickListenerC187595 = viewOnClickListenerC18759;
                    }
                    m2566 = C2105.m6981("᩵֨") ^ i13;
                    i2 = ((m2566 ^ i12) * (-479)) ^ (-97072457);
                    i3 = -189525711;
                    i15 = m2566 ^ i3;
                    view9 = view;
                    i14 = i2;
                    viewOnClickListenerC187595 = viewOnClickListenerC18759;
                case 1671913073:
                case 2123106903:
                    activityC8848.f26944 = C0964.m3409(activityC8848, i25);
                    view9 = activityC8848.f26942;
                    viewOnClickListenerC187595 = new ViewOnClickListenerC18759(2, activityC8848);
                    int m69817 = (i12 - C2105.m6981("ܰۘ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i15 = m69817 ^ (-144156080);
                    i14 = ((m69817 ^ i13) * 16317) ^ 896358528;
                default:
                    view2 = view9;
                    sArr = sArr11;
                    intent = intent5;
                    viewOnClickListenerC187592 = viewOnClickListenerC187595;
                    c9762 = c97624;
                    i = i16;
                    short[] sArr21 = sArr10;
                    i4 = i20;
                    i5 = i21;
                    sArr2 = sArr21;
                    i26 = 4313;
                    m6981 = C2105.m6981("ۖۨ") ^ i13;
                    i14 = ((m6981 ^ i12) * 18095) ^ (-552899112);
                    i6 = 1585411442;
                    int i29222222222 = m6981 ^ i6;
                    sArr11 = sArr;
                    i16 = i;
                    c97624 = c9762;
                    viewOnClickListenerC187595 = viewOnClickListenerC187592;
                    intent5 = intent;
                    view9 = view2;
                    i15 = i29222222222;
                    activityC8848 = this;
                    short[] sArr13222222222 = sArr2;
                    i21 = i5;
                    i20 = i4;
                    sArr10 = sArr13222222222;
            }
            return;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int m6981;
        int i;
        int i2;
        int i3;
        int m2566;
        int i4;
        int i5;
        int i6 = C4117.f13076;
        int i7 = C11340.f33930;
        int m69812 = (C2105.m6981("ۜۛ") + i6) * 21;
        int i8 = ((m69812 ^ i7) * 14019) ^ 1844062414;
        MenuItem menuItem = null;
        String str = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i9 = m69812 ^ (-1716805331);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        short s = 0;
        int i14 = 0;
        short s2 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        int i17 = 1196865125;
        int i18 = 0;
        short[] sArr3 = null;
        int i19 = 0;
        while (true) {
            i17 = i9 ^ (i8 & (((i17 ^ i7) * 4055) >> 31));
            switch (i17) {
                case -2144100036:
                case -989612275:
                    i3 = i10;
                    i14 = i18 + 306460036;
                    s2 = 35012;
                    if (C4263.f13799 > 0) {
                        m2566 = (C2105.m6981("ܿ᩵") ^ i7) * 93;
                        i4 = ((m2566 ^ i6) * 25991) ^ 1209713888;
                        i5 = -1960079168;
                        int i20 = i3;
                        i9 = m2566 ^ i5;
                        i8 = i4;
                        i10 = i20;
                    }
                    m2566 = (C0630.m2566("᩵ۨ") + i7) * 123;
                    i4 = ((m2566 ^ i6) * 25141) ^ 1326314772;
                    i5 = 2110082131;
                    int i202 = i3;
                    i9 = m2566 ^ i5;
                    i8 = i4;
                    i10 = i202;
                case -2026893261:
                case 808107803:
                    i3 = i10;
                    sArr3 = f26935;
                    if (RunnableC0588.f2309 >= 0) {
                        i10 = i3;
                        m2566 = C2105.m6981("ۚ᩺") ^ i7;
                        i3 = i10;
                        i4 = ((m2566 ^ i6) * (-7535)) ^ 1946043615;
                        i5 = -1664369063;
                        int i2022 = i3;
                        i9 = m2566 ^ i5;
                        i8 = i4;
                        i10 = i2022;
                    } else {
                        m2566 = C0630.m2566("۟֫") ^ i7;
                        i4 = ((m2566 ^ i6) * 8885) ^ 1910461896;
                        i5 = 527031611;
                        int i20222 = i3;
                        i9 = m2566 ^ i5;
                        i8 = i4;
                        i10 = i20222;
                    }
                case -2005123028:
                case -1940332947:
                    if (C0050.f910 >= 0) {
                        m6981 = C2105.m6981("۠ۖ") ^ i7;
                        i = ((m6981 ^ i6) * (-26359)) ^ (-316406050);
                        i2 = -388731491;
                        i9 = m6981 ^ i2;
                        i8 = i;
                    } else {
                        m2566 = C2105.m6981("ۚ᩺") ^ i7;
                        i3 = i10;
                        i4 = ((m2566 ^ i6) * (-7535)) ^ 1946043615;
                        i5 = -1664369063;
                        int i202222 = i3;
                        i9 = m2566 ^ i5;
                        i8 = i4;
                        i10 = i202222;
                    }
                case -1948278395:
                case 1930305307:
                    str = C7106.m19110(sArr2, 50, 3, i15);
                    if (AbstractC2021.f6743 > 0) {
                        m6981 = C2105.m6981("ᩳۙ") ^ i6;
                        i = ((m6981 ^ i7) * 2221) ^ (-2119799884);
                        i2 = -929718847;
                        i9 = m6981 ^ i2;
                        i8 = i;
                    }
                    m6981 = C2105.m6981("۠ۖ") ^ i7;
                    i = ((m6981 ^ i6) * (-26359)) ^ (-316406050);
                    i2 = -388731491;
                    i9 = m6981 ^ i2;
                    i8 = i;
                case -1945405530:
                case 1129532232:
                    if (RunnableC0588.f2309 >= 0) {
                        i3 = i10;
                        m2566 = (i6 - C2105.m6981("ܽۡ")) * (-13);
                        i4 = ((m2566 ^ i7) * (-10577)) ^ (-448876822);
                        i5 = 531801045;
                        int i2022222 = i3;
                        i9 = m2566 ^ i5;
                        i8 = i4;
                        i10 = i2022222;
                    }
                    m2566 = C2105.m6981("ۚ᩺") ^ i7;
                    i3 = i10;
                    i4 = ((m2566 ^ i6) * (-7535)) ^ 1946043615;
                    i5 = -1664369063;
                    int i20222222 = i3;
                    i9 = m2566 ^ i5;
                    i8 = i4;
                    i10 = i20222222;
                case -1809883330:
                case -693455131:
                    i3 = i10;
                    s = sArr3[c];
                    i18 = s * s;
                    if (!C0798.f2919) {
                        m2566 = (i6 - C0630.m2566("ۢ۠")) * (-41);
                        i4 = ((m2566 ^ i7) * (-5299)) ^ (-1332120954);
                        i5 = -1712709613;
                        int i202222222 = i3;
                        i9 = m2566 ^ i5;
                        i8 = i4;
                        i10 = i202222222;
                    }
                    m2566 = (i6 - C2105.m6981("ܽۡ")) * (-13);
                    i4 = ((m2566 ^ i7) * (-10577)) ^ (-448876822);
                    i5 = 531801045;
                    int i2022222222 = i3;
                    i9 = m2566 ^ i5;
                    i8 = i4;
                    i10 = i2022222222;
                case -1732613246:
                case -1600497759:
                    i3 = i10;
                    if (i14 - (s * s2) < 0) {
                        m2566 = C0630.m2566("ܺ֨") ^ i6;
                        i4 = ((m2566 ^ i7) * (-22553)) ^ 1493657583;
                        i5 = -1246641141;
                    } else {
                        m2566 = C2105.m6981("᩸ۨ") ^ i7;
                        i4 = ((m2566 ^ i6) * 15931) ^ 682999618;
                        i5 = -1089732454;
                    }
                    int i20222222222 = i3;
                    i9 = m2566 ^ i5;
                    i8 = i4;
                    i10 = i20222222222;
                case -1637925472:
                case 1779382221:
                    i12 = C0630.m2566(str);
                    i19 = 2097908396;
                    if (C0798.f2919) {
                        i3 = i10;
                        m2566 = C2105.m6981("ۢۗ") ^ i6;
                        i4 = ((m2566 ^ i7) * 27273) ^ 1601517566;
                        i5 = 2004682144;
                        int i202222222222 = i3;
                        i9 = m2566 ^ i5;
                        i8 = i4;
                        i10 = i202222222222;
                    } else {
                        m6981 = (C2105.m6981("ۛ۟") ^ i6) * (-113);
                        i = ((m6981 ^ i7) * 28431) ^ 1646061576;
                        i2 = 1887725567;
                        i9 = m6981 ^ i2;
                        i8 = i;
                    }
                case -1428465590:
                case 803399138:
                    sArr = f26935;
                    i16 = 47;
                    if (RunnableC1937.f6483 >= 0) {
                        i10 = 0;
                        m2566 = C2105.m6981("ۚ᩺") ^ i7;
                        i3 = i10;
                        i4 = ((m2566 ^ i6) * (-7535)) ^ 1946043615;
                        i5 = -1664369063;
                        int i2022222222222 = i3;
                        i9 = m2566 ^ i5;
                        i8 = i4;
                        i10 = i2022222222222;
                    } else {
                        int m69813 = (i6 - C2105.m6981("ۧۜ")) * 69;
                        i9 = m69813 ^ (-725838551);
                        i8 = ((m69813 ^ i7) * 9627) ^ 1180203206;
                        i10 = 0;
                    }
                case -1331184461:
                case 841881847:
                    i3 = i10;
                    i13 = 3;
                    if (!C2167.m7155()) {
                        m2566 = C2105.m6981("᩵۟") ^ i7;
                        i4 = ((m2566 ^ i6) * (-8831)) ^ (-879920280);
                        i5 = 1018275752;
                        int i20222222222222 = i3;
                        i9 = m2566 ^ i5;
                        i8 = i4;
                        i10 = i20222222222222;
                    }
                    m2566 = C2105.m6981("ۢۗ") ^ i6;
                    i4 = ((m2566 ^ i7) * 27273) ^ 1601517566;
                    i5 = 2004682144;
                    int i202222222222222 = i3;
                    i9 = m2566 ^ i5;
                    i8 = i4;
                    i10 = i202222222222222;
                case -1045586158:
                case 989121317:
                    C2520.m8019(menuItem, i12 ^ i19);
                    menuItem.setShowAsAction(2);
                    return true;
                case -906190403:
                case 1797594326:
                    i3 = i10;
                    i15 = 61965;
                    m2566 = (C0630.m2566("᩸ۙ") + i7) * 31;
                    i4 = ((m2566 ^ i6) * 4763) ^ (-1264186908);
                    i5 = -1633938207;
                    int i2022222222222222 = i3;
                    i9 = m2566 ^ i5;
                    i8 = i4;
                    i10 = i2022222222222222;
                case -904779428:
                case 1023316311:
                    C3663.m11168();
                    C2105.m6982();
                    return false;
                case -884793173:
                case 81867392:
                    i3 = i10;
                    c = '.';
                    if (C3746.f11829 > 0) {
                        m2566 = (C2105.m6981("᩹ۡ") ^ i6) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((m2566 ^ i7) * (-24087)) ^ (-581745184);
                        i5 = -1713663142;
                        int i20222222222222222 = i3;
                        i9 = m2566 ^ i5;
                        i8 = i4;
                        i10 = i20222222222222222;
                    }
                    m2566 = (C0630.m2566("᩵ۨ") + i7) * 123;
                    i4 = ((m2566 ^ i6) * 25141) ^ 1326314772;
                    i5 = 2110082131;
                    int i202222222222222222 = i3;
                    i9 = m2566 ^ i5;
                    i8 = i4;
                    i10 = i202222222222222222;
                case -814125238:
                case 799984497:
                    int i21 = 2125944633 ^ i11;
                    menuItem = C2105.m6974(menu, i10, i21, i10, i21);
                    sArr2 = f26935;
                    if (C0483.f2088 < 0) {
                        m2566 = (i7 - C0630.m2566("ۙ۫")) * (-17);
                        i3 = i10;
                        i4 = ((m2566 ^ i6) * 17613) ^ 1689347939;
                        i5 = -1706038195;
                        int i2022222222222222222 = i3;
                        i9 = m2566 ^ i5;
                        i8 = i4;
                        i10 = i2022222222222222222;
                    }
                    i3 = i10;
                    m2566 = C2105.m6981("ۢۗ") ^ i6;
                    i4 = ((m2566 ^ i7) * 27273) ^ 1601517566;
                    i5 = 2004682144;
                    int i20222222222222222222 = i3;
                    i9 = m2566 ^ i5;
                    i8 = i4;
                    i10 = i20222222222222222222;
                case -392643682:
                case 1671970023:
                    i3 = i10;
                    i11 = C2105.m6981(C3663.m11162(sArr, i16, i13, i15));
                    if (C1294.f4556 < 0) {
                        m2566 = (C0630.m2566("ۤۤ") ^ i6) * 123;
                        i4 = ((m2566 ^ i7) * (-21897)) ^ (-1895915828);
                        i5 = 2110643191;
                        int i202222222222222222222 = i3;
                        i9 = m2566 ^ i5;
                        i8 = i4;
                        i10 = i202222222222222222222;
                    }
                    m2566 = C2105.m6981("ۢۗ") ^ i6;
                    i4 = ((m2566 ^ i7) * 27273) ^ 1601517566;
                    i5 = 2004682144;
                    int i2022222222222222222222 = i3;
                    i9 = m2566 ^ i5;
                    i8 = i4;
                    i10 = i2022222222222222222222;
                case 565461810:
                case 1289758418:
                    if (C2126.f7087) {
                        i3 = i10;
                        m2566 = (C0630.m2566("᩵ۨ") + i7) * 123;
                        i4 = ((m2566 ^ i6) * 25141) ^ 1326314772;
                        i5 = 2110082131;
                        int i20222222222222222222222 = i3;
                        i9 = m2566 ^ i5;
                        i8 = i4;
                        i10 = i20222222222222222222222;
                    }
                    m2566 = C2105.m6981("ۚ᩺") ^ i7;
                    i3 = i10;
                    i4 = ((m2566 ^ i6) * (-7535)) ^ 1946043615;
                    i5 = -1664369063;
                    int i202222222222222222222222 = i3;
                    i9 = m2566 ^ i5;
                    i8 = i4;
                    i10 = i202222222222222222222222;
                case 1172762097:
                case 1222735749:
                    C4616.m13552();
                    C1916.m6308();
                    m6981 = C2105.m6981("۠ۖ") ^ i7;
                    i = ((m6981 ^ i6) * (-26359)) ^ (-316406050);
                    i2 = -388731491;
                    i9 = m6981 ^ i2;
                    i8 = i;
                default:
                    i3 = i10;
                    i15 = 31356;
                    m2566 = (C0630.m2566("᩸ۙ") + i7) * 31;
                    i4 = ((m2566 ^ i6) * 4763) ^ (-1264186908);
                    i5 = -1633938207;
                    int i2022222222222222222222222 = i3;
                    i9 = m2566 ^ i5;
                    i8 = i4;
                    i10 = i2022222222222222222222222;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22857(ActivityC8848 activityC8848) {
        long j = 0;
        long j2 = 0;
        int i = 1480523896;
        int i2 = C0483.f2088;
        int i3 = C1773.f6144;
        int m6981 = (C2105.m6981("ۚ᩻") ^ i3) * 97;
        int i4 = ((m6981 ^ i2) * (-29135)) ^ (-370430360);
        int i5 = -255656769;
        while (true) {
            i = ((((i ^ i2) * (-13645)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2015696903:
                case -324573052:
                    RunnableC1937.m6387();
                    if (RunnableC3474.m10630()) {
                        m6981 = (C2105.m6981("ۙ֨") ^ i2) * 61;
                        i4 = ((m6981 ^ i3) * 29259) ^ (-1548785207);
                        i5 = 1172669686;
                    } else {
                        m6981 = C0630.m2566("ۗ᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-9305)) ^ (-226654081);
                        i5 = 1881336355;
                    }
                case -1875986432:
                case 656404417:
                    if (j - j2 < 300) {
                        m6981 = C2105.m6981("ᩴ᩹") ^ i2;
                        i4 = ((m6981 ^ i3) * (-12125)) ^ (-1093301435);
                        i5 = 1889954156;
                    } else {
                        m6981 = (i3 - C2105.m6981("᩵ۢ")) * 95;
                        i4 = ((m6981 ^ i2) * (-28701)) ^ 281436909;
                        i5 = 879092149;
                    }
                case -1832700533:
                case 321671177:
                    if (C0050.f910 >= 0) {
                        m6981 = (C2105.m6981("ۙ֨") ^ i2) * 61;
                        i4 = ((m6981 ^ i3) * 29259) ^ (-1548785207);
                        i5 = 1172669686;
                    } else {
                        m6981 = (C2105.m6981("ܳۢ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m6981 ^ i3) * 29747) ^ 1932099959;
                        i5 = -1788137733;
                    }
                case -1763052738:
                case 673820229:
                    if (C0483.m2121()) {
                        m6981 = C2105.m6981("ۢ֫") ^ i3;
                        i4 = ((m6981 ^ i2) * (-7705)) ^ 1112023775;
                        i5 = -1794593611;
                    } else {
                        m6981 = C0630.m2566("ۗ᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-9305)) ^ (-226654081);
                        i5 = 1881336355;
                    }
                case -1350143510:
                case 1093445887:
                    break;
                case -1233442994:
                case 281549335:
                    if (C1420.f5096 <= 0) {
                        m6981 = (i3 - C2105.m6981("ۚܶ")) * 63;
                        i4 = ((m6981 ^ i2) * (-4979)) ^ 777385259;
                        i5 = 1353242776;
                    } else {
                        m6981 = (C0630.m2566("ۚۨ") ^ i3) * 65;
                        i4 = ((m6981 ^ i2) * 16061) ^ (-2127780496);
                        i5 = -600396271;
                    }
                case -1145760182:
                case 1044932593:
                    if (C1711.f5919) {
                        m6981 = (i3 - C2105.m6981("ۚܶ")) * 63;
                        i4 = ((m6981 ^ i2) * (-4979)) ^ 777385259;
                        i5 = 1353242776;
                    } else {
                        m6981 = (C2105.m6981("᩸ܰ") + i2) * 61;
                        i4 = ((m6981 ^ i3) * (-26909)) ^ 164347081;
                        i5 = 1058859398;
                    }
                case -1065685484:
                case 1158793992:
                    j = ViewOnClickListenerC1958.m6432();
                    if (C1420.f5096 <= 0) {
                        m6981 = (C2105.m6981("ۙ֨") ^ i2) * 61;
                        i4 = ((m6981 ^ i3) * 29259) ^ (-1548785207);
                        i5 = 1172669686;
                    } else {
                        m6981 = (C0630.m2566("۟ܶ") + i2) * (-83);
                        i4 = ((m6981 ^ i3) * 5117) ^ (-1569765488);
                        i5 = 1161822375;
                    }
                case -975370235:
                case 362472061:
                    j2 = activityC8848.f26939;
                    if (C2105.m6982() != 0) {
                        m6981 = (C2105.m6981("֨۫") + i3) * (-41);
                        i4 = ((m6981 ^ i2) * (-14293)) ^ (-1034513527);
                        i5 = 1864988251;
                    } else {
                        m6981 = C2105.m6981("᩵᩻") ^ i2;
                        i4 = ((m6981 ^ i3) * 7503) ^ (-781746084);
                        i5 = -130025628;
                    }
                case -961160403:
                case 1855770570:
                    C0483.m2121();
                    if (C1420.f5096 <= 0) {
                        m6981 = C0630.m2566("ۗ᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-9305)) ^ (-226654081);
                        i5 = 1881336355;
                    } else {
                        m6981 = (C0630.m2566("᩺᩸") + i2) * (-27);
                        i4 = ((m6981 ^ i3) * 27769) ^ 1249759818;
                        i5 = 860359672;
                    }
                case -791820098:
                case 44139508:
                    C3911.m11924();
                    C0630.m2564();
                    m6981 = C0630.m2566("ۗ᩸") ^ i3;
                    i4 = ((m6981 ^ i2) * (-9305)) ^ (-226654081);
                    i5 = 1881336355;
                case -770903375:
                case 1103744239:
                    if (C2520.f8000 < 0) {
                        C0964.m3402(new C6731(activityC8848));
                        break;
                    }
                    m6981 = (C2105.m6981("֨۫") + i3) * (-41);
                    i4 = ((m6981 ^ i2) * (-14293)) ^ (-1034513527);
                    i5 = 1864988251;
                case -503072875:
                case 178666417:
                    if (C1005.f3721) {
                        m6981 = (C2105.m6981("۠֫") ^ i3) * (-63);
                        i4 = ((m6981 ^ i2) * (-32539)) ^ 501983565;
                        i5 = 1466385848;
                    } else {
                        m6981 = (C0630.m2566("᩺᩸") + i2) * (-27);
                        i4 = ((m6981 ^ i3) * 27769) ^ 1249759818;
                        i5 = 860359672;
                    }
                case 56236019:
                case 1668387266:
                    activityC8848.f26939 = ViewOnClickListenerC1958.m6432();
                    if (C0630.f2410 <= 0) {
                        m6981 = (C2105.m6981("ۙ֨") ^ i2) * 61;
                        i4 = ((m6981 ^ i3) * 29259) ^ (-1548785207);
                        i5 = 1172669686;
                    } else {
                        m6981 = (C2105.m6981("ܽ᩻") ^ i2) * (-79);
                        i4 = ((m6981 ^ i3) * (-15315)) ^ (-1238877695);
                        i5 = 1647602466;
                    }
                case 97581959:
                case 1587504468:
                    RunnableC0588.m2441();
                    C1294.m4372();
                    break;
                case 1168415197:
                case 1581254956:
                    if (C2126.m7040()) {
                        m6981 = (i3 - C2105.m6981("ۚܶ")) * 63;
                        i4 = ((m6981 ^ i2) * (-4979)) ^ 777385259;
                        i5 = 1353242776;
                    } else {
                        m6981 = C0630.m2566("ۗ᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-9305)) ^ (-226654081);
                        i5 = 1881336355;
                    }
                default:
                    if (C0050.f910 >= 0) {
                        m6981 = (C2105.m6981("֨۫") + i3) * (-41);
                        i4 = ((m6981 ^ i2) * (-14293)) ^ (-1034513527);
                        i5 = 1864988251;
                    } else {
                        m6981 = C0630.m2566("ۗ֡") ^ i3;
                        i4 = ((m6981 ^ i2) * (-8613)) ^ 395442109;
                        i5 = -345984935;
                    }
            }
            return;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int m2566;
        int i;
        int i2;
        C9554 c9554;
        String str;
        C9554 c95542;
        C9554 c95543;
        int i3;
        C9554 c95544;
        int i4;
        short[] sArr;
        int i5;
        C9554 c95545;
        int m7041;
        int m25662;
        int i6;
        int i7;
        int i8;
        int i9;
        int m6981;
        short[] sArr2;
        int i10;
        int i11;
        int i12;
        int m69812;
        int i13;
        int i14;
        short[] sArr3;
        int i15;
        short s;
        short[] sArr4;
        int m69813;
        int i16;
        int i17;
        int m69814;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int m25663;
        int i23;
        C9554 c95546;
        int m69815;
        int i24;
        int m25664;
        int i25;
        int i26;
        int i27;
        int m25665;
        int i28;
        int i29;
        String str2;
        C9554 c95547;
        short[] sArr5;
        int i30;
        C9554 c95548;
        int i31;
        short s2 = 0;
        int i32 = 830010960;
        int i33 = C1773.f6144;
        int i34 = C0422.f1886;
        int m69816 = C2105.m6981("۬ۘ") ^ i34;
        int i35 = ((m69816 ^ i33) * 26557) ^ (-2093739273);
        int i36 = m69816 ^ 1085291671;
        String str3 = null;
        C9554 c95549 = null;
        JSONException jSONException = null;
        C9554 c955410 = null;
        C9554 c955411 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        boolean z = false;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        boolean z2 = false;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        char c = 0;
        boolean z3 = false;
        short s3 = 0;
        int i43 = 0;
        int i44 = 0;
        C10235 c10235 = null;
        JSONObject jSONObject = null;
        Iterator it = null;
        String str7 = null;
        int i45 = 0;
        boolean z4 = false;
        ArrayList arrayList = null;
        JSONObject jSONObject2 = null;
        String str8 = null;
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            i32 = i36 ^ (i35 & (((i32 ^ i33) * (-13463)) >> 31));
            switch (i32) {
                case -2125165180:
                case 1101909939:
                    c95544 = c955411;
                    str = str8;
                    i4 = i40;
                    c95542 = c95549;
                    sArr = sArr8;
                    i5 = i44;
                    c95545 = c955410;
                    m7041 = C2126.m7041(menuItem);
                    sArr7 = f26935;
                    i43 = 54;
                    if (C0714.f2697 < 0) {
                        m25662 = (C0630.m2566("ۧܿ") + i34) * (-79);
                        i6 = ((m25662 ^ i33) * (-5455)) ^ (-1568442413);
                        i7 = 1807180143;
                        i36 = m25662 ^ i7;
                        i44 = i5;
                        c955411 = c95544;
                        sArr8 = sArr;
                        i40 = i4;
                        i39 = m7041;
                        i35 = i6;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    }
                    m25662 = C0630.m2566("ۗ᩺") ^ i33;
                    i6 = ((m25662 ^ i34) * (-29927)) ^ 1006850946;
                    i7 = -714665898;
                    i36 = m25662 ^ i7;
                    i44 = i5;
                    c955411 = c95544;
                    sArr8 = sArr;
                    i40 = i4;
                    i39 = m7041;
                    i35 = i6;
                    c955410 = c95545;
                    c95549 = c95542;
                    str8 = str;
                case -2039370977:
                case -901865972:
                    c95544 = c955411;
                    str = str8;
                    c95542 = c95549;
                    sArr3 = sArr8;
                    c95545 = c955410;
                    i12 = i40;
                    i15 = i44;
                    jSONObject2 = new JSONObject();
                    jSONObject = new JSONObject();
                    m69813 = (i33 - C0630.m2566("ۡۛ")) * (-37);
                    i16 = ((m69813 ^ i34) * (-15799)) ^ (-1644866643);
                    i17 = -417222731;
                    i36 = m69813 ^ i17;
                    i35 = i16;
                    i44 = i15;
                    c955411 = c95544;
                    sArr8 = sArr3;
                    i40 = i12;
                    c955410 = c95545;
                    c95549 = c95542;
                    str8 = str;
                case -2036411990:
                case 289937807:
                    if (C1420.f5096 > 0) {
                        c95544 = c955411;
                        str = str8;
                        i8 = i39;
                        i4 = i40;
                        c95542 = c95549;
                        s = s3;
                        sArr4 = sArr7;
                        sArr3 = sArr8;
                        i15 = i44;
                        c95545 = c955410;
                        i27 = i43;
                        m25665 = (i34 - C0630.m2566("᩵ܰ")) * 19;
                        i28 = ((m25665 ^ i33) * (-32471)) ^ (-490409037);
                        i29 = 345859802;
                        i43 = i27;
                        i44 = i15;
                        c955410 = c95545;
                        sArr8 = sArr3;
                        sArr7 = sArr4;
                        s3 = s;
                        i36 = m25665 ^ i29;
                        i35 = i28;
                        c95549 = c95542;
                        i40 = i4;
                        str8 = str;
                        i39 = i8;
                        c955411 = c95544;
                    } else {
                        c95544 = c955411;
                        str = str8;
                        m7041 = i39;
                        i4 = i40;
                        c95542 = c95549;
                        sArr = sArr8;
                        i5 = i44;
                        c95545 = c955410;
                        m25662 = C0630.m2566("ۗ᩺") ^ i33;
                        i6 = ((m25662 ^ i34) * (-29927)) ^ 1006850946;
                        i7 = -714665898;
                        i36 = m25662 ^ i7;
                        i44 = i5;
                        c955411 = c95544;
                        sArr8 = sArr;
                        i40 = i4;
                        i39 = m7041;
                        i35 = i6;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    }
                case -1846028963:
                case -813392577:
                    str = str8;
                    c95542 = c95549;
                    if (C4075.m12247(C11340.m28030(c95542.f28971)) != 0) {
                        m25663 = (i33 - C2105.m6981("ۤ֫")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        c95545 = c955410;
                        i6 = ((m25663 ^ i34) * (-1497)) ^ 2123399078;
                        i23 = -1508681750;
                        i36 = m25663 ^ i23;
                        i35 = i6;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    } else {
                        c95545 = c955410;
                        c95544 = c955411;
                        i12 = i40;
                        sArr3 = sArr8;
                        i15 = i44;
                        m69813 = (C2105.m6981("ۖܺ") + i34) * 99;
                        i16 = ((m69813 ^ i33) * (-24183)) ^ (-1315462375);
                        i17 = -580213128;
                        i36 = m69813 ^ i17;
                        i35 = i16;
                        i44 = i15;
                        c955411 = c95544;
                        sArr8 = sArr3;
                        i40 = i12;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    }
                case -1785478526:
                case 1917473401:
                    str = str8;
                    c95542 = c95549;
                    c95545 = c955410;
                    if (z3) {
                        m25663 = (C2105.m6981("᩶᩹") ^ i34) * (-77);
                        i6 = ((m25663 ^ i33) * (-29813)) ^ (-474157992);
                        i23 = -827172568;
                    } else {
                        m25663 = (C2105.m6981("᩵۠") + i34) * (-37);
                        i6 = ((m25663 ^ i33) * (-32419)) ^ 1382658952;
                        i23 = 767387014;
                    }
                    i36 = m25663 ^ i23;
                    i35 = i6;
                    c955410 = c95545;
                    c95549 = c95542;
                    str8 = str;
                case -1780660566:
                case -548911118:
                    ServiceConnectionC3453.m10564();
                    if (C0714.f2697 < 0) {
                        c95544 = c955411;
                        str = str8;
                        i8 = i39;
                        i4 = i40;
                        c95542 = c95549;
                        s = s3;
                        sArr4 = sArr7;
                        sArr3 = sArr8;
                        i15 = i44;
                        c95545 = c955410;
                        i27 = i43;
                        m25665 = (i34 - C0630.m2566("᩵ܰ")) * 19;
                        i28 = ((m25665 ^ i33) * (-32471)) ^ (-490409037);
                        i29 = 345859802;
                        i43 = i27;
                        i44 = i15;
                        c955410 = c95545;
                        sArr8 = sArr3;
                        sArr7 = sArr4;
                        s3 = s;
                        i36 = m25665 ^ i29;
                        i35 = i28;
                        c95549 = c95542;
                        i40 = i4;
                        str8 = str;
                        i39 = i8;
                        c955411 = c95544;
                    } else {
                        m2566 = C0630.m2566("᩶ۡ") ^ i33;
                        i = ((m2566 ^ i34) * 32015) ^ 812588771;
                        i2 = 515412675;
                        i36 = m2566 ^ i2;
                        i35 = i;
                    }
                case -1776656599:
                case 213314968:
                    c95544 = c955411;
                    str = str8;
                    c95542 = c95549;
                    sArr3 = sArr8;
                    c95545 = c955410;
                    i12 = i40;
                    i15 = i44;
                    str3 = null;
                    if (i12 < C3432.m10481(arrayList)) {
                        m69813 = (i34 - C2105.m6981("ۖۘ")) * 83;
                        i16 = ((m69813 ^ i33) * (-16287)) ^ (-1423371672);
                        i17 = 942751599;
                    } else {
                        m69813 = C2105.m6981("᩻֫") ^ i33;
                        i16 = ((m69813 ^ i34) * 11635) ^ 298525782;
                        i17 = -1462767495;
                    }
                    i36 = m69813 ^ i17;
                    i35 = i16;
                    i44 = i15;
                    c955411 = c95544;
                    sArr8 = sArr3;
                    i40 = i12;
                    c955410 = c95545;
                    c95549 = c95542;
                    str8 = str;
                case -1772822338:
                case -1462395918:
                    C4159.m12565();
                    if (!C1504.f5354) {
                        str = str8;
                        m69815 = C0630.m2566("ۤܽ") ^ i33;
                        i18 = ((m69815 ^ i34) * (-7793)) ^ 1174839703;
                        i24 = 1073063072;
                        i36 = m69815 ^ i24;
                        i35 = i18;
                        str8 = str;
                    }
                    c95544 = c955411;
                    str = str8;
                    m7041 = i39;
                    i4 = i40;
                    c95542 = c95549;
                    sArr = sArr8;
                    i5 = i44;
                    c95545 = c955410;
                    m25662 = C0630.m2566("ۗ᩺") ^ i33;
                    i6 = ((m25662 ^ i34) * (-29927)) ^ 1006850946;
                    i7 = -714665898;
                    i36 = m25662 ^ i7;
                    i44 = i5;
                    c955411 = c95544;
                    sArr8 = sArr;
                    i40 = i4;
                    i39 = m7041;
                    i35 = i6;
                    c955410 = c95545;
                    c95549 = c95542;
                    str8 = str;
                case -1731587121:
                case 962910590:
                    try {
                        str = str8;
                        try {
                            str5 = C2105.m6988(f26935, 63, 3, i38);
                            m25664 = (C2105.m6981("ۡܳ") ^ i33) * (-5);
                            i25 = ((m25664 ^ i34) * (-28193)) ^ 1898487933;
                            i26 = 102990665;
                            i36 = m25664 ^ i26;
                            i35 = i25;
                        } catch (JSONException e) {
                            e = e;
                            jSONException = e;
                            c95542 = c95549;
                            sArr3 = sArr8;
                            c95545 = c955410;
                            i12 = i40;
                            i15 = i44;
                            m69813 = C0630.m2566("ܶۤ") ^ i34;
                            c95544 = c955411;
                            i16 = ((m69813 ^ i33) * (-20945)) ^ 1196819846;
                            i17 = 1548746634;
                            i36 = m69813 ^ i17;
                            i35 = i16;
                            i44 = i15;
                            c955411 = c95544;
                            sArr8 = sArr3;
                            i40 = i12;
                            c955410 = c95545;
                            c95549 = c95542;
                            str8 = str;
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        str = str8;
                    }
                    str8 = str;
                case -1673568498:
                case 1630354997:
                    c95544 = c955411;
                    str2 = str8;
                    c95547 = c95549;
                    sArr5 = sArr8;
                    i30 = i44;
                    c95548 = c955410;
                    i31 = 0;
                    int m69817 = (C2105.m6981("᩻ᩴ") ^ i33) * 5;
                    int i46 = ((m69817 ^ i34) * 2895) ^ 412521991;
                    i36 = m69817 ^ 2142025282;
                    i44 = i30;
                    c955410 = c95548;
                    sArr8 = sArr5;
                    i40 = i31;
                    i35 = i46;
                    c95549 = c95547;
                    str8 = str2;
                    c955411 = c95544;
                case -1535260014:
                case -247342999:
                    c95544 = c955411;
                    str = str8;
                    i8 = i39;
                    i4 = i40;
                    c95542 = c95549;
                    sArr2 = sArr7;
                    sArr = sArr8;
                    i5 = i44;
                    c95545 = c955410;
                    i9 = i43;
                    i38 = 28260;
                    m6981 = C2105.m6981("۟ܶ") ^ i33;
                    i10 = ((m6981 ^ i34) * (-6005)) ^ (-1717366665);
                    i11 = 1863348850;
                    i36 = m6981 ^ i11;
                    i35 = i10;
                    i43 = i9;
                    i44 = i5;
                    c955410 = c95545;
                    sArr8 = sArr;
                    sArr7 = sArr2;
                    c95549 = c95542;
                    i40 = i4;
                    str8 = str;
                    i39 = i8;
                    c955411 = c95544;
                case -1402268978:
                case 1108019779:
                    str = str8;
                    i41 = C2105.m6981(C4075.m12252(sArr9, i45, i37, i38));
                    i42 = 2103060884;
                    if (C22628.m50615() != 0) {
                        m25664 = C2105.m6981("ۚᩳ") ^ i34;
                        i25 = ((m25664 ^ i33) * 32595) ^ 1234522753;
                        i26 = -564193596;
                    } else {
                        m25664 = (C0630.m2566("ᩴܺ") ^ i34) * 19;
                        i25 = ((m25664 ^ i33) * 2981) ^ 702405534;
                        i26 = 1843230344;
                    }
                    i36 = m25664 ^ i26;
                    i35 = i25;
                    str8 = str;
                case -1297390868:
                case 1034109274:
                    if (C1047.f3863 < 0) {
                        c9554 = c955411;
                        str = str8;
                        c95542 = c95549;
                        c95543 = c955410;
                        i3 = i40;
                        i22 = (C2105.m6981("ۤ᩷") ^ i34) * (-61);
                        i21 = ((i22 ^ i33) * (-2237)) ^ (-212382464);
                        i20 = -765314289;
                        i36 = i22 ^ i20;
                        i40 = i3;
                        i35 = i21;
                        c955410 = c95543;
                        c955411 = c9554;
                        c95549 = c95542;
                        str8 = str;
                    } else {
                        m2566 = C0630.m2566("᩶ܶ") ^ i34;
                        i = ((m2566 ^ i33) * 23449) ^ (-2039939501);
                        i2 = -1900242881;
                        i36 = m2566 ^ i2;
                        i35 = i;
                    }
                case -1264739379:
                case 641146892:
                    str = str8;
                    C1711.m5728(i41 ^ i42);
                    c955410 = (C9554) C3537.m10755(arrayList, z5 ? 1 : 0);
                    if (C0798.f2919) {
                        m69815 = C0630.m2566("ۤܽ") ^ i33;
                        i18 = ((m69815 ^ i34) * (-7793)) ^ 1174839703;
                        i24 = 1073063072;
                        i36 = m69815 ^ i24;
                        i35 = i18;
                        str8 = str;
                    } else {
                        m25664 = (i33 - C0630.m2566("֡ۛ")) * (-97);
                        i25 = ((m25664 ^ i34) * (-18671)) ^ (-1955374707);
                        i26 = 1184879667;
                        i36 = m25664 ^ i26;
                        i35 = i25;
                        str8 = str;
                    }
                case -1262717855:
                case 479268737:
                    c95544 = c955411;
                    str = str8;
                    c95542 = c95549;
                    sArr3 = sArr8;
                    c95545 = c955410;
                    i12 = i40;
                    i15 = i44;
                    z6 = false;
                    m69813 = C2105.m6981("ۨܳ") ^ i34;
                    i16 = ((m69813 ^ i33) * 3785) ^ (-1856408665);
                    i17 = 2043060351;
                    i36 = m69813 ^ i17;
                    i35 = i16;
                    i44 = i15;
                    c955411 = c95544;
                    sArr8 = sArr3;
                    i40 = i12;
                    c955410 = c95545;
                    c95549 = c95542;
                    str8 = str;
                case -1124779751:
                case 805750814:
                    C3663.m11168();
                    c95544 = c955411;
                    str = str8;
                    i8 = i39;
                    i4 = i40;
                    c95542 = c95549;
                    s = s3;
                    sArr4 = sArr7;
                    sArr3 = sArr8;
                    i15 = i44;
                    c95545 = c955410;
                    i27 = i43;
                    m25665 = (i34 - C0630.m2566("᩵ܰ")) * 19;
                    i28 = ((m25665 ^ i33) * (-32471)) ^ (-490409037);
                    i29 = 345859802;
                    i43 = i27;
                    i44 = i15;
                    c955410 = c95545;
                    sArr8 = sArr3;
                    sArr7 = sArr4;
                    s3 = s;
                    i36 = m25665 ^ i29;
                    i35 = i28;
                    c95549 = c95542;
                    i40 = i4;
                    str8 = str;
                    i39 = i8;
                    c955411 = c95544;
                case -1097149158:
                case 687626136:
                    if (z4) {
                        c95544 = c955411;
                        str = str8;
                        c95542 = c95549;
                        sArr3 = sArr8;
                        c95545 = c955410;
                        i12 = i40;
                        i15 = i44;
                        m69813 = (i34 - C2105.m6981("᩸ۜ")) * (-27);
                        i16 = ((m69813 ^ i33) * 2607) ^ 716600692;
                        i17 = 18661438;
                        i36 = m69813 ^ i17;
                        i35 = i16;
                        i44 = i15;
                        c955411 = c95544;
                        sArr8 = sArr3;
                        i40 = i12;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    } else {
                        m2566 = C0630.m2566("۟ۜ") ^ i33;
                        i = ((m2566 ^ i34) * 3527) ^ 1510254799;
                        i2 = 680274758;
                        i36 = m2566 ^ i2;
                        i35 = i;
                    }
                case -1004800229:
                case -166922689:
                    c95544 = c955411;
                    str = str8;
                    c95542 = c95549;
                    sArr3 = sArr8;
                    c95545 = c955410;
                    i12 = i40;
                    i15 = i44;
                    z = true;
                    if (C4075.m12247(C1005.m3497(c10235)) != 0) {
                        m69813 = C0630.m2566("ۜ᩵") ^ i33;
                        i16 = ((m69813 ^ i34) * (-12445)) ^ 582647704;
                        i17 = 1842656942;
                    } else {
                        m69813 = (C2105.m6981("ᩳᩳ") ^ i34) * (-27);
                        i16 = ((m69813 ^ i33) * 21259) ^ (-426486831);
                        i17 = -348462428;
                    }
                    i36 = m69813 ^ i17;
                    i35 = i16;
                    i44 = i15;
                    c955411 = c95544;
                    sArr8 = sArr3;
                    i40 = i12;
                    c955410 = c95545;
                    c95549 = c95542;
                    str8 = str;
                case -998399390:
                case 1482400506:
                    c95544 = c955411;
                    str = str8;
                    i8 = i39;
                    i4 = i40;
                    c95542 = c95549;
                    s = s3;
                    sArr4 = sArr7;
                    sArr3 = sArr8;
                    i15 = i44;
                    c95545 = c955410;
                    i27 = i43;
                    sArr6 = f26935;
                    c = '5';
                    if (C3911.f12484 < 0) {
                        m25665 = C0630.m2566("۫᩵") ^ i34;
                        i28 = ((m25665 ^ i33) * 8699) ^ (-1865393157);
                        i29 = 172306791;
                        i43 = i27;
                        i44 = i15;
                        c955410 = c95545;
                        sArr8 = sArr3;
                        sArr7 = sArr4;
                        s3 = s;
                        i36 = m25665 ^ i29;
                        i35 = i28;
                        c95549 = c95542;
                        i40 = i4;
                        str8 = str;
                        i39 = i8;
                        c955411 = c95544;
                    }
                    m25665 = (i34 - C0630.m2566("᩵ܰ")) * 19;
                    i28 = ((m25665 ^ i33) * (-32471)) ^ (-490409037);
                    i29 = 345859802;
                    i43 = i27;
                    i44 = i15;
                    c955410 = c95545;
                    sArr8 = sArr3;
                    sArr7 = sArr4;
                    s3 = s;
                    i36 = m25665 ^ i29;
                    i35 = i28;
                    c95549 = c95542;
                    i40 = i4;
                    str8 = str;
                    i39 = i8;
                    c955411 = c95544;
                case -970299166:
                case 1096733535:
                    c95544 = c955411;
                    str = str8;
                    i8 = i39;
                    i4 = i40;
                    c95542 = c95549;
                    sArr2 = sArr7;
                    sArr = sArr8;
                    i5 = i44;
                    c95545 = c955410;
                    i9 = i43;
                    i38 = 38762;
                    m6981 = C2105.m6981("۟ܶ") ^ i33;
                    i10 = ((m6981 ^ i34) * (-6005)) ^ (-1717366665);
                    i11 = 1863348850;
                    i36 = m6981 ^ i11;
                    i35 = i10;
                    i43 = i9;
                    i44 = i5;
                    c955410 = c95545;
                    sArr8 = sArr;
                    sArr7 = sArr2;
                    c95549 = c95542;
                    i40 = i4;
                    str8 = str;
                    i39 = i8;
                    c955411 = c95544;
                case -961234148:
                case 575597943:
                    if (C4616.f14690 > 0) {
                        c95544 = c955411;
                        str = str8;
                        i8 = i39;
                        i4 = i40;
                        c95542 = c95549;
                        s = s3;
                        sArr4 = sArr7;
                        sArr3 = sArr8;
                        i15 = i44;
                        c95545 = c955410;
                        i27 = i43;
                        m25665 = (i34 - C0630.m2566("᩵ܰ")) * 19;
                        i28 = ((m25665 ^ i33) * (-32471)) ^ (-490409037);
                        i29 = 345859802;
                        i43 = i27;
                        i44 = i15;
                        c955410 = c95545;
                        sArr8 = sArr3;
                        sArr7 = sArr4;
                        s3 = s;
                        i36 = m25665 ^ i29;
                        i35 = i28;
                        c95549 = c95542;
                        i40 = i4;
                        str8 = str;
                        i39 = i8;
                        c955411 = c95544;
                    } else {
                        m2566 = C0630.m2566("۟۫") ^ i33;
                        i = ((m2566 ^ i34) * (-25337)) ^ 1426291979;
                        i2 = -1676224266;
                        i36 = m2566 ^ i2;
                        i35 = i;
                    }
                case -844761208:
                case 494086783:
                    C11340.m28031();
                    return false;
                case -834840465:
                case 203246807:
                    C1711.m5740(c955410.f28971);
                    c955410.f28971.m30477(str3);
                    return z;
                case -724791943:
                case -575377479:
                    C1005.m3501();
                    if (C1916.m6308() >= 0) {
                        m2566 = C0630.m2566("᩶ۡ") ^ i33;
                        i = ((m2566 ^ i34) * 32015) ^ 812588771;
                        i2 = 515412675;
                        i36 = m2566 ^ i2;
                        i35 = i;
                    } else {
                        c95544 = c955411;
                        str = str8;
                        i8 = i39;
                        i4 = i40;
                        c95542 = c95549;
                        sArr2 = sArr7;
                        sArr = sArr8;
                        i5 = i44;
                        c95545 = c955410;
                        i9 = i43;
                        m6981 = (i33 - C2105.m6981("֡ᩳ")) * (-127);
                        i10 = ((m6981 ^ i34) * (-12543)) ^ 1192451677;
                        i11 = 255348982;
                        i36 = m6981 ^ i11;
                        i35 = i10;
                        i43 = i9;
                        i44 = i5;
                        c955410 = c95545;
                        sArr8 = sArr;
                        sArr7 = sArr2;
                        c95549 = c95542;
                        i40 = i4;
                        str8 = str;
                        i39 = i8;
                        c955411 = c95544;
                    }
                case -639563647:
                case 86730289:
                    c95544 = c955411;
                    str = str8;
                    c95542 = c95549;
                    sArr3 = sArr8;
                    c95545 = c955410;
                    i12 = i40;
                    i15 = i44;
                    try {
                        it = C2958.m9029(arrayList);
                        m69813 = (i34 - C2105.m6981("᩸ۜ")) * (-27);
                        i16 = ((m69813 ^ i33) * 2607) ^ 716600692;
                        i17 = 18661438;
                    } catch (JSONException e3) {
                        jSONException = e3;
                        c955411 = c95544;
                        m69813 = C0630.m2566("ܶۤ") ^ i34;
                        c95544 = c955411;
                        i16 = ((m69813 ^ i33) * (-20945)) ^ 1196819846;
                        i17 = 1548746634;
                        i36 = m69813 ^ i17;
                        i35 = i16;
                        i44 = i15;
                        c955411 = c95544;
                        sArr8 = sArr3;
                        i40 = i12;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    }
                    i36 = m69813 ^ i17;
                    i35 = i16;
                    i44 = i15;
                    c955411 = c95544;
                    sArr8 = sArr3;
                    i40 = i12;
                    c955410 = c95545;
                    c95549 = c95542;
                    str8 = str;
                case -621545892:
                case 1185435241:
                    str = str8;
                    c95542 = c95549;
                    c95545 = c955410;
                    c95544 = c955411;
                    short[] sArr10 = sArr8;
                    int i47 = i44;
                    str6 = C4159.m12578(sArr10, i47, 3, i38);
                    if (C2272.m7503()) {
                        sArr = sArr10;
                        m7041 = i39;
                        i4 = i40;
                        i5 = i47;
                        m25662 = C0630.m2566("ۗ᩺") ^ i33;
                        i6 = ((m25662 ^ i34) * (-29927)) ^ 1006850946;
                        i7 = -714665898;
                        i36 = m25662 ^ i7;
                        i44 = i5;
                        c955411 = c95544;
                        sArr8 = sArr;
                        i40 = i4;
                        i39 = m7041;
                        i35 = i6;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    } else {
                        int m69818 = (C2105.m6981("᩸ܽ") + i33) * (-109);
                        i36 = m69818 ^ 84556856;
                        i35 = ((m69818 ^ i34) * 30013) ^ 1917383600;
                        i44 = i47;
                        c955410 = c95545;
                        c955411 = c95544;
                        sArr8 = sArr10;
                        c95549 = c95542;
                        str8 = str;
                    }
                case -607759450:
                case 1283556750:
                    str = str8;
                    try {
                        c95546 = (C9554) C2272.m7513(it);
                    } catch (JSONException e4) {
                        e = e4;
                        jSONException = e;
                        c95542 = c95549;
                        sArr3 = sArr8;
                        c95545 = c955410;
                        i12 = i40;
                        i15 = i44;
                        m69813 = C0630.m2566("ܶۤ") ^ i34;
                        c95544 = c955411;
                        i16 = ((m69813 ^ i33) * (-20945)) ^ 1196819846;
                        i17 = 1548746634;
                        i36 = m69813 ^ i17;
                        i35 = i16;
                        i44 = i15;
                        c955411 = c95544;
                        sArr8 = sArr3;
                        i40 = i12;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    }
                    try {
                        str4 = c95546.f28973.m6237();
                        z2 = C1916.m6313(str4);
                        int m69819 = (i34 - C2105.m6981("ۧۤ")) * 15;
                        i36 = m69819 ^ (-606248077);
                        i35 = ((m69819 ^ i33) * (-5639)) ^ (-264025297);
                        c955411 = c95546;
                    } catch (JSONException e5) {
                        jSONException = e5;
                        c955411 = c95546;
                        c95542 = c95549;
                        sArr3 = sArr8;
                        c95545 = c955410;
                        i12 = i40;
                        i15 = i44;
                        m69813 = C0630.m2566("ܶۤ") ^ i34;
                        c95544 = c955411;
                        i16 = ((m69813 ^ i33) * (-20945)) ^ 1196819846;
                        i17 = 1548746634;
                        i36 = m69813 ^ i17;
                        i35 = i16;
                        i44 = i15;
                        c955411 = c95544;
                        sArr8 = sArr3;
                        i40 = i12;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    }
                    str8 = str;
                case -316088192:
                case 649082554:
                    str = str8;
                    JSONException jSONException2 = jSONException;
                    c95542 = c95549;
                    c95545 = c955410;
                    if (i40 != 0) {
                        int m25666 = C0630.m2566("֫۟") ^ i33;
                        jSONException = jSONException2;
                        i35 = ((m25666 ^ i34) * (-29267)) ^ (-1918204539);
                        i36 = m25666 ^ (-516339107);
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    } else {
                        jSONException = jSONException2;
                        c95544 = c955411;
                        i12 = i40;
                        sArr3 = sArr8;
                        i15 = i44;
                        m69813 = (C2105.m6981("ۖܺ") + i34) * 99;
                        i16 = ((m69813 ^ i33) * (-24183)) ^ (-1315462375);
                        i17 = -580213128;
                        i36 = m69813 ^ i17;
                        i35 = i16;
                        i44 = i15;
                        c955411 = c95544;
                        sArr8 = sArr3;
                        i40 = i12;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    }
                case -303275617:
                case 565875654:
                    c95544 = c955411;
                    str = str8;
                    i8 = i39;
                    i4 = i40;
                    c95542 = c95549;
                    short s4 = s3;
                    sArr4 = sArr7;
                    sArr3 = sArr8;
                    i15 = i44;
                    c95545 = c955410;
                    i27 = i43;
                    int i48 = s4 + s2;
                    if ((i48 * i48) - (s4 * 8488) >= 0) {
                        m25665 = C0630.m2566("ۢ᩸") ^ i33;
                        s = s4;
                        i28 = ((m25665 ^ i34) * 27839) ^ 2087773540;
                        i29 = -1967110990;
                    } else {
                        s = s4;
                        m25665 = (C2105.m6981("ܳ᩻") + i34) * q.h;
                        i28 = ((m25665 ^ i33) * (-9873)) ^ 739542624;
                        i29 = -311167385;
                    }
                    i43 = i27;
                    i44 = i15;
                    c955410 = c95545;
                    sArr8 = sArr3;
                    sArr7 = sArr4;
                    s3 = s;
                    i36 = m25665 ^ i29;
                    i35 = i28;
                    c95549 = c95542;
                    i40 = i4;
                    str8 = str;
                    i39 = i8;
                    c955411 = c95544;
                case -300861767:
                case 457865961:
                    C9554 c955412 = c955411;
                    str = str8;
                    c95542 = c95549;
                    short[] sArr11 = sArr8;
                    c95545 = c955410;
                    i12 = i40;
                    int i49 = i44;
                    int i50 = i39;
                    if (i50 == (C2105.m6981(str7) ^ 2122488396)) {
                        m69812 = (C0630.m2566("۟ۙ") + i34) * (-35);
                        i13 = ((m69812 ^ i33) * 6347) ^ (-1820679678);
                        i14 = -1320285716;
                    } else {
                        m69812 = (C2105.m6981("ۡۨ") ^ i33) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i13 = ((m69812 ^ i34) * (-17251)) ^ (-1297678301);
                        i14 = 1129913803;
                    }
                    i36 = m69812 ^ i14;
                    i35 = i13;
                    i39 = i50;
                    i44 = i49;
                    c955411 = c955412;
                    sArr8 = sArr11;
                    z5 = false;
                    i40 = i12;
                    c955410 = c95545;
                    c95549 = c95542;
                    str8 = str;
                case -193468412:
                case 103911789:
                    try {
                        jSONObject.put(str5, str8);
                        c95544 = c955411;
                        str = str8;
                        c95542 = c95549;
                        sArr3 = sArr8;
                        c95545 = c955410;
                        i12 = i40;
                        i15 = i44;
                        m69813 = (i34 - C2105.m6981("᩸ۜ")) * (-27);
                        i16 = ((m69813 ^ i33) * 2607) ^ 716600692;
                        i17 = 18661438;
                    } catch (JSONException e6) {
                        jSONException = e6;
                        str = str8;
                        c95542 = c95549;
                        sArr3 = sArr8;
                        c95545 = c955410;
                        i12 = i40;
                        i15 = i44;
                        m69813 = C0630.m2566("ܶۤ") ^ i34;
                        c95544 = c955411;
                        i16 = ((m69813 ^ i33) * (-20945)) ^ 1196819846;
                        i17 = 1548746634;
                        i36 = m69813 ^ i17;
                        i35 = i16;
                        i44 = i15;
                        c955411 = c95544;
                        sArr8 = sArr3;
                        i40 = i12;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    }
                    i36 = m69813 ^ i17;
                    i35 = i16;
                    i44 = i15;
                    c955411 = c95544;
                    sArr8 = sArr3;
                    i40 = i12;
                    c955410 = c95545;
                    c95549 = c95542;
                    str8 = str;
                case -96806383:
                case 1819871649:
                    str = str8;
                    this.f26940.m2043(z5 ? 1 : 0);
                    sArr9 = f26935;
                    i45 = 60;
                    i37 = 3;
                    if (C2105.m6982() == 0) {
                        m69815 = (i33 - C2105.m6981("ۛۙ")) * 43;
                        i18 = ((m69815 ^ i34) * (-17167)) ^ (-1625789324);
                        i24 = 1975617862;
                        i36 = m69815 ^ i24;
                        i35 = i18;
                        str8 = str;
                    }
                    m69815 = C0630.m2566("ۤܽ") ^ i33;
                    i18 = ((m69815 ^ i34) * (-7793)) ^ 1174839703;
                    i24 = 1073063072;
                    i36 = m69815 ^ i24;
                    i35 = i18;
                    str8 = str;
                case -95721960:
                case 313426572:
                    c95544 = c955411;
                    str = str8;
                    i8 = i39;
                    i4 = i40;
                    c95542 = c95549;
                    sArr2 = sArr7;
                    sArr = sArr8;
                    i5 = i44;
                    c95545 = c955410;
                    i9 = i43;
                    s3 = sArr6[c];
                    s2 = 2122;
                    if (!C3663.f11553) {
                        m6981 = (C0630.m2566("۫ܰ") + i33) * (-113);
                        i10 = ((m6981 ^ i34) * (-10485)) ^ 510928133;
                        i11 = 2143256403;
                        i36 = m6981 ^ i11;
                        i35 = i10;
                        i43 = i9;
                        i44 = i5;
                        c955410 = c95545;
                        sArr8 = sArr;
                        sArr7 = sArr2;
                        c95549 = c95542;
                        i40 = i4;
                        str8 = str;
                        i39 = i8;
                        c955411 = c95544;
                    }
                    m6981 = (i33 - C2105.m6981("֡ᩳ")) * (-127);
                    i10 = ((m6981 ^ i34) * (-12543)) ^ 1192451677;
                    i11 = 255348982;
                    i36 = m6981 ^ i11;
                    i35 = i10;
                    i43 = i9;
                    i44 = i5;
                    c955410 = c95545;
                    sArr8 = sArr;
                    sArr7 = sArr2;
                    c95549 = c95542;
                    i40 = i4;
                    str8 = str;
                    i39 = i8;
                    c955411 = c95544;
                case -69558493:
                case 1691434997:
                    if (C2958.f9394 < 0) {
                        m2566 = C0630.m2566("ۡۚ") ^ i34;
                        i = ((m2566 ^ i33) * 13651) ^ (-1410570015);
                        i2 = 1759559419;
                        i36 = m2566 ^ i2;
                        i35 = i;
                    }
                    m2566 = C0630.m2566("᩶ۡ") ^ i33;
                    i = ((m2566 ^ i34) * 32015) ^ 812588771;
                    i2 = 515412675;
                    i36 = m2566 ^ i2;
                    i35 = i;
                case 119296084:
                case 795324049:
                    return z5;
                case 133452499:
                case 1130969153:
                    c95544 = c955411;
                    str = str8;
                    c95542 = c95549;
                    sArr3 = sArr8;
                    c95545 = c955410;
                    i12 = i40;
                    i15 = i44;
                    z6 = true;
                    m69813 = C2105.m6981("ۨܳ") ^ i34;
                    i16 = ((m69813 ^ i33) * 3785) ^ (-1856408665);
                    i17 = 2043060351;
                    i36 = m69813 ^ i17;
                    i35 = i16;
                    i44 = i15;
                    c955411 = c95544;
                    sArr8 = sArr3;
                    i40 = i12;
                    c955410 = c95545;
                    c95549 = c95542;
                    str8 = str;
                case 171632337:
                case 734982914:
                    C9554 c955413 = c955410;
                    C9554 c955414 = c955411;
                    str = str8;
                    int i51 = i40;
                    short[] sArr12 = sArr8;
                    int i52 = i44;
                    C9554 c955415 = (C9554) C3019.m9263(arrayList, i51);
                    if (ServiceConnectionC3453.m10554(C1005.m3497(c955415.f28974)) == 0) {
                        m69814 = (C2105.m6981("ۢۖ") ^ i33) * 73;
                        i18 = ((m69814 ^ i34) * (-24109)) ^ 2051475948;
                        i19 = 81916422;
                    } else {
                        m69814 = C2105.m6981("ۖۡ") ^ i34;
                        i18 = ((m69814 ^ i33) * 4423) ^ (-43514368);
                        i19 = 667363446;
                    }
                    i36 = m69814 ^ i19;
                    i44 = i52;
                    c955411 = c955414;
                    sArr8 = sArr12;
                    i40 = i51;
                    c955410 = c955413;
                    c95549 = c955415;
                    i35 = i18;
                    str8 = str;
                case 250037138:
                case 653902307:
                    c95544 = c955411;
                    str = str8;
                    c95542 = c95549;
                    sArr3 = sArr8;
                    c95545 = c955410;
                    i12 = i40;
                    i15 = i44;
                    arrayList = this.f26941;
                    C10235 c102352 = ((C9554) C3019.m9263(arrayList, z5 ? 1 : 0)).f28971;
                    if (C0798.f2919) {
                        c10235 = c102352;
                        i8 = i39;
                        s = s3;
                        sArr4 = sArr7;
                        i4 = i12;
                        i27 = i43;
                        m25665 = (i34 - C0630.m2566("᩵ܰ")) * 19;
                        i28 = ((m25665 ^ i33) * (-32471)) ^ (-490409037);
                        i29 = 345859802;
                        i43 = i27;
                        i44 = i15;
                        c955410 = c95545;
                        sArr8 = sArr3;
                        sArr7 = sArr4;
                        s3 = s;
                        i36 = m25665 ^ i29;
                        i35 = i28;
                        c95549 = c95542;
                        i40 = i4;
                        str8 = str;
                        i39 = i8;
                        c955411 = c95544;
                    } else {
                        int m25667 = C0630.m2566("ܶܶ") ^ i33;
                        c10235 = c102352;
                        i35 = ((m25667 ^ i34) * 14263) ^ 1312363893;
                        i36 = m25667 ^ (-659459831);
                        i44 = i15;
                        c955411 = c95544;
                        sArr8 = sArr3;
                        i40 = i12;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    }
                case 275304229:
                case 939344811:
                    jSONObject2.put(str5, C0050.m947(C11340.m28030(c955411.f28974)));
                    str8 = C0422.m1959(C1005.m3497(c955411.f28971));
                    z4 = C1916.m6313(str8);
                    m2566 = C0630.m2566("᩻ܺ") ^ i34;
                    i = ((m2566 ^ i33) * (-26611)) ^ (-1146956982);
                    i2 = 806627462;
                    i36 = m2566 ^ i2;
                    i35 = i;
                case 295755823:
                case 2116357687:
                    str2 = str8;
                    c95547 = c95549;
                    c95548 = c955410;
                    c95544 = c955411;
                    i31 = i40 + 1;
                    sArr5 = sArr8;
                    i30 = i44;
                    int m698172 = (C2105.m6981("᩻ᩴ") ^ i33) * 5;
                    int i462 = ((m698172 ^ i34) * 2895) ^ 412521991;
                    i36 = m698172 ^ 2142025282;
                    i44 = i30;
                    c955410 = c95548;
                    sArr8 = sArr5;
                    i40 = i31;
                    i35 = i462;
                    c95549 = c95547;
                    str8 = str2;
                    c955411 = c95544;
                case 318171993:
                case 1070604809:
                    C0798.m3004(C0630.m2566(str6) ^ 2129852984);
                    C0798.m3010(c95549.f28974);
                    return z;
                case 450781976:
                case 1059893692:
                    c95544 = c955411;
                    str = str8;
                    c95542 = c95549;
                    sArr3 = sArr8;
                    int i53 = i44;
                    c95545 = c955410;
                    i12 = i40;
                    if (z6) {
                        i15 = i53;
                        m69813 = (C2105.m6981("ۖܺ") + i34) * 99;
                        i16 = ((m69813 ^ i33) * (-24183)) ^ (-1315462375);
                        i17 = -580213128;
                        i36 = m69813 ^ i17;
                        i35 = i16;
                        i44 = i15;
                        c955411 = c95544;
                        sArr8 = sArr3;
                        i40 = i12;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    } else {
                        m69813 = C0630.m2566("ᩴ᩶") ^ i33;
                        i15 = i53;
                        i16 = ((m69813 ^ i34) * 31237) ^ 247608947;
                        i17 = -1013526540;
                        i36 = m69813 ^ i17;
                        i35 = i16;
                        i44 = i15;
                        c955411 = c95544;
                        sArr8 = sArr3;
                        i40 = i12;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    }
                case 469967825:
                case 1358622292:
                    c9554 = c955411;
                    str = str8;
                    c95542 = c95549;
                    c95543 = c955410;
                    i3 = i40;
                    this.f26940.m2043(i3);
                    sArr8 = f26935;
                    i44 = 57;
                    if (C1047.m3599() < 0) {
                        i22 = (i34 - C0630.m2566("֡᩺")) * (-25);
                        i21 = ((i22 ^ i33) * (-31791)) ^ 804683291;
                        i20 = -676177071;
                        i36 = i22 ^ i20;
                        i40 = i3;
                        i35 = i21;
                        c955410 = c95543;
                        c955411 = c9554;
                        c95549 = c95542;
                        str8 = str;
                    }
                    i22 = (C2105.m6981("ۤ᩷") ^ i34) * (-61);
                    i21 = ((i22 ^ i33) * (-2237)) ^ (-212382464);
                    i20 = -765314289;
                    i36 = i22 ^ i20;
                    i40 = i3;
                    i35 = i21;
                    c955410 = c95543;
                    c955411 = c9554;
                    c95549 = c95542;
                    str8 = str;
                case 544426464:
                case 1211805122:
                    C0964.m3402(new C20843(this, jSONObject2, jSONObject));
                    return z;
                case 613773062:
                case 1303550522:
                    c95544 = c955411;
                    str = str8;
                    i8 = i39;
                    c95542 = c95549;
                    sArr = sArr8;
                    c95545 = c955410;
                    int i54 = i40;
                    i5 = i44;
                    i4 = i54;
                    short[] sArr13 = sArr7;
                    i9 = i43;
                    str7 = AbstractC2021.m6573(sArr13, i9, 3, i38);
                    if (C1128.f4106 <= 0) {
                        sArr7 = sArr13;
                        i43 = i9;
                        m7041 = i8;
                        m25662 = C0630.m2566("ۗ᩺") ^ i33;
                        i6 = ((m25662 ^ i34) * (-29927)) ^ 1006850946;
                        i7 = -714665898;
                        i36 = m25662 ^ i7;
                        i44 = i5;
                        c955411 = c95544;
                        sArr8 = sArr;
                        i40 = i4;
                        i39 = m7041;
                        i35 = i6;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    } else {
                        m6981 = C2105.m6981("᩸֫") ^ i34;
                        sArr2 = sArr13;
                        i10 = ((m6981 ^ i33) * (-7569)) ^ 1621461164;
                        i11 = -151433333;
                        i36 = m6981 ^ i11;
                        i35 = i10;
                        i43 = i9;
                        i44 = i5;
                        c955410 = c95545;
                        sArr8 = sArr;
                        sArr7 = sArr2;
                        c95549 = c95542;
                        i40 = i4;
                        str8 = str;
                        i39 = i8;
                        c955411 = c95544;
                    }
                case 755452276:
                case 1151621861:
                    ServiceConnectionC3453.m10561(this, jSONException, str3);
                    return z;
                case 1587278415:
                case 1691688178:
                    str = str8;
                    c95542 = c95549;
                    c95545 = c955410;
                    try {
                        z3 = C1773.m5910(it);
                        m25663 = (i33 - C0630.m2566("ᩴۜ")) * 7;
                        i6 = ((m25663 ^ i34) * (-8383)) ^ 1068218584;
                        i23 = 895304475;
                        i36 = m25663 ^ i23;
                        i35 = i6;
                    } catch (JSONException e7) {
                        jSONException = e7;
                        i12 = i40;
                        sArr3 = sArr8;
                        i15 = i44;
                        m69813 = C0630.m2566("ܶۤ") ^ i34;
                        c95544 = c955411;
                        i16 = ((m69813 ^ i33) * (-20945)) ^ 1196819846;
                        i17 = 1548746634;
                        i36 = m69813 ^ i17;
                        i35 = i16;
                        i44 = i15;
                        c955411 = c95544;
                        sArr8 = sArr3;
                        i40 = i12;
                        c955410 = c95545;
                        c95549 = c95542;
                        str8 = str;
                    }
                    c955410 = c95545;
                    c95549 = c95542;
                    str8 = str;
                case 1879777763:
                case 2065474600:
                    C1128.m3851();
                    if (C1420.f5096 <= 0) {
                        m2566 = C0630.m2566("᩶ۡ") ^ i33;
                        i = ((m2566 ^ i34) * 32015) ^ 812588771;
                        i2 = 515412675;
                        i36 = m2566 ^ i2;
                        i35 = i;
                    } else {
                        c9554 = c955411;
                        str = str8;
                        c95542 = c95549;
                        c95543 = c955410;
                        i3 = i40;
                        i22 = (C2105.m6981("ۤ᩷") ^ i34) * (-61);
                        i21 = ((i22 ^ i33) * (-2237)) ^ (-212382464);
                        i20 = -765314289;
                        i36 = i22 ^ i20;
                        i40 = i3;
                        i35 = i21;
                        c955410 = c95543;
                        c955411 = c9554;
                        c95549 = c95542;
                        str8 = str;
                    }
                default:
                    str = str8;
                    if (z2) {
                        m25664 = C2105.m6981("ۨۗ") ^ i34;
                        i25 = ((m25664 ^ i33) * (-17321)) ^ (-37801831);
                        i26 = 563037840;
                        i36 = m25664 ^ i26;
                        i35 = i25;
                        str8 = str;
                    } else {
                        str5 = str4;
                        m25664 = (C2105.m6981("ۡܳ") ^ i33) * (-5);
                        i25 = ((m25664 ^ i34) * (-28193)) ^ 1898487933;
                        i26 = 102990665;
                        i36 = m25664 ^ i26;
                        i35 = i25;
                        str8 = str;
                    }
            }
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m22865(ActivityC8848 activityC8848) {
        String str = null;
        C10465 c10465 = null;
        Iterator it = null;
        C9554 c9554 = null;
        C1893 c1893 = null;
        String str2 = null;
        C6231 c6231 = null;
        C10235 c10235 = null;
        String str3 = null;
        int i = -2017668281;
        int i2 = C4117.f13076;
        int i3 = C3432.f10845;
        int m6981 = (C2105.m6981("ۚܶ") ^ i3) * 123;
        int i4 = ((m6981 ^ i2) * (-24757)) ^ (-1082402259);
        int i5 = 1522354683;
        while (true) {
            i = ((((i ^ i2) * 23245) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2108424218:
                case 1119279774:
                    c10235 = c9554.f28974;
                    str3 = c6231.m17155();
                    if (C0798.f2919) {
                        m6981 = C2105.m6981("᩶᩻") ^ i2;
                        i4 = ((m6981 ^ i3) * (-21819)) ^ (-1611730892);
                        i5 = 1968568318;
                    } else {
                        m6981 = (C2105.m6981("۫ۛ") + i2) * (-47);
                        i4 = ((m6981 ^ i3) * (-19559)) ^ 1354686498;
                        i5 = 1127501219;
                    }
                case -2105324701:
                case -678623671:
                    if (C1916.f6442) {
                        m6981 = (i3 - C0630.m2566("᩶᩷")) * (-17);
                        i4 = ((m6981 ^ i2) * (-15421)) ^ (-1539899705);
                        i5 = -2040888793;
                    } else {
                        m6981 = C2105.m6981("᩶᩻") ^ i2;
                        i4 = ((m6981 ^ i3) * (-21819)) ^ (-1611730892);
                        i5 = 1968568318;
                    }
                case -2060096726:
                case 1240202586:
                    if (C21923.f70183 != 0) {
                        m6981 = (C2105.m6981("ᩴ۟") + i3) * (-85);
                        i4 = ((m6981 ^ i2) * (-28765)) ^ (-1525225590);
                        i5 = -300560288;
                    } else {
                        m6981 = (C2105.m6981("ۜۙ") + i3) * (-125);
                        i4 = ((m6981 ^ i2) * 5209) ^ 1059326996;
                        i5 = -322684055;
                    }
                case -1704109224:
                case -1401949129:
                    if (C1773.m5910(it)) {
                        m6981 = (C0630.m2566("֡ܳ") + i2) * 73;
                        i4 = ((m6981 ^ i3) * (-1139)) ^ 538253796;
                        i5 = -135576829;
                    } else {
                        m6981 = (C0630.m2566("۠ۢ") + i3) * (-51);
                        i4 = ((m6981 ^ i2) * (-27219)) ^ (-569249545);
                        i5 = -1609491510;
                    }
                case -1531803618:
                case 1611780037:
                    c1893 = c9554.f28973;
                    if (C1128.m3851() <= 0) {
                        m6981 = (C2105.m6981("ᩴ۟") + i3) * (-85);
                        i4 = ((m6981 ^ i2) * (-28765)) ^ (-1525225590);
                        i5 = -300560288;
                    } else {
                        m6981 = (C0630.m2566("۟ܽ") + i3) * (-73);
                        i4 = ((m6981 ^ i2) * (-13815)) ^ (-1659094230);
                        i5 = 2104530268;
                    }
                case -1522971138:
                case 1289165160:
                    activityC8848.f26937 = true;
                    break;
                case -1403978099:
                case -772434346:
                    if (C4117.f13076 <= 0) {
                        m6981 = (C2105.m6981("ᩴ۟") + i3) * (-85);
                        i4 = ((m6981 ^ i2) * (-28765)) ^ (-1525225590);
                        i5 = -300560288;
                    } else {
                        m6981 = C2105.m6981("᩶᩻") ^ i2;
                        i4 = ((m6981 ^ i3) * (-21819)) ^ (-1611730892);
                        i5 = 1968568318;
                    }
                case -1291796141:
                case 1374589606:
                    c6231 = (C6231) C0964.m3410(c10465.f31405, str2);
                    if (c6231 != null) {
                        m6981 = (C0630.m2566("ܽ᩸") + i2) * (-31);
                        i4 = ((m6981 ^ i3) * 8867) ^ 371815430;
                        i5 = -14411100;
                    } else {
                        m6981 = C2105.m6981("ۢۖ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-16855)) ^ 1253909404;
                        i5 = -89738588;
                    }
                case -1145891336:
                case 1004362179:
                    if (C4159.f13567) {
                        m6981 = C2105.m6981("ᩴۗ") ^ i3;
                        i4 = ((m6981 ^ i2) * 31411) ^ (-843773522);
                        i5 = 932457128;
                    } else {
                        m6981 = (C2105.m6981("᩹ۛ") + i2) * (-5);
                        i4 = ((m6981 ^ i3) * 8375) ^ (-848335656);
                        i5 = -2017929833;
                    }
                case -901315420:
                case 1720414513:
                    if (RunnableC0588.m2441() < 0) {
                        m6981 = (C2105.m6981("ᩴ۟") + i3) * (-85);
                        i4 = ((m6981 ^ i2) * (-28765)) ^ (-1525225590);
                        i5 = -300560288;
                    } else {
                        m6981 = (C0630.m2566("֨ܿ") ^ i3) * 31;
                        i4 = ((m6981 ^ i2) * 2807) ^ 1150059921;
                        i5 = 1014848631;
                    }
                case -848005453:
                case 1213966946:
                    c9554 = (C9554) RunnableC1108.m3791(it);
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = (C2105.m6981("ᩴ۟") + i3) * (-85);
                        i4 = ((m6981 ^ i2) * (-28765)) ^ (-1525225590);
                        i5 = -300560288;
                    } else {
                        m6981 = (C0630.m2566("ۗۢ") + i2) * (-65);
                        i4 = ((m6981 ^ i3) * (-18865)) ^ (-15293247);
                        i5 = 1378528752;
                    }
                case -813340429:
                case -258054560:
                    if (C7106.f21815 == 0) {
                        m6981 = (C0630.m2566("֨ܿ") ^ i3) * 31;
                        i4 = ((m6981 ^ i2) * 2807) ^ 1150059921;
                        i5 = 1014848631;
                    } else {
                        m6981 = (C2105.m6981("᩹ۛ") + i2) * (-5);
                        i4 = ((m6981 ^ i3) * 8375) ^ (-848335656);
                        i5 = -2017929833;
                    }
                case -323433341:
                case 1516543879:
                    str = activityC8848.f26943;
                    if (C2958.f9394 >= 0) {
                        m6981 = (C2105.m6981("᩹ۛ") + i2) * (-5);
                        i4 = ((m6981 ^ i3) * 8375) ^ (-848335656);
                        i5 = -2017929833;
                    } else {
                        m6981 = (i2 - C0630.m2566("ۤ᩷")) * (-29);
                        i4 = ((m6981 ^ i3) * 16737) ^ 1207355364;
                        i5 = 1655656550;
                    }
                case -16162908:
                case 1159321598:
                    break;
                case 187854929:
                case 1407693828:
                    C21923.m49331(c10235, str3);
                    if (C4159.f13567) {
                        m6981 = (i3 - C2105.m6981("ۡܰ")) * (-81);
                        i4 = ((m6981 ^ i2) * (-21859)) ^ (-1616882175);
                        i5 = -771075214;
                    } else {
                        m6981 = C2105.m6981("᩶᩻") ^ i2;
                        i4 = ((m6981 ^ i3) * (-21819)) ^ (-1611730892);
                        i5 = 1968568318;
                    }
                case 562276022:
                case 1086728233:
                    str2 = c1893.m6237();
                    if (C0630.f2410 <= 0) {
                        m6981 = C0630.m2566("ܽ᩻") ^ i2;
                        i4 = ((m6981 ^ i3) * (-27441)) ^ (-708328212);
                        i5 = -1504246247;
                    } else {
                        m6981 = (i3 - C0630.m2566("᩷ܳ")) * (-103);
                        i4 = ((m6981 ^ i2) * (-10297)) ^ (-1783872904);
                        i5 = -1793290241;
                    }
                case 597631900:
                case 709932122:
                    C1047.m3599();
                    RunnableC0588.m2441();
                    m6981 = (C2105.m6981("ᩴ۟") + i3) * (-85);
                    i4 = ((m6981 ^ i2) * (-28765)) ^ (-1525225590);
                    i5 = -300560288;
                case 788797273:
                case 826211281:
                    C2126.m7040();
                    break;
                case 984394388:
                case 1725871109:
                    C21923.m49331(c9554.f28971, c6231.m17157());
                    m6981 = C2105.m6981("ۢۖ") ^ i2;
                    i4 = ((m6981 ^ i3) * (-16855)) ^ 1253909404;
                    i5 = -89738588;
                case 1675733731:
                case 2139401998:
                    c10465 = C11876.m29005(str);
                    if (c10465 == null) {
                        m6981 = (C0630.m2566("֡᩵") + i3) * (-21);
                        i4 = ((m6981 ^ i2) * 27775) ^ (-1219005897);
                        i5 = -632465904;
                    } else {
                        m6981 = C0630.m2566("֫᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * 10317) ^ 1543893838;
                        i5 = -2144023347;
                    }
                case 1800609434:
                case 2019584518:
                    if (C4263.m12819() >= 0) {
                        m6981 = C0630.m2566("ܽ᩻") ^ i2;
                        i4 = ((m6981 ^ i3) * (-27441)) ^ (-708328212);
                        i5 = -1504246247;
                    } else {
                        m6981 = (C2105.m6981("ܶܶ") ^ i2) * 5;
                        i4 = ((m6981 ^ i3) * 1637) ^ 1513404364;
                        i5 = 173833211;
                    }
                default:
                    it = C4117.m12354(activityC8848.f26941);
                    m6981 = C2105.m6981("ۢۖ") ^ i2;
                    i4 = ((m6981 ^ i3) * (-16855)) ^ 1253909404;
                    i5 = -89738588;
            }
            return;
        }
    }
}
