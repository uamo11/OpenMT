package l;

import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.digests.WhirlpoolDigest;

/* compiled from: L61J */
/* renamed from: l.ۗܺ᩷, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractActivityC3346 extends ActivityC2124 implements InterfaceC13223 {

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10575 = 0;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static final C5242 f10576;

    /* renamed from: ܶܳ᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f10577;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public static WeakReference f10578;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public boolean f10579;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public Intent f10580;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public boolean f10581;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public volatile Runnable f10582;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public boolean f10583;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public C9762 f10584;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public ArrayList f10585;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public boolean f10586;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public View f10587;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public boolean f10588;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public volatile C0603 f10589;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final Set f10590;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f10591;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public C5652 f10592;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC9411 f10593;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f10594;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public C5652 f10595;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public InterfaceC4227 f10596;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public C12437 f10597;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native View m10216(int i);

    /* renamed from: ۚ */
    public abstract String mo121();

    /* renamed from: ᩻ */
    public /* synthetic */ boolean mo135() {
        return false;
    }

    @Override // l.ActivityC0737, l.ActivityC23809, android.app.Activity, l.InterfaceC2811
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 376185616;
        int i3 = C2958.f9394;
        int i4 = C0714.f2697;
        int m2566 = C0630.m2566("ۨᩳ") ^ i3;
        int i5 = ((m2566 ^ i4) * 25127) ^ 777002926;
        int i6 = -194054602;
        while (true) {
            i2 = ((((i2 ^ i4) * 27023) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -2085931449:
                case 919997172:
                    if (C7106.f21815 != 0) {
                        m2566 = C2105.m6981("᩷֡") ^ i4;
                        i5 = ((m2566 ^ i3) * (-14915)) ^ (-69497417);
                        i6 = 582608859;
                    } else {
                        m2566 = (i3 - C2105.m6981("ᩴۗ")) * 7;
                        i5 = ((m2566 ^ i4) * (-32585)) ^ 2041492769;
                        i6 = 1555000723;
                    }
                case -1903628766:
                case -220817861:
                    super.onRequestPermissionsResult(i, strArr, iArr);
                    break;
                case -1854837555:
                case 1433128950:
                    if (C2520.f8000 < 0) {
                        m2566 = (i3 - C2105.m6981("۫ۢ")) * (-109);
                        i5 = ((m2566 ^ i4) * (-2755)) ^ 1186231433;
                        i6 = -1266856145;
                    } else {
                        m2566 = C2105.m6981("᩷֡") ^ i4;
                        i5 = ((m2566 ^ i3) * (-14915)) ^ (-69497417);
                        i6 = 582608859;
                    }
                case -1842196367:
                case -886916665:
                    if (C1773.m5908() <= 0) {
                        m2566 = (i4 - C0630.m2566("ܿܺ")) * (-109);
                        i5 = ((m2566 ^ i3) * 31009) ^ 1699926459;
                        i6 = 1815999310;
                    } else {
                        m2566 = (i3 - C0630.m2566("ᩳܺ")) * 99;
                        i5 = ((m2566 ^ i4) * (-25243)) ^ 135912485;
                        i6 = 1918093585;
                    }
                case -1826827971:
                case 594723490:
                    if (C2520.f8000 >= 0) {
                        m2566 = (C2105.m6981("᩸֨") + i4) * (-59);
                        i5 = ((m2566 ^ i3) * 31769) ^ (-291840037);
                        i6 = -1048205467;
                    } else {
                        m2566 = C0630.m2566("ܰܶ") ^ i3;
                        i5 = ((m2566 ^ i4) * 4551) ^ 1752738658;
                        i6 = 1729129696;
                    }
                case -1639638912:
                case -1533703704:
                    if (C2167.f7158 >= 0) {
                        m2566 = (i3 - C2105.m6981("۫ۢ")) * (-109);
                        i5 = ((m2566 ^ i4) * (-2755)) ^ 1186231433;
                        i6 = -1266856145;
                    } else {
                        m2566 = (i4 - C2105.m6981("ۨܺ")) * 19;
                        i5 = ((m2566 ^ i3) * (-15949)) ^ (-906868819);
                        i6 = 909963784;
                    }
                case -1393178676:
                case -635618565:
                    C3683.m11222();
                    if (C1128.f4106 > 0) {
                        m2566 = (i4 - C0630.m2566("ܿܺ")) * (-109);
                        i5 = ((m2566 ^ i3) * 31009) ^ 1699926459;
                        i6 = 1815999310;
                    } else {
                        m2566 = (i3 - C2105.m6981("۫ۢ")) * (-109);
                        i5 = ((m2566 ^ i4) * (-2755)) ^ 1186231433;
                        i6 = -1266856145;
                    }
                case -1375651648:
                case 74982538:
                    if (C4075.m12263() <= 0) {
                        m2566 = (C2105.m6981("᩸֨") + i4) * (-59);
                        i5 = ((m2566 ^ i3) * 31769) ^ (-291840037);
                        i6 = -1048205467;
                    } else {
                        m2566 = C0630.m2566("᩺ۛ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-1117)) ^ 1876541733;
                        i6 = 1912171028;
                    }
                case -1256296029:
                case 21814314:
                    if (C2126.m7040()) {
                        m2566 = (i3 - C2105.m6981("۫ۢ")) * (-109);
                        i5 = ((m2566 ^ i4) * (-2755)) ^ 1186231433;
                        i6 = -1266856145;
                    } else {
                        m2566 = C2105.m6981("ۡ᩺") ^ i4;
                        i5 = ((m2566 ^ i3) * 20899) ^ (-1843780634);
                        i6 = 491988121;
                    }
                case -1187338234:
                case -1175293671:
                    if (C0050.f910 >= 0) {
                        m2566 = C0630.m2566("ۛۡ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-4717)) ^ 42870719;
                        i6 = -1605775865;
                    } else {
                        m2566 = (i3 - C2105.m6981("ܿ᩷")) * (-55);
                        i5 = ((m2566 ^ i4) * (-497)) ^ 1186977861;
                        i6 = 1668215107;
                    }
                case -1184276159:
                case 1376463877:
                    if (C1005.f3721) {
                        m2566 = (C0630.m2566("ۧۙ") ^ i4) * (-69);
                        i5 = ((m2566 ^ i3) * 7405) ^ (-1445024622);
                        i6 = 976908981;
                    } else {
                        m2566 = C0630.m2566("ۛۡ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-4717)) ^ 42870719;
                        i6 = -1605775865;
                    }
                case -641633585:
                case 351954159:
                    C2520.m8026();
                    m2566 = (i4 - C0630.m2566("ܿܺ")) * (-109);
                    i5 = ((m2566 ^ i3) * 31009) ^ 1699926459;
                    i6 = 1815999310;
                case -277729153:
                case 1229219865:
                    if (C5695.f17556 >= 0) {
                        m2566 = (i3 - C2105.m6981("۫ۢ")) * (-109);
                        i5 = ((m2566 ^ i4) * (-2755)) ^ 1186231433;
                        i6 = -1266856145;
                    } else {
                        m2566 = (C2105.m6981("ᩴ᩺") + i4) * (-31);
                        i5 = ((m2566 ^ i3) * 20197) ^ 2076482068;
                        i6 = -573775956;
                    }
                case -255119847:
                case -226282204:
                    C3746.m11369();
                    if (C0798.m2998() != 0) {
                        m2566 = (i3 - C2105.m6981("۫ۢ")) * (-109);
                        i5 = ((m2566 ^ i4) * (-2755)) ^ 1186231433;
                        i6 = -1266856145;
                    } else {
                        m2566 = C0630.m2566("ۛۡ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-4717)) ^ 42870719;
                        i6 = -1605775865;
                    }
                case 76114600:
                case 937730434:
                    C3537.m10746();
                    C7811.m20844();
                    break;
                case 432638959:
                case 1743407711:
                    if (C3911.m11924() <= 0) {
                        m2566 = C0630.m2566("ۛۡ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-4717)) ^ 42870719;
                        i6 = -1605775865;
                    } else {
                        m2566 = (C0630.m2566("ۘܽ") ^ i4) * (-15);
                        i5 = ((m2566 ^ i3) * (-22855)) ^ 1092516221;
                        i6 = 122851640;
                    }
                case 503022157:
                case 1255855256:
                    C3467.m10604(this, true);
                    break;
                default:
                    if (i == 23680) {
                        m2566 = C2105.m6981("᩺۫") ^ i3;
                        i5 = ((m2566 ^ i4) * (-31991)) ^ 1897550022;
                        i6 = -1074055746;
                    } else {
                        m2566 = C0630.m2566("۠ᩴ") ^ i4;
                        i5 = ((m2566 ^ i3) * 12651) ^ 16324499;
                        i6 = 2090427314;
                    }
            }
            return;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10236(View view) {
        AbstractC7379 abstractC7379 = null;
        EnumC13728 enumC13728 = null;
        int i = -2071266513;
        int i2 = C5695.f17556;
        int i3 = ViewOnClickListenerC1958.f6529;
        int m6981 = C2105.m6981("ܳᩴ") ^ i2;
        int i4 = ((m6981 ^ i3) * (-24365)) ^ 2141417400;
        int i5 = 1715757382;
        while (true) {
            i = ((((i ^ i3) * 21429) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1955350352:
                case 678138139:
                    if (C0050.f910 >= 0) {
                        m6981 = C2105.m6981("ۖۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 19071) ^ 617705010;
                        i5 = 1711907120;
                    } else {
                        m6981 = C0630.m2566("᩶۫") ^ i2;
                        i4 = ((m6981 ^ i3) * 21271) ^ (-873543200);
                        i5 = -1900545547;
                    }
                case -1882708161:
                case 244193637:
                    this.f10587 = view;
                    abstractC7379 = C4117.m12356(this);
                    if (C0483.f2088 >= 0) {
                        m6981 = (C0630.m2566("ܶܿ") + i2) * (-13);
                        i4 = ((m6981 ^ i3) * 7201) ^ 267450518;
                        i5 = 1428848925;
                    } else {
                        m6981 = (C2105.m6981("۫ܿ") + i3) * 13;
                        i4 = ((m6981 ^ i2) * 17791) ^ 1016744308;
                        i5 = -714309574;
                    }
                case -1881068340:
                case -168415913:
                    if (C2272.f7362) {
                        m6981 = (C0630.m2566("ܶܿ") + i2) * (-13);
                        i4 = ((m6981 ^ i3) * 7201) ^ 267450518;
                        i5 = 1428848925;
                    } else {
                        m6981 = (i3 - C0630.m2566("᩻ۢ")) * 119;
                        i4 = ((m6981 ^ i2) * 20621) ^ (-917419664);
                        i5 = -1219195353;
                    }
                case -1867114283:
                case 1284795113:
                    enumC13728 = abstractC7379.mo19832();
                    if (C4117.f13076 <= 0) {
                        m6981 = (C0630.m2566("ܶۚ") ^ i3) * (-63);
                        i4 = ((m6981 ^ i2) * 31657) ^ (-1620582260);
                        i5 = 1247214909;
                    } else {
                        m6981 = C0630.m2566("ۡ᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * 11635) ^ 1443160173;
                        i5 = 371246276;
                    }
                case -1666885540:
                case -1404829129:
                    if (C0798.f2919) {
                        m6981 = C2105.m6981("ۛ᩹") ^ i3;
                        i4 = ((m6981 ^ i2) * 8067) ^ 2097144621;
                        i5 = 1164089900;
                    } else {
                        m6981 = C2105.m6981("ܳ᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * (-31867)) ^ (-579541120);
                        i5 = -1352191575;
                    }
                case -1592974723:
                case -1079005988:
                    if (C11340.f33930 < 0) {
                        m6981 = C2105.m6981("ܿۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-4547)) ^ 1398848313;
                        i5 = -1253261915;
                    } else {
                        m6981 = C2105.m6981("ۖۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 19071) ^ 617705010;
                        i5 = 1711907120;
                    }
                case -1577556965:
                case 1484487310:
                    RunnableC3474.m10630();
                    C1504.m5179();
                    return;
                case -1568566741:
                case 841670614:
                    RunnableC1108.m3790();
                    C1005.m3501();
                    m6981 = C2105.m6981("ܿۛ") ^ i2;
                    i4 = ((m6981 ^ i3) * (-4547)) ^ 1398848313;
                    i5 = -1253261915;
                case -1342148207:
                case 2029816749:
                    if (view instanceof C12392) {
                        m6981 = (i3 - C0630.m2566("ۙ֨")) * (-35);
                        i4 = ((m6981 ^ i2) * 21893) ^ (-2102658399);
                        i5 = 1907376461;
                    } else {
                        m6981 = (C0630.m2566("ۙ᩶") + i2) * (-89);
                        i4 = ((m6981 ^ i3) * 25867) ^ 2143129330;
                        i5 = 1857391030;
                    }
                case -1296864897:
                case -1076753282:
                    if (C1420.f5096 <= 0) {
                        m6981 = C2105.m6981("ܿۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-4547)) ^ 1398848313;
                        i5 = -1253261915;
                    } else {
                        m6981 = C2105.m6981("ᩳ֫") ^ i3;
                        i4 = ((m6981 ^ i2) * 6683) ^ (-1171892160);
                        i5 = 649255777;
                    }
                case -1189539694:
                case 1112598621:
                    if (C1005.m3501()) {
                        m6981 = (i2 - C0630.m2566("۟۬")) * (-81);
                        i4 = ((m6981 ^ i3) * 29601) ^ 13820893;
                        i5 = -1993813541;
                    } else {
                        m6981 = C2105.m6981("ۖۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 19071) ^ 617705010;
                        i5 = 1711907120;
                    }
                case -382252102:
                case 1406037697:
                    if (view instanceof C7473) {
                        m6981 = (i3 - C0630.m2566("ۙ֨")) * (-35);
                        i4 = ((m6981 ^ i2) * 21893) ^ (-2102658399);
                        i5 = 1907376461;
                    } else {
                        m6981 = (i3 - C0630.m2566("᩷ۚ")) * (-3);
                        i4 = ((m6981 ^ i2) * (-1551)) ^ 1319073309;
                        i5 = 479770263;
                    }
                case -135618479:
                case 608622477:
                    f10578 = new WeakReference(view);
                    m6981 = (C2105.m6981("᩻ۗ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i4 = ((m6981 ^ i2) * (-26009)) ^ 2008696710;
                    i5 = 1957102110;
                case -82375899:
                case 372434026:
                    if (enumC13728.m33028(EnumC13728.STARTED)) {
                        m6981 = C0630.m2566("ۚۘ") ^ i2;
                        i4 = ((m6981 ^ i3) * 30203) ^ 354615542;
                        i5 = 450714424;
                    } else {
                        m6981 = (C2105.m6981("᩻ۗ") ^ i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((m6981 ^ i2) * (-26009)) ^ 2008696710;
                        i5 = 1957102110;
                    }
                case 17060014:
                case 977564230:
                    C3746.m11369();
                    if (C3432.f10845 >= 0) {
                        m6981 = C2105.m6981("ܿۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-4547)) ^ 1398848313;
                        i5 = -1253261915;
                    } else {
                        m6981 = C2105.m6981("ۛ᩹") ^ i3;
                        i4 = ((m6981 ^ i2) * 8067) ^ 2097144621;
                        i5 = 1164089900;
                    }
                case 289525989:
                case 1139114770:
                    C0422.m1963();
                    if (C1504.f5354) {
                        m6981 = (C0630.m2566("ܶܿ") + i2) * (-13);
                        i4 = ((m6981 ^ i3) * 7201) ^ 267450518;
                        i5 = 1428848925;
                    } else {
                        m6981 = C2105.m6981("ܿۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-4547)) ^ 1398848313;
                        i5 = -1253261915;
                    }
                case 520516531:
                case 1496570349:
                    Class m6565 = AbstractC2021.m6565(view);
                    if (C0422.f1886 > 0) {
                        throw new IllegalArgumentException(C0422.m1959(m6565));
                    }
                    m6981 = C2105.m6981("ۖۧ") ^ i3;
                    i4 = ((m6981 ^ i2) * 19071) ^ 617705010;
                    i5 = 1711907120;
                case 605288727:
                case 1455517253:
                    return;
                case 645408678:
                case 1922189006:
                    if (C3746.f11829 <= 0) {
                        m6981 = C2105.m6981("ܿۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-4547)) ^ 1398848313;
                        i5 = -1253261915;
                    } else {
                        m6981 = (C0630.m2566("֫ܰ") + i2) * (-121);
                        i4 = ((m6981 ^ i3) * (-26159)) ^ 1384329880;
                        i5 = 1870293096;
                    }
                default:
                    if (C3432.f10845 >= 0) {
                        m6981 = C2105.m6981("ۛ᩹") ^ i3;
                        i4 = ((m6981 ^ i2) * 8067) ^ 2097144621;
                        i5 = 1164089900;
                    } else {
                        m6981 = C0630.m2566("ۖ᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 16661) ^ 1358353237;
                        i5 = -426761428;
                    }
            }
        }
    }

    /* renamed from: ֫ */
    public void mo115(Intent intent) {
        throw new RuntimeException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10217(int i, int i2, boolean z) {
        int i3 = 1498733920;
        int i4 = C1773.f6144;
        int i5 = C0483.f2088;
        int m6981 = (C2105.m6981("֨ܶ") ^ i4) * (-69);
        int i6 = ((m6981 ^ i5) * 24789) ^ 808255392;
        int i7 = -1456730602;
        while (true) {
            i3 = ((((i3 ^ i5) * 661) >> 31) & i6) ^ (m6981 ^ i7);
            switch (i3) {
                case -2025688093:
                case -1409732461:
                    if (C3537.f11231 >= 0) {
                        m6981 = C0630.m2566("ܽۛ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-27089)) ^ (-1964808193);
                        i7 = -1034679147;
                    } else {
                        m6981 = (C2105.m6981("ᩳ᩶") ^ i5) * 5;
                        i6 = ((m6981 ^ i4) * 18619) ^ (-462183688);
                        i7 = 289672539;
                    }
                case -1810154868:
                case 1036841660:
                    if (C1711.f5919) {
                        m6981 = C2105.m6981("ܳۖ") ^ i5;
                        i6 = ((m6981 ^ i4) * 5625) ^ 682071875;
                        i7 = -902893308;
                    } else {
                        m6981 = C2105.m6981("᩶ܺ") ^ i4;
                        i6 = ((m6981 ^ i5) * 21509) ^ 1690631827;
                        i7 = 1806794405;
                    }
                case -1616563912:
                case -559050293:
                    if (C1916.f6442) {
                        m6981 = C0630.m2566("ܽۛ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-27089)) ^ (-1964808193);
                        i7 = -1034679147;
                    } else {
                        m6981 = C2105.m6981("ۨ۟") ^ i5;
                        i6 = ((m6981 ^ i4) * (-17547)) ^ (-1615351278);
                        i7 = -591406561;
                    }
                case -1534498924:
                case 1970702998:
                    if (C1420.f5096 > 0) {
                        m6981 = C2105.m6981("ۨ۟") ^ i5;
                        i6 = ((m6981 ^ i4) * (-17547)) ^ (-1615351278);
                        i7 = -591406561;
                    } else {
                        m6981 = (C2105.m6981("ۖ֫") + i5) * (-121);
                        i6 = ((m6981 ^ i4) * (-15203)) ^ 1204109525;
                        i7 = 406892560;
                    }
                case -1157443209:
                case 181175017:
                    if (C0382.f1805) {
                        m6981 = (C2105.m6981("᩵֫") + i5) * 33;
                        i6 = ((m6981 ^ i4) * 25585) ^ 1141003631;
                        i7 = 1744943722;
                    } else {
                        m6981 = C2105.m6981("ܳۖ") ^ i5;
                        i6 = ((m6981 ^ i4) * 5625) ^ 682071875;
                        i7 = -902893308;
                    }
                case -877244375:
                case 148028274:
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = C2105.m6981("ܳۖ") ^ i5;
                        i6 = ((m6981 ^ i4) * 5625) ^ 682071875;
                        i7 = -902893308;
                    } else {
                        m6981 = C2105.m6981("ۙ۫") ^ i4;
                        i6 = ((m6981 ^ i5) * 6207) ^ 1083886361;
                        i7 = 1933847557;
                    }
                case -805772610:
                case 1590324569:
                    if (C2520.f8000 >= 0) {
                        m6981 = C2105.m6981("ۨ۟") ^ i5;
                        i6 = ((m6981 ^ i4) * (-17547)) ^ (-1615351278);
                        i7 = -591406561;
                    } else {
                        m6981 = C0630.m2566("ۨۘ") ^ i4;
                        i6 = ((m6981 ^ i5) * 15451) ^ (-1822628519);
                        i7 = -1782616975;
                    }
                case -703508490:
                case 1815319206:
                    if (C0630.f2410 <= 0) {
                        m6981 = (C2105.m6981("ۖ֫") + i5) * (-121);
                        i6 = ((m6981 ^ i4) * (-15203)) ^ 1204109525;
                        i7 = 406892560;
                    } else {
                        m6981 = C2105.m6981("ۧᩳ") ^ i5;
                        i6 = ((m6981 ^ i4) * 16861) ^ 1326964773;
                        i7 = -487631661;
                    }
                case -54305102:
                case 1838274962:
                    if (C22628.f73083 <= 0) {
                        m6981 = C2105.m6981("ۨ۟") ^ i5;
                        i6 = ((m6981 ^ i4) * (-17547)) ^ (-1615351278);
                        i7 = -591406561;
                    } else {
                        m6981 = (C0630.m2566("ۛۚ") + i4) * 19;
                        i6 = ((m6981 ^ i5) * (-22695)) ^ 425790524;
                        i7 = -1374698823;
                    }
                case 60575979:
                case 73547539:
                    C1711.m5736();
                    C5695.m16023();
                    break;
                case 98138438:
                case 1757645627:
                    if (C4616.f14690 <= 0) {
                        m6981 = C0630.m2566("ۖ֨") ^ i4;
                        i6 = ((m6981 ^ i5) * (-25703)) ^ 1645360525;
                        i7 = 1540043506;
                    } else {
                        m6981 = C0630.m2566("ۧܳ") ^ i5;
                        i6 = ((m6981 ^ i4) * (-12139)) ^ 1143244653;
                        i7 = 601937309;
                    }
                case 353190148:
                case 924430337:
                    if (C1711.f5919) {
                        m6981 = C0630.m2566("ۖ֨") ^ i4;
                        i6 = ((m6981 ^ i5) * (-25703)) ^ 1645360525;
                        i7 = 1540043506;
                    } else {
                        m6981 = C0630.m2566("ܽۛ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-27089)) ^ (-1964808193);
                        i7 = -1034679147;
                    }
                case 361832017:
                case 1256486075:
                    if (C0964.m3413()) {
                        m6981 = C2105.m6981("ۢ᩷") ^ i4;
                        i6 = ((m6981 ^ i5) * 23995) ^ (-252734405);
                        i7 = 644822353;
                    } else {
                        m6981 = C2105.m6981("ۨ۟") ^ i5;
                        i6 = ((m6981 ^ i4) * (-17547)) ^ (-1615351278);
                        i7 = -591406561;
                    }
                case 1093513505:
                case 1576638145:
                    if (C3537.f11231 >= 0) {
                        m6981 = C2105.m6981("ܳۖ") ^ i5;
                        i6 = ((m6981 ^ i4) * 5625) ^ 682071875;
                        i7 = -902893308;
                    } else {
                        m6981 = (C0630.m2566("ۡۢ") ^ i5) * 45;
                        i6 = ((m6981 ^ i4) * 7589) ^ (-2010442815);
                        i7 = 1375521985;
                    }
                case 1158620375:
                case 1642956913:
                    m10218(i, C0422.m1958(this, i2), z);
                    break;
                default:
                    C11340.m28031();
                    m6981 = C2105.m6981("ۨ۟") ^ i5;
                    i6 = ((m6981 ^ i4) * (-17547)) ^ (-1615351278);
                    i7 = -591406561;
            }
            return;
        }
    }

    /* renamed from: ۧ */
    public void mo123(Intent intent) {
        throw new RuntimeException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10210(ViewGroup viewGroup, int i) {
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        View view = null;
        int i5 = 1875844524;
        int i6 = C0483.f2088;
        int i7 = C7811.f24123;
        int m2566 = C0630.m2566("᩵᩺") ^ i6;
        int i8 = ((m2566 ^ i7) * 21411) ^ (-286666493);
        int i9 = -302522170;
        while (true) {
            i5 = ((((i5 ^ i7) * 8707) >> 31) & i8) ^ (m2566 ^ i9);
            switch (i5) {
                case -1988311203:
                case -1891959738:
                    return true;
                case -1974771801:
                case 1496263322:
                    if (RunnableC3474.f10992 <= 0) {
                        m2566 = (C2105.m6981("ۤᩴ") ^ i7) * (-47);
                        i8 = ((m2566 ^ i6) * 19735) ^ (-979454656);
                        i9 = 995513170;
                    } else {
                        m2566 = C2105.m6981("ܰ۟") ^ i7;
                        i8 = ((m2566 ^ i6) * (-7065)) ^ (-503120900);
                        i9 = -1372091594;
                    }
                case -1837006207:
                case -1299859711:
                    if (C1420.f5096 <= 0) {
                        m2566 = (C0630.m2566("ۧ۫") ^ i7) * (-31);
                        i8 = ((m2566 ^ i6) * 30631) ^ (-1117416850);
                        i9 = 848575181;
                    } else {
                        m2566 = C2105.m6981("֨ۢ") ^ i6;
                        i8 = ((m2566 ^ i7) * 17775) ^ (-487002331);
                        i9 = -1107444739;
                    }
                case -1814392954:
                case 829370207:
                    view = C2958.m9024(viewGroup, i4);
                    if (view.getVisibility() == 0) {
                        m2566 = C2105.m6981("ܽ֨") ^ i6;
                        i8 = ((m2566 ^ i7) * 19351) ^ 2090026647;
                        i9 = -137448133;
                    } else {
                        m2566 = C2105.m6981("֨᩻") ^ i7;
                        i8 = ((m2566 ^ i6) * 8093) ^ 2109791636;
                        i9 = -1866275547;
                    }
                case -1697443808:
                case 853014624:
                    if (C1420.f5096 <= 0) {
                        m2566 = (C0630.m2566("ۧ۫") ^ i7) * (-31);
                        i8 = ((m2566 ^ i6) * 30631) ^ (-1117416850);
                        i9 = 848575181;
                    } else {
                        m2566 = C2105.m6981("ܳ᩸") ^ i6;
                        i8 = ((m2566 ^ i7) * 18167) ^ 556721680;
                        i9 = -1947908624;
                    }
                case -1486467393:
                case -780869390:
                    if (C2105.f7037 != 0) {
                        m2566 = C0630.m2566("۬ܶ") ^ i7;
                        i8 = ((m2566 ^ i6) * 18509) ^ 1631092090;
                        i9 = -1196240529;
                    } else {
                        m2566 = C0630.m2566("᩷ܳ") ^ i7;
                        i8 = ((m2566 ^ i6) * (-32541)) ^ 1548877423;
                        i9 = 1944890219;
                    }
                case -1449709460:
                case 1856366493:
                    if (C1047.m3599() >= 0) {
                        m2566 = C0630.m2566("۬ܶ") ^ i7;
                        i8 = ((m2566 ^ i6) * 18509) ^ 1631092090;
                        i9 = -1196240529;
                    } else {
                        m2566 = (C2105.m6981("ۤۛ") + i6) * (-55);
                        i8 = ((m2566 ^ i7) * 11821) ^ 55991796;
                        i9 = -2056095635;
                    }
                case -1411636178:
                case 155372002:
                    C3911.m11924();
                    m2566 = (C0630.m2566("ۧ۫") ^ i7) * (-31);
                    i8 = ((m2566 ^ i6) * 30631) ^ (-1117416850);
                    i9 = 848575181;
                case -1405188843:
                case -607869632:
                    if (view instanceof ViewGroup) {
                        m2566 = (C0630.m2566("᩵ۚ") ^ i7) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i8 = ((m2566 ^ i6) * (-16963)) ^ 1378825154;
                        i9 = 759197330;
                    } else {
                        m2566 = C2105.m6981("ܶܶ") ^ i6;
                        i8 = ((m2566 ^ i7) * 8799) ^ 950855469;
                        i9 = -2074189820;
                    }
                case -1258900253:
                case -173557357:
                    if (C11340.m28026(view) > 0) {
                        m2566 = (C2105.m6981("ۧ֫") ^ i7) * 57;
                        i8 = ((m2566 ^ i6) * (-18425)) ^ (-637821459);
                        i9 = 843605406;
                    } else {
                        m2566 = C2105.m6981("֨᩻") ^ i7;
                        i8 = ((m2566 ^ i6) * 8093) ^ 2109791636;
                        i9 = -1866275547;
                    }
                case -1228447371:
                case 1583697207:
                    if (i4 < C1128.m3848(viewGroup)) {
                        m2566 = C2105.m6981("ܺ֡") ^ i6;
                        i8 = ((m2566 ^ i7) * 7591) ^ (-488643124);
                        i9 = -296968965;
                    } else {
                        m2566 = (C2105.m6981("ۚۙ") ^ i7) * (-115);
                        i8 = ((m2566 ^ i6) * 24975) ^ 392275366;
                        i9 = 722381482;
                    }
                case -1144134880:
                case 1098440590:
                    C1773.m5908();
                    C1504.m5179();
                    return false;
                case -1038133840:
                case 1893145687:
                    if (C3019.m9255() <= 0) {
                        m2566 = (C0630.m2566("ۧ۫") ^ i7) * (-31);
                        i8 = ((m2566 ^ i6) * 30631) ^ (-1117416850);
                        i9 = 848575181;
                    } else {
                        m2566 = C0630.m2566("ۜ۠") ^ i6;
                        i8 = ((m2566 ^ i7) * (-3333)) ^ 755899052;
                        i9 = 395903287;
                    }
                case -927298384:
                case -23510436:
                    i2 = -1;
                    if (C5695.f17556 >= 0) {
                        m2566 = C2105.m6981("ۖܽ") ^ i6;
                        i8 = ((m2566 ^ i7) * (-7609)) ^ (-1175755571);
                        i9 = -699461108;
                    } else {
                        m2566 = C2105.m6981("۠ۗ") ^ i7;
                        i8 = ((m2566 ^ i6) * (-23901)) ^ (-479234443);
                        i9 = -60325356;
                    }
                case -924997295:
                case 1422322262:
                    if (C1047.f3863 >= 0) {
                        m2566 = C0630.m2566("᩸֨") ^ i6;
                        i8 = ((m2566 ^ i7) * (-6823)) ^ (-1008023632);
                        i9 = -1408756681;
                    } else {
                        m2566 = C0630.m2566("ۨۙ") ^ i7;
                        i8 = ((m2566 ^ i6) * 8903) ^ 383568435;
                        i9 = 594647863;
                    }
                case -748362818:
                case 556984753:
                    i4++;
                    m2566 = C2105.m6981("ᩴᩴ") ^ i6;
                    i8 = ((m2566 ^ i7) * (-25163)) ^ 2068566998;
                    i9 = 1776777718;
                case -697674207:
                case -256984201:
                    C1711.m5736();
                    if (C3746.f11829 > 0) {
                        m2566 = (C0630.m2566("ۧ۫") ^ i7) * (-31);
                        i8 = ((m2566 ^ i6) * 30631) ^ (-1117416850);
                        i9 = 848575181;
                    } else {
                        m2566 = C0630.m2566("᩸֨") ^ i6;
                        i8 = ((m2566 ^ i7) * (-6823)) ^ (-1008023632);
                        i9 = -1408756681;
                    }
                case 107353405:
                case 686622003:
                    if (C3911.m11931(view) > 0) {
                        m2566 = C2105.m6981("ۤ֫") ^ i6;
                        i8 = ((m2566 ^ i7) * 24313) ^ 514009499;
                        i9 = 713307351;
                    } else {
                        m2566 = C2105.m6981("֨᩻") ^ i7;
                        i8 = ((m2566 ^ i6) * 8093) ^ 2109791636;
                        i9 = -1866275547;
                    }
                case 112734467:
                case 1908552587:
                    i4 = 0;
                    m2566 = C2105.m6981("ᩴᩴ") ^ i6;
                    i8 = ((m2566 ^ i7) * (-25163)) ^ 2068566998;
                    i9 = 1776777718;
                case 158113576:
                case 1251639952:
                    C1504.m5179();
                    if (C4075.f12947 < 0) {
                        m2566 = C0630.m2566("᩸֨") ^ i6;
                        i8 = ((m2566 ^ i7) * (-6823)) ^ (-1008023632);
                        i9 = -1408756681;
                    } else {
                        m2566 = (C2105.m6981("ۤᩴ") ^ i7) * (-47);
                        i8 = ((m2566 ^ i6) * 19735) ^ (-979454656);
                        i9 = 995513170;
                    }
                case 183660231:
                case 1304111876:
                    if (m10210((ViewGroup) view, i3)) {
                        m2566 = (C0630.m2566("ۧܿ") + i6) * 115;
                        i8 = ((m2566 ^ i7) * (-3571)) ^ 1443135253;
                        i9 = -1300627513;
                    } else {
                        m2566 = C2105.m6981("֨᩻") ^ i7;
                        i8 = ((m2566 ^ i6) * 8093) ^ 2109791636;
                        i9 = -1866275547;
                    }
                case 879301344:
                case 1932032004:
                    C3663.m11168();
                    if (C1916.f6442) {
                        m2566 = (C0630.m2566("ۧ۫") ^ i7) * (-31);
                        i8 = ((m2566 ^ i6) * 30631) ^ (-1117416850);
                        i9 = 848575181;
                    } else {
                        m2566 = C0630.m2566("۬ܶ") ^ i7;
                        i8 = ((m2566 ^ i6) * 18509) ^ 1631092090;
                        i9 = -1196240529;
                    }
                case 976026290:
                case 1487928065:
                    return z;
                case 1202375241:
                case 1873831509:
                    C7106.m19120();
                    if (C4159.f13567) {
                        m2566 = C0630.m2566("۬ܶ") ^ i7;
                        i8 = ((m2566 ^ i6) * 18509) ^ 1631092090;
                        i9 = -1196240529;
                    } else {
                        m2566 = (C0630.m2566("֫᩻") + i6) * (-125);
                        i8 = ((m2566 ^ i7) * (-25971)) ^ 869708944;
                        i9 = -583659208;
                    }
                case 1301781668:
                case 1429038376:
                    i3 = i + i2;
                    z = false;
                    if (i3 <= 0) {
                        m2566 = (C2105.m6981("ۚۙ") ^ i7) * (-115);
                        i8 = ((m2566 ^ i6) * 24975) ^ 392275366;
                        i9 = 722381482;
                    } else {
                        m2566 = (C0630.m2566("ܿ᩷") ^ i7) * 85;
                        i8 = ((m2566 ^ i6) * 10971) ^ 231339984;
                        i9 = 310150280;
                    }
                case 1438979094:
                case 1534972103:
                    return view.getGlobalVisibleRect(new Rect());
                case 1658739652:
                case 1989051203:
                    if (C3245.f10203 <= 0) {
                        m2566 = (C0630.m2566("ۧ۫") ^ i7) * (-31);
                        i8 = ((m2566 ^ i6) * 30631) ^ (-1117416850);
                        i9 = 848575181;
                    } else {
                        m2566 = (C0630.m2566("ۧܶ") + i7) * 99;
                        i8 = ((m2566 ^ i6) * 22541) ^ (-502073636);
                        i9 = -1093389249;
                    }
                default:
                    if (C0964.m3413()) {
                        m2566 = C0630.m2566("᩺ᩴ") ^ i6;
                        i8 = ((m2566 ^ i7) * 16007) ^ 1939366975;
                        i9 = 240449995;
                    } else {
                        m2566 = (C0630.m2566("ۧ۫") ^ i7) * (-31);
                        i8 = ((m2566 ^ i6) * 30631) ^ (-1117416850);
                        i9 = 848575181;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10228(C13064 c13064) {
        int i = 0;
        Resources.Theme theme = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        Window window = null;
        int i5 = 267933573;
        int i6 = ServiceConnectionC3453.f10921;
        int i7 = C1047.f3863;
        int m6981 = C2105.m6981("۫ۧ") ^ i6;
        int i8 = ((m6981 ^ i7) * (-7405)) ^ (-633253000);
        int i9 = -285555934;
        while (true) {
            i5 = ((((i5 ^ i7) * 6907) >> 31) & i8) ^ (m6981 ^ i9);
            switch (i5) {
                case -2136817699:
                case -1949323254:
                    i = R.attr.navigationBarColor;
                    if (C5695.m16023() >= 0) {
                        m6981 = C0630.m2566("۠ۚ") ^ i6;
                        i8 = ((m6981 ^ i7) * 16897) ^ 2103705680;
                        i9 = 1332085565;
                    } else {
                        m6981 = C0630.m2566("ܶۧ") ^ i6;
                        i8 = ((m6981 ^ i7) * 2001) ^ (-942251165);
                        i9 = 1366367201;
                    }
                case -2110820631:
                case -1785674946:
                    C1711.m5736();
                    m6981 = (C0630.m2566("ۜܺ") + i7) * 97;
                    i8 = ((m6981 ^ i6) * (-14729)) ^ 612729921;
                    i9 = 736518710;
                case -1910532838:
                case -825592770:
                    if (C0483.f2088 >= 0) {
                        m6981 = (i7 - C0630.m2566("ᩳᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((m6981 ^ i6) * 2883) ^ (-1025059802);
                        i9 = -1182198395;
                    } else {
                        m6981 = (i7 - C2105.m6981("ܿ᩶")) * (-15);
                        i8 = ((m6981 ^ i6) * (-3135)) ^ 1548771689;
                        i9 = 1759015079;
                    }
                case -1809146876:
                case -1550766665:
                    if (C5695.f17556 >= 0) {
                        m6981 = (C0630.m2566("ۜܺ") + i7) * 97;
                        i8 = ((m6981 ^ i6) * (-14729)) ^ 612729921;
                        i9 = 736518710;
                    } else {
                        m6981 = (i7 - C0630.m2566("ᩳᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((m6981 ^ i6) * 2883) ^ (-1025059802);
                        i9 = -1182198395;
                    }
                case -1599565677:
                case 1932074123:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = (i7 - C0630.m2566("ᩳᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((m6981 ^ i6) * 2883) ^ (-1025059802);
                        i9 = -1182198395;
                    } else {
                        m6981 = C0630.m2566("ܺ᩷") ^ i6;
                        i8 = ((m6981 ^ i7) * (-6997)) ^ (-350136174);
                        i9 = -1188763863;
                    }
                case -1456488601:
                case 697031328:
                    i2 = C0382.m1839(theme, i);
                    i3 = R.attr.colorBackground;
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = (i7 - C0630.m2566("ᩳᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((m6981 ^ i6) * 2883) ^ (-1025059802);
                        i9 = -1182198395;
                    } else {
                        m6981 = (C0630.m2566("ۘ᩵") + i7) * 101;
                        i8 = ((m6981 ^ i6) * 3207) ^ 594408977;
                        i9 = -1568662435;
                    }
                case -1329927395:
                case 1699298232:
                    RunnableC3474.m10630();
                    if (C1294.f4556 < 0) {
                        m6981 = (C0630.m2566("ۜܺ") + i7) * 97;
                        i8 = ((m6981 ^ i6) * (-14729)) ^ 612729921;
                        i9 = 736518710;
                    } else {
                        m6981 = C0630.m2566("۠ۚ") ^ i6;
                        i8 = ((m6981 ^ i7) * 16897) ^ 2103705680;
                        i9 = 1332085565;
                    }
                case -1322567215:
                case 1008095137:
                    C0964.m3413();
                    C3019.m9255();
                    break;
                case -1115289376:
                case -180467349:
                    theme = getTheme();
                    if (C0483.f2088 >= 0) {
                        m6981 = C0630.m2566("᩺ۤ") ^ i7;
                        i8 = ((m6981 ^ i6) * 13041) ^ (-2136512218);
                        i9 = 1036113374;
                    } else {
                        m6981 = C2105.m6981("᩻᩺") ^ i7;
                        i8 = ((m6981 ^ i6) * (-11779)) ^ 274680809;
                        i9 = 609547601;
                    }
                case -1026114479:
                case -274810881:
                    C2167.m7158(c13064, i2);
                    window = C7106.m19115(this);
                    if (C2126.f7087) {
                        m6981 = (i7 - C0630.m2566("ᩳᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((m6981 ^ i6) * 2883) ^ (-1025059802);
                        i9 = -1182198395;
                    } else {
                        m6981 = (i7 - C0630.m2566("ۡ᩸")) * 59;
                        i8 = ((m6981 ^ i6) * (-13265)) ^ (-1434858111);
                        i9 = 1747439438;
                    }
                case -728753565:
                case -229257400:
                    window.setNavigationBarColor(0);
                    break;
                case -727708136:
                case 1520234400:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = (i7 - C0630.m2566("ᩳᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((m6981 ^ i6) * 2883) ^ (-1025059802);
                        i9 = -1182198395;
                    } else {
                        m6981 = C2105.m6981("۠۫") ^ i6;
                        i8 = ((m6981 ^ i7) * 15151) ^ 1005629782;
                        i9 = -1612827152;
                    }
                case -617084592:
                case 1916295683:
                    i4 = C3432.m10492(getTheme(), i3);
                    if (i2 == i4) {
                        m6981 = (i6 - C0630.m2566("ۧ۟")) * (-47);
                        i8 = ((m6981 ^ i7) * 13847) ^ (-747195255);
                        i9 = -1133199287;
                    } else {
                        m6981 = C0630.m2566("֨᩹") ^ i6;
                        i8 = ((m6981 ^ i7) * (-11633)) ^ (-1328953616);
                        i9 = -208954774;
                    }
                case -583847063:
                case 34466574:
                    if (C0050.m940() <= 0) {
                        m6981 = (i7 - C0630.m2566("ᩳᩳ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i8 = ((m6981 ^ i6) * 2883) ^ (-1025059802);
                        i9 = -1182198395;
                    } else {
                        m6981 = (C0630.m2566("ܿۧ") ^ i6) * (-117);
                        i8 = ((m6981 ^ i7) * (-25363)) ^ 982362761;
                        i9 = 1024180658;
                    }
                case -334345886:
                case 474825409:
                    C11340.m28031();
                    if (C3683.m11222()) {
                        m6981 = (i6 - C2105.m6981("᩹֡")) * (-65);
                        i8 = ((m6981 ^ i7) * (-7583)) ^ 1491208646;
                        i9 = 1475548209;
                    } else {
                        m6981 = (C0630.m2566("ۜܺ") + i7) * 97;
                        i8 = ((m6981 ^ i6) * (-14729)) ^ 612729921;
                        i9 = 736518710;
                    }
                case 528262859:
                case 1831483011:
                    C2167.m7158(c13064, i4);
                    C1916.m6300(this).setNavigationBarColor(i2);
                    break;
                case 1000059002:
                case 1439950884:
                    if (C1916.f6442) {
                        m6981 = C2105.m6981("ۛ֫") ^ i7;
                        i8 = ((m6981 ^ i6) * (-7147)) ^ 1397552778;
                        i9 = 232415364;
                    } else {
                        m6981 = (C0630.m2566("ۜܺ") + i7) * 97;
                        i8 = ((m6981 ^ i6) * (-14729)) ^ 612729921;
                        i9 = 736518710;
                    }
                default:
                    if (C3663.f11553) {
                        m6981 = (C0630.m2566("ۜܺ") + i7) * 97;
                        i8 = ((m6981 ^ i6) * (-14729)) ^ 612729921;
                        i9 = 736518710;
                    } else {
                        m6981 = C0630.m2566("᩶᩹") ^ i7;
                        i8 = ((m6981 ^ i6) * 26035) ^ 847877590;
                        i9 = -672685046;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (l.C1128.f4106 <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (l.C3663.f11553 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractActivityC3346() {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.<init>():void");
    }

    @Override // l.ActivityC0737, android.app.Activity
    public void onResume() {
        String str = null;
        Runnable runnable = null;
        Runnable runnable2 = null;
        int i = -1428678436;
        int i2 = C11340.f33930;
        int i3 = C3019.f9544;
        int m6981 = (C2105.m6981("ۨۤ") ^ i3) * (-27);
        int i4 = ((m6981 ^ i2) * 10589) ^ (-1779638247);
        int i5 = 2026228614;
        while (true) {
            i = ((((i ^ i2) * 9501) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2065885275:
                case 1909862827:
                    break;
                case -2064729699:
                case -1719601704:
                    C1711.m5736();
                    if (C5695.f17556 < 0) {
                        m6981 = (C0630.m2566("ᩳܽ") ^ i2) * (-103);
                        i4 = ((m6981 ^ i3) * 31123) ^ (-1298265146);
                        i5 = -1217844518;
                    } else {
                        m6981 = C0630.m2566("ۡ֫") ^ i2;
                        i4 = ((m6981 ^ i3) * 12877) ^ (-1914473894);
                        i5 = -469850580;
                    }
                case -2052730746:
                case 1662896318:
                    if (C0050.m940() <= 0) {
                        m6981 = C0630.m2566("ۡ֫") ^ i2;
                        i4 = ((m6981 ^ i3) * 12877) ^ (-1914473894);
                        i5 = -469850580;
                    } else {
                        m6981 = (C0630.m2566("᩷۠") ^ i2) * (-81);
                        i4 = ((m6981 ^ i3) * 11805) ^ 482056499;
                        i5 = -1674659785;
                    }
                case -1909990844:
                case -1607124442:
                    str = mo121();
                    int i6 = C6741.f20946;
                    if (C15871.m37616()) {
                        m6981 = (C0630.m2566("ۗ᩻") + i2) * 5;
                        i4 = ((m6981 ^ i3) * (-20725)) ^ 2071652213;
                        i5 = -2048945287;
                    } else {
                        m6981 = (C2105.m6981("᩻ۜ") + i3) * 63;
                        i4 = ((m6981 ^ i2) * (-21333)) ^ 1943431124;
                        i5 = -894795468;
                    }
                case -1757819846:
                case 86729379:
                    super.onResume();
                    if (C1504.m5179()) {
                        m6981 = C0630.m2566("ۧۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-9389)) ^ (-1745654667);
                        i5 = -1815472672;
                    } else {
                        m6981 = (C0630.m2566("ᩳܽ") ^ i2) * (-103);
                        i4 = ((m6981 ^ i3) * 31123) ^ (-1298265146);
                        i5 = -1217844518;
                    }
                case -1593245767:
                case -739921444:
                    C2956.m9015(this);
                    if (this.f10582 != null) {
                        m6981 = C0630.m2566("ۜۘ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-23093)) ^ 582002688;
                        i5 = -1715337906;
                    } else {
                        m6981 = (C2105.m6981("ۢۖ") + i2) * 51;
                        i4 = ((m6981 ^ i3) * 20639) ^ (-1210061478);
                        i5 = -344225231;
                    }
                case -1587080144:
                case 824298144:
                    if (C2167.f7158 >= 0) {
                        m6981 = (C0630.m2566("ᩳܽ") ^ i2) * (-103);
                        i4 = ((m6981 ^ i3) * 31123) ^ (-1298265146);
                        i5 = -1217844518;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۙۙ")) * 45;
                        i4 = ((m6981 ^ i2) * 421) ^ 940294323;
                        i5 = -1435747337;
                    }
                case -1343609503:
                case 952907099:
                    if (C4925.m14339()) {
                        m6981 = C2105.m6981("ܰܰ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-3041)) ^ (-1836670638);
                        i5 = -78783650;
                    } else {
                        m6981 = (C2105.m6981("ۖۚ") ^ i2) * (-67);
                        i4 = ((m6981 ^ i3) * (-5271)) ^ 1177413158;
                        i5 = -60645443;
                    }
                case -1322899525:
                case 1935255294:
                    MobclickAgent.onPageStart(str);
                    MobclickAgent.onResume(this);
                    m6981 = (C0630.m2566("ۗ᩻") + i2) * 5;
                    i4 = ((m6981 ^ i3) * (-20725)) ^ 2071652213;
                    i5 = -2048945287;
                case -868894428:
                case -102250251:
                    RunnableC0588.m2441();
                    if (C3663.f11553) {
                        m6981 = C0630.m2566("ۡ֫") ^ i2;
                        i4 = ((m6981 ^ i3) * 12877) ^ (-1914473894);
                        i5 = -469850580;
                    } else {
                        m6981 = C2105.m6981("֫ۘ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-16571)) ^ (-889701488);
                        i5 = -535513064;
                    }
                case -663080310:
                case -108607342:
                    if (C1294.f4556 >= 0) {
                        m6981 = C0630.m2566("ۡ֫") ^ i2;
                        i4 = ((m6981 ^ i3) * 12877) ^ (-1914473894);
                        i5 = -469850580;
                    } else {
                        m6981 = C0630.m2566("֡ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 20769) ^ 1612183933;
                        i5 = -2033244116;
                    }
                case -560592321:
                case 848532038:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = C2105.m6981("֫ۘ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-16571)) ^ (-889701488);
                        i5 = -535513064;
                    } else {
                        m6981 = C0630.m2566("ᩴ۠") ^ i2;
                        i4 = ((m6981 ^ i3) * 405) ^ (-1473117458);
                        i5 = -1968684438;
                    }
                case -207549452:
                case 1585536954:
                    if (C3663.f11553) {
                        m6981 = (i2 - C0630.m2566("ܳ᩶")) * 23;
                        i4 = ((m6981 ^ i3) * 2615) ^ 2121808936;
                        i5 = -162213814;
                    } else {
                        m6981 = C0630.m2566("᩻ܺ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-20047)) ^ (-2082300677);
                        i5 = 903382885;
                    }
                case -199338680:
                case 384611502:
                    C2272.m7505(this);
                    m6981 = (C2105.m6981("ۖۚ") ^ i2) * (-67);
                    i4 = ((m6981 ^ i3) * (-5271)) ^ 1177413158;
                    i5 = -60645443;
                case -166153104:
                case 230000485:
                    if (RunnableC1937.f6483 < 0) {
                        m6981 = C0630.m2566("ۡ֫") ^ i2;
                        i4 = ((m6981 ^ i3) * 12877) ^ (-1914473894);
                        i5 = -469850580;
                    } else {
                        m6981 = (C2105.m6981("ۙۗ") + i3) * 7;
                        i4 = ((m6981 ^ i2) * 14575) ^ (-962490489);
                        i5 = -420464966;
                    }
                case 337418748:
                case 892239064:
                    C0422.m1963();
                    C1128.m3851();
                    break;
                case 817211840:
                case 1121142476:
                    if (C22628.f73083 <= 0) {
                        m6981 = C2105.m6981("֫ۘ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-16571)) ^ (-889701488);
                        i5 = -535513064;
                    } else {
                        m6981 = C0630.m2566("ܳᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * 9243) ^ 968577775;
                        i5 = -595543311;
                    }
                case 901029122:
                case 1924328292:
                    this.f10582 = runnable2;
                    C1711.m5731(runnable);
                    m6981 = (C2105.m6981("ۢۖ") + i2) * 51;
                    i4 = ((m6981 ^ i3) * 20639) ^ (-1210061478);
                    i5 = -344225231;
                case 1102973448:
                case 1867678055:
                    if (this.f10588) {
                        m6981 = C0630.m2566("ۜ᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 6303) ^ (-440700660);
                        i5 = 1301568712;
                    } else {
                        m6981 = (C0630.m2566("ۗ᩻") + i2) * 5;
                        i4 = ((m6981 ^ i3) * (-20725)) ^ 2071652213;
                        i5 = -2048945287;
                    }
                case 1205923336:
                case 1353385909:
                    if (C1420.m4913()) {
                        m6981 = C0630.m2566("ۡ֫") ^ i2;
                        i4 = ((m6981 ^ i3) * 12877) ^ (-1914473894);
                        i5 = -469850580;
                    } else {
                        m6981 = (C2105.m6981("᩸֡") + i3) * 123;
                        i4 = ((m6981 ^ i2) * 17533) ^ (-161585734);
                        i5 = 481929797;
                    }
                case 1307113742:
                case 1637389214:
                    runnable = this.f10582;
                    runnable2 = null;
                    if (C1773.f6144 <= 0) {
                        m6981 = (i2 - C0630.m2566("ܳ᩶")) * 23;
                        i4 = ((m6981 ^ i3) * 2615) ^ 2121808936;
                        i5 = -162213814;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܶ۫")) * (-107);
                        i4 = ((m6981 ^ i2) * 21303) ^ (-997793829);
                        i5 = -1737541995;
                    }
                case 1390787241:
                case 1550634177:
                    if (C1128.f4106 <= 0) {
                        m6981 = (C2105.m6981("ۙۗ") + i3) * 7;
                        i4 = ((m6981 ^ i2) * 14575) ^ (-962490489);
                        i5 = -420464966;
                    } else {
                        m6981 = C0630.m2566("ۗᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-7)) ^ (-1953946872);
                        i5 = 1745139466;
                    }
                default:
                    C0382.m1848();
                    C4263.m12819();
                    m6981 = (C0630.m2566("ᩳܽ") ^ i2) * (-103);
                    i4 = ((m6981 ^ i3) * 31123) ^ (-1298265146);
                    i5 = -1217844518;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (l.C1420.m4913() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (l.C4616.f14690 <= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
    
        if (l.C7811.f24123 < 0) goto L69;
     */
    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10232() {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.m10232():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21610 m10206(AbstractActivityC3346 abstractActivityC3346, View view, int[] iArr, View view2, int[] iArr2, C13064 c13064, View view3, View view4, int[] iArr3, int[] iArr4, View view5, View view6, int[] iArr5, int[] iArr6, View view7, int[] iArr7, View view8, int i, C21610 c21610) {
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        int i5;
        C21610 c216102;
        int i6;
        int i7;
        int i8;
        int m6981;
        int i9;
        int i10;
        int i11;
        int m2566;
        int i12;
        int i13;
        int i14;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int m69812;
        int i21;
        int i22;
        int m25662;
        int i23;
        int i24;
        int m25663;
        int i25;
        int i26;
        View view9 = view8;
        C21610 c216103 = c21610;
        int i27 = 0;
        int i28 = C4075.f12947;
        int i29 = RunnableC1937.f6483;
        int m25664 = (C0630.m2566("۠᩺") ^ i28) * 77;
        int i30 = ((m25664 ^ i29) * (-12263)) ^ 653265179;
        ViewGroup.MarginLayoutParams marginLayoutParams3 = null;
        int i31 = m25664 ^ (-856542753);
        int i32 = 2120074422;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        C11007 c11007 = null;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        char c = 0;
        char c2 = 0;
        char c3 = 0;
        int i40 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int i41 = i31 ^ (i30 & (((i32 ^ i29) * (-16655)) >> 31));
            switch (i41) {
                case -2138788839:
                case -115306135:
                    i2 = i41;
                    i14 = i33;
                    marginLayoutParams2 = marginLayoutParams3;
                    if (iArr7 != null) {
                        m25662 = (i28 - C0630.m2566("ۗܺ")) * 127;
                        i21 = ((m25662 ^ i29) * (-9167)) ^ (-98334070);
                        i23 = 581115089;
                        i24 = m25662 ^ i23;
                        i33 = i14;
                        marginLayoutParams3 = marginLayoutParams2;
                        i26 = i2;
                        i31 = i24;
                        i30 = i21;
                        i32 = i26;
                    }
                    i15 = i34;
                    i16 = i35;
                    i17 = i37;
                    i18 = i38;
                    i19 = i27;
                    i20 = i36;
                    m69812 = (i28 - C0630.m2566("֡᩶")) * (-45);
                    i21 = ((m69812 ^ i29) * (-18305)) ^ (-467982338);
                    i22 = -1077160616;
                    i24 = m69812 ^ i22;
                    i34 = i15;
                    i35 = i16;
                    i27 = i19;
                    i36 = i20;
                    i33 = i14;
                    marginLayoutParams3 = marginLayoutParams2;
                    i37 = i17;
                    i38 = i18;
                    view9 = view8;
                    c216103 = c21610;
                    i26 = i2;
                    i31 = i24;
                    i30 = i21;
                    i32 = i26;
                case -2078622479:
                case -36640573:
                    return C21610.f69386;
                case -2040393926:
                case 983533889:
                    i2 = i41;
                    i14 = i33;
                    marginLayoutParams2 = marginLayoutParams3;
                    view7.setPadding(iArr7[c], iArr7[i27] + i40, iArr7[c2], iArr7[c3]);
                    i15 = i34;
                    i16 = i35;
                    i17 = i37;
                    i18 = i38;
                    i19 = i27;
                    i20 = i36;
                    m69812 = (i28 - C0630.m2566("֡᩶")) * (-45);
                    i21 = ((m69812 ^ i29) * (-18305)) ^ (-467982338);
                    i22 = -1077160616;
                    i24 = m69812 ^ i22;
                    i34 = i15;
                    i35 = i16;
                    i27 = i19;
                    i36 = i20;
                    i33 = i14;
                    marginLayoutParams3 = marginLayoutParams2;
                    i37 = i17;
                    i38 = i18;
                    view9 = view8;
                    c216103 = c21610;
                    i26 = i2;
                    i31 = i24;
                    i30 = i21;
                    i32 = i26;
                case -2004057672:
                case 196109038:
                    i2 = i41;
                    i14 = i33;
                    marginLayoutParams2 = marginLayoutParams3;
                    i15 = i34;
                    i16 = i35;
                    i17 = i37;
                    i18 = i38;
                    i19 = i27;
                    i20 = i36;
                    z = true;
                    m69812 = (C2105.m6981("ۘ۟") + i29) * 97;
                    i21 = ((m69812 ^ i28) * (-7363)) ^ 1460457802;
                    i22 = 480790622;
                    i24 = m69812 ^ i22;
                    i34 = i15;
                    i35 = i16;
                    i27 = i19;
                    i36 = i20;
                    i33 = i14;
                    marginLayoutParams3 = marginLayoutParams2;
                    i37 = i17;
                    i38 = i18;
                    view9 = view8;
                    c216103 = c21610;
                    i26 = i2;
                    i31 = i24;
                    i30 = i21;
                    i32 = i26;
                case -1835956059:
                case 1644773234:
                    C0630.m2564();
                    if (C22628.f73083 <= 0) {
                        i2 = i41;
                        m25663 = (C2105.m6981("ۗۖ") + i28) * (-17);
                        i21 = ((m25663 ^ i29) * (-8215)) ^ (-1229825444);
                        i25 = 1577669056;
                        i24 = m25663 ^ i25;
                        i26 = i2;
                        i31 = i24;
                        i30 = i21;
                        i32 = i26;
                    } else {
                        int m25665 = C0630.m2566("ۘۨ") ^ i28;
                        i30 = ((m25665 ^ i29) * (-8121)) ^ (-2056575803);
                        i26 = i41;
                        i31 = m25665 ^ 1050950383;
                        i32 = i26;
                    }
                case -1813689897:
                case 994149327:
                    C1047.m3599();
                    C1711.m5736();
                    return null;
                case -1793610130:
                case -1343482343:
                    i2 = i41;
                    C0483.m2121();
                    i3 = i33;
                    marginLayoutParams = marginLayoutParams3;
                    i5 = i38;
                    c216102 = c216103;
                    i7 = i37;
                    i8 = i27;
                    int m69813 = (C2105.m6981("᩷ۘ") ^ i29) * (-121);
                    i27 = i8;
                    i30 = ((m69813 ^ i28) * 22337) ^ (-1430387987);
                    i32 = i2;
                    i31 = m69813 ^ (-1622064966);
                    i37 = i7;
                    i38 = i5;
                    c216103 = c216102;
                    i33 = i3;
                    marginLayoutParams3 = marginLayoutParams;
                    view9 = view8;
                case -1703960223:
                case 1279078795:
                    i2 = i41;
                    i3 = i33;
                    marginLayoutParams = marginLayoutParams3;
                    i4 = i34;
                    i5 = i38;
                    c216102 = c216103;
                    i6 = i36;
                    i7 = i37;
                    i8 = i27;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m6981 = C0630.m2566("ۙ֫") ^ i29;
                        i9 = ((m6981 ^ i28) * (-489)) ^ 2087998172;
                        i10 = 1584347627;
                        i11 = m6981 ^ i10;
                        i30 = i9;
                        i27 = i8;
                        i36 = i6;
                        i32 = i2;
                        i37 = i7;
                        i38 = i5;
                        c216103 = c216102;
                        i31 = i11;
                        i33 = i3;
                        marginLayoutParams3 = marginLayoutParams;
                        i34 = i4;
                        view9 = view8;
                    }
                    m6981 = (C0630.m2566("֫ۖ") ^ i29) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i9 = ((m6981 ^ i28) * 9111) ^ (-890546334);
                    i10 = -1744561863;
                    i11 = m6981 ^ i10;
                    i30 = i9;
                    i27 = i8;
                    i36 = i6;
                    i32 = i2;
                    i37 = i7;
                    i38 = i5;
                    c216103 = c216102;
                    i31 = i11;
                    i33 = i3;
                    marginLayoutParams3 = marginLayoutParams;
                    i34 = i4;
                    view9 = view8;
                case -1540875648:
                case 402005224:
                    i2 = i41;
                    i3 = i33;
                    marginLayoutParams = marginLayoutParams3;
                    i4 = i34;
                    i5 = i38;
                    c216102 = c216103;
                    i6 = i36;
                    i7 = i37;
                    i8 = i27;
                    if (C7106.f21815 == 0) {
                        m6981 = (C2105.m6981("ۨ᩶") ^ i28) * (-53);
                        i9 = ((m6981 ^ i29) * 31071) ^ 534016218;
                        i10 = 813746159;
                        i11 = m6981 ^ i10;
                        i30 = i9;
                        i27 = i8;
                        i36 = i6;
                        i32 = i2;
                        i37 = i7;
                        i38 = i5;
                        c216103 = c216102;
                        i31 = i11;
                        i33 = i3;
                        marginLayoutParams3 = marginLayoutParams;
                        i34 = i4;
                        view9 = view8;
                    }
                    i34 = i4;
                    i36 = i6;
                    int m698132 = (C2105.m6981("᩷ۘ") ^ i29) * (-121);
                    i27 = i8;
                    i30 = ((m698132 ^ i28) * 22337) ^ (-1430387987);
                    i32 = i2;
                    i31 = m698132 ^ (-1622064966);
                    i37 = i7;
                    i38 = i5;
                    c216103 = c216102;
                    i33 = i3;
                    marginLayoutParams3 = marginLayoutParams;
                    view9 = view8;
                case -1224740825:
                case 751109452:
                    i2 = i41;
                    C0050.m940();
                    if (RunnableC1937.f6483 >= 0) {
                        i3 = i33;
                        marginLayoutParams = marginLayoutParams3;
                        i5 = i38;
                        c216102 = c216103;
                        i7 = i37;
                        i8 = i27;
                        int m6981322 = (C2105.m6981("᩷ۘ") ^ i29) * (-121);
                        i27 = i8;
                        i30 = ((m6981322 ^ i28) * 22337) ^ (-1430387987);
                        i32 = i2;
                        i31 = m6981322 ^ (-1622064966);
                        i37 = i7;
                        i38 = i5;
                        c216103 = c216102;
                        i33 = i3;
                        marginLayoutParams3 = marginLayoutParams;
                        view9 = view8;
                    } else {
                        m25663 = (C2105.m6981("ۗۖ") + i28) * (-17);
                        i21 = ((m25663 ^ i29) * (-8215)) ^ (-1229825444);
                        i25 = 1577669056;
                        i24 = m25663 ^ i25;
                        i26 = i2;
                        i31 = i24;
                        i30 = i21;
                        i32 = i26;
                    }
                case -1209342655:
                case 664768754:
                    i2 = i41;
                    i14 = i33;
                    marginLayoutParams2 = marginLayoutParams3;
                    if (view9 != null) {
                        m25662 = C0630.m2566("ܿۡ") ^ i28;
                        i21 = ((m25662 ^ i29) * WhirlpoolDigest.REDUCTION_POLYNOMIAL) ^ 1301476954;
                        i23 = 1550259005;
                        i24 = m25662 ^ i23;
                        i33 = i14;
                        marginLayoutParams3 = marginLayoutParams2;
                        i26 = i2;
                        i31 = i24;
                        i30 = i21;
                        i32 = i26;
                    } else {
                        i33 = i14;
                        marginLayoutParams3 = marginLayoutParams2;
                        m25663 = (C0630.m2566("۠֫") + i29) * (-53);
                        i21 = ((m25663 ^ i28) * (-443)) ^ 800085481;
                        i25 = 913664132;
                        i24 = m25663 ^ i25;
                        i26 = i2;
                        i31 = i24;
                        i30 = i21;
                        i32 = i26;
                    }
                case -1106375020:
                case 1369202030:
                    i2 = i41;
                    i3 = i33;
                    marginLayoutParams = marginLayoutParams3;
                    i4 = i34;
                    i5 = i38;
                    c216102 = c216103;
                    i6 = i36;
                    i7 = i37;
                    i8 = i27;
                    if (C1916.f6442) {
                        m6981 = (C0630.m2566("۬ܺ") + i29) * (-27);
                        i9 = ((m6981 ^ i28) * (-22043)) ^ 1301874280;
                        i10 = -1961489104;
                        i11 = m6981 ^ i10;
                        i30 = i9;
                        i27 = i8;
                        i36 = i6;
                        i32 = i2;
                        i37 = i7;
                        i38 = i5;
                        c216103 = c216102;
                        i31 = i11;
                        i33 = i3;
                        marginLayoutParams3 = marginLayoutParams;
                        i34 = i4;
                        view9 = view8;
                    }
                    m6981 = (C0630.m2566("֫ۖ") ^ i29) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i9 = ((m6981 ^ i28) * 9111) ^ (-890546334);
                    i10 = -1744561863;
                    i11 = m6981 ^ i10;
                    i30 = i9;
                    i27 = i8;
                    i36 = i6;
                    i32 = i2;
                    i37 = i7;
                    i38 = i5;
                    c216103 = c216102;
                    i31 = i11;
                    i33 = i3;
                    marginLayoutParams3 = marginLayoutParams;
                    i34 = i4;
                    view9 = view8;
                case -1096743182:
                case 629300588:
                    i2 = i41;
                    i3 = i33;
                    marginLayoutParams = marginLayoutParams3;
                    i4 = i34;
                    i5 = i38;
                    c216102 = c216103;
                    i6 = i36;
                    i7 = i37;
                    i8 = i27;
                    if (!z2) {
                        m6981 = (C0630.m2566("ܰۛ") + i28) * 47;
                        i9 = ((m6981 ^ i29) * 32561) ^ 468084582;
                        i10 = 740785936;
                        i11 = m6981 ^ i10;
                        i30 = i9;
                        i27 = i8;
                        i36 = i6;
                        i32 = i2;
                        i37 = i7;
                        i38 = i5;
                        c216103 = c216102;
                        i31 = i11;
                        i33 = i3;
                        marginLayoutParams3 = marginLayoutParams;
                        i34 = i4;
                        view9 = view8;
                    }
                    i34 = i4;
                    i36 = i6;
                    int m69813222 = (C2105.m6981("᩷ۘ") ^ i29) * (-121);
                    i27 = i8;
                    i30 = ((m69813222 ^ i28) * 22337) ^ (-1430387987);
                    i32 = i2;
                    i31 = m69813222 ^ (-1622064966);
                    i37 = i7;
                    i38 = i5;
                    c216103 = c216102;
                    i33 = i3;
                    marginLayoutParams3 = marginLayoutParams;
                    view9 = view8;
                case -972229805:
                case 1973366458:
                    i2 = i41;
                    i3 = i33;
                    marginLayoutParams = marginLayoutParams3;
                    i7 = i37;
                    i5 = i38;
                    i39 = C0237.m1484(i7, i5);
                    c = 0;
                    i36 = iArr[0] + c11007.f33109;
                    i35 = iArr[1];
                    c2 = 2;
                    i34 = iArr[2] + c11007.f33110;
                    c3 = 3;
                    if (C0237.f1507 != 0) {
                        c216102 = c21610;
                        i8 = 1;
                        int m698132222 = (C2105.m6981("᩷ۘ") ^ i29) * (-121);
                        i27 = i8;
                        i30 = ((m698132222 ^ i28) * 22337) ^ (-1430387987);
                        i32 = i2;
                        i31 = m698132222 ^ (-1622064966);
                        i37 = i7;
                        i38 = i5;
                        c216103 = c216102;
                        i33 = i3;
                        marginLayoutParams3 = marginLayoutParams;
                        view9 = view8;
                    } else {
                        int m25666 = (C0630.m2566("᩻ۘ") ^ i28) * 13;
                        view9 = view8;
                        i37 = i7;
                        i38 = i5;
                        i32 = i2;
                        i33 = i3;
                        i27 = 1;
                        c216103 = c21610;
                        i31 = m25666 ^ 284874226;
                        i30 = ((m25666 ^ i29) * 23071) ^ (-534496610);
                        marginLayoutParams3 = marginLayoutParams;
                    }
                case -816232443:
                case 1080167534:
                    i2 = i41;
                    i3 = i33;
                    marginLayoutParams = marginLayoutParams3;
                    i4 = i34;
                    i5 = i38;
                    c216102 = c216103;
                    i6 = i36;
                    i7 = i37;
                    i8 = i27;
                    z2 = C2126.f7087;
                    m6981 = (C2105.m6981("ۙۘ") ^ i29) * 91;
                    i9 = ((m6981 ^ i28) * 20311) ^ 381224071;
                    i10 = -30399557;
                    i11 = m6981 ^ i10;
                    i30 = i9;
                    i27 = i8;
                    i36 = i6;
                    i32 = i2;
                    i37 = i7;
                    i38 = i5;
                    c216103 = c216102;
                    i31 = i11;
                    i33 = i3;
                    marginLayoutParams3 = marginLayoutParams;
                    i34 = i4;
                    view9 = view8;
                case -812892365:
                case 1822719215:
                    i2 = i41;
                    i3 = i33;
                    marginLayoutParams = marginLayoutParams3;
                    i4 = i34;
                    i5 = i38;
                    c216102 = c216103;
                    i6 = i36;
                    i7 = i37;
                    i8 = i27;
                    if (RunnableC1108.f4040) {
                        m6981 = C0630.m2566("ۖۧ") ^ i29;
                        i9 = ((m6981 ^ i28) * 13465) ^ (-264114611);
                        i10 = -1325417967;
                        i11 = m6981 ^ i10;
                        i30 = i9;
                        i27 = i8;
                        i36 = i6;
                        i32 = i2;
                        i37 = i7;
                        i38 = i5;
                        c216103 = c216102;
                        i31 = i11;
                        i33 = i3;
                        marginLayoutParams3 = marginLayoutParams;
                        i34 = i4;
                        view9 = view8;
                    }
                    m6981 = C2105.m6981("֡ᩳ") ^ i28;
                    i9 = ((m6981 ^ i29) * (-741)) ^ (-558251145);
                    i10 = -1836598606;
                    i11 = m6981 ^ i10;
                    i30 = i9;
                    i27 = i8;
                    i36 = i6;
                    i32 = i2;
                    i37 = i7;
                    i38 = i5;
                    c216103 = c216102;
                    i31 = i11;
                    i33 = i3;
                    marginLayoutParams3 = marginLayoutParams;
                    i34 = i4;
                    view9 = view8;
                case -770189257:
                case 2025579222:
                    i2 = i41;
                    marginLayoutParams3.bottomMargin = i33;
                    view9.setLayoutParams(marginLayoutParams3);
                    m25663 = (C0630.m2566("۠֫") + i29) * (-53);
                    i21 = ((m25663 ^ i28) * (-443)) ^ 800085481;
                    i25 = 913664132;
                    i24 = m25663 ^ i25;
                    i26 = i2;
                    i31 = i24;
                    i30 = i21;
                    i32 = i26;
                case -734206617:
                case 1000878733:
                    i2 = i41;
                    marginLayoutParams3 = (ViewGroup.MarginLayoutParams) C7811.m20836(view8);
                    i33 = i + i39;
                    if (marginLayoutParams3.bottomMargin != i33) {
                        m25663 = (i29 - C0630.m2566("ۜ᩻")) * (-39);
                        i21 = ((m25663 ^ i28) * (-16285)) ^ 899459104;
                        i25 = -1093235579;
                        i24 = m25663 ^ i25;
                        i26 = i2;
                        i31 = i24;
                        i30 = i21;
                        i32 = i26;
                    }
                    m25663 = (C0630.m2566("۠֫") + i29) * (-53);
                    i21 = ((m25663 ^ i28) * (-443)) ^ 800085481;
                    i25 = 913664132;
                    i24 = m25663 ^ i25;
                    i26 = i2;
                    i31 = i24;
                    i30 = i21;
                    i32 = i26;
                case -193290531:
                case 1333064943:
                    i2 = i41;
                    i3 = i33;
                    marginLayoutParams = marginLayoutParams3;
                    i4 = i34;
                    i5 = i38;
                    c216102 = c216103;
                    i6 = i36;
                    i7 = i37;
                    i8 = i27;
                    if (C4075.f12947 < 0) {
                        m6981 = (C0630.m2566("ܽۛ") ^ i29) * 9;
                        i9 = ((m6981 ^ i28) * 30401) ^ (-1770584913);
                        i10 = 1210356178;
                        i11 = m6981 ^ i10;
                        i30 = i9;
                        i27 = i8;
                        i36 = i6;
                        i32 = i2;
                        i37 = i7;
                        i38 = i5;
                        c216103 = c216102;
                        i31 = i11;
                        i33 = i3;
                        marginLayoutParams3 = marginLayoutParams;
                        i34 = i4;
                        view9 = view8;
                    }
                    m6981 = C2105.m6981("֡ᩳ") ^ i28;
                    i9 = ((m6981 ^ i29) * (-741)) ^ (-558251145);
                    i10 = -1836598606;
                    i11 = m6981 ^ i10;
                    i30 = i9;
                    i27 = i8;
                    i36 = i6;
                    i32 = i2;
                    i37 = i7;
                    i38 = i5;
                    c216103 = c216102;
                    i31 = i11;
                    i33 = i3;
                    marginLayoutParams3 = marginLayoutParams;
                    i34 = i4;
                    view9 = view8;
                case -58658093:
                case 1249652504:
                    int i42 = i33;
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = marginLayoutParams3;
                    int i43 = i34;
                    int i44 = i35;
                    int i45 = i37;
                    int i46 = i38;
                    int i47 = i27;
                    int i48 = i36;
                    view.setPadding(i48, i44, i43, iArr[c3] + i39);
                    int i49 = iArr2[c];
                    int i50 = iArr2[i47];
                    int i51 = c11007.f33111;
                    view2.setPadding(i49, i50 + i51, iArr2[c2], iArr2[c3]);
                    int i52 = C17648.f53953;
                    if (c13064.getLayoutDirection() == i47) {
                        m2566 = C0630.m2566("᩸ۡ") ^ i28;
                        i12 = ((m2566 ^ i29) * (-18081)) ^ (-392248109);
                        i13 = 13937417;
                    } else {
                        m2566 = C0630.m2566("ᩴᩳ") ^ i29;
                        i12 = ((m2566 ^ i28) * (-4677)) ^ (-1388329704);
                        i13 = -1098605281;
                    }
                    int i53 = m2566 ^ i13;
                    i34 = i43;
                    i35 = i44;
                    i40 = i51;
                    i27 = i47;
                    i36 = i48;
                    i32 = i41;
                    marginLayoutParams3 = marginLayoutParams4;
                    i37 = i45;
                    i38 = i46;
                    view9 = view8;
                    c216103 = c21610;
                    i31 = i53;
                    i30 = i12;
                    i33 = i42;
                case 306607436:
                case 555532266:
                    i2 = i41;
                    i3 = i33;
                    marginLayoutParams = marginLayoutParams3;
                    i4 = i34;
                    i8 = i27;
                    i6 = i36;
                    c216102 = c216103;
                    c11007 = abstractActivityC3346.mo114(c216102);
                    C11007 m48815 = c216102.m48815(8);
                    int i54 = c11007.f33108;
                    int i55 = m48815.f33108;
                    if (C1294.f4556 >= 0) {
                        i5 = i55;
                        i7 = i54;
                        m6981 = C2105.m6981("֡ᩳ") ^ i28;
                        i9 = ((m6981 ^ i29) * (-741)) ^ (-558251145);
                        i10 = -1836598606;
                        i11 = m6981 ^ i10;
                        i30 = i9;
                        i27 = i8;
                        i36 = i6;
                        i32 = i2;
                        i37 = i7;
                        i38 = i5;
                        c216103 = c216102;
                        i31 = i11;
                        i33 = i3;
                        marginLayoutParams3 = marginLayoutParams;
                        i34 = i4;
                        view9 = view8;
                    } else {
                        int m25667 = C0630.m2566("ᩴ֡") ^ i28;
                        int i56 = ((m25667 ^ i29) * 28881) ^ (-1925359258);
                        i11 = m25667 ^ 1314183974;
                        i30 = i56;
                        i27 = i8;
                        i36 = i6;
                        i32 = i2;
                        i38 = i55;
                        i37 = i54;
                        c216103 = c216102;
                        i31 = i11;
                        i33 = i3;
                        marginLayoutParams3 = marginLayoutParams;
                        i34 = i4;
                        view9 = view8;
                    }
                case 450651032:
                case 1244857071:
                    C3911.m11924();
                    if (C0237.f1507 != 0) {
                        i2 = i41;
                        i3 = i33;
                        marginLayoutParams = marginLayoutParams3;
                        i5 = i38;
                        c216102 = c216103;
                        i7 = i37;
                        i8 = i27;
                        int m6981322222 = (C2105.m6981("᩷ۘ") ^ i29) * (-121);
                        i27 = i8;
                        i30 = ((m6981322222 ^ i28) * 22337) ^ (-1430387987);
                        i32 = i2;
                        i31 = m6981322222 ^ (-1622064966);
                        i37 = i7;
                        i38 = i5;
                        c216103 = c216102;
                        i33 = i3;
                        marginLayoutParams3 = marginLayoutParams;
                        view9 = view8;
                    } else {
                        i2 = i41;
                        i3 = i33;
                        marginLayoutParams = marginLayoutParams3;
                        i4 = i34;
                        i5 = i38;
                        c216102 = c216103;
                        i6 = i36;
                        i7 = i37;
                        i8 = i27;
                        m6981 = (C0630.m2566("֫ۖ") ^ i29) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i9 = ((m6981 ^ i28) * 9111) ^ (-890546334);
                        i10 = -1744561863;
                        i11 = m6981 ^ i10;
                        i30 = i9;
                        i27 = i8;
                        i36 = i6;
                        i32 = i2;
                        i37 = i7;
                        i38 = i5;
                        c216103 = c216102;
                        i31 = i11;
                        i33 = i3;
                        marginLayoutParams3 = marginLayoutParams;
                        i34 = i4;
                        view9 = view8;
                    }
                case 567222496:
                case 1526908111:
                    i2 = i41;
                    i14 = i33;
                    marginLayoutParams2 = marginLayoutParams3;
                    i15 = i34;
                    i16 = i35;
                    C11007 c110072 = c11007;
                    i17 = i37;
                    i19 = i27;
                    int i57 = i39;
                    i18 = i38;
                    i20 = i36;
                    m10208(view3, view4, iArr3, iArr4, c110072, i57, !z);
                    m10208(view5, view6, iArr5, iArr6, c110072, i57, z);
                    if (view7 != null) {
                        m69812 = C0630.m2566("֡᩺") ^ i29;
                        i21 = ((m69812 ^ i28) * 13747) ^ 1833483713;
                        i22 = 1757644474;
                        i24 = m69812 ^ i22;
                        i34 = i15;
                        i35 = i16;
                        i27 = i19;
                        i36 = i20;
                        i33 = i14;
                        marginLayoutParams3 = marginLayoutParams2;
                        i37 = i17;
                        i38 = i18;
                        view9 = view8;
                        c216103 = c21610;
                        i26 = i2;
                        i31 = i24;
                        i30 = i21;
                        i32 = i26;
                    }
                    m69812 = (i28 - C0630.m2566("֡᩶")) * (-45);
                    i21 = ((m69812 ^ i29) * (-18305)) ^ (-467982338);
                    i22 = -1077160616;
                    i24 = m69812 ^ i22;
                    i34 = i15;
                    i35 = i16;
                    i27 = i19;
                    i36 = i20;
                    i33 = i14;
                    marginLayoutParams3 = marginLayoutParams2;
                    i37 = i17;
                    i38 = i18;
                    view9 = view8;
                    c216103 = c21610;
                    i26 = i2;
                    i31 = i24;
                    i30 = i21;
                    i32 = i26;
                case 795085898:
                case 1664591533:
                    i2 = i41;
                    i14 = i33;
                    marginLayoutParams2 = marginLayoutParams3;
                    i15 = i34;
                    i16 = i35;
                    i17 = i37;
                    i18 = i38;
                    i19 = i27;
                    i20 = i36;
                    z = false;
                    m69812 = (C2105.m6981("ۘ۟") + i29) * 97;
                    i21 = ((m69812 ^ i28) * (-7363)) ^ 1460457802;
                    i22 = 480790622;
                    i24 = m69812 ^ i22;
                    i34 = i15;
                    i35 = i16;
                    i27 = i19;
                    i36 = i20;
                    i33 = i14;
                    marginLayoutParams3 = marginLayoutParams2;
                    i37 = i17;
                    i38 = i18;
                    view9 = view8;
                    c216103 = c21610;
                    i26 = i2;
                    i31 = i24;
                    i30 = i21;
                    i32 = i26;
                case 1759013222:
                case 1921101733:
                    i2 = i41;
                    i3 = i33;
                    marginLayoutParams = marginLayoutParams3;
                    i4 = i34;
                    i5 = i38;
                    c216102 = c216103;
                    i6 = i36;
                    i7 = i37;
                    i8 = i27;
                    if (!C1711.f5919) {
                        m6981 = C2105.m6981("۠᩵") ^ i28;
                        i9 = ((m6981 ^ i29) * 13723) ^ 1731468471;
                        i10 = -999895098;
                        i11 = m6981 ^ i10;
                        i30 = i9;
                        i27 = i8;
                        i36 = i6;
                        i32 = i2;
                        i37 = i7;
                        i38 = i5;
                        c216103 = c216102;
                        i31 = i11;
                        i33 = i3;
                        marginLayoutParams3 = marginLayoutParams;
                        i34 = i4;
                        view9 = view8;
                    }
                    m6981 = C2105.m6981("֡ᩳ") ^ i28;
                    i9 = ((m6981 ^ i29) * (-741)) ^ (-558251145);
                    i10 = -1836598606;
                    i11 = m6981 ^ i10;
                    i30 = i9;
                    i27 = i8;
                    i36 = i6;
                    i32 = i2;
                    i37 = i7;
                    i38 = i5;
                    c216103 = c216102;
                    i31 = i11;
                    i33 = i3;
                    marginLayoutParams3 = marginLayoutParams;
                    i34 = i4;
                    view9 = view8;
                default:
                    i2 = i41;
                    i3 = i33;
                    marginLayoutParams = marginLayoutParams3;
                    i4 = i34;
                    i5 = i38;
                    c216102 = c216103;
                    i6 = i36;
                    i7 = i37;
                    i8 = i27;
                    if (C3245.f10203 > 0) {
                        m6981 = (i28 - C2105.m6981("۬ۧ")) * 77;
                        i9 = ((m6981 ^ i29) * 30615) ^ 71000719;
                        i10 = -1120947859;
                        i11 = m6981 ^ i10;
                        i30 = i9;
                        i27 = i8;
                        i36 = i6;
                        i32 = i2;
                        i37 = i7;
                        i38 = i5;
                        c216103 = c216102;
                        i31 = i11;
                        i33 = i3;
                        marginLayoutParams3 = marginLayoutParams;
                        i34 = i4;
                        view9 = view8;
                    }
                    m6981 = (C0630.m2566("֫ۖ") ^ i29) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i9 = ((m6981 ^ i28) * 9111) ^ (-890546334);
                    i10 = -1744561863;
                    i11 = m6981 ^ i10;
                    i30 = i9;
                    i27 = i8;
                    i36 = i6;
                    i32 = i2;
                    i37 = i7;
                    i38 = i5;
                    c216103 = c216102;
                    i31 = i11;
                    i33 = i3;
                    marginLayoutParams3 = marginLayoutParams;
                    i34 = i4;
                    view9 = view8;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10224(Throwable th, boolean z) {
        DialogInterface.OnDismissListener onDismissListener = null;
        int i = -1295656167;
        int i2 = C22628.f73083;
        int i3 = C0630.f2410;
        int m2566 = C0630.m2566("۠ۖ") ^ i2;
        int i4 = ((m2566 ^ i3) * (-5789)) ^ (-1596362922);
        int i5 = -1030285970;
        while (true) {
            i = ((((i ^ i3) * (-22295)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2005951516:
                case 444161859:
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = (C0630.m2566("֨ᩴ") ^ i3) * (-117);
                        i4 = ((m2566 ^ i2) * 3951) ^ (-1494099025);
                        i5 = -509731622;
                    } else {
                        m2566 = C0630.m2566("ܽ֨") ^ i3;
                        i4 = ((m2566 ^ i2) * 1891) ^ (-371797182);
                        i5 = -497864791;
                    }
                case -1969316153:
                case 175526194:
                    if (C4117.m12364() == 0) {
                        m2566 = (C0630.m2566("۟۬") + i2) * 87;
                        i4 = ((m2566 ^ i3) * (-24637)) ^ 1560732433;
                        i5 = 452835816;
                    } else {
                        m2566 = C2105.m6981("֡֡") ^ i3;
                        i4 = ((m2566 ^ i2) * 20959) ^ (-1020651879);
                        i5 = -1150570217;
                    }
                case -1895949005:
                case -145045220:
                    if (C3245.f10203 <= 0) {
                        m2566 = (C0630.m2566("۟۬") + i2) * 87;
                        i4 = ((m2566 ^ i3) * (-24637)) ^ 1560732433;
                        i5 = 452835816;
                    } else {
                        m2566 = C2105.m6981("ܶܳ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-7449)) ^ 1799532502;
                        i5 = -405278974;
                    }
                case -1895136968:
                case 1826651700:
                    RunnableC1108.m3790();
                    break;
                case -1479331519:
                case -1025081683:
                    if (C0050.f910 >= 0) {
                        m2566 = C2105.m6981("֡֡") ^ i3;
                        i4 = ((m2566 ^ i2) * 20959) ^ (-1020651879);
                        i5 = -1150570217;
                    } else {
                        m2566 = (C2105.m6981("ᩴᩳ") ^ i2) * (-115);
                        i4 = ((m2566 ^ i3) * (-32743)) ^ 1280321814;
                        i5 = 1407043105;
                    }
                case -1432815403:
                case 356119321:
                    if (z) {
                        m2566 = C2105.m6981("֫ᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30607)) ^ 1757438838;
                        i5 = -838017188;
                    } else {
                        m2566 = (C2105.m6981("᩵ܿ") + i3) * (-117);
                        i4 = ((m2566 ^ i2) * 19541) ^ 666709543;
                        i5 = -807672255;
                    }
                case -1275368815:
                case 12269673:
                    if (C2167.m7155()) {
                        m2566 = (C0630.m2566("ۗܶ") + i2) * 63;
                        i4 = ((m2566 ^ i3) * 27589) ^ (-451835763);
                        i5 = 1231222636;
                    } else {
                        m2566 = (i2 - C0630.m2566("᩵᩵")) * 95;
                        i4 = ((m2566 ^ i3) * (-22051)) ^ (-1018281981);
                        i5 = -348351548;
                    }
                case -1205444564:
                case -68217962:
                    onDismissListener = new DialogInterface.OnDismissListener() { // from class: l.֡ܺ᩷
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            int i6 = -311124708;
                            int i7 = C11340.f33930;
                            int i8 = ServiceConnectionC3453.f10921;
                            int m25662 = (C0630.m2566("۬۟") + i7) * 87;
                            int i9 = ((m25662 ^ i8) * (-2715)) ^ (-771024020);
                            int i10 = 820740241;
                            while (true) {
                                i6 = ((((i6 ^ i8) * 15919) >> 31) & i9) ^ (m25662 ^ i10);
                                switch (i6) {
                                    case -2051458906:
                                    case 1814429827:
                                        if (C0050.f910 < 0) {
                                            m25662 = (i7 - C2105.m6981("ۚܶ")) * (-55);
                                            i9 = ((m25662 ^ i8) * (-713)) ^ 1821221175;
                                            i10 = -1560601003;
                                        } else {
                                            m25662 = C2105.m6981("ۘܽ") ^ i8;
                                            i9 = ((m25662 ^ i7) * 27727) ^ (-453704019);
                                            i10 = 225651977;
                                        }
                                    case -1958244800:
                                    case -1433744808:
                                        if (C2958.f9394 >= 0) {
                                            m25662 = (i7 - C2105.m6981("ۚܶ")) * (-55);
                                            i9 = ((m25662 ^ i8) * (-713)) ^ 1821221175;
                                            i10 = -1560601003;
                                        } else {
                                            m25662 = (C2105.m6981("ܳ᩺") + i7) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i9 = ((m25662 ^ i8) * 14829) ^ (-1387835322);
                                            i10 = -1239262155;
                                        }
                                    case -1858235001:
                                    case -1839900886:
                                        if (C2520.f8000 >= 0) {
                                            m25662 = (i7 - C2105.m6981("ۚܶ")) * (-55);
                                            i9 = ((m25662 ^ i8) * (-713)) ^ 1821221175;
                                            i10 = -1560601003;
                                        } else {
                                            m25662 = (C0630.m2566("᩸ۜ") ^ i8) * 51;
                                            i9 = ((m25662 ^ i7) * 7385) ^ (-224036648);
                                            i10 = -1081965636;
                                        }
                                    case -1787578138:
                                    case 1314344613:
                                        if (C11340.f33930 < 0) {
                                            m25662 = (i7 - C2105.m6981("ۚܶ")) * (-55);
                                            i9 = ((m25662 ^ i8) * (-713)) ^ 1821221175;
                                            i10 = -1560601003;
                                        } else {
                                            m25662 = (i8 - C2105.m6981("ۜۖ")) * 127;
                                            i9 = ((m25662 ^ i7) * 77) ^ (-2023243579);
                                            i10 = 2101151005;
                                        }
                                    case -1415269251:
                                    case -99120570:
                                        if (C2520.f8000 >= 0) {
                                            m25662 = C0630.m2566("᩸ۤ") ^ i8;
                                            i9 = ((m25662 ^ i7) * 5587) ^ (-1052312251);
                                            i10 = 1766717114;
                                        } else {
                                            m25662 = (C2105.m6981("ۗ֡") ^ i8) * (-61);
                                            i9 = ((m25662 ^ i7) * 18609) ^ 478563343;
                                            i10 = 1305474543;
                                        }
                                    case -1341653104:
                                    case -431303652:
                                        if (ViewOnClickListenerC1958.m6429() >= 0) {
                                            m25662 = (i7 - C2105.m6981("ۚܶ")) * (-55);
                                            i9 = ((m25662 ^ i8) * (-713)) ^ 1821221175;
                                            i10 = -1560601003;
                                        } else {
                                            m25662 = (i7 - C0630.m2566("ᩴܰ")) * 89;
                                            i9 = ((m25662 ^ i8) * 11451) ^ 684653448;
                                            i10 = 1966883754;
                                        }
                                    case -1282268882:
                                    case -95654041:
                                        if (C2167.f7158 >= 0) {
                                            m25662 = C0630.m2566("ܽ᩵") ^ i7;
                                            i9 = ((m25662 ^ i8) * 9435) ^ 1707241695;
                                            i10 = 1096377602;
                                        } else {
                                            m25662 = C2105.m6981("ۙۜ") ^ i7;
                                            i9 = ((m25662 ^ i8) * 26225) ^ (-708950942);
                                            i10 = 747767095;
                                        }
                                    case -992631327:
                                    case -933523332:
                                        if (C22628.f73083 <= 0) {
                                            m25662 = C2105.m6981("ۘܽ") ^ i8;
                                            i9 = ((m25662 ^ i7) * 27727) ^ (-453704019);
                                            i10 = 225651977;
                                        } else {
                                            m25662 = (C0630.m2566("᩹ۖ") + i7) * 19;
                                            i9 = ((m25662 ^ i8) * (-14203)) ^ 216667387;
                                            i10 = 1494517671;
                                        }
                                    case -916317674:
                                    case -511442148:
                                        if (C2167.m7155()) {
                                            m25662 = (i8 - C2105.m6981("ۜۖ")) * 127;
                                            i9 = ((m25662 ^ i7) * 77) ^ (-2023243579);
                                            i10 = 2101151005;
                                        } else {
                                            m25662 = C0630.m2566("ܽ᩵") ^ i7;
                                            i9 = ((m25662 ^ i8) * 9435) ^ 1707241695;
                                            i10 = 1096377602;
                                        }
                                    case -908337419:
                                    case 214786162:
                                        C1504.m5179();
                                        break;
                                    case -207035369:
                                    case 1063369452:
                                        C21923.m49329();
                                        m25662 = (i7 - C2105.m6981("ۚܶ")) * (-55);
                                        i9 = ((m25662 ^ i8) * (-713)) ^ 1821221175;
                                        i10 = -1560601003;
                                    case -122095320:
                                    case 106290869:
                                        if (C2105.f7037 != 0) {
                                            m25662 = C2105.m6981("ۘܽ") ^ i8;
                                            i9 = ((m25662 ^ i7) * 27727) ^ (-453704019);
                                            i10 = 225651977;
                                        } else {
                                            m25662 = (C2105.m6981("ۚۛ") + i8) * 3;
                                            i9 = ((m25662 ^ i7) * (-25369)) ^ (-1678393518);
                                            i10 = 1833879150;
                                        }
                                    case -3161088:
                                    case 760653549:
                                        RunnableC1108.m3781(AbstractActivityC3346.this);
                                        break;
                                    case 712316904:
                                    case 1210271241:
                                        if (C3537.f11231 >= 0) {
                                            m25662 = C0630.m2566("᩸ۤ") ^ i8;
                                            i9 = ((m25662 ^ i7) * 5587) ^ (-1052312251);
                                            i10 = 1766717114;
                                        } else {
                                            m25662 = C2105.m6981("ۤۡ") ^ i7;
                                            i9 = ((m25662 ^ i8) * (-4075)) ^ (-2116959133);
                                            i10 = -331179372;
                                        }
                                    case 946364885:
                                    case 1619443635:
                                        if (C3019.f9544 >= 0) {
                                            m25662 = C0630.m2566("᩸ۤ") ^ i8;
                                            i9 = ((m25662 ^ i7) * 5587) ^ (-1052312251);
                                            i10 = 1766717114;
                                        } else {
                                            m25662 = (i8 - C2105.m6981("ܰܶ")) * 65;
                                            i9 = ((m25662 ^ i7) * (-6143)) ^ 1749318779;
                                            i10 = -1148748691;
                                        }
                                    default:
                                        int i11 = AbstractActivityC3346.f10575;
                                        if (RunnableC1108.f4040) {
                                            m25662 = C2105.m6981("᩺ۖ") ^ i8;
                                            i9 = ((m25662 ^ i7) * (-21615)) ^ (-533119939);
                                            i10 = 322636524;
                                        } else {
                                            m25662 = C0630.m2566("᩸ۤ") ^ i8;
                                            i9 = ((m25662 ^ i7) * 5587) ^ (-1052312251);
                                            i10 = 1766717114;
                                        }
                                }
                                return;
                            }
                        }
                    };
                    m2566 = (C0630.m2566("ۨ֨") ^ i2) * 81;
                    i4 = ((m2566 ^ i3) * (-10987)) ^ 1336231610;
                    i5 = -58004383;
                case -1193072924:
                case 62466028:
                    if (C4159.f13567) {
                        m2566 = (i3 - C2105.m6981("᩵֡")) * 27;
                        i4 = ((m2566 ^ i2) * (-2465)) ^ 570965339;
                        i5 = 598296911;
                    } else {
                        m2566 = (C0630.m2566("۟۬") + i2) * 87;
                        i4 = ((m2566 ^ i3) * (-24637)) ^ 1560732433;
                        i5 = 452835816;
                    }
                case -1117264135:
                case 1846052743:
                    if (C0630.f2410 <= 0) {
                        m2566 = (C0630.m2566("ۗܶ") + i2) * 63;
                        i4 = ((m2566 ^ i3) * 27589) ^ (-451835763);
                        i5 = 1231222636;
                    } else {
                        m2566 = (C2105.m6981("֡ۙ") + i2) * 5;
                        i4 = ((m2566 ^ i3) * 6925) ^ 1674272074;
                        i5 = -2061683005;
                    }
                case -1005935052:
                case -143341445:
                    if (C1128.m3851() <= 0) {
                        m2566 = C2105.m6981("֨۫") ^ i3;
                        i4 = ((m2566 ^ i2) * (-25393)) ^ (-1319164373);
                        i5 = -1481685688;
                    } else {
                        m2566 = (C0630.m2566("᩻ܽ") ^ i2) * 63;
                        i4 = ((m2566 ^ i3) * 2633) ^ (-105627229);
                        i5 = 1561395455;
                    }
                case -775225246:
                case 524252544:
                    if (C21923.f70183 != 0) {
                        m2566 = C2105.m6981("֡֡") ^ i3;
                        i4 = ((m2566 ^ i2) * 20959) ^ (-1020651879);
                        i5 = -1150570217;
                    } else {
                        m2566 = C2105.m6981("ۧۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-26385)) ^ 1170464245;
                        i5 = -1739174599;
                    }
                case -505681295:
                case 2026141491:
                    if (C2126.m7040()) {
                        m2566 = (C0630.m2566("۟۬") + i2) * 87;
                        i4 = ((m2566 ^ i3) * (-24637)) ^ 1560732433;
                        i5 = 452835816;
                    } else {
                        m2566 = C2105.m6981("֨۫") ^ i3;
                        i4 = ((m2566 ^ i2) * (-25393)) ^ (-1319164373);
                        i5 = -1481685688;
                    }
                case -242084750:
                case 1256845361:
                    ServiceConnectionC3453.m10561(this, th, onDismissListener);
                    break;
                case -193424167:
                case 1148427217:
                    onDismissListener = null;
                    m2566 = (C0630.m2566("ۨ֨") ^ i2) * 81;
                    i4 = ((m2566 ^ i3) * (-10987)) ^ 1336231610;
                    i5 = -58004383;
                case -48292787:
                case 1052018844:
                    C4263.m12819();
                    C1504.m5179();
                    m2566 = (C0630.m2566("֨ᩴ") ^ i3) * (-117);
                    i4 = ((m2566 ^ i2) * 3951) ^ (-1494099025);
                    i5 = -509731622;
                case 633555372:
                case 1980917200:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = C2105.m6981("֨۫") ^ i3;
                        i4 = ((m2566 ^ i2) * (-25393)) ^ (-1319164373);
                        i5 = -1481685688;
                    } else {
                        m2566 = C0630.m2566("ۚ᩶") ^ i2;
                        i4 = ((m2566 ^ i3) * 31239) ^ (-445642144);
                        i5 = -1155664628;
                    }
                case 1183119403:
                case 1250930008:
                    RunnableC1108.m3790();
                    if (C1504.f5354) {
                        m2566 = (C0630.m2566("֨ᩴ") ^ i3) * (-117);
                        i4 = ((m2566 ^ i2) * 3951) ^ (-1494099025);
                        i5 = -509731622;
                    } else {
                        m2566 = C2105.m6981("֨۫") ^ i3;
                        i4 = ((m2566 ^ i2) * (-25393)) ^ (-1319164373);
                        i5 = -1481685688;
                    }
                default:
                    if (C0630.f2410 <= 0) {
                        m2566 = (C0630.m2566("֨ᩴ") ^ i3) * (-117);
                        i4 = ((m2566 ^ i2) * 3951) ^ (-1494099025);
                        i5 = -509731622;
                    } else {
                        m2566 = (C2105.m6981("۬۬") ^ i3) * 35;
                        i4 = ((m2566 ^ i2) * 28187) ^ (-659843049);
                        i5 = 1138079934;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b0, code lost:
    
        r7 = l.C2105.m6981("֨ۚ") ^ r5;
        r8 = ((r7 ^ r6) * (-15545)) ^ 696331662;
        r9 = 36115180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0198, code lost:
    
        r7 = l.C0630.m2566("ۧۙ") ^ r6;
        r8 = ((r7 ^ r5) * (-18957)) ^ 1718819229;
        r9 = -1920466802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01df, code lost:
    
        r7 = (l.C2105.m6981("۬ۙ") + r5) * 45;
        r8 = ((r7 ^ r6) * 8061) ^ 387262075;
        r9 = -345930465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0213, code lost:
    
        r7 = l.C2105.m6981("ۡ᩻") ^ r6;
        r8 = ((r7 ^ r5) * 5495) ^ 1506242042;
        r9 = 1667873938;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0169, code lost:
    
        r7 = l.C0630.m2566("ۙ᩵") ^ r5;
        r8 = ((r7 ^ r6) * (-1579)) ^ 1929959285;
        r9 = 1710191927;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, java.lang.ref.WeakReference] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10234() {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.m10234():void");
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m10243() {
        return this.f10594;
    }

    @Override // l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public void onStop() {
        WeakReference weakReference = null;
        int i = 1098353035;
        int i2 = C2520.f8000;
        int i3 = RunnableC1937.f6483;
        int m6981 = (C2105.m6981("᩹ܰ") + i3) * UMErrorCode.E_UM_BE_CREATE_FAILED;
        int i4 = ((m6981 ^ i2) * 15207) ^ 1487995998;
        int i5 = -457242141;
        while (true) {
            i = ((((i ^ i2) * 3915) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2087466601:
                case -1411981408:
                    C0964.m3413();
                    C3746.m11369();
                    m6981 = (C2105.m6981("᩺ܿ") + i3) * (-79);
                    i4 = ((m6981 ^ i2) * (-31073)) ^ 424555612;
                    i5 = -337297031;
                case -1997552309:
                case -114783821:
                    if (C1916.f6442) {
                        m6981 = C2105.m6981("᩶ۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * 1419) ^ 1615315595;
                        i5 = 526441808;
                    } else {
                        m6981 = (C0630.m2566("۬۟") + i2) * 109;
                        i4 = ((m6981 ^ i3) * (-3441)) ^ (-1322214492);
                        i5 = -1567296376;
                    }
                case -1872429267:
                case -1867632742:
                    if (weakReference.get() == this.f10587) {
                        m6981 = (C0630.m2566("۬۠") ^ i3) * (-93);
                        i4 = ((m6981 ^ i2) * (-25973)) ^ (-1725826051);
                        i5 = 1777922809;
                    } else {
                        m6981 = (C0630.m2566("۫ܰ") ^ i3) * 25;
                        i4 = ((m6981 ^ i2) * 15165) ^ 1985606650;
                        i5 = -745894469;
                    }
                case -1798885841:
                case 1667323779:
                    if (C5695.f17556 >= 0) {
                        m6981 = (C0630.m2566("ۨۘ") + i2) * 79;
                        i4 = ((m6981 ^ i3) * 3305) ^ (-1450115855);
                        i5 = -1278533540;
                    } else {
                        m6981 = C2105.m6981("ۨܶ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-19079)) ^ (-1847718147);
                        i5 = -868509936;
                    }
                case -1787519005:
                case 1504762167:
                    if (C2105.f7037 != 0) {
                        m6981 = (i3 - C0630.m2566("ᩴܽ")) * (-49);
                        i4 = ((m6981 ^ i2) * 3777) ^ (-1866118077);
                        i5 = -2008803592;
                    } else {
                        m6981 = C2105.m6981("ܿۚ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-8001)) ^ (-137722852);
                        i5 = -2062645684;
                    }
                case -1673218281:
                case 1413092527:
                    C2167.m7155();
                    if (C4159.m12565() >= 0) {
                        m6981 = (C2105.m6981("᩺ܿ") + i3) * (-79);
                        i4 = ((m6981 ^ i2) * (-31073)) ^ 424555612;
                        i5 = -337297031;
                    } else {
                        m6981 = (C0630.m2566("ۨۘ") + i2) * 79;
                        i4 = ((m6981 ^ i3) * 3305) ^ (-1450115855);
                        i5 = -1278533540;
                    }
                case -1484014452:
                case 29639535:
                    if (C0714.f2697 >= 0) {
                        m6981 = (C2105.m6981("᩺ܿ") + i3) * (-79);
                        i4 = ((m6981 ^ i2) * (-31073)) ^ 424555612;
                        i5 = -337297031;
                    } else {
                        m6981 = C2105.m6981("᩹֫") ^ i3;
                        i4 = ((m6981 ^ i2) * (-29073)) ^ 177539579;
                        i5 = 1898552265;
                    }
                case -1468105333:
                case -1328678194:
                    if (C0237.f1507 != 0) {
                        m6981 = (C0630.m2566("ۨۘ") + i2) * 79;
                        i4 = ((m6981 ^ i3) * 3305) ^ (-1450115855);
                        i5 = -1278533540;
                    } else {
                        m6981 = (C2105.m6981("۫ᩳ") ^ i2) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i4 = ((m6981 ^ i3) * 26367) ^ (-1285751418);
                        i5 = 423626343;
                    }
                case -1453828103:
                case 167289357:
                    if (C1504.f5354) {
                        m6981 = (i3 - C0630.m2566("ᩴܽ")) * (-49);
                        i4 = ((m6981 ^ i2) * 3777) ^ (-1866118077);
                        i5 = -2008803592;
                    } else {
                        m6981 = (C0630.m2566("᩺ۗ") ^ i3) * (-17);
                        i4 = ((m6981 ^ i2) * (-13533)) ^ (-1244947521);
                        i5 = -1455929750;
                    }
                case -1365716127:
                case -324947380:
                    super.onStop();
                    break;
                case -1347151047:
                case 1574475124:
                    if (C1294.m4372() <= 0) {
                        m6981 = (C0630.m2566("۬۟") + i2) * 109;
                        i4 = ((m6981 ^ i3) * (-3441)) ^ (-1322214492);
                        i5 = -1567296376;
                    } else {
                        m6981 = C0630.m2566("᩹᩷") ^ i3;
                        i4 = ((m6981 ^ i2) * 26877) ^ (-1581133403);
                        i5 = 556624634;
                    }
                case -863198283:
                case 282779736:
                    weakReference = f10578;
                    if (weakReference != null) {
                        m6981 = C0630.m2566("ܽܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 22987) ^ (-654295114);
                        i5 = 465621220;
                    } else {
                        m6981 = (C0630.m2566("۫ܰ") ^ i3) * 25;
                        i4 = ((m6981 ^ i2) * 15165) ^ 1985606650;
                        i5 = -745894469;
                    }
                case -686595789:
                case 1909604968:
                    if (C0050.f910 < 0) {
                        m6981 = (i3 - C0630.m2566("ᩴܽ")) * (-49);
                        i4 = ((m6981 ^ i2) * 3777) ^ (-1866118077);
                        i5 = -2008803592;
                    } else {
                        m6981 = C0630.m2566("᩺۠") ^ i2;
                        i4 = ((m6981 ^ i3) * (-3067)) ^ (-1193702825);
                        i5 = -316045770;
                    }
                case -523665743:
                case -315782818:
                    if (C7106.f21815 != 0) {
                        m6981 = (C0630.m2566("ۨۘ") + i2) * 79;
                        i4 = ((m6981 ^ i3) * 3305) ^ (-1450115855);
                        i5 = -1278533540;
                    } else {
                        m6981 = (i2 - C2105.m6981("ᩳܿ")) * (-61);
                        i4 = ((m6981 ^ i3) * 17567) ^ 663228708;
                        i5 = -1610164075;
                    }
                case -481811985:
                case 306961670:
                    C7106.m19120();
                    break;
                case -345549414:
                case 510104116:
                    if (this.f10587 != null) {
                        m6981 = (C0630.m2566("ۢۧ") + i2) * 47;
                        i4 = ((m6981 ^ i3) * (-21429)) ^ (-427296462);
                        i5 = 1877318562;
                    } else {
                        m6981 = (C0630.m2566("۫ܰ") ^ i3) * 25;
                        i4 = ((m6981 ^ i2) * 15165) ^ 1985606650;
                        i5 = -745894469;
                    }
                case 351125021:
                case 2123123130:
                    if (C1773.f6144 <= 0) {
                        m6981 = (C0630.m2566("۬۟") + i2) * 109;
                        i4 = ((m6981 ^ i3) * (-3441)) ^ (-1322214492);
                        i5 = -1567296376;
                    } else {
                        m6981 = C0630.m2566("ۨ۬") ^ i2;
                        i4 = ((m6981 ^ i3) * (-21897)) ^ (-329587432);
                        i5 = -1782347932;
                    }
                case 445089261:
                case 566438951:
                    if (C0422.m1963()) {
                        m6981 = C0630.m2566("ۧ۠") ^ i2;
                        i4 = ((m6981 ^ i3) * 10799) ^ 976698461;
                        i5 = 586957684;
                    } else {
                        m6981 = (C0630.m2566("۬۟") + i2) * 109;
                        i4 = ((m6981 ^ i3) * (-3441)) ^ (-1322214492);
                        i5 = -1567296376;
                    }
                case 1540913348:
                case 1769001251:
                    f10578 = null;
                    m6981 = (C0630.m2566("۫ܰ") ^ i3) * 25;
                    i4 = ((m6981 ^ i2) * 15165) ^ 1985606650;
                    i5 = -745894469;
                default:
                    C11340.m28031();
                    if (C11340.f33930 >= 0) {
                        m6981 = (C2105.m6981("᩺ܿ") + i3) * (-79);
                        i4 = ((m6981 ^ i2) * (-31073)) ^ 424555612;
                        i5 = -337297031;
                    } else {
                        m6981 = (i3 - C0630.m2566("ᩴܽ")) * (-49);
                        i4 = ((m6981 ^ i2) * 3777) ^ (-1866118077);
                        i5 = -2008803592;
                    }
            }
            return;
        }
    }

    @Override // l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z = false;
        boolean z2 = false;
        C4236 c4236 = null;
        C5652 c5652 = null;
        C5242 c5242 = null;
        Display display = null;
        Point point = null;
        int i = 1370861749;
        int i2 = C2167.f7158;
        int i3 = C3019.f9544;
        int m6981 = (C2105.m6981("ۙܳ") + i2) * (-43);
        int i4 = ((m6981 ^ i3) * 29193) ^ (-50800662);
        int i5 = -1814163142;
        while (true) {
            i = ((((i ^ i3) * 27179) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1975910249:
                case -1572471833:
                    this.f10592 = C8474.m22148(this, c4236);
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m6981 = (C0630.m2566("ܺۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m6981 ^ i3) * (-25071)) ^ (-223738335);
                        i5 = 1244108834;
                    } else {
                        m6981 = (i3 - C2105.m6981("۠ܳ")) * (-7);
                        i4 = ((m6981 ^ i2) * (-937)) ^ 10055718;
                        i5 = 1927136638;
                    }
                case -1971471095:
                case 373408955:
                    if (C11266.f33762) {
                        m6981 = (C0630.m2566("֡ܶ") ^ i3) * (-127);
                        i4 = ((m6981 ^ i2) * 12313) ^ 1837977641;
                        i5 = -26103935;
                    } else {
                        m6981 = (C2105.m6981("۟ۘ") + i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m6981 ^ i3) * 24391) ^ (-1485893091);
                        i5 = 473009517;
                    }
                case -1846376812:
                case -1229267420:
                    break;
                case -1642186878:
                case 657553689:
                    C1047.m3599();
                    m6981 = (C0630.m2566("۫ܽ") ^ i3) * 25;
                    i4 = ((m6981 ^ i2) * (-7675)) ^ 29042200;
                    i5 = -350833765;
                case -1448559470:
                case 969531510:
                    if (C1773.f6144 <= 0) {
                        m6981 = (C0630.m2566("۫ܽ") ^ i3) * 25;
                        i4 = ((m6981 ^ i2) * (-7675)) ^ 29042200;
                        i5 = -350833765;
                    } else {
                        m6981 = (C0630.m2566("ܺۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m6981 ^ i3) * (-25071)) ^ (-223738335);
                        i5 = 1244108834;
                    }
                case -1440569186:
                case -338570294:
                    this.f10595 = c5652;
                    super.onCreate(bundle);
                    c5242 = f10576;
                    if (C0630.f2410 <= 0) {
                        m6981 = C2105.m6981("ۘ֫") ^ i3;
                        i4 = ((m6981 ^ i2) * 5291) ^ 782305203;
                        i5 = -731336619;
                    } else {
                        m6981 = C2105.m6981("֡ۢ") ^ i3;
                        i4 = ((m6981 ^ i2) * 14743) ^ (-681900727);
                        i5 = -86082254;
                    }
                case -1419552489:
                case 1827712236:
                    display.getSize(point);
                    if (C3245.f10203 <= 0) {
                        m6981 = (C0630.m2566("ܺۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m6981 ^ i3) * (-25071)) ^ (-223738335);
                        i5 = 1244108834;
                    } else {
                        m6981 = (C0630.m2566("ܰ᩷") ^ i3) * (-51);
                        i4 = ((m6981 ^ i2) * 16955) ^ 258498961;
                        i5 = 1213820944;
                    }
                case -1387274501:
                case 858752558:
                    setTheme(C18080.m42142());
                    if (C2167.f7158 >= 0) {
                        m6981 = (C0630.m2566("۫ܽ") ^ i3) * 25;
                        i4 = ((m6981 ^ i2) * (-7675)) ^ 29042200;
                        i5 = -350833765;
                    } else {
                        m6981 = C0630.m2566("֡᩵") ^ i3;
                        i4 = ((m6981 ^ i2) * 17521) ^ 813343903;
                        i5 = -1468766345;
                    }
                case -1232480954:
                case -479021500:
                    c4236 = new C4236(8, this);
                    if (C1916.m6308() >= 0) {
                        m6981 = C2105.m6981("֫᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-29477)) ^ (-1231467261);
                        i5 = 71414;
                    } else {
                        m6981 = C2105.m6981("۠ۚ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-23447)) ^ (-1917998212);
                        i5 = 2064886843;
                    }
                case -1118782745:
                case -136682856:
                    C13265.m32216();
                    z = true;
                    if (bundle != null) {
                        m6981 = (C0630.m2566("۠ۡ") ^ i2) * 31;
                        i4 = ((m6981 ^ i3) * 15331) ^ (-2010073836);
                        i5 = 984949853;
                    } else {
                        m6981 = (i2 - C2105.m6981("᩸᩸")) * (-117);
                        i4 = ((m6981 ^ i3) * (-22847)) ^ 292128146;
                        i5 = 1364171633;
                    }
                case -1084109800:
                case -230259253:
                    c5652 = C8474.m22148(this, new InterfaceC19764() { // from class: l.ۡܺ᩷
                        @Override // l.InterfaceC19764
                        /* renamed from: ֫ */
                        public final void mo4668(Intent intent, int i6) {
                            int i7 = 1143757815;
                            int i8 = RunnableC0588.f2309;
                            int i9 = C0050.f910;
                            int m2566 = C0630.m2566("᩺۟") ^ i8;
                            int i10 = ((m2566 ^ i9) * (-20503)) ^ 1466496225;
                            int i11 = -1620657124;
                            while (true) {
                                i7 = ((((i7 ^ i9) * 28589) >> 31) & i10) ^ (m2566 ^ i11);
                                switch (i7) {
                                    case -2067922159:
                                    case -1027602884:
                                        C1916.m6308();
                                        if (C0483.f2088 < 0) {
                                            m2566 = (C2105.m6981("ۤ᩸") + i8) * (-11);
                                            i10 = ((m2566 ^ i9) * (-30829)) ^ 1503242367;
                                            i11 = 1254180106;
                                        } else {
                                            m2566 = (C0630.m2566("ۖ᩸") + i8) * 25;
                                            i10 = ((m2566 ^ i9) * 14905) ^ 1231325300;
                                            i11 = -2084449937;
                                        }
                                    case -1972179258:
                                    case 1455595232:
                                        AbstractC2021.m6574();
                                        if (C1294.m4372() <= 0) {
                                            m2566 = (C2105.m6981("ۤ᩸") + i8) * (-11);
                                            i10 = ((m2566 ^ i9) * (-30829)) ^ 1503242367;
                                            i11 = 1254180106;
                                        } else {
                                            m2566 = C0630.m2566("ۨ᩺") ^ i9;
                                            i10 = ((m2566 ^ i8) * 26243) ^ 288784012;
                                            i11 = 500743624;
                                        }
                                    case -1743651429:
                                    case 713589002:
                                        if (C3663.f11553) {
                                            m2566 = C2105.m6981("᩺۫") ^ i9;
                                            i10 = ((m2566 ^ i8) * 16997) ^ (-1022168476);
                                            i11 = 372391867;
                                        } else {
                                            m2566 = (i8 - C0630.m2566("ۨۤ")) * 5;
                                            i10 = ((m2566 ^ i9) * 18315) ^ (-2142576005);
                                            i11 = -1235609240;
                                        }
                                    case -1650661971:
                                    case 1807505866:
                                        if (C2272.f7362) {
                                            m2566 = (C0630.m2566("ܳܶ") ^ i9) * (-103);
                                            i10 = ((m2566 ^ i8) * (-7385)) ^ 132841468;
                                            i11 = -578162183;
                                        } else {
                                            m2566 = (i9 - C2105.m6981("֡۫")) * (-37);
                                            i10 = ((m2566 ^ i8) * 9719) ^ (-2041735131);
                                            i11 = 1815908403;
                                        }
                                    case -1439344385:
                                    case -511881199:
                                        C1005.m3501();
                                        AbstractC2021.m6574();
                                        m2566 = (C2105.m6981("ۤ᩸") + i8) * (-11);
                                        i10 = ((m2566 ^ i9) * (-30829)) ^ 1503242367;
                                        i11 = 1254180106;
                                    case -1267891950:
                                    case 97834383:
                                        if (C0483.f2088 >= 0) {
                                            m2566 = (C0630.m2566("ۖ᩸") + i8) * 25;
                                            i10 = ((m2566 ^ i9) * 14905) ^ 1231325300;
                                            i11 = -2084449937;
                                        } else {
                                            m2566 = C0630.m2566("ۜۤ") ^ i8;
                                            i10 = ((m2566 ^ i9) * 20431) ^ 1270454206;
                                            i11 = -1640930366;
                                        }
                                    case -1212304361:
                                    case 904089168:
                                        if (C0483.f2088 >= 0) {
                                            m2566 = C0630.m2566("ۨ᩺") ^ i9;
                                            i10 = ((m2566 ^ i8) * 26243) ^ 288784012;
                                            i11 = 500743624;
                                        } else {
                                            m2566 = C2105.m6981("᩹ܿ") ^ i9;
                                            i10 = ((m2566 ^ i8) * 7999) ^ (-589850949);
                                            i11 = 351626426;
                                        }
                                    case -1050957858:
                                    case 111048726:
                                        if (C2126.m7040()) {
                                            m2566 = (C0630.m2566("ܳܶ") ^ i9) * (-103);
                                            i10 = ((m2566 ^ i8) * (-7385)) ^ 132841468;
                                            i11 = -578162183;
                                        } else {
                                            m2566 = (C2105.m6981("֫ܰ") + i9) * (-13);
                                            i10 = ((m2566 ^ i8) * (-10491)) ^ (-706979858);
                                            i11 = 1663719306;
                                        }
                                    case -522214943:
                                    case 268463176:
                                        if (C1047.f3863 >= 0) {
                                            m2566 = (C0630.m2566("ܳܶ") ^ i9) * (-103);
                                            i10 = ((m2566 ^ i8) * (-7385)) ^ 132841468;
                                            i11 = -578162183;
                                        } else {
                                            m2566 = (i8 - C2105.m6981("᩺᩸")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i10 = ((m2566 ^ i9) * (-28671)) ^ 1020534659;
                                            i11 = 227073875;
                                        }
                                    case -359392959:
                                    case 428360620:
                                        if (C2167.f7158 >= 0) {
                                            m2566 = (C2105.m6981("ۤ᩸") + i8) * (-11);
                                            i10 = ((m2566 ^ i9) * (-30829)) ^ 1503242367;
                                            i11 = 1254180106;
                                        } else {
                                            m2566 = (C0630.m2566("ܳܶ") ^ i9) * (-103);
                                            i10 = ((m2566 ^ i8) * (-7385)) ^ 132841468;
                                            i11 = -578162183;
                                        }
                                    case -243326985:
                                    case 1064301969:
                                        if (C3019.f9544 >= 0) {
                                            m2566 = (C0630.m2566("ܳܶ") ^ i9) * (-103);
                                            i10 = ((m2566 ^ i8) * (-7385)) ^ 132841468;
                                            i11 = -578162183;
                                        } else {
                                            m2566 = (C0630.m2566("֡ۢ") ^ i9) * 101;
                                            i10 = ((m2566 ^ i8) * 9153) ^ 306331488;
                                            i11 = -1466987235;
                                        }
                                    case -146549643:
                                    case 1854495683:
                                        AbstractActivityC3346.m10209(AbstractActivityC3346.this, i6);
                                        break;
                                    case 130697189:
                                    case 1184567823:
                                        if (C3746.f11829 <= 0) {
                                            m2566 = C2105.m6981("᩺۫") ^ i9;
                                            i10 = ((m2566 ^ i8) * 16997) ^ (-1022168476);
                                            i11 = 372391867;
                                        } else {
                                            m2566 = C0630.m2566("ᩴܶ") ^ i9;
                                            i10 = ((m2566 ^ i8) * 22935) ^ (-221472420);
                                            i11 = -1842381366;
                                        }
                                    case 135066063:
                                    case 1220439578:
                                        if (C1294.f4556 >= 0) {
                                            m2566 = C2105.m6981("᩺۫") ^ i9;
                                            i10 = ((m2566 ^ i8) * 16997) ^ (-1022168476);
                                            i11 = 372391867;
                                        } else {
                                            m2566 = (i8 - C2105.m6981("ۙۘ")) * 37;
                                            i10 = ((m2566 ^ i9) * 15091) ^ (-675161018);
                                            i11 = 720376090;
                                        }
                                    case 685832085:
                                    case 1047305558:
                                        C4075.m12263();
                                        break;
                                    default:
                                        if (C1420.f5096 <= 0) {
                                            m2566 = (C0630.m2566("ۖ᩸") + i8) * 25;
                                            i10 = ((m2566 ^ i9) * 14905) ^ 1231325300;
                                            i11 = -2084449937;
                                        } else {
                                            m2566 = (C2105.m6981("᩺ᩳ") ^ i8) * 83;
                                            i10 = ((m2566 ^ i9) * (-14795)) ^ 145771867;
                                            i11 = -724650701;
                                        }
                                }
                                return;
                            }
                        }
                    });
                    if (C0050.f910 >= 0) {
                        m6981 = C2105.m6981("ۘ֫") ^ i3;
                        i4 = ((m6981 ^ i2) * 5291) ^ 782305203;
                        i5 = -731336619;
                    } else {
                        m6981 = C0630.m2566("ۤۖ") ^ i2;
                        i4 = ((m6981 ^ i3) * 23855) ^ (-2107444664);
                        i5 = 847741854;
                    }
                case -979647275:
                case -527434853:
                    display.getRealSize(C11266.f33763);
                    C11266.f33762 = z;
                    m6981 = (C0630.m2566("֡ܶ") ^ i3) * (-127);
                    i4 = ((m6981 ^ i2) * 12313) ^ 1837977641;
                    i5 = -26103935;
                case -539522583:
                case 49551445:
                    C2272.m7503();
                    C2958.m9034();
                    break;
                case -309360358:
                case 170401440:
                    if (C5695.f17556 >= 0) {
                        m6981 = C2105.m6981("ۘ֫") ^ i3;
                        i4 = ((m6981 ^ i2) * 5291) ^ 782305203;
                        i5 = -731336619;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۛ᩺")) * (-63);
                        i4 = ((m6981 ^ i2) * 30415) ^ 283097702;
                        i5 = 1923333161;
                    }
                case -308259541:
                case 1593325457:
                    if (C0964.m3413()) {
                        m6981 = C2105.m6981("ܺۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-32335)) ^ 478453404;
                        i5 = 1195924805;
                    } else {
                        m6981 = (C0630.m2566("۫ܽ") ^ i3) * 25;
                        i4 = ((m6981 ^ i2) * (-7675)) ^ 29042200;
                        i5 = -350833765;
                    }
                case -38103341:
                case 1726086803:
                    z2 = false;
                    m6981 = (C0630.m2566("ۤۘ") ^ i3) * 75;
                    i4 = ((m6981 ^ i2) * (-3173)) ^ 1296577548;
                    i5 = -1819804953;
                case 24776523:
                case 1808175332:
                    z2 = true;
                    m6981 = (C0630.m2566("ۤۘ") ^ i3) * 75;
                    i4 = ((m6981 ^ i2) * (-3173)) ^ 1296577548;
                    i5 = -1819804953;
                case 42611603:
                case 1851160744:
                    C1128.m3851();
                    if (C2105.f7037 == 0) {
                        m6981 = C2105.m6981("ܺۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-32335)) ^ 478453404;
                        i5 = 1195924805;
                    } else {
                        m6981 = C2105.m6981("֫᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-29477)) ^ (-1231467261);
                        i5 = 71414;
                    }
                case 230946635:
                case 1462480841:
                    this.f10594 = z2;
                    if (this.f10581) {
                        m6981 = (C2105.m6981("ܿۙ") ^ i2) * (-75);
                        i4 = ((m6981 ^ i3) * (-23213)) ^ (-639761311);
                        i5 = 1619069474;
                    } else {
                        m6981 = (i3 - C2105.m6981("᩺᩺")) * 21;
                        i4 = ((m6981 ^ i2) * (-12027)) ^ 240548380;
                        i5 = -142119559;
                    }
                case 1053060854:
                case 1847286516:
                    display = getWindowManager().getDefaultDisplay();
                    point = C11266.f33764;
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = C2105.m6981("֫᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-29477)) ^ (-1231467261);
                        i5 = 71414;
                    } else {
                        m6981 = C2105.m6981("᩶ۙ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-12999)) ^ (-431701898);
                        i5 = -1247470615;
                    }
                case 1171596915:
                case 1181816558:
                    C14096.m33706(this);
                    if (C7811.f24123 >= 0) {
                        m6981 = C2105.m6981("ܺۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-32335)) ^ 478453404;
                        i5 = 1195924805;
                    } else {
                        m6981 = (i2 - C2105.m6981("۬ۛ")) * 99;
                        i4 = ((m6981 ^ i3) * (-16723)) ^ (-1265233661);
                        i5 = 1455934907;
                    }
                case 1225174425:
                case 1848932282:
                    C2272.m7505(this);
                    m6981 = (i3 - C2105.m6981("ۢᩳ")) * q.h;
                    i4 = ((m6981 ^ i2) * (-20111)) ^ 541764741;
                    i5 = -1768306761;
                case 1524981118:
                case 2003505836:
                    this.f10586 = C21943.m49431();
                    m6981 = (i3 - C2105.m6981("᩺᩺")) * 21;
                    i4 = ((m6981 ^ i2) * (-12027)) ^ 240548380;
                    i5 = -142119559;
                default:
                    if (C1047.f3863 >= 0) {
                        m6981 = (C0630.m2566("ܺۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m6981 ^ i3) * (-25071)) ^ (-223738335);
                        i5 = 1244108834;
                    } else {
                        RunnableC1108.m3788(c5242, this, new InterfaceC1008() { // from class: l.ۚܺ᩷
                            @Override // l.InterfaceC1008
                            /* renamed from: ֫ */
                            public final void mo1617(Object obj) {
                                C20986 c20986 = null;
                                int i6 = 1180031638;
                                int i7 = C0483.f2088;
                                int i8 = C0050.f910;
                                int m2566 = C0630.m2566("ۡ֫") ^ i7;
                                int i9 = ((m2566 ^ i8) * 14983) ^ (-323820990);
                                int i10 = -1167187254;
                                while (true) {
                                    i6 = ((((i6 ^ i8) * (-13309)) >> 31) & i9) ^ (m2566 ^ i10);
                                    switch (i6) {
                                        case -2146842469:
                                        case -1032049262:
                                            if (C2958.f9394 >= 0) {
                                                m2566 = (C2105.m6981("ܳۢ") + i7) * (-35);
                                                i9 = ((m2566 ^ i8) * (-9665)) ^ 1062299346;
                                                i10 = -1214361807;
                                            } else {
                                                m2566 = (i7 - C2105.m6981("᩷ܺ")) * q.h;
                                                i9 = ((m2566 ^ i8) * 21065) ^ (-503704908);
                                                i10 = -406170190;
                                            }
                                        case -2004613779:
                                        case -1706446278:
                                            break;
                                        case -1900603393:
                                        case -218264597:
                                            if (C3019.m9255() <= 0) {
                                                m2566 = C2105.m6981("ۤ᩶") ^ i7;
                                                i9 = ((m2566 ^ i8) * 27499) ^ (-1817926301);
                                                i10 = 554170003;
                                            } else {
                                                m2566 = (C2105.m6981("ۡ۫") ^ i7) * 91;
                                                i9 = ((m2566 ^ i8) * (-18575)) ^ 96542099;
                                                i10 = 1112063104;
                                            }
                                        case -1862258865:
                                        case 1312635718:
                                            if (c20986.m47795()) {
                                                m2566 = (C2105.m6981("۠ۤ") + i8) * 41;
                                                i9 = ((m2566 ^ i7) * (-18453)) ^ 173523935;
                                                i10 = 1396149437;
                                            } else {
                                                m2566 = (C0630.m2566("ۗܰ") ^ i7) * (-53);
                                                i9 = ((m2566 ^ i8) * (-4087)) ^ 1502558730;
                                                i10 = 1160234899;
                                            }
                                        case -1534364431:
                                        case -1026001871:
                                            if (C11340.m28031()) {
                                                m2566 = (C0630.m2566("ᩴܺ") + i8) * 51;
                                                i9 = ((m2566 ^ i7) * 15973) ^ 1580332905;
                                                i10 = -713003912;
                                            } else {
                                                m2566 = C2105.m6981("ۤ᩶") ^ i7;
                                                i9 = ((m2566 ^ i8) * 27499) ^ (-1817926301);
                                                i10 = 554170003;
                                            }
                                        case -1507286787:
                                        case -393576502:
                                            C2105.m6982();
                                            m2566 = C2105.m6981("ۤ᩶") ^ i7;
                                            i9 = ((m2566 ^ i8) * 27499) ^ (-1817926301);
                                            i10 = 554170003;
                                        case -1324692465:
                                        case 1699589667:
                                            if (C3683.f11629 >= 0) {
                                                m2566 = (C2105.m6981("ۡ۫") ^ i7) * 91;
                                                i9 = ((m2566 ^ i8) * (-18575)) ^ 96542099;
                                                i10 = 1112063104;
                                            } else {
                                                m2566 = (i7 - C0630.m2566("ۧ᩸")) * 25;
                                                i9 = ((m2566 ^ i8) * (-7923)) ^ (-61089620);
                                                i10 = -1324589951;
                                            }
                                        case -1064911835:
                                        case 359052626:
                                            c20986 = (C20986) obj;
                                            int i11 = AbstractActivityC3346.f10575;
                                            if (c20986 != null) {
                                                m2566 = C0630.m2566("֫ܿ") ^ i8;
                                                i9 = ((m2566 ^ i7) * 4815) ^ (-389843187);
                                                i10 = 1839564016;
                                            } else {
                                                m2566 = (C0630.m2566("ۗܰ") ^ i7) * (-53);
                                                i9 = ((m2566 ^ i8) * (-4087)) ^ 1502558730;
                                                i10 = 1160234899;
                                            }
                                        case -1055565520:
                                        case -1005092511:
                                            if (C22628.f73083 <= 0) {
                                                m2566 = (C2105.m6981("ۡ۫") ^ i7) * 91;
                                                i9 = ((m2566 ^ i8) * (-18575)) ^ 96542099;
                                                i10 = 1112063104;
                                            } else {
                                                m2566 = (C0630.m2566("᩺ۗ") ^ i8) * (-37);
                                                i9 = ((m2566 ^ i7) * 22567) ^ (-705243784);
                                                i10 = 1153204770;
                                            }
                                        case -1011526378:
                                        case -912947525:
                                            C0798.m2998();
                                            if (C1128.f4106 <= 0) {
                                                m2566 = (C2105.m6981("᩻֡") ^ i8) * 11;
                                                i9 = ((m2566 ^ i7) * (-27905)) ^ (-710697213);
                                                i10 = 866765317;
                                            } else {
                                                m2566 = (C2105.m6981("᩵֫") + i8) * (-51);
                                                i9 = ((m2566 ^ i7) * 12927) ^ (-2101977978);
                                                i10 = 616674194;
                                            }
                                        case -191250466:
                                        case 555807244:
                                            if (ViewOnClickListenerC1958.f6529 <= 0) {
                                                m2566 = C2105.m6981("ۤ᩶") ^ i7;
                                                i9 = ((m2566 ^ i8) * 27499) ^ (-1817926301);
                                                i10 = 554170003;
                                            } else {
                                                m2566 = C0630.m2566("ܳ۫") ^ i7;
                                                i9 = ((m2566 ^ i8) * 15563) ^ (-633786704);
                                                i10 = 2074658026;
                                            }
                                        case -31174526:
                                        case 1142823295:
                                            C3432.m10477();
                                            break;
                                        case 334143507:
                                        case 1991935448:
                                            if (C1420.m4913()) {
                                                m2566 = C2105.m6981("ۤ᩶") ^ i7;
                                                i9 = ((m2566 ^ i8) * 27499) ^ (-1817926301);
                                                i10 = 554170003;
                                            } else {
                                                m2566 = (C2105.m6981("᩻֡") ^ i8) * 11;
                                                i9 = ((m2566 ^ i7) * (-27905)) ^ (-710697213);
                                                i10 = 866765317;
                                            }
                                        case 631464218:
                                        case 1221843273:
                                            AbstractActivityC3346.this.mo117(c20986);
                                            m2566 = (C0630.m2566("ۗܰ") ^ i7) * (-53);
                                            i9 = ((m2566 ^ i8) * (-4087)) ^ 1502558730;
                                            i10 = 1160234899;
                                        case 782466610:
                                        case 1901820497:
                                            if (RunnableC3474.f10992 <= 0) {
                                                m2566 = C2105.m6981("ۤ᩶") ^ i7;
                                                i9 = ((m2566 ^ i8) * 27499) ^ (-1817926301);
                                                i10 = 554170003;
                                            } else {
                                                m2566 = (i8 - C0630.m2566("ۙܺ")) * (-117);
                                                i9 = ((m2566 ^ i7) * 10553) ^ 2099486295;
                                                i10 = -1446175582;
                                            }
                                        case 847829471:
                                        case 1061216560:
                                            if (C0237.f1507 != 0) {
                                                m2566 = (C2105.m6981("᩻֡") ^ i8) * 11;
                                                i9 = ((m2566 ^ i7) * (-27905)) ^ (-710697213);
                                                i10 = 866765317;
                                            } else {
                                                m2566 = (C0630.m2566("֡۠") + i7) * (-57);
                                                i9 = ((m2566 ^ i8) * (-23113)) ^ (-173091354);
                                                i10 = -1912045079;
                                            }
                                        case 1042222029:
                                        case 2002907789:
                                            if (C3019.f9544 >= 0) {
                                                m2566 = (C2105.m6981("ۡ۫") ^ i7) * 91;
                                                i9 = ((m2566 ^ i8) * (-18575)) ^ 96542099;
                                                i10 = 1112063104;
                                            } else {
                                                m2566 = C2105.m6981("ܿܺ") ^ i8;
                                                i9 = ((m2566 ^ i7) * (-32629)) ^ (-1406257230);
                                                i10 = -1912700735;
                                            }
                                        case 1814759450:
                                        case 2069346243:
                                            if (C5695.f17556 >= 0) {
                                                m2566 = (C2105.m6981("᩻֡") ^ i8) * 11;
                                                i9 = ((m2566 ^ i7) * (-27905)) ^ (-710697213);
                                                i10 = 866765317;
                                            } else {
                                                m2566 = (C2105.m6981("ۙ᩹") + i8) * (-67);
                                                i9 = ((m2566 ^ i7) * (-27775)) ^ (-410982067);
                                                i10 = 564101167;
                                            }
                                        default:
                                            if (ViewOnClickListenerC1958.f6529 <= 0) {
                                                m2566 = (C2105.m6981("᩻֡") ^ i8) * 11;
                                                i9 = ((m2566 ^ i7) * (-27905)) ^ (-710697213);
                                                i10 = 866765317;
                                            } else {
                                                m2566 = C0630.m2566("ܶ֡") ^ i7;
                                                i9 = ((m2566 ^ i8) * 22609) ^ (-1057895405);
                                                i10 = -1472052827;
                                            }
                                    }
                                    return;
                                }
                            }
                        });
                        if (C4925.m14339()) {
                            m6981 = C2105.m6981("ۛۡ") ^ i2;
                            i4 = ((m6981 ^ i3) * 379) ^ 1304720563;
                            i5 = -1218305798;
                        } else {
                            m6981 = (i3 - C2105.m6981("ۢᩳ")) * q.h;
                            i4 = ((m6981 ^ i2) * (-20111)) ^ 541764741;
                            i5 = -1768306761;
                        }
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if (l.C3911.f12484 >= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        if (l.C0422.f1886 > 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0061, code lost:
    
        if (l.ViewOnClickListenerC1958.f6529 > 0) goto L76;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View m10241(int r26) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.m10241(int):android.view.View");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10218(int i, String str, boolean z) {
        int i2 = 1903973894;
        int i3 = C4075.f12947;
        int i4 = C1420.f5096;
        int m2566 = C0630.m2566("ܽۨ") ^ i4;
        int i5 = ((m2566 ^ i3) * 13823) ^ 107450766;
        int i6 = 639039696;
        while (true) {
            i2 = ((((i2 ^ i3) * (-6361)) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -1944798910:
                case -1554418596:
                    if (C1047.m3599() >= 0) {
                        m2566 = (C2105.m6981("ۧۛ") ^ i4) * (-91);
                        i5 = ((m2566 ^ i3) * (-3407)) ^ 450964052;
                        i6 = 1886888856;
                    } else {
                        m2566 = C2105.m6981("֨֡") ^ i4;
                        i5 = ((m2566 ^ i3) * 5437) ^ (-1847694754);
                        i6 = -1267860283;
                    }
                case -1755787304:
                case 1024811924:
                    C0050.m940();
                    ServiceConnectionC3453.m10564();
                    break;
                case -1495171996:
                case -17201457:
                    C7106.m19120();
                    if (C2520.m8026()) {
                        m2566 = C0630.m2566("ܳۧ") ^ i4;
                        i5 = ((m2566 ^ i3) * 869) ^ (-135041789);
                        i6 = -213826341;
                    } else {
                        m2566 = C0630.m2566("ۛۡ") ^ i3;
                        i5 = ((m2566 ^ i4) * 24601) ^ (-422138891);
                        i6 = -656348761;
                    }
                case -1336600200:
                case 1708966927:
                    if (C3911.f12484 >= 0) {
                        m2566 = C0630.m2566("ۛۡ") ^ i3;
                        i5 = ((m2566 ^ i4) * 24601) ^ (-422138891);
                        i6 = -656348761;
                    } else {
                        m2566 = C0630.m2566("ܳ᩹") ^ i3;
                        i5 = ((m2566 ^ i4) * (-10095)) ^ (-1301538156);
                        i6 = 721591330;
                    }
                case -1333036709:
                case 1152619232:
                    if (C1420.f5096 > 0) {
                        m2566 = C0630.m2566("᩺ۤ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-11569)) ^ (-1034714264);
                        i6 = 1573010500;
                    } else {
                        m2566 = C0630.m2566("ۛۡ") ^ i3;
                        i5 = ((m2566 ^ i4) * 24601) ^ (-422138891);
                        i6 = -656348761;
                    }
                case -1242516594:
                case 1698577844:
                    if (C3663.f11553) {
                        m2566 = C0630.m2566("ۛۡ") ^ i3;
                        i5 = ((m2566 ^ i4) * 24601) ^ (-422138891);
                        i6 = -656348761;
                    } else {
                        m2566 = (C2105.m6981("۬ۖ") + i4) * 81;
                        i5 = ((m2566 ^ i3) * (-9247)) ^ 1331301729;
                        i6 = 1358099913;
                    }
                case -1113139428:
                case -477732620:
                    if (C2958.f9394 >= 0) {
                        m2566 = (C2105.m6981("ۧۛ") ^ i4) * (-91);
                        i5 = ((m2566 ^ i3) * (-3407)) ^ 450964052;
                        i6 = 1886888856;
                    } else {
                        m2566 = (C0630.m2566("ܶ۬") ^ i3) * (-101);
                        i5 = ((m2566 ^ i4) * (-12251)) ^ 1994975097;
                        i6 = -803421519;
                    }
                case -711322058:
                case 596890020:
                    C0964.m3413();
                    C3911.m11924();
                    m2566 = (C2105.m6981("ۧۛ") ^ i4) * (-91);
                    i5 = ((m2566 ^ i3) * (-3407)) ^ 450964052;
                    i6 = 1886888856;
                case -475297045:
                case 590139732:
                    if (C22628.m50615() != 0) {
                        m2566 = C0630.m2566("ܳۧ") ^ i4;
                        i5 = ((m2566 ^ i3) * 869) ^ (-135041789);
                        i6 = -213826341;
                    } else {
                        m2566 = C2105.m6981("۬ۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 13027) ^ (-750672448);
                        i6 = 1155351522;
                    }
                case -235411978:
                case 1354441497:
                    if (C7106.m19120() <= 0) {
                        m2566 = (C2105.m6981("ۧۛ") ^ i4) * (-91);
                        i5 = ((m2566 ^ i3) * (-3407)) ^ 450964052;
                        i6 = 1886888856;
                    } else {
                        m2566 = C0630.m2566("᩺ۤ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-11569)) ^ (-1034714264);
                        i6 = 1573010500;
                    }
                case -140012632:
                case 392819671:
                    if (C3432.f10845 >= 0) {
                        m2566 = (C2105.m6981("ۧۛ") ^ i4) * (-91);
                        i5 = ((m2566 ^ i3) * (-3407)) ^ 450964052;
                        i6 = 1886888856;
                    } else {
                        m2566 = C2105.m6981("᩵ܺ") ^ i4;
                        i5 = ((m2566 ^ i3) * 1521) ^ (-1711166848);
                        i6 = 1820468212;
                    }
                case -99665687:
                case 755850203:
                    runOnUiThread(new RunnableC9697(this, C0050.m946(this, i), str, z));
                    break;
                case 118965528:
                case 209373182:
                    if (C0050.f910 >= 0) {
                        m2566 = C0630.m2566("᩺ۤ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-11569)) ^ (-1034714264);
                        i6 = 1573010500;
                    } else {
                        m2566 = C0630.m2566("ܽۗ") ^ i3;
                        i5 = ((m2566 ^ i4) * 8247) ^ 823200352;
                        i6 = -312095914;
                    }
                case 596082071:
                case 1796857904:
                    if (C2958.f9394 >= 0) {
                        m2566 = (i4 - C0630.m2566("ۚܳ")) * 61;
                        i5 = ((m2566 ^ i3) * 17823) ^ 1205029090;
                        i6 = -2118090069;
                    } else {
                        m2566 = C2105.m6981("۠᩸") ^ i3;
                        i5 = ((m2566 ^ i4) * 17319) ^ 529812094;
                        i6 = -1521048165;
                    }
                case 793494277:
                case 826326300:
                    if (C1773.f6144 <= 0) {
                        m2566 = C0630.m2566("ܳۧ") ^ i4;
                        i5 = ((m2566 ^ i3) * 869) ^ (-135041789);
                        i6 = -213826341;
                    } else {
                        m2566 = C2105.m6981("ۖܰ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-2671)) ^ (-869861072);
                        i6 = 788922015;
                    }
                default:
                    if (C3746.f11829 <= 0) {
                        m2566 = (i4 - C0630.m2566("ۚܳ")) * 61;
                        i5 = ((m2566 ^ i3) * 17823) ^ 1205029090;
                        i6 = -2118090069;
                    } else {
                        m2566 = C2105.m6981("ۜ֨") ^ i4;
                        i5 = ((m2566 ^ i3) * 4859) ^ (-1803941912);
                        i6 = -26421564;
                    }
            }
            return;
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Exception e = null;
        int i = 1734067063;
        int i2 = C1294.f4556;
        int i3 = C2520.f8000;
        int m2566 = C0630.m2566("ۡۡ") ^ i2;
        int i4 = ((m2566 ^ i3) * 20531) ^ 1964270157;
        int i5 = 622914895;
        while (true) {
            i = ((((i ^ i3) * (-9583)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2096502325:
                case -463321357:
                    C1711.m5736();
                    C1047.m3599();
                    break;
                case -2089581256:
                case 1008286427:
                    if (C0964.f3626 != 0) {
                        m2566 = C2105.m6981("᩵ᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-27219)) ^ (-273057672);
                        i5 = 1681722374;
                    } else {
                        m2566 = (C0630.m2566("᩸ܶ") ^ i3) * (-31);
                        i4 = ((m2566 ^ i2) * (-5003)) ^ 139881979;
                        i5 = -476581301;
                    }
                case -2049275628:
                case -1417578866:
                    if (C11340.f33930 >= 0) {
                        m2566 = (i3 - C2105.m6981("᩵۟")) * (-7);
                        i4 = ((m2566 ^ i2) * (-24943)) ^ 72745510;
                        i5 = -968507315;
                    } else {
                        m2566 = (i2 - C2105.m6981("ۜۨ")) * 25;
                        i4 = ((m2566 ^ i3) * 7367) ^ 2117360663;
                        i5 = -1904094789;
                    }
                case -1977055420:
                case -1105269276:
                    if (C2105.f7037 != 0) {
                        m2566 = (i3 - C2105.m6981("᩵۟")) * (-7);
                        i4 = ((m2566 ^ i2) * (-24943)) ^ 72745510;
                        i5 = -968507315;
                    } else {
                        m2566 = C2105.m6981("ܽۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * 2727) ^ 1623588867;
                        i5 = 1334314583;
                    }
                case -1889357316:
                case -677176743:
                    C3245.m9925();
                    C4159.m12565();
                    m2566 = C2105.m6981("֨֨") ^ i3;
                    i4 = ((m2566 ^ i2) * 4015) ^ 1432364009;
                    i5 = 1875262375;
                case -1776764985:
                case -666352709:
                    if (C0237.f1507 == 0) {
                        m2566 = C2105.m6981("᩵ᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-27219)) ^ (-273057672);
                        i5 = 1681722374;
                    } else {
                        m2566 = (i3 - C2105.m6981("᩵۟")) * (-7);
                        i4 = ((m2566 ^ i2) * (-24943)) ^ 72745510;
                        i5 = -968507315;
                    }
                case -1723496388:
                case -126502098:
                    if (C2126.f7087) {
                        m2566 = C0630.m2566("ۛᩳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 26399) ^ (-1856297691);
                        i5 = 498897259;
                    } else {
                        m2566 = C0630.m2566("֡۠") ^ i3;
                        i4 = ((m2566 ^ i2) * (-9431)) ^ 38985171;
                        i5 = -192878628;
                    }
                case -1377546017:
                case 1152309917:
                    try {
                        super.onRestoreInstanceState(bundle);
                        m2566 = (i2 - C2105.m6981("ܿۛ")) * (-53);
                        i4 = ((m2566 ^ i3) * 19789) ^ (-101551180);
                        i5 = -708721949;
                    } catch (Exception e2) {
                        e = e2;
                        m2566 = (C0630.m2566("۠᩺") ^ i3) * (-11);
                        i4 = ((m2566 ^ i2) * 2457) ^ (-1314893117);
                        i5 = 179668762;
                    }
                case -1267043898:
                case -885590861:
                    if (C2105.f7037 != 0) {
                        m2566 = C2105.m6981("֨֨") ^ i3;
                        i4 = ((m2566 ^ i2) * 4015) ^ 1432364009;
                        i5 = 1875262375;
                    } else {
                        m2566 = (C0630.m2566("۠ۚ") + i2) * (-63);
                        i4 = ((m2566 ^ i3) * 24299) ^ 1805470686;
                        i5 = 990253756;
                    }
                case -1003738809:
                case 243165753:
                    if (C3019.f9544 >= 0) {
                        m2566 = C0630.m2566("ۛᩳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 26399) ^ (-1856297691);
                        i5 = 498897259;
                    } else {
                        m2566 = C2105.m6981("ۖۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * 17091) ^ (-828546305);
                        i5 = -1827580357;
                    }
                case -958337826:
                case 626331554:
                    if (C3683.f11629 >= 0) {
                        m2566 = C0630.m2566("ۛᩳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 26399) ^ (-1856297691);
                        i5 = 498897259;
                    } else {
                        m2566 = C2105.m6981("ܳ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * (-24597)) ^ (-1548881551);
                        i5 = 49028946;
                    }
                case -829812753:
                case -180452127:
                    if (C3746.m11369() >= 0) {
                        m2566 = C0630.m2566("ۛᩳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 26399) ^ (-1856297691);
                        i5 = 498897259;
                    } else {
                        m2566 = (C0630.m2566("᩸ܿ") + i2) * (-27);
                        i4 = ((m2566 ^ i3) * (-67)) ^ 1562240364;
                        i5 = 208138862;
                    }
                case -388963657:
                case -70276880:
                    if (C1047.f3863 >= 0) {
                        m2566 = (C0630.m2566("۠ۚ") + i2) * (-63);
                        i4 = ((m2566 ^ i3) * 24299) ^ 1805470686;
                        i5 = 990253756;
                    } else {
                        m2566 = C2105.m6981("᩵ᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-27219)) ^ (-273057672);
                        i5 = 1681722374;
                    }
                case -346398823:
                case 1808436489:
                    if (C0422.f1886 <= 0) {
                        m2566 = C0630.m2566("ۛᩳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 26399) ^ (-1856297691);
                        i5 = 498897259;
                    } else {
                        m2566 = (i3 - C0630.m2566("֫ۜ")) * (-25);
                        i4 = ((m2566 ^ i2) * (-19723)) ^ (-1825682934);
                        i5 = 2041531479;
                    }
                case -179843780:
                case 2084210490:
                    ServiceConnectionC3453.m10561(this, e, null);
                    break;
                case 379844390:
                case 1364157711:
                    break;
                case 1978649807:
                case 2136641314:
                    if (C4616.f14690 <= 0) {
                        m2566 = C2105.m6981("᩵ᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-27219)) ^ (-273057672);
                        i5 = 1681722374;
                    } else {
                        m2566 = (C2105.m6981("ۢۜ") + i3) * (-31);
                        i4 = ((m2566 ^ i2) * 1295) ^ 1162473723;
                        i5 = 2101059527;
                    }
                default:
                    if (C0382.f1805) {
                        m2566 = (i2 - C2105.m6981("ۘۨ")) * 75;
                        i4 = ((m2566 ^ i3) * 18509) ^ 2061613876;
                        i5 = 941080523;
                    } else {
                        m2566 = (C0630.m2566("۠ۚ") + i2) * (-63);
                        i4 = ((m2566 ^ i3) * 24299) ^ 1805470686;
                        i5 = 990253756;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0044, code lost:
    
        if (l.C7811.f24123 < 0) goto L94;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m10208(android.view.View r23, android.view.View r24, int[] r25, int[] r26, l.C11007 r27, int r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.m10208(android.view.View, android.view.View, int[], int[], l.ۧ۬, int, boolean):void");
    }

    @Override // l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C13754.m33059(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10227(C9762 c9762) {
        AbstractC13246 abstractC13246 = null;
        int i = 0;
        int i2 = 0;
        int i3 = -658212947;
        int i4 = C4263.f13799;
        int i5 = C0422.f1886;
        int m6981 = (C2105.m6981("۟ۤ") ^ i4) * 85;
        int i6 = ((m6981 ^ i5) * 12931) ^ 210553054;
        int i7 = 171061686;
        while (true) {
            i3 = ((((i3 ^ i5) * 10489) >> 31) & i6) ^ (m6981 ^ i7);
            switch (i3) {
                case -2123043489:
                case -1415232695:
                    if (C4075.f12947 >= 0) {
                        m6981 = (C2105.m6981("ۛܺ") ^ i5) * 33;
                        i6 = ((m6981 ^ i4) * (-23941)) ^ (-824204836);
                        i7 = -1717280753;
                    } else {
                        m6981 = C0630.m2566("֫ۘ") ^ i5;
                        i6 = ((m6981 ^ i4) * 31579) ^ 2052194163;
                        i7 = -1604287009;
                    }
                case -1987776648:
                case -343557285:
                    if (C1005.f3721) {
                        m6981 = (i5 - C0630.m2566("֫ۡ")) * (-59);
                        i6 = ((m6981 ^ i4) * 5197) ^ 1371432554;
                        i7 = 386674528;
                    } else {
                        m6981 = (C2105.m6981("ۛܺ") ^ i5) * 33;
                        i6 = ((m6981 ^ i4) * (-23941)) ^ (-824204836);
                        i7 = -1717280753;
                    }
                case -1540596249:
                case -334864312:
                    abstractC13246.mo15441(c9762);
                    if (C22628.m50615() != 0) {
                        m6981 = (C2105.m6981("ۛܺ") ^ i5) * 33;
                        i6 = ((m6981 ^ i4) * (-23941)) ^ (-824204836);
                        i7 = -1717280753;
                    } else {
                        m6981 = C0630.m2566("ܺۚ") ^ i5;
                        i6 = ((m6981 ^ i4) * 30921) ^ (-1843706425);
                        i7 = -1324782375;
                    }
                case -1487487445:
                case -481409547:
                    if (C1420.f5096 <= 0) {
                        m6981 = (C2105.m6981("۬ۨ") ^ i5) * 61;
                        i6 = ((m6981 ^ i4) * 27469) ^ 114693650;
                        i7 = 988813670;
                    } else {
                        m6981 = (C2105.m6981("ۜ᩷") + i5) * 33;
                        i6 = ((m6981 ^ i4) * 28435) ^ 1139769851;
                        i7 = 802713937;
                    }
                case -1455099843:
                case 360372243:
                    if (C2126.f7087) {
                        m6981 = C0630.m2566("᩷֡") ^ i4;
                        i6 = ((m6981 ^ i5) * 17713) ^ (-793025399);
                        i7 = -1026125347;
                    } else {
                        m6981 = (C2105.m6981("۬ۨ") ^ i5) * 61;
                        i6 = ((m6981 ^ i4) * 27469) ^ 114693650;
                        i7 = 988813670;
                    }
                case -1444755144:
                case 501370158:
                    i = c9762.getContentInsetStartWithNavigation();
                    i2 = 3;
                    if (C0382.f1805) {
                        m6981 = (C0630.m2566("ۘۖ") ^ i4) * 23;
                        i6 = ((m6981 ^ i5) * 13715) ^ 1374357997;
                        i7 = -51210831;
                    } else {
                        m6981 = C0630.m2566("᩷֡") ^ i4;
                        i6 = ((m6981 ^ i5) * 17713) ^ (-793025399);
                        i7 = -1026125347;
                    }
                case -1342517135:
                case 1675061759:
                    if (C5695.f17556 >= 0) {
                        m6981 = C0630.m2566("᩷֡") ^ i4;
                        i6 = ((m6981 ^ i5) * 17713) ^ (-793025399);
                        i7 = -1026125347;
                    } else {
                        m6981 = (i5 - C2105.m6981("ۢ᩷")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i6 = ((m6981 ^ i4) * 6039) ^ (-1624371638);
                        i7 = -656357369;
                    }
                case -1198821293:
                case -24857236:
                    if (C1128.m3851() <= 0) {
                        m6981 = (C2105.m6981("۬ۨ") ^ i5) * 61;
                        i6 = ((m6981 ^ i4) * 27469) ^ 114693650;
                        i7 = 988813670;
                    } else {
                        m6981 = (i5 - C2105.m6981("᩶ۘ")) * (-87);
                        i6 = ((m6981 ^ i4) * (-29595)) ^ (-852090159);
                        i7 = -258388230;
                    }
                case -892020049:
                case 1854438416:
                    C2105.m6982();
                    break;
                case -577032225:
                case 638779465:
                    C2272.m7503();
                    m6981 = (C2105.m6981("۬ۨ") ^ i5) * 61;
                    i6 = ((m6981 ^ i4) * 27469) ^ 114693650;
                    i7 = 988813670;
                case -213418386:
                case 1459457079:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = C0630.m2566("᩷֡") ^ i4;
                        i6 = ((m6981 ^ i5) * 17713) ^ (-793025399);
                        i7 = -1026125347;
                    } else {
                        m6981 = C0630.m2566("ܳۨ") ^ i4;
                        i6 = ((m6981 ^ i5) * 7603) ^ 635992034;
                        i7 = -1611035532;
                    }
                case -158760193:
                case 237904837:
                    C11340.m28031();
                    if (C1047.m3599() >= 0) {
                        m6981 = (C2105.m6981("۬ۨ") ^ i5) * 61;
                        i6 = ((m6981 ^ i4) * 27469) ^ 114693650;
                        i7 = 988813670;
                    } else {
                        m6981 = C2105.m6981("᩺᩹") ^ i4;
                        i6 = ((m6981 ^ i5) * (-20443)) ^ (-772123720);
                        i7 = -373012024;
                    }
                case 18685223:
                case 2042371533:
                    if (C22628.f73083 <= 0) {
                        m6981 = (C2105.m6981("ۛܺ") ^ i5) * 33;
                        i6 = ((m6981 ^ i4) * (-23941)) ^ (-824204836);
                        i7 = -1717280753;
                    } else {
                        m6981 = C2105.m6981("ۡ᩷") ^ i4;
                        i6 = ((m6981 ^ i5) * 30759) ^ (-1836115737);
                        i7 = -1828030283;
                    }
                case 396449865:
                case 1760472999:
                    if (C3663.f11553) {
                        m6981 = C0630.m2566("᩷֡") ^ i4;
                        i6 = ((m6981 ^ i5) * 17713) ^ (-793025399);
                        i7 = -1026125347;
                    } else {
                        m6981 = C0630.m2566("ۧۧ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-16143)) ^ 1229031194;
                        i7 = -539406701;
                    }
                case 827063687:
                case 1219198347:
                    c9762.setContentInsetStartWithNavigation(i / i2);
                    break;
                default:
                    abstractC13246 = m4113();
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        m6981 = (C2105.m6981("۬ۨ") ^ i5) * 61;
                        i6 = ((m6981 ^ i4) * 27469) ^ 114693650;
                        i7 = 988813670;
                    } else {
                        m6981 = (C0630.m2566("ܳ֫") + i4) * (-37);
                        i6 = ((m6981 ^ i5) * (-23581)) ^ 132485964;
                        i7 = -895440921;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10219(Runnable runnable) {
        this.f10582 = runnable;
    }

    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, l.ܶ᩵ܿ] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10209(AbstractActivityC3346 abstractActivityC3346, int i) {
        AbstractC15440 abstractC15440 = null;
        ArrayList arrayList = null;
        ?? r2 = 0;
        int i2 = 854409376;
        int i3 = C4263.f13799;
        int i4 = C0483.f2088;
        int m6981 = (C2105.m6981("᩵֫") ^ i4) * 27;
        int i5 = ((m6981 ^ i3) * 15961) ^ (-1368761637);
        int i6 = 1541076504;
        while (true) {
            i2 = ((((i2 ^ i3) * (-1597)) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -2112602960:
                case -1897849158:
                    if (i == -1) {
                        m6981 = (i3 - C0630.m2566("֨֫")) * 37;
                        i5 = ((m6981 ^ i4) * 6463) ^ 2111481166;
                        i6 = 474896187;
                    } else {
                        m6981 = C2105.m6981("۫ۜ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-809)) ^ (-1179324877);
                        i6 = 1215680273;
                    }
                case -2056427688:
                case 1364134314:
                    if (C3683.m11222()) {
                        m6981 = C0630.m2566("۟֡") ^ i3;
                        i5 = ((m6981 ^ i4) * (-2243)) ^ 704412113;
                        i6 = 380124075;
                    } else {
                        m6981 = C0630.m2566("۠ܰ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-3809)) ^ 333521503;
                        i6 = 2128819355;
                    }
                case -2053385549:
                case -743359121:
                    if (C0382.f1805) {
                        m6981 = C0630.m2566("ܰۢ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-6539)) ^ 915832689;
                        i6 = -1474910606;
                    } else {
                        m6981 = (i4 - C2105.m6981("֨ᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((m6981 ^ i3) * 6101) ^ (-1521751907);
                        i6 = -6874463;
                    }
                case -1921409438:
                case -905954806:
                    abstractC15440 = abstractActivityC3346.f10591;
                    arrayList = abstractActivityC3346.f10585;
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = C2105.m6981("ۗۡ") ^ i3;
                        i5 = ((m6981 ^ i4) * 26409) ^ 239113286;
                        i6 = -981266852;
                    } else {
                        m6981 = (C2105.m6981("ܰ֨") + i4) * 119;
                        i5 = ((m6981 ^ i3) * (-9639)) ^ 1447870870;
                        i6 = 2139794477;
                    }
                case -1755954109:
                case -414898682:
                    break;
                case -1672844568:
                case 21104756:
                    if (C0714.f2697 >= 0) {
                        m6981 = (i4 - C2105.m6981("֨ᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((m6981 ^ i3) * 6101) ^ (-1521751907);
                        i6 = -6874463;
                    } else {
                        m6981 = (C2105.m6981("ۡۛ") ^ i4) * 33;
                        i5 = ((m6981 ^ i3) * 27477) ^ (-1725522101);
                        i6 = 590157859;
                    }
                case -1540160641:
                case 1949968390:
                    if (C4263.f13799 <= 0) {
                        m6981 = C0630.m2566("۟֡") ^ i3;
                        i5 = ((m6981 ^ i4) * (-2243)) ^ 704412113;
                        i6 = 380124075;
                    } else {
                        m6981 = C0630.m2566("ۜ֫") ^ i3;
                        i5 = ((m6981 ^ i4) * 489) ^ 2119981715;
                        i6 = 1503498836;
                    }
                case -1416621739:
                case 586467361:
                    if (C1294.m4372() <= 0) {
                        m6981 = C0630.m2566("۠ܰ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-3809)) ^ 333521503;
                        i6 = 2128819355;
                    } else {
                        m6981 = (i4 - C2105.m6981("֨ᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((m6981 ^ i3) * 6101) ^ (-1521751907);
                        i6 = -6874463;
                    }
                case -1082942749:
                case -387689184:
                    if (C7811.f24123 >= 0) {
                        m6981 = (i4 - C2105.m6981("֨ᩳ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((m6981 ^ i3) * 6101) ^ (-1521751907);
                        i6 = -6874463;
                    } else {
                        m6981 = (i3 - C0630.m2566("֨ۨ")) * 101;
                        i5 = ((m6981 ^ i4) * (-22117)) ^ 1894763043;
                        i6 = 653609778;
                    }
                case -1071610003:
                case 92874916:
                    if (C1128.f4106 <= 0) {
                        m6981 = (C0630.m2566("ۘۢ") + i4) * 61;
                        i5 = ((m6981 ^ i3) * (-32485)) ^ (-2071742503);
                        i6 = -1359816895;
                    } else {
                        m6981 = (C2105.m6981("ۛۨ") + i3) * 55;
                        i5 = ((m6981 ^ i4) * 2427) ^ (-1097925010);
                        i6 = -1307936597;
                    }
                case -1033721388:
                case 89984825:
                    if (C0382.m1848()) {
                        m6981 = C0630.m2566("۠ܰ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-3809)) ^ 333521503;
                        i6 = 2128819355;
                    } else {
                        m6981 = C2105.m6981("ۗۡ") ^ i3;
                        i5 = ((m6981 ^ i4) * 26409) ^ 239113286;
                        i6 = -981266852;
                    }
                case -984623196:
                case 1841389875:
                    if (C7811.f24123 >= 0) {
                        m6981 = (C0630.m2566("ۘۢ") + i4) * 61;
                        i5 = ((m6981 ^ i3) * (-32485)) ^ (-2071742503);
                        i6 = -1359816895;
                    } else {
                        m6981 = (i4 - C0630.m2566("᩸ۛ")) * (-65);
                        i5 = ((m6981 ^ i3) * (-15361)) ^ 892191867;
                        i6 = -408246397;
                    }
                case -966950144:
                case 39918379:
                    r2 = 0;
                    r2 = 0;
                    if (C1047.f3863 >= 0) {
                        m6981 = (C0630.m2566("ۘۢ") + i4) * 61;
                        i5 = ((m6981 ^ i3) * (-32485)) ^ (-2071742503);
                        i6 = -1359816895;
                    } else {
                        m6981 = (C2105.m6981("ܶ᩷") ^ i3) * (-13);
                        i5 = ((m6981 ^ i4) * (-21369)) ^ (-1420317976);
                        i6 = -2144186457;
                    }
                case -679802548:
                case 1582197244:
                    abstractActivityC3346.f10591 = r2;
                    abstractActivityC3346.f10585 = r2;
                    if (abstractC15440 != null) {
                        m6981 = C0630.m2566("ۨ۬") ^ i4;
                        i5 = ((m6981 ^ i3) * 18221) ^ (-907916622);
                        i6 = -1425667718;
                    } else {
                        m6981 = C2105.m6981("۫ۜ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-809)) ^ (-1179324877);
                        i6 = 1215680273;
                    }
                case -524692198:
                case 1150918388:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = C0630.m2566("۟֡") ^ i3;
                        i5 = ((m6981 ^ i4) * (-2243)) ^ 704412113;
                        i6 = 380124075;
                    } else {
                        m6981 = C0630.m2566("ۘۖ") ^ i4;
                        i5 = ((m6981 ^ i3) * 5637) ^ 1410802912;
                        i6 = 520293264;
                    }
                case -323134671:
                case -236978786:
                    RunnableC3474.m10630();
                    C2126.m7040();
                    m6981 = C0630.m2566("۠ܰ") ^ i3;
                    i5 = ((m6981 ^ i4) * (-3809)) ^ 333521503;
                    i6 = 2128819355;
                case 1254080995:
                case 1354659161:
                    RunnableC1937.m6387();
                    C3019.m9255();
                    break;
                case 1948615293:
                case 1991066508:
                    C20549.m47081(abstractActivityC3346, abstractC15440, arrayList);
                    m6981 = C2105.m6981("۫ۜ") ^ i4;
                    i5 = ((m6981 ^ i3) * (-809)) ^ (-1179324877);
                    i6 = 1215680273;
                default:
                    if (C2958.f9394 >= 0) {
                        m6981 = C2105.m6981("ۗۡ") ^ i3;
                        i5 = ((m6981 ^ i4) * 26409) ^ 239113286;
                        i6 = -981266852;
                    } else {
                        m6981 = C2105.m6981("᩶᩷") ^ i4;
                        i5 = ((m6981 ^ i3) * (-23537)) ^ (-94371889);
                        i6 = -1424346940;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x00ee, code lost:
    
        if (l.RunnableC0588.f2309 < 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0134, code lost:
    
        if (l.C4616.f14690 <= 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00d5, code lost:
    
        if (l.C3537.f11231 >= 0) goto L14;
     */
    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m10245() {
        /*
            Method dump skipped, instructions count: 1924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.m10245():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (l.C3432.f10845 >= 0) goto L8;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10235(int r23) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.m10235(int):void");
    }

    @Override // l.ActivityC2124, l.ActivityC1252, l.ActivityC23809, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        boolean z = false;
        boolean z2 = false;
        Throwable th = null;
        boolean z3 = false;
        boolean z4 = false;
        int i = -1923164769;
        int i2 = C2958.f9394;
        int i3 = C4117.f13076;
        int m6981 = C2105.m6981("ۢ᩻") ^ i2;
        int i4 = ((m6981 ^ i3) * (-29747)) ^ 1616366878;
        int i5 = -851888551;
        while (true) {
            i = ((((i ^ i3) * 2055) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2086277531:
                case -1071898652:
                    if (C1420.f5096 <= 0) {
                        m6981 = (i2 - C2105.m6981("ܺۚ")) * 33;
                        i4 = ((m6981 ^ i3) * (-10701)) ^ (-1989912335);
                        i5 = 1468219115;
                    } else {
                        m6981 = (i2 - C2105.m6981("֨ܳ")) * 39;
                        i4 = ((m6981 ^ i3) * 29125) ^ 316905236;
                        i5 = 2144560241;
                    }
                case -1850233817:
                case 1154474029:
                    if (C3911.f12484 >= 0) {
                        m6981 = (i2 - C2105.m6981("᩸᩹")) * 99;
                        i4 = ((m6981 ^ i3) * 3667) ^ (-969494041);
                        i5 = 956792668;
                    } else {
                        m6981 = (C0630.m2566("۬ۛ") + i3) * (-57);
                        i4 = ((m6981 ^ i2) * (-29277)) ^ (-1333493977);
                        i5 = -430608579;
                    }
                case -1665164425:
                case -1230621194:
                    if (z3 != z4) {
                        m6981 = (C2105.m6981("۫ۛ") ^ i2) * (-107);
                        i4 = ((m6981 ^ i3) * 26525) ^ 1827245868;
                        i5 = 368153529;
                    } else {
                        m6981 = (C0630.m2566("ۗۘ") ^ i2) * 91;
                        i4 = ((m6981 ^ i3) * 29597) ^ 919210475;
                        i5 = -315253087;
                    }
                case -1623774102:
                case -24836254:
                    try {
                        mo120();
                        m6981 = (C0630.m2566("ۗۘ") ^ i2) * 91;
                        i4 = ((m6981 ^ i3) * 29597) ^ 919210475;
                        i5 = -315253087;
                    } catch (Throwable th2) {
                        th = th2;
                        m6981 = (C0630.m2566("᩻ܽ") ^ i3) * (-107);
                        i4 = ((m6981 ^ i2) * 24867) ^ (-1113045684);
                        i5 = 1249828144;
                    }
                case -1601240457:
                case -1160298149:
                    this.f10579 = true;
                    z = false;
                    m6981 = (i2 - C2105.m6981("ۙܳ")) * 87;
                    i4 = ((m6981 ^ i3) * 27751) ^ (-1013924108);
                    i5 = 428690484;
                case -1329516732:
                case 797669732:
                    if (C4117.f13076 <= 0) {
                        m6981 = (i2 - C2105.m6981("᩸᩹")) * 99;
                        i4 = ((m6981 ^ i3) * 3667) ^ (-969494041);
                        i5 = 956792668;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܳۡ")) * (-55);
                        i4 = ((m6981 ^ i2) * 30857) ^ 1311383933;
                        i5 = -1883278471;
                    }
                case -1142977940:
                case 1124285796:
                    C21923.m49329();
                    C1420.m4913();
                    m6981 = (C2105.m6981("ۧۛ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i4 = ((m6981 ^ i2) * (-23939)) ^ (-1413827681);
                    i5 = 1034204509;
                case -1129083656:
                case -221497050:
                    z3 = this.f10586;
                    z4 = C21943.m49431();
                    m6981 = (C0630.m2566("ۚ۬") + i3) * 101;
                    i4 = ((m6981 ^ i2) * 12289) ^ 302751531;
                    i5 = -1587605430;
                case -1009476666:
                case -231373730:
                    C1047.m3599();
                    if (C3683.f11629 < 0) {
                        m6981 = (C2105.m6981("ۧۛ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m6981 ^ i2) * (-23939)) ^ (-1413827681);
                        i5 = 1034204509;
                    } else {
                        m6981 = C2105.m6981("ᩴܿ") ^ i3;
                        i4 = ((m6981 ^ i2) * 4815) ^ 427215229;
                        i5 = -317379712;
                    }
                case -836520109:
                case 1059689625:
                    this.f10579 = z;
                    return;
                case -823962500:
                case 989197597:
                    C7106.m19120();
                    if (C0714.f2697 < 0) {
                        m6981 = (C2105.m6981("ۧۛ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m6981 ^ i2) * (-23939)) ^ (-1413827681);
                        i5 = 1034204509;
                    } else {
                        m6981 = (i2 - C2105.m6981("᩸᩹")) * 99;
                        i4 = ((m6981 ^ i3) * 3667) ^ (-969494041);
                        i5 = 956792668;
                    }
                case -792184067:
                case -690837728:
                    C7811.m20844();
                    RunnableC1108.m3790();
                    return;
                case -736448868:
                case 941294359:
                    if (C2272.f7362) {
                        m6981 = C0630.m2566("ۡܳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 8229) ^ (-2132373704);
                        i5 = -1915374673;
                    } else {
                        m6981 = (C2105.m6981("᩵۫") ^ i2) * (-29);
                        i4 = ((m6981 ^ i3) * 13863) ^ (-86377514);
                        i5 = 2145817678;
                    }
                case -715243432:
                case 2115044163:
                    if (RunnableC3474.m10630()) {
                        m6981 = C2105.m6981("᩺֡") ^ i3;
                        i4 = ((m6981 ^ i2) * (-23533)) ^ (-571465228);
                        i5 = -714125659;
                    } else {
                        m6981 = C2105.m6981("ᩴܿ") ^ i3;
                        i4 = ((m6981 ^ i2) * 4815) ^ 427215229;
                        i5 = -317379712;
                    }
                case -618859142:
                case 2138025928:
                    if (C2958.m9034() <= 0) {
                        m6981 = (i2 - C2105.m6981("᩸᩹")) * 99;
                        i4 = ((m6981 ^ i3) * 3667) ^ (-969494041);
                        i5 = 956792668;
                    } else {
                        m6981 = (i2 - C2105.m6981("ܺۚ")) * 33;
                        i4 = ((m6981 ^ i3) * (-10701)) ^ (-1989912335);
                        i5 = 1468219115;
                    }
                case -576807571:
                case 952606871:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = C0630.m2566("ۡܳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 8229) ^ (-2132373704);
                        i5 = -1915374673;
                    } else {
                        m6981 = (C2105.m6981("᩵ᩴ") + i2) * (-45);
                        i4 = ((m6981 ^ i3) * (-25653)) ^ (-1034427013);
                        i5 = 1308407030;
                    }
                case -395755703:
                case 2087957695:
                    C3019.m9255();
                    if (C0964.f3626 == 0) {
                        m6981 = (i2 - C2105.m6981("᩸᩹")) * 99;
                        i4 = ((m6981 ^ i3) * 3667) ^ (-969494041);
                        i5 = 956792668;
                    } else {
                        m6981 = C0630.m2566("ۡܳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 8229) ^ (-2132373704);
                        i5 = -1915374673;
                    }
                case -214779047:
                case 643492527:
                    this.f10579 = z;
                    throw th;
                case -181653711:
                case 1819524509:
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = C2105.m6981("᩷ۡ") ^ i3;
                        i4 = ((m6981 ^ i2) * 31487) ^ (-1687049872);
                        i5 = -1096573276;
                    } else {
                        m6981 = C2105.m6981("᩻ۘ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-18347)) ^ 1479775822;
                        i5 = 1179650942;
                    }
                case 269539839:
                case 1459683055:
                    super.onConfigurationChanged(configuration);
                    z2 = this.f10581;
                    m6981 = (C0630.m2566("ܶۜ") ^ i3) * (-9);
                    i4 = ((m6981 ^ i2) * 5605) ^ 1031950466;
                    i5 = -767593441;
                case 278571620:
                case 1104699899:
                    if (this.f10579) {
                        m6981 = C2105.m6981("ܽܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-17003)) ^ (-71350442);
                        i5 = -945397441;
                    } else {
                        m6981 = (C0630.m2566("ܿ֫") + i3) * (-23);
                        i4 = ((m6981 ^ i2) * 14297) ^ 1656909936;
                        i5 = -1994839184;
                    }
                case 550889768:
                case 2036304778:
                    if (z2) {
                        m6981 = C2105.m6981("᩵֫") ^ i2;
                        i4 = ((m6981 ^ i3) * 6187) ^ 486915196;
                        i5 = 133028455;
                    } else {
                        m6981 = (C0630.m2566("ۗۘ") ^ i2) * 91;
                        i4 = ((m6981 ^ i3) * 29597) ^ 919210475;
                        i5 = -315253087;
                    }
                case 668998053:
                case 1916686542:
                    if (C4075.f12947 >= 0) {
                        m6981 = (i2 - C2105.m6981("᩸᩹")) * 99;
                        i4 = ((m6981 ^ i3) * 3667) ^ (-969494041);
                        i5 = 956792668;
                    } else {
                        m6981 = C2105.m6981("֨ۡ") ^ i3;
                        i4 = ((m6981 ^ i2) * 31239) ^ 200096197;
                        i5 = -1957187085;
                    }
                case 847535114:
                case 1920354982:
                    super.onConfigurationChanged(configuration);
                    return;
                case 1253977127:
                case 1633173191:
                    if (C1005.f3721) {
                        m6981 = C0630.m2566("ۖܶ") ^ i2;
                        i4 = ((m6981 ^ i3) * 30115) ^ (-1817682672);
                        i5 = -626427693;
                    } else {
                        m6981 = (C2105.m6981("ۧۛ") + i3) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m6981 ^ i2) * (-23939)) ^ (-1413827681);
                        i5 = 1034204509;
                    }
                default:
                    if (C7106.m19120() <= 0) {
                        m6981 = (i2 - C2105.m6981("ܺۚ")) * 33;
                        i4 = ((m6981 ^ i3) * (-10701)) ^ (-1989912335);
                        i5 = 1468219115;
                    } else {
                        m6981 = (C0630.m2566("ۜܰ") + i2) * (-75);
                        i4 = ((m6981 ^ i3) * 20011) ^ 562351788;
                        i5 = 1123693370;
                    }
            }
        }
    }

    @Override // l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public void onStart() {
        int i = -2140909081;
        int i2 = AbstractC2021.f6743;
        int i3 = C0050.f910;
        int m2566 = C0630.m2566("ۙ֫") ^ i3;
        int i4 = ((m2566 ^ i2) * (-19579)) ^ 984017032;
        int i5 = -2110001402;
        while (true) {
            i = ((((i ^ i2) * (-17949)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2098310193:
                case -2044304990:
                    View view = this.f10587;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        if (RunnableC0588.f2309 < 0) {
                            if (C3245.f10203 > 0) {
                                if (C1128.f4106 <= 0) {
                                    m2566 = (i3 - C0630.m2566("ۢ۟")) * (-19);
                                    i4 = ((m2566 ^ i2) * (-10959)) ^ 2094926182;
                                    i5 = -1912479161;
                                } else if (C7106.m19120() <= 0) {
                                    m2566 = (C2105.m6981("᩶ۡ") ^ i2) * 39;
                                    i4 = ((m2566 ^ i3) * (-28075)) ^ (-1460708114);
                                    i5 = -161785004;
                                } else if (C0798.m2998() == 0) {
                                    if (C3245.f10203 > 0 && RunnableC0588.f2309 < 0 && C0382.f1805) {
                                        if (C2105.f7037 == 0) {
                                            f10578 = new WeakReference(view);
                                            m2566 = C2105.m6981("ܿܶ") ^ i2;
                                            i4 = ((m2566 ^ i3) * 27927) ^ (-1567003104);
                                            i5 = 1500245537;
                                        }
                                    }
                                }
                            }
                            m2566 = C2105.m6981("۫ۗ") ^ i2;
                            i4 = ((m2566 ^ i3) * 6035) ^ 1754383410;
                            i5 = -444867568;
                        }
                        m2566 = (C2105.m6981("ۢܽ") + i2) * q.h;
                        i4 = ((m2566 ^ i3) * (-1329)) ^ 218266080;
                        i5 = -1263158248;
                    }
                    m2566 = C2105.m6981("ܺۨ") ^ i3;
                    i4 = ((m2566 ^ i2) * 1167) ^ 588063611;
                    i5 = -1848882752;
                    break;
                case -2073468907:
                case 2124295103:
                    if (this.f10587 != null) {
                        m2566 = C0630.m2566("ᩳᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * 14969) ^ 1322952588;
                        i5 = 2118648037;
                    } else {
                        m2566 = C2105.m6981("ܿܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * 27927) ^ (-1567003104);
                        i5 = 1500245537;
                    }
                case -1311848015:
                case -725347406:
                    C3019.m9255();
                    if (C0382.f1805) {
                        m2566 = (C2105.m6981("᩶ۡ") ^ i2) * 39;
                        i4 = ((m2566 ^ i3) * (-28075)) ^ (-1460708114);
                        i5 = -161785004;
                    } else {
                        m2566 = C2105.m6981("ܺۨ") ^ i3;
                        i4 = ((m2566 ^ i2) * 1167) ^ 588063611;
                        i5 = -1848882752;
                    }
                case -1278112033:
                case -575680991:
                    C1420.m4913();
                    break;
                case -981344564:
                case 2094896685:
                    if (C3911.f12484 >= 0) {
                        m2566 = C2105.m6981("۫ۗ") ^ i2;
                        i4 = ((m2566 ^ i3) * 6035) ^ 1754383410;
                        i5 = -444867568;
                    } else {
                        m2566 = C2105.m6981("ܺۨ") ^ i3;
                        i4 = ((m2566 ^ i2) * 1167) ^ 588063611;
                        i5 = -1848882752;
                    }
                case 264341109:
                case 1897484444:
                    super.onStart();
                    break;
                case 1835643493:
                case 1914103844:
                    C0798.m2998();
                    C7106.m19120();
                    m2566 = C2105.m6981("۫ۗ") ^ i2;
                    i4 = ((m2566 ^ i3) * 6035) ^ 1754383410;
                    i5 = -444867568;
                default:
                    if (C1504.f5354) {
                        m2566 = (i3 - C0630.m2566("ۢ۟")) * (-19);
                        i4 = ((m2566 ^ i2) * (-10959)) ^ 2094926182;
                        i5 = -1912479161;
                    } else {
                        m2566 = C2105.m6981("ܺۨ") ^ i3;
                        i4 = ((m2566 ^ i2) * 1167) ^ 588063611;
                        i5 = -1848882752;
                    }
            }
            return;
        }
    }

    @Override // l.ActivityC0737, android.app.Activity
    public void onPause() {
        String str = null;
        int i = 1496605112;
        int i2 = C3537.f11231;
        int i3 = C0483.f2088;
        int m2566 = (C0630.m2566("۟۫") ^ i3) * (-71);
        int i4 = ((m2566 ^ i2) * 18311) ^ (-666152788);
        int i5 = -891046536;
        while (true) {
            i = ((((i ^ i2) * (-25555)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2053926059:
                case 1676787467:
                    C0050.m940();
                    break;
                case -2048285307:
                case 1510687791:
                    C2105.m6982();
                    if (C7811.f24123 >= 0) {
                        m2566 = C0630.m2566("ۙۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * 30693) ^ (-1004404685);
                        i5 = 598894329;
                    } else {
                        m2566 = (i2 - C0630.m2566("ۢۜ")) * (-111);
                        i4 = ((m2566 ^ i3) * 1461) ^ 762034219;
                        i5 = -733565944;
                    }
                case -1997759956:
                case 1436831477:
                    if (C4117.f13076 <= 0) {
                        m2566 = C0630.m2566("ۙۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * 30693) ^ (-1004404685);
                        i5 = 598894329;
                    } else {
                        m2566 = (C2105.m6981("ۙ᩵") ^ i2) * 99;
                        i4 = ((m2566 ^ i3) * 9511) ^ (-1983174386);
                        i5 = 1993613544;
                    }
                case -1769429226:
                case 576234786:
                    C0382.m1848();
                    if (C4263.f13799 > 0) {
                        m2566 = C2105.m6981("ۤᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15953)) ^ 229418889;
                        i5 = 1412067087;
                    } else {
                        m2566 = C0630.m2566("ۙۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * 30693) ^ (-1004404685);
                        i5 = 598894329;
                    }
                case -1760024746:
                case -298759610:
                    if (C21923.f70183 != 0) {
                        m2566 = C0630.m2566("ۛۢ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-27407)) ^ 606353018;
                        i5 = 1194422331;
                    } else {
                        m2566 = (C2105.m6981("᩸ܺ") ^ i3) * (-25);
                        i4 = ((m2566 ^ i2) * 29645) ^ (-1667623710);
                        i5 = 381804;
                    }
                case -1306346815:
                case -412732643:
                    if (C2272.m7503()) {
                        m2566 = C0630.m2566("ۛۢ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-27407)) ^ 606353018;
                        i5 = 1194422331;
                    } else {
                        m2566 = C2105.m6981("ۨᩳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 20105) ^ 1697944484;
                        i5 = -1749938169;
                    }
                case -1177635330:
                case -463956025:
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = C0630.m2566("ۛۢ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-27407)) ^ 606353018;
                        i5 = 1194422331;
                    } else {
                        m2566 = (C2105.m6981("᩸ܶ") + i3) * (-97);
                        i4 = ((m2566 ^ i2) * 13159) ^ 1809718570;
                        i5 = -91332621;
                    }
                case -1097418176:
                case 325960605:
                    MobclickAgent.onPageEnd(str);
                    MobclickAgent.onPause(this);
                    m2566 = C0630.m2566("ۤ᩵") ^ i2;
                    i4 = ((m2566 ^ i3) * 12187) ^ (-1166967533);
                    i5 = -1892925223;
                case -1082774886:
                case -428858167:
                    if (C0050.f910 >= 0) {
                        m2566 = C0630.m2566("᩺ۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-21449)) ^ 288453797;
                        i5 = 1523173414;
                    } else {
                        m2566 = C0630.m2566("ۘۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * 8219) ^ (-1745439984);
                        i5 = -2012484725;
                    }
                case -1013893880:
                case -675276849:
                    super.onPause();
                    if (C1047.f3863 >= 0) {
                        m2566 = C0630.m2566("᩺ۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-21449)) ^ 288453797;
                        i5 = 1523173414;
                    } else {
                        m2566 = (C0630.m2566("ᩴ۠") ^ i2) * (-111);
                        i4 = ((m2566 ^ i3) * (-20551)) ^ (-1796919323);
                        i5 = 1519473493;
                    }
                case -983202536:
                case 1088096860:
                    C0483.m2121();
                    if (C1711.f5919) {
                        m2566 = C0630.m2566("ۙۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * 30693) ^ (-1004404685);
                        i5 = 598894329;
                    } else {
                        m2566 = C0630.m2566("ۛۢ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-27407)) ^ 606353018;
                        i5 = 1194422331;
                    }
                case -670070055:
                case 1586871426:
                    break;
                case -622184156:
                case -57545774:
                    C1047.m3599();
                    m2566 = C2105.m6981("ۤᩴ") ^ i2;
                    i4 = ((m2566 ^ i3) * (-15953)) ^ 229418889;
                    i5 = 1412067087;
                case -580298503:
                case 1217509007:
                    if (C3663.f11553) {
                        m2566 = C0630.m2566("᩺ۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-21449)) ^ 288453797;
                        i5 = 1523173414;
                    } else {
                        m2566 = C0630.m2566("᩻ᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * 19881) ^ (-202168576);
                        i5 = 904058069;
                    }
                case -89721813:
                case 1255349587:
                    if (C4117.f13076 <= 0) {
                        m2566 = (i2 - C0630.m2566("ۢۜ")) * (-111);
                        i4 = ((m2566 ^ i3) * 1461) ^ 762034219;
                        i5 = -733565944;
                    } else {
                        m2566 = (C0630.m2566("ܺۚ") + i3) * 39;
                        i4 = ((m2566 ^ i2) * 12641) ^ 151281775;
                        i5 = 1771921859;
                    }
                case -12786749:
                case 1815537098:
                    if (C0422.f1886 <= 0) {
                        m2566 = C2105.m6981("ۤᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15953)) ^ 229418889;
                        i5 = 1412067087;
                    } else {
                        m2566 = (C2105.m6981("֫ۚ") ^ i2) * 43;
                        i4 = ((m2566 ^ i3) * (-22539)) ^ 337883767;
                        i5 = -2059111027;
                    }
                case 606424544:
                case 902863691:
                    if (C3683.f11629 >= 0) {
                        m2566 = C2105.m6981("ۤᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15953)) ^ 229418889;
                        i5 = 1412067087;
                    } else {
                        m2566 = C2105.m6981("᩻ۘ") ^ i2;
                        i4 = ((m2566 ^ i3) * 4225) ^ (-1540550104);
                        i5 = 1670942006;
                    }
                case 1775408231:
                case 1896163469:
                    str = mo121();
                    int i6 = C6741.f20946;
                    if (C15871.m37616()) {
                        m2566 = C0630.m2566("ۤ᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * 12187) ^ (-1166967533);
                        i5 = -1892925223;
                    } else {
                        m2566 = (C0630.m2566("ۙ۠") ^ i3) * 101;
                        i4 = ((m2566 ^ i2) * 19179) ^ (-254346889);
                        i5 = 443247785;
                    }
                default:
                    if (this.f10588) {
                        m2566 = (C0630.m2566("ܽܶ") + i3) * (-109);
                        i4 = ((m2566 ^ i2) * 8873) ^ (-1991398812);
                        i5 = -1807527693;
                    } else {
                        m2566 = C0630.m2566("ۤ᩵") ^ i2;
                        i4 = ((m2566 ^ i3) * 12187) ^ (-1166967533);
                        i5 = -1892925223;
                    }
            }
            return;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int[] m10213(View view) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1492280921;
        int i5 = C3683.f11629;
        int i6 = C4075.f12947;
        int m6981 = C2105.m6981("۫ۧ") ^ i5;
        int i7 = ((m6981 ^ i6) * 12561) ^ 1154946093;
        int i8 = -242704573;
        while (true) {
            i4 = ((((i4 ^ i6) * 12545) >> 31) & i7) ^ (m6981 ^ i8);
            switch (i4) {
                case -2074490283:
                case 1481088792:
                    C0798.m2998();
                    m6981 = (i5 - C0630.m2566("᩻᩵")) * (-41);
                    i7 = ((m6981 ^ i6) * (-8405)) ^ (-179260279);
                    i8 = 781947222;
                case -1869494967:
                case -109760398:
                    return new int[]{i, i2, i3, view.getPaddingBottom()};
                case -1793956698:
                case 212430369:
                    return null;
                case -1704327329:
                case 1866223546:
                    C3911.m11924();
                    if (C1420.m4913()) {
                        m6981 = (C0630.m2566("ۖܿ") + i6) * (-25);
                        i7 = ((m6981 ^ i5) * 307) ^ 1628977587;
                        i8 = 727453874;
                    } else {
                        m6981 = C2105.m6981("ۜܰ") ^ i5;
                        i7 = ((m6981 ^ i6) * 32749) ^ (-890832554);
                        i8 = -1771532825;
                    }
                case -1375170830:
                case 1567888784:
                    if (C4075.f12947 >= 0) {
                        m6981 = (C0630.m2566("ۖܿ") + i6) * (-25);
                        i7 = ((m6981 ^ i5) * 307) ^ 1628977587;
                        i8 = 727453874;
                    } else {
                        m6981 = C2105.m6981("۠֨") ^ i6;
                        i7 = ((m6981 ^ i5) * 31347) ^ (-1913838444);
                        i8 = -255631740;
                    }
                case -1374706726:
                case 1032853193:
                    if (C1128.m3851() <= 0) {
                        m6981 = C2105.m6981("ۜܰ") ^ i5;
                        i7 = ((m6981 ^ i6) * 32749) ^ (-890832554);
                        i8 = -1771532825;
                    } else {
                        m6981 = (C2105.m6981("ۛ᩵") ^ i6) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i7 = ((m6981 ^ i5) * 9947) ^ (-1878300800);
                        i8 = 693049155;
                    }
                case -1133527349:
                case 1661178553:
                    if (C4117.m12364() == 0) {
                        m6981 = (i5 - C0630.m2566("᩻᩵")) * (-41);
                        i7 = ((m6981 ^ i6) * (-8405)) ^ (-179260279);
                        i8 = 781947222;
                    } else {
                        m6981 = (C0630.m2566("᩶۠") ^ i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i7 = ((m6981 ^ i5) * 32099) ^ (-873038388);
                        i8 = -2075092559;
                    }
                case -1040407885:
                case -929679540:
                    if (C1504.f5354) {
                        m6981 = C2105.m6981("ۜܰ") ^ i5;
                        i7 = ((m6981 ^ i6) * 32749) ^ (-890832554);
                        i8 = -1771532825;
                    } else {
                        m6981 = (C0630.m2566("ᩳ᩶") + i6) * 27;
                        i7 = ((m6981 ^ i5) * 16805) ^ (-567779576);
                        i8 = -416583954;
                    }
                case -914077872:
                case 1780254383:
                    if (C21923.f70183 != 0) {
                        m6981 = C0630.m2566("ܽ֨") ^ i6;
                        i7 = ((m6981 ^ i5) * (-28639)) ^ 533459340;
                        i8 = -346528406;
                    } else {
                        m6981 = (i6 - C0630.m2566("ܿ᩸")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i7 = ((m6981 ^ i5) * (-24099)) ^ (-1284892215);
                        i8 = 307502214;
                    }
                case -683887499:
                case -494223188:
                    if (C3746.f11829 <= 0) {
                        m6981 = C0630.m2566("ܽ֨") ^ i6;
                        i7 = ((m6981 ^ i5) * (-28639)) ^ 533459340;
                        i8 = -346528406;
                    } else {
                        m6981 = C2105.m6981("ܺ۠") ^ i5;
                        i7 = ((m6981 ^ i6) * 11481) ^ (-1183045340);
                        i8 = 1007751239;
                    }
                case -394844120:
                case 1381651617:
                    i = view.getPaddingLeft();
                    i2 = view.getPaddingTop();
                    if (C3683.m11222()) {
                        m6981 = (i5 - C0630.m2566("᩻᩵")) * (-41);
                        i7 = ((m6981 ^ i6) * (-8405)) ^ (-179260279);
                        i8 = 781947222;
                    } else {
                        m6981 = (C2105.m6981("ܿᩴ") + i6) * (-55);
                        i7 = ((m6981 ^ i5) * (-28213)) ^ (-881917298);
                        i8 = -1337069569;
                    }
                case -168489307:
                case -128829661:
                    C0714.m2805();
                    C1294.m4372();
                    return null;
                case 23081127:
                case 2023265684:
                    i3 = view.getPaddingRight();
                    if (C11340.f33930 >= 0) {
                        m6981 = C0630.m2566("ܽ֨") ^ i6;
                        i7 = ((m6981 ^ i5) * (-28639)) ^ 533459340;
                        i8 = -346528406;
                    } else {
                        m6981 = (i5 - C2105.m6981("ۨ֨")) * 15;
                        i7 = ((m6981 ^ i6) * 22343) ^ (-1819025626);
                        i8 = -1433252655;
                    }
                case 74766058:
                case 1180709068:
                    if (C21923.f70183 != 0) {
                        m6981 = C0630.m2566("ܽ֨") ^ i6;
                        i7 = ((m6981 ^ i5) * (-28639)) ^ 533459340;
                        i8 = -346528406;
                    } else {
                        m6981 = C0630.m2566("ܽ۟") ^ i5;
                        i7 = ((m6981 ^ i6) * (-26189)) ^ 271656650;
                        i8 = 1023631871;
                    }
                case 84902898:
                case 687172390:
                    if (view == null) {
                        m6981 = C0630.m2566("ܳ֫") ^ i6;
                        i7 = ((m6981 ^ i5) * (-20765)) ^ (-1208742240);
                        i8 = -2064475359;
                    } else {
                        m6981 = (C0630.m2566("ܶ۟") ^ i5) * 9;
                        i7 = ((m6981 ^ i6) * (-24399)) ^ (-1968776395);
                        i8 = -895863035;
                    }
                case 1305247630:
                case 1670980725:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = C2105.m6981("ۜܰ") ^ i5;
                        i7 = ((m6981 ^ i6) * 32749) ^ (-890832554);
                        i8 = -1771532825;
                    } else {
                        m6981 = (i5 - C2105.m6981("ᩳܺ")) * 7;
                        i7 = ((m6981 ^ i6) * 13381) ^ 1572804248;
                        i8 = 26681752;
                    }
                case 1659869150:
                case 1771237573:
                    if (C22628.f73083 <= 0) {
                        m6981 = (i5 - C0630.m2566("᩻᩵")) * (-41);
                        i7 = ((m6981 ^ i6) * (-8405)) ^ (-179260279);
                        i8 = 781947222;
                    } else {
                        m6981 = (C0630.m2566("ۖܿ") + i6) * (-25);
                        i7 = ((m6981 ^ i5) * 307) ^ 1628977587;
                        i8 = 727453874;
                    }
                default:
                    if (C0798.m2998() != 0) {
                        m6981 = C2105.m6981("ۜܰ") ^ i5;
                        i7 = ((m6981 ^ i6) * 32749) ^ (-890832554);
                        i8 = -1771532825;
                    } else {
                        m6981 = (C0630.m2566("᩹ۘ") + i5) * (-99);
                        i7 = ((m6981 ^ i6) * 19239) ^ (-2063045817);
                        i8 = 603160754;
                    }
            }
        }
    }

    @Override // l.ActivityC0737, l.ActivityC23809, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = -1965780049;
        int i4 = C2167.f7158;
        int i5 = C2958.f9394;
        int m6981 = (C2105.m6981("᩵ۚ") ^ i4) * (-65);
        int i6 = ((m6981 ^ i5) * (-11171)) ^ (-1673937413);
        int i7 = 431953199;
        while (true) {
            i3 = ((((i3 ^ i5) * (-3971)) >> 31) & i6) ^ (m6981 ^ i7);
            switch (i3) {
                case -2075187582:
                case 1234368543:
                    if (C3746.f11829 <= 0) {
                        m6981 = C2105.m6981("ۙܿ") ^ i5;
                        i6 = ((m6981 ^ i4) * 661) ^ 888080218;
                        i7 = -34870700;
                    } else {
                        m6981 = (i4 - C2105.m6981("ۙܶ")) * (-89);
                        i6 = ((m6981 ^ i5) * (-1303)) ^ 1545966298;
                        i7 = 445237713;
                    }
                case -2069725320:
                case 479597415:
                    if (C11340.f33930 >= 0) {
                        m6981 = (C2105.m6981("ܶ᩹") ^ i4) * 17;
                        i6 = ((m6981 ^ i5) * 24413) ^ (-1006712157);
                        i7 = -14553456;
                    } else {
                        m6981 = C2105.m6981("ۙܿ") ^ i5;
                        i6 = ((m6981 ^ i4) * 661) ^ 888080218;
                        i7 = -34870700;
                    }
                case -1987970044:
                case 1826573012:
                    if (C3019.f9544 >= 0) {
                        m6981 = C2105.m6981("۫ۛ") ^ i5;
                        i6 = ((m6981 ^ i4) * 28977) ^ (-548230627);
                        i7 = -268645028;
                    } else {
                        m6981 = C2105.m6981("۟ۢ") ^ i4;
                        i6 = ((m6981 ^ i5) * 7647) ^ 1390806190;
                        i7 = 347116918;
                    }
                case -1852033307:
                case -659089828:
                    C1504.m5179();
                    break;
                case -1698676260:
                case 1807506670:
                    if (C3683.f11629 >= 0) {
                        m6981 = C2105.m6981("۫ۛ") ^ i5;
                        i6 = ((m6981 ^ i4) * 28977) ^ (-548230627);
                        i7 = -268645028;
                    } else {
                        m6981 = (C2105.m6981("ۚ۟") ^ i5) * (-15);
                        i6 = ((m6981 ^ i4) * 6771) ^ 693050203;
                        i7 = 477564657;
                    }
                case -1456834981:
                case -380775024:
                    if (C1420.m4913()) {
                        m6981 = C2105.m6981("۫ۛ") ^ i5;
                        i6 = ((m6981 ^ i4) * 28977) ^ (-548230627);
                        i7 = -268645028;
                    } else {
                        m6981 = (C2105.m6981("ܿ᩸") + i5) * (-7);
                        i6 = ((m6981 ^ i4) * 10005) ^ 805704019;
                        i7 = -934670670;
                    }
                case -1278409493:
                case -930900686:
                    if (C0422.f1886 <= 0) {
                        m6981 = C2105.m6981("ۙܿ") ^ i5;
                        i6 = ((m6981 ^ i4) * 661) ^ 888080218;
                        i7 = -34870700;
                    } else {
                        m6981 = C0630.m2566("֨ۡ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-25357)) ^ 1132459991;
                        i7 = -1023955836;
                    }
                case -840514893:
                case 1921622643:
                    if (i == 11101) {
                        m6981 = (C0630.m2566("᩸۠") + i5) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i6 = ((m6981 ^ i4) * 24503) ^ 449050767;
                        i7 = 2041682837;
                    } else {
                        m6981 = C2105.m6981("ۢܽ") ^ i4;
                        i6 = ((m6981 ^ i5) * 3181) ^ 1342463247;
                        i7 = 201650917;
                    }
                case -749848351:
                case 1870986473:
                    if (C2520.m8026()) {
                        m6981 = C2105.m6981("ۙܿ") ^ i5;
                        i6 = ((m6981 ^ i4) * 661) ^ 888080218;
                        i7 = -34870700;
                    } else {
                        m6981 = C0630.m2566("ۤۘ") ^ i4;
                        i6 = ((m6981 ^ i5) * 25301) ^ (-1582631543);
                        i7 = -1823478256;
                    }
                case -740138924:
                case 463574683:
                    if (C3911.f12484 >= 0) {
                        m6981 = C2105.m6981("ۙܿ") ^ i5;
                        i6 = ((m6981 ^ i4) * 661) ^ 888080218;
                        i7 = -34870700;
                    } else {
                        m6981 = (C0630.m2566("ۧ᩷") ^ i5) * 127;
                        i6 = ((m6981 ^ i4) * (-25419)) ^ 1258266733;
                        i7 = -157562956;
                    }
                case -716004776:
                case -514968395:
                    super.onActivityResult(i, i2, intent);
                    break;
                case -672717986:
                case 906169311:
                    C0630.m2564();
                    if (C1504.f5354) {
                        m6981 = C2105.m6981("ۙܿ") ^ i5;
                        i6 = ((m6981 ^ i4) * 661) ^ 888080218;
                        i7 = -34870700;
                    } else {
                        m6981 = (i5 - C0630.m2566("ۧᩳ")) * 17;
                        i6 = ((m6981 ^ i4) * 13865) ^ 1838148250;
                        i7 = 1540792252;
                    }
                case -187272420:
                case 147450693:
                    C2958.m9034();
                    m6981 = (C2105.m6981("ܶ᩹") ^ i4) * 17;
                    i6 = ((m6981 ^ i5) * 24413) ^ (-1006712157);
                    i7 = -14553456;
                case 450808475:
                case 830568343:
                    if (C0382.m1848()) {
                        m6981 = (i5 - C0630.m2566("ۧᩳ")) * 17;
                        i6 = ((m6981 ^ i4) * 13865) ^ 1838148250;
                        i7 = 1540792252;
                    } else {
                        m6981 = C2105.m6981("ܽ᩵") ^ i4;
                        i6 = ((m6981 ^ i5) * (-22367)) ^ 1006141064;
                        i7 = 246502816;
                    }
                case 1243201090:
                case 1906676770:
                    if (C2520.f8000 >= 0) {
                        m6981 = C2105.m6981("۫ۛ") ^ i5;
                        i6 = ((m6981 ^ i4) * 28977) ^ (-548230627);
                        i7 = -268645028;
                    } else {
                        m6981 = C0630.m2566("ܳۨ") ^ i4;
                        i6 = ((m6981 ^ i5) * 7631) ^ 1782238039;
                        i7 = 807124899;
                    }
                case 1524075322:
                case 1943639582:
                    C19044.m43893(i, i2, intent, this.f10596);
                    this.f10596 = null;
                    break;
                case 1835568941:
                case 2043564107:
                    if (C1047.f3863 >= 0) {
                        m6981 = (C2105.m6981("ܶ᩹") ^ i4) * 17;
                        i6 = ((m6981 ^ i5) * 24413) ^ (-1006712157);
                        i7 = -14553456;
                    } else {
                        m6981 = C2105.m6981("ܿᩳ") ^ i5;
                        i6 = ((m6981 ^ i4) * (-20509)) ^ 1011744839;
                        i7 = 644618594;
                    }
                default:
                    if (C1128.m3851() <= 0) {
                        m6981 = (C2105.m6981("ܶ᩹") ^ i4) * 17;
                        i6 = ((m6981 ^ i5) * 24413) ^ (-1006712157);
                        i7 = -14553456;
                    } else {
                        m6981 = (C0630.m2566("ۖۨ") ^ i5) * (-115);
                        i6 = ((m6981 ^ i4) * 20239) ^ (-571942759);
                        i7 = -1922651179;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10226(InterfaceC4227 interfaceC4227) {
        this.f10596 = interfaceC4227;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10231(AbstractC15440 abstractC15440, List list) {
        String str;
        short[] sArr;
        int i;
        int m6981;
        int i2;
        int m69812;
        int i3;
        int m69813;
        int i4;
        int i5;
        int m2566;
        int i6;
        ArrayList arrayList = null;
        String str2 = null;
        short[] sArr2 = null;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1802945081;
        int i12 = C5695.f17556;
        int i13 = C0422.f1886;
        int m25662 = C0630.m2566("ܺܿ") ^ i13;
        int i14 = ((m25662 ^ i12) * (-14579)) ^ (-335876518);
        int i15 = 14096528;
        while (true) {
            int i16 = m25662 ^ i15;
            while (true) {
                i11 = ((((i11 ^ i12) * 15325) >> 31) & i14) ^ i16;
                switch (i11) {
                    case -2121771609:
                    case -1067212264:
                        C0422.m1963();
                        C0050.m940();
                        return false;
                    case -2041752676:
                    case -1665224340:
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        if (Build.VERSION.SDK_INT >= 26) {
                            m6981 = C2105.m6981("ܿܿ") ^ i12;
                            i14 = ((m6981 ^ i13) * (-9403)) ^ 1279258740;
                            i2 = 2064635492;
                            i16 = m6981 ^ i2;
                            str2 = str;
                            i11 = i;
                            sArr2 = sArr;
                        }
                        m6981 = C0630.m2566("۠ۘ") ^ i13;
                        i14 = ((m6981 ^ i12) * 1843) ^ (-2117455069);
                        i2 = 1896840768;
                        i16 = m6981 ^ i2;
                        str2 = str;
                        i11 = i;
                        sArr2 = sArr;
                    case -2015545592:
                    case -372352594:
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        this.f10591 = abstractC15440;
                        if (list == null) {
                            m6981 = (i13 - C2105.m6981("ۘۘ")) * (-123);
                            i14 = ((m6981 ^ i12) * (-30139)) ^ (-1668140013);
                            i2 = 702271985;
                        } else {
                            m6981 = C0630.m2566("᩸ܺ") ^ i12;
                            i14 = ((m6981 ^ i13) * (-20479)) ^ 616066820;
                            i2 = 2062075366;
                        }
                        i16 = m6981 ^ i2;
                        str2 = str;
                        i11 = i;
                        sArr2 = sArr;
                    case -1999724233:
                    case 1438733393:
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        i10 = 52509;
                        m6981 = (C0630.m2566("֨ۛ") ^ i13) * (-41);
                        i14 = ((m6981 ^ i12) * 21401) ^ (-1438590735);
                        i2 = -1635054702;
                        i16 = m6981 ^ i2;
                        str2 = str;
                        i11 = i;
                        sArr2 = sArr;
                    case -1861473415:
                    case 406633684:
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        if (C2520.f8000 < 0) {
                            m6981 = (C2105.m6981("ᩳ᩵") ^ i12) * (-51);
                            i14 = ((m6981 ^ i13) * (-12897)) ^ (-2109932388);
                            i2 = 2051926906;
                            i16 = m6981 ^ i2;
                            str2 = str;
                            i11 = i;
                            sArr2 = sArr;
                        }
                        m6981 = (C0630.m2566("ۜܿ") ^ i13) * (-83);
                        i14 = ((m6981 ^ i12) * (-21865)) ^ (-1595930280);
                        i2 = -488740154;
                        i16 = m6981 ^ i2;
                        str2 = str;
                        i11 = i;
                        sArr2 = sArr;
                    case -1806707592:
                    case 1642649735:
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        this.f10585 = arrayList;
                        short[] sArr3 = f10577;
                        if (C3245.m9925() == 0) {
                            String m6573 = AbstractC2021.m6573(sArr3, 293, 8, i10);
                            if (C3746.m11369() < 0) {
                                StringBuilder sb = new StringBuilder(m6573);
                                C3245.m9923(sb, getPackageName());
                                str2 = C0050.m947(sb);
                                if (C3537.f11231 < 0) {
                                    m69813 = C2105.m6981("ܶܽ") ^ i13;
                                    i14 = ((m69813 ^ i12) * (-5747)) ^ (-272646407);
                                    i4 = 298339265;
                                    i16 = m69813 ^ i4;
                                    i11 = i;
                                    sArr2 = sArr;
                                }
                                m69813 = C2105.m6981("ۧܿ") ^ i12;
                                i14 = ((m69813 ^ i13) * 19059) ^ (-1205281878);
                                i4 = 1349918794;
                                i16 = m69813 ^ i4;
                                i11 = i;
                                sArr2 = sArr;
                            }
                            m69812 = (C2105.m6981("ۚ᩵") ^ i12) * (-115);
                            i14 = ((m69812 ^ i13) * (-9175)) ^ 174093082;
                            i3 = -295279941;
                            i16 = m69812 ^ i3;
                            str2 = str;
                            i11 = i;
                            sArr2 = sArr;
                        }
                        str2 = str;
                        m69813 = C2105.m6981("ۧܿ") ^ i12;
                        i14 = ((m69813 ^ i13) * 19059) ^ (-1205281878);
                        i4 = 1349918794;
                        i16 = m69813 ^ i4;
                        i11 = i;
                        sArr2 = sArr;
                    case -1774710317:
                    case -1085892951:
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        if (!getPackageManager().canRequestPackageInstalls()) {
                            m6981 = C2105.m6981("ܺۜ") ^ i13;
                            i14 = ((m6981 ^ i12) * 11627) ^ (-390076262);
                            i2 = -1623813397;
                            i16 = m6981 ^ i2;
                            str2 = str;
                            i11 = i;
                            sArr2 = sArr;
                        }
                        m6981 = C0630.m2566("۠ۘ") ^ i13;
                        i14 = ((m6981 ^ i12) * 1843) ^ (-2117455069);
                        i2 = 1896840768;
                        i16 = m6981 ^ i2;
                        str2 = str;
                        i11 = i;
                        sArr2 = sArr;
                    case -1747132813:
                    case -1722439197:
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        arrayList = new ArrayList(list);
                        m69812 = C2105.m6981("۫ᩳ") ^ i12;
                        i14 = ((m69812 ^ i13) * 15319) ^ (-1477717395);
                        i3 = 2037908679;
                        i16 = m69812 ^ i3;
                        str2 = str;
                        i11 = i;
                        sArr2 = sArr;
                    case -1674101240:
                    case 1377831020:
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        i10 = 13740;
                        m6981 = (C0630.m2566("֨ۛ") ^ i13) * (-41);
                        i14 = ((m6981 ^ i12) * 21401) ^ (-1438590735);
                        i2 = -1635054702;
                        i16 = m6981 ^ i2;
                        str2 = str;
                        i11 = i;
                        sArr2 = sArr;
                    case -1601904009:
                    case -140339477:
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        s = sArr[292];
                        s2 = 8872;
                        if (!C1711.f5919) {
                            m6981 = C2105.m6981("ۛ᩹") ^ i12;
                            i14 = ((m6981 ^ i13) * (-97)) ^ (-1941210994);
                            i2 = 357785880;
                            i16 = m6981 ^ i2;
                            str2 = str;
                            i11 = i;
                            sArr2 = sArr;
                        }
                        m6981 = (C0630.m2566("ۜܿ") ^ i13) * (-83);
                        i14 = ((m6981 ^ i12) * (-21865)) ^ (-1595930280);
                        i2 = -488740154;
                        i16 = m6981 ^ i2;
                        str2 = str;
                        i11 = i;
                        sArr2 = sArr;
                    case -1555987353:
                    case -127619151:
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        int i17 = s + s2;
                        i7 = i17 * i17;
                        i8 = s * s;
                        if (!C0382.m1848()) {
                            m6981 = (C0630.m2566("᩸ܽ") ^ i13) * 81;
                            i14 = ((m6981 ^ i12) * (-4223)) ^ 168003991;
                            i2 = 1179263481;
                            i16 = m6981 ^ i2;
                            str2 = str;
                            i11 = i;
                            sArr2 = sArr;
                        }
                        m6981 = (C0630.m2566("ۜܿ") ^ i13) * (-83);
                        i14 = ((m6981 ^ i12) * (-21865)) ^ (-1595930280);
                        i2 = -488740154;
                        i16 = m6981 ^ i2;
                        str2 = str;
                        i11 = i;
                        sArr2 = sArr;
                    case -1119757019:
                    case 1146900965:
                        C4117.m12364();
                        if (C4117.m12364() == 0) {
                            str = str2;
                            i5 = i11;
                            m2566 = C2105.m6981("ܳ᩻") ^ i13;
                            i14 = 1166384921 ^ ((m2566 ^ i12) * (-18075));
                            i6 = 1841624896;
                            i16 = i6 ^ m2566;
                            str2 = str;
                            i11 = i5;
                        } else {
                            str = str2;
                            sArr = sArr2;
                            i = i11;
                            m6981 = (C0630.m2566("ۜܿ") ^ i13) * (-83);
                            i14 = ((m6981 ^ i12) * (-21865)) ^ (-1595930280);
                            i2 = -488740154;
                            i16 = m6981 ^ i2;
                            str2 = str;
                            i11 = i;
                            sArr2 = sArr;
                        }
                    case -993796085:
                    case 1837543687:
                        str = str2;
                        i5 = i11;
                        sArr2 = f10577;
                        if (C1128.f4106 > 0) {
                            m2566 = C0630.m2566("ܰۜ") ^ i13;
                            i14 = (-1141692154) ^ ((m2566 ^ i12) * 22929);
                            i6 = -280416186;
                            i16 = i6 ^ m2566;
                            str2 = str;
                            i11 = i5;
                        }
                        m2566 = C2105.m6981("ܳ᩻") ^ i13;
                        i14 = 1166384921 ^ ((m2566 ^ i12) * (-18075));
                        i6 = 1841624896;
                        i16 = i6 ^ m2566;
                        str2 = str;
                        i11 = i5;
                    case -928203296:
                    case 1288081870:
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        int i18 = i8 + i9;
                        if (i7 - (i18 + i18) <= 0) {
                            m6981 = (C2105.m6981("ۗ֡") ^ i13) * 73;
                            i14 = ((m6981 ^ i12) * 2573) ^ (-1080821792);
                            i2 = -2028460853;
                        } else {
                            m6981 = C2105.m6981("ܳ᩹") ^ i12;
                            i14 = ((m6981 ^ i13) * 3991) ^ 792495862;
                            i2 = 1710848198;
                        }
                        i16 = m6981 ^ i2;
                        str2 = str;
                        i11 = i;
                        sArr2 = sArr;
                    case -509188410:
                    case 1966034409:
                        if (C3537.m10746() <= 0) {
                            break;
                        }
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        m69812 = (C2105.m6981("ۚ᩵") ^ i12) * (-115);
                        i14 = ((m69812 ^ i13) * (-9175)) ^ 174093082;
                        i3 = -295279941;
                        i16 = m69812 ^ i3;
                        str2 = str;
                        i11 = i;
                        sArr2 = sArr;
                        break;
                    case -332703440:
                    case 1776608953:
                        return true;
                    case -11062218:
                    case 841569311:
                        C3537.m10746();
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        m69812 = (C2105.m6981("ۚ᩵") ^ i12) * (-115);
                        i14 = ((m69812 ^ i13) * (-9175)) ^ 174093082;
                        i3 = -295279941;
                        i16 = m69812 ^ i3;
                        str2 = str;
                        i11 = i;
                        sArr2 = sArr;
                    case 153349639:
                    case 2095700259:
                        Uri parse = Uri.parse(str2);
                        str = str2;
                        short[] sArr4 = f10577;
                        if (C0237.m1481() >= 0) {
                            i5 = i11;
                            m2566 = C2105.m6981("ܳ᩻") ^ i13;
                            i14 = 1166384921 ^ ((m2566 ^ i12) * (-18075));
                            i6 = 1841624896;
                            i16 = i6 ^ m2566;
                            str2 = str;
                            i11 = i5;
                        } else {
                            i = i11;
                            if (C0483.f2088 < 0) {
                                this.f10595.m15940(new Intent(C3746.m11357(sArr4, 301, 43, i10), parse));
                                return false;
                            }
                            sArr = sArr2;
                            str2 = str;
                            m69813 = C2105.m6981("ۧܿ") ^ i12;
                            i14 = ((m69813 ^ i13) * 19059) ^ (-1205281878);
                            i4 = 1349918794;
                            i16 = m69813 ^ i4;
                            i11 = i;
                            sArr2 = sArr;
                        }
                    case 155387004:
                    case 508814063:
                        C0382.m1848();
                        if (C2126.f7087) {
                            str = str2;
                            i5 = i11;
                            m2566 = C2105.m6981("ܳ᩻") ^ i13;
                            i14 = 1166384921 ^ ((m2566 ^ i12) * (-18075));
                            i6 = 1841624896;
                            i16 = i6 ^ m2566;
                            str2 = str;
                            i11 = i5;
                        } else {
                            str = str2;
                            sArr = sArr2;
                            i = i11;
                            m69812 = (C2105.m6981("ۚ᩵") ^ i12) * (-115);
                            i14 = ((m69812 ^ i13) * (-9175)) ^ 174093082;
                            i3 = -295279941;
                            i16 = m69812 ^ i3;
                            str2 = str;
                            i11 = i;
                            sArr2 = sArr;
                        }
                    case 784062068:
                    case 1326124541:
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        arrayList = null;
                        m69812 = C2105.m6981("۫ᩳ") ^ i12;
                        i14 = ((m69812 ^ i13) * 15319) ^ (-1477717395);
                        i3 = 2037908679;
                        i16 = m69812 ^ i3;
                        str2 = str;
                        i11 = i;
                        sArr2 = sArr;
                    default:
                        str = str2;
                        sArr = sArr2;
                        i = i11;
                        i9 = 78712384;
                        if (C5695.f17556 < 0) {
                            m6981 = C2105.m6981("ۖۢ") ^ i12;
                            i14 = ((m6981 ^ i13) * (-32367)) ^ 1167824404;
                            i2 = 630933371;
                            i16 = m6981 ^ i2;
                            str2 = str;
                            i11 = i;
                            sArr2 = sArr;
                        }
                        m6981 = (C0630.m2566("ۜܿ") ^ i13) * (-83);
                        i14 = ((m6981 ^ i12) * (-21865)) ^ (-1595930280);
                        i2 = -488740154;
                        i16 = m6981 ^ i2;
                        str2 = str;
                        i11 = i;
                        sArr2 = sArr;
                }
            }
            m25662 = (i12 - C2105.m6981("ۡ᩹")) * 119;
            i14 = ((m25662 ^ i13) * (-9503)) ^ 935499201;
            i15 = -1150833185;
        }
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m10239() {
        Window window = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = -657210023;
        int i5 = C2958.f9394;
        int i6 = C4075.f12947;
        int m2566 = C0630.m2566("ܿܽ") ^ i5;
        int i7 = ((m2566 ^ i6) * (-8415)) ^ (-1534318067);
        int i8 = 1461532532;
        while (true) {
            i4 = ((((i4 ^ i6) * 7991) >> 31) & i7) ^ (m2566 ^ i8);
            switch (i4) {
                case -1957483135:
                case -1572926915:
                    window = C7106.m19115(this);
                    if (C2126.f7087) {
                        m2566 = (C2105.m6981("᩻֨") + i6) * (-109);
                        i7 = ((m2566 ^ i5) * 28385) ^ (-977003989);
                        i8 = -62429060;
                    } else {
                        m2566 = (C2105.m6981("ܳۜ") ^ i6) * (-119);
                        i7 = ((m2566 ^ i5) * (-27927)) ^ (-1627289345);
                        i8 = -1175675706;
                    }
                case -1616357023:
                case -632256074:
                    window.addFlags(i);
                    i2 = R.color.transparent;
                    if (C0798.f2919) {
                        m2566 = C0630.m2566("ۙۜ") ^ i5;
                        i7 = ((m2566 ^ i6) * 26587) ^ 1887382787;
                        i8 = -28583531;
                    } else {
                        m2566 = (C2105.m6981("᩻᩵") + i6) * (-47);
                        i7 = ((m2566 ^ i5) * 3293) ^ 2018730968;
                        i8 = -506520544;
                    }
                case -1451247429:
                case 392379378:
                    window.setBackgroundDrawableResource(i2);
                    z = false;
                    z = false;
                    if (C1047.f3863 >= 0) {
                        m2566 = (i5 - C2105.m6981("ۨ᩷")) * 31;
                        i7 = ((m2566 ^ i6) * 32251) ^ (-365289178);
                        i8 = 1917943302;
                    } else {
                        m2566 = (i6 - C0630.m2566("᩹ۢ")) * (-17);
                        i7 = ((m2566 ^ i5) * (-1827)) ^ 1979864723;
                        i8 = -1848799550;
                    }
                case -1422924515:
                case 2012470627:
                    window.setNavigationBarContrastEnforced(z);
                    m2566 = (C2105.m6981("۠۠") + i6) * (-9);
                    i7 = ((m2566 ^ i5) * 7373) ^ 1677705090;
                    i8 = 1512676988;
                case -1421720151:
                case 1272767345:
                    if (i3 >= 29) {
                        m2566 = C2105.m6981("ᩳۤ") ^ i5;
                        i7 = ((m2566 ^ i6) * (-9501)) ^ (-654642332);
                        i8 = -2100151003;
                    } else {
                        m2566 = (C2105.m6981("۠۠") + i6) * (-9);
                        i7 = ((m2566 ^ i5) * 7373) ^ 1677705090;
                        i8 = 1512676988;
                    }
                case -1335768747:
                case 1515727195:
                    window.setNavigationBarDividerColor(z ? 1 : 0);
                    m2566 = (C0630.m2566("ۜۖ") ^ i5) * 77;
                    i7 = ((m2566 ^ i6) * (-1139)) ^ (-2054939387);
                    i8 = 276353504;
                case -1323441017:
                case -1015304243:
                    if (C1504.f5354) {
                        m2566 = (C2105.m6981("ۢۧ") + i5) * (-117);
                        i7 = ((m2566 ^ i6) * 10571) ^ 364373041;
                        i8 = -1153642991;
                    } else {
                        m2566 = (C2105.m6981("᩻֨") + i6) * (-109);
                        i7 = ((m2566 ^ i5) * 28385) ^ (-977003989);
                        i8 = -62429060;
                    }
                case -1293449987:
                case -1188161225:
                    if (C2520.f8000 >= 0) {
                        m2566 = (C2105.m6981("ۢۧ") + i5) * (-117);
                        i7 = ((m2566 ^ i6) * 10571) ^ 364373041;
                        i8 = -1153642991;
                    } else {
                        m2566 = (C0630.m2566("۫᩺") + i5) * 127;
                        i7 = ((m2566 ^ i6) * 28863) ^ 221972814;
                        i8 = -121950990;
                    }
                case -991257426:
                case 1676102147:
                    window.setNavigationBarColor(z ? 1 : 0);
                    if (C0050.f910 >= 0) {
                        m2566 = (i5 - C2105.m6981("ۨ᩷")) * 31;
                        i7 = ((m2566 ^ i6) * 32251) ^ (-365289178);
                        i8 = 1917943302;
                    } else {
                        m2566 = (i5 - C2105.m6981("۠ۤ")) * (-3);
                        i7 = ((m2566 ^ i6) * (-19737)) ^ 1116759963;
                        i8 = 1685748706;
                    }
                case -825216982:
                case 425070311:
                    if (C5695.f17556 >= 0) {
                        m2566 = C2105.m6981("֫ۧ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-20603)) ^ (-852963115);
                        i8 = 960906179;
                    } else {
                        m2566 = (i6 - C0630.m2566("֨ܿ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((m2566 ^ i5) * 20897) ^ (-1603058124);
                        i8 = 1411478686;
                    }
                case -582342402:
                case -374319688:
                    if (C0237.f1507 == 0) {
                        m2566 = (C2105.m6981("᩻֨") + i6) * (-109);
                        i7 = ((m2566 ^ i5) * 28385) ^ (-977003989);
                        i8 = -62429060;
                    } else {
                        m2566 = C2105.m6981("֫ۧ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-20603)) ^ (-852963115);
                        i8 = 960906179;
                    }
                case -413951406:
                case 2017272873:
                    if (C1773.f6144 <= 0) {
                        m2566 = C2105.m6981("֫ۧ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-20603)) ^ (-852963115);
                        i8 = 960906179;
                    } else {
                        m2566 = C2105.m6981("᩻ܳ") ^ i6;
                        i7 = ((m2566 ^ i5) * 25609) ^ (-1502179134);
                        i8 = -1861344473;
                    }
                case -200780496:
                case 1301390181:
                    C3432.m10477();
                    m2566 = (C2105.m6981("᩻֨") + i6) * (-109);
                    i7 = ((m2566 ^ i5) * 28385) ^ (-977003989);
                    i8 = -62429060;
                case -106665954:
                case 617828639:
                    if (C1504.f5354) {
                        m2566 = (i5 - C2105.m6981("ۨ᩷")) * 31;
                        i7 = ((m2566 ^ i6) * 32251) ^ (-365289178);
                        i8 = 1917943302;
                    } else {
                        m2566 = C0630.m2566("ۧ᩷") ^ i5;
                        i7 = ((m2566 ^ i6) * (-81)) ^ (-804809752);
                        i8 = -537500860;
                    }
                case 11036608:
                case 329126019:
                    RunnableC1108.m3790();
                    break;
                case 191485985:
                case 2000319814:
                    if (C7106.f21815 == 0) {
                        m2566 = C2105.m6981("֫ۧ") ^ i6;
                        i7 = ((m2566 ^ i5) * (-20603)) ^ (-852963115);
                        i8 = 960906179;
                    } else {
                        m2566 = (i5 - C2105.m6981("ۨ᩷")) * 31;
                        i7 = ((m2566 ^ i6) * 32251) ^ (-365289178);
                        i8 = 1917943302;
                    }
                case 1155563429:
                case 2010384455:
                    i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 28) {
                        m2566 = C0630.m2566("ܰܿ") ^ i6;
                        i7 = ((m2566 ^ i5) * 28021) ^ 446434894;
                        i8 = -771498356;
                    } else {
                        m2566 = (C0630.m2566("ۜۖ") ^ i5) * 77;
                        i7 = ((m2566 ^ i6) * (-1139)) ^ (-2054939387);
                        i8 = 276353504;
                    }
                case 1295589400:
                case 1685773192:
                    i = 201326592;
                    if (C3245.m9925() != 0) {
                        m2566 = (C2105.m6981("ۢۧ") + i5) * (-117);
                        i7 = ((m2566 ^ i6) * 10571) ^ 364373041;
                        i8 = -1153642991;
                    } else {
                        m2566 = C0630.m2566("᩶᩵") ^ i5;
                        i7 = ((m2566 ^ i6) * 29705) ^ (-1475893849);
                        i8 = 1787415881;
                    }
                case 1861041428:
                case 2012551077:
                    break;
                default:
                    if (C0382.f1805) {
                        m2566 = C2105.m6981("֫ۘ") ^ i5;
                        i7 = ((m2566 ^ i6) * 8057) ^ (-1681370935);
                        i8 = -1927329741;
                    } else {
                        m2566 = C0630.m2566("ۙۜ") ^ i5;
                        i7 = ((m2566 ^ i6) * 26587) ^ 1887382787;
                        i8 = -28583531;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        if (l.RunnableC1108.f4040 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bc, code lost:
    
        r0 = l.C0630.m2566("۟ۘ") ^ r20;
        r11 = ((r0 ^ r21) * (-5225)) ^ (-2133351539);
        r23 = -1896777154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b9, code lost:
    
        if (l.C1504.f5354 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if (l.C3432.f10845 >= 0) goto L41;
     */
    @Override // l.InterfaceC13223
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo10220(java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 1354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.mo10220(java.lang.String):void");
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C9762 m10240() {
        return this.f10584;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (l.C22628.m50615() != 0) goto L14;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10221(java.lang.String r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.m10221(java.lang.String, boolean):void");
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m10242() {
        this.f10588 = false;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m10214() {
        this.f10583 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (l.C1005.m3501() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e8, code lost:
    
        r1 = (r25 - l.C2105.m6981("ۨ᩶")) * (-23);
        r11 = ((r1 ^ r26) * 24557) ^ (-1605593324);
        r27 = -1137093790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (l.C11340.f33930 >= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
    
        r1 = l.C0630.m2566("۫ۘ") ^ r26;
        r11 = ((r1 ^ r25) * (-23155)) ^ 375800324;
        r27 = -1194328648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        if (l.ViewOnClickListenerC1958.m6429() < 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e2, code lost:
    
        if (l.C1294.f4556 >= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010f, code lost:
    
        if (l.C0714.f2697 >= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b2, code lost:
    
        if (r3 == (l.C0630.m2566(r9) ^ 2116999285)) goto L66;
     */
    @Override // l.ActivityC1252, l.ActivityC4927, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r31) {
        /*
            Method dump skipped, instructions count: 1610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10223(final Throwable th, final DialogInterface.OnDismissListener onDismissListener) {
        AbstractC7379 abstractC7379 = null;
        int i = -1433689341;
        int i2 = C0714.f2697;
        int i3 = C2958.f9394;
        int m2566 = (i2 - C0630.m2566("ۡ۟")) * (-113);
        int i4 = ((m2566 ^ i3) * (-22271)) ^ 1299338265;
        int i5 = 1395876033;
        while (true) {
            i = ((((i ^ i3) * (-23593)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2069673194:
                case -1264253369:
                    if (C1773.f6144 <= 0) {
                        m2566 = C0630.m2566("ܺ᩺") ^ i2;
                        i4 = ((m2566 ^ i3) * 3325) ^ (-624413977);
                        i5 = 1489639945;
                    } else {
                        m2566 = (C0630.m2566("ܽ֡") + i3) * (-75);
                        i4 = ((m2566 ^ i2) * (-24947)) ^ 1655951245;
                        i5 = 1344199704;
                    }
                case -2050074797:
                case -1246246722:
                    break;
                case -2020589977:
                case 343040942:
                    C0237.m1481();
                    if (C0798.f2919) {
                        m2566 = (i2 - C2105.m6981("ۗܰ")) * 43;
                        i4 = ((m2566 ^ i3) * (-24421)) ^ (-477552031);
                        i5 = 691789789;
                    } else {
                        m2566 = C2105.m6981("᩻ۧ") ^ i3;
                        i4 = ((m2566 ^ i2) * 11595) ^ (-1106532471);
                        i5 = 810320356;
                    }
                case -1869692112:
                case 792013681:
                    if (C21923.f70183 != 0) {
                        m2566 = C2105.m6981("᩻ۧ") ^ i3;
                        i4 = ((m2566 ^ i2) * 11595) ^ (-1106532471);
                        i5 = 810320356;
                    } else {
                        m2566 = C0630.m2566("ܺ᩺") ^ i2;
                        i4 = ((m2566 ^ i3) * 3325) ^ (-624413977);
                        i5 = 1489639945;
                    }
                case -1627163569:
                case -155952453:
                    if (C0237.m1481() >= 0) {
                        m2566 = C2105.m6981("᩻ۧ") ^ i3;
                        i4 = ((m2566 ^ i2) * 11595) ^ (-1106532471);
                        i5 = 810320356;
                    } else {
                        m2566 = C0630.m2566("᩶ܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-5219)) ^ 1958128657;
                        i5 = -907262919;
                    }
                case -1607770263:
                case -836808815:
                    C1005.m3501();
                    m2566 = C2105.m6981("᩻ۧ") ^ i3;
                    i4 = ((m2566 ^ i2) * 11595) ^ (-1106532471);
                    i5 = 810320356;
                case -1528640858:
                case 813565275:
                    if (C0714.m2805()) {
                        m2566 = (C0630.m2566("ۨۢ") + i3) * (-5);
                        i4 = ((m2566 ^ i2) * 8885) ^ 959479213;
                        i5 = 1303900464;
                    } else {
                        m2566 = C2105.m6981("֨᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * 10789) ^ 99655782;
                        i5 = -1585776451;
                    }
                case -982687553:
                case -792187724:
                    C1420.m4913();
                    C2958.m9034();
                    break;
                case -695862636:
                case 367467409:
                    RunnableC1937.m6387();
                    if (C0630.f2410 <= 0) {
                        m2566 = (i2 - C2105.m6981("ۗܰ")) * 43;
                        i4 = ((m2566 ^ i3) * (-24421)) ^ (-477552031);
                        i5 = 691789789;
                    } else {
                        m2566 = (C2105.m6981("ᩴۗ") + i3) * 91;
                        i4 = ((m2566 ^ i2) * (-4817)) ^ 153912964;
                        i5 = -1558602695;
                    }
                case -149646541:
                case 831240462:
                    final C20765 c20765 = (C20765) abstractC7379;
                    runOnUiThread(new Runnable(this) { // from class: l.֨ܺ᩷

                        /* renamed from: ܰܶᩴ, reason: not valid java name and contains not printable characters */
                        private static final short[] f4398 = {2332, 16503, -25564, 17478, -13256, -13261, -13262, -13266, -13267, -13250, -13261, -13294, -13219, -13298, -13299, -13284, -13282, -13288, -13219, -13295, -13288, -13285, -13303, -13219, -13294, -13293, -13219, -13287, -13288, -13301, -13292, -13282, -13288, -26944, 16825, 17498, -27334, 17637, -17721, -19815, 20338, -24305, -13256, -13260, -13266, -13255, -13260, -13265, -13293, -13294, -13303, -13219, -13285, -13294, -13304, -13293, -13287, -25486, -24982, -20515, -13293, -13294, -13303, -13219, -13288, -13307, -13292, -13298, -13303, 17128, -26700, 24094, 23169, 21012, -28253, -25290, -17183, 23385, -13253, -13292, -13295, -13288, -13219, -13293, -13294, -13303, -13219, -13285, -13294, -13304, -13293, -13287, -13241, -13193, 22470, -16387, 19658};

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ AbstractActivityC3346 f4401;

                        {
                            int i6 = 389449940;
                            int i7 = ViewOnClickListenerC1958.f6529;
                            int i8 = C4263.f13799;
                            int m6981 = C2105.m6981("ܰᩳ") ^ i7;
                            int i9 = ((m6981 ^ i8) * (-17181)) ^ (-1227650749);
                            int i10 = 407301182;
                            while (true) {
                                i6 = ((((i6 ^ i8) * (-25465)) >> 31) & i9) ^ (m6981 ^ i10);
                                switch (i6) {
                                    case -2039567439:
                                    case 1524997906:
                                        C11340.m28031();
                                        if (C0422.f1886 > 0) {
                                            m6981 = (i8 - C2105.m6981("ۨۧ")) * (-3);
                                            i9 = ((m6981 ^ i7) * 25005) ^ (-1521260902);
                                            i10 = 1347801141;
                                        } else {
                                            m6981 = (C2105.m6981("ܰ֨") ^ i7) * (-127);
                                            i9 = ((m6981 ^ i8) * (-6179)) ^ 1122262089;
                                            i10 = -736158297;
                                        }
                                    case -1987727777:
                                    case 1738361426:
                                        if (C1773.f6144 <= 0) {
                                            m6981 = (i8 - C2105.m6981("ۨۧ")) * (-3);
                                            i9 = ((m6981 ^ i7) * 25005) ^ (-1521260902);
                                            i10 = 1347801141;
                                        } else {
                                            m6981 = C2105.m6981("᩷᩶") ^ i8;
                                            i9 = ((m6981 ^ i7) * 10109) ^ (-1104709482);
                                            i10 = 171092886;
                                        }
                                    case -1768159896:
                                    case 112647242:
                                        C0382.m1848();
                                        if (C1294.f4556 >= 0) {
                                            m6981 = (i8 - C2105.m6981("ۨۧ")) * (-3);
                                            i9 = ((m6981 ^ i7) * 25005) ^ (-1521260902);
                                            i10 = 1347801141;
                                        } else {
                                            m6981 = (C2105.m6981("۠֫") + i8) * 37;
                                            i9 = ((m6981 ^ i7) * (-13205)) ^ 311771126;
                                            i10 = -1152129110;
                                        }
                                    case -1627955145:
                                    case 1047383137:
                                        if (C11340.m28031()) {
                                            m6981 = C0630.m2566("᩹֫") ^ i8;
                                            i9 = ((m6981 ^ i7) * (-4217)) ^ 1864580048;
                                            i10 = -1839581410;
                                        } else {
                                            m6981 = (C2105.m6981("ܰ֨") ^ i7) * (-127);
                                            i9 = ((m6981 ^ i8) * (-6179)) ^ 1122262089;
                                            i10 = -736158297;
                                        }
                                    case -1509612444:
                                    case 1354666799:
                                        if (RunnableC3474.f10992 <= 0) {
                                            m6981 = C2105.m6981("᩷ᩴ") ^ i7;
                                            i9 = ((m6981 ^ i8) * (-6295)) ^ (-1199215567);
                                            i10 = 247821816;
                                        } else {
                                            m6981 = (i7 - C2105.m6981("ۛܶ")) * 115;
                                            i9 = ((m6981 ^ i8) * 28599) ^ (-1732591334);
                                            i10 = 756832147;
                                        }
                                    case -1439627907:
                                    case -311949167:
                                        if (C3683.f11629 >= 0) {
                                            m6981 = C2105.m6981("᩷ᩴ") ^ i7;
                                            i9 = ((m6981 ^ i8) * (-6295)) ^ (-1199215567);
                                            i10 = 247821816;
                                        } else {
                                            m6981 = C0630.m2566("ۤۚ") ^ i7;
                                            i9 = ((m6981 ^ i8) * (-31859)) ^ 567300027;
                                            i10 = -319785294;
                                        }
                                    case -1194127629:
                                    case 1650249885:
                                        if (C1047.m3599() >= 0) {
                                            m6981 = C2105.m6981("᩷ᩴ") ^ i7;
                                            i9 = ((m6981 ^ i8) * (-6295)) ^ (-1199215567);
                                            i10 = 247821816;
                                        } else {
                                            m6981 = C2105.m6981("ۛۛ") ^ i8;
                                            i9 = ((m6981 ^ i7) * (-21003)) ^ 1073528863;
                                            i10 = 905959452;
                                        }
                                    case -530514728:
                                    case 2060774770:
                                        C1420.m4913();
                                        m6981 = (i8 - C2105.m6981("ۨۧ")) * (-3);
                                        i9 = ((m6981 ^ i7) * 25005) ^ (-1521260902);
                                        i10 = 1347801141;
                                    case -423864281:
                                    case 805020857:
                                        if (C0714.f2697 >= 0) {
                                            m6981 = C0630.m2566("֫ۙ") ^ i7;
                                            i9 = ((m6981 ^ i8) * 28371) ^ (-1362987223);
                                            i10 = -1270616479;
                                        } else {
                                            m6981 = C2105.m6981("ۚۛ") ^ i7;
                                            i9 = ((m6981 ^ i8) * 24311) ^ (-1823359554);
                                            i10 = 1070525445;
                                        }
                                    case -18102021:
                                    case 706901429:
                                        if (C3746.f11829 > 0) {
                                            m6981 = (i8 - C2105.m6981("ۨۧ")) * (-3);
                                            i9 = ((m6981 ^ i7) * 25005) ^ (-1521260902);
                                            i10 = 1347801141;
                                        } else {
                                            m6981 = C0630.m2566("֫ۙ") ^ i7;
                                            i9 = ((m6981 ^ i8) * 28371) ^ (-1362987223);
                                            i10 = -1270616479;
                                        }
                                    case 607057535:
                                    case 1810731891:
                                        if (C22628.f73083 <= 0) {
                                            m6981 = C2105.m6981("᩷ᩴ") ^ i7;
                                            i9 = ((m6981 ^ i8) * (-6295)) ^ (-1199215567);
                                            i10 = 247821816;
                                        } else {
                                            m6981 = (i8 - C2105.m6981("᩺֡")) * 127;
                                            i9 = ((m6981 ^ i7) * (-22337)) ^ 132291988;
                                            i10 = 360085806;
                                        }
                                    case 770666063:
                                    case 1452269638:
                                        if (C0798.f2919) {
                                            m6981 = C0630.m2566("֫ۙ") ^ i7;
                                            i9 = ((m6981 ^ i8) * 28371) ^ (-1362987223);
                                            i10 = -1270616479;
                                        } else {
                                            m6981 = (C2105.m6981("ۖۧ") ^ i7) * 71;
                                            i9 = ((m6981 ^ i8) * (-10081)) ^ (-654081808);
                                            i10 = 742935020;
                                        }
                                    case 851168176:
                                    case 1766084704:
                                        C1005.m3501();
                                        C0964.m3413();
                                        throw new RuntimeException();
                                    case 1281732938:
                                    case 1286440349:
                                        this.f4401 = this;
                                        if (C4075.f12947 >= 0) {
                                            m6981 = C0630.m2566("֫ۙ") ^ i7;
                                            i9 = ((m6981 ^ i8) * 28371) ^ (-1362987223);
                                            i10 = -1270616479;
                                        } else {
                                            m6981 = (C0630.m2566("᩷֡") + i8) * 61;
                                            i9 = ((m6981 ^ i7) * 27927) ^ 751515858;
                                            i10 = 1465240741;
                                        }
                                    case 1304157320:
                                    case 2039511078:
                                        if (C1005.f3721) {
                                            m6981 = C0630.m2566("᩸ۧ") ^ i7;
                                            i9 = ((m6981 ^ i8) * (-22445)) ^ (-2019540387);
                                            i10 = -576376569;
                                        } else {
                                            m6981 = C0630.m2566("֫ۙ") ^ i7;
                                            i9 = ((m6981 ^ i8) * 28371) ^ (-1362987223);
                                            i10 = -1270616479;
                                        }
                                    default:
                                        return;
                                }
                            }
                        }

                        /*  JADX ERROR: Type inference failed
                            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
                            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
                            */
                        @Override // java.lang.Runnable
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 3588
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.RunnableC1229.run():void");
                        }
                    });
                    break;
                case -26458466:
                case 1964533489:
                    if (C0382.m1848()) {
                        m2566 = (C2105.m6981("ᩴۗ") + i3) * 91;
                        i4 = ((m2566 ^ i2) * (-4817)) ^ 153912964;
                        i5 = -1558602695;
                    } else {
                        m2566 = (i2 - C0630.m2566("ۤܺ")) * (-39);
                        i4 = ((m2566 ^ i3) * (-31617)) ^ (-1167605504);
                        i5 = 1330478908;
                    }
                case 8462064:
                case 1253317024:
                    if (C0050.f910 >= 0) {
                        m2566 = (i2 - C2105.m6981("ۗܰ")) * 43;
                        i4 = ((m2566 ^ i3) * (-24421)) ^ (-477552031);
                        i5 = 691789789;
                    } else {
                        m2566 = C0630.m2566("ۡ᩷") ^ i2;
                        i4 = ((m2566 ^ i3) * 20589) ^ (-980880776);
                        i5 = 290226660;
                    }
                case 336189519:
                case 2084946608:
                    if (C21923.f70183 != 0) {
                        m2566 = C2105.m6981("֨᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * 10789) ^ 99655782;
                        i5 = -1585776451;
                    } else {
                        m2566 = (C2105.m6981("۫ۚ") + i2) * (-5);
                        i4 = ((m2566 ^ i3) * 32735) ^ 814664828;
                        i5 = -1126997518;
                    }
                case 492426515:
                case 844554075:
                    if (C0422.m1963()) {
                        m2566 = C0630.m2566("۟ۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * 16601) ^ 1926046530;
                        i5 = -1104034661;
                    } else {
                        m2566 = (i2 - C2105.m6981("ۗܰ")) * 43;
                        i4 = ((m2566 ^ i3) * (-24421)) ^ (-477552031);
                        i5 = 691789789;
                    }
                case 739201694:
                case 1458311574:
                    if (C4117.f13076 <= 0) {
                        m2566 = C2105.m6981("֨᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * 10789) ^ 99655782;
                        i5 = -1585776451;
                    } else {
                        m2566 = C2105.m6981("۟۟") ^ i3;
                        i4 = ((m2566 ^ i2) * 19007) ^ (-1544330170);
                        i5 = -1080682281;
                    }
                case 778724504:
                case 2080021275:
                    abstractC7379 = C2958.m9023(this);
                    if (abstractC7379.mo19832() == EnumC13728.DESTROYED) {
                        m2566 = C2105.m6981("᩺֫") ^ i3;
                        i4 = ((m2566 ^ i2) * 4623) ^ 962577752;
                        i5 = 1083582552;
                    } else {
                        m2566 = (C2105.m6981("ܳ᩵") ^ i2) * 85;
                        i4 = ((m2566 ^ i3) * 3941) ^ (-1891184303);
                        i5 = 1896687461;
                    }
                case 1955651840:
                case 2123910799:
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = (i2 - C2105.m6981("ۗܰ")) * 43;
                        i4 = ((m2566 ^ i3) * (-24421)) ^ (-477552031);
                        i5 = 691789789;
                    } else {
                        m2566 = (C2105.m6981("ܳܺ") ^ i2) * (-115);
                        i4 = ((m2566 ^ i3) * (-11409)) ^ 1088210051;
                        i5 = 1042204588;
                    }
                default:
                    if (C0630.f2410 <= 0) {
                        m2566 = (i2 - C2105.m6981("ۗܰ")) * 43;
                        i4 = ((m2566 ^ i3) * (-24421)) ^ (-477552031);
                        i5 = 691789789;
                    } else {
                        m2566 = (C2105.m6981("֨᩺") ^ i3) * 77;
                        i4 = ((m2566 ^ i2) * (-2985)) ^ 1425351083;
                        i5 = 1163103583;
                    }
            }
            return;
        }
    }

    @Override // l.InterfaceC13223
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo10222(Throwable th) {
        C4075.m12246(this, th, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10229(C13064 c13064, View view, View view2, View view3, View view4, View view5) {
        int i = 566312286;
        int i2 = C2958.f9394;
        int i3 = C4616.f14690;
        int m6981 = (C2105.m6981("ۜۜ") + i3) * 57;
        int i4 = ((m6981 ^ i2) * (-24379)) ^ 1870911273;
        int i5 = -1231035743;
        while (true) {
            i = ((((i ^ i2) * (-5527)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1887594949:
                case -67790218:
                    if (C2958.f9394 >= 0) {
                        m6981 = C0630.m2566("ᩴۙ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-9041)) ^ (-276382857);
                        i5 = 731083918;
                    } else {
                        m6981 = (C0630.m2566("ۛᩳ") + i3) * (-73);
                        i4 = ((m6981 ^ i2) * 1445) ^ 2020510188;
                        i5 = -544709725;
                    }
                case -1787576634:
                case 884303079:
                    if (C3663.f11553) {
                        m6981 = (C2105.m6981("۫ۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m6981 ^ i3) * 12977) ^ (-1900390154);
                        i5 = -1469601899;
                    } else {
                        m6981 = (C2105.m6981("֡᩻") + i3) * (-29);
                        i4 = ((m6981 ^ i2) * 26931) ^ 1767489414;
                        i5 = -421296862;
                    }
                case -1493619699:
                case 2105965355:
                    C2126.m7040();
                    if (RunnableC1108.f4040) {
                        m6981 = (C0630.m2566("ۛᩳ") + i3) * (-73);
                        i4 = ((m6981 ^ i2) * 1445) ^ 2020510188;
                        i5 = -544709725;
                    } else {
                        m6981 = (C2105.m6981("۫ۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m6981 ^ i3) * 12977) ^ (-1900390154);
                        i5 = -1469601899;
                    }
                case -1462047047:
                case 939442099:
                    if (C2167.f7158 >= 0) {
                        m6981 = C2105.m6981("ۖۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 4267) ^ (-2126978927);
                        i5 = -582050187;
                    } else {
                        m6981 = C2105.m6981("ܽܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-15437)) ^ (-45696381);
                        i5 = 240915454;
                    }
                case -1243457988:
                case 731985195:
                    C1128.m3851();
                    C2272.m7503();
                    m6981 = C0630.m2566("ᩴۙ") ^ i2;
                    i4 = ((m6981 ^ i3) * (-9041)) ^ (-276382857);
                    i5 = 731083918;
                case -995361755:
                case -558721796:
                    RunnableC3474.m10630();
                    C2105.m6982();
                    break;
                case -747183429:
                case 379230945:
                    if (C0714.f2697 >= 0) {
                        m6981 = (C0630.m2566("ۛᩳ") + i3) * (-73);
                        i4 = ((m6981 ^ i2) * 1445) ^ 2020510188;
                        i5 = -544709725;
                    } else {
                        m6981 = (i3 - C2105.m6981("۬ܿ")) * 127;
                        i4 = ((m6981 ^ i2) * 2493) ^ 1366913465;
                        i5 = 1150600723;
                    }
                case -599717057:
                case 1723094027:
                    if (C4159.m12565() >= 0) {
                        m6981 = (C0630.m2566("ۛᩳ") + i3) * (-73);
                        i4 = ((m6981 ^ i2) * 1445) ^ 2020510188;
                        i5 = -544709725;
                    } else {
                        m6981 = C2105.m6981("ۧۛ") ^ i3;
                        i4 = ((m6981 ^ i2) * 22845) ^ 2026533693;
                        i5 = 289783207;
                    }
                case -474924425:
                case 1448975450:
                    if (C0630.f2410 <= 0) {
                        m6981 = (C2105.m6981("ۚܶ") + i2) * 69;
                        i4 = ((m6981 ^ i3) * (-28819)) ^ 920215349;
                        i5 = 1864786068;
                    } else {
                        m6981 = C2105.m6981("۫ۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * 10743) ^ 2009494441;
                        i5 = 694357236;
                    }
                case -75616567:
                case 1332748031:
                    if (C1916.f6442) {
                        m6981 = (C0630.m2566("ܳܶ") ^ i3) * 95;
                        i4 = ((m6981 ^ i2) * 15723) ^ (-1048299537);
                        i5 = -905332037;
                    } else {
                        m6981 = C2105.m6981("ۖۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 4267) ^ (-2126978927);
                        i5 = -582050187;
                    }
                case 468469349:
                case 1505270658:
                    if (C0714.m2805()) {
                        m6981 = C0630.m2566("ܽ᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * 871) ^ (-698515243);
                        i5 = -1535912353;
                    } else {
                        m6981 = (C2105.m6981("ۚܶ") + i2) * 69;
                        i4 = ((m6981 ^ i3) * (-28819)) ^ 920215349;
                        i5 = 1864786068;
                    }
                case 580034217:
                case 670391139:
                    C0422.m1963();
                    if (C4616.m13552() != 0) {
                        m6981 = (C0630.m2566("ۛᩳ") + i3) * (-73);
                        i4 = ((m6981 ^ i2) * 1445) ^ 2020510188;
                        i5 = -544709725;
                    } else {
                        m6981 = C2105.m6981("ۖۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 4267) ^ (-2126978927);
                        i5 = -582050187;
                    }
                case 1094712853:
                case 1598805085:
                    m10230(c13064, view, view2, view3, view4, null, null, view5, null);
                    break;
                case 1364325904:
                case 2013097548:
                    if (C1420.m4913()) {
                        m6981 = (C2105.m6981("ۚܶ") + i2) * 69;
                        i4 = ((m6981 ^ i3) * (-28819)) ^ 920215349;
                        i5 = 1864786068;
                    } else {
                        m6981 = C0630.m2566("ۙ᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * 28979) ^ 103685744;
                        i5 = 2045830178;
                    }
                case 1968627025:
                case 2051242700:
                    if (C7106.m19120() <= 0) {
                        m6981 = (C0630.m2566("ۛᩳ") + i3) * (-73);
                        i4 = ((m6981 ^ i2) * 1445) ^ 2020510188;
                        i5 = -544709725;
                    } else {
                        m6981 = C0630.m2566("ۤۖ") ^ i2;
                        i4 = ((m6981 ^ i3) * 13481) ^ (-1306269302);
                        i5 = -1399153305;
                    }
                default:
                    if (C3663.f11553) {
                        m6981 = (C0630.m2566("ۛᩳ") + i3) * (-73);
                        i4 = ((m6981 ^ i2) * 1445) ^ 2020510188;
                        i5 = -544709725;
                    } else {
                        m6981 = C0630.m2566("ۤ᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * (-22537)) ^ 376635303;
                        i5 = -1551911204;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x004e, code lost:
    
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0054, code lost:
    
        if (l.C0964.f3626 != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0248, code lost:
    
        r0 = l.C2105.m6981("֫ܰ") ^ r11;
        r14 = ((r0 ^ r12) * 32061) ^ (-1056812096);
        r2 = 1463546858;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ee, code lost:
    
        r17 = r0;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10237(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.m10237(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dd, code lost:
    
        if (l.C2272.f7362 != false) goto L25;
     */
    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context, l.InterfaceC13223
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startActivity(android.content.Intent r33) {
        /*
            Method dump skipped, instructions count: 1776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.startActivity(android.content.Intent):void");
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static String m10211() {
        WeakReference weakReference = null;
        View view = null;
        C12392 c12392 = null;
        int i = 2025531194;
        int i2 = C0483.f2088;
        int i3 = ServiceConnectionC3453.f10921;
        int m2566 = C0630.m2566("֡֫") ^ i3;
        int i4 = ((m2566 ^ i2) * (-20371)) ^ (-1150388003);
        int i5 = -1449218280;
        while (true) {
            i = ((((i ^ i2) * 22135) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2062264275:
                case 1530887349:
                    C0798.m2998();
                    C3432.m10477();
                    return null;
                case -2056048729:
                case -868424295:
                    if (C0964.f3626 != 0) {
                        m2566 = (C2105.m6981("ܿۜ") + i2) * 89;
                        i4 = ((m2566 ^ i3) * (-27301)) ^ (-52880950);
                        i5 = 1207276009;
                    } else {
                        m2566 = (C0630.m2566("ܶ᩹") + i2) * (-39);
                        i4 = ((m2566 ^ i3) * (-6861)) ^ (-1428678314);
                        i5 = 1226528331;
                    }
                case -1650419767:
                case 1579877555:
                    if (view instanceof C12392) {
                        m2566 = C2105.m6981("ۚܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-17423)) ^ (-386663489);
                        i5 = -1507343497;
                    } else {
                        m2566 = C2105.m6981("۫ܶ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-4913)) ^ (-1029687349);
                        i5 = 49955357;
                    }
                case -1605282625:
                case -784686182:
                    if (C4616.f14690 <= 0) {
                        m2566 = C0630.m2566("᩺ᩳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 11129) ^ 600474778;
                        i5 = -53057256;
                    } else {
                        m2566 = C0630.m2566("ۡᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * 8957) ^ 1543257135;
                        i5 = -1574875335;
                    }
                case -1600862224:
                case 43917465:
                    if (C1773.f6144 <= 0) {
                        m2566 = (i3 - C0630.m2566("ܶ֨")) * 99;
                        i4 = ((m2566 ^ i2) * (-11587)) ^ 969661918;
                        i5 = 1314477107;
                    } else {
                        m2566 = C2105.m6981("᩺᩶") ^ i2;
                        i4 = ((m2566 ^ i3) * 26561) ^ 200670590;
                        i5 = 706852465;
                    }
                case -1566910003:
                case 739213353:
                    view = (View) weakReference.get();
                    if (view != null) {
                        m2566 = C2105.m6981("ۛܰ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-5435)) ^ 1670676260;
                        i5 = -2130147067;
                    } else {
                        m2566 = (C0630.m2566("۬۠") + i2) * (-59);
                        i4 = ((m2566 ^ i3) * 26551) ^ (-1824805456);
                        i5 = 1349762072;
                    }
                case -1550348710:
                case 369856760:
                    C22628.m50615();
                    C4117.m12364();
                    m2566 = (C0630.m2566("֨ܺ") + i2) * (-15);
                    i4 = ((m2566 ^ i3) * (-9201)) ^ (-910418557);
                    i5 = -1210302480;
                case -1273511042:
                case -1025794165:
                    return null;
                case -1172036204:
                case -350758144:
                    if (C1504.f5354) {
                        m2566 = (C0630.m2566("֨ܺ") + i2) * (-15);
                        i4 = ((m2566 ^ i3) * (-9201)) ^ (-910418557);
                        i5 = -1210302480;
                    } else {
                        m2566 = (i3 - C2105.m6981("֨ܰ")) * (-37);
                        i4 = ((m2566 ^ i2) * (-2433)) ^ (-197478906);
                        i5 = -421139021;
                    }
                case -915667220:
                case 1301143640:
                    c12392 = ((C7473) view).m20095();
                    if (C22628.f73083 <= 0) {
                        m2566 = (i3 - C0630.m2566("ܶ֨")) * 99;
                        i4 = ((m2566 ^ i2) * (-11587)) ^ 969661918;
                        i5 = 1314477107;
                    } else {
                        m2566 = C2105.m6981("ۨۜ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-11205)) ^ 493209400;
                        i5 = 1036880414;
                    }
                case -731058071:
                case 1018906867:
                    if (C1504.f5354) {
                        m2566 = (C2105.m6981("ۢܶ") ^ i3) * (-91);
                        i4 = ((m2566 ^ i2) * (-19885)) ^ 1006705591;
                        i5 = 1739822510;
                    } else {
                        m2566 = (C0630.m2566("֨ܺ") + i2) * (-15);
                        i4 = ((m2566 ^ i3) * (-9201)) ^ (-910418557);
                        i5 = -1210302480;
                    }
                case -304999479:
                case 12798146:
                    C1294.m4372();
                    if (RunnableC1937.f6483 < 0) {
                        m2566 = (C0630.m2566("֨ܺ") + i2) * (-15);
                        i4 = ((m2566 ^ i3) * (-9201)) ^ (-910418557);
                        i5 = -1210302480;
                    } else {
                        m2566 = (C2105.m6981("ܿۜ") + i2) * 89;
                        i4 = ((m2566 ^ i3) * (-27301)) ^ (-52880950);
                        i5 = 1207276009;
                    }
                case -301110586:
                case 1648684453:
                    if (view instanceof C7473) {
                        m2566 = (C2105.m6981("۫ܿ") + i3) * (-37);
                        i4 = ((m2566 ^ i2) * 8807) ^ (-1595143427);
                        i5 = 157646112;
                    } else {
                        m2566 = (C0630.m2566("۬۠") + i2) * (-59);
                        i4 = ((m2566 ^ i3) * 26551) ^ (-1824805456);
                        i5 = 1349762072;
                    }
                case -184438962:
                case 187212479:
                    if (C3019.m9255() <= 0) {
                        m2566 = (C2105.m6981("ܿۜ") + i2) * 89;
                        i4 = ((m2566 ^ i3) * (-27301)) ^ (-52880950);
                        i5 = 1207276009;
                    } else {
                        m2566 = C2105.m6981("ۧܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-17853)) ^ 1736298944;
                        i5 = -959954535;
                    }
                case -162051279:
                case 270717777:
                    C4159.m12565();
                    if (C3537.f11231 >= 0) {
                        m2566 = (C2105.m6981("ܿۜ") + i2) * 89;
                        i4 = ((m2566 ^ i3) * (-27301)) ^ (-52880950);
                        i5 = 1207276009;
                    } else {
                        m2566 = (i3 - C0630.m2566("ܶ֨")) * 99;
                        i4 = ((m2566 ^ i2) * (-11587)) ^ 969661918;
                        i5 = 1314477107;
                    }
                case 304504156:
                case 1803739143:
                    return c12392.m30378();
                case 396023976:
                case 2030325480:
                    return ((C12392) view).m30492();
                case 454099656:
                case 648414667:
                    if (C2272.f7362) {
                        m2566 = (i3 - C0630.m2566("ܶ֨")) * 99;
                        i4 = ((m2566 ^ i2) * (-11587)) ^ 969661918;
                        i5 = 1314477107;
                    } else {
                        m2566 = C0630.m2566("ܿۗ") ^ i2;
                        i4 = ((m2566 ^ i3) * 12711) ^ 959558675;
                        i5 = 320820450;
                    }
                case 708798929:
                case 995505072:
                    if (C0483.f2088 >= 0) {
                        m2566 = (C2105.m6981("ۢܶ") ^ i3) * (-91);
                        i4 = ((m2566 ^ i2) * (-19885)) ^ 1006705591;
                        i5 = 1739822510;
                    } else {
                        m2566 = (i2 - C0630.m2566("ۨ᩹")) * (-87);
                        i4 = ((m2566 ^ i3) * 17147) ^ 246950034;
                        i5 = -1067950782;
                    }
                case 872789626:
                case 1164570178:
                    weakReference = f10578;
                    if (weakReference != null) {
                        m2566 = (i3 - C0630.m2566("᩸ᩳ")) * (-61);
                        i4 = ((m2566 ^ i2) * 32651) ^ 1671408336;
                        i5 = -1514416586;
                    } else {
                        m2566 = (C0630.m2566("۬۠") + i2) * (-59);
                        i4 = ((m2566 ^ i3) * 26551) ^ (-1824805456);
                        i5 = 1349762072;
                    }
                case 1308595046:
                case 2097346185:
                    if (C3683.f11629 >= 0) {
                        m2566 = C0630.m2566("᩺ᩳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 11129) ^ 600474778;
                        i5 = -53057256;
                    } else {
                        m2566 = (C2105.m6981("۫᩸") + i3) * (-103);
                        i4 = ((m2566 ^ i2) * 25557) ^ 853777319;
                        i5 = 122656613;
                    }
                default:
                    if (C1047.m3599() >= 0) {
                        m2566 = C0630.m2566("᩺ᩳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 11129) ^ 600474778;
                        i5 = -53057256;
                    } else {
                        m2566 = (C2105.m6981("ܰ֡") + i3) * (-11);
                        i4 = ((m2566 ^ i2) * 29645) ^ (-1964529019);
                        i5 = -1016529399;
                    }
            }
        }
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12437 m10244() {
        C12437 c12437;
        C12437 c124372 = null;
        int i = -1519517302;
        int i2 = C4117.f13076;
        int i3 = RunnableC3474.f10992;
        int m6981 = (C2105.m6981("ܳ۠") ^ i3) * 63;
        int i4 = ((m6981 ^ i2) * (-20309)) ^ (-609096686);
        int i5 = -185681823;
        while (true) {
            i = ((((i ^ i2) * (-26511)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1277075714:
                case -330431487:
                    c12437 = this.f10597;
                    if (c12437 == null) {
                        m6981 = (i2 - C2105.m6981("۬ᩴ")) * 93;
                        i4 = ((m6981 ^ i3) * (-29577)) ^ (-1769052146);
                        i5 = -1963496234;
                    } else {
                        c124372 = c12437;
                        m6981 = C0630.m2566("ۛۨ") ^ i3;
                        i4 = ((m6981 ^ i2) * 28057) ^ 1901045249;
                        i5 = 457658098;
                    }
                case -502384913:
                case 980530960:
                    RunnableC1108.m3790();
                    return null;
                case -322082247:
                case 202568213:
                    Window m6300 = C1916.m6300(this);
                    if (C0630.f2410 > 0 && C5695.m16023() < 0) {
                        if (!C3663.f11553) {
                            if (C3746.m11369() < 0) {
                                if (C3911.f12484 < 0) {
                                    if (C22628.f73083 > 0) {
                                        if (C2520.m8026()) {
                                            m6981 = C2105.m6981("᩷֡") ^ i2;
                                            i4 = ((m6981 ^ i3) * (-14667)) ^ (-1214967504);
                                            i5 = 1766346968;
                                        } else if (C3245.f10203 > 0 && C2167.f7158 < 0) {
                                            Window m63002 = C1916.m6300(this);
                                            if (RunnableC0588.f2309 < 0) {
                                                c12437 = new C12437(m6300, m63002.getDecorView());
                                                this.f10597 = c12437;
                                                c124372 = c12437;
                                                m6981 = C0630.m2566("ۛۨ") ^ i3;
                                                i4 = ((m6981 ^ i2) * 28057) ^ 1901045249;
                                                i5 = 457658098;
                                            }
                                        }
                                    }
                                }
                            }
                            m6981 = C0630.m2566("ۗ֡") ^ i2;
                            i4 = ((m6981 ^ i3) * 7573) ^ 277990307;
                            i5 = 879097366;
                        }
                        m6981 = C2105.m6981("ᩴܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-27851)) ^ 144299641;
                        i5 = 492087008;
                    }
                    m6981 = (i3 - C0630.m2566("᩹ۙ")) * 25;
                    i4 = ((m6981 ^ i2) * 20023) ^ 1409353809;
                    i5 = 1838379146;
                    break;
                case 484719292:
                case 2058180658:
                    return c124372;
                case 522990139:
                case 2050150705:
                    C5695.m16023();
                    if (C0798.f2919) {
                        m6981 = (i3 - C0630.m2566("᩹ۙ")) * 25;
                        i4 = ((m6981 ^ i2) * 20023) ^ 1409353809;
                        i5 = 1838379146;
                    } else {
                        m6981 = C2105.m6981("᩷֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-14667)) ^ (-1214967504);
                        i5 = 1766346968;
                    }
                case 690810949:
                case 1065545845:
                    C4616.m13552();
                    m6981 = (i3 - C0630.m2566("᩹ۙ")) * 25;
                    i4 = ((m6981 ^ i2) * 20023) ^ 1409353809;
                    i5 = 1838379146;
                case 1655485723:
                case 1827102104:
                    C0050.m940();
                    if (C1047.f3863 < 0) {
                        m6981 = C2105.m6981("᩷֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-14667)) ^ (-1214967504);
                        i5 = 1766346968;
                    } else {
                        m6981 = (C0630.m2566("۠᩻") + i3) * 7;
                        i4 = ((m6981 ^ i2) * 6431) ^ (-1248542837);
                        i5 = -1302454589;
                    }
                default:
                    if (C1504.f5354) {
                        m6981 = C0630.m2566("ۗ֡") ^ i2;
                        i4 = ((m6981 ^ i3) * 7573) ^ 277990307;
                        i5 = 879097366;
                    } else {
                        m6981 = (C0630.m2566("۠᩻") + i3) * 7;
                        i4 = ((m6981 ^ i2) * 6431) ^ (-1248542837);
                        i5 = -1302454589;
                    }
            }
        }
    }

    /* renamed from: ۙ */
    public void mo120() {
        C13630.m32769();
        C12814.m31129();
        recreate();
    }

    @Override // l.InterfaceC13223
    public final C19258 buildDialog() {
        int i = DialogInterfaceC0206.f1451;
        return new C19258(this);
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C0603 m10233() {
        if (this.f10589 == null) {
            synchronized (this) {
                if (this.f10589 == null) {
                    this.f10589 = new C0603(this);
                }
            }
        }
        return this.f10589;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0085, code lost:
    
        if (l.C1711.f5919 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x006b, code lost:
    
        if (l.ServiceConnectionC3453.m10564() > 0) goto L80;
     */
    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10238() {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.m10238():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (l.C21923.f70183 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (l.C4616.f14690 > 0) goto L17;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10230(final l.C13064 r34, final android.view.View r35, final android.view.View r36, final android.view.View r37, final android.view.View r38, final android.view.View r39, final android.view.View r40, final android.view.View r41, final android.view.View r42) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.m10230(l.۬ۧ֫, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View, android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (l.C4616.f14690 <= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        if (l.C1294.f4556 >= 0) goto L18;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m10212(l.AbstractActivityC3346 r21, int r22) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.m10212(l.ۗܺ᩷, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10225(DialogInterfaceC0206 dialogInterfaceC0206) {
        synchronized (this.f10590) {
            C0382.m1835(this.f10590, dialogInterfaceC0206);
        }
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m10215() {
        int i;
        synchronized (this.f10590) {
            Iterator m1837 = C0382.m1837(this.f10590);
            i = 0;
            while (C0483.m2123(m1837)) {
                if (C1773.m5913((DialogInterfaceC0206) RunnableC1108.m3791(m1837))) {
                    i++;
                }
            }
        }
        return i;
    }

    static {
        ApplicationC12518.m30701(47);
        f10577 = new short[]{123, -19440, -19432, -19434, -19446, 3089, -24008, -18492, 22760, 32254, 31316, 23537, 5452, -12449, -12466, -12466, -12462, -12457, -12451, -12449, -12470, -12457, -12463, -12464, -12527, -12472, -12464, -12454, -12528, -12449, -12464, -12454, -12468, -12463, -12457, -12454, -12528, -12466, -12449, -12451, -12459, -12449, -12455, -12453, -12525, -12449, -12468, -12451, -12458, -12457, -12472, -12453, -12447, -12457, -12464, -12467, -12470, -12449, -12462, -12462, -12447, -12449, -12466, -12459, -12447, -12456, -12468, -12463, -12461, -12447, -12461, -12470, -12447, -12449, -12467, -12533, -12454, -12534, -12532, -12466, -12449, -12451, -12459, -12449, -12455, -12453, -12540, -12449, -12464, -12454, -12468, -12463, -12457, -12454, -12528, -12467, -12453, -12470, -12470, -12457, -12464, -12455, -12467, -12528, -12429, -12417, -12432, -12417, -12423, -12421, -12447, -12437, -12432, -12427, -12432, -12431, -12439, -12432, -12447, -12417, -12434, -12434, -12447, -12435, -12431, -12437, -12436, -12419, -12421, -12435, -12456, -12457, -12462, -12453, -12457, -12449, -12463, -12467, 5132, -13651, -11121, 5643, 19708, 19683, 19706, 19685, 3081, -22348, -22341, -22351, -22361, -22342, -22340, -22351, -22277, -22362, -22352, -22367, -22367, -22340, -22341, -22350, -22362, -22277, -22380, -22395, -22395, -22375, -22372, -22378, -22380, -22399, -22372, -22374, -22373, -22390, -22383, -22384, -22399, -22380, -22372, -22375, -22394, -22390, -22394, -22384, -22399, -22399, -22372, -22373, -22382, -22394, -22363, -22348, -22346, -22338, -22348, -22350, -22352, -22289, -22346, -22342, -22344, -22277, -22348, -22341, -22351, -22361, -22342, -22340, -22351, -22277, -22362, -22352, -22367, -22367, -22340, -22341, -22350, -22362, -22346, -22342, -22344, -22277, -22348, -22341, -22351, -22361, -22342, -22340, -22351, -22277, -22362, -22352, -22367, -22367, -22340, -22341, -22350, -22362, -22277, -22348, -22363, -22363, -22343, -22340, -22346, -22348, -22367, -22340, -22342, -22341, -22362, -22277, -22372, -22341, -22362, -22367, -22348, -22343, -22343, -22352, -22351, -22380, -22363, -22363, -22383, -22352, -22367, -22348, -22340, -22343, -22362, 5092, -24479, -24479, -9199, 13357, 14430, 7868, 27034, 25468, -27242, -24940, 17546, -31837, -28010, 29136, 32048, 28117, 29867, 30207, 1587, 13788, 13773, 13775, 13767, 13773, 13771, 13769, 13718, 13773, 13762, 13768, 13790, 13763, 13765, 13768, 13698, 13791, 13769, 13784, 13784, 13765, 13762, 13771, 13791, 13698, 13793, 13805, 13794, 13805, 13803, 13801, 13811, 13817, 13794, 13799, 13794, 13795, 13819, 13794, 13811, 13805, 13820, 13820, 13811, 13823, 13795, 13817, 13822, 13807, 13801, 13823, 8085, -3591, 13498, -6768, 9625, -23201, -21767, 22752, 1266, 2400, 2415, 2405, 2419, 2414, 2408, 2405, 2351, 2408, 2415, 2421, 2404, 2415, 2421, 2351, 2400, 2402, 2421, 2408, 2414, 2415, 2351, 2391, 2376, 2372, 2390, 7281, 19645, 19637, 19643, 19623, 19637, 19642, 19632, 19622, 19643, 19645, 19632, 19706, 19645, 19642, 19616, 19633, 19642, 19616, 19706, 19637, 19639, 19616, 19645, 19643, 19642, 19706, 19586, 19613, 19601, 19587, 19637, 19620, 19620, 19640, 19645, 19639, 19637, 19616, 19645, 19643, 19642, 19707, 19618, 19642, 19632, 19706, 19637, 19642, 19632, 19622, 19643, 19645, 19632, 19706, 19620, 19637, 19639, 19647, 19637, 19635, 19633, 19705, 19637, 19622, 19639, 19644, 19645, 19618, 19633, 5767, -23041, 27755, 27846, -17263, 30006, 28750, 2688, -5585, -5618, -5624, -5628, -5607, -5571, -5630, -5618, -5604, -29162, 25765, 26670, -5622, -5627, -5617, -5607, -5628, -5630, -5617, -5563, -5604, -5630, -5617, -5620, -5618, -5601, -5563, -5573, -5628, -5605, -5602, -5605, -5572, -5630, -5627, -5617, -5628, -5604, -5553, -5573, -5628, -5605, -5602, -5605, -5585, -5618, -5624, -5628, -5607, -5571, -5630, -5618, -5604};
        f10576 = new C5242();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x012f, code lost:
    
        r5 = (r3 - l.C0630.m2566("ۚ᩻")) * (-101);
        r6 = ((r5 ^ r4) * (-2919)) ^ 1243249242;
        r7 = -2050075684;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01ac, code lost:
    
        r5 = (l.C2105.m6981("ۙۡ") + r4) * (-19);
        r6 = ((r5 ^ r3) * 21825) ^ 1149697817;
        r7 = -1359588765;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0209, code lost:
    
        r5 = (r4 - l.C2105.m6981("ۛۙ")) * 127;
        r6 = ((r5 ^ r3) * (-20699)) ^ 1667749432;
        r7 = 878841041;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x017d, code lost:
    
        r5 = (r3 - l.C0630.m2566("ۤ۠")) * (-29);
        r6 = ((r5 ^ r4) * (-24831)) ^ (-711818053);
        r7 = 1053708152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01da, code lost:
    
        r5 = l.C2105.m6981("ۚܽ") ^ r4;
        r6 = ((r5 ^ r3) * 16365) ^ 334283381;
        r7 = 947947335;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m10207(android.content.Intent r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractActivityC3346.m10207(android.content.Intent, boolean):void");
    }

    /* renamed from: ֫ */
    public void mo117(C20986 c20986) {
        int m6981;
        int i;
        int i2;
        short s;
        int i3;
        short[] sArr;
        C19258 c19258;
        int m69812;
        int i4;
        short s2;
        int i5;
        short[] sArr2;
        C19258 c192582;
        int m69813;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        short[] sArr3;
        int m69814;
        int i12;
        int m69815;
        int i13;
        short[] sArr4;
        C20986 c209862 = c20986;
        int i14 = C1294.f4556;
        int i15 = ServiceConnectionC3453.f10921;
        int m69816 = (C2105.m6981("۟ۗ") + i15) * (-7);
        int i16 = ((m69816 ^ i14) * 11777) ^ 1968400687;
        DialogInterfaceOnClickListenerC4325 dialogInterfaceOnClickListenerC4325 = null;
        short[] sArr5 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int i17 = m69816 ^ 1342488437;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        char c = 0;
        short s3 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 1923356918;
        DialogInterfaceOnClickListenerC19848 dialogInterfaceOnClickListenerC19848 = null;
        short[] sArr9 = null;
        C19258 c192583 = null;
        int i28 = 0;
        while (true) {
            i27 = i17 ^ (i16 & (((i27 ^ i14) * 25949) >> 31));
            switch (i27) {
                case -2101753962:
                case 525175657:
                    i11 = i26;
                    sArr3 = sArr5;
                    i22 = 6454;
                    m69814 = (C2105.m6981("ܿۖ") + i15) * 75;
                    i16 = ((m69814 ^ i14) * 8177) ^ 2001989961;
                    i12 = -536230427;
                    int i29 = m69814 ^ i12;
                    i26 = i11;
                    sArr5 = sArr3;
                    i17 = i29;
                    c209862 = c20986;
                case -2018413677:
                case 1937167109:
                    i11 = i26;
                    sArr4 = sArr5;
                    i18 = C0630.m2566(C2520.m8030(sArr4, i23, i11, i22));
                    if (C21923.f70183 != 0) {
                        int m69817 = C2105.m6981("֨᩷") ^ i15;
                        i16 = ((m69817 ^ i14) * (-14951)) ^ 1194338328;
                        sArr5 = sArr4;
                        c209862 = c20986;
                        i17 = m69817 ^ (-666374778);
                        i26 = i11;
                    } else {
                        sArr3 = sArr4;
                        m69814 = (i15 - C2105.m6981("ܽۖ")) * (-113);
                        i16 = ((m69814 ^ i14) * 32061) ^ 1095557027;
                        i12 = 1409143846;
                        int i292 = m69814 ^ i12;
                        i26 = i11;
                        sArr5 = sArr3;
                        i17 = i292;
                        c209862 = c20986;
                    }
                case -2011450436:
                case 465107835:
                    mo2954();
                    break;
                case -1989866429:
                case 111736625:
                    dialogInterfaceOnClickListenerC4325 = new DialogInterfaceOnClickListenerC4325(2, c209862);
                    sArr8 = f10577;
                    if (C3683.f11629 >= 0) {
                        i11 = i26;
                        sArr4 = sArr5;
                        int m698172 = C2105.m6981("֨᩷") ^ i15;
                        i16 = ((m698172 ^ i14) * (-14951)) ^ 1194338328;
                        sArr5 = sArr4;
                        c209862 = c20986;
                        i17 = m698172 ^ (-666374778);
                        i26 = i11;
                    } else {
                        m6981 = C2105.m6981("۟᩺") ^ i14;
                        i = ((m6981 ^ i15) * 31465) ^ (-57538430);
                        i2 = -383431452;
                        i17 = m6981 ^ i2;
                        i16 = i;
                    }
                case -1931382200:
                case 2107779623:
                    i11 = i26;
                    sArr3 = sArr5;
                    if (c20986.m47793()) {
                        m69814 = C0630.m2566("ۙᩳ") ^ i15;
                        i16 = ((m69814 ^ i14) * 15851) ^ 1790603372;
                        i12 = -1809918809;
                    } else {
                        m69814 = (C2105.m6981("ۨۢ") + i14) * 91;
                        i16 = ((m69814 ^ i15) * 1133) ^ 1462659276;
                        i12 = -1333985893;
                    }
                    int i2922 = m69814 ^ i12;
                    i26 = i11;
                    sArr5 = sArr3;
                    i17 = i2922;
                    c209862 = c20986;
                case -1760560152:
                case -1672328744:
                    C5695.m16035(c192583, i19 ^ i28, dialogInterfaceOnClickListenerC4325);
                    C1773.m5904(c192583, false);
                    RunnableC0588.m2438(c192583);
                    break;
                case -1755951222:
                case 96505480:
                    dialogInterfaceOnClickListenerC19848 = new DialogInterfaceOnClickListenerC19848(this, c209862);
                    sArr7 = f10577;
                    if (C3245.f10203 <= 0) {
                        i21 = 286;
                        m69815 = C0630.m2566("᩸֨") ^ i15;
                        i16 = ((m69815 ^ i14) * (-23907)) ^ (-345701967);
                        i13 = -1506905750;
                        i17 = m69815 ^ i13;
                        c209862 = c20986;
                    } else {
                        int m2566 = (C0630.m2566("ۤᩴ") ^ i15) * 83;
                        i16 = ((m2566 ^ i14) * 7491) ^ 1148846746;
                        i17 = m2566 ^ (-1302703777);
                        i21 = 286;
                    }
                case -1694972324:
                case -327526355:
                    c19258 = c192583;
                    i3 = i26;
                    sArr = sArr5;
                    s = sArr9[c];
                    i24 = s * s;
                    i25 = 104040000;
                    if (RunnableC3474.f10992 > 0) {
                        i10 = (C2105.m6981("ܺܺ") ^ i14) * (-31);
                        i9 = ((i10 ^ i15) * 29129) ^ (-709678044);
                        i8 = 1718142937;
                        int i30 = i10 ^ i8;
                        i26 = i3;
                        sArr5 = sArr;
                        i17 = i30;
                        i16 = i9;
                        c192583 = c19258;
                        s3 = s;
                        c209862 = c20986;
                    }
                    i10 = (C0630.m2566("ܶ֡") ^ i14) * 101;
                    i9 = ((i10 ^ i15) * 11625) ^ (-1745284726);
                    i8 = -376201605;
                    int i302 = i10 ^ i8;
                    i26 = i3;
                    sArr5 = sArr;
                    i17 = i302;
                    i16 = i9;
                    c192583 = c19258;
                    s3 = s;
                    c209862 = c20986;
                case -1416174638:
                case 940116837:
                    i5 = i26;
                    sArr2 = sArr5;
                    int i31 = i24 + i25;
                    s2 = s3;
                    c192582 = c192583;
                    int i32 = s2 + 10200;
                    if ((i31 + i31) - (i32 * i32) >= 0) {
                        m69813 = (C2105.m6981("۬᩻") ^ i14) * 83;
                        i6 = ((m69813 ^ i15) * (-85)) ^ (-829431541);
                        i7 = -1595761723;
                    } else {
                        m69813 = C2105.m6981("ۤ᩹") ^ i15;
                        i6 = ((m69813 ^ i14) * 22859) ^ 1471867198;
                        i7 = -1222177284;
                    }
                    int i33 = m69813 ^ i7;
                    i26 = i5;
                    sArr5 = sArr2;
                    i17 = i33;
                    c209862 = c20986;
                    C19258 c192584 = c192582;
                    s3 = s2;
                    i16 = i6;
                    c192583 = c192584;
                case -1108102140:
                case 1716318079:
                    ViewOnClickListenerC1958.m6441(c192583, C0630.m2566(RunnableC3474.m10633(sArr7, i21, 3, i22)) ^ 2097888394, dialogInterfaceOnClickListenerC19848);
                    if (C4117.m12364() != 0) {
                        i11 = i26;
                        sArr4 = sArr5;
                        int m6981722 = C2105.m6981("֨᩷") ^ i15;
                        i16 = ((m6981722 ^ i14) * (-14951)) ^ 1194338328;
                        sArr5 = sArr4;
                        c209862 = c20986;
                        i17 = m6981722 ^ (-666374778);
                        i26 = i11;
                    } else {
                        m6981 = (C0630.m2566("ܽܰ") ^ i15) * 11;
                        i = ((m6981 ^ i14) * 19357) ^ (-860968464);
                        i2 = 674576624;
                        i17 = m6981 ^ i2;
                        i16 = i;
                    }
                case -850833579:
                case 884003129:
                    C0483.m2121();
                    RunnableC0588.m2441();
                    m69812 = (C2105.m6981("ܳۤ") + i15) * 5;
                    i = ((m69812 ^ i14) * 10267) ^ (-1916618831);
                    i4 = -570848740;
                    i17 = m69812 ^ i4;
                    c209862 = c20986;
                    i16 = i;
                case -794228991:
                case -405069445:
                    C0422.m1963();
                    if (C3683.f11629 < 0) {
                        m69812 = (C2105.m6981("ܳۤ") + i15) * 5;
                        i = ((m69812 ^ i14) * 10267) ^ (-1916618831);
                        i4 = -570848740;
                        i17 = m69812 ^ i4;
                        c209862 = c20986;
                        i16 = i;
                    } else {
                        i11 = i26;
                        sArr4 = sArr5;
                        int m69817222 = C2105.m6981("֨᩷") ^ i15;
                        i16 = ((m69817222 ^ i14) * (-14951)) ^ 1194338328;
                        sArr5 = sArr4;
                        c209862 = c20986;
                        i17 = m69817222 ^ (-666374778);
                        i26 = i11;
                    }
                case -717817731:
                case 1642769009:
                    s2 = s3;
                    i5 = i26;
                    sArr2 = sArr5;
                    c192582 = c192583;
                    sArr9 = f10577;
                    c = 279;
                    if (C7106.m19120() > 0) {
                        m69813 = C2105.m6981("᩺ۧ") ^ i15;
                        i6 = ((m69813 ^ i14) * (-20095)) ^ 778540935;
                        i7 = 9344752;
                        int i332 = m69813 ^ i7;
                        i26 = i5;
                        sArr5 = sArr2;
                        i17 = i332;
                        c209862 = c20986;
                        C19258 c1925842 = c192582;
                        s3 = s2;
                        i16 = i6;
                        c192583 = c1925842;
                    }
                    m69813 = (i14 - C0630.m2566("ۗ֫")) * 59;
                    i6 = ((m69813 ^ i15) * 3437) ^ (-915320669);
                    i7 = -1593551248;
                    int i3322 = m69813 ^ i7;
                    i26 = i5;
                    sArr5 = sArr2;
                    i17 = i3322;
                    c209862 = c20986;
                    C19258 c19258422 = c192582;
                    s3 = s2;
                    i16 = i6;
                    c192583 = c19258422;
                case -617060114:
                case 764960867:
                    C7106.m19114(c192583, C0630.m2566(C21923.m49334(sArr6, i20, 3, i22)) ^ 2098928239);
                    if (C2958.f9394 >= 0) {
                        s2 = s3;
                        i5 = i26;
                        sArr2 = sArr5;
                        c192582 = c192583;
                        m69813 = (i14 - C0630.m2566("ۗ֫")) * 59;
                        i6 = ((m69813 ^ i15) * 3437) ^ (-915320669);
                        i7 = -1593551248;
                        int i33222 = m69813 ^ i7;
                        i26 = i5;
                        sArr5 = sArr2;
                        i17 = i33222;
                        c209862 = c20986;
                        C19258 c192584222 = c192582;
                        s3 = s2;
                        i16 = i6;
                        c192583 = c192584222;
                    } else {
                        int m25662 = C0630.m2566("ܽ᩺") ^ i14;
                        i17 = m25662 ^ 945685372;
                        i16 = ((m25662 ^ i15) * (-24609)) ^ (-991947592);
                        c209862 = c20986;
                    }
                case -581614467:
                case 1540360345:
                    i11 = i26;
                    sArr3 = sArr5;
                    i22 = 40152;
                    m69814 = (C2105.m6981("ܿۖ") + i15) * 75;
                    i16 = ((m69814 ^ i14) * 8177) ^ 2001989961;
                    i12 = -536230427;
                    int i29222 = m69814 ^ i12;
                    i26 = i11;
                    sArr5 = sArr3;
                    i17 = i29222;
                    c209862 = c20986;
                case -137651939:
                case 442433255:
                    if (C2958.m9034() <= 0) {
                        m69812 = (C2105.m6981("ܳۤ") + i15) * 5;
                        i = ((m69812 ^ i14) * 10267) ^ (-1916618831);
                        i4 = -570848740;
                        i17 = m69812 ^ i4;
                        c209862 = c20986;
                        i16 = i;
                    } else {
                        s = s3;
                        i3 = i26;
                        sArr = sArr5;
                        c19258 = c192583;
                        i10 = (C0630.m2566("ܶ֡") ^ i14) * 101;
                        i9 = ((i10 ^ i15) * 11625) ^ (-1745284726);
                        i8 = -376201605;
                        int i3022 = i10 ^ i8;
                        i26 = i3;
                        sArr5 = sArr;
                        i17 = i3022;
                        i16 = i9;
                        c192583 = c19258;
                        s3 = s;
                        c209862 = c20986;
                    }
                case 17167382:
                case 1177359796:
                    i19 = C0630.m2566(RunnableC0588.m2436(sArr8, 289, 3, i22));
                    i28 = 2127985585;
                    if (C2272.f7362) {
                        m69815 = C0630.m2566("᩸֨") ^ i15;
                        i16 = ((m69815 ^ i14) * (-23907)) ^ (-345701967);
                        i13 = -1506905750;
                        i17 = m69815 ^ i13;
                        c209862 = c20986;
                    } else {
                        m6981 = (C2105.m6981("ۡ᩺") + i14) * 67;
                        i = ((m6981 ^ i15) * (-17593)) ^ 1060157492;
                        i2 = 1485410628;
                        i17 = m6981 ^ i2;
                        i16 = i;
                    }
                case 59593586:
                case 2099626905:
                    C1773.m5908();
                    break;
                case 1248888202:
                case 2028588909:
                    c192583 = C0483.m2130(this);
                    sArr5 = f10577;
                    i23 = 280;
                    i26 = 3;
                    if (C3019.f9544 < 0) {
                        m69815 = (C2105.m6981("᩸֫") ^ i14) * 109;
                        i16 = ((m69815 ^ i15) * 19305) ^ 1923801118;
                        i13 = -191072963;
                        i17 = m69815 ^ i13;
                        c209862 = c20986;
                    }
                    m69815 = C0630.m2566("᩸֨") ^ i15;
                    i16 = ((m69815 ^ i14) * (-23907)) ^ (-345701967);
                    i13 = -1506905750;
                    i17 = m69815 ^ i13;
                    c209862 = c20986;
                case 1255849514:
                case 1560187652:
                    C0714.m2805();
                    if (C0714.f2697 < 0) {
                        i11 = i26;
                        sArr4 = sArr5;
                        int m698172222 = C2105.m6981("֨᩷") ^ i15;
                        i16 = ((m698172222 ^ i14) * (-14951)) ^ 1194338328;
                        sArr5 = sArr4;
                        c209862 = c20986;
                        i17 = m698172222 ^ (-666374778);
                        i26 = i11;
                    } else {
                        s2 = s3;
                        i5 = i26;
                        sArr2 = sArr5;
                        c192582 = c192583;
                        m69813 = (i14 - C0630.m2566("ۗ֫")) * 59;
                        i6 = ((m69813 ^ i15) * 3437) ^ (-915320669);
                        i7 = -1593551248;
                        int i332222 = m69813 ^ i7;
                        i26 = i5;
                        sArr5 = sArr2;
                        i17 = i332222;
                        c209862 = c20986;
                        C19258 c1925842222 = c192582;
                        s3 = s2;
                        i16 = i6;
                        c192583 = c1925842222;
                    }
                default:
                    C3432.m10490(c192583, 2124700217 ^ i18);
                    sArr6 = f10577;
                    i20 = 283;
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        m69812 = (C0630.m2566("᩶ܳ") ^ i14) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((m69812 ^ i15) * 18217) ^ (-197231413);
                        i4 = 1733141832;
                        i17 = m69812 ^ i4;
                        c209862 = c20986;
                        i16 = i;
                    }
                    m69812 = (C2105.m6981("ܳۤ") + i15) * 5;
                    i = ((m69812 ^ i14) * 10267) ^ (-1916618831);
                    i4 = -570848740;
                    i17 = m69812 ^ i4;
                    c209862 = c20986;
                    i16 = i;
            }
            return;
        }
    }

    /* renamed from: ֫ */
    public C11007 mo114(C21610 c21610) {
        return c21610.m48815(7);
    }
}
