package l;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import bin.mt.plus.Main;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.concurrent.ExecutorService;

/* compiled from: V6B4 */
/* renamed from: l.᩶۠᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20054 extends AbstractC20121 {

    /* renamed from: ۘۙ۟, reason: not valid java name and contains not printable characters */
    private static final short[] f64968 = {4592, 4092, -2534, 5875, 6761, 6134, -3051, -3021, 5298, 27723, 30561, -17588, 29860, -29846, -26976};

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9503 f64969;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f64970;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AccelerateInterpolator f64971;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f64972;

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerSlide(View view, float f) {
        int i;
        int i2;
        int m6981;
        int i3;
        C13064 c13064;
        int i4;
        int i5;
        short[] sArr;
        int i6;
        int m2566;
        int i7;
        int i8;
        int i9;
        int m69812;
        int i10;
        int i11;
        C13064 c130642;
        C20054 c20054 = this;
        View view2 = view;
        int i12 = C1773.f6144;
        int i13 = RunnableC0588.f2309;
        int m69813 = (i13 - C2105.m6981("᩹ۖ")) * (-45);
        int i14 = ((m69813 ^ i12) * (-2709)) ^ (-1552285130);
        Main main = null;
        C9762 c9762 = null;
        C9503 c9503 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i15 = m69813 ^ (-1882982983);
        int i16 = 0;
        boolean z = false;
        float f2 = 0.0f;
        boolean z2 = false;
        int i17 = 0;
        float f3 = 0.0f;
        int i18 = 0;
        short s = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        short s2 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1035440894;
        int i27 = 0;
        short[] sArr4 = null;
        int i28 = 0;
        while (true) {
            i26 = i15 ^ (i14 & (((i26 ^ i12) * (-5075)) >> 31));
            switch (i26) {
                case -2128466881:
                case 2089771588:
                    C2958.m9034();
                    if (C4117.f13076 > 0) {
                        i4 = i23;
                        i5 = i27;
                        sArr = sArr2;
                        i6 = i25;
                        m2566 = (C0630.m2566("ۤۨ") ^ i12) * (-43);
                        i7 = ((m2566 ^ i13) * 5705) ^ (-1375839311);
                        i8 = -1469442934;
                        i15 = m2566 ^ i8;
                        c20054 = this;
                        i27 = i5;
                        i25 = i6;
                        sArr2 = sArr;
                        i23 = i4;
                        i14 = i7;
                        view2 = view;
                    } else {
                        m6981 = (C2105.m6981("ۨ۟") + i13) * (-87);
                        i2 = ((m6981 ^ i12) * 20619) ^ 902727926;
                        i3 = 38504459;
                        i15 = m6981 ^ i3;
                        i14 = i2;
                    }
                case -2096232510:
                case 1991440246:
                    C3746.m11360(c9503, z2 ? 1 : 0);
                    c20054.f64972 = z;
                    break;
                case -1957961745:
                case -473125886:
                    if (f == 0.0f) {
                        m6981 = C0630.m2566("ᩴ۠") ^ i12;
                        i2 = ((m6981 ^ i13) * (-2173)) ^ (-945557328);
                        i3 = 524246891;
                        i15 = m6981 ^ i3;
                        i14 = i2;
                    }
                    m6981 = (C0630.m2566("ܶ᩸") + i12) * (-31);
                    i2 = ((m6981 ^ i13) * (-19653)) ^ (-824816197);
                    i3 = -8477936;
                    i15 = m6981 ^ i3;
                    i14 = i2;
                case -1907672752:
                case -1597410372:
                    C3432.m10477();
                    break;
                case -1876703138:
                case -1450410008:
                    break;
                case -1734795303:
                case -1517868665:
                    i4 = i23;
                    i5 = i27;
                    sArr = sArr2;
                    i6 = i25;
                    sArr4 = f64968;
                    if (C3746.m11369() < 0) {
                        m2566 = (C0630.m2566("ܽۢ") + i12) * 17;
                        i7 = ((m2566 ^ i13) * 10789) ^ (-1264311305);
                        i8 = 283294637;
                        i15 = m2566 ^ i8;
                        c20054 = this;
                        i27 = i5;
                        i25 = i6;
                        sArr2 = sArr;
                        i23 = i4;
                        i14 = i7;
                        view2 = view;
                    }
                    m2566 = C2105.m6981("᩸᩷") ^ i13;
                    i7 = ((m2566 ^ i12) * (-14419)) ^ (-884863944);
                    i8 = -899854006;
                    i15 = m2566 ^ i8;
                    c20054 = this;
                    i27 = i5;
                    i25 = i6;
                    sArr2 = sArr;
                    i23 = i4;
                    i14 = i7;
                    view2 = view;
                case -1615778237:
                case 2018712688:
                    i4 = i23;
                    i5 = i27;
                    sArr = sArr2;
                    i6 = i25;
                    i21 = 65536;
                    if (C1773.f6144 > 0) {
                        m2566 = (i12 - C2105.m6981("۬ۗ")) * (-31);
                        i7 = ((m2566 ^ i13) * (-23347)) ^ (-1736340718);
                        i8 = 181841802;
                        i15 = m2566 ^ i8;
                        c20054 = this;
                        i27 = i5;
                        i25 = i6;
                        sArr2 = sArr;
                        i23 = i4;
                        i14 = i7;
                        view2 = view;
                    }
                    m2566 = C2105.m6981("᩸᩷") ^ i13;
                    i7 = ((m2566 ^ i12) * (-14419)) ^ (-884863944);
                    i8 = -899854006;
                    i15 = m2566 ^ i8;
                    c20054 = this;
                    i27 = i5;
                    i25 = i6;
                    sArr2 = sArr;
                    i23 = i4;
                    i14 = i7;
                    view2 = view;
                case -1565199623:
                case 1619424911:
                    i4 = i23;
                    i5 = i27;
                    sArr = sArr2;
                    i6 = i25;
                    if (C1773.f6144 <= 0) {
                        i25 = i6;
                        sArr2 = sArr;
                        i23 = i4;
                        m69812 = C2105.m6981("ۖۜ") ^ i13;
                        i14 = 1432776465 ^ ((m69812 ^ i12) * (-3635));
                        i10 = 812520887;
                        i15 = m69812 ^ i10;
                        c20054 = this;
                        view2 = view;
                        i27 = i5;
                    } else {
                        m2566 = C0630.m2566("ۜ᩹") ^ i13;
                        i7 = ((m2566 ^ i12) * (-23011)) ^ (-1036592406);
                        i8 = 1014774069;
                        i15 = m2566 ^ i8;
                        c20054 = this;
                        i27 = i5;
                        i25 = i6;
                        sArr2 = sArr;
                        i23 = i4;
                        i14 = i7;
                        view2 = view;
                    }
                case -1543889058:
                case 830538865:
                    c13064 = main.f40;
                    c13064.m31658(z ? 1 : 0, view2);
                    m6981 = (C0630.m2566("ܶ᩸") + i12) * (-31);
                    i2 = ((m6981 ^ i13) * (-19653)) ^ (-824816197);
                    i3 = -8477936;
                    i15 = m6981 ^ i3;
                    i14 = i2;
                case -1526728051:
                case 2128729681:
                    short[] sArr5 = sArr2;
                    int i29 = i22;
                    i4 = i23;
                    i6 = i25;
                    i5 = i27;
                    i24 = C0630.m2566(C2167.m7159(sArr5, i29, i4, i18));
                    if (C3019.f9544 >= 0) {
                        sArr = sArr5;
                        i22 = i29;
                        m2566 = C2105.m6981("᩸᩷") ^ i13;
                        i7 = ((m2566 ^ i12) * (-14419)) ^ (-884863944);
                        i8 = -899854006;
                        i15 = m2566 ^ i8;
                        c20054 = this;
                        i27 = i5;
                        i25 = i6;
                        sArr2 = sArr;
                        i23 = i4;
                        i14 = i7;
                        view2 = view;
                    } else {
                        int m25662 = C0630.m2566("ۚۚ") ^ i12;
                        i11 = ((m25662 ^ i13) * 15783) ^ 1908698502;
                        i15 = m25662 ^ 520327613;
                        i22 = i29;
                        i27 = i5;
                        i25 = i6;
                        sArr2 = sArr5;
                        view2 = view;
                        i23 = i4;
                        i14 = i11;
                        c20054 = this;
                    }
                case -1471102940:
                case 854535002:
                    C2167.m7155();
                    if (AbstractC2021.f6743 <= 0) {
                        i = i25;
                        int m25663 = C0630.m2566("۠ᩴ") ^ i12;
                        i11 = ((m25663 ^ i13) * (-14117)) ^ (-1644966876);
                        i15 = m25663 ^ (-1348492707);
                        i25 = i;
                        i14 = i11;
                        c20054 = this;
                    } else {
                        i4 = i23;
                        i5 = i27;
                        sArr = sArr2;
                        i6 = i25;
                        m2566 = C2105.m6981("᩸᩷") ^ i13;
                        i7 = ((m2566 ^ i12) * (-14419)) ^ (-884863944);
                        i8 = -899854006;
                        i15 = m2566 ^ i8;
                        c20054 = this;
                        i27 = i5;
                        i25 = i6;
                        sArr2 = sArr;
                        i23 = i4;
                        i14 = i7;
                        view2 = view;
                    }
                case -1453683811:
                case -272406197:
                    C1128.m3851();
                    i4 = i23;
                    i5 = i27;
                    sArr = sArr2;
                    i6 = i25;
                    m2566 = (C0630.m2566("ۤۨ") ^ i12) * (-43);
                    i7 = ((m2566 ^ i13) * 5705) ^ (-1375839311);
                    i8 = -1469442934;
                    i15 = m2566 ^ i8;
                    c20054 = this;
                    i27 = i5;
                    i25 = i6;
                    sArr2 = sArr;
                    i23 = i4;
                    i14 = i7;
                    view2 = view;
                case -1449840418:
                case 1506606492:
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        i4 = i23;
                        i5 = i27;
                        sArr = sArr2;
                        i6 = i25;
                        m2566 = (C0630.m2566("ۤۨ") ^ i12) * (-43);
                        i7 = ((m2566 ^ i13) * 5705) ^ (-1375839311);
                        i8 = -1469442934;
                        i15 = m2566 ^ i8;
                        c20054 = this;
                        i27 = i5;
                        i25 = i6;
                        sArr2 = sArr;
                        i23 = i4;
                        i14 = i7;
                        view2 = view;
                    } else {
                        m6981 = C0630.m2566("ۜۢ") ^ i12;
                        i2 = ((m6981 ^ i13) * (-20305)) ^ (-913573873);
                        i3 = -2031257004;
                        i15 = m6981 ^ i3;
                        i14 = i2;
                    }
                case -1447811559:
                case -1103796498:
                    if (c20054.f64972) {
                        m6981 = (i13 - C2105.m6981("᩹ۢ")) * 75;
                        i2 = ((m6981 ^ i12) * (-3525)) ^ (-115096345);
                        i3 = 1350352463;
                        i15 = m6981 ^ i3;
                        i14 = i2;
                    }
                    m6981 = (C0630.m2566("ܶ᩸") + i12) * (-31);
                    i2 = ((m6981 ^ i13) * (-19653)) ^ (-824816197);
                    i3 = -8477936;
                    i15 = m6981 ^ i3;
                    i14 = i2;
                case -1423903590:
                case -1390288075:
                    main = c20054.f64970;
                    int i30 = i25;
                    int i31 = i27;
                    if (i30 == i31) {
                        int m25664 = C0630.m2566("ᩳ᩷") ^ i12;
                        int i32 = ((m25664 ^ i13) * (-3249)) ^ (-51043137);
                        i27 = i31;
                        i15 = m25664 ^ 276274463;
                        z2 = false;
                        i25 = i30;
                        i14 = i32;
                        f2 = 1.0f;
                    } else {
                        int m25665 = (C0630.m2566("ۧᩳ") ^ i12) * (-19);
                        i25 = i30;
                        i27 = i31;
                        i15 = m25665 ^ 1923162675;
                        i14 = ((m25665 ^ i13) * 20809) ^ (-1345335230);
                        f2 = 1.0f;
                        z2 = false;
                    }
                case -1360100011:
                case 527873292:
                    i4 = i23;
                    i5 = i27;
                    sArr = sArr2;
                    i6 = i25;
                    int i33 = s2 + s;
                    i19 = i33 * i33;
                    i20 = s2 * s2;
                    if (!C2272.f7362) {
                        m2566 = C0630.m2566("᩻ܰ") ^ i12;
                        i7 = ((m2566 ^ i13) * (-17869)) ^ (-1617117417);
                        i8 = -1324387424;
                        i15 = m2566 ^ i8;
                        c20054 = this;
                        i27 = i5;
                        i25 = i6;
                        sArr2 = sArr;
                        i23 = i4;
                        i14 = i7;
                        view2 = view;
                    }
                    m2566 = (C0630.m2566("ۤۨ") ^ i12) * (-43);
                    i7 = ((m2566 ^ i13) * 5705) ^ (-1375839311);
                    i8 = -1469442934;
                    i15 = m2566 ^ i8;
                    c20054 = this;
                    i27 = i5;
                    i25 = i6;
                    sArr2 = sArr;
                    i23 = i4;
                    i14 = i7;
                    view2 = view;
                case -1116348093:
                case 365196824:
                    i9 = i22;
                    i4 = i23;
                    i5 = i27;
                    sArr = sArr2;
                    i6 = i25;
                    i18 = 39646;
                    m2566 = C0630.m2566("᩺ۨ") ^ i13;
                    i22 = i9;
                    i7 = ((m2566 ^ i12) * 27509) ^ 32035958;
                    i8 = 1313305755;
                    i15 = m2566 ^ i8;
                    c20054 = this;
                    i27 = i5;
                    i25 = i6;
                    sArr2 = sArr;
                    i23 = i4;
                    i14 = i7;
                    view2 = view;
                case -1060847647:
                case 1053405837:
                    c9762 = main.f10584;
                    f3 = c20054.f64971.getInterpolation(f2 - f);
                    if (C2958.f9394 < 0) {
                        m6981 = (C0630.m2566("᩹ۜ") + i13) * 61;
                        i2 = ((m6981 ^ i12) * (-24061)) ^ 695911616;
                        i3 = -254545286;
                        i15 = m6981 ^ i3;
                        i14 = i2;
                    }
                    m6981 = C0630.m2566("ۜۢ") ^ i12;
                    i2 = ((m6981 ^ i13) * (-20305)) ^ (-913573873);
                    i3 = -2031257004;
                    i15 = m6981 ^ i3;
                    i14 = i2;
                case -1030510228:
                case 282982721:
                    c130642 = main.f40;
                    c130642.m31658(z2 ? 1 : 0, view2);
                    break;
                case -698423796:
                case 1403379738:
                    if (C3245.m9925() == 0) {
                        m6981 = (C2105.m6981("ۨ۟") + i13) * (-87);
                        i2 = ((m6981 ^ i12) * 20619) ^ 902727926;
                        i3 = 38504459;
                        i15 = m6981 ^ i3;
                        i14 = i2;
                    } else {
                        i = i25;
                        int m256632 = C0630.m2566("۠ᩴ") ^ i12;
                        i11 = ((m256632 ^ i13) * (-14117)) ^ (-1644966876);
                        i15 = m256632 ^ (-1348492707);
                        i25 = i;
                        i14 = i11;
                        c20054 = this;
                    }
                case -675303270:
                case 157577743:
                    i5 = i27;
                    i25 = C0798.m3006(view);
                    sArr2 = f64968;
                    i22 = 9;
                    i23 = 3;
                    if (C7811.f24123 < 0) {
                        m69812 = C0630.m2566("ᩳ᩵") ^ i13;
                        i14 = 2056970855 ^ ((m69812 ^ i12) * (-27775));
                        i10 = 1023888192;
                        i15 = m69812 ^ i10;
                        c20054 = this;
                        view2 = view;
                        i27 = i5;
                    }
                    m69812 = C2105.m6981("ۖۜ") ^ i13;
                    i14 = 1432776465 ^ ((m69812 ^ i12) * (-3635));
                    i10 = 812520887;
                    i15 = m69812 ^ i10;
                    c20054 = this;
                    view2 = view;
                    i27 = i5;
                case -401516621:
                case 809236125:
                    if (i17 == (C2105.m6981(C2167.m7159(sArr3, i28, i16, i18)) ^ 2104018953)) {
                        m6981 = (C2105.m6981("ᩳۘ") + i13) * (-99);
                        i2 = ((m6981 ^ i12) * (-6239)) ^ 1738609633;
                        i3 = 366119738;
                        i15 = m6981 ^ i3;
                        i14 = i2;
                    }
                    m6981 = (C0630.m2566("ܶ᩸") + i12) * (-31);
                    i2 = ((m6981 ^ i13) * (-19653)) ^ (-824816197);
                    i3 = -8477936;
                    i15 = m6981 ^ i3;
                    i14 = i2;
                case -366707731:
                case 1738468894:
                    if (f == f2) {
                        m6981 = (i13 - C2105.m6981("ܰ֡")) * (-87);
                        i2 = ((m6981 ^ i12) * 24043) ^ 1817481765;
                        i3 = 1765414018;
                    } else {
                        m6981 = C0630.m2566("᩷ᩳ") ^ i13;
                        i2 = ((m6981 ^ i12) * (-27783)) ^ (-1900962256);
                        i3 = 313749148;
                    }
                    i15 = m6981 ^ i3;
                    i14 = i2;
                case -263739562:
                case 1268631917:
                    C1128.m3853(c9503, 4);
                    c20054.f64972 = z2;
                    break;
                case -179367007:
                case 553246598:
                    i17 = C1711.m5737(view);
                    sArr3 = f64968;
                    i28 = 12;
                    i16 = 3;
                    if (C2105.f7037 != 0) {
                        i4 = i23;
                        i5 = i27;
                        sArr = sArr2;
                        i6 = i25;
                        m2566 = (C0630.m2566("ۤۨ") ^ i12) * (-43);
                        i7 = ((m2566 ^ i13) * 5705) ^ (-1375839311);
                        i8 = -1469442934;
                        i15 = m2566 ^ i8;
                        c20054 = this;
                        i27 = i5;
                        i25 = i6;
                        sArr2 = sArr;
                        i23 = i4;
                        i14 = i7;
                        view2 = view;
                    } else {
                        m6981 = (C2105.m6981("۟۫") + i13) * 127;
                        i2 = ((m6981 ^ i12) * (-28927)) ^ 1444908093;
                        i3 = -1939757482;
                        i15 = m6981 ^ i3;
                        i14 = i2;
                    }
                case -18698457:
                case 403880158:
                    if (!c20054.f64972) {
                        m6981 = (C2105.m6981("۫ܶ") + i12) * (-13);
                        i2 = ((m6981 ^ i13) * 1627) ^ 2051407264;
                        i3 = -689687643;
                        i15 = m6981 ^ i3;
                        i14 = i2;
                    }
                    m6981 = (C0630.m2566("ܶ᩸") + i12) * (-31);
                    i2 = ((m6981 ^ i13) * (-19653)) ^ (-824816197);
                    i3 = -8477936;
                    i15 = m6981 ^ i3;
                    i14 = i2;
                case 171992902:
                case 625935461:
                    i4 = i23;
                    i5 = i27;
                    sArr = sArr2;
                    i6 = i25;
                    s2 = sArr4[8];
                    s = 256;
                    if (C0237.f1507 != 0) {
                        i25 = i6;
                        sArr2 = sArr;
                        i23 = i4;
                        m69812 = C2105.m6981("ۖۜ") ^ i13;
                        i14 = 1432776465 ^ ((m69812 ^ i12) * (-3635));
                        i10 = 812520887;
                        i15 = m69812 ^ i10;
                        c20054 = this;
                        view2 = view;
                        i27 = i5;
                    } else {
                        m2566 = (C0630.m2566("۫֨") ^ i13) * 87;
                        i7 = ((m2566 ^ i12) * (-10209)) ^ (-2045337567);
                        i8 = -88628181;
                        i15 = m2566 ^ i8;
                        c20054 = this;
                        i27 = i5;
                        i25 = i6;
                        sArr2 = sArr;
                        i23 = i4;
                        i14 = i7;
                        view2 = view;
                    }
                case 493240839:
                case 1576885409:
                    i4 = i23;
                    i5 = i27;
                    sArr = sArr2;
                    i6 = i25;
                    int i34 = i20 + i21;
                    if (i19 - (i34 + i34) <= 0) {
                        m2566 = (C2105.m6981("ۢ֫") ^ i13) * (-9);
                        i7 = ((m2566 ^ i12) * (-17063)) ^ (-964489383);
                        i8 = -670098876;
                    } else {
                        m2566 = (C2105.m6981("ܰܺ") ^ i12) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i7 = ((m2566 ^ i13) * 22177) ^ 1857387720;
                        i8 = 38875140;
                    }
                    i15 = m2566 ^ i8;
                    c20054 = this;
                    i27 = i5;
                    i25 = i6;
                    sArr2 = sArr;
                    i23 = i4;
                    i14 = i7;
                    view2 = view;
                case 961926219:
                case 1311026286:
                    i9 = i22;
                    i4 = i23;
                    i5 = i27;
                    sArr = sArr2;
                    i6 = i25;
                    i18 = 60370;
                    m2566 = C0630.m2566("᩺ۨ") ^ i13;
                    i22 = i9;
                    i7 = ((m2566 ^ i12) * 27509) ^ 32035958;
                    i8 = 1313305755;
                    i15 = m2566 ^ i8;
                    c20054 = this;
                    i27 = i5;
                    i25 = i6;
                    sArr2 = sArr;
                    i23 = i4;
                    i14 = i7;
                    view2 = view;
                case 1090709648:
                case 1634272516:
                    ViewOnClickListenerC1958.m6433(c9762, f3);
                    c9503 = c20054.f64969;
                    if (f > 0.7f) {
                        m6981 = C0630.m2566("᩻ۖ") ^ i12;
                        i2 = ((m6981 ^ i13) * (-28357)) ^ 497122785;
                        i3 = -2029355948;
                    } else {
                        m6981 = C2105.m6981("ۘ֨") ^ i12;
                        i2 = ((m6981 ^ i13) * (-16913)) ^ 1393818142;
                        i3 = -799074559;
                    }
                    i15 = m6981 ^ i3;
                    i14 = i2;
                default:
                    i = i25;
                    i27 = i24 ^ 2098876110;
                    z = true;
                    z = true;
                    if (C0964.f3626 != 0) {
                        int m2566322 = C0630.m2566("۠ᩴ") ^ i12;
                        i11 = ((m2566322 ^ i13) * (-14117)) ^ (-1644966876);
                        i15 = m2566322 ^ (-1348492707);
                        i25 = i;
                        i14 = i11;
                        c20054 = this;
                    } else {
                        int m25666 = (i13 - C0630.m2566("۬۟")) * 69;
                        i2 = ((m25666 ^ i12) * (-15273)) ^ 50464953;
                        i15 = m25666 ^ 730910390;
                        c20054 = this;
                        i25 = i;
                        i14 = i2;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (l.C3537.f11231 < 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r0 = l.C0630.m2566("᩺ܰ") ^ r15;
        r4 = ((r0 ^ r16) * 10035) ^ (-86840622);
        r18 = 2127608361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (l.C0714.f2697 >= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        if (l.C4263.f13799 > 0) goto L16;
     */
    @Override // l.AbstractC20121, l.InterfaceC8126
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDrawerClosed(android.view.View r21) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20054.onDrawerClosed(android.view.View):void");
    }

    @Override // l.AbstractC20121, l.InterfaceC8126
    public final void onDrawerOpened(View view) {
        Main main;
        int i;
        int m6981;
        int i2;
        int i3;
        int i4;
        C3318 c3318;
        int i5;
        int m2566;
        int i6;
        int i7;
        C3318 c33182;
        int i8 = C1773.f6144;
        int i9 = C22628.f73083;
        int m69812 = C2105.m6981("۫ۜ") ^ i8;
        int i10 = ((m69812 ^ i9) * 12911) ^ 326432972;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = m69812 ^ 447757759;
        char c = 0;
        short s = 0;
        int i12 = 0;
        int i13 = 0;
        short s2 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = -1618358071;
        Main main2 = null;
        int i18 = 0;
        while (true) {
            int i19 = i11 ^ (i10 & (((i17 ^ i9) * 15049) >> 31));
            switch (i19) {
                case -2121486699:
                case -259471464:
                    main = main2;
                    i = i19;
                    sArr = f64968;
                    if (C3019.m9255() > 0) {
                        m6981 = C2105.m6981("ܳ᩶") ^ i9;
                        i2 = ((m6981 ^ i8) * (-16181)) ^ 1659568462;
                        i3 = 1871240753;
                        int i20 = m6981 ^ i3;
                        i17 = i;
                        i11 = i20;
                        i10 = i2;
                        main2 = main;
                    }
                    m6981 = C0630.m2566("ۙۧ") ^ i8;
                    i2 = ((m6981 ^ i9) * (-23699)) ^ (-1260034892);
                    i3 = 570563059;
                    int i202 = m6981 ^ i3;
                    i17 = i;
                    i11 = i202;
                    i10 = i2;
                    main2 = main;
                case -2068942464:
                case 213885739:
                    if (C3746.f11829 <= 0) {
                        main = main2;
                        i = i19;
                        m6981 = (C0630.m2566("ۘܽ") ^ i9) * 79;
                        i2 = ((m6981 ^ i8) * (-10919)) ^ 1964075344;
                        i3 = -1472926814;
                        int i2022 = m6981 ^ i3;
                        i17 = i;
                        i11 = i2022;
                        i10 = i2;
                        main2 = main;
                    }
                    main = main2;
                    i = i19;
                    m6981 = (C2105.m6981("֡ۘ") + i9) * 55;
                    i2 = ((m6981 ^ i8) * 23509) ^ (-809039209);
                    i3 = 956486263;
                    int i20222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i20222;
                    i10 = i2;
                    main2 = main;
                case -1922011196:
                case 1315192215:
                    if (C2272.f7362) {
                        m2566 = C0630.m2566("۟ܳ") ^ i8;
                        i4 = i19;
                        i6 = ((m2566 ^ i9) * (-26433)) ^ 794838345;
                        i7 = -824637416;
                        i5 = i4;
                        i11 = m2566 ^ i7;
                        i10 = i6;
                        i17 = i5;
                    } else {
                        main = main2;
                        i = i19;
                        m6981 = C0630.m2566("ۙۧ") ^ i8;
                        i2 = ((m6981 ^ i9) * (-23699)) ^ (-1260034892);
                        i3 = 570563059;
                        int i202222 = m6981 ^ i3;
                        i17 = i;
                        i11 = i202222;
                        i10 = i2;
                        main2 = main;
                    }
                case -1868325949:
                case 285868304:
                    main = main2;
                    i = i19;
                    s = sArr[c];
                    i12 = s * s;
                    if (!C1504.f5354) {
                        m6981 = (C0630.m2566("᩹ۖ") + i9) * 85;
                        i2 = ((m6981 ^ i8) * (-13923)) ^ 699660565;
                        i3 = -311828524;
                        int i2022222 = m6981 ^ i3;
                        i17 = i;
                        i11 = i2022222;
                        i10 = i2;
                        main2 = main;
                    }
                    m6981 = C2105.m6981("֫ۚ") ^ i9;
                    i2 = ((m6981 ^ i8) * 20575) ^ 180075125;
                    i3 = 2072481275;
                    int i20222222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i20222222;
                    i10 = i2;
                    main2 = main;
                case -1866225680:
                case 396007918:
                    main = main2;
                    i = i19;
                    if ((s * s2) - i13 > 0) {
                        m6981 = C2105.m6981("ۜ֡") ^ i9;
                        i2 = ((m6981 ^ i8) * 2221) ^ 575655568;
                        i3 = -82744654;
                    } else {
                        m6981 = (C0630.m2566("᩹ۗ") + i8) * (-5);
                        i2 = ((m6981 ^ i9) * 31141) ^ (-1884066993);
                        i3 = -1201505281;
                    }
                    int i202222222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i202222222;
                    i10 = i2;
                    main2 = main;
                case -1803144097:
                case 136173108:
                    main = main2;
                    i = i19;
                    i13 = i12 + 325694209;
                    if (RunnableC1108.f4040) {
                        m6981 = C2105.m6981("ܶܺ") ^ i9;
                        i2 = ((m6981 ^ i8) * 22839) ^ 2041179993;
                        i3 = -512061417;
                        int i2022222222 = m6981 ^ i3;
                        i17 = i;
                        i11 = i2022222222;
                        i10 = i2;
                        main2 = main;
                    }
                    m6981 = (C2105.m6981("֡ۘ") + i9) * 55;
                    i2 = ((m6981 ^ i8) * 23509) ^ (-809039209);
                    i3 = 956486263;
                    int i20222222222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i20222222222;
                    i10 = i2;
                    main2 = main;
                case -1767564283:
                case 522543940:
                    i4 = i19;
                    c33182 = main2.f61;
                    ViewOnClickListenerC1958.m6434(c33182);
                    m2566 = C0630.m2566("᩻ᩳ") ^ i9;
                    i6 = ((m2566 ^ i8) * 6361) ^ (-292897050);
                    i7 = 1283784509;
                    i5 = i4;
                    i11 = m2566 ^ i7;
                    i10 = i6;
                    i17 = i5;
                case -1739778156:
                case -822954476:
                    main = main2;
                    i = i19;
                    i14 = 6364;
                    m6981 = C2105.m6981("ۤۗ") ^ i9;
                    i2 = ((m6981 ^ i8) * (-22897)) ^ (-2084793685);
                    i3 = 1704739729;
                    int i202222222222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i202222222222;
                    i10 = i2;
                    main2 = main;
                case -1660967146:
                case -1427135999:
                    RunnableC1937.m6387();
                    break;
                case -1374663180:
                case 2093486026:
                    main = main2;
                    i = i19;
                    i15 = 5;
                    if (C0237.f1507 == 0) {
                        m6981 = C2105.m6981("ۜ᩷") ^ i8;
                        i2 = ((m6981 ^ i9) * (-30017)) ^ (-1659235235);
                        i3 = -2124847948;
                        int i2022222222222 = m6981 ^ i3;
                        i17 = i;
                        i11 = i2022222222222;
                        i10 = i2;
                        main2 = main;
                    }
                    m6981 = (C0630.m2566("ۘܽ") ^ i9) * 79;
                    i2 = ((m6981 ^ i8) * (-10919)) ^ 1964075344;
                    i3 = -1472926814;
                    int i20222222222222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i20222222222222;
                    i10 = i2;
                    main2 = main;
                case -1369532605:
                case -722138569:
                    main = main2;
                    i = i19;
                    i14 = 33018;
                    m6981 = C2105.m6981("ۤۗ") ^ i9;
                    i2 = ((m6981 ^ i8) * (-22897)) ^ (-2084793685);
                    i3 = 1704739729;
                    int i202222222222222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i202222222222222;
                    i10 = i2;
                    main2 = main;
                case -1343952295:
                case -365957002:
                    main = main2;
                    i = i19;
                    i16 = 3;
                    if (!C0798.f2919) {
                        m6981 = (C2105.m6981("ܰ᩵") ^ i9) * 51;
                        i2 = ((m6981 ^ i8) * 20147) ^ (-678902376);
                        i3 = 1582074310;
                        int i2022222222222222 = m6981 ^ i3;
                        i17 = i;
                        i11 = i2022222222222222;
                        i10 = i2;
                        main2 = main;
                    }
                    m6981 = (C0630.m2566("ۘܽ") ^ i9) * 79;
                    i2 = ((m6981 ^ i8) * (-10919)) ^ 1964075344;
                    i3 = -1472926814;
                    int i20222222222222222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i20222222222222222;
                    i10 = i2;
                    main2 = main;
                case -728141776:
                case 291443598:
                    main = main2;
                    i = i19;
                    s2 = 36094;
                    if (C4075.f12947 < 0) {
                        m6981 = C0630.m2566("ۨۚ") ^ i8;
                        i2 = ((m6981 ^ i9) * (-14135)) ^ 1126055489;
                        i3 = -1099031820;
                        int i202222222222222222 = m6981 ^ i3;
                        i17 = i;
                        i11 = i202222222222222222;
                        i10 = i2;
                        main2 = main;
                    }
                    m6981 = (C0630.m2566("ۘܽ") ^ i9) * 79;
                    i2 = ((m6981 ^ i8) * (-10919)) ^ 1964075344;
                    i3 = -1472926814;
                    int i2022222222222222222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i2022222222222222222;
                    i10 = i2;
                    main2 = main;
                case -500733996:
                case 1047639584:
                    main = main2;
                    i = i19;
                    if (i18 == (C2105.m6981(C3911.m11919(sArr2, i15, i16, i14)) ^ 2102370476)) {
                        m6981 = (C2105.m6981("ۨ֫") + i9) * (-117);
                        i2 = ((m6981 ^ i8) * (-15761)) ^ (-695110536);
                        i3 = 2111069494;
                        int i20222222222222222222 = m6981 ^ i3;
                        i17 = i;
                        i11 = i20222222222222222222;
                        i10 = i2;
                        main2 = main;
                    }
                    m6981 = (i8 - C2105.m6981("۠ܺ")) * 13;
                    i2 = ((m6981 ^ i9) * 6537) ^ 1324335420;
                    i3 = 63431803;
                    int i202222222222222222222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i202222222222222222222;
                    i10 = i2;
                    main2 = main;
                case 113004716:
                case 1549085847:
                    break;
                case 157661176:
                case 649155172:
                    if (RunnableC1937.m6387() == 0) {
                        main = main2;
                        i = i19;
                        m6981 = (C2105.m6981("֡ۘ") + i9) * 55;
                        i2 = ((m6981 ^ i8) * 23509) ^ (-809039209);
                        i3 = 956486263;
                        int i2022222222222222222222 = m6981 ^ i3;
                        i17 = i;
                        i11 = i2022222222222222222222;
                        i10 = i2;
                        main2 = main;
                    } else {
                        m2566 = C0630.m2566("۟ܳ") ^ i8;
                        i4 = i19;
                        i6 = ((m2566 ^ i9) * (-26433)) ^ 794838345;
                        i7 = -824637416;
                        i5 = i4;
                        i11 = m2566 ^ i7;
                        i10 = i6;
                        i17 = i5;
                    }
                case 588068628:
                case 1965001600:
                    i4 = i19;
                    main2 = this.f64970;
                    c3318 = main2.f61;
                    if (c3318 != null) {
                        int m25662 = (i8 - C0630.m2566("ۡ᩵")) * 79;
                        i10 = ((m25662 ^ i9) * 26691) ^ (-1278559690);
                        i5 = i4;
                        i11 = m25662 ^ (-92119461);
                        i17 = i5;
                    }
                    m2566 = C0630.m2566("᩻ᩳ") ^ i9;
                    i6 = ((m2566 ^ i8) * 6361) ^ (-292897050);
                    i7 = 1283784509;
                    i5 = i4;
                    i11 = m2566 ^ i7;
                    i10 = i6;
                    i17 = i5;
                case 801888848:
                case 1350539521:
                    main = main2;
                    i = i19;
                    i18 = C0798.m3006(view);
                    sArr2 = f64968;
                    if (C3663.m11168() < 0) {
                        m6981 = (i8 - C2105.m6981("᩻ܳ")) * (-43);
                        i2 = ((m6981 ^ i9) * 11643) ^ 847192809;
                        i3 = 1517530236;
                        int i20222222222222222222222 = m6981 ^ i3;
                        i17 = i;
                        i11 = i20222222222222222222222;
                        i10 = i2;
                        main2 = main;
                    }
                    m6981 = (C2105.m6981("֡ۘ") + i9) * 55;
                    i2 = ((m6981 ^ i8) * 23509) ^ (-809039209);
                    i3 = 956486263;
                    int i202222222222222222222222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i202222222222222222222222;
                    i10 = i2;
                    main2 = main;
                case 873300248:
                case 2030924456:
                    main = main2;
                    i = i19;
                    if (C0237.f1507 == 0) {
                        m6981 = (C2105.m6981("֡᩸") + i8) * (-93);
                        i2 = ((m6981 ^ i9) * (-4997)) ^ (-1561778719);
                        i3 = -2056861326;
                        int i2022222222222222222222222 = m6981 ^ i3;
                        i17 = i;
                        i11 = i2022222222222222222222222;
                        i10 = i2;
                        main2 = main;
                    }
                    m6981 = C2105.m6981("֫ۚ") ^ i9;
                    i2 = ((m6981 ^ i8) * 20575) ^ 180075125;
                    i3 = 2072481275;
                    int i20222222222222222222222222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i20222222222222222222222222;
                    i10 = i2;
                    main2 = main;
                case 886733421:
                case 1516970353:
                    main = main2;
                    i = i19;
                    c = 4;
                    if (C7106.m19120() > 0) {
                        m6981 = C2105.m6981("۫᩹") ^ i8;
                        i2 = ((m6981 ^ i9) * 1969) ^ 52915032;
                        i3 = -1105327397;
                        int i202222222222222222222222222 = m6981 ^ i3;
                        i17 = i;
                        i11 = i202222222222222222222222222;
                        i10 = i2;
                        main2 = main;
                    }
                    m6981 = C2105.m6981("֫ۚ") ^ i9;
                    i2 = ((m6981 ^ i8) * 20575) ^ 180075125;
                    i3 = 2072481275;
                    int i2022222222222222222222222222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i2022222222222222222222222222;
                    i10 = i2;
                    main2 = main;
                case 2036643462:
                case 2052090149:
                    i = i19;
                    ExecutorService executorService = C1802.f6208;
                    main = main2;
                    if (C1773.f6144 > 0) {
                        C2105.m6975(executorService, new RunnableC18664(2));
                        m6981 = (i8 - C2105.m6981("۠ܺ")) * 13;
                        i2 = ((m6981 ^ i9) * 6537) ^ 1324335420;
                        i3 = 63431803;
                        int i20222222222222222222222222222 = m6981 ^ i3;
                        i17 = i;
                        i11 = i20222222222222222222222222222;
                        i10 = i2;
                        main2 = main;
                    }
                    m6981 = C0630.m2566("ۙۧ") ^ i8;
                    i2 = ((m6981 ^ i9) * (-23699)) ^ (-1260034892);
                    i3 = 570563059;
                    int i202222222222222222222222222222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i202222222222222222222222222222;
                    i10 = i2;
                    main2 = main;
                default:
                    i = i19;
                    RunnableC1108.m3790();
                    C4117.m12364();
                    main = main2;
                    m6981 = (C2105.m6981("֡ۘ") + i9) * 55;
                    i2 = ((m6981 ^ i8) * 23509) ^ (-809039209);
                    i3 = 956486263;
                    int i2022222222222222222222222222222 = m6981 ^ i3;
                    i17 = i;
                    i11 = i2022222222222222222222222222222;
                    i10 = i2;
                    main2 = main;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
    
        r7 = l.C2105.m6981("ۙۤ") ^ r2;
        r8 = ((r7 ^ r3) * 4009) ^ (-635468223);
        r4 = 103200776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        r7 = (l.C0630.m2566("᩵ۗ") + r2) * (-5);
        r8 = ((r7 ^ r3) * 2695) ^ 838056396;
        r4 = -312727399;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C20054(bin.mt.plus.Main r7, l.C9503 r8) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20054.<init>(bin.mt.plus.Main, l.ۢۢۡ):void");
    }
}
