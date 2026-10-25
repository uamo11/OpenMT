package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* compiled from: 05ZQ */
/* renamed from: l.᩵ܺܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C19568 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63245 = 0;

    /* renamed from: ۛۜۜ, reason: not valid java name and contains not printable characters */
    private static final short[] f63246;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String f63247;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashSet f63248;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f63249;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f63250;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f63251;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f63252;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String f63253;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static native void m45012(C16560 c16560, InterfaceC17889 interfaceC17889);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static native void m45014(C16560 c16560, AbstractC15440 abstractC15440);

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static native void m45016(C16560 c16560, AbstractC15440 abstractC15440);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44999(Intent intent, Class cls, AbstractC16891 abstractC16891) {
        int m2566;
        int i;
        int i2;
        int m25662;
        int i3;
        Intent intent2 = intent;
        String str = null;
        String str2 = null;
        String str3 = null;
        short[] sArr = null;
        short s = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr2 = null;
        int i6 = 0;
        int i7 = 573476146;
        int i8 = C3911.f12484;
        int i9 = C1128.f4106;
        int m25663 = (C0630.m2566("ܺ᩸") + i9) * (-27);
        int i10 = ((m25663 ^ i8) * (-32127)) ^ 1766092754;
        int i11 = m25663 ^ (-624998699);
        boolean z = false;
        while (true) {
            i7 = i11 ^ (i10 & (((i7 ^ i8) * 12375) >> 31));
            switch (i7) {
                case -2115917713:
                case 707737739:
                    str3 = C9523.m24406(((C5168) abstractC16891).m14826());
                    if (str3 != null) {
                        m2566 = C0630.m2566("ۙۗ") ^ i8;
                        i = ((m2566 ^ i9) * (-27031)) ^ (-910037994);
                        i2 = 754111898;
                        int i12 = i;
                        i11 = m2566 ^ i2;
                        i10 = i12;
                    } else {
                        m25662 = C2105.m6981("᩸᩹") ^ i8;
                        i10 = ((m25662 ^ i9) * 28819) ^ 318466615;
                        i3 = -1030065478;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
                case -1928582473:
                case 1241253351:
                    C1916.m6308();
                    C2958.m9034();
                    break;
                case -1778522287:
                case -1057481898:
                    str2 = C9523.m24406(((C10738) abstractC16891).m26937());
                    if (str2 != null) {
                        m2566 = (C2105.m6981("ۜۗ") + i9) * 115;
                        i = ((m2566 ^ i8) * (-2877)) ^ 1664514616;
                        i2 = -1704715920;
                        int i122 = i;
                        i11 = m2566 ^ i2;
                        i10 = i122;
                    } else {
                        m25662 = C2105.m6981("᩸᩹") ^ i8;
                        i10 = ((m25662 ^ i9) * 28819) ^ 318466615;
                        i3 = -1030065478;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
                case -1678490113:
                case 621481046:
                    s = sArr[170];
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m25662 = (C2105.m6981("᩻ۘ") ^ i8) * (-89);
                        i10 = ((m25662 ^ i9) * 41) ^ 586501485;
                        i3 = 341817998;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
                    m25662 = (C2105.m6981("ᩳܺ") + i9) * (-95);
                    i10 = ((m25662 ^ i8) * (-26391)) ^ (-2059337150);
                    i3 = 960387937;
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                case -1471542762:
                case 1642667179:
                    i4 = (s * s) + 119661721;
                    if (C2167.f7158 < 0) {
                        m25662 = C2105.m6981("ܿۘ") ^ i8;
                        i10 = ((m25662 ^ i9) * 16559) ^ 1084310177;
                        i3 = 635374976;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
                    m25662 = C2105.m6981("ܿۗ") ^ i8;
                    i10 = ((m25662 ^ i9) * 28077) ^ (-747260923);
                    i3 = -1530725936;
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                case -1326264301:
                case -1045569721:
                    if (C3245.f10203 > 0) {
                        m25662 = (C0630.m2566("ۨۘ") ^ i8) * (-59);
                        i10 = ((m25662 ^ i9) * 30677) ^ 930132425;
                        i3 = -1108940151;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
                    m25662 = (i8 - C2105.m6981("ۚۛ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i10 = ((m25662 ^ i9) * (-12667)) ^ (-1198860699);
                    i3 = 1324565835;
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                case -1265734912:
                case -332506671:
                    i5 = 16840;
                    m25662 = (i9 - C0630.m2566("ۚ᩺")) * 75;
                    i10 = ((m25662 ^ i8) * (-4251)) ^ (-1476018083);
                    i3 = -1070062341;
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                case -1191059588:
                case -904845167:
                    C3663.m11172(intent2, str, str3);
                    m25662 = C2105.m6981("᩸᩹") ^ i8;
                    i10 = ((m25662 ^ i9) * 28819) ^ 318466615;
                    i3 = -1030065478;
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                case -1102024957:
                case -85979425:
                    if (cls == ActivityC16315.class) {
                        int m6981 = (i9 - C2105.m6981("ܽ۬")) * (-115);
                        i11 = m6981 ^ (-217694501);
                        i10 = ((m6981 ^ i8) * 10263) ^ 963970815;
                        intent2 = intent;
                    }
                    m25662 = C2105.m6981("᩸᩹") ^ i8;
                    i10 = ((m25662 ^ i9) * 28819) ^ 318466615;
                    i3 = -1030065478;
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                case -1019425556:
                case 1761887313:
                    if (i4 - (s * 21878) < 0) {
                        m25662 = (C2105.m6981("᩷ܺ") ^ i8) * 37;
                        i10 = ((m25662 ^ i9) * 10981) ^ (-611164913);
                        i3 = -353755058;
                    } else {
                        m25662 = (C2105.m6981("ۢۨ") + i9) * 119;
                        i10 = ((m25662 ^ i8) * 1677) ^ 24093872;
                        i3 = -34107979;
                    }
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                case -1018723253:
                case 2022845330:
                    if (C0964.m3413()) {
                        m25662 = (i8 - C0630.m2566("᩸ۜ")) * (-81);
                        i10 = ((m25662 ^ i9) * 22043) ^ 386808384;
                        i3 = 688397895;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
                    m25662 = (i9 - C2105.m6981("۠ܽ")) * 95;
                    i10 = ((m25662 ^ i8) * 7475) ^ 1734855627;
                    i3 = 1325650482;
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                case -1011024400:
                case -977791784:
                    sArr = f63246;
                    if (RunnableC1937.f6483 < 0) {
                        m25662 = (C2105.m6981("᩶ۗ") ^ i9) * 7;
                        i10 = ((m25662 ^ i8) * 4205) ^ (-360574421);
                        i3 = 515483145;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
                    m25662 = (i9 - C2105.m6981("۠ܽ")) * 95;
                    i10 = ((m25662 ^ i8) * 7475) ^ 1734855627;
                    i3 = 1325650482;
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                case -898057083:
                case 339251902:
                    if (abstractC16891 instanceof C5168) {
                        m2566 = (i9 - C0630.m2566("ܺ᩻")) * (-55);
                        i = ((m2566 ^ i8) * (-9105)) ^ 467418706;
                        i2 = 32972084;
                        int i1222 = i;
                        i11 = m2566 ^ i2;
                        i10 = i1222;
                    } else {
                        m25662 = C2105.m6981("᩸᩹") ^ i8;
                        i10 = ((m25662 ^ i9) * 28819) ^ 318466615;
                        i3 = -1030065478;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
                case -832175145:
                case 618159382:
                    C2126.m7040();
                    m2566 = (i9 - C2105.m6981("᩹ۤ")) * (-31);
                    i = ((m2566 ^ i8) * (-10457)) ^ (-1231874584);
                    i2 = -1315225222;
                    int i12222 = i;
                    i11 = m2566 ^ i2;
                    i10 = i12222;
                case -776735571:
                case 1897836915:
                    if (C2105.m6982() == 0) {
                        m25662 = C0630.m2566("ۖᩴ") ^ i9;
                        i10 = ((m25662 ^ i8) * 22627) ^ (-1876604675);
                        i3 = -920045871;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
                    m25662 = (C2105.m6981("ᩳܺ") + i9) * (-95);
                    i10 = ((m25662 ^ i8) * (-26391)) ^ (-2059337150);
                    i3 = 960387937;
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                case -634477640:
                case -107445195:
                    if (C7106.m19120() > 0) {
                        m25662 = (i9 - C2105.m6981("۠ܳ")) * 41;
                        i10 = ((m25662 ^ i8) * (-15167)) ^ 2042367807;
                        i3 = 783243460;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
                    m25662 = (i9 - C2105.m6981("۠ܽ")) * 95;
                    i10 = ((m25662 ^ i8) * 7475) ^ 1734855627;
                    i3 = 1325650482;
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                case -622726599:
                case 1109473469:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m2566 = (i9 - C2105.m6981("᩹ۤ")) * (-31);
                        i = ((m2566 ^ i8) * (-10457)) ^ (-1231874584);
                        i2 = -1315225222;
                        int i122222 = i;
                        i11 = m2566 ^ i2;
                        i10 = i122222;
                    } else {
                        m25662 = (i8 - C2105.m6981("ۚۛ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((m25662 ^ i9) * (-12667)) ^ (-1198860699);
                        i3 = 1324565835;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
                case -568436866:
                case 2137848145:
                    boolean z2 = abstractC16891 instanceof C10738;
                    sArr2 = f63246;
                    if (C4117.f13076 <= 0) {
                        z = z2;
                        i6 = 171;
                        m25662 = (i8 - C2105.m6981("ۚۛ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i10 = ((m25662 ^ i9) * (-12667)) ^ (-1198860699);
                        i3 = 1324565835;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    } else {
                        int m25664 = (C0630.m2566("ۜ᩺") + i8) * (-81);
                        int i13 = ((m25664 ^ i9) * 22703) ^ 1296674795;
                        i11 = m25664 ^ (-1882166561);
                        z = z2;
                        i10 = i13;
                        i6 = 171;
                    }
                case -492135987:
                case 611982254:
                    break;
                case -462702475:
                case 1238765161:
                    C1504.m5168(intent2, str, str2);
                    break;
                case -319786450:
                case 746002566:
                    if (C0964.m3413()) {
                        m25662 = (i9 - C2105.m6981("۠ܽ")) * 95;
                        i10 = ((m25662 ^ i8) * 7475) ^ 1734855627;
                        i3 = 1325650482;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
                    m25662 = C2105.m6981("ܿۗ") ^ i8;
                    i10 = ((m25662 ^ i9) * 28077) ^ (-747260923);
                    i3 = -1530725936;
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                case 137465655:
                case 1661901484:
                    i5 = 23026;
                    m25662 = (i9 - C0630.m2566("ۚ᩺")) * 75;
                    i10 = ((m25662 ^ i8) * (-4251)) ^ (-1476018083);
                    i3 = -1070062341;
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                case 998094844:
                case 1955841968:
                    if (C1711.m5736() > 0) {
                        m25662 = (i9 - C2105.m6981("᩻ۨ")) * 3;
                        i10 = ((m25662 ^ i8) * 7339) ^ 1067087460;
                        i3 = -633430527;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
                    m25662 = (i8 - C2105.m6981("ۚۛ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    i10 = ((m25662 ^ i9) * (-12667)) ^ (-1198860699);
                    i3 = 1324565835;
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                case 1381918386:
                case 2114265090:
                    str = C1916.m6311(sArr2, i6, 12, i5);
                    if (z) {
                        m2566 = C0630.m2566("ۧᩳ") ^ i8;
                        i = ((m2566 ^ i9) * (-9753)) ^ 465159088;
                        i2 = 1931358504;
                    } else {
                        m2566 = (C2105.m6981("ᩳ᩸") + i9) * 13;
                        i = ((m2566 ^ i8) * 19627) ^ 996565327;
                        i2 = -1532502836;
                    }
                    int i1222222 = i;
                    i11 = m2566 ^ i2;
                    i10 = i1222222;
                case 1940827513:
                case 1987351534:
                    if (C4159.m12565() < 0) {
                        m25662 = (C0630.m2566("ۜۘ") + i8) * (-71);
                        i10 = ((m25662 ^ i9) * (-25767)) ^ (-1996660857);
                        i3 = -2015551046;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
                    m25662 = C2105.m6981("ܿۗ") ^ i8;
                    i10 = ((m25662 ^ i9) * 28077) ^ (-747260923);
                    i3 = -1530725936;
                    i11 = m25662 ^ i3;
                    intent2 = intent;
                default:
                    if (C1128.f4106 <= 0) {
                        m2566 = (i9 - C2105.m6981("᩹ۤ")) * (-31);
                        i = ((m2566 ^ i8) * (-10457)) ^ (-1231874584);
                        i2 = -1315225222;
                        int i12222222 = i;
                        i11 = m2566 ^ i2;
                        i10 = i12222222;
                    } else {
                        m25662 = C2105.m6981("ܿۗ") ^ i8;
                        i10 = ((m25662 ^ i9) * 28077) ^ (-747260923);
                        i3 = -1530725936;
                        i11 = m25662 ^ i3;
                        intent2 = intent;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45007(C16560 c16560, InterfaceC17889 interfaceC17889, Class cls) {
        int i = 821884864;
        int i2 = C7811.f24123;
        int i3 = C4616.f14690;
        int m6981 = C2105.m6981("ۜܽ") ^ i3;
        int i4 = ((m6981 ^ i2) * 10739) ^ 158696665;
        int i5 = -1207223799;
        while (true) {
            i = ((((i ^ i2) * 6707) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1632616664:
                case 695356707:
                    if (C1294.f4556 >= 0) {
                        m6981 = (C2105.m6981("᩺۠") ^ i2) * 9;
                        i4 = ((m6981 ^ i3) * (-9407)) ^ (-1770351344);
                        i5 = 528952564;
                    } else {
                        m6981 = C0630.m2566("᩸ۛ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-3335)) ^ (-124814927);
                        i5 = 1427864613;
                    }
                case -1546420167:
                case 448580740:
                    ServiceConnectionC3453.m10564();
                    if (C0422.f1886 <= 0) {
                        m6981 = (C0630.m2566("۟ۤ") ^ i3) * 65;
                        i4 = ((m6981 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    } else {
                        m6981 = (C2105.m6981("᩺۠") ^ i2) * 9;
                        i4 = ((m6981 ^ i3) * (-9407)) ^ (-1770351344);
                        i5 = 528952564;
                    }
                case -1432861596:
                case 1578424605:
                    if (C0422.f1886 <= 0) {
                        m6981 = (C0630.m2566("۟ۤ") ^ i3) * 65;
                        i4 = ((m6981 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۛܿ")) * 123;
                        i4 = ((m6981 ^ i2) * (-28859)) ^ 144606200;
                        i5 = -1501315640;
                    }
                case -1200134669:
                case 1940101510:
                    if (C0630.f2410 <= 0) {
                        m6981 = (i3 - C2105.m6981("ۛܿ")) * 123;
                        i4 = ((m6981 ^ i2) * (-28859)) ^ 144606200;
                        i5 = -1501315640;
                    } else {
                        m6981 = (i2 - C2105.m6981("ܽۚ")) * 97;
                        i4 = ((m6981 ^ i3) * (-22349)) ^ (-2033012819);
                        i5 = -1976587787;
                    }
                case -1125319240:
                case -476676617:
                    if (RunnableC1108.f4040) {
                        m6981 = (C0630.m2566("ܿܰ") ^ i3) * 49;
                        i4 = ((m6981 ^ i2) * (-25391)) ^ 293025780;
                        i5 = 2128866727;
                    } else {
                        m6981 = C2105.m6981("ܰ᩷") ^ i3;
                        i4 = ((m6981 ^ i2) * (-18323)) ^ (-1427716227);
                        i5 = -2056738882;
                    }
                case -1114237829:
                case 1029296860:
                    if (C7811.f24123 < 0) {
                        m6981 = C0630.m2566("ܳ۠") ^ i2;
                        i4 = ((m6981 ^ i3) * 4037) ^ 481177461;
                        i5 = 1591366355;
                    } else {
                        m6981 = (C0630.m2566("۟ۤ") ^ i3) * 65;
                        i4 = ((m6981 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    }
                case -531266334:
                case -229963525:
                    RunnableC1108.m3795(c16560, interfaceC17889, new C13011(cls, c16560, interfaceC17889));
                    break;
                case -506689473:
                case 445695084:
                    if (C0630.f2410 <= 0) {
                        m6981 = (i3 - C2105.m6981("ۛܿ")) * 123;
                        i4 = ((m6981 ^ i2) * (-28859)) ^ 144606200;
                        i5 = -1501315640;
                    } else {
                        m6981 = (C0630.m2566("ۧ֨") ^ i2) * 75;
                        i4 = ((m6981 ^ i3) * 12731) ^ 362637806;
                        i5 = 779755233;
                    }
                case -423899863:
                case 2041937376:
                    if (C1504.f5354) {
                        m6981 = (C0630.m2566("۟ۤ") ^ i3) * 65;
                        i4 = ((m6981 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    } else {
                        m6981 = C0630.m2566("᩺ܳ") ^ i2;
                        i4 = ((m6981 ^ i3) * 14201) ^ (-492525513);
                        i5 = -1025470852;
                    }
                case -282431079:
                case 315715550:
                    C0237.m1481();
                    break;
                case -200207372:
                case 389415398:
                    if (C1294.f4556 >= 0) {
                        m6981 = (C0630.m2566("۟ۤ") ^ i3) * 65;
                        i4 = ((m6981 ^ i2) * (-28493)) ^ (-332768977);
                        i5 = -2007433669;
                    } else {
                        m6981 = C2105.m6981("᩵֡") ^ i3;
                        i4 = ((m6981 ^ i2) * (-24503)) ^ 783928372;
                        i5 = 1969755709;
                    }
                case 253956995:
                case 931980091:
                    if (C0714.m2805()) {
                        m6981 = (C0630.m2566("ܰۨ") + i3) * 25;
                        i4 = ((m6981 ^ i2) * (-28467)) ^ 80980805;
                        i5 = -954421319;
                    } else {
                        m6981 = C0630.m2566("ܳ۠") ^ i2;
                        i4 = ((m6981 ^ i3) * 4037) ^ 481177461;
                        i5 = 1591366355;
                    }
                case 259227649:
                case 1704965495:
                    if (C0422.f1886 <= 0) {
                        m6981 = (C2105.m6981("᩺۠") ^ i2) * 9;
                        i4 = ((m6981 ^ i3) * (-9407)) ^ (-1770351344);
                        i5 = 528952564;
                    } else {
                        m6981 = (C0630.m2566("۬۫") ^ i2) * (-65);
                        i4 = ((m6981 ^ i3) * (-12493)) ^ (-211525929);
                        i5 = 1860510832;
                    }
                case 1406202161:
                case 1809619558:
                    if (C3537.f11231 >= 0) {
                        m6981 = (i3 - C2105.m6981("ۛܿ")) * 123;
                        i4 = ((m6981 ^ i2) * (-28859)) ^ 144606200;
                        i5 = -1501315640;
                    } else {
                        m6981 = C2105.m6981("᩷ۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-5449)) ^ 1857086600;
                        i5 = -934902809;
                    }
                case 1562685534:
                case 1617461687:
                    C5695.m16023();
                    m6981 = C0630.m2566("ܳ۠") ^ i2;
                    i4 = ((m6981 ^ i3) * 4037) ^ 481177461;
                    i5 = 1591366355;
                default:
                    if (C1711.f5919) {
                        m6981 = C2105.m6981("ܰ᩷") ^ i3;
                        i4 = ((m6981 ^ i2) * (-18323)) ^ (-1427716227);
                        i5 = -2056738882;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۧۛ")) * (-13);
                        i4 = ((m6981 ^ i2) * (-1975)) ^ 1308172546;
                        i5 = -87298049;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m45018(C16560 c16560, AbstractC15440 abstractC15440) {
        int m6981;
        int i;
        int i2;
        int i3;
        int m2566;
        int i4;
        int i5;
        int m25662;
        int i6;
        int i7;
        int m25663;
        int i8;
        int m69812;
        int i9;
        C16560 c165602 = c16560;
        int i10 = C1420.f5096;
        int i11 = C1047.f3863;
        int m25664 = (C0630.m2566("ܶ֨") ^ i10) * 81;
        int i12 = ((m25664 ^ i11) * (-7815)) ^ (-599356323);
        C11971 c11971 = null;
        Throwable th = null;
        AbstractC16891 abstractC16891 = null;
        C9160 c9160 = null;
        short[] sArr = null;
        int i13 = m25664 ^ (-2066456507);
        int i14 = 0;
        int i15 = 0;
        boolean z = false;
        boolean z2 = false;
        int i16 = 0;
        short s = 0;
        int i17 = 0;
        int i18 = 0;
        short s2 = 0;
        int i19 = 405713138;
        char c = 0;
        C9340 c9340 = null;
        String str = null;
        while (true) {
            i19 = i13 ^ (i12 & (((i19 ^ i11) * 20177) >> 31));
            switch (i19) {
                case -2053735044:
                case -1263047710:
                    i3 = i17;
                    if (z) {
                        m69812 = (C0630.m2566("ۜ᩵") + i11) * 57;
                        i = ((m69812 ^ i10) * 24653) ^ 1583630124;
                        i9 = -198245144;
                        int i20 = m69812 ^ i9;
                        i17 = i3;
                        i13 = i20;
                        i12 = i;
                    }
                    m69812 = (C0630.m2566("᩵ۡ") ^ i11) * 19;
                    i = ((m69812 ^ i10) * 13521) ^ 1800325461;
                    i9 = -1160842549;
                    int i202 = m69812 ^ i9;
                    i17 = i3;
                    i13 = i202;
                    i12 = i;
                case -2003697651:
                case -614586766:
                    C2167.m7155();
                    return;
                case -1991638364:
                case 415606258:
                    try {
                        i3 = i17;
                        try {
                            c9160.mo35230(C4616.m13542(f63246, 548, 1, i16));
                            c16560.m39016().m24060(c165602, i15, true);
                            m69812 = (C2105.m6981("ܰ֨") + i10) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            i = ((m69812 ^ i11) * (-13677)) ^ 1627946867;
                            i9 = -1489132287;
                            int i2022 = m69812 ^ i9;
                            i17 = i3;
                            i13 = i2022;
                            i12 = i;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            m2566 = C2105.m6981("ۧᩳ") ^ i11;
                            i4 = ((m2566 ^ i10) * (-26967)) ^ (-1354239475);
                            i5 = 1542156125;
                            int i21 = i3;
                            i13 = m2566 ^ i5;
                            i12 = i4;
                            i17 = i21;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i3 = i17;
                    }
                case -1950256102:
                case 48823960:
                    i3 = i17;
                    C9160 c91602 = (C9160) abstractC16891;
                    try {
                        z2 = ViewOnClickListenerC1958.m6437(str, c91602.m23569());
                        int m25665 = C0630.m2566("֫ۘ") ^ i10;
                        i17 = i3;
                        i13 = m25665 ^ (-648100876);
                        i12 = ((m25665 ^ i11) * (-28693)) ^ (-1298524004);
                        c9160 = c91602;
                    } catch (Throwable th4) {
                        th = th4;
                        c9160 = c91602;
                        m2566 = C2105.m6981("ۧᩳ") ^ i11;
                        i4 = ((m2566 ^ i10) * (-26967)) ^ (-1354239475);
                        i5 = 1542156125;
                        int i212 = i3;
                        i13 = m2566 ^ i5;
                        i12 = i4;
                        i17 = i212;
                    }
                case -1906626084:
                case -1134656467:
                    i3 = i17;
                    c = 547;
                    if (!C2126.f7087) {
                        m25662 = C2105.m6981("᩸ܰ") ^ i10;
                        i6 = ((m25662 ^ i11) * (-2571)) ^ (-875033276);
                        i7 = -1281124196;
                        int i22 = m25662 ^ i7;
                        i17 = i3;
                        i13 = i22;
                        i12 = i6;
                        c165602 = c16560;
                    }
                    i17 = i3;
                    m25663 = C0630.m2566("᩶ܺ") ^ i11;
                    i6 = ((m25663 ^ i10) * 32051) ^ (-1415177955);
                    i8 = 1715433815;
                    i13 = m25663 ^ i8;
                    i12 = i6;
                    c165602 = c16560;
                case -1719382720:
                case -11350429:
                    i3 = i17;
                    AbstractC16891 abstractC168912 = (AbstractC16891) c11971.get(i15);
                    try {
                        z = abstractC168912 instanceof C9160;
                        int m25666 = (C0630.m2566("ܰۨ") + i10) * (-95);
                        i17 = i3;
                        i13 = m25666 ^ 1674850094;
                        i12 = ((m25666 ^ i11) * (-30245)) ^ 1491887033;
                        abstractC16891 = abstractC168912;
                    } catch (Throwable th5) {
                        th = th5;
                        abstractC16891 = abstractC168912;
                        m2566 = C2105.m6981("ۧᩳ") ^ i11;
                        i4 = ((m2566 ^ i10) * (-26967)) ^ (-1354239475);
                        i5 = 1542156125;
                        int i2122 = i3;
                        i13 = m2566 ^ i5;
                        i12 = i4;
                        i17 = i2122;
                    }
                case -1701531923:
                case -710747999:
                    i3 = i17;
                    if (z2) {
                        m69812 = (C2105.m6981("ܿܶ") + i11) * (-123);
                        i = ((m69812 ^ i10) * (-19947)) ^ (-1816075982);
                        i9 = 505653170;
                        int i20222 = m69812 ^ i9;
                        i17 = i3;
                        i13 = i20222;
                        i12 = i;
                    }
                    m69812 = (C0630.m2566("᩵ۡ") ^ i11) * 19;
                    i = ((m69812 ^ i10) * 13521) ^ 1800325461;
                    i9 = -1160842549;
                    int i202222 = m69812 ^ i9;
                    i17 = i3;
                    i13 = i202222;
                    i12 = i;
                case -1610121479:
                case -460533014:
                    i3 = i17;
                    if (C22628.f73083 > 0) {
                        m25662 = (C0630.m2566("ۘۘ") + i11) * (-3);
                        i6 = ((m25662 ^ i10) * (-22999)) ^ 593615666;
                        i7 = -2702041;
                        int i222 = m25662 ^ i7;
                        i17 = i3;
                        i13 = i222;
                        i12 = i6;
                        c165602 = c16560;
                    }
                    i17 = i3;
                    m25663 = C0630.m2566("᩶ܺ") ^ i11;
                    i6 = ((m25663 ^ i10) * 32051) ^ (-1415177955);
                    i8 = 1715433815;
                    i13 = m25663 ^ i8;
                    i12 = i6;
                    c165602 = c16560;
                case -1601008353:
                case -1341895538:
                    C4159.m12565();
                    if (RunnableC0588.m2441() < 0) {
                        i3 = i17;
                        m2566 = C2105.m6981("ۢܺ") ^ i11;
                        i4 = ((m2566 ^ i10) * 27287) ^ (-869196308);
                        i5 = 1445396355;
                        int i21222 = i3;
                        i13 = m2566 ^ i5;
                        i12 = i4;
                        i17 = i21222;
                    } else {
                        i3 = i17;
                        m25662 = (C0630.m2566("᩸۠") ^ i11) * (-11);
                        i6 = ((m25662 ^ i10) * (-5111)) ^ 1890569576;
                        i7 = -1771948919;
                        int i2222 = m25662 ^ i7;
                        i17 = i3;
                        i13 = i2222;
                        i12 = i6;
                        c165602 = c16560;
                    }
                case -1572062613:
                case -936908752:
                    i3 = i17;
                    c11971 = c9340.m24094();
                    c11971.m29245();
                    m2566 = C2105.m6981("ۘ֫") ^ i10;
                    i4 = ((m2566 ^ i11) * (-31159)) ^ (-1275367226);
                    i5 = -1430997210;
                    int i212222 = i3;
                    i13 = m2566 ^ i5;
                    i12 = i4;
                    i17 = i212222;
                case -1471964190:
                case 625975081:
                    i3 = i17;
                    sArr = f63246;
                    if (C7106.f21815 == 0) {
                        m25662 = (C0630.m2566("ᩴ۬") + i10) * (-23);
                        i6 = ((m25662 ^ i11) * (-25737)) ^ 1349097634;
                        i7 = 1411743041;
                        int i22222 = m25662 ^ i7;
                        i17 = i3;
                        i13 = i22222;
                        i12 = i6;
                        c165602 = c16560;
                    }
                    m25662 = (C2105.m6981("ۧ᩸") + i11) * (-63);
                    i6 = ((m25662 ^ i10) * (-12867)) ^ 1796315804;
                    i7 = -424063084;
                    int i222222 = m25662 ^ i7;
                    i17 = i3;
                    i13 = i222222;
                    i12 = i6;
                    c165602 = c16560;
                case -1444828717:
                case 1263859565:
                    i3 = i17;
                    if (AbstractC2021.f6743 > 0) {
                        m25662 = (C0630.m2566("᩻۬") + i10) * (-127);
                        i6 = ((m25662 ^ i11) * 10773) ^ (-1933486993);
                        i7 = -1202801137;
                        int i2222222 = m25662 ^ i7;
                        i17 = i3;
                        i13 = i2222222;
                        i12 = i6;
                        c165602 = c16560;
                    }
                    i17 = i3;
                    m25663 = C0630.m2566("᩶ܺ") ^ i11;
                    i6 = ((m25663 ^ i10) * 32051) ^ (-1415177955);
                    i8 = 1715433815;
                    i13 = m25663 ^ i8;
                    i12 = i6;
                    c165602 = c16560;
                case -1410926531:
                case 1829429540:
                    if (C22628.m50615() != 0) {
                        i3 = i17;
                        m2566 = C0630.m2566("ۧ᩷") ^ i10;
                        i4 = ((m2566 ^ i11) * 11175) ^ (-888300345);
                        i5 = 128956745;
                        int i2122222 = i3;
                        i13 = m2566 ^ i5;
                        i12 = i4;
                        i17 = i2122222;
                    } else {
                        i3 = i17;
                        m69812 = C2105.m6981("ۗ᩻") ^ i11;
                        i = ((m69812 ^ i10) * 19853) ^ 1613747764;
                        i9 = 1031579491;
                        int i2022222 = m69812 ^ i9;
                        i17 = i3;
                        i13 = i2022222;
                        i12 = i;
                    }
                case -1401921363:
                case 2001484993:
                    C1047.m3591(c11971);
                    return;
                case -1393166244:
                case 1079343689:
                    i3 = i17;
                    i16 = 33061;
                    m2566 = C0630.m2566("ۖ᩵") ^ i11;
                    i4 = ((m2566 ^ i10) * 25767) ^ (-1993933281);
                    i5 = 1034487084;
                    int i21222222 = i3;
                    i13 = m2566 ^ i5;
                    i12 = i4;
                    i17 = i21222222;
                case -1328419302:
                case 1221202347:
                    i3 = i17;
                    str = C4117.m12359(abstractC15440);
                    c9340 = c16560.m39016();
                    if (!C1711.f5919) {
                        m2566 = (i10 - C2105.m6981("۟۟")) * (-51);
                        i4 = ((m2566 ^ i11) * 23773) ^ 690307618;
                        i5 = -594660017;
                        int i212222222 = i3;
                        i13 = m2566 ^ i5;
                        i12 = i4;
                        i17 = i212222222;
                    }
                    m2566 = C2105.m6981("ۢܺ") ^ i11;
                    i4 = ((m2566 ^ i10) * 27287) ^ (-869196308);
                    i5 = 1445396355;
                    int i2122222222 = i3;
                    i13 = m2566 ^ i5;
                    i12 = i4;
                    i17 = i2122222222;
                case -1299125969:
                case -1137970415:
                    i3 = i17;
                    i15 = 0;
                    m2566 = (i10 - C0630.m2566("᩺᩹")) * (-93);
                    i4 = ((m2566 ^ i11) * (-2615)) ^ (-1210613867);
                    i5 = 281781147;
                    int i21222222222 = i3;
                    i13 = m2566 ^ i5;
                    i12 = i4;
                    i17 = i21222222222;
                case -1267603369:
                case 1660109423:
                    if (RunnableC0588.m2441() >= 0) {
                        i3 = i17;
                        m2566 = C2105.m6981("ۢܺ") ^ i11;
                        i4 = ((m2566 ^ i10) * 27287) ^ (-869196308);
                        i5 = 1445396355;
                        int i212222222222 = i3;
                        i13 = m2566 ^ i5;
                        i12 = i4;
                        i17 = i212222222222;
                    } else {
                        i3 = i17;
                        m25662 = (C2105.m6981("ۧ᩸") + i11) * (-63);
                        i6 = ((m25662 ^ i10) * (-12867)) ^ 1796315804;
                        i7 = -424063084;
                        int i22222222 = m25662 ^ i7;
                        i17 = i3;
                        i13 = i22222222;
                        i12 = i6;
                        c165602 = c16560;
                    }
                case -1232762180:
                case -91552689:
                    i3 = i17;
                    i16 = 63388;
                    m2566 = C0630.m2566("ۖ᩵") ^ i11;
                    i4 = ((m2566 ^ i10) * 25767) ^ (-1993933281);
                    i5 = 1034487084;
                    int i2122222222222 = i3;
                    i13 = m2566 ^ i5;
                    i12 = i4;
                    i17 = i2122222222222;
                case -1150148503:
                case -165039421:
                    i3 = i17;
                    if (!C1711.f5919) {
                        m25662 = (C0630.m2566("ۛ۟") ^ i11) * 27;
                        i6 = ((m25662 ^ i10) * (-9661)) ^ 2084208031;
                        i7 = 1113506444;
                        int i222222222 = m25662 ^ i7;
                        i17 = i3;
                        i13 = i222222222;
                        i12 = i6;
                        c165602 = c16560;
                    }
                    m25662 = (C0630.m2566("᩸۠") ^ i11) * (-11);
                    i6 = ((m25662 ^ i10) * (-5111)) ^ 1890569576;
                    i7 = -1771948919;
                    int i2222222222 = m25662 ^ i7;
                    i17 = i3;
                    i13 = i2222222222;
                    i12 = i6;
                    c165602 = c16560;
                case -914214706:
                case -402519996:
                    C4616.m13552();
                    if (C4616.f14690 > 0) {
                        i3 = i17;
                        m2566 = C2105.m6981("ۢܺ") ^ i11;
                        i4 = ((m2566 ^ i10) * 27287) ^ (-869196308);
                        i5 = 1445396355;
                        int i21222222222222 = i3;
                        i13 = m2566 ^ i5;
                        i12 = i4;
                        i17 = i21222222222222;
                    } else {
                        m6981 = C2105.m6981("᩵۟") ^ i10;
                        i = ((m6981 ^ i11) * (-20049)) ^ 660237364;
                        i2 = 781689873;
                        i13 = m6981 ^ i2;
                        i12 = i;
                    }
                case -891384006:
                case 988500916:
                    i3 = i17;
                    i15++;
                    m2566 = (i10 - C0630.m2566("᩺᩹")) * (-93);
                    i4 = ((m2566 ^ i11) * (-2615)) ^ (-1210613867);
                    i5 = 281781147;
                    int i212222222222222 = i3;
                    i13 = m2566 ^ i5;
                    i12 = i4;
                    i17 = i212222222222222;
                case -712188948:
                case -694969768:
                    RunnableC1937.m6376(c11971);
                    throw th;
                case -589589577:
                case 1883874948:
                    i3 = i17;
                    if (i15 < i14) {
                        m2566 = C2105.m6981("ܶ᩻") ^ i11;
                        i4 = ((m2566 ^ i10) * 9069) ^ 976299707;
                        i5 = 352105004;
                    } else {
                        m2566 = C0630.m2566("ۜ֨") ^ i10;
                        i4 = ((m2566 ^ i11) * 3877) ^ 503357706;
                        i5 = 1505262846;
                    }
                    int i2122222222222222 = i3;
                    i13 = m2566 ^ i5;
                    i12 = i4;
                    i17 = i2122222222222222;
                case -377571999:
                case 1138615737:
                    i3 = i17;
                    try {
                        i14 = c11971.size();
                        m2566 = (C2105.m6981("ۧۚ") ^ i11) * 109;
                        i4 = ((m2566 ^ i10) * (-1601)) ^ 347920612;
                        i5 = -1897636579;
                    } catch (Throwable th6) {
                        th = th6;
                        th = th;
                        m2566 = C2105.m6981("ۧᩳ") ^ i11;
                        i4 = ((m2566 ^ i10) * (-26967)) ^ (-1354239475);
                        i5 = 1542156125;
                        int i21222222222222222 = i3;
                        i13 = m2566 ^ i5;
                        i12 = i4;
                        i17 = i21222222222222222;
                    }
                    int i212222222222222222 = i3;
                    i13 = m2566 ^ i5;
                    i12 = i4;
                    i17 = i212222222222222222;
                case -347844678:
                case 1251908284:
                    if (C22628.f73083 > 0) {
                        m6981 = (C0630.m2566("֫ᩳ") ^ i10) * 119;
                        i = ((m6981 ^ i11) * (-31211)) ^ (-470142154);
                        i2 = -420695519;
                        i13 = m6981 ^ i2;
                        i12 = i;
                    }
                    m6981 = (i10 - C0630.m2566("ۡܺ")) * (-75);
                    i = ((m6981 ^ i11) * 31121) ^ (-1086205594);
                    i2 = 1092682104;
                    i13 = m6981 ^ i2;
                    i12 = i;
                case -261457744:
                case 282329597:
                    s = sArr[c];
                    i17 = s * s;
                    if (RunnableC1937.f6483 < 0) {
                        m25663 = (C2105.m6981("ܺ֡") ^ i11) * 13;
                        i6 = ((m25663 ^ i10) * (-11167)) ^ 1287413206;
                        i8 = 501283636;
                        i13 = m25663 ^ i8;
                        i12 = i6;
                        c165602 = c16560;
                    }
                    m25663 = C0630.m2566("᩶ܺ") ^ i11;
                    i6 = ((m25663 ^ i10) * 32051) ^ (-1415177955);
                    i8 = 1715433815;
                    i13 = m25663 ^ i8;
                    i12 = i6;
                    c165602 = c16560;
                case 69910909:
                case 2111201660:
                    C3019.m9255();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        i3 = i17;
                        m25662 = (C2105.m6981("ۧ᩸") + i11) * (-63);
                        i6 = ((m25662 ^ i10) * (-12867)) ^ 1796315804;
                        i7 = -424063084;
                        int i22222222222 = m25662 ^ i7;
                        i17 = i3;
                        i13 = i22222222222;
                        i12 = i6;
                        c165602 = c16560;
                    } else {
                        i3 = i17;
                        m2566 = C0630.m2566("ۧ᩷") ^ i10;
                        i4 = ((m2566 ^ i11) * 11175) ^ (-888300345);
                        i5 = 128956745;
                        int i2122222222222222222 = i3;
                        i13 = m2566 ^ i5;
                        i12 = i4;
                        i17 = i2122222222222222222;
                    }
                case 155611016:
                case 485537783:
                    i3 = i17;
                    s2 = 16442;
                    if (C0050.f910 < 0) {
                        m2566 = (C2105.m6981("᩺ۨ") ^ i10) * 75;
                        i4 = ((m2566 ^ i11) * (-16635)) ^ (-1923103112);
                        i5 = 1447530278;
                        int i21222222222222222222 = i3;
                        i13 = m2566 ^ i5;
                        i12 = i4;
                        i17 = i21222222222222222222;
                    }
                    m2566 = C0630.m2566("ۧ᩷") ^ i10;
                    i4 = ((m2566 ^ i11) * 11175) ^ (-888300345);
                    i5 = 128956745;
                    int i212222222222222222222 = i3;
                    i13 = m2566 ^ i5;
                    i12 = i4;
                    i17 = i212222222222222222222;
                case 443710758:
                case 1249104057:
                    i3 = i17;
                    C1047.m3591(c11971);
                    if (C1128.f4106 > 0) {
                        C4263.m12821(new C18156(c165602, abstractC15440));
                        return;
                    }
                    m69812 = C2105.m6981("ۗ᩻") ^ i11;
                    i = ((m69812 ^ i10) * 19853) ^ 1613747764;
                    i9 = 1031579491;
                    int i20222222 = m69812 ^ i9;
                    i17 = i3;
                    i13 = i20222222;
                    i12 = i;
                case 685119842:
                case 1677888581:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = C2105.m6981("ᩴۘ") ^ i10;
                        i = ((m6981 ^ i11) * 16041) ^ 1312930712;
                        i2 = -399566515;
                        i13 = m6981 ^ i2;
                        i12 = i;
                    }
                    m6981 = (i10 - C0630.m2566("ۡܺ")) * (-75);
                    i = ((m6981 ^ i11) * 31121) ^ (-1086205594);
                    i2 = 1092682104;
                    i13 = m6981 ^ i2;
                    i12 = i;
                case 799068770:
                case 1834894479:
                    C2958.m9034();
                    C3663.m11168();
                    i3 = i17;
                    m2566 = C2105.m6981("ۢܺ") ^ i11;
                    i4 = ((m2566 ^ i10) * 27287) ^ (-869196308);
                    i5 = 1445396355;
                    int i2122222222222222222222 = i3;
                    i13 = m2566 ^ i5;
                    i12 = i4;
                    i17 = i2122222222222222222222;
                case 851677506:
                case 1736852022:
                    i3 = i17;
                    i18 = i3 + 67584841;
                    if (C0714.f2697 >= 0) {
                        m25662 = (C0630.m2566("᩸۠") ^ i11) * (-11);
                        i6 = ((m25662 ^ i10) * (-5111)) ^ 1890569576;
                        i7 = -1771948919;
                        int i222222222222 = m25662 ^ i7;
                        i17 = i3;
                        i13 = i222222222222;
                        i12 = i6;
                        c165602 = c16560;
                    } else {
                        m2566 = C0630.m2566("᩹ۖ") ^ i11;
                        i4 = ((m2566 ^ i10) * (-5319)) ^ 2021540351;
                        i5 = -1853126173;
                        int i21222222222222222222222 = i3;
                        i13 = m2566 ^ i5;
                        i12 = i4;
                        i17 = i21222222222222222222222;
                    }
                case 1147507373:
                case 1264976529:
                    C1128.m3851();
                    if (C1711.f5919) {
                        m6981 = (i10 - C0630.m2566("ۡܺ")) * (-75);
                        i = ((m6981 ^ i11) * 31121) ^ (-1086205594);
                        i2 = 1092682104;
                        i13 = m6981 ^ i2;
                        i12 = i;
                    } else {
                        i3 = i17;
                        m2566 = C2105.m6981("ۢܺ") ^ i11;
                        i4 = ((m2566 ^ i10) * 27287) ^ (-869196308);
                        i5 = 1445396355;
                        int i212222222222222222222222 = i3;
                        i13 = m2566 ^ i5;
                        i12 = i4;
                        i17 = i212222222222222222222222;
                    }
                default:
                    i3 = i17;
                    if (i18 - (s * s2) >= 0) {
                        m2566 = (i10 - C2105.m6981("ۙᩳ")) * (-97);
                        i4 = ((m2566 ^ i11) * (-6119)) ^ 1529656196;
                        i5 = -419902502;
                    } else {
                        m2566 = (i11 - C0630.m2566("᩹ܳ")) * (-11);
                        i4 = ((m2566 ^ i10) * (-6341)) ^ 4085792;
                        i5 = -1414648686;
                    }
                    int i2122222222222222222222222 = i3;
                    i13 = m2566 ^ i5;
                    i12 = i4;
                    i17 = i2122222222222222222222222;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (l.C7811.f24123 >= 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        if (l.C3683.f11629 < 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (l.C0798.f2919 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        if (l.RunnableC1937.m6387() != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c0, code lost:
    
        if (l.C6554.m18062(r6) != false) goto L34;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m45015(l.C16560 r30, l.InterfaceC17889 r31) {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19568.m45015(l.ܽۢܳ, l.ᩳۜܳ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (l.C0798.m2998() == 0) goto L10;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m45001(java.lang.Class r17, l.C16560 r18, l.InterfaceC17889 r19, l.AbstractC15440 r20) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19568.m45001(java.lang.Class, l.ܽۢܳ, l.ᩳۜܳ, l.ܶ᩵ܿ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0185, code lost:
    
        if (l.C3746.f11829 <= 0) goto L68;
     */
    static {
        /*
            Method dump skipped, instructions count: 1467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19568.<clinit>():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45009(C16560 c16560, InterfaceC17889 interfaceC17889, InterfaceC18862 interfaceC18862) {
        AbstractC16891 abstractC16891 = null;
        int i = -313274302;
        int i2 = C2167.f7158;
        int i3 = C0630.f2410;
        int m6981 = (i3 - C2105.m6981("᩹֡")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
        int i4 = ((m6981 ^ i2) * (-13665)) ^ (-940493895);
        int i5 = 2009174105;
        while (true) {
            i = ((((i ^ i2) * (-27883)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2124787162:
                case 111290447:
                    if (C4263.f13799 <= 0) {
                        m6981 = C0630.m2566("ۗ᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 10981) ^ 1434692612;
                        i5 = -630045719;
                    } else {
                        m6981 = C0630.m2566("᩸ۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * 21379) ^ 1888309773;
                        i5 = 1122383680;
                    }
                case -2083070995:
                case -51519145:
                    if (RunnableC1108.f4040) {
                        m6981 = C2105.m6981("ۨ᩺") ^ i2;
                        i4 = ((m6981 ^ i3) * (-15009)) ^ (-1447350655);
                        i5 = 1682728848;
                    } else {
                        m6981 = (C0630.m2566("ܰۖ") ^ i3) * 99;
                        i4 = ((m6981 ^ i2) * (-13035)) ^ (-1876992893);
                        i5 = -1883237007;
                    }
                case -1897094172:
                case -404180990:
                    if (C4117.m12364() != 0) {
                        m6981 = C2105.m6981("ۢۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 20697) ^ (-1949578378);
                        i5 = -1641803863;
                    } else {
                        m6981 = (C2105.m6981("ܿ֨") ^ i2) * (-59);
                        i4 = ((m6981 ^ i3) * 13369) ^ (-1180355700);
                        i5 = -2010552074;
                    }
                case -1647042095:
                case 1820134828:
                    if (C1711.f5919) {
                        m6981 = C0630.m2566("֨ۨ") ^ i2;
                        i4 = ((m6981 ^ i3) * 3469) ^ (-506603290);
                        i5 = -1557031762;
                    } else {
                        m6981 = C2105.m6981("ۢۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 20697) ^ (-1949578378);
                        i5 = -1641803863;
                    }
                case -1522755823:
                case -996918056:
                    C1420.m4913();
                    C3019.m9255();
                    m6981 = C0630.m2566("᩻ܿ") ^ i2;
                    i4 = ((m6981 ^ i3) * (-10605)) ^ (-977723839);
                    i5 = 426068729;
                case -1321343133:
                case 408281954:
                    if (C2126.f7087) {
                        m6981 = C0630.m2566("᩻ܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-10605)) ^ (-977723839);
                        i5 = 426068729;
                    } else {
                        m6981 = C2105.m6981("ܶۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-2315)) ^ 1288905206;
                        i5 = -1160349481;
                    }
                case -1122362588:
                case -623307413:
                    if (C2520.f8000 >= 0) {
                        m6981 = C0630.m2566("ۗ᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 10981) ^ 1434692612;
                        i5 = -630045719;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۚۘ")) * (-51);
                        i4 = ((m6981 ^ i2) * 24985) ^ 718068046;
                        i5 = 41960905;
                    }
                case -1070531845:
                case 513632438:
                    C0050.m940();
                    C1773.m5908();
                    break;
                case -983796594:
                case 2053615304:
                    C4159.m12565();
                    if (C2958.f9394 >= 0) {
                        m6981 = C0630.m2566("᩻ܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-10605)) ^ (-977723839);
                        i5 = 426068729;
                    } else {
                        m6981 = C2105.m6981("ۢۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * 20697) ^ (-1949578378);
                        i5 = -1641803863;
                    }
                case -738342970:
                case 1874435821:
                    if (C0483.f2088 >= 0) {
                        m6981 = (C0630.m2566("ܰۖ") ^ i3) * 99;
                        i4 = ((m6981 ^ i2) * (-13035)) ^ (-1876992893);
                        i5 = -1883237007;
                    } else {
                        m6981 = (C2105.m6981("֫ۚ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i4 = ((m6981 ^ i2) * (-31155)) ^ 2022079233;
                        i5 = 1586277356;
                    }
                case -695753435:
                case 2019828572:
                    abstractC16891.m39738(c16560, interfaceC17889, new C20068(interfaceC17889, interfaceC18862));
                    break;
                case -328448095:
                case 952763505:
                    if (C0714.m2805()) {
                        m6981 = C0630.m2566("۬ܳ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-26891)) ^ (-639149003);
                        i5 = -1118272893;
                    } else {
                        m6981 = C0630.m2566("ۗ᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 10981) ^ 1434692612;
                        i5 = -630045719;
                    }
                case 356112107:
                case 1669337754:
                    if (C3019.m9255() <= 0) {
                        m6981 = (C0630.m2566("ܰۖ") ^ i3) * 99;
                        i4 = ((m6981 ^ i2) * (-13035)) ^ (-1876992893);
                        i5 = -1883237007;
                    } else {
                        m6981 = C0630.m2566("ܳܿ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-28669)) ^ 221910543;
                        i5 = 179023244;
                    }
                case 1599214727:
                case 1722662352:
                    abstractC16891 = C2126.m7043(c16560);
                    if (C0382.f1805) {
                        m6981 = C0630.m2566("᩺ۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * 24243) ^ (-555116386);
                        i5 = -1590586137;
                    } else {
                        m6981 = C0630.m2566("ۗ᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 10981) ^ 1434692612;
                        i5 = -630045719;
                    }
                case 1631326365:
                case 2047536660:
                    if (RunnableC1937.m6387() != 0) {
                        m6981 = C0630.m2566("֨ۨ") ^ i2;
                        i4 = ((m6981 ^ i3) * 3469) ^ (-506603290);
                        i5 = -1557031762;
                    } else {
                        m6981 = C0630.m2566("᩵ᩳ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-1647)) ^ 1232253833;
                        i5 = 98678111;
                    }
                default:
                    if (C2167.f7158 >= 0) {
                        m6981 = C0630.m2566("֨ۨ") ^ i2;
                        i4 = ((m6981 ^ i3) * 3469) ^ (-506603290);
                        i5 = -1557031762;
                    } else {
                        m6981 = (C0630.m2566("ܰۖ") ^ i3) * 99;
                        i4 = ((m6981 ^ i2) * (-13035)) ^ (-1876992893);
                        i5 = -1883237007;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45010(InterfaceC17889 interfaceC17889, InterfaceC18862 interfaceC18862, C10211 c10211) {
        c10211.m25619();
        AbstractC15440 m25622 = c10211.m25622();
        synchronized (C19568.class) {
            f63247 = C2958.m9025(m25622);
            f63253 = interfaceC17889.getPath();
        }
        interfaceC18862.mo6267(m25622);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44997(String str) {
        synchronized (C19568.class) {
            if (!C1294.m4369(str, f63247)) {
                return str;
            }
            return f63253;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4045 m44998(AbstractC15440 abstractC15440) {
        int i;
        byte b;
        byte b2;
        int i2;
        int i3;
        byte[] bArr;
        Throwable th;
        int i4;
        int i5;
        byte b3;
        int m6981;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        byte b4;
        byte[] bArr2;
        int i12;
        Throwable th2;
        InputStream inputStream;
        int i13;
        int m69812;
        int i14;
        int i15;
        int i16;
        int m2566;
        int i17;
        int i18;
        byte b5;
        int i19;
        byte[] bArr3;
        Throwable th3;
        int i20;
        int m69813;
        int i21;
        int i22;
        int m25662;
        int i23;
        int i24;
        int m25663;
        int i25;
        int i26;
        int i27;
        InputStream inputStream2;
        byte b6;
        byte b7;
        int i28;
        int i29;
        int m69814;
        int i30;
        int i31;
        int m25664;
        int i32;
        int i33;
        int i34 = C1047.f3863;
        int i35 = C3537.f11231;
        int m69815 = C2105.m6981("ܶ۠") ^ i34;
        int i36 = ((m69815 ^ i35) * (-841)) ^ (-1819296249);
        Throwable th4 = null;
        Object obj = null;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        String str = null;
        int i37 = m69815 ^ (-1893380856);
        InputStream inputStream3 = null;
        int i38 = 0;
        byte b8 = 0;
        byte b9 = 0;
        byte b10 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        byte b11 = 0;
        boolean z = false;
        int i43 = 0;
        int i44 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        byte b12 = 0;
        int i45 = -256948448;
        byte b13 = 0;
        byte[] bArr7 = null;
        int i46 = 0;
        while (true) {
            i45 = i37 ^ (i36 & (((i45 ^ i35) * 7883) >> 31));
            switch (i45) {
                case -2074086882:
                case -1267953121:
                    i = i40;
                    b = b12;
                    b5 = b13;
                    i2 = i46;
                    i19 = i44;
                    bArr3 = bArr7;
                    th3 = th4;
                    i20 = i38;
                    z2 = true;
                    m69813 = C2105.m6981("۠ܳ") ^ i35;
                    i21 = ((m69813 ^ i34) * (-28383)) ^ (-1121523449);
                    i22 = -1805173745;
                    i37 = m69813 ^ i22;
                    i36 = i21;
                    b13 = b5;
                    i38 = i20;
                    th4 = th3;
                    bArr7 = bArr3;
                    i44 = i19;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case -2070273508:
                case 971314138:
                    i8 = i39;
                    i = i40;
                    if (!C3746.m11370(str, RunnableC1937.m6385(f63246, 78, 8, i41))) {
                        m25664 = (C0630.m2566("֡ۗ") ^ i34) * (-83);
                        i32 = ((m25664 ^ i35) * (-31169)) ^ 2091449852;
                        i33 = 478328637;
                        int i47 = m25664 ^ i33;
                        i40 = i;
                        int i48 = i8;
                        i37 = i47;
                        i36 = i32;
                        i39 = i48;
                    }
                    m25664 = (C0630.m2566("ܰᩴ") + i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i32 = ((m25664 ^ i35) * 24517) ^ 574245079;
                    i33 = 1411003477;
                    int i472 = m25664 ^ i33;
                    i40 = i;
                    int i482 = i8;
                    i37 = i472;
                    i36 = i32;
                    i39 = i482;
                case -2025886049:
                case 654023563:
                    i8 = i39;
                    i = i40;
                    i38++;
                    m25664 = (i35 - C2105.m6981("ܿۘ")) * 89;
                    i32 = ((m25664 ^ i34) * 20397) ^ 1354852731;
                    i33 = 1568585284;
                    int i4722 = m25664 ^ i33;
                    i40 = i;
                    int i4822 = i8;
                    i37 = i4722;
                    i36 = i32;
                    i39 = i4822;
                case -1976931440:
                case 1119845708:
                    return EnumC4045.f12836;
                case -1943815225:
                case -148196255:
                    i = i40;
                    b = b12;
                    b2 = b13;
                    i2 = i46;
                    i3 = i44;
                    bArr = bArr7;
                    th = th4;
                    i4 = i38;
                    try {
                        C2272.m7512(inputStream3);
                        i16 = i3;
                        m2566 = C0630.m2566("ۗۛ") ^ i34;
                        i17 = ((m2566 ^ i35) * 6323) ^ 287528165;
                        i18 = -1189632627;
                        int i49 = m2566 ^ i18;
                        b13 = b2;
                        i38 = i4;
                        th4 = th;
                        bArr7 = bArr;
                        i44 = i16;
                        i37 = i49;
                        i36 = i17;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                    } catch (Throwable th5) {
                        int m69816 = C2105.m6981("۟۟") ^ i34;
                        obj = th5;
                        i36 = ((m69816 ^ i35) * (-30013)) ^ 1544173653;
                        b13 = b2;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                        i5 = i4;
                        th4 = th;
                        bArr7 = bArr;
                        i44 = i3;
                        i37 = m69816 ^ (-938492362);
                        break;
                    }
                case -1919988422:
                case -502688203:
                    i8 = i39;
                    i = i40;
                    if (!C1128.m3850(str, C0237.m1483(f63246, 40, 4, i41))) {
                        m25664 = C0630.m2566("ܿ᩹") ^ i35;
                        i32 = ((m25664 ^ i34) * 26859) ^ (-192049888);
                        i33 = 94988433;
                        int i47222 = m25664 ^ i33;
                        i40 = i;
                        int i48222 = i8;
                        i37 = i47222;
                        i36 = i32;
                        i39 = i48222;
                    }
                    m25664 = (C0630.m2566("ܰᩴ") + i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i32 = ((m25664 ^ i35) * 24517) ^ 574245079;
                    i33 = 1411003477;
                    int i472222 = m25664 ^ i33;
                    i40 = i;
                    int i482222 = i8;
                    i37 = i472222;
                    i36 = i32;
                    i39 = i482222;
                case -1911963622:
                case 861295046:
                    return EnumC4045.f12832;
                case -1909619370:
                case -1267041555:
                    i8 = i39;
                    i = i40;
                    if (i38 < i46) {
                        m25664 = (C0630.m2566("ܳᩳ") ^ i35) * 45;
                        i32 = ((m25664 ^ i34) * 11655) ^ 192632989;
                        i33 = 177640202;
                    } else {
                        m25664 = (C0630.m2566("ᩳۜ") + i34) * (-113);
                        i32 = ((m25664 ^ i35) * (-3049)) ^ 893919215;
                        i33 = 957729237;
                    }
                    int i4722222 = m25664 ^ i33;
                    i40 = i;
                    int i4822222 = i8;
                    i37 = i4722222;
                    i36 = i32;
                    i39 = i4822222;
                case -1888840939:
                case -846517647:
                    i8 = i39;
                    i = i40;
                    if (!C3746.m11370(str, C1047.m3603(f63246, 29, 4, i41))) {
                        m25664 = (i35 - C0630.m2566("ܿۖ")) * (-69);
                        i32 = ((m25664 ^ i34) * (-27415)) ^ 510757734;
                        i33 = -1557422763;
                        int i47222222 = m25664 ^ i33;
                        i40 = i;
                        int i48222222 = i8;
                        i37 = i47222222;
                        i36 = i32;
                        i39 = i48222222;
                    }
                    m25664 = (C0630.m2566("ܰᩴ") + i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i32 = ((m25664 ^ i35) * 24517) ^ 574245079;
                    i33 = 1411003477;
                    int i472222222 = m25664 ^ i33;
                    i40 = i;
                    int i482222222 = i8;
                    i37 = i472222222;
                    i36 = i32;
                    i39 = i482222222;
                case -1878626231:
                case 886306572:
                    return EnumC4045.f12835;
                case -1850131017:
                case 1285324685:
                    b3 = b13;
                    byte b14 = b12;
                    i2 = i46;
                    int i50 = i40;
                    b = b14;
                    try {
                        bArr4 = f63251;
                        m6981 = (C2105.m6981("᩷ۡ") ^ i34) * (-69);
                        i = i50;
                        i6 = ((m6981 ^ i35) * 10271) ^ 1645082985;
                        i7 = 2129591127;
                        i37 = m6981 ^ i7;
                        i36 = i6;
                        b13 = b3;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                    } catch (Throwable th6) {
                        th = th6;
                        i = i50;
                        i9 = i38;
                        i27 = i43;
                        i26 = i44;
                        inputStream2 = inputStream3;
                        int m25665 = C0630.m2566("᩺᩸") ^ i35;
                        int i51 = ((m25665 ^ i34) * (-27453)) ^ 100950350;
                        b13 = b3;
                        i44 = i26;
                        i37 = m25665 ^ 666843940;
                        inputStream3 = inputStream2;
                        i43 = i27;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                        i5 = i9;
                        th4 = th;
                        i36 = i51;
                        i38 = i5;
                    }
                case -1841034307:
                case -1066025851:
                    i8 = i39;
                    i = i40;
                    if (!C3746.m11370(str, C7106.m19110(f63246, 74, 4, i41))) {
                        m25664 = (i35 - C0630.m2566("֨֨")) * (-81);
                        i32 = ((m25664 ^ i34) * 21377) ^ 1304076473;
                        i33 = 540427146;
                        int i4722222222 = m25664 ^ i33;
                        i40 = i;
                        int i4822222222 = i8;
                        i37 = i4722222222;
                        i36 = i32;
                        i39 = i4822222222;
                    }
                    m25664 = (C0630.m2566("ܰᩴ") + i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i32 = ((m25664 ^ i35) * 24517) ^ 574245079;
                    i33 = 1411003477;
                    int i47222222222 = m25664 ^ i33;
                    i40 = i;
                    int i48222222222 = i8;
                    i37 = i47222222222;
                    i36 = i32;
                    i39 = i48222222222;
                case -1807809711:
                case 322854212:
                    i = i40;
                    i11 = i44;
                    b = b12;
                    b4 = b13;
                    i2 = i46;
                    bArr2 = bArr7;
                    i12 = i43;
                    th2 = th4;
                    inputStream = inputStream3;
                    i13 = i38;
                    i41 = 61273;
                    m69812 = (C2105.m6981("ۙܰ") ^ i35) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i14 = ((m69812 ^ i34) * (-5551)) ^ 746441616;
                    i15 = -713985244;
                    int i52 = m69812 ^ i15;
                    b13 = b4;
                    i38 = i13;
                    th4 = th2;
                    bArr7 = bArr2;
                    i44 = i11;
                    i37 = i52;
                    i36 = i14;
                    inputStream3 = inputStream;
                    i43 = i12;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case -1714665582:
                case 41042189:
                    i = i40;
                    i26 = i44;
                    b = b12;
                    b3 = b13;
                    i2 = i46;
                    byte[] bArr8 = bArr7;
                    i27 = i43;
                    Throwable th7 = th4;
                    i9 = i38;
                    try {
                        byte[] bArr9 = new byte[i27];
                        try {
                            C22194.m49844(inputStream3, bArr9, i27);
                            inputStream2 = inputStream3;
                            try {
                                i44 = C0483.m2127(0, bArr9);
                                int m25666 = (C0630.m2566("ۚ۠") ^ i35) * 95;
                                i37 = m25666 ^ (-1186298355);
                                i36 = ((m25666 ^ i34) * 19505) ^ 653684759;
                                b13 = b3;
                                inputStream3 = inputStream2;
                                z = false;
                                i43 = i27;
                                i46 = i2;
                                b12 = b;
                                i40 = i;
                                i5 = i9;
                                th4 = th7;
                                bArr7 = bArr9;
                            } catch (Throwable th8) {
                                th = th8;
                                bArr7 = bArr9;
                                z = false;
                                int m256652 = C0630.m2566("᩺᩸") ^ i35;
                                int i512 = ((m256652 ^ i34) * (-27453)) ^ 100950350;
                                b13 = b3;
                                i44 = i26;
                                i37 = m256652 ^ 666843940;
                                inputStream3 = inputStream2;
                                i43 = i27;
                                i46 = i2;
                                b12 = b;
                                i40 = i;
                                i5 = i9;
                                th4 = th;
                                i36 = i512;
                                i38 = i5;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            inputStream2 = inputStream3;
                            bArr7 = bArr9;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        inputStream2 = inputStream3;
                        bArr7 = bArr8;
                    }
                    i38 = i5;
                case -1612770665:
                case 1619913721:
                    i8 = i39;
                    i = i40;
                    if (C1047.m3595(C1005.m3496(abstractC15440)).matches(C1005.m3502(f63246, 90, 80, i41))) {
                        m25664 = C0630.m2566("۟᩻") ^ i34;
                        i32 = ((m25664 ^ i35) * 32295) ^ (-263787352);
                        i33 = 600985502;
                    } else {
                        m25664 = (C2105.m6981("ᩴۗ") + i35) * (-65);
                        i32 = ((m25664 ^ i34) * (-16887)) ^ 308099983;
                        i33 = -1948116321;
                    }
                    int i472222222222 = m25664 ^ i33;
                    i40 = i;
                    int i482222222222 = i8;
                    i37 = i472222222222;
                    i36 = i32;
                    i39 = i482222222222;
                case -1607452997:
                case 1469238119:
                    i8 = i39;
                    i = i40;
                    if (b11 != b8) {
                        m25664 = C2105.m6981("֫᩻") ^ i34;
                        i32 = ((m25664 ^ i35) * 23667) ^ 13561996;
                        i33 = -120659573;
                    } else {
                        m25664 = (C0630.m2566("ܽۚ") + i35) * (-45);
                        i32 = ((m25664 ^ i34) * 8613) ^ (-220834935);
                        i33 = 1728876687;
                    }
                    int i4722222222222 = m25664 ^ i33;
                    i40 = i;
                    int i4822222222222 = i8;
                    i37 = i4722222222222;
                    i36 = i32;
                    i39 = i4822222222222;
                case -1588993210:
                case 1967984050:
                    i8 = i39;
                    i = i40;
                    if (C1128.m3850(RunnableC1937.m6378(C1005.m3496(abstractC15440)), C0483.m2128(f63246, 86, 4, i41))) {
                        m25664 = (C0630.m2566("᩻ᩳ") + i34) * (-41);
                        i32 = ((m25664 ^ i35) * 21121) ^ (-444670517);
                        i33 = -1232226996;
                    } else {
                        m25664 = C0630.m2566("ᩳ۬") ^ i35;
                        i32 = ((m25664 ^ i34) * (-13469)) ^ 1426435776;
                        i33 = 1315251204;
                    }
                    int i47222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i48222222222222 = i8;
                    i37 = i47222222222222;
                    i36 = i32;
                    i39 = i48222222222222;
                case -1557742650:
                case -191773654:
                    b6 = b12;
                    b7 = b13;
                    i28 = i46;
                    i29 = 0;
                    int m25667 = (C0630.m2566("ܰ᩸") ^ i34) * (-25);
                    int i53 = i29;
                    i36 = ((m25667 ^ i35) * 27273) ^ 1358505869;
                    b13 = b7;
                    i37 = m25667 ^ (-1994817141);
                    i46 = i28;
                    b12 = b6;
                    i40 = i53;
                case -1553433477:
                case 405647034:
                    i8 = i39;
                    i = i40;
                    byte[] bArr10 = f63252;
                    try {
                        i46 = bArr10.length;
                        int m25668 = C0630.m2566("᩹ܰ") ^ i35;
                        i10 = ((m25668 ^ i34) * (-20207)) ^ 1455445322;
                        bArr6 = bArr10;
                        i39 = i8;
                        i37 = m25668 ^ (-1469119675);
                        i36 = i10;
                        i40 = i;
                    } catch (Throwable th11) {
                        th = th11;
                        i9 = i38;
                        bArr6 = bArr10;
                        b = b12;
                        i39 = i8;
                        b3 = b13;
                        i2 = i46;
                        i27 = i43;
                        i26 = i44;
                        inputStream2 = inputStream3;
                        int m2566522 = C0630.m2566("᩺᩸") ^ i35;
                        int i5122 = ((m2566522 ^ i34) * (-27453)) ^ 100950350;
                        b13 = b3;
                        i44 = i26;
                        i37 = m2566522 ^ 666843940;
                        inputStream3 = inputStream2;
                        i43 = i27;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                        i5 = i9;
                        th4 = th;
                        i36 = i5122;
                        i38 = i5;
                    }
                case -1540768225:
                case 1163698634:
                    i = i40;
                    i42++;
                    b = b12;
                    b3 = b13;
                    i2 = i46;
                    m6981 = C0630.m2566("۬ۙ") ^ i35;
                    i6 = ((m6981 ^ i34) * 12397) ^ (-903316179);
                    i7 = -1048486752;
                    i37 = m6981 ^ i7;
                    i36 = i6;
                    b13 = b3;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case -1517098671:
                case -283978203:
                    i = i40;
                    b = b12;
                    b3 = b13;
                    i2 = i46;
                    i42 = 0;
                    m6981 = C0630.m2566("۬ۙ") ^ i35;
                    i6 = ((m6981 ^ i34) * 12397) ^ (-903316179);
                    i7 = -1048486752;
                    i37 = m6981 ^ i7;
                    i36 = i6;
                    b13 = b3;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case -1506352820:
                case 1908260788:
                    int i54 = i40;
                    byte b15 = b12;
                    byte b16 = b13;
                    int i55 = i46;
                    if (i54 < 6) {
                        m69814 = C2105.m6981("ܰۜ") ^ i35;
                        i30 = ((m69814 ^ i34) * (-20387)) ^ 484015263;
                        i31 = 2090427434;
                    } else {
                        m69814 = (C2105.m6981("۠۠") + i35) * (-65);
                        i30 = ((m69814 ^ i34) * (-26249)) ^ (-565996486);
                        i31 = -2024756673;
                    }
                    i37 = m69814 ^ i31;
                    i36 = i30;
                    b13 = b16;
                    i39 = 6;
                    i40 = i54;
                    i46 = i55;
                    b12 = b15;
                case -1451241824:
                case -1390375476:
                    i = i40;
                    b3 = b13;
                    i2 = i46;
                    byte b17 = bArr7[i];
                    try {
                        b13 = bArr4[i];
                        int m25669 = (i34 - C0630.m2566("᩷ᩴ")) * 109;
                        i37 = m25669 ^ 1056325602;
                        i36 = ((m25669 ^ i35) * (-10807)) ^ (-597143356);
                        i40 = i;
                        b12 = b17;
                        i46 = i2;
                    } catch (Throwable th12) {
                        th = th12;
                        b = b17;
                        i9 = i38;
                        i27 = i43;
                        i26 = i44;
                        inputStream2 = inputStream3;
                        int m25665222 = C0630.m2566("᩺᩸") ^ i35;
                        int i51222 = ((m25665222 ^ i34) * (-27453)) ^ 100950350;
                        b13 = b3;
                        i44 = i26;
                        i37 = m25665222 ^ 666843940;
                        inputStream3 = inputStream2;
                        i43 = i27;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                        i5 = i9;
                        th4 = th;
                        i36 = i51222;
                        i38 = i5;
                    }
                case -1424717447:
                case 1777156169:
                    i8 = i39;
                    i = i40;
                    RunnableC1108.m3785(inputStream3);
                    m25664 = C2105.m6981("᩻᩵") ^ i35;
                    i32 = ((m25664 ^ i34) * (-15089)) ^ (-1170602945);
                    i33 = 924785087;
                    int i472222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i482222222222222 = i8;
                    i37 = i472222222222222;
                    i36 = i32;
                    i39 = i482222222222222;
                case -1364548213:
                case -838823078:
                    return EnumC4045.f12834;
                case -1249025989:
                case 1250381416:
                    i8 = i39;
                    i = i40;
                    z6 = true;
                    m25664 = C2105.m6981("ܺۜ") ^ i34;
                    i32 = ((m25664 ^ i35) * (-31863)) ^ 1173479079;
                    i33 = -353649207;
                    int i4722222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i4822222222222222 = i8;
                    i37 = i4722222222222222;
                    i36 = i32;
                    i39 = i4822222222222222;
                case -1210045844:
                case 1179088382:
                    i = i40;
                    i11 = i44;
                    b = b12;
                    b4 = b13;
                    i2 = i46;
                    bArr2 = bArr7;
                    i12 = i43;
                    th2 = th4;
                    inputStream = inputStream3;
                    i13 = i38;
                    i41 = 63327;
                    m69812 = (C2105.m6981("ۙܰ") ^ i35) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                    i14 = ((m69812 ^ i34) * (-5551)) ^ 746441616;
                    i15 = -713985244;
                    int i522 = m69812 ^ i15;
                    b13 = b4;
                    i38 = i13;
                    th4 = th2;
                    bArr7 = bArr2;
                    i44 = i11;
                    i37 = i522;
                    i36 = i14;
                    inputStream3 = inputStream;
                    i43 = i12;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case -1175736592:
                case 1770248312:
                    i8 = i39;
                    i = i40;
                    if (!C1128.m3850(str, C3432.m10488(f63246, 52, 9, i41))) {
                        m25664 = (C2105.m6981("᩻ۜ") ^ i35) * (-67);
                        i32 = ((m25664 ^ i34) * (-24921)) ^ (-645343462);
                        i33 = -461068123;
                        int i47222222222222222 = m25664 ^ i33;
                        i40 = i;
                        int i48222222222222222 = i8;
                        i37 = i47222222222222222;
                        i36 = i32;
                        i39 = i48222222222222222;
                    }
                    m25664 = (C0630.m2566("ܰᩴ") + i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i32 = ((m25664 ^ i35) * 24517) ^ 574245079;
                    i33 = 1411003477;
                    int i472222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i482222222222222222 = i8;
                    i37 = i472222222222222222;
                    i36 = i32;
                    i39 = i482222222222222222;
                case -1116724063:
                case 804332637:
                    i = i40;
                    b = b12;
                    b3 = b13;
                    i2 = i46;
                    try {
                        bArr5 = f63249;
                        m6981 = (C2105.m6981("ۗۨ") + i35) * (-13);
                        i6 = ((m6981 ^ i34) * 24349) ^ (-1459449412);
                        i7 = -65164464;
                        i37 = m6981 ^ i7;
                        i36 = i6;
                        b13 = b3;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                    } catch (Throwable th13) {
                        th = th13;
                        i9 = i38;
                        i27 = i43;
                        i26 = i44;
                        inputStream2 = inputStream3;
                        int m256652222 = C0630.m2566("᩺᩸") ^ i35;
                        int i512222 = ((m256652222 ^ i34) * (-27453)) ^ 100950350;
                        b13 = b3;
                        i44 = i26;
                        i37 = m256652222 ^ 666843940;
                        inputStream3 = inputStream2;
                        i43 = i27;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                        i5 = i9;
                        th4 = th;
                        i36 = i512222;
                        i38 = i5;
                    }
                case -1017460710:
                case 949792521:
                    i = i40;
                    b = b12;
                    b3 = b13;
                    i2 = i46;
                    z4 = true;
                    m6981 = (C0630.m2566("᩷ۢ") ^ i34) * 57;
                    i6 = ((m6981 ^ i35) * 22275) ^ 484767092;
                    i7 = -1350438449;
                    i37 = m6981 ^ i7;
                    i36 = i6;
                    b13 = b3;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case -984606808:
                case 87961919:
                    return EnumC4045.f12831;
                case -882637380:
                case 71796350:
                    i = i40;
                    b = b12;
                    b3 = b13;
                    if (b != b3) {
                        m6981 = (C0630.m2566("ۤ۫") + i35) * 3;
                        i2 = i46;
                        i6 = ((m6981 ^ i34) * 11251) ^ 90454292;
                        i7 = 1901299486;
                    } else {
                        i2 = i46;
                        m6981 = (i34 - C0630.m2566("ܽ֡")) * (-33);
                        i6 = ((m6981 ^ i35) * 13343) ^ (-1592882901);
                        i7 = -405035725;
                    }
                    i37 = m6981 ^ i7;
                    i36 = i6;
                    b13 = b3;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case -857721460:
                case 612325064:
                    i29 = i40 + 1;
                    b6 = b12;
                    b7 = b13;
                    i28 = i46;
                    int m256672 = (C0630.m2566("ܰ᩸") ^ i34) * (-25);
                    int i532 = i29;
                    i36 = ((m256672 ^ i35) * 27273) ^ 1358505869;
                    b13 = b7;
                    i37 = m256672 ^ (-1994817141);
                    i46 = i28;
                    b12 = b6;
                    i40 = i532;
                case -802497459:
                case -508372901:
                    return EnumC4045.f12834;
                case -789737294:
                case -737108031:
                    i8 = i39;
                    i = i40;
                    if (!C1128.m3850(str, C1420.m4902(f63246, 44, 8, i41))) {
                        m25664 = (C2105.m6981("ۛۢ") + i34) * (-21);
                        i32 = ((m25664 ^ i35) * (-21815)) ^ 937451138;
                        i33 = -587325440;
                        int i4722222222222222222 = m25664 ^ i33;
                        i40 = i;
                        int i4822222222222222222 = i8;
                        i37 = i4722222222222222222;
                        i36 = i32;
                        i39 = i4822222222222222222;
                    }
                    m25664 = (C0630.m2566("ܰᩴ") + i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i32 = ((m25664 ^ i35) * 24517) ^ 574245079;
                    i33 = 1411003477;
                    int i47222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i48222222222222222222 = i8;
                    i37 = i47222222222222222222;
                    i36 = i32;
                    i39 = i48222222222222222222;
                case -740650580:
                case 1737711170:
                    i8 = i39;
                    i = i40;
                    if (inputStream3 != null) {
                        m25664 = (C0630.m2566("۠ܰ") + i34) * 69;
                        i32 = ((m25664 ^ i35) * 30407) ^ 345984081;
                        i33 = -1971298396;
                        int i472222222222222222222 = m25664 ^ i33;
                        i40 = i;
                        int i482222222222222222222 = i8;
                        i37 = i472222222222222222222;
                        i36 = i32;
                        i39 = i482222222222222222222;
                    }
                    m25664 = C2105.m6981("᩻᩵") ^ i35;
                    i32 = ((m25664 ^ i34) * (-15089)) ^ (-1170602945);
                    i33 = 924785087;
                    int i4722222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i4822222222222222222222 = i8;
                    i37 = i4722222222222222222222;
                    i36 = i32;
                    i39 = i4822222222222222222222;
                case -685332184:
                case 283409976:
                    i8 = i39;
                    i = i40;
                    try {
                        b10 = bArr7[i38];
                        b9 = bArr6[i38];
                        m25664 = C0630.m2566("ۗۖ") ^ i34;
                        i32 = ((m25664 ^ i35) * (-13411)) ^ (-1824856921);
                        i33 = -636067592;
                        int i47222222222222222222222 = m25664 ^ i33;
                        i40 = i;
                        int i48222222222222222222222 = i8;
                        i37 = i47222222222222222222222;
                        i36 = i32;
                        i39 = i48222222222222222222222;
                    } catch (Throwable th14) {
                        th = th14;
                        i9 = i38;
                        b = b12;
                        i39 = i8;
                        b3 = b13;
                        i2 = i46;
                        i27 = i43;
                        i26 = i44;
                        inputStream2 = inputStream3;
                        int m2566522222 = C0630.m2566("᩺᩸") ^ i35;
                        int i5122222 = ((m2566522222 ^ i34) * (-27453)) ^ 100950350;
                        b13 = b3;
                        i44 = i26;
                        i37 = m2566522222 ^ 666843940;
                        inputStream3 = inputStream2;
                        i43 = i27;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                        i5 = i9;
                        th4 = th;
                        i36 = i5122222;
                        i38 = i5;
                    }
                case -684263133:
                case 39693835:
                    i = i40;
                    i11 = i44;
                    b = b12;
                    b4 = b13;
                    i2 = i46;
                    bArr2 = bArr7;
                    i12 = i43;
                    th2 = th4;
                    inputStream = inputStream3;
                    i13 = i38;
                    short s = f63246[13];
                    int i56 = (s * 2) + 1;
                    int i57 = s + 1;
                    if ((i57 * i57) - i56 < 0) {
                        m69812 = C0630.m2566("ۛۜ") ^ i35;
                        i14 = ((m69812 ^ i34) * (-5723)) ^ (-1364211432);
                        i15 = -1744919851;
                    } else {
                        m69812 = (i34 - C2105.m6981("ۨܶ")) * (-47);
                        i14 = ((m69812 ^ i35) * (-8827)) ^ 1034057680;
                        i15 = 337772111;
                    }
                    int i5222 = m69812 ^ i15;
                    b13 = b4;
                    i38 = i13;
                    th4 = th2;
                    bArr7 = bArr2;
                    i44 = i11;
                    i37 = i5222;
                    i36 = i14;
                    inputStream3 = inputStream;
                    i43 = i12;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case -634687398:
                case -121119174:
                    i8 = i39;
                    i = i40;
                    if (!C1128.m3850(str, C1005.m3502(f63246, 61, 8, i41))) {
                        m25664 = C0630.m2566("۟֨") ^ i35;
                        i32 = ((m25664 ^ i34) * 31747) ^ (-1225949369);
                        i33 = -1050069922;
                        int i472222222222222222222222 = m25664 ^ i33;
                        i40 = i;
                        int i482222222222222222222222 = i8;
                        i37 = i472222222222222222222222;
                        i36 = i32;
                        i39 = i482222222222222222222222;
                    }
                    m25664 = (C0630.m2566("ܰᩴ") + i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i32 = ((m25664 ^ i35) * 24517) ^ 574245079;
                    i33 = 1411003477;
                    int i4722222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i4822222222222222222222222 = i8;
                    i37 = i4722222222222222222222222;
                    i36 = i32;
                    i39 = i4822222222222222222222222;
                case -629830028:
                case -515382630:
                    i8 = i39;
                    i = i40;
                    if (!C3746.m11370(str, ServiceConnectionC3453.m10568(f63246, 33, 7, i41))) {
                        m25664 = C0630.m2566("ᩳۤ") ^ i34;
                        i32 = ((m25664 ^ i35) * 18729) ^ 1416399053;
                        i33 = 1869785485;
                        int i47222222222222222222222222 = m25664 ^ i33;
                        i40 = i;
                        int i48222222222222222222222222 = i8;
                        i37 = i47222222222222222222222222;
                        i36 = i32;
                        i39 = i48222222222222222222222222;
                    }
                    m25664 = (C0630.m2566("ܰᩴ") + i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i32 = ((m25664 ^ i35) * 24517) ^ 574245079;
                    i33 = 1411003477;
                    int i472222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i482222222222222222222222222 = i8;
                    i37 = i472222222222222222222222222;
                    i36 = i32;
                    i39 = i482222222222222222222222222;
                case -562772208:
                case 105479647:
                    i = i40;
                    b = b12;
                    b3 = b13;
                    i2 = i46;
                    z5 = true;
                    m6981 = (C2105.m6981("᩻᩶") ^ i35) * 75;
                    i6 = ((m6981 ^ i34) * (-30303)) ^ (-1469095960);
                    i7 = -534210484;
                    i37 = m6981 ^ i7;
                    i36 = i6;
                    b13 = b3;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case -443424815:
                case 244407863:
                    i8 = i39;
                    i = i40;
                    if (z4) {
                        m25664 = C2105.m6981("ۨᩳ") ^ i34;
                        i32 = ((m25664 ^ i35) * (-7243)) ^ (-452667881);
                        i33 = -1388149927;
                    } else {
                        m25664 = (C0630.m2566("ܽ۟") + i35) * 75;
                        i32 = ((m25664 ^ i34) * 25473) ^ 54722789;
                        i33 = -1673000540;
                    }
                    int i4722222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i4822222222222222222222222222 = i8;
                    i37 = i4722222222222222222222222222;
                    i36 = i32;
                    i39 = i4822222222222222222222222222;
                case -425370961:
                case -172269433:
                    i8 = i39;
                    i = i40;
                    if (z2) {
                        m25664 = C2105.m6981("ۙۡ") ^ i34;
                        i32 = ((m25664 ^ i35) * (-21279)) ^ (-1202091243);
                        i33 = -524959331;
                    } else {
                        m25664 = C0630.m2566("ܿܽ") ^ i35;
                        i32 = ((m25664 ^ i34) * 24101) ^ (-526760580);
                        i33 = -340245817;
                    }
                    int i47222222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i48222222222222222222222222222 = i8;
                    i37 = i47222222222222222222222222222;
                    i36 = i32;
                    i39 = i48222222222222222222222222222;
                case -315468896:
                case 107507624:
                    i8 = i39;
                    i = i40;
                    if (z5) {
                        m25664 = C2105.m6981("ܶۙ") ^ i35;
                        i32 = ((m25664 ^ i34) * 21445) ^ 49344709;
                        i33 = -906274892;
                    } else {
                        m25664 = C2105.m6981("ܰ᩵") ^ i34;
                        i32 = ((m25664 ^ i35) * 23621) ^ 338787725;
                        i33 = 2013372353;
                    }
                    int i472222222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i482222222222222222222222222222 = i8;
                    i37 = i472222222222222222222222222222;
                    i36 = i32;
                    i39 = i482222222222222222222222222222;
                case -314301131:
                case 1029467310:
                    i8 = i39;
                    i = i40;
                    if (EnumC15915.m37676(abstractC15440)) {
                        m25664 = C0630.m2566("۟᩵") ^ i35;
                        i32 = ((m25664 ^ i34) * 3221) ^ (-741790226);
                        i33 = 350876820;
                    } else {
                        m25664 = (C0630.m2566("ۨۚ") ^ i34) * (-59);
                        i32 = ((m25664 ^ i35) * 12959) ^ 452998119;
                        i33 = 275305717;
                    }
                    int i4722222222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i4822222222222222222222222222222 = i8;
                    i37 = i4722222222222222222222222222222;
                    i36 = i32;
                    i39 = i4822222222222222222222222222222;
                case -242784557:
                case 1027509712:
                    i8 = i39;
                    i = i40;
                    str = RunnableC1937.m6378(C11340.m28023(abstractC15440));
                    if (!C1128.m3850(str, RunnableC1937.m6385(f63246, 14, 4, i41))) {
                        m25664 = C0630.m2566("۫᩻") ^ i35;
                        i32 = ((m25664 ^ i34) * 30899) ^ (-198978506);
                        i33 = -1111635126;
                        int i47222222222222222222222222222222 = m25664 ^ i33;
                        i40 = i;
                        int i48222222222222222222222222222222 = i8;
                        i37 = i47222222222222222222222222222222;
                        i36 = i32;
                        i39 = i48222222222222222222222222222222;
                    }
                    m25664 = (C0630.m2566("ܰᩴ") + i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i32 = ((m25664 ^ i35) * 24517) ^ 574245079;
                    i33 = 1411003477;
                    int i472222222222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i482222222222222222222222222222222 = i8;
                    i37 = i472222222222222222222222222222222;
                    i36 = i32;
                    i39 = i482222222222222222222222222222222;
                case -176593939:
                case 1407347998:
                    i8 = i39;
                    i = i40;
                    if (!z6) {
                        m25664 = C0630.m2566("ۘۛ") ^ i35;
                        i32 = ((m25664 ^ i34) * (-229)) ^ (-903421341);
                        i33 = 540979610;
                        int i4722222222222222222222222222222222 = m25664 ^ i33;
                        i40 = i;
                        int i4822222222222222222222222222222222 = i8;
                        i37 = i4722222222222222222222222222222222;
                        i36 = i32;
                        i39 = i4822222222222222222222222222222222;
                    }
                    m25664 = (C0630.m2566("ܰᩴ") + i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i32 = ((m25664 ^ i35) * 24517) ^ 574245079;
                    i33 = 1411003477;
                    int i47222222222222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i48222222222222222222222222222222222 = i8;
                    i37 = i47222222222222222222222222222222222;
                    i36 = i32;
                    i39 = i48222222222222222222222222222222222;
                case -167413680:
                case 1113994505:
                    i = i40;
                    i16 = i44;
                    b = b12;
                    b2 = b13;
                    i2 = i46;
                    bArr = bArr7;
                    th = th4;
                    i4 = i38;
                    if (inputStream3 != null) {
                        m2566 = C0630.m2566("ۙۚ") ^ i34;
                        i17 = ((m2566 ^ i35) * 19977) ^ 734392756;
                        i18 = 22766991;
                        int i492 = m2566 ^ i18;
                        b13 = b2;
                        i38 = i4;
                        th4 = th;
                        bArr7 = bArr;
                        i44 = i16;
                        i37 = i492;
                        i36 = i17;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                    }
                    m2566 = C0630.m2566("ۗۛ") ^ i34;
                    i17 = ((m2566 ^ i35) * 6323) ^ 287528165;
                    i18 = -1189632627;
                    int i4922 = m2566 ^ i18;
                    b13 = b2;
                    i38 = i4;
                    th4 = th;
                    bArr7 = bArr;
                    i44 = i16;
                    i37 = i4922;
                    i36 = i17;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case -60483614:
                case 19032727:
                    i8 = i39;
                    i = i40;
                    b11 = bArr7[i42];
                    b8 = bArr5[i42];
                    m25664 = C0630.m2566("ܿܶ") ^ i34;
                    i32 = ((m25664 ^ i35) * (-21733)) ^ (-1816145312);
                    i33 = 759747589;
                    int i472222222222222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i482222222222222222222222222222222222 = i8;
                    i37 = i472222222222222222222222222222222222;
                    i36 = i32;
                    i39 = i482222222222222222222222222222222222;
                case -56609551:
                case 1758019284:
                    i = i40;
                    b = b12;
                    b5 = b13;
                    i2 = i46;
                    i19 = i44;
                    bArr3 = bArr7;
                    th3 = th4;
                    i20 = i38;
                    Object obj2 = obj;
                    if (i19 != 101010256) {
                        m69813 = C2105.m6981("ۘ֡") ^ i34;
                        obj = obj2;
                        i21 = ((m69813 ^ i35) * 2943) ^ 2065376500;
                        i22 = -1690469555;
                        i37 = m69813 ^ i22;
                        i36 = i21;
                        b13 = b5;
                        i38 = i20;
                        th4 = th3;
                        bArr7 = bArr3;
                        i44 = i19;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                    } else {
                        obj = obj2;
                        m69813 = (C2105.m6981("ܳᩴ") ^ i35) * (-111);
                        i21 = ((m69813 ^ i34) * 26011) ^ 2010438919;
                        i22 = -1811829499;
                        i37 = m69813 ^ i22;
                        i36 = i21;
                        b13 = b5;
                        i38 = i20;
                        th4 = th3;
                        bArr7 = bArr3;
                        i44 = i19;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                    }
                case 54561424:
                case 1214742223:
                    i8 = i39;
                    i = i40;
                    if (!C3746.m11370(str, C4263.m12817(f63246, 25, 4, i41))) {
                        m25664 = C2105.m6981("ۚ۫") ^ i34;
                        i32 = ((m25664 ^ i35) * (-14415)) ^ (-1194940490);
                        i33 = 34753837;
                        int i4722222222222222222222222222222222222 = m25664 ^ i33;
                        i40 = i;
                        int i4822222222222222222222222222222222222 = i8;
                        i37 = i4722222222222222222222222222222222222;
                        i36 = i32;
                        i39 = i4822222222222222222222222222222222222;
                    }
                    m25664 = (C0630.m2566("ܰᩴ") + i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i32 = ((m25664 ^ i35) * 24517) ^ 574245079;
                    i33 = 1411003477;
                    int i47222222222222222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i48222222222222222222222222222222222222 = i8;
                    i37 = i47222222222222222222222222222222222222;
                    i36 = i32;
                    i39 = i48222222222222222222222222222222222222;
                case 75382125:
                case 560449495:
                    i = i40;
                    b = b12;
                    b3 = b13;
                    z4 = false;
                    i2 = i46;
                    m6981 = (C0630.m2566("᩷ۢ") ^ i34) * 57;
                    i6 = ((m6981 ^ i35) * 22275) ^ 484767092;
                    i7 = -1350438449;
                    i37 = m6981 ^ i7;
                    i36 = i6;
                    b13 = b3;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case 95391333:
                case 1466875726:
                    i8 = i39;
                    i = i40;
                    if (b10 != b9) {
                        z6 = z;
                        m25664 = C2105.m6981("ܺۜ") ^ i34;
                        i32 = ((m25664 ^ i35) * (-31863)) ^ 1173479079;
                        i33 = -353649207;
                        int i472222222222222222222222222222222222222 = m25664 ^ i33;
                        i40 = i;
                        int i482222222222222222222222222222222222222 = i8;
                        i37 = i472222222222222222222222222222222222222;
                        i36 = i32;
                        i39 = i482222222222222222222222222222222222222;
                    } else {
                        m25664 = (C0630.m2566("᩻۟") ^ i35) * 85;
                        i32 = ((m25664 ^ i34) * (-18781)) ^ 563598425;
                        i33 = -2077234771;
                        int i4722222222222222222222222222222222222222 = m25664 ^ i33;
                        i40 = i;
                        int i4822222222222222222222222222222222222222 = i8;
                        i37 = i4722222222222222222222222222222222222222;
                        i36 = i32;
                        i39 = i4822222222222222222222222222222222222222;
                    }
                case 205976988:
                case 272141703:
                    i = i40;
                    if (i42 < i39) {
                        m25663 = C0630.m2566("ۘۤ") ^ i35;
                        i10 = ((m25663 ^ i34) * 27345) ^ 100889386;
                        i25 = 769441956;
                    } else {
                        m25663 = (i34 - C0630.m2566("ۜᩴ")) * (-125);
                        i10 = ((m25663 ^ i35) * 15227) ^ 1909025729;
                        i25 = -1985605945;
                    }
                    i37 = m25663 ^ i25;
                    i36 = i10;
                    i40 = i;
                case 282124989:
                case 1585565540:
                    i8 = i39;
                    i = i40;
                    if (!C3746.m11370(str, C1420.m4902(f63246, 69, 5, i41))) {
                        m25664 = C2105.m6981("ܳ᩶") ^ i34;
                        i32 = ((m25664 ^ i35) * 1863) ^ 1433175224;
                        i33 = 524089207;
                        int i47222222222222222222222222222222222222222 = m25664 ^ i33;
                        i40 = i;
                        int i48222222222222222222222222222222222222222 = i8;
                        i37 = i47222222222222222222222222222222222222222;
                        i36 = i32;
                        i39 = i48222222222222222222222222222222222222222;
                    }
                    m25664 = (C0630.m2566("ܰᩴ") + i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i32 = ((m25664 ^ i35) * 24517) ^ 574245079;
                    i33 = 1411003477;
                    int i472222222222222222222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i482222222222222222222222222222222222222222 = i8;
                    i37 = i472222222222222222222222222222222222222222;
                    i36 = i32;
                    i39 = i482222222222222222222222222222222222222222;
                case 294188641:
                case 1172237334:
                    i = i40;
                    b = b12;
                    b5 = b13;
                    i2 = i46;
                    i19 = i44;
                    bArr3 = bArr7;
                    if (i19 == 1430352451) {
                        m25662 = (C0630.m2566("۬ܿ") ^ i34) * 119;
                        i23 = ((m25662 ^ i35) * (-12789)) ^ 1470319195;
                        i24 = 492337510;
                    } else {
                        m25662 = C0630.m2566("ۡۚ") ^ i35;
                        i23 = ((m25662 ^ i34) * 2889) ^ (-205355841);
                        i24 = -1562946138;
                    }
                    i37 = m25662 ^ i24;
                    i36 = i23;
                    b13 = b5;
                    bArr7 = bArr3;
                    i44 = i19;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case 339310502:
                case 2044015832:
                    i8 = i39;
                    i = i40;
                    i38 = 0;
                    m25664 = (i35 - C2105.m6981("ܿۘ")) * 89;
                    i32 = ((m25664 ^ i34) * 20397) ^ 1354852731;
                    i33 = 1568585284;
                    int i4722222222222222222222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i4822222222222222222222222222222222222222222 = i8;
                    i37 = i4722222222222222222222222222222222222222222;
                    i36 = i32;
                    i39 = i4822222222222222222222222222222222222222222;
                case 373663725:
                case 897462543:
                    i = i40;
                    b = b12;
                    b5 = b13;
                    i2 = i46;
                    i19 = i44;
                    if (i19 == 101075792) {
                        bArr3 = bArr7;
                        th3 = th4;
                        i20 = i38;
                        m69813 = (C2105.m6981("ܳᩴ") ^ i35) * (-111);
                        i21 = ((m69813 ^ i34) * 26011) ^ 2010438919;
                        i22 = -1811829499;
                        i37 = m69813 ^ i22;
                        i36 = i21;
                        b13 = b5;
                        i38 = i20;
                        th4 = th3;
                        bArr7 = bArr3;
                        i44 = i19;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                    } else {
                        m25662 = (C0630.m2566("᩺ۢ") ^ i35) * (-51);
                        bArr3 = bArr7;
                        i23 = ((m25662 ^ i34) * (-6847)) ^ (-2075624249);
                        i24 = 1918858063;
                        i37 = m25662 ^ i24;
                        i36 = i23;
                        b13 = b5;
                        bArr7 = bArr3;
                        i44 = i19;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                    }
                case 407027101:
                case 1534890264:
                    return EnumC4045.f12839;
                case 540702395:
                case 1591991140:
                    return EnumC4045.f12837;
                case 573412032:
                case 879720960:
                    throw th4;
                case 945662935:
                case 1974873810:
                    i8 = i39;
                    i = i40;
                    z3 = false;
                    m25664 = C2105.m6981("۫ܺ") ^ i34;
                    i32 = ((m25664 ^ i35) * 3765) ^ (-1779483587);
                    i33 = 772842685;
                    int i47222222222222222222222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i48222222222222222222222222222222222222222222 = i8;
                    i37 = i47222222222222222222222222222222222222222222;
                    i36 = i32;
                    i39 = i48222222222222222222222222222222222222222222;
                case 955870050:
                case 1842159580:
                    return EnumC4045.f12834;
                case 973187411:
                case 1196661950:
                    i8 = i39;
                    i = i40;
                    if (z3) {
                        m25664 = C2105.m6981("ܽ۬") ^ i34;
                        i32 = ((m25664 ^ i35) * (-20695)) ^ (-1010789744);
                        i33 = -1104235552;
                    } else {
                        m25664 = (C2105.m6981("ۚ۟") ^ i35) * (-83);
                        i32 = ((m25664 ^ i34) * 32151) ^ 123949888;
                        i33 = 237901844;
                    }
                    int i472222222222222222222222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i482222222222222222222222222222222222222222222 = i8;
                    i37 = i472222222222222222222222222222222222222222222;
                    i36 = i32;
                    i39 = i482222222222222222222222222222222222222222222;
                case 1074769686:
                case 1702630580:
                    i8 = i39;
                    i = i40;
                    z3 = true;
                    m25664 = C2105.m6981("۫ܺ") ^ i34;
                    i32 = ((m25664 ^ i35) * 3765) ^ (-1779483587);
                    i33 = 772842685;
                    int i4722222222222222222222222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i4822222222222222222222222222222222222222222222 = i8;
                    i37 = i4722222222222222222222222222222222222222222222;
                    i36 = i32;
                    i39 = i4822222222222222222222222222222222222222222222;
                case 1165451455:
                case 1224798307:
                    i = i40;
                    b = b12;
                    b2 = b13;
                    i2 = i46;
                    i3 = i44;
                    bArr = bArr7;
                    th = th4;
                    i4 = i38;
                    C2167.m7154(th, obj);
                    i16 = i3;
                    m2566 = C0630.m2566("ۗۛ") ^ i34;
                    i17 = ((m2566 ^ i35) * 6323) ^ 287528165;
                    i18 = -1189632627;
                    int i49222 = m2566 ^ i18;
                    b13 = b2;
                    i38 = i4;
                    th4 = th;
                    bArr7 = bArr;
                    i44 = i16;
                    i37 = i49222;
                    i36 = i17;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case 1169796789:
                case 1619832353:
                    i = i40;
                    b = b12;
                    b5 = b13;
                    i2 = i46;
                    i19 = i44;
                    z2 = false;
                    bArr3 = bArr7;
                    th3 = th4;
                    i20 = i38;
                    m69813 = C2105.m6981("۠ܳ") ^ i35;
                    i21 = ((m69813 ^ i34) * (-28383)) ^ (-1121523449);
                    i22 = -1805173745;
                    i37 = m69813 ^ i22;
                    i36 = i21;
                    b13 = b5;
                    i38 = i20;
                    th4 = th3;
                    bArr7 = bArr3;
                    i44 = i19;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case 1182364361:
                case 1795861661:
                    i = i40;
                    i16 = i44;
                    b = b12;
                    b2 = b13;
                    i2 = i46;
                    bArr = bArr7;
                    th = th4;
                    i4 = i38;
                    inputStream3 = C3245.m9930(abstractC15440);
                    i43 = 12;
                    m2566 = C0630.m2566("ۙ᩺") ^ i34;
                    i17 = ((m2566 ^ i35) * (-7181)) ^ (-1888188647);
                    i18 = 347384890;
                    int i492222 = m2566 ^ i18;
                    b13 = b2;
                    i38 = i4;
                    th4 = th;
                    bArr7 = bArr;
                    i44 = i16;
                    i37 = i492222;
                    i36 = i17;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case 1203980992:
                case 1936623093:
                    i = i40;
                    b = b12;
                    b3 = b13;
                    i2 = i46;
                    z5 = false;
                    m6981 = (C2105.m6981("᩻᩶") ^ i35) * 75;
                    i6 = ((m6981 ^ i34) * (-30303)) ^ (-1469095960);
                    i7 = -534210484;
                    i37 = m6981 ^ i7;
                    i36 = i6;
                    b13 = b3;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
                case 1352365391:
                case 1812215792:
                    i8 = i39;
                    i = i40;
                    if (!C1128.m3850(str, C3019.m9250(f63246, 18, 7, i41))) {
                        m25664 = C2105.m6981("֫᩵") ^ i34;
                        i32 = ((m25664 ^ i35) * 7471) ^ (-1316149256);
                        i33 = -987778676;
                        int i47222222222222222222222222222222222222222222222 = m25664 ^ i33;
                        i40 = i;
                        int i48222222222222222222222222222222222222222222222 = i8;
                        i37 = i47222222222222222222222222222222222222222222222;
                        i36 = i32;
                        i39 = i48222222222222222222222222222222222222222222222;
                    }
                    m25664 = (C0630.m2566("ܰᩴ") + i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i32 = ((m25664 ^ i35) * 24517) ^ 574245079;
                    i33 = 1411003477;
                    int i472222222222222222222222222222222222222222222222 = m25664 ^ i33;
                    i40 = i;
                    int i482222222222222222222222222222222222222222222222 = i8;
                    i37 = i472222222222222222222222222222222222222222222222;
                    i36 = i32;
                    i39 = i482222222222222222222222222222222222222222222222;
                default:
                    i = i40;
                    b = b12;
                    b5 = b13;
                    i2 = i46;
                    i19 = i44;
                    bArr3 = bArr7;
                    th3 = th4;
                    i20 = i38;
                    if (i19 != 67324752) {
                        m69813 = C0630.m2566("ܶܰ") ^ i34;
                        i21 = ((m69813 ^ i35) * 25231) ^ (-1704697262);
                        i22 = 1910036258;
                        i37 = m69813 ^ i22;
                        i36 = i21;
                        b13 = b5;
                        i38 = i20;
                        th4 = th3;
                        bArr7 = bArr3;
                        i44 = i19;
                        i46 = i2;
                        b12 = b;
                        i40 = i;
                    }
                    m69813 = (C2105.m6981("ܳᩴ") ^ i35) * (-111);
                    i21 = ((m69813 ^ i34) * 26011) ^ 2010438919;
                    i22 = -1811829499;
                    i37 = m69813 ^ i22;
                    i36 = i21;
                    b13 = b5;
                    i38 = i20;
                    th4 = th3;
                    bArr7 = bArr3;
                    i44 = i19;
                    i46 = i2;
                    b12 = b;
                    i40 = i;
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m45017(C16560 c16560, InterfaceC17889 interfaceC17889) {
        int i = 1223724383;
        int i2 = C4263.f13799;
        int i3 = C0714.f2697;
        int m6981 = C2105.m6981("ᩴۧ") ^ i2;
        int i4 = ((m6981 ^ i3) * (-6495)) ^ (-871312266);
        int i5 = 1248799147;
        while (true) {
            i = ((((i ^ i3) * (-28999)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2106908987:
                case -267272881:
                    C0964.m3413();
                    m6981 = C2105.m6981("ۢܶ") ^ i3;
                    i4 = ((m6981 ^ i2) * 1497) ^ 151838129;
                    i5 = -849280380;
                case -1946811182:
                case -356723654:
                    C2167.m7155();
                    if (C0483.f2088 >= 0) {
                        m6981 = C2105.m6981("ۢܶ") ^ i3;
                        i4 = ((m6981 ^ i2) * 1497) ^ 151838129;
                        i5 = -849280380;
                    } else {
                        m6981 = C0630.m2566("᩷ܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    }
                case -1914677924:
                case -1085210165:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C0630.m2566("᩷ܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    } else {
                        m6981 = C0630.m2566("ۚܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * 9447) ^ 1429062527;
                        i5 = -1062572316;
                    }
                case -1603525321:
                case 1692337146:
                    ServiceConnectionC3453.m10564();
                    if (C3019.f9544 < 0) {
                        m6981 = C0630.m2566("᩷ܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    } else {
                        m6981 = (i3 - C2105.m6981("۫۟")) * (-99);
                        i4 = ((m6981 ^ i2) * 29557) ^ 1392327481;
                        i5 = 486713983;
                    }
                case -1148210303:
                case 1733304657:
                    C11340.m28031();
                    if (C21923.f70183 == 0) {
                        m6981 = C0630.m2566("᩷ܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    } else {
                        m6981 = (i3 - C0630.m2566("۫֫")) * q.h;
                        i4 = ((m6981 ^ i2) * (-25979)) ^ (-970856344);
                        i5 = 418072435;
                    }
                case -1087164913:
                case -48312606:
                    if (C3746.f11829 <= 0) {
                        m6981 = (i3 - C2105.m6981("۫۟")) * (-99);
                        i4 = ((m6981 ^ i2) * 29557) ^ 1392327481;
                        i5 = 486713983;
                    } else {
                        m6981 = C2105.m6981("ۤۢ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-32207)) ^ 1554529281;
                        i5 = -18484487;
                    }
                case -1003622348:
                case 1457375652:
                    if (C1047.f3863 >= 0) {
                        m6981 = C2105.m6981("ۢܶ") ^ i3;
                        i4 = ((m6981 ^ i2) * 1497) ^ 151838129;
                        i5 = -849280380;
                    } else {
                        m6981 = C2105.m6981("ܳᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-18785)) ^ (-988532912);
                        i5 = -113423725;
                    }
                case -784799872:
                case 2117089904:
                    if (C0798.f2919) {
                        m6981 = C2105.m6981("ۢܶ") ^ i3;
                        i4 = ((m6981 ^ i2) * 1497) ^ 151838129;
                        i5 = -849280380;
                    } else {
                        m6981 = C0630.m2566("ۨۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * 17311) ^ (-1792065707);
                        i5 = 514539266;
                    }
                case -547694392:
                case 711840668:
                    if (C2958.f9394 >= 0) {
                        m6981 = (i3 - C2105.m6981("۫۟")) * (-99);
                        i4 = ((m6981 ^ i2) * 29557) ^ 1392327481;
                        i5 = 486713983;
                    } else {
                        m6981 = C0630.m2566("᩺᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * (-26657)) ^ 1674417775;
                        i5 = -1178651831;
                    }
                case -502535232:
                case 1890202778:
                    if (C3911.m11924() <= 0) {
                        m6981 = (i3 - C2105.m6981("۫۟")) * (-99);
                        i4 = ((m6981 ^ i2) * 29557) ^ 1392327481;
                        i5 = 486713983;
                    } else {
                        m6981 = (C2105.m6981("ۖۘ") + i3) * (-57);
                        i4 = ((m6981 ^ i2) * 32565) ^ 1930124849;
                        i5 = 2053089733;
                    }
                case -185164689:
                case 359704650:
                    if (C3245.f10203 > 0) {
                        C4263.m12821(new C20979(c16560, interfaceC17889));
                        break;
                    }
                    m6981 = (C0630.m2566("۬֨") + i2) * (-109);
                    i4 = ((m6981 ^ i3) * 9189) ^ (-583799611);
                    i5 = -751528643;
                case 507838746:
                case 1295985158:
                    if (C22628.m50615() != 0) {
                        m6981 = C0630.m2566("᩷ܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-29119)) ^ 1748636889;
                        i5 = -1001476159;
                    } else {
                        m6981 = C0630.m2566("ܿܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-5829)) ^ (-2004824903);
                        i5 = 1652623186;
                    }
                case 720882393:
                case 1979336822:
                    if (C2958.f9394 >= 0) {
                        m6981 = (C0630.m2566("۬֨") + i2) * (-109);
                        i4 = ((m6981 ^ i3) * 9189) ^ (-583799611);
                        i5 = -751528643;
                    } else {
                        m6981 = (C2105.m6981("۫ۗ") ^ i3) * 83;
                        i4 = ((m6981 ^ i2) * (-7231)) ^ 1415204023;
                        i5 = 1860351301;
                    }
                case 1127138317:
                case 1421237701:
                    C5695.m16023();
                    break;
                default:
                    if (C1005.f3721) {
                        m6981 = (C0630.m2566("۫ܿ") ^ i2) * 61;
                        i4 = ((m6981 ^ i3) * (-19637)) ^ (-1359461706);
                        i5 = -988453085;
                    } else {
                        m6981 = (i3 - C0630.m2566("۫֫")) * q.h;
                        i4 = ((m6981 ^ i2) * (-25979)) ^ (-970856344);
                        i5 = 418072435;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45005(C16560 c16560, AbstractC15440 abstractC15440) {
        InputStream inputStream = null;
        int i = 0;
        Exception e = null;
        Main main = null;
        Object obj = null;
        Throwable th = null;
        Object th2 = null;
        int i2 = 332141937;
        int i3 = C0422.f1886;
        int i4 = C3432.f10845;
        int m2566 = (i3 - C0630.m2566("᩻ۧ")) * (-19);
        int i5 = ((m2566 ^ i4) * (-28039)) ^ 486539783;
        int i6 = -1594065136;
        while (true) {
            i2 = ((((i2 ^ i4) * 6703) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -2144937695:
                case 361729497:
                    C2126.m7040();
                    C0237.m1481();
                    return;
                case -2051333409:
                case 891073128:
                    if (C2105.f7037 != 0) {
                        m2566 = (C0630.m2566("ۗۢ") ^ i4) * (-127);
                        i5 = ((m2566 ^ i3) * 3659) ^ (-1680016829);
                        i6 = -1963535325;
                    } else {
                        m2566 = C2105.m6981("᩸ܽ") ^ i4;
                        i5 = ((m2566 ^ i3) * 9483) ^ 1221208709;
                        i6 = 1592777163;
                    }
                case -2042951679:
                case -1158389001:
                    inputStream = C3245.m9930(abstractC15440);
                    m2566 = C0630.m2566("ᩳ۠") ^ i4;
                    i5 = ((m2566 ^ i3) * 383) ^ (-1567185153);
                    i6 = 1530168380;
                case -2022138614:
                case 632507508:
                    try {
                        C0714.m2815(th, th2);
                        m2566 = C2105.m6981("᩶ۖ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-18483)) ^ (-2076987664);
                        i6 = 193427069;
                    } catch (Exception e2) {
                        e = e2;
                        m2566 = C0630.m2566("ܰۖ") ^ i3;
                        i5 = ((m2566 ^ i4) * 3017) ^ 304390900;
                        i6 = 20011736;
                    }
                case -1936169033:
                case 1891375613:
                    if (C11340.f33930 < 0) {
                        m2566 = C0630.m2566("ۘۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 3589) ^ (-150831825);
                        i6 = 892492043;
                    } else {
                        m2566 = C0630.m2566("ܰۨ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-2177)) ^ (-1829629188);
                        i6 = 661251301;
                    }
                case -1808670016:
                case 806681503:
                    C7811.m20844();
                    if (C2958.f9394 >= 0) {
                        m2566 = C0630.m2566("ۜۤ") ^ i3;
                        i5 = ((m2566 ^ i4) * 389) ^ (-1719648785);
                        i6 = -1804337346;
                    } else {
                        m2566 = (C2105.m6981("ܽۨ") ^ i4) * 109;
                        i5 = ((m2566 ^ i3) * 17881) ^ 259060562;
                        i6 = -1555777332;
                    }
                case -1776458548:
                case 433781887:
                    main = C21923.m49336(c16560);
                    obj = null;
                    if (C2272.f7362) {
                        m2566 = (C0630.m2566("֫ۛ") + i3) * 49;
                        i5 = ((m2566 ^ i4) * (-8913)) ^ 866022086;
                        i6 = -2098807603;
                    } else {
                        m2566 = C2105.m6981("᩹ۖ") ^ i4;
                        i5 = ((m2566 ^ i3) * 24433) ^ (-390052198);
                        i6 = -560929088;
                    }
                case -1744843152:
                case -1118099285:
                    if (C1294.f4556 >= 0) {
                        m2566 = C0630.m2566("ۘۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 3589) ^ (-150831825);
                        i6 = 892492043;
                    } else {
                        m2566 = C0630.m2566("ۜۤ") ^ i3;
                        i5 = ((m2566 ^ i4) * 389) ^ (-1719648785);
                        i6 = -1804337346;
                    }
                case -1665272177:
                case -1164931349:
                    C1504.m5179();
                    if (C4159.f13567) {
                        m2566 = (C0630.m2566("ۗۢ") ^ i4) * (-127);
                        i5 = ((m2566 ^ i3) * 3659) ^ (-1680016829);
                        i6 = -1963535325;
                    } else {
                        m2566 = (C2105.m6981("ܳۢ") ^ i4) * 31;
                        i5 = ((m2566 ^ i3) * 24807) ^ 985416915;
                        i6 = 1356451602;
                    }
                case -1608158112:
                case -387858827:
                    if (C2958.f9394 < 0) {
                        m2566 = C0630.m2566("ۘۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 3589) ^ (-150831825);
                        i6 = 892492043;
                    } else {
                        m2566 = C2105.m6981("ܽۘ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-12787)) ^ 793866917;
                        i6 = 682732595;
                    }
                case -1329196395:
                case 835707788:
                    if (C1294.f4556 >= 0) {
                        m2566 = (C0630.m2566("ۗ᩻") + i4) * 49;
                        i5 = ((m2566 ^ i3) * (-19653)) ^ 1356856080;
                        i6 = 1551981203;
                    } else {
                        m2566 = C2105.m6981("۬ܳ") ^ i3;
                        i5 = ((m2566 ^ i4) * 8207) ^ (-1855425551);
                        i6 = 408177307;
                    }
                case -1285365432:
                case 1852803371:
                    if (inputStream != null) {
                        m2566 = (C0630.m2566("ۚۘ") + i4) * 11;
                        i5 = ((m2566 ^ i3) * (-3933)) ^ 1834122816;
                        i6 = 6280211;
                    } else {
                        m2566 = C2105.m6981("ۘۖ") ^ i3;
                        i5 = ((m2566 ^ i4) * 6557) ^ 1915215903;
                        i6 = -778015542;
                    }
                case -1179041832:
                case 515952231:
                    C4075.m12246(main, e, obj);
                    return;
                case -1150419106:
                case 12571741:
                    if (C3245.m9925() != 0) {
                        m2566 = (C0630.m2566("ۗ᩻") + i4) * 49;
                        i5 = ((m2566 ^ i3) * (-19653)) ^ 1356856080;
                        i6 = 1551981203;
                    } else {
                        m2566 = C0630.m2566("᩶ܿ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-18891)) ^ (-2053189217);
                        i6 = -1411928378;
                    }
                case -947309304:
                case -69421246:
                    if (RunnableC1937.m6387() != 0) {
                        m2566 = (C2105.m6981("ܽۨ") ^ i4) * 109;
                        i5 = ((m2566 ^ i3) * 17881) ^ 259060562;
                        i6 = -1555777332;
                    } else {
                        m2566 = (i3 - C0630.m2566("ۤۡ")) * (-53);
                        i5 = ((m2566 ^ i4) * (-16969)) ^ 1590468075;
                        i6 = 1388569715;
                    }
                case -944340367:
                case 1981387320:
                    RunnableC1108.m3785(inputStream);
                    m2566 = C2105.m6981("ۘۖ") ^ i3;
                    i5 = ((m2566 ^ i4) * 6557) ^ 1915215903;
                    i6 = -778015542;
                case -920316602:
                case 811206665:
                    if (C1711.m5736() <= 0) {
                        m2566 = C0630.m2566("ۜۤ") ^ i3;
                        i5 = ((m2566 ^ i4) * 389) ^ (-1719648785);
                        i6 = -1804337346;
                    } else {
                        m2566 = (C2105.m6981("ܳۢ") ^ i4) * 31;
                        i5 = ((m2566 ^ i3) * 24807) ^ 985416915;
                        i6 = 1356451602;
                    }
                case -917768907:
                case 344812017:
                    return;
                case -888537023:
                case -833700004:
                    if (C0050.f910 >= 0) {
                        m2566 = (C0630.m2566("֫ۛ") + i3) * 49;
                        i5 = ((m2566 ^ i4) * (-8913)) ^ 866022086;
                        i6 = -2098807603;
                    } else {
                        m2566 = C2105.m6981("ۛ۠") ^ i4;
                        i5 = ((m2566 ^ i3) * (-10161)) ^ (-2118299287);
                        i6 = -21652794;
                    }
                case -683030497:
                case -554864118:
                    try {
                        RunnableC1108.m3785(inputStream);
                        m2566 = C2105.m6981("᩶ۖ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-18483)) ^ (-2076987664);
                        i6 = 193427069;
                    } catch (Throwable th3) {
                        th2 = th3;
                        m2566 = (C0630.m2566("ۧۖ") + i3) * (-15);
                        i5 = ((m2566 ^ i4) * 743) ^ 748171190;
                        i6 = -1348899164;
                    }
                case -568327141:
                case 1804043925:
                    if (RunnableC1108.m3790()) {
                        m2566 = C0630.m2566("ۜۤ") ^ i3;
                        i5 = ((m2566 ^ i4) * 389) ^ (-1719648785);
                        i6 = -1804337346;
                    } else {
                        m2566 = (C0630.m2566("۬ۢ") + i3) * (-11);
                        i5 = ((m2566 ^ i4) * (-26665)) ^ (-848510624);
                        i6 = 651205282;
                    }
                case -478772191:
                case 1218620106:
                    if (C2105.f7037 != 0) {
                        m2566 = C2105.m6981("ܽۘ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-12787)) ^ 793866917;
                        i6 = 682732595;
                    } else {
                        m2566 = (C2105.m6981("᩶۟") ^ i4) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i5 = ((m2566 ^ i3) * (-4109)) ^ 183996824;
                        i6 = 468620655;
                    }
                case -474576986:
                case 2142043834:
                    if (inputStream != null) {
                        m2566 = C2105.m6981("᩻᩶") ^ i4;
                        i5 = ((m2566 ^ i3) * (-2649)) ^ (-1367367861);
                        i6 = 1811572345;
                    } else {
                        m2566 = C2105.m6981("᩶ۖ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-18483)) ^ (-2076987664);
                        i6 = 193427069;
                    }
                case -299637287:
                case 9269306:
                    i = IShizukuService.Stub.TRANSACTION_isHidden;
                    m2566 = (C0630.m2566("֨۬") ^ i4) * 17;
                    i5 = ((m2566 ^ i3) * 1071) ^ 59633190;
                    i6 = -163919120;
                case -262598948:
                case 1324967353:
                    try {
                        byte[] bArr = new byte[i];
                        C22194.m49857(inputStream, bArr, i);
                        m45003((AbstractActivityC3346) C22628.m50612(c16560), bArr);
                        m2566 = (C0630.m2566("ܳܺ") + i4) * 101;
                        i5 = ((m2566 ^ i3) * 8411) ^ (-1584747315);
                        i6 = 520967232;
                    } catch (Throwable th4) {
                        th = th4;
                        m2566 = (C0630.m2566("۫۫") + i3) * 85;
                        i5 = ((m2566 ^ i4) * (-4717)) ^ (-716074053);
                        i6 = -1513076845;
                    }
                case -174963841:
                case -173141008:
                    if (RunnableC3474.f10992 > 0) {
                        m2566 = (C0630.m2566("ۗۢ") ^ i4) * (-127);
                        i5 = ((m2566 ^ i3) * 3659) ^ (-1680016829);
                        i6 = -1963535325;
                    } else {
                        m2566 = (C0630.m2566("֫ۛ") + i3) * 49;
                        i5 = ((m2566 ^ i4) * (-8913)) ^ 866022086;
                        i6 = -2098807603;
                    }
                case -71901799:
                case 326045276:
                    throw th;
                    break;
                case -10165937:
                case 1065501276:
                    RunnableC1108.m3790();
                    C2126.m7040();
                    m2566 = C0630.m2566("ۘۚ") ^ i4;
                    i5 = ((m2566 ^ i3) * 3589) ^ (-150831825);
                    i6 = 892492043;
                case 1204582412:
                case 2146470413:
                    if (C1294.m4372() <= 0) {
                        m2566 = C0630.m2566("ܰۨ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-2177)) ^ (-1829629188);
                        i6 = 661251301;
                    } else {
                        m2566 = C0630.m2566("ܺ᩹") ^ i3;
                        i5 = ((m2566 ^ i4) * 18309) ^ (-107779599);
                        i6 = -1931846722;
                    }
                case 1268849291:
                case 1903505302:
                    if (C3245.f10203 <= 0) {
                        m2566 = C0630.m2566("ܰۨ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-2177)) ^ (-1829629188);
                        i6 = 661251301;
                    } else {
                        m2566 = (C2105.m6981("ۘ᩷") ^ i3) * 93;
                        i5 = ((m2566 ^ i4) * (-32217)) ^ (-1490491383);
                        i6 = 1161607340;
                    }
                default:
                    if (C2167.f7158 >= 0) {
                        m2566 = C2105.m6981("ܽۘ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-12787)) ^ 793866917;
                        i6 = 682732595;
                    } else {
                        m2566 = C0630.m2566("ܽܽ") ^ i3;
                        i5 = ((m2566 ^ i4) * 31499) ^ (-120636166);
                        i6 = 690243373;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (l.C2272.f7362 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006e, code lost:
    
        if (l.C4616.f14690 > 0) goto L58;
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m45019(l.C16560 r24, l.InterfaceC17889 r25) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19568.m45019(l.ܽۢܳ, l.ᩳۜܳ):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v65, types: [android.view.View] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m45013(final C16560 c16560, final InterfaceC17889 interfaceC17889, final Class cls) {
        int i;
        C19258 c19258;
        InterfaceC17889 interfaceC178892;
        Main main;
        ListView listView;
        short[] sArr;
        View view;
        int i2;
        int m6981;
        int i3;
        int i4;
        int i5;
        int i6;
        View view2;
        int i7;
        short[] sArr2;
        int m2566;
        int i8;
        int i9;
        InterfaceC17889 interfaceC178893;
        String str;
        int m69812;
        int i10;
        int i11;
        int m25662;
        int i12;
        int i13;
        int i14;
        short[] sArr3;
        View view3;
        int i15;
        String[] strArr;
        ListView listView2;
        short[] sArr4;
        View view4;
        Main main2;
        int i16;
        int i17;
        ListView listView3;
        Main main3;
        View m10739;
        int i18;
        int i19;
        int m25663;
        int i20;
        int i21;
        C10211 c10211 = null;
        int i22 = 0;
        String str2 = null;
        int i23 = 0;
        int i24 = 1385341986;
        int i25 = C0422.f1886;
        int i26 = C3019.f9544;
        int m69813 = C2105.m6981("᩹ۖ") ^ i26;
        int i27 = ((m69813 ^ i25) * 1369) ^ 255322710;
        int i28 = m69813 ^ (-1772766200);
        String str3 = null;
        Iterator it = null;
        InterfaceC17889 interfaceC178894 = null;
        boolean[] zArr = null;
        Main main4 = null;
        View view5 = null;
        C19258 c192582 = null;
        short[] sArr5 = null;
        String str4 = null;
        int i29 = 0;
        int i30 = 0;
        boolean z = false;
        int i31 = 0;
        int i32 = 0;
        short s = 0;
        final ArrayList arrayList = null;
        String[] strArr2 = null;
        ListView listView4 = null;
        TextView textView = null;
        C20438 c20438 = null;
        int i33 = 0;
        boolean z2 = false;
        DialogInterface.OnClickListener onClickListener = null;
        while (true) {
            i24 = i28 ^ (i27 & (((i24 ^ i25) * 24661) >> 31));
            switch (i24) {
                case -2096103672:
                case 1861623924:
                    i6 = i33;
                    view2 = view5;
                    i7 = i29;
                    sArr2 = sArr5;
                    listView4 = (ListView) C11340.m28028(view2, C2105.m6981(RunnableC0588.m2436(sArr2, 493, 3, i32)) ^ 2120952642);
                    C4915.m14284(listView4);
                    if (!C2272.f7362) {
                        m2566 = (i26 - C0630.m2566("᩵ۨ")) * 9;
                        i8 = ((m2566 ^ i25) * 31437) ^ 1308782270;
                        i9 = -444497686;
                        sArr5 = sArr2;
                        i11 = i6;
                        i28 = m2566 ^ i9;
                        i27 = i8;
                        i29 = i7;
                        view5 = view2;
                        i33 = i11;
                    }
                    m2566 = (C2105.m6981("ۜۧ") + i25) * (-59);
                    i8 = ((m2566 ^ i26) * 9173) ^ 860536296;
                    i9 = -207679166;
                    sArr5 = sArr2;
                    i11 = i6;
                    i28 = m2566 ^ i9;
                    i27 = i8;
                    i29 = i7;
                    view5 = view2;
                    i33 = i11;
                case -2050348788:
                case -1652908925:
                    String str5 = str4;
                    i = i33;
                    c19258 = c192582;
                    main = main4;
                    listView = listView4;
                    sArr = sArr5;
                    view = view5;
                    i2 = i29;
                    InterfaceC17889 interfaceC178895 = (InterfaceC17889) C2272.m7513(it);
                    if (interfaceC178895.mo36969()) {
                        int m25664 = (i25 - C0630.m2566("᩵ۜ")) * 51;
                        int i34 = ((m25664 ^ i26) * 18823) ^ (-665587032);
                        sArr5 = sArr;
                        i29 = i2;
                        view5 = view;
                        i33 = i;
                        i28 = m25664 ^ 464492915;
                        str4 = str5;
                        listView4 = listView;
                        main4 = main;
                        interfaceC178894 = interfaceC178895;
                        i27 = i34;
                        c192582 = c19258;
                    } else {
                        str4 = str5;
                        interfaceC178894 = interfaceC178895;
                        int m25665 = C0630.m2566("ܶۤ") ^ i26;
                        sArr5 = sArr;
                        i29 = i2;
                        view5 = view;
                        i33 = i;
                        i28 = m25665 ^ (-1558780401);
                        i27 = ((m25665 ^ i25) * 7107) ^ (-489025746);
                        listView4 = listView;
                        c192582 = c19258;
                        main4 = main;
                    }
                case -2014436876:
                case -1933138701:
                    i = i33;
                    c19258 = c192582;
                    interfaceC178893 = interfaceC178894;
                    main = main4;
                    listView = listView4;
                    sArr = sArr5;
                    str = str4;
                    view = view5;
                    i2 = i29;
                    i32 = 10494;
                    m25662 = (i26 - C2105.m6981("۬ۤ")) * (-27);
                    i12 = ((m25662 ^ i25) * 17795) ^ (-1733206921);
                    i13 = -1584827727;
                    i21 = m25662 ^ i13;
                    sArr5 = sArr;
                    i29 = i2;
                    view5 = view;
                    i33 = i;
                    i28 = i21;
                    i27 = i12;
                    str4 = str;
                    listView4 = listView;
                    main4 = main;
                    interfaceC178894 = interfaceC178893;
                    c192582 = c19258;
                case -2008954070:
                case -185128012:
                    i31++;
                    i14 = i33;
                    c19258 = c192582;
                    interfaceC178893 = interfaceC178894;
                    main = main4;
                    listView = listView4;
                    sArr3 = sArr5;
                    str = str4;
                    strArr = strArr2;
                    view3 = view5;
                    i15 = i29;
                    int m25666 = C0630.m2566("ᩴ۫") ^ i26;
                    i29 = i15;
                    view5 = view3;
                    i33 = i14;
                    strArr2 = strArr;
                    i28 = m25666 ^ 83637682;
                    i27 = ((m25666 ^ i25) * 6419) ^ (-178222967);
                    sArr5 = sArr3;
                    str4 = str;
                    listView4 = listView;
                    main4 = main;
                    interfaceC178894 = interfaceC178893;
                    c192582 = c19258;
                case -1887300965:
                case 902128269:
                    i = i33;
                    c19258 = c192582;
                    interfaceC178893 = interfaceC178894;
                    main = main4;
                    listView = listView4;
                    sArr = sArr5;
                    str = str4;
                    view = view5;
                    i2 = i29;
                    if (C3537.m10754(arrayList)) {
                        m25662 = (C0630.m2566("ᩳۖ") ^ i26) * (-35);
                        i12 = ((m25662 ^ i25) * (-4547)) ^ 195563319;
                        i13 = -298477983;
                    } else {
                        m25662 = (C2105.m6981("֡᩷") + i26) * 59;
                        i12 = ((m25662 ^ i25) * (-30479)) ^ 1840533107;
                        i13 = 1895601039;
                    }
                    i21 = m25662 ^ i13;
                    sArr5 = sArr;
                    i29 = i2;
                    view5 = view;
                    i33 = i;
                    i28 = i21;
                    i27 = i12;
                    str4 = str;
                    listView4 = listView;
                    main4 = main;
                    interfaceC178894 = interfaceC178893;
                    c192582 = c19258;
                case -1810477842:
                case 1252122672:
                    strArr2[i31] = C11340.m28015(strArr2[i31], z ? 1 : 0, i30);
                    m25663 = C2105.m6981("᩷᩷") ^ i25;
                    i18 = ((m25663 ^ i26) * 14291) ^ (-343209562);
                    i20 = 846998275;
                    i28 = m25663 ^ i20;
                    i27 = i18;
                case -1728565483:
                case 1367653865:
                    i = i33;
                    c19258 = c192582;
                    main = main4;
                    listView = listView4;
                    sArr = sArr5;
                    view = view5;
                    i2 = i29;
                    String name = interfaceC17889.getName();
                    String parent = interfaceC17889.getParent();
                    arrayList = new ArrayList();
                    it = C1047.m3596(c16560.m39028());
                    str3 = parent;
                    str4 = name;
                    int m256652 = C0630.m2566("ܶۤ") ^ i26;
                    sArr5 = sArr;
                    i29 = i2;
                    view5 = view;
                    i33 = i;
                    i28 = m256652 ^ (-1558780401);
                    i27 = ((m256652 ^ i25) * 7107) ^ (-489025746);
                    listView4 = listView;
                    c192582 = c19258;
                    main4 = main;
                case -1725819301:
                case -845328463:
                    i = i33;
                    C1047.m3601(textView, C0382.m1840(f63246, 499, 8, i32));
                    Main m50612 = C22628.m50612(c16560);
                    if (C7811.f24123 >= 0) {
                        int m69814 = (C2105.m6981("ܰۧ") + i26) * 37;
                        i3 = ((m69814 ^ i25) * (-7799)) ^ 1975967972;
                        i5 = m69814 ^ (-1822412362);
                        c20438 = null;
                        i11 = i;
                        i28 = i5;
                        i27 = i3;
                        i33 = i11;
                    } else {
                        c20438 = new C20438(m50612, zArr, strArr2);
                        ListView listView5 = listView4;
                        listView5.setAdapter((ListAdapter) c20438);
                        listView5.setOnItemClickListener(c20438);
                        C19258 m2130 = C0483.m2130(C22628.m50612(c16560));
                        View view6 = view5;
                        C0798.m3013(m2130, view6);
                        i2 = i29;
                        String m9031 = C2958.m9031(f63246, 507, 3, i32);
                        if (C3746.f11829 <= 0) {
                            view = view6;
                            c19258 = m2130;
                            main = main4;
                            sArr = sArr5;
                            listView = listView5;
                            str2 = m9031;
                            interfaceC178893 = interfaceC178894;
                            str = str4;
                            m25662 = (C2105.m6981("ܺ᩻") ^ i26) * (-77);
                            i12 = ((m25662 ^ i25) * (-7623)) ^ (-2064482112);
                            i13 = -1752707084;
                            i21 = m25662 ^ i13;
                            sArr5 = sArr;
                            i29 = i2;
                            view5 = view;
                            i33 = i;
                            i28 = i21;
                            i27 = i12;
                            str4 = str;
                            listView4 = listView;
                            main4 = main;
                            interfaceC178894 = interfaceC178893;
                            c192582 = c19258;
                        } else {
                            int m69815 = C2105.m6981("᩵ۗ") ^ i25;
                            listView4 = listView5;
                            i27 = ((m69815 ^ i26) * (-8871)) ^ (-1249189303);
                            view5 = view6;
                            i33 = i;
                            i28 = m69815 ^ (-2095090288);
                            i29 = i2;
                            str2 = m9031;
                            c192582 = m2130;
                        }
                    }
                case -1678307949:
                case 81595297:
                    ViewOnClickListenerC1958.m6441(c192582, C0630.m2566(str2) ^ 2102742746, onClickListener);
                    i = i33;
                    i23 = C2105.m6981(C1504.m5177(f63246, 510, 3, i32));
                    if (!C21923.m49329()) {
                        m69812 = (C2105.m6981("ۤۡ") + i25) * 59;
                        i3 = ((m69812 ^ i26) * 5233) ^ 222233652;
                        i10 = 2006378852;
                        i5 = m69812 ^ i10;
                        i11 = i;
                        i28 = i5;
                        i27 = i3;
                        i33 = i11;
                    }
                    m69812 = (C0630.m2566("ۖܺ") + i26) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i3 = ((m69812 ^ i25) * 20481) ^ 285335824;
                    i10 = 492796346;
                    i5 = m69812 ^ i10;
                    i11 = i;
                    i28 = i5;
                    i27 = i3;
                    i33 = i11;
                case -1538083795:
                case -1265268595:
                    i = i33;
                    c19258 = c192582;
                    interfaceC178893 = interfaceC178894;
                    main = main4;
                    listView = listView4;
                    sArr = sArr5;
                    str = str4;
                    view = view5;
                    i2 = i29;
                    z = false;
                    z = false;
                    z2 = true;
                    if (C0382.m1847(arrayList) == 1) {
                        m25662 = C0630.m2566("ۛ᩷") ^ i26;
                        i12 = ((m25662 ^ i25) * 6299) ^ 1804681677;
                        i13 = 893118723;
                    } else {
                        m25662 = (i25 - C0630.m2566("᩺᩸")) * 17;
                        i12 = ((m25662 ^ i26) * (-11069)) ^ 161628660;
                        i13 = 61045791;
                    }
                    i21 = m25662 ^ i13;
                    sArr5 = sArr;
                    i29 = i2;
                    view5 = view;
                    i33 = i;
                    i28 = i21;
                    i27 = i12;
                    str4 = str;
                    listView4 = listView;
                    main4 = main;
                    interfaceC178894 = interfaceC178893;
                    c192582 = c19258;
                case -1530637332:
                case 2107761233:
                    i14 = i33;
                    c19258 = c192582;
                    interfaceC178893 = interfaceC178894;
                    main = main4;
                    listView = listView4;
                    sArr3 = sArr5;
                    str = str4;
                    view3 = view5;
                    i15 = i29;
                    int m1847 = C0382.m1847(arrayList);
                    strArr = new String[m1847];
                    zArr = new boolean[m1847];
                    i31 = 0;
                    int m256662 = C0630.m2566("ᩴ۫") ^ i26;
                    i29 = i15;
                    view5 = view3;
                    i33 = i14;
                    strArr2 = strArr;
                    i28 = m256662 ^ 83637682;
                    i27 = ((m256662 ^ i25) * 6419) ^ (-178222967);
                    sArr5 = sArr3;
                    str4 = str;
                    listView4 = listView;
                    main4 = main;
                    interfaceC178894 = interfaceC178893;
                    c192582 = c19258;
                case -1350143984:
                case 756401219:
                    i16 = i33;
                    i17 = i29;
                    listView3 = listView4;
                    main3 = main4;
                    m10739 = C3537.m10739(main3, i22 ^ 2121158335);
                    sArr5 = f63246;
                    if (C3663.m11168() >= 0) {
                        int m25667 = (C0630.m2566("᩺۠") ^ i26) * (-113);
                        ListView listView6 = listView3;
                        i27 = ((m25667 ^ i25) * 24747) ^ (-1213640604);
                        i19 = m25667 ^ 2137045215;
                        listView4 = listView6;
                        main4 = main3;
                        i29 = i17;
                        view5 = m10739;
                        i33 = i16;
                        i28 = i19;
                    } else {
                        int m25668 = C0630.m2566("ۘܿ") ^ i25;
                        i18 = ((m25668 ^ i26) * 4939) ^ (-1309108338);
                        listView4 = listView3;
                        main4 = main3;
                        i29 = i17;
                        view5 = m10739;
                        i33 = i16;
                        i28 = m25668 ^ (-1679530130);
                        i27 = i18;
                    }
                case -1307843330:
                case 423597610:
                    C1916.m6308();
                    if (C2272.f7362) {
                        i = i33;
                        m69812 = (C0630.m2566("ۖܺ") + i26) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((m69812 ^ i25) * 20481) ^ 285335824;
                        i10 = 492796346;
                        i5 = m69812 ^ i10;
                        i11 = i;
                        i28 = i5;
                        i27 = i3;
                        i33 = i11;
                    } else {
                        main2 = main4;
                        listView2 = listView4;
                        sArr4 = sArr5;
                        view4 = view5;
                        int m69816 = (C2105.m6981("ۚ۠") ^ i25) * (-55);
                        Main main5 = main2;
                        i27 = ((m69816 ^ i26) * (-10281)) ^ (-847901806);
                        sArr5 = sArr4;
                        View view7 = view4;
                        listView4 = listView2;
                        main4 = main5;
                        i28 = m69816 ^ (-2036668366);
                        view5 = view7;
                    }
                case -1290887099:
                case 301435127:
                    if (C22628.f73083 <= 0) {
                        i16 = i33;
                        m10739 = view5;
                        listView3 = listView4;
                        i17 = i29;
                        main3 = main4;
                        int m256672 = (C0630.m2566("᩺۠") ^ i26) * (-113);
                        ListView listView62 = listView3;
                        i27 = ((m256672 ^ i25) * 24747) ^ (-1213640604);
                        i19 = m256672 ^ 2137045215;
                        listView4 = listView62;
                        main4 = main3;
                        i29 = i17;
                        view5 = m10739;
                        i33 = i16;
                        i28 = i19;
                    } else {
                        m25663 = (C0630.m2566("ۧ᩷") ^ i26) * 81;
                        i18 = ((m25663 ^ i25) * 6025) ^ 495768419;
                        i20 = -1023188927;
                        i28 = m25663 ^ i20;
                        i27 = i18;
                    }
                case -1194869018:
                case 1978481539:
                    i = i33;
                    sArr = sArr5;
                    View view8 = view5;
                    i2 = i29;
                    Main main6 = main4;
                    listView = listView4;
                    view = view8;
                    c19258 = c192582;
                    main = main6;
                    if (C3746.m11370(RunnableC1937.m6378(interfaceC178894.getName()), C1005.m3502(f63246, 486, 4, i32))) {
                        interfaceC178892 = interfaceC178894;
                        m6981 = C0630.m2566("ۗܶ") ^ i26;
                        i3 = ((m6981 ^ i25) * 337) ^ (-1872082927);
                        i4 = -1733167705;
                        i5 = m6981 ^ i4;
                        interfaceC178894 = interfaceC178892;
                        sArr5 = sArr;
                        i29 = i2;
                        view5 = view;
                        c192582 = c19258;
                        listView4 = listView;
                        main4 = main;
                        i11 = i;
                        i28 = i5;
                        i27 = i3;
                        i33 = i11;
                    } else {
                        int m2566522 = C0630.m2566("ܶۤ") ^ i26;
                        sArr5 = sArr;
                        i29 = i2;
                        view5 = view;
                        i33 = i;
                        i28 = m2566522 ^ (-1558780401);
                        i27 = ((m2566522 ^ i25) * 7107) ^ (-489025746);
                        listView4 = listView;
                        c192582 = c19258;
                        main4 = main;
                    }
                case -1194194955:
                case 1052414551:
                    i = i33;
                    c19258 = c192582;
                    interfaceC178893 = interfaceC178894;
                    main = main4;
                    listView = listView4;
                    sArr = sArr5;
                    str = str4;
                    view = view5;
                    i2 = i29;
                    i32 = 60999;
                    m25662 = (i26 - C2105.m6981("۬ۤ")) * (-27);
                    i12 = ((m25662 ^ i25) * 17795) ^ (-1733206921);
                    i13 = -1584827727;
                    i21 = m25662 ^ i13;
                    sArr5 = sArr;
                    i29 = i2;
                    view5 = view;
                    i33 = i;
                    i28 = i21;
                    i27 = i12;
                    str4 = str;
                    listView4 = listView;
                    main4 = main;
                    interfaceC178894 = interfaceC178893;
                    c192582 = c19258;
                case -1180265400:
                case -1116579344:
                    zArr[i31] = z2;
                    m25663 = C2105.m6981("۟ۛ") ^ i26;
                    i18 = ((m25663 ^ i25) * (-27777)) ^ 1524153549;
                    i20 = 1709218054;
                    i28 = m25663 ^ i20;
                    i27 = i18;
                case -1089387217:
                case -365463195:
                    i16 = i33;
                    m10739 = view5;
                    listView3 = listView4;
                    i17 = i29;
                    listView3.setDivider(null);
                    ?? m28028 = C11340.m28028(m10739, C0630.m2566(C4616.m13542(f63246, 496, 3, i32)) ^ 2098190836);
                    if (C3746.f11829 <= 0) {
                        textView = m28028;
                        main3 = main4;
                        onClickListener = null;
                        int m2566722 = (C0630.m2566("᩺۠") ^ i26) * (-113);
                        ListView listView622 = listView3;
                        i27 = ((m2566722 ^ i25) * 24747) ^ (-1213640604);
                        i19 = m2566722 ^ 2137045215;
                        listView4 = listView622;
                        main4 = main3;
                        i29 = i17;
                        view5 = m10739;
                        i33 = i16;
                        i28 = i19;
                    } else {
                        int m25669 = (C0630.m2566("ۛ֡") + i26) * (-121);
                        int i35 = ((m25669 ^ i25) * 29725) ^ (-57282971);
                        i19 = m25669 ^ 924624833;
                        listView4 = listView3;
                        textView = m28028;
                        i27 = i35;
                        i29 = i17;
                        onClickListener = null;
                        view5 = m10739;
                        i33 = i16;
                        i28 = i19;
                    }
                case -1060284395:
                case -744282932:
                    i = i33;
                    c19258 = c192582;
                    interfaceC178892 = interfaceC178894;
                    main = main4;
                    listView = listView4;
                    sArr = sArr5;
                    view = view5;
                    i2 = i29;
                    if (!C1294.m4369(interfaceC178892.getName(), str4)) {
                        m6981 = C2105.m6981("ᩴܳ") ^ i25;
                        i3 = ((m6981 ^ i26) * 11983) ^ 1830227191;
                        i4 = 1829061565;
                        i5 = m6981 ^ i4;
                        interfaceC178894 = interfaceC178892;
                        sArr5 = sArr;
                        i29 = i2;
                        view5 = view;
                        c192582 = c19258;
                        listView4 = listView;
                        main4 = main;
                        i11 = i;
                        i28 = i5;
                        i27 = i3;
                        i33 = i11;
                    }
                    m6981 = C0630.m2566("ۗܶ") ^ i26;
                    i3 = ((m6981 ^ i25) * 337) ^ (-1872082927);
                    i4 = -1733167705;
                    i5 = m6981 ^ i4;
                    interfaceC178894 = interfaceC178892;
                    sArr5 = sArr;
                    i29 = i2;
                    view5 = view;
                    c192582 = c19258;
                    listView4 = listView;
                    main4 = main;
                    i11 = i;
                    i28 = i5;
                    i27 = i3;
                    i33 = i11;
                case -1033400326:
                case -110702562:
                    if (C1711.f5919) {
                        main2 = main4;
                        listView2 = listView4;
                        sArr4 = sArr5;
                        view4 = view5;
                        int m698162 = (C2105.m6981("ۚ۠") ^ i25) * (-55);
                        Main main52 = main2;
                        i27 = ((m698162 ^ i26) * (-10281)) ^ (-847901806);
                        sArr5 = sArr4;
                        View view72 = view4;
                        listView4 = listView2;
                        main4 = main52;
                        i28 = m698162 ^ (-2036668366);
                        view5 = view72;
                    } else {
                        i = i33;
                        c19258 = c192582;
                        interfaceC178893 = interfaceC178894;
                        main = main4;
                        listView = listView4;
                        sArr = sArr5;
                        str = str4;
                        view = view5;
                        i2 = i29;
                        int m256610 = (C0630.m2566("ܽۡ") + i25) * (-37);
                        i12 = ((m256610 ^ i26) * (-27463)) ^ 168966528;
                        i21 = m256610 ^ 1055446;
                        sArr5 = sArr;
                        i29 = i2;
                        view5 = view;
                        i33 = i;
                        i28 = i21;
                        i27 = i12;
                        str4 = str;
                        listView4 = listView;
                        main4 = main;
                        interfaceC178894 = interfaceC178893;
                        c192582 = c19258;
                    }
                case -1001470947:
                case -660959729:
                    i = i33;
                    c19258 = c192582;
                    interfaceC178893 = interfaceC178894;
                    main = main4;
                    listView = listView4;
                    sArr = sArr5;
                    view = view5;
                    i2 = i29;
                    str = str4;
                    String m3841 = C1128.m3841(f63246, 472, 14, i32);
                    String parent2 = interfaceC17889.getParent();
                    if (C7106.f21815 == 0) {
                        C7106.m19117(arrayList, new C10211(m3841, parent2, z, z2));
                        C2126.m7043(c16560).mo6005(c16560, arrayList, new Runnable() { // from class: l.᩵ۡܳ

                            /* renamed from: ܽܿܽ, reason: not valid java name and contains not printable characters */
                            private static final short[] f62682 = {7343, 28215, 28216, 28210, 28196, 28217, 28223, 28210, 28280, 28223, 28216, 28194, 28211, 28216, 28194, 28280, 28215, 28213, 28194, 28223, 28217, 28216, 28280, 28160, 28191, 28179, 28161, 28210, 28211, 28206, 28176, 28223, 28218, 28211, 28197, 28196, 28211, 28197, 28217, 28195, 28196, 28213, 28211, 28197, 28280, 28215, 28196, 28197, 28213};

                            {
                                int i36 = -551694220;
                                int i37 = C11340.f33930;
                                int i38 = C3245.f10203;
                                int m69817 = C2105.m6981("᩻ܶ") ^ i38;
                                int i39 = ((m69817 ^ i37) * (-27571)) ^ 2047160127;
                                int i40 = 215766306;
                                while (true) {
                                    i36 = ((((i36 ^ i37) * (-20587)) >> 31) & i39) ^ (m69817 ^ i40);
                                    switch (i36) {
                                        case -2074395471:
                                        case 2125682719:
                                            RunnableC1108.m3790();
                                            m69817 = C0630.m2566("ۖܰ") ^ i37;
                                            i39 = ((m69817 ^ i38) * 2283) ^ 939715313;
                                            i40 = -1758669238;
                                        case -1839030383:
                                        case 1144527608:
                                            if (C0714.f2697 >= 0) {
                                                m69817 = C2105.m6981("۬ۧ") ^ i37;
                                                i39 = ((m69817 ^ i38) * 18879) ^ (-790349458);
                                                i40 = -1310451612;
                                            } else {
                                                m69817 = (C0630.m2566("ۢۚ") ^ i37) * (-47);
                                                i39 = ((m69817 ^ i38) * 20221) ^ 735786410;
                                                i40 = -1711381388;
                                            }
                                        case -1780117968:
                                        case 1475200742:
                                            if (C11340.f33930 >= 0) {
                                                m69817 = C2105.m6981("ۜ۠") ^ i38;
                                                i39 = ((m69817 ^ i37) * 19627) ^ (-1541098914);
                                                i40 = -1507672227;
                                            } else {
                                                m69817 = (C2105.m6981("ᩴۗ") + i38) * 89;
                                                i39 = ((m69817 ^ i37) * 5899) ^ 879364191;
                                                i40 = -285402189;
                                            }
                                        case -1616729012:
                                        case 456636250:
                                            if (C3663.f11553) {
                                                m69817 = C2105.m6981("ۜ۠") ^ i38;
                                                i39 = ((m69817 ^ i37) * 19627) ^ (-1541098914);
                                                i40 = -1507672227;
                                            } else {
                                                m69817 = C2105.m6981("᩷ۢ") ^ i38;
                                                i39 = ((m69817 ^ i37) * (-2375)) ^ 1903252721;
                                                i40 = 1371291140;
                                            }
                                        case -1420471483:
                                        case 1456244675:
                                            C5695.m16023();
                                            if (C1916.f6442) {
                                                m69817 = C2105.m6981("۬ۧ") ^ i37;
                                                i39 = ((m69817 ^ i38) * 18879) ^ (-790349458);
                                                i40 = -1310451612;
                                            } else {
                                                m69817 = C2105.m6981("ۜ۠") ^ i38;
                                                i39 = ((m69817 ^ i37) * 19627) ^ (-1541098914);
                                                i40 = -1507672227;
                                            }
                                        case -1374485698:
                                        case 1985204858:
                                            if (C22628.f73083 <= 0) {
                                                m69817 = C2105.m6981("ۧ֡") ^ i37;
                                                i39 = ((m69817 ^ i38) * 25797) ^ (-953704960);
                                                i40 = -2098824347;
                                            } else {
                                                m69817 = C0630.m2566("֫ܺ") ^ i37;
                                                i39 = ((m69817 ^ i38) * (-8929)) ^ (-1172501651);
                                                i40 = 1783039472;
                                            }
                                        case -1356473895:
                                        case -29485229:
                                            C3683.m11222();
                                            if (C3663.f11553) {
                                                m69817 = C0630.m2566("ۖܰ") ^ i37;
                                                i39 = ((m69817 ^ i38) * 2283) ^ 939715313;
                                                i40 = -1758669238;
                                            } else {
                                                m69817 = C2105.m6981("ۜ۠") ^ i38;
                                                i39 = ((m69817 ^ i37) * 19627) ^ (-1541098914);
                                                i40 = -1507672227;
                                            }
                                        case -1100114909:
                                        case 1541424107:
                                            if (C1504.m5179()) {
                                                m69817 = C0630.m2566("֫ܶ") ^ i38;
                                                i39 = ((m69817 ^ i37) * (-7769)) ^ 694147725;
                                                i40 = -781741241;
                                            } else {
                                                m69817 = C2105.m6981("ۧ֡") ^ i37;
                                                i39 = ((m69817 ^ i38) * 25797) ^ (-953704960);
                                                i40 = -2098824347;
                                            }
                                        case -1058110713:
                                        case 1124477548:
                                            C3245.m9925();
                                            C3683.m11222();
                                            throw new RuntimeException();
                                        case -976060475:
                                        case -477839894:
                                            return;
                                        case -216105532:
                                        case 1367072208:
                                            if (C0964.f3626 != 0) {
                                                m69817 = C2105.m6981("۬ۧ") ^ i37;
                                                i39 = ((m69817 ^ i38) * 18879) ^ (-790349458);
                                                i40 = -1310451612;
                                            } else {
                                                m69817 = C0630.m2566("᩵᩸") ^ i37;
                                                i39 = ((m69817 ^ i38) * 29007) ^ (-329750225);
                                                i40 = -820060475;
                                            }
                                        case -64870406:
                                        case 330444448:
                                            if (AbstractC2021.f6743 <= 0) {
                                                m69817 = C2105.m6981("ۜ۠") ^ i38;
                                                i39 = ((m69817 ^ i37) * 19627) ^ (-1541098914);
                                                i40 = -1507672227;
                                            } else {
                                                m69817 = (C2105.m6981("ۧ֨") ^ i38) * 93;
                                                i39 = ((m69817 ^ i37) * 32467) ^ (-974028711);
                                                i40 = -1879047240;
                                            }
                                        case 344961884:
                                        case 1708057123:
                                            if (C2520.f8000 >= 0) {
                                                m69817 = C0630.m2566("ۖܰ") ^ i37;
                                                i39 = ((m69817 ^ i38) * 2283) ^ 939715313;
                                                i40 = -1758669238;
                                            } else {
                                                m69817 = C2105.m6981("ۗۙ") ^ i38;
                                                i39 = ((m69817 ^ i37) * 30733) ^ (-419990348);
                                                i40 = -1923327149;
                                            }
                                        case 371516349:
                                        case 1005134367:
                                            if (C1916.f6442) {
                                                m69817 = C2105.m6981("ۨ۟") ^ i37;
                                                i39 = ((m69817 ^ i38) * (-17063)) ^ (-1726547836);
                                                i40 = 934168097;
                                            } else {
                                                m69817 = C2105.m6981("ۧ֡") ^ i37;
                                                i39 = ((m69817 ^ i38) * 25797) ^ (-953704960);
                                                i40 = -2098824347;
                                            }
                                        case 782643537:
                                        case 1830679725:
                                            if (C4616.f14690 <= 0) {
                                                m69817 = C0630.m2566("ۖܰ") ^ i37;
                                                i39 = ((m69817 ^ i38) * 2283) ^ 939715313;
                                                i40 = -1758669238;
                                            } else {
                                                m69817 = C0630.m2566("᩷ᩴ") ^ i38;
                                                i39 = ((m69817 ^ i37) * 13475) ^ (-950038657);
                                                i40 = 1412023503;
                                            }
                                        default:
                                            if (ViewOnClickListenerC1958.m6429() >= 0) {
                                                m69817 = C2105.m6981("ۜ۠") ^ i38;
                                                i39 = ((m69817 ^ i37) * 19627) ^ (-1541098914);
                                                i40 = -1507672227;
                                            } else {
                                                m69817 = (C0630.m2566("ۡۙ") ^ i37) * (-5);
                                                i39 = ((m69817 ^ i38) * (-19331)) ^ 1065231613;
                                                i40 = -1626275148;
                                            }
                                    }
                                }
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:44:0x009a, code lost:
                            
                                if (l.C3663.f11553 != false) goto L71;
                             */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() {
                                /*
                                    Method dump skipped, instructions count: 1040
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: l.RunnableC19363.run():void");
                            }
                        });
                        break;
                    }
                    int m2566102 = (C0630.m2566("ܽۡ") + i25) * (-37);
                    i12 = ((m2566102 ^ i26) * (-27463)) ^ 168966528;
                    i21 = m2566102 ^ 1055446;
                    sArr5 = sArr;
                    i29 = i2;
                    view5 = view;
                    i33 = i;
                    i28 = i21;
                    i27 = i12;
                    str4 = str;
                    listView4 = listView;
                    main4 = main;
                    interfaceC178894 = interfaceC178893;
                    c192582 = c19258;
                case -906122386:
                case 280051200:
                    i33 = i23 ^ 2128238660;
                    i29 = 2124657121 ^ C2105.m6981(C3432.m10488(f63246, 513, 3, i32));
                    if (C0422.f1886 <= 0) {
                        main2 = main4;
                        listView2 = listView4;
                        sArr4 = sArr5;
                        view4 = view5;
                        int m6981622 = (C2105.m6981("ۚ۠") ^ i25) * (-55);
                        Main main522 = main2;
                        i27 = ((m6981622 ^ i26) * (-10281)) ^ (-847901806);
                        sArr5 = sArr4;
                        View view722 = view4;
                        listView4 = listView2;
                        main4 = main522;
                        i28 = m6981622 ^ (-2036668366);
                        view5 = view722;
                    } else {
                        m25663 = C0630.m2566("ۢۖ") ^ i26;
                        i18 = ((m25663 ^ i25) * (-28771)) ^ 1195104617;
                        i20 = 643216596;
                        i28 = m25663 ^ i20;
                        i27 = i18;
                    }
                case -887483755:
                case 1307878979:
                    if (C21923.f70183 == 0) {
                        main2 = main4;
                        listView2 = listView4;
                        sArr4 = sArr5;
                        view4 = view5;
                        int m69816222 = (C2105.m6981("ۚ۠") ^ i25) * (-55);
                        Main main5222 = main2;
                        i27 = ((m69816222 ^ i26) * (-10281)) ^ (-847901806);
                        sArr5 = sArr4;
                        View view7222 = view4;
                        listView4 = listView2;
                        main4 = main5222;
                        i28 = m69816222 ^ (-2036668366);
                        view5 = view7222;
                    } else {
                        m25663 = C2105.m6981("᩷ܿ") ^ i25;
                        i18 = ((m25663 ^ i26) * 18425) ^ 769274229;
                        i20 = -628099245;
                        i28 = m25663 ^ i20;
                        i27 = i18;
                    }
                case -872947440:
                case 917453224:
                    final DialogInterfaceC0206 m16343 = C5834.m16343(c192582, i33, onClickListener, i29, onClickListener);
                    final boolean[] zArr2 = zArr;
                    C4159.m12564(C22628.m50609(m16343), new View.OnClickListener() { // from class: l.֡ۡܳ

                        /* renamed from: ᩴ᩵ܽ, reason: not valid java name and contains not printable characters */
                        private static final short[] f1686 = {8140, 17367, -18135, 20283, 13717, 13698, 13716, 13704, 13714, 13717, 13700, 13698, 13716, 13769, 13702, 13717, 13716, 13700};

                        {
                            int i36 = 115074108;
                            int i37 = C1294.f4556;
                            int i38 = ServiceConnectionC3453.f10921;
                            int m69817 = (C2105.m6981("ܶᩴ") ^ i38) * (-43);
                            int i39 = ((m69817 ^ i37) * 5439) ^ 837480264;
                            int i40 = -1886798306;
                            while (true) {
                                i36 = ((((i36 ^ i37) * 23233) >> 31) & i39) ^ (m69817 ^ i40);
                                switch (i36) {
                                    case -2082087188:
                                    case 1712143346:
                                        if (C1294.f4556 >= 0) {
                                            m69817 = (C2105.m6981("᩻۠") ^ i37) * (-107);
                                            i39 = ((m69817 ^ i38) * 22511) ^ (-610622732);
                                            i40 = -1873792511;
                                        } else {
                                            m69817 = C2105.m6981("᩶᩻") ^ i37;
                                            i39 = ((m69817 ^ i38) * (-27427)) ^ (-1533277875);
                                            i40 = -1898322283;
                                        }
                                    case -1886822623:
                                    case -471760088:
                                        if (C3746.f11829 <= 0) {
                                            m69817 = (C0630.m2566("ۨܺ") ^ i37) * 73;
                                            i39 = ((m69817 ^ i38) * 3989) ^ (-12787205);
                                            i40 = -1169756477;
                                        } else {
                                            m69817 = (C0630.m2566("ܺ᩶") + i37) * (-21);
                                            i39 = ((m69817 ^ i38) * 18239) ^ (-1020024057);
                                            i40 = -1735658673;
                                        }
                                    case -1123460552:
                                    case 2141517635:
                                        if (C0422.f1886 <= 0) {
                                            m69817 = C2105.m6981("ۡܶ") ^ i38;
                                            i39 = ((m69817 ^ i37) * (-25193)) ^ (-1416131490);
                                            i40 = 578475843;
                                        } else {
                                            m69817 = (C2105.m6981("ܳۚ") ^ i38) * 47;
                                            i39 = ((m69817 ^ i37) * 1357) ^ (-126940477);
                                            i40 = 248892920;
                                        }
                                    case -1020999420:
                                    case 863399149:
                                        if (C1420.f5096 <= 0) {
                                            m69817 = (C0630.m2566("ۤܳ") + i38) * q.h;
                                            i39 = ((m69817 ^ i37) * (-22173)) ^ (-831740173);
                                            i40 = 1249317023;
                                        } else {
                                            m69817 = C0630.m2566("᩹ᩴ") ^ i38;
                                            i39 = ((m69817 ^ i37) * 31759) ^ (-195341602);
                                            i40 = 1863410823;
                                        }
                                    case -932818179:
                                    case 1536472420:
                                        C7106.m19120();
                                        C1773.m5908();
                                        throw new RuntimeException();
                                    case -829555130:
                                    case 606234682:
                                        C4159.m12565();
                                        if (C2126.f7087) {
                                            m69817 = (C0630.m2566("ۤܳ") + i38) * q.h;
                                            i39 = ((m69817 ^ i37) * (-22173)) ^ (-831740173);
                                            i40 = 1249317023;
                                        } else {
                                            m69817 = (C0630.m2566("ۨܺ") ^ i37) * 73;
                                            i39 = ((m69817 ^ i38) * 3989) ^ (-12787205);
                                            i40 = -1169756477;
                                        }
                                    case -721091859:
                                    case 533960904:
                                        if (RunnableC3474.f10992 <= 0) {
                                            m69817 = C2105.m6981("ۡܶ") ^ i38;
                                            i39 = ((m69817 ^ i37) * (-25193)) ^ (-1416131490);
                                            i40 = 578475843;
                                        } else {
                                            m69817 = C0630.m2566("֨ۗ") ^ i38;
                                            i39 = ((m69817 ^ i37) * (-11023)) ^ 151578558;
                                            i40 = -275430157;
                                        }
                                    case -543748528:
                                    case 567418491:
                                        if (C7106.f21815 != 0) {
                                            m69817 = C2105.m6981("ۡܶ") ^ i38;
                                            i39 = ((m69817 ^ i37) * (-25193)) ^ (-1416131490);
                                            i40 = 578475843;
                                        } else {
                                            m69817 = (C2105.m6981("ܿ֨") + i38) * (-3);
                                            i39 = ((m69817 ^ i37) * (-20373)) ^ (-579104942);
                                            i40 = -994694635;
                                        }
                                    case -509568762:
                                    case 1019179266:
                                        if (C2958.f9394 >= 0) {
                                            m69817 = (C2105.m6981("᩻۠") ^ i37) * (-107);
                                            i39 = ((m69817 ^ i38) * 22511) ^ (-610622732);
                                            i40 = -1873792511;
                                        } else {
                                            m69817 = (C0630.m2566("᩵ۛ") ^ i37) * (-79);
                                            i39 = ((m69817 ^ i38) * (-21397)) ^ 708206544;
                                            i40 = 1105915300;
                                        }
                                    case -162832073:
                                    case 1578026290:
                                        if (C3245.f10203 <= 0) {
                                            m69817 = C2105.m6981("ۡܶ") ^ i38;
                                            i39 = ((m69817 ^ i37) * (-25193)) ^ (-1416131490);
                                            i40 = 578475843;
                                        } else {
                                            m69817 = C0630.m2566("᩸᩸") ^ i37;
                                            i39 = ((m69817 ^ i38) * (-22793)) ^ 822179816;
                                            i40 = 2047802310;
                                        }
                                    case -39631168:
                                    case 1255399864:
                                        return;
                                    case -16140196:
                                    case 642254103:
                                        RunnableC3474.m10630();
                                        if (C7106.f21815 == 0) {
                                            m69817 = (C0630.m2566("ܺ᩻") ^ i38) * 95;
                                            i39 = ((m69817 ^ i37) * 25969) ^ (-1205376611);
                                            i40 = 667465874;
                                        } else {
                                            m69817 = (C0630.m2566("ۨܺ") ^ i37) * 73;
                                            i39 = ((m69817 ^ i38) * 3989) ^ (-12787205);
                                            i40 = -1169756477;
                                        }
                                    case 56756140:
                                    case 262980134:
                                        if (AbstractC2021.m6574()) {
                                            m69817 = C2105.m6981("ۡܶ") ^ i38;
                                            i39 = ((m69817 ^ i37) * (-25193)) ^ (-1416131490);
                                            i40 = 578475843;
                                        } else {
                                            m69817 = (C2105.m6981("֨۫") ^ i37) * (-63);
                                            i39 = ((m69817 ^ i38) * 18963) ^ 2047147809;
                                            i40 = -562984315;
                                        }
                                    case 1182506887:
                                    case 1209244377:
                                        C1504.m5179();
                                        m69817 = (C0630.m2566("ܺ᩻") ^ i38) * 95;
                                        i39 = ((m69817 ^ i37) * 25969) ^ (-1205376611);
                                        i40 = 667465874;
                                    case 1394625346:
                                    case 1833865724:
                                        if (C2272.f7362) {
                                            m69817 = (C2105.m6981("᩻۠") ^ i37) * (-107);
                                            i39 = ((m69817 ^ i38) * 22511) ^ (-610622732);
                                            i40 = -1873792511;
                                        } else {
                                            m69817 = (C0630.m2566("ܺ᩻") ^ i38) * 95;
                                            i39 = ((m69817 ^ i37) * 25969) ^ (-1205376611);
                                            i40 = 667465874;
                                        }
                                    default:
                                        if (C2105.m6982() != 0) {
                                            m69817 = (C0630.m2566("ۤܳ") + i38) * q.h;
                                            i39 = ((m69817 ^ i37) * (-22173)) ^ (-831740173);
                                            i40 = 1249317023;
                                        } else {
                                            m69817 = C2105.m6981("֡ۡ") ^ i38;
                                            i39 = ((m69817 ^ i37) * 28921) ^ (-1208620186);
                                            i40 = 448536871;
                                        }
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view9) {
                            ArrayList arrayList2;
                            int m256611;
                            int i36;
                            int i37;
                            short s2;
                            int i38;
                            int m256612;
                            int i39;
                            int i40;
                            int i41;
                            int i42;
                            int m256613;
                            int i43;
                            int i44;
                            ArrayList arrayList3;
                            int i45;
                            short s3;
                            ArrayList arrayList4;
                            int i46;
                            int m69817;
                            int i47;
                            int i48;
                            int m256614;
                            int i49;
                            ViewOnClickListenerC0311 viewOnClickListenerC0311 = this;
                            int i50 = 1010611830;
                            int i51 = C0714.f2697;
                            int i52 = C0630.f2410;
                            int m256615 = C0630.m2566("ܺ۠") ^ i52;
                            int i53 = ((m256615 ^ i51) * 28933) ^ (-2068717416);
                            int i54 = m256615 ^ 1773976201;
                            final ArrayList arrayList5 = null;
                            short[] sArr6 = null;
                            boolean[] zArr3 = null;
                            boolean z3 = false;
                            int i55 = 0;
                            boolean z4 = false;
                            int i56 = 0;
                            int i57 = 0;
                            int i58 = 0;
                            C10211 c102112 = null;
                            int i59 = 0;
                            int i60 = 0;
                            char c = 0;
                            short s4 = 0;
                            short s5 = 0;
                            int i61 = 0;
                            short[] sArr7 = null;
                            String str6 = null;
                            final InterfaceC17889 interfaceC178896 = null;
                            int i62 = 0;
                            while (true) {
                                i50 = i54 ^ (i53 & (((i50 ^ i51) * (-18715)) >> 31));
                                switch (i50) {
                                    case -2134073114:
                                    case 107489236:
                                        arrayList2 = arrayList5;
                                        boolean[] zArr4 = zArr2;
                                        i61 = zArr4.length;
                                        z3 = false;
                                        i55 = 0;
                                        zArr3 = zArr4;
                                        m256611 = (i52 - C0630.m2566("ᩴᩴ")) * (-53);
                                        i36 = ((m256611 ^ i51) * (-8179)) ^ 1707350484;
                                        i37 = 1717556413;
                                        int i63 = m256611 ^ i37;
                                        arrayList5 = arrayList2;
                                        i54 = i63;
                                        i53 = i36;
                                    case -2031702119:
                                    case -497368204:
                                        arrayList2 = arrayList5;
                                        if (zArr3[i55]) {
                                            m256611 = C0630.m2566("᩺ᩳ") ^ i52;
                                            i36 = ((m256611 ^ i51) * 2361) ^ (-437537663);
                                            i37 = 1803704006;
                                        } else {
                                            m256611 = C2105.m6981("ۙܰ") ^ i51;
                                            i36 = ((m256611 ^ i52) * (-16923)) ^ (-1202801784);
                                            i37 = 558551711;
                                        }
                                        int i632 = m256611 ^ i37;
                                        arrayList5 = arrayList2;
                                        i54 = i632;
                                        i53 = i36;
                                    case -1990126399:
                                    case -71420965:
                                        short[] sArr8 = f1686;
                                        if (C1773.f6144 <= 0) {
                                            arrayList3 = arrayList5;
                                            s3 = s4;
                                            i45 = i61;
                                            int m69818 = (i51 - C2105.m6981("ۜۢ")) * (-93);
                                            i61 = i45;
                                            s4 = s3;
                                            i53 = ((m69818 ^ i52) * (-2675)) ^ (-1742263988);
                                            c102112 = null;
                                            ArrayList arrayList6 = arrayList3;
                                            i54 = m69818 ^ (-372845233);
                                            arrayList5 = arrayList6;
                                        } else {
                                            arrayList2 = arrayList5;
                                            String m19110 = C7106.m19110(sArr8, 4, 14, i56);
                                            if (C3683.f11629 >= 0) {
                                                s2 = s4;
                                                i38 = i61;
                                                int m69819 = (C2105.m6981("ۖ֡") + i52) * 31;
                                                int i64 = ((m69819 ^ i51) * 20047) ^ 2115044932;
                                                i41 = m69819 ^ (-1061055932);
                                                i61 = i38;
                                                s4 = s2;
                                                i53 = i64;
                                                arrayList5 = arrayList2;
                                                c102112 = null;
                                                i54 = i41;
                                                viewOnClickListenerC0311 = this;
                                            } else {
                                                interfaceC178896 = interfaceC17889;
                                                c102112 = new C10211(m19110, interfaceC178896.getParent(), z3, z4);
                                                if (C2272.f7362) {
                                                    i42 = i61;
                                                    m256613 = (i52 - C0630.m2566("ۖ۫")) * (-105);
                                                    i43 = ((m256613 ^ i51) * 4927) ^ (-895324932);
                                                    i44 = 60782280;
                                                    i41 = m256613 ^ i44;
                                                    i61 = i42;
                                                    i53 = i43;
                                                    arrayList5 = arrayList2;
                                                    i54 = i41;
                                                    viewOnClickListenerC0311 = this;
                                                } else {
                                                    m256611 = (C0630.m2566("ܰ֡") + i51) * 61;
                                                    i36 = ((m256611 ^ i52) * 26439) ^ (-2054457081);
                                                    i37 = -1688142664;
                                                    int i6322 = m256611 ^ i37;
                                                    arrayList5 = arrayList2;
                                                    i54 = i6322;
                                                    i53 = i36;
                                                }
                                            }
                                        }
                                    case -1848312985:
                                    case -95405135:
                                        arrayList5.remove(i62);
                                        m256614 = (C2105.m6981("ۢۧ") + i52) * 23;
                                        i36 = ((m256614 ^ i51) * (-29951)) ^ 766760377;
                                        i49 = 220871550;
                                        i54 = m256614 ^ i49;
                                        i53 = i36;
                                    case -1813022685:
                                    case 1636335558:
                                        arrayList4 = arrayList5;
                                        i46 = i61;
                                        i56 = 13799;
                                        m69817 = (C2105.m6981("ۘۛ") ^ i51) * 17;
                                        i47 = ((m69817 ^ i52) * 30657) ^ (-155285366);
                                        i48 = -209227240;
                                        int i65 = m69817 ^ i48;
                                        i61 = i46;
                                        i53 = i47;
                                        arrayList5 = arrayList4;
                                        i54 = i65;
                                    case -1710705686:
                                    case 825358009:
                                        arrayList2 = arrayList5;
                                        C3663.m11167(m16343);
                                        i62 = zArr3.length - 1;
                                        z4 = true;
                                        m256611 = C0630.m2566("۬᩺") ^ i51;
                                        i36 = ((m256611 ^ i52) * (-20533)) ^ 2119120643;
                                        i37 = 282696472;
                                        int i63222 = m256611 ^ i37;
                                        arrayList5 = arrayList2;
                                        i54 = i63222;
                                        i53 = i36;
                                    case -1673134148:
                                    case -246532689:
                                        arrayList3 = arrayList5;
                                        i45 = i61;
                                        i59 = s4 * s5;
                                        s3 = s4;
                                        int i66 = s3 + 383;
                                        if (C4263.f13799 <= 0) {
                                            i60 = i66;
                                            int m698182 = (i51 - C2105.m6981("ۜۢ")) * (-93);
                                            i61 = i45;
                                            s4 = s3;
                                            i53 = ((m698182 ^ i52) * (-2675)) ^ (-1742263988);
                                            c102112 = null;
                                            ArrayList arrayList62 = arrayList3;
                                            i54 = m698182 ^ (-372845233);
                                            arrayList5 = arrayList62;
                                        } else {
                                            int m256616 = C0630.m2566("᩸ܶ") ^ i51;
                                            int i67 = ((m256616 ^ i52) * 26641) ^ 1995150801;
                                            int i68 = m256616 ^ (-923004820);
                                            i61 = i45;
                                            s4 = s3;
                                            i53 = i67;
                                            viewOnClickListenerC0311 = this;
                                            i60 = i66;
                                            arrayList5 = arrayList3;
                                            i54 = i68;
                                        }
                                    case -1634308085:
                                    case -721367697:
                                        arrayList5 = arrayList;
                                        if (i62 >= 0) {
                                            m256614 = C2105.m6981("ۨᩴ") ^ i52;
                                            i36 = ((m256614 ^ i51) * 11197) ^ (-624726955);
                                            i49 = 987204042;
                                        } else {
                                            m256614 = C0630.m2566("۠ۧ") ^ i52;
                                            i36 = ((m256614 ^ i51) * 23309) ^ (-159913290);
                                            i49 = -1592917862;
                                        }
                                        i54 = m256614 ^ i49;
                                        i53 = i36;
                                    case -1537894806:
                                    case 172953249:
                                        C4075.m12263();
                                        break;
                                    case -1469748959:
                                    case -1358621707:
                                        arrayList2 = arrayList5;
                                        i55++;
                                        m256611 = (i52 - C0630.m2566("ᩴᩴ")) * (-53);
                                        i36 = ((m256611 ^ i51) * (-8179)) ^ 1707350484;
                                        i37 = 1717556413;
                                        int i632222 = m256611 ^ i37;
                                        arrayList5 = arrayList2;
                                        i54 = i632222;
                                        i53 = i36;
                                    case -1394174226:
                                    case 1617401344:
                                        if (!zArr3[i62]) {
                                            m256614 = C2105.m6981("۬۫") ^ i51;
                                            i36 = ((m256614 ^ i52) * 9585) ^ (-1897321678);
                                            i49 = 1948253395;
                                            i54 = m256614 ^ i49;
                                            i53 = i36;
                                        }
                                        m256614 = (C2105.m6981("ۢۧ") + i52) * 23;
                                        i36 = ((m256614 ^ i51) * (-29951)) ^ 766760377;
                                        i49 = 220871550;
                                        i54 = m256614 ^ i49;
                                        i53 = i36;
                                    case -1378437543:
                                    case 1429744934:
                                        if (C1504.f5354) {
                                            arrayList2 = arrayList5;
                                            s2 = s4;
                                            i38 = i61;
                                            int m698192 = (C2105.m6981("ۖ֡") + i52) * 31;
                                            int i642 = ((m698192 ^ i51) * 20047) ^ 2115044932;
                                            i41 = m698192 ^ (-1061055932);
                                            i61 = i38;
                                            s4 = s2;
                                            i53 = i642;
                                            arrayList5 = arrayList2;
                                            c102112 = null;
                                            i54 = i41;
                                            viewOnClickListenerC0311 = this;
                                        } else {
                                            arrayList3 = arrayList5;
                                            s3 = s4;
                                            i45 = i61;
                                            int m6981822 = (i51 - C2105.m6981("ۜۢ")) * (-93);
                                            i61 = i45;
                                            s4 = s3;
                                            i53 = ((m6981822 ^ i52) * (-2675)) ^ (-1742263988);
                                            c102112 = null;
                                            ArrayList arrayList622 = arrayList3;
                                            i54 = m6981822 ^ (-372845233);
                                            arrayList5 = arrayList622;
                                        }
                                    case -1240250392:
                                    case 28615830:
                                        arrayList2 = arrayList5;
                                        s2 = s4;
                                        i38 = i61;
                                        c = 0;
                                        if (C3245.f10203 > 0) {
                                            m256612 = (C2105.m6981("᩵֨") + i52) * 9;
                                            i39 = ((m256612 ^ i51) * (-1071)) ^ (-514695474);
                                            i40 = 1690515102;
                                            i41 = m256612 ^ i40;
                                            i61 = i38;
                                            s4 = s2;
                                            i53 = i39;
                                            arrayList5 = arrayList2;
                                            i54 = i41;
                                            viewOnClickListenerC0311 = this;
                                        }
                                        int m6981922 = (C2105.m6981("ۖ֡") + i52) * 31;
                                        int i6422 = ((m6981922 ^ i51) * 20047) ^ 2115044932;
                                        i41 = m6981922 ^ (-1061055932);
                                        i61 = i38;
                                        s4 = s2;
                                        i53 = i6422;
                                        arrayList5 = arrayList2;
                                        c102112 = null;
                                        i54 = i41;
                                        viewOnClickListenerC0311 = this;
                                    case -1000950955:
                                    case -833033361:
                                        C0382.m1848();
                                        if (C0630.f2410 <= 0) {
                                            arrayList3 = arrayList5;
                                            s3 = s4;
                                            i45 = i61;
                                            int m69818222 = (i51 - C2105.m6981("ۜۢ")) * (-93);
                                            i61 = i45;
                                            s4 = s3;
                                            i53 = ((m69818222 ^ i52) * (-2675)) ^ (-1742263988);
                                            c102112 = null;
                                            ArrayList arrayList6222 = arrayList3;
                                            i54 = m69818222 ^ (-372845233);
                                            arrayList5 = arrayList6222;
                                        } else {
                                            m256614 = (i51 - C2105.m6981("ܽᩳ")) * 33;
                                            i36 = ((m256614 ^ i52) * 499) ^ 1191714578;
                                            i49 = 651193145;
                                            i54 = m256614 ^ i49;
                                            i53 = i36;
                                        }
                                    case -399994632:
                                    case 1548903359:
                                        arrayList4 = arrayList5;
                                        i46 = i61;
                                        if (i55 < i46) {
                                            m69817 = C0630.m2566("᩸ۛ") ^ i52;
                                            i47 = ((m69817 ^ i51) * 18909) ^ (-1850240331);
                                            i48 = -598377540;
                                        } else {
                                            m69817 = (i51 - C2105.m6981("ۛᩴ")) * (-71);
                                            i47 = ((m69817 ^ i52) * 28577) ^ (-95924250);
                                            i48 = -1985600231;
                                        }
                                        int i652 = m69817 ^ i48;
                                        i61 = i46;
                                        i53 = i47;
                                        arrayList5 = arrayList4;
                                        i54 = i652;
                                    case -393387733:
                                    case 1185952207:
                                        arrayList4 = arrayList5;
                                        i46 = i61;
                                        if ((i60 * i60) - i59 < 0) {
                                            m69817 = C0630.m2566("ᩳܺ") ^ i52;
                                            i47 = ((m69817 ^ i51) * 31683) ^ (-831272241);
                                            i48 = 1886629933;
                                        } else {
                                            m69817 = (i51 - C2105.m6981("᩶᩺")) * (-41);
                                            i47 = ((m69817 ^ i52) * 563) ^ (-104410754);
                                            i48 = 1414795641;
                                        }
                                        int i6522 = m69817 ^ i48;
                                        i61 = i46;
                                        i53 = i47;
                                        arrayList5 = arrayList4;
                                        i54 = i6522;
                                    case -225123923:
                                    case 241612075:
                                        C1504.m5167(C0630.m2566(str6) ^ 2128558296);
                                        break;
                                    case -113963399:
                                    case 32779293:
                                        arrayList2 = arrayList5;
                                        sArr6 = f1686;
                                        i57 = 1;
                                        i58 = 3;
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            i42 = i61;
                                            m256613 = (i52 - C0630.m2566("ۖ۫")) * (-105);
                                            i43 = ((m256613 ^ i51) * 4927) ^ (-895324932);
                                            i44 = 60782280;
                                            i41 = m256613 ^ i44;
                                            i61 = i42;
                                            i53 = i43;
                                            arrayList5 = arrayList2;
                                            i54 = i41;
                                            viewOnClickListenerC0311 = this;
                                        } else {
                                            m256611 = (i52 - C0630.m2566("ۢۡ")) * 53;
                                            i36 = ((m256611 ^ i51) * (-10063)) ^ 2052847405;
                                            i37 = -1674475086;
                                            int i6322222 = m256611 ^ i37;
                                            arrayList5 = arrayList2;
                                            i54 = i6322222;
                                            i53 = i36;
                                        }
                                    case 440630815:
                                    case 2126668574:
                                        if (C4263.m12819() >= 0) {
                                            arrayList3 = arrayList5;
                                            s3 = s4;
                                            i45 = i61;
                                            int m698182222 = (i51 - C2105.m6981("ۜۢ")) * (-93);
                                            i61 = i45;
                                            s4 = s3;
                                            i53 = ((m698182222 ^ i52) * (-2675)) ^ (-1742263988);
                                            c102112 = null;
                                            ArrayList arrayList62222 = arrayList3;
                                            i54 = m698182222 ^ (-372845233);
                                            arrayList5 = arrayList62222;
                                        } else {
                                            arrayList2 = arrayList5;
                                            m256611 = (C2105.m6981("ᩴ᩵") + i52) * 39;
                                            i36 = ((m256611 ^ i51) * (-2119)) ^ 1002520211;
                                            i37 = 2091114248;
                                            int i63222222 = m256611 ^ i37;
                                            arrayList5 = arrayList2;
                                            i54 = i63222222;
                                            i53 = i36;
                                        }
                                    case 446037761:
                                    case 994493195:
                                        C3019.m9255();
                                        arrayList3 = arrayList5;
                                        s3 = s4;
                                        i45 = i61;
                                        int m6981822222 = (i51 - C2105.m6981("ۜۢ")) * (-93);
                                        i61 = i45;
                                        s4 = s3;
                                        i53 = ((m6981822222 ^ i52) * (-2675)) ^ (-1742263988);
                                        c102112 = null;
                                        ArrayList arrayList622222 = arrayList3;
                                        i54 = m6981822222 ^ (-372845233);
                                        arrayList5 = arrayList622222;
                                    case 668675481:
                                    case 1919900526:
                                        C1916.m6307(arrayList5, c102112);
                                        final C16560 c165602 = c16560;
                                        AbstractC16891 m12569 = C4159.m12569(c165602);
                                        if (!C2520.m8026()) {
                                            final Class cls2 = cls;
                                            m12569.mo6005(c165602, arrayList5, new Runnable() { // from class: l.֨ۡܳ

                                                /* renamed from: ۤۜۤ, reason: not valid java name and contains not printable characters */
                                                private static final short[] f3746 = {4085, 10713, 10710, 10716, 10698, 10711, 10705, 10716, 10646, 10705, 10710, 10700, 10717, 10710, 10700, 10646, 10713, 10715, 10700, 10705, 10711, 10710, 10646, 10734, 10737, 10749, 10735, 10716, 10717, 10688, 10750, 10705, 10708, 10717, 10699, 10698, 10717, 10699, 10711, 10701, 10698, 10715, 10717, 10699, 10646, 10713, 10698, 10699, 10715};

                                                {
                                                    int i69 = 1464563313;
                                                    int i70 = C3019.f9544;
                                                    int i71 = C5695.f17556;
                                                    int m256617 = (C0630.m2566("ᩳܳ") ^ i70) * 45;
                                                    int i72 = ((m256617 ^ i71) * (-15669)) ^ 795266440;
                                                    int i73 = -2025210253;
                                                    while (true) {
                                                        i69 = ((((i69 ^ i71) * 6987) >> 31) & i72) ^ (m256617 ^ i73);
                                                        switch (i69) {
                                                            case -1999164069:
                                                            case -1261736244:
                                                                return;
                                                            case -1995206505:
                                                            case -95408789:
                                                                if (C0964.m3413()) {
                                                                    m256617 = (C2105.m6981("᩻۠") ^ i70) * 123;
                                                                    i72 = ((m256617 ^ i71) * (-9417)) ^ (-1503203720);
                                                                    i73 = -1507732913;
                                                                } else {
                                                                    m256617 = (i70 - C2105.m6981("᩻᩻")) * (-55);
                                                                    i72 = ((m256617 ^ i71) * 30363) ^ 646304352;
                                                                    i73 = -1663303342;
                                                                }
                                                            case -1970750846:
                                                            case -1285893496:
                                                                if (C0050.f910 >= 0) {
                                                                    m256617 = (C2105.m6981("ۗܶ") ^ i71) * 75;
                                                                    i72 = ((m256617 ^ i70) * 20643) ^ 161423101;
                                                                    i73 = -2009201165;
                                                                } else {
                                                                    m256617 = C0630.m2566("ᩳۗ") ^ i71;
                                                                    i72 = ((m256617 ^ i70) * 19041) ^ 1230714132;
                                                                    i73 = 1509913695;
                                                                }
                                                            case -1962259144:
                                                            case 870436000:
                                                                if (C5695.f17556 >= 0) {
                                                                    m256617 = (C2105.m6981("ۗܶ") ^ i71) * 75;
                                                                    i72 = ((m256617 ^ i70) * 20643) ^ 161423101;
                                                                    i73 = -2009201165;
                                                                } else {
                                                                    m256617 = C2105.m6981("ܳ۫") ^ i70;
                                                                    i72 = ((m256617 ^ i71) * 2827) ^ 1110493759;
                                                                    i73 = 1730794858;
                                                                }
                                                            case -1779192163:
                                                            case 1045993151:
                                                                C4263.m12819();
                                                                throw new RuntimeException();
                                                            case -866204139:
                                                            case 136487140:
                                                                if (AbstractC2021.f6743 <= 0) {
                                                                    m256617 = (i70 - C2105.m6981("᩻᩻")) * (-55);
                                                                    i72 = ((m256617 ^ i71) * 30363) ^ 646304352;
                                                                    i73 = -1663303342;
                                                                } else {
                                                                    m256617 = (C2105.m6981("ۙۖ") + i71) * (-9);
                                                                    i72 = ((m256617 ^ i70) * (-22747)) ^ (-1705348922);
                                                                    i73 = -314420129;
                                                                }
                                                            case -783547479:
                                                            case 210990626:
                                                                if (C4159.f13567) {
                                                                    m256617 = (i71 - C2105.m6981("۫ܳ")) * (-61);
                                                                    i72 = ((m256617 ^ i70) * 12455) ^ (-1762197193);
                                                                    i73 = 354371539;
                                                                } else {
                                                                    m256617 = C0630.m2566("ܿ᩷") ^ i70;
                                                                    i72 = ((m256617 ^ i71) * (-17853)) ^ (-335850955);
                                                                    i73 = -88247320;
                                                                }
                                                            case -565295825:
                                                            case 611493685:
                                                                if (C4616.m13552() != 0) {
                                                                    m256617 = (i70 - C2105.m6981("᩻᩻")) * (-55);
                                                                    i72 = ((m256617 ^ i71) * 30363) ^ 646304352;
                                                                    i73 = -1663303342;
                                                                } else {
                                                                    m256617 = C0630.m2566("ᩴ۫") ^ i70;
                                                                    i72 = ((m256617 ^ i71) * 9591) ^ 1041072059;
                                                                    i73 = -516831963;
                                                                }
                                                            case -263176504:
                                                            case 387711232:
                                                                if (C2167.f7158 < 0) {
                                                                    m256617 = (C0630.m2566("ۨۘ") + i71) * 97;
                                                                    i72 = ((m256617 ^ i70) * 22897) ^ 656383749;
                                                                    i73 = -596745896;
                                                                } else {
                                                                    m256617 = (i70 - C2105.m6981("᩻᩻")) * (-55);
                                                                    i72 = ((m256617 ^ i71) * 30363) ^ 646304352;
                                                                    i73 = -1663303342;
                                                                }
                                                            case -145186165:
                                                            case 1301978350:
                                                                if (C3663.m11168() >= 0) {
                                                                    m256617 = (C0630.m2566("ۨۘ") + i71) * 97;
                                                                    i72 = ((m256617 ^ i70) * 22897) ^ 656383749;
                                                                    i73 = -596745896;
                                                                } else {
                                                                    m256617 = C2105.m6981("ۤ᩸") ^ i71;
                                                                    i72 = ((m256617 ^ i70) * 21471) ^ (-1759768097);
                                                                    i73 = -1423159373;
                                                                }
                                                            case 415954399:
                                                            case 1876781634:
                                                                C1773.m5908();
                                                                C1773.m5908();
                                                                m256617 = (C0630.m2566("ۨۘ") + i71) * 97;
                                                                i72 = ((m256617 ^ i70) * 22897) ^ 656383749;
                                                                i73 = -596745896;
                                                            case 484228238:
                                                            case 611223437:
                                                                if (C0714.m2805()) {
                                                                    m256617 = (C2105.m6981("᩶᩺") ^ i71) * (-121);
                                                                    i72 = ((m256617 ^ i70) * 17649) ^ (-505881895);
                                                                    i73 = 409440750;
                                                                } else {
                                                                    m256617 = C0630.m2566("ܿ᩷") ^ i70;
                                                                    i72 = ((m256617 ^ i71) * (-17853)) ^ (-335850955);
                                                                    i73 = -88247320;
                                                                }
                                                            case 764510585:
                                                            case 1145732275:
                                                                if (C2126.f7087) {
                                                                    m256617 = (C2105.m6981("ۗܶ") ^ i71) * 75;
                                                                    i72 = ((m256617 ^ i70) * 20643) ^ 161423101;
                                                                    i73 = -2009201165;
                                                                } else {
                                                                    m256617 = (C0630.m2566("ܶۜ") + i70) * (-73);
                                                                    i72 = ((m256617 ^ i71) * (-28967)) ^ (-2133041114);
                                                                    i73 = 544295924;
                                                                }
                                                            case 1120981219:
                                                            case 1720866982:
                                                                if (RunnableC1108.f4040) {
                                                                    m256617 = (i71 - C2105.m6981("ۚ֨")) * 65;
                                                                    i72 = ((m256617 ^ i70) * (-30675)) ^ 485980255;
                                                                    i73 = -460743258;
                                                                } else {
                                                                    m256617 = (i70 - C2105.m6981("᩻᩻")) * (-55);
                                                                    i72 = ((m256617 ^ i71) * 30363) ^ 646304352;
                                                                    i73 = -1663303342;
                                                                }
                                                            case 1539327202:
                                                            case 1863146398:
                                                                if (ViewOnClickListenerC1958.f6529 <= 0) {
                                                                    m256617 = C2105.m6981("ۤ᩸") ^ i71;
                                                                    i72 = ((m256617 ^ i70) * 21471) ^ (-1759768097);
                                                                    i73 = -1423159373;
                                                                } else {
                                                                    m256617 = (C0630.m2566("ܳ۬") + i70) * (-29);
                                                                    i72 = ((m256617 ^ i71) * (-18399)) ^ (-467172643);
                                                                    i73 = 482078239;
                                                                }
                                                            default:
                                                                if (C3537.f11231 < 0) {
                                                                    m256617 = (C0630.m2566("ۨۘ") + i71) * 97;
                                                                    i72 = ((m256617 ^ i70) * 22897) ^ 656383749;
                                                                    i73 = -596745896;
                                                                } else {
                                                                    m256617 = C0630.m2566("ܿ᩷") ^ i70;
                                                                    i72 = ((m256617 ^ i71) * (-17853)) ^ (-335850955);
                                                                    i73 = -88247320;
                                                                }
                                                        }
                                                    }
                                                }

                                                /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
                                                
                                                    if (l.C0964.f3626 != 0) goto L46;
                                                 */
                                                /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
                                                
                                                    if (l.C2520.f8000 < 0) goto L46;
                                                 */
                                                @Override // java.lang.Runnable
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                    To view partially-correct add '--show-bad-code' argument
                                                */
                                                public final void run() {
                                                    /*
                                                        Method dump skipped, instructions count: 1024
                                                        To view this dump add '--comments-level debug' option
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: l.RunnableC1017.run():void");
                                                }
                                            });
                                            break;
                                        }
                                        arrayList3 = arrayList5;
                                        s3 = s4;
                                        i45 = i61;
                                        int m69818222222 = (i51 - C2105.m6981("ۜۢ")) * (-93);
                                        i61 = i45;
                                        s4 = s3;
                                        i53 = ((m69818222222 ^ i52) * (-2675)) ^ (-1742263988);
                                        c102112 = null;
                                        ArrayList arrayList6222222 = arrayList3;
                                        i54 = m69818222222 ^ (-372845233);
                                        arrayList5 = arrayList6222222;
                                    case 684945923:
                                    case 1392235738:
                                        i62--;
                                        arrayList2 = arrayList5;
                                        m256611 = C0630.m2566("۬᩺") ^ i51;
                                        i36 = ((m256611 ^ i52) * (-20533)) ^ 2119120643;
                                        i37 = 282696472;
                                        int i632222222 = m256611 ^ i37;
                                        arrayList5 = arrayList2;
                                        i54 = i632222222;
                                        i53 = i36;
                                    case 717251660:
                                    case 1467314935:
                                        arrayList4 = arrayList5;
                                        i46 = i61;
                                        i56 = 23424;
                                        m69817 = (C2105.m6981("ۘۛ") ^ i51) * 17;
                                        i47 = ((m69817 ^ i52) * 30657) ^ (-155285366);
                                        i48 = -209227240;
                                        int i65222 = m69817 ^ i48;
                                        i61 = i46;
                                        i53 = i47;
                                        arrayList5 = arrayList4;
                                        i54 = i65222;
                                    case 856470313:
                                    case 1997315072:
                                        arrayList2 = arrayList5;
                                        s2 = s4;
                                        i38 = i61;
                                        sArr7 = f1686;
                                        if (C3537.f11231 < 0) {
                                            m256612 = C0630.m2566("ۨ᩺") ^ i51;
                                            i39 = ((m256612 ^ i52) * (-19795)) ^ (-1959507541);
                                            i40 = 945597799;
                                            i41 = m256612 ^ i40;
                                            i61 = i38;
                                            s4 = s2;
                                            i53 = i39;
                                            arrayList5 = arrayList2;
                                            i54 = i41;
                                            viewOnClickListenerC0311 = this;
                                        }
                                        int m69819222 = (C2105.m6981("ۖ֡") + i52) * 31;
                                        int i64222 = ((m69819222 ^ i51) * 20047) ^ 2115044932;
                                        i41 = m69819222 ^ (-1061055932);
                                        i61 = i38;
                                        s4 = s2;
                                        i53 = i64222;
                                        arrayList5 = arrayList2;
                                        c102112 = null;
                                        i54 = i41;
                                        viewOnClickListenerC0311 = this;
                                    case 1298491618:
                                    case 1514305985:
                                        arrayList2 = arrayList5;
                                        str6 = C4075.m12252(sArr6, i57, i58, i56);
                                        if (C21923.f70183 == 0) {
                                            m256611 = C0630.m2566("֫᩺") ^ i51;
                                            i36 = ((m256611 ^ i52) * (-17059)) ^ 1877796258;
                                            i37 = 2094739871;
                                            int i6322222222 = m256611 ^ i37;
                                            arrayList5 = arrayList2;
                                            i54 = i6322222222;
                                            i53 = i36;
                                        }
                                        m256611 = (C2105.m6981("ᩴ᩵") + i52) * 39;
                                        i36 = ((m256611 ^ i51) * (-2119)) ^ 1002520211;
                                        i37 = 2091114248;
                                        int i63222222222 = m256611 ^ i37;
                                        arrayList5 = arrayList2;
                                        i54 = i63222222222;
                                        i53 = i36;
                                    default:
                                        arrayList2 = arrayList5;
                                        i42 = i61;
                                        s4 = sArr7[c];
                                        s5 = 1532;
                                        if (!RunnableC1108.m3790()) {
                                            m256613 = (i52 - C2105.m6981("ۧᩳ")) * (-5);
                                            i43 = ((m256613 ^ i51) * (-29765)) ^ 1217222402;
                                            i44 = -1495926270;
                                            i41 = m256613 ^ i44;
                                            i61 = i42;
                                            i53 = i43;
                                            arrayList5 = arrayList2;
                                            i54 = i41;
                                            viewOnClickListenerC0311 = this;
                                        }
                                        m256613 = (i52 - C0630.m2566("ۖ۫")) * (-105);
                                        i43 = ((m256613 ^ i51) * 4927) ^ (-895324932);
                                        i44 = 60782280;
                                        i41 = m256613 ^ i44;
                                        i61 = i42;
                                        i53 = i43;
                                        arrayList5 = arrayList2;
                                        i54 = i41;
                                        viewOnClickListenerC0311 = this;
                                }
                                return;
                            }
                        }
                    });
                    C4159.m12564(C4616.m13545(m16343), new ViewOnClickListenerC8984(zArr, c20438));
                    break;
                case -861122177:
                case 2079788677:
                    i = i33;
                    c19258 = c192582;
                    interfaceC178893 = interfaceC178894;
                    main = main4;
                    listView = listView4;
                    sArr = sArr5;
                    str = str4;
                    view = view5;
                    i2 = i29;
                    s = f63246[466];
                    if (C4159.m12565() < 0) {
                        m25662 = C0630.m2566("ۡ᩸") ^ i25;
                        i12 = ((m25662 ^ i26) * (-31889)) ^ (-1067224172);
                        i13 = -1055334158;
                        i21 = m25662 ^ i13;
                        sArr5 = sArr;
                        i29 = i2;
                        view5 = view;
                        i33 = i;
                        i28 = i21;
                        i27 = i12;
                        str4 = str;
                        listView4 = listView;
                        main4 = main;
                        interfaceC178894 = interfaceC178893;
                        c192582 = c19258;
                    }
                    m25662 = (C2105.m6981("ܺ᩻") ^ i26) * (-77);
                    i12 = ((m25662 ^ i25) * (-7623)) ^ (-2064482112);
                    i13 = -1752707084;
                    i21 = m25662 ^ i13;
                    sArr5 = sArr;
                    i29 = i2;
                    view5 = view;
                    i33 = i;
                    i28 = i21;
                    i27 = i12;
                    str4 = str;
                    listView4 = listView;
                    main4 = main;
                    interfaceC178894 = interfaceC178893;
                    c192582 = c19258;
                case -817869909:
                case 1285472206:
                    C1916.m6308();
                    break;
                case -638366652:
                case 1063437450:
                    i = i33;
                    c19258 = c192582;
                    interfaceC178893 = interfaceC178894;
                    main = main4;
                    listView = listView4;
                    short s2 = s;
                    sArr = sArr5;
                    str = str4;
                    view = view5;
                    i2 = i29;
                    if (((s2 * s2) + 257827249) - (s2 * 32114) < 0) {
                        int m256611 = C0630.m2566("ܶ᩶") ^ i25;
                        s = s2;
                        i27 = ((m256611 ^ i26) * (-4449)) ^ 713815720;
                        sArr5 = sArr;
                        i29 = i2;
                        view5 = view;
                        i33 = i;
                        i28 = m256611 ^ (-1627023115);
                        str4 = str;
                        listView4 = listView;
                        main4 = main;
                        interfaceC178894 = interfaceC178893;
                        c192582 = c19258;
                    } else {
                        s = s2;
                        m25662 = C0630.m2566("ۜ۟") ^ i26;
                        i12 = ((m25662 ^ i25) * (-32719)) ^ 1813824368;
                        i13 = 1433621894;
                        i21 = m25662 ^ i13;
                        sArr5 = sArr;
                        i29 = i2;
                        view5 = view;
                        i33 = i;
                        i28 = i21;
                        i27 = i12;
                        str4 = str;
                        listView4 = listView;
                        main4 = main;
                        interfaceC178894 = interfaceC178893;
                        c192582 = c19258;
                    }
                case -605758809:
                case -308932675:
                    i = i33;
                    c19258 = c192582;
                    interfaceC178893 = interfaceC178894;
                    main = main4;
                    listView = listView4;
                    sArr = sArr5;
                    str = str4;
                    view = view5;
                    i2 = i29;
                    String str6 = str3;
                    if (C1294.m4369(interfaceC178893.getParent(), str6)) {
                        m25662 = (C2105.m6981("ۗ᩶") ^ i25) * 109;
                        str3 = str6;
                        i12 = ((m25662 ^ i26) * (-27809)) ^ 842642995;
                        i13 = 1341913706;
                        i21 = m25662 ^ i13;
                        sArr5 = sArr;
                        i29 = i2;
                        view5 = view;
                        i33 = i;
                        i28 = i21;
                        i27 = i12;
                        str4 = str;
                        listView4 = listView;
                        main4 = main;
                        interfaceC178894 = interfaceC178893;
                        c192582 = c19258;
                    } else {
                        str3 = str6;
                        str4 = str;
                        interfaceC178894 = interfaceC178893;
                        int m25665222 = C0630.m2566("ܶۤ") ^ i26;
                        sArr5 = sArr;
                        i29 = i2;
                        view5 = view;
                        i33 = i;
                        i28 = m25665222 ^ (-1558780401);
                        i27 = ((m25665222 ^ i25) * 7107) ^ (-489025746);
                        listView4 = listView;
                        c192582 = c19258;
                        main4 = main;
                    }
                case -584706753:
                case 1827935846:
                    RunnableC0588.m2440(C3537.m10748(f63246, 467, 5, i32));
                    break;
                case -379681099:
                case 1892902990:
                    i = i33;
                    c19258 = c192582;
                    interfaceC178892 = interfaceC178894;
                    main = main4;
                    listView = listView4;
                    sArr = sArr5;
                    view = view5;
                    i2 = i29;
                    if (i31 < C0382.m1847(arrayList)) {
                        m6981 = (C0630.m2566("ۜۜ") + i26) * 39;
                        i3 = ((m6981 ^ i25) * 14937) ^ (-1829405760);
                        i4 = 1555267036;
                    } else {
                        m6981 = C0630.m2566("ۤ᩻") ^ i25;
                        i3 = ((m6981 ^ i26) * 19687) ^ 48801840;
                        i4 = 1487008264;
                    }
                    i5 = m6981 ^ i4;
                    interfaceC178894 = interfaceC178892;
                    sArr5 = sArr;
                    i29 = i2;
                    view5 = view;
                    c192582 = c19258;
                    listView4 = listView;
                    main4 = main;
                    i11 = i;
                    i28 = i5;
                    i27 = i3;
                    i33 = i11;
                case -216788543:
                case 2031639723:
                    C1773.m5908();
                    if (C3245.m9925() == 0) {
                        i6 = i33;
                        view2 = view5;
                        sArr2 = sArr5;
                        i7 = i29;
                        m2566 = (C2105.m6981("ۜۧ") + i25) * (-59);
                        i8 = ((m2566 ^ i26) * 9173) ^ 860536296;
                        i9 = -207679166;
                        sArr5 = sArr2;
                        i11 = i6;
                        i28 = m2566 ^ i9;
                        i27 = i8;
                        i29 = i7;
                        view5 = view2;
                        i33 = i11;
                    }
                    i = i33;
                    m69812 = (C0630.m2566("ۖܺ") + i26) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i3 = ((m69812 ^ i25) * 20481) ^ 285335824;
                    i10 = 492796346;
                    i5 = m69812 ^ i10;
                    i11 = i;
                    i28 = i5;
                    i27 = i3;
                    i33 = i11;
                case 66821975:
                case 1964025704:
                    i = i33;
                    c19258 = c192582;
                    main = main4;
                    listView = listView4;
                    sArr = sArr5;
                    view = view5;
                    i2 = i29;
                    C7106.m19117(arrayList, new C10211(interfaceC178894));
                    int m256652222 = C0630.m2566("ܶۤ") ^ i26;
                    sArr5 = sArr;
                    i29 = i2;
                    view5 = view;
                    i33 = i;
                    i28 = m256652222 ^ (-1558780401);
                    i27 = ((m256652222 ^ i25) * 7107) ^ (-489025746);
                    listView4 = listView;
                    c192582 = c19258;
                    main4 = main;
                case 106513570:
                case 1320651153:
                    i = i33;
                    c19258 = c192582;
                    interfaceC178893 = interfaceC178894;
                    main = main4;
                    listView = listView4;
                    sArr = sArr5;
                    str = str4;
                    view = view5;
                    i2 = i29;
                    if (C0483.m2123(it)) {
                        m25662 = (C2105.m6981("۠֫") + i25) * 77;
                        i12 = ((m25662 ^ i26) * (-7391)) ^ 1064193187;
                        i13 = -495031585;
                    } else {
                        m25662 = C0630.m2566("֫ۢ") ^ i25;
                        i12 = ((m25662 ^ i26) * 1477) ^ (-1929852824);
                        i13 = -1754667251;
                    }
                    i21 = m25662 ^ i13;
                    sArr5 = sArr;
                    i29 = i2;
                    view5 = view;
                    i33 = i;
                    i28 = i21;
                    i27 = i12;
                    str4 = str;
                    listView4 = listView;
                    main4 = main;
                    interfaceC178894 = interfaceC178893;
                    c192582 = c19258;
                case 500532388:
                case 1078608158:
                    int i36 = i33;
                    View view9 = view5;
                    listView2 = listView4;
                    sArr4 = sArr5;
                    int i37 = i29;
                    Main m49336 = C21923.m49336(c16560);
                    view4 = view9;
                    int m69817 = C2105.m6981(C0382.m1840(f63246, 490, 3, i32));
                    if (C11340.f33930 >= 0) {
                        i29 = i37;
                        i33 = i36;
                        i22 = m69817;
                        main2 = m49336;
                        int m698162222 = (C2105.m6981("ۚ۠") ^ i25) * (-55);
                        Main main52222 = main2;
                        i27 = ((m698162222 ^ i26) * (-10281)) ^ (-847901806);
                        sArr5 = sArr4;
                        View view72222 = view4;
                        listView4 = listView2;
                        main4 = main52222;
                        i28 = m698162222 ^ (-2036668366);
                        view5 = view72222;
                    } else {
                        int m69818 = (i26 - C2105.m6981("ܽ֨")) * (-119);
                        sArr5 = sArr4;
                        i22 = m69817;
                        i27 = ((m69818 ^ i25) * (-689)) ^ (-1616293785);
                        i29 = i37;
                        view5 = view4;
                        listView4 = listView2;
                        main4 = m49336;
                        i28 = m69818 ^ 634757277;
                        i33 = i36;
                    }
                case 603496589:
                case 754915654:
                    C2126.m7040();
                    if (C0237.f1507 == 0) {
                        i = i33;
                        m69812 = (C0630.m2566("ۖܺ") + i26) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i3 = ((m69812 ^ i25) * 20481) ^ 285335824;
                        i10 = 492796346;
                        i5 = m69812 ^ i10;
                        i11 = i;
                        i28 = i5;
                        i27 = i3;
                        i33 = i11;
                    } else {
                        i16 = i33;
                        m10739 = view5;
                        listView3 = listView4;
                        i17 = i29;
                        main3 = main4;
                        int m25667222 = (C0630.m2566("᩺۠") ^ i26) * (-113);
                        ListView listView6222 = listView3;
                        i27 = ((m25667222 ^ i25) * 24747) ^ (-1213640604);
                        i19 = m25667222 ^ 2137045215;
                        listView4 = listView6222;
                        main4 = main3;
                        i29 = i17;
                        view5 = m10739;
                        i33 = i16;
                        i28 = i19;
                    }
                case 714352354:
                case 937995847:
                    if (C1294.m4369(c10211.m25626(), str4)) {
                        m25663 = (i25 - C0630.m2566("ۘۖ")) * (-25);
                        i18 = ((m25663 ^ i26) * 23741) ^ 195864905;
                        i20 = 683492349;
                        i28 = m25663 ^ i20;
                        i27 = i18;
                    }
                    m25663 = C2105.m6981("۟ۛ") ^ i26;
                    i18 = ((m25663 ^ i25) * (-27777)) ^ 1524153549;
                    i20 = 1709218054;
                    i28 = m25663 ^ i20;
                    i27 = i18;
                case 1280869422:
                case 1707998929:
                    C2272.m7503();
                    if (C2958.f9394 >= 0) {
                        m25663 = (C0630.m2566("ۧ᩷") ^ i26) * 81;
                        i18 = ((m25663 ^ i25) * 6025) ^ 495768419;
                        i20 = -1023188927;
                        i28 = m25663 ^ i20;
                        i27 = i18;
                    } else {
                        i = i33;
                        c19258 = c192582;
                        interfaceC178893 = interfaceC178894;
                        main = main4;
                        listView = listView4;
                        sArr = sArr5;
                        str = str4;
                        view = view5;
                        i2 = i29;
                        m25662 = (C2105.m6981("ܺ᩻") ^ i26) * (-77);
                        i12 = ((m25662 ^ i25) * (-7623)) ^ (-2064482112);
                        i13 = -1752707084;
                        i21 = m25662 ^ i13;
                        sArr5 = sArr;
                        i29 = i2;
                        view5 = view;
                        i33 = i;
                        i28 = i21;
                        i27 = i12;
                        str4 = str;
                        listView4 = listView;
                        main4 = main;
                        interfaceC178894 = interfaceC178893;
                        c192582 = c19258;
                    }
                case 1686736101:
                case 1863190988:
                    c10211 = (C10211) C3537.m10755(arrayList, i31);
                    String m25626 = c10211.m25626();
                    strArr2[i31] = m25626;
                    i30 = 100;
                    if (C1711.m5741(m25626) > 100) {
                        m25663 = C2105.m6981("᩶ۜ") ^ i25;
                        i18 = ((m25663 ^ i26) * 4797) ^ (-1808857755);
                        i20 = -1929497399;
                        i28 = m25663 ^ i20;
                        i27 = i18;
                    }
                    m25663 = C2105.m6981("᩷᩷") ^ i25;
                    i18 = ((m25663 ^ i26) * 14291) ^ (-343209562);
                    i20 = 846998275;
                    i28 = m25663 ^ i20;
                    i27 = i18;
                default:
                    C5695.m16023();
                    C0630.m2564();
                    i = i33;
                    m69812 = (C0630.m2566("ۖܺ") + i26) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    i3 = ((m69812 ^ i25) * 20481) ^ 285335824;
                    i10 = 492796346;
                    i5 = m69812 ^ i10;
                    i11 = i;
                    i28 = i5;
                    i27 = i3;
                    i33 = i11;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        if (l.RunnableC0588.f2309 >= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ea, code lost:
    
        r0 = (r20 - l.C2105.m6981("ۖ᩻")) * (-85);
        r13 = ((r0 ^ r19) * (-12717)) ^ (-824341941);
        r22 = 626875023;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e7, code lost:
    
        if (l.RunnableC0588.f2309 < 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m45011(l.C16560 r26, l.AbstractC15440 r27) {
        /*
            Method dump skipped, instructions count: 1540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19568.m45011(l.ܽۢܳ, l.ܶ᩵ܿ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45002(List list, int i, C16560 c16560, Main main, InterfaceC17889 interfaceC17889) {
        int m2566;
        int i2;
        int i3;
        int m6981;
        int i4;
        short[] sArr;
        int i5;
        int i6;
        int m69812;
        int i7;
        int i8;
        int m25662;
        int i9;
        int i10;
        int i11;
        Class cls;
        List list2 = list;
        int i12 = i;
        C16560 c165602 = c16560;
        boolean z = false;
        int i13 = 0;
        Intent intent = null;
        Class cls2 = null;
        AbstractC15440 abstractC15440 = null;
        String str = null;
        int i14 = 0;
        int i15 = 1411170120;
        int i16 = C3432.f10845;
        int i17 = C4616.f14690;
        int m25663 = (C0630.m2566("ۚ֡") ^ i17) * 63;
        int i18 = ((m25663 ^ i16) * 22165) ^ 574098682;
        int i19 = m25663 ^ (-613103826);
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i20 = 0;
        char c = 0;
        int i21 = 0;
        int i22 = 0;
        Iterator it = null;
        int i23 = 0;
        short[] sArr4 = null;
        int i24 = 0;
        while (true) {
            i15 = i19 ^ (i18 & (((i15 ^ i16) * 7395) >> 31));
            switch (i15) {
                case -2135962280:
                case 1509391479:
                    cls = ActivityC8259.class;
                    cls2 = cls;
                    i5 = i23;
                    m25662 = (i17 - C2105.m6981("ᩳۡ")) * (-49);
                    i9 = ((m25662 ^ i16) * 23413) ^ (-293656433);
                    i10 = -1462290804;
                    i19 = m25662 ^ i10;
                    list2 = list;
                    i18 = i9;
                    i23 = i5;
                    c165602 = c16560;
                case -2119824998:
                case 924285448:
                    short[] sArr5 = sArr2;
                    i6 = i23;
                    intent.setAction(C3683.m11225(sArr5, i6, i20, i14));
                    abstractC15440 = ((C10211) C21923.m49339(list2, i13)).m25622();
                    if (RunnableC1937.f6483 >= 0) {
                        sArr2 = sArr5;
                        m69812 = C2105.m6981("᩸ۗ") ^ i17;
                        i7 = ((m69812 ^ i16) * 28791) ^ (-1417385331);
                        i8 = -1090434782;
                        i19 = m69812 ^ i8;
                        list2 = list;
                        c165602 = c16560;
                        i18 = i7;
                        i23 = i6;
                        i12 = i;
                    } else {
                        int m25664 = C0630.m2566("֡ܳ") ^ i17;
                        i19 = m25664 ^ (-1672170384);
                        i18 = ((m25664 ^ i16) * 29603) ^ 686796472;
                        sArr2 = sArr5;
                        i23 = i6;
                        list2 = list;
                        c165602 = c16560;
                    }
                case -2055750671:
                case -1200659308:
                    i5 = i23;
                    if (C1773.m5910(it)) {
                        m25662 = C0630.m2566("ܿ֨") ^ i16;
                        i9 = ((m25662 ^ i17) * 30265) ^ 2115114878;
                        i10 = 1571366716;
                    } else {
                        m25662 = C2105.m6981("᩹ۙ") ^ i16;
                        i9 = ((m25662 ^ i17) * (-22921)) ^ (-1536333619);
                        i10 = 1315346693;
                    }
                    i19 = m25662 ^ i10;
                    list2 = list;
                    i18 = i9;
                    i23 = i5;
                    c165602 = c16560;
                case -1890494484:
                case 103907635:
                    cls = ActivityC19887.class;
                    cls2 = cls;
                    i5 = i23;
                    m25662 = (i17 - C2105.m6981("ᩳۡ")) * (-49);
                    i9 = ((m25662 ^ i16) * 23413) ^ (-293656433);
                    i10 = -1462290804;
                    i19 = m25662 ^ i10;
                    list2 = list;
                    i18 = i9;
                    i23 = i5;
                    c165602 = c16560;
                case -1871876296:
                case -1623996060:
                    sArr2 = f63246;
                    i23 = Primes.SMALL_FACTOR_LIMIT;
                    i20 = 26;
                    if (C2105.f7037 != 0) {
                        int m69813 = C2105.m6981("ۘᩴ") ^ i16;
                        int i25 = ((m69813 ^ i17) * 23353) ^ (-1853012286);
                        i19 = m69813 ^ (-40931155);
                        list2 = list;
                        c165602 = c16560;
                        i18 = i25;
                        i12 = i;
                    } else {
                        int m25665 = C0630.m2566("۠ۢ") ^ i17;
                        i11 = ((m25665 ^ i16) * 32567) ^ 251008212;
                        i19 = m25665 ^ (-1491268776);
                        list2 = list;
                        i18 = i11;
                        c165602 = c16560;
                    }
                case -1828896057:
                case -1380718490:
                    i6 = i23;
                    if (C1128.f4106 > 0) {
                        m69812 = (i17 - C2105.m6981("ᩴۙ")) * 43;
                        i7 = ((m69812 ^ i16) * 16871) ^ (-684757638);
                        i8 = 1122659933;
                        i19 = m69812 ^ i8;
                        list2 = list;
                        c165602 = c16560;
                        i18 = i7;
                        i23 = i6;
                        i12 = i;
                    }
                    m69812 = C2105.m6981("᩸ۗ") ^ i17;
                    i7 = ((m69812 ^ i16) * 28791) ^ (-1417385331);
                    i8 = -1090434782;
                    i19 = m69812 ^ i8;
                    list2 = list;
                    c165602 = c16560;
                    i18 = i7;
                    i23 = i6;
                    i12 = i;
                case -1715884867:
                case 176255265:
                    if (RunnableC0588.f2309 >= 0) {
                        int m698132 = C2105.m6981("ۘᩴ") ^ i16;
                        int i252 = ((m698132 ^ i17) * 23353) ^ (-1853012286);
                        i19 = m698132 ^ (-40931155);
                        list2 = list;
                        c165602 = c16560;
                        i18 = i252;
                        i12 = i;
                    } else {
                        m2566 = C0630.m2566("ۜۘ") ^ i17;
                        i2 = ((m2566 ^ i16) * 7065) ^ (-1578150828);
                        i3 = -1085610389;
                        i19 = m2566 ^ i3;
                        i18 = i2;
                    }
                case -1712200745:
                case -86534665:
                    if (ViewOnClickListenerC1958.m6429() < 0) {
                        int m25666 = C0630.m2566("ۗ۠") ^ i16;
                        i11 = ((m25666 ^ i17) * (-24407)) ^ 182644413;
                        i19 = m25666 ^ (-1081024509);
                        i18 = i11;
                        c165602 = c16560;
                    } else {
                        int m6981322 = C2105.m6981("ۘᩴ") ^ i16;
                        int i2522 = ((m6981322 ^ i17) * 23353) ^ (-1853012286);
                        i19 = m6981322 ^ (-40931155);
                        list2 = list;
                        c165602 = c16560;
                        i18 = i2522;
                        i12 = i;
                    }
                case -1668149519:
                case 729351656:
                    if (i12 != 3) {
                        m2566 = (i17 - C2105.m6981("۬ۡ")) * 127;
                        i2 = ((m2566 ^ i16) * 30515) ^ (-1621018982);
                        i3 = -109828916;
                    } else {
                        m2566 = C0630.m2566("ܶۤ") ^ i17;
                        i2 = ((m2566 ^ i16) * (-13231)) ^ 1860611085;
                        i3 = 1505476873;
                    }
                    i19 = m2566 ^ i3;
                    i18 = i2;
                case -1490286692:
                case -83154592:
                    i5 = i23;
                    i14 = 52462;
                    m25662 = (i17 - C0630.m2566("ܶۡ")) * (-105);
                    i9 = ((m25662 ^ i16) * 14777) ^ (-1224834139);
                    i10 = 1683509263;
                    i19 = m25662 ^ i10;
                    list2 = list;
                    i18 = i9;
                    i23 = i5;
                    c165602 = c16560;
                case -1450323613:
                case -538852032:
                    intent.putExtra(str, z);
                    m44999(intent, cls2, C4159.m12569(c16560));
                    C9340.m24035(interfaceC17889, 2000);
                    ServiceConnectionC3453.m10570(main, intent);
                    return;
                case -1382381332:
                case 1496430869:
                    str = C0483.m2128(sArr3, i24, 4, i14);
                    if (RunnableC3474.m10630()) {
                        m6981 = C0630.m2566("۟ۚ") ^ i17;
                        i2 = ((m6981 ^ i16) * 21597) ^ 1207034020;
                        i4 = -111493029;
                        i19 = m6981 ^ i4;
                        c165602 = c16560;
                        i18 = i2;
                    } else {
                        int m256662 = C0630.m2566("ۗ۠") ^ i16;
                        i11 = ((m256662 ^ i17) * (-24407)) ^ 182644413;
                        i19 = m256662 ^ (-1081024509);
                        i18 = i11;
                        c165602 = c16560;
                    }
                case -1329792092:
                case -810450695:
                    if (i12 == 4) {
                        m2566 = (C2105.m6981("ۢ᩵") + i17) * 83;
                        i2 = ((m2566 ^ i16) * 7549) ^ 1731852428;
                        i3 = -870716761;
                    } else {
                        m2566 = C2105.m6981("ۤۙ") ^ i16;
                        i2 = ((m2566 ^ i17) * 17421) ^ (-1224070174);
                        i3 = 1108717018;
                    }
                    i19 = m2566 ^ i3;
                    i18 = i2;
                case -1323441293:
                case 1714538968:
                    if (C2105.f7037 == 0) {
                        m2566 = (C0630.m2566("۠᩹") + i16) * 77;
                        i2 = ((m2566 ^ i17) * (-23475)) ^ 866763620;
                        i3 = 1356029171;
                        i19 = m2566 ^ i3;
                        i18 = i2;
                    } else {
                        int m2566622 = C0630.m2566("ۗ۠") ^ i16;
                        i11 = ((m2566622 ^ i17) * (-24407)) ^ 182644413;
                        i19 = m2566622 ^ (-1081024509);
                        i18 = i11;
                        c165602 = c16560;
                    }
                case -1253612744:
                case -76416595:
                    i5 = i23;
                    z = true;
                    i13 = 0;
                    if (i12 != 0) {
                        m25662 = C2105.m6981("ܽ᩺") ^ i16;
                        i9 = ((m25662 ^ i17) * 15053) ^ 1956269237;
                        i10 = -1557044491;
                    } else {
                        m25662 = (C2105.m6981("ۧܶ") + i17) * (-119);
                        i9 = ((m25662 ^ i16) * 25569) ^ 1656328944;
                        i10 = -1043063156;
                    }
                    i19 = m25662 ^ i10;
                    list2 = list;
                    i18 = i9;
                    i23 = i5;
                    c165602 = c16560;
                case -1158684926:
                case 692340468:
                    intent.setData(abstractC15440.m36522());
                    sArr3 = f63246;
                    i24 = 237;
                    if (C1294.f4556 >= 0) {
                        sArr = sArr2;
                        i5 = i23;
                        m25662 = (i17 - C0630.m2566("ۢۙ")) * (-59);
                        sArr2 = sArr;
                        i9 = ((m25662 ^ i16) * (-19607)) ^ (-559391002);
                        i10 = -1543796450;
                        i19 = m25662 ^ i10;
                        list2 = list;
                        i18 = i9;
                        i23 = i5;
                        c165602 = c16560;
                    } else {
                        m6981 = (i16 - C2105.m6981("ۘ᩸")) * 97;
                        i2 = ((m6981 ^ i17) * 17049) ^ (-2130958863);
                        i4 = -982669667;
                        i19 = m6981 ^ i4;
                        c165602 = c16560;
                        i18 = i2;
                    }
                case -1153181482:
                case 176447938:
                    ServiceConnectionC3453.m10564();
                    m2566 = (C0630.m2566("۠᩹") + i16) * 77;
                    i2 = ((m2566 ^ i17) * (-23475)) ^ 866763620;
                    i3 = 1356029171;
                    i19 = m2566 ^ i3;
                    i18 = i2;
                case -1082365805:
                case 1048553506:
                    sArr = sArr2;
                    i5 = i23;
                    intent = new Intent(main, (Class<?>) cls2);
                    C1711.m5738(intent, 268435456);
                    if (!C2167.m7155()) {
                        sArr2 = sArr;
                        m25662 = (i16 - C2105.m6981("ۡ᩷")) * 31;
                        i9 = ((m25662 ^ i17) * 13799) ^ (-1274883842);
                        i10 = 2100784630;
                        i19 = m25662 ^ i10;
                        list2 = list;
                        i18 = i9;
                        i23 = i5;
                        c165602 = c16560;
                    }
                    m25662 = (i17 - C0630.m2566("ۢۙ")) * (-59);
                    sArr2 = sArr;
                    i9 = ((m25662 ^ i16) * (-19607)) ^ (-559391002);
                    i10 = -1543796450;
                    i19 = m25662 ^ i10;
                    list2 = list;
                    i18 = i9;
                    i23 = i5;
                    c165602 = c16560;
                case -1008079980:
                case 99072233:
                    i6 = i23;
                    sArr4 = f63246;
                    c = 210;
                    if (C0237.f1507 == 0) {
                        m69812 = C0630.m2566("ۘܽ") ^ i16;
                        i7 = ((m69812 ^ i17) * (-12813)) ^ 464667421;
                        i8 = 1854605508;
                        i19 = m69812 ^ i8;
                        list2 = list;
                        c165602 = c16560;
                        i18 = i7;
                        i23 = i6;
                        i12 = i;
                    }
                    m69812 = C2105.m6981("᩸ۗ") ^ i17;
                    i7 = ((m69812 ^ i16) * 28791) ^ (-1417385331);
                    i8 = -1090434782;
                    i19 = m69812 ^ i8;
                    list2 = list;
                    c165602 = c16560;
                    i18 = i7;
                    i23 = i6;
                    i12 = i;
                case -994196003:
                case -838908592:
                    i6 = i23;
                    if (C0483.f2088 < 0) {
                        m69812 = C2105.m6981("֡ۖ") ^ i16;
                        i7 = ((m69812 ^ i17) * 6603) ^ 148942974;
                        i8 = 669625530;
                        i19 = m69812 ^ i8;
                        list2 = list;
                        c165602 = c16560;
                        i18 = i7;
                        i23 = i6;
                        i12 = i;
                    }
                    m69812 = C2105.m6981("᩸ۗ") ^ i17;
                    i7 = ((m69812 ^ i16) * 28791) ^ (-1417385331);
                    i8 = -1090434782;
                    i19 = m69812 ^ i8;
                    list2 = list;
                    c165602 = c16560;
                    i18 = i7;
                    i23 = i6;
                    i12 = i;
                case -826993272:
                case 1400040407:
                    i6 = i23;
                    if (C1128.m3851() <= 0) {
                        i23 = i6;
                        int m69813222 = C2105.m6981("ۘᩴ") ^ i16;
                        int i25222 = ((m69813222 ^ i17) * 23353) ^ (-1853012286);
                        i19 = m69813222 ^ (-40931155);
                        list2 = list;
                        c165602 = c16560;
                        i18 = i25222;
                        i12 = i;
                    } else {
                        m69812 = C2105.m6981("ᩳ֫") ^ i17;
                        i7 = ((m69812 ^ i16) * 18735) ^ 1462765597;
                        i8 = -502979963;
                        i19 = m69812 ^ i8;
                        list2 = list;
                        c165602 = c16560;
                        i18 = i7;
                        i23 = i6;
                        i12 = i;
                    }
                case -610301815:
                case -7511229:
                    i6 = i23;
                    short s = sArr4[c];
                    int i26 = s * 18188;
                    i22 = s * s;
                    if (C2105.m6982() != 0) {
                        i21 = i26;
                        m69812 = C2105.m6981("᩸ۗ") ^ i17;
                        i7 = ((m69812 ^ i16) * 28791) ^ (-1417385331);
                        i8 = -1090434782;
                        i19 = m69812 ^ i8;
                        list2 = list;
                        c165602 = c16560;
                        i18 = i7;
                        i23 = i6;
                        i12 = i;
                    } else {
                        int m69814 = C2105.m6981("ۡ۠") ^ i17;
                        int i27 = ((m69814 ^ i16) * (-7439)) ^ (-590473991);
                        i19 = m69814 ^ 1772562391;
                        list2 = list;
                        i18 = i27;
                        i21 = i26;
                        i23 = i6;
                        i12 = i;
                        c165602 = c16560;
                    }
                case -548694668:
                case 1066450283:
                    i5 = i23;
                    cls2 = ActivityC16315.class;
                    m25662 = (i17 - C2105.m6981("ᩳۡ")) * (-49);
                    i9 = ((m25662 ^ i16) * 23413) ^ (-293656433);
                    i10 = -1462290804;
                    i19 = m25662 ^ i10;
                    list2 = list;
                    i18 = i9;
                    i23 = i5;
                    c165602 = c16560;
                case -464016625:
                case 1218168089:
                    C0382.m1848();
                    if (C4159.m12565() < 0) {
                        m2566 = (C0630.m2566("۠᩹") + i16) * 77;
                        i2 = ((m2566 ^ i17) * (-23475)) ^ 866763620;
                        i3 = 1356029171;
                        i19 = m2566 ^ i3;
                        i18 = i2;
                    } else {
                        sArr = sArr2;
                        i5 = i23;
                        m25662 = (i17 - C0630.m2566("ۢۙ")) * (-59);
                        sArr2 = sArr;
                        i9 = ((m25662 ^ i16) * (-19607)) ^ (-559391002);
                        i10 = -1543796450;
                        i19 = m25662 ^ i10;
                        list2 = list;
                        i18 = i9;
                        i23 = i5;
                        c165602 = c16560;
                    }
                case -396718474:
                case 1327244552:
                    i5 = i23;
                    if (i21 - (i22 + 82700836) <= 0) {
                        m25662 = C2105.m6981("ۤ᩵") ^ i16;
                        i9 = ((m25662 ^ i17) * (-12621)) ^ (-35101803);
                        i10 = -768376415;
                    } else {
                        m25662 = (C0630.m2566("۠ۛ") + i16) * (-87);
                        i9 = ((m25662 ^ i17) * 4555) ^ (-357263019);
                        i10 = -1899926917;
                    }
                    i19 = m25662 ^ i10;
                    list2 = list;
                    i18 = i9;
                    i23 = i5;
                    c165602 = c16560;
                case -390227363:
                case 794225146:
                    i5 = i23;
                    ((C10211) C2272.m7513(it)).m25619();
                    m25662 = (i17 - C0630.m2566("ܽ۠")) * 67;
                    i9 = ((m25662 ^ i16) * (-7383)) ^ (-835470574);
                    i10 = -1702780637;
                    i19 = m25662 ^ i10;
                    list2 = list;
                    i18 = i9;
                    i23 = i5;
                    c165602 = c16560;
                case -150918521:
                case 1404977564:
                    throw new RuntimeException();
                case 195104972:
                case 2130770343:
                    C8699.m22486(c165602, ((C10211) C21923.m49339(list2, i13)).m25622());
                    return;
                case 371573504:
                case 1692750020:
                    i5 = i23;
                    if (i12 != z) {
                        m25662 = (C0630.m2566("ۘ۫") ^ i16) * 83;
                        i9 = ((m25662 ^ i17) * (-4265)) ^ (-1728331009);
                        i10 = -504561320;
                    } else {
                        m25662 = (i16 - C2105.m6981("ۨۤ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((m25662 ^ i17) * 32509) ^ (-1518577237);
                        i10 = 64780364;
                    }
                    i19 = m25662 ^ i10;
                    list2 = list;
                    i18 = i9;
                    i23 = i5;
                    c165602 = c16560;
                case 377060986:
                case 2030597420:
                    i5 = i23;
                    it = RunnableC1937.m6374(list);
                    m25662 = (i17 - C0630.m2566("ܽ۠")) * 67;
                    i9 = ((m25662 ^ i16) * (-7383)) ^ (-835470574);
                    i10 = -1702780637;
                    i19 = m25662 ^ i10;
                    list2 = list;
                    i18 = i9;
                    i23 = i5;
                    c165602 = c16560;
                case 666116350:
                case 1086761011:
                    C22628.m50615();
                    return;
                case 1127158542:
                case 1799822975:
                    C8699.m22485(c165602, ((C10211) C21923.m49339(list2, i13)).m25622());
                    return;
                case 1684771350:
                case 1730620056:
                    i5 = i23;
                    i14 = 25138;
                    m25662 = (i17 - C0630.m2566("ܶۡ")) * (-105);
                    i9 = ((m25662 ^ i16) * 14777) ^ (-1224834139);
                    i10 = 1683509263;
                    i19 = m25662 ^ i10;
                    list2 = list;
                    i18 = i9;
                    i23 = i5;
                    c165602 = c16560;
                default:
                    if (i12 != 2) {
                        m2566 = (i16 - C0630.m2566("ܶᩴ")) * 61;
                        i2 = ((m2566 ^ i17) * 1527) ^ 1886375735;
                        i3 = 250028778;
                    } else {
                        m2566 = C2105.m6981("ۡ᩻") ^ i17;
                        i2 = ((m2566 ^ i16) * 21591) ^ 920706817;
                        i3 = 545960009;
                    }
                    i19 = m2566 ^ i3;
                    i18 = i2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        if (l.C1420.f5096 <= 0) goto L15;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m45008(l.C16560 r24, l.InterfaceC17889 r25, l.AbstractC15440 r26) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19568.m45008(l.ܽۢܳ, l.ᩳۜܳ, l.ܶ᩵ܿ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c0, code lost:
    
        if (l.C4263.f13799 > 0) goto L20;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m45004(l.C16560 r52, java.util.ArrayList r53, l.InterfaceC17889 r54, android.content.DialogInterface r55, int r56) {
        /*
            Method dump skipped, instructions count: 4240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19568.m45004(l.ܽۢܳ, java.util.ArrayList, l.ᩳۜܳ, android.content.DialogInterface, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45003(AbstractActivityC3346 abstractActivityC3346, byte[] bArr) {
        short[] sArr;
        short[] sArr2;
        TextView textView;
        String str;
        int m2566;
        int i;
        int i2;
        View view;
        short[] sArr3;
        TextView textView2;
        String str2;
        int i3;
        short[] sArr4;
        int i4;
        short[] sArr5;
        int i5;
        int i6;
        View view2;
        TextView textView3;
        String str3;
        int i7;
        short[] sArr6;
        int i8;
        short[] sArr7;
        int m25662;
        int i9;
        int i10;
        int i11;
        int i12;
        short[] sArr8;
        View m10739;
        int i13;
        int m6981;
        int i14;
        int m25663;
        int i15;
        int i16;
        String str4 = null;
        int i17 = 483758826;
        int i18 = C1773.f6144;
        int i19 = C5695.f17556;
        int m69812 = (i19 - C2105.m6981("۫۬")) * (-77);
        int i20 = ((m69812 ^ i18) * 25517) ^ 237802952;
        int i21 = m69812 ^ 1188459405;
        TextView textView4 = null;
        TextView textView5 = null;
        TextView textView6 = null;
        TextView textView7 = null;
        C19258 c19258 = null;
        Object obj = null;
        String str5 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        int i22 = 0;
        View view3 = null;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        short s = 0;
        int i35 = 0;
        C12918 c12918 = null;
        int i36 = 0;
        String str6 = null;
        int i37 = 0;
        short[] sArr11 = null;
        while (true) {
            String str7 = str4;
            while (true) {
                sArr = sArr11;
                while (true) {
                    i17 = i21 ^ (i20 & (((i17 ^ i18) * (-25819)) >> 31));
                    switch (i17) {
                        case -2104327261:
                        case -528765041:
                            view = view3;
                            sArr3 = sArr;
                            textView2 = textView4;
                            str2 = str7;
                            i3 = i36;
                            sArr4 = sArr10;
                            i4 = i37;
                            sArr5 = sArr9;
                            short s2 = f63246[241];
                            int i38 = s2 + 261;
                            i35 = i38 * i38;
                            int m69813 = (C2105.m6981("᩻᩸") + i18) * (-35);
                            i5 = ((m69813 ^ i19) * (-28139)) ^ (-1681843783);
                            i6 = m69813 ^ 687115371;
                            s = s2;
                            sArr9 = sArr5;
                            sArr10 = sArr4;
                            i37 = i4;
                            i36 = i3;
                            str7 = str2;
                            textView4 = textView2;
                            sArr = sArr3;
                            i21 = i6;
                            i20 = i5;
                            view3 = view;
                        case -2049888088:
                        case 1703594834:
                            sArr2 = sArr;
                            textView = textView5;
                            str = str7;
                            C7811.m20840(textView, str);
                            sArr10 = f63246;
                            i23 = 3;
                            if (C0630.f2410 <= 0) {
                                i37 = 251;
                                int m69814 = C2105.m6981("ۨۢ") ^ i18;
                                str7 = str;
                                sArr = sArr2;
                                i21 = m69814 ^ 1610938577;
                                TextView textView8 = textView;
                                i20 = ((m69814 ^ i19) * (-16791)) ^ 714952891;
                                sArr10 = sArr10;
                                textView5 = textView8;
                            } else {
                                int m25664 = C0630.m2566("ܺᩳ") ^ i19;
                                textView5 = textView;
                                i20 = ((m25664 ^ i18) * 3913) ^ (-1676180528);
                                str7 = str;
                                sArr = sArr2;
                                i37 = 251;
                                i21 = m25664 ^ (-523232384);
                            }
                        case -1621416142:
                        case -1375458035:
                            ViewOnClickListenerC1958.m6441(c19258, i26, obj);
                            i27 = C2105.m6981(C2126.m7036(f63246, 269, 3, i22)) ^ 2129385567;
                            m25663 = (C2105.m6981("۬ۤ") + i18) * 31;
                            i15 = ((m25663 ^ i19) * (-8593)) ^ 1134436303;
                            i16 = -1648330423;
                            i21 = m25663 ^ i16;
                            i20 = i15;
                        case -1512863895:
                        case 378842144:
                            C4616.m13548((TextView) C1005.m3507(view3, i25), C0050.m935(c12918.m31421()));
                            c19258 = C0483.m2130(abstractActivityC3346);
                            C0798.m3013(c19258, view3);
                            sArr = f63246;
                            m25663 = C2105.m6981("֡᩵") ^ i19;
                            i15 = ((m25663 ^ i18) * 15183) ^ (-810806355);
                            i16 = 55656146;
                            i21 = m25663 ^ i16;
                            i20 = i15;
                        case -1483435523:
                        case 129835395:
                            sArr2 = sArr;
                            C4616.m13548((TextView) C11340.m28028(view3, i32 ^ i33), C0050.m935(c12918.m31396()));
                            if (C3683.f11629 < 0) {
                                m2566 = (C0630.m2566("᩷ۙ") ^ i18) * (-83);
                                i = ((m2566 ^ i19) * (-4985)) ^ (-1456024925);
                                i2 = -1814975693;
                                break;
                            }
                            m10739 = view3;
                            textView3 = textView4;
                            str3 = str7;
                            i11 = i36;
                            sArr6 = sArr10;
                            i12 = i37;
                            sArr8 = sArr9;
                            int m69815 = C2105.m6981("ܳܺ") ^ i19;
                            sArr9 = sArr8;
                            sArr10 = sArr6;
                            i37 = i12;
                            i36 = i11;
                            str7 = str3;
                            textView4 = textView3;
                            sArr = sArr2;
                            i21 = m69815 ^ 1491946541;
                            i20 = ((m69815 ^ i18) * (-4257)) ^ (-1357115516);
                            view3 = m10739;
                            c12918 = null;
                        case -1454200758:
                        case -152832002:
                            view2 = view3;
                            sArr2 = sArr;
                            textView3 = textView4;
                            str3 = str7;
                            i7 = i36;
                            sArr6 = sArr10;
                            i8 = i37;
                            sArr7 = sArr9;
                            i22 = 16356;
                            m25662 = (C0630.m2566("֡֡") ^ i18) * 59;
                            i20 = ((m25662 ^ i19) * 27739) ^ (-79688813);
                            i9 = 213601063;
                            i10 = m25662 ^ i9;
                            sArr9 = sArr7;
                            i37 = i8;
                            view3 = view2;
                            i36 = i7;
                            str7 = str3;
                            sArr = sArr2;
                            i21 = i10;
                            sArr10 = sArr6;
                            textView4 = textView3;
                        case -1286386228:
                        case 1348418757:
                            view2 = view3;
                            sArr2 = sArr;
                            textView3 = textView4;
                            str3 = str7;
                            i7 = i36;
                            sArr6 = sArr10;
                            i8 = i37;
                            sArr7 = sArr9;
                            int i39 = (s * s) + 68121;
                            if ((i39 + i39) - i35 >= 0) {
                                m25662 = C2105.m6981("᩸ۙ") ^ i19;
                                i20 = ((m25662 ^ i18) * 32187) ^ (-1444071948);
                                i9 = 467135688;
                            } else {
                                m25662 = (C0630.m2566("ۚܺ") ^ i19) * 93;
                                i20 = ((m25662 ^ i18) * (-25807)) ^ 106723989;
                                i9 = -888020156;
                            }
                            i10 = m25662 ^ i9;
                            sArr9 = sArr7;
                            i37 = i8;
                            view3 = view2;
                            i36 = i7;
                            str7 = str3;
                            sArr = sArr2;
                            i21 = i10;
                            sArr10 = sArr6;
                            textView4 = textView3;
                        case -1276112218:
                        case 1965074778:
                            i25 = C2105.m6981(C1916.m6311(f63246, 263, 3, i22)) ^ 2101981974;
                            if (C3432.m10477() > 0) {
                                m25663 = C2105.m6981("᩺ۛ") ^ i18;
                                i15 = ((m25663 ^ i19) * (-19769)) ^ (-1342767799);
                                i16 = -1955734210;
                                i21 = m25663 ^ i16;
                                i20 = i15;
                            }
                            m25663 = C2105.m6981("ᩴᩳ") ^ i18;
                            i15 = ((m25663 ^ i19) * (-22149)) ^ 764478265;
                            i16 = 2090562506;
                            i21 = m25663 ^ i16;
                            i20 = i15;
                        case -1271009368:
                        case 1073013672:
                            sArr2 = sArr;
                            textView7 = (TextView) C11340.m28028(view3, i34 ^ 2130269910);
                            if (C0050.f910 < 0) {
                                m2566 = C0630.m2566("᩸ۧ") ^ i18;
                                i = ((m2566 ^ i19) * (-7129)) ^ (-305402638);
                                i2 = 258432683;
                                break;
                            }
                            textView = textView5;
                            str = str7;
                            int m698142 = C2105.m6981("ۨۢ") ^ i18;
                            str7 = str;
                            sArr = sArr2;
                            i21 = m698142 ^ 1610938577;
                            TextView textView82 = textView;
                            i20 = ((m698142 ^ i19) * (-16791)) ^ 714952891;
                            sArr10 = sArr10;
                            textView5 = textView82;
                        case -1243968995:
                        case 1100388835:
                            C1504.m5179();
                            if (C3019.f9544 < 0) {
                                sArr2 = sArr;
                                textView = textView5;
                                str = str7;
                                int m6981422 = C2105.m6981("ۨۢ") ^ i18;
                                str7 = str;
                                sArr = sArr2;
                                i21 = m6981422 ^ 1610938577;
                                TextView textView822 = textView;
                                i20 = ((m6981422 ^ i19) * (-16791)) ^ 714952891;
                                sArr10 = sArr10;
                                textView5 = textView822;
                            } else {
                                m25663 = C2105.m6981("ᩴᩳ") ^ i18;
                                i15 = ((m25663 ^ i19) * (-22149)) ^ 764478265;
                                i16 = 2090562506;
                                i21 = m25663 ^ i16;
                                i20 = i15;
                            }
                        case -1222818308:
                        case 315617391:
                            ViewOnClickListenerC1958.m6429();
                            if (C3663.m11168() >= 0) {
                                break;
                            }
                            sArr2 = sArr;
                            textView = textView5;
                            str = str7;
                            int m69814222 = C2105.m6981("ۨۢ") ^ i18;
                            str7 = str;
                            sArr = sArr2;
                            i21 = m69814222 ^ 1610938577;
                            TextView textView8222 = textView;
                            i20 = ((m69814222 ^ i19) * (-16791)) ^ 714952891;
                            sArr10 = sArr10;
                            textView5 = textView8222;
                        case -1101519287:
                        case 832991888:
                            sArr3 = sArr;
                            textView2 = textView4;
                            str2 = str7;
                            sArr4 = sArr10;
                            i4 = i37;
                            view = view3;
                            sArr5 = sArr9;
                            i13 = i36;
                            i29 = C0630.m2566(C0382.m1840(sArr5, i13, 3, i22));
                            if (!C2126.f7087) {
                                i3 = i13;
                                m6981 = C2105.m6981("֫ۙ") ^ i19;
                                i5 = ((m6981 ^ i18) * 22749) ^ (-1627517767);
                                i14 = -418103539;
                                i6 = m6981 ^ i14;
                                sArr9 = sArr5;
                                sArr10 = sArr4;
                                i37 = i4;
                                i36 = i3;
                                str7 = str2;
                                textView4 = textView2;
                                sArr = sArr3;
                                i21 = i6;
                                i20 = i5;
                                view3 = view;
                            }
                            m6981 = C0630.m2566("ۚۤ") ^ i19;
                            i3 = i13;
                            i5 = ((m6981 ^ i18) * (-17935)) ^ 22421416;
                            i14 = -521358;
                            i6 = m6981 ^ i14;
                            sArr9 = sArr5;
                            sArr10 = sArr4;
                            i37 = i4;
                            i36 = i3;
                            str7 = str2;
                            textView4 = textView2;
                            sArr = sArr3;
                            i21 = i6;
                            i20 = i5;
                            view3 = view;
                        case -948309805:
                        case 748309990:
                            sArr2 = sArr;
                            textView3 = textView4;
                            str3 = str7;
                            sArr6 = sArr10;
                            C7811.m20840(textView3, str6);
                            i12 = i37;
                            i30 = C2105.m6981(C0714.m2816(f63246, 248, 3, i22));
                            i31 = 2126060006;
                            if (C3663.m11168() >= 0) {
                                m10739 = view3;
                                sArr8 = sArr9;
                                i11 = i36;
                                int m698152 = C2105.m6981("ܳܺ") ^ i19;
                                sArr9 = sArr8;
                                sArr10 = sArr6;
                                i37 = i12;
                                i36 = i11;
                                str7 = str3;
                                textView4 = textView3;
                                sArr = sArr2;
                                i21 = m698152 ^ 1491946541;
                                i20 = ((m698152 ^ i18) * (-4257)) ^ (-1357115516);
                                view3 = m10739;
                                c12918 = null;
                            } else {
                                int m25665 = (C0630.m2566("֡᩷") + i19) * (-73);
                                i20 = ((m25665 ^ i18) * 9583) ^ 1022985523;
                                i10 = m25665 ^ 2022559287;
                                i37 = i12;
                                str7 = str3;
                                sArr = sArr2;
                                i21 = i10;
                                sArr10 = sArr6;
                                textView4 = textView3;
                            }
                        case -914685067:
                        case -571531999:
                            view2 = view3;
                            sArr2 = sArr;
                            textView3 = textView4;
                            str3 = str7;
                            i7 = i36;
                            sArr6 = sArr10;
                            i8 = i37;
                            sArr7 = sArr9;
                            i28 = C0630.m2566(C1005.m3502(f63246, 242, 3, i22));
                            m25662 = (C2105.m6981("ۜ۬") ^ i18) * 73;
                            i20 = ((m25662 ^ i19) * 17897) ^ (-799305342);
                            i9 = 1728679071;
                            i10 = m25662 ^ i9;
                            sArr9 = sArr7;
                            i37 = i8;
                            view3 = view2;
                            i36 = i7;
                            str7 = str3;
                            sArr = sArr2;
                            i21 = i10;
                            sArr10 = sArr6;
                            textView4 = textView3;
                        case -771699886:
                        case -603939936:
                            C7811.m20840((TextView) C1005.m3507(view3, C2105.m6981(str5) ^ 2117573493), C0422.m1962(c12918.m31400()));
                            m25663 = C0630.m2566("۬᩷") ^ i19;
                            i15 = ((m25663 ^ i18) * 5739) ^ 1626786034;
                            i16 = -1743292410;
                            i21 = m25663 ^ i16;
                            i20 = i15;
                        case -431526913:
                        case 1292326871:
                            view2 = view3;
                            sArr2 = sArr;
                            textView3 = textView4;
                            str3 = str7;
                            i7 = i36;
                            sArr6 = sArr10;
                            i8 = i37;
                            sArr7 = sArr9;
                            i22 = 42754;
                            m25662 = (C0630.m2566("֡֡") ^ i18) * 59;
                            i20 = ((m25662 ^ i19) * 27739) ^ (-79688813);
                            i9 = 213601063;
                            i10 = m25662 ^ i9;
                            sArr9 = sArr7;
                            i37 = i8;
                            view3 = view2;
                            i36 = i7;
                            str7 = str3;
                            sArr = sArr2;
                            i21 = i10;
                            sArr10 = sArr6;
                            textView4 = textView3;
                        case -295250319:
                        case 1689009639:
                            i26 = C2105.m6981(ViewOnClickListenerC1958.m6435(sArr, 266, 3, i22)) ^ 2118437210;
                            obj = null;
                            if (C22628.f73083 <= 0) {
                                view = view3;
                                sArr3 = sArr;
                                textView2 = textView4;
                                str2 = str7;
                                i13 = i36;
                                sArr4 = sArr10;
                                i4 = i37;
                                sArr5 = sArr9;
                                m6981 = C0630.m2566("ۚۤ") ^ i19;
                                i3 = i13;
                                i5 = ((m6981 ^ i18) * (-17935)) ^ 22421416;
                                i14 = -521358;
                                i6 = m6981 ^ i14;
                                sArr9 = sArr5;
                                sArr10 = sArr4;
                                i37 = i4;
                                i36 = i3;
                                str7 = str2;
                                textView4 = textView2;
                                sArr = sArr3;
                                i21 = i6;
                                i20 = i5;
                                view3 = view;
                            } else {
                                m25663 = C2105.m6981("ܿܽ") ^ i19;
                                i15 = ((m25663 ^ i18) * 26055) ^ (-2060939898);
                                i16 = 1919738043;
                                i21 = m25663 ^ i16;
                                i20 = i15;
                            }
                        case -238600946:
                        case 1138961758:
                            sArr2 = sArr;
                            C4616.m13548(textView6, C0050.m935(i24));
                            i32 = C0630.m2566(C5695.m16034(f63246, Scalar25519.TARGET_LENGTH, 3, i22));
                            i33 = 2121716547;
                            m2566 = (i19 - C2105.m6981("ۢۜ")) * (-5);
                            i = ((m2566 ^ i18) * 14785) ^ (-1612153305);
                            i2 = 1515031276;
                            break;
                        case -197241668:
                        case 595834684:
                            sArr2 = sArr;
                            textView5 = (TextView) C11340.m28028(view3, i30 ^ i31);
                            str7 = C0422.m1962(c12918.m31410());
                            m2566 = (C0630.m2566("۟ᩳ") + i18) * 21;
                            i = ((m2566 ^ i19) * 1475) ^ 1680438677;
                            i2 = 1347263770;
                            break;
                        case 120729342:
                        case 170109396:
                            break;
                        case 210879906:
                        case 567870514:
                            C7811.m20840(textView7, C0050.m935(c12918.m31423()));
                            sArr2 = sArr;
                            str5 = C1711.m5726(f63246, 260, 3, i22);
                            if (!AbstractC2021.m6574()) {
                                m2566 = (C0630.m2566("ܳۤ") ^ i18) * 81;
                                i = ((m2566 ^ i19) * (-8863)) ^ (-1357764430);
                                i2 = 469289797;
                                break;
                            }
                            m10739 = view3;
                            textView3 = textView4;
                            str3 = str7;
                            i11 = i36;
                            sArr6 = sArr10;
                            i12 = i37;
                            sArr8 = sArr9;
                            int m6981522 = C2105.m6981("ܳܺ") ^ i19;
                            sArr9 = sArr8;
                            sArr10 = sArr6;
                            i37 = i12;
                            i36 = i11;
                            str7 = str3;
                            textView4 = textView3;
                            sArr = sArr2;
                            i21 = m6981522 ^ 1491946541;
                            i20 = ((m6981522 ^ i18) * (-4257)) ^ (-1357115516);
                            view3 = m10739;
                            c12918 = null;
                        case 233292206:
                        case 1918991078:
                            sArr2 = sArr;
                            textView6 = (TextView) C1005.m3507(view3, C2105.m6981(C0382.m1840(sArr10, i37, i23, i22)) ^ 2128237906);
                            i24 = c12918.m31408();
                            if (C2167.f7158 < 0) {
                                m2566 = C2105.m6981("ۢۛ") ^ i18;
                                i = ((m2566 ^ i19) * 1109) ^ (-1520917720);
                                i2 = -545619775;
                                break;
                            }
                            break;
                        case 325910837:
                        case 1320764893:
                            C3245.m9925();
                            ServiceConnectionC3453.m10564();
                            break;
                        case 360560667:
                        case 779625923:
                            C1047.m3599();
                            ServiceConnectionC3453.m10564();
                            sArr2 = sArr;
                            textView = textView5;
                            str = str7;
                            int m698142222 = C2105.m6981("ۨۢ") ^ i18;
                            str7 = str;
                            sArr = sArr2;
                            i21 = m698142222 ^ 1610938577;
                            TextView textView82222 = textView;
                            i20 = ((m698142222 ^ i19) * (-16791)) ^ 714952891;
                            sArr10 = sArr10;
                            textView5 = textView82222;
                        case 566391504:
                        case 1378180163:
                            C1711.m5736();
                            if (C0714.f2697 < 0) {
                                break;
                            }
                            view = view3;
                            sArr3 = sArr;
                            textView2 = textView4;
                            str2 = str7;
                            i13 = i36;
                            sArr4 = sArr10;
                            i4 = i37;
                            sArr5 = sArr9;
                            m6981 = C0630.m2566("ۚۤ") ^ i19;
                            i3 = i13;
                            i5 = ((m6981 ^ i18) * (-17935)) ^ 22421416;
                            i14 = -521358;
                            i6 = m6981 ^ i14;
                            sArr9 = sArr5;
                            sArr10 = sArr4;
                            i37 = i4;
                            i36 = i3;
                            str7 = str2;
                            textView4 = textView2;
                            sArr = sArr3;
                            i21 = i6;
                            i20 = i5;
                            view3 = view;
                        case 856927113:
                        case 1337468194:
                            sArr2 = sArr;
                            textView3 = textView4;
                            str3 = str7;
                            i11 = i36;
                            sArr6 = sArr10;
                            i12 = i37;
                            sArr8 = sArr9;
                            m10739 = C3537.m10739(abstractActivityC3346, i28 ^ 2123663398);
                            if (C1504.f5354) {
                                int m69815222 = C2105.m6981("ܳܺ") ^ i19;
                                sArr9 = sArr8;
                                sArr10 = sArr6;
                                i37 = i12;
                                i36 = i11;
                                str7 = str3;
                                textView4 = textView3;
                                sArr = sArr2;
                                i21 = m69815222 ^ 1491946541;
                                i20 = ((m69815222 ^ i18) * (-4257)) ^ (-1357115516);
                                view3 = m10739;
                                c12918 = null;
                            } else {
                                C12918 c129182 = new C12918(bArr, 0, true);
                                sArr9 = f63246;
                                i36 = 245;
                                int m69816 = C2105.m6981("֡ۛ") ^ i19;
                                sArr10 = sArr6;
                                textView4 = textView3;
                                c12918 = c129182;
                                i20 = ((m69816 ^ i18) * (-12197)) ^ (-74952224);
                                i37 = i12;
                                str7 = str3;
                                sArr = sArr2;
                                i21 = m69816 ^ (-594417763);
                                view3 = m10739;
                            }
                        case 885643035:
                        case 1058349823:
                            C2520.m8033(c19258, i27, obj);
                            C4159.m12564(C7811.m20839(RunnableC0588.m2438(c19258)), new ViewOnClickListenerC3420(view3, 2));
                            break;
                        default:
                            sArr2 = sArr;
                            i34 = C2105.m6981(RunnableC1937.m6385(f63246, 257, 3, i22));
                            m2566 = C0630.m2566("ۡ᩷") ^ i19;
                            i = ((m2566 ^ i18) * 12795) ^ (-813556851);
                            i2 = -758961079;
                            break;
                    }
                    return;
                }
                sArr2 = sArr;
                m2566 = (C0630.m2566("ۙۙ") + i19) * 25;
                i = ((m2566 ^ i18) * (-14771)) ^ 1305060685;
                i2 = 1057633924;
                sArr11 = sArr2;
                i21 = m2566 ^ i2;
                i20 = i;
            }
            short[] sArr12 = sArr10;
            short[] sArr13 = sArr;
            str4 = str7;
            int i40 = i37;
            TextView textView9 = (TextView) C1005.m3507(view3, i29 ^ 2130640431);
            String str8 = new String(bArr, 4, 3);
            int m69817 = C2105.m6981("ܿۘ") ^ i18;
            sArr10 = sArr12;
            textView4 = textView9;
            str6 = str8;
            i20 = ((m69817 ^ i19) * 8791) ^ 899997277;
            sArr11 = sArr13;
            i21 = m69817 ^ 36162409;
            i37 = i40;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ff, code lost:
    
        if ((r1 instanceof l.C12645) != false) goto L59;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m45006(l.C16560 r31, l.InterfaceC17889 r32) {
        /*
            Method dump skipped, instructions count: 1494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19568.m45006(l.ܽۢܳ, l.ᩳۜܳ):void");
    }
}
