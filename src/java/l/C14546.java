package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashSet;
import java.util.Random;
import moe.shizuku.server.IShizukuService;

/* compiled from: 760C */
/* renamed from: l.ܳ۬ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14546 implements InterfaceC18075 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f44557;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashSet f44558;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f44559;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f44560;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Random f44561;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f44562;

    @Override // l.InterfaceC18075
    /* renamed from: ֫ */
    public final synchronized String mo6135() {
        int i;
        StringBuilder sb;
        if (this.f44558.size() >= this.f44562) {
            m34738(this.f44557 + 1);
        }
        int m5741 = C1711.m5741(this.f44559);
        int[] iArr = this.f44560;
        int i2 = 0;
        while (true) {
            if (i2 >= 1000) {
                i = -1;
                break;
            }
            i = 0;
            for (int i3 = 0; i3 < iArr.length; i3++) {
                int nextInt = this.f44561.nextInt(m5741);
                iArr[i3] = nextInt;
                i = (i * m5741) + nextInt;
            }
            if (!C4616.m13546(this.f44558, C3245.m9931(i))) {
                break;
            }
            i2++;
        }
        if (i == -1) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.f44562) {
                    break;
                }
                if (C4616.m13546(this.f44558, C1420.m4916(i4))) {
                    i4++;
                } else {
                    int i5 = i4;
                    for (int length = iArr.length - 1; length >= 0; length--) {
                        iArr[length] = i5 % m5741;
                        i5 /= m5741;
                    }
                    i = i4;
                }
            }
        }
        if (i == -1) {
            throw new RuntimeException();
        }
        C4075.m12245(this.f44558, C3245.m9931(i));
        sb = new StringBuilder();
        for (int i6 : iArr) {
            C2105.m6979(sb, C0798.m3000(this.f44559, i6));
        }
        return C0422.m1959(sb);
    }

    public C14546(String str) {
        Random random = null;
        HashSet hashSet = null;
        int i = 1922014415;
        int i2 = C3537.f11231;
        int i3 = C4616.f14690;
        int m2566 = C0630.m2566("ۙۨ") ^ i3;
        int i4 = ((m2566 ^ i2) * 31841) ^ 2079549891;
        int i5 = 2002624832;
        while (true) {
            i = ((((i ^ i2) * 5653) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1933398811:
                case 475051161:
                    if (C3911.f12484 < 0) {
                        m2566 = (C0630.m2566("ܿۙ") ^ i3) * (-41);
                        i4 = ((m2566 ^ i2) * 15649) ^ 509262836;
                        i5 = 640482029;
                    } else {
                        m2566 = C0630.m2566("᩵᩻") ^ i2;
                        i4 = ((m2566 ^ i3) * (-28489)) ^ 1781035908;
                        i5 = 2088730659;
                    }
                case -1545132731:
                case 2129502027:
                    if (C3683.f11629 >= 0) {
                        m2566 = C0630.m2566("᩺ܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29543)) ^ 641445251;
                        i5 = -216439142;
                    } else {
                        m2566 = C0630.m2566("ۖᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * 10981) ^ (-766684808);
                        i5 = 843392462;
                    }
                case -1400993581:
                case -366003237:
                    C1711.m5736();
                    m2566 = C0630.m2566("᩺ܿ") ^ i2;
                    i4 = ((m2566 ^ i3) * (-29543)) ^ 641445251;
                    i5 = -216439142;
                case -1379548465:
                case 440324671:
                    C22628.m50615();
                    if (C0483.m2121()) {
                        m2566 = C0630.m2566("᩺ܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29543)) ^ 641445251;
                        i5 = -216439142;
                    } else {
                        m2566 = (C0630.m2566("ܿۙ") ^ i3) * (-41);
                        i4 = ((m2566 ^ i2) * 15649) ^ 509262836;
                        i5 = 640482029;
                    }
                case -1100718359:
                case 1374069935:
                    random = new Random();
                    if (C3537.f11231 >= 0) {
                        m2566 = C0630.m2566("᩵᩻") ^ i2;
                        i4 = ((m2566 ^ i3) * (-28489)) ^ 1781035908;
                        i5 = 2088730659;
                    } else {
                        m2566 = (C0630.m2566("ܺۙ") ^ i2) * (-63);
                        i4 = ((m2566 ^ i3) * 22099) ^ 11191633;
                        i5 = 1913519030;
                    }
                case -1055391916:
                case 1579986041:
                    hashSet = new HashSet();
                    if (C5695.f17556 >= 0) {
                        m2566 = (C2105.m6981("ۡ᩺") + i2) * 9;
                        i4 = ((m2566 ^ i3) * 6641) ^ 727296979;
                        i5 = -1711787343;
                    } else {
                        m2566 = C2105.m6981("ܳۨ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-14301)) ^ 2129416409;
                        i5 = 319863328;
                    }
                case -996787167:
                case 581129941:
                    ViewOnClickListenerC1958.m6429();
                    throw new RuntimeException();
                case -965611862:
                case 393500242:
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        m2566 = C0630.m2566("᩵᩻") ^ i2;
                        i4 = ((m2566 ^ i3) * (-28489)) ^ 1781035908;
                        i5 = 2088730659;
                    } else {
                        m2566 = (C0630.m2566("ܰ᩻") ^ i3) * 77;
                        i4 = ((m2566 ^ i2) * 30515) ^ (-700498685);
                        i5 = 713574442;
                    }
                case -508060838:
                case 246876025:
                    if (C3683.f11629 >= 0) {
                        m2566 = (C0630.m2566("ܰ᩻") ^ i3) * 77;
                        i4 = ((m2566 ^ i2) * 30515) ^ (-700498685);
                        i5 = 713574442;
                    } else {
                        m2566 = C0630.m2566("᩵ۤ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-10663)) ^ (-29447826);
                        i5 = 1017050760;
                    }
                case -469973030:
                case 1665836806:
                    if (C1128.f4106 <= 0) {
                        m2566 = C0630.m2566("᩵᩻") ^ i2;
                        i4 = ((m2566 ^ i3) * (-28489)) ^ 1781035908;
                        i5 = 2088730659;
                    } else {
                        m2566 = C0630.m2566("᩹ۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-19117)) ^ 1767483835;
                        i5 = -955285992;
                    }
                case 42843025:
                case 900432629:
                    this.f44558 = hashSet;
                    this.f44559 = str;
                    if (C3432.f10845 >= 0) {
                        m2566 = (C0630.m2566("ܰ᩻") ^ i3) * 77;
                        i4 = ((m2566 ^ i2) * 30515) ^ (-700498685);
                        i5 = 713574442;
                    } else {
                        m2566 = (C2105.m6981("ܳ᩻") ^ i2) * 123;
                        i4 = ((m2566 ^ i3) * 15351) ^ 1397627583;
                        i5 = -1081655295;
                    }
                case 131728637:
                case 288538339:
                    if (C4263.f13799 <= 0) {
                        m2566 = (C2105.m6981("ۡ᩺") + i2) * 9;
                        i4 = ((m2566 ^ i3) * 6641) ^ 727296979;
                        i5 = -1711787343;
                    } else {
                        m2566 = C0630.m2566("᩹֫") ^ i3;
                        i4 = ((m2566 ^ i2) * 20827) ^ (-1253005626);
                        i5 = 1481997273;
                    }
                case 301287122:
                case 2078172055:
                    m34738(1);
                    return;
                case 438702919:
                case 1799546644:
                    if (C3432.f10845 >= 0) {
                        m2566 = (C0630.m2566("ܰ᩻") ^ i3) * 77;
                        i4 = ((m2566 ^ i2) * 30515) ^ (-700498685);
                        i5 = 713574442;
                    } else {
                        m2566 = C2105.m6981("᩺֨") ^ i2;
                        i4 = ((m2566 ^ i3) * (-7471)) ^ 541690210;
                        i5 = -2126221046;
                    }
                case 536061032:
                case 1358841646:
                    if (C0237.f1507 != 0) {
                        m2566 = (C2105.m6981("ۡ᩺") + i2) * 9;
                        i4 = ((m2566 ^ i3) * 6641) ^ 727296979;
                        i5 = -1711787343;
                    } else {
                        m2566 = (C0630.m2566("ܿۧ") ^ i2) * 87;
                        i4 = ((m2566 ^ i3) * 10189) ^ (-1957149690);
                        i5 = 1562710885;
                    }
                default:
                    this.f44561 = random;
                    if (C2105.f7037 != 0) {
                        m2566 = (C2105.m6981("ۡ᩺") + i2) * 9;
                        i4 = ((m2566 ^ i3) * 6641) ^ 727296979;
                        i5 = -1711787343;
                    } else {
                        m2566 = C0630.m2566("֨ᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * 17737) ^ (-1614219301);
                        i5 = 2023209845;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34738(int i) {
        double d;
        double d2;
        int m2566;
        int i2;
        int i3;
        int i4;
        int i5;
        double d3;
        int m6981;
        int i6;
        int i7;
        int i8 = C4075.f12947;
        int i9 = C4616.f14690;
        int m25662 = (C0630.m2566("ۖۘ") ^ i8) * 51;
        int i10 = ((m25662 ^ i9) * 21301) ^ (-1098156034);
        String str = null;
        double d4 = 0.0d;
        int i11 = m25662 ^ 328347343;
        int[] iArr = null;
        int i12 = 0;
        int i13 = -1615827674;
        double d5 = 0.0d;
        double d6 = 0.0d;
        int i14 = 0;
        while (true) {
            i13 = i11 ^ (i10 & (((i13 ^ i9) * 9861) >> 31));
            switch (i13) {
                case -2131253120:
                case -121230067:
                    i12 = (int) d4;
                    if (!C1711.f5919) {
                        m6981 = C0630.m2566("ܶ۬") ^ i9;
                        d3 = d4;
                        i6 = ((m6981 ^ i8) * 13437) ^ (-759376087);
                        i7 = -1405517356;
                        double d7 = d3;
                        i11 = m6981 ^ i7;
                        i10 = i6;
                        d4 = d7;
                    }
                    d3 = d4;
                    m6981 = (i8 - C0630.m2566("ܰۛ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i6 = ((m6981 ^ i9) * (-22169)) ^ 1651348861;
                    i7 = -1376649026;
                    double d72 = d3;
                    i11 = m6981 ^ i7;
                    i10 = i6;
                    d4 = d72;
                case -2051030471:
                case 1339938804:
                    d = d6;
                    d2 = d4;
                    this.f44560 = iArr;
                    str = this.f44559;
                    if (C21923.f70183 == 0) {
                        m2566 = (C0630.m2566("᩹ۗ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i2 = ((m2566 ^ i9) * 31355) ^ (-72223971);
                        i3 = 274783680;
                        d4 = d2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        d6 = d;
                    }
                    m2566 = C0630.m2566("᩸ۨ") ^ i8;
                    i2 = ((m2566 ^ i9) * (-29005)) ^ 1680659731;
                    i3 = 1801498546;
                    d4 = d2;
                    i11 = m2566 ^ i3;
                    i10 = i2;
                    d6 = d;
                case -1997301246:
                case -664173288:
                    d = d6;
                    d2 = d4;
                    if (!C0798.f2919) {
                        m2566 = C2105.m6981("᩷ᩴ") ^ i9;
                        i2 = ((m2566 ^ i8) * (-10401)) ^ (-36386867);
                        i3 = -1770556120;
                        d4 = d2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        d6 = d;
                    }
                    m2566 = (C0630.m2566("᩷ᩳ") ^ i9) * 25;
                    i2 = ((m2566 ^ i8) * 12395) ^ (-919030910);
                    i3 = 1174989968;
                    d4 = d2;
                    i11 = m2566 ^ i3;
                    i10 = i2;
                    d6 = d;
                case -1971144350:
                case -1277100803:
                    this.f44562 = i12;
                    this.f44558.clear();
                    break;
                case -1968776784:
                case 315730663:
                    d = d6;
                    d2 = d4;
                    iArr = new int[i];
                    if (C4159.f13567) {
                        m2566 = C2105.m6981("۫᩶") ^ i9;
                        i2 = ((m2566 ^ i8) * 20301) ^ 122498266;
                        i3 = -1559958510;
                        d4 = d2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        d6 = d;
                    }
                    m2566 = (C2105.m6981("᩸ۡ") + i9) * (-111);
                    i2 = ((m2566 ^ i8) * 601) ^ 104328587;
                    i3 = 1900483004;
                    d4 = d2;
                    i11 = m2566 ^ i3;
                    i10 = i2;
                    d6 = d;
                case -1911620052:
                case 280323938:
                    C4159.m12565();
                    if (C1047.f3863 >= 0) {
                        d = d6;
                        d2 = d4;
                        m2566 = C0630.m2566("᩸ۨ") ^ i8;
                        i2 = ((m2566 ^ i9) * (-29005)) ^ 1680659731;
                        i3 = 1801498546;
                        d4 = d2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        d6 = d;
                    }
                    d = d6;
                    d2 = d4;
                    m2566 = (C2105.m6981("᩸ۡ") + i9) * (-111);
                    i2 = ((m2566 ^ i8) * 601) ^ 104328587;
                    i3 = 1900483004;
                    d4 = d2;
                    i11 = m2566 ^ i3;
                    i10 = i2;
                    d6 = d;
                case -1889063163:
                case -546512389:
                    C5695.m16023();
                    C3683.m11222();
                    d = d6;
                    d2 = d4;
                    m2566 = (C2105.m6981("᩸ۡ") + i9) * (-111);
                    i2 = ((m2566 ^ i8) * 601) ^ 104328587;
                    i3 = 1900483004;
                    d4 = d2;
                    i11 = m2566 ^ i3;
                    i10 = i2;
                    d6 = d;
                case -1853956018:
                case -951752169:
                    d4 = Math.pow(d6, d5);
                    if (C3432.f10845 >= 0) {
                        d = d6;
                        i5 = C2105.m6981("ܽۨ") ^ i9;
                        i2 = ((i5 ^ i8) * (-28945)) ^ 909055345;
                        i4 = -179616471;
                        i11 = i5 ^ i4;
                        i10 = i2;
                        d6 = d;
                    } else {
                        i5 = (i8 - C0630.m2566("ۜۚ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        d = d6;
                        i2 = ((i5 ^ i9) * (-6355)) ^ 528887607;
                        i4 = -775061598;
                        i11 = i5 ^ i4;
                        i10 = i2;
                        d6 = d;
                    }
                case -1802516818:
                case -739214174:
                    if (C2105.f7037 == 0) {
                        d = d6;
                        d2 = d4;
                        m2566 = (C0630.m2566("᩷ᩳ") ^ i9) * 25;
                        i2 = ((m2566 ^ i8) * 12395) ^ (-919030910);
                        i3 = 1174989968;
                        d4 = d2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        d6 = d;
                    }
                    d = d6;
                    d2 = d4;
                    m2566 = (C2105.m6981("᩸ۡ") + i9) * (-111);
                    i2 = ((m2566 ^ i8) * 601) ^ 104328587;
                    i3 = 1900483004;
                    d4 = d2;
                    i11 = m2566 ^ i3;
                    i10 = i2;
                    d6 = d;
                case -891057927:
                case -20093562:
                    d = d6;
                    d2 = d4;
                    i14 = C0798.m3007(str);
                    if (C1005.f3721) {
                        m2566 = C0630.m2566("ᩴۙ") ^ i8;
                        i2 = ((m2566 ^ i9) * 14169) ^ 944502360;
                        i3 = 2068256509;
                        d4 = d2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        d6 = d;
                    }
                    d4 = d2;
                    i5 = C2105.m6981("ܽۨ") ^ i9;
                    i2 = ((i5 ^ i8) * (-28945)) ^ 909055345;
                    i4 = -179616471;
                    i11 = i5 ^ i4;
                    i10 = i2;
                    d6 = d;
                case -598602663:
                case 970676449:
                    d = d6;
                    d2 = d4;
                    if (C0798.m2998() == 0) {
                        m2566 = C0630.m2566("ۧۡ") ^ i9;
                        i2 = ((m2566 ^ i8) * (-1255)) ^ 1756540625;
                        i3 = -660293761;
                        d4 = d2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        d6 = d;
                    }
                    d4 = d2;
                    i5 = C2105.m6981("ܽۨ") ^ i9;
                    i2 = ((i5 ^ i8) * (-28945)) ^ 909055345;
                    i4 = -179616471;
                    i11 = i5 ^ i4;
                    i10 = i2;
                    d6 = d;
                case -482835174:
                case 1100596401:
                    if (C0422.m1963()) {
                        d = d6;
                        d2 = d4;
                        m2566 = (C2105.m6981("᩸ۡ") + i9) * (-111);
                        i2 = ((m2566 ^ i8) * 601) ^ 104328587;
                        i3 = 1900483004;
                        d4 = d2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        d6 = d;
                    } else {
                        d3 = d4;
                        m6981 = (i8 - C0630.m2566("ܰۛ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i6 = ((m6981 ^ i9) * (-22169)) ^ 1651348861;
                        i7 = -1376649026;
                        double d722 = d3;
                        i11 = m6981 ^ i7;
                        i10 = i6;
                        d4 = d722;
                    }
                case -216056384:
                case 206378093:
                    d3 = d4;
                    d6 = i14;
                    d5 = i;
                    if (C3537.f11231 < 0) {
                        m6981 = C2105.m6981("۟֨") ^ i9;
                        i6 = ((m6981 ^ i8) * (-14069)) ^ 147615170;
                        i7 = -1211767769;
                        double d7222 = d3;
                        i11 = m6981 ^ i7;
                        i10 = i6;
                        d4 = d7222;
                    }
                    m6981 = (i8 - C0630.m2566("ܰۛ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i6 = ((m6981 ^ i9) * (-22169)) ^ 1651348861;
                    i7 = -1376649026;
                    double d72222 = d3;
                    i11 = m6981 ^ i7;
                    i10 = i6;
                    d4 = d72222;
                case -31476379:
                case 634533958:
                    d = d6;
                    d2 = d4;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m2566 = C0630.m2566("ܺۘ") ^ i8;
                        i2 = ((m2566 ^ i9) * 24851) ^ (-1158872920);
                        i3 = 11037956;
                        d4 = d2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        d6 = d;
                    }
                    d4 = d2;
                    i5 = C2105.m6981("ܽۨ") ^ i9;
                    i2 = ((i5 ^ i8) * (-28945)) ^ 909055345;
                    i4 = -179616471;
                    i11 = i5 ^ i4;
                    i10 = i2;
                    d6 = d;
                case 1113897349:
                case 1514091831:
                    C11340.m28031();
                    C22628.m50615();
                    break;
                default:
                    d = d6;
                    d2 = d4;
                    this.f44557 = i;
                    if (C4263.f13799 > 0) {
                        m2566 = C2105.m6981("᩵֨") ^ i8;
                        i2 = ((m2566 ^ i9) * (-20651)) ^ 1760412976;
                        i3 = 50262459;
                        d4 = d2;
                        i11 = m2566 ^ i3;
                        i10 = i2;
                        d6 = d;
                    }
                    m2566 = C0630.m2566("᩸ۨ") ^ i8;
                    i2 = ((m2566 ^ i9) * (-29005)) ^ 1680659731;
                    i3 = 1801498546;
                    d4 = d2;
                    i11 = m2566 ^ i3;
                    i10 = i2;
                    d6 = d;
            }
            return;
        }
    }
}
