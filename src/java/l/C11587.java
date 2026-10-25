package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* compiled from: 77J6 */
/* renamed from: l.ۨ۠᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11587 extends AbstractC19902 {

    /* renamed from: ܽ֫ܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f34542 = {8014, -23072, -31776, -23643, 21543, 17250, 24159, 16405, -19787, -16738, 3757, -22175, -22181, -22182, -22206, -22201, -22208, -22197, -22198, -22168, -22201, -22206, -22206, -22197, -22198};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ActivityC13702 f34543;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f34544;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f34545;

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater;
        short[] sArr;
        int m2566;
        int i2;
        int m25662;
        int i3;
        int i4;
        short s;
        LayoutInflater layoutInflater2;
        int m6981;
        int i5;
        int i6;
        int i7 = 34072591;
        int i8 = C0483.f2088;
        int i9 = RunnableC0588.f2309;
        int m25663 = (i8 - C0630.m2566("᩵ۨ")) * (-103);
        int i10 = ((m25663 ^ i9) * 5095) ^ 1534488043;
        int i11 = m25663 ^ (-1555664102);
        String str = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        LayoutInflater layoutInflater3 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        short s2 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        ImageView imageView = null;
        C22875 c22875 = null;
        View view = null;
        int i20 = 0;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i9) * (-9011)) >> 31));
            switch (i7) {
                case -1910318224:
                case -1168306976:
                    c22875.f73796 = imageView;
                    sArr5 = f34542;
                    i14 = 7;
                    if (C1773.f6144 <= 0) {
                        layoutInflater = layoutInflater3;
                        s = s2;
                        m2566 = (i8 - C0630.m2566("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((m2566 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater2 = layoutInflater;
                        i11 = m2566 ^ i2;
                        layoutInflater3 = layoutInflater2;
                    } else {
                        m6981 = (i8 - C2105.m6981("۟ܳ")) * 95;
                        i5 = ((m6981 ^ i9) * (-16401)) ^ (-783327277);
                        i6 = -874426118;
                        i11 = m6981 ^ i6;
                        i10 = i5;
                    }
                case -1868675198:
                case -1123814048:
                    RunnableC0588.m2441();
                    layoutInflater = layoutInflater3;
                    s = s2;
                    m2566 = (i8 - C0630.m2566("֡᩺")) * 7;
                    s2 = s;
                    i10 = ((m2566 ^ i9) * 17573) ^ 704786823;
                    i2 = -1466304249;
                    layoutInflater2 = layoutInflater;
                    i11 = m2566 ^ i2;
                    layoutInflater3 = layoutInflater2;
                case -1784779420:
                case 1850815240:
                    view = layoutInflater3.inflate(i20, viewGroup, false);
                    c22875 = new C22875(view);
                    sArr4 = f34542;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        sArr = sArr2;
                        int m69812 = C2105.m6981("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((m69812 ^ i9) * (-485)) ^ (-275138685);
                        i11 = m69812 ^ 1646500092;
                    } else {
                        m25662 = (i9 - C2105.m6981("ܳ᩺")) * 25;
                        layoutInflater = layoutInflater3;
                        i3 = ((m25662 ^ i8) * (-705)) ^ 1977852656;
                        i4 = -1485850282;
                        layoutInflater2 = layoutInflater;
                        i11 = m25662 ^ i4;
                        i10 = i3;
                        layoutInflater3 = layoutInflater2;
                    }
                case -1768313280:
                case -1248607417:
                    C0964.m3413();
                    if (C4263.m12819() < 0) {
                        layoutInflater = layoutInflater3;
                        s = s2;
                        m2566 = (i8 - C0630.m2566("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((m2566 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater2 = layoutInflater;
                        i11 = m2566 ^ i2;
                        layoutInflater3 = layoutInflater2;
                    } else {
                        sArr = sArr2;
                        int m698122 = C2105.m6981("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((m698122 ^ i9) * (-485)) ^ (-275138685);
                        i11 = m698122 ^ 1646500092;
                    }
                case -1722590614:
                case 1683179448:
                    layoutInflater = layoutInflater3;
                    sArr = f34542;
                    if (C1773.f6144 <= 0) {
                        layoutInflater3 = layoutInflater;
                        int m6981222 = C2105.m6981("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((m6981222 ^ i9) * (-485)) ^ (-275138685);
                        i11 = m6981222 ^ 1646500092;
                    } else {
                        m2566 = C0630.m2566("ܶ᩸") ^ i9;
                        sArr2 = sArr;
                        i10 = ((m2566 ^ i8) * 597) ^ 1373867854;
                        i2 = 1282311878;
                        layoutInflater2 = layoutInflater;
                        i11 = m2566 ^ i2;
                        layoutInflater3 = layoutInflater2;
                    }
                case -1640229229:
                case -251486655:
                    layoutInflater3 = LayoutInflater.from(this.f34543);
                    sArr3 = f34542;
                    i19 = 3;
                    if (C2105.m6982() != 0) {
                        sArr = sArr2;
                        i16 = 1;
                        int m69812222 = C2105.m6981("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((m69812222 ^ i9) * (-485)) ^ (-275138685);
                        i11 = m69812222 ^ 1646500092;
                    } else {
                        int m25664 = (C0630.m2566("ۛۘ") ^ i8) * 51;
                        int i21 = ((m25664 ^ i9) * 879) ^ 1400454448;
                        i11 = m25664 ^ 107810126;
                        i10 = i21;
                        i16 = 1;
                    }
                case -1556234773:
                case -1318575551:
                    C1711.m5736();
                    RunnableC1108.m3790();
                    return null;
                case -1528544470:
                case -1295211809:
                    if (C1294.m4372() <= 0) {
                        m6981 = (i8 - C0630.m2566("ۙۧ")) * 31;
                        i5 = ((m6981 ^ i9) * 25067) ^ 1139122449;
                        i6 = -772838464;
                        i11 = m6981 ^ i6;
                        i10 = i5;
                    }
                    m6981 = (i9 - C2105.m6981("۟᩺")) * 63;
                    i5 = ((m6981 ^ i8) * 19789) ^ (-884421052);
                    i6 = 1917932172;
                    i11 = m6981 ^ i6;
                    i10 = i5;
                case -1360253026:
                case 876780955:
                    str = C3683.m11225(sArr4, 4, 3, i15);
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = (C2105.m6981("ܰᩴ") + i9) * 109;
                        i5 = ((m6981 ^ i8) * 29987) ^ (-1423716567);
                        i6 = 578379176;
                    } else {
                        m6981 = (C2105.m6981("۬ܶ") ^ i8) * 23;
                        i5 = ((m6981 ^ i9) * 29749) ^ 140282619;
                        i6 = 1806359949;
                    }
                    i11 = m6981 ^ i6;
                    i10 = i5;
                case -1307760413:
                case -711621781:
                    layoutInflater = layoutInflater3;
                    s2 = sArr2[0];
                    if (C1128.f4106 <= 0) {
                        sArr = sArr2;
                        layoutInflater3 = layoutInflater;
                        int m698122222 = C2105.m6981("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((m698122222 ^ i9) * (-485)) ^ (-275138685);
                        i11 = m698122222 ^ 1646500092;
                    } else {
                        m25662 = C0630.m2566("ۧۙ") ^ i8;
                        i3 = ((m25662 ^ i9) * 8049) ^ 1048152478;
                        i4 = -205055281;
                        layoutInflater2 = layoutInflater;
                        i11 = m25662 ^ i4;
                        i10 = i3;
                        layoutInflater3 = layoutInflater2;
                    }
                case -973332431:
                case 656595646:
                    c22875.f73797 = (TextView) C1005.m3507(view, i12 ^ i13);
                    return c22875;
                case -856057509:
                case 2077877963:
                    layoutInflater = layoutInflater3;
                    if ((i18 + 93857344) - i17 < 0) {
                        m25662 = (C2105.m6981("ܽ۠") + i8) * 115;
                        i3 = ((m25662 ^ i9) * 24371) ^ 761753804;
                        i4 = -1782450103;
                    } else {
                        m25662 = (i9 - C0630.m2566("ۡۨ")) * q.h;
                        i3 = ((m25662 ^ i8) * (-6149)) ^ (-1992615798);
                        i4 = 1385754823;
                    }
                    layoutInflater2 = layoutInflater;
                    i11 = m25662 ^ i4;
                    i10 = i3;
                    layoutInflater3 = layoutInflater2;
                case -768210599:
                case 1738232450:
                    imageView = (ImageView) C1005.m3507(view, C2105.m6981(str) ^ 2097659380);
                    if (C5695.f17556 >= 0) {
                        layoutInflater = layoutInflater3;
                        s = s2;
                        m2566 = (i8 - C0630.m2566("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((m2566 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater2 = layoutInflater;
                        i11 = m2566 ^ i2;
                        layoutInflater3 = layoutInflater2;
                    } else {
                        m6981 = C2105.m6981("ܽ᩺") ^ i9;
                        i5 = ((m6981 ^ i8) * 21241) ^ 123506041;
                        i6 = 400154114;
                        i11 = m6981 ^ i6;
                        i10 = i5;
                    }
                case -725371893:
                case -337212714:
                    if (C3663.f11553) {
                        m6981 = (i9 - C2105.m6981("۟᩺")) * 63;
                        i5 = ((m6981 ^ i8) * 19789) ^ (-884421052);
                        i6 = 1917932172;
                        i11 = m6981 ^ i6;
                        i10 = i5;
                    } else {
                        sArr = sArr2;
                        int m6981222222 = C2105.m6981("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((m6981222222 ^ i9) * (-485)) ^ (-275138685);
                        i11 = m6981222222 ^ 1646500092;
                    }
                case -703591457:
                case 1920476404:
                    layoutInflater = layoutInflater3;
                    int i22 = i19;
                    i20 = 2126894844 ^ C0630.m2566(ServiceConnectionC3453.m10568(sArr3, i16, i22, i15));
                    if (C1294.f4556 >= 0) {
                        i19 = i22;
                        layoutInflater3 = layoutInflater;
                        sArr = sArr2;
                        int m69812222222 = C2105.m6981("᩷ܶ") ^ i8;
                        sArr2 = sArr;
                        i10 = ((m69812222222 ^ i9) * (-485)) ^ (-275138685);
                        i11 = m69812222222 ^ 1646500092;
                    } else {
                        m2566 = C0630.m2566("ܿ֨") ^ i9;
                        i19 = i22;
                        i10 = ((m2566 ^ i8) * 11875) ^ (-1077062173);
                        i2 = -139842834;
                        layoutInflater2 = layoutInflater;
                        i11 = m2566 ^ i2;
                        layoutInflater3 = layoutInflater2;
                    }
                case -490219686:
                case 103441195:
                    i12 = C0630.m2566(C0483.m2128(sArr5, i14, 3, i15));
                    i13 = 2101233296;
                    if (C1294.f4556 >= 0) {
                        layoutInflater = layoutInflater3;
                        s = s2;
                        m2566 = (i8 - C0630.m2566("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((m2566 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater2 = layoutInflater;
                        i11 = m2566 ^ i2;
                        layoutInflater3 = layoutInflater2;
                    } else {
                        m6981 = C2105.m6981("ۡۧ") ^ i9;
                        i5 = ((m6981 ^ i8) * 7257) ^ (-1396371851);
                        i6 = -1093011145;
                        i11 = m6981 ^ i6;
                        i10 = i5;
                    }
                case -134407220:
                case 2100865455:
                    layoutInflater = layoutInflater3;
                    i15 = 54040;
                    m2566 = C0630.m2566("۫ۢ") ^ i9;
                    i10 = ((m2566 ^ i8) * 26087) ^ 1011228079;
                    i2 = 1761197241;
                    layoutInflater2 = layoutInflater;
                    i11 = m2566 ^ i2;
                    layoutInflater3 = layoutInflater2;
                case 753176606:
                case 1767573278:
                    layoutInflater = layoutInflater3;
                    s = s2;
                    int i23 = s * 19376;
                    i18 = s * s;
                    if (C3746.m11369() >= 0) {
                        i17 = i23;
                        m2566 = (i8 - C0630.m2566("֡᩺")) * 7;
                        s2 = s;
                        i10 = ((m2566 ^ i9) * 17573) ^ 704786823;
                        i2 = -1466304249;
                        layoutInflater2 = layoutInflater;
                        i11 = m2566 ^ i2;
                        layoutInflater3 = layoutInflater2;
                    } else {
                        s2 = s;
                        m25662 = C2105.m6981("ۗ۠") ^ i8;
                        i17 = i23;
                        i3 = ((m25662 ^ i9) * 25359) ^ 1818365851;
                        i4 = 333059505;
                        layoutInflater2 = layoutInflater;
                        i11 = m25662 ^ i4;
                        i10 = i3;
                        layoutInflater3 = layoutInflater2;
                    }
                default:
                    layoutInflater = layoutInflater3;
                    i15 = 52187;
                    m2566 = C0630.m2566("۫ۢ") ^ i9;
                    i10 = ((m2566 ^ i8) * 26087) ^ 1011228079;
                    i2 = 1761197241;
                    layoutInflater2 = layoutInflater;
                    i11 = m2566 ^ i2;
                    layoutInflater3 = layoutInflater2;
            }
        }
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C22875 c22875 = null;
        List list = null;
        String str = null;
        C15518 c15518 = null;
        int i2 = 441538440;
        int i3 = C3911.f12484;
        int i4 = C0630.f2410;
        int m2566 = C0630.m2566("᩹֡") ^ i3;
        int i5 = ((m2566 ^ i4) * (-3869)) ^ (-1259797156);
        int i6 = -995219087;
        while (true) {
            i2 = ((((i2 ^ i4) * (-29065)) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -2013108702:
                case 53440574:
                    if (C0964.m3413()) {
                        m2566 = C0630.m2566("ۖۖ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-16457)) ^ (-1418277279);
                        i6 = -756145466;
                    } else {
                        m2566 = C0630.m2566("᩺ۤ") ^ i4;
                        i5 = ((m2566 ^ i3) * 2767) ^ 466508744;
                        i6 = 379137946;
                    }
                case -2007099584:
                case -1539149260:
                    if (C0050.f910 >= 0) {
                        m2566 = C2105.m6981("᩷ۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    } else {
                        m2566 = C0630.m2566("ۛᩴ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-6385)) ^ (-156213838);
                        i6 = -1463036483;
                    }
                case -1993064899:
                case -799676722:
                    C2520.m8026();
                    if (C0630.f2410 <= 0) {
                        m2566 = C0630.m2566("᩺ۤ") ^ i4;
                        i5 = ((m2566 ^ i3) * 2767) ^ 466508744;
                        i6 = 379137946;
                    } else {
                        m2566 = C2105.m6981("ܽᩳ") ^ i3;
                        i5 = ((m2566 ^ i4) * 41) ^ (-1485797000);
                        i6 = 951550706;
                    }
                case -1976159635:
                case 519090727:
                    if (C0050.m940() <= 0) {
                        m2566 = C2105.m6981("᩷ۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    } else {
                        m2566 = C2105.m6981("ۛۡ") ^ i3;
                        i5 = ((m2566 ^ i4) * 23911) ^ (-2112693430);
                        i6 = 865106300;
                    }
                case -1896639938:
                case 1191927762:
                    C0714.m2805();
                    break;
                case -1585549913:
                case 437071622:
                    if (C2167.m7155()) {
                        m2566 = C2105.m6981("ۛ֡") ^ i3;
                        i5 = ((m2566 ^ i4) * 12465) ^ 15642121;
                        i6 = 1745907213;
                    } else {
                        m2566 = (C2105.m6981("ۚ֨") + i4) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i5 = ((m2566 ^ i3) * 11089) ^ 118285058;
                        i6 = -1538978693;
                    }
                case -1536636138:
                case -713849841:
                    if (C22628.f73083 <= 0) {
                        m2566 = C2105.m6981("ܽᩳ") ^ i3;
                        i5 = ((m2566 ^ i4) * 41) ^ (-1485797000);
                        i6 = 951550706;
                    } else {
                        m2566 = C0630.m2566("۟᩸") ^ i3;
                        i5 = ((m2566 ^ i4) * (-29471)) ^ 921606029;
                        i6 = 322035956;
                    }
                case -1466346578:
                case 409092655:
                    str = (String) C21923.m49339(list, i);
                    c15518 = C20459.m46859(str, this.f34544);
                    if (c15518 != null) {
                        m2566 = C2105.m6981("ܳ۫") ^ i3;
                        i5 = ((m2566 ^ i4) * 17685) ^ (-766446317);
                        i6 = -25954131;
                    } else {
                        m2566 = (i4 - C0630.m2566("۬᩺")) * q.h;
                        i5 = ((m2566 ^ i3) * 10663) ^ 911814761;
                        i6 = 1412003553;
                    }
                case -687599841:
                case 1151287260:
                    if (C2520.f8000 >= 0) {
                        m2566 = C0630.m2566("᩺ۤ") ^ i4;
                        i5 = ((m2566 ^ i3) * 2767) ^ 466508744;
                        i6 = 379137946;
                    } else {
                        m2566 = (i3 - C2105.m6981("֫ܺ")) * (-39);
                        i5 = ((m2566 ^ i4) * 609) ^ (-1318047227);
                        i6 = -741565161;
                    }
                case -644120597:
                case 331765689:
                    c22875.f73796.setImageDrawable(c15518);
                    C1047.m3601(c22875.f73797, str);
                    break;
                case -564896207:
                case 1350014724:
                    if (C2958.f9394 >= 0) {
                        m2566 = C2105.m6981("ۛ֡") ^ i3;
                        i5 = ((m2566 ^ i4) * 12465) ^ 15642121;
                        i6 = 1745907213;
                    } else {
                        m2566 = C0630.m2566("᩺ۤ") ^ i4;
                        i5 = ((m2566 ^ i3) * 2767) ^ 466508744;
                        i6 = 379137946;
                    }
                case -474936777:
                case -402685312:
                    C0630.m2564();
                    m2566 = C2105.m6981("ۛ֡") ^ i3;
                    i5 = ((m2566 ^ i4) * 12465) ^ 15642121;
                    i6 = 1745907213;
                case -288098732:
                case 5082145:
                    if (C0798.f2919) {
                        m2566 = C2105.m6981("᩷ۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    } else {
                        m2566 = (C2105.m6981("۠᩵") + i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i5 = ((m2566 ^ i3) * (-18393)) ^ 777304792;
                        i6 = 1616528299;
                    }
                case -170776168:
                case 351616255:
                    c22875 = (C22875) abstractC3255;
                    list = this.f34545;
                    if (C3663.m11168() >= 0) {
                        m2566 = C2105.m6981("ܽۛ") ^ i3;
                        i5 = ((m2566 ^ i4) * 24135) ^ (-1619247416);
                        i6 = 1876426518;
                    } else {
                        m2566 = C2105.m6981("᩺ۖ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-23831)) ^ 478146022;
                        i6 = 1121031925;
                    }
                case 340972948:
                case 412104864:
                    c15518.setColorFilter(C14096.m33704(C21943.f70284));
                    m2566 = (i4 - C0630.m2566("۬᩺")) * q.h;
                    i5 = ((m2566 ^ i3) * 10663) ^ 911814761;
                    i6 = 1412003553;
                case 957780457:
                case 1277885302:
                    if (C4159.f13567) {
                        m2566 = C2105.m6981("᩷ۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    } else {
                        m2566 = C2105.m6981("ۛ֡") ^ i3;
                        i5 = ((m2566 ^ i4) * 12465) ^ 15642121;
                        i6 = 1745907213;
                    }
                case 1311251793:
                case 1365768213:
                    if (C3432.f10845 >= 0) {
                        m2566 = C2105.m6981("᩷ۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 23497) ^ (-1512622553);
                        i6 = -1119070587;
                    } else {
                        m2566 = (C2105.m6981("ۧۗ") ^ i4) * (-97);
                        i5 = ((m2566 ^ i3) * 18181) ^ (-638937999);
                        i6 = 688539207;
                    }
                default:
                    if (C0237.m1481() >= 0) {
                        m2566 = C2105.m6981("ܽᩳ") ^ i3;
                        i5 = ((m2566 ^ i4) * 41) ^ (-1485797000);
                        i6 = 951550706;
                    } else {
                        m2566 = C2105.m6981("ۡܿ") ^ i3;
                        i5 = ((m2566 ^ i4) * 29701) ^ (-398160064);
                        i6 = -51456659;
                    }
            }
            return;
        }
    }

    public C11587(ActivityC13702 activityC13702) {
        boolean z = false;
        int i = -102936173;
        int i2 = C0422.f1886;
        int i3 = C11340.f33930;
        int m6981 = C2105.m6981("ܺ۫") ^ i3;
        int i4 = ((m6981 ^ i2) * (-16237)) ^ (-78676878);
        int i5 = 1766585176;
        while (true) {
            i = ((((i ^ i2) * 10665) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2090721733:
                case 407622122:
                    this.f34544 = z;
                    if (C1773.f6144 <= 0) {
                        m6981 = (C2105.m6981("ۨ۫") ^ i3) * (-19);
                        i4 = ((m6981 ^ i2) * 22123) ^ (-694551056);
                        i5 = -1928847324;
                    } else {
                        m6981 = C2105.m6981("ܺܳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 9339) ^ (-747652043);
                        i5 = 1872602388;
                    }
                case -1734482502:
                case -1661392664:
                    C7106.m19120();
                    if (C0630.f2410 > 0) {
                        m6981 = C0630.m2566("ۛ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    } else {
                        m6981 = (i2 - C2105.m6981("᩶᩶")) * 87;
                        i4 = ((m6981 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    }
                case -1204622577:
                case 192818359:
                    if (C0237.f1507 != 0) {
                        m6981 = C0630.m2566("ۛ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    } else {
                        m6981 = C2105.m6981("ᩳۙ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-19437)) ^ (-1790701100);
                        i5 = 557841492;
                    }
                case -1145608943:
                case -4301880:
                    this.f34545 = C20459.m46861();
                    return;
                case -1117703531:
                case 1950700995:
                    this.f34543 = activityC13702;
                    z = true;
                    if (C3537.f11231 >= 0) {
                        m6981 = (C2105.m6981("᩺۫") ^ i2) * (-13);
                        i4 = ((m6981 ^ i3) * 7645) ^ (-1953068042);
                        i5 = 1498519748;
                    } else {
                        m6981 = C2105.m6981("ܳᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-18303)) ^ (-729405979);
                        i5 = -1092028561;
                    }
                case -860801645:
                case 1532403998:
                    if (C2958.m9034() <= 0) {
                        m6981 = C0630.m2566("ۛ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    } else {
                        m6981 = (i3 - C0630.m2566("۠֫")) * 65;
                        i4 = ((m6981 ^ i2) * 12179) ^ (-279908806);
                        i5 = -394175569;
                    }
                case -760668954:
                case 970425747:
                    if (C4159.f13567) {
                        m6981 = C2105.m6981("᩻֨") ^ i2;
                        i4 = ((m6981 ^ i3) * 22883) ^ 1497104833;
                        i5 = -1685428297;
                    } else {
                        m6981 = (i2 - C2105.m6981("᩶᩶")) * 87;
                        i4 = ((m6981 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    }
                case -497047156:
                case 1853463070:
                    if (C1504.m5179()) {
                        m6981 = C0630.m2566("ܿᩴ") ^ i2;
                        i4 = ((m6981 ^ i3) * 13325) ^ (-2118571647);
                        i5 = 1191866561;
                    } else {
                        m6981 = (i2 - C2105.m6981("᩶᩶")) * 87;
                        i4 = ((m6981 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    }
                case -446674988:
                case 1706358238:
                    C1504.m5179();
                    C3019.m9255();
                    throw new RuntimeException();
                case -406908600:
                case 378212869:
                    if (C0630.f2410 <= 0) {
                        m6981 = (C2105.m6981("ۨ۫") ^ i3) * (-19);
                        i4 = ((m6981 ^ i2) * 22123) ^ (-694551056);
                        i5 = -1928847324;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۨ᩷")) * 27;
                        i4 = ((m6981 ^ i2) * 18503) ^ 1151284618;
                        i5 = -664129744;
                    }
                case 125323275:
                case 1791109619:
                    if (C7106.f21815 != 0) {
                        m6981 = (C2105.m6981("ۨ۫") ^ i3) * (-19);
                        i4 = ((m6981 ^ i2) * 22123) ^ (-694551056);
                        i5 = -1928847324;
                    } else {
                        m6981 = (C0630.m2566("ۛۘ") ^ i2) * 39;
                        i4 = ((m6981 ^ i3) * (-7443)) ^ (-941141174);
                        i5 = 700161928;
                    }
                case 276740916:
                case 922563358:
                    if (C1005.f3721) {
                        m6981 = (C2105.m6981("֨᩶") + i2) * (-71);
                        i4 = ((m6981 ^ i3) * 24213) ^ 314877386;
                        i5 = -248028193;
                    } else {
                        m6981 = (i2 - C2105.m6981("᩶᩶")) * 87;
                        i4 = ((m6981 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    }
                case 518573991:
                case 824959322:
                    C0798.m2998();
                    m6981 = (C2105.m6981("᩺۫") ^ i2) * (-13);
                    i4 = ((m6981 ^ i3) * 7645) ^ (-1953068042);
                    i5 = 1498519748;
                case 895993469:
                case 1765916339:
                    if (C22628.f73083 <= 0) {
                        m6981 = (C2105.m6981("᩺۫") ^ i2) * (-13);
                        i4 = ((m6981 ^ i3) * 7645) ^ (-1953068042);
                        i5 = 1498519748;
                    } else {
                        m6981 = C0630.m2566("ۛ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    }
                case 1608632533:
                case 1685181532:
                    if (C0714.f2697 >= 0) {
                        m6981 = (i2 - C2105.m6981("᩶᩶")) * 87;
                        i4 = ((m6981 ^ i3) * (-13199)) ^ 243782453;
                        i5 = 1135854698;
                    } else {
                        m6981 = (i3 - C0630.m2566("֫ۘ")) * (-45);
                        i4 = ((m6981 ^ i2) * (-25933)) ^ 955802489;
                        i5 = -270430173;
                    }
                default:
                    if (C3537.f11231 < 0) {
                        m6981 = C0630.m2566("ۛ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * (-9705)) ^ (-2062992073);
                        i5 = -452908899;
                    } else {
                        m6981 = C2105.m6981("ۨ۬") ^ i3;
                        i4 = ((m6981 ^ i2) * 389) ^ 641384143;
                        i5 = 1221841616;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (l.C1128.f4106 > 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0054, code lost:
    
        if (l.C3911.f12484 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        if (l.C2167.f7158 >= 0) goto L18;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m28481() {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11587.m28481():void");
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return C4159.m12563(this.f34545);
    }
}
