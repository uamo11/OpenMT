package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.custom.sec.SecP256K1Field;

/* compiled from: 970R */
/* renamed from: l.ܿᩳܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17513 {

    /* renamed from: ۢۧܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f53487 = {2208, 27094, 27121, 27113, 27134, 27123, 27126, 27131, 27071, 27101, 27102, 27084, 27098, 27071, 27119, 27134, 27115, 27132, 27127, 27071, 27123, 27134, 27110, 27130, 27117, 27071, 27132, 27120, 27114, 27121, 27115, 27094, 27121, 27113, 27134, 27123, 27126, 27131, 27071, 27101, 27102, 27084, 27098, 27071, 27130, 27111, 27115, 27130, 27121, 27115, 27071, 27123, 27130, 27121, 27128, 27115, 27127, 27087, 27134, 27115, 27132, 27127, 27130, 27131, 27071, 27101, 27102, 27084, 27098, 27071, 27130, 27111, 27115, 27130, 27121, 27115, 27071, 27132, 27117, 27120, 27116, 27116, 27130, 27116, 27071, 27133, 27123, 27120, 27132, 27124, 27071, 27133, 27120, 27114, 27121, 27131, 27134, 27117, 27110, 27082, 27121, 27124, 27121, 27120, 27112, 27121, 27071, 27101, 27102, 27084, 27098, 27071, 27119, 27134, 27115, 27132, 27127, 27071, 27123, 27134, 27110, 27130, 27117, 27071, 27115, 27134, 27128, 27071, 27094, 27121, 27113, 27134, 27123, 27126, 27131, 27071, 27123, 27126, 27115, 27130, 27117, 27134, 27123, 27071, 27119, 27134, 27115, 27132, 27127, 27071, 27132, 27120, 27114, 27121, 27115, 27094, 27121, 27113, 27134, 27123, 27126, 27131, 27071, 27119, 27134, 27115, 27115, 27130, 27117, 27121, 27071, 27126, 27131, 27130, 27121, 27115, 27126, 27115, 27110, 27094, 27121, 27113, 27134, 27123, 27126, 27131, 27071, 27119, 27134, 27115, 27115, 27130, 27117, 27121, 27071, 27132, 27123, 27126, 27119, 27094, 27121, 27113, 27134, 27123, 27126, 27131, 27071, 27123, 27126, 27115, 27130, 27117, 27134, 27123, 27071, 27119, 27134, 27115, 27132, 27127, 27071, 27120, 27129, 27129, 27116, 27130, 27115, 27088, 27113, 27130, 27117, 27123, 27134, 27119, 27119, 27126, 27121, 27128, 27071, 27119, 27134, 27115, 27115, 27130, 27117, 27121, 27071, 27116, 27115, 27134, 27117, 27115, 27116, 27087, 27134, 27115, 27115, 27130, 27117, 27121, 27071, 27116, 27115, 27134, 27117, 27115, 27071, 27122, 27126, 27116, 27116, 27130, 27116, 27071, 27132, 27123, 27126, 27119, 5952, 4873, 4910, 4918, 4897, 4908, 4905, 4900, 4960, 4912, 4897, 4916, 4916, 4901, 4914, 4910, 4960, 4912, 4897, 4916, 4899, 4904, 4960, 4914, 4897, 4910, 4903, 4901, 4880, 4897, 4916, 4899, 4904, 4960, 4908, 4897, 4921, 4901, 4914, 4915, 4960, 4898, 4901, 4908, 4911, 4910, 4903, 4960, 4916, 4911, 4960, 4900, 4905, 4902, 4902, 4901, 4914, 4901, 4910, 4916, 4960, 4898, 4908, 4911, 4899, 4907, 4915, 4880, 4897, 4916, 4916, 4901, 4914, 4910, 4960, 4912, 4897, 4916, 4899, 4904, 4960, 4899, 4914, 4911, 4915, 4915, 4901, 4915, 4960, 4897, 4960, 4982, 4980, 4960, 4875, 4905, 4866, 4960, 4898, 4908, 4911, 4899, 4907, 4869, 4909, 4912, 4916, 4921, 4960, 4912, 4897, 4916, 4916, 4901, 4914, 4910, 4960, 4912, 4897, 4916, 4899, 4904, 4960, 4914, 4897, 4910, 4903, 4901, 4880, 4897, 4916, 4916, 4901, 4914, 4910, 4960, 4908, 4897, 4921, 4901, 4914, 4960, 4900, 4911, 4901, 4915, 4960, 4910, 4911, 4916, 4960, 4905, 4910, 4916, 4901, 4914, 4915, 4901, 4899, 4916, 4960, 4905, 4916, 4915, 4960, 4899, 4908, 4905, 4912, 4880, 4897, 4916, 4916, 4901, 4914, 4910, 4960, 4915, 4916, 4897, 4914, 4916, 4915, 4960, 4911, 4918, 4901, 4914, 4908, 4897, 4912, 1882, 16102, 16087, 16066, 16085, 16094, 16022, 16089, 16080, 16080, 16069, 16083, 16066, 16025, 16064, 16087, 16090, 16067, 16083, 16022, 16090, 16083, 16088, 16081, 16066, 16094, 16022, 16091, 16095, 16069, 16091, 16087, 16066, 16085, 16094, 16102, 16087, 16066, 16085, 16094, 16022, 16089, 16080, 16080, 16069, 16083, 16066, 16069, 16022, 16091, 16067, 16069, 16066, 16022, 16084, 16083, 16022, 16069, 16089, 16068, 16066, 16083, 16082, 16022, 16065, 16095, 16066, 16094, 16095, 16088, 16022, 16089, 16088, 16083, 16022, 16084, 16090, 16089, 16085, 16093, 1455, 27145, 27182, 27190, 27169, 27180, 27177, 27172, 27232, 27176, 27173, 27192, 27232, 27171, 27176, 27173, 27171, 27179, 27184, 27183, 27177, 27182, 27188, 27258, 27232, 1066, 7928, 7881, 7900, 7883, 7872, 7816, 7898, 7881, 7878, 7887, 7885, 7816, 7883, 7898, 7879, 7899, 7899, 7885, 7899, 7816, 7881, 7816, 7838, 7836, 7816, 7907, 7873, 7914, 7816, 7882, 7876, 7879, 7883, 7875, 3273, -1449, -1421, -1431, -1431, -1421, -1420, -1411, -1478, -1415, -1422, -1409, -1415, -1423, -1430, -1419, -1421, -1420, -1426, -1478, -1430, -1413, -1426, -1426, -1409, -1432, -1420, -1478, -1421, -1410, -1409, -1420, -1426, -1421, -1426, -1437};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f53488;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22410[] f53489;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ long m40901(long j) {
        return m40902(j, 40L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m40902(long j, long j2) {
        long j3 = 0;
        int i = -1814198210;
        int i2 = RunnableC1937.f6483;
        int i3 = C11340.f33930;
        int m6981 = C2105.m6981("ܰ֡") ^ i2;
        int i4 = ((m6981 ^ i3) * 28523) ^ 1718558276;
        int i5 = 1914199044;
        while (true) {
            i = ((((i ^ i3) * 9465) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1839856590:
                case -980606520:
                    if (j3 < j) {
                        m6981 = C2105.m6981("ܽۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-10755)) ^ (-871788321);
                        i5 = 1412353615;
                    } else {
                        m6981 = (C0630.m2566("᩵۠") + i3) * 77;
                        i4 = ((m6981 ^ i2) * 24019) ^ 1296021374;
                        i5 = 352453814;
                    }
                case -1839679810:
                case 1246818897:
                    C0237.m1481();
                    C0422.m1963();
                    return 0L;
                case -1833334248:
                case -532669976:
                    C2126.m7040();
                    if (C2958.m9034() <= 0) {
                        m6981 = C2105.m6981("᩵ܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * 23931) ^ (-379077509);
                        i5 = 62411518;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۨܽ")) * (-35);
                        i4 = ((m6981 ^ i2) * 32177) ^ (-540413757);
                        i5 = 1558965152;
                    }
                case -1565454645:
                case -839123463:
                    C11340.m28031();
                    if (C1047.f3863 < 0) {
                        m6981 = C2105.m6981("᩵ܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * 23931) ^ (-379077509);
                        i5 = 62411518;
                    } else {
                        m6981 = C0630.m2566("ۛ᩸") ^ i2;
                        i4 = ((m6981 ^ i3) * 14901) ^ 1839435402;
                        i5 = 1288625483;
                    }
                case -1527068901:
                case -671492156:
                    if (C1294.f4556 >= 0) {
                        m6981 = C2105.m6981("᩵ܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * 23931) ^ (-379077509);
                        i5 = 62411518;
                    } else {
                        m6981 = (i2 - C2105.m6981("ۘ֨")) * 47;
                        i4 = ((m6981 ^ i3) * 10601) ^ 82493882;
                        i5 = 686678638;
                    }
                case -1363056976:
                case -995849235:
                    return j3;
                case -1319330127:
                case -584192868:
                    C1420.m4913();
                    C4616.m13552();
                    m6981 = C2105.m6981("᩵ܿ") ^ i2;
                    i4 = ((m6981 ^ i3) * 23931) ^ (-379077509);
                    i5 = 62411518;
                case -1229951595:
                case -1216225724:
                    if (C0237.m1481() >= 0) {
                        m6981 = (i3 - C0630.m2566("ۨܽ")) * (-35);
                        i4 = ((m6981 ^ i2) * 32177) ^ (-540413757);
                        i5 = 1558965152;
                    } else {
                        m6981 = (C0630.m2566("ۗ۟") + i3) * (-103);
                        i4 = ((m6981 ^ i2) * (-22045)) ^ 1571315842;
                        i5 = -1575569230;
                    }
                case -1089405698:
                case 1969770616:
                    if (C2520.f8000 >= 0) {
                        m6981 = C0630.m2566("ۛ᩸") ^ i2;
                        i4 = ((m6981 ^ i3) * 14901) ^ 1839435402;
                        i5 = 1288625483;
                    } else {
                        m6981 = C2105.m6981("۫ܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * 22869) ^ 1071351631;
                        i5 = -2060917778;
                    }
                case -976357798:
                case 641961472:
                    return C13132.FOREVER_NS;
                case -856620615:
                case 1476974498:
                    if (C0714.f2697 >= 0) {
                        m6981 = (i3 - C0630.m2566("ۨܽ")) * (-35);
                        i4 = ((m6981 ^ i2) * 32177) ^ (-540413757);
                        i5 = 1558965152;
                    } else {
                        m6981 = (i2 - C0630.m2566("ۚ᩶")) * 75;
                        i4 = ((m6981 ^ i3) * (-15343)) ^ 221304000;
                        i5 = -938199390;
                    }
                case -607391466:
                case -470063265:
                    if (C5695.m16023() >= 0) {
                        m6981 = (i3 - C0630.m2566("ۨܽ")) * (-35);
                        i4 = ((m6981 ^ i2) * 32177) ^ (-540413757);
                        i5 = 1558965152;
                    } else {
                        m6981 = C0630.m2566("۫᩸") ^ i2;
                        i4 = ((m6981 ^ i3) * (-11495)) ^ 289762785;
                        i5 = -407390048;
                    }
                case -324626980:
                case 677227303:
                    if (j3 >= 0) {
                        m6981 = C2105.m6981("ܽۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 15401) ^ 122990662;
                        i5 = 296214974;
                    } else {
                        m6981 = C2105.m6981("ܽۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-10755)) ^ (-871788321);
                        i5 = 1412353615;
                    }
                case -102819842:
                case 10787638:
                    if (C7106.m19120() <= 0) {
                        m6981 = (i3 - C0630.m2566("ۨܽ")) * (-35);
                        i4 = ((m6981 ^ i2) * 32177) ^ (-540413757);
                        i5 = 1558965152;
                    } else {
                        m6981 = C2105.m6981("۠᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * (-5445)) ^ (-285180491);
                        i5 = -1168311650;
                    }
                case 348905840:
                case 852408053:
                    j3 = j2 + j;
                    if (C2126.m7040()) {
                        m6981 = (i3 - C2105.m6981("ۚ᩵")) * 57;
                        i4 = ((m6981 ^ i2) * 6585) ^ 1949183620;
                        i5 = -1713943934;
                    } else {
                        m6981 = C2105.m6981("֫֡") ^ i3;
                        i4 = ((m6981 ^ i2) * (-889)) ^ 1661567547;
                        i5 = 948701110;
                    }
                case 464629793:
                case 594290905:
                    if (C4263.f13799 <= 0) {
                        m6981 = C2105.m6981("᩵ܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * 23931) ^ (-379077509);
                        i5 = 62411518;
                    } else {
                        m6981 = (C0630.m2566("ۧ᩺") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((m6981 ^ i2) * 14835) ^ 1353792503;
                        i5 = 1228895431;
                    }
                case 488389381:
                case 1985255271:
                    if (C4616.f14690 <= 0) {
                        m6981 = C0630.m2566("ۛ᩸") ^ i2;
                        i4 = ((m6981 ^ i3) * 14901) ^ 1839435402;
                        i5 = 1288625483;
                    } else {
                        m6981 = (C2105.m6981("ۖ᩹") ^ i3) * 77;
                        i4 = ((m6981 ^ i2) * 9441) ^ (-852906911);
                        i5 = -206390966;
                    }
                case 733989409:
                case 1969315109:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = (i2 - C2105.m6981("ۘ֨")) * 47;
                        i4 = ((m6981 ^ i3) * 10601) ^ 82493882;
                        i5 = 686678638;
                    } else {
                        m6981 = C2105.m6981("᩶ۨ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-22795)) ^ 378261359;
                        i5 = 416816567;
                    }
                default:
                    if (C11340.f33930 >= 0) {
                        m6981 = C2105.m6981("᩵ܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * 23931) ^ (-379077509);
                        i5 = 62411518;
                    } else {
                        m6981 = (C2105.m6981("ܿۚ") + i2) * (-19);
                        i4 = ((m6981 ^ i3) * SecP256K1Field.PInv33) ^ 769243228;
                        i5 = -1699402668;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C17513 m40908(InterfaceC22410 interfaceC22410) {
        int i;
        InterfaceC22410[] interfaceC22410Arr;
        InterfaceC22410[] interfaceC22410Arr2;
        int i2;
        long[] jArr;
        int i3;
        InterfaceC22410[] interfaceC22410Arr3;
        InterfaceC22410[] interfaceC22410Arr4;
        int i4;
        int i5;
        long j;
        long j2;
        int i6;
        int i7;
        int i8;
        InterfaceC22410[] interfaceC22410Arr5;
        int i9;
        int i10;
        InterfaceC22410[] interfaceC22410Arr6;
        long[] jArr2;
        int i11;
        int i12;
        int i13;
        int i14;
        InterfaceC22410[] interfaceC22410Arr7;
        int i15;
        int i16;
        int i17;
        int i18;
        InterfaceC22410[] interfaceC22410Arr8;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        InterfaceC22410[] interfaceC22410Arr9;
        long[] jArr3;
        int i24;
        int i25;
        InterfaceC22410[] interfaceC22410Arr10;
        int i26;
        int m2566;
        int i27;
        long[] jArr4;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        InterfaceC22410[] interfaceC22410Arr11;
        InterfaceC22410[] interfaceC22410Arr12;
        int i38;
        InterfaceC22410[] interfaceC22410Arr13;
        int i39;
        int i40;
        int i41;
        long[] jArr5;
        InterfaceC22410[] interfaceC22410Arr14;
        int i42;
        int i43;
        int i44;
        int i45;
        InterfaceC22410[] interfaceC22410Arr15;
        InterfaceC22410[] interfaceC22410Arr16;
        int i46;
        long[] jArr6;
        int i47;
        int i48;
        int i49;
        int i50;
        InterfaceC22410[] interfaceC22410Arr17;
        int i51;
        int m25662;
        int i52;
        int i53;
        long[] jArr7;
        int i54;
        int i55;
        int m25663;
        int i56;
        int i57;
        InterfaceC22410[] interfaceC22410Arr18;
        int i58;
        int m25664;
        int i59;
        int i60;
        int i61;
        int m6981;
        int i62;
        int i63;
        int i64;
        int i65;
        int i66;
        int i67;
        InterfaceC22410[] interfaceC22410Arr19;
        int i68;
        int i69;
        int i70;
        long j3;
        int i71;
        int i72;
        long j4;
        int i73;
        int i74;
        int i75;
        InterfaceC22410[] interfaceC22410Arr20;
        int i76;
        int i77;
        int i78;
        int i79;
        int i80;
        int i81;
        int i82;
        int i83;
        int i84;
        int i85;
        InterfaceC22410[] interfaceC22410Arr21;
        int i86;
        int i87;
        int i88;
        int i89;
        int i90;
        int i91;
        int m25665;
        int i92;
        int i93;
        int m25666;
        int i94;
        int i95;
        int i96;
        int i97;
        int i98;
        int i99;
        int m25667;
        int i100;
        int i101;
        int i102;
        long j5;
        int i103;
        long j6;
        int i104;
        int i105;
        int i106;
        long j7;
        int m69812;
        int i107;
        int i108;
        int i109;
        int m69813;
        int i110;
        int i111;
        int m69814;
        int i112;
        int i113;
        int m25668;
        int i114;
        int i115;
        long[] jArr8 = null;
        long j8 = 0;
        long j9 = 0;
        int i116 = 0;
        int i117 = 0;
        long j10 = 0;
        long j11 = 0;
        int i118 = 0;
        int i119 = 0;
        int i120 = 0;
        int i121 = 369902139;
        int i122 = C2167.f7158;
        int i123 = C3432.f10845;
        int m25669 = C0630.m2566("۫ۜ") ^ i123;
        int i124 = ((m25669 ^ i122) * (-9891)) ^ (-1353519323);
        int i125 = m25669 ^ 320825963;
        InterfaceC22410[] interfaceC22410Arr22 = null;
        InterfaceC22410[] interfaceC22410Arr23 = null;
        InterfaceC22410 interfaceC224102 = null;
        Object[] objArr = null;
        InterfaceC22410[] interfaceC22410Arr24 = null;
        long[] jArr9 = null;
        InterfaceC22410 interfaceC224103 = null;
        long j12 = 0;
        int i126 = 0;
        int i127 = 0;
        int i128 = 0;
        int i129 = 0;
        int i130 = 0;
        int i131 = 0;
        int i132 = 0;
        int i133 = 0;
        int i134 = 0;
        int i135 = 0;
        int i136 = 0;
        InterfaceC22410[] interfaceC22410Arr25 = null;
        int i137 = 0;
        int i138 = 0;
        int i139 = 0;
        int i140 = 0;
        int i141 = 0;
        int i142 = 0;
        int i143 = 0;
        int i144 = 0;
        InterfaceC22410[] interfaceC22410Arr26 = null;
        C17513 c17513 = null;
        long j13 = 0;
        int i145 = 0;
        InterfaceC22410[] interfaceC22410Arr27 = null;
        InterfaceC22410[] interfaceC22410Arr28 = null;
        int i146 = 0;
        while (true) {
            i121 = i125 ^ (i124 & (((i121 ^ i122) * 7343) >> 31));
            switch (i121) {
                case -2116573948:
                case 397872936:
                    i43 = i129;
                    i44 = i130;
                    interfaceC22410Arr15 = interfaceC22410Arr25;
                    int i147 = i139;
                    interfaceC22410Arr16 = interfaceC22410Arr22;
                    i46 = i126;
                    i50 = i127;
                    interfaceC22410Arr17 = interfaceC22410Arr27;
                    i51 = i128;
                    long j14 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j14;
                    InterfaceC22410[] interfaceC22410Arr29 = new InterfaceC22410[interfaceC22410Arr15.length];
                    jArr6 = jArr9;
                    i54 = i135;
                    i49 = i147;
                    i45 = i136;
                    AbstractC2021.m6568(interfaceC22410Arr15, i54, interfaceC22410Arr29, i54, i45);
                    interfaceC22410Arr26 = interfaceC22410Arr29;
                    i133 = i45;
                    i47 = i134;
                    i48 = i54;
                    m25662 = (C2105.m6981("ܶۧ") ^ i122) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i52 = ((m25662 ^ i123) * 22075) ^ 1871994395;
                    i53 = -1614083683;
                    i126 = i46;
                    interfaceC22410Arr22 = interfaceC22410Arr16;
                    i129 = i43;
                    int i148 = i51;
                    interfaceC22410Arr27 = interfaceC22410Arr17;
                    i127 = i50;
                    i139 = i49;
                    i135 = i48;
                    i134 = i47;
                    i136 = i45;
                    i130 = i44;
                    i125 = m25662 ^ i53;
                    i128 = i148;
                    jArr7 = jArr6;
                    interfaceC22410Arr25 = interfaceC22410Arr15;
                    i124 = i52;
                    jArr9 = jArr7;
                    long j15 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j15;
                case -2107182817:
                case -1027037354:
                    i = i129;
                    i28 = i130;
                    i29 = i136;
                    interfaceC22410Arr = interfaceC22410Arr25;
                    interfaceC22410Arr18 = interfaceC22410Arr22;
                    i2 = i126;
                    jArr = jArr9;
                    i32 = i134;
                    int i149 = i146;
                    i58 = i135;
                    i30 = i139;
                    i31 = i127;
                    InterfaceC22410[] interfaceC22410Arr30 = interfaceC22410Arr27;
                    i3 = i128;
                    interfaceC22410Arr3 = interfaceC22410Arr23;
                    interfaceC22410Arr4 = interfaceC22410Arr30;
                    long j16 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j16;
                    if (interfaceC22410Arr18.length == 0) {
                        i146 = i149;
                        i61 = i4;
                        int m256610 = C0630.m2566("۬᩷") ^ i122;
                        int i150 = ((m256610 ^ i123) * 10859) ^ 1460462032;
                        int i151 = i28;
                        i125 = m256610 ^ 1696471788;
                        i126 = i2;
                        interfaceC22410Arr22 = interfaceC22410Arr18;
                        i129 = i;
                        long j17 = j;
                        i143 = i61;
                        i145 = i5;
                        i127 = i31;
                        j12 = j2;
                        i139 = i30;
                        j13 = j17;
                        i135 = i58;
                        i134 = i32;
                        i136 = i29;
                        i130 = i151;
                        long[] jArr10 = jArr;
                        interfaceC22410Arr25 = interfaceC22410Arr;
                        i124 = i150;
                        jArr9 = jArr10;
                        InterfaceC22410[] interfaceC22410Arr31 = interfaceC22410Arr4;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr31;
                    } else {
                        m25664 = (C2105.m6981("ᩳܶ") + i123) * 15;
                        i146 = i149;
                        i59 = ((m25664 ^ i122) * 19333) ^ 844348045;
                        i60 = -739956041;
                        i126 = i2;
                        interfaceC22410Arr22 = interfaceC22410Arr18;
                        i129 = i;
                        int i152 = i28;
                        i125 = m25664 ^ i60;
                        i127 = i31;
                        i139 = i30;
                        i135 = i58;
                        i134 = i32;
                        i136 = i29;
                        i130 = i152;
                        long[] jArr11 = jArr;
                        interfaceC22410Arr25 = interfaceC22410Arr;
                        i124 = i59;
                        jArr9 = jArr11;
                        InterfaceC22410[] interfaceC22410Arr32 = interfaceC22410Arr4;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr32;
                        long j18 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j18;
                    }
                case -2059194292:
                case -1112902729:
                    i106 = i126 + 1;
                    i102 = i130;
                    j5 = j13;
                    i103 = i144;
                    i129 = 1024;
                    j6 = j12;
                    i104 = i143;
                    i105 = i145;
                    int m69815 = C2105.m6981("ۨۗ") ^ i123;
                    int i153 = i106;
                    int i154 = ((m69815 ^ i122) * (-6955)) ^ 226774153;
                    int i155 = m69815 ^ 2083744086;
                    i144 = i103;
                    i124 = i154;
                    i126 = i153;
                    i145 = i105;
                    i143 = i104;
                    j12 = j6;
                    j13 = j5;
                    i130 = i102;
                    i125 = i155;
                case -2030731003:
                case -599768786:
                    C3537.m10746();
                    if (C3683.f11629 >= 0) {
                        m25668 = (C0630.m2566("ۧᩴ") ^ i122) * (-109);
                        i114 = ((m25668 ^ i123) * 19597) ^ 1886944276;
                        i115 = -1769605081;
                        i125 = m25668 ^ i115;
                        i124 = i114;
                    }
                    m25668 = (C2105.m6981("ۙۧ") ^ i123) * 27;
                    i114 = ((m25668 ^ i122) * 7919) ^ (-1680608994);
                    i115 = -2010476399;
                    i125 = m25668 ^ i115;
                    i124 = i114;
                case -2001936254:
                case -1947187507:
                    i16 = i129;
                    i17 = i130;
                    i64 = i137;
                    i24 = i139;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i19 = i126;
                    i25 = i127;
                    interfaceC22410Arr10 = interfaceC22410Arr27;
                    i26 = i128;
                    long j19 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j19;
                    interfaceC22410Arr24 = (InterfaceC22410[]) Arrays.copyOf(interfaceC22410Arr10, i64);
                    if (C3537.m10746() > 0) {
                        i137 = i64;
                        m6981 = C0630.m2566("᩷ᩴ") ^ i123;
                        i62 = ((m6981 ^ i122) * 28601) ^ (-1628219781);
                        i63 = 251935791;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i113 = i26;
                        interfaceC22410Arr27 = interfaceC22410Arr10;
                        i127 = i25;
                        i139 = i24;
                        i130 = i17;
                        i125 = m6981 ^ i63;
                        i124 = i62;
                        i128 = i113;
                        long j20 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j20;
                    }
                    int m69816 = (C2105.m6981("۟ۢ") ^ i122) * 127;
                    i137 = i64;
                    i124 = ((m69816 ^ i123) * (-6671)) ^ (-2095191771);
                    i126 = i19;
                    interfaceC22410Arr22 = interfaceC22410Arr8;
                    i129 = i16;
                    i113 = i26;
                    interfaceC22410Arr27 = interfaceC22410Arr10;
                    i127 = i25;
                    i139 = i24;
                    i130 = i17;
                    i125 = m69816 ^ (-1212727239);
                    i128 = i113;
                    long j202 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j202;
                case -1980048934:
                case -1173149222:
                    i16 = i129;
                    i17 = i130;
                    i24 = i139;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i19 = i126;
                    i25 = i127;
                    interfaceC22410Arr10 = interfaceC22410Arr27;
                    long j21 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j21;
                    interfaceC22410Arr24[interfaceC22410Arr10.length] = interfaceC22410;
                    i26 = i128;
                    if (interfaceC22410Arr24.length >= 16) {
                        m6981 = (C0630.m2566("᩺ܽ") ^ i122) * 97;
                        i62 = ((m6981 ^ i123) * 12391) ^ (-80559839);
                        i63 = -1589517830;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i113 = i26;
                        interfaceC22410Arr27 = interfaceC22410Arr10;
                        i127 = i25;
                        i139 = i24;
                        i130 = i17;
                        i125 = m6981 ^ i63;
                        i124 = i62;
                        i128 = i113;
                        long j2022 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j2022;
                    }
                    m6981 = C0630.m2566("۫ܰ") ^ i123;
                    i62 = ((m6981 ^ i122) * 29849) ^ 1058249986;
                    i63 = -1535825876;
                    i126 = i19;
                    interfaceC22410Arr22 = interfaceC22410Arr8;
                    i129 = i16;
                    i113 = i26;
                    interfaceC22410Arr27 = interfaceC22410Arr10;
                    i127 = i25;
                    i139 = i24;
                    i130 = i17;
                    i125 = m6981 ^ i63;
                    i124 = i62;
                    i128 = i113;
                    long j20222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j20222;
                case -1969937679:
                case -1262242354:
                    i = i129;
                    i28 = i130;
                    i29 = i136;
                    interfaceC22410Arr = interfaceC22410Arr25;
                    interfaceC22410Arr2 = interfaceC22410Arr22;
                    i2 = i126;
                    jArr = jArr9;
                    i32 = i134;
                    int i156 = i135;
                    i30 = i139;
                    i31 = i127;
                    InterfaceC22410[] interfaceC22410Arr33 = interfaceC22410Arr27;
                    i3 = i128;
                    interfaceC22410Arr3 = interfaceC22410Arr23;
                    interfaceC22410Arr4 = interfaceC22410Arr33;
                    long j22 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j22;
                    if (interfaceC22410Arr3 == null) {
                        i33 = i156;
                        interfaceC22410Arr18 = interfaceC22410Arr;
                        i58 = i33;
                        m25664 = C0630.m2566("ᩳ᩻") ^ i123;
                        i59 = ((m25664 ^ i122) * 4057) ^ 1817171443;
                        i60 = 1849604205;
                        i126 = i2;
                        interfaceC22410Arr22 = interfaceC22410Arr18;
                        i129 = i;
                        int i1522 = i28;
                        i125 = m25664 ^ i60;
                        i127 = i31;
                        i139 = i30;
                        i135 = i58;
                        i134 = i32;
                        i136 = i29;
                        i130 = i1522;
                        long[] jArr112 = jArr;
                        interfaceC22410Arr25 = interfaceC22410Arr;
                        i124 = i59;
                        jArr9 = jArr112;
                        InterfaceC22410[] interfaceC22410Arr322 = interfaceC22410Arr4;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr322;
                        long j182 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j182;
                    } else {
                        int m256611 = C0630.m2566("ۢۤ") ^ i122;
                        jArr9 = jArr;
                        interfaceC22410Arr25 = interfaceC22410Arr;
                        i124 = ((m256611 ^ i123) * 14445) ^ 346478892;
                        i127 = i31;
                        i139 = i30;
                        i135 = i156;
                        i134 = i32;
                        i136 = i29;
                        i130 = i28;
                        i125 = m256611 ^ 1146903889;
                        i126 = i2;
                        interfaceC22410Arr22 = interfaceC22410Arr2;
                        i129 = i;
                        InterfaceC22410[] interfaceC22410Arr34 = interfaceC22410Arr4;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr34;
                        long j202222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j202222;
                    }
                case -1943737916:
                case 1717750402:
                    C22628.m50615();
                    if (C0237.m1481() >= 0) {
                        i16 = i129;
                        i17 = i130;
                        interfaceC22410Arr8 = interfaceC22410Arr22;
                        i90 = i144;
                        i19 = i126;
                        i91 = i127;
                        long j23 = j12;
                        i4 = i143;
                        i5 = i145;
                        j = j13;
                        j2 = j23;
                        m25666 = (C0630.m2566("ۙۚ") + i122) * (-115);
                        i94 = ((m25666 ^ i123) * (-30677)) ^ 1263380220;
                        i95 = 1431850307;
                        i97 = m25666 ^ i95;
                        i144 = i90;
                        i124 = i94;
                        i127 = i91;
                        i130 = i17;
                        i125 = i97;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        j4 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j4;
                    } else {
                        m25668 = (i123 - C0630.m2566("֨ۖ")) * 77;
                        i114 = ((m25668 ^ i122) * (-20557)) ^ (-412368169);
                        i115 = -1431773668;
                        i125 = m25668 ^ i115;
                        i124 = i114;
                    }
                case -1908412528:
                case 291614369:
                    return new C17513(i143, interfaceC22410Arr24);
                case -1895605945:
                case 302087193:
                    int i157 = i130;
                    j7 = j13;
                    int i158 = i144;
                    j2 = j12;
                    if (i131 < i158) {
                        m69812 = C2105.m6981("ۗ᩵") ^ i123;
                        i107 = ((m69812 ^ i122) * 30819) ^ (-1325255565);
                        i108 = 1993612777;
                    } else {
                        m69812 = C2105.m6981("ᩴᩳ") ^ i122;
                        i107 = ((m69812 ^ i123) * 15061) ^ (-1023819247);
                        i108 = -65115150;
                    }
                    int i159 = m69812 ^ i108;
                    i144 = i158;
                    i124 = i107;
                    i109 = i157;
                    i125 = i159;
                    j12 = j2;
                    j13 = j7;
                    i130 = i109;
                case -1866152431:
                case -1862070221:
                    C2520.m8026();
                    if (!C2126.m7040()) {
                        i16 = i129;
                        i98 = i130;
                        i99 = i144;
                        long j24 = j12;
                        i4 = i143;
                        i5 = i145;
                        j = j13;
                        j2 = j24;
                        m25667 = C0630.m2566("ۨ᩸") ^ i123;
                        i100 = ((m25667 ^ i122) * 169) ^ (-880552637);
                        i101 = 50518361;
                        int i160 = m25667 ^ i101;
                        i144 = i99;
                        i124 = i100;
                        i130 = i98;
                        i125 = i160;
                        i129 = i16;
                        j4 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j4;
                    }
                    i16 = i129;
                    i79 = i130;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i80 = i144;
                    i19 = i126;
                    i83 = i139;
                    i81 = i127;
                    long j25 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j25;
                    int m69817 = (C2105.m6981("ۜᩴ") + i122) * (-93);
                    int i161 = i83;
                    i82 = ((m69817 ^ i123) * 28885) ^ 1784404255;
                    i130 = i79;
                    i125 = m69817 ^ (-594393368);
                    i127 = i81;
                    i139 = i161;
                    i144 = i80;
                    i124 = i82;
                    i126 = i19;
                    interfaceC22410Arr22 = interfaceC22410Arr8;
                    i129 = i16;
                    j4 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j4;
                case -1790885478:
                case -1529293162:
                    i16 = i129;
                    i17 = i130;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i55 = i144;
                    i19 = i126;
                    long j26 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j26;
                    j9 = 96 * j8;
                    if (C1773.f6144 <= 0) {
                        i144 = i55;
                        i18 = i136;
                        i20 = i134;
                        i21 = i135;
                        i22 = i139;
                        i23 = i127;
                        interfaceC22410Arr9 = interfaceC22410Arr25;
                        jArr3 = jArr9;
                        InterfaceC22410[] interfaceC22410Arr35 = interfaceC22410Arr27;
                        i3 = i128;
                        interfaceC22410Arr3 = interfaceC22410Arr23;
                        interfaceC22410Arr4 = interfaceC22410Arr35;
                        m2566 = (i122 - C0630.m2566("ܰۤ")) * (-49);
                        i6 = ((m2566 ^ i123) * 25755) ^ (-552260375);
                        i27 = 538438792;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        jArr4 = jArr3;
                        interfaceC22410Arr25 = interfaceC22410Arr9;
                        i127 = i23;
                        i139 = i22;
                        i135 = i21;
                        i134 = i20;
                        i136 = i18;
                        i130 = i17;
                        i125 = m2566 ^ i27;
                        i124 = i6;
                        jArr9 = jArr4;
                        InterfaceC22410[] interfaceC22410Arr36 = interfaceC22410Arr4;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr36;
                        long j152 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j152;
                    } else {
                        m25663 = C0630.m2566("ۖ᩻") ^ i123;
                        i56 = ((m25663 ^ i122) * 19121) ^ 2132101391;
                        i57 = -1896531020;
                        i97 = m25663 ^ i57;
                        i144 = i55;
                        i124 = i56;
                        i130 = i17;
                        i125 = i97;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        j4 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j4;
                    }
                case -1706415460:
                case -1010784065:
                    i17 = i130;
                    InterfaceC22410 interfaceC224104 = interfaceC22410Arr24[i131];
                    j2 = j12;
                    j7 = Math.max(interfaceC224104.mo32108(), interfaceC224104.mo32100());
                    if (C4616.m13552() != 0) {
                        i4 = i143;
                        i5 = i145;
                        i90 = i144;
                        j = j7;
                        i91 = i127;
                        i16 = i129;
                        interfaceC22410Arr8 = interfaceC22410Arr22;
                        i19 = i126;
                        m25666 = (C0630.m2566("ۙۚ") + i122) * (-115);
                        i94 = ((m25666 ^ i123) * (-30677)) ^ 1263380220;
                        i95 = 1431850307;
                        i97 = m25666 ^ i95;
                        i144 = i90;
                        i124 = i94;
                        i127 = i91;
                        i130 = i17;
                        i125 = i97;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        j4 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j4;
                    } else {
                        m69813 = (C2105.m6981("ۙۙ") ^ i123) * 101;
                        i110 = ((m69813 ^ i122) * 18677) ^ 2035026127;
                        i111 = 456078849;
                        i109 = i17;
                        i125 = m69813 ^ i111;
                        i124 = i110;
                        j12 = j2;
                        j13 = j7;
                        i130 = i109;
                    }
                case -1660285643:
                case 54246213:
                    i2 = i126;
                    i = i129;
                    i28 = i130;
                    i29 = i136;
                    interfaceC22410Arr = interfaceC22410Arr25;
                    jArr = jArr9;
                    i32 = i134;
                    i58 = i135;
                    i30 = i139;
                    i31 = i127;
                    InterfaceC22410[] interfaceC22410Arr37 = interfaceC22410Arr27;
                    i3 = i128;
                    interfaceC22410Arr3 = interfaceC22410Arr23;
                    long j27 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j27;
                    interfaceC22410Arr18 = (InterfaceC22410[]) Arrays.copyOf(interfaceC22410Arr3, i146);
                    interfaceC22410Arr4 = interfaceC22410Arr37;
                    m25664 = C0630.m2566("ᩳ᩻") ^ i123;
                    i59 = ((m25664 ^ i122) * 4057) ^ 1817171443;
                    i60 = 1849604205;
                    i126 = i2;
                    interfaceC22410Arr22 = interfaceC22410Arr18;
                    i129 = i;
                    int i15222 = i28;
                    i125 = m25664 ^ i60;
                    i127 = i31;
                    i139 = i30;
                    i135 = i58;
                    i134 = i32;
                    i136 = i29;
                    i130 = i15222;
                    long[] jArr1122 = jArr;
                    interfaceC22410Arr25 = interfaceC22410Arr;
                    i124 = i59;
                    jArr9 = jArr1122;
                    InterfaceC22410[] interfaceC22410Arr3222 = interfaceC22410Arr4;
                    interfaceC22410Arr23 = interfaceC22410Arr3;
                    i128 = i3;
                    interfaceC22410Arr27 = interfaceC22410Arr3222;
                    long j1822 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j1822;
                case -1610788762:
                case -114829275:
                    i98 = i130;
                    long j28 = j13;
                    i99 = i144;
                    j2 = j12;
                    i4 = i143;
                    i5 = i145;
                    interfaceC224103 = interfaceC22410Arr22[i132];
                    j = j28;
                    i16 = i129;
                    Arrays.fill(jArr9, 0L);
                    if (RunnableC1937.f6483 < 0) {
                        m25667 = (C0630.m2566("ᩴܿ") ^ i123) * (-83);
                        i100 = ((m25667 ^ i122) * (-9385)) ^ 700424638;
                        i101 = -1876440316;
                        int i1602 = m25667 ^ i101;
                        i144 = i99;
                        i124 = i100;
                        i130 = i98;
                        i125 = i1602;
                        i129 = i16;
                        j4 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j4;
                    }
                    m25667 = C0630.m2566("ۨ᩸") ^ i123;
                    i100 = ((m25667 ^ i122) * 169) ^ (-880552637);
                    i101 = 50518361;
                    int i16022 = m25667 ^ i101;
                    i144 = i99;
                    i124 = i100;
                    i130 = i98;
                    i125 = i16022;
                    i129 = i16;
                    j4 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j4;
                case -1548545500:
                case -981148844:
                    i34 = i129;
                    i35 = i130;
                    interfaceC22410Arr11 = interfaceC22410Arr25;
                    interfaceC22410Arr13 = interfaceC22410Arr22;
                    i39 = i126;
                    jArr5 = jArr9;
                    int i162 = i135;
                    i38 = i139;
                    i40 = i127;
                    InterfaceC22410[] interfaceC22410Arr38 = interfaceC22410Arr27;
                    i41 = i128;
                    long j29 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j29;
                    interfaceC22410Arr12 = interfaceC22410Arr38;
                    interfaceC22410Arr14 = interfaceC22410Arr26;
                    i146 = i133;
                    i42 = i136 + 1;
                    i36 = i134;
                    i37 = i162;
                    int m256612 = (i122 - C0630.m2566("۬᩵")) * 109;
                    i126 = i39;
                    interfaceC22410Arr22 = interfaceC22410Arr13;
                    i129 = i34;
                    InterfaceC22410[] interfaceC22410Arr39 = interfaceC22410Arr12;
                    interfaceC22410Arr23 = interfaceC22410Arr14;
                    i127 = i40;
                    i139 = i38;
                    i135 = i37;
                    i134 = i36;
                    i136 = i42;
                    i128 = i41;
                    interfaceC22410Arr27 = interfaceC22410Arr39;
                    jArr7 = jArr5;
                    interfaceC22410Arr25 = interfaceC22410Arr11;
                    i124 = ((m256612 ^ i123) * 4311) ^ 1100663103;
                    i130 = i35;
                    i125 = m256612 ^ (-999481490);
                    jArr9 = jArr7;
                    long j1522 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j1522;
                case -1527938172:
                case 1086937033:
                    i16 = i129;
                    i17 = i130;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i90 = i144;
                    i19 = i126;
                    long j30 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j30;
                    c17513 = m40905(i4, interfaceC22410Arr24);
                    i91 = i127;
                    long length = interfaceC22410Arr24.length;
                    if (C22628.f73083 <= 0) {
                        j8 = length;
                        m25666 = (C0630.m2566("ۙۚ") + i122) * (-115);
                        i94 = ((m25666 ^ i123) * (-30677)) ^ 1263380220;
                        i95 = 1431850307;
                        i97 = m25666 ^ i95;
                        i144 = i90;
                        i124 = i94;
                        i127 = i91;
                        i130 = i17;
                        i125 = i97;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        j4 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j4;
                    } else {
                        int m69818 = C2105.m6981("᩷ۤ") ^ i122;
                        i92 = ((m69818 ^ i123) * (-21065)) ^ 840941033;
                        i96 = m69818 ^ 1276442353;
                        i144 = i90;
                        j8 = length;
                        i124 = i92;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i15 = i17;
                        i125 = i96;
                        i127 = i91;
                        i130 = i15;
                        long j2022222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j2022222;
                    }
                case -1509168110:
                case 1295009972:
                    jArr3 = jArr9;
                    i16 = i129;
                    i17 = i130;
                    i18 = i136;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i19 = i126;
                    i20 = i134;
                    i21 = i135;
                    i22 = i139;
                    i23 = i127;
                    InterfaceC22410[] interfaceC22410Arr40 = interfaceC22410Arr27;
                    i3 = i128;
                    interfaceC22410Arr3 = interfaceC22410Arr23;
                    interfaceC22410Arr4 = interfaceC22410Arr40;
                    long j31 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j31;
                    interfaceC22410Arr9 = this.f53489;
                    if (C3911.f12484 < 0) {
                        m2566 = (i123 - C0630.m2566("ܿۖ")) * (-61);
                        i6 = ((m2566 ^ i122) * (-25943)) ^ (-103783942);
                        i27 = 670929843;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        jArr4 = jArr3;
                        interfaceC22410Arr25 = interfaceC22410Arr9;
                        i127 = i23;
                        i139 = i22;
                        i135 = i21;
                        i134 = i20;
                        i136 = i18;
                        i130 = i17;
                        i125 = m2566 ^ i27;
                        i124 = i6;
                        jArr9 = jArr4;
                        InterfaceC22410[] interfaceC22410Arr362 = interfaceC22410Arr4;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr362;
                        long j15222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j15222;
                    }
                    m2566 = (i122 - C0630.m2566("ܰۤ")) * (-49);
                    i6 = ((m2566 ^ i123) * 25755) ^ (-552260375);
                    i27 = 538438792;
                    i126 = i19;
                    interfaceC22410Arr22 = interfaceC22410Arr8;
                    i129 = i16;
                    jArr4 = jArr3;
                    interfaceC22410Arr25 = interfaceC22410Arr9;
                    i127 = i23;
                    i139 = i22;
                    i135 = i21;
                    i134 = i20;
                    i136 = i18;
                    i130 = i17;
                    i125 = m2566 ^ i27;
                    i124 = i6;
                    jArr9 = jArr4;
                    InterfaceC22410[] interfaceC22410Arr3622 = interfaceC22410Arr4;
                    interfaceC22410Arr23 = interfaceC22410Arr3;
                    i128 = i3;
                    interfaceC22410Arr27 = interfaceC22410Arr3622;
                    long j152222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j152222;
                case -1240042783:
                case 171540716:
                    if (C3019.m9255() > 0) {
                        i16 = i129;
                        i17 = i130;
                        i24 = i139;
                        interfaceC22410Arr8 = interfaceC22410Arr22;
                        i19 = i126;
                        i25 = i127;
                        interfaceC22410Arr10 = interfaceC22410Arr27;
                        i26 = i128;
                        long j32 = j12;
                        i4 = i143;
                        i5 = i145;
                        j = j13;
                        j2 = j32;
                        m6981 = C0630.m2566("֫֡") ^ i123;
                        i62 = ((m6981 ^ i122) * 16239) ^ 1471309623;
                        i63 = -1157268526;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i113 = i26;
                        interfaceC22410Arr27 = interfaceC22410Arr10;
                        i127 = i25;
                        i139 = i24;
                        i130 = i17;
                        i125 = m6981 ^ i63;
                        i124 = i62;
                        i128 = i113;
                        long j20222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j20222222;
                    } else {
                        i16 = i129;
                        i79 = i130;
                        interfaceC22410Arr8 = interfaceC22410Arr22;
                        i80 = i144;
                        i19 = i126;
                        i83 = i139;
                        i81 = i127;
                        long j252 = j12;
                        i4 = i143;
                        i5 = i145;
                        j = j13;
                        j2 = j252;
                        int m698172 = (C2105.m6981("ۜᩴ") + i122) * (-93);
                        int i1612 = i83;
                        i82 = ((m698172 ^ i123) * 28885) ^ 1784404255;
                        i130 = i79;
                        i125 = m698172 ^ (-594393368);
                        i127 = i81;
                        i139 = i1612;
                        i144 = i80;
                        i124 = i82;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        j4 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j4;
                    }
                case -1215048604:
                case -765408914:
                    i43 = i129;
                    i44 = i130;
                    i45 = i136;
                    interfaceC22410Arr15 = interfaceC22410Arr25;
                    interfaceC22410Arr16 = interfaceC22410Arr22;
                    i46 = i126;
                    jArr6 = jArr9;
                    i54 = i135;
                    i49 = i139;
                    i50 = i127;
                    interfaceC22410Arr17 = interfaceC22410Arr27;
                    i51 = i128;
                    long j33 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j33;
                    interfaceC22410Arr23[i146] = interfaceC224102;
                    i133 = i146 + 1;
                    i47 = i134;
                    interfaceC22410Arr26 = interfaceC22410Arr23;
                    i48 = i54;
                    m25662 = (C2105.m6981("ܶۧ") ^ i122) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i52 = ((m25662 ^ i123) * 22075) ^ 1871994395;
                    i53 = -1614083683;
                    i126 = i46;
                    interfaceC22410Arr22 = interfaceC22410Arr16;
                    i129 = i43;
                    int i1482 = i51;
                    interfaceC22410Arr27 = interfaceC22410Arr17;
                    i127 = i50;
                    i139 = i49;
                    i135 = i48;
                    i134 = i47;
                    i136 = i45;
                    i130 = i44;
                    i125 = m25662 ^ i53;
                    i128 = i1482;
                    jArr7 = jArr6;
                    interfaceC22410Arr25 = interfaceC22410Arr15;
                    i124 = i52;
                    jArr9 = jArr7;
                    long j1522222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j1522222;
                case -1211929376:
                case 1540877966:
                    i = i129;
                    int i163 = i130;
                    int i164 = i136;
                    interfaceC22410Arr = interfaceC22410Arr25;
                    interfaceC22410Arr2 = interfaceC22410Arr22;
                    i2 = i126;
                    jArr = jArr9;
                    int i165 = i134;
                    int i166 = i135;
                    int i167 = i139;
                    int i168 = i127;
                    InterfaceC22410[] interfaceC22410Arr41 = interfaceC22410Arr27;
                    i3 = i128;
                    interfaceC22410Arr3 = interfaceC22410Arr23;
                    interfaceC22410Arr4 = interfaceC22410Arr41;
                    long j34 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j34;
                    InterfaceC22410 interfaceC224105 = interfaceC22410Arr[i164];
                    if (interfaceC224105.mo32106(interfaceC22410)) {
                        int m256613 = C0630.m2566("ۖ᩺") ^ i123;
                        int i169 = ((m256613 ^ i122) * 3947) ^ 882342971;
                        interfaceC224102 = interfaceC224105;
                        i127 = i168;
                        i139 = i167;
                        i135 = i166;
                        i134 = i165;
                        i136 = i164;
                        i130 = i163;
                        i125 = m256613 ^ 2144542683;
                        jArr9 = jArr;
                        interfaceC22410Arr25 = interfaceC22410Arr;
                        i124 = i169;
                        i126 = i2;
                        interfaceC22410Arr22 = interfaceC22410Arr2;
                        i129 = i;
                        InterfaceC22410[] interfaceC22410Arr342 = interfaceC22410Arr4;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr342;
                        long j202222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j202222222;
                    } else {
                        int m256614 = C0630.m2566("֨᩵") ^ i123;
                        i6 = ((m256614 ^ i122) * 26933) ^ (-371131503);
                        interfaceC224102 = interfaceC224105;
                        i127 = i168;
                        i139 = i167;
                        i135 = i166;
                        i134 = i165;
                        i136 = i164;
                        i130 = i163;
                        i125 = m256614 ^ (-145572863);
                        i126 = i2;
                        interfaceC22410Arr22 = interfaceC22410Arr2;
                        i129 = i;
                        jArr4 = jArr;
                        interfaceC22410Arr25 = interfaceC22410Arr;
                        i124 = i6;
                        jArr9 = jArr4;
                        InterfaceC22410[] interfaceC22410Arr36222 = interfaceC22410Arr4;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr36222;
                        long j15222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j15222222;
                    }
                case -1175908299:
                case 149214808:
                    C7811.m20844();
                    if (C4263.f13799 > 0) {
                        i16 = i129;
                        i17 = i130;
                        i18 = i136;
                        interfaceC22410Arr8 = interfaceC22410Arr22;
                        i19 = i126;
                        i20 = i134;
                        i21 = i135;
                        i22 = i139;
                        i23 = i127;
                        interfaceC22410Arr9 = interfaceC22410Arr25;
                        jArr3 = jArr9;
                        InterfaceC22410[] interfaceC22410Arr42 = interfaceC22410Arr27;
                        i3 = i128;
                        interfaceC22410Arr3 = interfaceC22410Arr23;
                        interfaceC22410Arr4 = interfaceC22410Arr42;
                        long j35 = j12;
                        i4 = i143;
                        i5 = i145;
                        j = j13;
                        j2 = j35;
                        m2566 = (i122 - C0630.m2566("ܰۤ")) * (-49);
                        i6 = ((m2566 ^ i123) * 25755) ^ (-552260375);
                        i27 = 538438792;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        jArr4 = jArr3;
                        interfaceC22410Arr25 = interfaceC22410Arr9;
                        i127 = i23;
                        i139 = i22;
                        i135 = i21;
                        i134 = i20;
                        i136 = i18;
                        i130 = i17;
                        i125 = m2566 ^ i27;
                        i124 = i6;
                        jArr9 = jArr4;
                        InterfaceC22410[] interfaceC22410Arr362222 = interfaceC22410Arr4;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr362222;
                        long j152222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j152222222;
                    } else {
                        i16 = i129;
                        i17 = i130;
                        i24 = i139;
                        interfaceC22410Arr8 = interfaceC22410Arr22;
                        i19 = i126;
                        i25 = i127;
                        interfaceC22410Arr10 = interfaceC22410Arr27;
                        i26 = i128;
                        long j36 = j12;
                        i4 = i143;
                        i5 = i145;
                        j = j13;
                        j2 = j36;
                        m6981 = C0630.m2566("᩷ۖ") ^ i123;
                        i62 = ((m6981 ^ i122) * (-29809)) ^ 776114930;
                        i63 = -973869558;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i113 = i26;
                        interfaceC22410Arr27 = interfaceC22410Arr10;
                        i127 = i25;
                        i139 = i24;
                        i130 = i17;
                        i125 = m6981 ^ i63;
                        i124 = i62;
                        i128 = i113;
                        long j2022222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j2022222222;
                    }
                case -1164548339:
                case 1004637945:
                    i16 = i129;
                    i17 = i130;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    i19 = i126;
                    j2 = j9 + 48;
                    i144 = interfaceC22410Arr24.length;
                    i131 = 0;
                    int m256615 = (C0630.m2566("ۨ᩹") + i122) * (-33);
                    i124 = ((m256615 ^ i123) * 30275) ^ (-1364604579);
                    i97 = m256615 ^ (-373714832);
                    i130 = i17;
                    i125 = i97;
                    i126 = i19;
                    interfaceC22410Arr22 = interfaceC22410Arr8;
                    i129 = i16;
                    j4 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j4;
                case -1139170067:
                case 1183631526:
                    C1047.m3599();
                    C11340.m28031();
                    i16 = i129;
                    i17 = i130;
                    i24 = i139;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i19 = i126;
                    i25 = i127;
                    interfaceC22410Arr10 = interfaceC22410Arr27;
                    i26 = i128;
                    long j322 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j322;
                    m6981 = C0630.m2566("֫֡") ^ i123;
                    i62 = ((m6981 ^ i122) * 16239) ^ 1471309623;
                    i63 = -1157268526;
                    i126 = i19;
                    interfaceC22410Arr22 = interfaceC22410Arr8;
                    i129 = i16;
                    i113 = i26;
                    interfaceC22410Arr27 = interfaceC22410Arr10;
                    i127 = i25;
                    i139 = i24;
                    i130 = i17;
                    i125 = m6981 ^ i63;
                    i124 = i62;
                    i128 = i113;
                    long j20222222222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j20222222222;
                case -1136105535:
                case -223989754:
                    i3 = i128;
                    i7 = i129;
                    i8 = i130;
                    interfaceC22410Arr3 = interfaceC22410Arr23;
                    i10 = i136;
                    interfaceC22410Arr6 = interfaceC22410Arr25;
                    interfaceC22410Arr5 = interfaceC22410Arr22;
                    i9 = i126;
                    jArr2 = jArr9;
                    i11 = i134;
                    i12 = i135;
                    i13 = i139;
                    i14 = i127;
                    long j37 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j37;
                    interfaceC22410Arr7 = interfaceC22410Arr5;
                    i118 = 65536;
                    int m256616 = C0630.m2566("᩷֡") ^ i122;
                    interfaceC22410Arr4 = interfaceC22410Arr7;
                    i126 = i9;
                    interfaceC22410Arr22 = interfaceC22410Arr5;
                    i129 = i7;
                    InterfaceC22410[] interfaceC22410Arr43 = interfaceC22410Arr6;
                    i124 = ((m256616 ^ i123) * 21845) ^ (-419324270);
                    i127 = i14;
                    i139 = i13;
                    i135 = i12;
                    i134 = i11;
                    i136 = i10;
                    i130 = i8;
                    i125 = m256616 ^ 367239140;
                    jArr9 = jArr2;
                    interfaceC22410Arr25 = interfaceC22410Arr43;
                    InterfaceC22410[] interfaceC22410Arr3622222 = interfaceC22410Arr4;
                    interfaceC22410Arr23 = interfaceC22410Arr3;
                    i128 = i3;
                    interfaceC22410Arr27 = interfaceC22410Arr3622222;
                    long j1522222222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j1522222222;
                case -1108406048:
                case 1449736454:
                    i74 = i130;
                    long j38 = j13;
                    j2 = j12;
                    i128++;
                    i4 = i143;
                    i5 = i145;
                    i76 = i144;
                    j = j38;
                    i75 = i139;
                    i78 = i127;
                    i73 = i129;
                    interfaceC22410Arr20 = interfaceC22410Arr22;
                    i77 = i126;
                    int m256617 = C0630.m2566("֡֫") ^ i123;
                    i144 = i76;
                    i124 = ((m256617 ^ i122) * (-18187)) ^ (-490769792);
                    i126 = i77;
                    interfaceC22410Arr22 = interfaceC22410Arr20;
                    i129 = i73;
                    i15 = i74;
                    i125 = m256617 ^ (-944867899);
                    i127 = i78;
                    i139 = i75;
                    i130 = i15;
                    long j202222222222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j202222222222;
                case -1009527695:
                case 2072929847:
                    if (c17513.m40925(i130, i120 - i130) <= j12) {
                        m25668 = (C2105.m6981("ۡᩴ") ^ i123) * (-107);
                        i114 = ((m25668 ^ i122) * 14457) ^ (-752149018);
                        i115 = 1263138379;
                        i125 = m25668 ^ i115;
                        i124 = i114;
                    } else {
                        i16 = i129;
                        i17 = i130;
                        i24 = i139;
                        interfaceC22410Arr8 = interfaceC22410Arr22;
                        i19 = i126;
                        i25 = i127;
                        interfaceC22410Arr10 = interfaceC22410Arr27;
                        i26 = i128;
                        long j39 = j12;
                        i4 = i143;
                        i5 = i145;
                        j = j13;
                        j2 = j39;
                        m6981 = C0630.m2566("۫ܰ") ^ i123;
                        i62 = ((m6981 ^ i122) * 29849) ^ 1058249986;
                        i63 = -1535825876;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i113 = i26;
                        interfaceC22410Arr27 = interfaceC22410Arr10;
                        i127 = i25;
                        i139 = i24;
                        i130 = i17;
                        i125 = m6981 ^ i63;
                        i124 = i62;
                        i128 = i113;
                        long j2022222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j2022222222222;
                    }
                case -1001374513:
                case -764764460:
                    interfaceC22410Arr28[i127] = interfaceC224103;
                    i117 = i127 + 1;
                    i17 = i130;
                    j7 = j13;
                    j2 = j12;
                    m69813 = C0630.m2566("᩹᩶") ^ i122;
                    i110 = ((m69813 ^ i123) * 15833) ^ (-1344306391);
                    i111 = -312090754;
                    i109 = i17;
                    i125 = m69813 ^ i111;
                    i124 = i110;
                    j12 = j2;
                    j13 = j7;
                    i130 = i109;
                case -920129903:
                case 486859821:
                    i17 = i130;
                    j7 = j13;
                    j2 = j12;
                    if (i126 < i129) {
                        m69813 = C2105.m6981("ᩴۖ") ^ i122;
                        i110 = ((m69813 ^ i123) * 12647) ^ 77620567;
                        i111 = -534852832;
                        i109 = i17;
                        i125 = m69813 ^ i111;
                        i124 = i110;
                        j12 = j2;
                        j13 = j7;
                        i130 = i109;
                    } else {
                        i117 = i127;
                        m69813 = C0630.m2566("᩹᩶") ^ i122;
                        i110 = ((m69813 ^ i123) * 15833) ^ (-1344306391);
                        i111 = -312090754;
                        i109 = i17;
                        i125 = m69813 ^ i111;
                        i124 = i110;
                        j12 = j2;
                        j13 = j7;
                        i130 = i109;
                    }
                case -892884329:
                case -547626014:
                    i43 = i129;
                    i44 = i130;
                    i45 = i136;
                    interfaceC22410Arr15 = interfaceC22410Arr25;
                    interfaceC22410Arr16 = interfaceC22410Arr22;
                    i46 = i126;
                    jArr6 = jArr9;
                    i47 = i134;
                    i48 = i135;
                    i49 = i139;
                    i50 = i127;
                    interfaceC22410Arr17 = interfaceC22410Arr27;
                    i51 = i128;
                    long j40 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j40;
                    if (interfaceC22410Arr23 == null) {
                        m25662 = C0630.m2566("᩵᩻") ^ i123;
                        i52 = ((m25662 ^ i122) * 6177) ^ (-1933826940);
                        i53 = -1566565722;
                        i126 = i46;
                        interfaceC22410Arr22 = interfaceC22410Arr16;
                        i129 = i43;
                        int i14822 = i51;
                        interfaceC22410Arr27 = interfaceC22410Arr17;
                        i127 = i50;
                        i139 = i49;
                        i135 = i48;
                        i134 = i47;
                        i136 = i45;
                        i130 = i44;
                        i125 = m25662 ^ i53;
                        i128 = i14822;
                        jArr7 = jArr6;
                        interfaceC22410Arr25 = interfaceC22410Arr15;
                        i124 = i52;
                        jArr9 = jArr7;
                        long j15222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j15222222222;
                    }
                    interfaceC22410Arr26 = interfaceC22410Arr23;
                    i133 = i146;
                    m25662 = (C2105.m6981("ܶۧ") ^ i122) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i52 = ((m25662 ^ i123) * 22075) ^ 1871994395;
                    i53 = -1614083683;
                    i126 = i46;
                    interfaceC22410Arr22 = interfaceC22410Arr16;
                    i129 = i43;
                    int i148222 = i51;
                    interfaceC22410Arr27 = interfaceC22410Arr17;
                    i127 = i50;
                    i139 = i49;
                    i135 = i48;
                    i134 = i47;
                    i136 = i45;
                    i130 = i44;
                    i125 = m25662 ^ i53;
                    i128 = i148222;
                    jArr7 = jArr6;
                    interfaceC22410Arr25 = interfaceC22410Arr15;
                    i124 = i52;
                    jArr9 = jArr7;
                    long j152222222222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j152222222222;
                case -860476984:
                case -31346418:
                    i43 = i129;
                    i44 = i130;
                    i45 = i136;
                    interfaceC22410Arr15 = interfaceC22410Arr25;
                    interfaceC22410Arr16 = interfaceC22410Arr22;
                    i46 = i126;
                    jArr6 = jArr9;
                    i47 = i134;
                    i48 = i135;
                    i49 = i139;
                    i50 = i127;
                    interfaceC22410Arr17 = interfaceC22410Arr27;
                    i51 = i128;
                    long j41 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j41;
                    if (interfaceC22410Arr17.length < 256) {
                        m25662 = (C2105.m6981("ۢ᩻") ^ i123) * (-81);
                        i52 = ((m25662 ^ i122) * 22411) ^ (-745451219);
                        i53 = -867935088;
                    } else {
                        m25662 = C0630.m2566("ܶ᩹") ^ i122;
                        i52 = ((m25662 ^ i123) * 7127) ^ 1841708238;
                        i53 = -1252539610;
                    }
                    i126 = i46;
                    interfaceC22410Arr22 = interfaceC22410Arr16;
                    i129 = i43;
                    int i1482222 = i51;
                    interfaceC22410Arr27 = interfaceC22410Arr17;
                    i127 = i50;
                    i139 = i49;
                    i135 = i48;
                    i134 = i47;
                    i136 = i45;
                    i130 = i44;
                    i125 = m25662 ^ i53;
                    i128 = i1482222;
                    jArr7 = jArr6;
                    interfaceC22410Arr25 = interfaceC22410Arr15;
                    i124 = i52;
                    jArr9 = jArr7;
                    long j1522222222222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j1522222222222;
                case -769239580:
                case 1035695928:
                    i16 = i129;
                    i17 = i130;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i90 = i144;
                    i19 = i126;
                    i91 = i127;
                    int i170 = i142;
                    long j42 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j42;
                    if (i132 < i170) {
                        m25665 = C2105.m6981("ۡ۫") ^ i122;
                        i142 = i170;
                        i92 = ((m25665 ^ i123) * 5625) ^ (-771997113);
                        i93 = 544311337;
                        i96 = m25665 ^ i93;
                        i144 = i90;
                        i124 = i92;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i15 = i17;
                        i125 = i96;
                        i127 = i91;
                        i130 = i15;
                        long j20222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j20222222222222;
                    } else {
                        i142 = i170;
                        m25666 = (C0630.m2566("ۗۜ") ^ i123) * (-15);
                        i94 = ((m25666 ^ i122) * 12943) ^ 1340143818;
                        i95 = 1930286219;
                        i97 = m25666 ^ i95;
                        i144 = i90;
                        i124 = i94;
                        i127 = i91;
                        i130 = i17;
                        i125 = i97;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        j4 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j4;
                    }
                case -735233083:
                case -130654209:
                    i73 = i129;
                    i74 = i130;
                    i75 = i139;
                    interfaceC22410Arr20 = interfaceC22410Arr22;
                    i76 = i144;
                    i77 = i126;
                    i78 = i127;
                    long j43 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j43;
                    i128 = 0;
                    i141 = interfaceC22410Arr24.length;
                    int m2566172 = C0630.m2566("֡֫") ^ i123;
                    i144 = i76;
                    i124 = ((m2566172 ^ i122) * (-18187)) ^ (-490769792);
                    i126 = i77;
                    interfaceC22410Arr22 = interfaceC22410Arr20;
                    i129 = i73;
                    i15 = i74;
                    i125 = m2566172 ^ (-944867899);
                    i127 = i78;
                    i139 = i75;
                    i130 = i15;
                    long j202222222222222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j202222222222222;
                case -676692846:
                case 410090679:
                    if (C11340.f33930 < 0) {
                        i16 = i129;
                        i17 = i130;
                        i24 = i139;
                        interfaceC22410Arr8 = interfaceC22410Arr22;
                        i19 = i126;
                        i25 = i127;
                        interfaceC22410Arr10 = interfaceC22410Arr27;
                        i26 = i128;
                        long j3222 = j12;
                        i4 = i143;
                        i5 = i145;
                        j = j13;
                        j2 = j3222;
                        m6981 = C0630.m2566("֫֡") ^ i123;
                        i62 = ((m6981 ^ i122) * 16239) ^ 1471309623;
                        i63 = -1157268526;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i113 = i26;
                        interfaceC22410Arr27 = interfaceC22410Arr10;
                        i127 = i25;
                        i139 = i24;
                        i130 = i17;
                        i125 = m6981 ^ i63;
                        i124 = i62;
                        i128 = i113;
                        long j2022222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j2022222222222222;
                    } else {
                        i16 = i129;
                        i17 = i130;
                        interfaceC22410Arr8 = interfaceC22410Arr22;
                        i90 = i144;
                        i19 = i126;
                        i91 = i127;
                        long j232 = j12;
                        i4 = i143;
                        i5 = i145;
                        j = j13;
                        j2 = j232;
                        m25666 = (C0630.m2566("ۙۚ") + i122) * (-115);
                        i94 = ((m25666 ^ i123) * (-30677)) ^ 1263380220;
                        i95 = 1431850307;
                        i97 = m25666 ^ i95;
                        i144 = i90;
                        i124 = i94;
                        i127 = i91;
                        i130 = i17;
                        i125 = i97;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        j4 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j4;
                    }
                case -649300765:
                case -593337142:
                    i102 = i130;
                    j5 = j13;
                    i103 = i144;
                    j6 = j12;
                    i104 = i143;
                    i105 = i145;
                    interfaceC224103.mo32101(i104, i105, jArr9);
                    i106 = 0;
                    i129 = i119;
                    int m698152 = C2105.m6981("ۨۗ") ^ i123;
                    int i1532 = i106;
                    int i1542 = ((m698152 ^ i122) * (-6955)) ^ 226774153;
                    int i1552 = m698152 ^ 2083744086;
                    i144 = i103;
                    i124 = i1542;
                    i126 = i1532;
                    i145 = i105;
                    i143 = i104;
                    j12 = j6;
                    j13 = j5;
                    i130 = i102;
                    i125 = i1552;
                case -618025683:
                case 754874792:
                    i = i129;
                    i28 = i130;
                    i58 = i135;
                    i29 = i136;
                    interfaceC22410Arr = interfaceC22410Arr25;
                    i30 = i139;
                    interfaceC22410Arr18 = interfaceC22410Arr22;
                    i2 = i126;
                    i31 = i127;
                    jArr = jArr9;
                    InterfaceC22410[] interfaceC22410Arr44 = interfaceC22410Arr27;
                    i3 = i128;
                    interfaceC22410Arr3 = interfaceC22410Arr23;
                    interfaceC22410Arr4 = interfaceC22410Arr44;
                    i5 = i145;
                    j = j13;
                    j2 = j12;
                    int length2 = interfaceC22410Arr18.length;
                    i138 = 65536;
                    i61 = this.f53488;
                    if (length2 >= 256) {
                        int m256618 = C0630.m2566("֨ᩳ") ^ i123;
                        int i171 = ((m256618 ^ i122) * 7473) ^ 1988780796;
                        i136 = i29;
                        i130 = i28;
                        i125 = m256618 ^ 930243580;
                        i126 = i2;
                        interfaceC22410Arr22 = interfaceC22410Arr18;
                        i129 = i;
                        i143 = i61;
                        i145 = i5;
                        i127 = i31;
                        j12 = j2;
                        i139 = i30;
                        j13 = j;
                        i135 = i58;
                        i134 = 2147418111;
                        interfaceC22410Arr25 = interfaceC22410Arr;
                        i124 = i171;
                        jArr9 = jArr;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr4;
                    } else {
                        i32 = 2147418111;
                        int m2566102 = C0630.m2566("۬᩷") ^ i122;
                        int i1502 = ((m2566102 ^ i123) * 10859) ^ 1460462032;
                        int i1512 = i28;
                        i125 = m2566102 ^ 1696471788;
                        i126 = i2;
                        interfaceC22410Arr22 = interfaceC22410Arr18;
                        i129 = i;
                        long j172 = j;
                        i143 = i61;
                        i145 = i5;
                        i127 = i31;
                        j12 = j2;
                        i139 = i30;
                        j13 = j172;
                        i135 = i58;
                        i134 = i32;
                        i136 = i29;
                        i130 = i1512;
                        long[] jArr102 = jArr;
                        interfaceC22410Arr25 = interfaceC22410Arr;
                        i124 = i1502;
                        jArr9 = jArr102;
                        InterfaceC22410[] interfaceC22410Arr312 = interfaceC22410Arr4;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr312;
                    }
                case -525800394:
                case 449125959:
                    if (C0798.m2998() == 0) {
                        i16 = i129;
                        i17 = i130;
                        i24 = i139;
                        interfaceC22410Arr8 = interfaceC22410Arr22;
                        i19 = i126;
                        i25 = i127;
                        interfaceC22410Arr10 = interfaceC22410Arr27;
                        i26 = i128;
                        long j32222 = j12;
                        i4 = i143;
                        i5 = i145;
                        j = j13;
                        j2 = j32222;
                        m6981 = C0630.m2566("֫֡") ^ i123;
                        i62 = ((m6981 ^ i122) * 16239) ^ 1471309623;
                        i63 = -1157268526;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i113 = i26;
                        interfaceC22410Arr27 = interfaceC22410Arr10;
                        i127 = i25;
                        i139 = i24;
                        i130 = i17;
                        i125 = m6981 ^ i63;
                        i124 = i62;
                        i128 = i113;
                        long j20222222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j20222222222222222;
                    } else {
                        m25668 = (C2105.m6981("ۙۧ") ^ i123) * 27;
                        i114 = ((m25668 ^ i122) * 7919) ^ (-1680608994);
                        i115 = -2010476399;
                        i125 = m25668 ^ i115;
                        i124 = i114;
                    }
                case -417362927:
                case 1990114606:
                    i34 = i129;
                    i35 = i130;
                    i36 = i134;
                    i37 = i135;
                    interfaceC22410Arr11 = interfaceC22410Arr25;
                    interfaceC22410Arr12 = interfaceC22410Arr27;
                    i38 = i139;
                    interfaceC22410Arr13 = interfaceC22410Arr22;
                    i39 = i126;
                    i40 = i127;
                    i41 = i128;
                    jArr5 = jArr9;
                    long j44 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j44;
                    interfaceC22410Arr14 = null;
                    i42 = 0;
                    i146 = 0;
                    int m2566122 = (i122 - C0630.m2566("۬᩵")) * 109;
                    i126 = i39;
                    interfaceC22410Arr22 = interfaceC22410Arr13;
                    i129 = i34;
                    InterfaceC22410[] interfaceC22410Arr392 = interfaceC22410Arr12;
                    interfaceC22410Arr23 = interfaceC22410Arr14;
                    i127 = i40;
                    i139 = i38;
                    i135 = i37;
                    i134 = i36;
                    i136 = i42;
                    i128 = i41;
                    interfaceC22410Arr27 = interfaceC22410Arr392;
                    jArr7 = jArr5;
                    interfaceC22410Arr25 = interfaceC22410Arr11;
                    i124 = ((m2566122 ^ i123) * 4311) ^ 1100663103;
                    i130 = i35;
                    i125 = m2566122 ^ (-999481490);
                    jArr9 = jArr7;
                    long j15222222222222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j15222222222222;
                case -409748186:
                case 1812051203:
                    i16 = i129;
                    i17 = i130;
                    i24 = i139;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i19 = i126;
                    i25 = i127;
                    interfaceC22410Arr10 = interfaceC22410Arr27;
                    i26 = i128;
                    long j45 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j45;
                    objArr = Arrays.copyOf(interfaceC22410Arr10, interfaceC22410Arr10.length + 1);
                    if (!C2126.m7040()) {
                        m6981 = C2105.m6981("ܽܺ") ^ i123;
                        i62 = ((m6981 ^ i122) * (-27023)) ^ (-1651802906);
                        i63 = 1603935964;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i113 = i26;
                        interfaceC22410Arr27 = interfaceC22410Arr10;
                        i127 = i25;
                        i139 = i24;
                        i130 = i17;
                        i125 = m6981 ^ i63;
                        i124 = i62;
                        i128 = i113;
                        long j202222222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j202222222222222222;
                    }
                    m6981 = C0630.m2566("֫֡") ^ i123;
                    i62 = ((m6981 ^ i122) * 16239) ^ 1471309623;
                    i63 = -1157268526;
                    i126 = i19;
                    interfaceC22410Arr22 = interfaceC22410Arr8;
                    i129 = i16;
                    i113 = i26;
                    interfaceC22410Arr27 = interfaceC22410Arr10;
                    i127 = i25;
                    i139 = i24;
                    i130 = i17;
                    i125 = m6981 ^ i63;
                    i124 = i62;
                    i128 = i113;
                    long j2022222222222222222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j2022222222222222222;
                case -400437051:
                case 1636627609:
                    i8 = i130;
                    long j46 = j13;
                    j2 = j12;
                    i3 = i128;
                    interfaceC22410Arr3 = interfaceC22410Arr23;
                    i118 = i116;
                    i4 = i143;
                    i5 = i145;
                    j = j46;
                    i10 = i136;
                    i7 = i129;
                    i11 = i134;
                    i12 = i135;
                    i13 = i139;
                    interfaceC22410Arr5 = interfaceC22410Arr22;
                    i9 = i126;
                    i14 = i127;
                    interfaceC22410Arr7 = (InterfaceC22410[]) Arrays.copyOf(interfaceC22410Arr28, i127);
                    interfaceC22410Arr6 = interfaceC22410Arr25;
                    jArr2 = jArr9;
                    int m2566162 = C0630.m2566("᩷֡") ^ i122;
                    interfaceC22410Arr4 = interfaceC22410Arr7;
                    i126 = i9;
                    interfaceC22410Arr22 = interfaceC22410Arr5;
                    i129 = i7;
                    InterfaceC22410[] interfaceC22410Arr432 = interfaceC22410Arr6;
                    i124 = ((m2566162 ^ i123) * 21845) ^ (-419324270);
                    i127 = i14;
                    i139 = i13;
                    i135 = i12;
                    i134 = i11;
                    i136 = i10;
                    i130 = i8;
                    i125 = m2566162 ^ 367239140;
                    jArr9 = jArr2;
                    interfaceC22410Arr25 = interfaceC22410Arr432;
                    InterfaceC22410[] interfaceC22410Arr36222222 = interfaceC22410Arr4;
                    interfaceC22410Arr23 = interfaceC22410Arr3;
                    i128 = i3;
                    interfaceC22410Arr27 = interfaceC22410Arr36222222;
                    long j152222222222222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j152222222222222;
                case -387076794:
                case 639047582:
                    i16 = i129;
                    i17 = i130;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i55 = i144;
                    i19 = i126;
                    long j47 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j47;
                    if (interfaceC22410Arr24[i128] instanceof C13237) {
                        m25663 = (i123 - C0630.m2566("᩵۫")) * 17;
                        i56 = ((m25663 ^ i122) * (-32547)) ^ (-108379230);
                        i57 = -1144245806;
                        i97 = m25663 ^ i57;
                        i144 = i55;
                        i124 = i56;
                        i130 = i17;
                        i125 = i97;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        j4 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j4;
                    } else {
                        i144 = i55;
                        i24 = i139;
                        i25 = i127;
                        interfaceC22410Arr10 = interfaceC22410Arr27;
                        i26 = i128;
                        m6981 = C0630.m2566("۫ܰ") ^ i123;
                        i62 = ((m6981 ^ i122) * 29849) ^ 1058249986;
                        i63 = -1535825876;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i113 = i26;
                        interfaceC22410Arr27 = interfaceC22410Arr10;
                        i127 = i25;
                        i139 = i24;
                        i130 = i17;
                        i125 = m6981 ^ i63;
                        i124 = i62;
                        i128 = i113;
                        long j20222222222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j20222222222222222222;
                    }
                case -364253405:
                case 1473722871:
                    i65 = i129;
                    i66 = i130;
                    i67 = i139;
                    interfaceC22410Arr19 = interfaceC22410Arr22;
                    i68 = i126;
                    i69 = i127;
                    long j48 = j12;
                    i70 = i143;
                    j3 = j13;
                    j2 = j48;
                    i71 = Integer.MAX_VALUE;
                    int m256619 = (C0630.m2566("᩹ᩳ") + i123) * q.h;
                    i72 = ((m256619 ^ i122) * 16441) ^ (-440110686);
                    i126 = i68;
                    interfaceC22410Arr22 = interfaceC22410Arr19;
                    i129 = i65;
                    j4 = j3;
                    i145 = i71;
                    i143 = i70;
                    i127 = i69;
                    i139 = i67;
                    i130 = i66;
                    i125 = m256619 ^ 483060505;
                    i124 = i72;
                    j12 = j2;
                    j13 = j4;
                case -359751063:
                case 371149932:
                    InterfaceC22410[] interfaceC22410Arr45 = (InterfaceC22410[]) objArr;
                    interfaceC22410Arr45[interfaceC22410Arr27.length] = interfaceC22410;
                    return m40905(i143, interfaceC22410Arr45);
                case -250904718:
                case -100489604:
                    i84 = i129;
                    i85 = i130;
                    interfaceC22410Arr21 = interfaceC22410Arr22;
                    i86 = i144;
                    i87 = i126;
                    i88 = i140;
                    long j49 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j49;
                    i89 = i139;
                    jArr9 = new long[i89];
                    i132 = 0;
                    i119 = i89;
                    i142 = interfaceC22410Arr21.length;
                    interfaceC22410Arr28 = new InterfaceC22410[i88];
                    i127 = i135;
                    int m69819 = C2105.m6981("ܶ᩺") ^ i122;
                    i140 = i88;
                    int i172 = ((m69819 ^ i123) * (-10411)) ^ (-1218479986);
                    int i173 = m69819 ^ (-454229734);
                    i144 = i86;
                    i124 = i172;
                    i126 = i87;
                    interfaceC22410Arr22 = interfaceC22410Arr21;
                    i129 = i84;
                    i139 = i89;
                    i130 = i85;
                    i125 = i173;
                    long j202222222222222222222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j202222222222222222222;
                case -39781024:
                case 1109109031:
                    i = i129;
                    i28 = i130;
                    i29 = i136;
                    interfaceC22410Arr = interfaceC22410Arr25;
                    i30 = i139;
                    InterfaceC22410[] interfaceC22410Arr46 = interfaceC22410Arr22;
                    i2 = i126;
                    i31 = i127;
                    jArr = jArr9;
                    i32 = i134;
                    InterfaceC22410[] interfaceC22410Arr47 = interfaceC22410Arr27;
                    i3 = i128;
                    interfaceC22410Arr3 = interfaceC22410Arr23;
                    interfaceC22410Arr4 = interfaceC22410Arr47;
                    long j50 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j50;
                    if (interfaceC22410Arr.length == 0) {
                        i33 = 0;
                        interfaceC22410Arr18 = interfaceC22410Arr;
                        i58 = i33;
                        m25664 = C0630.m2566("ᩳ᩻") ^ i123;
                        i59 = ((m25664 ^ i122) * 4057) ^ 1817171443;
                        i60 = 1849604205;
                        i126 = i2;
                        interfaceC22410Arr22 = interfaceC22410Arr18;
                        i129 = i;
                        int i152222 = i28;
                        i125 = m25664 ^ i60;
                        i127 = i31;
                        i139 = i30;
                        i135 = i58;
                        i134 = i32;
                        i136 = i29;
                        i130 = i152222;
                        long[] jArr11222 = jArr;
                        interfaceC22410Arr25 = interfaceC22410Arr;
                        i124 = i59;
                        jArr9 = jArr11222;
                        InterfaceC22410[] interfaceC22410Arr32222 = interfaceC22410Arr4;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr32222;
                        long j18222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j18222;
                    } else {
                        int m698110 = (i122 - C2105.m6981("֨ܿ")) * 93;
                        i6 = ((m698110 ^ i123) * 9271) ^ (-648264398);
                        i134 = i32;
                        i126 = i2;
                        interfaceC22410Arr22 = interfaceC22410Arr46;
                        i136 = i29;
                        i129 = i;
                        i130 = i28;
                        i125 = m698110 ^ 321984738;
                        i127 = i31;
                        i139 = i30;
                        i135 = 0;
                        jArr4 = jArr;
                        interfaceC22410Arr25 = interfaceC22410Arr;
                        i124 = i6;
                        jArr9 = jArr4;
                        InterfaceC22410[] interfaceC22410Arr362222222 = interfaceC22410Arr4;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr362222222;
                        long j1522222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j1522222222222222;
                    }
                case -12980105:
                case 875568197:
                    i85 = i130;
                    i132++;
                    i84 = i129;
                    i89 = i139;
                    interfaceC22410Arr21 = interfaceC22410Arr22;
                    i86 = i144;
                    i127 = i117;
                    i119 = 1024;
                    i87 = i126;
                    i88 = i140;
                    long j51 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j51;
                    int m698192 = C2105.m6981("ܶ᩺") ^ i122;
                    i140 = i88;
                    int i1722 = ((m698192 ^ i123) * (-10411)) ^ (-1218479986);
                    int i1732 = m698192 ^ (-454229734);
                    i144 = i86;
                    i124 = i1722;
                    i126 = i87;
                    interfaceC22410Arr22 = interfaceC22410Arr21;
                    i129 = i84;
                    i139 = i89;
                    i130 = i85;
                    i125 = i1732;
                    long j2022222222222222222222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j2022222222222222222222;
                case 149565119:
                case 625715627:
                    long j52 = j13;
                    j2 = j12;
                    int i174 = c17513.f53488;
                    if (i174 > 2147418111) {
                        m69814 = (C0630.m2566("ܶ᩶") + i123) * (-117);
                        i72 = ((m69814 ^ i122) * (-28213)) ^ 1352874385;
                        i112 = 1249376049;
                    } else {
                        m69814 = C2105.m6981("᩶֨") ^ i122;
                        i72 = ((m69814 ^ i123) * 16281) ^ (-1440915034);
                        i112 = -793638082;
                    }
                    i125 = m69814 ^ i112;
                    j4 = j52;
                    i130 = i174;
                    i124 = i72;
                    j12 = j2;
                    j13 = j4;
                case 155621040:
                case 1894026781:
                    C0422.m1963();
                    if (C1773.m5908() <= 0) {
                        i16 = i129;
                        i17 = i130;
                        i24 = i139;
                        interfaceC22410Arr8 = interfaceC22410Arr22;
                        i19 = i126;
                        i25 = i127;
                        interfaceC22410Arr10 = interfaceC22410Arr27;
                        i26 = i128;
                        long j322222 = j12;
                        i4 = i143;
                        i5 = i145;
                        j = j13;
                        j2 = j322222;
                        m6981 = C0630.m2566("֫֡") ^ i123;
                        i62 = ((m6981 ^ i122) * 16239) ^ 1471309623;
                        i63 = -1157268526;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i113 = i26;
                        interfaceC22410Arr27 = interfaceC22410Arr10;
                        i127 = i25;
                        i139 = i24;
                        i130 = i17;
                        i125 = m6981 ^ i63;
                        i124 = i62;
                        i128 = i113;
                        long j20222222222222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j20222222222222222222222;
                    } else {
                        i16 = i129;
                        i17 = i130;
                        i18 = i136;
                        interfaceC22410Arr8 = interfaceC22410Arr22;
                        i19 = i126;
                        i20 = i134;
                        i21 = i135;
                        i22 = i139;
                        i23 = i127;
                        interfaceC22410Arr9 = interfaceC22410Arr25;
                        jArr3 = jArr9;
                        InterfaceC22410[] interfaceC22410Arr422 = interfaceC22410Arr27;
                        i3 = i128;
                        interfaceC22410Arr3 = interfaceC22410Arr23;
                        interfaceC22410Arr4 = interfaceC22410Arr422;
                        long j352 = j12;
                        i4 = i143;
                        i5 = i145;
                        j = j13;
                        j2 = j352;
                        m2566 = (i122 - C0630.m2566("ܰۤ")) * (-49);
                        i6 = ((m2566 ^ i123) * 25755) ^ (-552260375);
                        i27 = 538438792;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        jArr4 = jArr3;
                        interfaceC22410Arr25 = interfaceC22410Arr9;
                        i127 = i23;
                        i139 = i22;
                        i135 = i21;
                        i134 = i20;
                        i136 = i18;
                        i130 = i17;
                        i125 = m2566 ^ i27;
                        i124 = i6;
                        jArr9 = jArr4;
                        InterfaceC22410[] interfaceC22410Arr3622222222 = interfaceC22410Arr4;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr3622222222;
                        long j15222222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j15222222222222222;
                    }
                case 166182634:
                case 1322059728:
                    i120 = i118 + i130;
                    m25668 = (C0630.m2566("ܶܳ") + i122) * (-93);
                    i114 = ((m25668 ^ i123) * (-14819)) ^ 1738334843;
                    i115 = 1890919870;
                    i125 = m25668 ^ i115;
                    i124 = i114;
                case 236033452:
                case 526368435:
                    C3432.m10477();
                    return null;
                case 281129078:
                case 555978985:
                    i7 = i129;
                    i8 = i130;
                    int i175 = i144;
                    long j53 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j53;
                    i116 = 65536;
                    interfaceC22410Arr5 = interfaceC22410Arr22;
                    if (i127 == interfaceC22410Arr5.length) {
                        i9 = i126;
                        i144 = i175;
                        i3 = i128;
                        interfaceC22410Arr3 = interfaceC22410Arr23;
                        i10 = i136;
                        interfaceC22410Arr6 = interfaceC22410Arr25;
                        i118 = 65536;
                        jArr2 = jArr9;
                        i11 = i134;
                        i12 = i135;
                        i13 = i139;
                        i14 = i127;
                        interfaceC22410Arr7 = interfaceC22410Arr5;
                        int m25661622 = C0630.m2566("᩷֡") ^ i122;
                        interfaceC22410Arr4 = interfaceC22410Arr7;
                        i126 = i9;
                        interfaceC22410Arr22 = interfaceC22410Arr5;
                        i129 = i7;
                        InterfaceC22410[] interfaceC22410Arr4322 = interfaceC22410Arr6;
                        i124 = ((m25661622 ^ i123) * 21845) ^ (-419324270);
                        i127 = i14;
                        i139 = i13;
                        i135 = i12;
                        i134 = i11;
                        i136 = i10;
                        i130 = i8;
                        i125 = m25661622 ^ 367239140;
                        jArr9 = jArr2;
                        interfaceC22410Arr25 = interfaceC22410Arr4322;
                        InterfaceC22410[] interfaceC22410Arr36222222222 = interfaceC22410Arr4;
                        interfaceC22410Arr23 = interfaceC22410Arr3;
                        i128 = i3;
                        interfaceC22410Arr27 = interfaceC22410Arr36222222222;
                        long j152222222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j152222222222222222;
                    } else {
                        int m256620 = (C0630.m2566("֨ܽ") + i122) * 69;
                        i144 = i175;
                        i124 = ((m256620 ^ i123) * (-2235)) ^ 2142663959;
                        i126 = i126;
                        interfaceC22410Arr22 = interfaceC22410Arr5;
                        i129 = i7;
                        i15 = i8;
                        i125 = m256620 ^ (-184022786);
                        i130 = i15;
                        long j202222222222222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j202222222222222222222222;
                    }
                case 284949831:
                case 961248740:
                    j10 = jArr9[i126];
                    int i176 = i130;
                    long j54 = ~jArr8[i126];
                    if (C1420.f5096 <= 0) {
                        i17 = i176;
                        j11 = j54;
                        i64 = i137;
                        i24 = i139;
                        i25 = i127;
                        i16 = i129;
                        interfaceC22410Arr10 = interfaceC22410Arr27;
                        interfaceC22410Arr8 = interfaceC22410Arr22;
                        i19 = i126;
                        i26 = i128;
                        long j55 = j12;
                        i4 = i143;
                        i5 = i145;
                        j = j13;
                        j2 = j55;
                        int m698162 = (C2105.m6981("۟ۢ") ^ i122) * 127;
                        i137 = i64;
                        i124 = ((m698162 ^ i123) * (-6671)) ^ (-2095191771);
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i113 = i26;
                        interfaceC22410Arr27 = interfaceC22410Arr10;
                        i127 = i25;
                        i139 = i24;
                        i130 = i17;
                        i125 = m698162 ^ (-1212727239);
                        i128 = i113;
                        long j2022222222222222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j2022222222222222222222222;
                    } else {
                        int m256621 = (C0630.m2566("֫᩷") ^ i123) * 11;
                        i124 = ((m256621 ^ i122) * 30021) ^ (-2100485669);
                        i109 = i176;
                        i125 = m256621 ^ (-1584562174);
                        j11 = j54;
                        i130 = i109;
                    }
                case 315277203:
                case 454129020:
                    return c17513;
                case 452978048:
                case 1782166825:
                    i17 = i130;
                    long j56 = j13;
                    i131++;
                    j2 = m40902(j12, j56);
                    i4 = i143;
                    i5 = i145;
                    j = j56;
                    i16 = i129;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i19 = i126;
                    int m2566152 = (C0630.m2566("ۨ᩹") + i122) * (-33);
                    i124 = ((m2566152 ^ i123) * 30275) ^ (-1364604579);
                    i97 = m2566152 ^ (-373714832);
                    i130 = i17;
                    i125 = i97;
                    i126 = i19;
                    interfaceC22410Arr22 = interfaceC22410Arr8;
                    i129 = i16;
                    j4 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j4;
                case 592397295:
                case 1293816887:
                    i = i129;
                    i28 = i130;
                    i29 = i136;
                    interfaceC22410Arr = interfaceC22410Arr25;
                    interfaceC22410Arr18 = interfaceC22410Arr22;
                    i2 = i126;
                    jArr = jArr9;
                    i32 = i134;
                    i58 = i135;
                    i30 = i139;
                    i31 = i127;
                    InterfaceC22410[] interfaceC22410Arr48 = interfaceC22410Arr27;
                    i3 = i128;
                    interfaceC22410Arr3 = interfaceC22410Arr23;
                    interfaceC22410Arr4 = interfaceC22410Arr48;
                    long j57 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j57;
                    if (i29 < interfaceC22410Arr.length) {
                        m25664 = C0630.m2566("۬֡") ^ i122;
                        i59 = ((m25664 ^ i123) * 8059) ^ (-285013961);
                        i60 = 1855274227;
                    } else {
                        m25664 = C0630.m2566("ܰ᩻") ^ i123;
                        i59 = ((m25664 ^ i122) * (-24787)) ^ (-900765154);
                        i60 = 30873517;
                    }
                    i126 = i2;
                    interfaceC22410Arr22 = interfaceC22410Arr18;
                    i129 = i;
                    int i1522222 = i28;
                    i125 = m25664 ^ i60;
                    i127 = i31;
                    i139 = i30;
                    i135 = i58;
                    i134 = i32;
                    i136 = i29;
                    i130 = i1522222;
                    long[] jArr112222 = jArr;
                    interfaceC22410Arr25 = interfaceC22410Arr;
                    i124 = i59;
                    jArr9 = jArr112222;
                    InterfaceC22410[] interfaceC22410Arr322222 = interfaceC22410Arr4;
                    interfaceC22410Arr23 = interfaceC22410Arr3;
                    i128 = i3;
                    interfaceC22410Arr27 = interfaceC22410Arr322222;
                    long j182222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j182222;
                case 908745042:
                case 2000151433:
                    i120 = Integer.MAX_VALUE;
                    m25668 = (C0630.m2566("ܶܳ") + i122) * (-93);
                    i114 = ((m25668 ^ i123) * (-14819)) ^ 1738334843;
                    i115 = 1890919870;
                    i125 = m25668 ^ i115;
                    i124 = i114;
                case 960740907:
                case 2070075017:
                    i65 = i129;
                    i66 = i130;
                    i67 = i139;
                    interfaceC22410Arr19 = interfaceC22410Arr22;
                    i68 = i126;
                    i69 = i127;
                    long j58 = j12;
                    i70 = i143;
                    j3 = j13;
                    j2 = j58;
                    i71 = i70 + i138;
                    int m2566192 = (C0630.m2566("᩹ᩳ") + i123) * q.h;
                    i72 = ((m2566192 ^ i122) * 16441) ^ (-440110686);
                    i126 = i68;
                    interfaceC22410Arr22 = interfaceC22410Arr19;
                    i129 = i65;
                    j4 = j3;
                    i145 = i71;
                    i143 = i70;
                    i127 = i69;
                    i139 = i67;
                    i130 = i66;
                    i125 = m2566192 ^ 483060505;
                    i124 = i72;
                    j12 = j2;
                    j13 = j4;
                case 989756743:
                case 1718598446:
                    if ((j10 & j11) != 0) {
                        m25668 = (C2105.m6981("᩺ۙ") + i122) * (-87);
                        i114 = ((m25668 ^ i123) * (-7477)) ^ (-1407207860);
                        i115 = -266894631;
                    } else {
                        m25668 = (C0630.m2566("۬ܿ") ^ i123) * (-111);
                        i114 = ((m25668 ^ i122) * 23313) ^ 1585686310;
                        i115 = -111523481;
                    }
                    i125 = m25668 ^ i115;
                    i124 = i114;
                case 999731473:
                case 2016863023:
                    i16 = i129;
                    i17 = i130;
                    i24 = i139;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i19 = i126;
                    i25 = i127;
                    interfaceC22410Arr10 = interfaceC22410Arr27;
                    i26 = i128;
                    long j59 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j59;
                    i137 = interfaceC22410Arr10.length + 1;
                    if (AbstractC2021.f6743 > 0) {
                        m6981 = C2105.m6981("᩷֨") ^ i122;
                        i62 = ((m6981 ^ i123) * (-14647)) ^ 324436248;
                        i63 = 1375295157;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i113 = i26;
                        interfaceC22410Arr27 = interfaceC22410Arr10;
                        i127 = i25;
                        i139 = i24;
                        i130 = i17;
                        i125 = m6981 ^ i63;
                        i124 = i62;
                        i128 = i113;
                        long j20222222222222222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j20222222222222222222222222;
                    }
                    m6981 = C0630.m2566("᩷ۖ") ^ i123;
                    i62 = ((m6981 ^ i122) * (-29809)) ^ 776114930;
                    i63 = -973869558;
                    i126 = i19;
                    interfaceC22410Arr22 = interfaceC22410Arr8;
                    i129 = i16;
                    i113 = i26;
                    interfaceC22410Arr27 = interfaceC22410Arr10;
                    i127 = i25;
                    i139 = i24;
                    i130 = i17;
                    i125 = m6981 ^ i63;
                    i124 = i62;
                    i128 = i113;
                    long j202222222222222222222222222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j202222222222222222222222222;
                case 1027964093:
                case 1883556131:
                    i16 = i129;
                    i79 = i130;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i80 = i144;
                    i19 = i126;
                    int i177 = i127;
                    long j60 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j60;
                    long[] jArr12 = new long[1024];
                    i81 = i177;
                    interfaceC22410.mo32101(i4, i5, jArr12);
                    int length3 = interfaceC22410Arr8.length;
                    if (C1047.f3863 >= 0) {
                        i140 = length3;
                        jArr8 = jArr12;
                        i83 = 1024;
                        int m6981722 = (C2105.m6981("ۜᩴ") + i122) * (-93);
                        int i16122 = i83;
                        i82 = ((m6981722 ^ i123) * 28885) ^ 1784404255;
                        i130 = i79;
                        i125 = m6981722 ^ (-594393368);
                        i127 = i81;
                        i139 = i16122;
                        i144 = i80;
                        i124 = i82;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        j4 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j4;
                    } else {
                        int m256622 = (C0630.m2566("ܿۜ") ^ i122) * 99;
                        i82 = ((m256622 ^ i123) * (-21967)) ^ (-2020698937);
                        jArr8 = jArr12;
                        i127 = i81;
                        i130 = i79;
                        i139 = 1024;
                        i125 = m256622 ^ (-43975869);
                        i140 = length3;
                        i144 = i80;
                        i124 = i82;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        j4 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j4;
                    }
                case 1334109394:
                case 1539855248:
                    i43 = i129;
                    i44 = i130;
                    i45 = i136;
                    interfaceC22410Arr15 = interfaceC22410Arr25;
                    interfaceC22410Arr16 = interfaceC22410Arr22;
                    i46 = i126;
                    jArr6 = jArr9;
                    int i178 = i135;
                    i49 = i139;
                    i50 = i127;
                    interfaceC22410Arr17 = interfaceC22410Arr27;
                    i51 = i128;
                    int i179 = i134;
                    long j61 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j61;
                    if (i4 > i179) {
                        int m256623 = C0630.m2566("۠ܿ") ^ i122;
                        i126 = i46;
                        interfaceC22410Arr22 = interfaceC22410Arr16;
                        i129 = i43;
                        interfaceC22410Arr27 = interfaceC22410Arr17;
                        i127 = i50;
                        i139 = i49;
                        i135 = i178;
                        jArr9 = jArr6;
                        interfaceC22410Arr25 = interfaceC22410Arr15;
                        i124 = ((m256623 ^ i123) * 29229) ^ (-851912215);
                        i128 = i51;
                        i136 = i45;
                        i130 = i44;
                        i125 = m256623 ^ 857718618;
                        i134 = i179;
                        long j1522222222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j1522222222222222222;
                    } else {
                        i47 = i179;
                        m25662 = (i122 - C2105.m6981("ۧۘ")) * (-89);
                        i48 = i178;
                        i52 = ((m25662 ^ i123) * (-8051)) ^ (-17069379);
                        i53 = 173334010;
                        i126 = i46;
                        interfaceC22410Arr22 = interfaceC22410Arr16;
                        i129 = i43;
                        int i14822222 = i51;
                        interfaceC22410Arr27 = interfaceC22410Arr17;
                        i127 = i50;
                        i139 = i49;
                        i135 = i48;
                        i134 = i47;
                        i136 = i45;
                        i130 = i44;
                        i125 = m25662 ^ i53;
                        i128 = i14822222;
                        jArr7 = jArr6;
                        interfaceC22410Arr25 = interfaceC22410Arr15;
                        i124 = i52;
                        jArr9 = jArr7;
                        long j15222222222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j15222222222222222222;
                    }
                case 1924831943:
                case 2141399347:
                    i16 = i129;
                    i17 = i130;
                    interfaceC22410Arr8 = interfaceC22410Arr22;
                    i90 = i144;
                    i19 = i126;
                    i91 = i127;
                    int i180 = i141;
                    long j62 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j62;
                    if (i128 < i180) {
                        m25665 = (i122 - C0630.m2566("۬۬")) * (-79);
                        i141 = i180;
                        i92 = ((m25665 ^ i123) * 6377) ^ 545778502;
                        i93 = 107132800;
                        i96 = m25665 ^ i93;
                        i144 = i90;
                        i124 = i92;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        i15 = i17;
                        i125 = i96;
                        i127 = i91;
                        i130 = i15;
                        long j2022222222222222222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j2022222222222222222222222222;
                    } else {
                        i141 = i180;
                        m25666 = C0630.m2566("ۘܶ") ^ i123;
                        i94 = ((m25666 ^ i122) * (-12097)) ^ (-2032337923);
                        i95 = -170010689;
                        i97 = m25666 ^ i95;
                        i144 = i90;
                        i124 = i94;
                        i127 = i91;
                        i130 = i17;
                        i125 = i97;
                        i126 = i19;
                        interfaceC22410Arr22 = interfaceC22410Arr8;
                        i129 = i16;
                        j4 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j4;
                    }
                default:
                    i43 = i129;
                    i44 = i130;
                    i45 = i136;
                    interfaceC22410Arr15 = interfaceC22410Arr25;
                    interfaceC22410Arr16 = interfaceC22410Arr22;
                    i46 = i126;
                    jArr6 = jArr9;
                    i47 = i134;
                    i48 = i135;
                    i49 = i139;
                    i50 = i127;
                    interfaceC22410Arr17 = interfaceC22410Arr27;
                    i51 = i128;
                    long j63 = j12;
                    i4 = i143;
                    i5 = i145;
                    j = j13;
                    j2 = j63;
                    if (interfaceC22410Arr23 != null) {
                        m25662 = C2105.m6981("ۤ᩵") ^ i122;
                        i52 = ((m25662 ^ i123) * (-23217)) ^ (-2123296613);
                        i53 = 188134745;
                        i126 = i46;
                        interfaceC22410Arr22 = interfaceC22410Arr16;
                        i129 = i43;
                        int i148222222 = i51;
                        interfaceC22410Arr27 = interfaceC22410Arr17;
                        i127 = i50;
                        i139 = i49;
                        i135 = i48;
                        i134 = i47;
                        i136 = i45;
                        i130 = i44;
                        i125 = m25662 ^ i53;
                        i128 = i148222222;
                        jArr7 = jArr6;
                        interfaceC22410Arr25 = interfaceC22410Arr15;
                        i124 = i52;
                        jArr9 = jArr7;
                        long j152222222222222222222 = j;
                        i143 = i4;
                        i145 = i5;
                        j12 = j2;
                        j13 = j152222222222222222222;
                    }
                    interfaceC22410Arr26 = interfaceC22410Arr23;
                    i133 = i146;
                    m25662 = (C2105.m6981("ܶۧ") ^ i122) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i52 = ((m25662 ^ i123) * 22075) ^ 1871994395;
                    i53 = -1614083683;
                    i126 = i46;
                    interfaceC22410Arr22 = interfaceC22410Arr16;
                    i129 = i43;
                    int i1482222222 = i51;
                    interfaceC22410Arr27 = interfaceC22410Arr17;
                    i127 = i50;
                    i139 = i49;
                    i135 = i48;
                    i134 = i47;
                    i136 = i45;
                    i130 = i44;
                    i125 = m25662 ^ i53;
                    i128 = i1482222222;
                    jArr7 = jArr6;
                    interfaceC22410Arr25 = interfaceC22410Arr15;
                    i124 = i52;
                    jArr9 = jArr7;
                    long j1522222222222222222222 = j;
                    i143 = i4;
                    i145 = i5;
                    j12 = j2;
                    j13 = j1522222222222222222222;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m40924(IdentityHashMap identityHashMap) {
        C12532 c12532;
        InterfaceC22410[] interfaceC22410Arr = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        InterfaceC22410 interfaceC22410 = null;
        int i3 = -303572100;
        int i4 = C3683.f11629;
        int i5 = ServiceConnectionC3453.f10921;
        int m6981 = (C2105.m6981("ܶ᩻") + i4) * 77;
        int i6 = ((m6981 ^ i5) * 14853) ^ (-570345425);
        int i7 = 561115005;
        while (true) {
            i3 = ((((i3 ^ i5) * (-30047)) >> 31) & i6) ^ (m6981 ^ i7);
            switch (i3) {
                case -2029684550:
                case 236179747:
                    i = interfaceC22410Arr.length;
                    z = false;
                    i2 = 0;
                    m6981 = (C0630.m2566("᩸ۤ") + i4) * 7;
                    i6 = ((m6981 ^ i5) * (-25265)) ^ 840418033;
                    i7 = -304988541;
                case -1952034154:
                case -547651612:
                    i2++;
                    m6981 = (C0630.m2566("᩸ۤ") + i4) * 7;
                    i6 = ((m6981 ^ i5) * (-25265)) ^ 840418033;
                    i7 = -304988541;
                case -1854649504:
                case -278116484:
                    c12532 = ((C23115) interfaceC22410).f74355;
                    if (identityHashMap.containsKey(c12532)) {
                        m6981 = C0630.m2566("᩹۠") ^ i4;
                        i6 = ((m6981 ^ i5) * (-32581)) ^ 157152272;
                        i7 = -582904253;
                    } else {
                        m6981 = (C0630.m2566("᩶᩵") ^ i4) * 33;
                        i6 = ((m6981 ^ i5) * (-12729)) ^ 83149788;
                        i7 = 246426372;
                    }
                case -1797167732:
                case 1109316588:
                    if (i2 < i) {
                        m6981 = (C2105.m6981("ܶۡ") ^ i5) * (-109);
                        i6 = ((m6981 ^ i4) * 18689) ^ 1820902469;
                        i7 = -954055361;
                    } else {
                        m6981 = C2105.m6981("֨ۨ") ^ i5;
                        i6 = ((m6981 ^ i4) * (-10757)) ^ (-386616175);
                        i7 = 2048358664;
                    }
                case -1763689928:
                case 1849794822:
                    return z;
                case -1585286576:
                case -1171133547:
                    if (C0964.f3626 != 0) {
                        m6981 = C0630.m2566("ۗܿ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-17001)) ^ (-1743584577);
                        i7 = -928942549;
                    } else {
                        m6981 = C0630.m2566("ۘۙ") ^ i4;
                        i6 = ((m6981 ^ i5) * 13341) ^ (-1328129396);
                        i7 = -1731397813;
                    }
                case -1504051299:
                case 570407587:
                    if (C22628.f73083 > 0) {
                        m6981 = (C0630.m2566("ۖ۟") ^ i4) * (-43);
                        i6 = ((m6981 ^ i5) * (-2409)) ^ 1382444223;
                        i7 = -1298897926;
                    } else {
                        m6981 = C0630.m2566("ۗܿ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-17001)) ^ (-1743584577);
                        i7 = -928942549;
                    }
                case -1403950921:
                case -882691782:
                    if (C1916.f6442) {
                        m6981 = C2105.m6981("ܶ᩵") ^ i5;
                        i6 = ((m6981 ^ i4) * (-17223)) ^ (-1867183798);
                        i7 = -1971958005;
                    } else {
                        m6981 = C2105.m6981("ۛᩴ") ^ i5;
                        i6 = ((m6981 ^ i4) * 2993) ^ 953093658;
                        i7 = -855072470;
                    }
                case -1182558269:
                case 1108765934:
                    if (C3746.f11829 <= 0) {
                        m6981 = (C0630.m2566("ۖ۟") ^ i4) * (-43);
                        i6 = ((m6981 ^ i5) * (-2409)) ^ 1382444223;
                        i7 = -1298897926;
                    } else {
                        m6981 = C2105.m6981("ᩴܽ") ^ i5;
                        i6 = ((m6981 ^ i4) * (-9711)) ^ (-1862726447);
                        i7 = 1455760812;
                    }
                case -930420883:
                case 1608127246:
                    C2958.m9034();
                    C3663.m11168();
                    m6981 = (C2105.m6981("ᩴ۠") ^ i5) * (-121);
                    i6 = ((m6981 ^ i4) * (-18525)) ^ (-1165821325);
                    i7 = -344938444;
                case -571565890:
                case -402410345:
                    interfaceC22410 = interfaceC22410Arr[i2];
                    if (interfaceC22410 instanceof C23115) {
                        m6981 = (i5 - C0630.m2566("᩷֨")) * (-71);
                        i6 = ((m6981 ^ i4) * (-8011)) ^ 392174926;
                        i7 = -648789049;
                    } else {
                        m6981 = (C0630.m2566("᩶᩵") ^ i4) * 33;
                        i6 = ((m6981 ^ i5) * (-12729)) ^ 83149788;
                        i7 = 246426372;
                    }
                case -348555408:
                case 1237637528:
                    C0422.m1963();
                    RunnableC1937.m6387();
                    return false;
                case -83026468:
                case 879255080:
                    if (C0237.f1507 == 0) {
                        m6981 = C0630.m2566("ۗܿ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-17001)) ^ (-1743584577);
                        i7 = -928942549;
                    } else {
                        m6981 = C2105.m6981("ۛᩴ") ^ i5;
                        i6 = ((m6981 ^ i4) * 2993) ^ 953093658;
                        i7 = -855072470;
                    }
                case 191351941:
                case 1139012702:
                    if (RunnableC1108.f4040) {
                        m6981 = (C2105.m6981("ۧ֡") + i4) * (-95);
                        i6 = ((m6981 ^ i5) * (-23333)) ^ (-2033883540);
                        i7 = 1324405429;
                    } else {
                        m6981 = C2105.m6981("ۛᩴ") ^ i5;
                        i6 = ((m6981 ^ i4) * 2993) ^ 953093658;
                        i7 = -855072470;
                    }
                case 264067154:
                case 298376211:
                    interfaceC22410Arr = this.f53489;
                    if (C4616.f14690 <= 0) {
                        m6981 = (C0630.m2566("ᩳۤ") ^ i4) * (-53);
                        i6 = ((m6981 ^ i5) * 2125) ^ (-1917363616);
                        i7 = 1411359420;
                    } else {
                        m6981 = (C2105.m6981("᩻᩷") + i5) * (-59);
                        i6 = ((m6981 ^ i4) * (-17233)) ^ (-115164410);
                        i7 = 1812264415;
                    }
                case 552840386:
                case 840923423:
                    if (C2958.m9034() <= 0) {
                        m6981 = (C0630.m2566("ۖ۟") ^ i4) * (-43);
                        i6 = ((m6981 ^ i5) * (-2409)) ^ 1382444223;
                        i7 = -1298897926;
                    } else {
                        m6981 = C2105.m6981("ۙ۬") ^ i5;
                        i6 = ((m6981 ^ i4) * (-727)) ^ (-1156833763);
                        i7 = -1110787405;
                    }
                case 700804137:
                case 1961336775:
                    return true;
                case 1009151118:
                case 2146294162:
                    if (C4263.m12819() < 0) {
                        m6981 = (C2105.m6981("ᩴ۠") ^ i5) * (-121);
                        i6 = ((m6981 ^ i4) * (-18525)) ^ (-1165821325);
                        i7 = -344938444;
                    } else {
                        m6981 = (C0630.m2566("ۖ۟") ^ i4) * (-43);
                        i6 = ((m6981 ^ i5) * (-2409)) ^ 1382444223;
                        i7 = -1298897926;
                    }
                case 1153575196:
                case 1719747460:
                    if (C3911.f12484 >= 0) {
                        m6981 = (C0630.m2566("ᩳۤ") ^ i4) * (-53);
                        i6 = ((m6981 ^ i5) * 2125) ^ (-1917363616);
                        i7 = 1411359420;
                    } else {
                        m6981 = C2105.m6981("ۨ֨") ^ i4;
                        i6 = ((m6981 ^ i5) * (-227)) ^ (-1471267932);
                        i7 = 1292144110;
                    }
                case 1362990320:
                case 2104939059:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = (C0630.m2566("ۖ۟") ^ i4) * (-43);
                        i6 = ((m6981 ^ i5) * (-2409)) ^ 1382444223;
                        i7 = -1298897926;
                    } else {
                        m6981 = C2105.m6981("ܿۚ") ^ i5;
                        i6 = ((m6981 ^ i4) * 3005) ^ (-9408296);
                        i7 = 1323732312;
                    }
                case 1777034119:
                case 1816915367:
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = C0630.m2566("ۗܿ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-17001)) ^ (-1743584577);
                        i7 = -928942549;
                    } else {
                        m6981 = C0630.m2566("ۢᩳ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-21817)) ^ 81929673;
                        i7 = -730561794;
                    }
                default:
                    if (C3683.f11629 >= 0) {
                        m6981 = (C0630.m2566("ᩳۤ") ^ i4) * (-53);
                        i6 = ((m6981 ^ i5) * 2125) ^ (-1917363616);
                        i7 = 1411359420;
                    } else {
                        m6981 = C2105.m6981("ᩳܰ") ^ i4;
                        i6 = ((m6981 ^ i5) * (-32389)) ^ (-502019493);
                        i7 = -1886603;
                    }
            }
        }
    }

    public C17513(int i, InterfaceC22410[] interfaceC22410Arr) {
        int i2 = -2085099879;
        int i3 = C1128.f4106;
        int i4 = C0422.f1886;
        int m2566 = (i3 - C0630.m2566("֫᩵")) * (-89);
        int i5 = ((m2566 ^ i4) * 20709) ^ 837717024;
        int i6 = -1121221918;
        while (true) {
            i2 = ((((i2 ^ i4) * (-18295)) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -2087303814:
                case 601825372:
                    if (C1420.f5096 <= 0) {
                        m2566 = C0630.m2566("֡ۨ") ^ i4;
                        i5 = ((m2566 ^ i3) * 3205) ^ 1568446825;
                        i6 = -1467427682;
                    } else {
                        m2566 = C2105.m6981("ܿ᩶") ^ i4;
                        i5 = ((m2566 ^ i3) * (-14089)) ^ 390227861;
                        i6 = 826609566;
                    }
                case -1780564839:
                case 1479042389:
                    if (C3019.f9544 >= 0) {
                        m2566 = C0630.m2566("֡ۨ") ^ i4;
                        i5 = ((m2566 ^ i3) * 3205) ^ 1568446825;
                        i6 = -1467427682;
                    } else {
                        m2566 = (i3 - C2105.m6981("֡ۗ")) * (-27);
                        i5 = ((m2566 ^ i4) * (-677)) ^ 939394847;
                        i6 = -1716516736;
                    }
                case -1626405671:
                case 562867945:
                    C4075.m12263();
                    if (C0237.f1507 == 0) {
                        m2566 = C0630.m2566("֡ۨ") ^ i4;
                        i5 = ((m2566 ^ i3) * 3205) ^ 1568446825;
                        i6 = -1467427682;
                    } else {
                        m2566 = C2105.m6981("۫֫") ^ i3;
                        i5 = ((m2566 ^ i4) * 23317) ^ (-1052058775);
                        i6 = -569874736;
                    }
                case -1335680264:
                case 610471159:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = C0630.m2566("ܳۘ") ^ i4;
                        i5 = ((m2566 ^ i3) * 10291) ^ 2023499798;
                        i6 = 1858941156;
                    } else {
                        m2566 = (C2105.m6981("ᩴ۫") ^ i3) * (-91);
                        i5 = ((m2566 ^ i4) * 19075) ^ 1969778663;
                        i6 = -197357003;
                    }
                case -1273875206:
                case -1247715857:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = C2105.m6981("۫֫") ^ i3;
                        i5 = ((m2566 ^ i4) * 23317) ^ (-1052058775);
                        i6 = -569874736;
                    } else {
                        m2566 = C2105.m6981("ܳ᩷") ^ i3;
                        i5 = ((m2566 ^ i4) * (-26903)) ^ 2092081145;
                        i6 = -1655029003;
                    }
                case -1217128720:
                case -1201616593:
                    this.f53488 = i;
                    if (C0630.f2410 <= 0) {
                        m2566 = C0630.m2566("ܳۘ") ^ i4;
                        i5 = ((m2566 ^ i3) * 10291) ^ 2023499798;
                        i6 = 1858941156;
                    } else {
                        m2566 = C2105.m6981("ۜ᩸") ^ i4;
                        i5 = ((m2566 ^ i3) * 16279) ^ (-1691880844);
                        i6 = -141214541;
                    }
                case -1189612718:
                case 1982240224:
                    C3663.m11168();
                    throw new RuntimeException();
                case -1161887248:
                case 1426249161:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = C0630.m2566("ܳۘ") ^ i4;
                        i5 = ((m2566 ^ i3) * 10291) ^ 2023499798;
                        i6 = 1858941156;
                    } else {
                        m2566 = (i3 - C2105.m6981("֨ܺ")) * (-37);
                        i5 = ((m2566 ^ i4) * (-3175)) ^ 633502430;
                        i6 = -989780776;
                    }
                case -1031995350:
                case -891258830:
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = C2105.m6981("۫֫") ^ i3;
                        i5 = ((m2566 ^ i4) * 23317) ^ (-1052058775);
                        i6 = -569874736;
                    } else {
                        m2566 = (i4 - C0630.m2566("֡᩷")) * 61;
                        i5 = ((m2566 ^ i3) * 21091) ^ (-1512492624);
                        i6 = 1518225776;
                    }
                case -741755694:
                case -400939830:
                    if (C22628.f73083 <= 0) {
                        m2566 = C0630.m2566("ۛᩴ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-23313)) ^ (-1986721568);
                        i6 = 963052305;
                    } else {
                        m2566 = (C0630.m2566("᩻ܰ") ^ i3) * q.h;
                        i5 = ((m2566 ^ i4) * 27101) ^ (-1230124740);
                        i6 = -934968710;
                    }
                case -695419592:
                case 323237964:
                    C0798.m2998();
                    if (C2167.m7155()) {
                        m2566 = (C2105.m6981("ᩴ۫") ^ i3) * (-91);
                        i5 = ((m2566 ^ i4) * 19075) ^ 1969778663;
                        i6 = -197357003;
                    } else {
                        m2566 = C0630.m2566("֡ۨ") ^ i4;
                        i5 = ((m2566 ^ i3) * 3205) ^ 1568446825;
                        i6 = -1467427682;
                    }
                case -498222957:
                case 1870664935:
                    this.f53489 = interfaceC22410Arr;
                    return;
                case -276918098:
                case 1501472633:
                    if (C3683.f11629 >= 0) {
                        m2566 = C0630.m2566("ܳۘ") ^ i4;
                        i5 = ((m2566 ^ i3) * 10291) ^ 2023499798;
                        i6 = 1858941156;
                    } else {
                        m2566 = (C2105.m6981("ۤᩴ") ^ i3) * 71;
                        i5 = ((m2566 ^ i4) * 31473) ^ (-807564223);
                        i6 = -1633829694;
                    }
                case 64071854:
                case 1506769543:
                    C11340.m28031();
                    C1711.m5736();
                    m2566 = C0630.m2566("ܳۘ") ^ i4;
                    i5 = ((m2566 ^ i3) * 10291) ^ 2023499798;
                    i6 = 1858941156;
                case 699316104:
                case 1463115567:
                    if (C0050.f910 >= 0) {
                        m2566 = C0630.m2566("ܳۘ") ^ i4;
                        i5 = ((m2566 ^ i3) * 10291) ^ 2023499798;
                        i6 = 1858941156;
                    } else {
                        m2566 = C0630.m2566("ۢۙ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-8771)) ^ 264564159;
                        i6 = 1307134719;
                    }
                default:
                    if (C0798.f2919) {
                        m2566 = (C2105.m6981("ᩴ۫") ^ i3) * (-91);
                        i5 = ((m2566 ^ i4) * 19075) ^ 1969778663;
                        i6 = -197357003;
                    } else {
                        m2566 = (i4 - C0630.m2566("᩶᩺")) * (-53);
                        i5 = ((m2566 ^ i3) * (-7955)) ^ 555770835;
                        i6 = 70507405;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17513 m40904(int i) {
        int i2 = -1139257374;
        int i3 = C7811.f24123;
        int i4 = C3019.f9544;
        int m2566 = (C0630.m2566("ܿ۫") + i3) * 21;
        int i5 = ((m2566 ^ i4) * (-2835)) ^ (-1561679656);
        int i6 = 1794963006;
        while (true) {
            i2 = ((((i2 ^ i4) * (-31593)) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -2081249091:
                case -1846848803:
                    if (C2126.f7087) {
                        m2566 = C0630.m2566("ۙᩴ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-18021)) ^ (-46689928);
                        i6 = 983376472;
                    } else {
                        m2566 = C2105.m6981("᩸ܺ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-2549)) ^ (-1274464230);
                        i6 = 562955607;
                    }
                case -1955788380:
                case 924930456:
                    if (C4117.f13076 <= 0) {
                        m2566 = C0630.m2566("ۛۜ") ^ i3;
                        i5 = ((m2566 ^ i4) * 4619) ^ (-1113605625);
                        i6 = 131964625;
                    } else {
                        m2566 = C2105.m6981("᩸ܺ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-2549)) ^ (-1274464230);
                        i6 = 562955607;
                    }
                case -960159880:
                case -869484699:
                    C7106.m19120();
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = C0630.m2566("ۛۜ") ^ i3;
                        i5 = ((m2566 ^ i4) * 4619) ^ (-1113605625);
                        i6 = 131964625;
                    } else {
                        m2566 = (i4 - C2105.m6981("᩷᩻")) * (-33);
                        i5 = ((m2566 ^ i3) * (-10753)) ^ (-810570740);
                        i6 = 406608509;
                    }
                case -231744655:
                case 195879802:
                    if (!C3663.f11553) {
                        if (RunnableC3474.m10630()) {
                            if (C1047.f3863 < 0) {
                                if (RunnableC3474.f10992 > 0) {
                                    if (C0422.f1886 > 0 && C7106.m19120() > 0) {
                                        if (C0714.f2697 < 0) {
                                            if (C0798.m2998() == 0) {
                                                if (ServiceConnectionC3453.f10921 < 0) {
                                                    int i7 = (-65536) & i;
                                                    if (C4263.f13799 > 0) {
                                                        return new C17513(i7, new InterfaceC22410[0]);
                                                    }
                                                    m2566 = C2105.m6981("ۢܺ") ^ i3;
                                                    i5 = ((m2566 ^ i4) * 19481) ^ 685568759;
                                                    i6 = 538659586;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            m2566 = C0630.m2566("ۙᩴ") ^ i3;
                            i5 = ((m2566 ^ i4) * (-18021)) ^ (-46689928);
                            i6 = 983376472;
                        }
                        m2566 = (i4 - C2105.m6981("᩷᩻")) * (-33);
                        i5 = ((m2566 ^ i3) * (-10753)) ^ (-810570740);
                        i6 = 406608509;
                    }
                    m2566 = C0630.m2566("ۛۜ") ^ i3;
                    i5 = ((m2566 ^ i4) * 4619) ^ (-1113605625);
                    i6 = 131964625;
                    break;
                case 408514248:
                case 1185298697:
                    C1005.m3501();
                    C0964.m3413();
                    m2566 = C0630.m2566("ۛۜ") ^ i3;
                    i5 = ((m2566 ^ i4) * 4619) ^ (-1113605625);
                    i6 = 131964625;
                default:
                    C21923.m49329();
                    C1711.m5736();
                    return null;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m40922() {
        InterfaceC22410[] interfaceC22410Arr = null;
        int i = 410621261;
        int i2 = C4075.f12947;
        int i3 = C3911.f12484;
        int m2566 = (i3 - C0630.m2566("ۧܳ")) * (-29);
        int i4 = ((m2566 ^ i2) * (-24883)) ^ (-594847831);
        int i5 = 1289468176;
        while (true) {
            i = ((((i ^ i2) * 3633) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2125949605:
                case 2045339782:
                    C3537.m10746();
                    if (C22628.f73083 > 0) {
                        m2566 = C2105.m6981("۠ۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-9359)) ^ (-423935011);
                        i5 = -380937465;
                    } else {
                        m2566 = (i2 - C0630.m2566("᩹ܿ")) * 79;
                        i4 = ((m2566 ^ i3) * (-24221)) ^ (-356873778);
                        i5 = 505881132;
                    }
                case -2103458508:
                case -296609599:
                    if (C0422.f1886 <= 0) {
                        m2566 = (C0630.m2566("ᩳ۟") + i2) * 91;
                        i4 = ((m2566 ^ i3) * 19707) ^ 1502257172;
                        i5 = 1473835085;
                    } else {
                        m2566 = C2105.m6981("᩶ܰ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-18663)) ^ 285553967;
                        i5 = -1203573070;
                    }
                case -2084138190:
                case -1680849114:
                    if (interfaceC22410Arr.length == 0) {
                        m2566 = (C2105.m6981("ۢۜ") + i2) * (-121);
                        i4 = ((m2566 ^ i3) * 31571) ^ (-2115955210);
                        i5 = 1060677843;
                    } else {
                        m2566 = C0630.m2566("ۢ᩶") ^ i3;
                        i4 = ((m2566 ^ i2) * (-25591)) ^ (-492481332);
                        i5 = -1003759344;
                    }
                case -1803156341:
                case -815064955:
                    interfaceC22410Arr = this.f53489;
                    if (C5695.f17556 >= 0) {
                        m2566 = C2105.m6981("۠ۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-9359)) ^ (-423935011);
                        i5 = -380937465;
                    } else {
                        m2566 = C0630.m2566("۫ۢ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-6705)) ^ (-1144476525);
                        i5 = 2080249468;
                    }
                case -1658983106:
                case 538064171:
                    if (C0714.f2697 >= 0) {
                        m2566 = (C0630.m2566("ۖᩴ") ^ i2) * 101;
                        i4 = ((m2566 ^ i3) * 24957) ^ 766635714;
                        i5 = -1247631528;
                    } else {
                        m2566 = C0630.m2566("ᩳ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * (-22619)) ^ 1055005818;
                        i5 = 1090441720;
                    }
                case -1646009295:
                case 1333509847:
                    if (C1420.f5096 <= 0) {
                        m2566 = (C0630.m2566("ۖᩴ") ^ i2) * 101;
                        i4 = ((m2566 ^ i3) * 24957) ^ 766635714;
                        i5 = -1247631528;
                    } else {
                        m2566 = C0630.m2566("֨᩺") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2917)) ^ (-543093908);
                        i5 = 912976431;
                    }
                case -1625642429:
                case 1468510464:
                    if (C3683.f11629 >= 0) {
                        m2566 = (C0630.m2566("ۖᩴ") ^ i2) * 101;
                        i4 = ((m2566 ^ i3) * 24957) ^ 766635714;
                        i5 = -1247631528;
                    } else {
                        m2566 = (i2 - C0630.m2566("۠᩵")) * 89;
                        i4 = ((m2566 ^ i3) * (-515)) ^ 355074546;
                        i5 = -460096903;
                    }
                case -1279995475:
                case 916561130:
                    return true;
                case -1112988360:
                case 380685800:
                    C4075.m12263();
                    C1005.m3501();
                    m2566 = (C0630.m2566("ᩳ۟") + i2) * 91;
                    i4 = ((m2566 ^ i3) * 19707) ^ 1502257172;
                    i5 = 1473835085;
                case -1104072155:
                case 1065898380:
                    if (C2167.f7158 >= 0) {
                        m2566 = C2105.m6981("۠ۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-9359)) ^ (-423935011);
                        i5 = -380937465;
                    } else {
                        m2566 = (i2 - C0630.m2566("ۖۧ")) * (-5);
                        i4 = ((m2566 ^ i3) * 27157) ^ 1084207005;
                        i5 = -1200688100;
                    }
                case -942904821:
                case -928608698:
                    if (C3911.f12484 >= 0) {
                        m2566 = (C0630.m2566("ᩳ۟") + i2) * 91;
                        i4 = ((m2566 ^ i3) * 19707) ^ 1502257172;
                        i5 = 1473835085;
                    } else {
                        m2566 = C0630.m2566("ܳܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-13533)) ^ 222569176;
                        i5 = -1449623899;
                    }
                case -298466787:
                case 222046082:
                    C1773.m5908();
                    if (C4616.m13552() == 0) {
                        m2566 = (C0630.m2566("ᩳ۟") + i2) * 91;
                        i4 = ((m2566 ^ i3) * 19707) ^ 1502257172;
                        i5 = 1473835085;
                    } else {
                        m2566 = C2105.m6981("۠ۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-9359)) ^ (-423935011);
                        i5 = -380937465;
                    }
                case -276617898:
                case 777899521:
                    C3683.m11222();
                    C4616.m13552();
                    return false;
                case 583536849:
                case 1886949628:
                    return false;
                case 906217517:
                case 1587737565:
                    if (C0237.m1481() >= 0) {
                        m2566 = (C0630.m2566("ۖᩴ") ^ i2) * 101;
                        i4 = ((m2566 ^ i3) * 24957) ^ 766635714;
                        i5 = -1247631528;
                    } else {
                        m2566 = (C0630.m2566("ۖܺ") ^ i3) * (-107);
                        i4 = ((m2566 ^ i2) * 28839) ^ 1887482853;
                        i5 = 479956403;
                    }
                case 1122805112:
                case 1647223094:
                    if (C3019.f9544 >= 0) {
                        m2566 = (i2 - C0630.m2566("᩹ܿ")) * 79;
                        i4 = ((m2566 ^ i3) * (-24221)) ^ (-356873778);
                        i5 = 505881132;
                    } else {
                        m2566 = C2105.m6981("ܰ᩷") ^ i2;
                        i4 = ((m2566 ^ i3) * 12603) ^ (-180186571);
                        i5 = -502944071;
                    }
                case 1784563238:
                case 2067584989:
                    if (C0382.f1805) {
                        m2566 = (C0630.m2566("ᩳۗ") + i3) * 63;
                        i4 = ((m2566 ^ i2) * 6941) ^ (-943360544);
                        i5 = 1303084836;
                    } else {
                        m2566 = (C0630.m2566("ᩳ۟") + i2) * 91;
                        i4 = ((m2566 ^ i3) * 19707) ^ 1502257172;
                        i5 = 1473835085;
                    }
                default:
                    if (C0714.f2697 >= 0) {
                        m2566 = (C0630.m2566("ᩳ۟") + i2) * 91;
                        i4 = ((m2566 ^ i3) * 19707) ^ 1502257172;
                        i5 = 1473835085;
                    } else {
                        m2566 = (C0630.m2566("ۢۨ") ^ i3) * (-109);
                        i4 = ((m2566 ^ i2) * (-11935)) ^ (-2147226111);
                        i5 = 222777233;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m40914() {
        return this.f53488;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.᩹ܽܳ[]] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40920(IdentityHashMap identityHashMap, ArrayList arrayList) {
        C12532 c12532;
        C12532 c125322;
        C23115[] c23115Arr = null;
        int i = 0;
        int i2 = 0;
        C23115 c23115 = null;
        C23115 c231152 = null;
        int i3 = -1380032240;
        int i4 = C3911.f12484;
        int i5 = C4616.f14690;
        int m2566 = (C0630.m2566("۠ۚ") + i4) * 51;
        int i6 = ((m2566 ^ i5) * (-30903)) ^ (-613937601);
        int i7 = -1409028589;
        while (true) {
            i3 = ((((i3 ^ i5) * (-10319)) >> 31) & i6) ^ (m2566 ^ i7);
            switch (i3) {
                case -1964443917:
                case 1457308336:
                    if (C3911.f12484 >= 0) {
                        m2566 = C0630.m2566("᩵ܺ") ^ i5;
                        i6 = ((m2566 ^ i4) * 4469) ^ 905014636;
                        i7 = -488808705;
                    } else {
                        m2566 = C0630.m2566("᩶֫") ^ i5;
                        i6 = ((m2566 ^ i4) * (-26943)) ^ (-41929383);
                        i7 = 824073312;
                    }
                case -1752787635:
                case -300840004:
                    if (AbstractC2021.m6574()) {
                        m2566 = (i5 - C2105.m6981("֫ܶ")) * 95;
                        i6 = ((m2566 ^ i4) * 3939) ^ 1886961950;
                        i7 = 1837309499;
                    } else {
                        m2566 = (C2105.m6981("۫ᩴ") ^ i4) * (-87);
                        i6 = ((m2566 ^ i5) * (-28819)) ^ 1938104732;
                        i7 = -972267571;
                    }
                case -1740688924:
                case 344604197:
                    C4075.m12263();
                    m2566 = C0630.m2566("᩵ܺ") ^ i5;
                    i6 = ((m2566 ^ i4) * 4469) ^ 905014636;
                    i7 = -488808705;
                case -1655205607:
                case -1492678467:
                    c231152 = c23115;
                    c12532 = c231152.f74355;
                    if (C2167.m7148(identityHashMap, c12532, Boolean.TRUE) == null) {
                        m2566 = C2105.m6981("ۙۖ") ^ i5;
                        i6 = ((m2566 ^ i4) * 10839) ^ (-910677997);
                        i7 = 1386904840;
                    } else {
                        m2566 = C0630.m2566("ۖۢ") ^ i4;
                        i6 = ((m2566 ^ i5) * (-14261)) ^ 2122030147;
                        i7 = 1548610155;
                    }
                case -1592592440:
                case 1945324970:
                    if (i2 < i) {
                        m2566 = C0630.m2566("֡ۨ") ^ i5;
                        i6 = ((m2566 ^ i4) * (-3703)) ^ 1869723749;
                        i7 = -1959103941;
                    } else {
                        m2566 = C0630.m2566("ܺᩴ") ^ i5;
                        i6 = ((m2566 ^ i4) * 6481) ^ 475373306;
                        i7 = 358857737;
                    }
                case -1587041612:
                case 1399817966:
                    if (C1294.f4556 >= 0) {
                        m2566 = (C0630.m2566("ۧ۬") + i4) * (-35);
                        i6 = ((m2566 ^ i5) * 691) ^ 655383287;
                        i7 = -1910388047;
                    } else {
                        m2566 = C2105.m6981("֨ܶ") ^ i4;
                        i6 = ((m2566 ^ i5) * (-32663)) ^ 1405082418;
                        i7 = -947350650;
                    }
                case -1384048228:
                case 4491195:
                    c23115 = c23115Arr[i2];
                    if (c23115 instanceof C23115) {
                        m2566 = C0630.m2566("ܺۡ") ^ i4;
                        i6 = ((m2566 ^ i5) * (-32439)) ^ 410376166;
                        i7 = 1105479759;
                    } else {
                        m2566 = C0630.m2566("ۖۢ") ^ i4;
                        i6 = ((m2566 ^ i5) * (-14261)) ^ 2122030147;
                        i7 = 1548610155;
                    }
                case -1267043743:
                case 1318956945:
                    ?? r0 = this.f53489;
                    i = r0.length;
                    i2 = 0;
                    c23115Arr = r0;
                    m2566 = (C2105.m6981("۟ܽ") ^ i4) * (-91);
                    i6 = ((m2566 ^ i5) * 2125) ^ (-1792307799);
                    i7 = 1306846591;
                case -1231078398:
                case -520987293:
                    if (C4159.m12565() < 0) {
                        m2566 = (C0630.m2566("᩹᩺") ^ i4) * 45;
                        i6 = ((m2566 ^ i5) * (-8875)) ^ (-1404686219);
                        i7 = -2114437119;
                    } else {
                        m2566 = (C0630.m2566("᩵ۘ") + i5) * 25;
                        i6 = ((m2566 ^ i4) * (-13395)) ^ (-1310823205);
                        i7 = -716732312;
                    }
                case -1162996046:
                case -695660638:
                    i2++;
                    c23115Arr = c23115Arr;
                    m2566 = (C2105.m6981("۟ܽ") ^ i4) * (-91);
                    i6 = ((m2566 ^ i5) * 2125) ^ (-1792307799);
                    i7 = 1306846591;
                case -1067127096:
                case 863662437:
                    if (C1294.m4372() <= 0) {
                        m2566 = (C0630.m2566("᩵ۘ") + i5) * 25;
                        i6 = ((m2566 ^ i4) * (-13395)) ^ (-1310823205);
                        i7 = -716732312;
                    } else {
                        m2566 = C0630.m2566("ۖ᩻") ^ i4;
                        i6 = ((m2566 ^ i5) * 3483) ^ 1056748403;
                        i7 = 311177584;
                    }
                case -999965862:
                case -260323002:
                    C3911.m11924();
                    break;
                case -807502980:
                case 560661277:
                    if (AbstractC2021.m6574()) {
                        m2566 = C0630.m2566("᩵ܺ") ^ i5;
                        i6 = ((m2566 ^ i4) * 4469) ^ 905014636;
                        i7 = -488808705;
                    } else {
                        m2566 = C2105.m6981("ܶۨ") ^ i5;
                        i6 = ((m2566 ^ i4) * 1631) ^ 1819832205;
                        i7 = 747481282;
                    }
                case -768516218:
                case -287534805:
                    if (C0382.f1805) {
                        m2566 = (C0630.m2566("᩺ܳ") ^ i5) * 47;
                        i6 = ((m2566 ^ i4) * 15919) ^ 2014321168;
                        i7 = -334875673;
                    } else {
                        m2566 = (C0630.m2566("᩹᩺") ^ i4) * 45;
                        i6 = ((m2566 ^ i5) * (-8875)) ^ (-1404686219);
                        i7 = -2114437119;
                    }
                case -317466836:
                case 396802901:
                    if (C5695.f17556 >= 0) {
                        m2566 = (C0630.m2566("᩵ۘ") + i5) * 25;
                        i6 = ((m2566 ^ i4) * (-13395)) ^ (-1310823205);
                        i7 = -716732312;
                    } else {
                        m2566 = (C2105.m6981("ۛۡ") + i5) * 59;
                        i6 = ((m2566 ^ i4) * (-1343)) ^ 1996375782;
                        i7 = 2063102863;
                    }
                case -193988352:
                case 619701987:
                    if (C0050.f910 >= 0) {
                        m2566 = (C0630.m2566("᩹᩺") ^ i4) * 45;
                        i6 = ((m2566 ^ i5) * (-8875)) ^ (-1404686219);
                        i7 = -2114437119;
                    } else {
                        m2566 = (C0630.m2566("ܶۖ") ^ i4) * 33;
                        i6 = ((m2566 ^ i5) * (-7061)) ^ 1317018692;
                        i7 = 1236482534;
                    }
                case -134732144:
                case 796006014:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = (C0630.m2566("᩹᩺") ^ i4) * 45;
                        i6 = ((m2566 ^ i5) * (-8875)) ^ (-1404686219);
                        i7 = -2114437119;
                    } else {
                        m2566 = (C0630.m2566("۠᩹") + i5) * (-25);
                        i6 = ((m2566 ^ i4) * 6753) ^ (-1624933705);
                        i7 = 83208234;
                    }
                case 171348080:
                case 388347396:
                    if (C1773.f6144 <= 0) {
                        m2566 = C0630.m2566("᩵ܺ") ^ i5;
                        i6 = ((m2566 ^ i4) * 4469) ^ 905014636;
                        i7 = -488808705;
                    } else {
                        m2566 = C2105.m6981("᩹ܽ") ^ i4;
                        i6 = ((m2566 ^ i5) * (-19035)) ^ 605601080;
                        i7 = 138185946;
                    }
                case 502140003:
                case 2028943614:
                    if (C3746.f11829 <= 0) {
                        m2566 = C0630.m2566("᩵ܺ") ^ i5;
                        i6 = ((m2566 ^ i4) * 4469) ^ 905014636;
                        i7 = -488808705;
                    } else {
                        m2566 = (C0630.m2566("᩹᩺") ^ i4) * 45;
                        i6 = ((m2566 ^ i5) * (-8875)) ^ (-1404686219);
                        i7 = -2114437119;
                    }
                case 869832883:
                case 1536620054:
                    break;
                case 1853597758:
                case 1947302101:
                    c125322 = c231152.f74355;
                    C7106.m19117(arrayList, c125322);
                    m2566 = C0630.m2566("ۖۢ") ^ i4;
                    i6 = ((m2566 ^ i5) * (-14261)) ^ 2122030147;
                    i7 = 1548610155;
                default:
                    if (C1711.f5919) {
                        m2566 = (C0630.m2566("ۧ۬") + i4) * (-35);
                        i6 = ((m2566 ^ i5) * 691) ^ 655383287;
                        i7 = -1910388047;
                    } else {
                        m2566 = (C0630.m2566("᩹᩺") ^ i4) * 45;
                        i6 = ((m2566 ^ i5) * (-8875)) ^ (-1404686219);
                        i7 = -2114437119;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x007f, code lost:
    
        if (l.C3019.m9255() > 0) goto L18;
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C17513 m40926(int r19, int r20) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17513.m40926(int, int):l.ܿᩳܳ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (l.C0630.f2410 <= 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (l.C22628.m50615() != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        if (l.C3683.f11629 >= 0) goto L64;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C18219 m40921(int r10, byte[] r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17513.m40921(int, byte[], int, int):l.ᩳᩳܳ");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m40925(int i, int i2) {
        long j;
        int i3;
        int m6981;
        int i4;
        int i5;
        int m2566;
        int i6;
        int i7;
        long j2;
        int i8;
        int i9;
        int i10 = i;
        int i11 = C1128.f4106;
        int i12 = C5695.f17556;
        int m69812 = (C2105.m6981("᩷ۚ") ^ i11) * 83;
        int i13 = ((m69812 ^ i12) * 21559) ^ (-1858780624);
        InterfaceC22410[] interfaceC22410Arr = null;
        long j3 = 0;
        long j4 = 0;
        int i14 = m69812 ^ (-451514013);
        int i15 = 0;
        int i16 = 0;
        int i17 = 1697008060;
        int i18 = 0;
        long j5 = 0;
        long j6 = 0;
        InterfaceC22410 interfaceC22410 = null;
        long j7 = 0;
        int i19 = 0;
        while (true) {
            i17 = i14 ^ (i13 & (((i17 ^ i12) * 15001) >> 31));
            switch (i17) {
                case -2012097852:
                case -890703751:
                    j = j5;
                    j2 = interfaceC22410.mo32107(i10, i15);
                    j6 = j2;
                    m2566 = C2105.m6981("۟֫") ^ i11;
                    i6 = ((m2566 ^ i12) * 8283) ^ 1421456653;
                    i7 = 1422897123;
                    i14 = m2566 ^ i7;
                    i13 = i6;
                    j5 = j;
                case -2004417802:
                case 483428317:
                    j = j5;
                    i3 = i18;
                    if (C3537.f11231 < 0) {
                        m6981 = (i12 - C2105.m6981("᩷ۖ")) * 123;
                        i4 = ((m6981 ^ i11) * (-2211)) ^ 1398721394;
                        i5 = -1234574575;
                        i9 = m6981 ^ i5;
                        i13 = i4;
                        i18 = i3;
                        j5 = j;
                        i14 = i9;
                    }
                    m6981 = (C2105.m6981("᩹᩵") + i11) * 89;
                    i4 = ((m6981 ^ i12) * 28613) ^ 683748471;
                    i5 = 1442829066;
                    i9 = m6981 ^ i5;
                    i13 = i4;
                    i18 = i3;
                    j5 = j;
                    i14 = i9;
                case -1910216318:
                case 561563604:
                    j = j5;
                    i3 = i18;
                    if (C1005.m3501()) {
                        m6981 = C2105.m6981("ۘ۠") ^ i11;
                        i4 = ((m6981 ^ i12) * (-27989)) ^ (-446099782);
                        i5 = 625098361;
                        i9 = m6981 ^ i5;
                        i13 = i4;
                        i18 = i3;
                        j5 = j;
                        i14 = i9;
                    } else {
                        i18 = i3;
                        int m25662 = C0630.m2566("۬ۨ") ^ i12;
                        i14 = m25662 ^ (-13028577);
                        i13 = ((m25662 ^ i11) * (-11229)) ^ 1262683846;
                        j5 = j;
                    }
                case -1693791378:
                case 454255812:
                    j = j5;
                    j2 = 0;
                    j6 = j2;
                    m2566 = C2105.m6981("۟֫") ^ i11;
                    i6 = ((m2566 ^ i12) * 8283) ^ 1421456653;
                    i7 = 1422897123;
                    i14 = m2566 ^ i7;
                    i13 = i6;
                    j5 = j;
                case -1649591143:
                case 1960548198:
                    j = j5;
                    if (i19 < i16) {
                        m2566 = (C0630.m2566("ܰ᩵") + i11) * (-75);
                        i6 = ((m2566 ^ i12) * (-8517)) ^ 221695632;
                        i7 = 911126839;
                    } else {
                        m2566 = (C0630.m2566("۟᩺") + i12) * (-81);
                        i6 = ((m2566 ^ i11) * 2119) ^ (-1639077820);
                        i7 = -872149642;
                    }
                    i14 = m2566 ^ i7;
                    i13 = i6;
                    j5 = j;
                case -1561139634:
                case -672743770:
                    RunnableC0588.m2441();
                    int m69813 = C2105.m6981("᩻۠") ^ i12;
                    i14 = m69813 ^ (-464017157);
                    i13 = ((m69813 ^ i11) * 28991) ^ 865003800;
                case -1271544281:
                case -889323134:
                    int i20 = i18;
                    j5 = i20 * 96;
                    if (C0422.m1963()) {
                        int m69814 = (i12 - C2105.m6981("᩸᩸")) * (-63);
                        i13 = ((m69814 ^ i11) * 11873) ^ (-1065149819);
                        i9 = m69814 ^ (-643832796);
                        i18 = i20;
                        i14 = i9;
                    } else {
                        i8 = i20;
                        int m25663 = (i12 - C0630.m2566("᩺ܶ")) * (-83);
                        int i21 = ((m25663 ^ i11) * 19817) ^ 1962097380;
                        i9 = m25663 ^ (-1404465864);
                        i13 = i21;
                        i18 = i8;
                        i10 = i;
                        i14 = i9;
                    }
                case -1268417721:
                case 1701408428:
                    if (C3911.f12484 >= 0) {
                        int m698132 = C2105.m6981("᩻۠") ^ i12;
                        i14 = m698132 ^ (-464017157);
                        i13 = ((m698132 ^ i11) * 28991) ^ 865003800;
                    } else {
                        j = j5;
                        i3 = i18;
                        m6981 = (i11 - C0630.m2566("ۛۤ")) * (-53);
                        i4 = ((m6981 ^ i12) * 24201) ^ (-587006060);
                        i5 = 2008597539;
                        i9 = m6981 ^ i5;
                        i13 = i4;
                        i18 = i3;
                        j5 = j;
                        i14 = i9;
                    }
                case -1123049285:
                case 446609250:
                    i19++;
                    j = j5;
                    j7 = j4;
                    m2566 = C0630.m2566("ۘܳ") ^ i11;
                    i6 = ((m2566 ^ i12) * 3869) ^ 2017834443;
                    i7 = 2086620149;
                    i14 = m2566 ^ i7;
                    i13 = i6;
                    j5 = j;
                case -946811853:
                case 253949757:
                    j = j5;
                    i15 = i2 + i10;
                    interfaceC22410Arr = this.f53489;
                    int length = interfaceC22410Arr.length;
                    if (C2126.f7087) {
                        i18 = length;
                        int m256622 = C0630.m2566("۬ۨ") ^ i12;
                        i14 = m256622 ^ (-13028577);
                        i13 = ((m256622 ^ i11) * (-11229)) ^ 1262683846;
                        j5 = j;
                    } else {
                        int m69815 = (C2105.m6981("ᩴۢ") ^ i11) * 25;
                        i14 = m69815 ^ 1627471505;
                        i18 = length;
                        i13 = ((m69815 ^ i12) * (-3881)) ^ (-1285106862);
                        j5 = j;
                    }
                case -898312507:
                case 384143807:
                    j = j5;
                    i16 = interfaceC22410Arr.length;
                    j7 = j + j3;
                    i19 = 0;
                    m2566 = C0630.m2566("ۘܳ") ^ i11;
                    i6 = ((m2566 ^ i12) * 3869) ^ 2017834443;
                    i7 = 2086620149;
                    i14 = m2566 ^ i7;
                    i13 = i6;
                    j5 = j;
                case -803259682:
                case 768008889:
                    j = j5;
                    i3 = i18;
                    if (C3537.f11231 < 0) {
                        m6981 = C2105.m6981("ᩴ۬") ^ i11;
                        i4 = ((m6981 ^ i12) * 19763) ^ 783963054;
                        i5 = -2147467322;
                        i9 = m6981 ^ i5;
                        i13 = i4;
                        i18 = i3;
                        j5 = j;
                        i14 = i9;
                    }
                    m6981 = (i11 - C0630.m2566("ۛۤ")) * (-53);
                    i4 = ((m6981 ^ i12) * 24201) ^ (-587006060);
                    i5 = 2008597539;
                    i9 = m6981 ^ i5;
                    i13 = i4;
                    i18 = i3;
                    j5 = j;
                    i14 = i9;
                case -554563114:
                case 1028060152:
                    return j7;
                case 157528937:
                case 2016931415:
                    C3911.m11924();
                    return 0L;
                case 302960180:
                case 556892667:
                    RunnableC1937.m6387();
                    if (C11340.m28031()) {
                        i8 = i18;
                        int m256632 = (i12 - C0630.m2566("᩺ܶ")) * (-83);
                        int i212 = ((m256632 ^ i11) * 19817) ^ 1962097380;
                        i9 = m256632 ^ (-1404465864);
                        i13 = i212;
                        i18 = i8;
                        i10 = i;
                        i14 = i9;
                    }
                    j = j5;
                    i3 = i18;
                    m6981 = (i11 - C0630.m2566("ۛۤ")) * (-53);
                    i4 = ((m6981 ^ i12) * 24201) ^ (-587006060);
                    i5 = 2008597539;
                    i9 = m6981 ^ i5;
                    i13 = i4;
                    i18 = i3;
                    j5 = j;
                    i14 = i9;
                case 352273067:
                case 1099362713:
                    j = j5;
                    i3 = i18;
                    if (C3432.f10845 < 0) {
                        m6981 = C0630.m2566("᩺֨") ^ i12;
                        i4 = ((m6981 ^ i11) * 12965) ^ 1786322585;
                        i5 = -2144534243;
                        i9 = m6981 ^ i5;
                        i13 = i4;
                        i18 = i3;
                        j5 = j;
                        i14 = i9;
                    }
                    m6981 = (C2105.m6981("᩹᩵") + i11) * 89;
                    i4 = ((m6981 ^ i12) * 28613) ^ 683748471;
                    i5 = 1442829066;
                    i9 = m6981 ^ i5;
                    i13 = i4;
                    i18 = i3;
                    j5 = j;
                    i14 = i9;
                case 472132680:
                case 651087986:
                    long j8 = j5;
                    i8 = i18;
                    if (C4117.f13076 <= 0) {
                        j5 = j8;
                        int m2566322 = (i12 - C0630.m2566("᩺ܶ")) * (-83);
                        int i2122 = ((m2566322 ^ i11) * 19817) ^ 1962097380;
                        i9 = m2566322 ^ (-1404465864);
                        i13 = i2122;
                        i18 = i8;
                        i10 = i;
                        i14 = i9;
                    } else {
                        int m69816 = (C2105.m6981("۟֡") ^ i12) * (-31);
                        i13 = ((m69816 ^ i11) * 12209) ^ (-1079655205);
                        i18 = i8;
                        j5 = j8;
                        i14 = m69816 ^ (-937626153);
                        i10 = i;
                    }
                case 641774793:
                case 2040569779:
                    j = j5;
                    j3 = 48;
                    if (C1711.f5919) {
                        i3 = i18;
                        m6981 = (C2105.m6981("᩹᩵") + i11) * 89;
                        i4 = ((m6981 ^ i12) * 28613) ^ 683748471;
                        i5 = 1442829066;
                        i9 = m6981 ^ i5;
                        i13 = i4;
                        i18 = i3;
                        j5 = j;
                        i14 = i9;
                    } else {
                        m2566 = (C0630.m2566("᩵ܺ") ^ i12) * 17;
                        i6 = ((m2566 ^ i11) * (-17389)) ^ 1827948820;
                        i7 = -695181331;
                        i14 = m2566 ^ i7;
                        i13 = i6;
                        j5 = j;
                    }
                case 777234091:
                case 1548448391:
                    j = j5;
                    j4 = m40902(j7, Math.max(interfaceC22410.mo32108(), j6));
                    if (C2126.f7087) {
                        int m2566222 = C0630.m2566("۬ۨ") ^ i12;
                        i14 = m2566222 ^ (-13028577);
                        i13 = ((m2566222 ^ i11) * (-11229)) ^ 1262683846;
                        j5 = j;
                    } else {
                        m2566 = (C0630.m2566("ۡۙ") + i12) * (-35);
                        i6 = ((m2566 ^ i11) * 30913) ^ (-8626046);
                        i7 = -1949905999;
                        i14 = m2566 ^ i7;
                        i13 = i6;
                        j5 = j;
                    }
                case 1265570934:
                case 2146223856:
                    if (C4263.f13799 <= 0) {
                        int m6981322 = C2105.m6981("᩻۠") ^ i12;
                        i14 = m6981322 ^ (-464017157);
                        i13 = ((m6981322 ^ i11) * 28991) ^ 865003800;
                    } else {
                        j = j5;
                        i3 = i18;
                        m6981 = (C2105.m6981("᩹᩵") + i11) * 89;
                        i4 = ((m6981 ^ i12) * 28613) ^ 683748471;
                        i5 = 1442829066;
                        i9 = m6981 ^ i5;
                        i13 = i4;
                        i18 = i3;
                        j5 = j;
                        i14 = i9;
                    }
                case 1830361892:
                case 2000444392:
                    j = j5;
                    i3 = i18;
                    m40913(i, i2);
                    if (C0050.m940() > 0) {
                        m6981 = (i11 - C0630.m2566("᩵۟")) * (-7);
                        i4 = ((m6981 ^ i12) * 14489) ^ 1578275455;
                        i5 = -883387917;
                        i9 = m6981 ^ i5;
                        i13 = i4;
                        i18 = i3;
                        j5 = j;
                        i14 = i9;
                    }
                    m6981 = (i11 - C0630.m2566("ۛۤ")) * (-53);
                    i4 = ((m6981 ^ i12) * 24201) ^ (-587006060);
                    i5 = 2008597539;
                    i9 = m6981 ^ i5;
                    i13 = i4;
                    i18 = i3;
                    j5 = j;
                    i14 = i9;
                default:
                    j = j5;
                    interfaceC22410 = interfaceC22410Arr[i19];
                    if (interfaceC22410.mo32105(i10, i15)) {
                        m2566 = C0630.m2566("ۛۨ") ^ i12;
                        i6 = ((m2566 ^ i11) * (-51)) ^ 2145237367;
                        i7 = 1696999934;
                    } else {
                        m2566 = C0630.m2566("᩻ۧ") ^ i11;
                        i6 = ((m2566 ^ i12) * (-19561)) ^ 37884511;
                        i7 = 328489152;
                    }
                    i14 = m2566 ^ i7;
                    i13 = i6;
                    j5 = j;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [l.᩹ܽܳ[]] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40916(int i, int i2, IdentityHashMap identityHashMap, ArrayList arrayList) {
        int m6981;
        int i3;
        int i4;
        C23115[] c23115Arr;
        int m69812;
        int i5;
        int i6;
        C12532 c12532;
        C23115 c23115;
        C12532 c125322;
        C12532 c125323;
        int i7 = 0;
        C23115[] c23115Arr2 = null;
        int i8 = 0;
        int i9 = 0;
        C23115 c231152 = null;
        C23115 c231153 = null;
        int i10 = -1804298807;
        int i11 = C4117.f13076;
        int i12 = RunnableC1937.f6483;
        int m69813 = C2105.m6981("ᩴ᩹") ^ i12;
        int i13 = ((m69813 ^ i11) * 19699) ^ (-1268342879);
        int i14 = -243772855;
        while (true) {
            int i15 = m69813 ^ i14;
            while (true) {
                i10 = ((((i10 ^ i11) * 13863) >> 31) & i13) ^ i15;
                switch (i10) {
                    case -2006524241:
                    case -447949393:
                        if (i9 < i8) {
                            m69812 = C2105.m6981("᩸ۘ") ^ i11;
                            i5 = ((m69812 ^ i12) * (-11425)) ^ 515189692;
                            i6 = 402143416;
                            c231152 = c231152;
                        } else {
                            m69812 = (C2105.m6981("ۗۜ") + i12) * 75;
                            i5 = ((m69812 ^ i11) * 31893) ^ (-783572419);
                            i6 = -654992416;
                            c231152 = c231152;
                        }
                        i15 = m69812 ^ i6;
                        i13 = i5;
                    case -1339532505:
                    case -667668365:
                        i9++;
                        c23115Arr = c23115Arr2;
                        m6981 = C2105.m6981("ۙ۟") ^ i11;
                        i3 = ((m6981 ^ i12) * 25059) ^ (-1379698783);
                        i4 = -1283091410;
                        c23115Arr2 = c23115Arr;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                    case -1289671964:
                    case -1253189456:
                        c12532 = c231153.f74355;
                        c23115 = c231152;
                        if (!identityHashMap.containsKey(c12532)) {
                            m69812 = (C0630.m2566("ܿ֨") + i12) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            i5 = ((m69812 ^ i11) * (-14243)) ^ (-876812384);
                            i6 = -52637215;
                            c231152 = c231152;
                            i15 = m69812 ^ i6;
                            i13 = i5;
                        }
                        m69812 = (C0630.m2566("ۘܶ") + i12) * 13;
                        i5 = ((m69812 ^ i11) * 29457) ^ 760278891;
                        i6 = -1331083109;
                        c231152 = c23115;
                        i15 = m69812 ^ i6;
                        i13 = i5;
                    case -1281247488:
                    case -1179656680:
                        if (C0382.f1805) {
                            m6981 = (C2105.m6981("ܶ֨") ^ i12) * 21;
                            i3 = ((m6981 ^ i11) * 30701) ^ 1608615514;
                            i4 = -830528682;
                            c23115Arr2 = c23115Arr2;
                            i15 = m6981 ^ i4;
                            i13 = i3;
                        }
                        m6981 = (C2105.m6981("ۤ֨") ^ i11) * (-71);
                        i3 = ((m6981 ^ i12) * 30919) ^ (-337647119);
                        i4 = 1496506591;
                        c23115Arr2 = c23115Arr2;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                    case -1222878508:
                    case -53303422:
                        if (C3019.f9544 >= 0) {
                            break;
                        }
                        m6981 = C0630.m2566("ۡ᩹") ^ i11;
                        i3 = ((m6981 ^ i12) * (-14721)) ^ 2143848960;
                        i4 = 1408957850;
                        c23115Arr2 = c23115Arr2;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                        break;
                    case -1195212025:
                    case 970776750:
                        if (C0422.m1963()) {
                            m6981 = C0630.m2566("۟᩹") ^ i11;
                            i3 = ((m6981 ^ i12) * 24125) ^ (-1335291529);
                            i4 = -1352520213;
                            c23115Arr2 = c23115Arr2;
                            i15 = m6981 ^ i4;
                            i13 = i3;
                        }
                        m6981 = (C2105.m6981("۟֡") ^ i12) * 57;
                        i3 = ((m6981 ^ i11) * 13561) ^ (-949679187);
                        i4 = 1394023107;
                        c23115Arr2 = c23115Arr2;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                    case -1110651911:
                    case -232113778:
                        if (C1294.m4372() > 0) {
                            m6981 = C0630.m2566("᩸ܶ") ^ i12;
                            i3 = ((m6981 ^ i11) * (-8515)) ^ (-1530845813);
                            i4 = 1604882806;
                            c23115Arr2 = c23115Arr2;
                            i15 = m6981 ^ i4;
                            i13 = i3;
                        }
                        m6981 = (C2105.m6981("ۤ֨") ^ i11) * (-71);
                        i3 = ((m6981 ^ i12) * 30919) ^ (-337647119);
                        i4 = 1496506591;
                        c23115Arr2 = c23115Arr2;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                    case -1091129149:
                    case 1428925667:
                        if (C3746.f11829 > 0) {
                            m6981 = (C0630.m2566("֫ۤ") ^ i11) * (-33);
                            i3 = ((m6981 ^ i12) * (-8125)) ^ (-899309574);
                            i4 = 450099539;
                            c23115Arr2 = c23115Arr2;
                            i15 = m6981 ^ i4;
                            i13 = i3;
                        }
                        m6981 = C0630.m2566("ۡ᩹") ^ i11;
                        i3 = ((m6981 ^ i12) * (-14721)) ^ 2143848960;
                        i4 = 1408957850;
                        c23115Arr2 = c23115Arr2;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                    case -1033820335:
                    case 681255307:
                        if (RunnableC1937.f6483 >= 0) {
                            m6981 = (C2105.m6981("ۤ֨") ^ i11) * (-71);
                            i3 = ((m6981 ^ i12) * 30919) ^ (-337647119);
                            i4 = 1496506591;
                            c23115Arr2 = c23115Arr2;
                            i15 = m6981 ^ i4;
                            i13 = i3;
                        }
                        m6981 = C0630.m2566("ۡ᩹") ^ i11;
                        i3 = ((m6981 ^ i12) * (-14721)) ^ 2143848960;
                        i4 = 1408957850;
                        c23115Arr2 = c23115Arr2;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                    case -1030634960:
                    case 1093835135:
                        C23115 c231154 = c23115Arr2[i9];
                        boolean z = c231154 instanceof C23115;
                        c23115 = c231154;
                        if (z) {
                            m69812 = (i12 - C0630.m2566("֫ۘ")) * 59;
                            i5 = ((m69812 ^ i11) * (-15399)) ^ (-1832945472);
                            i6 = -1650272664;
                            c231152 = c231154;
                            i15 = m69812 ^ i6;
                            i13 = i5;
                        }
                        m69812 = (C0630.m2566("ۘܶ") + i12) * 13;
                        i5 = ((m69812 ^ i11) * 29457) ^ 760278891;
                        i6 = -1331083109;
                        c231152 = c23115;
                        i15 = m69812 ^ i6;
                        i13 = i5;
                    case -893209263:
                    case -256857645:
                        if (!C1711.f5919) {
                            m6981 = C0630.m2566("ۢ֡") ^ i12;
                            i3 = ((m6981 ^ i11) * 32107) ^ 1106161552;
                            i4 = -1485736707;
                            c23115Arr2 = c23115Arr2;
                            i15 = m6981 ^ i4;
                            i13 = i3;
                        }
                        m6981 = C0630.m2566("ۡ᩹") ^ i11;
                        i3 = ((m6981 ^ i12) * (-14721)) ^ 2143848960;
                        i4 = 1408957850;
                        c23115Arr2 = c23115Arr2;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                    case -834112030:
                    case -329894450:
                        if (C2958.f9394 < 0) {
                            m6981 = C0630.m2566("֫۠") ^ i11;
                            i3 = ((m6981 ^ i12) * (-2507)) ^ (-2073359648);
                            i4 = -278466006;
                            c23115Arr2 = c23115Arr2;
                            i15 = m6981 ^ i4;
                            i13 = i3;
                        }
                        m6981 = (C2105.m6981("ۤ֨") ^ i11) * (-71);
                        i3 = ((m6981 ^ i12) * 30919) ^ (-337647119);
                        i4 = 1496506591;
                        c23115Arr2 = c23115Arr2;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                    case -272268065:
                    case 1620624358:
                        if (!C0798.f2919) {
                            m6981 = C2105.m6981("ۨܿ") ^ i12;
                            i3 = ((m6981 ^ i11) * 5051) ^ (-1952789484);
                            i4 = -555123792;
                            c23115Arr2 = c23115Arr2;
                            i15 = m6981 ^ i4;
                            i13 = i3;
                        }
                        m6981 = (C2105.m6981("۫۠") ^ i11) * 31;
                        i3 = ((m6981 ^ i12) * (-2393)) ^ 1608456720;
                        i4 = 2130089598;
                        c23115Arr2 = c23115Arr2;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                    case -106211274:
                    case 1446193050:
                        if (RunnableC0588.f2309 < 0) {
                            m6981 = (C0630.m2566("ۤۛ") + i12) * 75;
                            i3 = ((m6981 ^ i11) * 3963) ^ (-88866263);
                            i4 = -99814649;
                            c23115Arr2 = c23115Arr2;
                            i15 = m6981 ^ i4;
                            i13 = i3;
                        }
                        m6981 = (C2105.m6981("۟֡") ^ i12) * 57;
                        i3 = ((m6981 ^ i11) * 13561) ^ (-949679187);
                        i4 = 1394023107;
                        c23115Arr2 = c23115Arr2;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                    case -56025040:
                    case 549249564:
                        C1128.m3851();
                        break;
                    case -41194826:
                    case 705179082:
                        c125322 = c231153.f74355;
                        C0714.m2809(identityHashMap, c125322, C1420.m4916(C0382.m1847(arrayList)));
                        c125323 = c231153.f74355;
                        C1916.m6307(arrayList, c125323);
                        c23115 = c231152;
                        m69812 = (C0630.m2566("ۘܶ") + i12) * 13;
                        i5 = ((m69812 ^ i11) * 29457) ^ 760278891;
                        i6 = -1331083109;
                        c231152 = c23115;
                        i15 = m69812 ^ i6;
                        i13 = i5;
                    case -35932721:
                    case 1989296769:
                        ViewOnClickListenerC1958.m6429();
                        m6981 = (C2105.m6981("۫۠") ^ i11) * 31;
                        i3 = ((m6981 ^ i12) * (-2393)) ^ 1608456720;
                        i4 = 2130089598;
                        c23115Arr2 = c23115Arr2;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                    case 49842759:
                    case 934482895:
                        c231153 = c231152;
                        c23115 = c231152;
                        if (c231153.mo32105(i, i7)) {
                            m69812 = (i11 - C0630.m2566("ۤ᩷")) * (-85);
                            i5 = ((m69812 ^ i12) * 21037) ^ (-284488598);
                            i6 = -1710062484;
                            c231152 = c231152;
                            i15 = m69812 ^ i6;
                            i13 = i5;
                        }
                        m69812 = (C0630.m2566("ۘܶ") + i12) * 13;
                        i5 = ((m69812 ^ i11) * 29457) ^ 760278891;
                        i6 = -1331083109;
                        c231152 = c23115;
                        i15 = m69812 ^ i6;
                        i13 = i5;
                    case 87263365:
                    case 1499557070:
                        C4117.m12364();
                        if (C4159.m12565() < 0) {
                            break;
                        }
                        m6981 = (C2105.m6981("۫۠") ^ i11) * 31;
                        i3 = ((m6981 ^ i12) * (-2393)) ^ 1608456720;
                        i4 = 2130089598;
                        c23115Arr2 = c23115Arr2;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                        break;
                    case 915566888:
                    case 2044170270:
                        if (ServiceConnectionC3453.m10564() > 0) {
                            m6981 = (C0630.m2566("ۚ᩵") + i11) * 59;
                            i3 = ((m6981 ^ i12) * (-30861)) ^ 2092675491;
                            i4 = -1117684977;
                            c23115Arr2 = c23115Arr2;
                            i15 = m6981 ^ i4;
                            i13 = i3;
                        }
                        m6981 = (C2105.m6981("۫۠") ^ i11) * 31;
                        i3 = ((m6981 ^ i12) * (-2393)) ^ 1608456720;
                        i4 = 2130089598;
                        c23115Arr2 = c23115Arr2;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                    case 1141771052:
                    case 2059699265:
                        m40913(i, i2);
                        i7 = i2 + i;
                        ?? r3 = this.f53489;
                        i8 = r3.length;
                        i9 = 0;
                        c23115Arr = r3;
                        m6981 = C2105.m6981("ۙ۟") ^ i11;
                        i3 = ((m6981 ^ i12) * 25059) ^ (-1379698783);
                        i4 = -1283091410;
                        c23115Arr2 = c23115Arr;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                    case 1326086605:
                    case 1642422503:
                        if (C4075.f12947 < 0) {
                            m6981 = (i11 - C0630.m2566("֡۠")) * 13;
                            i3 = ((m6981 ^ i12) * (-19389)) ^ (-1757894874);
                            i4 = -691727253;
                            c23115Arr2 = c23115Arr2;
                            i15 = m6981 ^ i4;
                            i13 = i3;
                        }
                        m6981 = (C2105.m6981("۟֡") ^ i12) * 57;
                        i3 = ((m6981 ^ i11) * 13561) ^ (-949679187);
                        i4 = 1394023107;
                        c23115Arr2 = c23115Arr2;
                        i15 = m6981 ^ i4;
                        i13 = i3;
                }
                return;
            }
            m69813 = C2105.m6981("ۧۛ") ^ i12;
            i13 = ((m69813 ^ i11) * 7661) ^ (-1098450133);
            i14 = -412008065;
            c23115Arr2 = c23115Arr2;
            c231152 = c231152;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (l.C21923.m49329() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        if (l.C3537.f11231 < 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (l.C4117.f13076 <= 0) goto L20;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C17513 m40915(int r35, int r36) {
        /*
            Method dump skipped, instructions count: 1384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17513.m40915(int, int):l.ܿᩳܳ");
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static l.C17513 m40907(l.C17513 r41, int r42, l.C12532 r43, int r44, int r45, int r46, int r47, int[] r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 4110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17513.m40907(l.ܿᩳܳ, int, l.۫ܽܳ, int, int, int, int, int[], int, int):l.ܿᩳܳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40919(IdentityHashMap identityHashMap) {
        InterfaceC22410[] interfaceC22410Arr = null;
        int i = 0;
        int i2 = 0;
        InterfaceC22410 interfaceC22410 = null;
        C12532 c12532 = null;
        int i3 = -1651601643;
        int i4 = C1047.f3863;
        int i5 = C1773.f6144;
        int m2566 = (i4 - C0630.m2566("ܳ֫")) * (-107);
        int i6 = ((m2566 ^ i5) * 23087) ^ 1472056255;
        int i7 = 1885140063;
        while (true) {
            i3 = ((((i3 ^ i5) * 19891) >> 31) & i6) ^ (m2566 ^ i7);
            switch (i3) {
                case -2111480856:
                case 1365827939:
                    C1773.m5908();
                    if (C3019.f9544 >= 0) {
                        m2566 = C2105.m6981("ۨ᩶") ^ i5;
                        i6 = ((m2566 ^ i4) * 17059) ^ 553498596;
                        i7 = 1042537547;
                    } else {
                        m2566 = C0630.m2566("ۨ۫") ^ i5;
                        i6 = ((m2566 ^ i4) * 25271) ^ 82233700;
                        i7 = 1789246945;
                    }
                case -2086949132:
                case 1142423828:
                    C2167.m7155();
                    RunnableC3474.m10630();
                    m2566 = C2105.m6981("ۨ᩶") ^ i5;
                    i6 = ((m2566 ^ i4) * 17059) ^ 553498596;
                    i7 = 1042537547;
                case -2060815444:
                case -28534033:
                    if (i2 < i) {
                        m2566 = (C2105.m6981("᩻֡") ^ i5) * 51;
                        i6 = ((m2566 ^ i4) * 43) ^ (-1704232656);
                        i7 = -251040111;
                    } else {
                        m2566 = (i4 - C2105.m6981("ۖ۠")) * 9;
                        i6 = ((m2566 ^ i5) * (-309)) ^ 2099506881;
                        i7 = -422173431;
                    }
                case -1972744350:
                case -1092265535:
                    interfaceC22410 = interfaceC22410Arr[i2];
                    if (interfaceC22410 instanceof C23115) {
                        m2566 = C2105.m6981("ۢۢ") ^ i5;
                        i6 = ((m2566 ^ i4) * (-31381)) ^ 1162980740;
                        i7 = -456066131;
                    } else {
                        m2566 = (C2105.m6981("֡ۧ") ^ i4) * (-109);
                        i6 = ((m2566 ^ i5) * 8797) ^ 1939283770;
                        i7 = -2072548509;
                    }
                case -1383612228:
                case -17543429:
                    C0714.m2809(identityHashMap, c12532, Boolean.TRUE);
                    m2566 = (C2105.m6981("֡ۧ") ^ i4) * (-109);
                    i6 = ((m2566 ^ i5) * 8797) ^ 1939283770;
                    i7 = -2072548509;
                case -1352034502:
                case -801867144:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m2566 = C2105.m6981("᩷ۛ") ^ i4;
                        i6 = ((m2566 ^ i5) * 11869) ^ (-150497788);
                        i7 = -602677426;
                    } else {
                        m2566 = C0630.m2566("ᩴۖ") ^ i4;
                        i6 = ((m2566 ^ i5) * 20089) ^ 18907714;
                        i7 = 1628965929;
                    }
                case -1334845260:
                case 535190174:
                    break;
                case -1140299031:
                case 1937618849:
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = C2105.m6981("۫ܺ") ^ i5;
                        i6 = ((m2566 ^ i4) * (-19061)) ^ (-1313984137);
                        i7 = 1243485173;
                    } else {
                        m2566 = (C0630.m2566("֫ܽ") + i5) * 61;
                        i6 = ((m2566 ^ i4) * 14677) ^ 1474948079;
                        i7 = 486437402;
                    }
                case -1065340535:
                case 860111958:
                    if (C3663.f11553) {
                        m2566 = C0630.m2566("ۨ۫") ^ i5;
                        i6 = ((m2566 ^ i4) * 25271) ^ 82233700;
                        i7 = 1789246945;
                    } else {
                        m2566 = (i4 - C2105.m6981("ܰܽ")) * 71;
                        i6 = ((m2566 ^ i5) * (-23193)) ^ (-1858542291);
                        i7 = -413561131;
                    }
                case -898808293:
                case -51524694:
                    c12532 = ((C23115) interfaceC22410).f74355;
                    if (C1420.f5096 <= 0) {
                        m2566 = C2105.m6981("۫ܺ") ^ i5;
                        i6 = ((m2566 ^ i4) * (-19061)) ^ (-1313984137);
                        i7 = 1243485173;
                    } else {
                        m2566 = C0630.m2566("ۨ᩺") ^ i4;
                        i6 = ((m2566 ^ i5) * 1447) ^ (-491496644);
                        i7 = 553596231;
                    }
                case -840289783:
                case -739150249:
                    if (C4159.m12565() >= 0) {
                        m2566 = C2105.m6981("᩷ۛ") ^ i4;
                        i6 = ((m2566 ^ i5) * 11869) ^ (-150497788);
                        i7 = -602677426;
                    } else {
                        m2566 = (i5 - C2105.m6981("ᩴۗ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((m2566 ^ i4) * 22419) ^ (-1636135791);
                        i7 = 1299795721;
                    }
                case -615498671:
                case 1979667874:
                    if (C5695.f17556 >= 0) {
                        m2566 = C2105.m6981("ۜۧ") ^ i4;
                        i6 = ((m2566 ^ i5) * 3263) ^ 1956145786;
                        i7 = -1143766210;
                    } else {
                        m2566 = C2105.m6981("ۡۧ") ^ i5;
                        i6 = ((m2566 ^ i4) * (-8855)) ^ 1036795071;
                        i7 = -45298809;
                    }
                case -329043038:
                case 885985013:
                    if (C7811.f24123 >= 0) {
                        m2566 = C0630.m2566("ۨ۫") ^ i5;
                        i6 = ((m2566 ^ i4) * 25271) ^ 82233700;
                        i7 = 1789246945;
                    } else {
                        m2566 = (C2105.m6981("᩻ۜ") + i5) * (-17);
                        i6 = ((m2566 ^ i4) * 15917) ^ (-398413777);
                        i7 = -697187697;
                    }
                case -215322548:
                case 2032448903:
                    if (C22628.m50615() != 0) {
                        m2566 = C2105.m6981("ۜۧ") ^ i4;
                        i6 = ((m2566 ^ i5) * 3263) ^ 1956145786;
                        i7 = -1143766210;
                    } else {
                        m2566 = C2105.m6981("ܰۨ") ^ i4;
                        i6 = ((m2566 ^ i5) * 13433) ^ 1239427623;
                        i7 = -33204368;
                    }
                case 110776836:
                case 278809907:
                    C2105.m6982();
                    C4159.m12565();
                    break;
                case 235037512:
                case 1068866898:
                    interfaceC22410Arr = this.f53489;
                    if (RunnableC3474.f10992 <= 0) {
                        m2566 = C2105.m6981("۫ܺ") ^ i5;
                        i6 = ((m2566 ^ i4) * (-19061)) ^ (-1313984137);
                        i7 = 1243485173;
                    } else {
                        m2566 = C0630.m2566("ᩳۗ") ^ i4;
                        i6 = ((m2566 ^ i5) * (-85)) ^ (-58160728);
                        i7 = -688598879;
                    }
                case 706208715:
                case 1688448940:
                    if (C2105.f7037 == 0) {
                        m2566 = C0630.m2566("ۨ۫") ^ i5;
                        i6 = ((m2566 ^ i4) * 25271) ^ 82233700;
                        i7 = 1789246945;
                    } else {
                        m2566 = C2105.m6981("ۜۧ") ^ i4;
                        i6 = ((m2566 ^ i5) * 3263) ^ 1956145786;
                        i7 = -1143766210;
                    }
                case 917200348:
                case 927811658:
                    if (C7811.f24123 >= 0) {
                        m2566 = C2105.m6981("ۨ᩶") ^ i5;
                        i6 = ((m2566 ^ i4) * 17059) ^ 553498596;
                        i7 = 1042537547;
                    } else {
                        m2566 = C2105.m6981("᩷ۛ") ^ i4;
                        i6 = ((m2566 ^ i5) * 11869) ^ (-150497788);
                        i7 = -602677426;
                    }
                case 1188649243:
                case 1206543102:
                    i2++;
                    m2566 = C2105.m6981("֫᩺") ^ i5;
                    i6 = ((m2566 ^ i4) * 5759) ^ 1198661651;
                    i7 = -1416112011;
                case 1342362549:
                case 1485125874:
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = C2105.m6981("ۨ᩶") ^ i5;
                        i6 = ((m2566 ^ i4) * 17059) ^ 553498596;
                        i7 = 1042537547;
                    } else {
                        m2566 = (i4 - C2105.m6981("ۚۙ")) * 97;
                        i6 = ((m2566 ^ i5) * 3163) ^ (-193027009);
                        i7 = 1762429350;
                    }
                default:
                    i = interfaceC22410Arr.length;
                    i2 = 0;
                    m2566 = C2105.m6981("֫᩺") ^ i5;
                    i6 = ((m2566 ^ i4) * 5759) ^ 1198661651;
                    i7 = -1416112011;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x007b, code lost:
    
        if (l.C1773.m5908() <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        if (l.C7811.f24123 < 0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [l.᩹ܽܳ[]] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m40918(java.io.DataOutputStream r26, int r27, int r28, java.util.IdentityHashMap r29) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17513.m40918(java.io.DataOutputStream, int, int, java.util.IdentityHashMap):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40910(int i, int i2, long[] jArr) {
        int m2566;
        int i3;
        int i4;
        int i5;
        int m25662;
        int i6;
        int i7;
        int i8 = -281481033;
        int i9 = C0630.f2410;
        int i10 = C4117.f13076;
        int m25663 = C0630.m2566("۫ܶ") ^ i10;
        int i11 = ((m25663 ^ i9) * 30807) ^ (-1934855635);
        int i12 = m25663 ^ (-399931073);
        long j = 0;
        long j2 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        long j3 = 0;
        int i22 = 0;
        while (true) {
            i8 = i12 ^ (i11 & (((i8 ^ i9) * 10505) >> 31));
            switch (i8) {
                case -2057486992:
                case 1320468184:
                    C3746.m11369();
                    int m6981 = (C2105.m6981("ۘ۬") ^ i9) * (-59);
                    i11 = ((m6981 ^ i10) * 13221) ^ 1276275703;
                    i13 = i13;
                    i12 = m6981 ^ 1441094835;
                case -1785736577:
                case -340959178:
                    i22 = i & i18;
                    if (C3911.f12484 < 0) {
                        m2566 = (i10 - C2105.m6981("᩹᩵")) * (-73);
                        i3 = ((m2566 ^ i9) * (-11801)) ^ 705210755;
                        i4 = 1593181706;
                        i12 = m2566 ^ i4;
                        i11 = i3;
                    }
                    m2566 = (i10 - C0630.m2566("۬ۙ")) * (-35);
                    i3 = ((m2566 ^ i9) * (-21)) ^ 1020858740;
                    i4 = -246308436;
                    i12 = m2566 ^ i4;
                    i11 = i3;
                case -1736908973:
                case 359483023:
                    i19 = 63;
                    if (C1711.f5919) {
                        int m69812 = (C2105.m6981("ۘ۬") ^ i9) * (-59);
                        i11 = ((m69812 ^ i10) * 13221) ^ 1276275703;
                        i13 = i13;
                        i12 = m69812 ^ 1441094835;
                    } else {
                        m2566 = C2105.m6981("ۙܳ") ^ i9;
                        i3 = ((m2566 ^ i10) * (-8177)) ^ 967341470;
                        i4 = 5383025;
                        i12 = m2566 ^ i4;
                        i11 = i3;
                    }
                case -1148506813:
                case 1527443768:
                    if (C2126.m7040()) {
                        m2566 = C2105.m6981("ۜܰ") ^ i10;
                        i3 = ((m2566 ^ i9) * (-27871)) ^ (-1704620426);
                        i4 = 544219571;
                        i12 = m2566 ^ i4;
                        i11 = i3;
                    } else {
                        int m698122 = (C2105.m6981("ۘ۬") ^ i9) * (-59);
                        i11 = ((m698122 ^ i10) * 13221) ^ 1276275703;
                        i13 = i13;
                        i12 = m698122 ^ 1441094835;
                    }
                case -1092563405:
                case 1987468600:
                    i5 = i13;
                    if (i >= i2) {
                        m25662 = C2105.m6981("᩹ۚ") ^ i10;
                        i6 = ((m25662 ^ i9) * 1635) ^ 249144242;
                        i7 = 301712211;
                    } else {
                        m25662 = C0630.m2566("ܺ᩵") ^ i10;
                        i6 = ((m25662 ^ i9) * 9125) ^ 1196926269;
                        i7 = -1528721923;
                    }
                    i11 = i6;
                    int i23 = i5;
                    i12 = m25662 ^ i7;
                    i13 = i23;
                case -1013529719:
                case 528642903:
                    j3 = -1;
                    j = (-1) << i22;
                    if (C2520.f8000 >= 0) {
                        i5 = i13;
                        m25662 = (C2105.m6981("֡᩸") ^ i10) * 55;
                        i6 = ((m25662 ^ i9) * (-459)) ^ (-673845306);
                        i7 = 538808896;
                        i11 = i6;
                        int i232 = i5;
                        i12 = m25662 ^ i7;
                        i13 = i232;
                    } else {
                        m2566 = C0630.m2566("ۗ֡") ^ i10;
                        i3 = ((m2566 ^ i9) * (-16361)) ^ 1053696865;
                        i4 = 1134822786;
                        i12 = m2566 ^ i4;
                        i11 = i3;
                    }
                case -840989994:
                case -740327234:
                    ServiceConnectionC3453.m10564();
                    if (C0714.f2697 >= 0) {
                        i5 = i13;
                        m25662 = (C2105.m6981("֡᩸") ^ i10) * 55;
                        i6 = ((m25662 ^ i9) * (-459)) ^ (-673845306);
                        i7 = 538808896;
                        i11 = i6;
                        int i2322 = i5;
                        i12 = m25662 ^ i7;
                        i13 = i2322;
                    } else {
                        m2566 = (C0630.m2566("ۘۛ") ^ i9) * 47;
                        i3 = ((m2566 ^ i10) * 23495) ^ (-802552017);
                        i4 = 500348392;
                        i12 = m2566 ^ i4;
                        i11 = i3;
                    }
                case -712548738:
                case 929366830:
                    jArr[i14] = jArr[i14] | (j2 & j);
                    break;
                case -550666272:
                case 1947938964:
                    i13 = i14 + 1;
                    if (C3019.f9544 < 0) {
                        m2566 = (C2105.m6981("᩵ۜ") ^ i10) * 23;
                        i3 = ((m2566 ^ i9) * 1237) ^ (-1463892092);
                        i4 = -564388580;
                        i12 = m2566 ^ i4;
                        i11 = i3;
                    }
                    m2566 = (C0630.m2566("ۘۛ") ^ i9) * 47;
                    i3 = ((m2566 ^ i10) * 23495) ^ (-802552017);
                    i4 = 500348392;
                    i12 = m2566 ^ i4;
                    i11 = i3;
                case -435701306:
                case 1524766541:
                    i20 = i15 & i19;
                    if (AbstractC2021.f6743 > 0) {
                        m2566 = C0630.m2566("ܰ۠") ^ i9;
                        i3 = ((m2566 ^ i10) * (-21715)) ^ (-1719695639);
                        i4 = 176914815;
                        i12 = m2566 ^ i4;
                        i11 = i3;
                    }
                    m2566 = C2105.m6981("ۜܰ") ^ i10;
                    i3 = ((m2566 ^ i9) * (-27871)) ^ (-1704620426);
                    i4 = 544219571;
                    i12 = m2566 ^ i4;
                    i11 = i3;
                case -232198879:
                case 495244382:
                    i5 = i13;
                    i14 = i >>> 6;
                    if (C7811.f24123 < 0) {
                        m25662 = C2105.m6981("᩺֨") ^ i9;
                        i6 = ((m25662 ^ i10) * (-4703)) ^ (-1687975995);
                        i7 = 299365483;
                        i11 = i6;
                        int i23222 = i5;
                        i12 = m25662 ^ i7;
                        i13 = i23222;
                    }
                    m25662 = (C2105.m6981("֡᩸") ^ i10) * 55;
                    i6 = ((m25662 ^ i9) * (-459)) ^ (-673845306);
                    i7 = 538808896;
                    i11 = i6;
                    int i232222 = i5;
                    i12 = m25662 ^ i7;
                    i13 = i232222;
                case -150817178:
                case 308844668:
                    Arrays.fill(jArr, i13, i17, j3);
                    jArr[i17] = j2 | jArr[i17];
                    break;
                case -120959257:
                case 1194418805:
                    break;
                case 306331692:
                case 1738641639:
                    i15 = i2 + i21;
                    if (C2105.m6982() != 0) {
                        i16 = 6;
                        int m6981222 = (C2105.m6981("ۘ۬") ^ i9) * (-59);
                        i11 = ((m6981222 ^ i10) * 13221) ^ 1276275703;
                        i13 = i13;
                        i12 = m6981222 ^ 1441094835;
                    } else {
                        int m25664 = (C0630.m2566("ۛۙ") ^ i10) * (-67);
                        i12 = m25664 ^ 1556410769;
                        i11 = ((m25664 ^ i9) * (-31717)) ^ (-1376086246);
                        i16 = 6;
                    }
                case 352570729:
                case 1264853315:
                    i21 = -1;
                    if (C0964.f3626 != 0) {
                        int m69812222 = (C2105.m6981("ۘ۬") ^ i9) * (-59);
                        i11 = ((m69812222 ^ i10) * 13221) ^ 1276275703;
                        i13 = i13;
                        i12 = m69812222 ^ 1441094835;
                    } else {
                        i5 = i13;
                        m25662 = C2105.m6981("᩸ᩴ") ^ i9;
                        i6 = ((m25662 ^ i10) * (-1031)) ^ (-900186370);
                        i7 = 1024602461;
                        i11 = i6;
                        int i2322222 = i5;
                        i12 = m25662 ^ i7;
                        i13 = i2322222;
                    }
                case 490173533:
                case 1346079625:
                    j2 = j3 >>> (63 - i20);
                    if (i14 == i17) {
                        m2566 = C0630.m2566("۫ۨ") ^ i9;
                        i3 = ((m2566 ^ i10) * (-4895)) ^ (-1755529108);
                        i4 = -1892193179;
                    } else {
                        m2566 = (C0630.m2566("ۢ᩻") ^ i9) * (-77);
                        i3 = ((m2566 ^ i10) * (-11457)) ^ 365065765;
                        i4 = -3435529;
                    }
                    i12 = m2566 ^ i4;
                    i11 = i3;
                case 543034723:
                case 1991860416:
                    C22628.m50615();
                    if (RunnableC0588.f2309 >= 0) {
                        int m698122222 = (C2105.m6981("ۘ۬") ^ i9) * (-59);
                        i11 = ((m698122222 ^ i10) * 13221) ^ 1276275703;
                        i13 = i13;
                        i12 = m698122222 ^ 1441094835;
                    } else {
                        i5 = i13;
                        m25662 = (C2105.m6981("֡᩸") ^ i10) * 55;
                        i6 = ((m25662 ^ i9) * (-459)) ^ (-673845306);
                        i7 = 538808896;
                        i11 = i6;
                        int i23222222 = i5;
                        i12 = m25662 ^ i7;
                        i13 = i23222222;
                    }
                case 1187267546:
                case 1974738953:
                    jArr[i14] = j | jArr[i14];
                    if (C0237.f1507 == 0) {
                        m2566 = (C0630.m2566("᩻᩷") + i10) * 25;
                        i3 = ((m2566 ^ i9) * 13131) ^ (-1074696517);
                        i4 = -1523604053;
                        i12 = m2566 ^ i4;
                        i11 = i3;
                    }
                    m2566 = C2105.m6981("ۜܰ") ^ i10;
                    i3 = ((m2566 ^ i9) * (-27871)) ^ (-1704620426);
                    i4 = 544219571;
                    i12 = m2566 ^ i4;
                    i11 = i3;
                case 1283894697:
                case 1289408911:
                    C3746.m11369();
                    break;
                default:
                    i17 = i15 >>> i16;
                    i18 = 63;
                    if (C3911.f12484 < 0) {
                        m2566 = (C0630.m2566("֨ᩴ") ^ i9) * 89;
                        i3 = ((m2566 ^ i10) * 22659) ^ (-704375074);
                        i4 = 313702277;
                        i12 = m2566 ^ i4;
                        i11 = i3;
                    }
                    m2566 = (i10 - C0630.m2566("۬ۙ")) * (-35);
                    i3 = ((m2566 ^ i9) * (-21)) ^ 1020858740;
                    i4 = -246308436;
                    i12 = m2566 ^ i4;
                    i11 = i3;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40917(int i, byte[] bArr, int i2, int i3) {
        InterfaceC22410[] interfaceC22410Arr = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1709831858;
        int i7 = AbstractC2021.f6743;
        int i8 = C1773.f6144;
        int m2566 = C0630.m2566("ᩳ֡") ^ i8;
        int i9 = ((m2566 ^ i7) * (-17325)) ^ 456226982;
        int i10 = 1939624602;
        while (true) {
            i6 = ((((i6 ^ i7) * (-201)) >> 31) & i9) ^ (m2566 ^ i10);
            switch (i6) {
                case -2139580562:
                case -1450589722:
                    if (C3245.m9925() != 0) {
                        m2566 = C0630.m2566("ᩴ᩹") ^ i8;
                        i9 = ((m2566 ^ i7) * (-7399)) ^ (-903546512);
                        i10 = -317499645;
                    } else {
                        m2566 = (C2105.m6981("ܶۖ") ^ i7) * 51;
                        i9 = ((m2566 ^ i8) * (-15119)) ^ (-1061327151);
                        i10 = -51564080;
                    }
                case -2096501148:
                case 1461992449:
                    C9005.m23245(bArr.length, i2, i3);
                    m40913(i, i3);
                    if (i3 == 0) {
                        m2566 = (C0630.m2566("᩶ۚ") ^ i8) * (-7);
                        i9 = ((m2566 ^ i7) * 23643) ^ 7597578;
                        i10 = 1567318726;
                    } else {
                        m2566 = (i8 - C0630.m2566("ܿ֨")) * (-95);
                        i9 = ((m2566 ^ i7) * 27443) ^ (-287749248);
                        i10 = -1489915553;
                    }
                case -1558707921:
                case 2125002557:
                    RunnableC0588.m2441();
                    if (C7811.f24123 < 0) {
                        m2566 = C0630.m2566("ᩴ᩹") ^ i8;
                        i9 = ((m2566 ^ i7) * (-7399)) ^ (-903546512);
                        i10 = -317499645;
                    } else {
                        m2566 = (C0630.m2566("ᩳܶ") + i8) * (-35);
                        i9 = ((m2566 ^ i7) * 30847) ^ (-2113268347);
                        i10 = 1912464091;
                    }
                case -1485919676:
                case 1170753034:
                    if (C3683.f11629 >= 0) {
                        m2566 = (i7 - C2105.m6981("ܶ᩸")) * 63;
                        i9 = ((m2566 ^ i8) * 13919) ^ (-1624562522);
                        i10 = -460075420;
                    } else {
                        m2566 = C0630.m2566("᩷ۢ") ^ i7;
                        i9 = ((m2566 ^ i8) * (-19861)) ^ (-200729574);
                        i10 = 756050544;
                    }
                case -1405058726:
                case -987942548:
                    if (C0714.f2697 >= 0) {
                        m2566 = (i7 - C2105.m6981("ܶ᩸")) * 63;
                        i9 = ((m2566 ^ i8) * 13919) ^ (-1624562522);
                        i10 = -460075420;
                    } else {
                        m2566 = (C0630.m2566("ۡᩳ") ^ i8) * (-119);
                        i9 = ((m2566 ^ i7) * (-13009)) ^ (-170142196);
                        i10 = 315023973;
                    }
                case -1333336554:
                case 658559258:
                    if (i5 < i4) {
                        m2566 = (C0630.m2566("᩺ܳ") ^ i7) * (-99);
                        i9 = ((m2566 ^ i8) * 21569) ^ 348206455;
                        i10 = -913083281;
                    } else {
                        m2566 = (C0630.m2566("᩶ۚ") ^ i8) * (-7);
                        i9 = ((m2566 ^ i7) * 23643) ^ 7597578;
                        i10 = 1567318726;
                    }
                case -1321978618:
                case 1082548434:
                    if (C0714.f2697 >= 0) {
                        m2566 = C0630.m2566("ᩴ᩹") ^ i8;
                        i9 = ((m2566 ^ i7) * (-7399)) ^ (-903546512);
                        i10 = -317499645;
                    } else {
                        m2566 = C0630.m2566("ۗ֫") ^ i7;
                        i9 = ((m2566 ^ i8) * 11853) ^ 576570171;
                        i10 = -85272723;
                    }
                case -1222114085:
                case -442902934:
                    if (C2958.f9394 >= 0) {
                        m2566 = C0630.m2566("ᩴ᩹") ^ i8;
                        i9 = ((m2566 ^ i7) * (-7399)) ^ (-903546512);
                        i10 = -317499645;
                    } else {
                        m2566 = (C0630.m2566("ۨۗ") + i7) * (-59);
                        i9 = ((m2566 ^ i8) * (-3685)) ^ (-434754538);
                        i10 = -1520041835;
                    }
                case -1088542231:
                case -34119449:
                    if (C21923.f70183 != 0) {
                        m2566 = C0630.m2566("ᩴ᩹") ^ i8;
                        i9 = ((m2566 ^ i7) * (-7399)) ^ (-903546512);
                        i10 = -317499645;
                    } else {
                        m2566 = (i8 - C2105.m6981("֨ۜ")) * (-75);
                        i9 = ((m2566 ^ i7) * (-22495)) ^ 2002217757;
                        i10 = 239062776;
                    }
                case -1012041616:
                case 1782646384:
                    C2105.m6982();
                    break;
                case -847212109:
                case 204868886:
                    if (C2272.f7362) {
                        m2566 = (i7 - C2105.m6981("ܶ᩸")) * 63;
                        i9 = ((m2566 ^ i8) * 13919) ^ (-1624562522);
                        i10 = -460075420;
                    } else {
                        m2566 = C0630.m2566("۟᩹") ^ i8;
                        i9 = ((m2566 ^ i7) * (-7211)) ^ 99961412;
                        i10 = 567495390;
                    }
                case -589569460:
                case 2097539881:
                    C0798.m2998();
                    C1047.m3599();
                    m2566 = C0630.m2566("ᩴ᩹") ^ i8;
                    i9 = ((m2566 ^ i7) * (-7399)) ^ (-903546512);
                    i10 = -317499645;
                case -538828255:
                case -363370674:
                    C1294.m4372();
                    if (C1128.m3851() <= 0) {
                        m2566 = C0630.m2566("ᩴ᩹") ^ i8;
                        i9 = ((m2566 ^ i7) * (-7399)) ^ (-903546512);
                        i10 = -317499645;
                    } else {
                        m2566 = (i7 - C0630.m2566("ܿۧ")) * 13;
                        i9 = ((m2566 ^ i8) * (-23095)) ^ 1311167796;
                        i10 = 462974102;
                    }
                case -442440060:
                case 2037088533:
                    break;
                case 74206003:
                case 1944320115:
                    if (C2520.m8026()) {
                        m2566 = (C0630.m2566("ᩳܶ") + i8) * (-35);
                        i9 = ((m2566 ^ i7) * 30847) ^ (-2113268347);
                        i10 = 1912464091;
                    } else {
                        m2566 = C0630.m2566("ᩳۘ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-32365)) ^ 1606700469;
                        i10 = -482424192;
                    }
                case 255830930:
                case 1691859096:
                    interfaceC22410Arr = this.f53489;
                    i4 = interfaceC22410Arr.length;
                    i5 = 0;
                    m2566 = C2105.m6981("ۧۡ") ^ i7;
                    i9 = ((m2566 ^ i8) * (-26407)) ^ (-925570725);
                    i10 = 1911194179;
                case 258917458:
                case 1520345197:
                    if (C1916.f6442) {
                        m2566 = C2105.m6981("ۘۧ") ^ i7;
                        i9 = ((m2566 ^ i8) * (-28455)) ^ (-1917345054);
                        i10 = -14445206;
                    } else {
                        m2566 = (C0630.m2566("ۨۗ") + i7) * (-59);
                        i9 = ((m2566 ^ i8) * (-3685)) ^ (-434754538);
                        i10 = -1520041835;
                    }
                case 594552869:
                case 1562512098:
                    if (C1047.f3863 >= 0) {
                        m2566 = (i7 - C2105.m6981("ܶ᩸")) * 63;
                        i9 = ((m2566 ^ i8) * 13919) ^ (-1624562522);
                        i10 = -460075420;
                    } else {
                        m2566 = (C2105.m6981("᩺۟") ^ i8) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i9 = ((m2566 ^ i7) * 10213) ^ 344379094;
                        i10 = 1378940721;
                    }
                case 1477246536:
                case 2075778744:
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = C0630.m2566("ᩴ᩹") ^ i8;
                        i9 = ((m2566 ^ i7) * (-7399)) ^ (-903546512);
                        i10 = -317499645;
                    } else {
                        m2566 = C0630.m2566("ۧۚ") ^ i7;
                        i9 = ((m2566 ^ i8) * (-17881)) ^ (-2078220278);
                        i10 = 625584931;
                    }
                default:
                    interfaceC22410Arr[i5].mo32102(i, bArr, i + i3, i2);
                    i5++;
                    m2566 = C2105.m6981("ۧۡ") ^ i7;
                    i9 = ((m2566 ^ i8) * (-26407)) ^ (-925570725);
                    i10 = 1911194179;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0161, code lost:
    
        r6 = (l.C2105.m6981("᩸ܽ") ^ r13) * 49;
        r7 = ((r6 ^ r14) * (-14313)) ^ 260060430;
        r8 = -2033173581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005e, code lost:
    
        r18 = r7;
        r19 = r8;
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0180, code lost:
    
        r6 = (l.C0630.m2566("ۚۜ") ^ r14) * (-37);
        r7 = ((r6 ^ r13) * 32153) ^ (-255047113);
        r8 = 823054063;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00a6, code lost:
    
        if (l.C2167.f7158 >= 0) goto L20;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C17513 m40909(byte[] r22, int r23, int[] r24) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17513.m40909(byte[], int, int[]):l.ܿᩳܳ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m40923(int i, int i2) {
        int i3 = 0;
        InterfaceC22410[] interfaceC22410Arr = null;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 893447992;
        int i7 = C2958.f9394;
        int i8 = C4075.f12947;
        int m2566 = (i7 - C0630.m2566("ۙ֨")) * 127;
        int i9 = ((m2566 ^ i8) * 31311) ^ (-1559634012);
        int i10 = 1771354378;
        while (true) {
            i6 = ((((i6 ^ i8) * 20325) >> 31) & i9) ^ (m2566 ^ i10);
            switch (i6) {
                case -2128884177:
                case -1889073579:
                    return true;
                case -1846067910:
                case 1600550340:
                    C3683.m11222();
                    C0798.m2998();
                    m2566 = (C0630.m2566("ܿܶ") + i7) * (-125);
                    i9 = ((m2566 ^ i8) * (-10369)) ^ (-596523903);
                    i10 = 563128103;
                case -1739867831:
                case -939248499:
                    C7106.m19120();
                    if (C1504.m5179()) {
                        m2566 = (C0630.m2566("ܿܶ") + i7) * (-125);
                        i9 = ((m2566 ^ i8) * (-10369)) ^ (-596523903);
                        i10 = 563128103;
                    } else {
                        m2566 = (i8 - C0630.m2566("֡۬")) * 17;
                        i9 = ((m2566 ^ i7) * (-29065)) ^ (-1476132365);
                        i10 = 1506250440;
                    }
                case -1524515709:
                case 462725973:
                    if (C0714.m2805()) {
                        m2566 = (C2105.m6981("۫ܽ") ^ i8) * (-31);
                        i9 = ((m2566 ^ i7) * (-13339)) ^ (-660931066);
                        i10 = 638592807;
                    } else {
                        m2566 = (i8 - C0630.m2566("֡۬")) * 17;
                        i9 = ((m2566 ^ i7) * (-29065)) ^ (-1476132365);
                        i10 = 1506250440;
                    }
                case -1411816133:
                case 235282023:
                    if (C3911.f12484 >= 0) {
                        m2566 = (C0630.m2566("ܿܶ") + i7) * (-125);
                        i9 = ((m2566 ^ i8) * (-10369)) ^ (-596523903);
                        i10 = 563128103;
                    } else {
                        m2566 = C2105.m6981("᩶ۤ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-4153)) ^ 2118817013;
                        i10 = -819660121;
                    }
                case -1349899003:
                case -405135133:
                    if (C2126.m7040()) {
                        m2566 = C2105.m6981("۬֨") ^ i7;
                        i9 = ((m2566 ^ i8) * (-19097)) ^ 1368798081;
                        i10 = 1835646946;
                    } else {
                        m2566 = (C0630.m2566("ᩴܶ") ^ i7) * 19;
                        i9 = ((m2566 ^ i8) * (-13393)) ^ (-2107903259);
                        i10 = 1065737384;
                    }
                case -1322157238:
                case 2018112721:
                    if (C2272.m7503()) {
                        m2566 = (C0630.m2566("ۘۖ") + i8) * (-111);
                        i9 = ((m2566 ^ i7) * 30065) ^ (-1283521069);
                        i10 = -528508041;
                    } else {
                        m2566 = C0630.m2566("ۨ᩸") ^ i8;
                        i9 = ((m2566 ^ i7) * 11303) ^ (-250547044);
                        i10 = -880797067;
                    }
                case -879392998:
                case 1525815309:
                    if (C2272.f7362) {
                        m2566 = (i8 - C0630.m2566("֡۬")) * 17;
                        i9 = ((m2566 ^ i7) * (-29065)) ^ (-1476132365);
                        i10 = 1506250440;
                    } else {
                        m2566 = (C2105.m6981("ۜ᩺") ^ i7) * (-5);
                        i9 = ((m2566 ^ i8) * 20431) ^ (-463815135);
                        i10 = -1967196856;
                    }
                case -851203281:
                case -129591304:
                    if (interfaceC22410Arr[i5].mo32105(i, i3)) {
                        m2566 = (C2105.m6981("ۗᩳ") + i8) * (-39);
                        i9 = ((m2566 ^ i7) * 4707) ^ 1922324595;
                        i10 = -1231227551;
                    } else {
                        m2566 = C2105.m6981("۠ۢ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-29651)) ^ 168498211;
                        i10 = -2061731035;
                    }
                case -707267072:
                case 1472703989:
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        m2566 = (C0630.m2566("ܿܶ") + i7) * (-125);
                        i9 = ((m2566 ^ i8) * (-10369)) ^ (-596523903);
                        i10 = 563128103;
                    } else {
                        m2566 = C2105.m6981("᩺֫") ^ i7;
                        i9 = ((m2566 ^ i8) * (-20967)) ^ 288029680;
                        i10 = -1438149342;
                    }
                case -694964106:
                case -229971374:
                    if (C0964.f3626 != 0) {
                        m2566 = C2105.m6981("᩺֫") ^ i7;
                        i9 = ((m2566 ^ i8) * (-20967)) ^ 288029680;
                        i10 = -1438149342;
                    } else {
                        m2566 = C2105.m6981("ۡ᩻") ^ i7;
                        i9 = ((m2566 ^ i8) * (-14909)) ^ 427274313;
                        i10 = 1342409134;
                    }
                case -200678091:
                case 1928090034:
                    if (i5 < i4) {
                        m2566 = (C2105.m6981("۬֡") ^ i7) * (-109);
                        i9 = ((m2566 ^ i8) * (-19627)) ^ (-1334291615);
                        i10 = 1489353470;
                    } else {
                        m2566 = (C0630.m2566("ۧ᩹") + i7) * (-19);
                        i9 = ((m2566 ^ i8) * 6421) ^ 562564429;
                        i10 = -506754331;
                    }
                case -110202749:
                case 6018113:
                    if (C4263.m12819() < 0) {
                        m2566 = C2105.m6981("᩺֫") ^ i7;
                        i9 = ((m2566 ^ i8) * (-20967)) ^ 288029680;
                        i10 = -1438149342;
                    } else {
                        m2566 = C2105.m6981("۬֨") ^ i7;
                        i9 = ((m2566 ^ i8) * (-19097)) ^ 1368798081;
                        i10 = 1835646946;
                    }
                case 131736714:
                case 2106595148:
                    interfaceC22410Arr = this.f53489;
                    i4 = interfaceC22410Arr.length;
                    z = false;
                    i5 = 0;
                    m2566 = (C0630.m2566("ܰۗ") ^ i8) * (-81);
                    i9 = ((m2566 ^ i7) * 6251) ^ (-66194235);
                    i10 = 787367652;
                case 168940140:
                case 798778544:
                    return z;
                case 190685933:
                case 393202927:
                    m40913(i, i2);
                    i3 = i2 + i;
                    if (C1773.f6144 <= 0) {
                        m2566 = (C0630.m2566("ۘۖ") + i8) * (-111);
                        i9 = ((m2566 ^ i7) * 30065) ^ (-1283521069);
                        i10 = -528508041;
                    } else {
                        m2566 = (i7 - C0630.m2566("ۧۛ")) * 5;
                        i9 = ((m2566 ^ i8) * (-4461)) ^ (-1340613133);
                        i10 = -831270843;
                    }
                case 222803711:
                case 687248981:
                    i5++;
                    m2566 = (C0630.m2566("ܰۗ") ^ i8) * (-81);
                    i9 = ((m2566 ^ i7) * 6251) ^ (-66194235);
                    i10 = 787367652;
                case 419698306:
                case 1813690221:
                    C1504.m5179();
                    return false;
                case 1091140952:
                case 1138490173:
                    if (C3432.f10845 >= 0) {
                        m2566 = (C0630.m2566("ܿܶ") + i7) * (-125);
                        i9 = ((m2566 ^ i8) * (-10369)) ^ (-596523903);
                        i10 = 563128103;
                    } else {
                        m2566 = (i8 - C0630.m2566("ۨᩴ")) * (-65);
                        i9 = ((m2566 ^ i7) * 3533) ^ (-236933627);
                        i10 = 1987200859;
                    }
                case 1199362129:
                case 1504456387:
                    if (C0964.m3413()) {
                        m2566 = C2105.m6981("ۙ᩹") ^ i7;
                        i9 = ((m2566 ^ i8) * 30953) ^ 900118716;
                        i10 = 1142116125;
                    } else {
                        m2566 = C2105.m6981("᩺֫") ^ i7;
                        i9 = ((m2566 ^ i8) * (-20967)) ^ 288029680;
                        i10 = -1438149342;
                    }
                default:
                    if (C1711.m5736() <= 0) {
                        m2566 = (i8 - C0630.m2566("֡۬")) * 17;
                        i9 = ((m2566 ^ i7) * (-29065)) ^ (-1476132365);
                        i10 = 1506250440;
                    } else {
                        m2566 = (i8 - C0630.m2566("֫ܶ")) * 127;
                        i9 = ((m2566 ^ i7) * (-17475)) ^ 505767442;
                        i10 = 1124678512;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0066, code lost:
    
        if (l.C2958.f9394 >= 0) goto L17;
     */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m40913(int r19, int r20) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17513.m40913(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0088, code lost:
    
        if (l.C4263.f13799 > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008d, code lost:
    
        if (l.C2126.f7087 != false) goto L16;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C17513 m40905(int r32, l.InterfaceC22410[] r33) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17513.m40905(int, l.᩹ܽܳ[]):l.ܿᩳܳ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static IOException m40912(String str) {
        int m2566;
        int i;
        int i2;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1710833034;
        int i8 = RunnableC1937.f6483;
        int i9 = C1294.f4556;
        int m25662 = (i8 - C0630.m2566("ܺۚ")) * 71;
        int i10 = ((m25662 ^ i9) * 13543) ^ 2046762936;
        int i11 = -1652175655;
        while (true) {
            int i12 = m25662 ^ i11;
            while (true) {
                i7 = ((((i7 ^ i9) * (-17791)) >> 31) & i10) ^ i12;
                switch (i7) {
                    case -1860252500:
                    case -1214060809:
                        c = 549;
                        if (C4117.f13076 > 0) {
                            m2566 = C0630.m2566("֨ܰ") ^ i8;
                            i = ((m2566 ^ i9) * 18595) ^ 2124607715;
                            i2 = 1174145418;
                            i12 = m2566 ^ i2;
                            i10 = i;
                        }
                        m2566 = (C0630.m2566("۠ۤ") + i8) * 77;
                        i = ((m2566 ^ i9) * 15409) ^ (-1160018380);
                        i2 = -1892066094;
                        i12 = m2566 ^ i2;
                        i10 = i;
                    case -1599523367:
                    case 1460866244:
                        RunnableC1937.m6387();
                        return null;
                    case -1403896071:
                    case -1227141194:
                        C1916.m6308();
                        if (C3683.f11629 >= 0) {
                            break;
                        }
                        m2566 = (i9 - C2105.m6981("ۙ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((m2566 ^ i8) * 31719) ^ 483791025;
                        i2 = -2042010606;
                        i12 = m2566 ^ i2;
                        i10 = i;
                        break;
                    case -1212083282:
                    case 235527666:
                        if ((i5 + 1) - i4 > 0) {
                            m2566 = C2105.m6981("ܿۚ") ^ i9;
                            i = ((m2566 ^ i8) * 4147) ^ 1965403317;
                            i2 = 1537747922;
                        } else {
                            m2566 = (C2105.m6981("᩵ۨ") + i8) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                            i = ((m2566 ^ i9) * (-23317)) ^ 1132642418;
                            i2 = -2068438770;
                        }
                        i12 = m2566 ^ i2;
                        i10 = i;
                    case -1068444551:
                    case -190809470:
                        i6 = 58006;
                        m2566 = C0630.m2566("֫ܺ") ^ i8;
                        i = ((m2566 ^ i9) * 9645) ^ 286285096;
                        i2 = -716623185;
                        i12 = m2566 ^ i2;
                        i10 = i;
                    case -954384736:
                    case -220496017:
                        i5 = s * s2;
                        if (C2105.f7037 == 0) {
                            m2566 = C2105.m6981("ۡ֫") ^ i9;
                            i = ((m2566 ^ i8) * 131) ^ (-1957306595);
                            i2 = -1593724621;
                            i12 = m2566 ^ i2;
                            i10 = i;
                        }
                        m2566 = (i9 - C2105.m6981("ۙ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((m2566 ^ i8) * 31719) ^ 483791025;
                        i2 = -2042010606;
                        i12 = m2566 ^ i2;
                        i10 = i;
                    case -844083984:
                    case -736141272:
                        s = sArr[c];
                        if (C2105.f7037 == 0) {
                            m2566 = C2105.m6981("ܳ᩹") ^ i9;
                            i = ((m2566 ^ i8) * (-20535)) ^ (-691724844);
                            i2 = -822045858;
                            i12 = m2566 ^ i2;
                            i10 = i;
                        }
                        m2566 = (C0630.m2566("۠ۤ") + i8) * 77;
                        i = ((m2566 ^ i9) * 15409) ^ (-1160018380);
                        i2 = -1892066094;
                        i12 = m2566 ^ i2;
                        i10 = i;
                    case -467047940:
                    case -394850209:
                        sArr = f53487;
                        if (AbstractC2021.f6743 > 0) {
                            m2566 = C0630.m2566("۬۫") ^ i9;
                            i = ((m2566 ^ i8) * (-16991)) ^ 678116233;
                            i2 = 1481214823;
                            i12 = m2566 ^ i2;
                            i10 = i;
                        }
                        m2566 = (C0630.m2566("ۨۤ") ^ i8) * (-55);
                        i = ((m2566 ^ i9) * 5147) ^ (-1392733968);
                        i2 = 518087344;
                        i12 = m2566 ^ i2;
                        i10 = i;
                    case -357973923:
                    case 1861554180:
                        C1773.m5908();
                        C2520.m8026();
                        break;
                    case -229282043:
                    case 1647220122:
                        if (!C2272.f7362) {
                            break;
                        }
                        m2566 = (C0630.m2566("۠ۤ") + i8) * 77;
                        i = ((m2566 ^ i9) * 15409) ^ (-1160018380);
                        i2 = -1892066094;
                        i12 = m2566 ^ i2;
                        i10 = i;
                        break;
                    case -146677709:
                    case 1054167684:
                        if (RunnableC1937.m6387() == 0) {
                            m2566 = C0630.m2566("ۡۘ") ^ i8;
                            i = ((m2566 ^ i9) * 9925) ^ 1325381557;
                            i2 = 641852874;
                            i12 = m2566 ^ i2;
                            i10 = i;
                        }
                        m2566 = C2105.m6981("۠ᩴ") ^ i9;
                        i = ((m2566 ^ i8) * 21835) ^ (-1419877965);
                        i2 = -1379532723;
                        i12 = m2566 ^ i2;
                        i10 = i;
                    case -80432331:
                    case 347415984:
                        i4 = i3 * i3;
                        s2 = 2;
                        if (C3746.f11829 > 0) {
                            m2566 = (i8 - C2105.m6981("᩸ۜ")) * (-45);
                            i = ((m2566 ^ i9) * (-28807)) ^ 933413662;
                            i2 = -1667364718;
                            i12 = m2566 ^ i2;
                            i10 = i;
                        }
                        m2566 = (C0630.m2566("ۨۤ") ^ i8) * (-55);
                        i = ((m2566 ^ i9) * 5147) ^ (-1392733968);
                        i2 = 518087344;
                        i12 = m2566 ^ i2;
                        i10 = i;
                    case 47077874:
                    case 188735206:
                        if (C1005.f3721) {
                            m2566 = (C0630.m2566("ۨۤ") ^ i8) * (-55);
                            i = ((m2566 ^ i9) * 5147) ^ (-1392733968);
                            i2 = 518087344;
                            i12 = m2566 ^ i2;
                            i10 = i;
                        }
                        m2566 = (i9 - C2105.m6981("ۙ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i = ((m2566 ^ i8) * 31719) ^ 483791025;
                        i2 = -2042010606;
                        i12 = m2566 ^ i2;
                        i10 = i;
                    case 403760883:
                    case 707321071:
                        i6 = 27200;
                        m2566 = C0630.m2566("֫ܺ") ^ i8;
                        i = ((m2566 ^ i9) * 9645) ^ 286285096;
                        i2 = -716623185;
                        i12 = m2566 ^ i2;
                        i10 = i;
                    case 1611193555:
                    case 1759673624:
                        i3 = s + 1;
                        if (AbstractC2021.f6743 > 0) {
                            m2566 = (C0630.m2566("ܳܳ") + i9) * (-101);
                            i = ((m2566 ^ i8) * (-19285)) ^ 200376964;
                            i2 = 167874076;
                            i12 = m2566 ^ i2;
                            i10 = i;
                        }
                        m2566 = C2105.m6981("۠ᩴ") ^ i9;
                        i = ((m2566 ^ i8) * 21835) ^ (-1419877965);
                        i2 = -1379532723;
                        i12 = m2566 ^ i2;
                        i10 = i;
                    default:
                        short[] sArr2 = f53487;
                        if (C1128.f4106 > 0) {
                            if (C1294.f4556 < 0) {
                                if (C1420.f5096 > 0) {
                                    return new IOException(C20094.m46315(C2126.m7036(sArr2, 550, 24, i6), str));
                                }
                            }
                            m2566 = (i9 - C2105.m6981("ۙ۬")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                            i = ((m2566 ^ i8) * 31719) ^ 483791025;
                            i2 = -2042010606;
                            i12 = m2566 ^ i2;
                            i10 = i;
                        }
                        m2566 = (C0630.m2566("۠ۤ") + i8) * 77;
                        i = ((m2566 ^ i9) * 15409) ^ (-1160018380);
                        i2 = -1892066094;
                        i12 = m2566 ^ i2;
                        i10 = i;
                }
            }
            m25662 = (i9 - C0630.m2566("ܰ᩹")) * 27;
            i10 = ((m25662 ^ i8) * (-31937)) ^ (-805255399);
            i11 = 583264018;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40900(int i, int[] iArr) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1936110353;
        int i8 = RunnableC1937.f6483;
        int i9 = C3019.f9544;
        int m6981 = (i9 - C2105.m6981("᩶۟")) * 63;
        int i10 = ((m6981 ^ i8) * 22411) ^ (-1773872245);
        int i11 = 1297164254;
        while (true) {
            i7 = ((((i7 ^ i8) * (-10931)) >> 31) & i10) ^ (m6981 ^ i11);
            switch (i7) {
                case -1917601776:
                case 2129525132:
                    if (C0237.m1481() >= 0) {
                        m6981 = (C2105.m6981("ۢ᩻") + i8) * (-117);
                        i10 = ((m6981 ^ i9) * 4257) ^ 759079975;
                        i11 = 2118338202;
                    } else {
                        m6981 = (C0630.m2566("ۢܽ") + i9) * (-49);
                        i10 = ((m6981 ^ i8) * 21991) ^ (-144754632);
                        i11 = -461299971;
                    }
                case -1361951796:
                case -281854449:
                    i6 = i4 >>> i5;
                    if (iArr[i6] < i) {
                        m6981 = (i8 - C0630.m2566("ᩳ᩵")) * (-99);
                        i10 = ((m6981 ^ i9) * 11625) ^ 1836304749;
                        i11 = -386899473;
                    } else {
                        i3 = i6;
                        m6981 = (C0630.m2566("۫ۛ") + i8) * 115;
                        i10 = ((m6981 ^ i9) * 22671) ^ 1507658984;
                        i11 = -1226162752;
                    }
                case -1350101001:
                case 638613204:
                    if (C1005.f3721) {
                        m6981 = (C0630.m2566("ۘܽ") + i8) * (-55);
                        i10 = ((m6981 ^ i9) * (-8219)) ^ 1619549866;
                        i11 = 440250347;
                    } else {
                        m6981 = (C2105.m6981("ۢ᩻") + i8) * (-117);
                        i10 = ((m6981 ^ i9) * 4257) ^ 759079975;
                        i11 = 2118338202;
                    }
                case -1342002173:
                case 1751751106:
                    if (C0237.f1507 != 0) {
                        m6981 = C0630.m2566("֨᩶") ^ i8;
                        i10 = ((m6981 ^ i9) * (-32517)) ^ (-1540575419);
                        i11 = -667632832;
                    } else {
                        m6981 = C0630.m2566("ۖܶ") ^ i9;
                        i10 = ((m6981 ^ i8) * (-29599)) ^ 1702224537;
                        i11 = 1109804327;
                    }
                case -1296581467:
                case 1430025419:
                    i3 = iArr.length;
                    i2 = 0;
                    m6981 = (C0630.m2566("۫ۛ") + i8) * 115;
                    i10 = ((m6981 ^ i9) * 22671) ^ 1507658984;
                    i11 = -1226162752;
                case -1108982612:
                case 95333557:
                    if (C3683.m11222()) {
                        m6981 = (C2105.m6981("֫ۤ") + i9) * 21;
                        i10 = ((m6981 ^ i8) * 21871) ^ (-1230220891);
                        i11 = -1120818923;
                    } else {
                        m6981 = (C0630.m2566("ۨ֨") ^ i9) * 37;
                        i10 = ((m6981 ^ i8) * 30107) ^ (-353139725);
                        i11 = -1813148679;
                    }
                case -1015094744:
                case 1294822260:
                    RunnableC1108.m3790();
                    C7106.m19120();
                    return 0;
                case -990474870:
                case 1317854823:
                    return i2;
                case -953636664:
                case 179079738:
                    if (C21923.f70183 != 0) {
                        m6981 = C0630.m2566("֨᩶") ^ i8;
                        i10 = ((m6981 ^ i9) * (-32517)) ^ (-1540575419);
                        i11 = -667632832;
                    } else {
                        m6981 = (C0630.m2566("ܳۛ") + i8) * 35;
                        i10 = ((m6981 ^ i9) * 9349) ^ 1215274030;
                        i11 = -1231960319;
                    }
                case -884787918:
                case 2128110407:
                    i2 = i6 + 1;
                    m6981 = (C0630.m2566("۫ۛ") + i8) * 115;
                    i10 = ((m6981 ^ i9) * 22671) ^ 1507658984;
                    i11 = -1226162752;
                case -876778743:
                case 720937476:
                    if (C1294.m4372() <= 0) {
                        m6981 = (C2105.m6981("۫ۙ") ^ i9) * (-79);
                        i10 = ((m6981 ^ i8) * 19909) ^ 8011312;
                        i11 = -1410831550;
                    } else {
                        m6981 = (i9 - C2105.m6981("֡֨")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((m6981 ^ i8) * 12565) ^ 62093363;
                        i11 = -527505498;
                    }
                case -126695665:
                case 97186351:
                    i4 = i2 + i3;
                    i5 = 1;
                    if (C0050.f910 >= 0) {
                        m6981 = (C2105.m6981("֫ۤ") + i9) * 21;
                        i10 = ((m6981 ^ i8) * 21871) ^ (-1230220891);
                        i11 = -1120818923;
                    } else {
                        m6981 = (C0630.m2566("ۗᩴ") ^ i9) * 15;
                        i10 = ((m6981 ^ i8) * (-2699)) ^ (-1427329218);
                        i11 = 54931276;
                    }
                case 14594588:
                case 1484412776:
                    AbstractC2021.m6574();
                    if (C21923.f70183 == 0) {
                        m6981 = (C2105.m6981("ۢ᩻") + i8) * (-117);
                        i10 = ((m6981 ^ i9) * 4257) ^ 759079975;
                        i11 = 2118338202;
                    } else {
                        m6981 = (C0630.m2566("ۧ֡") + i9) * 77;
                        i10 = ((m6981 ^ i8) * 29823) ^ 36532352;
                        i11 = 239699000;
                    }
                case 279471172:
                case 1059755790:
                    if (i2 < i3) {
                        m6981 = (C0630.m2566("᩻᩶") ^ i8) * 9;
                        i10 = ((m6981 ^ i9) * (-10255)) ^ (-1118722983);
                        i11 = -661138186;
                    } else {
                        m6981 = C0630.m2566("ᩳۘ") ^ i9;
                        i10 = ((m6981 ^ i8) * 7991) ^ 341813316;
                        i11 = -1557238446;
                    }
                case 473651261:
                case 883180839:
                    if (C0798.f2919) {
                        m6981 = C0630.m2566("֨᩶") ^ i8;
                        i10 = ((m6981 ^ i9) * (-32517)) ^ (-1540575419);
                        i11 = -667632832;
                    } else {
                        m6981 = C2105.m6981("֨۫") ^ i9;
                        i10 = ((m6981 ^ i8) * (-32465)) ^ 1868527589;
                        i11 = 713660283;
                    }
                case 738228551:
                case 1154953943:
                    if (C7106.f21815 != 0) {
                        m6981 = C0630.m2566("֨᩶") ^ i8;
                        i10 = ((m6981 ^ i9) * (-32517)) ^ (-1540575419);
                        i11 = -667632832;
                    } else {
                        m6981 = (C0630.m2566("ܽۡ") + i8) * 39;
                        i10 = ((m6981 ^ i9) * 20825) ^ (-236298242);
                        i11 = 1194836814;
                    }
                case 741221691:
                case 1872031213:
                    C2272.m7503();
                    if (C3245.f10203 > 0) {
                        m6981 = (C2105.m6981("֫ۤ") + i9) * 21;
                        i10 = ((m6981 ^ i8) * 21871) ^ (-1230220891);
                        i11 = -1120818923;
                    } else {
                        m6981 = C0630.m2566("֨᩶") ^ i8;
                        i10 = ((m6981 ^ i9) * (-32517)) ^ (-1540575419);
                        i11 = -667632832;
                    }
                case 1238871460:
                case 1748826749:
                    C0714.m2805();
                    C1711.m5736();
                    m6981 = (C2105.m6981("֫ۤ") + i9) * 21;
                    i10 = ((m6981 ^ i8) * 21871) ^ (-1230220891);
                    i11 = -1120818923;
                case 1837359202:
                case 2005995194:
                    C0050.m940();
                    if (C2958.f9394 >= 0) {
                        m6981 = C0630.m2566("֨᩶") ^ i8;
                        i10 = ((m6981 ^ i9) * (-32517)) ^ (-1540575419);
                        i11 = -667632832;
                    } else {
                        m6981 = (C2105.m6981("ۢ᩻") + i8) * (-117);
                        i10 = ((m6981 ^ i9) * 4257) ^ 759079975;
                        i11 = 2118338202;
                    }
                default:
                    if (C4263.m12819() >= 0) {
                        m6981 = (C0630.m2566("ۧ֡") + i9) * 77;
                        i10 = ((m6981 ^ i8) * 29823) ^ 36532352;
                        i11 = 239699000;
                    } else {
                        m6981 = (C0630.m2566("۠ۡ") ^ i8) * 7;
                        i10 = ((m6981 ^ i9) * (-12873)) ^ (-435287494);
                        i11 = -1789095953;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x014e, code lost:
    
        if (l.C1005.m3501() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0150, code lost:
    
        r35 = r3;
        r36 = r6;
        r42 = r11;
        r38 = r12;
        r12 = r22;
        r8 = r24;
        r39 = r27;
        r46 = r51;
        r34 = r53;
        r28 = r0;
        r27 = r2;
        r24 = r10;
        r0 = r20;
        r10 = r26;
        r20 = r5;
        r5 = r7;
        r6 = r49;
        r48 = r16;
        r16 = r25;
        r25 = r9;
        r9 = r21;
        r21 = r29;
        r29 = r33;
        r33 = r1;
        r1 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02b2, code lost:
    
        if (l.C2167.f7158 < 0) goto L28;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C17513 m40906(java.io.DataInput r56, int r57, int r58, l.C12532[] r59, l.C17307 r60) {
        /*
            Method dump skipped, instructions count: 6122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17513.m40906(java.io.DataInput, int, int, l.۫ܽܳ[], l.ܿۧܳ):l.ܿᩳܳ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40911(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1625898685;
        int i10 = RunnableC3474.f10992;
        int i11 = C3911.f12484;
        int m2566 = (C0630.m2566("֡ܰ") ^ i10) * (-15);
        int i12 = ((m2566 ^ i11) * (-23899)) ^ 1026659712;
        int i13 = -167129687;
        while (true) {
            i9 = ((((i9 ^ i11) * 15949) >> 31) & i12) ^ (m2566 ^ i13);
            switch (i9) {
                case -2054809187:
                case 1999769099:
                    if (C2958.f9394 >= 0) {
                        m2566 = C0630.m2566("֫ۗ") ^ i10;
                        i12 = ((m2566 ^ i11) * (-25063)) ^ (-837205236);
                        i13 = 2016752471;
                    } else {
                        m2566 = (i11 - C0630.m2566("۫ۜ")) * 127;
                        i12 = ((m2566 ^ i10) * 14821) ^ 1869291850;
                        i13 = -1158348840;
                    }
                case -2027073291:
                case -30378601:
                    if (RunnableC0588.f2309 >= 0) {
                        m2566 = C0630.m2566("ܶۗ") ^ i11;
                        i12 = ((m2566 ^ i10) * (-29809)) ^ (-617031595);
                        i13 = -1379913447;
                    } else {
                        m2566 = C2105.m6981("ᩴ᩶") ^ i11;
                        i12 = ((m2566 ^ i10) * (-2739)) ^ (-1777022207);
                        i13 = -354768387;
                    }
                case -2027022487:
                case -1697559278:
                    if (i5 < i4) {
                        m2566 = (C2105.m6981("ܽܶ") + i10) * 95;
                        i12 = ((m2566 ^ i11) * 30645) ^ 490224798;
                        i13 = 501883367;
                    } else {
                        i6 = i4;
                        m2566 = (C2105.m6981("᩹ۛ") ^ i11) * (-53);
                        i12 = ((m2566 ^ i10) * 8737) ^ (-49375484);
                        i13 = 2099443512;
                    }
                case -1815466113:
                case -1473841111:
                    if (C0382.f1805) {
                        m2566 = (i11 - C0630.m2566("ܽܽ")) * 93;
                        i12 = ((m2566 ^ i10) * 25049) ^ 1583929705;
                        i13 = 882757980;
                    } else {
                        m2566 = C0630.m2566("ܶۗ") ^ i11;
                        i12 = ((m2566 ^ i10) * (-29809)) ^ (-617031595);
                        i13 = -1379913447;
                    }
                case -1348607213:
                case 748319646:
                    i4 = C2272.m7501(bArr.length, i3);
                    i5 = 0;
                    m2566 = C0630.m2566("᩵᩷") ^ i10;
                    i12 = ((m2566 ^ i11) * (-6873)) ^ 1858744973;
                    i13 = -80163299;
                case -1304655481:
                case 785491112:
                    if (C0237.f1507 == 0) {
                        m2566 = (C0630.m2566("ܿ᩵") ^ i11) * 71;
                        i12 = ((m2566 ^ i10) * (-2839)) ^ 1898914156;
                        i13 = 1775968164;
                    } else {
                        m2566 = C0630.m2566("֫ۗ") ^ i10;
                        i12 = ((m2566 ^ i11) * (-25063)) ^ (-837205236);
                        i13 = 2016752471;
                    }
                case -1288421863:
                case 205177194:
                    if (C1773.f6144 <= 0) {
                        m2566 = (C0630.m2566("ܿ᩵") ^ i11) * 71;
                        i12 = ((m2566 ^ i10) * (-2839)) ^ 1898914156;
                        i13 = 1775968164;
                    } else {
                        m2566 = C2105.m6981("ۨۤ") ^ i10;
                        i12 = ((m2566 ^ i11) * (-13011)) ^ (-579797598);
                        i13 = -909317768;
                    }
                case -1253361077:
                case -565637640:
                    if (C5695.f17556 >= 0) {
                        m2566 = C0630.m2566("ܶۗ") ^ i11;
                        i12 = ((m2566 ^ i10) * (-29809)) ^ (-617031595);
                        i13 = -1379913447;
                    } else {
                        m2566 = C2105.m6981("᩷۫") ^ i10;
                        i12 = ((m2566 ^ i11) * (-1407)) ^ 804459503;
                        i13 = 1512405077;
                    }
                case -1107283511:
                case 1691264728:
                    if (RunnableC1108.f4040) {
                        m2566 = C2105.m6981("ۡۧ") ^ i10;
                        i12 = ((m2566 ^ i11) * 10359) ^ 1290055440;
                        i13 = -1613077476;
                    } else {
                        m2566 = (C2105.m6981("ᩳۘ") + i10) * (-77);
                        i12 = ((m2566 ^ i11) * (-4983)) ^ 1551033136;
                        i13 = -549746232;
                    }
                case -726834723:
                case 1365540600:
                    if (C0422.f1886 <= 0) {
                        m2566 = (C2105.m6981("ᩳۘ") + i10) * (-77);
                        i12 = ((m2566 ^ i11) * (-4983)) ^ 1551033136;
                        i13 = -549746232;
                    } else {
                        m2566 = C0630.m2566("۠۫") ^ i11;
                        i12 = ((m2566 ^ i10) * (-22943)) ^ 1877916766;
                        i13 = -898004608;
                    }
                case -626940401:
                case 1260646765:
                    C2272.m7503();
                    break;
                case -605133439:
                case -438961573:
                    break;
                case -546817646:
                case 1075152066:
                    bArr2[i7] = bArr[i8];
                    i5++;
                    m2566 = C0630.m2566("᩵᩷") ^ i10;
                    i12 = ((m2566 ^ i11) * (-6873)) ^ 1858744973;
                    i13 = -80163299;
                case -541973585:
                case 1003261612:
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = C0630.m2566("֫ۗ") ^ i10;
                        i12 = ((m2566 ^ i11) * (-25063)) ^ (-837205236);
                        i13 = 2016752471;
                    } else {
                        m2566 = C0630.m2566("ۙܺ") ^ i11;
                        i12 = ((m2566 ^ i10) * (-15373)) ^ 261039757;
                        i13 = -1848511585;
                    }
                case 434063478:
                case 1308244334:
                    if (C4075.f12947 >= 0) {
                        m2566 = C0630.m2566("ܶۗ") ^ i11;
                        i12 = ((m2566 ^ i10) * (-29809)) ^ (-617031595);
                        i13 = -1379913447;
                    } else {
                        m2566 = (C0630.m2566("ܿ᩵") ^ i11) * 71;
                        i12 = ((m2566 ^ i10) * (-2839)) ^ 1898914156;
                        i13 = 1775968164;
                    }
                case 817293028:
                case 981969179:
                    if (C3019.f9544 >= 0) {
                        m2566 = C0630.m2566("֫ۗ") ^ i10;
                        i12 = ((m2566 ^ i11) * (-25063)) ^ (-837205236);
                        i13 = 2016752471;
                    } else {
                        m2566 = (C0630.m2566("۫֡") ^ i10) * (-113);
                        i12 = ((m2566 ^ i11) * 21695) ^ (-986928463);
                        i13 = -1553954131;
                    }
                case 1267885341:
                case 1315983992:
                    i7 = i2 + i5;
                    i8 = (i + i5) % bArr.length;
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = C0630.m2566("ܶۗ") ^ i11;
                        i12 = ((m2566 ^ i10) * (-29809)) ^ (-617031595);
                        i13 = -1379913447;
                    } else {
                        m2566 = C2105.m6981("۠᩵") ^ i11;
                        i12 = ((m2566 ^ i10) * (-20867)) ^ (-1821564247);
                        i13 = 965472274;
                    }
                case 1298536821:
                case 1415380094:
                    if (C0798.f2919) {
                        m2566 = (C0630.m2566("ܿ᩵") ^ i11) * 71;
                        i12 = ((m2566 ^ i10) * (-2839)) ^ 1898914156;
                        i13 = 1775968164;
                    } else {
                        m2566 = (C2105.m6981("֡ۗ") ^ i11) * (-117);
                        i12 = ((m2566 ^ i10) * (-8583)) ^ (-657497533);
                        i13 = -876528666;
                    }
                case 1320888453:
                case 1519307665:
                    if (i6 < i3) {
                        m2566 = (C2105.m6981("۫ᩳ") ^ i10) * 23;
                        i12 = ((m2566 ^ i11) * (-6195)) ^ 749190784;
                        i13 = -294944522;
                    } else {
                        m2566 = (C2105.m6981("۬ۤ") ^ i10) * 99;
                        i12 = ((m2566 ^ i11) * 26983) ^ 1462692892;
                        i13 = 944863236;
                    }
                case 1459795493:
                case 1625904241:
                    C7811.m20844();
                    m2566 = C0630.m2566("ܶۗ") ^ i11;
                    i12 = ((m2566 ^ i10) * (-29809)) ^ (-617031595);
                    i13 = -1379913447;
                default:
                    int m7501 = C2272.m7501(i6, i3 - i6);
                    AbstractC2021.m6568(bArr2, i2, bArr2, i2 + i6, m7501);
                    i6 += m7501;
                    m2566 = (C2105.m6981("᩹ۛ") ^ i11) * (-53);
                    i12 = ((m2566 ^ i10) * 8737) ^ (-49375484);
                    i13 = 2099443512;
            }
            return;
        }
    }
}
