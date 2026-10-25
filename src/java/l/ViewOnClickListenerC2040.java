package l;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.tabs.TabLayout;
import com.umeng.commonsdk.stateless.b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;

/* compiled from: C2R7 */
/* renamed from: l.֫᩵᩷, reason: contains not printable characters */
/* loaded from: classes.dex */
public class ViewOnClickListenerC2040 extends AbstractActivityC3346 implements InterfaceC4585, View.OnClickListener {

    /* renamed from: ֡֫᩻, reason: not valid java name and contains not printable characters */
    private static final short[] f6807;

    /* renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f6808 = 0;

    /* renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f6809;

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public boolean f6810;

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public boolean f6811;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public boolean f6812;

    /* renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f6813;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public boolean f6814;

    /* renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public C3430 f6815;

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f6816;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f6817;

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f6818;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f6819;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C6273 f6820;

    /* renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public C0452 f6821;

    /* renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public C3430 f6822;

    /* renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public C7663 f6823;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public int f6824;

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public C23592 f6825;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f6826;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f6827;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f6828;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public int f6829;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public C14012 f6830;

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public boolean f6831;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public EditText f6832;

    /* renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f6833;

    /* renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public int f6834;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f6835;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m6658(ViewOnClickListenerC2040 viewOnClickListenerC2040, C19119 c19119, C13132 c13132, AtomicInteger atomicInteger, int i) {
        int i2 = -429410246;
        int i3 = C3537.f11231;
        int i4 = C3019.f9544;
        int m2566 = C0630.m2566("᩵֨") ^ i3;
        int i5 = ((m2566 ^ i4) * 32373) ^ (-1053069760);
        int i6 = 162361841;
        while (true) {
            i2 = ((((i2 ^ i4) * 14625) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -2093919561:
                case 876168052:
                    if (C0483.f2088 >= 0) {
                        m2566 = C0630.m2566("۬ۛ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-29335)) ^ (-2141093012);
                        i6 = 800158046;
                    } else {
                        m2566 = C0630.m2566("ۗ֨") ^ i4;
                        i5 = ((m2566 ^ i3) * 12537) ^ (-2085203992);
                        i6 = -151366105;
                    }
                case -2062102388:
                case -178917026:
                    C0237.m1481();
                    m2566 = (C0630.m2566("ۨۖ") ^ i3) * 21;
                    i5 = ((m2566 ^ i4) * 16025) ^ (-1150581682);
                    i6 = -1414577104;
                case -2011388253:
                case -1932408132:
                    ServiceConnectionC3453.m10564();
                    if (C0050.m940() <= 0) {
                        m2566 = (C0630.m2566("ۨۖ") ^ i3) * 21;
                        i5 = ((m2566 ^ i4) * 16025) ^ (-1150581682);
                        i6 = -1414577104;
                    } else {
                        m2566 = C2105.m6981("ۖ۟") ^ i4;
                        i5 = ((m2566 ^ i3) * 3291) ^ (-49272141);
                        i6 = 418685543;
                    }
                case -1834129426:
                case -1617864380:
                    C2126.m7040();
                    break;
                case -1818702453:
                case -1817270379:
                    viewOnClickListenerC2040.m6648(c19119, c13132, atomicInteger, i);
                    break;
                case -1675698371:
                case 458950246:
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = C0630.m2566("۬ۛ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-29335)) ^ (-2141093012);
                        i6 = 800158046;
                    } else {
                        m2566 = C0630.m2566("֡ܿ") ^ i3;
                        i5 = ((m2566 ^ i4) * 30885) ^ 305051786;
                        i6 = 1109488767;
                    }
                case -1472005715:
                case -377788214:
                    if (C4075.m12263() <= 0) {
                        m2566 = C2105.m6981("ۖ۟") ^ i4;
                        i5 = ((m2566 ^ i3) * 3291) ^ (-49272141);
                        i6 = 418685543;
                    } else {
                        m2566 = (C0630.m2566("֡ۧ") + i4) * (-43);
                        i5 = ((m2566 ^ i3) * (-11111)) ^ 355072315;
                        i6 = -1720805838;
                    }
                case -1381595013:
                case 941267244:
                    if (C0714.f2697 >= 0) {
                        m2566 = (C0630.m2566("֡ۧ") + i4) * (-43);
                        i5 = ((m2566 ^ i3) * (-11111)) ^ 355072315;
                        i6 = -1720805838;
                    } else {
                        m2566 = (i4 - C0630.m2566("᩸ۙ")) * 5;
                        i5 = ((m2566 ^ i3) * (-14917)) ^ 875759660;
                        i6 = -134135249;
                    }
                case -1355030269:
                case -770258833:
                    if (C2167.f7158 >= 0) {
                        m2566 = C0630.m2566("۬ۛ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-29335)) ^ (-2141093012);
                        i6 = 800158046;
                    } else {
                        m2566 = C0630.m2566("۠ۛ") ^ i4;
                        i5 = ((m2566 ^ i3) * 11841) ^ 1990029511;
                        i6 = -621662356;
                    }
                case -973715933:
                case 1748557228:
                    if (C2272.f7362) {
                        m2566 = (C0630.m2566("֡ۧ") + i4) * (-43);
                        i5 = ((m2566 ^ i3) * (-11111)) ^ 355072315;
                        i6 = -1720805838;
                    } else {
                        m2566 = C0630.m2566("ܽ֫") ^ i4;
                        i5 = ((m2566 ^ i3) * 27713) ^ (-244553256);
                        i6 = 1069000593;
                    }
                case -931273910:
                case -32989061:
                    if (C4616.f14690 <= 0) {
                        m2566 = C2105.m6981("ۖ۟") ^ i4;
                        i5 = ((m2566 ^ i3) * 3291) ^ (-49272141);
                        i6 = 418685543;
                    } else {
                        m2566 = (C2105.m6981("᩸ᩳ") ^ i3) * 73;
                        i5 = ((m2566 ^ i4) * (-30109)) ^ (-1449917284);
                        i6 = 661023923;
                    }
                case -707473933:
                case 1544997604:
                    if (C0630.f2410 <= 0) {
                        m2566 = C0630.m2566("۬ۛ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-29335)) ^ (-2141093012);
                        i6 = 800158046;
                    } else {
                        m2566 = (C0630.m2566("ܰ᩺") + i4) * (-33);
                        i5 = ((m2566 ^ i3) * (-20721)) ^ 764542076;
                        i6 = 438800252;
                    }
                case -489582303:
                case 928218471:
                    if (C4075.m12263() <= 0) {
                        m2566 = (C0630.m2566("ۨۖ") ^ i3) * 21;
                        i5 = ((m2566 ^ i4) * 16025) ^ (-1150581682);
                        i6 = -1414577104;
                    } else {
                        m2566 = (C2105.m6981("֨ܽ") + i3) * 37;
                        i5 = ((m2566 ^ i4) * (-14953)) ^ (-1335836034);
                        i6 = -857180020;
                    }
                case 114856050:
                case 1143642874:
                    if (C4075.f12947 >= 0) {
                        m2566 = (C2105.m6981("᩸ᩳ") ^ i3) * 73;
                        i5 = ((m2566 ^ i4) * (-30109)) ^ (-1449917284);
                        i6 = 661023923;
                    } else {
                        m2566 = C0630.m2566("ܽ۫") ^ i3;
                        i5 = ((m2566 ^ i4) * 18181) ^ (-1910416482);
                        i6 = -1732587613;
                    }
                case 684320253:
                case 1224942759:
                    if (C1047.f3863 >= 0) {
                        m2566 = C2105.m6981("ۖ۟") ^ i4;
                        i5 = ((m2566 ^ i3) * 3291) ^ (-49272141);
                        i6 = 418685543;
                    } else {
                        m2566 = (C2105.m6981("᩷֫") ^ i3) * 55;
                        i5 = ((m2566 ^ i4) * (-20409)) ^ 1613823297;
                        i6 = 1731818398;
                    }
                default:
                    if (C4075.f12947 >= 0) {
                        m2566 = (C0630.m2566("ۨۖ") ^ i3) * 21;
                        i5 = ((m2566 ^ i4) * 16025) ^ (-1150581682);
                        i6 = -1414577104;
                    } else {
                        m2566 = C2105.m6981("ۛܶ") ^ i3;
                        i5 = ((m2566 ^ i4) * 30257) ^ 776103270;
                        i6 = -375173411;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private native void m6663(C19697 c19697, C19119 c19119, C19119 c191192);

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 881850977;
        int i7 = C22628.f73083;
        int i8 = C0050.f910;
        int m6981 = (i7 - C2105.m6981("ۗۖ")) * (-105);
        int i9 = ((m6981 ^ i8) * 16941) ^ 1230948560;
        int i10 = -1469148386;
        while (true) {
            i6 = ((((i6 ^ i8) * (-27683)) >> 31) & i9) ^ (m6981 ^ i10);
            switch (i6) {
                case -2119084757:
                case 234861967:
                    if (C4263.f13799 <= 0) {
                        m6981 = C2105.m6981("ۜܿ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-24197)) ^ 2124661093;
                        i10 = -1763710343;
                    } else {
                        m6981 = C2105.m6981("ܿᩴ") ^ i7;
                        i9 = ((m6981 ^ i8) * 369) ^ 300995785;
                        i10 = 981743084;
                    }
                case -2097177166:
                case -1306379951:
                    if (i - (i2 + i3) <= 0) {
                        m6981 = (C2105.m6981("ۧ᩶") ^ i7) * 123;
                        i9 = ((m6981 ^ i8) * (-3777)) ^ 124551443;
                        i10 = 959944714;
                    } else {
                        m6981 = C0630.m2566("۬᩶") ^ i7;
                        i9 = ((m6981 ^ i8) * 26405) ^ (-517665356);
                        i10 = 2024315200;
                    }
                case -1908405487:
                case 1505737982:
                    s = sArr[c];
                    s2 = 28494;
                    if (C7811.f24123 >= 0) {
                        m6981 = (C0630.m2566("ᩴ᩶") + i7) * (-51);
                        i9 = ((m6981 ^ i8) * 18775) ^ (-1364130472);
                        i10 = -106131985;
                    } else {
                        m6981 = (C0630.m2566("۠᩸") + i7) * 21;
                        i9 = ((m6981 ^ i8) * 3365) ^ (-819562997);
                        i10 = -1145954611;
                    }
                case -1609425705:
                case -797776525:
                    i3 = 202977009;
                    if (C1916.f6442) {
                        m6981 = C0630.m2566("᩹۫") ^ i8;
                        i9 = ((m6981 ^ i7) * (-23189)) ^ (-1112375587);
                        i10 = 2119809899;
                    } else {
                        m6981 = (C2105.m6981("ᩴܰ") ^ i7) * 7;
                        i9 = ((m6981 ^ i8) * (-2259)) ^ (-1699581512);
                        i10 = 826335463;
                    }
                case -1600627559:
                case 1314218306:
                    sArr = f6807;
                    if (C2105.m6982() != 0) {
                        m6981 = (C0630.m2566("ᩴ᩶") + i7) * (-51);
                        i9 = ((m6981 ^ i8) * 18775) ^ (-1364130472);
                        i10 = -106131985;
                    } else {
                        m6981 = C0630.m2566("ۜۙ") ^ i7;
                        i9 = ((m6981 ^ i8) * 9589) ^ 1414062808;
                        i10 = -505921657;
                    }
                case -1220023656:
                case -734272999:
                    if (C0964.f3626 != 0) {
                        m6981 = C0630.m2566("ᩴۧ") ^ i8;
                        i9 = ((m6981 ^ i7) * 12833) ^ 1377002306;
                        i10 = -979204113;
                    } else {
                        m6981 = (C0630.m2566("۫᩶") + i8) * 69;
                        i9 = ((m6981 ^ i7) * 27553) ^ 2090272041;
                        i10 = 356409601;
                    }
                case -1162841842:
                case 1032085136:
                    if (C1047.f3863 < 0) {
                        m6981 = C2105.m6981("ۜܿ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-24197)) ^ 2124661093;
                        i10 = -1763710343;
                    } else {
                        m6981 = C2105.m6981("ۤ۟") ^ i8;
                        i9 = ((m6981 ^ i7) * (-1739)) ^ (-1257749474);
                        i10 = -566650292;
                    }
                case -723565483:
                case -476024659:
                    return C1294.m4373(sArr2, i5, 18, i4);
                case -575607474:
                case 914544364:
                    i4 = 52732;
                    m6981 = (C2105.m6981("ܳۜ") + i8) * (-15);
                    i9 = ((m6981 ^ i7) * 4235) ^ 1075854290;
                    i10 = 442011778;
                case -64754855:
                case 673013398:
                    sArr2 = f6807;
                    i5 = 646;
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = (C0630.m2566("ᩴ᩶") + i7) * (-51);
                        i9 = ((m6981 ^ i8) * 18775) ^ (-1364130472);
                        i10 = -106131985;
                    } else {
                        m6981 = (i7 - C0630.m2566("ܳ᩹")) * (-41);
                        i9 = ((m6981 ^ i8) * (-9313)) ^ (-284316312);
                        i10 = -1117023850;
                    }
                case 29289662:
                case 258459674:
                    if (C3432.f10845 >= 0) {
                        m6981 = (C2105.m6981("ᩴܰ") ^ i7) * 7;
                        i9 = ((m6981 ^ i8) * (-2259)) ^ (-1699581512);
                        i10 = 826335463;
                    } else {
                        m6981 = (C0630.m2566("ۨ۠") + i8) * 47;
                        i9 = ((m6981 ^ i7) * 30697) ^ 1582238659;
                        i10 = 1036087273;
                    }
                case 427479470:
                case 956604503:
                    C1047.m3599();
                    return null;
                case 479217708:
                case 1214337534:
                    C1773.m5908();
                    C4075.m12263();
                    m6981 = C0630.m2566("ᩴۧ") ^ i8;
                    i9 = ((m6981 ^ i7) * 12833) ^ 1377002306;
                    i10 = -979204113;
                case 580672380:
                case 732202701:
                    C21923.m49329();
                    if (C1711.f5919) {
                        m6981 = C2105.m6981("ۜܿ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-24197)) ^ 2124661093;
                        i10 = -1763710343;
                    } else {
                        m6981 = C0630.m2566("ᩴۧ") ^ i8;
                        i9 = ((m6981 ^ i7) * 12833) ^ 1377002306;
                        i10 = -979204113;
                    }
                case 868840567:
                case 1296789161:
                    i4 = 3082;
                    m6981 = (C2105.m6981("ܳۜ") + i8) * (-15);
                    i9 = ((m6981 ^ i7) * 4235) ^ 1075854290;
                    i10 = 442011778;
                case 978846265:
                case 1606000036:
                    if (C0714.f2697 >= 0) {
                        m6981 = C0630.m2566("ᩴۧ") ^ i8;
                        i9 = ((m6981 ^ i7) * 12833) ^ 1377002306;
                        i10 = -979204113;
                    } else {
                        m6981 = (C2105.m6981("ۢ᩹") ^ i7) * 63;
                        i9 = ((m6981 ^ i8) * (-29753)) ^ (-402309668);
                        i10 = 794268342;
                    }
                case 1736139453:
                case 1786391761:
                    C2958.m9034();
                    if (C0422.f1886 > 0) {
                        m6981 = C0630.m2566("ᩴۧ") ^ i8;
                        i9 = ((m6981 ^ i7) * 12833) ^ 1377002306;
                        i10 = -979204113;
                    } else {
                        m6981 = (C2105.m6981("ᩴܰ") ^ i7) * 7;
                        i9 = ((m6981 ^ i8) * (-2259)) ^ (-1699581512);
                        i10 = 826335463;
                    }
                case 1816260986:
                case 2146921303:
                    c = 645;
                    if (C21923.m49329()) {
                        m6981 = (C2105.m6981("ᩴܰ") ^ i7) * 7;
                        i9 = ((m6981 ^ i8) * (-2259)) ^ (-1699581512);
                        i10 = 826335463;
                    } else {
                        m6981 = C0630.m2566("᩻ۚ") ^ i8;
                        i9 = ((m6981 ^ i7) * 7241) ^ 600251744;
                        i10 = 1927687653;
                    }
                default:
                    i = s * s2;
                    i2 = s * s;
                    if (C0422.f1886 <= 0) {
                        m6981 = C2105.m6981("ۜܿ") ^ i8;
                        i9 = ((m6981 ^ i7) * (-24197)) ^ 2124661093;
                        i10 = -1763710343;
                    } else {
                        m6981 = (i8 - C2105.m6981("ۙۚ")) * 51;
                        i9 = ((m6981 ^ i7) * (-25835)) ^ 439500581;
                        i10 = -2067018963;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m6659(ViewOnClickListenerC2040 viewOnClickListenerC2040, C19697 c19697, C19119 c19119, C19119 c191192) {
        int i = 57121883;
        int i2 = C0483.f2088;
        int i3 = C4616.f14690;
        int m2566 = (C0630.m2566("ۙܺ") ^ i2) * 101;
        int i4 = ((m2566 ^ i3) * 18565) ^ 1076345105;
        int i5 = 1370771388;
        while (true) {
            i = ((((i ^ i3) * (-24521)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -1938497338:
                case 405144010:
                    if (C0422.m1963()) {
                        m2566 = (C2105.m6981("֫۟") ^ i2) * (-19);
                        i4 = ((m2566 ^ i3) * (-21547)) ^ (-1712434237);
                        i5 = -1336110666;
                    } else {
                        m2566 = C2105.m6981("۬ۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-28771)) ^ (-1103812061);
                        i5 = 1487370711;
                    }
                case -1836834657:
                case 1013786881:
                    if (C11340.f33930 >= 0) {
                        m2566 = C2105.m6981("۬ۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-28771)) ^ (-1103812061);
                        i5 = 1487370711;
                    } else {
                        m2566 = C0630.m2566("᩸۫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-8825)) ^ 1350705536;
                        i5 = 382946056;
                    }
                case -1740936452:
                case 798232197:
                    if (RunnableC1108.f4040) {
                        m2566 = C0630.m2566("᩺ܺ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-8613)) ^ 1758467321;
                        i5 = 1931068308;
                    } else {
                        m2566 = C2105.m6981("۬ۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-28771)) ^ (-1103812061);
                        i5 = 1487370711;
                    }
                case -1701518607:
                case 1299432334:
                    C4159.m12565();
                    break;
                case -1405507177:
                case -927013313:
                    if (C0630.f2410 <= 0) {
                        m2566 = (C2105.m6981("֫۟") ^ i2) * (-19);
                        i4 = ((m2566 ^ i3) * (-21547)) ^ (-1712434237);
                        i5 = -1336110666;
                    } else {
                        m2566 = C0630.m2566("ۤᩴ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-20637)) ^ (-2028110408);
                        i5 = 510311673;
                    }
                case -1346224404:
                case -532128087:
                    if (C3019.f9544 >= 0) {
                        m2566 = C0630.m2566("ᩳܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * 1929) ^ 1114392509;
                        i5 = -1429469908;
                    } else {
                        m2566 = C2105.m6981("ۨ֨") ^ i2;
                        i4 = ((m2566 ^ i3) * (-20835)) ^ (-793519616);
                        i5 = 200323292;
                    }
                case -1291583825:
                case 2064659774:
                    if (C3746.f11829 <= 0) {
                        m2566 = C0630.m2566("ᩳܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * 1929) ^ 1114392509;
                        i5 = -1429469908;
                    } else {
                        m2566 = (C0630.m2566("᩵ۧ") + i2) * q.h;
                        i4 = ((m2566 ^ i3) * 22021) ^ 1874078720;
                        i5 = -485625251;
                    }
                case -1073035907:
                case 757768857:
                    C3911.m11924();
                    if (C4159.f13567) {
                        m2566 = C0630.m2566("᩸᩷") ^ i3;
                        i4 = ((m2566 ^ i2) * (-32187)) ^ 1284360019;
                        i5 = -1137937714;
                    } else {
                        m2566 = C0630.m2566("۫۠") ^ i2;
                        i4 = ((m2566 ^ i3) * (-241)) ^ 709846383;
                        i5 = -1384737458;
                    }
                case -906811784:
                case -822364632:
                    if (C0050.m940() <= 0) {
                        m2566 = C2105.m6981("۬ۡ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-28771)) ^ (-1103812061);
                        i5 = 1487370711;
                    } else {
                        m2566 = C0630.m2566("ᩴۜ") ^ i3;
                        i4 = ((m2566 ^ i2) * 1415) ^ 1669726268;
                        i5 = -1782900089;
                    }
                case -724353761:
                case 1135809992:
                    viewOnClickListenerC2040.m6663(c19697, c19119, c191192);
                    break;
                case -524784811:
                case 1488100342:
                    if (C3683.f11629 >= 0) {
                        m2566 = C0630.m2566("۫۠") ^ i2;
                        i4 = ((m2566 ^ i3) * (-241)) ^ 709846383;
                        i5 = -1384737458;
                    } else {
                        m2566 = (i2 - C0630.m2566("ܺ֨")) * (-59);
                        i4 = ((m2566 ^ i3) * 29201) ^ 16969098;
                        i5 = -258707909;
                    }
                case -275664671:
                case 1669624402:
                    if (C2167.m7155()) {
                        m2566 = C0630.m2566("ᩳܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * 1929) ^ 1114392509;
                        i5 = -1429469908;
                    } else {
                        m2566 = (C2105.m6981("۫᩵") + i3) * (-125);
                        i4 = ((m2566 ^ i2) * (-22087)) ^ 1669543596;
                        i5 = 979015547;
                    }
                case 348023519:
                case 2115795554:
                    if (C0237.f1507 != 0) {
                        m2566 = C0630.m2566("۫۠") ^ i2;
                        i4 = ((m2566 ^ i3) * (-241)) ^ 709846383;
                        i5 = -1384737458;
                    } else {
                        m2566 = (C2105.m6981("֫۟") ^ i2) * (-19);
                        i4 = ((m2566 ^ i3) * (-21547)) ^ (-1712434237);
                        i5 = -1336110666;
                    }
                case 383329564:
                case 389123225:
                    if (C21923.m49329()) {
                        m2566 = (C2105.m6981("֫۟") ^ i2) * (-19);
                        i4 = ((m2566 ^ i3) * (-21547)) ^ (-1712434237);
                        i5 = -1336110666;
                    } else {
                        m2566 = C0630.m2566("ۗۗ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-20119)) ^ 296387358;
                        i5 = -957130103;
                    }
                case 1603081917:
                case 1918180888:
                    C3432.m10477();
                    m2566 = C0630.m2566("᩸᩷") ^ i3;
                    i4 = ((m2566 ^ i2) * (-32187)) ^ 1284360019;
                    i5 = -1137937714;
                default:
                    if (C3663.f11553) {
                        m2566 = (C2105.m6981("֫۟") ^ i2) * (-19);
                        i4 = ((m2566 ^ i3) * (-21547)) ^ (-1712434237);
                        i5 = -1336110666;
                    } else {
                        m2566 = C0630.m2566("ܶ֨") ^ i3;
                        i4 = ((m2566 ^ i2) * (-31229)) ^ (-426940851);
                        i5 = -1270932627;
                    }
            }
            return;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6681(ViewOnClickListenerC2040 viewOnClickListenerC2040, String str) {
        EditText editText = null;
        EditText editText2 = null;
        int i = 1683332979;
        int i2 = C3911.f12484;
        int i3 = C0483.f2088;
        int m6981 = C2105.m6981("֡֨") ^ i3;
        int i4 = ((m6981 ^ i2) * (-10149)) ^ (-409217880);
        int i5 = 1884041954;
        while (true) {
            i = ((((i ^ i2) * 32133) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2132315166:
                case 1573994371:
                    editText = viewOnClickListenerC2040.f6832;
                    if (editText != null) {
                        m6981 = (C2105.m6981("ۛۜ") + i3) * (-73);
                        i4 = ((m6981 ^ i2) * 13973) ^ (-576657830);
                        i5 = 1194460149;
                    } else {
                        m6981 = (i2 - C0630.m2566("᩵۫")) * (-29);
                        i4 = ((m6981 ^ i3) * 22683) ^ (-124771414);
                        i5 = 833363529;
                    }
                case -1597634016:
                case 1127496470:
                    if (C4117.f13076 <= 0) {
                        m6981 = (C2105.m6981("۠֫") + i3) * 109;
                        i4 = ((m6981 ^ i2) * (-32725)) ^ 1004549233;
                        i5 = -1252861345;
                    } else {
                        m6981 = C0630.m2566("ۖܺ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-24109)) ^ 1635002247;
                        i5 = -204687108;
                    }
                case -1547465355:
                case 1897488713:
                    if (C2958.f9394 < 0) {
                        m6981 = (i2 - C2105.m6981("᩷ᩳ")) * 39;
                        i4 = ((m6981 ^ i3) * 24031) ^ (-1086426071);
                        i5 = -308134075;
                    } else {
                        m6981 = C0630.m2566("ᩳ۬") ^ i2;
                        i4 = ((m6981 ^ i3) * (-215)) ^ 810885288;
                        i5 = -929220321;
                    }
                case -1351626554:
                case 539627781:
                    if (C5695.f17556 >= 0) {
                        m6981 = (i3 - C2105.m6981("ۛۚ")) * (-29);
                        i4 = ((m6981 ^ i2) * (-9771)) ^ 890332457;
                        i5 = -93033037;
                    } else {
                        m6981 = C2105.m6981("᩹ۨ") ^ i3;
                        i4 = ((m6981 ^ i2) * 3237) ^ 1753052547;
                        i5 = -1394219719;
                    }
                case -1220928023:
                case -25735175:
                    if (C1504.f5354) {
                        m6981 = C0630.m2566("ᩳ۬") ^ i2;
                        i4 = ((m6981 ^ i3) * (-215)) ^ 810885288;
                        i5 = -929220321;
                    } else {
                        m6981 = C2105.m6981("ܺ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * (-20017)) ^ (-1792812662);
                        i5 = -1371878090;
                    }
                case -1044646166:
                case 1385631767:
                    C7106.m19120();
                    C0237.m1481();
                    m6981 = (i3 - C2105.m6981("ۛۚ")) * (-29);
                    i4 = ((m6981 ^ i2) * (-9771)) ^ 890332457;
                    i5 = -93033037;
                case -722207272:
                case 1525748307:
                    if (C2272.m7503()) {
                        m6981 = C2105.m6981("ܺ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * (-20017)) ^ (-1792812662);
                        i5 = -1371878090;
                    } else {
                        m6981 = (C2105.m6981("ۜܽ") + i3) * (-57);
                        i4 = ((m6981 ^ i2) * 32367) ^ 1567258617;
                        i5 = -1521419458;
                    }
                case -472799909:
                case 1131181791:
                    C0630.m2564();
                    C11340.m28031();
                    break;
                case -436122702:
                case 1651108596:
                    editText2.setSelection(C1047.m3600(editText2));
                    m6981 = (i2 - C0630.m2566("᩵۫")) * (-29);
                    i4 = ((m6981 ^ i3) * 22683) ^ (-124771414);
                    i5 = 833363529;
                case -407833644:
                case -384925868:
                    break;
                case -195975056:
                case 472329594:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = (i2 - C2105.m6981("᩷ᩳ")) * 39;
                        i4 = ((m6981 ^ i3) * 24031) ^ (-1086426071);
                        i5 = -308134075;
                    } else {
                        m6981 = C0630.m2566("ۖᩴ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-28871)) ^ (-802634850);
                        i5 = -1843374182;
                    }
                case -174055678:
                case 82523452:
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = (C2105.m6981("۠֫") + i3) * 109;
                        i4 = ((m6981 ^ i2) * (-32725)) ^ 1004549233;
                        i5 = -1252861345;
                    } else {
                        m6981 = C2105.m6981("۫ۨ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-1605)) ^ 150190591;
                        i5 = 1176891752;
                    }
                case 134444493:
                case 296366560:
                    if (C0964.m3413()) {
                        m6981 = C2105.m6981("۠֡") ^ i2;
                        i4 = ((m6981 ^ i3) * 28049) ^ 819765580;
                        i5 = -1139609977;
                    } else {
                        m6981 = C2105.m6981("ܺ᩶") ^ i3;
                        i4 = ((m6981 ^ i2) * (-20017)) ^ (-1792812662);
                        i5 = -1371878090;
                    }
                case 429910409:
                case 549720270:
                    RunnableC1937.m6377(editText, str);
                    editText2 = viewOnClickListenerC2040.f6832;
                    if (C4117.f13076 <= 0) {
                        m6981 = (C2105.m6981("۠֫") + i3) * 109;
                        i4 = ((m6981 ^ i2) * (-32725)) ^ 1004549233;
                        i5 = -1252861345;
                    } else {
                        m6981 = (C0630.m2566("᩸ۢ") + i2) * (-69);
                        i4 = ((m6981 ^ i3) * 19007) ^ (-2062327812);
                        i5 = 635892599;
                    }
                case 753874395:
                case 1474207338:
                    if (C0714.m2805()) {
                        m6981 = C0630.m2566("᩵᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * (-6029)) ^ 2044866056;
                        i5 = 1606904644;
                    } else {
                        m6981 = (C2105.m6981("۠֫") + i3) * 109;
                        i4 = ((m6981 ^ i2) * (-32725)) ^ 1004549233;
                        i5 = -1252861345;
                    }
                case 779953619:
                case 1658071388:
                    if (C21923.f70183 != 0) {
                        m6981 = (i3 - C2105.m6981("ۛۚ")) * (-29);
                        i4 = ((m6981 ^ i2) * (-9771)) ^ 890332457;
                        i5 = -93033037;
                    } else {
                        m6981 = (i2 - C2105.m6981("᩷ᩳ")) * 39;
                        i4 = ((m6981 ^ i3) * 24031) ^ (-1086426071);
                        i5 = -308134075;
                    }
                case 1942325429:
                case 2043812011:
                    if (C0382.m1848()) {
                        m6981 = (C2105.m6981("۠֫") + i3) * 109;
                        i4 = ((m6981 ^ i2) * (-32725)) ^ 1004549233;
                        i5 = -1252861345;
                    } else {
                        m6981 = C2105.m6981("ۧܽ") ^ i2;
                        i4 = ((m6981 ^ i3) * 17703) ^ 1400208106;
                        i5 = 313676627;
                    }
                default:
                    if (C1773.f6144 <= 0) {
                        m6981 = (C2105.m6981("۠֫") + i3) * 109;
                        i4 = ((m6981 ^ i2) * (-32725)) ^ 1004549233;
                        i5 = -1252861345;
                    } else {
                        m6981 = (C2105.m6981("ۖ۬") + i3) * (-121);
                        i4 = ((m6981 ^ i2) * (-8841)) ^ 283805595;
                        i5 = -1773217649;
                    }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        if (l.C1916.f6442 != false) goto L18;
     */
    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6697() {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6697():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (l.C1005.f3721 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ea, code lost:
    
        r6 = l.C0630.m2566("۬ܿ") ^ r5;
        r7 = ((r6 ^ r4) * (-25545)) ^ 1805816819;
        r8 = -286112005;
     */
    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6669(final l.ViewOnClickListenerC2040 r10) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6669(l.֫᩵᩷):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (l.C4616.m13552() != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (l.C3432.f10845 >= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (l.C0237.f1507 != 0) goto L18;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6652(l.ViewOnClickListenerC2040 r26, android.widget.EditText r27) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6652(l.֫᩵᩷, android.widget.EditText):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (l.C4075.f12947 >= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (l.ServiceConnectionC3453.f10921 < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnClickListenerC2040() {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.<init>():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6252 m6646(ViewOnClickListenerC2040 viewOnClickListenerC2040, C19119 c19119, C19119 c191192, String str, String str2) {
        int i = -470105244;
        int i2 = RunnableC3474.f10992;
        int i3 = C1420.f5096;
        int m6981 = C2105.m6981("ۜܰ") ^ i2;
        int i4 = ((m6981 ^ i3) * 15937) ^ 24716990;
        int i5 = -1052527932;
        while (true) {
            i = ((((i ^ i3) * (-25229)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1945469055:
                case 206825084:
                    if (C3432.f10845 < 0) {
                        m6981 = C0630.m2566("ܰ۟") ^ i2;
                        i4 = ((m6981 ^ i3) * (-30339)) ^ 1163751683;
                        i5 = 1802272472;
                    } else {
                        m6981 = (C0630.m2566("ۡۤ") ^ i2) * 39;
                        i4 = ((m6981 ^ i3) * 2145) ^ (-1468060539);
                        i5 = -462641329;
                    }
                case -1879483650:
                case -864878858:
                    if (RunnableC1108.f4040) {
                        m6981 = (C2105.m6981("ۡ۠") + i2) * 27;
                        i4 = ((m6981 ^ i3) * (-11995)) ^ (-45713118);
                        i5 = -1847026724;
                    } else {
                        m6981 = C0630.m2566("ܰ۟") ^ i2;
                        i4 = ((m6981 ^ i3) * (-30339)) ^ 1163751683;
                        i5 = 1802272472;
                    }
                case -1599494979:
                case 1038298414:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = C2105.m6981("֨۬") ^ i2;
                        i4 = ((m6981 ^ i3) * (-2213)) ^ 255094223;
                        i5 = -1617157763;
                    } else {
                        m6981 = (C0630.m2566("֨ۛ") ^ i3) * (-11);
                        i4 = ((m6981 ^ i2) * (-29083)) ^ 2030180925;
                        i5 = -102133397;
                    }
                case -1519924394:
                case -499964977:
                    if (C3019.f9544 >= 0) {
                        m6981 = (C2105.m6981("۬ܶ") + i3) * 35;
                        i4 = ((m6981 ^ i2) * 31213) ^ 1692429575;
                        i5 = 1600442323;
                    } else {
                        m6981 = (i3 - C0630.m2566("۠֫")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((m6981 ^ i2) * (-29169)) ^ 928575579;
                        i5 = -905358369;
                    }
                case -1092273912:
                case 576366376:
                    if (C4075.f12947 >= 0) {
                        m6981 = C2105.m6981("ۢܳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 26539) ^ 2099867589;
                        i5 = 1335484793;
                    } else {
                        m6981 = (i2 - C2105.m6981("ܶۖ")) * (-5);
                        i4 = ((m6981 ^ i3) * (-32077)) ^ (-1648610616);
                        i5 = -1291210711;
                    }
                case -1036881064:
                case 1736669994:
                    if (C7106.f21815 != 0) {
                        m6981 = C2105.m6981("֨۬") ^ i2;
                        i4 = ((m6981 ^ i3) * (-2213)) ^ 255094223;
                        i5 = -1617157763;
                    } else {
                        m6981 = C2105.m6981("᩻ۗ") ^ i3;
                        i4 = ((m6981 ^ i2) * 2719) ^ 187940037;
                        i5 = -1982665912;
                    }
                case -904197280:
                case 1384693822:
                    if (C5695.f17556 >= 0) {
                        m6981 = C2105.m6981("ۢܳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 26539) ^ 2099867589;
                        i5 = 1335484793;
                    } else {
                        m6981 = C0630.m2566("ۘ֫") ^ i3;
                        i4 = ((m6981 ^ i2) * (-14477)) ^ (-477861400);
                        i5 = 1543070356;
                    }
                case -457966562:
                case 247729133:
                    C2272.m7503();
                    if (C0483.f2088 < 0) {
                        m6981 = C0630.m2566("ܰ۟") ^ i2;
                        i4 = ((m6981 ^ i3) * (-30339)) ^ 1163751683;
                        i5 = 1802272472;
                    } else {
                        m6981 = (C2105.m6981("۬ܶ") + i3) * 35;
                        i4 = ((m6981 ^ i2) * 31213) ^ 1692429575;
                        i5 = 1600442323;
                    }
                case -274409288:
                case 179432243:
                    if (C5695.m16023() >= 0) {
                        m6981 = (C0630.m2566("ۡۤ") ^ i2) * 39;
                        i4 = ((m6981 ^ i3) * 2145) ^ (-1468060539);
                        i5 = -462641329;
                    } else {
                        m6981 = C2105.m6981("ܶ֫") ^ i2;
                        i4 = ((m6981 ^ i3) * (-27541)) ^ (-1048373212);
                        i5 = 1135644592;
                    }
                case -37403355:
                case 406020307:
                    RunnableC3474.m10618(viewOnClickListenerC2040.f6822);
                    if (C0382.f1805) {
                        m6981 = C0630.m2566("ۖᩴ") ^ i2;
                        i4 = ((m6981 ^ i3) * 31093) ^ 1335262616;
                        i5 = 47326468;
                    } else {
                        m6981 = C2105.m6981("֨۬") ^ i2;
                        i4 = ((m6981 ^ i3) * (-2213)) ^ 255094223;
                        i5 = -1617157763;
                    }
                case -25797996:
                case 179736628:
                    C5695.m16023();
                    if (RunnableC1937.f6483 < 0) {
                        m6981 = (C2105.m6981("۬ܶ") + i3) * 35;
                        i4 = ((m6981 ^ i2) * 31213) ^ 1692429575;
                        i5 = 1600442323;
                    } else {
                        m6981 = C2105.m6981("ۢܳ") ^ i3;
                        i4 = ((m6981 ^ i2) * 26539) ^ 2099867589;
                        i5 = 1335484793;
                    }
                case 47467900:
                case 1664616183:
                    C13307 m10470 = C3430.m10470(c19119, str);
                    AbstractC2021.m6565(viewOnClickListenerC2040.f6815);
                    return new C6252(m10470, C3430.m10470(c191192, str2));
                case 176576218:
                case 386339303:
                    C21923.m49329();
                    C21923.m49329();
                    return null;
                case 408930853:
                case 465475593:
                    C1711.m5736();
                    C2520.m8026();
                    m6981 = C0630.m2566("ܰ۟") ^ i2;
                    i4 = ((m6981 ^ i3) * (-30339)) ^ 1163751683;
                    i5 = 1802272472;
                case 595809746:
                case 1606579393:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = C2105.m6981("֨۬") ^ i2;
                        i4 = ((m6981 ^ i3) * (-2213)) ^ 255094223;
                        i5 = -1617157763;
                    } else {
                        m6981 = C0630.m2566("ܺ᩸") ^ i2;
                        i4 = ((m6981 ^ i3) * 907) ^ (-1456555131);
                        i5 = -1382495963;
                    }
                default:
                    if (C4159.f13567) {
                        m6981 = C2105.m6981("᩻۠") ^ i3;
                        i4 = ((m6981 ^ i2) * 25335) ^ 466286391;
                        i5 = 1615508867;
                    } else {
                        m6981 = (C0630.m2566("ۡۤ") ^ i2) * 39;
                        i4 = ((m6981 ^ i3) * 2145) ^ (-1468060539);
                        i5 = -462641329;
                    }
            }
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, l.ActivityC23809, android.app.Activity, l.InterfaceC2811
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 872759504;
        int i3 = C4117.f13076;
        int i4 = C2167.f7158;
        int m6981 = (C2105.m6981("ܿ᩻") + i3) * 7;
        int i5 = ((m6981 ^ i4) * (-25245)) ^ (-1365239370);
        int i6 = -251061734;
        while (true) {
            i2 = ((((i2 ^ i4) * 13867) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -2051919686:
                case 148890744:
                    C4117.m12364();
                    if (C3245.f10203 <= 0) {
                        m6981 = C0630.m2566("ᩳܿ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-29099)) ^ (-1546195120);
                        i6 = -1251497773;
                    } else {
                        m6981 = C2105.m6981("ۜ֨") ^ i4;
                        i5 = ((m6981 ^ i3) * 32393) ^ (-912484946);
                        i6 = -1823626652;
                    }
                case -2033671474:
                case 88351563:
                    if (C0714.f2697 >= 0) {
                        m6981 = C0630.m2566("ᩳܿ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-29099)) ^ (-1546195120);
                        i6 = -1251497773;
                    } else {
                        m6981 = C2105.m6981("ۧᩴ") ^ i3;
                        i5 = ((m6981 ^ i4) * 24931) ^ (-1297604945);
                        i6 = -653521104;
                    }
                case -1882888710:
                case 473481745:
                    if (C2167.f7158 >= 0) {
                        m6981 = C0630.m2566("֨ۛ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-12967)) ^ (-1678934810);
                        i6 = -1761846859;
                    } else {
                        m6981 = (C2105.m6981("᩻᩶") ^ i4) * (-123);
                        i5 = ((m6981 ^ i3) * (-7025)) ^ 854612648;
                        i6 = -1706728529;
                    }
                case -1367145905:
                case -641207168:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C0630.m2566("ᩳܿ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-29099)) ^ (-1546195120);
                        i6 = -1251497773;
                    } else {
                        m6981 = (C0630.m2566("ۤۖ") + i4) * (-59);
                        i5 = ((m6981 ^ i3) * (-22925)) ^ 1896988304;
                        i6 = -671610472;
                    }
                case -1150670785:
                case 8879744:
                    if (C1916.m6308() >= 0) {
                        m6981 = (C0630.m2566("ۨۢ") ^ i3) * (-39);
                        i5 = ((m6981 ^ i4) * (-29085)) ^ (-1307476933);
                        i6 = 1122269039;
                    } else {
                        m6981 = (C2105.m6981("ۛ۠") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((m6981 ^ i4) * 18651) ^ 1897542441;
                        i6 = -175632281;
                    }
                case -1116692574:
                case 790036604:
                    if (i == 23680) {
                        m6981 = C2105.m6981("ۢۨ") ^ i3;
                        i5 = ((m6981 ^ i4) * 18231) ^ 1900703574;
                        i6 = 135049187;
                    } else {
                        m6981 = C2105.m6981("ܰ᩵") ^ i4;
                        i5 = ((m6981 ^ i3) * 22179) ^ 2032526474;
                        i6 = -589260178;
                    }
                case -1054380918:
                case -675583913:
                    if (C11340.f33930 >= 0) {
                        m6981 = C0630.m2566("ᩳܿ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-29099)) ^ (-1546195120);
                        i6 = -1251497773;
                    } else {
                        m6981 = C0630.m2566("֨ۛ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-12967)) ^ (-1678934810);
                        i6 = -1761846859;
                    }
                case -966324899:
                case 1059253600:
                    if (C1005.f3721) {
                        m6981 = (i3 - C2105.m6981("ܺۤ")) * q.h;
                        i5 = ((m6981 ^ i4) * (-14011)) ^ (-1589947239);
                        i6 = 1915947042;
                    } else {
                        m6981 = C0630.m2566("ᩳܿ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-29099)) ^ (-1546195120);
                        i6 = -1251497773;
                    }
                case -569969347:
                case 1595203558:
                    if (C3683.f11629 >= 0) {
                        m6981 = C0630.m2566("ۜ᩸") ^ i3;
                        i5 = ((m6981 ^ i4) * (-19187)) ^ 2053286180;
                        i6 = -1746003663;
                    } else {
                        m6981 = (C0630.m2566("ܺܰ") + i3) * 127;
                        i5 = ((m6981 ^ i4) * (-18671)) ^ 2068800523;
                        i6 = 560032991;
                    }
                case -475199144:
                case 1660929657:
                    C0050.m940();
                    RunnableC3474.m10630();
                    break;
                case -257424171:
                case 1978405216:
                    if (C1005.f3721) {
                        m6981 = (i4 - C0630.m2566("ܶۖ")) * 57;
                        i5 = ((m6981 ^ i3) * (-18447)) ^ (-1512744326);
                        i6 = -1172890581;
                    } else {
                        m6981 = C2105.m6981("ۜ֨") ^ i4;
                        i5 = ((m6981 ^ i3) * 32393) ^ (-912484946);
                        i6 = -1823626652;
                    }
                case -180586332:
                case 1336566688:
                    if (C2520.f8000 < 0) {
                        m6981 = C0630.m2566("ᩳܿ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-29099)) ^ (-1546195120);
                        i6 = -1251497773;
                    } else {
                        m6981 = (C0630.m2566("ۨۢ") ^ i3) * (-39);
                        i5 = ((m6981 ^ i4) * (-29085)) ^ (-1307476933);
                        i6 = 1122269039;
                    }
                case -16847876:
                case 160330078:
                    if (C22628.f73083 <= 0) {
                        m6981 = C0630.m2566("֨ۛ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-12967)) ^ (-1678934810);
                        i6 = -1761846859;
                    } else {
                        m6981 = (C0630.m2566("ۢ᩻") ^ i3) * 51;
                        i5 = ((m6981 ^ i4) * 22925) ^ (-222015222);
                        i6 = -277925772;
                    }
                case 14030357:
                case 1243347982:
                    C0483.m2121();
                    C1916.m6308();
                    m6981 = C0630.m2566("ᩳܿ") ^ i3;
                    i5 = ((m6981 ^ i4) * (-29099)) ^ (-1546195120);
                    i6 = -1251497773;
                case 52316053:
                case 1590028546:
                    this.f6810 = false;
                    mo1502();
                    break;
                case 95874829:
                case 1374849611:
                    super.onRequestPermissionsResult(i, strArr, iArr);
                    break;
                case 768396139:
                case 1734742041:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m6981 = (C0630.m2566("ۨۢ") ^ i3) * (-39);
                        i5 = ((m6981 ^ i4) * (-29085)) ^ (-1307476933);
                        i6 = 1122269039;
                    } else {
                        m6981 = (C0630.m2566("֡ۨ") ^ i4) * (-25);
                        i5 = ((m6981 ^ i3) * (-30071)) ^ 2000028549;
                        i6 = -1009759252;
                    }
                default:
                    if (C0382.f1805) {
                        m6981 = C2105.m6981("ᩴܺ") ^ i4;
                        i5 = ((m6981 ^ i3) * 25605) ^ 1946416732;
                        i6 = 1648336735;
                    } else {
                        m6981 = C0630.m2566("ۜ᩸") ^ i3;
                        i5 = ((m6981 ^ i4) * (-19187)) ^ 2053286180;
                        i6 = -1746003663;
                    }
            }
            return;
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        short[] sArr;
        int i2;
        int i3;
        short[] sArr2;
        short[] sArr3;
        int m6981;
        int i4;
        int i5;
        int i6;
        int i7;
        int m69812;
        int i8;
        int m2566;
        int i9;
        int i10;
        int m25662;
        int i11;
        int i12;
        short[] sArr4;
        short[] sArr5;
        short[] sArr6;
        int i13;
        int i14;
        int i15;
        ViewOnClickListenerC2040 viewOnClickListenerC2040 = this;
        int i16 = C4117.f13076;
        int i17 = C4616.f14690;
        int m69813 = (i16 - C2105.m6981("ۙܰ")) * (-61);
        int i18 = ((m69813 ^ i17) * 3741) ^ (-1612161937);
        View view = null;
        FloatingActionButton floatingActionButton = null;
        String str = null;
        short[] sArr7 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        int i19 = m69813 ^ 385621290;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        short s = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        FloatingActionButton floatingActionButton2 = null;
        int i29 = 0;
        int i30 = 0;
        int i31 = 1353497949;
        FloatingActionButton floatingActionButton3 = null;
        String str2 = null;
        short[] sArr12 = null;
        int i32 = 0;
        int i33 = 0;
        C9762 c9762 = null;
        C0452 c0452 = null;
        C0452 c04522 = null;
        TabLayout tabLayout = null;
        boolean z = false;
        while (true) {
            i31 = i19 ^ (i18 & (((i31 ^ i17) * 22589) >> 31));
            switch (i31) {
                case -2095444756:
                case 230477118:
                    c0452.m2028(new C9781(viewOnClickListenerC2040));
                    tabLayout.setupWithViewPager(viewOnClickListenerC2040.f6821);
                    c9762 = viewOnClickListenerC2040.f10584;
                    sArr11 = f6807;
                    i20 = 500;
                    if (C2126.f7087) {
                        int i34 = i30;
                        sArr = sArr8;
                        i2 = i29;
                        i3 = i34;
                        short[] sArr13 = sArr9;
                        sArr2 = sArr12;
                        sArr3 = sArr13;
                        int m69814 = (C2105.m6981("ܳۘ") ^ i16) * 11;
                        i4 = ((m69814 ^ i17) * (-25903)) ^ 71842327;
                        i19 = m69814 ^ (-1578637671);
                        i18 = i4;
                        int i35 = i3;
                        i29 = i2;
                        sArr8 = sArr;
                        i30 = i35;
                        short[] sArr14 = sArr2;
                        sArr9 = sArr3;
                        sArr12 = sArr14;
                    } else {
                        m25662 = (C0630.m2566("ۤ֫") ^ i16) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i9 = ((m25662 ^ i17) * 11045) ^ (-1657029851);
                        i11 = -401436754;
                        i19 = m25662 ^ i11;
                        i18 = i9;
                    }
                case -2054332259:
                case 1152099109:
                    int i36 = i20;
                    short[] sArr15 = sArr12;
                    int i37 = i29;
                    int i38 = i30;
                    sArr5 = sArr9;
                    sArr4 = sArr15;
                    view = C0964.m3409(viewOnClickListenerC2040, C0630.m2566(C0483.m2128(sArr15, i37, i38, i21)) ^ 2127566956);
                    int m69815 = C2105.m6981("֡۟") ^ i17;
                    i30 = i38;
                    i29 = i37;
                    i20 = i36;
                    i19 = m69815 ^ 235102327;
                    i18 = ((m69815 ^ i16) * 19545) ^ 1150279304;
                    short[] sArr16 = sArr4;
                    sArr9 = sArr5;
                    sArr12 = sArr16;
                case -1895650257:
                case 655890313:
                    i = i20;
                    int i39 = i30;
                    sArr = sArr8;
                    i2 = i29;
                    i3 = i39;
                    short[] sArr17 = sArr9;
                    sArr2 = sArr12;
                    sArr3 = sArr17;
                    C4263.m12813(viewOnClickListenerC2040, i25 ^ 2100418899);
                    sArr7 = f6807;
                    if (C7106.f21815 == 0) {
                        m6981 = C2105.m6981("ܶܺ") ^ i17;
                        i4 = ((m6981 ^ i16) * 25629) ^ 822926928;
                        i5 = 1275957323;
                        i6 = m6981 ^ i5;
                        i20 = i;
                        i19 = i6;
                        i18 = i4;
                        int i352 = i3;
                        i29 = i2;
                        sArr8 = sArr;
                        i30 = i352;
                        short[] sArr142 = sArr2;
                        sArr9 = sArr3;
                        sArr12 = sArr142;
                    }
                    m6981 = (i17 - C0630.m2566("ܿܶ")) * (-9);
                    i4 = ((m6981 ^ i16) * (-967)) ^ 1934631464;
                    i5 = 1932227797;
                    i6 = m6981 ^ i5;
                    i20 = i;
                    i19 = i6;
                    i18 = i4;
                    int i3522 = i3;
                    i29 = i2;
                    sArr8 = sArr;
                    i30 = i3522;
                    short[] sArr1422 = sArr2;
                    sArr9 = sArr3;
                    sArr12 = sArr1422;
                case -1786327228:
                case -1493947805:
                    i = i20;
                    RunnableC3474.m10625(viewOnClickListenerC2040.f10584, new ViewOnClickListenerC22396(viewOnClickListenerC2040, 2));
                    m2566 = (i16 - C2105.m6981("۠۬")) * (-43);
                    i9 = ((m2566 ^ i17) * 19707) ^ (-1024874760);
                    i10 = -614305053;
                    int i40 = m2566 ^ i10;
                    i20 = i;
                    i19 = i40;
                    i18 = i9;
                case -1778832702:
                case -467392471:
                    tabLayout = (TabLayout) C4263.m12813(viewOnClickListenerC2040, i23 ^ 2119690056);
                    i = i20;
                    str = C4263.m12817(f6807, 497, 3, i21);
                    if (C3746.f11829 > 0) {
                        m2566 = C2105.m6981("ܽۤ") ^ i16;
                        i9 = ((m2566 ^ i17) * (-29981)) ^ 2125658457;
                        i10 = 239086831;
                        int i402 = m2566 ^ i10;
                        i20 = i;
                        i19 = i402;
                        i18 = i9;
                    }
                    m2566 = (i16 - C2105.m6981("ᩴ۬")) * 25;
                    i9 = ((m2566 ^ i17) * (-21739)) ^ (-604098863);
                    i10 = 379054653;
                    int i4022 = m2566 ^ i10;
                    i20 = i;
                    i19 = i4022;
                    i18 = i9;
                case -1557851444:
                case -954938771:
                    i = i20;
                    int i41 = i30;
                    sArr = sArr8;
                    i2 = i29;
                    i3 = i41;
                    short[] sArr18 = sArr9;
                    sArr2 = sArr12;
                    sArr3 = sArr18;
                    i21 = 22267;
                    m6981 = (C2105.m6981("ۢ᩵") ^ i17) * (-77);
                    i4 = ((m6981 ^ i16) * (-323)) ^ 73107286;
                    i5 = 147284431;
                    i6 = m6981 ^ i5;
                    i20 = i;
                    i19 = i6;
                    i18 = i4;
                    int i35222 = i3;
                    i29 = i2;
                    sArr8 = sArr;
                    i30 = i35222;
                    short[] sArr14222 = sArr2;
                    sArr9 = sArr3;
                    sArr12 = sArr14222;
                case -1521111291:
                case -1224653565:
                    i = i20;
                    i7 = i28;
                    int i42 = i30;
                    sArr = sArr8;
                    i2 = i29;
                    i3 = i42;
                    short[] sArr19 = sArr9;
                    sArr2 = sArr12;
                    sArr3 = sArr19;
                    C9762 c97622 = (C9762) C0964.m3409(viewOnClickListenerC2040, i26 ^ i33);
                    viewOnClickListenerC2040.f10584 = c97622;
                    C2272.m7515(viewOnClickListenerC2040, c97622);
                    m69812 = C2105.m6981("ܿ֨") ^ i16;
                    i4 = ((m69812 ^ i17) * 19619) ^ (-909122607);
                    i8 = 1952413493;
                    i6 = m69812 ^ i8;
                    i28 = i7;
                    i20 = i;
                    i19 = i6;
                    i18 = i4;
                    int i352222 = i3;
                    i29 = i2;
                    sArr8 = sArr;
                    i30 = i352222;
                    short[] sArr142222 = sArr2;
                    sArr9 = sArr3;
                    sArr12 = sArr142222;
                case -1464274654:
                case 130632947:
                    i = i20;
                    viewOnClickListenerC2040.f6827 = (FloatingActionButton) C4263.m12813(viewOnClickListenerC2040, i32);
                    sArr10 = f6807;
                    m2566 = C0630.m2566("ܳ֡") ^ i16;
                    i9 = ((m2566 ^ i17) * 26269) ^ 932430810;
                    i10 = -1470931237;
                    int i40222 = m2566 ^ i10;
                    i20 = i;
                    i19 = i40222;
                    i18 = i9;
                case -1436316347:
                case 145763513:
                    i = i20;
                    int i43 = i30;
                    sArr = sArr8;
                    i2 = i29;
                    i3 = i43;
                    short[] sArr20 = sArr9;
                    sArr2 = sArr12;
                    sArr3 = sArr20;
                    i25 = C2105.m6981(C0714.m2816(f6807, 476, 3, i21));
                    m6981 = (C0630.m2566("ۙۙ") ^ i16) * (-123);
                    i4 = ((m6981 ^ i17) * 20355) ^ (-318360433);
                    i5 = -1034999796;
                    i6 = m6981 ^ i5;
                    i20 = i;
                    i19 = i6;
                    i18 = i4;
                    int i3522222 = i3;
                    i29 = i2;
                    sArr8 = sArr;
                    i30 = i3522222;
                    short[] sArr1422222 = sArr2;
                    sArr9 = sArr3;
                    sArr12 = sArr1422222;
                case -1345268539:
                case 1154903226:
                    int i44 = i20;
                    short s2 = f6807[472];
                    int m25663 = C0630.m2566("۟֨") ^ i17;
                    s = s2;
                    i24 = s2 * 15048;
                    i18 = ((m25663 ^ i16) * (-4895)) ^ 1648860013;
                    viewOnClickListenerC2040 = this;
                    i19 = m25663 ^ (-163178320);
                    i20 = i44;
                    i29 = i29;
                    sArr8 = sArr8;
                    i30 = i30;
                    sArr9 = sArr9;
                    sArr12 = sArr12;
                case -1247545507:
                case -565313182:
                    C0237.m1481();
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        i12 = i20;
                        sArr6 = sArr12;
                        sArr5 = sArr9;
                        int m25664 = (C0630.m2566("ۤۙ") + i16) * 45;
                        i14 = ((m25664 ^ i17) * 22195) ^ 1919914282;
                        i15 = m25664 ^ 302586780;
                        sArr9 = sArr5;
                        sArr12 = sArr6;
                        i13 = i12;
                        i19 = i15;
                        i18 = i14;
                        i20 = i13;
                    } else {
                        i = i20;
                        m2566 = (i16 - C2105.m6981("ᩴ۬")) * 25;
                        i9 = ((m2566 ^ i17) * (-21739)) ^ (-604098863);
                        i10 = 379054653;
                        int i402222 = m2566 ^ i10;
                        i20 = i;
                        i19 = i402222;
                        i18 = i9;
                    }
                case -1222276844:
                case 361299713:
                    i = i20;
                    z = true;
                    viewOnClickListenerC2040.f6822 = new C3430(viewOnClickListenerC2040, true);
                    if (C2105.m6982() == 0) {
                        m2566 = C0630.m2566("᩸᩸") ^ i17;
                        i9 = ((m2566 ^ i16) * (-5539)) ^ (-1772073335);
                        i10 = 1383944254;
                        int i4022222 = m2566 ^ i10;
                        i20 = i;
                        i19 = i4022222;
                        i18 = i9;
                    }
                    m2566 = (C0630.m2566("ۙۤ") ^ i17) * (-87);
                    i9 = ((m2566 ^ i16) * (-3789)) ^ (-1405938317);
                    i10 = 1674775166;
                    int i40222222 = m2566 ^ i10;
                    i20 = i;
                    i19 = i40222222;
                    i18 = i9;
                case -1189694947:
                case 1294499514:
                    viewOnClickListenerC2040.f6825.m52055(new C9075(viewOnClickListenerC2040));
                    mo1502();
                    viewOnClickListenerC2040.f6820 = ViewOnClickListenerC19121.m44072(viewOnClickListenerC2040, new C12874(viewOnClickListenerC2040));
                    break;
                case -1169757586:
                case 458210415:
                    C2167.m7155();
                    break;
                case -1114264294:
                case -800709350:
                    if (C2126.f7087) {
                        i12 = i20;
                        sArr6 = sArr12;
                        sArr5 = sArr9;
                        int m256642 = (C0630.m2566("ۤۙ") + i16) * 45;
                        i14 = ((m256642 ^ i17) * 22195) ^ 1919914282;
                        i15 = m256642 ^ 302586780;
                        sArr9 = sArr5;
                        sArr12 = sArr6;
                        i13 = i12;
                        i19 = i15;
                        i18 = i14;
                        i20 = i13;
                    } else {
                        int i342 = i30;
                        sArr = sArr8;
                        i2 = i29;
                        i3 = i342;
                        short[] sArr132 = sArr9;
                        sArr2 = sArr12;
                        sArr3 = sArr132;
                        int m698142 = (C2105.m6981("ܳۘ") ^ i16) * 11;
                        i4 = ((m698142 ^ i17) * (-25903)) ^ 71842327;
                        i19 = m698142 ^ (-1578637671);
                        i18 = i4;
                        int i35222222 = i3;
                        i29 = i2;
                        sArr8 = sArr;
                        i30 = i35222222;
                        short[] sArr14222222 = sArr2;
                        sArr9 = sArr3;
                        sArr12 = sArr14222222;
                    }
                case -1061960420:
                case 1959117310:
                    i = i20;
                    viewOnClickListenerC2040.f6815 = new C3430(viewOnClickListenerC2040, false);
                    i23 = C0630.m2566(C2958.m9031(f6807, 494, 3, i21));
                    m2566 = (C0630.m2566("᩺᩷") ^ i16) * (-127);
                    i9 = ((m2566 ^ i17) * (-3361)) ^ 1931202189;
                    i10 = 356786355;
                    int i402222222 = m2566 ^ i10;
                    i20 = i;
                    i19 = i402222222;
                    i18 = i9;
                case -1039771980:
                case 471924712:
                    i = i20;
                    C2126.m7039(floatingActionButton, viewOnClickListenerC2040);
                    C4159.m12564(viewOnClickListenerC2040.f6813, viewOnClickListenerC2040);
                    C0483.m2125(this);
                    if (RunnableC1937.f6483 >= 0) {
                        int i45 = i30;
                        sArr = sArr8;
                        i2 = i29;
                        i3 = i45;
                        short[] sArr21 = sArr9;
                        sArr2 = sArr12;
                        sArr3 = sArr21;
                        m6981 = (i17 - C0630.m2566("ܿܶ")) * (-9);
                        i4 = ((m6981 ^ i16) * (-967)) ^ 1934631464;
                        i5 = 1932227797;
                        i6 = m6981 ^ i5;
                        i20 = i;
                        i19 = i6;
                        i18 = i4;
                        int i352222222 = i3;
                        i29 = i2;
                        sArr8 = sArr;
                        i30 = i352222222;
                        short[] sArr142222222 = sArr2;
                        sArr9 = sArr3;
                        sArr12 = sArr142222222;
                    } else {
                        m2566 = C0630.m2566("ᩳ۫") ^ i17;
                        i9 = ((m2566 ^ i16) * 28549) ^ (-1818669284);
                        i10 = -1287771300;
                        int i4022222222 = m2566 ^ i10;
                        i20 = i;
                        i19 = i4022222222;
                        i18 = i9;
                    }
                case -813009342:
                case -215632647:
                    i = i20;
                    short[] sArr22 = sArr8;
                    int i46 = i27;
                    i7 = i28;
                    i2 = i29;
                    i3 = i30;
                    short[] sArr23 = sArr9;
                    sArr2 = sArr12;
                    sArr3 = sArr23;
                    sArr = sArr22;
                    floatingActionButton2 = (FloatingActionButton) C4263.m12813(viewOnClickListenerC2040, C0630.m2566(C3432.m10488(sArr22, i46, i7, i21)) ^ 2127493434);
                    m69812 = (i16 - C2105.m6981("ۤ۠")) * 29;
                    i27 = i46;
                    i4 = ((m69812 ^ i17) * (-5005)) ^ 1790686912;
                    i8 = -1910580245;
                    i6 = m69812 ^ i8;
                    i28 = i7;
                    i20 = i;
                    i19 = i6;
                    i18 = i4;
                    int i3522222222 = i3;
                    i29 = i2;
                    sArr8 = sArr;
                    i30 = i3522222222;
                    short[] sArr1422222222 = sArr2;
                    sArr9 = sArr3;
                    sArr12 = sArr1422222222;
                case -788718375:
                case 1391459514:
                    i = i20;
                    int i47 = i30;
                    sArr = sArr8;
                    i2 = i29;
                    i3 = i47;
                    short[] sArr24 = sArr9;
                    sArr2 = sArr12;
                    sArr3 = sArr24;
                    if (i24 - ((s * s) + 56610576) <= 0) {
                        m6981 = (C0630.m2566("ܽᩴ") ^ i16) * (-119);
                        i4 = ((m6981 ^ i17) * (-4317)) ^ (-848851663);
                        i5 = 1869668765;
                    } else {
                        m6981 = (C2105.m6981("ܳ֨") ^ i16) * 75;
                        i4 = ((m6981 ^ i17) * 26927) ^ 499498103;
                        i5 = -1785745550;
                    }
                    i6 = m6981 ^ i5;
                    i20 = i;
                    i19 = i6;
                    i18 = i4;
                    int i35222222222 = i3;
                    i29 = i2;
                    sArr8 = sArr;
                    i30 = i35222222222;
                    short[] sArr14222222222 = sArr2;
                    sArr9 = sArr3;
                    sArr12 = sArr14222222222;
                case -780236770:
                case -61296781:
                    i = i20;
                    int i48 = i30;
                    sArr = sArr8;
                    i2 = i29;
                    i3 = i48;
                    short[] sArr25 = sArr9;
                    sArr2 = sArr12;
                    sArr3 = sArr25;
                    C4263.m12813(viewOnClickListenerC2040, C0630.m2566(str2) ^ 2101905439);
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        i20 = i;
                        int m6981422 = (C2105.m6981("ܳۘ") ^ i16) * 11;
                        i4 = ((m6981422 ^ i17) * (-25903)) ^ 71842327;
                        i19 = m6981422 ^ (-1578637671);
                        i18 = i4;
                        int i352222222222 = i3;
                        i29 = i2;
                        sArr8 = sArr;
                        i30 = i352222222222;
                        short[] sArr142222222222 = sArr2;
                        sArr9 = sArr3;
                        sArr12 = sArr142222222222;
                    } else {
                        m6981 = C2105.m6981("ۡۛ") ^ i17;
                        i4 = ((m6981 ^ i16) * 7111) ^ (-570811945);
                        i5 = 772484707;
                        i6 = m6981 ^ i5;
                        i20 = i;
                        i19 = i6;
                        i18 = i4;
                        int i3522222222222 = i3;
                        i29 = i2;
                        sArr8 = sArr;
                        i30 = i3522222222222;
                        short[] sArr1422222222222 = sArr2;
                        sArr9 = sArr3;
                        sArr12 = sArr1422222222222;
                    }
                case -549556632:
                case 1790355535:
                    i = i20;
                    int i49 = i30;
                    sArr = sArr8;
                    i2 = i29;
                    i3 = i49;
                    short[] sArr26 = sArr9;
                    sArr2 = sArr12;
                    sArr3 = sArr26;
                    short[] sArr27 = sArr7;
                    i26 = C0630.m2566(RunnableC3474.m10633(sArr27, 479, 3, i21));
                    i33 = 2123628830;
                    int m69816 = (C2105.m6981("ۡ᩵") ^ i17) * 101;
                    i4 = ((m69816 ^ i16) * 19159) ^ (-834473181);
                    i6 = m69816 ^ (-493933119);
                    sArr7 = sArr27;
                    i20 = i;
                    i19 = i6;
                    i18 = i4;
                    int i35222222222222 = i3;
                    i29 = i2;
                    sArr8 = sArr;
                    i30 = i35222222222222;
                    short[] sArr14222222222222 = sArr2;
                    sArr9 = sArr3;
                    sArr12 = sArr14222222222222;
                case -129086154:
                case 1485394191:
                    c04522 = (C0452) C0964.m3409(viewOnClickListenerC2040, C2105.m6981(str) ^ 2127706226);
                    m25662 = C2105.m6981("ۛܶ") ^ i17;
                    i9 = ((m25662 ^ i16) * 2643) ^ (-1364497798);
                    i11 = 1999859260;
                    i19 = m25662 ^ i11;
                    i18 = i9;
                case -125328364:
                case 1307006745:
                    i = i20;
                    int i50 = i30;
                    sArr = sArr8;
                    i2 = i29;
                    i3 = i50;
                    short[] sArr28 = sArr9;
                    sArr2 = sArr12;
                    sArr3 = sArr28;
                    i21 = 48840;
                    m6981 = (C2105.m6981("ۢ᩵") ^ i17) * (-77);
                    i4 = ((m6981 ^ i16) * (-323)) ^ 73107286;
                    i5 = 147284431;
                    i6 = m6981 ^ i5;
                    i20 = i;
                    i19 = i6;
                    i18 = i4;
                    int i352222222222222 = i3;
                    i29 = i2;
                    sArr8 = sArr;
                    i30 = i352222222222222;
                    short[] sArr142222222222222 = sArr2;
                    sArr9 = sArr3;
                    sArr12 = sArr142222222222222;
                case -27820778:
                case 462906302:
                    i12 = i20;
                    short[] sArr29 = sArr9;
                    i32 = C2105.m6981(C2520.m8030(sArr29, i22, 3, i21)) ^ 2098353338;
                    int m69817 = C2105.m6981("۠۠") ^ i17;
                    i14 = ((m69817 ^ i16) * 23951) ^ (-569298600);
                    i15 = m69817 ^ (-1912343582);
                    sArr9 = sArr29;
                    i13 = i12;
                    i19 = i15;
                    i18 = i14;
                    i20 = i13;
                case -23453518:
                case 1799765709:
                    i = i20;
                    floatingActionButton3 = (FloatingActionButton) C0964.m3409(viewOnClickListenerC2040, C0630.m2566(C22628.m50602(sArr10, 491, 3, i21)) ^ 2124307777);
                    if (C3432.f10845 < 0) {
                        m2566 = (C2105.m6981("ܿ᩹") + i16) * 5;
                        i9 = ((m2566 ^ i17) * 31947) ^ 665879601;
                        i10 = -1501666277;
                        int i40222222222 = m2566 ^ i10;
                        i20 = i;
                        i19 = i40222222222;
                        i18 = i9;
                    }
                    m2566 = (C0630.m2566("ۙۤ") ^ i17) * (-87);
                    i9 = ((m2566 ^ i16) * (-3789)) ^ (-1405938317);
                    i10 = 1674775166;
                    int i402222222222 = m2566 ^ i10;
                    i20 = i;
                    i19 = i402222222222;
                    i18 = i9;
                case 173914649:
                case 1520652596:
                    i12 = i20;
                    FloatingActionButton floatingActionButton4 = floatingActionButton2;
                    sArr5 = sArr9;
                    viewOnClickListenerC2040.f6817 = floatingActionButton4;
                    sArr6 = f6807;
                    i29 = 485;
                    i30 = 3;
                    if (C1047.f3863 >= 0) {
                        floatingActionButton2 = floatingActionButton4;
                        int m2566422 = (C0630.m2566("ۤۙ") + i16) * 45;
                        i14 = ((m2566422 ^ i17) * 22195) ^ 1919914282;
                        i15 = m2566422 ^ 302586780;
                        sArr9 = sArr5;
                        sArr12 = sArr6;
                        i13 = i12;
                        i19 = i15;
                        i18 = i14;
                        i20 = i13;
                    } else {
                        int m69818 = (C2105.m6981("ۢۘ") ^ i17) * 31;
                        floatingActionButton2 = floatingActionButton4;
                        i18 = ((m69818 ^ i16) * (-32407)) ^ 1333821709;
                        sArr9 = sArr5;
                        sArr12 = sArr6;
                        i13 = i12;
                        i19 = m69818 ^ (-200345361);
                        i20 = i13;
                    }
                case 273378665:
                case 1367894855:
                    viewOnClickListenerC2040.f6821 = c04522;
                    c04522.m2029(new C21070(viewOnClickListenerC2040));
                    c0452 = viewOnClickListenerC2040.f6821;
                    m25662 = (C0630.m2566("ۤܿ") + i17) * (-71);
                    i9 = ((m25662 ^ i16) * 19121) ^ (-1787602250);
                    i11 = -1027738385;
                    i19 = m25662 ^ i11;
                    i18 = i9;
                case 394954974:
                case 1748834584:
                    i = i20;
                    viewOnClickListenerC2040.f6813 = floatingActionButton3;
                    C4159.m12564(viewOnClickListenerC2040.f6817, viewOnClickListenerC2040);
                    C2126.m7039(viewOnClickListenerC2040.f6833, viewOnClickListenerC2040);
                    floatingActionButton = viewOnClickListenerC2040.f6827;
                    m2566 = (C0630.m2566("ܽ۟") + i17) * (-111);
                    i9 = ((m2566 ^ i16) * 15107) ^ (-1210823469);
                    i10 = 671537866;
                    int i4022222222222 = m2566 ^ i10;
                    i20 = i;
                    i19 = i4022222222222;
                    i18 = i9;
                case 580258779:
                case 1249575744:
                    i = i20;
                    i7 = i28;
                    int i51 = i30;
                    sArr = sArr8;
                    i2 = i29;
                    i3 = i51;
                    short[] sArr30 = sArr9;
                    sArr2 = sArr12;
                    sArr3 = sArr30;
                    C11815 onBackPressedDispatcher = getOnBackPressedDispatcher();
                    C8369 c8369 = new C8369(viewOnClickListenerC2040);
                    RunnableC3474.m10618(onBackPressedDispatcher);
                    onBackPressedDispatcher.m28891(c8369);
                    m69812 = C2105.m6981("ܺ᩷") ^ i16;
                    i4 = ((m69812 ^ i17) * (-30975)) ^ 842404790;
                    i8 = 1815655330;
                    i6 = m69812 ^ i8;
                    i28 = i7;
                    i20 = i;
                    i19 = i6;
                    i18 = i4;
                    int i3522222222222222 = i3;
                    i29 = i2;
                    sArr8 = sArr;
                    i30 = i3522222222222222;
                    short[] sArr1422222222222222 = sArr2;
                    sArr9 = sArr3;
                    sArr12 = sArr1422222222222222;
                case 601212262:
                case 1366645894:
                    i = i20;
                    int i52 = i30;
                    sArr = sArr8;
                    i2 = i29;
                    i3 = i52;
                    short[] sArr31 = sArr9;
                    sArr2 = sArr12;
                    sArr3 = sArr31;
                    super.onCreate(bundle);
                    m10214();
                    str2 = C4159.m12578(f6807, 473, 3, i21);
                    m6981 = (C2105.m6981("֨ܽ") ^ i16) * (-31);
                    i4 = ((m6981 ^ i17) * (-17187)) ^ 240072007;
                    i5 = -1394790932;
                    i6 = m6981 ^ i5;
                    i20 = i;
                    i19 = i6;
                    i18 = i4;
                    int i35222222222222222 = i3;
                    i29 = i2;
                    sArr8 = sArr;
                    i30 = i35222222222222222;
                    short[] sArr14222222222222222 = sArr2;
                    sArr9 = sArr3;
                    sArr12 = sArr14222222222222222;
                case 683150313:
                case 1537547696:
                    i = i20;
                    viewOnClickListenerC2040.f6833 = (FloatingActionButton) view;
                    sArr9 = f6807;
                    i22 = 488;
                    if (C1005.f3721) {
                        m2566 = C0630.m2566("ܿۤ") ^ i16;
                        i9 = ((m2566 ^ i17) * (-18431)) ^ (-677704374);
                        i10 = -1466040268;
                        int i40222222222222 = m2566 ^ i10;
                        i20 = i;
                        i19 = i40222222222222;
                        i18 = i9;
                    } else {
                        i20 = i;
                        int i3422 = i30;
                        sArr = sArr8;
                        i2 = i29;
                        i3 = i3422;
                        short[] sArr1322 = sArr9;
                        sArr2 = sArr12;
                        sArr3 = sArr1322;
                        int m69814222 = (C2105.m6981("ܳۘ") ^ i16) * 11;
                        i4 = ((m69814222 ^ i17) * (-25903)) ^ 71842327;
                        i19 = m69814222 ^ (-1578637671);
                        i18 = i4;
                        int i352222222222222222 = i3;
                        i29 = i2;
                        sArr8 = sArr;
                        i30 = i352222222222222222;
                        short[] sArr142222222222222222 = sArr2;
                        sArr9 = sArr3;
                        sArr12 = sArr142222222222222222;
                    }
                case 988926840:
                case 1012905172:
                    i12 = i20;
                    int i53 = i29;
                    int i54 = i30;
                    short[] sArr32 = sArr9;
                    sArr4 = sArr12;
                    sArr5 = sArr32;
                    short[] sArr33 = f6807;
                    i27 = 482;
                    i28 = 3;
                    if (C4075.f12947 >= 0) {
                        i30 = i54;
                        sArr6 = sArr4;
                        i29 = i53;
                        sArr8 = sArr33;
                        int m25664222 = (C0630.m2566("ۤۙ") + i16) * 45;
                        i14 = ((m25664222 ^ i17) * 22195) ^ 1919914282;
                        i15 = m25664222 ^ 302586780;
                        sArr9 = sArr5;
                        sArr12 = sArr6;
                        i13 = i12;
                        i19 = i15;
                        i18 = i14;
                        i20 = i13;
                    } else {
                        int m25665 = C0630.m2566("֫᩹") ^ i17;
                        i30 = i54;
                        i29 = i53;
                        sArr8 = sArr33;
                        i18 = ((m25665 ^ i16) * 13963) ^ 77161752;
                        i20 = i12;
                        i19 = m25665 ^ (-382639444);
                        short[] sArr162 = sArr4;
                        sArr9 = sArr5;
                        sArr12 = sArr162;
                    }
                case 1105827022:
                case 1230790603:
                    C23592 c23592 = (C23592) C1005.m3507(c9762, C2105.m6981(C0630.m2575(sArr11, i20, 3, i21)) ^ 2129127524);
                    viewOnClickListenerC2040.f6825 = c23592;
                    c23592.m52056(z);
                    m25662 = (C0630.m2566("֫ۖ") + i17) * (-99);
                    i9 = ((m25662 ^ i16) * 14195) ^ 323634735;
                    i11 = -1140526622;
                    i19 = m25662 ^ i11;
                    i18 = i9;
                case 1402991728:
                case 1928219806:
                    C0798.m2998();
                    C1504.m5179();
                    int i34222 = i30;
                    sArr = sArr8;
                    i2 = i29;
                    i3 = i34222;
                    short[] sArr13222 = sArr9;
                    sArr2 = sArr12;
                    sArr3 = sArr13222;
                    int m698142222 = (C2105.m6981("ܳۘ") ^ i16) * 11;
                    i4 = ((m698142222 ^ i17) * (-25903)) ^ 71842327;
                    i19 = m698142222 ^ (-1578637671);
                    i18 = i4;
                    int i3522222222222222222 = i3;
                    i29 = i2;
                    sArr8 = sArr;
                    i30 = i3522222222222222222;
                    short[] sArr1422222222222222222 = sArr2;
                    sArr9 = sArr3;
                    sArr12 = sArr1422222222222222222;
                default:
                    RunnableC1937.m6387();
                    if (C11340.f33930 >= 0) {
                        i12 = i20;
                        sArr6 = sArr12;
                        sArr5 = sArr9;
                        int m256642222 = (C0630.m2566("ۤۙ") + i16) * 45;
                        i14 = ((m256642222 ^ i17) * 22195) ^ 1919914282;
                        i15 = m256642222 ^ 302586780;
                        sArr9 = sArr5;
                        sArr12 = sArr6;
                        i13 = i12;
                        i19 = i15;
                        i18 = i14;
                        i20 = i13;
                    } else {
                        i = i20;
                        int i452 = i30;
                        sArr = sArr8;
                        i2 = i29;
                        i3 = i452;
                        short[] sArr212 = sArr9;
                        sArr2 = sArr12;
                        sArr3 = sArr212;
                        m6981 = (i17 - C0630.m2566("ܿܶ")) * (-9);
                        i4 = ((m6981 ^ i16) * (-967)) ^ 1934631464;
                        i5 = 1932227797;
                        i6 = m6981 ^ i5;
                        i20 = i;
                        i19 = i6;
                        i18 = i4;
                        int i35222222222222222222 = i3;
                        i29 = i2;
                        sArr8 = sArr;
                        i30 = i35222222222222222222;
                        short[] sArr14222222222222222222 = sArr2;
                        sArr9 = sArr3;
                        sArr12 = sArr14222222222222222222;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c5, code lost:
    
        r14 = (l.C0630.m2566("᩶᩵") + r12) * 57;
        r15 = ((r14 ^ r13) * 9931) ^ 1928870998;
        r16 = 1867505889;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0042, code lost:
    
        r14 = (r13 - l.C0630.m2566("᩹ۗ")) * 71;
        r15 = ((r14 ^ r12) * 23947) ^ 1328065930;
        r16 = -1618238534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0060, code lost:
    
        if (l.ViewOnClickListenerC1958.m6429() < 0) goto L14;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m6682(l.ViewOnClickListenerC2040 r18, l.C4841 r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6682(l.֫᩵᩷, l.ۙᩴ᩷, java.lang.String):void");
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onStop() {
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        AtomicInteger atomicInteger = null;
        int i = 1782361724;
        int i2 = RunnableC3474.f10992;
        int i3 = C3537.f11231;
        int m2566 = C0630.m2566("֫᩵") ^ i2;
        int i4 = ((m2566 ^ i3) * (-4431)) ^ (-127459136);
        int i5 = -958742818;
        while (true) {
            i = ((((i ^ i3) * (-339)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2140440590:
                case -2080423629:
                    if (C1916.m6308() >= 0) {
                        m2566 = C2105.m6981("ܺۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-3363)) ^ (-151553192);
                        i5 = -134129879;
                    } else {
                        m2566 = (C2105.m6981("᩸ܺ") + i3) * 65;
                        i4 = ((m2566 ^ i2) * 7663) ^ (-632879962);
                        i5 = 430952148;
                    }
                case -1890438001:
                case 2068373976:
                    super.onStop();
                    break;
                case -1753256911:
                case 1499563480:
                    if (C0050.f910 >= 0) {
                        m2566 = (i2 - C0630.m2566("֨֡")) * (-9);
                        i4 = ((m2566 ^ i3) * 7963) ^ (-1737939204);
                        i5 = -1049903368;
                    } else {
                        m2566 = (i2 - C0630.m2566("֨۠")) * (-27);
                        i4 = ((m2566 ^ i3) * (-15591)) ^ (-2022205311);
                        i5 = -69574132;
                    }
                case -1740549834:
                case 1322400412:
                    C3663.m11167(dialogInterfaceC0206);
                    m2566 = C2105.m6981("ۘܺ") ^ i3;
                    i4 = ((m2566 ^ i2) * (-22725)) ^ (-1443492341);
                    i5 = -341066305;
                case -1737684908:
                case -808999882:
                    if (C4075.m12263() <= 0) {
                        m2566 = C2105.m6981("ܺۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-3363)) ^ (-151553192);
                        i5 = -134129879;
                    } else {
                        m2566 = (i3 - C2105.m6981("᩵᩺")) * (-21);
                        i4 = ((m2566 ^ i2) * (-12975)) ^ (-1917097120);
                        i5 = -22956980;
                    }
                case -1659409968:
                case -1553140876:
                    if (C1773.m5913(dialogInterfaceC0206)) {
                        m2566 = C2105.m6981("᩹ۗ") ^ i2;
                        i4 = ((m2566 ^ i3) * 30201) ^ 1473822843;
                        i5 = 792448079;
                    } else {
                        m2566 = C2105.m6981("ۘܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-22725)) ^ (-1443492341);
                        i5 = -341066305;
                    }
                case -1489979047:
                case 1304504100:
                    if (isChangingConfigurations()) {
                        m2566 = C0630.m2566("ܺۜ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-16207)) ^ (-341414110);
                        i5 = -1427043472;
                    } else {
                        m2566 = (C2105.m6981("֡᩵") ^ i2) * 57;
                        i4 = ((m2566 ^ i3) * 551) ^ 1113866359;
                        i5 = 1057572209;
                    }
                case -1404549875:
                case -43070216:
                    if (C1504.f5354) {
                        m2566 = C2105.m6981("ܺۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-3363)) ^ (-151553192);
                        i5 = -134129879;
                    } else {
                        m2566 = (i2 - C2105.m6981("۬֡")) * 101;
                        i4 = ((m2566 ^ i3) * (-17293)) ^ (-1063242636);
                        i5 = 1854660718;
                    }
                case -1373231515:
                case 414420049:
                    C1773.m5908();
                    if (C1916.f6442) {
                        m2566 = C0630.m2566("᩵ܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * 25971) ^ 1422899228;
                        i5 = -155080565;
                    } else {
                        m2566 = C2105.m6981("ܺۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-3363)) ^ (-151553192);
                        i5 = -134129879;
                    }
                case -1336048226:
                case 1818155185:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = C0630.m2566("᩵ܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * 25971) ^ 1422899228;
                        i5 = -155080565;
                    } else {
                        m2566 = (C0630.m2566("ۤܽ") + i3) * 91;
                        i4 = ((m2566 ^ i2) * 20863) ^ 380075729;
                        i5 = 559782524;
                    }
                case -1334792768:
                case -442405617:
                    if (C0483.m2121()) {
                        m2566 = (C2105.m6981("ܿۨ") ^ i2) * 25;
                        i4 = ((m2566 ^ i3) * (-24343)) ^ 916880718;
                        i5 = -1593901071;
                    } else {
                        m2566 = C2105.m6981("ۛ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2007)) ^ 357329205;
                        i5 = 2035920642;
                    }
                case -866121494:
                case 1336844116:
                    if (C11340.m28031()) {
                        m2566 = C2105.m6981("ۛ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2007)) ^ 357329205;
                        i5 = 2035920642;
                    } else {
                        m2566 = C2105.m6981("ܺۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-3363)) ^ (-151553192);
                        i5 = -134129879;
                    }
                case -618006871:
                case 1085868176:
                    C7106.m19106(atomicInteger);
                    C7106.m19106(this.f6819);
                    m2566 = C0630.m2566("ܺۜ") ^ i3;
                    i4 = ((m2566 ^ i2) * (-16207)) ^ (-341414110);
                    i5 = -1427043472;
                case -233671264:
                case 289817674:
                    dialogInterfaceC0206 = this.f6828;
                    if (dialogInterfaceC0206 != null) {
                        m2566 = (i2 - C2105.m6981("᩶۫")) * (-49);
                        i4 = ((m2566 ^ i3) * 5621) ^ (-1344374130);
                        i5 = -507509636;
                    } else {
                        m2566 = C2105.m6981("ۘܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-22725)) ^ (-1443492341);
                        i5 = -341066305;
                    }
                case 662413225:
                case 1418649224:
                    C1047.m3599();
                    C4616.m13552();
                    m2566 = C2105.m6981("ܺۚ") ^ i3;
                    i4 = ((m2566 ^ i2) * (-3363)) ^ (-151553192);
                    i5 = -134129879;
                case 699972995:
                case 1961462224:
                    C21923.m49329();
                    C1711.m5736();
                    break;
                case 755678011:
                case 974285463:
                    this.f6831 = true;
                    if (C7106.f21815 != 0) {
                        m2566 = C2105.m6981("ۛ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2007)) ^ 357329205;
                        i5 = 2035920642;
                    } else {
                        m2566 = C0630.m2566("᩹ۚ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29545)) ^ 463256293;
                        i5 = -778478612;
                    }
                case 790684277:
                case 1554475845:
                    if (C3663.m11168() >= 0) {
                        m2566 = C2105.m6981("ܺۚ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-3363)) ^ (-151553192);
                        i5 = -134129879;
                    } else {
                        m2566 = (C0630.m2566("ܿܳ") ^ i3) * 5;
                        i4 = ((m2566 ^ i2) * 30221) ^ (-522743618);
                        i5 = -1731531292;
                    }
                case 850838843:
                case 1067777185:
                    atomicInteger = this.f6826;
                    if (C3746.f11829 <= 0) {
                        m2566 = (C0630.m2566("ۨ᩶") + i3) * (-85);
                        i4 = ((m2566 ^ i2) * 15653) ^ 135477040;
                        i5 = 2039578590;
                    } else {
                        m2566 = C2105.m6981("᩸᩶") ^ i3;
                        i4 = ((m2566 ^ i2) * 12691) ^ 842336866;
                        i5 = 177452061;
                    }
                case 1469441189:
                case 1561920783:
                    if (C2167.m7155()) {
                        m2566 = C2105.m6981("ۛ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2007)) ^ 357329205;
                        i5 = 2035920642;
                    } else {
                        m2566 = (C2105.m6981("᩺۫") + i2) * (-23);
                        i4 = ((m2566 ^ i3) * 10515) ^ 1318142883;
                        i5 = -2084524784;
                    }
                default:
                    C1504.m5179();
                    if (C0798.f2919) {
                        m2566 = (i2 - C0630.m2566("֨֡")) * (-9);
                        i4 = ((m2566 ^ i3) * 7963) ^ (-1737939204);
                        i5 = -1049903368;
                    } else {
                        m2566 = C2105.m6981("ۛ᩹") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2007)) ^ 357329205;
                        i5 = 2035920642;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x01aa, code lost:
    
        r11 = l.C0630.m2566("ۤܽ") ^ r10;
        r12 = ((r11 ^ r9) * (-12293)) ^ (-1647365828);
        r13 = -310420008;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0275, code lost:
    
        r11 = (l.C0630.m2566("ۜ᩻") + r9) * 63;
        r12 = ((r11 ^ r10) * (-26503)) ^ 172549612;
        r13 = -309364625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x022c, code lost:
    
        r11 = (r10 - l.C2105.m6981("᩻۟")) * 21;
        r12 = ((r11 ^ r9) * (-30875)) ^ 2124722104;
        r13 = -1791777862;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r11 = l.C2105.m6981("ۚ᩹") ^ r10;
        r12 = ((r11 ^ r9) * 11435) ^ 1769989075;
        r13 = -1692053849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01fb, code lost:
    
        r11 = l.C0630.m2566("ۙۢ") ^ r9;
        r12 = ((r11 ^ r10) * 15603) ^ 1837928009;
        r13 = 1238808382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02a8, code lost:
    
        r11 = l.C0630.m2566("᩵᩵") ^ r9;
        r12 = ((r11 ^ r10) * (-13421)) ^ (-346392194);
        r13 = 1429377075;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f0, code lost:
    
        r11 = (l.C0630.m2566("ۖ֨") + r10) * 61;
        r12 = ((r11 ^ r9) * 1467) ^ (-1335466736);
        r13 = 873176238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x018c, code lost:
    
        r11 = (l.C2105.m6981("᩻۬") ^ r9) * 89;
        r12 = ((r11 ^ r10) * 8101) ^ (-917001549);
        r13 = 674796630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0122, code lost:
    
        r11 = l.C2105.m6981("۬ۧ") ^ r10;
        r12 = ((r11 ^ r9) * (-2033)) ^ 400070543;
        r13 = 1488156254;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m6666(l.C19119 r14, l.C19119 r15) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6666(l.᩵֡ᩴ, l.᩵֡ᩴ):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        if (l.ServiceConnectionC3453.f10921 < 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (l.C2272.m7503() == false) goto L68;
     */
    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m6683() {
        /*
            Method dump skipped, instructions count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6683():void");
    }

    @Override // l.InterfaceC4585
    /* renamed from: ᩳ */
    public final void mo1502() {
        AtomicInteger atomicInteger = null;
        int i = 0;
        C12346 c12346 = null;
        boolean z = false;
        int i2 = -1790805682;
        int i3 = C3911.f12484;
        int i4 = C1128.f4106;
        int m6981 = C2105.m6981("֡ۖ") ^ i3;
        int i5 = ((m6981 ^ i4) * 9443) ^ (-566910807);
        int i6 = -1837582366;
        while (true) {
            i2 = ((((i2 ^ i4) * (-1179)) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -1917822949:
                case 1825123174:
                    C3432.m10477();
                    C1916.m6308();
                    m6981 = (C0630.m2566("۟ᩴ") + i4) * 67;
                    i5 = ((m6981 ^ i3) * 27643) ^ (-1669798325);
                    i6 = -904802001;
                case -1766418882:
                case 1371273916:
                    z = false;
                    if (C3432.m10477() <= 0) {
                        m6981 = (i4 - C0630.m2566("᩷᩹")) * (-5);
                        i5 = ((m6981 ^ i3) * 9703) ^ 194026145;
                        i6 = 669368014;
                    } else {
                        m6981 = (i3 - C2105.m6981("ۚ᩺")) * 39;
                        i5 = ((m6981 ^ i4) * (-32679)) ^ 878506782;
                        i6 = -816546822;
                    }
                case -1483946653:
                case 1486115060:
                    C0050.m940();
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m6981 = (C0630.m2566("۟ᩴ") + i4) * 67;
                        i5 = ((m6981 ^ i3) * 27643) ^ (-1669798325);
                        i6 = -904802001;
                    } else {
                        m6981 = (C0630.m2566("ۘ᩺") + i3) * (-87);
                        i5 = ((m6981 ^ i4) * (-23167)) ^ (-1643115526);
                        i6 = 97299924;
                    }
                case -1450393984:
                case 407838960:
                    if (RunnableC1937.f6483 < 0) {
                        C4263.m12821(new C19659(this, i));
                        break;
                    }
                    m6981 = (C0630.m2566("ۘ᩺") + i3) * (-87);
                    i5 = ((m6981 ^ i4) * (-23167)) ^ (-1643115526);
                    i6 = 97299924;
                case -1448281595:
                case -253925928:
                    C0050.m940();
                    break;
                case -1311206062:
                case -246451493:
                    this.f6812 = true;
                    if (C4075.f12947 >= 0) {
                        m6981 = (C0630.m2566("ܰۢ") + i3) * (-77);
                        i5 = ((m6981 ^ i4) * 19727) ^ 973866908;
                        i6 = -95032798;
                    } else {
                        m6981 = C2105.m6981("ܽۙ") ^ i4;
                        i5 = ((m6981 ^ i3) * 18757) ^ (-528568566);
                        i6 = -1795412617;
                    }
                case -1168270216:
                case 2000527111:
                    C1711.m5736();
                    if (C7811.f24123 < 0) {
                        m6981 = (C0630.m2566("ۘ᩺") + i3) * (-87);
                        i5 = ((m6981 ^ i4) * (-23167)) ^ (-1643115526);
                        i6 = 97299924;
                    } else {
                        m6981 = (i4 - C0630.m2566("᩷᩹")) * (-5);
                        i5 = ((m6981 ^ i3) * 9703) ^ 194026145;
                        i6 = 669368014;
                    }
                case -801732048:
                case 1675031245:
                    C7106.m19106(atomicInteger);
                    if (RunnableC1108.f4040) {
                        m6981 = (C2105.m6981("ܶ֡") ^ i3) * (-97);
                        i5 = ((m6981 ^ i4) * (-13585)) ^ 491282591;
                        i6 = 845910224;
                    } else {
                        m6981 = (C0630.m2566("۟ᩴ") + i4) * 67;
                        i5 = ((m6981 ^ i3) * 27643) ^ (-1669798325);
                        i6 = -904802001;
                    }
                case -653482719:
                case 1069583789:
                    atomicInteger = this.f6819;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = (C0630.m2566("۟ᩴ") + i4) * 67;
                        i5 = ((m6981 ^ i3) * 27643) ^ (-1669798325);
                        i6 = -904802001;
                    } else {
                        m6981 = C0630.m2566("ۢۙ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-22311)) ^ (-448941145);
                        i6 = 1800546610;
                    }
                case -613017659:
                case 850300416:
                    this.f6815.f10840.m29958(z);
                    break;
                case -571729721:
                case 2044292839:
                    if (RunnableC0588.m2441() >= 0) {
                        m6981 = (C0630.m2566("ۘ᩺") + i3) * (-87);
                        i5 = ((m6981 ^ i4) * (-23167)) ^ (-1643115526);
                        i6 = 97299924;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܽ᩻")) * 99;
                        i5 = ((m6981 ^ i4) * 9095) ^ 328057047;
                        i6 = 1991654376;
                    }
                case -484306199:
                case 2007362516:
                    c12346.m29958(z);
                    if (C5695.m16023() >= 0) {
                        m6981 = (C0630.m2566("ܰۢ") + i3) * (-77);
                        i5 = ((m6981 ^ i4) * 19727) ^ 973866908;
                        i6 = -95032798;
                    } else {
                        m6981 = (C0630.m2566("ܰ۟") ^ i3) * 51;
                        i5 = ((m6981 ^ i4) * 28543) ^ (-1095410945);
                        i6 = -839815154;
                    }
                case -274923296:
                case 1670159194:
                    C7106.m19106(this.f6826);
                    if (RunnableC1108.f4040) {
                        m6981 = C0630.m2566("۬ۛ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-19789)) ^ (-1484651946);
                        i6 = -1623550563;
                    } else {
                        m6981 = (C0630.m2566("۟ᩴ") + i4) * 67;
                        i5 = ((m6981 ^ i3) * 27643) ^ (-1669798325);
                        i6 = -904802001;
                    }
                case -224797364:
                case 1624234412:
                    C2958.m9034();
                    if (C7106.m19120() <= 0) {
                        m6981 = (C0630.m2566("۟ᩴ") + i4) * 67;
                        i5 = ((m6981 ^ i3) * 27643) ^ (-1669798325);
                        i6 = -904802001;
                    } else {
                        m6981 = C2105.m6981("ۘ֫") ^ i4;
                        i5 = ((m6981 ^ i3) * 5749) ^ 466421745;
                        i6 = -1358423176;
                    }
                case 1048665232:
                case 1462155170:
                    c12346 = this.f6822.f10840;
                    if (C3537.f11231 >= 0) {
                        m6981 = (C0630.m2566("ܰۢ") + i3) * (-77);
                        i5 = ((m6981 ^ i4) * 19727) ^ 973866908;
                        i6 = -95032798;
                    } else {
                        m6981 = (i4 - C0630.m2566("ۖ֫")) * (-79);
                        i5 = ((m6981 ^ i3) * 2623) ^ 1803335080;
                        i6 = 239027455;
                    }
                case 1544900755:
                case 1956324514:
                    if (this.f6814) {
                        m6981 = C0630.m2566("ۤۘ") ^ i4;
                        i5 = ((m6981 ^ i3) * 31793) ^ 1768063595;
                        i6 = 906331948;
                    } else {
                        m6981 = C2105.m6981("ܶ֨") ^ i4;
                        i5 = ((m6981 ^ i3) * (-12051)) ^ (-852157703);
                        i6 = -417734118;
                    }
                default:
                    i = C7106.m19106(this.f6816);
                    if (C2126.m7040()) {
                        m6981 = (C0630.m2566("ۘ᩺") + i3) * (-87);
                        i5 = ((m6981 ^ i4) * (-23167)) ^ (-1643115526);
                        i6 = 97299924;
                    } else {
                        m6981 = C0630.m2566("۟᩸") ^ i3;
                        i5 = ((m6981 ^ i4) * 895) ^ (-852954836);
                        i6 = -22222436;
                    }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean m6707() {
        C14012 c14012 = null;
        int i = 0;
        ViewOnClickListenerC2040 viewOnClickListenerC2040 = null;
        int i2 = 1320943136;
        int i3 = C0422.f1886;
        int i4 = C3683.f11629;
        int m6981 = (i4 - C2105.m6981("ۧۖ")) * (-59);
        int i5 = ((m6981 ^ i3) * 23805) ^ (-641488728);
        int i6 = -1703727660;
        while (true) {
            i2 = ((((i2 ^ i3) * (-7013)) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -2141366873:
                case -2010543671:
                    return true;
                case -2087506432:
                case 991572181:
                    return false;
                case -1969657533:
                case -1655039228:
                    if (C0382.f1805) {
                        m6981 = C2105.m6981("۠۫") ^ i4;
                        i5 = ((m6981 ^ i3) * 21053) ^ (-1550948092);
                        i6 = 1175521642;
                    } else {
                        m6981 = C0630.m2566("۬۫") ^ i3;
                        i5 = ((m6981 ^ i4) * (-30141)) ^ (-1659931789);
                        i6 = 1470802265;
                    }
                case -1915587504:
                case 1862977700:
                    if (C4159.f13567) {
                        m6981 = C0630.m2566("۬۫") ^ i3;
                        i5 = ((m6981 ^ i4) * (-30141)) ^ (-1659931789);
                        i6 = 1470802265;
                    } else {
                        m6981 = (C2105.m6981("᩹ۨ") + i4) * (-127);
                        i5 = ((m6981 ^ i3) * 1155) ^ (-894050744);
                        i6 = 72736432;
                    }
                case -1900403846:
                case 861429301:
                    if (C3663.f11553) {
                        m6981 = C0630.m2566("ۚ֫") ^ i3;
                        i5 = ((m6981 ^ i4) * 26589) ^ 1401823645;
                        i6 = -1791365824;
                    } else {
                        m6981 = (C2105.m6981("᩹ۨ") + i4) * (-127);
                        i5 = ((m6981 ^ i3) * 1155) ^ (-894050744);
                        i6 = 72736432;
                    }
                case -1861699568:
                case 1288414587:
                    if (C1916.f6442) {
                        m6981 = (C2105.m6981("ۖۘ") ^ i3) * (-99);
                        i5 = ((m6981 ^ i4) * (-11995)) ^ (-84712987);
                        i6 = -1044802925;
                    } else {
                        m6981 = C0630.m2566("۬۫") ^ i3;
                        i5 = ((m6981 ^ i4) * (-30141)) ^ (-1659931789);
                        i6 = 1470802265;
                    }
                case -1813076638:
                case -1720698408:
                    if (C11340.f33930 >= 0) {
                        m6981 = (i4 - C0630.m2566("᩷ᩳ")) * 27;
                        i5 = ((m6981 ^ i3) * 28153) ^ 892638288;
                        i6 = 19606783;
                    } else {
                        m6981 = C2105.m6981("ۡܰ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-20543)) ^ 1251807141;
                        i6 = 812483394;
                    }
                case -1505078817:
                case -373799594:
                    if (isDestroyed()) {
                        m6981 = C2105.m6981("ۚ֡") ^ i4;
                        i5 = ((m6981 ^ i3) * 8941) ^ (-57370278);
                        i6 = -811783361;
                    } else {
                        m6981 = (C0630.m2566("᩵᩻") + i3) * 89;
                        i5 = ((m6981 ^ i4) * (-24859)) ^ (-997970876);
                        i6 = 716043944;
                    }
                case -1420172852:
                case -662005645:
                    if (C4075.f12947 < 0) {
                        m6981 = (i4 - C0630.m2566("᩷ᩳ")) * 27;
                        i5 = ((m6981 ^ i3) * 28153) ^ 892638288;
                        i6 = 19606783;
                    } else {
                        m6981 = C0630.m2566("۬۫") ^ i3;
                        i5 = ((m6981 ^ i4) * (-30141)) ^ (-1659931789);
                        i6 = 1470802265;
                    }
                case -1399544451:
                case 1728666010:
                    c14012 = this.f6830;
                    if (c14012 != null) {
                        m6981 = (i4 - C2105.m6981("᩻ۤ")) * (-3);
                        i5 = ((m6981 ^ i3) * 19719) ^ 881603098;
                        i6 = 1677728474;
                    } else {
                        m6981 = C2105.m6981("۫ۡ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-15069)) ^ (-2074547175);
                        i6 = 619283792;
                    }
                case -1394879826:
                case -382616482:
                    if (C2105.f7037 != 0) {
                        m6981 = (i4 - C0630.m2566("᩷ᩳ")) * 27;
                        i5 = ((m6981 ^ i3) * 28153) ^ 892638288;
                        i6 = 19606783;
                    } else {
                        m6981 = C0630.m2566("ۛۢ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-31485)) ^ 1811701450;
                        i6 = 1411398941;
                    }
                case -1388386748:
                case 1095351823:
                    if (C3537.f11231 >= 0) {
                        m6981 = C0630.m2566("ۚ֫") ^ i3;
                        i5 = ((m6981 ^ i4) * 26589) ^ 1401823645;
                        i6 = -1791365824;
                    } else {
                        m6981 = C2105.m6981("ۜ֫") ^ i4;
                        i5 = ((m6981 ^ i3) * (-17345)) ^ 1262517457;
                        i6 = -88153505;
                    }
                case -1362264392:
                case -1051479928:
                    if (i == C0714.m2817(viewOnClickListenerC2040.f6816)) {
                        m6981 = C2105.m6981("ۚ֡") ^ i4;
                        i5 = ((m6981 ^ i3) * 8941) ^ (-57370278);
                        i6 = -811783361;
                    } else {
                        m6981 = C2105.m6981("۫ۡ") ^ i4;
                        i5 = ((m6981 ^ i3) * (-15069)) ^ (-2074547175);
                        i6 = 619283792;
                    }
                case -1298787188:
                case 488695427:
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = (i4 - C0630.m2566("᩷ᩳ")) * 27;
                        i5 = ((m6981 ^ i3) * 28153) ^ 892638288;
                        i6 = 19606783;
                    } else {
                        m6981 = C2105.m6981("᩵ۨ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-7623)) ^ 1633935244;
                        i6 = -1244225962;
                    }
                case -991256896:
                case 2109496486:
                    if (C3911.m11924() <= 0) {
                        m6981 = (i4 - C0630.m2566("᩷ᩳ")) * 27;
                        i5 = ((m6981 ^ i3) * 28153) ^ 892638288;
                        i6 = 19606783;
                    } else {
                        m6981 = C2105.m6981("ܳܿ") ^ i3;
                        i5 = ((m6981 ^ i4) * 1375) ^ (-1134104265);
                        i6 = 1882170642;
                    }
                case -925692364:
                case 1637516574:
                    C3663.m11168();
                    return false;
                case -798058005:
                case 217533852:
                    if (C4117.m12349(this)) {
                        m6981 = C2105.m6981("ۚ֡") ^ i4;
                        i5 = ((m6981 ^ i3) * 8941) ^ (-57370278);
                        i6 = -811783361;
                    } else {
                        m6981 = C0630.m2566("ᩴܽ") ^ i4;
                        i5 = ((m6981 ^ i3) * 16843) ^ (-1790374306);
                        i6 = 1389276027;
                    }
                case -595823364:
                case -327203311:
                    if (this.f6814) {
                        m6981 = C2105.m6981("ۚ֡") ^ i4;
                        i5 = ((m6981 ^ i3) * 8941) ^ (-57370278);
                        i6 = -811783361;
                    } else {
                        m6981 = (C0630.m2566("ᩳ۫") + i3) * (-63);
                        i5 = ((m6981 ^ i4) * (-4623)) ^ (-1529492525);
                        i6 = -1169793533;
                    }
                case -540192185:
                case 1181906766:
                    i = c14012.f42382;
                    viewOnClickListenerC2040 = c14012.f42384;
                    if (C1047.f3863 >= 0) {
                        m6981 = C2105.m6981("᩺᩶") ^ i4;
                        i5 = ((m6981 ^ i3) * (-20777)) ^ 2082161919;
                        i6 = -941829916;
                    } else {
                        m6981 = C2105.m6981("᩸ۡ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-1497)) ^ 1815263737;
                        i6 = -2120728144;
                    }
                case 238680573:
                case 577175857:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C2105.m6981("᩺᩶") ^ i4;
                        i5 = ((m6981 ^ i3) * (-20777)) ^ 2082161919;
                        i6 = -941829916;
                    } else {
                        m6981 = C2105.m6981("᩹۬") ^ i3;
                        i5 = ((m6981 ^ i4) * (-18113)) ^ 1553113969;
                        i6 = -1239087574;
                    }
                case 244136648:
                case 1757675647:
                    if (C1504.f5354) {
                        m6981 = C0630.m2566("۬۫") ^ i3;
                        i5 = ((m6981 ^ i4) * (-30141)) ^ (-1659931789);
                        i6 = 1470802265;
                    } else {
                        m6981 = (C0630.m2566("ۤᩴ") + i4) * 43;
                        i5 = ((m6981 ^ i3) * 20447) ^ 66684722;
                        i6 = -1104267311;
                    }
                case 1050288066:
                case 1213706449:
                    if (this.f6812) {
                        m6981 = C2105.m6981("ۚ֡") ^ i4;
                        i5 = ((m6981 ^ i3) * 8941) ^ (-57370278);
                        i6 = -811783361;
                    } else {
                        m6981 = C2105.m6981("ᩳۜ") ^ i3;
                        i5 = ((m6981 ^ i4) * 10753) ^ 1889990856;
                        i6 = -996930252;
                    }
                default:
                    C7106.m19120();
                    m6981 = (i4 - C0630.m2566("᩷ᩳ")) * 27;
                    i5 = ((m6981 ^ i3) * 28153) ^ 892638288;
                    i6 = 19606783;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (l.C3245.m9925() == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (l.C1504.m5179() == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (l.C2958.f9394 < 0) goto L62;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m6647(long r17) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6647(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0050, code lost:
    
        if (l.C1711.m5736() <= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0066, code lost:
    
        if (l.C1420.f5096 > 0) goto L67;
     */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6696(l.ViewOnClickListenerC2040 r19) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6696(l.֫᩵᩷):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m6665(ViewOnClickListenerC2040 viewOnClickListenerC2040, int i, int i2, int i3, String str, String str2) {
        C20364 c20364 = null;
        int i4 = -215953732;
        int i5 = C4616.f14690;
        int i6 = ServiceConnectionC3453.f10921;
        int m6981 = C2105.m6981("۫ۢ") ^ i6;
        int i7 = ((m6981 ^ i5) * 9093) ^ (-991875533);
        int i8 = -45347407;
        while (true) {
            i4 = ((((i4 ^ i5) * (-31083)) >> 31) & i7) ^ (m6981 ^ i8);
            switch (i4) {
                case -2102744334:
                case 167560514:
                    if (C0382.f1805) {
                        m6981 = (C2105.m6981("᩸ۚ") + i5) * 27;
                        i7 = ((m6981 ^ i6) * (-16513)) ^ 1128125957;
                        i8 = 245947759;
                    } else {
                        m6981 = C2105.m6981("ܶۢ") ^ i5;
                        i7 = ((m6981 ^ i6) * (-12945)) ^ (-430277443);
                        i8 = -1678926059;
                    }
                case -1997492909:
                case 220450195:
                    if (C0630.m2564()) {
                        m6981 = C0630.m2566("ܶۨ") ^ i5;
                        i7 = ((m6981 ^ i6) * 21585) ^ 115060211;
                        i8 = 1601164450;
                    } else {
                        m6981 = (C2105.m6981("ۚۖ") ^ i5) * 17;
                        i7 = ((m6981 ^ i6) * (-31279)) ^ 1310721325;
                        i8 = 250636478;
                    }
                case -1978225816:
                case 967800790:
                    if (C3683.m11218(str2, viewOnClickListenerC2040.f6815.f10837.f65738)) {
                        m6981 = C2105.m6981("ܰۛ") ^ i6;
                        i7 = ((m6981 ^ i5) * 19465) ^ (-832324560);
                        i8 = -1867575239;
                    } else {
                        m6981 = (C0630.m2566("ۙ۠") + i6) * (-119);
                        i7 = ((m6981 ^ i5) * 24479) ^ (-48535079);
                        i8 = -95529981;
                    }
                case -1755177038:
                case -1744200572:
                    if (C11340.f33930 >= 0) {
                        m6981 = C0630.m2566("᩻ᩴ") ^ i6;
                        i7 = ((m6981 ^ i5) * (-691)) ^ 715510720;
                        i8 = -214824204;
                    } else {
                        m6981 = C0630.m2566("ܽ᩹") ^ i5;
                        i7 = ((m6981 ^ i6) * 32133) ^ 1002051936;
                        i8 = -1716883193;
                    }
                case -1667560190:
                case -151307613:
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = C0630.m2566("᩻ᩴ") ^ i6;
                        i7 = ((m6981 ^ i5) * (-691)) ^ 715510720;
                        i8 = -214824204;
                    } else {
                        m6981 = C0630.m2566("ۨ֡") ^ i6;
                        i7 = ((m6981 ^ i5) * 26353) ^ 360320335;
                        i8 = 1962848845;
                    }
                case -1477004243:
                case 1946329297:
                    if (C0964.f3626 != 0) {
                        m6981 = C2105.m6981("ܶۢ") ^ i5;
                        i7 = ((m6981 ^ i6) * (-12945)) ^ (-430277443);
                        i8 = -1678926059;
                    } else {
                        m6981 = C0630.m2566("۬֫") ^ i5;
                        i7 = ((m6981 ^ i6) * (-23593)) ^ 1160580617;
                        i8 = 1055803273;
                    }
                case -1379091098:
                case 408241526:
                    if (C4263.f13799 <= 0) {
                        m6981 = C0630.m2566("ܶۨ") ^ i5;
                        i7 = ((m6981 ^ i6) * 21585) ^ 115060211;
                        i8 = 1601164450;
                    } else {
                        m6981 = C0630.m2566("ۙۜ") ^ i5;
                        i7 = ((m6981 ^ i6) * (-15429)) ^ (-2040528709);
                        i8 = -455101608;
                    }
                case -1322322162:
                case 1285975081:
                    C1294.m4372();
                    return false;
                case -1118394439:
                case 826717536:
                    C3432.m10477();
                    if (C3746.f11829 <= 0) {
                        m6981 = (i5 - C0630.m2566("ۘ֫")) * 63;
                        i7 = ((m6981 ^ i6) * 11103) ^ (-319368742);
                        i8 = -996124038;
                    } else {
                        m6981 = C0630.m2566("ܶۜ") ^ i6;
                        i7 = ((m6981 ^ i5) * (-8957)) ^ 1691508536;
                        i8 = -2072103855;
                    }
                case -1089383141:
                case 411157863:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = C0630.m2566("᩻ᩴ") ^ i6;
                        i7 = ((m6981 ^ i5) * (-691)) ^ 715510720;
                        i8 = -214824204;
                    } else {
                        m6981 = (C2105.m6981("۬ۙ") + i6) * 11;
                        i7 = ((m6981 ^ i5) * (-21205)) ^ (-299380048);
                        i8 = -145902885;
                    }
                case -1033587013:
                case 887358049:
                    if (C3911.f12484 >= 0) {
                        m6981 = C0630.m2566("ܶۜ") ^ i6;
                        i7 = ((m6981 ^ i5) * (-8957)) ^ 1691508536;
                        i8 = -2072103855;
                    } else {
                        m6981 = C0630.m2566("᩵۫") ^ i6;
                        i7 = ((m6981 ^ i5) * (-6989)) ^ 1252334802;
                        i8 = 1678009141;
                    }
                case -1002255137:
                case -509781266:
                    if (C3683.m11218(str, c20364.f65738)) {
                        m6981 = C2105.m6981("ۡ᩵") ^ i6;
                        i7 = ((m6981 ^ i5) * (-14573)) ^ 1605661938;
                        i8 = 1726067116;
                    } else {
                        m6981 = (C0630.m2566("ۙ۠") + i6) * (-119);
                        i7 = ((m6981 ^ i5) * 24479) ^ (-48535079);
                        i8 = -95529981;
                    }
                case -731311386:
                case 412032249:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = C0630.m2566("ܶۨ") ^ i5;
                        i7 = ((m6981 ^ i6) * 21585) ^ 115060211;
                        i8 = 1601164450;
                    } else {
                        m6981 = (C2105.m6981("ۛ֫") ^ i6) * (-61);
                        i7 = ((m6981 ^ i5) * 29087) ^ 276457980;
                        i8 = 787417581;
                    }
                case -637747804:
                case -536141567:
                    if (i == C0714.m2817(viewOnClickListenerC2040.f6826)) {
                        m6981 = C2105.m6981("᩷᩹") ^ i5;
                        i7 = ((m6981 ^ i6) * 5589) ^ (-1223327703);
                        i8 = 956780539;
                    } else {
                        m6981 = C2105.m6981("ܰۛ") ^ i6;
                        i7 = ((m6981 ^ i5) * 19465) ^ (-832324560);
                        i8 = -1867575239;
                    }
                case -556663800:
                case 533115101:
                    if (C0798.m2998() == 0) {
                        m6981 = C0630.m2566("ܶۨ") ^ i5;
                        i7 = ((m6981 ^ i6) * 21585) ^ 115060211;
                        i8 = 1601164450;
                    } else {
                        m6981 = C2105.m6981("ܶۢ") ^ i5;
                        i7 = ((m6981 ^ i6) * (-12945)) ^ (-430277443);
                        i8 = -1678926059;
                    }
                case -404089020:
                case 572087756:
                    viewOnClickListenerC2040.m6647(0L);
                    return true;
                case -91184543:
                case 246977784:
                    c20364 = viewOnClickListenerC2040.f6822.f10837;
                    if (c20364.f65736 == i2) {
                        m6981 = C2105.m6981("᩵۠") ^ i5;
                        i7 = ((m6981 ^ i6) * (-29787)) ^ 1745012426;
                        i8 = 1668558738;
                    } else {
                        m6981 = (C0630.m2566("ۙ۠") + i6) * (-119);
                        i7 = ((m6981 ^ i5) * 24479) ^ (-48535079);
                        i8 = -95529981;
                    }
                case 297477526:
                case 1256706214:
                    if (C0422.f1886 <= 0) {
                        m6981 = C0630.m2566("᩻ᩴ") ^ i6;
                        i7 = ((m6981 ^ i5) * (-691)) ^ 715510720;
                        i8 = -214824204;
                    } else {
                        m6981 = (C0630.m2566("۬᩵") + i6) * (-107);
                        i7 = ((m6981 ^ i5) * (-20937)) ^ (-554847845);
                        i8 = 1901920671;
                    }
                case 532668377:
                case 2146785482:
                    if (viewOnClickListenerC2040.m6707()) {
                        m6981 = C0630.m2566("֨۫") ^ i5;
                        i7 = ((m6981 ^ i6) * (-24443)) ^ (-1430595162);
                        i8 = -601109790;
                    } else {
                        m6981 = C2105.m6981("ܰۛ") ^ i6;
                        i7 = ((m6981 ^ i5) * 19465) ^ (-832324560);
                        i8 = -1867575239;
                    }
                case 1171049049:
                case 1872649492:
                    if (viewOnClickListenerC2040.f6815.f10837.f65736 == i3) {
                        m6981 = (C2105.m6981("֡ܺ") ^ i6) * (-51);
                        i7 = ((m6981 ^ i5) * (-31939)) ^ 1342015120;
                        i8 = 251452202;
                    } else {
                        m6981 = (C0630.m2566("ۙ۠") + i6) * (-119);
                        i7 = ((m6981 ^ i5) * 24479) ^ (-48535079);
                        i8 = -95529981;
                    }
                case 1256162177:
                case 2043997200:
                    C2167.m7155();
                    C3911.m11924();
                    m6981 = (i5 - C0630.m2566("ۘ֫")) * 63;
                    i7 = ((m6981 ^ i6) * 11103) ^ (-319368742);
                    i8 = -996124038;
                case 1540947489:
                case 2086142178:
                    return false;
                default:
                    if (RunnableC0588.f2309 < 0) {
                        m6981 = (i5 - C0630.m2566("ۘ֫")) * 63;
                        i7 = ((m6981 ^ i6) * 11103) ^ (-319368742);
                        i8 = -996124038;
                    } else {
                        m6981 = C0630.m2566("ܶۨ") ^ i5;
                        i7 = ((m6981 ^ i6) * 21585) ^ 115060211;
                        i8 = 1601164450;
                    }
            }
        }
    }

    static {
        ApplicationC12518.m30701(33);
        f6807 = new short[]{6014, 5237, 6100, 7029, 6217, 10126, 10168, 10162, 10174, 10175, 10239, 10155, 10168, 10145, 10239, 10145, 10175, 10166, 10239, 10150, 10164, 10163, 10145, 10126, 10168, 10162, 10174, 10175, 7697, 2407, 2345, 2342, 2348, 2362, 2343, 2337, 2348, 2327, 2348, 2345, 2364, 2345, 4531, 27393, -22998, -22540, 22374, 18552, 18791, 28519, 23212, 28517, -17111, -20833, 26405, 13490, 13475, 13473, 13481, 13475, 13477, 13479, -17957, 28295, -17927, 13475, 13484, 13478, 13488, 13485, 13483, 13478, 13548, 13483, 13484, 13494, 13479, 13484, 13494, 13548, 13475, 13473, 13494, 13483, 13485, 13484, 13548, 13446, 13447, 13454, 13447, 13462, 13447, 3023, -16030, 3619, 3168, -5222, -5678, -6373, -10662, -6353, 5695, -5142, -11806, -5570, -682, 6659, 2226, -10249, -1333, 6891, -480, -4628, -9044, -4659, 867, -10009, 6025, 1746, 5418, -8133, -5638, 4300, -4322, -46, -8978, 803, -9236, 5611, 3333, 1193, -6550, -4039, 7628, -9076, -28725, -28700, -28690, -28680, -28699, -28701, -28690, -28763, -28690, -28693, -28674, -28693, -28763, -5475, -3810, 5712, 3221, 6527, 374, -28758, -28741, -15926, -7075, 2918, -28758, -28744, -11173, 5266, 6814, -6187, 4672, 7561, -11524, 2319, -11340, -1841, -2238, -9993, 7398, -5210, -10649, -16143, -15999, -2152, 6356, -8439, -16071, -28689, -28693, -28689, -28679, -28676, 2379, -1378, -4771, 5970, 7477, 7464, 7460, 7458, 7473, 7475, 7460, 7439, 7473, 7456, 7483, 7439, 7459, 7487, 7458, 7460, 7439, 7474, 7465, 7477, 7464, 7460, 7458, 7473, 7475, 7460, 7439, 7473, 7456, 7483, 7439, 7459, 7487, 7458, 7460, 7439, 7458, 7477, 7462, 7477, 7458, 7459, 7477, 5318, -16575, -16630, -16625, -16614, -16625, 6342, -24860, -24862, -24847, -24834, -24861, -24836, -24847, -24860, -24839, -24833, -24834, -24887, -24847, -24836, -24864, -24840, -24847, 2655, 20490, 20503, 20507, 20509, 20494, 20492, 20507, 20528, 20494, 20511, 20484, 20528, 20511, 20494, 20507, 20487, 20494, 20511, 20484, 20508, 9480, -10661, -10682, -10678, -10676, -10657, -10659, -10678, -10655, -10657, -10674, -10667, -10655, -10674, -10657, -10678, -10678, -10661, -10676, -10672, -10683, -10625, -10685, -10655, -10683, -10648, -10685, -10736, -10657, -10674, -10667, -10683, -10625, -10685, -10683, -10642, -10685, -10683, -10648, -10685, -10683, -10627, -10685, -10651, -10748, -10654, -10654, -10735, -10732, -10751, -10750, -10752, -10724, -10686, -10653, -10655, -10654, -10675, -10722, 6203, -3032, -7637, 3666, -31976, -31976, -31976, 5123, 13689, 13618, 13623, 13602, 13623, 3213, 28380, 23758, -28290, 9476, 26487, 26472, 26493, 26474, 26489, 26476, 26481, 26487, 26486, 26495, 26487, 26476, 26487, 26421, 26487, 26474, 26421, 26484, 26487, 26491, 26489, 26476, 26493, 26472, 26489, 26476, 26480, 2934, 10793, 10920, 7134, 2330, 8720, 8705, 8707, 8715, 8705, 8711, 8709, 8705, 8718, 8708, 8722, 8719, 8713, 8708, 8782, 8713, 8718, 8724, 8709, 8718, 8724, 8782, 8705, 8707, 8724, 8713, 8719, 8718, 8782, 8740, 8741, 8748, 8741, 8756, 8741, 8409, 28014, 16656, -21006, 24870, 18817, 24120, 9351, -17948, -17950, -17935, -17922, -17949, -17924, -17935, -17948, -17927, -17921, -17922, -17975, 6290, 16203, -12507, 12968, 14074, 13759, -12444, 8684, -13993, 16366, 11478, -11832, -5698, -12351, 9993, -8959, -13695, 11682, -8654, -6726, -11741, -10569, 15030, 15342, -6711, -9918, 9518, -6399, 3958, -16270, -11170, -13555, -10222, 3864, 10269, 16139, -11544, 3100, 9205, 15734, -8864, 12215, -16086, 14130, -9012, -9415, 1344, 16365, 6644, 1560, 4020, 9062, 13741, 11518, 9391, 3325, -10628, 3496, 13397, 7814, -15097, 2976, -7406, -12477, -2863, 4937, 3639, -30380, 30334, 20459, 27224, 19331, 28110, 31310, -30225, 19279, 26330, -32267, 30529, -32480, -30653, -31349, -26125, -31219, 18651, 5533, 5504, 5516, 5514, 5529, 5531, 5516, 5543, 5529, 5512, 5523, 5543, 5515, 5527, 5514, 5516, 5543, 5514, 5533, 5518, 5533, 5514, 5515, 5533, -30674, -26902, 25216, 5533, 5504, 5516, 5514, 5529, 5531, 5516, 5543, 5529, 5512, 5523, 5543, 5515, 5527, 5514, 5516, 5543, 5530, 5505, -25552, 31278, 18666, -28526, -31517, 17393, 31500, -25998, -29952, -31813, 26978, 27432, -32325, 27540, -29806, 5529, 5512, 5523, 5515, 5507, 5561, 5509, 5543, 5507, 5550, 5509, 5590, 5529, 5512, 5523, 5533, 5504, 5516, 5514, 5529, 5531, 5516, 5543, 5529, 5512, 5523, 5543, 5512, 5529, 5516, 5516, 5533, 5514, 5526, 5533, 5529, 5533, 5515, 5518, 31633, -30474, -30986, 29042, 30144, -30448, 5507, 5592, 5592, 5509, -30422, -31907, -29062, 25867, 31784, 20007, 1566, -12871, -12924, -12920, -12914, -12899, -12897, -12920, -12867, -12916, -12916, -12867, -12897, -12920, -12907, -12918, -12907, -12920, -12923};
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -901701292;
        int i6 = C0714.f2697;
        int i7 = C1294.f4556;
        int m6981 = C2105.m6981("֨᩶") ^ i6;
        int i8 = ((m6981 ^ i7) * (-25889)) ^ 1909303059;
        int i9 = 830976386;
        while (true) {
            i5 = ((((i5 ^ i7) * (-6503)) >> 31) & i8) ^ (m6981 ^ i9);
            switch (i5) {
                case -2140015159:
                case -1279367262:
                    if (C7811.f24123 >= 0) {
                        m6981 = (i6 - C2105.m6981("ᩴܰ")) * (-125);
                        i8 = ((m6981 ^ i7) * (-21567)) ^ (-1289152720);
                        i9 = -1638941387;
                    } else {
                        m6981 = (C0630.m2566("ۨܳ") ^ i6) * (-35);
                        i8 = ((m6981 ^ i7) * 2213) ^ 379324393;
                        i9 = 1099267672;
                    }
                case -1947621024:
                case 1675063775:
                    i3 = 0;
                    if (C3683.f11629 >= 0) {
                        m6981 = (i7 - C0630.m2566("۫᩹")) * (-13);
                        i8 = ((m6981 ^ i6) * 12751) ^ (-1253487080);
                        i9 = -1220461046;
                    } else {
                        m6981 = C2105.m6981("ܿܽ") ^ i6;
                        i8 = ((m6981 ^ i7) * 26105) ^ 1502225119;
                        i9 = -2099542610;
                    }
                case -1931793505:
                case 610218256:
                    if (C2126.f7087) {
                        m6981 = (i6 - C2105.m6981("ᩴܰ")) * (-125);
                        i8 = ((m6981 ^ i7) * (-21567)) ^ (-1289152720);
                        i9 = -1638941387;
                    } else {
                        m6981 = C0630.m2566("֡ۤ") ^ i6;
                        i8 = ((m6981 ^ i7) * 11941) ^ (-782352010);
                        i9 = 94766622;
                    }
                case -1673051130:
                case -896351898:
                    if (C7811.f24123 >= 0) {
                        m6981 = (i6 - C2105.m6981("ᩴܰ")) * (-125);
                        i8 = ((m6981 ^ i7) * (-21567)) ^ (-1289152720);
                        i9 = -1638941387;
                    } else {
                        m6981 = C2105.m6981("۫ۨ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-26149)) ^ 301982470;
                        i9 = -1957209498;
                    }
                case -1556740128:
                case -395326657:
                    if (AbstractC2021.f6743 > 0) {
                        m6981 = (i7 - C0630.m2566("۫᩹")) * (-13);
                        i8 = ((m6981 ^ i6) * 12751) ^ (-1253487080);
                        i9 = -1220461046;
                    } else {
                        m6981 = C2105.m6981("ۘۖ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-25275)) ^ 435262066;
                        i9 = 1683282103;
                    }
                case -1509755174:
                case -1451252505:
                    if (C0050.f910 >= 0) {
                        m6981 = C2105.m6981("ۘۖ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-25275)) ^ 435262066;
                        i9 = 1683282103;
                    } else {
                        m6981 = (i6 - C2105.m6981("ۜۖ")) * (-83);
                        i8 = ((m6981 ^ i7) * 14407) ^ 880938530;
                        i9 = 236744468;
                    }
                case -1497816626:
                case -367323052:
                    C2126.m7040();
                    if (C1047.f3863 < 0) {
                        m6981 = C0630.m2566("ۘۚ") ^ i7;
                        i8 = ((m6981 ^ i6) * 21945) ^ (-510537531);
                        i9 = -1279006157;
                    } else {
                        m6981 = (i7 - C0630.m2566("۫᩹")) * (-13);
                        i8 = ((m6981 ^ i6) * 12751) ^ (-1253487080);
                        i9 = -1220461046;
                    }
                case -1411660307:
                case -1247799085:
                    if (C7811.m20844() == 0) {
                        m6981 = C0630.m2566("ۘۚ") ^ i7;
                        i8 = ((m6981 ^ i6) * 21945) ^ (-510537531);
                        i9 = -1279006157;
                    } else {
                        m6981 = (i6 - C2105.m6981("ᩴܰ")) * (-125);
                        i8 = ((m6981 ^ i7) * (-21567)) ^ (-1289152720);
                        i9 = -1638941387;
                    }
                case -1077386671:
                case 1150600778:
                    i = 4;
                    i2 = 3;
                    if (C7106.f21815 != 0) {
                        m6981 = (i6 - C2105.m6981("ᩴܰ")) * (-125);
                        i8 = ((m6981 ^ i7) * (-21567)) ^ (-1289152720);
                        i9 = -1638941387;
                    } else {
                        m6981 = C2105.m6981("֫᩸") ^ i7;
                        i8 = ((m6981 ^ i6) * (-3145)) ^ (-393177623);
                        i9 = -1151817849;
                    }
                case -759308749:
                case -346799035:
                    if (C3537.f11231 >= 0) {
                        m6981 = (i6 - C2105.m6981("ᩴܰ")) * (-125);
                        i8 = ((m6981 ^ i7) * (-21567)) ^ (-1289152720);
                        i9 = -1638941387;
                    } else {
                        m6981 = C2105.m6981("᩹ۤ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-23695)) ^ (-135740666);
                        i9 = 481683970;
                    }
                case -719663067:
                case 340843393:
                    if (C11340.f33930 >= 0) {
                        m6981 = C0630.m2566("ۘۚ") ^ i7;
                        i8 = ((m6981 ^ i6) * 21945) ^ (-510537531);
                        i9 = -1279006157;
                    } else {
                        m6981 = C2105.m6981("ܺۗ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-19461)) ^ 891460440;
                        i9 = -1692394807;
                    }
                case -472252882:
                case 448499990:
                    RunnableC1937.m6387();
                    C1294.m4372();
                    m6981 = C0630.m2566("ۘۚ") ^ i7;
                    i8 = ((m6981 ^ i6) * 21945) ^ (-510537531);
                    i9 = -1279006157;
                case -171382265:
                case -15619596:
                    f6809 = new int[]{i3, i4, 2, i, i2};
                    return;
                case 252753976:
                case 359654921:
                    if (C7811.m20844() != 0) {
                        m6981 = C2105.m6981("ۘۖ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-25275)) ^ 435262066;
                        i9 = 1683282103;
                    } else {
                        m6981 = C0630.m2566("᩹ۧ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-153)) ^ 293339445;
                        i9 = 108276034;
                    }
                case 483100442:
                case 979582795:
                    C1294.m4372();
                    throw new RuntimeException();
                default:
                    i4 = 1;
                    if (C4616.f14690 <= 0) {
                        m6981 = (C2105.m6981("ܺ᩺") ^ i7) * 43;
                        i8 = ((m6981 ^ i6) * (-2101)) ^ (-1000984365);
                        i9 = -984422567;
                    } else {
                        m6981 = C2105.m6981("᩻ۛ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-21993)) ^ (-121356055);
                        i9 = 1522755564;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6657(ViewOnClickListenerC2040 viewOnClickListenerC2040, C6252 c6252) {
        C3430 c3430;
        int i;
        int m6981;
        int i2;
        C3430 c34302;
        int i3;
        int i4;
        C20364 c20364;
        int i5;
        int i6;
        ViewOnClickListenerC2040 viewOnClickListenerC20402 = viewOnClickListenerC2040;
        int i7 = C4117.f13076;
        int i8 = C1420.f5096;
        int m69812 = C2105.m6981("֫᩺") ^ i8;
        int i9 = ((m69812 ^ i7) * (-6237)) ^ (-847883591);
        ViewOnClickListenerC2040 viewOnClickListenerC20403 = null;
        C19119 c19119 = null;
        int i10 = m69812 ^ 1073511462;
        int i11 = 0;
        int i12 = -1554978082;
        C3430 c34303 = null;
        C19119 c191192 = null;
        C20364 c203642 = null;
        C20364 c203643 = null;
        C13307 c13307 = null;
        C13307 c133072 = null;
        C3430 c34304 = null;
        int i13 = 0;
        while (true) {
            i12 = i10 ^ (i9 & (((i12 ^ i7) * 30403) >> 31));
            switch (i12) {
                case -2042856669:
                case 341113400:
                    c203643.f65733 = c191192;
                    c203643.f65738 = c133072.f39835;
                    viewOnClickListenerC20403 = c203643.f65735;
                    if (C4075.f12947 >= 0) {
                        c3430 = c34303;
                        int m69813 = C2105.m6981("ۗ֫") ^ i8;
                        C3430 c34305 = c3430;
                        i9 = ((m69813 ^ i7) * 32281) ^ (-765544433);
                        i3 = m69813 ^ (-1984781964);
                        c34303 = c34305;
                        i10 = i3;
                    } else {
                        m6981 = C2105.m6981("ܶۘ") ^ i7;
                        i = ((m6981 ^ i8) * 8861) ^ 325713868;
                        i2 = -344469213;
                        i10 = m6981 ^ i2;
                        i9 = i;
                    }
                case -1998731103:
                case 2126278441:
                    break;
                case -1817379688:
                case -1496030284:
                    viewOnClickListenerC20402.f6814 = false;
                    viewOnClickListenerC20402.m6664(false);
                    m6981 = (i7 - C0630.m2566("᩺᩹")) * (-57);
                    i = ((m6981 ^ i8) * (-14579)) ^ 1351977556;
                    i2 = 621084025;
                    i10 = m6981 ^ i2;
                    i9 = i;
                case -1761957233:
                case -222387849:
                    c203642.f65736 = i11 + 1;
                    C1294.m4376(c203642);
                    if (viewOnClickListenerC20402.f6814) {
                        m6981 = C2105.m6981("ۗܰ") ^ i8;
                        i = ((m6981 ^ i7) * (-13381)) ^ (-1345983390);
                        i2 = -450993383;
                        i10 = m6981 ^ i2;
                        i9 = i;
                    }
                    m6981 = (i7 - C0630.m2566("᩺᩹")) * (-57);
                    i = ((m6981 ^ i8) * (-14579)) ^ 1351977556;
                    i2 = 621084025;
                    i10 = m6981 ^ i2;
                    i9 = i;
                case -1550718838:
                case 291249950:
                    c34304.f10838 = c13307.f39834;
                    if (C3019.f9544 >= 0) {
                        c3430 = c34303;
                        int m698132 = C2105.m6981("ۗ֫") ^ i8;
                        C3430 c343052 = c3430;
                        i9 = ((m698132 ^ i7) * 32281) ^ (-765544433);
                        i3 = m698132 ^ (-1984781964);
                        c34303 = c343052;
                        i10 = i3;
                    } else {
                        m6981 = C2105.m6981("ۙܳ") ^ i7;
                        i = ((m6981 ^ i8) * 9123) ^ 535754889;
                        i2 = -1847193351;
                        i10 = m6981 ^ i2;
                        i9 = i;
                    }
                case -1446632185:
                case 945448903:
                    RunnableC0588.m2441();
                    break;
                case -1395186546:
                case -1162024602:
                    c34302 = c34303;
                    c203643 = c34302.f10837;
                    AbstractC2021.m6565(c203643);
                    c203643.f65737 = c133072.f39836;
                    c191192 = c133072.f39837;
                    if (!RunnableC1108.m3790()) {
                        i6 = C0630.m2566("ܶ۠") ^ i8;
                        c20364 = c203643;
                        i5 = ((i6 ^ i7) * (-19173)) ^ (-1221389704);
                        i4 = -973715747;
                        i3 = i6 ^ i4;
                        c34303 = c34302;
                        i9 = i5;
                        c203643 = c20364;
                        i10 = i3;
                    }
                    i6 = C0630.m2566("۬ۧ") ^ i8;
                    c20364 = c203643;
                    i5 = ((i6 ^ i7) * (-23833)) ^ 1084202452;
                    i4 = -1997860628;
                    i3 = i6 ^ i4;
                    c34303 = c34302;
                    i9 = i5;
                    c203643 = c20364;
                    i10 = i3;
                case -1175721488:
                case 2083941789:
                    C3430 c34306 = viewOnClickListenerC20402.f6822;
                    c133072 = c6252.f19344;
                    if (C1504.m5179()) {
                        int m69814 = (C2105.m6981("᩺ۖ") ^ i7) * (-103);
                        i10 = m69814 ^ 181856074;
                        c34303 = c34306;
                        i9 = ((m69814 ^ i8) * (-27389)) ^ 204368029;
                        viewOnClickListenerC20402 = viewOnClickListenerC2040;
                    } else {
                        c34303 = c34306;
                        m6981 = C2105.m6981("ܽ᩸") ^ i7;
                        i = ((m6981 ^ i8) * (-4539)) ^ 1557222320;
                        i2 = 1175890470;
                        i10 = m6981 ^ i2;
                        i9 = i;
                    }
                case -1111577114:
                case -241103737:
                    i13 = -1;
                    viewOnClickListenerC20403.f6835 = -1;
                    if (C3019.m9255() <= 0) {
                        c34302 = c34303;
                        i6 = C0630.m2566("۬ۧ") ^ i8;
                        c20364 = c203643;
                        i5 = ((i6 ^ i7) * (-23833)) ^ 1084202452;
                        i4 = -1997860628;
                        i3 = i6 ^ i4;
                        c34303 = c34302;
                        i9 = i5;
                        c203643 = c20364;
                        i10 = i3;
                    } else {
                        m6981 = (C2105.m6981("۬ۘ") + i8) * (-31);
                        i = ((m6981 ^ i7) * (-23497)) ^ 40455495;
                        i2 = -1250533845;
                        i10 = m6981 ^ i2;
                        i9 = i;
                    }
                case -1000670788:
                case 1496365435:
                    if (C0798.f2919) {
                        c34302 = c34303;
                        i6 = C0630.m2566("۬ۧ") ^ i8;
                        c20364 = c203643;
                        i5 = ((i6 ^ i7) * (-23833)) ^ 1084202452;
                        i4 = -1997860628;
                        i3 = i6 ^ i4;
                        c34303 = c34302;
                        i9 = i5;
                        c203643 = c20364;
                        i10 = i3;
                    } else {
                        m6981 = (C2105.m6981("ۧ᩷") ^ i7) * 31;
                        i = ((m6981 ^ i8) * (-23759)) ^ 219484877;
                        i2 = 732288270;
                        i10 = m6981 ^ i2;
                        i9 = i;
                    }
                case -953200348:
                case 128098006:
                    c203642 = c34304.f10837;
                    AbstractC2021.m6565(c203642);
                    c203642.f65737 = c13307.f39836;
                    c19119 = c13307.f39837;
                    if (C3663.f11553) {
                        c3430 = c34303;
                        int m6981322 = C2105.m6981("ۗ֫") ^ i8;
                        C3430 c3430522 = c3430;
                        i9 = ((m6981322 ^ i7) * 32281) ^ (-765544433);
                        i3 = m6981322 ^ (-1984781964);
                        c34303 = c3430522;
                        i10 = i3;
                    } else {
                        m6981 = (i8 - C2105.m6981("ܳ֡")) * q.h;
                        i = ((m6981 ^ i7) * 24045) ^ 813295877;
                        i2 = 2060708706;
                        i10 = m6981 ^ i2;
                        i9 = i;
                    }
                case -901100428:
                case -898063532:
                    C2520.m8026();
                    C0798.m2998();
                    m6981 = (C2105.m6981("ۧ᩷") ^ i7) * 31;
                    i = ((m6981 ^ i8) * (-23759)) ^ 219484877;
                    i2 = 732288270;
                    i10 = m6981 ^ i2;
                    i9 = i;
                case -540689135:
                case 514835977:
                    c3430 = c34303;
                    RunnableC3474.m10618(c3430);
                    c3430.f10838 = c133072.f39834;
                    if (C2105.f7037 != 0) {
                        int m69813222 = C2105.m6981("ۗ֫") ^ i8;
                        C3430 c34305222 = c3430;
                        i9 = ((m69813222 ^ i7) * 32281) ^ (-765544433);
                        i3 = m69813222 ^ (-1984781964);
                        c34303 = c34305222;
                        i10 = i3;
                    } else {
                        int m69815 = C2105.m6981("ܳۛ") ^ i8;
                        i = ((m69815 ^ i7) * (-32721)) ^ 510000701;
                        c34303 = c3430;
                        i10 = m69815 ^ (-283305710);
                        i9 = i;
                    }
                case -306967355:
                case 802399212:
                    C1294.m4376(c203643);
                    c34304 = viewOnClickListenerC20402.f6815;
                    c13307 = c6252.f19343;
                    AbstractC2021.m6565(c34304);
                    if (RunnableC0588.m2441() < 0) {
                        m6981 = C2105.m6981("ۢܳ") ^ i8;
                        i = ((m6981 ^ i7) * (-7849)) ^ 116261786;
                        i2 = 1385568283;
                        i10 = m6981 ^ i2;
                        i9 = i;
                    }
                    m6981 = C2105.m6981("ܽ᩸") ^ i7;
                    i = ((m6981 ^ i8) * (-4539)) ^ 1557222320;
                    i2 = 1175890470;
                    i10 = m6981 ^ i2;
                    i9 = i;
                case 283101786:
                case 717605986:
                    if (C2167.m7155()) {
                        c3430 = c34303;
                        int m698132222 = C2105.m6981("ۗ֫") ^ i8;
                        C3430 c343052222 = c3430;
                        i9 = ((m698132222 ^ i7) * 32281) ^ (-765544433);
                        i3 = m698132222 ^ (-1984781964);
                        c34303 = c343052222;
                        i10 = i3;
                    } else {
                        m6981 = C2105.m6981("ۢۜ") ^ i7;
                        i = ((m6981 ^ i8) * 12427) ^ (-1962036444);
                        i2 = -1835811039;
                        i10 = m6981 ^ i2;
                        i9 = i;
                    }
                case 458825116:
                case 1666094540:
                    c203642.f65733 = c19119;
                    c203642.f65738 = c13307.f39835;
                    c203642.f65735.f6835 = i13;
                    i11 = c203642.f65736;
                    if (C1294.f4556 >= 0) {
                        c3430 = c34303;
                        int m6981322222 = C2105.m6981("ۗ֫") ^ i8;
                        C3430 c3430522222 = c3430;
                        i9 = ((m6981322222 ^ i7) * 32281) ^ (-765544433);
                        i3 = m6981322222 ^ (-1984781964);
                        c34303 = c3430522222;
                        i10 = i3;
                    } else {
                        m6981 = (C2105.m6981("ܽۧ") + i7) * (-63);
                        i = ((m6981 ^ i8) * (-29635)) ^ 1067983145;
                        i2 = 852537150;
                        i10 = m6981 ^ i2;
                        i9 = i;
                    }
                case 1159745165:
                case 2132985643:
                    c203643.f65736++;
                    if (C0798.m2998() == 0) {
                        m6981 = C2105.m6981("ۛ᩻") ^ i7;
                        i = ((m6981 ^ i8) * (-21019)) ^ 1488446902;
                        i2 = -1149404830;
                        i10 = m6981 ^ i2;
                        i9 = i;
                    }
                    m6981 = C2105.m6981("ܽ᩸") ^ i7;
                    i = ((m6981 ^ i8) * (-4539)) ^ 1557222320;
                    i2 = 1175890470;
                    i10 = m6981 ^ i2;
                    i9 = i;
                default:
                    C0237.m1481();
                    if (C1005.f3721) {
                        c3430 = c34303;
                        int m69813222222 = C2105.m6981("ۗ֫") ^ i8;
                        C3430 c34305222222 = c3430;
                        i9 = ((m69813222222 ^ i7) * 32281) ^ (-765544433);
                        i3 = m69813222222 ^ (-1984781964);
                        c34303 = c34305222222;
                        i10 = i3;
                    } else {
                        m6981 = (C2105.m6981("ۧ᩷") ^ i7) * 31;
                        i = ((m6981 ^ i8) * (-23759)) ^ 219484877;
                        i2 = 732288270;
                        i10 = m6981 ^ i2;
                        i9 = i;
                    }
            }
            return;
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        int m2566;
        int i;
        int i2;
        int m25662;
        int i3;
        Menu menu2 = menu;
        int i4 = C0483.f2088;
        int i5 = C3432.f10845;
        int m6981 = (C2105.m6981("ܳۧ") ^ i5) * 59;
        int i6 = ((m6981 ^ i4) * (-17853)) ^ 1239600410;
        String str = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i7 = m6981 ^ 1324419071;
        MenuInflater menuInflater = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        char c = 0;
        short s = 0;
        int i17 = 1738776394;
        int i18 = 0;
        while (true) {
            i17 = i7 ^ (i6 & (((i17 ^ i4) * 7433) >> 31));
            switch (i17) {
                case -2137853110:
                case -908798330:
                    C22628.m50615();
                    return false;
                case -2099449212:
                case 481679333:
                    str = C2126.m7036(sArr3, 507, 3, i16);
                    if (C0382.f1805) {
                        int m69812 = C2105.m6981("ܿ᩺") ^ i4;
                        i6 = ((m69812 ^ i5) * 16973) ^ (-1233329721);
                        i7 = m69812 ^ 594410415;
                    } else {
                        m25662 = (C2105.m6981("ۙ֡") ^ i4) * 31;
                        i6 = ((m25662 ^ i5) * (-17043)) ^ 1743501261;
                        i3 = -1073281819;
                        i7 = m25662 ^ i3;
                        menu2 = menu;
                    }
                case -1892329266:
                case 610630120:
                    i16 = 58532;
                    m2566 = (C2105.m6981("۠ۧ") + i5) * 13;
                    i = ((m2566 ^ i4) * (-3045)) ^ (-520895461);
                    i2 = -713303177;
                    i7 = m2566 ^ i2;
                    i6 = i;
                case -1882508270:
                case -1846948763:
                    this.f6818 = C7106.m19118(menu2, i9 ^ i10);
                    return true;
                case -1239106670:
                case 1761638228:
                    int i19 = i14 + i15;
                    if (i13 - (i19 + i19) <= 0) {
                        m2566 = C0630.m2566("֡ۧ") ^ i5;
                        i = ((m2566 ^ i4) * (-12295)) ^ 2144269127;
                        i2 = 1264567887;
                    } else {
                        m2566 = (C0630.m2566("ۢ᩻") + i4) * (-29);
                        i = ((m2566 ^ i5) * 8301) ^ 1403536298;
                        i2 = 936464090;
                    }
                    i7 = m2566 ^ i2;
                    i6 = i;
                case -1152634577:
                case -412609004:
                    menuInflater = getMenuInflater();
                    sArr2 = f6807;
                    i11 = 504;
                    if (C2105.f7037 != 0) {
                        m25662 = (i4 - C0630.m2566("ܶ۠")) * (-89);
                        i6 = ((m25662 ^ i5) * (-30675)) ^ 1630578703;
                        i3 = 424153351;
                        i7 = m25662 ^ i3;
                        menu2 = menu;
                    } else {
                        m2566 = C0630.m2566("۟᩸") ^ i4;
                        i = ((m2566 ^ i5) * (-16367)) ^ 1949641515;
                        i2 = -532453795;
                        i7 = m2566 ^ i2;
                        i6 = i;
                    }
                case -985044592:
                case -661909308:
                    RunnableC0588.m2441();
                    if (C2272.m7503()) {
                        m25662 = (i4 - C0630.m2566("ܶ۠")) * (-89);
                        i6 = ((m25662 ^ i5) * (-30675)) ^ 1630578703;
                        i3 = 424153351;
                        i7 = m25662 ^ i3;
                        menu2 = menu;
                    } else {
                        m2566 = (C2105.m6981("᩶᩻") ^ i5) * 53;
                        i = ((m2566 ^ i4) * 3251) ^ (-384787110);
                        i2 = -44730021;
                        i7 = m2566 ^ i2;
                        i6 = i;
                    }
                case -950019621:
                case 1660549749:
                    i13 = i18 * i18;
                    i14 = s * s;
                    i15 = 29735209;
                    if (C4117.f13076 <= 0) {
                        m25662 = (i4 - C0630.m2566("ܶ۠")) * (-89);
                        i6 = ((m25662 ^ i5) * (-30675)) ^ 1630578703;
                        i3 = 424153351;
                        i7 = m25662 ^ i3;
                        menu2 = menu;
                    } else {
                        m2566 = (C0630.m2566("ܳ֨") + i4) * (-25);
                        i = ((m2566 ^ i5) * (-12927)) ^ (-87263482);
                        i2 = 1551251388;
                        i7 = m2566 ^ i2;
                        i6 = i;
                    }
                case -858075174:
                case -404391680:
                    short s2 = sArr[c];
                    int i20 = s2 + 5453;
                    if (C0714.m2805()) {
                        int m25663 = C0630.m2566("ܰۗ") ^ i5;
                        int i21 = ((m25663 ^ i4) * 6225) ^ 2094766050;
                        i7 = m25663 ^ 1917544276;
                        s = s2;
                        i18 = i20;
                        i6 = i21;
                        menu2 = menu;
                    } else {
                        s = s2;
                        i18 = i20;
                        m2566 = (C2105.m6981("᩶᩻") ^ i5) * 53;
                        i = ((m2566 ^ i4) * 3251) ^ (-384787110);
                        i2 = -44730021;
                        i7 = m2566 ^ i2;
                        i6 = i;
                    }
                case -589962632:
                case 1638701064:
                    i8 = C0630.m2566(RunnableC1937.m6385(sArr2, i11, i12, i16));
                    if (RunnableC1937.f6483 < 0) {
                        m2566 = (C0630.m2566("۫᩹") ^ i4) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i = ((m2566 ^ i5) * (-21123)) ^ (-1118776055);
                        i2 = 1511473622;
                        i7 = m2566 ^ i2;
                        i6 = i;
                    }
                    m2566 = (C2105.m6981("᩶᩻") ^ i5) * 53;
                    i = ((m2566 ^ i4) * 3251) ^ (-384787110);
                    i2 = -44730021;
                    i7 = m2566 ^ i2;
                    i6 = i;
                case -180970709:
                case 1690180212:
                    sArr = f6807;
                    if (C1294.f4556 < 0) {
                        m25662 = (C2105.m6981("᩶ܳ") ^ i5) * (-103);
                        i6 = ((m25662 ^ i4) * 29337) ^ (-1539044980);
                        i3 = 875631795;
                        i7 = m25662 ^ i3;
                        menu2 = menu;
                    }
                    m25662 = (i4 - C0630.m2566("ܶ۠")) * (-89);
                    i6 = ((m25662 ^ i5) * (-30675)) ^ 1630578703;
                    i3 = 424153351;
                    i7 = m25662 ^ i3;
                    menu2 = menu;
                case -146628004:
                case 1951343304:
                    if (!C0798.f2919) {
                        m2566 = C0630.m2566("ۨۖ") ^ i5;
                        i = ((m2566 ^ i4) * 30213) ^ (-1708462322);
                        i2 = -1700083976;
                        i7 = m2566 ^ i2;
                        i6 = i;
                    }
                    m2566 = (C2105.m6981("᩶᩻") ^ i5) * 53;
                    i = ((m2566 ^ i4) * 3251) ^ (-384787110);
                    i2 = -44730021;
                    i7 = m2566 ^ i2;
                    i6 = i;
                case -61974857:
                case 713022208:
                    i9 = C0630.m2566(str);
                    if (C5695.f17556 >= 0) {
                        i10 = 2119968850;
                        m2566 = (C2105.m6981("᩶᩻") ^ i5) * 53;
                        i = ((m2566 ^ i4) * 3251) ^ (-384787110);
                        i2 = -44730021;
                        i7 = m2566 ^ i2;
                        i6 = i;
                    } else {
                        int m25664 = (i4 - C0630.m2566("۠᩸")) * (-37);
                        i6 = ((m25664 ^ i5) * 12009) ^ 361032190;
                        i7 = m25664 ^ 1338771099;
                        i10 = 2119968850;
                    }
                case -28628991:
                case 611212963:
                    i16 = 39110;
                    m2566 = (C2105.m6981("۠ۧ") + i5) * 13;
                    i = ((m2566 ^ i4) * (-3045)) ^ (-520895461);
                    i2 = -713303177;
                    i7 = m2566 ^ i2;
                    i6 = i;
                case 157739387:
                case 2040636332:
                    if (C2272.f7362) {
                        m2566 = (C2105.m6981("᩶᩻") ^ i5) * 53;
                        i = ((m2566 ^ i4) * 3251) ^ (-384787110);
                        i2 = -44730021;
                        i7 = m2566 ^ i2;
                        i6 = i;
                    } else {
                        m25662 = (C2105.m6981("ۙ֡") ^ i4) * 31;
                        i6 = ((m25662 ^ i5) * (-17043)) ^ 1743501261;
                        i3 = -1073281819;
                        i7 = m25662 ^ i3;
                        menu2 = menu;
                    }
                case 396962174:
                case 837290732:
                    c = 503;
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m25662 = C2105.m6981("ۚۡ") ^ i4;
                        i6 = ((m25662 ^ i5) * 5653) ^ (-1472305146);
                        i3 = 335102622;
                        i7 = m25662 ^ i3;
                        menu2 = menu;
                    }
                    m25662 = (C2105.m6981("ۙ֡") ^ i4) * 31;
                    i6 = ((m25662 ^ i5) * (-17043)) ^ 1743501261;
                    i3 = -1073281819;
                    i7 = m25662 ^ i3;
                    menu2 = menu;
                case 435258585:
                case 1334953435:
                    menuInflater.inflate(2122139300 ^ i8, menu2);
                    sArr3 = f6807;
                    if (C7811.f24123 >= 0) {
                        m2566 = (C2105.m6981("ۖۜ") ^ i5) * 97;
                        i = ((m2566 ^ i4) * 28001) ^ (-1509110310);
                        i2 = -1784425899;
                    } else {
                        m2566 = C2105.m6981("᩺۟") ^ i5;
                        i = ((m2566 ^ i4) * (-653)) ^ (-2034634069);
                        i2 = 936088073;
                    }
                    i7 = m2566 ^ i2;
                    i6 = i;
                case 800997694:
                case 2018724073:
                    C11340.m28031();
                    m2566 = (C2105.m6981("᩶᩻") ^ i5) * 53;
                    i = ((m2566 ^ i4) * 3251) ^ (-384787110);
                    i2 = -44730021;
                    i7 = m2566 ^ i2;
                    i6 = i;
                default:
                    i12 = 3;
                    if (C3432.m10477() <= 0) {
                        m25662 = (C2105.m6981("ۙ֡") ^ i4) * 31;
                        i6 = ((m25662 ^ i5) * (-17043)) ^ 1743501261;
                        i3 = -1073281819;
                        i7 = m25662 ^ i3;
                        menu2 = menu;
                    } else {
                        m2566 = (C2105.m6981("ۨۗ") ^ i5) * (-93);
                        i = ((m2566 ^ i4) * 1137) ^ (-410257370);
                        i2 = 1445344445;
                        i7 = m2566 ^ i2;
                        i6 = i;
                    }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6680(ViewOnClickListenerC2040 viewOnClickListenerC2040, int i) {
        int[] iArr = null;
        int i2 = -330463079;
        int i3 = C1420.f5096;
        int i4 = C4263.f13799;
        int m2566 = C0630.m2566("᩷֨") ^ i4;
        int i5 = ((m2566 ^ i3) * 13473) ^ (-136122703);
        int i6 = 1218291321;
        while (true) {
            i2 = ((((i2 ^ i3) * 28233) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -2057587287:
                case -1541603002:
                    if (C4159.f13567) {
                        m2566 = (i4 - C0630.m2566("ۨۡ")) * (-71);
                        i5 = ((m2566 ^ i3) * (-7415)) ^ 1922207184;
                        i6 = -722346878;
                    } else {
                        m2566 = C2105.m6981("᩺ۛ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-23349)) ^ 182727730;
                        i6 = 369741513;
                    }
                case -2050197794:
                case -1369701771:
                    C1047.m3599();
                    if (C0964.f3626 == 0) {
                        m2566 = (i4 - C0630.m2566("᩵᩶")) * 87;
                        i5 = ((m2566 ^ i3) * (-17395)) ^ (-894250126);
                        i6 = -981517915;
                    } else {
                        m2566 = (i3 - C2105.m6981("֨᩵")) * 17;
                        i5 = ((m2566 ^ i4) * (-16367)) ^ (-1184021366);
                        i6 = 1883952596;
                    }
                case -2015719593:
                case -539541911:
                    iArr = f6809;
                    if (C22628.m50615() != 0) {
                        m2566 = C2105.m6981("ۨۨ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-32757)) ^ 718322171;
                        i6 = -405338158;
                    } else {
                        m2566 = C0630.m2566("᩷۬") ^ i3;
                        i5 = ((m2566 ^ i4) * (-4983)) ^ 76044017;
                        i6 = -1532441770;
                    }
                case -1993130519:
                case 1947886513:
                    if (C0964.f3626 != 0) {
                        m2566 = (i4 - C0630.m2566("᩵᩶")) * 87;
                        i5 = ((m2566 ^ i3) * (-17395)) ^ (-894250126);
                        i6 = -981517915;
                    } else {
                        m2566 = C0630.m2566("ۡ᩶") ^ i3;
                        i5 = ((m2566 ^ i4) * 9427) ^ 606632150;
                        i6 = 1017163326;
                    }
                case -1820026898:
                case 721274595:
                    if (C1711.f5919) {
                        m2566 = (i4 - C0630.m2566("᩵᩶")) * 87;
                        i5 = ((m2566 ^ i3) * (-17395)) ^ (-894250126);
                        i6 = -981517915;
                    } else {
                        m2566 = C0630.m2566("᩹ۤ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-9739)) ^ (-121667171);
                        i6 = -343397174;
                    }
                case -1599858895:
                case 1438658300:
                    C2167.m7155();
                    if (C3245.f10203 <= 0) {
                        m2566 = (i4 - C0630.m2566("᩵᩶")) * 87;
                        i5 = ((m2566 ^ i3) * (-17395)) ^ (-894250126);
                        i6 = -981517915;
                    } else {
                        m2566 = (i4 - C0630.m2566("ۨۡ")) * (-71);
                        i5 = ((m2566 ^ i3) * (-7415)) ^ 1922207184;
                        i6 = -722346878;
                    }
                case -1467243305:
                case -413062249:
                    viewOnClickListenerC2040.f6834 = iArr[i];
                    break;
                case -1381775648:
                case -812240878:
                    if (C1773.f6144 <= 0) {
                        m2566 = (i4 - C0630.m2566("᩵᩶")) * 87;
                        i5 = ((m2566 ^ i3) * (-17395)) ^ (-894250126);
                        i6 = -981517915;
                    } else {
                        m2566 = C2105.m6981("ۗ۠") ^ i3;
                        i5 = ((m2566 ^ i4) * (-10015)) ^ 1501918445;
                        i6 = -889635692;
                    }
                case -1050654766:
                case 855257162:
                    if (C7106.f21815 != 0) {
                        m2566 = (i3 - C2105.m6981("֨᩵")) * 17;
                        i5 = ((m2566 ^ i4) * (-16367)) ^ (-1184021366);
                        i6 = 1883952596;
                    } else {
                        m2566 = (C2105.m6981("ܽۗ") ^ i3) * 13;
                        i5 = ((m2566 ^ i4) * (-29343)) ^ 1159227040;
                        i6 = 716155597;
                    }
                case -918176891:
                case 1542110747:
                    if (RunnableC1108.m3790()) {
                        m2566 = C2105.m6981("ۨۨ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-32757)) ^ 718322171;
                        i6 = -405338158;
                    } else {
                        m2566 = C0630.m2566("۫ᩴ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-17851)) ^ (-1884146716);
                        i6 = 513875746;
                    }
                case -315312186:
                case -194692595:
                    if (RunnableC0588.m2441() >= 0) {
                        m2566 = (i4 - C0630.m2566("ۨۡ")) * (-71);
                        i5 = ((m2566 ^ i3) * (-7415)) ^ 1922207184;
                        i6 = -722346878;
                    } else {
                        m2566 = C2105.m6981("ۛ᩺") ^ i3;
                        i5 = ((m2566 ^ i4) * 20729) ^ (-900982093);
                        i6 = 1898972449;
                    }
                case -266208285:
                case 2090010214:
                    C1773.m5908();
                    C1711.m5736();
                    m2566 = (i4 - C0630.m2566("᩵᩶")) * 87;
                    i5 = ((m2566 ^ i3) * (-17395)) ^ (-894250126);
                    i6 = -981517915;
                case -141700958:
                case 2137692703:
                    if (RunnableC3474.f10992 <= 0) {
                        m2566 = C2105.m6981("᩺ۛ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-23349)) ^ 182727730;
                        i6 = 369741513;
                    } else {
                        m2566 = C2105.m6981("᩷᩺") ^ i4;
                        i5 = ((m2566 ^ i3) * 24129) ^ 474160291;
                        i6 = 757934928;
                    }
                case 256735812:
                case 1021247687:
                    C0798.m2998();
                    C3683.m11222();
                    break;
                case 718668604:
                case 2093135168:
                    if (C0483.f2088 >= 0) {
                        m2566 = (i4 - C0630.m2566("᩵᩶")) * 87;
                        i5 = ((m2566 ^ i3) * (-17395)) ^ (-894250126);
                        i6 = -981517915;
                    } else {
                        m2566 = C0630.m2566("ܺᩳ") ^ i4;
                        i5 = ((m2566 ^ i3) * 6953) ^ (-1681794945);
                        i6 = -1711336015;
                    }
                default:
                    if (C1005.f3721) {
                        m2566 = C0630.m2566("ܶᩳ") ^ i4;
                        i5 = ((m2566 ^ i3) * 1451) ^ (-702528352);
                        i6 = -1069946152;
                    } else {
                        m2566 = C2105.m6981("᩺ۛ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-23349)) ^ 182727730;
                        i6 = 369741513;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r7 = (r5 - l.C2105.m6981("ۤܳ")) * (-59);
        r8 = ((r7 ^ r6) * (-23993)) ^ 1722237946;
        r9 = -2139934459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0296, code lost:
    
        r7 = (l.C0630.m2566("ۘۗ") + r6) * 101;
        r8 = ((r7 ^ r5) * (-14783)) ^ 631029350;
        r9 = -234239252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01a3, code lost:
    
        r7 = l.C2105.m6981("۠ۚ") ^ r5;
        r8 = ((r7 ^ r6) * 23185) ^ (-1641126439);
        r9 = 525003872;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        r7 = (l.C0630.m2566("۫ܿ") + r6) * (-21);
        r8 = ((r7 ^ r5) * 2517) ^ (-2011464887);
        r9 = -1047092715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0267, code lost:
    
        r7 = l.C2105.m6981("ۢܺ") ^ r6;
        r8 = ((r7 ^ r5) * (-29295)) ^ 721980651;
        r9 = 1243636238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0141, code lost:
    
        r7 = (l.C0630.m2566("ۚۧ") ^ r5) * (-31);
        r8 = ((r7 ^ r6) * (-21919)) ^ (-891040251);
        r9 = -1725579134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0171, code lost:
    
        r7 = l.C0630.m2566("ۜ۠") ^ r5;
        r8 = ((r7 ^ r6) * 12837) ^ 1345664321;
        r9 = -1011787105;
     */
    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.onResume():void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m6693(ViewOnClickListenerC2040 viewOnClickListenerC2040, int i) {
        long j = 0;
        int i2 = -740095411;
        int i3 = C3245.f10203;
        int i4 = RunnableC1937.f6483;
        int m6981 = C2105.m6981("ܺۨ") ^ i4;
        int i5 = ((m6981 ^ i3) * (-11961)) ^ (-1998855705);
        int i6 = -982774177;
        while (true) {
            i2 = ((((i2 ^ i3) * 9931) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -2134059560:
                case -1280538904:
                    if (C7811.f24123 >= 0) {
                        m6981 = C0630.m2566("ܶܿ") ^ i4;
                        i5 = ((m6981 ^ i3) * 25427) ^ (-872522090);
                        i6 = 762412598;
                    } else {
                        m6981 = (C0630.m2566("ۤܿ") + i3) * (-79);
                        i5 = ((m6981 ^ i4) * (-23457)) ^ (-1126970515);
                        i6 = 1988854450;
                    }
                case -2104935272:
                case -1118912888:
                    try {
                        SystemClock.sleep(j);
                        C3430 c3430 = viewOnClickListenerC2040.f6822;
                        viewOnClickListenerC2040.m6648(c3430.f10837.f65737, c3430.f10842, viewOnClickListenerC2040.f6819, i);
                    } catch (Exception unused) {
                    }
                    m6981 = C2105.m6981("᩻ۜ") ^ i3;
                    i5 = ((m6981 ^ i4) * (-21815)) ^ (-1003391300);
                    i6 = -1210384274;
                case -1951016853:
                case 717361889:
                    if (C2105.m6982() != 0) {
                        m6981 = (C2105.m6981("۟ܽ") + i4) * 29;
                        i5 = ((m6981 ^ i3) * 30649) ^ (-2030472332);
                        i6 = -376201630;
                    } else {
                        m6981 = (C2105.m6981("᩸ۖ") + i4) * 19;
                        i5 = ((m6981 ^ i3) * (-5905)) ^ 1656339965;
                        i6 = 2064801830;
                    }
                case -1784585273:
                case 267457952:
                    break;
                case -1716881326:
                case -1131264043:
                    if (C3245.f10203 > 0) {
                        m6981 = (i3 - C0630.m2566("᩺ᩳ")) * (-45);
                        i5 = ((m6981 ^ i4) * 2985) ^ (-1005454874);
                        i6 = -717905374;
                    } else {
                        m6981 = (C2105.m6981("۟ܽ") + i4) * 29;
                        i5 = ((m6981 ^ i3) * 30649) ^ (-2030472332);
                        i6 = -376201630;
                    }
                case -1414114104:
                case 1418672027:
                    if (C0714.m2805()) {
                        m6981 = C0630.m2566("ۡۙ") ^ i4;
                        i5 = ((m6981 ^ i3) * 5409) ^ (-488588602);
                        i6 = 2114260010;
                    } else {
                        m6981 = (C2105.m6981("۟ܽ") + i4) * 29;
                        i5 = ((m6981 ^ i3) * 30649) ^ (-2030472332);
                        i6 = -376201630;
                    }
                case -1355507650:
                case -1045336749:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = C2105.m6981("ۗۚ") ^ i4;
                        i5 = ((m6981 ^ i3) * 18253) ^ 713224232;
                        i6 = -1318009989;
                    } else {
                        m6981 = C2105.m6981("᩶ܳ") ^ i3;
                        i5 = ((m6981 ^ i4) * 22531) ^ (-1118411622);
                        i6 = 80980124;
                    }
                case -1096281243:
                case 611628628:
                    j = 100;
                    m6981 = (C2105.m6981("ۤۘ") ^ i4) * (-41);
                    i5 = ((m6981 ^ i3) * 29839) ^ 200393494;
                    i6 = 535481210;
                case -580739772:
                case -270135528:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = (i3 - C0630.m2566("᩺ᩳ")) * (-45);
                        i5 = ((m6981 ^ i4) * 2985) ^ (-1005454874);
                        i6 = -717905374;
                    } else {
                        m6981 = (C0630.m2566("ۙܰ") ^ i3) * (-91);
                        i5 = ((m6981 ^ i4) * 13939) ^ (-465586989);
                        i6 = 1040365091;
                    }
                case -545986825:
                case 546555570:
                    C1711.m5736();
                    C1504.m5179();
                    m6981 = C2105.m6981("ܳ֫") ^ i3;
                    i5 = ((m6981 ^ i4) * 15871) ^ 1572097113;
                    i6 = -1467952456;
                case -475237762:
                case 1870308522:
                    C3746.m11369();
                    if (C0483.m2121()) {
                        m6981 = (i3 - C0630.m2566("᩺ᩳ")) * (-45);
                        i5 = ((m6981 ^ i4) * 2985) ^ (-1005454874);
                        i6 = -717905374;
                    } else {
                        m6981 = C2105.m6981("ܳ֫") ^ i3;
                        i5 = ((m6981 ^ i4) * 15871) ^ 1572097113;
                        i6 = -1467952456;
                    }
                case -409368159:
                case -358736636:
                    if (C2126.f7087) {
                        m6981 = C2105.m6981("ܳ֫") ^ i3;
                        i5 = ((m6981 ^ i4) * 15871) ^ 1572097113;
                        i6 = -1467952456;
                    } else {
                        m6981 = C0630.m2566("ᩳ۫") ^ i3;
                        i5 = ((m6981 ^ i4) * 4571) ^ 2035912113;
                        i6 = -934879033;
                    }
                case -365133193:
                case 1232692088:
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = C0630.m2566("ܶܿ") ^ i4;
                        i5 = ((m6981 ^ i3) * 25427) ^ (-872522090);
                        i6 = 762412598;
                    } else {
                        m6981 = C0630.m2566("ۨ֨") ^ i4;
                        i5 = ((m6981 ^ i3) * 4163) ^ 1039332151;
                        i6 = -1248349506;
                    }
                case -305212884:
                case 1745021150:
                    if (C4075.f12947 >= 0) {
                        m6981 = C2105.m6981("ܳ֫") ^ i3;
                        i5 = ((m6981 ^ i4) * 15871) ^ 1572097113;
                        i6 = -1467952456;
                    } else {
                        m6981 = (C0630.m2566("ۘᩳ") ^ i3) * (-53);
                        i5 = ((m6981 ^ i4) * (-11715)) ^ (-259023286);
                        i6 = 995399184;
                    }
                case -160904103:
                case 1219592589:
                    if (C3683.f11629 >= 0) {
                        m6981 = C2105.m6981("ۗۚ") ^ i4;
                        i5 = ((m6981 ^ i3) * 18253) ^ 713224232;
                        i6 = -1318009989;
                    } else {
                        m6981 = C2105.m6981("ۙ᩷") ^ i4;
                        i5 = ((m6981 ^ i3) * (-3971)) ^ (-1911932162);
                        i6 = -102639286;
                    }
                case 611696799:
                case 895065302:
                    C1916.m6308();
                    if (C2126.f7087) {
                        m6981 = C2105.m6981("ܳ֫") ^ i3;
                        i5 = ((m6981 ^ i4) * 15871) ^ 1572097113;
                        i6 = -1467952456;
                    } else {
                        m6981 = C2105.m6981("ۗۚ") ^ i4;
                        i5 = ((m6981 ^ i3) * 18253) ^ 713224232;
                        i6 = -1318009989;
                    }
                case 648661897:
                case 1753052078:
                    if (C3245.f10203 <= 0) {
                        m6981 = C0630.m2566("ܶܿ") ^ i4;
                        i5 = ((m6981 ^ i3) * 25427) ^ (-872522090);
                        i6 = 762412598;
                    } else {
                        m6981 = C2105.m6981("֫ܺ") ^ i4;
                        i5 = ((m6981 ^ i3) * 25225) ^ (-1705934271);
                        i6 = 1737205148;
                    }
                default:
                    C1504.m5179();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (l.C0630.f2410 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (l.C0630.f2410 > 0) goto L14;
     */
    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11897 m6703(l.ViewOnClickListenerC2040 r24) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6703(l.֫᩵᩷):l.ۨᩴ᩷");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m6691(String str) {
        Bundle bundle;
        int m2566;
        int i;
        int i2;
        Bundle bundle2;
        int i3 = C22628.f73083;
        int i4 = C1773.f6144;
        int m25662 = C0630.m2566("ۢ֡") ^ i4;
        int i5 = ((m25662 ^ i3) * (-15171)) ^ 8573521;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        int i6 = m25662 ^ 955395822;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        char c = 0;
        short s = 0;
        int i16 = -690939617;
        short s2 = 0;
        String str2 = null;
        Bundle bundle3 = null;
        while (true) {
            i16 = i6 ^ (i5 & (((i16 ^ i3) * 14379) >> 31));
            switch (i16) {
                case -2140584888:
                case 968403096:
                    C0382.m1848();
                    if (C3746.f11829 > 0) {
                        int m6981 = C2105.m6981("۫ܳ") ^ i4;
                        i6 = m6981 ^ 1097235546;
                        i5 = ((m6981 ^ i3) * 22173) ^ (-602609198);
                    } else {
                        bundle = bundle3;
                        m2566 = C2105.m6981("۟ۘ") ^ i3;
                        i = ((m2566 ^ i4) * (-21185)) ^ 1681204433;
                        i2 = 1092732354;
                        bundle2 = bundle;
                        i6 = m2566 ^ i2;
                        i5 = i;
                        bundle3 = bundle2;
                    }
                case -1983889912:
                case -1071204812:
                    bundle = bundle3;
                    c = 356;
                    if (C1294.f4556 < 0) {
                        m2566 = C2105.m6981("ۘܿ") ^ i3;
                        i = ((m2566 ^ i4) * (-15611)) ^ 1251167103;
                        i2 = -1799728735;
                        bundle2 = bundle;
                        i6 = m2566 ^ i2;
                        i5 = i;
                        bundle3 = bundle2;
                    }
                    m2566 = C2105.m6981("۫ۨ") ^ i3;
                    i = ((m2566 ^ i4) * 28487) ^ 677951647;
                    i2 = 1594166089;
                    bundle2 = bundle;
                    i6 = m2566 ^ i2;
                    i5 = i;
                    bundle3 = bundle2;
                case -1858929649:
                case -986990268:
                    bundle3.putString(C1773.m5917(sArr4, i7, i8, i11), str);
                    Main.m62((Activity) this, bundle3, false);
                    break;
                case -1796308698:
                case -8596260:
                    bundle = bundle3;
                    i11 = 26392;
                    m2566 = (i3 - C2105.m6981("ۡ֨")) * 25;
                    i = ((m2566 ^ i4) * 26255) ^ 1996204618;
                    i2 = 171215206;
                    bundle2 = bundle;
                    i6 = m2566 ^ i2;
                    i5 = i;
                    bundle3 = bundle2;
                case -1638261506:
                case 1389569636:
                    i8 = 4;
                    if (C2126.f7087) {
                        bundle = bundle3;
                        i7 = 380;
                        m2566 = C2105.m6981("۫ۨ") ^ i3;
                        i = ((m2566 ^ i4) * 28487) ^ 677951647;
                        i2 = 1594166089;
                        bundle2 = bundle;
                        i6 = m2566 ^ i2;
                        i5 = i;
                        bundle3 = bundle2;
                    } else {
                        int m25663 = (C0630.m2566("ܽ᩺") + i3) * 65;
                        i5 = ((m25663 ^ i4) * (-19143)) ^ 671977293;
                        i6 = m25663 ^ 1808779396;
                        i7 = 380;
                    }
                case -1614133794:
                case 1008749474:
                    bundle = bundle3;
                    i11 = 37936;
                    m2566 = (i3 - C2105.m6981("ۡ֨")) * 25;
                    i = ((m2566 ^ i4) * 26255) ^ 1996204618;
                    i2 = 171215206;
                    bundle2 = bundle;
                    i6 = m2566 ^ i2;
                    i5 = i;
                    bundle3 = bundle2;
                case -1587966939:
                case 507003744:
                    bundle = bundle3;
                    s = sArr[c];
                    s2 = 6316;
                    if (C0237.f1507 == 0) {
                        m2566 = C2105.m6981("᩶ܶ") ^ i4;
                        i = ((m2566 ^ i3) * (-15645)) ^ 1923681751;
                        i2 = 136712897;
                        bundle2 = bundle;
                        i6 = m2566 ^ i2;
                        i5 = i;
                        bundle3 = bundle2;
                    }
                    m2566 = C2105.m6981("۫ۨ") ^ i3;
                    i = ((m2566 ^ i4) * 28487) ^ 677951647;
                    i2 = 1594166089;
                    bundle2 = bundle;
                    i6 = m2566 ^ i2;
                    i5 = i;
                    bundle3 = bundle2;
                case -1207279295:
                case -819111556:
                    bundle = bundle3;
                    i12 = 357;
                    i13 = 9;
                    if (C5695.m16023() < 0) {
                        m2566 = (C0630.m2566("ۖᩳ") ^ i3) * (-85);
                        i = ((m2566 ^ i4) * (-28455)) ^ (-229684598);
                        i2 = 1766469403;
                        bundle2 = bundle;
                        i6 = m2566 ^ i2;
                        i5 = i;
                        bundle3 = bundle2;
                    }
                    m2566 = C2105.m6981("۟ۘ") ^ i3;
                    i = ((m2566 ^ i4) * (-21185)) ^ 1681204433;
                    i2 = 1092732354;
                    bundle2 = bundle;
                    i6 = m2566 ^ i2;
                    i5 = i;
                    bundle3 = bundle2;
                case -1204873785:
                case 1914279921:
                    bundle = bundle3;
                    str2 = C0237.m1483(sArr2, i12, i13, i11);
                    sArr3 = f6807;
                    i14 = 366;
                    if (C21923.f70183 == 0) {
                        m2566 = C2105.m6981("ۗ᩹") ^ i4;
                        i = ((m2566 ^ i3) * (-14067)) ^ (-83995326);
                        i2 = 1507716400;
                        bundle2 = bundle;
                        i6 = m2566 ^ i2;
                        i5 = i;
                        bundle3 = bundle2;
                    }
                    m2566 = C0630.m2566("֨ܳ") ^ i4;
                    i = ((m2566 ^ i3) * 11669) ^ 1357905388;
                    i2 = -308551081;
                    bundle2 = bundle;
                    i6 = m2566 ^ i2;
                    i5 = i;
                    bundle3 = bundle2;
                case -1020906198:
                case 180424240:
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        int m69812 = C2105.m6981("۫ܳ") ^ i4;
                        i6 = m69812 ^ 1097235546;
                        i5 = ((m69812 ^ i3) * 22173) ^ (-602609198);
                    } else {
                        bundle = bundle3;
                        m2566 = C2105.m6981("۫ۨ") ^ i3;
                        i = ((m2566 ^ i4) * 28487) ^ 677951647;
                        i2 = 1594166089;
                        bundle2 = bundle;
                        i6 = m2566 ^ i2;
                        i5 = i;
                        bundle3 = bundle2;
                    }
                case -393967216:
                case 1793511671:
                    if (RunnableC3474.f10992 > 0) {
                        int m698122 = C2105.m6981("۫ܳ") ^ i4;
                        i6 = m698122 ^ 1097235546;
                        i5 = ((m698122 ^ i3) * 22173) ^ (-602609198);
                    } else {
                        m2566 = (C0630.m2566("ۡ۟") + i4) * (-9);
                        bundle = bundle3;
                        i = ((m2566 ^ i3) * (-26041)) ^ 1842477913;
                        i2 = -618228476;
                        bundle2 = bundle;
                        i6 = m2566 ^ i2;
                        i5 = i;
                        bundle3 = bundle2;
                    }
                case -211007617:
                case 647514295:
                    bundle = bundle3;
                    i9 = s * s2;
                    short s3 = s;
                    i10 = s3 + 1579;
                    if (C5695.f17556 >= 0) {
                        s = s3;
                        m2566 = C2105.m6981("۫ۨ") ^ i3;
                        i = ((m2566 ^ i4) * 28487) ^ 677951647;
                        i2 = 1594166089;
                        bundle2 = bundle;
                        i6 = m2566 ^ i2;
                        i5 = i;
                        bundle3 = bundle2;
                    } else {
                        int m25664 = (C0630.m2566("ۤۢ") + i3) * 115;
                        s = s3;
                        i5 = ((m25664 ^ i4) * 6581) ^ (-1967187203);
                        bundle2 = bundle;
                        i6 = m25664 ^ 1413787610;
                        bundle3 = bundle2;
                    }
                case 367881757:
                case 1958877432:
                    C0237.m1481();
                    C3537.m10746();
                    int m6981222 = C2105.m6981("۫ܳ") ^ i4;
                    i6 = m6981222 ^ 1097235546;
                    i5 = ((m6981222 ^ i3) * 22173) ^ (-602609198);
                case 374314471:
                case 379722356:
                    bundle = bundle3;
                    sArr = f6807;
                    if (!C0382.m1848()) {
                        m2566 = C0630.m2566("ۧ᩶") ^ i4;
                        i = ((m2566 ^ i3) * (-11319)) ^ (-1790774026);
                        i2 = -1484935279;
                        bundle2 = bundle;
                        i6 = m2566 ^ i2;
                        i5 = i;
                        bundle3 = bundle2;
                    }
                    m2566 = C2105.m6981("۫ۨ") ^ i3;
                    i = ((m2566 ^ i4) * 28487) ^ 677951647;
                    i2 = 1594166089;
                    bundle2 = bundle;
                    i6 = m2566 ^ i2;
                    i5 = i;
                    bundle3 = bundle2;
                case 610630877:
                case 1629195081:
                    bundle = bundle3;
                    if (i9 - (i10 * i10) > 0) {
                        m2566 = (C0630.m2566("ۡ᩶") + i3) * (-59);
                        i = ((m2566 ^ i4) * 2925) ^ (-417169270);
                        i2 = -1470733990;
                    } else {
                        m2566 = (C0630.m2566("ۙۜ") ^ i4) * (-75);
                        i = ((m2566 ^ i3) * (-29841)) ^ (-1202321380);
                        i2 = -1323919547;
                    }
                    bundle2 = bundle;
                    i6 = m2566 ^ i2;
                    i5 = i;
                    bundle3 = bundle2;
                case 672868927:
                case 1876672516:
                    C0237.m1481();
                    C2167.m7155();
                    break;
                case 789041667:
                case 858621067:
                    bundle3.putString(str2, C4616.m13542(sArr3, i14, i15, i11));
                    sArr4 = f6807;
                    if (C21923.f70183 == 0) {
                        m2566 = C2105.m6981("ܳᩴ") ^ i4;
                        bundle = bundle3;
                        i = ((m2566 ^ i3) * 12159) ^ 1067122134;
                        i2 = -1327004503;
                        bundle2 = bundle;
                        i6 = m2566 ^ i2;
                        i5 = i;
                        bundle3 = bundle2;
                    }
                    bundle = bundle3;
                    m2566 = C2105.m6981("۫ۨ") ^ i3;
                    i = ((m2566 ^ i4) * 28487) ^ 677951647;
                    i2 = 1594166089;
                    bundle2 = bundle;
                    i6 = m2566 ^ i2;
                    i5 = i;
                    bundle3 = bundle2;
                case 1227014906:
                case 1247511942:
                    bundle3 = new Bundle();
                    sArr2 = f6807;
                    if (C1916.m6308() < 0) {
                        m2566 = (i4 - C2105.m6981("ۗ۬")) * 53;
                        bundle = bundle3;
                        i = ((m2566 ^ i3) * 8577) ^ (-130593045);
                        i2 = 353210996;
                        bundle2 = bundle;
                        i6 = m2566 ^ i2;
                        i5 = i;
                        bundle3 = bundle2;
                    }
                    m2566 = (C0630.m2566("ۡ۟") + i4) * (-9);
                    bundle = bundle3;
                    i = ((m2566 ^ i3) * (-26041)) ^ 1842477913;
                    i2 = -618228476;
                    bundle2 = bundle;
                    i6 = m2566 ^ i2;
                    i5 = i;
                    bundle3 = bundle2;
                default:
                    bundle = bundle3;
                    i15 = 14;
                    if (C4075.m12263() > 0) {
                        m2566 = C2105.m6981("ۡۙ") ^ i3;
                        i = ((m2566 ^ i4) * 8033) ^ (-878631835);
                        i2 = 451152120;
                        bundle2 = bundle;
                        i6 = m2566 ^ i2;
                        i5 = i;
                        bundle3 = bundle2;
                    }
                    m2566 = C0630.m2566("֨ܳ") ^ i4;
                    i = ((m2566 ^ i3) * 11669) ^ 1357905388;
                    i2 = -308551081;
                    bundle2 = bundle;
                    i6 = m2566 ^ i2;
                    i5 = i;
                    bundle3 = bundle2;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6650(ViewOnClickListenerC2040 viewOnClickListenerC2040, int i) {
        long j = 0;
        int i2 = 1499873080;
        int i3 = C3683.f11629;
        int i4 = RunnableC1937.f6483;
        int m6981 = C2105.m6981("ܺ᩵") ^ i3;
        int i5 = ((m6981 ^ i4) * b.g) ^ 1497237923;
        int i6 = -1604259375;
        while (true) {
            i2 = ((((i2 ^ i4) * 631) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -2097881363:
                case 940518830:
                    if (C2520.f8000 >= 0) {
                        m6981 = C0630.m2566("ܽ᩻") ^ i4;
                        i5 = ((m6981 ^ i3) * (-1767)) ^ 1449889966;
                        i6 = -168003609;
                    } else {
                        m6981 = (i4 - C2105.m6981("ᩳۗ")) * 109;
                        i5 = ((m6981 ^ i3) * 17197) ^ (-2070922343);
                        i6 = -1832197330;
                    }
                case -1949764843:
                case 746272328:
                    if (C4616.f14690 <= 0) {
                        m6981 = (i4 - C0630.m2566("֡ۘ")) * (-99);
                        i5 = ((m6981 ^ i3) * (-25907)) ^ 2106787763;
                        i6 = -118983068;
                    } else {
                        m6981 = C0630.m2566("۬֫") ^ i4;
                        i5 = ((m6981 ^ i3) * (-20417)) ^ (-1402122215);
                        i6 = 19182240;
                    }
                case -1905320896:
                case -828481058:
                    if (RunnableC1108.f4040) {
                        m6981 = (i3 - C0630.m2566("᩵᩷")) * (-87);
                        i5 = ((m6981 ^ i4) * 28027) ^ (-761674386);
                        i6 = -897062965;
                    } else {
                        m6981 = C0630.m2566("۟᩶") ^ i3;
                        i5 = ((m6981 ^ i4) * (-31863)) ^ 645415195;
                        i6 = 1239995694;
                    }
                case -1865961035:
                case 1249155748:
                    j = 100;
                    m6981 = (C2105.m6981("֫᩺") ^ i3) * (-87);
                    i5 = ((m6981 ^ i4) * 4037) ^ 815006331;
                    i6 = -1219876886;
                case -1801489553:
                case -1320722845:
                    C4159.m12565();
                    if (RunnableC1937.f6483 < 0) {
                        m6981 = C0630.m2566("۟᩶") ^ i3;
                        i5 = ((m6981 ^ i4) * (-31863)) ^ 645415195;
                        i6 = 1239995694;
                    } else {
                        m6981 = C0630.m2566("ܽ᩻") ^ i4;
                        i5 = ((m6981 ^ i3) * (-1767)) ^ 1449889966;
                        i6 = -168003609;
                    }
                case -1576520402:
                case -62472898:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = C0630.m2566("۟᩶") ^ i3;
                        i5 = ((m6981 ^ i4) * (-31863)) ^ 645415195;
                        i6 = 1239995694;
                    } else {
                        m6981 = (i4 - C2105.m6981("֨ۨ")) * 115;
                        i5 = ((m6981 ^ i3) * 26035) ^ (-1511643461);
                        i6 = -1445990041;
                    }
                case -1116734540:
                case 1645600159:
                    C1916.m6308();
                    break;
                case -1040785877:
                case 549752953:
                    if (C11340.f33930 >= 0) {
                        m6981 = C2105.m6981("ܶ۬") ^ i3;
                        i5 = ((m6981 ^ i4) * 11709) ^ (-1097164127);
                        i6 = 1170242040;
                    } else {
                        m6981 = (C2105.m6981("ۤ۟") + i3) * 75;
                        i5 = ((m6981 ^ i4) * 8937) ^ 1312567834;
                        i6 = -1595807788;
                    }
                case -859858701:
                case 1048024730:
                    if (C4159.m12565() >= 0) {
                        m6981 = C2105.m6981("ܶ۬") ^ i3;
                        i5 = ((m6981 ^ i4) * 11709) ^ (-1097164127);
                        i6 = 1170242040;
                    } else {
                        m6981 = (C2105.m6981("ܺܺ") ^ i4) * (-17);
                        i5 = ((m6981 ^ i3) * 19677) ^ 1355934499;
                        i6 = 1761377061;
                    }
                case -625541100:
                case 82284460:
                    if (C3537.f11231 >= 0) {
                        m6981 = C2105.m6981("ܶ۬") ^ i3;
                        i5 = ((m6981 ^ i4) * 11709) ^ (-1097164127);
                        i6 = 1170242040;
                    } else {
                        m6981 = (i4 - C0630.m2566("ۛܰ")) * (-117);
                        i5 = ((m6981 ^ i3) * 6703) ^ (-880678000);
                        i6 = 1094358614;
                    }
                case -546828309:
                case -541853745:
                    if (C0382.f1805) {
                        m6981 = C2105.m6981("ܶ۬") ^ i3;
                        i5 = ((m6981 ^ i4) * 11709) ^ (-1097164127);
                        i6 = 1170242040;
                    } else {
                        m6981 = C0630.m2566("۟᩶") ^ i3;
                        i5 = ((m6981 ^ i4) * (-31863)) ^ 645415195;
                        i6 = 1239995694;
                    }
                case -445324592:
                case 2134169463:
                    break;
                case -424118768:
                case 1424476743:
                    if (C4117.f13076 <= 0) {
                        m6981 = (C0630.m2566("᩸ۛ") ^ i4) * (-97);
                        i5 = ((m6981 ^ i3) * 27555) ^ (-292065462);
                        i6 = 1721864124;
                    } else {
                        m6981 = (C0630.m2566("᩶ۘ") ^ i3) * 53;
                        i5 = ((m6981 ^ i4) * (-13775)) ^ (-1065905359);
                        i6 = 1673613797;
                    }
                case -344086337:
                case 655702995:
                    if (C2126.f7087) {
                        m6981 = C0630.m2566("۟᩶") ^ i3;
                        i5 = ((m6981 ^ i4) * (-31863)) ^ 645415195;
                        i6 = 1239995694;
                    } else {
                        m6981 = (C2105.m6981("᩸ۘ") + i3) * (-105);
                        i5 = ((m6981 ^ i4) * 18431) ^ (-2031128324);
                        i6 = 806012294;
                    }
                case 281378354:
                case 1842259203:
                    if (C3746.f11829 > 0) {
                        m6981 = C0630.m2566("ܽ᩻") ^ i4;
                        i5 = ((m6981 ^ i3) * (-1767)) ^ 1449889966;
                        i6 = -168003609;
                    } else {
                        m6981 = (C0630.m2566("᩸ۛ") ^ i4) * (-97);
                        i5 = ((m6981 ^ i3) * 27555) ^ (-292065462);
                        i6 = 1721864124;
                    }
                case 302382545:
                case 1437735735:
                    if (C3537.f11231 >= 0) {
                        m6981 = (C0630.m2566("᩸ۛ") ^ i4) * (-97);
                        i5 = ((m6981 ^ i3) * 27555) ^ (-292065462);
                        i6 = 1721864124;
                    } else {
                        m6981 = (i3 - C2105.m6981("ܿ᩵")) * (-115);
                        i5 = ((m6981 ^ i4) * 10887) ^ (-799808466);
                        i6 = -339004008;
                    }
                case 384390604:
                case 1679774227:
                    C0714.m2805();
                    m6981 = C0630.m2566("۟᩶") ^ i3;
                    i5 = ((m6981 ^ i4) * (-31863)) ^ 645415195;
                    i6 = 1239995694;
                default:
                    try {
                        SystemClock.sleep(j);
                        C3430 c3430 = viewOnClickListenerC2040.f6815;
                        viewOnClickListenerC2040.m6648(c3430.f10837.f65737, c3430.f10842, viewOnClickListenerC2040.f6819, i);
                    } catch (Exception unused) {
                    }
                    m6981 = (C2105.m6981("᩸ۧ") + i4) * 33;
                    i5 = ((m6981 ^ i3) * (-4225)) ^ 1582750731;
                    i6 = -1308706098;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6660(final ViewOnClickListenerC2040 viewOnClickListenerC2040, final ViewOnClickListenerC23185 viewOnClickListenerC23185) {
        C19258 c19258;
        int i;
        View view;
        String str;
        short[] sArr;
        TextView textView;
        final String str2;
        TextView textView2;
        int m6981;
        int i2;
        int i3;
        TextView textView3;
        C19258 c192582;
        String str3;
        int i4;
        int i5;
        View view2;
        String str4;
        short[] sArr2;
        String str5;
        TextView textView4;
        int m69812;
        int i6;
        int i7;
        int m69813;
        int i8;
        String str6;
        String str7;
        View view3;
        int i9;
        short[] sArr3;
        String str8;
        String str9;
        C19258 c192583;
        String str10;
        View view4;
        int m69814;
        int i10;
        int i11;
        TextView textView5;
        String str11;
        C19258 c192584;
        View view5;
        int m69815;
        int i12;
        int i13;
        int i14;
        int i15;
        View view6 = null;
        TextView textView6 = null;
        int i16 = 0;
        int i17 = 1540688231;
        int i18 = C3746.f11829;
        int i19 = C1128.f4106;
        int m69816 = C2105.m6981("۫᩷") ^ i18;
        int i20 = ((m69816 ^ i19) * 28263) ^ (-742273692);
        int i21 = m69816 ^ 1982909446;
        final TextView textView7 = null;
        TextView textView8 = null;
        C19258 c192585 = null;
        String str12 = null;
        String str13 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        String str14 = null;
        View view7 = null;
        String str15 = null;
        TextView textView9 = null;
        short[] sArr6 = null;
        int i26 = 0;
        PackageInfo packageInfo = null;
        AbstractC15440 abstractC15440 = null;
        String str16 = null;
        String str17 = null;
        int i27 = 0;
        int i28 = 0;
        TextView textView10 = null;
        View view8 = null;
        final C4841 c4841 = null;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i19) * (-6173)) >> 31));
            switch (i17) {
                case -2121524252:
                case -1908416050:
                    str9 = str17;
                    c192583 = c192585;
                    str10 = str16;
                    view4 = view8;
                    if (Build.VERSION.SDK_INT >= 34) {
                        m69814 = C2105.m6981("᩻᩵") ^ i19;
                        i10 = ((m69814 ^ i18) * 32353) ^ (-671041892);
                        i11 = 1562351279;
                        i21 = m69814 ^ i11;
                        view8 = view4;
                        c192585 = c192583;
                        str16 = str10;
                        int i29 = i10;
                        str17 = str9;
                        i20 = i29;
                    }
                    m69814 = (C0630.m2566("ܶܳ") ^ i18) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i10 = ((m69814 ^ i19) * 11357) ^ (-148880403);
                    i11 = 2005953338;
                    i21 = m69814 ^ i11;
                    view8 = view4;
                    c192585 = c192583;
                    str16 = str10;
                    int i292 = i10;
                    str17 = str9;
                    i20 = i292;
                case -2100529562:
                case -43121338:
                    textView5 = textView9;
                    C5695.m16017(c192585, C2105.m6981(C1916.m6311(f6807, 180, 3, i27)) ^ 2102411354, null);
                    final DialogInterfaceC0206 m11213 = C3683.m11213(c192585);
                    viewOnClickListenerC2040.f6828 = m11213;
                    str11 = str17;
                    final long m27291 = C10986.m27291(str16);
                    c192584 = c192585;
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        m11213.m1436(new DialogInterface.OnDismissListener(viewOnClickListenerC2040) { // from class: l.ܳۘ᩷

                            /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ ViewOnClickListenerC2040 f43056;

                            {
                                int i30 = 612041748;
                                int i31 = C5695.f17556;
                                int i32 = C0630.f2410;
                                int m69817 = (C2105.m6981("ۡۜ") ^ i32) * (-65);
                                int i33 = ((m69817 ^ i31) * (-9019)) ^ 990498464;
                                int i34 = -832949137;
                                while (true) {
                                    i30 = ((((i30 ^ i31) * 3221) >> 31) & i33) ^ (m69817 ^ i34);
                                    switch (i30) {
                                        case -1954649185:
                                        case 664580242:
                                            if (C22628.f73083 <= 0) {
                                                m69817 = (C0630.m2566("ۛ᩵") + i32) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i33 = ((m69817 ^ i31) * 13511) ^ 146813338;
                                                i34 = 1730718637;
                                            } else {
                                                m69817 = (C0630.m2566("ۜ۬") ^ i31) * 53;
                                                i33 = ((m69817 ^ i32) * 32707) ^ (-488053617);
                                                i34 = 1397249236;
                                            }
                                        case -1899199240:
                                        case -316858283:
                                            if (RunnableC1937.m6387() != 0) {
                                                m69817 = C2105.m6981("ۡ᩺") ^ i32;
                                                i33 = ((m69817 ^ i31) * 32687) ^ 1847891530;
                                                i34 = 1801571960;
                                            } else {
                                                m69817 = (C0630.m2566("᩶᩹") ^ i32) * 57;
                                                i33 = ((m69817 ^ i31) * (-23987)) ^ (-415910449);
                                                i34 = 375539215;
                                            }
                                        case -1749415216:
                                        case 1776121836:
                                            if (C0422.f1886 <= 0) {
                                                m69817 = C2105.m6981("ۡ᩺") ^ i32;
                                                i33 = ((m69817 ^ i31) * 32687) ^ 1847891530;
                                                i34 = 1801571960;
                                            } else {
                                                m69817 = (C0630.m2566("۠ۚ") + i31) * (-59);
                                                i33 = ((m69817 ^ i32) * 12721) ^ 1555844144;
                                                i34 = -1838503368;
                                            }
                                        case -1660321417:
                                        case 1340044519:
                                            if (C3019.f9544 >= 0) {
                                                m69817 = C0630.m2566("᩵ۤ") ^ i32;
                                                i33 = ((m69817 ^ i31) * 5465) ^ (-904603659);
                                                i34 = 941764461;
                                            } else {
                                                m69817 = C2105.m6981("ۛ᩹") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-5025)) ^ (-1668778280);
                                                i34 = -638936886;
                                            }
                                        case -1360600810:
                                        case 1010046000:
                                            ViewOnClickListenerC1958.m6429();
                                            C7811.m20844();
                                            m69817 = (C0630.m2566("ۛ᩵") + i32) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i33 = ((m69817 ^ i31) * 13511) ^ 146813338;
                                            i34 = 1730718637;
                                        case -1187338259:
                                        case -14456938:
                                            C3683.m11222();
                                            C0630.m2564();
                                            throw new RuntimeException();
                                        case -1132355434:
                                        case -1066578718:
                                            C0050.m940();
                                            if (ViewOnClickListenerC1958.m6429() >= 0) {
                                                m69817 = (C0630.m2566("ۛ᩵") + i32) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i33 = ((m69817 ^ i31) * 13511) ^ 146813338;
                                                i34 = 1730718637;
                                            } else {
                                                m69817 = (C2105.m6981("ۜ᩶") ^ i31) * 11;
                                                i33 = ((m69817 ^ i32) * 19879) ^ (-104349959);
                                                i34 = 223476863;
                                            }
                                        case -965577875:
                                        case -831964802:
                                            return;
                                        case -299495678:
                                        case 1217186764:
                                            if (ViewOnClickListenerC1958.f6529 <= 0) {
                                                m69817 = (C2105.m6981("ۜ᩶") ^ i31) * 11;
                                                i33 = ((m69817 ^ i32) * 19879) ^ (-104349959);
                                                i34 = 223476863;
                                            } else {
                                                m69817 = (C0630.m2566("ۧ᩷") ^ i31) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                                                i33 = ((m69817 ^ i32) * 20319) ^ (-721646701);
                                                i34 = -1750270765;
                                            }
                                        case -131995052:
                                        case 878510008:
                                            if (C3245.f10203 <= 0) {
                                                m69817 = (C2105.m6981("ۜ᩶") ^ i31) * 11;
                                                i33 = ((m69817 ^ i32) * 19879) ^ (-104349959);
                                                i34 = 223476863;
                                            } else {
                                                m69817 = (C0630.m2566("᩸ܿ") + i31) * 47;
                                                i33 = ((m69817 ^ i32) * (-13847)) ^ 182036681;
                                                i34 = 1621871063;
                                            }
                                        case 114731068:
                                        case 1345697748:
                                            if (C0964.f3626 != 0) {
                                                m69817 = C0630.m2566("᩵ۤ") ^ i32;
                                                i33 = ((m69817 ^ i31) * 5465) ^ (-904603659);
                                                i34 = 941764461;
                                            } else {
                                                m69817 = (C0630.m2566("ۨ᩻") + i32) * (-25);
                                                i33 = ((m69817 ^ i31) * 11749) ^ 1337299908;
                                                i34 = -1290065633;
                                            }
                                        case 498759871:
                                        case 1653734180:
                                            if (C2126.f7087) {
                                                m69817 = C0630.m2566("ۤ۠") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-29481)) ^ (-1857093377);
                                                i34 = 1370905789;
                                            } else {
                                                m69817 = (C0630.m2566("ۛ᩵") + i32) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i33 = ((m69817 ^ i31) * 13511) ^ 146813338;
                                                i34 = 1730718637;
                                            }
                                        case 547409576:
                                        case 924369164:
                                            this.f43056 = viewOnClickListenerC2040;
                                            if (C2126.m7040()) {
                                                m69817 = C2105.m6981("ۡ᩺") ^ i32;
                                                i33 = ((m69817 ^ i31) * 32687) ^ 1847891530;
                                                i34 = 1801571960;
                                            } else {
                                                m69817 = (C2105.m6981("᩷۠") ^ i32) * 17;
                                                i33 = ((m69817 ^ i31) * (-19685)) ^ 1237041526;
                                                i34 = -338224131;
                                            }
                                        case 560460309:
                                        case 835833479:
                                            ViewOnClickListenerC1958.m6429();
                                            if (C0382.m1848()) {
                                                m69817 = C0630.m2566("᩵ۤ") ^ i32;
                                                i33 = ((m69817 ^ i31) * 5465) ^ (-904603659);
                                                i34 = 941764461;
                                            } else {
                                                m69817 = (C0630.m2566("ۛ᩵") + i32) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i33 = ((m69817 ^ i31) * 13511) ^ 146813338;
                                                i34 = 1730718637;
                                            }
                                        case 606849802:
                                        case 886920803:
                                            if (C1128.f4106 <= 0) {
                                                m69817 = C2105.m6981("ۡ᩺") ^ i32;
                                                i33 = ((m69817 ^ i31) * 32687) ^ 1847891530;
                                                i34 = 1801571960;
                                            } else {
                                                m69817 = C0630.m2566("֡۟") ^ i32;
                                                i33 = ((m69817 ^ i31) * 2047) ^ (-760618407);
                                                i34 = 176549324;
                                            }
                                        default:
                                            if (RunnableC1937.m6387() != 0) {
                                                m69817 = (C2105.m6981("ۜ᩶") ^ i31) * 11;
                                                i33 = ((m69817 ^ i32) * 19879) ^ (-104349959);
                                                i34 = 223476863;
                                            } else {
                                                m69817 = C0630.m2566("ܺ᩸") ^ i32;
                                                i33 = ((m69817 ^ i31) * 14379) ^ (-1424272311);
                                                i34 = 1861020288;
                                            }
                                    }
                                }
                            }

                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                long j = 0;
                                int i30 = -251128317;
                                int i31 = RunnableC1937.f6483;
                                int i32 = C11340.f33930;
                                int m69817 = (C2105.m6981("۫ܳ") + i31) * (-17);
                                int i33 = ((m69817 ^ i32) * (-27471)) ^ (-1150733009);
                                int i34 = 20636310;
                                while (true) {
                                    i30 = ((((i30 ^ i32) * (-30787)) >> 31) & i33) ^ (m69817 ^ i34);
                                    switch (i30) {
                                        case -2124242886:
                                        case 1496684556:
                                            C2167.m7155();
                                            break;
                                        case -2121111067:
                                        case 525451361:
                                            if (C2167.m7155()) {
                                                m69817 = C0630.m2566("ܽۜ") ^ i32;
                                                i33 = ((m69817 ^ i31) * (-27303)) ^ 1508169260;
                                                i34 = 1368978650;
                                            } else {
                                                m69817 = (C2105.m6981("֡֨") ^ i32) * (-117);
                                                i33 = ((m69817 ^ i31) * (-18967)) ^ (-1439949040);
                                                i34 = -269541351;
                                            }
                                        case -2058652912:
                                        case 1111543460:
                                            if (C21923.f70183 != 0) {
                                                m69817 = C0630.m2566("᩹ۖ") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-23917)) ^ (-2138815396);
                                                i34 = -1470452799;
                                            } else {
                                                m69817 = C0630.m2566("ܽۙ") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-21441)) ^ 933456727;
                                                i34 = 551516430;
                                            }
                                        case -1827328653:
                                        case -1135326261:
                                            ViewOnClickListenerC2040.m6651(this.f43056, j, m11213);
                                            break;
                                        case -1816494109:
                                        case -741345178:
                                            ViewOnClickListenerC1958.m6429();
                                            if (C1294.f4556 < 0) {
                                                m69817 = (i32 - C2105.m6981("ۨᩴ")) * (-99);
                                                i33 = ((m69817 ^ i31) * (-3743)) ^ 307292844;
                                                i34 = 1970108874;
                                            } else {
                                                m69817 = C0630.m2566("ܽۜ") ^ i32;
                                                i33 = ((m69817 ^ i31) * (-27303)) ^ 1508169260;
                                                i34 = 1368978650;
                                            }
                                        case -1730981221:
                                        case -412752720:
                                            if (C2272.m7503()) {
                                                m69817 = (i32 - C2105.m6981("ۨᩴ")) * (-99);
                                                i33 = ((m69817 ^ i31) * (-3743)) ^ 307292844;
                                                i34 = 1970108874;
                                            } else {
                                                m69817 = C2105.m6981("ۨ֡") ^ i32;
                                                i33 = ((m69817 ^ i31) * (-10629)) ^ (-678377856);
                                                i34 = 837765751;
                                            }
                                        case -1461991143:
                                        case -1321451240:
                                            if (C11340.f33930 >= 0) {
                                                m69817 = C0630.m2566("ܰ۫") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-22613)) ^ (-1111538394);
                                                i34 = -1497212844;
                                            } else {
                                                m69817 = C2105.m6981("֫ۖ") ^ i32;
                                                i33 = ((m69817 ^ i31) * (-31911)) ^ (-958116230);
                                                i34 = -1505622176;
                                            }
                                        case -1248059545:
                                        case -440027406:
                                            j = m27291;
                                            if (ServiceConnectionC3453.m10564() <= 0) {
                                                m69817 = C0630.m2566("᩹ۖ") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-23917)) ^ (-2138815396);
                                                i34 = -1470452799;
                                            } else {
                                                m69817 = (i31 - C2105.m6981("ۙ᩷")) * 19;
                                                i33 = ((m69817 ^ i32) * (-18637)) ^ 110331536;
                                                i34 = 1086518647;
                                            }
                                        case -1232600434:
                                        case -1063943806:
                                            if (C1504.f5354) {
                                                m69817 = (i32 - C2105.m6981("ۨᩴ")) * (-99);
                                                i33 = ((m69817 ^ i31) * (-3743)) ^ 307292844;
                                                i34 = 1970108874;
                                            } else {
                                                m69817 = (C0630.m2566("᩻֡") ^ i31) * (-55);
                                                i33 = ((m69817 ^ i32) * (-5775)) ^ (-894543484);
                                                i34 = 770038556;
                                            }
                                        case -1114661199:
                                        case 2133109975:
                                            if (C4075.m12263() <= 0) {
                                                m69817 = C0630.m2566("ܽۜ") ^ i32;
                                                i33 = ((m69817 ^ i31) * (-27303)) ^ 1508169260;
                                                i34 = 1368978650;
                                            } else {
                                                m69817 = C0630.m2566("ᩳ۠") ^ i32;
                                                i33 = ((m69817 ^ i31) * 1671) ^ 1072130686;
                                                i34 = -1332459982;
                                            }
                                        case -718810432:
                                        case 1690131395:
                                            if (C3537.m10746() <= 0) {
                                                m69817 = C0630.m2566("᩹ۖ") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-23917)) ^ (-2138815396);
                                                i34 = -1470452799;
                                            } else {
                                                m69817 = C2105.m6981("ۤܿ") ^ i32;
                                                i33 = ((m69817 ^ i31) * (-6067)) ^ 1410423461;
                                                i34 = 1654847849;
                                            }
                                        case -19879387:
                                        case 1324717208:
                                            if (RunnableC0588.f2309 >= 0) {
                                                m69817 = C0630.m2566("ܰ۫") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-22613)) ^ (-1111538394);
                                                i34 = -1497212844;
                                            } else {
                                                m69817 = C0630.m2566("ۖ۠") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-31075)) ^ 857127562;
                                                i34 = 745315153;
                                            }
                                        case 647161787:
                                        case 968511382:
                                            if (C0050.f910 < 0) {
                                                m69817 = C0630.m2566("ܰ۫") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-22613)) ^ (-1111538394);
                                                i34 = -1497212844;
                                            } else {
                                                m69817 = C2105.m6981("ۘ۟") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-29349)) ^ 868963214;
                                                i34 = 1110244427;
                                            }
                                        case 924934853:
                                        case 949717612:
                                            ServiceConnectionC3453.m10564();
                                            C7811.m20844();
                                            m69817 = (i32 - C2105.m6981("ۨᩴ")) * (-99);
                                            i33 = ((m69817 ^ i31) * (-3743)) ^ 307292844;
                                            i34 = 1970108874;
                                        case 1125479224:
                                        case 1919456983:
                                            if (C4263.m12819() >= 0) {
                                                m69817 = C0630.m2566("ܰ۫") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-22613)) ^ (-1111538394);
                                                i34 = -1497212844;
                                            } else {
                                                m69817 = (i31 - C0630.m2566("ۙۜ")) * (-21);
                                                i33 = ((m69817 ^ i32) * 7587) ^ 731852055;
                                                i34 = 389114636;
                                            }
                                        default:
                                            C0422.m1963();
                                            if (C3746.f11829 > 0) {
                                                m69817 = (i32 - C2105.m6981("ۨᩴ")) * (-99);
                                                i33 = ((m69817 ^ i31) * (-3743)) ^ 307292844;
                                                i34 = 1970108874;
                                            } else {
                                                m69817 = C0630.m2566("ܰ۫") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-22613)) ^ (-1111538394);
                                                i34 = -1497212844;
                                            }
                                    }
                                    return;
                                }
                            }
                        });
                        final String str18 = str16;
                        C2105.m6975(C1802.f6208, new Runnable() { // from class: l.᩻ۘ᩷
                            {
                                int i30 = -608838622;
                                int i31 = C3746.f11829;
                                int i32 = AbstractC2021.f6743;
                                int m2566 = (C0630.m2566("֫ۘ") + i32) * (-53);
                                int i33 = ((m2566 ^ i31) * 11331) ^ 427020481;
                                int i34 = -1219755909;
                                while (true) {
                                    i30 = ((((i30 ^ i31) * 10943) >> 31) & i33) ^ (m2566 ^ i34);
                                    switch (i30) {
                                        case -2132958855:
                                        case -82768363:
                                            return;
                                        case -1691208759:
                                        case 1181570073:
                                            if (C7811.f24123 >= 0) {
                                                m2566 = (i32 - C0630.m2566("۟᩵")) * 85;
                                                i33 = ((m2566 ^ i31) * 15231) ^ 692882249;
                                                i34 = 2020139393;
                                            } else {
                                                m2566 = (i31 - C0630.m2566("᩵֫")) * (-115);
                                                i33 = ((m2566 ^ i32) * 26147) ^ 734857542;
                                                i34 = 1840656193;
                                            }
                                        case -1604250878:
                                        case -597554940:
                                            if (C2520.f8000 >= 0) {
                                                m2566 = C0630.m2566("ܽۘ") ^ i32;
                                                i33 = ((m2566 ^ i31) * 17961) ^ (-541665399);
                                                i34 = 1145766753;
                                            } else {
                                                m2566 = (i32 - C2105.m6981("֫᩻")) * (-127);
                                                i33 = ((m2566 ^ i31) * (-7347)) ^ (-1321205338);
                                                i34 = -773858867;
                                            }
                                        case -1178173749:
                                        case 1000897077:
                                            if (C0798.f2919) {
                                                m2566 = C0630.m2566("ܽۘ") ^ i32;
                                                i33 = ((m2566 ^ i31) * 17961) ^ (-541665399);
                                                i34 = 1145766753;
                                            } else {
                                                m2566 = (C2105.m6981("᩶᩹") ^ i32) * (-55);
                                                i33 = ((m2566 ^ i31) * 31509) ^ (-1601042374);
                                                i34 = 1441682972;
                                            }
                                        case -1162483494:
                                        case 1658995384:
                                            if (C11340.f33930 < 0) {
                                                m2566 = C2105.m6981("۟ۢ") ^ i31;
                                                i33 = ((m2566 ^ i32) * (-3237)) ^ 893755853;
                                                i34 = 1112503790;
                                            } else {
                                                m2566 = (C2105.m6981("֡ᩳ") + i32) * (-13);
                                                i33 = ((m2566 ^ i31) * 17937) ^ (-397512284);
                                                i34 = 1860909448;
                                            }
                                        case -1103444528:
                                        case 1347299285:
                                            if (C2520.m8026()) {
                                                m2566 = (C2105.m6981("ۚۨ") ^ i31) * 39;
                                                i33 = ((m2566 ^ i32) * (-9965)) ^ 1012830952;
                                                i34 = 294688727;
                                            } else {
                                                m2566 = C2105.m6981("۟ۢ") ^ i31;
                                                i33 = ((m2566 ^ i32) * (-3237)) ^ 893755853;
                                                i34 = 1112503790;
                                            }
                                        case -891197600:
                                        case 1865587153:
                                            if (C1711.f5919) {
                                                m2566 = C0630.m2566("ܽۘ") ^ i32;
                                                i33 = ((m2566 ^ i31) * 17961) ^ (-541665399);
                                                i34 = 1145766753;
                                            } else {
                                                m2566 = C2105.m6981("ۘܺ") ^ i31;
                                                i33 = ((m2566 ^ i32) * 14405) ^ (-2023001621);
                                                i34 = 149663432;
                                            }
                                        case -729931344:
                                        case 1848786255:
                                            if (C4263.f13799 <= 0) {
                                                m2566 = (C2105.m6981("֡ᩳ") + i32) * (-13);
                                                i33 = ((m2566 ^ i31) * 17937) ^ (-397512284);
                                                i34 = 1860909448;
                                            } else {
                                                m2566 = (C2105.m6981("ܶۘ") ^ i32) * 127;
                                                i33 = ((m2566 ^ i31) * 14595) ^ (-1398017346);
                                                i34 = 1706603862;
                                            }
                                        case -564477852:
                                        case 463477032:
                                            if (C3537.f11231 >= 0) {
                                                m2566 = (C2105.m6981("ۚۨ") ^ i31) * 39;
                                                i33 = ((m2566 ^ i32) * (-9965)) ^ 1012830952;
                                                i34 = 294688727;
                                            } else {
                                                m2566 = C2105.m6981("ۖۙ") ^ i32;
                                                i33 = ((m2566 ^ i31) * 13841) ^ (-633980092);
                                                i34 = -1672793568;
                                            }
                                        case -266461003:
                                        case 316763097:
                                            if (C4616.m13552() != 0) {
                                                m2566 = (C2105.m6981("֡ᩳ") + i32) * (-13);
                                                i33 = ((m2566 ^ i31) * 17937) ^ (-397512284);
                                                i34 = 1860909448;
                                            } else {
                                                m2566 = (i32 - C0630.m2566("۟᩵")) * 85;
                                                i33 = ((m2566 ^ i31) * 15231) ^ 692882249;
                                                i34 = 2020139393;
                                            }
                                        case -242761815:
                                        case -140002425:
                                            C1047.m3599();
                                            m2566 = C2105.m6981("۟ۢ") ^ i31;
                                            i33 = ((m2566 ^ i32) * (-3237)) ^ 893755853;
                                            i34 = 1112503790;
                                        case 260936410:
                                        case 1683289459:
                                            if (C2272.f7362) {
                                                m2566 = (C2105.m6981("ۚۨ") ^ i31) * 39;
                                                i33 = ((m2566 ^ i32) * (-9965)) ^ 1012830952;
                                                i34 = 294688727;
                                            } else {
                                                m2566 = (C2105.m6981("᩺۠") ^ i31) * (-41);
                                                i33 = ((m2566 ^ i32) * (-23213)) ^ 558212222;
                                                i34 = -1667001491;
                                            }
                                        case 613869288:
                                        case 1907041634:
                                            C2272.m7503();
                                            C0964.m3413();
                                            throw new RuntimeException();
                                        case 879308124:
                                        case 1232185071:
                                            if (C3911.f12484 >= 0) {
                                                m2566 = C2105.m6981("۟ۢ") ^ i31;
                                                i33 = ((m2566 ^ i32) * (-3237)) ^ 893755853;
                                                i34 = 1112503790;
                                            } else {
                                                m2566 = C2105.m6981("᩵۠") ^ i31;
                                                i33 = ((m2566 ^ i32) * 23705) ^ (-437817716);
                                                i34 = 1767366964;
                                            }
                                        case 1659454340:
                                        case 2116189336:
                                            if (C3746.f11829 <= 0) {
                                                m2566 = C0630.m2566("ܽۘ") ^ i32;
                                                i33 = ((m2566 ^ i31) * 17961) ^ (-541665399);
                                                i34 = 1145766753;
                                            } else {
                                                m2566 = C2105.m6981("ۨ᩸") ^ i31;
                                                i33 = ((m2566 ^ i32) * (-28239)) ^ (-240473990);
                                                i34 = -435939060;
                                            }
                                        default:
                                            if (C2272.f7362) {
                                                m2566 = C0630.m2566("ܽۘ") ^ i32;
                                                i33 = ((m2566 ^ i31) * 17961) ^ (-541665399);
                                                i34 = 1145766753;
                                            } else {
                                                m2566 = C2105.m6981("֨᩹") ^ i32;
                                                i33 = ((m2566 ^ i31) * 10573) ^ (-482508009);
                                                i34 = 680016586;
                                            }
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str19 = null;
                                DialogInterfaceC0206 dialogInterfaceC0206 = null;
                                final TextView textView11 = null;
                                int i30 = 0;
                                String str20 = null;
                                boolean z = false;
                                int i31 = 1799514413;
                                int i32 = C3537.f11231;
                                int i33 = C1420.f5096;
                                int m69817 = C2105.m6981("ܶ᩹") ^ i33;
                                int i34 = ((m69817 ^ i32) * 15267) ^ 1421131604;
                                int i35 = -567602539;
                                while (true) {
                                    i31 = ((((i31 ^ i32) * (-13937)) >> 31) & i34) ^ (m69817 ^ i35);
                                    switch (i31) {
                                        case -1683442318:
                                        case 1627480629:
                                            if (C11340.f33930 >= 0) {
                                                m69817 = C2105.m6981("ۧܿ") ^ i32;
                                                i34 = ((m69817 ^ i33) * 25571) ^ (-293881275);
                                                i35 = -1633384010;
                                            } else {
                                                m69817 = (i33 - C0630.m2566("ᩳܺ")) * (-115);
                                                i34 = ((m69817 ^ i32) * (-25659)) ^ (-1669613793);
                                                i35 = 709621354;
                                            }
                                        case -1646185726:
                                        case 62762721:
                                            str19 = str18;
                                            if (C0798.f2919) {
                                                m69817 = C2105.m6981("ۧܿ") ^ i32;
                                                i34 = ((m69817 ^ i33) * 25571) ^ (-293881275);
                                                i35 = -1633384010;
                                            } else {
                                                m69817 = (C2105.m6981("ۡۙ") + i32) * 31;
                                                i34 = ((m69817 ^ i33) * (-19369)) ^ 2078196887;
                                                i35 = 1682045731;
                                            }
                                        case -1633182707:
                                        case -1003846801:
                                            if (C0483.m2124(dialogInterfaceC0206)) {
                                                m69817 = (C2105.m6981("ۡ۬") ^ i32) * 57;
                                                i34 = ((m69817 ^ i33) * 13153) ^ (-1208145767);
                                                i35 = 1576468532;
                                            } else {
                                                m69817 = (C2105.m6981("ܿۧ") + i33) * (-127);
                                                i34 = ((m69817 ^ i32) * (-2649)) ^ (-813823616);
                                                i35 = -1455765882;
                                            }
                                        case -1511590692:
                                        case -404558575:
                                            C1773.m5908();
                                            if (C0422.f1886 > 0) {
                                                m69817 = (i32 - C2105.m6981("ܺᩴ")) * 97;
                                                i34 = ((m69817 ^ i33) * (-8289)) ^ (-1814459143);
                                                i35 = -1383706337;
                                            } else {
                                                m69817 = C2105.m6981("᩶۟") ^ i33;
                                                i34 = ((m69817 ^ i32) * (-29697)) ^ (-2138167213);
                                                i35 = 1969777202;
                                            }
                                        case -1493369008:
                                        case 115812047:
                                            dialogInterfaceC0206 = m11213;
                                            if (C2520.f8000 >= 0) {
                                                m69817 = (C0630.m2566("ۙۨ") + i32) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i34 = ((m69817 ^ i33) * 7181) ^ 1019466896;
                                                i35 = 206121717;
                                            } else {
                                                m69817 = C0630.m2566("ܿۙ") ^ i33;
                                                i34 = ((m69817 ^ i32) * 13685) ^ 1405986613;
                                                i35 = 1769031113;
                                            }
                                        case -1491527325:
                                        case 1270799859:
                                            if (RunnableC3474.f10992 <= 0) {
                                                m69817 = C2105.m6981("᩶۟") ^ i33;
                                                i34 = ((m69817 ^ i32) * (-29697)) ^ (-2138167213);
                                                i35 = 1969777202;
                                            } else {
                                                m69817 = (C2105.m6981("᩶ۙ") + i32) * 3;
                                                i34 = ((m69817 ^ i33) * 10967) ^ (-848248425);
                                                i35 = 1294897262;
                                            }
                                        case -1178414056:
                                        case -1098454750:
                                            try {
                                                C0237.m1492(new RunnableC2291(i30, textView11, str20));
                                                m69817 = (C2105.m6981("ᩴ۟") ^ i33) * (-5);
                                                i34 = ((m69817 ^ i32) * 30269) ^ 1158635133;
                                                i35 = -1118561394;
                                            } catch (IOException unused) {
                                                m69817 = (i33 - C2105.m6981("᩷۟")) * 101;
                                                i34 = ((m69817 ^ i32) * 18067) ^ (-1596436256);
                                                i35 = 593863153;
                                            }
                                        case -1094586138:
                                        case 716929319:
                                            textView11 = textView7;
                                            int i36 = ViewOnClickListenerC2040.f6808;
                                            i30 = 0;
                                            m69817 = (C2105.m6981("ۢܶ") + i32) * 123;
                                            i34 = ((m69817 ^ i33) * (-6989)) ^ (-1861308704);
                                            i35 = -1078686322;
                                        case -1010434146:
                                        case 2078699300:
                                            str20 = C5432.m15518(C3432.m10487(str19, new String[i30]));
                                            z = C0483.m2124(dialogInterfaceC0206);
                                            m69817 = (i33 - C2105.m6981("ۨ᩶")) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i34 = ((m69817 ^ i32) * (-31109)) ^ (-231979775);
                                            i35 = 1140857524;
                                        case -847425792:
                                        case -187632742:
                                            break;
                                        case -617025841:
                                        case 2059198474:
                                            C3683.m11222();
                                            break;
                                        case -590900952:
                                        case 406725692:
                                            C11340.m28031();
                                            if (C2958.f9394 < 0) {
                                                m69817 = (i32 - C2105.m6981("ܺᩴ")) * 97;
                                                i34 = ((m69817 ^ i33) * (-8289)) ^ (-1814459143);
                                                i35 = -1383706337;
                                            } else {
                                                m69817 = C2105.m6981("ۧܿ") ^ i32;
                                                i34 = ((m69817 ^ i33) * 25571) ^ (-293881275);
                                                i35 = -1633384010;
                                            }
                                        case -572498944:
                                        case 1511148330:
                                            if (C0714.f2697 >= 0) {
                                                m69817 = (i32 - C2105.m6981("ܺᩴ")) * 97;
                                                i34 = ((m69817 ^ i33) * (-8289)) ^ (-1814459143);
                                                i35 = -1383706337;
                                            } else {
                                                m69817 = C2105.m6981("᩺᩵") ^ i32;
                                                i34 = ((m69817 ^ i33) * 16519) ^ (-8242852);
                                                i35 = 2001124385;
                                            }
                                        case -274176595:
                                        case 114087129:
                                            C0237.m1492(new Runnable() { // from class: l.ۘۘ᩷

                                                /* renamed from: ᩳ᩶ۗ, reason: not valid java name and contains not printable characters */
                                                private static final short[] f11680 = {2008, 29583, -22915, 20843};

                                                /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
                                                
                                                    if (l.C21923.f70183 == 0) goto L7;
                                                 */
                                                /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
                                                
                                                    r16 = r1;
                                                 */
                                                /* JADX WARN: Code restructure failed: missing block: B:35:0x005e, code lost:
                                                
                                                    if (l.C0630.f2410 <= 0) goto L14;
                                                 */
                                                @Override // java.lang.Runnable
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                    To view partially-correct add '--show-bad-code' argument
                                                */
                                                public final void run() {
                                                    /*
                                                        Method dump skipped, instructions count: 806
                                                        To view this dump add '--comments-level debug' option
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: l.RunnableC3702.run():void");
                                                }
                                            });
                                            m69817 = (C2105.m6981("ܿۧ") + i33) * (-127);
                                            i34 = ((m69817 ^ i32) * (-2649)) ^ (-813823616);
                                            i35 = -1455765882;
                                        case -269828889:
                                        case 1645184484:
                                            if (C1504.m5179()) {
                                                m69817 = (i33 - C2105.m6981("ۨۗ")) * 19;
                                                i34 = ((m69817 ^ i32) * (-26149)) ^ (-952425913);
                                                i35 = 752804755;
                                            } else {
                                                m69817 = (C0630.m2566("ۙۨ") + i32) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i34 = ((m69817 ^ i33) * 7181) ^ 1019466896;
                                                i35 = 206121717;
                                            }
                                        case -201292331:
                                        case 916556431:
                                            if (C1504.m5179()) {
                                                m69817 = C2105.m6981("ܳ᩹") ^ i32;
                                                i34 = ((m69817 ^ i33) * (-30909)) ^ 668451964;
                                                i35 = 226387140;
                                            } else {
                                                m69817 = (i32 - C2105.m6981("ܺᩴ")) * 97;
                                                i34 = ((m69817 ^ i33) * (-8289)) ^ (-1814459143);
                                                i35 = -1383706337;
                                            }
                                        case -127960717:
                                        case 1327323332:
                                            if (C0483.f2088 < 0) {
                                                m69817 = (i32 - C2105.m6981("ܺᩴ")) * 97;
                                                i34 = ((m69817 ^ i33) * (-8289)) ^ (-1814459143);
                                                i35 = -1383706337;
                                            } else {
                                                m69817 = (C0630.m2566("᩸᩹") + i33) * (-51);
                                                i34 = ((m69817 ^ i32) * (-32755)) ^ 704222684;
                                                i35 = 1045101847;
                                            }
                                        case 29546749:
                                        case 2003924300:
                                            if (C22628.f73083 <= 0) {
                                                m69817 = (C0630.m2566("ۙۨ") + i32) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                                i34 = ((m69817 ^ i33) * 7181) ^ 1019466896;
                                                i35 = 206121717;
                                            } else {
                                                m69817 = C2105.m6981("᩺ۙ") ^ i33;
                                                i34 = ((m69817 ^ i32) * (-26755)) ^ 1215555605;
                                                i35 = 1649500081;
                                            }
                                        case 37590494:
                                        case 1446777023:
                                            if (z) {
                                                m69817 = (C0630.m2566("۫᩵") ^ i32) * (-49);
                                                i34 = ((m69817 ^ i33) * 3735) ^ 2079589590;
                                                i35 = 1654944120;
                                            } else {
                                                m69817 = (C2105.m6981("ܿۧ") + i33) * (-127);
                                                i34 = ((m69817 ^ i32) * (-2649)) ^ (-813823616);
                                                i35 = -1455765882;
                                            }
                                        case 50332197:
                                        case 274367243:
                                            break;
                                        case 563658682:
                                        case 1507321106:
                                            if (C22628.m50615() != 0) {
                                                m69817 = C2105.m6981("᩶۟") ^ i33;
                                                i34 = ((m69817 ^ i32) * (-29697)) ^ (-2138167213);
                                                i35 = 1969777202;
                                            } else {
                                                m69817 = C0630.m2566("ܽ۠") ^ i32;
                                                i34 = ((m69817 ^ i33) * 18459) ^ 1513582988;
                                                i35 = -1279889683;
                                            }
                                        case 684244363:
                                        case 941245993:
                                            if (C3245.f10203 <= 0) {
                                                m69817 = (i32 - C2105.m6981("ܺᩴ")) * 97;
                                                i34 = ((m69817 ^ i33) * (-8289)) ^ (-1814459143);
                                                i35 = -1383706337;
                                            } else {
                                                m69817 = C2105.m6981("ۨ᩵") ^ i33;
                                                i34 = ((m69817 ^ i32) * 15447) ^ 1168885279;
                                                i35 = -1641384167;
                                            }
                                        case 723715500:
                                        case 2122799356:
                                            if (C0483.f2088 >= 0) {
                                                m69817 = (i33 - C0630.m2566("ۖۘ")) * (-113);
                                                i34 = ((m69817 ^ i32) * 18767) ^ (-1082769423);
                                                i35 = -197702049;
                                            } else {
                                                m69817 = (C0630.m2566("᩹ܶ") ^ i32) * (-89);
                                                i34 = ((m69817 ^ i33) * (-32549)) ^ 177899952;
                                                i35 = 2000932532;
                                            }
                                        case 748110532:
                                        case 1541913909:
                                            if (ViewOnClickListenerC1958.m6429() < 0) {
                                                m69817 = C2105.m6981("ܳ᩹") ^ i32;
                                                i34 = ((m69817 ^ i33) * (-30909)) ^ 668451964;
                                                i35 = 226387140;
                                            } else {
                                                m69817 = (i33 - C0630.m2566("ۖۘ")) * (-113);
                                                i34 = ((m69817 ^ i32) * 18767) ^ (-1082769423);
                                                i35 = -197702049;
                                            }
                                        default:
                                            RunnableC3474.m10630();
                                            C2958.m9034();
                                            m69817 = (i32 - C2105.m6981("ܺᩴ")) * 97;
                                            i34 = ((m69817 ^ i33) * (-8289)) ^ (-1814459143);
                                            i35 = -1383706337;
                                    }
                                    return;
                                }
                            }
                        });
                        C8177.m21651(textView6, view8, C3432.m10487(packageInfo.applicationInfo.sourceDir, new String[0]), viewOnClickListenerC2040, C4263.m12818(ApplicationC20075.f65008, C7811.m20837(f6807, 183, 5, i27), false), null, new InterfaceC17066() { // from class: l.ۜۘ᩷
                            @Override // l.InterfaceC17066
                            /* renamed from: ᩻ */
                            public final boolean mo1526() {
                                DialogInterfaceC0206 dialogInterfaceC0206 = null;
                                int i30 = -1927387013;
                                int i31 = C4117.f13076;
                                int i32 = C1294.f4556;
                                int m2566 = (i32 - C0630.m2566("᩸ۡ")) * 13;
                                int i33 = ((m2566 ^ i31) * (-11397)) ^ (-187732427);
                                int i34 = 591127314;
                                while (true) {
                                    i30 = ((((i30 ^ i31) * (-15153)) >> 31) & i33) ^ (m2566 ^ i34);
                                    switch (i30) {
                                        case -2135423032:
                                        case -419140459:
                                            C0050.m940();
                                            C2126.m7040();
                                            m2566 = (i32 - C0630.m2566("۫᩵")) * 9;
                                            i33 = ((m2566 ^ i31) * 4019) ^ (-1286757535);
                                            i34 = 1920912624;
                                        case -2121341822:
                                        case -903452193:
                                            C1773.m5908();
                                            if (C0050.m940() > 0) {
                                                m2566 = (i32 - C0630.m2566("۫᩵")) * 9;
                                                i33 = ((m2566 ^ i31) * 4019) ^ (-1286757535);
                                                i34 = 1920912624;
                                            } else {
                                                m2566 = C0630.m2566("ۗۨ") ^ i31;
                                                i33 = ((m2566 ^ i32) * 14175) ^ 1028864062;
                                                i34 = -1311953725;
                                            }
                                        case -1973986950:
                                        case -1479521217:
                                            if (C1504.m5179()) {
                                                m2566 = (C0630.m2566("ۢۤ") + i32) * 41;
                                                i33 = ((m2566 ^ i31) * 4587) ^ (-1800113168);
                                                i34 = 1590319307;
                                            } else {
                                                m2566 = C0630.m2566("ᩴ᩹") ^ i31;
                                                i33 = ((m2566 ^ i32) * (-15417)) ^ 197232380;
                                                i34 = -1392336704;
                                            }
                                        case -1576864559:
                                        case 277463127:
                                            dialogInterfaceC0206 = DialogInterfaceC0206.this;
                                            if (RunnableC1937.m6387() != 0) {
                                                m2566 = C0630.m2566("ᩴ᩹") ^ i31;
                                                i33 = ((m2566 ^ i32) * (-15417)) ^ 197232380;
                                                i34 = -1392336704;
                                            } else {
                                                m2566 = C0630.m2566("ܰ᩶") ^ i32;
                                                i33 = ((m2566 ^ i31) * 147) ^ 2021151711;
                                                i34 = -599137666;
                                            }
                                        case -1529024565:
                                        case -871782887:
                                            if (C3537.f11231 >= 0) {
                                                m2566 = C0630.m2566("ᩴ᩹") ^ i31;
                                                i33 = ((m2566 ^ i32) * (-15417)) ^ 197232380;
                                                i34 = -1392336704;
                                            } else {
                                                m2566 = (C2105.m6981("ܳܳ") + i32) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                i33 = ((m2566 ^ i31) * (-28457)) ^ (-1546762613);
                                                i34 = 1870510399;
                                            }
                                        case -1065559864:
                                        case 496445682:
                                            int i35 = ViewOnClickListenerC2040.f6808;
                                            if (C1128.f4106 <= 0) {
                                                m2566 = (i32 - C0630.m2566("۫᩵")) * 9;
                                                i33 = ((m2566 ^ i31) * 4019) ^ (-1286757535);
                                                i34 = 1920912624;
                                            } else {
                                                m2566 = C2105.m6981("ܶۨ") ^ i31;
                                                i33 = ((m2566 ^ i32) * 23995) ^ (-109605207);
                                                i34 = 782722893;
                                            }
                                        case -747654612:
                                        case 701544890:
                                            if (C1420.f5096 <= 0) {
                                                m2566 = C0630.m2566("ᩴ᩹") ^ i31;
                                                i33 = ((m2566 ^ i32) * (-15417)) ^ 197232380;
                                                i34 = -1392336704;
                                            } else {
                                                m2566 = C0630.m2566("᩵᩶") ^ i32;
                                                i33 = ((m2566 ^ i31) * (-5343)) ^ 532445775;
                                                i34 = -2024880286;
                                            }
                                        case -107460299:
                                        case 497930615:
                                            if (C0630.f2410 <= 0) {
                                                m2566 = (i32 - C0630.m2566("۫᩵")) * 9;
                                                i33 = ((m2566 ^ i31) * 4019) ^ (-1286757535);
                                                i34 = 1920912624;
                                            } else {
                                                m2566 = C0630.m2566("ۛܳ") ^ i32;
                                                i33 = ((m2566 ^ i31) * 27577) ^ (-992547383);
                                                i34 = 1697514572;
                                            }
                                        case -70748958:
                                        case 616037857:
                                            C4263.m12819();
                                            if (C3746.f11829 > 0) {
                                                m2566 = (i32 - C0630.m2566("۫᩵")) * 9;
                                                i33 = ((m2566 ^ i31) * 4019) ^ (-1286757535);
                                                i34 = 1920912624;
                                            } else {
                                                m2566 = C2105.m6981("ۢۨ") ^ i31;
                                                i33 = ((m2566 ^ i32) * 14107) ^ (-434482420);
                                                i34 = 1264883606;
                                            }
                                        case 637455752:
                                        case 1447177150:
                                            if (ServiceConnectionC3453.f10921 >= 0) {
                                                m2566 = C0630.m2566("ᩴ᩹") ^ i31;
                                                i33 = ((m2566 ^ i32) * (-15417)) ^ 197232380;
                                                i34 = -1392336704;
                                            } else {
                                                m2566 = (C0630.m2566("᩻۫") ^ i31) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                                i33 = ((m2566 ^ i32) * 5401) ^ (-2000685456);
                                                i34 = 544221284;
                                            }
                                        case 675626984:
                                        case 2012853098:
                                            if (C1773.f6144 <= 0) {
                                                m2566 = C0630.m2566("ᩴ᩹") ^ i31;
                                                i33 = ((m2566 ^ i32) * (-15417)) ^ 197232380;
                                                i34 = -1392336704;
                                            } else {
                                                m2566 = (C2105.m6981("ۖۢ") + i31) * 85;
                                                i33 = ((m2566 ^ i32) * (-17997)) ^ (-1084770274);
                                                i34 = 1977880804;
                                            }
                                        case 948837113:
                                        case 1261703389:
                                            if (C21923.f70183 != 0) {
                                                m2566 = C0630.m2566("ᩴ᩹") ^ i31;
                                                i33 = ((m2566 ^ i32) * (-15417)) ^ 197232380;
                                                i34 = -1392336704;
                                            } else {
                                                m2566 = (C0630.m2566("ۙᩳ") ^ i31) * 97;
                                                i33 = ((m2566 ^ i32) * 7831) ^ (-1958280788);
                                                i34 = 825969873;
                                            }
                                        case 1181345714:
                                        case 1429939129:
                                            C4616.m13552();
                                            return false;
                                        case 1448351931:
                                        case 2020481944:
                                            if (C3746.m11369() >= 0) {
                                                m2566 = C2105.m6981("ۢۨ") ^ i31;
                                                i33 = ((m2566 ^ i32) * 14107) ^ (-434482420);
                                                i34 = 1264883606;
                                            } else {
                                                m2566 = (i32 - C0630.m2566("᩺ۙ")) * 115;
                                                i33 = ((m2566 ^ i31) * (-2609)) ^ (-1781558007);
                                                i34 = -1476913635;
                                            }
                                        case 1635007538:
                                        case 1933683987:
                                            return !C1773.m5913(dialogInterfaceC0206);
                                        default:
                                            if (C1128.f4106 <= 0) {
                                                m2566 = C0630.m2566("ۗۨ") ^ i31;
                                                i33 = ((m2566 ^ i32) * 14175) ^ 1028864062;
                                                i34 = -1311953725;
                                            } else {
                                                m2566 = (C2105.m6981("ۢ֡") + i31) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                                i33 = ((m2566 ^ i32) * 23583) ^ 1000882361;
                                                i34 = -67332707;
                                            }
                                    }
                                }
                            }
                        }, null);
                        C2126.m7039(C4616.m13545(m11213), new View.OnClickListener(viewOnClickListenerC2040) { // from class: l.᩷ۘ᩷

                            /* renamed from: ܳ᩹ᩳ, reason: not valid java name and contains not printable characters */
                            private static final short[] f66396 = {5929, -171, 7344, 8582, 4830, -4066, -3562, 1686, 857, -4105};

                            /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ ViewOnClickListenerC2040 f66399;

                            {
                                int i30 = 1973825033;
                                int i31 = C0422.f1886;
                                int i32 = C3432.f10845;
                                int m69817 = (i31 - C2105.m6981("᩶ܶ")) * 35;
                                int i33 = ((m69817 ^ i32) * (-31989)) ^ (-513364845);
                                int i34 = 394343464;
                                while (true) {
                                    i30 = ((((i30 ^ i32) * 13749) >> 31) & i33) ^ (m69817 ^ i34);
                                    switch (i30) {
                                        case -1819363936:
                                        case 881162991:
                                            if (C3746.f11829 <= 0) {
                                                m69817 = (i31 - C0630.m2566("ܺۖ")) * (-29);
                                                i33 = ((m69817 ^ i32) * (-20365)) ^ (-370086239);
                                                i34 = -1640568696;
                                            } else {
                                                m69817 = (C0630.m2566("ۙۢ") + i32) * (-25);
                                                i33 = ((m69817 ^ i31) * (-25769)) ^ 1140191940;
                                                i34 = -1100951032;
                                            }
                                        case -1615431903:
                                        case 166949110:
                                            if (C4263.f13799 <= 0) {
                                                m69817 = (C0630.m2566("ۘ֡") + i32) * 21;
                                                i33 = ((m69817 ^ i31) * 26699) ^ 641942275;
                                                i34 = 1730633743;
                                            } else {
                                                m69817 = C2105.m6981("ۧ۫") ^ i32;
                                                i33 = ((m69817 ^ i31) * (-7703)) ^ (-1006730022);
                                                i34 = 647639660;
                                            }
                                        case -1482050275:
                                        case 488896348:
                                            C0422.m1963();
                                            if (C0964.f3626 != 0) {
                                                m69817 = (C0630.m2566("ۘ֡") + i32) * 21;
                                                i33 = ((m69817 ^ i31) * 26699) ^ 641942275;
                                                i34 = 1730633743;
                                            } else {
                                                m69817 = C2105.m6981("᩹ۛ") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-537)) ^ 23121733;
                                                i34 = 2083114798;
                                            }
                                        case -1287297209:
                                        case 1588197923:
                                            C3432.m10477();
                                            C0798.m2998();
                                            m69817 = C2105.m6981("۠ܳ") ^ i32;
                                            i33 = ((m69817 ^ i31) * 6059) ^ 1094991207;
                                            i34 = -1714414754;
                                        case -1212401562:
                                        case 1123599568:
                                            if (C3019.m9255() <= 0) {
                                                m69817 = (C0630.m2566("᩻֡") ^ i32) * 35;
                                                i33 = ((m69817 ^ i31) * (-29363)) ^ (-163785906);
                                                i34 = 1704718295;
                                            } else {
                                                m69817 = C0630.m2566("᩻᩺") ^ i32;
                                                i33 = ((m69817 ^ i31) * 32177) ^ (-1920615761);
                                                i34 = 2136948114;
                                            }
                                        case -1195348867:
                                        case -70887190:
                                            if (C7811.m20844() != 0) {
                                                m69817 = C2105.m6981("᩹ۛ") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-537)) ^ 23121733;
                                                i34 = 2083114798;
                                            } else {
                                                m69817 = C0630.m2566("᩹ۖ") ^ i31;
                                                i33 = ((m69817 ^ i32) * 26677) ^ (-2033611566);
                                                i34 = 1511046316;
                                            }
                                        case -1113966646:
                                        case 2088681893:
                                            if (C0630.f2410 > 0) {
                                                m69817 = C2105.m6981("۠ܳ") ^ i32;
                                                i33 = ((m69817 ^ i31) * 6059) ^ 1094991207;
                                                i34 = -1714414754;
                                            } else {
                                                m69817 = (i31 - C0630.m2566("ܺۖ")) * (-29);
                                                i33 = ((m69817 ^ i32) * (-20365)) ^ (-370086239);
                                                i34 = -1640568696;
                                            }
                                        case -975141412:
                                        case -901240347:
                                            return;
                                        case -505970093:
                                        case 1259401753:
                                            if (C4117.f13076 <= 0) {
                                                m69817 = C2105.m6981("۠ܳ") ^ i32;
                                                i33 = ((m69817 ^ i31) * 6059) ^ 1094991207;
                                                i34 = -1714414754;
                                            } else {
                                                m69817 = (C2105.m6981("ۙܳ") + i31) * 73;
                                                i33 = ((m69817 ^ i32) * (-30139)) ^ 1216469872;
                                                i34 = -527242759;
                                            }
                                        case -295700038:
                                        case -17817023:
                                            if (RunnableC1937.f6483 >= 0) {
                                                m69817 = (C0630.m2566("ۘ֡") + i32) * 21;
                                                i33 = ((m69817 ^ i31) * 26699) ^ 641942275;
                                                i34 = 1730633743;
                                            } else {
                                                m69817 = (C2105.m6981("᩹ۨ") + i31) * (-33);
                                                i33 = ((m69817 ^ i32) * 27111) ^ 334729277;
                                                i34 = -784777112;
                                            }
                                        case -292724705:
                                        case 273076897:
                                            if (C4075.m12263() <= 0) {
                                                m69817 = (i31 - C0630.m2566("ܺۖ")) * (-29);
                                                i33 = ((m69817 ^ i32) * (-20365)) ^ (-370086239);
                                                i34 = -1640568696;
                                            } else {
                                                m69817 = (C0630.m2566("۠۟") + i31) * 17;
                                                i33 = ((m69817 ^ i32) * (-5487)) ^ (-274375573);
                                                i34 = -947108620;
                                            }
                                        case -140985375:
                                        case 1882731147:
                                            this.f66399 = viewOnClickListenerC2040;
                                            if (C5695.f17556 >= 0) {
                                                m69817 = (C0630.m2566("᩻֡") ^ i32) * 35;
                                                i33 = ((m69817 ^ i31) * (-29363)) ^ (-163785906);
                                                i34 = 1704718295;
                                            } else {
                                                m69817 = C2105.m6981("ᩴ᩹") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-17425)) ^ (-42104509);
                                                i34 = 287014258;
                                            }
                                        case 399060279:
                                        case 1612860404:
                                            if (C22628.f73083 <= 0) {
                                                m69817 = C2105.m6981("᩹ۛ") ^ i31;
                                                i33 = ((m69817 ^ i32) * (-537)) ^ 23121733;
                                                i34 = 2083114798;
                                            } else {
                                                m69817 = C0630.m2566("ۜۘ") ^ i32;
                                                i33 = ((m69817 ^ i31) * 13219) ^ (-1385392668);
                                                i34 = 1531673070;
                                            }
                                        case 751082533:
                                        case 1509921340:
                                            C0630.m2564();
                                            C2958.m9034();
                                            throw new RuntimeException();
                                        case 1690417069:
                                        case 1874351781:
                                            if (AbstractC2021.m6574()) {
                                                m69817 = (C0630.m2566("ۘ֡") + i32) * 21;
                                                i33 = ((m69817 ^ i31) * 26699) ^ 641942275;
                                                i34 = 1730633743;
                                            } else {
                                                m69817 = C2105.m6981("۠ܳ") ^ i32;
                                                i33 = ((m69817 ^ i31) * 6059) ^ 1094991207;
                                                i34 = -1714414754;
                                            }
                                        default:
                                            if (C3663.m11168() >= 0) {
                                                m69817 = (C0630.m2566("᩻֡") ^ i32) * 35;
                                                i33 = ((m69817 ^ i31) * (-29363)) ^ (-163785906);
                                                i34 = 1704718295;
                                            } else {
                                                m69817 = (C0630.m2566("۫ܺ") ^ i32) * (-79);
                                                i33 = ((m69817 ^ i31) * (-15011)) ^ (-1763950476);
                                                i34 = -8520188;
                                            }
                                    }
                                }
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
                            
                                if (l.C4075.f12947 < 0) goto L10;
                             */
                            @Override // android.view.View.OnClickListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void onClick(android.view.View r26) {
                                /*
                                    Method dump skipped, instructions count: 840
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC20636.onClick(android.view.View):void");
                            }
                        });
                        break;
                    }
                    str6 = str16;
                    view5 = view8;
                    m69815 = (i18 - C0630.m2566("᩹᩷")) * 25;
                    i12 = ((m69815 ^ i19) * 7617) ^ (-1649349221);
                    i13 = 480048492;
                    i14 = m69815 ^ i13;
                    str17 = str11;
                    i20 = i12;
                    textView9 = textView5;
                    c192585 = c192584;
                    i21 = i14;
                    view8 = view5;
                    str16 = str6;
                case -1997469664:
                case 1087170765:
                    TextView textView11 = textView9;
                    String str19 = str17;
                    String str20 = str16;
                    int i30 = DialogInterfaceC0206.f1451;
                    c192585 = new C19258(viewOnClickListenerC2040);
                    C1711.m5727(c192585, view6);
                    view5 = view8;
                    str6 = str20;
                    C1294.m4380(c192585, C2105.m6981(C0964.m3396(f6807, 177, 3, i27)) ^ 2116438850, new DialogInterface.OnClickListener(viewOnClickListenerC2040) { // from class: l.ܿۘ᩷

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC2040 f52434;

                        {
                            int i31 = 832321394;
                            int i32 = C4616.f14690;
                            int i33 = C4263.f13799;
                            int m2566 = (C0630.m2566("ۗۛ") ^ i32) * (-97);
                            int i34 = ((m2566 ^ i33) * (-16341)) ^ 944338496;
                            int i35 = -1241557791;
                            while (true) {
                                i31 = ((((i31 ^ i33) * (-14399)) >> 31) & i34) ^ (m2566 ^ i35);
                                switch (i31) {
                                    case -2011646494:
                                    case 223227200:
                                        if (C3683.f11629 >= 0) {
                                            m2566 = C2105.m6981("ܳۚ") ^ i33;
                                            i34 = ((m2566 ^ i32) * 11379) ^ (-1833818862);
                                            i35 = 1183511418;
                                        } else {
                                            m2566 = (i33 - C0630.m2566("ۙ᩹")) * 119;
                                            i34 = ((m2566 ^ i32) * 28563) ^ 907091496;
                                            i35 = -2044820113;
                                        }
                                    case -1972364468:
                                    case 1435297608:
                                        if (C7106.f21815 != 0) {
                                            m2566 = C2105.m6981("ܿۧ") ^ i33;
                                            i34 = ((m2566 ^ i32) * (-14611)) ^ (-1081430878);
                                            i35 = -1838126178;
                                        } else {
                                            m2566 = C0630.m2566("ۛᩳ") ^ i33;
                                            i34 = ((m2566 ^ i32) * (-14655)) ^ (-1505770812);
                                            i35 = -499778666;
                                        }
                                    case -1797604462:
                                    case -697746362:
                                        if (C1128.f4106 <= 0) {
                                            m2566 = (C0630.m2566("ܳܳ") ^ i32) * 19;
                                            i34 = ((m2566 ^ i33) * 16629) ^ 1767084212;
                                            i35 = 52897628;
                                        } else {
                                            m2566 = (C0630.m2566("֨۟") ^ i32) * (-41);
                                            i34 = ((m2566 ^ i33) * (-11039)) ^ (-1537895793);
                                            i35 = -919583096;
                                        }
                                    case -1679199364:
                                    case 1408115976:
                                        if (C1711.f5919) {
                                            m2566 = C2105.m6981("۬ܺ") ^ i32;
                                            i34 = ((m2566 ^ i33) * 22479) ^ (-790346735);
                                            i35 = 2087643679;
                                        } else {
                                            m2566 = (C2105.m6981("۬ۡ") + i33) * (-99);
                                            i34 = ((m2566 ^ i32) * 6419) ^ (-1598250514);
                                            i35 = -1346686500;
                                        }
                                    case -1600849324:
                                    case -299630352:
                                        if (C0483.f2088 >= 0) {
                                            m2566 = C2105.m6981("۬ܺ") ^ i32;
                                            i34 = ((m2566 ^ i33) * 22479) ^ (-790346735);
                                            i35 = 2087643679;
                                        } else {
                                            m2566 = (C2105.m6981("ۡ֨") ^ i33) * (-83);
                                            i34 = ((m2566 ^ i32) * (-1003)) ^ (-218760842);
                                            i35 = 1507719814;
                                        }
                                    case -1562131569:
                                    case -1314968772:
                                        if (C1128.m3851() <= 0) {
                                            m2566 = C0630.m2566("᩺֫") ^ i32;
                                            i34 = ((m2566 ^ i33) * (-9785)) ^ (-897655633);
                                            i35 = 1106541622;
                                        } else {
                                            m2566 = C2105.m6981("֨ܽ") ^ i33;
                                            i34 = ((m2566 ^ i32) * (-24433)) ^ (-1741795721);
                                            i35 = -629629107;
                                        }
                                    case -1507023554:
                                    case 1066557820:
                                        C11340.m28031();
                                        if (C1294.m4372() > 0) {
                                            m2566 = C0630.m2566("᩺֫") ^ i32;
                                            i34 = ((m2566 ^ i33) * (-9785)) ^ (-897655633);
                                            i35 = 1106541622;
                                        } else {
                                            m2566 = C2105.m6981("۬ܺ") ^ i32;
                                            i34 = ((m2566 ^ i33) * 22479) ^ (-790346735);
                                            i35 = 2087643679;
                                        }
                                    case -797531337:
                                    case 1424366167:
                                        if (C2520.f8000 >= 0) {
                                            m2566 = (C0630.m2566("ܳܳ") ^ i32) * 19;
                                            i34 = ((m2566 ^ i33) * 16629) ^ 1767084212;
                                            i35 = 52897628;
                                        } else {
                                            m2566 = (C0630.m2566("ۖۡ") ^ i32) * (-79);
                                            i34 = ((m2566 ^ i33) * (-3685)) ^ 1936719461;
                                            i35 = -2043028521;
                                        }
                                    case -729400550:
                                    case 1926642773:
                                        C4263.m12819();
                                        C3663.m11168();
                                        throw new RuntimeException();
                                    case -591260484:
                                    case 1799955808:
                                        if (C1916.m6308() >= 0) {
                                            m2566 = C2105.m6981("۬ܺ") ^ i32;
                                            i34 = ((m2566 ^ i33) * 22479) ^ (-790346735);
                                            i35 = 2087643679;
                                        } else {
                                            m2566 = C2105.m6981("ܿۧ") ^ i33;
                                            i34 = ((m2566 ^ i32) * (-14611)) ^ (-1081430878);
                                            i35 = -1838126178;
                                        }
                                    case -466167860:
                                    case 1543571813:
                                        if (AbstractC2021.m6574()) {
                                            m2566 = (C0630.m2566("ܳܳ") ^ i32) * 19;
                                            i34 = ((m2566 ^ i33) * 16629) ^ 1767084212;
                                            i35 = 52897628;
                                        } else {
                                            m2566 = C2105.m6981("֨ۛ") ^ i32;
                                            i34 = ((m2566 ^ i33) * (-31891)) ^ (-1541831779);
                                            i35 = 737494451;
                                        }
                                    case -421774659:
                                    case 1309756545:
                                        this.f52434 = viewOnClickListenerC2040;
                                        if (RunnableC1937.f6483 >= 0) {
                                            m2566 = C2105.m6981("ܳۚ") ^ i33;
                                            i34 = ((m2566 ^ i32) * 11379) ^ (-1833818862);
                                            i35 = 1183511418;
                                        } else {
                                            m2566 = (C2105.m6981("ۙܶ") ^ i32) * 67;
                                            i34 = ((m2566 ^ i33) * 3221) ^ (-1415684545);
                                            i35 = -1189350645;
                                        }
                                    case 1376539578:
                                    case 1523968273:
                                        C21923.m49329();
                                        if (RunnableC3474.f10992 > 0) {
                                            m2566 = C2105.m6981("ܳۚ") ^ i33;
                                            i34 = ((m2566 ^ i32) * 11379) ^ (-1833818862);
                                            i35 = 1183511418;
                                        } else {
                                            m2566 = C0630.m2566("᩺֫") ^ i32;
                                            i34 = ((m2566 ^ i33) * (-9785)) ^ (-897655633);
                                            i35 = 1106541622;
                                        }
                                    case 1733073031:
                                    case 2042349255:
                                        C1294.m4372();
                                        C2105.m6982();
                                        m2566 = C2105.m6981("ܳۚ") ^ i33;
                                        i34 = ((m2566 ^ i32) * 11379) ^ (-1833818862);
                                        i35 = 1183511418;
                                    case 1765378384:
                                    case 1874673813:
                                        if (C2126.f7087) {
                                            m2566 = (C0630.m2566("ܳܳ") ^ i32) * 19;
                                            i34 = ((m2566 ^ i33) * 16629) ^ 1767084212;
                                            i35 = 52897628;
                                        } else {
                                            m2566 = (i32 - C2105.m6981("۫ۗ")) * (-93);
                                            i34 = ((m2566 ^ i33) * (-31031)) ^ 363001895;
                                            i35 = 1291041619;
                                        }
                                    default:
                                        return;
                                }
                            }
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i31) {
                            ViewOnClickListenerC23185 viewOnClickListenerC231852 = null;
                            int i32 = -1220111124;
                            int i33 = C4616.f14690;
                            int i34 = C2167.f7158;
                            int m2566 = C0630.m2566("֫ܰ") ^ i34;
                            int i35 = ((m2566 ^ i33) * (-31189)) ^ 1489609533;
                            int i36 = 564787034;
                            while (true) {
                                i32 = ((((i32 ^ i33) * (-17477)) >> 31) & i35) ^ (m2566 ^ i36);
                                switch (i32) {
                                    case -1671617386:
                                    case 813685585:
                                        if (C1916.f6442) {
                                            m2566 = (C2105.m6981("᩺ۚ") ^ i33) * (-27);
                                            i35 = ((m2566 ^ i34) * (-23715)) ^ 16091466;
                                            i36 = 769697897;
                                        } else {
                                            m2566 = C0630.m2566("ۧۨ") ^ i33;
                                            i35 = ((m2566 ^ i34) * (-10509)) ^ 83397906;
                                            i36 = -181344347;
                                        }
                                    case -1648949504:
                                    case 2124628677:
                                        if (C0382.m1848()) {
                                            m2566 = C0630.m2566("ۜܶ") ^ i34;
                                            i35 = ((m2566 ^ i33) * 12827) ^ 2019431878;
                                            i36 = -1716373656;
                                        } else {
                                            m2566 = C0630.m2566("ܽۤ") ^ i34;
                                            i35 = ((m2566 ^ i33) * (-25517)) ^ (-590376999);
                                            i36 = -1159134653;
                                        }
                                    case -1603397176:
                                    case 1673488674:
                                        int i37 = ViewOnClickListenerC2040.f6808;
                                        viewOnClickListenerC231852 = viewOnClickListenerC23185;
                                        if (RunnableC1937.f6483 >= 0) {
                                            m2566 = (C0630.m2566("ۚ᩻") ^ i34) * (-11);
                                            i35 = ((m2566 ^ i33) * 29203) ^ (-2102772032);
                                            i36 = -1244563677;
                                        } else {
                                            m2566 = C0630.m2566("ܰۢ") ^ i33;
                                            i35 = ((m2566 ^ i34) * (-19785)) ^ 1435123613;
                                            i36 = -1687659978;
                                        }
                                    case -1270648022:
                                    case 895167932:
                                        C7811.m20844();
                                        if (RunnableC3474.m10630()) {
                                            m2566 = C0630.m2566("ۜܶ") ^ i34;
                                            i35 = ((m2566 ^ i33) * 12827) ^ 2019431878;
                                            i36 = -1716373656;
                                        } else {
                                            m2566 = (C2105.m6981("ᩳᩴ") + i33) * (-59);
                                            i35 = ((m2566 ^ i34) * (-30163)) ^ 1956098354;
                                            i36 = 416273518;
                                        }
                                    case -1110220476:
                                    case 1833642965:
                                        C4841 c48412 = viewOnClickListenerC231852.f74523;
                                        ViewOnClickListenerC2040 viewOnClickListenerC20402 = this.f52434;
                                        if (C1773.f6144 > 0) {
                                            C0964.m3402(new C22480(viewOnClickListenerC20402, c48412));
                                            break;
                                        }
                                        m2566 = (C2105.m6981("ᩳᩴ") + i33) * (-59);
                                        i35 = ((m2566 ^ i34) * (-30163)) ^ 1956098354;
                                        i36 = 416273518;
                                    case -945854839:
                                    case 1607580717:
                                        if (C3911.m11924() <= 0) {
                                            m2566 = (C2105.m6981("ᩳᩴ") + i33) * (-59);
                                            i35 = ((m2566 ^ i34) * (-30163)) ^ 1956098354;
                                            i36 = 416273518;
                                        } else {
                                            m2566 = (C0630.m2566("ᩳ֫") ^ i33) * (-31);
                                            i35 = ((m2566 ^ i34) * (-14371)) ^ (-1839576317);
                                            i36 = -768804008;
                                        }
                                    case -892590338:
                                    case 155143435:
                                        C1504.m5179();
                                        m2566 = C0630.m2566("ۜܶ") ^ i34;
                                        i35 = ((m2566 ^ i33) * 12827) ^ 2019431878;
                                        i36 = -1716373656;
                                    case -687936871:
                                    case 714134313:
                                        if (C0630.f2410 <= 0) {
                                            m2566 = (C2105.m6981("ᩳᩴ") + i33) * (-59);
                                            i35 = ((m2566 ^ i34) * (-30163)) ^ 1956098354;
                                            i36 = 416273518;
                                        } else {
                                            m2566 = C0630.m2566("ۗܶ") ^ i34;
                                            i35 = ((m2566 ^ i33) * (-17685)) ^ 1467927540;
                                            i36 = 1158378383;
                                        }
                                    case -288321427:
                                    case 925165660:
                                        if (C1916.m6308() >= 0) {
                                            m2566 = C0630.m2566("ۜܶ") ^ i34;
                                            i35 = ((m2566 ^ i33) * 12827) ^ 2019431878;
                                            i36 = -1716373656;
                                        } else {
                                            m2566 = (C0630.m2566("֫ۜ") + i34) * (-57);
                                            i35 = ((m2566 ^ i33) * 19989) ^ 1877142080;
                                            i36 = -665089403;
                                        }
                                    case -117453415:
                                    case 1048424485:
                                        if (C3683.m11222()) {
                                            m2566 = C0630.m2566("ۜܶ") ^ i34;
                                            i35 = ((m2566 ^ i33) * 12827) ^ 2019431878;
                                            i36 = -1716373656;
                                        } else {
                                            m2566 = C0630.m2566("ܽ᩶") ^ i33;
                                            i35 = ((m2566 ^ i34) * (-12033)) ^ (-2015707408);
                                            i36 = -932465548;
                                        }
                                    case 479770192:
                                    case 522492121:
                                        C2105.m6982();
                                        if (C3683.f11629 < 0) {
                                            m2566 = (C2105.m6981("ᩳᩴ") + i33) * (-59);
                                            i35 = ((m2566 ^ i34) * (-30163)) ^ 1956098354;
                                            i36 = 416273518;
                                        } else {
                                            m2566 = C0630.m2566("ۧۨ") ^ i33;
                                            i35 = ((m2566 ^ i34) * (-10509)) ^ 83397906;
                                            i36 = -181344347;
                                        }
                                    case 676886058:
                                    case 1472098396:
                                        if (C2167.f7158 >= 0) {
                                            m2566 = (C0630.m2566("ۚ᩻") ^ i34) * (-11);
                                            i35 = ((m2566 ^ i33) * 29203) ^ (-2102772032);
                                            i36 = -1244563677;
                                        } else {
                                            m2566 = C0630.m2566("ۤ᩺") ^ i33;
                                            i35 = ((m2566 ^ i34) * (-8921)) ^ (-2088551648);
                                            i36 = -263863217;
                                        }
                                    case 1088708756:
                                    case 1516323846:
                                        C1294.m4372();
                                        break;
                                    case 1137291204:
                                    case 1664723473:
                                        if (C4159.f13567) {
                                            m2566 = (C0630.m2566("ۜᩳ") + i34) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i35 = ((m2566 ^ i33) * 5717) ^ (-184783073);
                                            i36 = 213514799;
                                        } else {
                                            m2566 = C0630.m2566("ۧۨ") ^ i33;
                                            i35 = ((m2566 ^ i34) * (-10509)) ^ 83397906;
                                            i36 = -181344347;
                                        }
                                    default:
                                        if (C3663.f11553) {
                                            m2566 = (C2105.m6981("ᩳᩴ") + i33) * (-59);
                                            i35 = ((m2566 ^ i34) * (-30163)) ^ 1956098354;
                                            i36 = 416273518;
                                        } else {
                                            m2566 = C2105.m6981("ۧ᩵") ^ i34;
                                            i35 = ((m2566 ^ i33) * (-26091)) ^ (-828081218);
                                            i36 = 1830096738;
                                        }
                                }
                                return;
                            }
                        }
                    });
                    int m69817 = (i18 - C2105.m6981("۫᩶")) * 95;
                    int i31 = ((m69817 ^ i19) * 28255) ^ (-1473227758);
                    i14 = m69817 ^ (-685334400);
                    str17 = str19;
                    i20 = i31;
                    textView9 = textView11;
                    i21 = i14;
                    view8 = view5;
                    str16 = str6;
                case -1995380753:
                case -1498982446:
                    String str21 = str17;
                    c19258 = c192585;
                    str7 = str16;
                    view3 = view8;
                    i9 = i16;
                    sArr3 = sArr6;
                    TextView textView12 = (TextView) C11340.m28028(view6, C0630.m2566(C0483.m2128(sArr3, i9, 3, i27)) ^ 2120616377);
                    final String m9025 = C2958.m9025(abstractC15440);
                    RunnableC1937.m6377(textView12, m9025);
                    ViewOnClickListenerC14813.m35217(textView12);
                    str8 = str21;
                    C4159.m12564(textView12, new View.OnClickListener(viewOnClickListenerC2040) { // from class: l.ܽۘ᩷

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC2040 f50465;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view9) {
                            C4841 c48412 = null;
                            int i32 = 1532651127;
                            int i33 = C0050.f910;
                            int i34 = ServiceConnectionC3453.f10921;
                            int m69818 = (C2105.m6981("ۡ᩶") ^ i33) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                            int i35 = ((m69818 ^ i34) * 5217) ^ 446275643;
                            int i36 = -378749912;
                            while (true) {
                                i32 = ((((i32 ^ i34) * 29433) >> 31) & i35) ^ (m69818 ^ i36);
                                switch (i32) {
                                    case -2123110441:
                                    case -1005054255:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            m69818 = (C0630.m2566("ۗܽ") + i34) * 7;
                                            i35 = ((m69818 ^ i33) * (-17325)) ^ (-2072224773);
                                            i36 = -367750911;
                                        } else {
                                            m69818 = (C2105.m6981("ۗۛ") ^ i33) * (-5);
                                            i35 = ((m69818 ^ i34) * 19585) ^ (-647116759);
                                            i36 = -15693887;
                                        }
                                    case -1864817157:
                                    case -763789725:
                                        if (C3746.f11829 <= 0) {
                                            m69818 = (C2105.m6981("֡֡") ^ i34) * (-107);
                                            i35 = ((m69818 ^ i33) * (-18971)) ^ 764684943;
                                            i36 = -1140385749;
                                        } else {
                                            m69818 = C2105.m6981("ܿ֨") ^ i33;
                                            i35 = ((m69818 ^ i34) * 579) ^ 1749994571;
                                            i36 = 1013153288;
                                        }
                                    case -1838537184:
                                    case -1643945924:
                                        if (C2105.m6982() != 0) {
                                            m69818 = (C2105.m6981("ۖ᩹") ^ i34) * 119;
                                            i35 = ((m69818 ^ i33) * (-15959)) ^ (-353920060);
                                            i36 = 1905831033;
                                        } else {
                                            m69818 = C2105.m6981("ۜۤ") ^ i34;
                                            i35 = ((m69818 ^ i33) * (-2893)) ^ (-1654427205);
                                            i36 = 20391655;
                                        }
                                    case -1720983513:
                                    case -473136113:
                                        C0422.m1963();
                                        m69818 = (C2105.m6981("֡֡") ^ i34) * (-107);
                                        i35 = ((m69818 ^ i33) * (-18971)) ^ 764684943;
                                        i36 = -1140385749;
                                    case -1348472455:
                                    case -672148708:
                                        if (RunnableC1108.f4040) {
                                            m69818 = (C2105.m6981("ۗܿ") + i34) * 57;
                                            i35 = ((m69818 ^ i33) * 8575) ^ (-1755285557);
                                            i36 = 1108713263;
                                        } else {
                                            m69818 = C2105.m6981("ܿ֨") ^ i33;
                                            i35 = ((m69818 ^ i34) * 579) ^ 1749994571;
                                            i36 = 1013153288;
                                        }
                                    case -1150619130:
                                    case 630228530:
                                        if (C0798.f2919) {
                                            m69818 = (C2105.m6981("ۖ᩹") ^ i34) * 119;
                                            i35 = ((m69818 ^ i33) * (-15959)) ^ (-353920060);
                                            i36 = 1905831033;
                                        } else {
                                            m69818 = C2105.m6981("᩵ܿ") ^ i33;
                                            i35 = ((m69818 ^ i34) * 12429) ^ 1235230446;
                                            i36 = -2001927217;
                                        }
                                    case -1109271899:
                                    case 1622797654:
                                        c48412 = c4841;
                                        if (C3911.f12484 >= 0) {
                                            m69818 = (C0630.m2566("ۗܽ") + i34) * 7;
                                            i35 = ((m69818 ^ i33) * (-17325)) ^ (-2072224773);
                                            i36 = -367750911;
                                        } else {
                                            m69818 = C2105.m6981("᩻۬") ^ i34;
                                            i35 = ((m69818 ^ i33) * 30057) ^ (-669524817);
                                            i36 = 135991709;
                                        }
                                    case -1060731638:
                                    case 1092543127:
                                        C3245.m9925();
                                        if (C2126.m7040()) {
                                            m69818 = (C2105.m6981("ۖ᩹") ^ i34) * 119;
                                            i35 = ((m69818 ^ i33) * (-15959)) ^ (-353920060);
                                            i36 = 1905831033;
                                        } else {
                                            m69818 = C2105.m6981("᩶᩻") ^ i33;
                                            i35 = ((m69818 ^ i34) * 17813) ^ (-80755714);
                                            i36 = 1707979689;
                                        }
                                    case -454041796:
                                    case 730980201:
                                        ViewOnClickListenerC2040.m6655(this.f50465, c48412, m9025);
                                        break;
                                    case -306182113:
                                    case -5325939:
                                        if (C0382.f1805) {
                                            m69818 = C2105.m6981("ۚۧ") ^ i33;
                                            i35 = ((m69818 ^ i34) * 15003) ^ 1547031425;
                                            i36 = 1094982819;
                                        } else {
                                            m69818 = C2105.m6981("᩶᩻") ^ i33;
                                            i35 = ((m69818 ^ i34) * 17813) ^ (-80755714);
                                            i36 = 1707979689;
                                        }
                                    case -271344044:
                                    case -96400104:
                                        if (C2167.f7158 >= 0) {
                                            m69818 = C2105.m6981("᩶᩻") ^ i33;
                                            i35 = ((m69818 ^ i34) * 17813) ^ (-80755714);
                                            i36 = 1707979689;
                                        } else {
                                            m69818 = (C0630.m2566("֨۟") + i33) * 15;
                                            i35 = ((m69818 ^ i34) * 9309) ^ 613629290;
                                            i36 = 1404306594;
                                        }
                                    case 68731347:
                                    case 1218489275:
                                        C4616.m13552();
                                        C3537.m10746();
                                        break;
                                    case 844229670:
                                    case 1464154540:
                                        C0422.m1963();
                                        if (C2167.m7155()) {
                                            m69818 = (C2105.m6981("֡֡") ^ i34) * (-107);
                                            i35 = ((m69818 ^ i33) * (-18971)) ^ 764684943;
                                            i36 = -1140385749;
                                        } else {
                                            m69818 = C2105.m6981("᩶᩻") ^ i33;
                                            i35 = ((m69818 ^ i34) * 17813) ^ (-80755714);
                                            i36 = 1707979689;
                                        }
                                    case 1232868870:
                                    case 1694223523:
                                        if (RunnableC3474.m10630()) {
                                            m69818 = (C2105.m6981("۫ۤ") + i33) * 25;
                                            i35 = ((m69818 ^ i34) * 21973) ^ 1115330799;
                                            i36 = 788933608;
                                        } else {
                                            m69818 = (C2105.m6981("ۖ᩹") ^ i34) * 119;
                                            i35 = ((m69818 ^ i33) * (-15959)) ^ (-353920060);
                                            i36 = 1905831033;
                                        }
                                    case 1763420317:
                                    case 1946887662:
                                        if (C0422.f1886 <= 0) {
                                            m69818 = (C0630.m2566("ۗܽ") + i34) * 7;
                                            i35 = ((m69818 ^ i33) * (-17325)) ^ (-2072224773);
                                            i36 = -367750911;
                                        } else {
                                            m69818 = C0630.m2566("ܺ᩹") ^ i34;
                                            i35 = ((m69818 ^ i33) * (-905)) ^ 900550649;
                                            i36 = 991484947;
                                        }
                                    default:
                                        if (C1294.f4556 >= 0) {
                                            m69818 = C2105.m6981("᩶᩻") ^ i33;
                                            i35 = ((m69818 ^ i34) * 17813) ^ (-80755714);
                                            i36 = 1707979689;
                                        } else {
                                            m69818 = (C0630.m2566("۫ܳ") + i34) * 7;
                                            i35 = ((m69818 ^ i33) * 30175) ^ (-1634805623);
                                            i36 = -1046005842;
                                        }
                                }
                                return;
                            }
                        }

                        {
                            int i32 = -705248336;
                            int i33 = C2958.f9394;
                            int i34 = C1773.f6144;
                            int m2566 = (C0630.m2566("ۗۗ") ^ i34) * 41;
                            int i35 = ((m2566 ^ i33) * (-779)) ^ 648570331;
                            int i36 = -1511704062;
                            while (true) {
                                i32 = ((((i32 ^ i33) * (-17333)) >> 31) & i35) ^ (m2566 ^ i36);
                                switch (i32) {
                                    case -2140583123:
                                    case -2049188517:
                                        if (C3432.f10845 >= 0) {
                                            m2566 = C2105.m6981("ۖ᩸") ^ i33;
                                            i35 = ((m2566 ^ i34) * (-6131)) ^ (-1903770470);
                                            i36 = -1086657266;
                                        } else {
                                            m2566 = C0630.m2566("ۖ֨") ^ i34;
                                            i35 = ((m2566 ^ i33) * (-19991)) ^ 212335899;
                                            i36 = -35651740;
                                        }
                                    case -2033934215:
                                    case -1699245291:
                                        return;
                                    case -2020925783:
                                    case -780926562:
                                        if (C3911.f12484 >= 0) {
                                            m2566 = C0630.m2566("ᩳۙ") ^ i33;
                                            i35 = ((m2566 ^ i34) * (-26503)) ^ (-446823941);
                                            i36 = 2069633773;
                                        } else {
                                            m2566 = C0630.m2566("ܳ᩻") ^ i33;
                                            i35 = ((m2566 ^ i34) * (-28151)) ^ 1435879549;
                                            i36 = 1944486726;
                                        }
                                    case -1904346436:
                                    case 1399755944:
                                        if (C0422.m1963()) {
                                            m2566 = C2105.m6981("ܶ᩵") ^ i34;
                                            i35 = ((m2566 ^ i33) * (-18139)) ^ 197892364;
                                            i36 = -1648846983;
                                        } else {
                                            m2566 = (C0630.m2566("᩷᩵") + i34) * (-61);
                                            i35 = ((m2566 ^ i33) * (-21699)) ^ (-364782596);
                                            i36 = 778553528;
                                        }
                                    case -1500102374:
                                    case -645411708:
                                        this.f50465 = viewOnClickListenerC2040;
                                        if (C3911.f12484 >= 0) {
                                            m2566 = (C2105.m6981("֫ۤ") ^ i33) * (-27);
                                            i35 = ((m2566 ^ i34) * 29919) ^ (-870537231);
                                            i36 = 263643495;
                                        } else {
                                            m2566 = (C2105.m6981("ۤۘ") ^ i34) * 43;
                                            i35 = ((m2566 ^ i33) * 5259) ^ 897408916;
                                            i36 = -269329853;
                                        }
                                    case -1400472135:
                                    case -1026846376:
                                        if (C0237.f1507 != 0) {
                                            m2566 = C2105.m6981("ۖ᩸") ^ i33;
                                            i35 = ((m2566 ^ i34) * (-6131)) ^ (-1903770470);
                                            i36 = -1086657266;
                                        } else {
                                            m2566 = (C0630.m2566("ᩳۖ") + i33) * 99;
                                            i35 = ((m2566 ^ i34) * 13819) ^ (-1778319986);
                                            i36 = -1640746872;
                                        }
                                    case -1291514000:
                                    case 709122218:
                                        C0382.m1848();
                                        m2566 = C2105.m6981("ۖ᩸") ^ i33;
                                        i35 = ((m2566 ^ i34) * (-6131)) ^ (-1903770470);
                                        i36 = -1086657266;
                                    case -748534016:
                                    case 1800251440:
                                        if (C0050.f910 >= 0) {
                                            m2566 = C2105.m6981("ۖ᩸") ^ i33;
                                            i35 = ((m2566 ^ i34) * (-6131)) ^ (-1903770470);
                                            i36 = -1086657266;
                                        } else {
                                            m2566 = (C2105.m6981("ۖܽ") + i33) * 57;
                                            i35 = ((m2566 ^ i34) * 14123) ^ (-631119706);
                                            i36 = -1447447869;
                                        }
                                    case -735665632:
                                    case 1401844038:
                                        if (C4263.f13799 <= 0) {
                                            m2566 = (C0630.m2566("᩷᩵") + i34) * (-61);
                                            i35 = ((m2566 ^ i33) * (-21699)) ^ (-364782596);
                                            i36 = 778553528;
                                        } else {
                                            m2566 = C2105.m6981("֫ۛ") ^ i33;
                                            i35 = ((m2566 ^ i34) * 20685) ^ (-2112517563);
                                            i36 = 522380290;
                                        }
                                    case -369063931:
                                    case -89359427:
                                        if (C4263.f13799 <= 0) {
                                            m2566 = (C2105.m6981("֫ۤ") ^ i33) * (-27);
                                            i35 = ((m2566 ^ i34) * 29919) ^ (-870537231);
                                            i36 = 263643495;
                                        } else {
                                            m2566 = (i34 - C2105.m6981("ۢ᩸")) * (-13);
                                            i35 = ((m2566 ^ i33) * (-5461)) ^ 932900170;
                                            i36 = -495373275;
                                        }
                                    case -209644474:
                                    case 1243142651:
                                        C22628.m50615();
                                        C0630.m2564();
                                        throw new RuntimeException();
                                    case -153846333:
                                    case 1028310413:
                                        if (C3746.f11829 <= 0) {
                                            m2566 = C2105.m6981("ۖ᩸") ^ i33;
                                            i35 = ((m2566 ^ i34) * (-6131)) ^ (-1903770470);
                                            i36 = -1086657266;
                                        } else {
                                            m2566 = (C0630.m2566("۬᩻") ^ i34) * (-45);
                                            i35 = ((m2566 ^ i33) * (-6767)) ^ (-780822643);
                                            i36 = 1680603522;
                                        }
                                    case 514392138:
                                    case 908889749:
                                        if (C4616.m13552() != 0) {
                                            m2566 = C2105.m6981("ۖ᩸") ^ i33;
                                            i35 = ((m2566 ^ i34) * (-6131)) ^ (-1903770470);
                                            i36 = -1086657266;
                                        } else {
                                            m2566 = (C2105.m6981("ۖۡ") + i33) * 13;
                                            i35 = ((m2566 ^ i34) * (-23939)) ^ (-113821782);
                                            i36 = -222724393;
                                        }
                                    case 676825586:
                                    case 1108803653:
                                        if (C3746.f11829 <= 0) {
                                            m2566 = (C2105.m6981("֫ۤ") ^ i33) * (-27);
                                            i35 = ((m2566 ^ i34) * 29919) ^ (-870537231);
                                            i36 = 263643495;
                                        } else {
                                            m2566 = C0630.m2566("ܳۜ") ^ i34;
                                            i35 = ((m2566 ^ i33) * 12695) ^ 1562255215;
                                            i36 = -1456039594;
                                        }
                                    case 719879137:
                                    case 1332877952:
                                        C3746.m11369();
                                        if (C3537.m10746() > 0) {
                                            m2566 = C2105.m6981("ۖ᩸") ^ i33;
                                            i35 = ((m2566 ^ i34) * (-6131)) ^ (-1903770470);
                                            i36 = -1086657266;
                                        } else {
                                            m2566 = C2105.m6981("ܶ᩵") ^ i34;
                                            i35 = ((m2566 ^ i33) * (-18139)) ^ 197892364;
                                            i36 = -1648846983;
                                        }
                                    default:
                                        if (C3432.f10845 >= 0) {
                                            m2566 = C2105.m6981("ܶ᩵") ^ i34;
                                            i35 = ((m2566 ^ i33) * (-18139)) ^ 197892364;
                                            i36 = -1648846983;
                                        } else {
                                            m2566 = (C2105.m6981("֫ۤ") ^ i33) * (-27);
                                            i35 = ((m2566 ^ i34) * 29919) ^ (-870537231);
                                            i36 = 263643495;
                                        }
                                }
                            }
                        }
                    });
                    int m69818 = C2105.m6981("᩷ۚ") ^ i19;
                    i21 = m69818 ^ (-1347491835);
                    i20 = ((m69818 ^ i18) * 11715) ^ (-393623715);
                    sArr6 = sArr3;
                    view8 = view3;
                    str17 = str8;
                    str16 = str7;
                    i16 = i9;
                    c192585 = c19258;
                case -1966178456:
                case 266428039:
                    textView5 = textView9;
                    str11 = str17;
                    c192584 = c192585;
                    str6 = str16;
                    view5 = view8;
                    C4616.m13548((TextView) C11340.m28028(view6, C2105.m6981(C3245.m9934(sArr5, 174, 3, i27)) ^ 2101339637), C0050.m935(packageInfo.applicationInfo.uid));
                    if (C1047.f3863 < 0) {
                        m69815 = C2105.m6981("ۙܰ") ^ i19;
                        i12 = ((m69815 ^ i18) * 24173) ^ (-1838360897);
                        i13 = 1212691570;
                        i14 = m69815 ^ i13;
                        str17 = str11;
                        i20 = i12;
                        textView9 = textView5;
                        c192585 = c192584;
                        i21 = i14;
                        view8 = view5;
                        str16 = str6;
                    }
                    m69815 = (i18 - C0630.m2566("᩹᩷")) * 25;
                    i12 = ((m69815 ^ i19) * 7617) ^ (-1649349221);
                    i13 = 480048492;
                    i14 = m69815 ^ i13;
                    str17 = str11;
                    i20 = i12;
                    textView9 = textView5;
                    c192585 = c192584;
                    i21 = i14;
                    view8 = view5;
                    str16 = str6;
                case -1829884161:
                case 1310243348:
                    C19258 c192586 = c192585;
                    str6 = str16;
                    textView8 = (TextView) C11340.m28028(view6, C2105.m6981(C7811.m20837(f6807, 149, 3, i27)) ^ 2122411242);
                    i24 = C2105.m6981(C3537.m10748(f6807, 152, 3, i27));
                    int m2566 = C0630.m2566("ᩴۨ") ^ i19;
                    sArr6 = sArr6;
                    str17 = str17;
                    textView9 = textView9;
                    i21 = m2566 ^ (-1118751253);
                    i20 = ((m2566 ^ i18) * 14303) ^ (-64291537);
                    i16 = i16;
                    view8 = view8;
                    c192585 = c192586;
                    str16 = str6;
                case -1827796389:
                case 1936167739:
                    C4616.m13552();
                    C3746.m11369();
                    textView5 = textView9;
                    str11 = str17;
                    c192584 = c192585;
                    str6 = str16;
                    view5 = view8;
                    m69815 = (i18 - C0630.m2566("᩹᩷")) * 25;
                    i12 = ((m69815 ^ i19) * 7617) ^ (-1649349221);
                    i13 = 480048492;
                    i14 = m69815 ^ i13;
                    str17 = str11;
                    i20 = i12;
                    textView9 = textView5;
                    c192585 = c192584;
                    i21 = i14;
                    view8 = view5;
                    str16 = str6;
                case -1740580938:
                case 1436081725:
                    RunnableC3474.m10618((C15134) C22518.m50492());
                    if (C9255.m23768()) {
                        str9 = str17;
                        c192583 = c192585;
                        str10 = str16;
                        view4 = view8;
                        m69814 = (C0630.m2566("ܶܳ") ^ i18) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i10 = ((m69814 ^ i19) * 11357) ^ (-148880403);
                        i11 = 2005953338;
                        i21 = m69814 ^ i11;
                        view8 = view4;
                        c192585 = c192583;
                        str16 = str10;
                        int i2922 = i10;
                        str17 = str9;
                        i20 = i2922;
                    } else {
                        m6981 = C2105.m6981("۫ۖ") ^ i19;
                        i2 = ((m6981 ^ i18) * 21985) ^ (-536937912);
                        i3 = 127727645;
                        i21 = m6981 ^ i3;
                        i20 = i2;
                    }
                case -1720220238:
                case 1707235887:
                    String str22 = str16;
                    View view9 = view8;
                    C1047.m3601((TextView) C1005.m3507(view6, C0630.m2566(str13) ^ 2117687248), C2958.m9035(C4075.m12251(i28), C4117.m12355(f6807, DHParameters.DEFAULT_MINIMUM_LENGTH, 2, i27)));
                    sArr6 = f6807;
                    int m69819 = (i18 - C2105.m6981("֫ܶ")) * 91;
                    i21 = m69819 ^ 677164044;
                    i20 = ((m69819 ^ i19) * (-3505)) ^ (-1387684105);
                    view8 = view9;
                    str17 = str17;
                    c192585 = c192585;
                    str16 = str22;
                    i16 = 162;
                case -1546032425:
                case -68637:
                    textView3 = textView9;
                    c192582 = c192585;
                    str3 = str16;
                    i4 = i16;
                    view2 = view8;
                    str4 = str17;
                    TextView textView13 = textView8;
                    str5 = str15;
                    textView4 = textView13;
                    C7811.m20840((TextView) view7, C0050.m935(packageInfo.versionCode));
                    sArr2 = sArr4;
                    i5 = i25;
                    C4616.m13548((TextView) C1005.m3507(view6, C2105.m6981(C3746.m11357(f6807, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 3, i27)) ^ 2126309766), C22927.m51020(c4841.f15285));
                    str12 = C1711.m5726(f6807, 115, 3, i27);
                    if (C4117.f13076 > 0) {
                        m69812 = C2105.m6981("ۘ᩷") ^ i18;
                        i6 = ((m69812 ^ i19) * 10537) ^ (-1854073166);
                        i7 = -2014568394;
                        i15 = m69812 ^ i7;
                        sArr4 = sArr2;
                        i25 = i5;
                        str17 = str4;
                        textView9 = textView3;
                        i21 = i15;
                        i20 = i6;
                        i16 = i4;
                        view8 = view2;
                        c192585 = c192582;
                        str16 = str3;
                        String str23 = str5;
                        textView8 = textView4;
                        str15 = str23;
                    }
                    sArr4 = sArr2;
                    i25 = i5;
                    m69813 = (C2105.m6981("ܽ۬") ^ i19) * (-69);
                    i6 = ((m69813 ^ i18) * 13711) ^ (-1662766308);
                    i8 = 100418030;
                    i15 = m69813 ^ i8;
                    str17 = str4;
                    textView9 = textView3;
                    i21 = i15;
                    i20 = i6;
                    i16 = i4;
                    view8 = view2;
                    c192585 = c192582;
                    str16 = str3;
                    String str232 = str5;
                    textView8 = textView4;
                    str15 = str232;
                case -1535477002:
                case 1166444569:
                    C1773.m5908();
                    if (C5695.f17556 < 0) {
                        c19258 = c192585;
                        str2 = str16;
                        i = i16;
                        view = view8;
                        str = str17;
                        textView = textView8;
                        sArr = sArr6;
                        int m25662 = (i18 - C0630.m2566("ۙܺ")) * (-31);
                        String str24 = str2;
                        i20 = ((m25662 ^ i19) * (-26891)) ^ (-343540612);
                        i21 = m25662 ^ 415550143;
                        sArr6 = sArr;
                        str17 = str;
                        i16 = i;
                        c192585 = c19258;
                        textView8 = textView;
                        view8 = view;
                        str16 = str24;
                    } else {
                        m6981 = (C2105.m6981("ۖۛ") + i19) * (-99);
                        i2 = ((m6981 ^ i18) * (-26047)) ^ (-559083305);
                        i3 = -939160301;
                        i21 = m6981 ^ i3;
                        i20 = i2;
                    }
                case -1490430834:
                case -473295335:
                    view = view8;
                    c19258 = c192585;
                    str2 = packageInfo.applicationInfo.sourceDir;
                    TextView textView14 = (TextView) C1005.m3507(view6, C2105.m6981(C1005.m3502(f6807, 165, 3, i27)) ^ 2123463273);
                    C1047.m3601(textView14, str2);
                    ViewOnClickListenerC14813.m35217(textView14);
                    C2126.m7039(textView14, new View.OnClickListener(viewOnClickListenerC2040) { // from class: l.ᩳۘ᩷

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC2040 f54451;

                        {
                            int i32 = 783869247;
                            int i33 = C1773.f6144;
                            int i34 = C4263.f13799;
                            int m25663 = C0630.m2566("ܰܿ") ^ i33;
                            int i35 = ((m25663 ^ i34) * (-2241)) ^ 365805771;
                            int i36 = -934019373;
                            while (true) {
                                i32 = ((((i32 ^ i34) * 10087) >> 31) & i35) ^ (m25663 ^ i36);
                                switch (i32) {
                                    case -2101636648:
                                    case 864164176:
                                        if (C1773.f6144 <= 0) {
                                            m25663 = (C2105.m6981("ᩳۘ") + i33) * (-93);
                                            i35 = ((m25663 ^ i34) * (-27101)) ^ (-1372764134);
                                            i36 = -223751080;
                                        } else {
                                            m25663 = (i33 - C0630.m2566("᩷ܺ")) * (-59);
                                            i35 = ((m25663 ^ i34) * (-29465)) ^ (-1289696331);
                                            i36 = 636715499;
                                        }
                                    case -2052202226:
                                    case -1484534248:
                                        C2167.m7155();
                                        throw new RuntimeException();
                                    case -1908099944:
                                    case -156318647:
                                        if (C4159.f13567) {
                                            m25663 = (i33 - C0630.m2566("ۡ᩶")) * (-117);
                                            i35 = ((m25663 ^ i34) * (-16369)) ^ 929625072;
                                            i36 = -1416313771;
                                        } else {
                                            m25663 = C2105.m6981("ۤܽ") ^ i34;
                                            i35 = ((m25663 ^ i33) * 8123) ^ (-778185461);
                                            i36 = -1814086679;
                                        }
                                    case -1818119700:
                                    case 161448674:
                                        if (C3746.m11369() >= 0) {
                                            m25663 = (C2105.m6981("ᩳۘ") + i33) * (-93);
                                            i35 = ((m25663 ^ i34) * (-27101)) ^ (-1372764134);
                                            i36 = -223751080;
                                        } else {
                                            m25663 = C0630.m2566("ܿܶ") ^ i33;
                                            i35 = ((m25663 ^ i34) * (-903)) ^ (-1542916607);
                                            i36 = 1838821299;
                                        }
                                    case -1651308958:
                                    case 1206669056:
                                        if (RunnableC0588.m2441() >= 0) {
                                            m25663 = (C2105.m6981("ᩳۘ") + i33) * (-93);
                                            i35 = ((m25663 ^ i34) * (-27101)) ^ (-1372764134);
                                            i36 = -223751080;
                                        } else {
                                            m25663 = C0630.m2566("᩶ܶ") ^ i34;
                                            i35 = ((m25663 ^ i33) * 4631) ^ (-414354950);
                                            i36 = 131927032;
                                        }
                                    case -1452659649:
                                    case -1128736263:
                                        if (RunnableC1108.m3790()) {
                                            m25663 = C2105.m6981("ᩳܿ") ^ i33;
                                            i35 = ((m25663 ^ i34) * 14919) ^ 445213151;
                                            i36 = -2027331166;
                                        } else {
                                            m25663 = (C0630.m2566("֡ۚ") + i33) * 97;
                                            i35 = ((m25663 ^ i34) * 14647) ^ (-952468156);
                                            i36 = 459953725;
                                        }
                                    case -1449706632:
                                    case 1879879353:
                                        if (C2105.f7037 == 0) {
                                            m25663 = C2105.m6981("ۤܽ") ^ i34;
                                            i35 = ((m25663 ^ i33) * 8123) ^ (-778185461);
                                            i36 = -1814086679;
                                        } else {
                                            m25663 = (C2105.m6981("᩷᩻") + i34) * 13;
                                            i35 = ((m25663 ^ i33) * 24643) ^ 426579232;
                                            i36 = 1372059747;
                                        }
                                    case -1385397550:
                                    case 777726807:
                                        if (C0483.m2121()) {
                                            m25663 = C0630.m2566("᩷ۤ") ^ i34;
                                            i35 = ((m25663 ^ i33) * (-17391)) ^ (-1823641653);
                                            i36 = -654569294;
                                        } else {
                                            m25663 = C2105.m6981("ᩳܿ") ^ i33;
                                            i35 = ((m25663 ^ i34) * 14919) ^ 445213151;
                                            i36 = -2027331166;
                                        }
                                    case -1367512964:
                                    case 2052829352:
                                        if (C4075.m12263() <= 0) {
                                            m25663 = (C2105.m6981("ᩳۘ") + i33) * (-93);
                                            i35 = ((m25663 ^ i34) * (-27101)) ^ (-1372764134);
                                            i36 = -223751080;
                                        } else {
                                            m25663 = C2105.m6981("ۙۧ") ^ i34;
                                            i35 = ((m25663 ^ i33) * (-23899)) ^ (-450098498);
                                            i36 = -1476574230;
                                        }
                                    case -893335342:
                                    case 1126672786:
                                        if (C3746.f11829 <= 0) {
                                            m25663 = C2105.m6981("ۤܽ") ^ i34;
                                            i35 = ((m25663 ^ i33) * 8123) ^ (-778185461);
                                            i36 = -1814086679;
                                        } else {
                                            m25663 = (C2105.m6981("ۖ۠") ^ i34) * 81;
                                            i35 = ((m25663 ^ i33) * (-17081)) ^ 1898412298;
                                            i36 = 1600367933;
                                        }
                                    case -683504861:
                                    case 139136030:
                                        C7811.m20844();
                                        m25663 = C2105.m6981("ۤܽ") ^ i34;
                                        i35 = ((m25663 ^ i33) * 8123) ^ (-778185461);
                                        i36 = -1814086679;
                                    case -575091233:
                                    case -324861225:
                                        return;
                                    case -420579030:
                                    case 1564939662:
                                        this.f54451 = viewOnClickListenerC2040;
                                        if (C3432.m10477() <= 0) {
                                            m25663 = (C2105.m6981("ᩳۘ") + i33) * (-93);
                                            i35 = ((m25663 ^ i34) * (-27101)) ^ (-1372764134);
                                            i36 = -223751080;
                                        } else {
                                            m25663 = (C2105.m6981("᩻ۜ") + i33) * (-27);
                                            i35 = ((m25663 ^ i34) * 18815) ^ (-1703394681);
                                            i36 = 1447236275;
                                        }
                                    case -115416833:
                                    case 966816609:
                                        RunnableC1108.m3790();
                                        if (C4263.f13799 > 0) {
                                            m25663 = C2105.m6981("ۤܽ") ^ i34;
                                            i35 = ((m25663 ^ i33) * 8123) ^ (-778185461);
                                            i36 = -1814086679;
                                        } else {
                                            m25663 = (C2105.m6981("ᩳۘ") + i33) * (-93);
                                            i35 = ((m25663 ^ i34) * (-27101)) ^ (-1372764134);
                                            i36 = -223751080;
                                        }
                                    case 518695732:
                                    case 749782880:
                                        if (C21923.f70183 != 0) {
                                            m25663 = C2105.m6981("ᩳܿ") ^ i33;
                                            i35 = ((m25663 ^ i34) * 14919) ^ 445213151;
                                            i36 = -2027331166;
                                        } else {
                                            m25663 = (C0630.m2566("᩶᩷") + i34) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i35 = ((m25663 ^ i33) * 1613) ^ 820149887;
                                            i36 = 1868744029;
                                        }
                                    default:
                                        if (C1005.f3721) {
                                            m25663 = C2105.m6981("᩹᩺") ^ i33;
                                            i35 = ((m25663 ^ i34) * (-11719)) ^ 1261502465;
                                            i36 = -1845037266;
                                        } else {
                                            m25663 = C2105.m6981("ᩳܿ") ^ i33;
                                            i35 = ((m25663 ^ i34) * 14919) ^ 445213151;
                                            i36 = -2027331166;
                                        }
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view10) {
                            ViewOnClickListenerC2040 viewOnClickListenerC20402 = null;
                            int i32 = 1706658206;
                            int i33 = C0630.f2410;
                            int i34 = AbstractC2021.f6743;
                            int m698110 = C2105.m6981("ܿ᩷") ^ i33;
                            int i35 = ((m698110 ^ i34) * (-21227)) ^ (-2101468202);
                            int i36 = -1288618007;
                            while (true) {
                                i32 = ((((i32 ^ i34) * 3085) >> 31) & i35) ^ (m698110 ^ i36);
                                switch (i32) {
                                    case -2076265361:
                                    case -313898095:
                                        if (C2167.f7158 >= 0) {
                                            m698110 = (i33 - C2105.m6981("ܳۗ")) * 67;
                                            i35 = ((m698110 ^ i34) * (-17839)) ^ (-1864442488);
                                            i36 = -1305238650;
                                        } else {
                                            m698110 = C2105.m6981("ۢܽ") ^ i34;
                                            i35 = ((m698110 ^ i33) * 9225) ^ (-582048838);
                                            i36 = -416275820;
                                        }
                                    case -1905103015:
                                    case 1542664457:
                                        if (C4075.m12263() <= 0) {
                                            m698110 = C2105.m6981("᩺᩻") ^ i33;
                                            i35 = ((m698110 ^ i34) * (-29151)) ^ (-772407504);
                                            i36 = -224462734;
                                        } else {
                                            m698110 = (i33 - C0630.m2566("ۨ᩺")) * 61;
                                            i35 = ((m698110 ^ i34) * (-8449)) ^ (-1890537834);
                                            i36 = -315589217;
                                        }
                                    case -1473423243:
                                    case 567213889:
                                        C1916.m6308();
                                        if (C4263.f13799 > 0) {
                                            m698110 = C2105.m6981("ܽ֫") ^ i34;
                                            i35 = ((m698110 ^ i33) * (-23865)) ^ 1159039222;
                                            i36 = 182685694;
                                        } else {
                                            m698110 = (C0630.m2566("ۨۨ") ^ i34) * (-33);
                                            i35 = ((m698110 ^ i33) * (-23025)) ^ 1416099567;
                                            i36 = -168606030;
                                        }
                                    case -1315278452:
                                    case 1136199032:
                                        if (C3245.f10203 <= 0) {
                                            m698110 = (C0630.m2566("ۨۨ") ^ i34) * (-33);
                                            i35 = ((m698110 ^ i33) * (-23025)) ^ 1416099567;
                                            i36 = -168606030;
                                        } else {
                                            m698110 = C2105.m6981("ۙ᩵") ^ i34;
                                            i35 = ((m698110 ^ i33) * (-16649)) ^ 23403247;
                                            i36 = 223957046;
                                        }
                                    case -1228545539:
                                    case 325114691:
                                        if (C3432.m10477() <= 0) {
                                            m698110 = C2105.m6981("᩺᩻") ^ i33;
                                            i35 = ((m698110 ^ i34) * (-29151)) ^ (-772407504);
                                            i36 = -224462734;
                                        } else {
                                            m698110 = C2105.m6981("ۤ۠") ^ i34;
                                            i35 = ((m698110 ^ i33) * (-15957)) ^ 17318360;
                                            i36 = 116966302;
                                        }
                                    case -1140778380:
                                    case 1994378619:
                                        if (C3746.f11829 <= 0) {
                                            m698110 = C2105.m6981("᩺᩻") ^ i33;
                                            i35 = ((m698110 ^ i34) * (-29151)) ^ (-772407504);
                                            i36 = -224462734;
                                        } else {
                                            m698110 = (i33 - C0630.m2566("ۢۖ")) * (-5);
                                            i35 = ((m698110 ^ i34) * 2103) ^ (-1059884467);
                                            i36 = -1941290661;
                                        }
                                    case -1096783047:
                                    case -314817590:
                                        RunnableC3474.m10630();
                                        C21923.m49329();
                                        break;
                                    case -802137814:
                                    case 1347588193:
                                        if (C2126.f7087) {
                                            m698110 = C2105.m6981("᩺᩻") ^ i33;
                                            i35 = ((m698110 ^ i34) * (-29151)) ^ (-772407504);
                                            i36 = -224462734;
                                        } else {
                                            m698110 = C2105.m6981("ܶ᩶") ^ i34;
                                            i35 = ((m698110 ^ i33) * 12455) ^ (-425615544);
                                            i36 = 1791270511;
                                        }
                                    case -377410633:
                                    case 916007488:
                                        if (C21923.f70183 != 0) {
                                            m698110 = (C0630.m2566("ۨۨ") ^ i34) * (-33);
                                            i35 = ((m698110 ^ i33) * (-23025)) ^ 1416099567;
                                            i36 = -168606030;
                                        } else {
                                            m698110 = C0630.m2566("֡֫") ^ i33;
                                            i35 = ((m698110 ^ i34) * 29807) ^ (-1963144509);
                                            i36 = -1441995991;
                                        }
                                    case -365647976:
                                    case 495635034:
                                        viewOnClickListenerC20402.m6691(str2);
                                        break;
                                    case -256067515:
                                    case 308210983:
                                        if (C0050.f910 >= 0) {
                                            m698110 = (i33 - C0630.m2566("ܽۤ")) * 39;
                                            i35 = ((m698110 ^ i34) * (-30357)) ^ (-526901395);
                                            i36 = 1038971923;
                                        } else {
                                            m698110 = (i34 - C0630.m2566("ۢۢ")) * 73;
                                            i35 = ((m698110 ^ i33) * 19545) ^ (-887193488);
                                            i36 = -1756052454;
                                        }
                                    case 237096896:
                                    case 684138781:
                                        if (C5695.f17556 < 0) {
                                            m698110 = (i33 - C0630.m2566("ܽۤ")) * 39;
                                            i35 = ((m698110 ^ i34) * (-30357)) ^ (-526901395);
                                            i36 = 1038971923;
                                        } else {
                                            m698110 = C2105.m6981("ܽ֫") ^ i34;
                                            i35 = ((m698110 ^ i33) * (-23865)) ^ 1159039222;
                                            i36 = 182685694;
                                        }
                                    case 366254101:
                                    case 569908143:
                                        if (C3245.f10203 <= 0) {
                                            m698110 = (i33 - C0630.m2566("ܽۤ")) * 39;
                                            i35 = ((m698110 ^ i34) * (-30357)) ^ (-526901395);
                                            i36 = 1038971923;
                                        } else {
                                            m698110 = (i33 - C2105.m6981("ܳۗ")) * 67;
                                            i35 = ((m698110 ^ i34) * (-17839)) ^ (-1864442488);
                                            i36 = -1305238650;
                                        }
                                    case 556849665:
                                    case 1736564516:
                                        if (C2958.f9394 >= 0) {
                                            m698110 = (C0630.m2566("ۨۨ") ^ i34) * (-33);
                                            i35 = ((m698110 ^ i33) * (-23025)) ^ 1416099567;
                                            i36 = -168606030;
                                        } else {
                                            m698110 = C0630.m2566("ۢ᩸") ^ i33;
                                            i35 = ((m698110 ^ i34) * 23817) ^ 2073825621;
                                            i36 = -1208333567;
                                        }
                                    case 948998695:
                                    case 1013902316:
                                        viewOnClickListenerC20402 = this.f54451;
                                        if (C21923.f70183 != 0) {
                                            m698110 = C2105.m6981("᩺᩻") ^ i33;
                                            i35 = ((m698110 ^ i34) * (-29151)) ^ (-772407504);
                                            i36 = -224462734;
                                        } else {
                                            m698110 = C0630.m2566("ܳۧ") ^ i33;
                                            i35 = ((m698110 ^ i34) * 19157) ^ 1253373991;
                                            i36 = 1195033352;
                                        }
                                    default:
                                        C0630.m2564();
                                        RunnableC3474.m10630();
                                        m698110 = (i33 - C0630.m2566("ܽۤ")) * 39;
                                        i35 = ((m698110 ^ i34) * (-30357)) ^ (-526901395);
                                        i36 = 1038971923;
                                }
                                return;
                            }
                        }
                    });
                    TextView textView15 = (TextView) C1005.m3507(view6, C0630.m2566(C2126.m7036(f6807, 168, 3, i27)) ^ 2120581047);
                    String m40576 = C17283.m40576(packageInfo.firstInstallTime);
                    if (AbstractC2021.f6743 <= 0) {
                        textView9 = textView15;
                        i = i16;
                        sArr = sArr6;
                        str = m40576;
                        textView = textView8;
                        int m256622 = (i18 - C0630.m2566("ۙܺ")) * (-31);
                        String str242 = str2;
                        i20 = ((m256622 ^ i19) * (-26891)) ^ (-343540612);
                        i21 = m256622 ^ 415550143;
                        sArr6 = sArr;
                        str17 = str;
                        i16 = i;
                        c192585 = c19258;
                        textView8 = textView;
                        view8 = view;
                        str16 = str242;
                    } else {
                        int m25663 = (C0630.m2566("ۢ۬") ^ i19) * (-121);
                        int i32 = ((m25663 ^ i18) * (-25085)) ^ (-239920080);
                        i21 = m25663 ^ (-1914602893);
                        textView9 = textView15;
                        str17 = m40576;
                        view8 = view;
                        str16 = str2;
                        i20 = i32;
                        c192585 = c19258;
                    }
                case -1434577764:
                case 927365616:
                    textView3 = textView9;
                    c192582 = c192585;
                    str3 = str16;
                    i4 = i16;
                    view2 = view8;
                    str4 = str17;
                    TextView textView16 = (TextView) C1005.m3507(view6, i23 ^ 2130405696);
                    final String str25 = str15;
                    C1047.m3601(textView16, str25);
                    ViewOnClickListenerC14813.m35217(textView16);
                    C4159.m12564(textView16, new View.OnClickListener(viewOnClickListenerC2040) { // from class: l.ۧۘ᩷

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC2040 f32401;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view10) {
                            C4841 c48412 = null;
                            int i33 = 1167703215;
                            int i34 = C22628.f73083;
                            int i35 = C3911.f12484;
                            int m698110 = C2105.m6981("ۜۚ") ^ i35;
                            int i36 = ((m698110 ^ i34) * 8589) ^ (-1386368425);
                            int i37 = 616516576;
                            while (true) {
                                i33 = ((((i33 ^ i34) * (-12077)) >> 31) & i36) ^ (m698110 ^ i37);
                                switch (i33) {
                                    case -2047132867:
                                    case 241955863:
                                        ViewOnClickListenerC2040.m6682(this.f32401, c48412, str25);
                                        break;
                                    case -1907284126:
                                    case -1153223075:
                                        ViewOnClickListenerC1958.m6429();
                                        if (C3537.f11231 >= 0) {
                                            m698110 = (C2105.m6981("ܽܿ") ^ i35) * 27;
                                            i36 = ((m698110 ^ i34) * (-541)) ^ (-654203961);
                                            i37 = -282485644;
                                        } else {
                                            m698110 = (C2105.m6981("֨ۜ") + i35) * (-11);
                                            i36 = ((m698110 ^ i34) * (-21383)) ^ (-102210412);
                                            i37 = 1188786060;
                                        }
                                    case -1894939566:
                                    case -412504800:
                                        c48412 = c4841;
                                        if (C1294.f4556 >= 0) {
                                            m698110 = (C2105.m6981("ۗۨ") ^ i34) * (-51);
                                            i36 = ((m698110 ^ i35) * (-9819)) ^ (-63720277);
                                            i37 = 2119832636;
                                        } else {
                                            m698110 = C0630.m2566("ᩳᩴ") ^ i34;
                                            i36 = ((m698110 ^ i35) * (-30975)) ^ (-1204895555);
                                            i37 = 999013525;
                                        }
                                    case -1878596807:
                                    case 1366023793:
                                        if (C0798.f2919) {
                                            m698110 = (C2105.m6981("ۗۨ") ^ i34) * (-51);
                                            i36 = ((m698110 ^ i35) * (-9819)) ^ (-63720277);
                                            i37 = 2119832636;
                                        } else {
                                            m698110 = C0630.m2566("۠ܽ") ^ i35;
                                            i36 = ((m698110 ^ i34) * (-8455)) ^ (-529107611);
                                            i37 = 857110155;
                                        }
                                    case -1734692110:
                                    case -577274223:
                                        C4117.m12364();
                                        break;
                                    case -1646692826:
                                    case 1036074070:
                                        if (C1916.f6442) {
                                            m698110 = (C2105.m6981("᩹۫") + i34) * (-57);
                                            i36 = ((m698110 ^ i35) * 23439) ^ 1122954309;
                                            i37 = 1911166097;
                                        } else {
                                            m698110 = (C2105.m6981("֨ۜ") + i35) * (-11);
                                            i36 = ((m698110 ^ i34) * (-21383)) ^ (-102210412);
                                            i37 = 1188786060;
                                        }
                                    case -1255345607:
                                    case -365323852:
                                        C3911.m11924();
                                        C1047.m3599();
                                        m698110 = C2105.m6981("ܰ֫") ^ i34;
                                        i36 = ((m698110 ^ i35) * 12721) ^ 1277898270;
                                        i37 = -395011063;
                                    case -1034111349:
                                    case 955651380:
                                        if (RunnableC3474.f10992 <= 0) {
                                            m698110 = C2105.m6981("ܰ֫") ^ i34;
                                            i36 = ((m698110 ^ i35) * 12721) ^ 1277898270;
                                            i37 = -395011063;
                                        } else {
                                            m698110 = (C2105.m6981("۟᩹") ^ i34) * 29;
                                            i36 = ((m698110 ^ i35) * 29171) ^ 1480806792;
                                            i37 = -1965582996;
                                        }
                                    case -1017815352:
                                    case 2047461277:
                                        if (RunnableC0588.f2309 >= 0) {
                                            m698110 = (C2105.m6981("ܽܿ") ^ i35) * 27;
                                            i36 = ((m698110 ^ i34) * (-541)) ^ (-654203961);
                                            i37 = -282485644;
                                        } else {
                                            m698110 = C2105.m6981("۬ۖ") ^ i34;
                                            i36 = ((m698110 ^ i35) * (-15399)) ^ 1836122739;
                                            i37 = -950583857;
                                        }
                                    case -1010850860:
                                    case 1614612222:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            m698110 = (C2105.m6981("ܽܿ") ^ i35) * 27;
                                            i36 = ((m698110 ^ i34) * (-541)) ^ (-654203961);
                                            i37 = -282485644;
                                        } else {
                                            m698110 = C0630.m2566("᩸ᩳ") ^ i35;
                                            i36 = ((m698110 ^ i34) * (-32645)) ^ (-957363399);
                                            i37 = -1749151922;
                                        }
                                    case -705327933:
                                    case 803534325:
                                        if (C0422.f1886 <= 0) {
                                            m698110 = (C2105.m6981("᩹۫") + i34) * (-57);
                                            i36 = ((m698110 ^ i35) * 23439) ^ 1122954309;
                                            i37 = 1911166097;
                                        } else {
                                            m698110 = (C2105.m6981("ۙ۬") ^ i34) * 127;
                                            i36 = ((m698110 ^ i35) * (-27639)) ^ 1217741299;
                                            i37 = -734304527;
                                        }
                                    case -457697326:
                                    case 1884689395:
                                        if (C0422.f1886 <= 0) {
                                            m698110 = (C2105.m6981("֨ۜ") + i35) * (-11);
                                            i36 = ((m698110 ^ i34) * (-21383)) ^ (-102210412);
                                            i37 = 1188786060;
                                        } else {
                                            m698110 = (C2105.m6981("ۗۛ") ^ i35) * 17;
                                            i36 = ((m698110 ^ i34) * 25761) ^ 1075562832;
                                            i37 = -1303748319;
                                        }
                                    case -223025594:
                                    case 11348233:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            m698110 = (C2105.m6981("ۗۨ") ^ i34) * (-51);
                                            i36 = ((m698110 ^ i35) * (-9819)) ^ (-63720277);
                                            i37 = 2119832636;
                                        } else {
                                            m698110 = C2105.m6981("֡ۨ") ^ i35;
                                            i36 = ((m698110 ^ i34) * 5109) ^ 1850139364;
                                            i37 = -1766489983;
                                        }
                                    case 472829094:
                                    case 1902012320:
                                        if (C1005.f3721) {
                                            m698110 = (C0630.m2566("ܿۤ") + i34) * 31;
                                            i36 = ((m698110 ^ i35) * (-27367)) ^ (-1086074992);
                                            i37 = -57665275;
                                        } else {
                                            m698110 = C2105.m6981("ܰ֫") ^ i34;
                                            i36 = ((m698110 ^ i35) * 12721) ^ 1277898270;
                                            i37 = -395011063;
                                        }
                                    case 1018847371:
                                    case 1391388497:
                                        if (AbstractC2021.f6743 <= 0) {
                                            m698110 = C2105.m6981("ܰ֫") ^ i34;
                                            i36 = ((m698110 ^ i35) * 12721) ^ 1277898270;
                                            i37 = -395011063;
                                        } else {
                                            m698110 = (C2105.m6981("ܽܿ") ^ i35) * 27;
                                            i36 = ((m698110 ^ i34) * (-541)) ^ (-654203961);
                                            i37 = -282485644;
                                        }
                                    default:
                                        if (C21923.f70183 != 0) {
                                            m698110 = C2105.m6981("ܰ֫") ^ i34;
                                            i36 = ((m698110 ^ i35) * 12721) ^ 1277898270;
                                            i37 = -395011063;
                                        } else {
                                            m698110 = C0630.m2566("ۙ֡") ^ i35;
                                            i36 = ((m698110 ^ i34) * (-9049)) ^ 555282360;
                                            i37 = -2032207613;
                                        }
                                }
                                return;
                            }
                        }

                        {
                            int i33 = -2126932937;
                            int i34 = C2958.f9394;
                            int i35 = C0050.f910;
                            int m698110 = (C2105.m6981("᩻ۗ") + i35) * (-57);
                            int i36 = ((m698110 ^ i34) * (-5839)) ^ 1825168330;
                            int i37 = -737698967;
                            while (true) {
                                i33 = ((((i33 ^ i34) * 26861) >> 31) & i36) ^ (m698110 ^ i37);
                                switch (i33) {
                                    case -1765472085:
                                    case 948749509:
                                        if (C5695.f17556 >= 0) {
                                            m698110 = (C2105.m6981("۫ܿ") + i35) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i36 = ((m698110 ^ i34) * (-12839)) ^ 168762685;
                                            i37 = -17708684;
                                        } else {
                                            m698110 = (C2105.m6981("ۛ᩹") ^ i34) * 83;
                                            i36 = ((m698110 ^ i35) * 21001) ^ (-1330981978);
                                            i37 = -1220495240;
                                        }
                                    case -1652273346:
                                    case -332681107:
                                        if (C4117.m12364() != 0) {
                                            m698110 = (C2105.m6981("ۡۤ") ^ i34) * 35;
                                            i36 = ((m698110 ^ i35) * (-21689)) ^ (-9040624);
                                            i37 = -1403363927;
                                        } else {
                                            m698110 = C0630.m2566("ۗ᩵") ^ i35;
                                            i36 = ((m698110 ^ i34) * 22989) ^ 821847252;
                                            i37 = 1784740766;
                                        }
                                    case -1389941767:
                                    case 1109293779:
                                        C21923.m49329();
                                        m698110 = (C2105.m6981("ۡۤ") ^ i34) * 35;
                                        i36 = ((m698110 ^ i35) * (-21689)) ^ (-9040624);
                                        i37 = -1403363927;
                                    case -1159365953:
                                    case -944020500:
                                        if (C4616.f14690 <= 0) {
                                            m698110 = (i35 - C0630.m2566("᩹ܶ")) * (-111);
                                            i36 = ((m698110 ^ i34) * 12997) ^ 1886396119;
                                            i37 = 936459165;
                                        } else {
                                            m698110 = C2105.m6981("ۗ᩻") ^ i34;
                                            i36 = ((m698110 ^ i35) * 9503) ^ (-1040693509);
                                            i37 = 420054142;
                                        }
                                    case -998157606:
                                    case 1357343760:
                                        ViewOnClickListenerC1958.m6429();
                                        if (C0237.f1507 != 0) {
                                            m698110 = (i35 - C0630.m2566("᩹ܶ")) * (-111);
                                            i36 = ((m698110 ^ i34) * 12997) ^ 1886396119;
                                            i37 = 936459165;
                                        } else {
                                            m698110 = (C2105.m6981("۫ܿ") + i35) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i36 = ((m698110 ^ i34) * (-12839)) ^ 168762685;
                                            i37 = -17708684;
                                        }
                                    case -849983885:
                                    case 652339349:
                                        if (C1294.f4556 >= 0) {
                                            m698110 = C2105.m6981("ᩳ᩸") ^ i34;
                                            i36 = ((m698110 ^ i35) * 15663) ^ (-1069522115);
                                            i37 = -1513686814;
                                        } else {
                                            m698110 = (i35 - C2105.m6981("۬ۙ")) * (-91);
                                            i36 = ((m698110 ^ i34) * (-24141)) ^ (-1399714716);
                                            i37 = -1036267726;
                                        }
                                    case -501879736:
                                    case 1872256595:
                                        if (C0964.f3626 != 0) {
                                            m698110 = C0630.m2566("۬᩵") ^ i34;
                                            i36 = ((m698110 ^ i35) * (-17931)) ^ (-352447179);
                                            i37 = -1135903528;
                                        } else {
                                            m698110 = (i34 - C0630.m2566("᩺᩻")) * 81;
                                            i36 = ((m698110 ^ i35) * 15433) ^ (-1885716900);
                                            i37 = -1317363270;
                                        }
                                    case -207191260:
                                    case 640209523:
                                        if (C1916.f6442) {
                                            m698110 = (C2105.m6981("۫᩻") + i34) * (-51);
                                            i36 = ((m698110 ^ i35) * 29219) ^ 1613099381;
                                            i37 = 477145510;
                                        } else {
                                            m698110 = C0630.m2566("۬᩵") ^ i34;
                                            i36 = ((m698110 ^ i35) * (-17931)) ^ (-352447179);
                                            i37 = -1135903528;
                                        }
                                    case 336752460:
                                    case 1963521759:
                                        if (C0483.f2088 >= 0) {
                                            m698110 = C0630.m2566("۬᩵") ^ i34;
                                            i36 = ((m698110 ^ i35) * (-17931)) ^ (-352447179);
                                            i37 = -1135903528;
                                        } else {
                                            m698110 = (C0630.m2566("ۘ᩹") ^ i35) * 9;
                                            i36 = ((m698110 ^ i34) * (-16629)) ^ (-1855549580);
                                            i37 = -1907503767;
                                        }
                                    case 395910005:
                                    case 1065465740:
                                        if (C4616.f14690 <= 0) {
                                            m698110 = C0630.m2566("۬᩵") ^ i34;
                                            i36 = ((m698110 ^ i35) * (-17931)) ^ (-352447179);
                                            i37 = -1135903528;
                                        } else {
                                            m698110 = C0630.m2566("᩻᩷") ^ i35;
                                            i36 = ((m698110 ^ i34) * (-11433)) ^ (-1923745069);
                                            i37 = 1178806440;
                                        }
                                    case 805091125:
                                    case 944104324:
                                        C1047.m3599();
                                        throw new RuntimeException();
                                    case 900652477:
                                    case 1900947768:
                                        if (AbstractC2021.f6743 <= 0) {
                                            m698110 = C2105.m6981("ᩳ᩸") ^ i34;
                                            i36 = ((m698110 ^ i35) * 15663) ^ (-1069522115);
                                            i37 = -1513686814;
                                        } else {
                                            m698110 = (C2105.m6981("֡᩹") ^ i35) * (-49);
                                            i36 = ((m698110 ^ i34) * 3339) ^ 2071533654;
                                            i37 = -1040649818;
                                        }
                                    case 1034233002:
                                    case 1231640390:
                                        RunnableC1937.m6387();
                                        if (C22628.f73083 > 0) {
                                            m698110 = (C2105.m6981("ۡۤ") ^ i34) * 35;
                                            i36 = ((m698110 ^ i35) * (-21689)) ^ (-9040624);
                                            i37 = -1403363927;
                                        } else {
                                            m698110 = (i35 - C0630.m2566("᩹ܶ")) * (-111);
                                            i36 = ((m698110 ^ i34) * 12997) ^ 1886396119;
                                            i37 = 936459165;
                                        }
                                    case 1787016728:
                                    case 2095424724:
                                        this.f32401 = viewOnClickListenerC2040;
                                        if (C11340.f33930 >= 0) {
                                            m698110 = C0630.m2566("۬᩵") ^ i34;
                                            i36 = ((m698110 ^ i35) * (-17931)) ^ (-352447179);
                                            i37 = -1135903528;
                                        } else {
                                            m698110 = (i34 - C2105.m6981("֫᩻")) * 75;
                                            i36 = ((m698110 ^ i35) * (-1377)) ^ 831877577;
                                            i37 = -1510852366;
                                        }
                                    case 1875161550:
                                    case 1963335141:
                                        if (C11340.m28031()) {
                                            m698110 = (C2105.m6981("ۡۤ") ^ i34) * 35;
                                            i36 = ((m698110 ^ i35) * (-21689)) ^ (-9040624);
                                            i37 = -1403363927;
                                        } else {
                                            m698110 = C0630.m2566("۬᩵") ^ i34;
                                            i36 = ((m698110 ^ i35) * (-17931)) ^ (-352447179);
                                            i37 = -1135903528;
                                        }
                                    default:
                                        return;
                                }
                            }
                        }
                    });
                    AbstractC15440 abstractC154402 = C16293.f50120;
                    textView4 = textView8;
                    str5 = str25;
                    StringBuilder sb = new StringBuilder(C0422.m1955(f6807, 136, 13, i27));
                    C1420.m4905(sb, packageInfo.packageName);
                    abstractC15440 = C3663.m11176(abstractC154402, C0050.m947(sb));
                    if (!ServiceConnectionC3453.m10569(abstractC15440)) {
                        m69813 = C0630.m2566("᩶ۙ") ^ i18;
                        i6 = ((m69813 ^ i19) * 16043) ^ (-1769925776);
                        i8 = -387608056;
                        i15 = m69813 ^ i8;
                        str17 = str4;
                        textView9 = textView3;
                        i21 = i15;
                        i20 = i6;
                        i16 = i4;
                        view8 = view2;
                        c192585 = c192582;
                        str16 = str3;
                        String str2322 = str5;
                        textView8 = textView4;
                        str15 = str2322;
                    }
                    m69813 = (C0630.m2566("ܽܽ") + i18) * (-31);
                    i6 = ((m69813 ^ i19) * 19547) ^ (-2129434860);
                    i8 = -980638223;
                    i15 = m69813 ^ i8;
                    str17 = str4;
                    textView9 = textView3;
                    i21 = i15;
                    i20 = i6;
                    i16 = i4;
                    view8 = view2;
                    c192585 = c192582;
                    str16 = str3;
                    String str23222 = str5;
                    textView8 = textView4;
                    str15 = str23222;
                case -1311557005:
                case -48656025:
                    if (C5695.f17556 >= 0) {
                        textView5 = textView9;
                        str11 = str17;
                        c192584 = c192585;
                        str6 = str16;
                        view5 = view8;
                        m69815 = (i18 - C0630.m2566("᩹᩷")) * 25;
                        i12 = ((m69815 ^ i19) * 7617) ^ (-1649349221);
                        i13 = 480048492;
                        i14 = m69815 ^ i13;
                        str17 = str11;
                        i20 = i12;
                        textView9 = textView5;
                        c192585 = c192584;
                        i21 = i14;
                        view8 = view5;
                        str16 = str6;
                    } else {
                        textView3 = textView9;
                        c192582 = c192585;
                        str3 = str16;
                        i4 = i16;
                        i5 = i25;
                        view2 = view8;
                        str4 = str17;
                        sArr2 = sArr4;
                        TextView textView17 = textView8;
                        str5 = str15;
                        textView4 = textView17;
                        m69812 = (i18 - C2105.m6981("ܳ۟")) * (-55);
                        i6 = ((m69812 ^ i19) * 14783) ^ 908765688;
                        i7 = 1140373911;
                        i15 = m69812 ^ i7;
                        sArr4 = sArr2;
                        i25 = i5;
                        str17 = str4;
                        textView9 = textView3;
                        i21 = i15;
                        i20 = i6;
                        i16 = i4;
                        view8 = view2;
                        c192585 = c192582;
                        str16 = str3;
                        String str232222 = str5;
                        textView8 = textView4;
                        str15 = str232222;
                    }
                case -1289911852:
                case -1088633211:
                    textView3 = textView9;
                    c192582 = c192585;
                    str3 = str16;
                    i4 = i16;
                    i5 = i25;
                    view2 = view8;
                    str4 = str17;
                    sArr2 = sArr4;
                    TextView textView18 = textView8;
                    str5 = str15;
                    textView4 = textView18;
                    i27 = 36746;
                    m69812 = C0630.m2566("۠ۢ") ^ i18;
                    i6 = ((m69812 ^ i19) * 3547) ^ (-787556037);
                    i7 = 1860082588;
                    i15 = m69812 ^ i7;
                    sArr4 = sArr2;
                    i25 = i5;
                    str17 = str4;
                    textView9 = textView3;
                    i21 = i15;
                    i20 = i6;
                    i16 = i4;
                    view8 = view2;
                    c192585 = c192582;
                    str16 = str3;
                    String str2322222 = str5;
                    textView8 = textView4;
                    str15 = str2322222;
                case -1244264233:
                case 644264703:
                    c19258 = c192585;
                    String str26 = str16;
                    i = i16;
                    view = view8;
                    str = str17;
                    sArr = sArr6;
                    i28 = i24 ^ 2129464356;
                    TextView textView19 = textView9;
                    textView = textView8;
                    RunnableC1937.m6377(textView, C2958.m9035(C4075.m12251(i28), RunnableC1937.m6385(f6807, 155, 2, i27)));
                    str13 = C3683.m11225(f6807, 157, 3, i27);
                    if (C1916.f6442) {
                        int m25664 = (C0630.m2566("᩸ܰ") + i19) * (-59);
                        textView8 = textView;
                        sArr6 = sArr;
                        view8 = view;
                        str17 = str;
                        str16 = str26;
                        i16 = i;
                        c192585 = c19258;
                        textView2 = textView19;
                        i21 = m25664 ^ (-1851460558);
                        i20 = ((m25664 ^ i18) * (-18141)) ^ (-909178286);
                        textView9 = textView2;
                    } else {
                        textView9 = textView19;
                        str2 = str26;
                        int m2566222 = (i18 - C0630.m2566("ۙܺ")) * (-31);
                        String str2422 = str2;
                        i20 = ((m2566222 ^ i19) * (-26891)) ^ (-343540612);
                        i21 = m2566222 ^ 415550143;
                        sArr6 = sArr;
                        str17 = str;
                        i16 = i;
                        c192585 = c19258;
                        textView8 = textView;
                        view8 = view;
                        str16 = str2422;
                    }
                case -1052814992:
                case 253239966:
                    if ((packageInfo.applicationInfo.flags & 129) == 0) {
                        textView3 = textView9;
                        c192582 = c192585;
                        str3 = str16;
                        i4 = i16;
                        view2 = view8;
                        str4 = str17;
                        TextView textView20 = textView8;
                        str5 = str15;
                        textView4 = textView20;
                        m69813 = (C0630.m2566("ܽܽ") + i18) * (-31);
                        i6 = ((m69813 ^ i19) * 19547) ^ (-2129434860);
                        i8 = -980638223;
                        i15 = m69813 ^ i8;
                        str17 = str4;
                        textView9 = textView3;
                        i21 = i15;
                        i20 = i6;
                        i16 = i4;
                        view8 = view2;
                        c192585 = c192582;
                        str16 = str3;
                        String str23222222 = str5;
                        textView8 = textView4;
                        str15 = str23222222;
                    } else {
                        str9 = str17;
                        c192583 = c192585;
                        str10 = str16;
                        view4 = view8;
                        m69814 = (C0630.m2566("ܶܳ") ^ i18) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i10 = ((m69814 ^ i19) * 11357) ^ (-148880403);
                        i11 = 2005953338;
                        i21 = m69814 ^ i11;
                        view8 = view4;
                        c192585 = c192583;
                        str16 = str10;
                        int i29222 = i10;
                        str17 = str9;
                        i20 = i29222;
                    }
                case -667886869:
                case 1703910300:
                    textView3 = textView9;
                    c192582 = c192585;
                    str3 = str16;
                    i4 = i16;
                    i5 = i25;
                    view2 = view8;
                    str4 = str17;
                    sArr2 = sArr4;
                    TextView textView21 = textView8;
                    str5 = str15;
                    textView4 = textView21;
                    C4616.m13548(textView10, str14);
                    TextView textView22 = (TextView) C1005.m3507(view6, C2105.m6981(RunnableC1937.m6385(f6807, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 3, i27)) ^ 2127284435);
                    packageInfo = c4841.f15288;
                    C7811.m20840(textView22, String.valueOf(packageInfo.versionName));
                    view7 = C1005.m3507(view6, C0630.m2566(C4117.m12355(f6807, 109, 3, i27)) ^ 2119234308);
                    if (C3432.m10477() > 0) {
                        m69812 = C2105.m6981("ۨ۟") ^ i18;
                        i6 = ((m69812 ^ i19) * (-1971)) ^ 429994406;
                        i7 = -1725470735;
                        i15 = m69812 ^ i7;
                        sArr4 = sArr2;
                        i25 = i5;
                        str17 = str4;
                        textView9 = textView3;
                        i21 = i15;
                        i20 = i6;
                        i16 = i4;
                        view8 = view2;
                        c192585 = c192582;
                        str16 = str3;
                        String str232222222 = str5;
                        textView8 = textView4;
                        str15 = str232222222;
                    }
                    sArr4 = sArr2;
                    i25 = i5;
                    m69813 = (C2105.m6981("ܽ۬") ^ i19) * (-69);
                    i6 = ((m69813 ^ i18) * 13711) ^ (-1662766308);
                    i8 = 100418030;
                    i15 = m69813 ^ i8;
                    str17 = str4;
                    textView9 = textView3;
                    i21 = i15;
                    i20 = i6;
                    i16 = i4;
                    view8 = view2;
                    c192585 = c192582;
                    str16 = str3;
                    String str2322222222 = str5;
                    textView8 = textView4;
                    str15 = str2322222222;
                case -609421444:
                case -516585908:
                    textView3 = textView9;
                    c192582 = c192585;
                    str3 = str16;
                    i4 = i16;
                    view2 = view8;
                    str4 = str17;
                    TextView textView23 = textView8;
                    str5 = str15;
                    textView4 = textView23;
                    C7811.m20840((TextView) C1005.m3507(view6, C2105.m6981(str12) ^ 2122863004), C5350.m15314(c4841.f15286));
                    C4616.m13548((TextView) C11340.m28028(view6, C0630.m2566(C3683.m11225(f6807, 118, 3, i27)) ^ 2101468202), C5350.m15314(c4841.f15289));
                    sArr4 = f6807;
                    i25 = UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    if (C21923.f70183 == 0) {
                        m69813 = C0630.m2566("᩵ۡ") ^ i19;
                        i6 = ((m69813 ^ i18) * 21129) ^ (-1243775385);
                        i8 = -671164494;
                        i15 = m69813 ^ i8;
                        str17 = str4;
                        textView9 = textView3;
                        i21 = i15;
                        i20 = i6;
                        i16 = i4;
                        view8 = view2;
                        c192585 = c192582;
                        str16 = str3;
                        String str23222222222 = str5;
                        textView8 = textView4;
                        str15 = str23222222222;
                    }
                    m69813 = (C2105.m6981("ܽ۬") ^ i19) * (-69);
                    i6 = ((m69813 ^ i18) * 13711) ^ (-1662766308);
                    i8 = 100418030;
                    i15 = m69813 ^ i8;
                    str17 = str4;
                    textView9 = textView3;
                    i21 = i15;
                    i20 = i6;
                    i16 = i4;
                    view8 = view2;
                    c192585 = c192582;
                    str16 = str3;
                    String str232222222222 = str5;
                    textView8 = textView4;
                    str15 = str232222222222;
                case -545657994:
                case 991568568:
                    textView3 = textView9;
                    c192582 = c192585;
                    str3 = str16;
                    i4 = i16;
                    view2 = view8;
                    str4 = str17;
                    TextView textView24 = textView8;
                    str5 = str15;
                    textView4 = textView24;
                    short[] sArr7 = sArr4;
                    int i33 = i25;
                    textView7 = (TextView) C1005.m3507(view6, C2105.m6981(C1420.m4902(sArr7, i33, 3, i27)) ^ 2126137895);
                    textView6 = (TextView) C1005.m3507(view6, C0630.m2566(C1504.m5177(f6807, 124, 3, i27)) ^ 2121432195);
                    i22 = C2105.m6981(C4117.m12355(f6807, 127, 3, i27));
                    if (C2105.f7037 != 0) {
                        sArr2 = sArr7;
                        i5 = i33;
                        m69812 = (i18 - C2105.m6981("ܳ۟")) * (-55);
                        i6 = ((m69812 ^ i19) * 14783) ^ 908765688;
                        i7 = 1140373911;
                        i15 = m69812 ^ i7;
                        sArr4 = sArr2;
                        i25 = i5;
                        str17 = str4;
                        textView9 = textView3;
                        i21 = i15;
                        i20 = i6;
                        i16 = i4;
                        view8 = view2;
                        c192585 = c192582;
                        str16 = str3;
                        String str2322222222222 = str5;
                        textView8 = textView4;
                        str15 = str2322222222222;
                    } else {
                        int m25665 = (i18 - C0630.m2566("ܳۘ")) * 39;
                        sArr4 = sArr7;
                        i25 = i33;
                        view8 = view2;
                        textView9 = textView3;
                        str16 = str3;
                        i21 = m25665 ^ (-2051836907);
                        i20 = ((m25665 ^ i19) * (-25687)) ^ (-657156668);
                        str17 = str4;
                        i16 = i4;
                        c192585 = c192582;
                        String str23222222222222 = str5;
                        textView8 = textView4;
                        str15 = str23222222222222;
                    }
                case -269290734:
                case 1603282079:
                    C3746.m11360(C1005.m3507(view6, C2105.m6981(C1420.m4902(f6807, 188, 3, i27)) ^ 2097311587), i26);
                    c19258 = c192585;
                    str7 = str16;
                    i9 = i16;
                    textView9 = textView9;
                    view3 = view8;
                    str8 = str17;
                    sArr3 = sArr6;
                    int m698182 = C2105.m6981("᩷ۚ") ^ i19;
                    i21 = m698182 ^ (-1347491835);
                    i20 = ((m698182 ^ i18) * 11715) ^ (-393623715);
                    sArr6 = sArr3;
                    view8 = view3;
                    str17 = str8;
                    str16 = str7;
                    i16 = i9;
                    c192585 = c19258;
                case -208692619:
                case 134680443:
                    textView3 = textView9;
                    c192582 = c192585;
                    str3 = str16;
                    i4 = i16;
                    i5 = i25;
                    view2 = view8;
                    str4 = str17;
                    sArr2 = sArr4;
                    TextView textView25 = textView8;
                    str5 = str15;
                    textView4 = textView25;
                    c4841 = viewOnClickListenerC23185.f74523;
                    view6 = C3019.m9259(viewOnClickListenerC2040, C2105.m6981(C0050.m948(f6807, 94, 3, i27)) ^ 2117430335);
                    ImageView imageView = (ImageView) C1005.m3507(view6, C2105.m6981(C4117.m12355(f6807, 97, 3, i27)) ^ 2123263793);
                    imageView.setImageDrawable(c4841.f15297);
                    C2126.m7039(imageView, new View.OnClickListener(viewOnClickListenerC2040) { // from class: l.֫ۘ᩷

                        /* renamed from: ۚ۠۬, reason: not valid java name and contains not printable characters */
                        private static final short[] f5610 = {4656, -24856, 31459, 30574, -25839, -28149, 25558, -25285, 29149, -29432, 29767, 28537, 31983};

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC2040 f5611;

                        {
                            int i34 = -494892742;
                            int i35 = C3683.f11629;
                            int i36 = C4117.f13076;
                            int m25666 = C0630.m2566("ۛ֡") ^ i35;
                            int i37 = ((m25666 ^ i36) * (-24445)) ^ 629615092;
                            int i38 = 2068263951;
                            while (true) {
                                i34 = ((((i34 ^ i36) * (-29561)) >> 31) & i37) ^ (m25666 ^ i38);
                                switch (i34) {
                                    case -2100475346:
                                    case 1078045326:
                                        if (C1773.f6144 <= 0) {
                                            m25666 = (C0630.m2566("ܰ֡") + i36) * 89;
                                            i37 = ((m25666 ^ i35) * 10315) ^ 1435793908;
                                            i38 = 821730586;
                                        } else {
                                            m25666 = (i36 - C0630.m2566("᩻ۤ")) * 119;
                                            i37 = ((m25666 ^ i35) * (-24429)) ^ 426483748;
                                            i38 = 1000095872;
                                        }
                                    case -2041151783:
                                    case 1848913181:
                                        if (C0798.f2919) {
                                            m25666 = (C2105.m6981("۬ܶ") ^ i35) * 11;
                                            i37 = ((m25666 ^ i36) * 22889) ^ (-1198386027);
                                            i38 = 644540184;
                                        } else {
                                            m25666 = (i36 - C2105.m6981("ۜۤ")) * 49;
                                            i37 = ((m25666 ^ i35) * 23727) ^ 416059303;
                                            i38 = 1176140062;
                                        }
                                    case -1993764502:
                                    case 1427220275:
                                        if (C4075.f12947 >= 0) {
                                            m25666 = (C0630.m2566("ᩴ۬") + i35) * (-89);
                                            i37 = ((m25666 ^ i36) * 21691) ^ (-1180338220);
                                            i38 = -1261328149;
                                        } else {
                                            m25666 = C0630.m2566("ۡ۬") ^ i35;
                                            i37 = ((m25666 ^ i36) * (-23341)) ^ 1718676279;
                                            i38 = 1926325023;
                                        }
                                    case -1982745080:
                                    case -629740047:
                                        if (C2272.f7362) {
                                            m25666 = (C2105.m6981("۬ܶ") ^ i35) * 11;
                                            i37 = ((m25666 ^ i36) * 22889) ^ (-1198386027);
                                            i38 = 644540184;
                                        } else {
                                            m25666 = (C0630.m2566("ܳ᩹") ^ i36) * (-113);
                                            i37 = ((m25666 ^ i35) * 15279) ^ (-1093354242);
                                            i38 = -1816657326;
                                        }
                                    case -1883230268:
                                    case 937737332:
                                        this.f5611 = viewOnClickListenerC2040;
                                        if (C2167.f7158 >= 0) {
                                            m25666 = (C2105.m6981("۬ܶ") ^ i35) * 11;
                                            i37 = ((m25666 ^ i36) * 22889) ^ (-1198386027);
                                            i38 = 644540184;
                                        } else {
                                            m25666 = C0630.m2566("ۙ᩺") ^ i35;
                                            i37 = ((m25666 ^ i36) * (-8719)) ^ (-875952517);
                                            i38 = -1262058078;
                                        }
                                    case -1881697781:
                                    case 1595964940:
                                        C22628.m50615();
                                        m25666 = (C0630.m2566("ܰ֡") + i36) * 89;
                                        i37 = ((m25666 ^ i35) * 10315) ^ 1435793908;
                                        i38 = 821730586;
                                    case -1636434767:
                                    case 480031298:
                                        C2520.m8026();
                                        C4159.m12565();
                                        throw new RuntimeException();
                                    case -1482370379:
                                    case -1053326534:
                                        if (RunnableC0588.m2441() < 0) {
                                            m25666 = (C0630.m2566("ܰ֡") + i36) * 89;
                                            i37 = ((m25666 ^ i35) * 10315) ^ 1435793908;
                                            i38 = 821730586;
                                        } else {
                                            m25666 = C2105.m6981("ۘܶ") ^ i35;
                                            i37 = ((m25666 ^ i36) * 21755) ^ 873058203;
                                            i38 = -1415093057;
                                        }
                                    case -1281994244:
                                    case -362248578:
                                        if (C4075.f12947 >= 0) {
                                            m25666 = C2105.m6981("ۘܶ") ^ i35;
                                            i37 = ((m25666 ^ i36) * 21755) ^ 873058203;
                                            i38 = -1415093057;
                                        } else {
                                            m25666 = (C0630.m2566("᩺ᩴ") + i36) * (-95);
                                            i37 = ((m25666 ^ i35) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged) ^ (-448856166);
                                            i38 = -210365948;
                                        }
                                    case -838200933:
                                    case 1839880626:
                                        if (C5695.f17556 >= 0) {
                                            m25666 = (C2105.m6981("۬ܶ") ^ i35) * 11;
                                            i37 = ((m25666 ^ i36) * 22889) ^ (-1198386027);
                                            i38 = 644540184;
                                        } else {
                                            m25666 = (i36 - C0630.m2566("۫᩷")) * 61;
                                            i37 = ((m25666 ^ i35) * (-11471)) ^ (-1533058711);
                                            i38 = 1990718487;
                                        }
                                    case -802198477:
                                    case -612924008:
                                        if (C2958.m9034() <= 0) {
                                            m25666 = (C0630.m2566("ܰ֡") + i36) * 89;
                                            i37 = ((m25666 ^ i35) * 10315) ^ 1435793908;
                                            i38 = 821730586;
                                        } else {
                                            m25666 = C0630.m2566("ܳᩳ") ^ i35;
                                            i37 = ((m25666 ^ i36) * 31639) ^ 1485877343;
                                            i38 = 2108598567;
                                        }
                                    case 581127901:
                                    case 921553373:
                                        if (C1420.f5096 <= 0) {
                                            m25666 = (C0630.m2566("ᩴ۬") + i35) * (-89);
                                            i37 = ((m25666 ^ i36) * 21691) ^ (-1180338220);
                                            i38 = -1261328149;
                                        } else {
                                            m25666 = (C2105.m6981("᩹۬") ^ i35) * (-75);
                                            i37 = ((m25666 ^ i36) * 1363) ^ (-962648863);
                                            i38 = -1218307224;
                                        }
                                    case 724528270:
                                    case 2130542535:
                                        RunnableC1937.m6387();
                                        if (C1005.m3501()) {
                                            m25666 = (C2105.m6981("۬ܶ") ^ i35) * 11;
                                            i37 = ((m25666 ^ i36) * 22889) ^ (-1198386027);
                                            i38 = 644540184;
                                        } else {
                                            m25666 = (C0630.m2566("ܰ֡") + i36) * 89;
                                            i37 = ((m25666 ^ i35) * 10315) ^ 1435793908;
                                            i38 = 821730586;
                                        }
                                    case 981673861:
                                    case 1727893355:
                                        if (C1916.f6442) {
                                            m25666 = C0630.m2566("ܶ᩸") ^ i35;
                                            i37 = ((m25666 ^ i36) * 7305) ^ (-310050951);
                                            i38 = -1835853610;
                                        } else {
                                            m25666 = (C0630.m2566("ᩴ۬") + i35) * (-89);
                                            i37 = ((m25666 ^ i36) * 21691) ^ (-1180338220);
                                            i38 = -1261328149;
                                        }
                                    case 1333771400:
                                    case 1403474544:
                                        if (C3746.f11829 > 0) {
                                            m25666 = C2105.m6981("ۘܶ") ^ i35;
                                            i37 = ((m25666 ^ i36) * 21755) ^ 873058203;
                                            i38 = -1415093057;
                                        } else {
                                            m25666 = C2105.m6981("ۘ֡") ^ i36;
                                            i37 = ((m25666 ^ i35) * (-24261)) ^ 276522104;
                                            i38 = 2112237536;
                                        }
                                    default:
                                        return;
                                }
                            }
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view10) {
                            int m698110;
                            int i34;
                            int i35;
                            short s;
                            short[] sArr8;
                            int i36;
                            int i37;
                            int i38;
                            ViewOnClickListenerC2040 viewOnClickListenerC20402;
                            int m25666;
                            int i39;
                            int i40;
                            int m25667;
                            int i41;
                            int i42;
                            short[] sArr9;
                            int i43;
                            ViewOnClickListenerC2040 viewOnClickListenerC20403;
                            int i44;
                            int i45;
                            int m25668;
                            int i46;
                            int i47;
                            short[] sArr10;
                            ViewOnClickListenerC1585 viewOnClickListenerC1585 = this;
                            int i48 = -54179199;
                            int i49 = C0630.f2410;
                            int i50 = C0714.f2697;
                            int m698111 = C2105.m6981("ۢۢ") ^ i49;
                            int i51 = ((m698111 ^ i50) * (-4133)) ^ 1917991565;
                            int i52 = m698111 ^ (-113571410);
                            String str27 = null;
                            String str28 = null;
                            C19258 c192587 = null;
                            short[] sArr11 = null;
                            short[] sArr12 = null;
                            short[] sArr13 = null;
                            short s2 = 0;
                            final ViewOnClickListenerC2040 viewOnClickListenerC20404 = null;
                            int i53 = 0;
                            int i54 = 0;
                            int i55 = 0;
                            int i56 = 0;
                            short s3 = 0;
                            int i57 = 0;
                            int i58 = 0;
                            int i59 = 0;
                            int i60 = 0;
                            int i61 = 0;
                            CharSequence[] charSequenceArr = null;
                            short[] sArr14 = null;
                            int i62 = 0;
                            String str29 = null;
                            int i63 = 0;
                            while (true) {
                                i48 = i52 ^ (i51 & (((i48 ^ i50) * 23457) >> 31));
                                switch (i48) {
                                    case -2121251926:
                                    case 408445770:
                                        viewOnClickListenerC20402 = viewOnClickListenerC20404;
                                        sArr8 = sArr14;
                                        i36 = i60;
                                        int i64 = ViewOnClickListenerC2040.f6808;
                                        sArr11 = f5610;
                                        i57 = 3;
                                        if (C11340.m28031()) {
                                            int m698112 = C2105.m6981("ۤۘ") ^ i50;
                                            viewOnClickListenerC1585 = this;
                                            i60 = i36;
                                            sArr14 = sArr8;
                                            i52 = m698112 ^ (-727107477);
                                            i51 = ((m698112 ^ i49) * 1097) ^ 1745622945;
                                            viewOnClickListenerC20404 = viewOnClickListenerC20402;
                                            i62 = 1;
                                        } else {
                                            s = s2;
                                            i38 = 1;
                                            i37 = 3;
                                            m25666 = C2105.m6981("۬֨") ^ i50;
                                            i39 = ((m25666 ^ i49) * (-2541)) ^ (-1796723517);
                                            i40 = 400243689;
                                            int i65 = m25666 ^ i40;
                                            s2 = s;
                                            i60 = i36;
                                            viewOnClickListenerC1585 = this;
                                            short[] sArr15 = sArr8;
                                            i52 = i65;
                                            i51 = i39;
                                            viewOnClickListenerC20404 = viewOnClickListenerC20402;
                                            i62 = i38;
                                            i57 = i37;
                                            sArr14 = sArr15;
                                        }
                                    case -1953655868:
                                    case 1525087746:
                                        i47 = i62;
                                        sArr10 = sArr11;
                                        sArr9 = sArr14;
                                        i43 = i60;
                                        viewOnClickListenerC20403 = viewOnClickListenerC20404;
                                        i44 = i57;
                                        i58 = C0630.m2566(C4263.m12817(sArr10, i47, i44, i56));
                                        i59 = 2099982737;
                                        if (C1711.f5919) {
                                            i60 = i43;
                                            sArr14 = sArr9;
                                            int m698113 = (C2105.m6981("۠֫") + i49) * (-57);
                                            i45 = i47;
                                            i52 = m698113 ^ (-1411859888);
                                            sArr11 = sArr10;
                                            i51 = ((m698113 ^ i50) * (-22803)) ^ 1185122675;
                                            viewOnClickListenerC1585 = this;
                                            int i66 = i45;
                                            i57 = i44;
                                            viewOnClickListenerC20404 = viewOnClickListenerC20403;
                                            i62 = i66;
                                        } else {
                                            i45 = i47;
                                            m25668 = (C0630.m2566("֫ۨ") ^ i49) * (-57);
                                            sArr11 = sArr10;
                                            i51 = ((m25668 ^ i50) * 25601) ^ (-1730503525);
                                            i46 = 660274102;
                                            int i67 = m25668 ^ i46;
                                            i60 = i43;
                                            sArr14 = sArr9;
                                            i52 = i67;
                                            viewOnClickListenerC1585 = this;
                                            int i662 = i45;
                                            i57 = i44;
                                            viewOnClickListenerC20404 = viewOnClickListenerC20403;
                                            i62 = i662;
                                        }
                                    case -1789632708:
                                    case -1551156568:
                                        sArr8 = sArr14;
                                        i36 = i60;
                                        i37 = i57;
                                        i38 = i62;
                                        viewOnClickListenerC20402 = viewOnClickListenerC20404;
                                        s = f5610[0];
                                        s3 = 41820;
                                        if (C4117.f13076 > 0) {
                                            m25666 = (C0630.m2566("᩷ܺ") ^ i50) * (-23);
                                            i39 = ((m25666 ^ i49) * (-4213)) ^ (-1537347796);
                                            i40 = 1577709177;
                                            int i652 = m25666 ^ i40;
                                            s2 = s;
                                            i60 = i36;
                                            viewOnClickListenerC1585 = this;
                                            short[] sArr152 = sArr8;
                                            i52 = i652;
                                            i51 = i39;
                                            viewOnClickListenerC20404 = viewOnClickListenerC20402;
                                            i62 = i38;
                                            i57 = i37;
                                            sArr14 = sArr152;
                                        }
                                        m25666 = C2105.m6981("۬֨") ^ i50;
                                        i39 = ((m25666 ^ i49) * (-2541)) ^ (-1796723517);
                                        i40 = 400243689;
                                        int i6522 = m25666 ^ i40;
                                        s2 = s;
                                        i60 = i36;
                                        viewOnClickListenerC1585 = this;
                                        short[] sArr1522 = sArr8;
                                        i52 = i6522;
                                        i51 = i39;
                                        viewOnClickListenerC20404 = viewOnClickListenerC20402;
                                        i62 = i38;
                                        i57 = i37;
                                        sArr14 = sArr1522;
                                    case -1732068915:
                                    case 882615284:
                                        short[] sArr16 = sArr14;
                                        int i68 = i60;
                                        int i69 = i61;
                                        int m25669 = C0630.m2566(RunnableC1108.m3789(sArr16, i68, i69, i56)) ^ 2103060532;
                                        if (C3683.m11222()) {
                                            i61 = i69;
                                            i60 = i68;
                                            i47 = i62;
                                            i53 = m25669;
                                            sArr14 = sArr16;
                                            viewOnClickListenerC20403 = viewOnClickListenerC20404;
                                            i44 = i57;
                                            sArr10 = sArr11;
                                            int m6981132 = (C2105.m6981("۠֫") + i49) * (-57);
                                            i45 = i47;
                                            i52 = m6981132 ^ (-1411859888);
                                            sArr11 = sArr10;
                                            i51 = ((m6981132 ^ i50) * (-22803)) ^ 1185122675;
                                            viewOnClickListenerC1585 = this;
                                            int i6622 = i45;
                                            i57 = i44;
                                            viewOnClickListenerC20404 = viewOnClickListenerC20403;
                                            i62 = i6622;
                                        } else {
                                            int m698114 = C2105.m6981("ܽ۬") ^ i50;
                                            i51 = ((m698114 ^ i49) * 239) ^ (-1934127014);
                                            i61 = i69;
                                            i53 = m25669;
                                            sArr14 = sArr16;
                                            i52 = m698114 ^ (-1645381548);
                                            i60 = i68;
                                        }
                                    case -1718288952:
                                    case -634462802:
                                        if (C0964.f3626 != 0) {
                                            i47 = i62;
                                            sArr10 = sArr11;
                                            viewOnClickListenerC20403 = viewOnClickListenerC20404;
                                            i44 = i57;
                                            int m69811322 = (C2105.m6981("۠֫") + i49) * (-57);
                                            i45 = i47;
                                            i52 = m69811322 ^ (-1411859888);
                                            sArr11 = sArr10;
                                            i51 = ((m69811322 ^ i50) * (-22803)) ^ 1185122675;
                                            viewOnClickListenerC1585 = this;
                                            int i66222 = i45;
                                            i57 = i44;
                                            viewOnClickListenerC20404 = viewOnClickListenerC20403;
                                            i62 = i66222;
                                        } else {
                                            m698110 = C0630.m2566("ܶ᩸") ^ i50;
                                            i34 = ((m698110 ^ i49) * (-3883)) ^ 1826970499;
                                            i35 = -1184062063;
                                            i52 = m698110 ^ i35;
                                            i51 = i34;
                                        }
                                    case -1691681488:
                                    case -371128949:
                                        viewOnClickListenerC20404 = viewOnClickListenerC1585.f5611;
                                        str27 = C0050.m946(viewOnClickListenerC20404, i58 ^ i59);
                                        sArr14 = f5610;
                                        i60 = 4;
                                        i61 = 3;
                                        if (C1916.f6442) {
                                            m698110 = (C0630.m2566("ۡܺ") ^ i49) * (-75);
                                            i34 = ((m698110 ^ i50) * 32577) ^ 64285743;
                                            i35 = 1526423423;
                                            i52 = m698110 ^ i35;
                                            i51 = i34;
                                        } else {
                                            i47 = i62;
                                            sArr10 = sArr11;
                                            viewOnClickListenerC20403 = viewOnClickListenerC20404;
                                            i44 = i57;
                                            int m698113222 = (C2105.m6981("۠֫") + i49) * (-57);
                                            i45 = i47;
                                            i52 = m698113222 ^ (-1411859888);
                                            sArr11 = sArr10;
                                            i51 = ((m698113222 ^ i50) * (-22803)) ^ 1185122675;
                                            viewOnClickListenerC1585 = this;
                                            int i662222 = i45;
                                            i57 = i44;
                                            viewOnClickListenerC20404 = viewOnClickListenerC20403;
                                            i62 = i662222;
                                        }
                                    case -1508189370:
                                    case -1118092213:
                                        C3432.m10490(c192587, C0630.m2566(C3245.m9934(sArr13, i55, 3, i56)) ^ 2126560058);
                                        if (C4075.f12947 >= 0) {
                                            i47 = i62;
                                            sArr10 = sArr11;
                                            viewOnClickListenerC20403 = viewOnClickListenerC20404;
                                            i44 = i57;
                                            int m6981132222 = (C2105.m6981("۠֫") + i49) * (-57);
                                            i45 = i47;
                                            i52 = m6981132222 ^ (-1411859888);
                                            sArr11 = sArr10;
                                            i51 = ((m6981132222 ^ i50) * (-22803)) ^ 1185122675;
                                            viewOnClickListenerC1585 = this;
                                            int i6622222 = i45;
                                            i57 = i44;
                                            viewOnClickListenerC20404 = viewOnClickListenerC20403;
                                            i62 = i6622222;
                                        } else {
                                            m698110 = (C2105.m6981("ۛ᩵") ^ i49) * (-85);
                                            i34 = ((m698110 ^ i50) * 29589) ^ (-1492868388);
                                            i35 = 439547198;
                                            i52 = m698110 ^ i35;
                                            i51 = i34;
                                        }
                                    case -1433481853:
                                    case 1763776919:
                                        short[] sArr17 = sArr14;
                                        int i70 = i60;
                                        int i71 = i62;
                                        ViewOnClickListenerC2040 viewOnClickListenerC20405 = viewOnClickListenerC20404;
                                        int i72 = i57;
                                        short s4 = s2;
                                        int i73 = s4 + 10455;
                                        if ((i73 * i73) - (s2 * s3) >= 0) {
                                            m25667 = C2105.m6981("ܽ᩸") ^ i49;
                                            i41 = ((m25667 ^ i50) * 16723) ^ 916664968;
                                            i42 = 81320598;
                                        } else {
                                            m25667 = (C0630.m2566("ܰ֨") ^ i50) * 9;
                                            i41 = ((m25667 ^ i49) * 1643) ^ (-830899323);
                                            i42 = -1118800433;
                                        }
                                        int i74 = m25667 ^ i42;
                                        s2 = s4;
                                        i51 = i41;
                                        i60 = i70;
                                        viewOnClickListenerC20404 = viewOnClickListenerC20405;
                                        i62 = i71;
                                        i57 = i72;
                                        sArr14 = sArr17;
                                        i52 = i74;
                                        viewOnClickListenerC1585 = this;
                                    case -1184204029:
                                    case 1583927051:
                                        sArr9 = sArr14;
                                        i43 = i60;
                                        int i75 = i62;
                                        viewOnClickListenerC20403 = viewOnClickListenerC20404;
                                        i44 = i57;
                                        i45 = i75;
                                        i56 = 3404;
                                        m25668 = (C0630.m2566("ܿۢ") + i49) * (-111);
                                        i51 = ((m25668 ^ i50) * 20921) ^ 550769988;
                                        i46 = 762551667;
                                        int i672 = m25668 ^ i46;
                                        i60 = i43;
                                        sArr14 = sArr9;
                                        i52 = i672;
                                        viewOnClickListenerC1585 = this;
                                        int i66222222 = i45;
                                        i57 = i44;
                                        viewOnClickListenerC20404 = viewOnClickListenerC20403;
                                        i62 = i66222222;
                                    case -1129598692:
                                    case 730727718:
                                        i63 = 2101340143 ^ C0630.m2566(C3911.m11919(sArr12, i54, 3, i56));
                                        if (RunnableC3474.f10992 <= 0) {
                                            m698110 = (i49 - C0630.m2566("ۜ۟")) * 119;
                                            i34 = ((m698110 ^ i50) * 15759) ^ (-487910410);
                                            i35 = 1531005331;
                                        } else {
                                            m698110 = (C2105.m6981("ۤܰ") ^ i50) * 9;
                                            i34 = ((m698110 ^ i49) * (-11341)) ^ 1572176582;
                                            i35 = -576697566;
                                        }
                                        i52 = m698110 ^ i35;
                                        i51 = i34;
                                    case -1113619390:
                                    case -1103339746:
                                        sArr9 = sArr14;
                                        i43 = i60;
                                        int i76 = i62;
                                        viewOnClickListenerC20403 = viewOnClickListenerC20404;
                                        i44 = i57;
                                        i45 = i76;
                                        i56 = 16899;
                                        m25668 = (C0630.m2566("ܿۢ") + i49) * (-111);
                                        i51 = ((m25668 ^ i50) * 20921) ^ 550769988;
                                        i46 = 762551667;
                                        int i6722 = m25668 ^ i46;
                                        i60 = i43;
                                        sArr14 = sArr9;
                                        i52 = i6722;
                                        viewOnClickListenerC1585 = this;
                                        int i662222222 = i45;
                                        i57 = i44;
                                        viewOnClickListenerC20404 = viewOnClickListenerC20403;
                                        i62 = i662222222;
                                    case -912520176:
                                    case -580012421:
                                        str29 = C0422.m1958(viewOnClickListenerC20404, i63);
                                        charSequenceArr = new CharSequence[3];
                                        charSequenceArr[0] = str27;
                                        charSequenceArr[1] = str28;
                                        if (C3019.f9544 >= 0) {
                                            s = s2;
                                            sArr8 = sArr14;
                                            i36 = i60;
                                            i37 = i57;
                                            i38 = i62;
                                            viewOnClickListenerC20402 = viewOnClickListenerC20404;
                                            m25666 = C2105.m6981("۬֨") ^ i50;
                                            i39 = ((m25666 ^ i49) * (-2541)) ^ (-1796723517);
                                            i40 = 400243689;
                                            int i65222 = m25666 ^ i40;
                                            s2 = s;
                                            i60 = i36;
                                            viewOnClickListenerC1585 = this;
                                            short[] sArr15222 = sArr8;
                                            i52 = i65222;
                                            i51 = i39;
                                            viewOnClickListenerC20404 = viewOnClickListenerC20402;
                                            i62 = i38;
                                            i57 = i37;
                                            sArr14 = sArr15222;
                                        } else {
                                            m698110 = C2105.m6981("᩵ۘ") ^ i49;
                                            i34 = ((m698110 ^ i50) * (-10805)) ^ (-442474017);
                                            i35 = -2118977627;
                                            i52 = m698110 ^ i35;
                                            i51 = i34;
                                        }
                                    case -620682272:
                                    case 1399821815:
                                        charSequenceArr[2] = str29;
                                        c192587 = C1773.m5912(viewOnClickListenerC20404);
                                        sArr13 = f5610;
                                        i55 = 10;
                                        if (C1711.f5919) {
                                            s = s2;
                                            sArr8 = sArr14;
                                            i36 = i60;
                                            i37 = i57;
                                            i38 = i62;
                                            viewOnClickListenerC20402 = viewOnClickListenerC20404;
                                            m25666 = C2105.m6981("۬֨") ^ i50;
                                            i39 = ((m25666 ^ i49) * (-2541)) ^ (-1796723517);
                                            i40 = 400243689;
                                            int i652222 = m25666 ^ i40;
                                            s2 = s;
                                            i60 = i36;
                                            viewOnClickListenerC1585 = this;
                                            short[] sArr152222 = sArr8;
                                            i52 = i652222;
                                            i51 = i39;
                                            viewOnClickListenerC20404 = viewOnClickListenerC20402;
                                            i62 = i38;
                                            i57 = i37;
                                            sArr14 = sArr152222;
                                        } else {
                                            m698110 = (C0630.m2566("ۜۤ") + i50) * (-113);
                                            i34 = ((m698110 ^ i49) * 20149) ^ 2116188956;
                                            i35 = -2001843859;
                                            i52 = m698110 ^ i35;
                                            i51 = i34;
                                        }
                                    case -105014870:
                                    case 150844363:
                                        final C4841 c48412 = c4841;
                                        c192587.m44429(charSequenceArr, -1, new DialogInterface.OnClickListener() { // from class: l.ۡۘ᩷
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i77) {
                                                int i78 = -759640539;
                                                int i79 = ServiceConnectionC3453.f10921;
                                                int i80 = C7811.f24123;
                                                int m256610 = C0630.m2566("ܺ֫") ^ i79;
                                                int i81 = ((m256610 ^ i80) * 9163) ^ 518313238;
                                                int i82 = -1977272834;
                                                while (true) {
                                                    i78 = ((((i78 ^ i80) * 1305) >> 31) & i81) ^ (m256610 ^ i82);
                                                    switch (i78) {
                                                        case -2131549053:
                                                        case -226511094:
                                                            ViewOnClickListenerC1958.m6429();
                                                            break;
                                                        case -2034140436:
                                                        case -703226771:
                                                            if (C0798.f2919) {
                                                                m256610 = C2105.m6981("᩵ۗ") ^ i79;
                                                                i81 = ((m256610 ^ i80) * 28697) ^ (-1668677881);
                                                                i82 = 1563967987;
                                                            } else {
                                                                m256610 = C2105.m6981("᩹ۖ") ^ i79;
                                                                i81 = ((m256610 ^ i80) * 7325) ^ (-1079132375);
                                                                i82 = 856175939;
                                                            }
                                                        case -2033567361:
                                                        case 1626300044:
                                                            C1420.m4913();
                                                            if (ViewOnClickListenerC1958.f6529 <= 0) {
                                                                m256610 = (i80 - C0630.m2566("۬᩻")) * 31;
                                                                i81 = ((m256610 ^ i79) * (-15365)) ^ (-738426166);
                                                                i82 = -1909675449;
                                                            } else {
                                                                m256610 = C2105.m6981("᩵ۗ") ^ i79;
                                                                i81 = ((m256610 ^ i80) * 28697) ^ (-1668677881);
                                                                i82 = 1563967987;
                                                            }
                                                        case -1787254587:
                                                        case -1150944521:
                                                            if (C22628.f73083 <= 0) {
                                                                m256610 = C0630.m2566("ᩴܳ") ^ i79;
                                                                i81 = ((m256610 ^ i80) * (-24749)) ^ (-760408047);
                                                                i82 = 1812458188;
                                                            } else {
                                                                m256610 = (i79 - C0630.m2566("ᩳᩴ")) * (-31);
                                                                i81 = ((m256610 ^ i80) * 31473) ^ 241433036;
                                                                i82 = -1294665616;
                                                            }
                                                        case -1570973636:
                                                        case -750896038:
                                                            if (RunnableC1937.f6483 >= 0) {
                                                                m256610 = (C2105.m6981("ᩳ᩺") + i80) * (-75);
                                                                i81 = ((m256610 ^ i79) * (-1275)) ^ (-1595619651);
                                                                i82 = -1114545526;
                                                            } else {
                                                                m256610 = C2105.m6981("ᩴۜ") ^ i79;
                                                                i81 = ((m256610 ^ i80) * (-15277)) ^ 1409096573;
                                                                i82 = -542648921;
                                                            }
                                                        case -1527058384:
                                                        case 1295357802:
                                                            if (RunnableC1108.f4040) {
                                                                m256610 = (i80 - C0630.m2566("ܰ᩻")) * (-43);
                                                                i81 = ((m256610 ^ i79) * (-21595)) ^ (-667315160);
                                                                i82 = 999954178;
                                                            } else {
                                                                m256610 = (C2105.m6981("ᩳ᩺") + i80) * (-75);
                                                                i81 = ((m256610 ^ i79) * (-1275)) ^ (-1595619651);
                                                                i82 = -1114545526;
                                                            }
                                                        case -1353624725:
                                                        case 1725048127:
                                                            if (C5695.f17556 >= 0) {
                                                                m256610 = C0630.m2566("ۗ۬") ^ i80;
                                                                i81 = ((m256610 ^ i79) * 14577) ^ 1051930528;
                                                                i82 = -1842098341;
                                                            } else {
                                                                m256610 = C0630.m2566("۟ܶ") ^ i80;
                                                                i81 = ((m256610 ^ i79) * 15801) ^ 1294035585;
                                                                i82 = 1743095069;
                                                            }
                                                        case -1311993983:
                                                        case -150390613:
                                                            if (C4075.f12947 < 0) {
                                                                m256610 = C0630.m2566("ᩴܳ") ^ i79;
                                                                i81 = ((m256610 ^ i80) * (-24749)) ^ (-760408047);
                                                                i82 = 1812458188;
                                                            } else {
                                                                m256610 = (i80 - C0630.m2566("۬᩻")) * 31;
                                                                i81 = ((m256610 ^ i79) * (-15365)) ^ (-738426166);
                                                                i82 = -1909675449;
                                                            }
                                                        case -999186797:
                                                        case 1123048478:
                                                            if (C3019.m9255() <= 0) {
                                                                m256610 = C2105.m6981("᩵ۗ") ^ i79;
                                                                i81 = ((m256610 ^ i80) * 28697) ^ (-1668677881);
                                                                i82 = 1563967987;
                                                            } else {
                                                                m256610 = (C0630.m2566("ۗ᩺") + i80) * (-67);
                                                                i81 = ((m256610 ^ i79) * (-27625)) ^ (-1956677884);
                                                                i82 = 545809736;
                                                            }
                                                        case -537068722:
                                                        case 484851717:
                                                            if (C3537.f11231 >= 0) {
                                                                m256610 = C0630.m2566("ᩴܳ") ^ i79;
                                                                i81 = ((m256610 ^ i80) * (-24749)) ^ (-760408047);
                                                                i82 = 1812458188;
                                                            } else {
                                                                m256610 = C0630.m2566("۬ᩴ") ^ i80;
                                                                i81 = ((m256610 ^ i79) * (-19273)) ^ 489759291;
                                                                i82 = 177589944;
                                                            }
                                                        case -350734981:
                                                        case -57983649:
                                                            if (C1916.f6442) {
                                                                m256610 = C0630.m2566("ۙ᩶") ^ i80;
                                                                i81 = ((m256610 ^ i79) * (-30395)) ^ 466497876;
                                                                i82 = 330101702;
                                                            } else {
                                                                m256610 = C2105.m6981("᩵ۗ") ^ i79;
                                                                i81 = ((m256610 ^ i80) * 28697) ^ (-1668677881);
                                                                i82 = 1563967987;
                                                            }
                                                        case 600035561:
                                                        case 1388220395:
                                                            C22628.m50615();
                                                            if (ServiceConnectionC3453.m10564() > 0) {
                                                                m256610 = C2105.m6981("᩵ۗ") ^ i79;
                                                                i81 = ((m256610 ^ i80) * 28697) ^ (-1668677881);
                                                                i82 = 1563967987;
                                                            } else {
                                                                m256610 = (C2105.m6981("ᩳ᩺") + i80) * (-75);
                                                                i81 = ((m256610 ^ i79) * (-1275)) ^ (-1595619651);
                                                                i82 = -1114545526;
                                                            }
                                                        case 656583598:
                                                        case 1888465226:
                                                            if (C0237.f1507 != 0) {
                                                                m256610 = C0630.m2566("ۗ۬") ^ i80;
                                                                i81 = ((m256610 ^ i79) * 14577) ^ 1051930528;
                                                                i82 = -1842098341;
                                                            } else {
                                                                m256610 = (i79 - C2105.m6981("᩺ۘ")) * (-95);
                                                                i81 = ((m256610 ^ i80) * (-22279)) ^ (-51900378);
                                                                i82 = 1218189248;
                                                            }
                                                        case 798585945:
                                                        case 1504910546:
                                                            ViewOnClickListenerC2040.m6654(viewOnClickListenerC20404, c48412, dialogInterface, i77);
                                                            break;
                                                        case 861084223:
                                                        case 1433223951:
                                                            if (C0630.f2410 <= 0) {
                                                                m256610 = C0630.m2566("ۗ۬") ^ i80;
                                                                i81 = ((m256610 ^ i79) * 14577) ^ 1051930528;
                                                                i82 = -1842098341;
                                                            } else {
                                                                m256610 = (C0630.m2566("᩷᩺") + i79) * (-55);
                                                                i81 = ((m256610 ^ i80) * 25465) ^ 2141951105;
                                                                i82 = 1425280565;
                                                            }
                                                        default:
                                                            C7811.m20844();
                                                            C2272.m7503();
                                                            m256610 = C0630.m2566("ᩴܳ") ^ i79;
                                                            i81 = ((m256610 ^ i80) * (-24749)) ^ (-760408047);
                                                            i82 = 1812458188;
                                                    }
                                                    return;
                                                }
                                            }

                                            {
                                                int i77 = 1461124944;
                                                int i78 = C3245.f10203;
                                                int i79 = RunnableC1937.f6483;
                                                int m698115 = C2105.m6981("֨ۤ") ^ i79;
                                                int i80 = ((m698115 ^ i78) * (-13379)) ^ (-223976978);
                                                int i81 = 1232646371;
                                                while (true) {
                                                    i77 = ((((i77 ^ i78) * (-14503)) >> 31) & i80) ^ (m698115 ^ i81);
                                                    switch (i77) {
                                                        case -1902642849:
                                                        case 2088249139:
                                                            if (C1420.m4913()) {
                                                                m698115 = (i78 - C0630.m2566("ۢۤ")) * (-59);
                                                                i80 = ((m698115 ^ i79) * 18835) ^ 1784902859;
                                                                i81 = -307061157;
                                                            } else {
                                                                m698115 = C2105.m6981("᩸۟") ^ i78;
                                                                i80 = ((m698115 ^ i79) * (-6059)) ^ 116024804;
                                                                i81 = 1887681332;
                                                            }
                                                        case -1419968453:
                                                        case 764245825:
                                                            if (RunnableC0588.m2441() >= 0) {
                                                                m698115 = (i78 - C2105.m6981("ܺ᩷")) * (-43);
                                                                i80 = ((m698115 ^ i79) * (-12743)) ^ 712078461;
                                                                i81 = 360412100;
                                                            } else {
                                                                m698115 = (C2105.m6981("ۖۨ") + i79) * 81;
                                                                i80 = ((m698115 ^ i78) * (-27747)) ^ 634889278;
                                                                i81 = -979104756;
                                                            }
                                                        case -1379461504:
                                                        case 1364054553:
                                                            if (C3683.f11629 >= 0) {
                                                                m698115 = (C2105.m6981("ۡ᩸") + i79) * 5;
                                                                i80 = ((m698115 ^ i78) * 26985) ^ 2046243898;
                                                                i81 = -1856321270;
                                                            } else {
                                                                m698115 = (i79 - C0630.m2566("᩷᩹")) * (-43);
                                                                i80 = ((m698115 ^ i78) * (-14827)) ^ 1491021774;
                                                                i81 = 600971119;
                                                            }
                                                        case -1109306036:
                                                        case 645722761:
                                                            C3911.m11924();
                                                            m698115 = C0630.m2566("ܽܿ") ^ i79;
                                                            i80 = ((m698115 ^ i78) * (-16087)) ^ 1597246021;
                                                            i81 = 1791373735;
                                                        case -864891254:
                                                        case -319105872:
                                                            return;
                                                        case -712873361:
                                                        case 917301507:
                                                            if (C2167.m7155()) {
                                                                m698115 = (C2105.m6981("ۡ᩸") + i79) * 5;
                                                                i80 = ((m698115 ^ i78) * 26985) ^ 2046243898;
                                                                i81 = -1856321270;
                                                            } else {
                                                                m698115 = (i78 - C2105.m6981("۠ۙ")) * (-51);
                                                                i80 = ((m698115 ^ i79) * 22033) ^ (-1807623744);
                                                                i81 = 1890772986;
                                                            }
                                                        case -573852505:
                                                        case 1356261386:
                                                            if (C0714.f2697 >= 0) {
                                                                m698115 = C0630.m2566("ܽܿ") ^ i79;
                                                                i80 = ((m698115 ^ i78) * (-16087)) ^ 1597246021;
                                                                i81 = 1791373735;
                                                            } else {
                                                                m698115 = (i79 - C2105.m6981("ۜۚ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                                                i80 = ((m698115 ^ i78) * (-3293)) ^ (-1313446930);
                                                                i81 = -1601060101;
                                                            }
                                                        case -503360145:
                                                        case 116954613:
                                                            if (RunnableC1937.f6483 >= 0) {
                                                                m698115 = (C2105.m6981("ۡ᩸") + i79) * 5;
                                                                i80 = ((m698115 ^ i78) * 26985) ^ 2046243898;
                                                                i81 = -1856321270;
                                                            } else {
                                                                m698115 = (i78 - C0630.m2566("᩹ܰ")) * 93;
                                                                i80 = ((m698115 ^ i79) * 17175) ^ 96556109;
                                                                i81 = -124762210;
                                                            }
                                                        case -477495963:
                                                        case 520043218:
                                                            RunnableC3474.m10630();
                                                            if (C3746.f11829 <= 0) {
                                                                m698115 = C0630.m2566("ܽܿ") ^ i79;
                                                                i80 = ((m698115 ^ i78) * (-16087)) ^ 1597246021;
                                                                i81 = 1791373735;
                                                            } else {
                                                                m698115 = C0630.m2566("ܽ۫") ^ i78;
                                                                i80 = ((m698115 ^ i79) * 1897) ^ 2037129001;
                                                                i81 = 67456431;
                                                            }
                                                        case -260395845:
                                                        case 548620867:
                                                            if (C0050.f910 >= 0) {
                                                                m698115 = C0630.m2566("ܽ۫") ^ i78;
                                                                i80 = ((m698115 ^ i79) * 1897) ^ 2037129001;
                                                                i81 = 67456431;
                                                            } else {
                                                                m698115 = (C2105.m6981("ۡ᩸") + i79) * 5;
                                                                i80 = ((m698115 ^ i78) * 26985) ^ 2046243898;
                                                                i81 = -1856321270;
                                                            }
                                                        case -81458897:
                                                        case 1643339914:
                                                            C3019.m9255();
                                                            throw new RuntimeException();
                                                        case 1210237807:
                                                        case 1340345088:
                                                            C2958.m9034();
                                                            if (C0964.f3626 != 0) {
                                                                m698115 = C0630.m2566("ܽ۫") ^ i78;
                                                                i80 = ((m698115 ^ i79) * 1897) ^ 2037129001;
                                                                i81 = 67456431;
                                                            } else {
                                                                m698115 = (i78 - C0630.m2566("ۢۤ")) * (-59);
                                                                i80 = ((m698115 ^ i79) * 18835) ^ 1784902859;
                                                                i81 = -307061157;
                                                            }
                                                        case 1392105531:
                                                        case 1820048790:
                                                            if (C2520.f8000 >= 0) {
                                                                m698115 = C0630.m2566("ܽ۫") ^ i78;
                                                                i80 = ((m698115 ^ i79) * 1897) ^ 2037129001;
                                                                i81 = 67456431;
                                                            } else {
                                                                m698115 = (i79 - C2105.m6981("֫ۧ")) * 53;
                                                                i80 = ((m698115 ^ i78) * (-1257)) ^ 1829287214;
                                                                i81 = -511373559;
                                                            }
                                                        case 1553323143:
                                                        case 1923955401:
                                                            if (C1504.f5354) {
                                                                m698115 = C0630.m2566("ܽܿ") ^ i79;
                                                                i80 = ((m698115 ^ i78) * (-16087)) ^ 1597246021;
                                                                i81 = 1791373735;
                                                            } else {
                                                                m698115 = (C0630.m2566("֡ۧ") + i78) * 75;
                                                                i80 = ((m698115 ^ i79) * (-23497)) ^ (-1875111062);
                                                                i81 = 877624347;
                                                            }
                                                        case 1799697046:
                                                        case 1841488557:
                                                            if (C1916.f6442) {
                                                                m698115 = (C0630.m2566("֫᩻") + i79) * (-45);
                                                                i80 = ((m698115 ^ i78) * (-25531)) ^ 1807431027;
                                                                i81 = 169399076;
                                                            } else {
                                                                m698115 = C0630.m2566("ܽ۫") ^ i78;
                                                                i80 = ((m698115 ^ i79) * 1897) ^ 2037129001;
                                                                i81 = 67456431;
                                                            }
                                                        default:
                                                            if (C11340.f33930 >= 0) {
                                                                m698115 = C0630.m2566("ܽܿ") ^ i79;
                                                                i80 = ((m698115 ^ i78) * (-16087)) ^ 1597246021;
                                                                i81 = 1791373735;
                                                            } else {
                                                                m698115 = (i78 - C2105.m6981("ۛۤ")) * 15;
                                                                i80 = ((m698115 ^ i79) * 12669) ^ (-131072300);
                                                                i81 = 1758310492;
                                                            }
                                                    }
                                                }
                                            }
                                        });
                                        C3683.m11213(c192587);
                                        break;
                                    case -79411607:
                                    case 1503473113:
                                        C2126.m7040();
                                        C1504.m5179();
                                        break;
                                    case 329417990:
                                    case 1161098736:
                                        str28 = C0422.m1958(viewOnClickListenerC20404, i53);
                                        sArr12 = f5610;
                                        i54 = 7;
                                        if (C4263.f13799 > 0) {
                                            m698110 = (C0630.m2566("ܳᩴ") ^ i49) * 13;
                                            i34 = ((m698110 ^ i50) * (-32277)) ^ 970963800;
                                            i35 = -1317065571;
                                            i52 = m698110 ^ i35;
                                            i51 = i34;
                                        }
                                        m698110 = (i50 - C0630.m2566("֨ۡ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                        i34 = ((m698110 ^ i49) * (-20927)) ^ 458358194;
                                        i35 = -1203146579;
                                        i52 = m698110 ^ i35;
                                        i51 = i34;
                                    case 478423808:
                                    case 925058446:
                                        RunnableC1108.m3790();
                                        if (C5695.f17556 < 0) {
                                            m698110 = (i50 - C0630.m2566("֨ۡ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i34 = ((m698110 ^ i49) * (-20927)) ^ 458358194;
                                            i35 = -1203146579;
                                            i52 = m698110 ^ i35;
                                            i51 = i34;
                                        } else {
                                            i47 = i62;
                                            sArr10 = sArr11;
                                            viewOnClickListenerC20403 = viewOnClickListenerC20404;
                                            i44 = i57;
                                            int m69811322222 = (C2105.m6981("۠֫") + i49) * (-57);
                                            i45 = i47;
                                            i52 = m69811322222 ^ (-1411859888);
                                            sArr11 = sArr10;
                                            i51 = ((m69811322222 ^ i50) * (-22803)) ^ 1185122675;
                                            viewOnClickListenerC1585 = this;
                                            int i6622222222 = i45;
                                            i57 = i44;
                                            viewOnClickListenerC20404 = viewOnClickListenerC20403;
                                            i62 = i6622222222;
                                        }
                                    case 1706211431:
                                    case 1959373814:
                                        C0237.m1481();
                                        C1005.m3501();
                                        m698110 = (i50 - C0630.m2566("֨ۡ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                        i34 = ((m698110 ^ i49) * (-20927)) ^ 458358194;
                                        i35 = -1203146579;
                                        i52 = m698110 ^ i35;
                                        i51 = i34;
                                    default:
                                        RunnableC1937.m6387();
                                        if (C7811.f24123 < 0) {
                                            m698110 = (i50 - C0630.m2566("֨ۡ")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                            i34 = ((m698110 ^ i49) * (-20927)) ^ 458358194;
                                            i35 = -1203146579;
                                            i52 = m698110 ^ i35;
                                            i51 = i34;
                                        } else {
                                            s = s2;
                                            sArr8 = sArr14;
                                            i36 = i60;
                                            i37 = i57;
                                            i38 = i62;
                                            viewOnClickListenerC20402 = viewOnClickListenerC20404;
                                            m25666 = C2105.m6981("۬֨") ^ i50;
                                            i39 = ((m25666 ^ i49) * (-2541)) ^ (-1796723517);
                                            i40 = 400243689;
                                            int i6522222 = m25666 ^ i40;
                                            s2 = s;
                                            i60 = i36;
                                            viewOnClickListenerC1585 = this;
                                            short[] sArr1522222 = sArr8;
                                            i52 = i6522222;
                                            i51 = i39;
                                            viewOnClickListenerC20404 = viewOnClickListenerC20402;
                                            i62 = i38;
                                            i57 = i37;
                                            sArr14 = sArr1522222;
                                        }
                                }
                                return;
                            }
                        }
                    });
                    if (RunnableC1108.f4040) {
                        m69812 = (C0630.m2566("ۨܽ") + i19) * (-19);
                        i6 = ((m69812 ^ i18) * (-14749)) ^ (-294052600);
                        i7 = 1207300976;
                        i15 = m69812 ^ i7;
                        sArr4 = sArr2;
                        i25 = i5;
                        str17 = str4;
                        textView9 = textView3;
                        i21 = i15;
                        i20 = i6;
                        i16 = i4;
                        view8 = view2;
                        c192585 = c192582;
                        str16 = str3;
                        String str232222222222222 = str5;
                        textView8 = textView4;
                        str15 = str232222222222222;
                    }
                    m69812 = (i18 - C2105.m6981("ܳ۟")) * (-55);
                    i6 = ((m69812 ^ i19) * 14783) ^ 908765688;
                    i7 = 1140373911;
                    i15 = m69812 ^ i7;
                    sArr4 = sArr2;
                    i25 = i5;
                    str17 = str4;
                    textView9 = textView3;
                    i21 = i15;
                    i20 = i6;
                    i16 = i4;
                    view8 = view2;
                    c192585 = c192582;
                    str16 = str3;
                    String str2322222222222222 = str5;
                    textView8 = textView4;
                    str15 = str2322222222222222;
                case -173805163:
                case 433524137:
                    textView3 = textView9;
                    c192582 = c192585;
                    str3 = str16;
                    i4 = i16;
                    i5 = i25;
                    view2 = view8;
                    str4 = str17;
                    sArr2 = sArr4;
                    TextView textView26 = textView8;
                    str5 = str15;
                    textView4 = textView26;
                    C4616.m13548((TextView) C1005.m3507(view6, C0630.m2566(ServiceConnectionC3453.m10568(f6807, 100, 3, i27)) ^ 2119461875), c4841.m14084());
                    textView10 = (TextView) C1005.m3507(view6, C0630.m2566(C3019.m9250(f6807, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 3, i27)) ^ 2123276483);
                    String str27 = c4841.f15292;
                    if (C0964.f3626 != 0) {
                        str14 = str27;
                        m69812 = (i18 - C2105.m6981("ܳ۟")) * (-55);
                        i6 = ((m69812 ^ i19) * 14783) ^ 908765688;
                        i7 = 1140373911;
                        i15 = m69812 ^ i7;
                        sArr4 = sArr2;
                        i25 = i5;
                        str17 = str4;
                        textView9 = textView3;
                        i21 = i15;
                        i20 = i6;
                        i16 = i4;
                        view8 = view2;
                        c192585 = c192582;
                        str16 = str3;
                        String str23222222222222222 = str5;
                        textView8 = textView4;
                        str15 = str23222222222222222;
                    } else {
                        int m25666 = C0630.m2566("᩹֫") ^ i19;
                        str14 = str27;
                        i20 = ((m25666 ^ i18) * 17845) ^ (-1010103108);
                        sArr4 = sArr2;
                        i25 = i5;
                        str17 = str4;
                        textView9 = textView3;
                        i21 = m25666 ^ 1829283334;
                        i16 = i4;
                        view8 = view2;
                        c192585 = c192582;
                        str16 = str3;
                        String str232222222222222222 = str5;
                        textView8 = textView4;
                        str15 = str232222222222222222;
                    }
                case 283735055:
                case 1932897740:
                    textView3 = textView9;
                    c192582 = c192585;
                    str3 = str16;
                    i4 = i16;
                    i5 = i25;
                    view2 = view8;
                    str4 = str17;
                    sArr2 = sArr4;
                    TextView textView27 = textView8;
                    str5 = str15;
                    textView4 = textView27;
                    short s = f6807[93];
                    if ((s * 11284) - ((s * s) + 31832164) <= 0) {
                        m69812 = C2105.m6981("ܺۚ") ^ i19;
                        i6 = ((m69812 ^ i18) * 10249) ^ (-1882044572);
                        i7 = -1214765139;
                    } else {
                        m69812 = (C2105.m6981("ۡۖ") ^ i18) * 91;
                        i6 = ((m69812 ^ i19) * (-18831)) ^ (-1880420372);
                        i7 = -1158674778;
                    }
                    i15 = m69812 ^ i7;
                    sArr4 = sArr2;
                    i25 = i5;
                    str17 = str4;
                    textView9 = textView3;
                    i21 = i15;
                    i20 = i6;
                    i16 = i4;
                    view8 = view2;
                    c192585 = c192582;
                    str16 = str3;
                    String str2322222222222222222 = str5;
                    textView8 = textView4;
                    str15 = str2322222222222222222;
                case 353046786:
                case 900200438:
                    textView3 = textView9;
                    c192582 = c192585;
                    str3 = str16;
                    i4 = i16;
                    i5 = i25;
                    view2 = view8;
                    str4 = str17;
                    sArr2 = sArr4;
                    TextView textView28 = textView8;
                    str5 = str15;
                    textView4 = textView28;
                    i27 = 57000;
                    m69812 = C0630.m2566("۠ۢ") ^ i18;
                    i6 = ((m69812 ^ i19) * 3547) ^ (-787556037);
                    i7 = 1860082588;
                    i15 = m69812 ^ i7;
                    sArr4 = sArr2;
                    i25 = i5;
                    str17 = str4;
                    textView9 = textView3;
                    i21 = i15;
                    i20 = i6;
                    i16 = i4;
                    view8 = view2;
                    c192585 = c192582;
                    str16 = str3;
                    String str23222222222222222222 = str5;
                    textView8 = textView4;
                    str15 = str23222222222222222222;
                case 377065731:
                case 1484748671:
                    C0382.m1848();
                    C4159.m12565();
                    break;
                case 572305881:
                case 793011253:
                    TextView textView29 = textView9;
                    C19258 c192587 = c192585;
                    int i34 = i16;
                    view8 = C11340.m28028(view6, i22 ^ 2098256898);
                    ViewOnClickListenerC14813.m35215(textView7);
                    i26 = 8;
                    C1128.m3853(C11340.m28028(view6, C2105.m6981(C2167.m7159(f6807, 130, 3, i27)) ^ 2129745999), 8);
                    String str28 = packageInfo.applicationInfo.dataDir;
                    i23 = C0630.m2566(C0483.m2128(f6807, 133, 3, i27));
                    int m698110 = (C2105.m6981("۬ۤ") + i19) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                    textView8 = textView8;
                    str16 = str16;
                    str15 = str28;
                    i20 = ((m698110 ^ i18) * 3185) ^ 1100691513;
                    str17 = str17;
                    i16 = i34;
                    c192585 = c192587;
                    textView2 = textView29;
                    i21 = m698110 ^ (-1194481616);
                    textView9 = textView2;
                case 1960134141:
                case 2104961420:
                    str9 = str17;
                    c192583 = c192585;
                    str10 = str16;
                    view4 = view8;
                    C7811.m20840(textView9, str9);
                    C7811.m20840((TextView) C11340.m28028(view6, C0630.m2566(C2958.m9031(f6807, 171, 3, i27)) ^ 2126820214), C17283.m40576(packageInfo.lastUpdateTime));
                    sArr5 = f6807;
                    m69814 = C2105.m6981("ܳۧ") ^ i18;
                    i10 = ((m69814 ^ i19) * (-16027)) ^ (-77488750);
                    i11 = -333983335;
                    i21 = m69814 ^ i11;
                    view8 = view4;
                    c192585 = c192583;
                    str16 = str10;
                    int i292222 = i10;
                    str17 = str9;
                    i20 = i292222;
                default:
                    if (C0630.f2410 <= 0) {
                        textView5 = textView9;
                        str11 = str17;
                        c192584 = c192585;
                        str6 = str16;
                        view5 = view8;
                        m69815 = (i18 - C0630.m2566("᩹᩷")) * 25;
                        i12 = ((m69815 ^ i19) * 7617) ^ (-1649349221);
                        i13 = 480048492;
                        i14 = m69815 ^ i13;
                        str17 = str11;
                        i20 = i12;
                        textView9 = textView5;
                        c192585 = c192584;
                        i21 = i14;
                        view8 = view5;
                        str16 = str6;
                    } else {
                        c19258 = c192585;
                        str2 = str16;
                        i = i16;
                        view = view8;
                        str = str17;
                        textView = textView8;
                        sArr = sArr6;
                        int m25662222 = (i18 - C0630.m2566("ۙܺ")) * (-31);
                        String str24222 = str2;
                        i20 = ((m25662222 ^ i19) * (-26891)) ^ (-343540612);
                        i21 = m25662222 ^ 415550143;
                        sArr6 = sArr;
                        str17 = str;
                        i16 = i;
                        c192585 = c19258;
                        textView8 = textView;
                        view8 = view;
                        str16 = str24222;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d1, code lost:
    
        if (l.C0964.f3626 != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f4, code lost:
    
        r1 = (r23 - l.C0630.m2566("ܶ᩶")) * com.umeng.commonsdk.statistics.UMErrorCode.E_UM_BE_CREATE_FAILED;
        r14 = ((r1 ^ r22) * (-11531)) ^ (-630359666);
        r25 = 1061044400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f1, code lost:
    
        if (l.C3683.f11629 >= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0074, code lost:
    
        if (l.C1420.f5096 <= 0) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m6687() {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6687():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x00a2, code lost:
    
        if (l.C1047.m3599() < 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00e2, code lost:
    
        if (l.C1916.f6442 != false) goto L21;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m6648(java.util.List r30, l.C13132 r31, java.util.concurrent.atomic.AtomicInteger r32, int r33) {
        /*
            Method dump skipped, instructions count: 1786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6648(java.util.List, l.۬۬ۧ, java.util.concurrent.atomic.AtomicInteger, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x0074, code lost:
    
        if (l.C0382.f1805 == false) goto L23;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6656(l.ViewOnClickListenerC2040 r30, l.C4841 r31, l.ViewOnClickListenerC23185 r32, l.DialogInterfaceC0206 r33, android.view.MenuItem r34) {
        /*
            Method dump skipped, instructions count: 1904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6656(l.֫᩵᩷, l.ۙᩴ᩷, l.᩺ᩴ᩷, l.֡ۚۢ, android.view.MenuItem):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, l.᩵ۚۢ] */
    /* JADX WARN: Type inference failed for: r1v216, types: [l.᩻ۡۡ] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.content.DialogInterface$OnClickListener, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v69 */
    /* JADX WARN: Type inference failed for: r8v72 */
    /* JADX WARN: Type inference failed for: r8v73 */
    /* JADX WARN: Type inference failed for: r8v74 */
    /* JADX WARN: Type inference failed for: r8v76 */
    /* JADX WARN: Type inference failed for: r8v79 */
    /* JADX WARN: Type inference failed for: r8v81 */
    /* JADX WARN: Type inference failed for: r8v83 */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int i;
        Object obj;
        int i2;
        final EditText editText;
        C19258 c19258;
        C19258 c192582;
        int i3;
        View view;
        int i4;
        boolean z;
        EditText editText2;
        C3430 c3430;
        C2978 c2978;
        int i5;
        C19258 c192583;
        short[] sArr;
        int i6;
        int i7;
        int i8;
        C3430 c34302;
        int i9;
        C19258 c192584;
        int i10;
        View view2;
        C2978 c29782;
        C19258 c192585;
        short[] sArr2;
        short[] sArr3;
        int i11;
        short[] sArr4;
        int i12;
        boolean z2;
        int i13;
        int i14;
        int i15;
        EditText editText3;
        C3430 c34303;
        EditText editText4;
        InterfaceC12344 interfaceC12344;
        int i16;
        Object obj2;
        C19258 c192586;
        Object obj3;
        C19258 c192587;
        C19258 c192588;
        int i17;
        int i18;
        int i19;
        int i20;
        C2978 c29783;
        EditText editText5;
        C19258 c192589;
        int i21;
        short[] sArr5;
        int i22;
        int i23;
        short[] sArr6;
        short[] sArr7;
        int i24;
        short[] sArr8;
        int i25;
        boolean z3;
        C3430 c34304;
        int i26;
        int i27;
        InterfaceC12344 interfaceC123442;
        int i28;
        int i29;
        EditText editText6;
        int m2566;
        int i30;
        Object obj4;
        Object obj5;
        int i31;
        int m25662;
        int i32;
        int i33;
        InterfaceC12344 interfaceC123443;
        int m6981;
        int i34;
        EditText editText7;
        C3430 c34305;
        boolean z4;
        int i35;
        short[] sArr9;
        int i36;
        int i37;
        InterfaceC12344 interfaceC123444;
        int m69812;
        int i38;
        int i39;
        Object obj6;
        int i40;
        int i41;
        int i42;
        C2978 c29784;
        EditText editText8;
        C19258 c1925810;
        int i43;
        short[] sArr10;
        int i44;
        int i45;
        short[] sArr11;
        short[] sArr12;
        int i46;
        short[] sArr13;
        int i47;
        boolean z5;
        C3430 c34306;
        int i48;
        int i49;
        int m69813;
        int i50;
        int i51;
        Object obj7;
        Object obj8;
        int i52;
        C2978 c29785;
        C19258 c1925811;
        short[] sArr14;
        int i53;
        int i54;
        short[] sArr15;
        short[] sArr16;
        int i55;
        short[] sArr17;
        int i56;
        boolean z6;
        C3430 c34307;
        int i57;
        int i58;
        int i59;
        int i60;
        int i61;
        Object obj9;
        int i62;
        C2978 c29786;
        EditText editText9;
        EditText editText10;
        C19258 c1925812;
        short[] sArr18;
        int i63;
        int i64;
        short[] sArr19;
        short[] sArr20;
        int i65;
        short[] sArr21;
        int i66;
        boolean z7;
        C19258 c1925813;
        int i67;
        int i68;
        View view3;
        int i69;
        int i70;
        int i71;
        int m25663;
        int i72;
        int i73;
        boolean z8;
        int i74;
        int i75;
        EditText editText11;
        C19258 c1925814;
        short[] sArr22;
        int i76;
        short[] sArr23;
        int i77;
        C19258 c1925815;
        int i78;
        View view4;
        int i79;
        int i80;
        short[] sArr24;
        int i81;
        int i82;
        C2978 c29787;
        ?? r8;
        int i83;
        Object obj10;
        int i84;
        Object obj11;
        Object obj12;
        int m25664;
        int i85;
        int i86;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        final ViewOnClickListenerC2040 viewOnClickListenerC2040 = this;
        int i87 = 467594523;
        int i88 = C3911.f12484;
        int i89 = RunnableC0588.f2309;
        int m25665 = C0630.m2566("᩶ۗ") ^ i89;
        int i90 = ((m25665 ^ i88) * (-26307)) ^ 880621214;
        int i91 = m25665 ^ 1176285348;
        EditText editText12 = null;
        String str = null;
        C19258 c1925816 = null;
        C3430 c34308 = null;
        InterfaceC10798 interfaceC10798 = null;
        String str2 = null;
        short[] sArr25 = null;
        short[] sArr26 = null;
        short[] sArr27 = null;
        short[] sArr28 = null;
        short[] sArr29 = null;
        int i92 = 0;
        boolean z9 = false;
        boolean z10 = false;
        int i93 = 0;
        int i94 = 0;
        int i95 = 0;
        int i96 = 0;
        int i97 = 0;
        int i98 = 0;
        int i99 = 0;
        int i100 = 0;
        int i101 = 0;
        int i102 = 0;
        int i103 = 0;
        int i104 = 0;
        int i105 = 0;
        int i106 = 0;
        View view5 = null;
        EditText editText13 = null;
        C2978 c29788 = null;
        C19258 c1925817 = null;
        int i107 = 0;
        int i108 = 0;
        InterfaceC12344 interfaceC123445 = null;
        final CheckedTextView checkedTextView = null;
        ?? r82 = 0;
        int i109 = 0;
        while (true) {
            i87 = i91 ^ (i90 & (((i87 ^ i88) * 31651) >> 31));
            switch (i87) {
                case -2126002058:
                case -466978337:
                    i84 = i100;
                    viewOnClickListenerC2040.f6834 = i84;
                    int i110 = DialogInterfaceC0206.f1451;
                    c1925816 = new C19258(viewOnClickListenerC2040);
                    C0382.m1849(c1925816, C0630.m2566(C2272.m7507(f6807, 639, 3, i92)) ^ 2102235076);
                    i95 = viewOnClickListenerC2040.f6834;
                    i94 = 0;
                    int m25666 = C0630.m2566("۬ܽ") ^ i88;
                    i100 = i84;
                    i90 = ((m25666 ^ i89) * (-15773)) ^ (-54168247);
                    i91 = m25666 ^ 254210614;
                case -2125965380:
                case -572284648:
                    i = i109;
                    i2 = i107;
                    editText = editText13;
                    C19258 c1925818 = c1925817;
                    short[] sArr30 = sArr29;
                    int i111 = i106;
                    c192582 = c1925816;
                    i3 = i94;
                    view = view5;
                    i4 = i93;
                    C2978 c29789 = c29788;
                    z = z10;
                    editText2 = editText12;
                    c3430 = c34308;
                    c2978 = c29789;
                    RunnableC1937.m6377(editText2, str);
                    editText.setSelection(C1047.m3600(editText));
                    editText2.setSelection(RunnableC1937.m6384(editText2));
                    Object obj20 = r82;
                    C4263.m12814(c2978, C0964.m3400(ApplicationC20075.f65008, RunnableC1108.m3789(f6807, 624, 5, i92), z9));
                    sArr28 = f6807;
                    i104 = 629;
                    i105 = 3;
                    if (C3911.f12484 >= 0) {
                        i106 = i111;
                        sArr29 = sArr30;
                        c19258 = c1925818;
                        obj = obj20;
                        int m25667 = C0630.m2566("ۢ᩸") ^ i89;
                        i16 = ((m25667 ^ i88) * 23695) ^ 718928716;
                        i91 = m25667 ^ (-2014751006);
                        i93 = i4;
                        i94 = i3;
                        i107 = i2;
                        c192586 = c19258;
                        obj2 = obj;
                        obj3 = obj2;
                        c192587 = c192586;
                        view5 = view;
                        c1925817 = c192587;
                        c1925816 = c192582;
                        editText13 = editText;
                        i90 = i16;
                        i109 = i;
                        c34303 = c3430;
                        editText12 = editText2;
                        z10 = z;
                        c29788 = c2978;
                        r82 = obj3;
                        c34308 = c34303;
                    } else {
                        int m25668 = (C0630.m2566("ۤܽ") ^ i89) * 79;
                        i16 = ((m25668 ^ i88) * (-5847)) ^ (-1347867709);
                        i91 = m25668 ^ 129905180;
                        i106 = i111;
                        i93 = i4;
                        i94 = i3;
                        i107 = i2;
                        sArr29 = sArr30;
                        c192586 = c1925818;
                        obj2 = obj20;
                        obj3 = obj2;
                        c192587 = c192586;
                        view5 = view;
                        c1925817 = c192587;
                        c1925816 = c192582;
                        editText13 = editText;
                        i90 = i16;
                        i109 = i;
                        c34303 = c3430;
                        editText12 = editText2;
                        z10 = z;
                        c29788 = c2978;
                        r82 = obj3;
                        c34308 = c34303;
                    }
                case -2084453514:
                case -1616186654:
                    i = i109;
                    i3 = i94;
                    i2 = i107;
                    editText = editText13;
                    int i112 = i104;
                    int i113 = i105;
                    c192582 = c1925816;
                    view = view5;
                    i4 = i93;
                    short[] sArr31 = sArr28;
                    C2978 c297810 = c29788;
                    z = z10;
                    editText2 = editText12;
                    c3430 = c34308;
                    c2978 = c297810;
                    C4159.m12564(C1005.m3507(view, C2105.m6981(C1128.m3841(sArr31, i112, i113, i92)) ^ 2125991757), new View.OnClickListener(viewOnClickListenerC2040) { // from class: l.۟ۖ᩷

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ ViewOnClickListenerC2040 f22022;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            ViewOnClickListenerC2040 viewOnClickListenerC20402 = null;
                            int i114 = 559971064;
                            int i115 = C3019.f9544;
                            int i116 = C3537.f11231;
                            int m25669 = C0630.m2566("᩻ܿ") ^ i116;
                            int i117 = ((m25669 ^ i115) * (-18517)) ^ (-1073446231);
                            int i118 = 334410251;
                            while (true) {
                                i114 = ((((i114 ^ i115) * 14283) >> 31) & i117) ^ (m25669 ^ i118);
                                switch (i114) {
                                    case -2033453797:
                                    case -422816647:
                                        if (C1504.f5354) {
                                            m25669 = (C0630.m2566("ᩴۛ") + i116) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i117 = ((m25669 ^ i115) * 7231) ^ (-1412309016);
                                            i118 = -2035612349;
                                        } else {
                                            m25669 = C0630.m2566("ᩴۧ") ^ i115;
                                            i117 = ((m25669 ^ i116) * (-29255)) ^ (-861870890);
                                            i118 = -112811988;
                                        }
                                    case -1936898918:
                                    case 981373357:
                                        C3663.m11168();
                                        if (C0237.f1507 == 0) {
                                            m25669 = (C0630.m2566("᩹۟") + i116) * 33;
                                            i117 = ((m25669 ^ i115) * 32717) ^ (-960302367);
                                            i118 = 500956841;
                                        } else {
                                            m25669 = (C0630.m2566("ᩴۛ") + i116) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i117 = ((m25669 ^ i115) * 7231) ^ (-1412309016);
                                            i118 = -2035612349;
                                        }
                                    case -1448687529:
                                    case -780653332:
                                        if (C4159.m12565() >= 0) {
                                            m25669 = (C0630.m2566("ᩴۛ") + i116) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i117 = ((m25669 ^ i115) * 7231) ^ (-1412309016);
                                            i118 = -2035612349;
                                        } else {
                                            m25669 = C0630.m2566("ۖۤ") ^ i116;
                                            i117 = ((m25669 ^ i115) * 4763) ^ 1129857310;
                                            i118 = -471692242;
                                        }
                                    case -1248992739:
                                    case 302861396:
                                        viewOnClickListenerC20402 = this.f22022;
                                        if (C0714.f2697 >= 0) {
                                            m25669 = C2105.m6981("ۤܺ") ^ i115;
                                            i117 = ((m25669 ^ i116) * (-21839)) ^ 1269684487;
                                            i118 = 728939958;
                                        } else {
                                            m25669 = (C2105.m6981("ܶܰ") ^ i115) * (-41);
                                            i117 = ((m25669 ^ i116) * (-28957)) ^ 1829157728;
                                            i118 = -783893646;
                                        }
                                    case -1111881237:
                                    case 1995022548:
                                        C4075.m12263();
                                        C1916.m6308();
                                        break;
                                    case -1034648987:
                                    case 1019670086:
                                        if (C0630.f2410 <= 0) {
                                            m25669 = C0630.m2566("᩵ܳ") ^ i115;
                                            i117 = ((m25669 ^ i116) * (-30559)) ^ 11240539;
                                            i118 = -1689578886;
                                        } else {
                                            m25669 = (C2105.m6981("ܰ֫") ^ i115) * 57;
                                            i117 = ((m25669 ^ i116) * (-7301)) ^ (-1034155427);
                                            i118 = -2056176473;
                                        }
                                    case -959190896:
                                    case -743065029:
                                        C0964.m3413();
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            m25669 = (C0630.m2566("᩹۟") + i116) * 33;
                                            i117 = ((m25669 ^ i115) * 32717) ^ (-960302367);
                                            i118 = 500956841;
                                        } else {
                                            m25669 = C0630.m2566("ۛܿ") ^ i115;
                                            i117 = ((m25669 ^ i116) * (-949)) ^ (-1889901603);
                                            i118 = 1630279342;
                                        }
                                    case -546112283:
                                    case 313551330:
                                        C1420.m4913();
                                        if (C2126.m7040()) {
                                            m25669 = (C0630.m2566("᩹۟") + i116) * 33;
                                            i117 = ((m25669 ^ i115) * 32717) ^ (-960302367);
                                            i118 = 500956841;
                                        } else {
                                            m25669 = C0630.m2566("᩵ܳ") ^ i115;
                                            i117 = ((m25669 ^ i116) * (-30559)) ^ 11240539;
                                            i118 = -1689578886;
                                        }
                                    case -17175062:
                                    case 1837129556:
                                        if (C3663.f11553) {
                                            m25669 = C0630.m2566("ۛܿ") ^ i115;
                                            i117 = ((m25669 ^ i116) * (-949)) ^ (-1889901603);
                                            i118 = 1630279342;
                                        } else {
                                            m25669 = (C2105.m6981("֡ᩴ") ^ i116) * 33;
                                            i117 = ((m25669 ^ i115) * 14703) ^ 2032460197;
                                            i118 = -297922656;
                                        }
                                    case 315746773:
                                    case 1316624105:
                                        if (C2126.f7087) {
                                            m25669 = C0630.m2566("᩵ܳ") ^ i115;
                                            i117 = ((m25669 ^ i116) * (-30559)) ^ 11240539;
                                            i118 = -1689578886;
                                        } else {
                                            m25669 = (i115 - C0630.m2566("ۜۛ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                                            i117 = ((m25669 ^ i116) * 12843) ^ (-1903117799);
                                            i118 = 1366783243;
                                        }
                                    case 350491439:
                                    case 559646520:
                                        if (C21923.f70183 != 0) {
                                            m25669 = (C0630.m2566("ᩴۛ") + i116) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i117 = ((m25669 ^ i115) * 7231) ^ (-1412309016);
                                            i118 = -2035612349;
                                        } else {
                                            m25669 = (i116 - C0630.m2566("ۗۧ")) * (-29);
                                            i117 = ((m25669 ^ i115) * 18605) ^ 2719873;
                                            i118 = 1436984365;
                                        }
                                    case 543397460:
                                    case 787130352:
                                        ViewOnClickListenerC2040.m6652(viewOnClickListenerC20402, editText);
                                        break;
                                    case 663812434:
                                    case 954432122:
                                        if (C3537.m10746() <= 0) {
                                            m25669 = (C0630.m2566("ᩴۛ") + i116) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                                            i117 = ((m25669 ^ i115) * 7231) ^ (-1412309016);
                                            i118 = -2035612349;
                                        } else {
                                            m25669 = C2105.m6981("ᩳܰ") ^ i115;
                                            i117 = ((m25669 ^ i116) * (-26843)) ^ 906947480;
                                            i118 = 1141144250;
                                        }
                                    case 844847786:
                                    case 1752492168:
                                        if (C0237.f1507 != 0) {
                                            m25669 = C2105.m6981("ۤܺ") ^ i115;
                                            i117 = ((m25669 ^ i116) * (-21839)) ^ 1269684487;
                                            i118 = 728939958;
                                        } else {
                                            m25669 = (i116 - C2105.m6981("ۢᩴ")) * (-113);
                                            i117 = ((m25669 ^ i115) * 14623) ^ 657432129;
                                            i118 = -667513579;
                                        }
                                    case 1803865315:
                                    case 1825958532:
                                        if (C2167.f7158 >= 0) {
                                            m25669 = C0630.m2566("᩵ܳ") ^ i115;
                                            i117 = ((m25669 ^ i116) * (-30559)) ^ 11240539;
                                            i118 = -1689578886;
                                        } else {
                                            m25669 = C2105.m6981("᩻᩷") ^ i116;
                                            i117 = ((m25669 ^ i115) * (-5931)) ^ 884063842;
                                            i118 = -1016354109;
                                        }
                                    default:
                                        C1504.m5179();
                                        m25669 = C0630.m2566("᩵ܳ") ^ i115;
                                        i117 = ((m25669 ^ i116) * (-30559)) ^ 11240539;
                                        i118 = -1689578886;
                                }
                                return;
                            }
                        }

                        {
                            int i114 = -1286734153;
                            int i115 = C3746.f11829;
                            int i116 = C5695.f17556;
                            int m69814 = (C2105.m6981("ܿ᩷") + i115) * (-45);
                            int i117 = ((m69814 ^ i116) * 13807) ^ 994408536;
                            int i118 = -807137291;
                            while (true) {
                                i114 = ((((i114 ^ i116) * (-5399)) >> 31) & i117) ^ (m69814 ^ i118);
                                switch (i114) {
                                    case -2009746347:
                                    case -1546471374:
                                        C1005.m3501();
                                        if (C0382.f1805) {
                                            m69814 = (C0630.m2566("ۢ۫") ^ i116) * 27;
                                            i117 = ((m69814 ^ i115) * (-27179)) ^ 1199802214;
                                            i118 = -1031047675;
                                        } else {
                                            m69814 = (C0630.m2566("᩸᩵") ^ i115) * 97;
                                            i117 = ((m69814 ^ i116) * 13535) ^ 363049581;
                                            i118 = 1652175377;
                                        }
                                    case -1696170743:
                                    case 1035456181:
                                        if (C0237.f1507 != 0) {
                                            m69814 = (C0630.m2566("ۢ۫") ^ i116) * 27;
                                            i117 = ((m69814 ^ i115) * (-27179)) ^ 1199802214;
                                            i118 = -1031047675;
                                        } else {
                                            m69814 = C2105.m6981("ܿ᩺") ^ i116;
                                            i117 = ((m69814 ^ i115) * (-6661)) ^ (-1500769508);
                                            i118 = 1412230019;
                                        }
                                    case -1625568767:
                                    case -322816174:
                                        if (C0483.f2088 >= 0) {
                                            m69814 = (C0630.m2566("۫֡") ^ i116) * (-111);
                                            i117 = ((m69814 ^ i115) * 3123) ^ (-393854149);
                                            i118 = -2023020573;
                                        } else {
                                            m69814 = C2105.m6981("ۛ᩵") ^ i115;
                                            i117 = ((m69814 ^ i116) * 5001) ^ 167021003;
                                            i118 = 1309890586;
                                        }
                                    case -1446584270:
                                    case 1361997164:
                                        C4117.m12364();
                                        m69814 = (C0630.m2566("ۢ۫") ^ i116) * 27;
                                        i117 = ((m69814 ^ i115) * (-27179)) ^ 1199802214;
                                        i118 = -1031047675;
                                    case -1214037178:
                                    case 684391941:
                                        if (C4616.f14690 <= 0) {
                                            m69814 = C2105.m6981("۟ܳ") ^ i115;
                                            i117 = ((m69814 ^ i116) * (-18179)) ^ (-792054480);
                                            i118 = -820022045;
                                        } else {
                                            m69814 = (C2105.m6981("֫۬") + i116) * 43;
                                            i117 = ((m69814 ^ i115) * 24587) ^ (-53797298);
                                            i118 = -1572389456;
                                        }
                                    case -1189400369:
                                    case 381735008:
                                        RunnableC1108.m3790();
                                        if (C3019.f9544 >= 0) {
                                            m69814 = (C0630.m2566("ۢ۫") ^ i116) * 27;
                                            i117 = ((m69814 ^ i115) * (-27179)) ^ 1199802214;
                                            i118 = -1031047675;
                                        } else {
                                            m69814 = C2105.m6981("۟ܳ") ^ i115;
                                            i117 = ((m69814 ^ i116) * (-18179)) ^ (-792054480);
                                            i118 = -820022045;
                                        }
                                    case -965942993:
                                    case -148122510:
                                        C7811.m20844();
                                        C1420.m4913();
                                        throw new RuntimeException();
                                    case -674935783:
                                    case 2049320472:
                                        if (RunnableC1937.f6483 >= 0) {
                                            m69814 = (C0630.m2566("᩸᩵") ^ i115) * 97;
                                            i117 = ((m69814 ^ i116) * 13535) ^ 363049581;
                                            i118 = 1652175377;
                                        } else {
                                            m69814 = (C2105.m6981("֫ۤ") + i116) * 67;
                                            i117 = ((m69814 ^ i115) * (-24459)) ^ (-1396462763);
                                            i118 = 1753124450;
                                        }
                                    case -102624693:
                                    case -63673486:
                                        if (C3683.f11629 >= 0) {
                                            m69814 = C2105.m6981("۟ܳ") ^ i115;
                                            i117 = ((m69814 ^ i116) * (-18179)) ^ (-792054480);
                                            i118 = -820022045;
                                        } else {
                                            m69814 = (C0630.m2566("۬ۧ") ^ i115) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i117 = ((m69814 ^ i116) * 9209) ^ 588012762;
                                            i118 = -1320416729;
                                        }
                                    case -98335266:
                                    case 2112081586:
                                        if (C3245.m9925() != 0) {
                                            m69814 = C2105.m6981("ܿ᩺") ^ i116;
                                            i117 = ((m69814 ^ i115) * (-6661)) ^ (-1500769508);
                                            i118 = 1412230019;
                                        } else {
                                            m69814 = (i115 - C0630.m2566("ۘ᩶")) * (-47);
                                            i117 = ((m69814 ^ i116) * 26957) ^ 1356286913;
                                            i118 = 1065116125;
                                        }
                                    case 139091511:
                                    case 1868526939:
                                        if (C3911.f12484 >= 0) {
                                            m69814 = C2105.m6981("۟ܳ") ^ i115;
                                            i117 = ((m69814 ^ i116) * (-18179)) ^ (-792054480);
                                            i118 = -820022045;
                                        } else {
                                            m69814 = (C2105.m6981("ۗۡ") + i116) * 11;
                                            i117 = ((m69814 ^ i115) * (-22549)) ^ 597594217;
                                            i118 = -576324455;
                                        }
                                    case 411606298:
                                    case 608568178:
                                        this.f22022 = viewOnClickListenerC2040;
                                        if (C0964.f3626 != 0) {
                                            m69814 = C2105.m6981("ܿ᩺") ^ i116;
                                            i117 = ((m69814 ^ i115) * (-6661)) ^ (-1500769508);
                                            i118 = 1412230019;
                                        } else {
                                            m69814 = C0630.m2566("ۧ۠") ^ i115;
                                            i117 = ((m69814 ^ i116) * 24293) ^ (-1244428581);
                                            i118 = 1855179275;
                                        }
                                    case 557518122:
                                    case 970517195:
                                        if (RunnableC1937.m6387() != 0) {
                                            m69814 = C2105.m6981("ܿ᩺") ^ i116;
                                            i117 = ((m69814 ^ i115) * (-6661)) ^ (-1500769508);
                                            i118 = 1412230019;
                                        } else {
                                            m69814 = (C2105.m6981("ܺۜ") ^ i116) * 97;
                                            i117 = ((m69814 ^ i115) * 19409) ^ 609189262;
                                            i118 = -1866414044;
                                        }
                                    case 613856877:
                                    case 1277860926:
                                        return;
                                    case 1275998799:
                                    case 1927447217:
                                        if (C0630.m2564()) {
                                            m69814 = (C0630.m2566("۫֡") ^ i116) * (-111);
                                            i117 = ((m69814 ^ i115) * 3123) ^ (-393854149);
                                            i118 = -2023020573;
                                        } else {
                                            m69814 = C2105.m6981("᩸᩻") ^ i115;
                                            i117 = ((m69814 ^ i116) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION) ^ (-155886884);
                                            i118 = -1623714387;
                                        }
                                    default:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            m69814 = (C0630.m2566("۫֡") ^ i116) * (-111);
                                            i117 = ((m69814 ^ i115) * 3123) ^ (-393854149);
                                            i118 = -2023020573;
                                        } else {
                                            m69814 = C2105.m6981("ۚ۠") ^ i116;
                                            i117 = ((m69814 ^ i115) * (-13279)) ^ (-443840473);
                                            i118 = -1591908561;
                                        }
                                }
                            }
                        }
                    });
                    viewOnClickListenerC2040.f6832 = editText;
                    int i114 = DialogInterfaceC0206.f1451;
                    C19258 c1925819 = new C19258(viewOnClickListenerC2040);
                    sArr29 = f6807;
                    i106 = 632;
                    if (C2105.m6982() != 0) {
                        sArr28 = sArr31;
                        i104 = i112;
                        obj = r82;
                        i105 = i113;
                        c19258 = c1925819;
                        int m256672 = C0630.m2566("ۢ᩸") ^ i89;
                        i16 = ((m256672 ^ i88) * 23695) ^ 718928716;
                        i91 = m256672 ^ (-2014751006);
                        i93 = i4;
                        i94 = i3;
                        i107 = i2;
                        c192586 = c19258;
                        obj2 = obj;
                        obj3 = obj2;
                        c192587 = c192586;
                        view5 = view;
                        c1925817 = c192587;
                        c1925816 = c192582;
                        editText13 = editText;
                        i90 = i16;
                        i109 = i;
                        c34303 = c3430;
                        editText12 = editText2;
                        z10 = z;
                        c29788 = c2978;
                        r82 = obj3;
                        c34308 = c34303;
                    } else {
                        int m25669 = (C0630.m2566("ܿ᩶") + i88) * 71;
                        i91 = m25669 ^ 892156908;
                        i104 = i112;
                        i105 = i113;
                        i94 = i3;
                        i109 = i;
                        sArr28 = sArr31;
                        c1925817 = c1925819;
                        i107 = i2;
                        editText13 = editText;
                        i90 = ((m25669 ^ i89) * 15523) ^ (-94699764);
                        i93 = i4;
                        view5 = view;
                        c1925816 = c192582;
                        editText12 = editText2;
                        z10 = z;
                        c29788 = c2978;
                        c34308 = c3430;
                    }
                case -2032235645:
                case 504514203:
                    if (RunnableC1108.f4040) {
                        i41 = i109;
                        obj19 = r82;
                        i42 = i107;
                        c29784 = c29788;
                        editText8 = editText12;
                        c1925810 = c1925817;
                        i43 = i101;
                        sArr10 = sArr26;
                        i44 = i102;
                        i45 = i103;
                        sArr11 = sArr27;
                        sArr12 = sArr28;
                        i46 = i104;
                        sArr13 = sArr29;
                        i47 = i106;
                        z5 = z10;
                        c34306 = c34308;
                        i48 = i94;
                        i49 = i105;
                        View view6 = view5;
                        i13 = i93;
                        i29 = i98;
                        editText6 = editText13;
                        c192584 = c1925816;
                        view2 = view6;
                        m69813 = C2105.m6981("ۘۨ") ^ i89;
                        i50 = ((m69813 ^ i88) * 12151) ^ (-358975198);
                        i51 = -1253048189;
                        obj18 = obj19;
                        int i115 = m69813 ^ i51;
                        i101 = i43;
                        i105 = i49;
                        i106 = i47;
                        c34308 = c34306;
                        i94 = i48;
                        i107 = i42;
                        i109 = i41;
                        sArr29 = sArr13;
                        sArr28 = sArr12;
                        r82 = obj18;
                        editText12 = editText8;
                        sArr27 = sArr11;
                        i104 = i46;
                        sArr26 = sArr10;
                        i102 = i44;
                        i103 = i45;
                        i91 = i115;
                        i90 = i50;
                        c1925817 = c1925810;
                        z10 = z5;
                        c29788 = c29784;
                        EditText editText14 = editText6;
                        i98 = i29;
                        i93 = i13;
                        view5 = view2;
                        c1925816 = c192584;
                        editText13 = editText14;
                    } else {
                        m25664 = C2105.m6981("ۙ᩻") ^ i88;
                        i85 = ((m25664 ^ i89) * 13141) ^ 511399964;
                        i86 = -1723300720;
                        i91 = m25664 ^ i86;
                        i90 = i85;
                    }
                case -1979597315:
                case -1059440570:
                    if (C1420.m4913()) {
                        m25664 = C2105.m6981("ܰۛ") ^ i88;
                        i85 = ((m25664 ^ i89) * (-5943)) ^ 2096797228;
                        i86 = -114834844;
                        i91 = m25664 ^ i86;
                        i90 = i85;
                    } else {
                        i41 = i109;
                        obj19 = r82;
                        i42 = i107;
                        c29784 = c29788;
                        editText8 = editText12;
                        c1925810 = c1925817;
                        i43 = i101;
                        sArr10 = sArr26;
                        i44 = i102;
                        i45 = i103;
                        sArr11 = sArr27;
                        sArr12 = sArr28;
                        i46 = i104;
                        sArr13 = sArr29;
                        i47 = i106;
                        z5 = z10;
                        c34306 = c34308;
                        i48 = i94;
                        i49 = i105;
                        View view62 = view5;
                        i13 = i93;
                        i29 = i98;
                        editText6 = editText13;
                        c192584 = c1925816;
                        view2 = view62;
                        m69813 = C2105.m6981("ۘۨ") ^ i89;
                        i50 = ((m69813 ^ i88) * 12151) ^ (-358975198);
                        i51 = -1253048189;
                        obj18 = obj19;
                        int i1152 = m69813 ^ i51;
                        i101 = i43;
                        i105 = i49;
                        i106 = i47;
                        c34308 = c34306;
                        i94 = i48;
                        i107 = i42;
                        i109 = i41;
                        sArr29 = sArr13;
                        sArr28 = sArr12;
                        r82 = obj18;
                        editText12 = editText8;
                        sArr27 = sArr11;
                        i104 = i46;
                        sArr26 = sArr10;
                        i102 = i44;
                        i103 = i45;
                        i91 = i1152;
                        i90 = i50;
                        c1925817 = c1925810;
                        z10 = z5;
                        c29788 = c29784;
                        EditText editText142 = editText6;
                        i98 = i29;
                        i93 = i13;
                        view5 = view2;
                        c1925816 = c192584;
                        editText13 = editText142;
                    }
                case -1920230281:
                case -456356781:
                    i19 = i109;
                    Object obj21 = r82;
                    i20 = i107;
                    c29783 = c29788;
                    editText5 = editText12;
                    c192589 = c1925817;
                    i21 = i101;
                    sArr5 = sArr26;
                    i22 = i102;
                    i23 = i103;
                    sArr6 = sArr27;
                    sArr7 = sArr28;
                    i24 = i104;
                    sArr8 = sArr29;
                    i25 = i106;
                    z3 = z10;
                    c34304 = c34308;
                    i26 = i94;
                    interfaceC123443 = interfaceC123445;
                    i28 = i105;
                    View view7 = view5;
                    i13 = i93;
                    i29 = i98;
                    editText6 = editText13;
                    c192584 = c1925816;
                    view2 = view7;
                    i97 = C0630.m2566(C2272.m7507(f6807, 514, 3, i92)) ^ 2128675646;
                    str2 = C5695.m16034(f6807, 517, 3, i92);
                    obj15 = obj21;
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        m6981 = (C2105.m6981("ܰ֡") ^ i88) * (-65);
                        i90 = ((m6981 ^ i89) * 551) ^ (-2006153140);
                        i34 = -272824132;
                        obj14 = obj21;
                        i31 = m6981 ^ i34;
                        interfaceC123445 = interfaceC123443;
                        obj13 = obj14;
                        i101 = i21;
                        i105 = i28;
                        i106 = i25;
                        z10 = z3;
                        c34308 = c34304;
                        i94 = i26;
                        i107 = i20;
                        i109 = i19;
                        sArr29 = sArr8;
                        sArr28 = sArr7;
                        r82 = obj13;
                        c29788 = c29783;
                        editText12 = editText5;
                        sArr27 = sArr6;
                        i104 = i24;
                        sArr26 = sArr5;
                        i102 = i22;
                        i103 = i23;
                        i91 = i31;
                        c1925817 = c192589;
                        viewOnClickListenerC2040 = this;
                        EditText editText1422 = editText6;
                        i98 = i29;
                        i93 = i13;
                        view5 = view2;
                        c1925816 = c192584;
                        editText13 = editText1422;
                    }
                    m6981 = C2105.m6981("ܰܰ") ^ i89;
                    i90 = ((m6981 ^ i88) * (-17577)) ^ (-930894083);
                    i34 = -719417923;
                    obj14 = obj15;
                    i31 = m6981 ^ i34;
                    interfaceC123445 = interfaceC123443;
                    obj13 = obj14;
                    i101 = i21;
                    i105 = i28;
                    i106 = i25;
                    z10 = z3;
                    c34308 = c34304;
                    i94 = i26;
                    i107 = i20;
                    i109 = i19;
                    sArr29 = sArr8;
                    sArr28 = sArr7;
                    r82 = obj13;
                    c29788 = c29783;
                    editText12 = editText5;
                    sArr27 = sArr6;
                    i104 = i24;
                    sArr26 = sArr5;
                    i102 = i22;
                    i103 = i23;
                    i91 = i31;
                    c1925817 = c192589;
                    viewOnClickListenerC2040 = this;
                    EditText editText14222 = editText6;
                    i98 = i29;
                    i93 = i13;
                    view5 = view2;
                    c1925816 = c192584;
                    editText13 = editText14222;
                case -1885950944:
                case -1467060567:
                    int i116 = i107;
                    int i117 = i98;
                    C2978 c297811 = c29788;
                    editText7 = editText12;
                    EditText editText15 = editText13;
                    C19258 c1925820 = c1925817;
                    int i118 = i101;
                    short[] sArr32 = sArr26;
                    int i119 = i102;
                    int i120 = i103;
                    short[] sArr33 = sArr27;
                    short[] sArr34 = sArr28;
                    int i121 = i104;
                    short[] sArr35 = sArr29;
                    int i122 = i106;
                    boolean z11 = z10;
                    c34305 = c34308;
                    C19258 c1925821 = c1925816;
                    int i123 = i94;
                    InterfaceC12344 interfaceC123446 = interfaceC123445;
                    View view8 = view5;
                    int i124 = i105;
                    int m256610 = C0630.m2566(str2) ^ 2124717800;
                    i109 = C2105.m6981(C2126.m7036(f6807, 520, 3, i92)) ^ 2127594980;
                    int i125 = i97;
                    if (i117 == i125) {
                        int m69814 = (C2105.m6981("ܰܽ") ^ i88) * (-117);
                        int i126 = ((m69814 ^ i89) * (-23487)) ^ 755791666;
                        interfaceC123445 = interfaceC123446;
                        i101 = i118;
                        view5 = view8;
                        i105 = i124;
                        i106 = i122;
                        z10 = z11;
                        c1925816 = c1925821;
                        i94 = i123;
                        i107 = i116;
                        sArr29 = sArr35;
                        sArr28 = sArr34;
                        c29788 = c297811;
                        sArr27 = sArr33;
                        i104 = i121;
                        sArr26 = sArr32;
                        i102 = i119;
                        i103 = i120;
                        r82 = 0;
                        c1925817 = c1925820;
                        i91 = m69814 ^ (-1591412956);
                        editText13 = editText15;
                        i97 = i125;
                        i98 = i117;
                        c34308 = c34305;
                        editText12 = editText7;
                        i93 = m256610;
                        i90 = i126;
                        viewOnClickListenerC2040 = this;
                    } else {
                        int m256611 = (i89 - C0630.m2566("۟ܰ")) * 35;
                        i90 = ((m256611 ^ i88) * (-11817)) ^ 1147476657;
                        interfaceC123445 = interfaceC123446;
                        i101 = i118;
                        view5 = view8;
                        i105 = i124;
                        i106 = i122;
                        z10 = z11;
                        c1925816 = c1925821;
                        i94 = i123;
                        i107 = i116;
                        sArr29 = sArr35;
                        sArr28 = sArr34;
                        c29788 = c297811;
                        sArr27 = sArr33;
                        i104 = i121;
                        sArr26 = sArr32;
                        i102 = i119;
                        i103 = i120;
                        z4 = false;
                        i91 = m256611 ^ (-1122641823);
                        c1925817 = c1925820;
                        editText13 = editText15;
                        viewOnClickListenerC2040 = this;
                        i98 = i117;
                        i93 = m256610;
                        i97 = i125;
                        c34308 = c34305;
                        r82 = z4;
                        editText12 = editText7;
                    }
                case -1715988866:
                case -1576451301:
                    i94++;
                    i84 = i100;
                    int m256662 = C0630.m2566("۬ܽ") ^ i88;
                    i100 = i84;
                    i90 = ((m256662 ^ i89) * (-15773)) ^ (-54168247);
                    i91 = m256662 ^ 254210614;
                case -1706537174:
                case -615096508:
                    interfaceC10798 = c34308.f10837.f65733.listIterator(z9 ? 1 : 0);
                    m25664 = C2105.m6981("ۙᩳ") ^ i89;
                    i85 = ((m25664 ^ i88) * (-30685)) ^ (-74505584);
                    i86 = -1930607541;
                    i91 = m25664 ^ i86;
                    i90 = i85;
                case -1684279816:
                case -1323352910:
                    i52 = i109;
                    Object obj22 = r82;
                    c29785 = c29788;
                    editText4 = editText12;
                    EditText editText16 = editText13;
                    c1925811 = c1925817;
                    sArr14 = sArr26;
                    i53 = i102;
                    i54 = i103;
                    sArr15 = sArr27;
                    sArr16 = sArr28;
                    i55 = i104;
                    sArr17 = sArr29;
                    i56 = i106;
                    z6 = z10;
                    c34307 = c34308;
                    c192584 = c1925816;
                    i57 = i94;
                    view2 = view5;
                    i58 = i105;
                    i13 = i93;
                    i29 = i98;
                    i59 = i101;
                    C2105.m6978(checkedTextView, C2105.m6981(C2105.m6988(sArr25, i59, 3, i92)) ^ 2104680262);
                    C19890.m45741(checkedTextView);
                    C2126.m7039(checkedTextView, new View.OnClickListener() { // from class: l.ۙۘ᩷
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view9) {
                            CheckedTextView checkedTextView2 = null;
                            boolean z12 = false;
                            boolean z13 = false;
                            int i127 = -1291954430;
                            int i128 = C4117.f13076;
                            int i129 = C0483.f2088;
                            int m256612 = (C0630.m2566("ᩳܽ") ^ i129) * (-69);
                            int i130 = ((m256612 ^ i128) * 24899) ^ 1416736451;
                            int i131 = -1528604254;
                            while (true) {
                                i127 = ((((i127 ^ i128) * 10061) >> 31) & i130) ^ (m256612 ^ i131);
                                switch (i127) {
                                    case -2145173528:
                                    case -251329966:
                                        int i132 = ViewOnClickListenerC2040.f6808;
                                        if (RunnableC3474.f10992 <= 0) {
                                            m256612 = (C0630.m2566("ۢ᩻") ^ i129) * (-65);
                                            i130 = ((m256612 ^ i128) * 29433) ^ 1326776849;
                                            i131 = -461800401;
                                        } else {
                                            m256612 = (i129 - C0630.m2566("ܽ۟")) * 53;
                                            i130 = ((m256612 ^ i128) * 25317) ^ (-89967902);
                                            i131 = -276129911;
                                        }
                                    case -2124650106:
                                    case -1717028877:
                                        if (C11340.f33930 >= 0) {
                                            m256612 = C0630.m2566("ۛۜ") ^ i128;
                                            i130 = ((m256612 ^ i129) * 29605) ^ (-540981425);
                                            i131 = 298473797;
                                        } else {
                                            m256612 = (C2105.m6981("᩷֨") ^ i128) * 75;
                                            i130 = ((m256612 ^ i129) * 19501) ^ 1271256690;
                                            i131 = 990098334;
                                        }
                                    case -2087950140:
                                    case -576030084:
                                        checkedTextView2 = checkedTextView;
                                        if (RunnableC0588.m2441() >= 0) {
                                            m256612 = C0630.m2566("ۛۜ") ^ i128;
                                            i130 = ((m256612 ^ i129) * 29605) ^ (-540981425);
                                            i131 = 298473797;
                                        } else {
                                            m256612 = C0630.m2566("۬ۘ") ^ i129;
                                            i130 = ((m256612 ^ i128) * 23749) ^ 370025057;
                                            i131 = -629561018;
                                        }
                                    case -1961549410:
                                    case 574940776:
                                        C1504.m5179();
                                        C1047.m3599();
                                        m256612 = (C0630.m2566("ۢ᩻") ^ i129) * (-65);
                                        i130 = ((m256612 ^ i128) * 29433) ^ 1326776849;
                                        i131 = -461800401;
                                    case -1855313386:
                                    case 1936795157:
                                        if (C0714.f2697 >= 0) {
                                            m256612 = (C2105.m6981("ܺ᩺") ^ i128) * 47;
                                            i130 = ((m256612 ^ i129) * (-32157)) ^ (-1603378326);
                                            i131 = 640721390;
                                        } else {
                                            m256612 = (C0630.m2566("ۚܰ") + i129) * (-29);
                                            i130 = ((m256612 ^ i128) * 5687) ^ 455699206;
                                            i131 = -1402923304;
                                        }
                                    case -1806921931:
                                    case 1191385219:
                                        if (C2520.f8000 < 0) {
                                            m256612 = (C0630.m2566("ۢ᩻") ^ i129) * (-65);
                                            i130 = ((m256612 ^ i128) * 29433) ^ 1326776849;
                                            i131 = -461800401;
                                        } else {
                                            m256612 = (C2105.m6981("᩺ۡ") ^ i129) * (-101);
                                            i130 = ((m256612 ^ i128) * (-30847)) ^ (-1736787188);
                                            i131 = -903120431;
                                        }
                                    case -1711739643:
                                    case -489002404:
                                        if (C2105.f7037 != 0) {
                                            m256612 = (C2105.m6981("᩺ۡ") ^ i129) * (-101);
                                            i130 = ((m256612 ^ i128) * (-30847)) ^ (-1736787188);
                                            i131 = -903120431;
                                        } else {
                                            m256612 = C0630.m2566("ܿۧ") ^ i128;
                                            i130 = ((m256612 ^ i129) * (-15257)) ^ (-364956914);
                                            i131 = -1479770243;
                                        }
                                    case -1282100343:
                                    case -1229935007:
                                        C4075.m12263();
                                        C1773.m5908();
                                        break;
                                    case -1181340416:
                                    case -515840350:
                                        if (C4616.m13552() != 0) {
                                            m256612 = C0630.m2566("۠ܽ") ^ i128;
                                            i130 = ((m256612 ^ i129) * (-6013)) ^ 142512285;
                                            i131 = 1955438738;
                                        } else {
                                            m256612 = C2105.m6981("ۜ۟") ^ i128;
                                            i130 = ((m256612 ^ i129) * (-30933)) ^ (-29166636);
                                            i131 = -818828255;
                                        }
                                    case -1044999805:
                                    case 1449043660:
                                        if (C0630.f2410 <= 0) {
                                            m256612 = C0630.m2566("ۛۜ") ^ i128;
                                            i130 = ((m256612 ^ i129) * 29605) ^ (-540981425);
                                            i131 = 298473797;
                                        } else {
                                            m256612 = C0630.m2566("ܽ֡") ^ i129;
                                            i130 = ((m256612 ^ i128) * 21211) ^ (-1540391614);
                                            i131 = 1723178247;
                                        }
                                    case -600039314:
                                    case 2023869009:
                                        if (C2520.f8000 >= 0) {
                                            m256612 = (C2105.m6981("ܺ᩺") ^ i128) * 47;
                                            i130 = ((m256612 ^ i129) * (-32157)) ^ (-1603378326);
                                            i131 = 640721390;
                                        } else {
                                            m256612 = (i128 - C2105.m6981("֫ۜ")) * (-101);
                                            i130 = ((m256612 ^ i129) * 1699) ^ 1765160080;
                                            i131 = -1311824569;
                                        }
                                    case 89793065:
                                    case 752324256:
                                        z12 = checkedTextView2.isChecked();
                                        z13 = true;
                                        if (C1916.f6442) {
                                            m256612 = (C0630.m2566("֨ۧ") + i128) * (-119);
                                            i130 = ((m256612 ^ i129) * (-6601)) ^ 661763934;
                                            i131 = -1430595229;
                                        } else {
                                            m256612 = C0630.m2566("۠ܽ") ^ i128;
                                            i130 = ((m256612 ^ i129) * (-6013)) ^ 142512285;
                                            i131 = 1955438738;
                                        }
                                    case 223263861:
                                    case 825547944:
                                        checkedTextView2.setChecked(z12 ^ z13);
                                        break;
                                    case 344422259:
                                    case 1146088417:
                                        if (C2126.f7087) {
                                            m256612 = (C2105.m6981("᩺ۡ") ^ i129) * (-101);
                                            i130 = ((m256612 ^ i128) * (-30847)) ^ (-1736787188);
                                            i131 = -903120431;
                                        } else {
                                            m256612 = C2105.m6981("ۙܶ") ^ i129;
                                            i130 = ((m256612 ^ i128) * 27729) ^ 2111130076;
                                            i131 = 1585439992;
                                        }
                                    case 762969082:
                                    case 840943517:
                                        if (C4263.f13799 <= 0) {
                                            m256612 = C0630.m2566("۠ܽ") ^ i128;
                                            i130 = ((m256612 ^ i129) * (-6013)) ^ 142512285;
                                            i131 = 1955438738;
                                        } else {
                                            m256612 = (C2105.m6981("ܺ᩺") ^ i128) * 47;
                                            i130 = ((m256612 ^ i129) * (-32157)) ^ (-1603378326);
                                            i131 = 640721390;
                                        }
                                    default:
                                        ServiceConnectionC3453.m10564();
                                        if (RunnableC1108.m3790()) {
                                            m256612 = (C0630.m2566("ۢ᩻") ^ i129) * (-65);
                                            i130 = ((m256612 ^ i128) * 29433) ^ 1326776849;
                                            i131 = -461800401;
                                        } else {
                                            m256612 = C0630.m2566("۠ܽ") ^ i128;
                                            i130 = ((m256612 ^ i129) * (-6013)) ^ 142512285;
                                            i131 = 1955438738;
                                        }
                                }
                                return;
                            }
                        }
                    });
                    editText6 = editText16;
                    i60 = ApplicationC20075.f65008.getInt(C0050.m948(f6807, 556, 19, i92), 3);
                    if (i60 >= 0) {
                        int m256612 = (i89 - C0630.m2566("ᩴ᩸")) * 19;
                        i101 = i59;
                        i105 = i58;
                        i106 = i56;
                        z10 = z6;
                        i94 = i57;
                        sArr29 = sArr17;
                        sArr28 = sArr16;
                        obj8 = obj22;
                        c29788 = c29785;
                        sArr27 = sArr15;
                        i104 = i55;
                        sArr26 = sArr14;
                        i102 = i53;
                        i103 = i54;
                        i108 = 3;
                        i107 = i60;
                        i91 = m256612 ^ (-1964440504);
                        i90 = ((m256612 ^ i88) * (-27383)) ^ (-121483024);
                        c1925817 = c1925811;
                        c34308 = c34307;
                        i109 = i52;
                        editText12 = editText4;
                        r82 = obj8;
                        EditText editText142222 = editText6;
                        i98 = i29;
                        i93 = i13;
                        view5 = view2;
                        c1925816 = c192584;
                        editText13 = editText142222;
                    } else {
                        i108 = 3;
                        obj12 = obj22;
                        i100 = i108;
                        obj11 = obj12;
                        int m69815 = (C2105.m6981("ܶۗ") ^ i89) * 119;
                        i101 = i59;
                        i105 = i58;
                        i106 = i56;
                        i94 = i57;
                        i109 = i52;
                        sArr29 = sArr17;
                        sArr28 = sArr16;
                        obj8 = obj11;
                        sArr27 = sArr15;
                        i104 = i55;
                        sArr26 = sArr14;
                        i102 = i53;
                        i103 = i54;
                        i107 = i60;
                        i91 = m69815 ^ 318715572;
                        i90 = ((m69815 ^ i88) * (-15671)) ^ (-2081120410);
                        c1925817 = c1925811;
                        z10 = z6;
                        c34308 = c34307;
                        c29788 = c29785;
                        editText12 = editText4;
                        r82 = obj8;
                        EditText editText1422222 = editText6;
                        i98 = i29;
                        i93 = i13;
                        view5 = view2;
                        c1925816 = c192584;
                        editText13 = editText1422222;
                    }
                case -1635717456:
                case 1254878064:
                    i9 = i109;
                    Object obj23 = r82;
                    i10 = i107;
                    c29782 = c29788;
                    editText4 = editText12;
                    c192585 = c1925817;
                    sArr9 = sArr26;
                    i36 = i102;
                    i37 = i103;
                    sArr2 = sArr27;
                    sArr3 = sArr28;
                    i11 = i104;
                    sArr4 = sArr29;
                    i12 = i106;
                    z2 = z10;
                    c34302 = c34308;
                    i14 = i94;
                    i15 = i105;
                    View view9 = view5;
                    i13 = i93;
                    i29 = i98;
                    editText6 = editText13;
                    c192584 = c1925816;
                    view2 = view9;
                    interfaceC12344 = interfaceC123445;
                    checkedTextView.setChecked(C0964.m3400(interfaceC12344, C2167.m7159(f6807, 529, 24, i92), z9));
                    sArr25 = f6807;
                    i101 = 553;
                    if (C3537.f11231 >= 0) {
                        editText3 = editText6;
                        sArr26 = sArr9;
                        i102 = i36;
                        i103 = i37;
                        obj16 = obj23;
                        int m256613 = (C0630.m2566("ۡ۟") ^ i89) * 39;
                        i72 = ((m256613 ^ i88) * (-20451)) ^ 418724641;
                        i91 = m256613 ^ (-1248307279);
                        interfaceC123445 = interfaceC12344;
                        i98 = i29;
                        i105 = i15;
                        i106 = i12;
                        i93 = i13;
                        z10 = z2;
                        c34308 = c34302;
                        i94 = i14;
                        i107 = i10;
                        sArr29 = sArr4;
                        sArr28 = sArr3;
                        r82 = obj16;
                        c29788 = c29782;
                        editText12 = editText4;
                        sArr27 = sArr2;
                        i104 = i11;
                        view5 = view2;
                        c1925817 = c192585;
                        c1925816 = c192584;
                        editText13 = editText3;
                        i90 = i72;
                        i109 = i9;
                    } else {
                        int m256614 = (i88 - C0630.m2566("֨ۘ")) * 71;
                        i38 = ((m256614 ^ i89) * (-3249)) ^ 804117470;
                        i40 = m256614 ^ (-1177406415);
                        interfaceC123445 = interfaceC12344;
                        obj7 = obj23;
                        i105 = i15;
                        i106 = i12;
                        z10 = z2;
                        i94 = i14;
                        i107 = i10;
                        i109 = i9;
                        sArr29 = sArr4;
                        sArr28 = sArr3;
                        obj8 = obj7;
                        c29788 = c29782;
                        sArr27 = sArr2;
                        i104 = i11;
                        sArr26 = sArr9;
                        i102 = i36;
                        i103 = i37;
                        i91 = i40;
                        i90 = i38;
                        c1925817 = c192585;
                        c34308 = c34302;
                        editText12 = editText4;
                        r82 = obj8;
                        EditText editText14222222 = editText6;
                        i98 = i29;
                        i93 = i13;
                        view5 = view2;
                        c1925816 = c192584;
                        editText13 = editText14222222;
                    }
                case -1617358724:
                case 845899313:
                    i19 = i109;
                    obj4 = r82;
                    i20 = i107;
                    c29783 = c29788;
                    editText5 = editText12;
                    c192589 = c1925817;
                    i21 = i101;
                    sArr5 = sArr26;
                    i22 = i102;
                    i23 = i103;
                    sArr6 = sArr27;
                    sArr7 = sArr28;
                    i24 = i104;
                    sArr8 = sArr29;
                    i25 = i106;
                    z3 = z10;
                    c34304 = c34308;
                    i26 = i94;
                    i27 = i97;
                    interfaceC123442 = interfaceC123445;
                    i28 = i105;
                    View view10 = view5;
                    i13 = i93;
                    i29 = i98;
                    editText6 = editText13;
                    c192584 = c1925816;
                    view2 = view10;
                    i92 = 59496;
                    m2566 = (C0630.m2566("ۡۡ") ^ i89) * (-93);
                    i90 = ((m2566 ^ i88) * (-14569)) ^ 160341879;
                    i30 = 979172242;
                    obj5 = obj4;
                    i31 = m2566 ^ i30;
                    interfaceC123445 = interfaceC123442;
                    i97 = i27;
                    obj13 = obj5;
                    i101 = i21;
                    i105 = i28;
                    i106 = i25;
                    z10 = z3;
                    c34308 = c34304;
                    i94 = i26;
                    i107 = i20;
                    i109 = i19;
                    sArr29 = sArr8;
                    sArr28 = sArr7;
                    r82 = obj13;
                    c29788 = c29783;
                    editText12 = editText5;
                    sArr27 = sArr6;
                    i104 = i24;
                    sArr26 = sArr5;
                    i102 = i22;
                    i103 = i23;
                    i91 = i31;
                    c1925817 = c192589;
                    viewOnClickListenerC2040 = this;
                    EditText editText142222222 = editText6;
                    i98 = i29;
                    i93 = i13;
                    view5 = view2;
                    c1925816 = c192584;
                    editText13 = editText142222222;
                case -1592972941:
                case -1003744105:
                    C19258 c1925822 = c1925817;
                    c1925822.m44420(new DialogInterface.OnDismissListener() { // from class: l.ۢۘ᩷
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            ViewOnClickListenerC2040.this.f6832 = null;
                        }
                    });
                    DialogInterfaceC0206 m2438 = RunnableC0588.m2438(c1925822);
                    C5088.m14637(m2438);
                    EditText editText17 = editText12;
                    EditText editText18 = editText13;
                    C4159.m12564(C21923.m49343(m2438), new ViewOnClickListenerC14718(editText18, editText17, c29788, m2438));
                    C4159.m12564(C4616.m13545(m2438), new ViewOnClickListenerC7935(z9 ? 1 : 0, editText17));
                    C4925.m14329(editText18);
                    return z10;
                case -1438371181:
                case -1337982373:
                    i9 = i109;
                    Object obj24 = r82;
                    i10 = i107;
                    c29782 = c29788;
                    editText4 = editText12;
                    c192585 = c1925817;
                    i35 = i101;
                    sArr9 = sArr26;
                    i36 = i102;
                    i37 = i103;
                    sArr2 = sArr27;
                    sArr3 = sArr28;
                    i11 = i104;
                    sArr4 = sArr29;
                    i12 = i106;
                    z2 = z10;
                    c34302 = c34308;
                    i14 = i94;
                    interfaceC123444 = interfaceC123445;
                    i15 = i105;
                    View view11 = view5;
                    i13 = i93;
                    i29 = i98;
                    editText6 = editText13;
                    c192584 = c1925816;
                    view2 = view11;
                    if (i29 == (C2105.m6981(C0964.m3396(f6807, 523, 3, i92)) ^ 2101898096)) {
                        m69812 = C2105.m6981("᩸ۤ") ^ i88;
                        i38 = ((m69812 ^ i89) * 9271) ^ (-811072328);
                        i39 = 70383482;
                        obj6 = obj24;
                    } else {
                        m69812 = C0630.m2566("ܶ۠") ^ i89;
                        i38 = ((m69812 ^ i88) * 14647) ^ 1135244230;
                        i39 = 2052310215;
                        obj6 = obj24;
                    }
                    i40 = m69812 ^ i39;
                    interfaceC123445 = interfaceC123444;
                    i101 = i35;
                    obj7 = obj6;
                    i105 = i15;
                    i106 = i12;
                    z10 = z2;
                    i94 = i14;
                    i107 = i10;
                    i109 = i9;
                    sArr29 = sArr4;
                    sArr28 = sArr3;
                    obj8 = obj7;
                    c29788 = c29782;
                    sArr27 = sArr2;
                    i104 = i11;
                    sArr26 = sArr9;
                    i102 = i36;
                    i103 = i37;
                    i91 = i40;
                    i90 = i38;
                    c1925817 = c192585;
                    c34308 = c34302;
                    editText12 = editText4;
                    r82 = obj8;
                    EditText editText1422222222 = editText6;
                    i98 = i29;
                    i93 = i13;
                    view5 = view2;
                    c1925816 = c192584;
                    editText13 = editText1422222222;
                case -1164497384:
                case 749413436:
                    if (C3432.f10845 < 0) {
                        i19 = i109;
                        obj15 = r82;
                        i20 = i107;
                        c29783 = c29788;
                        editText5 = editText12;
                        c192589 = c1925817;
                        i21 = i101;
                        sArr5 = sArr26;
                        i22 = i102;
                        i23 = i103;
                        sArr6 = sArr27;
                        sArr7 = sArr28;
                        i24 = i104;
                        sArr8 = sArr29;
                        i25 = i106;
                        z3 = z10;
                        c34304 = c34308;
                        i26 = i94;
                        interfaceC123443 = interfaceC123445;
                        i28 = i105;
                        View view12 = view5;
                        i13 = i93;
                        i29 = i98;
                        editText6 = editText13;
                        c192584 = c1925816;
                        view2 = view12;
                        m6981 = C2105.m6981("ܰܰ") ^ i89;
                        i90 = ((m6981 ^ i88) * (-17577)) ^ (-930894083);
                        i34 = -719417923;
                        obj14 = obj15;
                        i31 = m6981 ^ i34;
                        interfaceC123445 = interfaceC123443;
                        obj13 = obj14;
                        i101 = i21;
                        i105 = i28;
                        i106 = i25;
                        z10 = z3;
                        c34308 = c34304;
                        i94 = i26;
                        i107 = i20;
                        i109 = i19;
                        sArr29 = sArr8;
                        sArr28 = sArr7;
                        r82 = obj13;
                        c29788 = c29783;
                        editText12 = editText5;
                        sArr27 = sArr6;
                        i104 = i24;
                        sArr26 = sArr5;
                        i102 = i22;
                        i103 = i23;
                        i91 = i31;
                        c1925817 = c192589;
                        viewOnClickListenerC2040 = this;
                        EditText editText14222222222 = editText6;
                        i98 = i29;
                        i93 = i13;
                        view5 = view2;
                        c1925816 = c192584;
                        editText13 = editText14222222222;
                    } else {
                        m25664 = C2105.m6981("ܰۛ") ^ i88;
                        i85 = ((m25664 ^ i89) * (-5943)) ^ 2096797228;
                        i86 = -114834844;
                        i91 = m25664 ^ i86;
                        i90 = i85;
                    }
                case -1043867029:
                case 361196357:
                    z8 = z10;
                    i74 = i109;
                    Object obj25 = r82;
                    i75 = i107;
                    editText7 = editText12;
                    editText11 = editText13;
                    c1925814 = c1925817;
                    short[] sArr36 = sArr26;
                    sArr22 = sArr28;
                    i76 = i104;
                    sArr23 = sArr29;
                    i77 = i106;
                    c34305 = c34308;
                    c1925815 = c1925816;
                    i78 = i94;
                    view4 = view5;
                    int i127 = i102;
                    i79 = i105;
                    i80 = i93;
                    int i128 = i103;
                    C2978 c297812 = (C2978) C1005.m3507(view4, C2105.m6981(C0714.m2816(sArr36, i127, i128, i92)) ^ 2100721795);
                    sArr24 = sArr36;
                    i81 = i127;
                    i82 = i128;
                    editText11.setHint(C2958.m9025(C1504.m5171(C16293.m38327(), C0237.m1483(f6807, 590, 4, i92))));
                    sArr27 = f6807;
                    if (C21923.f70183 != 0) {
                        c29787 = c297812;
                        obj10 = obj25;
                        int m69816 = C2105.m6981("᩹᩷") ^ i89;
                        i83 = ((m69816 ^ i88) * (-351)) ^ (-1463524463);
                        i105 = i79;
                        i106 = i77;
                        i93 = i80;
                        i94 = i78;
                        i107 = i75;
                        i109 = i74;
                        sArr29 = sArr23;
                        sArr28 = sArr22;
                        r8 = obj10;
                        i104 = i76;
                        sArr26 = sArr24;
                        i102 = i81;
                        i103 = i82;
                        i91 = m69816 ^ 2071505073;
                        view5 = view4;
                        c1925817 = c1925814;
                        z10 = z8;
                        c1925816 = c1925815;
                        c29788 = c29787;
                        editText13 = editText11;
                        i90 = i83;
                        z4 = r8;
                        c34308 = c34305;
                        r82 = z4;
                        editText12 = editText7;
                    } else {
                        int m69817 = C2105.m6981("᩻ۧ") ^ i89;
                        int i129 = ((m69817 ^ i88) * 9659) ^ (-2026831055);
                        i105 = i79;
                        i106 = i77;
                        i93 = i80;
                        i94 = i78;
                        i107 = i75;
                        sArr29 = sArr23;
                        sArr28 = sArr22;
                        r82 = obj25;
                        i104 = i76;
                        sArr26 = sArr24;
                        i102 = i81;
                        i103 = i82;
                        i91 = m69817 ^ (-2020454928);
                        view5 = view4;
                        c1925817 = c1925814;
                        z10 = z8;
                        c1925816 = c1925815;
                        editText13 = editText11;
                        i90 = i129;
                        c29788 = c297812;
                        c34308 = c34305;
                        i109 = i74;
                        editText12 = editText7;
                    }
                case -1011042358:
                case 904598871:
                    c34302 = c34308;
                    i9 = i109;
                    Object obj26 = r82;
                    c192584 = c1925816;
                    i10 = i107;
                    view2 = view5;
                    c29782 = c29788;
                    c192585 = c1925817;
                    sArr2 = sArr27;
                    sArr3 = sArr28;
                    i11 = i104;
                    sArr4 = sArr29;
                    i12 = i106;
                    z2 = z10;
                    i13 = i93;
                    i14 = i94;
                    int i130 = i99;
                    i15 = i105;
                    editText3 = (EditText) C11340.m28028(view2, i130);
                    EditText editText19 = (EditText) C1005.m3507(view2, C2105.m6981(C2105.m6988(f6807, 584, 3, i92)) ^ 2101979015);
                    sArr26 = f6807;
                    i102 = 587;
                    i103 = 3;
                    if (C11340.f33930 >= 0) {
                        i99 = i130;
                        editText4 = editText19;
                        interfaceC12344 = interfaceC123445;
                        obj17 = obj26;
                        i29 = i98;
                        obj16 = obj17;
                        int m2566132 = (C0630.m2566("ۡ۟") ^ i89) * 39;
                        i72 = ((m2566132 ^ i88) * (-20451)) ^ 418724641;
                        i91 = m2566132 ^ (-1248307279);
                        interfaceC123445 = interfaceC12344;
                        i98 = i29;
                        i105 = i15;
                        i106 = i12;
                        i93 = i13;
                        z10 = z2;
                        c34308 = c34302;
                        i94 = i14;
                        i107 = i10;
                        sArr29 = sArr4;
                        sArr28 = sArr3;
                        r82 = obj16;
                        c29788 = c29782;
                        editText12 = editText4;
                        sArr27 = sArr2;
                        i104 = i11;
                        view5 = view2;
                        c1925817 = c192585;
                        c1925816 = c192584;
                        editText13 = editText3;
                        i90 = i72;
                        i109 = i9;
                    } else {
                        int m256615 = C0630.m2566("۫۠") ^ i89;
                        int i131 = ((m256615 ^ i88) * (-32109)) ^ (-65175021);
                        i91 = m256615 ^ (-1938011713);
                        i99 = i130;
                        i105 = i15;
                        i106 = i12;
                        i93 = i13;
                        z10 = z2;
                        i94 = i14;
                        i107 = i10;
                        sArr29 = sArr4;
                        sArr28 = sArr3;
                        r82 = obj26;
                        c29788 = c29782;
                        sArr27 = sArr2;
                        i104 = i11;
                        view5 = view2;
                        c1925817 = c192585;
                        c1925816 = c192584;
                        editText13 = editText3;
                        i90 = i131;
                        i109 = i9;
                        c34303 = c34302;
                        editText12 = editText19;
                        c34308 = c34303;
                    }
                case -863253542:
                case 1533289142:
                    if (f6809[i94] == i95) {
                        i96 = i94;
                        m25664 = C0630.m2566("ܶۧ") ^ i88;
                        i85 = ((m25664 ^ i89) * (-15367)) ^ (-1816852943);
                        i86 = -720842066;
                        i91 = m25664 ^ i86;
                        i90 = i85;
                    } else {
                        m25664 = (C0630.m2566("ܰ᩷") + i88) * 33;
                        i85 = ((m25664 ^ i89) * (-28875)) ^ 1257986218;
                        i86 = 1633765831;
                        i91 = m25664 ^ i86;
                        i90 = i85;
                    }
                case -764248893:
                case 761709907:
                    i61 = i109;
                    obj9 = r82;
                    i62 = i107;
                    c29786 = c29788;
                    editText9 = editText12;
                    editText10 = editText13;
                    c1925812 = c1925817;
                    sArr18 = sArr26;
                    i63 = i102;
                    i64 = i103;
                    sArr19 = sArr27;
                    sArr20 = sArr28;
                    i65 = i104;
                    sArr21 = sArr29;
                    i66 = i106;
                    z7 = z10;
                    c1925813 = c1925816;
                    i67 = i94;
                    i68 = i99;
                    view3 = view5;
                    i69 = i105;
                    i70 = i93;
                    i71 = i98;
                    c34308 = viewOnClickListenerC2040.f6815;
                    int m256616 = (C0630.m2566("ۖܺ") + i88) * 9;
                    int i132 = ((m256616 ^ i89) * (-1515)) ^ 1767697960;
                    i99 = i68;
                    i98 = i71;
                    i105 = i69;
                    i106 = i66;
                    i93 = i70;
                    z10 = z7;
                    i94 = i67;
                    i107 = i62;
                    sArr29 = sArr21;
                    sArr28 = sArr20;
                    c29788 = c29786;
                    editText12 = editText9;
                    sArr27 = sArr19;
                    i104 = i65;
                    sArr26 = sArr18;
                    i102 = i63;
                    i103 = i64;
                    i91 = m256616 ^ (-2075376597);
                    view5 = view3;
                    c1925817 = c1925812;
                    c1925816 = c1925813;
                    i109 = i61;
                    editText13 = editText10;
                    i90 = i132;
                    r82 = obj9;
                case -701446791:
                case -657604052:
                    i41 = i109;
                    Object obj27 = r82;
                    i42 = i107;
                    c29784 = c29788;
                    editText8 = editText12;
                    c1925810 = c1925817;
                    i43 = i101;
                    sArr10 = sArr26;
                    i44 = i102;
                    i45 = i103;
                    sArr11 = sArr27;
                    sArr12 = sArr28;
                    i46 = i104;
                    sArr13 = sArr29;
                    i47 = i106;
                    z5 = z10;
                    c34306 = c34308;
                    i48 = i94;
                    i49 = i105;
                    View view13 = view5;
                    i13 = i93;
                    i29 = i98;
                    editText6 = editText13;
                    c192584 = c1925816;
                    view2 = view13;
                    checkedTextView = (CheckedTextView) C3537.m10739(viewOnClickListenerC2040, C2105.m6981(ServiceConnectionC3453.m10568(f6807, 526, 3, i92)) ^ 2098396382);
                    interfaceC123445 = ApplicationC20075.f65008;
                    obj19 = obj27;
                    if (!C1504.f5354) {
                        m69813 = C2105.m6981("ۨܳ") ^ i89;
                        i50 = ((m69813 ^ i88) * (-23187)) ^ 1194551901;
                        i51 = 125553748;
                        obj18 = obj27;
                        int i11522 = m69813 ^ i51;
                        i101 = i43;
                        i105 = i49;
                        i106 = i47;
                        c34308 = c34306;
                        i94 = i48;
                        i107 = i42;
                        i109 = i41;
                        sArr29 = sArr13;
                        sArr28 = sArr12;
                        r82 = obj18;
                        editText12 = editText8;
                        sArr27 = sArr11;
                        i104 = i46;
                        sArr26 = sArr10;
                        i102 = i44;
                        i103 = i45;
                        i91 = i11522;
                        i90 = i50;
                        c1925817 = c1925810;
                        z10 = z5;
                        c29788 = c29784;
                        EditText editText142222222222 = editText6;
                        i98 = i29;
                        i93 = i13;
                        view5 = view2;
                        c1925816 = c192584;
                        editText13 = editText142222222222;
                    }
                    m69813 = C2105.m6981("ۘۨ") ^ i89;
                    i50 = ((m69813 ^ i88) * 12151) ^ (-358975198);
                    i51 = -1253048189;
                    obj18 = obj19;
                    int i115222 = m69813 ^ i51;
                    i101 = i43;
                    i105 = i49;
                    i106 = i47;
                    c34308 = c34306;
                    i94 = i48;
                    i107 = i42;
                    i109 = i41;
                    sArr29 = sArr13;
                    sArr28 = sArr12;
                    r82 = obj18;
                    editText12 = editText8;
                    sArr27 = sArr11;
                    i104 = i46;
                    sArr26 = sArr10;
                    i102 = i44;
                    i103 = i45;
                    i91 = i115222;
                    i90 = i50;
                    c1925817 = c1925810;
                    z10 = z5;
                    c29788 = c29784;
                    EditText editText1422222222222 = editText6;
                    i98 = i29;
                    i93 = i13;
                    view5 = view2;
                    c1925816 = c192584;
                    editText13 = editText1422222222222;
                case -592745032:
                case 294155198:
                    if (C2126.f7087) {
                        i19 = i109;
                        obj15 = r82;
                        i20 = i107;
                        c29783 = c29788;
                        editText5 = editText12;
                        c192589 = c1925817;
                        i21 = i101;
                        sArr5 = sArr26;
                        i22 = i102;
                        i23 = i103;
                        sArr6 = sArr27;
                        sArr7 = sArr28;
                        i24 = i104;
                        sArr8 = sArr29;
                        i25 = i106;
                        z3 = z10;
                        c34304 = c34308;
                        i26 = i94;
                        interfaceC123443 = interfaceC123445;
                        i28 = i105;
                        View view122 = view5;
                        i13 = i93;
                        i29 = i98;
                        editText6 = editText13;
                        c192584 = c1925816;
                        view2 = view122;
                        m6981 = C2105.m6981("ܰܰ") ^ i89;
                        i90 = ((m6981 ^ i88) * (-17577)) ^ (-930894083);
                        i34 = -719417923;
                        obj14 = obj15;
                        i31 = m6981 ^ i34;
                        interfaceC123445 = interfaceC123443;
                        obj13 = obj14;
                        i101 = i21;
                        i105 = i28;
                        i106 = i25;
                        z10 = z3;
                        c34308 = c34304;
                        i94 = i26;
                        i107 = i20;
                        i109 = i19;
                        sArr29 = sArr8;
                        sArr28 = sArr7;
                        r82 = obj13;
                        c29788 = c29783;
                        editText12 = editText5;
                        sArr27 = sArr6;
                        i104 = i24;
                        sArr26 = sArr5;
                        i102 = i22;
                        i103 = i23;
                        i91 = i31;
                        c1925817 = c192589;
                        viewOnClickListenerC2040 = this;
                        EditText editText14222222222222 = editText6;
                        i98 = i29;
                        i93 = i13;
                        view5 = view2;
                        c1925816 = c192584;
                        editText13 = editText14222222222222;
                    } else {
                        i9 = i109;
                        obj17 = r82;
                        i10 = i107;
                        c29782 = c29788;
                        editText4 = editText12;
                        editText3 = editText13;
                        c192585 = c1925817;
                        sArr2 = sArr27;
                        sArr3 = sArr28;
                        i11 = i104;
                        sArr4 = sArr29;
                        i12 = i106;
                        z2 = z10;
                        c34302 = c34308;
                        c192584 = c1925816;
                        i14 = i94;
                        interfaceC12344 = interfaceC123445;
                        view2 = view5;
                        i15 = i105;
                        i13 = i93;
                        i29 = i98;
                        obj16 = obj17;
                        int m25661322 = (C0630.m2566("ۡ۟") ^ i89) * 39;
                        i72 = ((m25661322 ^ i88) * (-20451)) ^ 418724641;
                        i91 = m25661322 ^ (-1248307279);
                        interfaceC123445 = interfaceC12344;
                        i98 = i29;
                        i105 = i15;
                        i106 = i12;
                        i93 = i13;
                        z10 = z2;
                        c34308 = c34302;
                        i94 = i14;
                        i107 = i10;
                        sArr29 = sArr4;
                        sArr28 = sArr3;
                        r82 = obj16;
                        c29788 = c29782;
                        editText12 = editText4;
                        sArr27 = sArr2;
                        i104 = i11;
                        view5 = view2;
                        c1925817 = c192585;
                        c1925816 = c192584;
                        editText13 = editText3;
                        i90 = i72;
                        i109 = i9;
                    }
                case -572083522:
                case -541666052:
                    i9 = i109;
                    Object obj28 = r82;
                    i10 = i107;
                    c29782 = c29788;
                    editText4 = editText12;
                    c192585 = c1925817;
                    i35 = i101;
                    sArr9 = sArr26;
                    i36 = i102;
                    i37 = i103;
                    sArr2 = sArr27;
                    sArr3 = sArr28;
                    i11 = i104;
                    sArr4 = sArr29;
                    i12 = i106;
                    z2 = z10;
                    c34302 = c34308;
                    i14 = i94;
                    interfaceC123444 = interfaceC123445;
                    i15 = i105;
                    View view14 = view5;
                    i13 = i93;
                    i29 = i98;
                    editText6 = editText13;
                    c192584 = c1925816;
                    view2 = view14;
                    m6700();
                    if (viewOnClickListenerC2040.f6821.m2038() == 0) {
                        m69812 = (i88 - C2105.m6981("۟ۖ")) * (-115);
                        i38 = ((m69812 ^ i89) * (-19911)) ^ (-601837164);
                        i39 = 1689655088;
                        obj6 = obj28;
                    } else {
                        m69812 = (C2105.m6981("ۜ᩺") + i89) * 69;
                        i38 = ((m69812 ^ i88) * (-16799)) ^ 684108612;
                        i39 = -1404397550;
                        obj6 = obj28;
                    }
                    i40 = m69812 ^ i39;
                    interfaceC123445 = interfaceC123444;
                    i101 = i35;
                    obj7 = obj6;
                    i105 = i15;
                    i106 = i12;
                    z10 = z2;
                    i94 = i14;
                    i107 = i10;
                    i109 = i9;
                    sArr29 = sArr4;
                    sArr28 = sArr3;
                    obj8 = obj7;
                    c29788 = c29782;
                    sArr27 = sArr2;
                    i104 = i11;
                    sArr26 = sArr9;
                    i102 = i36;
                    i103 = i37;
                    i91 = i40;
                    i90 = i38;
                    c1925817 = c192585;
                    c34308 = c34302;
                    editText12 = editText4;
                    r82 = obj8;
                    EditText editText142222222222222 = editText6;
                    i98 = i29;
                    i93 = i13;
                    view5 = view2;
                    c1925816 = c192584;
                    editText13 = editText142222222222222;
                case -538676182:
                case -85859493:
                    i19 = i109;
                    Object obj29 = r82;
                    i20 = i107;
                    c29783 = c29788;
                    editText5 = editText12;
                    c192589 = c1925817;
                    i21 = i101;
                    sArr5 = sArr26;
                    i22 = i102;
                    i23 = i103;
                    sArr6 = sArr27;
                    sArr7 = sArr28;
                    i24 = i104;
                    sArr8 = sArr29;
                    i25 = i106;
                    z3 = z10;
                    c34304 = c34308;
                    i26 = i94;
                    i27 = i97;
                    interfaceC123442 = interfaceC123445;
                    i28 = i105;
                    View view15 = view5;
                    i13 = i93;
                    i29 = i98;
                    editText6 = editText13;
                    c192584 = c1925816;
                    view2 = view15;
                    short s = f6807[510];
                    if ((s * 27334) - ((s * s) + 186786889) > 0) {
                        m2566 = (C0630.m2566("᩶ܿ") + i89) * (-127);
                        i90 = ((m2566 ^ i88) * (-9995)) ^ 299779676;
                        i30 = 100175684;
                        obj5 = obj29;
                    } else {
                        m2566 = C0630.m2566("ۡۨ") ^ i88;
                        i90 = ((m2566 ^ i89) * (-7585)) ^ (-1703953301);
                        i30 = 264472660;
                        obj5 = obj29;
                    }
                    i31 = m2566 ^ i30;
                    interfaceC123445 = interfaceC123442;
                    i97 = i27;
                    obj13 = obj5;
                    i101 = i21;
                    i105 = i28;
                    i106 = i25;
                    z10 = z3;
                    c34308 = c34304;
                    i94 = i26;
                    i107 = i20;
                    i109 = i19;
                    sArr29 = sArr8;
                    sArr28 = sArr7;
                    r82 = obj13;
                    c29788 = c29783;
                    editText12 = editText5;
                    sArr27 = sArr6;
                    i104 = i24;
                    sArr26 = sArr5;
                    i102 = i22;
                    i103 = i23;
                    i91 = i31;
                    c1925817 = c192589;
                    viewOnClickListenerC2040 = this;
                    EditText editText1422222222222222 = editText6;
                    i98 = i29;
                    i93 = i13;
                    view5 = view2;
                    c1925816 = c192584;
                    editText13 = editText1422222222222222;
                case -494921728:
                case -211284299:
                    C3537.m10746();
                    if (C2105.f7037 == 0) {
                        m25664 = C2105.m6981("ۙ᩻") ^ i88;
                        i85 = ((m25664 ^ i89) * 13141) ^ 511399964;
                        i86 = -1723300720;
                        i91 = m25664 ^ i86;
                        i90 = i85;
                    } else {
                        i = i109;
                        i5 = i107;
                        editText = editText13;
                        c192583 = c1925817;
                        sArr = sArr29;
                        i6 = i106;
                        c192582 = c1925816;
                        i7 = i94;
                        view = view5;
                        i8 = i93;
                        C2978 c297813 = c29788;
                        z = z10;
                        editText2 = editText12;
                        c3430 = c34308;
                        c2978 = c297813;
                        i18 = (C0630.m2566("᩸ܶ") + i88) * 39;
                        i16 = ((i18 ^ i89) * (-4903)) ^ 1191781254;
                        i17 = -606666377;
                        c192588 = c192583;
                        i91 = i18 ^ i17;
                        i106 = i6;
                        i93 = i8;
                        i94 = i7;
                        i107 = i5;
                        sArr29 = sArr;
                        obj3 = r82;
                        c192587 = c192588;
                        view5 = view;
                        c1925817 = c192587;
                        c1925816 = c192582;
                        editText13 = editText;
                        i90 = i16;
                        i109 = i;
                        c34303 = c3430;
                        editText12 = editText2;
                        z10 = z;
                        c29788 = c2978;
                        r82 = obj3;
                        c34308 = c34303;
                    }
                case -489559549:
                case 395984193:
                    i13 = i93;
                    i19 = i109;
                    Object obj30 = r82;
                    i20 = i107;
                    c29783 = c29788;
                    editText5 = editText12;
                    EditText editText20 = editText13;
                    c192589 = c1925817;
                    sArr5 = sArr26;
                    i22 = i102;
                    i23 = i103;
                    sArr6 = sArr27;
                    sArr7 = sArr28;
                    i24 = i104;
                    sArr8 = sArr29;
                    i25 = i106;
                    z3 = z10;
                    c34304 = c34308;
                    c192584 = c1925816;
                    i26 = i94;
                    i28 = i105;
                    View m9259 = C3019.m9259(viewOnClickListenerC2040, C0630.m2566(RunnableC1937.m6385(f6807, 578, 3, i92)) ^ 2097920926);
                    i99 = C2105.m6981(C2105.m6988(f6807, 581, 3, i92)) ^ 2126021599;
                    if (RunnableC3474.f10992 <= 0) {
                        view2 = m9259;
                        interfaceC123443 = interfaceC123445;
                        i29 = i98;
                        i21 = i101;
                        editText6 = editText20;
                        obj15 = obj30;
                        m6981 = C2105.m6981("ܰܰ") ^ i89;
                        i90 = ((m6981 ^ i88) * (-17577)) ^ (-930894083);
                        i34 = -719417923;
                        obj14 = obj15;
                        i31 = m6981 ^ i34;
                        interfaceC123445 = interfaceC123443;
                        obj13 = obj14;
                        i101 = i21;
                        i105 = i28;
                        i106 = i25;
                        z10 = z3;
                        c34308 = c34304;
                        i94 = i26;
                        i107 = i20;
                        i109 = i19;
                        sArr29 = sArr8;
                        sArr28 = sArr7;
                        r82 = obj13;
                        c29788 = c29783;
                        editText12 = editText5;
                        sArr27 = sArr6;
                        i104 = i24;
                        sArr26 = sArr5;
                        i102 = i22;
                        i103 = i23;
                        i91 = i31;
                        c1925817 = c192589;
                        viewOnClickListenerC2040 = this;
                        EditText editText14222222222222222 = editText6;
                        i98 = i29;
                        i93 = i13;
                        view5 = view2;
                        c1925816 = c192584;
                        editText13 = editText14222222222222222;
                    } else {
                        int m256617 = (C0630.m2566("ۤۨ") + i88) * (-43);
                        i105 = i28;
                        i106 = i25;
                        c1925816 = c192584;
                        i94 = i26;
                        i107 = i20;
                        i109 = i19;
                        sArr29 = sArr8;
                        sArr28 = sArr7;
                        r82 = obj30;
                        sArr27 = sArr6;
                        i104 = i24;
                        sArr26 = sArr5;
                        i102 = i22;
                        i103 = i23;
                        editText13 = editText20;
                        i91 = m256617 ^ 39355674;
                        i90 = ((m256617 ^ i89) * 22695) ^ 1642139379;
                        c1925817 = c192589;
                        i93 = i13;
                        c34308 = c34304;
                        editText12 = editText5;
                        view5 = m9259;
                        z10 = z3;
                        c29788 = c29783;
                    }
                case -475472638:
                case 342469492:
                    i9 = i109;
                    Object obj31 = r82;
                    int i133 = i107;
                    C2978 c297814 = c29788;
                    EditText editText21 = editText12;
                    editText3 = editText13;
                    C19258 c1925823 = c1925817;
                    short[] sArr37 = sArr26;
                    int i134 = i102;
                    int i135 = i103;
                    short[] sArr38 = sArr27;
                    short[] sArr39 = sArr28;
                    int i136 = i104;
                    short[] sArr40 = sArr29;
                    int i137 = i106;
                    boolean z12 = z10;
                    C3430 c34309 = c34308;
                    C19258 c1925824 = c1925816;
                    int i138 = i94;
                    int i139 = i99;
                    View view16 = view5;
                    int i140 = i105;
                    int i141 = i93;
                    int i142 = i98;
                    if (i142 == (C0630.m2566(C0714.m2816(f6807, 575, 3, i92)) ^ 2098797323)) {
                        m25663 = C0630.m2566("ܺۤ") ^ i89;
                        i72 = ((m25663 ^ i88) * (-29129)) ^ 1990866997;
                        i73 = 1014348314;
                    } else {
                        m25663 = (i88 - C0630.m2566("۠۫")) * 7;
                        i72 = ((m25663 ^ i89) * (-13417)) ^ (-895569637);
                        i73 = 1505127365;
                    }
                    int i143 = m25663 ^ i73;
                    i99 = i139;
                    i98 = i142;
                    i105 = i140;
                    i106 = i137;
                    i93 = i141;
                    z10 = z12;
                    i94 = i138;
                    i107 = i133;
                    sArr29 = sArr40;
                    sArr28 = sArr39;
                    r82 = obj31;
                    c29788 = c297814;
                    sArr27 = sArr38;
                    i104 = i136;
                    sArr26 = sArr37;
                    i102 = i134;
                    i103 = i135;
                    i91 = i143;
                    view5 = view16;
                    c1925817 = c1925823;
                    c34308 = c34309;
                    c1925816 = c1925824;
                    editText12 = editText21;
                    editText13 = editText3;
                    i90 = i72;
                    i109 = i9;
                case -413464913:
                case 532939226:
                    C0798.m2998();
                    RunnableC1108.m3790();
                    i19 = i109;
                    obj15 = r82;
                    i20 = i107;
                    c29783 = c29788;
                    editText5 = editText12;
                    c192589 = c1925817;
                    i21 = i101;
                    sArr5 = sArr26;
                    i22 = i102;
                    i23 = i103;
                    sArr6 = sArr27;
                    sArr7 = sArr28;
                    i24 = i104;
                    sArr8 = sArr29;
                    i25 = i106;
                    z3 = z10;
                    c34304 = c34308;
                    i26 = i94;
                    interfaceC123443 = interfaceC123445;
                    i28 = i105;
                    View view1222 = view5;
                    i13 = i93;
                    i29 = i98;
                    editText6 = editText13;
                    c192584 = c1925816;
                    view2 = view1222;
                    m6981 = C2105.m6981("ܰܰ") ^ i89;
                    i90 = ((m6981 ^ i88) * (-17577)) ^ (-930894083);
                    i34 = -719417923;
                    obj14 = obj15;
                    i31 = m6981 ^ i34;
                    interfaceC123445 = interfaceC123443;
                    obj13 = obj14;
                    i101 = i21;
                    i105 = i28;
                    i106 = i25;
                    z10 = z3;
                    c34308 = c34304;
                    i94 = i26;
                    i107 = i20;
                    i109 = i19;
                    sArr29 = sArr8;
                    sArr28 = sArr7;
                    r82 = obj13;
                    c29788 = c29783;
                    editText12 = editText5;
                    sArr27 = sArr6;
                    i104 = i24;
                    sArr26 = sArr5;
                    i102 = i22;
                    i103 = i23;
                    i91 = i31;
                    c1925817 = c192589;
                    viewOnClickListenerC2040 = this;
                    EditText editText142222222222222222 = editText6;
                    i98 = i29;
                    i93 = i13;
                    view5 = view2;
                    c1925816 = c192584;
                    editText13 = editText142222222222222222;
                case -409197959:
                case 694716365:
                    i52 = i109;
                    Object obj32 = r82;
                    if (i107 > 4) {
                        i60 = i107;
                        c29785 = c29788;
                        editText4 = editText12;
                        c1925811 = c1925817;
                        i59 = i101;
                        sArr14 = sArr26;
                        i53 = i102;
                        i54 = i103;
                        sArr15 = sArr27;
                        sArr16 = sArr28;
                        i55 = i104;
                        sArr17 = sArr29;
                        i56 = i106;
                        z6 = z10;
                        c34307 = c34308;
                        i57 = i94;
                        i58 = i105;
                        View view17 = view5;
                        i13 = i93;
                        i29 = i98;
                        editText6 = editText13;
                        c192584 = c1925816;
                        view2 = view17;
                        obj12 = obj32;
                        i100 = i108;
                        obj11 = obj12;
                        int m698152 = (C2105.m6981("ܶۗ") ^ i89) * 119;
                        i101 = i59;
                        i105 = i58;
                        i106 = i56;
                        i94 = i57;
                        i109 = i52;
                        sArr29 = sArr17;
                        sArr28 = sArr16;
                        obj8 = obj11;
                        sArr27 = sArr15;
                        i104 = i55;
                        sArr26 = sArr14;
                        i102 = i53;
                        i103 = i54;
                        i107 = i60;
                        i91 = m698152 ^ 318715572;
                        i90 = ((m698152 ^ i88) * (-15671)) ^ (-2081120410);
                        c1925817 = c1925811;
                        z10 = z6;
                        c34308 = c34307;
                        c29788 = c29785;
                        editText12 = editText4;
                        r82 = obj8;
                        EditText editText1422222222222222222 = editText6;
                        i98 = i29;
                        i93 = i13;
                        view5 = view2;
                        c1925816 = c192584;
                        editText13 = editText1422222222222222222;
                    } else {
                        i60 = i107;
                        i100 = i60;
                        c29785 = c29788;
                        editText4 = editText12;
                        c1925811 = c1925817;
                        i59 = i101;
                        sArr14 = sArr26;
                        i53 = i102;
                        i54 = i103;
                        sArr15 = sArr27;
                        sArr16 = sArr28;
                        i55 = i104;
                        sArr17 = sArr29;
                        i56 = i106;
                        z6 = z10;
                        c34307 = c34308;
                        i57 = i94;
                        i58 = i105;
                        View view18 = view5;
                        i13 = i93;
                        i29 = i98;
                        editText6 = editText13;
                        c192584 = c1925816;
                        view2 = view18;
                        obj11 = obj32;
                        int m6981522 = (C2105.m6981("ܶۗ") ^ i89) * 119;
                        i101 = i59;
                        i105 = i58;
                        i106 = i56;
                        i94 = i57;
                        i109 = i52;
                        sArr29 = sArr17;
                        sArr28 = sArr16;
                        obj8 = obj11;
                        sArr27 = sArr15;
                        i104 = i55;
                        sArr26 = sArr14;
                        i102 = i53;
                        i103 = i54;
                        i107 = i60;
                        i91 = m6981522 ^ 318715572;
                        i90 = ((m6981522 ^ i88) * (-15671)) ^ (-2081120410);
                        c1925817 = c1925811;
                        z10 = z6;
                        c34308 = c34307;
                        c29788 = c29785;
                        editText12 = editText4;
                        r82 = obj8;
                        EditText editText14222222222222222222 = editText6;
                        i98 = i29;
                        i93 = i13;
                        view5 = view2;
                        c1925816 = c192584;
                        editText13 = editText14222222222222222222;
                    }
                case -400624946:
                case 353785182:
                    if (C1773.m5910(interfaceC10798)) {
                        m25664 = C2105.m6981("ܺ֡") ^ i89;
                        i85 = ((m25664 ^ i88) * 22069) ^ 706468773;
                        i86 = -1277014798;
                    } else {
                        m25664 = (i88 - C0630.m2566("֡۠")) * (-125);
                        i85 = ((m25664 ^ i89) * 2319) ^ 1546816180;
                        i86 = 275007960;
                    }
                    i91 = m25664 ^ i86;
                    i90 = i85;
                case -383749530:
                case 705585486:
                    i19 = i109;
                    obj4 = r82;
                    i20 = i107;
                    c29783 = c29788;
                    editText5 = editText12;
                    c192589 = c1925817;
                    i21 = i101;
                    sArr5 = sArr26;
                    i22 = i102;
                    i23 = i103;
                    sArr6 = sArr27;
                    sArr7 = sArr28;
                    i24 = i104;
                    sArr8 = sArr29;
                    i25 = i106;
                    z3 = z10;
                    c34304 = c34308;
                    i26 = i94;
                    i27 = i97;
                    interfaceC123442 = interfaceC123445;
                    i28 = i105;
                    View view19 = view5;
                    i13 = i93;
                    i29 = i98;
                    editText6 = editText13;
                    c192584 = c1925816;
                    view2 = view19;
                    i92 = 5624;
                    m2566 = (C0630.m2566("ۡۡ") ^ i89) * (-93);
                    i90 = ((m2566 ^ i88) * (-14569)) ^ 160341879;
                    i30 = 979172242;
                    obj5 = obj4;
                    i31 = m2566 ^ i30;
                    interfaceC123445 = interfaceC123442;
                    i97 = i27;
                    obj13 = obj5;
                    i101 = i21;
                    i105 = i28;
                    i106 = i25;
                    z10 = z3;
                    c34308 = c34304;
                    i94 = i26;
                    i107 = i20;
                    i109 = i19;
                    sArr29 = sArr8;
                    sArr28 = sArr7;
                    r82 = obj13;
                    c29788 = c29783;
                    editText12 = editText5;
                    sArr27 = sArr6;
                    i104 = i24;
                    sArr26 = sArr5;
                    i102 = i22;
                    i103 = i23;
                    i91 = i31;
                    c1925817 = c192589;
                    viewOnClickListenerC2040 = this;
                    EditText editText142222222222222222222 = editText6;
                    i98 = i29;
                    i93 = i13;
                    view5 = view2;
                    c1925816 = c192584;
                    editText13 = editText142222222222222222222;
                case -372962830:
                case 1077393370:
                    if (i94 < 5) {
                        m25664 = (C0630.m2566("ۧۘ") ^ i89) * (-55);
                        i85 = ((m25664 ^ i88) * (-28737)) ^ 1433722409;
                        i86 = 662737972;
                        i91 = m25664 ^ i86;
                        i90 = i85;
                    } else {
                        i96 = z9 ? 1 : 0;
                        m25664 = C0630.m2566("ܶۧ") ^ i88;
                        i85 = ((m25664 ^ i89) * (-15367)) ^ (-1816852943);
                        i86 = -720842066;
                        i91 = m25664 ^ i86;
                        i90 = i85;
                    }
                case -154147246:
                case 659800366:
                    if (C3245.f10203 > 0) {
                        m25664 = C2105.m6981("ܰۛ") ^ i88;
                        i85 = ((m25664 ^ i89) * (-5943)) ^ 2096797228;
                        i86 = -114834844;
                        i91 = m25664 ^ i86;
                        i90 = i85;
                    } else {
                        i = i109;
                        obj = r82;
                        i2 = i107;
                        editText = editText13;
                        c19258 = c1925817;
                        c192582 = c1925816;
                        i3 = i94;
                        view = view5;
                        i4 = i93;
                        C2978 c297815 = c29788;
                        z = z10;
                        editText2 = editText12;
                        c3430 = c34308;
                        c2978 = c297815;
                        int m2566722 = C0630.m2566("ۢ᩸") ^ i89;
                        i16 = ((m2566722 ^ i88) * 23695) ^ 718928716;
                        i91 = m2566722 ^ (-2014751006);
                        i93 = i4;
                        i94 = i3;
                        i107 = i2;
                        c192586 = c19258;
                        obj2 = obj;
                        obj3 = obj2;
                        c192587 = c192586;
                        view5 = view;
                        c1925817 = c192587;
                        c1925816 = c192582;
                        editText13 = editText;
                        i90 = i16;
                        i109 = i;
                        c34303 = c3430;
                        editText12 = editText2;
                        z10 = z;
                        c29788 = c2978;
                        r82 = obj3;
                        c34308 = c34303;
                    }
                case 53494029:
                case 1393213178:
                    ViewOnClickListenerC1958.m6434(c34308.f10837);
                    viewOnClickListenerC2040.f6835 = -1;
                    m6697();
                    return z10;
                case 70471360:
                case 899215007:
                    int i144 = i109;
                    Object obj33 = r82;
                    int i145 = i107;
                    InterfaceC12344 interfaceC123447 = interfaceC123445;
                    C2978 c297816 = c29788;
                    EditText editText22 = editText12;
                    EditText editText23 = editText13;
                    C19258 c1925825 = c1925817;
                    int i146 = i101;
                    short[] sArr41 = sArr26;
                    int i147 = i102;
                    int i148 = i103;
                    short[] sArr42 = sArr27;
                    short[] sArr43 = sArr28;
                    int i149 = i104;
                    short[] sArr44 = sArr29;
                    int i150 = i106;
                    C3430 c343010 = c34308;
                    C19258 c1925826 = c1925816;
                    int i151 = i94;
                    int i152 = i97;
                    View view20 = view5;
                    int i153 = i105;
                    int i154 = i93;
                    int m7041 = C2126.m7041(menuItem);
                    z9 = false;
                    if (m7041 == (C0630.m2566(C3746.m11357(f6807, SecP521R1Field.P16, 3, i92)) ^ 2102561668)) {
                        m25662 = (i89 - C2105.m6981("۠ۘ")) * (-67);
                        i32 = ((m25662 ^ i88) * (-28835)) ^ (-1663708588);
                        i33 = 1827894247;
                    } else {
                        m25662 = C0630.m2566("֨ۗ") ^ i88;
                        i32 = ((m25662 ^ i89) * 3241) ^ 1696314745;
                        i33 = 1801981005;
                    }
                    int i155 = m25662 ^ i33;
                    interfaceC123445 = interfaceC123447;
                    i97 = i152;
                    i101 = i146;
                    i105 = i153;
                    i106 = i150;
                    i93 = i154;
                    c34308 = c343010;
                    i94 = i151;
                    i107 = i145;
                    sArr29 = sArr44;
                    sArr28 = sArr43;
                    r82 = obj33;
                    c29788 = c297816;
                    editText12 = editText22;
                    sArr27 = sArr42;
                    i104 = i149;
                    sArr26 = sArr41;
                    i102 = i147;
                    i103 = i148;
                    z10 = true;
                    i91 = i155;
                    i90 = i32;
                    view5 = view20;
                    c1925817 = c1925825;
                    c1925816 = c1925826;
                    i109 = i144;
                    editText13 = editText23;
                    i98 = m7041;
                    viewOnClickListenerC2040 = this;
                case 159804803:
                case 260831223:
                    return z9;
                case 416887043:
                case 753840406:
                    i61 = i109;
                    obj9 = r82;
                    i62 = i107;
                    c29786 = c29788;
                    editText9 = editText12;
                    editText10 = editText13;
                    c1925812 = c1925817;
                    sArr18 = sArr26;
                    i63 = i102;
                    i64 = i103;
                    sArr19 = sArr27;
                    sArr20 = sArr28;
                    i65 = i104;
                    sArr21 = sArr29;
                    i66 = i106;
                    z7 = z10;
                    c1925813 = c1925816;
                    i67 = i94;
                    i68 = i99;
                    view3 = view5;
                    i69 = i105;
                    i70 = i93;
                    i71 = i98;
                    c34308 = viewOnClickListenerC2040.f6822;
                    int m2566162 = (C0630.m2566("ۖܺ") + i88) * 9;
                    int i1322 = ((m2566162 ^ i89) * (-1515)) ^ 1767697960;
                    i99 = i68;
                    i98 = i71;
                    i105 = i69;
                    i106 = i66;
                    i93 = i70;
                    z10 = z7;
                    i94 = i67;
                    i107 = i62;
                    sArr29 = sArr21;
                    sArr28 = sArr20;
                    c29788 = c29786;
                    editText12 = editText9;
                    sArr27 = sArr19;
                    i104 = i65;
                    sArr26 = sArr18;
                    i102 = i63;
                    i103 = i64;
                    i91 = m2566162 ^ (-2075376597);
                    view5 = view3;
                    c1925817 = c1925812;
                    c1925816 = c1925813;
                    i109 = i61;
                    editText13 = editText10;
                    i90 = i1322;
                    r82 = obj9;
                case 510298515:
                case 2017652880:
                    i74 = i109;
                    Object obj34 = r82;
                    i75 = i107;
                    editText11 = editText13;
                    c1925814 = c1925817;
                    sArr22 = sArr28;
                    sArr23 = sArr29;
                    i77 = i106;
                    c1925815 = c1925816;
                    i78 = i94;
                    view4 = view5;
                    i79 = i105;
                    i80 = i93;
                    C2978 c297817 = c29788;
                    z8 = z10;
                    EditText editText24 = editText12;
                    c34305 = c34308;
                    c29787 = c297817;
                    short[] sArr45 = sArr27;
                    String m1483 = C0237.m1483(sArr45, 594, 11, i92);
                    editText24.setHint(m1483);
                    RunnableC1937.m6377(editText11, C2958.m9025(m6667()));
                    editText7 = editText24;
                    i76 = i104;
                    str = C0964.m3407(ApplicationC20075.f65008, C1128.m3841(f6807, 605, 19, i92), m1483);
                    if (C3432.f10845 >= 0) {
                        sArr27 = sArr45;
                        sArr24 = sArr26;
                        i81 = i102;
                        i82 = i103;
                        obj10 = obj34;
                        int m698162 = C2105.m6981("᩹᩷") ^ i89;
                        i83 = ((m698162 ^ i88) * (-351)) ^ (-1463524463);
                        i105 = i79;
                        i106 = i77;
                        i93 = i80;
                        i94 = i78;
                        i107 = i75;
                        i109 = i74;
                        sArr29 = sArr23;
                        sArr28 = sArr22;
                        r8 = obj10;
                        i104 = i76;
                        sArr26 = sArr24;
                        i102 = i81;
                        i103 = i82;
                        i91 = m698162 ^ 2071505073;
                        view5 = view4;
                        c1925817 = c1925814;
                        z10 = z8;
                        c1925816 = c1925815;
                        c29788 = c29787;
                        editText13 = editText11;
                        i90 = i83;
                        z4 = r8;
                        c34308 = c34305;
                        r82 = z4;
                        editText12 = editText7;
                    } else {
                        int m69818 = C2105.m6981("ۚ֡") ^ i88;
                        i83 = ((m69818 ^ i89) * (-28677)) ^ 1582222315;
                        i91 = m69818 ^ 989879562;
                        i105 = i79;
                        i106 = i77;
                        i93 = i80;
                        z10 = z8;
                        i94 = i78;
                        i107 = i75;
                        i109 = i74;
                        sArr29 = sArr23;
                        sArr28 = sArr22;
                        r8 = obj34;
                        c29788 = c29787;
                        sArr27 = sArr45;
                        i104 = i76;
                        view5 = view4;
                        c1925817 = c1925814;
                        c1925816 = c1925815;
                        editText13 = editText11;
                        i90 = i83;
                        z4 = r8;
                        c34308 = c34305;
                        r82 = z4;
                        editText12 = editText7;
                    }
                case 658664805:
                case 1013450968:
                    editText = editText13;
                    ?? r14 = c1925817;
                    c192582 = c1925816;
                    C2978 c297818 = c29788;
                    z = z10;
                    editText2 = editText12;
                    c3430 = c34308;
                    c2978 = c297818;
                    i7 = i94;
                    i5 = i107;
                    short[] sArr46 = sArr29;
                    i6 = i106;
                    C0382.m1849(r14, C2105.m6981(C1916.m6311(sArr46, i6, 3, i92)) ^ 2123867379);
                    view = view5;
                    C0798.m3013(r14, view);
                    ViewOnClickListenerC1958.m6441(r14, i109, r82);
                    C5695.m16035(r14, i93, r82);
                    i8 = i93;
                    i = i109;
                    sArr = sArr46;
                    r14.m44437(C2272.m7507(f6807, 635, 4, i92), r82);
                    c192583 = r14;
                    if (C7106.f21815 == 0) {
                        i18 = (i88 - C2105.m6981("᩶֨")) * 61;
                        i16 = ((i18 ^ i89) * (-31385)) ^ (-1720040148);
                        i17 = -1571394268;
                        c192588 = r14;
                        i91 = i18 ^ i17;
                        i106 = i6;
                        i93 = i8;
                        i94 = i7;
                        i107 = i5;
                        sArr29 = sArr;
                        obj3 = r82;
                        c192587 = c192588;
                        view5 = view;
                        c1925817 = c192587;
                        c1925816 = c192582;
                        editText13 = editText;
                        i90 = i16;
                        i109 = i;
                        c34303 = c3430;
                        editText12 = editText2;
                        z10 = z;
                        c29788 = c2978;
                        r82 = obj3;
                        c34308 = c34303;
                    }
                    i18 = (C0630.m2566("᩸ܶ") + i88) * 39;
                    i16 = ((i18 ^ i89) * (-4903)) ^ 1191781254;
                    i17 = -606666377;
                    c192588 = c192583;
                    i91 = i18 ^ i17;
                    i106 = i6;
                    i93 = i8;
                    i94 = i7;
                    i107 = i5;
                    sArr29 = sArr;
                    obj3 = r82;
                    c192587 = c192588;
                    view5 = view;
                    c1925817 = c192587;
                    c1925816 = c192582;
                    editText13 = editText;
                    i90 = i16;
                    i109 = i;
                    c34303 = c3430;
                    editText12 = editText2;
                    z10 = z;
                    c29788 = c2978;
                    r82 = obj3;
                    c34308 = c34303;
                case 706303738:
                case 1949613406:
                    ((C4841) RunnableC1108.m3791(interfaceC10798)).m14085(z10);
                    m25664 = C2105.m6981("ۙᩳ") ^ i89;
                    i85 = ((m25664 ^ i88) * (-30685)) ^ (-74505584);
                    i86 = -1930607541;
                    i91 = m25664 ^ i86;
                    i90 = i85;
                case 745979097:
                case 1290114066:
                    C7106.m19120();
                    return false;
                case 871043786:
                case 2000468360:
                    c1925816.m44417(C0630.m2566(C0237.m1483(f6807, 642, 3, i92)) ^ 2125868114, i96, new DialogInterface.OnClickListener() { // from class: l.ۗۘ᩷
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i156) {
                            int i157 = -439513522;
                            int i158 = ServiceConnectionC3453.f10921;
                            int i159 = C0483.f2088;
                            int m69819 = C2105.m6981("ۡۘ") ^ i159;
                            int i160 = ((m69819 ^ i158) * (-28525)) ^ (-1706077183);
                            int i161 = 1560443648;
                            while (true) {
                                i157 = ((((i157 ^ i158) * 16901) >> 31) & i160) ^ (m69819 ^ i161);
                                switch (i157) {
                                    case -2143064827:
                                    case 1143148757:
                                        if (C4263.f13799 <= 0) {
                                            m69819 = (C2105.m6981("ۜۜ") ^ i158) * (-61);
                                            i160 = ((m69819 ^ i159) * (-3661)) ^ 1887912185;
                                            i161 = 1424372341;
                                        } else {
                                            m69819 = C0630.m2566("ۗۖ") ^ i158;
                                            i160 = ((m69819 ^ i159) * 12163) ^ (-1748752224);
                                            i161 = 75397379;
                                        }
                                    case -2111704812:
                                    case -752368775:
                                        if (C4117.m12364() != 0) {
                                            m69819 = C2105.m6981("۠ۢ") ^ i159;
                                            i160 = ((m69819 ^ i158) * 15133) ^ (-228028720);
                                            i161 = 2037453610;
                                        } else {
                                            m69819 = (i159 - C2105.m6981("ۡۙ")) * (-21);
                                            i160 = ((m69819 ^ i158) * 7983) ^ (-2011623858);
                                            i161 = 471448799;
                                        }
                                    case -2021578054:
                                    case -204489905:
                                        if (AbstractC2021.f6743 <= 0) {
                                            m69819 = C2105.m6981("۠ۢ") ^ i159;
                                            i160 = ((m69819 ^ i158) * 15133) ^ (-228028720);
                                            i161 = 2037453610;
                                        } else {
                                            m69819 = C2105.m6981("ᩴ᩻") ^ i158;
                                            i160 = ((m69819 ^ i159) * (-14457)) ^ 1080395949;
                                            i161 = 1904452764;
                                        }
                                    case -1941213898:
                                    case -1504536277:
                                        C0483.m2121();
                                        break;
                                    case -1925944250:
                                    case 798200544:
                                        if (C3911.m11924() <= 0) {
                                            m69819 = C2105.m6981("ۘۛ") ^ i158;
                                            i160 = ((m69819 ^ i159) * (-28459)) ^ 156954057;
                                            i161 = 636516426;
                                        } else {
                                            m69819 = (C2105.m6981("᩻᩺") ^ i158) * 45;
                                            i160 = ((m69819 ^ i159) * (-25465)) ^ 1917936430;
                                            i161 = -346434758;
                                        }
                                    case -1824875514:
                                    case -474198070:
                                        ViewOnClickListenerC2040.m6680(ViewOnClickListenerC2040.this, i156);
                                        break;
                                    case -1653137557:
                                    case -1611550614:
                                        AbstractC2021.m6574();
                                        m69819 = C2105.m6981("۠ۢ") ^ i159;
                                        i160 = ((m69819 ^ i158) * 15133) ^ (-228028720);
                                        i161 = 2037453610;
                                    case -997459337:
                                    case 1513117439:
                                        if (C2167.f7158 >= 0) {
                                            m69819 = C2105.m6981("ۘۛ") ^ i158;
                                            i160 = ((m69819 ^ i159) * (-28459)) ^ 156954057;
                                            i161 = 636516426;
                                        } else {
                                            m69819 = C2105.m6981("ܰۤ") ^ i159;
                                            i160 = ((m69819 ^ i158) * 17637) ^ (-1866402103);
                                            i161 = -1610051589;
                                        }
                                    case -922266055:
                                    case -347435328:
                                        if (RunnableC1108.f4040) {
                                            m69819 = C2105.m6981("ᩴ᩻") ^ i158;
                                            i160 = ((m69819 ^ i159) * (-14457)) ^ 1080395949;
                                            i161 = 1904452764;
                                        } else {
                                            m69819 = (i159 - C0630.m2566("᩷ۨ")) * (-33);
                                            i160 = ((m69819 ^ i158) * 20877) ^ 502973587;
                                            i161 = -1151490636;
                                        }
                                    case -570432859:
                                    case 1887259349:
                                        C7811.m20844();
                                        if (C2126.f7087) {
                                            m69819 = C2105.m6981("ᩴ᩻") ^ i158;
                                            i160 = ((m69819 ^ i159) * (-14457)) ^ 1080395949;
                                            i161 = 1904452764;
                                        } else {
                                            m69819 = C2105.m6981("ۘۛ") ^ i158;
                                            i160 = ((m69819 ^ i159) * (-28459)) ^ 156954057;
                                            i161 = 636516426;
                                        }
                                    case -393652564:
                                    case -144856824:
                                        if (C7106.f21815 != 0) {
                                            m69819 = C2105.m6981("ᩴ᩻") ^ i158;
                                            i160 = ((m69819 ^ i159) * (-14457)) ^ 1080395949;
                                            i161 = 1904452764;
                                        } else {
                                            m69819 = C0630.m2566("ܶۤ") ^ i159;
                                            i160 = ((m69819 ^ i158) * 2271) ^ (-525998154);
                                            i161 = -1265300928;
                                        }
                                    case -363272181:
                                    case -100237086:
                                        if (AbstractC2021.m6574()) {
                                            m69819 = (C2105.m6981("ۜۜ") ^ i158) * (-61);
                                            i160 = ((m69819 ^ i159) * (-3661)) ^ 1887912185;
                                            i161 = 1424372341;
                                        } else {
                                            m69819 = (i159 - C2105.m6981("ۖ᩻")) * (-79);
                                            i160 = ((m69819 ^ i158) * (-19157)) ^ 1548986514;
                                            i161 = 2119323841;
                                        }
                                    case -87515241:
                                    case 1281190265:
                                        if (RunnableC3474.f10992 <= 0) {
                                            m69819 = (C2105.m6981("ۜۜ") ^ i158) * (-61);
                                            i160 = ((m69819 ^ i159) * (-3661)) ^ 1887912185;
                                            i161 = 1424372341;
                                        } else {
                                            m69819 = (C0630.m2566("۬ۛ") ^ i158) * (-53);
                                            i160 = ((m69819 ^ i159) * 9983) ^ (-2079221117);
                                            i161 = 445405598;
                                        }
                                    case 1124221400:
                                    case 1807137325:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            m69819 = (C2105.m6981("ۜۜ") ^ i158) * (-61);
                                            i160 = ((m69819 ^ i159) * (-3661)) ^ 1887912185;
                                            i161 = 1424372341;
                                        } else {
                                            m69819 = (i159 - C2105.m6981("֫ۤ")) * (-29);
                                            i160 = ((m69819 ^ i158) * (-25313)) ^ (-1697563500);
                                            i161 = 875011256;
                                        }
                                    case 1348200070:
                                    case 2133539916:
                                        if (C3663.f11553) {
                                            m69819 = (C2105.m6981("ۜۜ") ^ i158) * (-61);
                                            i160 = ((m69819 ^ i159) * (-3661)) ^ 1887912185;
                                            i161 = 1424372341;
                                        } else {
                                            m69819 = (C0630.m2566("ܰۜ") + i158) * (-59);
                                            i160 = ((m69819 ^ i159) * (-25977)) ^ 1209596069;
                                            i161 = -2129014970;
                                        }
                                    default:
                                        if (C3537.f11231 >= 0) {
                                            m69819 = (C2105.m6981("ۜۜ") ^ i158) * (-61);
                                            i160 = ((m69819 ^ i159) * (-3661)) ^ 1887912185;
                                            i161 = 1424372341;
                                        } else {
                                            m69819 = C2105.m6981("۫֫") ^ i158;
                                            i160 = ((m69819 ^ i159) * 29151) ^ 909046173;
                                            i161 = -1462486651;
                                        }
                                }
                                return;
                            }
                        }
                    });
                    C1711.m5727(c1925816, checkedTextView);
                    ViewOnClickListenerC1958.m6441(c1925816, i109, r82);
                    C5695.m16035(c1925816, i93, r82);
                    DialogInterfaceC0206 m11213 = C3683.m11213(c1925816);
                    C5088.m14637(m11213);
                    C4159.m12564(C21923.m49343(m11213), new ViewOnClickListenerC17541(viewOnClickListenerC2040, checkedTextView, m11213));
                    return z10;
                case 980490011:
                case 1815256060:
                    C1420.m4913();
                    if (C0964.f3626 != 0) {
                        i9 = i109;
                        obj17 = r82;
                        i10 = i107;
                        c29782 = c29788;
                        editText4 = editText12;
                        editText3 = editText13;
                        c192585 = c1925817;
                        sArr2 = sArr27;
                        sArr3 = sArr28;
                        i11 = i104;
                        sArr4 = sArr29;
                        i12 = i106;
                        z2 = z10;
                        c34302 = c34308;
                        c192584 = c1925816;
                        i14 = i94;
                        interfaceC12344 = interfaceC123445;
                        view2 = view5;
                        i15 = i105;
                        i13 = i93;
                        i29 = i98;
                        obj16 = obj17;
                        int m256613222 = (C0630.m2566("ۡ۟") ^ i89) * 39;
                        i72 = ((m256613222 ^ i88) * (-20451)) ^ 418724641;
                        i91 = m256613222 ^ (-1248307279);
                        interfaceC123445 = interfaceC12344;
                        i98 = i29;
                        i105 = i15;
                        i106 = i12;
                        i93 = i13;
                        z10 = z2;
                        c34308 = c34302;
                        i94 = i14;
                        i107 = i10;
                        sArr29 = sArr4;
                        sArr28 = sArr3;
                        r82 = obj16;
                        c29788 = c29782;
                        editText12 = editText4;
                        sArr27 = sArr2;
                        i104 = i11;
                        view5 = view2;
                        c1925817 = c192585;
                        c1925816 = c192584;
                        editText13 = editText3;
                        i90 = i72;
                        i109 = i9;
                    } else {
                        m25664 = C0630.m2566("ۢۛ") ^ i88;
                        i85 = ((m25664 ^ i89) * 28963) ^ 932482543;
                        i86 = -143947374;
                        i91 = m25664 ^ i86;
                        i90 = i85;
                    }
                case 1741112963:
                case 2141932615:
                    C11340.m28031();
                    if (C3746.f11829 <= 0) {
                        m25664 = (C2105.m6981("ܶ۫") ^ i89) * (-23);
                        i85 = ((m25664 ^ i88) * 789) ^ (-721460596);
                        i86 = 268548721;
                        i91 = m25664 ^ i86;
                        i90 = i85;
                    }
                    m25664 = C0630.m2566("ۢۛ") ^ i88;
                    i85 = ((m25664 ^ i89) * 28963) ^ 932482543;
                    i86 = -143947374;
                    i91 = m25664 ^ i86;
                    i90 = i85;
                default:
                    viewOnClickListenerC2040.f6825.m52054(r82);
                    viewOnClickListenerC2040.f6825.m52058(z10);
                    return z10;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m6678(C4841 c4841) {
        String str;
        String str2;
        String str3;
        short[] sArr;
        String str4;
        String str5;
        PackageInfo packageInfo;
        int i;
        InterfaceC12344 interfaceC12344;
        String str6;
        String str7;
        int i2;
        InterfaceC12344 interfaceC123442;
        int i3;
        InterfaceC12344 interfaceC123443;
        short[] sArr2;
        int m2566;
        int i4;
        int m25662;
        int i5;
        int i6;
        int m25663;
        int i7;
        int i8;
        int m25664;
        int i9;
        int i10;
        int i11;
        String str8;
        String str9;
        String str10;
        PackageInfo packageInfo2;
        int m6981;
        PackageInfo packageInfo3;
        int i12;
        int i13 = 0;
        int i14 = 1676824796;
        int i15 = ViewOnClickListenerC1958.f6529;
        int i16 = C3537.f11231;
        int m25665 = C0630.m2566("ۜۗ") ^ i16;
        int i17 = ((m25665 ^ i15) * 21577) ^ (-1785070546);
        int i18 = m25665 ^ 1289037395;
        String str11 = null;
        String str12 = null;
        PackageInfo packageInfo4 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        short[] sArr3 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i19 = 0;
        int i20 = 0;
        InterfaceC12344 interfaceC123444 = null;
        short s = 0;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i21 = 0;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        short[] sArr8 = null;
        int i22 = 0;
        while (true) {
            i14 = i18 ^ (i17 & (((i14 ^ i15) * (-15693)) >> 31));
            switch (i14) {
                case -2121774333:
                case 1652183989:
                    str = str16;
                    str2 = str17;
                    str3 = str18;
                    sArr = sArr5;
                    str4 = str14;
                    str7 = str11;
                    str5 = str21;
                    packageInfo = packageInfo4;
                    i2 = i19;
                    interfaceC123442 = interfaceC123444;
                    i21 = 32649;
                    int m25666 = C0630.m2566("ۨ۬") ^ i15;
                    i17 = ((m25666 ^ i16) * 13153) ^ (-1592813807);
                    i18 = m25666 ^ 679281464;
                    interfaceC123444 = interfaceC123442;
                    i19 = i2;
                    str11 = str7;
                    str14 = str4;
                    packageInfo4 = packageInfo;
                    str21 = str5;
                    str16 = str;
                    sArr5 = sArr;
                    str18 = str3;
                    str17 = str2;
                case -2110508101:
                case -262303070:
                    return C4263.m12812(str14, str15, C7106.m19110(sArr7, 338, 1, i21));
                case -1951582242:
                case 1210685226:
                    str13 = C3683.m11219(str22, C4117.m12355(sArr6, i19, i20, i21), str19);
                    i22 = 200;
                    if (C1711.m5741(str13) > 200) {
                        m25662 = (C0630.m2566("ۙۢ") + i16) * (-103);
                        i5 = ((m25662 ^ i15) * (-24543)) ^ 1599371744;
                        i6 = 1395543751;
                        i18 = m25662 ^ i6;
                        i17 = i5;
                    } else {
                        str20 = str13;
                        m25662 = C2105.m6981("ۨۙ") ^ i15;
                        i5 = ((m25662 ^ i16) * 22877) ^ 974230171;
                        i6 = -1904618717;
                        i18 = m25662 ^ i6;
                        i17 = i5;
                    }
                case -1653804702:
                case -834811398:
                    str = str16;
                    str2 = str17;
                    str3 = str18;
                    sArr = sArr5;
                    str4 = str14;
                    str5 = str21;
                    packageInfo = packageInfo4;
                    i = i19;
                    String str24 = str11;
                    interfaceC12344 = interfaceC123444;
                    str6 = str24;
                    s = f6807[280];
                    i13 = s * s;
                    if (RunnableC1108.f4040) {
                        int m69812 = C2105.m6981("ۘۛ") ^ i16;
                        i17 = ((m69812 ^ i15) * 13147) ^ 1511051989;
                        i18 = m69812 ^ 12720748;
                        str14 = str4;
                        i19 = i;
                        str16 = str;
                        packageInfo4 = packageInfo;
                        str21 = str5;
                        sArr5 = sArr;
                        str18 = str3;
                        str17 = str2;
                        InterfaceC12344 interfaceC123445 = interfaceC12344;
                        str11 = str6;
                        interfaceC123444 = interfaceC123445;
                    } else {
                        i19 = i;
                        str11 = str6;
                        interfaceC123444 = interfaceC12344;
                        int m69813 = C2105.m6981("֫ܰ") ^ i15;
                        i18 = m69813 ^ 758706952;
                        i17 = ((m69813 ^ i16) * (-28899)) ^ (-1795547294);
                        str14 = str4;
                        packageInfo4 = packageInfo;
                        str21 = str5;
                        str16 = str;
                        sArr5 = sArr;
                        str18 = str3;
                        str17 = str2;
                    }
                case -1433677308:
                case 536856875:
                    String str25 = str16;
                    PackageInfo packageInfo5 = packageInfo4;
                    int i23 = i19;
                    String str26 = str14;
                    String str27 = str18;
                    short[] sArr9 = sArr5;
                    String str28 = str21;
                    String m50602 = C22628.m50602(f6807, 314, 3, i21);
                    if (C21923.f70183 != 0) {
                        m25664 = (C2105.m6981("ᩴ۫") + i15) * (-127);
                        i9 = ((m25664 ^ i16) * 1739) ^ (-1075957067);
                        i10 = -343301789;
                    } else {
                        m25664 = (C0630.m2566("۫۟") ^ i16) * 27;
                        i9 = ((m25664 ^ i15) * (-22301)) ^ 1330038357;
                        i10 = 1962626922;
                    }
                    i18 = m25664 ^ i10;
                    i17 = i9;
                    str14 = str26;
                    str16 = str25;
                    str17 = m50602;
                    i19 = i23;
                    packageInfo4 = packageInfo5;
                    str21 = str28;
                    sArr5 = sArr9;
                    str18 = str27;
                case -1421940403:
                case 1326074036:
                    if (C3019.f9544 < 0) {
                        str8 = str16;
                        packageInfo2 = packageInfo4;
                        i11 = i19;
                        str9 = str14;
                        str10 = str17;
                        m6981 = (C0630.m2566("ܺ۟") ^ i16) * 3;
                        packageInfo3 = packageInfo2;
                        i17 = ((m6981 ^ i15) * (-12927)) ^ 2060651844;
                        i12 = 55052542;
                        i18 = m6981 ^ i12;
                        i19 = i11;
                        packageInfo4 = packageInfo3;
                        str17 = str10;
                        str14 = str9;
                        str16 = str8;
                    } else {
                        m25662 = C0630.m2566("ۚᩳ") ^ i16;
                        i5 = ((m25662 ^ i15) * (-15057)) ^ 936741017;
                        i6 = 931444785;
                        i18 = m25662 ^ i6;
                        i17 = i5;
                    }
                case -1178832701:
                case 2086566411:
                    str = str16;
                    str2 = str17;
                    str3 = str18;
                    sArr = sArr5;
                    str4 = str14;
                    str5 = str21;
                    packageInfo = packageInfo4;
                    i3 = i19;
                    interfaceC123444 = ApplicationC20075.f65008;
                    str11 = C2272.m7507(f6807, 281, 19, i21);
                    sArr3 = f6807;
                    if (AbstractC2021.f6743 > 0) {
                        int m25667 = C0630.m2566("ۡۜ") ^ i16;
                        i17 = ((m25667 ^ i15) * 15227) ^ (-1928230920);
                        i18 = m25667 ^ (-458306246);
                        str14 = str4;
                        i19 = i3;
                        str16 = str;
                        packageInfo4 = packageInfo;
                        str21 = str5;
                        sArr5 = sArr;
                        str18 = str3;
                        str17 = str2;
                    }
                    i19 = i3;
                    int m698132 = C2105.m6981("֫ܰ") ^ i15;
                    i18 = m698132 ^ 758706952;
                    i17 = ((m698132 ^ i16) * (-28899)) ^ (-1795547294);
                    str14 = str4;
                    packageInfo4 = packageInfo;
                    str21 = str5;
                    str16 = str;
                    sArr5 = sArr;
                    str18 = str3;
                    str17 = str2;
                case -956418419:
                case 1986382067:
                    C7106.m19120();
                    return null;
                case -914212806:
                case -780415707:
                    str = str16;
                    str2 = str17;
                    str3 = str18;
                    sArr = sArr5;
                    str4 = str14;
                    String str29 = str11;
                    str5 = str21;
                    packageInfo = packageInfo4;
                    i = i19;
                    interfaceC12344 = interfaceC123444;
                    str6 = str29;
                    short s2 = s;
                    if ((s2 * 6170) - (i13 + 9517225) > 0) {
                        m25663 = C0630.m2566("ۧۚ") ^ i16;
                        i7 = ((m25663 ^ i15) * 19021) ^ 920485088;
                        i8 = -1279032532;
                    } else {
                        m25663 = C0630.m2566("֡ۤ") ^ i15;
                        i7 = ((m25663 ^ i16) * (-21439)) ^ 1836656193;
                        i8 = 1489298077;
                    }
                    i18 = m25663 ^ i8;
                    s = s2;
                    i17 = i7;
                    str14 = str4;
                    i19 = i;
                    str16 = str;
                    packageInfo4 = packageInfo;
                    str21 = str5;
                    sArr5 = sArr;
                    str18 = str3;
                    str17 = str2;
                    InterfaceC12344 interfaceC1234452 = interfaceC12344;
                    str11 = str6;
                    interfaceC123444 = interfaceC1234452;
                case -853692804:
                case 1613595024:
                    str20 = C1005.m3509(str13, 0, i22);
                    m25662 = C2105.m6981("ۨۙ") ^ i15;
                    i5 = ((m25662 ^ i16) * 22877) ^ 974230171;
                    i6 = -1904618717;
                    i18 = m25662 ^ i6;
                    i17 = i5;
                case -631591963:
                case -605406302:
                    str23 = C5695.m16034(f6807, 323, 12, i21);
                    sArr8 = f6807;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        str = str16;
                        str2 = str17;
                        str3 = str18;
                        sArr = sArr5;
                        str4 = str14;
                        str5 = str21;
                        packageInfo = packageInfo4;
                        int m6981322 = C2105.m6981("֫ܰ") ^ i15;
                        i18 = m6981322 ^ 758706952;
                        i17 = ((m6981322 ^ i16) * (-28899)) ^ (-1795547294);
                        str14 = str4;
                        packageInfo4 = packageInfo;
                        str21 = str5;
                        str16 = str;
                        sArr5 = sArr;
                        str18 = str3;
                        str17 = str2;
                    } else {
                        m25662 = (i15 - C0630.m2566("ۤ۫")) * (-43);
                        i5 = ((m25662 ^ i16) * (-24469)) ^ (-998365626);
                        i6 = -1557318947;
                        i18 = m25662 ^ i6;
                        i17 = i5;
                    }
                case -617923377:
                case 188176711:
                    str4 = str14;
                    String str30 = str17;
                    str3 = str18;
                    sArr = sArr5;
                    str5 = str21;
                    packageInfo = packageInfo4;
                    i3 = i19;
                    short[] sArr10 = sArr4;
                    str2 = str30;
                    String str31 = str12;
                    String m11219 = C3683.m11219(str31, C0382.m1840(sArr10, 311, 3, i21), c4841.m14084());
                    if (C0237.f1507 != 0) {
                        str12 = str31;
                        sArr4 = sArr10;
                        str = m11219;
                        i19 = i3;
                        int m69813222 = C2105.m6981("֫ܰ") ^ i15;
                        i18 = m69813222 ^ 758706952;
                        i17 = ((m69813222 ^ i16) * (-28899)) ^ (-1795547294);
                        str14 = str4;
                        packageInfo4 = packageInfo;
                        str21 = str5;
                        str16 = str;
                        sArr5 = sArr;
                        str18 = str3;
                        str17 = str2;
                    } else {
                        int m69814 = C2105.m6981("᩺ۨ") ^ i15;
                        i18 = m69814 ^ (-22327907);
                        i17 = ((m69814 ^ i16) * (-12065)) ^ 543436770;
                        sArr4 = sArr10;
                        i19 = i3;
                        packageInfo4 = packageInfo;
                        str21 = str5;
                        sArr5 = sArr;
                        str18 = str3;
                        str17 = str2;
                        str12 = str31;
                        str14 = str4;
                        str16 = m11219;
                    }
                case -432186718:
                case 686030375:
                    if (C2272.f7362) {
                        interfaceC123443 = interfaceC123444;
                        str = str16;
                        str2 = str17;
                        str3 = str18;
                        sArr = sArr5;
                        sArr2 = sArr3;
                        str4 = str14;
                        str7 = str11;
                        str5 = str21;
                        packageInfo = packageInfo4;
                        i2 = i19;
                        m2566 = C0630.m2566("ܶ᩷") ^ i15;
                        interfaceC123442 = interfaceC123443;
                        i17 = ((m2566 ^ i16) * 17663) ^ (-1755190196);
                        i4 = 1182480921;
                        i18 = m2566 ^ i4;
                        sArr3 = sArr2;
                        interfaceC123444 = interfaceC123442;
                        i19 = i2;
                        str11 = str7;
                        str14 = str4;
                        packageInfo4 = packageInfo;
                        str21 = str5;
                        str16 = str;
                        sArr5 = sArr;
                        str18 = str3;
                        str17 = str2;
                    }
                    str = str16;
                    str2 = str17;
                    str3 = str18;
                    sArr = sArr5;
                    str4 = str14;
                    str5 = str21;
                    packageInfo = packageInfo4;
                    int m698132222 = C2105.m6981("֫ܰ") ^ i15;
                    i18 = m698132222 ^ 758706952;
                    i17 = ((m698132222 ^ i16) * (-28899)) ^ (-1795547294);
                    str14 = str4;
                    packageInfo4 = packageInfo;
                    str21 = str5;
                    str16 = str;
                    sArr5 = sArr;
                    str18 = str3;
                    str17 = str2;
                case -149577344:
                case 2031870426:
                    C1294.m4372();
                    str8 = str16;
                    packageInfo2 = packageInfo4;
                    i11 = i19;
                    str9 = str14;
                    str10 = str17;
                    m6981 = (C0630.m2566("ܺ۟") ^ i16) * 3;
                    packageInfo3 = packageInfo2;
                    i17 = ((m6981 ^ i15) * (-12927)) ^ 2060651844;
                    i12 = 55052542;
                    i18 = m6981 ^ i12;
                    i19 = i11;
                    packageInfo4 = packageInfo3;
                    str17 = str10;
                    str14 = str9;
                    str16 = str8;
                case 216527817:
                case 990730518:
                    str = str16;
                    str2 = str17;
                    str3 = str18;
                    sArr = sArr5;
                    str4 = str14;
                    str7 = str11;
                    str5 = str21;
                    packageInfo = packageInfo4;
                    i2 = i19;
                    interfaceC123442 = interfaceC123444;
                    i21 = 54846;
                    int m256662 = C0630.m2566("ۨ۬") ^ i15;
                    i17 = ((m256662 ^ i16) * 13153) ^ (-1592813807);
                    i18 = m256662 ^ 679281464;
                    interfaceC123444 = interfaceC123442;
                    i19 = i2;
                    str11 = str7;
                    str14 = str4;
                    packageInfo4 = packageInfo;
                    str21 = str5;
                    str16 = str;
                    sArr5 = sArr;
                    str18 = str3;
                    str17 = str2;
                case 890707307:
                case 1913648529:
                    str = str16;
                    str2 = str17;
                    str3 = str18;
                    sArr = sArr5;
                    str4 = str14;
                    str5 = str21;
                    packageInfo = packageInfo4;
                    i2 = i19;
                    short[] sArr11 = sArr3;
                    String m12355 = C4117.m12355(sArr11, 300, 11, i21);
                    interfaceC123443 = interfaceC123444;
                    sArr2 = sArr11;
                    str7 = str11;
                    str12 = C0964.m3407(interfaceC123443, str7, m12355);
                    sArr4 = f6807;
                    if (C4263.f13799 > 0) {
                        interfaceC123442 = interfaceC123443;
                        m2566 = (C0630.m2566("ۡ᩺") ^ i15) * 49;
                        i17 = ((m2566 ^ i16) * (-9451)) ^ (-1758596164);
                        i4 = 301346665;
                        i18 = m2566 ^ i4;
                        sArr3 = sArr2;
                        interfaceC123444 = interfaceC123442;
                        i19 = i2;
                        str11 = str7;
                        str14 = str4;
                        packageInfo4 = packageInfo;
                        str21 = str5;
                        str16 = str;
                        sArr5 = sArr;
                        str18 = str3;
                        str17 = str2;
                    }
                    m2566 = C0630.m2566("ܶ᩷") ^ i15;
                    interfaceC123442 = interfaceC123443;
                    i17 = ((m2566 ^ i16) * 17663) ^ (-1755190196);
                    i4 = 1182480921;
                    i18 = m2566 ^ i4;
                    sArr3 = sArr2;
                    interfaceC123444 = interfaceC123442;
                    i19 = i2;
                    str11 = str7;
                    str14 = str4;
                    packageInfo4 = packageInfo;
                    str21 = str5;
                    str16 = str;
                    sArr5 = sArr;
                    str18 = str3;
                    str17 = str2;
                case 1009670306:
                case 1784824128:
                    i11 = i19;
                    str8 = str16;
                    str9 = str14;
                    str10 = str17;
                    str18 = C3683.m11219(str8, str10, c4841.f15292);
                    packageInfo2 = c4841.f15288;
                    str21 = String.valueOf(packageInfo2.versionName);
                    sArr5 = f6807;
                    if (C1294.f4556 < 0) {
                        m6981 = (C2105.m6981("ᩴܺ") ^ i16) * 33;
                        packageInfo3 = packageInfo2;
                        i17 = ((m6981 ^ i15) * 3679) ^ 1769099375;
                        i12 = 1175198526;
                        i18 = m6981 ^ i12;
                        i19 = i11;
                        packageInfo4 = packageInfo3;
                        str17 = str10;
                        str14 = str9;
                        str16 = str8;
                    }
                    m6981 = (C0630.m2566("ܺ۟") ^ i16) * 3;
                    packageInfo3 = packageInfo2;
                    i17 = ((m6981 ^ i15) * (-12927)) ^ 2060651844;
                    i12 = 55052542;
                    i18 = m6981 ^ i12;
                    i19 = i11;
                    packageInfo4 = packageInfo3;
                    str17 = str10;
                    str14 = str9;
                    str16 = str8;
                case 1131225437:
                case 1163548934:
                    str15 = C1047.m3603(f6807, 336, 2, i21);
                    sArr7 = f6807;
                    m25662 = C0630.m2566("۟᩸") ^ i15;
                    i5 = ((m25662 ^ i16) * 22631) ^ (-1156426875);
                    i6 = -1535190548;
                    i18 = m25662 ^ i6;
                    i17 = i5;
                case 1294764757:
                case 2097498029:
                    str14 = C0964.m3408(str20, str23, C0050.m948(sArr8, 335, 1, i21));
                    if (!C3663.f11553) {
                        m25662 = (i16 - C2105.m6981("ۧۛ")) * 3;
                        i5 = ((m25662 ^ i15) * (-21807)) ^ 1070758206;
                        i6 = 812832612;
                        i18 = m25662 ^ i6;
                        i17 = i5;
                    }
                    m25662 = C0630.m2566("ۚᩳ") ^ i16;
                    i5 = ((m25662 ^ i15) * (-15057)) ^ 936741017;
                    i6 = 931444785;
                    i18 = m25662 ^ i6;
                    i17 = i5;
                case 1326252978:
                case 1346965688:
                    PackageInfo packageInfo6 = packageInfo4;
                    i2 = i19;
                    short[] sArr12 = sArr5;
                    String m5177 = C1504.m5177(sArr12, 317, 3, i21);
                    String str32 = str18;
                    sArr = sArr12;
                    String str33 = str21;
                    String m2443 = RunnableC0588.m2443(str32, m5177, str33);
                    if (C0964.f3626 != 0) {
                        str5 = str33;
                        packageInfo = packageInfo6;
                        interfaceC123443 = interfaceC123444;
                        str2 = str17;
                        sArr2 = sArr3;
                        str3 = str32;
                        str22 = m2443;
                        str = str16;
                        str4 = str14;
                        str7 = str11;
                        m2566 = C0630.m2566("ܶ᩷") ^ i15;
                        interfaceC123442 = interfaceC123443;
                        i17 = ((m2566 ^ i16) * 17663) ^ (-1755190196);
                        i4 = 1182480921;
                        i18 = m2566 ^ i4;
                        sArr3 = sArr2;
                        interfaceC123444 = interfaceC123442;
                        i19 = i2;
                        str11 = str7;
                        str14 = str4;
                        packageInfo4 = packageInfo;
                        str21 = str5;
                        str16 = str;
                        sArr5 = sArr;
                        str18 = str3;
                        str17 = str2;
                    } else {
                        int m25668 = (C0630.m2566("۟ᩳ") ^ i15) * (-19);
                        int i24 = ((m25668 ^ i16) * (-27817)) ^ (-1747031999);
                        i18 = m25668 ^ (-1690301559);
                        str21 = str33;
                        sArr5 = sArr;
                        str18 = str32;
                        str22 = m2443;
                        i17 = i24;
                        i19 = i2;
                        packageInfo4 = packageInfo6;
                    }
                case 1476719332:
                case 1512137102:
                    PackageInfo packageInfo7 = packageInfo4;
                    str19 = C0050.m935(packageInfo7.versionCode);
                    sArr6 = f6807;
                    i20 = 3;
                    if (C0630.f2410 <= 0) {
                        str = str16;
                        str2 = str17;
                        str3 = str18;
                        sArr = sArr5;
                        i19 = 320;
                        str4 = str14;
                        str5 = str21;
                        packageInfo = packageInfo7;
                        int m6981322222 = C2105.m6981("֫ܰ") ^ i15;
                        i18 = m6981322222 ^ 758706952;
                        i17 = ((m6981322222 ^ i16) * (-28899)) ^ (-1795547294);
                        str14 = str4;
                        packageInfo4 = packageInfo;
                        str21 = str5;
                        str16 = str;
                        sArr5 = sArr;
                        str18 = str3;
                        str17 = str2;
                    } else {
                        int m25669 = (C0630.m2566("᩵᩻") ^ i16) * 15;
                        i18 = m25669 ^ (-1035674614);
                        packageInfo4 = packageInfo7;
                        i17 = ((m25669 ^ i15) * 3439) ^ (-213677415);
                        i19 = 320;
                    }
                default:
                    if (C11340.f33930 >= 0) {
                        str8 = str16;
                        packageInfo2 = packageInfo4;
                        i11 = i19;
                        str9 = str14;
                        str10 = str17;
                        m6981 = (C0630.m2566("ܺ۟") ^ i16) * 3;
                        packageInfo3 = packageInfo2;
                        i17 = ((m6981 ^ i15) * (-12927)) ^ 2060651844;
                        i12 = 55052542;
                        i18 = m6981 ^ i12;
                        i19 = i11;
                        packageInfo4 = packageInfo3;
                        str17 = str10;
                        str14 = str9;
                        str16 = str8;
                    } else {
                        str = str16;
                        str2 = str17;
                        str3 = str18;
                        sArr = sArr5;
                        str4 = str14;
                        str5 = str21;
                        packageInfo = packageInfo4;
                        int m69813222222 = C2105.m6981("֫ܰ") ^ i15;
                        i18 = m69813222222 ^ 758706952;
                        i17 = ((m69813222222 ^ i16) * (-28899)) ^ (-1795547294);
                        str14 = str4;
                        packageInfo4 = packageInfo;
                        str21 = str5;
                        str16 = str;
                        sArr5 = sArr;
                        str18 = str3;
                        str17 = str2;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (l.C11340.f33930 >= 0) goto L9;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m6692(l.ViewOnClickListenerC2040 r19) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6692(l.֫᩵᩷):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00ba, code lost:
    
        if (l.C7106.f21815 != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        if (l.C3432.f10845 < 0) goto L20;
     */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.String, l.ܰᩴ᩷] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m6695() {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6695():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6651(ViewOnClickListenerC2040 viewOnClickListenerC2040, long j, DialogInterfaceC0206 dialogInterfaceC0206) {
        int i = 594992874;
        int i2 = C1420.f5096;
        int i3 = C0050.f910;
        int m2566 = C0630.m2566("ۤ֫") ^ i3;
        int i4 = ((m2566 ^ i2) * (-313)) ^ (-878327481);
        int i5 = 197200030;
        while (true) {
            i = ((((i ^ i2) * (-11371)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2116601933:
                case 1306272634:
                    C0714.m2805();
                    m2566 = C2105.m6981("ۨܿ") ^ i3;
                    i4 = ((m2566 ^ i2) * 22559) ^ (-2055112715);
                    i5 = -2096798075;
                case -1950448552:
                case 35377682:
                    C10986.m27293(j);
                    if (viewOnClickListenerC2040.f6828 == dialogInterfaceC0206) {
                        m2566 = C0630.m2566("ܰۘ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-29023)) ^ (-117946763);
                        i5 = 1942951216;
                    } else {
                        m2566 = (i2 - C2105.m6981("֫ۚ")) * 67;
                        i4 = ((m2566 ^ i3) * 19001) ^ (-1465939454);
                        i5 = 118632039;
                    }
                case -1919564729:
                case -1822225908:
                    if (AbstractC2021.f6743 <= 0) {
                        m2566 = C0630.m2566("ۙ᩸") ^ i2;
                        i4 = ((m2566 ^ i3) * (-26671)) ^ 476922654;
                        i5 = 721371880;
                    } else {
                        m2566 = (C2105.m6981("ۨܶ") ^ i2) * 87;
                        i4 = ((m2566 ^ i3) * 16291) ^ (-812002376);
                        i5 = -1398866020;
                    }
                case -1888817709:
                case -1870076815:
                    viewOnClickListenerC2040.f6828 = null;
                    m2566 = (i2 - C2105.m6981("֫ۚ")) * 67;
                    i4 = ((m2566 ^ i3) * 19001) ^ (-1465939454);
                    i5 = 118632039;
                case -1658274471:
                case 10613861:
                    if (C0714.f2697 >= 0) {
                        m2566 = C0630.m2566("ۙ᩸") ^ i2;
                        i4 = ((m2566 ^ i3) * (-26671)) ^ 476922654;
                        i5 = 721371880;
                    } else {
                        m2566 = (C0630.m2566("۫ܺ") + i3) * 83;
                        i4 = ((m2566 ^ i2) * (-10389)) ^ (-953283563);
                        i5 = 2058573058;
                    }
                case -1523216886:
                case -354108641:
                    if (C4117.f13076 <= 0) {
                        m2566 = C2105.m6981("ܰ۠") ^ i2;
                        i4 = ((m2566 ^ i3) * (-22491)) ^ (-1159011390);
                        i5 = 236330334;
                    } else {
                        m2566 = C0630.m2566("ۙ᩸") ^ i2;
                        i4 = ((m2566 ^ i3) * (-26671)) ^ 476922654;
                        i5 = 721371880;
                    }
                case -1523143798:
                case 640475397:
                    if (C2272.m7503()) {
                        m2566 = C2105.m6981("ۨܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * 22559) ^ (-2055112715);
                        i5 = -2096798075;
                    } else {
                        m2566 = C0630.m2566("ۛ۠") ^ i3;
                        i4 = ((m2566 ^ i2) * 12563) ^ (-1391438359);
                        i5 = 317627944;
                    }
                case -1313618419:
                case 10402613:
                    if (C1711.m5736() <= 0) {
                        m2566 = (C0630.m2566("ۚ᩺") + i2) * (-27);
                        i4 = ((m2566 ^ i3) * 7557) ^ 992813150;
                        i5 = 2092182478;
                    } else {
                        m2566 = C2105.m6981("۬ۚ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-26953)) ^ (-866137071);
                        i5 = -1432352246;
                    }
                case -1158308312:
                case -542000690:
                    break;
                case -949443907:
                case 1765111747:
                    if (C3663.m11168() >= 0) {
                        m2566 = C2105.m6981("ܰ۠") ^ i2;
                        i4 = ((m2566 ^ i3) * (-22491)) ^ (-1159011390);
                        i5 = 236330334;
                    } else {
                        m2566 = (C0630.m2566("ۘۡ") + i3) * (-93);
                        i4 = ((m2566 ^ i2) * (-3771)) ^ (-1754027006);
                        i5 = 1412743293;
                    }
                case -840575235:
                case -144388462:
                    if (C3683.f11629 >= 0) {
                        m2566 = C2105.m6981("ۨܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * 22559) ^ (-2055112715);
                        i5 = -2096798075;
                    } else {
                        m2566 = C2105.m6981("ܽ᩶") ^ i2;
                        i4 = ((m2566 ^ i3) * (-23055)) ^ 820516506;
                        i5 = 1131140392;
                    }
                case -378925840:
                case -205504154:
                    if (C3432.f10845 >= 0) {
                        m2566 = C2105.m6981("ۨܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * 22559) ^ (-2055112715);
                        i5 = -2096798075;
                    } else {
                        m2566 = (C0630.m2566("ۚ֨") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m2566 ^ i2) * (-25121)) ^ (-908424506);
                        i5 = -1603258359;
                    }
                case -297052154:
                case 984924961:
                    if (C1504.m5179()) {
                        m2566 = (C0630.m2566("᩺ۢ") ^ i3) * (-83);
                        i4 = ((m2566 ^ i2) * 2229) ^ (-1400687625);
                        i5 = 381673298;
                    } else {
                        m2566 = C0630.m2566("ۙ᩸") ^ i2;
                        i4 = ((m2566 ^ i3) * (-26671)) ^ 476922654;
                        i5 = 721371880;
                    }
                case -164878965:
                case 1669335297:
                    if (C2105.f7037 == 0) {
                        m2566 = C2105.m6981("ۨܿ") ^ i3;
                        i4 = ((m2566 ^ i2) * 22559) ^ (-2055112715);
                        i5 = -2096798075;
                    } else {
                        m2566 = C2105.m6981("ܰ۠") ^ i2;
                        i4 = ((m2566 ^ i3) * (-22491)) ^ (-1159011390);
                        i5 = 236330334;
                    }
                case 612349512:
                case 1564757477:
                    if (C1005.f3721) {
                        m2566 = (i2 - C2105.m6981("ۤܳ")) * (-39);
                        i4 = ((m2566 ^ i3) * (-9755)) ^ (-479700687);
                        i5 = -959624326;
                    } else {
                        m2566 = (C0630.m2566("ۚ᩺") + i2) * (-27);
                        i4 = ((m2566 ^ i3) * 7557) ^ 992813150;
                        i5 = 2092182478;
                    }
                case 960131550:
                case 1838122053:
                    if (C7106.f21815 != 0) {
                        m2566 = C0630.m2566("ۙ᩸") ^ i2;
                        i4 = ((m2566 ^ i3) * (-26671)) ^ 476922654;
                        i5 = 721371880;
                    } else {
                        m2566 = C0630.m2566("ܽ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * (-30413)) ^ 62042958;
                        i5 = 1739950738;
                    }
                case 1412538232:
                case 1794598023:
                    if (C1916.f6442) {
                        m2566 = (C0630.m2566("ܶۙ") + i3) * (-69);
                        i4 = ((m2566 ^ i2) * 16593) ^ (-986363228);
                        i5 = 1828685378;
                    } else {
                        m2566 = (C0630.m2566("ۚ᩺") + i2) * (-27);
                        i4 = ((m2566 ^ i3) * 7557) ^ 992813150;
                        i5 = 2092182478;
                    }
                default:
                    C2272.m7503();
                    C2520.m8026();
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0060, code lost:
    
        if (l.C3663.f11553 != false) goto L14;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m6655(l.ViewOnClickListenerC2040 r20, l.C4841 r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6655(l.֫᩵᩷, l.ۙᩴ᩷, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (l.RunnableC3474.f10992 > 0) goto L17;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6679(l.ViewOnClickListenerC2040 r28) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6679(l.֫᩵᩷):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b6, code lost:
    
        if (l.C0714.f2697 < 0) goto L10;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m6654(l.ViewOnClickListenerC2040 r31, l.C4841 r32, android.content.DialogInterface r33, int r34) {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6654(l.֫᩵᩷, l.ۙᩴ᩷, android.content.DialogInterface, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (l.C0630.f2410 > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        r25 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        if (l.C4263.m12819() >= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        if (l.C2126.f7087 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        r25 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        if (l.C1711.f5919 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b7, code lost:
    
        if (l.C11340.f33930 < 0) goto L27;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6662(l.C19119 r27) {
        /*
            Method dump skipped, instructions count: 1630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6662(l.᩵֡ᩴ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
    
        if (l.C2126.f7087 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (l.C3746.f11829 <= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0067, code lost:
    
        if (l.ViewOnClickListenerC1958.f6529 > 0) goto L70;
     */
    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.AbstractC15440 m6667() {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC2040.m6667():l.ܶ᩵ܿ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public void m6674() {
        C3430 c3430 = null;
        C20364 c20364 = null;
        boolean z = false;
        InterfaceC10798 interfaceC10798 = null;
        C20364 c203642 = null;
        InterfaceC10798 interfaceC107982 = null;
        C3430 c34302 = null;
        C20364 c203643 = null;
        C3430 c34303 = null;
        int i = 403230067;
        int i2 = RunnableC1937.f6483;
        int i3 = C3245.f10203;
        int m2566 = (i3 - C0630.m2566("᩷֫")) * (-27);
        int i4 = ((m2566 ^ i2) * 9961) ^ (-1001847320);
        int i5 = 1399666322;
        while (true) {
            i = ((((i ^ i2) * (-29043)) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2073693307:
                case -977867167:
                    interfaceC107982 = c203642.f65737.listIterator(z ? 1 : 0);
                    m2566 = C0630.m2566("ۜ۠") ^ i2;
                    i4 = ((m2566 ^ i3) * 16793) ^ 136650279;
                    i5 = 943205439;
                case -1912740638:
                case -1149300281:
                    C4616.m13552();
                    m2566 = (C2105.m6981("ۚۚ") + i2) * 71;
                    i4 = ((m2566 ^ i3) * (-3245)) ^ (-289766371);
                    i5 = 1603491165;
                case -1747793861:
                case -807515183:
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = C2105.m6981("ۤۗ") ^ i3;
                        i4 = ((m2566 ^ i2) * 16283) ^ 354558728;
                        i5 = -715701882;
                    } else {
                        m2566 = (C0630.m2566("۫֫") ^ i3) * 29;
                        i4 = ((m2566 ^ i2) * 19689) ^ (-862686636);
                        i5 = -35718420;
                    }
                case -1733794109:
                case -1531502535:
                    c203643 = c34302.f10837;
                    if (C1916.f6442) {
                        m2566 = (C2105.m6981("֨᩻") ^ i3) * 65;
                        i4 = ((m2566 ^ i2) * 6255) ^ (-299598009);
                        i5 = 596310834;
                    } else {
                        m2566 = C0630.m2566("ܶۖ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29139)) ^ 1955011439;
                        i5 = -1036381274;
                    }
                case -1550594760:
                case -1521920001:
                    c34303 = this.f6815;
                    c34303.f10838 = z ? 1 : 0;
                    if (C2520.m8026()) {
                        m2566 = C2105.m6981("ۤۗ") ^ i3;
                        i4 = ((m2566 ^ i2) * 16283) ^ 354558728;
                        i5 = -715701882;
                    } else {
                        m2566 = (C0630.m2566("ۢܿ") ^ i2) * 41;
                        i4 = ((m2566 ^ i3) * (-20209)) ^ 1237739064;
                        i5 = 169186016;
                    }
                case -1489676834:
                case 1464732335:
                    ViewOnClickListenerC1958.m6434(c34303.f10837);
                    if (C4075.m12263() <= 0) {
                        m2566 = C0630.m2566("ᩴܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-8327)) ^ (-1258174747);
                        i5 = -1906907367;
                    } else {
                        m2566 = (i3 - C2105.m6981("۫ܰ")) * 85;
                        i4 = ((m2566 ^ i2) * (-26141)) ^ (-466359232);
                        i5 = 934708730;
                    }
                case -1445255023:
                case 691113696:
                    if (C1773.m5910(interfaceC107982)) {
                        m2566 = (C0630.m2566("ۗᩳ") ^ i3) * (-121);
                        i4 = ((m2566 ^ i2) * 29789) ^ 2104101327;
                        i5 = 1421999782;
                    } else {
                        m2566 = (C2105.m6981("ۖᩳ") + i3) * (-35);
                        i4 = ((m2566 ^ i2) * (-13091)) ^ 699866481;
                        i5 = 2039814026;
                    }
                case -1406368713:
                case 188750646:
                    C0422.m1963();
                    if (C1711.f5919) {
                        m2566 = C0630.m2566("ܶۖ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-29139)) ^ 1955011439;
                        i5 = -1036381274;
                    } else {
                        m2566 = C0630.m2566("᩻ۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-13083)) ^ 1486979992;
                        i5 = -1727696364;
                    }
                case -1372750299:
                case 988059761:
                    ((C4841) RunnableC1108.m3791(interfaceC10798)).f15294 = z;
                    m2566 = C2105.m6981("۠ۨ") ^ i2;
                    i4 = ((m2566 ^ i3) * 1871) ^ (-196830185);
                    i5 = -1024331174;
                case -1015314933:
                case 1699726994:
                    interfaceC10798 = c20364.f65737.listIterator(0);
                    z = false;
                    m2566 = C2105.m6981("۠ۨ") ^ i2;
                    i4 = ((m2566 ^ i3) * 1871) ^ (-196830185);
                    i5 = -1024331174;
                case -693758422:
                case -245077629:
                    m6664(z);
                    m6697();
                    break;
                case -617807806:
                case 438109892:
                    c20364 = c3430.f10837;
                    if (C3432.m10477() <= 0) {
                        m2566 = C0630.m2566("ᩴܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-8327)) ^ (-1258174747);
                        i5 = -1906907367;
                    } else {
                        m2566 = C0630.m2566("ܺ۬") ^ i3;
                        i4 = ((m2566 ^ i2) * 32509) ^ (-577541527);
                        i5 = -519948143;
                    }
                case -566747732:
                case 704439867:
                    C3911.m11924();
                    C7106.m19120();
                    break;
                case -524743126:
                case 1730445483:
                    ((C4841) C2272.m7513(interfaceC107982)).f15294 = z;
                    m2566 = C0630.m2566("ۜ۠") ^ i2;
                    i4 = ((m2566 ^ i3) * 16793) ^ 136650279;
                    i5 = 943205439;
                case -480969911:
                case 196339729:
                    ViewOnClickListenerC1958.m6434(c203643);
                    if (RunnableC1108.f4040) {
                        m2566 = (C2105.m6981("ܶ᩹") + i2) * 3;
                        i4 = ((m2566 ^ i3) * (-15161)) ^ 1975721998;
                        i5 = 283630712;
                    } else {
                        m2566 = C0630.m2566("᩻ۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-13083)) ^ 1486979992;
                        i5 = -1727696364;
                    }
                case -171974791:
                case 1406741228:
                    C4263.m12819();
                    if (C2958.f9394 >= 0) {
                        m2566 = (C2105.m6981("ۚۚ") + i2) * 71;
                        i4 = ((m2566 ^ i3) * (-3245)) ^ (-289766371);
                        i5 = 1603491165;
                    } else {
                        m2566 = C0630.m2566("᩻ۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-13083)) ^ 1486979992;
                        i5 = -1727696364;
                    }
                case -155968743:
                case 1823164334:
                    c203642 = this.f6815.f10837;
                    if (C0483.f2088 >= 0) {
                        m2566 = C0630.m2566("ᩴܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-8327)) ^ (-1258174747);
                        i5 = -1906907367;
                    } else {
                        m2566 = C2105.m6981("ۨ۫") ^ i2;
                        i4 = ((m2566 ^ i3) * 5275) ^ (-1940740929);
                        i5 = 361165228;
                    }
                case -147929699:
                case 1491772222:
                    C11340.m28031();
                    if (C1420.m4913()) {
                        m2566 = (C2105.m6981("ۚۚ") + i2) * 71;
                        i4 = ((m2566 ^ i3) * (-3245)) ^ (-289766371);
                        i5 = 1603491165;
                    } else {
                        m2566 = C0630.m2566("ᩴܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-8327)) ^ (-1258174747);
                        i5 = -1906907367;
                    }
                case 41376953:
                case 1393750392:
                    if (C0483.m2123(interfaceC10798)) {
                        m2566 = C2105.m6981("᩻۫") ^ i3;
                        i4 = ((m2566 ^ i2) * 28799) ^ (-821196230);
                        i5 = -1940447843;
                    } else {
                        m2566 = C2105.m6981("ۖۜ") ^ i3;
                        i4 = ((m2566 ^ i2) * 4415) ^ (-382886965);
                        i5 = -724723273;
                    }
                case 284812058:
                case 1169573701:
                    this.f6814 = z;
                    if (C1773.f6144 <= 0) {
                        m2566 = C2105.m6981("ۤۗ") ^ i3;
                        i4 = ((m2566 ^ i2) * 16283) ^ 354558728;
                        i5 = -715701882;
                    } else {
                        m2566 = (C0630.m2566("ᩳۡ") + i2) * (-7);
                        i4 = ((m2566 ^ i3) * (-19567)) ^ (-829607687);
                        i5 = -204856389;
                    }
                case 720784133:
                case 819807387:
                    c34302 = this.f6822;
                    c34302.f10838 = z ? 1 : 0;
                    if (AbstractC2021.m6574()) {
                        m2566 = C0630.m2566("ᩴܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-8327)) ^ (-1258174747);
                        i5 = -1906907367;
                    } else {
                        m2566 = (C2105.m6981("᩶ۗ") + i2) * (-43);
                        i4 = ((m2566 ^ i3) * 26503) ^ 970026259;
                        i5 = -627460770;
                    }
                default:
                    c3430 = this.f6822;
                    if (C1773.f6144 <= 0) {
                        m2566 = C0630.m2566("ᩴܺ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-8327)) ^ (-1258174747);
                        i5 = -1906907367;
                    } else {
                        m2566 = C0630.m2566("۬֨") ^ i2;
                        i4 = ((m2566 ^ i3) * (-22623)) ^ 306724820;
                        i5 = 103926573;
                    }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public void m6700() {
        FloatingActionButton floatingActionButton;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float[] fArr;
        int i;
        short[] sArr;
        int i2;
        int i3;
        FloatingActionButton floatingActionButton2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i4;
        int m6981;
        int i5;
        int i6;
        FloatingActionButton floatingActionButton3;
        int i7;
        short[] sArr2;
        FloatingActionButton floatingActionButton4;
        int i8;
        int i9;
        int i10;
        int i11;
        FloatingActionButton floatingActionButton5;
        short[] sArr3;
        int i12;
        int i13;
        FloatingActionButton floatingActionButton6;
        float[] fArr2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        FloatingActionButton floatingActionButton7;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        int m2566;
        int i14;
        int i15;
        int m69812;
        int i16;
        int i17;
        int m25662;
        int i18;
        int i19;
        int m69813;
        int i20;
        boolean z = false;
        float f = 0.0f;
        int i21 = 0;
        float f2 = 0.0f;
        String str = null;
        ObjectAnimator objectAnimator = null;
        int i22 = 0;
        float f3 = 0.0f;
        ObjectAnimator objectAnimator2 = null;
        int i23 = 0;
        float f4 = 0.0f;
        ObjectAnimator objectAnimator3 = null;
        int i24 = 0;
        ObjectAnimator objectAnimator4 = null;
        AnimatorSet animatorSet = null;
        short s = 0;
        int i25 = 0;
        int i26 = 705098148;
        int i27 = C2520.f8000;
        int i28 = C0422.f1886;
        int m25663 = (C0630.m2566("ۧۜ") + i27) * 81;
        int i29 = ((m25663 ^ i28) * (-14427)) ^ (-1691094241);
        int i30 = m25663 ^ (-317741875);
        float[] fArr3 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams5 = null;
        FloatingActionButton floatingActionButton8 = null;
        float[] fArr4 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams6 = null;
        short[] sArr4 = null;
        int i31 = 0;
        float f5 = 0.0f;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        float f6 = 0.0f;
        char c = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        FloatingActionButton floatingActionButton9 = null;
        FloatingActionButton floatingActionButton10 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams7 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams8 = null;
        FloatingActionButton floatingActionButton11 = null;
        FloatingActionButton floatingActionButton12 = null;
        while (true) {
            i26 = i30 ^ (i29 & (((i26 ^ i28) * (-12275)) >> 31));
            switch (i26) {
                case -2133867558:
                case 1813236705:
                    floatingActionButton7 = floatingActionButton10;
                    ViewGroup.MarginLayoutParams marginLayoutParams9 = marginLayoutParams8;
                    AnimatorSet duration = new AnimatorSet().setDuration(200L);
                    duration.setInterpolator(new DecelerateInterpolator());
                    if (C3683.f11629 >= 0) {
                        animatorSet = duration;
                        marginLayoutParams8 = marginLayoutParams9;
                        m69812 = (C2105.m6981("֡ۡ") ^ i27) * 127;
                        i16 = ((m69812 ^ i28) * (-153)) ^ (-1552647390);
                        i17 = -1735496182;
                        i30 = m69812 ^ i17;
                        i29 = i16;
                        floatingActionButton10 = floatingActionButton7;
                    } else {
                        int m25664 = C0630.m2566("᩶۬") ^ i28;
                        int i39 = ((m25664 ^ i27) * 29233) ^ 921898786;
                        i30 = m25664 ^ (-664803278);
                        animatorSet = duration;
                        floatingActionButton10 = floatingActionButton7;
                        i29 = i39;
                        marginLayoutParams8 = marginLayoutParams9;
                    }
                case -2125891129:
                case 1405403358:
                    floatingActionButton5 = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams8;
                    fArr2 = fArr3;
                    i12 = i36;
                    sArr3 = sArr4;
                    floatingActionButton6 = floatingActionButton11;
                    i13 = i38;
                    marginLayoutParams3 = marginLayoutParams7;
                    i35 = i33 + i34 + marginLayoutParams3.bottomMargin;
                    if (C0050.f910 < 0) {
                        m2566 = (C0630.m2566("᩵ۡ") + i28) * (-5);
                        i14 = ((m2566 ^ i27) * 4151) ^ (-904350319);
                        i15 = 1042759317;
                        int i40 = m2566 ^ i15;
                        sArr4 = sArr3;
                        marginLayoutParams7 = marginLayoutParams3;
                        i38 = i13;
                        floatingActionButton11 = floatingActionButton6;
                        floatingActionButton10 = floatingActionButton5;
                        marginLayoutParams8 = marginLayoutParams;
                        i36 = i12;
                        fArr3 = fArr2;
                        i30 = i40;
                        i29 = i14;
                    }
                    m2566 = (C2105.m6981("᩺ܺ") ^ i27) * (-41);
                    i14 = ((m2566 ^ i28) * (-21235)) ^ (-500305841);
                    i15 = 487127789;
                    int i402 = m2566 ^ i15;
                    sArr4 = sArr3;
                    marginLayoutParams7 = marginLayoutParams3;
                    i38 = i13;
                    floatingActionButton11 = floatingActionButton6;
                    floatingActionButton10 = floatingActionButton5;
                    marginLayoutParams8 = marginLayoutParams;
                    i36 = i12;
                    fArr3 = fArr2;
                    i30 = i402;
                    i29 = i14;
                case -2013160185:
                case -1089395615:
                    C2105.m6982();
                    break;
                case -1921538061:
                case -1033444044:
                    floatingActionButton = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams8;
                    marginLayoutParams2 = marginLayoutParams7;
                    i4 = i35;
                    fArr = fArr3;
                    i = i36;
                    sArr = sArr4;
                    floatingActionButton2 = floatingActionButton11;
                    i2 = i38;
                    s = f6807[431];
                    int i41 = s + 1;
                    i25 = i41 * i41;
                    m6981 = C2105.m6981("ۙ᩺") ^ i27;
                    i5 = ((m6981 ^ i28) * (-15497)) ^ 1058854211;
                    i6 = -1508786684;
                    i9 = m6981 ^ i6;
                    sArr4 = sArr;
                    i35 = i4;
                    i38 = i2;
                    floatingActionButton11 = floatingActionButton2;
                    floatingActionButton10 = floatingActionButton;
                    i36 = i;
                    fArr3 = fArr;
                    i30 = i9;
                    i29 = i5;
                    marginLayoutParams7 = marginLayoutParams2;
                    marginLayoutParams8 = marginLayoutParams;
                case -1877598477:
                case 1200614792:
                    floatingActionButton = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams8;
                    marginLayoutParams2 = marginLayoutParams7;
                    i3 = i35;
                    fArr = fArr3;
                    i = i36;
                    sArr = sArr4;
                    floatingActionButton2 = floatingActionButton11;
                    i2 = i38;
                    this.f6833.setVisibility(z ? 1 : 0);
                    this.f6827.setVisibility(z ? 1 : 0);
                    this.f6813.setVisibility(z ? 1 : 0);
                    FloatingActionButton floatingActionButton13 = this.f6817;
                    if (C0237.f1507 != 0) {
                        floatingActionButton9 = floatingActionButton13;
                        m6981 = C2105.m6981("۬ۙ") ^ i28;
                        i4 = i3;
                        i5 = ((m6981 ^ i27) * (-13841)) ^ (-1220145419);
                        i6 = -244453648;
                        i9 = m6981 ^ i6;
                        sArr4 = sArr;
                        i35 = i4;
                        i38 = i2;
                        floatingActionButton11 = floatingActionButton2;
                        floatingActionButton10 = floatingActionButton;
                        i36 = i;
                        fArr3 = fArr;
                        i30 = i9;
                        i29 = i5;
                        marginLayoutParams7 = marginLayoutParams2;
                        marginLayoutParams8 = marginLayoutParams;
                    } else {
                        int m69814 = (C2105.m6981("ܿۘ") + i27) * (-109);
                        floatingActionButton9 = floatingActionButton13;
                        i29 = ((m69814 ^ i28) * (-20403)) ^ 545622372;
                        i10 = m69814 ^ (-413146414);
                        sArr4 = sArr;
                        i35 = i3;
                        i38 = i2;
                        floatingActionButton11 = floatingActionButton2;
                        floatingActionButton10 = floatingActionButton;
                        i36 = i;
                        fArr3 = fArr;
                        i30 = i10;
                        marginLayoutParams7 = marginLayoutParams2;
                        marginLayoutParams8 = marginLayoutParams;
                    }
                case -1756245617:
                case -852011941:
                    floatingActionButton7 = floatingActionButton10;
                    C1294.m4370(floatingActionButton7, f);
                    FloatingActionButton floatingActionButton14 = this.f6833;
                    float[] fArr5 = new float[i21];
                    fArr5[z ? 1 : 0] = f3;
                    fArr5[c] = f2;
                    objectAnimator2 = C2520.m8018(floatingActionButton14, str, fArr5);
                    if (C0964.f3626 == 0) {
                        m69812 = C2105.m6981("ܽۘ") ^ i27;
                        i16 = ((m69812 ^ i28) * (-30089)) ^ 208984607;
                        i17 = -491458041;
                        i30 = m69812 ^ i17;
                        i29 = i16;
                        floatingActionButton10 = floatingActionButton7;
                    }
                    m69812 = (C2105.m6981("֡ۡ") ^ i27) * 127;
                    i16 = ((m69812 ^ i28) * (-153)) ^ (-1552647390);
                    i17 = -1735496182;
                    i30 = m69812 ^ i17;
                    i29 = i16;
                    floatingActionButton10 = floatingActionButton7;
                case -1675968994:
                case 766875793:
                    floatingActionButton = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams8;
                    marginLayoutParams2 = marginLayoutParams7;
                    i4 = i35;
                    fArr = fArr3;
                    i = i36;
                    sArr = sArr4;
                    floatingActionButton2 = floatingActionButton11;
                    i2 = i38;
                    if (((s * 2) + 1) - i25 <= 0) {
                        m6981 = C0630.m2566("ۜۗ") ^ i28;
                        i5 = ((m6981 ^ i27) * 22191) ^ (-2078692012);
                        i6 = 310570679;
                    } else {
                        m6981 = C0630.m2566("᩷ۘ") ^ i28;
                        i5 = ((m6981 ^ i27) * (-31449)) ^ 1737463291;
                        i6 = 1376333014;
                    }
                    i9 = m6981 ^ i6;
                    sArr4 = sArr;
                    i35 = i4;
                    i38 = i2;
                    floatingActionButton11 = floatingActionButton2;
                    floatingActionButton10 = floatingActionButton;
                    i36 = i;
                    fArr3 = fArr;
                    i30 = i9;
                    i29 = i5;
                    marginLayoutParams7 = marginLayoutParams2;
                    marginLayoutParams8 = marginLayoutParams;
                case -1657866731:
                case 968048392:
                    floatingActionButton7 = floatingActionButton10;
                    marginLayoutParams4 = marginLayoutParams8;
                    fArr4[z ? 1 : 0] = f4;
                    fArr4[c] = f2;
                    objectAnimator3 = C5695.m16025(floatingActionButton8, str, fArr4);
                    marginLayoutParams6 = (ViewGroup.MarginLayoutParams) C4616.m13553(this.f6813);
                    i24 = C11340.m28026(this.f6813);
                    m25662 = (i28 - C0630.m2566("ۛ۟")) * 89;
                    i18 = ((m25662 ^ i27) * (-4569)) ^ (-1074146672);
                    i19 = -1203902898;
                    i30 = m25662 ^ i19;
                    i29 = i18;
                    marginLayoutParams8 = marginLayoutParams4;
                    floatingActionButton10 = floatingActionButton7;
                case -1367521324:
                case -1061711867:
                    Animator[] animatorArr = new Animator[4];
                    animatorArr[z ? 1 : 0] = objectAnimator;
                    animatorArr[c] = objectAnimator2;
                    animatorArr[i21] = objectAnimator3;
                    animatorArr[3] = objectAnimator4;
                    AnimatorSet animatorSet2 = animatorSet;
                    animatorSet2.playTogether(animatorArr);
                    m69813 = (C2105.m6981("۫ۢ") ^ i28) * (-89);
                    animatorSet = animatorSet2;
                    i14 = ((m69813 ^ i27) * (-25913)) ^ (-1756911362);
                    i20 = -1416494304;
                    i30 = m69813 ^ i20;
                    i29 = i14;
                case -1250167199:
                case 1256281238:
                    floatingActionButton3 = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams8;
                    marginLayoutParams2 = marginLayoutParams7;
                    i7 = i35;
                    fArr = fArr3;
                    sArr2 = sArr4;
                    floatingActionButton4 = floatingActionButton11;
                    i8 = i38;
                    i36 = 48559;
                    int m25665 = C0630.m2566("ۜ᩻") ^ i27;
                    i5 = ((m25665 ^ i28) * (-4667)) ^ 1373434950;
                    i9 = m25665 ^ (-2079378291);
                    sArr4 = sArr2;
                    i35 = i7;
                    i38 = i8;
                    floatingActionButton11 = floatingActionButton4;
                    floatingActionButton10 = floatingActionButton3;
                    fArr3 = fArr;
                    i30 = i9;
                    i29 = i5;
                    marginLayoutParams7 = marginLayoutParams2;
                    marginLayoutParams8 = marginLayoutParams;
                case -1198214059:
                case 1762712936:
                    floatingActionButton7 = floatingActionButton10;
                    marginLayoutParams8 = (ViewGroup.MarginLayoutParams) C4616.m13553(this.f6827);
                    i23 = C1005.m3498(this.f6827);
                    m69812 = C2105.m6981("֨֨") ^ i28;
                    i16 = ((m69812 ^ i27) * 2127) ^ (-15701175);
                    i17 = 995572440;
                    i30 = m69812 ^ i17;
                    i29 = i16;
                    floatingActionButton10 = floatingActionButton7;
                case -1191876752:
                case 52783567:
                    floatingActionButton5 = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams8;
                    int i42 = i36;
                    sArr3 = sArr4;
                    int i43 = i37;
                    int i44 = i38;
                    String m2128 = C0483.m2128(sArr3, i43, i44, i42);
                    i12 = i42;
                    FloatingActionButton floatingActionButton15 = floatingActionButton11;
                    i13 = i44;
                    float[] fArr6 = fArr3;
                    objectAnimator = C5695.m16025(floatingActionButton15, m2128, fArr6);
                    floatingActionButton6 = floatingActionButton15;
                    marginLayoutParams5 = (ViewGroup.MarginLayoutParams) C7811.m20836(this.f6833);
                    i22 = C1005.m3498(this.f6833);
                    if (C3746.m11369() >= 0) {
                        fArr2 = fArr6;
                        i37 = i43;
                        str = m2128;
                        marginLayoutParams3 = marginLayoutParams7;
                        m2566 = (C2105.m6981("᩺ܺ") ^ i27) * (-41);
                        i14 = ((m2566 ^ i28) * (-21235)) ^ (-500305841);
                        i15 = 487127789;
                        int i4022 = m2566 ^ i15;
                        sArr4 = sArr3;
                        marginLayoutParams7 = marginLayoutParams3;
                        i38 = i13;
                        floatingActionButton11 = floatingActionButton6;
                        floatingActionButton10 = floatingActionButton5;
                        marginLayoutParams8 = marginLayoutParams;
                        i36 = i12;
                        fArr3 = fArr2;
                        i30 = i4022;
                        i29 = i14;
                    } else {
                        int m25666 = (C0630.m2566("ۚۖ") ^ i27) * (-69);
                        sArr4 = sArr3;
                        i37 = i43;
                        i38 = i13;
                        floatingActionButton11 = floatingActionButton6;
                        floatingActionButton10 = floatingActionButton5;
                        i36 = i12;
                        fArr3 = fArr6;
                        i30 = m25666 ^ (-496772894);
                        i29 = ((m25666 ^ i28) * (-4619)) ^ 948599872;
                        str = m2128;
                        marginLayoutParams8 = marginLayoutParams;
                    }
                case -1096475622:
                case 1481950743:
                    ViewGroup.MarginLayoutParams marginLayoutParams10 = marginLayoutParams5;
                    float f7 = i22 + marginLayoutParams10.topMargin + marginLayoutParams10.bottomMargin;
                    this.f6833.setTranslationY(f7);
                    floatingActionButton10 = this.f6833;
                    int m25667 = (i28 - C0630.m2566("ۙ᩶")) * 49;
                    marginLayoutParams5 = marginLayoutParams10;
                    i29 = ((m25667 ^ i27) * (-26491)) ^ (-465554620);
                    i30 = m25667 ^ 166557023;
                    f3 = f7;
                case -793562121:
                case 1274124908:
                    if (C4263.m12819() >= 0) {
                        floatingActionButton5 = floatingActionButton10;
                        marginLayoutParams = marginLayoutParams8;
                        marginLayoutParams3 = marginLayoutParams7;
                        fArr2 = fArr3;
                        i12 = i36;
                        sArr3 = sArr4;
                        floatingActionButton6 = floatingActionButton11;
                        i13 = i38;
                        m2566 = (C2105.m6981("᩺ܺ") ^ i27) * (-41);
                        i14 = ((m2566 ^ i28) * (-21235)) ^ (-500305841);
                        i15 = 487127789;
                        int i40222 = m2566 ^ i15;
                        sArr4 = sArr3;
                        marginLayoutParams7 = marginLayoutParams3;
                        i38 = i13;
                        floatingActionButton11 = floatingActionButton6;
                        floatingActionButton10 = floatingActionButton5;
                        marginLayoutParams8 = marginLayoutParams;
                        i36 = i12;
                        fArr3 = fArr2;
                        i30 = i40222;
                        i29 = i14;
                    } else {
                        floatingActionButton = floatingActionButton10;
                        marginLayoutParams = marginLayoutParams8;
                        i11 = i32;
                        marginLayoutParams2 = marginLayoutParams7;
                        i4 = i35;
                        fArr = fArr3;
                        i = i36;
                        sArr = sArr4;
                        floatingActionButton2 = floatingActionButton11;
                        i2 = i38;
                        m6981 = (i28 - C2105.m6981("ۨۡ")) * (-115);
                        i32 = i11;
                        i5 = ((m6981 ^ i27) * (-23621)) ^ (-1586497401);
                        i6 = -931017468;
                        i9 = m6981 ^ i6;
                        sArr4 = sArr;
                        i35 = i4;
                        i38 = i2;
                        floatingActionButton11 = floatingActionButton2;
                        floatingActionButton10 = floatingActionButton;
                        i36 = i;
                        fArr3 = fArr;
                        i30 = i9;
                        i29 = i5;
                        marginLayoutParams7 = marginLayoutParams2;
                        marginLayoutParams8 = marginLayoutParams;
                    }
                case -701964648:
                case 189974660:
                    marginLayoutParams = marginLayoutParams8;
                    marginLayoutParams2 = marginLayoutParams7;
                    this.f6814 = true;
                    this.f6835 = -1;
                    i32 = -2;
                    int m69815 = C2105.m6981("ᩴۤ") ^ i28;
                    i29 = ((m69815 ^ i27) * (-9185)) ^ 2027634553;
                    i10 = m69815 ^ 302097709;
                    sArr4 = sArr4;
                    i35 = i35;
                    i38 = i38;
                    floatingActionButton11 = floatingActionButton11;
                    floatingActionButton10 = floatingActionButton10;
                    i36 = i36;
                    fArr3 = fArr3;
                    c = 1;
                    i30 = i10;
                    marginLayoutParams7 = marginLayoutParams2;
                    marginLayoutParams8 = marginLayoutParams;
                case -698902293:
                case 174683853:
                    floatingActionButton3 = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams8;
                    marginLayoutParams2 = marginLayoutParams7;
                    i7 = i35;
                    fArr = fArr3;
                    sArr2 = sArr4;
                    floatingActionButton4 = floatingActionButton11;
                    i8 = i38;
                    i36 = 47504;
                    int m256652 = C0630.m2566("ۜ᩻") ^ i27;
                    i5 = ((m256652 ^ i28) * (-4667)) ^ 1373434950;
                    i9 = m256652 ^ (-2079378291);
                    sArr4 = sArr2;
                    i35 = i7;
                    i38 = i8;
                    floatingActionButton11 = floatingActionButton4;
                    floatingActionButton10 = floatingActionButton3;
                    fArr3 = fArr;
                    i30 = i9;
                    i29 = i5;
                    marginLayoutParams7 = marginLayoutParams2;
                    marginLayoutParams8 = marginLayoutParams;
                case -595684506:
                case -41420998:
                    animatorSet.start();
                    this.f6822.f10840.setEnabled(z);
                    this.f6815.f10840.setEnabled(z);
                    break;
                case -569085242:
                case -211961953:
                    if (AbstractC2021.f6743 > 0) {
                        floatingActionButton = floatingActionButton10;
                        marginLayoutParams = marginLayoutParams8;
                        marginLayoutParams2 = marginLayoutParams7;
                        i3 = i35;
                        fArr = fArr3;
                        i = i36;
                        sArr = sArr4;
                        floatingActionButton2 = floatingActionButton11;
                        i2 = i38;
                        m6981 = C2105.m6981("۬ۙ") ^ i28;
                        i4 = i3;
                        i5 = ((m6981 ^ i27) * (-13841)) ^ (-1220145419);
                        i6 = -244453648;
                        i9 = m6981 ^ i6;
                        sArr4 = sArr;
                        i35 = i4;
                        i38 = i2;
                        floatingActionButton11 = floatingActionButton2;
                        floatingActionButton10 = floatingActionButton;
                        i36 = i;
                        fArr3 = fArr;
                        i30 = i9;
                        i29 = i5;
                        marginLayoutParams7 = marginLayoutParams2;
                        marginLayoutParams8 = marginLayoutParams;
                    }
                    floatingActionButton = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams8;
                    i11 = i32;
                    marginLayoutParams2 = marginLayoutParams7;
                    i4 = i35;
                    fArr = fArr3;
                    i = i36;
                    sArr = sArr4;
                    floatingActionButton2 = floatingActionButton11;
                    i2 = i38;
                    m6981 = (i28 - C2105.m6981("ۨۡ")) * (-115);
                    i32 = i11;
                    i5 = ((m6981 ^ i27) * (-23621)) ^ (-1586497401);
                    i6 = -931017468;
                    i9 = m6981 ^ i6;
                    sArr4 = sArr;
                    i35 = i4;
                    i38 = i2;
                    floatingActionButton11 = floatingActionButton2;
                    floatingActionButton10 = floatingActionButton;
                    i36 = i;
                    fArr3 = fArr;
                    i30 = i9;
                    i29 = i5;
                    marginLayoutParams7 = marginLayoutParams2;
                    marginLayoutParams8 = marginLayoutParams;
                case -502066462:
                case 696489040:
                    floatingActionButton7 = floatingActionButton10;
                    marginLayoutParams4 = marginLayoutParams8;
                    float f8 = i31;
                    this.f6827.setTranslationY(f8);
                    ViewOnClickListenerC1958.m6433(this.f6827, f);
                    floatingActionButton8 = this.f6827;
                    fArr4 = new float[i21];
                    if (C7811.f24123 >= 0) {
                        f4 = f8;
                        marginLayoutParams2 = marginLayoutParams7;
                        fArr = fArr3;
                        marginLayoutParams = marginLayoutParams4;
                        i = i36;
                        sArr = sArr4;
                        floatingActionButton = floatingActionButton7;
                        i3 = i35;
                        floatingActionButton2 = floatingActionButton11;
                        i2 = i38;
                        m6981 = C2105.m6981("۬ۙ") ^ i28;
                        i4 = i3;
                        i5 = ((m6981 ^ i27) * (-13841)) ^ (-1220145419);
                        i6 = -244453648;
                        i9 = m6981 ^ i6;
                        sArr4 = sArr;
                        i35 = i4;
                        i38 = i2;
                        floatingActionButton11 = floatingActionButton2;
                        floatingActionButton10 = floatingActionButton;
                        i36 = i;
                        fArr3 = fArr;
                        i30 = i9;
                        i29 = i5;
                        marginLayoutParams7 = marginLayoutParams2;
                        marginLayoutParams8 = marginLayoutParams;
                    } else {
                        int m25668 = C0630.m2566("ۢ᩷") ^ i27;
                        i30 = m25668 ^ 378196372;
                        f4 = f8;
                        i29 = ((m25668 ^ i28) * (-32745)) ^ 763350685;
                        marginLayoutParams8 = marginLayoutParams4;
                        floatingActionButton10 = floatingActionButton7;
                    }
                case -498927305:
                case -85234750:
                    floatingActionButton7 = floatingActionButton10;
                    marginLayoutParams4 = marginLayoutParams8;
                    floatingActionButton12.setTranslationY(f5);
                    C1294.m4370(this.f6813, f);
                    FloatingActionButton floatingActionButton16 = this.f6813;
                    float[] fArr7 = new float[i21];
                    fArr7[z ? 1 : 0] = f5;
                    fArr7[c] = f2;
                    objectAnimator4 = C5695.m16025(floatingActionButton16, str, fArr7);
                    m25662 = (C2105.m6981("ۖۧ") + i27) * 89;
                    i18 = ((m25662 ^ i28) * (-7593)) ^ 2058315519;
                    i19 = -528057284;
                    i30 = m25662 ^ i19;
                    i29 = i18;
                    marginLayoutParams8 = marginLayoutParams4;
                    floatingActionButton10 = floatingActionButton7;
                case -377065316:
                case 625674273:
                    if (C3746.f11829 <= 0) {
                        m69813 = (C2105.m6981("ۛۙ") ^ i27) * (-121);
                        i14 = ((m69813 ^ i28) * 7255) ^ (-950531910);
                        i20 = 801125297;
                        i30 = m69813 ^ i20;
                        i29 = i14;
                    }
                    floatingActionButton5 = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams8;
                    marginLayoutParams3 = marginLayoutParams7;
                    fArr2 = fArr3;
                    i12 = i36;
                    sArr3 = sArr4;
                    floatingActionButton6 = floatingActionButton11;
                    i13 = i38;
                    m2566 = (C2105.m6981("᩺ܺ") ^ i27) * (-41);
                    i14 = ((m2566 ^ i28) * (-21235)) ^ (-500305841);
                    i15 = 487127789;
                    int i402222 = m2566 ^ i15;
                    sArr4 = sArr3;
                    marginLayoutParams7 = marginLayoutParams3;
                    i38 = i13;
                    floatingActionButton11 = floatingActionButton6;
                    floatingActionButton10 = floatingActionButton5;
                    marginLayoutParams8 = marginLayoutParams;
                    i36 = i12;
                    fArr3 = fArr2;
                    i30 = i402222;
                    i29 = i14;
                case -159421889:
                case 104195948:
                    C0050.m940();
                    floatingActionButton5 = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams8;
                    marginLayoutParams3 = marginLayoutParams7;
                    fArr2 = fArr3;
                    i12 = i36;
                    sArr3 = sArr4;
                    floatingActionButton6 = floatingActionButton11;
                    i13 = i38;
                    m2566 = (C2105.m6981("᩺ܺ") ^ i27) * (-41);
                    i14 = ((m2566 ^ i28) * (-21235)) ^ (-500305841);
                    i15 = 487127789;
                    int i4022222 = m2566 ^ i15;
                    sArr4 = sArr3;
                    marginLayoutParams7 = marginLayoutParams3;
                    i38 = i13;
                    floatingActionButton11 = floatingActionButton6;
                    floatingActionButton10 = floatingActionButton5;
                    marginLayoutParams8 = marginLayoutParams;
                    i36 = i12;
                    fArr3 = fArr2;
                    i30 = i4022222;
                    i29 = i14;
                case -58246054:
                case 748417468:
                    break;
                case 74926783:
                case 1831585637:
                    marginLayoutParams = marginLayoutParams8;
                    ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) C4616.m13553(floatingActionButton9);
                    i33 = C1005.m3498(this.f6817);
                    int i45 = marginLayoutParams11.topMargin;
                    int m69816 = C2105.m6981("ܽܳ") ^ i27;
                    i29 = ((m69816 ^ i28) * (-30041)) ^ (-1373394900);
                    i35 = i35;
                    sArr4 = sArr4;
                    i38 = i38;
                    floatingActionButton11 = floatingActionButton11;
                    floatingActionButton10 = floatingActionButton10;
                    i36 = i36;
                    fArr3 = fArr3;
                    i30 = m69816 ^ (-664735972);
                    marginLayoutParams7 = marginLayoutParams11;
                    i34 = i45;
                    marginLayoutParams8 = marginLayoutParams;
                case 183098588:
                case 2138877278:
                    floatingActionButton = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams8;
                    i11 = i32;
                    marginLayoutParams2 = marginLayoutParams7;
                    i4 = i35;
                    fArr = fArr3;
                    i = i36;
                    sArr = sArr4;
                    floatingActionButton2 = floatingActionButton11;
                    i2 = i38;
                    this.f6829 = i11;
                    z = false;
                    z = false;
                    this.f6817.setVisibility(0);
                    if (C11340.f33930 < 0) {
                        i32 = i11;
                        m6981 = C0630.m2566("ۖܳ") ^ i28;
                        i5 = ((m6981 ^ i27) * (-32703)) ^ 1768329523;
                        i6 = -1996650769;
                        i9 = m6981 ^ i6;
                        sArr4 = sArr;
                        i35 = i4;
                        i38 = i2;
                        floatingActionButton11 = floatingActionButton2;
                        floatingActionButton10 = floatingActionButton;
                        i36 = i;
                        fArr3 = fArr;
                        i30 = i9;
                        i29 = i5;
                        marginLayoutParams7 = marginLayoutParams2;
                        marginLayoutParams8 = marginLayoutParams;
                    }
                    m6981 = (i28 - C2105.m6981("ۨۡ")) * (-115);
                    i32 = i11;
                    i5 = ((m6981 ^ i27) * (-23621)) ^ (-1586497401);
                    i6 = -931017468;
                    i9 = m6981 ^ i6;
                    sArr4 = sArr;
                    i35 = i4;
                    i38 = i2;
                    floatingActionButton11 = floatingActionButton2;
                    floatingActionButton10 = floatingActionButton;
                    i36 = i;
                    fArr3 = fArr;
                    i30 = i9;
                    i29 = i5;
                    marginLayoutParams7 = marginLayoutParams2;
                    marginLayoutParams8 = marginLayoutParams;
                case 262869958:
                case 701581682:
                    floatingActionButton = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams8;
                    marginLayoutParams2 = marginLayoutParams7;
                    i4 = i35;
                    fArr = fArr3;
                    i = i36;
                    sArr = sArr4;
                    floatingActionButton2 = floatingActionButton11;
                    i2 = i38;
                    if (this.f6814) {
                        m6981 = (i27 - C2105.m6981("ۛ᩷")) * 5;
                        i5 = ((m6981 ^ i28) * (-12543)) ^ (-489367201);
                        i6 = -1767321852;
                    } else {
                        m6981 = (i27 - C2105.m6981("֡ܶ")) * (-47);
                        i5 = ((m6981 ^ i28) * (-25479)) ^ 1412865602;
                        i6 = 1471306827;
                    }
                    i9 = m6981 ^ i6;
                    sArr4 = sArr;
                    i35 = i4;
                    i38 = i2;
                    floatingActionButton11 = floatingActionButton2;
                    floatingActionButton10 = floatingActionButton;
                    i36 = i;
                    fArr3 = fArr;
                    i30 = i9;
                    i29 = i5;
                    marginLayoutParams7 = marginLayoutParams2;
                    marginLayoutParams8 = marginLayoutParams;
                case 289661915:
                case 1114109740:
                    floatingActionButton7 = floatingActionButton10;
                    marginLayoutParams4 = marginLayoutParams8;
                    int i46 = i24 + marginLayoutParams6.topMargin + marginLayoutParams6.bottomMargin;
                    floatingActionButton12 = this.f6813;
                    f5 = i46;
                    if (C7811.f24123 >= 0) {
                        marginLayoutParams3 = marginLayoutParams7;
                        fArr2 = fArr3;
                        marginLayoutParams = marginLayoutParams4;
                        i12 = i36;
                        sArr3 = sArr4;
                        floatingActionButton5 = floatingActionButton7;
                        floatingActionButton6 = floatingActionButton11;
                        i13 = i38;
                        m2566 = (C2105.m6981("᩺ܺ") ^ i27) * (-41);
                        i14 = ((m2566 ^ i28) * (-21235)) ^ (-500305841);
                        i15 = 487127789;
                        int i40222222 = m2566 ^ i15;
                        sArr4 = sArr3;
                        marginLayoutParams7 = marginLayoutParams3;
                        i38 = i13;
                        floatingActionButton11 = floatingActionButton6;
                        floatingActionButton10 = floatingActionButton5;
                        marginLayoutParams8 = marginLayoutParams;
                        i36 = i12;
                        fArr3 = fArr2;
                        i30 = i40222222;
                        i29 = i14;
                    } else {
                        m25662 = C0630.m2566("ۖۗ") ^ i27;
                        i18 = ((m25662 ^ i28) * 6235) ^ (-729920151);
                        i19 = 1776741282;
                        i30 = m25662 ^ i19;
                        i29 = i18;
                        marginLayoutParams8 = marginLayoutParams4;
                        floatingActionButton10 = floatingActionButton7;
                    }
                case 558558801:
                case 1773762757:
                    i21 = 2;
                    float[] fArr8 = new float[2];
                    fArr8[z ? 1 : 0] = f6;
                    f2 = 0.0f;
                    fArr8[c] = 0.0f;
                    sArr4 = f6807;
                    i37 = 432;
                    i38 = 12;
                    int m25669 = (C0630.m2566("ۧ᩻") + i28) * 47;
                    i30 = m25669 ^ 732435723;
                    floatingActionButton11 = floatingActionButton11;
                    marginLayoutParams8 = marginLayoutParams8;
                    i36 = i36;
                    fArr3 = fArr8;
                    i29 = ((m25669 ^ i27) * (-11855)) ^ (-794093632);
                    floatingActionButton10 = floatingActionButton10;
                case 599575769:
                case 868893611:
                    floatingActionButton7 = floatingActionButton10;
                    i31 = i23 + marginLayoutParams8.topMargin + marginLayoutParams8.bottomMargin;
                    if (C0422.f1886 > 0) {
                        m69812 = C2105.m6981("᩻֨") ^ i28;
                        i16 = ((m69812 ^ i27) * (-15079)) ^ 2114982058;
                        i17 = -84186258;
                        i30 = m69812 ^ i17;
                        i29 = i16;
                        floatingActionButton10 = floatingActionButton7;
                    }
                    m69812 = (C2105.m6981("֡ۡ") ^ i27) * 127;
                    i16 = ((m69812 ^ i28) * (-153)) ^ (-1552647390);
                    i17 = -1735496182;
                    i30 = m69812 ^ i17;
                    i29 = i16;
                    floatingActionButton10 = floatingActionButton7;
                default:
                    floatingActionButton = floatingActionButton10;
                    marginLayoutParams = marginLayoutParams8;
                    fArr = fArr3;
                    i = i36;
                    sArr = sArr4;
                    i2 = i38;
                    i3 = i35;
                    float f9 = i3;
                    this.f6817.setTranslationY(f9);
                    f = 0.8f;
                    ViewOnClickListenerC1958.m6433(this.f6817, 0.8f);
                    FloatingActionButton floatingActionButton17 = this.f6817;
                    if (C0964.f3626 != 0) {
                        floatingActionButton2 = floatingActionButton17;
                        f6 = f9;
                        marginLayoutParams2 = marginLayoutParams7;
                        m6981 = C2105.m6981("۬ۙ") ^ i28;
                        i4 = i3;
                        i5 = ((m6981 ^ i27) * (-13841)) ^ (-1220145419);
                        i6 = -244453648;
                        i9 = m6981 ^ i6;
                        sArr4 = sArr;
                        i35 = i4;
                        i38 = i2;
                        floatingActionButton11 = floatingActionButton2;
                        floatingActionButton10 = floatingActionButton;
                        i36 = i;
                        fArr3 = fArr;
                        i30 = i9;
                        i29 = i5;
                        marginLayoutParams7 = marginLayoutParams2;
                        marginLayoutParams8 = marginLayoutParams;
                    } else {
                        int m256610 = (i27 - C0630.m2566("ᩴ᩺")) * (-31);
                        sArr4 = sArr;
                        f6 = f9;
                        i38 = i2;
                        floatingActionButton10 = floatingActionButton;
                        marginLayoutParams8 = marginLayoutParams;
                        i36 = i;
                        fArr3 = fArr;
                        floatingActionButton11 = floatingActionButton17;
                        i29 = ((m256610 ^ i28) * 8337) ^ (-1090581013);
                        i30 = m256610 ^ 909684319;
                        f = 0.8f;
                        i35 = i3;
                    }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m6664(boolean z) {
        FloatingActionButton floatingActionButton;
        String str;
        C3430 c3430;
        AnimatorSet animatorSet;
        FloatingActionButton floatingActionButton2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        char c;
        float[] fArr;
        int i;
        float[] fArr2;
        int m2566;
        int i2;
        int i3;
        int m6981;
        int i4;
        int i5;
        float[] fArr3;
        FloatingActionButton floatingActionButton3;
        String str2;
        AnimatorSet animatorSet2;
        C3430 c34302;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        char c2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        short[] sArr;
        int i6;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        FloatingActionButton floatingActionButton4;
        float[] fArr4;
        FloatingActionButton floatingActionButton5;
        float[] fArr5;
        int m25662;
        int i7;
        int m69812;
        int i8;
        int i9;
        int i10;
        C3430 c34303;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        char c3;
        float[] fArr6;
        String str3;
        AnimatorSet animatorSet3;
        ViewGroup.MarginLayoutParams marginLayoutParams6;
        short[] sArr2;
        int i11;
        AnimatorSet animatorSet4;
        FloatingActionButton floatingActionButton6;
        C3430 c34304;
        ViewGroup.MarginLayoutParams marginLayoutParams7;
        char c4;
        float[] fArr7;
        short[] sArr3;
        String m10748;
        int m25663;
        String str4;
        int i12;
        String str5;
        AnimatorSet animatorSet5;
        int i13;
        FloatingActionButton floatingActionButton7;
        int m25664;
        int i14;
        int i15;
        ViewOnClickListenerC2040 viewOnClickListenerC2040 = this;
        int i16 = 0;
        int i17 = 0;
        int i18 = -290356837;
        int i19 = C4117.f13076;
        int i20 = C1420.f5096;
        int m25665 = C0630.m2566("۟ۡ") ^ i20;
        int i21 = ((m25665 ^ i19) * 9075) ^ 1563409731;
        int i22 = m25665 ^ 1477927734;
        String str6 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams8 = null;
        FloatingActionButton floatingActionButton8 = null;
        FloatingActionButton floatingActionButton9 = null;
        String str7 = null;
        FloatingActionButton floatingActionButton10 = null;
        short[] sArr4 = null;
        AnimatorSet animatorSet6 = null;
        char c5 = 0;
        int i23 = 0;
        char c6 = 0;
        int i24 = 0;
        float f = 0.0f;
        int i25 = 0;
        int i26 = 0;
        float f2 = 0.0f;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        short s = 0;
        float[] fArr8 = null;
        ObjectAnimator objectAnimator = null;
        FloatingActionButton floatingActionButton11 = null;
        FloatingActionButton floatingActionButton12 = null;
        float[] fArr9 = null;
        float[] fArr10 = null;
        ObjectAnimator objectAnimator2 = null;
        int i31 = 0;
        float f3 = 0.0f;
        ViewGroup.MarginLayoutParams marginLayoutParams9 = null;
        float[] fArr11 = null;
        ViewGroup.LayoutParams layoutParams = null;
        ObjectAnimator objectAnimator3 = null;
        boolean z2 = false;
        int i32 = 0;
        ObjectAnimator objectAnimator4 = null;
        float[] fArr12 = null;
        int i33 = 0;
        float f4 = 0.0f;
        FloatingActionButton floatingActionButton13 = null;
        C3430 c34305 = null;
        ObjectAnimator objectAnimator5 = null;
        ObjectAnimator objectAnimator6 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams10 = null;
        ObjectAnimator objectAnimator7 = null;
        while (true) {
            i18 = i22 ^ (i21 & (((i18 ^ i19) * (-9461)) >> 31));
            switch (i18) {
                case -2109493278:
                case -897936710:
                    c34305.f10840.setEnabled(z2);
                    viewOnClickListenerC2040.f6815.f10840.setEnabled(z2);
                    break;
                case -2006241007:
                case -1096766896:
                    fArr3 = fArr8;
                    floatingActionButton3 = floatingActionButton8;
                    str2 = str6;
                    animatorSet2 = animatorSet6;
                    c34302 = c34305;
                    marginLayoutParams2 = marginLayoutParams10;
                    c2 = c5;
                    marginLayoutParams3 = marginLayoutParams9;
                    sArr = sArr4;
                    float[] fArr13 = fArr11;
                    i6 = i23;
                    marginLayoutParams4 = marginLayoutParams8;
                    floatingActionButton4 = floatingActionButton11;
                    fArr4 = fArr13;
                    float[] fArr14 = fArr12;
                    floatingActionButton5 = floatingActionButton12;
                    fArr5 = fArr14;
                    i31 = 40592;
                    m25662 = (i19 - C0630.m2566("ۤۖ")) * 27;
                    i21 = ((m25662 ^ i20) * (-2195)) ^ 504319739;
                    i7 = 1464664570;
                    i10 = m25662 ^ i7;
                    sArr4 = sArr;
                    animatorSet6 = animatorSet2;
                    marginLayoutParams9 = marginLayoutParams3;
                    str6 = str2;
                    c5 = c2;
                    fArr8 = fArr3;
                    i22 = i10;
                    marginLayoutParams10 = marginLayoutParams2;
                    c34305 = c34302;
                    viewOnClickListenerC2040 = this;
                    floatingActionButton8 = floatingActionButton3;
                    FloatingActionButton floatingActionButton14 = floatingActionButton4;
                    marginLayoutParams8 = marginLayoutParams4;
                    i23 = i6;
                    fArr11 = fArr4;
                    floatingActionButton11 = floatingActionButton14;
                    FloatingActionButton floatingActionButton15 = floatingActionButton5;
                    fArr12 = fArr5;
                    floatingActionButton12 = floatingActionButton15;
                case -1998498595:
                case -620152790:
                    Animator[] animatorArr = new Animator[i23];
                    animatorArr[c6] = objectAnimator3;
                    animatorArr[z2 ? 1 : 0] = objectAnimator2;
                    animatorArr[i24] = objectAnimator6;
                    animatorArr[c5] = objectAnimator5;
                    animatorSet6.playTogether(animatorArr);
                    floatingActionButton = floatingActionButton8;
                    str = str6;
                    c3430 = c34305;
                    int m69813 = C2105.m6981("֡ۜ") ^ i20;
                    animatorSet = animatorSet6;
                    i = ((m69813 ^ i19) * (-667)) ^ 2141743802;
                    i22 = m69813 ^ 157565375;
                    c34305 = c3430;
                    floatingActionButton8 = floatingActionButton;
                    AnimatorSet animatorSet7 = animatorSet;
                    str6 = str;
                    i21 = i;
                    animatorSet6 = animatorSet7;
                case -1958776773:
                case 2021149513:
                    fArr3 = fArr8;
                    floatingActionButton3 = floatingActionButton8;
                    str2 = str6;
                    animatorSet2 = animatorSet6;
                    c34302 = c34305;
                    marginLayoutParams2 = marginLayoutParams10;
                    c2 = c5;
                    marginLayoutParams3 = marginLayoutParams9;
                    sArr = sArr4;
                    float[] fArr15 = fArr11;
                    i6 = i23;
                    marginLayoutParams4 = marginLayoutParams8;
                    floatingActionButton4 = floatingActionButton11;
                    fArr4 = fArr15;
                    float[] fArr16 = fArr12;
                    floatingActionButton5 = floatingActionButton12;
                    fArr5 = fArr16;
                    int i34 = i16 + i17;
                    short s2 = s;
                    int i35 = s2 + 6520;
                    if ((i34 + i34) - (i35 * i35) < 0) {
                        m69812 = C0630.m2566("ܿ᩶") ^ i20;
                        i8 = ((m69812 ^ i19) * 10899) ^ 1034597563;
                        i9 = -1714124849;
                    } else {
                        m69812 = (i19 - C2105.m6981("ܰۛ")) * 63;
                        i8 = ((m69812 ^ i20) * 31643) ^ (-2073032335);
                        i9 = -753943787;
                    }
                    i10 = m69812 ^ i9;
                    s = s2;
                    i21 = i8;
                    sArr4 = sArr;
                    animatorSet6 = animatorSet2;
                    marginLayoutParams9 = marginLayoutParams3;
                    str6 = str2;
                    c5 = c2;
                    fArr8 = fArr3;
                    i22 = i10;
                    marginLayoutParams10 = marginLayoutParams2;
                    c34305 = c34302;
                    viewOnClickListenerC2040 = this;
                    floatingActionButton8 = floatingActionButton3;
                    FloatingActionButton floatingActionButton142 = floatingActionButton4;
                    marginLayoutParams8 = marginLayoutParams4;
                    i23 = i6;
                    fArr11 = fArr4;
                    floatingActionButton11 = floatingActionButton142;
                    FloatingActionButton floatingActionButton152 = floatingActionButton5;
                    fArr12 = fArr5;
                    floatingActionButton12 = floatingActionButton152;
                case -1872145284:
                case -639636845:
                    floatingActionButton3 = floatingActionButton8;
                    str5 = str6;
                    animatorSet5 = animatorSet6;
                    c34303 = c34305;
                    FloatingActionButton floatingActionButton16 = floatingActionButton11;
                    fArr4 = fArr11;
                    marginLayoutParams5 = marginLayoutParams10;
                    c3 = c5;
                    i6 = i23;
                    float[] fArr17 = fArr12;
                    floatingActionButton5 = floatingActionButton12;
                    fArr5 = fArr17;
                    marginLayoutParams4 = marginLayoutParams8;
                    floatingActionButton4 = floatingActionButton16;
                    i26 = C1005.m3498(floatingActionButton16) + marginLayoutParams4.topMargin;
                    int i36 = marginLayoutParams4.bottomMargin;
                    if (C0630.m2564()) {
                        i32 = i36;
                        int m69814 = (C2105.m6981("۫ۢ") + i19) * 35;
                        i11 = ((m69814 ^ i20) * (-29243)) ^ 1403174440;
                        i22 = m69814 ^ (-30151481);
                        animatorSet6 = animatorSet5;
                        str6 = str5;
                        i21 = i11;
                        c5 = c3;
                        marginLayoutParams10 = marginLayoutParams5;
                        c34305 = c34303;
                        floatingActionButton8 = floatingActionButton3;
                        FloatingActionButton floatingActionButton1422 = floatingActionButton4;
                        marginLayoutParams8 = marginLayoutParams4;
                        i23 = i6;
                        fArr11 = fArr4;
                        floatingActionButton11 = floatingActionButton1422;
                        FloatingActionButton floatingActionButton1522 = floatingActionButton5;
                        fArr12 = fArr5;
                        floatingActionButton12 = floatingActionButton1522;
                    } else {
                        int m25666 = (C0630.m2566("ۘ᩵") + i20) * 109;
                        i32 = i36;
                        int i37 = ((m25666 ^ i19) * 2357) ^ (-958502911);
                        i22 = m25666 ^ (-55329690);
                        c5 = c3;
                        marginLayoutParams10 = marginLayoutParams5;
                        c34305 = c34303;
                        floatingActionButton8 = floatingActionButton3;
                        str6 = str5;
                        i21 = i37;
                        animatorSet6 = animatorSet5;
                        FloatingActionButton floatingActionButton17 = floatingActionButton4;
                        marginLayoutParams8 = marginLayoutParams4;
                        i23 = i6;
                        fArr11 = fArr4;
                        floatingActionButton11 = floatingActionButton17;
                        FloatingActionButton floatingActionButton18 = floatingActionButton5;
                        fArr12 = fArr5;
                        floatingActionButton12 = floatingActionButton18;
                    }
                case -1845294463:
                case 1063044539:
                    fArr9[c6] = f;
                    fArr9[z2 ? 1 : 0] = f3;
                    floatingActionButton = floatingActionButton8;
                    str = str6;
                    c3430 = c34305;
                    ObjectAnimator m8018 = C2520.m8018(floatingActionButton, str, fArr9);
                    if (C4075.f12947 >= 0) {
                        animatorSet = animatorSet6;
                        marginLayoutParams = marginLayoutParams10;
                        c = c5;
                        fArr = fArr12;
                        floatingActionButton2 = floatingActionButton12;
                        int m25667 = (C0630.m2566("᩷ۗ") ^ i20) * (-55);
                        fArr2 = fArr;
                        i2 = ((m25667 ^ i19) * (-25711)) ^ 528287931;
                        i22 = m25667 ^ 1953593808;
                        animatorSet6 = animatorSet;
                        str6 = str;
                        i21 = i2;
                        c5 = c;
                        marginLayoutParams10 = marginLayoutParams;
                        c34305 = c3430;
                        floatingActionButton8 = floatingActionButton;
                        FloatingActionButton floatingActionButton19 = floatingActionButton2;
                        fArr12 = fArr2;
                        floatingActionButton12 = floatingActionButton19;
                    } else {
                        animatorSet6.setInterpolator(new AccelerateInterpolator());
                        Animator[] animatorArr2 = new Animator[i23];
                        animatorArr2[c6] = objectAnimator;
                        animatorArr2[z2 ? 1 : 0] = objectAnimator4;
                        animatorArr2[i24] = objectAnimator7;
                        animatorArr2[c5] = m8018;
                        animatorSet6.playTogether(animatorArr2);
                        int m698132 = C2105.m6981("֡ۜ") ^ i20;
                        animatorSet = animatorSet6;
                        i = ((m698132 ^ i19) * (-667)) ^ 2141743802;
                        i22 = m698132 ^ 157565375;
                        c34305 = c3430;
                        floatingActionButton8 = floatingActionButton;
                        AnimatorSet animatorSet72 = animatorSet;
                        str6 = str;
                        i21 = i;
                        animatorSet6 = animatorSet72;
                    }
                case -1472479008:
                case 467493696:
                    fArr3 = fArr8;
                    floatingActionButton3 = floatingActionButton8;
                    str2 = str6;
                    animatorSet2 = animatorSet6;
                    c34302 = c34305;
                    marginLayoutParams2 = marginLayoutParams10;
                    c2 = c5;
                    marginLayoutParams3 = marginLayoutParams9;
                    sArr = sArr4;
                    float[] fArr18 = fArr11;
                    i6 = i23;
                    marginLayoutParams4 = marginLayoutParams8;
                    floatingActionButton4 = floatingActionButton11;
                    fArr4 = fArr18;
                    float[] fArr19 = fArr12;
                    floatingActionButton5 = floatingActionButton12;
                    fArr5 = fArr19;
                    s = f6807[241];
                    i16 = s * s;
                    i17 = 42510400;
                    if (C0714.f2697 < 0) {
                        m25662 = C0630.m2566("᩷ܶ") ^ i20;
                        i21 = ((m25662 ^ i19) * 24251) ^ 1998846166;
                        i7 = -923365328;
                        i10 = m25662 ^ i7;
                        sArr4 = sArr;
                        animatorSet6 = animatorSet2;
                        marginLayoutParams9 = marginLayoutParams3;
                        str6 = str2;
                        c5 = c2;
                        fArr8 = fArr3;
                        i22 = i10;
                        marginLayoutParams10 = marginLayoutParams2;
                        c34305 = c34302;
                        viewOnClickListenerC2040 = this;
                        floatingActionButton8 = floatingActionButton3;
                        FloatingActionButton floatingActionButton14222 = floatingActionButton4;
                        marginLayoutParams8 = marginLayoutParams4;
                        i23 = i6;
                        fArr11 = fArr4;
                        floatingActionButton11 = floatingActionButton14222;
                        FloatingActionButton floatingActionButton15222 = floatingActionButton5;
                        fArr12 = fArr5;
                        floatingActionButton12 = floatingActionButton15222;
                    }
                    m25662 = C0630.m2566("ܺ᩹") ^ i20;
                    i21 = ((m25662 ^ i19) * (-13405)) ^ 1105819153;
                    i7 = -1468654013;
                    i10 = m25662 ^ i7;
                    sArr4 = sArr;
                    animatorSet6 = animatorSet2;
                    marginLayoutParams9 = marginLayoutParams3;
                    str6 = str2;
                    c5 = c2;
                    fArr8 = fArr3;
                    i22 = i10;
                    marginLayoutParams10 = marginLayoutParams2;
                    c34305 = c34302;
                    viewOnClickListenerC2040 = this;
                    floatingActionButton8 = floatingActionButton3;
                    FloatingActionButton floatingActionButton142222 = floatingActionButton4;
                    marginLayoutParams8 = marginLayoutParams4;
                    i23 = i6;
                    fArr11 = fArr4;
                    floatingActionButton11 = floatingActionButton142222;
                    FloatingActionButton floatingActionButton152222 = floatingActionButton5;
                    fArr12 = fArr5;
                    floatingActionButton12 = floatingActionButton152222;
                case -1466682321:
                case -226076383:
                    c3430 = c34305;
                    marginLayoutParams = marginLayoutParams10;
                    str = str6;
                    animatorSet = animatorSet6;
                    c = c5;
                    FloatingActionButton floatingActionButton20 = viewOnClickListenerC2040.f6813;
                    i29 = C1005.m3498(floatingActionButton20);
                    int i38 = marginLayoutParams.topMargin;
                    if (C2520.f8000 >= 0) {
                        floatingActionButton = floatingActionButton20;
                        i30 = i38;
                        fArr = fArr12;
                        floatingActionButton2 = floatingActionButton12;
                        int m256672 = (C0630.m2566("᩷ۗ") ^ i20) * (-55);
                        fArr2 = fArr;
                        i2 = ((m256672 ^ i19) * (-25711)) ^ 528287931;
                        i22 = m256672 ^ 1953593808;
                        animatorSet6 = animatorSet;
                        str6 = str;
                        i21 = i2;
                        c5 = c;
                        marginLayoutParams10 = marginLayoutParams;
                        c34305 = c3430;
                        floatingActionButton8 = floatingActionButton;
                        FloatingActionButton floatingActionButton192 = floatingActionButton2;
                        fArr12 = fArr2;
                        floatingActionButton12 = floatingActionButton192;
                    } else {
                        int m69815 = (C2105.m6981("۠ۢ") ^ i20) * (-119);
                        i22 = m69815 ^ 613998572;
                        str6 = str;
                        i21 = ((m69815 ^ i19) * (-9413)) ^ 1266618548;
                        animatorSet6 = animatorSet;
                        i30 = i38;
                        c5 = c;
                        marginLayoutParams10 = marginLayoutParams;
                        c34305 = c3430;
                        floatingActionButton8 = floatingActionButton20;
                    }
                case -1229296943:
                case 1885408877:
                    float[] fArr20 = fArr11;
                    i6 = i23;
                    marginLayoutParams4 = marginLayoutParams8;
                    floatingActionButton4 = floatingActionButton11;
                    fArr4 = fArr20;
                    float[] fArr21 = fArr12;
                    floatingActionButton5 = floatingActionButton12;
                    fArr5 = fArr21;
                    animatorSet6 = new AnimatorSet().setDuration(200L);
                    int m25668 = (i20 - C0630.m2566("ۛۨ")) * 77;
                    marginLayoutParams10 = marginLayoutParams10;
                    sArr4 = sArr4;
                    str6 = str6;
                    c34305 = c34305;
                    fArr8 = fArr8;
                    i22 = m25668 ^ 1574234054;
                    marginLayoutParams9 = marginLayoutParams9;
                    floatingActionButton8 = floatingActionButton8;
                    c5 = 3;
                    i21 = ((m25668 ^ i19) * 18653) ^ 1843237296;
                    viewOnClickListenerC2040 = this;
                    FloatingActionButton floatingActionButton1422222 = floatingActionButton4;
                    marginLayoutParams8 = marginLayoutParams4;
                    i23 = i6;
                    fArr11 = fArr4;
                    floatingActionButton11 = floatingActionButton1422222;
                    FloatingActionButton floatingActionButton1522222 = floatingActionButton5;
                    fArr12 = fArr5;
                    floatingActionButton12 = floatingActionButton1522222;
                case -1115683281:
                case -368034526:
                    float[] fArr22 = fArr11;
                    FloatingActionButton floatingActionButton21 = floatingActionButton8;
                    String str8 = str6;
                    AnimatorSet animatorSet8 = animatorSet6;
                    int i39 = i23;
                    C3430 c34306 = c34305;
                    FloatingActionButton floatingActionButton22 = floatingActionButton13;
                    ViewGroup.MarginLayoutParams marginLayoutParams11 = marginLayoutParams10;
                    char c7 = c5;
                    float[] fArr23 = fArr8;
                    float[] fArr24 = fArr12;
                    floatingActionButton5 = floatingActionButton12;
                    fArr5 = fArr24;
                    objectAnimator = C2520.m8018(floatingActionButton22, str8, fArr23);
                    marginLayoutParams8 = (ViewGroup.MarginLayoutParams) C7811.m20836(viewOnClickListenerC2040.f6833);
                    FloatingActionButton floatingActionButton23 = viewOnClickListenerC2040.f6833;
                    int m25669 = C0630.m2566("ᩳۧ") ^ i19;
                    i21 = ((m25669 ^ i20) * (-21891)) ^ 1579834148;
                    i22 = m25669 ^ (-962333681);
                    floatingActionButton13 = floatingActionButton22;
                    animatorSet6 = animatorSet8;
                    str6 = str8;
                    fArr8 = fArr23;
                    c5 = c7;
                    marginLayoutParams10 = marginLayoutParams11;
                    c34305 = c34306;
                    floatingActionButton8 = floatingActionButton21;
                    floatingActionButton11 = floatingActionButton23;
                    i23 = i39;
                    fArr11 = fArr22;
                    FloatingActionButton floatingActionButton15222222 = floatingActionButton5;
                    fArr12 = fArr5;
                    floatingActionButton12 = floatingActionButton15222222;
                case -1005560935:
                case 743222610:
                    floatingActionButton9 = viewOnClickListenerC2040.f6817;
                    fArr10 = new float[i24];
                    // fill-array-data instruction
                    fArr10[0] = 0.8f;
                    fArr10[1] = 0.0f;
                    str7 = C7106.m19110(f6807, Scalar25519.TARGET_LENGTH, 5, i31);
                    if (C0798.f2919) {
                        fArr7 = fArr8;
                        floatingActionButton6 = floatingActionButton8;
                        m10748 = str6;
                        animatorSet4 = animatorSet6;
                        c34304 = c34305;
                        marginLayoutParams7 = marginLayoutParams10;
                        c4 = c5;
                        sArr3 = sArr4;
                        float[] fArr25 = fArr11;
                        i6 = i23;
                        marginLayoutParams4 = marginLayoutParams8;
                        floatingActionButton4 = floatingActionButton11;
                        fArr4 = fArr25;
                        float[] fArr26 = fArr12;
                        floatingActionButton5 = floatingActionButton12;
                        fArr5 = fArr26;
                        m25663 = C0630.m2566("֡᩶") ^ i19;
                        str4 = m10748;
                        i21 = ((m25663 ^ i20) * 22025) ^ (-1027728277);
                        i12 = -2109716259;
                        sArr4 = sArr3;
                        c5 = c4;
                        marginLayoutParams10 = marginLayoutParams7;
                        c34305 = c34304;
                        floatingActionButton8 = floatingActionButton6;
                        float[] fArr27 = fArr7;
                        i22 = m25663 ^ i12;
                        animatorSet6 = animatorSet4;
                        str6 = str4;
                        fArr8 = fArr27;
                        FloatingActionButton floatingActionButton172 = floatingActionButton4;
                        marginLayoutParams8 = marginLayoutParams4;
                        i23 = i6;
                        fArr11 = fArr4;
                        floatingActionButton11 = floatingActionButton172;
                        FloatingActionButton floatingActionButton182 = floatingActionButton5;
                        fArr12 = fArr5;
                        floatingActionButton12 = floatingActionButton182;
                    } else {
                        m6981 = C2105.m6981("ܺ֨") ^ i20;
                        i4 = ((m6981 ^ i19) * 10715) ^ (-1087179968);
                        i5 = 662732929;
                        i22 = m6981 ^ i5;
                        i21 = i4;
                    }
                case -825733132:
                case 569602379:
                    floatingActionButton3 = floatingActionButton8;
                    str5 = str6;
                    animatorSet5 = animatorSet6;
                    c34303 = c34305;
                    floatingActionButton7 = floatingActionButton11;
                    marginLayoutParams5 = marginLayoutParams10;
                    c3 = c5;
                    float[] fArr28 = fArr11;
                    float[] fArr29 = fArr12;
                    floatingActionButton5 = floatingActionButton12;
                    fArr5 = fArr29;
                    objectAnimator4 = C5695.m16025(floatingActionButton7, str5, fArr28);
                    fArr4 = fArr28;
                    layoutParams = C7811.m20836(viewOnClickListenerC2040.f6827);
                    if (C4616.f14690 <= 0) {
                        i6 = i23;
                        marginLayoutParams4 = marginLayoutParams8;
                        floatingActionButton4 = floatingActionButton7;
                        int m698142 = (C2105.m6981("۫ۢ") + i19) * 35;
                        i11 = ((m698142 ^ i20) * (-29243)) ^ 1403174440;
                        i22 = m698142 ^ (-30151481);
                        animatorSet6 = animatorSet5;
                        str6 = str5;
                        i21 = i11;
                        c5 = c3;
                        marginLayoutParams10 = marginLayoutParams5;
                        c34305 = c34303;
                        floatingActionButton8 = floatingActionButton3;
                        FloatingActionButton floatingActionButton14222222 = floatingActionButton4;
                        marginLayoutParams8 = marginLayoutParams4;
                        i23 = i6;
                        fArr11 = fArr4;
                        floatingActionButton11 = floatingActionButton14222222;
                        FloatingActionButton floatingActionButton152222222 = floatingActionButton5;
                        fArr12 = fArr5;
                        floatingActionButton12 = floatingActionButton152222222;
                    } else {
                        m25664 = (i20 - C0630.m2566("ۨܶ")) * 109;
                        i13 = i23;
                        i14 = ((m25664 ^ i19) * 29667) ^ (-576866039);
                        i15 = 861408582;
                        i22 = m25664 ^ i15;
                        c5 = c3;
                        marginLayoutParams10 = marginLayoutParams5;
                        c34305 = c34303;
                        floatingActionButton8 = floatingActionButton3;
                        AnimatorSet animatorSet9 = animatorSet5;
                        str6 = str5;
                        i21 = i14;
                        i23 = i13;
                        fArr11 = fArr4;
                        floatingActionButton11 = floatingActionButton7;
                        animatorSet6 = animatorSet9;
                        FloatingActionButton floatingActionButton1522222222 = floatingActionButton5;
                        fArr12 = fArr5;
                        floatingActionButton12 = floatingActionButton1522222222;
                    }
                case -765965883:
                case 1502521002:
                    floatingActionButton = floatingActionButton8;
                    str = str6;
                    animatorSet = animatorSet6;
                    c3430 = c34305;
                    marginLayoutParams = marginLayoutParams10;
                    c = c5;
                    float f5 = i29 + i30 + marginLayoutParams.bottomMargin;
                    int m256610 = (i19 - C0630.m2566("᩺ۚ")) * (-109);
                    i = ((m256610 ^ i20) * (-10235)) ^ (-1345445649);
                    i22 = m256610 ^ (-1618313084);
                    f3 = f5;
                    fArr9 = new float[i24];
                    c5 = c;
                    marginLayoutParams10 = marginLayoutParams;
                    c34305 = c3430;
                    floatingActionButton8 = floatingActionButton;
                    AnimatorSet animatorSet722 = animatorSet;
                    str6 = str;
                    i21 = i;
                    animatorSet6 = animatorSet722;
                case -758968269:
                case 597527421:
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        fArr6 = fArr8;
                        floatingActionButton3 = floatingActionButton8;
                        str3 = str6;
                        animatorSet3 = animatorSet6;
                        c34303 = c34305;
                        marginLayoutParams6 = marginLayoutParams9;
                        marginLayoutParams5 = marginLayoutParams10;
                        sArr2 = sArr4;
                        c3 = c5;
                        float[] fArr30 = fArr11;
                        i6 = i23;
                        marginLayoutParams4 = marginLayoutParams8;
                        floatingActionButton4 = floatingActionButton11;
                        fArr4 = fArr30;
                        float[] fArr31 = fArr12;
                        floatingActionButton5 = floatingActionButton12;
                        fArr5 = fArr31;
                        int m69816 = (C2105.m6981("ᩴܽ") + i20) * 51;
                        i11 = ((m69816 ^ i19) * (-19411)) ^ 1653018001;
                        sArr4 = sArr2;
                        marginLayoutParams9 = marginLayoutParams6;
                        animatorSet6 = animatorSet3;
                        str6 = str3;
                        fArr8 = fArr6;
                        i22 = m69816 ^ 2053899605;
                        i21 = i11;
                        c5 = c3;
                        marginLayoutParams10 = marginLayoutParams5;
                        c34305 = c34303;
                        floatingActionButton8 = floatingActionButton3;
                        FloatingActionButton floatingActionButton142222222 = floatingActionButton4;
                        marginLayoutParams8 = marginLayoutParams4;
                        i23 = i6;
                        fArr11 = fArr4;
                        floatingActionButton11 = floatingActionButton142222222;
                        FloatingActionButton floatingActionButton15222222222 = floatingActionButton5;
                        fArr12 = fArr5;
                        floatingActionButton12 = floatingActionButton15222222222;
                    }
                    fArr3 = fArr8;
                    floatingActionButton3 = floatingActionButton8;
                    str2 = str6;
                    animatorSet2 = animatorSet6;
                    c34302 = c34305;
                    marginLayoutParams2 = marginLayoutParams10;
                    c2 = c5;
                    marginLayoutParams3 = marginLayoutParams9;
                    sArr = sArr4;
                    float[] fArr32 = fArr11;
                    i6 = i23;
                    marginLayoutParams4 = marginLayoutParams8;
                    floatingActionButton4 = floatingActionButton11;
                    fArr4 = fArr32;
                    float[] fArr33 = fArr12;
                    floatingActionButton5 = floatingActionButton12;
                    fArr5 = fArr33;
                    m25662 = C0630.m2566("ܺ᩹") ^ i20;
                    i21 = ((m25662 ^ i19) * (-13405)) ^ 1105819153;
                    i7 = -1468654013;
                    i10 = m25662 ^ i7;
                    sArr4 = sArr;
                    animatorSet6 = animatorSet2;
                    marginLayoutParams9 = marginLayoutParams3;
                    str6 = str2;
                    c5 = c2;
                    fArr8 = fArr3;
                    i22 = i10;
                    marginLayoutParams10 = marginLayoutParams2;
                    c34305 = c34302;
                    viewOnClickListenerC2040 = this;
                    floatingActionButton8 = floatingActionButton3;
                    FloatingActionButton floatingActionButton1422222222 = floatingActionButton4;
                    marginLayoutParams8 = marginLayoutParams4;
                    i23 = i6;
                    fArr11 = fArr4;
                    floatingActionButton11 = floatingActionButton1422222222;
                    FloatingActionButton floatingActionButton152222222222 = floatingActionButton5;
                    fArr12 = fArr5;
                    floatingActionButton12 = floatingActionButton152222222222;
                case -729212273:
                case -77636334:
                    C0050.m940();
                    if (C3683.f11629 < 0) {
                        floatingActionButton = floatingActionButton8;
                        str = str6;
                        animatorSet = animatorSet6;
                        c3430 = c34305;
                        marginLayoutParams = marginLayoutParams10;
                        c = c5;
                        fArr = fArr12;
                        floatingActionButton2 = floatingActionButton12;
                        int m2566722 = (C0630.m2566("᩷ۗ") ^ i20) * (-55);
                        fArr2 = fArr;
                        i2 = ((m2566722 ^ i19) * (-25711)) ^ 528287931;
                        i22 = m2566722 ^ 1953593808;
                        animatorSet6 = animatorSet;
                        str6 = str;
                        i21 = i2;
                        c5 = c;
                        marginLayoutParams10 = marginLayoutParams;
                        c34305 = c3430;
                        floatingActionButton8 = floatingActionButton;
                        FloatingActionButton floatingActionButton1922 = floatingActionButton2;
                        fArr12 = fArr2;
                        floatingActionButton12 = floatingActionButton1922;
                    } else {
                        fArr3 = fArr8;
                        floatingActionButton3 = floatingActionButton8;
                        str2 = str6;
                        animatorSet2 = animatorSet6;
                        c34302 = c34305;
                        marginLayoutParams2 = marginLayoutParams10;
                        c2 = c5;
                        marginLayoutParams3 = marginLayoutParams9;
                        sArr = sArr4;
                        float[] fArr322 = fArr11;
                        i6 = i23;
                        marginLayoutParams4 = marginLayoutParams8;
                        floatingActionButton4 = floatingActionButton11;
                        fArr4 = fArr322;
                        float[] fArr332 = fArr12;
                        floatingActionButton5 = floatingActionButton12;
                        fArr5 = fArr332;
                        m25662 = C0630.m2566("ܺ᩹") ^ i20;
                        i21 = ((m25662 ^ i19) * (-13405)) ^ 1105819153;
                        i7 = -1468654013;
                        i10 = m25662 ^ i7;
                        sArr4 = sArr;
                        animatorSet6 = animatorSet2;
                        marginLayoutParams9 = marginLayoutParams3;
                        str6 = str2;
                        c5 = c2;
                        fArr8 = fArr3;
                        i22 = i10;
                        marginLayoutParams10 = marginLayoutParams2;
                        c34305 = c34302;
                        viewOnClickListenerC2040 = this;
                        floatingActionButton8 = floatingActionButton3;
                        FloatingActionButton floatingActionButton14222222222 = floatingActionButton4;
                        marginLayoutParams8 = marginLayoutParams4;
                        i23 = i6;
                        fArr11 = fArr4;
                        floatingActionButton11 = floatingActionButton14222222222;
                        FloatingActionButton floatingActionButton1522222222222 = floatingActionButton5;
                        fArr12 = fArr5;
                        floatingActionButton12 = floatingActionButton1522222222222;
                    }
                case -700799261:
                case -127759534:
                    if (RunnableC1108.f4040) {
                        fArr7 = fArr8;
                        floatingActionButton6 = floatingActionButton8;
                        m10748 = str6;
                        animatorSet4 = animatorSet6;
                        c34304 = c34305;
                        marginLayoutParams7 = marginLayoutParams10;
                        c4 = c5;
                        sArr3 = sArr4;
                        float[] fArr252 = fArr11;
                        i6 = i23;
                        marginLayoutParams4 = marginLayoutParams8;
                        floatingActionButton4 = floatingActionButton11;
                        fArr4 = fArr252;
                        float[] fArr262 = fArr12;
                        floatingActionButton5 = floatingActionButton12;
                        fArr5 = fArr262;
                        m25663 = C0630.m2566("֡᩶") ^ i19;
                        str4 = m10748;
                        i21 = ((m25663 ^ i20) * 22025) ^ (-1027728277);
                        i12 = -2109716259;
                        sArr4 = sArr3;
                        c5 = c4;
                        marginLayoutParams10 = marginLayoutParams7;
                        c34305 = c34304;
                        floatingActionButton8 = floatingActionButton6;
                        float[] fArr272 = fArr7;
                        i22 = m25663 ^ i12;
                        animatorSet6 = animatorSet4;
                        str6 = str4;
                        fArr8 = fArr272;
                        FloatingActionButton floatingActionButton1722 = floatingActionButton4;
                        marginLayoutParams8 = marginLayoutParams4;
                        i23 = i6;
                        fArr11 = fArr4;
                        floatingActionButton11 = floatingActionButton1722;
                        FloatingActionButton floatingActionButton1822 = floatingActionButton5;
                        fArr12 = fArr5;
                        floatingActionButton12 = floatingActionButton1822;
                    } else {
                        fArr3 = fArr8;
                        floatingActionButton3 = floatingActionButton8;
                        str2 = str6;
                        animatorSet2 = animatorSet6;
                        c34302 = c34305;
                        marginLayoutParams2 = marginLayoutParams10;
                        c2 = c5;
                        marginLayoutParams3 = marginLayoutParams9;
                        sArr = sArr4;
                        float[] fArr3222 = fArr11;
                        i6 = i23;
                        marginLayoutParams4 = marginLayoutParams8;
                        floatingActionButton4 = floatingActionButton11;
                        fArr4 = fArr3222;
                        float[] fArr3322 = fArr12;
                        floatingActionButton5 = floatingActionButton12;
                        fArr5 = fArr3322;
                        m25662 = C0630.m2566("ܺ᩹") ^ i20;
                        i21 = ((m25662 ^ i19) * (-13405)) ^ 1105819153;
                        i7 = -1468654013;
                        i10 = m25662 ^ i7;
                        sArr4 = sArr;
                        animatorSet6 = animatorSet2;
                        marginLayoutParams9 = marginLayoutParams3;
                        str6 = str2;
                        c5 = c2;
                        fArr8 = fArr3;
                        i22 = i10;
                        marginLayoutParams10 = marginLayoutParams2;
                        c34305 = c34302;
                        viewOnClickListenerC2040 = this;
                        floatingActionButton8 = floatingActionButton3;
                        FloatingActionButton floatingActionButton142222222222 = floatingActionButton4;
                        marginLayoutParams8 = marginLayoutParams4;
                        i23 = i6;
                        fArr11 = fArr4;
                        floatingActionButton11 = floatingActionButton142222222222;
                        FloatingActionButton floatingActionButton15222222222222 = floatingActionButton5;
                        fArr12 = fArr5;
                        floatingActionButton12 = floatingActionButton15222222222222;
                    }
                case -635525300:
                case 1243208027:
                    fArr3 = fArr8;
                    floatingActionButton3 = floatingActionButton8;
                    str2 = str6;
                    animatorSet2 = animatorSet6;
                    c34302 = c34305;
                    marginLayoutParams2 = marginLayoutParams10;
                    c2 = c5;
                    marginLayoutParams3 = marginLayoutParams9;
                    sArr = sArr4;
                    float[] fArr34 = fArr11;
                    i6 = i23;
                    marginLayoutParams4 = marginLayoutParams8;
                    floatingActionButton4 = floatingActionButton11;
                    fArr4 = fArr34;
                    float[] fArr35 = fArr12;
                    floatingActionButton5 = floatingActionButton12;
                    fArr5 = fArr35;
                    i31 = 2678;
                    m25662 = (i19 - C0630.m2566("ۤۖ")) * 27;
                    i21 = ((m25662 ^ i20) * (-2195)) ^ 504319739;
                    i7 = 1464664570;
                    i10 = m25662 ^ i7;
                    sArr4 = sArr;
                    animatorSet6 = animatorSet2;
                    marginLayoutParams9 = marginLayoutParams3;
                    str6 = str2;
                    c5 = c2;
                    fArr8 = fArr3;
                    i22 = i10;
                    marginLayoutParams10 = marginLayoutParams2;
                    c34305 = c34302;
                    viewOnClickListenerC2040 = this;
                    floatingActionButton8 = floatingActionButton3;
                    FloatingActionButton floatingActionButton1422222222222 = floatingActionButton4;
                    marginLayoutParams8 = marginLayoutParams4;
                    i23 = i6;
                    fArr11 = fArr4;
                    floatingActionButton11 = floatingActionButton1422222222222;
                    FloatingActionButton floatingActionButton152222222222222 = floatingActionButton5;
                    fArr12 = fArr5;
                    floatingActionButton12 = floatingActionButton152222222222222;
                case -584999432:
                case 561425083:
                    i13 = i23;
                    floatingActionButton3 = floatingActionButton8;
                    str5 = str6;
                    animatorSet5 = animatorSet6;
                    c34303 = c34305;
                    floatingActionButton7 = floatingActionButton11;
                    marginLayoutParams5 = marginLayoutParams10;
                    c3 = c5;
                    float[] fArr36 = fArr12;
                    floatingActionButton5 = floatingActionButton12;
                    fArr5 = fArr36;
                    float[] fArr37 = new float[i24];
                    fArr37[c6] = f;
                    fArr37[z2 ? 1 : 0] = i26 + i32;
                    m25664 = (C0630.m2566("ۘܿ") ^ i19) * (-9);
                    fArr4 = fArr37;
                    i14 = ((m25664 ^ i20) * 13149) ^ (-313829701);
                    i15 = -752893685;
                    i22 = m25664 ^ i15;
                    c5 = c3;
                    marginLayoutParams10 = marginLayoutParams5;
                    c34305 = c34303;
                    floatingActionButton8 = floatingActionButton3;
                    AnimatorSet animatorSet92 = animatorSet5;
                    str6 = str5;
                    i21 = i14;
                    i23 = i13;
                    fArr11 = fArr4;
                    floatingActionButton11 = floatingActionButton7;
                    animatorSet6 = animatorSet92;
                    FloatingActionButton floatingActionButton1522222222222222 = floatingActionButton5;
                    fArr12 = fArr5;
                    floatingActionButton12 = floatingActionButton1522222222222222;
                case -579724027:
                case 1182709815:
                    fArr6 = fArr8;
                    floatingActionButton3 = floatingActionButton8;
                    str3 = str6;
                    animatorSet3 = animatorSet6;
                    c34303 = c34305;
                    marginLayoutParams5 = marginLayoutParams10;
                    c3 = c5;
                    float[] fArr38 = fArr11;
                    i6 = i23;
                    marginLayoutParams4 = marginLayoutParams8;
                    floatingActionButton4 = floatingActionButton11;
                    fArr4 = fArr38;
                    float[] fArr39 = fArr12;
                    floatingActionButton5 = floatingActionButton12;
                    fArr5 = fArr39;
                    marginLayoutParams6 = marginLayoutParams9;
                    sArr2 = sArr4;
                    float f6 = i25 + i33 + marginLayoutParams6.bottomMargin;
                    if (C3911.f12484 >= 0) {
                        f2 = f6;
                        int m698162 = (C2105.m6981("ᩴܽ") + i20) * 51;
                        i11 = ((m698162 ^ i19) * (-19411)) ^ 1653018001;
                        sArr4 = sArr2;
                        marginLayoutParams9 = marginLayoutParams6;
                        animatorSet6 = animatorSet3;
                        str6 = str3;
                        fArr8 = fArr6;
                        i22 = m698162 ^ 2053899605;
                        i21 = i11;
                        c5 = c3;
                        marginLayoutParams10 = marginLayoutParams5;
                        c34305 = c34303;
                        floatingActionButton8 = floatingActionButton3;
                        FloatingActionButton floatingActionButton14222222222222 = floatingActionButton4;
                        marginLayoutParams8 = marginLayoutParams4;
                        i23 = i6;
                        fArr11 = fArr4;
                        floatingActionButton11 = floatingActionButton14222222222222;
                        FloatingActionButton floatingActionButton15222222222222222 = floatingActionButton5;
                        fArr12 = fArr5;
                        floatingActionButton12 = floatingActionButton15222222222222222;
                    } else {
                        int m256611 = (i19 - C0630.m2566("᩺ۜ")) * (-7);
                        f2 = f6;
                        i21 = ((m256611 ^ i20) * (-2421)) ^ (-703207723);
                        sArr4 = sArr2;
                        marginLayoutParams9 = marginLayoutParams6;
                        animatorSet6 = animatorSet3;
                        str6 = str3;
                        fArr8 = fArr6;
                        i22 = m256611 ^ (-738743352);
                        c5 = c3;
                        marginLayoutParams10 = marginLayoutParams5;
                        c34305 = c34303;
                        floatingActionButton8 = floatingActionButton3;
                        FloatingActionButton floatingActionButton142222222222222 = floatingActionButton4;
                        marginLayoutParams8 = marginLayoutParams4;
                        i23 = i6;
                        fArr11 = fArr4;
                        floatingActionButton11 = floatingActionButton142222222222222;
                        FloatingActionButton floatingActionButton152222222222222222 = floatingActionButton5;
                        fArr12 = fArr5;
                        floatingActionButton12 = floatingActionButton152222222222222222;
                    }
                case -339984472:
                case 835505373:
                    C1504.m5179();
                    C4075.m12263();
                    floatingActionButton = floatingActionButton8;
                    str = str6;
                    animatorSet = animatorSet6;
                    c3430 = c34305;
                    marginLayoutParams = marginLayoutParams10;
                    c = c5;
                    fArr = fArr12;
                    floatingActionButton2 = floatingActionButton12;
                    int m25667222 = (C0630.m2566("᩷ۗ") ^ i20) * (-55);
                    fArr2 = fArr;
                    i2 = ((m25667222 ^ i19) * (-25711)) ^ 528287931;
                    i22 = m25667222 ^ 1953593808;
                    animatorSet6 = animatorSet;
                    str6 = str;
                    i21 = i2;
                    c5 = c;
                    marginLayoutParams10 = marginLayoutParams;
                    c34305 = c3430;
                    floatingActionButton8 = floatingActionButton;
                    FloatingActionButton floatingActionButton19222 = floatingActionButton2;
                    fArr12 = fArr2;
                    floatingActionButton12 = floatingActionButton19222;
                case -296137080:
                case 520488090:
                    FloatingActionButton floatingActionButton24 = floatingActionButton8;
                    String str9 = str6;
                    AnimatorSet animatorSet10 = animatorSet6;
                    C3430 c34307 = c34305;
                    ViewGroup.MarginLayoutParams marginLayoutParams12 = marginLayoutParams10;
                    char c8 = c5;
                    ViewGroup.MarginLayoutParams marginLayoutParams13 = (ViewGroup.MarginLayoutParams) layoutParams;
                    FloatingActionButton floatingActionButton25 = viewOnClickListenerC2040.f6827;
                    i27 = C1005.m3498(floatingActionButton25) + marginLayoutParams13.topMargin;
                    int i40 = marginLayoutParams13.bottomMargin;
                    int m69817 = C2105.m6981("ܿۖ") ^ i20;
                    int i41 = ((m69817 ^ i19) * 26427) ^ (-1764823067);
                    i22 = m69817 ^ 1518180649;
                    c5 = c8;
                    marginLayoutParams10 = marginLayoutParams12;
                    c34305 = c34307;
                    floatingActionButton8 = floatingActionButton24;
                    str6 = str9;
                    i21 = i41;
                    animatorSet6 = animatorSet10;
                    floatingActionButton12 = floatingActionButton25;
                    i28 = i40;
                    fArr12 = fArr12;
                case -201550782:
                case 1488793232:
                    c = c5;
                    floatingActionButton = floatingActionButton8;
                    str = str6;
                    animatorSet = animatorSet6;
                    c3430 = c34305;
                    fArr12[z2 ? 1 : 0] = f4;
                    FloatingActionButton floatingActionButton26 = floatingActionButton12;
                    fArr = fArr12;
                    objectAnimator7 = C5695.m16025(floatingActionButton26, str, fArr);
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) C4616.m13553(viewOnClickListenerC2040.f6813);
                    int m69818 = C2105.m6981("۬ۤ") ^ i19;
                    floatingActionButton2 = floatingActionButton26;
                    i = ((m69818 ^ i20) * (-14341)) ^ (-1766856825);
                    i22 = m69818 ^ (-27429904);
                    floatingActionButton12 = floatingActionButton2;
                    fArr12 = fArr;
                    c5 = c;
                    marginLayoutParams10 = marginLayoutParams;
                    c34305 = c3430;
                    floatingActionButton8 = floatingActionButton;
                    AnimatorSet animatorSet7222 = animatorSet;
                    str6 = str;
                    i21 = i;
                    animatorSet6 = animatorSet7222;
                case 64496540:
                case 466733988:
                    C4616.m13552();
                    C21923.m49329();
                    break;
                case 196374722:
                case 1252929392:
                    animatorSet6.addListener(new C23891(viewOnClickListenerC2040));
                    animatorSet6.start();
                    c34305 = viewOnClickListenerC2040.f6822;
                    m6981 = (C2105.m6981("۬ۢ") + i19) * (-73);
                    i4 = ((m6981 ^ i20) * (-2631)) ^ (-289251921);
                    i5 = -1040183207;
                    i22 = m6981 ^ i5;
                    i21 = i4;
                case 301835849:
                case 1547359358:
                    animatorSet4 = animatorSet6;
                    floatingActionButton6 = floatingActionButton8;
                    c34304 = c34305;
                    marginLayoutParams7 = marginLayoutParams10;
                    c4 = c5;
                    float[] fArr40 = fArr11;
                    i6 = i23;
                    marginLayoutParams4 = marginLayoutParams8;
                    floatingActionButton4 = floatingActionButton11;
                    fArr4 = fArr40;
                    float[] fArr41 = fArr12;
                    floatingActionButton5 = floatingActionButton12;
                    fArr5 = fArr41;
                    fArr7 = fArr8;
                    sArr3 = sArr4;
                    m10748 = C3537.m10748(sArr3, 242, 12, i31);
                    if (C2167.f7158 < 0) {
                        m25663 = C0630.m2566("ܿ᩵") ^ i19;
                        str4 = m10748;
                        i21 = ((m25663 ^ i20) * (-13691)) ^ 1983634484;
                        i12 = -1126605677;
                        sArr4 = sArr3;
                        c5 = c4;
                        marginLayoutParams10 = marginLayoutParams7;
                        c34305 = c34304;
                        floatingActionButton8 = floatingActionButton6;
                        float[] fArr2722 = fArr7;
                        i22 = m25663 ^ i12;
                        animatorSet6 = animatorSet4;
                        str6 = str4;
                        fArr8 = fArr2722;
                        FloatingActionButton floatingActionButton17222 = floatingActionButton4;
                        marginLayoutParams8 = marginLayoutParams4;
                        i23 = i6;
                        fArr11 = fArr4;
                        floatingActionButton11 = floatingActionButton17222;
                        FloatingActionButton floatingActionButton18222 = floatingActionButton5;
                        fArr12 = fArr5;
                        floatingActionButton12 = floatingActionButton18222;
                    }
                    m25663 = C0630.m2566("֡᩶") ^ i19;
                    str4 = m10748;
                    i21 = ((m25663 ^ i20) * 22025) ^ (-1027728277);
                    i12 = -2109716259;
                    sArr4 = sArr3;
                    c5 = c4;
                    marginLayoutParams10 = marginLayoutParams7;
                    c34305 = c34304;
                    floatingActionButton8 = floatingActionButton6;
                    float[] fArr27222 = fArr7;
                    i22 = m25663 ^ i12;
                    animatorSet6 = animatorSet4;
                    str6 = str4;
                    fArr8 = fArr27222;
                    FloatingActionButton floatingActionButton172222 = floatingActionButton4;
                    marginLayoutParams8 = marginLayoutParams4;
                    i23 = i6;
                    fArr11 = fArr4;
                    floatingActionButton11 = floatingActionButton172222;
                    FloatingActionButton floatingActionButton182222 = floatingActionButton5;
                    fArr12 = fArr5;
                    floatingActionButton12 = floatingActionButton182222;
                case 797187545:
                case 1134191269:
                    float[] fArr42 = new float[i24];
                    // fill-array-data instruction
                    fArr42[0] = 0.8f;
                    fArr42[1] = 0.0f;
                    objectAnimator6 = C5695.m16025(floatingActionButton10, str7, fArr42);
                    float[] fArr43 = new float[i24];
                    // fill-array-data instruction
                    fArr43[0] = 0.8f;
                    fArr43[1] = 0.0f;
                    objectAnimator5 = C2520.m8018(viewOnClickListenerC2040.f6813, str7, fArr43);
                    m6981 = C0630.m2566("ᩴۛ") ^ i19;
                    i4 = ((m6981 ^ i20) * (-18849)) ^ (-192231589);
                    i5 = -567544675;
                    i22 = m6981 ^ i5;
                    i21 = i4;
                case 1041689725:
                case 1476876513:
                    float[] fArr44 = fArr8;
                    ViewGroup.MarginLayoutParams marginLayoutParams14 = marginLayoutParams8;
                    FloatingActionButton floatingActionButton27 = floatingActionButton11;
                    float[] fArr45 = fArr11;
                    floatingActionButton = floatingActionButton8;
                    String str10 = str6;
                    AnimatorSet animatorSet11 = animatorSet6;
                    c3430 = c34305;
                    ViewGroup.MarginLayoutParams marginLayoutParams15 = marginLayoutParams9;
                    marginLayoutParams = marginLayoutParams10;
                    short[] sArr5 = sArr4;
                    c = c5;
                    float[] fArr46 = fArr12;
                    floatingActionButton2 = floatingActionButton12;
                    fArr2 = fArr46;
                    c6 = 0;
                    i24 = 2;
                    z2 = true;
                    if (z) {
                        m2566 = C0630.m2566("ܰܽ") ^ i20;
                        i2 = ((m2566 ^ i19) * (-10091)) ^ 1084379613;
                        i3 = -2015730176;
                    } else {
                        m2566 = (C0630.m2566("ۙᩳ") ^ i19) * (-39);
                        i2 = ((m2566 ^ i20) * 16647) ^ (-228318819);
                        i3 = -2117291721;
                    }
                    int i42 = m2566 ^ i3;
                    viewOnClickListenerC2040 = this;
                    sArr4 = sArr5;
                    fArr11 = fArr45;
                    marginLayoutParams9 = marginLayoutParams15;
                    floatingActionButton11 = floatingActionButton27;
                    animatorSet6 = animatorSet11;
                    marginLayoutParams8 = marginLayoutParams14;
                    str6 = str10;
                    fArr8 = fArr44;
                    i23 = 4;
                    i22 = i42;
                    i21 = i2;
                    c5 = c;
                    marginLayoutParams10 = marginLayoutParams;
                    c34305 = c3430;
                    floatingActionButton8 = floatingActionButton;
                    FloatingActionButton floatingActionButton192222 = floatingActionButton2;
                    fArr12 = fArr2;
                    floatingActionButton12 = floatingActionButton192222;
                case 1054642744:
                case 1183055522:
                    float[] fArr47 = fArr8;
                    floatingActionButton3 = floatingActionButton8;
                    String str11 = str6;
                    AnimatorSet animatorSet12 = animatorSet6;
                    c34303 = c34305;
                    marginLayoutParams5 = marginLayoutParams10;
                    c3 = c5;
                    float[] fArr48 = fArr11;
                    i6 = i23;
                    marginLayoutParams4 = marginLayoutParams8;
                    floatingActionButton4 = floatingActionButton11;
                    fArr4 = fArr48;
                    float[] fArr49 = fArr12;
                    floatingActionButton5 = floatingActionButton12;
                    fArr5 = fArr49;
                    ViewGroup.MarginLayoutParams marginLayoutParams16 = (ViewGroup.MarginLayoutParams) C7811.m20836(viewOnClickListenerC2040.f6817);
                    FloatingActionButton floatingActionButton28 = viewOnClickListenerC2040.f6817;
                    i25 = C1005.m3498(floatingActionButton28);
                    int i43 = marginLayoutParams16.topMargin;
                    int m256612 = (C0630.m2566("ܶܺ") + i20) * 7;
                    floatingActionButton13 = floatingActionButton28;
                    sArr4 = sArr4;
                    animatorSet6 = animatorSet12;
                    marginLayoutParams9 = marginLayoutParams16;
                    str6 = str11;
                    fArr8 = fArr47;
                    i21 = ((m256612 ^ i19) * (-22453)) ^ 169994135;
                    i22 = m256612 ^ (-1662195617);
                    viewOnClickListenerC2040 = this;
                    i33 = i43;
                    c5 = c3;
                    marginLayoutParams10 = marginLayoutParams5;
                    c34305 = c34303;
                    floatingActionButton8 = floatingActionButton3;
                    FloatingActionButton floatingActionButton1422222222222222 = floatingActionButton4;
                    marginLayoutParams8 = marginLayoutParams4;
                    i23 = i6;
                    fArr11 = fArr4;
                    floatingActionButton11 = floatingActionButton1422222222222222;
                    FloatingActionButton floatingActionButton1522222222222222222 = floatingActionButton5;
                    fArr12 = fArr5;
                    floatingActionButton12 = floatingActionButton1522222222222222222;
                case 1409465012:
                case 1682620091:
                    objectAnimator3 = C5695.m16025(floatingActionButton9, str7, fArr10);
                    float[] fArr50 = new float[i24];
                    // fill-array-data instruction
                    fArr50[0] = 0.8f;
                    fArr50[1] = 0.0f;
                    objectAnimator2 = C5695.m16025(viewOnClickListenerC2040.f6833, str7, fArr50);
                    floatingActionButton10 = viewOnClickListenerC2040.f6827;
                    if (C7811.f24123 >= 0) {
                        floatingActionButton = floatingActionButton8;
                        str = str6;
                        animatorSet = animatorSet6;
                        c3430 = c34305;
                        marginLayoutParams = marginLayoutParams10;
                        c = c5;
                        fArr = fArr12;
                        floatingActionButton2 = floatingActionButton12;
                        int m256672222 = (C0630.m2566("᩷ۗ") ^ i20) * (-55);
                        fArr2 = fArr;
                        i2 = ((m256672222 ^ i19) * (-25711)) ^ 528287931;
                        i22 = m256672222 ^ 1953593808;
                        animatorSet6 = animatorSet;
                        str6 = str;
                        i21 = i2;
                        c5 = c;
                        marginLayoutParams10 = marginLayoutParams;
                        c34305 = c3430;
                        floatingActionButton8 = floatingActionButton;
                        FloatingActionButton floatingActionButton1922222 = floatingActionButton2;
                        fArr12 = fArr2;
                        floatingActionButton12 = floatingActionButton1922222;
                    } else {
                        m6981 = (C2105.m6981("֡۬") + i19) * 13;
                        i4 = ((m6981 ^ i20) * 21979) ^ 1830589878;
                        i5 = 1203899699;
                        i22 = m6981 ^ i5;
                        i21 = i4;
                    }
                case 1428539235:
                case 1935985941:
                    floatingActionButton3 = floatingActionButton8;
                    String str12 = str6;
                    AnimatorSet animatorSet13 = animatorSet6;
                    c34303 = c34305;
                    marginLayoutParams5 = marginLayoutParams10;
                    c3 = c5;
                    float[] fArr51 = fArr11;
                    i6 = i23;
                    marginLayoutParams4 = marginLayoutParams8;
                    floatingActionButton4 = floatingActionButton11;
                    fArr4 = fArr51;
                    float[] fArr52 = fArr12;
                    floatingActionButton5 = floatingActionButton12;
                    fArr5 = fArr52;
                    float[] fArr53 = new float[i24];
                    f = 0.0f;
                    fArr53[c6] = 0.0f;
                    fArr53[z2 ? 1 : 0] = f2;
                    sArr4 = f6807;
                    int m69819 = C2105.m6981("ܺܳ") ^ i20;
                    i11 = ((m69819 ^ i19) * 213) ^ 835605605;
                    i22 = m69819 ^ 535881939;
                    animatorSet6 = animatorSet13;
                    str6 = str12;
                    fArr8 = fArr53;
                    i21 = i11;
                    c5 = c3;
                    marginLayoutParams10 = marginLayoutParams5;
                    c34305 = c34303;
                    floatingActionButton8 = floatingActionButton3;
                    FloatingActionButton floatingActionButton14222222222222222 = floatingActionButton4;
                    marginLayoutParams8 = marginLayoutParams4;
                    i23 = i6;
                    fArr11 = fArr4;
                    floatingActionButton11 = floatingActionButton14222222222222222;
                    FloatingActionButton floatingActionButton15222222222222222222 = floatingActionButton5;
                    fArr12 = fArr5;
                    floatingActionButton12 = floatingActionButton15222222222222222222;
                default:
                    floatingActionButton2 = floatingActionButton12;
                    floatingActionButton = floatingActionButton8;
                    str = str6;
                    animatorSet = animatorSet6;
                    c3430 = c34305;
                    marginLayoutParams = marginLayoutParams10;
                    c = c5;
                    float f7 = i27 + i28;
                    fArr = new float[i24];
                    fArr[c6] = f;
                    if (C4159.f13567) {
                        int m256613 = C0630.m2566("ܰܿ") ^ i19;
                        i = ((m256613 ^ i20) * 8495) ^ (-8664362);
                        i22 = m256613 ^ 242504248;
                        f4 = f7;
                        floatingActionButton12 = floatingActionButton2;
                        fArr12 = fArr;
                        c5 = c;
                        marginLayoutParams10 = marginLayoutParams;
                        c34305 = c3430;
                        floatingActionButton8 = floatingActionButton;
                        AnimatorSet animatorSet72222 = animatorSet;
                        str6 = str;
                        i21 = i;
                        animatorSet6 = animatorSet72222;
                    } else {
                        f4 = f7;
                        int m2566722222 = (C0630.m2566("᩷ۗ") ^ i20) * (-55);
                        fArr2 = fArr;
                        i2 = ((m2566722222 ^ i19) * (-25711)) ^ 528287931;
                        i22 = m2566722222 ^ 1953593808;
                        animatorSet6 = animatorSet;
                        str6 = str;
                        i21 = i2;
                        c5 = c;
                        marginLayoutParams10 = marginLayoutParams;
                        c34305 = c3430;
                        floatingActionButton8 = floatingActionButton;
                        FloatingActionButton floatingActionButton19222222 = floatingActionButton2;
                        fArr12 = fArr2;
                        floatingActionButton12 = floatingActionButton19222222;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3430 c3430;
        int m2566;
        int i;
        int i2;
        C3430 c34302;
        int i3;
        Object[] objArr;
        Object[] objArr2;
        short[] sArr;
        int m6981;
        int i4;
        int m25662;
        int i5;
        int i6;
        int i7;
        int m69812;
        int i8;
        int i9;
        C3430 c34303;
        Object[] objArr3;
        Object[] objArr4;
        short[] sArr2;
        int m5737;
        int m69813;
        int i10;
        int i11;
        int i12;
        int i13;
        short[] sArr3;
        int m69814;
        int i14;
        int m25663;
        int i15;
        C3430 c34304;
        final ViewOnClickListenerC2040 viewOnClickListenerC2040 = this;
        int i16 = 0;
        int i17 = 778863851;
        int i18 = C3746.f11829;
        int i19 = C1128.f4106;
        int m69815 = C2105.m6981("᩸ܺ") ^ i19;
        int i20 = ((m69815 ^ i18) * (-27255)) ^ 785804308;
        int i21 = m69815 ^ 1362057011;
        Object obj = null;
        C19258 c19258 = null;
        C19258 c192582 = null;
        C3430 c34305 = null;
        InterfaceC10798 interfaceC10798 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        boolean z = false;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        short s = 0;
        Object[] objArr5 = null;
        String str = null;
        String str2 = null;
        C3430 c34306 = null;
        int i31 = 0;
        C3430 c34307 = null;
        Object[] objArr6 = null;
        int i32 = 0;
        while (true) {
            i17 = i21 ^ (i20 & (((i17 ^ i18) * (-26289)) >> 31));
            switch (i17) {
                case -2102070109:
                case -1093675203:
                    C2105.m6982();
                    if (!C2272.f7362) {
                        m2566 = C2105.m6981("ۛ᩸") ^ i18;
                        i = ((m2566 ^ i19) * (-29777)) ^ 1537820105;
                        i2 = 73028565;
                        i21 = m2566 ^ i2;
                        i20 = i;
                    }
                    m2566 = C0630.m2566("ᩴܰ") ^ i19;
                    i = ((m2566 ^ i18) * 31359) ^ 1997820776;
                    i2 = -2019970619;
                    i21 = m2566 ^ i2;
                    i20 = i;
                case -2073572423:
                case -1225119929:
                    if (viewOnClickListenerC2040.f6815.f10838 == 0) {
                        m2566 = C0630.m2566("᩶ۡ") ^ i18;
                        i = ((m2566 ^ i19) * 5919) ^ 1026852433;
                        i2 = 153014076;
                        i21 = m2566 ^ i2;
                        i20 = i;
                    }
                    m2566 = C2105.m6981("᩷ۨ") ^ i19;
                    i = ((m2566 ^ i18) * (-29275)) ^ 1020666796;
                    i2 = 615550700;
                    i21 = m2566 ^ i2;
                    i20 = i;
                case -2000237192:
                case -1260883938:
                    c34302 = c34305;
                    i7 = i32;
                    i3 = i30;
                    objArr = objArr6;
                    objArr2 = objArr5;
                    sArr = sArr4;
                    i26 = 16909;
                    m69812 = C2105.m6981("۬ܰ") ^ i19;
                    i8 = ((m69812 ^ i18) * (-27187)) ^ (-2125819317);
                    i9 = 788452160;
                    i13 = m69812 ^ i9;
                    i32 = i7;
                    sArr4 = sArr;
                    viewOnClickListenerC2040 = this;
                    objArr5 = objArr2;
                    objArr6 = objArr;
                    i30 = i3;
                    c34304 = c34302;
                    i21 = i13;
                    i20 = i8;
                    c34305 = c34304;
                case -1990401809:
                case -1641440818:
                    c34302 = c34305;
                    i3 = i30;
                    objArr = objArr6;
                    objArr2 = objArr5;
                    sArr = sArr4;
                    i25 = C2105.m6981(C1504.m5177(f6807, 454, 3, i26)) ^ 2099942991;
                    z = false;
                    z = false;
                    i7 = i32;
                    if (i3 == i7) {
                        m69812 = (C2105.m6981("۟ۚ") ^ i19) * 101;
                        i8 = ((m69812 ^ i18) * 21037) ^ 80486344;
                        i9 = -338497210;
                    } else {
                        m69812 = C0630.m2566("ܿۚ") ^ i18;
                        i8 = ((m69812 ^ i19) * (-10249)) ^ 201275138;
                        i9 = 96908087;
                    }
                    i13 = m69812 ^ i9;
                    i32 = i7;
                    sArr4 = sArr;
                    viewOnClickListenerC2040 = this;
                    objArr5 = objArr2;
                    objArr6 = objArr;
                    i30 = i3;
                    c34304 = c34302;
                    i21 = i13;
                    i20 = i8;
                    c34305 = c34304;
                case -1960006631:
                case 1875164402:
                    viewOnClickListenerC2040.f6814 = z;
                    viewOnClickListenerC2040.m6664(z);
                    m2566 = C2105.m6981("᩷ۨ") ^ i19;
                    i = ((m2566 ^ i18) * (-29275)) ^ 1020666796;
                    i2 = 615550700;
                    i21 = m2566 ^ i2;
                    i20 = i;
                case -1893823183:
                case 1008824374:
                    if (C2105.m6982() != 0) {
                        c34302 = c34305;
                        i3 = i30;
                        objArr = objArr6;
                        objArr2 = objArr5;
                        sArr = sArr4;
                        m6981 = (C0630.m2566("ۡܶ") ^ i18) * (-17);
                        i20 = ((m6981 ^ i19) * 32401) ^ (-2121802972);
                        i4 = -1812710104;
                        i6 = m6981 ^ i4;
                        sArr4 = sArr;
                        c34305 = c34302;
                        i21 = i6;
                        objArr5 = objArr2;
                        objArr6 = objArr;
                        viewOnClickListenerC2040 = this;
                        i30 = i3;
                    } else {
                        m2566 = (C0630.m2566("᩷۫") ^ i19) * (-125);
                        i = ((m2566 ^ i18) * 29687) ^ 149993347;
                        i2 = 751750353;
                        i21 = m2566 ^ i2;
                        i20 = i;
                    }
                case -1857353461:
                case 1586694838:
                    c34302 = c34305;
                    i3 = i30;
                    if (viewOnClickListenerC2040.f6821.m2038() == 0) {
                        m25663 = (C2105.m6981("ۢ֫") ^ i18) * (-75);
                        i8 = ((m25663 ^ i19) * (-7237)) ^ (-941269629);
                        i15 = 1244670392;
                    } else {
                        m25663 = (C0630.m2566("ۨܿ") + i19) * 55;
                        i8 = ((m25663 ^ i18) * (-3933)) ^ (-654092695);
                        i15 = -422902338;
                    }
                    i13 = m25663 ^ i15;
                    i30 = i3;
                    c34304 = c34302;
                    i21 = i13;
                    i20 = i8;
                    c34305 = c34304;
                case -1839336268:
                case -1717795376:
                    str2 = C4075.m12262(viewOnClickListenerC2040, C0630.m2566(C2958.m9031(sArr5, 469, 3, i26)) ^ 2122399246, objArr6);
                    if (C3019.f9544 < 0) {
                        m2566 = (i18 - C2105.m6981("᩵ۛ")) * 25;
                        i = ((m2566 ^ i19) * 7927) ^ 876841211;
                        i2 = -1048100999;
                        i21 = m2566 ^ i2;
                        i20 = i;
                    }
                    m2566 = C0630.m2566("ۙۘ") ^ i19;
                    i = ((m2566 ^ i18) * 19503) ^ 1933166506;
                    i2 = -1633787441;
                    i21 = m2566 ^ i2;
                    i20 = i;
                case -1776632552:
                case -301041764:
                    C4616.m13552();
                    c34302 = c34305;
                    i3 = i30;
                    objArr = objArr6;
                    objArr2 = objArr5;
                    sArr = sArr4;
                    m6981 = (C0630.m2566("ۡܶ") ^ i18) * (-17);
                    i20 = ((m6981 ^ i19) * 32401) ^ (-2121802972);
                    i4 = -1812710104;
                    i6 = m6981 ^ i4;
                    sArr4 = sArr;
                    c34305 = c34302;
                    i21 = i6;
                    objArr5 = objArr2;
                    objArr6 = objArr;
                    viewOnClickListenerC2040 = this;
                    i30 = i3;
                case -1753118139:
                case -676934694:
                    ViewOnClickListenerC1958.m6434(c34306.f10837);
                    viewOnClickListenerC2040.f6835 = -1;
                    if (viewOnClickListenerC2040.f6822.f10838 == 0) {
                        m2566 = (C0630.m2566("ۙ᩵") + i19) * 67;
                        i = ((m2566 ^ i18) * 1861) ^ 1491803059;
                        i2 = -1942576181;
                        i21 = m2566 ^ i2;
                        i20 = i;
                    }
                    m2566 = C2105.m6981("᩷ۨ") ^ i19;
                    i = ((m2566 ^ i18) * (-29275)) ^ 1020666796;
                    i2 = 615550700;
                    i21 = m2566 ^ i2;
                    i20 = i;
                case -1641595596:
                case 1652815309:
                    C4616.m13552();
                    if (C2272.f7362) {
                        c34303 = c34305;
                        m5737 = i30;
                        objArr3 = objArr6;
                        objArr4 = objArr5;
                        sArr2 = sArr4;
                        m69813 = C0630.m2566("ۢۙ") ^ i18;
                        i10 = ((m69813 ^ i19) * (-13233)) ^ 1926627552;
                        i11 = 1014942486;
                        int i33 = m69813 ^ i11;
                        sArr4 = sArr2;
                        c34305 = c34303;
                        i21 = i33;
                        i20 = i10;
                        objArr5 = objArr4;
                        objArr6 = objArr3;
                        i30 = m5737;
                        viewOnClickListenerC2040 = this;
                    } else {
                        c34302 = c34305;
                        i3 = i30;
                        sArr3 = sArr4;
                        objArr = objArr6;
                        objArr2 = objArr5;
                        int m25664 = C0630.m2566("ۤۖ") ^ i18;
                        short[] sArr6 = sArr3;
                        i20 = ((m25664 ^ i19) * 4937) ^ 368606095;
                        sArr4 = sArr6;
                        objArr5 = objArr2;
                        objArr6 = objArr;
                        i30 = i3;
                        c34304 = c34302;
                        i21 = m25664 ^ (-853735883);
                        c34305 = c34304;
                    }
                case -1636531639:
                case -383066293:
                    c34302 = c34305;
                    String str3 = str;
                    i3 = i30;
                    objArr = objArr6;
                    Object[] objArr7 = new Object[i22];
                    objArr7[z ? 1 : 0] = C3245.m9931(i31 + c34307.f10838);
                    sArr4 = f6807;
                    if (C1504.f5354) {
                        objArr5 = objArr7;
                        str = str3;
                        i12 = i32;
                        int m25665 = (C0630.m2566("ܳ᩷") + i19) * (-19);
                        i8 = ((m25665 ^ i18) * (-14509)) ^ (-572909435);
                        i13 = m25665 ^ (-521194559);
                        i32 = i12;
                        objArr6 = objArr;
                        viewOnClickListenerC2040 = this;
                        i30 = i3;
                        c34304 = c34302;
                        i21 = i13;
                        i20 = i8;
                        c34305 = c34304;
                    } else {
                        int m25666 = C0630.m2566("ۜ᩶") ^ i18;
                        objArr5 = objArr7;
                        i20 = ((m25666 ^ i19) * (-27515)) ^ (-927928089);
                        str = str3;
                        c34305 = c34302;
                        i21 = m25666 ^ 456623249;
                        objArr6 = objArr;
                        i30 = i3;
                    }
                case -1608735744:
                case -947474796:
                    if (C0483.m2123(interfaceC10798)) {
                        m2566 = (C2105.m6981("ۛܿ") + i18) * (-5);
                        i = ((m2566 ^ i19) * (-30657)) ^ (-570435484);
                        i2 = 240795681;
                    } else {
                        m2566 = (C2105.m6981("ᩴۤ") ^ i19) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((m2566 ^ i18) * (-15401)) ^ 1691504660;
                        i2 = -1177589166;
                    }
                    i21 = m2566 ^ i2;
                    i20 = i;
                case -1536373195:
                case 741847669:
                    m6697();
                    break;
                case -1413180766:
                case -727451078:
                    C22628.m50615();
                    if (RunnableC3474.f10992 > 0) {
                        c34302 = c34305;
                        i3 = i30;
                        objArr = objArr6;
                        objArr2 = objArr5;
                        sArr = sArr4;
                        m6981 = (C0630.m2566("ۡܶ") ^ i18) * (-17);
                        i20 = ((m6981 ^ i19) * 32401) ^ (-2121802972);
                        i4 = -1812710104;
                        i6 = m6981 ^ i4;
                        sArr4 = sArr;
                        c34305 = c34302;
                        i21 = i6;
                        objArr5 = objArr2;
                        objArr6 = objArr;
                        viewOnClickListenerC2040 = this;
                        i30 = i3;
                    } else {
                        m2566 = C0630.m2566("ᩴܰ") ^ i19;
                        i = ((m2566 ^ i18) * 31359) ^ 1997820776;
                        i2 = -2019970619;
                        i21 = m2566 ^ i2;
                        i20 = i;
                    }
                case -1343616742:
                case 843463703:
                    c3430 = viewOnClickListenerC2040.f6815;
                    c34306 = c3430;
                    m2566 = (i19 - C2105.m6981("֨ܺ")) * (-89);
                    i = ((m2566 ^ i18) * 10301) ^ 988234845;
                    i2 = 797168720;
                    i21 = m2566 ^ i2;
                    i20 = i;
                case -1212669383:
                case 1780323299:
                    c34302 = c34305;
                    String str4 = str;
                    i3 = i30;
                    objArr = objArr6;
                    objArr2 = objArr5;
                    short[] sArr7 = sArr4;
                    int i34 = DialogInterfaceC0206.f1451;
                    C19258 c192583 = new C19258(viewOnClickListenerC2040);
                    C0382.m1849(c192583, i25);
                    int i35 = viewOnClickListenerC2040.f6822.f10838;
                    C3430 c34308 = viewOnClickListenerC2040.f6815;
                    if (C2105.m6982() != 0) {
                        str = str4;
                        i12 = i32;
                        c19258 = c192583;
                        i31 = i35;
                        sArr4 = sArr7;
                        c34307 = c34308;
                        objArr5 = objArr2;
                        int m256652 = (C0630.m2566("ܳ᩷") + i19) * (-19);
                        i8 = ((m256652 ^ i18) * (-14509)) ^ (-572909435);
                        i13 = m256652 ^ (-521194559);
                        i32 = i12;
                        objArr6 = objArr;
                        viewOnClickListenerC2040 = this;
                        i30 = i3;
                        c34304 = c34302;
                        i21 = i13;
                        i20 = i8;
                        c34305 = c34304;
                    } else {
                        int m25667 = (C0630.m2566("֡ۜ") + i18) * (-105);
                        int i36 = ((m25667 ^ i19) * (-6143)) ^ 1624222986;
                        str = str4;
                        sArr4 = sArr7;
                        c34305 = c34302;
                        objArr5 = objArr2;
                        i21 = m25667 ^ 1323447689;
                        objArr6 = objArr;
                        i30 = i3;
                        c19258 = c192583;
                        i31 = i35;
                        c34307 = c34308;
                        i20 = i36;
                        viewOnClickListenerC2040 = this;
                    }
                case -1200021672:
                case 1631594820:
                    AbstractC2021.m6574();
                    C3019.m9255();
                    break;
                case -1101536866:
                case 1666895895:
                    c34302 = c34305;
                    i7 = i32;
                    i3 = i30;
                    objArr = objArr6;
                    objArr2 = objArr5;
                    sArr = sArr4;
                    i26 = 48922;
                    m69812 = C2105.m6981("۬ܰ") ^ i19;
                    i8 = ((m69812 ^ i18) * (-27187)) ^ (-2125819317);
                    i9 = 788452160;
                    i13 = m69812 ^ i9;
                    i32 = i7;
                    sArr4 = sArr;
                    viewOnClickListenerC2040 = this;
                    objArr5 = objArr2;
                    objArr6 = objArr;
                    i30 = i3;
                    c34304 = c34302;
                    i21 = i13;
                    i20 = i8;
                    c34305 = c34304;
                case -982037121:
                case 268404064:
                    objArr6 = new Object[i22];
                    objArr6[z ? 1 : 0] = C3245.m9931(i27 + c34305.f10838);
                    sArr5 = f6807;
                    if (C3432.m10477() > 0) {
                        m2566 = (C2105.m6981("ܿۖ") + i18) * (-43);
                        i = ((m2566 ^ i19) * (-16123)) ^ (-693454544);
                        i2 = 549807452;
                        i21 = m2566 ^ i2;
                        i20 = i;
                    }
                    m2566 = C0630.m2566("ۙۘ") ^ i19;
                    i = ((m2566 ^ i18) * 19503) ^ 1933166506;
                    i2 = -1633787441;
                    i21 = m2566 ^ i2;
                    i20 = i;
                case -882874946:
                case 233137724:
                    C3019.m9252(c192582, str2);
                    ViewOnClickListenerC1958.m6441(c192582, i24, new DialogInterface.OnClickListener() { // from class: l.ۤۘ᩷
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i37) {
                            int i38 = 1827905944;
                            int i39 = RunnableC0588.f2309;
                            int i40 = C0630.f2410;
                            int m25668 = (i40 - C0630.m2566("ᩳ᩻")) * 49;
                            int i41 = ((m25668 ^ i39) * 2779) ^ (-1260852871);
                            int i42 = 586971397;
                            while (true) {
                                i38 = ((((i38 ^ i39) * 4783) >> 31) & i41) ^ (m25668 ^ i42);
                                switch (i38) {
                                    case -2085376764:
                                    case -1292312239:
                                        if (C3663.f11553) {
                                            m25668 = C2105.m6981("ۨܳ") ^ i40;
                                            i41 = ((m25668 ^ i39) * 26647) ^ (-1938657842);
                                            i42 = -1625272392;
                                        } else {
                                            m25668 = (i39 - C2105.m6981("ܿ᩸")) * 27;
                                            i41 = ((m25668 ^ i40) * (-19157)) ^ (-1609380225);
                                            i42 = 261906910;
                                        }
                                    case -2072672959:
                                    case 1707766248:
                                        if (C4075.m12263() <= 0) {
                                            m25668 = C0630.m2566("ۙۢ") ^ i39;
                                            i41 = ((m25668 ^ i40) * (-8963)) ^ (-734270905);
                                            i42 = 659099127;
                                        } else {
                                            m25668 = (C0630.m2566("᩶ܶ") + i39) * 19;
                                            i41 = ((m25668 ^ i40) * 16917) ^ 1709984456;
                                            i42 = -1858324619;
                                        }
                                    case -1837375527:
                                    case -964165037:
                                        C5695.m16023();
                                        break;
                                    case -1771146303:
                                    case -379817973:
                                        if (RunnableC1937.f6483 >= 0) {
                                            m25668 = C0630.m2566("ۙۢ") ^ i39;
                                            i41 = ((m25668 ^ i40) * (-8963)) ^ (-734270905);
                                            i42 = 659099127;
                                        } else {
                                            m25668 = C0630.m2566("᩸ۖ") ^ i40;
                                            i41 = ((m25668 ^ i39) * (-15731)) ^ 1118247143;
                                            i42 = -1812041652;
                                        }
                                    case -1614578312:
                                    case -917658540:
                                        if (C2958.f9394 >= 0) {
                                            m25668 = (i39 - C0630.m2566("ۧᩳ")) * (-99);
                                            i41 = ((m25668 ^ i40) * (-685)) ^ 246691017;
                                            i42 = -510474546;
                                        } else {
                                            m25668 = C0630.m2566("ۙۢ") ^ i39;
                                            i41 = ((m25668 ^ i40) * (-8963)) ^ (-734270905);
                                            i42 = 659099127;
                                        }
                                    case -1609003674:
                                    case 1858364674:
                                        if (ViewOnClickListenerC1958.m6429() >= 0) {
                                            m25668 = C0630.m2566("۬ۤ") ^ i39;
                                            i41 = ((m25668 ^ i40) * (-5743)) ^ (-1320850453);
                                            i42 = 1890013916;
                                        } else {
                                            m25668 = (i40 - C0630.m2566("ۡܺ")) * (-113);
                                            i41 = ((m25668 ^ i39) * (-23461)) ^ 734110509;
                                            i42 = 906793648;
                                        }
                                    case -1595445464:
                                    case 1465866392:
                                        if (C2272.f7362) {
                                            m25668 = C0630.m2566("ۙۢ") ^ i39;
                                            i41 = ((m25668 ^ i40) * (-8963)) ^ (-734270905);
                                            i42 = 659099127;
                                        } else {
                                            m25668 = (i40 - C2105.m6981("֡᩻")) * (-111);
                                            i41 = ((m25668 ^ i39) * 27047) ^ (-1867362308);
                                            i42 = 703258701;
                                        }
                                    case -1095620239:
                                    case 868786166:
                                        if (C1916.f6442) {
                                            m25668 = C2105.m6981("ۨܳ") ^ i40;
                                            i41 = ((m25668 ^ i39) * 26647) ^ (-1938657842);
                                            i42 = -1625272392;
                                        } else {
                                            m25668 = (i39 - C0630.m2566("ۧᩳ")) * (-99);
                                            i41 = ((m25668 ^ i40) * (-685)) ^ 246691017;
                                            i42 = -510474546;
                                        }
                                    case -1002071337:
                                    case -143005850:
                                        ViewOnClickListenerC2040.m6696(ViewOnClickListenerC2040.this);
                                        break;
                                    case -980386379:
                                    case 515594741:
                                        C0714.m2805();
                                        m25668 = (i39 - C0630.m2566("ۧᩳ")) * (-99);
                                        i41 = ((m25668 ^ i40) * (-685)) ^ 246691017;
                                        i42 = -510474546;
                                    case -778606135:
                                    case 2043130747:
                                        if (C2105.f7037 != 0) {
                                            m25668 = C0630.m2566("᩸ۖ") ^ i40;
                                            i41 = ((m25668 ^ i39) * (-15731)) ^ 1118247143;
                                            i42 = -1812041652;
                                        } else {
                                            m25668 = C0630.m2566("ܿ֫") ^ i40;
                                            i41 = ((m25668 ^ i39) * (-8985)) ^ (-1147726154);
                                            i42 = -397875109;
                                        }
                                    case -224179025:
                                    case 853875212:
                                        if (C1005.f3721) {
                                            m25668 = C0630.m2566("ۢ֡") ^ i39;
                                            i41 = ((m25668 ^ i40) * 1843) ^ (-320537656);
                                            i42 = -223584596;
                                        } else {
                                            m25668 = C0630.m2566("۬ۤ") ^ i39;
                                            i41 = ((m25668 ^ i40) * (-5743)) ^ (-1320850453);
                                            i42 = 1890013916;
                                        }
                                    case -144394217:
                                    case -53652728:
                                        if (AbstractC2021.f6743 <= 0) {
                                            m25668 = C0630.m2566("۬ۤ") ^ i39;
                                            i41 = ((m25668 ^ i40) * (-5743)) ^ (-1320850453);
                                            i42 = 1890013916;
                                        } else {
                                            m25668 = C2105.m6981("ᩳܽ") ^ i40;
                                            i41 = ((m25668 ^ i39) * 14731) ^ 718426192;
                                            i42 = -1628025157;
                                        }
                                    case 47338408:
                                    case 893819627:
                                        if (C4263.f13799 <= 0) {
                                            m25668 = C0630.m2566("ۙۢ") ^ i39;
                                            i41 = ((m25668 ^ i40) * (-8963)) ^ (-734270905);
                                            i42 = 659099127;
                                        } else {
                                            m25668 = (C2105.m6981("֨ᩴ") ^ i39) * 7;
                                            i41 = ((m25668 ^ i40) * 1947) ^ (-1289498299);
                                            i42 = 1528437175;
                                        }
                                    case 1800895484:
                                    case 2100059222:
                                        if (C3683.f11629 >= 0) {
                                            m25668 = C0630.m2566("ۙۢ") ^ i39;
                                            i41 = ((m25668 ^ i40) * (-8963)) ^ (-734270905);
                                            i42 = 659099127;
                                        } else {
                                            m25668 = C0630.m2566("ۛۜ") ^ i40;
                                            i41 = ((m25668 ^ i39) * 29989) ^ (-361931797);
                                            i42 = 1878437580;
                                        }
                                    default:
                                        if (C3746.f11829 <= 0) {
                                            m25668 = C0630.m2566("᩸ۖ") ^ i40;
                                            i41 = ((m25668 ^ i39) * (-15731)) ^ 1118247143;
                                            i42 = -1812041652;
                                        } else {
                                            m25668 = (i39 - C2105.m6981("֫ܽ")) * 43;
                                            i41 = ((m25668 ^ i40) * (-16129)) ^ 2142033847;
                                            i42 = -1972736217;
                                        }
                                }
                                return;
                            }
                        }
                    });
                    C5695.m16035(c192582, i23, obj);
                    RunnableC0588.m2438(c192582);
                    c34302 = c34305;
                    i3 = i30;
                    m25663 = (i18 - C0630.m2566("ۛ۟")) * (-11);
                    i8 = ((m25663 ^ i19) * (-32639)) ^ 154228753;
                    i15 = 1763224002;
                    i13 = m25663 ^ i15;
                    i30 = i3;
                    c34304 = c34302;
                    i21 = i13;
                    i20 = i8;
                    c34305 = c34304;
                case -665624716:
                case -16717432:
                    c34302 = c34305;
                    i3 = i30;
                    objArr = objArr6;
                    objArr2 = objArr5;
                    sArr = sArr4;
                    short s2 = s;
                    if ((s2 * 4940) - (i16 + 6100900) > 0) {
                        m25662 = C2105.m6981("ᩳܺ") ^ i18;
                        i20 = ((m25662 ^ i19) * 20781) ^ 1968124580;
                        i5 = -300106054;
                    } else {
                        m25662 = C0630.m2566("᩷ۢ") ^ i18;
                        i20 = ((m25662 ^ i19) * 17309) ^ (-1251400441);
                        i5 = -661810640;
                    }
                    i6 = m25662 ^ i5;
                    s = s2;
                    sArr4 = sArr;
                    c34305 = c34302;
                    i21 = i6;
                    objArr5 = objArr2;
                    objArr6 = objArr;
                    viewOnClickListenerC2040 = this;
                    i30 = i3;
                case -489510454:
                case 1504209721:
                    c34302 = c34305;
                    i3 = i30;
                    objArr = objArr6;
                    objArr2 = objArr5;
                    sArr = sArr4;
                    s = f6807[444];
                    i16 = s * s;
                    if (C2167.f7158 < 0) {
                        m6981 = C2105.m6981("᩸ܰ") ^ i19;
                        i20 = ((m6981 ^ i18) * 24795) ^ (-237621877);
                        i4 = -142092808;
                        i6 = m6981 ^ i4;
                        sArr4 = sArr;
                        c34305 = c34302;
                        i21 = i6;
                        objArr5 = objArr2;
                        objArr6 = objArr;
                        viewOnClickListenerC2040 = this;
                        i30 = i3;
                    }
                    m6981 = (C0630.m2566("ۡܶ") ^ i18) * (-17);
                    i20 = ((m6981 ^ i19) * 32401) ^ (-2121802972);
                    i4 = -1812710104;
                    i6 = m6981 ^ i4;
                    sArr4 = sArr;
                    c34305 = c34302;
                    i21 = i6;
                    objArr5 = objArr2;
                    objArr6 = objArr;
                    viewOnClickListenerC2040 = this;
                    i30 = i3;
                case -474490222:
                case 645531980:
                    c34303 = c34305;
                    objArr3 = objArr6;
                    objArr4 = objArr5;
                    sArr2 = sArr4;
                    m5737 = C1711.m5737(view);
                    i32 = C2105.m6981(C0714.m2816(f6807, 445, 3, i26)) ^ 2128992098;
                    i22 = 1;
                    if (C1916.m6308() < 0) {
                        m69813 = C2105.m6981("ᩳ۫") ^ i18;
                        i10 = ((m69813 ^ i19) * 22697) ^ 682361807;
                        i11 = 2045098600;
                        int i332 = m69813 ^ i11;
                        sArr4 = sArr2;
                        c34305 = c34303;
                        i21 = i332;
                        i20 = i10;
                        objArr5 = objArr4;
                        objArr6 = objArr3;
                        i30 = m5737;
                        viewOnClickListenerC2040 = this;
                    }
                    m69813 = C0630.m2566("ۢۙ") ^ i18;
                    i10 = ((m69813 ^ i19) * (-13233)) ^ 1926627552;
                    i11 = 1014942486;
                    int i3322 = m69813 ^ i11;
                    sArr4 = sArr2;
                    c34305 = c34303;
                    i21 = i3322;
                    i20 = i10;
                    objArr5 = objArr4;
                    objArr6 = objArr3;
                    i30 = m5737;
                    viewOnClickListenerC2040 = this;
                case -437939813:
                case -39066953:
                    break;
                case -425419714:
                case 61344568:
                    int i37 = DialogInterfaceC0206.f1451;
                    c192582 = new C19258(viewOnClickListenerC2040);
                    C3432.m10490(c192582, i25);
                    int i38 = viewOnClickListenerC2040.f6822.f10838;
                    c34305 = viewOnClickListenerC2040.f6815;
                    if (C0382.f1805) {
                        int m25668 = (i19 - C0630.m2566("᩺۟")) * q.h;
                        i27 = i38;
                        i20 = ((m25668 ^ i18) * 13785) ^ 1761659965;
                        i21 = m25668 ^ 689711223;
                    } else {
                        i27 = i38;
                        m2566 = (C0630.m2566("᩷۫") ^ i19) * (-125);
                        i = ((m2566 ^ i18) * 29687) ^ 149993347;
                        i2 = 751750353;
                        i21 = m2566 ^ i2;
                        i20 = i;
                    }
                case -366270978:
                case 19425949:
                    m6674();
                    break;
                case -202962798:
                case 1438660531:
                    C4841 c4841 = (C4841) C2272.m7513(interfaceC10798);
                    c4841.m14085((c4841.f15294 ? 1 : 0) ^ i22);
                    m2566 = (C2105.m6981("ۗ۫") + i18) * (-89);
                    i = ((m2566 ^ i19) * 29833) ^ (-2134686357);
                    i2 = -1640682097;
                    i21 = m2566 ^ i2;
                    i20 = i;
                case -113661179:
                case 1359714241:
                    if (C4263.f13799 <= 0) {
                        c34302 = c34305;
                        i3 = i30;
                        objArr = objArr6;
                        objArr2 = objArr5;
                        sArr = sArr4;
                        m6981 = (C0630.m2566("ۡܶ") ^ i18) * (-17);
                        i20 = ((m6981 ^ i19) * 32401) ^ (-2121802972);
                        i4 = -1812710104;
                        i6 = m6981 ^ i4;
                        sArr4 = sArr;
                        c34305 = c34302;
                        i21 = i6;
                        objArr5 = objArr2;
                        objArr6 = objArr;
                        viewOnClickListenerC2040 = this;
                        i30 = i3;
                    } else {
                        c34303 = c34305;
                        m5737 = i30;
                        objArr3 = objArr6;
                        objArr4 = objArr5;
                        sArr2 = sArr4;
                        m69813 = C0630.m2566("ۢۙ") ^ i18;
                        i10 = ((m69813 ^ i19) * (-13233)) ^ 1926627552;
                        i11 = 1014942486;
                        int i33222 = m69813 ^ i11;
                        sArr4 = sArr2;
                        c34305 = c34303;
                        i21 = i33222;
                        i20 = i10;
                        objArr5 = objArr4;
                        objArr6 = objArr3;
                        i30 = m5737;
                        viewOnClickListenerC2040 = this;
                    }
                case -67339564:
                case 521814739:
                    C19258 c192584 = c19258;
                    C3019.m9252(c192584, str);
                    ViewOnClickListenerC1958.m6441(c192584, i24, new DialogInterfaceOnClickListenerC0145(i22, viewOnClickListenerC2040));
                    C5695.m16035(c192584, i23, obj);
                    RunnableC0588.m2438(c192584);
                    break;
                case -40094671:
                case 1838392407:
                    c34302 = c34305;
                    i3 = i30;
                    if (i3 == (C0630.m2566(C4616.m13542(f6807, 466, 3, i26)) ^ 2097954048)) {
                        m25663 = (i19 - C2105.m6981("۬ᩳ")) * (-77);
                        i8 = ((m25663 ^ i18) * 10159) ^ 1584520460;
                        i15 = 1933192395;
                        i13 = m25663 ^ i15;
                        i30 = i3;
                        c34304 = c34302;
                        i21 = i13;
                        i20 = i8;
                        c34305 = c34304;
                    }
                    m25663 = (i18 - C0630.m2566("ۛ۟")) * (-11);
                    i8 = ((m25663 ^ i19) * (-32639)) ^ 154228753;
                    i15 = 1763224002;
                    i13 = m25663 ^ i15;
                    i30 = i3;
                    c34304 = c34302;
                    i21 = i13;
                    i20 = i8;
                    c34305 = c34304;
                case 131939604:
                case 635113578:
                    interfaceC10798 = c34306.f10837.f65733.listIterator(z ? 1 : 0);
                    m2566 = (C2105.m6981("ۗ۫") + i18) * (-89);
                    i = ((m2566 ^ i19) * 29833) ^ (-2134686357);
                    i2 = -1640682097;
                    i21 = m2566 ^ i2;
                    i20 = i;
                case 344428369:
                case 1662983337:
                    c34302 = c34305;
                    i3 = i30;
                    objArr = objArr6;
                    objArr2 = objArr5;
                    sArr = sArr4;
                    if (i3 == (C2105.m6981(RunnableC1108.m3789(f6807, 457, 3, i26)) ^ 2125492363)) {
                        m6981 = (C0630.m2566("ۖܰ") ^ i18) * (-35);
                        i20 = ((m6981 ^ i19) * 16967) ^ 1993142160;
                        i4 = 1628163368;
                    } else {
                        m6981 = (C2105.m6981("ܿܺ") + i19) * (-85);
                        i20 = ((m6981 ^ i18) * (-24021)) ^ 1492521326;
                        i4 = 914996691;
                    }
                    i6 = m6981 ^ i4;
                    sArr4 = sArr;
                    c34305 = c34302;
                    i21 = i6;
                    objArr5 = objArr2;
                    objArr6 = objArr;
                    viewOnClickListenerC2040 = this;
                    i30 = i3;
                case 492163890:
                case 1313089776:
                    c34302 = c34305;
                    i3 = i30;
                    objArr = objArr6;
                    if (i3 == (C0630.m2566(C2167.m7159(f6807, 463, 3, i26)) ^ 2120995902)) {
                        m69814 = C0630.m2566("۠ۡ") ^ i19;
                        i8 = ((m69814 ^ i18) * (-32763)) ^ (-1254190913);
                        i14 = -491782601;
                    } else {
                        m69814 = (C2105.m6981("֡᩷") + i18) * 79;
                        i8 = ((m69814 ^ i19) * 5425) ^ 1118222251;
                        i14 = 1087878820;
                    }
                    i13 = m69814 ^ i14;
                    objArr6 = objArr;
                    i30 = i3;
                    c34304 = c34302;
                    i21 = i13;
                    i20 = i8;
                    c34305 = c34304;
                case 519747196:
                case 577116478:
                    c34302 = c34305;
                    i7 = i32;
                    i3 = i30;
                    objArr = objArr6;
                    objArr2 = objArr5;
                    sArr = sArr4;
                    i23 = i28 ^ i29;
                    i24 = C2105.m6981(C0714.m2816(f6807, 451, 3, i26)) ^ 2104593079;
                    if (C0050.f910 >= 0) {
                        i32 = i7;
                        m6981 = (C0630.m2566("ۡܶ") ^ i18) * (-17);
                        i20 = ((m6981 ^ i19) * 32401) ^ (-2121802972);
                        i4 = -1812710104;
                        i6 = m6981 ^ i4;
                        sArr4 = sArr;
                        c34305 = c34302;
                        i21 = i6;
                        objArr5 = objArr2;
                        objArr6 = objArr;
                        viewOnClickListenerC2040 = this;
                        i30 = i3;
                    } else {
                        m69812 = (i19 - C0630.m2566("ܰ᩸")) * 127;
                        i8 = ((m69812 ^ i18) * (-9803)) ^ 493684808;
                        i9 = -1490180018;
                        i13 = m69812 ^ i9;
                        i32 = i7;
                        sArr4 = sArr;
                        viewOnClickListenerC2040 = this;
                        objArr5 = objArr2;
                        objArr6 = objArr;
                        i30 = i3;
                        c34304 = c34302;
                        i21 = i13;
                        i20 = i8;
                        c34305 = c34304;
                    }
                case 524273749:
                case 1669061927:
                    c34302 = c34305;
                    i12 = i32;
                    i3 = i30;
                    objArr = objArr6;
                    objArr2 = objArr5;
                    short[] sArr8 = sArr4;
                    i28 = C2105.m6981(C7811.m20837(f6807, 448, 3, i26));
                    i29 = 2097466631;
                    if (C1420.m4913()) {
                        sArr4 = sArr8;
                        obj = null;
                        objArr5 = objArr2;
                        int m2566522 = (C0630.m2566("ܳ᩷") + i19) * (-19);
                        i8 = ((m2566522 ^ i18) * (-14509)) ^ (-572909435);
                        i13 = m2566522 ^ (-521194559);
                        i32 = i12;
                        objArr6 = objArr;
                        viewOnClickListenerC2040 = this;
                        i30 = i3;
                        c34304 = c34302;
                        i21 = i13;
                        i20 = i8;
                        c34305 = c34304;
                    } else {
                        int m25669 = (i19 - C0630.m2566("۬ۧ")) * 97;
                        i8 = ((m25669 ^ i18) * (-8923)) ^ 2112454826;
                        i13 = m25669 ^ 659140945;
                        i32 = i12;
                        sArr4 = sArr8;
                        obj = null;
                        viewOnClickListenerC2040 = this;
                        objArr5 = objArr2;
                        objArr6 = objArr;
                        i30 = i3;
                        c34304 = c34302;
                        i21 = i13;
                        i20 = i8;
                        c34305 = c34304;
                    }
                case 613302818:
                case 1520918468:
                    C11340.m28031();
                    if (C2272.f7362) {
                        m2566 = C0630.m2566("ۙۘ") ^ i19;
                        i = ((m2566 ^ i18) * 19503) ^ 1933166506;
                        i2 = -1633787441;
                        i21 = m2566 ^ i2;
                        i20 = i;
                    } else {
                        c34302 = c34305;
                        i3 = i30;
                        objArr = objArr6;
                        objArr2 = objArr5;
                        sArr = sArr4;
                        m6981 = (C0630.m2566("ۡܶ") ^ i18) * (-17);
                        i20 = ((m6981 ^ i19) * 32401) ^ (-2121802972);
                        i4 = -1812710104;
                        i6 = m6981 ^ i4;
                        sArr4 = sArr;
                        c34305 = c34302;
                        i21 = i6;
                        objArr5 = objArr2;
                        objArr6 = objArr;
                        viewOnClickListenerC2040 = this;
                        i30 = i3;
                    }
                case 1649662746:
                case 2112758638:
                    c34302 = c34305;
                    i3 = i30;
                    objArr = objArr6;
                    sArr3 = sArr4;
                    objArr2 = objArr5;
                    str = ServiceConnectionC3453.m10566(viewOnClickListenerC2040, C0630.m2566(C1420.m4902(sArr3, q.i, 3, i26)) ^ 2128192317, objArr2);
                    if (C7811.m20844() == 0) {
                        int m69816 = (C2105.m6981("۫᩻") + i19) * (-53);
                        i8 = ((m69816 ^ i18) * 10161) ^ (-1415920390);
                        i13 = m69816 ^ 593675067;
                        sArr4 = sArr3;
                        objArr5 = objArr2;
                        objArr6 = objArr;
                        i30 = i3;
                        c34304 = c34302;
                        i21 = i13;
                        i20 = i8;
                        c34305 = c34304;
                    }
                    int m256642 = C0630.m2566("ۤۖ") ^ i18;
                    short[] sArr62 = sArr3;
                    i20 = ((m256642 ^ i19) * 4937) ^ 368606095;
                    sArr4 = sArr62;
                    objArr5 = objArr2;
                    objArr6 = objArr;
                    i30 = i3;
                    c34304 = c34302;
                    i21 = m256642 ^ (-853735883);
                    c34305 = c34304;
                default:
                    c3430 = viewOnClickListenerC2040.f6822;
                    c34306 = c3430;
                    m2566 = (i19 - C2105.m6981("֨ܺ")) * (-89);
                    i = ((m2566 ^ i18) * 10301) ^ 988234845;
                    i2 = 797168720;
                    i21 = m2566 ^ i2;
                    i20 = i;
            }
            return;
        }
    }
}
