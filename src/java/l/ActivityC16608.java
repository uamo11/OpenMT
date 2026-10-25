package l;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* compiled from: F2T1 */
/* renamed from: l.ܽۧ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class ActivityC16608 extends AbstractActivityC3346 implements InterfaceC4585 {

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public static boolean f51007;

    /* renamed from: ܳ᩵ۚ, reason: not valid java name and contains not printable characters */
    private static final short[] f51008 = {6745, -17706, 17501, 30144, -20716, 31338, -24419, 18409, -24164, 22164, 20130, -23928, -22308, 30924, 17879, 16727, 20621, 30488, -18644, -17260, 20806, 30681, 5049, -25188, -17437, -16804, 3295, -5108, -12639, -9636, 5693, -7435, 3037, -32318, -32307, -32313, -32303, -32308, -32310, -32313, -32371, -32310, -32307, -32297, -32314, -32307, -32297, -32371, -32318, -32320, -32297, -32310, -32308, -32307, -32371, -32267, -32278, -32282, -32268, -32313, -32314, -32299, -32314, -32305, -32308, -32301, -32314, -32303, -32269, -32305, -32298, -32316, -32310, -32307, -32278, -32313, -32304, -9459, -1405, 3141, 721, 14214, 14247, 14260, 14247, 14254, 14253, 14258, 14247, 14256, 14209, 14247, 14252, 14262, 14247, 14256, 14211, 14241, 14262, 14251, 14260, 14251, 14262, 14267};

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public int f51009;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C12346 f51010;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public TextView f51011;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f51012;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C4346 f51013;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public C2447 f51014;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public long f51015;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = -45206779;
        int i8 = C2167.f7158;
        int i9 = C22628.f73083;
        int m2566 = (i8 - C0630.m2566("ۧܿ")) * (-39);
        int i10 = ((m2566 ^ i9) * 32229) ^ (-1772980044);
        int i11 = 467400820;
        while (true) {
            i7 = ((((i7 ^ i9) * 16817) >> 31) & i10) ^ (m2566 ^ i11);
            switch (i7) {
                case -2144602672:
                case 2077016296:
                    int i12 = i3 + i4;
                    if (i2 - (i12 + i12) <= 0) {
                        m2566 = (i9 - C0630.m2566("֡۠")) * (-81);
                        i10 = ((m2566 ^ i8) * (-21351)) ^ (-1496959094);
                        i11 = 1964399826;
                    } else {
                        m2566 = C2105.m6981("ۗ۠") ^ i8;
                        i10 = ((m2566 ^ i9) * 22021) ^ 571698689;
                        i11 = 301947170;
                    }
                case -2080043072:
                case -2034320775:
                    c = 'P';
                    if (C4263.f13799 <= 0) {
                        m2566 = (C2105.m6981("᩶۟") + i9) * 57;
                        i10 = ((m2566 ^ i8) * 21889) ^ (-1425198699);
                        i11 = 520660327;
                    } else {
                        m2566 = (C2105.m6981("ۜ᩷") ^ i9) * (-79);
                        i10 = ((m2566 ^ i8) * (-31909)) ^ 1368630111;
                        i11 = -1681401846;
                    }
                case -2051569784:
                case 2007323359:
                    C4075.m12263();
                    if (C1711.f5919) {
                        m2566 = (C2105.m6981("᩶۟") + i9) * 57;
                        i10 = ((m2566 ^ i8) * 21889) ^ (-1425198699);
                        i11 = 520660327;
                    } else {
                        m2566 = C0630.m2566("ܿۗ") ^ i9;
                        i10 = ((m2566 ^ i8) * 28447) ^ (-316369703);
                        i11 = -1434267670;
                    }
                case -2042881848:
                case -380777554:
                    if (C1005.f3721) {
                        m2566 = C2105.m6981("ۙۚ") ^ i9;
                        i10 = ((m2566 ^ i8) * (-20585)) ^ 1118936261;
                        i11 = -1285724229;
                    } else {
                        m2566 = C0630.m2566("۫᩻") ^ i9;
                        i10 = ((m2566 ^ i8) * 21821) ^ 1341793332;
                        i11 = 2145207604;
                    }
                case -2039322130:
                case -1289730322:
                    i5 = 14274;
                    m2566 = (C2105.m6981("᩺ܿ") ^ i9) * (-73);
                    i10 = ((m2566 ^ i8) * 4963) ^ 470472308;
                    i11 = 393194573;
                case -2024966936:
                case -1040639860:
                    C1711.m5736();
                    m2566 = (C2105.m6981("᩶۟") + i9) * 57;
                    i10 = ((m2566 ^ i8) * 21889) ^ (-1425198699);
                    i11 = 520660327;
                case -1849316727:
                case -781279651:
                    if (C3432.f10845 >= 0) {
                        m2566 = C2105.m6981("ۘ᩹") ^ i8;
                        i10 = ((m2566 ^ i9) * 1729) ^ (-206607616);
                        i11 = 1578833519;
                    } else {
                        m2566 = C0630.m2566("᩶۫") ^ i9;
                        i10 = ((m2566 ^ i8) * 18333) ^ (-689900959);
                        i11 = -1885434325;
                    }
                case -1755222449:
                case -131489334:
                    sArr = f51008;
                    if (C0630.f2410 <= 0) {
                        m2566 = C2105.m6981("ۘ᩹") ^ i8;
                        i10 = ((m2566 ^ i9) * 1729) ^ (-206607616);
                        i11 = 1578833519;
                    } else {
                        m2566 = (i8 - C2105.m6981("֡֨")) * 15;
                        i10 = ((m2566 ^ i9) * 31747) ^ 454668258;
                        i11 = 767692152;
                    }
                case -1692785694:
                case -355207721:
                    i = s + 1253;
                    if (C2272.f7362) {
                        m2566 = C0630.m2566("۫᩻") ^ i9;
                        i10 = ((m2566 ^ i8) * 21821) ^ 1341793332;
                        i11 = 2145207604;
                    } else {
                        m2566 = (i9 - C2105.m6981("᩻ۙ")) * 81;
                        i10 = ((m2566 ^ i8) * (-11943)) ^ (-1861361239);
                        i11 = -1260440186;
                    }
                case -1621021071:
                case 650675787:
                    C2126.m7040();
                    if (C2520.f8000 >= 0) {
                        m2566 = (C2105.m6981("᩶۟") + i9) * 57;
                        i10 = ((m2566 ^ i8) * 21889) ^ (-1425198699);
                        i11 = 520660327;
                    } else {
                        m2566 = C2105.m6981("ۘ᩹") ^ i8;
                        i10 = ((m2566 ^ i9) * 1729) ^ (-206607616);
                        i11 = 1578833519;
                    }
                case -1391124302:
                case 1245623079:
                    C1773.m5908();
                    if (C11340.f33930 >= 0) {
                        m2566 = (C2105.m6981("᩶۟") + i9) * 57;
                        i10 = ((m2566 ^ i8) * 21889) ^ (-1425198699);
                        i11 = 520660327;
                    } else {
                        m2566 = C2105.m6981("ܰۡ") ^ i8;
                        i10 = ((m2566 ^ i9) * 20731) ^ 984241131;
                        i11 = -1359791288;
                    }
                case -1268738009:
                case 1362470711:
                    sArr2 = f51008;
                    i6 = 81;
                    if (C11340.f33930 >= 0) {
                        m2566 = C0630.m2566("۫᩻") ^ i9;
                        i10 = ((m2566 ^ i8) * 21821) ^ 1341793332;
                        i11 = 2145207604;
                    } else {
                        m2566 = (C0630.m2566("ܺ᩷") + i8) * (-47);
                        i10 = ((m2566 ^ i9) * 28029) ^ 2010771243;
                        i11 = -456265224;
                    }
                case -1166101507:
                case -1141182036:
                    if (C1504.f5354) {
                        m2566 = (C2105.m6981("᩶۟") + i9) * 57;
                        i10 = ((m2566 ^ i8) * 21889) ^ (-1425198699);
                        i11 = 520660327;
                    } else {
                        m2566 = C2105.m6981("ܶ֫") ^ i8;
                        i10 = ((m2566 ^ i9) * (-29431)) ^ (-1100362730);
                        i11 = 807117501;
                    }
                case -1089440973:
                case -715398527:
                    i2 = i * i;
                    i3 = s * s;
                    if (C3683.f11629 >= 0) {
                        m2566 = C0630.m2566("ܿۗ") ^ i9;
                        i10 = ((m2566 ^ i8) * 28447) ^ (-316369703);
                        i11 = -1434267670;
                    } else {
                        m2566 = (i8 - C0630.m2566("ᩳᩳ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i10 = ((m2566 ^ i9) * (-6673)) ^ (-333352384);
                        i11 = -2111186161;
                    }
                case -1077785529:
                case -982707086:
                    s = sArr[c];
                    if (C0483.f2088 >= 0) {
                        m2566 = C2105.m6981("ۘ᩹") ^ i8;
                        i10 = ((m2566 ^ i9) * 1729) ^ (-206607616);
                        i11 = 1578833519;
                    } else {
                        m2566 = (C0630.m2566("֡֡") ^ i8) * (-17);
                        i10 = ((m2566 ^ i9) * (-2483)) ^ 1626087760;
                        i11 = 2073408077;
                    }
                case -928444435:
                case 1656961328:
                    i5 = 34305;
                    m2566 = (C2105.m6981("᩺ܿ") ^ i9) * (-73);
                    i10 = ((m2566 ^ i8) * 4963) ^ 470472308;
                    i11 = 393194573;
                case -625643564:
                case 525078987:
                    C4263.m12819();
                    C2105.m6982();
                    return null;
                case 980543897:
                case 1164786146:
                    i4 = 1570009;
                    if (C4263.f13799 <= 0) {
                        m2566 = C0630.m2566("ܿۗ") ^ i9;
                        i10 = ((m2566 ^ i8) * 28447) ^ (-316369703);
                        i11 = -1434267670;
                    } else {
                        m2566 = C0630.m2566("ۤ᩶") ^ i8;
                        i10 = ((m2566 ^ i9) * 17571) ^ 399075293;
                        i11 = -1566917412;
                    }
                default:
                    return C3537.m10748(sArr2, i6, 23, i5);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39103(ActivityC16608 activityC16608, int i, RunnableC0111 runnableC0111) {
        int i2 = 763137124;
        int i3 = C3683.f11629;
        int i4 = C3537.f11231;
        int m2566 = (C0630.m2566("ۧ֫") + i3) * (-41);
        int i5 = ((m2566 ^ i4) * 29177) ^ (-580348027);
        int i6 = 1022906397;
        while (true) {
            i2 = ((((i2 ^ i4) * 6783) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -1847510789:
                case -960347305:
                    if (i != activityC16608.f51009) {
                        m2566 = (C2105.m6981("ۘ۬") + i3) * (-47);
                        i5 = ((m2566 ^ i4) * (-3687)) ^ 539820662;
                        i6 = 1717066226;
                    } else {
                        m2566 = C2105.m6981("ᩳۡ") ^ i4;
                        i5 = ((m2566 ^ i3) * 9115) ^ 1117071290;
                        i6 = -1585696618;
                    }
                case -1624375429:
                case -1102470419:
                    if (C22628.f73083 <= 0) {
                        m2566 = C2105.m6981("ܳۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 5195) ^ (-584380118);
                        i6 = 866413103;
                    } else {
                        m2566 = C2105.m6981("ܺۤ") ^ i3;
                        i5 = ((m2566 ^ i4) * 17313) ^ 1453213055;
                        i6 = -1415153401;
                    }
                case -1286071942:
                case -353987622:
                    if (C4159.f13567) {
                        m2566 = (C2105.m6981("᩶᩷") ^ i3) * (-27);
                        i5 = ((m2566 ^ i4) * 25705) ^ 2130293665;
                        i6 = 1865840685;
                    } else {
                        m2566 = (C2105.m6981("᩷᩻") + i3) * (-127);
                        i5 = ((m2566 ^ i4) * 3499) ^ (-303758286);
                        i6 = 276209043;
                    }
                case -1194231534:
                case 1596022272:
                    if (C7811.f24123 >= 0) {
                        m2566 = C2105.m6981("᩵ᩳ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-9539)) ^ 1359643413;
                        i6 = 638437953;
                    } else {
                        m2566 = C0630.m2566("֨֡") ^ i4;
                        i5 = ((m2566 ^ i3) * (-31255)) ^ 2116748283;
                        i6 = -2002253495;
                    }
                case -1184197921:
                case 2099949131:
                    if (C0422.f1886 <= 0) {
                        m2566 = C2105.m6981("ܳۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 5195) ^ (-584380118);
                        i6 = 866413103;
                    } else {
                        m2566 = (i4 - C0630.m2566("ܰۙ")) * 23;
                        i5 = ((m2566 ^ i3) * 15541) ^ (-1566105342);
                        i6 = -1346663138;
                    }
                case -1082903102:
                case 2084228345:
                    C1294.m4372();
                    C1420.m4913();
                    m2566 = C2105.m6981("᩵ᩳ") ^ i4;
                    i5 = ((m2566 ^ i3) * (-9539)) ^ 1359643413;
                    i6 = 638437953;
                case -961085809:
                case 1494331898:
                    if (C1916.f6442) {
                        m2566 = (C0630.m2566("۫֡") + i3) * 69;
                        i5 = ((m2566 ^ i4) * 15347) ^ 451094675;
                        i6 = 2033430068;
                    } else {
                        m2566 = C2105.m6981("ܳۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 5195) ^ (-584380118);
                        i6 = 866413103;
                    }
                case -830222713:
                case 269793560:
                    if (C4159.f13567) {
                        m2566 = C2105.m6981("ۖᩴ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-18247)) ^ (-1417033115);
                        i6 = -1985117704;
                    } else {
                        m2566 = C2105.m6981("۟ܰ") ^ i4;
                        i5 = ((m2566 ^ i3) * 2089) ^ (-491356745);
                        i6 = 81082000;
                    }
                case -794355110:
                case -714283285:
                    AbstractC2021.m6574();
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        m2566 = C2105.m6981("᩵ᩳ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-9539)) ^ 1359643413;
                        i6 = 638437953;
                    } else {
                        m2566 = (C2105.m6981("᩻ۛ") + i3) * (-117);
                        i5 = ((m2566 ^ i4) * 16647) ^ 410857475;
                        i6 = 1397273901;
                    }
                case -501383070:
                case -72755544:
                    C1916.m6308();
                    if (C3245.f10203 <= 0) {
                        m2566 = C2105.m6981("᩵ᩳ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-9539)) ^ 1359643413;
                        i6 = 638437953;
                    } else {
                        m2566 = C2105.m6981("۟ܰ") ^ i4;
                        i5 = ((m2566 ^ i3) * 2089) ^ (-491356745);
                        i6 = 81082000;
                    }
                case -390983434:
                case 2092135715:
                    break;
                case -114878474:
                case 1731761090:
                    if (C1504.m5179()) {
                        m2566 = C2105.m6981("۟ᩴ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-29289)) ^ 795242056;
                        i6 = 1878016466;
                    } else {
                        m2566 = C2105.m6981("ܳۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 5195) ^ (-584380118);
                        i6 = 866413103;
                    }
                case 434668937:
                case 2016474473:
                    if (C2105.m6982() != 0) {
                        m2566 = C2105.m6981("ܳۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 5195) ^ (-584380118);
                        i6 = 866413103;
                    } else {
                        m2566 = (C2105.m6981("᩷֫") + i3) * (-23);
                        i5 = ((m2566 ^ i4) * 11639) ^ (-1636576982);
                        i6 = 1003488399;
                    }
                case 463386326:
                case 1496489585:
                    if (C1420.f5096 <= 0) {
                        m2566 = C2105.m6981("۟ܰ") ^ i4;
                        i5 = ((m2566 ^ i3) * 2089) ^ (-491356745);
                        i6 = 81082000;
                    } else {
                        m2566 = (C2105.m6981("ۚۜ") ^ i4) * (-75);
                        i5 = ((m2566 ^ i3) * 8123) ^ (-1928265736);
                        i6 = -1634027088;
                    }
                case 923469371:
                case 1892025874:
                    runnableC0111.run();
                    ViewOnClickListenerC1958.m6434(activityC16608.f51013);
                    break;
                case 1012096870:
                case 1957096841:
                    if (C1420.f5096 <= 0) {
                        m2566 = C2105.m6981("᩵ᩳ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-9539)) ^ 1359643413;
                        i6 = 638437953;
                    } else {
                        m2566 = (C0630.m2566("ۘ۠") ^ i4) * (-69);
                        i5 = ((m2566 ^ i3) * (-3735)) ^ (-1959539993);
                        i6 = 533752052;
                    }
                case 1865595586:
                case 1930327106:
                    if (C2520.f8000 < 0) {
                        m2566 = C2105.m6981("᩵ᩳ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-9539)) ^ 1359643413;
                        i6 = 638437953;
                    } else {
                        m2566 = (C2105.m6981("᩷᩻") + i3) * (-127);
                        i5 = ((m2566 ^ i4) * 3499) ^ (-303758286);
                        i6 = 276209043;
                    }
                default:
                    C3432.m10477();
                    C3245.m9925();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (l.C3663.m11168() < 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        if (l.C1504.m5179() != false) goto L52;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreateOptionsMenu(android.view.Menu r20) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC16608.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        C9762 c9762;
        short[] sArr;
        short[] sArr2;
        int i2;
        short[] sArr3;
        short[] sArr4;
        short[] sArr5;
        int m2566;
        int i3;
        short[] sArr6;
        int m6981;
        int i4;
        int i5;
        int i6;
        int m69812;
        int i7;
        int i8;
        int m25662;
        int i9;
        int i10;
        short[] sArr7;
        final ActivityC16608 activityC16608 = this;
        View.OnClickListener onClickListener = null;
        View view = null;
        KeyEvent.Callback callback = null;
        ViewGroup viewGroup = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        short[] sArr8 = null;
        int i15 = 0;
        int i16 = 2038724915;
        int i17 = C2167.f7158;
        int i18 = ViewOnClickListenerC1958.f6529;
        int m69813 = (C2105.m6981("ܿ۠") + i18) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
        int i19 = ((m69813 ^ i17) * 17403) ^ 260388299;
        int i20 = m69813 ^ (-400112470);
        C9762 c97622 = null;
        String str = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        View view2 = null;
        short s = 0;
        AbstractC10446 abstractC10446 = null;
        C9762 c97623 = null;
        short[] sArr12 = null;
        int i28 = 0;
        while (true) {
            i16 = i20 ^ (i19 & (((i16 ^ i17) * (-29341)) >> 31));
            switch (i16) {
                case -2135498839:
                case 2109124336:
                    C12346 c12346 = (C12346) C4263.m12813(activityC16608, i12 ^ i13);
                    activityC16608.f51010 = c12346;
                    c12346.m29957(activityC16608);
                    mo1502();
                    break;
                case -1974033988:
                case -1840394907:
                    c9762 = c97623;
                    sArr = sArr12;
                    sArr7 = sArr10;
                    sArr4 = sArr11;
                    i6 = i28;
                    i27 = C0630.m2566(AbstractC2021.m6573(sArr7, i6, 3, i21));
                    if (C2520.f8000 < 0) {
                        sArr3 = sArr7;
                        m69812 = C2105.m6981("ۨ᩷") ^ i18;
                        i7 = ((m69812 ^ i17) * (-1097)) ^ 1536918612;
                        i8 = 128726659;
                        i20 = m69812 ^ i8;
                        i19 = i7;
                        sArr12 = sArr;
                        c97623 = c9762;
                        short[] sArr13 = sArr3;
                        i28 = i6;
                        sArr11 = sArr4;
                        sArr10 = sArr13;
                    }
                    m69812 = (C0630.m2566("۫ܿ") + i17) * 13;
                    sArr3 = sArr7;
                    i7 = ((m69812 ^ i18) * 14203) ^ (-1396348954);
                    i8 = 2054348523;
                    i20 = m69812 ^ i8;
                    i19 = i7;
                    sArr12 = sArr;
                    c97623 = c9762;
                    short[] sArr132 = sArr3;
                    i28 = i6;
                    sArr11 = sArr4;
                    sArr10 = sArr132;
                case -1969586414:
                case 472769899:
                    C2272.m7503();
                    m25662 = (C2105.m6981("֫ۧ") ^ i17) * 95;
                    i9 = ((m25662 ^ i18) * (-22421)) ^ 1734518987;
                    i10 = -826273887;
                    i20 = m25662 ^ i10;
                    i19 = i9;
                case -1823334791:
                case -1290143789:
                    view = C4263.m12813(activityC16608, C2105.m6981(C0422.m1955(sArr12, i22, i23, i21)) ^ 2119657052);
                    m25662 = C2105.m6981("ۛ᩹") ^ i18;
                    i9 = ((m25662 ^ i17) * (-21259)) ^ (-459413253);
                    i10 = -1380688944;
                    i20 = m25662 ^ i10;
                    i19 = i9;
                case -1752524112:
                case -1352829558:
                    i2 = i28;
                    c9762 = c97623;
                    sArr = sArr12;
                    sArr3 = sArr10;
                    sArr4 = sArr11;
                    C4263.m12813(activityC16608, i25 ^ i26);
                    sArr6 = f51008;
                    i15 = 7;
                    if (C0798.f2919) {
                        sArr5 = sArr9;
                        int m69814 = (C2105.m6981("֫֫") ^ i18) * 55;
                        int i29 = ((m69814 ^ i17) * (-18071)) ^ (-1889778363);
                        i20 = m69814 ^ (-346828355);
                        activityC16608 = this;
                        sArr9 = sArr5;
                        sArr11 = sArr4;
                        sArr10 = sArr3;
                        i28 = i2;
                        sArr8 = sArr6;
                        i19 = i29;
                        sArr12 = sArr;
                        c97623 = c9762;
                    } else {
                        int m69815 = C2105.m6981("ᩴۢ") ^ i17;
                        int i30 = ((m69815 ^ i18) * 5201) ^ (-386090830);
                        i20 = m69815 ^ (-1495561753);
                        sArr12 = sArr;
                        c97623 = c9762;
                        sArr8 = sArr6;
                        i19 = i30;
                        sArr11 = sArr4;
                        sArr10 = sArr3;
                        i28 = i2;
                    }
                case -1733808790:
                case -1073017572:
                    C21923.m49340(activityC16608.f10584, C18393.m42823());
                    m25662 = (C2105.m6981("᩹۟") + i18) * (-35);
                    i9 = ((m25662 ^ i17) * (-13695)) ^ (-2115216633);
                    i10 = 1359775375;
                    i20 = m25662 ^ i10;
                    i19 = i9;
                case -1692432247:
                case -190205154:
                    short[] sArr14 = sArr11;
                    C9762 c97624 = c97623;
                    short[] sArr15 = sArr12;
                    AbstractC10446 abstractC104462 = abstractC10446;
                    abstractC104462.mo26300(true);
                    C9762 c97625 = activityC16608.f10584;
                    short[] sArr16 = f51008;
                    i28 = 10;
                    int m25663 = C0630.m2566("۬ۗ") ^ i17;
                    c97622 = c97625;
                    i19 = ((m25663 ^ i18) * (-7341)) ^ (-1737185193);
                    i20 = m25663 ^ 1392570609;
                    abstractC10446 = abstractC104462;
                    sArr12 = sArr15;
                    c97623 = c97624;
                    sArr10 = sArr16;
                    sArr11 = sArr14;
                case -1585836199:
                case -107540199:
                    activityC16608.f51014 = (C2447) view;
                    sArr11 = f51008;
                    i24 = 16;
                    if (RunnableC3474.f10992 <= 0) {
                        i = i15;
                        c9762 = c97623;
                        sArr = sArr12;
                        sArr2 = sArr8;
                        i2 = i28;
                        sArr3 = sArr10;
                        int m69816 = (C2105.m6981("֨ۤ") + i17) * (-119);
                        i20 = m69816 ^ (-1093587989);
                        i19 = ((m69816 ^ i18) * 24413) ^ 1915847251;
                        sArr10 = sArr3;
                        sArr12 = sArr;
                        c97623 = c9762;
                        i28 = i2;
                        sArr8 = sArr2;
                        i15 = i;
                    } else {
                        m25662 = C0630.m2566("۟ᩳ") ^ i17;
                        i9 = ((m25662 ^ i18) * (-7275)) ^ 1544036793;
                        i10 = -1897721086;
                        i20 = m25662 ^ i10;
                        i19 = i9;
                    }
                case -1580683502:
                case 571341354:
                    activityC16608.f51011 = (TextView) C2958.m9024(viewGroup, i11);
                    C2447 c2447 = activityC16608.f51014;
                    C4346 c4346 = new C4346(activityC16608);
                    activityC16608.f51013 = c4346;
                    C1294.m4381(c2447, c4346);
                    if (C18393.m42825()) {
                        m25662 = (i18 - C2105.m6981("ܿۤ")) * 89;
                        i9 = ((m25662 ^ i17) * 32573) ^ (-1813951550);
                        i10 = -2145872642;
                        i20 = m25662 ^ i10;
                        i19 = i9;
                    }
                    m25662 = (C2105.m6981("᩹۟") + i18) * (-35);
                    i9 = ((m25662 ^ i17) * (-13695)) ^ (-2115216633);
                    i10 = 1359775375;
                    i20 = m25662 ^ i10;
                    i19 = i9;
                case -1568687653:
                case 1184960409:
                    C0050.m940();
                    if (C3663.f11553) {
                        i = i15;
                        c9762 = c97623;
                        sArr = sArr12;
                        sArr2 = sArr8;
                        i2 = i28;
                        sArr3 = sArr10;
                        sArr4 = sArr11;
                        sArr5 = sArr9;
                        m2566 = (C2105.m6981("ܿۧ") + i18) * (-81);
                        i19 = ((m2566 ^ i17) * 1347) ^ 249762972;
                        i3 = 2084711930;
                        i20 = m2566 ^ i3;
                        activityC16608 = this;
                        sArr9 = sArr5;
                        sArr11 = sArr4;
                        sArr10 = sArr3;
                        sArr12 = sArr;
                        c97623 = c9762;
                        i28 = i2;
                        sArr8 = sArr2;
                        i15 = i;
                    } else {
                        m25662 = (C2105.m6981("֫ۧ") ^ i17) * 95;
                        i9 = ((m25662 ^ i18) * (-22421)) ^ 1734518987;
                        i10 = -826273887;
                        i20 = m25662 ^ i10;
                        i19 = i9;
                    }
                case -1370866488:
                case 952032053:
                    viewGroup = (ViewGroup) callback;
                    activityC16608.f51014.m7900((View) viewGroup);
                    i11 = 0;
                    if (C3245.f10203 <= 0) {
                        i = i15;
                        c9762 = c97623;
                        sArr = sArr12;
                        sArr2 = sArr8;
                        i2 = i28;
                        sArr3 = sArr10;
                        sArr4 = sArr11;
                        sArr5 = sArr9;
                        m2566 = (C2105.m6981("ܿۧ") + i18) * (-81);
                        i19 = ((m2566 ^ i17) * 1347) ^ 249762972;
                        i3 = 2084711930;
                        i20 = m2566 ^ i3;
                        activityC16608 = this;
                        sArr9 = sArr5;
                        sArr11 = sArr4;
                        sArr10 = sArr3;
                        sArr12 = sArr;
                        c97623 = c9762;
                        i28 = i2;
                        sArr8 = sArr2;
                        i15 = i;
                    } else {
                        m25662 = (i17 - C2105.m6981("ܽ᩷")) * (-61);
                        i9 = ((m25662 ^ i18) * 16835) ^ 1791568513;
                        i10 = 345086670;
                        i20 = m25662 ^ i10;
                        i19 = i9;
                    }
                case -1356004353:
                case 1866237426:
                    i = i15;
                    c9762 = c97623;
                    sArr = sArr12;
                    sArr2 = sArr8;
                    i2 = i28;
                    sArr3 = sArr10;
                    sArr4 = sArr11;
                    sArr5 = sArr9;
                    short s2 = s;
                    if ((s2 * 436) - (i14 + 47524) <= 0) {
                        m6981 = C2105.m6981("᩷ۢ") ^ i17;
                        i4 = ((m6981 ^ i18) * (-22253)) ^ (-1982883568);
                        i5 = -709808021;
                    } else {
                        m6981 = C2105.m6981("ۨܰ") ^ i18;
                        i4 = ((m6981 ^ i17) * 8587) ^ (-624639376);
                        i5 = 175609777;
                    }
                    i20 = m6981 ^ i5;
                    activityC16608 = this;
                    s = s2;
                    i19 = i4;
                    sArr9 = sArr5;
                    sArr11 = sArr4;
                    sArr10 = sArr3;
                    sArr12 = sArr;
                    c97623 = c9762;
                    i28 = i2;
                    sArr8 = sArr2;
                    i15 = i;
                case -1349903762:
                case 1469763027:
                    c9762 = c97623;
                    sArr = sArr12;
                    short[] sArr17 = sArr10;
                    sArr4 = sArr11;
                    i6 = i28;
                    sArr3 = sArr17;
                    C9762 c97626 = (C9762) view2;
                    activityC16608.f10584 = c97626;
                    C2272.m7515(activityC16608, c97626);
                    abstractC10446 = m4111();
                    if (C7106.f21815 != 0) {
                        i = i15;
                        sArr2 = sArr8;
                        i2 = i6;
                        sArr11 = sArr4;
                        int m698162 = (C2105.m6981("֨ۤ") + i17) * (-119);
                        i20 = m698162 ^ (-1093587989);
                        i19 = ((m698162 ^ i18) * 24413) ^ 1915847251;
                        sArr10 = sArr3;
                        sArr12 = sArr;
                        c97623 = c9762;
                        i28 = i2;
                        sArr8 = sArr2;
                        i15 = i;
                    } else {
                        m69812 = (C2105.m6981("ۗ֡") + i17) * (-77);
                        i7 = ((m69812 ^ i18) * 32031) ^ (-783330290);
                        i8 = 1411371886;
                        i20 = m69812 ^ i8;
                        i19 = i7;
                        sArr12 = sArr;
                        c97623 = c9762;
                        short[] sArr1322 = sArr3;
                        i28 = i6;
                        sArr11 = sArr4;
                        sArr10 = sArr1322;
                    }
                case -1263219433:
                case 1749009575:
                    AbstractC2021.m6574();
                    break;
                case -696234321:
                case 820295941:
                    c9762 = c97623;
                    AbstractC2021.m6559(c9762, onClickListener);
                    sArr12 = f51008;
                    i23 = 3;
                    if (C3019.f9544 >= 0) {
                        sArr = sArr12;
                        sArr7 = sArr10;
                        i22 = 13;
                        sArr4 = sArr11;
                        i6 = i28;
                        m69812 = (C0630.m2566("۫ܿ") + i17) * 13;
                        sArr3 = sArr7;
                        i7 = ((m69812 ^ i18) * 14203) ^ (-1396348954);
                        i8 = 2054348523;
                        i20 = m69812 ^ i8;
                        i19 = i7;
                        sArr12 = sArr;
                        c97623 = c9762;
                        short[] sArr13222 = sArr3;
                        i28 = i6;
                        sArr11 = sArr4;
                        sArr10 = sArr13222;
                    } else {
                        int m69817 = C2105.m6981("֨֨") ^ i18;
                        i20 = m69817 ^ (-948891826);
                        c97623 = c9762;
                        i19 = ((m69817 ^ i17) * (-22293)) ^ 1286782769;
                        i22 = 13;
                    }
                case -637220936:
                case 216303366:
                    i = i15;
                    c9762 = c97623;
                    sArr = sArr12;
                    sArr2 = sArr8;
                    i2 = i28;
                    sArr3 = sArr10;
                    sArr4 = sArr11;
                    sArr5 = sArr9;
                    i21 = 8566;
                    m2566 = (C0630.m2566("ܺ֫") + i17) * (-33);
                    i19 = ((m2566 ^ i18) * (-21209)) ^ (-1097215809);
                    i3 = -319081251;
                    i20 = m2566 ^ i3;
                    activityC16608 = this;
                    sArr9 = sArr5;
                    sArr11 = sArr4;
                    sArr10 = sArr3;
                    sArr12 = sArr;
                    c97623 = c9762;
                    i28 = i2;
                    sArr8 = sArr2;
                    i15 = i;
                case -636083043:
                case 1401905723:
                    C9762 c97627 = c97622;
                    c97627.setNavigationIcon(i27 ^ 2126270955);
                    C9762 c97628 = activityC16608.f10584;
                    onClickListener = new View.OnClickListener() { // from class: l.ۖ֫᩷
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            int i31 = 2071277536;
                            int i32 = C0630.f2410;
                            int i33 = C0483.f2088;
                            int m69818 = (i33 - C2105.m6981("ۘ᩺")) * (-113);
                            int i34 = ((m69818 ^ i32) * (-22685)) ^ (-790051716);
                            int i35 = 2028786110;
                            while (true) {
                                i31 = ((((i31 ^ i32) * 20369) >> 31) & i34) ^ (m69818 ^ i35);
                                switch (i31) {
                                    case -2087876691:
                                    case -457701493:
                                        if (C1420.f5096 <= 0) {
                                            m69818 = (C2105.m6981("ۗۜ") ^ i32) * (-85);
                                            i34 = ((m69818 ^ i33) * 14949) ^ 1101918183;
                                            i35 = -746517464;
                                        } else {
                                            m69818 = (C0630.m2566("ۢۖ") + i32) * (-27);
                                            i34 = ((m69818 ^ i33) * (-32411)) ^ 48019315;
                                            i35 = 658525045;
                                        }
                                    case -2016573171:
                                    case -803426176:
                                        if (C3245.f10203 <= 0) {
                                            m69818 = C0630.m2566("֡ܽ") ^ i33;
                                            i34 = ((m69818 ^ i32) * 15623) ^ 601661668;
                                            i35 = -480164475;
                                        } else {
                                            m69818 = (C2105.m6981("ܰ᩹") ^ i32) * (-51);
                                            i34 = ((m69818 ^ i33) * (-5505)) ^ (-350120549);
                                            i35 = -1196801536;
                                        }
                                    case -1954932732:
                                    case 822033609:
                                        C1047.m3599();
                                        if (C0630.f2410 <= 0) {
                                            m69818 = (C2105.m6981("֡ܿ") ^ i33) * (-123);
                                            i34 = ((m69818 ^ i32) * 149) ^ (-1545141573);
                                            i35 = 309521874;
                                        } else {
                                            m69818 = C0630.m2566("֡ܽ") ^ i33;
                                            i34 = ((m69818 ^ i32) * 15623) ^ 601661668;
                                            i35 = -480164475;
                                        }
                                    case -1663478221:
                                    case 1499861965:
                                        C2272.m7505(ActivityC16608.this);
                                        break;
                                    case -1498575099:
                                    case 1363063592:
                                        if (C0237.f1507 != 0) {
                                            m69818 = (C2105.m6981("ۗۜ") ^ i32) * (-85);
                                            i34 = ((m69818 ^ i33) * 14949) ^ 1101918183;
                                            i35 = -746517464;
                                        } else {
                                            m69818 = (C0630.m2566("ۜۖ") ^ i33) * (-103);
                                            i34 = ((m69818 ^ i32) * 24295) ^ (-1152800837);
                                            i35 = -141742335;
                                        }
                                    case -1453807845:
                                    case -608994845:
                                        C1128.m3851();
                                        C3911.m11924();
                                        break;
                                    case -1367168751:
                                    case 1011000890:
                                        if (C2167.f7158 >= 0) {
                                            m69818 = (C2105.m6981("֡ܿ") ^ i33) * (-123);
                                            i34 = ((m69818 ^ i32) * 149) ^ (-1545141573);
                                            i35 = 309521874;
                                        } else {
                                            m69818 = C0630.m2566("ۚܺ") ^ i32;
                                            i34 = ((m69818 ^ i33) * (-12423)) ^ 17386083;
                                            i35 = -1575958209;
                                        }
                                    case -817939632:
                                    case -57303254:
                                        if (C2958.m9034() <= 0) {
                                            m69818 = C0630.m2566("ۚܺ") ^ i32;
                                            i34 = ((m69818 ^ i33) * (-12423)) ^ 17386083;
                                            i35 = -1575958209;
                                        } else {
                                            m69818 = (C2105.m6981("ܳܺ") ^ i33) * (-29);
                                            i34 = ((m69818 ^ i32) * 20173) ^ 672010223;
                                            i35 = 1060670881;
                                        }
                                    case -623963637:
                                    case 257258772:
                                        if (C2167.m7155()) {
                                            m69818 = C0630.m2566("֡ܽ") ^ i33;
                                            i34 = ((m69818 ^ i32) * 15623) ^ 601661668;
                                            i35 = -480164475;
                                        } else {
                                            m69818 = C0630.m2566("ܳ۫") ^ i33;
                                            i34 = ((m69818 ^ i32) * (-5899)) ^ 1863942101;
                                            i35 = -1181896317;
                                        }
                                    case -600231094:
                                    case -258402571:
                                        if (C0483.f2088 >= 0) {
                                            m69818 = C0630.m2566("ۚܺ") ^ i32;
                                            i34 = ((m69818 ^ i33) * (-12423)) ^ 17386083;
                                            i35 = -1575958209;
                                        } else {
                                            m69818 = (C2105.m6981("ۗۜ") ^ i32) * (-85);
                                            i34 = ((m69818 ^ i33) * 14949) ^ 1101918183;
                                            i35 = -746517464;
                                        }
                                    case -123666983:
                                    case 353525383:
                                        C2126.m7040();
                                        RunnableC1108.m3790();
                                        m69818 = (C2105.m6981("֡ܿ") ^ i33) * (-123);
                                        i34 = ((m69818 ^ i32) * 149) ^ (-1545141573);
                                        i35 = 309521874;
                                    case -113471599:
                                    case 291721590:
                                        if (C1504.f5354) {
                                            m69818 = (C2105.m6981("֡ܿ") ^ i33) * (-123);
                                            i34 = ((m69818 ^ i32) * 149) ^ (-1545141573);
                                            i35 = 309521874;
                                        } else {
                                            m69818 = (C0630.m2566("ۙۗ") ^ i32) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i34 = ((m69818 ^ i33) * 4945) ^ 1163111334;
                                            i35 = 1669057328;
                                        }
                                    case -83905626:
                                    case 733393171:
                                        if (C0964.f3626 != 0) {
                                            m69818 = (C2105.m6981("֡ܿ") ^ i33) * (-123);
                                            i34 = ((m69818 ^ i32) * 149) ^ (-1545141573);
                                            i35 = 309521874;
                                        } else {
                                            m69818 = C0630.m2566("ۖܽ") ^ i32;
                                            i34 = ((m69818 ^ i33) * (-19075)) ^ 1813107708;
                                            i35 = -650267700;
                                        }
                                    case 212791884:
                                    case 1722679704:
                                        boolean z = ActivityC16608.f51007;
                                        if (C22628.f73083 <= 0) {
                                            m69818 = C2105.m6981("ᩴܶ") ^ i33;
                                            i34 = ((m69818 ^ i32) * 1195) ^ 1429132050;
                                            i35 = 800684980;
                                        } else {
                                            m69818 = C2105.m6981("ܺܶ") ^ i32;
                                            i34 = ((m69818 ^ i33) * (-6013)) ^ 1278392853;
                                            i35 = -966173111;
                                        }
                                    case 1216332119:
                                    case 1619856417:
                                        if (RunnableC1108.f4040) {
                                            m69818 = C0630.m2566("۬ۗ") ^ i33;
                                            i34 = ((m69818 ^ i32) * (-3851)) ^ 1247176473;
                                            i35 = 99391843;
                                        } else {
                                            m69818 = C0630.m2566("ۚܺ") ^ i32;
                                            i34 = ((m69818 ^ i33) * (-12423)) ^ 17386083;
                                            i35 = -1575958209;
                                        }
                                    default:
                                        if (RunnableC0588.f2309 >= 0) {
                                            m69818 = C2105.m6981("ᩴܶ") ^ i33;
                                            i34 = ((m69818 ^ i32) * 1195) ^ 1429132050;
                                            i35 = 800684980;
                                        } else {
                                            m69818 = C2105.m6981("۫ܶ") ^ i33;
                                            i34 = ((m69818 ^ i32) * (-309)) ^ 341716495;
                                            i35 = -191546693;
                                        }
                                }
                                return;
                            }
                        }
                    };
                    int m69818 = C2105.m6981("ܺ᩹") ^ i17;
                    c97623 = c97628;
                    i19 = ((m69818 ^ i18) * 16221) ^ (-2064485284);
                    i20 = m69818 ^ 265697526;
                    c97622 = c97627;
                case -473942874:
                case -119838708:
                    if (C7811.f24123 < 0) {
                        m25662 = (C2105.m6981("֫ۧ") ^ i17) * 95;
                        i9 = ((m25662 ^ i18) * (-22421)) ^ 1734518987;
                        i10 = -826273887;
                        i20 = m25662 ^ i10;
                        i19 = i9;
                    } else {
                        i = i15;
                        c9762 = c97623;
                        sArr = sArr12;
                        sArr2 = sArr8;
                        i2 = i28;
                        sArr3 = sArr10;
                        int m6981622 = (C2105.m6981("֨ۤ") + i17) * (-119);
                        i20 = m6981622 ^ (-1093587989);
                        i19 = ((m6981622 ^ i18) * 24413) ^ 1915847251;
                        sArr10 = sArr3;
                        sArr12 = sArr;
                        c97623 = c9762;
                        i28 = i2;
                        sArr8 = sArr2;
                        i15 = i;
                    }
                case -203553011:
                case 1544692900:
                    c9762 = c97623;
                    sArr = sArr12;
                    short[] sArr18 = sArr10;
                    sArr4 = sArr11;
                    int i31 = i15;
                    sArr2 = sArr8;
                    i2 = i28;
                    sArr3 = sArr18;
                    i = i31;
                    sArr5 = sArr9;
                    i25 = C0630.m2566(C2105.m6988(sArr5, 4, 3, i21));
                    i26 = 2100300403;
                    int m25664 = (C0630.m2566("ۧۧ") + i18) * (-85);
                    i4 = ((m25664 ^ i17) * (-22255)) ^ (-312986351);
                    i20 = m25664 ^ (-1598269737);
                    i19 = i4;
                    sArr9 = sArr5;
                    sArr11 = sArr4;
                    sArr10 = sArr3;
                    sArr12 = sArr;
                    c97623 = c9762;
                    i28 = i2;
                    sArr8 = sArr2;
                    i15 = i;
                case -170286541:
                case 761318738:
                    i = i15;
                    c9762 = c97623;
                    sArr = sArr12;
                    sArr2 = sArr8;
                    i2 = i28;
                    sArr3 = sArr10;
                    sArr4 = sArr11;
                    sArr5 = sArr9;
                    s = f51008[0];
                    i14 = s * s;
                    if (C4159.m12565() < 0) {
                        m2566 = (C0630.m2566("ۖܶ") + i18) * 11;
                        i19 = ((m2566 ^ i17) * 8599) ^ (-1737964448);
                        i3 = -223478449;
                        i20 = m2566 ^ i3;
                        activityC16608 = this;
                        sArr9 = sArr5;
                        sArr11 = sArr4;
                        sArr10 = sArr3;
                        sArr12 = sArr;
                        c97623 = c9762;
                        i28 = i2;
                        sArr8 = sArr2;
                        i15 = i;
                    }
                    m2566 = (C2105.m6981("ܿۧ") + i18) * (-81);
                    i19 = ((m2566 ^ i17) * 1347) ^ 249762972;
                    i3 = 2084711930;
                    i20 = m2566 ^ i3;
                    activityC16608 = this;
                    sArr9 = sArr5;
                    sArr11 = sArr4;
                    sArr10 = sArr3;
                    sArr12 = sArr;
                    c97623 = c9762;
                    i28 = i2;
                    sArr8 = sArr2;
                    i15 = i;
                case -162804448:
                case 1471508560:
                    callback = C0964.m3409(activityC16608, C2105.m6981(C2272.m7507(sArr11, i24, 3, i21)) ^ 2126310774);
                    m25662 = C0630.m2566("ܿ֨") ^ i18;
                    i9 = ((m25662 ^ i17) * 14133) ^ 239880133;
                    i10 = 1822267723;
                    i20 = m25662 ^ i10;
                    i19 = i9;
                case 161802712:
                case 1929559801:
                    if (C0422.m1963()) {
                        sArr6 = sArr8;
                        i2 = i28;
                        c9762 = c97623;
                        sArr = sArr12;
                        sArr3 = sArr10;
                        sArr4 = sArr11;
                        sArr5 = sArr9;
                        int m698142 = (C2105.m6981("֫֫") ^ i18) * 55;
                        int i292 = ((m698142 ^ i17) * (-18071)) ^ (-1889778363);
                        i20 = m698142 ^ (-346828355);
                        activityC16608 = this;
                        sArr9 = sArr5;
                        sArr11 = sArr4;
                        sArr10 = sArr3;
                        i28 = i2;
                        sArr8 = sArr6;
                        i19 = i292;
                        sArr12 = sArr;
                        c97623 = c9762;
                    } else {
                        i = i15;
                        c9762 = c97623;
                        sArr = sArr12;
                        sArr2 = sArr8;
                        i2 = i28;
                        sArr3 = sArr10;
                        sArr4 = sArr11;
                        sArr5 = sArr9;
                        m2566 = (C2105.m6981("ܿۧ") + i18) * (-81);
                        i19 = ((m2566 ^ i17) * 1347) ^ 249762972;
                        i3 = 2084711930;
                        i20 = m2566 ^ i3;
                        activityC16608 = this;
                        sArr9 = sArr5;
                        sArr11 = sArr4;
                        sArr10 = sArr3;
                        sArr12 = sArr;
                        c97623 = c9762;
                        i28 = i2;
                        sArr8 = sArr2;
                        i15 = i;
                    }
                case 390162324:
                case 2096000281:
                    i = i15;
                    c9762 = c97623;
                    sArr = sArr12;
                    sArr2 = sArr8;
                    i2 = i28;
                    sArr3 = sArr10;
                    sArr4 = sArr11;
                    sArr5 = sArr9;
                    super.onCreate(bundle);
                    m10214();
                    str = C3663.m11162(f51008, 1, 3, i21);
                    if (C7106.m19120() <= 0) {
                        sArr6 = sArr2;
                        i15 = i;
                        int m6981422 = (C2105.m6981("֫֫") ^ i18) * 55;
                        int i2922 = ((m6981422 ^ i17) * (-18071)) ^ (-1889778363);
                        i20 = m6981422 ^ (-346828355);
                        activityC16608 = this;
                        sArr9 = sArr5;
                        sArr11 = sArr4;
                        sArr10 = sArr3;
                        i28 = i2;
                        sArr8 = sArr6;
                        i19 = i2922;
                        sArr12 = sArr;
                        c97623 = c9762;
                    } else {
                        m2566 = C0630.m2566("֡֡") ^ i18;
                        i19 = ((m2566 ^ i17) * 17087) ^ (-1957301063);
                        i3 = 1771668466;
                        i20 = m2566 ^ i3;
                        activityC16608 = this;
                        sArr9 = sArr5;
                        sArr11 = sArr4;
                        sArr10 = sArr3;
                        sArr12 = sArr;
                        c97623 = c9762;
                        i28 = i2;
                        sArr8 = sArr2;
                        i15 = i;
                    }
                case 799272870:
                case 1087698478:
                    i12 = C2105.m6981(C0483.m2128(f51008, 19, 3, i21));
                    i13 = 2102697280;
                    if (AbstractC2021.f6743 <= 0) {
                        i = i15;
                        c9762 = c97623;
                        sArr = sArr12;
                        sArr2 = sArr8;
                        i2 = i28;
                        sArr3 = sArr10;
                        sArr4 = sArr11;
                        sArr5 = sArr9;
                        m2566 = (C2105.m6981("ܿۧ") + i18) * (-81);
                        i19 = ((m2566 ^ i17) * 1347) ^ 249762972;
                        i3 = 2084711930;
                        i20 = m2566 ^ i3;
                        activityC16608 = this;
                        sArr9 = sArr5;
                        sArr11 = sArr4;
                        sArr10 = sArr3;
                        sArr12 = sArr;
                        c97623 = c9762;
                        i28 = i2;
                        sArr8 = sArr2;
                        i15 = i;
                    } else {
                        m25662 = (C0630.m2566("ۡܽ") ^ i17) * (-81);
                        i9 = ((m25662 ^ i18) * 12553) ^ (-455760032);
                        i10 = -1157215185;
                        i20 = m25662 ^ i10;
                        i19 = i9;
                    }
                case 1035637733:
                case 1810582995:
                    i = i15;
                    c9762 = c97623;
                    sArr = sArr12;
                    sArr2 = sArr8;
                    i2 = i28;
                    sArr3 = sArr10;
                    sArr4 = sArr11;
                    C0964.m3409(activityC16608, C0630.m2566(str) ^ 2103036086);
                    sArr9 = f51008;
                    if (C5695.f17556 < 0) {
                        int m25665 = C0630.m2566("ۡܶ") ^ i17;
                        i20 = m25665 ^ (-2059111177);
                        i19 = ((m25665 ^ i18) * (-27501)) ^ (-663943483);
                        sArr11 = sArr4;
                        sArr10 = sArr3;
                        sArr12 = sArr;
                        c97623 = c9762;
                        i28 = i2;
                        sArr8 = sArr2;
                        i15 = i;
                    }
                    sArr11 = sArr4;
                    int m69816222 = (C2105.m6981("֨ۤ") + i17) * (-119);
                    i20 = m69816222 ^ (-1093587989);
                    i19 = ((m69816222 ^ i18) * 24413) ^ 1915847251;
                    sArr10 = sArr3;
                    sArr12 = sArr;
                    c97623 = c9762;
                    i28 = i2;
                    sArr8 = sArr2;
                    i15 = i;
                case 1822779698:
                case 2140028719:
                    C9762 c97629 = c97623;
                    short[] sArr19 = sArr12;
                    short[] sArr20 = sArr10;
                    short[] sArr21 = sArr11;
                    short[] sArr22 = sArr8;
                    int i32 = i15;
                    view2 = C0964.m3409(activityC16608, C0630.m2566(RunnableC3474.m10633(sArr22, i32, 3, i21)) ^ 2124106029);
                    int m69819 = C2105.m6981("ܶ֡") ^ i18;
                    i20 = m69819 ^ 62491855;
                    i19 = ((m69819 ^ i17) * 843) ^ 721033795;
                    sArr12 = sArr19;
                    c97623 = c97629;
                    i15 = i32;
                    sArr11 = sArr21;
                    sArr10 = sArr20;
                    i28 = i28;
                    sArr8 = sArr22;
                default:
                    i = i15;
                    c9762 = c97623;
                    sArr = sArr12;
                    sArr2 = sArr8;
                    i2 = i28;
                    sArr3 = sArr10;
                    sArr4 = sArr11;
                    sArr5 = sArr9;
                    i21 = 61347;
                    m2566 = (C0630.m2566("ܺ֫") + i17) * (-33);
                    i19 = ((m2566 ^ i18) * (-21209)) ^ (-1097215809);
                    i3 = -319081251;
                    i20 = m2566 ^ i3;
                    activityC16608 = this;
                    sArr9 = sArr5;
                    sArr11 = sArr4;
                    sArr10 = sArr3;
                    sArr12 = sArr;
                    c97623 = c9762;
                    i28 = i2;
                    sArr8 = sArr2;
                    i15 = i;
            }
            return;
        }
    }

    public ActivityC16608() {
        ArrayList arrayList = null;
        int i = -1484273613;
        int i2 = C4263.f13799;
        int i3 = C1420.f5096;
        int m6981 = C2105.m6981("ۙܿ") ^ i3;
        int i4 = ((m6981 ^ i2) * 23183) ^ (-310475614);
        int i5 = 519324479;
        while (true) {
            i = ((((i ^ i2) * (-317)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2056087493:
                case -1572118530:
                    RunnableC0588.m2441();
                    if (C0237.f1507 != 0) {
                        m6981 = C2105.m6981("᩵ۡ") ^ i3;
                        i4 = ((m6981 ^ i2) * 29393) ^ 1033604369;
                        i5 = -1846481088;
                    } else {
                        m6981 = (i2 - C0630.m2566("᩵ܰ")) * 3;
                        i4 = ((m6981 ^ i3) * 26945) ^ 168947489;
                        i5 = -707024875;
                    }
                case -1952588530:
                case 187085170:
                    if (C3019.f9544 >= 0) {
                        m6981 = C2105.m6981("ᩳۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-22925)) ^ 894374391;
                        i5 = 1357536296;
                    } else {
                        m6981 = C2105.m6981("۠ۢ") ^ i2;
                        i4 = ((m6981 ^ i3) * 32339) ^ 1409379286;
                        i5 = -1691656463;
                    }
                case -1808974747:
                case 1070275181:
                    this.f51012 = arrayList;
                    return;
                case -1641568156:
                case -1544171587:
                    if (C3663.f11553) {
                        m6981 = (i2 - C0630.m2566("᩵ܰ")) * 3;
                        i4 = ((m6981 ^ i3) * 26945) ^ 168947489;
                        i5 = -707024875;
                    } else {
                        m6981 = C2105.m6981("ۘ᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * 19927) ^ (-1848209688);
                        i5 = -1630531462;
                    }
                case -1501948428:
                case 717050928:
                    if (C1128.f4106 <= 0) {
                        m6981 = (C0630.m2566("ۡۤ") + i2) * 109;
                        i4 = ((m6981 ^ i3) * (-31155)) ^ 273419015;
                        i5 = 1046098963;
                    } else {
                        m6981 = C0630.m2566("ᩴ᩺") ^ i2;
                        i4 = ((m6981 ^ i3) * (-6723)) ^ 1664531310;
                        i5 = 607543990;
                    }
                case -1433610292:
                case -1361214550:
                    if (C1916.f6442) {
                        m6981 = C0630.m2566("֡ۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-23601)) ^ (-1697477830);
                        i5 = -933776388;
                    } else {
                        m6981 = C2105.m6981("᩵ۡ") ^ i3;
                        i4 = ((m6981 ^ i2) * 29393) ^ 1033604369;
                        i5 = -1846481088;
                    }
                case -1351111717:
                case 1271163799:
                    if (C4263.m12819() >= 0) {
                        m6981 = (i2 - C0630.m2566("᩵ܰ")) * 3;
                        i4 = ((m6981 ^ i3) * 26945) ^ 168947489;
                        i5 = -707024875;
                    } else {
                        m6981 = C2105.m6981("ۤ۠") ^ i3;
                        i4 = ((m6981 ^ i2) * 2695) ^ (-1511574841);
                        i5 = 759727860;
                    }
                case -1162311047:
                case -768012328:
                    C0237.m1481();
                    C2958.m9034();
                    throw new RuntimeException();
                case -100771324:
                case 1975612668:
                    C1047.m3599();
                    if (C21923.f70183 == 0) {
                        m6981 = C2105.m6981("᩵ۡ") ^ i3;
                        i4 = ((m6981 ^ i2) * 29393) ^ 1033604369;
                        i5 = -1846481088;
                    } else {
                        m6981 = C2105.m6981("ᩳۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-22925)) ^ 894374391;
                        i5 = 1357536296;
                    }
                case 233727652:
                case 275318040:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = C2105.m6981("ᩳۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-22925)) ^ 894374391;
                        i5 = 1357536296;
                    } else {
                        m6981 = (C0630.m2566("۬ᩳ") ^ i2) * (-29);
                        i4 = ((m6981 ^ i3) * (-3107)) ^ 983119884;
                        i5 = 1022392876;
                    }
                case 340456672:
                case 1221681522:
                    C4117.m12364();
                    C1916.m6308();
                    m6981 = C2105.m6981("᩵ۡ") ^ i3;
                    i4 = ((m6981 ^ i2) * 29393) ^ 1033604369;
                    i5 = -1846481088;
                case 656387305:
                case 1564361517:
                    arrayList = new ArrayList();
                    if (C0050.f910 >= 0) {
                        m6981 = C2105.m6981("ᩳۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-22925)) ^ 894374391;
                        i5 = 1357536296;
                    } else {
                        m6981 = C0630.m2566("ᩴ֨") ^ i2;
                        i4 = ((m6981 ^ i3) * 4045) ^ (-1967906467);
                        i5 = 423318676;
                    }
                case 761545736:
                case 772368445:
                    if (C1128.f4106 <= 0) {
                        m6981 = C2105.m6981("᩵ۡ") ^ i3;
                        i4 = ((m6981 ^ i2) * 29393) ^ 1033604369;
                        i5 = -1846481088;
                    } else {
                        m6981 = (C2105.m6981("ۤۤ") + i3) * 39;
                        i4 = ((m6981 ^ i2) * (-5355)) ^ (-688079059);
                        i5 = -134429519;
                    }
                case 764147841:
                case 1988157880:
                    if (C0798.f2919) {
                        m6981 = (C0630.m2566("ۡۤ") + i2) * 109;
                        i4 = ((m6981 ^ i3) * (-31155)) ^ 273419015;
                        i5 = 1046098963;
                    } else {
                        m6981 = (C2105.m6981("ۚۜ") + i3) * (-47);
                        i4 = ((m6981 ^ i2) * (-8681)) ^ (-690989766);
                        i5 = -1303218981;
                    }
                case 1580499931:
                case 1689604036:
                    C7106.m19120();
                    if (C2126.f7087) {
                        m6981 = C0630.m2566("ᩴᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 3291) ^ 1992841492;
                        i5 = -511522283;
                    } else {
                        m6981 = (i2 - C0630.m2566("᩵ܰ")) * 3;
                        i4 = ((m6981 ^ i3) * 26945) ^ 168947489;
                        i5 = -707024875;
                    }
                default:
                    if (C1916.f6442) {
                        m6981 = C0630.m2566("۠ۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 22535) ^ 1777127129;
                        i5 = 1769427875;
                    } else {
                        m6981 = (C0630.m2566("ۡۤ") + i2) * 109;
                        i4 = ((m6981 ^ i3) * (-31155)) ^ 273419015;
                        i5 = 1046098963;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39104(ActivityC16608 activityC16608, Runnable runnable) {
        int i = 980747695;
        int i2 = C3746.f11829;
        int i3 = C5695.f17556;
        int m6981 = (C2105.m6981("۬᩵") + i2) * 59;
        int i4 = ((m6981 ^ i3) * 28423) ^ (-853204055);
        int i5 = 100774090;
        while (true) {
            i = ((((i ^ i3) * (-10599)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2137165719:
                case 1797952287:
                    if (C0422.m1963()) {
                        m6981 = (i2 - C2105.m6981("ᩳ᩵")) * (-59);
                        i4 = ((m6981 ^ i3) * 29043) ^ (-1458421379);
                        i5 = -161687344;
                    } else {
                        m6981 = (i2 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m6981 ^ i3) * 4883) ^ 2066521431;
                        i5 = 1319335229;
                    }
                case -2001479201:
                case 1683950675:
                    if (C0964.f3626 != 0) {
                        m6981 = (i2 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m6981 ^ i3) * 4883) ^ 2066521431;
                        i5 = 1319335229;
                    } else {
                        m6981 = C2105.m6981("ܶܶ") ^ i3;
                        i4 = ((m6981 ^ i2) * 537) ^ (-760377072);
                        i5 = -1091711805;
                    }
                case -1955341851:
                case 1582631856:
                    if (C1504.m5179()) {
                        m6981 = C2105.m6981("ܳ۟") ^ i2;
                        i4 = ((m6981 ^ i3) * (-29341)) ^ 689469295;
                        i5 = -608113936;
                    } else {
                        m6981 = C0630.m2566("ۧۙ") ^ i2;
                        i4 = ((m6981 ^ i3) * 9555) ^ (-1883425471);
                        i5 = -1887471012;
                    }
                case -1355905754:
                case 938912393:
                    ViewOnClickListenerC1958.m6434(activityC16608.f51013);
                    break;
                case -1303713520:
                case 343195490:
                    if (C3537.f11231 >= 0) {
                        m6981 = C2105.m6981("ܳ۟") ^ i2;
                        i4 = ((m6981 ^ i3) * (-29341)) ^ 689469295;
                        i5 = -608113936;
                    } else {
                        m6981 = (C2105.m6981("ۨۘ") + i2) * (-37);
                        i4 = ((m6981 ^ i3) * 18219) ^ 117390764;
                        i5 = -1429515800;
                    }
                case -1294558544:
                case -191324983:
                    if (RunnableC3474.f10992 > 0) {
                        m6981 = C2105.m6981("ܳ۟") ^ i2;
                        i4 = ((m6981 ^ i3) * (-29341)) ^ 689469295;
                        i5 = -608113936;
                    } else {
                        m6981 = C2105.m6981("ܺ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * (-32505)) ^ (-1382611977);
                        i5 = 1715733454;
                    }
                case -1200783350:
                case -374935957:
                    C0422.m1963();
                    break;
                case -1158440161:
                case -930410710:
                    if (C0630.f2410 <= 0) {
                        m6981 = (i2 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m6981 ^ i3) * 4883) ^ 2066521431;
                        i5 = 1319335229;
                    } else {
                        m6981 = (C0630.m2566("᩶ۙ") ^ i3) * 93;
                        i4 = ((m6981 ^ i2) * (-29437)) ^ (-272388972);
                        i5 = 808141211;
                    }
                case -1122417639:
                case 1730210316:
                    C1128.m3851();
                    if (C2126.f7087) {
                        m6981 = C0630.m2566("۠ᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * 25635) ^ (-1744040909);
                        i5 = 61664765;
                    } else {
                        m6981 = C0630.m2566("ۧۙ") ^ i2;
                        i4 = ((m6981 ^ i3) * 9555) ^ (-1883425471);
                        i5 = -1887471012;
                    }
                case -809404824:
                case 466008255:
                    if (C2105.f7037 != 0) {
                        m6981 = C2105.m6981("ܳ۟") ^ i2;
                        i4 = ((m6981 ^ i3) * (-29341)) ^ 689469295;
                        i5 = -608113936;
                    } else {
                        m6981 = C0630.m2566("ۜܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 10663) ^ (-746639390);
                        i5 = -2116468734;
                    }
                case -625537282:
                case 64409363:
                    if (C1420.m4913()) {
                        m6981 = C0630.m2566("۠ᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * 25635) ^ (-1744040909);
                        i5 = 61664765;
                    } else {
                        m6981 = (C0630.m2566("ܶܺ") + i2) * 21;
                        i4 = ((m6981 ^ i3) * (-17359)) ^ 1498128788;
                        i5 = 2025523188;
                    }
                case -534759944:
                case 2104462662:
                    if (C1005.m3501()) {
                        m6981 = (C0630.m2566("᩷ۨ") + i3) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((m6981 ^ i2) * 5687) ^ 1731814726;
                        i5 = 1753033947;
                    } else {
                        m6981 = (i2 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m6981 ^ i3) * 4883) ^ 2066521431;
                        i5 = 1319335229;
                    }
                case -291823042:
                case 955284543:
                    C0422.m1963();
                    m6981 = C0630.m2566("ۧۙ") ^ i2;
                    i4 = ((m6981 ^ i3) * 9555) ^ (-1883425471);
                    i5 = -1887471012;
                case 102717030:
                case 1406798420:
                    if (C0714.f2697 >= 0) {
                        m6981 = (i2 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m6981 ^ i3) * 4883) ^ 2066521431;
                        i5 = 1319335229;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܺ᩷")) * (-97);
                        i4 = ((m6981 ^ i2) * 20335) ^ 2052073147;
                        i5 = 1968257913;
                    }
                case 392097577:
                case 1124529367:
                    C0798.m3012(runnable);
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = (i2 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m6981 ^ i3) * 4883) ^ 2066521431;
                        i5 = 1319335229;
                    } else {
                        m6981 = (C0630.m2566("۬ۜ") + i3) * (-11);
                        i4 = ((m6981 ^ i2) * 24903) ^ (-243400651);
                        i5 = -110185734;
                    }
                default:
                    if (C3746.f11829 <= 0) {
                        m6981 = (i2 - C0630.m2566("ۘۖ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m6981 ^ i3) * 4883) ^ 2066521431;
                        i5 = 1319335229;
                    } else {
                        m6981 = (i2 - C2105.m6981("֨᩷")) * 51;
                        i4 = ((m6981 ^ i3) * (-15227)) ^ 74439735;
                        i5 = 5168164;
                    }
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        int i = -122913659;
        int i2 = C1294.f4556;
        int i3 = RunnableC0588.f2309;
        int m6981 = (C2105.m6981("ۡ᩵") + i3) * 35;
        int i4 = ((m6981 ^ i2) * 6259) ^ 1946444069;
        int i5 = -1699710271;
        while (true) {
            i = ((((i ^ i2) * 26797) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2126518213:
                case 1228689332:
                    if (C22628.f73083 <= 0) {
                        m6981 = (i3 - C2105.m6981("ۗ֫")) * 5;
                        i4 = ((m6981 ^ i2) * (-20883)) ^ (-126974488);
                        i5 = -310619254;
                    } else {
                        m6981 = C2105.m6981("᩺ۙ") ^ i2;
                        i4 = ((m6981 ^ i3) * 1047) ^ (-1888304004);
                        i5 = 2133975009;
                    }
                case -1917802776:
                case -598155636:
                    if (C2520.f8000 >= 0) {
                        m6981 = (i2 - C0630.m2566("᩷᩻")) * (-3);
                        i4 = ((m6981 ^ i3) * (-16751)) ^ (-2985677);
                        i5 = -993846916;
                    } else {
                        m6981 = (C2105.m6981("ܰۛ") + i3) * (-57);
                        i4 = ((m6981 ^ i2) * (-14531)) ^ (-369247942);
                        i5 = -1342557472;
                    }
                case -1844566582:
                case 799171468:
                    if (C3746.f11829 <= 0) {
                        m6981 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 32251) ^ 1351948477;
                        i5 = 2145753707;
                    } else {
                        m6981 = (i3 - C0630.m2566("۬ۤ")) * 115;
                        i4 = ((m6981 ^ i2) * 18427) ^ (-1826657368);
                        i5 = -631373695;
                    }
                case -1759199160:
                case 1315470763:
                    super.onResume();
                    if (C1504.f5354) {
                        m6981 = (i2 - C0630.m2566("᩷᩻")) * (-3);
                        i4 = ((m6981 ^ i3) * (-16751)) ^ (-2985677);
                        i5 = -993846916;
                    } else {
                        m6981 = C2105.m6981("ۙ᩺") ^ i2;
                        i4 = ((m6981 ^ i3) * (-10451)) ^ 514202727;
                        i5 = -2136327322;
                    }
                case -1692676941:
                case 839606271:
                    if (C22628.m50615() != 0) {
                        m6981 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 32251) ^ 1351948477;
                        i5 = 2145753707;
                    } else {
                        m6981 = (C0630.m2566("֫ܳ") + i2) * (-117);
                        i4 = ((m6981 ^ i3) * (-5439)) ^ 1935342618;
                        i5 = -1929281351;
                    }
                case -1185356384:
                case 908907351:
                    if (C4159.f13567) {
                        m6981 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 32251) ^ 1351948477;
                        i5 = 2145753707;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۗ֫")) * 5;
                        i4 = ((m6981 ^ i2) * (-20883)) ^ (-126974488);
                        i5 = -310619254;
                    }
                case -1175019906:
                case 2139983922:
                    if (C0237.m1481() >= 0) {
                        m6981 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 32251) ^ 1351948477;
                        i5 = 2145753707;
                    } else {
                        m6981 = (i2 - C0630.m2566("۬ᩳ")) * (-61);
                        i4 = ((m6981 ^ i3) * (-12865)) ^ (-817750457);
                        i5 = 2133011477;
                    }
                case -1157690981:
                case 1851174189:
                    if (C7811.m20844() != 0) {
                        m6981 = (i2 - C0630.m2566("᩷᩻")) * (-3);
                        i4 = ((m6981 ^ i3) * (-16751)) ^ (-2985677);
                        i5 = -993846916;
                    } else {
                        m6981 = (C2105.m6981("ۘ֨") + i3) * 115;
                        i4 = ((m6981 ^ i2) * (-25983)) ^ 87687018;
                        i5 = -1788663181;
                    }
                case -868800348:
                case 1386915863:
                    mo1502();
                    m6981 = C2105.m6981("ۘۢ") ^ i3;
                    i4 = ((m6981 ^ i2) * (-24309)) ^ 385894086;
                    i5 = 218974703;
                case -801484203:
                case -299222460:
                    if (C0050.f910 >= 0) {
                        m6981 = (i3 - C2105.m6981("ۗ֫")) * 5;
                        i4 = ((m6981 ^ i2) * (-20883)) ^ (-126974488);
                        i5 = -310619254;
                    } else {
                        m6981 = C2105.m6981("֡᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * 25523) ^ 1044541221;
                        i5 = 48298987;
                    }
                case -716315467:
                case 1315488461:
                    C1916.m6308();
                    m6981 = C0630.m2566("ܰۙ") ^ i3;
                    i4 = ((m6981 ^ i2) * 32251) ^ 1351948477;
                    i5 = 2145753707;
                case -509850813:
                case 872753785:
                    if (C1916.f6442) {
                        m6981 = C0630.m2566("۟᩻") ^ i3;
                        i4 = ((m6981 ^ i2) * (-20287)) ^ (-2122266761);
                        i5 = 415561960;
                    } else {
                        m6981 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 32251) ^ 1351948477;
                        i5 = 2145753707;
                    }
                case -443247995:
                case 424336406:
                    if (f51007) {
                        m6981 = C2105.m6981("᩵ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-20071)) ^ 1021098442;
                        i5 = -39770791;
                    } else {
                        m6981 = C2105.m6981("ۘۢ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-24309)) ^ 385894086;
                        i5 = 218974703;
                    }
                case -434208659:
                case 1836077519:
                    C0964.m3413();
                    break;
                case -325325203:
                case -17447335:
                    C4075.m12263();
                    if (C0964.f3626 != 0) {
                        m6981 = C2105.m6981("ܽ᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * (-10315)) ^ 1236722958;
                        i5 = -513765828;
                    } else {
                        m6981 = (C0630.m2566("ܰ֡") + i2) * (-89);
                        i4 = ((m6981 ^ i3) * 15793) ^ 396501548;
                        i5 = 634047941;
                    }
                case -242328012:
                case 197054838:
                    if (C7811.m20844() != 0) {
                        m6981 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 32251) ^ 1351948477;
                        i5 = 2145753707;
                    } else {
                        m6981 = (C2105.m6981("۟᩷") + i2) * (-115);
                        i4 = ((m6981 ^ i3) * (-21179)) ^ (-2134980418);
                        i5 = -464150948;
                    }
                case -86943530:
                case 6550017:
                    if (C11340.f33930 >= 0) {
                        m6981 = C0630.m2566("ܰۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 32251) ^ 1351948477;
                        i5 = 2145753707;
                    } else {
                        m6981 = C2105.m6981("ܽ᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * (-10315)) ^ 1236722958;
                        i5 = -513765828;
                    }
            }
            return;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m39111(String str) {
        ArrayList arrayList = null;
        int i = 0;
        C19099 c19099 = null;
        int i2 = -321968053;
        int i3 = C4263.f13799;
        int i4 = AbstractC2021.f6743;
        int m6981 = (i4 - C2105.m6981("᩵ۚ")) * 7;
        int i5 = ((m6981 ^ i3) * (-4017)) ^ 1497594208;
        int i6 = -1965946038;
        while (true) {
            i2 = ((((i2 ^ i3) * (-5991)) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -2131707467:
                case -779928341:
                    if (C0798.f2919) {
                        m6981 = (C2105.m6981("֡ۧ") + i4) * 51;
                        i5 = ((m6981 ^ i3) * 24153) ^ 1210117597;
                        i6 = 1418602021;
                    } else {
                        m6981 = (i4 - C0630.m2566("ۗۜ")) * (-45);
                        i5 = ((m6981 ^ i3) * (-22581)) ^ 847857550;
                        i6 = -66186478;
                    }
                case -2121423375:
                case 1103591479:
                    if (C4159.f13567) {
                        m6981 = (i4 - C0630.m2566("ۛ᩷")) * (-79);
                        i5 = ((m6981 ^ i3) * (-13939)) ^ 1867251262;
                        i6 = 230162177;
                    } else {
                        m6981 = (C0630.m2566("ۙᩴ") + i4) * (-99);
                        i5 = ((m6981 ^ i3) * 1609) ^ 693937472;
                        i6 = -77686861;
                    }
                case -2074829654:
                case 1738963978:
                    if (C3537.f11231 >= 0) {
                        m6981 = (C2105.m6981("ۘ᩻") ^ i3) * 81;
                        i5 = ((m6981 ^ i4) * 7755) ^ 1800997795;
                        i6 = -1295206733;
                    } else {
                        m6981 = (C2105.m6981("ۗ᩷") ^ i3) * 109;
                        i5 = ((m6981 ^ i4) * (-18675)) ^ 498488208;
                        i6 = 955853613;
                    }
                case -1877382495:
                case -1021686552:
                    if (C3663.f11553) {
                        m6981 = (i3 - C0630.m2566("ۧۘ")) * 51;
                        i5 = ((m6981 ^ i4) * (-153)) ^ (-1414973656);
                        i6 = -728662930;
                    } else {
                        m6981 = C2105.m6981("᩹ۨ") ^ i4;
                        i5 = ((m6981 ^ i3) * 16717) ^ (-251871076);
                        i6 = 2068159416;
                    }
                case -1812216563:
                case -451391562:
                    c19099 = (C19099) C3537.m10755(arrayList, i);
                    if (C1294.f4556 >= 0) {
                        m6981 = (C2105.m6981("ۘ᩻") ^ i3) * 81;
                        i5 = ((m6981 ^ i4) * 7755) ^ 1800997795;
                        i6 = -1295206733;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۤܺ")) * (-39);
                        i5 = ((m6981 ^ i4) * (-31787)) ^ (-1818772174);
                        i6 = -447148738;
                    }
                case -1631193959:
                case -1122726485:
                    i = 0;
                    m6981 = C2105.m6981("᩶ܽ") ^ i4;
                    i5 = ((m6981 ^ i3) * 13279) ^ 667731122;
                    i6 = 677513173;
                case -1360036413:
                case 597136456:
                    if (C1005.f3721) {
                        m6981 = (C0630.m2566("ۙᩴ") + i4) * (-99);
                        i5 = ((m6981 ^ i3) * 1609) ^ 693937472;
                        i6 = -77686861;
                    } else {
                        m6981 = (C2105.m6981("֡ۧ") + i4) * 51;
                        i5 = ((m6981 ^ i3) * 24153) ^ 1210117597;
                        i6 = 1418602021;
                    }
                case -1163835077:
                case 982394889:
                    C2520.m8026();
                    C21923.m49329();
                    m6981 = (C2105.m6981("֡ۧ") + i4) * 51;
                    i5 = ((m6981 ^ i3) * 24153) ^ 1210117597;
                    i6 = 1418602021;
                case -1102266927:
                case -3088471:
                    return -1;
                case -733920200:
                case 1922615454:
                    if (C2105.f7037 != 0) {
                        m6981 = (C2105.m6981("֡ۧ") + i4) * 51;
                        i5 = ((m6981 ^ i3) * 24153) ^ 1210117597;
                        i6 = 1418602021;
                    } else {
                        m6981 = C0630.m2566("ᩳ۟") ^ i3;
                        i5 = ((m6981 ^ i4) * (-1377)) ^ (-404578384);
                        i6 = -1538885307;
                    }
                case -625723237:
                case 1276152150:
                    if (C0382.f1805) {
                        m6981 = C2105.m6981("۠ܶ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-26873)) ^ (-428334227);
                        i6 = 952700857;
                    } else {
                        m6981 = (C0630.m2566("ۙᩴ") + i4) * (-99);
                        i5 = ((m6981 ^ i3) * 1609) ^ 693937472;
                        i6 = -77686861;
                    }
                case -481406276:
                case 260340827:
                    if (ViewOnClickListenerC1958.m6437(str, C2126.m7033(c19099))) {
                        m6981 = C2105.m6981("ܰ᩵") ^ i3;
                        i5 = ((m6981 ^ i4) * 2335) ^ (-621965027);
                        i6 = 1884046562;
                    } else {
                        m6981 = C2105.m6981("ۜ۠") ^ i4;
                        i5 = ((m6981 ^ i3) * (-15727)) ^ (-1303355680);
                        i6 = -376766650;
                    }
                case -280999178:
                case 1888552351:
                    if (C0964.f3626 != 0) {
                        m6981 = (i3 - C0630.m2566("ۧۘ")) * 51;
                        i5 = ((m6981 ^ i4) * (-153)) ^ (-1414973656);
                        i6 = -728662930;
                    } else {
                        m6981 = (C0630.m2566("ۤ۠") + i4) * 83;
                        i5 = ((m6981 ^ i3) * 17617) ^ 1749346869;
                        i6 = 2117238695;
                    }
                case -36271876:
                case 770453428:
                    if (C2167.f7158 >= 0) {
                        m6981 = (i4 - C0630.m2566("ۗۜ")) * (-45);
                        i5 = ((m6981 ^ i3) * (-22581)) ^ 847857550;
                        i6 = -66186478;
                    } else {
                        m6981 = C2105.m6981("ۨۘ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-27887)) ^ 1066675810;
                        i6 = -618873042;
                    }
                case 211155655:
                case 1990610497:
                    if (C4159.m12565() >= 0) {
                        m6981 = (i4 - C0630.m2566("ۗۜ")) * (-45);
                        i5 = ((m6981 ^ i3) * (-22581)) ^ 847857550;
                        i6 = -66186478;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۜܽ")) * (-13);
                        i5 = ((m6981 ^ i4) * (-10069)) ^ (-1137662832);
                        i6 = -364273970;
                    }
                case 277912654:
                case 562544088:
                    C0422.m1963();
                    AbstractC2021.m6574();
                    return 0;
                case 562371552:
                case 941970216:
                    C1005.m3501();
                    if (C3663.f11553) {
                        m6981 = (i3 - C0630.m2566("ۧۘ")) * 51;
                        i5 = ((m6981 ^ i4) * (-153)) ^ (-1414973656);
                        i6 = -728662930;
                    } else {
                        m6981 = (C2105.m6981("֡ۧ") + i4) * 51;
                        i5 = ((m6981 ^ i3) * 24153) ^ 1210117597;
                        i6 = 1418602021;
                    }
                case 1003093568:
                case 1141937295:
                    return i;
                case 1630567610:
                case 1937254821:
                    if (C0050.f910 >= 0) {
                        m6981 = (i4 - C0630.m2566("ۗۜ")) * (-45);
                        i5 = ((m6981 ^ i3) * (-22581)) ^ 847857550;
                        i6 = -66186478;
                    } else {
                        m6981 = (C2105.m6981("ۤۢ") + i4) * 59;
                        i5 = ((m6981 ^ i3) * 30997) ^ 2035617865;
                        i6 = -1203332084;
                    }
                case 2068109879:
                case 2127279057:
                    arrayList = this.f51012;
                    if (i < C0382.m1847(arrayList)) {
                        m6981 = (C0630.m2566("᩶ۡ") + i4) * 19;
                        i5 = ((m6981 ^ i3) * 22063) ^ 1187788325;
                        i6 = -1946270372;
                    } else {
                        m6981 = C2105.m6981("۟ۖ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-31279)) ^ 493730884;
                        i6 = -880005802;
                    }
                default:
                    i++;
                    m6981 = C2105.m6981("᩶ܽ") ^ i4;
                    i5 = ((m6981 ^ i3) * 13279) ^ 667731122;
                    i6 = 677513173;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m39108(final ActivityC16608 activityC16608, final int i, final RunnableC0111 runnableC0111) {
        Runnable runnable = null;
        int i2 = -163386083;
        int i3 = C3019.f9544;
        int i4 = C0050.f910;
        int m6981 = (i4 - C2105.m6981("֨ۤ")) * (-35);
        int i5 = ((m6981 ^ i3) * 18637) ^ (-1432623089);
        int i6 = -1196686041;
        while (true) {
            i2 = ((((i2 ^ i3) * (-1051)) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -1863679319:
                case -1295563006:
                    activityC16608.f51014.post(runnable);
                    break;
                case -1691966606:
                case -787926634:
                    activityC16608.f51014.stopScroll();
                    if (activityC16608.f51014.isComputingLayout()) {
                        m6981 = (C0630.m2566("ܳ۫") ^ i4) * (-121);
                        i5 = ((m6981 ^ i3) * 26993) ^ (-330558002);
                        i6 = 659256007;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܳۘ")) * 81;
                        i5 = ((m6981 ^ i4) * 23759) ^ (-641127393);
                        i6 = -246450163;
                    }
                case -1600351011:
                case 394301401:
                    if (C4159.f13567) {
                        m6981 = (C2105.m6981("᩹ۛ") ^ i3) * (-35);
                        i5 = ((m6981 ^ i4) * 17721) ^ 455098340;
                        i6 = -646989253;
                    } else {
                        m6981 = (C0630.m2566("ᩴ᩶") + i3) * 109;
                        i5 = ((m6981 ^ i4) * (-30809)) ^ 326959456;
                        i6 = 1183452798;
                    }
                case -1386314311:
                case -560159402:
                    runnable.run();
                    break;
                case -1198265284:
                case 1278880409:
                    if (C2167.m7155()) {
                        m6981 = C0630.m2566("ۘۛ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-23301)) ^ 1089129408;
                        i6 = -2078724218;
                    } else {
                        m6981 = C2105.m6981("ۢۤ") ^ i4;
                        i5 = ((m6981 ^ i3) * 28503) ^ 319084699;
                        i6 = 1547261396;
                    }
                case -1072754752:
                case 1736229789:
                    if (C7106.f21815 != 0) {
                        m6981 = (C0630.m2566("ᩴ᩶") + i3) * 109;
                        i5 = ((m6981 ^ i4) * (-30809)) ^ 326959456;
                        i6 = 1183452798;
                    } else {
                        m6981 = C2105.m6981("ۧۖ") ^ i4;
                        i5 = ((m6981 ^ i3) * 28433) ^ (-1250573164);
                        i6 = -1909765398;
                    }
                case -881897451:
                case 128437183:
                    C3746.m11369();
                    if (C3019.f9544 >= 0) {
                        m6981 = (C0630.m2566("ᩴ᩶") + i3) * 109;
                        i5 = ((m6981 ^ i4) * (-30809)) ^ 326959456;
                        i6 = 1183452798;
                    } else {
                        m6981 = C0630.m2566("ᩳ᩻") ^ i4;
                        i5 = ((m6981 ^ i3) * 7319) ^ (-1961092645);
                        i6 = -437933173;
                    }
                case -852890156:
                case 2010677948:
                    if (C11340.f33930 >= 0) {
                        m6981 = (C2105.m6981("᩸᩵") ^ i3) * (-83);
                        i5 = ((m6981 ^ i4) * 3099) ^ (-1861489407);
                        i6 = 752414311;
                    } else {
                        m6981 = C0630.m2566("ۘܳ") ^ i4;
                        i5 = ((m6981 ^ i3) * 20249) ^ 260431731;
                        i6 = 779054143;
                    }
                case -758470097:
                case 593402300:
                    if (C11340.m28031()) {
                        m6981 = (i3 - C0630.m2566("᩻ۜ")) * (-21);
                        i5 = ((m6981 ^ i4) * 17915) ^ (-814271772);
                        i6 = 2085915582;
                    } else {
                        m6981 = C0630.m2566("ᩳ᩻") ^ i4;
                        i5 = ((m6981 ^ i3) * 7319) ^ (-1961092645);
                        i6 = -437933173;
                    }
                case -656303954:
                case 1952652057:
                    C7811.m20844();
                    m6981 = C0630.m2566("ۘۛ") ^ i4;
                    i5 = ((m6981 ^ i3) * (-23301)) ^ 1089129408;
                    i6 = -2078724218;
                case -148010363:
                case 1135185530:
                    if (C0798.f2919) {
                        m6981 = C0630.m2566("ۘۛ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-23301)) ^ 1089129408;
                        i6 = -2078724218;
                    } else {
                        m6981 = (i3 - C0630.m2566("۠ۢ")) * (-87);
                        i5 = ((m6981 ^ i4) * 24321) ^ 1819102921;
                        i6 = 2090526756;
                    }
                case -27845221:
                case 570389925:
                    if (C1420.f5096 <= 0) {
                        m6981 = C0630.m2566("ۘۛ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-23301)) ^ 1089129408;
                        i6 = -2078724218;
                    } else {
                        m6981 = C2105.m6981("ۚۡ") ^ i4;
                        i5 = ((m6981 ^ i3) * 4779) ^ 520429995;
                        i6 = -1089714058;
                    }
                case 86700147:
                case 1773807348:
                    C2126.m7040();
                    if (C4263.f13799 > 0) {
                        m6981 = C0630.m2566("ۘۛ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-23301)) ^ 1089129408;
                        i6 = -2078724218;
                    } else {
                        m6981 = (C2105.m6981("᩸᩵") ^ i3) * (-83);
                        i5 = ((m6981 ^ i4) * 3099) ^ (-1861489407);
                        i6 = 752414311;
                    }
                case 423884968:
                case 1976485638:
                    C1128.m3851();
                    if (C1005.m3501()) {
                        m6981 = (C0630.m2566("ᩴ᩶") + i3) * 109;
                        i5 = ((m6981 ^ i4) * (-30809)) ^ 326959456;
                        i6 = 1183452798;
                    } else {
                        m6981 = C0630.m2566("ۘۛ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-23301)) ^ 1089129408;
                        i6 = -2078724218;
                    }
                case 448932710:
                case 2025646542:
                    C3683.m11222();
                    break;
                case 994595918:
                case 1921944430:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C0630.m2566("ᩳ᩻") ^ i4;
                        i5 = ((m6981 ^ i3) * 7319) ^ (-1961092645);
                        i6 = -437933173;
                    } else {
                        m6981 = (C0630.m2566("ܺۡ") + i3) * 87;
                        i5 = ((m6981 ^ i4) * 31753) ^ 1688156559;
                        i6 = -1911655544;
                    }
                case 1538138193:
                case 2084824300:
                    runnable = new Runnable(activityC16608) { // from class: l.ۘ֫᩷

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ActivityC16608 f11493;

                        {
                            int i7 = -617036049;
                            int i8 = C1294.f4556;
                            int i9 = C7811.f24123;
                            int m69812 = C2105.m6981("ۧܶ") ^ i8;
                            int i10 = ((m69812 ^ i9) * (-19943)) ^ (-1256149438);
                            int i11 = -742263787;
                            while (true) {
                                i7 = ((((i7 ^ i9) * (-7029)) >> 31) & i10) ^ (m69812 ^ i11);
                                switch (i7) {
                                    case -2132255354:
                                    case 187442749:
                                        return;
                                    case -2019734913:
                                    case 2104890715:
                                        if (AbstractC2021.f6743 <= 0) {
                                            m69812 = C2105.m6981("ܳᩴ") ^ i9;
                                            i10 = ((m69812 ^ i8) * 8865) ^ (-271435115);
                                            i11 = -369259831;
                                        } else {
                                            m69812 = (C2105.m6981("ܳۢ") ^ i8) * (-113);
                                            i10 = ((m69812 ^ i9) * 10929) ^ 638201794;
                                            i11 = 1168570122;
                                        }
                                    case -1999000616:
                                    case 2093588241:
                                        this.f11493 = activityC16608;
                                        if (C3432.f10845 >= 0) {
                                            m69812 = C2105.m6981("ܳᩴ") ^ i9;
                                            i10 = ((m69812 ^ i8) * 8865) ^ (-271435115);
                                            i11 = -369259831;
                                        } else {
                                            m69812 = C0630.m2566("ܳܳ") ^ i9;
                                            i10 = ((m69812 ^ i8) * 18507) ^ 106190240;
                                            i11 = -863619460;
                                        }
                                    case -1994539709:
                                    case -308551167:
                                        if (RunnableC3474.f10992 <= 0) {
                                            m69812 = C2105.m6981("ܳᩴ") ^ i9;
                                            i10 = ((m69812 ^ i8) * 8865) ^ (-271435115);
                                            i11 = -369259831;
                                        } else {
                                            m69812 = (C0630.m2566("᩷ۙ") + i8) * 41;
                                            i10 = ((m69812 ^ i9) * 23099) ^ (-1308190759);
                                            i11 = 346563422;
                                        }
                                    case -1970667021:
                                    case -1359608792:
                                        C4159.m12565();
                                        if (C5695.f17556 < 0) {
                                            m69812 = (C0630.m2566("ᩳ᩶") + i8) * 33;
                                            i10 = ((m69812 ^ i9) * 16275) ^ 1442743382;
                                            i11 = -1744217063;
                                        } else {
                                            m69812 = C0630.m2566("ۡܽ") ^ i9;
                                            i10 = ((m69812 ^ i8) * (-23283)) ^ 1333403700;
                                            i11 = 1891754399;
                                        }
                                    case -1574048960:
                                    case -1053689692:
                                        C1005.m3501();
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            m69812 = C2105.m6981("ܳᩴ") ^ i9;
                                            i10 = ((m69812 ^ i8) * 8865) ^ (-271435115);
                                            i11 = -369259831;
                                        } else {
                                            m69812 = (C0630.m2566("ۚۜ") + i8) * (-37);
                                            i10 = ((m69812 ^ i9) * (-25481)) ^ (-2071184471);
                                            i11 = 85551346;
                                        }
                                    case -1366914291:
                                    case -604637799:
                                        if (C1294.f4556 >= 0) {
                                            m69812 = C0630.m2566("ۡܽ") ^ i9;
                                            i10 = ((m69812 ^ i8) * (-23283)) ^ 1333403700;
                                            i11 = 1891754399;
                                        } else {
                                            m69812 = (C2105.m6981("᩶ܽ") ^ i9) * (-93);
                                            i10 = ((m69812 ^ i8) * 21881) ^ 446773285;
                                            i11 = 142166901;
                                        }
                                    case -1232825395:
                                    case 1181319596:
                                        if (C2167.f7158 < 0) {
                                            m69812 = C2105.m6981("ܳᩴ") ^ i9;
                                            i10 = ((m69812 ^ i8) * 8865) ^ (-271435115);
                                            i11 = -369259831;
                                        } else {
                                            m69812 = (C0630.m2566("ᩳ᩶") + i8) * 33;
                                            i10 = ((m69812 ^ i9) * 16275) ^ 1442743382;
                                            i11 = -1744217063;
                                        }
                                    case -1191416465:
                                    case -594176681:
                                        if (C1773.f6144 <= 0) {
                                            m69812 = (C0630.m2566("ۚۜ") + i8) * (-37);
                                            i10 = ((m69812 ^ i9) * (-25481)) ^ (-2071184471);
                                            i11 = 85551346;
                                        } else {
                                            m69812 = (C2105.m6981("ۗ۬") ^ i9) * 49;
                                            i10 = ((m69812 ^ i8) * (-32517)) ^ (-2047555266);
                                            i11 = 444917506;
                                        }
                                    case -882833321:
                                    case 1477293615:
                                        C0422.m1963();
                                        ServiceConnectionC3453.m10564();
                                        throw new RuntimeException();
                                    case -118335722:
                                    case 1756592447:
                                        if (C1005.f3721) {
                                            m69812 = (C0630.m2566("۟ۧ") ^ i9) * 23;
                                            i10 = ((m69812 ^ i8) * 12525) ^ 954879336;
                                            i11 = 1972337914;
                                        } else {
                                            m69812 = (C0630.m2566("ۚۜ") + i8) * (-37);
                                            i10 = ((m69812 ^ i9) * (-25481)) ^ (-2071184471);
                                            i11 = 85551346;
                                        }
                                    case 278350797:
                                    case 343078416:
                                        if (RunnableC3474.m10630()) {
                                            m69812 = (C2105.m6981("ܳ֫") + i8) * (-77);
                                            i10 = ((m69812 ^ i9) * (-947)) ^ (-933478659);
                                            i11 = -621527649;
                                        } else {
                                            m69812 = C0630.m2566("᩻ᩳ") ^ i8;
                                            i10 = ((m69812 ^ i9) * 3779) ^ 1926608455;
                                            i11 = 629274752;
                                        }
                                    case 474057003:
                                    case 934488692:
                                        if (C0630.f2410 <= 0) {
                                            m69812 = C2105.m6981("ܳᩴ") ^ i9;
                                            i10 = ((m69812 ^ i8) * 8865) ^ (-271435115);
                                            i11 = -369259831;
                                        } else {
                                            m69812 = C0630.m2566("ۗܺ") ^ i8;
                                            i10 = ((m69812 ^ i9) * 27965) ^ 900688039;
                                            i11 = 1962776817;
                                        }
                                    case 602443624:
                                    case 1098820497:
                                        if (C0050.m940() <= 0) {
                                            m69812 = (C0630.m2566("ۚۜ") + i8) * (-37);
                                            i10 = ((m69812 ^ i9) * (-25481)) ^ (-2071184471);
                                            i11 = 85551346;
                                        } else {
                                            m69812 = (C2105.m6981("ᩴ᩶") + i9) * (-87);
                                            i10 = ((m69812 ^ i8) * (-20885)) ^ 1510196326;
                                            i11 = 1519965158;
                                        }
                                    case 1360620675:
                                    case 1378172725:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            m69812 = (C0630.m2566("ᩳ᩶") + i8) * 33;
                                            i10 = ((m69812 ^ i9) * 16275) ^ 1442743382;
                                            i11 = -1744217063;
                                        } else {
                                            m69812 = C2105.m6981("۫֡") ^ i8;
                                            i10 = ((m69812 ^ i9) * (-27103)) ^ 1743797827;
                                            i11 = -1931418283;
                                        }
                                    default:
                                        C0382.m1848();
                                        C21923.m49329();
                                        m69812 = C2105.m6981("ܳᩴ") ^ i9;
                                        i10 = ((m69812 ^ i8) * 8865) ^ (-271435115);
                                        i11 = -369259831;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i7 = 0;
                            RunnableC0111 runnableC01112 = null;
                            int i8 = 1713160387;
                            int i9 = C0714.f2697;
                            int i10 = C4075.f12947;
                            int m69812 = (C2105.m6981("ܽ᩺") + i9) * (-125);
                            int i11 = ((m69812 ^ i10) * 13163) ^ 46228445;
                            int i12 = -1272307193;
                            while (true) {
                                i8 = ((((i8 ^ i10) * (-22741)) >> 31) & i11) ^ (m69812 ^ i12);
                                switch (i8) {
                                    case -2024710071:
                                    case 1859330047:
                                        if (ViewOnClickListenerC1958.f6529 > 0) {
                                            m69812 = (C2105.m6981("᩶ۖ") + i10) * (-91);
                                            i11 = ((m69812 ^ i9) * 17471) ^ 1597172704;
                                            i12 = 644142059;
                                        } else {
                                            m69812 = (i10 - C0630.m2566("۬۠")) * (-71);
                                            i11 = ((m69812 ^ i9) * (-30571)) ^ (-1159670792);
                                            i12 = 328578795;
                                        }
                                    case -1878342033:
                                    case -161694113:
                                        C0483.m2121();
                                        C3245.m9925();
                                        break;
                                    case -1773173556:
                                    case 1030029259:
                                        if (C3746.f11829 <= 0) {
                                            m69812 = C0630.m2566("ۛۚ") ^ i10;
                                            i11 = ((m69812 ^ i9) * 21111) ^ (-1745079264);
                                            i12 = 252357326;
                                        } else {
                                            m69812 = (C2105.m6981("۟ۡ") ^ i10) * 93;
                                            i11 = ((m69812 ^ i9) * 15097) ^ (-1085969868);
                                            i12 = -255413603;
                                        }
                                    case -1608617933:
                                    case -1245867864:
                                        C1916.m6308();
                                        m69812 = C2105.m6981("֨᩹") ^ i9;
                                        i11 = ((m69812 ^ i10) * 17807) ^ (-1682852580);
                                        i12 = 2014539155;
                                    case -1586503284:
                                    case 2081908771:
                                        if (C2105.f7037 != 0) {
                                            m69812 = (i10 - C0630.m2566("۬۠")) * (-71);
                                            i11 = ((m69812 ^ i9) * (-30571)) ^ (-1159670792);
                                            i12 = 328578795;
                                        } else {
                                            m69812 = (C0630.m2566("۬ܿ") + i9) * 77;
                                            i11 = ((m69812 ^ i10) * (-11729)) ^ (-1735461727);
                                            i12 = 1668799009;
                                        }
                                    case -1384494831:
                                    case 1806230824:
                                        if (C1128.m3851() <= 0) {
                                            m69812 = (C2105.m6981("᩶ۖ") + i10) * (-91);
                                            i11 = ((m69812 ^ i9) * 17471) ^ 1597172704;
                                            i12 = 644142059;
                                        } else {
                                            m69812 = C0630.m2566("᩸ܿ") ^ i10;
                                            i11 = ((m69812 ^ i9) * (-20899)) ^ 666380231;
                                            i12 = 1177042360;
                                        }
                                    case -1254799194:
                                    case 919593961:
                                        i7 = i;
                                        if (C1420.f5096 <= 0) {
                                            m69812 = (C2105.m6981("᩶ۖ") + i10) * (-91);
                                            i11 = ((m69812 ^ i9) * 17471) ^ 1597172704;
                                            i12 = 644142059;
                                        } else {
                                            m69812 = C2105.m6981("۬ۢ") ^ i10;
                                            i11 = ((m69812 ^ i9) * (-10065)) ^ 262134199;
                                            i12 = -1443397892;
                                        }
                                    case -1236583343:
                                    case 1180417033:
                                        if (C0798.f2919) {
                                            m69812 = C2105.m6981("֨᩹") ^ i9;
                                            i11 = ((m69812 ^ i10) * 17807) ^ (-1682852580);
                                            i12 = 2014539155;
                                        } else {
                                            m69812 = C0630.m2566("ᩳۚ") ^ i9;
                                            i11 = ((m69812 ^ i10) * 20635) ^ 656630157;
                                            i12 = -1128047203;
                                        }
                                    case -1043176870:
                                    case -840823184:
                                        if (RunnableC3474.f10992 <= 0) {
                                            m69812 = C0630.m2566("ۛۚ") ^ i10;
                                            i11 = ((m69812 ^ i9) * 21111) ^ (-1745079264);
                                            i12 = 252357326;
                                        } else {
                                            m69812 = C2105.m6981("ᩴ᩷") ^ i10;
                                            i11 = ((m69812 ^ i9) * 28287) ^ (-667420651);
                                            i12 = -196135048;
                                        }
                                    case -1003373312:
                                    case 9998919:
                                        C1916.m6308();
                                        if (C3432.f10845 >= 0) {
                                            m69812 = C2105.m6981("֨᩹") ^ i9;
                                            i11 = ((m69812 ^ i10) * 17807) ^ (-1682852580);
                                            i12 = 2014539155;
                                        } else {
                                            m69812 = (C2105.m6981("᩶ۖ") + i10) * (-91);
                                            i11 = ((m69812 ^ i9) * 17471) ^ 1597172704;
                                            i12 = 644142059;
                                        }
                                    case -995620461:
                                    case 1149070929:
                                        ActivityC16608.m39103(this.f11493, i7, runnableC01112);
                                        break;
                                    case -931027016:
                                    case 564965970:
                                        if (C0483.f2088 >= 0) {
                                            m69812 = C2105.m6981("֨᩹") ^ i9;
                                            i11 = ((m69812 ^ i10) * 17807) ^ (-1682852580);
                                            i12 = 2014539155;
                                        } else {
                                            m69812 = (i9 - C0630.m2566("ۡۡ")) * (-17);
                                            i11 = ((m69812 ^ i10) * 24189) ^ 7215288;
                                            i12 = -1314316808;
                                        }
                                    case -831514713:
                                    case 549715162:
                                        if (RunnableC0588.f2309 >= 0) {
                                            m69812 = (i10 - C0630.m2566("۬۠")) * (-71);
                                            i11 = ((m69812 ^ i9) * (-30571)) ^ (-1159670792);
                                            i12 = 328578795;
                                        } else {
                                            m69812 = C0630.m2566("ܽܿ") ^ i9;
                                            i11 = ((m69812 ^ i10) * (-15325)) ^ 493137485;
                                            i12 = -938196554;
                                        }
                                    case -224012756:
                                    case 2040448399:
                                        if (C3537.m10746() <= 0) {
                                            m69812 = (C2105.m6981("᩶ۖ") + i10) * (-91);
                                            i11 = ((m69812 ^ i9) * 17471) ^ 1597172704;
                                            i12 = 644142059;
                                        } else {
                                            m69812 = (C2105.m6981("ۗܳ") ^ i9) * 109;
                                            i11 = ((m69812 ^ i10) * (-8593)) ^ (-1763433359);
                                            i12 = 1445419351;
                                        }
                                    case 1030672047:
                                    case 2104334490:
                                        if (RunnableC1937.m6387() == 0) {
                                            m69812 = (C2105.m6981("᩶ۖ") + i10) * (-91);
                                            i11 = ((m69812 ^ i9) * 17471) ^ 1597172704;
                                            i12 = 644142059;
                                        } else {
                                            m69812 = (i9 - C2105.m6981("ۧ۠")) * (-39);
                                            i11 = ((m69812 ^ i10) * (-3425)) ^ (-1211069);
                                            i12 = 1384921315;
                                        }
                                    default:
                                        runnableC01112 = runnableC0111;
                                        if (C0483.m2121()) {
                                            m69812 = C0630.m2566("ۛᩴ") ^ i10;
                                            i11 = ((m69812 ^ i9) * 11801) ^ (-638694114);
                                            i12 = 1291056818;
                                        } else {
                                            m69812 = C0630.m2566("ۛۚ") ^ i10;
                                            i11 = ((m69812 ^ i9) * 21111) ^ (-1745079264);
                                            i12 = 252357326;
                                        }
                                }
                                return;
                            }
                        }
                    };
                    if (C1504.f5354) {
                        m6981 = (C2105.m6981("ۢ᩻") + i3) * (-5);
                        i5 = ((m6981 ^ i4) * 24307) ^ (-1248685534);
                        i6 = -1866674426;
                    } else {
                        m6981 = C0630.m2566("ۢ۬") ^ i4;
                        i5 = ((m6981 ^ i3) * (-2199)) ^ (-1642142915);
                        i6 = 1736663667;
                    }
                default:
                    if (C3432.f10845 >= 0) {
                        m6981 = C0630.m2566("ᩳ᩻") ^ i4;
                        i5 = ((m6981 ^ i3) * 7319) ^ (-1961092645);
                        i6 = -437933173;
                    } else {
                        m6981 = (C2105.m6981("ۧۚ") + i3) * 23;
                        i5 = ((m6981 ^ i4) * 18117) ^ 1900543195;
                        i6 = 1055651864;
                    }
            }
            return;
        }
    }

    @Override // l.InterfaceC4585
    /* renamed from: ᩳ */
    public final void mo1502() {
        long j = 0;
        long j2 = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -120029167;
        int i5 = C0714.f2697;
        int i6 = RunnableC1937.f6483;
        int m2566 = C0630.m2566("ۛ᩵") ^ i5;
        int i7 = ((m2566 ^ i6) * (-24239)) ^ (-558868628);
        int i8 = 247535931;
        while (true) {
            i4 = ((((i4 ^ i6) * 15745) >> 31) & i7) ^ (m2566 ^ i8);
            switch (i4) {
                case -2138116644:
                case 2131128941:
                    j = C1294.m4371();
                    if (C4159.m12565() >= 0) {
                        m2566 = (C2105.m6981("֨᩹") ^ i5) * (-3);
                        i7 = ((m2566 ^ i6) * (-6945)) ^ 1669213543;
                        i8 = 1375883953;
                    } else {
                        m2566 = (C2105.m6981("ᩳܿ") + i6) * (-43);
                        i7 = ((m2566 ^ i5) * (-4419)) ^ (-2026185015);
                        i8 = -270899287;
                    }
                case -1969745559:
                case -1846217689:
                    if (C3019.f9544 >= 0) {
                        m2566 = (C2105.m6981("֨᩹") ^ i5) * (-3);
                        i7 = ((m2566 ^ i6) * (-6945)) ^ 1669213543;
                        i8 = 1375883953;
                    } else {
                        m2566 = (C0630.m2566("۟۬") + i5) * 69;
                        i7 = ((m2566 ^ i6) * 14117) ^ 2071296666;
                        i8 = 1793978260;
                    }
                case -1922024446:
                case 1652236642:
                    i = this.f51009;
                    i2 = 1;
                    if (C2167.f7158 >= 0) {
                        m2566 = (C2105.m6981("᩺ۧ") ^ i6) * (-5);
                        i7 = ((m2566 ^ i5) * (-23373)) ^ (-202566982);
                        i8 = 1515171392;
                    } else {
                        m2566 = C0630.m2566("᩷᩺") ^ i5;
                        i7 = ((m2566 ^ i6) * (-31863)) ^ 559338908;
                        i8 = 2080311302;
                    }
                case -1788066263:
                case -1126986034:
                    j2 = this.f51015;
                    if (C1005.m3501()) {
                        m2566 = C2105.m6981("᩻ۛ") ^ i6;
                        i7 = ((m2566 ^ i5) * 4387) ^ 229155417;
                        i8 = -1876015566;
                    } else {
                        m2566 = (C2105.m6981("᩺ۧ") ^ i6) * (-5);
                        i7 = ((m2566 ^ i5) * (-23373)) ^ (-202566982);
                        i8 = 1515171392;
                    }
                case -1785200448:
                case 118674989:
                    if (C2167.f7158 < 0) {
                        m2566 = C2105.m6981("᩺᩶") ^ i6;
                        i7 = ((m2566 ^ i5) * (-27101)) ^ 1992631626;
                        i8 = 1992744526;
                    } else {
                        m2566 = C2105.m6981("ۜۗ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-23921)) ^ (-898990133);
                        i8 = 1649993906;
                    }
                case -1239190887:
                case 802713636:
                    break;
                case -423390284:
                case 1087780160:
                    if (C0483.f2088 < 0) {
                        C0964.m3402(new C14928(this, i3));
                        break;
                    }
                    m2566 = C2105.m6981("᩺᩶") ^ i6;
                    i7 = ((m2566 ^ i5) * (-27101)) ^ 1992631626;
                    i8 = 1992744526;
                case -380708592:
                case -172794632:
                    i3 = i + i2;
                    this.f51009 = i3;
                    if (C4117.m12364() != 0) {
                        m2566 = (C2105.m6981("᩺ۧ") ^ i6) * (-5);
                        i7 = ((m2566 ^ i5) * (-23373)) ^ (-202566982);
                        i8 = 1515171392;
                    } else {
                        m2566 = (i6 - C0630.m2566("᩷ۘ")) * (-101);
                        i7 = ((m2566 ^ i5) * (-7151)) ^ 1383731482;
                        i8 = -1801664857;
                    }
                case -348914554:
                case 1736372573:
                    f51007 = z;
                    if (RunnableC1937.m6387() != 0) {
                        m2566 = (C2105.m6981("᩺ۧ") ^ i6) * (-5);
                        i7 = ((m2566 ^ i5) * (-23373)) ^ (-202566982);
                        i8 = 1515171392;
                    } else {
                        m2566 = (C2105.m6981("᩵ۗ") ^ i6) * 5;
                        i7 = ((m2566 ^ i5) * (-21563)) ^ 1200917897;
                        i8 = 1410615498;
                    }
                case -205787933:
                case 1205114716:
                    RunnableC0588.m2441();
                    if (C0714.f2697 >= 0) {
                        m2566 = C2105.m6981("᩺᩶") ^ i6;
                        i7 = ((m2566 ^ i5) * (-27101)) ^ 1992631626;
                        i8 = 1992744526;
                    } else {
                        m2566 = (i5 - C0630.m2566("ᩴ᩻")) * 3;
                        i7 = ((m2566 ^ i6) * 5255) ^ 703195179;
                        i8 = -1902442757;
                    }
                case 30319320:
                case 144196164:
                    if (j - j2 < 300) {
                        m2566 = (C0630.m2566("ۙᩳ") + i5) * (-55);
                        i7 = ((m2566 ^ i6) * 7711) ^ (-1675433722);
                        i8 = 1125542379;
                    } else {
                        m2566 = (C0630.m2566("֫ܿ") ^ i5) * 27;
                        i7 = ((m2566 ^ i6) * 27181) ^ (-1021328382);
                        i8 = 1268200338;
                    }
                case 413704253:
                case 467210004:
                    z = false;
                    if (C0630.f2410 <= 0) {
                        m2566 = C2105.m6981("ۜۗ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-23921)) ^ (-898990133);
                        i8 = 1649993906;
                    } else {
                        m2566 = C0630.m2566("֨۫") ^ i5;
                        i7 = ((m2566 ^ i6) * (-27793)) ^ (-1026513257);
                        i8 = -382640893;
                    }
                case 564906314:
                case 611869753:
                    C1047.m3599();
                    C2958.m9034();
                    m2566 = C2105.m6981("᩺᩶") ^ i6;
                    i7 = ((m2566 ^ i5) * (-27101)) ^ 1992631626;
                    i8 = 1992744526;
                case 680444007:
                case 2094278429:
                    if (C3019.m9255() <= 0) {
                        m2566 = C2105.m6981("ۜۗ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-23921)) ^ (-898990133);
                        i8 = 1649993906;
                    } else {
                        m2566 = (C2105.m6981("֨᩹") ^ i5) * (-3);
                        i7 = ((m2566 ^ i6) * (-6945)) ^ 1669213543;
                        i8 = 1375883953;
                    }
                case 828423974:
                case 1220652356:
                    if (C1047.f3863 >= 0) {
                        m2566 = (i5 - C0630.m2566("ᩴ᩻")) * 3;
                        i7 = ((m2566 ^ i6) * 5255) ^ 703195179;
                        i8 = -1902442757;
                    } else {
                        m2566 = (C0630.m2566("֡ܿ") + i5) * 73;
                        i7 = ((m2566 ^ i6) * (-9825)) ^ 954500768;
                        i8 = 28181338;
                    }
                case 1240469249:
                case 2118740614:
                    this.f51015 = ViewOnClickListenerC1958.m6432();
                    if (C7811.m20844() != 0) {
                        m2566 = C2105.m6981("ۜۗ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-23921)) ^ (-898990133);
                        i8 = 1649993906;
                    } else {
                        m2566 = (C2105.m6981("ܽۘ") + i6) * (-61);
                        i7 = ((m2566 ^ i5) * 6393) ^ 686328139;
                        i8 = 617880018;
                    }
                default:
                    C1005.m3501();
                    break;
            }
            return;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean z;
        ArrayList arrayList;
        short[] sArr;
        int i;
        int m6981;
        int i2;
        int i3;
        int m69812;
        int i4;
        int i5;
        int m2566;
        int i6;
        int m69813;
        int i7;
        int i8;
        int i9;
        int i10 = C1420.f5096;
        int i11 = RunnableC1937.f6483;
        int m69814 = (C2105.m6981("ۛ᩶") + i11) * 65;
        int i12 = ((m69814 ^ i10) * 12559) ^ 277742022;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i13 = m69814 ^ (-1700696429);
        int i14 = 0;
        int i15 = 0;
        Intent intent = null;
        int i16 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i17 = 1753825508;
        int i18 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Intent intent2 = null;
        Object obj = null;
        Iterator it = null;
        ArrayList arrayList2 = null;
        boolean z2 = false;
        while (true) {
            i17 = i13 ^ (i12 & (((i17 ^ i10) * 8161) >> 31));
            switch (i17) {
                case -2140938885:
                case -1649446691:
                    str = C0714.m2816(f51008, 77, 3, i15);
                    if (C2272.m7503()) {
                        z = z2;
                        arrayList = arrayList2;
                        m6981 = C0630.m2566("ܺۘ") ^ i10;
                        i2 = ((m6981 ^ i11) * (-6337)) ^ 396821879;
                        i3 = -1668386887;
                        i9 = m6981 ^ i3;
                        arrayList2 = arrayList;
                        boolean z3 = z;
                        i13 = i9;
                        i12 = i2;
                        z2 = z3;
                    } else {
                        m69812 = C0630.m2566("᩶ᩳ") ^ i11;
                        i4 = ((m69812 ^ i10) * 6567) ^ 468984471;
                        i5 = -865336556;
                        i13 = m69812 ^ i5;
                        i12 = i4;
                    }
                case -2125860650:
                case -1852901593:
                    RunnableC1937.m6387();
                    z = z2;
                    arrayList = arrayList2;
                    m6981 = C0630.m2566("ܺۘ") ^ i10;
                    i2 = ((m6981 ^ i11) * (-6337)) ^ 396821879;
                    i3 = -1668386887;
                    i9 = m6981 ^ i3;
                    arrayList2 = arrayList;
                    boolean z32 = z;
                    i13 = i9;
                    i12 = i2;
                    z2 = z32;
                case -2020093130:
                case 2079088140:
                    z = z2;
                    arrayList = arrayList2;
                    sArr = sArr3;
                    i = i18;
                    if (((s * s) + 36469521) - (s * s2) < 0) {
                        m2566 = (C0630.m2566("۫᩺") ^ i10) * 17;
                        i4 = ((m2566 ^ i11) * 459) ^ 1361268651;
                        i6 = -352004859;
                    } else {
                        m2566 = (C0630.m2566("ۡۢ") ^ i10) * 95;
                        i4 = ((m2566 ^ i11) * 11623) ^ (-646489207);
                        i6 = 1431927565;
                    }
                    int i19 = m2566 ^ i6;
                    sArr3 = sArr;
                    i18 = i;
                    z2 = z;
                    arrayList2 = arrayList;
                    i13 = i19;
                    i12 = i4;
                case -1850131978:
                case 275209007:
                    z = z2;
                    arrayList = arrayList2;
                    sArr = sArr3;
                    i = i18;
                    sArr2 = f51008;
                    if (C1420.f5096 > 0) {
                        m2566 = (C0630.m2566("ܶܿ") ^ i10) * (-65);
                        i4 = ((m2566 ^ i11) * 23327) ^ (-634692655);
                        i6 = 886572915;
                        int i192 = m2566 ^ i6;
                        sArr3 = sArr;
                        i18 = i;
                        z2 = z;
                        arrayList2 = arrayList;
                        i13 = i192;
                        i12 = i4;
                    }
                    m2566 = (i10 - C2105.m6981("᩹ۨ")) * (-79);
                    i4 = ((m2566 ^ i11) * (-24155)) ^ 1941763678;
                    i6 = -694502201;
                    int i1922 = m2566 ^ i6;
                    sArr3 = sArr;
                    i18 = i;
                    z2 = z;
                    arrayList2 = arrayList;
                    i13 = i1922;
                    i12 = i4;
                case -1754938222:
                case -379003677:
                    z = z2;
                    arrayList = arrayList2;
                    sArr = sArr3;
                    i = i18;
                    str3 = C2272.m7507(sArr, i, 3, i15);
                    if (RunnableC1937.m6387() == 0) {
                        m2566 = C2105.m6981("ۡۧ") ^ i10;
                        i4 = ((m2566 ^ i11) * 2303) ^ 1079173096;
                        i6 = -2101121603;
                        int i19222 = m2566 ^ i6;
                        sArr3 = sArr;
                        i18 = i;
                        z2 = z;
                        arrayList2 = arrayList;
                        i13 = i19222;
                        i12 = i4;
                    }
                    m2566 = (i10 - C2105.m6981("᩹ۨ")) * (-79);
                    i4 = ((m2566 ^ i11) * (-24155)) ^ 1941763678;
                    i6 = -694502201;
                    int i192222 = m2566 ^ i6;
                    sArr3 = sArr;
                    i18 = i;
                    z2 = z;
                    arrayList2 = arrayList;
                    i13 = i192222;
                    i12 = i4;
                case -1680547863:
                case 204132072:
                    sArr4 = f51008;
                    i16 = 59;
                    if (C2520.m8026()) {
                        z = z2;
                        arrayList = arrayList2;
                        m6981 = C0630.m2566("ܺۘ") ^ i10;
                        i2 = ((m6981 ^ i11) * (-6337)) ^ 396821879;
                        i3 = -1668386887;
                        i9 = m6981 ^ i3;
                        arrayList2 = arrayList;
                        boolean z322 = z;
                        i13 = i9;
                        i12 = i2;
                        z2 = z322;
                    } else {
                        m69812 = (i11 - C2105.m6981("֡֫")) * 19;
                        i4 = ((m69812 ^ i10) * 4107) ^ (-797985790);
                        i5 = -1217177328;
                        i13 = m69812 ^ i5;
                        i12 = i4;
                    }
                case -1589005424:
                case -471336789:
                    return z2;
                case -1573127895:
                case 358015330:
                    C3746.m11369();
                    if (C0422.f1886 <= 0) {
                        z = z2;
                        arrayList = arrayList2;
                        m6981 = C0630.m2566("ܺۘ") ^ i10;
                        i2 = ((m6981 ^ i11) * (-6337)) ^ 396821879;
                        i3 = -1668386887;
                        i9 = m6981 ^ i3;
                        arrayList2 = arrayList;
                        boolean z3222 = z;
                        i13 = i9;
                        i12 = i2;
                        z2 = z3222;
                    } else {
                        m69812 = (C2105.m6981("᩸ܶ") ^ i11) * (-107);
                        i4 = ((m69812 ^ i10) * (-5041)) ^ 1950277281;
                        i5 = -1769045757;
                        i13 = m69812 ^ i5;
                        i12 = i4;
                    }
                case -1452896537:
                case -158424698:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        z = z2;
                        arrayList = arrayList2;
                        m6981 = C0630.m2566("ܺۘ") ^ i10;
                        i2 = ((m6981 ^ i11) * (-6337)) ^ 396821879;
                        i3 = -1668386887;
                        i9 = m6981 ^ i3;
                        arrayList2 = arrayList;
                        boolean z32222 = z;
                        i13 = i9;
                        i12 = i2;
                        z2 = z32222;
                    } else {
                        int m69815 = C2105.m6981("ܽᩳ") ^ i10;
                        i13 = m69815 ^ (-504244117);
                        i12 = ((m69815 ^ i11) * 29437) ^ (-777542525);
                        intent = null;
                    }
                case -1382191809:
                case 148203426:
                    if (C2272.f7362) {
                        z = z2;
                        arrayList = arrayList2;
                        sArr = sArr3;
                        i = i18;
                        m2566 = (i10 - C2105.m6981("᩹ۨ")) * (-79);
                        i4 = ((m2566 ^ i11) * (-24155)) ^ 1941763678;
                        i6 = -694502201;
                        int i1922222 = m2566 ^ i6;
                        sArr3 = sArr;
                        i18 = i;
                        z2 = z;
                        arrayList2 = arrayList;
                        i13 = i1922222;
                        i12 = i4;
                    } else {
                        z = z2;
                        arrayList = arrayList2;
                        m6981 = C0630.m2566("ܺۘ") ^ i10;
                        i2 = ((m6981 ^ i11) * (-6337)) ^ 396821879;
                        i3 = -1668386887;
                        i9 = m6981 ^ i3;
                        arrayList2 = arrayList;
                        boolean z322222 = z;
                        i13 = i9;
                        i12 = i2;
                        z2 = z322222;
                    }
                case -1347182904:
                case 1923196710:
                    z = z2;
                    arrayList = arrayList2;
                    sArr = sArr3;
                    i = i18;
                    i15 = 33187;
                    m2566 = (C0630.m2566("֡ܶ") ^ i11) * (-73);
                    i4 = ((m2566 ^ i10) * (-15015)) ^ (-534642044);
                    i6 = 1703522267;
                    int i19222222 = m2566 ^ i6;
                    sArr3 = sArr;
                    i18 = i;
                    z2 = z;
                    arrayList2 = arrayList;
                    i13 = i19222222;
                    i12 = i4;
                case -1292685012:
                case -1109829772:
                    z = z2;
                    arrayList2 = new ArrayList();
                    it = C4117.m12354(this.f51012);
                    int m25662 = C0630.m2566("ۤۨ") ^ i10;
                    i2 = ((m25662 ^ i11) * 28439) ^ (-2038814299);
                    i9 = m25662 ^ (-1212778706);
                    boolean z3222222 = z;
                    i13 = i9;
                    i12 = i2;
                    z2 = z3222222;
                case -1248500524:
                case 255599749:
                    C4075.m12246(this, obj, null);
                    return z2;
                case -1056347633:
                case 656984719:
                    ArrayList arrayList3 = arrayList2;
                    z2 = true;
                    if (i14 == (C0630.m2566(str3) ^ 2125442887)) {
                        m69813 = C2105.m6981("ۖ֨") ^ i11;
                        i7 = ((m69813 ^ i10) * 28053) ^ 715329732;
                        i8 = 742019532;
                    } else {
                        m69813 = C2105.m6981("ۙۙ") ^ i11;
                        i7 = ((m69813 ^ i10) * 8809) ^ 810838762;
                        i8 = -1798213489;
                    }
                    i13 = m69813 ^ i8;
                    i12 = i7;
                    arrayList2 = arrayList3;
                case -1047999794:
                case 922394318:
                    z = z2;
                    arrayList = arrayList2;
                    sArr = sArr3;
                    i = i18;
                    s = sArr2[c];
                    s2 = 12078;
                    if (AbstractC2021.m6574()) {
                        m2566 = C2105.m6981("ۤ۟") ^ i11;
                        i4 = ((m2566 ^ i10) * (-13825)) ^ (-11234394);
                        i6 = -1724488461;
                    } else {
                        m2566 = (C0630.m2566("᩵᩸") + i11) * 17;
                        i4 = ((m2566 ^ i10) * (-1695)) ^ (-1470334893);
                        i6 = 936237483;
                    }
                    int i192222222 = m2566 ^ i6;
                    sArr3 = sArr;
                    i18 = i;
                    z2 = z;
                    arrayList2 = arrayList;
                    i13 = i192222222;
                    i12 = i4;
                case -1006689614:
                case 671495639:
                    C1504.m5179();
                    if (C3746.f11829 > 0) {
                        int m698152 = C2105.m6981("ܽᩳ") ^ i10;
                        i13 = m698152 ^ (-504244117);
                        i12 = ((m698152 ^ i11) * 29437) ^ (-777542525);
                        intent = null;
                    } else {
                        z = z2;
                        arrayList = arrayList2;
                        m6981 = C2105.m6981("ۨۤ") ^ i11;
                        i2 = ((m6981 ^ i10) * 24257) ^ (-1860408669);
                        i3 = 1735238224;
                        i9 = m6981 ^ i3;
                        arrayList2 = arrayList;
                        boolean z32222222 = z;
                        i13 = i9;
                        i12 = i2;
                        z2 = z32222222;
                    }
                case -1004102790:
                case 817888007:
                    try {
                        ServiceConnectionC3453.m10570(this, intent);
                        m69812 = C2105.m6981("۬ۤ") ^ i11;
                        i4 = ((m69812 ^ i10) * (-8053)) ^ (-1557252679);
                        i5 = 1912929017;
                        i13 = m69812 ^ i5;
                    } catch (Throwable th) {
                        int m25663 = C0630.m2566("᩶֡") ^ i11;
                        i4 = ((m25663 ^ i10) * (-23951)) ^ (-122250028);
                        i13 = m25663 ^ 611680789;
                        obj = th;
                    }
                    i12 = i4;
                case -668513558:
                case 173246332:
                    return false;
                case -549170445:
                case 1775239716:
                    C5695.m16023();
                    return false;
                case -507012189:
                case 1160037374:
                    if (C13265.m32212(arrayList2)) {
                        m69812 = (C0630.m2566("ܺۤ") ^ i10) * 21;
                        i4 = ((m69812 ^ i11) * (-9139)) ^ (-1292614905);
                        i5 = 783406477;
                    } else {
                        m69812 = (C2105.m6981("ᩳ᩸") ^ i10) * (-17);
                        i4 = ((m69812 ^ i11) * 24935) ^ 432082965;
                        i5 = -75900;
                    }
                    i13 = m69812 ^ i5;
                    i12 = i4;
                case -483569858:
                case 531386931:
                    C1916.m6307(arrayList2, C4159.m12577((C19099) C2272.m7513(it)));
                    z = z2;
                    int m256622 = C0630.m2566("ۤۨ") ^ i10;
                    i2 = ((m256622 ^ i11) * 28439) ^ (-2038814299);
                    i9 = m256622 ^ (-1212778706);
                    boolean z322222222 = z;
                    i13 = i9;
                    i12 = i2;
                    z2 = z322222222;
                case -346825509:
                case -117492373:
                    z = z2;
                    arrayList = arrayList2;
                    if (i14 == (C2105.m6981(str2) ^ 2102377311)) {
                        m6981 = (C2105.m6981("ۚ۟") ^ i10) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i2 = ((m6981 ^ i11) * (-17889)) ^ (-654255346);
                        i3 = 523324841;
                        i9 = m6981 ^ i3;
                        arrayList2 = arrayList;
                        boolean z3222222222 = z;
                        i13 = i9;
                        i12 = i2;
                        z2 = z3222222222;
                    } else {
                        sArr = sArr3;
                        i = i18;
                        m2566 = (C0630.m2566("᩷ۛ") + i11) * 77;
                        i4 = ((m2566 ^ i10) * 3477) ^ 1534779452;
                        i6 = -388926358;
                        int i1922222222 = m2566 ^ i6;
                        sArr3 = sArr;
                        i18 = i;
                        z2 = z;
                        arrayList2 = arrayList;
                        i13 = i1922222222;
                        i12 = i4;
                    }
                case -193171394:
                case 1954925229:
                    if (C1773.m5910(it)) {
                        m69812 = C2105.m6981("ۢܶ") ^ i11;
                        i4 = ((m69812 ^ i10) * 5991) ^ (-1379884053);
                        i5 = -1907404403;
                    } else {
                        m69812 = C0630.m2566("ۡۤ") ^ i10;
                        i4 = ((m69812 ^ i11) * 14353) ^ (-1194663376);
                        i5 = 116311113;
                    }
                    i13 = m69812 ^ i5;
                    i12 = i4;
                case -138826335:
                case 87192709:
                    z = z2;
                    arrayList = arrayList2;
                    str2 = C1773.m5917(f51008, 30, 3, i15);
                    if (C1294.f4556 < 0) {
                        m6981 = (C0630.m2566("᩶᩺") + i10) * (-101);
                        i2 = ((m6981 ^ i11) * 20251) ^ 1980435942;
                        i3 = -721774701;
                        i9 = m6981 ^ i3;
                        arrayList2 = arrayList;
                        boolean z32222222222 = z;
                        i13 = i9;
                        i12 = i2;
                        z2 = z32222222222;
                    }
                    m6981 = C2105.m6981("ۨۤ") ^ i11;
                    i2 = ((m6981 ^ i10) * 24257) ^ (-1860408669);
                    i3 = 1735238224;
                    i9 = m6981 ^ i3;
                    arrayList2 = arrayList;
                    boolean z322222222222 = z;
                    i13 = i9;
                    i12 = i2;
                    z2 = z322222222222;
                case -42046448:
                case 1356066838:
                    z = z2;
                    arrayList = arrayList2;
                    sArr = sArr3;
                    i = i18;
                    c = 26;
                    if (C0382.f1805) {
                        m2566 = C2105.m6981("֫֨") ^ i11;
                        i4 = ((m2566 ^ i10) * (-18803)) ^ 1157171207;
                        i6 = 1349230777;
                        int i19222222222 = m2566 ^ i6;
                        sArr3 = sArr;
                        i18 = i;
                        z2 = z;
                        arrayList2 = arrayList;
                        i13 = i19222222222;
                        i12 = i4;
                    }
                    m2566 = (i10 - C2105.m6981("᩹ۨ")) * (-79);
                    i4 = ((m2566 ^ i11) * (-24155)) ^ 1941763678;
                    i6 = -694502201;
                    int i192222222222 = m2566 ^ i6;
                    sArr3 = sArr;
                    i18 = i;
                    z2 = z;
                    arrayList2 = arrayList;
                    i13 = i192222222222;
                    i12 = i4;
                case 56325474:
                case 2096650825:
                    z = z2;
                    arrayList = arrayList2;
                    i14 = C2126.m7041(menuItem);
                    sArr3 = f51008;
                    i18 = 27;
                    if (!C0798.f2919) {
                        m6981 = (C2105.m6981("ۛ᩹") + i10) * 75;
                        i2 = ((m6981 ^ i11) * 31287) ^ 714716101;
                        i3 = 1272028244;
                        i9 = m6981 ^ i3;
                        arrayList2 = arrayList;
                        boolean z3222222222222 = z;
                        i13 = i9;
                        i12 = i2;
                        z2 = z3222222222222;
                    }
                    m6981 = C0630.m2566("ܺۘ") ^ i10;
                    i2 = ((m6981 ^ i11) * (-6337)) ^ 396821879;
                    i3 = -1668386887;
                    i9 = m6981 ^ i3;
                    arrayList2 = arrayList;
                    boolean z32222222222222 = z;
                    i13 = i9;
                    i12 = i2;
                    z2 = z32222222222222;
                case 61814642:
                case 1479107779:
                    z = z2;
                    arrayList = arrayList2;
                    sArr = sArr3;
                    i = i18;
                    if (C18393.m42825()) {
                        m2566 = C2105.m6981("᩶֫") ^ i11;
                        i4 = ((m2566 ^ i10) * (-21263)) ^ (-2113652560);
                        i6 = -317145962;
                        int i1922222222222 = m2566 ^ i6;
                        sArr3 = sArr;
                        i18 = i;
                        z2 = z;
                        arrayList2 = arrayList;
                        i13 = i1922222222222;
                        i12 = i4;
                    }
                    m2566 = (C0630.m2566("᩷ۛ") + i11) * 77;
                    i4 = ((m2566 ^ i10) * 3477) ^ 1534779452;
                    i6 = -388926358;
                    int i19222222222222 = m2566 ^ i6;
                    sArr3 = sArr;
                    i18 = i;
                    z2 = z;
                    arrayList2 = arrayList;
                    i13 = i19222222222222;
                    i12 = i4;
                case 728074318:
                case 1689217040:
                    intent2.putExtra(C1711.m5726(sArr4, i16, 18, i15), arrayList2);
                    C4075.m12261(this, intent2);
                    return z2;
                case 873234131:
                case 2074548022:
                    Uri parse = Uri.parse(C23986.m52812());
                    short[] sArr5 = f51008;
                    if (C1128.f4106 <= 0) {
                        int m6981522 = C2105.m6981("ܽᩳ") ^ i10;
                        i13 = m6981522 ^ (-504244117);
                        i12 = ((m6981522 ^ i11) * 29437) ^ (-777542525);
                        intent = null;
                    } else {
                        z = z2;
                        arrayList = arrayList2;
                        intent = new Intent(C3245.m9934(sArr5, 33, 26, i15), parse);
                        m6981 = C0630.m2566("ܿ᩶") ^ i11;
                        i2 = ((m6981 ^ i10) * 10321) ^ (-73061372);
                        i3 = 1439022919;
                        i9 = m6981 ^ i3;
                        arrayList2 = arrayList;
                        boolean z322222222222222 = z;
                        i13 = i9;
                        i12 = i2;
                        z2 = z322222222222222;
                    }
                case 1100737614:
                case 1801991726:
                    z = z2;
                    arrayList = arrayList2;
                    sArr = sArr3;
                    i = i18;
                    i15 = 61346;
                    m2566 = (C0630.m2566("֡ܶ") ^ i11) * (-73);
                    i4 = ((m2566 ^ i10) * (-15015)) ^ (-534642044);
                    i6 = 1703522267;
                    int i192222222222222 = m2566 ^ i6;
                    sArr3 = sArr;
                    i18 = i;
                    z2 = z;
                    arrayList2 = arrayList;
                    i13 = i192222222222222;
                    i12 = i4;
                case 1569493635:
                case 2091393761:
                    C1711.m5728(C2105.m6981(str) ^ 2121390646);
                    return z2;
                default:
                    intent2 = new Intent(this, (Class<?>) ActivityC15196.class);
                    if (C22628.m50615() != 0) {
                        z = z2;
                        arrayList = arrayList2;
                        m6981 = C0630.m2566("ܺۘ") ^ i10;
                        i2 = ((m6981 ^ i11) * (-6337)) ^ 396821879;
                        i3 = -1668386887;
                        i9 = m6981 ^ i3;
                        arrayList2 = arrayList;
                        boolean z3222222222222222 = z;
                        i13 = i9;
                        i12 = i2;
                        z2 = z3222222222222222;
                    } else {
                        m69812 = C0630.m2566("᩺ۗ") ^ i10;
                        i4 = ((m69812 ^ i11) * (-30301)) ^ (-1166868664);
                        i5 = -669171744;
                        i13 = m69812 ^ i5;
                        i12 = i4;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (l.C7106.m19120() > 0) goto L64;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m39109(l.ActivityC16608 r8, java.lang.Runnable r9) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC16608.m39109(l.ܽۧ᩷, java.lang.Runnable):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39105(ActivityC16608 activityC16608, String str) {
        int i = 0;
        int i2 = 1235120497;
        int i3 = C3432.f10845;
        int i4 = C4263.f13799;
        int m2566 = C0630.m2566("ܶۖ") ^ i4;
        int i5 = ((m2566 ^ i3) * (-8719)) ^ 32648413;
        int i6 = -1437597292;
        while (true) {
            i2 = ((((i2 ^ i3) * 171) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -1906892335:
                case -649961322:
                    if (C4117.f13076 <= 0) {
                        m2566 = (C2105.m6981("᩵ۨ") + i4) * (-125);
                        i5 = ((m2566 ^ i3) * (-519)) ^ 1914357164;
                        i6 = 328798210;
                    } else {
                        m2566 = (C0630.m2566("֨᩻") + i4) * 27;
                        i5 = ((m2566 ^ i3) * 24973) ^ (-1993133882);
                        i6 = 931025301;
                    }
                case -1643327780:
                case 1458859105:
                    if (C3683.f11629 >= 0) {
                        m2566 = (i3 - C2105.m6981("ۡۧ")) * 33;
                        i5 = ((m2566 ^ i4) * 27757) ^ (-207268072);
                        i6 = 898728694;
                    } else {
                        m2566 = (i4 - C2105.m6981("ۢ֨")) * 31;
                        i5 = ((m2566 ^ i3) * 2095) ^ (-1725916650);
                        i6 = 1304953481;
                    }
                case -1536413978:
                case -1283097532:
                    if (C2520.m8026()) {
                        m2566 = (C2105.m6981("ۚ۠") ^ i4) * 83;
                        i5 = ((m2566 ^ i3) * 7909) ^ (-1804226357);
                        i6 = 1496536031;
                    } else {
                        m2566 = (i4 - C0630.m2566("ܶ᩵")) * 89;
                        i5 = ((m2566 ^ i3) * (-12681)) ^ (-328556462);
                        i6 = 314508555;
                    }
                case -1296829972:
                case -1144398409:
                    i = activityC16608.m39111(str);
                    if (i != -1) {
                        m2566 = C0630.m2566("ۙܿ") ^ i4;
                        i5 = ((m2566 ^ i3) * 18755) ^ (-438492587);
                        i6 = 1641979008;
                    } else {
                        m2566 = C2105.m6981("᩺ۤ") ^ i3;
                        i5 = ((m2566 ^ i4) * 4613) ^ (-1768068985);
                        i6 = -589399673;
                    }
                case -682772858:
                case 331730914:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        m2566 = (i3 - C2105.m6981("ۡۧ")) * 33;
                        i5 = ((m2566 ^ i4) * 27757) ^ (-207268072);
                        i6 = 898728694;
                    } else {
                        m2566 = C0630.m2566("᩺֫") ^ i3;
                        i5 = ((m2566 ^ i4) * 21813) ^ (-733114215);
                        i6 = -1879348808;
                    }
                case -674164117:
                case 449213591:
                    if (C4117.f13076 <= 0) {
                        m2566 = (C2105.m6981("᩵ۨ") + i4) * (-125);
                        i5 = ((m2566 ^ i3) * (-519)) ^ 1914357164;
                        i6 = 328798210;
                    } else {
                        m2566 = C0630.m2566("ۤۛ") ^ i3;
                        i5 = ((m2566 ^ i4) * 9917) ^ 1927764027;
                        i6 = -732611745;
                    }
                case -72510547:
                case 815500613:
                    if (C3537.f11231 >= 0) {
                        m2566 = (C2105.m6981("ᩳۧ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((m2566 ^ i4) * (-8431)) ^ (-1336190399);
                        i6 = -91331363;
                    } else {
                        m2566 = (C2105.m6981("ۘ֫") ^ i3) * 123;
                        i5 = ((m2566 ^ i4) * 26397) ^ 2055837514;
                        i6 = -644313585;
                    }
                case 552288471:
                case 554459210:
                    if (C3245.f10203 <= 0) {
                        m2566 = (i3 - C2105.m6981("ۡۧ")) * 33;
                        i5 = ((m2566 ^ i4) * 27757) ^ (-207268072);
                        i6 = 898728694;
                    } else {
                        m2566 = (i3 - C2105.m6981("۠ۤ")) * (-61);
                        i5 = ((m2566 ^ i4) * (-11719)) ^ 197047616;
                        i6 = -912295026;
                    }
                case 652609721:
                case 942972148:
                    C0237.m1481();
                    C2958.m9034();
                    m2566 = (C2105.m6981("ۚ۠") ^ i4) * 83;
                    i5 = ((m2566 ^ i3) * 7909) ^ (-1804226357);
                    i6 = 1496536031;
                case 685923278:
                case 2129993523:
                    C2126.m7040();
                    if (C4616.f14690 <= 0) {
                        m2566 = (C2105.m6981("ۚ۠") ^ i4) * 83;
                        i5 = ((m2566 ^ i3) * 7909) ^ (-1804226357);
                        i6 = 1496536031;
                    } else {
                        m2566 = (C0630.m2566("ۚ᩹") ^ i4) * 115;
                        i5 = ((m2566 ^ i3) * 327) ^ 495568564;
                        i6 = -437381068;
                    }
                case 755112989:
                case 988547297:
                    if (C21923.f70183 != 0) {
                        m2566 = (i3 - C2105.m6981("ۡۧ")) * 33;
                        i5 = ((m2566 ^ i4) * 27757) ^ (-207268072);
                        i6 = 898728694;
                    } else {
                        m2566 = C2105.m6981("ۜᩳ") ^ i4;
                        i5 = ((m2566 ^ i3) * 9751) ^ (-1344169479);
                        i6 = 80169850;
                    }
                case 787617232:
                case 1774786821:
                    break;
                case 791188448:
                case 1631697920:
                    if (C2958.f9394 >= 0) {
                        m2566 = (C2105.m6981("ۚ۠") ^ i4) * 83;
                        i5 = ((m2566 ^ i3) * 7909) ^ (-1804226357);
                        i6 = 1496536031;
                    } else {
                        m2566 = C2105.m6981("ܳ֡") ^ i4;
                        i5 = ((m2566 ^ i3) * (-15435)) ^ 1922067213;
                        i6 = 162618388;
                    }
                case 1038979570:
                case 1394504537:
                    if (C3663.f11553) {
                        m2566 = (C2105.m6981("᩵ۨ") + i4) * (-125);
                        i5 = ((m2566 ^ i3) * (-519)) ^ 1914357164;
                        i6 = 328798210;
                    } else {
                        m2566 = (C2105.m6981("᩵ܿ") + i3) * (-101);
                        i5 = ((m2566 ^ i4) * (-17431)) ^ 1063586652;
                        i6 = 702396032;
                    }
                case 1040504937:
                case 1434611246:
                    activityC16608.f51012.remove(i);
                    m2566 = C2105.m6981("᩺ۤ") ^ i3;
                    i5 = ((m2566 ^ i4) * 4613) ^ (-1768068985);
                    i6 = -589399673;
                case 1094180670:
                case 1615055809:
                    if (C3537.f11231 >= 0) {
                        m2566 = (C2105.m6981("ۚ۠") ^ i4) * 83;
                        i5 = ((m2566 ^ i3) * 7909) ^ (-1804226357);
                        i6 = 1496536031;
                    } else {
                        m2566 = (i3 - C2105.m6981("ۡۧ")) * 33;
                        i5 = ((m2566 ^ i4) * 27757) ^ (-207268072);
                        i6 = 898728694;
                    }
                case 1571662222:
                case 1645403572:
                    C0483.m2121();
                    if (C1773.f6144 <= 0) {
                        m2566 = (C2105.m6981("ۚ۠") ^ i4) * 83;
                        i5 = ((m2566 ^ i3) * 7909) ^ (-1804226357);
                        i6 = 1496536031;
                    } else {
                        m2566 = (C2105.m6981("ᩳۧ") ^ i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((m2566 ^ i4) * (-8431)) ^ (-1336190399);
                        i6 = -91331363;
                    }
                default:
                    C2272.m7503();
                    break;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39106(ActivityC16608 activityC16608, String str, int i) {
        int i2 = 0;
        int i3 = 1106032992;
        int i4 = C7811.f24123;
        int i5 = C3537.f11231;
        int m6981 = C2105.m6981("ܰۡ") ^ i5;
        int i6 = ((m6981 ^ i4) * (-5689)) ^ (-1351575818);
        int i7 = -1748726826;
        while (true) {
            i3 = ((((i3 ^ i4) * (-19331)) >> 31) & i6) ^ (m6981 ^ i7);
            switch (i3) {
                case -1667492186:
                case -1422227447:
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = C2105.m6981("ܶ᩹") ^ i5;
                        i6 = ((m6981 ^ i4) * (-22217)) ^ (-955919262);
                        i7 = 2110051356;
                    } else {
                        m6981 = C0630.m2566("ܺ֨") ^ i5;
                        i6 = ((m6981 ^ i4) * 29427) ^ 1205814381;
                        i7 = 232353605;
                    }
                case -1615550698:
                case 1230757120:
                    if (C1504.f5354) {
                        m6981 = (C0630.m2566("ۛᩳ") + i4) * (-119);
                        i6 = ((m6981 ^ i5) * 23563) ^ (-1807503267);
                        i7 = 2071871391;
                    } else {
                        m6981 = C2105.m6981("ܺۚ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-2073)) ^ (-1759474838);
                        i7 = -1527400946;
                    }
                case -1563101341:
                case -13938315:
                    i2 = activityC16608.m39111(str);
                    if (i2 != -1) {
                        m6981 = C2105.m6981("ۤ᩷") ^ i5;
                        i6 = ((m6981 ^ i4) * (-19725)) ^ (-1175220911);
                        i7 = 540165873;
                    } else {
                        m6981 = C0630.m2566("᩻ܶ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-18467)) ^ 1459821259;
                        i7 = -468345061;
                    }
                case -1541881803:
                case -1401085355:
                    C0382.m1848();
                    break;
                case -1395583233:
                case 1182622253:
                    if (C0798.f2919) {
                        m6981 = C0630.m2566("᩹᩷") ^ i4;
                        i6 = ((m6981 ^ i5) * (-20031)) ^ (-1352029700);
                        i7 = 762289407;
                    } else {
                        m6981 = C0630.m2566("ۢۚ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-7417)) ^ 1654286329;
                        i7 = -424994313;
                    }
                case -1229200038:
                case 474953147:
                    if (C3746.f11829 <= 0) {
                        m6981 = (i4 - C0630.m2566("᩹ۡ")) * 55;
                        i6 = ((m6981 ^ i5) * (-10973)) ^ 1324789554;
                        i7 = 2061304297;
                    } else {
                        m6981 = C2105.m6981("۟۠") ^ i4;
                        i6 = ((m6981 ^ i5) * (-30311)) ^ (-836813542);
                        i7 = 1322995667;
                    }
                case -1202411121:
                case 1508121645:
                    if (C3245.f10203 <= 0) {
                        m6981 = (i4 - C0630.m2566("᩹ۡ")) * 55;
                        i6 = ((m6981 ^ i5) * (-10973)) ^ 1324789554;
                        i7 = 2061304297;
                    } else {
                        m6981 = (C0630.m2566("᩷᩺") + i4) * 37;
                        i6 = ((m6981 ^ i5) * 15567) ^ 743133719;
                        i7 = 608276856;
                    }
                case -1036570254:
                case 1441162823:
                    break;
                case -847251688:
                case 352687529:
                    if (C2272.f7362) {
                        m6981 = (C0630.m2566("ۛᩳ") + i4) * (-119);
                        i6 = ((m6981 ^ i5) * 23563) ^ (-1807503267);
                        i7 = 2071871391;
                    } else {
                        m6981 = (i4 - C0630.m2566("۬ܶ")) * (-73);
                        i6 = ((m6981 ^ i5) * 29001) ^ (-482614607);
                        i7 = -1366983533;
                    }
                case -735267070:
                case 1415341061:
                    if (C1916.f6442) {
                        m6981 = (C0630.m2566("ۤ֡") + i5) * 63;
                        i6 = ((m6981 ^ i4) * 18165) ^ (-1564416137);
                        i7 = -2131701886;
                    } else {
                        m6981 = C0630.m2566("ܺ֨") ^ i5;
                        i6 = ((m6981 ^ i4) * 29427) ^ 1205814381;
                        i7 = 232353605;
                    }
                case -597653855:
                case 1625962101:
                    C21923.m49329();
                    if (C2105.f7037 == 0) {
                        m6981 = C2105.m6981("ܶ᩹") ^ i5;
                        i6 = ((m6981 ^ i4) * (-22217)) ^ (-955919262);
                        i7 = 2110051356;
                    } else {
                        m6981 = (C0630.m2566("ۛᩳ") + i4) * (-119);
                        i6 = ((m6981 ^ i5) * 23563) ^ (-1807503267);
                        i7 = 2071871391;
                    }
                case -365014894:
                case 1604044222:
                    if (C2167.f7158 >= 0) {
                        m6981 = C2105.m6981("ܶ᩹") ^ i5;
                        i6 = ((m6981 ^ i4) * (-22217)) ^ (-955919262);
                        i7 = 2110051356;
                    } else {
                        m6981 = (C2105.m6981("ܺ۟") + i5) * 115;
                        i6 = ((m6981 ^ i4) * (-30997)) ^ 1655352712;
                        i7 = 2144592669;
                    }
                case -334265912:
                case 758930848:
                    if (C3537.f11231 >= 0) {
                        m6981 = C2105.m6981("ܶ᩹") ^ i5;
                        i6 = ((m6981 ^ i4) * (-22217)) ^ (-955919262);
                        i7 = 2110051356;
                    } else {
                        m6981 = C0630.m2566("ۨܳ") ^ i5;
                        i6 = ((m6981 ^ i4) * 28249) ^ 1617883985;
                        i7 = 93677059;
                    }
                case -242500952:
                case 1583490179:
                    ((C19099) C3019.m9263(activityC16608.f51012, i2)).m44014(i);
                    m6981 = C0630.m2566("᩻ܶ") ^ i4;
                    i6 = ((m6981 ^ i5) * (-18467)) ^ 1459821259;
                    i7 = -468345061;
                case 519163306:
                case 869992744:
                    C1420.m4913();
                    C7811.m20844();
                    m6981 = C2105.m6981("ܶ᩹") ^ i5;
                    i6 = ((m6981 ^ i4) * (-22217)) ^ (-955919262);
                    i7 = 2110051356;
                case 1087740384:
                case 1799566075:
                    if (C1504.f5354) {
                        m6981 = C0630.m2566("᩹᩷") ^ i4;
                        i6 = ((m6981 ^ i5) * (-20031)) ^ (-1352029700);
                        i7 = 762289407;
                    } else {
                        m6981 = (C0630.m2566("ۛᩳ") + i4) * (-119);
                        i6 = ((m6981 ^ i5) * 23563) ^ (-1807503267);
                        i7 = 2071871391;
                    }
                case 1465581704:
                case 1868166146:
                    if (C1047.f3863 >= 0) {
                        m6981 = C2105.m6981("ܶ᩹") ^ i5;
                        i6 = ((m6981 ^ i4) * (-22217)) ^ (-955919262);
                        i7 = 2110051356;
                    } else {
                        m6981 = (i5 - C0630.m2566("ۡܰ")) * (-117);
                        i6 = ((m6981 ^ i4) * (-25581)) ^ 1953474120;
                        i7 = 2134260932;
                    }
                default:
                    if (C3683.f11629 >= 0) {
                        m6981 = C2105.m6981("ܶ᩹") ^ i5;
                        i6 = ((m6981 ^ i4) * (-22217)) ^ (-955919262);
                        i7 = 2110051356;
                    } else {
                        m6981 = (C2105.m6981("ᩳܳ") ^ i5) * 75;
                        i6 = ((m6981 ^ i4) * 29005) ^ 1201645273;
                        i7 = -1682936676;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
    
        r4 = l.C2105.m6981("ᩳ۫") ^ r3;
        r5 = ((r4 ^ r2) * (-20747)) ^ 730625182;
        r6 = -844882417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0107, code lost:
    
        r4 = (l.C2105.m6981("ۖ᩺") + r2) * (-115);
        r5 = ((r4 ^ r3) * (-3397)) ^ (-286173888);
        r6 = 2128648419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
    
        r4 = (l.C0630.m2566("ܶۢ") + r3) * 93;
        r5 = ((r4 ^ r2) * 31181) ^ 1053958281;
        r6 = -1903944280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        r4 = l.C2105.m6981("᩹ۧ") ^ r2;
        r5 = ((r4 ^ r3) * 3981) ^ (-428367618);
        r6 = -262842186;
     */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m39110(l.ActivityC16608 r8) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC16608.m39110(l.ܽۧ᩷):void");
    }
}
