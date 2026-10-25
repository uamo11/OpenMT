package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plugin.api.PluginContext;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.ASN1RelativeOID;

/* compiled from: D2S2 */
/* renamed from: l.֡ܽ᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC0544 extends AbstractC3255 implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    /* renamed from: ᩶ۖܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f2211 = {6008, 19885, -21501, 32212, -17254, -17205, -22678, 17016, -18594, 23468, 24393, -18050, 18414, 19410, 19363, -22832, 827, 4569, 15207, 7043, 6519, 4573, 13397, -2302, -579, 5166, 6986, 2929, 4073, -2394, -2759, -6796, -2026, 6911, -1759, -7286, -2523, -3423, 14913, 7808, -6650, -7474, -6851, 4276, -6280, 5518, 7114, 606, 3351, 32401, 28452, -18386, -29120, 32728, -31580, -4114, -4127, -4124, -4115, -4101, 26028, -25507, -24070, 27218, -18509, 29250, 1307, 1250, 1904, 7131, 14707, 8492, -6205, 4801, -934, -7416};

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C2978 f2212;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16709 f2213;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5484 f2214;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public TextView f2215;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f2216;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f2217;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public TextView f2218;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2287(ViewOnClickListenerC0544 viewOnClickListenerC0544) {
        C16709 c16709 = null;
        PluginContext pluginContext = null;
        int i = -954931315;
        int i2 = C2520.f8000;
        int i3 = C4117.f13076;
        int m6981 = (C2105.m6981("ۢܰ") ^ i3) * (-99);
        int i4 = ((m6981 ^ i2) * (-23499)) ^ 938783135;
        int i5 = 1427750092;
        while (true) {
            i = ((((i ^ i2) * 5521) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -731860832:
                case 1535494865:
                    if (C1773.m5908() <= 0) {
                        m6981 = (C0630.m2566("ܳ᩷") + i2) * (-109);
                        i4 = ((m6981 ^ i3) * 21473) ^ (-1834396901);
                        i5 = -1975045410;
                    } else {
                        m6981 = (i3 - C2105.m6981("᩺ᩳ")) * 43;
                        i4 = ((m6981 ^ i2) * 19431) ^ 655159799;
                        i5 = -697135318;
                    }
                case -719227538:
                case -3534252:
                    if (C0422.f1886 <= 0) {
                        m6981 = (C0630.m2566("ܳ᩷") + i2) * (-109);
                        i4 = ((m6981 ^ i3) * 21473) ^ (-1834396901);
                        i5 = -1975045410;
                    } else {
                        m6981 = C2105.m6981("᩻᩸") ^ i3;
                        i4 = ((m6981 ^ i2) * (-28997)) ^ 970803307;
                        i5 = 223289131;
                    }
                case -538577965:
                case 1924828874:
                    if (C3432.f10845 < 0) {
                        m6981 = (C0630.m2566("ܶܿ") ^ i2) * 31;
                        i4 = ((m6981 ^ i3) * (-13543)) ^ 1134981851;
                        i5 = 1147597463;
                    } else {
                        m6981 = (i3 - C2105.m6981("᩶ۨ")) * (-107);
                        i4 = ((m6981 ^ i2) * (-22935)) ^ (-1277624976);
                        i5 = 1428466667;
                    }
                case -298667534:
                case 1183015703:
                    C1128.m3851();
                    m6981 = (C0630.m2566("ܶܿ") ^ i2) * 31;
                    i4 = ((m6981 ^ i3) * (-13543)) ^ 1134981851;
                    i5 = 1147597463;
                case -166916763:
                case 1223845273:
                    C1420.m4913();
                    if (C1005.f3721) {
                        m6981 = (i3 - C2105.m6981("᩶ۨ")) * (-107);
                        i4 = ((m6981 ^ i2) * (-22935)) ^ (-1277624976);
                        i5 = 1428466667;
                    } else {
                        m6981 = (C2105.m6981("۫ۗ") + i3) * 81;
                        i4 = ((m6981 ^ i2) * (-28255)) ^ (-460109810);
                        i5 = 79002921;
                    }
                case 2841526:
                case 694512962:
                    C3537.m10746();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m6981 = (C0630.m2566("ܶܿ") ^ i2) * 31;
                        i4 = ((m6981 ^ i3) * (-13543)) ^ 1134981851;
                        i5 = 1147597463;
                    } else {
                        m6981 = (C2105.m6981("۫ۨ") + i2) * (-99);
                        i4 = ((m6981 ^ i3) * 8127) ^ (-959359062);
                        i5 = 150856168;
                    }
                case 249153820:
                case 1899699928:
                    if (C0382.f1805) {
                        m6981 = C0630.m2566("ܳۗ") ^ i2;
                        i4 = ((m6981 ^ i3) * 26941) ^ (-263635762);
                        i5 = -601918066;
                    } else {
                        m6981 = (C2105.m6981("۫ۗ") + i3) * 81;
                        i4 = ((m6981 ^ i2) * (-28255)) ^ (-460109810);
                        i5 = 79002921;
                    }
                case 352526194:
                case 600124638:
                    if (C1504.f5354) {
                        m6981 = (i3 - C2105.m6981("᩶ۨ")) * (-107);
                        i4 = ((m6981 ^ i2) * (-22935)) ^ (-1277624976);
                        i5 = 1428466667;
                    } else {
                        m6981 = C0630.m2566("ۗ᩺") ^ i2;
                        i4 = ((m6981 ^ i3) * 25361) ^ 2059594000;
                        i5 = -1595873645;
                    }
                case 467075407:
                case 690514797:
                    pluginContext = c16709.m39304();
                    if (C3911.f12484 >= 0) {
                        m6981 = (C0630.m2566("ܳ᩷") + i2) * (-109);
                        i4 = ((m6981 ^ i3) * 21473) ^ (-1834396901);
                        i5 = -1975045410;
                    } else {
                        m6981 = (C2105.m6981("ۨۖ") ^ i2) * (-81);
                        i4 = ((m6981 ^ i3) * (-24561)) ^ 356782039;
                        i5 = -239978039;
                    }
                case 547834095:
                case 675425207:
                    ((C10632) pluginContext).openPreference(null);
                    break;
                case 623928041:
                case 1927404051:
                    c16709 = viewOnClickListenerC0544.f2213;
                    if (C1504.f5354) {
                        m6981 = (C2105.m6981("۫ۗ") + i3) * 81;
                        i4 = ((m6981 ^ i2) * (-28255)) ^ (-460109810);
                        i5 = 79002921;
                    } else {
                        m6981 = (i2 - C0630.m2566("֫֨")) * 21;
                        i4 = ((m6981 ^ i3) * 9305) ^ (-1397214082);
                        i5 = -1588266195;
                    }
                case 725925956:
                case 1974401572:
                    if (C0714.m2805()) {
                        m6981 = (C2105.m6981("ۨۡ") + i3) * 45;
                        i4 = ((m6981 ^ i2) * (-16463)) ^ (-641258256);
                        i5 = 1330564668;
                    } else {
                        m6981 = (C0630.m2566("ܳ᩷") + i2) * (-109);
                        i4 = ((m6981 ^ i3) * 21473) ^ (-1834396901);
                        i5 = -1975045410;
                    }
                case 1097198794:
                case 1915444186:
                    if (C4117.f13076 <= 0) {
                        m6981 = (C0630.m2566("ܶܿ") ^ i2) * 31;
                        i4 = ((m6981 ^ i3) * (-13543)) ^ 1134981851;
                        i5 = 1147597463;
                    } else {
                        m6981 = (C0630.m2566("۠ۚ") + i3) * 97;
                        i4 = ((m6981 ^ i2) * 18285) ^ (-104285165);
                        i5 = -878798740;
                    }
                case 1153248549:
                case 1161569360:
                    if (C3019.f9544 >= 0) {
                        m6981 = (C0630.m2566("ܳ᩷") + i2) * (-109);
                        i4 = ((m6981 ^ i3) * 21473) ^ (-1834396901);
                        i5 = -1975045410;
                    } else {
                        m6981 = C0630.m2566("ۚۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * 993) ^ (-752539426);
                        i5 = -1633219481;
                    }
                case 1471896542:
                case 1705970379:
                    if (RunnableC1108.m3790()) {
                        m6981 = (C0630.m2566("ܶܿ") ^ i2) * 31;
                        i4 = ((m6981 ^ i3) * (-13543)) ^ 1134981851;
                        i5 = 1147597463;
                    } else {
                        m6981 = (C2105.m6981("ۘ᩺") ^ i3) * (-27);
                        i4 = ((m6981 ^ i2) * (-23167)) ^ 1178473917;
                        i5 = -1427400541;
                    }
                default:
                    C1047.m3599();
                    C1420.m4913();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2284(ViewOnClickListenerC0544 viewOnClickListenerC0544, final DialogInterfaceC0206 dialogInterfaceC0206, MenuItem menuItem) {
        Object[] objArr;
        AbstractActivityC3346 abstractActivityC3346;
        Object[] objArr2;
        Object[] objArr3;
        int m2566;
        int i;
        int i2;
        int i3;
        Object[] objArr4;
        char c;
        AbstractActivityC3346 abstractActivityC33462;
        int i4;
        short[] sArr;
        AbstractActivityC3346 abstractActivityC33463;
        int m6981;
        int i5;
        int i6;
        Object[] objArr5;
        int i7;
        Object[] objArr6;
        char c2;
        AbstractActivityC3346 abstractActivityC33464;
        int i8;
        short[] sArr2;
        AbstractActivityC3346 abstractActivityC33465;
        boolean z;
        int m69812;
        int i9;
        int i10;
        AbstractActivityC3346 abstractActivityC33466;
        int i11;
        int m25662;
        int i12;
        AbstractActivityC3346 abstractActivityC33467;
        AbstractActivityC3346 abstractActivityC33468;
        AbstractActivityC3346 abstractActivityC33469;
        Object[] objArr7;
        AbstractActivityC3346 abstractActivityC334610;
        AbstractActivityC3346 abstractActivityC334611;
        String str;
        Object[] objArr8;
        short[] sArr3;
        int m25663;
        short[] sArr4;
        int i13;
        final ViewOnClickListenerC0544 viewOnClickListenerC05442 = viewOnClickListenerC0544;
        int i14 = 0;
        String str2 = null;
        char c3 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        C19258 c19258 = null;
        C16709 c16709 = null;
        String str3 = null;
        int i18 = 0;
        short s = 0;
        short s2 = 0;
        int i19 = 2091285074;
        int i20 = C11340.f33930;
        int i21 = C1294.f4556;
        int m69813 = C2105.m6981("᩷ۙ") ^ i20;
        int i22 = ((m69813 ^ i21) * (-30367)) ^ 1046726114;
        int i23 = m69813 ^ (-2108990220);
        C19258 c192582 = null;
        AbstractActivityC3346 abstractActivityC334612 = null;
        String str4 = null;
        AbstractActivityC3346 abstractActivityC334613 = null;
        Object[] objArr9 = null;
        short[] sArr5 = null;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        C5484 c5484 = null;
        Object[] objArr10 = null;
        short[] sArr6 = null;
        int i28 = 0;
        C16709 c167092 = null;
        String str5 = null;
        while (true) {
            i19 = i23 ^ (i22 & (((i19 ^ i21) * 29107) >> 31));
            switch (i19) {
                case -2104603620:
                case -878705168:
                    str5 = C4075.m12262(abstractActivityC334613, C0630.m2566(C3663.m11162(sArr6, i24, 3, i25)) ^ 2127430547, objArr9);
                    if (C7106.f21815 == 0) {
                        objArr3 = objArr9;
                        m2566 = C0630.m2566("᩸᩹") ^ i20;
                        i = ((m2566 ^ i21) * 6097) ^ (-1841155076);
                        i2 = 1617582502;
                        objArr2 = objArr3;
                        i23 = m2566 ^ i2;
                        i22 = i;
                        objArr9 = objArr2;
                    }
                    m2566 = C2105.m6981("᩵֡") ^ i20;
                    objArr3 = objArr9;
                    i = ((m2566 ^ i21) * (-2933)) ^ 176372303;
                    i2 = 54543293;
                    objArr2 = objArr3;
                    i23 = m2566 ^ i2;
                    i22 = i;
                    objArr9 = objArr2;
                case -2005482086:
                case 1364615833:
                    objArr = objArr9;
                    i3 = i27;
                    objArr4 = objArr10;
                    c = c3;
                    abstractActivityC33462 = abstractActivityC334612;
                    i4 = i28;
                    sArr = sArr5;
                    abstractActivityC33463 = abstractActivityC334613;
                    i25 = 31727;
                    m6981 = (i21 - C2105.m6981("֫᩻")) * 57;
                    i22 = ((m6981 ^ i20) * 15289) ^ (-1753099467);
                    i5 = 540518840;
                    i6 = m6981 ^ i5;
                    c3 = c;
                    abstractActivityC334613 = abstractActivityC33463;
                    sArr5 = sArr;
                    i27 = i3;
                    i28 = i4;
                    abstractActivityC334612 = abstractActivityC33462;
                    objArr9 = objArr;
                    objArr10 = objArr4;
                    i23 = i6;
                    viewOnClickListenerC05442 = viewOnClickListenerC0544;
                case -1865635131:
                case 1594406893:
                    objArr7 = objArr9;
                    abstractActivityC334610 = abstractActivityC334613;
                    abstractActivityC334611 = abstractActivityC334612;
                    str = str4;
                    objArr8 = new Object[i14];
                    objArr8[c3] = c167092.m39302();
                    sArr3 = f2211;
                    i28 = 42;
                    if (C1005.f3721) {
                        m25663 = (i20 - C0630.m2566("᩻ܽ")) * (-7);
                        sArr4 = sArr3;
                        i22 = ((m25663 ^ i21) * (-24953)) ^ (-597079737);
                        i13 = -1992789352;
                        short[] sArr7 = sArr4;
                        str4 = str;
                        objArr9 = objArr7;
                        i23 = m25663 ^ i13;
                        abstractActivityC334612 = abstractActivityC334611;
                        objArr10 = objArr8;
                        abstractActivityC334613 = abstractActivityC334610;
                        sArr5 = sArr7;
                    }
                    m25663 = C0630.m2566("᩸ᩴ") ^ i21;
                    sArr4 = sArr3;
                    i22 = ((m25663 ^ i20) * 16659) ^ (-14779445);
                    i13 = -2051688170;
                    short[] sArr72 = sArr4;
                    str4 = str;
                    objArr9 = objArr7;
                    i23 = m25663 ^ i13;
                    abstractActivityC334612 = abstractActivityC334611;
                    objArr10 = objArr8;
                    abstractActivityC334613 = abstractActivityC334610;
                    sArr5 = sArr72;
                case -1699344917:
                case -680960691:
                    C1711.m5736();
                    objArr5 = objArr9;
                    i7 = i27;
                    objArr6 = objArr10;
                    abstractActivityC33464 = abstractActivityC334612;
                    i8 = i28;
                    sArr2 = sArr5;
                    abstractActivityC33465 = abstractActivityC334613;
                    m25662 = (C2105.m6981("ܿܳ") ^ i21) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i9 = ((m25662 ^ i20) * 24823) ^ (-373766492);
                    i12 = -1537378995;
                    i11 = m25662 ^ i12;
                    i14 = i14;
                    i27 = i7;
                    objArr9 = objArr5;
                    i23 = i11;
                    i22 = i9;
                    abstractActivityC334613 = abstractActivityC33465;
                    sArr5 = sArr2;
                    i28 = i8;
                    abstractActivityC334612 = abstractActivityC33464;
                    objArr10 = objArr6;
                case -1679177485:
                case 1519389894:
                    C7811.m20844();
                    break;
                case -1667272590:
                case 1869349403:
                    objArr5 = objArr9;
                    i7 = i27;
                    objArr6 = objArr10;
                    abstractActivityC33464 = abstractActivityC334612;
                    i8 = i28;
                    sArr2 = sArr5;
                    abstractActivityC33465 = abstractActivityC334613;
                    i17 = C0630.m2566(C22628.m50602(f2211, 36, 3, i25)) ^ 2101398751;
                    int i29 = i26;
                    if (i7 == i29) {
                        m25662 = (i21 - C0630.m2566("ܺ᩵")) * 73;
                        i26 = i29;
                        i9 = ((m25662 ^ i20) * 26841) ^ 656933799;
                        i12 = -3080009;
                    } else {
                        i26 = i29;
                        m25662 = (C0630.m2566("ܽܿ") + i20) * (-103);
                        i9 = ((m25662 ^ i21) * 11379) ^ 178976280;
                        i12 = -1619635773;
                    }
                    i11 = m25662 ^ i12;
                    i14 = i14;
                    i27 = i7;
                    objArr9 = objArr5;
                    i23 = i11;
                    i22 = i9;
                    abstractActivityC334613 = abstractActivityC33465;
                    sArr5 = sArr2;
                    i28 = i8;
                    abstractActivityC334612 = abstractActivityC33464;
                    objArr10 = objArr6;
                case -1663714963:
                case 1547844544:
                    objArr5 = objArr9;
                    i7 = i27;
                    objArr6 = objArr10;
                    abstractActivityC33464 = abstractActivityC334612;
                    i8 = i28;
                    sArr2 = sArr5;
                    abstractActivityC33465 = abstractActivityC334613;
                    c2 = c3;
                    i18 = C2105.m6981(C0237.m1483(f2211, 27, 3, i25));
                    m69812 = (C0630.m2566("ܽ֫") ^ i21) * (-51);
                    i9 = ((m69812 ^ i20) * 26351) ^ (-1369288559);
                    i10 = 341923151;
                    z = i14;
                    i11 = m69812 ^ i10;
                    c3 = c2;
                    i14 = z;
                    i27 = i7;
                    objArr9 = objArr5;
                    i23 = i11;
                    i22 = i9;
                    abstractActivityC334613 = abstractActivityC33465;
                    sArr5 = sArr2;
                    i28 = i8;
                    abstractActivityC334612 = abstractActivityC33464;
                    objArr10 = objArr6;
                case -1624270688:
                case 1546896725:
                    objArr = objArr9;
                    abstractActivityC3346 = c5484.f17021;
                    int i30 = DialogInterfaceC0206.f1451;
                    c19258 = new C19258(abstractActivityC3346);
                    C0382.m1849(c19258, i17);
                    abstractActivityC334613 = c5484.f17021;
                    C16709 c167093 = viewOnClickListenerC05442.f2213;
                    if (C21923.m49329()) {
                        c16709 = c167093;
                        i3 = i27;
                        objArr4 = objArr10;
                        c = c3;
                        abstractActivityC33462 = abstractActivityC334612;
                        i4 = i28;
                        sArr = sArr5;
                        int m25664 = C0630.m2566("ۢ᩵") ^ i20;
                        i22 = ((m25664 ^ i21) * (-22621)) ^ 677615532;
                        i6 = m25664 ^ (-953279519);
                        c3 = c;
                        sArr5 = sArr;
                        i27 = i3;
                        i28 = i4;
                        abstractActivityC334612 = abstractActivityC33462;
                        objArr9 = objArr;
                        objArr10 = objArr4;
                        i23 = i6;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    } else {
                        int m69814 = C2105.m6981("᩺֨") ^ i21;
                        c16709 = c167093;
                        i22 = ((m69814 ^ i20) * 20035) ^ 655510802;
                        objArr2 = objArr;
                        i23 = m69814 ^ (-85321637);
                        objArr9 = objArr2;
                    }
                case -1490553791:
                case 1336848353:
                    objArr5 = objArr9;
                    i7 = i27;
                    objArr6 = objArr10;
                    c2 = c3;
                    abstractActivityC33464 = abstractActivityC334612;
                    i8 = i28;
                    sArr2 = sArr5;
                    abstractActivityC33465 = abstractActivityC334613;
                    if (i7 == (C0630.m2566(RunnableC1108.m3789(f2211, 24, 3, i25)) ^ 2099553483)) {
                        m69812 = (C0630.m2566("ᩳ۟") ^ i21) * 87;
                        i9 = ((m69812 ^ i20) * (-27919)) ^ 1280479995;
                        i10 = 119965272;
                        z = i14;
                    } else {
                        m69812 = C2105.m6981("ᩳܰ") ^ i20;
                        i9 = ((m69812 ^ i21) * 7825) ^ 1869216007;
                        i10 = 1224516940;
                        z = i14;
                    }
                    i11 = m69812 ^ i10;
                    c3 = c2;
                    i14 = z;
                    i27 = i7;
                    objArr9 = objArr5;
                    i23 = i11;
                    i22 = i9;
                    abstractActivityC334613 = abstractActivityC33465;
                    sArr5 = sArr2;
                    i28 = i8;
                    abstractActivityC334612 = abstractActivityC33464;
                    objArr10 = objArr6;
                case -1435364199:
                case 725785935:
                    objArr5 = objArr9;
                    i7 = i27;
                    objArr6 = objArr10;
                    c2 = c3;
                    abstractActivityC33464 = abstractActivityC334612;
                    i8 = i28;
                    sArr2 = sArr5;
                    abstractActivityC33465 = abstractActivityC334613;
                    z = true;
                    z = true;
                    str2 = null;
                    if (i7 == (C0630.m2566(str3) ^ 2130012169)) {
                        m69812 = C2105.m6981("᩹᩹") ^ i21;
                        i9 = ((m69812 ^ i20) * (-7825)) ^ (-1871714307);
                        i10 = -1233042114;
                    } else {
                        m69812 = C2105.m6981("ۨ֨") ^ i21;
                        i9 = ((m69812 ^ i20) * (-23639)) ^ 1023022927;
                        i10 = 137337258;
                    }
                    i11 = m69812 ^ i10;
                    c3 = c2;
                    i14 = z;
                    i27 = i7;
                    objArr9 = objArr5;
                    i23 = i11;
                    i22 = i9;
                    abstractActivityC334613 = abstractActivityC33465;
                    sArr5 = sArr2;
                    i28 = i8;
                    abstractActivityC334612 = abstractActivityC33464;
                    objArr10 = objArr6;
                case -1418744118:
                case 1037784429:
                    objArr5 = objArr9;
                    short[] sArr8 = sArr5;
                    abstractActivityC33465 = abstractActivityC334613;
                    Object[] objArr11 = objArr10;
                    abstractActivityC33464 = abstractActivityC334612;
                    i8 = i28;
                    sArr2 = sArr8;
                    objArr6 = objArr11;
                    i7 = i27;
                    if (i7 == (C0630.m2566(C3663.m11162(f2211, 39, 3, i25)) ^ 2125374567)) {
                        m25662 = C2105.m6981("ۢܽ") ^ i20;
                        i9 = ((m25662 ^ i21) * 28021) ^ 581849353;
                        i12 = 1258644231;
                        i11 = m25662 ^ i12;
                        i14 = i14;
                        i27 = i7;
                        objArr9 = objArr5;
                        i23 = i11;
                        i22 = i9;
                        abstractActivityC334613 = abstractActivityC33465;
                        sArr5 = sArr2;
                        i28 = i8;
                        abstractActivityC334612 = abstractActivityC33464;
                        objArr10 = objArr6;
                    }
                    m25662 = (C2105.m6981("᩻֫") + i21) * 39;
                    i9 = ((m25662 ^ i20) * (-31579)) ^ (-1617045356);
                    i12 = 1589773916;
                    i11 = m25662 ^ i12;
                    i14 = i14;
                    i27 = i7;
                    objArr9 = objArr5;
                    i23 = i11;
                    i22 = i9;
                    abstractActivityC334613 = abstractActivityC33465;
                    sArr5 = sArr2;
                    i28 = i8;
                    abstractActivityC334612 = abstractActivityC33464;
                    objArr10 = objArr6;
                case -1354128206:
                case -1143480110:
                    objArr5 = objArr9;
                    short[] sArr9 = sArr5;
                    abstractActivityC33465 = abstractActivityC334613;
                    int i31 = i28;
                    int m25665 = C0630.m2566(C5695.m16034(sArr9, i31, 3, i25)) ^ 2097506111;
                    sArr2 = sArr9;
                    AbstractActivityC3346 abstractActivityC334614 = abstractActivityC334612;
                    i8 = i31;
                    Object[] objArr12 = objArr10;
                    str4 = ServiceConnectionC3453.m10566(abstractActivityC334614, m25665, objArr12);
                    if (C2958.f9394 >= 0) {
                        abstractActivityC33464 = abstractActivityC334614;
                        objArr6 = objArr12;
                        i7 = i27;
                        m25662 = (C2105.m6981("ܿܳ") ^ i21) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i9 = ((m25662 ^ i20) * 24823) ^ (-373766492);
                        i12 = -1537378995;
                        i11 = m25662 ^ i12;
                        i14 = i14;
                        i27 = i7;
                        objArr9 = objArr5;
                        i23 = i11;
                        i22 = i9;
                        abstractActivityC334613 = abstractActivityC33465;
                        sArr5 = sArr2;
                        i28 = i8;
                        abstractActivityC334612 = abstractActivityC33464;
                        objArr10 = objArr6;
                    } else {
                        int m25666 = C0630.m2566("֫᩹") ^ i21;
                        i22 = ((m25666 ^ i20) * (-28855)) ^ (-332914021);
                        i23 = m25666 ^ (-551756599);
                        objArr9 = objArr5;
                        objArr10 = objArr12;
                        abstractActivityC334613 = abstractActivityC33465;
                        sArr5 = sArr2;
                        i28 = i8;
                        abstractActivityC334612 = abstractActivityC334614;
                    }
                case -1270664805:
                case -1214559343:
                    C3537.m10741(c19258, str5);
                    C1294.m4380(c19258, i16, new DialogInterface.OnClickListener(viewOnClickListenerC05442) { // from class: l.ᩴܽ᩷

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC0544 f59540;

                        {
                            int i32 = -1511053334;
                            int i33 = C11340.f33930;
                            int i34 = C7811.f24123;
                            int m25667 = (i34 - C0630.m2566("ۖܽ")) * 19;
                            int i35 = ((m25667 ^ i33) * 19547) ^ 1649635030;
                            int i36 = -1367826901;
                            while (true) {
                                i32 = ((((i32 ^ i33) * 3789) >> 31) & i35) ^ (m25667 ^ i36);
                                switch (i32) {
                                    case -1721444963:
                                    case 1357326388:
                                        C0382.m1848();
                                        m25667 = (C2105.m6981("ۨܿ") + i33) * (-105);
                                        i35 = ((m25667 ^ i34) * (-24007)) ^ (-939097278);
                                        i36 = 1411613703;
                                    case -1699283381:
                                    case 1320238377:
                                        this.f59540 = viewOnClickListenerC05442;
                                        if (C1294.f4556 >= 0) {
                                            m25667 = C0630.m2566("ܺ۟") ^ i33;
                                            i35 = ((m25667 ^ i34) * 31567) ^ (-835786110);
                                            i36 = -1982214353;
                                        } else {
                                            m25667 = (C2105.m6981("᩸֨") ^ i34) * 93;
                                            i35 = ((m25667 ^ i33) * 10247) ^ (-458160697);
                                            i36 = -480782333;
                                        }
                                    case -1633510749:
                                    case 1033159346:
                                        if (C4159.f13567) {
                                            m25667 = (i34 - C0630.m2566("᩹ۘ")) * (-113);
                                            i35 = ((m25667 ^ i33) * 3025) ^ 373959967;
                                            i36 = 1221985748;
                                        } else {
                                            m25667 = C2105.m6981("֡ۖ") ^ i33;
                                            i35 = ((m25667 ^ i34) * 26703) ^ 2124217874;
                                            i36 = 984203349;
                                        }
                                    case -1476642659:
                                    case 1942594099:
                                        if (C3245.m9925() != 0) {
                                            m25667 = (C2105.m6981("ۨܿ") + i33) * (-105);
                                            i35 = ((m25667 ^ i34) * (-24007)) ^ (-939097278);
                                            i36 = 1411613703;
                                        } else {
                                            m25667 = (C2105.m6981("ܺܺ") ^ i33) * 25;
                                            i35 = ((m25667 ^ i34) * 22917) ^ 1232007049;
                                            i36 = 1245908854;
                                        }
                                    case -1367827534:
                                    case -660538606:
                                        C2105.m6982();
                                        C3245.m9925();
                                        throw new RuntimeException();
                                    case -1311491300:
                                    case -293383620:
                                        C3245.m9925();
                                        if (RunnableC1937.f6483 < 0) {
                                            m25667 = C0630.m2566("ۗ۫") ^ i34;
                                            i35 = ((m25667 ^ i33) * ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) ^ 1757048710;
                                            i36 = 1133753063;
                                        } else {
                                            m25667 = C0630.m2566("ܺ۟") ^ i33;
                                            i35 = ((m25667 ^ i34) * 31567) ^ (-835786110);
                                            i36 = -1982214353;
                                        }
                                    case -1299167837:
                                    case -228348588:
                                        if (C3746.m11369() >= 0) {
                                            m25667 = (C2105.m6981("ۨܿ") + i33) * (-105);
                                            i35 = ((m25667 ^ i34) * (-24007)) ^ (-939097278);
                                            i36 = 1411613703;
                                        } else {
                                            m25667 = (C2105.m6981("ᩳۛ") ^ i34) * (-43);
                                            i35 = ((m25667 ^ i33) * 12647) ^ (-1419688008);
                                            i36 = 1289960143;
                                        }
                                    case -1297042564:
                                    case 1774973277:
                                        if (C2272.m7503()) {
                                            m25667 = C2105.m6981("֡ۖ") ^ i33;
                                            i35 = ((m25667 ^ i34) * 26703) ^ 2124217874;
                                            i36 = 984203349;
                                        } else {
                                            m25667 = C0630.m2566("᩹ۖ") ^ i34;
                                            i35 = ((m25667 ^ i33) * 13771) ^ (-1707116896);
                                            i36 = -427395214;
                                        }
                                    case -227556502:
                                    case 630215588:
                                        if (C1504.f5354) {
                                            m25667 = C0630.m2566("ۗ۫") ^ i34;
                                            i35 = ((m25667 ^ i33) * ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) ^ 1757048710;
                                            i36 = 1133753063;
                                        } else {
                                            m25667 = (i33 - C0630.m2566("ۗ֡")) * (-9);
                                            i35 = ((m25667 ^ i34) * 5201) ^ 1460397640;
                                            i36 = -481839997;
                                        }
                                    case -196129866:
                                    case 980892543:
                                        if (C7106.f21815 != 0) {
                                            m25667 = C2105.m6981("֡ۖ") ^ i33;
                                            i35 = ((m25667 ^ i34) * 26703) ^ 2124217874;
                                            i36 = 984203349;
                                        } else {
                                            m25667 = (i34 - C0630.m2566("ۧۛ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i35 = ((m25667 ^ i33) * (-18481)) ^ (-1735863833);
                                            i36 = 1772977256;
                                        }
                                    case -125405513:
                                    case 1055927148:
                                        if (C11340.f33930 >= 0) {
                                            m25667 = C2105.m6981("֡ۖ") ^ i33;
                                            i35 = ((m25667 ^ i34) * 26703) ^ 2124217874;
                                            i36 = 984203349;
                                        } else {
                                            m25667 = C0630.m2566("ۤۖ") ^ i33;
                                            i35 = ((m25667 ^ i34) * (-2271)) ^ 1493988916;
                                            i36 = -649317013;
                                        }
                                    case 90924238:
                                    case 1190401592:
                                        if (C0798.m2998() != 0) {
                                            m25667 = (C2105.m6981("ᩳۛ") ^ i34) * (-43);
                                            i35 = ((m25667 ^ i33) * 12647) ^ (-1419688008);
                                            i36 = 1289960143;
                                        } else {
                                            m25667 = C2105.m6981("ۚܿ") ^ i33;
                                            i35 = ((m25667 ^ i34) * 16327) ^ 785968475;
                                            i36 = 543536943;
                                        }
                                    case 224841253:
                                    case 546903608:
                                        return;
                                    case 283617834:
                                    case 1467320648:
                                        if (C3746.m11369() >= 0) {
                                            m25667 = (C2105.m6981("ᩳۛ") ^ i34) * (-43);
                                            i35 = ((m25667 ^ i33) * 12647) ^ (-1419688008);
                                            i36 = 1289960143;
                                        } else {
                                            m25667 = C0630.m2566("ۢۜ") ^ i34;
                                            i35 = ((m25667 ^ i33) * 14933) ^ 1448270474;
                                            i36 = -535773078;
                                        }
                                    case 1143170568:
                                    case 1373690135:
                                        if (C3432.f10845 >= 0) {
                                            m25667 = C2105.m6981("֡ۖ") ^ i33;
                                            i35 = ((m25667 ^ i34) * 26703) ^ 2124217874;
                                            i36 = 984203349;
                                        } else {
                                            m25667 = C2105.m6981("ۧܺ") ^ i33;
                                            i35 = ((m25667 ^ i34) * (-10613)) ^ (-601304055);
                                            i36 = 1250451628;
                                        }
                                    default:
                                        C0382.m1848();
                                        if (C0714.f2697 < 0) {
                                            m25667 = (C2105.m6981("ᩳۛ") ^ i34) * (-43);
                                            i35 = ((m25667 ^ i33) * 12647) ^ (-1419688008);
                                            i36 = 1289960143;
                                        } else {
                                            m25667 = C0630.m2566("ۗ۫") ^ i34;
                                            i35 = ((m25667 ^ i33) * ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) ^ 1757048710;
                                            i36 = 1133753063;
                                        }
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i32) {
                            int i33 = 1798368320;
                            int i34 = RunnableC3474.f10992;
                            int i35 = AbstractC2021.f6743;
                            int m69815 = (i35 - C2105.m6981("۠᩶")) * 13;
                            int i36 = ((m69815 ^ i34) * 30805) ^ 1309169736;
                            int i37 = 1655834218;
                            while (true) {
                                i33 = ((((i33 ^ i34) * 11271) >> 31) & i36) ^ (m69815 ^ i37);
                                switch (i33) {
                                    case -2021630700:
                                    case -559420630:
                                        if (C1294.f4556 >= 0) {
                                            m69815 = C0630.m2566("۫۫") ^ i34;
                                            i36 = ((m69815 ^ i35) * 30665) ^ 1065592178;
                                            i37 = 1030701322;
                                        } else {
                                            m69815 = C0630.m2566("᩺ۜ") ^ i34;
                                            i36 = ((m69815 ^ i35) * (-16295)) ^ 351676696;
                                            i37 = -1309495178;
                                        }
                                    case -1997714070:
                                    case -840233404:
                                        C1128.m3851();
                                        break;
                                    case -1939226134:
                                    case -1603964914:
                                        if (C3432.f10845 >= 0) {
                                            m69815 = C0630.m2566("۫۫") ^ i34;
                                            i36 = ((m69815 ^ i35) * 30665) ^ 1065592178;
                                            i37 = 1030701322;
                                        } else {
                                            m69815 = (i34 - C2105.m6981("ܳۛ")) * (-31);
                                            i36 = ((m69815 ^ i35) * (-29101)) ^ 1300301132;
                                            i37 = -99936209;
                                        }
                                    case -1844537968:
                                    case 1202861987:
                                        if (C5695.f17556 >= 0) {
                                            m69815 = C2105.m6981("᩹᩻") ^ i34;
                                            i36 = ((m69815 ^ i35) * 8677) ^ (-1976226357);
                                            i37 = -2064397877;
                                        } else {
                                            m69815 = (C0630.m2566("ۢ᩷") ^ i35) * 73;
                                            i36 = ((m69815 ^ i34) * 6345) ^ 1555662714;
                                            i37 = -955537682;
                                        }
                                    case -1701507443:
                                    case -261247944:
                                        if (C0798.f2919) {
                                            m69815 = C2105.m6981("᩹᩻") ^ i34;
                                            i36 = ((m69815 ^ i35) * 8677) ^ (-1976226357);
                                            i37 = -2064397877;
                                        } else {
                                            m69815 = (i34 - C2105.m6981("ᩴ֨")) * (-5);
                                            i36 = ((m69815 ^ i35) * (-15137)) ^ 1212825003;
                                            i37 = -1037393232;
                                        }
                                    case -1692808590:
                                    case 809877633:
                                        if (RunnableC1937.f6483 >= 0) {
                                            m69815 = C0630.m2566("۫۫") ^ i34;
                                            i36 = ((m69815 ^ i35) * 30665) ^ 1065592178;
                                            i37 = 1030701322;
                                        } else {
                                            m69815 = (i34 - C2105.m6981("᩹ۡ")) * (-63);
                                            i36 = ((m69815 ^ i35) * 759) ^ 352810363;
                                            i37 = -1199875716;
                                        }
                                    case -1660997939:
                                    case -803518855:
                                        if (C0237.f1507 != 0) {
                                            m69815 = C0630.m2566("۫۫") ^ i34;
                                            i36 = ((m69815 ^ i35) * 30665) ^ 1065592178;
                                            i37 = 1030701322;
                                        } else {
                                            m69815 = (C2105.m6981("۠ܿ") + i35) * 51;
                                            i36 = ((m69815 ^ i34) * 23821) ^ (-277754656);
                                            i37 = 574815489;
                                        }
                                    case -1044418232:
                                    case 1717863175:
                                        ViewOnClickListenerC0544.m2283(this.f59540, dialogInterfaceC0206);
                                        break;
                                    case -1030544338:
                                    case 290321413:
                                        if (RunnableC1937.f6483 >= 0) {
                                            m69815 = C2105.m6981("᩹᩻") ^ i34;
                                            i36 = ((m69815 ^ i35) * 8677) ^ (-1976226357);
                                            i37 = -2064397877;
                                        } else {
                                            m69815 = (i34 - C2105.m6981("۬᩷")) * (-53);
                                            i36 = ((m69815 ^ i35) * 495) ^ 448958088;
                                            i37 = 681297894;
                                        }
                                    case -873936908:
                                    case -861585057:
                                        if (C0050.f910 >= 0) {
                                            m69815 = C2105.m6981("᩹᩻") ^ i34;
                                            i36 = ((m69815 ^ i35) * 8677) ^ (-1976226357);
                                            i37 = -2064397877;
                                        } else {
                                            m69815 = C0630.m2566("ۗۚ") ^ i35;
                                            i36 = ((m69815 ^ i34) * 22979) ^ 1485666572;
                                            i37 = 1206362469;
                                        }
                                    case -732905837:
                                    case 252549976:
                                        C1047.m3599();
                                        C0382.m1848();
                                        m69815 = C2105.m6981("᩹ܽ") ^ i35;
                                        i36 = ((m69815 ^ i34) * 10035) ^ 217664016;
                                        i37 = -1690125789;
                                    case -451261628:
                                    case 2089177395:
                                        C3537.m10746();
                                        if (C0382.f1805) {
                                            m69815 = (i34 - C2105.m6981("ᩴ֨")) * (-5);
                                            i36 = ((m69815 ^ i35) * (-15137)) ^ 1212825003;
                                            i37 = -1037393232;
                                        } else {
                                            m69815 = C2105.m6981("᩹ܽ") ^ i35;
                                            i36 = ((m69815 ^ i34) * 10035) ^ 217664016;
                                            i37 = -1690125789;
                                        }
                                    case 23470033:
                                    case 1906237032:
                                        if (C2126.m7040()) {
                                            m69815 = C2105.m6981("᩹ܽ") ^ i35;
                                            i36 = ((m69815 ^ i34) * 10035) ^ 217664016;
                                            i37 = -1690125789;
                                        } else {
                                            m69815 = (C2105.m6981("ܿ᩺") ^ i35) * 5;
                                            i36 = ((m69815 ^ i34) * 22723) ^ (-1392121765);
                                            i37 = 288438006;
                                        }
                                    case 147628683:
                                    case 1552241095:
                                        C0964.m3413();
                                        if (C3746.f11829 <= 0) {
                                            m69815 = C2105.m6981("᩹᩻") ^ i34;
                                            i36 = ((m69815 ^ i35) * 8677) ^ (-1976226357);
                                            i37 = -2064397877;
                                        } else {
                                            m69815 = (C0630.m2566("۫᩺") + i35) * (-41);
                                            i36 = ((m69815 ^ i34) * 15931) ^ 1418190036;
                                            i37 = -286932602;
                                        }
                                    case 232737672:
                                    case 1350062489:
                                        if (C0714.f2697 >= 0) {
                                            m69815 = (C0630.m2566("۫᩺") + i35) * (-41);
                                            i36 = ((m69815 ^ i34) * 15931) ^ 1418190036;
                                            i37 = -286932602;
                                        } else {
                                            m69815 = C2105.m6981("۬۬") ^ i34;
                                            i36 = ((m69815 ^ i35) * (-1671)) ^ 1583362453;
                                            i37 = -1442654247;
                                        }
                                    default:
                                        if (C0798.m2998() != 0) {
                                            m69815 = C2105.m6981("᩹ܽ") ^ i35;
                                            i36 = ((m69815 ^ i34) * 10035) ^ 217664016;
                                            i37 = -1690125789;
                                        } else {
                                            m69815 = (C2105.m6981("᩺ۧ") ^ i35) * (-57);
                                            i36 = ((m69815 ^ i34) * (-1469)) ^ 1690897918;
                                            i37 = -2072829629;
                                        }
                                }
                                return;
                            }
                        }
                    });
                    C5695.m16035(c19258, i15, str2);
                    C3683.m11213(c19258);
                    objArr5 = objArr9;
                    i7 = i27;
                    objArr6 = objArr10;
                    abstractActivityC33464 = abstractActivityC334612;
                    i8 = i28;
                    sArr2 = sArr5;
                    abstractActivityC33465 = abstractActivityC334613;
                    m25662 = (C2105.m6981("᩻֫") + i21) * 39;
                    i9 = ((m25662 ^ i20) * (-31579)) ^ (-1617045356);
                    i12 = 1589773916;
                    i11 = m25662 ^ i12;
                    i14 = i14;
                    i27 = i7;
                    objArr9 = objArr5;
                    i23 = i11;
                    i22 = i9;
                    abstractActivityC334613 = abstractActivityC33465;
                    sArr5 = sArr2;
                    i28 = i8;
                    abstractActivityC334612 = abstractActivityC33464;
                    objArr10 = objArr6;
                case -1263377108:
                case -676383910:
                    objArr5 = objArr9;
                    i7 = i27;
                    objArr6 = objArr10;
                    abstractActivityC33464 = abstractActivityC334612;
                    i8 = i28;
                    sArr2 = sArr5;
                    abstractActivityC33465 = abstractActivityC334613;
                    i15 = C0630.m2566(C0798.m3005(f2211, 30, 3, i25)) ^ 2101785860;
                    if (!C0798.f2919) {
                        m25662 = (C0630.m2566("֡ۛ") ^ i21) * 123;
                        i9 = ((m25662 ^ i20) * (-22945)) ^ (-598706511);
                        i12 = -722955895;
                        i11 = m25662 ^ i12;
                        i14 = i14;
                        i27 = i7;
                        objArr9 = objArr5;
                        i23 = i11;
                        i22 = i9;
                        abstractActivityC334613 = abstractActivityC33465;
                        sArr5 = sArr2;
                        i28 = i8;
                        abstractActivityC334612 = abstractActivityC33464;
                        objArr10 = objArr6;
                    }
                    m25662 = C2105.m6981("᩶ܿ") ^ i21;
                    i9 = ((m25662 ^ i20) * (-12337)) ^ 2033667054;
                    i12 = -360044930;
                    i11 = m25662 ^ i12;
                    i14 = i14;
                    i27 = i7;
                    objArr9 = objArr5;
                    i23 = i11;
                    i22 = i9;
                    abstractActivityC334613 = abstractActivityC33465;
                    sArr5 = sArr2;
                    i28 = i8;
                    abstractActivityC334612 = abstractActivityC33464;
                    objArr10 = objArr6;
                case -1071387887:
                case 428522549:
                    abstractActivityC33466 = c5484.f17021;
                    ActivityC12581.m30822(abstractActivityC33466, C0483.m2134(viewOnClickListenerC05442.f2213), viewOnClickListenerC05442.f2217.getDrawable(), i14, str2);
                    break;
                case -869189950:
                case 1666422362:
                    objArr5 = objArr9;
                    i7 = i27;
                    objArr6 = objArr10;
                    abstractActivityC33464 = abstractActivityC334612;
                    i8 = i28;
                    sArr2 = sArr5;
                    abstractActivityC33465 = abstractActivityC334613;
                    i16 = C0630.m2566(C3663.m11162(f2211, 33, 3, i25)) ^ 2128495555;
                    if (C1916.m6308() < 0) {
                        m25662 = (C0630.m2566("ۧۤ") ^ i20) * 101;
                        i9 = ((m25662 ^ i21) * (-2501)) ^ 2073227187;
                        i12 = -610705954;
                        i11 = m25662 ^ i12;
                        i14 = i14;
                        i27 = i7;
                        objArr9 = objArr5;
                        i23 = i11;
                        i22 = i9;
                        abstractActivityC334613 = abstractActivityC33465;
                        sArr5 = sArr2;
                        i28 = i8;
                        abstractActivityC334612 = abstractActivityC33464;
                        objArr10 = objArr6;
                    }
                    m25662 = C2105.m6981("᩶ܿ") ^ i21;
                    i9 = ((m25662 ^ i20) * (-12337)) ^ 2033667054;
                    i12 = -360044930;
                    i11 = m25662 ^ i12;
                    i14 = i14;
                    i27 = i7;
                    objArr9 = objArr5;
                    i23 = i11;
                    i22 = i9;
                    abstractActivityC334613 = abstractActivityC33465;
                    sArr5 = sArr2;
                    i28 = i8;
                    abstractActivityC334612 = abstractActivityC33464;
                    objArr10 = objArr6;
                case -794290946:
                case 1553281677:
                    objArr = objArr9;
                    i3 = i27;
                    objArr4 = objArr10;
                    c = c3;
                    abstractActivityC33462 = abstractActivityC334612;
                    i4 = i28;
                    sArr = sArr5;
                    abstractActivityC33463 = abstractActivityC334613;
                    i25 = 28513;
                    m6981 = (i21 - C2105.m6981("֫᩻")) * 57;
                    i22 = ((m6981 ^ i20) * 15289) ^ (-1753099467);
                    i5 = 540518840;
                    i6 = m6981 ^ i5;
                    c3 = c;
                    abstractActivityC334613 = abstractActivityC33463;
                    sArr5 = sArr;
                    i27 = i3;
                    i28 = i4;
                    abstractActivityC334612 = abstractActivityC33462;
                    objArr9 = objArr;
                    objArr10 = objArr4;
                    i23 = i6;
                    viewOnClickListenerC05442 = viewOnClickListenerC0544;
                case -655088805:
                case 8715081:
                    objArr = objArr9;
                    c = c3;
                    objArr4 = objArr10;
                    abstractActivityC33462 = abstractActivityC334612;
                    i4 = i28;
                    sArr = sArr5;
                    abstractActivityC33463 = abstractActivityC334613;
                    C5484 c54842 = viewOnClickListenerC05442.f2214;
                    i3 = C2126.m7041(menuItem);
                    str3 = C1916.m6311(f2211, 21, 3, i25);
                    int m69815 = (C2105.m6981("۠᩶") + i20) * (-15);
                    int i32 = ((m69815 ^ i21) * 12857) ^ 2120966855;
                    i6 = m69815 ^ (-1170524931);
                    c5484 = c54842;
                    i22 = i32;
                    c3 = c;
                    abstractActivityC334613 = abstractActivityC33463;
                    sArr5 = sArr;
                    i27 = i3;
                    i28 = i4;
                    abstractActivityC334612 = abstractActivityC33462;
                    objArr9 = objArr;
                    objArr10 = objArr4;
                    i23 = i6;
                    viewOnClickListenerC05442 = viewOnClickListenerC0544;
                case -225564400:
                case 677362747:
                    objArr = objArr9;
                    i3 = i27;
                    objArr4 = objArr10;
                    c = c3;
                    abstractActivityC33462 = abstractActivityC334612;
                    i4 = i28;
                    sArr = sArr5;
                    abstractActivityC33463 = abstractActivityC334613;
                    int i33 = s + s2;
                    if ((i33 * i33) - ((s * 2) + 1) < 0) {
                        m6981 = C0630.m2566("᩶ۚ") ^ i20;
                        i22 = ((m6981 ^ i21) * (-15421)) ^ 473357018;
                        i5 = 1549785474;
                    } else {
                        m6981 = (C0630.m2566("ۙۚ") + i21) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i22 = ((m6981 ^ i20) * 16555) ^ (-753987509);
                        i5 = -1133420182;
                    }
                    i6 = m6981 ^ i5;
                    c3 = c;
                    abstractActivityC334613 = abstractActivityC33463;
                    sArr5 = sArr;
                    i27 = i3;
                    i28 = i4;
                    abstractActivityC334612 = abstractActivityC33462;
                    objArr9 = objArr;
                    objArr10 = objArr4;
                    i23 = i6;
                    viewOnClickListenerC05442 = viewOnClickListenerC0544;
                case -200037855:
                case 1797469776:
                    break;
                case 251488167:
                case 1440846878:
                    objArr9 = new Object[i14];
                    objArr9[c3] = c16709.m39302();
                    sArr6 = f2211;
                    if (C0382.f1805) {
                        int m69816 = (i20 - C2105.m6981("ۙۛ")) * (-99);
                        i23 = m69816 ^ 1988746734;
                        i22 = ((m69816 ^ i21) * 18483) ^ 773304791;
                        i24 = 45;
                    } else {
                        objArr7 = objArr9;
                        sArr3 = sArr5;
                        str = str4;
                        i24 = 45;
                        abstractActivityC334610 = abstractActivityC334613;
                        objArr8 = objArr10;
                        abstractActivityC334611 = abstractActivityC334612;
                        m25663 = C0630.m2566("᩸ᩴ") ^ i21;
                        sArr4 = sArr3;
                        i22 = ((m25663 ^ i20) * 16659) ^ (-14779445);
                        i13 = -2051688170;
                        short[] sArr722 = sArr4;
                        str4 = str;
                        objArr9 = objArr7;
                        i23 = m25663 ^ i13;
                        abstractActivityC334612 = abstractActivityC334611;
                        objArr10 = objArr8;
                        abstractActivityC334613 = abstractActivityC334610;
                        sArr5 = sArr722;
                    }
                case 384140679:
                case 1895938572:
                    objArr = objArr9;
                    i4 = i28;
                    sArr = sArr5;
                    AbstractActivityC3346 abstractActivityC334615 = abstractActivityC334613;
                    Object[] objArr13 = objArr10;
                    abstractActivityC33468 = c5484.f17021;
                    int i34 = DialogInterfaceC0206.f1451;
                    C19258 c192583 = new C19258(abstractActivityC33468);
                    C3432.m10490(c192583, i17);
                    abstractActivityC33469 = c5484.f17021;
                    C16709 c167094 = viewOnClickListenerC05442.f2213;
                    if (C0483.f2088 >= 0) {
                        c192582 = c192583;
                        objArr4 = objArr13;
                        i3 = i27;
                        abstractActivityC33462 = abstractActivityC33469;
                        abstractActivityC334613 = abstractActivityC334615;
                        c167092 = c167094;
                        c = c3;
                        int m256642 = C0630.m2566("ۢ᩵") ^ i20;
                        i22 = ((m256642 ^ i21) * (-22621)) ^ 677615532;
                        i6 = m256642 ^ (-953279519);
                        c3 = c;
                        sArr5 = sArr;
                        i27 = i3;
                        i28 = i4;
                        abstractActivityC334612 = abstractActivityC33462;
                        objArr9 = objArr;
                        objArr10 = objArr4;
                        i23 = i6;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    } else {
                        int m69817 = (i20 - C2105.m6981("ᩴۛ")) * 5;
                        i22 = ((m69817 ^ i21) * 11275) ^ 250489790;
                        c192582 = c192583;
                        objArr9 = objArr;
                        i23 = m69817 ^ (-1274136724);
                        objArr10 = objArr13;
                        abstractActivityC334613 = abstractActivityC334615;
                        sArr5 = sArr;
                        i28 = i4;
                        abstractActivityC334612 = abstractActivityC33469;
                        c167092 = c167094;
                    }
                case 572938224:
                case 1166126044:
                    C1711.m5736();
                    if (C1773.f6144 > 0) {
                        objArr7 = objArr9;
                        sArr3 = sArr5;
                        str = str4;
                        abstractActivityC334610 = abstractActivityC334613;
                        objArr8 = objArr10;
                        abstractActivityC334611 = abstractActivityC334612;
                        m25663 = C0630.m2566("᩸ᩴ") ^ i21;
                        sArr4 = sArr3;
                        i22 = ((m25663 ^ i20) * 16659) ^ (-14779445);
                        i13 = -2051688170;
                        short[] sArr7222 = sArr4;
                        str4 = str;
                        objArr9 = objArr7;
                        i23 = m25663 ^ i13;
                        abstractActivityC334612 = abstractActivityC334611;
                        objArr10 = objArr8;
                        abstractActivityC334613 = abstractActivityC334610;
                        sArr5 = sArr7222;
                    } else {
                        objArr = objArr9;
                        i3 = i27;
                        objArr4 = objArr10;
                        c = c3;
                        abstractActivityC33462 = abstractActivityC334612;
                        i4 = i28;
                        sArr = sArr5;
                        int m2566422 = C0630.m2566("ۢ᩵") ^ i20;
                        i22 = ((m2566422 ^ i21) * (-22621)) ^ 677615532;
                        i6 = m2566422 ^ (-953279519);
                        c3 = c;
                        sArr5 = sArr;
                        i27 = i3;
                        i28 = i4;
                        abstractActivityC334612 = abstractActivityC33462;
                        objArr9 = objArr;
                        objArr10 = objArr4;
                        i23 = i6;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    }
                case 717111745:
                case 1761506171:
                    C3683.m11222();
                    if (C7106.f21815 == 0) {
                        objArr5 = objArr9;
                        i7 = i27;
                        objArr6 = objArr10;
                        abstractActivityC33464 = abstractActivityC334612;
                        i8 = i28;
                        sArr2 = sArr5;
                        abstractActivityC33465 = abstractActivityC334613;
                        m25662 = (C2105.m6981("ܿܳ") ^ i21) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i9 = ((m25662 ^ i20) * 24823) ^ (-373766492);
                        i12 = -1537378995;
                        i11 = m25662 ^ i12;
                        i14 = i14;
                        i27 = i7;
                        objArr9 = objArr5;
                        i23 = i11;
                        i22 = i9;
                        abstractActivityC334613 = abstractActivityC33465;
                        sArr5 = sArr2;
                        i28 = i8;
                        abstractActivityC334612 = abstractActivityC33464;
                        objArr10 = objArr6;
                    } else {
                        m2566 = C2105.m6981("᩵֡") ^ i20;
                        objArr3 = objArr9;
                        i = ((m2566 ^ i21) * (-2933)) ^ 176372303;
                        i2 = 54543293;
                        objArr2 = objArr3;
                        i23 = m2566 ^ i2;
                        i22 = i;
                        objArr9 = objArr2;
                    }
                case 892952046:
                case 1070075116:
                    objArr5 = objArr9;
                    i7 = i27;
                    objArr6 = objArr10;
                    abstractActivityC33464 = abstractActivityC334612;
                    i8 = i28;
                    sArr2 = sArr5;
                    abstractActivityC33465 = abstractActivityC334613;
                    i26 = i18 ^ 2123492145;
                    c3 = 0;
                    if (C3746.f11829 > 0) {
                        m25662 = C0630.m2566("۟᩸") ^ i20;
                        i9 = ((m25662 ^ i21) * (-26413)) ^ 420270812;
                        i12 = 59112223;
                        i11 = m25662 ^ i12;
                        i14 = i14;
                        i27 = i7;
                        objArr9 = objArr5;
                        i23 = i11;
                        i22 = i9;
                        abstractActivityC334613 = abstractActivityC33465;
                        sArr5 = sArr2;
                        i28 = i8;
                        abstractActivityC334612 = abstractActivityC33464;
                        objArr10 = objArr6;
                    }
                    m25662 = (C2105.m6981("ܿܳ") ^ i21) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                    i9 = ((m25662 ^ i20) * 24823) ^ (-373766492);
                    i12 = -1537378995;
                    i11 = m25662 ^ i12;
                    i14 = i14;
                    i27 = i7;
                    objArr9 = objArr5;
                    i23 = i11;
                    i22 = i9;
                    abstractActivityC334613 = abstractActivityC33465;
                    sArr5 = sArr2;
                    i28 = i8;
                    abstractActivityC334612 = abstractActivityC33464;
                    objArr10 = objArr6;
                case 1303381711:
                case 2076861657:
                    abstractActivityC33467 = c5484.f17021;
                    new C15155(abstractActivityC33467, viewOnClickListenerC05442.f2213);
                    break;
                case 1449279626:
                case 1771405917:
                    objArr = objArr9;
                    i3 = i27;
                    objArr4 = objArr10;
                    c = c3;
                    abstractActivityC33462 = abstractActivityC334612;
                    i4 = i28;
                    sArr = sArr5;
                    abstractActivityC33463 = abstractActivityC334613;
                    s = f2211[20];
                    s2 = 1;
                    if (C4159.f13567) {
                        m6981 = C2105.m6981("ۚ۬") ^ i20;
                        i22 = ((m6981 ^ i21) * 5855) ^ (-275696336);
                        i5 = -59424683;
                        i6 = m6981 ^ i5;
                        c3 = c;
                        abstractActivityC334613 = abstractActivityC33463;
                        sArr5 = sArr;
                        i27 = i3;
                        i28 = i4;
                        abstractActivityC334612 = abstractActivityC33462;
                        objArr9 = objArr;
                        objArr10 = objArr4;
                        i23 = i6;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    } else {
                        abstractActivityC334613 = abstractActivityC33463;
                        int m25664222 = C0630.m2566("ۢ᩵") ^ i20;
                        i22 = ((m25664222 ^ i21) * (-22621)) ^ 677615532;
                        i6 = m25664222 ^ (-953279519);
                        c3 = c;
                        sArr5 = sArr;
                        i27 = i3;
                        i28 = i4;
                        abstractActivityC334612 = abstractActivityC33462;
                        objArr9 = objArr;
                        objArr10 = objArr4;
                        i23 = i6;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    }
                case 1857771542:
                case 1880400076:
                    C19258 c192584 = c192582;
                    C3537.m10741(c192584, str4);
                    ViewOnClickListenerC1958.m6441(c192584, i16, new DialogInterface.OnClickListener() { // from class: l.ۘܽ᩷
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i35) {
                            int i36 = 187348916;
                            int i37 = C3245.f10203;
                            int i38 = RunnableC1937.f6483;
                            int m69818 = (C2105.m6981("ۧۢ") + i37) * 109;
                            int i39 = ((m69818 ^ i38) * (-23407)) ^ 1546455970;
                            int i40 = 2018677650;
                            while (true) {
                                i36 = ((((i36 ^ i38) * 29783) >> 31) & i39) ^ (m69818 ^ i40);
                                switch (i36) {
                                    case -2115471347:
                                    case -784415860:
                                        C0630.m2564();
                                        if (C3432.f10845 < 0) {
                                            m69818 = C2105.m6981("᩺ۜ") ^ i38;
                                            i39 = ((m69818 ^ i37) * 2563) ^ 468228626;
                                            i40 = -1977398661;
                                        } else {
                                            m69818 = (i37 - C2105.m6981("ۤۜ")) * (-115);
                                            i39 = ((m69818 ^ i38) * 15057) ^ 1379692214;
                                            i40 = 1561240548;
                                        }
                                    case -2020152792:
                                    case -466381891:
                                        C4117.m12364();
                                        break;
                                    case -1585607742:
                                    case 1082033614:
                                        if (C4263.f13799 <= 0) {
                                            m69818 = C0630.m2566("֨֨") ^ i37;
                                            i39 = ((m69818 ^ i38) * 1301) ^ (-516479886);
                                            i40 = -760190611;
                                        } else {
                                            m69818 = C2105.m6981("۟ۖ") ^ i38;
                                            i39 = ((m69818 ^ i37) * (-8279)) ^ 877682521;
                                            i40 = -990309256;
                                        }
                                    case -1352677091:
                                    case -255228923:
                                        C0798.m2998();
                                        if (C22628.m50615() == 0) {
                                            m69818 = C2105.m6981("᩺ۜ") ^ i38;
                                            i39 = ((m69818 ^ i37) * 2563) ^ 468228626;
                                            i40 = -1977398661;
                                        } else {
                                            m69818 = (C2105.m6981("᩸ۗ") ^ i38) * (-63);
                                            i39 = ((m69818 ^ i37) * (-13279)) ^ 797252988;
                                            i40 = -929495879;
                                        }
                                    case -912521062:
                                    case 1731806604:
                                        if (C0050.m940() <= 0) {
                                            m69818 = C0630.m2566("֨֨") ^ i37;
                                            i39 = ((m69818 ^ i38) * 1301) ^ (-516479886);
                                            i40 = -760190611;
                                        } else {
                                            m69818 = C2105.m6981("ۖ۬") ^ i38;
                                            i39 = ((m69818 ^ i37) * 1961) ^ 935404624;
                                            i40 = 2006871140;
                                        }
                                    case -876763519:
                                    case 1427771525:
                                        if (C11340.m28031()) {
                                            m69818 = C0630.m2566("᩶ܿ") ^ i38;
                                            i39 = ((m69818 ^ i37) * (-23209)) ^ (-175698692);
                                            i40 = -327418622;
                                        } else {
                                            m69818 = (C2105.m6981("᩸ۗ") ^ i38) * (-63);
                                            i39 = ((m69818 ^ i37) * (-13279)) ^ 797252988;
                                            i40 = -929495879;
                                        }
                                    case -698728939:
                                    case 491975242:
                                        if (C0964.m3413()) {
                                            m69818 = (i37 - C0630.m2566("᩺᩷")) * 49;
                                            i39 = ((m69818 ^ i38) * (-31645)) ^ 98672879;
                                            i40 = -856959232;
                                        } else {
                                            m69818 = C0630.m2566("֨֨") ^ i37;
                                            i39 = ((m69818 ^ i38) * 1301) ^ (-516479886);
                                            i40 = -760190611;
                                        }
                                    case -636728582:
                                    case -552266142:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            m69818 = (C2105.m6981("᩸ۗ") ^ i38) * (-63);
                                            i39 = ((m69818 ^ i37) * (-13279)) ^ 797252988;
                                            i40 = -929495879;
                                        } else {
                                            m69818 = (i37 - C2105.m6981("֫ۗ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i39 = ((m69818 ^ i38) * (-30509)) ^ 837033564;
                                            i40 = -1787335704;
                                        }
                                    case -554766124:
                                    case 242342744:
                                        C3746.m11369();
                                        if (C3663.f11553) {
                                            m69818 = (C0630.m2566("۠ܺ") + i37) * 7;
                                            i39 = ((m69818 ^ i38) * 4879) ^ 1881332297;
                                            i40 = 1992399718;
                                        } else {
                                            m69818 = C2105.m6981("᩺ۜ") ^ i38;
                                            i39 = ((m69818 ^ i37) * 2563) ^ 468228626;
                                            i40 = -1977398661;
                                        }
                                    case -427988584:
                                    case 415932284:
                                        C13265.m32207(C0483.m2134(ViewOnClickListenerC0544.this.f2213));
                                        break;
                                    case -348198240:
                                    case 2107316641:
                                        if (C3019.m9255() <= 0) {
                                            m69818 = C2105.m6981("᩺ۜ") ^ i38;
                                            i39 = ((m69818 ^ i37) * 2563) ^ 468228626;
                                            i40 = -1977398661;
                                        } else {
                                            m69818 = (C0630.m2566("᩹᩻") + i37) * (-17);
                                            i39 = ((m69818 ^ i38) * (-31573)) ^ 32861186;
                                            i40 = -1021627719;
                                        }
                                    case -320039771:
                                    case 940565506:
                                        if (C4263.f13799 <= 0) {
                                            m69818 = (C2105.m6981("᩸ۗ") ^ i38) * (-63);
                                            i39 = ((m69818 ^ i37) * (-13279)) ^ 797252988;
                                            i40 = -929495879;
                                        } else {
                                            m69818 = (C2105.m6981("᩶ۤ") + i38) * (-47);
                                            i39 = ((m69818 ^ i37) * (-16483)) ^ 161371240;
                                            i40 = -325164254;
                                        }
                                    case 465809139:
                                    case 470204993:
                                        C0714.m2805();
                                        m69818 = (C0630.m2566("۠ܺ") + i37) * 7;
                                        i39 = ((m69818 ^ i38) * 4879) ^ 1881332297;
                                        i40 = 1992399718;
                                    case 631917054:
                                    case 886096144:
                                        if (C0964.f3626 != 0) {
                                            m69818 = (C2105.m6981("᩸ۗ") ^ i38) * (-63);
                                            i39 = ((m69818 ^ i37) * (-13279)) ^ 797252988;
                                            i40 = -929495879;
                                        } else {
                                            m69818 = C2105.m6981("ۤ֫") ^ i37;
                                            i39 = ((m69818 ^ i38) * (-29119)) ^ 1010052425;
                                            i40 = -2096887571;
                                        }
                                    case 1125718329:
                                    case 1990454639:
                                        if (C1420.f5096 <= 0) {
                                            m69818 = (C2105.m6981("᩸ۗ") ^ i38) * (-63);
                                            i39 = ((m69818 ^ i37) * (-13279)) ^ 797252988;
                                            i40 = -929495879;
                                        } else {
                                            m69818 = (i37 - C2105.m6981("֫ۙ")) * (-41);
                                            i39 = ((m69818 ^ i38) * (-3959)) ^ (-619875397);
                                            i40 = 1117909012;
                                        }
                                    default:
                                        if (C3245.f10203 <= 0) {
                                            m69818 = (C2105.m6981("᩸ۗ") ^ i38) * (-63);
                                            i39 = ((m69818 ^ i37) * (-13279)) ^ 797252988;
                                            i40 = -929495879;
                                        } else {
                                            m69818 = (i38 - C2105.m6981("ۨ֨")) * 15;
                                            i39 = ((m69818 ^ i37) * 15271) ^ (-1450558276);
                                            i40 = -1197608410;
                                        }
                                }
                                return;
                            }
                        }
                    });
                    C2520.m8029(c192584, i15, str2);
                    RunnableC0588.m2438(c192584);
                    break;
                default:
                    if (C4075.f12947 >= 0) {
                        m2566 = C2105.m6981("᩵֡") ^ i20;
                        objArr3 = objArr9;
                        i = ((m2566 ^ i21) * (-2933)) ^ 176372303;
                        i2 = 54543293;
                        objArr2 = objArr3;
                        i23 = m2566 ^ i2;
                        i22 = i;
                        objArr9 = objArr2;
                    } else {
                        objArr7 = objArr9;
                        sArr3 = sArr5;
                        str = str4;
                        abstractActivityC334610 = abstractActivityC334613;
                        objArr8 = objArr10;
                        abstractActivityC334611 = abstractActivityC334612;
                        m25663 = C0630.m2566("᩸ᩴ") ^ i21;
                        sArr4 = sArr3;
                        i22 = ((m25663 ^ i20) * 16659) ^ (-14779445);
                        i13 = -2051688170;
                        short[] sArr72222 = sArr4;
                        str4 = str;
                        objArr9 = objArr7;
                        i23 = m25663 ^ i13;
                        abstractActivityC334612 = abstractActivityC334611;
                        objArr10 = objArr8;
                        abstractActivityC334613 = abstractActivityC334610;
                        sArr5 = sArr72222;
                    }
            }
            return;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C14676 c14676;
        short[] sArr;
        short s;
        int i;
        short[] sArr2;
        View view2;
        int m2566;
        int i2;
        int i3;
        int m25662;
        int i4;
        int i5;
        int m25663;
        int i6;
        int i7;
        int i8;
        short[] sArr3;
        C14676 c146762;
        AbstractActivityC3346 abstractActivityC3346;
        int i9;
        C14676 c146763;
        short[] sArr4;
        int i10;
        short[] sArr5;
        AbstractC15440 m39310;
        C14676 c146764;
        int m25664;
        int i11;
        AbstractActivityC3346 abstractActivityC33462;
        final ViewOnClickListenerC0544 viewOnClickListenerC0544 = this;
        int i12 = 0;
        int i13 = 290539291;
        int i14 = C4117.f13076;
        int i15 = C0422.f1886;
        int m25665 = C0630.m2566("ۖᩴ") ^ i14;
        int i16 = ((m25665 ^ i15) * 711) ^ (-1101447693);
        int i17 = m25665 ^ (-311015042);
        C5484 c5484 = null;
        C16709 c16709 = null;
        AbstractC15440 abstractC15440 = null;
        DialogInterface.OnClickListener onClickListener = null;
        Button button = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        int i18 = 0;
        int i19 = 0;
        boolean z = false;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        char c = 0;
        C14676 c146765 = null;
        int i24 = 0;
        short s2 = 0;
        View view3 = null;
        final DialogInterfaceC0206 dialogInterfaceC0206 = null;
        int i25 = 0;
        C19258 c19258 = null;
        boolean z2 = false;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i15) * 3713) >> 31));
            switch (i13) {
                case -2143573009:
                case 1520901674:
                    i8 = i18;
                    sArr = sArr7;
                    sArr3 = sArr8;
                    C5484 c54842 = viewOnClickListenerC0544.f2214;
                    abstractActivityC3346 = c54842.f17021;
                    c146762 = new C14676(abstractActivityC3346);
                    if (C0483.f2088 >= 0) {
                        c5484 = c54842;
                        i18 = i8;
                        sArr8 = sArr3;
                        c146765 = c146762;
                        int m25666 = C0630.m2566("ۤ֨") ^ i14;
                        i17 = m25666 ^ (-926441637);
                        i16 = ((m25666 ^ i15) * 18343) ^ 1743965535;
                        sArr7 = sArr;
                        viewOnClickListenerC0544 = this;
                    } else {
                        int m25667 = C0630.m2566("ۨ֡") ^ i14;
                        i9 = ((m25667 ^ i15) * 22967) ^ 1546921338;
                        i17 = m25667 ^ 476796155;
                        viewOnClickListenerC0544 = this;
                        c5484 = c54842;
                        i18 = i8;
                        c146765 = c146762;
                        i16 = i9;
                        sArr8 = sArr3;
                        sArr7 = sArr;
                    }
                case -2035205662:
                case 629145228:
                    i22 = C2105.m6981(C2105.m6988(sArr8, 70, 3, i19));
                    i23 = 2120194920;
                    if (C2958.f9394 >= 0) {
                        sArr = sArr7;
                        int m256662 = C0630.m2566("ۤ֨") ^ i14;
                        i17 = m256662 ^ (-926441637);
                        i16 = ((m256662 ^ i15) * 18343) ^ 1743965535;
                        sArr7 = sArr;
                        viewOnClickListenerC0544 = this;
                    } else {
                        m2566 = (C2105.m6981("᩺᩺") + i15) * (-85);
                        i2 = ((m2566 ^ i14) * (-8091)) ^ 884924227;
                        i3 = -81028752;
                        i17 = m2566 ^ i3;
                        i16 = i2;
                    }
                case -1878678910:
                case -1092829647:
                    c146762 = c146765;
                    sArr = sArr7;
                    i8 = i18;
                    z = true;
                    int m6981 = C2105.m6981("ۡۛ") ^ i15;
                    sArr3 = sArr8;
                    i9 = ((m6981 ^ i14) * (-16153)) ^ 2097190848;
                    i17 = m6981 ^ (-1303517435);
                    i18 = i8;
                    c146765 = c146762;
                    i16 = i9;
                    sArr8 = sArr3;
                    sArr7 = sArr;
                case -1717825067:
                case 1390158162:
                    c146762 = c146765;
                    sArr = sArr7;
                    int i26 = i18;
                    sArr3 = sArr8;
                    onClickListener = null;
                    C16709 c167092 = c16709;
                    c146762.m34974(c167092, abstractC15440.mo23127(), null);
                    if (viewOnClickListenerC0544.f2213.m39325() != null) {
                        m25664 = (C0630.m2566("ܶ᩹") ^ i14) * 55;
                        i9 = ((m25664 ^ i15) * 23151) ^ 1476137152;
                        i11 = 893804990;
                    } else {
                        m25664 = (C0630.m2566("᩶۠") ^ i14) * (-25);
                        i9 = ((m25664 ^ i15) * (-4189)) ^ 1869871590;
                        i11 = 1914726159;
                    }
                    i17 = m25664 ^ i11;
                    c16709 = c167092;
                    i18 = i26;
                    z2 = false;
                    c146765 = c146762;
                    i16 = i9;
                    sArr8 = sArr3;
                    sArr7 = sArr;
                case -1643192648:
                case -1627349879:
                    if (C1420.f5096 <= 0) {
                        view2 = view3;
                        int m25668 = C0630.m2566("᩸ۜ") ^ i15;
                        view3 = view2;
                        i16 = ((m25668 ^ i14) * 32217) ^ 86159462;
                        i17 = m25668 ^ 1722757952;
                    } else {
                        c14676 = c146765;
                        sArr = sArr7;
                        s = s2;
                        i = i18;
                        sArr2 = sArr8;
                        m25662 = (C0630.m2566("ܿᩳ") ^ i15) * (-11);
                        i4 = ((m25662 ^ i14) * (-23657)) ^ 784558331;
                        i5 = 578504964;
                        i7 = m25662 ^ i5;
                        s2 = s;
                        i16 = i4;
                        i18 = i;
                        sArr8 = sArr2;
                        c146765 = c14676;
                        i17 = i7;
                        sArr7 = sArr;
                        viewOnClickListenerC0544 = this;
                    }
                case -1431930850:
                case 685949818:
                    sArr = sArr7;
                    abstractActivityC33462 = c5484.f17021;
                    int i27 = DialogInterfaceC0206.f1451;
                    c19258 = new C19258(abstractActivityC33462);
                    c146762 = c146765;
                    int i28 = i18;
                    View view4 = c146762.f44837;
                    if (C7106.f21815 != 0) {
                        view3 = view4;
                        i18 = i28;
                        c146765 = c146762;
                        int m2566622 = C0630.m2566("ۤ֨") ^ i14;
                        i17 = m2566622 ^ (-926441637);
                        i16 = ((m2566622 ^ i15) * 18343) ^ 1743965535;
                        sArr7 = sArr;
                        viewOnClickListenerC0544 = this;
                    } else {
                        int m25669 = C0630.m2566("۟֨") ^ i15;
                        int i29 = ((m25669 ^ i14) * 7977) ^ 1216888914;
                        i17 = m25669 ^ (-1591186219);
                        view3 = view4;
                        sArr7 = sArr;
                        c146765 = c146762;
                        i16 = i29;
                        i18 = i28;
                    }
                case -1180796786:
                case 1514581810:
                    dialogInterfaceC0206 = C5834.m16343(c19258, i25, onClickListener, C2105.m6981(C2272.m7507(sArr9, i18, 3, i19)) ^ 2130413408, onClickListener);
                    button = dialogInterfaceC0206.m1446();
                    if (z) {
                        m2566 = (C2105.m6981("ۜۜ") ^ i15) * (-11);
                        i2 = ((m2566 ^ i14) * (-8235)) ^ 138459205;
                        i3 = -1334661079;
                    } else {
                        m2566 = C2105.m6981("᩷ܺ") ^ i14;
                        i2 = ((m2566 ^ i15) * 4083) ^ 364921535;
                        i3 = 834595020;
                    }
                    i17 = m2566 ^ i3;
                    i16 = i2;
                case -1178339971:
                case 1352334152:
                    view2 = view3;
                    C0798.m3013(c19258, view2);
                    sArr7 = f2211;
                    i24 = 67;
                    if (RunnableC3474.f10992 <= 0) {
                        int m256682 = C0630.m2566("᩸ۜ") ^ i15;
                        view3 = view2;
                        i16 = ((m256682 ^ i14) * 32217) ^ 86159462;
                        i17 = m256682 ^ 1722757952;
                    } else {
                        view3 = view2;
                        m2566 = C0630.m2566("ܶܳ") ^ i14;
                        i2 = ((m2566 ^ i15) * (-27737)) ^ (-626830729);
                        i3 = -304615188;
                        i17 = m2566 ^ i3;
                        i16 = i2;
                    }
                case -1169055078:
                case -171041541:
                    C22628.m50613(button, z2);
                    m2566 = C2105.m6981("ᩳܳ") ^ i15;
                    i2 = ((m2566 ^ i14) * (-5631)) ^ 1757605627;
                    i3 = 1529459588;
                    i17 = m2566 ^ i3;
                    i16 = i2;
                case -1155625738:
                case 46495004:
                    int i30 = i24;
                    sArr = sArr7;
                    int m256610 = C0630.m2566(AbstractC2021.m6573(sArr, i30, 3, i19));
                    if (RunnableC0588.m2441() >= 0) {
                        sArr2 = sArr8;
                        i24 = i30;
                        c14676 = c146765;
                        i21 = 2125667247;
                        i20 = m256610;
                        i = i18;
                        m25663 = (C0630.m2566("۬᩸") ^ i15) * (-13);
                        i16 = ((m25663 ^ i14) * 27829) ^ 321479278;
                        i6 = 1157066707;
                        i7 = m25663 ^ i6;
                        i18 = i;
                        sArr8 = sArr2;
                        c146765 = c14676;
                        i17 = i7;
                        sArr7 = sArr;
                        viewOnClickListenerC0544 = this;
                    } else {
                        int m69812 = (C2105.m6981("ܿ֡") + i15) * (-57);
                        int i31 = ((m69812 ^ i14) * 30617) ^ (-73625891);
                        i17 = m69812 ^ 785987335;
                        sArr7 = sArr;
                        i24 = i30;
                        i20 = m256610;
                        i16 = i31;
                        i21 = 2125667247;
                    }
                case -1147503690:
                case 1252136421:
                    c146763 = c146765;
                    sArr4 = sArr7;
                    i10 = i18;
                    sArr5 = sArr8;
                    C16709 c167093 = viewOnClickListenerC0544.f2213;
                    m39310 = c167093.m39310();
                    if (C4263.m12819() >= 0) {
                        c16709 = c167093;
                        int m69813 = C2105.m6981("ۚ֨") ^ i14;
                        C14676 c146766 = c146763;
                        i16 = ((m69813 ^ i15) * 24267) ^ (-1258051849);
                        abstractC15440 = m39310;
                        sArr8 = sArr5;
                        sArr7 = sArr4;
                        c146764 = c146766;
                        i17 = m69813 ^ 1015895040;
                        i18 = i10;
                        c146765 = c146764;
                    } else {
                        int m256611 = (C0630.m2566("᩸ᩴ") + i15) * 61;
                        c16709 = c167093;
                        abstractC15440 = m39310;
                        sArr8 = sArr5;
                        sArr7 = sArr4;
                        c146764 = c146763;
                        i17 = m256611 ^ 1766119580;
                        i16 = ((m256611 ^ i14) * (-29529)) ^ (-1341794107);
                        i18 = i10;
                        c146765 = c146764;
                    }
                case -1145094777:
                case 82801084:
                    c14676 = c146765;
                    sArr = sArr7;
                    s = s2;
                    i = i18;
                    sArr2 = sArr8;
                    sArr6 = f2211;
                    c = 'B';
                    if (C3683.f11629 < 0) {
                        m25662 = (C2105.m6981("ܿۘ") ^ i15) * (-39);
                        i4 = ((m25662 ^ i14) * (-28431)) ^ 1570901396;
                        i5 = 1519445615;
                        i7 = m25662 ^ i5;
                        s2 = s;
                        i16 = i4;
                        i18 = i;
                        sArr8 = sArr2;
                        c146765 = c14676;
                        i17 = i7;
                        sArr7 = sArr;
                        viewOnClickListenerC0544 = this;
                    }
                    m25662 = (C0630.m2566("ܿᩳ") ^ i15) * (-11);
                    i4 = ((m25662 ^ i14) * (-23657)) ^ 784558331;
                    i5 = 578504964;
                    i7 = m25662 ^ i5;
                    s2 = s;
                    i16 = i4;
                    i18 = i;
                    sArr8 = sArr2;
                    c146765 = c14676;
                    i17 = i7;
                    sArr7 = sArr;
                    viewOnClickListenerC0544 = this;
                case -1122759887:
                case 2118601509:
                    C2272.m7503();
                    C0422.m1963();
                    c14676 = c146765;
                    sArr = sArr7;
                    i = i18;
                    sArr2 = sArr8;
                    m25663 = (C0630.m2566("۬᩸") ^ i15) * (-13);
                    i16 = ((m25663 ^ i14) * 27829) ^ 321479278;
                    i6 = 1157066707;
                    i7 = m25663 ^ i6;
                    i18 = i;
                    sArr8 = sArr2;
                    c146765 = c14676;
                    i17 = i7;
                    sArr7 = sArr;
                    viewOnClickListenerC0544 = this;
                case -1101065180:
                case 1138944283:
                    i25 = i22 ^ i23;
                    sArr9 = f2211;
                    i18 = 73;
                    if (C3245.f10203 <= 0) {
                        sArr = sArr7;
                        int m25666222 = C0630.m2566("ۤ֨") ^ i14;
                        i17 = m25666222 ^ (-926441637);
                        i16 = ((m25666222 ^ i15) * 18343) ^ 1743965535;
                        sArr7 = sArr;
                        viewOnClickListenerC0544 = this;
                    } else {
                        m2566 = C0630.m2566("ۡ᩶") ^ i14;
                        i2 = ((m2566 ^ i15) * 32077) ^ (-680960757);
                        i3 = -279507556;
                        i17 = m2566 ^ i3;
                        i16 = i2;
                    }
                case -1065415763:
                case 1572071186:
                    C1294.m4380(c19258, i20 ^ i21, onClickListener);
                    sArr8 = f2211;
                    if (C3019.m9255() <= 0) {
                        sArr = sArr7;
                        int m256662222 = C0630.m2566("ۤ֨") ^ i14;
                        i17 = m256662222 ^ (-926441637);
                        i16 = ((m256662222 ^ i15) * 18343) ^ 1743965535;
                        sArr7 = sArr;
                        viewOnClickListenerC0544 = this;
                    } else {
                        m2566 = C0630.m2566("᩹᩷") ^ i14;
                        i2 = ((m2566 ^ i15) * 721) ^ (-1353204906);
                        i3 = 1941252917;
                        i17 = m2566 ^ i3;
                        i16 = i2;
                    }
                case -1046221045:
                case 2082617737:
                    c14676 = c146765;
                    sArr = sArr7;
                    i = i18;
                    sArr2 = sArr8;
                    s = s2;
                    if ((s * 6666) - (i12 + 11108889) <= 0) {
                        m25662 = (i15 - C2105.m6981("ܳ֨")) * (-99);
                        i4 = ((m25662 ^ i14) * (-12927)) ^ (-1531456761);
                        i5 = -2011359374;
                    } else {
                        m25662 = C0630.m2566("֡᩷") ^ i14;
                        i4 = ((m25662 ^ i15) * (-8179)) ^ (-1360763532);
                        i5 = -1844914803;
                    }
                    i7 = m25662 ^ i5;
                    s2 = s;
                    i16 = i4;
                    i18 = i;
                    sArr8 = sArr2;
                    c146765 = c14676;
                    i17 = i7;
                    sArr7 = sArr;
                    viewOnClickListenerC0544 = this;
                case -993949732:
                case -541785160:
                    c14676 = c146765;
                    sArr = sArr7;
                    i = i18;
                    sArr2 = sArr8;
                    i19 = 263;
                    m25663 = C2105.m6981("ۛۤ") ^ i15;
                    i16 = ((m25663 ^ i14) * 21315) ^ (-1554813720);
                    i6 = -1731185785;
                    i7 = m25663 ^ i6;
                    i18 = i;
                    sArr8 = sArr2;
                    c146765 = c14676;
                    i17 = i7;
                    sArr7 = sArr;
                    viewOnClickListenerC0544 = this;
                case -934873394:
                case -839537211:
                    C2126.m7039(button, new View.OnClickListener() { // from class: l.ۡܽ᩷
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            ViewOnClickListenerC0544.m2287(ViewOnClickListenerC0544.this);
                        }
                    });
                    m2566 = C2105.m6981("ᩳܳ") ^ i15;
                    i2 = ((m2566 ^ i14) * (-5631)) ^ 1757605627;
                    i3 = 1529459588;
                    i17 = m2566 ^ i3;
                    i16 = i2;
                case -911694860:
                case -811311587:
                    C1420.m4913();
                    if (C1005.f3721) {
                        c14676 = c146765;
                        sArr = sArr7;
                        i = i18;
                        sArr2 = sArr8;
                        m25663 = (C0630.m2566("۬᩸") ^ i15) * (-13);
                        i16 = ((m25663 ^ i14) * 27829) ^ 321479278;
                        i6 = 1157066707;
                        i7 = m25663 ^ i6;
                        i18 = i;
                        sArr8 = sArr2;
                        c146765 = c14676;
                        i17 = i7;
                        sArr7 = sArr;
                        viewOnClickListenerC0544 = this;
                    } else {
                        c146763 = c146765;
                        sArr4 = sArr7;
                        i10 = i18;
                        sArr5 = sArr8;
                        m39310 = abstractC15440;
                        int m698132 = C2105.m6981("ۚ֨") ^ i14;
                        C14676 c1467662 = c146763;
                        i16 = ((m698132 ^ i15) * 24267) ^ (-1258051849);
                        abstractC15440 = m39310;
                        sArr8 = sArr5;
                        sArr7 = sArr4;
                        c146764 = c1467662;
                        i17 = m698132 ^ 1015895040;
                        i18 = i10;
                        c146765 = c146764;
                    }
                case -717192306:
                case 659049042:
                    c14676 = c146765;
                    sArr = sArr7;
                    i = i18;
                    sArr2 = sArr8;
                    i19 = 28483;
                    m25663 = C2105.m6981("ۛۤ") ^ i15;
                    i16 = ((m25663 ^ i14) * 21315) ^ (-1554813720);
                    i6 = -1731185785;
                    i7 = m25663 ^ i6;
                    i18 = i;
                    sArr8 = sArr2;
                    c146765 = c14676;
                    i17 = i7;
                    sArr7 = sArr;
                    viewOnClickListenerC0544 = this;
                case -461614484:
                case 1854478295:
                    c14676 = c146765;
                    sArr = sArr7;
                    i = i18;
                    sArr2 = sArr8;
                    s2 = sArr6[c];
                    i12 = s2 * s2;
                    if (C0382.f1805) {
                        m25663 = (C0630.m2566("ۨۗ") + i14) * (-111);
                        i16 = ((m25663 ^ i15) * 22575) ^ (-1551164965);
                        i6 = -1617573123;
                        i7 = m25663 ^ i6;
                        i18 = i;
                        sArr8 = sArr2;
                        c146765 = c14676;
                        i17 = i7;
                        sArr7 = sArr;
                        viewOnClickListenerC0544 = this;
                    }
                    m25663 = (C0630.m2566("۬᩸") ^ i15) * (-13);
                    i16 = ((m25663 ^ i14) * 27829) ^ 321479278;
                    i6 = 1157066707;
                    i7 = m25663 ^ i6;
                    i18 = i;
                    sArr8 = sArr2;
                    c146765 = c14676;
                    i17 = i7;
                    sArr7 = sArr;
                    viewOnClickListenerC0544 = this;
                case -360489156:
                case -199860684:
                    c146762 = c146765;
                    sArr = sArr7;
                    i8 = i18;
                    z = false;
                    int m69814 = C2105.m6981("ۡۛ") ^ i15;
                    sArr3 = sArr8;
                    i9 = ((m69814 ^ i14) * (-16153)) ^ 2097190848;
                    i17 = m69814 ^ (-1303517435);
                    i18 = i8;
                    c146765 = c146762;
                    i16 = i9;
                    sArr8 = sArr3;
                    sArr7 = sArr;
                case -252208038:
                case -118449532:
                    C1047.m3599();
                    break;
                case 118087331:
                case 1569899100:
                    if (viewOnClickListenerC0544.f2213.m39301()) {
                        m2566 = C0630.m2566("ܶܿ") ^ i14;
                        i2 = ((m2566 ^ i15) * (-10607)) ^ (-1487999788);
                        i3 = -1634760032;
                    } else {
                        m2566 = C2105.m6981("ۖ֫") ^ i14;
                        i2 = ((m2566 ^ i15) * (-941)) ^ (-2103772440);
                        i3 = -325525080;
                    }
                    i17 = m2566 ^ i3;
                    i16 = i2;
                case 1136774053:
                case 1336507352:
                    C4159.m12564(C4616.m13545(dialogInterfaceC0206), new View.OnClickListener(viewOnClickListenerC0544) { // from class: l.ܺܽ᩷

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC0544 f49533;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view5) {
                            ViewOnClickListenerC0544 viewOnClickListenerC05442 = null;
                            int i32 = 1562718385;
                            int i33 = C3683.f11629;
                            int i34 = C11340.f33930;
                            int m256612 = (C0630.m2566("᩵۠") ^ i33) * 33;
                            int i35 = ((m256612 ^ i34) * 22067) ^ 2090023323;
                            int i36 = -640989152;
                            while (true) {
                                i32 = ((((i32 ^ i34) * (-13317)) >> 31) & i35) ^ (m256612 ^ i36);
                                switch (i32) {
                                    case -1984267564:
                                    case -274571682:
                                        if (C3245.f10203 <= 0) {
                                            m256612 = (C0630.m2566("ܿ۠") ^ i33) * 67;
                                            i35 = ((m256612 ^ i34) * 23061) ^ 1993835315;
                                            i36 = -1872063409;
                                        } else {
                                            m256612 = C0630.m2566("ۡᩳ") ^ i33;
                                            i35 = ((m256612 ^ i34) * (-8721)) ^ 907429173;
                                            i36 = -904137735;
                                        }
                                    case -1728896467:
                                    case 1483517704:
                                        ViewOnClickListenerC0544.m2285(viewOnClickListenerC05442, dialogInterfaceC0206, view5);
                                        break;
                                    case -1686495922:
                                    case -1035206865:
                                        C3911.m11924();
                                        C1047.m3599();
                                        m256612 = (C2105.m6981("ᩳᩳ") + i33) * 73;
                                        i35 = ((m256612 ^ i34) * 29517) ^ (-1018340966);
                                        i36 = -1449742472;
                                    case -1624072028:
                                    case -696757826:
                                        if (C2126.m7040()) {
                                            m256612 = (C0630.m2566("ܿ۠") ^ i33) * 67;
                                            i35 = ((m256612 ^ i34) * 23061) ^ 1993835315;
                                            i36 = -1872063409;
                                        } else {
                                            m256612 = C0630.m2566("ܳۧ") ^ i33;
                                            i35 = ((m256612 ^ i34) * (-9919)) ^ 40234814;
                                            i36 = 431073016;
                                        }
                                    case -1141204481:
                                    case -412806222:
                                        if (C1711.f5919) {
                                            m256612 = C2105.m6981("ܽᩴ") ^ i34;
                                            i35 = ((m256612 ^ i33) * (-28879)) ^ (-1896721081);
                                            i36 = 375464644;
                                        } else {
                                            m256612 = (C2105.m6981("ۖۛ") ^ i33) * (-93);
                                            i35 = ((m256612 ^ i34) * (-7159)) ^ (-2023221673);
                                            i36 = 1006589593;
                                        }
                                    case -867966078:
                                    case 1670060713:
                                        viewOnClickListenerC05442 = this.f49533;
                                        if (C1047.f3863 >= 0) {
                                            m256612 = (C0630.m2566("ۙۚ") + i34) * (-29);
                                            i35 = ((m256612 ^ i33) * (-20917)) ^ 1467505758;
                                            i36 = 641465795;
                                        } else {
                                            m256612 = C2105.m6981("ۤ᩺") ^ i34;
                                            i35 = ((m256612 ^ i33) * 13609) ^ (-772778502);
                                            i36 = -1941538782;
                                        }
                                    case -835915166:
                                    case 305203853:
                                        C3746.m11369();
                                        C2958.m9034();
                                        break;
                                    case -775314690:
                                    case 1050467750:
                                        if (C4159.f13567) {
                                            m256612 = (C2105.m6981("۬᩷") + i33) * (-109);
                                            i35 = ((m256612 ^ i34) * (-7423)) ^ 837918335;
                                            i36 = 763899882;
                                        } else {
                                            m256612 = (C0630.m2566("ܿ۠") ^ i33) * 67;
                                            i35 = ((m256612 ^ i34) * 23061) ^ 1993835315;
                                            i36 = -1872063409;
                                        }
                                    case -657289248:
                                    case 1865783819:
                                        C1420.m4913();
                                        if (C0714.f2697 < 0) {
                                            m256612 = (C2105.m6981("ᩳᩳ") + i33) * 73;
                                            i35 = ((m256612 ^ i34) * 29517) ^ (-1018340966);
                                            i36 = -1449742472;
                                        } else {
                                            m256612 = C2105.m6981("ۡۘ") ^ i34;
                                            i35 = ((m256612 ^ i33) * (-14419)) ^ (-550455499);
                                            i36 = -1225999566;
                                        }
                                    case -540537677:
                                    case 1559175046:
                                        if (C0382.f1805) {
                                            m256612 = C2105.m6981("ۢۜ") ^ i34;
                                            i35 = ((m256612 ^ i33) * (-1107)) ^ 201703829;
                                            i36 = 582551603;
                                        } else {
                                            m256612 = (C2105.m6981("ᩳᩳ") + i33) * 73;
                                            i35 = ((m256612 ^ i34) * 29517) ^ (-1018340966);
                                            i36 = -1449742472;
                                        }
                                    case -315195135:
                                    case 530334010:
                                        if (C7811.f24123 >= 0) {
                                            m256612 = (C0630.m2566("ܿ۠") ^ i33) * 67;
                                            i35 = ((m256612 ^ i34) * 23061) ^ 1993835315;
                                            i36 = -1872063409;
                                        } else {
                                            m256612 = (i34 - C2105.m6981("ۜ֨")) * (-97);
                                            i35 = ((m256612 ^ i33) * (-12385)) ^ (-114213719);
                                            i36 = 367240132;
                                        }
                                    case -158076107:
                                    case 1216088943:
                                        if (C2272.f7362) {
                                            m256612 = C2105.m6981("ۡۘ") ^ i34;
                                            i35 = ((m256612 ^ i33) * (-14419)) ^ (-550455499);
                                            i36 = -1225999566;
                                        } else {
                                            m256612 = C2105.m6981("۟ᩳ") ^ i33;
                                            i35 = ((m256612 ^ i34) * (-21567)) ^ 605909163;
                                            i36 = -1418059625;
                                        }
                                    case 286553313:
                                    case 1313463762:
                                        if (C1294.f4556 >= 0) {
                                            m256612 = (C2105.m6981("ᩳᩳ") + i33) * 73;
                                            i35 = ((m256612 ^ i34) * 29517) ^ (-1018340966);
                                            i36 = -1449742472;
                                        } else {
                                            m256612 = (C2105.m6981("ܽۘ") + i34) * (-37);
                                            i35 = ((m256612 ^ i33) * 20529) ^ 1930964538;
                                            i36 = -889960343;
                                        }
                                    case 1057773282:
                                    case 1657159705:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            m256612 = (C2105.m6981("ᩳᩳ") + i33) * 73;
                                            i35 = ((m256612 ^ i34) * 29517) ^ (-1018340966);
                                            i36 = -1449742472;
                                        } else {
                                            m256612 = C2105.m6981("ܽᩴ") ^ i34;
                                            i35 = ((m256612 ^ i33) * (-28879)) ^ (-1896721081);
                                            i36 = 375464644;
                                        }
                                    case 1436549824:
                                    case 1610419726:
                                        if (C0798.f2919) {
                                            m256612 = C2105.m6981("ۡۘ") ^ i34;
                                            i35 = ((m256612 ^ i33) * (-14419)) ^ (-550455499);
                                            i36 = -1225999566;
                                        } else {
                                            m256612 = C2105.m6981("ܳۤ") ^ i34;
                                            i35 = ((m256612 ^ i33) * (-2513)) ^ 1629759757;
                                            i36 = 1875925202;
                                        }
                                    default:
                                        if (C21923.f70183 == 0) {
                                            m256612 = (C2105.m6981("ᩳᩳ") + i33) * 73;
                                            i35 = ((m256612 ^ i34) * 29517) ^ (-1018340966);
                                            i36 = -1449742472;
                                        } else {
                                            m256612 = (C0630.m2566("ܿ۠") ^ i33) * 67;
                                            i35 = ((m256612 ^ i34) * 23061) ^ 1993835315;
                                            i36 = -1872063409;
                                        }
                                }
                                return;
                            }
                        }

                        {
                            int i32 = -2146907737;
                            int i33 = AbstractC2021.f6743;
                            int i34 = C3537.f11231;
                            int m69815 = C2105.m6981("᩹ۨ") ^ i34;
                            int i35 = ((m69815 ^ i33) * 6347) ^ 1189303141;
                            int i36 = 1176472503;
                            while (true) {
                                i32 = ((((i32 ^ i33) * 19387) >> 31) & i35) ^ (m69815 ^ i36);
                                switch (i32) {
                                    case -1931867803:
                                    case 1539103707:
                                        if (C22628.f73083 <= 0) {
                                            m69815 = (C2105.m6981("ܺ᩺") + i34) * 73;
                                            i35 = ((m69815 ^ i33) * 23657) ^ (-1677169050);
                                            i36 = 231042930;
                                        } else {
                                            m69815 = C0630.m2566("ۨ᩻") ^ i34;
                                            i35 = ((m69815 ^ i33) * 4377) ^ (-904916382);
                                            i36 = 1659812174;
                                        }
                                    case -1918469562:
                                    case 1701693210:
                                        if (C3911.m11924() <= 0) {
                                            m69815 = (i33 - C0630.m2566("᩷ۧ")) * (-121);
                                            i35 = ((m69815 ^ i34) * (-30263)) ^ (-367264222);
                                            i36 = -644498205;
                                        } else {
                                            m69815 = (C0630.m2566("֨᩸") ^ i33) * 97;
                                            i35 = ((m69815 ^ i34) * 3089) ^ (-49458871);
                                            i36 = -1688564614;
                                        }
                                    case -1750745998:
                                    case 2060337301:
                                        this.f49533 = viewOnClickListenerC0544;
                                        if (C2105.f7037 != 0) {
                                            m69815 = (C0630.m2566("ۛܳ") + i33) * 61;
                                            i35 = ((m69815 ^ i34) * (-30823)) ^ (-1732711492);
                                            i36 = 981534328;
                                        } else {
                                            m69815 = (i34 - C0630.m2566("ᩴܿ")) * (-97);
                                            i35 = ((m69815 ^ i33) * (-6455)) ^ (-1369489362);
                                            i36 = 129873191;
                                        }
                                    case -1724681771:
                                    case 1193770303:
                                        if (C0798.m2998() != 0) {
                                            m69815 = (i33 - C0630.m2566("ۡۖ")) * 3;
                                            i35 = ((m69815 ^ i34) * (-32693)) ^ 1483020363;
                                            i36 = 474749039;
                                        } else {
                                            m69815 = C2105.m6981("᩻ܿ") ^ i33;
                                            i35 = ((m69815 ^ i34) * 4295) ^ (-580725883);
                                            i36 = -629949758;
                                        }
                                    case -1671853193:
                                    case 1204667894:
                                        C2105.m6982();
                                        throw new RuntimeException();
                                    case -1419106838:
                                    case -726324328:
                                        return;
                                    case -1362021097:
                                    case 1205036154:
                                        if (RunnableC0588.f2309 >= 0) {
                                            m69815 = (i33 - C0630.m2566("ۡۖ")) * 3;
                                            i35 = ((m69815 ^ i34) * (-32693)) ^ 1483020363;
                                            i36 = 474749039;
                                        } else {
                                            m69815 = C2105.m6981("۬ᩴ") ^ i34;
                                            i35 = ((m69815 ^ i33) * (-17249)) ^ 263134756;
                                            i36 = 1776756870;
                                        }
                                    case -1286126185:
                                    case 46688831:
                                        if (C3911.f12484 >= 0) {
                                            m69815 = (i33 - C0630.m2566("ۡۖ")) * 3;
                                            i35 = ((m69815 ^ i34) * (-32693)) ^ 1483020363;
                                            i36 = 474749039;
                                        } else {
                                            m69815 = (i33 - C2105.m6981("ۤ᩻")) * (-37);
                                            i35 = ((m69815 ^ i34) * 16419) ^ (-1709328236);
                                            i36 = 1007915013;
                                        }
                                    case -1201744444:
                                    case 224971327:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            m69815 = (i33 - C0630.m2566("ۡۖ")) * 3;
                                            i35 = ((m69815 ^ i34) * (-32693)) ^ 1483020363;
                                            i36 = 474749039;
                                        } else {
                                            m69815 = (C0630.m2566("᩷ܽ") + i33) * 25;
                                            i35 = ((m69815 ^ i34) * (-9041)) ^ 1827754551;
                                            i36 = -1571947367;
                                        }
                                    case -1009876760:
                                    case -947943217:
                                        if (C2167.f7158 >= 0) {
                                            m69815 = (C0630.m2566("ۤ۬") ^ i34) * 75;
                                            i35 = ((m69815 ^ i33) * 21123) ^ 425684948;
                                            i36 = 2105720203;
                                        } else {
                                            m69815 = (i33 - C0630.m2566("᩷ۧ")) * (-121);
                                            i35 = ((m69815 ^ i34) * (-30263)) ^ (-367264222);
                                            i36 = -644498205;
                                        }
                                    case -920229778:
                                    case 531694117:
                                        if (C1711.f5919) {
                                            m69815 = (C0630.m2566("ۛܳ") + i33) * 61;
                                            i35 = ((m69815 ^ i34) * (-30823)) ^ (-1732711492);
                                            i36 = 981534328;
                                        } else {
                                            m69815 = (C2105.m6981("ܺ᩺") + i34) * 73;
                                            i35 = ((m69815 ^ i33) * 23657) ^ (-1677169050);
                                            i36 = 231042930;
                                        }
                                    case -746811642:
                                    case -587147709:
                                        C1128.m3851();
                                        if (C0798.f2919) {
                                            m69815 = (C0630.m2566("ۛܳ") + i33) * 61;
                                            i35 = ((m69815 ^ i34) * (-30823)) ^ (-1732711492);
                                            i36 = 981534328;
                                        } else {
                                            m69815 = (C0630.m2566("ۤ۬") ^ i34) * 75;
                                            i35 = ((m69815 ^ i33) * 21123) ^ 425684948;
                                            i36 = 2105720203;
                                        }
                                    case -615325077:
                                    case 2034873475:
                                        if (C22628.m50615() != 0) {
                                            m69815 = (C2105.m6981("ܺ᩺") + i34) * 73;
                                            i35 = ((m69815 ^ i33) * 23657) ^ (-1677169050);
                                            i36 = 231042930;
                                        } else {
                                            m69815 = C0630.m2566("ܶۡ") ^ i34;
                                            i35 = ((m69815 ^ i33) * (-12973)) ^ 118029547;
                                            i36 = 2137579318;
                                        }
                                    case -271216503:
                                    case 1306405129:
                                        if (C3746.f11829 <= 0) {
                                            m69815 = (C0630.m2566("ۤ۬") ^ i34) * 75;
                                            i35 = ((m69815 ^ i33) * 21123) ^ 425684948;
                                            i36 = 2105720203;
                                        } else {
                                            m69815 = (i34 - C0630.m2566("ۘܶ")) * (-107);
                                            i35 = ((m69815 ^ i33) * 10815) ^ (-2012985845);
                                            i36 = -1053754231;
                                        }
                                    case 260459711:
                                    case 1164469601:
                                        if (C1504.m5179()) {
                                            m69815 = C2105.m6981("᩵۫") ^ i33;
                                            i35 = ((m69815 ^ i34) * 21027) ^ 1889264277;
                                            i36 = -1912908034;
                                        } else {
                                            m69815 = (C2105.m6981("ܺ᩺") + i34) * 73;
                                            i35 = ((m69815 ^ i33) * 23657) ^ (-1677169050);
                                            i36 = 231042930;
                                        }
                                    default:
                                        C2126.m7040();
                                        m69815 = (C0630.m2566("ۛܳ") + i33) * 61;
                                        i35 = ((m69815 ^ i34) * (-30823)) ^ (-1732711492);
                                        i36 = 981534328;
                                }
                            }
                        }
                    });
                    break;
                case 1423171272:
                case 1735674312:
                    C1128.m3853(button, 8);
                    m2566 = C2105.m6981("ᩳܳ") ^ i15;
                    i2 = ((m2566 ^ i14) * (-5631)) ^ 1757605627;
                    i3 = 1529459588;
                    i17 = m2566 ^ i3;
                    i16 = i2;
                default:
                    C2272.m7503();
                    if (C0422.f1886 > 0) {
                        c14676 = c146765;
                        sArr = sArr7;
                        i = i18;
                        sArr2 = sArr8;
                        m25663 = (C0630.m2566("۬᩸") ^ i15) * (-13);
                        i16 = ((m25663 ^ i14) * 27829) ^ 321479278;
                        i6 = 1157066707;
                        i7 = m25663 ^ i6;
                        i18 = i;
                        sArr8 = sArr2;
                        c146765 = c14676;
                        i17 = i7;
                        sArr7 = sArr;
                        viewOnClickListenerC0544 = this;
                    } else {
                        view2 = view3;
                        int m2566822 = C0630.m2566("᩸ۜ") ^ i15;
                        view3 = view2;
                        i16 = ((m2566822 ^ i14) * 32217) ^ 86159462;
                        i17 = m2566822 ^ 1722757952;
                    }
            }
            return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        if (l.C4616.f14690 <= 0) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnClickListenerC0544(l.C5484 r24, android.view.View r25) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC0544.<init>(l.ۚܽ᩷, android.view.View):void");
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 1580690462;
        int i2 = C4117.f13076;
        int i3 = C11340.f33930;
        int m2566 = C0630.m2566("ۨ֨") ^ i2;
        int i4 = ((m2566 ^ i3) * 7267) ^ (-162130970);
        int i5 = 1143006973;
        while (true) {
            i = ((((i ^ i3) * 32453) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2118219242:
                case 872411674:
                    if (C5695.f17556 >= 0) {
                        m2566 = (i3 - C2105.m6981("۟᩵")) * (-29);
                        i4 = ((m2566 ^ i2) * 21463) ^ 822736252;
                        i5 = 516356639;
                    } else {
                        m2566 = (C2105.m6981("᩺ᩳ") ^ i3) * 3;
                        i4 = ((m2566 ^ i2) * (-1767)) ^ (-144685718);
                        i5 = -1971055411;
                    }
                case -1746392488:
                case -1309321466:
                    break;
                case -1717748403:
                case 317302682:
                    if (C3537.f11231 >= 0) {
                        m2566 = C2105.m6981("֫ۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-9603)) ^ 1851490711;
                        i5 = -961555717;
                    } else {
                        m2566 = (i2 - C0630.m2566("᩹ۤ")) * 57;
                        i4 = ((m2566 ^ i3) * 23585) ^ 1775612272;
                        i5 = 1378012355;
                    }
                case -1654650611:
                case -953711533:
                    C1005.m3501();
                    break;
                case -1491820090:
                case 386650700:
                    this.f2213.m39293(z);
                    C13265.m32224();
                    m2566 = (C2105.m6981("ۗ֫") ^ i3) * 27;
                    i4 = ((m2566 ^ i2) * (-31107)) ^ 1173179869;
                    i5 = -144641536;
                case -937371854:
                case 1792974378:
                    C4159.m12565();
                    if (C4117.f13076 <= 0) {
                        m2566 = C2105.m6981("֫ۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-9603)) ^ 1851490711;
                        i5 = -961555717;
                    } else {
                        m2566 = C2105.m6981("۫ۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-14801)) ^ 1331829414;
                        i5 = -2029101705;
                    }
                case -865723761:
                case 647679:
                    if (C0422.f1886 <= 0) {
                        m2566 = (i3 - C2105.m6981("۟᩵")) * (-29);
                        i4 = ((m2566 ^ i2) * 21463) ^ 822736252;
                        i5 = 516356639;
                    } else {
                        m2566 = (C2105.m6981("᩻ۡ") + i3) * (-67);
                        i4 = ((m2566 ^ i2) * (-6677)) ^ (-631846980);
                        i5 = 213547840;
                    }
                case -821120948:
                case 1988304066:
                    if (C7811.f24123 >= 0) {
                        m2566 = C2105.m6981("֫ۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-9603)) ^ 1851490711;
                        i5 = -961555717;
                    } else {
                        m2566 = (C0630.m2566("᩹ۧ") + i3) * 17;
                        i4 = ((m2566 ^ i2) * 16951) ^ 2095422;
                        i5 = 604365774;
                    }
                case -731381875:
                case 615648568:
                    if (C3432.f10845 >= 0) {
                        m2566 = (i3 - C2105.m6981("۟᩵")) * (-29);
                        i4 = ((m2566 ^ i2) * 21463) ^ 822736252;
                        i5 = 516356639;
                    } else {
                        m2566 = C2105.m6981("ۚ֡") ^ i2;
                        i4 = ((m2566 ^ i3) * (-4605)) ^ 1227469016;
                        i5 = -1171860859;
                    }
                case -376286067:
                case 1785702002:
                    RunnableC0588.m2441();
                    if (C3537.f11231 >= 0) {
                        m2566 = C2105.m6981("۫ۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-14801)) ^ 1331829414;
                        i5 = -2029101705;
                    } else {
                        m2566 = C0630.m2566("ۗ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-18385)) ^ (-1336505223);
                        i5 = -1628858527;
                    }
                case -319843803:
                case 782703657:
                    if (this.f2213.m39301() != z) {
                        m2566 = (C0630.m2566("ۧۧ") ^ i2) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i4 = ((m2566 ^ i3) * (-14979)) ^ (-626613773);
                        i5 = -34564899;
                    } else {
                        m2566 = (C2105.m6981("ۗ֫") ^ i3) * 27;
                        i4 = ((m2566 ^ i2) * (-31107)) ^ 1173179869;
                        i5 = -144641536;
                    }
                case -270523664:
                case 297970264:
                    if (C3663.f11553) {
                        m2566 = C2105.m6981("֫ۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-9603)) ^ 1851490711;
                        i5 = -961555717;
                    } else {
                        m2566 = (i2 - C2105.m6981("ۧ᩶")) * 73;
                        i4 = ((m2566 ^ i3) * 17765) ^ 1909963899;
                        i5 = -569979071;
                    }
                case -253471399:
                case 1956998458:
                    if (C1294.f4556 >= 0) {
                        m2566 = C0630.m2566("ۗ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-18385)) ^ (-1336505223);
                        i5 = -1628858527;
                    } else {
                        m2566 = C2105.m6981("۟۟") ^ i2;
                        i4 = ((m2566 ^ i3) * 32599) ^ (-225217469);
                        i5 = -1714949877;
                    }
                case -151507774:
                case 902964160:
                    if (C0964.m3413()) {
                        m2566 = (C2105.m6981("᩹ۛ") + i3) * 51;
                        i4 = ((m2566 ^ i2) * (-9875)) ^ 1564997004;
                        i5 = -1855105961;
                    } else {
                        m2566 = (i3 - C2105.m6981("۟᩵")) * (-29);
                        i4 = ((m2566 ^ i2) * 21463) ^ 822736252;
                        i5 = 516356639;
                    }
                case 252714129:
                case 856059044:
                    if (C4117.m12364() != 0) {
                        m2566 = C2105.m6981("۫ۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-14801)) ^ 1331829414;
                        i5 = -2029101705;
                    } else {
                        m2566 = C0630.m2566("ۚۙ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-12637)) ^ 312269508;
                        i5 = -974629285;
                    }
                case 310723415:
                case 1239810207:
                    C1005.m3501();
                    C22628.m50615();
                    m2566 = C2105.m6981("ۙۛ") ^ i2;
                    i4 = ((m2566 ^ i3) * (-15075)) ^ 827486891;
                    i5 = -878098296;
                case 1469070742:
                case 1631471289:
                    if (C4075.f12947 >= 0) {
                        m2566 = C2105.m6981("ۙۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15075)) ^ 827486891;
                        i5 = -878098296;
                    } else {
                        m2566 = (C2105.m6981("۬ܽ") + i2) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m2566 ^ i3) * 18391) ^ (-927010880);
                        i5 = -954281922;
                    }
                default:
                    RunnableC3474.m10630();
                    if (ServiceConnectionC3453.m10564() > 0) {
                        m2566 = C2105.m6981("ۙۛ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-15075)) ^ 827486891;
                        i5 = -878098296;
                    } else {
                        m2566 = C2105.m6981("֫ۛ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-9603)) ^ 1851490711;
                        i5 = -961555717;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v44, types: [l.᩵ܽ᩷] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2283(ViewOnClickListenerC0544 viewOnClickListenerC0544, DialogInterfaceC0206 dialogInterfaceC0206) {
        String str;
        int i;
        int m6981;
        int i2;
        int i3;
        int i4;
        int m69812;
        int i5;
        int i6;
        Runnable runnable;
        Runnable runnable2;
        final ViewOnClickListenerC0544 viewOnClickListenerC05442 = viewOnClickListenerC0544;
        C5484 c5484 = null;
        String str2 = null;
        int i7 = 0;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        short s2 = 0;
        int i11 = 0;
        short[] sArr2 = null;
        int i12 = 597142303;
        int i13 = C0050.f910;
        int i14 = C0714.f2697;
        int m69813 = C2105.m6981("۟ۛ") ^ i14;
        int i15 = ((m69813 ^ i13) * (-22953)) ^ 660226736;
        int i16 = m69813 ^ (-593976214);
        String str3 = null;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * 12375) >> 31));
            switch (i12) {
                case -2076290155:
                case -1751777681:
                    break;
                case -1952608320:
                case 1613565617:
                    str = str2;
                    i = i7;
                    sArr2 = f2211;
                    if (C4075.m12263() > 0) {
                        m6981 = C0630.m2566("᩻᩷") ^ i14;
                        i2 = ((m6981 ^ i13) * (-32417)) ^ 236869848;
                        i3 = 1109204168;
                        int i17 = m6981 ^ i3;
                        i7 = i;
                        i16 = i17;
                        i15 = i2;
                        str2 = str;
                    }
                    m6981 = C0630.m2566("ܽۧ") ^ i14;
                    i2 = ((m6981 ^ i13) * 15541) ^ 83016578;
                    i3 = 1666693092;
                    int i172 = m6981 ^ i3;
                    i7 = i;
                    i16 = i172;
                    i15 = i2;
                    str2 = str;
                case -1631438310:
                case 1057359559:
                    str = str2;
                    i = i7;
                    i11 = 30056;
                    m6981 = C0630.m2566("ܶۜ") ^ i14;
                    i2 = ((m6981 ^ i13) * (-31135)) ^ 1431404695;
                    i3 = 695578369;
                    int i1722 = m6981 ^ i3;
                    i7 = i;
                    i16 = i1722;
                    i15 = i2;
                    str2 = str;
                case -1518472451:
                case -317175117:
                    C1128.m3851();
                    if (C1047.f3863 >= 0) {
                        int m2566 = (C0630.m2566("֫᩷") ^ i14) * (-79);
                        i16 = m2566 ^ (-655351045);
                        i15 = ((m2566 ^ i13) * 23803) ^ (-1981058185);
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    } else {
                        str = str2;
                        i = i7;
                        m6981 = C0630.m2566("۬᩵") ^ i13;
                        i2 = ((m6981 ^ i14) * 20931) ^ (-1351906742);
                        i3 = -110565385;
                        int i17222 = m6981 ^ i3;
                        i7 = i;
                        i16 = i17222;
                        i15 = i2;
                        str2 = str;
                    }
                case -1489349766:
                case 1774559453:
                    str = str2;
                    i = i7;
                    C3663.m11167(dialogInterfaceC0206);
                    str3 = C0483.m2134(viewOnClickListenerC05442.f2213);
                    if (C7811.f24123 >= 0) {
                        i7 = i;
                        str2 = str;
                        int m25662 = (C0630.m2566("֫᩷") ^ i14) * (-79);
                        i16 = m25662 ^ (-655351045);
                        i15 = ((m25662 ^ i13) * 23803) ^ (-1981058185);
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    } else {
                        m6981 = C2105.m6981("֫ܿ") ^ i13;
                        i2 = ((m6981 ^ i14) * (-1203)) ^ (-847317092);
                        i3 = -1263985500;
                        int i172222 = m6981 ^ i3;
                        i7 = i;
                        i16 = i172222;
                        i15 = i2;
                        str2 = str;
                    }
                case -1445004093:
                case -844176870:
                    if (C1420.f5096 <= 0) {
                        str = str2;
                        i = i7;
                        m6981 = C2105.m6981("֨ۢ") ^ i13;
                        i2 = ((m6981 ^ i14) * (-8479)) ^ (-426368710);
                        i3 = -212884642;
                        int i1722222 = m6981 ^ i3;
                        i7 = i;
                        i16 = i1722222;
                        i15 = i2;
                        str2 = str;
                    }
                    str = str2;
                    i = i7;
                    m6981 = (C0630.m2566("ۗۚ") + i14) * (-21);
                    i2 = ((m6981 ^ i13) * (-1505)) ^ 1004415817;
                    i3 = -1688568980;
                    int i17222222 = m6981 ^ i3;
                    i7 = i;
                    i16 = i17222222;
                    i15 = i2;
                    str2 = str;
                case -1263392477:
                case -187400289:
                    str = str2;
                    i = i7;
                    C5484.m15584(c5484, (RunnableC19596) new Runnable() { // from class: l.᩵ܽ᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewOnClickListenerC0544 viewOnClickListenerC05443 = null;
                            C5484 c54842 = null;
                            List list = null;
                            int i18 = -1474982851;
                            int i19 = C4263.f13799;
                            int i20 = C3019.f9544;
                            int m69814 = (C2105.m6981("᩻᩹") ^ i20) * (-45);
                            int i21 = ((m69814 ^ i19) * (-17051)) ^ (-253481043);
                            int i22 = -783388049;
                            while (true) {
                                i18 = ((((i18 ^ i19) * 20767) >> 31) & i21) ^ (m69814 ^ i22);
                                switch (i18) {
                                    case -2098439012:
                                    case 1698458885:
                                        C7106.m19120();
                                        m69814 = C2105.m6981("ۘۙ") ^ i19;
                                        i21 = ((m69814 ^ i20) * 20221) ^ (-1217844973);
                                        i22 = -1674813537;
                                    case -2012435648:
                                    case -407021337:
                                        c54842.f17027 = list;
                                        c54842.f17026 = C13265.m32218();
                                        break;
                                    case -1761707957:
                                    case -314012076:
                                        if (C0422.f1886 <= 0) {
                                            m69814 = (i20 - C2105.m6981("ᩴ᩵")) * (-75);
                                            i21 = ((m69814 ^ i19) * (-1125)) ^ (-228040012);
                                            i22 = 135942372;
                                        } else {
                                            m69814 = C2105.m6981("ܳᩴ") ^ i19;
                                            i21 = ((m69814 ^ i20) * (-10433)) ^ (-797671021);
                                            i22 = -1836180195;
                                        }
                                    case -1654916357:
                                    case 1566297532:
                                        c54842 = viewOnClickListenerC05443.f2214;
                                        if (C4263.f13799 <= 0) {
                                            m69814 = C0630.m2566("ܽ۫") ^ i20;
                                            i21 = ((m69814 ^ i19) * (-20479)) ^ 1414419983;
                                            i22 = 1867330082;
                                        } else {
                                            m69814 = C2105.m6981("ᩴۢ") ^ i20;
                                            i21 = ((m69814 ^ i19) * 27415) ^ (-1935582498);
                                            i22 = 1179616807;
                                        }
                                    case -1602396177:
                                    case 1386413647:
                                        if (C2126.m7040()) {
                                            m69814 = (i20 - C2105.m6981("ᩴ᩵")) * (-75);
                                            i21 = ((m69814 ^ i19) * (-1125)) ^ (-228040012);
                                            i22 = 135942372;
                                        } else {
                                            m69814 = (i20 - C2105.m6981("ۡۙ")) * 45;
                                            i21 = ((m69814 ^ i19) * (-235)) ^ (-1542721829);
                                            i22 = 2054349926;
                                        }
                                    case -1546783150:
                                    case -753830361:
                                        if (C0483.f2088 >= 0) {
                                            m69814 = C0630.m2566("ᩳ᩵") ^ i19;
                                            i21 = ((m69814 ^ i20) * (-5129)) ^ 1427863987;
                                            i22 = -1495656834;
                                        } else {
                                            m69814 = (i20 - C2105.m6981("۬᩶")) * (-95);
                                            i21 = ((m69814 ^ i19) * 30201) ^ 2002124401;
                                            i22 = -1955199480;
                                        }
                                    case -1496134252:
                                    case 1688399808:
                                        if (C1504.f5354) {
                                            m69814 = (i20 - C2105.m6981("ᩴ᩵")) * (-75);
                                            i21 = ((m69814 ^ i19) * (-1125)) ^ (-228040012);
                                            i22 = 135942372;
                                        } else {
                                            m69814 = (C2105.m6981("᩹֫") + i20) * 27;
                                            i21 = ((m69814 ^ i19) * (-14697)) ^ 1685034165;
                                            i22 = -1925494771;
                                        }
                                    case -1469010506:
                                    case -1272576048:
                                        C0964.m3413();
                                        C1005.m3501();
                                        break;
                                    case -1410517703:
                                    case 655885117:
                                        list = C13265.m32213();
                                        if (RunnableC1108.f4040) {
                                            m69814 = (C2105.m6981("᩶ܺ") ^ i19) * (-19);
                                            i21 = ((m69814 ^ i20) * (-11587)) ^ (-1412218565);
                                            i22 = -1795344772;
                                        } else {
                                            m69814 = (i20 - C2105.m6981("ᩴ᩵")) * (-75);
                                            i21 = ((m69814 ^ i19) * (-1125)) ^ (-228040012);
                                            i22 = 135942372;
                                        }
                                    case -1378142595:
                                    case 1246577895:
                                        if (C3019.m9255() > 0) {
                                            m69814 = C2105.m6981("ۘۙ") ^ i19;
                                            i21 = ((m69814 ^ i20) * 20221) ^ (-1217844973);
                                            i22 = -1674813537;
                                        } else {
                                            m69814 = C0630.m2566("ܽ۫") ^ i20;
                                            i21 = ((m69814 ^ i19) * (-20479)) ^ 1414419983;
                                            i22 = 1867330082;
                                        }
                                    case -1308937009:
                                    case -618082532:
                                        if (RunnableC3474.m10630()) {
                                            m69814 = C0630.m2566("ۙ۫") ^ i19;
                                            i21 = ((m69814 ^ i20) * 1433) ^ (-919273094);
                                            i22 = 1727925333;
                                        } else {
                                            m69814 = (i20 - C2105.m6981("ᩴ᩵")) * (-75);
                                            i21 = ((m69814 ^ i19) * (-1125)) ^ (-228040012);
                                            i22 = 135942372;
                                        }
                                    case -1085511010:
                                    case 1898475605:
                                        if (C4616.f14690 <= 0) {
                                            m69814 = C0630.m2566("ᩳ᩵") ^ i19;
                                            i21 = ((m69814 ^ i20) * (-5129)) ^ 1427863987;
                                            i22 = -1495656834;
                                        } else {
                                            m69814 = C2105.m6981("۟ۡ") ^ i19;
                                            i21 = ((m69814 ^ i20) * 2125) ^ 231432199;
                                            i22 = -1752103784;
                                        }
                                    case -349347579:
                                    case 159119522:
                                        viewOnClickListenerC05443 = ViewOnClickListenerC0544.this;
                                        if (RunnableC3474.m10630()) {
                                            m69814 = (i20 - C2105.m6981("᩶ۡ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i21 = ((m69814 ^ i19) * (-1633)) ^ (-1097916360);
                                            i22 = -1795427327;
                                        } else {
                                            m69814 = C0630.m2566("ᩳ᩵") ^ i19;
                                            i21 = ((m69814 ^ i20) * (-5129)) ^ 1427863987;
                                            i22 = -1495656834;
                                        }
                                    case 867645889:
                                    case 1511081134:
                                        if (C1047.f3863 >= 0) {
                                            m69814 = C0630.m2566("ܽ۫") ^ i20;
                                            i21 = ((m69814 ^ i19) * (-20479)) ^ 1414419983;
                                            i22 = 1867330082;
                                        } else {
                                            m69814 = C0630.m2566("ۖ۫") ^ i19;
                                            i21 = ((m69814 ^ i20) * (-6381)) ^ 391266280;
                                            i22 = -652968535;
                                        }
                                    case 1409916010:
                                    case 1790887583:
                                        if (RunnableC1937.m6387() == 0) {
                                            m69814 = (i20 - C0630.m2566("ۗۨ")) * (-65);
                                            i21 = ((m69814 ^ i19) * 11595) ^ (-374142631);
                                            i22 = 132687676;
                                        } else {
                                            m69814 = C0630.m2566("ᩳ᩵") ^ i19;
                                            i21 = ((m69814 ^ i20) * (-5129)) ^ 1427863987;
                                            i22 = -1495656834;
                                        }
                                    default:
                                        if (C2167.m7155()) {
                                            m69814 = (i20 - C0630.m2566("ۗۨ")) * (-65);
                                            i21 = ((m69814 ^ i19) * 11595) ^ (-374142631);
                                            i22 = 132687676;
                                        } else {
                                            m69814 = C0630.m2566("ܽ۫") ^ i20;
                                            i21 = ((m69814 ^ i19) * (-20479)) ^ 1414419983;
                                            i22 = 1867330082;
                                        }
                                }
                                return;
                            }
                        }
                    });
                    if (RunnableC3474.m10630()) {
                        m6981 = C0630.m2566("ۙᩴ") ^ i14;
                        i2 = ((m6981 ^ i13) * (-24481)) ^ 1724084098;
                        i3 = 97680230;
                        int i172222222 = m6981 ^ i3;
                        i7 = i;
                        i16 = i172222222;
                        i15 = i2;
                        str2 = str;
                    }
                    m6981 = C0630.m2566("ܽۧ") ^ i14;
                    i2 = ((m6981 ^ i13) * 15541) ^ 83016578;
                    i3 = 1666693092;
                    int i1722222222 = m6981 ^ i3;
                    i7 = i;
                    i16 = i1722222222;
                    i15 = i2;
                    str2 = str;
                case -1258341840:
                case -936731540:
                    C3746.m11369();
                    break;
                case -867087991:
                case 731632871:
                    i4 = i7;
                    str2 = C0714.m2816(sArr2, 17, 3, i11);
                    if (C1420.f5096 <= 0) {
                        i7 = i4;
                        int m256622 = (C0630.m2566("֫᩷") ^ i14) * (-79);
                        i16 = m256622 ^ (-655351045);
                        i15 = ((m256622 ^ i13) * 23803) ^ (-1981058185);
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    } else {
                        m69812 = C2105.m6981("ۛۧ") ^ i13;
                        i5 = ((m69812 ^ i14) * 7561) ^ 1983075996;
                        i6 = -343988379;
                        int i18 = i4;
                        i16 = m69812 ^ i6;
                        i15 = i5;
                        i7 = i18;
                    }
                case -769795645:
                case 228030194:
                    runnable2 = c5484.f17028;
                    ((RunnableC12560) runnable2).run();
                    i4 = i7;
                    m69812 = C0630.m2566("ۚۜ") ^ i13;
                    i5 = ((m69812 ^ i14) * 15853) ^ 1249193854;
                    i6 = 2023462300;
                    int i182 = i4;
                    i16 = m69812 ^ i6;
                    i15 = i5;
                    i7 = i182;
                case -661383289:
                case -51437577:
                    str = str2;
                    i = i7;
                    i11 = 42782;
                    m6981 = C0630.m2566("ܶۜ") ^ i14;
                    i2 = ((m6981 ^ i13) * (-31135)) ^ 1431404695;
                    i3 = 695578369;
                    int i17222222222 = m6981 ^ i3;
                    i7 = i;
                    i16 = i17222222222;
                    i15 = i2;
                    str2 = str;
                case -302369133:
                case 1190249393:
                    C1504.m5167(2123486623 ^ i7);
                    runnable = c5484.f17028;
                    if (runnable != null) {
                        m69812 = C0630.m2566("᩷ܰ") ^ i13;
                        i4 = i7;
                        i5 = ((m69812 ^ i14) * (-28705)) ^ (-86100384);
                        i6 = -248426464;
                        int i1822 = i4;
                        i16 = m69812 ^ i6;
                        i15 = i5;
                        i7 = i1822;
                    }
                    i4 = i7;
                    m69812 = C0630.m2566("ۚۜ") ^ i13;
                    i5 = ((m69812 ^ i14) * 15853) ^ 1249193854;
                    i6 = 2023462300;
                    int i18222 = i4;
                    i16 = m69812 ^ i6;
                    i15 = i5;
                    i7 = i18222;
                case -272489702:
                case 781598812:
                    str = str2;
                    i = i7;
                    s = sArr[c];
                    i8 = s * s;
                    i9 = 32410249;
                    if (C4075.m12263() > 0) {
                        m6981 = C0630.m2566("᩵ܽ") ^ i14;
                        i2 = ((m6981 ^ i13) * 1267) ^ 344336140;
                        i3 = 1033548438;
                        int i172222222222 = m6981 ^ i3;
                        i7 = i;
                        i16 = i172222222222;
                        i15 = i2;
                        str2 = str;
                    }
                    m6981 = (C0630.m2566("ۗۚ") + i14) * (-21);
                    i2 = ((m6981 ^ i13) * (-1505)) ^ 1004415817;
                    i3 = -1688568980;
                    int i1722222222222 = m6981 ^ i3;
                    i7 = i;
                    i16 = i1722222222222;
                    i15 = i2;
                    str2 = str;
                case -206700067:
                case 103998155:
                    str = str2;
                    i = i7;
                    int i19 = s + s2;
                    if ((i19 * i19) - i10 > 0) {
                        m6981 = C2105.m6981("ۨ᩶") ^ i13;
                        i2 = ((m6981 ^ i14) * 17011) ^ 386403960;
                        i3 = 4911666;
                    } else {
                        m6981 = (C0630.m2566("֫ܶ") ^ i14) * (-93);
                        i2 = ((m6981 ^ i13) * 22207) ^ (-1304248310);
                        i3 = -741601096;
                    }
                    int i17222222222222 = m6981 ^ i3;
                    i7 = i;
                    i16 = i17222222222222;
                    i15 = i2;
                    str2 = str;
                case 97323957:
                case 1246443682:
                    if (C0798.f2919) {
                        str = str2;
                        i = i7;
                        m6981 = (C0630.m2566("ۗۚ") + i14) * (-21);
                        i2 = ((m6981 ^ i13) * (-1505)) ^ 1004415817;
                        i3 = -1688568980;
                        int i172222222222222 = m6981 ^ i3;
                        i7 = i;
                        i16 = i172222222222222;
                        i15 = i2;
                        str2 = str;
                    } else {
                        int m2566222 = (C0630.m2566("֫᩷") ^ i14) * (-79);
                        i16 = m2566222 ^ (-655351045);
                        i15 = ((m2566222 ^ i13) * 23803) ^ (-1981058185);
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    }
                case 163924477:
                case 1389847979:
                    str = str2;
                    i = i7;
                    sArr = f2211;
                    if (C2958.f9394 < 0) {
                        int m25663 = C0630.m2566("۬ۧ") ^ i14;
                        i15 = ((m25663 ^ i13) * (-12515)) ^ 1395551295;
                        i7 = i;
                        str2 = str;
                        i16 = m25663 ^ (-1114610932);
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    }
                    i7 = i;
                    str2 = str;
                    int m25662222 = (C0630.m2566("֫᩷") ^ i14) * (-79);
                    i16 = m25662222 ^ (-655351045);
                    i15 = ((m25662222 ^ i13) * 23803) ^ (-1981058185);
                    viewOnClickListenerC05442 = viewOnClickListenerC0544;
                case 266995759:
                case 1036631801:
                    C2272.m7503();
                    str = str2;
                    i = i7;
                    m6981 = (C0630.m2566("ۗۚ") + i14) * (-21);
                    i2 = ((m6981 ^ i13) * (-1505)) ^ 1004415817;
                    i3 = -1688568980;
                    int i1722222222222222 = m6981 ^ i3;
                    i7 = i;
                    i16 = i1722222222222222;
                    i15 = i2;
                    str2 = str;
                case 400220482:
                case 2068568788:
                    i7 = C0630.m2566(str2);
                    if (C1128.f4106 <= 0) {
                        int m256622222 = (C0630.m2566("֫᩷") ^ i14) * (-79);
                        i16 = m256622222 ^ (-655351045);
                        i15 = ((m256622222 ^ i13) * 23803) ^ (-1981058185);
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    } else {
                        int m25664 = C0630.m2566("᩶ܶ") ^ i14;
                        str = str2;
                        i2 = ((m25664 ^ i13) * 1547) ^ (-864463856);
                        i16 = m25664 ^ 1672877838;
                        i15 = i2;
                        str2 = str;
                    }
                case 870294634:
                case 1881789004:
                    str = str2;
                    i = i7;
                    c = 16;
                    if (C3911.f12484 < 0) {
                        m6981 = C0630.m2566("ܳۤ") ^ i13;
                        i2 = ((m6981 ^ i14) * (-16619)) ^ 189075605;
                        i3 = -768361722;
                        int i17222222222222222 = m6981 ^ i3;
                        i7 = i;
                        i16 = i17222222222222222;
                        i15 = i2;
                        str2 = str;
                    }
                    m6981 = C0630.m2566("ܽۧ") ^ i14;
                    i2 = ((m6981 ^ i13) * 15541) ^ 83016578;
                    i3 = 1666693092;
                    int i172222222222222222 = m6981 ^ i3;
                    i7 = i;
                    i16 = i172222222222222222;
                    i15 = i2;
                    str2 = str;
                case 1208792859:
                case 2121073469:
                    str = str2;
                    i = i7;
                    C13265.m32217(str3);
                    c5484 = viewOnClickListenerC05442.f2214;
                    if (C7106.f21815 == 0) {
                        m6981 = (C0630.m2566("᩷ۗ") ^ i13) * 99;
                        i2 = ((m6981 ^ i14) * 6587) ^ (-1323190904);
                        i3 = 1083492830;
                        int i1722222222222222222 = m6981 ^ i3;
                        i7 = i;
                        i16 = i1722222222222222222;
                        i15 = i2;
                        str2 = str;
                    }
                    m6981 = C2105.m6981("֨ۢ") ^ i13;
                    i2 = ((m6981 ^ i14) * (-8479)) ^ (-426368710);
                    i3 = -212884642;
                    int i17222222222222222222 = m6981 ^ i3;
                    i7 = i;
                    i16 = i17222222222222222222;
                    i15 = i2;
                    str2 = str;
                default:
                    str = str2;
                    i = i7;
                    int i20 = i8 + i9;
                    i10 = i20 + i20;
                    s2 = 5693;
                    if (C3683.f11629 < 0) {
                        m6981 = (C0630.m2566("ܶۛ") + i13) * (-41);
                        i2 = ((m6981 ^ i14) * (-32221)) ^ (-128176367);
                        i3 = 2059888909;
                        int i172222222222222222222 = m6981 ^ i3;
                        i7 = i;
                        i16 = i172222222222222222222;
                        i15 = i2;
                        str2 = str;
                    }
                    m6981 = C0630.m2566("۬᩵") ^ i13;
                    i2 = ((m6981 ^ i14) * 20931) ^ (-1351906742);
                    i3 = -110565385;
                    int i1722222222222222222222 = m6981 ^ i3;
                    i7 = i;
                    i16 = i1722222222222222222222;
                    i15 = i2;
                    str2 = str;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2285(ViewOnClickListenerC0544 viewOnClickListenerC0544, final DialogInterfaceC0206 dialogInterfaceC0206, View view) {
        MenuItem menuItem;
        short[] sArr;
        int i;
        AbstractActivityC3346 abstractActivityC3346;
        int m2566;
        int i2;
        int i3;
        boolean z;
        AbstractC15440 abstractC15440;
        int m6981;
        int i4;
        int i5;
        short s;
        short[] sArr2;
        int i6;
        int m25662;
        int i7;
        int i8;
        int m69812;
        int i9;
        int i10;
        int i11;
        int i12;
        final ViewOnClickListenerC0544 viewOnClickListenerC05442 = viewOnClickListenerC0544;
        int i13 = -286263174;
        int i14 = C2167.f7158;
        int i15 = ServiceConnectionC3453.f10921;
        int m25663 = C0630.m2566("ۛ᩺") ^ i15;
        int i16 = ((m25663 ^ i14) * (-2207)) ^ (-1991769557);
        int i17 = m25663 ^ 379322058;
        AbstractC15440 abstractC154402 = null;
        AbstractC15440 abstractC154403 = null;
        String str = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        C21282 c21282 = null;
        boolean z2 = false;
        boolean z3 = false;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        short s2 = 0;
        int i25 = 0;
        C16709 c16709 = null;
        String str2 = null;
        int i26 = 0;
        MenuItem menuItem2 = null;
        C3060 c3060 = null;
        boolean z4 = false;
        while (true) {
            i13 = i17 ^ (i16 & (((i13 ^ i14) * 5957) >> 31));
            switch (i13) {
                case -2100885737:
                case -459764423:
                    menuItem = menuItem2;
                    str = C0483.m2128(f2211, 60, 3, i18);
                    if (C3245.f10203 <= 0) {
                        sArr = sArr4;
                        i = i25;
                        int m69813 = (C2105.m6981("֡ۢ") ^ i15) * (-97);
                        i17 = m69813 ^ (-1458471475);
                        i16 = ((m69813 ^ i14) * 4677) ^ (-1560492164);
                        sArr4 = sArr;
                        i25 = i;
                        menuItem2 = menuItem;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    } else {
                        m2566 = C0630.m2566("᩹ۢ") ^ i15;
                        i2 = ((m2566 ^ i14) * (-22493)) ^ 1936606139;
                        i3 = 1492222818;
                        i17 = m2566 ^ i3;
                        i16 = i2;
                        menuItem2 = menuItem;
                    }
                case -1899651252:
                case 885299559:
                    C4616.m13552();
                    z = z4 ? 1 : 0;
                    menuItem = menuItem2;
                    int m69814 = (C2105.m6981("֨ۢ") ^ i14) * 49;
                    i16 = ((m69814 ^ i15) * 26503) ^ (-88885646);
                    i10 = m69814 ^ (-196631119);
                    menuItem2 = menuItem;
                    z4 = z;
                    i17 = i10;
                    viewOnClickListenerC05442 = viewOnClickListenerC0544;
                case -1842501307:
                case 260707092:
                    menuItem = menuItem2;
                    str2 = C0483.m2134(c16709);
                    abstractC154402 = C13265.m32223(str2);
                    sArr5 = f2211;
                    i19 = 55;
                    i26 = 5;
                    if (C22628.f73083 <= 0) {
                        menuItem2 = menuItem;
                        int m25664 = (C0630.m2566("᩹֡") ^ i14) * (-107);
                        i17 = m25664 ^ 1534571988;
                        i16 = ((m25664 ^ i15) * 8977) ^ 1217457237;
                    } else {
                        m2566 = (C2105.m6981("ۨۨ") ^ i15) * (-21);
                        i2 = ((m2566 ^ i14) * 4149) ^ (-1958988885);
                        i3 = 625684938;
                        i17 = m2566 ^ i3;
                        i16 = i2;
                        menuItem2 = menuItem;
                    }
                case -1738242032:
                case 1700566404:
                    z = z4 ? 1 : 0;
                    menuItem = menuItem2;
                    sArr2 = sArr4;
                    i6 = i25;
                    i18 = 21978;
                    m69812 = C0630.m2566("᩶ۘ") ^ i15;
                    i16 = ((m69812 ^ i14) * (-19605)) ^ 1101097241;
                    i9 = -1904970067;
                    i10 = m69812 ^ i9;
                    sArr4 = sArr2;
                    i25 = i6;
                    menuItem2 = menuItem;
                    z4 = z;
                    i17 = i10;
                    viewOnClickListenerC05442 = viewOnClickListenerC0544;
                case -1623079870:
                case -506504269:
                    C2958.m9034();
                    if (RunnableC3474.f10992 <= 0) {
                        z = z4 ? 1 : 0;
                        menuItem = menuItem2;
                        s = s2;
                        sArr2 = sArr4;
                        i6 = i25;
                        m25662 = (C0630.m2566("ܶ᩻") ^ i14) * (-109);
                        i7 = ((m25662 ^ i15) * 27477) ^ (-1793197408);
                        i8 = 1700774679;
                        i10 = m25662 ^ i8;
                        s2 = s;
                        i16 = i7;
                        sArr4 = sArr2;
                        i25 = i6;
                        menuItem2 = menuItem;
                        z4 = z;
                        i17 = i10;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    }
                    z = z4 ? 1 : 0;
                    menuItem = menuItem2;
                    int m698142 = (C2105.m6981("֨ۢ") ^ i14) * 49;
                    i16 = ((m698142 ^ i15) * 26503) ^ (-88885646);
                    i10 = m698142 ^ (-196631119);
                    menuItem2 = menuItem;
                    z4 = z;
                    i17 = i10;
                    viewOnClickListenerC05442 = viewOnClickListenerC0544;
                case -1602702544:
                case -379156757:
                    menuItem = menuItem2;
                    if (!z3) {
                        m2566 = C0630.m2566("۬۟") ^ i14;
                        i2 = ((m2566 ^ i15) * (-28267)) ^ (-1644127767);
                        i3 = 902730121;
                        i17 = m2566 ^ i3;
                        i16 = i2;
                        menuItem2 = menuItem;
                    }
                    m2566 = C0630.m2566("ۧۧ") ^ i14;
                    i2 = ((m2566 ^ i15) * (-7783)) ^ (-716407668);
                    i3 = 2088033826;
                    i17 = m2566 ^ i3;
                    i16 = i2;
                    menuItem2 = menuItem;
                case -1602151466:
                case -1027903023:
                    menuItem = menuItem2;
                    sArr = sArr4;
                    i = i25;
                    i22 = C2105.m6981(C3746.m11357(sArr, i, 3, i18));
                    i23 = 2099417137;
                    if (C4616.f14690 <= 0) {
                        int m698132 = (C2105.m6981("֡ۢ") ^ i15) * (-97);
                        i17 = m698132 ^ (-1458471475);
                        i16 = ((m698132 ^ i14) * 4677) ^ (-1560492164);
                        sArr4 = sArr;
                        i25 = i;
                        menuItem2 = menuItem;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    } else {
                        int m25665 = C0630.m2566("᩸ۜ") ^ i15;
                        z = z4 ? 1 : 0;
                        i11 = ((m25665 ^ i14) * 18535) ^ (-143329864);
                        i12 = m25665 ^ 840202794;
                        sArr4 = sArr;
                        i25 = i;
                        menuItem2 = menuItem;
                        boolean z5 = z;
                        i17 = i12;
                        i16 = i11;
                        z4 = z5 ? 1 : 0;
                    }
                case -1540934288:
                case -582819643:
                    z = z4 ? 1 : 0;
                    menuItem = menuItem2;
                    sArr2 = sArr4;
                    i6 = i25;
                    s = s2;
                    int i27 = s + 11525;
                    if ((i27 * i27) - (s * 46100) < 0) {
                        m25662 = C2105.m6981("ᩳ᩺") ^ i15;
                        i7 = ((m25662 ^ i14) * (-17171)) ^ 1841039817;
                        i8 = -1985466733;
                    } else {
                        m25662 = C2105.m6981("۫ܶ") ^ i14;
                        i7 = ((m25662 ^ i15) * 10325) ^ (-133075141);
                        i8 = -1733786739;
                    }
                    i10 = m25662 ^ i8;
                    s2 = s;
                    i16 = i7;
                    sArr4 = sArr2;
                    i25 = i6;
                    menuItem2 = menuItem;
                    z4 = z;
                    i17 = i10;
                    viewOnClickListenerC05442 = viewOnClickListenerC0544;
                case -1524461852:
                case 182717870:
                    menuItem = menuItem2;
                    i20 = C2105.m6981(C0630.m2575(f2211, 63, 3, i18));
                    i21 = 2098450151;
                    if (C0483.f2088 < 0) {
                        m2566 = (i15 - C2105.m6981("᩵۠")) * (-9);
                        i2 = ((m2566 ^ i14) * 5891) ^ 1208658938;
                        i3 = 416042189;
                        i17 = m2566 ^ i3;
                        i16 = i2;
                        menuItem2 = menuItem;
                    }
                    m2566 = (C2105.m6981("ۖܿ") + i15) * 53;
                    i2 = ((m2566 ^ i14) * (-17547)) ^ 546193836;
                    i3 = 994555594;
                    i17 = m2566 ^ i3;
                    i16 = i2;
                    menuItem2 = menuItem;
                case -1449333446:
                case 1107218944:
                    z = z4 ? 1 : 0;
                    menuItem = menuItem2;
                    sArr2 = sArr4;
                    i6 = i25;
                    i18 = 61320;
                    m69812 = C0630.m2566("᩶ۘ") ^ i15;
                    i16 = ((m69812 ^ i14) * (-19605)) ^ 1101097241;
                    i9 = -1904970067;
                    i10 = m69812 ^ i9;
                    sArr4 = sArr2;
                    i25 = i6;
                    menuItem2 = menuItem;
                    z4 = z;
                    i17 = i10;
                    viewOnClickListenerC05442 = viewOnClickListenerC0544;
                case -1426940134:
                case -796970913:
                    menuItem = menuItem2;
                    abstractC15440 = abstractC154402;
                    abstractC154403 = C3663.m11176(abstractC15440, C3911.m11919(sArr5, i19, i26, i18));
                    z2 = true;
                    if (C3245.m9926(abstractC154403)) {
                        m6981 = C2105.m6981("ۨ᩻") ^ i15;
                        i4 = ((m6981 ^ i14) * (-25339)) ^ (-1415335467);
                        i5 = -301999051;
                        i17 = m6981 ^ i5;
                        abstractC154402 = abstractC15440;
                        i16 = i4;
                        menuItem2 = menuItem;
                    }
                    m6981 = C0630.m2566("ۗܰ") ^ i14;
                    i4 = ((m6981 ^ i15) * (-25773)) ^ (-1824723438);
                    i5 = -1704098711;
                    i17 = m6981 ^ i5;
                    abstractC154402 = abstractC15440;
                    i16 = i4;
                    menuItem2 = menuItem;
                case -1280753986:
                case -103413573:
                    int i28 = i20 ^ i21;
                    C0630.m2573(c3060, z4 ? 1 : 0, i28, z4 ? 1 : 0, i28);
                    c21282.m48302(new InterfaceC14930(viewOnClickListenerC05442) { // from class: l.ۖܽ᩷

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC0544 f8363;

                        @Override // l.InterfaceC14930
                        public final boolean onMenuItemClick(MenuItem menuItem3) {
                            ViewOnClickListenerC0544 viewOnClickListenerC05443 = null;
                            int i29 = -177537026;
                            int i30 = C2958.f9394;
                            int i31 = C3911.f12484;
                            int m69815 = (C2105.m6981("۫᩺") ^ i30) * (-3);
                            int i32 = ((m69815 ^ i31) * (-17745)) ^ 1774493285;
                            int i33 = -2141269344;
                            while (true) {
                                i29 = ((((i29 ^ i31) * 14887) >> 31) & i32) ^ (m69815 ^ i33);
                                switch (i29) {
                                    case -2141020915:
                                    case -43694665:
                                        if (C0798.f2919) {
                                            m69815 = C0630.m2566("ۧۗ") ^ i31;
                                            i32 = ((m69815 ^ i30) * 18467) ^ (-1364907912);
                                            i33 = -1899999402;
                                        } else {
                                            m69815 = C2105.m6981("ۙᩳ") ^ i31;
                                            i32 = ((m69815 ^ i30) * 25627) ^ (-438678581);
                                            i33 = 647653794;
                                        }
                                    case -2102913876:
                                    case -716643482:
                                        if (C3746.f11829 > 0) {
                                            m69815 = C2105.m6981("ۧ᩵") ^ i30;
                                            i32 = ((m69815 ^ i31) * 4961) ^ 2081000371;
                                            i33 = 120958052;
                                        } else {
                                            m69815 = C0630.m2566("ۧۗ") ^ i31;
                                            i32 = ((m69815 ^ i30) * 18467) ^ (-1364907912);
                                            i33 = -1899999402;
                                        }
                                    case -1916755249:
                                    case -1218605266:
                                        if (C4616.f14690 > 0) {
                                            m69815 = C2105.m6981("ۧ᩵") ^ i30;
                                            i32 = ((m69815 ^ i31) * 4961) ^ 2081000371;
                                            i33 = 120958052;
                                        } else {
                                            m69815 = C0630.m2566("ᩳܽ") ^ i31;
                                            i32 = ((m69815 ^ i30) * (-16991)) ^ (-1845159599);
                                            i33 = -2012769117;
                                        }
                                    case -1881405339:
                                    case 1860667804:
                                        C3663.m11168();
                                        C1711.m5736();
                                        m69815 = C2105.m6981("ۧ᩵") ^ i30;
                                        i32 = ((m69815 ^ i31) * 4961) ^ 2081000371;
                                        i33 = 120958052;
                                    case -1825586687:
                                    case 208485319:
                                        ViewOnClickListenerC0544.m2284(viewOnClickListenerC05443, dialogInterfaceC0206, menuItem3);
                                        return true;
                                    case -1597550024:
                                    case -313622466:
                                        if (C1420.f5096 <= 0) {
                                            m69815 = C2105.m6981("ۧ᩵") ^ i30;
                                            i32 = ((m69815 ^ i31) * 4961) ^ 2081000371;
                                            i33 = 120958052;
                                        } else {
                                            m69815 = C2105.m6981("۬֫") ^ i30;
                                            i32 = ((m69815 ^ i31) * (-3243)) ^ 807099438;
                                            i33 = 908814787;
                                        }
                                    case -1512496850:
                                    case -1065770739:
                                        if (C4159.f13567) {
                                            m69815 = (C0630.m2566("ۚᩳ") + i30) * (-39);
                                            i32 = ((m69815 ^ i31) * (-21513)) ^ (-1387075395);
                                            i33 = 13887827;
                                        } else {
                                            m69815 = C2105.m6981("۫֫") ^ i31;
                                            i32 = ((m69815 ^ i30) * (-591)) ^ 851795400;
                                            i33 = 866851155;
                                        }
                                    case -1024647139:
                                    case 820097381:
                                        viewOnClickListenerC05443 = this.f8363;
                                        if (C0798.m2998() != 0) {
                                            m69815 = C2105.m6981("۫֫") ^ i31;
                                            i32 = ((m69815 ^ i30) * (-591)) ^ 851795400;
                                            i33 = 866851155;
                                        } else {
                                            m69815 = C0630.m2566("᩵۠") ^ i31;
                                            i32 = ((m69815 ^ i30) * (-14521)) ^ (-2083181511);
                                            i33 = 1976557343;
                                        }
                                    case -1023875363:
                                    case 1747170707:
                                        C22628.m50615();
                                        if (C2958.f9394 < 0) {
                                            m69815 = C2105.m6981("ۧ᩵") ^ i30;
                                            i32 = ((m69815 ^ i31) * 4961) ^ 2081000371;
                                            i33 = 120958052;
                                        } else {
                                            m69815 = (C2105.m6981("֡ۜ") ^ i30) * 13;
                                            i32 = ((m69815 ^ i31) * (-16475)) ^ 450171116;
                                            i33 = -975035790;
                                        }
                                    case -1022791829:
                                    case 862221956:
                                        if (C11340.f33930 >= 0) {
                                            m69815 = (C2105.m6981("֡ۜ") ^ i30) * 13;
                                            i32 = ((m69815 ^ i31) * (-16475)) ^ 450171116;
                                            i33 = -975035790;
                                        } else {
                                            m69815 = (i31 - C2105.m6981("᩻֡")) * 45;
                                            i32 = ((m69815 ^ i30) * (-27483)) ^ 1883623751;
                                            i33 = -1262535621;
                                        }
                                    case -792726441:
                                    case 2005809219:
                                        if (C2958.f9394 >= 0) {
                                            m69815 = C2105.m6981("ۧ᩵") ^ i30;
                                            i32 = ((m69815 ^ i31) * 4961) ^ 2081000371;
                                            i33 = 120958052;
                                        } else {
                                            m69815 = (C2105.m6981("᩷ۖ") ^ i31) * (-39);
                                            i32 = ((m69815 ^ i30) * (-13419)) ^ 1479944764;
                                            i33 = -1308243277;
                                        }
                                    case -270288037:
                                    case 568546328:
                                        if (C4117.f13076 <= 0) {
                                            m69815 = C0630.m2566("ۧۗ") ^ i31;
                                            i32 = ((m69815 ^ i30) * 18467) ^ (-1364907912);
                                            i33 = -1899999402;
                                        } else {
                                            m69815 = (C2105.m6981("᩺۫") + i31) * 69;
                                            i32 = ((m69815 ^ i30) * (-26401)) ^ (-19571883);
                                            i33 = 1624673844;
                                        }
                                    case -233339235:
                                    case 1577411650:
                                        C3746.m11369();
                                        C5695.m16023();
                                        return false;
                                    case 666830888:
                                    case 1557058666:
                                        if (C0964.f3626 != 0) {
                                            m69815 = (C2105.m6981("֡ۜ") ^ i30) * 13;
                                            i32 = ((m69815 ^ i31) * (-16475)) ^ 450171116;
                                            i33 = -975035790;
                                        } else {
                                            m69815 = C2105.m6981("ۚ֨") ^ i30;
                                            i32 = ((m69815 ^ i31) * 20397) ^ (-1989437402);
                                            i33 = 1967168916;
                                        }
                                    case 694113412:
                                    case 1641956393:
                                        if (C1005.m3501()) {
                                            m69815 = (C2105.m6981("᩹ۤ") + i30) * (-55);
                                            i32 = ((m69815 ^ i31) * 14713) ^ (-1826208617);
                                            i33 = 1680904151;
                                        } else {
                                            m69815 = C0630.m2566("ᩳܽ") ^ i31;
                                            i32 = ((m69815 ^ i30) * (-16991)) ^ (-1845159599);
                                            i33 = -2012769117;
                                        }
                                    default:
                                        if (AbstractC2021.f6743 <= 0) {
                                            m69815 = C2105.m6981("۫֫") ^ i31;
                                            i32 = ((m69815 ^ i30) * (-591)) ^ 851795400;
                                            i33 = 866851155;
                                        } else {
                                            m69815 = C2105.m6981("ۨۤ") ^ i30;
                                            i32 = ((m69815 ^ i31) * (-17983)) ^ (-207142678);
                                            i33 = -2102641112;
                                        }
                                }
                            }
                        }

                        {
                            int i29 = -1062049467;
                            int i30 = C11340.f33930;
                            int i31 = ServiceConnectionC3453.f10921;
                            int m69815 = (i31 - C2105.m6981("ᩴ᩻")) * (-31);
                            int i32 = ((m69815 ^ i30) * 8795) ^ (-850775345);
                            int i33 = 1915978585;
                            while (true) {
                                i29 = ((((i29 ^ i30) * (-30671)) >> 31) & i32) ^ (m69815 ^ i33);
                                switch (i29) {
                                    case -1698937392:
                                    case 432008696:
                                        if (C22628.m50615() != 0) {
                                            m69815 = C0630.m2566("ۢ֨") ^ i30;
                                            i32 = ((m69815 ^ i31) * (-21413)) ^ 450747034;
                                            i33 = 798236131;
                                        } else {
                                            m69815 = C0630.m2566("ܺۤ") ^ i30;
                                            i32 = ((m69815 ^ i31) * 17361) ^ 1260312818;
                                            i33 = -994587131;
                                        }
                                    case -1634802669:
                                    case 266686682:
                                        return;
                                    case -1528721863:
                                    case 1589461145:
                                        if (C3537.f11231 >= 0) {
                                            m69815 = (i31 - C0630.m2566("᩺᩺")) * 47;
                                            i32 = ((m69815 ^ i30) * (-22639)) ^ 1723984333;
                                            i33 = 1062111913;
                                        } else {
                                            m69815 = (C2105.m6981("ᩴۗ") ^ i30) * (-27);
                                            i32 = ((m69815 ^ i31) * (-7219)) ^ (-1100504386);
                                            i33 = 816366949;
                                        }
                                    case -1509246097:
                                    case -1358881762:
                                        if (C11340.f33930 >= 0) {
                                            m69815 = (i31 - C0630.m2566("᩺᩺")) * 47;
                                            i32 = ((m69815 ^ i30) * (-22639)) ^ 1723984333;
                                            i33 = 1062111913;
                                        } else {
                                            m69815 = C0630.m2566("᩶ۘ") ^ i30;
                                            i32 = ((m69815 ^ i31) * 24003) ^ (-119382944);
                                            i33 = 1714062525;
                                        }
                                    case -1308387165:
                                    case 108593161:
                                        if (C0798.f2919) {
                                            m69815 = (C0630.m2566("۠۫") + i31) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i32 = ((m69815 ^ i30) * 3855) ^ (-1924929334);
                                            i33 = -1811535171;
                                        } else {
                                            m69815 = C0630.m2566("ۙᩴ") ^ i31;
                                            i32 = ((m69815 ^ i30) * (-7283)) ^ (-1024380637);
                                            i33 = -179767757;
                                        }
                                    case -1079768967:
                                    case -569700584:
                                        C11340.m28031();
                                        RunnableC0588.m2441();
                                        m69815 = (C2105.m6981("ۨۡ") + i30) * 41;
                                        i32 = ((m69815 ^ i31) * 23461) ^ 460912843;
                                        i33 = -2010652250;
                                    case -853291635:
                                    case 1567089944:
                                        if (C4075.f12947 >= 0) {
                                            m69815 = (C0630.m2566("۠۫") + i31) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i32 = ((m69815 ^ i30) * 3855) ^ (-1924929334);
                                            i33 = -1811535171;
                                        } else {
                                            m69815 = C0630.m2566("ܿۤ") ^ i31;
                                            i32 = ((m69815 ^ i30) * (-5439)) ^ 99889308;
                                            i33 = 355596895;
                                        }
                                    case -133424443:
                                    case 231890422:
                                        C1420.m4913();
                                        if (C2167.f7158 >= 0) {
                                            m69815 = C0630.m2566("ۧۤ") ^ i31;
                                            i32 = ((m69815 ^ i30) * (-6319)) ^ 997952089;
                                            i33 = -1506078245;
                                        } else {
                                            m69815 = C0630.m2566("ۢ֨") ^ i30;
                                            i32 = ((m69815 ^ i31) * (-21413)) ^ 450747034;
                                            i33 = 798236131;
                                        }
                                    case -104404822:
                                    case 538222271:
                                        if (C3746.f11829 <= 0) {
                                            m69815 = (C0630.m2566("۠۫") + i31) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i32 = ((m69815 ^ i30) * 3855) ^ (-1924929334);
                                            i33 = -1811535171;
                                        } else {
                                            m69815 = (C0630.m2566("ۙܳ") ^ i30) * (-99);
                                            i32 = ((m69815 ^ i31) * 32609) ^ (-117610773);
                                            i33 = -100060476;
                                        }
                                    case -71376423:
                                    case 1323646477:
                                        C4159.m12565();
                                        if (C0798.f2919) {
                                            m69815 = (C2105.m6981("ۨۡ") + i30) * 41;
                                            i32 = ((m69815 ^ i31) * 23461) ^ 460912843;
                                            i33 = -2010652250;
                                        } else {
                                            m69815 = C0630.m2566("ۧۤ") ^ i31;
                                            i32 = ((m69815 ^ i30) * (-6319)) ^ 997952089;
                                            i33 = -1506078245;
                                        }
                                    case 182237863:
                                    case 278728659:
                                        if (C2167.f7158 >= 0) {
                                            m69815 = (C0630.m2566("۠۫") + i31) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i32 = ((m69815 ^ i30) * 3855) ^ (-1924929334);
                                            i33 = -1811535171;
                                        } else {
                                            m69815 = (C2105.m6981("᩶ۖ") + i31) * (-11);
                                            i32 = ((m69815 ^ i30) * 20823) ^ (-308589827);
                                            i33 = -556680950;
                                        }
                                    case 226457394:
                                    case 1586032693:
                                        if (C1294.f4556 >= 0) {
                                            m69815 = (i31 - C0630.m2566("᩺᩺")) * 47;
                                            i32 = ((m69815 ^ i30) * (-22639)) ^ 1723984333;
                                            i33 = 1062111913;
                                        } else {
                                            m69815 = C0630.m2566("֨֡") ^ i30;
                                            i32 = ((m69815 ^ i31) * o.a.i) ^ 1182254280;
                                            i33 = -1991412003;
                                        }
                                    case 372424910:
                                    case 1254897782:
                                        RunnableC1937.m6387();
                                        if (C1504.f5354) {
                                            m69815 = (C2105.m6981("ۨۡ") + i30) * 41;
                                            i32 = ((m69815 ^ i31) * 23461) ^ 460912843;
                                            i33 = -2010652250;
                                        } else {
                                            m69815 = (i31 - C0630.m2566("᩺᩺")) * 47;
                                            i32 = ((m69815 ^ i30) * (-22639)) ^ 1723984333;
                                            i33 = 1062111913;
                                        }
                                    case 528068977:
                                    case 1925467611:
                                        C0483.m2121();
                                        throw new RuntimeException();
                                    case 1013729936:
                                    case 1619919688:
                                        this.f8363 = viewOnClickListenerC05442;
                                        if (C1420.f5096 <= 0) {
                                            m69815 = C0630.m2566("ۧۤ") ^ i31;
                                            i32 = ((m69815 ^ i30) * (-6319)) ^ 997952089;
                                            i33 = -1506078245;
                                        } else {
                                            m69815 = C0630.m2566("۠ܿ") ^ i31;
                                            i32 = ((m69815 ^ i30) * 30325) ^ (-1301039192);
                                            i33 = -1300244198;
                                        }
                                    default:
                                        if (C3746.f11829 <= 0) {
                                            m69815 = C0630.m2566("ۢ֨") ^ i30;
                                            i32 = ((m69815 ^ i31) * (-21413)) ^ 450747034;
                                            i33 = 798236131;
                                        } else {
                                            m69815 = (i31 - C0630.m2566("ۖ۠")) * (-19);
                                            i32 = ((m69815 ^ i30) * (-15097)) ^ 264406366;
                                            i33 = 924075319;
                                        }
                                }
                            }
                        }
                    });
                    c21282.m48305();
                    break;
                case -1274720869:
                case 1230598749:
                    menuItem = menuItem2;
                    int m25666 = C0630.m2566(str) ^ 2097605682;
                    C0630.m2573(c3060, z4 ? 1 : 0, m25666, z4 ? 1 : 0, m25666);
                    m2566 = (C0630.m2566("᩵֫") + i14) * 15;
                    i2 = ((m2566 ^ i15) * 28197) ^ (-247792975);
                    i3 = -1828648439;
                    i17 = m2566 ^ i3;
                    i16 = i2;
                    menuItem2 = menuItem;
                case -1271526597:
                case 1852841753:
                    z = z4 ? 1 : 0;
                    menuItem = menuItem2;
                    sArr2 = sArr4;
                    i6 = i25;
                    s2 = sArr3[48];
                    if (C3911.m11924() <= 0) {
                        sArr4 = sArr2;
                        i25 = i6;
                        int m6981422 = (C2105.m6981("֨ۢ") ^ i14) * 49;
                        i16 = ((m6981422 ^ i15) * 26503) ^ (-88885646);
                        i10 = m6981422 ^ (-196631119);
                        menuItem2 = menuItem;
                        z4 = z;
                        i17 = i10;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    } else {
                        m69812 = (C2105.m6981("֡ܽ") + i14) * (-5);
                        i16 = ((m69812 ^ i15) * (-23475)) ^ 1616646555;
                        i9 = 1701610470;
                        i10 = m69812 ^ i9;
                        sArr4 = sArr2;
                        i25 = i6;
                        menuItem2 = menuItem;
                        z4 = z;
                        i17 = i10;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    }
                case -1074449510:
                case 1652603135:
                    menuItem = menuItem2;
                    sArr = sArr4;
                    i = i25;
                    abstractActivityC3346 = viewOnClickListenerC05442.f2214.f17021;
                    z4 = false;
                    z4 = false;
                    c21282 = new C21282(abstractActivityC3346, view, 0);
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        int m6981322 = (C2105.m6981("֡ۢ") ^ i15) * (-97);
                        i17 = m6981322 ^ (-1458471475);
                        i16 = ((m6981322 ^ i14) * 4677) ^ (-1560492164);
                        sArr4 = sArr;
                        i25 = i;
                        menuItem2 = menuItem;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    } else {
                        int m25667 = (i14 - C0630.m2566("۫᩷")) * (-47);
                        i16 = ((m25667 ^ i15) * 28785) ^ 356455128;
                        i17 = m25667 ^ (-359218900);
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                        sArr4 = sArr;
                        i25 = i;
                        menuItem2 = menuItem;
                    }
                case -792632985:
                case -93526715:
                    z = z4 ? 1 : 0;
                    menuItem = menuItem2;
                    s = s2;
                    sArr2 = sArr4;
                    i6 = i25;
                    sArr3 = f2211;
                    if (C3245.m9925() == 0) {
                        m25662 = C0630.m2566("᩺֫") ^ i15;
                        i7 = ((m25662 ^ i14) * (-14419)) ^ (-940202375);
                        i8 = 1489159226;
                        i10 = m25662 ^ i8;
                        s2 = s;
                        i16 = i7;
                        sArr4 = sArr2;
                        i25 = i6;
                        menuItem2 = menuItem;
                        z4 = z;
                        i17 = i10;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    }
                    m25662 = (C0630.m2566("ܶ᩻") ^ i14) * (-109);
                    i7 = ((m25662 ^ i15) * 27477) ^ (-1793197408);
                    i8 = 1700774679;
                    i10 = m25662 ^ i8;
                    s2 = s;
                    i16 = i7;
                    sArr4 = sArr2;
                    i25 = i6;
                    menuItem2 = menuItem;
                    z4 = z;
                    i17 = i10;
                    viewOnClickListenerC05442 = viewOnClickListenerC0544;
                case -635157468:
                case -203538058:
                    z = z4 ? 1 : 0;
                    menuItem = menuItem2;
                    c3060 = c21282.m48304();
                    sArr4 = f2211;
                    i25 = 49;
                    if (C0714.f2697 >= 0) {
                        int m69814222 = (C2105.m6981("֨ۢ") ^ i14) * 49;
                        i16 = ((m69814222 ^ i15) * 26503) ^ (-88885646);
                        i10 = m69814222 ^ (-196631119);
                        menuItem2 = menuItem;
                        z4 = z;
                        i17 = i10;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    } else {
                        int m25668 = C0630.m2566("᩷֨") ^ i14;
                        i11 = ((m25668 ^ i15) * (-31845)) ^ 1549761274;
                        i12 = m25668 ^ 468633574;
                        menuItem2 = menuItem;
                        boolean z52 = z;
                        i17 = i12;
                        i16 = i11;
                        z4 = z52 ? 1 : 0;
                    }
                case -555699138:
                case 527627160:
                    menuItem = menuItem2;
                    int i29 = i22 ^ i23;
                    C0630.m2573(c3060, z4 ? 1 : 0, i29, z4 ? 1 : 0, i29);
                    if (viewOnClickListenerC05442.f2213.m39299()) {
                        m2566 = (C2105.m6981("᩷ۙ") + i14) * 119;
                        i2 = ((m2566 ^ i15) * (-26573)) ^ 434035158;
                        i3 = -1971538353;
                        i17 = m2566 ^ i3;
                        i16 = i2;
                        menuItem2 = menuItem;
                    }
                    m2566 = (C0630.m2566("᩵֫") + i14) * 15;
                    i2 = ((m2566 ^ i15) * 28197) ^ (-247792975);
                    i3 = -1828648439;
                    i17 = m2566 ^ i3;
                    i16 = i2;
                    menuItem2 = menuItem;
                case -325533476:
                case 1383081916:
                    menuItem2.setEnabled(z4);
                    menuItem = menuItem2;
                    m2566 = C0630.m2566("ۧۧ") ^ i14;
                    i2 = ((m2566 ^ i15) * (-7783)) ^ (-716407668);
                    i3 = 2088033826;
                    i17 = m2566 ^ i3;
                    i16 = i2;
                    menuItem2 = menuItem;
                case -290374428:
                case 262201245:
                    AbstractC15440 abstractC154404 = abstractC154402;
                    int i30 = i24 ^ 2123560410;
                    MenuItem m2573 = C0630.m2573(c3060, z4 ? 1 : 0, i30, z4 ? 1 : 0, i30);
                    C16709 c167092 = viewOnClickListenerC05442.f2213;
                    if (C0422.f1886 <= 0) {
                        abstractC154402 = abstractC154404;
                        c16709 = c167092;
                        menuItem2 = m2573;
                        int m256642 = (C0630.m2566("᩹֡") ^ i14) * (-107);
                        i17 = m256642 ^ 1534571988;
                        i16 = ((m256642 ^ i15) * 8977) ^ 1217457237;
                    } else {
                        int m25669 = C0630.m2566("ۚᩳ") ^ i14;
                        i16 = ((m25669 ^ i15) * (-11937)) ^ (-1585166528);
                        i17 = m25669 ^ 1266404282;
                        c16709 = c167092;
                        abstractC154402 = abstractC154404;
                        menuItem2 = m2573;
                    }
                case 17357270:
                case 961276378:
                    menuItem = menuItem2;
                    if (C4159.m12563(abstractC154403.mo27931()) > 0) {
                        z3 = z2;
                        m2566 = C2105.m6981("ܰᩳ") ^ i15;
                        i2 = ((m2566 ^ i14) * (-22167)) ^ 1437093958;
                        i3 = 1284488963;
                        i17 = m2566 ^ i3;
                        i16 = i2;
                        menuItem2 = menuItem;
                    } else {
                        abstractC15440 = abstractC154402;
                        m6981 = C0630.m2566("ۗܰ") ^ i14;
                        i4 = ((m6981 ^ i15) * (-25773)) ^ (-1824723438);
                        i5 = -1704098711;
                        i17 = m6981 ^ i5;
                        abstractC154402 = abstractC15440;
                        i16 = i4;
                        menuItem2 = menuItem;
                    }
                case 326135822:
                case 1230031219:
                    if (C3245.f10203 <= 0) {
                        z = z4 ? 1 : 0;
                        menuItem = menuItem2;
                        int m698142222 = (C2105.m6981("֨ۢ") ^ i14) * 49;
                        i16 = ((m698142222 ^ i15) * 26503) ^ (-88885646);
                        i10 = m698142222 ^ (-196631119);
                        menuItem2 = menuItem;
                        z4 = z;
                        i17 = i10;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    } else {
                        menuItem = menuItem2;
                        m2566 = (C2105.m6981("ۖܿ") + i15) * 53;
                        i2 = ((m2566 ^ i14) * (-17547)) ^ 546193836;
                        i3 = 994555594;
                        i17 = m2566 ^ i3;
                        i16 = i2;
                        menuItem2 = menuItem;
                    }
                case 555104081:
                case 1918596562:
                    if (C3019.f9544 >= 0) {
                        menuItem = menuItem2;
                        m2566 = (C2105.m6981("ۖܿ") + i15) * 53;
                        i2 = ((m2566 ^ i14) * (-17547)) ^ 546193836;
                        i3 = 994555594;
                        i17 = m2566 ^ i3;
                        i16 = i2;
                        menuItem2 = menuItem;
                    } else {
                        menuItem = menuItem2;
                        sArr = sArr4;
                        i = i25;
                        int m69813222 = (C2105.m6981("֡ۢ") ^ i15) * (-97);
                        i17 = m69813222 ^ (-1458471475);
                        i16 = ((m69813222 ^ i14) * 4677) ^ (-1560492164);
                        sArr4 = sArr;
                        i25 = i;
                        menuItem2 = menuItem;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    }
                case 792957901:
                case 1083664248:
                    menuItem = menuItem2;
                    i24 = C2105.m6981(C0237.m1483(f2211, 52, 3, i18));
                    if (C3746.f11829 <= 0) {
                        z = z4 ? 1 : 0;
                        int m6981422222 = (C2105.m6981("֨ۢ") ^ i14) * 49;
                        i16 = ((m6981422222 ^ i15) * 26503) ^ (-88885646);
                        i10 = m6981422222 ^ (-196631119);
                        menuItem2 = menuItem;
                        z4 = z;
                        i17 = i10;
                        viewOnClickListenerC05442 = viewOnClickListenerC0544;
                    } else {
                        m2566 = (C0630.m2566("ۤ᩷") ^ i15) * 9;
                        i2 = ((m2566 ^ i14) * 29711) ^ (-1678914038);
                        i3 = 1527771110;
                        i17 = m2566 ^ i3;
                        i16 = i2;
                        menuItem2 = menuItem;
                    }
                case 1127994230:
                case 1314317209:
                    menuItem = menuItem2;
                    z3 = C13265.m32220(str2).getAll().isEmpty() ^ z2;
                    m2566 = C2105.m6981("ܰᩳ") ^ i15;
                    i2 = ((m2566 ^ i14) * (-22167)) ^ 1437093958;
                    i3 = 1284488963;
                    i17 = m2566 ^ i3;
                    i16 = i2;
                    menuItem2 = menuItem;
                default:
                    C3911.m11924();
                    C2272.m7503();
                    break;
            }
            return;
        }
    }
}
