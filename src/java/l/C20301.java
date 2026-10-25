package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.List;

/* compiled from: 82RX */
/* renamed from: l.᩶ܽ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20301 extends AbstractC19902 {

    /* renamed from: ᩴ֫ۖ, reason: not valid java name and contains not printable characters */
    private static final short[] f65558 = {5606, -16424, -18350, 21756, 14948, 14948, 14948, 25974, 22326, 18961, 8173, 1877, -2367, -4649};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13244 f65559;

    @Override // l.AbstractC19902
    public final int getItemViewType(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 182325019;
        int i5 = C0483.f2088;
        int i6 = C5695.f17556;
        int m2566 = C0630.m2566("۟֡") ^ i6;
        int i7 = ((m2566 ^ i5) * (-2215)) ^ 1807412436;
        int i8 = 1850449695;
        while (true) {
            i4 = ((((i4 ^ i5) * (-31437)) >> 31) & i7) ^ (m2566 ^ i8);
            switch (i4) {
                case -2135645981:
                case -1705215344:
                    return i3;
                case -2014261182:
                case 2137762510:
                    RunnableC1937.m6387();
                    m2566 = (C0630.m2566("ۧ۠") ^ i6) * (-17);
                    i7 = ((m2566 ^ i5) * 19877) ^ 959998547;
                    i8 = 67194572;
                case -1978703009:
                case 318182550:
                    if (C3911.m11924() <= 0) {
                        m2566 = C2105.m6981("۠֡") ^ i5;
                        i7 = ((m2566 ^ i6) * (-11907)) ^ 707384557;
                        i8 = 817532220;
                    } else {
                        m2566 = C0630.m2566("۬۠") ^ i6;
                        i7 = ((m2566 ^ i5) * 21885) ^ 492467193;
                        i8 = -610211247;
                    }
                case -1885845629:
                case 2009483641:
                    C0630.m2564();
                    if (C3683.m11222()) {
                        m2566 = (C0630.m2566("᩶ۘ") ^ i5) * (-127);
                        i7 = ((m2566 ^ i6) * 6211) ^ 864567022;
                        i8 = -921105181;
                    } else {
                        m2566 = (C0630.m2566("ۧ۠") ^ i6) * (-17);
                        i7 = ((m2566 ^ i5) * 19877) ^ 959998547;
                        i8 = 67194572;
                    }
                case -1866400661:
                case -542588251:
                    if (C2126.f7087) {
                        m2566 = (C0630.m2566("ۗܺ") + i5) * (-27);
                        i7 = ((m2566 ^ i6) * (-24251)) ^ (-1887304809);
                        i8 = 31869937;
                    } else {
                        m2566 = C2105.m6981("ۢܺ") ^ i5;
                        i7 = ((m2566 ^ i6) * 16705) ^ 1852136965;
                        i8 = -841703923;
                    }
                case -1528319980:
                case -206000367:
                    if (C2272.f7362) {
                        m2566 = C2105.m6981("۠֡") ^ i5;
                        i7 = ((m2566 ^ i6) * (-11907)) ^ 707384557;
                        i8 = 817532220;
                    } else {
                        m2566 = (C0630.m2566("֡ۙ") ^ i6) * 21;
                        i7 = ((m2566 ^ i5) * (-23731)) ^ 1307522533;
                        i8 = -1559824496;
                    }
                case -1307205631:
                case -800387568:
                    i3 = 1;
                    if (i == i2 - 1) {
                        m2566 = C2105.m6981("ܶۘ") ^ i6;
                        i7 = ((m2566 ^ i5) * 7319) ^ (-754045527);
                        i8 = 1837328086;
                    } else {
                        m2566 = C2105.m6981("ۗۘ") ^ i5;
                        i7 = ((m2566 ^ i6) * (-14181)) ^ 2029937990;
                        i8 = -1672066707;
                    }
                case -1139749579:
                case 2118847888:
                    if (C4075.f12947 >= 0) {
                        m2566 = (C0630.m2566("᩶ۘ") ^ i5) * (-127);
                        i7 = ((m2566 ^ i6) * 6211) ^ 864567022;
                        i8 = -921105181;
                    } else {
                        m2566 = (C0630.m2566("ܶᩴ") ^ i5) * (-27);
                        i7 = ((m2566 ^ i6) * (-29493)) ^ (-1444833459);
                        i8 = 153431974;
                    }
                case -783453064:
                case 2115592183:
                    if (C0964.f3626 != 0) {
                        m2566 = (i6 - C0630.m2566("۬۫")) * (-25);
                        i7 = ((m2566 ^ i5) * (-28159)) ^ (-298239471);
                        i8 = -1569377903;
                    } else {
                        m2566 = (C0630.m2566("֨۟") + i6) * 51;
                        i7 = ((m2566 ^ i5) * 6283) ^ (-1928394285);
                        i8 = 16780616;
                    }
                case -695611989:
                case 703253654:
                    if (C2520.f8000 >= 0) {
                        m2566 = (C0630.m2566("ۧ۠") ^ i6) * (-17);
                        i7 = ((m2566 ^ i5) * 19877) ^ 959998547;
                        i8 = 67194572;
                    } else {
                        m2566 = (i6 - C0630.m2566("ܶ᩸")) * (-123);
                        i7 = ((m2566 ^ i5) * (-31901)) ^ (-1512294501);
                        i8 = -1158981604;
                    }
                case -607629966:
                case 1126150914:
                    i2 = getItemCount();
                    if (C3432.f10845 >= 0) {
                        m2566 = C2105.m6981("۠֡") ^ i5;
                        i7 = ((m2566 ^ i6) * (-11907)) ^ 707384557;
                        i8 = 817532220;
                    } else {
                        m2566 = C2105.m6981("ܿ᩷") ^ i5;
                        i7 = ((m2566 ^ i6) * 17731) ^ (-953624331);
                        i8 = 1832258842;
                    }
                case -314224182:
                case -170909788:
                    if (C0483.m2121()) {
                        m2566 = C0630.m2566("ۙۖ") ^ i5;
                        i7 = ((m2566 ^ i6) * 22967) ^ (-1301381407);
                        i8 = 9129915;
                    } else {
                        m2566 = (C0630.m2566("ۧ۠") ^ i6) * (-17);
                        i7 = ((m2566 ^ i5) * 19877) ^ 959998547;
                        i8 = 67194572;
                    }
                case -275185154:
                case 1842887890:
                    C22628.m50615();
                    if (C1047.f3863 >= 0) {
                        m2566 = (i6 - C0630.m2566("۬۫")) * (-25);
                        i7 = ((m2566 ^ i5) * (-28159)) ^ (-298239471);
                        i8 = -1569377903;
                    } else {
                        m2566 = (C0630.m2566("ۗܺ") + i5) * (-27);
                        i7 = ((m2566 ^ i6) * (-24251)) ^ (-1887304809);
                        i8 = 31869937;
                    }
                case -157972360:
                case 994669662:
                    C3537.m10746();
                    return 0;
                case -147367586:
                case 1131791759:
                    return 0;
                case 284493269:
                case 1992853103:
                    C0964.m3413();
                    if (C0964.m3413()) {
                        m2566 = (i6 - C0630.m2566("۬۫")) * (-25);
                        i7 = ((m2566 ^ i5) * (-28159)) ^ (-298239471);
                        i8 = -1569377903;
                    } else {
                        m2566 = (C0630.m2566("ۧ۠") ^ i6) * (-17);
                        i7 = ((m2566 ^ i5) * 19877) ^ 959998547;
                        i8 = 67194572;
                    }
                case 915871602:
                case 2065975851:
                    if (C3911.m11924() <= 0) {
                        m2566 = (C0630.m2566("᩶ۘ") ^ i5) * (-127);
                        i7 = ((m2566 ^ i6) * 6211) ^ 864567022;
                        i8 = -921105181;
                    } else {
                        m2566 = C2105.m6981("ۜ᩸") ^ i5;
                        i7 = ((m2566 ^ i6) * (-20255)) ^ (-1016387763);
                        i8 = 2076444939;
                    }
                default:
                    if (RunnableC1108.f4040) {
                        m2566 = C2105.m6981("۟᩸") ^ i6;
                        i7 = ((m2566 ^ i5) * 7377) ^ 990164947;
                        i8 = 7511780;
                    } else {
                        m2566 = C2105.m6981("۠֡") ^ i5;
                        i7 = ((m2566 ^ i6) * (-11907)) ^ 707384557;
                        i8 = 817532220;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (l.C7811.m20844() == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (l.C1047.m3599() < 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r0 = (r15 - l.C0630.m2566("֡۬")) * 11;
        r7 = ((r0 ^ r14) * (-25865)) ^ (-696900999);
        r17 = 113385064;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (l.C0714.f2697 < 0) goto L70;
     */
    @Override // l.AbstractC19902
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC3255 onCreateViewHolder(android.view.ViewGroup r21, int r22) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20301.onCreateViewHolder(android.view.ViewGroup, int):l.ۗ۬ۧ");
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        List list;
        List list2;
        C13244 c13244 = null;
        int i = 0;
        int i2 = -1379122285;
        int i3 = RunnableC1937.f6483;
        int i4 = C3746.f11829;
        int m6981 = (i4 - C2105.m6981("ۗ᩷")) * 17;
        int i5 = ((m6981 ^ i3) * (-12059)) ^ 1691542910;
        int i6 = -78293357;
        while (true) {
            i2 = ((((i2 ^ i3) * (-27125)) >> 31) & i5) ^ (m6981 ^ i6);
            switch (i2) {
                case -2093839773:
                case 789272102:
                    c13244 = this.f65559;
                    if (C4117.m12364() != 0) {
                        m6981 = (C2105.m6981("᩶ۘ") ^ i3) * 13;
                        i5 = ((m6981 ^ i4) * (-9923)) ^ 61485677;
                        i6 = 985962137;
                    } else {
                        m6981 = C2105.m6981("ᩴܰ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-4495)) ^ 645074900;
                        i6 = -494366182;
                    }
                case -2074528577:
                case 355314285:
                    C2958.m9034();
                    C3911.m11924();
                    m6981 = C2105.m6981("᩷ۨ") ^ i4;
                    i5 = ((m6981 ^ i3) * 8043) ^ 2102898736;
                    i6 = 2129768170;
                case -2041408150:
                case 1920438905:
                    if (C1711.m5736() <= 0) {
                        m6981 = (C2105.m6981("۬᩸") + i3) * 71;
                        i5 = ((m6981 ^ i4) * (-31471)) ^ 324829899;
                        i6 = -1668403426;
                    } else {
                        m6981 = (C2105.m6981("ۛ᩻") + i4) * 51;
                        i5 = ((m6981 ^ i3) * (-2127)) ^ (-369383102);
                        i6 = -1335713272;
                    }
                case -2021935907:
                case 490487322:
                    if (C0050.f910 >= 0) {
                        m6981 = (C2105.m6981("۬᩺") + i4) * 61;
                        i5 = ((m6981 ^ i3) * 23811) ^ 94154842;
                        i6 = -561918103;
                    } else {
                        m6981 = (C2105.m6981("ۡ᩻") + i4) * (-7);
                        i5 = ((m6981 ^ i3) * 30793) ^ (-690945812);
                        i6 = -568528110;
                    }
                case -1819708564:
                case -1499135317:
                    if (C2272.m7503()) {
                        m6981 = (C2105.m6981("۬᩺") + i4) * 61;
                        i5 = ((m6981 ^ i3) * 23811) ^ 94154842;
                        i6 = -561918103;
                    } else {
                        m6981 = (C0630.m2566("ۚ᩻") ^ i4) * (-97);
                        i5 = ((m6981 ^ i3) * 20361) ^ 1484176833;
                        i6 = 448013926;
                    }
                case -1647063956:
                case -300646219:
                    if (C0964.f3626 != 0) {
                        m6981 = C2105.m6981("᩷ۨ") ^ i4;
                        i5 = ((m6981 ^ i3) * 8043) ^ 2102898736;
                        i6 = 2129768170;
                    } else {
                        m6981 = C0630.m2566("ۚۖ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-1531)) ^ (-2106537556);
                        i6 = 397513084;
                    }
                case -1405487218:
                case -696987879:
                    return 0;
                case -1298129319:
                case 143653021:
                    if (C2105.f7037 != 0) {
                        m6981 = (C2105.m6981("۬᩸") + i3) * 71;
                        i5 = ((m6981 ^ i4) * (-31471)) ^ 324829899;
                        i6 = -1668403426;
                    } else {
                        m6981 = C0630.m2566("ۙܳ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-26353)) ^ 849467996;
                        i6 = 40531772;
                    }
                case -1273462545:
                case -1026931815:
                    list2 = c13244.f39641;
                    i = C2126.m7032(list2);
                    if (C1420.f5096 <= 0) {
                        m6981 = (C2105.m6981("᩶ۘ") ^ i3) * 13;
                        i5 = ((m6981 ^ i4) * (-9923)) ^ 61485677;
                        i6 = 985962137;
                    } else {
                        m6981 = (C2105.m6981("֨ܽ") ^ i3) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i5 = ((m6981 ^ i4) * 25) ^ 491296168;
                        i6 = -40477700;
                    }
                case -853835625:
                case 14558448:
                    list = c13244.f39641;
                    if (C2167.m7161(list)) {
                        m6981 = (C0630.m2566("ܽ۫") ^ i4) * 27;
                        i5 = ((m6981 ^ i3) * (-7795)) ^ (-152078640);
                        i6 = 243353616;
                    } else {
                        m6981 = (C0630.m2566("ܶۢ") + i3) * (-27);
                        i5 = ((m6981 ^ i4) * 32207) ^ 1044115795;
                        i6 = 1578461879;
                    }
                case -352611868:
                case -123969504:
                    if (C0798.f2919) {
                        m6981 = (C2105.m6981("᩶ۘ") ^ i3) * 13;
                        i5 = ((m6981 ^ i4) * (-9923)) ^ 61485677;
                        i6 = 985962137;
                    } else {
                        m6981 = (C2105.m6981("۬᩺") + i4) * 61;
                        i5 = ((m6981 ^ i3) * 23811) ^ 94154842;
                        i6 = -561918103;
                    }
                case 86870241:
                case 1346532465:
                    if (C11340.m28031()) {
                        m6981 = C0630.m2566("ۘ᩶") ^ i4;
                        i5 = ((m6981 ^ i3) * 731) ^ 1238862991;
                        i6 = -730220510;
                    } else {
                        m6981 = C2105.m6981("᩷ۨ") ^ i4;
                        i5 = ((m6981 ^ i3) * 8043) ^ 2102898736;
                        i6 = 2129768170;
                    }
                case 166371515:
                case 1183629249:
                    return i + 1;
                case 268444165:
                case 1387201265:
                    if (C3019.f9544 < 0) {
                        m6981 = (i3 - C0630.m2566("᩵۬")) * (-51);
                        i5 = ((m6981 ^ i4) * 29101) ^ 453503288;
                        i6 = -451741094;
                    } else {
                        m6981 = (C2105.m6981("۬᩺") + i4) * 61;
                        i5 = ((m6981 ^ i3) * 23811) ^ 94154842;
                        i6 = -561918103;
                    }
                case 405527902:
                case 880682340:
                    C4616.m13552();
                    C2105.m6982();
                    return 0;
                case 942219187:
                case 1602093454:
                    C2126.m7040();
                    if (C7106.f21815 != 0) {
                        m6981 = C2105.m6981("᩷ۨ") ^ i4;
                        i5 = ((m6981 ^ i3) * 8043) ^ 2102898736;
                        i6 = 2129768170;
                    } else {
                        m6981 = (i3 - C0630.m2566("᩵۬")) * (-51);
                        i5 = ((m6981 ^ i4) * 29101) ^ 453503288;
                        i6 = -451741094;
                    }
                case 1196898459:
                case 1936225804:
                    if (C7106.m19120() <= 0) {
                        m6981 = (C2105.m6981("۬᩺") + i4) * 61;
                        i5 = ((m6981 ^ i3) * 23811) ^ 94154842;
                        i6 = -561918103;
                    } else {
                        m6981 = C0630.m2566("֫ۨ") ^ i4;
                        i5 = ((m6981 ^ i3) * 31865) ^ (-1150979548);
                        i6 = 54780696;
                    }
                default:
                    if (C0630.f2410 <= 0) {
                        m6981 = (i3 - C0630.m2566("᩵۬")) * (-51);
                        i5 = ((m6981 ^ i4) * 29101) ^ 453503288;
                        i6 = -451741094;
                    } else {
                        m6981 = C0630.m2566("᩶ۖ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-693)) ^ (-1783553643);
                        i6 = -1046310789;
                    }
            }
        }
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        C19099 c19099;
        TextView textView;
        int i2;
        ViewOnClickListenerC3367 viewOnClickListenerC3367;
        int i3;
        TextView textView2;
        int i4;
        short[] sArr;
        ImageView imageView;
        short[] sArr2;
        String str;
        int m6981;
        int i5;
        int m69812;
        int i6;
        int i7;
        int i8;
        C19099 c190992;
        TextView textView3;
        TextView textView4;
        short[] sArr3;
        int i9;
        int i10;
        int i11;
        C19099 c190993;
        int i12;
        int m69813;
        int i13;
        List list;
        C19099 c190994;
        TextView textView5;
        String str2;
        ImageView imageView2;
        int i14;
        C19099 c190995;
        TextView textView6;
        TextView textView7;
        short[] sArr4;
        int i15;
        int i16;
        C19099 c190996;
        int i17;
        int i18;
        TextView textView8;
        String str3;
        int m2566;
        int i19;
        int i20;
        int m25662;
        int i21;
        TextView textView9;
        int m25663;
        int i22;
        int i23 = 0;
        short[] sArr5 = null;
        int i24 = 0;
        int i25 = 468796925;
        int i26 = C0422.f1886;
        int i27 = C0483.f2088;
        int m25664 = C0630.m2566("᩸ܽ") ^ i26;
        int i28 = ((m25664 ^ i27) * (-31815)) ^ 828164273;
        int i29 = m25664 ^ 2088047877;
        ImageView imageView3 = null;
        String str4 = null;
        SpannableStringBuilder spannableStringBuilder = null;
        TextView textView10 = null;
        short[] sArr6 = null;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        short s = 0;
        C19099 c190997 = null;
        TextView textView11 = null;
        SpannableStringBuilder spannableStringBuilder2 = null;
        String str5 = null;
        ViewOnClickListenerC3367 viewOnClickListenerC33672 = null;
        int i37 = 0;
        int i38 = 0;
        SpannableStringBuilder spannableStringBuilder3 = null;
        short[] sArr7 = null;
        while (true) {
            i25 = i29 ^ (i28 & (((i25 ^ i27) * 24383) >> 31));
            switch (i25) {
                case -2003751821:
                case -717768678:
                    c190993 = c190997;
                    textView = textView10;
                    textView2 = textView11;
                    sArr = sArr6;
                    i12 = i36;
                    i3 = i24;
                    i4 = i30;
                    String str6 = str4;
                    imageView = imageView3;
                    sArr2 = sArr5;
                    str = str6;
                    if (abstractC3255 instanceof ViewOnClickListenerC3367) {
                        m69813 = C2105.m6981("᩸ᩳ") ^ i27;
                        i28 = ((m69813 ^ i26) * 19963) ^ 723445920;
                        i13 = 973413485;
                        i8 = m69813 ^ i13;
                        i36 = i12;
                        c190997 = c190993;
                        TextView textView12 = textView;
                        i29 = i8;
                        i30 = i4;
                        i24 = i3;
                        sArr6 = sArr;
                        textView11 = textView2;
                        textView10 = textView12;
                        str2 = str;
                        sArr5 = sArr2;
                        imageView3 = imageView;
                        str4 = str2;
                    }
                    m69813 = C0630.m2566("᩷֫") ^ i26;
                    i28 = ((m69813 ^ i27) * (-3525)) ^ (-1904122922);
                    i13 = 710002735;
                    i8 = m69813 ^ i13;
                    i36 = i12;
                    c190997 = c190993;
                    TextView textView122 = textView;
                    i29 = i8;
                    i30 = i4;
                    i24 = i3;
                    sArr6 = sArr;
                    textView11 = textView2;
                    textView10 = textView122;
                    str2 = str;
                    sArr5 = sArr2;
                    imageView3 = imageView;
                    str4 = str2;
                case -1940038993:
                case -459230483:
                    C1047.m3601(textView10, c190997.m43987());
                    String m7033 = C2126.m7033(c190997);
                    int m44017 = c190997.m44017();
                    textView = textView10;
                    boolean m43995 = c190997.m43995();
                    c190993 = c190997;
                    imageView2 = viewOnClickListenerC33672.f10658;
                    C16275.m38292(m7033, m44017, m43995, imageView2);
                    textView2 = textView11;
                    sArr = sArr6;
                    i12 = i36;
                    i3 = i24;
                    i4 = i30;
                    String str7 = str4;
                    imageView = imageView3;
                    sArr2 = sArr5;
                    str = str7;
                    m69813 = C0630.m2566("᩷֫") ^ i26;
                    i28 = ((m69813 ^ i27) * (-3525)) ^ (-1904122922);
                    i13 = 710002735;
                    i8 = m69813 ^ i13;
                    i36 = i12;
                    c190997 = c190993;
                    TextView textView1222 = textView;
                    i29 = i8;
                    i30 = i4;
                    i24 = i3;
                    sArr6 = sArr;
                    textView11 = textView2;
                    textView10 = textView1222;
                    str2 = str;
                    sArr5 = sArr2;
                    imageView3 = imageView;
                    str4 = str2;
                case -1909138608:
                case -181409291:
                    i14 = i30;
                    c190995 = c190997;
                    textView6 = textView10;
                    textView7 = textView11;
                    String str8 = str4;
                    sArr4 = sArr6;
                    i15 = i36;
                    viewOnClickListenerC33672.f10657 = c190995;
                    imageView3 = viewOnClickListenerC33672.f10658;
                    short[] sArr8 = f65558;
                    if (C0483.f2088 >= 0) {
                        str4 = str8;
                        i16 = 1;
                        sArr5 = sArr8;
                        int m69814 = C2105.m6981("ۗۧ") ^ i27;
                        c190996 = c190995;
                        i36 = i15;
                        sArr6 = sArr4;
                        textView11 = textView7;
                        textView10 = textView6;
                        i29 = m69814 ^ 1794390365;
                        i28 = ((m69814 ^ i26) * (-3869)) ^ 915806759;
                        i30 = i14;
                        i24 = i16;
                        c190997 = c190996;
                    } else {
                        int m69815 = (C2105.m6981("ᩳ۟") ^ i26) * (-105);
                        i36 = i15;
                        str4 = str8;
                        sArr6 = sArr4;
                        sArr5 = sArr8;
                        i28 = ((m69815 ^ i27) * 1041) ^ (-5029147);
                        textView11 = textView7;
                        textView10 = textView6;
                        c190997 = c190995;
                        i29 = m69815 ^ 1757981231;
                        i30 = i14;
                        i24 = 1;
                    }
                case -1603362620:
                case -91018935:
                    c19099 = c190997;
                    textView = textView10;
                    sArr = sArr6;
                    i2 = i36;
                    short[] sArr9 = sArr5;
                    str = str4;
                    int i39 = i24;
                    int m25665 = C0630.m2566(C1504.m5177(sArr9, i39, 3, i30)) ^ 2098052965;
                    i4 = i30;
                    ImageView imageView4 = imageView3;
                    imageView4.setImageResource(m25665);
                    textView5 = viewOnClickListenerC33672.f10654;
                    if (C1047.f3863 >= 0) {
                        imageView = imageView4;
                        i3 = i39;
                        viewOnClickListenerC3367 = viewOnClickListenerC33672;
                        sArr2 = sArr9;
                        textView2 = textView5;
                        m6981 = C0630.m2566("ܺ֫") ^ i26;
                        i28 = ((m6981 ^ i27) * (-8777)) ^ (-1118970377);
                        i5 = -853566781;
                        i8 = m6981 ^ i5;
                        viewOnClickListenerC33672 = viewOnClickListenerC3367;
                        c190997 = c19099;
                        i36 = i2;
                        TextView textView12222 = textView;
                        i29 = i8;
                        i30 = i4;
                        i24 = i3;
                        sArr6 = sArr;
                        textView11 = textView2;
                        textView10 = textView12222;
                        str2 = str;
                        sArr5 = sArr2;
                        imageView3 = imageView;
                        str4 = str2;
                    } else {
                        int m25666 = C0630.m2566("᩷ۧ") ^ i26;
                        imageView = imageView4;
                        i36 = i2;
                        sArr6 = sArr;
                        textView11 = textView5;
                        c190997 = c19099;
                        i28 = ((m25666 ^ i27) * 23621) ^ (-1251131350);
                        i30 = i4;
                        i24 = i39;
                        str2 = str;
                        sArr5 = sArr9;
                        textView10 = textView;
                        i29 = m25666 ^ (-1442949612);
                        imageView3 = imageView;
                        str4 = str2;
                    }
                case -1465410377:
                case 533519037:
                    c190996 = c190997;
                    C0630.m2576(spannableStringBuilder2, new ForegroundColorSpan(i33), i31, i32, 33);
                    textView9 = viewOnClickListenerC33672.f10653;
                    C1047.m3601(textView9, spannableStringBuilder2);
                    textView10 = viewOnClickListenerC33672.f10656;
                    if (C4616.f14690 > 0) {
                        m25663 = (C0630.m2566("ܽܽ") + i27) * 55;
                        i17 = ((m25663 ^ i26) * (-1345)) ^ 170968510;
                        i22 = 2090099882;
                        i29 = m25663 ^ i22;
                        i28 = i17;
                        c190997 = c190996;
                    }
                    m25663 = C2105.m6981("ܳۚ") ^ i26;
                    i17 = ((m25663 ^ i27) * 19083) ^ 459006595;
                    i22 = 1858684961;
                    i29 = m25663 ^ i22;
                    i28 = i17;
                    c190997 = c190996;
                case -1395366287:
                case -399799613:
                    c190992 = c190997;
                    textView3 = textView10;
                    textView4 = textView11;
                    sArr3 = sArr6;
                    i9 = i36;
                    i10 = i24;
                    String str9 = str4;
                    imageView = imageView3;
                    sArr2 = sArr5;
                    str = str9;
                    i11 = 14916;
                    int m69816 = C2105.m6981("ᩴ۫") ^ i26;
                    int i40 = i11;
                    int i41 = ((m69816 ^ i27) * (-20599)) ^ (-63524492);
                    int i42 = m69816 ^ (-840973844);
                    i36 = i9;
                    c190997 = c190992;
                    i28 = i41;
                    i30 = i40;
                    i24 = i10;
                    sArr6 = sArr3;
                    textView11 = textView4;
                    textView10 = textView3;
                    i29 = i42;
                    str2 = str;
                    sArr5 = sArr2;
                    imageView3 = imageView;
                    str4 = str2;
                case -1323946427:
                case -636249483:
                    c190996 = c190997;
                    textView6 = textView10;
                    short[] sArr10 = sArr6;
                    i15 = i36;
                    textView7 = textView11;
                    RunnableC1937.m6377(textView7, c190996.m44004());
                    spannableStringBuilder2 = new SpannableStringBuilder();
                    str4 = c190996.m43986();
                    if (C1916.f6442) {
                        int m69817 = (C2105.m6981("᩹ۗ") ^ i27) * 13;
                        i17 = ((m69817 ^ i26) * 6249) ^ 384077825;
                        i18 = m69817 ^ 828880007;
                        i36 = i15;
                        sArr6 = sArr10;
                        textView11 = textView7;
                        textView10 = textView6;
                        i29 = i18;
                        i28 = i17;
                        c190997 = c190996;
                    } else {
                        sArr4 = sArr10;
                        i16 = i24;
                        i14 = i30;
                        c190995 = c190996;
                        int m698142 = C2105.m6981("ۗۧ") ^ i27;
                        c190996 = c190995;
                        i36 = i15;
                        sArr6 = sArr4;
                        textView11 = textView7;
                        textView10 = textView6;
                        i29 = m698142 ^ 1794390365;
                        i28 = ((m698142 ^ i26) * (-3869)) ^ 915806759;
                        i30 = i14;
                        i24 = i16;
                        c190997 = c190996;
                    }
                case -1244154450:
                case 424733727:
                    C4263.m12819();
                    break;
                case -1053360618:
                case -450558827:
                    textView = textView10;
                    int i43 = i24;
                    textView2 = textView11;
                    sArr = sArr6;
                    i2 = i36;
                    String str10 = str4;
                    imageView = imageView3;
                    sArr2 = sArr5;
                    str = str10;
                    viewOnClickListenerC33672 = (ViewOnClickListenerC3367) abstractC3255;
                    i4 = i30;
                    i3 = i43;
                    list = this.f65559.f39641;
                    c190994 = (C19099) C22628.m50605(list, i);
                    if (C3019.f9544 >= 0) {
                        int m69818 = (C2105.m6981("ۜۜ") ^ i26) * 45;
                        c190997 = c190994;
                        i28 = ((m69818 ^ i27) * 15959) ^ 1697753673;
                        i30 = i4;
                        i24 = i3;
                        sArr6 = sArr;
                        textView11 = textView2;
                        textView10 = textView;
                        i29 = m69818 ^ (-1552515025);
                        i36 = i2;
                        String str11 = str;
                        sArr5 = sArr2;
                        imageView3 = imageView;
                        str4 = str11;
                    } else {
                        int m25667 = C0630.m2566("᩵ۤ") ^ i27;
                        i28 = ((m25667 ^ i26) * (-26459)) ^ 1076122820;
                        i8 = m25667 ^ 1360311900;
                        c190997 = c190994;
                        i36 = i2;
                        TextView textView122222 = textView;
                        i29 = i8;
                        i30 = i4;
                        i24 = i3;
                        sArr6 = sArr;
                        textView11 = textView2;
                        textView10 = textView122222;
                        str2 = str;
                        sArr5 = sArr2;
                        imageView3 = imageView;
                        str4 = str2;
                    }
                case -1038135678:
                case 461038569:
                    if (C1916.f6442) {
                        c190996 = c190997;
                        textView8 = textView10;
                        str3 = str4;
                        m2566 = (C0630.m2566("ܽܶ") + i27) * 5;
                        i19 = ((m2566 ^ i26) * 10557) ^ 1777773335;
                        i20 = 465281899;
                        int i44 = m2566 ^ i20;
                        str4 = str3;
                        i28 = i19;
                        textView10 = textView8;
                        i29 = i44;
                        c190997 = c190996;
                    }
                    textView6 = textView10;
                    textView7 = textView11;
                    sArr4 = sArr6;
                    i15 = i36;
                    int i45 = i24;
                    i14 = i30;
                    c190995 = c190997;
                    i16 = i45;
                    int m6981422 = C2105.m6981("ۗۧ") ^ i27;
                    c190996 = c190995;
                    i36 = i15;
                    sArr6 = sArr4;
                    textView11 = textView7;
                    textView10 = textView6;
                    i29 = m6981422 ^ 1794390365;
                    i28 = ((m6981422 ^ i26) * (-3869)) ^ 915806759;
                    i30 = i14;
                    i24 = i16;
                    c190997 = c190996;
                case -705414029:
                case 1057126257:
                    if (C1128.f4106 <= 0) {
                        textView6 = textView10;
                        textView7 = textView11;
                        sArr4 = sArr6;
                        i15 = i36;
                        int i452 = i24;
                        i14 = i30;
                        c190995 = c190997;
                        i16 = i452;
                        int m69814222 = C2105.m6981("ۗۧ") ^ i27;
                        c190996 = c190995;
                        i36 = i15;
                        sArr6 = sArr4;
                        textView11 = textView7;
                        textView10 = textView6;
                        i29 = m69814222 ^ 1794390365;
                        i28 = ((m69814222 ^ i26) * (-3869)) ^ 915806759;
                        i30 = i14;
                        i24 = i16;
                        c190997 = c190996;
                    } else {
                        c190994 = c190997;
                        textView = textView10;
                        textView2 = textView11;
                        sArr = sArr6;
                        i2 = i36;
                        i3 = i24;
                        i4 = i30;
                        String str12 = str4;
                        imageView = imageView3;
                        sArr2 = sArr5;
                        str = str12;
                        int m698182 = (C2105.m6981("ۜۜ") ^ i26) * 45;
                        c190997 = c190994;
                        i28 = ((m698182 ^ i27) * 15959) ^ 1697753673;
                        i30 = i4;
                        i24 = i3;
                        sArr6 = sArr;
                        textView11 = textView2;
                        textView10 = textView;
                        i29 = m698182 ^ (-1552515025);
                        i36 = i2;
                        String str112 = str;
                        sArr5 = sArr2;
                        imageView3 = imageView;
                        str4 = str112;
                    }
                case -597902393:
                case 1707228126:
                    c190996 = c190997;
                    textView8 = textView10;
                    str3 = str4;
                    spannableStringBuilder3 = C3911.m11921(spannableStringBuilder2, str3);
                    sArr6 = f65558;
                    i36 = 4;
                    if (!C2126.f7087) {
                        m2566 = C0630.m2566("ۚ᩶") ^ i27;
                        i19 = ((m2566 ^ i26) * 20205) ^ (-658249772);
                        i20 = -754604493;
                        int i442 = m2566 ^ i20;
                        str4 = str3;
                        i28 = i19;
                        textView10 = textView8;
                        i29 = i442;
                        c190997 = c190996;
                    }
                    m2566 = (C0630.m2566("ܽܶ") + i27) * 5;
                    i19 = ((m2566 ^ i26) * 10557) ^ 1777773335;
                    i20 = 465281899;
                    int i4422 = m2566 ^ i20;
                    str4 = str3;
                    i28 = i19;
                    textView10 = textView8;
                    i29 = i4422;
                    c190997 = c190996;
                case -450156098:
                case 203824876:
                    c19099 = c190997;
                    textView = textView10;
                    short[] sArr11 = sArr6;
                    i2 = i36;
                    str5 = C1916.m6311(sArr11, i2, 3, i30);
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder3;
                    spannableStringBuilder = C3911.m11921(C3911.m11921(spannableStringBuilder4, str5), C22927.m51020(c19099.m43998()));
                    if (C0483.m2121()) {
                        int m25668 = (C0630.m2566("ۨܰ") ^ i26) * (-85);
                        spannableStringBuilder3 = spannableStringBuilder4;
                        i28 = ((m25668 ^ i27) * (-10843)) ^ 231957847;
                        sArr6 = sArr11;
                        i36 = i2;
                        c190997 = c19099;
                        i29 = m25668 ^ (-712568762);
                        textView10 = textView;
                    } else {
                        spannableStringBuilder3 = spannableStringBuilder4;
                        viewOnClickListenerC3367 = viewOnClickListenerC33672;
                        i3 = i24;
                        textView2 = textView11;
                        i4 = i30;
                        sArr = sArr11;
                        String str13 = str4;
                        imageView = imageView3;
                        sArr2 = sArr5;
                        str = str13;
                        m6981 = C0630.m2566("ܺ֫") ^ i26;
                        i28 = ((m6981 ^ i27) * (-8777)) ^ (-1118970377);
                        i5 = -853566781;
                        i8 = m6981 ^ i5;
                        viewOnClickListenerC33672 = viewOnClickListenerC3367;
                        c190997 = c19099;
                        i36 = i2;
                        TextView textView1222222 = textView;
                        i29 = i8;
                        i30 = i4;
                        i24 = i3;
                        sArr6 = sArr;
                        textView11 = textView2;
                        textView10 = textView1222222;
                        str2 = str;
                        sArr5 = sArr2;
                        imageView3 = imageView;
                        str4 = str2;
                    }
                case -112921952:
                case 389978842:
                    c19099 = c190997;
                    textView = textView10;
                    textView2 = textView11;
                    sArr = sArr6;
                    i2 = i36;
                    i3 = i24;
                    i4 = i30;
                    String str14 = str4;
                    imageView = imageView3;
                    sArr2 = sArr5;
                    str = str14;
                    int i46 = i23 + 96177249;
                    viewOnClickListenerC3367 = viewOnClickListenerC33672;
                    short s2 = s;
                    int i47 = s2 + 9807;
                    if ((i47 * i47) - (i46 + i46) <= 0) {
                        m69812 = (C2105.m6981("۟ۜ") ^ i27) * (-65);
                        i6 = ((m69812 ^ i26) * 9875) ^ 287188523;
                        i7 = -1076662175;
                    } else {
                        m69812 = (C2105.m6981("ۤ᩻") + i27) * (-89);
                        i6 = ((m69812 ^ i26) * (-28145)) ^ 882710501;
                        i7 = -1181924582;
                    }
                    i8 = m69812 ^ i7;
                    s = s2;
                    i28 = i6;
                    viewOnClickListenerC33672 = viewOnClickListenerC3367;
                    c190997 = c19099;
                    i36 = i2;
                    TextView textView12222222 = textView;
                    i29 = i8;
                    i30 = i4;
                    i24 = i3;
                    sArr6 = sArr;
                    textView11 = textView2;
                    textView10 = textView12222222;
                    str2 = str;
                    sArr5 = sArr2;
                    imageView3 = imageView;
                    str4 = str2;
                case -48076269:
                case 1982000423:
                    C4075.m12263();
                    textView6 = textView10;
                    textView7 = textView11;
                    sArr4 = sArr6;
                    i15 = i36;
                    int i4522 = i24;
                    i14 = i30;
                    c190995 = c190997;
                    i16 = i4522;
                    int m698142222 = C2105.m6981("ۗۧ") ^ i27;
                    c190996 = c190995;
                    i36 = i15;
                    sArr6 = sArr4;
                    textView11 = textView7;
                    textView10 = textView6;
                    i29 = m698142222 ^ 1794390365;
                    i28 = ((m698142222 ^ i26) * (-3869)) ^ 915806759;
                    i30 = i14;
                    i24 = i16;
                    c190997 = c190996;
                case 124473193:
                case 1074698087:
                    if (C0422.f1886 <= 0) {
                        c190996 = c190997;
                        m25663 = C2105.m6981("ܳۚ") ^ i26;
                        i17 = ((m25663 ^ i27) * 19083) ^ 459006595;
                        i22 = 1858684961;
                        i29 = m25663 ^ i22;
                        i28 = i17;
                        c190997 = c190996;
                    }
                    textView6 = textView10;
                    textView7 = textView11;
                    sArr4 = sArr6;
                    i15 = i36;
                    int i45222 = i24;
                    i14 = i30;
                    c190995 = c190997;
                    i16 = i45222;
                    int m6981422222 = C2105.m6981("ۗۧ") ^ i27;
                    c190996 = c190995;
                    i36 = i15;
                    sArr6 = sArr4;
                    textView11 = textView7;
                    textView10 = textView6;
                    i29 = m6981422222 ^ 1794390365;
                    i28 = ((m6981422222 ^ i26) * (-3869)) ^ 915806759;
                    i30 = i14;
                    i24 = i16;
                    c190997 = c190996;
                case 517954066:
                case 1816355205:
                    c190996 = c190997;
                    textView6 = textView10;
                    C0237.m1490(spannableStringBuilder, str5);
                    i31 = C1047.m3592(spannableStringBuilder2);
                    sArr7 = f65558;
                    i38 = 7;
                    i37 = 3;
                    m25662 = (i27 - C0630.m2566("ۧۢ")) * (-69);
                    i17 = ((m25662 ^ i26) * 21113) ^ 909480501;
                    i21 = -456314364;
                    i18 = m25662 ^ i21;
                    textView10 = textView6;
                    i29 = i18;
                    i28 = i17;
                    c190997 = c190996;
                case 733241700:
                case 1700723559:
                    c190996 = c190997;
                    textView6 = textView10;
                    C0237.m1490(spannableStringBuilder2, ServiceConnectionC3453.m10562(i34 ^ i35));
                    i32 = RunnableC1937.m6382(spannableStringBuilder2);
                    i33 = C21943.m49424(-1996767, -29696);
                    if (RunnableC3474.f10992 <= 0) {
                        i16 = i24;
                        textView7 = textView11;
                        sArr4 = sArr6;
                        i15 = i36;
                        i14 = i30;
                        c190995 = c190996;
                        int m69814222222 = C2105.m6981("ۗۧ") ^ i27;
                        c190996 = c190995;
                        i36 = i15;
                        sArr6 = sArr4;
                        textView11 = textView7;
                        textView10 = textView6;
                        i29 = m69814222222 ^ 1794390365;
                        i28 = ((m69814222222 ^ i26) * (-3869)) ^ 915806759;
                        i30 = i14;
                        i24 = i16;
                        c190997 = c190996;
                    } else {
                        m25662 = (C0630.m2566("ܳܿ") + i26) * (-91);
                        i17 = ((m25662 ^ i27) * 28191) ^ (-2097474060);
                        i21 = -1934959882;
                        i18 = m25662 ^ i21;
                        textView10 = textView6;
                        i29 = i18;
                        i28 = i17;
                        c190997 = c190996;
                    }
                case 851030330:
                case 1400403198:
                    break;
                case 1064856124:
                case 1971251192:
                    c190996 = c190997;
                    textView6 = textView10;
                    i34 = C2105.m6981(ViewOnClickListenerC1958.m6435(sArr7, i38, i37, i30));
                    i35 = 2120286570;
                    if (C1294.f4556 >= 0) {
                        textView10 = textView6;
                        m25663 = C2105.m6981("ܳۚ") ^ i26;
                        i17 = ((m25663 ^ i27) * 19083) ^ 459006595;
                        i22 = 1858684961;
                        i29 = m25663 ^ i22;
                        i28 = i17;
                        c190997 = c190996;
                    } else {
                        m25662 = (C0630.m2566("֡ۖ") ^ i26) * 101;
                        i17 = ((m25662 ^ i27) * 10415) ^ 125793194;
                        i21 = -1337535421;
                        i18 = m25662 ^ i21;
                        textView10 = textView6;
                        i29 = i18;
                        i28 = i17;
                        c190997 = c190996;
                    }
                case 1688038849:
                case 2117863359:
                    c19099 = c190997;
                    textView = textView10;
                    textView2 = textView11;
                    sArr = sArr6;
                    i2 = i36;
                    viewOnClickListenerC3367 = viewOnClickListenerC33672;
                    i3 = i24;
                    i4 = i30;
                    String str15 = str4;
                    imageView = imageView3;
                    sArr2 = sArr5;
                    str = str15;
                    s = f65558[0];
                    i23 = s * s;
                    if (!C2272.f7362) {
                        m6981 = C2105.m6981("֡ܰ") ^ i26;
                        i28 = ((m6981 ^ i27) * (-31929)) ^ (-1672839551);
                        i5 = -508623858;
                        i8 = m6981 ^ i5;
                        viewOnClickListenerC33672 = viewOnClickListenerC3367;
                        c190997 = c19099;
                        i36 = i2;
                        TextView textView122222222 = textView;
                        i29 = i8;
                        i30 = i4;
                        i24 = i3;
                        sArr6 = sArr;
                        textView11 = textView2;
                        textView10 = textView122222222;
                        str2 = str;
                        sArr5 = sArr2;
                        imageView3 = imageView;
                        str4 = str2;
                    }
                    m6981 = C0630.m2566("ܺ֫") ^ i26;
                    i28 = ((m6981 ^ i27) * (-8777)) ^ (-1118970377);
                    i5 = -853566781;
                    i8 = m6981 ^ i5;
                    viewOnClickListenerC33672 = viewOnClickListenerC3367;
                    c190997 = c19099;
                    i36 = i2;
                    TextView textView1222222222 = textView;
                    i29 = i8;
                    i30 = i4;
                    i24 = i3;
                    sArr6 = sArr;
                    textView11 = textView2;
                    textView10 = textView1222222222;
                    str2 = str;
                    sArr5 = sArr2;
                    imageView3 = imageView;
                    str4 = str2;
                default:
                    c190992 = c190997;
                    textView3 = textView10;
                    textView4 = textView11;
                    sArr3 = sArr6;
                    i9 = i36;
                    i10 = i24;
                    String str16 = str4;
                    imageView = imageView3;
                    sArr2 = sArr5;
                    str = str16;
                    i11 = 44570;
                    int m698162 = C2105.m6981("ᩴ۫") ^ i26;
                    int i402 = i11;
                    int i412 = ((m698162 ^ i27) * (-20599)) ^ (-63524492);
                    int i422 = m698162 ^ (-840973844);
                    i36 = i9;
                    c190997 = c190992;
                    i28 = i412;
                    i30 = i402;
                    i24 = i10;
                    sArr6 = sArr3;
                    textView11 = textView4;
                    textView10 = textView3;
                    i29 = i422;
                    str2 = str;
                    sArr5 = sArr2;
                    imageView3 = imageView;
                    str4 = str2;
            }
            return;
        }
    }

    public C20301(C13244 c13244) {
        this.f65559 = c13244;
    }
}
