package l;

import com.alipay.sdk.app.PayTask;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: T5M8 */
/* renamed from: l.۠ᩴۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8359 extends AbstractC7548 {

    /* renamed from: ܺܰ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f25656 = {9156, -24803, -28718, 27950, 29656, -2045, -2041, -2041, -2041, -2046, -2041, -2041, -2041, -2047, -2041, -2041, -2042, -2047, -2041, -2041, -2043, -2047, -2041, -2041, -2045, -2033, -2041, -2041, -2041, -2034, -2041, -2041, -2041, -25320, -18705, -24314, 29970, 27130, -24262, 29632, -27531, -25320, -18705, 28828, -21535, -27201, -30874, -30997, 30697, -25710, -22067, 27950, -25320, -18705, -31004, -24661, -24803, -28718, -25320, -18705, -26073, -21848, 1176, -18678, -18661, -18685, -18637, -18668, -18660, -18667, -18680, -18657, -18679, -18673, -18666, -18674, -18647, -18674, -18661, -18674, -18673, -18679};

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f25657;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public RunnableC1303 f25658;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25659;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f25660;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f25661;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25662;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f25663;

    public C8359(AbstractActivityC3346 abstractActivityC3346, String str, long j, int i, String str2) {
        int i2 = -1846839186;
        int i3 = C4263.f13799;
        int i4 = C0422.f1886;
        this.f25660 = abstractActivityC3346;
        this.f25662 = str;
        this.f25663 = j;
        this.f25657 = i;
        this.f25659 = str2;
        int m6981 = (C2105.m6981("ۛۘ") + i4) * 23;
        int i5 = ((m6981 ^ i3) * 16399) ^ 173332521;
        int i6 = 1880847384;
        while (true) {
            i2 = (m6981 ^ i6) ^ (i5 & (((i2 ^ i3) * (-27547)) >> 31));
            switch (i2) {
                case -1896645222:
                case 46957086:
                    C7106.m19120();
                    if (C1047.f3863 < 0) {
                        m6981 = C2105.m6981("ۤۗ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-8457)) ^ (-2140690281);
                        i6 = -1826719233;
                    } else {
                        m6981 = C2105.m6981("ۤ᩶") ^ i3;
                        i5 = ((m6981 ^ i4) * 20221) ^ 669793209;
                        i6 = 783589075;
                    }
                case -1384849345:
                case 2128440412:
                    C0237.m1481();
                    if (C0422.f1886 > 0) {
                        m6981 = C2105.m6981("ۤ᩶") ^ i3;
                        i5 = ((m6981 ^ i4) * 20221) ^ 669793209;
                        i6 = 783589075;
                    } else {
                        m6981 = C0630.m2566("᩸ᩴ") ^ i4;
                        i5 = ((m6981 ^ i3) * 8521) ^ 1948387897;
                        i6 = 438603747;
                    }
                case 451430377:
                case 527768095:
                    if (C0964.f3626 == 0) {
                        m6981 = C2105.m6981("ۤۗ") ^ i3;
                        i5 = ((m6981 ^ i4) * (-8457)) ^ (-2140690281);
                        i6 = -1826719233;
                    } else {
                        m6981 = C0630.m2566("ᩴ᩸") ^ i4;
                        i5 = ((m6981 ^ i3) * (-22421)) ^ (-362824214);
                        i6 = 2034855688;
                    }
                case 510600028:
                case 872057751:
                    return;
                case 1230045992:
                case 1637966477:
                    C3683.m11222();
                    C0798.m2998();
                    m6981 = C2105.m6981("ۤۗ") ^ i3;
                    i5 = ((m6981 ^ i4) * (-8457)) ^ (-2140690281);
                    i6 = -1826719233;
                case 1294847594:
                case 1970025477:
                    if (C0630.f2410 <= 0) {
                        m6981 = C2105.m6981("۬ᩳ") ^ i3;
                        i5 = ((m6981 ^ i4) * 10037) ^ (-384913691);
                        i6 = 1250014323;
                    } else {
                        m6981 = (i4 - C2105.m6981("ᩳۘ")) * (-99);
                        i5 = ((m6981 ^ i3) * 19227) ^ (-1404203065);
                        i6 = 1841191771;
                    }
                default:
                    C1504.m5179();
                    throw new RuntimeException();
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C3537.m10743(this, this.f25660);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x012b, code lost:
    
        if (l.C0382.f1805 != false) goto L47;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:171:0x05ac. Please report as an issue. */
    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1006() {
        /*
            Method dump skipped, instructions count: 2646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8359.mo1006():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC3346 abstractActivityC3346 = null;
        int i = -1991169445;
        int i2 = RunnableC0588.f2309;
        int i3 = RunnableC1937.f6483;
        int m6981 = C2105.m6981("ܳܺ") ^ i2;
        int i4 = ((m6981 ^ i3) * (-3081)) ^ 1498344230;
        int i5 = 698463640;
        while (true) {
            i = ((((i ^ i3) * (-21921)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1866966203:
                case 1700238594:
                    if (C0237.f1507 != 0) {
                        m6981 = (C0630.m2566("ܳܶ") ^ i2) * 37;
                        i4 = ((m6981 ^ i3) * 20759) ^ 692558041;
                        i5 = 1993843062;
                    } else {
                        m6981 = (C2105.m6981("ۗ۬") + i3) * 69;
                        i4 = ((m6981 ^ i2) * 11459) ^ 199394112;
                        i5 = -250575001;
                    }
                case -1757754815:
                case -1235900110:
                    if (C3537.f11231 >= 0) {
                        m6981 = (C0630.m2566("ᩳ֫") + i2) * (-123);
                        i4 = ((m6981 ^ i3) * 10689) ^ 1867548204;
                        i5 = -311886995;
                    } else {
                        m6981 = C2105.m6981("᩸ۚ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-30175)) ^ (-1490227576);
                        i5 = -692542627;
                    }
                case -1586772320:
                case -1548309188:
                    if (C2167.f7158 >= 0) {
                        m6981 = (C0630.m2566("ᩳ֫") + i2) * (-123);
                        i4 = ((m6981 ^ i3) * 10689) ^ 1867548204;
                        i5 = -311886995;
                    } else {
                        m6981 = C2105.m6981("᩺᩺") ^ i3;
                        i4 = ((m6981 ^ i2) * 16737) ^ 1948202452;
                        i5 = -2082566535;
                    }
                case -1345470103:
                case 1224262600:
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = (C0630.m2566("᩷ۚ") + i3) * 9;
                        i4 = ((m6981 ^ i2) * (-12623)) ^ (-1547614383);
                        i5 = 329695217;
                    } else {
                        m6981 = (C0630.m2566("֫۠") + i3) * 95;
                        i4 = ((m6981 ^ i2) * 16385) ^ 1393729193;
                        i5 = 1238837480;
                    }
                case -1336234928:
                case 1692020088:
                    if (C0483.f2088 >= 0) {
                        m6981 = (C0630.m2566("ᩳ֫") + i2) * (-123);
                        i4 = ((m6981 ^ i3) * 10689) ^ 1867548204;
                        i5 = -311886995;
                    } else {
                        m6981 = C0630.m2566("ۛ֫") ^ i2;
                        i4 = ((m6981 ^ i3) * (-15129)) ^ (-1796026382);
                        i5 = -788273577;
                    }
                case -613619921:
                case 851005988:
                    C7106.m19120();
                    C0714.m2805();
                    break;
                case -428692797:
                case 441313355:
                    if (C1504.f5354) {
                        m6981 = (C0630.m2566("᩹۬") ^ i3) * (-81);
                        i4 = ((m6981 ^ i2) * (-6215)) ^ 974802258;
                        i5 = -2114705186;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۨᩳ")) * (-17);
                        i4 = ((m6981 ^ i2) * 12131) ^ (-331341926);
                        i5 = 1994993043;
                    }
                case -324154898:
                case 1778694409:
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = (C0630.m2566("ܳܶ") ^ i2) * 37;
                        i4 = ((m6981 ^ i3) * 20759) ^ 692558041;
                        i5 = 1993843062;
                    } else {
                        m6981 = (C2105.m6981("ܽ᩷") ^ i2) * (-105);
                        i4 = ((m6981 ^ i3) * 28401) ^ 1264774878;
                        i5 = -1117956607;
                    }
                case -281575026:
                case 396438059:
                    C1916.m6308();
                    m6981 = (C0630.m2566("᩷ۚ") + i3) * 9;
                    i4 = ((m6981 ^ i2) * (-12623)) ^ (-1547614383);
                    i5 = 329695217;
                case -207656923:
                case 409854314:
                    if (C2105.f7037 == 0) {
                        m6981 = (C0630.m2566("ܳܶ") ^ i2) * 37;
                        i4 = ((m6981 ^ i3) * 20759) ^ 692558041;
                        i5 = 1993843062;
                    } else {
                        m6981 = (C0630.m2566("᩹۬") ^ i3) * (-81);
                        i4 = ((m6981 ^ i2) * (-6215)) ^ 974802258;
                        i5 = -2114705186;
                    }
                case 306060819:
                case 1877439842:
                    if (C1047.f3863 >= 0) {
                        m6981 = (C0630.m2566("᩹۬") ^ i3) * (-81);
                        i4 = ((m6981 ^ i2) * (-6215)) ^ 974802258;
                        i5 = -2114705186;
                    } else {
                        m6981 = (C2105.m6981("ܿܽ") ^ i2) * 39;
                        i4 = ((m6981 ^ i3) * 14859) ^ (-112683444);
                        i5 = -495291530;
                    }
                case 673447506:
                case 2077564516:
                    ServiceConnectionC3453.m10561(abstractActivityC3346, exc, null);
                    break;
                case 933042954:
                case 1184027497:
                    C0483.m2121();
                    if (C4263.m12819() >= 0) {
                        m6981 = (C0630.m2566("᩷ۚ") + i3) * 9;
                        i4 = ((m6981 ^ i2) * (-12623)) ^ (-1547614383);
                        i5 = 329695217;
                    } else {
                        m6981 = (C0630.m2566("ᩳ֫") + i2) * (-123);
                        i4 = ((m6981 ^ i3) * 10689) ^ 1867548204;
                        i5 = -311886995;
                    }
                case 1156888291:
                case 1445169577:
                    if (C3432.f10845 < 0) {
                        m6981 = (C0630.m2566("᩷ۚ") + i3) * 9;
                        i4 = ((m6981 ^ i2) * (-12623)) ^ (-1547614383);
                        i5 = 329695217;
                    } else {
                        m6981 = (C0630.m2566("ܳܶ") ^ i2) * 37;
                        i4 = ((m6981 ^ i3) * 20759) ^ 692558041;
                        i5 = 1993843062;
                    }
                case 1196967701:
                case 1826010970:
                    if (C1916.f6442) {
                        m6981 = C2105.m6981("ᩳۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * 16481) ^ 619084345;
                        i5 = -2085278416;
                    } else {
                        m6981 = (C0630.m2566("᩷ۚ") + i3) * 9;
                        i4 = ((m6981 ^ i2) * (-12623)) ^ (-1547614383);
                        i5 = 329695217;
                    }
                default:
                    abstractActivityC3346 = this.f25660;
                    if (C1773.f6144 <= 0) {
                        m6981 = C2105.m6981("ۙۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-3099)) ^ 308487217;
                        i5 = -2120825370;
                    } else {
                        m6981 = (C2105.m6981("֡ۤ") ^ i2) * (-41);
                        i4 = ((m6981 ^ i3) * (-15079)) ^ 972729464;
                        i5 = 756292400;
                    }
            }
            return;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C0237.m1487(this);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        int m6981;
        int i;
        int i2;
        long j;
        String str;
        int m69812;
        int i3;
        int i4;
        long j2;
        int i5 = RunnableC0588.f2309;
        int i6 = C3746.f11829;
        int m69813 = C2105.m6981("ۡ᩸") ^ i6;
        int i7 = ((m69813 ^ i5) * (-27709)) ^ (-1428554608);
        Map map = null;
        short[] sArr = null;
        int i8 = m69813 ^ 785564567;
        short s = 0;
        int i9 = 0;
        short s2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = -324756969;
        int i13 = 0;
        String str2 = null;
        String str3 = null;
        JSONObject jSONObject = null;
        C18237 c18237 = null;
        long j3 = 0;
        String str4 = null;
        while (true) {
            i12 = i8 ^ (i7 & (((i12 ^ i5) * (-30985)) >> 31));
            switch (i12) {
                case -2078504178:
                case -486073216:
                    C2126.m7040();
                    if (C0237.f1507 == 0) {
                        str = str4;
                        m69812 = (i5 - C0630.m2566("ۤ᩸")) * 83;
                        i3 = ((m69812 ^ i6) * 25053) ^ 1303450701;
                        i4 = 1553316970;
                        i8 = m69812 ^ i4;
                        i7 = i3;
                        str4 = str;
                    } else {
                        m6981 = C2105.m6981("ܺۗ") ^ i6;
                        i = ((m6981 ^ i5) * 20399) ^ (-1372980532);
                        i2 = 260099255;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                case -1815875583:
                case -1058457435:
                    C2126.m7040();
                    str = str4;
                    m69812 = C0630.m2566("ܶᩳ") ^ i5;
                    i3 = ((m69812 ^ i6) * 27449) ^ (-2035626848);
                    i4 = 1668784938;
                    i8 = m69812 ^ i4;
                    i7 = i3;
                    str4 = str;
                case -1753706607:
                case -164204059:
                    str = str4;
                    i10 = 46970;
                    m69812 = (C2105.m6981("᩶᩹") ^ i6) * (-23);
                    i3 = ((m69812 ^ i5) * (-28087)) ^ 472912087;
                    i4 = 235317098;
                    i8 = m69812 ^ i4;
                    i7 = i3;
                    str4 = str;
                case -1562447858:
                case -605788688:
                    str = str4;
                    i11 = s * 2;
                    if (!C0630.m2564()) {
                        m69812 = C2105.m6981("۬ᩴ") ^ i6;
                        i3 = ((m69812 ^ i5) * (-17057)) ^ (-1279170112);
                        i4 = 1024769776;
                        i8 = m69812 ^ i4;
                        i7 = i3;
                        str4 = str;
                    }
                    m69812 = (i5 - C0630.m2566("ۤ᩸")) * 83;
                    i3 = ((m69812 ^ i6) * 25053) ^ 1303450701;
                    i4 = 1553316970;
                    i8 = m69812 ^ i4;
                    i7 = i3;
                    str4 = str;
                case -1326206165:
                case -1140368398:
                    C21923.m49329();
                    if (AbstractC2021.f6743 > 0) {
                        str = str4;
                        m69812 = C0630.m2566("ܶᩳ") ^ i5;
                        i3 = ((m69812 ^ i6) * 27449) ^ (-2035626848);
                        i4 = 1668784938;
                        i8 = m69812 ^ i4;
                        i7 = i3;
                        str4 = str;
                    } else {
                        m6981 = (C2105.m6981("᩵ۛ") ^ i6) * (-47);
                        i = ((m6981 ^ i5) * (-31609)) ^ (-717842880);
                        i2 = -586317322;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                case -1239577804:
                case -871308521:
                    str3 = RunnableC1937.m6385(f25656, 63, 7, i10);
                    if (ViewOnClickListenerC1958.f6529 > 0) {
                        m6981 = (C2105.m6981("֡ۧ") ^ i6) * 5;
                        i = ((m6981 ^ i5) * (-17957)) ^ (-2074828);
                        i2 = 1430001809;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                    m6981 = C2105.m6981("ܺۗ") ^ i6;
                    i = ((m6981 ^ i5) * 20399) ^ (-1372980532);
                    i2 = 260099255;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case -933445856:
                case 1740587873:
                    C1773.m5907(c18237, this.f25659);
                    jSONObject = C23175.m51353(c18237);
                    if (C11233.m27802((Object) str4, (Object) RunnableC3474.m10627())) {
                        m6981 = C2105.m6981("ۘۚ") ^ i5;
                        i = ((m6981 ^ i6) * 18937) ^ 1148373164;
                        i2 = 2065325334;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                    m6981 = C0630.m2566("᩷ۤ") ^ i5;
                    i = ((m6981 ^ i6) * 6837) ^ (-484820881);
                    i2 = -1772071371;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case -865085956:
                case -196869526:
                    String m10627 = RunnableC3474.m10627();
                    str4 = this.f25662;
                    if (C11233.m27802((Object) str4, (Object) m10627)) {
                        m6981 = C2105.m6981("֡ܳ") ^ i6;
                        i = ((m6981 ^ i5) * (-6451)) ^ (-317927936);
                        i2 = 2127133848;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                    m6981 = C0630.m2566("᩷ۤ") ^ i5;
                    i = ((m6981 ^ i6) * 6837) ^ (-484820881);
                    i2 = -1772071371;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case -807425557:
                case -733471834:
                    AbstractActivityC3346 abstractActivityC3346 = this.f25660;
                    if (C3537.m10746() <= 0) {
                        str = str4;
                        m69812 = C2105.m6981("֨۫") ^ i6;
                        i3 = ((m69812 ^ i5) * (-7753)) ^ 607465953;
                        i4 = -490375768;
                        i8 = m69812 ^ i4;
                        i7 = i3;
                        str4 = str;
                    } else {
                        map = new PayTask(abstractActivityC3346).payV2(str2, true);
                        sArr = f25656;
                        i9 = 70;
                        if (!C2272.m7503()) {
                            m6981 = C2105.m6981("ᩴᩴ") ^ i6;
                            i = ((m6981 ^ i5) * 7515) ^ 1010262433;
                            i2 = -2017226453;
                            i8 = m6981 ^ i2;
                            i7 = i;
                        }
                        m6981 = C2105.m6981("ܺۗ") ^ i6;
                        i = ((m6981 ^ i5) * 20399) ^ (-1372980532);
                        i2 = 260099255;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                case -715067004:
                case 786870723:
                    str = str4;
                    int i14 = s + s2;
                    if ((i14 * i14) - i13 < 0) {
                        m69812 = (i5 - C0630.m2566("֫᩻")) * 11;
                        i3 = ((m69812 ^ i6) * (-9587)) ^ (-1774653613);
                        i4 = -83441414;
                    } else {
                        m69812 = C2105.m6981("ۡ᩵") ^ i5;
                        i3 = ((m69812 ^ i6) * (-2551)) ^ (-1040856422);
                        i4 = 1875730942;
                    }
                    i8 = m69812 ^ i4;
                    i7 = i3;
                    str4 = str;
                case -518416562:
                case 1467046433:
                    this.f25661 = (String) map.get(C2105.m6988(sArr, i9, 12, i10));
                    m6981 = C0630.m2566("᩷ۤ") ^ i5;
                    i = ((m6981 ^ i6) * 6837) ^ (-484820881);
                    i2 = -1772071371;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case -488539717:
                case 1606970143:
                    j = C22470.f72774;
                    if (j3 == j) {
                        m6981 = C2105.m6981("ܳ֫") ^ i5;
                        i = ((m6981 ^ i6) * (-26673)) ^ 1115150637;
                        i2 = 803639363;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                    m6981 = C0630.m2566("᩷ۤ") ^ i5;
                    i = ((m6981 ^ i6) * 6837) ^ (-484820881);
                    i2 = -1772071371;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case -91445896:
                case 1504471655:
                    C0422.m1963();
                    break;
                case 261657303:
                case 645012555:
                    break;
                case 403734991:
                case 754155351:
                    j2 = C22470.f72774;
                    str = str4;
                    long j4 = this.f25663;
                    if (j4 != j2) {
                        j3 = j4;
                        str4 = str;
                        m6981 = C0630.m2566("᩷ۤ") ^ i5;
                        i = ((m6981 ^ i6) * 6837) ^ (-484820881);
                        i2 = -1772071371;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    } else {
                        int m69814 = (C2105.m6981("ܳ۠") ^ i6) * (-73);
                        i8 = m69814 ^ (-2021816942);
                        i7 = ((m69814 ^ i5) * 20289) ^ (-219683911);
                        j3 = j4;
                        str4 = str;
                    }
                case 911655754:
                case 1467869982:
                    str2 = C22628.m50614(jSONObject, str3);
                    if (C3432.f10845 < 0) {
                        RunnableC1303 runnableC1303 = new RunnableC1303(jSONObject, str4, j3);
                        this.f25658 = runnableC1303;
                        C22470.f72773 = runnableC1303;
                        if (C2958.f9394 < 0) {
                            m6981 = (C0630.m2566("᩺ܶ") ^ i5) * (-69);
                            i = ((m6981 ^ i6) * 9045) ^ 1044836825;
                            i2 = -1339245494;
                            i8 = m6981 ^ i2;
                            i7 = i;
                        }
                    }
                    str = str4;
                    m69812 = (i5 - C0630.m2566("ۤ᩸")) * 83;
                    i3 = ((m69812 ^ i6) * 25053) ^ 1303450701;
                    i4 = 1553316970;
                    i8 = m69812 ^ i4;
                    i7 = i3;
                    str4 = str;
                case 953403258:
                case 1767465615:
                    if (C2105.f7037 == 0) {
                        m6981 = (C2105.m6981("᩵ۛ") ^ i6) * (-47);
                        i = ((m6981 ^ i5) * (-31609)) ^ (-717842880);
                        i2 = -586317322;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    } else {
                        str = str4;
                        m69812 = (i5 - C0630.m2566("ۤ᩸")) * 83;
                        i3 = ((m69812 ^ i6) * 25053) ^ 1303450701;
                        i4 = 1553316970;
                        i8 = m69812 ^ i4;
                        i7 = i3;
                        str4 = str;
                    }
                case 977865523:
                case 1348439343:
                    c18237.m42483(0);
                    if (C0964.f3626 != 0) {
                        str = str4;
                        m69812 = C0630.m2566("ܶᩳ") ^ i5;
                        i3 = ((m69812 ^ i6) * 27449) ^ (-2035626848);
                        i4 = 1668784938;
                        i8 = m69812 ^ i4;
                        i7 = i3;
                        str4 = str;
                    } else {
                        m6981 = (i6 - C0630.m2566("᩷᩶")) * 65;
                        i = ((m6981 ^ i5) * (-28079)) ^ 1314705080;
                        i2 = -737622874;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                case 1208706245:
                case 1435801570:
                    str = str4;
                    s = f25656[62];
                    if (RunnableC0588.f2309 < 0) {
                        m69812 = C2105.m6981("᩶᩻") ^ i5;
                        i3 = ((m69812 ^ i6) * (-28917)) ^ (-1904799781);
                        i4 = 1109185690;
                        i8 = m69812 ^ i4;
                        i7 = i3;
                        str4 = str;
                    }
                    m69812 = C0630.m2566("ܶᩳ") ^ i5;
                    i3 = ((m69812 ^ i6) * 27449) ^ (-2035626848);
                    i4 = 1668784938;
                    i8 = m69812 ^ i4;
                    i7 = i3;
                    str4 = str;
                case 1540163357:
                case 1566089891:
                    str = str4;
                    i13 = i11 + 1;
                    s2 = 1;
                    if (RunnableC3474.m10630()) {
                        m69812 = C0630.m2566("ܶܿ") ^ i6;
                        i3 = ((m69812 ^ i5) * (-15867)) ^ 1349230024;
                        i4 = -1279696984;
                        i8 = m69812 ^ i4;
                        i7 = i3;
                        str4 = str;
                    }
                    m69812 = C2105.m6981("֨۫") ^ i6;
                    i3 = ((m69812 ^ i5) * (-7753)) ^ 607465953;
                    i4 = -490375768;
                    i8 = m69812 ^ i4;
                    i7 = i3;
                    str4 = str;
                case 1724744847:
                case 1825196172:
                    str = str4;
                    i10 = 25241;
                    m69812 = (C2105.m6981("᩶᩹") ^ i6) * (-23);
                    i3 = ((m69812 ^ i5) * (-28087)) ^ 472912087;
                    i4 = 235317098;
                    i8 = m69812 ^ i4;
                    i7 = i3;
                    str4 = str;
                default:
                    c18237 = RunnableC1108.m3787(4370);
                    c18237.m42494(this.f25657);
                    if (C3537.f11231 >= 0) {
                        str = str4;
                        m69812 = C2105.m6981("֨۫") ^ i6;
                        i3 = ((m69812 ^ i5) * (-7753)) ^ 607465953;
                        i4 = -490375768;
                        i8 = m69812 ^ i4;
                        i7 = i3;
                        str4 = str;
                    } else {
                        m6981 = C2105.m6981("ᩳ᩶") ^ i5;
                        i = ((m6981 ^ i6) * (-6249)) ^ 1101164595;
                        i2 = -1548633345;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
            }
            return;
        }
    }
}
