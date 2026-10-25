package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.KeyEvent;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* compiled from: N5VT */
/* renamed from: l.ۤۡ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class ServiceConnectionC10197 extends AbstractActivityC3346 implements CompoundButton.OnCheckedChangeListener, ServiceConnection {

    /* renamed from: ۖ֨ۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f30638 = {7773, -29756, 22852, -31851, -29840, -22457, -30371, -9001, -8995, -8994, -9008, -9019, -9000, -8993, -9002, -8978, -9005, -9020, -9019, -9019, -8994, -8993, -8978, -9022, -9019, -9000, -9006, -8998, -8978, -9019, -8994, -8978, -9004, -9003, -9002, -9004, 20336, 21776, -18423, -9004, -8993, -9008, -9005, -8995, -9004, -8978, -9005, -9000, -8993, -8978, -9006, -8994, -8993, -9017, -9004, -9021, -9019, -9004, -8993, -9008, -9005, -8995, -9004, -8978, -8994, -9006, -9019, -8978, -9006, -8994, -8993, -9017, -9004, -9021, -9019, 8013, -27831, 24151, 30933, -26554, -30214, 29123, 16466, 28724, -24953, -29568, 21015, -26687, 3825, 3835, 3832, 3830, 3811, 3838, 3833, 3824, 3784, 3829, 3810, 3811, 3811, 3832, 3833, 3784, 3812, 3811, 3838, 3828, 3836, 3784, 3811, 3832, 3784, 3826, 3827, 3824, 3826, 29807, 26396, 26389, 3826, 3833, 3830, 3829, 3835, 3826, 3784, 3829, 3838, 3833, 3784, 3828, 3832, 3833, 3809, 3826, 3813, 3811, -26371, -26394, 22833, 3826, 3833, 3830, 3829, 3835, 3826, 3784, 3832, 3828, 3811, 3784, 3828, 3832, 3833, 3809, 3826, 3813, 3811, 147, -27893, 28081, -32011, 30159, -31345, 28240, 2084, -29293, -29280, -29279, -29263, -29309, -29273, -29257, -29280, -29269, -29311, -29257, -29274, -29274, -29253, -29252, -29259, -29279};

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30639 = 0;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public BinderC3141 f30640;

    @Override // l.AbstractActivityC3346
    /* renamed from: ֫ */
    public final void mo117(C20986 c20986) {
    }

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = -980436734;
        int i6 = ServiceConnectionC3453.f10921;
        int i7 = C0483.f2088;
        int m2566 = (C0630.m2566("۟ۨ") + i6) * 91;
        int i8 = ((m2566 ^ i7) * (-30249)) ^ (-606658667);
        int i9 = 190185365;
        while (true) {
            i5 = ((((i5 ^ i7) * 1697) >> 31) & i8) ^ (m2566 ^ i9);
            switch (i5) {
                case -2069043058:
                case -1775977039:
                    C0422.m1963();
                    return null;
                case -1956359363:
                case 489510164:
                    s2 = 1;
                    if (C1420.f5096 <= 0) {
                        m2566 = (C0630.m2566("ۜᩳ") ^ i6) * (-79);
                        i8 = ((m2566 ^ i7) * 22243) ^ (-2080148983);
                        i9 = 2039569064;
                    } else {
                        m2566 = C2105.m6981("᩷֡") ^ i6;
                        i8 = ((m2566 ^ i7) * 811) ^ 2025995052;
                        i9 = 1005668100;
                    }
                case -1910561219:
                case -652649171:
                    s = sArr[c];
                    if (C0798.f2919) {
                        m2566 = C2105.m6981("ۡܽ") ^ i6;
                        i8 = ((m2566 ^ i7) * (-23479)) ^ 2070315640;
                        i9 = 1750843778;
                    } else {
                        m2566 = (i6 - C2105.m6981("֨ۢ")) * 109;
                        i8 = ((m2566 ^ i7) * 9451) ^ 882469996;
                        i9 = -660251722;
                    }
                case -1815838463:
                case -687503234:
                    int i10 = s + s2;
                    if (i2 - (i10 * i10) > 0) {
                        m2566 = C2105.m6981("ۡۤ") ^ i6;
                        i8 = ((m2566 ^ i7) * (-20319)) ^ 1976284444;
                        i9 = 869280471;
                    } else {
                        m2566 = (C2105.m6981("ۨ᩷") ^ i7) * (-111);
                        i8 = ((m2566 ^ i6) * 18113) ^ (-637392905);
                        i9 = 123334089;
                    }
                case -1807804057:
                case -1622006958:
                    if (C0964.f3626 != 0) {
                        m2566 = (C2105.m6981("۟ۤ") ^ i7) * (-43);
                        i8 = ((m2566 ^ i6) * (-30025)) ^ (-146132918);
                        i9 = -537561616;
                    } else {
                        m2566 = C2105.m6981("᩶ܺ") ^ i7;
                        i8 = ((m2566 ^ i6) * (-10817)) ^ 1618587856;
                        i9 = -1910818222;
                    }
                case -1707628600:
                case -551091324:
                    i3 = 47591;
                    m2566 = (C2105.m6981("֫ܺ") + i7) * 51;
                    i8 = ((m2566 ^ i6) * 24605) ^ (-1750607413);
                    i9 = 1056705565;
                case -1535589264:
                case -242749308:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = (C0630.m2566("ۜᩳ") ^ i6) * (-79);
                        i8 = ((m2566 ^ i7) * 22243) ^ (-2080148983);
                        i9 = 2039569064;
                    } else {
                        m2566 = C2105.m6981("ܰ۟") ^ i6;
                        i8 = ((m2566 ^ i7) * 2595) ^ 1806135841;
                        i9 = 2026375608;
                    }
                case -1506836321:
                case 1524643978:
                    AbstractC2021.m6574();
                    if (RunnableC1937.f6483 < 0) {
                        m2566 = (C2105.m6981("۟ۤ") ^ i7) * (-43);
                        i8 = ((m2566 ^ i6) * (-30025)) ^ (-146132918);
                        i9 = -537561616;
                    } else {
                        m2566 = C0630.m2566("᩷᩷") ^ i7;
                        i8 = ((m2566 ^ i6) * 20427) ^ 2077987175;
                        i9 = -912779529;
                    }
                case -889519933:
                case 925340982:
                    sArr = f30638;
                    if (C4616.f14690 <= 0) {
                        m2566 = C0630.m2566("᩷᩷") ^ i7;
                        i8 = ((m2566 ^ i6) * 20427) ^ 2077987175;
                        i9 = -912779529;
                    } else {
                        m2566 = (C2105.m6981("᩷ܽ") + i6) * (-101);
                        i8 = ((m2566 ^ i7) * (-11867)) ^ 2139475671;
                        i9 = -463622484;
                    }
                case -739614750:
                case 381160980:
                    C2520.m8026();
                    if (C1773.f6144 <= 0) {
                        m2566 = (C2105.m6981("۟ۤ") ^ i7) * (-43);
                        i8 = ((m2566 ^ i6) * (-30025)) ^ (-146132918);
                        i9 = -537561616;
                    } else {
                        m2566 = (C0630.m2566("ۗܳ") ^ i6) * 9;
                        i8 = ((m2566 ^ i7) * 2565) ^ (-1189261102);
                        i9 = 777553847;
                    }
                case -367162699:
                case 1043596952:
                    i2 = i + 1;
                    if (C5695.f17556 >= 0) {
                        m2566 = (C2105.m6981("۟ۤ") ^ i7) * (-43);
                        i8 = ((m2566 ^ i6) * (-30025)) ^ (-146132918);
                        i9 = -537561616;
                    } else {
                        m2566 = (C2105.m6981("᩺᩶") ^ i6) * 31;
                        i8 = ((m2566 ^ i7) * (-29585)) ^ (-2052504336);
                        i9 = 986110985;
                    }
                case 103288603:
                case 1038135880:
                    i = s * 2;
                    if (C3432.f10845 >= 0) {
                        m2566 = (C0630.m2566("ۜᩳ") ^ i6) * (-79);
                        i8 = ((m2566 ^ i7) * 22243) ^ (-2080148983);
                        i9 = 2039569064;
                    } else {
                        m2566 = (i7 - C0630.m2566("᩸ܺ")) * (-89);
                        i8 = ((m2566 ^ i6) * (-8089)) ^ 456950636;
                        i9 = 1407375871;
                    }
                case 141493518:
                case 1255315499:
                    sArr2 = f30638;
                    i4 = 167;
                    if (C1420.f5096 <= 0) {
                        m2566 = (C0630.m2566("ۗܳ") ^ i6) * 9;
                        i8 = ((m2566 ^ i7) * 2565) ^ (-1189261102);
                        i9 = 777553847;
                    } else {
                        m2566 = (i7 - C2105.m6981("ᩴ᩻")) * 47;
                        i8 = ((m2566 ^ i6) * (-4945)) ^ 1148335288;
                        i9 = 1082542819;
                    }
                case 434649606:
                case 1525833646:
                    C0237.m1481();
                    C3663.m11168();
                    m2566 = C2105.m6981("ۡܽ") ^ i6;
                    i8 = ((m2566 ^ i7) * (-23479)) ^ 2070315640;
                    i9 = 1750843778;
                case 794647324:
                case 1689783550:
                    if (C2126.f7087) {
                        m2566 = (C2105.m6981("۟ۤ") ^ i7) * (-43);
                        i8 = ((m2566 ^ i6) * (-30025)) ^ (-146132918);
                        i9 = -537561616;
                    } else {
                        m2566 = C2105.m6981("᩶ܰ") ^ i7;
                        i8 = ((m2566 ^ i6) * 3011) ^ (-1791097553);
                        i9 = 782736893;
                    }
                case 953361541:
                case 1295241806:
                    i3 = 36306;
                    m2566 = (C2105.m6981("֫ܺ") + i7) * 51;
                    i8 = ((m2566 ^ i6) * 24605) ^ (-1750607413);
                    i9 = 1056705565;
                case 1114886306:
                case 2062034715:
                    if (C0798.f2919) {
                        m2566 = (C2105.m6981("۟ۤ") ^ i7) * (-43);
                        i8 = ((m2566 ^ i6) * (-30025)) ^ (-146132918);
                        i9 = -537561616;
                    } else {
                        m2566 = C2105.m6981("ۡܽ") ^ i6;
                        i8 = ((m2566 ^ i7) * (-23479)) ^ 2070315640;
                        i9 = 1750843778;
                    }
                case 1181434956:
                case 1362843605:
                    c = 166;
                    if (C3432.f10845 >= 0) {
                        m2566 = (C2105.m6981("۟ۤ") ^ i7) * (-43);
                        i8 = ((m2566 ^ i6) * (-30025)) ^ (-146132918);
                        i9 = -537561616;
                    } else {
                        m2566 = C2105.m6981("۟ܳ") ^ i7;
                        i8 = ((m2566 ^ i6) * (-21445)) ^ 1865445965;
                        i9 = 104519450;
                    }
                default:
                    return C2272.m7507(sArr2, i4, 17, i3);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BinderC3141 binderC3141 = null;
        int i = -1814660418;
        int i2 = C4263.f13799;
        int i3 = C0422.f1886;
        int m6981 = C2105.m6981("ܽۛ") ^ i2;
        int i4 = ((m6981 ^ i3) * (-23203)) ^ (-1774361411);
        int i5 = 1709243979;
        while (true) {
            i = ((((i ^ i3) * 22129) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2045495679:
                case 452929681:
                    if (C1916.f6442) {
                        m6981 = (C0630.m2566("ۢ۬") + i2) * (-127);
                        i4 = ((m6981 ^ i3) * 2179) ^ 1112741345;
                        i5 = 1652424684;
                    } else {
                        m6981 = (i3 - C2105.m6981("۬᩶")) * (-29);
                        i4 = ((m6981 ^ i2) * (-9457)) ^ (-1493260642);
                        i5 = 53359349;
                    }
                case -1946799942:
                case -920011053:
                    binderC3141 = (BinderC3141) iBinder;
                    if (C22628.f73083 <= 0) {
                        m6981 = C2105.m6981("ۚܽ") ^ i3;
                        i4 = ((m6981 ^ i2) * 10919) ^ (-289898908);
                        i5 = -2127864308;
                    } else {
                        m6981 = (C0630.m2566("ܽ᩸") + i3) * 11;
                        i4 = ((m6981 ^ i2) * 11295) ^ (-2119364106);
                        i5 = -839390211;
                    }
                case -1920057351:
                case 2080352036:
                    if (C0798.f2919) {
                        m6981 = (i3 - C2105.m6981("۬᩶")) * (-29);
                        i4 = ((m6981 ^ i2) * (-9457)) ^ (-1493260642);
                        i5 = 53359349;
                    } else {
                        m6981 = (C2105.m6981("ۖۢ") ^ i2) * (-73);
                        i4 = ((m6981 ^ i3) * 10791) ^ 195023367;
                        i5 = 470285382;
                    }
                case -1715419474:
                case 965594572:
                    RunnableC3474.m10630();
                    if (C22628.f73083 <= 0) {
                        m6981 = (i2 - C0630.m2566("۫ܳ")) * 13;
                        i4 = ((m6981 ^ i3) * 20331) ^ 1509063024;
                        i5 = -98329144;
                    } else {
                        m6981 = (i3 - C2105.m6981("۬᩶")) * (-29);
                        i4 = ((m6981 ^ i2) * (-9457)) ^ (-1493260642);
                        i5 = 53359349;
                    }
                case -1217158004:
                case 1698244739:
                    if (C3663.m11168() >= 0) {
                        m6981 = C2105.m6981("ۚܽ") ^ i3;
                        i4 = ((m6981 ^ i2) * 10919) ^ (-289898908);
                        i5 = -2127864308;
                    } else {
                        m6981 = C0630.m2566("ۚᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-19179)) ^ 292236850;
                        i5 = -1788505566;
                    }
                case -1169862820:
                case 745585389:
                    C3911.m11924();
                    C0382.m1848();
                    m6981 = (i2 - C0630.m2566("۫ܳ")) * 13;
                    i4 = ((m6981 ^ i3) * 20331) ^ 1509063024;
                    i5 = -98329144;
                case -604029255:
                case 6607606:
                    if (C3432.m10477() <= 0) {
                        m6981 = C2105.m6981("۠֫") ^ i2;
                        i4 = ((m6981 ^ i3) * (-8117)) ^ 934492677;
                        i5 = 799044822;
                    } else {
                        m6981 = C2105.m6981("ۗ᩷") ^ i2;
                        i4 = ((m6981 ^ i3) * (-28475)) ^ 1576052836;
                        i5 = -42632837;
                    }
                case -539933815:
                case -378722213:
                    this.f30640 = binderC3141;
                    binderC3141.m9566();
                    this.f30640.m9568();
                    break;
                case -383408842:
                case 226070458:
                    if (C3683.f11629 >= 0) {
                        m6981 = (i3 - C2105.m6981("۬᩶")) * (-29);
                        i4 = ((m6981 ^ i2) * (-9457)) ^ (-1493260642);
                        i5 = 53359349;
                    } else {
                        m6981 = C0630.m2566("ܰۧ") ^ i3;
                        i4 = ((m6981 ^ i2) * 11939) ^ (-318810186);
                        i5 = -451533648;
                    }
                case -328059113:
                case 1059557008:
                    if (RunnableC1108.f4040) {
                        m6981 = (C0630.m2566("᩻᩺") + i3) * (-109);
                        i4 = ((m6981 ^ i2) * (-18519)) ^ (-1995112616);
                        i5 = -461399135;
                    } else {
                        m6981 = C2105.m6981("۠֫") ^ i2;
                        i4 = ((m6981 ^ i3) * (-8117)) ^ 934492677;
                        i5 = 799044822;
                    }
                case -33717754:
                case 1705771050:
                    if (C2520.f8000 >= 0) {
                        m6981 = (i3 - C0630.m2566("ۤ᩸")) * 33;
                        i4 = ((m6981 ^ i2) * (-29117)) ^ (-1698608738);
                        i5 = -1938685999;
                    } else {
                        m6981 = (C2105.m6981("۬᩵") ^ i2) * (-51);
                        i4 = ((m6981 ^ i3) * 15661) ^ 183104691;
                        i5 = 1249890260;
                    }
                case 268119814:
                case 469534517:
                    C3663.m11168();
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = (i2 - C0630.m2566("۫ܳ")) * 13;
                        i4 = ((m6981 ^ i3) * 20331) ^ 1509063024;
                        i5 = -98329144;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۤ᩸")) * 33;
                        i4 = ((m6981 ^ i2) * (-29117)) ^ (-1698608738);
                        i5 = -1938685999;
                    }
                case 304144589:
                case 777684464:
                    RunnableC1108.m3790();
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = (i3 - C0630.m2566("ۤ᩸")) * 33;
                        i4 = ((m6981 ^ i2) * (-29117)) ^ (-1698608738);
                        i5 = -1938685999;
                    } else {
                        m6981 = C2105.m6981("۠֫") ^ i2;
                        i4 = ((m6981 ^ i3) * (-8117)) ^ 934492677;
                        i5 = 799044822;
                    }
                case 939933883:
                case 1371287645:
                    if (C1773.m5908() <= 0) {
                        m6981 = (i2 - C0630.m2566("۫ܳ")) * 13;
                        i4 = ((m6981 ^ i3) * 20331) ^ 1509063024;
                        i5 = -98329144;
                    } else {
                        m6981 = C2105.m6981("֨۫") ^ i2;
                        i4 = ((m6981 ^ i3) * 1573) ^ 384364245;
                        i5 = -668030852;
                    }
                case 1566759334:
                case 1739043742:
                    if (C1711.f5919) {
                        m6981 = C2105.m6981("ۚܽ") ^ i3;
                        i4 = ((m6981 ^ i2) * 10919) ^ (-289898908);
                        i5 = -2127864308;
                    } else {
                        m6981 = C0630.m2566("ۨ֫") ^ i3;
                        i4 = ((m6981 ^ i2) * 12869) ^ 1007166493;
                        i5 = 2110959681;
                    }
                default:
                    C1773.m5908();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        if (l.C3245.f10203 <= 0) goto L16;
     */
    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPause() {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ServiceConnectionC10197.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context, android.content.ServiceConnection, java.lang.Object, l.ۗܺ᩷] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        short[] sArr;
        InterfaceC12344 interfaceC12344;
        CheckBox checkBox;
        short[] sArr2;
        int m6981;
        short[] sArr3;
        int i;
        short[] sArr4;
        int i2;
        short[] sArr5;
        int i3;
        short[] sArr6;
        short[] sArr7;
        CheckBox checkBox2;
        short[] sArr8;
        int i4;
        short[] sArr9;
        int i5;
        short[] sArr10;
        int m2566;
        int i6;
        int i7;
        int i8;
        int m25662;
        int i9;
        int i10;
        short[] sArr11;
        short[] sArr12;
        CheckBox checkBox3;
        int i11;
        short[] sArr13;
        int m25663;
        int i12;
        int i13;
        int m69812;
        int i14;
        int i15;
        int m69813;
        int i16;
        int i17;
        ?? r0 = this;
        int i18 = 0;
        int i19 = -767003404;
        int i20 = ViewOnClickListenerC1958.f6529;
        int i21 = C5695.f17556;
        int m69814 = C2105.m6981("۬ۚ") ^ i21;
        int i22 = ((m69814 ^ i20) * (-23403)) ^ (-604602845);
        int i23 = m69814 ^ (-1506902306);
        CheckBox checkBox4 = null;
        InterfaceC12344 interfaceC123442 = null;
        InterfaceC12344 interfaceC123443 = null;
        InterfaceC12344 interfaceC123444 = null;
        String str = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        short[] sArr16 = null;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        short s = 0;
        KeyEvent.Callback callback = null;
        CheckBox checkBox5 = null;
        CheckBox checkBox6 = null;
        short[] sArr17 = null;
        short[] sArr18 = null;
        boolean z = false;
        int i33 = 0;
        int i34 = 0;
        while (true) {
            i19 = i23 ^ (i22 & (((i19 ^ i20) * (-5093)) >> 31));
            switch (i19) {
                case -2113857953:
                case 1365425476:
                    sArr = sArr18;
                    checkBox2 = checkBox4;
                    short[] sArr19 = sArr14;
                    sArr8 = sArr16;
                    i4 = i31;
                    sArr9 = sArr17;
                    i5 = i32;
                    sArr10 = sArr19;
                    super.onCreate(bundle);
                    i30 = C0630.m2566(C2167.m7159(f30638, 76, 3, i25));
                    i33 = 2101924691;
                    if (C7811.f24123 < 0) {
                        m25662 = (i20 - C0630.m2566("ۚ᩺")) * 51;
                        i22 = ((m25662 ^ i21) * (-26239)) ^ (-475970970);
                        i9 = 375640376;
                        i8 = m25662 ^ i9;
                        checkBox4 = checkBox2;
                        sArr18 = sArr;
                        i23 = i8;
                        r0 = this;
                        short[] sArr20 = sArr9;
                        i31 = i4;
                        sArr16 = sArr8;
                        sArr14 = sArr10;
                        i32 = i5;
                        sArr17 = sArr20;
                    }
                    m25662 = (i21 - C0630.m2566("ۢ۬")) * (-49);
                    i22 = ((m25662 ^ i20) * 6577) ^ 1031864833;
                    i9 = 1811963232;
                    i8 = m25662 ^ i9;
                    checkBox4 = checkBox2;
                    sArr18 = sArr;
                    i23 = i8;
                    r0 = this;
                    short[] sArr202 = sArr9;
                    i31 = i4;
                    sArr16 = sArr8;
                    sArr14 = sArr10;
                    i32 = i5;
                    sArr17 = sArr202;
                case -2022848723:
                case -650950488:
                    sArr = sArr18;
                    C3663.m11173(checkBox5, r0);
                    i29 = C0630.m2566(C3746.m11357(f30638, 138, 3, i25));
                    m69813 = C2105.m6981("ܽܳ") ^ i21;
                    i16 = ((m69813 ^ i20) * (-17215)) ^ (-2080274629);
                    i17 = 1069950476;
                    short[] sArr21 = sArr;
                    i23 = m69813 ^ i17;
                    i22 = i16;
                    sArr18 = sArr21;
                case -1989411946:
                case -191060765:
                    if (RunnableC0588.m2441() < 0) {
                        m69812 = C2105.m6981("ۖ᩻") ^ i21;
                        i14 = ((m69812 ^ i20) * (-28403)) ^ (-1851256629);
                        i15 = 1005392333;
                        i23 = m69812 ^ i15;
                        i22 = i14;
                    } else {
                        sArr = sArr18;
                        checkBox3 = checkBox4;
                        short[] sArr22 = sArr14;
                        sArr4 = sArr16;
                        i11 = i32;
                        sArr13 = sArr22;
                        m25663 = (i20 - C2105.m6981("᩺۠")) * 53;
                        i12 = ((m25663 ^ i21) * (-6143)) ^ 761051488;
                        i13 = 363735714;
                        callback = callback;
                        int i35 = m25663 ^ i13;
                        checkBox4 = checkBox3;
                        short[] sArr23 = sArr;
                        i23 = i35;
                        i22 = i12;
                        sArr18 = sArr23;
                        short[] sArr24 = sArr13;
                        i32 = i11;
                        sArr16 = sArr4;
                        sArr14 = sArr24;
                    }
                case -1895213712:
                case 237123774:
                    sArr = sArr18;
                    checkBox2 = checkBox4;
                    short[] sArr25 = sArr14;
                    sArr8 = sArr16;
                    i4 = i31;
                    sArr9 = sArr17;
                    i5 = i32;
                    sArr10 = sArr25;
                    i25 = 3735;
                    m25662 = (C0630.m2566("ܺ֫") + i20) * 75;
                    i22 = ((m25662 ^ i21) * 31485) ^ (-485495832);
                    i9 = 615870631;
                    i8 = m25662 ^ i9;
                    checkBox4 = checkBox2;
                    sArr18 = sArr;
                    i23 = i8;
                    r0 = this;
                    short[] sArr2022 = sArr9;
                    i31 = i4;
                    sArr16 = sArr8;
                    sArr14 = sArr10;
                    i32 = i5;
                    sArr17 = sArr2022;
                case -1746333431:
                case -808421270:
                    checkBox3 = checkBox4;
                    sArr = sArr18;
                    short[] sArr26 = sArr14;
                    sArr4 = sArr16;
                    i11 = i32;
                    KeyEvent.Callback m3409 = C0964.m3409(r0, C2105.m6981(C3019.m9250(sArr26, i11, 3, i25)) ^ 2130585075);
                    m25663 = (C0630.m2566("᩵ܶ") ^ i20) * (-125);
                    sArr13 = sArr26;
                    i12 = ((m25663 ^ i21) * 29023) ^ 2027261313;
                    i13 = 920859296;
                    callback = m3409;
                    int i352 = m25663 ^ i13;
                    checkBox4 = checkBox3;
                    short[] sArr232 = sArr;
                    i23 = i352;
                    i22 = i12;
                    sArr18 = sArr232;
                    short[] sArr242 = sArr13;
                    i32 = i11;
                    sArr16 = sArr4;
                    sArr14 = sArr242;
                case -882640779:
                case -690298881:
                    C1047.m3599();
                    C5695.m16023();
                    sArr2 = sArr15;
                    checkBox = checkBox4;
                    interfaceC12344 = interfaceC123442;
                    m6981 = C0630.m2566("۠ۙ") ^ i20;
                    sArr3 = sArr2;
                    i22 = ((m6981 ^ i21) * 8465) ^ (-191266137);
                    i = 1560284458;
                    int i36 = m6981 ^ i;
                    interfaceC123442 = interfaceC12344;
                    sArr15 = sArr3;
                    i23 = i36;
                    checkBox4 = checkBox;
                case -782327092:
                case 1104827337:
                    sArr = sArr18;
                    checkBox2 = checkBox4;
                    short[] sArr27 = sArr14;
                    sArr8 = sArr16;
                    i4 = i31;
                    sArr9 = sArr17;
                    i5 = i32;
                    sArr10 = sArr27;
                    i25 = 52261;
                    m25662 = (C0630.m2566("ܺ֫") + i20) * 75;
                    i22 = ((m25662 ^ i21) * 31485) ^ (-485495832);
                    i9 = 615870631;
                    i8 = m25662 ^ i9;
                    checkBox4 = checkBox2;
                    sArr18 = sArr;
                    i23 = i8;
                    r0 = this;
                    short[] sArr20222 = sArr9;
                    i31 = i4;
                    sArr16 = sArr8;
                    sArr14 = sArr10;
                    i32 = i5;
                    sArr17 = sArr20222;
                case -777939274:
                case -117440282:
                    sArr = sArr18;
                    C2167.m7160(checkBox6, C4263.m12818(interfaceC123444, C7106.m19110(f30638, 141, 18, i25), z));
                    m69813 = (C0630.m2566("ۡ۟") ^ i20) * 71;
                    i16 = ((m69813 ^ i21) * (-307)) ^ 81189807;
                    i17 = 1154198199;
                    short[] sArr212 = sArr;
                    i23 = m69813 ^ i17;
                    i22 = i16;
                    sArr18 = sArr212;
                case -755899955:
                case 1260544640:
                    sArr = sArr18;
                    checkBox6 = (CheckBox) C0964.m3409(r0, i29 ^ 2102211551);
                    interfaceC123444 = ApplicationC20075.f65008;
                    if (C3911.m11924() <= 0) {
                        checkBox2 = checkBox4;
                        short[] sArr28 = sArr14;
                        sArr8 = sArr16;
                        i4 = i31;
                        sArr9 = sArr17;
                        i5 = i32;
                        sArr10 = sArr28;
                        m25662 = (i21 - C0630.m2566("ۢ۬")) * (-49);
                        i22 = ((m25662 ^ i20) * 6577) ^ 1031864833;
                        i9 = 1811963232;
                        i8 = m25662 ^ i9;
                        checkBox4 = checkBox2;
                        sArr18 = sArr;
                        i23 = i8;
                        r0 = this;
                        short[] sArr202222 = sArr9;
                        i31 = i4;
                        sArr16 = sArr8;
                        sArr14 = sArr10;
                        i32 = i5;
                        sArr17 = sArr202222;
                    } else {
                        m69813 = (i21 - C0630.m2566("ۙ᩸")) * 81;
                        i16 = ((m69813 ^ i20) * (-1427)) ^ 414612819;
                        i17 = -148524546;
                        short[] sArr2122 = sArr;
                        i23 = m69813 ^ i17;
                        i22 = i16;
                        sArr18 = sArr2122;
                    }
                case -729157267:
                case 74743817:
                    sArr = sArr18;
                    checkBox2 = checkBox4;
                    short[] sArr29 = sArr14;
                    sArr8 = sArr16;
                    i4 = i31;
                    sArr9 = sArr17;
                    i5 = i32;
                    sArr10 = sArr29;
                    C0964.m3409(r0, i30 ^ i33);
                    str = C11340.m28025(f30638, 79, 3, i25);
                    if (C3746.m11369() < 0) {
                        m25662 = (i21 - C0630.m2566("֫֡")) * (-69);
                        i22 = ((m25662 ^ i20) * 11867) ^ 913369822;
                        i9 = -93183032;
                        i8 = m25662 ^ i9;
                        checkBox4 = checkBox2;
                        sArr18 = sArr;
                        i23 = i8;
                        r0 = this;
                        short[] sArr2022222 = sArr9;
                        i31 = i4;
                        sArr16 = sArr8;
                        sArr14 = sArr10;
                        i32 = i5;
                        sArr17 = sArr2022222;
                    }
                    m25662 = (i21 - C0630.m2566("ۢ۬")) * (-49);
                    i22 = ((m25662 ^ i20) * 6577) ^ 1031864833;
                    i9 = 1811963232;
                    i8 = m25662 ^ i9;
                    checkBox4 = checkBox2;
                    sArr18 = sArr;
                    i23 = i8;
                    r0 = this;
                    short[] sArr20222222 = sArr9;
                    i31 = i4;
                    sArr16 = sArr8;
                    sArr14 = sArr10;
                    i32 = i5;
                    sArr17 = sArr20222222;
                case -621739614:
                case 1752055208:
                    checkBox4 = (CheckBox) callback;
                    interfaceC123442 = ApplicationC20075.f65008;
                    sArr18 = f30638;
                    i26 = 88;
                    if (C21923.f70183 != 0) {
                        sArr = sArr18;
                        sArr11 = sArr17;
                        sArr12 = sArr14;
                        sArr4 = sArr16;
                        i2 = i31;
                        int m69815 = C2105.m6981("ܽᩴ") ^ i21;
                        short[] sArr30 = sArr12;
                        i22 = ((m69815 ^ i20) * 15265) ^ 750314618;
                        i31 = i2;
                        sArr16 = sArr4;
                        sArr14 = sArr30;
                        sArr17 = sArr11;
                        sArr18 = sArr;
                        i23 = m69815 ^ (-1563937903);
                    } else {
                        m69812 = C2105.m6981("ۜۖ") ^ i20;
                        i14 = ((m69812 ^ i21) * 15989) ^ 782887306;
                        i15 = -1337918139;
                        i23 = m69812 ^ i15;
                        i22 = i14;
                    }
                case -561647453:
                case 2058679631:
                    sArr = sArr18;
                    checkBox5 = (CheckBox) C4263.m12813(r0, i27 ^ i28);
                    interfaceC123443 = ApplicationC20075.f65008;
                    sArr16 = f30638;
                    i24 = UMErrorCode.E_UM_BE_NOT_MAINPROCESS;
                    m69813 = (C2105.m6981("ܿۤ") + i21) * (-79);
                    i16 = ((m69813 ^ i20) * (-5717)) ^ (-498857354);
                    i17 = -767101402;
                    short[] sArr21222 = sArr;
                    i23 = m69813 ^ i17;
                    i22 = i16;
                    sArr18 = sArr21222;
                case -506031115:
                case 435381562:
                    sArr = sArr18;
                    z = false;
                    z = false;
                    C2167.m7160(checkBox5, C4263.m12818(interfaceC123443, C3245.m9934(sArr16, i24, 18, i25), false));
                    if (C1420.f5096 <= 0) {
                        sArr11 = sArr17;
                        sArr12 = sArr14;
                        sArr4 = sArr16;
                        i2 = i31;
                        int m698152 = C2105.m6981("ܽᩴ") ^ i21;
                        short[] sArr302 = sArr12;
                        i22 = ((m698152 ^ i20) * 15265) ^ 750314618;
                        i31 = i2;
                        sArr16 = sArr4;
                        sArr14 = sArr302;
                        sArr17 = sArr11;
                        sArr18 = sArr;
                        i23 = m698152 ^ (-1563937903);
                    } else {
                        m69813 = C0630.m2566("ᩳܽ") ^ i20;
                        i16 = ((m69813 ^ i21) * 11699) ^ (-966505157);
                        i17 = -749905872;
                        short[] sArr212222 = sArr;
                        i23 = m69813 ^ i17;
                        i22 = i16;
                        sArr18 = sArr212222;
                    }
                case -466590735:
                case 185912222:
                    sArr = sArr18;
                    i27 = C2105.m6981(C0483.m2128(sArr15, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i25));
                    i28 = 2127613584;
                    if (C11340.f33930 >= 0) {
                        checkBox2 = checkBox4;
                        short[] sArr282 = sArr14;
                        sArr8 = sArr16;
                        i4 = i31;
                        sArr9 = sArr17;
                        i5 = i32;
                        sArr10 = sArr282;
                        m25662 = (i21 - C0630.m2566("ۢ۬")) * (-49);
                        i22 = ((m25662 ^ i20) * 6577) ^ 1031864833;
                        i9 = 1811963232;
                        i8 = m25662 ^ i9;
                        checkBox4 = checkBox2;
                        sArr18 = sArr;
                        i23 = i8;
                        r0 = this;
                        short[] sArr202222222 = sArr9;
                        i31 = i4;
                        sArr16 = sArr8;
                        sArr14 = sArr10;
                        i32 = i5;
                        sArr17 = sArr202222222;
                    } else {
                        m69813 = (C2105.m6981("᩷۠") + i20) * 123;
                        i16 = ((m69813 ^ i21) * (-30495)) ^ (-15797477);
                        i17 = 337221583;
                        short[] sArr2122222 = sArr;
                        i23 = m69813 ^ i17;
                        i22 = i16;
                        sArr18 = sArr2122222;
                    }
                case -463240696:
                case 1335732576:
                    interfaceC12344 = interfaceC123442;
                    checkBox = checkBox4;
                    C0714.m2802(checkBox, C4263.m12818(interfaceC12344, C3432.m10488(sArr18, i26, 29, i25), true));
                    C3663.m11173(checkBox, r0);
                    sArr2 = f30638;
                    if (!C21923.m49329()) {
                        m6981 = (i21 - C2105.m6981("ᩴۗ")) * 109;
                        sArr3 = sArr2;
                        i22 = ((m6981 ^ i20) * 11517) ^ (-1910506392);
                        i = -200508934;
                        int i362 = m6981 ^ i;
                        interfaceC123442 = interfaceC12344;
                        sArr15 = sArr3;
                        i23 = i362;
                        checkBox4 = checkBox;
                    }
                    m6981 = C0630.m2566("۠ۙ") ^ i20;
                    sArr3 = sArr2;
                    i22 = ((m6981 ^ i21) * 8465) ^ (-191266137);
                    i = 1560284458;
                    int i3622 = m6981 ^ i;
                    interfaceC123442 = interfaceC12344;
                    sArr15 = sArr3;
                    i23 = i3622;
                    checkBox4 = checkBox;
                case -366539917:
                case 2134047849:
                    sArr = sArr18;
                    int i37 = i32;
                    short[] sArr31 = sArr14;
                    short[] sArr32 = sArr16;
                    C0964.m3409(r0, C0630.m2566(str) ^ 2102004742);
                    short[] sArr33 = f30638;
                    i31 = 82;
                    int m69816 = (C2105.m6981("᩺ܶ") + i21) * (-33);
                    int i38 = ((m69816 ^ i20) * 2231) ^ 1621549033;
                    i10 = m69816 ^ 847342564;
                    checkBox4 = checkBox4;
                    sArr17 = sArr33;
                    i22 = i38;
                    sArr16 = sArr32;
                    sArr14 = sArr31;
                    i32 = i37;
                    short[] sArr34 = sArr;
                    i23 = i10;
                    sArr18 = sArr34;
                case -130469662:
                case 1259963367:
                    short[] sArr35 = sArr18;
                    short[] sArr36 = sArr14;
                    sArr4 = sArr16;
                    i2 = i31;
                    sArr5 = sArr17;
                    i3 = i32;
                    sArr6 = sArr36;
                    short s2 = f30638[75];
                    int m25664 = C0630.m2566("֡ۧ") ^ i20;
                    checkBox4 = checkBox4;
                    s = s2;
                    i18 = s2 + 5239;
                    i22 = ((m25664 ^ i21) * EnumC5983.f18409) ^ 1222158635;
                    r0 = this;
                    sArr7 = sArr35;
                    i23 = m25664 ^ 236337633;
                    sArr18 = sArr7;
                    short[] sArr37 = sArr5;
                    i31 = i2;
                    sArr16 = sArr4;
                    sArr14 = sArr6;
                    i32 = i3;
                    sArr17 = sArr37;
                case 287177192:
                case 1550331695:
                    C1504.m5166(checkBox6, r0);
                    r0.bindService(new Intent((Context) r0, (Class<?>) ServiceC13018.class), r0, z ? 1 : 0);
                    break;
                case 414049173:
                case 2132511911:
                    C11340.m28031();
                    if (RunnableC3474.f10992 <= 0) {
                        sArr2 = sArr15;
                        checkBox = checkBox4;
                        interfaceC12344 = interfaceC123442;
                        m6981 = C0630.m2566("۠ۙ") ^ i20;
                        sArr3 = sArr2;
                        i22 = ((m6981 ^ i21) * 8465) ^ (-191266137);
                        i = 1560284458;
                        int i36222 = m6981 ^ i;
                        interfaceC123442 = interfaceC12344;
                        sArr15 = sArr3;
                        i23 = i36222;
                        checkBox4 = checkBox;
                    } else {
                        m69812 = C2105.m6981("ۖ᩻") ^ i21;
                        i14 = ((m69812 ^ i20) * (-28403)) ^ (-1851256629);
                        i15 = 1005392333;
                        i23 = m69812 ^ i15;
                        i22 = i14;
                    }
                case 563580552:
                case 1188535329:
                    sArr = sArr18;
                    checkBox3 = checkBox4;
                    short[] sArr38 = sArr14;
                    sArr4 = sArr16;
                    i11 = i32;
                    sArr13 = sArr38;
                    C9762 c9762 = (C9762) C4263.m12813(r0, i34);
                    r0.f10584 = c9762;
                    RunnableC1108.m3780(r0, c9762);
                    C1773.m5915(this);
                    C9762 c97622 = r0.f10584;
                    if (C0714.f2697 >= 0) {
                        m25663 = (i20 - C2105.m6981("᩺۠")) * 53;
                        i12 = ((m25663 ^ i21) * (-6143)) ^ 761051488;
                        i13 = 363735714;
                        callback = callback;
                        int i3522 = m25663 ^ i13;
                        checkBox4 = checkBox3;
                        short[] sArr2322 = sArr;
                        i23 = i3522;
                        i22 = i12;
                        sArr18 = sArr2322;
                        short[] sArr2422 = sArr13;
                        i32 = i11;
                        sArr16 = sArr4;
                        sArr14 = sArr2422;
                    } else {
                        RunnableC3474.m10625(c97622, new ViewOnClickListenerC9264(r0, 1));
                        sArr12 = f30638;
                        i32 = 85;
                        if (C1128.m3851() <= 0) {
                            checkBox4 = checkBox3;
                            sArr11 = sArr17;
                            i2 = i31;
                            int m6981522 = C2105.m6981("ܽᩴ") ^ i21;
                            short[] sArr3022 = sArr12;
                            i22 = ((m6981522 ^ i20) * 15265) ^ 750314618;
                            i31 = i2;
                            sArr16 = sArr4;
                            sArr14 = sArr3022;
                            sArr17 = sArr11;
                            sArr18 = sArr;
                            i23 = m6981522 ^ (-1563937903);
                        } else {
                            int m25665 = (C0630.m2566("ۛ᩸") ^ i21) * (-97);
                            int i39 = ((m25665 ^ i20) * 23181) ^ 401795790;
                            i10 = m25665 ^ (-771044868);
                            checkBox4 = checkBox3;
                            sArr14 = sArr12;
                            i22 = i39;
                            sArr16 = sArr4;
                            short[] sArr342 = sArr;
                            i23 = i10;
                            sArr18 = sArr342;
                        }
                    }
                case 776990582:
                case 1509651113:
                    sArr = sArr18;
                    CheckBox checkBox7 = checkBox4;
                    short[] sArr39 = sArr14;
                    sArr4 = sArr16;
                    int i40 = i32;
                    sArr6 = sArr39;
                    sArr11 = sArr17;
                    i3 = i40;
                    i2 = i31;
                    i34 = C0630.m2566(C2520.m8030(sArr11, i2, 3, i25)) ^ 2117964136;
                    if (C1916.m6308() >= 0) {
                        checkBox4 = checkBox7;
                        sArr12 = sArr6;
                        i32 = i3;
                        int m69815222 = C2105.m6981("ܽᩴ") ^ i21;
                        short[] sArr30222 = sArr12;
                        i22 = ((m69815222 ^ i20) * 15265) ^ 750314618;
                        i31 = i2;
                        sArr16 = sArr4;
                        sArr14 = sArr30222;
                        sArr17 = sArr11;
                        sArr18 = sArr;
                        i23 = m69815222 ^ (-1563937903);
                    } else {
                        int m25666 = C0630.m2566("ۡ᩷") ^ i20;
                        sArr5 = sArr11;
                        checkBox4 = checkBox7;
                        sArr7 = sArr;
                        i23 = m25666 ^ 1974781193;
                        i22 = ((m25666 ^ i21) * (-17353)) ^ 838746195;
                        r0 = r0;
                        sArr18 = sArr7;
                        short[] sArr372 = sArr5;
                        i31 = i2;
                        sArr16 = sArr4;
                        sArr14 = sArr6;
                        i32 = i3;
                        sArr17 = sArr372;
                    }
                case 1300451169:
                case 1513433264:
                    sArr = sArr18;
                    checkBox2 = checkBox4;
                    short[] sArr40 = sArr14;
                    sArr8 = sArr16;
                    i4 = i31;
                    sArr9 = sArr17;
                    i5 = i32;
                    sArr10 = sArr40;
                    short s3 = s;
                    if ((s3 * 20956) - (i18 * i18) <= 0) {
                        m2566 = (i21 - C2105.m6981("ۨۨ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i6 = ((m2566 ^ i20) * 29609) ^ 111567156;
                        i7 = -1431867347;
                    } else {
                        m2566 = C0630.m2566("ۚᩴ") ^ i21;
                        i6 = ((m2566 ^ i20) * (-16353)) ^ (-565273213);
                        i7 = -1393713852;
                    }
                    i8 = m2566 ^ i7;
                    s = s3;
                    i22 = i6;
                    checkBox4 = checkBox2;
                    sArr18 = sArr;
                    i23 = i8;
                    r0 = this;
                    short[] sArr2022222222 = sArr9;
                    i31 = i4;
                    sArr16 = sArr8;
                    sArr14 = sArr10;
                    i32 = i5;
                    sArr17 = sArr2022222222;
                case 1342171409:
                case 2085671804:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        sArr2 = sArr15;
                        checkBox = checkBox4;
                        interfaceC12344 = interfaceC123442;
                        m6981 = C0630.m2566("۠ۙ") ^ i20;
                        sArr3 = sArr2;
                        i22 = ((m6981 ^ i21) * 8465) ^ (-191266137);
                        i = 1560284458;
                        int i362222 = m6981 ^ i;
                        interfaceC123442 = interfaceC12344;
                        sArr15 = sArr3;
                        i23 = i362222;
                        checkBox4 = checkBox;
                    } else {
                        sArr = sArr18;
                        checkBox2 = checkBox4;
                        short[] sArr2822 = sArr14;
                        sArr8 = sArr16;
                        i4 = i31;
                        sArr9 = sArr17;
                        i5 = i32;
                        sArr10 = sArr2822;
                        m25662 = (i21 - C0630.m2566("ۢ۬")) * (-49);
                        i22 = ((m25662 ^ i20) * 6577) ^ 1031864833;
                        i9 = 1811963232;
                        i8 = m25662 ^ i9;
                        checkBox4 = checkBox2;
                        sArr18 = sArr;
                        i23 = i8;
                        r0 = this;
                        short[] sArr20222222222 = sArr9;
                        i31 = i4;
                        sArr16 = sArr8;
                        sArr14 = sArr10;
                        i32 = i5;
                        sArr17 = sArr20222222222;
                    }
                default:
                    C2105.m6982();
                    C3432.m10477();
                    break;
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onStop() {
        BinderC3141 binderC3141 = null;
        int i = 234308500;
        int i2 = C1773.f6144;
        int i3 = C3911.f12484;
        int m2566 = C0630.m2566("ۗۘ") ^ i3;
        int i4 = ((m2566 ^ i2) * (-14765)) ^ (-385296509);
        int i5 = -2143776959;
        while (true) {
            i = ((((i ^ i2) * 3053) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2066390292:
                case 135991637:
                    break;
                case -1739789136:
                case 1779387939:
                    C1128.m3851();
                    if (C0050.f910 >= 0) {
                        m2566 = C2105.m6981("ܺ֨") ^ i2;
                        i4 = ((m2566 ^ i3) * 14351) ^ (-247017820);
                        i5 = 1346166964;
                    } else {
                        m2566 = (C2105.m6981("֫ۖ") ^ i2) * 23;
                        i4 = ((m2566 ^ i3) * (-2177)) ^ (-1905611479);
                        i5 = -2139648712;
                    }
                case -1628437085:
                case -1461276377:
                    C5695.m16023();
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = (C0630.m2566("ܶܽ") + i3) * 51;
                        i4 = ((m2566 ^ i2) * 5675) ^ 1242129349;
                        i5 = -1199630242;
                    } else {
                        m2566 = C2105.m6981("ܺ֨") ^ i2;
                        i4 = ((m2566 ^ i3) * 14351) ^ (-247017820);
                        i5 = 1346166964;
                    }
                case -1427414728:
                case 1448882763:
                    if (C1504.f5354) {
                        m2566 = C2105.m6981("ܺ֨") ^ i2;
                        i4 = ((m2566 ^ i3) * 14351) ^ (-247017820);
                        i5 = 1346166964;
                    } else {
                        m2566 = C2105.m6981("ۙ۟") ^ i2;
                        i4 = ((m2566 ^ i3) * 27705) ^ 833638589;
                        i5 = -827136804;
                    }
                case -1283862269:
                case -91192584:
                    if (RunnableC3474.f10992 > 0) {
                        m2566 = C2105.m6981("ܺ֨") ^ i2;
                        i4 = ((m2566 ^ i3) * 14351) ^ (-247017820);
                        i5 = 1346166964;
                    } else {
                        m2566 = C2105.m6981("ۘۗ") ^ i3;
                        i4 = ((m2566 ^ i2) * 7245) ^ (-1414339096);
                        i5 = 1308970445;
                    }
                case -1222894304:
                case 22227783:
                    if (C0798.f2919) {
                        m2566 = (C2105.m6981("֫ۖ") ^ i2) * 23;
                        i4 = ((m2566 ^ i3) * (-2177)) ^ (-1905611479);
                        i5 = -2139648712;
                    } else {
                        m2566 = C2105.m6981("ܶۖ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15763)) ^ (-1466250421);
                        i5 = -966706940;
                    }
                case -1100857556:
                case 2073673330:
                    binderC3141 = this.f30640;
                    if (binderC3141 != null) {
                        m2566 = C0630.m2566("ۡᩳ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-17075)) ^ 1643116798;
                        i5 = -192405693;
                    } else {
                        m2566 = C2105.m6981("ۘۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * 27835) ^ (-1141592308);
                        i5 = 632005210;
                    }
                case -1033333165:
                case 1331141692:
                    if (C0382.f1805) {
                        m2566 = C2105.m6981("ᩴۧ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-22461)) ^ (-1239888631);
                        i5 = -500210301;
                    } else {
                        m2566 = C2105.m6981("ۘۗ") ^ i3;
                        i4 = ((m2566 ^ i2) * 7245) ^ (-1414339096);
                        i5 = 1308970445;
                    }
                case -1022186688:
                case 1064391416:
                    if (C0050.f910 >= 0) {
                        m2566 = (C2105.m6981("۠ܺ") + i2) * (-95);
                        i4 = ((m2566 ^ i3) * 27319) ^ (-923078720);
                        i5 = 1059720416;
                    } else {
                        m2566 = (C2105.m6981("ܶ֨") ^ i3) * 83;
                        i4 = ((m2566 ^ i2) * (-21185)) ^ 337775874;
                        i5 = -1802511975;
                    }
                case -862896506:
                case 938723519:
                    if (C0382.f1805) {
                        m2566 = C0630.m2566("᩺ܰ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-18861)) ^ 898279825;
                        i5 = -1652972655;
                    } else {
                        m2566 = (C2105.m6981("۠ܺ") + i2) * (-95);
                        i4 = ((m2566 ^ i3) * 27319) ^ (-923078720);
                        i5 = 1059720416;
                    }
                case -535863796:
                case 1451953516:
                    if (C0630.f2410 <= 0) {
                        m2566 = C2105.m6981("ۘۗ") ^ i3;
                        i4 = ((m2566 ^ i2) * 7245) ^ (-1414339096);
                        i5 = 1308970445;
                    } else {
                        m2566 = (C0630.m2566("֡ܿ") + i2) * 119;
                        i4 = ((m2566 ^ i3) * (-28807)) ^ 903531794;
                        i5 = -1652020925;
                    }
                case -388186478:
                case 627801886:
                    if (C2105.m6982() != 0) {
                        m2566 = (C2105.m6981("֫ۖ") ^ i2) * 23;
                        i4 = ((m2566 ^ i3) * (-2177)) ^ (-1905611479);
                        i5 = -2139648712;
                    } else {
                        m2566 = (i2 - C2105.m6981("۠ۘ")) * 91;
                        i4 = ((m2566 ^ i3) * 1757) ^ (-933040453);
                        i5 = -1569524814;
                    }
                case -134532782:
                case 2001367579:
                    RunnableC1108.m3781(this);
                    m2566 = (C0630.m2566("ۗᩴ") + i3) * 79;
                    i4 = ((m2566 ^ i2) * 16737) ^ 1019608641;
                    i5 = -994624542;
                case -91938676:
                case 668282351:
                    if (RunnableC1937.f6483 >= 0) {
                        m2566 = (C2105.m6981("۠ܺ") + i2) * (-95);
                        i4 = ((m2566 ^ i3) * 27319) ^ (-923078720);
                        i5 = 1059720416;
                    } else {
                        m2566 = C2105.m6981("ᩳۢ") ^ i3;
                        i4 = ((m2566 ^ i2) * 12583) ^ 127682491;
                        i5 = -1749563997;
                    }
                case -20188981:
                case 2122409196:
                    C4159.m12565();
                    C2167.m7155();
                    m2566 = (C0630.m2566("ܶܽ") + i3) * 51;
                    i4 = ((m2566 ^ i2) * 5675) ^ 1242129349;
                    i5 = -1199630242;
                case 147445648:
                case 1725658037:
                    super.onStop();
                    if (C1773.f6144 <= 0) {
                        m2566 = C2105.m6981("ܺ֨") ^ i2;
                        i4 = ((m2566 ^ i3) * 14351) ^ (-247017820);
                        i5 = 1346166964;
                    } else {
                        m2566 = (i3 - C2105.m6981("ۧ֨")) * 31;
                        i4 = ((m2566 ^ i2) * (-8785)) ^ (-1829907307);
                        i5 = 1603036468;
                    }
                case 233784135:
                case 309057252:
                    binderC3141.m9569();
                    m2566 = C2105.m6981("ۘۧ") ^ i2;
                    i4 = ((m2566 ^ i3) * 27835) ^ (-1141592308);
                    i5 = 632005210;
                case 502850422:
                case 1901582713:
                    if (C1504.f5354) {
                        m2566 = (C2105.m6981("۠ܺ") + i2) * (-95);
                        i4 = ((m2566 ^ i3) * 27319) ^ (-923078720);
                        i5 = 1059720416;
                    } else {
                        m2566 = C0630.m2566("ۢܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * 17603) ^ 1997679830;
                        i5 = 1375725485;
                    }
                case 1192335242:
                case 2014781433:
                    C3245.m9925();
                    break;
                default:
                    if (C4117.m12349(this)) {
                        m2566 = (C0630.m2566("ۗᩴ") + i3) * 79;
                        i4 = ((m2566 ^ i2) * 16737) ^ 1019608641;
                        i5 = -994624542;
                    } else {
                        m2566 = (i2 - C2105.m6981("ܰۨ")) * 11;
                        i4 = ((m2566 ^ i3) * (-20359)) ^ 2006112526;
                        i5 = 1968383153;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        if (l.C1711.m5736() > 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (l.C3245.f10203 <= 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (l.C3537.m10746() > 0) goto L48;
     */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCheckedChanged(android.widget.CompoundButton r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ServiceConnectionC10197.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f30640 = null;
    }
}
