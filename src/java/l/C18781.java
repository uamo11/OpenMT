package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* compiled from: JAGX */
/* renamed from: l.ᩴ۬ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18781 {

    /* renamed from: ֨᩷ܳ, reason: not valid java name and contains not printable characters */
    private static final short[] f59290 = {1356, 10596, 3340, -15199, 10177, -9380, -13305, -8776, 16064, 1944, 15350, 12563, -9408, 1130, 18053, 20381, 21775, 17123, -24262, 22830, 29262, -22151, 19222, 23947, 27434, -17846, 15384, 15386, -16914, 22428, -23363, 19684, -20274, -16602, 22442, 25063, 24589, 15371, 2438, -4821, -4806, -4817, -4813, -4824, -4803, -4814, -4809, -4802, -4816, -4802, -4802, -4821, -4838, -4821, -4816, -4856, -4814, -4804, -4839, -4809, -4812, -4808, -4816};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f59291;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f59292;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16560 f59293;

    public C18781(AbstractC15440 abstractC15440, C16560 c16560, String str) {
        ArrayList arrayList = null;
        int i = 1669448887;
        int i2 = C5695.f17556;
        int i3 = C3245.f10203;
        int m6981 = (C2105.m6981("ۘۖ") ^ i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
        int i4 = ((m6981 ^ i3) * 16691) ^ 2071855177;
        int i5 = 272633075;
        while (true) {
            i = ((((i ^ i3) * (-19375)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1891405270:
                case -1790230353:
                    if (C0050.f910 >= 0) {
                        m6981 = C0630.m2566("᩵۬") ^ i3;
                        i4 = ((m6981 ^ i2) * 13939) ^ 706261226;
                        i5 = 1982548533;
                    } else {
                        m6981 = C2105.m6981("ۧ۬") ^ i2;
                        i4 = ((m6981 ^ i3) * (-22865)) ^ (-463488591);
                        i5 = 552977198;
                    }
                case -1647914430:
                case -259080067:
                    C3432.m10477();
                    m6981 = C0630.m2566("᩵۬") ^ i3;
                    i4 = ((m6981 ^ i2) * 13939) ^ 706261226;
                    i5 = 1982548533;
                case -1600055809:
                case -514730034:
                    this.f59291 = abstractC15440;
                    if (C0964.m3413()) {
                        C0964.m3402(new C15957(this, c16560, abstractC15440, str));
                        return;
                    }
                    m6981 = C0630.m2566("᩵۬") ^ i3;
                    i4 = ((m6981 ^ i2) * 13939) ^ 706261226;
                    i5 = 1982548533;
                case -1411019713:
                case 1743347247:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-20929)) ^ 1652021724;
                        i5 = 1966572303;
                    } else {
                        m6981 = (i2 - C0630.m2566("۫᩵")) * 37;
                        i4 = ((m6981 ^ i3) * (-28249)) ^ (-375046469);
                        i5 = 990555032;
                    }
                case -1040991523:
                case 1943957849:
                    this.f59292 = arrayList;
                    if (C1047.f3863 >= 0) {
                        m6981 = C2105.m6981("᩵ܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * 5707) ^ 841229890;
                        i5 = 498785090;
                    } else {
                        m6981 = C0630.m2566("ۤ᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * (-20291)) ^ (-1584485627);
                        i5 = 1416474892;
                    }
                case -862400150:
                case 415696483:
                    C1047.m3599();
                    if (C7811.f24123 >= 0) {
                        m6981 = C0630.m2566("᩵۬") ^ i3;
                        i4 = ((m6981 ^ i2) * 13939) ^ 706261226;
                        i5 = 1982548533;
                    } else {
                        m6981 = C0630.m2566("֫ۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-13651)) ^ (-238232944);
                        i5 = -1954259094;
                    }
                case -686600785:
                case -180196628:
                    if (C2105.f7037 != 0) {
                        m6981 = C0630.m2566("֫ۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-13651)) ^ (-238232944);
                        i5 = -1954259094;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۙۚ")) * (-27);
                        i4 = ((m6981 ^ i2) * (-8923)) ^ 1362296097;
                        i5 = -771114071;
                    }
                case -428195014:
                case 1464731367:
                    if (C3019.f9544 < 0) {
                        m6981 = C0630.m2566("᩵۬") ^ i3;
                        i4 = ((m6981 ^ i2) * 13939) ^ 706261226;
                        i5 = 1982548533;
                    } else {
                        m6981 = C2105.m6981("᩵ܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * 5707) ^ 841229890;
                        i5 = 498785090;
                    }
                case -271063894:
                case 1723058604:
                    if (C1773.f6144 <= 0) {
                        m6981 = C2105.m6981("᩵ܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * 5707) ^ 841229890;
                        i5 = 498785090;
                    } else {
                        m6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-20929)) ^ 1652021724;
                        i5 = 1966572303;
                    }
                case 362152792:
                case 1414605130:
                    C1047.m3599();
                    C4075.m12263();
                    throw new RuntimeException();
                case 791686937:
                case 981467333:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C0630.m2566("֫ۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-13651)) ^ (-238232944);
                        i5 = -1954259094;
                    } else {
                        m6981 = C0630.m2566("᩶᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 22751) ^ 1031277542;
                        i5 = -684164032;
                    }
                case 908445776:
                case 1490620264:
                    arrayList = new ArrayList();
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-20929)) ^ 1652021724;
                        i5 = 1966572303;
                    } else {
                        m6981 = (i2 - C0630.m2566("ܶۗ")) * (-55);
                        i4 = ((m6981 ^ i3) * 28661) ^ (-1748422790);
                        i5 = 869895395;
                    }
                case 975821576:
                case 1210159491:
                    if (C1773.m5908() <= 0) {
                        m6981 = C0630.m2566("۬۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-20929)) ^ 1652021724;
                        i5 = 1966572303;
                    } else {
                        m6981 = C2105.m6981("ۤۤ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-17721)) ^ 1763247209;
                        i5 = 1167121095;
                    }
                case 1442251826:
                case 1981028722:
                    this.f59293 = c16560;
                    if (C0964.m3413()) {
                        m6981 = C2105.m6981("ۛۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * 24975) ^ (-651918560);
                        i5 = 1301737160;
                    } else {
                        m6981 = C2105.m6981("᩵ᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-13475)) ^ (-2031980759);
                        i5 = -287127651;
                    }
                default:
                    if (C1773.f6144 <= 0) {
                        m6981 = C0630.m2566("֫ۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-13651)) ^ (-238232944);
                        i5 = -1954259094;
                    } else {
                        m6981 = C2105.m6981("ܳܶ") ^ i2;
                        i4 = ((m6981 ^ i3) * 22913) ^ (-1180466473);
                        i5 = -685892292;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43438(final C18781 c18781, final String str) {
        int i;
        short[] sArr;
        View view;
        short[] sArr2;
        int i2;
        short[] sArr3;
        int i3;
        short[] sArr4;
        int i4;
        int i5;
        int m2566;
        short[] sArr5;
        int i6;
        int i7;
        int i8;
        short[] sArr6;
        View view2;
        short[] sArr7;
        int i9;
        Main main;
        short[] sArr8;
        View view3;
        short[] sArr9;
        int i10;
        short[] sArr10;
        int i11;
        int i12;
        short s;
        int i13;
        int i14;
        int m6981;
        int i15;
        int i16;
        int i17;
        int m69812;
        int i18;
        int i19;
        View view4;
        int m69813;
        int i20;
        int i21;
        int m69814;
        int i22;
        int i23;
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        int i24 = -2062211178;
        int i25 = C1420.f5096;
        int i26 = C2167.f7158;
        int m25662 = C0630.m2566("᩶ܽ") ^ i26;
        int i27 = ((m25662 ^ i25) * (-16833)) ^ 1479903149;
        int i28 = m25662 ^ (-55607014);
        C14336 c14336 = null;
        Iterator it = null;
        StringBuilder sb = null;
        String str2 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        int i29 = 0;
        int i30 = 0;
        C13876 c13876 = null;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        short s2 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        TextView textView = null;
        C19258 c19258 = null;
        String str3 = null;
        HashSet hashSet = null;
        String str4 = null;
        int i41 = 0;
        C13132 c13132 = null;
        short[] sArr15 = null;
        View view5 = null;
        final Main main2 = null;
        while (true) {
            i24 = i28 ^ (i27 & (((i24 ^ i25) * 4435) >> 31));
            switch (i24) {
                case -2086442972:
                case 1472792896:
                    C3019.m9255();
                    i = i29;
                    sArr = sArr15;
                    view = view5;
                    sArr2 = sArr11;
                    i2 = i39;
                    sArr3 = sArr12;
                    i3 = i40;
                    sArr4 = sArr13;
                    i4 = i38;
                    int m69815 = (i25 - C2105.m6981("֡۬")) * (-65);
                    int i42 = i2;
                    i27 = ((m69815 ^ i26) * (-31805)) ^ 2104474169;
                    sArr11 = sArr2;
                    i38 = i4;
                    i40 = i3;
                    sArr13 = sArr4;
                    i29 = i;
                    sArr15 = sArr;
                    sArr12 = sArr3;
                    view5 = view;
                    i28 = m69815 ^ 2123947851;
                    i39 = i42;
                case -2069335795:
                case 42110898:
                    i = i29;
                    sArr = sArr15;
                    view = view5;
                    sArr5 = sArr11;
                    i5 = i39;
                    sArr3 = sArr12;
                    i3 = i40;
                    sArr4 = sArr13;
                    i4 = i38;
                    i30 = 57922;
                    m2566 = C2105.m6981("ܶܿ") ^ i25;
                    i6 = ((m2566 ^ i26) * 19245) ^ 1851050991;
                    i7 = 1440921741;
                    i17 = m2566 ^ i7;
                    i38 = i4;
                    i40 = i3;
                    sArr13 = sArr4;
                    sArr15 = sArr;
                    sArr12 = sArr3;
                    view5 = view;
                    sArr11 = sArr5;
                    i39 = i5;
                    i28 = i17;
                    i27 = i6;
                    i29 = i;
                case -2023043307:
                case 410956529:
                    C17159 c17159 = (C17159) RunnableC1108.m3791(it);
                    sb = new StringBuilder();
                    C1420.m4905(sb, c17159.m40256());
                    sArr14 = f59290;
                    m69814 = C2105.m6981("۟ܰ") ^ i26;
                    i22 = ((m69814 ^ i25) * 18019) ^ (-683951548);
                    i23 = 542063269;
                    i28 = m69814 ^ i23;
                    i27 = i22;
                case -2004442247:
                case -500797056:
                    i9 = i29;
                    View view6 = view5;
                    TextView textView2 = textView;
                    C0630.m2570(textView2, i33 ^ 2120993727);
                    C4915.m14286(c13132);
                    short[] sArr16 = f59290;
                    if (C7811.f24123 >= 0) {
                        view3 = view6;
                        textView = textView2;
                        sArr7 = sArr13;
                        sArr8 = sArr15;
                        s = s2;
                        sArr9 = sArr11;
                        i12 = i38;
                        i10 = i39;
                        sArr10 = sArr12;
                        i11 = i40;
                        main = main2;
                        int m25663 = C0630.m2566("ۛ᩷") ^ i25;
                        i13 = ((m25663 ^ i26) * (-27589)) ^ 447068142;
                        i14 = m25663 ^ (-680361607);
                        i38 = i12;
                        i40 = i11;
                        sArr13 = sArr7;
                        sArr15 = sArr8;
                        sArr12 = sArr10;
                        view5 = view3;
                        sArr11 = sArr9;
                        i39 = i10;
                        c13876 = null;
                        i28 = i14;
                        i29 = i9;
                        Main main3 = main;
                        s2 = s;
                        i27 = i13;
                        main2 = main3;
                    } else {
                        textView = textView2;
                        short[] sArr17 = sArr13;
                        c13876 = new C13876(C13876.m33247(C11340.m28025(sArr16, 26, 2, i30)));
                        c14336 = C14336.m34211(c18781.f59292);
                        int m25664 = (C0630.m2566("ۧ֨") ^ i25) * (-47);
                        i = i9;
                        i6 = ((m25664 ^ i26) * 8621) ^ (-1330241888);
                        i28 = m25664 ^ (-1934645226);
                        sArr13 = sArr17;
                        view5 = view6;
                        i27 = i6;
                        i29 = i;
                    }
                case -1998816386:
                case -231977798:
                    i = i29;
                    view4 = view5;
                    if (C0483.m2123(it)) {
                        m69813 = C0630.m2566("ܽ۠") ^ i26;
                        i20 = ((m69813 ^ i25) * 13789) ^ 1995626729;
                        i21 = -1054287468;
                    } else {
                        m69813 = (i26 - C2105.m6981("ܳܽ")) * 83;
                        i20 = ((m69813 ^ i25) * 8991) ^ 818154241;
                        i21 = 881965898;
                    }
                    i28 = m69813 ^ i21;
                    view5 = view4;
                    i27 = i20;
                    i29 = i;
                case -1971746466:
                case 1243086576:
                    i = i29;
                    sArr = sArr15;
                    view = view5;
                    sArr5 = sArr11;
                    i5 = i39;
                    sArr3 = sArr12;
                    i3 = i40;
                    sArr4 = sArr13;
                    i4 = i38;
                    i30 = 15396;
                    m2566 = C2105.m6981("ܶܿ") ^ i25;
                    i6 = ((m2566 ^ i26) * 19245) ^ 1851050991;
                    i7 = 1440921741;
                    i17 = m2566 ^ i7;
                    i38 = i4;
                    i40 = i3;
                    sArr13 = sArr4;
                    sArr15 = sArr;
                    sArr12 = sArr3;
                    view5 = view;
                    sArr11 = sArr5;
                    i39 = i5;
                    i28 = i17;
                    i27 = i6;
                    i29 = i;
                case -1902492131:
                case 637155003:
                    i9 = i29;
                    main = main2;
                    sArr8 = sArr15;
                    view3 = view5;
                    sArr9 = sArr11;
                    i10 = i39;
                    sArr10 = sArr12;
                    i11 = i40;
                    sArr7 = sArr13;
                    i12 = i38;
                    s = f59290[13];
                    i35 = s * s;
                    i36 = 66683556;
                    if (!C0382.m1848()) {
                        int m25665 = (C0630.m2566("ۗܶ") ^ i25) * (-111);
                        i13 = ((m25665 ^ i26) * 26429) ^ (-152295962);
                        i14 = m25665 ^ (-1732345027);
                        i38 = i12;
                        i40 = i11;
                        sArr13 = sArr7;
                        sArr15 = sArr8;
                        sArr12 = sArr10;
                        view5 = view3;
                        sArr11 = sArr9;
                        i39 = i10;
                        i28 = i14;
                        i29 = i9;
                        Main main32 = main;
                        s2 = s;
                        i27 = i13;
                        main2 = main32;
                    }
                    int m256632 = C0630.m2566("ۛ᩷") ^ i25;
                    i13 = ((m256632 ^ i26) * (-27589)) ^ 447068142;
                    i14 = m256632 ^ (-680361607);
                    i38 = i12;
                    i40 = i11;
                    sArr13 = sArr7;
                    sArr15 = sArr8;
                    sArr12 = sArr10;
                    view5 = view3;
                    sArr11 = sArr9;
                    i39 = i10;
                    c13876 = null;
                    i28 = i14;
                    i29 = i9;
                    Main main322 = main;
                    s2 = s;
                    i27 = i13;
                    main2 = main322;
                case -1887204195:
                case 1371401901:
                    i8 = i29;
                    sArr7 = sArr13;
                    sArr6 = sArr15;
                    short[] sArr18 = sArr12;
                    int i43 = i40;
                    View m9259 = C3019.m9259(main2, i41 ^ i32);
                    String m16034 = C5695.m16034(f59290, 17, 3, i30);
                    if (C4616.f14690 <= 0) {
                        i40 = i43;
                        sArr12 = sArr18;
                        str4 = m16034;
                        view2 = m9259;
                        m69812 = C0630.m2566("ۖᩳ") ^ i26;
                        i18 = ((m69812 ^ i25) * 28749) ^ (-971629177);
                        i19 = -1902154949;
                        i28 = m69812 ^ i19;
                        i29 = i8;
                        sArr15 = sArr6;
                        short[] sArr19 = sArr7;
                        view5 = view2;
                        i27 = i18;
                        sArr13 = sArr19;
                    } else {
                        int m25666 = (C0630.m2566("ܶ᩹") ^ i25) * (-67);
                        int i44 = ((m25666 ^ i26) * 15023) ^ (-264724206);
                        i28 = m25666 ^ (-1603329282);
                        i40 = i43;
                        i29 = i8;
                        sArr15 = sArr6;
                        sArr12 = sArr18;
                        str4 = m16034;
                        i27 = i44;
                        sArr13 = sArr7;
                        view5 = m9259;
                    }
                case -1799834607:
                case 233623301:
                    if (C7811.f24123 < 0) {
                        i8 = i29;
                        sArr6 = sArr15;
                        view2 = view5;
                        sArr7 = sArr13;
                        m69812 = C0630.m2566("ۖᩳ") ^ i26;
                        i18 = ((m69812 ^ i25) * 28749) ^ (-971629177);
                        i19 = -1902154949;
                        i28 = m69812 ^ i19;
                        i29 = i8;
                        sArr15 = sArr6;
                        short[] sArr192 = sArr7;
                        view5 = view2;
                        i27 = i18;
                        sArr13 = sArr192;
                    } else {
                        m69814 = (i26 - C0630.m2566("ۙܽ")) * 83;
                        i22 = ((m69814 ^ i25) * 23849) ^ 1679311456;
                        i23 = 2129314893;
                        i28 = m69814 ^ i23;
                        i27 = i22;
                    }
                case -1638524574:
                case -1123214917:
                    i = i29;
                    sArr = sArr15;
                    view = view5;
                    sArr2 = sArr11;
                    i2 = i39;
                    sArr3 = sArr12;
                    i3 = i40;
                    sArr4 = sArr13;
                    i4 = i38;
                    i41 = C0630.m2566(C1294.m4373(sArr2, i4, i2, i30));
                    i32 = 2128069204;
                    if (C1711.f5919) {
                        int m698152 = (i25 - C2105.m6981("֡۬")) * (-65);
                        int i422 = i2;
                        i27 = ((m698152 ^ i26) * (-31805)) ^ 2104474169;
                        sArr11 = sArr2;
                        i38 = i4;
                        i40 = i3;
                        sArr13 = sArr4;
                        i29 = i;
                        sArr15 = sArr;
                        sArr12 = sArr3;
                        view5 = view;
                        i28 = m698152 ^ 2123947851;
                        i39 = i422;
                    } else {
                        i5 = i2;
                        m2566 = C0630.m2566("ۧۜ") ^ i25;
                        sArr5 = sArr2;
                        i6 = ((m2566 ^ i26) * (-1025)) ^ 755743401;
                        i7 = -867595300;
                        i17 = m2566 ^ i7;
                        i38 = i4;
                        i40 = i3;
                        sArr13 = sArr4;
                        sArr15 = sArr;
                        sArr12 = sArr3;
                        view5 = view;
                        sArr11 = sArr5;
                        i39 = i5;
                        i28 = i17;
                        i27 = i6;
                        i29 = i;
                    }
                case -1635880089:
                case -1098458535:
                    i9 = i29;
                    sArr8 = sArr15;
                    view2 = view5;
                    sArr7 = sArr13;
                    short[] sArr20 = sArr12;
                    i11 = i40;
                    i37 = C2105.m6981(C4075.m12252(sArr20, i11, 3, i30)) ^ 2117266367;
                    if (C3432.f10845 >= 0) {
                        view3 = view2;
                        sArr10 = sArr20;
                        s = s2;
                        sArr9 = sArr11;
                        i12 = i38;
                        i10 = i39;
                        main = main2;
                        int m2566322 = C0630.m2566("ۛ᩷") ^ i25;
                        i13 = ((m2566322 ^ i26) * (-27589)) ^ 447068142;
                        i14 = m2566322 ^ (-680361607);
                        i38 = i12;
                        i40 = i11;
                        sArr13 = sArr7;
                        sArr15 = sArr8;
                        sArr12 = sArr10;
                        view5 = view3;
                        sArr11 = sArr9;
                        i39 = i10;
                        c13876 = null;
                        i28 = i14;
                        i29 = i9;
                        Main main3222 = main;
                        s2 = s;
                        i27 = i13;
                        main2 = main3222;
                    } else {
                        int m25667 = (C0630.m2566("᩺ܶ") ^ i26) * 87;
                        i18 = ((m25667 ^ i25) * (-29191)) ^ 1221192275;
                        i28 = m25667 ^ (-1636490382);
                        i40 = i11;
                        i29 = i9;
                        sArr15 = sArr8;
                        sArr12 = sArr20;
                        short[] sArr1922 = sArr7;
                        view5 = view2;
                        i27 = i18;
                        sArr13 = sArr1922;
                    }
                case -1478866234:
                case -1202905996:
                    i31 = C2105.m6981(str3) ^ 2129058849;
                    sArr15 = f59290;
                    i29 = 31;
                    m69814 = (i26 - C2105.m6981("ᩳۡ")) * (-65);
                    i22 = ((m69814 ^ i25) * (-1139)) ^ 1245017906;
                    i23 = 1724947868;
                    i28 = m69814 ^ i23;
                    i27 = i22;
                case -1232267937:
                case -115774798:
                    C1420.m4905(sb, C2167.m7159(sArr14, 37, 1, i30));
                    ServiceConnectionC3453.m10557(hashSet, C0050.m947(sb));
                    i = i29;
                    view4 = view5;
                    m69813 = (i26 - C2105.m6981("᩷᩸")) * (-37);
                    i20 = ((m69813 ^ i25) * 14557) ^ 1313200931;
                    i21 = 1691642301;
                    i28 = m69813 ^ i21;
                    view5 = view4;
                    i27 = i20;
                    i29 = i;
                case -1224161996:
                case -358633974:
                    i34 = C2105.m6981(C2105.m6988(sArr15, i29, 3, i30));
                    if (C1773.f6144 <= 0) {
                        i8 = i29;
                        sArr6 = sArr15;
                        view2 = view5;
                        sArr7 = sArr13;
                        m69812 = C0630.m2566("ۖᩳ") ^ i26;
                        i18 = ((m69812 ^ i25) * 28749) ^ (-971629177);
                        i19 = -1902154949;
                        i28 = m69812 ^ i19;
                        i29 = i8;
                        sArr15 = sArr6;
                        short[] sArr19222 = sArr7;
                        view5 = view2;
                        i27 = i18;
                        sArr13 = sArr19222;
                    } else {
                        m69814 = (C0630.m2566("ܶᩴ") ^ i26) * (-83);
                        i22 = ((m69814 ^ i25) * (-21887)) ^ 505284820;
                        i23 = -1129247510;
                        i28 = m69814 ^ i23;
                        i27 = i22;
                    }
                case -1221687242:
                case -1221291812:
                    ServiceConnectionC3453.m10564();
                    break;
                case -1182201275:
                case 1112823908:
                    i8 = i29;
                    view2 = view5;
                    sArr7 = sArr13;
                    c13132 = (C13132) C11340.m28028(view2, i37);
                    sArr6 = sArr15;
                    i33 = C0630.m2566(C2126.m7036(f59290, 23, 3, i30));
                    if (C4616.f14690 > 0) {
                        m69812 = (i25 - C0630.m2566("ۚᩳ")) * 29;
                        i18 = ((m69812 ^ i26) * 12795) ^ (-405003734);
                        i19 = 626618966;
                        i28 = m69812 ^ i19;
                        i29 = i8;
                        sArr15 = sArr6;
                        short[] sArr192222 = sArr7;
                        view5 = view2;
                        i27 = i18;
                        sArr13 = sArr192222;
                    }
                    m69812 = C2105.m6981("ۙܺ") ^ i25;
                    i18 = ((m69812 ^ i26) * (-26945)) ^ (-5644382);
                    i19 = 1973874974;
                    i28 = m69812 ^ i19;
                    i29 = i8;
                    sArr15 = sArr6;
                    short[] sArr1922222 = sArr7;
                    view5 = view2;
                    i27 = i18;
                    sArr13 = sArr1922222;
                case -866218167:
                case 64435942:
                    i = i29;
                    short[] sArr21 = sArr15;
                    View view7 = view5;
                    short[] sArr22 = sArr11;
                    int i45 = i39;
                    short[] sArr23 = sArr12;
                    int i46 = i40;
                    short[] sArr24 = sArr13;
                    int i47 = i38;
                    int i48 = i35 + i36;
                    short s3 = s2;
                    Main main4 = main2;
                    int i49 = s3 + 8166;
                    if ((i49 * i49) - (i48 + i48) > 0) {
                        m6981 = C2105.m6981("ۗ۬") ^ i26;
                        i15 = ((m6981 ^ i25) * 9255) ^ 396197742;
                        i16 = 1576937438;
                    } else {
                        m6981 = (i26 - C2105.m6981("ۨۚ")) * 5;
                        i15 = ((m6981 ^ i25) * 11761) ^ (-610703042);
                        i16 = 1958449908;
                    }
                    int i50 = m6981 ^ i16;
                    i38 = i47;
                    i40 = i46;
                    sArr13 = sArr24;
                    sArr15 = sArr21;
                    sArr12 = sArr23;
                    view5 = view7;
                    sArr11 = sArr22;
                    i39 = i45;
                    i28 = i50;
                    i27 = i15;
                    main2 = main4;
                    s2 = s3;
                    i29 = i;
                case -810307158:
                case 877053458:
                    dialogInterfaceC0206 = C7187.m19253(c19258, i31, (DialogInterface.OnClickListener) null, i34 ^ 2125124934, (DialogInterface.OnClickListener) null);
                    sArr13 = f59290;
                    m69814 = (C2105.m6981("᩶᩹") + i25) * 59;
                    i22 = ((m69814 ^ i26) * (-6553)) ^ 2127427940;
                    i23 = -1478268712;
                    i28 = m69814 ^ i23;
                    i27 = i22;
                case -495577211:
                case 691043844:
                    i8 = i29;
                    sArr6 = sArr15;
                    view2 = view5;
                    sArr7 = sArr13;
                    textView = (TextView) C11340.m28028(view2, C2105.m6981(str4) ^ 2128958082);
                    sArr12 = f59290;
                    i40 = 20;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m69812 = (C2105.m6981("ۜ֨") ^ i26) * (-85);
                        i18 = ((m69812 ^ i25) * 31825) ^ (-2094174140);
                        i19 = 1210793385;
                        i28 = m69812 ^ i19;
                        i29 = i8;
                        sArr15 = sArr6;
                        short[] sArr19222222 = sArr7;
                        view5 = view2;
                        i27 = i18;
                        sArr13 = sArr19222222;
                    }
                    m69812 = C0630.m2566("ۖᩳ") ^ i26;
                    i18 = ((m69812 ^ i25) * 28749) ^ (-971629177);
                    i19 = -1902154949;
                    i28 = m69812 ^ i19;
                    i29 = i8;
                    sArr15 = sArr6;
                    short[] sArr192222222 = sArr7;
                    view5 = view2;
                    i27 = i18;
                    sArr13 = sArr192222222;
                case 21388883:
                case 1172059924:
                    i = i29;
                    view4 = view5;
                    C17159 m34215 = c14336.m34215();
                    c13876.m33260(m34215);
                    HashSet hashSet2 = new HashSet();
                    it = C1047.m3596(m34215.m40251());
                    hashSet = hashSet2;
                    m69813 = (i26 - C2105.m6981("᩷᩸")) * (-37);
                    i20 = ((m69813 ^ i25) * 14557) ^ 1313200931;
                    i21 = 1691642301;
                    i28 = m69813 ^ i21;
                    view5 = view4;
                    i27 = i20;
                    i29 = i;
                case 123775701:
                case 592398076:
                    str2 = C0630.m2575(sArr13, 34, 3, i30);
                    if (C4159.f13567) {
                        m69814 = (C2105.m6981("ۧۛ") + i25) * (-105);
                        i22 = ((m69814 ^ i26) * (-5427)) ^ 1942206084;
                        i23 = 1748711821;
                        i28 = m69814 ^ i23;
                        i27 = i22;
                    } else {
                        i9 = i29;
                        sArr8 = sArr15;
                        s = s2;
                        view3 = view5;
                        sArr9 = sArr11;
                        i10 = i39;
                        sArr10 = sArr12;
                        i11 = i40;
                        main = main2;
                        sArr7 = sArr13;
                        i12 = i38;
                        int m25663222 = C0630.m2566("ۛ᩷") ^ i25;
                        i13 = ((m25663222 ^ i26) * (-27589)) ^ 447068142;
                        i14 = m25663222 ^ (-680361607);
                        i38 = i12;
                        i40 = i11;
                        sArr13 = sArr7;
                        sArr15 = sArr8;
                        sArr12 = sArr10;
                        view5 = view3;
                        sArr11 = sArr9;
                        i39 = i10;
                        c13876 = null;
                        i28 = i14;
                        i29 = i9;
                        Main main32222 = main;
                        s2 = s;
                        i27 = i13;
                        main2 = main32222;
                    }
                case 136478923:
                case 487571785:
                    if (C2272.m7503()) {
                        i = i29;
                        sArr = sArr15;
                        view = view5;
                        sArr2 = sArr11;
                        i2 = i39;
                        sArr3 = sArr12;
                        i3 = i40;
                        sArr4 = sArr13;
                        i4 = i38;
                        int m6981522 = (i25 - C2105.m6981("֡۬")) * (-65);
                        int i4222 = i2;
                        i27 = ((m6981522 ^ i26) * (-31805)) ^ 2104474169;
                        sArr11 = sArr2;
                        i38 = i4;
                        i40 = i3;
                        sArr13 = sArr4;
                        i29 = i;
                        sArr15 = sArr;
                        sArr12 = sArr3;
                        view5 = view;
                        i28 = m6981522 ^ 2123947851;
                        i39 = i4222;
                    } else {
                        i8 = i29;
                        sArr6 = sArr15;
                        view2 = view5;
                        sArr7 = sArr13;
                        m69812 = C2105.m6981("ۙܺ") ^ i25;
                        i18 = ((m69812 ^ i26) * (-26945)) ^ (-5644382);
                        i19 = 1973874974;
                        i28 = m69812 ^ i19;
                        i29 = i8;
                        sArr15 = sArr6;
                        short[] sArr1922222222 = sArr7;
                        view5 = view2;
                        i27 = i18;
                        sArr13 = sArr1922222222;
                    }
                case 293322783:
                case 1112867006:
                    i = i29;
                    c13876.m33255(hashSet);
                    c13876.m33282();
                    C1294.m4381(c13132, c13876);
                    c19258 = C1773.m5912(main2);
                    view4 = view5;
                    C0798.m3013(c19258, view4);
                    m69813 = (i25 - C0630.m2566("᩻᩺")) * (-43);
                    i20 = ((m69813 ^ i26) * (-1239)) ^ 1710953743;
                    i21 = -1337455237;
                    i28 = m69813 ^ i21;
                    view5 = view4;
                    i27 = i20;
                    i29 = i;
                case 371754448:
                case 1844868512:
                    i = i29;
                    main2 = C21923.m49336(c18781.f59293);
                    sArr11 = f59290;
                    i38 = 14;
                    i39 = 3;
                    int m69816 = (i26 - C2105.m6981("ۗܺ")) * 89;
                    i6 = ((m69816 ^ i25) * (-383)) ^ 1867736614;
                    i17 = m69816 ^ 278685577;
                    i40 = i40;
                    sArr13 = sArr13;
                    sArr15 = sArr15;
                    sArr12 = sArr12;
                    view5 = view5;
                    i28 = i17;
                    i27 = i6;
                    i29 = i;
                case 913109259:
                case 1098535588:
                    if (C3683.f11629 < 0) {
                        i = i29;
                        sArr = sArr15;
                        view = view5;
                        sArr2 = sArr11;
                        i2 = i39;
                        sArr3 = sArr12;
                        i3 = i40;
                        sArr4 = sArr13;
                        i4 = i38;
                        int m69815222 = (i25 - C2105.m6981("֡۬")) * (-65);
                        int i42222 = i2;
                        i27 = ((m69815222 ^ i26) * (-31805)) ^ 2104474169;
                        sArr11 = sArr2;
                        i38 = i4;
                        i40 = i3;
                        sArr13 = sArr4;
                        i29 = i;
                        sArr15 = sArr;
                        sArr12 = sArr3;
                        view5 = view;
                        i28 = m69815222 ^ 2123947851;
                        i39 = i42222;
                    } else {
                        i8 = i29;
                        sArr6 = sArr15;
                        view2 = view5;
                        sArr7 = sArr13;
                        m69812 = C0630.m2566("ۖᩳ") ^ i26;
                        i18 = ((m69812 ^ i25) * 28749) ^ (-971629177);
                        i19 = -1902154949;
                        i28 = m69812 ^ i19;
                        i29 = i8;
                        sArr15 = sArr6;
                        short[] sArr19222222222 = sArr7;
                        view5 = view2;
                        i27 = i18;
                        sArr13 = sArr19222222222;
                    }
                case 1365786551:
                case 1498047701:
                    C0798.m3004(C0630.m2566(str2) ^ 2123202150);
                    final DialogInterfaceC0206 dialogInterfaceC02062 = dialogInterfaceC0206;
                    final C13876 c138762 = c13876;
                    C2126.m7039(C22628.m50609(dialogInterfaceC0206), new View.OnClickListener(c18781) { // from class: l.ۢ۬ܽ

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C18781 f29151;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view8) {
                            Main main5 = null;
                            String str5 = null;
                            C18781 c187812 = null;
                            DialogInterfaceC0206 dialogInterfaceC02063 = null;
                            int i51 = -994217488;
                            int i52 = C3019.f9544;
                            int i53 = RunnableC3474.f10992;
                            int m25668 = (C0630.m2566("۫᩵") + i53) * 61;
                            int i54 = ((m25668 ^ i52) * 18357) ^ 1139314420;
                            int i55 = 417847575;
                            while (true) {
                                i51 = ((((i51 ^ i52) * 20571) >> 31) & i54) ^ (m25668 ^ i55);
                                switch (i51) {
                                    case -1582621812:
                                    case 216278072:
                                        main5 = main2;
                                        if (C1128.f4106 <= 0) {
                                            m25668 = (i52 - C0630.m2566("ۤᩳ")) * (-67);
                                            i54 = ((m25668 ^ i53) * 5541) ^ (-764061778);
                                            i55 = 1770607935;
                                        } else {
                                            m25668 = (i53 - C2105.m6981("۫۬")) * (-23);
                                            i54 = ((m25668 ^ i52) * 4955) ^ 1749104167;
                                            i55 = -1800967372;
                                        }
                                    case -1487142376:
                                    case 132347403:
                                        str5 = str;
                                        if (C3537.f11231 >= 0) {
                                            m25668 = C2105.m6981("ᩳܽ") ^ i53;
                                            i54 = ((m25668 ^ i52) * (-3735)) ^ (-1572908968);
                                            i55 = 1599773628;
                                        } else {
                                            m25668 = C2105.m6981("ۘ᩺") ^ i52;
                                            i54 = ((m25668 ^ i53) * 9133) ^ 840815701;
                                            i55 = -1039758514;
                                        }
                                    case -1466958865:
                                    case -7846509:
                                        C5695.m16023();
                                        C2126.m7040();
                                        m25668 = (i52 - C0630.m2566("ۤᩳ")) * (-67);
                                        i54 = ((m25668 ^ i53) * 5541) ^ (-764061778);
                                        i55 = 1770607935;
                                    case -1403003644:
                                    case 189568345:
                                        if (C11340.f33930 >= 0) {
                                            m25668 = (i53 - C0630.m2566("֨۟")) * 5;
                                            i54 = ((m25668 ^ i52) * 25579) ^ (-1586380266);
                                            i55 = 1092456097;
                                        } else {
                                            m25668 = C2105.m6981("ܰ۠") ^ i52;
                                            i54 = ((m25668 ^ i53) * (-31885)) ^ (-645035520);
                                            i55 = 726485273;
                                        }
                                    case -1084227182:
                                    case -732246395:
                                        if (RunnableC3474.f10992 <= 0) {
                                            m25668 = C0630.m2566("᩵᩹") ^ i52;
                                            i54 = ((m25668 ^ i53) * (-13267)) ^ (-366443368);
                                            i55 = 948308218;
                                        } else {
                                            m25668 = C0630.m2566("ۡۜ") ^ i53;
                                            i54 = ((m25668 ^ i52) * 317) ^ 1915193606;
                                            i55 = 1538258632;
                                        }
                                    case -957602471:
                                    case 143174446:
                                        if (C1005.m3501()) {
                                            m25668 = (i52 - C2105.m6981("۟᩸")) * (-33);
                                            i54 = ((m25668 ^ i53) * (-11797)) ^ 1614479819;
                                            i55 = 113503695;
                                        } else {
                                            m25668 = (i53 - C0630.m2566("֨۟")) * 5;
                                            i54 = ((m25668 ^ i52) * 25579) ^ (-1586380266);
                                            i55 = 1092456097;
                                        }
                                    case -825209696:
                                    case 2086784317:
                                        C18781.m43437(c187812, main5, dialogInterfaceC02063, c138762, str5);
                                        break;
                                    case -719007826:
                                    case 962794227:
                                        C1773.m5908();
                                        if (C4117.f13076 <= 0) {
                                            m25668 = (i53 - C0630.m2566("֨۟")) * 5;
                                            i54 = ((m25668 ^ i52) * 25579) ^ (-1586380266);
                                            i55 = 1092456097;
                                        } else {
                                            m25668 = C2105.m6981("֨ܶ") ^ i53;
                                            i54 = ((m25668 ^ i52) * 4233) ^ (-263732533);
                                            i55 = 1193166058;
                                        }
                                    case -691506260:
                                    case 1051946299:
                                        if (C3432.f10845 < 0) {
                                            m25668 = (i53 - C0630.m2566("֨۟")) * 5;
                                            i54 = ((m25668 ^ i52) * 25579) ^ (-1586380266);
                                            i55 = 1092456097;
                                        } else {
                                            m25668 = C0630.m2566("᩵᩹") ^ i52;
                                            i54 = ((m25668 ^ i53) * (-13267)) ^ (-366443368);
                                            i55 = 948308218;
                                        }
                                    case -615429409:
                                    case 1305194732:
                                        if (C3245.f10203 <= 0) {
                                            m25668 = C2105.m6981("֨ܶ") ^ i53;
                                            i54 = ((m25668 ^ i52) * 4233) ^ (-263732533);
                                            i55 = 1193166058;
                                        } else {
                                            m25668 = C0630.m2566("ۙ᩹") ^ i53;
                                            i54 = ((m25668 ^ i52) * 30021) ^ (-1035078388);
                                            i55 = 1789310516;
                                        }
                                    case -357130072:
                                    case 529228400:
                                        if (C3746.f11829 <= 0) {
                                            m25668 = C2105.m6981("ᩳܽ") ^ i53;
                                            i54 = ((m25668 ^ i52) * (-3735)) ^ (-1572908968);
                                            i55 = 1599773628;
                                        } else {
                                            m25668 = (i52 - C0630.m2566("ۜۨ")) * 123;
                                            i54 = ((m25668 ^ i53) * 6703) ^ (-120455365);
                                            i55 = -1919364736;
                                        }
                                    case -235282218:
                                    case 977659774:
                                        if (C0630.m2564()) {
                                            m25668 = C2105.m6981("ᩳܽ") ^ i53;
                                            i54 = ((m25668 ^ i52) * (-3735)) ^ (-1572908968);
                                            i55 = 1599773628;
                                        } else {
                                            m25668 = C0630.m2566("ܶ֫") ^ i52;
                                            i54 = ((m25668 ^ i53) * 2775) ^ 854547584;
                                            i55 = 119000173;
                                        }
                                    case -213800447:
                                    case 1485831014:
                                        if (C4616.m13552() != 0) {
                                            m25668 = C0630.m2566("᩵᩹") ^ i52;
                                            i54 = ((m25668 ^ i53) * (-13267)) ^ (-366443368);
                                            i55 = 948308218;
                                        } else {
                                            m25668 = (i53 - C0630.m2566("᩸ۙ")) * 97;
                                            i54 = ((m25668 ^ i52) * 31163) ^ 1235454915;
                                            i55 = -857431991;
                                        }
                                    case 90300393:
                                    case 653541321:
                                        if (C1294.f4556 < 0) {
                                            m25668 = (i52 - C0630.m2566("ۤᩳ")) * (-67);
                                            i54 = ((m25668 ^ i53) * 5541) ^ (-764061778);
                                            i55 = 1770607935;
                                        } else {
                                            m25668 = (i53 - C0630.m2566("֨۟")) * 5;
                                            i54 = ((m25668 ^ i52) * 25579) ^ (-1586380266);
                                            i55 = 1092456097;
                                        }
                                    case 799534108:
                                    case 976835354:
                                        c187812 = this.f29151;
                                        dialogInterfaceC02063 = dialogInterfaceC02062;
                                        if (C1504.f5354) {
                                            m25668 = C2105.m6981("֨ܶ") ^ i53;
                                            i54 = ((m25668 ^ i52) * 4233) ^ (-263732533);
                                            i55 = 1193166058;
                                        } else {
                                            m25668 = (i53 - C0630.m2566("ܺ֡")) * 33;
                                            i54 = ((m25668 ^ i52) * 9443) ^ 621235071;
                                            i55 = 1375118438;
                                        }
                                    default:
                                        C1773.m5908();
                                        C21923.m49329();
                                        break;
                                }
                                return;
                            }
                        }

                        {
                            int i51 = 190251717;
                            int i52 = C4117.f13076;
                            int i53 = C3683.f11629;
                            int m25668 = (C0630.m2566("֨۟") ^ i52) * 39;
                            int i54 = ((m25668 ^ i53) * (-17561)) ^ 2017364567;
                            int i55 = 1771181239;
                            while (true) {
                                i51 = ((((i51 ^ i53) * 26213) >> 31) & i54) ^ (m25668 ^ i55);
                                switch (i51) {
                                    case -2132565499:
                                    case -1623860697:
                                        C1504.m5179();
                                        if (RunnableC1108.f4040) {
                                            m25668 = C2105.m6981("᩵֨") ^ i52;
                                            i54 = ((m25668 ^ i53) * 24147) ^ (-364044803);
                                            i55 = 316600945;
                                        } else {
                                            m25668 = C0630.m2566("ۙ۠") ^ i53;
                                            i54 = ((m25668 ^ i52) * 7415) ^ (-1215058631);
                                            i55 = 1322973527;
                                        }
                                    case -1874507013:
                                    case -441771912:
                                        if (C3537.f11231 >= 0) {
                                            m25668 = C0630.m2566("ۙ۠") ^ i53;
                                            i54 = ((m25668 ^ i52) * 7415) ^ (-1215058631);
                                            i55 = 1322973527;
                                        } else {
                                            m25668 = C0630.m2566("۟᩷") ^ i52;
                                            i54 = ((m25668 ^ i53) * 8357) ^ (-1732915949);
                                            i55 = -1482833812;
                                        }
                                    case -1626221211:
                                    case -709604077:
                                        return;
                                    case -1491965597:
                                    case 1142182149:
                                        if (C22628.f73083 > 0) {
                                            m25668 = C0630.m2566("ۙ۠") ^ i53;
                                            i54 = ((m25668 ^ i52) * 7415) ^ (-1215058631);
                                            i55 = 1322973527;
                                        } else {
                                            m25668 = (C2105.m6981("ܳ᩸") ^ i52) * 109;
                                            i54 = ((m25668 ^ i53) * 25287) ^ 1351150969;
                                            i55 = -602045638;
                                        }
                                    case -1168252003:
                                    case 570923919:
                                        ServiceConnectionC3453.m10564();
                                        C2272.m7503();
                                        throw new RuntimeException();
                                    case -830694997:
                                    case -689956566:
                                        if (C4616.m13552() != 0) {
                                            m25668 = C0630.m2566("ۙ۠") ^ i53;
                                            i54 = ((m25668 ^ i52) * 7415) ^ (-1215058631);
                                            i55 = 1322973527;
                                        } else {
                                            m25668 = (C2105.m6981("ۘ۫") ^ i53) * (-61);
                                            i54 = ((m25668 ^ i52) * 20291) ^ (-769892526);
                                            i55 = -1174789138;
                                        }
                                    case -821961824:
                                    case 452405616:
                                        if (C1128.f4106 <= 0) {
                                            m25668 = C0630.m2566("ۙ۠") ^ i53;
                                            i54 = ((m25668 ^ i52) * 7415) ^ (-1215058631);
                                            i55 = 1322973527;
                                        } else {
                                            m25668 = C0630.m2566("ܶᩳ") ^ i53;
                                            i54 = ((m25668 ^ i52) * (-19559)) ^ 803235548;
                                            i55 = 288104552;
                                        }
                                    case -454180711:
                                    case 2090115360:
                                        if (C0422.f1886 <= 0) {
                                            m25668 = C2105.m6981("᩵֨") ^ i52;
                                            i54 = ((m25668 ^ i53) * 24147) ^ (-364044803);
                                            i55 = 316600945;
                                        } else {
                                            m25668 = (C2105.m6981("ۖۗ") + i52) * (-69);
                                            i54 = ((m25668 ^ i53) * (-14623)) ^ (-1160218203);
                                            i55 = 1416593752;
                                        }
                                    case -441868271:
                                    case 37008020:
                                        if (C22628.f73083 <= 0) {
                                            m25668 = C2105.m6981("᩵֨") ^ i52;
                                            i54 = ((m25668 ^ i53) * 24147) ^ (-364044803);
                                            i55 = 316600945;
                                        } else {
                                            m25668 = (C2105.m6981("֡ۢ") + i52) * 33;
                                            i54 = ((m25668 ^ i53) * (-10581)) ^ 164397923;
                                            i55 = 643462986;
                                        }
                                    case -385889012:
                                    case 2042528802:
                                        if (C11340.f33930 >= 0) {
                                            m25668 = (C2105.m6981("֡ۗ") + i53) * (-9);
                                            i54 = ((m25668 ^ i52) * (-16821)) ^ 91775156;
                                            i55 = -133819262;
                                        } else {
                                            m25668 = (i53 - C2105.m6981("ܰܺ")) * 83;
                                            i54 = ((m25668 ^ i52) * (-7833)) ^ (-79324969);
                                            i55 = -1133113492;
                                        }
                                    case -246106701:
                                    case 446766234:
                                        if (C2167.f7158 >= 0) {
                                            m25668 = (C2105.m6981("֡ۗ") + i53) * (-9);
                                            i54 = ((m25668 ^ i52) * (-16821)) ^ 91775156;
                                            i55 = -133819262;
                                        } else {
                                            m25668 = C0630.m2566("ۙ֨") ^ i53;
                                            i54 = ((m25668 ^ i52) * 8623) ^ (-2084316443);
                                            i55 = -1925604320;
                                        }
                                    case -70302219:
                                    case 1537645520:
                                        if (AbstractC2021.f6743 <= 0) {
                                            m25668 = (C2105.m6981("ܽۙ") + i53) * 99;
                                            i54 = ((m25668 ^ i52) * (-9019)) ^ 2093755460;
                                            i55 = -2137984055;
                                        } else {
                                            m25668 = (C0630.m2566("ۧ۫") ^ i52) * 119;
                                            i54 = ((m25668 ^ i53) * (-17023)) ^ (-1183454018);
                                            i55 = -2110004170;
                                        }
                                    case 122590166:
                                    case 374220354:
                                        if (C7811.m20844() != 0) {
                                            m25668 = C0630.m2566("ۙ۠") ^ i53;
                                            i54 = ((m25668 ^ i52) * 7415) ^ (-1215058631);
                                            i55 = 1322973527;
                                        } else {
                                            m25668 = (C0630.m2566("֡֡") ^ i53) * (-75);
                                            i54 = ((m25668 ^ i52) * (-9939)) ^ (-225508697);
                                            i55 = 549772753;
                                        }
                                    case 273258770:
                                    case 1706175034:
                                        C4616.m13552();
                                        if (C7811.m20844() == 0) {
                                            m25668 = C0630.m2566("ۙ۠") ^ i53;
                                            i54 = ((m25668 ^ i52) * 7415) ^ (-1215058631);
                                            i55 = 1322973527;
                                        } else {
                                            m25668 = (C2105.m6981("֡ۗ") + i53) * (-9);
                                            i54 = ((m25668 ^ i52) * (-16821)) ^ 91775156;
                                            i55 = -133819262;
                                        }
                                    case 443960152:
                                    case 799188192:
                                        C3663.m11168();
                                        m25668 = C0630.m2566("ۙ۠") ^ i53;
                                        i54 = ((m25668 ^ i52) * 7415) ^ (-1215058631);
                                        i55 = 1322973527;
                                    default:
                                        this.f29151 = c18781;
                                        if (C1005.f3721) {
                                            m25668 = (C2105.m6981("ۤ᩻") + i52) * (-123);
                                            i54 = ((m25668 ^ i53) * (-13565)) ^ (-641765488);
                                            i55 = -2100048099;
                                        } else {
                                            m25668 = C0630.m2566("ۙ۠") ^ i53;
                                            i54 = ((m25668 ^ i52) * 7415) ^ (-1215058631);
                                            i55 = 1322973527;
                                        }
                                }
                            }
                        }
                    });
                    break;
                default:
                    i = i29;
                    str3 = C3683.m11225(f59290, 28, 3, i30);
                    if (C1128.f4106 <= 0) {
                        sArr = sArr15;
                        view = view5;
                        sArr2 = sArr11;
                        i2 = i39;
                        sArr3 = sArr12;
                        i3 = i40;
                        sArr4 = sArr13;
                        i4 = i38;
                        int m698152222 = (i25 - C2105.m6981("֡۬")) * (-65);
                        int i422222 = i2;
                        i27 = ((m698152222 ^ i26) * (-31805)) ^ 2104474169;
                        sArr11 = sArr2;
                        i38 = i4;
                        i40 = i3;
                        sArr13 = sArr4;
                        i29 = i;
                        sArr15 = sArr;
                        sArr12 = sArr3;
                        view5 = view;
                        i28 = m698152222 ^ 2123947851;
                        i39 = i422222;
                    } else {
                        int m69817 = (C2105.m6981("۟֫") + i25) * 49;
                        i6 = ((m69817 ^ i26) * 24605) ^ (-481913028);
                        i28 = m69817 ^ 1102118452;
                        i27 = i6;
                        i29 = i;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43437(final C18781 c18781, final Main main, final DialogInterfaceC0206 dialogInterfaceC0206, final C13876 c13876, final String str) {
        int i;
        DialogInterface.OnClickListener onClickListener;
        DialogInterface.OnClickListener onClickListener2;
        int m2566;
        int i2;
        int i3;
        C19258 c19258;
        int m25662;
        int i4;
        int i5;
        DialogInterface.OnClickListener onClickListener3;
        short s;
        int m6981;
        int i6;
        int i7;
        int i8 = C1128.f4106;
        int i9 = C1294.f4556;
        int m25663 = C0630.m2566("ۚۡ") ^ i8;
        int i10 = ((m25663 ^ i9) * 12067) ^ (-1388014384);
        DialogInterface.OnClickListener onClickListener4 = null;
        Object obj = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i11 = m25663 ^ 1729689788;
        C19258 c192582 = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        short s2 = 0;
        int i19 = 0;
        int i20 = 458218538;
        int i21 = 0;
        short[] sArr3 = null;
        int i22 = 0;
        while (true) {
            i20 = i11 ^ (i10 & (((i20 ^ i9) * (-8383)) >> 31));
            switch (i20) {
                case -2139465772:
                case -267218161:
                    i = i12;
                    onClickListener = onClickListener4;
                    int i23 = i21 + 269583561;
                    if (i19 - (i23 + i23) > 0) {
                        m25662 = (C0630.m2566("֨ۤ") + i9) * (-79);
                        i4 = ((m25662 ^ i8) * 3803) ^ (-956385719);
                        i5 = 1797836258;
                    } else {
                        m25662 = (i8 - C2105.m6981("᩶۫")) * 11;
                        i4 = ((m25662 ^ i9) * 7011) ^ (-854847955);
                        i5 = -840240021;
                    }
                    int i24 = m25662 ^ i5;
                    onClickListener4 = onClickListener;
                    i11 = i24;
                    i10 = i4;
                    i12 = i;
                case -1927133133:
                case -613659929:
                    if (C0382.f1805) {
                        i = i12;
                        onClickListener3 = onClickListener4;
                        s = s2;
                        m6981 = C2105.m6981("ۙܽ") ^ i9;
                        i6 = ((m6981 ^ i8) * 22645) ^ 1724677501;
                        i7 = -661631732;
                        int i25 = m6981 ^ i7;
                        s2 = s;
                        i10 = i6;
                        onClickListener4 = onClickListener3;
                        i11 = i25;
                        i12 = i;
                    } else {
                        m2566 = (C0630.m2566("᩶ۛ") + i9) * 97;
                        onClickListener2 = onClickListener4;
                        i2 = ((m2566 ^ i8) * (-7339)) ^ 688488788;
                        i3 = 1293644259;
                        DialogInterface.OnClickListener onClickListener5 = onClickListener2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        onClickListener4 = onClickListener5;
                    }
                case -1872609734:
                case 163524921:
                    i = i12;
                    onClickListener = onClickListener4;
                    i18 = 22794;
                    m25662 = (i8 - C0630.m2566("ܳ᩶")) * (-57);
                    i4 = ((m25662 ^ i9) * (-7721)) ^ (-1951546046);
                    i5 = -160713538;
                    int i242 = m25662 ^ i5;
                    onClickListener4 = onClickListener;
                    i11 = i242;
                    i10 = i4;
                    i12 = i;
                case -1798128302:
                case -1291779917:
                    i = i12;
                    onClickListener = onClickListener4;
                    C3432.m10490(c192582, 2124602408 ^ i15);
                    sArr = f59290;
                    i22 = 4;
                    if (C7811.m20844() == 0) {
                        m25662 = (C2105.m6981("᩵ۛ") + i9) * (-17);
                        i4 = ((m25662 ^ i8) * (-13935)) ^ 1362475356;
                        i5 = 1883307996;
                        int i2422 = m25662 ^ i5;
                        onClickListener4 = onClickListener;
                        i11 = i2422;
                        i10 = i4;
                        i12 = i;
                    }
                    m25662 = (i8 - C2105.m6981("᩵ᩳ")) * (-89);
                    i4 = ((m25662 ^ i9) * (-20873)) ^ 1083257765;
                    i5 = -408116006;
                    int i24222 = m25662 ^ i5;
                    onClickListener4 = onClickListener;
                    i11 = i24222;
                    i10 = i4;
                    i12 = i;
                case -1757462059:
                case 438387385:
                    i = i12;
                    onClickListener = onClickListener4;
                    i18 = 18429;
                    m25662 = (i8 - C0630.m2566("ܳ᩶")) * (-57);
                    i4 = ((m25662 ^ i9) * (-7721)) ^ (-1951546046);
                    i5 = -160713538;
                    int i242222 = m25662 ^ i5;
                    onClickListener4 = onClickListener;
                    i11 = i242222;
                    i10 = i4;
                    i12 = i;
                case -1525370594:
                case 998259094:
                    C3663.m11167(dialogInterfaceC0206);
                    break;
                case -966320737:
                case 513613491:
                    C4159.m12565();
                    C1047.m3599();
                    i = i12;
                    onClickListener3 = onClickListener4;
                    s = s2;
                    m6981 = C2105.m6981("ۙܽ") ^ i9;
                    i6 = ((m6981 ^ i8) * 22645) ^ 1724677501;
                    i7 = -661631732;
                    int i252 = m6981 ^ i7;
                    s2 = s;
                    i10 = i6;
                    onClickListener4 = onClickListener3;
                    i11 = i252;
                    i12 = i;
                case -699780321:
                case 31281563:
                    C1294.m4380(c192582, i13, onClickListener4);
                    sArr2 = f59290;
                    i17 = 3;
                    if (C3537.m10746() <= 0) {
                        i16 = 10;
                        int m69812 = C2105.m6981("ܳۡ") ^ i9;
                        c19258 = c192582;
                        i11 = m69812 ^ (-615891026);
                        i10 = ((m69812 ^ i8) * 2355) ^ 2124106081;
                        c192582 = c19258;
                    } else {
                        int m69813 = C2105.m6981("᩵ܶ") ^ i9;
                        i11 = m69813 ^ 1975988338;
                        i10 = ((m69813 ^ i8) * (-11207)) ^ 515531787;
                        i16 = 10;
                    }
                case -624116424:
                case 1733404609:
                    int m25664 = C0630.m2566(C11340.m28025(sArr2, i16, i17, i18)) ^ 2123542547;
                    if (C0630.f2410 <= 0) {
                        i14 = m25664;
                        obj = null;
                        m2566 = (C0630.m2566("᩶ۛ") + i9) * 97;
                        onClickListener2 = onClickListener4;
                        i2 = ((m2566 ^ i8) * (-7339)) ^ 688488788;
                        i3 = 1293644259;
                        DialogInterface.OnClickListener onClickListener52 = onClickListener2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        onClickListener4 = onClickListener52;
                    } else {
                        int m25665 = C0630.m2566("᩶ܰ") ^ i8;
                        int i26 = ((m25665 ^ i9) * 15223) ^ 713903540;
                        i11 = m25665 ^ (-158068016);
                        i14 = m25664;
                        i10 = i26;
                        obj = null;
                    }
                case -386512766:
                case 2000059529:
                    i = i12;
                    onClickListener3 = onClickListener4;
                    s = s2;
                    int i27 = s + 16419;
                    i19 = i27 * i27;
                    i21 = s * s;
                    if (C2520.f8000 < 0) {
                        m6981 = C2105.m6981("ܰ֨") ^ i9;
                        i6 = ((m6981 ^ i8) * 22829) ^ 1292184548;
                        i7 = 1595588956;
                        int i2522 = m6981 ^ i7;
                        s2 = s;
                        i10 = i6;
                        onClickListener4 = onClickListener3;
                        i11 = i2522;
                        i12 = i;
                    }
                    m6981 = C2105.m6981("ۙܽ") ^ i9;
                    i6 = ((m6981 ^ i8) * 22645) ^ 1724677501;
                    i7 = -661631732;
                    int i25222 = m6981 ^ i7;
                    s2 = s;
                    i10 = i6;
                    onClickListener4 = onClickListener3;
                    i11 = i25222;
                    i12 = i;
                case -362436108:
                case 818273053:
                    i13 = 2129467184 ^ C2105.m6981(C21923.m49334(sArr3, 7, 3, i18));
                    if (C11340.f33930 < 0) {
                        onClickListener2 = onClickListener4;
                        m2566 = (C2105.m6981("۫᩺") ^ i9) * 41;
                        i2 = ((m2566 ^ i8) * 12103) ^ 343073584;
                        i3 = -568760709;
                        DialogInterface.OnClickListener onClickListener522 = onClickListener2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        onClickListener4 = onClickListener522;
                    }
                    m2566 = (C0630.m2566("᩶ۛ") + i9) * 97;
                    onClickListener2 = onClickListener4;
                    i2 = ((m2566 ^ i8) * (-7339)) ^ 688488788;
                    i3 = 1293644259;
                    DialogInterface.OnClickListener onClickListener5222 = onClickListener2;
                    i11 = m2566 ^ i3;
                    i10 = i2;
                    onClickListener4 = onClickListener5222;
                case -325909316:
                case 477398226:
                    if (C0483.f2088 >= 0) {
                        i = i12;
                        onClickListener3 = onClickListener4;
                        s = s2;
                        m6981 = C2105.m6981("ۙܽ") ^ i9;
                        i6 = ((m6981 ^ i8) * 22645) ^ 1724677501;
                        i7 = -661631732;
                        int i252222 = m6981 ^ i7;
                        s2 = s;
                        i10 = i6;
                        onClickListener4 = onClickListener3;
                        i11 = i252222;
                        i12 = i;
                    } else {
                        int m25666 = (i8 - C0630.m2566("᩹ۨ")) * (-111);
                        i11 = m25666 ^ (-586859654);
                        i10 = ((m25666 ^ i9) * (-24831)) ^ (-1288986186);
                    }
                case -323326595:
                case 35146727:
                    i = i12;
                    onClickListener = onClickListener4;
                    if (c13876.m33269().isEmpty()) {
                        m25662 = (C2105.m6981("ۡۨ") + i8) * 15;
                        i4 = ((m25662 ^ i9) * (-27587)) ^ 1890796426;
                        i5 = -622990817;
                    } else {
                        m25662 = C0630.m2566("ܰۡ") ^ i9;
                        i4 = ((m25662 ^ i8) * (-9343)) ^ 2030589533;
                        i5 = -31976047;
                    }
                    int i2422222 = m25662 ^ i5;
                    onClickListener4 = onClickListener;
                    i11 = i2422222;
                    i10 = i4;
                    i12 = i;
                case -32297374:
                case 741659593:
                    C2520.m8029(c192582, i14, obj);
                    C10025.m25199(c18781.f59293, C3683.m11213(c192582), str);
                    break;
                case 121688920:
                case 276038755:
                    onClickListener2 = onClickListener4;
                    i12 = 2130599219 ^ C0630.m2566(C2272.m7507(sArr, i22, 3, i18));
                    if (C2272.f7362) {
                        onClickListener4 = onClickListener2;
                        int m698122 = C2105.m6981("ܳۡ") ^ i9;
                        c19258 = c192582;
                        i11 = m698122 ^ (-615891026);
                        i10 = ((m698122 ^ i8) * 2355) ^ 2124106081;
                        c192582 = c19258;
                    } else {
                        m2566 = (C0630.m2566("᩷ܰ") ^ i8) * (-27);
                        i2 = ((m2566 ^ i9) * (-23033)) ^ (-1161018675);
                        i3 = 1367220353;
                        DialogInterface.OnClickListener onClickListener52222 = onClickListener2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        onClickListener4 = onClickListener52222;
                    }
                case 228504324:
                case 1360021003:
                    i = i12;
                    onClickListener = onClickListener4;
                    c192582 = C1773.m5912(main);
                    i15 = C0630.m2566(C3019.m9250(f59290, 1, 3, i18));
                    if (C4263.f13799 > 0) {
                        m25662 = C2105.m6981("ܺܿ") ^ i8;
                        i4 = ((m25662 ^ i9) * (-13017)) ^ (-1228038997);
                        i5 = -1148854210;
                        int i24222222 = m25662 ^ i5;
                        onClickListener4 = onClickListener;
                        i11 = i24222222;
                        i10 = i4;
                        i12 = i;
                    }
                    m25662 = (i8 - C2105.m6981("᩵ᩳ")) * (-89);
                    i4 = ((m25662 ^ i9) * (-20873)) ^ 1083257765;
                    i5 = -408116006;
                    int i242222222 = m25662 ^ i5;
                    onClickListener4 = onClickListener;
                    i11 = i242222222;
                    i10 = i4;
                    i12 = i;
                case 395076488:
                case 1805219273:
                    i = i12;
                    onClickListener = onClickListener4;
                    s2 = f59290[0];
                    if (C4263.f13799 <= 0) {
                        onClickListener4 = onClickListener;
                        i12 = i;
                        int m6981222 = C2105.m6981("ܳۡ") ^ i9;
                        c19258 = c192582;
                        i11 = m6981222 ^ (-615891026);
                        i10 = ((m6981222 ^ i8) * 2355) ^ 2124106081;
                        c192582 = c19258;
                    } else {
                        m25662 = (C0630.m2566("֡ۛ") ^ i9) * 59;
                        i4 = ((m25662 ^ i8) * (-22263)) ^ 1483528656;
                        i5 = 569292674;
                        int i2422222222 = m25662 ^ i5;
                        onClickListener4 = onClickListener;
                        i11 = i2422222222;
                        i10 = i4;
                        i12 = i;
                    }
                case 1220707316:
                case 1567049899:
                    C7106.m19114(c192582, i12);
                    onClickListener4 = new DialogInterface.OnClickListener(c18781) { // from class: l.ۡ۬ܽ

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C18781 f27077;

                        {
                            int i28 = 1408432975;
                            int i29 = C1294.f4556;
                            int i30 = C0630.f2410;
                            int m25667 = (C0630.m2566("۟ۚ") ^ i30) * (-83);
                            int i31 = ((m25667 ^ i29) * (-24039)) ^ (-334500984);
                            int i32 = -1362618415;
                            while (true) {
                                i28 = ((((i28 ^ i29) * (-21755)) >> 31) & i31) ^ (m25667 ^ i32);
                                switch (i28) {
                                    case -2055656598:
                                    case 560312410:
                                        if (C0798.f2919) {
                                            m25667 = C0630.m2566("ۙܶ") ^ i29;
                                            i31 = ((m25667 ^ i30) * 14215) ^ (-841742393);
                                            i32 = -1297308216;
                                        } else {
                                            m25667 = (i30 - C2105.m6981("۫֡")) * (-113);
                                            i31 = ((m25667 ^ i29) * (-29353)) ^ (-1423424574);
                                            i32 = 625225057;
                                        }
                                    case -1948710868:
                                    case 1538109961:
                                        if (C1420.f5096 <= 0) {
                                            m25667 = C2105.m6981("᩺ۚ") ^ i29;
                                            i31 = ((m25667 ^ i30) * 6341) ^ 1128664525;
                                            i32 = 1945958068;
                                        } else {
                                            m25667 = C2105.m6981("᩵᩷") ^ i30;
                                            i31 = ((m25667 ^ i29) * 13259) ^ 154565749;
                                            i32 = 1180400311;
                                        }
                                    case -1792639621:
                                    case 1829716421:
                                        if (C3911.f12484 >= 0) {
                                            m25667 = (i30 - C0630.m2566("ۗ᩵")) * (-89);
                                            i31 = ((m25667 ^ i29) * 18519) ^ 2129389200;
                                            i32 = 1574620851;
                                        } else {
                                            m25667 = (i29 - C0630.m2566("᩵ܶ")) * (-5);
                                            i31 = ((m25667 ^ i30) * 32689) ^ (-292804848);
                                            i32 = 830945452;
                                        }
                                    case -1710117043:
                                    case 53253559:
                                        if (C0237.m1481() >= 0) {
                                            m25667 = (i30 - C0630.m2566("ۡ֡")) * 7;
                                            i31 = ((m25667 ^ i29) * 7465) ^ 1504480038;
                                            i32 = -404731191;
                                        } else {
                                            m25667 = C2105.m6981("᩹᩹") ^ i30;
                                            i31 = ((m25667 ^ i29) * (-19363)) ^ 539219524;
                                            i32 = 239568583;
                                        }
                                    case -1657748477:
                                    case 2056181292:
                                        C4616.m13552();
                                        C0237.m1481();
                                        m25667 = C0630.m2566("ۙܶ") ^ i29;
                                        i31 = ((m25667 ^ i30) * 14215) ^ (-841742393);
                                        i32 = -1297308216;
                                    case -1520196958:
                                    case -981709958:
                                        if (C4075.f12947 >= 0) {
                                            m25667 = (i30 - C0630.m2566("ۗ᩵")) * (-89);
                                            i31 = ((m25667 ^ i29) * 18519) ^ 2129389200;
                                            i32 = 1574620851;
                                        } else {
                                            m25667 = (i29 - C0630.m2566("᩶ۛ")) * 55;
                                            i31 = ((m25667 ^ i30) * 3029) ^ (-1632970746);
                                            i32 = 3981575;
                                        }
                                    case -979554962:
                                    case 1934217893:
                                        if (C3537.f11231 >= 0) {
                                            m25667 = (C2105.m6981("ۜ᩹") + i29) * (-11);
                                            i31 = ((m25667 ^ i30) * (-26815)) ^ (-1268724990);
                                            i32 = 410906977;
                                        } else {
                                            m25667 = C2105.m6981("᩺᩵") ^ i30;
                                            i31 = ((m25667 ^ i29) * 32085) ^ 154096688;
                                            i32 = 935125432;
                                        }
                                    case -829436644:
                                    case 1425286817:
                                        if (C7106.f21815 != 0) {
                                            m25667 = C2105.m6981("᩺ۚ") ^ i29;
                                            i31 = ((m25667 ^ i30) * 6341) ^ 1128664525;
                                            i32 = 1945958068;
                                        } else {
                                            m25667 = (C2105.m6981("ۛۧ") + i29) * 51;
                                            i31 = ((m25667 ^ i30) * DilithiumEngine.DilithiumRootOfUnity) ^ (-1803334530);
                                            i32 = -2059029732;
                                        }
                                    case -587760833:
                                    case 902252851:
                                        ServiceConnectionC3453.m10564();
                                        if (C1711.m5736() > 0) {
                                            m25667 = (i30 - C0630.m2566("ۡ֡")) * 7;
                                            i31 = ((m25667 ^ i29) * 7465) ^ 1504480038;
                                            i32 = -404731191;
                                        } else {
                                            m25667 = (C2105.m6981("ۜ᩹") + i29) * (-11);
                                            i31 = ((m25667 ^ i30) * (-26815)) ^ (-1268724990);
                                            i32 = 410906977;
                                        }
                                    case -586962255:
                                    case 1851642430:
                                        if (C1294.f4556 >= 0) {
                                            m25667 = (i30 - C0630.m2566("ۡ֡")) * 7;
                                            i31 = ((m25667 ^ i29) * 7465) ^ 1504480038;
                                            i32 = -404731191;
                                        } else {
                                            m25667 = C0630.m2566("۫᩹") ^ i29;
                                            i31 = ((m25667 ^ i30) * (-29517)) ^ (-1784949422);
                                            i32 = 1788177323;
                                        }
                                    case -397489879:
                                    case 497338526:
                                        C7106.m19120();
                                        C7106.m19120();
                                        throw new RuntimeException();
                                    case 267599138:
                                    case 940404636:
                                        if (C22628.f73083 <= 0) {
                                            m25667 = C0630.m2566("ۙܶ") ^ i29;
                                            i31 = ((m25667 ^ i30) * 14215) ^ (-841742393);
                                            i32 = -1297308216;
                                        } else {
                                            m25667 = (C0630.m2566("۫ۡ") ^ i29) * (-125);
                                            i31 = ((m25667 ^ i30) * 3935) ^ 1414475679;
                                            i32 = -1450822739;
                                        }
                                    case 485022547:
                                    case 885307651:
                                        return;
                                    case 533830306:
                                    case 907470536:
                                        this.f27077 = c18781;
                                        if (RunnableC1108.m3790()) {
                                            m25667 = (i30 - C0630.m2566("ۡ֡")) * 7;
                                            i31 = ((m25667 ^ i29) * 7465) ^ 1504480038;
                                            i32 = -404731191;
                                        } else {
                                            m25667 = (C0630.m2566("ۖۢ") ^ i30) * 39;
                                            i31 = ((m25667 ^ i29) * 29723) ^ 894648321;
                                            i32 = -550824668;
                                        }
                                    case 781092773:
                                    case 1659376777:
                                        AbstractC2021.m6574();
                                        if (C21923.f70183 != 0) {
                                            m25667 = (i30 - C0630.m2566("ۡ֡")) * 7;
                                            i31 = ((m25667 ^ i29) * 7465) ^ 1504480038;
                                            i32 = -404731191;
                                        } else {
                                            m25667 = (i30 - C0630.m2566("ۗ᩵")) * (-89);
                                            i31 = ((m25667 ^ i29) * 18519) ^ 2129389200;
                                            i32 = 1574620851;
                                        }
                                    default:
                                        if (C3245.m9925() == 0) {
                                            m25667 = C0630.m2566("ۙܶ") ^ i29;
                                            i31 = ((m25667 ^ i30) * 14215) ^ (-841742393);
                                            i32 = -1297308216;
                                        } else {
                                            m25667 = (i30 - C0630.m2566("ۡ֡")) * 7;
                                            i31 = ((m25667 ^ i29) * 7465) ^ 1504480038;
                                            i32 = -404731191;
                                        }
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i28) {
                            DialogInterfaceC0206 dialogInterfaceC02062 = null;
                            int i29 = 436837254;
                            int i30 = C3245.f10203;
                            int i31 = C0714.f2697;
                            int m69814 = (C2105.m6981("ۤۨ") + i30) * 7;
                            int i32 = ((m69814 ^ i31) * (-22191)) ^ 1370063761;
                            int i33 = 1747916272;
                            while (true) {
                                i29 = ((((i29 ^ i31) * 28203) >> 31) & i32) ^ (m69814 ^ i33);
                                switch (i29) {
                                    case -2095602364:
                                    case 1114406178:
                                        if (C3432.m10477() <= 0) {
                                            m69814 = (i30 - C2105.m6981("ۧ᩺")) * (-43);
                                            i32 = ((m69814 ^ i31) * 25035) ^ (-1327750917);
                                            i33 = -1534348359;
                                        } else {
                                            m69814 = C0630.m2566("۫᩵") ^ i31;
                                            i32 = ((m69814 ^ i30) * (-20593)) ^ (-227916227);
                                            i33 = 11523142;
                                        }
                                    case -2030437932:
                                    case -1749859207:
                                        if (C1005.f3721) {
                                            m69814 = C0630.m2566("۫ܳ") ^ i31;
                                            i32 = ((m69814 ^ i30) * (-18179)) ^ 1680093804;
                                            i33 = -838045575;
                                        } else {
                                            m69814 = C0630.m2566("ۤ᩶") ^ i31;
                                            i32 = ((m69814 ^ i30) * 5757) ^ 192032301;
                                            i33 = -870082771;
                                        }
                                    case -1897906511:
                                    case -1736241315:
                                        if (C4263.f13799 > 0) {
                                            m69814 = C0630.m2566("᩵۟") ^ i30;
                                            i32 = ((m69814 ^ i31) * (-28725)) ^ (-853994939);
                                            i33 = 1726691257;
                                        } else {
                                            m69814 = (i30 - C2105.m6981("ۧ᩺")) * (-43);
                                            i32 = ((m69814 ^ i31) * 25035) ^ (-1327750917);
                                            i33 = -1534348359;
                                        }
                                    case -1861150269:
                                    case -1685996476:
                                        C3663.m11167(dialogInterfaceC02062);
                                        if (ViewOnClickListenerC1958.m6429() >= 0) {
                                            m69814 = C0630.m2566("ۤ᩶") ^ i31;
                                            i32 = ((m69814 ^ i30) * 5757) ^ 192032301;
                                            i33 = -870082771;
                                        } else {
                                            C18781 c187812 = this.f27077;
                                            C13876 c138762 = c13876;
                                            Main main2 = main;
                                            if (!C1711.f5919) {
                                                C10025.m25197(new C14966(c187812, c138762, main2), main2, str);
                                                break;
                                            }
                                            m69814 = C2105.m6981("᩵ۘ") ^ i31;
                                            i32 = ((m69814 ^ i30) * 14597) ^ (-1291233762);
                                            i33 = -1672493570;
                                        }
                                    case -1857209760:
                                    case -159094025:
                                        C1005.m3501();
                                        if (C3746.f11829 <= 0) {
                                            m69814 = C2105.m6981("᩵ۘ") ^ i31;
                                            i32 = ((m69814 ^ i30) * 14597) ^ (-1291233762);
                                            i33 = -1672493570;
                                        } else {
                                            m69814 = C0630.m2566("᩵۟") ^ i30;
                                            i32 = ((m69814 ^ i31) * (-28725)) ^ (-853994939);
                                            i33 = 1726691257;
                                        }
                                    case -1720162428:
                                    case 602717740:
                                        if (C2105.f7037 != 0) {
                                            m69814 = C0630.m2566("ۤ᩶") ^ i31;
                                            i32 = ((m69814 ^ i30) * 5757) ^ 192032301;
                                            i33 = -870082771;
                                        } else {
                                            m69814 = C2105.m6981("ܳܿ") ^ i30;
                                            i32 = ((m69814 ^ i31) * 4243) ^ 811324100;
                                            i33 = 2039877707;
                                        }
                                    case -1385005302:
                                    case -576131442:
                                        if (C0237.f1507 != 0) {
                                            m69814 = C2105.m6981("᩵ۘ") ^ i31;
                                            i32 = ((m69814 ^ i30) * 14597) ^ (-1291233762);
                                            i33 = -1672493570;
                                        } else {
                                            m69814 = C2105.m6981("۫֫") ^ i30;
                                            i32 = ((m69814 ^ i31) * (-30189)) ^ (-1973932062);
                                            i33 = -1245003727;
                                        }
                                    case -711594692:
                                    case 510487853:
                                        if (C3019.f9544 >= 0) {
                                            m69814 = C0630.m2566("۫᩵") ^ i31;
                                            i32 = ((m69814 ^ i30) * (-20593)) ^ (-227916227);
                                            i33 = 11523142;
                                        } else {
                                            m69814 = (C2105.m6981("ۘܽ") ^ i30) * (-125);
                                            i32 = ((m69814 ^ i31) * (-1561)) ^ (-836516437);
                                            i33 = 717256257;
                                        }
                                    case -467920976:
                                    case 302245088:
                                        C0798.m2998();
                                        break;
                                    case -347941789:
                                    case 193622100:
                                        if (AbstractC2021.f6743 <= 0) {
                                            m69814 = C2105.m6981("᩵ۘ") ^ i31;
                                            i32 = ((m69814 ^ i30) * 14597) ^ (-1291233762);
                                            i33 = -1672493570;
                                        } else {
                                            m69814 = C0630.m2566("ܿ֡") ^ i31;
                                            i32 = ((m69814 ^ i30) * (-7611)) ^ (-930918206);
                                            i33 = -1876782734;
                                        }
                                    case -245215031:
                                    case 1078179788:
                                        dialogInterfaceC02062 = dialogInterfaceC0206;
                                        if (C0798.f2919) {
                                            m69814 = C2105.m6981("᩵ۘ") ^ i31;
                                            i32 = ((m69814 ^ i30) * 14597) ^ (-1291233762);
                                            i33 = -1672493570;
                                        } else {
                                            m69814 = (i30 - C2105.m6981("ܽۗ")) * (-75);
                                            i32 = ((m69814 ^ i31) * (-2095)) ^ (-517550836);
                                            i33 = 2100784066;
                                        }
                                    case 7042278:
                                    case 1131251867:
                                        if (C2272.f7362) {
                                            m69814 = C0630.m2566("ۤ᩶") ^ i31;
                                            i32 = ((m69814 ^ i30) * 5757) ^ 192032301;
                                            i33 = -870082771;
                                        } else {
                                            m69814 = (i31 - C0630.m2566("֡᩻")) * 19;
                                            i32 = ((m69814 ^ i30) * (-26229)) ^ 1458608991;
                                            i33 = 1383656215;
                                        }
                                    case 638957264:
                                    case 1542434383:
                                        if (C0050.f910 >= 0) {
                                            m69814 = C2105.m6981("᩵ۘ") ^ i31;
                                            i32 = ((m69814 ^ i30) * 14597) ^ (-1291233762);
                                            i33 = -1672493570;
                                        } else {
                                            m69814 = C0630.m2566("ܳۘ") ^ i31;
                                            i32 = ((m69814 ^ i30) * (-16693)) ^ (-1742266137);
                                            i33 = -2050651060;
                                        }
                                    default:
                                        RunnableC1937.m6387();
                                        m69814 = C2105.m6981("᩵ۘ") ^ i31;
                                        i32 = ((m69814 ^ i30) * 14597) ^ (-1291233762);
                                        i33 = -1672493570;
                                }
                                return;
                            }
                        }
                    };
                    sArr3 = f59290;
                    if (C1005.f3721) {
                        int m69814 = (i8 - C2105.m6981("ܺܽ")) * (-79);
                        i = i12;
                        i4 = ((m69814 ^ i9) * 17651) ^ (-2141652909);
                        i11 = m69814 ^ 1867329000;
                        i10 = i4;
                        i12 = i;
                    } else {
                        int m69812222 = C2105.m6981("ܳۡ") ^ i9;
                        c19258 = c192582;
                        i11 = m69812222 ^ (-615891026);
                        i10 = ((m69812222 ^ i8) * 2355) ^ 2124106081;
                        c192582 = c19258;
                    }
                case 1523974109:
                case 1950510987:
                    C3663.m11168();
                    if (C4159.m12565() >= 0) {
                        m2566 = (C0630.m2566("᩶ۛ") + i9) * 97;
                        onClickListener2 = onClickListener4;
                        i2 = ((m2566 ^ i8) * (-7339)) ^ 688488788;
                        i3 = 1293644259;
                        DialogInterface.OnClickListener onClickListener522222 = onClickListener2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        onClickListener4 = onClickListener522222;
                    } else {
                        i = i12;
                        onClickListener = onClickListener4;
                        m25662 = (i8 - C2105.m6981("᩵ᩳ")) * (-89);
                        i4 = ((m25662 ^ i9) * (-20873)) ^ 1083257765;
                        i5 = -408116006;
                        int i24222222222 = m25662 ^ i5;
                        onClickListener4 = onClickListener;
                        i11 = i24222222222;
                        i10 = i4;
                        i12 = i;
                    }
                case 1830682767:
                case 1872503859:
                    i = i12;
                    onClickListener = onClickListener4;
                    short s3 = s2;
                    if (C7811.f24123 >= 0) {
                        s2 = s3;
                        onClickListener4 = onClickListener;
                        i12 = i;
                        int m698122222 = C2105.m6981("ܳۡ") ^ i9;
                        c19258 = c192582;
                        i11 = m698122222 ^ (-615891026);
                        i10 = ((m698122222 ^ i8) * 2355) ^ 2124106081;
                        c192582 = c19258;
                    } else {
                        c19258 = c192582;
                        int m25667 = C0630.m2566("ۗۡ") ^ i8;
                        s2 = s3;
                        i10 = ((m25667 ^ i9) * 10617) ^ (-761913856);
                        onClickListener4 = onClickListener;
                        i12 = i;
                        i11 = m25667 ^ 520666794;
                        c192582 = c19258;
                    }
                default:
                    C21923.m49329();
                    break;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43439(C18781 c18781, C13876 c13876, Main main, C11667 c11667, boolean z) {
        AbstractC15440 abstractC15440;
        short[] sArr;
        int m2566;
        int i;
        Object[] objArr;
        short[] sArr2;
        int i2;
        Object[] objArr2;
        Object[] objArr3;
        C18781 c187812 = c18781;
        int i3 = AbstractC2021.f6743;
        int i4 = C3683.f11629;
        int m25662 = C0630.m2566("۫᩹") ^ i4;
        int i5 = ((m25662 ^ i3) * 7173) ^ 431996311;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i6 = m25662 ^ 1745059671;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        char c = 0;
        int i10 = -91701801;
        int i11 = 0;
        short[] sArr5 = null;
        String str = null;
        String str2 = null;
        AbstractC15440 abstractC154402 = null;
        String[] strArr = null;
        Object[] objArr4 = null;
        HashSet hashSet = null;
        C0994 c0994 = null;
        while (true) {
            i10 = i6 ^ (i5 & (((i10 ^ i3) * 25319) >> 31));
            switch (i10) {
                case -2022493580:
                case -1669540108:
                    C3911.m11924();
                    C2520.m8026();
                    int m25663 = C0630.m2566("ۗۤ") ^ i4;
                    i6 = m25663 ^ 1024982066;
                    i5 = ((m25663 ^ i3) * 24523) ^ 652836302;
                case -1946005892:
                case 1357369062:
                    abstractC15440 = abstractC154402;
                    sArr = sArr4;
                    s = sArr5[c];
                    i11 = (s * s) + 7645225;
                    if (C1420.f5096 > 0) {
                        m2566 = C0630.m2566("ۚ᩵") ^ i3;
                        i5 = ((m2566 ^ i4) * 24333) ^ 2113762077;
                        i = 1279355428;
                        objArr3 = objArr4;
                        i2 = m2566 ^ i;
                        sArr4 = sArr;
                        abstractC154402 = abstractC15440;
                        objArr2 = objArr3;
                        i6 = i2;
                        objArr4 = objArr2;
                        c187812 = c18781;
                    }
                    m2566 = C0630.m2566("ۛۤ") ^ i3;
                    i5 = ((m2566 ^ i4) * 24617) ^ 169908895;
                    i = -891911650;
                    objArr3 = objArr4;
                    i2 = m2566 ^ i;
                    sArr4 = sArr;
                    abstractC154402 = abstractC15440;
                    objArr2 = objArr3;
                    i6 = i2;
                    objArr4 = objArr2;
                    c187812 = c18781;
                case -1837033588:
                case -1200999054:
                    C0483.m2121();
                    if (C4075.f12947 >= 0) {
                        int m256632 = C0630.m2566("ۗۤ") ^ i4;
                        i6 = m256632 ^ 1024982066;
                        i5 = ((m256632 ^ i3) * 24523) ^ 652836302;
                    } else {
                        abstractC15440 = abstractC154402;
                        sArr = sArr4;
                        m2566 = C0630.m2566("ۛۤ") ^ i3;
                        i5 = ((m2566 ^ i4) * 24617) ^ 169908895;
                        i = -891911650;
                        objArr3 = objArr4;
                        i2 = m2566 ^ i;
                        sArr4 = sArr;
                        abstractC154402 = abstractC15440;
                        objArr2 = objArr3;
                        i6 = i2;
                        objArr4 = objArr2;
                        c187812 = c18781;
                    }
                case -1669050796:
                case -1367258301:
                    abstractC15440 = abstractC154402;
                    sArr = sArr4;
                    objArr = objArr4;
                    if (C3683.f11629 < 0) {
                        m2566 = (C0630.m2566("᩺ܽ") + i4) * (-103);
                        i5 = ((m2566 ^ i3) * 11463) ^ 1648499480;
                        i = -976251150;
                        objArr3 = objArr4;
                        i2 = m2566 ^ i;
                        sArr4 = sArr;
                        abstractC154402 = abstractC15440;
                        objArr2 = objArr3;
                        i6 = i2;
                        objArr4 = objArr2;
                        c187812 = c18781;
                    }
                    m2566 = C0630.m2566("ᩴ֨") ^ i4;
                    i5 = ((m2566 ^ i3) * 20373) ^ 1150228176;
                    i = -903074301;
                    objArr3 = objArr;
                    i2 = m2566 ^ i;
                    sArr4 = sArr;
                    abstractC154402 = abstractC15440;
                    objArr2 = objArr3;
                    i6 = i2;
                    objArr4 = objArr2;
                    c187812 = c18781;
                case -1383326592:
                case 654682329:
                    sArr2 = sArr4;
                    str2 = C4117.m12359(abstractC154402);
                    AbstractC15440 abstractC154403 = abstractC154402;
                    str = C1005.m3502(f59290, 44, 4, i8);
                    if (C5695.m16023() >= 0) {
                        abstractC154402 = abstractC154403;
                        int m25664 = C0630.m2566("ۤᩳ") ^ i3;
                        sArr4 = sArr2;
                        i6 = m25664 ^ 490408228;
                        i5 = ((m25664 ^ i4) * 8773) ^ (-1922682813);
                        objArr4 = objArr4;
                        c187812 = c18781;
                    } else {
                        int m25665 = C0630.m2566("ᩴۛ") ^ i4;
                        sArr4 = sArr2;
                        i6 = m25665 ^ (-1076161473);
                        i5 = ((m25665 ^ i3) * (-10939)) ^ 1160742475;
                        abstractC154402 = abstractC154403;
                    }
                case -1381698511:
                case -497845394:
                    abstractC15440 = abstractC154402;
                    sArr = sArr4;
                    strArr = (String[]) objArr4;
                    sArr3 = f59290;
                    i9 = 39;
                    i7 = 5;
                    objArr = objArr4;
                    if (!AbstractC2021.m6574()) {
                        m2566 = C2105.m6981("ܶ֨") ^ i4;
                        i5 = ((m2566 ^ i3) * 25615) ^ (-194455221);
                        i = 701333628;
                        objArr3 = objArr4;
                        i2 = m2566 ^ i;
                        sArr4 = sArr;
                        abstractC154402 = abstractC15440;
                        objArr2 = objArr3;
                        i6 = i2;
                        objArr4 = objArr2;
                        c187812 = c18781;
                    }
                    m2566 = C0630.m2566("ᩴ֨") ^ i4;
                    i5 = ((m2566 ^ i3) * 20373) ^ 1150228176;
                    i = -903074301;
                    objArr3 = objArr;
                    i2 = m2566 ^ i;
                    sArr4 = sArr;
                    abstractC154402 = abstractC15440;
                    objArr2 = objArr3;
                    i6 = i2;
                    objArr4 = objArr2;
                    c187812 = c18781;
                case -969947288:
                case 1051252314:
                    if (C1294.f4556 < 0) {
                        int m2566322 = C0630.m2566("ۗۤ") ^ i4;
                        i6 = m2566322 ^ 1024982066;
                        i5 = ((m2566322 ^ i3) * 24523) ^ 652836302;
                    } else {
                        abstractC15440 = abstractC154402;
                        sArr = sArr4;
                        m2566 = C2105.m6981("ܶ᩻") ^ i4;
                        i5 = ((m2566 ^ i3) * (-21439)) ^ 76321237;
                        i = 1290604186;
                        objArr3 = objArr4;
                        i2 = m2566 ^ i;
                        sArr4 = sArr;
                        abstractC154402 = abstractC15440;
                        objArr2 = objArr3;
                        i6 = i2;
                        objArr4 = objArr2;
                        c187812 = c18781;
                    }
                case -913250510:
                case 1798896157:
                    C3911.m11924();
                    break;
                case -845137450:
                case 591700944:
                    abstractC15440 = abstractC154402;
                    sArr = sArr4;
                    i8 = 48940;
                    m2566 = (i3 - C2105.m6981("֫ܶ")) * (-3);
                    i5 = ((m2566 ^ i4) * (-919)) ^ (-1403364185);
                    i = -634688028;
                    objArr3 = objArr4;
                    i2 = m2566 ^ i;
                    sArr4 = sArr;
                    abstractC154402 = abstractC15440;
                    objArr2 = objArr3;
                    i6 = i2;
                    objArr4 = objArr2;
                    c187812 = c18781;
                case -582310749:
                case 2126415756:
                    sArr2 = sArr4;
                    c0994.m3477(RunnableC1937.m6385(sArr3, i9, i7, i8), strArr);
                    abstractC154402 = c187812.f59291;
                    if (C4263.f13799 > 0) {
                        int m25666 = C0630.m2566("֡ۘ") ^ i3;
                        i5 = ((m25666 ^ i4) * (-23359)) ^ 887643552;
                        i2 = m25666 ^ 1907331597;
                        sArr4 = sArr2;
                        objArr2 = objArr4;
                        i6 = i2;
                        objArr4 = objArr2;
                        c187812 = c18781;
                    }
                    int m256642 = C0630.m2566("ۤᩳ") ^ i3;
                    sArr4 = sArr2;
                    i6 = m256642 ^ 490408228;
                    i5 = ((m256642 ^ i4) * 8773) ^ (-1922682813);
                    objArr4 = objArr4;
                    c187812 = c18781;
                case -427684717:
                case 1264578357:
                    C1047.m3594(c0994, str, str2);
                    c0994.m3472(main, c11667);
                    sArr = f59290;
                    if (C1128.m3851() <= 0) {
                        abstractC15440 = abstractC154402;
                        m2566 = C0630.m2566("ۛۤ") ^ i3;
                        i5 = ((m2566 ^ i4) * 24617) ^ 169908895;
                        i = -891911650;
                        objArr3 = objArr4;
                        i2 = m2566 ^ i;
                        sArr4 = sArr;
                        abstractC154402 = abstractC15440;
                        objArr2 = objArr3;
                        i6 = i2;
                        objArr4 = objArr2;
                        c187812 = c18781;
                    } else {
                        int m6981 = (C2105.m6981("ܺۜ") + i3) * (-11);
                        i5 = ((m6981 ^ i4) * 19593) ^ (-1688620197);
                        sArr4 = sArr;
                        i6 = m6981 ^ 64531102;
                    }
                case -309701338:
                case 640228316:
                    abstractC15440 = abstractC154402;
                    sArr = sArr4;
                    int i12 = C15104.f46193;
                    c0994 = new C0994(C3964.class);
                    hashSet = c13876.m33269();
                    if (RunnableC3474.f10992 > 0) {
                        m2566 = (C2105.m6981("ۨ۫") + i4) * 65;
                        i5 = ((m2566 ^ i3) * 5001) ^ 1721605499;
                        i = 796100618;
                        objArr3 = objArr4;
                        i2 = m2566 ^ i;
                        sArr4 = sArr;
                        abstractC154402 = abstractC15440;
                        objArr2 = objArr3;
                        i6 = i2;
                        objArr4 = objArr2;
                        c187812 = c18781;
                    }
                    m2566 = C2105.m6981("ܶ᩻") ^ i4;
                    i5 = ((m2566 ^ i3) * (-21439)) ^ 76321237;
                    i = 1290604186;
                    objArr3 = objArr4;
                    i2 = m2566 ^ i;
                    sArr4 = sArr;
                    abstractC154402 = abstractC15440;
                    objArr2 = objArr3;
                    i6 = i2;
                    objArr4 = objArr2;
                    c187812 = c18781;
                case -13814361:
                case 1778446906:
                    abstractC15440 = abstractC154402;
                    sArr = sArr4;
                    i8 = 60763;
                    m2566 = (i3 - C2105.m6981("֫ܶ")) * (-3);
                    i5 = ((m2566 ^ i4) * (-919)) ^ (-1403364185);
                    i = -634688028;
                    objArr3 = objArr4;
                    i2 = m2566 ^ i;
                    sArr4 = sArr;
                    abstractC154402 = abstractC15440;
                    objArr2 = objArr3;
                    i6 = i2;
                    objArr4 = objArr2;
                    c187812 = c18781;
                case 258634958:
                case 1267824296:
                    if (C0050.f910 < 0) {
                        int m25663222 = C0630.m2566("ۗۤ") ^ i4;
                        i6 = m25663222 ^ 1024982066;
                        i5 = ((m25663222 ^ i3) * 24523) ^ 652836302;
                    } else {
                        abstractC15440 = abstractC154402;
                        sArr = sArr4;
                        objArr = objArr4;
                        m2566 = C0630.m2566("ᩴ֨") ^ i4;
                        i5 = ((m2566 ^ i3) * 20373) ^ 1150228176;
                        i = -903074301;
                        objArr3 = objArr;
                        i2 = m2566 ^ i;
                        sArr4 = sArr;
                        abstractC154402 = abstractC15440;
                        objArr2 = objArr3;
                        i6 = i2;
                        objArr4 = objArr2;
                        c187812 = c18781;
                    }
                case 325946378:
                case 969134842:
                    abstractC15440 = abstractC154402;
                    sArr = sArr4;
                    Object[] array = hashSet.toArray(new String[0]);
                    objArr = array;
                    if (C4075.f12947 < 0) {
                        m2566 = C0630.m2566("ܰ۟") ^ i3;
                        i5 = ((m2566 ^ i4) * 24709) ^ 768939034;
                        i = -1258745534;
                        objArr3 = array;
                        i2 = m2566 ^ i;
                        sArr4 = sArr;
                        abstractC154402 = abstractC15440;
                        objArr2 = objArr3;
                        i6 = i2;
                        objArr4 = objArr2;
                        c187812 = c18781;
                    }
                    m2566 = C0630.m2566("ᩴ֨") ^ i4;
                    i5 = ((m2566 ^ i3) * 20373) ^ 1150228176;
                    i = -903074301;
                    objArr3 = objArr;
                    i2 = m2566 ^ i;
                    sArr4 = sArr;
                    abstractC154402 = abstractC15440;
                    objArr2 = objArr3;
                    i6 = i2;
                    objArr4 = objArr2;
                    c187812 = c18781;
                case 451611516:
                case 1306668112:
                    abstractC15440 = abstractC154402;
                    sArr = sArr4;
                    if ((s * 5530) - i11 <= 0) {
                        m2566 = C2105.m6981("᩵۬") ^ i4;
                        i5 = ((m2566 ^ i3) * (-29179)) ^ (-273305920);
                        i = 195678045;
                        objArr3 = objArr4;
                    } else {
                        m2566 = C2105.m6981("֨ܰ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-30177)) ^ (-1674344996);
                        i = -675031883;
                        objArr3 = objArr4;
                    }
                    i2 = m2566 ^ i;
                    sArr4 = sArr;
                    abstractC154402 = abstractC15440;
                    objArr2 = objArr3;
                    i6 = i2;
                    objArr4 = objArr2;
                    c187812 = c18781;
                case 470026618:
                case 1439639598:
                    c0994.m3480(c187812.f59293);
                    c0994.m3469();
                    break;
                case 1165574967:
                case 1954499592:
                    C3911.m11930(c0994, C0798.m3005(sArr4, 48, 15, i8), z);
                    if (C1504.f5354) {
                        abstractC15440 = abstractC154402;
                        sArr = sArr4;
                        m2566 = C2105.m6981("ܶ᩻") ^ i4;
                        i5 = ((m2566 ^ i3) * (-21439)) ^ 76321237;
                        i = 1290604186;
                        objArr3 = objArr4;
                        i2 = m2566 ^ i;
                        sArr4 = sArr;
                        abstractC154402 = abstractC15440;
                        objArr2 = objArr3;
                        i6 = i2;
                        objArr4 = objArr2;
                        c187812 = c18781;
                    } else {
                        int m69812 = C2105.m6981("᩹ᩴ") ^ i3;
                        i6 = m69812 ^ 57075894;
                        i5 = ((m69812 ^ i4) * (-22291)) ^ 500957189;
                        sArr4 = sArr4;
                    }
                default:
                    abstractC15440 = abstractC154402;
                    sArr = sArr4;
                    sArr5 = f59290;
                    c = '&';
                    if (C4616.f14690 > 0) {
                        m2566 = C2105.m6981("ۜᩳ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-7767)) ^ 1433694587;
                        i = -626512152;
                        objArr3 = objArr4;
                        i2 = m2566 ^ i;
                        sArr4 = sArr;
                        abstractC154402 = abstractC15440;
                        objArr2 = objArr3;
                        i6 = i2;
                        objArr4 = objArr2;
                        c187812 = c18781;
                    }
                    m2566 = C2105.m6981("ܶ᩻") ^ i4;
                    i5 = ((m2566 ^ i3) * (-21439)) ^ 76321237;
                    i = 1290604186;
                    objArr3 = objArr4;
                    i2 = m2566 ^ i;
                    sArr4 = sArr;
                    abstractC154402 = abstractC15440;
                    objArr2 = objArr3;
                    i6 = i2;
                    objArr4 = objArr2;
                    c187812 = c18781;
            }
            return;
        }
    }
}
