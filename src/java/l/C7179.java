package l;

import android.content.SharedPreferences;
import android.util.Base64;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.alipay.sdk.m.y.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: W8UC */
/* renamed from: l.۟ۖۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7179 {

    /* renamed from: ᩺ᩴۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f21978 = {8309, 4207, 4222, 4216, 4218, 4131, 4216, 4218, 4203, 4146, 4201, 4222, 4211, 4202, 4218, 4204, 4129, 4151, 4145, 4145, 4145, 4150, 4209, 4222, 4210, 4218, 4216, 4218, 4203, 4172, 4203, 4205, 4214, 4209, 4216, 4151, 4145, 4145, 4145, 4150, 4207, 4222, 4203, 4215, 4209, 4218, 4203, 4216, 4218, 4203, 4181, 4172, 4176, 4177, 4190, 4205, 4205, 4222, 4198, 4151, 4145, 4145, 4145, 4150, 4215, 4214, 4204, 4203, 4208, 4205, 4198, 4182, 4209, 4219, 4218, 4199, 2381, 22120, 22127, 22120, 22100, 22127, 22130, 22132, 22129, 22129, 22126, 22131, 22133, 22116, 22117, 22049, 22129, 22131, 22116, 22119, 22116, 22131, 22116, 22127, 22114, 22116, 22049, 22133, 22136, 22129, 22116, 22075, 22049, 22118, 22116, 22133, 22091, 22098, 22094, 22095, 22094, 22115, 22123, 22116, 22114, 22133, 22057, 22063, 22063, 22063, 22056, 22124, 22120, 22127, 22120, 22115, 22112, 22130, 22116, 22071, 22069, 22075, 22062, 22062, 22130, 22132, 22115, 22130, 22133, 22131, 22120, 22127, 22118, 22057, 22063, 22063, 22063, 22056, 2271, 25780, 25782, 25767, 25744, 25788, 25789, 25781, 25786, 25780, 25760, 25851, 25853, 25853, 25853, 25850, 25780, 25782, 25767, 25753, 25766, 25790, 25763, 25744, 25788, 25789, 25781, 25786, 25780, 25760, 25851, 25853, 25853, 25853, 25850, 8658, -21304, -21302, -21285, -21268, -21312, -21311, -21303, -21306, -21304, -21284, -21369, -21375, -21375, -21375, -21370, -21304, -21302, -21285, -21275, -21286, -21310, -21281, -21268, -21312, -21311, -21303, -21306, -21304, -21284, -21369, -21375, -21375, -21375, -21370};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19198(JSONObject jSONObject) {
        int m6981;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        String str;
        String str2;
        String str3;
        String str4;
        int i6;
        JSONObject jSONObject2;
        int[] iArr2;
        short[] sArr;
        int i7;
        int i8;
        String str5;
        short[] sArr2;
        SharedPreferences.Editor editor;
        short[] sArr3;
        int i9;
        int i10;
        int i11;
        int m2566;
        int i12;
        int i13;
        String str6;
        int i14;
        int[] iArr3;
        short[] sArr4;
        int i15;
        String str7;
        short[] sArr5;
        int i16;
        int i17;
        int i18;
        int i19;
        String m2575;
        int m69812;
        int i20;
        int i21;
        String str8;
        short[] sArr6;
        int m69813;
        int i22;
        int i23;
        String str9;
        String str10;
        int i24;
        int[] iArr4;
        int i25;
        String str11;
        int i26;
        JSONObject jSONObject3;
        short[] sArr7;
        SharedPreferences.Editor editor2;
        int i27;
        int i28;
        String str12;
        String m6385;
        int m69814;
        int i29;
        int i30;
        String str13;
        short[] sArr8;
        String str14;
        String str15;
        int i31;
        SharedPreferences.Editor editor3;
        int[] iArr5;
        int i32;
        int i33;
        int i34;
        int i35;
        String str16;
        JSONObject jSONObject4;
        int m25662;
        JSONObject jSONObject5;
        int i36;
        String str17;
        String str18;
        int i37;
        JSONObject jSONObject6;
        int i38;
        int[] iArr6;
        int i39;
        int i40;
        short[] sArr9;
        SharedPreferences.Editor editor4;
        String str19;
        int i41;
        String str20;
        int i42;
        JSONObject jSONObject7;
        int i43;
        int m25663;
        int i44;
        int i45;
        int i46;
        int i47;
        int m69815;
        int i48;
        int i49;
        int i50;
        int m69816;
        int i51;
        int i52;
        int m25664;
        int i53;
        int m69817;
        int i54;
        short s = 0;
        int i55 = 0;
        int i56 = 2118498875;
        int i57 = RunnableC3474.f10992;
        int i58 = C0050.f910;
        int m69818 = C2105.m6981("ۨۙ") ^ i58;
        int i59 = ((m69818 ^ i57) * 9585) ^ 304022776;
        int i60 = m69818 ^ 1619737288;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        C12823 c12823 = null;
        SharedPreferences.Editor editor5 = null;
        C2946 c2946 = null;
        JSONArray jSONArray = null;
        String str24 = null;
        String str25 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        boolean z = false;
        String str26 = null;
        int i64 = 0;
        int i65 = 0;
        int i66 = 0;
        int i67 = 0;
        int i68 = 0;
        int i69 = 0;
        JSONObject jSONObject8 = null;
        C2946 c29462 = null;
        int[] iArr7 = null;
        int i70 = 0;
        C12823 c128232 = null;
        Iterator it = null;
        JSONObject jSONObject9 = null;
        InterfaceC13049 interfaceC13049 = null;
        String str27 = null;
        Iterator it2 = null;
        int i71 = 0;
        while (true) {
            i56 = i60 ^ (i59 & (((i56 ^ i57) * (-29117)) >> 31));
            switch (i56) {
                case -2118569513:
                case 392719850:
                    str13 = str25;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    i43 = i64;
                    editor3 = editor5;
                    str11 = str21;
                    C7106.m19107(interfaceC13049);
                    C8239.m21820();
                    DialogInterfaceOnDismissListenerC15010.m35542();
                    C14981.m35471();
                    if (!C1420.m4913()) {
                        m25663 = C2105.m6981("ۘۚ") ^ i57;
                        i44 = ((m25663 ^ i58) * 8777) ^ 157517950;
                        i45 = -1560175915;
                        i60 = m25663 ^ i45;
                        editor5 = editor3;
                        sArr13 = sArr8;
                        i62 = i35;
                        jSONObject8 = jSONObject7;
                        i66 = i34;
                        str25 = str13;
                        i65 = i42;
                        i59 = i44;
                        str21 = str11;
                        i64 = i43;
                        i61 = i32;
                        iArr7 = iArr5;
                    }
                    m25663 = C2105.m6981("ۘܽ") ^ i57;
                    i44 = ((m25663 ^ i58) * (-2087)) ^ (-1702006215);
                    i45 = 1264422204;
                    i60 = m25663 ^ i45;
                    editor5 = editor3;
                    sArr13 = sArr8;
                    i62 = i35;
                    jSONObject8 = jSONObject7;
                    i66 = i34;
                    str25 = str13;
                    i65 = i42;
                    i59 = i44;
                    str21 = str11;
                    i64 = i43;
                    i61 = i32;
                    iArr7 = iArr5;
                case -2114016009:
                case 1954393388:
                    str13 = str25;
                    sArr8 = sArr13;
                    str14 = str26;
                    str15 = str23;
                    i31 = i64;
                    editor3 = editor5;
                    iArr5 = iArr7;
                    i32 = i61;
                    str11 = str21;
                    i33 = i65;
                    i34 = i66;
                    i35 = i62;
                    str16 = str22;
                    jSONObject4 = jSONObject.getJSONObject(str14);
                    C2126.m7031(jSONObject4, str16);
                    int i72 = C11413.f34113;
                    c12823 = C11413.m28170();
                    if (C3432.f10845 < 0) {
                        m25662 = (C0630.m2566("᩺ۡ") ^ i58) * (-89);
                        jSONObject5 = jSONObject4;
                        i59 = ((m25662 ^ i57) * (-7427)) ^ (-1619197079);
                        i36 = 558749259;
                        i60 = m25662 ^ i36;
                        str21 = str11;
                        i61 = i32;
                        iArr7 = iArr5;
                        i64 = i31;
                        str23 = str15;
                        str26 = str14;
                        str25 = str13;
                        JSONObject jSONObject10 = jSONObject5;
                        str22 = str16;
                        i62 = i35;
                        i66 = i34;
                        i65 = i33;
                        editor5 = editor3;
                        sArr13 = sArr8;
                        jSONObject8 = jSONObject10;
                    }
                    m25662 = (i57 - C2105.m6981("ۨ֫")) * 127;
                    jSONObject5 = jSONObject4;
                    i59 = ((m25662 ^ i58) * 3847) ^ (-1529911022);
                    i36 = 501954095;
                    i60 = m25662 ^ i36;
                    str21 = str11;
                    i61 = i32;
                    iArr7 = iArr5;
                    i64 = i31;
                    str23 = str15;
                    str26 = str14;
                    str25 = str13;
                    JSONObject jSONObject102 = jSONObject5;
                    str22 = str16;
                    i62 = i35;
                    i66 = i34;
                    i65 = i33;
                    editor5 = editor3;
                    sArr13 = sArr8;
                    jSONObject8 = jSONObject102;
                case -2087605929:
                case 1894018770:
                    str13 = str25;
                    jSONObject7 = jSONObject8;
                    iArr5 = iArr7;
                    i32 = i61;
                    sArr8 = sArr13;
                    editor3 = editor5;
                    int i73 = i66;
                    i35 = i62;
                    interfaceC13049.mo25853(jSONObject9.getInt(RunnableC0588.m2431(c2946)), C3683.m11215(c2946));
                    i42 = i65;
                    i34 = i73;
                    i43 = i64;
                    str11 = str21;
                    str19 = str23;
                    int m69819 = C2105.m6981("ۢ᩵") ^ i58;
                    i41 = i43;
                    int i74 = ((m69819 ^ i57) * (-11577)) ^ (-148249733);
                    i60 = m69819 ^ (-472685581);
                    editor5 = editor3;
                    sArr13 = sArr8;
                    i62 = i35;
                    jSONObject8 = jSONObject7;
                    i66 = i34;
                    str25 = str13;
                    i65 = i42;
                    i59 = i74;
                    i61 = i32;
                    iArr7 = iArr5;
                    i46 = i41;
                    str23 = str19;
                    str21 = str11;
                    i64 = i46;
                case -1906574182:
                case 849313257:
                    str = str25;
                    str2 = str26;
                    str3 = str22;
                    str4 = str23;
                    i6 = i64;
                    jSONObject2 = jSONObject8;
                    iArr2 = iArr7;
                    sArr = sArr10;
                    i7 = i68;
                    i8 = i61;
                    str5 = str21;
                    sArr2 = sArr13;
                    editor = editor5;
                    sArr3 = sArr11;
                    i9 = i65;
                    i10 = i66;
                    i11 = i62;
                    i55 = s * 2;
                    if (C4263.f13799 > 0) {
                        m2566 = C2105.m6981("ۖᩴ") ^ i58;
                        i12 = ((m2566 ^ i57) * 16511) ^ 1701319303;
                        i13 = 556204399;
                        sArr11 = sArr3;
                        str21 = str5;
                        i61 = i8;
                        i68 = i7;
                        sArr10 = sArr;
                        i60 = m2566 ^ i13;
                        i59 = i12;
                        iArr7 = iArr2;
                        i64 = i6;
                        i62 = i11;
                        str23 = str4;
                        i66 = i10;
                        i65 = i9;
                        str26 = str2;
                        editor5 = editor;
                        sArr13 = sArr2;
                        str25 = str;
                        jSONObject8 = jSONObject2;
                        str22 = str3;
                    }
                    m2566 = C0630.m2566("ۧ֨") ^ i58;
                    i12 = ((m2566 ^ i57) * 3901) ^ 329735559;
                    i13 = -310414435;
                    sArr11 = sArr3;
                    str21 = str5;
                    i61 = i8;
                    i68 = i7;
                    sArr10 = sArr;
                    i60 = m2566 ^ i13;
                    i59 = i12;
                    iArr7 = iArr2;
                    i64 = i6;
                    i62 = i11;
                    str23 = str4;
                    i66 = i10;
                    i65 = i9;
                    str26 = str2;
                    editor5 = editor;
                    sArr13 = sArr2;
                    str25 = str;
                    jSONObject8 = jSONObject2;
                    str22 = str3;
                case -1897646791:
                case 793058208:
                    ViewOnClickListenerC1958.m6429();
                    C1504.m5179();
                    return;
                case -1892260063:
                case -1565842238:
                    iArr5 = iArr7;
                    interfaceC13049.mo25856(RunnableC0588.m2431(c2946), iArr5);
                    i32 = i61;
                    str13 = str25;
                    i43 = i64;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    i35 = i62;
                    str11 = str21;
                    sArr8 = sArr13;
                    str19 = str23;
                    editor3 = editor5;
                    int m698192 = C2105.m6981("ۢ᩵") ^ i58;
                    i41 = i43;
                    int i742 = ((m698192 ^ i57) * (-11577)) ^ (-148249733);
                    i60 = m698192 ^ (-472685581);
                    editor5 = editor3;
                    sArr13 = sArr8;
                    i62 = i35;
                    jSONObject8 = jSONObject7;
                    i66 = i34;
                    str25 = str13;
                    i65 = i42;
                    i59 = i742;
                    i61 = i32;
                    iArr7 = iArr5;
                    i46 = i41;
                    str23 = str19;
                    str21 = str11;
                    i64 = i46;
                case -1869174784:
                case -1024750470:
                    str9 = str25;
                    int i75 = i65;
                    JSONObject jSONObject11 = jSONObject8;
                    i28 = i66;
                    iArr4 = iArr7;
                    i25 = i61;
                    i26 = i62;
                    sArr7 = sArr13;
                    int i76 = i64;
                    editor2 = editor5;
                    str11 = str21;
                    DialogInterfaceOnDismissListenerC17128.m40151();
                    C13096.m31742();
                    C1534.m5245();
                    ApplicationC20075.m46267();
                    i27 = i75;
                    str12 = str22;
                    m6385 = str23;
                    i24 = i76;
                    jSONObject3 = jSONObject11;
                    str10 = str26;
                    m69814 = C0630.m2566("֨ۜ") ^ i57;
                    i29 = ((m69814 ^ i58) * 15347) ^ 616673356;
                    i30 = -1618360999;
                    i60 = m69814 ^ i30;
                    str26 = str10;
                    i62 = i26;
                    i61 = i25;
                    str25 = str9;
                    iArr7 = iArr4;
                    i66 = i28;
                    i65 = i27;
                    editor5 = editor2;
                    sArr13 = sArr7;
                    jSONObject8 = jSONObject3;
                    str22 = str12;
                    i46 = i24;
                    str23 = m6385;
                    i59 = i29;
                    str21 = str11;
                    i64 = i46;
                case -1860542512:
                case 276683242:
                    C2126.m7031(str25, C0422.m1955(sArr13, i61, 14, i71));
                    interfaceC13049.mo25855(str24, Base64.decode(str25, i62));
                    m6981 = (C0630.m2566("ۗ֨") ^ i58) * (-75);
                    i = ((m6981 ^ i57) * (-17313)) ^ (-566729367);
                    i2 = 1528593539;
                    i60 = m6981 ^ i2;
                    i59 = i;
                case -1848877393:
                case -1446088157:
                    str13 = str25;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    i43 = i64;
                    editor3 = editor5;
                    str11 = str21;
                    InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
                    str19 = str23;
                    C4159.m12575(interfaceC12344, str19);
                    InterfaceC13049 m6438 = ViewOnClickListenerC1958.m6438(interfaceC12344);
                    it = C2958.m9029(c128232);
                    interfaceC13049 = m6438;
                    int m6981922 = C2105.m6981("ۢ᩵") ^ i58;
                    i41 = i43;
                    int i7422 = ((m6981922 ^ i57) * (-11577)) ^ (-148249733);
                    i60 = m6981922 ^ (-472685581);
                    editor5 = editor3;
                    sArr13 = sArr8;
                    i62 = i35;
                    jSONObject8 = jSONObject7;
                    i66 = i34;
                    str25 = str13;
                    i65 = i42;
                    i59 = i7422;
                    i61 = i32;
                    iArr7 = iArr5;
                    i46 = i41;
                    str23 = str19;
                    str21 = str11;
                    i64 = i46;
                case -1841294303:
                case -798777850:
                    if (i63 == 5) {
                        m6981 = (C0630.m2566("ۢۚ") + i57) * (-127);
                        i = ((m6981 ^ i58) * 7945) ^ (-1288075299);
                        i2 = -868395310;
                    } else {
                        m6981 = (i58 - C0630.m2566("ۤ᩸")) * q.h;
                        i = ((m6981 ^ i57) * 21693) ^ (-508431153);
                        i2 = -1831296505;
                    }
                    i60 = m6981 ^ i2;
                    i59 = i;
                case -1818445848:
                case 841310058:
                    str13 = str25;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    i43 = i64;
                    editor3 = editor5;
                    str11 = str21;
                    i42 = c29462.m8970();
                    if (i42 != 0) {
                        m25663 = (i58 - C2105.m6981("ۧܰ")) * 43;
                        i44 = ((m25663 ^ i57) * (-5147)) ^ 482878816;
                        i45 = -1678362754;
                    } else {
                        m25663 = (C2105.m6981("ᩴۛ") ^ i57) * (-13);
                        i44 = ((m25663 ^ i58) * 30599) ^ (-619644404);
                        i45 = 2119535784;
                    }
                    i60 = m25663 ^ i45;
                    editor5 = editor3;
                    sArr13 = sArr8;
                    i62 = i35;
                    jSONObject8 = jSONObject7;
                    i66 = i34;
                    str25 = str13;
                    i65 = i42;
                    i59 = i44;
                    str21 = str11;
                    i64 = i43;
                    i61 = i32;
                    iArr7 = iArr5;
                case -1778434942:
                case 662489359:
                    C0237.m1481();
                    if (C2126.f7087) {
                        str13 = str25;
                        str14 = str26;
                        str15 = str23;
                        i31 = i64;
                        jSONObject4 = jSONObject8;
                        iArr5 = iArr7;
                        i32 = i61;
                        str11 = str21;
                        sArr8 = sArr13;
                        editor3 = editor5;
                        i33 = i65;
                        i34 = i66;
                        i35 = i62;
                        str16 = str22;
                        m25662 = (i57 - C2105.m6981("ۨ֫")) * 127;
                        jSONObject5 = jSONObject4;
                        i59 = ((m25662 ^ i58) * 3847) ^ (-1529911022);
                        i36 = 501954095;
                        i60 = m25662 ^ i36;
                        str21 = str11;
                        i61 = i32;
                        iArr7 = iArr5;
                        i64 = i31;
                        str23 = str15;
                        str26 = str14;
                        str25 = str13;
                        JSONObject jSONObject1022 = jSONObject5;
                        str22 = str16;
                        i62 = i35;
                        i66 = i34;
                        i65 = i33;
                        editor5 = editor3;
                        sArr13 = sArr8;
                        jSONObject8 = jSONObject1022;
                    } else {
                        m6981 = C2105.m6981("ۢ֡") ^ i58;
                        i = ((m6981 ^ i57) * (-5885)) ^ 2064158861;
                        i2 = -2070432129;
                        i60 = m6981 ^ i2;
                        i59 = i;
                    }
                case -1697266171:
                case 1228687208:
                    str9 = str25;
                    str10 = str26;
                    i24 = i64;
                    iArr4 = iArr7;
                    i25 = i61;
                    str11 = str21;
                    int i77 = i66;
                    i26 = i62;
                    String str28 = str22;
                    jSONObject3 = jSONObject8;
                    sArr7 = sArr13;
                    editor2 = editor5;
                    i27 = i65;
                    i28 = i77;
                    str12 = str28;
                    m6385 = RunnableC1937.m6385(f21978, 127, 4, i71);
                    if (jSONObject.contains(m6385)) {
                        m69814 = C2105.m6981("۟ۛ") ^ i57;
                        i29 = ((m69814 ^ i58) * 5811) ^ 1386996882;
                        i30 = 1470989233;
                        i60 = m69814 ^ i30;
                        str26 = str10;
                        i62 = i26;
                        i61 = i25;
                        str25 = str9;
                        iArr7 = iArr4;
                        i66 = i28;
                        i65 = i27;
                        editor5 = editor2;
                        sArr13 = sArr7;
                        jSONObject8 = jSONObject3;
                        str22 = str12;
                        i46 = i24;
                        str23 = m6385;
                        i59 = i29;
                        str21 = str11;
                        i64 = i46;
                    }
                    m69814 = C0630.m2566("֨ۜ") ^ i57;
                    i29 = ((m69814 ^ i58) * 15347) ^ 616673356;
                    i30 = -1618360999;
                    i60 = m69814 ^ i30;
                    str26 = str10;
                    i62 = i26;
                    i61 = i25;
                    str25 = str9;
                    iArr7 = iArr4;
                    i66 = i28;
                    i65 = i27;
                    editor5 = editor2;
                    sArr13 = sArr7;
                    jSONObject8 = jSONObject3;
                    str22 = str12;
                    i46 = i24;
                    str23 = m6385;
                    i59 = i29;
                    str21 = str11;
                    i64 = i46;
                case -1674642574:
                case 1385322157:
                    str = str25;
                    str2 = str26;
                    str3 = str22;
                    str4 = str23;
                    i6 = i64;
                    jSONObject2 = jSONObject8;
                    iArr2 = iArr7;
                    sArr = sArr10;
                    i7 = i68;
                    i8 = i61;
                    str5 = str21;
                    sArr2 = sArr13;
                    editor = editor5;
                    sArr3 = sArr11;
                    i9 = i65;
                    i10 = i66;
                    i11 = i62;
                    s = f21978[76];
                    if (C3019.f9544 >= 0) {
                        sArr11 = sArr3;
                        str21 = str5;
                        i68 = i7;
                        sArr10 = sArr;
                        i64 = i6;
                        int m698110 = (i58 - C2105.m6981("᩻ܽ")) * (-31);
                        i60 = m698110 ^ 1712293296;
                        i59 = ((m698110 ^ i57) * (-4603)) ^ 1915914303;
                        str23 = str4;
                        i62 = i11;
                        i61 = i8;
                        str26 = str2;
                        iArr7 = iArr2;
                        i66 = i10;
                        i65 = i9;
                        str25 = str;
                        editor5 = editor;
                        sArr13 = sArr2;
                        jSONObject8 = jSONObject2;
                        str22 = str3;
                    } else {
                        m2566 = C0630.m2566("ۗۚ") ^ i57;
                        i12 = ((m2566 ^ i58) * (-7603)) ^ (-1319244558);
                        i13 = 1400203943;
                        sArr11 = sArr3;
                        str21 = str5;
                        i61 = i8;
                        i68 = i7;
                        sArr10 = sArr;
                        i60 = m2566 ^ i13;
                        i59 = i12;
                        iArr7 = iArr2;
                        i64 = i6;
                        i62 = i11;
                        str23 = str4;
                        i66 = i10;
                        i65 = i9;
                        str26 = str2;
                        editor5 = editor;
                        sArr13 = sArr2;
                        str25 = str;
                        jSONObject8 = jSONObject2;
                        str22 = str3;
                    }
                case -1607736905:
                case -989926412:
                    str27 = jSONObject9.getString(RunnableC0588.m2431(c2946));
                    C2167.m7151(str27);
                    sArr12 = f21978;
                    if (C2167.m7155()) {
                        str18 = str25;
                        i37 = i65;
                        jSONObject6 = jSONObject8;
                        i38 = i66;
                        iArr6 = iArr7;
                        i39 = i61;
                        i40 = i62;
                        sArr9 = sArr13;
                        str20 = str22;
                        editor4 = editor5;
                        int i78 = i64;
                        str11 = str21;
                        str19 = str23;
                        i41 = i78;
                        int m698111 = C2105.m6981("ܺۖ") ^ i57;
                        int i79 = i37;
                        i59 = ((m698111 ^ i58) * 24143) ^ 917240099;
                        i60 = m698111 ^ 1523515580;
                        str22 = str20;
                        i62 = i40;
                        i61 = i39;
                        iArr7 = iArr6;
                        i66 = i38;
                        i65 = i79;
                        editor5 = editor4;
                        sArr13 = sArr9;
                        jSONObject8 = jSONObject6;
                        str25 = str18;
                        i46 = i41;
                        str23 = str19;
                        str21 = str11;
                        i64 = i46;
                    } else {
                        m6981 = (C2105.m6981("᩷᩶") + i57) * (-25);
                        i = ((m6981 ^ i58) * 13955) ^ 222633738;
                        i2 = 319259685;
                        i60 = m6981 ^ i2;
                        i59 = i;
                    }
                case -1604861007:
                case -567875789:
                    iArr5 = iArr7;
                    i32 = i61;
                    int i80 = i66;
                    if (i63 != i80) {
                        m69816 = C2105.m6981("᩶ۡ") ^ i58;
                        i50 = i62;
                        i51 = ((m69816 ^ i57) * 14455) ^ 717285895;
                        i52 = 56197084;
                    } else {
                        i50 = i62;
                        m69816 = C2105.m6981("ۙܰ") ^ i57;
                        i51 = ((m69816 ^ i58) * (-3587)) ^ (-1491198625);
                        i52 = -1144166100;
                    }
                    i60 = m69816 ^ i52;
                    i59 = i51;
                    i62 = i50;
                    i66 = i80;
                    i61 = i32;
                    iArr7 = iArr5;
                case -1603062207:
                case -1579641575:
                    C8058 c8058 = C8058.f24861;
                    str13 = str25;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    i43 = i64;
                    editor3 = editor5;
                    str11 = str21;
                    str19 = str23;
                    int m69819222 = C2105.m6981("ۢ᩵") ^ i58;
                    i41 = i43;
                    int i74222 = ((m69819222 ^ i57) * (-11577)) ^ (-148249733);
                    i60 = m69819222 ^ (-472685581);
                    editor5 = editor3;
                    sArr13 = sArr8;
                    i62 = i35;
                    jSONObject8 = jSONObject7;
                    i66 = i34;
                    str25 = str13;
                    i65 = i42;
                    i59 = i74222;
                    i61 = i32;
                    iArr7 = iArr5;
                    i46 = i41;
                    str23 = str19;
                    str21 = str11;
                    i64 = i46;
                case -1516779182:
                case 721446568:
                    String str29 = str25;
                    int i81 = i65;
                    JSONObject jSONObject12 = jSONObject8;
                    iArr5 = iArr7;
                    i32 = i61;
                    short[] sArr14 = sArr13;
                    SharedPreferences.Editor editor6 = editor5;
                    int i82 = i66;
                    int i83 = i62;
                    if (i81 == i82) {
                        int m698112 = (C2105.m6981("֡ᩴ") + i58) * 35;
                        i47 = ((m698112 ^ i57) * (-24381)) ^ 2012030330;
                        i60 = m698112 ^ (-8704191);
                        editor5 = editor6;
                        sArr13 = sArr14;
                        i62 = i83;
                        jSONObject8 = jSONObject12;
                        i66 = i82;
                        str25 = str29;
                        i65 = i81;
                        i59 = i47;
                        i61 = i32;
                        iArr7 = iArr5;
                    } else {
                        int m25665 = C0630.m2566("֫ۢ") ^ i57;
                        int i84 = ((m25665 ^ i58) * 13917) ^ (-919810479);
                        i60 = m25665 ^ (-2139739031);
                        editor5 = editor6;
                        sArr13 = sArr14;
                        i61 = i32;
                        jSONObject8 = jSONObject12;
                        iArr7 = iArr5;
                        str25 = str29;
                        i65 = i81;
                        i59 = i84;
                        i62 = i83;
                        i66 = i82;
                    }
                case -1471574556:
                case -634945546:
                    iArr5 = iArr7;
                    i32 = i61;
                    C7811.m20835(interfaceC13049, RunnableC0588.m2431(c2946), jSONObject9.getBoolean(RunnableC0588.m2431(c2946)));
                    str13 = str25;
                    i43 = i64;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    i35 = i62;
                    str11 = str21;
                    sArr8 = sArr13;
                    str19 = str23;
                    editor3 = editor5;
                    int m698192222 = C2105.m6981("ۢ᩵") ^ i58;
                    i41 = i43;
                    int i742222 = ((m698192222 ^ i57) * (-11577)) ^ (-148249733);
                    i60 = m698192222 ^ (-472685581);
                    editor5 = editor3;
                    sArr13 = sArr8;
                    i62 = i35;
                    jSONObject8 = jSONObject7;
                    i66 = i34;
                    str25 = str13;
                    i65 = i42;
                    i59 = i742222;
                    i61 = i32;
                    iArr7 = iArr5;
                    i46 = i41;
                    str23 = str19;
                    str21 = str11;
                    i64 = i46;
                case -1395272440:
                case 992291789:
                    C7811.m20844();
                    if (C0422.f1886 <= 0) {
                        str13 = str25;
                        str14 = str26;
                        str15 = str23;
                        i31 = i64;
                        jSONObject4 = jSONObject8;
                        iArr5 = iArr7;
                        i32 = i61;
                        str11 = str21;
                        sArr8 = sArr13;
                        editor3 = editor5;
                        i33 = i65;
                        i34 = i66;
                        i35 = i62;
                        str16 = str22;
                        m25662 = (i57 - C2105.m6981("ۨ֫")) * 127;
                        jSONObject5 = jSONObject4;
                        i59 = ((m25662 ^ i58) * 3847) ^ (-1529911022);
                        i36 = 501954095;
                        i60 = m25662 ^ i36;
                        str21 = str11;
                        i61 = i32;
                        iArr7 = iArr5;
                        i64 = i31;
                        str23 = str15;
                        str26 = str14;
                        str25 = str13;
                        JSONObject jSONObject10222 = jSONObject5;
                        str22 = str16;
                        i62 = i35;
                        i66 = i34;
                        i65 = i33;
                        editor5 = editor3;
                        sArr13 = sArr8;
                        jSONObject8 = jSONObject10222;
                    } else {
                        str = str25;
                        str2 = str26;
                        str3 = str22;
                        str4 = str23;
                        i6 = i64;
                        jSONObject2 = jSONObject8;
                        iArr2 = iArr7;
                        sArr = sArr10;
                        i7 = i68;
                        i8 = i61;
                        str5 = str21;
                        sArr2 = sArr13;
                        editor = editor5;
                        sArr3 = sArr11;
                        i9 = i65;
                        i10 = i66;
                        i11 = i62;
                        m2566 = C0630.m2566("ۧ֨") ^ i58;
                        i12 = ((m2566 ^ i57) * 3901) ^ 329735559;
                        i13 = -310414435;
                        sArr11 = sArr3;
                        str21 = str5;
                        i61 = i8;
                        i68 = i7;
                        sArr10 = sArr;
                        i60 = m2566 ^ i13;
                        i59 = i12;
                        iArr7 = iArr2;
                        i64 = i6;
                        i62 = i11;
                        str23 = str4;
                        i66 = i10;
                        i65 = i9;
                        str26 = str2;
                        editor5 = editor;
                        sArr13 = sArr2;
                        str25 = str;
                        jSONObject8 = jSONObject2;
                        str22 = str3;
                    }
                case -1378376484:
                case 910661056:
                    str18 = str25;
                    i37 = i65;
                    jSONObject6 = jSONObject8;
                    i38 = i66;
                    iArr6 = iArr7;
                    i39 = i61;
                    i40 = i62;
                    sArr9 = sArr13;
                    editor4 = editor5;
                    int i85 = i64;
                    str11 = str21;
                    str19 = str23;
                    i41 = i85;
                    jSONObject9 = jSONObject.getJSONObject(str19);
                    str20 = str22;
                    C2126.m7031(jSONObject9, str20);
                    int i86 = C11413.f34113;
                    c128232 = C11413.m28176();
                    if (C1047.f3863 >= 0) {
                        int m6981112 = C2105.m6981("ܺۖ") ^ i57;
                        int i792 = i37;
                        i59 = ((m6981112 ^ i58) * 24143) ^ 917240099;
                        i60 = m6981112 ^ 1523515580;
                        str22 = str20;
                        i62 = i40;
                        i61 = i39;
                        iArr7 = iArr6;
                        i66 = i38;
                        i65 = i792;
                        editor5 = editor4;
                        sArr13 = sArr9;
                        jSONObject8 = jSONObject6;
                        str25 = str18;
                        i46 = i41;
                        str23 = str19;
                        str21 = str11;
                        i64 = i46;
                    } else {
                        int m25666 = (C0630.m2566("᩺ܺ") + i58) * (-79);
                        i60 = m25666 ^ (-1715458188);
                        i59 = ((m25666 ^ i57) * 8243) ^ (-930846962);
                        i61 = i39;
                        str25 = str18;
                        iArr7 = iArr6;
                        str22 = str20;
                        i62 = i40;
                        i66 = i38;
                        i65 = i37;
                        editor5 = editor4;
                        sArr13 = sArr9;
                        jSONObject8 = jSONObject6;
                        str23 = str19;
                        str21 = str11;
                        i64 = i41;
                    }
                case -1358487474:
                case -424202819:
                    str = str25;
                    int i87 = i65;
                    JSONObject jSONObject13 = jSONObject8;
                    i10 = i66;
                    iArr2 = iArr7;
                    i8 = i61;
                    i11 = i62;
                    sArr2 = sArr13;
                    int i88 = i64;
                    editor = editor5;
                    str8 = str21;
                    editor.apply();
                    int i89 = C11413.f34113;
                    C11413.m28178();
                    C17897.m41874();
                    i9 = i87;
                    str3 = str22;
                    sArr6 = sArr11;
                    jSONObject2 = jSONObject13;
                    str2 = str26;
                    str4 = str23;
                    i6 = i88;
                    m69813 = (C0630.m2566("۠֨") + i58) * 91;
                    i22 = ((m69813 ^ i57) * (-16031)) ^ 666506881;
                    i23 = -2017236567;
                    i60 = m69813 ^ i23;
                    i59 = i22;
                    sArr11 = sArr6;
                    str21 = str8;
                    i62 = i11;
                    i61 = i8;
                    iArr7 = iArr2;
                    i64 = i6;
                    i66 = i10;
                    i65 = i9;
                    editor5 = editor;
                    str23 = str4;
                    sArr13 = sArr2;
                    str26 = str2;
                    jSONObject8 = jSONObject2;
                    str25 = str;
                    str22 = str3;
                case -1352746508:
                case -1106777205:
                    interfaceC13049.mo25852((byte) jSONObject9.getInt(RunnableC0588.m2431(c2946)), C3683.m11215(c2946));
                    str13 = str25;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    i43 = i64;
                    editor3 = editor5;
                    str11 = str21;
                    str19 = str23;
                    int m6981922222 = C2105.m6981("ۢ᩵") ^ i58;
                    i41 = i43;
                    int i7422222 = ((m6981922222 ^ i57) * (-11577)) ^ (-148249733);
                    i60 = m6981922222 ^ (-472685581);
                    editor5 = editor3;
                    sArr13 = sArr8;
                    i62 = i35;
                    jSONObject8 = jSONObject7;
                    i66 = i34;
                    str25 = str13;
                    i65 = i42;
                    i59 = i7422222;
                    i61 = i32;
                    iArr7 = iArr5;
                    i46 = i41;
                    str23 = str19;
                    str21 = str11;
                    i64 = i46;
                case -1349268793:
                case -640535426:
                    str13 = str25;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    i43 = i64;
                    editor3 = editor5;
                    str11 = str21;
                    if (C1773.m5910(it2)) {
                        m25663 = C2105.m6981("ۜ֫") ^ i57;
                        i44 = ((m25663 ^ i58) * (-19677)) ^ 1737421173;
                        i45 = -572294558;
                    } else {
                        m25663 = C0630.m2566("۫ۗ") ^ i58;
                        i44 = ((m25663 ^ i57) * (-32313)) ^ 1495024853;
                        i45 = 437448122;
                    }
                    i60 = m25663 ^ i45;
                    editor5 = editor3;
                    sArr13 = sArr8;
                    i62 = i35;
                    jSONObject8 = jSONObject7;
                    i66 = i34;
                    str25 = str13;
                    i65 = i42;
                    i59 = i44;
                    str21 = str11;
                    i64 = i43;
                    i61 = i32;
                    iArr7 = iArr5;
                case -1249963718:
                case 1500589379:
                    str = str25;
                    str2 = str26;
                    str3 = str22;
                    str4 = str23;
                    i6 = i64;
                    jSONObject2 = jSONObject8;
                    iArr2 = iArr7;
                    sArr = sArr10;
                    i7 = i68;
                    i8 = i61;
                    str5 = str21;
                    sArr2 = sArr13;
                    editor = editor5;
                    sArr3 = sArr11;
                    i9 = i65;
                    i10 = i66;
                    i11 = i62;
                    i71 = 22017;
                    m2566 = (C2105.m6981("ۧ֡") ^ i58) * 91;
                    i12 = ((m2566 ^ i57) * (-25877)) ^ (-1800662982);
                    i13 = -1165337220;
                    sArr11 = sArr3;
                    str21 = str5;
                    i61 = i8;
                    i68 = i7;
                    sArr10 = sArr;
                    i60 = m2566 ^ i13;
                    i59 = i12;
                    iArr7 = iArr2;
                    i64 = i6;
                    i62 = i11;
                    str23 = str4;
                    i66 = i10;
                    i65 = i9;
                    str26 = str2;
                    editor5 = editor;
                    sArr13 = sArr2;
                    str25 = str;
                    jSONObject8 = jSONObject2;
                    str22 = str3;
                case -1165936730:
                case 2092479089:
                    if (C7811.m20838(str27, C0964.m3396(sArr12, 131, 9, i71))) {
                        m6981 = C0630.m2566("ۜۡ") ^ i58;
                        i = ((m6981 ^ i57) * 14173) ^ (-428590425);
                        i2 = 361721944;
                        i60 = m6981 ^ i2;
                        i59 = i;
                    }
                    m6981 = (C0630.m2566("ۗ֨") ^ i58) * (-75);
                    i = ((m6981 ^ i57) * (-17313)) ^ (-566729367);
                    i2 = 1528593539;
                    i60 = m6981 ^ i2;
                    i59 = i;
                case -1140232832:
                case 1612594414:
                    str13 = str25;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    i43 = i64;
                    editor3 = editor5;
                    str11 = str21;
                    c29462 = (C2946) C2272.m7513(it2);
                    if (jSONObject7.contains(RunnableC0588.m2431(c29462))) {
                        m25663 = (C2105.m6981("᩶᩻") + i58) * 73;
                        i44 = ((m25663 ^ i57) * 639) ^ (-1041951807);
                        i45 = -1617270920;
                        i60 = m25663 ^ i45;
                        editor5 = editor3;
                        sArr13 = sArr8;
                        i62 = i35;
                        jSONObject8 = jSONObject7;
                        i66 = i34;
                        str25 = str13;
                        i65 = i42;
                        i59 = i44;
                        str21 = str11;
                        i64 = i43;
                        i61 = i32;
                        iArr7 = iArr5;
                    } else {
                        i33 = i42;
                        str16 = str22;
                        str17 = str23;
                        i31 = i43;
                        jSONObject5 = jSONObject7;
                        str14 = str26;
                        int m25667 = C0630.m2566("ۘ᩻") ^ i57;
                        str15 = str17;
                        i60 = m25667 ^ (-1204283536);
                        i59 = ((m25667 ^ i58) * (-18721)) ^ 1447473826;
                        str21 = str11;
                        i61 = i32;
                        iArr7 = iArr5;
                        i64 = i31;
                        str23 = str15;
                        str26 = str14;
                        str25 = str13;
                        JSONObject jSONObject102222 = jSONObject5;
                        str22 = str16;
                        i62 = i35;
                        i66 = i34;
                        i65 = i33;
                        editor5 = editor3;
                        sArr13 = sArr8;
                        jSONObject8 = jSONObject102222;
                    }
                case -1119994355:
                case 2016571851:
                    if (C21923.f70183 != 0) {
                        str = str25;
                        str2 = str26;
                        str3 = str22;
                        str4 = str23;
                        i6 = i64;
                        jSONObject2 = jSONObject8;
                        iArr2 = iArr7;
                        sArr = sArr10;
                        i7 = i68;
                        i8 = i61;
                        str5 = str21;
                        sArr2 = sArr13;
                        editor = editor5;
                        sArr3 = sArr11;
                        i9 = i65;
                        i10 = i66;
                        i11 = i62;
                        m2566 = C0630.m2566("ۧ֨") ^ i58;
                        i12 = ((m2566 ^ i57) * 3901) ^ 329735559;
                        i13 = -310414435;
                        sArr11 = sArr3;
                        str21 = str5;
                        i61 = i8;
                        i68 = i7;
                        sArr10 = sArr;
                        i60 = m2566 ^ i13;
                        i59 = i12;
                        iArr7 = iArr2;
                        i64 = i6;
                        i62 = i11;
                        str23 = str4;
                        i66 = i10;
                        i65 = i9;
                        str26 = str2;
                        editor5 = editor;
                        sArr13 = sArr2;
                        str25 = str;
                        jSONObject8 = jSONObject2;
                        str22 = str3;
                    } else {
                        str18 = str25;
                        i37 = i65;
                        jSONObject6 = jSONObject8;
                        i38 = i66;
                        iArr6 = iArr7;
                        i39 = i61;
                        i40 = i62;
                        sArr9 = sArr13;
                        str20 = str22;
                        editor4 = editor5;
                        int i782 = i64;
                        str11 = str21;
                        str19 = str23;
                        i41 = i782;
                        int m69811122 = C2105.m6981("ܺۖ") ^ i57;
                        int i7922 = i37;
                        i59 = ((m69811122 ^ i58) * 24143) ^ 917240099;
                        i60 = m69811122 ^ 1523515580;
                        str22 = str20;
                        i62 = i40;
                        i61 = i39;
                        iArr7 = iArr6;
                        i66 = i38;
                        i65 = i7922;
                        editor5 = editor4;
                        sArr13 = sArr9;
                        jSONObject8 = jSONObject6;
                        str25 = str18;
                        i46 = i41;
                        str23 = str19;
                        str21 = str11;
                        i64 = i46;
                    }
                case -911143991:
                case 1521358564:
                    if (C1420.m4913()) {
                        m6981 = C0630.m2566("᩶᩺") ^ i58;
                        i = ((m6981 ^ i57) * (-23453)) ^ (-289717495);
                        i2 = 358934316;
                        i60 = m6981 ^ i2;
                        i59 = i;
                    } else {
                        str18 = str25;
                        i37 = i65;
                        jSONObject6 = jSONObject8;
                        i38 = i66;
                        iArr6 = iArr7;
                        i39 = i61;
                        i40 = i62;
                        sArr9 = sArr13;
                        str20 = str22;
                        editor4 = editor5;
                        int i7822 = i64;
                        str11 = str21;
                        str19 = str23;
                        i41 = i7822;
                        int m698111222 = C2105.m6981("ܺۖ") ^ i57;
                        int i79222 = i37;
                        i59 = ((m698111222 ^ i58) * 24143) ^ 917240099;
                        i60 = m698111222 ^ 1523515580;
                        str22 = str20;
                        i62 = i40;
                        i61 = i39;
                        iArr7 = iArr6;
                        i66 = i38;
                        i65 = i79222;
                        editor5 = editor4;
                        sArr13 = sArr9;
                        jSONObject8 = jSONObject6;
                        str25 = str18;
                        i46 = i41;
                        str23 = str19;
                        str21 = str11;
                        i64 = i46;
                    }
                case -842755057:
                case -509847725:
                    throw new RuntimeException(C1420.m4909(c29462.m8970(), str21));
                case -822955556:
                case -819875827:
                    throw new RuntimeException(C3245.m9927(c2946.m8970(), str21));
                case -628365037:
                case -559244547:
                    str13 = str25;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    i43 = i64;
                    editor3 = editor5;
                    if (i63 != i43) {
                        m25663 = C2105.m6981("ۖۙ") ^ i58;
                        str11 = str21;
                        i44 = ((m25663 ^ i57) * (-26355)) ^ 1434848652;
                        i45 = -1114049933;
                    } else {
                        str11 = str21;
                        m25663 = (i58 - C0630.m2566("ۧܽ")) * 11;
                        i44 = ((m25663 ^ i57) * 12545) ^ (-1843728177);
                        i45 = -1410683339;
                    }
                    i60 = m25663 ^ i45;
                    editor5 = editor3;
                    sArr13 = sArr8;
                    i62 = i35;
                    jSONObject8 = jSONObject7;
                    i66 = i34;
                    str25 = str13;
                    i65 = i42;
                    i59 = i44;
                    str21 = str11;
                    i64 = i43;
                    i61 = i32;
                    iArr7 = iArr5;
                case -578620806:
                case 1628765621:
                    str = str25;
                    str2 = str26;
                    str3 = str22;
                    str4 = str23;
                    i6 = i64;
                    jSONObject2 = jSONObject8;
                    iArr2 = iArr7;
                    sArr = sArr10;
                    i7 = i68;
                    i8 = i61;
                    str5 = str21;
                    sArr2 = sArr13;
                    editor = editor5;
                    sArr3 = sArr11;
                    i9 = i65;
                    i10 = i66;
                    i11 = i62;
                    int i90 = s + 1;
                    if ((i90 * i90) - (i55 + 1) >= 0) {
                        m2566 = C0630.m2566("ۛۛ") ^ i57;
                        i12 = ((m2566 ^ i58) * (-22725)) ^ 708324763;
                        i13 = -728430601;
                    } else {
                        m2566 = (C0630.m2566("᩹ܰ") + i58) * 81;
                        i12 = ((m2566 ^ i57) * (-24949)) ^ 395671200;
                        i13 = 373257903;
                    }
                    sArr11 = sArr3;
                    str21 = str5;
                    i61 = i8;
                    i68 = i7;
                    sArr10 = sArr;
                    i60 = m2566 ^ i13;
                    i59 = i12;
                    iArr7 = iArr2;
                    i64 = i6;
                    i62 = i11;
                    str23 = str4;
                    i66 = i10;
                    i65 = i9;
                    str26 = str2;
                    editor5 = editor;
                    sArr13 = sArr2;
                    str25 = str;
                    jSONObject8 = jSONObject2;
                    str22 = str3;
                case -480121309:
                case 527864171:
                    str13 = str25;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    i43 = i64;
                    editor3 = editor5;
                    str11 = str21;
                    if (C0483.m2123(it)) {
                        m25663 = (C0630.m2566("۫ܳ") ^ i57) * 59;
                        i44 = ((m25663 ^ i58) * (-22189)) ^ 1243708972;
                        i45 = -828924403;
                    } else {
                        m25663 = C2105.m6981("ۖܽ") ^ i58;
                        i44 = ((m25663 ^ i57) * 23773) ^ (-1549279840);
                        i45 = -338842746;
                    }
                    i60 = m25663 ^ i45;
                    editor5 = editor3;
                    sArr13 = sArr8;
                    i62 = i35;
                    jSONObject8 = jSONObject7;
                    i66 = i34;
                    str25 = str13;
                    i65 = i42;
                    i59 = i44;
                    str21 = str11;
                    i64 = i43;
                    i61 = i32;
                    iArr7 = iArr5;
                case -428179252:
                case 574345194:
                    str = str25;
                    str2 = str26;
                    str3 = str22;
                    str4 = str23;
                    i6 = i64;
                    jSONObject2 = jSONObject8;
                    iArr2 = iArr7;
                    i8 = i61;
                    str8 = str21;
                    sArr2 = sArr13;
                    editor = editor5;
                    sArr6 = sArr11;
                    i9 = i65;
                    i10 = i66;
                    i11 = i62;
                    sArr10 = f21978;
                    i68 = 80;
                    i69 = 29;
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        sArr11 = sArr6;
                        str21 = str8;
                        i64 = i6;
                        int m6981102 = (i58 - C2105.m6981("᩻ܽ")) * (-31);
                        i60 = m6981102 ^ 1712293296;
                        i59 = ((m6981102 ^ i57) * (-4603)) ^ 1915914303;
                        str23 = str4;
                        i62 = i11;
                        i61 = i8;
                        str26 = str2;
                        iArr7 = iArr2;
                        i66 = i10;
                        i65 = i9;
                        str25 = str;
                        editor5 = editor;
                        sArr13 = sArr2;
                        jSONObject8 = jSONObject2;
                        str22 = str3;
                    } else {
                        m69813 = (i58 - C2105.m6981("ۘ۟")) * (-45);
                        i22 = ((m69813 ^ i57) * (-32401)) ^ (-212074175);
                        i23 = -1938770281;
                        i60 = m69813 ^ i23;
                        i59 = i22;
                        sArr11 = sArr6;
                        str21 = str8;
                        i62 = i11;
                        i61 = i8;
                        iArr7 = iArr2;
                        i64 = i6;
                        i66 = i10;
                        i65 = i9;
                        editor5 = editor;
                        str23 = str4;
                        sArr13 = sArr2;
                        str26 = str2;
                        jSONObject8 = jSONObject2;
                        str25 = str;
                        str22 = str3;
                    }
                case -411351699:
                case 1634966408:
                    str = str25;
                    str2 = str26;
                    str3 = str22;
                    str4 = str23;
                    i6 = i64;
                    jSONObject2 = jSONObject8;
                    iArr2 = iArr7;
                    sArr = sArr10;
                    i7 = i68;
                    i8 = i61;
                    str5 = str21;
                    sArr2 = sArr13;
                    editor = editor5;
                    sArr3 = sArr11;
                    i9 = i65;
                    i10 = i66;
                    i11 = i62;
                    i71 = 63985;
                    m2566 = (C2105.m6981("ۧ֡") ^ i58) * 91;
                    i12 = ((m2566 ^ i57) * (-25877)) ^ (-1800662982);
                    i13 = -1165337220;
                    sArr11 = sArr3;
                    str21 = str5;
                    i61 = i8;
                    i68 = i7;
                    sArr10 = sArr;
                    i60 = m2566 ^ i13;
                    i59 = i12;
                    iArr7 = iArr2;
                    i64 = i6;
                    i62 = i11;
                    str23 = str4;
                    i66 = i10;
                    i65 = i9;
                    str26 = str2;
                    editor5 = editor;
                    sArr13 = sArr2;
                    str25 = str;
                    jSONObject8 = jSONObject2;
                    str22 = str3;
                case -383076714:
                case 779611078:
                    str24 = RunnableC0588.m2431(c2946);
                    str25 = C0382.m1844(str27, 9);
                    sArr13 = f21978;
                    i61 = 140;
                    if (C0050.f910 >= 0) {
                        str = str25;
                        str2 = str26;
                        str3 = str22;
                        str4 = str23;
                        i6 = i64;
                        jSONObject2 = jSONObject8;
                        iArr2 = iArr7;
                        sArr = sArr10;
                        i7 = i68;
                        i8 = 140;
                        str5 = str21;
                        sArr2 = sArr13;
                        editor = editor5;
                        sArr3 = sArr11;
                        i9 = i65;
                        i10 = i66;
                        i11 = i62;
                        m2566 = C0630.m2566("ۧ֨") ^ i58;
                        i12 = ((m2566 ^ i57) * 3901) ^ 329735559;
                        i13 = -310414435;
                        sArr11 = sArr3;
                        str21 = str5;
                        i61 = i8;
                        i68 = i7;
                        sArr10 = sArr;
                        i60 = m2566 ^ i13;
                        i59 = i12;
                        iArr7 = iArr2;
                        i64 = i6;
                        i62 = i11;
                        str23 = str4;
                        i66 = i10;
                        i65 = i9;
                        str26 = str2;
                        editor5 = editor;
                        sArr13 = sArr2;
                        str25 = str;
                        jSONObject8 = jSONObject2;
                        str22 = str3;
                    } else {
                        m6981 = C0630.m2566("ᩴܳ") ^ i57;
                        i = ((m6981 ^ i58) * 20843) ^ (-1801340279);
                        i2 = 1905536888;
                        i60 = m6981 ^ i2;
                        i59 = i;
                    }
                case -373115741:
                case 1286936716:
                    C22628.m50615();
                    if (C7106.m19120() <= 0) {
                        str = str25;
                        m2575 = str26;
                        str3 = str22;
                        str6 = str23;
                        i14 = i64;
                        jSONObject2 = jSONObject8;
                        iArr3 = iArr7;
                        sArr4 = sArr10;
                        i19 = i68;
                        i15 = i61;
                        str7 = str21;
                        sArr2 = sArr13;
                        editor = editor5;
                        sArr5 = sArr11;
                        i16 = i65;
                        i17 = i66;
                        i18 = i62;
                        m69812 = C0630.m2566("ۢۙ") ^ i58;
                        i20 = ((m69812 ^ i57) * 18329) ^ 1112500836;
                        i21 = -606533517;
                        sArr11 = sArr5;
                        str21 = str7;
                        i61 = i15;
                        i68 = i19;
                        sArr10 = sArr4;
                        i60 = m69812 ^ i21;
                        iArr7 = iArr3;
                        i64 = i14;
                        i62 = i18;
                        str23 = str6;
                        i66 = i17;
                        i65 = i16;
                        str26 = m2575;
                        i59 = i20;
                        editor5 = editor;
                        sArr13 = sArr2;
                        str25 = str;
                        jSONObject8 = jSONObject2;
                        str22 = str3;
                    } else {
                        str13 = str25;
                        i42 = i65;
                        jSONObject7 = jSONObject8;
                        i34 = i66;
                        iArr5 = iArr7;
                        i32 = i61;
                        i35 = i62;
                        sArr8 = sArr13;
                        i43 = i64;
                        editor3 = editor5;
                        str11 = str21;
                        m25663 = C2105.m6981("ۘܽ") ^ i57;
                        i44 = ((m25663 ^ i58) * (-2087)) ^ (-1702006215);
                        i45 = 1264422204;
                        i60 = m25663 ^ i45;
                        editor5 = editor3;
                        sArr13 = sArr8;
                        i62 = i35;
                        jSONObject8 = jSONObject7;
                        i66 = i34;
                        str25 = str13;
                        i65 = i42;
                        i59 = i44;
                        str21 = str11;
                        i64 = i43;
                        i61 = i32;
                        iArr7 = iArr5;
                    }
                case -271880465:
                case 448134142:
                    iArr5 = iArr7;
                    i32 = i61;
                    int i91 = i67;
                    if (i70 < i91) {
                        m69817 = C2105.m6981("ۙ᩷") ^ i58;
                        i67 = i91;
                        i47 = ((m69817 ^ i57) * 9351) ^ (-2037551228);
                        i54 = 2099293034;
                        i60 = m69817 ^ i54;
                        i59 = i47;
                        i61 = i32;
                        iArr7 = iArr5;
                    } else {
                        i67 = i91;
                        m25664 = C0630.m2566("ۨۘ") ^ i57;
                        i59 = ((m25664 ^ i58) * (-27407)) ^ (-1815323819);
                        i53 = -1019136609;
                        i60 = m25664 ^ i53;
                        i61 = i32;
                        iArr7 = iArr5;
                    }
                case -243583206:
                case 1101850727:
                    str13 = str25;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    i43 = i64;
                    editor3 = editor5;
                    str11 = str21;
                    C3683.m11223(interfaceC13049, RunnableC0588.m2431(c2946), jSONObject9.getString(RunnableC0588.m2431(c2946)));
                    str19 = str23;
                    int m69819222222 = C2105.m6981("ۢ᩵") ^ i58;
                    i41 = i43;
                    int i74222222 = ((m69819222222 ^ i57) * (-11577)) ^ (-148249733);
                    i60 = m69819222222 ^ (-472685581);
                    editor5 = editor3;
                    sArr13 = sArr8;
                    i62 = i35;
                    jSONObject8 = jSONObject7;
                    i66 = i34;
                    str25 = str13;
                    i65 = i42;
                    i59 = i74222222;
                    i61 = i32;
                    iArr7 = iArr5;
                    i46 = i41;
                    str23 = str19;
                    str21 = str11;
                    i64 = i46;
                case -194972984:
                case 551673487:
                    str13 = str25;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    i43 = i64;
                    editor3 = editor5;
                    str11 = str21;
                    if (i42 != i43) {
                        m25663 = C2105.m6981("ۨᩴ") ^ i57;
                        i44 = ((m25663 ^ i58) * 1707) ^ 1611304244;
                        i45 = 1256872841;
                    } else {
                        m25663 = (C0630.m2566("۬ۜ") + i57) * (-97);
                        i44 = ((m25663 ^ i58) * (-23937)) ^ 1593365303;
                        i45 = -1219544053;
                    }
                    i60 = m25663 ^ i45;
                    editor5 = editor3;
                    sArr13 = sArr8;
                    i62 = i35;
                    jSONObject8 = jSONObject7;
                    i66 = i34;
                    str25 = str13;
                    i65 = i42;
                    i59 = i44;
                    str21 = str11;
                    i64 = i43;
                    i61 = i32;
                    iArr7 = iArr5;
                case -146801162:
                case 813754108:
                    str13 = str25;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    i43 = i64;
                    editor3 = editor5;
                    str11 = str21;
                    i63 = c2946.m8970();
                    if (i63 != 0) {
                        m25663 = (C0630.m2566("ܰܿ") ^ i58) * (-113);
                        i44 = ((m25663 ^ i57) * 6545) ^ (-205762033);
                        i45 = -1606942737;
                    } else {
                        m25663 = C2105.m6981("ۤۜ") ^ i57;
                        i44 = ((m25663 ^ i58) * 17893) ^ (-1228210133);
                        i45 = -1869535537;
                    }
                    i60 = m25663 ^ i45;
                    editor5 = editor3;
                    sArr13 = sArr8;
                    i62 = i35;
                    jSONObject8 = jSONObject7;
                    i66 = i34;
                    str25 = str13;
                    i65 = i42;
                    i59 = i44;
                    str21 = str11;
                    i64 = i43;
                    i61 = i32;
                    iArr7 = iArr5;
                case -27017536:
                case 1169355226:
                    C0237.m1492(new RunnableC13528());
                    C19890.m45743();
                    return;
                case -42564:
                case 661243888:
                    iArr5 = iArr7;
                    if (i63 != 4) {
                        m69817 = (C2105.m6981("᩸᩺") ^ i58) * 55;
                        i32 = i61;
                        i47 = ((m69817 ^ i57) * 22755) ^ (-1324655647);
                        i54 = -704923250;
                        i60 = m69817 ^ i54;
                        i59 = i47;
                        i61 = i32;
                        iArr7 = iArr5;
                    } else {
                        i32 = i61;
                        m25664 = C2105.m6981("ۚܰ") ^ i57;
                        i59 = ((m25664 ^ i58) * (-8621)) ^ (-1874688209);
                        i53 = -827019313;
                        i60 = m25664 ^ i53;
                        i61 = i32;
                        iArr7 = iArr5;
                    }
                case 191996351:
                case 1565727011:
                    str13 = str25;
                    i33 = i65;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    str16 = str22;
                    jSONObject5 = jSONObject8;
                    sArr8 = sArr13;
                    int i92 = i64;
                    str11 = str21;
                    str17 = str23;
                    i31 = i92;
                    SharedPreferences sharedPreferences = ApplicationC20075.f65010;
                    str14 = str26;
                    C2126.m7031(sharedPreferences, str14);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    it2 = C4117.m12354(c12823);
                    editor3 = edit;
                    int m256672 = C0630.m2566("ۘ᩻") ^ i57;
                    str15 = str17;
                    i60 = m256672 ^ (-1204283536);
                    i59 = ((m256672 ^ i58) * (-18721)) ^ 1447473826;
                    str21 = str11;
                    i61 = i32;
                    iArr7 = iArr5;
                    i64 = i31;
                    str23 = str15;
                    str26 = str14;
                    str25 = str13;
                    JSONObject jSONObject1022222 = jSONObject5;
                    str22 = str16;
                    i62 = i35;
                    i66 = i34;
                    i65 = i33;
                    editor5 = editor3;
                    sArr13 = sArr8;
                    jSONObject8 = jSONObject1022222;
                case 241842617:
                case 1704395186:
                    C3746.m11369();
                    if (C1128.f4106 <= 0) {
                        m6981 = C2105.m6981("᩸᩵") ^ i57;
                        i = ((m6981 ^ i58) * 31601) ^ 1634301617;
                        i2 = 1433128571;
                        i60 = m6981 ^ i2;
                        i59 = i;
                    }
                    m6981 = C2105.m6981("ۢ֡") ^ i58;
                    i = ((m6981 ^ i57) * (-5885)) ^ 2064158861;
                    i2 = -2070432129;
                    i60 = m6981 ^ i2;
                    i59 = i;
                case 245152290:
                case 1077098457:
                    str = str25;
                    str2 = str26;
                    str4 = str23;
                    i6 = i64;
                    jSONObject2 = jSONObject8;
                    iArr2 = iArr7;
                    i8 = i61;
                    str8 = str21;
                    sArr2 = sArr13;
                    editor = editor5;
                    i9 = i65;
                    i10 = i66;
                    i11 = i62;
                    sArr6 = sArr11;
                    String m50602 = C22628.m50602(sArr6, 109, 18, i71);
                    if (z) {
                        int m25668 = (i57 - C0630.m2566("ۛۚ")) * (-91);
                        str3 = m50602;
                        i59 = ((m25668 ^ i58) * (-10951)) ^ (-1199554754);
                        i60 = m25668 ^ 1168864106;
                        sArr11 = sArr6;
                        str21 = str8;
                        i62 = i11;
                        i61 = i8;
                        iArr7 = iArr2;
                        i64 = i6;
                        i66 = i10;
                        i65 = i9;
                        editor5 = editor;
                        str23 = str4;
                        sArr13 = sArr2;
                        str26 = str2;
                        jSONObject8 = jSONObject2;
                        str25 = str;
                        str22 = str3;
                    } else {
                        str3 = m50602;
                        m69813 = (C0630.m2566("۠֨") + i58) * 91;
                        i22 = ((m69813 ^ i57) * (-16031)) ^ 666506881;
                        i23 = -2017236567;
                        i60 = m69813 ^ i23;
                        i59 = i22;
                        sArr11 = sArr6;
                        str21 = str8;
                        i62 = i11;
                        i61 = i8;
                        iArr7 = iArr2;
                        i64 = i6;
                        i66 = i10;
                        i65 = i9;
                        editor5 = editor;
                        str23 = str4;
                        sArr13 = sArr2;
                        str26 = str2;
                        jSONObject8 = jSONObject2;
                        str25 = str;
                        str22 = str3;
                    }
                case 289290631:
                case 1392186888:
                    str13 = str25;
                    int i93 = i65;
                    JSONObject jSONObject14 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    editor3 = editor5;
                    editor3.putInt(RunnableC0588.m2431(c29462), jSONObject14.getInt(RunnableC0588.m2431(c29462)));
                    i33 = i93;
                    str16 = str22;
                    jSONObject5 = jSONObject14;
                    str14 = str26;
                    int i94 = i64;
                    str11 = str21;
                    str17 = str23;
                    i31 = i94;
                    int m2566722 = C0630.m2566("ۘ᩻") ^ i57;
                    str15 = str17;
                    i60 = m2566722 ^ (-1204283536);
                    i59 = ((m2566722 ^ i58) * (-18721)) ^ 1447473826;
                    str21 = str11;
                    i61 = i32;
                    iArr7 = iArr5;
                    i64 = i31;
                    str23 = str15;
                    str26 = str14;
                    str25 = str13;
                    JSONObject jSONObject10222222 = jSONObject5;
                    str22 = str16;
                    i62 = i35;
                    i66 = i34;
                    i65 = i33;
                    editor5 = editor3;
                    sArr13 = sArr8;
                    jSONObject8 = jSONObject10222222;
                case 299545975:
                case 520302619:
                    C7106.m19120();
                    C4117.m12364();
                    str13 = str25;
                    str14 = str26;
                    str15 = str23;
                    i31 = i64;
                    jSONObject4 = jSONObject8;
                    iArr5 = iArr7;
                    i32 = i61;
                    str11 = str21;
                    sArr8 = sArr13;
                    editor3 = editor5;
                    i33 = i65;
                    i34 = i66;
                    i35 = i62;
                    str16 = str22;
                    m25662 = (i57 - C2105.m6981("ۨ֫")) * 127;
                    jSONObject5 = jSONObject4;
                    i59 = ((m25662 ^ i58) * 3847) ^ (-1529911022);
                    i36 = 501954095;
                    i60 = m25662 ^ i36;
                    str21 = str11;
                    i61 = i32;
                    iArr7 = iArr5;
                    i64 = i31;
                    str23 = str15;
                    str26 = str14;
                    str25 = str13;
                    JSONObject jSONObject102222222 = jSONObject5;
                    str22 = str16;
                    i62 = i35;
                    i66 = i34;
                    i65 = i33;
                    editor5 = editor3;
                    sArr13 = sArr8;
                    jSONObject8 = jSONObject102222222;
                case 458288283:
                case 1754411541:
                    i11 = i62;
                    str = str25;
                    str2 = str26;
                    str3 = str22;
                    str4 = str23;
                    jSONObject2 = jSONObject8;
                    iArr2 = iArr7;
                    short[] sArr15 = sArr10;
                    int i95 = i68;
                    int i96 = i69;
                    i8 = i61;
                    sArr2 = sArr13;
                    editor = editor5;
                    i9 = i65;
                    String m9934 = C3245.m9934(sArr15, i95, i96, i71);
                    sArr11 = f21978;
                    if (C4263.f13799 <= 0) {
                        sArr10 = sArr15;
                        i68 = i95;
                        i69 = i96;
                        str21 = m9934;
                        i64 = 1;
                        i10 = 3;
                        int m69811022 = (i58 - C2105.m6981("᩻ܽ")) * (-31);
                        i60 = m69811022 ^ 1712293296;
                        i59 = ((m69811022 ^ i57) * (-4603)) ^ 1915914303;
                        str23 = str4;
                        i62 = i11;
                        i61 = i8;
                        str26 = str2;
                        iArr7 = iArr2;
                        i66 = i10;
                        i65 = i9;
                        str25 = str;
                        editor5 = editor;
                        sArr13 = sArr2;
                        jSONObject8 = jSONObject2;
                        str22 = str3;
                    } else {
                        int m698113 = (C2105.m6981("ۨ᩷") ^ i57) * 29;
                        i59 = ((m698113 ^ i58) * (-14957)) ^ 974833336;
                        i68 = i95;
                        i69 = i96;
                        str21 = m9934;
                        i65 = i9;
                        i62 = i11;
                        i61 = i8;
                        sArr10 = sArr15;
                        i64 = 1;
                        i66 = 3;
                        editor5 = editor;
                        iArr7 = iArr2;
                        str23 = str4;
                        sArr13 = sArr2;
                        i60 = m698113 ^ 420763384;
                        str26 = str2;
                        jSONObject8 = jSONObject2;
                        str25 = str;
                        str22 = str3;
                    }
                case 547606214:
                case 716676084:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        str13 = str25;
                        str14 = str26;
                        str15 = str23;
                        i31 = i64;
                        jSONObject4 = jSONObject8;
                        iArr5 = iArr7;
                        i32 = i61;
                        str11 = str21;
                        sArr8 = sArr13;
                        editor3 = editor5;
                        i33 = i65;
                        i34 = i66;
                        i35 = i62;
                        str16 = str22;
                        m25662 = (i57 - C2105.m6981("ۨ֫")) * 127;
                        jSONObject5 = jSONObject4;
                        i59 = ((m25662 ^ i58) * 3847) ^ (-1529911022);
                        i36 = 501954095;
                        i60 = m25662 ^ i36;
                        str21 = str11;
                        i61 = i32;
                        iArr7 = iArr5;
                        i64 = i31;
                        str23 = str15;
                        str26 = str14;
                        str25 = str13;
                        JSONObject jSONObject1022222222 = jSONObject5;
                        str22 = str16;
                        i62 = i35;
                        i66 = i34;
                        i65 = i33;
                        editor5 = editor3;
                        sArr13 = sArr8;
                        jSONObject8 = jSONObject1022222222;
                    } else {
                        str = str25;
                        m2575 = str26;
                        str3 = str22;
                        str6 = str23;
                        i14 = i64;
                        jSONObject2 = jSONObject8;
                        iArr3 = iArr7;
                        sArr4 = sArr10;
                        i19 = i68;
                        i15 = i61;
                        str7 = str21;
                        sArr2 = sArr13;
                        editor = editor5;
                        sArr5 = sArr11;
                        i16 = i65;
                        i17 = i66;
                        i18 = i62;
                        m69812 = C0630.m2566("ۢۙ") ^ i58;
                        i20 = ((m69812 ^ i57) * 18329) ^ 1112500836;
                        i21 = -606533517;
                        sArr11 = sArr5;
                        str21 = str7;
                        i61 = i15;
                        i68 = i19;
                        sArr10 = sArr4;
                        i60 = m69812 ^ i21;
                        iArr7 = iArr3;
                        i64 = i14;
                        i62 = i18;
                        str23 = str6;
                        i66 = i17;
                        i65 = i16;
                        str26 = m2575;
                        i59 = i20;
                        editor5 = editor;
                        sArr13 = sArr2;
                        str25 = str;
                        jSONObject8 = jSONObject2;
                        str22 = str3;
                    }
                case 880954667:
                case 1797519729:
                    if (!RunnableC1108.m3790()) {
                        m6981 = (C0630.m2566("᩻ۨ") ^ i57) * 45;
                        i = ((m6981 ^ i58) * (-22793)) ^ 338069200;
                        i2 = -7256791;
                        i60 = m6981 ^ i2;
                        i59 = i;
                    }
                    m6981 = C0630.m2566("᩶᩺") ^ i58;
                    i = ((m6981 ^ i57) * (-23453)) ^ (-289717495);
                    i2 = 358934316;
                    i60 = m6981 ^ i2;
                    i59 = i;
                case 995465366:
                case 1094530555:
                    String str30 = str25;
                    JSONObject jSONObject15 = jSONObject8;
                    int[] iArr8 = iArr7;
                    int i97 = i61;
                    short[] sArr16 = sArr13;
                    SharedPreferences.Editor editor7 = editor5;
                    int i98 = i66;
                    if (i63 != 2) {
                        m69815 = C0630.m2566("ۖܰ") ^ i58;
                        i48 = ((m69815 ^ i57) * 15857) ^ (-1825279810);
                        i49 = 579019106;
                    } else {
                        m69815 = (i57 - C2105.m6981("ۛ᩹")) * (-125);
                        i48 = ((m69815 ^ i58) * 28821) ^ (-679725053);
                        i49 = 1419673294;
                    }
                    i60 = m69815 ^ i49;
                    i66 = i98;
                    i59 = i48;
                    editor5 = editor7;
                    sArr13 = sArr16;
                    i61 = i97;
                    i62 = 0;
                    jSONObject8 = jSONObject15;
                    iArr7 = iArr8;
                    str25 = str30;
                case 1122886270:
                case 1682979395:
                    i3 = i61;
                    i4 = i66;
                    i5 = i62;
                    JSONArray jSONArray2 = jSONObject9.getJSONArray(RunnableC0588.m2431(c2946));
                    int size = jSONArray2.size();
                    i67 = size;
                    i70 = i5;
                    jSONArray = jSONArray2;
                    iArr = new int[size];
                    int m25669 = (C0630.m2566("᩻ۗ") + i57) * q.h;
                    i = ((m25669 ^ i58) * (-30475)) ^ 372593527;
                    i60 = m25669 ^ (-879795269);
                    i62 = i5;
                    i66 = i4;
                    i61 = i3;
                    iArr7 = iArr;
                    i59 = i;
                case 1285317122:
                case 1583755050:
                    str13 = str25;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    i43 = i64;
                    editor3 = editor5;
                    str11 = str21;
                    c2946 = (C2946) C2272.m7513(it);
                    if (jSONObject9.contains(RunnableC0588.m2431(c2946))) {
                        m25663 = C2105.m6981("֡᩺") ^ i58;
                        i44 = ((m25663 ^ i57) * 363) ^ (-929552129);
                        i45 = -869977266;
                        i60 = m25663 ^ i45;
                        editor5 = editor3;
                        sArr13 = sArr8;
                        i62 = i35;
                        jSONObject8 = jSONObject7;
                        i66 = i34;
                        str25 = str13;
                        i65 = i42;
                        i59 = i44;
                        str21 = str11;
                        i64 = i43;
                        i61 = i32;
                        iArr7 = iArr5;
                    } else {
                        str19 = str23;
                        int m698192222222 = C2105.m6981("ۢ᩵") ^ i58;
                        i41 = i43;
                        int i742222222 = ((m698192222222 ^ i57) * (-11577)) ^ (-148249733);
                        i60 = m698192222222 ^ (-472685581);
                        editor5 = editor3;
                        sArr13 = sArr8;
                        i62 = i35;
                        jSONObject8 = jSONObject7;
                        i66 = i34;
                        str25 = str13;
                        i65 = i42;
                        i59 = i742222222;
                        i61 = i32;
                        iArr7 = iArr5;
                        i46 = i41;
                        str23 = str19;
                        str21 = str11;
                        i64 = i46;
                    }
                case 1510923055:
                case 1952969015:
                    str = str25;
                    str3 = str22;
                    str6 = str23;
                    i14 = i64;
                    jSONObject2 = jSONObject8;
                    iArr3 = iArr7;
                    sArr4 = sArr10;
                    i15 = i61;
                    str7 = str21;
                    sArr2 = sArr13;
                    editor = editor5;
                    sArr5 = sArr11;
                    i16 = i65;
                    i17 = i66;
                    i18 = i62;
                    i19 = i68;
                    m2575 = C0630.m2575(f21978, 77, 3, i71);
                    z = jSONObject.contains(m2575);
                    if (C2105.f7037 == 0) {
                        m69812 = (C2105.m6981("ܰ᩵") + i57) * 21;
                        i20 = ((m69812 ^ i58) * (-32535)) ^ 243163359;
                        i21 = 711761456;
                        sArr11 = sArr5;
                        str21 = str7;
                        i61 = i15;
                        i68 = i19;
                        sArr10 = sArr4;
                        i60 = m69812 ^ i21;
                        iArr7 = iArr3;
                        i64 = i14;
                        i62 = i18;
                        str23 = str6;
                        i66 = i17;
                        i65 = i16;
                        str26 = m2575;
                        i59 = i20;
                        editor5 = editor;
                        sArr13 = sArr2;
                        str25 = str;
                        jSONObject8 = jSONObject2;
                        str22 = str3;
                    }
                    m69812 = C0630.m2566("ۢۙ") ^ i58;
                    i20 = ((m69812 ^ i57) * 18329) ^ 1112500836;
                    i21 = -606533517;
                    sArr11 = sArr5;
                    str21 = str7;
                    i61 = i15;
                    i68 = i19;
                    sArr10 = sArr4;
                    i60 = m69812 ^ i21;
                    iArr7 = iArr3;
                    i64 = i14;
                    i62 = i18;
                    str23 = str6;
                    i66 = i17;
                    i65 = i16;
                    str26 = m2575;
                    i59 = i20;
                    editor5 = editor;
                    sArr13 = sArr2;
                    str25 = str;
                    jSONObject8 = jSONObject2;
                    str22 = str3;
                case 1918834820:
                case 1976915259:
                    iArr5 = iArr7;
                    i32 = i61;
                    int i99 = i66;
                    i35 = i62;
                    str13 = str25;
                    JSONObject jSONObject16 = jSONObject8;
                    sArr8 = sArr13;
                    editor3 = editor5;
                    editor3.putBoolean(C3683.m11215(c29462), jSONObject16.getBoolean(RunnableC0588.m2431(c29462)));
                    str16 = str22;
                    i33 = i65;
                    i34 = i99;
                    jSONObject5 = jSONObject16;
                    str14 = str26;
                    int i942 = i64;
                    str11 = str21;
                    str17 = str23;
                    i31 = i942;
                    int m25667222 = C0630.m2566("ۘ᩻") ^ i57;
                    str15 = str17;
                    i60 = m25667222 ^ (-1204283536);
                    i59 = ((m25667222 ^ i58) * (-18721)) ^ 1447473826;
                    str21 = str11;
                    i61 = i32;
                    iArr7 = iArr5;
                    i64 = i31;
                    str23 = str15;
                    str26 = str14;
                    str25 = str13;
                    JSONObject jSONObject10222222222 = jSONObject5;
                    str22 = str16;
                    i62 = i35;
                    i66 = i34;
                    i65 = i33;
                    editor5 = editor3;
                    sArr13 = sArr8;
                    jSONObject8 = jSONObject10222222222;
                case 2035023254:
                case 2098959145:
                    str13 = str25;
                    i42 = i65;
                    jSONObject7 = jSONObject8;
                    i34 = i66;
                    iArr5 = iArr7;
                    i32 = i61;
                    i35 = i62;
                    sArr8 = sArr13;
                    i43 = i64;
                    editor3 = editor5;
                    str11 = str21;
                    editor3.putString(C3683.m11215(c29462), jSONObject7.getString(RunnableC0588.m2431(c29462)));
                    i33 = i42;
                    str16 = str22;
                    str17 = str23;
                    i31 = i43;
                    jSONObject5 = jSONObject7;
                    str14 = str26;
                    int m256672222 = C0630.m2566("ۘ᩻") ^ i57;
                    str15 = str17;
                    i60 = m256672222 ^ (-1204283536);
                    i59 = ((m256672222 ^ i58) * (-18721)) ^ 1447473826;
                    str21 = str11;
                    i61 = i32;
                    iArr7 = iArr5;
                    i64 = i31;
                    str23 = str15;
                    str26 = str14;
                    str25 = str13;
                    JSONObject jSONObject102222222222 = jSONObject5;
                    str22 = str16;
                    i62 = i35;
                    i66 = i34;
                    i65 = i33;
                    editor5 = editor3;
                    sArr13 = sArr8;
                    jSONObject8 = jSONObject102222222222;
                default:
                    iArr7[i70] = jSONArray.getInt(i70);
                    i70++;
                    iArr = iArr7;
                    i3 = i61;
                    i4 = i66;
                    i5 = i62;
                    int m256692 = (C0630.m2566("᩻ۗ") + i57) * q.h;
                    i = ((m256692 ^ i58) * (-30475)) ^ 372593527;
                    i60 = m256692 ^ (-879795269);
                    i62 = i5;
                    i66 = i4;
                    i61 = i3;
                    iArr7 = iArr;
                    i59 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0176, code lost:
    
        if (l.RunnableC0588.m2441() >= 0) goto L38;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m19197(bin.mt.json.JSONArray r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 3332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7179.m19197(bin.mt.json.JSONArray, boolean):void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m19200(JSONArray jSONArray, boolean z) {
        short s = f21978[189];
        int i = 74984 * s;
        int i2 = s + 18746;
        int i3 = i - (i2 * i2) <= 0 ? 44207 : 21196;
        ArrayList arrayList = new ArrayList(jSONArray.size());
        int i4 = 0;
        if (!z) {
            int size = jSONArray.size();
            while (i4 < size) {
                try {
                    C1916.m6307(arrayList, C12749.m31030(jSONArray.getJSONObject(i4)));
                } catch (RuntimeException unused) {
                }
                i4++;
            }
        } else {
            synchronized (C12749.class) {
                List m31046 = C12749.m31046();
                C4159.m12575(m31046, C3683.m11225(f21978, 190, 15, i3));
                arrayList.addAll(m31046);
                List m31048 = C12749.m31048();
                C2126.m7031(m31048, C2167.m7159(f21978, 205, 19, i3));
                arrayList.addAll(m31048);
            }
            int size2 = jSONArray.size();
            while (i4 < size2) {
                try {
                    AbstractC3577 m31030 = C12749.m31030(jSONArray.getJSONObject(i4));
                    Iterator m12354 = C4117.m12354(arrayList);
                    while (true) {
                        if (C1773.m5910(m12354)) {
                            AbstractC3577 abstractC3577 = (AbstractC3577) RunnableC1108.m3791(m12354);
                            if (abstractC3577.f11356 == m31030.f11356) {
                                abstractC3577.mo6368(m31030);
                                break;
                            }
                        } else {
                            C1916.m6307(arrayList, m31030);
                            break;
                        }
                    }
                } catch (RuntimeException unused2) {
                }
                i4++;
            }
        }
        C12749.m31035(arrayList);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m19199(JSONArray jSONArray, boolean z) {
        short s = f21978[154];
        int i = (s * 29472) - ((s * s) + 217149696) <= 0 ? 25811 : 7614;
        ArrayList arrayList = new ArrayList(jSONArray.size());
        int i2 = 0;
        if (z) {
            synchronized (C12749.class) {
                List m31046 = C12749.m31046();
                C4159.m12575(m31046, C1128.m3841(f21978, 155, 15, i));
                arrayList.addAll(m31046);
                List m31048 = C12749.m31048();
                C4159.m12575(m31048, C4075.m12252(f21978, 170, 19, i));
                arrayList.addAll(m31048);
            }
            int size = jSONArray.size();
            while (i2 < size) {
                C1936 m19822 = C7375.m19822(jSONArray.getJSONObject(i2));
                Iterator m12354 = C4117.m12354(arrayList);
                while (true) {
                    if (C0483.m2123(m12354)) {
                        AbstractC3577 abstractC3577 = (AbstractC3577) RunnableC1108.m3791(m12354);
                        if (abstractC3577.f11356 == m19822.f11356) {
                            abstractC3577.mo6368(m19822);
                            break;
                        }
                    } else {
                        C1916.m6307(arrayList, m19822);
                        break;
                    }
                }
                i2++;
            }
        } else {
            int size2 = jSONArray.size();
            while (i2 < size2) {
                C7106.m19117(arrayList, C7375.m19822(jSONArray.getJSONObject(i2)));
                i2++;
            }
        }
        C12749.m31035(arrayList);
    }
}
