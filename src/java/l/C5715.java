package l;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.ViewTreeObserver;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* compiled from: G6K1 */
/* renamed from: l.ۛ֡᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5715 implements InterfaceC8085 {

    /* renamed from: ۘ֨ۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f17617 = {9591, 28755, 28740, 28762, 1365, 22182, 22193, 22191, 12642, -11330, -13450, -10963, -10745, -10324, 3284, -12312, 8363, -16212, 12392, 1931, 571, -5094, -5107, -5101, -5090, -5102, -5104, -5037, -5092, -5101, -5095, -5105, -5102, -5100, -5095, -5037, -5109, -5096, -5101, -5095, -5100, -5101, -5094, -5092, -5101, -5095, -5105, -5102, -5100, -5095, -5037, -5100, -5101, -5111, -5096, -5101, -5111, -5037, -5090, -5092, -5111, -5096, -5094, -5102, -5105, -5116, -5037, -5071, -5060, -5080, -5069, -5058, -5067, -5064, -5073, -5094, -5107, -5101, -5092, -5101, -5095, -5105, -5102, -5100, -5095, -5037, -5100, -5101, -5111, -5096, -5101, -5111, -5037, -5090, -5092, -5111, -5096, -5094, -5102, -5105, -5116, -5037, -5068, -5069, -5061, -5070, 3497, -2130, -2143, -2133, -2115, -2144, -2138, -2133, -2079, -2138, -2143, -2117, -2134, -2143, -2117, -2079, -2130, -2132, -2117, -2138, -2144, -2143, -2079, -2174, -2162, -2170, -2175, -2132, -2144, -2142, -2079, -2130, -2143, -2133, -2115, -2144, -2138, -2133, -2079, -2119, -2134, -2143, -2133, -2138, -2143, -2136, 5510, -27040, -27012, -27012, -27016, -27013, -27086, -27097, -27097, -27035, -27012, -27098, -27029, -27029};

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Object f17618 = new Object();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f17619;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f17620;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f17621;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final RunnableC19827 f17622;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnWindowFocusChangeListenerC4304 f17623;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f17624;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Main f17625;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f17626;

    @Override // l.InterfaceC8085
    /* renamed from: ֫ */
    public final /* synthetic */ void mo6024(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* renamed from: ܳ */
    public final /* synthetic */ void mo6026(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* renamed from: ᩳ */
    public final /* synthetic */ void mo6029(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* renamed from: ܿ */
    public final void mo6028(InterfaceC23586 interfaceC23586) {
        boolean z = false;
        RunnableC19827 runnableC19827 = null;
        View view = null;
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        int i = -1272230385;
        int i2 = C1294.f4556;
        int i3 = C2167.f7158;
        int m2566 = C0630.m2566("᩺֫") ^ i3;
        int i4 = ((m2566 ^ i2) * 11959) ^ (-762948050);
        int i5 = 2100701069;
        while (true) {
            i = ((((i ^ i2) * 2151) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1791208926:
                case 970426418:
                    if (C0714.f2697 >= 0) {
                        m2566 = C0630.m2566("ۧܰ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12091)) ^ (-1229600705);
                        i5 = 1798268636;
                    } else {
                        m2566 = (C2105.m6981("֫ۡ") + i2) * 73;
                        i4 = ((m2566 ^ i3) * (-10165)) ^ (-306265091);
                        i5 = 172191343;
                    }
                case -1727056150:
                case 209987016:
                    break;
                case -1572419080:
                case 1144738995:
                    C2958.m9023(interfaceC23586).mo19834(this);
                    dialogInterfaceC0206 = this.f17619;
                    if (dialogInterfaceC0206 != null) {
                        m2566 = (C2105.m6981("᩺ۜ") + i2) * (-89);
                        i4 = ((m2566 ^ i3) * 6487) ^ (-1443172147);
                        i5 = 1640272645;
                    } else {
                        m2566 = (i3 - C0630.m2566("۠ۨ")) * (-75);
                        i4 = ((m2566 ^ i2) * (-8753)) ^ (-1791095727);
                        i5 = -890613284;
                    }
                case -1536978470:
                case 611608400:
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = (C2105.m6981("ۙۛ") ^ i2) * (-85);
                        i4 = ((m2566 ^ i3) * 20233) ^ (-849864119);
                        i5 = 1210218598;
                    } else {
                        m2566 = C0630.m2566("ۜۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * 23099) ^ 1489429099;
                        i5 = 1936326643;
                    }
                case -1441680283:
                case 840106593:
                    if (C0714.f2697 >= 0) {
                        m2566 = (C2105.m6981("ܿ֡") ^ i2) * 81;
                        i4 = ((m2566 ^ i3) * 13119) ^ (-141111995);
                        i5 = -1846852850;
                    } else {
                        m2566 = (i3 - C0630.m2566("ܽ֫")) * 67;
                        i4 = ((m2566 ^ i2) * 4567) ^ 1889028783;
                        i5 = -1211231577;
                    }
                case -1438668632:
                case 1374035475:
                    if (C0050.f910 >= 0) {
                        m2566 = C0630.m2566("۟ܳ") ^ i2;
                        i4 = ((m2566 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    } else {
                        m2566 = (i2 - C0630.m2566("᩶ۖ")) * (-127);
                        i4 = ((m2566 ^ i3) * 24135) ^ (-1356944191);
                        i5 = -179015011;
                    }
                case -1300678701:
                case 1333649752:
                    C2272.m7503();
                    C4075.m12263();
                    break;
                case -1183177665:
                case -1042653982:
                    if (C1005.f3721) {
                        m2566 = (i2 - C2105.m6981("᩸ۧ")) * 31;
                        i4 = ((m2566 ^ i3) * 18569) ^ 1509025657;
                        i5 = 443188278;
                    } else {
                        m2566 = C0630.m2566("۟ܳ") ^ i2;
                        i4 = ((m2566 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    }
                case -1048533835:
                case 173979521:
                    if (C2520.f8000 >= 0) {
                        m2566 = (i3 - C0630.m2566("ܽ֫")) * 67;
                        i4 = ((m2566 ^ i2) * 4567) ^ 1889028783;
                        i5 = -1211231577;
                    } else {
                        m2566 = C0630.m2566("۟᩸") ^ i3;
                        i4 = ((m2566 ^ i2) * (-26433)) ^ 1726086044;
                        i5 = 1282027901;
                    }
                case -653031658:
                case 344682284:
                    if (C0483.f2088 >= 0) {
                        m2566 = C0630.m2566("۟ܳ") ^ i2;
                        i4 = ((m2566 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    } else {
                        m2566 = C2105.m6981("᩶ۗ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29837)) ^ 1642101232;
                        i5 = -1521141109;
                    }
                case -619010542:
                case -234365771:
                    view = this.f17624;
                    view.removeCallbacks(runnableC19827);
                    if (C3245.f10203 <= 0) {
                        m2566 = C0630.m2566("۟ܳ") ^ i2;
                        i4 = ((m2566 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    } else {
                        m2566 = C0630.m2566("֡ᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * 5605) ^ 130745467;
                        i5 = -486221031;
                    }
                case -470586010:
                case 1130443870:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = C0630.m2566("ۧܰ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12091)) ^ (-1229600705);
                        i5 = 1798268636;
                    } else {
                        m2566 = C0630.m2566("᩷֫") ^ i3;
                        i4 = ((m2566 ^ i2) * (-5579)) ^ (-73488400);
                        i5 = 412084944;
                    }
                case -417732448:
                case 1275897280:
                    if (view.getViewTreeObserver().isAlive()) {
                        m2566 = C2105.m6981("ۖۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * 1815) ^ 1244618187;
                        i5 = -1940529516;
                    } else {
                        m2566 = C2105.m6981("ܿۡ") ^ i2;
                        i4 = ((m2566 ^ i3) * 26353) ^ (-571993900);
                        i5 = -348977894;
                    }
                case -482520:
                case 1159494846:
                    C3663.m11167(dialogInterfaceC0206);
                    m2566 = (i3 - C0630.m2566("۠ۨ")) * (-75);
                    i4 = ((m2566 ^ i2) * (-8753)) ^ (-1791095727);
                    i5 = -890613284;
                case 223569785:
                case 734222578:
                    z = true;
                    if (C1504.m5179()) {
                        m2566 = (C2105.m6981("۬֨") + i3) * (-19);
                        i4 = ((m2566 ^ i2) * 8723) ^ 1225629465;
                        i5 = -8189136;
                    } else {
                        m2566 = C0630.m2566("۟ܳ") ^ i2;
                        i4 = ((m2566 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    }
                case 553667466:
                case 1815042640:
                    this.f17620 = z;
                    runnableC19827 = this.f17622;
                    if (C2272.m7503()) {
                        m2566 = (C2105.m6981("ۙۛ") ^ i2) * (-85);
                        i4 = ((m2566 ^ i3) * 20233) ^ (-849864119);
                        i5 = 1210218598;
                    } else {
                        m2566 = C0630.m2566("۫ܶ") ^ i3;
                        i4 = ((m2566 ^ i2) * 1685) ^ 934792505;
                        i5 = 38598559;
                    }
                case 599934540:
                case 2046584751:
                    C2272.m7503();
                    if (C1773.f6144 <= 0) {
                        m2566 = C0630.m2566("ۧܰ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12091)) ^ (-1229600705);
                        i5 = 1798268636;
                    } else {
                        m2566 = (C2105.m6981("ܿ֡") ^ i2) * 81;
                        i4 = ((m2566 ^ i3) * 13119) ^ (-141111995);
                        i5 = -1846852850;
                    }
                case 629630130:
                case 1426294902:
                    view.getViewTreeObserver().removeOnWindowFocusChangeListener(this.f17623);
                    m2566 = C2105.m6981("ܿۡ") ^ i2;
                    i4 = ((m2566 ^ i3) * 26353) ^ (-571993900);
                    i5 = -348977894;
                case 1116981349:
                case 1453615855:
                    C1005.m3501();
                    if (RunnableC0588.f2309 < 0) {
                        m2566 = (C2105.m6981("ܿ֡") ^ i2) * 81;
                        i4 = ((m2566 ^ i3) * 13119) ^ (-141111995);
                        i5 = -1846852850;
                    } else {
                        m2566 = C0630.m2566("۟ܳ") ^ i2;
                        i4 = ((m2566 ^ i3) * 8647) ^ 1699507884;
                        i5 = -1932907437;
                    }
                default:
                    ViewOnClickListenerC1958.m6429();
                    m2566 = C0630.m2566("ۧܰ") ^ i3;
                    i4 = ((m2566 ^ i2) * (-12091)) ^ (-1229600705);
                    i5 = 1798268636;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (l.C1773.f6144 > 0) goto L11;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m16144(l.C5715 r17) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5715.m16144(l.ۛ֡᩷):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16141(C5715 c5715, boolean z) {
        int i = 233378655;
        int i2 = C4075.f12947;
        int i3 = RunnableC3474.f10992;
        int m6981 = C2105.m6981("֫ۖ") ^ i2;
        int i4 = ((m6981 ^ i3) * (-4509)) ^ 962336508;
        int i5 = -86089535;
        while (true) {
            i = ((((i ^ i3) * 8369) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2106468556:
                case -461046994:
                    if (z) {
                        m6981 = C0630.m2566("ܶܰ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-4013)) ^ (-130328665);
                        i5 = 1161803065;
                    } else {
                        m6981 = (C2105.m6981("ۗܶ") + i3) * 119;
                        i4 = ((m6981 ^ i2) * 2213) ^ (-1753964250);
                        i5 = -1587090020;
                    }
                case -2053753631:
                case -849067429:
                    c5715.m16145();
                    m6981 = (C2105.m6981("ۗܶ") + i3) * 119;
                    i4 = ((m6981 ^ i2) * 2213) ^ (-1753964250);
                    i5 = -1587090020;
                case -1950488611:
                case -1165090422:
                    if (C2167.f7158 >= 0) {
                        m6981 = (C2105.m6981("֡᩷") ^ i2) * (-81);
                        i4 = ((m6981 ^ i3) * (-13857)) ^ 908621810;
                        i5 = -1016861485;
                    } else {
                        m6981 = C0630.m2566("᩸ۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-13455)) ^ 490874970;
                        i5 = -879984947;
                    }
                case -1455947729:
                case -1436186609:
                    if (C3537.f11231 >= 0) {
                        m6981 = C0630.m2566("᩺֫") ^ i3;
                        i4 = ((m6981 ^ i2) * 25237) ^ 523599487;
                        i5 = 1433549883;
                    } else {
                        m6981 = (C0630.m2566("ۢܰ") ^ i2) * 17;
                        i4 = ((m6981 ^ i3) * 25897) ^ (-492189819);
                        i5 = 1651463347;
                    }
                case -1434198580:
                case 882625511:
                    C7106.m19120();
                    if (C0483.m2121()) {
                        m6981 = C2105.m6981("ۤ᩹") ^ i3;
                        i4 = ((m6981 ^ i2) * (-3891)) ^ (-1820689869);
                        i5 = -1852943581;
                    } else {
                        m6981 = C2105.m6981("ۤܰ") ^ i2;
                        i4 = ((m6981 ^ i3) * 15551) ^ 1841130822;
                        i5 = -384489421;
                    }
                case -1378921132:
                case 1921370002:
                    if (C0964.f3626 != 0) {
                        m6981 = C0630.m2566("᩺֫") ^ i3;
                        i4 = ((m6981 ^ i2) * 25237) ^ 523599487;
                        i5 = 1433549883;
                    } else {
                        m6981 = C2105.m6981("᩷ۗ") ^ i3;
                        i4 = ((m6981 ^ i2) * 13323) ^ (-1642854909);
                        i5 = -824782497;
                    }
                case -1356631251:
                case 1400732010:
                    if (C0422.f1886 <= 0) {
                        m6981 = (C2105.m6981("֡᩷") ^ i2) * (-81);
                        i4 = ((m6981 ^ i3) * (-13857)) ^ 908621810;
                        i5 = -1016861485;
                    } else {
                        m6981 = (C0630.m2566("۠ᩳ") ^ i2) * 53;
                        i4 = ((m6981 ^ i3) * 9481) ^ (-1559259296);
                        i5 = -544252247;
                    }
                case -1354815566:
                case 1351455478:
                    if (C2272.f7362) {
                        m6981 = C2105.m6981("᩺᩸") ^ i2;
                        i4 = ((m6981 ^ i3) * 297) ^ 151758345;
                        i5 = 1107043907;
                    } else {
                        m6981 = C2105.m6981("۬ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-27457)) ^ (-1226184070);
                        i5 = 1209526669;
                    }
                case -911968091:
                case -528270161:
                    C2126.m7040();
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = C2105.m6981("ۤ᩹") ^ i3;
                        i4 = ((m6981 ^ i2) * (-3891)) ^ (-1820689869);
                        i5 = -1852943581;
                    } else {
                        m6981 = C0630.m2566("᩺֫") ^ i3;
                        i4 = ((m6981 ^ i2) * 25237) ^ 523599487;
                        i5 = 1433549883;
                    }
                case -607555994:
                case 1632560423:
                    C2167.m7155();
                    m6981 = C2105.m6981("ۤ᩹") ^ i3;
                    i4 = ((m6981 ^ i2) * (-3891)) ^ (-1820689869);
                    i5 = -1852943581;
                case -419714162:
                case 1389161694:
                    if (C22628.f73083 <= 0) {
                        m6981 = C2105.m6981("ۤܰ") ^ i2;
                        i4 = ((m6981 ^ i3) * 15551) ^ 1841130822;
                        i5 = -384489421;
                    } else {
                        m6981 = C0630.m2566("ۗᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * 26305) ^ (-529192148);
                        i5 = 1579058955;
                    }
                case -261853541:
                case 1929681992:
                    C2958.m9034();
                    C1773.m5908();
                    break;
                case 325969341:
                case 375068753:
                    if (C2126.f7087) {
                        m6981 = C0630.m2566("᩺֫") ^ i3;
                        i4 = ((m6981 ^ i2) * 25237) ^ 523599487;
                        i5 = 1433549883;
                    } else {
                        m6981 = C2105.m6981("ܳ᩷") ^ i3;
                        i4 = ((m6981 ^ i2) * 23371) ^ (-614459285);
                        i5 = 858183895;
                    }
                case 386164735:
                case 1072997595:
                    if (C0050.m940() <= 0) {
                        m6981 = (C2105.m6981("֡᩷") ^ i2) * (-81);
                        i4 = ((m6981 ^ i3) * (-13857)) ^ 908621810;
                        i5 = -1016861485;
                    } else {
                        m6981 = (C0630.m2566("᩸֫") + i2) * (-87);
                        i4 = ((m6981 ^ i3) * (-9323)) ^ (-369906735);
                        i5 = 494537161;
                    }
                case 429106337:
                case 1726768914:
                    if (C11340.f33930 < 0) {
                        m6981 = C2105.m6981("ۤܰ") ^ i2;
                        i4 = ((m6981 ^ i3) * 15551) ^ 1841130822;
                        i5 = -384489421;
                    } else {
                        m6981 = C2105.m6981("᩺᩸") ^ i2;
                        i4 = ((m6981 ^ i3) * 297) ^ 151758345;
                        i5 = 1107043907;
                    }
                case 494355411:
                case 1819801093:
                    if (C1916.f6442) {
                        m6981 = C2105.m6981("ܰۡ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-27125)) ^ 1424775467;
                        i5 = 848777590;
                    } else {
                        m6981 = C2105.m6981("ۤܰ") ^ i2;
                        i4 = ((m6981 ^ i3) * 15551) ^ 1841130822;
                        i5 = -384489421;
                    }
                case 636315688:
                case 1972027538:
                    break;
                default:
                    if (C2272.m7503()) {
                        m6981 = (C2105.m6981("֡᩷") ^ i2) * (-81);
                        i4 = ((m6981 ^ i3) * (-13857)) ^ 908621810;
                        i5 = -1016861485;
                    } else {
                        m6981 = (C0630.m2566("᩻ۘ") + i2) * 89;
                        i4 = ((m6981 ^ i3) * (-8959)) ^ 1591797900;
                        i5 = 2123620508;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v32 */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.ViewTreeObserver] */
    /* JADX WARN: Type inference failed for: r1v45, types: [l.᩶֡᩷] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.ViewTreeObserver$OnWindowFocusChangeListener] */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.ۙ֡᩷] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public C5715(Main main) {
        boolean z;
        int m2566;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        int m25662;
        int i3;
        int i4;
        final C5715 c5715 = this;
        View view = null;
        AbstractC7379 abstractC7379 = null;
        final InterfaceC12344 interfaceC12344 = null;
        boolean z4 = false;
        final PackageManager packageManager = null;
        final WeakReference weakReference = null;
        short[] sArr = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1005309266;
        int i8 = C3746.f11829;
        int i9 = C1773.f6144;
        short s = f17617[0];
        int i10 = (s * 2) + 1;
        int i11 = s + 1;
        int i12 = i10 - (i11 * i11) > 0 ? 1974 : 28724;
        int m6981 = C2105.m6981("֫ۗ") ^ i8;
        int i13 = ((m6981 ^ i9) * (-25813)) ^ (-988525604);
        int i14 = m6981 ^ (-615350234);
        ?? r2 = 0;
        boolean z5 = false;
        while (true) {
            i7 = i14 ^ (i13 & (((i7 ^ i9) * 11889) >> 31));
            switch (i7) {
                case -2144782395:
                case 1287123558:
                    z = z4;
                    view = C1916.m6300(main).getDecorView();
                    if (C1916.f6442) {
                        m2566 = C0630.m2566("۟۠") ^ i9;
                        i = ((m2566 ^ i8) * (-24253)) ^ 581166985;
                        i2 = -1922113609;
                        boolean z6 = z;
                        i14 = m2566 ^ i2;
                        i13 = i;
                        z4 = z6;
                    } else {
                        z2 = z5;
                        int m69812 = C2105.m6981("۠۟") ^ i9;
                        z4 = z;
                        z5 = z2;
                        i14 = m69812 ^ 1374369648;
                        i13 = ((m69812 ^ i8) * (-17165)) ^ 1288205239;
                        c5715 = this;
                    }
                case -1767224755:
                case -369060245:
                    c5715.f17626 = z4;
                    return;
                case -1660115775:
                case 1649523580:
                    z = z4;
                    z3 = z5;
                    if (C0483.f2088 >= 0) {
                        int m25663 = C0630.m2566("ۜܳ") ^ i8;
                        z4 = z;
                        z5 = z3;
                        i14 = m25663 ^ 1220631036;
                        i13 = ((m25663 ^ i9) * (-31385)) ^ 1113201747;
                        r2 = 0;
                    } else {
                        r2 = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: l.ۙ֡᩷
                            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                            public final void onWindowFocusChanged(boolean z7) {
                                C5715.m16141(C5715.this, z7);
                            }
                        };
                        c5715.f17623 = r2;
                        z5 = true;
                        if (C4263.m12819() >= 0) {
                            int m25664 = C0630.m2566("᩶ۗ") ^ i9;
                            z4 = z;
                            i14 = m25664 ^ (-1324887266);
                            i13 = ((m25664 ^ i8) * 19555) ^ (-549947688);
                            r2 = r2;
                        } else {
                            int m25665 = C0630.m2566("᩷᩵") ^ i8;
                            z4 = z;
                            i14 = m25665 ^ 1155253716;
                            i13 = ((m25665 ^ i9) * 25895) ^ (-383705830);
                            r2 = r2;
                        }
                    }
                case -1644127280:
                case -587345970:
                    C21923.m49329();
                    if (C3911.m11924() <= 0) {
                        z = z4;
                        z3 = z5;
                        int m256632 = C0630.m2566("ۜܳ") ^ i8;
                        z4 = z;
                        z5 = z3;
                        i14 = m256632 ^ 1220631036;
                        i13 = ((m256632 ^ i9) * (-31385)) ^ 1113201747;
                        r2 = 0;
                    } else {
                        z = z4;
                        int m256642 = C0630.m2566("᩶ۗ") ^ i9;
                        z4 = z;
                        i14 = m256642 ^ (-1324887266);
                        i13 = ((m256642 ^ i8) * 19555) ^ (-549947688);
                        r2 = r2;
                    }
                case -1546426976:
                case -46971521:
                    z = z4;
                    c5715.f17624 = view;
                    view.getViewTreeObserver().addOnWindowFocusChangeListener(r2);
                    if (C3663.m11168() < 0) {
                        m2566 = C0630.m2566("ۤܰ") ^ i9;
                        i = ((m2566 ^ i8) * 28937) ^ (-157424388);
                        i2 = 1829662637;
                        boolean z62 = z;
                        i14 = m2566 ^ i2;
                        i13 = i;
                        z4 = z62;
                    }
                    m2566 = (C2105.m6981("۫᩵") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((m2566 ^ i9) * (-24831)) ^ 330365308;
                    i2 = -1629886662;
                    boolean z622 = z;
                    i14 = m2566 ^ i2;
                    i13 = i;
                    z4 = z622;
                case -1480113777:
                case 2022750319:
                    z = z4;
                    sArr = f17617;
                    i5 = 1;
                    i6 = 3;
                    if (RunnableC0588.f2309 >= 0) {
                        int m2566422 = C0630.m2566("᩶ۗ") ^ i9;
                        z4 = z;
                        i14 = m2566422 ^ (-1324887266);
                        i13 = ((m2566422 ^ i8) * 19555) ^ (-549947688);
                        r2 = r2;
                    } else {
                        m2566 = (C2105.m6981("ۤۢ") ^ i8) * (-95);
                        i = ((m2566 ^ i9) * (-8077)) ^ (-1209210024);
                        i2 = -1962542587;
                        boolean z6222 = z;
                        i14 = m2566 ^ i2;
                        i13 = i;
                        z4 = z6222;
                    }
                case -1455807044:
                case 1135858327:
                    z = z4;
                    abstractC7379 = C4117.m12356(main);
                    if (C1047.f3863 < 0) {
                        m2566 = C2105.m6981("ܳܽ") ^ i8;
                        i = ((m2566 ^ i9) * (-18261)) ^ 625368250;
                        i2 = -1436587614;
                        boolean z62222 = z;
                        i14 = m2566 ^ i2;
                        i13 = i;
                        z4 = z62222;
                    }
                    m2566 = C2105.m6981("ۨ᩵") ^ i8;
                    i = ((m2566 ^ i9) * 12347) ^ (-621374604);
                    i2 = -119987272;
                    boolean z622222 = z;
                    i14 = m2566 ^ i2;
                    i13 = i;
                    z4 = z622222;
                case -1443654131:
                case 1815408226:
                    C0630.m2560(C1802.f6208, new Runnable() { // from class: l.ۗ֡᩷
                        {
                            int i15 = -1140562290;
                            int i16 = C3019.f9544;
                            int i17 = C4616.f14690;
                            int m69813 = C2105.m6981("ۨܰ") ^ i16;
                            int i18 = ((m69813 ^ i17) * 2497) ^ 941329529;
                            int i19 = 2027775712;
                            while (true) {
                                i15 = ((((i15 ^ i17) * 9205) >> 31) & i18) ^ (m69813 ^ i19);
                                switch (i15) {
                                    case -1799749057:
                                    case 635835572:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            m69813 = (C2105.m6981("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((m69813 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            m69813 = C2105.m6981("ܳ֡") ^ i16;
                                            i18 = ((m69813 ^ i17) * 8735) ^ 1769923667;
                                            i19 = -1282632636;
                                        }
                                    case -1798322186:
                                    case 419133921:
                                        if (C4263.f13799 <= 0) {
                                            m69813 = (C2105.m6981("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((m69813 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            m69813 = C2105.m6981("ۛܰ") ^ i17;
                                            i18 = ((m69813 ^ i16) * 26783) ^ (-1432187322);
                                            i19 = 2066799363;
                                        }
                                    case -1787022760:
                                    case -1601756583:
                                        if (C2520.m8026()) {
                                            m69813 = (C2105.m6981("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((m69813 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            m69813 = (C0630.m2566("ۨۧ") + i16) * (-27);
                                            i18 = ((m69813 ^ i17) * (-10017)) ^ (-2130083554);
                                            i19 = -1940845041;
                                        }
                                    case -1703987570:
                                    case -445146:
                                        RunnableC3474.m10630();
                                        if (C3683.f11629 >= 0) {
                                            m69813 = C2105.m6981("֡ܺ") ^ i16;
                                            i18 = ((m69813 ^ i17) * 17621) ^ (-1485101316);
                                            i19 = -1898301824;
                                        } else {
                                            m69813 = C2105.m6981("ܺۤ") ^ i17;
                                            i18 = ((m69813 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        }
                                    case -1641025354:
                                    case -981178082:
                                        C5695.m16023();
                                        if (C2958.f9394 < 0) {
                                            m69813 = C2105.m6981("ܺۤ") ^ i17;
                                            i18 = ((m69813 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        } else {
                                            m69813 = (C0630.m2566("ܺۧ") ^ i16) * 77;
                                            i18 = ((m69813 ^ i17) * 18833) ^ 1456215461;
                                            i19 = -1551347188;
                                        }
                                    case -1413868991:
                                    case 1207770826:
                                        if (C1773.f6144 <= 0) {
                                            m69813 = C2105.m6981("ܺۤ") ^ i17;
                                            i18 = ((m69813 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        } else {
                                            m69813 = C2105.m6981("۬۟") ^ i16;
                                            i18 = ((m69813 ^ i17) * (-621)) ^ (-592829074);
                                            i19 = 2037289845;
                                        }
                                    case -1293850983:
                                    case -637126219:
                                        if (C2126.f7087) {
                                            m69813 = C2105.m6981("ܺۤ") ^ i17;
                                            i18 = ((m69813 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        } else {
                                            m69813 = (C0630.m2566("᩺ۖ") + i17) * 67;
                                            i18 = ((m69813 ^ i16) * 30883) ^ (-478798460);
                                            i19 = -604318926;
                                        }
                                    case -443878456:
                                    case 1669008073:
                                        C2958.m9034();
                                        C0630.m2564();
                                        throw new RuntimeException();
                                    case -35469383:
                                    case 1603021114:
                                        if (C1047.f3863 >= 0) {
                                            m69813 = C2105.m6981("֡ܺ") ^ i16;
                                            i18 = ((m69813 ^ i17) * 17621) ^ (-1485101316);
                                            i19 = -1898301824;
                                        } else {
                                            m69813 = C0630.m2566("ܿۖ") ^ i17;
                                            i18 = ((m69813 ^ i16) * 5255) ^ (-2122016774);
                                            i19 = -1308542072;
                                        }
                                    case -16923816:
                                    case 961890349:
                                        if (C3746.m11369() >= 0) {
                                            m69813 = (C2105.m6981("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((m69813 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            m69813 = C2105.m6981("ۙᩴ") ^ i17;
                                            i18 = ((m69813 ^ i16) * 10461) ^ (-1514208446);
                                            i19 = 827869413;
                                        }
                                    case 326146795:
                                    case 1580071290:
                                        if (C1128.f4106 <= 0) {
                                            m69813 = (C2105.m6981("ᩳ᩹") ^ i16) * 97;
                                            i18 = ((m69813 ^ i17) * (-21589)) ^ 1424667162;
                                            i19 = -819333432;
                                        } else {
                                            m69813 = C2105.m6981("֨ܶ") ^ i16;
                                            i18 = ((m69813 ^ i17) * 4929) ^ 1463607371;
                                            i19 = -722176173;
                                        }
                                    case 431627947:
                                    case 1569447542:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            m69813 = (C0630.m2566("᩺ۖ") + i17) * 67;
                                            i18 = ((m69813 ^ i16) * 30883) ^ (-478798460);
                                            i19 = -604318926;
                                        } else {
                                            m69813 = C2105.m6981("ۨۖ") ^ i16;
                                            i18 = ((m69813 ^ i17) * (-73)) ^ (-1224674511);
                                            i19 = 272863911;
                                        }
                                    case 803140298:
                                    case 1938410400:
                                        RunnableC1937.m6387();
                                        m69813 = C2105.m6981("֡ܺ") ^ i16;
                                        i18 = ((m69813 ^ i17) * 17621) ^ (-1485101316);
                                        i19 = -1898301824;
                                    case 856180907:
                                    case 1374674031:
                                        if (RunnableC0588.m2441() >= 0) {
                                            m69813 = C2105.m6981("ܺۤ") ^ i17;
                                            i18 = ((m69813 ^ i16) * (-25339)) ^ (-118943192);
                                            i19 = 1429402506;
                                        } else {
                                            m69813 = C2105.m6981("ۙۡ") ^ i17;
                                            i18 = ((m69813 ^ i16) * 27723) ^ 1604724611;
                                            i19 = -1929308247;
                                        }
                                    case 1164164175:
                                    case 1670261444:
                                        if (C4117.f13076 <= 0) {
                                            m69813 = (C0630.m2566("᩺ۖ") + i17) * 67;
                                            i18 = ((m69813 ^ i16) * 30883) ^ (-478798460);
                                            i19 = -604318926;
                                        } else {
                                            m69813 = (i17 - C0630.m2566("ۜۛ")) * 27;
                                            i18 = ((m69813 ^ i16) * 4133) ^ 194861299;
                                            i19 = 649142128;
                                        }
                                    default:
                                        return;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC12344 interfaceC123442 = null;
                            PackageManager packageManager2 = null;
                            int i15 = -1599686091;
                            int i16 = C1773.f6144;
                            int i17 = C4616.f14690;
                            int m69813 = C2105.m6981("ۤ᩺") ^ i16;
                            int i18 = ((m69813 ^ i17) * (-5227)) ^ (-340710021);
                            int i19 = 1073703919;
                            while (true) {
                                i15 = ((((i15 ^ i17) * 28115) >> 31) & i18) ^ (m69813 ^ i19);
                                switch (i15) {
                                    case -1791573041:
                                    case -1327506373:
                                        if (C4075.f12947 >= 0) {
                                            m69813 = (C2105.m6981("᩻ܽ") ^ i16) * 91;
                                            i18 = ((m69813 ^ i17) * 26209) ^ (-1361235601);
                                            i19 = 1520448837;
                                        } else {
                                            m69813 = C2105.m6981("۬ܽ") ^ i17;
                                            i18 = ((m69813 ^ i16) * 30161) ^ (-1127704937);
                                            i19 = -496847692;
                                        }
                                    case -1746837543:
                                    case 921810460:
                                        int i20 = 0;
                                        if (C0050.f910 >= 0) {
                                            m69813 = (C0630.m2566("۟֡") + i16) * 87;
                                            i18 = ((m69813 ^ i17) * (-2631)) ^ 2081692676;
                                            i19 = 218072162;
                                        } else {
                                            WeakReference weakReference2 = weakReference;
                                            if (C1420.f5096 > 0) {
                                                C0237.m1492(new RunnableC12770(i20, weakReference2));
                                                break;
                                            }
                                            m69813 = C0630.m2566("ܿۡ") ^ i17;
                                            i18 = ((m69813 ^ i16) * (-3269)) ^ (-1524068131);
                                            i19 = -525647043;
                                        }
                                    case -1569634072:
                                    case 1192923563:
                                        if (RunnableC0588.f2309 >= 0) {
                                            m69813 = (C0630.m2566("ᩴۚ") + i17) * 33;
                                            i18 = ((m69813 ^ i16) * (-6439)) ^ 1236014622;
                                            i19 = -833032995;
                                        } else {
                                            m69813 = (i16 - C2105.m6981("ۜᩴ")) * 87;
                                            i18 = ((m69813 ^ i17) * (-19619)) ^ 1723125342;
                                            i19 = 1389679945;
                                        }
                                    case -1508514447:
                                    case -920242674:
                                        if (C2126.m7040()) {
                                            m69813 = C0630.m2566("ܿۡ") ^ i17;
                                            i18 = ((m69813 ^ i16) * (-3269)) ^ (-1524068131);
                                            i19 = -525647043;
                                        } else {
                                            m69813 = (C2105.m6981("ܽ֨") + i16) * (-69);
                                            i18 = ((m69813 ^ i17) * (-26041)) ^ (-1193769879);
                                            i19 = 1420769499;
                                        }
                                    case -1383420468:
                                    case 1805798045:
                                        if (C0714.f2697 < 0) {
                                            m69813 = (C0630.m2566("ᩴۚ") + i17) * 33;
                                            i18 = ((m69813 ^ i16) * (-6439)) ^ 1236014622;
                                            i19 = -833032995;
                                        } else {
                                            m69813 = (C0630.m2566("۟֡") + i16) * 87;
                                            i18 = ((m69813 ^ i17) * (-2631)) ^ 2081692676;
                                            i19 = 218072162;
                                        }
                                    case -1071483557:
                                    case -884074980:
                                        if (C1504.f5354) {
                                            m69813 = C0630.m2566("ܿۡ") ^ i17;
                                            i18 = ((m69813 ^ i16) * (-3269)) ^ (-1524068131);
                                            i19 = -525647043;
                                        } else {
                                            m69813 = C0630.m2566("۫ܿ") ^ i17;
                                            i18 = ((m69813 ^ i16) * (-26817)) ^ (-1909980536);
                                            i19 = 774158761;
                                        }
                                    case -992364635:
                                    case 8089765:
                                        if (C0237.m1481() >= 0) {
                                            m69813 = (C0630.m2566("۟֡") + i16) * 87;
                                            i18 = ((m69813 ^ i17) * (-2631)) ^ 2081692676;
                                            i19 = 218072162;
                                        } else {
                                            m69813 = (C2105.m6981("ۙܿ") ^ i17) * 57;
                                            i18 = ((m69813 ^ i16) * 27435) ^ 1034210399;
                                            i19 = 1451367064;
                                        }
                                    case -971998593:
                                    case -439506978:
                                        C7106.m19120();
                                        if (AbstractC2021.f6743 > 0) {
                                            m69813 = C0630.m2566("ۜܺ") ^ i17;
                                            i18 = ((m69813 ^ i16) * 9221) ^ (-931627047);
                                            i19 = -1959679790;
                                        } else {
                                            m69813 = (C2105.m6981("᩻ܽ") ^ i16) * 91;
                                            i18 = ((m69813 ^ i17) * 26209) ^ (-1361235601);
                                            i19 = 1520448837;
                                        }
                                    case -955551975:
                                    case 533608810:
                                        if (C0714.f2697 < 0) {
                                            m69813 = (C0630.m2566("ᩴۚ") + i17) * 33;
                                            i18 = ((m69813 ^ i16) * (-6439)) ^ 1236014622;
                                            i19 = -833032995;
                                        } else {
                                            m69813 = C0630.m2566("ۜܺ") ^ i17;
                                            i18 = ((m69813 ^ i16) * 9221) ^ (-931627047);
                                            i19 = -1959679790;
                                        }
                                    case -576891989:
                                    case 144685789:
                                        if (C3245.f10203 <= 0) {
                                            m69813 = (C2105.m6981("᩻ܽ") ^ i16) * 91;
                                            i18 = ((m69813 ^ i17) * 26209) ^ (-1361235601);
                                            i19 = 1520448837;
                                        } else {
                                            m69813 = C2105.m6981("֨֡") ^ i16;
                                            i18 = ((m69813 ^ i17) * (-23521)) ^ 689361746;
                                            i19 = 1772569764;
                                        }
                                    case -572671276:
                                    case 289602063:
                                        interfaceC123442 = interfaceC12344;
                                        if (C5695.f17556 >= 0) {
                                            m69813 = (C2105.m6981("᩻ܽ") ^ i16) * 91;
                                            i18 = ((m69813 ^ i17) * 26209) ^ (-1361235601);
                                            i19 = 1520448837;
                                        } else {
                                            m69813 = C0630.m2566("ۙۢ") ^ i16;
                                            i18 = ((m69813 ^ i17) * (-16125)) ^ (-1087544890);
                                            i19 = 1885557081;
                                        }
                                    case -447767578:
                                    case -296152118:
                                        C3245.m9925();
                                        C2105.m6982();
                                        m69813 = (C0630.m2566("ᩴۚ") + i17) * 33;
                                        i18 = ((m69813 ^ i16) * (-6439)) ^ 1236014622;
                                        i19 = -833032995;
                                    case -223775724:
                                    case 840544096:
                                        packageManager2 = packageManager;
                                        m69813 = (i16 - C2105.m6981("ܶۘ")) * 75;
                                        i18 = ((m69813 ^ i17) * 12545) ^ 123152555;
                                        i19 = 561160130;
                                    case 821732027:
                                    case 1187775925:
                                        C0237.m1481();
                                        break;
                                    case 1591667590:
                                    case 1687945501:
                                        if (C7811.f24123 >= 0) {
                                            m69813 = C0630.m2566("ܿۡ") ^ i17;
                                            i18 = ((m69813 ^ i16) * (-3269)) ^ (-1524068131);
                                            i19 = -525647043;
                                        } else {
                                            m69813 = (i17 - C2105.m6981("ܳۡ")) * 35;
                                            i18 = ((m69813 ^ i16) * (-15767)) ^ (-1970001433);
                                            i19 = -2132928950;
                                        }
                                    default:
                                        try {
                                            C5715.m16142(interfaceC123442, packageManager2);
                                        } catch (RuntimeException unused) {
                                        }
                                        m69813 = (C2105.m6981("ᩳۗ") + i17) * (-33);
                                        i18 = ((m69813 ^ i16) * (-2619)) ^ (-1879681929);
                                        i19 = 934020064;
                                }
                                return;
                            }
                        }
                    });
                    return;
                case -1114931633:
                case 225583398:
                    z = z4;
                    z2 = z5;
                    c5715.f17622 = new Runnable() { // from class: l.᩶֡᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5715.m16140(C5715.this);
                        }
                    };
                    if (C2105.f7037 == 0) {
                        int m25666 = (C0630.m2566("۫֨") ^ i9) * (-85);
                        i13 = ((m25666 ^ i8) * 20361) ^ (-53201599);
                        z4 = z;
                        z5 = z2;
                        i14 = m25666 ^ 414075781;
                        c5715 = this;
                    }
                    int m698122 = C2105.m6981("۠۟") ^ i9;
                    z4 = z;
                    z5 = z2;
                    i14 = m698122 ^ 1374369648;
                    i13 = ((m698122 ^ i8) * (-17165)) ^ 1288205239;
                    c5715 = this;
                case -863582419:
                case -381938108:
                    z = z4;
                    abstractC7379.mo19833(c5715);
                    interfaceC12344 = ApplicationC20075.f65008;
                    if (C2272.f7362) {
                        int m25664222 = C0630.m2566("᩶ۗ") ^ i9;
                        z4 = z;
                        i14 = m25664222 ^ (-1324887266);
                        i13 = ((m25664222 ^ i8) * 19555) ^ (-549947688);
                        r2 = r2;
                    } else {
                        m2566 = C0630.m2566("ܰܶ") ^ i9;
                        i = ((m2566 ^ i8) * (-1721)) ^ (-1927536077);
                        i2 = -1988442497;
                        boolean z6222222 = z;
                        i14 = m2566 ^ i2;
                        i13 = i;
                        z4 = z6222222;
                    }
                case -724231990:
                case 2136378745:
                    ServiceConnectionC3453.m10564();
                    if (C3537.f11231 >= 0) {
                        z = z4;
                        m2566 = C2105.m6981("ۨ᩵") ^ i8;
                        i = ((m2566 ^ i9) * 12347) ^ (-621374604);
                        i2 = -119987272;
                        boolean z62222222 = z;
                        i14 = m2566 ^ i2;
                        i13 = i;
                        z4 = z62222222;
                    }
                    z = z4;
                    m2566 = (C2105.m6981("۫᩵") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((m2566 ^ i9) * (-24831)) ^ 330365308;
                    i2 = -1629886662;
                    boolean z622222222 = z;
                    i14 = m2566 ^ i2;
                    i13 = i;
                    z4 = z622222222;
                case -455787761:
                case -41078557:
                    packageManager = main.getApplicationContext().getPackageManager();
                    weakReference = new WeakReference(c5715);
                    if (RunnableC0588.f2309 < 0) {
                        m2566 = C2105.m6981("۫ۢ") ^ i9;
                        z = z4;
                        i = ((m2566 ^ i8) * (-24809)) ^ (-2059184525);
                        i2 = 1116295875;
                        boolean z6222222222 = z;
                        i14 = m2566 ^ i2;
                        i13 = i;
                        z4 = z6222222222;
                    }
                    z = z4;
                    m2566 = (C2105.m6981("۫᩵") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i = ((m2566 ^ i9) * (-24831)) ^ 330365308;
                    i2 = -1629886662;
                    boolean z62222222222 = z;
                    i14 = m2566 ^ i2;
                    i13 = i;
                    z4 = z62222222222;
                case -205826495:
                case 773376718:
                    C0237.m1481();
                    C7811.m20844();
                    throw new RuntimeException();
                case 66893293:
                case 410320560:
                    AbstractC2021.m6574();
                    z = z4;
                    z3 = z5;
                    int m2566322 = C0630.m2566("ۜܳ") ^ i8;
                    z4 = z;
                    z5 = z3;
                    i14 = m2566322 ^ 1220631036;
                    i13 = ((m2566322 ^ i9) * (-31385)) ^ 1113201747;
                    r2 = 0;
                case 412381134:
                case 570541039:
                    z = z4;
                    boolean z7 = z5;
                    c5715.f17621 = z7 ? 1 : 0;
                    c5715.f17626 = z7;
                    c5715.f17625 = main;
                    if (RunnableC0588.f2309 >= 0) {
                        z2 = z7 ? 1 : 0;
                        int m6981222 = C2105.m6981("۠۟") ^ i9;
                        z4 = z;
                        z5 = z2;
                        i14 = m6981222 ^ 1374369648;
                        i13 = ((m6981222 ^ i8) * (-17165)) ^ 1288205239;
                        c5715 = this;
                    } else {
                        int m25667 = (C0630.m2566("ᩳܶ") + i8) * (-17);
                        i13 = ((m25667 ^ i9) * (-16215)) ^ (-2098167267);
                        z4 = z;
                        i14 = m25667 ^ (-1418588995);
                        z5 = z7 ? 1 : 0;
                    }
                case 1581523070:
                case 1925081969:
                    if (interfaceC12344.getInt(C1420.m4902(sArr, i5, i6, i12), 0) != 0) {
                        m25662 = C2105.m6981("۫ۨ") ^ i9;
                        i3 = ((m25662 ^ i8) * 11019) ^ 1844790652;
                        i4 = -1206389018;
                    } else {
                        m25662 = C0630.m2566("ܳۖ") ^ i8;
                        i3 = ((m25662 ^ i9) * 21967) ^ 454800924;
                        i4 = -2113104407;
                    }
                    i14 = m25662 ^ i4;
                    i13 = i3;
                    z4 = false;
                default:
                    RunnableC1937.m6387();
                    if (C0798.f2919) {
                        z = z4;
                        z3 = z5;
                        int m25663222 = C0630.m2566("ۜܳ") ^ i8;
                        z4 = z;
                        z5 = z3;
                        i14 = m25663222 ^ 1220631036;
                        i13 = ((m25663222 ^ i9) * (-31385)) ^ 1113201747;
                        r2 = 0;
                    } else {
                        z = z4;
                        m2566 = (C2105.m6981("۫᩵") + i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i = ((m2566 ^ i9) * (-24831)) ^ 330365308;
                        i2 = -1629886662;
                        boolean z622222222222 = z;
                        i14 = m2566 ^ i2;
                        i13 = i;
                        z4 = z622222222222;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16139(WeakReference weakReference) {
        Object obj = null;
        C5715 c5715 = null;
        int i = -2000704342;
        int i2 = C0050.f910;
        int i3 = RunnableC0588.f2309;
        int m2566 = C0630.m2566("۬۫") ^ i2;
        int i4 = ((m2566 ^ i3) * 161) ^ 40236585;
        int i5 = 1705432381;
        while (true) {
            i = ((((i ^ i3) * (-16295)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2031252785:
                case 827416415:
                    c5715 = (C5715) obj;
                    if (c5715 != null) {
                        m2566 = (C2105.m6981("ۘۢ") + i3) * (-21);
                        i4 = ((m2566 ^ i2) * (-5171)) ^ (-627900262);
                        i5 = 1652395052;
                    } else {
                        m2566 = (i2 - C0630.m2566("ۘۨ")) * (-39);
                        i4 = ((m2566 ^ i3) * 7665) ^ (-212268125);
                        i5 = -1719401703;
                    }
                case -1824225956:
                case 309032148:
                    RunnableC1937.m6387();
                    break;
                case -1732003107:
                case 1010795263:
                    c5715.f17626 = false;
                    c5715.m16145();
                    m2566 = (i2 - C0630.m2566("ۘۨ")) * (-39);
                    i4 = ((m2566 ^ i3) * 7665) ^ (-212268125);
                    i5 = -1719401703;
                case -1727851255:
                case 1528882011:
                    obj = weakReference.get();
                    if (C0050.m940() <= 0) {
                        m2566 = (C0630.m2566("ۧ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m2566 ^ i3) * (-17393)) ^ (-494946768);
                        i5 = 1165813647;
                    } else {
                        m2566 = C0630.m2566("֫ܰ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-13939)) ^ (-1282692664);
                        i5 = -1996300688;
                    }
                case -926361227:
                case 782982414:
                    C1916.m6308();
                    m2566 = (i2 - C2105.m6981("᩹ܽ")) * 9;
                    i4 = ((m2566 ^ i3) * (-13715)) ^ (-523961608);
                    i5 = -203712437;
                case -532931347:
                case 1328101629:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m2566 = (C0630.m2566("ۧ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m2566 ^ i3) * (-17393)) ^ (-494946768);
                        i5 = 1165813647;
                    } else {
                        m2566 = (C0630.m2566("ܺۜ") + i2) * 61;
                        i4 = ((m2566 ^ i3) * (-25845)) ^ 425916125;
                        i5 = 122238123;
                    }
                case -474049578:
                case 1794178700:
                    if (C22628.f73083 <= 0) {
                        m2566 = (i3 - C0630.m2566("᩶ܰ")) * (-13);
                        i4 = ((m2566 ^ i2) * (-28589)) ^ 1757821239;
                        i5 = 16077889;
                    } else {
                        m2566 = C0630.m2566("ۢᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * 4125) ^ 1982329612;
                        i5 = -423915595;
                    }
                case -87459729:
                case 1390522843:
                    if (C22628.m50615() != 0) {
                        m2566 = (i2 - C2105.m6981("᩹ܽ")) * 9;
                        i4 = ((m2566 ^ i3) * (-13715)) ^ (-523961608);
                        i5 = -203712437;
                    } else {
                        m2566 = (C0630.m2566("᩺۫") ^ i2) * (-119);
                        i4 = ((m2566 ^ i3) * (-2305)) ^ 414817103;
                        i5 = 1049941404;
                    }
                case -82141856:
                case 2035716691:
                    if (C22628.m50615() != 0) {
                        m2566 = C0630.m2566("ۢᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * 4125) ^ 1982329612;
                        i5 = -423915595;
                    } else {
                        m2566 = (i3 - C0630.m2566("᩷ۘ")) * (-127);
                        i4 = ((m2566 ^ i2) * 29137) ^ 121724669;
                        i5 = -670508410;
                    }
                case -77443764:
                case 1908007646:
                    if (C1504.m5179()) {
                        m2566 = (i2 - C2105.m6981("ܺ᩸")) * (-29);
                        i4 = ((m2566 ^ i3) * 15131) ^ (-132799412);
                        i5 = 864665372;
                    } else {
                        m2566 = (i2 - C2105.m6981("᩹ܽ")) * 9;
                        i4 = ((m2566 ^ i3) * (-13715)) ^ (-523961608);
                        i5 = -203712437;
                    }
                case 2620653:
                case 457464216:
                    if (C22628.f73083 <= 0) {
                        m2566 = (C0630.m2566("ᩳ᩷") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((m2566 ^ i3) * 10563) ^ 1570272178;
                        i5 = 1362034421;
                    } else {
                        m2566 = (i3 - C0630.m2566("ᩴܺ")) * 19;
                        i4 = ((m2566 ^ i2) * 22297) ^ (-1945940336);
                        i5 = -1924493530;
                    }
                case 71065917:
                case 885508626:
                    if (C7811.f24123 >= 0) {
                        m2566 = (C0630.m2566("ۧ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m2566 ^ i3) * (-17393)) ^ (-494946768);
                        i5 = 1165813647;
                    } else {
                        m2566 = C0630.m2566("᩶ܳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 26765) ^ 2144120535;
                        i5 = -398383604;
                    }
                case 284792634:
                case 865743743:
                    if (RunnableC3474.f10992 <= 0) {
                        m2566 = (C0630.m2566("ᩳ᩷") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((m2566 ^ i3) * 10563) ^ 1570272178;
                        i5 = 1362034421;
                    } else {
                        m2566 = C0630.m2566("ܺ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * (-32717)) ^ 1041417108;
                        i5 = -58582055;
                    }
                case 461236762:
                case 1101804117:
                    break;
                case 565616448:
                case 702007310:
                    if (C0964.f3626 != 0) {
                        m2566 = (i2 - C2105.m6981("᩹ܽ")) * 9;
                        i4 = ((m2566 ^ i3) * (-13715)) ^ (-523961608);
                        i5 = -203712437;
                    } else {
                        m2566 = (i3 - C0630.m2566("᩶ܰ")) * (-13);
                        i4 = ((m2566 ^ i2) * (-28589)) ^ 1757821239;
                        i5 = 16077889;
                    }
                case 1168005096:
                case 1600522784:
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = (C0630.m2566("ۧ᩻") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m2566 ^ i3) * (-17393)) ^ (-494946768);
                        i5 = 1165813647;
                    } else {
                        m2566 = C2105.m6981("ܳۚ") ^ i2;
                        i4 = ((m2566 ^ i3) * 10661) ^ (-740469537);
                        i5 = 2051568003;
                    }
                case 1428009946:
                case 2134941640:
                    C2958.m9034();
                    if (C3537.f11231 < 0) {
                        m2566 = (i3 - C0630.m2566("᩶ܰ")) * (-13);
                        i4 = ((m2566 ^ i2) * (-28589)) ^ 1757821239;
                        i5 = 16077889;
                    } else {
                        m2566 = (C0630.m2566("ᩳ᩷") + i2) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i4 = ((m2566 ^ i3) * 10563) ^ 1570272178;
                        i5 = 1362034421;
                    }
                default:
                    if (C3663.f11553) {
                        m2566 = C0630.m2566("ۢᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * 4125) ^ 1982329612;
                        i5 = -423915595;
                    } else {
                        m2566 = (C0630.m2566("᩺ۘ") + i3) * (-25);
                        i4 = ((m2566 ^ i2) * (-22831)) ^ 920248323;
                        i5 = -1891260632;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (m16143(r8, l.C1420.m4902(l.C5715.f17617, 78, 28, r1)) != false) goto L17;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m16142(l.InterfaceC12344 r7, android.content.pm.PackageManager r8) {
        /*
            short[] r0 = l.C5715.f17617
            r1 = 20
            short r0 = r0[r1]
            int r1 = r0 * r0
            r2 = 283417225(0x10e49a89, float:9.016824E-29)
            int r1 = r1 + r2
            int r1 = r1 + r1
            int r0 = r0 + 16835
            int r0 = r0 * r0
            int r0 = r0 - r1
            if (r0 <= 0) goto L1b
            r0 = 46292(0xb4d4, float:6.4869E-41)
            r1 = 46292(0xb4d4, float:6.4869E-41)
            goto L21
        L1b:
            r0 = 60541(0xec7d, float:8.4836E-41)
            r1 = 60541(0xec7d, float:8.4836E-41)
        L21:
            java.lang.Object r0 = l.C5715.f17618
            monitor-enter(r0)
            short[] r2 = l.C5715.f17617     // Catch: java.lang.Throwable -> L7b
            r3 = 21
            r4 = 3
            java.lang.String r2 = l.C2105.m6988(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> L7b
            r3 = 0
            int r2 = r7.getInt(r2, r3)     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            return
        L36:
            r2 = 1
            short[] r4 = l.C5715.f17617     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65 java.lang.Throwable -> L7b
            r5 = 24
            r6 = 19
            java.lang.String r4 = l.C2520.m8030(r4, r5, r6, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65 java.lang.Throwable -> L7b
            r8.getApplicationInfo(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65 java.lang.Throwable -> L7b
            short[] r3 = l.C5715.f17617     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65 java.lang.Throwable -> L7b
            r4 = 43
            r5 = 32
            java.lang.String r3 = l.C3663.m11162(r3, r4, r5, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65 java.lang.Throwable -> L7b
            boolean r3 = m16143(r8, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65 java.lang.Throwable -> L7b
            if (r3 != 0) goto L64
            short[] r3 = l.C5715.f17617     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65 java.lang.Throwable -> L7b
            r4 = 78
            r5 = 28
            java.lang.String r3 = l.C1420.m4902(r3, r4, r5, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65 java.lang.Throwable -> L7b
            boolean r8 = m16143(r8, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L65 java.lang.Throwable -> L7b
            if (r8 == 0) goto L65
        L64:
            r2 = 2
        L65:
            l.۬ۤۡ r7 = l.ViewOnClickListenerC1958.m6438(r7)     // Catch: java.lang.Throwable -> L7b
            short[] r8 = l.C5715.f17617     // Catch: java.lang.Throwable -> L7b
            r3 = 75
            r4 = 3
            java.lang.String r8 = l.C5695.m16034(r8, r3, r4, r1)     // Catch: java.lang.Throwable -> L7b
            l.۬ۤۡ r7 = r7.mo25853(r2, r8)     // Catch: java.lang.Throwable -> L7b
            l.C7106.m19107(r7)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            return
        L7b:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5715.m16142(l.۫ۤۡ, android.content.pm.PackageManager):void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m16145() {
        View view = null;
        RunnableC19827 runnableC19827 = null;
        int i = 1531537474;
        int i2 = RunnableC3474.f10992;
        int i3 = C4075.f12947;
        int m2566 = C0630.m2566("֫ۢ") ^ i2;
        int i4 = ((m2566 ^ i3) * (-26377)) ^ (-569681961);
        int i5 = -2145962093;
        while (true) {
            i = ((((i ^ i3) * (-23735)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2131345056:
                case 1748506267:
                    if (C3537.m10746() <= 0) {
                        m2566 = (C0630.m2566("ܿۙ") + i3) * 123;
                        i4 = ((m2566 ^ i2) * 12189) ^ 1540243310;
                        i5 = 1698189462;
                    } else {
                        m2566 = C0630.m2566("ܿۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * 31689) ^ 494774842;
                        i5 = 90215782;
                    }
                case -2107878238:
                case 1385982338:
                    RunnableC1937.m6387();
                    if (C0050.f910 < 0) {
                        m2566 = C2105.m6981("ۗ۠") ^ i3;
                        i4 = ((m2566 ^ i2) * 9275) ^ (-2070727306);
                        i5 = 386950962;
                    } else {
                        m2566 = (C0630.m2566("ܿۙ") + i3) * 123;
                        i4 = ((m2566 ^ i2) * 12189) ^ 1540243310;
                        i5 = 1698189462;
                    }
                case -2026806202:
                case 1959129902:
                    if (C0237.f1507 != 0) {
                        m2566 = (C0630.m2566("ܿۙ") + i3) * 123;
                        i4 = ((m2566 ^ i2) * 12189) ^ 1540243310;
                        i5 = 1698189462;
                    } else {
                        m2566 = C2105.m6981("۠ܳ") ^ i3;
                        i4 = ((m2566 ^ i2) * 18573) ^ (-763575126);
                        i5 = 1553318771;
                    }
                case -1989724782:
                case 1951399520:
                    break;
                case -1985767262:
                case -989639199:
                    C1773.m5908();
                    if (C1128.m3851() > 0) {
                        m2566 = C2105.m6981("ۗ۠") ^ i3;
                        i4 = ((m2566 ^ i2) * 9275) ^ (-2070727306);
                        i5 = 386950962;
                    } else {
                        m2566 = C2105.m6981("ۢܺ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-9599)) ^ 1836354064;
                        i5 = -915542170;
                    }
                case -1622430717:
                case -614273919:
                    C0964.m3413();
                    break;
                case -1467482541:
                case -1174586066:
                    RunnableC3474.m10630();
                    m2566 = C2105.m6981("ۗ۠") ^ i3;
                    i4 = ((m2566 ^ i2) * 9275) ^ (-2070727306);
                    i5 = 386950962;
                case -1236606084:
                case -202401930:
                    if (C11340.f33930 >= 0) {
                        m2566 = C2105.m6981("ۢܺ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-9599)) ^ 1836354064;
                        i5 = -915542170;
                    } else {
                        m2566 = C0630.m2566("ܺܳ") ^ i2;
                        i4 = ((m2566 ^ i3) * 30687) ^ (-1396151478);
                        i5 = 1909763971;
                    }
                case -1058817412:
                case 229426356:
                    if (C3911.f12484 >= 0) {
                        m2566 = C0630.m2566("᩶۟") ^ i2;
                        i4 = ((m2566 ^ i3) * 569) ^ 570748479;
                        i5 = -1528120475;
                    } else {
                        m2566 = C0630.m2566("ۙۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * 23433) ^ 362188148;
                        i5 = 164757524;
                    }
                case -890258437:
                case 1430336183:
                    view.removeCallbacks(runnableC19827);
                    view.post(runnableC19827);
                    m2566 = C2105.m6981("ܶܽ") ^ i3;
                    i4 = ((m2566 ^ i2) * (-14369)) ^ (-428296964);
                    i5 = 20759181;
                case -724693256:
                case 2016743100:
                    if (C1504.f5354) {
                        m2566 = (C2105.m6981("۬᩹") ^ i3) * (-53);
                        i4 = ((m2566 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        m2566 = (C2105.m6981("᩺ۜ") ^ i3) * (-95);
                        i4 = ((m2566 ^ i2) * 8835) ^ (-93071561);
                        i5 = 9245995;
                    }
                case -636633636:
                case 1686814531:
                    if (C4616.f14690 <= 0) {
                        m2566 = (C2105.m6981("۬᩹") ^ i3) * (-53);
                        i4 = ((m2566 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        m2566 = (C2105.m6981("ܳۢ") + i3) * (-25);
                        i4 = ((m2566 ^ i2) * 24339) ^ 792440856;
                        i5 = 1709928842;
                    }
                case -519529744:
                case 1155770849:
                    C1916.m6308();
                    if (C2958.f9394 < 0) {
                        m2566 = C2105.m6981("ۢܺ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-9599)) ^ 1836354064;
                        i5 = -915542170;
                    } else {
                        m2566 = C0630.m2566("᩶۟") ^ i2;
                        i4 = ((m2566 ^ i3) * 569) ^ 570748479;
                        i5 = -1528120475;
                    }
                case -503493463:
                case 1496599408:
                    if (this.f17620) {
                        m2566 = C2105.m6981("ܶܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-14369)) ^ (-428296964);
                        i5 = 20759181;
                    } else {
                        m2566 = C0630.m2566("ܿ᩻") ^ i2;
                        i4 = ((m2566 ^ i3) * (-10633)) ^ (-1261696193);
                        i5 = 197196892;
                    }
                case 272532759:
                case 1325667689:
                    if (C7811.f24123 >= 0) {
                        m2566 = (C2105.m6981("۬᩹") ^ i3) * (-53);
                        i4 = ((m2566 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        m2566 = (i3 - C2105.m6981("֡ۙ")) * 81;
                        i4 = ((m2566 ^ i2) * (-7597)) ^ (-429429444);
                        i5 = 1483554760;
                    }
                case 1262298595:
                case 2096790344:
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = C2105.m6981("ۢܺ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-9599)) ^ 1836354064;
                        i5 = -915542170;
                    } else {
                        m2566 = C0630.m2566("۠ܶ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-23201)) ^ 15590709;
                        i5 = 1220048882;
                    }
                case 1308939805:
                case 1781189357:
                    view = this.f17624;
                    runnableC19827 = this.f17622;
                    if (C2520.f8000 >= 0) {
                        m2566 = (C2105.m6981("۬᩹") ^ i3) * (-53);
                        i4 = ((m2566 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        m2566 = C0630.m2566("᩵ۢ") ^ i2;
                        i4 = ((m2566 ^ i3) * 22019) ^ 623874304;
                        i5 = -422014234;
                    }
                default:
                    if (C3746.f11829 <= 0) {
                        m2566 = (C2105.m6981("۬᩹") ^ i3) * (-53);
                        i4 = ((m2566 ^ i2) * 13847) ^ (-1939568250);
                        i5 = -1771693467;
                    } else {
                        m2566 = C0630.m2566("֫ۜ") ^ i2;
                        i4 = ((m2566 ^ i3) * 19431) ^ (-1664267338);
                        i5 = -677341120;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16143(PackageManager packageManager, String str) {
        int m2566;
        int i;
        int i2;
        int i3;
        int i4;
        Intent intent;
        String str2;
        Intent intent2;
        int i5;
        int m6981;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int m25662;
        int i11;
        int i12;
        int i13;
        int i14 = C0714.f2697;
        int i15 = ServiceConnectionC3453.f10921;
        int m69812 = (i14 - C2105.m6981("ۧܽ")) * 9;
        int i16 = ((m69812 ^ i15) * (-25331)) ^ 1422155399;
        short[] sArr = null;
        short[] sArr2 = null;
        int i17 = m69812 ^ (-932612106);
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = -649194530;
        Iterator it = null;
        Intent intent3 = null;
        String str3 = null;
        Intent intent4 = null;
        while (true) {
            int i22 = i17 ^ (i16 & (((i21 ^ i15) * 27055) >> 31));
            switch (i22) {
                case -2044708840:
                case -891009899:
                    intent = intent4;
                    str2 = str3;
                    intent2 = intent3;
                    i5 = i22;
                    s = sArr[c];
                    s2 = 78000;
                    if (C0798.f2919) {
                        str3 = str2;
                        int m69813 = (C2105.m6981("᩻֨") ^ i14) * 101;
                        i12 = ((m69813 ^ i15) * 28415) ^ (-744369099);
                        i13 = m69813 ^ 481526652;
                        i21 = i5;
                        intent4 = intent;
                        i17 = i13;
                        i16 = i12;
                        intent3 = intent2;
                    } else {
                        m6981 = C2105.m6981("ᩳ֨") ^ i14;
                        i6 = ((m6981 ^ i15) * (-4283)) ^ 1452566984;
                        i7 = 1879645781;
                        int i23 = m6981 ^ i7;
                        i21 = i5;
                        intent3 = intent2;
                        intent4 = intent;
                        i17 = i23;
                        i16 = i6;
                        str3 = str2;
                    }
                case -1953813299:
                case -29016611:
                    intent = intent4;
                    str2 = str3;
                    intent2 = intent3;
                    i5 = i22;
                    i18 = s * s2;
                    i19 = s + 19500;
                    if (C3537.f11231 < 0) {
                        m6981 = C0630.m2566("۠ۤ") ^ i14;
                        i6 = ((m6981 ^ i15) * (-2179)) ^ 1052181993;
                        i7 = -1058905545;
                        int i232 = m6981 ^ i7;
                        i21 = i5;
                        intent3 = intent2;
                        intent4 = intent;
                        i17 = i232;
                        i16 = i6;
                        str3 = str2;
                    }
                    m6981 = C0630.m2566("۬ۙ") ^ i15;
                    i6 = ((m6981 ^ i14) * 14803) ^ (-682401035);
                    i7 = -1120694864;
                    int i2322 = m6981 ^ i7;
                    i21 = i5;
                    intent3 = intent2;
                    intent4 = intent;
                    i17 = i2322;
                    i16 = i6;
                    str3 = str2;
                case -1828548530:
                case -522931455:
                    i10 = i22;
                    intent3 = intent4.setPackage(str3);
                    if (!C2126.f7087) {
                        intent = intent4;
                        m25662 = (i15 - C0630.m2566("᩻ۛ")) * 61;
                        i8 = ((m25662 ^ i14) * (-12491)) ^ 539498886;
                        i11 = -1383103086;
                        i9 = m25662 ^ i11;
                        i21 = i10;
                        i17 = i9;
                        i16 = i8;
                        intent4 = intent;
                    }
                    m25662 = C0630.m2566("۫ۗ") ^ i14;
                    intent = intent4;
                    i8 = ((m25662 ^ i15) * 26757) ^ 222936209;
                    i11 = 1296506059;
                    i9 = m25662 ^ i11;
                    i21 = i10;
                    i17 = i9;
                    i16 = i8;
                    intent4 = intent;
                case -1818825995:
                case -606094494:
                    i4 = i22;
                    it = RunnableC1937.m6374(packageManager.queryIntentActivities(intent3, 512));
                    int m25663 = C0630.m2566("ۙܿ") ^ i14;
                    intent2 = intent3;
                    i12 = ((m25663 ^ i15) * 21407) ^ 1896945708;
                    i13 = m25663 ^ (-1390786439);
                    i21 = i4;
                    i17 = i13;
                    i16 = i12;
                    intent3 = intent2;
                case -1624360406:
                case -401428624:
                    intent = intent4;
                    intent2 = intent3;
                    i5 = i22;
                    str3 = C2520.m8030(sArr2, 133, 19, i20);
                    if (C0050.m940() <= 0) {
                        int m698132 = (C2105.m6981("᩻֨") ^ i14) * 101;
                        i12 = ((m698132 ^ i15) * 28415) ^ (-744369099);
                        i13 = m698132 ^ 481526652;
                        i21 = i5;
                        intent4 = intent;
                        i17 = i13;
                        i16 = i12;
                        intent3 = intent2;
                    } else {
                        int m25664 = C0630.m2566("ۨ۟") ^ i14;
                        i8 = ((m25664 ^ i15) * (-11347)) ^ 650047069;
                        i9 = m25664 ^ 1855682027;
                        i21 = i5;
                        intent3 = intent2;
                        i17 = i9;
                        i16 = i8;
                        intent4 = intent;
                    }
                case -1460849266:
                case 890521636:
                    intent = intent4;
                    str2 = str3;
                    intent2 = intent3;
                    i5 = i22;
                    sArr = f17617;
                    if (!C3683.m11222()) {
                        m6981 = C0630.m2566("ۙᩳ") ^ i15;
                        i6 = ((m6981 ^ i14) * (-24175)) ^ 1065531454;
                        i7 = 1378899864;
                        int i23222 = m6981 ^ i7;
                        i21 = i5;
                        intent3 = intent2;
                        intent4 = intent;
                        i17 = i23222;
                        i16 = i6;
                        str3 = str2;
                    }
                    m6981 = C0630.m2566("۬ۙ") ^ i15;
                    i6 = ((m6981 ^ i14) * 14803) ^ (-682401035);
                    i7 = -1120694864;
                    int i232222 = m6981 ^ i7;
                    i21 = i5;
                    intent3 = intent2;
                    intent4 = intent;
                    i17 = i232222;
                    i16 = i6;
                    str3 = str2;
                case -1094235054:
                case 550483371:
                    intent = intent4;
                    str2 = str3;
                    intent2 = intent3;
                    i5 = i22;
                    c = 'j';
                    if (C7811.f24123 < 0) {
                        m6981 = C2105.m6981("᩵۟") ^ i15;
                        i6 = ((m6981 ^ i14) * (-9993)) ^ (-1496470548);
                        i7 = 1792341602;
                        int i2322222 = m6981 ^ i7;
                        i21 = i5;
                        intent3 = intent2;
                        intent4 = intent;
                        i17 = i2322222;
                        i16 = i6;
                        str3 = str2;
                    }
                    m6981 = (C0630.m2566("᩶ۨ") + i15) * 127;
                    i6 = ((m6981 ^ i14) * 7725) ^ 797377981;
                    i7 = -839280810;
                    int i23222222 = m6981 ^ i7;
                    i21 = i5;
                    intent3 = intent2;
                    intent4 = intent;
                    i17 = i23222222;
                    i16 = i6;
                    str3 = str2;
                case -1022829670:
                case -800189394:
                    C0382.m1848();
                    C5695.m16023();
                    intent = intent4;
                    str2 = str3;
                    intent2 = intent3;
                    i5 = i22;
                    int m25665 = (i15 - C0630.m2566("ۡۨ")) * 37;
                    i8 = ((m25665 ^ i14) * 1537) ^ (-1079179950);
                    i9 = m25665 ^ (-927271924);
                    i21 = i5;
                    intent3 = intent2;
                    str3 = str2;
                    i17 = i9;
                    i16 = i8;
                    intent4 = intent;
                case -993375421:
                case -150187135:
                    C2167.m7155();
                    return false;
                case -928427031:
                case -189089587:
                    intent = intent4;
                    str2 = str3;
                    intent2 = intent3;
                    i5 = i22;
                    if (!C3683.m11222()) {
                        m6981 = C2105.m6981("ۛۖ") ^ i14;
                        i6 = ((m6981 ^ i15) * (-4109)) ^ (-459766552);
                        i7 = -1151628958;
                        int i232222222 = m6981 ^ i7;
                        i21 = i5;
                        intent3 = intent2;
                        intent4 = intent;
                        i17 = i232222222;
                        i16 = i6;
                        str3 = str2;
                    }
                    m6981 = (C0630.m2566("᩶ۨ") + i15) * 127;
                    i6 = ((m6981 ^ i14) * 7725) ^ 797377981;
                    i7 = -839280810;
                    int i2322222222 = m6981 ^ i7;
                    i21 = i5;
                    intent3 = intent2;
                    intent4 = intent;
                    i17 = i2322222222;
                    i16 = i6;
                    str3 = str2;
                case -902248318:
                case 1320002606:
                    intent = intent4;
                    str2 = str3;
                    intent2 = intent3;
                    i5 = i22;
                    if (i18 - (i19 * i19) > 0) {
                        m6981 = C2105.m6981("֫۠") ^ i14;
                        i6 = ((m6981 ^ i15) * 10433) ^ (-1577221325);
                        i7 = 1573965440;
                    } else {
                        m6981 = (C0630.m2566("۬ۗ") ^ i15) * (-43);
                        i6 = ((m6981 ^ i14) * (-22077)) ^ (-521925723);
                        i7 = -587930917;
                    }
                    int i23222222222 = m6981 ^ i7;
                    i21 = i5;
                    intent3 = intent2;
                    intent4 = intent;
                    i17 = i23222222222;
                    i16 = i6;
                    str3 = str2;
                case -744529400:
                case 1231581891:
                    intent = intent4;
                    str2 = str3;
                    intent2 = intent3;
                    i5 = i22;
                    i20 = 14474;
                    m6981 = (i15 - C2105.m6981("ۙ᩹")) * 63;
                    i6 = ((m6981 ^ i14) * 5115) ^ 482219243;
                    i7 = 1943067976;
                    int i232222222222 = m6981 ^ i7;
                    i21 = i5;
                    intent3 = intent2;
                    intent4 = intent;
                    i17 = i232222222222;
                    i16 = i6;
                    str3 = str2;
                case -429592232:
                case 1371841965:
                    C3432.m10477();
                    if (C3432.m10477() > 0) {
                        i10 = i22;
                        m25662 = C0630.m2566("۫ۗ") ^ i14;
                        intent = intent4;
                        i8 = ((m25662 ^ i15) * 26757) ^ 222936209;
                        i11 = 1296506059;
                        i9 = m25662 ^ i11;
                        i21 = i10;
                        i17 = i9;
                        i16 = i8;
                        intent4 = intent;
                    }
                    intent = intent4;
                    str2 = str3;
                    intent2 = intent3;
                    i5 = i22;
                    int m256652 = (i15 - C0630.m2566("ۡۨ")) * 37;
                    i8 = ((m256652 ^ i14) * 1537) ^ (-1079179950);
                    i9 = m256652 ^ (-927271924);
                    i21 = i5;
                    intent3 = intent2;
                    str3 = str2;
                    i17 = i9;
                    i16 = i8;
                    intent4 = intent;
                case -371802185:
                case -293035604:
                    intent = intent4;
                    str2 = str3;
                    intent2 = intent3;
                    i5 = i22;
                    i20 = 63439;
                    m6981 = (i15 - C2105.m6981("ۙ᩹")) * 63;
                    i6 = ((m6981 ^ i14) * 5115) ^ 482219243;
                    i7 = 1943067976;
                    int i2322222222222 = m6981 ^ i7;
                    i21 = i5;
                    intent3 = intent2;
                    intent4 = intent;
                    i17 = i2322222222222;
                    i16 = i6;
                    str3 = str2;
                case -202975498:
                case 2078679393:
                    return false;
                case 129598716:
                case 259275212:
                    if (((ResolveInfo) RunnableC1108.m3791(it)).activityInfo.exported) {
                        m2566 = (C0630.m2566("ۚۡ") + i14) * 91;
                        i = i22;
                        i2 = ((m2566 ^ i15) * (-30607)) ^ 415237065;
                        i3 = -487181457;
                        int i24 = i;
                        i17 = m2566 ^ i3;
                        i16 = i2;
                        i21 = i24;
                    } else {
                        i4 = i22;
                        int m256632 = C0630.m2566("ۙܿ") ^ i14;
                        intent2 = intent3;
                        i12 = ((m256632 ^ i15) * 21407) ^ 1896945708;
                        i13 = m256632 ^ (-1390786439);
                        i21 = i4;
                        i17 = i13;
                        i16 = i12;
                        intent3 = intent2;
                    }
                case 588937240:
                case 636562316:
                    intent = intent4;
                    intent2 = intent3;
                    i5 = i22;
                    short[] sArr3 = f17617;
                    if (C3537.f11231 >= 0) {
                        str2 = str3;
                        m6981 = C0630.m2566("۬ۙ") ^ i15;
                        i6 = ((m6981 ^ i14) * 14803) ^ (-682401035);
                        i7 = -1120694864;
                        int i23222222222222 = m6981 ^ i7;
                        i21 = i5;
                        intent3 = intent2;
                        intent4 = intent;
                        i17 = i23222222222222;
                        i16 = i6;
                        str3 = str2;
                    } else {
                        str2 = str3;
                        String m2128 = C0483.m2128(sArr3, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 26, i20);
                        if (C0050.f910 >= 0) {
                            int m2566522 = (i15 - C0630.m2566("ۡۨ")) * 37;
                            i8 = ((m2566522 ^ i14) * 1537) ^ (-1079179950);
                            i9 = m2566522 ^ (-927271924);
                            i21 = i5;
                            intent3 = intent2;
                            str3 = str2;
                            i17 = i9;
                            i16 = i8;
                            intent4 = intent;
                        } else {
                            Intent addCategory = new Intent(m2128).addCategory(str);
                            sArr2 = f17617;
                            if (C2105.f7037 != 0) {
                                intent = addCategory;
                                m6981 = (C0630.m2566("᩶ۨ") + i15) * 127;
                                i6 = ((m6981 ^ i14) * 7725) ^ 797377981;
                                i7 = -839280810;
                                int i232222222222222 = m6981 ^ i7;
                                i21 = i5;
                                intent3 = intent2;
                                intent4 = intent;
                                i17 = i232222222222222;
                                i16 = i6;
                                str3 = str2;
                            } else {
                                int m69814 = C2105.m6981("֨ܿ") ^ i15;
                                intent4 = addCategory;
                                i16 = ((m69814 ^ i14) * (-12569)) ^ 1710934476;
                                i21 = i5;
                                intent3 = intent2;
                                i17 = m69814 ^ 82177175;
                                str3 = str2;
                            }
                        }
                    }
                case 819183097:
                case 951802796:
                    C22628.m50615();
                    if (C7106.m19120() <= 0) {
                        intent = intent4;
                        str2 = str3;
                        intent2 = intent3;
                        i5 = i22;
                        int m25665222 = (i15 - C0630.m2566("ۡۨ")) * 37;
                        i8 = ((m25665222 ^ i14) * 1537) ^ (-1079179950);
                        i9 = m25665222 ^ (-927271924);
                        i21 = i5;
                        intent3 = intent2;
                        str3 = str2;
                        i17 = i9;
                        i16 = i8;
                        intent4 = intent;
                    } else {
                        intent = intent4;
                        str2 = str3;
                        intent2 = intent3;
                        i5 = i22;
                        m6981 = C0630.m2566("۬ۙ") ^ i15;
                        i6 = ((m6981 ^ i14) * 14803) ^ (-682401035);
                        i7 = -1120694864;
                        int i2322222222222222 = m6981 ^ i7;
                        i21 = i5;
                        intent3 = intent2;
                        intent4 = intent;
                        i17 = i2322222222222222;
                        i16 = i6;
                        str3 = str2;
                    }
                case 1566881544:
                case 2133566834:
                    if (C4159.f13567) {
                        intent = intent4;
                        str2 = str3;
                        intent2 = intent3;
                        i5 = i22;
                        m6981 = C0630.m2566("۬ۙ") ^ i15;
                        i6 = ((m6981 ^ i14) * 14803) ^ (-682401035);
                        i7 = -1120694864;
                        int i23222222222222222 = m6981 ^ i7;
                        i21 = i5;
                        intent3 = intent2;
                        intent4 = intent;
                        i17 = i23222222222222222;
                        i16 = i6;
                        str3 = str2;
                    } else {
                        intent = intent4;
                        intent2 = intent3;
                        i5 = i22;
                        int m6981322 = (C2105.m6981("᩻֨") ^ i14) * 101;
                        i12 = ((m6981322 ^ i15) * 28415) ^ (-744369099);
                        i13 = m6981322 ^ 481526652;
                        i21 = i5;
                        intent4 = intent;
                        i17 = i13;
                        i16 = i12;
                        intent3 = intent2;
                    }
                case 1956252131:
                case 2031264790:
                    return true;
                default:
                    i = i22;
                    if (C0483.m2123(it)) {
                        m2566 = (i15 - C2105.m6981("ۨܶ")) * 11;
                        i2 = ((m2566 ^ i14) * (-16723)) ^ (-830131073);
                        i3 = 568996026;
                    } else {
                        m2566 = C2105.m6981("ۧۜ") ^ i14;
                        i2 = ((m2566 ^ i15) * 15163) ^ (-1134582529);
                        i3 = -173414487;
                    }
                    int i242 = i;
                    i17 = m2566 ^ i3;
                    i16 = i2;
                    i21 = i242;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Runnable m16147() {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = -664418331;
        int i5 = C0714.f2697;
        int i6 = C3911.f12484;
        int m6981 = (i5 - C2105.m6981("۠ܳ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
        int i7 = ((m6981 ^ i6) * 309) ^ (-40041346);
        int i8 = 1154238186;
        while (true) {
            i4 = ((((i4 ^ i6) * 18359) >> 31) & i7) ^ (m6981 ^ i8);
            switch (i4) {
                case -1910061152:
                case 1029662202:
                    C3911.m11924();
                    m6981 = (i6 - C2105.m6981("ᩳܺ")) * (-73);
                    i7 = ((m6981 ^ i5) * (-9405)) ^ (-1765700054);
                    i8 = 687456289;
                case -1742931113:
                case -1542105165:
                    if (C0798.f2919) {
                        m6981 = (i6 - C2105.m6981("ᩳܺ")) * (-73);
                        i7 = ((m6981 ^ i5) * (-9405)) ^ (-1765700054);
                        i8 = 687456289;
                    } else {
                        m6981 = C2105.m6981("᩺᩹") ^ i5;
                        i7 = ((m6981 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    }
                case -811627498:
                case -507711172:
                    if (C2167.f7158 >= 0) {
                        m6981 = C2105.m6981("᩺᩹") ^ i5;
                        i7 = ((m6981 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    } else {
                        m6981 = C0630.m2566("᩺ۨ") ^ i5;
                        i7 = ((m6981 ^ i6) * (-8761)) ^ 589494789;
                        i8 = -1108778262;
                    }
                case -664327314:
                case 755607207:
                    i2 = 1;
                    if (C2105.f7037 != 0) {
                        m6981 = (C0630.m2566("ᩳܰ") ^ i5) * 77;
                        i7 = ((m6981 ^ i6) * (-29295)) ^ (-737178009);
                        i8 = 823336175;
                    } else {
                        m6981 = (i6 - C0630.m2566("ۖܽ")) * (-5);
                        i7 = ((m6981 ^ i5) * (-2031)) ^ (-274940537);
                        i8 = -1543719094;
                    }
                case -638654694:
                case 383193734:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C2105.m6981("᩺᩹") ^ i5;
                        i7 = ((m6981 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    } else {
                        m6981 = (C0630.m2566("ܿ᩹") + i6) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i7 = ((m6981 ^ i5) * (-32693)) ^ 500043814;
                        i8 = 1836102725;
                    }
                case -563593712:
                case 1695419424:
                    i3 = i + i2;
                    if (C0050.f910 >= 0) {
                        m6981 = (i6 - C0630.m2566("۟ᩳ")) * (-39);
                        i7 = ((m6981 ^ i5) * 16191) ^ (-879956429);
                        i8 = -1944371879;
                    } else {
                        m6981 = C2105.m6981("۟ܺ") ^ i5;
                        i7 = ((m6981 ^ i6) * 21283) ^ 1841211348;
                        i8 = -381221249;
                    }
                case -555669502:
                case 506160250:
                    if (C0483.f2088 >= 0) {
                        m6981 = (C0630.m2566("ܰۤ") ^ i6) * (-15);
                        i7 = ((m6981 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    } else {
                        m6981 = (C0630.m2566("ᩳᩳ") + i5) * (-11);
                        i7 = ((m6981 ^ i6) * (-31739)) ^ 179520588;
                        i8 = -674231419;
                    }
                case -379066259:
                case -34147857:
                    RunnableC3474.m10630();
                    if (C4117.f13076 > 0) {
                        m6981 = (i6 - C2105.m6981("ᩳܺ")) * (-73);
                        i7 = ((m6981 ^ i5) * (-9405)) ^ (-1765700054);
                        i8 = 687456289;
                    } else {
                        m6981 = (C0630.m2566("ܰۤ") ^ i6) * (-15);
                        i7 = ((m6981 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    }
                case -148040589:
                case 846886147:
                    if (C1916.f6442) {
                        m6981 = C2105.m6981("ۚۨ") ^ i6;
                        i7 = ((m6981 ^ i5) * (-29597)) ^ 204653880;
                        i8 = 123669607;
                    } else {
                        m6981 = (i6 - C2105.m6981("ᩳܺ")) * (-73);
                        i7 = ((m6981 ^ i5) * (-9405)) ^ (-1765700054);
                        i8 = 687456289;
                    }
                case 48218627:
                case 1126068564:
                    C7811.m20844();
                    return null;
                case 540855020:
                case 900040996:
                    if (C4263.f13799 <= 0) {
                        m6981 = (C0630.m2566("ܰۤ") ^ i6) * (-15);
                        i7 = ((m6981 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    } else {
                        m6981 = C0630.m2566("۠ܺ") ^ i6;
                        i7 = ((m6981 ^ i5) * (-6819)) ^ (-766779236);
                        i8 = -1423361868;
                    }
                case 866468697:
                case 1652881750:
                    if (C1047.f3863 >= 0) {
                        m6981 = (C0630.m2566("ܰۤ") ^ i6) * (-15);
                        i7 = ((m6981 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    } else {
                        m6981 = (i6 - C2105.m6981("᩵۟")) * 5;
                        i7 = ((m6981 ^ i5) * (-10503)) ^ (-241245165);
                        i8 = -1353305712;
                    }
                case 1305133819:
                case 1420162477:
                    if (C0714.f2697 >= 0) {
                        m6981 = (C0630.m2566("ܰۤ") ^ i6) * (-15);
                        i7 = ((m6981 ^ i5) * (-10479)) ^ 433704104;
                        i8 = -592257502;
                    } else {
                        m6981 = C2105.m6981("ۢۘ") ^ i5;
                        i7 = ((m6981 ^ i6) * (-32131)) ^ (-1017275594);
                        i8 = -1137331416;
                    }
                case 1457866868:
                case 1728626777:
                    this.f17621 = i3;
                    return new RunnableC9949(this);
                case 1603440672:
                case 1863762831:
                    if (RunnableC0588.f2309 < 0) {
                        m6981 = C2105.m6981("᩺᩹") ^ i5;
                        i7 = ((m6981 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    } else {
                        m6981 = (C0630.m2566("ᩳܰ") ^ i5) * 77;
                        i7 = ((m6981 ^ i6) * (-29295)) ^ (-737178009);
                        i8 = 823336175;
                    }
                default:
                    i = this.f17621;
                    if (C1047.m3599() >= 0) {
                        m6981 = C2105.m6981("᩺᩹") ^ i5;
                        i7 = ((m6981 ^ i6) * 30577) ^ 2004471325;
                        i8 = -1290587944;
                    } else {
                        m6981 = C2105.m6981("ۘܶ") ^ i5;
                        i7 = ((m6981 ^ i6) * (-23379)) ^ 1452054658;
                        i8 = 1470178905;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16146() {
        int i = 0;
        int i2 = 0;
        int i3 = 1780370886;
        int i4 = C4075.f12947;
        int i5 = C7811.f24123;
        int m6981 = C2105.m6981("᩵ۡ") ^ i4;
        int i6 = ((m6981 ^ i5) * (-15399)) ^ (-1800380403);
        int i7 = -714445884;
        while (true) {
            i3 = ((((i3 ^ i5) * 27281) >> 31) & i6) ^ (m6981 ^ i7);
            switch (i3) {
                case -2027908881:
                case -1899830817:
                    if (C3663.f11553) {
                        m6981 = C0630.m2566("ᩴ᩸") ^ i4;
                        i6 = ((m6981 ^ i5) * (-14489)) ^ 1153674848;
                        i7 = 1499141595;
                    } else {
                        m6981 = (C2105.m6981("᩹ۘ") + i4) * 67;
                        i6 = ((m6981 ^ i5) * (-30949)) ^ 365861244;
                        i7 = 1897816460;
                    }
                case -1779431805:
                case -1045406647:
                    if (C0422.f1886 <= 0) {
                        m6981 = C0630.m2566("ᩴ᩸") ^ i4;
                        i6 = ((m6981 ^ i5) * (-14489)) ^ 1153674848;
                        i7 = 1499141595;
                    } else {
                        m6981 = (i5 - C0630.m2566("֡ۙ")) * (-19);
                        i6 = ((m6981 ^ i4) * 2559) ^ 1610716585;
                        i7 = 169245861;
                    }
                case -1523134444:
                case 739384368:
                    if (C1128.f4106 <= 0) {
                        m6981 = (C2105.m6981("֨᩹") ^ i5) * q.h;
                        i6 = ((m6981 ^ i4) * (-18507)) ^ (-2041892401);
                        i7 = -650053806;
                    } else {
                        m6981 = C2105.m6981("֡ᩳ") ^ i5;
                        i6 = ((m6981 ^ i4) * (-27267)) ^ (-1438047479);
                        i7 = 1060301930;
                    }
                case -1508035779:
                case 997642860:
                    C3683.m11222();
                    break;
                case -1320611832:
                case 1307653053:
                    if (C7106.f21815 != 0) {
                        m6981 = (i5 - C0630.m2566("᩺ܺ")) * (-31);
                        i6 = ((m6981 ^ i4) * (-10741)) ^ 1241398244;
                        i7 = -1363072812;
                    } else {
                        m6981 = C2105.m6981("᩵᩵") ^ i4;
                        i6 = ((m6981 ^ i5) * 5527) ^ 1581181453;
                        i7 = -1538636984;
                    }
                case -1106571597:
                case 1964240785:
                    this.f17621 = i + i2;
                    m16145();
                    break;
                case -1053250074:
                case -148277974:
                    if (C2105.f7037 != 0) {
                        m6981 = (C0630.m2566("᩷ۜ") ^ i5) * 33;
                        i6 = ((m6981 ^ i4) * 30609) ^ 1834468970;
                        i7 = -2083920023;
                    } else {
                        m6981 = C2105.m6981("֫۠") ^ i5;
                        i6 = ((m6981 ^ i4) * 30049) ^ 818783612;
                        i7 = -914925028;
                    }
                case -788313465:
                case 1027938618:
                    C4075.m12263();
                    m6981 = (C2105.m6981("֨᩹") ^ i5) * q.h;
                    i6 = ((m6981 ^ i4) * (-18507)) ^ (-2041892401);
                    i7 = -650053806;
                case -620934989:
                case 1288437346:
                    C7106.m19120();
                    if (C4263.f13799 <= 0) {
                        m6981 = (C0630.m2566("᩷ۜ") ^ i5) * 33;
                        i6 = ((m6981 ^ i4) * 30609) ^ 1834468970;
                        i7 = -2083920023;
                    } else {
                        m6981 = (i4 - C2105.m6981("᩶ۤ")) * (-11);
                        i6 = ((m6981 ^ i5) * (-28415)) ^ (-1698992312);
                        i7 = 1009590037;
                    }
                case -431910021:
                case 1941592363:
                    C1294.m4372();
                    if (C2126.m7040()) {
                        m6981 = C0630.m2566("ᩴ᩸") ^ i4;
                        i6 = ((m6981 ^ i5) * (-14489)) ^ 1153674848;
                        i7 = 1499141595;
                    } else {
                        m6981 = (C2105.m6981("֨᩹") ^ i5) * q.h;
                        i6 = ((m6981 ^ i4) * (-18507)) ^ (-2041892401);
                        i7 = -650053806;
                    }
                case -272728550:
                case 404019623:
                    C7811.m20844();
                    if (C3683.m11222()) {
                        m6981 = (C0630.m2566("᩷ۜ") ^ i5) * 33;
                        i6 = ((m6981 ^ i4) * 30609) ^ 1834468970;
                        i7 = -2083920023;
                    } else {
                        m6981 = (C2105.m6981("֨᩹") ^ i5) * q.h;
                        i6 = ((m6981 ^ i4) * (-18507)) ^ (-2041892401);
                        i7 = -650053806;
                    }
                case -172570696:
                case 937537037:
                    i2 = -1;
                    if (C3746.f11829 <= 0) {
                        m6981 = (i5 - C0630.m2566("᩺ܺ")) * (-31);
                        i6 = ((m6981 ^ i4) * (-10741)) ^ 1241398244;
                        i7 = -1363072812;
                    } else {
                        m6981 = (C2105.m6981("֨᩺") + i4) * 23;
                        i6 = ((m6981 ^ i5) * (-31379)) ^ (-719787185);
                        i7 = -28593419;
                    }
                case 464446612:
                case 1288027112:
                    if (C4075.f12947 >= 0) {
                        m6981 = C0630.m2566("ᩴ᩸") ^ i4;
                        i6 = ((m6981 ^ i5) * (-14489)) ^ 1153674848;
                        i7 = 1499141595;
                    } else {
                        m6981 = C2105.m6981("ۗ᩸") ^ i4;
                        i6 = ((m6981 ^ i5) * (-19901)) ^ 279130735;
                        i7 = -978662172;
                    }
                case 933010479:
                case 1497830188:
                    if (C0422.f1886 <= 0) {
                        m6981 = (i5 - C0630.m2566("᩺ܺ")) * (-31);
                        i6 = ((m6981 ^ i4) * (-10741)) ^ 1241398244;
                        i7 = -1363072812;
                    } else {
                        m6981 = (C0630.m2566("ᩳ۫") ^ i5) * (-101);
                        i6 = ((m6981 ^ i4) * (-29661)) ^ (-1572986942);
                        i7 = 1057677821;
                    }
                case 1710504824:
                case 2022123982:
                    if (C0050.f910 >= 0) {
                        m6981 = (C2105.m6981("֨᩹") ^ i5) * q.h;
                        i6 = ((m6981 ^ i4) * (-18507)) ^ (-2041892401);
                        i7 = -650053806;
                    } else {
                        m6981 = C2105.m6981("ܽۜ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-11583)) ^ (-669997917);
                        i7 = -786635317;
                    }
                default:
                    i = this.f17621;
                    if (C7106.f21815 != 0) {
                        m6981 = (C0630.m2566("᩷ۜ") ^ i5) * 33;
                        i6 = ((m6981 ^ i4) * 30609) ^ 1834468970;
                        i7 = -2083920023;
                    } else {
                        m6981 = (C0630.m2566("ܿܺ") ^ i5) * 3;
                        i6 = ((m6981 ^ i4) * (-1259)) ^ 1682517376;
                        i7 = 243172160;
                    }
            }
            return;
        }
    }

    @Override // l.InterfaceC8085
    /* renamed from: ۧ */
    public final void mo6025(InterfaceC23586 interfaceC23586) {
        m16145();
    }

    @Override // l.InterfaceC8085
    /* renamed from: ܽ */
    public final void mo6027(InterfaceC23586 interfaceC23586) {
        View view = null;
        int i = -538671467;
        int i2 = C4263.f13799;
        int i3 = C1128.f4106;
        int m6981 = (i3 - C2105.m6981("ܺ֡")) * 25;
        int i4 = ((m6981 ^ i2) * 19853) ^ 1956256893;
        int i5 = 1852708358;
        while (true) {
            i = ((((i ^ i2) * 21421) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2054470088:
                case 1992791479:
                    if (RunnableC1108.f4040) {
                        m6981 = C2105.m6981("ۨۡ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-25533)) ^ 1950176769;
                        i5 = -1824823740;
                    } else {
                        m6981 = C0630.m2566("ۨ᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * (-18165)) ^ (-1226061810);
                        i5 = -854501417;
                    }
                case -2048938420:
                case 1087570223:
                    if (C22628.f73083 <= 0) {
                        m6981 = (C0630.m2566("ܺᩴ") + i2) * 77;
                        i4 = ((m6981 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        m6981 = C2105.m6981("ۢۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-18203)) ^ 1465714789;
                        i5 = 2132518265;
                    }
                case -1782264858:
                case 439846571:
                    if (C3245.f10203 <= 0) {
                        m6981 = (C0630.m2566("ܺᩴ") + i2) * 77;
                        i4 = ((m6981 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        m6981 = C0630.m2566("ۤۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * 12393) ^ 1362828384;
                        i5 = -1311263897;
                    }
                case -1681932939:
                case -1044941825:
                    if (C0630.f2410 <= 0) {
                        m6981 = (C0630.m2566("۟ܶ") ^ i3) * (-65);
                        i4 = ((m6981 ^ i2) * 14131) ^ 1958739787;
                        i5 = -1558128367;
                    } else {
                        m6981 = C0630.m2566("ۜۡ") ^ i3;
                        i4 = ((m6981 ^ i2) * 13585) ^ (-1820949018);
                        i5 = -1510919578;
                    }
                case -1384780245:
                case -885694600:
                    view = this.f17624;
                    if (C0422.f1886 <= 0) {
                        m6981 = (C0630.m2566("ۢۢ") + i2) * (-15);
                        i4 = ((m6981 ^ i3) * (-25873)) ^ 1236766795;
                        i5 = -1419857135;
                    } else {
                        m6981 = (C2105.m6981("۟۠") + i2) * 9;
                        i4 = ((m6981 ^ i3) * 293) ^ 798601563;
                        i5 = 10670036;
                    }
                case -1163902145:
                case 1908747551:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = (C0630.m2566("ܺᩴ") + i2) * 77;
                        i4 = ((m6981 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        m6981 = C2105.m6981("ܽܿ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-6191)) ^ 1005341855;
                        i5 = -912736132;
                    }
                case -1055121386:
                case 2074390635:
                    if (C3746.f11829 <= 0) {
                        m6981 = (C0630.m2566("ܺᩴ") + i2) * 77;
                        i4 = ((m6981 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        m6981 = C2105.m6981("ۛ۬") ^ i2;
                        i4 = ((m6981 ^ i3) * (-12109)) ^ 1356278408;
                        i5 = -361755387;
                    }
                case -672669051:
                case -529820989:
                    view.removeCallbacks(this.f17622);
                    break;
                case -567476388:
                case 1397969335:
                    if (C2272.f7362) {
                        m6981 = (C0630.m2566("۟ܶ") ^ i3) * (-65);
                        i4 = ((m6981 ^ i2) * 14131) ^ 1958739787;
                        i5 = -1558128367;
                    } else {
                        m6981 = C2105.m6981("᩸ۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-1237)) ^ (-289535181);
                        i5 = -1500618802;
                    }
                case -125661443:
                case 804443108:
                    C4117.m12364();
                    if (RunnableC1108.f4040) {
                        m6981 = (C0630.m2566("ܰܳ") + i3) * (-51);
                        i4 = ((m6981 ^ i2) * (-14327)) ^ (-492976067);
                        i5 = 479126599;
                    } else {
                        m6981 = C0630.m2566("ۨ᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * (-18165)) ^ (-1226061810);
                        i5 = -854501417;
                    }
                case -112357776:
                case 939951035:
                    C3683.m11222();
                    break;
                case 880228592:
                case 1969552720:
                    if (C0237.f1507 != 0) {
                        m6981 = C0630.m2566("ۨ᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * (-18165)) ^ (-1226061810);
                        i5 = -854501417;
                    } else {
                        m6981 = (C0630.m2566("ܺᩴ") + i2) * 77;
                        i4 = ((m6981 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    }
                case 1121364306:
                case 1171398137:
                    C4075.m12263();
                    if (C0382.f1805) {
                        m6981 = (C0630.m2566("۟ܶ") ^ i3) * (-65);
                        i4 = ((m6981 ^ i2) * 14131) ^ 1958739787;
                        i5 = -1558128367;
                    } else {
                        m6981 = (C0630.m2566("ܰܳ") + i3) * (-51);
                        i4 = ((m6981 ^ i2) * (-14327)) ^ (-492976067);
                        i5 = 479126599;
                    }
                case 1225839368:
                case 2006941428:
                    if (C0382.f1805) {
                        m6981 = C2105.m6981("֫᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * 15639) ^ (-1443731687);
                        i5 = -1583863582;
                    } else {
                        m6981 = (C0630.m2566("ܰܳ") + i3) * (-51);
                        i4 = ((m6981 ^ i2) * (-14327)) ^ (-492976067);
                        i5 = 479126599;
                    }
                case 1359627464:
                case 1494729258:
                    C1916.m6308();
                    C2272.m7503();
                    m6981 = C0630.m2566("ۨ᩷") ^ i2;
                    i4 = ((m6981 ^ i3) * (-18165)) ^ (-1226061810);
                    i5 = -854501417;
                default:
                    if (C2958.m9034() <= 0) {
                        m6981 = (C0630.m2566("ܺᩴ") + i2) * 77;
                        i4 = ((m6981 ^ i3) * 1737) ^ 2010933403;
                        i5 = 947992903;
                    } else {
                        m6981 = (i2 - C0630.m2566("᩺ۗ")) * (-69);
                        i4 = ((m6981 ^ i3) * 16757) ^ 1592597462;
                        i5 = -1529546586;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (l.C3245.m9925() == 0) goto L21;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m16140(final l.C5715 r29) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5715.m16140(l.ۛ֡᩷):void");
    }
}
