package l;

import com.alipay.sdk.m.t0.b;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.snackbar.SnackbarManager;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.TwofishEngine;

/* compiled from: 24FJ */
/* renamed from: l.֫ۘۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1575 {

    /* renamed from: ۨۛ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f5580 = {313, -19097, -19029, 23238, -19633, -21229, -23317, 20026, 16767, -20595, -15974, -15972, -15990, -15990, -15988, -15974, -15974, -21566, 19533, -21098, 18066, -24521, -28231, -22521, -26550, -18735, -24456, 18915, 17009, -23051, -27503, 22144, 23158, 23178, -17528, -22612, -23194, 20343, -20924, -23086, -25539, -28228, -22585, -21570, 17925, -22606, 20324, -27086, 21609, -17815, 24145, -24374, -16395, -21967, -25165, -21025, 20985, 23110, -27700, 18811, -21972, 16401, -22421, -28593, 16916, 19507, -19257, 24551, 18748, -24788, -25659, -21838, 20157, 22908, -21782, 21026, 17484, 21976, -17056, -18848, 21853, 18582, 21722, -15938, -15951, -15944, -15944, 17455, -26429, 19885, -26379, -17975, -16598, -15993, -15962, -15939, -15895, -15957, -15968, -15961, -15955, 18696, -17730, 20847, 23516, 17254, -21575, -16401, 19509, 19356, 16958, -27386, -17041, -15990, -15962, -15955, -15956, -15885, -15895, -23165, -17023, -24669, -24469, -29051, -20738};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5392(C23881 c23881, int i) {
        return m5393(c23881, ServiceConnectionC3453.m10562(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5393(C23881 c23881, String str) {
        int m2566;
        int i;
        int i2;
        short[] sArr;
        int i3;
        short[] sArr2;
        short s;
        String str2;
        int i4;
        int i5;
        int i6;
        short[] sArr3;
        String str3;
        short[] sArr4;
        short[] sArr5;
        int i7;
        int i8;
        String str4;
        int m6981;
        int i9;
        int i10;
        short[] sArr6;
        int i11;
        short[] sArr7;
        int i12;
        short[] sArr8;
        String str5;
        short[] sArr9;
        short[] sArr10;
        int i13;
        int i14;
        String str6;
        int m69812;
        int i15;
        int i16;
        short[] sArr11;
        int m69813;
        int i17;
        int i18;
        int m69814;
        int i19;
        int m69815;
        int i20;
        int i21;
        int i22;
        short[] sArr12;
        int m25662;
        int i23;
        int i24;
        int i25;
        short[] sArr13;
        int i26;
        short[] sArr14;
        int i27;
        int i28;
        short[] sArr15;
        String str7;
        String str8;
        short[] sArr16;
        short[] sArr17;
        int i29;
        int i30;
        String str9;
        int m69816;
        int i31;
        int i32;
        int i33;
        short[] sArr18;
        short[] sArr19;
        short[] sArr20;
        int i34;
        String str10;
        String str11;
        short[] sArr21;
        int i35;
        int i36;
        short[] sArr22;
        int i37;
        int i38;
        short[] sArr23;
        short[] sArr24;
        short[] sArr25;
        int i39;
        String str12;
        String str13;
        int i40;
        short[] sArr26;
        int i41;
        short[] sArr27;
        String str14;
        String str15;
        int m25663;
        int i42;
        short[] sArr28;
        short[] sArr29;
        String str16;
        String str17;
        String m3595;
        int m69817;
        int i43;
        int i44;
        String str18;
        String str19;
        int m25664;
        int i45;
        int i46;
        int i47;
        short[] sArr30;
        String str20;
        int m69818;
        int i48;
        int i49;
        int i50 = C22628.f73083;
        int i51 = C2520.f8000;
        int m69819 = C2105.m6981("ܳۚ") ^ i51;
        int i52 = ((m69819 ^ i50) * (-28619)) ^ 1366076055;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        short[] sArr31 = null;
        short[] sArr32 = null;
        short[] sArr33 = null;
        short[] sArr34 = null;
        short[] sArr35 = null;
        int i53 = m69819 ^ (-780647824);
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        char c = 0;
        int i60 = 0;
        int i61 = 0;
        short s2 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        int i68 = -1680563350;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        short[] sArr36 = null;
        int i69 = 0;
        int i70 = 0;
        String str27 = null;
        String str28 = null;
        Object[] objArr = null;
        String str29 = null;
        Object[] objArr2 = null;
        String str30 = null;
        int i71 = 0;
        while (true) {
            i68 = i53 ^ (i52 & (((i68 ^ i50) * 15827) >> 31));
            switch (i68) {
                case -2146989094:
                case 1395506518:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != 3) {
                        m69813 = (C0630.m2566("ܽ֨") + i50) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i17 = ((m69813 ^ i51) * (-17229)) ^ (-1204928624);
                        i18 = 51133078;
                        int i72 = m69813 ^ i18;
                        i52 = i17;
                        str23 = str5;
                        str21 = str6;
                        sArr33 = sArr8;
                        sArr34 = sArr7;
                        i66 = i12;
                        i65 = i14;
                        sArr35 = sArr6;
                        i53 = i72;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i54 = i11;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                    m69813 = C0630.m2566("֨۠") ^ i51;
                    i17 = ((m69813 ^ i50) * 1809) ^ 308145065;
                    i18 = -1824594115;
                    int i722 = m69813 ^ i18;
                    i52 = i17;
                    str23 = str5;
                    str21 = str6;
                    sArr33 = sArr8;
                    sArr34 = sArr7;
                    i66 = i12;
                    i65 = i14;
                    sArr35 = sArr6;
                    i53 = i722;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i54 = i11;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -2131881968:
                case -919747481:
                    return ServiceConnectionC3453.m10562(C0630.m2566(RunnableC3474.m10633(f5580, 26, 3, i71)) ^ 2121120283);
                case -2111960703:
                case 1015116342:
                    return C1420.m4906(C2105.m6981(C7811.m20837(sArr35, i69, i57, i71)) ^ 2120908884, objArr);
                case -2084049369:
                case 805271037:
                    return ServiceConnectionC3453.m10562(C0630.m2566(C7106.m19110(f5580, 53, 3, i71)) ^ 2125653908);
                case -2081736094:
                case -345884483:
                    C1773.m5908();
                    if (C0630.f2410 <= 0) {
                        sArr6 = sArr35;
                        i11 = i54;
                        sArr7 = sArr34;
                        str2 = str24;
                        i12 = i66;
                        i5 = i62;
                        i6 = i64;
                        sArr8 = sArr33;
                        str5 = str23;
                        sArr9 = sArr36;
                        sArr10 = sArr32;
                        i13 = i63;
                        i14 = i65;
                        str6 = str21;
                        m69812 = (C2105.m6981("᩸۠") + i50) * (-47);
                        i15 = ((m69812 ^ i51) * (-21765)) ^ (-796647437);
                        i16 = -1144144593;
                        i22 = m69812 ^ i16;
                        str23 = str5;
                        str21 = str6;
                        sArr33 = sArr8;
                        sArr34 = sArr7;
                        i66 = i12;
                        i65 = i14;
                        sArr35 = sArr6;
                        i53 = i22;
                        i52 = i15;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i54 = i11;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    sArr11 = sArr33;
                    str2 = str24;
                    i12 = i66;
                    str5 = str23;
                    i5 = i62;
                    i6 = i64;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    m69815 = (C0630.m2566("ۙۘ") + i51) * (-27);
                    i20 = ((m69815 ^ i50) * 24133) ^ 1939253231;
                    i21 = 242466931;
                    int i73 = m69815 ^ i21;
                    i66 = i12;
                    str23 = str5;
                    str21 = str6;
                    sArr35 = sArr6;
                    i53 = i73;
                    i52 = i20;
                    sArr33 = sArr11;
                    i65 = i14;
                    i54 = i11;
                    sArr34 = sArr7;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -2076052231:
                case 1872954806:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    sArr11 = sArr33;
                    str2 = str24;
                    i12 = i66;
                    str5 = str23;
                    i5 = i62;
                    i6 = i64;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != 1201) {
                        m69815 = (C0630.m2566("ܰۨ") ^ i51) * (-123);
                        i20 = ((m69815 ^ i50) * 18635) ^ 145264778;
                        i21 = -2005341826;
                    } else {
                        m69815 = C2105.m6981("ۧ֫") ^ i50;
                        i20 = ((m69815 ^ i51) * (-20137)) ^ 1905582219;
                        i21 = -1086551427;
                    }
                    int i732 = m69815 ^ i21;
                    i66 = i12;
                    str23 = str5;
                    str21 = str6;
                    sArr35 = sArr6;
                    i53 = i732;
                    i52 = i20;
                    sArr33 = sArr11;
                    i65 = i14;
                    i54 = i11;
                    sArr34 = sArr7;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -2071572748:
                case 1887473407:
                    return ServiceConnectionC3453.m10562(C0630.m2566(C2520.m8030(f5580, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 3, i71)) ^ 2130266309);
                case -2044482040:
                case -542209590:
                    return C4075.m12251(C2105.m6981(C4616.m13542(f5580, 65, 3, i71)) ^ 2100414837);
                case -1965074630:
                case 1106049988:
                    return ServiceConnectionC3453.m10562(C2105.m6981(C1047.m3603(f5580, 35, 3, i71)) ^ 2124360192);
                case -1915725937:
                case 1715485320:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    short[] sArr37 = sArr36;
                    int i74 = i63;
                    int i75 = i64;
                    str2 = str24;
                    str5 = str23;
                    str6 = str21;
                    i67 = C2105.m6981(RunnableC1108.m3789(sArr37, i75, i74, i71)) ^ 2098462408;
                    sArr11 = f5580;
                    if (C2105.f7037 != 0) {
                        sArr9 = sArr37;
                        i5 = i62;
                        sArr10 = sArr32;
                        i14 = 90;
                        i6 = i75;
                        i13 = i74;
                        i12 = i66;
                        m69815 = (C0630.m2566("ۙۘ") + i51) * (-27);
                        i20 = ((m69815 ^ i50) * 24133) ^ 1939253231;
                        i21 = 242466931;
                        int i7322 = m69815 ^ i21;
                        i66 = i12;
                        str23 = str5;
                        str21 = str6;
                        sArr35 = sArr6;
                        i53 = i7322;
                        i52 = i20;
                        sArr33 = sArr11;
                        i65 = i14;
                        i54 = i11;
                        sArr34 = sArr7;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    } else {
                        int m698110 = (i50 - C2105.m6981("᩶ۗ")) * (-87);
                        i52 = ((m698110 ^ i51) * 8049) ^ (-227094837);
                        str24 = str2;
                        sArr36 = sArr37;
                        str23 = str5;
                        str21 = str6;
                        i65 = 90;
                        i64 = i75;
                        sArr33 = sArr11;
                        sArr35 = sArr6;
                        sArr34 = sArr7;
                        i53 = m698110 ^ 1609737598;
                        i63 = i74;
                        i54 = i11;
                    }
                case -1891054316:
                case 2124156258:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (!c23881.f77217) {
                        m69813 = C2105.m6981("ܳ֨") ^ i51;
                        i17 = ((m69813 ^ i50) * (-7465)) ^ (-2096104291);
                        i18 = 1412547724;
                        int i7222 = m69813 ^ i18;
                        i52 = i17;
                        str23 = str5;
                        str21 = str6;
                        sArr33 = sArr8;
                        sArr34 = sArr7;
                        i66 = i12;
                        i65 = i14;
                        sArr35 = sArr6;
                        i53 = i7222;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i54 = i11;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                    m69813 = C0630.m2566("ۗۗ") ^ i51;
                    i17 = ((m69813 ^ i50) * 21759) ^ (-1133694689);
                    i18 = -911853855;
                    int i72222 = m69813 ^ i18;
                    i52 = i17;
                    str23 = str5;
                    str21 = str6;
                    sArr33 = sArr8;
                    sArr34 = sArr7;
                    i66 = i12;
                    i65 = i14;
                    sArr35 = sArr6;
                    i53 = i72222;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i54 = i11;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -1843242324:
                case 1635037653:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != -1) {
                        m69813 = C2105.m6981("᩸ܳ") ^ i51;
                        i17 = ((m69813 ^ i50) * (-3535)) ^ 2054296412;
                        i18 = 352830795;
                    } else {
                        m69813 = (C2105.m6981("᩸᩷") ^ i50) * 27;
                        i17 = ((m69813 ^ i51) * (-22189)) ^ (-977123083);
                        i18 = 408979374;
                    }
                    int i722222 = m69813 ^ i18;
                    i52 = i17;
                    str23 = str5;
                    str21 = str6;
                    sArr33 = sArr8;
                    sArr34 = sArr7;
                    i66 = i12;
                    i65 = i14;
                    sArr35 = sArr6;
                    i53 = i722222;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i54 = i11;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -1830806602:
                case 852312421:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    str27 = C3245.m9934(f5580, 1, 3, i71);
                    if (C3245.m9925() == 0) {
                        m69812 = C0630.m2566("۠ܿ") ^ i51;
                        i15 = ((m69812 ^ i50) * 25611) ^ (-1975882991);
                        i16 = -367924874;
                        i22 = m69812 ^ i16;
                        str23 = str5;
                        str21 = str6;
                        sArr33 = sArr8;
                        sArr34 = sArr7;
                        i66 = i12;
                        i65 = i14;
                        sArr35 = sArr6;
                        i53 = i22;
                        i52 = i15;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i54 = i11;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                    m69812 = (C2105.m6981("᩸۠") + i50) * (-47);
                    i15 = ((m69812 ^ i51) * (-21765)) ^ (-796647437);
                    i16 = -1144144593;
                    i22 = m69812 ^ i16;
                    str23 = str5;
                    str21 = str6;
                    sArr33 = sArr8;
                    sArr34 = sArr7;
                    i66 = i12;
                    i65 = i14;
                    sArr35 = sArr6;
                    i53 = i22;
                    i52 = i15;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i54 = i11;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -1829052533:
                case 1447289001:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    sArr11 = sArr33;
                    str2 = str24;
                    i12 = i66;
                    str5 = str23;
                    i5 = i62;
                    i6 = i64;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != 1200) {
                        m69815 = C0630.m2566("ۘۡ") ^ i51;
                        i20 = ((m69815 ^ i50) * (-15305)) ^ (-741354851);
                        i21 = -469297429;
                    } else {
                        m69815 = C0630.m2566("ܽ֡") ^ i51;
                        i20 = ((m69815 ^ i50) * 30339) ^ 1769700346;
                        i21 = -1431480411;
                    }
                    int i73222 = m69815 ^ i21;
                    i66 = i12;
                    str23 = str5;
                    str21 = str6;
                    sArr35 = sArr6;
                    i53 = i73222;
                    i52 = i20;
                    sArr33 = sArr11;
                    i65 = i14;
                    i54 = i11;
                    sArr34 = sArr7;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -1824663533:
                case 366923331:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    i71 = 24900;
                    m69812 = (i51 - C2105.m6981("֡ۗ")) * 47;
                    i15 = ((m69812 ^ i50) * (-13223)) ^ (-666966428);
                    i16 = -1666953254;
                    i22 = m69812 ^ i16;
                    str23 = str5;
                    str21 = str6;
                    sArr33 = sArr8;
                    sArr34 = sArr7;
                    i66 = i12;
                    i65 = i14;
                    sArr35 = sArr6;
                    i53 = i22;
                    i52 = i15;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i54 = i11;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -1775986349:
                case -983120350:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    i71 = 49609;
                    m69812 = (i51 - C2105.m6981("֡ۗ")) * 47;
                    i15 = ((m69812 ^ i50) * (-13223)) ^ (-666966428);
                    i16 = -1666953254;
                    i22 = m69812 ^ i16;
                    str23 = str5;
                    str21 = str6;
                    sArr33 = sArr8;
                    sArr34 = sArr7;
                    i66 = i12;
                    i65 = i14;
                    sArr35 = sArr6;
                    i53 = i22;
                    i52 = i15;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i54 = i11;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -1745381067:
                case 641638001:
                    return ServiceConnectionC3453.m10562(C0630.m2566(ServiceConnectionC3453.m10568(f5580, 71, 3, i71)) ^ 2125951636);
                case -1693817313:
                case 126393302:
                    return ServiceConnectionC3453.m10562(C0630.m2566(C4159.m12578(f5580, 44, 3, i71)) ^ 2098771810);
                case -1693707367:
                case 1940732174:
                    return ServiceConnectionC3453.m10562(C2105.m6981(C4616.m13542(f5580, 50, 3, i71)) ^ 2104581132);
                case -1691894520:
                case -1117332585:
                    return C3245.m9924(C0630.m2566(C5695.m16034(sArr34, i59, i56, i71)) ^ 2123755060, objArr2);
                case -1680885790:
                case -832546403:
                    sArr = sArr35;
                    i3 = i54;
                    sArr2 = sArr34;
                    str2 = str24;
                    i4 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr3 = sArr33;
                    str3 = str23;
                    sArr4 = sArr36;
                    sArr5 = sArr32;
                    i7 = i63;
                    i8 = i65;
                    str4 = str21;
                    int i76 = i60 + i61;
                    s = s2;
                    int i77 = s + 5146;
                    if ((i77 * i77) - (i76 + i76) > 0) {
                        m6981 = (i50 - C2105.m6981("᩷᩺")) * (-21);
                        i9 = ((m6981 ^ i51) * (-2279)) ^ 2048533092;
                        i10 = 127414291;
                    } else {
                        m6981 = C2105.m6981("ۢ۫") ^ i51;
                        i9 = ((m6981 ^ i50) * (-18045)) ^ (-78112117);
                        i10 = 1321390655;
                    }
                    int i78 = m6981 ^ i10;
                    s2 = s;
                    str23 = str3;
                    str21 = str4;
                    sArr33 = sArr3;
                    i54 = i3;
                    i66 = i4;
                    i65 = i8;
                    sArr35 = sArr;
                    i53 = i78;
                    i52 = i9;
                    i63 = i7;
                    sArr32 = sArr5;
                    sArr36 = sArr4;
                    sArr34 = sArr2;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -1665914809:
                case 462983639:
                    return C4075.m12251(C2105.m6981(ServiceConnectionC3453.m10568(f5580, 74, 3, i71)) ^ 2125896127);
                case -1662725744:
                case -946965797:
                    return C4075.m12251(C2105.m6981(C0483.m2128(f5580, 41, 3, i71)) ^ 2116601471);
                case -1655821344:
                case -816332956:
                    return C4075.m12251(C0630.m2566(C3663.m11162(f5580, 77, 3, i71)) ^ 2099865361);
                case -1633667420:
                case 1092491956:
                    short[] sArr38 = sArr35;
                    sArr2 = sArr34;
                    str2 = str24;
                    int i79 = i66;
                    i5 = i62;
                    i6 = i64;
                    short[] sArr39 = sArr33;
                    String str31 = str23;
                    sArr4 = sArr36;
                    sArr5 = sArr32;
                    i7 = i63;
                    int i80 = i65;
                    String str32 = str21;
                    if (i79 != 1) {
                        int m25665 = (i50 - C0630.m2566("ۙۡ")) * 45;
                        i52 = ((m25665 ^ i51) * (-18877)) ^ 519026618;
                        str23 = str31;
                        str21 = str32;
                        sArr33 = sArr39;
                        i54 = 1;
                        i66 = i79;
                        i65 = i80;
                        sArr35 = sArr38;
                        i53 = m25665 ^ 874131692;
                        i63 = i7;
                        sArr32 = sArr5;
                        sArr36 = sArr4;
                        sArr34 = sArr2;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    } else {
                        int m25666 = C0630.m2566("֡۬") ^ i50;
                        i52 = ((m25666 ^ i51) * 24793) ^ 428217362;
                        str23 = str31;
                        str21 = str32;
                        sArr33 = sArr39;
                        sArr34 = sArr2;
                        i66 = i79;
                        i65 = i80;
                        sArr35 = sArr38;
                        i53 = m25666 ^ 1638485352;
                        i63 = i7;
                        sArr32 = sArr5;
                        sArr36 = sArr4;
                        i54 = 1;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                case -1615238206:
                case 1566748470:
                    System.exit(i55);
                    return str;
                case -1608256494:
                case 185434706:
                    return ServiceConnectionC3453.m10562(i70);
                case -1600784584:
                case -1144419186:
                    return ServiceConnectionC3453.m10562(C0630.m2566(C4117.m12355(f5580, 62, 3, i71)) ^ 2122639058);
                case -1597604607:
                case 559846078:
                    C0798.m2998();
                    return null;
                case -1597535587:
                case -1227318780:
                    if (C1711.f5919) {
                        m2566 = C2105.m6981("֡ܰ") ^ i51;
                        i = ((m2566 ^ i50) * (-22503)) ^ (-1344842013);
                        i2 = -449029579;
                        i53 = m2566 ^ i2;
                        i52 = i;
                    } else {
                        sArr6 = sArr35;
                        i11 = i54;
                        str2 = str24;
                        i12 = i66;
                        i5 = i62;
                        i6 = i64;
                        sArr8 = sArr33;
                        str5 = str23;
                        sArr9 = sArr36;
                        sArr10 = sArr32;
                        i13 = i63;
                        i14 = i65;
                        str6 = str21;
                        int m698111 = C2105.m6981("ۨᩴ") ^ i50;
                        i15 = ((m698111 ^ i51) * (-8031)) ^ (-1416642108);
                        i22 = m698111 ^ (-561918254);
                        str23 = str5;
                        str21 = str6;
                        sArr33 = sArr8;
                        i66 = i12;
                        i65 = i14;
                        sArr35 = sArr6;
                        i53 = i22;
                        i52 = i15;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i54 = i11;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                case -1586206444:
                case 235790386:
                    if (C1773.f6144 <= 0) {
                        m2566 = (C0630.m2566("ܽۜ") ^ i51) * (-55);
                        i = ((m2566 ^ i50) * 29423) ^ 1701753126;
                        i2 = 1048912535;
                        i53 = m2566 ^ i2;
                        i52 = i;
                    } else {
                        sArr6 = sArr35;
                        i11 = i54;
                        sArr7 = sArr34;
                        sArr11 = sArr33;
                        str2 = str24;
                        i12 = i66;
                        str5 = str23;
                        i5 = i62;
                        i6 = i64;
                        sArr9 = sArr36;
                        sArr10 = sArr32;
                        i13 = i63;
                        i14 = i65;
                        str6 = str21;
                        m69815 = (C0630.m2566("ۙۘ") + i51) * (-27);
                        i20 = ((m69815 ^ i50) * 24133) ^ 1939253231;
                        i21 = 242466931;
                        int i732222 = m69815 ^ i21;
                        i66 = i12;
                        str23 = str5;
                        str21 = str6;
                        sArr35 = sArr6;
                        i53 = i732222;
                        i52 = i20;
                        sArr33 = sArr11;
                        i65 = i14;
                        i54 = i11;
                        sArr34 = sArr7;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                case -1573181928:
                case 1781536971:
                    return ServiceConnectionC3453.m10562(C0630.m2566(C4159.m12578(f5580, 20, 3, i71)) ^ 2098876120);
                case -1572647771:
                case 1028315973:
                    C11340.m28031();
                    if (C2520.f8000 >= 0) {
                        sArr18 = sArr35;
                        i11 = i54;
                        sArr19 = sArr34;
                        i38 = i62;
                        sArr22 = sArr32;
                        i36 = i63;
                        i35 = i64;
                        sArr20 = sArr33;
                        i34 = i65;
                        str10 = str24;
                        str11 = str23;
                        sArr21 = sArr36;
                        int m698112 = C2105.m6981("᩸᩺") ^ i51;
                        short[] sArr40 = sArr22;
                        i52 = ((m698112 ^ i50) * (-27713)) ^ 1215978164;
                        i37 = m698112 ^ 727841367;
                        str24 = str10;
                        i65 = i34;
                        str23 = str11;
                        sArr33 = sArr20;
                        i63 = i36;
                        sArr32 = sArr40;
                        sArr36 = sArr21;
                        sArr34 = sArr19;
                        i64 = i35;
                        i62 = i38;
                        sArr35 = sArr18;
                        i53 = i37;
                        i54 = i11;
                    } else {
                        m2566 = (C0630.m2566("ܽۜ") ^ i51) * (-55);
                        i = ((m2566 ^ i50) * 29423) ^ 1701753126;
                        i2 = 1048912535;
                        i53 = m2566 ^ i2;
                        i52 = i;
                    }
                case -1565252983:
                case 433193581:
                    sArr23 = sArr35;
                    i11 = i54;
                    sArr24 = sArr34;
                    String m5177 = C1504.m5177(f5580, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 6, i71);
                    if (C4117.m12364() == 0) {
                        StringBuilder sb = new StringBuilder(m5177);
                        C0050.m945(sb, C22628.m50604(c23881));
                        throw new RuntimeException(C0050.m947(sb));
                    }
                    i40 = i62;
                    sArr26 = sArr32;
                    i41 = i63;
                    sArr25 = sArr33;
                    i39 = i65;
                    str12 = str23;
                    str13 = str21;
                    int m25667 = (C0630.m2566("ܿۖ") + i50) * (-65);
                    int i81 = i41;
                    i52 = ((m25667 ^ i51) * (-21519)) ^ (-413028520);
                    sArr32 = sArr26;
                    str23 = str12;
                    str21 = str13;
                    sArr35 = sArr23;
                    sArr33 = sArr25;
                    i53 = m25667 ^ 1423858118;
                    i65 = i39;
                    sArr34 = sArr24;
                    i63 = i81;
                    i62 = i40;
                    i54 = i11;
                case -1515040833:
                case -241217433:
                    sArr23 = sArr35;
                    i11 = i54;
                    sArr24 = sArr34;
                    sArr25 = sArr33;
                    i39 = i65;
                    str12 = str23;
                    str13 = str21;
                    i40 = i62;
                    sArr26 = sArr32;
                    str24 = RunnableC1108.m3789(sArr26, i40, 2, i71);
                    sArr36 = f5580;
                    i64 = 87;
                    if (C3019.f9544 >= 0) {
                        i41 = 3;
                        int m256672 = (C0630.m2566("ܿۖ") + i50) * (-65);
                        int i812 = i41;
                        i52 = ((m256672 ^ i51) * (-21519)) ^ (-413028520);
                        sArr32 = sArr26;
                        str23 = str12;
                        str21 = str13;
                        sArr35 = sArr23;
                        sArr33 = sArr25;
                        i53 = m256672 ^ 1423858118;
                        i65 = i39;
                        sArr34 = sArr24;
                        i63 = i812;
                        i62 = i40;
                        i54 = i11;
                    } else {
                        int m25668 = C0630.m2566("۠ܰ") ^ i51;
                        i52 = ((m25668 ^ i50) * 6237) ^ 570943724;
                        sArr32 = sArr26;
                        i62 = i40;
                        str23 = str12;
                        str21 = str13;
                        sArr35 = sArr23;
                        i54 = i11;
                        sArr33 = sArr25;
                        i53 = m25668 ^ (-303812980);
                        i65 = i39;
                        sArr34 = sArr24;
                        i63 = 3;
                    }
                case -1451189432:
                case 163151698:
                    return ServiceConnectionC3453.m10562(C2105.m6981(C2272.m7507(f5580, 101, 3, i71)) ^ 2097340448);
                case -1418701908:
                case 1849780318:
                    return str;
                case -1393979156:
                case 2114639547:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    sArr11 = sArr33;
                    str2 = str24;
                    i12 = i66;
                    str5 = str23;
                    i5 = i62;
                    i6 = i64;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != 1801) {
                        m69815 = C0630.m2566("۠ۧ") ^ i50;
                        i20 = ((m69815 ^ i51) * (-18531)) ^ 1113406752;
                        i21 = -251544680;
                        int i7322222 = m69815 ^ i21;
                        i66 = i12;
                        str23 = str5;
                        str21 = str6;
                        sArr35 = sArr6;
                        i53 = i7322222;
                        i52 = i20;
                        sArr33 = sArr11;
                        i65 = i14;
                        i54 = i11;
                        sArr34 = sArr7;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                    m69815 = (i51 - C2105.m6981("ۢ᩶")) * 49;
                    i20 = ((m69815 ^ i50) * (-32567)) ^ 1385112282;
                    i21 = 47009808;
                    int i73222222 = m69815 ^ i21;
                    i66 = i12;
                    str23 = str5;
                    str21 = str6;
                    sArr35 = sArr6;
                    i53 = i73222222;
                    i52 = i20;
                    sArr33 = sArr11;
                    i65 = i14;
                    i54 = i11;
                    sArr34 = sArr7;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -1376109489:
                case -1228464806:
                    return C4075.m12251(C2105.m6981(C2105.m6988(f5580, 7, 3, i71)) ^ 2101240422);
                case -1288268079:
                case 906219606:
                    sArr28 = sArr35;
                    i11 = i54;
                    sArr29 = sArr34;
                    str18 = str23;
                    str19 = str21;
                    switch (i66) {
                        case 1700:
                            m25664 = C0630.m2566("ۙۚ") ^ i50;
                            i45 = ((m25664 ^ i51) * 17677) ^ 1918132868;
                            i46 = -1671215478;
                            break;
                        case 1701:
                            m25664 = C0630.m2566("᩺ܺ") ^ i51;
                            i45 = ((m25664 ^ i50) * (-14415)) ^ (-1086289086);
                            i46 = -565601445;
                            break;
                        case 1702:
                            m25664 = (C0630.m2566("ᩴ᩶") + i50) * (-71);
                            i45 = ((m25664 ^ i51) * (-13159)) ^ 1787046154;
                            i46 = 2107563522;
                            break;
                        case 1703:
                            m25664 = C0630.m2566("ᩴ᩷") ^ i51;
                            i45 = ((m25664 ^ i50) * 20641) ^ (-1695402330);
                            i46 = 1627881784;
                            break;
                        default:
                            m25664 = C0630.m2566("ۘۧ") ^ i51;
                            i45 = ((m25664 ^ i50) * (-9531)) ^ 1679574652;
                            i46 = -1837756106;
                            break;
                    }
                    i37 = m25664 ^ i46;
                    str21 = str19;
                    str23 = str18;
                    i52 = i45;
                    sArr35 = sArr28;
                    sArr34 = sArr29;
                    i53 = i37;
                    i54 = i11;
                case -1255501351:
                case 768296915:
                    return ServiceConnectionC3453.m10562(C0630.m2566(C1420.m4902(f5580, 56, 3, i71)) ^ 2099406444);
                case -1246520598:
                case -326204201:
                    return C3537.m10748(f5580, 93, 8, i71);
                case -1213268553:
                case 522357312:
                    sArr12 = sArr35;
                    i47 = i54;
                    sArr30 = sArr34;
                    str20 = str21;
                    str28 = C4075.m12251(i67);
                    m69818 = (C0630.m2566("ۢۤ") ^ i50) * 115;
                    i48 = ((m69818 ^ i51) * (-28451)) ^ 554764438;
                    i49 = 388371714;
                    i25 = m69818 ^ i49;
                    str21 = str20;
                    i52 = i48;
                    i54 = i47;
                    sArr34 = sArr30;
                    sArr27 = sArr12;
                    i53 = i25;
                    sArr35 = sArr27;
                case -1205371437:
                case -95983694:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    s2 = sArr31[c];
                    i60 = s2 * s2;
                    i61 = 26481316;
                    if (C3746.m11369() >= 0) {
                        sArr34 = sArr7;
                        int m6981112 = C2105.m6981("ۨᩴ") ^ i50;
                        i15 = ((m6981112 ^ i51) * (-8031)) ^ (-1416642108);
                        i22 = m6981112 ^ (-561918254);
                        str23 = str5;
                        str21 = str6;
                        sArr33 = sArr8;
                        i66 = i12;
                        i65 = i14;
                        sArr35 = sArr6;
                        i53 = i22;
                        i52 = i15;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i54 = i11;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    } else {
                        m69812 = C2105.m6981("ᩴ᩸") ^ i50;
                        i15 = ((m69812 ^ i51) * 7127) ^ 1352852906;
                        i16 = -1372586107;
                        i22 = m69812 ^ i16;
                        str23 = str5;
                        str21 = str6;
                        sArr33 = sArr8;
                        sArr34 = sArr7;
                        i66 = i12;
                        i65 = i14;
                        sArr35 = sArr6;
                        i53 = i22;
                        i52 = i15;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i54 = i11;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                case -1198448496:
                case -935562767:
                    return ServiceConnectionC3453.m10562(C0630.m2566(C2167.m7159(f5580, 29, 3, i71)) ^ 2123447150);
                case -1052970348:
                case -97773422:
                    C4075.m12263();
                    C1005.m3501();
                    sArr18 = sArr35;
                    i11 = i54;
                    sArr19 = sArr34;
                    i38 = i62;
                    sArr22 = sArr32;
                    i36 = i63;
                    i35 = i64;
                    sArr20 = sArr33;
                    i34 = i65;
                    str10 = str24;
                    str11 = str23;
                    sArr21 = sArr36;
                    int m6981122 = C2105.m6981("᩸᩺") ^ i51;
                    short[] sArr402 = sArr22;
                    i52 = ((m6981122 ^ i50) * (-27713)) ^ 1215978164;
                    i37 = m6981122 ^ 727841367;
                    str24 = str10;
                    i65 = i34;
                    str23 = str11;
                    sArr33 = sArr20;
                    i63 = i36;
                    sArr32 = sArr402;
                    sArr36 = sArr21;
                    sArr34 = sArr19;
                    i64 = i35;
                    i62 = i38;
                    sArr35 = sArr18;
                    i53 = i37;
                    i54 = i11;
                case -1008356235:
                case 1855465422:
                    if (C0237.f1507 == 0) {
                        m2566 = C2105.m6981("᩶ۘ") ^ i50;
                        i = ((m2566 ^ i51) * (-17027)) ^ 1147960609;
                        i2 = -1750896284;
                        i53 = m2566 ^ i2;
                        i52 = i;
                    } else {
                        sArr = sArr35;
                        i3 = i54;
                        sArr2 = sArr34;
                        s = s2;
                        str2 = str24;
                        i4 = i66;
                        i5 = i62;
                        i6 = i64;
                        sArr3 = sArr33;
                        str3 = str23;
                        sArr4 = sArr36;
                        sArr5 = sArr32;
                        i7 = i63;
                        i8 = i65;
                        str4 = str21;
                        m6981 = C2105.m6981("ܰ᩶") ^ i51;
                        i9 = ((m6981 ^ i50) * (-25143)) ^ (-738849570);
                        i10 = -1614850023;
                        int i782 = m6981 ^ i10;
                        s2 = s;
                        str23 = str3;
                        str21 = str4;
                        sArr33 = sArr3;
                        i54 = i3;
                        i66 = i4;
                        i65 = i8;
                        sArr35 = sArr;
                        i53 = i782;
                        i52 = i9;
                        i63 = i7;
                        sArr32 = sArr5;
                        sArr36 = sArr4;
                        sArr34 = sArr2;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                case -991796868:
                case -335734356:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    sArr11 = sArr33;
                    str2 = str24;
                    i12 = i66;
                    str5 = str23;
                    i5 = i62;
                    i6 = i64;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != 1802) {
                        m69815 = (C0630.m2566("֡ۡ") + i51) * 5;
                        i20 = ((m69815 ^ i50) * 23211) ^ (-1024025841);
                        i21 = 1585966968;
                        int i732222222 = m69815 ^ i21;
                        i66 = i12;
                        str23 = str5;
                        str21 = str6;
                        sArr35 = sArr6;
                        i53 = i732222222;
                        i52 = i20;
                        sArr33 = sArr11;
                        i65 = i14;
                        i54 = i11;
                        sArr34 = sArr7;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                    m69815 = (i51 - C2105.m6981("ۢ᩶")) * 49;
                    i20 = ((m69815 ^ i50) * (-32567)) ^ 1385112282;
                    i21 = 47009808;
                    int i7322222222 = m69815 ^ i21;
                    i66 = i12;
                    str23 = str5;
                    str21 = str6;
                    sArr35 = sArr6;
                    i53 = i7322222222;
                    i52 = i20;
                    sArr33 = sArr11;
                    i65 = i14;
                    i54 = i11;
                    sArr34 = sArr7;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -955311543:
                case -22569243:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    str26 = ViewOnClickListenerC1958.m6435(f5580, 4, 3, i71);
                    if (C4117.f13076 <= 0) {
                        sArr11 = sArr8;
                        m69815 = (C0630.m2566("ۙۘ") + i51) * (-27);
                        i20 = ((m69815 ^ i50) * 24133) ^ 1939253231;
                        i21 = 242466931;
                        int i73222222222 = m69815 ^ i21;
                        i66 = i12;
                        str23 = str5;
                        str21 = str6;
                        sArr35 = sArr6;
                        i53 = i73222222222;
                        i52 = i20;
                        sArr33 = sArr11;
                        i65 = i14;
                        i54 = i11;
                        sArr34 = sArr7;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    } else {
                        m69812 = C2105.m6981("ۨۛ") ^ i51;
                        i15 = ((m69812 ^ i50) * (-14885)) ^ 1973703883;
                        i16 = 2093992859;
                        i22 = m69812 ^ i16;
                        str23 = str5;
                        str21 = str6;
                        sArr33 = sArr8;
                        sArr34 = sArr7;
                        i66 = i12;
                        i65 = i14;
                        sArr35 = sArr6;
                        i53 = i22;
                        i52 = i15;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i54 = i11;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                case -841743798:
                case 1439968242:
                    str29 = C4075.m12251(i58);
                    sArr28 = sArr35;
                    i11 = i54;
                    sArr29 = sArr34;
                    str18 = str23;
                    str19 = str21;
                    m25664 = C0630.m2566("۟ܽ") ^ i50;
                    i45 = ((m25664 ^ i51) * 365) ^ 1864599968;
                    i46 = 2050971895;
                    i37 = m25664 ^ i46;
                    str21 = str19;
                    str23 = str18;
                    i52 = i45;
                    sArr35 = sArr28;
                    sArr34 = sArr29;
                    i53 = i37;
                    i54 = i11;
                case -837840335:
                case 455274489:
                    return ServiceConnectionC3453.m10562(C0630.m2566(C7811.m20837(f5580, 59, 3, i71)) ^ 2099035193);
                case -771536419:
                case 1617233634:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    sArr11 = sArr33;
                    str2 = str24;
                    i12 = i66;
                    str5 = str23;
                    i5 = i62;
                    i6 = i64;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != 1400) {
                        m69815 = C2105.m6981("ܰܳ") ^ i50;
                        i20 = ((m69815 ^ i51) * 21409) ^ (-1756939126);
                        i21 = 386971698;
                    } else {
                        m69815 = C2105.m6981("ᩳۙ") ^ i50;
                        i20 = ((m69815 ^ i51) * 9687) ^ (-749941756);
                        i21 = 282135199;
                    }
                    int i732222222222 = m69815 ^ i21;
                    i66 = i12;
                    str23 = str5;
                    str21 = str6;
                    sArr35 = sArr6;
                    i53 = i732222222222;
                    i52 = i20;
                    sArr33 = sArr11;
                    i65 = i14;
                    i54 = i11;
                    sArr34 = sArr7;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -747333243:
                case 1069233016:
                    sArr12 = sArr35;
                    int i82 = i54;
                    short[] sArr41 = sArr34;
                    short[] sArr42 = sArr33;
                    String str33 = str24;
                    String str34 = str23;
                    int i83 = i62;
                    int i84 = i64;
                    short[] sArr43 = sArr36;
                    short[] sArr44 = sArr32;
                    int i85 = i63;
                    int i86 = i65;
                    String str35 = str21;
                    int m49333 = C21923.m49333(c23881);
                    if (m49333 != -3) {
                        m25662 = (i50 - C2105.m6981("ܽۛ")) * 15;
                        i23 = ((m25662 ^ i51) * TwofishEngine.GF256_FDBK) ^ 1510830952;
                        i24 = 714518852;
                    } else {
                        m25662 = (C0630.m2566("۟ۤ") ^ i50) * 5;
                        i23 = ((m25662 ^ i51) * (-32561)) ^ (-1685936123);
                        i24 = 1069420667;
                    }
                    i25 = m25662 ^ i24;
                    str23 = str34;
                    str21 = str35;
                    sArr33 = sArr42;
                    sArr34 = sArr41;
                    i66 = m49333;
                    i52 = i23;
                    i65 = i86;
                    i54 = i82;
                    i63 = i85;
                    sArr32 = sArr44;
                    sArr36 = sArr43;
                    i64 = i84;
                    i62 = i83;
                    str24 = str33;
                    sArr27 = sArr12;
                    i53 = i25;
                    sArr35 = sArr27;
                case -653265462:
                case 1441689359:
                    return ServiceConnectionC3453.m10562(C2105.m6981(C1047.m3603(f5580, IShizukuService.Stub.TRANSACTION_isHidden, 3, i71)) ^ 2101389007);
                case -644112547:
                case -280550932:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    short[] sArr45 = sArr33;
                    str2 = str24;
                    i12 = i66;
                    str5 = str23;
                    i5 = i62;
                    i6 = i64;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    sArr8 = sArr45;
                    m69814 = C0630.m2566(C1773.m5917(f5580, 23, 3, i71));
                    i19 = 2123004692;
                    i70 = m69814 ^ i19;
                    m69812 = (i51 - C0630.m2566("ۢ۬")) * (-15);
                    i15 = ((m69812 ^ i50) * 32615) ^ 700268383;
                    i16 = -630675144;
                    i22 = m69812 ^ i16;
                    str23 = str5;
                    str21 = str6;
                    sArr33 = sArr8;
                    sArr34 = sArr7;
                    i66 = i12;
                    i65 = i14;
                    sArr35 = sArr6;
                    i53 = i22;
                    i52 = i15;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i54 = i11;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -612765049:
                case 1648899488:
                    sArr13 = sArr35;
                    i26 = i54;
                    sArr14 = sArr34;
                    i27 = i62;
                    i28 = i64;
                    sArr15 = sArr33;
                    str7 = str24;
                    str8 = str23;
                    sArr16 = sArr36;
                    sArr17 = sArr32;
                    i29 = i63;
                    i30 = i65;
                    str9 = str21;
                    switch (i66) {
                        case 1000:
                            m69816 = (C2105.m6981("ܳ۠") + i51) * (-67);
                            i31 = ((m69816 ^ i50) * 27083) ^ (-2035838429);
                            i32 = 1949026123;
                            break;
                        case 1001:
                            m69816 = C0630.m2566("ۖ᩶") ^ i50;
                            i31 = ((m69816 ^ i51) * 19833) ^ 1700994512;
                            i32 = 851208603;
                            break;
                        case b.c /* 1002 */:
                            m69816 = (C0630.m2566("ۜ۠") ^ i51) * 41;
                            i31 = ((m69816 ^ i50) * 19503) ^ 443666506;
                            i32 = -968146999;
                            break;
                        case b.d /* 1003 */:
                            m69816 = C2105.m6981("֡ۧ") ^ i51;
                            i31 = ((m69816 ^ i50) * (-6835)) ^ 491366663;
                            i32 = -1537537841;
                            break;
                        default:
                            m69816 = C0630.m2566("ᩴۙ") ^ i50;
                            i31 = ((m69816 ^ i51) * (-12203)) ^ 1148066499;
                            i32 = 1040117856;
                            break;
                    }
                    i33 = m69816 ^ i32;
                    str24 = str7;
                    str23 = str8;
                    str21 = str9;
                    sArr33 = sArr15;
                    i65 = i30;
                    sArr34 = sArr14;
                    i63 = i29;
                    sArr32 = sArr17;
                    sArr36 = sArr16;
                    i64 = i28;
                    i62 = i27;
                    i54 = i26;
                    sArr27 = sArr13;
                    i53 = i33;
                    i52 = i31;
                    sArr35 = sArr27;
                case -600889754:
                case 1591706020:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != 4) {
                        m69813 = (i50 - C0630.m2566("ܿ֨")) * (-73);
                        i17 = ((m69813 ^ i51) * (-16231)) ^ (-1109978395);
                        i18 = 1565218466;
                    } else {
                        m69813 = (C0630.m2566("۠ۘ") ^ i51) * 123;
                        i17 = ((m69813 ^ i50) * 18521) ^ (-1002537511);
                        i18 = 1766424262;
                    }
                    int i7222222 = m69813 ^ i18;
                    i52 = i17;
                    str23 = str5;
                    str21 = str6;
                    sArr33 = sArr8;
                    sArr34 = sArr7;
                    i66 = i12;
                    i65 = i14;
                    sArr35 = sArr6;
                    i53 = i7222222;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i54 = i11;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -579890979:
                case 2000651093:
                    sArr13 = sArr35;
                    i26 = i54;
                    sArr14 = sArr34;
                    i27 = i62;
                    short[] sArr46 = sArr32;
                    i29 = i63;
                    i28 = i64;
                    sArr15 = sArr33;
                    i30 = i65;
                    str7 = str24;
                    str8 = str23;
                    str9 = str21;
                    sArr16 = sArr36;
                    switch (i66) {
                        case SnackbarManager.SHORT_DURATION_MS /* 1500 */:
                            sArr17 = sArr46;
                            m69816 = (C2105.m6981("֡ۘ") ^ i51) * (-49);
                            i31 = ((m69816 ^ i50) * (-3991)) ^ 802305966;
                            i32 = 1578927034;
                            break;
                        case 1501:
                            sArr17 = sArr46;
                            m69816 = (C2105.m6981("ܺܺ") ^ i51) * (-7);
                            i31 = ((m69816 ^ i50) * 15273) ^ (-987106261);
                            i32 = -506132208;
                            break;
                        case 1502:
                            m69816 = C0630.m2566("᩻ۘ") ^ i50;
                            sArr17 = sArr46;
                            i31 = ((m69816 ^ i51) * 21207) ^ (-1662091835);
                            i32 = 1540540010;
                            break;
                        default:
                            sArr17 = sArr46;
                            m69816 = (C0630.m2566("᩺᩵") ^ i50) * (-65);
                            i31 = ((m69816 ^ i51) * (-17059)) ^ (-1654434901);
                            i32 = 573563937;
                            break;
                    }
                    i33 = m69816 ^ i32;
                    str24 = str7;
                    str23 = str8;
                    str21 = str9;
                    sArr33 = sArr15;
                    i65 = i30;
                    sArr34 = sArr14;
                    i63 = i29;
                    sArr32 = sArr17;
                    sArr36 = sArr16;
                    i64 = i28;
                    i62 = i27;
                    i54 = i26;
                    sArr27 = sArr13;
                    i53 = i33;
                    i52 = i31;
                    sArr35 = sArr27;
                case -543823859:
                case 710346974:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (RunnableC1937.m6373()) {
                        m69813 = C0630.m2566("ۗۗ") ^ i51;
                        i17 = ((m69813 ^ i50) * 21759) ^ (-1133694689);
                        i18 = -911853855;
                        int i72222222 = m69813 ^ i18;
                        i52 = i17;
                        str23 = str5;
                        str21 = str6;
                        sArr33 = sArr8;
                        sArr34 = sArr7;
                        i66 = i12;
                        i65 = i14;
                        sArr35 = sArr6;
                        i53 = i72222222;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i54 = i11;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    } else {
                        m69812 = (C0630.m2566("ᩳۛ") + i50) * (-57);
                        i15 = ((m69812 ^ i51) * (-293)) ^ 555703026;
                        i16 = 639696816;
                        i22 = m69812 ^ i16;
                        str23 = str5;
                        str21 = str6;
                        sArr33 = sArr8;
                        sArr34 = sArr7;
                        i66 = i12;
                        i65 = i14;
                        sArr35 = sArr6;
                        i53 = i22;
                        i52 = i15;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i54 = i11;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                case -524871732:
                case 578626385:
                    objArr = new Object[i54];
                    objArr[i55] = str28;
                    sArr35 = f5580;
                    i69 = 122;
                    i57 = 3;
                    if (C1420.f5096 > 0) {
                        m2566 = C0630.m2566("᩸᩹") ^ i51;
                        i = ((m2566 ^ i50) * 7429) ^ (-996713159);
                        i2 = 163155668;
                        i53 = m2566 ^ i2;
                        i52 = i;
                    }
                    m2566 = C2105.m6981("ۡ۟") ^ i50;
                    i = ((m2566 ^ i51) * 13245) ^ (-1255186084);
                    i2 = -2093268743;
                    i53 = m2566 ^ i2;
                    i52 = i;
                case -457401348:
                case 193372222:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    sArr11 = sArr33;
                    str2 = str24;
                    i12 = i66;
                    str5 = str23;
                    i5 = i62;
                    i6 = i64;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != 1803) {
                        m69815 = (C0630.m2566("ۙܰ") ^ i50) * (-33);
                        i20 = ((m69815 ^ i51) * 5573) ^ 1138211512;
                        i21 = -251274449;
                        int i7322222222222 = m69815 ^ i21;
                        i66 = i12;
                        str23 = str5;
                        str21 = str6;
                        sArr35 = sArr6;
                        i53 = i7322222222222;
                        i52 = i20;
                        sArr33 = sArr11;
                        i65 = i14;
                        i54 = i11;
                        sArr34 = sArr7;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                    m69815 = (i51 - C2105.m6981("ۢ᩶")) * 49;
                    i20 = ((m69815 ^ i50) * (-32567)) ^ 1385112282;
                    i21 = 47009808;
                    int i73222222222222 = m69815 ^ i21;
                    i66 = i12;
                    str23 = str5;
                    str21 = str6;
                    sArr35 = sArr6;
                    i53 = i73222222222222;
                    i52 = i20;
                    sArr33 = sArr11;
                    i65 = i14;
                    i54 = i11;
                    sArr34 = sArr7;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -413564965:
                case -143925444:
                    return ServiceConnectionC3453.m10562(C2105.m6981(str26) ^ 2125036902);
                case -401250547:
                case 725730084:
                    sArr28 = sArr35;
                    i11 = i54;
                    sArr29 = sArr34;
                    str18 = str23;
                    str19 = str21;
                    str29 = ServiceConnectionC3453.m10562(i67);
                    m25664 = C0630.m2566("۟ܽ") ^ i50;
                    i45 = ((m25664 ^ i51) * 365) ^ 1864599968;
                    i46 = 2050971895;
                    i37 = m25664 ^ i46;
                    str21 = str19;
                    str23 = str18;
                    i52 = i45;
                    sArr35 = sArr28;
                    sArr34 = sArr29;
                    i53 = i37;
                    i54 = i11;
                case -358610961:
                case 1635176957:
                    return ServiceConnectionC3453.m10562(C0630.m2566(C0483.m2128(f5580, UMErrorCode.E_UM_BE_JSON_FAILED, 3, i71)) ^ 2129142566);
                case -318182945:
                case 2056085456:
                    str28 = C4075.m12251(i58);
                    sArr12 = sArr35;
                    i47 = i54;
                    sArr30 = sArr34;
                    str20 = str21;
                    m69818 = (C0630.m2566("ۢۤ") ^ i50) * 115;
                    i48 = ((m69818 ^ i51) * (-28451)) ^ 554764438;
                    i49 = 388371714;
                    i25 = m69818 ^ i49;
                    str21 = str20;
                    i52 = i48;
                    i54 = i47;
                    sArr34 = sArr30;
                    sArr27 = sArr12;
                    i53 = i25;
                    sArr35 = sArr27;
                case -318123760:
                case 44657647:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != -2) {
                        m69812 = C2105.m6981("᩸ۚ") ^ i51;
                        i15 = ((m69812 ^ i50) * 1687) ^ 725161434;
                        i16 = 428190106;
                    } else {
                        m69812 = C0630.m2566("ܽۢ") ^ i50;
                        i15 = ((m69812 ^ i51) * 2701) ^ (-1384314138);
                        i16 = -219350033;
                    }
                    i22 = m69812 ^ i16;
                    str23 = str5;
                    str21 = str6;
                    sArr33 = sArr8;
                    sArr34 = sArr7;
                    i66 = i12;
                    i65 = i14;
                    sArr35 = sArr6;
                    i53 = i22;
                    i52 = i15;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i54 = i11;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -284990356:
                case 1641888577:
                    sArr13 = sArr35;
                    i26 = i54;
                    short[] sArr47 = sArr34;
                    String str36 = str24;
                    String str37 = str23;
                    String str38 = str21;
                    short[] sArr48 = sArr33;
                    int i87 = i65;
                    int m25669 = C0630.m2566(C3537.m10748(sArr48, i87, 3, i71)) ^ 2118912609;
                    switch (i66) {
                        case 1600:
                            str14 = str38;
                            str15 = str37;
                            m25663 = C0630.m2566("ۜܶ") ^ i51;
                            i31 = ((m25663 ^ i50) * 15149) ^ (-1923875564);
                            i42 = 1041729892;
                            break;
                        case 1601:
                            str14 = str38;
                            m25663 = C2105.m6981("ۤۡ") ^ i50;
                            str15 = str37;
                            i31 = ((m25663 ^ i51) * (-4331)) ^ (-1459774532);
                            i42 = 1161624797;
                            break;
                        case 1602:
                            int m256610 = (i51 - C0630.m2566("᩷֨")) * (-5);
                            i52 = ((m256610 ^ i50) * (-16551)) ^ 107165164;
                            str23 = str37;
                            str24 = str36;
                            str21 = str38;
                            sArr35 = sArr13;
                            i65 = i87;
                            i53 = m256610 ^ 1317662403;
                            i58 = m25669;
                            sArr33 = sArr48;
                            i54 = i26;
                            sArr34 = sArr47;
                            continue;
                        default:
                            str14 = str38;
                            str15 = str37;
                            m25663 = (i50 - C0630.m2566("ۙ۠")) * 123;
                            i31 = ((m25663 ^ i51) * (-31625)) ^ 1010178951;
                            i42 = 1352504709;
                            break;
                    }
                    i33 = m25663 ^ i42;
                    str24 = str36;
                    str23 = str15;
                    str21 = str14;
                    sArr33 = sArr48;
                    i65 = i87;
                    sArr34 = sArr47;
                    i58 = m25669;
                    i54 = i26;
                    sArr27 = sArr13;
                    i53 = i33;
                    i52 = i31;
                    sArr35 = sArr27;
                case -198648436:
                case 1584433907:
                    sArr12 = sArr35;
                    i47 = i54;
                    sArr30 = sArr34;
                    str20 = str21;
                    if (ViewOnClickListenerC1958.m6437(str30, str20)) {
                        m69818 = C2105.m6981("ۢ֨") ^ i50;
                        i48 = ((m69818 ^ i51) * (-17403)) ^ 1109778042;
                        i49 = -655674310;
                        i25 = m69818 ^ i49;
                        str21 = str20;
                        i52 = i48;
                        i54 = i47;
                        sArr34 = sArr30;
                        sArr27 = sArr12;
                        i53 = i25;
                        sArr35 = sArr27;
                    } else {
                        str28 = str25;
                        m69818 = (C0630.m2566("ۢۤ") ^ i50) * 115;
                        i48 = ((m69818 ^ i51) * (-28451)) ^ 554764438;
                        i49 = 388371714;
                        i25 = m69818 ^ i49;
                        str21 = str20;
                        i52 = i48;
                        i54 = i47;
                        sArr34 = sArr30;
                        sArr27 = sArr12;
                        i53 = i25;
                        sArr35 = sArr27;
                    }
                case -185124068:
                case 189912690:
                    sArr28 = sArr35;
                    i11 = i54;
                    sArr29 = sArr34;
                    m3595 = str23;
                    str17 = str21;
                    str25 = ViewOnClickListenerC1958.m6440(c23881);
                    str30 = RunnableC1937.m6378(str25);
                    AbstractC2021.m6565(str30);
                    str16 = str24;
                    if (C1294.m4369(str30, str16)) {
                        m69817 = (C0630.m2566("۟ܳ") + i50) * (-117);
                        i43 = ((m69817 ^ i51) * (-22875)) ^ (-430567014);
                        i44 = 1107016765;
                    } else {
                        m69817 = C2105.m6981("᩸ܰ") ^ i51;
                        i43 = ((m69817 ^ i50) * 3675) ^ (-843990742);
                        i44 = -707299041;
                    }
                    i37 = m69817 ^ i44;
                    str21 = str17;
                    str23 = m3595;
                    i52 = i43;
                    str24 = str16;
                    sArr35 = sArr28;
                    sArr34 = sArr29;
                    i53 = i37;
                    i54 = i11;
                case -56249149:
                case 1009067747:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    sArr11 = sArr33;
                    str2 = str24;
                    i12 = i66;
                    str5 = str23;
                    i5 = i62;
                    i6 = i64;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    i55 = 0;
                    if (i12 != 8) {
                        m69815 = (C0630.m2566("᩷᩹") ^ i51) * 71;
                        i20 = ((m69815 ^ i50) * (-21707)) ^ (-661691108);
                        i21 = -448788801;
                    } else {
                        m69815 = (C2105.m6981("֡᩷") ^ i50) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i20 = ((m69815 ^ i51) * (-24015)) ^ 681827529;
                        i21 = 1050952795;
                    }
                    int i732222222222222 = m69815 ^ i21;
                    i66 = i12;
                    str23 = str5;
                    str21 = str6;
                    sArr35 = sArr6;
                    i53 = i732222222222222;
                    i52 = i20;
                    sArr33 = sArr11;
                    i65 = i14;
                    i54 = i11;
                    sArr34 = sArr7;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case -3153228:
                case 927019811:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != 5) {
                        m69812 = C0630.m2566("ۗ۟") ^ i50;
                        i15 = ((m69812 ^ i51) * (-31591)) ^ 539202536;
                        i16 = 1465947476;
                    } else {
                        m69812 = C2105.m6981("֫֨") ^ i50;
                        i15 = ((m69812 ^ i51) * (-14711)) ^ 1780839145;
                        i16 = 1607707509;
                    }
                    i22 = m69812 ^ i16;
                    str23 = str5;
                    str21 = str6;
                    sArr33 = sArr8;
                    sArr34 = sArr7;
                    i66 = i12;
                    i65 = i14;
                    sArr35 = sArr6;
                    i53 = i22;
                    i52 = i15;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i54 = i11;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case 100541152:
                case 1170708970:
                    if (C1128.f4106 > 0) {
                        sArr = sArr35;
                        i3 = i54;
                        sArr2 = sArr34;
                        s = s2;
                        str2 = str24;
                        i4 = i66;
                        i5 = i62;
                        i6 = i64;
                        sArr3 = sArr33;
                        str3 = str23;
                        sArr4 = sArr36;
                        sArr5 = sArr32;
                        i7 = i63;
                        i8 = i65;
                        str4 = str21;
                        m6981 = C2105.m6981("ܰ᩶") ^ i51;
                        i9 = ((m6981 ^ i50) * (-25143)) ^ (-738849570);
                        i10 = -1614850023;
                        int i7822 = m6981 ^ i10;
                        s2 = s;
                        str23 = str3;
                        str21 = str4;
                        sArr33 = sArr3;
                        i54 = i3;
                        i66 = i4;
                        i65 = i8;
                        sArr35 = sArr;
                        i53 = i7822;
                        i52 = i9;
                        i63 = i7;
                        sArr32 = sArr5;
                        sArr36 = sArr4;
                        sArr34 = sArr2;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    } else {
                        m2566 = C2105.m6981("ۡ۟") ^ i50;
                        i = ((m2566 ^ i51) * 13245) ^ (-1255186084);
                        i2 = -2093268743;
                        i53 = m2566 ^ i2;
                        i52 = i;
                    }
                case 123699480:
                case 910404695:
                    return C4075.m12251(C2105.m6981(C0964.m3396(f5580, 47, 3, i71)) ^ 2119095353);
                case 136236134:
                case 1936026015:
                    sArr13 = sArr35;
                    i26 = i54;
                    sArr14 = sArr34;
                    i27 = i62;
                    i28 = i64;
                    sArr15 = sArr33;
                    str7 = str24;
                    str8 = str23;
                    sArr16 = sArr36;
                    sArr17 = sArr32;
                    i29 = i63;
                    i30 = i65;
                    str9 = str21;
                    switch (i66) {
                        case 1100:
                            m69816 = (C0630.m2566("ܿܶ") + i51) * (-19);
                            i31 = ((m69816 ^ i50) * 29469) ^ (-440558346);
                            i32 = 395934998;
                            break;
                        case 1101:
                            m69816 = C2105.m6981("ܽ֫") ^ i50;
                            i31 = ((m69816 ^ i51) * 12895) ^ 1467040623;
                            i32 = -68390180;
                            break;
                        case 1102:
                            m69816 = (i50 - C0630.m2566("᩸᩶")) * (-57);
                            i31 = ((m69816 ^ i51) * (-15479)) ^ (-1392045511);
                            i32 = -1158053235;
                            break;
                        case 1103:
                            m69816 = C0630.m2566("ۧܰ") ^ i51;
                            i31 = ((m69816 ^ i50) * (-28561)) ^ 833701440;
                            i32 = 1409981623;
                            break;
                        case 1104:
                            m69816 = (C2105.m6981("ۚ۫") ^ i50) * 65;
                            i31 = ((m69816 ^ i51) * (-10415)) ^ 1532928893;
                            i32 = -747541364;
                            break;
                        case 1105:
                            m69816 = C0630.m2566("ܺ֫") ^ i51;
                            i31 = ((m69816 ^ i50) * 32757) ^ (-641916422);
                            i32 = -1382370412;
                            break;
                        default:
                            m69816 = C0630.m2566("᩷ۧ") ^ i50;
                            i31 = ((m69816 ^ i51) * (-26169)) ^ (-2097469927);
                            i32 = -393237138;
                            break;
                    }
                    i33 = m69816 ^ i32;
                    str24 = str7;
                    str23 = str8;
                    str21 = str9;
                    sArr33 = sArr15;
                    i65 = i30;
                    sArr34 = sArr14;
                    i63 = i29;
                    sArr32 = sArr17;
                    sArr36 = sArr16;
                    i64 = i28;
                    i62 = i27;
                    i54 = i26;
                    sArr27 = sArr13;
                    i53 = i33;
                    i52 = i31;
                    sArr35 = sArr27;
                case 138277488:
                case 1652771167:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != 6) {
                        m69812 = (i50 - C0630.m2566("ܶ۫")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i15 = ((m69812 ^ i51) * 6883) ^ (-125862041);
                        i16 = -1256402964;
                    } else {
                        m69812 = (i51 - C2105.m6981("ۗ᩷")) * 27;
                        i15 = ((m69812 ^ i50) * (-8077)) ^ (-1360734534);
                        i16 = 1936342331;
                    }
                    i22 = m69812 ^ i16;
                    str23 = str5;
                    str21 = str6;
                    sArr33 = sArr8;
                    sArr34 = sArr7;
                    i66 = i12;
                    i65 = i14;
                    sArr35 = sArr6;
                    i53 = i22;
                    i52 = i15;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i54 = i11;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case 155619692:
                case 586373330:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    int i88 = i62;
                    i6 = i64;
                    sArr11 = sArr33;
                    str2 = str24;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    i12 = i66;
                    if (i12 != 1401) {
                        m69815 = C2105.m6981("᩻۠") ^ i50;
                        i5 = i88;
                        i20 = ((m69815 ^ i51) * 25735) ^ (-15978439);
                        i21 = 1470630022;
                    } else {
                        i5 = i88;
                        m69815 = (C2105.m6981("᩵ܺ") + i51) * (-73);
                        i20 = ((m69815 ^ i50) * 10657) ^ 1280565015;
                        i21 = -1309531729;
                    }
                    int i7322222222222222 = m69815 ^ i21;
                    i66 = i12;
                    str23 = str5;
                    str21 = str6;
                    sArr35 = sArr6;
                    i53 = i7322222222222222;
                    i52 = i20;
                    sArr33 = sArr11;
                    i65 = i14;
                    i54 = i11;
                    sArr34 = sArr7;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case 280656279:
                case 1848834868:
                    return C4075.m12251(C0630.m2566(C2167.m7159(f5580, 80, 3, i71)) ^ 2100097993);
                case 337340683:
                case 480632044:
                    C0714.m2805();
                    if (C3537.m10746() <= 0) {
                        sArr18 = sArr35;
                        i11 = i54;
                        sArr19 = sArr34;
                        i38 = i62;
                        sArr22 = sArr32;
                        i36 = i63;
                        i35 = i64;
                        sArr20 = sArr33;
                        i34 = i65;
                        str10 = str24;
                        str11 = str23;
                        sArr21 = sArr36;
                        int m69811222 = C2105.m6981("᩸᩺") ^ i51;
                        short[] sArr4022 = sArr22;
                        i52 = ((m69811222 ^ i50) * (-27713)) ^ 1215978164;
                        i37 = m69811222 ^ 727841367;
                        str24 = str10;
                        i65 = i34;
                        str23 = str11;
                        sArr33 = sArr20;
                        i63 = i36;
                        sArr32 = sArr4022;
                        sArr36 = sArr21;
                        sArr34 = sArr19;
                        i64 = i35;
                        i62 = i38;
                        sArr35 = sArr18;
                        i53 = i37;
                        i54 = i11;
                    } else {
                        sArr6 = sArr35;
                        i11 = i54;
                        str2 = str24;
                        i12 = i66;
                        i5 = i62;
                        i6 = i64;
                        sArr8 = sArr33;
                        str5 = str23;
                        sArr9 = sArr36;
                        sArr10 = sArr32;
                        i13 = i63;
                        i14 = i65;
                        str6 = str21;
                        int m69811122 = C2105.m6981("ۨᩴ") ^ i50;
                        i15 = ((m69811122 ^ i51) * (-8031)) ^ (-1416642108);
                        i22 = m69811122 ^ (-561918254);
                        str23 = str5;
                        str21 = str6;
                        sArr33 = sArr8;
                        i66 = i12;
                        i65 = i14;
                        sArr35 = sArr6;
                        i53 = i22;
                        i52 = i15;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i54 = i11;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                case 469760404:
                case 1639316861:
                    return C4075.m12251(C2105.m6981(str27) ^ 2128000038);
                case 554269173:
                case 1667127190:
                    return C4075.m12251(C0630.m2566(RunnableC1108.m3789(f5580, 32, 3, i71)) ^ 2101994914);
                case 622255075:
                case 1107436629:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    m69814 = C2105.m6981(C0237.m1483(f5580, 17, 3, i71));
                    i19 = 2123212272;
                    i70 = m69814 ^ i19;
                    m69812 = (i51 - C0630.m2566("ۢ۬")) * (-15);
                    i15 = ((m69812 ^ i50) * 32615) ^ 700268383;
                    i16 = -630675144;
                    i22 = m69812 ^ i16;
                    str23 = str5;
                    str21 = str6;
                    sArr33 = sArr8;
                    sArr34 = sArr7;
                    i66 = i12;
                    i65 = i14;
                    sArr35 = sArr6;
                    i53 = i22;
                    i52 = i15;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i54 = i11;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case 623982266:
                case 893412697:
                    return ServiceConnectionC3453.m10562(C0630.m2566(ServiceConnectionC3453.m10568(f5580, 38, 3, i71)) ^ 2126329510);
                case 815743510:
                case 1090930747:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    sArr11 = sArr33;
                    str2 = str24;
                    i12 = i66;
                    str5 = str23;
                    i5 = i62;
                    i6 = i64;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != 1800) {
                        m69815 = C2105.m6981("᩻֨") ^ i51;
                        i20 = ((m69815 ^ i50) * 155) ^ (-514025143);
                        i21 = 659448373;
                        int i73222222222222222 = m69815 ^ i21;
                        i66 = i12;
                        str23 = str5;
                        str21 = str6;
                        sArr35 = sArr6;
                        i53 = i73222222222222222;
                        i52 = i20;
                        sArr33 = sArr11;
                        i65 = i14;
                        i54 = i11;
                        sArr34 = sArr7;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                    m69815 = (i51 - C2105.m6981("ۢ᩶")) * 49;
                    i20 = ((m69815 ^ i50) * (-32567)) ^ 1385112282;
                    i21 = 47009808;
                    int i732222222222222222 = m69815 ^ i21;
                    i66 = i12;
                    str23 = str5;
                    str21 = str6;
                    sArr35 = sArr6;
                    i53 = i732222222222222222;
                    i52 = i20;
                    sArr33 = sArr11;
                    i65 = i14;
                    i54 = i11;
                    sArr34 = sArr7;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case 833602536:
                case 1289461555:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    str2 = str24;
                    i12 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr8 = sArr33;
                    str5 = str23;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != 2) {
                        m69813 = (i50 - C0630.m2566("᩻᩷")) * (-125);
                        i17 = ((m69813 ^ i51) * (-11889)) ^ 1146981571;
                        i18 = 834988239;
                    } else {
                        m69813 = C0630.m2566("ۡۡ") ^ i51;
                        i17 = ((m69813 ^ i50) * 22899) ^ (-363666649);
                        i18 = 550782936;
                    }
                    int i722222222 = m69813 ^ i18;
                    i52 = i17;
                    str23 = str5;
                    str21 = str6;
                    sArr33 = sArr8;
                    sArr34 = sArr7;
                    i66 = i12;
                    i65 = i14;
                    sArr35 = sArr6;
                    i53 = i722222222;
                    i63 = i13;
                    sArr32 = sArr10;
                    sArr36 = sArr9;
                    i54 = i11;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case 1001889133:
                case 1893672515:
                    sArr28 = sArr35;
                    i11 = i54;
                    sArr29 = sArr34;
                    str16 = str24;
                    str17 = str21;
                    str22 = C1294.m4378(c23881);
                    m3595 = C1047.m3595(str22);
                    RunnableC3474.m10618(m3595);
                    if (ViewOnClickListenerC1958.m6437(m3595, str16)) {
                        m69817 = C2105.m6981("ۨۖ") ^ i50;
                        i43 = ((m69817 ^ i51) * 3973) ^ (-945087724);
                        i44 = -571032320;
                    } else {
                        m69817 = (C0630.m2566("ܳ᩸") + i51) * (-15);
                        i43 = ((m69817 ^ i50) * 5851) ^ 1600625339;
                        i44 = -1419858412;
                    }
                    i37 = m69817 ^ i44;
                    str21 = str17;
                    str23 = m3595;
                    i52 = i43;
                    str24 = str16;
                    sArr35 = sArr28;
                    sArr34 = sArr29;
                    i53 = i37;
                    i54 = i11;
                case 1230940868:
                case 1524395043:
                    sArr = sArr35;
                    i3 = i54;
                    sArr2 = sArr34;
                    s = s2;
                    str2 = str24;
                    i4 = i66;
                    i5 = i62;
                    i6 = i64;
                    sArr3 = sArr33;
                    str3 = str23;
                    sArr4 = sArr36;
                    sArr5 = sArr32;
                    i7 = i63;
                    i8 = i65;
                    str4 = str21;
                    sArr31 = f5580;
                    c = 0;
                    if (C3537.m10746() > 0) {
                        m6981 = (i51 - C2105.m6981("۠ۨ")) * (-51);
                        i9 = ((m6981 ^ i50) * 6203) ^ 449314532;
                        i10 = -1771007729;
                        int i78222 = m6981 ^ i10;
                        s2 = s;
                        str23 = str3;
                        str21 = str4;
                        sArr33 = sArr3;
                        i54 = i3;
                        i66 = i4;
                        i65 = i8;
                        sArr35 = sArr;
                        i53 = i78222;
                        i52 = i9;
                        i63 = i7;
                        sArr32 = sArr5;
                        sArr36 = sArr4;
                        sArr34 = sArr2;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                    m6981 = C2105.m6981("ܰ᩶") ^ i51;
                    i9 = ((m6981 ^ i50) * (-25143)) ^ (-738849570);
                    i10 = -1614850023;
                    int i782222 = m6981 ^ i10;
                    s2 = s;
                    str23 = str3;
                    str21 = str4;
                    sArr33 = sArr3;
                    i54 = i3;
                    i66 = i4;
                    i65 = i8;
                    sArr35 = sArr;
                    i53 = i782222;
                    i52 = i9;
                    i63 = i7;
                    sArr32 = sArr5;
                    sArr36 = sArr4;
                    sArr34 = sArr2;
                    i64 = i6;
                    i62 = i5;
                    str24 = str2;
                case 1274282668:
                case 1934903663:
                    C0050.m940();
                    if (C1047.f3863 < 0) {
                        sArr18 = sArr35;
                        i11 = i54;
                        sArr19 = sArr34;
                        i38 = i62;
                        sArr22 = sArr32;
                        i36 = i63;
                        i35 = i64;
                        sArr20 = sArr33;
                        i34 = i65;
                        str10 = str24;
                        str11 = str23;
                        sArr21 = sArr36;
                        int m698112222 = C2105.m6981("᩸᩺") ^ i51;
                        short[] sArr40222 = sArr22;
                        i52 = ((m698112222 ^ i50) * (-27713)) ^ 1215978164;
                        i37 = m698112222 ^ 727841367;
                        str24 = str10;
                        i65 = i34;
                        str23 = str11;
                        sArr33 = sArr20;
                        i63 = i36;
                        sArr32 = sArr40222;
                        sArr36 = sArr21;
                        sArr34 = sArr19;
                        i64 = i35;
                        i62 = i38;
                        sArr35 = sArr18;
                        i53 = i37;
                        i54 = i11;
                    } else {
                        m2566 = C2105.m6981("᩶ۘ") ^ i50;
                        i = ((m2566 ^ i51) * (-17027)) ^ 1147960609;
                        i2 = -1750896284;
                        i53 = m2566 ^ i2;
                        i52 = i;
                    }
                case 1339851306:
                case 1806329567:
                    objArr2 = new Object[i54];
                    objArr2[i55] = str29;
                    sArr34 = f5580;
                    i59 = 119;
                    i56 = 3;
                    if (C4117.f13076 <= 0) {
                        sArr6 = sArr35;
                        i11 = i54;
                        str2 = str24;
                        i12 = i66;
                        i5 = i62;
                        i6 = i64;
                        sArr8 = sArr33;
                        str5 = str23;
                        sArr9 = sArr36;
                        sArr10 = sArr32;
                        i13 = i63;
                        i14 = i65;
                        str6 = str21;
                        int m698111222 = C2105.m6981("ۨᩴ") ^ i50;
                        i15 = ((m698111222 ^ i51) * (-8031)) ^ (-1416642108);
                        i22 = m698111222 ^ (-561918254);
                        str23 = str5;
                        str21 = str6;
                        sArr33 = sArr8;
                        i66 = i12;
                        i65 = i14;
                        sArr35 = sArr6;
                        i53 = i22;
                        i52 = i15;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i54 = i11;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    } else {
                        m2566 = (C0630.m2566("֨ۡ") + i50) * (-9);
                        i = ((m2566 ^ i51) * (-4903)) ^ 68592463;
                        i2 = -2116425972;
                        i53 = m2566 ^ i2;
                        i52 = i;
                    }
                case 1414201056:
                case 1422301070:
                    throw new RuntimeException(C1128.m3841(f5580, 10, 7, i71));
                case 1468098949:
                case 2108303038:
                    return C4075.m12251(C0630.m2566(C22628.m50602(f5580, 68, 3, i71)) ^ 2099245666);
                case 1580620485:
                case 1802488692:
                    sArr6 = sArr35;
                    i11 = i54;
                    sArr7 = sArr34;
                    sArr11 = sArr33;
                    str2 = str24;
                    i12 = i66;
                    str5 = str23;
                    i5 = i62;
                    i6 = i64;
                    sArr9 = sArr36;
                    sArr10 = sArr32;
                    i13 = i63;
                    i14 = i65;
                    str6 = str21;
                    if (i12 != 9) {
                        m69815 = C0630.m2566("ۨۘ") ^ i50;
                        i20 = ((m69815 ^ i51) * 3097) ^ 762651597;
                        i21 = 1671445178;
                        int i7322222222222222222 = m69815 ^ i21;
                        i66 = i12;
                        str23 = str5;
                        str21 = str6;
                        sArr35 = sArr6;
                        i53 = i7322222222222222222;
                        i52 = i20;
                        sArr33 = sArr11;
                        i65 = i14;
                        i54 = i11;
                        sArr34 = sArr7;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    } else {
                        sArr8 = sArr11;
                        m69813 = C0630.m2566("֨۠") ^ i51;
                        i17 = ((m69813 ^ i50) * 1809) ^ 308145065;
                        i18 = -1824594115;
                        int i7222222222 = m69813 ^ i18;
                        i52 = i17;
                        str23 = str5;
                        str21 = str6;
                        sArr33 = sArr8;
                        sArr34 = sArr7;
                        i66 = i12;
                        i65 = i14;
                        sArr35 = sArr6;
                        i53 = i7222222222;
                        i63 = i13;
                        sArr32 = sArr10;
                        sArr36 = sArr9;
                        i54 = i11;
                        i64 = i6;
                        i62 = i5;
                        str24 = str2;
                    }
                case 1587533486:
                case 1881318409:
                    sArr18 = sArr35;
                    i11 = i54;
                    sArr19 = sArr34;
                    int i89 = i63;
                    int i90 = i64;
                    sArr20 = sArr33;
                    i34 = i65;
                    str10 = str24;
                    str11 = str23;
                    sArr21 = sArr36;
                    i35 = i90;
                    i36 = i89;
                    str21 = ServiceConnectionC3453.m10568(f5580, 83, 2, i71);
                    sArr22 = f5580;
                    if (C4075.f12947 >= 0) {
                        i38 = 85;
                        int m6981122222 = C2105.m6981("᩸᩺") ^ i51;
                        short[] sArr402222 = sArr22;
                        i52 = ((m6981122222 ^ i50) * (-27713)) ^ 1215978164;
                        i37 = m6981122222 ^ 727841367;
                        str24 = str10;
                        i65 = i34;
                        str23 = str11;
                        sArr33 = sArr20;
                        i63 = i36;
                        sArr32 = sArr402222;
                        sArr36 = sArr21;
                        sArr34 = sArr19;
                        i64 = i35;
                        i62 = i38;
                        sArr35 = sArr18;
                        i53 = i37;
                        i54 = i11;
                    } else {
                        int m256611 = C0630.m2566("۬ܰ") ^ i51;
                        int i91 = ((m256611 ^ i50) * (-31195)) ^ (-181658041);
                        i37 = m256611 ^ 2050704887;
                        str24 = str10;
                        i65 = i34;
                        sArr36 = sArr21;
                        str23 = str11;
                        sArr33 = sArr20;
                        i64 = i35;
                        i63 = i36;
                        sArr34 = sArr19;
                        i62 = 85;
                        sArr32 = sArr22;
                        i52 = i91;
                        sArr35 = sArr18;
                        i53 = i37;
                        i54 = i11;
                    }
                case 1835927752:
                case 2048330877:
                    sArr28 = sArr35;
                    i11 = i54;
                    sArr29 = sArr34;
                    str18 = str23;
                    str19 = str21;
                    if (ViewOnClickListenerC1958.m6437(str18, str19)) {
                        m25664 = (i51 - C2105.m6981("ᩴۚ")) * 37;
                        i45 = ((m25664 ^ i50) * (-7487)) ^ (-1782691203);
                        i46 = 2072861460;
                        i37 = m25664 ^ i46;
                        str21 = str19;
                        str23 = str18;
                        i52 = i45;
                        sArr35 = sArr28;
                        sArr34 = sArr29;
                        i53 = i37;
                        i54 = i11;
                    } else {
                        str29 = str22;
                        m25664 = C0630.m2566("۟ܽ") ^ i50;
                        i45 = ((m25664 ^ i51) * 365) ^ 1864599968;
                        i46 = 2050971895;
                        i37 = m25664 ^ i46;
                        str21 = str19;
                        str23 = str18;
                        i52 = i45;
                        sArr35 = sArr28;
                        sArr34 = sArr29;
                        i53 = i37;
                        i54 = i11;
                    }
                default:
                    return C1294.m4378(c23881);
            }
        }
    }
}
