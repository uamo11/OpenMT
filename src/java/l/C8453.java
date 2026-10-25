package l;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* compiled from: V6YT */
/* renamed from: l.۠᩸᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C8453 extends AbstractC5447 implements InterfaceC8085 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final String[] f25852;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final String[] f25853;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String[] f25854;

    /* renamed from: ܳ᩹ۡ, reason: not valid java name and contains not printable characters */
    private static final short[] f25855 = {4445, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26641, 26630, 26638, 26636, 26647, 26630, 26701, 26673, 26630, 26638, 26636, 26647, 26630, 26672, 26630, 26641, 26645, 26630, 26641, 26672, 26630, 26641, 26645, 26634, 26624, 26630, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26672, 26679, 26658, 26673, 26679, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26643, 26639, 26646, 26640, 26701, 26661, 26679, 26675, 26684, 26672, 26662, 26673, 26677, 26662, 26673, 26684, 26672, 26679, 26658, 26673, 26679, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26638, 26624, 26643, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26672, 26679, 26658, 26673, 26679, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26641, 26630, 26638, 26636, 26647, 26630, 26701, 26673, 26630, 26638, 26636, 26647, 26630, 26672, 26630, 26641, 26645, 26630, 26641, 26672, 26630, 26641, 26645, 26634, 26624, 26630, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26661, 26658, 26666, 26671, 26662, 26663, 26684, 26679, 26668, 26684, 26672, 26679, 26658, 26673, 26679, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26643, 26639, 26646, 26640, 26701, 26661, 26679, 26675, 26684, 26672, 26662, 26673, 26677, 26662, 26673, 26684, 26661, 26658, 26666, 26671, 26662, 26663, 26684, 26679, 26668, 26684, 26672, 26679, 26658, 26673, 26679, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26638, 26624, 26643, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26661, 26658, 26666, 26671, 26662, 26663, 26684, 26679, 26668, 26684, 26672, 26679, 26658, 26673, 26679, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26641, 26630, 26638, 26636, 26647, 26630, 26701, 26673, 26630, 26638, 26636, 26647, 26630, 26672, 26630, 26641, 26645, 26630, 26641, 26672, 26630, 26641, 26645, 26634, 26624, 26630, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26672, 26679, 26668, 26675, 26675, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26643, 26639, 26646, 26640, 26701, 26661, 26679, 26675, 26684, 26672, 26662, 26673, 26677, 26662, 26673, 26684, 26672, 26679, 26668, 26675, 26675, 26662, 26663, 26625, 26634, 26637, 26701, 26638, 26647, 26701, 26638, 26624, 26643, 26701, 26658, 26656, 26679, 26666, 26668, 26669, 26684, 26672, 26679, 26668, 26675, 26675, 26662, 26663, 6503, -27656, -27678, 8854, -4431, 2282, 11069, 8987, -9063, -15257, -15501, -9523, -2668, 11461, -3039, 12678, -3395, 6198, -29889, -10008, -3349, 3531, 1242, -22110, -22110, -22105, -22094, -22140, -22081, -22086, -22081, -22082, -22106, -22081, -22031, -22110, -22107, -22096, -22109, -22107, -22108, -22111, -22031, -22110, -22092, -22109, -22105, -22088, -22094, -22092, -22037, -22031};

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f25856;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f25857;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f25858;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f25859;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Runnable[] f25860;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f25861;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Handler f25862;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f25863;

    @Override // l.InterfaceC8085
    /* renamed from: ֫ */
    public final /* synthetic */ void mo6024(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* renamed from: ܳ */
    public final /* synthetic */ void mo6026(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* renamed from: ܿ */
    public final /* synthetic */ void mo6028(InterfaceC23586 interfaceC23586) {
    }

    @Override // l.InterfaceC8085
    /* renamed from: ᩳ */
    public final /* synthetic */ void mo6029(InterfaceC23586 interfaceC23586) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x014a, code lost:
    
        r6 = l.C0630.m2566("֨۬") ^ r4;
        r7 = ((r6 ^ r5) * (-131)) ^ (-1664535367);
        r8 = -1853836596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x016a, code lost:
    
        r6 = l.C0630.m2566("ۜ᩶") ^ r5;
        r7 = ((r6 ^ r4) * 28955) ^ 493944855;
        r8 = -787152076;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8453() {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8453.<init>():void");
    }

    static {
        short[] sArr;
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        String[] strArr;
        int i3;
        int i4;
        short[] sArr2;
        String m5917;
        short[] sArr3;
        int m6981;
        int i5;
        short[] sArr4;
        String str4;
        String str5;
        int i6;
        int m2566;
        int i7;
        int i8;
        String str6;
        int i9;
        short[] sArr5;
        String str7;
        int i10;
        int i11;
        String[] strArr2;
        int i12;
        int i13;
        int m69812;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int m69813;
        int i23;
        String str8 = null;
        String[] strArr3 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        int i24 = C2520.f8000;
        int i25 = C3683.f11629;
        int m69814 = C2105.m6981("ۤۢ") ^ i25;
        int i26 = ((m69814 ^ i24) * (-16235)) ^ (-675606742);
        int i27 = m69814 ^ 1552986992;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 1891017409;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        String str12 = null;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        short s = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        while (true) {
            i31 = i27 ^ ((((i31 ^ i24) * 18793) >> 31) & i26);
            switch (i31) {
                case -2077215967:
                case 862064711:
                    sArr = sArr10;
                    i = i38;
                    str = str12;
                    str2 = str8;
                    str3 = str9;
                    i2 = i32;
                    short[] sArr11 = sArr9;
                    strArr = strArr3;
                    i3 = i36;
                    i4 = i37;
                    sArr2 = sArr11;
                    if (C4616.f14690 > 0) {
                        sArr3 = sArr;
                        m5917 = str11;
                        str11 = m5917;
                        int m25662 = (C0630.m2566("۟۠") ^ i24) * (-59);
                        str12 = str;
                        i26 = ((m25662 ^ i25) * (-25811)) ^ 403728060;
                        i27 = m25662 ^ 1223007817;
                        i32 = i2;
                        str9 = str3;
                        i38 = i;
                        String str13 = str2;
                        sArr10 = sArr3;
                        str8 = str13;
                        int i39 = i4;
                        i36 = i3;
                        strArr3 = strArr;
                        sArr9 = sArr2;
                        i37 = i39;
                    } else {
                        m2566 = C0630.m2566("۬ۡ") ^ i24;
                        i7 = ((m2566 ^ i25) * 2673) ^ 465013443;
                        i8 = -2097094026;
                        int i40 = m2566 ^ i8;
                        str12 = str;
                        i26 = i7;
                        str8 = str2;
                        sArr10 = sArr;
                        i27 = i40;
                        i32 = i2;
                        str9 = str3;
                        i38 = i;
                        int i41 = i4;
                        i36 = i3;
                        strArr3 = strArr;
                        sArr9 = sArr2;
                        i37 = i41;
                    }
                case -2046503659:
                case 594295466:
                    sArr = sArr10;
                    i = i38;
                    String str14 = str12;
                    str6 = str8;
                    str3 = str9;
                    i2 = i32;
                    short[] sArr12 = sArr9;
                    strArr2 = strArr3;
                    i12 = i36;
                    i13 = i37;
                    sArr5 = sArr12;
                    i30 = i29 + 216796176;
                    if (C0630.m2564()) {
                        str12 = str14;
                        i9 = i13;
                        i36 = i12;
                        int m69815 = C2105.m6981("֨ܽ") ^ i25;
                        i15 = -941267137;
                        i16 = i9;
                        m69812 = m69815;
                        i14 = ((m69815 ^ i24) * (-12915)) ^ 1355326554;
                        int i42 = m69812 ^ i15;
                        i26 = i14;
                        i10 = i42;
                        i32 = i2;
                        short[] sArr13 = sArr5;
                        i37 = i16;
                        strArr3 = strArr2;
                        sArr9 = sArr13;
                        str9 = str3;
                        i38 = i;
                        short[] sArr14 = sArr;
                        i27 = i10;
                        str8 = str6;
                        sArr10 = sArr14;
                    } else {
                        m69812 = (C2105.m6981("ۚ֡") ^ i25) * (-39);
                        i14 = ((m69812 ^ i24) * 32533) ^ (-394055040);
                        str12 = str14;
                        i15 = -839440272;
                        i36 = i12;
                        i16 = i13;
                        int i422 = m69812 ^ i15;
                        i26 = i14;
                        i10 = i422;
                        i32 = i2;
                        short[] sArr132 = sArr5;
                        i37 = i16;
                        strArr3 = strArr2;
                        sArr9 = sArr132;
                        str9 = str3;
                        i38 = i;
                        short[] sArr142 = sArr;
                        i27 = i10;
                        str8 = str6;
                        sArr10 = sArr142;
                    }
                case -1989003555:
                case 2129262635:
                    sArr = sArr10;
                    i = i38;
                    str6 = str8;
                    str3 = str9;
                    i2 = i32;
                    short[] sArr15 = sArr9;
                    strArr2 = strArr3;
                    i12 = i36;
                    i13 = i37;
                    sArr5 = sArr15;
                    str12 = C1047.m3603(f25855, 1, 48, i34);
                    if (!RunnableC1108.m3790()) {
                        int m25663 = (C0630.m2566("ᩳܰ") + i25) * 11;
                        i10 = m25663 ^ 961696396;
                        i17 = ((m25663 ^ i24) * 23245) ^ (-1716427399);
                        i26 = i17;
                        i32 = i2;
                        int i43 = i13;
                        i36 = i12;
                        strArr3 = strArr2;
                        sArr9 = sArr5;
                        i37 = i43;
                        str9 = str3;
                        i38 = i;
                        short[] sArr1422 = sArr;
                        i27 = i10;
                        str8 = str6;
                        sArr10 = sArr1422;
                    }
                    i9 = i13;
                    i36 = i12;
                    int m698152 = C2105.m6981("֨ܽ") ^ i25;
                    i15 = -941267137;
                    i16 = i9;
                    m69812 = m698152;
                    i14 = ((m698152 ^ i24) * (-12915)) ^ 1355326554;
                    int i4222 = m69812 ^ i15;
                    i26 = i14;
                    i10 = i4222;
                    i32 = i2;
                    short[] sArr1322 = sArr5;
                    i37 = i16;
                    strArr3 = strArr2;
                    sArr9 = sArr1322;
                    str9 = str3;
                    i38 = i;
                    short[] sArr14222 = sArr;
                    i27 = i10;
                    str8 = str6;
                    sArr10 = sArr14222;
                case -1963780631:
                case -1196782110:
                    sArr = sArr10;
                    i = i38;
                    str7 = str12;
                    str6 = str8;
                    str3 = str9;
                    short[] sArr16 = sArr9;
                    strArr2 = strArr3;
                    i12 = i36;
                    i13 = i37;
                    sArr5 = sArr16;
                    sArr6 = f25855;
                    if (RunnableC3474.f10992 <= 0) {
                        i32 = 49;
                        int m69816 = C2105.m6981("᩷֨") ^ i24;
                        i2 = i32;
                        i17 = ((m69816 ^ i25) * (-19829)) ^ 6347874;
                        i10 = m69816 ^ 1974690235;
                        str12 = str7;
                        i26 = i17;
                        i32 = i2;
                        int i432 = i13;
                        i36 = i12;
                        strArr3 = strArr2;
                        sArr9 = sArr5;
                        i37 = i432;
                        str9 = str3;
                        i38 = i;
                        short[] sArr142222 = sArr;
                        i27 = i10;
                        str8 = str6;
                        sArr10 = sArr142222;
                    } else {
                        int m69817 = C2105.m6981("ۚۡ") ^ i25;
                        i18 = -924093928;
                        i19 = 49;
                        i20 = ((m69817 ^ i24) * 29617) ^ (-1758517299);
                        i21 = m69817;
                        int i44 = i20;
                        i10 = i21 ^ i18;
                        i32 = i19;
                        i11 = i44;
                        str12 = str7;
                        i26 = i11;
                        int i4322 = i13;
                        i36 = i12;
                        strArr3 = strArr2;
                        sArr9 = sArr5;
                        i37 = i4322;
                        str9 = str3;
                        i38 = i;
                        short[] sArr1422222 = sArr;
                        i27 = i10;
                        str8 = str6;
                        sArr10 = sArr1422222;
                    }
                case -1900445336:
                case -1714754816:
                    ServiceConnectionC3453.m10564();
                    throw new RuntimeException();
                case -1775002728:
                case 145028951:
                    sArr = sArr10;
                    i = i38;
                    str = str12;
                    str2 = str8;
                    str3 = str9;
                    i2 = i32;
                    short[] sArr17 = sArr9;
                    strArr = strArr3;
                    i3 = i36;
                    i4 = i37;
                    sArr2 = sArr17;
                    C1294.m4372();
                    sArr3 = sArr;
                    m5917 = str11;
                    str11 = m5917;
                    int m256622 = (C0630.m2566("۟۠") ^ i24) * (-59);
                    str12 = str;
                    i26 = ((m256622 ^ i25) * (-25811)) ^ 403728060;
                    i27 = m256622 ^ 1223007817;
                    i32 = i2;
                    str9 = str3;
                    i38 = i;
                    String str132 = str2;
                    sArr10 = sArr3;
                    str8 = str132;
                    int i392 = i4;
                    i36 = i3;
                    strArr3 = strArr;
                    sArr9 = sArr2;
                    i37 = i392;
                case -1727765695:
                case -1617810067:
                    sArr = sArr10;
                    i = i38;
                    str7 = str12;
                    str6 = str8;
                    i22 = i37;
                    str3 = str9;
                    i19 = i32;
                    sArr5 = sArr9;
                    strArr2 = strArr3;
                    i12 = i36;
                    i34 = 26723;
                    i21 = (C2105.m6981("ۡᩴ") + i24) * (-105);
                    i13 = i22;
                    i20 = ((i21 ^ i25) * (-23573)) ^ 2086323634;
                    i18 = -940671734;
                    int i442 = i20;
                    i10 = i21 ^ i18;
                    i32 = i19;
                    i11 = i442;
                    str12 = str7;
                    i26 = i11;
                    int i43222 = i13;
                    i36 = i12;
                    strArr3 = strArr2;
                    sArr9 = sArr5;
                    i37 = i43222;
                    str9 = str3;
                    i38 = i;
                    short[] sArr14222222 = sArr;
                    i27 = i10;
                    str8 = str6;
                    sArr10 = sArr14222222;
                case -1476495726:
                case -382828225:
                    int i45 = i37;
                    short[] sArr18 = sArr10;
                    i = i38;
                    str = str12;
                    str3 = str9;
                    i2 = i32;
                    short[] sArr19 = sArr9;
                    strArr = strArr3;
                    i3 = i36;
                    String m8030 = C2520.m8030(sArr19, i45, i3, i34);
                    short[] sArr20 = f25855;
                    if (C11340.f33930 >= 0) {
                        int m69818 = C2105.m6981("ܰۗ") ^ i25;
                        int i46 = ((m69818 ^ i24) * (-18719)) ^ 394594665;
                        i4 = i45;
                        str8 = m8030;
                        sArr4 = sArr18;
                        sArr8 = sArr20;
                        m6981 = m69818;
                        str4 = str11;
                        i28 = 38;
                        sArr2 = sArr19;
                        i5 = i46;
                        str5 = str10;
                        i35 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                        i6 = -1644363139;
                    } else {
                        int m25664 = (C0630.m2566("ۨܰ") ^ i24) * (-17);
                        sArr2 = sArr19;
                        i5 = ((m25664 ^ i25) * 293) ^ (-811314515);
                        i4 = i45;
                        str8 = m8030;
                        sArr4 = sArr18;
                        sArr8 = sArr20;
                        m6981 = m25664;
                        str4 = str11;
                        i28 = 38;
                        i35 = DHParameters.DEFAULT_MINIMUM_LENGTH;
                        str5 = str10;
                        i6 = -1311518691;
                    }
                    i27 = m6981 ^ i6;
                    str10 = str5;
                    str11 = str4;
                    sArr10 = sArr4;
                    str12 = str;
                    i26 = i5;
                    i32 = i2;
                    str9 = str3;
                    i38 = i;
                    int i412 = i4;
                    i36 = i3;
                    strArr3 = strArr;
                    sArr9 = sArr2;
                    i37 = i412;
                case -1474842909:
                case 1975848218:
                    sArr = sArr10;
                    i = i38;
                    str = str12;
                    str3 = str9;
                    i2 = i32;
                    s = f25855[0];
                    i29 = s * s;
                    if (C3432.f10845 < 0) {
                        m2566 = C0630.m2566("۬ܽ") ^ i24;
                        str2 = str8;
                        i7 = ((m2566 ^ i25) * (-28463)) ^ (-1170602153);
                        i8 = -1463275729;
                        short[] sArr21 = sArr9;
                        strArr = strArr3;
                        i3 = i36;
                        i4 = i37;
                        sArr2 = sArr21;
                        int i402 = m2566 ^ i8;
                        str12 = str;
                        i26 = i7;
                        str8 = str2;
                        sArr10 = sArr;
                        i27 = i402;
                        i32 = i2;
                        str9 = str3;
                        i38 = i;
                        int i4122 = i4;
                        i36 = i3;
                        strArr3 = strArr;
                        sArr9 = sArr2;
                        i37 = i4122;
                    }
                    str2 = str8;
                    short[] sArr22 = sArr9;
                    strArr = strArr3;
                    i3 = i36;
                    i4 = i37;
                    sArr2 = sArr22;
                    m2566 = C0630.m2566("۬ۡ") ^ i24;
                    i7 = ((m2566 ^ i25) * 2673) ^ 465013443;
                    i8 = -2097094026;
                    int i4022 = m2566 ^ i8;
                    str12 = str;
                    i26 = i7;
                    str8 = str2;
                    sArr10 = sArr;
                    i27 = i4022;
                    i32 = i2;
                    str9 = str3;
                    i38 = i;
                    int i41222 = i4;
                    i36 = i3;
                    strArr3 = strArr;
                    sArr9 = sArr2;
                    i37 = i41222;
                case -926248028:
                case -32205826:
                    sArr = sArr10;
                    i = i38;
                    str = str12;
                    str3 = str9;
                    i2 = i32;
                    if (C1504.m5179()) {
                        str6 = str8;
                        str12 = str;
                        i9 = i37;
                        sArr5 = sArr9;
                        strArr2 = strArr3;
                        int m6981522 = C2105.m6981("֨ܽ") ^ i25;
                        i15 = -941267137;
                        i16 = i9;
                        m69812 = m6981522;
                        i14 = ((m6981522 ^ i24) * (-12915)) ^ 1355326554;
                        int i42222 = m69812 ^ i15;
                        i26 = i14;
                        i10 = i42222;
                        i32 = i2;
                        short[] sArr13222 = sArr5;
                        i37 = i16;
                        strArr3 = strArr2;
                        sArr9 = sArr13222;
                        str9 = str3;
                        i38 = i;
                        short[] sArr142222222 = sArr;
                        i27 = i10;
                        str8 = str6;
                        sArr10 = sArr142222222;
                    } else {
                        str2 = str8;
                        short[] sArr222 = sArr9;
                        strArr = strArr3;
                        i3 = i36;
                        i4 = i37;
                        sArr2 = sArr222;
                        m2566 = C0630.m2566("۬ۡ") ^ i24;
                        i7 = ((m2566 ^ i25) * 2673) ^ 465013443;
                        i8 = -2097094026;
                        int i40222 = m2566 ^ i8;
                        str12 = str;
                        i26 = i7;
                        str8 = str2;
                        sArr10 = sArr;
                        i27 = i40222;
                        i32 = i2;
                        str9 = str3;
                        i38 = i;
                        int i412222 = i4;
                        i36 = i3;
                        strArr3 = strArr;
                        sArr9 = sArr2;
                        i37 = i412222;
                    }
                case -856354138:
                case 1150179867:
                    sArr = sArr10;
                    i = i38;
                    str7 = str12;
                    str3 = str9;
                    i19 = i32;
                    str6 = str8;
                    i22 = i37;
                    i34 = 39578;
                    sArr5 = sArr9;
                    strArr2 = strArr3;
                    i12 = i36;
                    i21 = (C2105.m6981("ۡᩴ") + i24) * (-105);
                    i13 = i22;
                    i20 = ((i21 ^ i25) * (-23573)) ^ 2086323634;
                    i18 = -940671734;
                    int i4422 = i20;
                    i10 = i21 ^ i18;
                    i32 = i19;
                    i11 = i4422;
                    str12 = str7;
                    i26 = i11;
                    int i432222 = i13;
                    i36 = i12;
                    strArr3 = strArr2;
                    sArr9 = sArr5;
                    i37 = i432222;
                    str9 = str3;
                    i38 = i;
                    short[] sArr1422222222 = sArr;
                    i27 = i10;
                    str8 = str6;
                    sArr10 = sArr1422222222;
                case -451870869:
                case 870185769:
                    f25852 = new String[]{C4159.m12578(sArr10, 309, 25, i34), str10, str11};
                    return;
                case -364915320:
                case 73465610:
                    i = i38;
                    String str15 = str12;
                    String str16 = str9;
                    i2 = i32;
                    f25853 = new String[]{C1916.m6311(sArr7, i, i33, i34), str15, str16};
                    sArr9 = f25855;
                    i36 = 56;
                    if (C0237.m1481() >= 0) {
                        str3 = str16;
                        str12 = str15;
                        sArr5 = sArr9;
                        sArr = sArr10;
                        i9 = IShizukuService.Stub.TRANSACTION_isHidden;
                        str6 = str8;
                        strArr2 = strArr3;
                        int m69815222 = C2105.m6981("֨ܽ") ^ i25;
                        i15 = -941267137;
                        i16 = i9;
                        m69812 = m69815222;
                        i14 = ((m69815222 ^ i24) * (-12915)) ^ 1355326554;
                        int i422222 = m69812 ^ i15;
                        i26 = i14;
                        i10 = i422222;
                        i32 = i2;
                        short[] sArr132222 = sArr5;
                        i37 = i16;
                        strArr3 = strArr2;
                        sArr9 = sArr132222;
                        str9 = str3;
                        i38 = i;
                        short[] sArr14222222222 = sArr;
                        i27 = i10;
                        str8 = str6;
                        sArr10 = sArr14222222222;
                    } else {
                        int m69819 = (i25 - C2105.m6981("ܺ᩺")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        int i47 = ((m69819 ^ i24) * 4969) ^ (-383022210);
                        i27 = m69819 ^ (-1817498595);
                        i37 = IShizukuService.Stub.TRANSACTION_isHidden;
                        str12 = str15;
                        i26 = i47;
                        i32 = i2;
                        str9 = str16;
                        i38 = i;
                    }
                case 197740857:
                case 1048282521:
                    strArr3 = new String[]{C7106.m19110(f25855, 198, 33, i34), str8, C22628.m50602(sArr8, i35, i28, i34)};
                    if (C21923.f70183 != 0) {
                        sArr = sArr10;
                        i = i38;
                        str = str12;
                        str2 = str8;
                        str3 = str9;
                        i2 = i32;
                        short[] sArr2222 = sArr9;
                        strArr = strArr3;
                        i3 = i36;
                        i4 = i37;
                        sArr2 = sArr2222;
                        m2566 = C0630.m2566("۬ۡ") ^ i24;
                        i7 = ((m2566 ^ i25) * 2673) ^ 465013443;
                        i8 = -2097094026;
                        int i402222 = m2566 ^ i8;
                        str12 = str;
                        i26 = i7;
                        str8 = str2;
                        sArr10 = sArr;
                        i27 = i402222;
                        i32 = i2;
                        str9 = str3;
                        i38 = i;
                        int i4122222 = i4;
                        i36 = i3;
                        strArr3 = strArr;
                        sArr9 = sArr2;
                        i37 = i4122222;
                    } else {
                        int m25665 = C0630.m2566("ۛܽ") ^ i24;
                        int i48 = ((m25665 ^ i25) * (-19979)) ^ (-1621315953);
                        str7 = str12;
                        short[] sArr23 = sArr10;
                        str6 = str8;
                        i10 = m25665 ^ (-1084750206);
                        i = i38;
                        str3 = str9;
                        i11 = i48;
                        sArr = sArr23;
                        short[] sArr24 = sArr9;
                        strArr2 = strArr3;
                        i12 = i36;
                        i13 = i37;
                        sArr5 = sArr24;
                        str12 = str7;
                        i26 = i11;
                        int i4322222 = i13;
                        i36 = i12;
                        strArr3 = strArr2;
                        sArr9 = sArr5;
                        i37 = i4322222;
                        str9 = str3;
                        i38 = i;
                        short[] sArr142222222222 = sArr;
                        i27 = i10;
                        str8 = str6;
                        sArr10 = sArr142222222222;
                    }
                case 581891328:
                case 1769612855:
                    C2958.m9034();
                    sArr = sArr10;
                    if (C4075.m12263() <= 0) {
                        i = i38;
                        str = str12;
                        str2 = str8;
                        str3 = str9;
                        i2 = i32;
                        short[] sArr25 = sArr9;
                        strArr = strArr3;
                        i3 = i36;
                        i4 = i37;
                        sArr2 = sArr25;
                        sArr3 = sArr;
                        m5917 = str11;
                        str11 = m5917;
                        int m2566222 = (C0630.m2566("۟۠") ^ i24) * (-59);
                        str12 = str;
                        i26 = ((m2566222 ^ i25) * (-25811)) ^ 403728060;
                        i27 = m2566222 ^ 1223007817;
                        i32 = i2;
                        str9 = str3;
                        i38 = i;
                        String str1322 = str2;
                        sArr10 = sArr3;
                        str8 = str1322;
                        int i3922 = i4;
                        i36 = i3;
                        strArr3 = strArr;
                        sArr9 = sArr2;
                        i37 = i3922;
                    } else {
                        i = i38;
                        str7 = str12;
                        str6 = str8;
                        str3 = str9;
                        short[] sArr26 = sArr9;
                        strArr2 = strArr3;
                        i12 = i36;
                        i13 = i37;
                        sArr5 = sArr26;
                        int m698162 = C2105.m6981("᩷֨") ^ i24;
                        i2 = i32;
                        i17 = ((m698162 ^ i25) * (-19829)) ^ 6347874;
                        i10 = m698162 ^ 1974690235;
                        str12 = str7;
                        i26 = i17;
                        i32 = i2;
                        int i43222222 = i13;
                        i36 = i12;
                        strArr3 = strArr2;
                        sArr9 = sArr5;
                        i37 = i43222222;
                        str9 = str3;
                        i38 = i;
                        short[] sArr1422222222222 = sArr;
                        i27 = i10;
                        str8 = str6;
                        sArr10 = sArr1422222222222;
                    }
                case 888455468:
                case 888935700:
                    f25854 = strArr3;
                    String m2575 = C0630.m2575(f25855, 231, 48, i34);
                    if (C1128.f4106 <= 0) {
                        str10 = m2575;
                        sArr = sArr10;
                        i = i38;
                        str = str12;
                        str2 = str8;
                        str3 = str9;
                        i2 = i32;
                        short[] sArr22222 = sArr9;
                        strArr = strArr3;
                        i3 = i36;
                        i4 = i37;
                        sArr2 = sArr22222;
                        m2566 = C0630.m2566("۬ۡ") ^ i24;
                        i7 = ((m2566 ^ i25) * 2673) ^ 465013443;
                        i8 = -2097094026;
                        int i4022222 = m2566 ^ i8;
                        str12 = str;
                        i26 = i7;
                        str8 = str2;
                        sArr10 = sArr;
                        i27 = i4022222;
                        i32 = i2;
                        str9 = str3;
                        i38 = i;
                        int i41222222 = i4;
                        i36 = i3;
                        strArr3 = strArr;
                        sArr9 = sArr2;
                        i37 = i41222222;
                    } else {
                        m6981 = C2105.m6981("ۢۨ") ^ i25;
                        i6 = -1483025406;
                        String str17 = str9;
                        i2 = i32;
                        i5 = ((m6981 ^ i24) * (-30641)) ^ (-2144888208);
                        str = str12;
                        sArr4 = sArr10;
                        str4 = str11;
                        str5 = m2575;
                        i = i38;
                        str3 = str17;
                        short[] sArr27 = sArr9;
                        strArr = strArr3;
                        i3 = i36;
                        i4 = i37;
                        sArr2 = sArr27;
                        i27 = m6981 ^ i6;
                        str10 = str5;
                        str11 = str4;
                        sArr10 = sArr4;
                        str12 = str;
                        i26 = i5;
                        i32 = i2;
                        str9 = str3;
                        i38 = i;
                        int i412222222 = i4;
                        i36 = i3;
                        strArr3 = strArr;
                        sArr9 = sArr2;
                        i37 = i412222222;
                    }
                case 1013737650:
                case 1422898401:
                    str9 = C4075.m12252(sArr6, i32, 30, i34);
                    sArr7 = f25855;
                    i33 = 25;
                    if (RunnableC1108.f4040) {
                        int m25666 = C0630.m2566("ۗۚ") ^ i24;
                        i26 = (-267487816) ^ ((m25666 ^ i25) * 31665);
                        i27 = (-1882919491) ^ m25666;
                        i38 = 79;
                    } else {
                        i = 79;
                        str3 = str9;
                        str = str12;
                        i2 = i32;
                        short[] sArr28 = sArr10;
                        str2 = str8;
                        sArr3 = sArr28;
                        short[] sArr29 = sArr9;
                        strArr = strArr3;
                        i3 = i36;
                        i4 = i37;
                        sArr2 = sArr29;
                        int m25662222 = (C0630.m2566("۟۠") ^ i24) * (-59);
                        str12 = str;
                        i26 = ((m25662222 ^ i25) * (-25811)) ^ 403728060;
                        i27 = m25662222 ^ 1223007817;
                        i32 = i2;
                        str9 = str3;
                        i38 = i;
                        String str13222 = str2;
                        sArr10 = sArr3;
                        str8 = str13222;
                        int i39222 = i4;
                        i36 = i3;
                        strArr3 = strArr;
                        sArr9 = sArr2;
                        i37 = i39222;
                    }
                case 1541477260:
                case 1922930474:
                    int i49 = s + 14724;
                    if ((i30 + i30) - (i49 * i49) < 0) {
                        m69813 = C2105.m6981("ۡۢ") ^ i24;
                        i23 = ((m69813 ^ i25) * 13773) ^ (-1299068411);
                        i15 = 1196492499;
                    } else {
                        m69813 = C2105.m6981("᩵ܳ") ^ i25;
                        i23 = ((m69813 ^ i24) * 32383) ^ (-326058827);
                        i15 = 1796659166;
                    }
                    String str18 = str9;
                    i2 = i32;
                    m69812 = m69813;
                    i = i38;
                    str3 = str18;
                    short[] sArr30 = sArr10;
                    str6 = str8;
                    i14 = i23;
                    sArr = sArr30;
                    short[] sArr31 = sArr9;
                    strArr2 = strArr3;
                    i16 = i37;
                    sArr5 = sArr31;
                    int i4222222 = m69812 ^ i15;
                    i26 = i14;
                    i10 = i4222222;
                    i32 = i2;
                    short[] sArr1322222 = sArr5;
                    i37 = i16;
                    strArr3 = strArr2;
                    sArr9 = sArr1322222;
                    str9 = str3;
                    i38 = i;
                    short[] sArr14222222222222 = sArr;
                    i27 = i10;
                    str8 = str6;
                    sArr10 = sArr14222222222222;
                default:
                    str2 = str8;
                    i = i38;
                    str = str12;
                    str3 = str9;
                    i2 = i32;
                    short[] sArr32 = sArr9;
                    strArr = strArr3;
                    i3 = i36;
                    i4 = i37;
                    sArr2 = sArr32;
                    m5917 = C1773.m5917(f25855, 279, 30, i34);
                    sArr3 = f25855;
                    if (C3683.m11222()) {
                        str11 = m5917;
                        int m256622222 = (C0630.m2566("۟۠") ^ i24) * (-59);
                        str12 = str;
                        i26 = ((m256622222 ^ i25) * (-25811)) ^ 403728060;
                        i27 = m256622222 ^ 1223007817;
                        i32 = i2;
                        str9 = str3;
                        i38 = i;
                        String str132222 = str2;
                        sArr10 = sArr3;
                        str8 = str132222;
                        int i392222 = i4;
                        i36 = i3;
                        strArr3 = strArr;
                        sArr9 = sArr2;
                        i37 = i392222;
                    } else {
                        m6981 = (C2105.m6981("ۡ֫") ^ i25) * q.h;
                        i5 = ((m6981 ^ i24) * (-26999)) ^ (-957427211);
                        sArr4 = sArr3;
                        str8 = str2;
                        str4 = m5917;
                        str5 = str10;
                        i6 = -2132226816;
                        i27 = m6981 ^ i6;
                        str10 = str5;
                        str11 = str4;
                        sArr10 = sArr4;
                        str12 = str;
                        i26 = i5;
                        i32 = i2;
                        str9 = str3;
                        i38 = i;
                        int i4122222222 = i4;
                        i36 = i3;
                        strArr3 = strArr;
                        sArr9 = sArr2;
                        i37 = i4122222222;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (l.RunnableC3474.f10992 > 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (l.C3746.m11369() < 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        if (l.C0798.f2919 != false) goto L16;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] m22131(android.content.Context r27) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8453.m22131(android.content.Context):java.lang.String[]");
    }

    @Override // l.InterfaceC8085
    /* renamed from: ܽ */
    public final void mo6027(InterfaceC23586 interfaceC23586) {
        this.f25863 = false;
    }

    @Override // l.AbstractC5447
    /* renamed from: ܽ */
    public final void mo15547() {
        boolean z = false;
        Runnable[] runnableArr = null;
        int i = 0;
        Runnable runnable = null;
        int i2 = 901864360;
        int i3 = RunnableC1937.f6483;
        int i4 = C3245.f10203;
        int m2566 = C0630.m2566("ܺۡ") ^ i4;
        int i5 = ((m2566 ^ i3) * (-25517)) ^ (-1564921127);
        int i6 = -1147724283;
        while (true) {
            i2 = ((((i2 ^ i3) * (-21103)) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -2059800185:
                case -1098852652:
                    if (C0630.f2410 <= 0) {
                        m2566 = C0630.m2566("ܿۚ") ^ i3;
                        i5 = ((m2566 ^ i4) * 9323) ^ 1722286151;
                        i6 = 2025413160;
                    } else {
                        m2566 = C2105.m6981("۟ۨ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-21203)) ^ (-1330267621);
                        i6 = -1960934065;
                    }
                case -1992065478:
                case 71068895:
                    this.f25862.removeCallbacks(runnable);
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        m2566 = C2105.m6981("ۚ֡") ^ i3;
                        i5 = ((m2566 ^ i4) * 29423) ^ (-84178561);
                        i6 = -1611597107;
                    } else {
                        m2566 = (C0630.m2566("ۨܺ") + i4) * (-83);
                        i5 = ((m2566 ^ i3) * (-22749)) ^ (-1180461887);
                        i6 = 1131145806;
                    }
                case -1973114631:
                case 1423947889:
                    if (C2167.m7155()) {
                        m2566 = C0630.m2566("᩷ۧ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    } else {
                        m2566 = C0630.m2566("֫ۧ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-24447)) ^ (-389087105);
                        i6 = -1942395325;
                    }
                case -1861517572:
                case -1123837963:
                    runnableArr[i] = null;
                    m2566 = (i4 - C2105.m6981("᩹۫")) * 23;
                    i5 = ((m2566 ^ i3) * (-27791)) ^ (-1977397749);
                    i6 = 2095277668;
                case -1859978279:
                case 1690345970:
                    i = 0;
                    m2566 = C0630.m2566("ۙ֨") ^ i4;
                    i5 = ((m2566 ^ i3) * 6455) ^ (-1730002903);
                    i6 = 1763798651;
                case -1859960763:
                case 1686106462:
                    i++;
                    m2566 = C0630.m2566("ۙ֨") ^ i4;
                    i5 = ((m2566 ^ i3) * 6455) ^ (-1730002903);
                    i6 = 1763798651;
                case -1712414582:
                case -675371476:
                    z = false;
                    z = false;
                    if (C3019.f9544 >= 0) {
                        m2566 = C0630.m2566("ܿۚ") ^ i3;
                        i5 = ((m2566 ^ i4) * 9323) ^ 1722286151;
                        i6 = 2025413160;
                    } else {
                        m2566 = (i4 - C2105.m6981("۬ۚ")) * 99;
                        i5 = ((m2566 ^ i3) * 1573) ^ (-144813826);
                        i6 = 175027283;
                    }
                case -1639072780:
                case 236191712:
                    C3683.m11222();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = C2105.m6981("۟ۨ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-21203)) ^ (-1330267621);
                        i6 = -1960934065;
                    } else {
                        m2566 = C0630.m2566("᩷ۧ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    }
                case -1614518822:
                case -1452865842:
                    C4616.m13552();
                    if (C3432.f10845 >= 0) {
                        m2566 = C0630.m2566("ܿۚ") ^ i3;
                        i5 = ((m2566 ^ i4) * 9323) ^ 1722286151;
                        i6 = 2025413160;
                    } else {
                        m2566 = (C0630.m2566("ᩳ۫") ^ i3) * (-121);
                        i5 = ((m2566 ^ i4) * (-31535)) ^ (-262088699);
                        i6 = -1501868961;
                    }
                case -1429726015:
                case 204663826:
                    C3537.m10746();
                    C4117.m12364();
                    m2566 = C0630.m2566("ܿۚ") ^ i3;
                    i5 = ((m2566 ^ i4) * 9323) ^ 1722286151;
                    i6 = 2025413160;
                case -1371502409:
                case -344954858:
                    if (C1916.f6442) {
                        m2566 = (C0630.m2566("ۗܽ") + i3) * (-113);
                        i5 = ((m2566 ^ i4) * 2351) ^ 552756131;
                        i6 = -20376222;
                    } else {
                        m2566 = C0630.m2566("᩷ۧ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    }
                case -1015277088:
                case 596116639:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m2566 = C0630.m2566("ܿۚ") ^ i3;
                        i5 = ((m2566 ^ i4) * 9323) ^ 1722286151;
                        i6 = 2025413160;
                    } else {
                        m2566 = C2105.m6981("ۖ᩹") ^ i3;
                        i5 = ((m2566 ^ i4) * 26623) ^ (-886229495);
                        i6 = 49968082;
                    }
                case -717404393:
                case 509361078:
                    runnable = runnableArr[i];
                    if (runnable != null) {
                        m2566 = (C0630.m2566("ᩳۙ") + i3) * 57;
                        i5 = ((m2566 ^ i4) * 30533) ^ 592959133;
                        i6 = 2018028207;
                    } else {
                        m2566 = (i4 - C2105.m6981("᩹۫")) * 23;
                        i5 = ((m2566 ^ i3) * (-27791)) ^ (-1977397749);
                        i6 = 2095277668;
                    }
                case -494059147:
                case 1638086830:
                    if (C0798.f2919) {
                        m2566 = (C0630.m2566("ᩳ۫") ^ i3) * (-121);
                        i5 = ((m2566 ^ i4) * (-31535)) ^ (-262088699);
                        i6 = -1501868961;
                    } else {
                        m2566 = C2105.m6981("᩺֫") ^ i4;
                        i5 = ((m2566 ^ i3) * 29881) ^ (-1024794234);
                        i6 = 1993449950;
                    }
                case -443156582:
                case 1420542919:
                    if (C3245.f10203 <= 0) {
                        m2566 = (C0630.m2566("ᩳ۫") ^ i3) * (-121);
                        i5 = ((m2566 ^ i4) * (-31535)) ^ (-262088699);
                        i6 = -1501868961;
                    } else {
                        m2566 = (C0630.m2566("ܺ۬") + i4) * (-103);
                        i5 = ((m2566 ^ i3) * 31077) ^ (-799607777);
                        i6 = -475227350;
                    }
                case -379952519:
                case 1224497645:
                    C3746.m11369();
                    break;
                case -367031785:
                case 1593391869:
                    if (C7811.m20844() != 0) {
                        m2566 = (C0630.m2566("ᩳ۫") ^ i3) * (-121);
                        i5 = ((m2566 ^ i4) * (-31535)) ^ (-262088699);
                        i6 = -1501868961;
                    } else {
                        m2566 = (C2105.m6981("ۙۖ") ^ i3) * (-17);
                        i5 = ((m2566 ^ i4) * (-11765)) ^ (-664071026);
                        i6 = 1544204410;
                    }
                case -293739375:
                case 2078293175:
                    if (this.f25858) {
                        m2566 = C0630.m2566("ۗ۟") ^ i4;
                        i5 = ((m2566 ^ i3) * (-28391)) ^ 961237702;
                        i6 = -552379226;
                    } else {
                        m2566 = (C2105.m6981("ۨ۟") ^ i3) * 75;
                        i5 = ((m2566 ^ i4) * 30289) ^ (-1724617381);
                        i6 = -41984288;
                    }
                case -43327962:
                case 1599595386:
                    C4925.m14310(this.f25859);
                    this.f25858 = z;
                    m2566 = (C2105.m6981("ۨ۟") ^ i3) * 75;
                    i5 = ((m2566 ^ i4) * 30289) ^ (-1724617381);
                    i6 = -41984288;
                case 212519094:
                case 333842467:
                    if (C3746.f11829 <= 0) {
                        m2566 = C0630.m2566("᩷ۧ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    } else {
                        m2566 = C0630.m2566("ۤۜ") ^ i3;
                        i5 = ((m2566 ^ i4) * 21421) ^ (-372437527);
                        i6 = -264225796;
                    }
                case 1090355039:
                case 1366537475:
                    this.f25861 = z ? 1 : 0;
                    RunnableC1937.m6383(this.f25856);
                    break;
                case 1264119804:
                case 2060686334:
                    runnableArr = this.f25860;
                    if (i < runnableArr.length) {
                        m2566 = C0630.m2566("ۙۢ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-8619)) ^ (-358939354);
                        i6 = 1009105143;
                    } else {
                        m2566 = C2105.m6981("ܿܶ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-12783)) ^ 1409193923;
                        i6 = 2141117548;
                    }
                default:
                    if (C0483.m2121()) {
                        m2566 = C0630.m2566("ۡܳ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-7117)) ^ 998111768;
                        i6 = 461876129;
                    } else {
                        m2566 = C0630.m2566("᩷ۧ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-3777)) ^ 191438141;
                        i6 = -1661291028;
                    }
            }
            return;
        }
    }

    @Override // l.InterfaceC8085
    /* renamed from: ۧ */
    public final void mo6025(InterfaceC23586 interfaceC23586) {
        Intent intent;
        int i;
        String str;
        boolean z;
        int m6981;
        int i2;
        int i3;
        int m69812;
        int i4;
        int i5;
        int m2566;
        int i6;
        int i7;
        boolean m44489;
        String m20847;
        Application m1842;
        Intent intent2;
        int m25662;
        int i8;
        Intent intent3;
        int i9 = C1128.f4106;
        int i10 = C0714.f2697;
        int m25663 = (C0630.m2566("᩶᩺") + i10) * (-73);
        int i11 = ((m25663 ^ i9) * (-3719)) ^ (-2092092192);
        String str2 = null;
        IntentFilter intentFilter = null;
        String str3 = null;
        Intent intent4 = null;
        int i12 = m25663 ^ (-609573279);
        boolean z2 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 2043437861;
        Application application = null;
        String str4 = null;
        Exception exc = null;
        boolean z3 = false;
        while (true) {
            i19 = i12 ^ (i11 & (((i19 ^ i9) * (-1585)) >> 31));
            switch (i19) {
                case -2124966206:
                case 365970285:
                    StringBuilder sb = new StringBuilder(str3);
                    C0050.m945(sb, i16);
                    throw new IllegalArgumentException(C0422.m1959(sb));
                    break;
                case -2115497480:
                case 230585365:
                    intent = intent4;
                    i = i18;
                    str = str2;
                    z = z2 ? 1 : 0;
                    if (!this.f25857) {
                        m6981 = C2105.m6981("֡ۘ") ^ i10;
                        i2 = ((m6981 ^ i9) * (-3115)) ^ 2095242219;
                        i3 = -1208167112;
                        int i20 = m6981 ^ i3;
                        str2 = str;
                        intent3 = intent;
                        i12 = i20;
                        i11 = i2;
                        z2 = z;
                        i18 = i;
                        intent4 = intent3;
                    }
                    m6981 = (i10 - C0630.m2566("ۘᩴ")) * (-93);
                    i2 = ((m6981 ^ i9) * 28851) ^ 1401443314;
                    i3 = -283874332;
                    int i202 = m6981 ^ i3;
                    str2 = str;
                    intent3 = intent;
                    i12 = i202;
                    i11 = i2;
                    z2 = z;
                    i18 = i;
                    intent4 = intent3;
                case -2099614682:
                case 1370419406:
                    intent = intent4;
                    m22128(i16, (String) null);
                    m2566 = C2105.m6981("ۡ֡") ^ i10;
                    i6 = ((m2566 ^ i9) * (-17011)) ^ (-1939869233);
                    i7 = -1389230419;
                    int i21 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i21;
                    i11 = i6;
                case -2064650532:
                case -216556951:
                    intent = intent4;
                    i = i18;
                    str = str2;
                    z = z2 ? 1 : 0;
                    i13 = 34055;
                    m6981 = C2105.m6981("ܿ۟") ^ i9;
                    i2 = ((m6981 ^ i10) * 3301) ^ 12844524;
                    i3 = -627112561;
                    int i2022 = m6981 ^ i3;
                    str2 = str;
                    intent3 = intent;
                    i12 = i2022;
                    i11 = i2;
                    z2 = z;
                    i18 = i;
                    intent4 = intent3;
                case -2051256916:
                case -229980240:
                    m22127(i16);
                    int i22 = ServiceC19288.f60689;
                    m1842 = C0382.m1842();
                    intent2 = new Intent(m1842, (Class<?>) ServiceC19288.class);
                    application = m1842;
                    intent4 = intent2;
                    m25662 = (i9 - C0630.m2566("ܿ֫")) * 27;
                    i6 = ((m25662 ^ i10) * 22445) ^ (-335105387);
                    i8 = -1336438858;
                    i12 = m25662 ^ i8;
                    i11 = i6;
                case -1973996226:
                case 2091390522:
                    intent = intent4;
                    if (i16 == i17) {
                        m2566 = C0630.m2566("᩵ۘ") ^ i10;
                        i6 = ((m2566 ^ i9) * 28171) ^ 338386067;
                        i7 = 1917092638;
                    } else {
                        m2566 = C0630.m2566("ܳ᩵") ^ i9;
                        i6 = ((m2566 ^ i10) * 15173) ^ 614385777;
                        i7 = 293332944;
                    }
                    int i212 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i212;
                    i11 = i6;
                case -1967834189:
                case 968063602:
                    intent = intent4;
                    this.f25857 = z2;
                    i = i18;
                    str = str2;
                    int i23 = ApplicationC20075.f65010.getInt(str, i) & 7;
                    this.f25861 = i23;
                    if (i23 != 0) {
                        m6981 = C0630.m2566("ۜ᩵") ^ i9;
                        z = z2 ? 1 : 0;
                        i2 = ((m6981 ^ i10) * (-14765)) ^ 943058255;
                        i3 = 1777544947;
                        int i20222 = m6981 ^ i3;
                        str2 = str;
                        intent3 = intent;
                        i12 = i20222;
                        i11 = i2;
                        z2 = z;
                        i18 = i;
                        intent4 = intent3;
                    }
                    z = z2 ? 1 : 0;
                    m6981 = (i10 - C0630.m2566("ۘᩴ")) * (-93);
                    i2 = ((m6981 ^ i9) * 28851) ^ 1401443314;
                    i3 = -283874332;
                    int i202222 = m6981 ^ i3;
                    str2 = str;
                    intent3 = intent;
                    i12 = i202222;
                    i11 = i2;
                    z2 = z;
                    i18 = i;
                    intent4 = intent3;
                case -1615117776:
                case 520463354:
                    intent = intent4;
                    C6326.m17602((AbstractActivityC3346) interfaceC23586);
                    m2566 = C2105.m6981("ܳ᩹") ^ i10;
                    i6 = ((m2566 ^ i9) * 4907) ^ 1248169404;
                    i7 = -2081318994;
                    int i2122 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i2122;
                    i11 = i6;
                case -1610604800:
                case -1099335054:
                    intent = intent4;
                    if (i16 != z2) {
                        m2566 = (C2105.m6981("᩵۬") + i10) * (-81);
                        i6 = ((m2566 ^ i9) * (-19091)) ^ 305306352;
                        i7 = -1956963146;
                    } else {
                        m2566 = (C2105.m6981("ۢܳ") + i9) * (-53);
                        i6 = ((m2566 ^ i10) * 21623) ^ 251014745;
                        i7 = 734961087;
                    }
                    int i21222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i21222;
                    i11 = i6;
                case -1567729209:
                case 2058389860:
                    m22135();
                    return;
                case -1560874759:
                case 383197451:
                    m22127(i16);
                    ServiceC7926.m21226();
                    intent = intent4;
                    m2566 = C2105.m6981("ۡ֡") ^ i10;
                    i6 = ((m2566 ^ i9) * (-17011)) ^ (-1939869233);
                    i7 = -1389230419;
                    int i212222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i212222;
                    i11 = i6;
                case -1527104279:
                case 816905001:
                    intent = intent4;
                    C4925.m14311(this.f25859, intentFilter);
                    this.f25858 = z2;
                    i16 = i18;
                    m2566 = C0630.m2566("ܳۛ") ^ i10;
                    i6 = ((m2566 ^ i9) * (-21453)) ^ (-1438389074);
                    i7 = -864562286;
                    int i2122222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i2122222;
                    i11 = i6;
                case -1359040838:
                case -1358427539:
                    try {
                        m22127(i16);
                        int i24 = ServiceC1618.f5686;
                        m1842 = C0382.m1842();
                        intent2 = new Intent(m1842, (Class<?>) ServiceC1618.class);
                        application = m1842;
                        intent4 = intent2;
                        m25662 = (i9 - C0630.m2566("ܿ֫")) * 27;
                        i6 = ((m25662 ^ i10) * 22445) ^ (-335105387);
                        i8 = -1336438858;
                        i12 = m25662 ^ i8;
                    } catch (Exception e) {
                        e = e;
                        intent = intent4;
                        exc = e;
                        m2566 = C0630.m2566("ۨᩴ") ^ i9;
                        i6 = ((m2566 ^ i10) * 23313) ^ 134936394;
                        i7 = 1456170860;
                        int i21222222 = m2566 ^ i7;
                        intent4 = intent;
                        i12 = i21222222;
                        i11 = i6;
                    }
                    i11 = i6;
                case -1322602058:
                case 614353137:
                    intent = intent4;
                    i = i18;
                    str = str2;
                    z = z2 ? 1 : 0;
                    short s = f25855[356];
                    int i25 = s + 2291;
                    int i26 = (s * s) + 5248681;
                    if ((i25 * i25) - (i26 + i26) > 0) {
                        m6981 = (C2105.m6981("᩻ܳ") ^ i10) * 73;
                        i2 = ((m6981 ^ i9) * (-8739)) ^ 2142239684;
                        i3 = 391723441;
                    } else {
                        m6981 = C0630.m2566("۫۫") ^ i9;
                        i2 = ((m6981 ^ i10) * 1741) ^ 207927444;
                        i3 = 1939400739;
                    }
                    int i2022222 = m6981 ^ i3;
                    str2 = str;
                    intent3 = intent;
                    i12 = i2022222;
                    i11 = i2;
                    z2 = z;
                    i18 = i;
                    intent4 = intent3;
                case -1059781394:
                case 2065445515:
                    intent = intent4;
                    i = i18;
                    str = str2;
                    z = z2 ? 1 : 0;
                    i13 = 43473;
                    m6981 = C2105.m6981("ܿ۟") ^ i9;
                    i2 = ((m6981 ^ i10) * 3301) ^ 12844524;
                    i3 = -627112561;
                    int i20222222 = m6981 ^ i3;
                    str2 = str;
                    intent3 = intent;
                    i12 = i20222222;
                    i11 = i2;
                    z2 = z;
                    i18 = i;
                    intent4 = intent3;
                case -1055247821:
                case -447009145:
                    intent = intent4;
                    m20847 = C0050.m947(exc);
                    str4 = m20847;
                    m2566 = C2105.m6981("ۘۚ") ^ i10;
                    i6 = ((m2566 ^ i9) * (-3525)) ^ (-1748416059);
                    i7 = -1298051938;
                    int i212222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i212222222;
                    i11 = i6;
                case -959886944:
                case 1152421260:
                    if (i16 == i17) {
                        m25662 = C0630.m2566("ۗ֡") ^ i10;
                        i6 = ((m25662 ^ i9) * (-31083)) ^ (-321583591);
                        i8 = 750334798;
                    } else {
                        m25662 = C0630.m2566("ۛܳ") ^ i9;
                        i6 = ((m25662 ^ i10) * 25637) ^ (-2140040082);
                        i8 = -1982641486;
                    }
                    i12 = m25662 ^ i8;
                    i11 = i6;
                case -954981986:
                case 458587787:
                    intent = intent4;
                    i14 = 3;
                    if (i15 < 3) {
                        m2566 = (C0630.m2566("֨ܳ") + i9) * (-47);
                        i6 = ((m2566 ^ i10) * 12583) ^ 1887792884;
                        i7 = 714407827;
                    } else {
                        m2566 = C0630.m2566("ܶۤ") ^ i9;
                        i6 = ((m2566 ^ i10) * 25837) ^ (-311959585);
                        i7 = -1400971953;
                    }
                    int i2122222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i2122222222;
                    i11 = i6;
                case -923585418:
                case 1161163088:
                    intent = intent4;
                    intentFilter.addAction(f25853[i15]);
                    intentFilter.addAction(f25854[i15]);
                    intentFilter.addAction(f25852[i15]);
                    i15++;
                    m69812 = (C0630.m2566("֨ܿ") ^ i10) * 109;
                    i4 = ((m69812 ^ i9) * (-4391)) ^ 466895471;
                    i5 = 1358452572;
                    intent3 = intent;
                    i12 = m69812 ^ i5;
                    i11 = i4;
                    intent4 = intent3;
                case -769923641:
                case -152374750:
                    intent = intent4;
                    this.f25863 = true;
                    boolean z4 = this.f25857;
                    i18 = 0;
                    String m9250 = C3019.m9250(f25855, 357, 4, i13);
                    if (z4) {
                        str2 = m9250;
                        z2 = true;
                        m2566 = C2105.m6981("ܳ᩹") ^ i10;
                        i6 = ((m2566 ^ i9) * 4907) ^ 1248169404;
                        i7 = -2081318994;
                        int i21222222222 = m2566 ^ i7;
                        intent4 = intent;
                        i12 = i21222222222;
                        i11 = i6;
                    } else {
                        int m25664 = C0630.m2566("ۡ۫") ^ i9;
                        str2 = m9250;
                        intent4 = intent;
                        i12 = m25664 ^ 1168248777;
                        i11 = ((m25664 ^ i10) * 8585) ^ 421794409;
                        z2 = true;
                    }
                case -748523347:
                case 2014050850:
                    intent = intent4;
                    if (i16 != 0) {
                        m2566 = (C0630.m2566("ۛᩳ") + i9) * (-81);
                        i6 = ((m2566 ^ i10) * 4745) ^ (-1307146476);
                        i7 = -1805975841;
                    } else {
                        m2566 = (i9 - C0630.m2566("ܽۢ")) * 31;
                        i6 = ((m2566 ^ i10) * (-29027)) ^ 1653390556;
                        i7 = -173397907;
                    }
                    int i212222222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i212222222222;
                    i11 = i6;
                case -642313313:
                case 1278967374:
                    intent = intent4;
                    if (i16 != z2) {
                        m2566 = C2105.m6981("᩷ۧ") ^ i9;
                        i6 = ((m2566 ^ i10) * (-20039)) ^ 548998961;
                        i7 = -833718984;
                    } else {
                        m2566 = (i10 - C0630.m2566("ۜᩳ")) * 29;
                        i6 = ((m2566 ^ i9) * (-31871)) ^ (-136865359);
                        i7 = -1339789036;
                    }
                    int i2122222222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i2122222222222;
                    i11 = i6;
                case -554723977:
                case 397550636:
                    intent = intent4;
                    m44489 = ServiceC1618.m5485();
                    z3 = m44489;
                    m2566 = (C0630.m2566("᩶᩻") ^ i9) * 115;
                    i6 = ((m2566 ^ i10) * 8371) ^ (-1763863159);
                    i7 = -424199264;
                    int i21222222222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i21222222222222;
                    i11 = i6;
                case -87994173:
                case 1506543382:
                    intent = intent4;
                    if ((this.f25861 & ((z2 ? 1 : 0) << i16)) != 0) {
                        m2566 = (C2105.m6981("ܳܺ") ^ i9) * 67;
                        i6 = ((m2566 ^ i10) * (-13473)) ^ (-987680723);
                        i7 = 897208432;
                        int i212222222222222 = m2566 ^ i7;
                        intent4 = intent;
                        i12 = i212222222222222;
                        i11 = i6;
                    }
                    m2566 = C2105.m6981("ۡ֡") ^ i10;
                    i6 = ((m2566 ^ i9) * (-17011)) ^ (-1939869233);
                    i7 = -1389230419;
                    int i2122222222222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i2122222222222222;
                    i11 = i6;
                case 59075118:
                case 1110978439:
                    intent = intent4;
                    if (i16 < i14) {
                        m2566 = (C0630.m2566("֨ܺ") ^ i10) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((m2566 ^ i9) * 27209) ^ (-348100000);
                        i7 = 578885843;
                        int i21222222222222222 = m2566 ^ i7;
                        intent4 = intent;
                        i12 = i21222222222222222;
                        i11 = i6;
                    } else {
                        i = i18;
                        str = str2;
                        z = z2 ? 1 : 0;
                        m6981 = (i10 - C0630.m2566("ۘᩴ")) * (-93);
                        i2 = ((m6981 ^ i9) * 28851) ^ 1401443314;
                        i3 = -283874332;
                        int i202222222 = m6981 ^ i3;
                        str2 = str;
                        intent3 = intent;
                        i12 = i202222222;
                        i11 = i2;
                        z2 = z;
                        i18 = i;
                        intent4 = intent3;
                    }
                case 214595008:
                case 846392183:
                    intent = intent4;
                    if (z3) {
                        m2566 = C0630.m2566("᩹ܿ") ^ i10;
                        i6 = ((m2566 ^ i9) * (-21287)) ^ 1080768979;
                        i7 = 211176925;
                    } else {
                        m2566 = C0630.m2566("ۤ֨") ^ i10;
                        i6 = ((m2566 ^ i9) * 25843) ^ 664245548;
                        i7 = -163300485;
                    }
                    int i212222222222222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i212222222222222222;
                    i11 = i6;
                case 264061117:
                case 513967008:
                    intent = intent4;
                    str3 = RunnableC0588.m2436(f25855, TwofishEngine.GF256_FDBK, 25, i13);
                    i17 = 2;
                    if (i16 != 0) {
                        m2566 = (i9 - C2105.m6981("֫᩶")) * (-87);
                        i6 = ((m2566 ^ i10) * (-15303)) ^ (-1955082102);
                        i7 = -1524664873;
                    } else {
                        m2566 = C0630.m2566("ۘ۫") ^ i10;
                        i6 = ((m2566 ^ i9) * 10917) ^ 839661231;
                        i7 = -1808745267;
                    }
                    int i2122222222222222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i2122222222222222222;
                    i11 = i6;
                case 436148666:
                case 1878905048:
                    intent = intent4;
                    StringBuilder sb2 = new StringBuilder(str3);
                    C0422.m1944(sb2, i16);
                    throw new IllegalArgumentException(C0050.m947(sb2));
                    break;
                case 444562883:
                case 1736495858:
                    intent = intent4;
                    m44489 = ServiceC19288.m44489();
                    z3 = m44489;
                    m2566 = (C0630.m2566("᩶᩻") ^ i9) * 115;
                    i6 = ((m2566 ^ i10) * 8371) ^ (-1763863159);
                    i7 = -424199264;
                    int i21222222222222222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i21222222222222222222;
                    i11 = i6;
                case 595445328:
                case 1178332846:
                    intent = intent4;
                    i16++;
                    m2566 = C0630.m2566("ܳۛ") ^ i10;
                    i6 = ((m2566 ^ i9) * (-21453)) ^ (-1438389074);
                    i7 = -864562286;
                    int i212222222222222222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i212222222222222222222;
                    i11 = i6;
                case 643803977:
                case 1635239458:
                    intent = intent4;
                    intentFilter = new IntentFilter();
                    i15 = 0;
                    m69812 = (C0630.m2566("֨ܿ") ^ i10) * 109;
                    i4 = ((m69812 ^ i9) * (-4391)) ^ 466895471;
                    i5 = 1358452572;
                    intent3 = intent;
                    i12 = m69812 ^ i5;
                    i11 = i4;
                    intent4 = intent3;
                case 648807051:
                case 1582272552:
                    intent = intent4;
                    if (C0964.m3403(C7811.m20847(exc))) {
                        m2566 = C2105.m6981("۠ۨ") ^ i10;
                        i6 = ((m2566 ^ i9) * 25705) ^ (-988951791);
                        i7 = 1796532370;
                    } else {
                        m2566 = (i9 - C2105.m6981("ۧᩴ")) * (-95);
                        i6 = ((m2566 ^ i10) * 7349) ^ 1709617469;
                        i7 = -1273294459;
                    }
                    int i2122222222222222222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i2122222222222222222222;
                    i11 = i6;
                case 793184802:
                case 1434650530:
                    try {
                        C0881.m3232(application, intent4);
                        intent = intent4;
                        m2566 = C2105.m6981("ۡ֡") ^ i10;
                        i6 = ((m2566 ^ i9) * (-17011)) ^ (-1939869233);
                        i7 = -1389230419;
                    } catch (Exception e2) {
                        exc = e2;
                        intent = intent4;
                        m2566 = C0630.m2566("ۨᩴ") ^ i9;
                        i6 = ((m2566 ^ i10) * 23313) ^ 134936394;
                        i7 = 1456170860;
                        int i21222222222222222222222 = m2566 ^ i7;
                        intent4 = intent;
                        i12 = i21222222222222222222222;
                        i11 = i6;
                    }
                    int i212222222222222222222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i212222222222222222222222;
                    i11 = i6;
                case 856585781:
                case 1294390315:
                    intent = intent4;
                    i = i18;
                    str = str2;
                    z = z2 ? 1 : 0;
                    if ((ApplicationC20075.f65010.getInt(str, i) & 7) != 0) {
                        m6981 = (i10 - C2105.m6981("ۧ᩺")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i2 = ((m6981 ^ i9) * 31785) ^ 1193818057;
                        i3 = 744573518;
                        int i2022222222 = m6981 ^ i3;
                        str2 = str;
                        intent3 = intent;
                        i12 = i2022222222;
                        i11 = i2;
                        z2 = z;
                        i18 = i;
                        intent4 = intent3;
                    } else {
                        str2 = str;
                        z2 = z;
                        i18 = i;
                        m2566 = C2105.m6981("ܳ᩹") ^ i10;
                        i6 = ((m2566 ^ i9) * 4907) ^ 1248169404;
                        i7 = -2081318994;
                        int i2122222222222222222222222 = m2566 ^ i7;
                        intent4 = intent;
                        i12 = i2122222222222222222222222;
                        i11 = i6;
                    }
                case 1022266753:
                case 1194382793:
                    intent = intent4;
                    m22128(i16, str4);
                    m2566 = C2105.m6981("ۡ֡") ^ i10;
                    i6 = ((m2566 ^ i9) * (-17011)) ^ (-1939869233);
                    i7 = -1389230419;
                    int i21222222222222222222222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i21222222222222222222222222;
                    i11 = i6;
                case 1395026751:
                case 1456087104:
                    intent = intent4;
                    if (interfaceC23586 instanceof AbstractActivityC3346) {
                        m69812 = C2105.m6981("ܺۙ") ^ i9;
                        i4 = ((m69812 ^ i10) * 11873) ^ 987433728;
                        i5 = -1757437145;
                        intent3 = intent;
                        i12 = m69812 ^ i5;
                        i11 = i4;
                        intent4 = intent3;
                    } else {
                        m2566 = C2105.m6981("ܳ᩹") ^ i10;
                        i6 = ((m2566 ^ i9) * 4907) ^ 1248169404;
                        i7 = -2081318994;
                        int i212222222222222222222222222 = m2566 ^ i7;
                        intent4 = intent;
                        i12 = i212222222222222222222222222;
                        i11 = i6;
                    }
                case 1444866141:
                case 1665221822:
                    intent = intent4;
                    m20847 = C7811.m20847(exc);
                    str4 = m20847;
                    m2566 = C2105.m6981("ۘۚ") ^ i10;
                    i6 = ((m2566 ^ i9) * (-3525)) ^ (-1748416059);
                    i7 = -1298051938;
                    int i2122222222222222222222222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i2122222222222222222222222222;
                    i11 = i6;
                default:
                    intent = intent4;
                    try {
                        m44489 = ServiceC7926.m21228();
                        z3 = m44489;
                        m2566 = (C0630.m2566("᩶᩻") ^ i9) * 115;
                        i6 = ((m2566 ^ i10) * 8371) ^ (-1763863159);
                        i7 = -424199264;
                    } catch (Exception e3) {
                        e = e3;
                        exc = e;
                        m2566 = C0630.m2566("ۨᩴ") ^ i9;
                        i6 = ((m2566 ^ i10) * 23313) ^ 134936394;
                        i7 = 1456170860;
                        int i21222222222222222222222222222 = m2566 ^ i7;
                        intent4 = intent;
                        i12 = i21222222222222222222222222222;
                        i11 = i6;
                    }
                    int i212222222222222222222222222222 = m2566 ^ i7;
                    intent4 = intent;
                    i12 = i212222222222222222222222222222;
                    i11 = i6;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22127(final int i) {
        int m6981;
        int i2;
        Runnable[] runnableArr = null;
        Handler handler = null;
        int i3 = 1719715062;
        int i4 = C5695.f17556;
        int i5 = C22628.f73083;
        int m69812 = (i4 - C2105.m6981("ᩴܺ")) * 89;
        int i6 = ((m69812 ^ i5) * (-17905)) ^ (-206006359);
        int i7 = -525685643;
        while (true) {
            int i8 = m69812 ^ i7;
            Runnable runnable = null;
            while (true) {
                i3 = ((((i3 ^ i5) * (-8813)) >> 31) & i6) ^ i8;
                switch (i3) {
                    case -2128264141:
                    case 233189757:
                        C3911.m11924();
                        RunnableC1937.m6387();
                        break;
                    case -1965406684:
                    case -1116140677:
                        handler.postDelayed(runnable, 30000L);
                        break;
                    case -1893994194:
                    case 1384540084:
                        if (C5695.f17556 >= 0) {
                            break;
                        }
                        m6981 = C2105.m6981("᩹᩵") ^ i5;
                        i6 = ((m6981 ^ i4) * (-13879)) ^ 2044482032;
                        i2 = -1758247471;
                        i8 = m6981 ^ i2;
                        break;
                    case -1853302610:
                    case 1908965374:
                        if (C0382.f1805) {
                            m6981 = (i4 - C2105.m6981("ܶᩴ")) * (-95);
                            i6 = ((m6981 ^ i5) * (-10273)) ^ 1293424449;
                            i2 = -943509658;
                            i8 = m6981 ^ i2;
                        }
                        m6981 = C0630.m2566("ۨۧ") ^ i4;
                        i6 = ((m6981 ^ i5) * 14651) ^ (-478121058);
                        i2 = -30578679;
                        i8 = m6981 ^ i2;
                    case -1751118180:
                    case 1825405347:
                        if (AbstractC2021.f6743 > 0) {
                            m6981 = (C2105.m6981("᩻֫") ^ i5) * (-97);
                            i6 = ((m6981 ^ i4) * 23249) ^ (-994426182);
                            i2 = 935743124;
                            i8 = m6981 ^ i2;
                        }
                        m6981 = (i4 - C0630.m2566("᩺ܳ")) * (-13);
                        i6 = ((m6981 ^ i5) * (-25127)) ^ 1366448553;
                        i2 = 313837939;
                        i8 = m6981 ^ i2;
                    case -1636332841:
                    case -445387502:
                        C21923.m49329();
                        if (AbstractC2021.m6574()) {
                            break;
                        }
                        m6981 = C0630.m2566("ۨۧ") ^ i4;
                        i6 = ((m6981 ^ i5) * 14651) ^ (-478121058);
                        i2 = -30578679;
                        i8 = m6981 ^ i2;
                        break;
                    case -1580247303:
                    case 417685273:
                        if (C7811.f24123 < 0) {
                            m6981 = C0630.m2566("ۚܶ") ^ i4;
                            i6 = ((m6981 ^ i5) * (-28143)) ^ 1019218226;
                            i2 = 1647053541;
                            i8 = m6981 ^ i2;
                        }
                        m6981 = C0630.m2566("ۨۧ") ^ i4;
                        i6 = ((m6981 ^ i5) * 14651) ^ (-478121058);
                        i2 = -30578679;
                        i8 = m6981 ^ i2;
                    case -1563227090:
                    case 576815414:
                        if (C4263.f13799 > 0) {
                            m6981 = C0630.m2566("ۢᩴ") ^ i4;
                            i6 = ((m6981 ^ i5) * (-5105)) ^ (-184847446);
                            i2 = 2092898091;
                            i8 = m6981 ^ i2;
                        }
                        m6981 = C0630.m2566("᩷᩷") ^ i5;
                        i6 = ((m6981 ^ i4) * (-19697)) ^ (-1858486487);
                        i2 = -1416117548;
                        i8 = m6981 ^ i2;
                    case -1506666888:
                    case 1059384223:
                        if (C1005.f3721) {
                            m6981 = C2105.m6981("᩺ܰ") ^ i5;
                            i6 = ((m6981 ^ i4) * (-25969)) ^ 1542484756;
                            i2 = 1912884418;
                            i8 = m6981 ^ i2;
                        }
                        m6981 = C0630.m2566("ۨۧ") ^ i4;
                        i6 = ((m6981 ^ i5) * 14651) ^ (-478121058);
                        i2 = -30578679;
                        i8 = m6981 ^ i2;
                    case -1044935037:
                    case 1321464085:
                        runnableArr[i] = runnable;
                        handler = this.f25862;
                        if (C2167.f7158 >= 0) {
                            break;
                        }
                        m6981 = (i5 - C2105.m6981("᩷ܰ")) * (-45);
                        i6 = ((m6981 ^ i4) * (-8647)) ^ (-2086341634);
                        i2 = 225641946;
                        i8 = m6981 ^ i2;
                        break;
                    case -420893111:
                    case 756150801:
                        C0798.m2998();
                        break;
                    case 58954253:
                    case 1207009549:
                        ViewOnClickListenerC1958.m6429();
                        if (!C2272.f7362) {
                            break;
                        }
                        m6981 = (i4 - C0630.m2566("᩺ܳ")) * (-13);
                        i6 = ((m6981 ^ i5) * (-25127)) ^ 1366448553;
                        i2 = 313837939;
                        i8 = m6981 ^ i2;
                        break;
                    case 271932762:
                    case 819442642:
                        if (C0798.f2919) {
                            break;
                        }
                        runnable = new Runnable(this) { // from class: l.ۚ᩸᩷

                            /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ C8453 f17403;

                            @Override // java.lang.Runnable
                            public final void run() {
                                C8453.m22129(this.f17403, i);
                            }

                            {
                                int i9 = 1602706090;
                                int i10 = C1773.f6144;
                                int i11 = ViewOnClickListenerC1958.f6529;
                                int m2566 = C0630.m2566("᩵᩵") ^ i11;
                                int i12 = ((m2566 ^ i10) * 99) ^ (-600215976);
                                int i13 = -258759854;
                                while (true) {
                                    i9 = ((((i9 ^ i10) * (-17517)) >> 31) & i12) ^ (m2566 ^ i13);
                                    switch (i9) {
                                        case -1943017940:
                                        case -1626071287:
                                            if (C0382.f1805) {
                                                m2566 = (C0630.m2566("ۢܺ") + i11) * (-57);
                                                i12 = ((m2566 ^ i10) * 19001) ^ (-1843109139);
                                                i13 = 693642996;
                                            } else {
                                                m2566 = C2105.m6981("۬᩵") ^ i10;
                                                i12 = ((m2566 ^ i11) * (-21805)) ^ 56149095;
                                                i13 = -1037905896;
                                            }
                                        case -1916875737:
                                        case -1862742577:
                                            if (C1420.f5096 <= 0) {
                                                m2566 = C2105.m6981("۬᩵") ^ i10;
                                                i12 = ((m2566 ^ i11) * (-21805)) ^ 56149095;
                                                i13 = -1037905896;
                                            } else {
                                                m2566 = (i10 - C2105.m6981("۟ۡ")) * (-61);
                                                i12 = ((m2566 ^ i11) * (-10805)) ^ 573159646;
                                                i13 = -1272736346;
                                            }
                                        case -1762043448:
                                        case -845067041:
                                            if (C0630.f2410 <= 0) {
                                                m2566 = C2105.m6981("ۙۖ") ^ i10;
                                                i12 = ((m2566 ^ i11) * (-26277)) ^ (-894164872);
                                                i13 = -474140413;
                                            } else {
                                                m2566 = (C2105.m6981("ܿܶ") ^ i10) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i12 = ((m2566 ^ i11) * (-5063)) ^ 852747689;
                                                i13 = -187765079;
                                            }
                                        case -1672823250:
                                        case 1308784636:
                                            C4075.m12263();
                                            if (C1773.f6144 <= 0) {
                                                m2566 = (C0630.m2566("ۘ᩷") + i11) * (-83);
                                                i12 = ((m2566 ^ i10) * (-30673)) ^ 1652417842;
                                                i13 = 1209553690;
                                            } else {
                                                m2566 = C2105.m6981("ۤ۬") ^ i11;
                                                i12 = ((m2566 ^ i10) * 27201) ^ (-442169887);
                                                i13 = -1540838490;
                                            }
                                        case -1531754043:
                                        case 308723998:
                                            this.f17403 = this;
                                            if (C1773.m5908() <= 0) {
                                                m2566 = C2105.m6981("۬᩵") ^ i10;
                                                i12 = ((m2566 ^ i11) * (-21805)) ^ 56149095;
                                                i13 = -1037905896;
                                            } else {
                                                m2566 = C0630.m2566("ᩳ֨") ^ i11;
                                                i12 = ((m2566 ^ i10) * (-8781)) ^ 1738249106;
                                                i13 = -1186478846;
                                            }
                                        case -1475659378:
                                        case -311994208:
                                            if (C0050.m940() <= 0) {
                                                m2566 = (C0630.m2566("ۘ᩷") + i11) * (-83);
                                                i12 = ((m2566 ^ i10) * (-30673)) ^ 1652417842;
                                                i13 = 1209553690;
                                            } else {
                                                m2566 = (i10 - C0630.m2566("ۚ֫")) * 7;
                                                i12 = ((m2566 ^ i11) * (-23601)) ^ (-1984363896);
                                                i13 = -17061751;
                                            }
                                        case -1176756278:
                                        case -715158642:
                                            if (C3537.f11231 >= 0) {
                                                m2566 = (C0630.m2566("ۘ᩷") + i11) * (-83);
                                                i12 = ((m2566 ^ i10) * (-30673)) ^ 1652417842;
                                                i13 = 1209553690;
                                            } else {
                                                m2566 = C0630.m2566("֡۬") ^ i10;
                                                i12 = ((m2566 ^ i11) * (-16959)) ^ (-355628273);
                                                i13 = -1314272364;
                                            }
                                        case -855602200:
                                        case -260120668:
                                            ViewOnClickListenerC1958.m6429();
                                            if (C0798.m2998() != 0) {
                                                m2566 = (C0630.m2566("ۘ᩷") + i11) * (-83);
                                                i12 = ((m2566 ^ i10) * (-30673)) ^ 1652417842;
                                                i13 = 1209553690;
                                            } else {
                                                m2566 = C2105.m6981("۬᩵") ^ i10;
                                                i12 = ((m2566 ^ i11) * (-21805)) ^ 56149095;
                                                i13 = -1037905896;
                                            }
                                        case -480605392:
                                        case 1765927207:
                                            if (C4263.f13799 <= 0) {
                                                m2566 = C2105.m6981("ۤ۬") ^ i11;
                                                i12 = ((m2566 ^ i10) * 27201) ^ (-442169887);
                                                i13 = -1540838490;
                                            } else {
                                                m2566 = C2105.m6981("ۗ֡") ^ i11;
                                                i12 = ((m2566 ^ i10) * (-29047)) ^ 682856107;
                                                i13 = -643976774;
                                            }
                                        case -325107481:
                                        case 91083864:
                                            C3245.m9925();
                                            m2566 = (C0630.m2566("ۘ᩷") + i11) * (-83);
                                            i12 = ((m2566 ^ i10) * (-30673)) ^ 1652417842;
                                            i13 = 1209553690;
                                        case -264489084:
                                        case 2043604142:
                                            C21923.m49329();
                                            C2520.m8026();
                                            throw new RuntimeException();
                                        case 533704376:
                                        case 1509218111:
                                            return;
                                        case 900084025:
                                        case 2076881698:
                                            if (C2105.f7037 != 0) {
                                                m2566 = (i11 - C2105.m6981("ۨܿ")) * 127;
                                                i12 = ((m2566 ^ i10) * (-29289)) ^ (-1691247128);
                                                i13 = 554309390;
                                            } else {
                                                m2566 = C2105.m6981("ܰۖ") ^ i11;
                                                i12 = ((m2566 ^ i10) * (-2223)) ^ 2061490192;
                                                i13 = 1273818921;
                                            }
                                        case 1050678013:
                                        case 1765251226:
                                            if (C4159.f13567) {
                                                m2566 = C2105.m6981("ܺ᩻") ^ i10;
                                                i12 = ((m2566 ^ i11) * (-21963)) ^ 2012158555;
                                                i13 = 454797902;
                                            } else {
                                                m2566 = C2105.m6981("۬᩵") ^ i10;
                                                i12 = ((m2566 ^ i11) * (-21805)) ^ 56149095;
                                                i13 = -1037905896;
                                            }
                                        case 1147582743:
                                        case 1787262749:
                                            if (C1420.m4913()) {
                                                m2566 = C2105.m6981("ۤ۬") ^ i11;
                                                i12 = ((m2566 ^ i10) * 27201) ^ (-442169887);
                                                i13 = -1540838490;
                                            } else {
                                                m2566 = (i11 - C2105.m6981("ܶۖ")) * (-71);
                                                i12 = ((m2566 ^ i10) * 32299) ^ (-153835660);
                                                i13 = 1017381015;
                                            }
                                        default:
                                            if (C0237.f1507 == 0) {
                                                m2566 = (C0630.m2566("ۘ᩷") + i11) * (-83);
                                                i12 = ((m2566 ^ i10) * (-30673)) ^ 1652417842;
                                                i13 = 1209553690;
                                            } else {
                                                m2566 = C2105.m6981("ۙۖ") ^ i10;
                                                i12 = ((m2566 ^ i11) * (-26277)) ^ (-894164872);
                                                i13 = -474140413;
                                            }
                                    }
                                }
                            }
                        };
                        runnableArr = this.f25860;
                        if (C3663.m11168() < 0) {
                            m6981 = C0630.m2566("ۡ֫") ^ i4;
                            i6 = ((m6981 ^ i5) * 6589) ^ 1855389936;
                            i2 = -1544287320;
                            i8 = m6981 ^ i2;
                        }
                        m6981 = C0630.m2566("᩷᩷") ^ i5;
                        i6 = ((m6981 ^ i4) * (-19697)) ^ (-1858486487);
                        i2 = -1416117548;
                        i8 = m6981 ^ i2;
                        break;
                    case 1206153687:
                    case 1989478685:
                        if (C1420.f5096 > 0) {
                            m6981 = C0630.m2566("ۗۛ") ^ i5;
                            i6 = ((m6981 ^ i4) * 9867) ^ 2046439928;
                            i2 = 87322581;
                            i8 = m6981 ^ i2;
                        }
                        m6981 = C0630.m2566("᩷᩷") ^ i5;
                        i6 = ((m6981 ^ i4) * (-19697)) ^ (-1858486487);
                        i2 = -1416117548;
                        i8 = m6981 ^ i2;
                    default:
                        C1128.m3851();
                        if (C1128.m3851() > 0) {
                            m6981 = (C2105.m6981("᩻ۖ") ^ i5) * 49;
                            i6 = ((m6981 ^ i4) * (-20081)) ^ (-1594952991);
                            i2 = 1281896405;
                            i8 = m6981 ^ i2;
                        }
                        m6981 = (i4 - C0630.m2566("᩺ܳ")) * (-13);
                        i6 = ((m6981 ^ i5) * (-25127)) ^ 1366448553;
                        i2 = 313837939;
                        i8 = m6981 ^ i2;
                }
                return;
            }
            m69812 = C0630.m2566("ۙ۫") ^ i4;
            i6 = ((m69812 ^ i5) * (-733)) ^ (-1427807716);
            i7 = 1813167958;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m22129(C8453 c8453, int i) {
        int i2;
        int m6981;
        int i3;
        int i4;
        int i5;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i6 = 0;
        int i7 = 0;
        short s3 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = -215123559;
        int i12 = C4263.f13799;
        int i13 = C3911.f12484;
        int m69812 = C2105.m6981("ۡۚ") ^ i13;
        int i14 = ((m69812 ^ i12) * (-7927)) ^ (-593413465);
        int i15 = m69812 ^ 1786701613;
        int i16 = 0;
        while (true) {
            i11 = i15 ^ (i14 & (((i11 ^ i12) * 17667) >> 31));
            switch (i11) {
                case -2106939700:
                case 1852863591:
                    i2 = i8;
                    i7 = i6 + 1;
                    if (C1047.f3863 < 0) {
                        m6981 = C2105.m6981("ۜۙ") ^ i13;
                        i3 = ((m6981 ^ i12) * 14221) ^ (-626040457);
                        i4 = -2136047224;
                        i15 = m6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    m6981 = (C0630.m2566("᩶۫") ^ i13) * (-23);
                    i3 = ((m6981 ^ i12) * 26419) ^ 51388817;
                    i4 = 503726806;
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                case -1935860447:
                case 2115057602:
                    i2 = i8;
                    if (RunnableC0588.f2309 < 0) {
                        m6981 = (C2105.m6981("ۚܶ") + i13) * 55;
                        i3 = ((m6981 ^ i12) * (-11057)) ^ (-1528168049);
                        i4 = 1589076136;
                        i15 = m6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    m6981 = C0630.m2566("ۡ֫") ^ i12;
                    i3 = ((m6981 ^ i13) * 7209) ^ 1602967252;
                    i4 = -2119384520;
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                case -1917044406:
                case -1063939670:
                    i2 = i8;
                    i10 = 3;
                    if (C0382.f1805) {
                        m6981 = (C0630.m2566("۬᩸") + i12) * 109;
                        i3 = ((m6981 ^ i13) * (-20517)) ^ (-883653775);
                        i4 = -920745293;
                        i15 = m6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    m6981 = (C0630.m2566("᩶۫") ^ i13) * (-23);
                    i3 = ((m6981 ^ i12) * 26419) ^ 51388817;
                    i4 = 503726806;
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                case -1895956600:
                case 1411546783:
                    i5 = 9985;
                    m6981 = C2105.m6981("ܶ᩹") ^ i12;
                    i2 = i5;
                    i3 = ((m6981 ^ i13) * (-20267)) ^ (-629198468);
                    i4 = 304143308;
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                case -1828512969:
                case 1128918845:
                    i2 = i8;
                    s = sArr[c];
                    s2 = 2;
                    if (!C0382.m1848()) {
                        m6981 = (i12 - C2105.m6981("۫ۨ")) * (-93);
                        i3 = ((m6981 ^ i13) * 6387) ^ (-686834122);
                        i4 = 1703001890;
                        i15 = m6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    m6981 = (C2105.m6981("ܿ֨") ^ i13) * (-115);
                    i3 = ((m6981 ^ i12) * 29729) ^ (-1363388123);
                    i4 = -1973618825;
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                case -1753979671:
                case -1621833629:
                    i2 = i8;
                    i6 = s * s2;
                    if (C0050.m940() > 0) {
                        m6981 = (i12 - C2105.m6981("ܿ᩸")) * (-35);
                        i3 = ((m6981 ^ i13) * 31505) ^ 355509485;
                        i4 = 1440879935;
                        i15 = m6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    m6981 = (C2105.m6981("ܿ֨") ^ i13) * (-115);
                    i3 = ((m6981 ^ i12) * 29729) ^ (-1363388123);
                    i4 = -1973618825;
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                case -1675151874:
                case -732750698:
                    i2 = i8;
                    c = 337;
                    if (C4159.m12565() < 0) {
                        m6981 = (C0630.m2566("ۛ᩷") ^ i13) * 23;
                        i3 = ((m6981 ^ i12) * 22901) ^ (-175077639);
                        i4 = 762583000;
                        i15 = m6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    m6981 = (C0630.m2566("ۗۖ") + i12) * (-51);
                    i3 = ((m6981 ^ i13) * (-25381)) ^ (-1717608148);
                    i4 = 1465652755;
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                case -1592748787:
                case 645662951:
                    i2 = i8;
                    sArr2 = f25855;
                    i9 = 338;
                    if (C3019.m9255() > 0) {
                        m6981 = C0630.m2566("ۢۖ") ^ i13;
                        i3 = ((m6981 ^ i12) * 9531) ^ 110909683;
                        i4 = 645294987;
                        i15 = m6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    m6981 = (C0630.m2566("ۗۖ") + i12) * (-51);
                    i3 = ((m6981 ^ i13) * (-25381)) ^ (-1717608148);
                    i4 = 1465652755;
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                case -1409121453:
                case 1436761747:
                    i2 = i8;
                    int i17 = s + s3;
                    if (i7 - (i17 * i17) > 0) {
                        m6981 = C0630.m2566("ۖ᩶") ^ i13;
                        i3 = ((m6981 ^ i12) * 12587) ^ (-92133752);
                        i4 = 1746810877;
                    } else {
                        m6981 = C2105.m6981("ۚ᩺") ^ i13;
                        i3 = ((m6981 ^ i12) * (-24789)) ^ (-1257556562);
                        i4 = -1915780734;
                    }
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                case -1242549766:
                case 1449632833:
                    C4263.m12819();
                    break;
                case -1001701969:
                case -10165727:
                    i2 = i8;
                    sArr = f25855;
                    if (C4075.f12947 < 0) {
                        m6981 = C2105.m6981("ۚ֨") ^ i12;
                        i3 = ((m6981 ^ i13) * (-3599)) ^ 1634570603;
                        i4 = -535826512;
                        i15 = m6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    m6981 = (C2105.m6981("ܿ֨") ^ i13) * (-115);
                    i3 = ((m6981 ^ i12) * 29729) ^ (-1363388123);
                    i4 = -1973618825;
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                case -970709880:
                case -501720866:
                    if (C2167.f7158 >= 0) {
                        i2 = i8;
                        m6981 = C0630.m2566("ۡ֫") ^ i12;
                        i3 = ((m6981 ^ i13) * 7209) ^ 1602967252;
                        i4 = -2119384520;
                        i15 = m6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    } else {
                        int m69813 = (C2105.m6981("᩻ۧ") + i12) * (-7);
                        i15 = m69813 ^ (-559982720);
                        i14 = ((m69813 ^ i13) * 26729) ^ 2087971690;
                    }
                case -840146469:
                case 1528609018:
                    C1128.m3851();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        int m698132 = (C2105.m6981("᩻ۧ") + i12) * (-7);
                        i15 = m698132 ^ (-559982720);
                        i14 = ((m698132 ^ i13) * 26729) ^ 2087971690;
                    } else {
                        i2 = i8;
                        m6981 = (C0630.m2566("ۗۖ") + i12) * (-51);
                        i3 = ((m6981 ^ i13) * (-25381)) ^ (-1717608148);
                        i4 = 1465652755;
                        i15 = m6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                case -621538281:
                case 1341876948:
                    C7811.m20844();
                    if (C7106.f21815 == 0) {
                        i2 = i8;
                        m6981 = (C0630.m2566("᩶۫") ^ i13) * (-23);
                        i3 = ((m6981 ^ i12) * 26419) ^ 51388817;
                        i4 = 503726806;
                        i15 = m6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    i2 = i8;
                    m6981 = C0630.m2566("ۡ֫") ^ i12;
                    i3 = ((m6981 ^ i13) * 7209) ^ 1602967252;
                    i4 = -2119384520;
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                case -157041961:
                case 1716354272:
                    i2 = i8;
                    s3 = 1;
                    if (C1005.f3721) {
                        m6981 = (i12 - C0630.m2566("ۗᩴ")) * (-23);
                        i3 = ((m6981 ^ i13) * (-12541)) ^ (-500384286);
                        i4 = 510559280;
                        i15 = m6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    m6981 = (C0630.m2566("ۗۖ") + i12) * (-51);
                    i3 = ((m6981 ^ i13) * (-25381)) ^ (-1717608148);
                    i4 = 1465652755;
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                case 4371652:
                case 1593202296:
                    c8453.m22128(i, ServiceConnectionC3453.m10562(i16 ^ 2102768133));
                    break;
                case 825830399:
                case 1608196342:
                    C22628.m50615();
                    i2 = i8;
                    m6981 = C0630.m2566("ۡ֫") ^ i12;
                    i3 = ((m6981 ^ i13) * 7209) ^ 1602967252;
                    i4 = -2119384520;
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                case 1798064503:
                case 1870745542:
                    i5 = 31089;
                    m6981 = C2105.m6981("ܶ᩹") ^ i12;
                    i2 = i5;
                    i3 = ((m6981 ^ i13) * (-20267)) ^ (-629198468);
                    i4 = 304143308;
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
                default:
                    i16 = C0630.m2566(C0964.m3396(sArr2, i9, i10, i8));
                    if (C2105.m6982() == 0) {
                        m6981 = (i13 - C0630.m2566("֨ۜ")) * (-31);
                        i2 = i8;
                        i3 = ((m6981 ^ i12) * 20783) ^ (-1254585477);
                        i4 = 181847813;
                        i15 = m6981 ^ i4;
                        i14 = i3;
                        i8 = i2;
                    }
                    i2 = i8;
                    m6981 = C0630.m2566("ۡ֫") ^ i12;
                    i3 = ((m6981 ^ i13) * 7209) ^ 1602967252;
                    i4 = -2119384520;
                    i15 = m6981 ^ i4;
                    i14 = i3;
                    i8 = i2;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m22128(int i, String str) {
        int i2;
        Runnable runnable;
        int m6981;
        int i3;
        int m69812;
        int i4;
        int i5;
        int m69813;
        int i6;
        int m2566;
        int i7;
        int i8;
        short s;
        int m25662;
        int i9;
        C8453 c8453 = this;
        String str2 = str;
        Runnable[] runnableArr = null;
        Runnable runnable2 = null;
        Handler handler = null;
        StringBuilder sb = null;
        Application application = null;
        String str3 = null;
        boolean z = false;
        int i10 = 0;
        Runnable runnable3 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 2122856791;
        int i14 = RunnableC1937.f6483;
        int i15 = C0483.f2088;
        int m69814 = (i14 - C2105.m6981("ܺܶ")) * (-29);
        int i16 = ((m69814 ^ i15) * (-18781)) ^ 1108083635;
        int i17 = m69814 ^ (-8345375);
        Runnable runnable4 = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i18 = 0;
        int i19 = 0;
        short s2 = 0;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * (-29193)) >> 31));
            switch (i13) {
                case -2110041342:
                case 530595100:
                    break;
                case -2059464121:
                case -1644310864:
                    if (C4117.m12364() != 0) {
                        runnable = runnable4;
                        m69813 = C2105.m6981("᩻ܶ") ^ i14;
                        i16 = 764412354 ^ ((m69813 ^ i15) * (-2629));
                        i6 = -987864087;
                        i17 = m69813 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable4 = runnable;
                    } else {
                        s = s2;
                        runnable = runnable4;
                        int m69815 = (C2105.m6981("ۘ۠") + i14) * (-17);
                        i16 = ((m69815 ^ i15) * (-27865)) ^ (-1025387656);
                        i17 = m69815 ^ (-20332618);
                        str2 = str;
                        s2 = s;
                        runnable4 = runnable;
                        c8453 = this;
                    }
                case -2033630485:
                case -547463453:
                    runnable = runnable4;
                    if (C3245.f10203 > 0) {
                        m69813 = (C2105.m6981("ۗۜ") + i15) * (-89);
                        i16 = 1633928107 ^ ((m69813 ^ i14) * 8523);
                        i6 = -1329668882;
                        i17 = m69813 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable4 = runnable;
                    }
                    m69813 = (i15 - C2105.m6981("ۜ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i16 = (-727031424) ^ ((m69813 ^ i14) * (-31275));
                    i6 = 1316852678;
                    i17 = m69813 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable4 = runnable;
                case -2025760556:
                case -345246497:
                    C3245.m9923(sb, str3);
                    sArr2 = f25855;
                    i18 = 335;
                    if (!C3663.f11553) {
                        m2566 = C2105.m6981("ۤ᩻") ^ i15;
                        i7 = ((m2566 ^ i14) * 20831) ^ (-1052596121);
                        i8 = -1844610010;
                        i17 = m2566 ^ i8;
                        i16 = i7;
                    }
                    m2566 = (C0630.m2566("᩷ܰ") + i15) * 43;
                    i7 = ((m2566 ^ i14) * 31933) ^ (-1756874163);
                    i8 = -1095453378;
                    i17 = m2566 ^ i8;
                    i16 = i7;
                case -1975651797:
                case 972056651:
                    if (!RunnableC1108.f4040) {
                        runnable = runnable4;
                        m69813 = C0630.m2566("۬᩺") ^ i15;
                        i16 = (-1792793280) ^ ((m69813 ^ i14) * 23537);
                        i6 = 1121872317;
                        i17 = m69813 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable4 = runnable;
                    }
                    runnable = runnable4;
                    m69813 = C2105.m6981("᩻ܶ") ^ i14;
                    i16 = 764412354 ^ ((m69813 ^ i15) * (-2629));
                    i6 = -987864087;
                    i17 = m69813 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable4 = runnable;
                case -1966806396:
                case 543749829:
                    m22135();
                    runnable = runnable4;
                    m6981 = (i15 - C0630.m2566("ۘܿ")) * 29;
                    i16 = ((m6981 ^ i14) * 857) ^ 1354101384;
                    i3 = 1497882288;
                    i17 = m6981 ^ i3;
                    str2 = str;
                    runnable4 = runnable;
                case -1876313840:
                case 470267615:
                    C4117.m12364();
                    if (C0798.m2998() != 0) {
                        i2 = i20;
                        runnable = runnable4;
                        m69812 = C2105.m6981("ۚܰ") ^ i14;
                        i20 = i2;
                        i4 = ((m69812 ^ i15) * 20971) ^ 1798147638;
                        i5 = -1575430835;
                        i17 = m69812 ^ i5;
                        i16 = i4;
                        runnable4 = runnable;
                        str2 = str;
                    } else {
                        runnable = runnable4;
                        m69813 = C2105.m6981("᩻ܶ") ^ i14;
                        i16 = 764412354 ^ ((m69813 ^ i15) * (-2629));
                        i6 = -987864087;
                        i17 = m69813 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable4 = runnable;
                    }
                case -1817842089:
                case 1294916146:
                    C3245.m9923(sb, C0483.m2128(sArr2, i18, 2, i19));
                    C1420.m4905(sb, str2);
                    if (C3432.f10845 >= 0) {
                        runnable = runnable4;
                        m69813 = C2105.m6981("᩻ܶ") ^ i14;
                        i16 = 764412354 ^ ((m69813 ^ i15) * (-2629));
                        i6 = -987864087;
                        i17 = m69813 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable4 = runnable;
                    } else {
                        m2566 = (i14 - C0630.m2566("ۧ۬")) * (-21);
                        i7 = ((m2566 ^ i15) * 27447) ^ (-1651487811);
                        i8 = -1497524615;
                        i17 = m2566 ^ i8;
                        i16 = i7;
                    }
                case -1557461811:
                case -1233602450:
                    if (c8453.f25861 == 0) {
                        m2566 = (C0630.m2566("ܺ᩷") + i15) * (-97);
                        i7 = ((m2566 ^ i14) * (-2561)) ^ 242473881;
                        i8 = -1308314494;
                        i17 = m2566 ^ i8;
                        i16 = i7;
                    } else {
                        runnable = runnable4;
                        m6981 = (i15 - C0630.m2566("ۘܿ")) * 29;
                        i16 = ((m6981 ^ i14) * 857) ^ 1354101384;
                        i3 = 1497882288;
                        i17 = m6981 ^ i3;
                        str2 = str;
                        runnable4 = runnable;
                    }
                case -1527692548:
                case -1472328414:
                    if (i10 < runnableArr.length) {
                        m2566 = C0630.m2566("ۛۘ") ^ i14;
                        i7 = ((m2566 ^ i15) * (-12385)) ^ 2044059366;
                        i8 = -579615605;
                    } else {
                        m2566 = (C0630.m2566("ܰ᩹") ^ i14) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i7 = ((m2566 ^ i15) * 10601) ^ (-214326349);
                        i8 = 1738646478;
                    }
                    i17 = m2566 ^ i8;
                    i16 = i7;
                case -1517245491:
                case -1053177086:
                    z = false;
                    i10 = 0;
                    m2566 = C0630.m2566("֫ܽ") ^ i15;
                    i7 = ((m2566 ^ i14) * (-10417)) ^ (-1881739701);
                    i8 = 1998450131;
                    i17 = m2566 ^ i8;
                    i16 = i7;
                case -1361230290:
                case 1273755039:
                    C1916.m6307(c8453.f25856, C0050.m947(sb));
                    runnable = runnable4;
                    m6981 = (C0630.m2566("۫ܳ") + i14) * (-83);
                    i16 = ((m6981 ^ i15) * (-11093)) ^ 682087936;
                    i3 = 301843239;
                    i17 = m6981 ^ i3;
                    str2 = str;
                    runnable4 = runnable;
                case -1324999400:
                case 1544311611:
                    C3911.m11924();
                    if (C0630.f2410 <= 0) {
                        runnable = runnable4;
                        m69813 = C2105.m6981("᩻ܶ") ^ i14;
                        i16 = 764412354 ^ ((m69813 ^ i15) * (-2629));
                        i6 = -987864087;
                        i17 = m69813 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable4 = runnable;
                    } else {
                        m2566 = C0630.m2566("ۙ᩶") ^ i15;
                        i7 = ((m2566 ^ i14) * (-29705)) ^ (-2140978173);
                        i8 = 1326055854;
                        i17 = m2566 ^ i8;
                        i16 = i7;
                    }
                case -1120501932:
                case -638470987:
                    sb = new StringBuilder();
                    application = C0382.m1842();
                    if (C3746.m11369() < 0) {
                        m2566 = (C0630.m2566("ܳۘ") + i14) * (-105);
                        i7 = ((m2566 ^ i15) * (-16011)) ^ 1734465188;
                        i8 = 1319620404;
                        i17 = m2566 ^ i8;
                        i16 = i7;
                    }
                    m2566 = (C0630.m2566("᩷ܰ") + i15) * 43;
                    i7 = ((m2566 ^ i14) * 31933) ^ (-1756874163);
                    i8 = -1095453378;
                    i17 = m2566 ^ i8;
                    i16 = i7;
                case -996948254:
                case 1745624080:
                    runnable4 = runnableArr[i];
                    runnable2 = null;
                    handler = c8453.f25862;
                    if (runnable4 != null) {
                        m25662 = C0630.m2566("ᩳۖ") ^ i14;
                        i16 = ((m25662 ^ i15) * (-17309)) ^ (-1743990981);
                        i9 = -1111363251;
                        i17 = m25662 ^ i9;
                        str2 = str;
                    }
                    m25662 = C0630.m2566("᩵ᩴ") ^ i15;
                    i16 = ((m25662 ^ i14) * (-19447)) ^ 1162674246;
                    i9 = -155695527;
                    i17 = m25662 ^ i9;
                    str2 = str;
                case -991262258:
                case 1068859625:
                    runnable = runnable4;
                    i19 = 6165;
                    m69813 = (i14 - C0630.m2566("ۘᩴ")) * 81;
                    i16 = (-1523452247) ^ ((m69813 ^ i15) * (-569));
                    i6 = -1783959279;
                    i17 = m69813 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable4 = runnable;
                case -976306166:
                case -211821983:
                    if (C2520.m8026()) {
                        runnable = runnable4;
                        m69813 = (i15 - C2105.m6981("ۜ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i16 = (-727031424) ^ ((m69813 ^ i14) * (-31275));
                        i6 = 1316852678;
                        i17 = m69813 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable4 = runnable;
                    } else {
                        m2566 = C0630.m2566("ۙ᩶") ^ i15;
                        i7 = ((m2566 ^ i14) * (-29705)) ^ (-2140978173);
                        i8 = 1326055854;
                        i17 = m2566 ^ i8;
                        i16 = i7;
                    }
                case -918379547:
                case 697851589:
                    runnable = runnable4;
                    if (str2 != null) {
                        m69812 = (C2105.m6981("ۗ᩹") + i15) * (-37);
                        i4 = ((m69812 ^ i14) * (-12981)) ^ (-1378447218);
                        i5 = 1714662514;
                        i17 = m69812 ^ i5;
                        i16 = i4;
                        runnable4 = runnable;
                        str2 = str;
                    } else {
                        m6981 = (C0630.m2566("۫ܳ") + i14) * (-83);
                        i16 = ((m6981 ^ i15) * (-11093)) ^ 682087936;
                        i3 = 301843239;
                        i17 = m6981 ^ i3;
                        str2 = str;
                        runnable4 = runnable;
                    }
                case -870109528:
                case 1468222546:
                    runnable = runnable4;
                    runnableArr = c8453.f25860;
                    if (RunnableC1937.f6483 < 0) {
                        m6981 = (C0630.m2566("ۡۘ") ^ i15) * (-127);
                        i16 = ((m6981 ^ i14) * (-18637)) ^ 1427018152;
                        i3 = 626170884;
                        i17 = m6981 ^ i3;
                        str2 = str;
                        runnable4 = runnable;
                    }
                    m69813 = (i15 - C2105.m6981("ۜ֨")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i16 = (-727031424) ^ ((m69813 ^ i14) * (-31275));
                    i6 = 1316852678;
                    i17 = m69813 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable4 = runnable;
                case -842419999:
                case 740365476:
                    handler.removeCallbacks(runnable4);
                    runnableArr[i] = runnable2;
                    m25662 = C0630.m2566("᩵ᩴ") ^ i15;
                    i16 = ((m25662 ^ i14) * (-19447)) ^ 1162674246;
                    i9 = -155695527;
                    i17 = m25662 ^ i9;
                    str2 = str;
                case -713455604:
                case -625927579:
                    handler.removeCallbacks(runnable3);
                    runnableArr[i10] = runnable2;
                    m2566 = (i15 - C2105.m6981("᩶ۜ")) * (-109);
                    i7 = ((m2566 ^ i14) * (-29393)) ^ (-1523599493);
                    i8 = -1442479175;
                    i17 = m2566 ^ i8;
                    i16 = i7;
                case -623568887:
                case 2128984033:
                    runnable = runnable4;
                    i19 = 37826;
                    m69813 = (i14 - C0630.m2566("ۘᩴ")) * 81;
                    i16 = (-1523452247) ^ ((m69813 ^ i15) * (-569));
                    i6 = -1783959279;
                    i17 = m69813 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable4 = runnable;
                case -590077002:
                case 1240257403:
                    runnable = runnable4;
                    sArr = f25855;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m69813 = C0630.m2566("᩺ܽ") ^ i14;
                        i16 = (-939194306) ^ ((m69813 ^ i15) * (-8481));
                        i6 = -436376695;
                        i17 = m69813 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable4 = runnable;
                    }
                    m69813 = C0630.m2566("۬᩺") ^ i15;
                    i16 = (-1792793280) ^ ((m69813 ^ i14) * 23537);
                    i6 = 1121872317;
                    i17 = m69813 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable4 = runnable;
                case -281535539:
                case 1438165451:
                    runnable = runnable4;
                    s = s2;
                    int i22 = s * 27126;
                    i12 = s * s;
                    if (C4616.f14690 <= 0) {
                        i11 = i22;
                        int m698152 = (C2105.m6981("ۘ۠") + i14) * (-17);
                        i16 = ((m698152 ^ i15) * (-27865)) ^ (-1025387656);
                        i17 = m698152 ^ (-20332618);
                        str2 = str;
                        s2 = s;
                        runnable4 = runnable;
                        c8453 = this;
                    } else {
                        int m25663 = (C0630.m2566("᩺ۗ") + i14) * (-3);
                        s2 = s;
                        i17 = m25663 ^ 563890674;
                        i16 = ((m25663 ^ i15) * (-17437)) ^ (-1544733963);
                        i11 = i22;
                        runnable4 = runnable;
                        c8453 = this;
                        str2 = str;
                    }
                case -223839390:
                case 1140270860:
                    C4925.m14310(c8453.f25859);
                    c8453.f25858 = z;
                    m2566 = C0630.m2566("᩹۟") ^ i15;
                    i7 = ((m2566 ^ i14) * 13105) ^ (-1163785154);
                    i8 = 1441040129;
                    i17 = m2566 ^ i8;
                    i16 = i7;
                case 48386685:
                case 497288958:
                    if (c8453.f25858) {
                        m2566 = (C0630.m2566("ۖۖ") + i14) * q.h;
                        i7 = ((m2566 ^ i15) * (-28905)) ^ 1170540473;
                        i8 = 2136596558;
                        i17 = m2566 ^ i8;
                        i16 = i7;
                    }
                    m2566 = C0630.m2566("᩹۟") ^ i15;
                    i7 = ((m2566 ^ i14) * 13105) ^ (-1163785154);
                    i8 = 1441040129;
                    i17 = m2566 ^ i8;
                    i16 = i7;
                case 145156897:
                case 349972523:
                    i2 = i20;
                    runnable = runnable4;
                    c8453.f25861 = i21 & (~i2);
                    if (C3537.m10746() <= 0) {
                        m69812 = C2105.m6981("ۚܰ") ^ i14;
                        i20 = i2;
                        i4 = ((m69812 ^ i15) * 20971) ^ 1798147638;
                        i5 = -1575430835;
                        i17 = m69812 ^ i5;
                        i16 = i4;
                        runnable4 = runnable;
                        str2 = str;
                    } else {
                        i20 = i2;
                        m6981 = (C2105.m6981("ᩴ᩶") ^ i14) * 21;
                        i16 = ((m6981 ^ i15) * 15115) ^ (-491143357);
                        i3 = -1595359590;
                        i17 = m6981 ^ i3;
                        str2 = str;
                        runnable4 = runnable;
                    }
                case 170198406:
                case 1431374942:
                    i10++;
                    m2566 = C0630.m2566("֫ܽ") ^ i15;
                    i7 = ((m2566 ^ i14) * (-10417)) ^ (-1881739701);
                    i8 = 1998450131;
                    i17 = m2566 ^ i8;
                    i16 = i7;
                case 578009864:
                case 1948092576:
                    runnable = runnable4;
                    s2 = sArr[334];
                    if (C4616.f14690 > 0) {
                        m69813 = (i15 - C0630.m2566("۬ۨ")) * 19;
                        i16 = (-1450572037) ^ ((m69813 ^ i14) * (-21101));
                        i6 = -633971762;
                        i17 = m69813 ^ i6;
                        c8453 = this;
                        str2 = str;
                        runnable4 = runnable;
                    }
                    m69813 = C2105.m6981("᩻ܶ") ^ i14;
                    i16 = 764412354 ^ ((m69813 ^ i15) * (-2629));
                    i6 = -987864087;
                    i17 = m69813 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable4 = runnable;
                case 613796692:
                case 1809245785:
                    runnable = runnable4;
                    if ((i12 + 183954969) - i11 >= 0) {
                        m69813 = C2105.m6981("֡ۜ") ^ i15;
                        i16 = 1525881866 ^ ((m69813 ^ i14) * 6521);
                        i6 = -1580837703;
                    } else {
                        m69813 = (i14 - C0630.m2566("ܰۨ")) * 23;
                        i16 = 1923815502 ^ ((m69813 ^ i15) * (-611));
                        i6 = -544284432;
                    }
                    i17 = m69813 ^ i6;
                    c8453 = this;
                    str2 = str;
                    runnable4 = runnable;
                case 753802262:
                case 1284555004:
                    runnable3 = runnableArr[i10];
                    if (runnable3 != null) {
                        m2566 = (C0630.m2566("ܳܰ") + i15) * 109;
                        i7 = ((m2566 ^ i14) * (-13407)) ^ 1602775651;
                        i8 = -656626043;
                        i17 = m2566 ^ i8;
                        i16 = i7;
                    }
                    m2566 = (i15 - C2105.m6981("᩶ۜ")) * (-109);
                    i7 = ((m2566 ^ i14) * (-29393)) ^ (-1523599493);
                    i8 = -1442479175;
                    i17 = m2566 ^ i8;
                    i16 = i7;
                case 872141297:
                case 2087467922:
                    C22628.m50615();
                    C22628.m50615();
                    break;
                case 959572665:
                case 1721828992:
                    if (C0237.m1481() >= 0) {
                        m2566 = (C0630.m2566("֡۬") ^ i14) * (-11);
                        i7 = ((m2566 ^ i15) * (-19537)) ^ 1690650506;
                        i8 = 822582558;
                        i17 = m2566 ^ i8;
                        i16 = i7;
                    }
                    m2566 = C0630.m2566("ۙ᩶") ^ i15;
                    i7 = ((m2566 ^ i14) * (-29705)) ^ (-2140978173);
                    i8 = 1326055854;
                    i17 = m2566 ^ i8;
                    i16 = i7;
                case 1425965272:
                case 1497543836:
                    C1420.m4913();
                    C1504.m5179();
                    i2 = i20;
                    runnable = runnable4;
                    m69812 = C2105.m6981("ۚܰ") ^ i14;
                    i20 = i2;
                    i4 = ((m69812 ^ i15) * 20971) ^ 1798147638;
                    i5 = -1575430835;
                    i17 = m69812 ^ i5;
                    i16 = i4;
                    runnable4 = runnable;
                    str2 = str;
                case 1732897323:
                case 1737281677:
                    str3 = m22131((Context) application)[i];
                    if (C21923.f70183 != 0) {
                        i2 = i20;
                        runnable = runnable4;
                        m69812 = C2105.m6981("ۚܰ") ^ i14;
                        i20 = i2;
                        i4 = ((m69812 ^ i15) * 20971) ^ 1798147638;
                        i5 = -1575430835;
                        i17 = m69812 ^ i5;
                        i16 = i4;
                        runnable4 = runnable;
                        str2 = str;
                    } else {
                        m2566 = (C0630.m2566("ۙܺ") + i14) * 35;
                        i7 = ((m2566 ^ i15) * 30253) ^ 212400177;
                        i8 = 422474174;
                        i17 = m2566 ^ i8;
                        i16 = i7;
                    }
                default:
                    runnable = runnable4;
                    int i23 = c8453.f25861;
                    i20 = 1 << i;
                    if ((i23 & i20) == 0) {
                        i21 = i23;
                        m6981 = (i15 - C0630.m2566("ۘܿ")) * 29;
                        i16 = ((m6981 ^ i14) * 857) ^ 1354101384;
                        i3 = 1497882288;
                        i17 = m6981 ^ i3;
                        str2 = str;
                        runnable4 = runnable;
                    } else {
                        int m69816 = C2105.m6981("᩹֡") ^ i15;
                        i17 = m69816 ^ (-872659872);
                        i16 = ((m69816 ^ i14) * (-12035)) ^ 968676823;
                        i21 = i23;
                        runnable4 = runnable;
                        c8453 = this;
                        str2 = str;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0071, code lost:
    
        if (l.C4159.f13567 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (l.C22628.m50615() != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0082, code lost:
    
        if (l.C11340.f33930 >= 0) goto L71;
     */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m22135() {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8453.m22135():void");
    }
}
