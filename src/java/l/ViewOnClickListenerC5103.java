package l;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Random;
import moe.shizuku.server.IShizukuService;

/* compiled from: F1FO */
/* renamed from: l.ۚۘۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC5103 implements View.OnClickListener {

    /* renamed from: ܿܰۘ, reason: not valid java name and contains not printable characters */
    private static final short[] f16002 = {8600, 9403, 9407, 9378, 9401, 9388, 9401, 9380, 9378, 9379};

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16003;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Random f16004;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ObjectAnimator f16005;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f16006;

    public ViewOnClickListenerC5103() {
        Random random = null;
        int i = -37507150;
        int i2 = C0422.f1886;
        int i3 = C2167.f7158;
        int m6981 = C2105.m6981("֨ۧ") ^ i2;
        int i4 = ((m6981 ^ i3) * (-1331)) ^ (-681109440);
        int i5 = 1380897775;
        while (true) {
            i = ((((i ^ i3) * 6363) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2142016705:
                case -1129979815:
                    if (C4075.f12947 >= 0) {
                        m6981 = C2105.m6981("ۗۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-3301)) ^ 582827246;
                        i5 = -53409844;
                    } else {
                        m6981 = (C0630.m2566("ܶܺ") ^ i3) * 7;
                        i4 = ((m6981 ^ i2) * 10507) ^ 669839872;
                        i5 = -1528545517;
                    }
                case -2132437729:
                case 1859542791:
                    if (C4075.f12947 >= 0) {
                        m6981 = (i3 - C2105.m6981("ۜ֫")) * 83;
                        i4 = ((m6981 ^ i2) * 11085) ^ 316703190;
                        i5 = -2068895323;
                    } else {
                        m6981 = (C2105.m6981("ᩴܿ") + i3) * 123;
                        i4 = ((m6981 ^ i2) * (-27901)) ^ 256195799;
                        i5 = 1797710460;
                    }
                case -1835454857:
                case -1652997647:
                    if (C2272.f7362) {
                        m6981 = C2105.m6981("ۗۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-3301)) ^ 582827246;
                        i5 = -53409844;
                    } else {
                        m6981 = C2105.m6981("ۨ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * (-11659)) ^ 1553114283;
                        i5 = -1614498103;
                    }
                case -1683217602:
                case 84160823:
                    if (C0964.f3626 != 0) {
                        m6981 = C2105.m6981("ۨ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * (-11659)) ^ 1553114283;
                        i5 = -1614498103;
                    } else {
                        m6981 = C2105.m6981("ۚۢ") ^ i2;
                        i4 = ((m6981 ^ i3) * 20527) ^ (-582579919);
                        i5 = -852348837;
                    }
                case -1601810110:
                case -707155950:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = (i3 - C2105.m6981("ۜ֫")) * 83;
                        i4 = ((m6981 ^ i2) * 11085) ^ 316703190;
                        i5 = -2068895323;
                    } else {
                        m6981 = C0630.m2566("ܽ۫") ^ i2;
                        i4 = ((m6981 ^ i3) * 25003) ^ 1261129062;
                        i5 = 72228599;
                    }
                case -1063004539:
                case 1290095666:
                    if (C22628.f73083 <= 0) {
                        m6981 = C2105.m6981("ۖ᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * 16477) ^ (-1510783202);
                        i5 = -1972206807;
                    } else {
                        m6981 = C0630.m2566("ᩴܳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 20265) ^ 450606528;
                        i5 = 1504715270;
                    }
                case -907927070:
                case -228097776:
                    C2105.m6982();
                    if (C5695.m16023() >= 0) {
                        m6981 = C2105.m6981("ۗۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-3301)) ^ 582827246;
                        i5 = -53409844;
                    } else {
                        m6981 = C2105.m6981("ۖ᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * 16477) ^ (-1510783202);
                        i5 = -1972206807;
                    }
                case -876566281:
                case 151776331:
                    this.f16004 = random;
                    return;
                case -465920472:
                case 307352496:
                    ServiceConnectionC3453.m10564();
                    m6981 = C2105.m6981("ۨ۟") ^ i3;
                    i4 = ((m6981 ^ i2) * (-11659)) ^ 1553114283;
                    i5 = -1614498103;
                case -419094145:
                case 1265877695:
                    if (C0964.f3626 != 0) {
                        m6981 = C2105.m6981("ۨ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * (-11659)) ^ 1553114283;
                        i5 = -1614498103;
                    } else {
                        m6981 = C2105.m6981("ۨܺ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-7499)) ^ (-1537561233);
                        i5 = -461622668;
                    }
                case 128397112:
                case 1438176061:
                    if (C1005.f3721) {
                        m6981 = (C0630.m2566("ܰᩴ") + i2) * (-111);
                        i4 = ((m6981 ^ i3) * (-28579)) ^ (-268144825);
                        i5 = 2061638826;
                    } else {
                        m6981 = (C2105.m6981("᩶ۤ") ^ i3) * (-95);
                        i4 = ((m6981 ^ i2) * (-8575)) ^ 798496690;
                        i5 = 281979311;
                    }
                case 480623288:
                case 1109864701:
                    if (C3663.f11553) {
                        m6981 = (C2105.m6981("᩶ۤ") ^ i3) * (-95);
                        i4 = ((m6981 ^ i2) * (-8575)) ^ 798496690;
                        i5 = 281979311;
                    } else {
                        m6981 = (C0630.m2566("۟ۡ") ^ i3) * (-67);
                        i4 = ((m6981 ^ i2) * (-9491)) ^ (-10225363);
                        i5 = 393014271;
                    }
                case 773936809:
                case 1252337361:
                    random = new Random();
                    if (C4075.m12263() <= 0) {
                        m6981 = (i3 - C2105.m6981("ۜ֫")) * 83;
                        i4 = ((m6981 ^ i2) * 11085) ^ 316703190;
                        i5 = -2068895323;
                    } else {
                        m6981 = C2105.m6981("ۜ᩹") ^ i2;
                        i4 = ((m6981 ^ i3) * (-23715)) ^ (-1878448012);
                        i5 = -1538372539;
                    }
                case 1026188032:
                case 1274321110:
                    if (C1773.m5908() <= 0) {
                        m6981 = C2105.m6981("ۖ᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * 16477) ^ (-1510783202);
                        i5 = -1972206807;
                    } else {
                        m6981 = C0630.m2566("ۙۨ") ^ i2;
                        i4 = ((m6981 ^ i3) * 3253) ^ 1540952863;
                        i5 = -666349909;
                    }
                case 1225851804:
                case 1241496999:
                    if (C3663.f11553) {
                        m6981 = C2105.m6981("ۖ᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * 16477) ^ (-1510783202);
                        i5 = -1972206807;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۜ֫")) * 83;
                        i4 = ((m6981 ^ i2) * 11085) ^ 316703190;
                        i5 = -2068895323;
                    }
                default:
                    C1773.m5908();
                    throw new RuntimeException();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int i2;
        int m2566;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        int m6981;
        int i7;
        int i8;
        int i9;
        String str2;
        int i10;
        short[] sArr;
        String str3;
        int i11;
        short[] sArr2;
        int i12;
        short[] sArr3;
        int m69812;
        int i13;
        int i14;
        String str4;
        int i15;
        int m69813;
        int i16;
        int i17;
        int i18;
        int m69814;
        int i19;
        int i20;
        int m25662;
        int i21;
        int i22;
        ViewOnClickListenerC5103 viewOnClickListenerC5103 = this;
        int i23 = 1066516533;
        int i24 = C3911.f12484;
        int i25 = ViewOnClickListenerC1958.f6529;
        int m25663 = C0630.m2566("۫ܶ") ^ i24;
        int i26 = ((m25663 ^ i25) * 8367) ^ (-1836713291);
        int i27 = m25663 ^ 1870084509;
        String str5 = null;
        ObjectAnimator objectAnimator = null;
        ObjectAnimator objectAnimator2 = null;
        ObjectAnimator objectAnimator3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        boolean z = false;
        boolean z2 = false;
        int i28 = 0;
        float f = 0.0f;
        int i29 = 0;
        String str6 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        char c = 0;
        short s = 0;
        int i30 = 0;
        int i31 = 0;
        short s2 = 0;
        boolean z3 = false;
        int i32 = 0;
        int i33 = 0;
        ObjectAnimator objectAnimator4 = null;
        float[] fArr = null;
        int i34 = 0;
        boolean z4 = false;
        while (true) {
            i23 = i27 ^ (i26 & (((i23 ^ i25) * 813) >> 31));
            switch (i23) {
                case -2026276195:
                case -1636420411:
                    if (C0798.m2998() != 0) {
                        m25662 = C0630.m2566("ܰ۫") ^ i24;
                        i21 = ((m25662 ^ i25) * 31685) ^ (-1892879672);
                        i22 = 1816273047;
                        i27 = m25662 ^ i22;
                        i26 = i21;
                    } else {
                        i6 = i34;
                        i2 = i29;
                        str = str6;
                        i5 = i32;
                        int m25664 = C0630.m2566("۠ۧ") ^ i24;
                        int i35 = ((m25664 ^ i25) * (-13635)) ^ 294032715;
                        i15 = m25664 ^ (-978744189);
                        str6 = str;
                        i26 = i35;
                        i32 = i5;
                        i29 = i2;
                        i34 = i6;
                        i27 = i15;
                        viewOnClickListenerC5103 = this;
                    }
                case -1993033256:
                case 1673889580:
                    i29 = viewOnClickListenerC5103.f16004.nextInt(340) + 370;
                    z4 = viewOnClickListenerC5103.f16003;
                    if (z4) {
                        m25662 = (C0630.m2566("ۜܳ") + i24) * (-39);
                        i21 = ((m25662 ^ i25) * (-28175)) ^ (-1017508371);
                        i22 = 1758945195;
                        i27 = m25662 ^ i22;
                        i26 = i21;
                    } else {
                        i34 = i29;
                        m25662 = C0630.m2566("ܺܽ") ^ i25;
                        i21 = ((m25662 ^ i24) * 20997) ^ 1289974500;
                        i22 = 791514627;
                        i27 = m25662 ^ i22;
                        i26 = i21;
                    }
                case -1986739677:
                case 644044337:
                    i6 = i34;
                    i2 = i29;
                    str = str6;
                    i5 = i32;
                    sArr3 = sArr5;
                    sArr4 = f16002;
                    c = 0;
                    if (C4616.f14690 > 0) {
                        m69812 = (C2105.m6981("֨۫") + i24) * 25;
                        i13 = ((m69812 ^ i25) * 20247) ^ (-1330774877);
                        i14 = -736270847;
                        i15 = m69812 ^ i14;
                        str6 = str;
                        i26 = i13;
                        i32 = i5;
                        sArr5 = sArr3;
                        i29 = i2;
                        i34 = i6;
                        i27 = i15;
                        viewOnClickListenerC5103 = this;
                    }
                    m69812 = C2105.m6981("ۡۜ") ^ i25;
                    i13 = ((m69812 ^ i24) * 12797) ^ 1667844365;
                    i14 = -900379415;
                    i15 = m69812 ^ i14;
                    str6 = str;
                    i26 = i13;
                    i32 = i5;
                    sArr5 = sArr3;
                    i29 = i2;
                    i34 = i6;
                    i27 = i15;
                    viewOnClickListenerC5103 = this;
                case -1974753442:
                case -575348619:
                    C3432.m10477();
                    if (C4117.f13076 <= 0) {
                        i = i29;
                        m2566 = C2105.m6981("᩺ۗ") ^ i25;
                        i3 = ((m2566 ^ i24) * (-6981)) ^ 1468375432;
                        i4 = -1947590493;
                        i27 = m2566 ^ i4;
                        int i36 = i3;
                        i29 = i;
                        i26 = i36;
                    } else {
                        m25662 = C0630.m2566("ܰ۫") ^ i24;
                        i21 = ((m25662 ^ i25) * 31685) ^ (-1892879672);
                        i22 = 1816273047;
                        i27 = m25662 ^ i22;
                        i26 = i21;
                    }
                case -1969102023:
                case -94688692:
                    RunnableC0588.m2441();
                    RunnableC3474.m10630();
                    i = i29;
                    m2566 = C2105.m6981("᩺ۗ") ^ i25;
                    i3 = ((m2566 ^ i24) * (-6981)) ^ 1468375432;
                    i4 = -1947590493;
                    i27 = m2566 ^ i4;
                    int i362 = i3;
                    i29 = i;
                    i26 = i362;
                case -1909809002:
                case 1152021446:
                    i17 = i34;
                    i2 = i29;
                    i10 = i32;
                    sArr = sArr5;
                    z3 = false;
                    m69814 = C0630.m2566("ᩴ᩵") ^ i24;
                    i19 = ((m69814 ^ i25) * (-32219)) ^ 1823882295;
                    i20 = -1011282520;
                    i32 = i10;
                    sArr5 = sArr;
                    i29 = i2;
                    i18 = i17;
                    i27 = m69814 ^ i20;
                    i26 = i19;
                    i34 = i18;
                case -1665370426:
                case 1718457693:
                    i2 = i29;
                    fArr = new float[i28];
                    fArr[z2 ? 1 : 0] = view.getRotation();
                    fArr[z ? 1 : 0] = f;
                    if (C2520.f8000 >= 0) {
                        i6 = i34;
                        str = str6;
                        i5 = i32;
                        int m256642 = C0630.m2566("۠ۧ") ^ i24;
                        int i352 = ((m256642 ^ i25) * (-13635)) ^ 294032715;
                        i15 = m256642 ^ (-978744189);
                        str6 = str;
                        i26 = i352;
                        i32 = i5;
                        i29 = i2;
                        i34 = i6;
                        i27 = i15;
                        viewOnClickListenerC5103 = this;
                    } else {
                        m6981 = (C2105.m6981("᩺ܶ") ^ i25) * 97;
                        i7 = ((m6981 ^ i24) * 28649) ^ 613660183;
                        i8 = 2073198867;
                        i27 = m6981 ^ i8;
                        i26 = i7;
                        i29 = i2;
                    }
                case -1542858552:
                case -77807909:
                    i2 = i29;
                    i10 = i32;
                    sArr = sArr5;
                    if (objectAnimator4.isRunning()) {
                        m69814 = C2105.m6981("ۡ֨") ^ i24;
                        i17 = i34;
                        i19 = ((m69814 ^ i25) * 7915) ^ (-1396995268);
                        i20 = 166707988;
                        i32 = i10;
                        sArr5 = sArr;
                        i29 = i2;
                        i18 = i17;
                        i27 = m69814 ^ i20;
                        i26 = i19;
                        i34 = i18;
                    } else {
                        i9 = i34;
                        str2 = str6;
                        int m69815 = (C2105.m6981("᩸ۜ") ^ i24) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str6 = str2;
                        i32 = i10;
                        sArr5 = sArr;
                        i29 = i2;
                        i26 = ((m69815 ^ i25) * (-18033)) ^ 161949474;
                        viewOnClickListenerC5103 = this;
                        i18 = i9;
                        i27 = m69815 ^ 1069986767;
                        i34 = i18;
                    }
                case -1528245244:
                case -540360951:
                    C0630.m2564();
                    C5695.m16023();
                    break;
                case -1321646911:
                case -1147868505:
                    i34 = -i29;
                    m25662 = C0630.m2566("ܺܽ") ^ i25;
                    i21 = ((m25662 ^ i24) * 20997) ^ 1289974500;
                    i22 = 791514627;
                    i27 = m25662 ^ i22;
                    i26 = i21;
                case -1202665291:
                case -530591456:
                    if (C0798.m2998() == 0) {
                        i6 = i34;
                        i2 = i29;
                        str = str6;
                        i5 = i32;
                        int m2566422 = C0630.m2566("۠ۧ") ^ i24;
                        int i3522 = ((m2566422 ^ i25) * (-13635)) ^ 294032715;
                        i15 = m2566422 ^ (-978744189);
                        str6 = str;
                        i26 = i3522;
                        i32 = i5;
                        i29 = i2;
                        i34 = i6;
                        i27 = i15;
                        viewOnClickListenerC5103 = this;
                    } else {
                        m25662 = (C0630.m2566("ܺ֡") + i24) * (-75);
                        i21 = ((m25662 ^ i25) * 17821) ^ 1039557665;
                        i22 = 1059075567;
                        i27 = m25662 ^ i22;
                        i26 = i21;
                    }
                case -974758889:
                case 47105895:
                    objectAnimator3.setInterpolator(new AccelerateInterpolator());
                    viewOnClickListenerC5103.f16006 = z2;
                    i2 = i29;
                    m6981 = C0630.m2566("ᩳۡ") ^ i25;
                    i7 = ((m6981 ^ i24) * (-24509)) ^ (-386165261);
                    i8 = -1139643051;
                    i27 = m6981 ^ i8;
                    i26 = i7;
                    i29 = i2;
                case -823111430:
                case 1962921317:
                    i = i29;
                    float[] fArr2 = new float[i28];
                    fArr2[z2 ? 1 : 0] = f2;
                    fArr2[z ? 1 : 0] = f3;
                    objectAnimator2 = C2520.m8018(view, str5, fArr2);
                    if (C3746.m11369() >= 0) {
                        i2 = i;
                        m6981 = (C0630.m2566("ܳ֨") + i25) * 3;
                        i7 = ((m6981 ^ i24) * (-9439)) ^ (-1828628540);
                        i8 = 1144869777;
                        i27 = m6981 ^ i8;
                        i26 = i7;
                        i29 = i2;
                    } else {
                        m2566 = C0630.m2566("ܳۢ") ^ i24;
                        i3 = ((m2566 ^ i25) * (-20141)) ^ (-2105833241);
                        i4 = 230277693;
                        i27 = m2566 ^ i4;
                        int i3622 = i3;
                        i29 = i;
                        i26 = i3622;
                    }
                case -660955198:
                case 714829821:
                    i9 = i34;
                    i2 = i29;
                    str2 = str6;
                    i10 = i32;
                    sArr = sArr5;
                    C3683.m11210(view, str2);
                    ObjectAnimator objectAnimator5 = viewOnClickListenerC5103.f16005;
                    z2 = false;
                    z2 = false;
                    if (objectAnimator5 != null) {
                        int m25665 = (C0630.m2566("֨ۚ") + i25) * (-103);
                        int i37 = ((m25665 ^ i24) * (-6795)) ^ (-755828745);
                        objectAnimator4 = objectAnimator5;
                        i32 = i10;
                        sArr5 = sArr;
                        i29 = i2;
                        i34 = i9;
                        i27 = m25665 ^ (-2125052151);
                        str6 = str2;
                        i26 = i37;
                        z = true;
                    } else {
                        objectAnimator4 = objectAnimator5;
                        z = true;
                        int m698152 = (C2105.m6981("᩸ۜ") ^ i24) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str6 = str2;
                        i32 = i10;
                        sArr5 = sArr;
                        i29 = i2;
                        i26 = ((m698152 ^ i25) * (-18033)) ^ 161949474;
                        viewOnClickListenerC5103 = this;
                        i18 = i9;
                        i27 = m698152 ^ 1069986767;
                        i34 = i18;
                    }
                case -660305827:
                case 670767026:
                    i2 = i29;
                    if (z3) {
                        str3 = str5;
                        i11 = i32;
                        sArr2 = sArr5;
                        i12 = i33;
                        int m69816 = C2105.m6981("ۛ᩷") ^ i25;
                        int i38 = ((m69816 ^ i24) * (-33)) ^ 532728214;
                        i27 = m69816 ^ 937872871;
                        i33 = i12;
                        i32 = i11;
                        sArr5 = sArr2;
                        i29 = i2;
                        str5 = str3;
                        i26 = i38;
                    } else {
                        m6981 = C0630.m2566("֨ۡ") ^ i24;
                        i7 = ((m6981 ^ i25) * 24535) ^ (-2012208074);
                        i8 = -2138176143;
                        i27 = m6981 ^ i8;
                        i26 = i7;
                        i29 = i2;
                    }
                case -557213996:
                case 1257433508:
                    i6 = i34;
                    i2 = i29;
                    str4 = str6;
                    sArr3 = sArr5;
                    i32 = 9421;
                    int m69817 = (C2105.m6981("֨֡") ^ i25) * (-21);
                    int i39 = ((m69817 ^ i24) * 20677) ^ (-359844126);
                    i15 = m69817 ^ 1240892538;
                    str6 = str4;
                    i26 = i39;
                    sArr5 = sArr3;
                    i29 = i2;
                    i34 = i6;
                    i27 = i15;
                    viewOnClickListenerC5103 = this;
                case -481352179:
                case -284409882:
                    i2 = i29;
                    ObjectAnimator objectAnimator6 = viewOnClickListenerC5103.f16005;
                    C2167.m7151(objectAnimator6);
                    objectAnimator6.cancel();
                    if (viewOnClickListenerC5103.f16006) {
                        m6981 = (i24 - C2105.m6981("۠ܿ")) * 73;
                        i7 = ((m6981 ^ i25) * 3653) ^ (-982513058);
                        i8 = 1049457018;
                        i27 = m6981 ^ i8;
                        i26 = i7;
                        i29 = i2;
                    } else {
                        i9 = i34;
                        str2 = str6;
                        i10 = i32;
                        sArr = sArr5;
                        int m6981522 = (C2105.m6981("᩸ۜ") ^ i24) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        str6 = str2;
                        i32 = i10;
                        sArr5 = sArr;
                        i29 = i2;
                        i26 = ((m6981522 ^ i25) * (-18033)) ^ 161949474;
                        viewOnClickListenerC5103 = this;
                        i18 = i9;
                        i27 = m6981522 ^ 1069986767;
                        i34 = i18;
                    }
                case -451613362:
                case 74710579:
                    i6 = i34;
                    i2 = i29;
                    str4 = str6;
                    sArr3 = sArr5;
                    i32 = 47395;
                    int m698172 = (C2105.m6981("֨֡") ^ i25) * (-21);
                    int i392 = ((m698172 ^ i24) * 20677) ^ (-359844126);
                    i15 = m698172 ^ 1240892538;
                    str6 = str4;
                    i26 = i392;
                    sArr5 = sArr3;
                    i29 = i2;
                    i34 = i6;
                    i27 = i15;
                    viewOnClickListenerC5103 = this;
                case -432138834:
                case -236838438:
                    i2 = i29;
                    viewOnClickListenerC5103.f16005 = objectAnimator;
                    C0714.m2808(objectAnimator);
                    objectAnimator.setInterpolator(new DecelerateInterpolator());
                    viewOnClickListenerC5103.f16006 = z;
                    m6981 = C0630.m2566("ᩳۡ") ^ i25;
                    i7 = ((m6981 ^ i24) * (-24509)) ^ (-386165261);
                    i8 = -1139643051;
                    i27 = m6981 ^ i8;
                    i26 = i7;
                    i29 = i2;
                case -401967716:
                case 441498007:
                    i2 = i29;
                    i17 = i34;
                    i10 = i32;
                    sArr = sArr5;
                    z3 = true;
                    m69814 = C0630.m2566("ᩴ᩵") ^ i24;
                    i19 = ((m69814 ^ i25) * (-32219)) ^ 1823882295;
                    i20 = -1011282520;
                    i32 = i10;
                    sArr5 = sArr;
                    i29 = i2;
                    i18 = i17;
                    i27 = m69814 ^ i20;
                    i26 = i19;
                    i34 = i18;
                case -399314004:
                case 1663665051:
                    ObjectAnimator objectAnimator7 = viewOnClickListenerC5103.f16005;
                    C2167.m7151(objectAnimator7);
                    C22628.m50603(objectAnimator7);
                    break;
                case -346422745:
                case -61399721:
                    i = i29;
                    objectAnimator3 = C0798.m3008(objectAnimator2, 500L);
                    viewOnClickListenerC5103.f16005 = objectAnimator3;
                    C2167.m7151(objectAnimator3);
                    if (C2167.m7155()) {
                        i2 = i;
                        i6 = i34;
                        i5 = i32;
                        sArr3 = sArr5;
                        m69813 = (C2105.m6981("۠ۢ") + i25) * 3;
                        i26 = ((m69813 ^ i24) * 16361) ^ 287425477;
                        i16 = 567894238;
                        i15 = m69813 ^ i16;
                        i32 = i5;
                        sArr5 = sArr3;
                        i29 = i2;
                        i34 = i6;
                        i27 = i15;
                        viewOnClickListenerC5103 = this;
                    } else {
                        m2566 = (C0630.m2566("ᩴ۫") + i25) * (-3);
                        i3 = ((m2566 ^ i24) * (-2019)) ^ 2105818183;
                        i4 = 21341457;
                        i27 = m2566 ^ i4;
                        int i36222 = i3;
                        i29 = i;
                        i26 = i36222;
                    }
                case -284299645:
                case 1482547865:
                    i6 = i34;
                    i2 = i29;
                    str = str6;
                    i5 = i32;
                    sArr3 = sArr5;
                    s = sArr4[c];
                    i30 = s * 2;
                    if (C4117.f13076 > 0) {
                        m69812 = C2105.m6981("۫᩷") ^ i25;
                        i13 = ((m69812 ^ i24) * (-28485)) ^ 541081974;
                        i14 = 704818011;
                        i15 = m69812 ^ i14;
                        str6 = str;
                        i26 = i13;
                        i32 = i5;
                        sArr5 = sArr3;
                        i29 = i2;
                        i34 = i6;
                        i27 = i15;
                        viewOnClickListenerC5103 = this;
                    }
                    sArr5 = sArr3;
                    int m25664222 = C0630.m2566("۠ۧ") ^ i24;
                    int i35222 = ((m25664222 ^ i25) * (-13635)) ^ 294032715;
                    i15 = m25664222 ^ (-978744189);
                    str6 = str;
                    i26 = i35222;
                    i32 = i5;
                    i29 = i2;
                    i34 = i6;
                    i27 = i15;
                    viewOnClickListenerC5103 = this;
                case -4072526:
                case 1293260444:
                    i6 = i34;
                    i2 = i29;
                    str = str6;
                    i5 = i32;
                    sArr3 = sArr5;
                    int i40 = s + s2;
                    if (i31 - (i40 * i40) <= 0) {
                        m69812 = C2105.m6981("ۨ᩷") ^ i24;
                        i13 = ((m69812 ^ i25) * (-19503)) ^ (-1734022835);
                        i14 = 942293070;
                    } else {
                        m69812 = (C0630.m2566("ᩳۛ") ^ i24) * (-103);
                        i13 = ((m69812 ^ i25) * 20907) ^ 837080779;
                        i14 = -20935077;
                    }
                    i15 = m69812 ^ i14;
                    str6 = str;
                    i26 = i13;
                    i32 = i5;
                    sArr5 = sArr3;
                    i29 = i2;
                    i34 = i6;
                    i27 = i15;
                    viewOnClickListenerC5103 = this;
                case 592082577:
                case 1457868939:
                    C2126.m7040();
                    if (C7811.f24123 < 0) {
                        m25662 = C0630.m2566("ܰ۫") ^ i24;
                        i21 = ((m25662 ^ i25) * 31685) ^ (-1892879672);
                        i22 = 1816273047;
                        i27 = m25662 ^ i22;
                        i26 = i21;
                    } else {
                        i6 = i34;
                        i2 = i29;
                        i5 = i32;
                        sArr3 = sArr5;
                        m69813 = (C2105.m6981("۠ۢ") + i25) * 3;
                        i26 = ((m69813 ^ i24) * 16361) ^ 287425477;
                        i16 = 567894238;
                        i15 = m69813 ^ i16;
                        i32 = i5;
                        sArr5 = sArr3;
                        i29 = i2;
                        i34 = i6;
                        i27 = i15;
                        viewOnClickListenerC5103 = this;
                    }
                case 626615612:
                case 1048248452:
                    i2 = i29;
                    i5 = i32;
                    f4 = view.getRotation();
                    i28 = 2;
                    sArr5 = f16002;
                    i33 = 2;
                    if (C0964.f3626 != 0) {
                        i6 = i34;
                        str = str6;
                        int m256642222 = C0630.m2566("۠ۧ") ^ i24;
                        int i352222 = ((m256642222 ^ i25) * (-13635)) ^ 294032715;
                        i15 = m256642222 ^ (-978744189);
                        str6 = str;
                        i26 = i352222;
                        i32 = i5;
                        i29 = i2;
                        i34 = i6;
                        i27 = i15;
                        viewOnClickListenerC5103 = this;
                    } else {
                        int m69818 = C2105.m6981("֫֨") ^ i25;
                        i27 = m69818 ^ 2100488481;
                        i32 = i5;
                        i26 = ((m69818 ^ i24) * (-8879)) ^ 970013563;
                        i29 = i2;
                    }
                case 689043531:
                case 1476129055:
                    i2 = i29;
                    i11 = i32;
                    sArr2 = sArr5;
                    i12 = i33;
                    str3 = C2167.m7159(sArr2, i12, 8, i11);
                    f = 0.0f;
                    if (f4 == 0.0f) {
                        int m698162 = C2105.m6981("ۛ᩷") ^ i25;
                        int i382 = ((m698162 ^ i24) * (-33)) ^ 532728214;
                        i27 = m698162 ^ 937872871;
                        i33 = i12;
                        i32 = i11;
                        sArr5 = sArr2;
                        i29 = i2;
                        str5 = str3;
                        i26 = i382;
                    } else {
                        int m69819 = (i25 - C2105.m6981("ۨ֨")) * 37;
                        int i41 = ((m69819 ^ i24) * 17287) ^ 884998373;
                        i27 = m69819 ^ (-241012370);
                        i33 = i12;
                        i32 = i11;
                        sArr5 = sArr2;
                        i29 = i2;
                        str5 = str3;
                        i26 = i41;
                        f = 0.0f;
                    }
                case 701936502:
                case 2064567671:
                    i = i29;
                    viewOnClickListenerC5103.f16003 = (z4 ? 1 : 0) ^ (z ? 1 : 0);
                    f2 = view.getRotation();
                    float f5 = -i34;
                    if (C3245.f10203 <= 0) {
                        f3 = f5;
                        m2566 = C2105.m6981("᩺ۗ") ^ i25;
                        i3 = ((m2566 ^ i24) * (-6981)) ^ 1468375432;
                        i4 = -1947590493;
                        i27 = m2566 ^ i4;
                        int i362222 = i3;
                        i29 = i;
                        i26 = i362222;
                    } else {
                        int m698110 = C2105.m6981("ᩴ᩹") ^ i24;
                        i2 = i;
                        i26 = ((m698110 ^ i25) * 8915) ^ (-494909894);
                        i27 = m698110 ^ (-1843419659);
                        f3 = f5;
                        i29 = i2;
                    }
                case 812986989:
                case 1678817795:
                    C22628.m50615();
                    if (C0237.f1507 == 0) {
                        i6 = i34;
                        i2 = i29;
                        str = str6;
                        i5 = i32;
                        sArr3 = sArr5;
                        m69812 = C2105.m6981("ۡۜ") ^ i25;
                        i13 = ((m69812 ^ i24) * 12797) ^ 1667844365;
                        i14 = -900379415;
                        i15 = m69812 ^ i14;
                        str6 = str;
                        i26 = i13;
                        i32 = i5;
                        sArr5 = sArr3;
                        i29 = i2;
                        i34 = i6;
                        i27 = i15;
                        viewOnClickListenerC5103 = this;
                    }
                    i6 = i34;
                    i2 = i29;
                    str = str6;
                    i5 = i32;
                    int m2566422222 = C0630.m2566("۠ۧ") ^ i24;
                    int i3522222 = ((m2566422222 ^ i25) * (-13635)) ^ 294032715;
                    i15 = m2566422222 ^ (-978744189);
                    str6 = str;
                    i26 = i3522222;
                    i32 = i5;
                    i29 = i2;
                    i34 = i6;
                    i27 = i15;
                    viewOnClickListenerC5103 = this;
                case 1043858060:
                case 2116157312:
                    i6 = i34;
                    i2 = i29;
                    str = str6;
                    i5 = i32;
                    sArr3 = sArr5;
                    i31 = i30 + 1;
                    s2 = 1;
                    if (C0483.f2088 < 0) {
                        m69812 = C0630.m2566("ۡۧ") ^ i25;
                        i13 = ((m69812 ^ i24) * 13805) ^ (-44461926);
                        i14 = 423030413;
                        i15 = m69812 ^ i14;
                        str6 = str;
                        i26 = i13;
                        i32 = i5;
                        sArr5 = sArr3;
                        i29 = i2;
                        i34 = i6;
                        i27 = i15;
                        viewOnClickListenerC5103 = this;
                    }
                    sArr5 = sArr3;
                    int m25664222222 = C0630.m2566("۠ۧ") ^ i24;
                    int i35222222 = ((m25664222222 ^ i25) * (-13635)) ^ 294032715;
                    i15 = m25664222222 ^ (-978744189);
                    str6 = str;
                    i26 = i35222222;
                    i32 = i5;
                    i29 = i2;
                    i34 = i6;
                    i27 = i15;
                    viewOnClickListenerC5103 = this;
                case 1294677257:
                case 1357454176:
                    i6 = i34;
                    i2 = i29;
                    i5 = i32;
                    sArr3 = sArr5;
                    str6 = C0050.m948(f16002, 1, 1, i5);
                    if (C3537.m10746() > 0) {
                        m69813 = (i25 - C2105.m6981("۠ܳ")) * (-15);
                        i26 = ((m69813 ^ i24) * (-22547)) ^ (-1191039518);
                        i16 = -915614106;
                        i15 = m69813 ^ i16;
                        i32 = i5;
                        sArr5 = sArr3;
                        i29 = i2;
                        i34 = i6;
                        i27 = i15;
                        viewOnClickListenerC5103 = this;
                    }
                    m69813 = (C2105.m6981("۠ۢ") + i25) * 3;
                    i26 = ((m69813 ^ i24) * 16361) ^ 287425477;
                    i16 = 567894238;
                    i15 = m69813 ^ i16;
                    i32 = i5;
                    sArr5 = sArr3;
                    i29 = i2;
                    i34 = i6;
                    i27 = i15;
                    viewOnClickListenerC5103 = this;
                default:
                    i2 = i29;
                    objectAnimator = C1711.m5730(C5695.m16025(view, str5, fArr), 800L);
                    if (!C2272.f7362) {
                        m6981 = (C0630.m2566("᩺᩺") ^ i24) * (-67);
                        i7 = ((m6981 ^ i25) * 10899) ^ (-1875258570);
                        i8 = 1655066395;
                        i27 = m6981 ^ i8;
                        i26 = i7;
                        i29 = i2;
                    }
                    m6981 = (C0630.m2566("ܳ֨") + i25) * 3;
                    i7 = ((m6981 ^ i24) * (-9439)) ^ (-1828628540);
                    i8 = 1144869777;
                    i27 = m6981 ^ i8;
                    i26 = i7;
                    i29 = i2;
            }
            return;
        }
    }
}
